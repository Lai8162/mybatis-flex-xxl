package org.lxf.mybatisflexxxl.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.lxf.mybatisflexxxl.model.entity.UserEntity;
import org.lxf.mybatisflexxxl.model.mapper.UserMapper;
import org.lxf.mybatisflexxxl.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户API服务实现
 *
 * @author lxf
 * @version 1.0
 * @since 2025/4/6 16:31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {
}
