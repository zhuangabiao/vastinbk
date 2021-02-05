package com.vast.base.service;

import com.vast.base.core.service.IBaseDBService;
import com.vast.base.dto.vo.BaseMenuVo;
import com.vast.base.entity.BaseMenu;

import java.util.List;

/**
 * @ProjectName: vastinbk
 * @Package: com.vast.base.service
 * @ClassName: IBaseMenuService
 * @Author: Mr.Z
 * @Description:
 * @Date: 2021/1/14 22:14
 * <p>
 * =================================================
 * @Version: 1.0
 * =================================================
 */
public interface IBaseMenuService extends IBaseDBService<BaseMenu> {

    List<BaseMenuVo> findList(String parentCode);
}
