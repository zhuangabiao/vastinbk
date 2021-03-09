package com.vast.base.dao;

import com.vast.base.core.dao.BaseDBMapper;
import com.vast.base.entity.BaseMenuRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: vastinbk
 * @Package: com.vast.base.mappers
 * @ClassName: BaseMenuRoleMapper
 * @Author: Mr.Z
 * @Description:
 * @Date: 2021/1/14 22:13
 * <p>
 * =================================================
 * @Version: 1.0
 * =================================================
 */
@Mapper
@Component
public interface BaseMenuRoleMapper extends BaseDBMapper<BaseMenuRole> {
}
