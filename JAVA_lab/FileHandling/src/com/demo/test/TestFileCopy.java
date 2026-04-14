package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileCopy {
	public static void main(String[] args)
	{
		
		try(FileInputStream fis=new FileInputStream("testdata.txt");
			FileOutputStream  fos=new FileOutputStream("testdatacopy.txt");) {
			
			
			int d=fis.read();
			while(d!=-1)
			{
				fos.write(d);
				d=fis.read();
			}
			System.out.println("text copied");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException  e)
		{
			e.printStackTrace();
		}
		
		}
	}


