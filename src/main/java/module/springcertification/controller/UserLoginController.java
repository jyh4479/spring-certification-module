package module.springcertification.controller;

import ch.qos.logback.classic.Logger;
import lombok.RequiredArgsConstructor;
import module.springcertification.dto.UserLoginInformationDto;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//https://simpleisit.tistory.com/189
@RestController
@RequiredArgsConstructor
public class UserLoginController {

    private final Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
//    private final UserLoginService userLoginService;

    @PostMapping(value = "/login")
    public void userLogin(@RequestBody UserLoginInformationDto userLoginInformation) throws Exception {
        System.out.println(userLoginInformation.getId());
        logger.info(String.valueOf(userLoginInformation));
    }

    @GetMapping(value = "/login")
    public String userLoginTest() {
        return "TEST";
    }
}
