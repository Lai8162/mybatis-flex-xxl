package org.lxf.mybatisflexxxl.model.entity;

import cn.hutool.core.bean.BeanUtil;
import com.mybatisflex.annotation.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import org.lxf.mybatisflexxxl.common.annotation.Level;
import org.lxf.mybatisflexxxl.model.demo.BaseDTOCastDemo;
import org.lxf.mybatisflexxxl.model.demo.UserDemo;

/**
 * 用户实体
 *
 * @author lxf
 * @version 1.0
 * @since 2025/4/6 16:31
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table("user")
@FieldNameConstants
public class UserEntity extends BaseTimeOrUser implements BaseDTOCastDemo<UserEntity, UserDemo> {
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
