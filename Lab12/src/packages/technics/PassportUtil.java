package packages.technics;

import java.util.Date;

public class PassportUtil {
    public static void warrantyReplace(Passport passport) {
        passport.warrantyStartDate = new Date();
    }
}
