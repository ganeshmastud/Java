class multiDimensional 
{ 
	public static void main(String args[]) throw Exception
	{ 
		// declaring and initializing 2D array 
		int arr[][][] = {{ {2,7},{9,6}},{{3,6},{1,1}},{{7,4},{2,8}} }; 

		//int arr[][][] = new int[5][5][5];

		// printing 2D array 
		for (int i=0; i< 3 ; i++) //for column
		{ 
			for (int j=0; j < 4; j++) //for row
			{ 
				
			for (int k=0;k<2;k++)
			System.out.println(arr[i][j][k] +"");
			}
			System.out.println(); 
		} 
	} 
} 
