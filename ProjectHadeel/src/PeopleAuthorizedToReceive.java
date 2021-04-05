/**
 * Created by USER on 14/03/2021.
 */
public class PeopleAuthorizedToReceive {
    private String Name;
    private int mobilePone;
    private String relativeRelation;
    private ChildData childNo;

    public PeopleAuthorizedToReceive(String name, int mobilePone, String relativeRelation, ChildData childNo) {
        Name = name;
        this.mobilePone = mobilePone;
        this.relativeRelation = relativeRelation;
        this.childNo = childNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMobilePone() {
        return mobilePone;
    }

    public void setMobilePone(int mobilePone) {
        this.mobilePone = mobilePone;
    }

    public String getRelativeRelation() {
        return relativeRelation;
    }

    public void setRelativeRelation(String relativeRelation) {
        this.relativeRelation = relativeRelation;
    }

    public ChildData getChildNo() {
        return childNo;
    }

    public void setChildNo(ChildData childNo) {
        this.childNo = childNo;
    }

    @Override
    public String toString() {
        return "PeopleAuthorizedToReceive{" +
                "Name='" + Name + '\'' +
                ", mobilePone=" + mobilePone +
                ", relativeRelation='" + relativeRelation + '\'' +
                ", childNo=" + childNo +
                '}';
    }
}
