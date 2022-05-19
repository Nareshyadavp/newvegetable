package com.vbmart.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vbmart.dto.UserDTO;
import com.vbmart.dto.VegetableDTO;
import com.vbmart.exception.BadRequestException;
import com.vbmart.model.User;
import com.vbmart.repository.UserRepository;
import com.vbmart.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDTO saveUser(UserDTO userDTO) {
		
		User user=modelMapper.map(userDTO, User.class);
		user=userRepository.save(user);
		return modelMapper.map(user, UserDTO.class);
	}

	@Override
	public UserDTO findByUserId(long userId) throws BadRequestException {
		// TODO Auto-generated method stub
		return null;
	}

}
