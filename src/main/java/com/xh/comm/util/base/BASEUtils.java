package com.xh.comm.util.base;

import java.util.Date;

/**
 * 
 * @author yuq
 * @date 2017年6月28日
 * @todo 做生成密令，
 */
public class BASEUtils {
	
	/**
	 * 根据用户Id和当前时间加密
	 * @param id
	 * @return
	 */
	public static String decUserId(String id){
		Des des = Des.getInstance();
		return des.setEbcByByte2HexStr(id+new Date().getTime());
	}
	
	/**
	 * 解密
	 * @param token
	 * @return
	 */
	public static String  encUser(String token){
		Des des = Des.getInstance();
		return des.getDesCodeHexStr2Byte(token);
	}
}
