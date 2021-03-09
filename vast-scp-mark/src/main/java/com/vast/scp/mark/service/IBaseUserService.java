package com.vast.scp.mark.service;


import com.vast.scp.mark.core.service.IBaseDBService;
import com.vast.scp.mark.entity.BaseUsers;
import com.vast.scp.mark.units.result.BaseResult;

/**
 * ====================================================
 *
 * @ProjectName: vast-inbk
 * @Package: com.vast.base.service
 * @ClassName: IBaseUserService
 * @Author: Administrator
 * @Description: User逻辑处接口
 * @Date: 2021/1/4 16:14
 *
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
public interface IBaseUserService extends IBaseDBService<BaseUsers> {
    BaseResult login(String username, String pwd);

    BaseResult save(BaseUsers baseUsers);
}
