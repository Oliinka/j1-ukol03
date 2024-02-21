//RamMemory
package cz.czechitas.ukol3;

public class RamMemory {
    private long capacity;

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public String toString() {
        return "Installed RAM: " + capacity + " GB" + "\n"+
                "Usable RAM: " + (capacity - 0.1) + "GB";
    }
}

