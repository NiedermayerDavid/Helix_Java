package harrypottercards;

import java.util.Scanner;

public class HarryPotterCards {

    public static void main(String[] args) {
        System.out.println("Harry Potter card maker:\n");

        card firstCard = new card("", "", "", 1, "");

        Scanner input = new Scanner(System.in);
        System.out.print("Please give the cards name here: ");

        firstCard.setName(input.nextLine());
        System.out.print("Please give the cards type here: ");
        firstCard.setType(input.nextLine());
        System.out.print("Please give the cards description here: ");
        firstCard.setDesc(input.nextLine());
        System.out.print("Please give the cards game here: ");
        firstCard.setGame(input.nextLine());
        System.out.print("Please give the cards mana consumpsion here: ");

        firstCard.setMana(Integer.valueOf(input.nextLine()));

        System.out.println("Card info: " + firstCard.getName() + " " + firstCard.getGame() + " " + firstCard.getType() + " " + firstCard.getDesc() + " " + firstCard.getMana());
    }

}
