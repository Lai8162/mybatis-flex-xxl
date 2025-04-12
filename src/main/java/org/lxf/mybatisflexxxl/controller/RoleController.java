package org.lxf.mybatisflexxxl.controller;

import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.lxf.mybatisflexxxl.common.response.PageResponse;
import org.lxf.mybatisflexxxl.common.response.Response;
import org.lxf.mybatisflexxxl.form.PageQueryForm;
import org.lxf.mybatisflexxxl.model.entity.RoleEntity;
import org.lxf.mybatisflexxxl.model.vo.RoleVO;
import org.lxf.mybatisflexxxl.service.RoleService;
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
    public Response<PageResponse<?>> pageQuery(@RequestBody @Valid PageQueryForm pageQueryForm) {
        return Response.ok(new PageResponse<>(roleService.basePageQuery(pageQueryForm, RoleVO.class)));
    }

    @PostMapping("/add")
    public Response<Object> add(@RequestBody Object object) {
        return Response.ok(roleService.baseAdd(object, RoleEntity.class));
    }
}
