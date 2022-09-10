package com.itc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.itc.main.entity.AuthRequest;
import com.itc.main.entity.User;
import com.itc.main.service.UserService;
import com.itc.main.util.JwtUtil;
import com.itc.main.vo.Bookmark;

import com.itc.main.vo.UserBookmarks;
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/")
    public String welcome() {
        return "Hello world";
    }
   

	 @PostMapping("/authenticate")
	 public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
		 try {
	            authenticationManager.authenticate(
	                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
	            );
	            
	        } catch (Exception ex) {
	            throw new Exception("inavalid username/password");
	        }
	        return jwtUtil.generateToken(authRequest.getUserName());
	    }
	    
	 @PostMapping("/save")
	 public ResponseEntity<User> save(@RequestBody User user){
		 System.out.println("---User Controller---");
		 User u=this.userService.save(user);
	     return new ResponseEntity<User>(u, HttpStatus.CREATED);
		}
	 
	 @GetMapping("/{userId}")
	 public User findUserById(@PathVariable("userId") int userId) {
		 return this.userService.findById(userId);
	}
	 
	 @GetMapping("/{userId}/bookmarks")
	 public ResponseEntity<UserBookmarks> getBookmarksByUser(@PathVariable("userId") int userId){
		 User user=this.userService.findById(userId);
		 Bookmark[] bookmarks=restTemplate.getForObject("http://localhost:9191/api/bookmarks/"+ Integer.toString(userId),Bookmark[].class);
		 UserBookmarks userbookmarks=new UserBookmarks();
		 userbookmarks.setUser(user);
		userbookmarks.setBookmark(bookmarks);
		
		return new ResponseEntity<UserBookmarks>(userbookmarks,HttpStatus.OK);
	 }
	 

	 
}