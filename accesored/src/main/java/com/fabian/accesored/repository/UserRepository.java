package com.fabian.accesored.repository;

import com.fabian.accesored.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


    @Modifying
    @Query(value = "INSERT INTO public.usered\n" +
            "(email, \"name\", pass, statu)\n" +
            "VALUES('f@gmail.coc', 'fabian', '12345fvs', 0)", nativeQuery = true)
    @Transactional
    void saveUser();

}
