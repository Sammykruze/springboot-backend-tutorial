package com.designerbackend.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.designerbackend.model.DesignerModel;
import com.designerbackend.repository.DesignerRepository;
import com.designerbackend.service.DesignerService;

@Service
@Transactional
public class DesignerServiceImpl implements DesignerService {
	
	@Autowired
	private DesignerRepository designerRepo;

	@Override
	public void saveDesigner(DesignerModel designer) {
		designerRepo.save(designer);
		
	}

}
