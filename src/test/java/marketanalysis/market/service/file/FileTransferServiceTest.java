package marketanalysis.market.service.file;

import marketanalysis.market.service.FileTransferService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class FileTransferServiceTest {

    @Autowired
    FileTransferService FILE_TRANSFER_SERVICE;

    @Test
    void transferMarketArea() {
        FILE_TRANSFER_SERVICE.transferMarketArea();
    }

    @Test
    void transferMarketStore() {
        FILE_TRANSFER_SERVICE.transferMarketStore();
    }

    @Test
    void transferMarketBenefit() {
        FILE_TRANSFER_SERVICE.transferMarketBenefit();
    }

    @Test
    void transferSggMarketChange() {
        FILE_TRANSFER_SERVICE.transferSggMarketChange();
    }

    @Test
    void transferUmdMarketChange() {
        FILE_TRANSFER_SERVICE.transferUmdMarketChange();
    }
}