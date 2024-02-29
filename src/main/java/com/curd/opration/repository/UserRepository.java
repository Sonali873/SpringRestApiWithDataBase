package com.curd.opration.repository;
import org.springframework.data.repository.CrudRepository;

import com.curd.opration.model.User;
public interface UserRepository extends CrudRepository<User, Integer>
{
}
