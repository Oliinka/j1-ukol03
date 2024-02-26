package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disc;
import cz.czechitas.ukol3.model.Memory;
import cz.czechitas.ukol3.model.Computer;
import cz.czechitas.ukol3.model.Processor;

/**
 * Spouštěcí třída celého programu
 */
public class MainProgramm {

    public static void main(String... args) {

        System.out.println("Programm running.");

        Computer myComputer = new Computer();
        System.out.println("computerOn() value: " + myComputer.ComputerOn());

        System.out.println("------------------------------------------------------");
        myComputer.turnOn();
        System.out.println("------------------------------------------------------");


        System.out.println(myComputer.toString());

        Disc mujDisk = new Disc();
        mujDisk.setCapacity(994_662_584_320L);
        myComputer.setHardDisc(mujDisk);

        Memory myMemory = new Memory();
        myMemory.setCapacity(24_000_000_000L);
        myComputer.setRam(myMemory);

        Processor myProcessor = new Processor();
        myProcessor.setSpeed(3_490_000_000L);
        myProcessor.setBrand("Apple");
        myComputer.setCpu(myProcessor);

        System.out.println("------------------------------------------------------");
        myComputer.turnOn();
        System.out.println("------------------------------------------------------");


        System.out.println(myComputer.toString());

        myComputer.turnOn();
        System.out.println("------------------------------------------------------");

        myComputer.createFile(662_584_000L);

        System.out.println("CONTROL --> Currently used space: " + mujDisk.getUsedSpace() + "bytes.");

        System.out.println("------------------------------------------------------");

        myComputer.createFile(4_000_000_000L);
        System.out.println("CONTROL --> Currently used space: " + mujDisk.getUsedSpace() + "bytes.");

        System.out.println("------------------------------------------------------");
        myComputer.createFile(994_000_000_000L);

        System.out.println("CONTROL --> Currently used space: " + mujDisk.getUsedSpace() + "bytes.");

        System.out.println("------------------------------------------------------");
        myComputer.deleteFile(4_000_000_000L);

        System.out.println("CONTROL --> Currently used space: " + mujDisk.getUsedSpace() + "bytes.");
        System.out.println("------------------------------------------------------");
        myComputer.deleteFile(1_994_000_000_000L);
        System.out.println("CONTROL --> Currently used space: " + mujDisk.getUsedSpace() + "bytes.");
        System.out.println("------------------------------------------------------");
        myComputer.turnOff();
        myComputer.turnOff();
    }

}
