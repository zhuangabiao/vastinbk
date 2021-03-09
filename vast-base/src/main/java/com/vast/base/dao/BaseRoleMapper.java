package com.vast.base.dao;

import com.vast.base.core.dao.BaseDBMapper;
import com.vast.base.entity.BaseRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: vastinbk
 * @Package: com.vast.base.mappers
 * @ClassName: BaseRoleMapper
 * @Author: Mr.Z
 * @Description:
 * @Date: 2021/1/14 22:11
 * <p>
 * =================================================
 * @Version: 1.0
 * =================================================
 */
@Mapper
@Component
public interface BaseRoleMapper extends BaseDBMapper<BaseRole> {
}
