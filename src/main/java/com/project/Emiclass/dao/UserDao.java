package com.project.Emiclass.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Emiclass.model.User;

public interface UserDao extends JpaRepository<User,Integer> {
	public List<User> findAll();
	public User findByMatricule(int matricule);
	
}
