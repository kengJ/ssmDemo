package com.service;

import java.util.List;

import com.model.Admin;

public interface AdminService {

	List<Admin> FindAdmin();
	Admin FineAdminById(Integer AdminId);
	boolean AddAdmin(Admin admin);
	boolean DelAdmin(Integer AdminId);
	boolean UpdateAdmin(Admin admin);
	boolean LoginAdmin(Admin admin);
}
