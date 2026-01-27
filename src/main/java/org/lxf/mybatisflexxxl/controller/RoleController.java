package org.lxf.mybatisflexxxl.controller;

import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.lxf.mybatisflexxxl.common.response.PageResult;
import org.lxf.mybatisflexxxl.common.response.Result;
import org.lxf.mybatisflexxxl.dto.request.base.PageQueryForm;
import org.lxf.mybatisflexxxl.entity.role.RoleEntity;
import org.lxf.mybatisflexxxl.vo.response.role.RoleDetailVO;
import org.lxf.mybatisflexxxl.service.role.RoleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 角色API接口控制层
 *
 * @author lxf
 * @version 1.0
 * @since 2025/4/12 16:26
 */
@RestController
@RequestMapping("/role")
public class RoleController {
    @Resource
    private RoleService roleService;

    @PostMapping("/query")
    public Result<PageResult<?>> pageQuery(@RequestBody @Valid PageQueryForm pageQueryForm) {
        return Result.ok(new PageResult<>(roleService.basePageQuery(pageQueryForm, RoleDetailVO.class)));
    }

    @PostMapping("/add")
    public Result<Object> add(@RequestBody Object object) {
        return Result.ok(roleService.baseAdd(object, RoleEntity.class));
    }
}
