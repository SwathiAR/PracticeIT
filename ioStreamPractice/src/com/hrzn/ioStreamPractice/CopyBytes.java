//explore FileInputStream and FileOutputStream by examining an example program 
//named CopyBytes, which uses byte streams to copy xanadu.txt, one byte at a time.

package com.hrzn.ioStreamPractice;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
FileOutputStream out=null;
try {
	in= new FileInputStream("C:/insert/MultiThreading.txt");
	out = new FileOutputStream("C:/insert/MultiThreading1.txt");
	
	int c;
	
	while((c=in.read())!= -1){
		out.write(c);
		
		
	}
System.out.println("Copied bytes");
}finally{
	if(in != null){
		in.close();
		
	}
	if(out != null){
		out.close();
	}
} 




	}

}
