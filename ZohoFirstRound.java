package com.example.demo.firstRound;

public class ZohoFirstRound {

	private int n ;
	
	public ZohoFirstRound(int n) {
		// TODO Auto-generated constructor stub
		this.n = n ;
	}
	
	public void printSnakeMatrix() {
		int gap = n - 1 ;
		int count = 1 ;
		int reverse = 0 ;
		for(int i=0; i<n; i++ ) {
			for(int j=0; j<n*2-1 && j<(gap+n); j++ ) {
								
				String current = (i%2 != 0) ? ( j < gap ) ? " " : reverse-- +"" : ( j < gap ) ? " " : count++ +"" ;
				System.out.print(current +" ");

			}
			reverse = count +  n - 1 ;
			System.out.println();
			gap-- ;
		}
	}
	
	public static void main(String[] args) {
		ZohoFirstRound zohoFirstRound = new ZohoFirstRound(4) ;
		zohoFirstRound.printSnakeMatrix();
	}
	
}
