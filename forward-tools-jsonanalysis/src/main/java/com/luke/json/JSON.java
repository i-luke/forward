package com.luke.json;

import com.luke.json.model.JsonObject;
import com.luke.json.tostring.ToStringHandle;

/**
 * Created by yangf on 2017/3/29.
 */
public class JSON {
    public static String toJsonString(Object obj) {
        StringBuilder result = new StringBuilder();
        ToStringHandle.toJsonString(obj, result);
        return result.toString();
    }

    public static JsonObject parser(String str){
        return null;
    }
}