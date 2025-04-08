package org.lxf.mybatisflexxxl.model.entity;

import com.mybatisflex.annotation.Column;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.lxf.mybatisflexxxl.common.annotation.Level;

import java.util.Date;

/**
 * 公共时间/用户
 *
 * @author lxf
 * @version 1.0
 * @since 2025/4/6 16:31
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseTimeOrUser extends BaseLongId {
    @Level(1)
    private Long creatorId;

    @Level(1)
    private Long modifierId;

    @Level
    @Column(onInsertValue = "now()")
    private Date createTime;

    @Level
    @Column(onInsertValue = "now()")
    private Date modifyTime;
}
