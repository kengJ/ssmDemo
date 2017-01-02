package com.dao;

import java.util.List;
import com.model.Sex;

public interface SexDao {

	List<Sex> FindSex();
	Sex FindSexById(Integer id);
	boolean AddSex(String SexType);
	boolean DelSex(Integer id);
	boolean UpdateSex(Sex sex);
}
