package day01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Advance_3_MultidimensionalArrayToList {

	public static void main(String[] args) {
		 /*Write a return method that accepts an Multidimensional Array as input
         * Puts all elements in a new list
         * and prints all elements in natural order
         *
         * Eg : Input : {{John,Brad,Fox},{Lee,Ali},{Suzan}}
         * 		Output:[Ali, Brad, Fox, John, Lee, Suzan]
         */
		
		String [][] input = {{"John","Brad","Fox"},{"Lee","Ali"},{"Suzan"}};
		printList(input);

	}

	public static void printList(String[][] input) {
		
		List<String> list = new ArrayList<>();
		
		for(int i=0; i< input.length;i++) {
			for(int j=0;j<input[i].length;j++) {
				list.add(input[i][j]);
			}
			Collections.sort(list);
			System.out.println(list);
		}
	}

}
