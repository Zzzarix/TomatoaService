package com.tomatoa.service.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Utils {
    public static class Mapper {
        final private static ObjectMapper mapper = new ObjectMapper();
        public static Object readValue(String body, Class<?> object) {
            try {
                return mapper.readValue(body, object);
            }
            catch (Exception ex) {
                return null;
            }
        }

        public static String writeValueAsString(Object object) {
            try {
                return mapper.writeValueAsString(object);
            }
            catch (Exception ex) {
                return null;
            }
        }
    }
}
