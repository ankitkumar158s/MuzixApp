package com.itc.main.vo;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class Music {
	private int songId;
	private String songName;
	private String singerName;
	private String composedBy;
	@JsonIgnore
	private int userId;
	public Music() {
		super();
	}
	public Music(int songId, String songName, String singerName, String composedBy, int userId) {
		super();
		this.songId = songId;
		this.songName = songName;
		this.singerName = singerName;
		this.composedBy = composedBy;
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
	public String getComposedBy() {
		return composedBy;
	}
	public void setComposedBy(String composedBy) {
		this.composedBy = composedBy;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

}
