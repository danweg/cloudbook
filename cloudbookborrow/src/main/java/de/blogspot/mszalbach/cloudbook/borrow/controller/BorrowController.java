package de.blogspot.mszalbach.cloudbook.borrow.controller;

import de.blogspot.mszalbach.cloudbook.borrow.client.BookstoreClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BorrowController {

    @Autowired
    BookstoreClient bookClient;



    @GetMapping( "/borrow" )
    public String borrow() {
        return bookClient.getAllBooks();
    }

}
