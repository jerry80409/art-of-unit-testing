package com.example.ch3.ch3_4_3;

import com.example.ch3.ch3_4_1.IExtensionManager;

import java.io.IOException;
import java.util.Objects;

/**
 * Created by jerry on 2018/5/27.
 *
 * @author jerry
 */
public class FakeExtensionManager implements IExtensionManager {

    public static boolean WILL_BE_VALID = false;

    /**
     * Stub method
     *
     * @param fileName
     * @return
     */
    @Override
    public boolean isValid(String fileName) throws IOException {

        if (Objects.isNull(fileName) ||
                fileName.isEmpty()) {

            throw new IOException("File name should not be null or empty");
        }

        return WILL_BE_VALID;
    }

}
