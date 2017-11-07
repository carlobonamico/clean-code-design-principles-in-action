package com.carlobonamico.cleancode.kata;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import com.fasterxml.jackson.databind.util.StdDateFormat;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

class ExpenseRequestParser {

    public static void main(String[] args) {
        
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setDateFormat(new ISO8601DateFormat());
        
        
        File file = new File("input/request.json");
        
        try {
            ExpensesRequest request = mapper.readValue(file, ExpensesRequest.class);
            System.out.println(request);
            System.out.println(mapper.writeValueAsString(request));
            
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}