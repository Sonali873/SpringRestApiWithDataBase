package com.curd.opration.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curd.opration.model.User;
import com.curd.opration.service.UserService;


@RestController
@CrossOrigin({"*"})
public class UserController 
{

@Autowired
UserService userService;
 
@GetMapping("/user")
private List<User> getAllUser() 
{
return userService.getAllUser();
}

@GetMapping("/userbyid/{id}")
private User getUser(@PathVariable("id") int id) 
{
return userService.getUserById(id);
}


@PostMapping("/adduser")
private User saveUser(@RequestBody User user) 
{
userService.createUser(user);
return user;
}

@PutMapping("/updateuser/{id}")
private User update(@RequestBody User user ,@PathVariable("id")int id) 
{
userService.update(user, id);
return user;
}

@DeleteMapping("/deleteuser/{id}")
private void delete(@PathVariable("id") int id) 
{
userService.delete(id);
}
}
