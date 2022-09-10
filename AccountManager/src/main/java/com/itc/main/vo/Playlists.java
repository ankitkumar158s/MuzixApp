package com.itc.main.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Playlists {
	private int songId;
	private String playlistName;
	private String songName;
	private String singerName;
	private String composedBy;
	@JsonIgnore
	private int userId;
	public Playlists() {
		super();
	}
	public Playlists(int songId, String playlistName, String songName, String singerName, String composedBy,
			int userId) {
		super();
		this.songId = songId;
		this.playlistName = playlistName;
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
	public String getPlaylistName() {
		return playlistName;
	}
	public void setPlaylistName(String playlistName) {
		this.playlistName = playlistName;
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
