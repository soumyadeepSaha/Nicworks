package com.jwt.example.jwtExample3.services;
import com.jwt.example.jwtExample3.models.User;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service//we have annoted that with the service annotation by which it can be auto wired
public class UserService {

    private List<User> store = new ArrayList<>();

    //when the object will be created of this service
    // then the default constructor will run

    public  UserService(){
         // we will intitalize few objects
        store.add(new User(UUID.randomUUID().toString(),"Dantee","Dantee@gmail.com") );
        store.add(new User(UUID.randomUUID().toString(),"abhichek","abhioshek@gmail.com") );
        store.add(new User(UUID.randomUUID().toString(),"rituraj","rituraj@gmail.com") );
        store.add(new User(UUID.randomUUID().toString(),"Debajyoti","Debajyoti@gmail.com") );
    }
    //when the object will be created ffor the above these users will be created on the fly

    public List<User> getUsers(){
        return this.store; //store is actually list of users

    }
}
