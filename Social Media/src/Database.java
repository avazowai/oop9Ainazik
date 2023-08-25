
import java.util.Arrays;

public class Database {

    private Profile[] profiles;
    private User[] user;



    public Database(Profile[] profiles, User[] users) {
        this.profiles = profiles;
        this.user = users;
    }



    public User [] saveUser(User users) {
        for (User pp : user) {
            if (!pp.equals(users)) {
                User[] ppp = new User[user.length + 1];
                for (int i = 0; i < user.length; i++) {
                    ppp[i] = user[i];
                }
                ppp[user.length] = users;
                user = Arrays.copyOf(ppp, ppp.length-1);

                return user;
            }
            for(int j=0; j<user.length; j++){
                user[j].setInstanceId(j);
            }}
        return null;
    }


    public User [] saveUser2(User users) {
        boolean userExists = false;

        for (User existingUser : user) {
            if (existingUser.equals(users)) {
                userExists = true;
                break;
            }
        }

        if (!userExists) {
            User[] updatedUsers = Arrays.copyOf(user, user.length + 1);
            updatedUsers[user.length] = users;
            user = updatedUsers;

            for (int j = 0; j < user.length; j++) {
                user[j].setInstanceId(j);
            }
        }

        return user; // Return the updated user array
    }
    public void findProfileByUserId(int userId) {
        for (int i = 0; i < user.length; i++) {
            if (user[i].getInstanceId() == userId) {
                System.out.println(profiles[i]);
            }
        }
    }

    public Comment saveComment2222(int postId, int userId, Comment comment) {
        for (int i = 0; i < profiles.length; i++) {
            if (profiles[i].getInstanceId() == userId) {
                for (Post p : profiles[i].getPosts()) {
                    if (p.getInstanceId() == postId) {
                        Comment[] oldComments = p.getComments();
                        Comment[] newComments = new Comment[oldComments.length + 1];

                        for (int j = 0; j < oldComments.length; j++) {
                            newComments[j] = oldComments[j];
                        }

                        newComments[oldComments.length] = comment;
                        p.setComments(newComments);

                        for (int j = 0; j < newComments.length; j++) {
                            comment.setInstanceId(j);
                            User.next = j + 1;
                        }

                        System.out.println(profiles[i]);
                        return comment;
                    }

                }
            }
        }
        return null;
    }



    public User[] deleteUser2(int userId) {
        int indexToRemove = -1;
        for (int i = 0; i < user.length; i++) {

            if (user[i].getInstanceId() == userId) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            User[] arr = new User[user.length + 1];
            int j = 0;
            for (int i = 0; i < user.length; i++) {
                if (i != indexToRemove) {
                    arr[i] = user[i];
                    j++;
                    // System.out.println(user[i]);
                }
            }
            user = Arrays.copyOf(arr, arr.length - 1);
        }
        return user;

    }



    public void saveProfileByUserId(int userId, Profile profile) {
        for (User user : user) {
            if (user.getInstanceId() == userId) {
                user.setProfile(profile);
                System.out.println(user);
                System.out.println(profile);
                break;
            }}


    }

    public void updateUserProfile(int userId, String gender) {
        for (int i = 0; i < profiles.length; i++) {
            if (profiles[i].getInstanceId() == userId) {
                System.out.println("Founded: " + profiles[i].getInstanceId());
                profiles[i].setGender(gender);
                System.out.println(profiles[i]);
            }
        }

    }

    public String deleteProfileByUserId2(int userId){
        for (int i = 0; i < user.length; i++) {
            if (user[i].getInstanceId()==userId){
                user[i].setProfile(null);
                return "Profile deleted "+user[i];
            }
        }
        return "Such user not founded";
    }




    public Post [] savePost(int userId, Post post) {
        for (int i = 0; i < profiles.length; i++) {
            Post[] OldPosts = profiles[i].getPosts();
            Post[]newPosts = Arrays.copyOf(OldPosts,OldPosts.length+1);
            if (profiles[i].getInstanceId() == userId) {
                newPosts[OldPosts.length]=post;
                profiles[i].setPosts(newPosts);
                for (int j = 0; j < newPosts.length; j++) {
                    newPosts[j].setInstanceId(j);
                }
                return newPosts;
            }
        }
        return null;
    }

    public void getPostByUserId(int userId) {
        for(Profile po:profiles){
            if(po.getInstanceId()==userId){
//                Post [] old=po.getPosts();
//                for(int i=0; i<old.length; i++){
//                    System.out.println(old[i]);
//                }
                System.out.println(Arrays.toString(po.getPosts()));
            }
        }

    }


    @Override
    public String toString() {
        return "Database{" +
                "profiles=" + Arrays.toString(profiles) +
                ", user=" + Arrays.toString(user) +

                '}';
    }
}
