package org.lxf.mybatisflexxxl.model.entity;

import com.mybatisflex.annotation.Column;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.lxf.mybatisflexxxl.common.annotation.Level;

import java.util.Date;

/**
 * 公共时间-创建/更新时间
 *
 * @author lxf
 * @version 1.0
 * @since 2025/4/6 16:31
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseTime extends BaseLongId {
    @Column(onInsertValue = "now()")
    private Date createTime;

    @Column(onInsertValue = "now()")
    private Date modifyTime;
}
