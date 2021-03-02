package com.vast.base.controller;

import com.vast.base.core.controller.BaseController;
import com.vast.base.core.result.BaseResult;
import com.vast.base.core.result.MyResponse;
import com.vast.base.dto.dto.BlogDirectoryDTO;
import com.vast.base.entity.BlogDirectory;
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
@RequestMapping("/vast/blog/directory/")
public class BlogDirectoryController extends BaseController {

    @Autowired
    private IBlogDirectoryService blogDirectoryService;

    @CrossOrigin(origins = "*",maxAge = 3600)
    @RequestMapping("list")
    @ResponseBody
    public BaseResult list() {

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
