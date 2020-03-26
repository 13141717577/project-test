package com.morhaimi.utils;

import java.util.HashMap;
import java.util.Map;

import com.morhaimi.enums.ResponseEnum;

/**
 * 
 * @Description: 正确的数据响应
 * @author xxl
 *
 */
public final class ResponseCorrrectResult {
	
	private ResponseCorrrectResult() {
		
	}
	
	/**
	 * layui数据表格渲染 规定格式封装
	 * @param count 数据长度(条数)
	 * @param data 数据
	 * @return
	 * 	code 为状态码	200
	 * 	msg 为提示信息
	 * 	data 为数据
	 * 	count 为数据长度
	 */
    public static Map<String, Object> layui_data(Object count , Object data){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.SUCCESS.getCode());
        resultMap.put("msg", ResponseEnum.SUCCESS.getMsg());
        resultMap.put("data", data);
        resultMap.put("count",count);
        return resultMap;
    }
    
    /**
     * 成功访问 无参返回
     * @return
     * 	code状态码 200
     * 	msg响应信息: 响应成功
     */
    public static Map<String,Object> Access_Success_No_Parameter() {
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.SUCCESS.getCode());
        resultMap.put("msg", ResponseEnum.SUCCESS.getMsg());
        return resultMap;
    }
    
    /**
     * 成功访问 有参返回
     * @param data 数据
     * @return
     * 	状态码 200
     * 	响应信息: 响应成功
     */
    public static Map<String, Object> Access_Success_Have_Parameter(Object data){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.SUCCESS.getCode());
        resultMap.put("msg", ResponseEnum.SUCCESS.getMsg());
        resultMap.put("data", data);
        return resultMap;
    }

    /**
     * 成功访问 有参返回 自定义信息
     * @param msg 自定义信息
     * @param data 数据
     * @return
     * 	状态码 200
     * 	响应信息: 自定义信息
     */
    public static Map<String, Object> Access_Success_Have_Parameter_Msg(String msg , Object data){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.SUCCESS.getCode());
        resultMap.put("msg", msg);
        resultMap.put("data", data);
        return resultMap;
    }
    
    /**
     * 成功访问 无参返回 返回自定义信息
     * @param msg
     * @return
     * 	状态码 200
     * 	响应信息: 自定义信息
     */
    public static Map<String, Object> Access_Success_Have_MyMsg(String msg){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.SUCCESS.getCode());
        resultMap.put("msg", msg);
        return resultMap;
    }
	
}
