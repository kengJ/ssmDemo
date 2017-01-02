package com.dao.impl;

import java.util.List;
import javax.annotation.Resource;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import com.dao.AdminDao;
import com.model.Admin;

@Repository
public class AdminDaoImpl implements AdminDao{

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<Admin> FindAdmin() {
		return sqlSessionTemplate.selectList("AdminMapper.FindAdmin");
	}

	@Override
	public Admin FineAdminById(Integer AdminId) {
		return sqlSessionTemplate.selectOne("AdminMapper.FindAdminById",AdminId);
	}

	@Override
	public boolean AddAdmin(Admin admin) {
		try {
			int result = sqlSessionTemplate.insert("AdminMapper.AddAdmin",admin);
			return result>0?true:false;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	@Override
	public boolean DelAdmin(Integer AdminId) {
		try {
			int result = sqlSessionTemplate.delete("AdminMapper.DelAdmin",AdminId);
			return result>0?true:false;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	@Override
	public boolean UpdateAdmin(Admin admin) {
		try {
			int result = sqlSessionTemplate.update("AdminMapper.UpdateAdmin",admin);
			return result>0?true:false;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

}
