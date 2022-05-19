package com.vbmart.service;

 
import org.springframework.stereotype.Service;

import com.vbmart.dto.VcartVegetablesDTO;

@Service
public interface VcartVegetablesService {

VcartVegetablesDTO 	addCartItems (VcartVegetablesDTO vcartVegetablesDTO);

}
