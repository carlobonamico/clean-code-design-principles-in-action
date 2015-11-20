import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;


public class TxtReportGenerator implements ExpensesReportGenerator {

	public void generateReport(ExpensesData expensesData)  {
		PrintWriter p;
		try {
			p = new PrintWriter("output/expenses-"+(new Date().getMonth()+1 )+".txt");

		
		
		p.println("Month January");

		p.println("Expenses: "+expensesData.c);
		
		for (String s: expensesData.expenses.keySet())
		{
			p.println(s+ ": "+expensesData.expenses.get(s));
				
		}
		p.println("---");
		
		p.println("Total: "+expensesData.tt);
		
		if (expensesData.tt > expensesData.max )
		{
			p.println("Exceeeds max");
		}
		
		p.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
