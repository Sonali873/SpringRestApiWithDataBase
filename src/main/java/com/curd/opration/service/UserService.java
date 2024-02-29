package com.curd.opration.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curd.opration.model.User;
import com.curd.opration.repository.UserRepository;

@Service
public class UserService 
{
@Autowired
UserRepository userRepository;

public List<User> getAllUser() 
{
List<User> user = new ArrayList<User>();
userRepository.findAll().forEach(books1 -> user.add(books1));
return user;
}

public User getUserById(int id) 
{
return userRepository.findById(id).get();
}

public void createUser(User user) 
{
userRepository.save(user);
}
public void delete(int id) 
{
userRepository.deleteById(id);;
}


public void update(User user, int id) 
{
userRepository.save(user);
}
}