package lab3;

public class Memory {
    /*раздел объявления приватных переменных класса */
    private static int mhz = 2133;
    private int sizeRam;
    private String type;

    Memory(int sizeRam, String type) {
        this.sizeRam = sizeRam;
        this.type = type;
    }


    /*раздел геттеров сеттеров для методов */
    public int getMhz() {// возвращение значения частоты памяти из стат переменной
        return mhz;
    }

    public void setSizeRam(int sizeRam) {
        this.sizeRam = sizeRam;
    }

    public int getSizeRam() {
        return sizeRam;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "RAM: " + mhz + "MHz, " + sizeRam + "Gb ," + type; //метод возврата общей информации о ОЗУ
    }
}

