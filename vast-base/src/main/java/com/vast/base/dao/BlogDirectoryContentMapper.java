package com.vast.base.dao;

import com.vast.base.core.dao.BaseDBMapper;
import com.vast.base.entity.BlogDirectoryContent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: vastinbk
 * @Package: com.vast.base.mappers
 * @ClassName: BaseMenuMapper
 * @Author: Mr.Z
 * @Description:
 * @Date: 2021/1/14 22:10
 * <p>
 * =================================================
 * @Version: 1.0
 * =================================================
 */
@Component
@Mapper
public interface BlogDirectoryContentMapper extends BaseDBMapper<BlogDirectoryContent> {
    BlogDirectoryContent getByCode(@Param("code") String code);
}
