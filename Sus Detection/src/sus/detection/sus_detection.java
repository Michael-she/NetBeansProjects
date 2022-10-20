import java.io.*;
import java.util.*;

public class sus_detection {
	static int big_h, big_w, h, w;
	static int[][] drawing;
	static int[][] description;
	static int sus_regions;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		big_h = input.nextInt();
		big_w = input.nextInt();
		h = input.nextInt();
		w = input.nextInt();
                
		drawing = new int[big_h][big_w];
                
		for (int _i = 0; _i < big_h; _i++) {
			for (int _j = 0; _j < big_w; _j++) {
				drawing[_i][_j] = input.nextInt();
			}
		}
		description = new int[h][w];
		for (int _i = 0; _i < h; _i++) {
			for (int _j = 0; _j < w; _j++) {
				description[_i][_j] = input.nextInt();
			}
		}
		// DO STUFF
		
                for(int y = 0; y<=big_h-h;y++){
                    for (int x = 0; x<=big_w-w;x++){
                        boolean sus = true;
                        int colour1 = -1;
                        int colour2 = -1;
                        
                       
                        for(int ySearch = 0; ySearch<h; ySearch++){
                            for(int xSearch = 0; xSearch<h; xSearch++){
                                
                           if(description[ySearch][xSearch] == 1 && colour1 == -1){
                               colour1 = drawing[ySearch+y][xSearch+x];
                             //   System.out.println("Col 1 - " + colour1);
                        
                           }
                           if(description[ySearch][xSearch] == 2 && colour2 == -1){
                               colour2 = drawing[ySearch+y][xSearch+x];
                             //  System.out.println("Col 2 - " + colour2);
                           }
                           
                           
                                if( description[ySearch][xSearch] == 1  ){
                                    if(!(drawing[ySearch+y][xSearch+x] == colour1)){
                                   sus = false; 
                                    }
                                }
                                
                                 if( description[ySearch][xSearch] == 2  ){
                                    if(!(drawing[ySearch+y][xSearch+x] == colour2)){
                                   sus = false; 
                                    }
                                }
                                
                            }
                        }
                        if(sus){
                            sus_regions++;
                        }
                        
                        
                        
                        
                    }                 
                    
                    
                }
                /*
                 for(int y = 0; y<big_h;y++){
                    for (int x = 0; x<big_w;x++){
                    /    System.out.print(drawing[y][x]+" | ");
                    }System.out.println("");}
                    */
                
                
                
		System.out.println(sus_regions);
	}
}