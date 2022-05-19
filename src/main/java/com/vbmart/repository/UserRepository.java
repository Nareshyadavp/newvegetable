package com.vbmart.repository;

import org.springframework.data.repository.CrudRepository;

import com.vbmart.dto.UserDTO;
import com.vbmart.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
User save(UserDTO userDTO);
	
	User findByUserId(long userId);

}
