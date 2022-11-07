package com.kltn.nhom12.LambdaBuyDesktop.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.kltn.SpringAPILambdaBuy.common.request.profile.UpdateProfileDto;
import com.example.kltn.SpringAPILambdaBuy.common.response.ProfileResponseDto;
import com.example.kltn.SpringAPILambdaBuy.common.response.ResponseCommon;
import com.example.kltn.SpringAPILambdaBuy.common.response.UserResponseDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kltn.nhom12.LambdaBuyDesktop.common.ConstantGlobal;

public class ProfileWebService {
	private RestTemplate restTemplate;
	private ObjectMapper mapper;
	
	public ProfileWebService() {
		restTemplate = new RestTemplate();
		mapper = new ObjectMapper();
	}
	
	public ProfileResponseDto getProfileById(String id) {
		String uri = ConstantGlobal.API_PARENT + "/profile/" + id;
		ResponseEntity<ResponseCommon> response = restTemplate.getForEntity(uri, ResponseCommon.class);
		if(response.getBody().success) {
			ProfileResponseDto profile = mapper.convertValue(response.getBody().data, new TypeReference<ProfileResponseDto>() {});
			return profile;
		}
		return null;
	}
	
	public ProfileResponseDto updateProfile(UpdateProfileDto updateProfileDto) {
		String uri = ConstantGlobal.API_PARENT + "/";
		restTemplate.put(uri, updateProfileDto);
		ProfileResponseDto profileDto = getProfileById(updateProfileDto.getId());
		if(profileDto != null) {
			return profileDto;
		}
		return null;
	}
}
