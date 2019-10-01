package lab15;

public abstract class AbstractDevice {
    String name;
    int serialNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public abstract void powerOn();

    public abstract void powerOff();

    public AbstractDevice() {
        powerOn();
    }
}
