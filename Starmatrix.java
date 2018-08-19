class Starmatrix {
	public static void main(String args[]) {
		Starmatrix st = new Starmatrix();
		System.out.println("Squire star matrics");
		st.starRec(4);
		System.out.println("Number Half Pyramid");
		st.numTree(7);
		System.out.println("Inverted Half pyramid");
		st.innumTree(7);
		System.out.println("Alphabet Tree");
		st.alphaTree(6);
		System.out.println("Doller Box");
		st.dollerBox(5);
	}
	/*
          * * * *
          * * * *
          * * * *
          * * * *          
        */
	public void starRec(int n) {
		
        //for loop for repeat the row
		for(int i=0;i<n;i++){
			System.out.println();
			//for loop for repeat the column
			for(int j=0;j<n;j++){
				System.out.print("* ");
			}
		}
		System.out.println();
	}
	/*
	1
	1 2
	1 2 3
	1 2 3 4
	1 2 3 4 5
	*/
	public void numTree(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println();
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
		}
		System.out.println();
	}

	/*

	A
	A B
	A B C
	A B C D
	A B C D E

	*/
	public void alphaTree(int n) {
		char start='A',temp=start;
		for(int i=0;i<=n;i++) {
			temp=start;
			System.out.println();
			for(int j=0;j<=i;j++) {
				System.out.print(temp+" ");
				temp++;
			}
		}
		System.out.println();
	}
	public void dollerBox(int n){
		for(int i=0;i<n;i++) {
			System.out.println();
			for(int j=0;j<n;j++){
				if(i==0||i==n-1) {
					System.out.print("$ ");
				}
				else {
					if(j==0|| j==n-1)
						System.out.print("$ ");
					else
						System.out.print("  ");
				}
			}
		}
		System.out.println();
	}

	public void innumTree(int n) {
		for(int i=n;i>0;i--){
			System.out.println();
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
		}
			System.out.println();
		
	}
}