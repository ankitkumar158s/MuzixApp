package com.itc.main.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.itc.main.entity.Playlists;
@Repository
public interface PlaylistsRepository extends JpaRepository<Playlists,Integer> {

	Optional<Playlists> findBysongName(String songName);

	Optional<Playlists> findBysingerName(String singerName);

	Optional<Playlists> findByplaylistName(String playlistName);

	Optional<Playlists> findBysongId(int songId);

	int deleteBysongId(int songId);

}
