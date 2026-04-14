package com.demo.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataFile {
	


	
		public static void main(String args[])
		{
//			BufferedInputStream bis=null;
			DataOutputStream dos=null;
			
			File f=new File("testcopydata.txt");
			try
			{
				if(f.exists())
				{
					dos=new DataOutputStream(new FileOutputStream(f,true));
							
				}
				else
				{
					dos=new DataOutputStream(new FileOutputStream(f));
				}
			}
				

	catch(FileNotFoundException e)
	{
		
	}
			try( DataInputStream bis=new DataInputStream(new FileInputStream(f));
					DataOutputStream bos1=dos;)
			{
			
				int i=bis.read();
				while(i!=1)
				{
					dos.write(i);
					i=bis.read();
					
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		

	}
	}


