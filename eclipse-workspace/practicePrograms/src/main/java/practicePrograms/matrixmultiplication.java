package practicePrograms;

public class matrixmultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};
		int res[][]=new int[a.length][b.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				res[i][j]=0;
				for(int k=0;k<b[0].length;k++) {
					res[i][j]+=a[i][k]*b[k][j];
					
				}
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}

		
	}

}
