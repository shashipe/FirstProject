package com.amazonaws.lambda.demo;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;

public class LambdaFunctionHandler implements RequestHandler<Map<String,String>, String> 
{

	@Override
	public String handleRequest(Map<String, String> arg0, Context arg1) {
		// TODO Auto-generated method stub
		return "hello";
	}
	}