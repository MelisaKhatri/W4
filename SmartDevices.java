public class SmartDevices {
    public static void main(String[] args) {
        SmartDevice sp = new SmartPhone("Apple", "iPhone 17 Pro");
        SmartDevice sw = new SmartWatch("Apple Watch", "SE Series 9");
        sp.turnOn();
        sp.turnOff();
        sw.turnOn();
        sw.turnOff();
    }
}
abstract class SmartDevice {
    public String brand;
    public String model;
    public SmartDevice(String b, String m) {
        this.brand = b;
        this.model = m;
    }

    public void turnOn() {
        System.out.println("Device is turning on");
    }
    public void turnOff() {
        System.out.println("Device is turning off");
    }
}

class SmartPhone extends SmartDevice {
    public SmartPhone(String b, String m) {
        super(b, m);
    }

    @Override
    public void turnOn() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Lock screen appears");
    }

    @Override
    public void turnOff() {
        System.out.println("Screen locks");
        System.out.println();
    }
}

class SmartWatch extends SmartDevice {

    public SmartWatch(String b, String m) {
        super(b, m);
    }

    @Override
    public void turnOn() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Watch face appears");
    }

    @Override
    public void turnOff() {
        System.out.println("Watch face fades");
    }
}