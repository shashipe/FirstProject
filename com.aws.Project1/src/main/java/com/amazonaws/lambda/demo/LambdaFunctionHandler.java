package com.amazonaws.lambda.demo;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<Map<String,String>, String> {

    public String handleRequest(Map <String,String>, Context context) {
        context.getLogger().log("Input: " + input);
        return "Hello from Lambda!";
    }



}












