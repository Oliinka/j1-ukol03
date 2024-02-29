package cz.czechitas.ukol3.model;

public class Computer {

    private boolean computerOn;

    private Disc hardDisc = null;
    private Processor cpu = null;
    private Memory ram = null;

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
        long freeSpaceOnDisc = hardDisc.getCapacity() - hardDisc.getUsedSpace();
        if (!computerOn) {
            System.err.println("Computer is off, impossible to delete file.");
        }
        if ((sizeOfFile < freeSpaceOnDisc) && (0 < sizeOfFile)) {
            hardDisc.setCapacity(hardDisc.getCapacity() - sizeOfFile);
            hardDisc.setUsedSpace(hardDisc.getUsedSpace() + sizeOfFile);
            System.out.println("File of the size " + sizeOfFile + " bytes was saved on disc.\n" + "Capacity left to use " + hardDisc.getCapacity() + " bytes.");
        } else {
            System.err.println("File unsaved. Hard disk capacity has been exceeded.\nCapacity left to use " + hardDisc.getCapacity() + " bytes.");
        }
    }


    public void deleteFile(long sizeOfFile) {
        if (!computerOn) {
            System.err.println("Computer is off, impossible to delete file.");
        }
        if (hardDisc != null && hardDisc.getUsedSpace() - sizeOfFile >= 0) {
            hardDisc.setUsedSpace(hardDisc.getUsedSpace() - sizeOfFile);
            System.out.println("File of the size " + sizeOfFile + " bytes has been deleted from the hard disc.\n" + "Capacity left to use  " + hardDisc.getCapacity() + " bytes.");
        } else {
            hardDisc.setUsedSpace(hardDisc.getUsedSpace() - sizeOfFile);
            System.out.println("File of the size " + sizeOfFile + " is greater then used space of the hard disc.\nCapacity left to use  " + hardDisc.getUsedSpace() + " bytes.");
        }
}


@Override
public String toString() {
    String result = "Computer informations:\n";

    if (cpu != null) {
        result += "Processor:\n" + cpu.toString() + "\n";
    } else {
        result += "Processor is not set up.\n";
    }

    if (ram != null) {
        result += "RAM:\n" + ram.toString() + "\n";
    } else {
        result += "RAM is not set up.\n";
    }

    if (hardDisc != null) {
        result += "Hard disc:\n" + hardDisc.toString();
    } else {
        result += "Hard disc is not set up.";
    }

    return result;
}

}
