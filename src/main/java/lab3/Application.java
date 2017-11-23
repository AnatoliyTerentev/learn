package lab3;

public class Application {


    public static void main(String[] args) {
        /*Блок создания объектов*/
        HardDisk hdd = new HardDisk("Seagate",1000);
        Memory mem = new Memory(16,"KINGSTON HX421C14FBK2/16 DDD4 "); //создание объекта RAM с требуемыми свойствами, mHz - константа
        MotherBoard mb = new MotherBoard("GIGABYTE ARG-3222 ", 1151);
        Processor cpu = new Processor("Core i7-7700K ", 4,4.2);
        PowerSupply ps = new PowerSupply("FSP-032");
        VideoCard vc = new VideoCard();
        Case cs = new Case("Aaaaa", "Alien X");
        Computer comp = new Computer(hdd, mem, mb, cpu, ps, vc, cs);


        comp.turnOn(true);
        Computer.hello();
        comp.config();
        comp.turnOff();

    }
}
