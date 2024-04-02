package ma.enset.tp02part3.repository;

import ma.enset.tp02part3.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    User findByUserName(String userName);
}

