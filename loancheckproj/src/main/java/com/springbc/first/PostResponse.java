package com.springbc.first;

public class PostResponse {
	String userId;
	String id;
	String title;
	String body;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
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
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "PostResponse [userId=" + userId + ", id=" + id + ", title=" + title + ", body=" + body + "]";
	}
	public PostResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PostResponse(String userId, String id, String title, String body) {
		super();
		this.userId = userId;
		this.id = id;
		this.title = title;
		this.body = body;
	}

}
