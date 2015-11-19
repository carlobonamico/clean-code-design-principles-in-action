package it.nispro.training.cleancode.meteo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MeteoDataImporter {

	public List<MeteoForecast> importFile(String fileName) {
		File fileToImport = new File(fileName);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		List<MeteoForecast> forecasts = new ArrayList<MeteoForecast>();
        
        
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			
			String line = reader.readLine();
			while(line != null)
			{
				String [] lineElements = line.split(",");
				forecasts.add(new MeteoForecast(lineElements[1],
						formatter.parse(lineElements[0]),
						Integer.parseInt(lineElements[2]),Integer.parseInt(lineElements[3].trim()), lineElements[4])

				);
/*
				forecasts.add(new MeteoForecast(lineElements[1],
						formatter.parse(lineElements[0]),
						Integer.parseInt(lineElements[2].trim()),Integer.parseInt(lineElements[3].trim()), lineElements[4])

				);
*/
				line = reader.readLine();
			}
			
			
			
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
		
		return forecasts;
	}

}
