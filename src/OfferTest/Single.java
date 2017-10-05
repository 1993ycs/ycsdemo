package OfferTest;

/**
 * 1：单例模式的实现
 */
public class Single {
    private static Single instance = null;
    private Single(){

    }
    private static synchronized void initSingle(){
        if (instance == null){
            instance =  new Single();
        }
    }
    public static  Single getSingle(){
        if (instance == null){
            initSingle();
        }
        return instance;
    }
}
