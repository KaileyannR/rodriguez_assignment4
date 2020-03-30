// Kaileyann Rodriguez
// COP 3330
// Programming Assignment 4

import java.util.Scanner;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCounter
{
	private Map<String, Integer> wordCounter;

	public DuplicateCounter()
	{
		wordCounter = new HashMap<String, Integer>();
	}

	// Determine the number of occurences of each word contained in file and
	// store each unique word and its count in an object.
	public void count(String dataFile)
	{
		try
		{
			Scanner find = new Scanner(new File(dataFile));
			while(find.hasNext())
			{
				String word = find.next();
				Integer count = wordCounter.get(word);

				if (count == null)
				{
					count = 1;
				}
				else
				{
					count = count + 1;
					wordCounter.put(word, count);
				}
			}
			find.close();
		}

		catch (FileNotFoundException e)
		{
			System.out.println(e);
		}
	}

	// Prints the current collection of unique words and their counts.
	public void write(String outputFile)
	{
		try
		{
			PrintWriter write = new PrintWriter(new File(outputFile));

			for (String wordc : wordCounter.keySet())
			{
				write.println(wordCounter.get(wordc));
			}
			write.close();
		}

		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
