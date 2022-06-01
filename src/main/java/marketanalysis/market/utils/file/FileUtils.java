package marketanalysis.market.utils.file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static List<List<String>> getCsvFileAsTwoDimensionArray(String filePath) {
        List<List<String>> result = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"windows-949"))) {
            createTwoDimensionArray(result, bufferedReader);
            return result;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("CSV 파일에서 데이터를 변환하는 과정에서 문제가 발생했습니다.");
        }
    }

    private static void createTwoDimensionArray(List<List<String>> result, BufferedReader bufferedReader) throws IOException {
        int count = 0;
        String line;
        while((line = bufferedReader.readLine()) != null) {
            if(count == 0) {
                count++;
                continue;
            }
            List<String> row = getRowData(line);
            result.add(row);
        }
    }

    private static List<String> getRowData(String line) {
        String[] split = line.split(",");
        List<String> row = new ArrayList<>();
        for(int i = 0; i < split.length; i++) {
            String s = split[i];
            String re = s.replaceAll("\"", "");
            row.add(re);
        }
        return row;
    }
}
