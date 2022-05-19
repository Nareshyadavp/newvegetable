package com.vbmart.service;

import org.springframework.stereotype.Service;

import com.vbmart.dto.VegetableDTO;
import com.vbmart.exception.BadRequestException;

@Service
public interface VegetableService {
	 VegetableDTO saveVegetable(VegetableDTO vegetableDTO);
		

	  VegetableDTO findByVegetableId(long vegetableId) throws BadRequestException ;

}
