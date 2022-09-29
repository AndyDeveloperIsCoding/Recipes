package recipes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import recipes.entity.User;

@Component
public interface UserRepository extends CrudRepository<User, Integer> {

    User findUserByEmail(String email);

    boolean existsByEmail(String email);
}