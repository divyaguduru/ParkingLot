package main.org.parkingsystem.impl;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class AppLauncher {
	
	public static void main(String[] args) throws IOException{
		String path,input,output;
		FileProcessor fp=new FileProcessor();
		System.out.print("oye");
		
		if(args.length>0 ){
			if(args[1].contains("txt")){
		 if (args[1]!=null && args[2]!=null && args[1].contains("txt") && args[2].contains("txt")){
			 path=args[0];
			 input=args[1];
			 output=args[2];
			 fp.processFile(path,input,output);
			 
		 }
			}
			else{
				String consoleInput=Arrays.toString(args);
				fp.processCommandInput(consoleInput);
			}
		 
		}
	}
	
	
}
