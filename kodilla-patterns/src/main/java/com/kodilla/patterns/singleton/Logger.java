package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger loggerSingleton = null;
    private String lastLog = "";

    private Logger() {

    }

    public static Logger getInstance(){
        if(loggerSingleton == null){
            loggerSingleton = new Logger();
        }
        return loggerSingleton;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}
