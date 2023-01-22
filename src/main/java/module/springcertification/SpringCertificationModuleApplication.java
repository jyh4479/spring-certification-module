package module.springcertification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//FIXME: Spring에는 DB를 자동으로 쓴다고 설정했지만 properties or yml에 해당 설정이 없는 경우
//FIXME: 에러가 나기때문에 아래와 같이 정의함
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringCertificationModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCertificationModuleApplication.class, args);
    }

}
