package com.example.demo.repo;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository //repository ekk kyl mention krnna
public interface UserRepo extends JpaRepository<User, Integer> {
    //data types define krnw interfaces eke

    @Query(value = "SELECT * FROM User WHERE id= ?1 ",nativeQuery = true  )
    User getUserById(Integer  id);
}
