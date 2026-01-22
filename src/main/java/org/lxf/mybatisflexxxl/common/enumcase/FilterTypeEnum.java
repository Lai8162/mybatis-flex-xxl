package org.lxf.mybatisflexxxl.common.enumcase;

import lombok.Getter;

import java.util.Optional;

/**
 * 查询类型枚举
 *
 * @author lxf
 * @version 1.0
 * @since 2025/4/5 23:31
 */
@Getter
public enum FilterTypeEnum {
    EQ("eq"),
    NE("ne"),
    IN("in"),
    NOT_IN("notIn"),
    GE("ge"),
    GT("gt"),
    LE("le"),
    LT("lt"),
    BETWEEN("between"),
    NOT_BETWEEN("notBetween"),
    STARTS_WITH("startsWith"),
    ENDS_WITH("endsWith"),
    IS_NUll("isNull"),
    IS_NOT_NULL("isNotNull"),
    ;

    private final String type;

    FilterTypeEnum(String type) {
        this.type = type;
    }

    public static Optional<FilterTypeEnum> ofType(String type) {
        for (FilterTypeEnum value : FilterTypeEnum.values()) {
            if (value.type.equals(type)) {
                return Optional.of(value);
            }
        }
        return Optional.empty();
    }

    public static boolean isValid(String type) {
        for (FilterTypeEnum value : FilterTypeEnum.values()) {
            if (value.type.equals(type)) {
                return true;
            }
        }
        return false;
    }
}
