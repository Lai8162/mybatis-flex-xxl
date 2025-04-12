package org.lxf.mybatisflexxxl.model.entity;

import com.mybatisflex.annotation.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import org.lxf.mybatisflexxxl.model.entity.base.BaseAudit;

import java.util.Date;

/**
 * 角色实体
 *
 * @author lxf
 * @version 1.0
 * @since 2025/4/12 16:21
 */
@Data
@Table("role")
@FieldNameConstants
@EqualsAndHashCode(callSuper = true)
public class RoleEntity extends BaseAudit {
    private String nameCn;

    private String nameEn;
}
