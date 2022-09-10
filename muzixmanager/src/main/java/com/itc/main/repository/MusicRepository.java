package com.itc.main.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.itc.main.entity.Music;

@Repository
public interface MusicRepository extends JpaRepository<Music,Integer>{

	

	java.util.Optional<Music> findBysongName(String songName);

	Optional<Music> findBysingerName(String singerName);

	Optional<Music> findBysongId(int songId);
    int deleteBysongId(int songId);


	

	

	

}
