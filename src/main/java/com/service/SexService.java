package com.service;

import java.util.List;

import com.model.Sex;

public interface SexService {

	public boolean AddSex(String SexType);
	public boolean DelSex(Integer SexId);
	public boolean UpdateSex(Sex sex);
	public List<Sex> findSex();
	public Sex findSexById(Integer SexId);
}
