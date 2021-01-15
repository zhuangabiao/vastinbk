package com.vast.base.controller;

import com.vast.base.core.result.BaseResult;
import com.vast.base.core.result.MyResponse;
import com.vast.base.entity.BaseRole;
import com.vast.base.service.IBaseRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ====================================================
 *
 * @ProjectName: vastinbk
 * @Package: com.vast.base.controller
 * @ClassName: RoleController
 * @Author: Administrator
 * @Description:
 * @Date: 2021/1/15 14:12
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */

@Controller
@RequestMapping("/vast/role")
public class RoleController {

    @Autowired
    private IBaseRoleService baseRoleService;

    @RequestMapping("/rolePage")
    public String roleIndex() {
        return "/systems/roleList";
    }

    @RequestMapping("/allList")
    @ResponseBody
    public BaseResult allList() {
        List<BaseRole> list = baseRoleService.findAll();
        return new BaseResult(MyResponse.OK,list);
    }
}
