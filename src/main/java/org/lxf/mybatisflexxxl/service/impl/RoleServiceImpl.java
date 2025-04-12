package org.lxf.mybatisflexxxl.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.lxf.mybatisflexxxl.model.entity.RoleEntity;
import org.lxf.mybatisflexxxl.model.mapper.RoleMapper;
import org.lxf.mybatisflexxxl.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * 角色API服务实现
 *
 * @author lxf
 * @version 1.0
 * @since 2025/4/12 16:25
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, RoleEntity> implements RoleService {
}
