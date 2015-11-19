import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ExpenseReport {

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
				String [] tmp = line.split(",");
				c++; 
				
				Date dc = new SimpleDateFormat("dd/MM/yyyy").parse(tmp[0]);
				tt += Float.parseFloat(tmp[1]); 
				
				
				line = reader.readLine();
			}
			
			PrintWriter p = new PrintWriter("output/expenses-"+(new Date().getMonth()+1 )+".txt");
			
			
			p.println("Month January");

			p.println("Expenses: "+c);

			p.println("Total: "+tt);
			
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
