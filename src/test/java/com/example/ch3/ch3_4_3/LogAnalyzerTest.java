package com.example.ch3.ch3_4_3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * Created by jerry on 2018/5/27.
 *
 * @author jerry
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LogAnalyzerTest {

    @Test
    public void is_valid_filename_name_supported_extension_return_true() throws IOException {

        FakeExtensionManager fakeExtensionManager =
                new FakeExtensionManager();
        FakeExtensionManager.WILL_BE_VALID = true;

        LogAnalyzer logAnalyzer = new LogAnalyzer(fakeExtensionManager);
        boolean result = logAnalyzer.isValidLogFileName("target_file.ext");

        assertTrue(result);
    }


    @Test(expected = IOException.class)
    public void is_valid_filename_supported_extension_throw_io_exception() throws IOException {

        FakeExtensionManager fakeExtensionManager =
                new FakeExtensionManager();
        FakeExtensionManager.WILL_BE_VALID = true;

        LogAnalyzer logAnalyzer = new LogAnalyzer(fakeExtensionManager);

        // expect the act will throw IOException
        logAnalyzer.isValidLogFileName(null);
    }

    /**
     * testing case 3_5
     */
    @Test
    public void is_valid_filename_name_supported_extension_return_true_2() throws IOException {

        // set up stub to use
        FakeExtensionManager fakeExtensionManager =
                new FakeExtensionManager();
        FakeExtensionManager.WILL_BE_VALID = true;

        // create analyzer
        LogAnalyzer logAnalyzer = new LogAnalyzer();
        // inject fakeExtensionManager
        logAnalyzer.setManager(fakeExtensionManager);

        boolean result = logAnalyzer.isValidLogFileName("target_file.ext");

        assertTrue(result);
    }
}
