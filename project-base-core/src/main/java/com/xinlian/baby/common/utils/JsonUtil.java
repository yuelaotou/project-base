/**
 * 
 */
package com.xinlian.baby.common.utils;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author yangguang
 *
 */
public class JsonUtil {

	private static final Gson GSON = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

	private JsonUtil() {
	}

	/**
	 * 将对象转换成json
	 */
	public static <T> String toJson(T src) {
		return GSON.toJson(src);
	}

	/**
	 * 将对象转换成json,使用JSONArray
	 */
	public static <T> String toJsonArray(T src) {
		return JSONArray.toJSONString(src);
	}

	/**
	 * 将json通过类型转换成对象
	 */
	public static <T> T fromJson(String json, Class<T> clazz) {
		return GSON.fromJson(json, clazz);
	}

	/**
	 * 将json通过类型转换成对象，可以用List
	 */
	public static <T> List<T> fromJsonArray(String json, Class<T> clazz) {
		return JSONObject.parseArray(json, clazz);
	}

	/**
	 * 将json通过类型转换成对象
	 */
	public static <T> T fromJsonToObject(String json, Class<T> clazz) {
		return JSON.parseObject(json, clazz);
	}
}
