package module.springcertification.service;

import module.springcertification.dto.UserLoginInformation;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {
    public Boolean userLoginCheck(UserLoginInformation userInfo) {
        return true;
    }
}
