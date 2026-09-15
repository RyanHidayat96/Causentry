package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public enum zzazv {
    DOUBLE(0, 1, zzbas.DOUBLE),
    FLOAT(1, 1, zzbas.FLOAT),
    INT64(2, 1, zzbas.LONG),
    UINT64(3, 1, zzbas.LONG),
    INT32(4, 1, zzbas.INT),
    FIXED64(5, 1, zzbas.LONG),
    FIXED32(6, 1, zzbas.INT),
    BOOL(7, 1, zzbas.BOOLEAN),
    STRING(8, 1, zzbas.STRING),
    MESSAGE(9, 1, zzbas.MESSAGE),
    BYTES(10, 1, zzbas.BYTE_STRING),
    UINT32(11, 1, zzbas.INT),
    ENUM(12, 1, zzbas.ENUM),
    SFIXED32(13, 1, zzbas.INT),
    SFIXED64(14, 1, zzbas.LONG),
    SINT32(15, 1, zzbas.INT),
    SINT64(16, 1, zzbas.LONG),
    GROUP(17, 1, zzbas.MESSAGE),
    DOUBLE_LIST(18, 2, zzbas.DOUBLE),
    FLOAT_LIST(19, 2, zzbas.FLOAT),
    INT64_LIST(20, 2, zzbas.LONG),
    UINT64_LIST(21, 2, zzbas.LONG),
    INT32_LIST(22, 2, zzbas.INT),
    FIXED64_LIST(23, 2, zzbas.LONG),
    FIXED32_LIST(24, 2, zzbas.INT),
    BOOL_LIST(25, 2, zzbas.BOOLEAN),
    STRING_LIST(26, 2, zzbas.STRING),
    MESSAGE_LIST(27, 2, zzbas.MESSAGE),
    BYTES_LIST(28, 2, zzbas.BYTE_STRING),
    UINT32_LIST(29, 2, zzbas.INT),
    ENUM_LIST(30, 2, zzbas.ENUM),
    SFIXED32_LIST(31, 2, zzbas.INT),
    SFIXED64_LIST(32, 2, zzbas.LONG),
    SINT32_LIST(33, 2, zzbas.INT),
    SINT64_LIST(34, 2, zzbas.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzbas.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzbas.FLOAT),
    INT64_LIST_PACKED(37, 3, zzbas.LONG),
    UINT64_LIST_PACKED(38, 3, zzbas.LONG),
    INT32_LIST_PACKED(39, 3, zzbas.INT),
    FIXED64_LIST_PACKED(40, 3, zzbas.LONG),
    FIXED32_LIST_PACKED(41, 3, zzbas.INT),
    BOOL_LIST_PACKED(42, 3, zzbas.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzbas.INT),
    ENUM_LIST_PACKED(44, 3, zzbas.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzbas.INT),
    SFIXED64_LIST_PACKED(46, 3, zzbas.LONG),
    SINT32_LIST_PACKED(47, 3, zzbas.INT),
    SINT64_LIST_PACKED(48, 3, zzbas.LONG),
    GROUP_LIST(49, 2, zzbas.MESSAGE),
    MAP(50, 4, zzbas.VOID);

    private static final zzazv[] zzaa;
    private final int zzZ;

    static {
        zzazv[] zzazvVarArrValues = values();
        zzaa = new zzazv[zzazvVarArrValues.length];
        for (zzazv zzazvVar : zzazvVarArrValues) {
            zzaa[zzazvVar.zzZ] = zzazvVar;
        }
    }

    zzazv(int i, int i2, zzbas zzbasVar) {
        this.zzZ = i;
        int i3 = i2 - 1;
        if (i3 == 1) {
            zzbasVar.zza();
        } else if (i3 == 3) {
            zzbasVar.zza();
        }
    }

    public final int zza() {
        return this.zzZ;
    }
}
