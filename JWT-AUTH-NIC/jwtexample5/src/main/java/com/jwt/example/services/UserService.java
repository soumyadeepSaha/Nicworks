package com.jwt.example.services;


import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

  private List<User> store = new ArrayList<>();


  public UserService() {
      store.add(new User(UUID.randomUUID().toString(), "Dantee", "Dantee@gmail.com"));
      store.add(new User(UUID.randomUUID().toString(), "abhichek", "abhioshek@gmail.com"));
      store.add(new User(UUID.randomUUID().toString(), "rituraj", "rituraj@gmail.com"));
      store.add(new User(UUID.randomUUID().toString(), "Debajyoti", "Debajyoti@gmail.com"));

  }


   public List<User>getUsers(){
      return this.store;
   }


}
