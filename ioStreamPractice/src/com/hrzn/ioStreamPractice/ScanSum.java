//The ScanSum example reads a list of double values and adds them up. Here's the source:

package com.hrzn.ioStreamPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ScanSum {
static Scanner s= null;
static double sum = 0;

	public static void main(String[] args) throws IOException {
		 Scanner s= null;
		 double sum = 0;
		try{ s = new Scanner(new BufferedReader(new FileReader("C:/insert/numbers.txt")));
		s.useLocale(Locale.US);

		while(s.hasNext()){
			if(s.hasNextDouble()){
				sum += s.nextDouble();
			}
		}
		System.out.println(sum);
		}
		finally{
			while(s!= null)
				s.close();
		}
	}

}
