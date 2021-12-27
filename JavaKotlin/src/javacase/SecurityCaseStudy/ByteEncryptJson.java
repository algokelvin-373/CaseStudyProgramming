package javacase.SecurityCaseStudy;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class ByteEncryptJson {
    public static void main(String[] args) {
        LocalTime today = LocalTime.now();
        String formatDate = today.format(DateTimeFormatter.ofPattern("MMddHHmmss"));

        // Create Map Data
        Map<Object, Object> mapData = new HashMap<>();
        mapData.put("cardNumber", "1234567893");
        mapData.put("pin", "012345");

        // Create Json
        Object data = mapToObject(mapData);
        String json = new Gson().toJson(data);

        // Encrypt data using TripleDESEncryption
        byte[] byteEncrypt;

    }

    private static Object mapToObject(Map<Object, Object> map) {
        final ObjectMapper mapper = new ObjectMapper();
        return mapper.convertValue(map, Object.class);
    }

}
