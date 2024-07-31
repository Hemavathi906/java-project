import java.util.Scanner;

public class If_else {
public static void main(String[] args) {
    int pen=10;
    int specialpen=20;
    Scanner in =new Scanner(System.in);
    int cost;
    cost=in.nextInt();
 if(cost>pen){
    System.out.println("you can buy a pen");
 }
 else if(cost>specialpen){
    System.out.println("You can buy a special pen");
 }  
 else{
    System.out.println("You have less money to buy a pen");
 } 
}
    
}
