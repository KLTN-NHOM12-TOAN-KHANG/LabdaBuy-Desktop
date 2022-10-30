package com.kltn.nhom12.LambdaBuyDesktop.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.kltn.SpringAPILambdaBuy.common.response.ResponseCommon;
import com.example.kltn.SpringAPILambdaBuy.common.response.UserResponseDto;
import com.example.kltn.SpringAPILambdaBuy.entities.UserEntity;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeBase;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.kltn.nhom12.LambdaBuyDesktop.common.ConstantGlobal;

@Service
public class UserWebService  {
	private RestTemplate restTemplate;
	private ObjectMapper mapper;
	
	public UserWebService() {
		restTemplate = new RestTemplate();
		mapper = new ObjectMapper();
	}
	
	/**
	 * ObjectMapper mapper = new ObjectMapper();
		ResponseCommon response = userWebService.getAllUser();
		System.out.println(response);
	=>  ResponseCommon [success=true, code=200, message=FIND_ALL_USER_SUCCESS, errorMessage=null, data=[{id=74346d70-d551-4075-bf8a-dc57e847c882, email=vantoan10c2@gmail.com, username=vantoan, password=$2a$10$rxU2WrfrQ6ukYC7e4QUCVO/okHStgnX1AJ3pCidSe1FHrIlmr.ghi, role=CUSTOMER, createdDate=2022-10-28T16:34:45.000+00:00, createdBy=Toan Le, updatedDate=null, updatedBy=null}]]
		List<UserResponseDto> users = (List<UserResponseDto>) response.getData();
		System.out.println(users);
	=>  [{id=74346d70-d551-4075-bf8a-dc57e847c882, email=vantoan10c2@gmail.com, username=vantoan, password=$2a$10$rxU2WrfrQ6ukYC7e4QUCVO/okHStgnX1AJ3pCidSe1FHrIlmr.ghi, role=CUSTOMER, createdDate=2022-10-28T16:34:45.000+00:00, createdBy=Toan Le, updatedDate=null, updatedBy=null}]
		List<UserResponseDto> listUser = mapper.convertValue(response.getData(), new TypeReference<List<UserResponseDto>>() {});
		System.out.println(listUser);
	=>  [com.example.kltn.SpringAPILambdaBuy.common.response.UserResponseDto@522272d8]
		for (UserResponseDto userResponseDto : listUser) {
			System.out.println(userResponseDto);
		=>  [com.example.kltn.SpringAPILambdaBuy.common.response.UserResponseDto@522272d8]	
			System.out.println(userResponseDto.getPassword());
		=>	$2a$10$rxU2WrfrQ6ukYC7e4QUCVO/okHStgnX1AJ3pCidSe1FHrIlmr.ghi
		}
	 * @return
	 */
	
	public List<UserResponseDto> getAllUser() {
		String uri = ConstantGlobal.API_PARENT + "/users";
		ResponseEntity<ResponseCommon> response = restTemplate.getForEntity(uri, ResponseCommon.class);
		if(response.getBody().success) {
			List<UserResponseDto> listUser = mapper.convertValue(response.getBody().data, new TypeReference<List<UserResponseDto>>() {});
			return listUser;
		}
		return null;
	}
	
	public UserResponseDto getUserById(String id) {
		String uri = ConstantGlobal.API_PARENT + "/user/" + id;
		ResponseEntity<ResponseCommon> response = restTemplate.getForEntity(uri, ResponseCommon.class);
		if(response.getBody().success) {
			UserResponseDto user = mapper.convertValue(response.getBody().data, new TypeReference<UserResponseDto>() {});
			return user;
		}
		return null;
	}
	
	public UserResponseDto getUserByUsername(String username) {
		String uri = ConstantGlobal.API_PARENT + "/user/name/" + username;
		ResponseEntity<ResponseCommon> response = restTemplate.getForEntity(uri, ResponseCommon.class);
		if(response.getBody().success) {
			UserResponseDto user = mapper.convertValue(response.getBody().data, new TypeReference<UserResponseDto>() {});
			return user;
		}
		return null;
	}
	
	public UserResponseDto getUserByEmail(String email) {
		String uri = ConstantGlobal.API_PARENT + "/user/email/" + email;
		ResponseEntity<ResponseCommon> response = restTemplate.getForEntity(uri, ResponseCommon.class);
		if(response.getBody().success) {
			UserResponseDto user = mapper.convertValue(response.getBody().data, new TypeReference<UserResponseDto>() {});
			return user;
		}
		return null;
	}
	
	public ResponseCommon<?> saveUser(UserEntity user) {
		String uri = ConstantGlobal.API_PARENT + "/user/save";
		ResponseEntity<ResponseCommon> response = restTemplate.postForEntity(uri, user, ResponseCommon.class);
		return response.getBody();
	}
	
	public ResponseCommon deteleUserById(String id) {
		String uri = ConstantGlobal.API_PARENT + "/user/delete/" + id;
		ResponseEntity<ResponseCommon> response = restTemplate.getForEntity(uri, ResponseCommon.class);
		if(response.getBody().success) {
			return response.getBody();
		}
		return null;
	}
}
