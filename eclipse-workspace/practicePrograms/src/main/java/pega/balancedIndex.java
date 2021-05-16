package pega;

public class balancedIndex {
	static int lftsum=0,rgtSum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,3,4,0,1,5,3};
		indexsum(a);
	}

	
	public static void indexsum(int b[]){
		int x=b.length;
		
		for(int i=1;i<x; i++){   
		// sum for left side values
		for(int k=i-1;k>=0; k--){  
		lftsum=lftsum+b[k];
		
		}
		//sum for right values
		for(int l=i+1;l<x; l++){
		rgtSum=rgtSum+b[l];
		}

		if(lftsum==rgtSum){
		System.out.println("index: "+i+ " lftsum :" +lftsum+ " rgtSum:" +rgtSum);

		}
		lftsum=0;
		rgtSum=0;
//		else{
//		System.out.println("there is no balanced index found for given array");
//		System.out.println("lftsum :" +lftsum+ "lftsum :" +lftsum);
		//}
		}

		}
	
}
