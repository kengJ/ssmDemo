package com.dao;

import javax.annotation.Resource;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
@Repository("baseDao")
public class BaseDaoImpl implements BaseDao{

	@Resource
    private SqlSessionTemplate sqlSession;
	
	@Override
	public void saveObject(String sql, Object obj) {
		// TODO Auto-generated method stub
		sqlSession.insert(sql, obj);
	}

}
