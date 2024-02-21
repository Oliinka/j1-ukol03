// Computer class
package cz.czechitas.ukol3;

public class Computer {
    private String brand;
    private Processor processor;
    private RamMemory ramMemory;
    private HardDisc hardDisc;
    private boolean isOn;

    public Computer() {
        this.brand = "Unknown";
        this.processor = new Processor("Intel(R) Core(TM) i7-4510U CPU", 2L);
        this.ramMemory = new RamMemory();
        this.hardDisc = new HardDisc();
        this.isOn = false;
    }

    public Computer(String brand, Processor processor, RamMemory ramMemory, HardDisc hardDisc) {
        this.brand = brand;
        this.processor = processor;
        this.ramMemory = ramMemory;
        this.hardDisc = hardDisc;
        this.isOn = false;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public RamMemory getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(RamMemory ramMemory) {
        this.ramMemory = ramMemory;
    }

    public HardDisc getHardDisc() {
        return hardDisc;
    }

    public void setHardDisc(HardDisc hardDisc) {
        this.hardDisc = hardDisc;
    }

    public void turnOn() {
        if (processor != null && ramMemory != null && hardDisc != null) {
            if (!isOn) {
                System.out.println("Turning on the computer...");
                isOn = true;
            } else {
                System.out.println("The computer is already on.");
            }
        } else {
            System.out.println("Cannot turn on the computer. Some components are missing.");
        }
    }

    public void turnOff() {
        if (isOn) {
            System.out.println("Turning off the computer...");
            isOn = false;
        } else {
            System.out.println("...");
        }
    }
    public void fillHardDiscWithFile(long fileSize) {
        if (hardDisc != null) {
            long currentUsedSpace = hardDisc.getUsedSpace();
            long newUsedSpace = currentUsedSpace + fileSize;

            if (newUsedSpace <= hardDisc.getCapacity()) {
                hardDisc.setUsedSpace(newUsedSpace);
                System.out.println("File added to the hard disk. Used space: " + newUsedSpace + " GB");
            } else {
                System.out.println("Cannot add the file. Hard disk capacity exceeded!");
            }
        } else {
            System.out.println("Cannot add the file. Hard disk is missing.");
        }
    }
    @Override
    public String toString() {
        return "Computer Information:\n" +
                "Brand: " + brand + "\n" +
                "Processor:\n" + processor.toString() +
                "RAM Memory:\n" + ramMemory.toString() +
                "Hard Disc:\n" + hardDisc.toString();
    }
}
