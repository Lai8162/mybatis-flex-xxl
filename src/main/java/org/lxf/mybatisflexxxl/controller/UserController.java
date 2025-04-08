package org.lxf.mybatisflexxxl.controller;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.lxf.mybatisflexxxl.common.response.PageResponse;
import org.lxf.mybatisflexxxl.common.response.Response;
import org.lxf.mybatisflexxxl.form.*;
import org.lxf.mybatisflexxxl.model.demo.UserDemo;
import org.lxf.mybatisflexxxl.model.entity.UserEntity;
import org.lxf.mybatisflexxxl.model.vo.UserVO;
import org.lxf.mybatisflexxxl.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * 用户API接口控制层
 *
 * @author lxf
 * @version 1.0
 * @since 2025/4/6 16:31
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/query")
    public Response<PageResponse<?>> pageQuery(@RequestBody @Valid PageQueryForm pageQueryForm) {
        return Response.ok(new PageResponse<>(userService.pageQuery(pageQueryForm, UserVO.class)));
    }

    @PostMapping("/add")
    public Response<Object> add(@RequestBody Object object) {
        return Response.ok(userService.baseAdd(object, UserEntity.class));
    }

    @PostMapping("/update")
    public Object update(@RequestBody @Valid UpdateForm updateForm) {
        userService.baseUpdate(updateForm, UserEntity.class);
        return Response.ok();
    }

    @PostMapping("/delete")
    public Object delete(@RequestBody @Valid DeleteForm deleteForm) {
        return Response.ok(userService.baseDelete(deleteForm, UserEntity.class));
    }

    @PostMapping("/statistics")
    public Object statistics(@RequestBody @Valid StatisticsForm statisticsForm) {
        return Response.ok(userService.baseStatistics(statisticsForm, UserEntity.class));
    }

    @PostMapping("/excelExport")
    public void excelExport(HttpServletResponse response, @RequestBody @Valid ExcelExportForm excelExportForm) throws IOException {
        userService.baseExcelExport(response, excelExportForm, "用户详情数据", UserEntity.class, UserDemo.class);
    }
}
