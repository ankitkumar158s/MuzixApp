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

import com.itc.main.entity.Music;
import com.itc.main.service.MusicService;
@RestController
@RequestMapping("/api/")
public class MusicController {
		@Autowired
		private MusicService musicService;
		
		@PostMapping("save")
		public ResponseEntity<Music> saveMusic(@RequestBody Music music) {
			this.musicService.saveMusic(music);
			return new ResponseEntity<Music>(music, HttpStatus.CREATED);
		}
		
		@GetMapping("musics")
		public ResponseEntity<List<Music>> getAllMusic() {
			List<Music> list = this.musicService.getAllMusic();
			return new ResponseEntity<List<Music>>(list,HttpStatus.OK);
				
		}
		@GetMapping("getmusic/{songName}")
		public ResponseEntity<Music> getMusicBysongName(@PathVariable String songName) {
			Music music = this.musicService.getMusicBysongName(songName);
			if(music!= null) {
				return new ResponseEntity<Music>(music,HttpStatus.OK);
			}
			else
				return new ResponseEntity<Music>(HttpStatus.NOT_FOUND);
		}
		
		@GetMapping("getmusics/{singerName}")
		public ResponseEntity<Music> getMusicBysingerName(@PathVariable String singerName) {
			Music music = this.musicService.getMusicBysingerName(singerName);
			if(music!= null) {
				return new ResponseEntity<Music>(music,HttpStatus.OK);
			}
			else
				return new ResponseEntity<Music>(HttpStatus.NOT_FOUND);
		}
		@GetMapping("getmusicsid/{songId}")
		public ResponseEntity<Music> getMusicBysongId(@PathVariable int songId) {
			Music music = this.musicService.getMusicBysongId(songId);
			if(music!= null) {
				return new ResponseEntity<Music>(music,HttpStatus.OK);
			}
			else
				return new ResponseEntity<Music>(HttpStatus.NOT_FOUND);
		}
		
		@DeleteMapping("delmusic/{id}")
		public ResponseEntity<String> deleteMusicById(@PathVariable int id) {
			boolean b = this.musicService.deleteMusicById(id);
			if(b) {
				return new ResponseEntity<String>("DELETED SUCCESFULLY",HttpStatus.OK);
				
			}
			else 
				return new ResponseEntity<String>("NOT_FOUND",HttpStatus.NOT_FOUND);
		}
	}


