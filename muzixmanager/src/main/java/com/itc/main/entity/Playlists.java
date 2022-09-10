package com.itc.main.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Playlists {
	@Id
	private int songId;
	private String playlistName;
	private String songName;
	private String singerName;
	private String composedBy;
	public Playlists() {
		super();
	}
	public Playlists(int songId, String playlistName, String songName, String singerName, String composedBy) {
		super();
		this.songId = songId;
		this.playlistName = playlistName;
		this.songName = songName;
		this.singerName = singerName;
		this.composedBy = composedBy;
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
	@Override
	public String toString() {
		return "Playlists [songId=" + songId + ", playlistName=" + playlistName + ", songName=" + songName
				+ ", singerName=" + singerName + ", composedBy=" + composedBy + "]";
	}
	

}
