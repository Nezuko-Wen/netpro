package me.exec.netty.dubbo.consumer;


import me.exec.netty.dubbo.netty.DubboClient;
import me.exec.netty.dubbo.service.HelloService;

public class Consumer {
    public static void main(String[] args) {
        DubboClient consumer = new DubboClient();
        HelloService bean = (HelloService) consumer.getBean(HelloService.class, "#");
        String res = bean.hello("我是客户端");
        System.out.println(res);
    }
}
