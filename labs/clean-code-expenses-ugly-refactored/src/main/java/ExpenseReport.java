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


public class ExpenseReport {
	Map<String, Float> expenses = new HashMap<String,Float>();
	private float max = 100;
	
	public static void main(String[] args) {
		new ExpenseReport().gen(); 
		
	}

	private void gen() {
		
		
		String in = "input/"+(new Date().getMonth() +1)+".csv";
						
		try {
			BufferedReader reader = new BufferedReader(new FileReader(in));
			
			String line = reader.readLine();
			float tt = 0;
			int c = 0;
			while(line != null)
			{
				if (c ==0)
				{
					c++; 
					line = reader.readLine();
					continue;

				}
				
				String [] tmp = line.split(",");
				c++; 
				
				Date dc = new SimpleDateFormat("dd/MM/yyyy").parse(tmp[0]);
				
				String t = tmp[1];
				
				if (expenses.get(t) == null)
				{
					expenses.put(t, Float.parseFloat(tmp[2]));
				} else
				{
					expenses.put(t, expenses.get(t) + Float.parseFloat(tmp[2]));
				}
				
				tt += Float.parseFloat(tmp[2]); 
				
				
				line = reader.readLine();
			}
			
			PrintWriter p = new PrintWriter("output/expenses-"+(new Date().getMonth()+1 )+".txt");
			
			
			p.println("Month January");

			p.println("Expenses: "+c);
			
			for (String s: expenses.keySet())
			{
				p.println(s+ ": "+expenses.get(s));
					
			}
			p.println("---");
			
			p.println("Total: "+tt);
			
			if (tt > max )
			{
				p.println("Exceeeds max");
			}
			
			p.close();
			
			PrintWriter p2 = new PrintWriter("output/expenses-"+(new Date().getMonth()+1 )+".html");
			
			p2.println("<html><body>");
			
			p2.println("<h1>Month January</h1>");

			p2.println("<br/>Expenses: "+c);
			for (String s: expenses.keySet())
			{
				p.println(s+ ": "+expenses.get(s)+"</br>");
					
			}
			p.println("<hr>");
			p2.println("<b>Total: "+tt+"</b>");
			
			if (tt > max )
			{
				p.println("<h3>Exceeeds max</h3>");
			}
			p2.println("</html></body>");
			
			p.close();
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
