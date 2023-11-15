package com.haktanozgur.DietApp.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.haktanozgur.DietApp.Entity.User;


public interface UserRepository extends JpaRepository<User, Long>{

	Optional <User> findByUsername(String userName);
}
