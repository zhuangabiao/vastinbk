package com.vast.base.dao;

import com.vast.base.core.dao.BaseDBMapper;
import com.vast.base.entity.BaseUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: vastinbk
 * @Package: com.vast.base.mappers
 * @ClassName: BaseUserRoleMapper
 * @Author: Mr.Z
 * @Description:
 * @Date: 2021/1/14 22:12
 * <p>
 * =================================================
 * @Version: 1.0
 * =================================================
 */
@Component
@Mapper
public interface BaseUserRoleMapper extends BaseDBMapper<BaseUserRole> {
}
