package starterkit.stockMarket.stockReader;

import java.util.Map;
import java.util.Set;

import starterkit.stockMarket.to.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

import org.joda.time.LocalDate;
import org.springframework.stereotype.Component;

@Component
public class StockReader {
	
	public Map<LocalDate, Set<StockTo>> readFile() throws NumberFormatException, IOException, ParseException {
		Map<LocalDate, Set<StockTo>> tmpMap = new HashMap<LocalDate, Set<StockTo>>();
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\dane.csv"));
			Set<StockTo> stocks = new HashSet<StockTo>();
			String line;
			while((line = bufferedReader.readLine()) != null) {
				String[] linesplit = line.split(",");
				String company = linesplit[0];
				String date = linesplit[1];
				int year = Integer.parseInt(date.substring(0, 4));
				int month = Integer.parseInt(date.substring(4, 6));
				int day = Integer.parseInt(date.substring(6, 8));
				LocalDate newdate = new LocalDate(year, month, day);
				double value = Double.parseDouble(linesplit[2]);
				if(tmpMap.containsKey(newdate)) {
					stocks = tmpMap.get(newdate);
					tmpMap.remove(newdate);
				}
				stocks.add(new StockTo(company,value,0L));
				tmpMap.put(newdate, stocks);
			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return tmpMap;
	}

}
