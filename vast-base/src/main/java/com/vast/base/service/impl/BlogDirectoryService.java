package com.vast.base.service.impl;

import com.vast.base.core.service.impl.BaseDBServiceImpl;
import com.vast.base.dto.dto.BlogDirectoryDTO;
import com.vast.base.entity.BlogDirectory;
import com.vast.base.entity.BlogDirectoryContent;
import com.vast.base.dao.BlogDirectoryContentMapper;
import com.vast.base.dao.BlogDirectoryMapper;
import com.vast.base.service.IBlogDirectoryService;
import com.vast.base.units.ConfigFinal;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: vastinbk
 * @Package: com.vast.base.service.impl
 * @ClassName: BlogDirectoryService
 * @Author: Mr.Z
 * @Description:
 * @Date: 2021/3/1 21:14
 * <p>
 * =================================================
 * @Version: 1.0
 * =================================================
 */
@Service
public class BlogDirectoryService extends BaseDBServiceImpl<BlogDirectory> implements IBlogDirectoryService {

    @Autowired
    private BlogDirectoryMapper blogDirectoryMapper;

    @Autowired
    private BlogDirectoryContentMapper blogDirectoryContentMapper;

    @Override
    public List<BlogDirectoryDTO> findDirectory(String userCode,String parentCode) {
        List<BlogDirectoryDTO> dtoList = new ArrayList<>();
        if(StringUtils.isNotBlank(parentCode)) {
            BlogDirectory blogDirectory = new BlogDirectory();
            blogDirectory.setUserCode(userCode);
            blogDirectory.setParentCode(parentCode);
            List<BlogDirectory> list = blogDirectoryMapper.select(blogDirectory);

            if(null != list && list.size() > 0) {
                for(BlogDirectory directory : list) {
                    BlogDirectoryDTO dto = new BlogDirectoryDTO();
                    dto.setDirectoryCode(StringUtils.isBlank(directory.getDirectoryCode()) ? null : directory.getDirectoryCode());
                    dto.setDirectoryName(StringUtils.isBlank(directory.getDirectoryName()) ? null : directory.getDirectoryName());
//                    dto.setIcon(StringUtils.isBlank(directory.get()) ? null : directory.getDirectoryCode());
                    dto.setType(ConfigFinal.BLOG_DIRECTORY_TYPE);
                    dto.setDirectoryCode(StringUtils.isBlank(directory.getDirectoryCode()) ? null : directory.getDirectoryCode());
                    dto.setUrl("#");

                    List<BlogDirectoryDTO> childDtoList = findDirectory(userCode,directory.getDirectoryCode());
                    if(childDtoList == null) {
                        childDtoList = new ArrayList<>();
                    }
                    List<BlogDirectoryDTO> childContentDtoList = findDirectoryContent(directory.getDirectoryCode());
                    childDtoList.addAll(childContentDtoList);
                    dto.setChildren(childDtoList);
                    dtoList.add(dto);
                }
            }
        }
        return dtoList;
    }

    private List<BlogDirectoryDTO> findDirectoryContent(String directoryCode) {
        List<BlogDirectoryDTO> dtoList = new ArrayList<>();

        if(StringUtils.isNotBlank(directoryCode)) {
            BlogDirectoryContent directoryContent = new BlogDirectoryContent();
            directoryContent.setDirectoryCode(directoryCode);
            List<BlogDirectoryContent>  list = blogDirectoryContentMapper.select(directoryContent);
            if(null != list && list.size() > 0) {
                for (BlogDirectoryContent content : list) {
                    BlogDirectoryDTO dto = new BlogDirectoryDTO();
                    dto.setDirectoryCode(StringUtils.isBlank(content.getContentCode()) ? null : content.getContentCode());
                    dto.setDirectoryName(StringUtils.isBlank(content.getBlogTitle()) ? null : content.getBlogTitle());
                    dto.setType(ConfigFinal.BLOG_DIRECTORY_TYPE_CONTENT);
                    dto.setUrl("#");
                    dtoList.add(dto);
                }
            }
        }
        return dtoList;
    }

}
