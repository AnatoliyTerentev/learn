package lab3;

import sun.security.krb5.Config;

class Computer {
    /*Раздел объявления переменных класса Computer*/
    private HardDisk hardDisk;
    private Memory memory;
    private MotherBoard mainBoard;
    private Processor processor;
    private PowerSupply power;
    private boolean on;
    private final String hello = "Basic WS configuration";

    Computer(HardDisk hardDisk, Memory memory, MotherBoard mainBoard, Processor processor, PowerSupply power) {
        this.hardDisk = hardDisk;
        this.memory = memory;
        this.mainBoard = mainBoard;
        this.processor = processor;
        this.power = power;
    }


    /*раздел методов включения, вывода конфигурации и выключения ПК*/
    void turnOn() {
        if (on) {
            System.out.println("Please, turn ON PC");
        } else {
            on = true;
            System.out.println("PC is turned ON.");
        }

    }

    void turnOff() {
        on = false;
        System.out.println("PC is turned OFF");

    }

    void config() {
        System.out.println(hello);
        System.out.println("Components :" +
                "\n1 " + hardDisk +
                "\n2 " + memory +
                "\n3 " + mainBoard +
                "\n4 " + processor +
                "\n5 " + power); // объекты не являются строковым типомб поэтому по умолчанию вызывается to String, т.к есть конкатенация.
    }

}