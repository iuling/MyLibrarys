package com.iuling.logutils.file;

import com.iuling.logutils.LogLevel;

/**
 * Created by 宋小雄 on 2017/3/31.
 * 日志过滤器
 */

public interface LogFileFilter {
    boolean accept(@LogLevel.LogLevelType int level, String tag, String logContent);
}