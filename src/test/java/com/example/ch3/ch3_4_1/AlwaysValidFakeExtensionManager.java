package com.example.ch3.ch3_4_1;

import java.io.IOException;

/**
 * Created by jerry on 2018/5/27.
 *
 * This class is testing helper
 *
 * @author jerry
 */
public class AlwaysValidFakeExtensionManager implements IExtensionManager {

    @Override
    public boolean isValid(String fileName) throws IOException {

        return true;
    }

}
