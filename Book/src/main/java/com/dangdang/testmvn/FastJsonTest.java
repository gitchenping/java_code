package com.dangdang.testmvn;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
public class FastJsonTest { 
	private static final String  JSON_STR = "{\"teacherName\":\"crystall\",\"course\":{\"courseName\":\"english\",\"code\":1270},\"students\":[{\"studentName\":\"lily\",\"studentAge\":12},{\"studentName\":\"lucy\",\"studentAge\":15}]}";
 	public static void main(String[] args){ 
		JSONObject jsonObject = JSONObject.parseObject(JSON_STR);
		
                String teacher_name=jsonObject.getString("teacherName");
		System.out.println(teacher_name);

		Integer code=jsonObject.getJSONObject("course").getInteger("code");
		System.out.println(teacher_name+":"+code);

		JSONArray students=jsonObject.getJSONArray("students");
		for (Object obj : students) {
            		JSONObject jsonobj = (JSONObject) obj;
			System.out.println(jsonobj.getString("studentName")+":"+jsonobj.getInteger("studentAge"));
		}
	}
}
