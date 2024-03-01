package cz.czechitas.ukol3.model;

public class Computer {

    private boolean computerOn;

    private Disc hardDisc;
    private Disc secondHardDisc;
    private Processor cpu;
    private Memory ram;

    public Computer() {
        this.hardDisc = new Disc();
        this.secondHardDisc = new Disc();
    }

    public boolean isComputerOn() {
        return computerOn;
    }

    public Disc getHardDisc() {
        return hardDisc;
    }

    public void setHardDisc(Disc hardDisc) {
        this.hardDisc = hardDisc;
    }

    public Disc getSecondHardDisc() {
        return secondHardDisc;
    }

    public void setSecondHardDisc(Disc secondHardDisc) {
        this.secondHardDisc = secondHardDisc;
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

    /*
    TODO> if  I  rewrite the code as suggested it only writes the first error why?

    public void turnOn() {
        if (cpu == null){ System.err.println("Computer's processor missing.");}
        if (am == null) { System.err.println("Computer's RAM missing.");}
        if (hardDisc == null) { System.err.println("Computer's RAM missing.");}
        else if (computerOn) {
            System.err.println("Computer is on already.");
        }
        else {
            System.out.println("Computer turned on.");
            computerOn = true;}
    }
    */

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
        if (!isComputerOn()) {
            System.err.println("Computer is off, impossible to create file.");
            return;
        }
        if (sizeOfFile <= 0) {
            System.err.println("Invalid file size. Please provide a valid file size.");
        } else if (sizeOfFile <= (hardDisc.getCapacity() - hardDisc.getUsedSpace()) && sizeOfFile >= 0) {
            hardDisc.setUsedSpace(hardDisc.getUsedSpace() + sizeOfFile);
            System.out.println("File of size " + sizeOfFile + " bytes was saved on the first disk." +
                    "Capacity left to use:\nFirst hard disc " + (hardDisc.getCapacity() - hardDisc.getUsedSpace()) + " bytes." +
                    "\nSecond hard disc " + (secondHardDisc.getCapacity() - secondHardDisc.getUsedSpace()) + " bytes.");

        } else if (sizeOfFile >= (hardDisc.getCapacity() - hardDisc.getUsedSpace()) && (hardDisc.getCapacity() - hardDisc.getUsedSpace()) > 0) {
            //podminka

            secondHardDisc.setUsedSpace(sizeOfFile + hardDisc.getUsedSpace() - hardDisc.getCapacity());
            hardDisc.setUsedSpace(hardDisc.getCapacity());

            System.out.println("File of size " + sizeOfFile + " bytes was saved partly on the first disk and partly on the second disk." +
                    "Capacity left to use:\nFirst hard disc " + (hardDisc.getCapacity() - hardDisc.getUsedSpace()) + " bytes." +
                    "\nSecond hard disc " + (secondHardDisc.getCapacity() - secondHardDisc.getUsedSpace()) + " bytes.");

        } else if ((sizeOfFile + secondHardDisc.getUsedSpace()) <= secondHardDisc.getCapacity()) {
            secondHardDisc.setUsedSpace(secondHardDisc.getUsedSpace() + sizeOfFile);
            System.out.println("File of size " + sizeOfFile + " bytes was saved on the second disk.\n" +
                    "Capacity left to use:\nFirst hard disc " + (hardDisc.getCapacity() - hardDisc.getUsedSpace()) + " bytes." +
                    "\nSecond hard disc " + (secondHardDisc.getCapacity() - secondHardDisc.getUsedSpace()) + " bytes.");
        } else {
            System.err.println("File size exceeds available space on both disks.");
        }
    }

    public void deleteFile(long sizeOfFile) {
        if (!isComputerOn()) {
            System.err.println("Computer is off, impossible to delete file.");
            return;
        }
        if (sizeOfFile <= 0) {
            System.err.println("Invalid file size. Please provide a valid file size.");
            return;
        }

        if (sizeOfFile <= secondHardDisc.getUsedSpace()) {
            secondHardDisc.setUsedSpace(secondHardDisc.getUsedSpace() - sizeOfFile);
            System.out.println("File of size " + sizeOfFile + " bytes was deleted from the second disk.\n" +
                    "Capacity left to use:\nFirst hard disc " + (hardDisc.getCapacity() - hardDisc.getUsedSpace()) + " bytes." +
                    "\nSecond hard disc " + (secondHardDisc.getCapacity() - secondHardDisc.getUsedSpace()) + " bytes.");

        } else if (sizeOfFile > secondHardDisc.getUsedSpace() && secondHardDisc.getUsedSpace() > 0) {
            hardDisc.setUsedSpace(sizeOfFile - secondHardDisc.getCapacity() + secondHardDisc.getUsedSpace());
            secondHardDisc.setUsedSpace(0);

            System.out.println("File of size " + sizeOfFile + " bytes was deleted partly from the first disk and partly from the second disk." +
                    "Capacity left to use:\nFirst hard disc " + (hardDisc.getCapacity() - hardDisc.getUsedSpace()) + " bytes." +
                    "\nSecond hard disc " + (secondHardDisc.getCapacity() - secondHardDisc.getUsedSpace()) + " bytes.");

        } else if (sizeOfFile <= hardDisc.getUsedSpace()) {
            hardDisc.setUsedSpace(hardDisc.getUsedSpace() - sizeOfFile);
            System.out.println("File of size " + sizeOfFile + " bytes was deleted from the first disk." +
                    "Capacity left to use:\nFirst hard disc " + (hardDisc.getCapacity() - hardDisc.getUsedSpace()) + " bytes." +
                    "\nSecond hard disc " + (secondHardDisc.getCapacity() - secondHardDisc.getUsedSpace()) + " bytes.");

        } else {
            System.err.println("File size exceeds total used space on both disks.");

        }
    }


//TODO> In case the code above and part 3 of the homework is wrong, I stick just with the part one and two
/*
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
*/

    @Override
    public String toString() {
        return "Computer{" +
                "computerOn=" + computerOn +
                ", hardDisc=" + hardDisc +
                ", secondHardDisc=" + secondHardDisc +
                ", cpu=" + cpu +
                ", ram=" + ram +
                '}';
    }
}
