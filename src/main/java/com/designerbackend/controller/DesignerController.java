package com.designerbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.designerbackend.model.DesignerModel;
import com.designerbackend.repository.DesignerRepository;
import com.designerbackend.service.DesignerService;

@RestController
public class DesignerController {
	
	@Autowired
	private DesignerService designerService;
	
	@Autowired
	DesignerRepository designerRepo;

	@PostMapping("/adddesignerwear")
	public ResponseEntity <Object> adddesignerwear(
			@RequestBody DesignerModel  designer){
		designerService.saveDesigner(designer);
		return ResponseEntity.status(HttpStatus.OK).body("success");
	}
	
	
	@GetMapping("/getdesignerwear")
	public ResponseEntity<Object> getdesignerwear(){
		return ResponseEntity.status(HttpStatus.OK).body(designerRepo.findAll());
	}
	
}
