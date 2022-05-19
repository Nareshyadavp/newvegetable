package com.vbmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vbmart.dto.VcartVegetablesDTO;
import com.vbmart.service.VcartVegetablesService;

@RestController
@RequestMapping("/api/v1/vegetable")
public class VcartVegetablesController {

	@Autowired
	private VcartVegetablesService vcartVegetablesService;

	@PostMapping("/vcardscreate")
	public ResponseEntity<VcartVegetablesDTO> addCart(@RequestBody VcartVegetablesDTO vcartVegetablesDTO) {
		return new ResponseEntity<>(vcartVegetablesService.addCartItems(vcartVegetablesDTO), HttpStatus.CREATED);
	}
}
