package com.itc.main.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Bookmark {
	private int songId;
	private String songName;
	private String singerName;
	@JsonIgnore
	private int userId;
	public Bookmark() {
		super();
	}
	public Bookmark(int songId, String songName, String singerName, int userId) {
		super();
		this.songId = songId;
		this.songName = songName;
		this.singerName = singerName;
		this.userId = userId;
	}
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

}
