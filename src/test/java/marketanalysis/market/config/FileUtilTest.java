package marketanalysis.market.config;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class FileUtilTest {
    @Test
    void readFile() {
        String filePath = "/Users/zenon/Library/Mobile Documents/com~apple~CloudDocs/Desktop/Project/Spring-Service-Project/market/src/main/resources/static/csv/market_area.csv";
        List<List<String>> result = FileUtils.getCsvFileAsTwoDimensionArray(filePath);
        assertThat(result.size()).isEqualTo(1496);
    }
}
