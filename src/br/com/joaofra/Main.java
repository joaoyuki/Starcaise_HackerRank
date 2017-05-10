package br.com.joaofra;

public class Main {

	public static void main(String[] args) {
		
		
		int n = 6;
		int aux = n;
		int aux2 = n;
		
//		for(int y = 0 ; y < 6 ; y++){
//			for (int x = 0 ; x < aux ; x++){
//				System.out.print("#");
//				if(x == aux -1){
//					System.out.println("");
//				}
//			}
//			aux--;
//		}
//		######
//		#####
//		####
//		###
//		##
//		#		
		

		
//		for(int y = 0 ; y < n ; y++){
//			for (int x = 0 ; x < aux ; x++){
//				if(x < y + 1){
//					System.out.print("#");
//				}
//				if(x == aux -1){
//					System.out.println("");
//				}
//			}
//			
//		}	
//		#
//		##
//		###
//		####
//		#####
//		######		
		
		for(int y = 0 ; y < n ; y++){
			for (int x = 0 ; x < aux ; x++){
				
				if (x < aux2 -1){
					System.out.print(" ");
				} else {
					System.out.print("#");
				}
				
				if(x == aux -1){
					System.out.println("");
				}
			}
			aux2--;
			
		}
//	     #
//	     ##
//	    ###
//	   ####
//	  #####
//	 ######		
		
		
		

	}

}
