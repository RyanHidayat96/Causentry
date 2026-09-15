package com.google.zxing;

import defpackage.canMatchEncoding;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public enum DecodeHintType {
    /* JADX INFO: Fake field, exist only in values array */
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(int[].class),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(canMatchEncoding.class),
    ALLOWED_EAN_EXTENSIONS(int[].class);

    public final Class<?> valueType;

    DecodeHintType(Class cls) {
        this.valueType = cls;
    }
}
