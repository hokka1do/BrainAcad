package packages.test;

import packages.transport.Passport;


public class TransportMain {
    public static void main(String[] args) {
        Passport passport = new Passport();
        passport.changeOwner("JOPA");
    }
}
