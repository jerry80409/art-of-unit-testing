package com.example.ch3.ch3_4_1;

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
public class FileExtensionManagerTest {


    @Test
    public void is_valid_log_file_name() throws IOException {

        IExtensionManager mockManager = new AlwaysValidFakeExtensionManager();
        String fileName = "target_file";

        assertTrue(mockManager.isValid(fileName));
    }
}
