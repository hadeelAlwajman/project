import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by USER on 21/03/2021.
 */
public class ManagerOperation {
    Connection c;
    int num = 0;
    ChildData d;
    CircularLinkedList<ChildData> child = new CircularLinkedList<>();
    ArrayList<ParentData> parent = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void addChild(int childNo, String firstName, String fatherName, String familyName,
                         String sex, String nationality, String birthDate, String placeBirth,
                         String address, String level, String dateStartUpPermanence, String childStatus) {
        child.addLast(new ChildData(childNo, firstName, fatherName, familyName, sex, nationality, birthDate, placeBirth, address, level, dateStartUpPermanence, childStatus));

    }

    public ChildData searchChild(int childNo) {
        while (!child.isEmpty() || num != 1) {
            d = (ChildData) child.First();
            if (child.First().getChildNo() == childNo) {
                num = 1;
                return d;
            } else child.rotate();
        }
        return null;
    }


    public boolean deleteChild(int childNo){
    while (!child.isEmpty()){
        if (child.First().getChildNo()==childNo){
            child.removeFirst();
            return true;
        }
        else child.rotate();
    }
    return false;
    }
    public boolean editChild(int childNo, String firstName, String fatherName, String familyName,
                         String sex, String nationality, String birthDate, String placeBirth,
                         String address, String level, String dateStartUpPermanence, String childStatus){
        while (!child.isEmpty()){
            if (child.First().getChildNo()==childNo){
                child.First().setFirstName(firstName);
                child.First().setFatherName(fatherName);
                child.First().setFamilyName(familyName);
                child.First().setSex(sex);
                child.First().setNationality(nationality);
                child.First().setBirthDate(birthDate);
                child.First().setPlaceBirth(placeBirth);
                child.First().setAddress(address);
                child.First().setLevel(level);
                child.First().setDateStartUpPermanence(dateStartUpPermanence);
                child.First().setChildStatus(childStatus);
                return true;
            }
            else child.rotate();
        }
        return false;
    }

