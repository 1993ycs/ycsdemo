package SHEJIMOSHI;

import com.sun.org.apache.regexp.internal.RE;

/**
 * 单例模式 安全的
 * 1  private构造器
 * 2 private同步初始化
 * 3 public  取得实例
 */
public class  Single {
 private static Single instance = null;
 private Single(){

 }

 private static synchronized Single initSingle(){
     if (instance == null){
         instance = new Single();
     }
     return instance;
 }

 public static Single getInstance(){
     if (instance == null){
         initSingle();
     }
     return instance;
 }
}

