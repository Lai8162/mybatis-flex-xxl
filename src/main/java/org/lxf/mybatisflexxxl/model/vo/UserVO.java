package org.lxf.mybatisflexxxl.model.vo;

import com.mybatisflex.annotation.RelationOneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.lxf.mybatisflexxxl.common.annotation.Level;
import org.lxf.mybatisflexxxl.model.entity.UserEntity;

/**
 * 用户视图
 *
 * @author lxf
 * @version 1.0
 * @since 2025/4/9 3:42
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserVO extends UserEntity {
    @RelationOneToOne(selfField = "creatorId", targetField = "id")
    @Level(2)
    private UserEntity creator;

    @RelationOneToOne(selfField = "modifierId", targetField = "id")
    @Level(2)
    private UserEntity modifier;
}
