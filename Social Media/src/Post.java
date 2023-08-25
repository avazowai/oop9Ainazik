import java.time.LocalDate;
import java.util.Arrays;

public class Post {





    private String image;
    private String description;
    private LocalDate created;
    private Comment[] comments;
    private int instanceId;

    public Post(String image, String description, LocalDate created, Comment[] comments) {
        this.image = image;
        this.description = description;
        this.created = created;
        this.comments = comments;
        for (int i = 0; i < comments.length; i++) {
            comments[i].setInstanceId(i+1-1);

        }

    }


    public void setInstanceId(int instanceId) {
        this.instanceId = instanceId;
    }

    public int getInstanceId() {
        return instanceId;
    }

    public String getImage() {
        return image;
    }

    public Comment[] getComments() {
        return comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }

    public Comment[] findCommentByPostId(int postId) {
        for (int i = 0; i < comments.length; i++) {
            if (comments[i].getInstanceId() == postId) {
                System.out.println(comments[i]);

            }
        }
        return comments;
    }

    public void updateComment(int commentId, String newText) {
        for (Comment cc : comments) {
            if (cc.getInstanceId() == commentId) {
                cc.setText(newText);
                System.out.println(cc);
            }
        }

    }

    @Override
    public String toString() {
        return "Post{" +
                "instanceId=" + instanceId +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", created=" + created +
                ", comments=" + Arrays.toString(comments) +
                '}';
    }
}



