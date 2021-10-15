package br.com.rodslab.app.entrypoint.handlers;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.rodslab.core.usecase.exception.BusinessException;
import br.com.rodslab.core.usecase.exception.NotFoundException;

@ControllerAdvice
public class ApiExceptionHandler  extends ResponseEntityExceptionHandler {

    public Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @ExceptionHandler(ResponseStatusException.class)
    @ResponseBody
    private ResponseEntity<Map<String, String>> exceptions(ResponseStatusException exception) {
        this.logger.error(exception.getMessage(), exception);
        
        Map<String, String> attributes = new HashMap<String, String>();
        
        attributes.put("message", exception.getMessage());
        
        return new ResponseEntity<Map<String, String>>(attributes, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseBody
    private ResponseEntity<Map<String, String>> exceptions(NotFoundException exception) {
        this.logger.error(exception.getMessage(), exception);
        
        Map<String, String> attributes = new HashMap<String, String>();
        
        attributes.put("resource", exception.getResourceName());
        attributes.put("value", exception.getId());
        
        return new ResponseEntity<Map<String, String>>(attributes, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    private ResponseEntity<Map<String, String>> exceptions(BusinessException exception) {
        this.logger.error(exception.getMessage(), exception);
        
        Map<String, String> attributes = new HashMap<String, String>();
        
        attributes.put("message", exception.getMessage());
        
        return new ResponseEntity<Map<String, String>>(attributes, HttpStatus.BAD_REQUEST);
    }
    
    

}
