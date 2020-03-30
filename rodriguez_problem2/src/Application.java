// Kaileyann Rodriguez
// COP 3330
// Programming Assignment 4

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class Application
{
	public static void main(String[] args)
	{
		DuplicateCounter dup = new DuplicateCounter();
		dup.count("problem2.txt");
		dup.write("unique_wordcount.txt");
	}
}
