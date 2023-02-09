package clubs.manager;


import java.io.*;

public class TSVReader {
    public static void main(String[] args) {
        String fileName = "input.tsv"; // replace with the name of your TSV file
        String line;
String clubsArray [] = new String[100];
String clubMembersArray [][][] = new String [100][1000][6];
int clubMemberCount[] = new int [100];
int clubsArrayPos = 0;

String memberName = "";
        try {
            String clubsList = "";
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\t"); // split the line by tabs
                int x  = 0;
                for (String item : data) {
                    if(x==5){
                      //  System.out.print("LAMAO");
                        clubsList = item;
                    }
                   // System.out.print(item + " ");
                    if(x==3){
                      memberName = item;
                    }
                    x++;
                    
                }
                System.out.println();
                String[] values = clubsList.split(",");
        
        for (String value : values) {
           // System.out.println(value);
            if(value.charAt(0)==' '){
                String ValueWithoutSpace = "";
                for(int i = 0; i<value.length()-1; i++){
                    ValueWithoutSpace += value.charAt(i+1);
                    
                }
                value = ValueWithoutSpace;
            }
            boolean clubExists = false;
            for(int i = 0; i<100; i++){
                if(clubsArray[i]!=null){
                if(!clubsArray[i].isBlank()){
                if(clubsArray[i].equals(value)){
                   clubExists = true;
                   
                }}}
            }
            
            
            if(!clubExists){
                clubsArray[clubsArrayPos] = value;
                clubsArrayPos++;
                System.out.println("NEW CLUB FOUND");
                
            }
            for(int i = 0; i<100; i++){
                if(clubsArray[i]!=null){
                if(!clubsArray[i].isBlank()){
                if(clubsArray[i].equals(value)){
                   clubExists = true;
                   clubMembersArray[i][clubMemberCount[i]][0] = memberName;
                   clubMemberCount[i] ++;
                }}}
            }
        }
        
            }
            reader.close();
            
           
            
            
            for(int i = 0; i<100; i++){
                if(clubMemberCount[i]==0){
                    for(int j = i; j<99; j++){
                        clubMemberCount[j] = clubMemberCount[j+1];
                        clubMembersArray[j] = clubMembersArray[j+1];
                       clubsArray[j] = clubsArray[j+1];
                        
                    }
                    
                    
                    
                }
            }
            
            //Remove Duplicates
         
            for(int i = 0; i<clubsArrayPos; i++){
              for(int j = 0; j<clubMemberCount[i]; j++){
                  System.out.println(j);
               for (int k = i+1; k<clubsArrayPos; k++){
                   for (int l = j+1; l<clubMemberCount[i]; l++){
                                       
                    if(clubMembersArray[i][j][0]==clubMembersArray[k][l][0]){
                       
                        for(int m = l; m<999; m++){
                           clubMembersArray[i][m]=clubMembersArray[i][m+1];
                            
                            
                        }
                       
                        
                    }
                    
                    
                    
                }
            }}}
           
             for(int i = 0; i<clubsArrayPos; i++){
                 
                 if(clubMemberCount[i]==0){
                     for(int j = i; j<clubsArrayPos-1; j++){
                         clubMembersArray[i] = clubMembersArray[i+1];
                         clubsArray[i] = clubsArray[i+1];
                         clubMemberCount[i] = clubMemberCount[i+1];
                     }
                     clubsArrayPos--;
                 }   
             }
             
            
             System.out.println("AVAILABLE CLUBS\n");
            for(int i = 0; i<clubsArrayPos; i++){
                
                System.out.println(clubsArray[i]);
                for(int j = 0; j<100; j++){
                    if(clubMembersArray[i][j][0]!= null){
                        System.out.println("\t" + clubMembersArray[i][j][0]);
                        
                    }
                }
                
            }
            
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
        
         try {
             File outputFile = new File("output.csv");
             outputFile.delete();
             
            FileWriter fileWriter = new FileWriter("output.csv");
            
            
            
            for(int j = 0 ; j<clubsArrayPos; j++){
           fileWriter.write(clubsArray[j]+",");
 
    }
            fileWriter.write("\n");
            
for(int i = 0; i<clubsArrayPos; i++){
    for(int j = 0 ; j<clubsArrayPos; j++){
        if(clubMembersArray[j][i][0] != null){
           fileWriter.write(clubMembersArray[j][i][0] );
        }
        fileWriter.write(",");
           
           
    }
    fileWriter.write("\n");
}
           fileWriter.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
         
    }
}
