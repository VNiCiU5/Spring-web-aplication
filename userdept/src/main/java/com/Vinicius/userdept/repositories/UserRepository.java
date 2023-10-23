package com.Vinicius.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vinicius.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
