package todo.app.backend;

import io.jsonwebtoken.Jwts;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootTest
class BackendApplicationTests {

    @Test
    void contextLoads() {
        long curTime = System.currentTimeMillis();

        List<String> strList = new ArrayList<>(Arrays.asList("한영민", "김아무개", "박아무개", "이무기"));
        boolean res = strList.stream()
                .filter(String::isEmpty)
                .allMatch((e) -> e.startsWith("한"));

        System.out.println(res);
    }

}
