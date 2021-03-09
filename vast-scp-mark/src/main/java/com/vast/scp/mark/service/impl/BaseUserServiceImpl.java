package com.vast.scp.mark.service.impl;


import com.vast.scp.mark.core.service.impl.BaseDBServiceImpl;
import com.vast.scp.mark.entity.BaseUsers;
import com.vast.scp.mark.service.IBaseUserService;
import com.vast.scp.mark.units.result.BaseResult;
import com.vast.scp.mark.units.result.MyResponse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ====================================================
 *
 * @ProjectName: vast-inbk
 * @Package: com.vast.base.service.impl
 * @ClassName: BaseUserServiceImpl
 * @Author: Administrator
 * @Description: User逻辑处理类
 * @Date: 2021/1/4 16:16
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
@Service
public class BaseUserServiceImpl extends BaseDBServiceImpl<BaseUsers> implements IBaseUserService {
    @Override
    public BaseResult login(String username, String pwd) {

        BaseUsers user = new BaseUsers();
        user.setUsername(username);
        user.setPwd(pwd);
        List<BaseUsers> list = this.findByEntity(user);
        if(null == list || list.size() <= 0){
            return new BaseResult(MyResponse.SC_NO_CONTENT);
        }
        if(list.size() > 1) {
            return new BaseResult(MyResponse.SC_MULTIPLE_CHOICES);
        }
        return new BaseResult(MyResponse.SC_OK,list.get(0));
    }

    @Override
    public BaseResult save(BaseUsers baseUsers) {

        BaseUsers user = new BaseUsers();
        user.setUsername(baseUsers.getUsername());
        List<BaseUsers> userList = this.findByEntity(user);
        if(null ==userList || userList.size() <= 0) {
            this.insert(baseUsers);
            return new BaseResult(MyResponse.SC_OK);
        }
        return new BaseResult(MyResponse.HAS_DATA,null,"账号已经存在");
    }
}
