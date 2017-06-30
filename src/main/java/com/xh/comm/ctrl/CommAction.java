package com.xh.comm.ctrl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xh.comm.entry.UserBean;

/**
 * 
 * @author yuq
 * @date 2017年6月28日
 * @todo 目前只是测试 ajax 下一步做session的管理
 */
@Controller
@RequestMapping("/comm")
public class CommAction {

	private static final Logger log = LoggerFactory
			.getLogger(CommAction.class);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 @RequestMapping(value="/login.do")  
	    public @ResponseBody Map<String,Object> login(HttpServletRequest request, HttpServletResponse response) throws IOException{  
	        System.out.println(request.getParameter("name"));  
	        Map<String,Object> map = new HashMap<String,Object>();  
	          
	        if(request.getParameter("name").equals("123")){  
	            System.out.println("城东");  
	            map.put("msg", "成功");  
	        }else{  
	            System.out.println("失败");  
	            map.put("msg", "失败");  
	        }  
	        return map;  
	    }
	 @RequestMapping(value="/testValid.do", consumes = { "application/json" }, produces = { "application/json;charset=UTF-8" })
	 public @ResponseBody Map<String,String> testValid( @Valid @RequestBody UserBean user){
		 log.debug(">>>>>>>>>> "+user.getUsername());
		 Map<String,String> map = new HashMap<String,String>();
		 map.put("user", user.getUsername());
		return map;
		 
	 }
}
