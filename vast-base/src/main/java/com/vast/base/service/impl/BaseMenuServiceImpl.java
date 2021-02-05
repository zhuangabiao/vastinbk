package com.vast.base.service.impl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.vast.base.core.service.impl.BaseDBServiceImpl;
import com.vast.base.dto.vo.BaseMenuVo;
import com.vast.base.entity.BaseMenu;
import com.vast.base.service.IBaseMenuService;
import com.vast.base.units.MyGsonUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: vastinbk
 * @Package: com.vast.base.service.impl
 * @ClassName: BaseMenuServiceImpl
 * @Author: Mr.Z
 * @Description:
 * @Date: 2021/1/14 22:15
 * <p>
 * =================================================
 * @Version: 1.0
 * =================================================
 */
@Service
public class BaseMenuServiceImpl extends BaseDBServiceImpl<BaseMenu> implements IBaseMenuService {


    @Override
    public List<BaseMenuVo> findList(String parentCode) {

        if(StringUtils.isNotBlank(parentCode)) {
            BaseMenu baseMenu = new BaseMenu();
            baseMenu.setParentCode(parentCode);
            List<BaseMenu> list = this.findByEntity(baseMenu);
            List<BaseMenuVo> voList = MyGsonUtil.parseList(list,BaseMenuVo.class);
            if(null != voList) {
                for(BaseMenuVo vo : voList) {
                    BaseMenu menu = new BaseMenu();
                    menu.setParentCode(vo.getMenuCode());
                    List<BaseMenu> menuList = this.findByEntity(menu);
                    if(null != menuList) {
                        vo.setTreeList(MyGsonUtil.parseList(menuList,BaseMenuVo.class));
                    }
                }
            }
            return voList;
        }
        return null;
    }


}
