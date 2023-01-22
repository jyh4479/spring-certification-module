package module.springcertification.service;

import module.springcertification.dto.UserLoginInformationDto;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {
    public Boolean userLoginCheck(UserLoginInformationDto userInfo) {
        return true;
    }
}
