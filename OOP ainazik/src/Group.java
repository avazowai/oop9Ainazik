import java.util.Arrays;
public class Group {
    private String groupName;
    private double startDate;
    private String mentor;

    public Group(String groupName, double startDate, String mentor) {
        this.groupName = groupName;
        this.startDate = startDate;
        this.mentor = mentor;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", startDate=" + startDate +
                ", mentor='" + mentor + '\'' +
                '}';
    }
}