    public void viewChild(){
        int n=child.size();
        for (int i = 0; i <n ; i++) {
            System.out.println(child.First());
            child.rotate();
        }
    }




























//    public void viewChildData(){
//        try
//        {
//            Connection c=DriverManager.getConnection("jdbc:ucanaccess:E:\\Child.accdb");
//            Statement s=c.createStatement();
//            ResultSet rs=s.executeQuery("SELECT * FROM ChildNo");
//            while (rs.next()){
//                System.out.println(rs.getInt("childNo")+"  "+rs.getString("firstName")+"  "+rs.getString("fatherName")
//                        +"  "+rs.getString("familyName")+"  "+rs.getString("sex")+"  "+rs.getString("nationality")
//                        +"  "+rs.getString("birthDate")+"  "+rs.getString("placeBirth")+"  "+ rs.getString("address")
//                        +"  "+rs.getString("level")+"  "+rs.getString("dateStartUpPermanence")+"  "+rs.getString("childStatus"));
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public void addParent(String fatherName, String fatherNationality, String fatherJob,
//                          String fatherWorkAddress, String fatherMobilPhone, String fatherWorkPhone,
//                          String housePhone, String motherName, String motherNationality, String motherJob,
//                          String motherWorkAddress, String motherMobilPhone, String motherWorkPhone,
//                          String firstEmail, String secondEmail, ChildData childNo){
//        parent.add(new ParentData(fatherName,  fatherNationality,  fatherJob,
//                fatherWorkAddress,  fatherMobilPhone,  fatherWorkPhone,
//                 housePhone, motherName,  motherNationality,  motherJob,
//                motherWorkAddress,  motherMobilPhone,  motherWorkPhone,
//                 firstEmail,  secondEmail,  childNo));
//        try {
//            Connection c=DriverManager.getConnection("jdbc:ucanaccess:E:\\Child.accdb");
//            PreparedStatement st;
//            st=c.prepareStatement("insert into Parent(fatherName,  fatherNationality,  fatherJob,fatherWorkAddress,  fatherMobilPhone,  fatherWorkPhone, housePhone, motherName,  motherNationality,  motherJob, motherWorkAddress,  motherMobilPhone,  motherWorkPhone," +
//                    " firstEmail,  secondEmail,  childNo('"+fatherName+  fatherNationality+ fatherJob+fatherWorkAddress+fatherMobilPhone+  fatherWorkPhone+ housePhone+motherName+  motherNationality+motherJob+ motherWorkAddress+  motherMobilPhone+ motherWorkPhone+
//                    firstEmail+ secondEmail+ childNo);
//            st.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public void searchParentData(ChildData childNo){
//        try {
//            Connection c=DriverManager.getConnection("jdbc:ucanaccess:E:\\Child.accdb");
//            Statement s=c.createStatement();
//            String statement="SELECT * FROM ChildData where childNo="+childNo;
//            ResultSet rs=s.executeQuery(statement);
//            while (rs.next()){
//                System.out.println(rs.getString("fatherName")+"  "+rs.getString("fatherNationality")+"  "+rs.getString("fatherJob")+"  " +
//                        rs.getString("fatherWorkAddress")+"  "+rs.getString("fatherMobilPhone")+"  "+rs.getString("fatherWorkPhone")+"  "+
//                        rs.getString("housePhone")+"  "+rs.getString("motherName")+"  "+rs.getString("motherNationality")+"  "+
//                        rs.getString("motherJob")+"  "+rs.getString("motherWorkAddress")+"  "+rs.getString("motherMobilPhone")+"  "+
//                        rs.getString("motherWorkPhone")+"  "+rs.getString("firstEmail")+"  "+rs.getString("secondEmail")+"  "+rs.getString("childNo"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//    public void deleteParent(ChildData childNo){
//        try{
//            Connection c=DriverManager.getConnection("jdbc:ucanaccess:E:\\Child.accdb");
//            Statement st=c.createStatement();
//            String statement="delete from parent Data where childNo= "+childNo;
//            int i=st.executeUpdate(statement);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public void viewParent(){
//        try
//        {
//            Connection c=DriverManager.getConnection("jdbc:ucanaccess:E:\\Child.accdb");
//            Statement s=c.createStatement();
//            ResultSet rs=s.executeQuery("SELECT * FROM ChildNo");
//            while (rs.next()) {
//                System.out.println(rs.getString("fatherName")+"  "+rs.getString("fatherNationality")+"  "+rs.getString("fatherJob")
//                        +"  "+rs.getString(" fatherWorkAddress")+"  "+rs.getString("fatherMobilPhone")+"  "+rs.getString("fatherWorkPhone")
//                        +"  "+rs.getString("HousePhone")+"  "+rs.getString("MotherName")+"  "+ rs.getString("MotherNationality")
//                        +"  "+rs.getString("MotherJob")+"  "+rs.getString("MotherWorkAddress")+"  "+rs.getString("MotherMobilPhone")
//                        +"  "+rs.getString("MotherWorkPhone")+"  "+rs.getString("FirstEmail")+"  "+rs.getString("SecondEmail")+"  "+rs.getString("childNo"));
//            }
//            } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public void addPeopleAuthorizedToReceive(String name, int mobilePone, String relativeRelation, ChildData childNo) {
//        try {
//            Connection c = DriverManager.getConnection("jdbc:ucanaccess:E:\\Child.accdb");
//            PreparedStatement s;
//            s = c.prepareStatement("insert into PeopleAuthorizedToReceive (name,mobilePone,relativeRelation,childNo )values('"+name+mobilePone+relativeRelation+childNo);
//            s.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//    public void searchPeopleAuthorizedToReceive(ChildData childNo){
//        try {
//            Connection c=DriverManager.getConnection("jdbc:ucanaccess:E:\\Child.accdb");
//            Statement s=c.createStatement();
//            String statement="SELECT * FROM ChildData where childNo="+childNo;
//            ResultSet rs=s.executeQuery(statement);
//            while (rs.next()){
//                System.out.println(rs.getString("name")+"  "+rs.getInt("mobilePone")+"  "+rs.getString("relativeRelation")+"  " +
//                       rs.getString("childNo"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public void deletePeopleAuthorizedToReceive(ChildData childNo){
//        try{
//            Connection c=DriverManager.getConnection("jdbc:ucanaccess:E:\\Child.accdb");
//            Statement st=c.createStatement();
//            String statement="delete from PeopleAuthorizedToReceive where childNo= "+childNo;
//            int i=st.executeUpdate(statement);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public void viewPeopleAuthorizedToReceive(ChildData childNo){
//        try
//        {
//            Connection c=DriverManager.getConnection("jdbc:ucanaccess:E:\\Child.accdb");
//            Statement s=c.createStatement();
//            ResultSet rs=s.executeQuery("SELECT * FROM ChildNo");
//            while (rs.next()) {
//                System.out.println(rs.getString("name")+"  "+rs.getInt("mobilePone")+"  "+rs.getString("relativeRelation")
//                        +"  "+rs.getString("childNo"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public void addDailyAttendance(ChildData childNo,String date, String day, String attendance, String departure){
//        try {
//            Connection c = DriverManager.getConnection("jdbc:ucanaccess:E:\\Child.accdb");
//            PreparedStatement s;
//            s = c.prepareStatement("insert into DailyAttendance  (name,data,day,attendance,departure )values('"+childNo+date+day+attendance+departure);
//            s.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//    public void searchDailyAttendance(ChildData childNo){
//        try {
//            Connection c=DriverManager.getConnection("jdbc:ucanaccess:E:\\Child.accdb");
//            Statement s=c.createStatement();
//            String statement="SELECT * FROM DailyAttendance where childNo="+childNo;
//            ResultSet rs=s.executeQuery(statement);
//            while (rs.next()){
//                System.out.println(rs.getString("childNo")+"  "+rs.getString("date")+"  "+rs.getString("day")+"  " +
//                        rs.getString("attendance")+"  "+rs.getString("departure"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public void viewDailyAttendance(ChildData childNo){
//        try
//        {
//            Connection c=DriverManager.getConnection("jdbc:ucanaccess:E:\\Child.accdb");
//            Statement s=c.createStatement();
//            ResultSet rs=s.executeQuery("SELECT * FROM ChildNo");
//            while (rs.next()) {
//                System.out.println(rs.getString("childNo")+"  "+rs.getString("date")+"  "+rs.getString("day")
//                        +"  "+rs.getString("attendance")+"  "+rs.getString("departure"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

}
