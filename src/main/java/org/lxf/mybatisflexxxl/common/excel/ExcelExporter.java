package org.lxf.mybatisflexxxl.common.excel;

/**
 * DTO转换为Excel接口，所有需要导出的待转换的实体都需要实现此类
 *
 * @author lxf
 * @version 1.0
 * @since 2025/4/9 1:28
 */
public interface ExcelExporter<T, E> {
   /**
    * 构建easyexcel导出对象
    * @param dto the dto
    * @return E excel实体类
    */
   E buildExcel(T dto);
}
