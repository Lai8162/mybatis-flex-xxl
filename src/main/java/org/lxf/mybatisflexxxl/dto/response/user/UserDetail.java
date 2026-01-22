package org.lxf.mybatisflexxxl.dto.response.user;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.lxf.mybatisflexxxl.entity.user.UserEntity;

/**
 * 用户视图
 *
 * @author lxf
 * @version 1.0
 * @since 2025/4/9 3:42
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserDetail extends UserEntity {
}
