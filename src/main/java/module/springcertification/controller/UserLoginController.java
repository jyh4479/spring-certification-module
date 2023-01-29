package module.springcertification.controller;

import ch.qos.logback.classic.Logger;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import module.springcertification.dto.UserLoginInformation;
import module.springcertification.service.UserLoginService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

//https://simpleisit.tistory.com/189
@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class UserLoginController {

    private final Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
    private final UserLoginService userLoginService;

    @PostMapping(value = "")
    public void userLogin(@RequestBody UserLoginInformation userLoginInformation) throws Exception {
        if (userLoginService.userLoginCheck(userLoginInformation)) {
            //TODO: 1.MariaDB에서 로그인 검증

            //TODO: 2 Access, Refresh 토큰 생성

            //TODO: 3.Redis에 Refresh token 추가

            //TODO: 4.생성된 토큰 유저에게 반환
        }
    }

    @GetMapping(value = "")
    public void testRequest() {
        logger.info("/login get mapping");
    }
}
