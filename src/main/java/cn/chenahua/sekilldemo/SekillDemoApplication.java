package cn.chenahua.sekilldemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.chenahua.sekilldemo.dao")
public class SekillDemoApplication {

    /**
     * 参考链接：https://blog.csdn.net/luomingkui1109/article/details/77432192/
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(SekillDemoApplication.class, args);
    }

}
