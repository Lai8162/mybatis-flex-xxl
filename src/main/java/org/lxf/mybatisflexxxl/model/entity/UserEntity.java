package org.lxf.mybatisflexxxl.model.entity;

import cn.hutool.core.bean.BeanUtil;
import com.mybatisflex.annotation.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import org.lxf.mybatisflexxxl.model.demo.BaseDTOCastDemo;
import org.lxf.mybatisflexxxl.model.demo.UserDemo;
import org.lxf.mybatisflexxxl.model.entity.base.BaseTime;

/**
 * 用户实体
 *
 * @author lxf
 * @version 1.0
 * @since 2025/4/6 16:31
 */
@Data
@Table(value = "user")
@FieldNameConstants
@EqualsAndHashCode(callSuper = true)
public class UserEntity extends BaseTime implements BaseDTOCastDemo<UserEntity, UserDemo> {
    private String name;

    private String phone;

    private String email;

    private String address;

    private String employeeNumber;

    private String account;

    @Override
    public UserDemo buildDemo(UserEntity userEntity) {
        UserDemo userDemo = new UserDemo();
        BeanUtil.copyProperties(userEntity, userDemo);
        return userDemo;
    }
}
