package com.iuling.logutils.parser;

import com.iuling.logutils.Parser;
import com.iuling.logutils.utils.ObjectUtil;

import java.lang.ref.Reference;

/**
 * Created by 宋小雄 on 16/3/22.
 */
public class ReferenceParse implements Parser<Reference> {
    @Override
    public Class<Reference> parseClassType() {
        return Reference.class;
    }

    @Override
    public String parseString(Reference reference) {
        Object actual = reference.get();
        StringBuilder builder = new StringBuilder(reference.getClass().getSimpleName() + "<"
                + actual.getClass().getSimpleName() + "> {");
        builder.append("→" + ObjectUtil.objectToString(actual));
        return builder.toString() + "}";
    }
}
