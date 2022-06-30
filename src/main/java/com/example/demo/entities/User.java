package com.example.demo.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class User {
    @Id
    private String userId;
    private String userName;
    protected String userMail;
    private String password;
    private boolean isEmailVerified;

    protected String userCountry;
    

    public User(String userId, String userName, String userMail, String password, boolean isEmailVerified,
			String userCountry) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMail = userMail;
		this.password = password;
	
	}

	public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserMail() {
        return userMail;
    }

    public String getPassword() {
        return password;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public boolean isEmailVerified() {
        return isEmailVerified;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }
    public void setEmailVerified(boolean emailVerified) {
        isEmailVerified = emailVerified;
    }
}
