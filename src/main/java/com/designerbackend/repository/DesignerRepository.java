package com.designerbackend.repository;

import org.springframework.data.repository.CrudRepository;

import com.designerbackend.model.DesignerModel;

public interface DesignerRepository extends CrudRepository<DesignerModel, Long> {}


