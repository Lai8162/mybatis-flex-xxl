package org.lxf.mybatisflexxxl;

import com.alibaba.fastjson2.JSONObject;
import com.fasterxml.jackson.core.type.TypeReference;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.lxf.mybatisflexxxl.common.util.OkHttpClientUtil;
import org.lxf.mybatisflexxxl.service.user.UserService;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisFlexXxlApplicationTests {
    @Resource
    private UserService userService;

    @Test
    void contextLoads() {
        JSONObject jsonObject = OkHttpClientUtil.get("https://jsonplaceholder.typicode.com/posts/1", null, new TypeReference<>() {});
        System.out.println(jsonObject);
    }
}
