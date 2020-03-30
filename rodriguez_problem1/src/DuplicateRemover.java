// Kaileyann Rodriguez
// COP 3330
// Programming Assignment 4

import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.io.PrintWriter;
import java.util.Set;

public class DuplicateRemover
{
	private Set<String> uniqueWords;

	public DuplicateRemover()
	{
		uniqueWords = new HashSet<>();
	}

	// Determines th unique words contained in a file and stores those unique
	// words in an object.
	public void remove(String dataFile)
	{
		try
		{
			Scanner file = new Scanner(new File(dataFile));

			while(file.hasNext())
			{
				uniqueWords.add(file.next());
			}
			file.close();
		}

		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
	}

	// Prints the current collection of unique qords to outputFile.
	public void write(String outputFile)
	{
		try
		{
			PrintWriter makeNew = new PrintWriter(new File(outputFile));
			for (String word : uniqueWords)
			{
				makeNew.println();
			}
			makeNew.close();
		}

		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
