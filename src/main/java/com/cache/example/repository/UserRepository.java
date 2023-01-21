package com.cache.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cache.example.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
