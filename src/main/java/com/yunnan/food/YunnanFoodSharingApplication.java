package com.yunnan.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 云南美食分享平台主启动类
 * 集成RAG智能功能
 */
@SpringBootApplication
public class YunnanFoodSharingApplication {

    public static void main(String[] args) {
        SpringApplication.run(YunnanFoodSharingApplication.class, args);
        System.out.println("=================================");
        System.out.println("🍜 云南美食分享平台启动成功！");
        System.out.println("🤖 RAG智能功能已集成");
        System.out.println("🌐 访问地址：http://localhost:8080");
        System.out.println("=================================");
    }
}
