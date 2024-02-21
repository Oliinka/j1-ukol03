package cz.czechitas.ukol3;

public class Processor {
    private final String brand;
    private final long speed;

    public Processor(String processorBrand, long speed) {
        this.brand = processorBrand;
        this.speed = speed;
    }

    public String toString(){
        return  "Brand of the processor: " + brand+ "\n" +
                "Speed of the processor: " + speed + " GHz"+"\n";

    }
}
