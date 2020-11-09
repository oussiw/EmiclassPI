package com.project.Emiclass.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.project.Emiclass.dao.UserDao;
import com.project.Emiclass.model.User;

@CrossOrigin
@RestController

public class UserController {
	
	@Autowired
	private UserDao userdao;
	
	
	
	@GetMapping(value ="/index")
	public String getLoginPage(Model model) {
		model.addAttribute("user",new User());
		return "session";
	}
	
	
	@GetMapping(value="/users")
	public List<User> listeUsers(){
		return userdao.findAll();
	}
	
	@GetMapping(value="/users/{matricule}")
	public User afficherUser(@PathVariable int matricule) {
		List<User> user = new ArrayList<User>();
		
		return userdao.findByMatricule(matricule);
		
	}
	
	
	@GetMapping(value="/users/info")
	@ResponseBody
	public User infoUser(@RequestParam int matricule) {
		return userdao.findByMatricule(matricule);
	}
	
		
	
}
