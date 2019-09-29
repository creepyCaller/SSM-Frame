package cn.edu.cuit.fpc.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServiceProvider implements Runnable {
    private static ClassPathXmlApplicationContext context;
    private static SimpleDateFormat simpleDateFormat;
    private static Date date;

    static {
        context = new ClassPathXmlApplicationContext("applicationContext-service.xml");
        simpleDateFormat = new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss.SSS] - ");
        date = new Date();
    }

    private String getTime() {
        return simpleDateFormat.format(date.getTime()).toString();
    }

    @Override
    public void run() {
        this.startProvide();
        System.out.println(this.getTime() + "Click any key to stop provide.");
        try {
            System.out.println(System.in.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.stopProvide();
    }

    private void startProvide() {
        System.out.println(this.getTime() + "Starting provide services...");
        context.start();
        System.out.println(this.getTime() + "Now providing services.");
    }

    private void stopProvide() {
        System.out.println(this.getTime() + "Stopping provide services...");
        context.close();
        System.out.println(this.getTime() + "Now stop provide services.");
    }

}
