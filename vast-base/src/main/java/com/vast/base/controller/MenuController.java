package com.vast.base.controller;

import com.vast.base.core.result.BaseResult;
import com.vast.base.core.result.MyResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: vastinbk
 * @Package: com.vast.base.controller
 * @ClassName: MenuController
 * @Author: Mr.Z
 * @Description: 菜单管理
 * @Date: 2021/1/14 21:15
 * <p>
 * =================================================
 * @Version: 1.0
 * =================================================
 */

@Controller
@RequestMapping("/vast/menu")
public class MenuController {


    @RequestMapping("/menuPage")
    public String menuPage() {

        return "/systems/menu";
    }

    @RequestMapping("listMenu")
    public BaseResult listMenu() {


        return new BaseResult(MyResponse.SC_NO_CONTENT);
    }
}
