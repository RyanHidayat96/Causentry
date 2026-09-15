package kotlin.text;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a2\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u001e\u0010\f\u001a\u00020\u0000*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\f\u0010\r\u001a\u001e\u0010\u0006\u001a\u00020\u0003*\u00020\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001e\u0010\u0011\u001a\u00020\u000e*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001e\u0010\u0006\u001a\u00020\u0003*\u00020\u00132\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001e\u0010\u0016\u001a\u00020\u0013*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u0006\u001a\u00020\u0003*\u00020\u00182\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001e\u0010\u001b\u001a\u00020\u0018*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u0006\u001a\u00020\u0003*\u00020\u001d2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001e\u0010 \u001a\u00020\u001d*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b \u0010!"}, d2 = {"Lkotlin/UByteArray;", "Lkotlin/text/HexFormat;", "p0", "", "toHexString-zHuV2wU", "([BLkotlin/text/HexFormat;)Ljava/lang/String;", "toHexString", "", "p1", "p2", "toHexString-lZCiFrA", "([BIILkotlin/text/HexFormat;)Ljava/lang/String;", "hexToUByteArray", "(Ljava/lang/String;Lkotlin/text/HexFormat;)[B", "Lkotlin/UByte;", "toHexString-ZQbaR00", "(BLkotlin/text/HexFormat;)Ljava/lang/String;", "hexToUByte", "(Ljava/lang/String;Lkotlin/text/HexFormat;)B", "Lkotlin/UShort;", "toHexString-r3ox_E0", "(SLkotlin/text/HexFormat;)Ljava/lang/String;", "hexToUShort", "(Ljava/lang/String;Lkotlin/text/HexFormat;)S", "Lkotlin/UInt;", "toHexString-8M7LxHw", "(ILkotlin/text/HexFormat;)Ljava/lang/String;", "hexToUInt", "(Ljava/lang/String;Lkotlin/text/HexFormat;)I", "Lkotlin/ULong;", "toHexString-8UJCm-I", "(JLkotlin/text/HexFormat;)Ljava/lang/String;", "hexToULong", "(Ljava/lang/String;Lkotlin/text/HexFormat;)J"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UHexExtensionsKt {
    /* JADX INFO: renamed from: toHexString-zHuV2wU, reason: not valid java name */
    private static final String m9358toHexStringzHuV2wU(byte[] bArr, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return HexExtensionsKt.toHexString(bArr, hexFormat);
    }

    /* JADX INFO: renamed from: toHexString-zHuV2wU$default, reason: not valid java name */
    static /* synthetic */ String m9359toHexStringzHuV2wU$default(byte[] bArr, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return HexExtensionsKt.toHexString(bArr, hexFormat);
    }

    /* JADX INFO: renamed from: toHexString-lZCiFrA$default, reason: not valid java name */
    static /* synthetic */ String m9355toHexStringlZCiFrA$default(byte[] bArr, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = UByteArray.m8106getSizeimpl(bArr);
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return HexExtensionsKt.toHexString(bArr, i, i2, hexFormat);
    }

    /* JADX INFO: renamed from: toHexString-lZCiFrA, reason: not valid java name */
    private static final String m9354toHexStringlZCiFrA(byte[] bArr, int i, int i2, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return HexExtensionsKt.toHexString(bArr, i, i2, hexFormat);
    }

    static /* synthetic */ byte[] hexToUByteArray$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return UByteArray.m8100constructorimpl(HexExtensionsKt.hexToByteArray(str, hexFormat));
    }

    private static final byte[] hexToUByteArray(String str, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return UByteArray.m8100constructorimpl(HexExtensionsKt.hexToByteArray(str, hexFormat));
    }

    /* JADX INFO: renamed from: toHexString-ZQbaR00, reason: not valid java name */
    private static final String m9352toHexStringZQbaR00(byte b, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return HexExtensionsKt.toHexString(b, hexFormat);
    }

    /* JADX INFO: renamed from: toHexString-ZQbaR00$default, reason: not valid java name */
    static /* synthetic */ String m9353toHexStringZQbaR00$default(byte b, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return HexExtensionsKt.toHexString(b, hexFormat);
    }

    private static final byte hexToUByte(String str, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return UByte.m8042constructorimpl(HexExtensionsKt.hexToByte(str, hexFormat));
    }

    static /* synthetic */ byte hexToUByte$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return UByte.m8042constructorimpl(HexExtensionsKt.hexToByte(str, hexFormat));
    }

    /* JADX INFO: renamed from: toHexString-r3ox_E0, reason: not valid java name */
    private static final String m9356toHexStringr3ox_E0(short s, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return HexExtensionsKt.toHexString(s, hexFormat);
    }

    /* JADX INFO: renamed from: toHexString-r3ox_E0$default, reason: not valid java name */
    static /* synthetic */ String m9357toHexStringr3ox_E0$default(short s, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return HexExtensionsKt.toHexString(s, hexFormat);
    }

    private static final short hexToUShort(String str, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return UShort.m8310constructorimpl(HexExtensionsKt.hexToShort(str, hexFormat));
    }

    static /* synthetic */ short hexToUShort$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return UShort.m8310constructorimpl(HexExtensionsKt.hexToShort(str, hexFormat));
    }

    /* JADX INFO: renamed from: toHexString-8M7LxHw, reason: not valid java name */
    private static final String m9348toHexString8M7LxHw(int i, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return HexExtensionsKt.toHexString(i, hexFormat);
    }

    /* JADX INFO: renamed from: toHexString-8M7LxHw$default, reason: not valid java name */
    static /* synthetic */ String m9349toHexString8M7LxHw$default(int i, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return HexExtensionsKt.toHexString(i, hexFormat);
    }

    private static final int hexToUInt(String str, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return UInt.m8124constructorimpl(HexExtensionsKt.hexToInt(str, hexFormat));
    }

    static /* synthetic */ int hexToUInt$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return UInt.m8124constructorimpl(HexExtensionsKt.hexToInt(str, hexFormat));
    }

    /* JADX INFO: renamed from: toHexString-8UJCm-I, reason: not valid java name */
    private static final String m9350toHexString8UJCmI(long j, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return HexExtensionsKt.toHexString(j, hexFormat);
    }

    /* JADX INFO: renamed from: toHexString-8UJCm-I$default, reason: not valid java name */
    static /* synthetic */ String m9351toHexString8UJCmI$default(long j, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return HexExtensionsKt.toHexString(j, hexFormat);
    }

    private static final long hexToULong(String str, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return ULong.m8203constructorimpl(HexExtensionsKt.hexToLong(str, hexFormat));
    }

    static /* synthetic */ long hexToULong$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return ULong.m8203constructorimpl(HexExtensionsKt.hexToLong(str, hexFormat));
    }
}
