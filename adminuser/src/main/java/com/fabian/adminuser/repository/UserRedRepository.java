package com.fabian.adminuser.repository;

import com.fabian.adminuser.entity.UserRed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRedRepository extends JpaRepository<UserRed, Long> {
}
