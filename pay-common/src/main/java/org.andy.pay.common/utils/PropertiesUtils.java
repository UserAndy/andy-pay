package org.andy.pay.common.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读取属性文件
 * @author Andy
 *
 */
public class PropertiesUtils {

	/**
	 * 读取属性文件　默认为classpath　路径下的
	 * @param key　　       为属性文件中的key
	 * @param filename　　　例如: info.properties
	 * @return
	 */
	public String getPropertiesValue(String key,String filename){
		String result = "";
		if(key!=null&&!"".equals(key)){
			InputStream input = this.getClass().getClassLoader().getResourceAsStream(filename);
			Properties properties = new Properties();
			try {
				properties.load(input);
				result = properties.getProperty(key,"");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
