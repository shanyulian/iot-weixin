package com.haro.iot.weixin.thread.task;

/**
 * @Title:
 * @Description:测试线程池
 * @Author 单雨连
 * @E-mail shanyulian@aliyun.com
 * @Date 2017/2/20 下午7:29
 * @Version V1.0
 */
public class TestTask implements Runnable{

    private String name;

    public TestTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("线程池:"+name);
    }
}
