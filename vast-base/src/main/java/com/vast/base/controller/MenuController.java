package com.vast.base.controller;

import com.vast.base.core.result.BaseResult;
import com.vast.base.core.result.MyResponse;
import com.vast.base.dto.vo.BaseMenuVo;
import com.vast.base.entity.BaseMenu;
import com.vast.base.service.IBaseMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @Autowired
    private IBaseMenuService baseMenuService;

    @RequestMapping("/menuPage")
    public String menuPage() {
        return "systems/menu";
    }

    @RequestMapping("/menuTreePage")
    public String menuTreePage() {
        return "systems/menuTree";
    }

    @RequestMapping("/listMenu")
    @ResponseBody
    public BaseResult listMenu() {
        List<BaseMenuVo> list = baseMenuService.findList("0");
        if(null != list && list.size() > 0) {
            return new BaseResult(MyResponse.OK,list);
        }
        return new BaseResult(MyResponse.SC_NO_CONTENT);
    }

    @RequestMapping("/add")
    @ResponseBody
    public BaseResult add(@RequestBody BaseMenu menu) {
        if(null != menu) {
            int count = baseMenuService.insert(menu);
            if(count == 1) {
                return new BaseResult(MyResponse.OK);
            }else {
                return new BaseResult(MyResponse.SC_CREATED,null,"保存失败");
            }
        }
        return new BaseResult(MyResponse.SC_NO_CONTENT,null,"保存失败");
    }
}
