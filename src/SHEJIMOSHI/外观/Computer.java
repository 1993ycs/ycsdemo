package SHEJIMOSHI.外观;

/**
 * 降低类之间的耦合度
 */
public class Computer {
    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public Computer(){
        disk = new Disk();
        memory = new Memory();
        cpu = new CPU();
    }

    public void startup(){
        System.out.println("start computer");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start computer finished");
    }
    public void shutdowm(){
        System.out.println("start close computer");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("close computer !!!");

    }
}
