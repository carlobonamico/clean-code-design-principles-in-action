import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class ExpensesProcessor {
	ExpensesData expensesData = new ExpensesData();
	private ExpensesReportGenerator reportGenerator; 

	


	void gen() {
		
		
		String in = getInputFileName();
						
		try {
			BufferedReader reader = new BufferedReader(new FileReader(in));
			
			String line = reader.readLine();

			while(line != null)
			{
				boolean skipHeader = readHeader(reader, line);
				if (skipHeader)
				{
					line = reader.readLine();

					continue; 
				}
				
				parseLineAndUpdateTotal(line);
				
				
				line = reader.readLine();
			}
			
			//generateTxtReport();
			
			
			//ExpensesReportGenerator reportGenerator = new TxtReportGenerator();
			
			reportGenerator.generateReport(expensesData);
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}





	private boolean readHeader(BufferedReader reader, String line) throws IOException {
		boolean result = false; 
		
		if (expensesData.c ==0)
		{
			expensesData.c++; 
			line = reader.readLine();
			result = true;

		}
		
		return result; 
		
	}

	private void parseLineAndUpdateTotal(String line) {
		
		Expense expense = parseLine(line); 
		
		updateTotals(expense.type, expense.amount); 
		

	}

	private Expense parseLine(String line) {
		Expense expense = new Expense(); 
		
		String [] tmp = line.split(",");
		try {
			Date dc = new SimpleDateFormat("dd/MM/yyyy").parse(tmp[0]);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		expense.type = tmp[1];
		expense.amount = Float.parseFloat(tmp[2]);
		return expense;
	}

	private void updateTotals(String t, float expense) {
		expensesData.c++; 
			
		if (expensesData.expenses.get(t) == null)
		{
			expensesData.expenses.put(t, expense);
		} else
		{
			expensesData.expenses.put(t, expensesData.expenses.get(t) + expense);
		}
		
		expensesData.tt += expense;
	}

	private String getInputFileName() {
		return "input/"+(new Date().getMonth() +1)+".csv";
	}





	public void setReportGenerator(ExpensesReportGenerator reportGenerator) {
		this.reportGenerator = reportGenerator;
	}

}
