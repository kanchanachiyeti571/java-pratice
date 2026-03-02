package utils;



import java.io.*;
import java.util.*;

public class CSVReaderUtil {

    public static Object[][] getCSVData(String filePath) throws IOException {

        List<Object[]> data = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        br.readLine(); // skip header

        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            data.add(values);
        }

        br.close();

        return data.toArray(new Object[0][]);
    }
}
