package com.eappcat.starter.mapper;

import com.eappcat.starter.entity.UserRole;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Xuan Yue Bo
 * @since 2018-05-12
 */
public interface UserRoleMapper extends BaseMapper<UserRole> {
    List<String> findUserRoles(String userId);
}
