package cz.czechitas.ukol3.model;

public class Memory {
    private long capacity;

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Installed RAM: " + getCapacity() + " bytes";
    }
}