package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;

public interface ISpecimenService {

	SpecimenDTO fetchID(int id);

	void save(SpecimenDTO specimenDTO);

}