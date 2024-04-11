package niedermayerdávid_filmsorsolo_0229;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class NiedermayerDávid_filmsorsolo_0229 {

    public static void main(String[] args) {
        int program = 0;
        ArrayList<String> comedyList = new ArrayList(
                Arrays.asList("Nagyfiúk 2", "Alibi.com 2", "Vakáció", "Kivert kutyák", "Életrevalók", "Dumb és Dumber")
        );
        ArrayList<String> horrorList = new ArrayList(
                Arrays.asList("Fűrész", "Démonok között", "Az ördögűző", "Végső állomás", "A kör", "The Vigil")
        );
        ArrayList<String> actionList = new ArrayList(
                Arrays.asList("Mátrix", "Indiana Jones és az utolsó kereszteslovag", "Terminátor 2. - Az ítélet napja", "A Karib-tenger kalózai - A Fekete Gyöngy átka", "Elrabolva", "A védelmező 3.")
        );

        // TODO code application logic here
        System.out.println("Please choose a movie category:\n Comedy, \n Horror, \n Action");
        Scanner input = new Scanner(System.in);
        String answer = "";
        answer = input.nextLine();

        String toLowerCaseanswer = answer.toLowerCase();
        int filmvalasz = 0;
        int categoryAnswer = 0;
        //int randomNumCom = ThreadLocalRandom.current().nextInt(0, comedyList.size());
        //int randomNumHorr = ThreadLocalRandom.current().nextInt(0, horrorList.size());
        //int randomNumAction = ThreadLocalRandom.current().nextInt(0, actionList.size());

        while (program != 1) {

            while (filmvalasz != 1) {

                if ("comedy".equals(toLowerCaseanswer) || "horror".equals(toLowerCaseanswer) || "action".equals(toLowerCaseanswer)) {
                    filmvalasz = 1;
                } else {
                    System.out.println("There is no such category!");
                    System.out.println("Please choose a movie category:\n Comedy, \n Horror, \n Action");
                    Scanner newScanner = new Scanner(System.in);
                    String newInput = answer;
                    newInput = newScanner.nextLine();
                    toLowerCaseanswer = newInput.toLowerCase();

                }

            }

            while (categoryAnswer != 1) {
                if ("comedy".equals(toLowerCaseanswer)) {
                    System.out.println("There are " + comedyList.size() + " numbers of comedy movies in the database.");
                    Scanner inputCom = new Scanner(System.in);
                    String incom = "";
                    System.out.println("How many movies would you like to get?");
                    incom = inputCom.nextLine();
                    int inCom = Integer.parseInt(incom);
                    if ((0 <= inCom) && (inCom <= comedyList.size())) {
                        System.out.println("There are the random movies you asked for:");
                        for (int i = 0; i < inCom; i++) {

                            int randomNumber = ThreadLocalRandom.current().nextInt(0, comedyList.size());
                            System.out.println(comedyList.get(randomNumber));

                            categoryAnswer = 1;
                        }
                    } else {
                        System.out.println("You gave wrong number");
                    }

                }
                if ("horror".equals(toLowerCaseanswer)) {
                    System.out.println("There are " + horrorList.size() + " numbers of horror movies in the database.");
                    Scanner inputCom = new Scanner(System.in);
                    String incom = "";
                    System.out.println("How many movies would you like to get?");
                    incom = inputCom.nextLine();
                    int inCom = Integer.parseInt(incom);
                    if ((0 <= inCom) && (inCom <= horrorList.size())) {
                        System.out.println("There are the random movies you asked for:");
                        for (int i = 0; i < inCom; i++) {

                            int randomNumber = ThreadLocalRandom.current().nextInt(0, comedyList.size());
                            System.out.println(comedyList.get(randomNumber));

                            categoryAnswer = 1;
                        }
                    } else {
                        System.out.println("You gave wrong number");
                    }

                }
                if ("action".equals(toLowerCaseanswer)) {
                    System.out.println("There are " + actionList.size() + " numbers of action movies in the database.");
                    Scanner inputCom = new Scanner(System.in);
                    String incom = "";
                    System.out.println("How many movies would you like to get?");
                    incom = inputCom.nextLine();
                    int inCom = Integer.parseInt(incom);
                    if ((0 <= inCom) && (inCom <= actionList.size())) {
                        System.out.println("There are the random movies you asked for:");
                        for (int i = 0; i < inCom; i++) {

                            int randomNumber = ThreadLocalRandom.current().nextInt(0, comedyList.size());
                            System.out.println(comedyList.get(randomNumber));

                            categoryAnswer = 1;
                        }
                    } else {
                        System.out.println("You gave wrong number!");
                    }

                }
                program = 1;
            }
        }

    }

}
