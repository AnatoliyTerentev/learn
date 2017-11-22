package lab3;

public class Computer {
    /*Раздел объявления переменных класса Computer*/
    private HardDisk hardDisk;
    private Memory memory;
    private MotherBoard mainBoard;
    private Processor processor;
    private PowerSupply power;
    private final String hello = "Basic WS configuration";

    public Computer(HardDisk hardDisk, Memory memory, MotherBoard mainBoard, Processor processor, PowerSupply power) {
        this.hardDisk = hardDisk;
        this.memory = memory;
        this.mainBoard = mainBoard;
        this.processor = processor;
        this.power = power;
    }

    public void turnOnOff(boolean on){
        if (on) {
            System.out.println("PC is turned ON");
        } else {
            System.out.println("PC is turned OFF");
            }
        }

    public void config() {
        System.out.println(hello);
        System.out.println("Components :" +
                "\n1 " + hardDisk +
                "\n2 " + memory +
                "\n3 " + mainBoard +
                "\n4 " + processor +
                "\n5 " + power); // объекты не являются строковым типом поэтому по умолчанию вызывается to String, т.к есть конкатенация.
    }

}