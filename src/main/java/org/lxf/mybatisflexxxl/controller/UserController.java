package org.lxf.mybatisflexxxl.controller;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.lxf.mybatisflexxxl.common.response.PageResult;
import org.lxf.mybatisflexxxl.common.response.Result;
import org.lxf.mybatisflexxxl.dto.request.base.*;
import org.lxf.mybatisflexxxl.entity.user.UserEntity;
import org.lxf.mybatisflexxxl.vo.excel.user.UserExportVO;
import org.lxf.mybatisflexxxl.vo.response.user.UserDetailVO;
import org.lxf.mybatisflexxxl.service.user.UserService;
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
    public Result<PageResult<?>> pageQuery(@RequestBody @Valid PageQueryForm pageQueryForm) {
        return Result.ok(new PageResult<>(userService.basePageQuery(pageQueryForm, UserDetailVO.class)));
    }

    @PostMapping("/add")
    public Result<Object> add(@RequestBody Object object) {
        return Result.ok(userService.baseAdd(object, UserEntity.class));
    }

    @PostMapping("/update")
    public Object update(@RequestBody @Valid UpdateForm updateForm) {
        userService.baseUpdate(updateForm, UserEntity.class);
        return Result.ok();
    }

    @PostMapping("/delete")
    public Object delete(@RequestBody @Valid DeleteForm deleteForm) {
        return Result.ok(userService.baseDelete(deleteForm, UserEntity.class));
    }

    @PostMapping("/statistics")
    public Object statistics(@RequestBody @Valid StatisticsForm statisticsForm) {
        return Result.ok(userService.baseStatistics(statisticsForm, UserEntity.class));
    }

    @PostMapping("/excel/export")
    public void excelExport(HttpServletResponse response, @RequestBody @Valid ExcelExportForm excelExportForm) throws IOException {
        userService.baseExcelExport(response, excelExportForm, "用户详情数据", UserEntity.class, UserExportVO.class);
    }

    @PostMapping("/template/export")
    public void templateExport(HttpServletResponse response, @RequestBody @Valid ExcelExportForm excelExportForm) throws IOException {
        userService.baseTemplateExport(response, "UserUploadTemplate.xlsx", excelExportForm.getFileName());
    }
}
