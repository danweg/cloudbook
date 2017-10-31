package de.blogspot.mszalbach.cloudbook.users.domain;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersRepository {

    @GetMapping( "users" )
    public List<BookUser> getAllUser() {
        List<BookUser> users = new ArrayList<>();
        users.add( new BookUser( "ms" ) );
        users.add( new BookUser( "dw" ) );

        return users;
    }
}
