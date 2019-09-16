package packages.test;

import packages.technics.Passport;
import packages.technics.PassportUtil;

import java.util.Date;

public class TechnicsMain {
    public static void main(String[] args) {
        Passport passport = new Passport();
    passport.setWarrantyStartDate(new Date());
        PassportUtil.warrantyReplace(passport);
    }
}
