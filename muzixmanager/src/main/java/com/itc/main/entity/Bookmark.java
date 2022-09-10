package com.itc.main.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bookmark {
	@Id
	private int songId;
	int userId;
	private String songName;
	private String singerName;
	public Bookmark() {
		super();
	}
	public Bookmark(int songId, int userId, String songName, String singerName) {
		super();
		this.songId = songId;
		this.userId = userId;
		this.songName = songName;
		this.singerName = singerName;
	}
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	@Override
	public String toString() {
		return "Bookmark [songId=" + songId + ", userId=" + userId + ", songName=" + songName + ", singerName="
				+ singerName + "]";
	}
	
	
}
	