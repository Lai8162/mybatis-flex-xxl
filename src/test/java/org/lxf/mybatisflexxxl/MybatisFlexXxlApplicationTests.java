package org.lxf.mybatisflexxxl;

import com.mybatisflex.core.query.QueryWrapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.lxf.mybatisflexxxl.service.UserService;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisFlexXxlApplicationTests {
    @Resource
    private UserService userService;

    @Test
    void contextLoads() {
        userService.baseCursor(new QueryWrapper(), 2, batch -> {
            System.out.println(batch);
            System.out.println(111);
        });
    }

}
