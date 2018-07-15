package basicsOfJava;

public class Loops{
	
	//Archan Bhatt
	
	public static void main(String[] args){
		
		String s = "2018.0";
		String[] s1 = s.split("\\."); 
		
		System.out.println(s1[0]);
	
		//loop 1
		/*
		for(int row=8; row>=1; row--){
			for(int col=1; col<=row; col++){
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//loop2
		/*
		for(int row=1; row<=8; row++){
			for(int col=1; col<=row; col++){
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//loop 3 
		/*
		int row = 7;
		int count = row - 1;
		for(int i=1; i<=row; i++){
			for(int j=1; j<=count; j++){
				System.out.print(" ");
			}	
			count--;
			for(int k=1; k<=2*i-1; k++){
				System.out.print("*");
			}
				System.out.println();
		}
		*/
		
		//loop 4
		/*
		int row=7;
		int count=row-1;
		for(int i=1;i<=row;i++){			
			for(int j=6;j>count;j--){
				System.out.print(" ");
			}
			count--;
			for(int k=13;k>=2*i-1;k--){				
				System.out.print("*");
			}			
			System.out.println();			
		}
		*/
		
		//loop 5
		
		int number = 7;
		int count1 = number - 1;
		int count2 = number - 1;
		for(int i=1; i<=number; i++){
			for(int j=1; j<=count1; j++){
				System.out.print(" ");
			}	
			count1--;
			for(int k=1; k<=2*i-1; k++){
				System.out.print("*");
			}
				System.out.println();
		}
		
		for(int i=1;i<=number-1;i++){			
			for(int j=6;j>=count2;j--){
				System.out.print(" ");
			}
			count2--;
			for(int k=11;k>=2*i-1;k--){				
				System.out.print("*");
			}			
			System.out.println();			
		}
		
		
		//loop 6
		/*
		int number = 7;
		int count = number - 1;
		int x=1;
		for(int i=1; i<=number; i++){
			for(int j=1; j<=count; j++){
				System.out.print(" ");
			}	
			count--;
			for(int k=1; k<=x; k++){
				System.out.print("*");
			}
			x++;
				System.out.println();
		}
		*/
		
		
		//loop 7 
		/*
		int row = 7;		
		for(int i=1; i<=row; i++){
			if(i==1 || i==7){
				for(int j=1; j<=row; j++){
					System.out.print("*");
				}
				System.out.println();
			}
			if(i>1 && i<7){
				for(int j=1; j<=row; j++){
					if(j==1 || j==7){
						System.out.print("*");
					}
					if(j>1 && j<7){
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
		}
		*/
		
		//loop 8
		
		
		
		
		
		
		
		
		
		
		
	}
}