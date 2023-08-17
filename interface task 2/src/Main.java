import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Striker striker = new Striker ("Ainazik","Davranovna", LocalDate.of(2004,2,3),27.3,56);
        Defender defender = new Defender ("Davran","Fatimovna",LocalDate.of(2005,3,5),23.4,89);
        Goalkeeper goalkeeper= new Goalkeeper("Bekzat","Nurzatovna",LocalDate.of(2006,3,21),34.6,67.7);
        Coach coach = new Coach ("Igor","Kalbekov",LocalDate.of(1990,6,8),54.6,44);

        Sportsman[] sport = {striker ,defender,goalkeeper};
        for (Sportsman t:sport) {
            System.out.println(t);
        }

        }
    }
