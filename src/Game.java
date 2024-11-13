import java.util.Objects;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Room1 room1 = new Room1();
        Player newbie = new Player();
        boolean hasEntered = false;
        System.out.println("Welcome to the game");
        System.out.println("To see the player info type info, to enter the room type enter");
        while(!hasEntered) {
            String input = scanner.nextLine();
            if (Objects.equals(input, "info")) {
                System.out.println(newbie);
                System.out.println("To enter the room type enter");
            } else if (Objects.equals(input, "enter")) {
                room1.printDescription();
                room1.printInstruction();
                hasEntered = true;
            } else {
                System.out.println("error");
            }
        }
            Monster goblin = room1.getMonster();
            System.out.println("There is a goblin, starting a fight");
            System.out.println(goblin);
            while(!goblin.isDead){
                newbie.dealDamage(goblin);
                System.out.println("goblin has " + goblin.getHp() + "hp");
                if(goblin.isDead){
                    goblin.death(newbie);
                }
                goblin.dealDamage(newbie);
                System.out.println("player has " + newbie.getHp() + "hp");
            }
        if(goblin.isDead){
            System.out.println("Congratulations, you have defeated the goblin, now you have to solve the enigma");
            Enigma enigma1 = room1.enigma;
            System.out.println("The enigma is " + enigma1);
            System.out.println("Write down your answer");
            while(!enigma1.isSolved) {
                String input = scanner.nextLine();
                enigma1.checkAnswer(input);
                if (enigma1.isSolved) {
                    System.out.println("Congratulations, the question has been solved");
                    room1.end(newbie);
                } else {
                    System.out.println("Wrong answer, try again");
                }
            }
        }
        System.out.println("You have successfully finished the game");
        }



    }



