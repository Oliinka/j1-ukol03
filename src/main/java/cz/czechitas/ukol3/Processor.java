package cz.czechitas.ukol3;

public class Processor {
    private String brand ="Intel(R) Core(TM) i7-4510U CPU";
    private long speed = 2L;

    public Processor(String brand, long speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(long speed) {
        this.speed = speed;
    }

    public String toString(){
        return  "Brand of the processor: " + brand+ "\n" +
                "Speed of the processor: " + speed + " GHz"+"\n";

    }
}
