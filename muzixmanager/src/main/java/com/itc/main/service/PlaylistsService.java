package com.itc.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itc.main.entity.Playlists;
import com.itc.main.repository.PlaylistsRepository;
@Service
public class PlaylistsService {

	@Autowired
	private PlaylistsRepository playlistsRepository;
	public void savePlaylists(Playlists playlists) {
		this.playlistsRepository.save(playlists);
	}
	public List<Playlists> getAllPlaylists(){
		List<Playlists> list=this.playlistsRepository.findAll();
		return list;
		
	}
	public Playlists getPlaylistsBysongName(String songName) {
		Optional<Playlists> op=this.playlistsRepository.findBysongName(songName);
		if(op.isPresent()) {
			return op.get();
		}else
			return null;
	}
	public Playlists getPlaylistsBysingerName(String singerName) {
		Optional<Playlists> op=this.playlistsRepository.findBysingerName(singerName);
		if(op.isPresent()) {
			return op.get();
		}else
			return null;
	}
	public Playlists getPlaylistsByplaylistName(String playlistName) {
		Optional<Playlists> op=this.playlistsRepository.findByplaylistName(playlistName);
		if(op.isPresent()) {
			return op.get();
		}else
			return null;
	}
	public Playlists getPlaylistsBysongId(int songId) {
		Optional<Playlists> op=this.playlistsRepository.findBysongId(songId);
		if(op.isPresent()) {
			return op.get();
		}else
			return null;
	}
	public boolean deletePlaylistsById(int id) {
		this.playlistsRepository.deleteById(id);
		return true;
	}
	
	
	


}
