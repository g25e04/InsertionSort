public class Insertion {

	public Insertion() {
		// TODO Auto-generated constructor stub
	}

	
	public void Insert(int myarray[]) {
		
		for(int i=1;i<myarray.length;i++) {
			int k=myarray[i];
			int j=i-1;
			
			while(j>=0&&myarray[j]>k) {
				myarray[j+1]=myarray[j];
				j-=1;
			}
			myarray[j+1]=k;
		}
	}
}
