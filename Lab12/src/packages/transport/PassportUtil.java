package packages.transport;

class PassportUtil {
    public static void changeOwner(Passport passport,String newOwnerName) {
        Passport passport1 = passport;
        passport1.setOwnerName(newOwnerName);
    }
}
