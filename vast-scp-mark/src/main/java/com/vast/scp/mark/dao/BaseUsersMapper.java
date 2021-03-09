package com.vast.scp.mark.dao;


import com.vast.scp.mark.core.dao.BaseDBDao;
import com.vast.scp.mark.entity.BaseUsers;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * ====================================================
 *
 * @ProjectName: vast-inbk
 * @Package: com.vast.base.mapper
 * @ClassName: BaseUsersMapper
 * @Author: Administrator
 * @Description:
 * @Date: 2021/1/4 16:23
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
@Mapper
@Component
public interface BaseUsersMapper extends BaseDBDao<BaseUsers> {
}
