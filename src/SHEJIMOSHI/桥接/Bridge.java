package SHEJIMOSHI.桥接;

public abstract class Bridge {

    private  Sourceable sourceable;
    public void method(){
        sourceable.method();
    }

    public Sourceable getSourceable() {
        return sourceable;
    }

    public void setSourceable(Sourceable sourceable) {
        this.sourceable = sourceable;
    }

}
