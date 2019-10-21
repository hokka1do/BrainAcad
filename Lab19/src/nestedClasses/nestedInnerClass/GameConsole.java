package nestedClasses.nestedInnerClass;

public class GameConsole {

    String brand;
    String model;
    String serial;
    Object firstGamepad;
    Object secondGamepad;
    boolean isOn;

    public GameConsole(String brand, String serial) {
        this.brand = brand;
        this.serial = serial;

    }

    class Gamepad {
        private final String brand;
        private final int connectedNumber;
        private String consoleSerial = serial;
        String color;
        double chargeLevel = 100.0;

        public Gamepad(String brand, int connectedNumber) {
            this.brand = brand;
            this.connectedNumber = connectedNumber;
            Gamepad gamepad1 = new Gamepad((String) firstGamepad, 1);
            Gamepad gamepad2 = new Gamepad((String) secondGamepad, 2);
        }

        public String getBrand() {
            return brand;
        }

        public int getConnectedNumber() {
            return connectedNumber;
        }

        public String getConsoleSerial() {
            return consoleSerial;
        }

        public String getColor() {
            return color;
        }

        public double getChargeLevel() {
            return chargeLevel;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setChargeLevel(double chargeLevel) {
            this.chargeLevel = chargeLevel;
        }

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public static interface Powered {
        public static void powerOn() {

        }
    }
}

