package com.sql.Sqlproject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Res extends JpaRepository<details5, Integer> {
//details normally the model class name
	//Integer is what type we keep the Id in bean class we can keep name also at the time we shpu
	//Should change it as String or datatype of name
	//public details5 findAll(details5 Integer);
}
