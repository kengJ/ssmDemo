package com.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.dao.AdminDao;
import com.model.Admin;
import com.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{

	@Resource
	private AdminDao adminDao;
	
	@Override
	public List<Admin> FindAdmin() {
		return adminDao.FindAdmin();
	}

	@Override
	public Admin FineAdminById(Integer AdminId) {
		return adminDao.FineAdminById(AdminId);
	}

	@Override
	public boolean AddAdmin(Admin admin) {
		return adminDao.AddAdmin(admin);
	}

	@Override
	public boolean DelAdmin(Integer AdminId) {
		return adminDao.DelAdmin(AdminId);
	}

	@Override
	public boolean UpdateAdmin(Admin admin) {
		return adminDao.UpdateAdmin(admin);
	}

}
