package com.service.impl;

import javax.annotation.Resource;

import com.dao.BaseDao;
import com.model.Product;
import com.service.ProductService;

public class ProductServiceImpl implements ProductService{

	@Resource(name="baseDao")
    private BaseDao baseDao;
	
	@Override
	public void saveObj(Product p) {
		// TODO Auto-generated method stub
		if(p != null){
            baseDao.saveObject("ProductMapper.insertProductSql", p);
        }
	}

}
