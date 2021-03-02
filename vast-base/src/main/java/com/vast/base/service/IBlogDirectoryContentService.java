package com.vast.base.service;

import com.vast.base.core.service.IBaseDBService;
import com.vast.base.entity.BlogDirectory;
import com.vast.base.entity.BlogDirectoryContent;

/**
 * @ProjectName: vastinbk
 * @Package: com.vast.base.service
 * @ClassName: IBaseRoleService
 * @Author: Mr.Z
 * @Description:
 * @Date: 2021/1/14 22:17
 * <p>
 * =================================================
 * @Version: 1.0
 * =================================================
 */
public interface IBlogDirectoryContentService extends IBaseDBService<BlogDirectoryContent> {

     BlogDirectoryContent getByCode(String code);
}
