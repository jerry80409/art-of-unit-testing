package com.example.ch3.ch3_4_1;

import java.io.IOException;

/**
 * Created by jerry on 2018/5/27.
 *
 * this interface is help for stub and mock testing
 *
 * @author jerry
 */
public interface IExtensionManager {

    boolean isValid(String fileName) throws IOException;

}
