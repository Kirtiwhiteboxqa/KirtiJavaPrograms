package com.File;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/*
* Write a program to show list of all file names in a folder.
*/
public class ListOfFilesInAFolder {

	public static void listFiles(String srcDirectory, ArrayList<File> files) throws IOException
	{
		
		File dir = new File(srcDirectory);
		
		File[] fList = dir.listFiles();
		for(File f: fList)
		{
			if(f.isFile())
				files.add(f);
			else if (f.isDirectory())
				//Do a recursive call if directory has sub-directories
				listFiles(f.getAbsolutePath(), files);
		}
	}

	

	public static void main(String[] args) throws IOException {
		
		String srcDirectory = "C:/kirti/notes from the WBQA training/CopyFileJavaProg";
		ArrayList<File> list = new ArrayList<File>();
		
		try
		{
			listFiles(srcDirectory, list);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(list != null)
			{
				for(File f: list)
					System.out.println(f.getAbsolutePath());
			}
		}
	}
}
