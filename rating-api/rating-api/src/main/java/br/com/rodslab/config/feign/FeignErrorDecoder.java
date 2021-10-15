package br.com.rodslab.config.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignErrorDecoder implements ErrorDecoder {

    final static Logger LOG = LoggerFactory.getLogger(FeignErrorDecoder.class);
    
    @Override
    public Exception decode(String methodKey, Response response) {
 
       
        switch (response.status()){
            case 400:
                     LOG.error("Status code " + response.status() + ", methodKey = " + methodKey);
            case 404:
            {
                   
            	String requestUrl = response.request().url();
            	String messageFormatted = String.format("Error took place when using Feign client to send HTTP Request. Status code= %s and methodKey= %s and URL=%s ", 
            			response.status(), 
            			methodKey,
            			requestUrl);
            	
            	LOG.error(messageFormatted);
                     
                     
                return new ResponseStatusException(HttpStatus.valueOf(response.status()),messageFormatted); 
            }
            default:
                return new Exception(response.reason());
        } 
    }
    
}