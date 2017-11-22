package lab3;

public class PowerSupply {
    private int pow;
    private String modelSup;


    PowerSupply(int pow, String modelSup) {
        this.pow = pow;
        this.modelSup = modelSup;
    }

    public int getPow() {
        return pow;
    }

    public void setPow(int pow) {
        this.pow = pow;
    }

    public String getModelSup() {
        return modelSup;
    }

    public void setModelSup(String modelSup) {
        this.modelSup = modelSup;
    }



    @Override
    public String toString(){
        return "PWR: " + modelSup + ", power " + pow + "W";

    }

}
