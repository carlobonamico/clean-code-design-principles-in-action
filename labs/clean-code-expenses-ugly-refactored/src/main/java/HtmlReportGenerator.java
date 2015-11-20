import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;


public class HtmlReportGenerator implements ExpensesReportGenerator {
	
	public HtmlReportGenerator()
	{
	}
	
	public void generateReport(ExpensesData expensesData)  {
		PrintWriter p2;
		try {
			p2 = new PrintWriter("output/expenses-"+(new Date().getMonth()+1 )+".html");

		
		p2.println("<html><body>");
		
		p2.println("<h1>Month January</h1>");

		p2.println("<br/>Expenses: "+expensesData.c);
		for (String s: expensesData.expenses.keySet())
		{
			p2.println(s+ ": "+expensesData.expenses.get(s)+"</br>");
				
		}
		p2.println("<hr>");
		p2.println("<b>Total: "+expensesData.tt+"</b>");
		
		if (expensesData.tt > expensesData.max )
		{
			p2.println("<h3>Exceeeds max</h3>");
		}
		p2.println("</html></body>");
		
		p2.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
