package com.jpa.sts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.jpa.sts.model.User;

public interface UserRepositry extends CrudRepository<User,Integer>{

}
