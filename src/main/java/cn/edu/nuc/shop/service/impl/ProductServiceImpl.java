package cn.edu.nuc.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.nuc.shop.dao.ProductMapper;
import cn.edu.nuc.shop.entiry.Product;
import cn.edu.nuc.shop.service.interfaces.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;
	
	
	public List<Product> listProduct() {
		
	    return	productMapper.listProduct();
	}


	public int addProduct(Product product) {
		
		return productMapper.insert(product);
	}


	public int deleteProduct(Product product) {
		
		
		return productMapper.deleteByPrimaryKey(product.getPid());
	}


	public Product findById(int pid) {
		
		return productMapper.selectByPrimaryKey(pid);
	}


	public int updateProduct(Product product) {
		
		return productMapper.updateByPrimaryKey(product);
	}


	public List<Product> findByName(String pname) {
		
		return productMapper.findByPname(pname);
	}


	public List<Product> frontlistNew() {
		
		return productMapper.frontlistNew();
	}


	public List<Product> frontlistHot() {
		
		return productMapper.frontlistHot();
	}
	
	


}
