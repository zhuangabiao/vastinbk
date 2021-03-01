package com.vast.base.service;

import com.vast.base.core.service.IBaseDBService;
import com.vast.base.dto.dto.BlogDirectoryDTO;
import com.vast.base.entity.BaseRole;
import com.vast.base.entity.BlogDirectory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
public interface IBlogDirectoryService extends IBaseDBService<BlogDirectory> {

    List<BlogDirectoryDTO> findDirectory(String userCode,String parentCode);
}
