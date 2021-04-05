/**
 * Created by USER on 14/03/2021.
 */
public class ParentData {
    private String fatherName;
    private String fatherNationality;
    private String fatherJob;
    private String fatherWorkAddress;
    private String fatherMobilPhone;
    private String fatherWorkPhone;
    private String HousePhone;
    private String MotherName;
    private String MotherNationality;
    private String MotherJob;
    private String MotherWorkAddress;
    private String MotherMobilPhone;
    private String MotherWorkPhone;
    private String FirstEmail;
    private String SecondEmail;
    private ChildData childNo;



    public ParentData(String fatherName, String fatherNationality, String fatherJob,
                      String fatherWorkAddress, String fatherMobilPhone, String fatherWorkPhone,
                      String housePhone, String motherName, String motherNationality, String motherJob,
                      String motherWorkAddress, String motherMobilPhone, String motherWorkPhone,
                      String firstEmail, String secondEmail, ChildData childNo) {
        this.fatherName = fatherName;
        this.fatherNationality = fatherNationality;
        this.fatherJob = fatherJob;
        this.fatherWorkAddress = fatherWorkAddress;
        this.fatherMobilPhone = fatherMobilPhone;
        this.fatherWorkPhone = fatherWorkPhone;
        HousePhone = housePhone;
        MotherName = motherName;
        MotherNationality = motherNationality;
        MotherJob = motherJob;
        MotherWorkAddress = motherWorkAddress;
        MotherMobilPhone = motherMobilPhone;
        MotherWorkPhone = motherWorkPhone;
        FirstEmail = firstEmail;
        SecondEmail = secondEmail;
        this.childNo = childNo;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherNationality() {
        return fatherNationality;
    }

    public void setFatherNationality(String fatherNationality) {
        this.fatherNationality = fatherNationality;
    }

    public String getFatherJob() {
        return fatherJob;
    }

    public void setFatherJob(String fatherJob) {
        this.fatherJob = fatherJob;
    }

    public String getFatherWorkAddress() {
        return fatherWorkAddress;
    }

    public void setFatherWorkAddress(String fatherWorkAddress) {
        this.fatherWorkAddress = fatherWorkAddress;
    }

    public String getFatherMobilPhone() {
        return fatherMobilPhone;
    }

    public void setFatherMobilPhone(String fatherMobilPhone) {
        this.fatherMobilPhone = fatherMobilPhone;
    }

    public String getFatherWorkPhone() {
        return fatherWorkPhone;
    }

    public void setFatherWorkPhone(String fatherWorkPhone) {
        this.fatherWorkPhone = fatherWorkPhone;
    }

    public String getHousePhone() {
        return HousePhone;
    }

    public void setHousePhone(String housePhone) {
        HousePhone = housePhone;
    }

    public String getMotherName() {
        return MotherName;
    }

    public void setMotherName(String motherName) {
        MotherName = motherName;
    }

    public String getMotherNationality() {
        return MotherNationality;
    }

    public void setMotherNationality(String motherNationality) {
        MotherNationality = motherNationality;
    }

    public String getMotherJob() {
        return MotherJob;
    }

    public void setMotherJob(String motherJob) {
        MotherJob = motherJob;
    }

    public String getMotherWorkAddress() {
        return MotherWorkAddress;
    }

    public void setMotherWorkAddress(String motherWorkAddress) {
        MotherWorkAddress = motherWorkAddress;
    }

    public String getMotherMobilPhone() {
        return MotherMobilPhone;
    }

    public void setMotherMobilPhone(String motherMobilPhone) {
        MotherMobilPhone = motherMobilPhone;
    }

    public String getMotherWorkPhone() {
        return MotherWorkPhone;
    }

    public void setMotherWorkPhone(String motherWorkPhone) {
        MotherWorkPhone = motherWorkPhone;
    }

    public String getFirstEmail() {
        return FirstEmail;
    }

    public void setFirstEmail(String firstEmail) {
        FirstEmail = firstEmail;
    }

    public String getSecondEmail() {
        return SecondEmail;
    }

    public void setSecondEmail(String secondEmail) {
        SecondEmail = secondEmail;
    }

    public ChildData getChildNo() {
        return childNo;
    }

    public void setChildNo(ChildData childNo) {
        this.childNo = childNo;
    }

    @Override
    public String toString() {
        return "ParentData{" +
                "fatherName='" + fatherName + '\'' +
                ", fatherNationality='" + fatherNationality + '\'' +
                ", fatherJob='" + fatherJob + '\'' +
                ", fatherWorkAddress='" + fatherWorkAddress + '\'' +
                ", fatherMobilPhone='" + fatherMobilPhone + '\'' +
                ", fatherWorkPhone='" + fatherWorkPhone + '\'' +
                ", HousePhone='" + HousePhone + '\'' +
                ", MotherName='" + MotherName + '\'' +
                ", MotherNationality='" + MotherNationality + '\'' +
                ", MotherJob='" + MotherJob + '\'' +
                ", MotherWorkAddress='" + MotherWorkAddress + '\'' +
                ", MotherMobilPhone='" + MotherMobilPhone + '\'' +
                ", MotherWorkPhone='" + MotherWorkPhone + '\'' +
                ", FirstEmail='" + FirstEmail + '\'' +
                ", SecondEmail='" + SecondEmail + '\'' +
                ", childNo=" + childNo +
                '}';
    }
}
