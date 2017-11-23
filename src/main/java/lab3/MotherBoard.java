package lab3;

public class MotherBoard {
    private String modelMb;
    private int socketNumber;


    MotherBoard(String modelMb, int socketNumber) {
        this.modelMb = modelMb;
        this.socketNumber = socketNumber;

    }

    public String getModelMb() {
        return modelMb;
    }

    public void setModelMb(String modelMb) {
        this.modelMb = modelMb;
    }

    public int getSocketNumber() {
        return socketNumber;
    }

    public void setSocketNumber(int socketNumber) {
        this.socketNumber = socketNumber;
    }

    @Override
    public String toString() {
        return "Mainboard: " + modelMb + ", socket " + socketNumber;
    }
}
