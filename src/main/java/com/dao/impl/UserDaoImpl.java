package com.dao.impl;

import java.util.List;
import javax.annotation.Resource;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import com.dao.UserDao;
import com.model.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<User> FindUser() {
		return sqlSessionTemplate.selectList("UserMapper.FindUser");
	}

	@Override
	public User FindUserById(Integer id) {
		return sqlSessionTemplate.selectOne("UserMapper.FindUserById",id);
	}

	@Override
	public boolean AddUser(User user) {
		try {
			int result = sqlSessionTemplate.insert("UserMapper.AddUser", user);
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
	public boolean DelUser(Integer UserId) {
		try {
			int result = sqlSessionTemplate.delete("UserMapper.DelUser");
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
	public boolean UpdateUser(User user) {
		try {
			int result = sqlSessionTemplate.update("UserMapper.UpdateUser");
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
