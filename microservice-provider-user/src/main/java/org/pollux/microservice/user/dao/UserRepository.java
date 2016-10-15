package org.pollux.microservice.user.dao;

import org.pollux.microservice.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by spockwwang on 2016/10/12.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
