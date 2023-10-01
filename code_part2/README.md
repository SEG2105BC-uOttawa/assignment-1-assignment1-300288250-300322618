
import java.util.ArrayList;
import java.util.Vector;
import java.util.Random;
import java.util.Iterator;

public class Collection{
	public static long constructArrayList(int size){
		long startTime= System.currentTimeMillis();
		ArrayList<Integer> arrayList1 = new ArrayList<>();
		Random rand1 = new Random();
		for(int i =0;i<size;i++){
			arrayList1.add(rand1.nextInt(10));
		}
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		return totalTime;


	}
	public static long constructVector(int size){
		long startTime= System.currentTimeMillis();
		Vector<Integer> vector1 = new Vector<>();
		Random rand1 = new Random();
		for(int i =0;i<size;i++){
			vector1.add(rand1.nextInt(10));
		}
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		return totalTime;
	}
	public static long constructArray(int size){
		long startTime= System.currentTimeMillis();
		int []array1 = new int[size];
		Random rand1 = new Random();
		for(int i =0;i<size;i++){
			array1[i]=rand1.nextInt(10);
		}
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		return totalTime;
	}

	public static long iterateArrayList(int size){
		long startTime= System.currentTimeMillis();
		ArrayList<Integer> arrayList2 = new ArrayList<>();
		Random rand2 = new Random();
		for(int i =0;i<size;i++){
			arrayList2.add(rand2.nextInt(10));
		}
		Iterator<Integer> iter = arrayList2.iterator();
		while(iter.hasNext()){
			Integer value = iter.next();
		}
		
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		return totalTime;
	}
	public static long iterateVector(int size){
		long startTime= System.currentTimeMillis();
		Vector<Integer> vector2 = new Vector<>();
		Random rand2 = new Random();
		for(int i =0;i<size;i++){
			vector2.add(rand2.nextInt(10));
		}
		Iterator<Integer> iter = vector2.iterator();
		while(iter.hasNext()){
			Integer value = iter.next();
		}
		
		long endTime = System.currentTimeMillis();

		long totalTime = endTime - startTime;
		return totalTime;
	}
	public static long iterateArray(int size){
		long startTime= System.currentTimeMillis();
		int[] array2= new int[size];
		Random rand2 = new Random();
		for(int i =0;i<size;i++){
			array2[i]=rand2.nextInt(10);
		}
		
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		return totalTime;
	}


	public static void main(String[] args){

		int collectionSize = 880000000;
		int batchSize = 10000;
		long arrayListTime = 0;
		long vectorTime= 0;
		long arrayTime= 0;

    	for (int i = 0; i < collectionSize; i += batchSize) {
        	arrayListTime += constructArrayList(batchSize);
        	vectorTime += constructVector(batchSize);
        	arrayTime += constructArray(batchSize);
    	}

		long arrayListTimeIter = 0;
		long vectorTimeIter=0;
		long arrayTimeIter = 0;
		for (int i = 0; i < collectionSize; i += batchSize) {
        	arrayListTimeIter += iterateArrayList(batchSize);
        	vectorTimeIter += iterateVector(batchSize);
        	arrayTimeIter += iterateArray(batchSize);
    	}
		System.out.println("Construction Time in ms:");
		System.out.println("ArrayList: " + arrayListTime);
		System.out.println("Vector: "+ vectorTime);
		System.out.println(" Array: "+ arrayTime);


		System.out.println("\nIteration Time in ms:");
		System.out.println("ArrayList: " + arrayListTimeIter);
		System.out.println("Vector: "+ vectorTimeIter);
		System.out.println(" Array: "+ arrayTimeIter);

		System.out.println("\nAs we can see from the data presented, the construction time and the iteration time of the ArrayList takes the longest.");
		System.out.println("We can see that the time for the construction and iteration of a Vector takes less time.");
		System.out.println("However, the construction as well as the iteration of an Array takes the least amount of time, making it the most time efficient out of all three of them.");
		System.out.println("So, from these conclusions, it would be recommended to use Arrays out of all of them as they are the most time efficient.");
	}
	
}
