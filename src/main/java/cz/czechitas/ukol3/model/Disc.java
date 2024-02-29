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
        this.usedSpace = usedSpace;
    }

    @Override
    public String toString() {
        return "Hard disc capacity: " + capacity + "\n" +
                "Used space: " + usedSpace + " bytes";
    }
}