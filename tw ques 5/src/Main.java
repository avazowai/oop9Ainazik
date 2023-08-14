public class Main {
    public static void main(String[] args) {

        int [] sos = {20,19,18,10,9,3,1,0};

        boolean isDecreasing = true;
        for (int i = 0; i < sos.length-1; i++) {
            if (sos[1] <= sos[i + 1]) {
                isDecreasing = false;
                break;
            }
        }

                if (isDecreasing) {
                    System.out.println("Последовательность является убывающей.");
                } else {
                    System.out.println("Последовательность не является убывающей.");
                }
            }
        }













