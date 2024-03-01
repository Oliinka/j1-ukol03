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
        System.out.println("computerOn() value: " + myComputer.isComputerOn());

        System.out.println("------------------------------------------------------");
        myComputer.turnOn();
        System.out.println("------------------------------------------------------");


        System.out.println(myComputer.toString());

        Disc myDisk = new Disc();
        //myDisk.setCapacity(994_662_584_320L);
        myDisk.setCapacity(1000L);
        myComputer.setHardDisc(myDisk);

        Disc mySecondDisc = new Disc();
        mySecondDisc.setCapacity(1000L);
        myComputer.setSecondHardDisc(mySecondDisc);

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

        myComputer.createFile(200L);

        System.out.println("CONTROL --> Currently used space: " + "\ndisk 01: " + myDisk.getUsedSpace() + "\ndisk 02: "+ mySecondDisc.getUsedSpace() + " bytes.");

        System.out.println("------------------------------------------------------");

        myComputer.createFile(1000L);
        System.out.println("CONTROL --> Currently used space: " + "\ndisk 01: " + myDisk.getUsedSpace() + "\ndisk 02: "+ mySecondDisc.getUsedSpace() + " bytes.");

        System.out.println("------------------------------------------------------");

        myComputer.createFile(800L);
        System.out.println("CONTROL --> Currently used space: " + "\ndisk 01: " + myDisk.getUsedSpace() + "\ndisk 02: "+ mySecondDisc.getUsedSpace() + " bytes.");
        System.out.println("------------------------------------------------------");

        myComputer.createFile(800L);
        System.out.println("CONTROL --> Currently used space: " + "\ndisk 01: " + myDisk.getUsedSpace() + "\ndisk 02: "+ mySecondDisc.getUsedSpace() + " bytes.");
        System.out.println("------------------------------------------------------");

        System.out.println("------------------------------------------------------");
        myComputer.deleteFile(200L);
        System.out.println("CONTROL --> Currently used space: " + "\ndisk 01: " + myDisk.getUsedSpace() + "\ndisk 02: "+ mySecondDisc.getUsedSpace() + " bytes.");
        System.out.println("------------------------------------------------------");
        myComputer.deleteFile(1000L);
        System.out.println("CONTROL --> Currently used space: " + "\ndisk 01: " + myDisk.getUsedSpace() + "\ndisk 02: "+ mySecondDisc.getUsedSpace() + " bytes.");
        System.out.println("------------------------------------------------------");
        myComputer.deleteFile(800L);
        System.out.println("CONTROL --> Currently used space: " + "\ndisk 01: " + myDisk.getUsedSpace() + "\ndisk 02: "+ mySecondDisc.getUsedSpace() + " bytes.");
        System.out.println("------------------------------------------------------");
        myComputer.deleteFile(1_000L);
        System.out.println("CONTROL --> Currently used space: " + "\ndisk 01: " + myDisk.getUsedSpace() + "\ndisk 02: "+ mySecondDisc.getUsedSpace() + " bytes.");
        System.out.println("------------------------------------------------------");
        myComputer.turnOff();

        myComputer.createFile(100);
        myComputer.deleteFile(100);
    }

}
