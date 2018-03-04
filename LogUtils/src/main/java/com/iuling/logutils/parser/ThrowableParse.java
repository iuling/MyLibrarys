package com.iuling.logutils.parser;

import android.util.Log;

import com.iuling.logutils.Parser;

/**
 * Created by 宋小雄 on 16/3/8.
 */
public class ThrowableParse implements Parser<Throwable> {
    @Override
    public Class<Throwable> parseClassType() {
        return Throwable.class;
    }

    @Override
    public String parseString(Throwable throwable) {
        return Log.getStackTraceString(throwable);
    }
}
