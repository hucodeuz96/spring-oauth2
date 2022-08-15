package com.hucode.springoauth2example.entity;

import lombok.*;

import javax.persistence.*;

/**
 * @author "Husniddin Ulachov"
 * @created 6:12 AM on 8/15/2022
 * @project spring-oauth2-example
 */
@Entity(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String given_name;
    private String picture;
    private String type;
    private String email;
    private String login;
    private String bio;
    private String avatar_url;
    private String url;
}
