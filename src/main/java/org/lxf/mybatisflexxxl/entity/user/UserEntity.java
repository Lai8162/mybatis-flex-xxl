package org.lxf.mybatisflexxxl.entity.user;

import cn.hutool.core.bean.BeanUtil;
import com.mybatisflex.annotation.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import org.lxf.mybatisflexxxl.common.excel.ExcelExporter;
import org.lxf.mybatisflexxxl.vo.excel.user.UserExportVO;
import org.lxf.mybatisflexxxl.entity.base.BaseTime;

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
public class UserEntity extends BaseTime implements ExcelExporter<UserEntity, UserExportVO> {
    private String name;

    private String phone;

    private String email;

    private String address;

    private String employeeNumber;

    private String account;

    @Override
    public UserExportVO buildExcel(UserEntity userEntity) {
        UserExportVO userExportVO = new UserExportVO();
        BeanUtil.copyProperties(userEntity, userExportVO);
        return userExportVO;
    }
}
