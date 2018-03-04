package com.iuling.logutils.file;

import java.io.File;

/**
 * Created by 宋小雄 on 2017/3/30.
 */

public interface LogFileEngine {
    void writeToFile(File logFile, String logContent, LogFileParam params);
}
