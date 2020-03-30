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
		DuplicateRemover app = new DuplicateRemover();
		app.remove("problem1.txt");
		app.write("unique_words.txt");
	}
}
