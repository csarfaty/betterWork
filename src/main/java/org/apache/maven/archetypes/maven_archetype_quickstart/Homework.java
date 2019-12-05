package org.apache.maven.archetypes.maven_archetype_quickstart;


public class Homework {
	public static void main (String args[]) {
	int array[]= {1,4,5,3,7,8};
	System.out.println("COUNT:");
	System.out.println(getCount(array));
	System.out.println("MIN:");
	System.out.println(getMin(array));
	System.out.println("MAX:");
	System.out.println(getMax(array));
	System.out.println("AVERAGE:");
	System.out.println(getAverage(array));

	}
	
	public static int getAverage(int []array) {
		if (array.length==0) {
			return 0;
		}
		int count=getCount(array);
		int total=0;
		for (int i=0; i<array.length;i++) {
				total=array[i]+total;
			}
		return total/count;
		}
	public static int getMax(int [] array) {
		if (array.length==0) {
			return 0;
		}
		int max=array[0];
		for (int i=1; i<array.length;i++) {
			if (array[i]>max) {
				max=array[i];
			}
		}
		return max;
	}

public static int getCount(int [] array) {
	
	return array.length;
}
public static int getMin(int [] array) {
	
	if (array.length==0) {
		return 0;
	}
	int min=array[0];
	for (int i=1; i<array.length;i++) {
		if (array[i]<min) {
			min=array[i];
			}
		}
		return min;
	}

}
