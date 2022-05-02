package com.pragim.SpringBootWithRestAPIS.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pragim.SpringBootWithRestAPIS.entity.Product;
import com.pragim.SpringBootWithRestAPIS.repos.ProductRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/product")
@Api(value="productmgtsystem", description="Operations pertaining to products in Online Store")
public class ProductController {
	
	
	@Autowired
	private ProductRepository productRepository;
	
	
	
	@GetMapping(path = "/health")
	public String sayHello() {
		return "hello!WElcome";
	}
	
	//addProduct
	@ApiOperation(value = "To Add a new product",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(path = "/addproduct")
	public Map<String,String> addProduct(@RequestBody Product product) {
		productRepository.save(product);
		Map<String,String> map = new HashMap<String,String>();
		map.put("msg", "added successfully!");
		return map;
	}
	
	
	//updateProduct
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping(path = "/updateproduct",consumes = MediaType.APPLICATION_JSON_VALUE,produces =MediaType.APPLICATION_JSON_VALUE )
	public Map<String,String> updateProduct(@RequestBody Product product) {
		Product product2 = productRepository.findById(product.getId()).get();
		if(product2!=null) {
			product2.setProductName(product.getProductName());
			product2.setPrice(product.getPrice());
			productRepository.save(product2);
		}
		Map<String,String> map = new HashMap<String,String>();
		map.put("msg", "updated");
		return map;
	}
	
	
	 @ApiOperation(value = "View a list of available products",response = Iterable.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 200, message = "Successfully retrieved list"),
	            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	    }
	    )
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = "/list")
	public List<Product> selectAllProducts() {
		List<Product> list = productRepository.findAll();
		return list;
	}
	
	//class.forName
	//dm.getConn
	//ps
	//executeUpdate/executQuecuteQuery
	
	
	
	//pathparam and requestParam
	
	//deleteProduct
	 @CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping(path = "/delete/{id}")
	public Map<String,String> deleteProduct(@PathVariable(name = "id") String id) {
		
		 Optional<Product> findById = productRepository.findById(Integer.parseInt(id));
		 
		
		if( findById.isPresent()) {
			productRepository.deleteById(Integer.parseInt(id));
		}
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("msg", "deleted successfully");
		return map;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = "/getproduct/{id}")
	public Product getProduct(@PathVariable(name = "id") String id) {
		
		 Optional<Product> findById = productRepository.findById(Integer.parseInt(id));
		if( findById.isPresent()) {
			return findById.get();
		}else {
			return null;
		}
	}
	
	

}
