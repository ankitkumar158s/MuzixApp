package com.itc.main.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.itc.main.entity.Bookmark;

import java.util.List;
@Repository
public interface BookmarkRepository extends JpaRepository<Bookmark,Integer>{

	Optional<Bookmark> findBysongName(String songName);

	

	int deleteBysongName(String songName);
    
    @Query("SELECT songId FROM Bookmark u WHERE u.userId= :userId")
	public List<Integer> getBookmarkByUserId(@Param("userId") Integer userId);
	
		
}
