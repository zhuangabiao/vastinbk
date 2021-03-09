package com.vast.scp.mark.controller;

import com.vast.scp.mark.entity.BaseUsers;
import com.vast.scp.mark.service.IBaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ====================================================
 *
 * @ProjectName: vastinbk
 * @Package: com.vast.scp.mark.controller
 * @ClassName: UserController
 * @Author: Administrator
 * @Description:
 * @Date: 2021/3/9 15:37
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IBaseUserService baseUserService;

    @RequestMapping("/test")
    public String test() {

        return "success";
    }
    @RequestMapping("/list")
    public List<BaseUsers> list() {
        return baseUserService.findAll();
    }
}
