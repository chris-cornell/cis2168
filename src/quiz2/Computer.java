//The class Computer covered in Chapter 1.

package linkedlist_app;

/*<listing chapter="1" number="2">*/
/**
 * Listing 1.2
 *
 * @author Koffman & Wolfgang
 */

/**
 * Class that represents a computer.
 */
public class Computer {
    // Data Fields
    private String manufacturer;
    private String processor;
    private double ramSize;
    private int diskSize;
    private double processorSpeed;

    // Methods
    /**
     * Initializes a Computer object with all properties specified.
     *
     * @param man The computer manufacturer
     * @param processor The processor type
     * @param ram The RAM size
     * @param disk The disk size
     * @param procSpeed The processor speed
     */
    public Computer(String man, String processor, double ram,
            int disk, double procSpeed) {
        manufacturer = man;
        this.processor = processor;
        ramSize = ram;
        diskSize = disk;
        processorSpeed = procSpeed;
    }

    public double computePower() {
        return ramSize * processorSpeed;
    }

    public double getRamSize() {
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public int getDiskSize() {
        return diskSize;
    }
    
    
    @Override
    public String toString() {
        String result = "Manufacturer: " + manufacturer + "\nCPU: "
                + processor + "\nRAM: " + ramSize + " gigabytes"
                + "\nDisk: " + diskSize + " gigabytes"
                + "\nProcessor speed: " + processorSpeed + " gigahertz";

        return result;
    }
   
    // Insert other accessor and modifier methods here.

    /**
     * Compares power of this computer and it argument computer
     *
     * @param aComputer The computer being compared to this computer
     *
     * @return -1 if this computer has less power, 0 if the same, and +1 if this
     * computer has more power.
     */
    public int comparePower(Computer aComputer) {
        if (this.computePower() < aComputer.computePower()) {
            return -1;
        } else if (this.computePower() == aComputer.computePower()) {
            return 0;
        } else {
            return 1;
        }
    }
    
}
/*</listing>*/
