package com.simplefanc.design.structural.proxy.db;


public class DataSourceContextHolder {
    /**
     * 线程间隔离 内部ThreadLocalMap实现
     */
    private static final ThreadLocal<Object> CONTEXT_HOLDER  = new ThreadLocal<>();

    public static void setDBType(String dbType){
        CONTEXT_HOLDER.set(dbType);
    }

    public static String getDBType(){
        return (String) CONTEXT_HOLDER.get();
    }

    public static void clearDBType(){
        CONTEXT_HOLDER.remove();
    }
}
