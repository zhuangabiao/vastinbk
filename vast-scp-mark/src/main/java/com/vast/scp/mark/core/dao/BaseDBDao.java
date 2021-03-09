package com.vast.scp.mark.core.dao;

import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * ====================================================
 *
 * @ProjectName: vastinbk
 * @Package: com.vast.scp.mark.core.dao
 * @ClassName: BaseDBDao
 * @Author: Administrator
 * @Description:
 * @Date: 2021/3/9 15:51
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
@Component
public interface BaseDBDao<T> extends Mapper<T>, MySqlMapper<T> {
}
