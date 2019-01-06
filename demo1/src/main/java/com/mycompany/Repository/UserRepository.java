package com.mycompany.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mycompany.model.Users;

public interface UserRepository extends CrudRepository <Users, String>{

	Optional<Users> findByUsernameAndPassword(String eid, String password);
	public Iterable<Users> findAllByAgeGreaterThan(Integer age);
}
