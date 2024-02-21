package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {
    public static void main(String... args) {

        Computer olinkasComputer = new Computer();
        olinkasComputer.turnOn();

        System.out.println("Initial Computer State:");
        System.out.println(olinkasComputer);
        olinkasComputer.turnOn();

        olinkasComputer.setBrand("Lenovo");
        Processor olinkasProcessor = new Processor("Intel(R) Core(TM) i7-4510U CPU", 3_490_000_000L);
        olinkasComputer.setProcessor(olinkasProcessor);

        RamMemory olinkasMemory = new RamMemory();
        olinkasMemory.setCapacity(24_000_000_000L);
        olinkasComputer.setRamMemory(olinkasMemory);

        HardDisc olinkasDisc = new HardDisc();
        olinkasDisc.setCapacity(994_662_584_320L);
        olinkasComputer.setHardDisc(olinkasDisc);

        olinkasComputer.setProcessor(olinkasProcessor);
        olinkasComputer.setRamMemory(olinkasMemory);
        olinkasComputer.setHardDisc(olinkasDisc);

        System.out.println(olinkasComputer);

        olinkasComputer.turnOn();
        olinkasComputer.turnOn();
        System.out.println(olinkasComputer);

        olinkasComputer.fillHardDiscWithFile(50);

        olinkasComputer.fillHardDiscWithFile(50);
        olinkasComputer.fillHardDiscWithFile(900);

        olinkasComputer.turnOff();

        olinkasComputer.turnOff();

    System.out.println("Program on.");
    }
}