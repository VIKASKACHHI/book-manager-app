package main.java.com.example.bookmanager.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bookmanager.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
