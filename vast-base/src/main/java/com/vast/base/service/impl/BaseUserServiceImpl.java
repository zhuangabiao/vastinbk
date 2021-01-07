package com.vast.base.service.impl;

import com.vast.base.core.result.BaseResult;
import com.vast.base.core.result.MyResponse;
import com.vast.base.core.service.impl.BaseDBServiceImpl;
import com.vast.base.entity.BaseUsers;
import com.vast.base.enums.ExceptionEnum;
import com.vast.base.service.IBaseUserService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
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
}
