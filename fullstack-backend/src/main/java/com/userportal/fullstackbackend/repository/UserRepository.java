package com.userportal.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userportal.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User,Long>
{

}
