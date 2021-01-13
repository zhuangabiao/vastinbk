package com.vast.base.controller;

import com.vast.base.core.result.BaseResult;
import com.vast.base.core.result.MyResponse;
import com.vast.base.entity.BaseUsers;
import com.vast.base.service.IBaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ====================================================
 * @ProjectName: vast-inbk
 * @Package: com.vast.base.controller
 * @ClassName: UserController
 * @Author: Administrator
 * @Description: UserController 用户相关的控制类
 * @Date: 2021/1/4 11:44
 * ====================================================
 * @Version: 1.0    创建
 * ====================================================
 */
@Controller
@RequestMapping("/vast/user")
public class UserController {

    @Autowired
    private IBaseUserService baseUserService;

    @RequestMapping("/addIndex")
    public String addPage() {

        return "systems/addUser";
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    @ResponseBody
    public BaseResult addUser(@RequestBody BaseUsers baseUsers) {

        System.out.println(baseUsers.getUsername());

        return new BaseResult(MyResponse.OK,baseUsers,null);
    }

    @RequestMapping("/allList")
    @ResponseBody
    public BaseResult findAll() {
        List<BaseUsers> list = baseUserService.findAll();
        return new BaseResult(MyResponse.OK,list,null);
    }

    @RequestMapping("/listPage")
    public String listPage() {
        return "systems/userList";
    }

}
