import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) throws InterruptedException {


        System.out.println("Välkommen till Gambling");
        Thread.sleep(1 * 1000);
        System.out.println("Din insats:");
        Scanner tgb = new Scanner(System.in);
        int insats = 0;                                                 //En int för en insats
        int totalcash = Integer.parseInt(tgb.next());                   //En int för sina totala pengar
        int whatloop;                                                   //En int för vilken del av loopen som ska aktiveras
        int loop = 1;                                                   //En int för att loopen som är progrmmet ska aktivera

           while (loop == 1) {

               if (totalcash == 0){                                     //om man inte har några pengar så måste man lägga in mer för att fortsätta spelet
                   whatloop = 0;
               }
               else {

                   Thread.sleep(1 * 1000);
                   System.out.println("Tryck 0 för insats");
                   System.out.println("Tryck 1 för Coinflip 50/50");
                   System.out.println("Tryck 2 för 1/10");
                   System.out.println("Tryck 3 för 1/50");
                   System.out.println("Tryck 4 för 1/100");
                   System.out.println("Tryck 5 för 1/1000");
                   System.out.println("Tryck 6 för 1/10000");
                   System.out.println("Tryck 7 för att avsluta");
                   whatloop = tgb.nextInt();                                //Det man skriver blir den if sats som aktiveras
               }

               if(0 == whatloop){                                           //Man kan sätta in mer pengar
                  System.out.println("Din extra insats");
                   int insats2 = (tgb.nextInt());
                   totalcash = totalcash + insats2;
                    System.out.println("totala Cash: " + totalcash);
                   System.out.println("--------------------------");
               }

               if (1 == whatloop){
                   System.out.println("Hur mycket vill du satsa");              //den frågar hur mycket van vil satsa av sin totala cash
                   insats = tgb.nextInt();                                      //det man skriver är det man vill satsa
                   while(insats > totalcash){                                   //om man försöer satsa mer pengar än vad man har så går det inte
                       System.out.println("Du har bara: " + totalcash);
                       System.out.println("Hur mycket vill du satsa");
                       insats = tgb.nextInt();
                   }
               totalcash = totalcash - insats;
               insats = insats * coinflip();                                    //Insatsen multipliceras med en metod som antingen är 0 eller 2
               if(insats == 0){System.out.println("Du förlorade");}
               else{System.out.println("Du vann");}
               System.out.println(insats);
               totalcash = totalcash + insats;
               insats = 0;                                                      //insatsen blir 0 efter att det lagt till på total cash
               System.out.println("totala Cash " + totalcash);
               System.out.println("--------------------------");
           }

        if (2 == whatloop){
            System.out.println("Hur mycket vill du satsa");
            insats = tgb.nextInt();
            while(insats > totalcash){
                System.out.println("Du har bara: " + totalcash);
                System.out.println("Hur mycket vill du satsa");
                insats = tgb.nextInt();
            }
            totalcash = totalcash - insats;
            insats = insats * entio();
            if(insats == 0){System.out.println("Du förlorade");}
            else{System.out.println("Du vann");}
            System.out.println(insats);
            totalcash = totalcash + insats;
            insats = 0;
            System.out.println("totala Cash " + totalcash);
            System.out.println("--------------------------");
        }
        if (3 == whatloop){
            System.out.println("Hur mycket vill du satsa");
            insats = tgb.nextInt();
            while(insats > totalcash){
                System.out.println("Du har bara: " + totalcash);
                System.out.println("Hur mycket vill du satsa");
                insats = tgb.nextInt();
            }
            totalcash = totalcash - insats;
            insats = insats * enfemtio();
            if(insats == 0){System.out.println("Du förlorade");}
            else{System.out.println("Du vann");}
            System.out.println(insats);
            totalcash = totalcash + insats;
            insats = 0;
            System.out.println("totala Cash " + totalcash);
            System.out.println("--------------------------");
        }
        if (4 == whatloop){
            System.out.println("Hur mycket vill du satsa");
            insats = tgb.nextInt();
            while(insats > totalcash){
                System.out.println("Du har bara: " + totalcash);
                System.out.println("Hur mycket vill du satsa");
                insats = tgb.nextInt();
            }
            totalcash = totalcash - insats;
            insats = insats * enhundra();
            if(insats == 0){System.out.println("Du förlorade");}
            else{System.out.println("Du vann");}
            System.out.println(insats);
            totalcash = totalcash + insats;
            insats = 0;
            System.out.println("totala Cash " + totalcash);
            System.out.println("--------------------------");
        }
        if (5 == whatloop){
            System.out.println("Hur mycket vill du satsa");
            insats = tgb.nextInt();
            while(insats > totalcash){
                System.out.println("Du har bara: " + totalcash);
                System.out.println("Hur mycket vill du satsa");
                insats = tgb.nextInt();
            }
            totalcash = totalcash - insats;
            insats = insats * entusen();
            if(insats == 0){System.out.println("Du förlorade");}
            else{System.out.println("Du vann");
            System.out.println(insats);
           }
            totalcash = totalcash + insats;
            insats = 0;
            System.out.println("totala Cash " + totalcash);
            System.out.println("--------------------------");
        }
        if (6 == whatloop){
            System.out.println("Hur mycket vill du satsa");
            insats = tgb.nextInt();
            while(insats > totalcash){
                System.out.println("Du har bara: " + totalcash);
                System.out.println("Hur mycket vill du satsa");
                insats = tgb.nextInt();
            }
            totalcash = totalcash - insats;
            insats = insats * entiotusen();
            if(insats == 0){System.out.println("Du förlorade");}
            else{System.out.println("Du vann");}
            System.out.println(insats);
            totalcash = totalcash + insats;
            insats = 0;
            System.out.println("totala Cash " + totalcash);
            System.out.println("--------------------------");
        }


                if (7 == whatloop) {
                    loop = 0;                                                                           //Speletr avlutas om man skriver 7
                }


                whatloop = 0;

           }
           System.out.println("Du avslutade med " + totalcash );
    }

    public static int coinflip() {                          //Här är alla metoder för de olika oddsen

        Random random = new Random();                       //en java util för att lättare välja ett random nummer
        int coinflip = random.nextInt(2);            //en int som blir ett slumpmessigt tal mellan 0 och 1
        if (coinflip == 1){                                 //Om det slumpade talet är 1 så är det vinnst och talet 2 returnar för att dubbla sin vinnst
            return 2;
        }
        else{                                               //om det blir något annat (altså 0) så förlorar man och talet 0 returnar för att ta bort insatsen.
            return 0;
        }
    }
    public static int entio(){
        Random random = new Random();
        int entio = random.nextInt(10);
        if (entio == 1){
            return 10;
        }
        else{
            return 0;
        }
    }
    public static int enfemtio(){
        Random random = new Random();
        int enfemtio = random.nextInt(50);
        if (enfemtio == 1){
            return 50;
        }
        else{
            return 0;
        }
    }
    public static int enhundra(){
        Random random = new Random();
        int enhundra = random.nextInt(100);
        if (enhundra == 1){
            return 100;
        }
        else{
            return 0;
        }
    }
    public static int entusen(){
        Random random = new Random();
        int entusen = random.nextInt(1000);
        if (entusen == 1){
            return 1000;
        }
        else{
            return 0;
        }
    }
    public static int entiotusen(){
        Random random = new Random();
        int entiotusen = random.nextInt(10000);
        if (entiotusen == 1){
            return 10000;
        }
        else{
            return 0;
        }
    }
    public static int enhundratusen(){
        Random random = new Random();
        int enhundratusen = random.nextInt(100000);
        if (enhundratusen == 1){
            return 100000;
        }
        else{
            return 0;
        }
    }




}