package com.vbmart.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.vbmart.dto.VegetableDTO;
import com.vbmart.service.VegetableService;

@RunWith(SpringRunner.class)
public class VegetableControllerTest {
	

	@Mock
	private VegetableService vegetableService;
	
	@InjectMocks
	private VegetableController vegetableControllerMock;
	
	@Test
	public void saveVegaetbleTest() {
	
	
	VegetableDTO vegetableDTO=new VegetableDTO();
	vegetableDTO.setVegetableId(1);
	vegetableDTO.setVegetableName("tomato");
	when(vegetableService.saveVegetable(vegetableDTO)).thenReturn(vegetableDTO);
	ResponseEntity<VegetableDTO> responseEntity=vegetableControllerMock.saveVegaetble(vegetableDTO);
	assertEquals(HttpStatus.CREATED.value(), responseEntity.getStatusCodeValue());
	}

}
