package com.dao.impl;

import java.util.List;
import javax.annotation.Resource;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.dao.SexDao;
import com.model.Sex;

@Repository
public class SexDaoImpl implements SexDao{

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<Sex> FindSex() {
		return sqlSessionTemplate.selectList("SexMapper.FindSex");
	}

	@Override
	public Sex FindSexById(Integer id) {
		return sqlSessionTemplate.selectOne("SexMapper.FindSexById", id);
	}

	@Override
	public boolean AddSex(String SexType) {
		Sex s = new Sex();
		s.setSexType(SexType);
		try{
			int result = sqlSessionTemplate.insert("SexMapper.AddSex", SexType);
			if(result>0){
				return true;
			}else{
				return false;
			}
		}catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	@Override
	public boolean DelSex(Integer id) {
		try {
			int result = sqlSessionTemplate.delete("SexMapper.DelSex", id);
			if(result>0){
				return true;
			}else{
				return false;
			}
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	@Override
	public boolean UpdateSex(Sex sex) {
		try {
			int result = sqlSessionTemplate.update("SexMapper.UpdateSex", sex);
			if(result>0){
				return true;
			}else{
				return false;
			}
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
}
