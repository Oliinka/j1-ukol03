//HardDisc
package cz.czechitas.ukol3;

public class HardDisc {
    long capacity = 910L;
    long usedSpace;

    public HardDisc() {
    }

    public long getCapacity() {
        return capacity = 910L;
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

    public String toString(){
        return  "Capacity of the Hard Disc: " + capacity+ " GB"+"\n" +
                "Used space: " + usedSpace + " GB"+"\n"+
                "Free space: " + (capacity-usedSpace)  + " GB";

    }
}

