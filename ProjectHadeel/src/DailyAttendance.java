/**
 * Created by USER on 14/03/2021.
 */
public class DailyAttendance {
    private ChildData childNo;
    private String date;
    private String day;
    private String attendance ;
    private String departure;

    public DailyAttendance(ChildData childNo,String date, String day, String attendance, String departure) {
        this.childNo=childNo;
        this.date = date;
        this.day = day;
        this.attendance = attendance;
        this.departure = departure;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public ChildData getChildNo() {
        return childNo;
    }

    public void setChildNo(ChildData childNo) {
        this.childNo = childNo;
    }

    @Override
    public String toString() {
        return "DailyAttendance{" +
                "childNo=" + childNo +
                ", date='" + date + '\'' +
                ", day='" + day + '\'' +
                ", attendance='" + attendance + '\'' +
                ", departure='" + departure + '\'' +
                '}';
    }
}
