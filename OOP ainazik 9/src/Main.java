public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone ("Ephone","20",
                "324234","300G",
                1000000);

        phone.setMemory("12343");
        phone.setPrice(20000000);



        Phone phone1 = new Phone("Galaxy","32",
                "243423","312L",1231);
         phone.setMemory("564223");
         phone.setPrice(633);


         Phone phone2 = new Phone("Leonid",
                 "99","434","12K",888);
          phone.setMemory("21212");
          phone.setPrice(3121);

          Phone phone3 = new Phone ("Galaxy","12H","000","222L",222);
          phone.setPrice(21);
          phone.setMemory("345345");

        System.out.println(phone );
        System.out.println(phone2);
        System.out.println(phone3);









    }


}