/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pathfinderjava;



/**
 *
 * @author Michael
 */
public class PathfinderJava {

    /**
     * @param args the command line arguments
     */
    
    static int gridArr [][] = new int [10][10];
    

// y, X
    static int primeCoords [] [] = {
        {0,6},
        {1,1},
        {1,7},
        {2,1},
        {2,2},
        {2,4},
        {2,6},
        {3,3},
        {3,9},
        {4,0},
        {4,6},
        {4,8},
        {5,1},
        {5,5},
        {5,7},
        {6,0},
        {6,6},
        {6,8},
        {7,1},
        {7,7},
        {8,4},
        {8,6},
        {9,3},
        {9,7},
        {9,9}
    
    };
    
    /* 0: Y position
    1: X position
    2:MovedRight - 1
    3:MovedDown  - 2
    4: Up        - 3
    5: Left      - 4
*/

    static int gridScores [][] = new int [gridArr.length][gridArr[0].length];
    
    static int startX = 0;
   static int startY = 2;
    
   static int currentX = startX;
    static int currentY = startY;
    
    static int currentInt = 1;
    
    static int target = gridArr[0].length *gridArr.length;
    
    static int pathCords [][] = new int [target][6];
    public static void main(String[] args) {
        // TODO code application logic here
        int millions = 0;
        
        
    
    
    
      System.out.println(target);
      
      
      resetArray();
      int counter = 0;
     while(currentInt<target){
         
       //   System.out.println("currentX: " + currentX);
      //     System.out.println("currentY: " + currentY);
         //gridScores[currentY][currentX] = 1;
         pathCords[currentInt-1][0] = currentY;
         pathCords[currentInt-1][1] = currentX;
         int moveOpt = compareScores();
         
         
         
         if(moveOpt == 1){
             currentX++;
             
         }
         else if(moveOpt == 2){
             currentY++;
             
         }
         else if(moveOpt== 3){
             currentY--;
             
         }
         else if(moveOpt == 4){
             currentX--;
             
         }
         
         upDateArray();
         
         if(moveOpt ==-1){
             gridScores[currentY][currentX] = 0;
             pathCords[currentInt-1][0] = 0;
             pathCords[currentInt-1][1] = 0;
             pathCords[currentInt-1][2] = 0;
             pathCords[currentInt-1][3] = 0;
             pathCords[currentInt-1][4] = 0;
             pathCords[currentInt-1][5] = 0;
             
           //  gridScores[currentY][currentX] = 0;
             currentInt--;
             
             currentX = pathCords[currentInt-1][1];
             currentY = pathCords[currentInt-1][0];
             
         }else{
             currentInt++;
         }
         
       //  System.out.println("mOVEOPT = " + moveOpt);
       outputArray();
         counter++;
         if(counter == 1000000){
             System.out.println("current: " + currentInt);
         outputArray();
        //  System.out.println("\n");
         counter = 0;
         millions++;
         }
     }
     
     pathCords[currentInt-1][0] = currentY;
         pathCords[currentInt-1][1] = currentX;
     
     
     upDateArray();
      outputArray();
   
      
      System.out.println("Million Iterations: " + millions );
      
}
    
    public static void upDateArray(){
        resetArray();
        for(int i = 0; i <=  currentInt-1; i++){
           // System.out.println("UPDATE I:"+(i+1)+" IN POS: Y="+pathCords[i][0]+" X="+pathCords[i][1]);
        gridArr[pathCords[i][0]][pathCords[i][1]] = i+1;
        gridScores[pathCords[i][0]][pathCords[i][1]] = 1;
        
        
                }
    }
    public static int compareScores(){
        
        int returnOpt = -1;
        boolean primeLaw = true;
      //  System.out.println("primeCheck = " + primeCheck());
        if(primeCheck()){
            primeLaw = false;
            for (int i = 0; i<primeCoords.length; i++){
            
            if(currentX == primeCoords[i][1] && currentY == primeCoords[i][0]){
                
                primeLaw = true;
            }
                
                
                
            }
        }else{
            for (int i = 0; i<primeCoords.length; i++){
            
            if(currentX == primeCoords[i][1] && currentY == primeCoords[i][0]){
                
                primeLaw = false;
            }
                
                
                
            }
            
        }
     //   System.out.println(primeLaw);
        boolean decicion = false;
        if(primeLaw==true){
        //go right
        if(currentX < gridArr[0].length-1 && decicion == false){
    if(gridScores[currentY][currentX+1] == 0 && pathCords[currentInt-1][2] == 0){
    returnOpt = 1;
    pathCords[currentInt-1][returnOpt+1] = 1;
    decicion = true;
    }
        
        }
        
        //go left
        if(currentX > 0  && decicion ==false){
    if(gridScores[currentY][currentX-1] == 0 && pathCords[currentInt-1][5] == 0){
    returnOpt =4;
    pathCords[currentInt-1][returnOpt+1] = 1;
    decicion = true;
    }}
        
        //go down
        if(currentY < gridArr.length-1 && decicion ==false){
    if(gridScores[currentY+1][currentX] == 0 && pathCords[currentInt-1][3] == 0){
    returnOpt = 2;
    pathCords[currentInt-1][returnOpt+1] = 1;
    decicion = true;
    }}
         //go up
     if(currentY > 0 && decicion == false){
    if(gridScores[currentY-1][currentX] == 0 && pathCords[currentInt-1][4] == 0){
    returnOpt = 3;
    pathCords[currentInt-1][returnOpt+1] = 1;
    decicion = true;
    }}
        }    
     return returnOpt;
}
    public static boolean primeCheck(){
        boolean isPrime = true;
                
                for(int i = 2; i<currentInt; i++){
                    if (currentInt%i ==0){
                        isPrime = false;
                    }
                    
                    
                }
                if(currentInt<2){
                    isPrime = false;
                }
                
        return isPrime;
        
    }
    
    public static void resetArray(){
        
        for(int i = 0; i<gridArr.length; i++){
            for (int j = 0; j<gridArr[0].length; j++){
             
                gridArr[i][j] = 0;
               // gridScores[i][j] = 0;
            }          
            
            
        }
        
    }
    
     public static void outputArray(){
        
        for(int i = 0; i<gridArr.length; i++){
            for (int j = 0; j<gridArr[0].length; j++){
             
               System.out.print( gridArr[i][j]+" ");
               if( gridArr[i][j]<10){
                   System.out.print(" ");
               }
                 
                 }          
          
            System.out.println("");
        }
        System.out.println("\n\n");
        
        /*
         for(int i = 0; i<pathCords.length; i++){
             System.out.print((i+1)+"-");
            for (int j = 0; j<pathCords[0].length; j++){
             
               System.out.print( pathCords[i][j]+" ");
                
            }          
            System.out.println("");
            
        }
     */
    }
}
