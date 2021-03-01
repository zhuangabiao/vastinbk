package com.vast.base.controller;

import com.vast.base.core.controller.BaseController;
import com.vast.base.core.result.BaseResult;
import com.vast.base.core.result.MyResponse;
import com.vast.base.dto.dto.BlogDirectoryDTO;
import com.vast.base.service.IBlogDirectoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: vastinbk
 * @Package: com.vast.base.controller
 * @ClassName: MarkNodeController
 * @Author: Mr.Z
 * @Description: 笔记文档
 * @Date: 2021/2/21 0:03
 * <p>
 * =================================================
 * @Version: 1.0
 * =================================================
 */
@Controller
@RequestMapping("/vast/mark/menu/")
public class BlogDirectoryController extends BaseController {

    @Autowired
    private IBlogDirectoryService blogDirectoryService;

    @CrossOrigin(origins = "*",maxAge = 3600)
    @RequestMapping("list")
    @ResponseBody
    public BaseResult list() {
        /*List<BlogDirectoryDTO> list = new ArrayList();
        List<BlogDirectoryDTO> list1 = new ArrayList();
        List<BlogDirectoryDTO> list2 = new ArrayList();

        list.add(new BlogDirectoryDTO("10001","首页",null,"",null,null));
        list.add(new BlogDirectoryDTO("10002","按钮",null,null,"",list2));
        list.add(new BlogDirectoryDTO("10003","测试1",null,null,"",list1));
        list1.add(new BlogDirectoryDTO("10004","测试1-1",null,null,"",null));
        list1.add(new BlogDirectoryDTO("10005","测试1-2",null,null,"",list2));
        list2.add(new BlogDirectoryDTO("10006","测试2-2",null,null,"",null));*/

        List<BlogDirectoryDTO> list = blogDirectoryService.findDirectory("1001","0");

        return new BaseResult(MyResponse.OK,list,null);
    }
    @CrossOrigin(origins = "*",maxAge = 3600)
    @RequestMapping("save")
    @ResponseBody
    public BaseResult save(String saideCode,String msg) {

        logger.info("saideCode:" + saideCode + " MSG:" + msg);


        return new BaseResult();
    }
}
