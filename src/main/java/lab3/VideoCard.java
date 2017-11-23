package lab3;

public class VideoCard {
    private String modelVc;
    private int mHzVc;
    private int memVcGb;


    public VideoCard(String modelVc, int mHzVc, int memVcGb) { // перегрузка конструктора "параметры внешней видеокарты"
        this.modelVc = modelVc;
        this.mHzVc = mHzVc;
        this.memVcGb = memVcGb;

    }

    public VideoCard() {//перегрузка конструктора "параметры интегрированной видеокарты"
        modelVc = "integrated";
        mHzVc = 1150;
        memVcGb = 512;
    }



    public String getModelVc() {
        return modelVc;
    }

    public void setModelVc(String modelVc) {
        this.modelVc = modelVc;
    }

    public int getMhzVc() {
        return mHzVc;
    }

    public void setmHzVc(int mHzVc) {
        this.mHzVc = mHzVc;
    }

    public int getMemVcGb() {
        return memVcGb;
    }

    public void setMemVcGb(int memVcGb) {
        this.memVcGb = memVcGb;
    }


    @Override
    public String toString() {
        return " VideoCard: " + modelVc + ", Freq:" + mHzVc + "MHz, " + memVcGb + "Gb, ";
    }
    public String toString(String additionalInfo) {
        return " VideoCard: " + modelVc + ", Freq:" + mHzVc + "MHz, " + memVcGb + "Gb, " + additionalInfo;
    }

}