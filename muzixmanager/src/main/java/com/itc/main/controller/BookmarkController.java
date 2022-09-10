package com.itc.main.controller;
import java.util.List;
import java.util.stream.Collectors;

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

import com.itc.main.entity.Bookmark;
import com.itc.main.repository.BookmarkRepository;
import com.itc.main.service.BookmarkService;

@RestController
@RequestMapping("/api/")
public class BookmarkController {
	@Autowired
	private BookmarkService bookmarkService;
	@Autowired
	private BookmarkRepository bookmarkrepo;
	@PostMapping("saving")
	public ResponseEntity<Bookmark> saveBookmark(@RequestBody Bookmark bookmark) {
		this.bookmarkService.saveBookmark(bookmark);
		return new ResponseEntity<Bookmark>(bookmark, HttpStatus.CREATED);
	}
	
	@GetMapping("bookmarks")
	public ResponseEntity<List<Bookmark>> getAllBookmark() {
		List<Bookmark> list = this.bookmarkService.getAllBookmark();
		return new ResponseEntity<List<Bookmark>>(list,HttpStatus.OK);
			
	}
	@GetMapping("getbookmark/{songName}")
	public ResponseEntity<Bookmark> getBookmarkBysongName(@PathVariable String songName) {
		Bookmark bookmark = this.bookmarkService.getBookmarkBysongName(songName);
		if(bookmark!= null) {
			return new ResponseEntity<Bookmark>(bookmark,HttpStatus.OK);
		}
		else
			return new ResponseEntity<Bookmark>(HttpStatus.NOT_FOUND);
	}
	@GetMapping("getbookmarks/{id}")
	public ResponseEntity<Bookmark> getBookmarkById(@PathVariable int id) {
		Bookmark bookmark = this.bookmarkService.getBookmarkById(id);
		if(bookmark!= null) {
			return new ResponseEntity<Bookmark>(bookmark,HttpStatus.OK);
		}
		else
			return new ResponseEntity<Bookmark>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("delbookmark/{songName}")
	public ResponseEntity<String> deleteBookmarkBysongName(@PathVariable String songName) {
		boolean b = this.bookmarkService.deleteBookmarkBysongName(songName);
		if(b) {
			return new ResponseEntity<String>("DELETED SUCCESFULLY",HttpStatus.OK);
			
		}
		else 
			return new ResponseEntity<String>("NOT_FOUND",HttpStatus.NOT_FOUND);
	}
	@GetMapping("bookmarks/{userId}")
	public ResponseEntity<List<Bookmark>> getBookmarksByUserId(@PathVariable("userId") int userId){
		List<Integer> bIds =this.bookmarkrepo.getBookmarkByUserId(userId);
		List<Bookmark> bookmarks = bIds.stream().map((bookmark) -> bookmarkrepo.findById(bookmark).get()).collect(Collectors.toList());
		return new ResponseEntity<List<Bookmark>>(bookmarks, HttpStatus.OK);
	}
	
}
	
	


