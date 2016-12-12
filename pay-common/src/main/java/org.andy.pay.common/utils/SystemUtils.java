package org.andy.pay.common.utils;

/**
 * 系统工具类,主要用来获取当前系统的信息
 * Created by andy on 16-12-1.
 */
public class SystemUtils {
    //系统版本
    public static final String OS_VERSION="os.version";
    //系统名称
    public static final String OS_NAME="os.name";
    //用户语言　zh
    public static final String USER_LAUNAGE="user.language";
    //文件编码　UTF-8
    public static final String FILE_ENCODING="file.encoding";
    //获取系统的java版本 1.8.0_112
    public static final String JAVA_VERSION="java.version";
    //获取java版本的信息　mixed mode
    public static final String JAVA_VM_INFO="java.vm.info";
    //64位
    public static final String SUN_ARCH_DATA_MODEL="sun.arch.data.model";
    //获取jdk的信息　HotSpot 64-Bit Tiered Compilers
    public static final String SUN_MANAGEMENT_COMPILER="sun.management.compiler";

    //Java(TM) SE Runtime Environment
    public static final String JAVA_RUNTIME_NAME="java.runtime.name";

    //获取属性文件　Oracle Corporation
    public static final String JAVA_VM_VENDOR = "java.vm.vendor";

    /**
     * 获取属性文件
     * @param propertiesName
     * @return
     */
    public static String getSystemProperties(String propertiesName){
        return System.getProperty(propertiesName).toString();
    }

}
