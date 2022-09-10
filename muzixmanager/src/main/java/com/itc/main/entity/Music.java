package com.itc.main.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Music {
	@Id
	private int songId;
	private String songName;
	private String singerName;
	private String composedBy;
	public Music() {
		super();
	}
	public Music(int songId, String songName, String singerName, String composedBy) {
		super();
		this.songId = songId;
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
		return "Music [songId=" + songId + ", songName=" + songName + ", singerName=" + singerName + ", createdBy="
				+ composedBy + "]";
	}
	
	
	

}
