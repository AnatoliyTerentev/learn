package lab3;

public class HardDisk {

    private String model;
    private int sizeGb;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSizeGb() {
        return sizeGb;
    }

    public void setSizeGb(int sizeGb) {
        this.sizeGb = sizeGb;
    }

    HardDisk(String model, int sizeGb) {
        this.model = model;
        this.sizeGb = sizeGb;
    }

    @Override
    public String toString() {
        return "HDD: " + model + ", size " + sizeGb + "Gb";
    }
}

