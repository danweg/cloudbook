package de.blogspot.mszalbach.cloudbook.borrow.client;

import org.springframework.stereotype.Component;

@Component
public class BookstoreClientFallback implements BookstoreClient{

    @Override
    public String getAllBooks() {
        return "no books";
    }
}
