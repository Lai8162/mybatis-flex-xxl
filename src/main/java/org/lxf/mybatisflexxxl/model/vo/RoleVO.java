package org.lxf.mybatisflexxxl.model.vo;

import com.mybatisflex.annotation.RelationOneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.lxf.mybatisflexxxl.common.annotation.Level;
import org.lxf.mybatisflexxxl.model.entity.RoleEntity;
import org.lxf.mybatisflexxxl.model.entity.UserEntity;

/**
 * 角色视图
 *
 * @author lxf
 * @version 1.0
 * @since 2025/4/12 16:27
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RoleVO extends RoleEntity {
    @RelationOneToOne(selfField = "creatorId", targetField = "id")
    @Level(2)
    private UserEntity creator;

    @RelationOneToOne(selfField = "modifierId", targetField = "id")
    @Level(2)
    private UserEntity modifier;
}
