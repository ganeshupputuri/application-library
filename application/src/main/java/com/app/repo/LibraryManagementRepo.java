package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.BookModel;

@Repository
public interface LibraryManagementRepo extends JpaRepository<BookModel, Integer>{

	   List<BookModel> findByGenre(String genre);

}
