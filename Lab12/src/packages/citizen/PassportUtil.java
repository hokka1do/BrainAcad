package packages.citizen;

public class PassportUtil {
    public static void marriageRegistrate(Passport passport, Passport passport2) {
        passport.setSpouseId(passport2.getIdNumber());
        passport2.setSpouseId(passport.getIdNumber());
    }
}
