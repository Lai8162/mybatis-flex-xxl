package org.lxf.mybatisflexxxl.mapper.role;

import com.mybatisflex.annotation.UseDataSource;
import com.mybatisflex.core.BaseMapper;
import org.lxf.mybatisflexxxl.entity.role.RoleEntity;

/**
 * 角色数据映射
 *
 * @author lxf
 * @version 1.0
 * @since 2025/4/12 16:24
 */
@UseDataSource("ds-iam")
public interface RoleMapper extends BaseMapper<RoleEntity> {
}
