import java.util.List;

public class PostOffice {
    static final int COUNTRY_POSTOFFICE_CODE = 6;
    private String officeNumber;
    private static List<String> packageList;

    public List<String> getPackageList() {
        return packageList;
    }

    public void setPackageList(List<String> packageList) {
        this.packageList = packageList;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public static void putPackageToList(String a) {
        packageList.add(a);
    }

    static int getPackageVolume(int height, int width, int length) {
        int volume = height * width * length;
        System.out.println("Your volume for package is" + volume);
        return volume;
    }
}