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
        if (usedSpace > capacity) {
            System.err.println("Disc has run out of the capacity.");
            return;
        } else if (usedSpace < 0) {
            System.err.println("Impossible to delete file.\n Size of the file is greater then used space of the hard disc.");
            return;
        }
        this.usedSpace = usedSpace;
    }

    @Override
    public String toString() {
        return "Hard disc capacity: " + capacity + "\n" +
                "Used space: " + usedSpace + " bytes";
    }
}