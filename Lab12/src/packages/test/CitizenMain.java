package packages.test;

import packages.citizen.Passport;
import packages.citizen.PassportUtil;

public class CitizenMain {
    public static void main(String[] args) {
        Passport passport = new Passport("Alfach","Centaur");
        PassportUtil.marriageRegistrate(passport,new Passport("Dunya","Afanasievna"));
    }

}
