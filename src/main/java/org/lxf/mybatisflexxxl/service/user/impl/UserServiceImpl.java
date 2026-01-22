package org.lxf.mybatisflexxxl.service.user.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.lxf.mybatisflexxxl.entity.user.UserEntity;
import org.lxf.mybatisflexxxl.mapper.user.UserMapper;
import org.lxf.mybatisflexxxl.service.user.UserService;
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
