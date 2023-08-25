import java.util.Arrays;

public class User {

    private String username;
    private String email;
    private int password;
    public static int next = 0;
    private int instanceId;
    private Profile profile;

    public User(String username, String email, int password, Profile profile) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.profile = profile;
        this.instanceId = next++;
        profile.setInstanceId(instanceId);
    }

    public Profile getProfile() {
        return profile;
    }

    public int getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(int instanceId) {
        this.instanceId = instanceId;
    }


    public void setProfile(Profile profile) {
        this.profile = profile;
    }



    public String searchPost(String description) {
        for (int i = 0; i < getProfile().getPosts().length; i++) {
            if (getProfile().getPosts()[i].getImage().equals(description)) {
                return "Founded" + getProfile().getPosts()[i];
            }
        }
        return null;
    }


    public void deletePost(int Id) {
        Post[] userPosts = getProfile().getPosts();

        int indexToRemove = -1;
        for (int i = 0; i < userPosts.length; i++) {
            if (userPosts[i].getInstanceId() == Id) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            Post[] newPosts = new Post[userPosts.length - 1];
            int newIndex = 0;

            for (int i = 0; i < userPosts.length; i++) {
                if (i != indexToRemove) {
                    newPosts[newIndex] = userPosts[i];
                    newIndex++;
                }
            }

            getProfile().setPosts(newPosts);
            for(int j=0; j<newPosts.length; j++){
                newPosts[j].setInstanceId(j);

            /*for (int j = 0; j < getProfile().getPosts().length; j++) {
                getProfile().getPosts()[j].setInstanceId(j);
                User.next = j + 1;
             */

            }

        }}

    @Override
    public String toString() {
        return "\nUser{" +
                "instanceId=" + instanceId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                ", profile=" + profile +
                '}';
    }
}
}