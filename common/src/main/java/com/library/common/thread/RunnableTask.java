package com.library.common.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class RunnableTask implements Callable<String> {


    @Override
    public String call() throws Exception {
        return "hello";
    }



    public static void main(String[] args) {
        FutureTask<String> futureTask = new FutureTask<>(new RunnableTask());
        //启动线程
        new Thread(futureTask).start();

        try {
            String result = futureTask.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}


