package ru.ivmiit.forms;

import lombok.Data;

@Data
public class UserForm {
    private String name;
    private String login;
    private String password;
    private String email;
}