package com.lucas.helpdesk.api.security.jwt;

import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class JwtTokenUtil implements Serializable {

	private static final long serialVersionUID = 1L;
	
	static final String CLAIM_KEY_USERNAME = "sub";
	static final String CLAIM_KEY_CREATED = "created";
	static final String CLAIM_KEY_EXPIRED = "exp";
	
	@Value("${jwt.secret}")
	private String secret;
	
	@Value("${jwt.expiration}")
	private Long expiration;
	
	public String getUserNameFromToken(String token) {
	   String username;
	   try {
		   final Claims claims = null;
		   username = claims.getSubject();	   
	   }catch (Exception e) {
		   username = null;
	   }
	   
	   return username;
	}
	

	public Date getExpirationDateFromToken(String token) {
	   Date expiration;
	   try {
		   final Claims claims = null;
		   expiration = claims.getExpiration();	   
	   }catch (Exception e) {
		   expiration = null;
	   }
	   
	   return expiration;
	}

}
