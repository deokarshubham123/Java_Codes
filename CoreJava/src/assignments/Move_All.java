package assignments;

public class Move_All {

	public static void main(String[] args) {
		int[] array= {1, 0, 7, 8, 6, 4, 0, 0};
		
		int current=array.length-1;
		
		for(int i=array.length-1; i>=0; i--) {
			if(array[i] !=0) {
				array[current]=array[i];
				current--;
			}
		}
		while(current >=0) {
			array[current]=0;
			current--;
		}
		
	for(int i=0; i<array.length; i++) {
		System.out.print(array[i]+ " ");
	}

	}

}
