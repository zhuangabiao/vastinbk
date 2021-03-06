package com.vast.base.dao;

import com.vast.base.core.dao.BaseDBMapper;
import com.vast.base.entity.BlogDirectory;
import org.apache.ibatis.annotations.Mapper;
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
public interface BlogDirectoryMapper extends BaseDBMapper<BlogDirectory> {
}
