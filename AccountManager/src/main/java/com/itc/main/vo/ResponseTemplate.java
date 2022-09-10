package com.itc.main.vo;

import com.itc.main.entity.User;

public class ResponseTemplate {
	private User user;
	private Bookmark bookmark;
	private Playlists playlists;
	
	
	public ResponseTemplate() {
		super();
	}


	public ResponseTemplate(User user, Bookmark bookmark, Playlists playlists) {
		super();
		this.user = user;
		this.bookmark = bookmark;
		this.playlists = playlists;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Bookmark getBookmark() {
		return bookmark;
	}


	public void setBookmark(Bookmark bookmark) {
		this.bookmark = bookmark;
	}


	public Playlists getPlaylists() {
		return playlists;
	}


	public void setPlaylists(Playlists playlists) {
		this.playlists = playlists;
	}
	


	
}