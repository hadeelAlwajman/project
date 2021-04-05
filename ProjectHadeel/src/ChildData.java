import java.util.Date;

/**
 * Created by USER on 14/03/2021.
 */
public class ChildData {
    private int childNo;
    private String FirstName;//الاسم الاول
    private String FatherName;//الاسم الثاني
    private String FamilyName;//
    private String Sex;//الجنس
    private String Nationality;//الجنسية
    private String   BirthDate;//تاريخ الميلاد
    private String PlaceBirth;//مكان الميلاد
    private String Address;//العنوان
    private String Level;//المستوى
    private String   DateStartUpPermanence;//تاريخ بدء الدوام
    private String childStatus;

    public ChildData() {
    }

    public ChildData(int childNo, String firstName, String fatherName, String familyName, String level) {
        this.childNo = childNo;
        FirstName = firstName;
        FatherName = fatherName;
        FamilyName = familyName;
        Level = level;
    }

    public ChildData( int childNo, String firstName, String fatherName, String familyName, String sex, String nationality, String birthDate, String placeBirth, String address, String level, String dateStartUpPermanence, String childStatus) {
        this.childNo = childNo;
        FirstName = firstName;
        FatherName = fatherName;
        FamilyName = familyName;
        Sex = sex;
        Nationality = nationality;
        BirthDate = birthDate;
        PlaceBirth = placeBirth;
        Address = address;
        Level = level;
        DateStartUpPermanence = dateStartUpPermanence;
        this.childStatus = childStatus;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public void setFamilyName(String familyName) {
        FamilyName = familyName;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public void setPlaceBirth(String placeBirth) {
        PlaceBirth = placeBirth;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public void setDateStartUpPermanence(String dateStartUpPermanence) {
        DateStartUpPermanence = dateStartUpPermanence;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getFatherName() {
        return FatherName;
    }

    public String getFamilyName() {
        return FamilyName;
    }

    public String getSex() {
        return Sex;
    }

    public String getNationality() {
        return Nationality;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public String getPlaceBirth() {
        return PlaceBirth;
    }

    public String getAddress() {
        return Address;
    }

    public String getLevel() {
        return Level;
    }

    public String getDateStartUpPermanence() {
        return DateStartUpPermanence;
    }

    public int getChildNo() {
        return childNo;
    }

    public void setChildNo(int childNo) {
        this.childNo = childNo;
    }

    public String getChildStatus() {
        return childStatus;
    }

    public void setChildStatus(String childStatus) {
        this.childStatus = childStatus;
    }

    @Override
    public String toString() {
        return "ChildData{" +
                "childNo=" + childNo +
                ", FirstName='" + FirstName + '\'' +
                ", FatherName='" + FatherName + '\'' +
                ", FamilyName='" + FamilyName + '\'' +
                ", Sex='" + Sex + '\'' +
                ", Nationality='" + Nationality + '\'' +
                ", BirthDate='" + BirthDate + '\'' +
                ", PlaceBirth='" + PlaceBirth + '\'' +
                ", Address='" + Address + '\'' +
                ", Level='" + Level + '\'' +
                ", DateStartUpPermanence='" + DateStartUpPermanence + '\'' +
                '}';
    }

}
