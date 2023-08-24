package com.sql.Sqlproject;

import java.util.List;
import java.net.URI;
import org.aspectj.apache.bcel.Repository;
import org.hibernate.mapping.PrimaryKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
//@RequestMapping("/prabhu")
public class TwoController {
	
//	@Autowired 
//	ThreeService primaryservice;
	
	private Res res;
	@GetMapping("/nav")
	public List<details5> getpData(){
		return res.findAll();
	}

}
