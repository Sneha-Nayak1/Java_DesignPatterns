package template_DP;

public class Main {

	public static void main(String[] args) {
		DataProcessor c=new CSVFile();
		c.process();
		System.out.println();
		DataProcessor j=new JSONFile();
		j.process();
	}

}


/*Implement a system to process different types of data files (e.g., CSV, JSON). 
 * The steps for processing these files are similar: read the file, parse the data, process the data, and finally save the results. 
 * However, the implementation of the reading, parsing, and saving steps can vary depending on the file type.
1. DataProcessor: Abstract Base Class to Process the data file, and methods to read, parse, process & save data
2. Concrete class: Create different data processor for CSV and JSON
3. Main: Demonstrate CSV and JSON file processing.*/