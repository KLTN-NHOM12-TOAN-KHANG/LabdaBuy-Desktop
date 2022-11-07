package com.kltn.nhom12.LambdaBuyDesktop.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.kltn.SpringAPILambdaBuy.common.request.authen.LoginDto;
import com.example.kltn.SpringAPILambdaBuy.common.request.authen.RegisterDto;
import com.example.kltn.SpringAPILambdaBuy.common.response.ResponseCommon;
import com.example.kltn.SpringAPILambdaBuy.common.response.UserResponseDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kltn.nhom12.LambdaBuyDesktop.common.ConstantGlobal;

public class AuthenticationWebService {
	private RestTemplate restTemplate;
	private ObjectMapper mapper;
	
	public AuthenticationWebService() {
		restTemplate = new RestTemplate();
		mapper = new ObjectMapper();
	}
	
	public ResponseCommon register(RegisterDto registerDto) {
		String uri = ConstantGlobal.API_PARENT + "/authentication/register";
		ResponseEntity<ResponseCommon> response = restTemplate.postForEntity(uri, registerDto, ResponseCommon.class);
		return response.getBody();
	}
	
	public UserResponseDto login (LoginDto loginDto) {
		String uri = ConstantGlobal.API_PARENT + "/authentication/login";
		ResponseEntity<ResponseCommon> response = restTemplate.postForEntity(uri, loginDto, ResponseCommon.class);
		if(response.getBody().success) {
			UserResponseDto user = mapper.convertValue(response.getBody().data, new TypeReference<UserResponseDto>() {});
			return user;
		}
		return null;
	}
}
