package kotlin.collections;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a'\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001b\u0010\n\u001a'\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001d\u0010\u0010\u001a'\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001e\u0010\u0015\u001a'\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001f\u0010\u001a"}, d2 = {"Lkotlin/UByteArray;", "p0", "", "p1", "p2", "partition-4UcCI2c", "([BII)I", "partition", "", "quickSort-4UcCI2c", "([BII)V", "quickSort", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort-Aa5vz7o", "([SII)V", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "quickSort-oBK06Vg", "([III)V", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "quickSort--nroSd4", "([JII)V", "sortArray-4UcCI2c", "sortArray", "sortArray-Aa5vz7o", "sortArray-oBK06Vg", "sortArray--nroSd4"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UArraySortingKt {
    /* JADX INFO: renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m8489partition4UcCI2c(byte[] bArr, int i, int i2) {
        int i3;
        byte bM8105getw2LRezQ = UByteArray.m8105getw2LRezQ(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                byte bM8105getw2LRezQ2 = UByteArray.m8105getw2LRezQ(bArr, i);
                i3 = bM8105getw2LRezQ & UByte.MAX_VALUE;
                if (Intrinsics.compare(bM8105getw2LRezQ2 & UByte.MAX_VALUE, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UByteArray.m8105getw2LRezQ(bArr, i2) & UByte.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte bM8105getw2LRezQ3 = UByteArray.m8105getw2LRezQ(bArr, i);
                UByteArray.m8110setVurrAj0(bArr, i, UByteArray.m8105getw2LRezQ(bArr, i2));
                UByteArray.m8110setVurrAj0(bArr, i2, bM8105getw2LRezQ3);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m8493quickSort4UcCI2c(byte[] bArr, int i, int i2) {
        while (true) {
            int iM8489partition4UcCI2c = m8489partition4UcCI2c(bArr, i, i2);
            int i3 = iM8489partition4UcCI2c - 1;
            if (i < i3) {
                m8493quickSort4UcCI2c(bArr, i, i3);
            }
            if (iM8489partition4UcCI2c >= i2) {
                return;
            } else {
                i = iM8489partition4UcCI2c;
            }
        }
    }

    /* JADX INFO: renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m8490partitionAa5vz7o(short[] sArr, int i, int i2) {
        int i3;
        short sM8368getMh2AYeg = UShortArray.m8368getMh2AYeg(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                short sM8368getMh2AYeg2 = UShortArray.m8368getMh2AYeg(sArr, i);
                i3 = sM8368getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(sM8368getMh2AYeg2 & UShort.MAX_VALUE, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UShortArray.m8368getMh2AYeg(sArr, i2) & UShort.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short sM8368getMh2AYeg3 = UShortArray.m8368getMh2AYeg(sArr, i);
                UShortArray.m8373set01HTLdE(sArr, i, UShortArray.m8368getMh2AYeg(sArr, i2));
                UShortArray.m8373set01HTLdE(sArr, i2, sM8368getMh2AYeg3);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m8494quickSortAa5vz7o(short[] sArr, int i, int i2) {
        while (true) {
            int iM8490partitionAa5vz7o = m8490partitionAa5vz7o(sArr, i, i2);
            int i3 = iM8490partitionAa5vz7o - 1;
            if (i < i3) {
                m8494quickSortAa5vz7o(sArr, i, i3);
            }
            if (iM8490partitionAa5vz7o >= i2) {
                return;
            } else {
                i = iM8490partitionAa5vz7o;
            }
        }
    }

    /* JADX INFO: renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m8491partitionoBK06Vg(int[] iArr, int i, int i2) {
        int iM8184getpVg5ArA = UIntArray.m8184getpVg5ArA(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (Integer.compare(UIntArray.m8184getpVg5ArA(iArr, i) ^ Integer.MIN_VALUE, iM8184getpVg5ArA ^ Integer.MIN_VALUE) < 0) {
                i++;
            }
            while (Integer.compare(UIntArray.m8184getpVg5ArA(iArr, i2) ^ Integer.MIN_VALUE, iM8184getpVg5ArA ^ Integer.MIN_VALUE) > 0) {
                i2--;
            }
            if (i <= i2) {
                int iM8184getpVg5ArA2 = UIntArray.m8184getpVg5ArA(iArr, i);
                UIntArray.m8189setVXSXFK8(iArr, i, UIntArray.m8184getpVg5ArA(iArr, i2));
                UIntArray.m8189setVXSXFK8(iArr, i2, iM8184getpVg5ArA2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m8495quickSortoBK06Vg(int[] iArr, int i, int i2) {
        while (true) {
            int iM8491partitionoBK06Vg = m8491partitionoBK06Vg(iArr, i, i2);
            int i3 = iM8491partitionoBK06Vg - 1;
            if (i < i3) {
                m8495quickSortoBK06Vg(iArr, i, i3);
            }
            if (iM8491partitionoBK06Vg >= i2) {
                return;
            } else {
                i = iM8491partitionoBK06Vg;
            }
        }
    }

    /* JADX INFO: renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m8488partitionnroSd4(long[] jArr, int i, int i2) {
        long jM8263getsVKNKU = ULongArray.m8263getsVKNKU(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (Long.compare(ULongArray.m8263getsVKNKU(jArr, i) ^ Long.MIN_VALUE, jM8263getsVKNKU ^ Long.MIN_VALUE) < 0) {
                i++;
            }
            while (Long.compare(ULongArray.m8263getsVKNKU(jArr, i2) ^ Long.MIN_VALUE, jM8263getsVKNKU ^ Long.MIN_VALUE) > 0) {
                i2--;
            }
            if (i <= i2) {
                long jM8263getsVKNKU2 = ULongArray.m8263getsVKNKU(jArr, i);
                ULongArray.m8268setk8EXiF4(jArr, i, ULongArray.m8263getsVKNKU(jArr, i2));
                ULongArray.m8268setk8EXiF4(jArr, i2, jM8263getsVKNKU2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m8492quickSortnroSd4(long[] jArr, int i, int i2) {
        while (true) {
            int iM8488partitionnroSd4 = m8488partitionnroSd4(jArr, i, i2);
            int i3 = iM8488partitionnroSd4 - 1;
            if (i < i3) {
                m8492quickSortnroSd4(jArr, i, i3);
            }
            if (iM8488partitionnroSd4 >= i2) {
                return;
            } else {
                i = iM8488partitionnroSd4;
            }
        }
    }

    /* JADX INFO: renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m8497sortArray4UcCI2c(byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        m8493quickSort4UcCI2c(bArr, i, i2 - 1);
    }

    /* JADX INFO: renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m8498sortArrayAa5vz7o(short[] sArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "");
        m8494quickSortAa5vz7o(sArr, i, i2 - 1);
    }

    /* JADX INFO: renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m8499sortArrayoBK06Vg(int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        m8495quickSortoBK06Vg(iArr, i, i2 - 1);
    }

    /* JADX INFO: renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m8496sortArraynroSd4(long[] jArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        m8492quickSortnroSd4(jArr, i, i2 - 1);
    }
}
