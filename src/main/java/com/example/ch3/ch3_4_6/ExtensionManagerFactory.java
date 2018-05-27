package com.example.ch3.ch3_4_6;

import com.example.ch3.ch3_4_1.FileExtensionManager;
import com.example.ch3.ch3_4_1.IExtensionManager;

import java.util.Objects;

/**
 * Created by jerry on 2018/5/27.
 *
 * @author jerry
 */
public class ExtensionManagerFactory {

    private IExtensionManager manager;

    IExtensionManager create() {

        if (Objects.isNull(manager)) {
            return new FileExtensionManager();
        }

        return manager;
    }


    ExtensionManagerFactory setManager(IExtensionManager manager) {

        this.manager = manager;
        return this;
    }
}
