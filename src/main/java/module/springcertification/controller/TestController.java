package module.springcertification.controller;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

    @GetMapping(value = "")
    public void testRequest() throws Exception {
        logger.info("/test get mapping");
    }
}
