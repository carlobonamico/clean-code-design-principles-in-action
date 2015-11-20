
public class ExpensesManager {
	public static void main(String[] args) {
		
		int reportType = 1; 
		
		if (args.length>0 && args[0].equals("TXT"))
			reportType = 2; 
		
		ExpensesReportGenerator reportGenerator = null;
		
		if (reportType == 1)
			reportGenerator = new HtmlReportGenerator();
		if (reportType == 2)
			reportGenerator = new TxtReportGenerator();
		
		ExpensesProcessor expensesProcessor = new ExpensesProcessor(); 
		
		expensesProcessor.setReportGenerator(reportGenerator);
		
		expensesProcessor.gen(); 
		
	}
}
