package com.vbmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vbmart.dto.UserDTO;
import com.vbmart.dto.VegetableDTO;
import com.vbmart.service.UserService;
import com.vbmart.service.VegetableService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/createuser")
	public ResponseEntity<UserDTO> saveUserDetails(@RequestBody UserDTO userDTO) {
		return new ResponseEntity<>(userService.saveUser(userDTO), HttpStatus.CREATED);

	}

}
