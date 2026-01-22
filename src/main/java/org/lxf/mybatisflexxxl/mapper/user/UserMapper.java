package org.lxf.mybatisflexxxl.mapper.user;

import com.mybatisflex.annotation.UseDataSource;
import com.mybatisflex.core.BaseMapper;
import org.lxf.mybatisflexxxl.entity.user.UserEntity;

/**
 * 用户数据映射
 *
 * @author lxf
 * @version 1.0
 * @since 2025/4/6 16:31
 */
@UseDataSource("ds-base")
public interface UserMapper extends BaseMapper<UserEntity> {
}
