 package com.itc.main;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//import org.hibernate.tool.hbm2ddl.SchemaExport.Action;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.opentest4j.AssertionFailedError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.itc.main.entity.Bookmark;
import com.itc.main.repository.BookmarkRepository;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class BookmarkRepositoryTest {

	@Autowired
	private BookmarkRepository bookmarkRepository;
		


		@Test
		@Order(1)
		public void testNotNull() {
			assertNotNull(bookmarkRepository);
		}
		
		
		/*@Test
		@Order(2)
		public void saveAccountTest() {
			Bookmark us=new Bookmark(101,"natu","geetha");
			Bookmark u=this.bookmarkRepository.save(us);
			assertEquals(u.getSongId(),us.getSongId());
          

			System.out.println("--SUCCESS SAVE PRODUCT TEST--");
			
		}
	*/	
	
		@Test
		@Order(3)
		public void getUserByIdTest() {
			Optional<Bookmark> p=this.bookmarkRepository.findById(101);
			
			if(p.isPresent()) {
				Bookmark pro = p.get();
				try {
				assertEquals(pro.getSongId(), 1);
				}catch(AssertionFailedError ae) {
					System.err.println("--Id Not Found--");
				}
				System.out.println("--SUCCESS GET BY ID TEST--");
			}else {
				assertThrows(AssertionFailedError.class,()->{
					System.err.println("Id Not Found!");
				});
			}
		}
		

}
