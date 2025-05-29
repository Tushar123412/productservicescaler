package com.project.project.inheritancedemo.singletable;

import jakarta.persistence.*;

@Entity(name = "st_user")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "userType",
                    discriminatorType = DiscriminatorType.STRING
                    )
@DiscriminatorValue(value = "User")
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
}
