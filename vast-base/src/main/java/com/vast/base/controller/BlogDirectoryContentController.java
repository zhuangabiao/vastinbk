package com.vast.base.controller;

import com.vast.base.core.controller.BaseController;
import com.vast.base.core.result.BaseResult;
import com.vast.base.core.result.MyResponse;
import com.vast.base.core.utils.GeneratorCodeUtils;
import com.vast.base.core.utils.MyDateUtils;
import com.vast.base.entity.BlogDirectoryContent;
import com.vast.base.enums.CodePrefixEnum;
import com.vast.base.enums.ExceptionEnum;
import com.vast.base.service.impl.BlogDirectoryContentService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * ====================================================
 *
 * @ProjectName: vastinbk
 * @Package: com.vast.base.controller
 * @ClassName: BlogDirectoryContentController
 * @Author: Administrator
 * @Description: Blog内容
 * @Date: 2021/3/2 9:53
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */

@Controller
@RequestMapping("/vast/blog/directory/content/")
public class BlogDirectoryContentController extends BaseController {

    @Autowired
    private BlogDirectoryContentService blogDirectoryContentService;

    @CrossOrigin(origins = "*",maxAge = 3600)
    @RequestMapping(name = "save",method = RequestMethod.POST)
    @ResponseBody
    public BaseResult save(String id, String saideCode, String title, String markContent, String htmlContent) {

        logger.info("saideCode:" + saideCode + " MSG:" + markContent);
        try {
            if(StringUtils.isNotBlank(saideCode)) {
                BlogDirectoryContent content = new BlogDirectoryContent();
                content.setId(StringUtils.isBlank(id) ? null : id);
                content.setDirectoryCode(saideCode);
                content.setMarkContent(StringUtils.isBlank(markContent) ? null : markContent);
                content.setHtmlContent(StringUtils.isBlank(htmlContent) ? null : htmlContent);
                content.setCreateDate(MyDateUtils.getFullDateTime());
                content.setBlogTitle(title);
                content.setCreateUser("999999");
                content.setContentCode(GeneratorCodeUtils.getCode(CodePrefixEnum.BLOG_CONTENT_CODE));

                BlogDirectoryContent blogDirectoryContent  = blogDirectoryContentService.saveOrUpdate(content);
                return new BaseResult(MyResponse.OK);
            }

        }catch (Exception e) {
            logger.error("保存Blog内容失败");
        }
        return new BaseResult(MyResponse.SC_NOT_ACCEPTABLE);
    }

    @CrossOrigin(origins = "*",maxAge = 3600)
    @RequestMapping("getByCode")
    @ResponseBody
    public BaseResult getByCode(String contentCode) {

        if(StringUtils.isNotBlank(contentCode)) {
            BlogDirectoryContent content = blogDirectoryContentService.getByCode(contentCode);
            return new BaseResult(MyResponse.OK,content);
        }
        return new BaseResult(MyResponse.SC_NOT_ACCEPTABLE);
    }
}
