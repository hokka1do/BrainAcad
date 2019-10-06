package packages;

import packages.citizen.Passport;

public class Test {
    public static void main(String[] args) {
        packages.citizen.Passport citizenPassport = new Passport("sd","sd");
        packages.technics.Passport technicsPassport = new packages.technics.Passport();
        packages.transport.Passport transportPassport = new packages.transport.Passport();
    }
}
