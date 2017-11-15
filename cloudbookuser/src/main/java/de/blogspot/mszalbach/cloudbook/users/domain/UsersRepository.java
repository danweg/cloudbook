package de.blogspot.mszalbach.cloudbook.users.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.CompositePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

// to refresh the scope and to trigger reloading the config, you need an empty POST request to "/refresh"
@RestController
@RefreshScope
public class UsersRepository {

    @Value( "${defaultUser:NoDefaultUserSet}" )
    private String defaultUser;

    @Value( "${superUser:NoSuperUserSet}" )
    private String superUser;

    @Value( "${testUser:NoTestUserSet}" )
    private String testUser;

    @Autowired
    private Environment env;



    @GetMapping( "properties" )
    public Properties getProperties() {
        Properties props = new Properties();
        CompositePropertySource bootstrapProperties = ( CompositePropertySource )( ( AbstractEnvironment )env )
                .getPropertySources().get( "bootstrapProperties" );
        for ( String propertyName : bootstrapProperties.getPropertyNames() ) {
            props.put( propertyName, bootstrapProperties.getProperty( propertyName ) );
        }

        return props;
    }



    @GetMapping( "users" )
    public List<BookUser> getAllUser() {
        List<BookUser> users = new ArrayList<>();
        users.add( new BookUser( "ms" ) );
        users.add( new BookUser( "dw" ) );
        users.add( new BookUser( defaultUser ) );
        users.add( new BookUser( superUser ) );
        users.add( new BookUser( testUser ) );

        return users;
    }
}