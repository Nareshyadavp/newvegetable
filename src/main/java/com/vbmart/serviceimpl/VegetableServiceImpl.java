package com.vbmart.serviceimpl;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vbmart.dto.CustomerDTO;
import com.vbmart.dto.VegetableDTO;
import com.vbmart.exception.BadRequestException;
import com.vbmart.model.Customer;
import com.vbmart.model.Vegetable;
import com.vbmart.repository.VegetableRepository;
import com.vbmart.service.VegetableService;

@Service
public class VegetableServiceImpl implements VegetableService{

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private VegetableRepository vegetableRepository;

	@Override
	@Transactional
	public VegetableDTO saveVegetable(VegetableDTO vegetableDTO) {
		
	Vegetable vegetable=modelMapper.map(vegetableDTO, Vegetable.class);
		vegetable=vegetableRepository.save(vegetable);
		return modelMapper.map(vegetable, VegetableDTO.class);
		
	}

	@Override
	public VegetableDTO findByVegetableId(long vegetableId) throws BadRequestException {
		
		VegetableDTO vegetableDTO=null;
		Vegetable vegetable =vegetableRepository.findByVegetableId(vegetableId);
		if(vegetable !=null) {
			vegetableDTO=modelMapper.map(vegetable, VegetableDTO.class);
		}
		return vegetableDTO;
	}

}
