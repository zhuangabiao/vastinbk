package com.vast.base.controller;

import com.vast.base.core.result.BaseResult;
import com.vast.base.core.result.MyResponse;
import com.vast.base.entity.BaseUsers;
import com.vast.base.service.IBaseUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
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
@Api(value = "用户管理", tags = "user")
public class UserController {

    @Autowired
    private IBaseUserService baseUserService;

    @RequestMapping("/addIndex")
    public String addPage() {

        return "systems/addUser";
    }

    @ApiOperation(value = "添加用户",notes = "添加用户数据")
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    @ResponseBody
    public BaseResult addUser(@RequestBody BaseUsers baseUsers) {
        if(null != baseUsers) {
            baseUsers.setStatus(1);
            return baseUserService.save(baseUsers);
        }
        return new BaseResult(MyResponse.SC_NO_CONTENT,null,"传入参数为空");
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
