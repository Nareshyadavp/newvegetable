package com.vbmart.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vbmart.dto.VcartVegetablesDTO;
import com.vbmart.model.VcartVegetables;
import com.vbmart.repository.VcartVegetablesRepository;
import com.vbmart.service.VcartVegetablesService;

@Service
public class VcartVegetablesServiceImpl implements VcartVegetablesService{
	
	@Autowired
	private VcartVegetablesRepository vcartVegetablesRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public VcartVegetablesDTO addCartItems(VcartVegetablesDTO vcartVegetablesDTO) {
		VcartVegetables vcartVegetables=modelMapper.map(vcartVegetablesDTO, VcartVegetables.class);
		vcartVegetables=vcartVegetablesRepository.save(vcartVegetables);
		return modelMapper.map(vcartVegetables, VcartVegetablesDTO.class);
		
			
 	}
}
