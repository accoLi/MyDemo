package com.lcq.demo.util;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import org.apache.commons.lang.StringUtils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class DesUtil {
   public static String encrypt(String dataSource,String key) throws Exception{
	   Key secretKey = getKey(key);
	   Cipher cipher = Cipher.getInstance("DES");
	   cipher.init(Cipher.ENCRYPT_MODE, secretKey);
	   byte[] bytes = cipher.doFinal(dataSource.getBytes("utf-8"));
	   BASE64Encoder be = new BASE64Encoder();
	   return be.encode(bytes);
   }
   public static String decrypt(String dataSource,String key) throws Exception{
	   Key secretKey = getKey(key);
	   Cipher cipher = Cipher.getInstance("DES");
	   cipher.init(Cipher.DECRYPT_MODE, secretKey);
	   BASE64Decoder bd = new BASE64Decoder();
	   byte[] bytes = cipher.doFinal(bd.decodeBuffer(dataSource));
	   return new String(bytes, "utf-8");
   }
   
   public static Key getKey(String key) throws Exception{
	   DESKeySpec desKey = new DESKeySpec(key.getBytes());
	   SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
	   return keyFactory.generateSecret(desKey);
   }
   
   public static void main(String [] args) throws Exception{
	  
	   String data = "abcde";
	   String key = "boncbonc";
	   String encryptStr = DesUtil.encrypt(data, key);
	   System.out.print("加密后的数据："+encryptStr);
	   String decryptStr = DesUtil.decrypt("7Zx8dZXW824=", key);
	   System.out.print("解密后的数据："+decryptStr);
   }
}
