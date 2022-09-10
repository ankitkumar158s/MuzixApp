package com.itc.main.vo;

import com.itc.main.entity.User;

public class UserBookmarks {
	private User user;
	private Bookmark[] bookmark;
	public UserBookmarks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserBookmarks(User user, Bookmark[] bookmark) {
		super();
		this.user = user;
		this.bookmark = bookmark;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Bookmark[] getBookmark() {
		return bookmark;
	}
	public void setBookmark(Bookmark[] bookmark) {
		this.bookmark = bookmark;
	}
	

}