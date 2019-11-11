package com.aloner2019.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * 	用户实体类
 * @author NarcissuLyh
 *
 */
public class User {
	@Id
	private String id;

	private String nickname;

	private String username;

	private String password;

	@Column(name = "create_at")
	private Date createAt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

}
