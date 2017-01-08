package main.org.parkingsystem.impl;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class AppLauncher {

	public static void main(String[] args) throws IOException{
		System.out.print("helllllllllpo"+args[1]);
		FileProcessor fp=new FileProcessor();
		 if (args[1]!=null && args[2]!=null && args[1].contains("txt") && args[2].contains("txt")){
			String path=args[0];
			 String input=args[1];
			String output=args[2];
			 fp.processFile(path,input,output);
		 }
		 else{
			 fp.processCommandInput(args[0]);
		 }
	}
	
	
}
