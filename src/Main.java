//Project: Game Hero.
//Group members: Pauline Makoma and Christian Makoma.


import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {


        /////into to the game

        Scanner input = new Scanner(System.in);
        System.out.print("\tWELCOME TO FIGHTER GAME!!\nPleae enter your name to start: ");
        String fighterName = input.nextLine();
        System.out.printf("Hey %s are you ready to have some fun? \n1.enter 1 to play\n2.enter 2 to exit now\nyou choose: ", fighterName);



        int playChoice = input.nextInt();

        if (playChoice == 1){
            System.out.println("i will print instructions here");

            ///// elements of the game
            String[] enemies = {"Lucifer", "Tiger", "Wolf", "Awl"};
            int fighterHealth = 100;

            /// attack
            Random rando = new Random();
            int attack = rando.nextInt(3);
            System.out.printf("you're being attacked by %s",enemies[attack]);

            //// fight or run
            System.out.printf("\n1.enter 1 to fight %s or\n2.enter 2 to run\n",enemies[attack]);
            System.out.print("you choose: ");

            do {

                int fightRun = input.nextInt();
                if (fightRun == 1) {
                    System.out.printf("you're fighting %s\n", enemies[attack]);
                    int winDie = rando.nextInt(2);

                    int loss;
                    if(attack == 0){
                        loss = 75;
                    }else if(attack == 1){
                        loss = 50;
                    }else if(attack == 2){
                        loss = 25;
                    }else{
                        loss = 5;
                    }

                    if (winDie == 0) {
                        System.out.printf("you are injured, you have lost %d of your health\n", loss);
                        fighterHealth = fighterHealth - loss;
                        System.out.printf("your current health is %d ", fighterHealth);
                    }else{
                        System.out.printf("great job beating %s you have gain %d more health\n", enemies[attack], loss);
                        fighterHealth = fighterHealth + loss;
                        System.out.printf("your current health is %d ", fighterHealth);
                    }


                } else if (fightRun == 2) {
                    System.out.printf("you're running away from %s ", enemies[attack]);
                } else {
                    System.out.println("Please choose a valid option");
                }

            } while(fighterHealth > 0 );
            System.out.printf("GAME OVER\nTry again %s", fighterName);



        } else if(playChoice == 2){
            System.out.println("your loss, this game is really fun");
        }else{
            System.out.println("choose a valid option");


        }



    }
}
