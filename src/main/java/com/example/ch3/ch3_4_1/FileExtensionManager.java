package com.example.ch3.ch3_4_1;

import java.io.IOException;
import java.util.Objects;

/**
 * Created by jerry on 2018/5/27.
 *
 * @author jerry
 */
public class FileExtensionManager implements IExtensionManager{

    @Override
    public boolean isValid(String fileName) throws IOException {

        if (Objects.nonNull(fileName)) {

            System.out.println("reading file");
            return true;
        }

        return false;
    }

}
