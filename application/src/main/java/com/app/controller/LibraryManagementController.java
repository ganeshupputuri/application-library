package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.BookModel;
import com.app.repo.LibraryManagementRepo;

@Controller
public class LibraryManagementController {
  
	@Autowired
	private LibraryManagementRepo libraryManagementRepo;
	
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mv=new ModelAndView("home");
		return mv;
	}
	
	@GetMapping("/newbook")
	public ModelAndView newBook() {
		ModelAndView mv=new ModelAndView("newbook");
		return mv;
	}
	
	
	@PostMapping("/saveBook")
	public ModelAndView saveBook( BookModel bm) {
		
		ModelAndView mv=new ModelAndView("newbook");
		libraryManagementRepo.save(bm);
		mv.addObject("data", "Successfully Saved");
		return mv;
	}
	
	@GetMapping("/updateBook/{id}")
	public ModelAndView update(@PathVariable("id") Integer i) {
		ModelAndView mv=new ModelAndView("updatebook");
		mv.addObject("data", i);
		return mv;
	}
	
	@RequestMapping("/editBook")
	public String updateBook( BookModel bm) {
	   Optional<BookModel> b=	libraryManagementRepo.findById(bm.getBookId());

	   BookModel  bookModel=b.get();
	   bookModel.setBookName(bm.getBookName());
	   bookModel.setGenre(bm.getGenre());
	   bookModel.setQuantity(bm.getQuantity());
	   libraryManagementRepo.save(bookModel);
	   return "redirect:/getBooks";
	}
	
	@RequestMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable("id") Integer b) {

		libraryManagementRepo.deleteById(b);
		return "redirect:/getBooks";
		
	}
	
	@GetMapping("/getBooks")
	public ModelAndView getBooks() {
		ModelAndView mv=new ModelAndView("getbooks");
		mv.addObject("data", libraryManagementRepo.findAll());
		return mv;
	}
	
	@GetMapping("/getByType")
	public ModelAndView getByType(@RequestParam("genre") String g){
		
		ModelAndView mv=new ModelAndView("getbooks");
		mv.addObject("data", libraryManagementRepo.findByGenre(g));
		return mv;
	}
	
}
