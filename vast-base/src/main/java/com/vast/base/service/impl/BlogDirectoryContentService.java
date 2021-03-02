package com.vast.base.service.impl;

import com.vast.base.core.service.impl.BaseDBServiceImpl;
import com.vast.base.core.utils.GeneratorCodeUtils;
import com.vast.base.core.utils.MyDateUtils;
import com.vast.base.entity.BlogDirectory;
import com.vast.base.entity.BlogDirectoryContent;
import com.vast.base.mappers.BlogDirectoryContentMapper;
import com.vast.base.service.IBlogDirectoryContentService;
import com.vast.base.service.IBlogDirectoryService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: vastinbk
 * @Package: com.vast.base.service.impl
 * @ClassName: BlogDirectoryContentService
 * @Author: Mr.Z
 * @Description:
 * @Date: 2021/3/1 21:14
 * <p>
 * =================================================
 * @Version: 1.0
 * =================================================
 */
@Service
public class BlogDirectoryContentService extends BaseDBServiceImpl<BlogDirectoryContent> implements IBlogDirectoryContentService {

    @Autowired
    private BlogDirectoryContentMapper blogDirectoryContentMapper;

    @Override
    public BlogDirectoryContent saveOrUpdate(BlogDirectoryContent blogDirectoryContent) {
        int count = 0;
        if(null != blogDirectoryContent && StringUtils.isNotBlank(blogDirectoryContent.getId())) {
            BlogDirectoryContent blogContent = this.getById(blogDirectoryContent.getId());
            if(null == blogContent) {
                count = this.insert(blogDirectoryContent);
            }else {
                blogContent.setDirectoryCode(StringUtils.isBlank(blogDirectoryContent.getDirectoryCode()) ? null : blogDirectoryContent.getDirectoryCode());
                blogContent.setBlogTitle(StringUtils.isBlank(blogDirectoryContent.getBlogTitle()) ? null : blogDirectoryContent.getBlogTitle());
                blogContent.setMarkContent(StringUtils.isBlank(blogDirectoryContent.getMarkContent()) ? null : blogDirectoryContent.getMarkContent());
                blogContent.setHtmlContent(StringUtils.isBlank(blogDirectoryContent.getHtmlContent()) ? null : blogDirectoryContent.getHtmlContent());
                blogContent.setUpdateDate(MyDateUtils.getFullDateTime());
                count = this.updateByIdSelective(blogContent);
            }

        }else {
            blogDirectoryContent.setId(GeneratorCodeUtils.getUUID());
            count = this.insert(blogDirectoryContent);
        }
        return blogDirectoryContent;
    }

    @Override
    public BlogDirectoryContent getByCode(String code) {
        BlogDirectoryContent content = blogDirectoryContentMapper.getByCode(code);
        return content;
    }
}
