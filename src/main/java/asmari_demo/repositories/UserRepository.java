package asmari_demo.repositories;

import asmari_demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
//JpaRepository