package com.itc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itc.main.entity.Playlists;
import com.itc.main.service.PlaylistsService;
@RestController
@RequestMapping("/api/")

public class PlaylistsController {
	@Autowired
	private PlaylistsService playlistsService;
	
	@PostMapping("saves")
	public ResponseEntity<Playlists> savePlaylists(@RequestBody Playlists playlists) {
		this.playlistsService.savePlaylists(playlists);
		return new ResponseEntity<Playlists>(playlists, HttpStatus.CREATED);
	}
	
	@GetMapping("playlist")
	public ResponseEntity<List<Playlists>> getAllPlaylists() {
		List<Playlists> list = this.playlistsService.getAllPlaylists();
		return new ResponseEntity<List<Playlists>>(list,HttpStatus.OK);
			
	}
	@GetMapping("getsong/{songName}")
	public ResponseEntity<Playlists> getPlaylistsBysongName(@PathVariable String songName) {
		Playlists playlists = this.playlistsService.getPlaylistsBysongName(songName);
		if(playlists!= null) {
			return new ResponseEntity<Playlists>(playlists,HttpStatus.OK);
		}
		else
			return new ResponseEntity<Playlists>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("getsinger/{singerName}")
	public ResponseEntity<Playlists> getPlaylistsBysingerName(@PathVariable String singerName) {
		Playlists playlists = this.playlistsService.getPlaylistsBysingerName(singerName);
		if(playlists!= null) {
			return new ResponseEntity<Playlists>(playlists,HttpStatus.OK);
		}
		else
			return new ResponseEntity<Playlists>(HttpStatus.NOT_FOUND);
	}
	@GetMapping("getName/{playlistName}")
	public ResponseEntity<Playlists> getPlaylistsByplaylistName(@PathVariable String playlistName) {
		Playlists playlists = this.playlistsService.getPlaylistsByplaylistName(playlistName);
		if(playlists!= null) {
			return new ResponseEntity<Playlists>(playlists,HttpStatus.OK);
		}
		else
			return new ResponseEntity<Playlists>(HttpStatus.NOT_FOUND);
	}
	@GetMapping("getid/{songId}")
	public ResponseEntity<Playlists> getPlaylistsBysongId(@PathVariable int songId) {
		Playlists playlists = this.playlistsService.getPlaylistsBysongId(songId);
		if(playlists!= null) {
			return new ResponseEntity<Playlists>(playlists,HttpStatus.OK);
		}
		else
			return new ResponseEntity<Playlists>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("delplaylists/{id}")
	public ResponseEntity<String> deletePlaylistsById(@PathVariable int id) {
		boolean b = this.playlistsService.deletePlaylistsById(id);
		if(b) {
			return new ResponseEntity<String>("DELETED SUCCESFULLY",HttpStatus.OK);
			
		}
		else 
			return new ResponseEntity<String>("NOT_FOUND",HttpStatus.NOT_FOUND);
	}
}





