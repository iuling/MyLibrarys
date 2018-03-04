package com.iuling.logutils;

/**
 * Created by 宋小雄 on 16/7/18.
 */
class Logger implements Printer {

    private static Logger singleton;
    
    private Logger() {
    }

    public static Logger getInstance(){
        if (singleton == null) {
            synchronized (Logger.class) {
                if (singleton == null) {
                    singleton = new Logger();
                }
            }
        }
        return singleton;
    }


    @Override
    public void d(String message, Object... args) {

    }

    @Override
    public void d(Object object) {

    }

    @Override
    public void e(String message, Object... args) {

    }

    @Override
    public void e(Object object) {

    }

    @Override
    public void w(String message, Object... args) {

    }

    @Override
    public void w(Object object) {

    }

    @Override
    public void i(String message, Object... args) {

    }

    @Override
    public void i(Object object) {

    }

    @Override
    public void v(String message, Object... args) {

    }

    @Override
    public void v(Object object) {

    }

    @Override
    public void wtf(String message, Object... args) {

    }

    @Override
    public void wtf(Object object) {

    }

    @Override
    public void json(String json) {

    }

    @Override
    public void xml(String xml) {

    }
}
