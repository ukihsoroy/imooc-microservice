package com.imooc.dto;

import java.io.Serializable;

/**
 * description: UserDTO <br>
 * date: 2020/3/1 14:18 <br>
 *
 * @author K.O <br>
 * @version 1.0 <br>
 */
public class UserDTO implements Serializable {

    private Integer id;
    private String username;
    private String password;
    private String mobile;
    private String email;
    private String realName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
