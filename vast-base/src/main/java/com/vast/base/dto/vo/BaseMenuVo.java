package com.vast.base.dto.vo;

import com.vast.base.entity.BaseMenu;

import java.util.List;

/**
 * ====================================================
 *
 * @ProjectName: vastinbk
 * @Package: com.vast.base.dto.vo
 * @ClassName: BaseMenuVo
 * @Author: Administrator
 * @Description:
 * @Date: 2021/2/5 14:16
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
public class BaseMenuVo extends BaseMenu {
    private List<BaseMenuVo> treeList;

    public List<BaseMenuVo> getTreeList() {
        return treeList;
    }

    public void setTreeList(List<BaseMenuVo> treeList) {
        this.treeList = treeList;
    }
}
