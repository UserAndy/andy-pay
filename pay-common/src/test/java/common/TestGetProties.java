package common;

import org.junit.Test;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 *
 * 获取属性文件
 * Created by andy on 16-12-1.
 */
public class TestGetProties {

    /*
    java.runtime.name-->Java(TM) SE Runtime Environment
    sun.boot.library.path-->/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/amd64
    java.vm.version-->25.112-b15
    java.vm.vendor-->Oracle Corporation
    java.vendor.url-->http://java.oracle.com/
    path.separator-->:
    idea.launcher.port-->7534
    java.vm.name-->Java HotSpot(TM) 64-Bit Server VM
    file.encoding.pkg-->sun.io
    user.country-->CN
    sun.java.launcher-->SUN_STANDARD
    sun.os.patch.level-->unknown
    java.vm.specification.name-->Java Virtual Machine Specification
    user.dir-->/media/andy/UbuntuProject/myproject/project/andy-pay/pay-common
    java.runtime.version-->1.8.0_112-b15
    java.awt.graphicsenv-->sun.awt.X11GraphicsEnvironment
    java.endorsed.dirs-->/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/endorsed
    os.arch-->amd64
    java.io.tmpdir-->/tmp
    line.separator-->

    java.vm.specification.vendor-->Oracle Corporation
    os.name-->Linux
    sun.jnu.encoding-->UTF-8
    java.library.path-->/usr/local/java/devtools/intellij/idea-IU-162.2228.15/bin::/usr/java/packages/lib/amd64:/usr/lib64:/lib64:/lib:/usr/lib
    java.specification.name-->Java Platform API Specification
    java.class.version-->52.0
    sun.management.compiler-->HotSpot 64-Bit Tiered Compilers
    os.version-->4.4.0-47-generic
    user.home-->/home/andy
    user.timezone-->
    java.awt.printerjob-->sun.print.PSPrinterJob
    file.encoding-->UTF-8
    idea.launcher.bin.path-->/usr/local/java/devtools/intellij/idea-IU-162.2228.15/bin
    java.specification.version-->1.8
    java.class.path-->/usr/local/java/devtools/intellij/idea-IU-162.2228.15/lib/idea_rt.jar:/usr/local/java/devtools/intellij/idea-IU-162.2228.15/plugins/junit/lib/junit-rt.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/charsets.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/deploy.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/ext/cldrdata.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/ext/dnsns.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/ext/jaccess.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/ext/jfxrt.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/ext/localedata.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/ext/nashorn.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/ext/sunec.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/ext/sunjce_provider.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/ext/sunpkcs11.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/ext/zipfs.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/javaws.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/jce.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/jfr.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/jfxswt.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/jsse.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/management-agent.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/plugin.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/resources.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/rt.jar:/media/andy/UbuntuProject/myproject/project/andy-pay/pay-common/target/test-classes:/media/andy/UbuntuProject/myproject/project/andy-pay/pay-common/target/classes:/home/andy/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/andy/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/andy/.m2/repository/com/alibaba/fastjson/1.2.6/fastjson-1.2.6.jar:/home/andy/.m2/repository/org/springframework/spring-context/4.2.5.RELEASE/spring-context-4.2.5.RELEASE.jar:/home/andy/.m2/repository/org/springframework/spring-webmvc/4.2.6.RELEASE/spring-webmvc-4.2.6.RELEASE.jar:/home/andy/.m2/repository/org/springframework/spring-web/4.2.6.RELEASE/spring-web-4.2.6.RELEASE.jar:/home/andy/.m2/repository/org/springframework/spring-jdbc/4.2.6.RELEASE/spring-jdbc-4.2.6.RELEASE.jar:/home/andy/.m2/repository/org/springframework/spring-tx/4.2.6.RELEASE/spring-tx-4.2.6.RELEASE.jar:/home/andy/.m2/repository/org/springframework/spring-core/4.2.6.RELEASE/spring-core-4.2.6.RELEASE.jar:/home/andy/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/andy/.m2/repository/org/springframework/spring-aop/4.2.6.RELEASE/spring-aop-4.2.6.RELEASE.jar:/home/andy/.m2/repository/aopalliance/aopalliance/1.0/aopalliance-1.0.jar:/home/andy/.m2/repository/org/springframework/spring-beans/4.2.6.RELEASE/spring-beans-4.2.6.RELEASE.jar:/home/andy/.m2/repository/org/springframework/spring-expression/4.2.6.RELEASE/spring-expression-4.2.6.RELEASE.jar:/home/andy/.m2/repository/org/springframework/spring-context-support/4.2.6.RELEASE/spring-context-support-4.2.6.RELEASE.jar:/home/andy/.m2/repository/org/springframework/spring-test/4.2.6.RELEASE/spring-test-4.2.6.RELEASE.jar:/home/andy/.m2/repository/org/apache/shiro/shiro-core/1.2.6/shiro-core-1.2.6.jar:/home/andy/.m2/repository/org/slf4j/slf4j-api/1.6.4/slf4j-api-1.6.4.jar:/home/andy/.m2/repository/commons-beanutils/commons-beanutils/1.8.3/commons-beanutils-1.8.3.jar:/home/andy/.m2/repository/redis/clients/jedis/2.8.0/jedis-2.8.0.jar:/home/andy/.m2/repository/org/apache/commons/commons-pool2/2.4.2/commons-pool2-2.4.2.jar:/home/andy/.m2/repository/org/springframework/session/spring-session/1.2.2.RELEASE/spring-session-1.2.2.RELEASE.jar:/home/andy/.m2/repository/org/springframework/data/spring-data-redis/1.7.1.RELEASE/spring-data-redis-1.7.1.RELEASE.jar:/home/andy/.m2/repository/org/springframework/data/spring-data-keyvalue/1.1.1.RELEASE/spring-data-keyvalue-1.1.1.RELEASE.jar:/home/andy/.m2/repository/org/springframework/data/spring-data-commons/1.12.1.RELEASE/spring-data-commons-1.12.1.RELEASE.jar:/home/andy/.m2/repository/org/springframework/spring-oxm/4.2.5.RELEASE/spring-oxm-4.2.5.RELEASE.jar:/home/andy/.m2/repository/org/slf4j/jcl-over-slf4j/1.7.19/jcl-over-slf4j-1.7.19.jar:/home/andy/.m2/repository/org/quartz-scheduler/quartz/2.2.1/quartz-2.2.1.jar:/home/andy/.m2/repository/c3p0/c3p0/0.9.1.1/c3p0-0.9.1.1.jar:/home/andy/.m2/repository/org/apache/shiro/shiro-web/1.3.2/shiro-web-1.3.2.jar:/home/andy/.m2/repository/org/apache/shiro/shiro-spring/1.3.2/shiro-spring-1.3.2.jar:/home/andy/.m2/repository/javax/servlet/javax.servlet-api/3.0.1/javax.servlet-api-3.0.1.jar:/home/andy/.m2/repository/log4j/log4j/1.2.12/log4j-1.2.12.jar:/home/andy/.m2/repository/org/slf4j/slf4j-log4j12/1.7.21/slf4j-log4j12-1.7.21.jar:/home/andy/.m2/repository/javax/servlet/jstl/1.1.2/jstl-1.1.2.jar:/home/andy/.m2/repository/org/mybatis/mybatis/3.4.1/mybatis-3.4.1.jar:/home/andy/.m2/repository/org/mybatis/mybatis-spring/1.3.0/mybatis-spring-1.3.0.jar:/home/andy/.m2/repository/dom4j/dom4j/1.6.1/dom4j-1.6.1.jar:/home/andy/.m2/repository/xml-apis/xml-apis/1.0.b2/xml-apis-1.0.b2.jar:/home/andy/.m2/repository/com/thoughtworks/xstream/xstream/1.4.7/xstream-1.4.7.jar:/home/andy/.m2/repository/xmlpull/xmlpull/1.1.3.1/xmlpull-1.1.3.1.jar:/home/andy/.m2/repository/xpp3/xpp3_min/1.1.4c/xpp3_min-1.1.4c.jar:/home/andy/.m2/repository/com/alibaba/druid/1.0.7/druid-1.0.7.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/../lib/jconsole.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/../lib/tools.jar:/home/andy/.m2/repository/mysql/mysql-connector-java/5.1.18/mysql-connector-java-5.1.18.jar
    user.name-->andy
    java.vm.specification.version-->1.8
    sun.java.command-->com.intellij.rt.execution.application.AppMain com.intellij.rt.execution.junit.JUnitStarter -ideVersion5 common.TestGetProties,testGetSystemInfo
    java.home-->/usr/local/java/devtools/jdk/jdk1.8.0_112/jre
    sun.arch.data.model-->64
    user.language-->zh
    java.specification.vendor-->Oracle Corporation
    awt.toolkit-->sun.awt.X11.XToolkit
    java.vm.info-->mixed mode
    java.version-->1.8.0_112
    java.ext.dirs-->/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/ext:/usr/java/packages/lib/ext
    sun.boot.class.path-->/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/resources.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/rt.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/sunrsasign.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/jsse.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/jce.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/charsets.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/lib/jfr.jar:/usr/local/java/devtools/jdk/jdk1.8.0_112/jre/classes
    idea.junit.sm_runner-->
    java.vendor-->Oracle Corporation
    file.separator-->/
    java.vendor.url.bug-->http://bugreport.sun.com/bugreport/
    sun.io.unicode.encoding-->UnicodeLittle
    sun.cpu.endian-->little
    sun.desktop-->gnome
    sun.cpu.isalist-->
    */
    /**
     * 获取系统信息
     */
    @Test
    public void testGetSystemInfo(){
        Properties properties = System.getProperties();
        for(Map.Entry<Object,Object> entry:properties.entrySet()){
           String key =  entry.getKey().toString();
            String value = entry.getValue().toString();
            System.out.println(key+"-->"+value);
        }
    }
}
