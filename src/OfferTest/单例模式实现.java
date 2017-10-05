package OfferTest;

public class 单例模式实现 {

    private static 单例模式实现 instance = null;

    private 单例模式实现(){

    }
    private static synchronized  void init(){
        if (instance == null){
            instance = new 单例模式实现();
        }
    }
    public static 单例模式实现 getInstance(){
        if (instance == null){
            init();
        }

        return  instance;
    }
}
