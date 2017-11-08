package utilities;

import application.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CSVReader {
	
	public List<IMAssToMyGrp> ReadIncidentExport(String _csvFile, String _csvSplitBy) {
		String line = "";
		BufferedReader br = null; 
		List<IMAssToMyGrp> importedIncidents = new ArrayList<IMAssToMyGrp>(); 
		//IMAssToMyGrp[] importedIncidents = null ;
		
		try {
			br = new BufferedReader(new FileReader(_csvFile));			
			line = br.readLine(); //1. Zeile mit Spaltentiteln überlesen
								
			while ((line = br.readLine()) != null) {
				String[] data = line.split(_csvSplitBy);
								
				//Der Split nach '"' erzeugt abwechselnd leere und nicht leere Elemente in 
				//data[], beginnend mit leeren. Uns interessieren nur die nicht leeren, 
				// also die ungeraden
				
				// neues Incident-Objekt erzeugen...
				IMAssToMyGrp im = new IMAssToMyGrp();
				
				//...und befüllen mittels zuletzt gelesenem Datensatz
				im.setImNumber(data[1]);
				im.setTitle(data[3]);
				im.setMasterChild(data[5]);http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=3085446
				im.setStatus(data[7]);
				im.setType(data[9]);
				im.setReportedCI(data[11]);
				im.setLayer1(data[13]);
				im.setPrio(Integer.parseInt(data[15]));
				im.setImpact(data[17]);
				im.setAssignmentGroup(data[19]);
				im.setAssignedTo(data[21]);
				im.setCompany(data[23]);
				im.setStartTime(data[25]);
				im.setLastUpdateTime(data[27]);
				
				importedIncidents.add(im);				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return importedIncidents;
		
	}
	
}
