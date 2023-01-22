package module.springcertification.repository;

import module.springcertification.controller.UserLoginController;
import org.springframework.data.repository.CrudRepository;

public interface UserTokenRedisRepository extends CrudRepository<UserLoginController, String> {
}
