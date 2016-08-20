package com.qinjiangbo.tools;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Richard on 6/20/16.
 */
public class CreateGenConfigXML {

    /**
     * 获得数据库连接
     * @return
     */
    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection =
                    DriverManager.getConnection("jdbc:postgresql://101.200.91.162:5432/satecdb_new",
                            "pguser", "cecesatisatkpg");
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<String> getTableNames() throws SQLException {
        List<String> names = new ArrayList<String>();
        Connection connection = getConnection();
        DatabaseMetaData databaseMetaData = connection.getMetaData();
        String[] types = {"TABLE"};
        ResultSet resultSet = databaseMetaData.getTables(null, null, null, types);
        while (resultSet.next()) {
            String name = (String) resultSet.getObject("TABLE_NAME");
            if(name.contains("（") || name.contains("）")) {
                continue;
            }
            names.add(name);
        }
        connection.close();
        return names;
    }

    private static Document createDom() throws SQLException {
        Document doc = DocumentHelper.createDocument();
        //create root node
        Element root = doc.addElement("generatorConfiguration");

        //create context node
        Element context = root.addElement("context");
        context.addAttribute("id", "MBG");
        context.addAttribute("targetRuntime", "Mybatis3");
        context.addAttribute("defaultModelType", "conditional");

        //create plugin node
        Element plugin = context.addElement("plugin");
        plugin.addAttribute("type", "org.mybatis.generator.plugins.SerializablePlugin");

        //create commentGenerator node
        Element commentGenerator = context.addElement("commentGenerator");
        Element property = commentGenerator.addElement("property");
        property.addAttribute("name", "suppressAllComments");
        property.addAttribute("value", "false");

        //create jdbcConnection node
        Element jdbcConnection = context.addElement("jdbcConnection");
        jdbcConnection.addAttribute("driverClass", "org.postgresql.Driver");
        jdbcConnection.addAttribute("connectionURL", "jdbc:postgresql://101.200.91.162:5432/satecdb_new");
        jdbcConnection.addAttribute("userId", "pguser");
        jdbcConnection.addAttribute("password", "cecesatisatkpg");

        //create javaTypeResolver node
        Element javaTypeResolver = context.addElement("javaTypeResolver");
        Element property2 = javaTypeResolver.addElement("property");
        property2.addAttribute("name", "forceBigDecimals");
        property2.addAttribute("value", "false");

        //create javaModelGenerator node
        Element javaModelGenerator = context.addElement("javaModelGenerator");
        javaModelGenerator.addAttribute("targetPackage","com.qinjiangbo.gen.model");
        javaModelGenerator.addAttribute("targetProject", "src/tools/java");
        Element property3 = javaModelGenerator.addElement("property");
        property3.addAttribute("name","enableSubPackages");
        property3.addAttribute("value","true");

        //create sqlMapGenerator node
        Element sqlMapGenerator = context.addElement("sqlMapGenerator");
        sqlMapGenerator.addAttribute("targetPackage","com.qinjiangbo.gen.dao");
        sqlMapGenerator.addAttribute("targetProject", "src/tools/java");
        Element property4 = sqlMapGenerator.addElement("property");
        property4.addAttribute("name","enableSubPackages");
        property4.addAttribute("value","true");

        //create javaClientGenerator node
        Element javaClientGenerator = context.addElement("javaClientGenerator");
        javaClientGenerator.addAttribute("type", "XMLMAPPER");
        javaClientGenerator.addAttribute("targetPackage","com.qinjiangbo.gen.dao");
        javaClientGenerator.addAttribute("targetProject", "src/tools/java");
        Element property5 = javaClientGenerator.addElement("property");
        property5.addAttribute("name","enableSubPackages");
        property5.addAttribute("value","true");

        //create table nodes
        List<String> names = getTableNames();
        for(String name : names) {
            String[] words = name.split("_");
            String entityName = "";
            for(String word : words) {
                word = word.substring(0, 1).toUpperCase() + word.substring(1);
                if(StringUtils.isEmpty(entityName)) {
                    entityName = word;
                }
                else {
                    entityName = entityName + word;
                }
            }
            Element tableNode = context.addElement("table");
            tableNode.addAttribute("tableName", name);
            tableNode.addAttribute("domainObjectName",entityName);
            tableNode.addAttribute("enableCountByExample", "true");
            tableNode.addAttribute("enableUpdateByExample", "true");
            tableNode.addAttribute("enableDeleteByExample", "true");
            tableNode.addAttribute("enableSelectByExample", "true");
            tableNode.addAttribute("selectByExampleQueryId", "true");
            tableNode.addAttribute("selectByExampleQueryId", "true");
        }

        return doc;
    }

    public static void writeXML() throws Exception {
        XMLWriter xmlWriter = null;
        String userDir = System.getProperty("user.dir");
        String fileName = userDir + "/src/tools/resources/generatorConfiguration.xml";
        OutputFormat format = OutputFormat.createPrettyPrint();
        FileOutputStream fos = new FileOutputStream(new File(fileName));
        format.setEncoding("utf-8");
        xmlWriter = new XMLWriter(fos, format);
        xmlWriter.write(createDom());
        xmlWriter.close();
    }

    public static void main(String[] args) throws Exception {
        writeXML();
        System.out.println("Completed!");
    }
}
