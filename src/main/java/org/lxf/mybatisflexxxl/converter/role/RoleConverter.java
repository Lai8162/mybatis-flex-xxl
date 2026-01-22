package org.lxf.mybatisflexxxl.converter.role;

import org.lxf.mybatisflexxxl.dto.response.role.RoleDetail;
import org.lxf.mybatisflexxxl.dto.response.user.UserSimpleInfo;
import org.lxf.mybatisflexxxl.entity.role.RoleEntity;
import org.lxf.mybatisflexxxl.entity.user.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface RoleConverter {
    RoleDetail toRoleDetail(RoleEntity entity);

    default UserSimpleInfo toUserSimpleInfo(UserEntity user) {
        if (user == null) {
            return null;
        }
        UserSimpleInfo userSimpleInfo = new UserSimpleInfo();
        userSimpleInfo.setId(user.getId());
        userSimpleInfo.setName(user.getName());
        // 敏感字段（如 email/password）不会被拷贝
        return userSimpleInfo;
    }

    Iterable<RoleDetail> toRoleDetailList(Iterable<RoleEntity> entities);
}
