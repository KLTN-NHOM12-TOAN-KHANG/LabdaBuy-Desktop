package com.kltn.nhom12.LambdaBuyDesktop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.example.kltn.SpringAPILambdaBuy.common.request.brand.CreateBrandDto;
import com.example.kltn.SpringAPILambdaBuy.common.request.brand.UpdateBrandDto;
import com.example.kltn.SpringAPILambdaBuy.common.response.BrandResponseDto;
import com.example.kltn.SpringAPILambdaBuy.common.response.ResponseCommon;
import com.example.kltn.SpringAPILambdaBuy.common.response.UserResponseDto;
import com.example.kltn.SpringAPILambdaBuy.entities.BrandEntity;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kltn.nhom12.LambdaBuyDesktop.common.ConstantGlobal;

public class BrandDesktopService {
	
	private RestTemplate restTemplate;
	private ObjectMapper mapper;
	
	public BrandDesktopService() {
		restTemplate = new RestTemplate();
		mapper = new ObjectMapper();
	}
	
	public List<BrandResponseDto> getAll(String token){
		String uri = ConstantGlobal.API_PARENT + "/brands";
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.set("Authorization", token);
		HttpEntity<String> jwtEntity = new HttpEntity<String>(headers);
		// Use Token to get Response
		ResponseEntity<ResponseCommon> response = restTemplate.exchange(uri, HttpMethod.GET, jwtEntity,
				ResponseCommon.class);
		
		if(response.getBody().success) {
			List<BrandResponseDto> listBrand = mapper.convertValue(response.getBody().data, new TypeReference<List<BrandResponseDto>>() {});
			List<BrandResponseDto> result = new ArrayList<>();
			for (BrandResponseDto brandResponseDto : listBrand) {
				if(!brandResponseDto.getIsDeleted()) {
					result.add(brandResponseDto);
				}
			}
			return result;
		}
		return null;
	}
	
	public BrandResponseDto getById(String id, String token) {
		String uri = ConstantGlobal.API_PARENT + "/brand/" + id;
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.set("Authorization", token);
		HttpEntity<String> jwtEntity = new HttpEntity<String>(headers);
		// Use Token to get Response
		ResponseEntity<ResponseCommon> response = restTemplate.exchange(uri, HttpMethod.GET, jwtEntity,
				ResponseCommon.class);
		if(response.getBody().success) {
			BrandResponseDto brand = mapper.convertValue(response.getBody().data, new TypeReference<BrandResponseDto>() {});
			return brand;
		}
		return null;
	}
	
	public ResponseCommon<?> save(BrandEntity brand, String token) {
		String uri = ConstantGlobal.API_PARENT + "/brand/save";
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.set("Authorization", token);
		HttpEntity<String> jwtEntity = new HttpEntity<String>(headers);
		// Use Token to get Response
		ResponseEntity<ResponseCommon> response = restTemplate.exchange(uri, HttpMethod.POST, jwtEntity,
				ResponseCommon.class, brand);
		return response.getBody();
	}
	
	public ResponseCommon<?> create(CreateBrandDto createBrandDto, String token) {
		String uri = ConstantGlobal.API_PARENT + "/brand/create";
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.set("Authorization", token);
		HttpEntity<String> jwtEntity = new HttpEntity<String>(headers);
		ResponseEntity<ResponseCommon> response = restTemplate.exchange(uri, HttpMethod.POST, jwtEntity,
				ResponseCommon.class, createBrandDto);
		return response.getBody();
	}
	
	public ResponseCommon<?> update(UpdateBrandDto updateBrandDto, String token) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.set("Authorization", token);
		HttpEntity<String> jwtEntity = new HttpEntity<String>(headers);
		String uri = ConstantGlobal.API_PARENT + "/brand/update";
		ResponseEntity<ResponseCommon> response = restTemplate.exchange(uri, HttpMethod.POST, jwtEntity,
				ResponseCommon.class, updateBrandDto);
		return response.getBody();
	}
	
	public ResponseCommon<?> deleteById(String id, String token) {
		String uri = ConstantGlobal.API_PARENT + "/brand/delete/" + id;
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.set("Authorization", token);
		HttpEntity<String> jwtEntity = new HttpEntity<String>(headers);
		ResponseEntity<ResponseCommon> response = restTemplate.exchange(uri, HttpMethod.GET, jwtEntity,
				ResponseCommon.class);
		if(response.getBody().success) {
			return response.getBody();
		}
		return null;
	}
}
