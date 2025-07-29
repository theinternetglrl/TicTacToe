//@theinternetglrl

import java.util.InputMismatchException;
import java.util.Scanner;


public class TicTacToe {

    public static String getAndCheckInput(){ 
        Scanner input=new Scanner(System.in);
        
        
        String choice=input.next();
        
        
        while(Character.toUpperCase(choice.charAt(0))!='O'&&Character.toUpperCase(choice.charAt(0))!='X'){
            System.out.println("Wrong,Enter your choice(X or O): "); 
            choice=input.next();
        }
        
        
        return choice.toUpperCase();
        
    }
  
    public static void printTheGrid(String[][] grid){
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(j==0||j==1)
                 System.out.print(grid[i][j]+" | ");
                else
                  System.out.print(grid[i][j]+" ");   
            }
            if(i==0||i==1)
                System.out.println("\n--------------");
            else
               System.out.println("");  
        }
    }
    
    public static void takeInput(int pos,String chioce,String[][] grid){
     
        Scanner input = new Scanner(System.in);
        
        boolean flag=true;
        while(flag){
            
        switch(pos){
            case 1:
                if(grid[0][0].charAt(0)!='X'&&grid[0][0].charAt(0)!='O'){
                    grid[0][0]=chioce;
                   return;
                }
                else{
                    System.out.println("Already taken.");
                    flag=true;
                }
                break;
            case 2:
                if(grid[0][1].charAt(0)!='X'&&grid[0][1].charAt(0)!='O'){
                    grid[0][1]=chioce;
                    return;
                }
                else{
                    System.out.println("Already taken.");
                    flag=true;
                }
                break;
            case 3: 
               if(grid[0][2].charAt(0)!='X'&&grid[0][2].charAt(0)!='O'){
                    grid[0][2]=chioce;
                    return;
                }
                else{
                    System.out.println("Already taken.");
                    flag=true;
                }
                break;
            case 4:
              if(grid[1][0].charAt(0)!='X'&&grid[1][0].charAt(0)!='O'){
                    grid[1][0]=chioce;
                    return;
                }
                else{
                    System.out.println("Already taken.");
                    flag=true;
                }
                break;
            case 5:
              if(grid[1][1].charAt(0)!='X'&&grid[1][1].charAt(0)!='O'){
                    grid[1][1]=chioce;
                    return;
                }
                else{
                    System.out.println("Already taken.");
                    flag=true;
                }
                break;
            case 6:
               if(grid[1][2].charAt(0)!='X'&&grid[1][2].charAt(0)!='O'){
                    grid[1][2]=chioce;
                    return;
                }
                else{
                    System.out.println("Already taken.");
                    flag=true;
                }
                break;
            case 7:
                if(grid[2][0].charAt(0)!='X'&&grid[2][0].charAt(0)!='O'){
                    grid[2][0]=chioce;
                    return;
                }
                else{
                    System.out.println("Already taken.");
                    flag=true;
                }
                break;
            case 8:
                if(grid[2][1].charAt(0)!='X'&&grid[2][1].charAt(0)!='O'){
                    grid[2][1]=chioce;
                    return;
                }
                else{
                    System.out.println("Already taken.");
                    flag=true;
                }
                break;
            case 9:
                if(grid[2][2].charAt(0)!='X'&&grid[2][2].charAt(0)!='O'){
                    grid[2][2]=chioce;
                    return;
                }
                else{
                    System.out.println("Already taken.");
                    flag=true;
                }
                break;
            default:
                System.out.println("the number should be between 1-9.");
                flag=true;
                
        }
        System.out.print("Enter another position: ");
         while(true){
            try{
                pos=input.nextInt();
                break;
            }
            catch(InputMismatchException o){
                System.out.println("Error Enter numbers only.");
                input.nextLine();
            }
            }  
        }
        
        
    }

    
    public static int determineTheWinner(String[][] grid){
        
        
        if(grid[0][0].charAt(0)=='X'&&grid[0][1].charAt(0)=='X'&&grid[0][2].charAt(0)=='X'
                ||grid[1][0].charAt(0)=='X'&&grid[1][1].charAt(0)=='X'&&grid[1][2].charAt(0)=='X'
                ||grid[2][0].charAt(0)=='X'&&grid[2][1].charAt(0)=='X'&&grid[2][2].charAt(0)=='X')
            return 1;
        else if(grid[0][0].charAt(0)=='O'&&grid[0][1].charAt(0)=='O'&&grid[0][2].charAt(0)=='O'
                ||grid[1][0].charAt(0)=='O'&&grid[1][1].charAt(0)=='O'&&grid[1][2].charAt(0)=='O'
                ||grid[2][0].charAt(0)=='O'&&grid[2][1].charAt(0)=='O'&&grid[2][2].charAt(0)=='O')
            return 2;
        else if(grid[0][0].charAt(0)=='X'&&grid[1][0].charAt(0)=='X'&&grid[2][0].charAt(0)=='X'
                ||grid[0][1].charAt(0)=='X'&&grid[1][1].charAt(0)=='X'&&grid[2][1].charAt(0)=='X'
                ||grid[0][2].charAt(0)=='X'&&grid[1][2].charAt(0)=='X'&&grid[2][2].charAt(0)=='X')
            return 1;
        else if(grid[0][0].charAt(0)=='O'&&grid[1][0].charAt(0)=='O'&&grid[2][0].charAt(0)=='O'
                ||grid[0][1].charAt(0)=='O'&&grid[1][1].charAt(0)=='O'&&grid[2][1].charAt(0)=='O'
                ||grid[0][2].charAt(0)=='O'&&grid[1][2].charAt(0)=='O'&&grid[2][2].charAt(0)=='O')
            return 2;
        else if(grid[0][0].charAt(0)=='X'&&grid[1][1].charAt(0)=='X'&&grid[2][2].charAt(0)=='X')
            return 1;
        else if(grid[0][0].charAt(0)=='O'&&grid[1][1].charAt(0)=='O'&&grid[2][2].charAt(0)=='O')
            return 2;
        else if(grid[2][0].charAt(0)=='X'&&grid[1][1].charAt(0)=='X'&&grid[0][2].charAt(0)=='X')
            return 1;
        else if(grid[2][0].charAt(0)=='O'&&grid[1][1].charAt(0)=='O'&&grid[0][2].charAt(0)=='O')
            return 2;
        else
           return 0;
        
    }
 
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
       
        
        System.out.println("Welcome to Tic Tac Toe game.");
        System.out.println("the game rules are as follows:");
        System.out.println("Two players take turns placing their symbols (X or O) in an empty cell.");
        System.out.println("a player wins if they get three of their symbols in a row in any of the following ways:");
        System.out.println("-Horizontally\n-Vertically\n-Diagonally");
        
        int choose=1,tiecount=0,player1count=0,player2count=0;
        do{
        String[][] grid={{"[1]","[2]","[3]"},{"[4]","[5]","[6]"},{"[7]","[8]","[9]"}};
        String chioce_1,chioce_2;
        do{
        System.out.println("Player number 1 Enter your choice(X or O): ");
        chioce_1=getAndCheckInput();
        System.out.println("Player number 2 Enter your choice(X or O): ");
        chioce_2=getAndCheckInput();
        
        if(chioce_1.charAt(0)==chioce_2.charAt(0)){
            System.out.println("you cant play with two similar choices.");
        }
        
        }while(chioce_1.charAt(0)==chioce_2.charAt(0));
        
      
        int player1choice;
        
        if(chioce_1.charAt(0)=='X')
            player1choice=1;
        else
            player1choice=2;
        
        
        int countrounds=0;
        int pos=0;
        while(true){
            System.out.println("-------------------------------------------");
            printTheGrid(grid);
            System.out.println("(Player 1 turn.)");
            System.out.println("choose the number of position.");
          

            System.out.print("Enter the number of position: ");
            
            while(true){
            try{
                pos=input.nextInt();
                break;
            }
            catch(InputMismatchException o){
                System.out.println("Error Enter numbers only.");
                input.nextLine();
            }
            }  
            
            takeInput(pos,chioce_1,grid);
            
            countrounds++;
            
            System.out.println("-------------------------------------------");
            printTheGrid(grid);
            
            if(determineTheWinner(grid)>0){
                if(determineTheWinner(grid)==1){
                    if(player1choice==1){
                        System.out.println("player number 1 is the winner");
                    player1count++;
                    }
                    else {
                        System.out.println("player number 2 is the winner");
                    player2count++;
                    }    
                    break;
                }
                else if(determineTheWinner(grid)==2){
                     if(player1choice==2){
                        System.out.println("player number 1 is the winner");
                        player1count++;
                     }
                    else {
                        System.out.println("player number 2 is the winner");
                        player2count++;
                     }
                     break;
                }
               
            }
            else if(determineTheWinner(grid)==0&&countrounds==9){
                    System.out.println("its a tie.");
                    tiecount++;
                break;
            }

            System.out.println("(Player 2 turn.)");
            System.out.println("choose the number of position.");
           

            System.out.print("Enter the number of position: ");
            while(true){
            try{
                pos=input.nextInt();
                break;
            }
            catch(InputMismatchException o){
                System.out.println("Error Enter numbers only.");
                input.nextLine();
            }
            }  
            takeInput(pos,chioce_2,grid);
            
            
            
            countrounds++;
            
            
            
            if(determineTheWinner(grid)>0){
                if(determineTheWinner(grid)==1){
                    if(player1choice==1){
                        System.out.println("player number 1 is the winner");
                    player1count++;
                    }
                    else {
                        System.out.println("player number 2 is the winner");
                    player2count++;
                    }    
                    break;
                }
                else if(determineTheWinner(grid)==2){
                     if(player1choice==2){
                        System.out.println("player number 1 is the winner");
                        player1count++;
                     }
                    else {
                        System.out.println("player number 2 is the winner");
                        player2count++;
                     }
                     break;
                }
               
            }
            else if(determineTheWinner(grid)==0&&countrounds==9){
                    System.out.println("its a tie.");
                    tiecount++;
                break;
            }
         
        }
        
        System.out.println("-------------------------------------------");
        printTheGrid(grid);
        
       System.out.println("player 1 have won "+player1count+(player1count>1?" times.":" time."));
       System.out.println("player 2 have won "+player2count+(player2count>1?" times.":" time."));
       System.out.println("Number of ties is "+tiecount+(tiecount>1?" times.":" time."));
       
       System.out.println("Enter 1 if you want to continue and 0 to exit");
       choose=input.nextInt();
       
     
       
       }while(choose==1);
       
       
       
    }
   
}
