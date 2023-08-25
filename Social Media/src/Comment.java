
import java.time.LocalDate;

public class Comment {


    private int instanceId;
    private String text;
    private LocalDate commentDate;

    public Comment(String text, LocalDate commentDate) {
        this.text = text;
        this.commentDate = commentDate;

    }

    public int getInstanceId() {
        return instanceId;
    }



    public void setText(String text) {
        this.text = text;
    }

    public void setInstanceId(int instanceId) {
        this.instanceId = instanceId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "instanceId=" + instanceId +
                ", text='" + text + '\'' +
                ", commentDate=" + commentDate +
                '}';
    }
}



















