package com.nishant.user.service.repository;

import com.nishant.user.service.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
