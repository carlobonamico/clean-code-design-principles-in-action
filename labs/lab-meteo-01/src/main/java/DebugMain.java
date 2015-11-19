import it.nispro.training.cleancode.meteo.MeteoDataImporter;


public class DebugMain {

	public static void main(String[] args) {
		MeteoDataImporter importer = new MeteoDataImporter(); 
		
		System.out.println(importer.importFile("input/meteo-data.csv"));

	}

}
