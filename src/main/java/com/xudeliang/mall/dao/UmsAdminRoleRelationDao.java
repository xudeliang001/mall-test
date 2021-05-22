package com.xudeliang.mall.dao;

import com.xudeliang.mall.mbg.model.UmsPermission;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;

public interface UmsAdminRoleRelationDao {
    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
