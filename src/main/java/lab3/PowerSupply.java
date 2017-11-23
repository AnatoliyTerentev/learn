package lab3;

public class PowerSupply {
    public int pow;
    private String modelSup;
    private String formFactor;

    {
        pow = 1000;
        formFactor = "ATX";
    }

    PowerSupply(String modelSup) {
        this.modelSup = modelSup;
    }

    public String getModelSup() {
        return modelSup;
    }

    public void setModelSup(String modelSup) {
        this.modelSup = modelSup;
    }



    @Override
    public String toString(){
        return "PWR:" + modelSup + ", FF:"+ formFactor + ", power:" + pow + "W.";

    }

}
