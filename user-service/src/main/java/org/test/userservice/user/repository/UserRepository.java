package org.test.userservice.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.userservice.user.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
//    User findByUserId(String userId);
    User findByEmail(String email);
}
