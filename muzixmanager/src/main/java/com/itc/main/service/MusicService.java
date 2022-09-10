package com.itc.main.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itc.main.repository.MusicRepository;
import com.itc.main.entity.Music;
import java.util.List;
import java.util.Optional;

@Service
public class MusicService {
	@Autowired
	private MusicRepository musicRepository;
	public void saveMusic(Music music) {
		this.musicRepository.save(music);
	}
	public List<Music> getAllMusic(){
		List<Music> list=this.musicRepository.findAll();
		return list;
		
	}
	public Music getMusicBysongName(String songName) {
		Optional<Music> op=this.musicRepository.findBysongName(songName);
		if(op.isPresent()) {
			return op.get();
		}else
			return null;
	}
	public Music getMusicBysingerName(String singerName) {
		Optional<Music> op=this.musicRepository.findBysingerName(singerName);
		if(op.isPresent()) {
			return op.get();
		}else
			return null;
	}
	public Music getMusicBysongId(int songId) {
		Optional<Music> op=this.musicRepository.findBysongId(songId);
		if(op.isPresent()) {
			return op.get();
		}else
			return null;
	}
	public boolean deleteMusicById(int id) {
		this.musicRepository.deleteById(id);
		return true;
	}
	
	
	

}
