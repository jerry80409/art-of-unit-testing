package com.example.ch3.ch3_4_6;

import static org.junit.Assert.assertTrue;

import com.example.ch3.ch3_4_3.FakeExtensionManager;
import com.example.ch3.ch3_4_3.LogAnalyzer;
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
public class LogAnalyzerWithFactoryTest {

    @Test
    public void is_valid_filename_name_supported_extension_return_true() throws IOException {

        FakeExtensionManager fakeExtensionManager =
                new FakeExtensionManager();
        FakeExtensionManager.WILL_BE_VALID = true;

        ExtensionManagerFactory factory = new ExtensionManagerFactory();

        LogAnalyzer logAnalyzer = new LogAnalyzer();
        logAnalyzer.setManager(
                factory.setManager(fakeExtensionManager).create());

        boolean result = logAnalyzer.isValidLogFileName("target_file.ext");

        assertTrue(result);
    }
}
