package com.example.ch3.ch3_4_3;

import com.example.ch3.ch3_4_1.IExtensionManager;

import java.io.IOException;

/**
 * Created by jerry on 2018/5/27.
 *
 * This class is medium class, be inject with {@link IExtensionManager}
 *
 * @author jerry
 */
public class LogAnalyzer {

    private IExtensionManager manager;


    public LogAnalyzer() {

    }

    public LogAnalyzer(IExtensionManager manager) {

        this.manager = manager;
    }


    public boolean isValidLogFileName(String fileName) throws IOException {

        return manager.isValid(fileName);
    }


    /**
     * If IExtensionManager is option for this class
     *
     * @param manager
     */
    public void setManager(IExtensionManager manager) {

        this.manager = manager;
    }


    public IExtensionManager getManager() {

        return this.manager;
    }

}
