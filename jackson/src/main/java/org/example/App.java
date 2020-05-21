package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String user = mapper.writeValueAsString((new User("dario","asaro",34,"31821923", LocalDate.now())));
        User userObj = mapper.readValue(user,User.class);
        System.out.println(userObj.toString());


    }
}
