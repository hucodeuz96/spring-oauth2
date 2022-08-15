package com.hucode.springoauth2example.repository;

import com.hucode.springoauth2example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * @author "Husniddin Ulachov"
 * @created 6:09 AM on 8/15/2022
 * @project spring-oauth2-example
 */
@RepositoryRestResource(path = "users")
public interface UserRepository extends JpaRepository<User,Integer> {
}
