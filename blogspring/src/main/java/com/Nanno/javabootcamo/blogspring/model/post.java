package com.Nanno.javabootcamo.blogspring.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;
@Entity
@Table
public class post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	@Column
	private String title;
	@Column
	@NotEmpty
	private String content;
	@Column
	private Instant createdOn;
	@Column
	private Instant updateOn;
	@Column
	@NotBlank
	private String userName;
	@Column
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public Instant getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}
	public Instant getUpdateOn() {
		return updateOn;
	}
	public void setUpdateOn(Instant updateOn) {
		this.updateOn = updateOn;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}
