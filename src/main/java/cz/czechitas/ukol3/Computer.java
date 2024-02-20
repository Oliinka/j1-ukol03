package cz.czechitas.ukol3;

public class Computer {
    private Processor processor;
    private RamMemory ramMemory;
    private HardDisc hardDisc;

    // Default constructor with default values
    public Computer() {
        this.processor = new Processor("Intel(R) Core(TM) i7-4510U CPU", 2L);
        this.ramMemory = new RamMemory();
        this.hardDisc = new HardDisc();
    }

    // Parameterized constructor for custom values
    public Computer(Processor processor, RamMemory ramMemory, HardDisc hardDisc) {
        this.processor = processor;
        this.ramMemory = ramMemory;
        this.hardDisc = hardDisc;
    }

    // Getters and setters for each component
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

    // Additional methods if needed

    @Override
    public String toString() {
        return "Computer Information:\n" +
                "Processor:\n" + processor.toString() +
                "RAM Memory:\n" + ramMemory.toString() +
                "Hard Disc:\n" + hardDisc.toString();
    }
}
