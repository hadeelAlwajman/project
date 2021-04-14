import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by USER on 21/03/2021.
 */
public class ManagerOperation {
    Connection c;
    int num = 1;
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






























}
