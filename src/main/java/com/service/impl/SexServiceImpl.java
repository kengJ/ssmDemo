package com.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.dao.SexDao;
import com.model.Sex;
import com.service.SexService;

@Service
public class SexServiceImpl implements SexService{

	@Resource
	private SexDao sexDao;
	
	@Override
	public boolean AddSex(String SexType) {
		return sexDao.AddSex(SexType);
	}

	@Override
	public boolean DelSex(Integer SexId) {
		return sexDao.DelSex(SexId);
	}

	@Override
	public boolean UpdateSex(Sex sex) {
		return sexDao.UpdateSex(sex);
	}

	@Override
	public List<Sex> findSex() {
		return sexDao.FindSex();
	}

	@Override
	public Sex findSexById(Integer SexId) {
		return sexDao.FindSexById(SexId);
	}

}
