package org.lxf.mybatisflexxxl.vo.response.role;

import com.mybatisflex.annotation.RelationOneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.lxf.mybatisflexxxl.common.annotation.Level;
import org.lxf.mybatisflexxxl.entity.role.RoleEntity;
import org.lxf.mybatisflexxxl.entity.user.UserEntity;

/**
 * 角色视图
 *
 * @author lxf
 * @version 1.0
 * @since 2025/4/12 16:27
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RoleDetailVO extends RoleEntity {
    @RelationOneToOne(selfField = "creatorId", targetField = "id")
    @Level(2)
    private UserEntity creator;

    @RelationOneToOne(selfField = "modifierId", targetField = "id")
    @Level(2)
    private UserEntity modifier;
}
