package org.lxf.mybatisflexxxl.common.util;

import org.lxf.mybatisflexxxl.common.annotation.Level;

import java.lang.reflect.Field;
import java.util.*;

/**
 * 反射实体字段工具类
 *
 * @author lxf
 * @version 1.0
 * @since 2025/4/8 23:29
 */
public class FieldNameUtil {
    /**
     * 获取类及其父类的所有字段名（转换为小写下划线格式）
     *
     * @param clazz 类定义
     * @return 类的全部字段的小写下划线格式列表
     */
    public static Set<String> getUnderScoredFieldNames(Class<?> clazz) {
        return getUnderScoredFieldNames(clazz, true);
    }

    /**
     * 获取类及其父类的所有字段名（转换为小写下划线格式）
     *
     * @param clazz 类定义
     * @return 类的全部字段的小写下划线格式列表
     */
    public static Set<String> getUnderScoredFieldNames(Class<?> clazz, boolean castCase) {
        Set<String> fieldNames = new HashSet<>();
        Class<?> currentClass = clazz;

        // 递归遍历当前类和所有父类
        while (currentClass != null && currentClass != Object.class) {
            for (Field field : currentClass.getDeclaredFields()) {
                String underscoredName;
                if (castCase) {
                    underscoredName = camelToUnderStr(field.getName());
                } else {
                    underscoredName = field.getName();
                }
                fieldNames.add(underscoredName);
            }
            currentClass = currentClass.getSuperclass();  // 向上查找父类字段
        }
        return fieldNames;
    }

    /**
     * 驼峰转下划线格式（例如：employeeNumber -> employee_number）
     *
     * @param camelCaseName 小驼峰字符串
     * @return 下划线格式的字符串
     */
    public static String camelToUnderStr(String camelCaseName) {
        return camelCaseName.replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase();
    }

    /**
     * 获取类及其所有父类的字段（包括私有字段）
     *
     * @param clazz 目标类
     * @return 字段列表（从当前类到父类依次排列）
     */
    public static List<Field> getAllFields(Class<?> clazz) {
        List<Field> fields = new ArrayList<>();
        Class<?> currentClass = clazz;
        while (currentClass != null && currentClass != Object.class) {
            Collections.addAll(fields, currentClass.getDeclaredFields());
            // 递归获取父类字段
            currentClass = currentClass.getSuperclass();
        }
        return fields;
    }

    /**
     * 转换实体为Map，过滤@Level > 1的字段
     *
     * @param entity 待转换对象
     * @throws IllegalAccessException 异常
     */
    public static Map<String, Object> convertToMapFiltered(Object entity, int realLevel) throws IllegalAccessException {
        Map<String, Object> result = new HashMap<>();
        for (Field field : getAllFields(entity.getClass())) {
            Level level = field.getAnnotation(Level.class);
            field.setAccessible(true);
            if (level == null) {
                if (realLevel >= 1) {
                    result.put(field.getName(), field.get(entity));
                }
            } else {
                if (level.value() <= realLevel) {
                    result.put(field.getName(), field.get(entity));
                }
            }
        }
        return result;
    }
}
