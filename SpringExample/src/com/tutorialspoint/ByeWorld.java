package com.tutorialspoint;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ByeWorld implements InitializingBean, DisposableBean {
    public String message;

    public void getMessage() {
        System.out.println("  " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("-overriden afterPropertiesSet method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("-overriden destroy method ");
    }

    public void init() {
        System.out.println(" init in ByeWorld");
    }

    public void myDestroy() {
        System.out.println(" myDestroy in ByeWorld");
    }
}
