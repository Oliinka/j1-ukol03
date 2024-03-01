package cz.czechitas.ukol3.model;

public class Disc {
    private long capacity;
    private long usedSpace;

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public long getUsedSpace() {
        return usedSpace;
    }

    public void setUsedSpace(long usedSpace) {
        if (usedSpace < 0) {
            System.err.println("Used space on the disk cannot be negative.");
        } else if (usedSpace > capacity) {
            System.err.println("File unsaved. Hard disk capacity has been exceeded.\nCapacity left to use "
                    + (capacity - getUsedSpace()) + " bytes.");
        } else {
            this.usedSpace = usedSpace;
        }
    }

    @Override
    public String toString() {
        return "Hard disc capacity: " + capacity + "\n" +
                "Used space: " + usedSpace + " bytes";
    }
}