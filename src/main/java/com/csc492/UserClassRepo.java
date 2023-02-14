package com.csc492;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserClassRepo extends CrudRepository<UserClass, Integer>{
	
	@Query(value="SELECT * FROM Users WHERE username = :username", nativeQuery = true)
	UserClass fetchUserByName(@Param("username") String username);

}
