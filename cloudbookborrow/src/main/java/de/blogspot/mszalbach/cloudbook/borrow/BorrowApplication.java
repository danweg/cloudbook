package de.blogspot.mszalbach.cloudbook.borrow;

import de.blogspot.mszalbach.cloudbook.borrow.client.BookstoreClient;
import de.blogspot.mszalbach.cloudbook.borrow.client.BookstoreClientFallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class BorrowApplication {

    public static void main( String[] args ) {
        SpringApplication.run( BorrowApplication.class, args );
    }



    @Bean
    public BookstoreClient bookstoreClient() {
        return new BookstoreClientFallback();
    }

}
