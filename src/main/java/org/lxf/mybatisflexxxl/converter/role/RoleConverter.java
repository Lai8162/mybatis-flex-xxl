package org.lxf.mybatisflexxxl.converter.role;

import org.lxf.mybatisflexxxl.vo.response.role.RoleDetailVO;
import org.lxf.mybatisflexxxl.vo.response.user.UserSimpleInfoVO;
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
    RoleDetailVO toRoleDetail(RoleEntity entity);

    default UserSimpleInfoVO toUserSimpleInfo(UserEntity user) {
        if (user == null) {
            return null;
        }
        UserSimpleInfoVO userSimpleInfoVO = new UserSimpleInfoVO();
        userSimpleInfoVO.setId(user.getId());
        userSimpleInfoVO.setName(user.getName());
        // 敏感字段（如 email/password）不会被拷贝
        return userSimpleInfoVO;
    }

    Iterable<RoleDetailVO> toRoleDetailList(Iterable<RoleEntity> entities);
}
