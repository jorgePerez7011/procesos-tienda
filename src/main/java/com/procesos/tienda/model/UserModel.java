package com.procesos.tienda.model;
import lombok.Data;

@Data
public class UserModel {
    private Long id;
    private String firstaName;
    private String lastName;
    private String document;
    private String address;
    private String phone;
    private String email;
    private String password;
}
