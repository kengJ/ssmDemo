package com.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.model.User;

public interface UserDao {
	List<User> FindUser();
	User FindUserById(@Param("id")Integer id);
	boolean AddUser(User user);
	boolean DelUser(Integer UserId);
	boolean UpdateUser(User user);
}
