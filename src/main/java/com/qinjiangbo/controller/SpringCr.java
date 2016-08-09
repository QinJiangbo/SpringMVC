package com.qinjiangbo.controller;

import com.qinjiangbo.gen.model.SysUser;
import com.qinjiangbo.service.SysUserService;
import com.qinjiangbo.util.DataUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Richard on 5/24/16.
 */
@RestController
@RequestMapping("/web")
public class SpringCr {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/hello")
    public ModelAndView helloSpring(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("/spring");
        return modelAndView;
    }

    @RequestMapping("/index")
    public Map indexSpring(HttpServletRequest request) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("string", 0);
        map.put("struts", 1);
        return map;
    }

    @RequestMapping(value="/show-single", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public SysUser showUser(HttpServletRequest request,
                                 @RequestBody HashMap<String, Object> params) {
        Long userId = DataUtils.toLong(params.get("userId"));
        SysUser sysUser = sysUserService.findSysUser(userId);
        return sysUser;
    }

    @RequestMapping(value = "/show-all", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<SysUser> showUsers(HttpServletRequest request,
                             @RequestBody HashMap<String, Object> params) {
        List<Long> userIds = (ArrayList<Long>) params.get("userIds");
        List<SysUser> sysUsers = sysUserService.findSysUsers(userIds);
        return sysUsers;
    }

}
