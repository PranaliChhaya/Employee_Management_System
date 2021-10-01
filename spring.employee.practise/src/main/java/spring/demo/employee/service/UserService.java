package spring.demo.employee.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import spring.demo.employee.dto.UserRegistrationDto;
import spring.demo.employee.model.User;


public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
