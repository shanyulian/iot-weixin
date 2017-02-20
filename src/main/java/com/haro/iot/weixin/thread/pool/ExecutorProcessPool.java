package com.haro.iot.weixin.thread.pool;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * @Title:
 * @Description:
 * @Author 单雨连
 * @E-mail shanyulian@aliyun.com
 * @Date 2017/2/20 下午6:56
 * @Version V1.0
 */
//@Component
public class ExecutorProcessPool {
    private ExecutorService executor;
    private static ExecutorProcessPool pool = new ExecutorProcessPool();
    private final int threadMax = 10;

   /* @PostConstruct
    public void init(){
        *//*System.out.println("线程池开始运行！>>>>>>>" + threadMax);
        System.out.println("线程池开始运行！>>>>>>>" + threadMax);
        System.out.println("线程池开始运行！>>>>>>>" + threadMax);
        System.out.println("线程池开始运行！>>>>>>>" + threadMax);
        System.out.println("线程池开始运行！>>>>>>>" + threadMax);
        System.out.println("线程池开始运行！>>>>>>>" + threadMax);
        System.out.println("线程池开始运行！>>>>>>>" + threadMax);
        System.out.println("线程池开始运行！>>>>>>>" + threadMax);
        System.out.println("线程池开始运行！>>>>>>>" + threadMax);*//*
        System.out.println("线程池开始运行！>>>>>>>" + threadMax);

        executor = ExecutorServiceFactory.getInstance().createFixedThreadPool(threadMax);
    }*/
   private ExecutorProcessPool() {

       System.out.println("线程池开始运行！>>>>>>>" + threadMax);
        executor = ExecutorServiceFactory.getInstance().createFixedThreadPool(threadMax);
    }

    public static ExecutorProcessPool getInstance() {
        return pool;
    }

    /**
     * 关闭线程池，这里要说明的是：调用关闭线程池方法后，线程池会执行完队列中的所有任务才退出
     *
     * @author SHANHY
     * @date   2015年12月4日
     */
    @PreDestroy
    public void shutdown(){
        executor.shutdown();
    }

    /**
     * 提交任务到线程池，可以接收线程返回值
     *
     * @param task
     * @return
     * @author SHANHY
     * @date   2015年12月4日
     */
    public Future<?> submit(Runnable task) {
        return executor.submit(task);
    }

    /**
     * 提交任务到线程池，可以接收线程返回值
     *
     * @param task
     * @return
     * @author SHANHY
     * @date   2015年12月4日
     */
    public Future<?> submit(Callable<?> task) {
        return executor.submit(task);
    }

    /**
     * 直接提交任务到线程池，无返回值
     *
     * @param task
     * @author SHANHY
     * @date   2015年12月4日
     */
    public void execute(Runnable task){
        executor.execute(task);
    }
}
