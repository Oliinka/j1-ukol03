package cz.czechitas.ukol3.model;

public class Computer {

    private boolean computerOn;

    private Disc hardDisc;
    private Processor cpu;
    private Memory ram;

    public boolean isComputerOn() {
        return computerOn;
    }

    public Disc getHardDisc() {
        return hardDisc;
    }

    public void setHardDisc(Disc hardDisc) {
        this.hardDisc = hardDisc;
    }

    public Processor getCpu() {
        return cpu;
    }

    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }

    public Memory getRam() {
        return ram;
    }

    public void setRam(Memory ram) {
        this.ram = ram;
    }

    public void turnOff() {
        if (computerOn) {
            System.out.println("Computer is shutting off...");
            computerOn = false;
        } else {
            System.err.println(" ");
        }
    }

    public void controlOfProcessor() {
        if (cpu == null) {
            System.err.println("Computer's processor missing.");
        }
    }

    public void controlOfMemory() {
        if (ram == null) {
            System.err.println("Computer's RAM missing.");
        }
    }

    public void controlOfHardDisc() {
        if (hardDisc == null) {
            System.err.println("Computer's hard disc missing.");
        }
    }

    public void turnOn() {
        controlOfProcessor();
        controlOfMemory();
        controlOfHardDisc();

        if (cpu == null || ram == null || hardDisc == null) {
            System.err.println("Impossible to turn on computer, essential components missing.");
            return;
        } else if (computerOn) {
            System.err.println("Computer is on already.");
        } else {
            System.out.println("Computer turned on.");
            computerOn = true;
        }
    }

    public void createFile(long sizeOfFile) {
        if (!computerOn) {
            System.err.println("Computer is off, impossible to create file.");
        } else if (sizeOfFile <= 0) {
            System.err.println("Invalid file size. Please provide a valid file size.");
        } else if (sizeOfFile <= (hardDisc.getCapacity() - hardDisc.getUsedSpace())) {
            hardDisc.setUsedSpace(hardDisc.getUsedSpace() + sizeOfFile);
            System.out.println("File of size " + sizeOfFile + " bytes was saved on disk.\n" +
                    "Capacity left to use " + (hardDisc.getCapacity() - hardDisc.getUsedSpace()) + " bytes.");
        } else {
            System.err.println("File size exceeds available space on the hard disk.\n" +
                    "Capacity left to use " + (hardDisc.getCapacity() - hardDisc.getUsedSpace()) + " bytes.");
        }
    }



    public void deleteFile(long sizeOfFile) {
        if (!computerOn) {
            System.err.println("Computer is off, impossible to delete file.");
        } else if (hardDisc != null && hardDisc.getUsedSpace() - sizeOfFile >= 0) {
            hardDisc.setUsedSpace(hardDisc.getUsedSpace() - sizeOfFile);
            System.out.println("File of the size " + sizeOfFile + " bytes has been deleted from the hard disc.\n" + "Capacity left to use  "
                    + (hardDisc.getCapacity() - hardDisc.getUsedSpace()) + " bytes.");
        } else {
            hardDisc.setUsedSpace(hardDisc.getUsedSpace() - sizeOfFile);
            System.out.println("File of the size " + sizeOfFile + " is greater then used space of the hard disc.\nCapacity left to use  "
                    + (hardDisc.getCapacity() - hardDisc.getUsedSpace()) + " bytes.");
        }
    }


    @Override
    public String toString() {
        return "Computer{" +
                "computerOn=" + computerOn +
                ", hardDisc=" + hardDisc +
                ", cpu=" + cpu +
                ", ram=" + ram +
                '}';
    }
}
