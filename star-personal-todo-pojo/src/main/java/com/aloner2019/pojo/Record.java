package com.aloner2019.pojo;

import java.util.Date;

import javax.persistence.*;

/**
 * todo记录实体类
 * 
 * @author NarcissuLyh
 *
 */
public class Record {

	@Id
	private String id;

	/**
	 * 标题
	 */
	private String title;

	/**
	 * todo内容
	 */
	private String content;

	/**
	 * 创建人id
	 */
	private String creator;

	/**
	 * 是否已完成， 0- 未完成 1-已完成
	 */
	private Integer completed;

	@Column(name = "create_at")
	private Date createAt;

	@Column(name = "update_at")
	private Date updateAt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Integer getCompleted() {
		return completed;
	}

	public void setCompleted(Integer completed) {
		this.completed = completed;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
}
