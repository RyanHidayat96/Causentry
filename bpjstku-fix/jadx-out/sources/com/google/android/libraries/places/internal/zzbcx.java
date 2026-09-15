package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public enum zzbcx {
    DOUBLE(zzbcy.DOUBLE, 1),
    FLOAT(zzbcy.FLOAT, 5),
    INT64(zzbcy.LONG, 0),
    UINT64(zzbcy.LONG, 0),
    INT32(zzbcy.INT, 0),
    FIXED64(zzbcy.LONG, 1),
    FIXED32(zzbcy.INT, 5),
    BOOL(zzbcy.BOOLEAN, 0),
    STRING(zzbcy.STRING, 2),
    GROUP(zzbcy.MESSAGE, 3),
    MESSAGE(zzbcy.MESSAGE, 2),
    BYTES(zzbcy.BYTE_STRING, 2),
    UINT32(zzbcy.INT, 0),
    ENUM(zzbcy.ENUM, 0),
    SFIXED32(zzbcy.INT, 5),
    SFIXED64(zzbcy.LONG, 1),
    SINT32(zzbcy.INT, 0),
    SINT64(zzbcy.LONG, 0);

    private final zzbcy zzs;

    zzbcx(zzbcy zzbcyVar, int i) {
        this.zzs = zzbcyVar;
    }

    public final zzbcy zza() {
        return this.zzs;
    }
}
