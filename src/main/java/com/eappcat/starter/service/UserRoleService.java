package com.eappcat.starter.service;

import com.eappcat.starter.entity.UserRole;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Xuan Yue Bo
 * @since 2018-05-12
 */
public interface UserRoleService extends IService<UserRole> {
    List<String> findUserRoles(String userId);
}
