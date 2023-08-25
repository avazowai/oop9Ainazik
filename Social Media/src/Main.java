import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Comment comment = new Comment("School", LocalDate.of(2023, 11, 23));
        Comment comment1 = new Comment("You are cool", LocalDate.of(2023, 5, 13));
        Comment comment2 = new Comment("Beautiful", LocalDate.of(2023, 11, 23));
        Comment comment3 = new Comment("Handsome", LocalDate.of(2023, 5, 13));
        Comment comments4 = new Comment("Jaz", LocalDate.of(2022, 6, 3));
        Comment comment5=new Comment("Class", LocalDate.of(2021, 2, 2));
        Comment comment6=new Comment("Comment", LocalDate.of(2020, 10, 3));
        Comment comment7=new Comment("Alina", LocalDate.of(2018, 3, 2));
        Comment comment8 = new Comment("Great post!", LocalDate.now());
        Comment comment9 = new Comment("My food", LocalDate.now());
        Comment comment10 = new Comment("Good job", LocalDate.of(2023, 8, 20));
        Comment comment11 = new Comment("Bag", LocalDate.of(2023, 8, 19));
        Comment comment12 = new Comment("Selfie", LocalDate.of(2023, 8, 18));
        Comment comment13 = new Comment("Hard Work", LocalDate.of(2023, 8, 17));
        Comment comment14 = new Comment("Java It", LocalDate.of(2023, 8, 16));
        Comment comment15 = new Comment("JS IT", LocalDate.of(2023, 8, 15));
        Comment comment4 = new Comment("You and me", LocalDate.of(2022, 10, 2));

        Comment[] comments1 = {comment, comment1};
        Comment[] comments2 = {comment2, comment3};
        Comment[] co = {comments4, comment5};
        Comment[] com = {comment6, comment7};
        Comment[] come={comment8, comment9};
        Comment[] mm={comment10, comment11};
        Comment[] c={comment12, comment13};
        Comment[] cc={comment14, comment15};



        Post post = new Post("Photo", "Swimming", LocalDate.of(2023, 10, 3), comments1);
        Post post1 = new Post("PhotoShoot", "Nature", LocalDate.of(2023, 9, 6), comments2);
        Post post5=new Post("Mommy", "Family", LocalDate.of(2023, 5, 24), mm);
        Post[] posts = {post, post1, post5};
        Post post2 = new Post("Photo2", "Swimming", LocalDate.of(2023, 8, 3), co);
        Post post3 = new Post("PhotoShoot3", "Nature", LocalDate.of(2023, 8, 6), com);
        Post[] p1 = {post2, post3};
        Post post22=new Post("Beauty", "Woman", LocalDate.of(2022, 1, 9), come);
        Post post4 =new Post("Mountain", "Nature", LocalDate.of(2023, 4, 12), come);
        Post[] p2 = {post22,post4, post5};
        Post post6=new Post("Dog", "Pet", LocalDate.of(2023, 6, 2), c);
        Post post7=new Post("Daizy", "Pet", LocalDate.of(2022, 11, 13), come);
        Post[] p3 = {post6, post7};
        Post post8 = new Post("Alibek", "Learning", LocalDate.of(2023, 2, 3), cc);



        Profile profile = new Profile("Alina", LocalDate.of(2000, 1, 20), "Female", posts);
        Profile profile1 = new Profile("E", LocalDate.of(2000, 10, 21), "Female", p1);
        Profile profile2 = new Profile("A", LocalDate.of(2000, 1, 20), "Female", p2);
        Profile profile3 = new Profile("Elina", LocalDate.of(2000, 10, 21), "Female", p3);
        Profile[] profiles = {profile, profile1, profile2};




        User user1 = new User("AdelZh", "@adel", 123, profile);
        User anotherUser = new User("AnotherUser", "another@example.com", 45, profile1);
        User anotherUser2 = new User("Ana", "@ana", 78, profile2);
        User anotherUser3 = new User("Kz", "@ellacross", 88, profile3);
        User[] users = {user1, anotherUser, anotherUser3};



        Database database1 = new Database(profiles, users);

        Scanner scanner = new Scanner(System.in);





        System.out.println("1. Save comment");
        System.out.println("2. Save Profile By User Id");
        System.out.println("3. Save User");
        System.out.println("4. Save Post");
        System.out.println("------------------------------------");
        System.out.println("5. Get posts By user id");
        System.out.println("6. Search Post");
        System.out.println("7. Find profile by user id"+"\t"+"/"+"Find comment by post Id");
        System.out.println("------------------------------------");
        System.out.println("9. Update");
        System.out.println("------------------------------------");
        System.out.println("10.Delete profile by user id");
        System.out.println("11. Delete user");
        System.out.println("12. Delete post");
        System.out.println("13. Exit");


        while (true) {
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println(database1.saveComment2222(1, 1, comment4));
                    break;
                case 2:
                    database1.saveProfileByUserId(3, profile3);
                    break;
                case 3:
                    System.out.println(Arrays.toString(database1.saveUser2(anotherUser2)));
                    break;
                case 4:
                    System.out.println(Arrays.toString(database1.savePost(0, post8)));
                    break;

                case 5:
                    database1.getPostByUserId(1);
                    break;
                case 6:
                    System.out.println(anotherUser2.searchPost("Mommy"));
                    break;
                case 7:
                    database1.findProfileByUserId(0);
                    System.out.println(Arrays.toString(post.findCommentByPostId(1)));
                    break;
                case 9:
                    post1.updateComment(1, "Peaksoft");
                    database1.updateUserProfile(1, "Man");
                    break;
                case 10:
                    System.out.println(database1.deleteProfileByUserId2(1));
                    break;
                case 11:
                    System.out.println(Arrays.toString(database1.deleteUser2(3)));
                    break;
                case 12:
                    user1.deletePost(1);
                    System.out.println(user1);
                    System.out.println(Arrays.toString(database1.savePost(0, post1)));
                    break;
                case 13:
                    System.exit(0);
            }}}}