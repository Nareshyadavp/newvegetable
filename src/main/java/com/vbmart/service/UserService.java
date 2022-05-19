package com.vbmart.service;

import org.springframework.stereotype.Service;

import com.vbmart.dto.UserDTO;
import com.vbmart.exception.BadRequestException;

@Service
public interface UserService {
	
	 UserDTO saveUser(UserDTO userDTO);
		

	 UserDTO findByUserId(long userId) throws BadRequestException;


}
