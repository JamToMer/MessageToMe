package me.MessageTo.demo.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Entity
@Data
@AllArgsConstructor
public class User {
    @Id
    private String uid;
    private String email;
    private String password;
}
