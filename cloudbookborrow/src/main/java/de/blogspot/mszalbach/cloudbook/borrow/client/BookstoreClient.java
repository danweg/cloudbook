package de.blogspot.mszalbach.cloudbook.borrow.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient( value = "cloudbook-bookstore", fallback = BookstoreClientFallback.class )
public interface BookstoreClient {

    @GetMapping( value = "/books" )
    String getAllBooks();



}


