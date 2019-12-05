package org.apache.maven.archetypes.maven_archetype_quickstart;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Homework_TEST {

		
		@Test
		public void testMaxForEmptyArray() {
			int array[]= {};
			assertEquals(0, Homework.getMax(array));	
		}
		
		@Test
		public void testMaxForArrayWithOneELem() {
			int array []= {1};
			assertEquals(1,Homework.getMax(array));
		}
		
		@Test
		public void testMaxWithNegativeNumbersAndZero() {
			int array[]= {0,4,-5,90,7,8};
			assertEquals(90, Homework.getMax(array));
		}
		
		@Test
		public void testMinWithNegativeNumbersAndZero() {
			int array[]= {0,4,-5,90,7,8};
			assertEquals(0, Homework.getMin(array));
		}
		
		@Test
		public void testMinForEmptyArray() {
			int array[]= {};
			assertEquals(0, Homework.getMin(array));	
		}
		
		@Test
		public void testMinForArrayWithOneELem() {
			int array []= {1};
			assertEquals(1,Homework.getMin(array));
		}

		@Test
		public void testCountWithNegativeNumbersAndZero() {
			int array[]= {0,4,-5,90,7,8};
			assertEquals(6, Homework.getCount(array));
		}
		
		@Test
		public void testCountForEmptyArray() {
			int array[]= {};
			assertEquals(0, Homework.getCount(array));	
		}
		
		@Test
		public void testCountForArrayWithOneELem() {
			int array []= {1};
			assertEquals(1,Homework.getCount(array));
		}
		
		@Test
		public void testAvgWithNegativeNumbersAndZero() {
			int array[]= {0,-5,7,10,13};
			assertEquals(5, Homework.getAverage(array));
		}
		
		@Test
		public void testAvgForEmptyArray() {
			int array[]= {};
			assertEquals(0, Homework.getAverage(array));	
		}
		
		@Test
		public void testAvgForArrayWithOneELem() {
			int array []= {1};
			assertEquals(1,Homework.getAverage(array));
		}



}
