package com.ruoyi.quartz.task;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyTask {

    public void  showTime(){
        System.out.println("当前的系统时间为"+ new Date());
    }
}
