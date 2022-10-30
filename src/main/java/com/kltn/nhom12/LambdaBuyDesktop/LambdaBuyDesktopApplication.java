package com.kltn.nhom12.LambdaBuyDesktop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.example.kltn.SpringAPILambdaBuy.common.request.LoginDto;
import com.example.kltn.SpringAPILambdaBuy.common.request.RegisterDto;
import com.example.kltn.SpringAPILambdaBuy.common.response.ResponseCommon;
import com.example.kltn.SpringAPILambdaBuy.common.response.UserResponseDto;
import com.example.kltn.SpringAPILambdaBuy.entities.UserEntity;
import com.example.kltn.SpringAPILambdaBuy.entities.UserRole;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kltn.nhom12.LambdaBuyDesktop.service.AuthenticationWebService;
import com.kltn.nhom12.LambdaBuyDesktop.service.UserWebService;

@SpringBootApplication
public class LambdaBuyDesktopApplication {
	public static UserWebService userWebService = new UserWebService();
	public static AuthenticationWebService authenticationWebService = new AuthenticationWebService();
	
	public static void main(String[] args) {
		SpringApplication.run(LambdaBuyDesktopApplication.class, args);
	
		List<UserResponseDto> list = userWebService.getAllUser();
		for (UserResponseDto userResponseDto : list) {
			System.out.println(userResponseDto);
			System.out.println(userResponseDto.getId());
		}
		
		UserResponseDto userId = userWebService.getUserById("74346d70-d551-4075-bf8a-dc57e847c882");
		System.out.println(userId.getUsername() + " - " + userId.getEmail() + "-" + userId.getCreatedDate());
		
		UserResponseDto user = userWebService.getUserByUsername("vantoan");
		System.out.println(user.getUsername() + " - " + user.getEmail());
		
		UserResponseDto userMail = userWebService.getUserByEmail("vantoan10c2@gmail.com");
		System.out.println(userMail.getUsername() + " - " + userMail.getEmail());
		
//		RegisterDto register = new RegisterDto("Toan", "Le", "lvtoan.it2000@gmail.com", "lvtoan", "123123", "123123");
//		System.out.println(authenticationWebService.register(register));
//		LoginDto login = new LoginDto();
//		login.setEmail("lvtoan.it2000@gmail.com");
//		login.setPassword("123123");
//		System.out.println(authenticationWebService.login(login));;
//		UserEntity createUser = new UserEntity("lvtoancv", "lvtoan.cv@gmail.com", "123123", UserRole.CUSTOMER, new Date(), "Toan cv");
//		System.out.println(userWebService.saveUser(createUser));
//		System.out.println(userWebService.deteleUserById("74346d70-d551-4075-bf8a-dc57e847c882"));
		
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
