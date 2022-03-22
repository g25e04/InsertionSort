public class InsertionSort {

	public InsertionSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myarray[]= {5,7,9,5,2,3,1,4,8,6,2};
		Insertion in = new Insertion();
		System.out.println("The array before Insertion Sort :");
		for(int i=0;i<myarray.length;i++) {
			System.out.print(myarray[i]+" ");
		}
		in.Insert(myarray);
		System.out.println("\nThe array after Insertion Sort :");
		for(int i=0;i<myarray.length;i++) {
			System.out.print(myarray[i]+" ");
		}
	}
}