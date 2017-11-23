package lab3;

public class Computer {
    /*Раздел объявления полей класса Computer*/
    private HardDisk hardDisk;
    private Memory memory;
    private MotherBoard mainBoard;
    private Processor processor;
    private PowerSupply power;
    private VideoCard video;
    private Case box;
    public static String hello;


    public Computer(HardDisk hardDisk, Memory memory, MotherBoard mainBoard, Processor processor, PowerSupply power, VideoCard video, Case box) {
        this.hardDisk = hardDisk;
        this.memory = memory;
        this.mainBoard = mainBoard;
        this.processor = processor;
        this.power = power;
        this.video = video;
        this.box = box;
    }

    static {
         hello = "Basic WS configuration";
        }

    public static void hello() {//стат метод вывода строковой переменной
        System.out.println(hello);
    }

    public void turnOn(boolean on){
        if (on) {
            System.out.println("PC is turned ON");
        } else {
            on = true;
            System.out.println("Please turn PC ON");
            }
        }

        public void turnOff(){
        System.out.println("PC is turned OFF");
        }

    public void config() {
        System.out.println("Components :" +
                "\n1 " + hardDisk +
                "\n2 " + memory +
                "\n3 " + mainBoard +
                "\n4 " + processor +
                "\n5 " + power +
                "\n6 " + video.toString("- can be integrated or external") +
                "\n7 " + box ); // переменные не являются строковым типом поэтому по умолчанию вызывается toString, т.к есть конкатенация.
    }



}