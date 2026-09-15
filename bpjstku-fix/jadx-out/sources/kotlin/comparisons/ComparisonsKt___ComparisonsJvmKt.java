package kotlin.comparisons;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0010\u000f\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0017\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0002\u001a/\u0010\u0004\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a \u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0007\u001a \u0010\u0004\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0087\b¢\u0006\u0004\b\u0004\u0010\t\u001a \u0010\u0004\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0087\b¢\u0006\u0004\b\u0004\u0010\u000b\u001a \u0010\u0004\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0087\b¢\u0006\u0004\b\u0004\u0010\r\u001a \u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b\u0004\u0010\u000f\u001a \u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0011\u001a7\u0010\u0004\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0013\u001a(\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0014\u001a(\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0087\b¢\u0006\u0004\b\u0004\u0010\u0015\u001a(\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0087\b¢\u0006\u0004\b\u0004\u0010\u0016\u001a(\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0087\b¢\u0006\u0004\b\u0004\u0010\u0017\u001a(\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b\u0004\u0010\u0018\u001a(\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0019\u001a;\u0010\u0004\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001a\"\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u001b\u001a#\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\n\u0010\u0003\u001a\u00020\u001c\"\u00020\u0006H\u0007¢\u0006\u0004\b\u0004\u0010\u001d\u001a#\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\n\u0010\u0003\u001a\u00020\u001e\"\u00020\bH\u0007¢\u0006\u0004\b\u0004\u0010\u001f\u001a#\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\n\u0010\u0003\u001a\u00020 \"\u00020\nH\u0007¢\u0006\u0004\b\u0004\u0010!\u001a#\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\n\u0010\u0003\u001a\u00020\"\"\u00020\fH\u0007¢\u0006\u0004\b\u0004\u0010#\u001a#\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00020$\"\u00020\u000eH\u0007¢\u0006\u0004\b\u0004\u0010%\u001a#\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00102\n\u0010\u0003\u001a\u00020&\"\u00020\u0010H\u0007¢\u0006\u0004\b\u0004\u0010'\u001a/\u0010(\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0007¢\u0006\u0004\b(\u0010\u0005\u001a \u0010(\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b(\u0010\u0007\u001a \u0010(\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0087\b¢\u0006\u0004\b(\u0010\t\u001a \u0010(\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0087\b¢\u0006\u0004\b(\u0010\u000b\u001a \u0010(\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0087\b¢\u0006\u0004\b(\u0010\r\u001a \u0010(\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b(\u0010\u000f\u001a \u0010(\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b(\u0010\u0011\u001a7\u0010(\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0007¢\u0006\u0004\b(\u0010\u0013\u001a(\u0010(\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b(\u0010\u0014\u001a(\u0010(\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0087\b¢\u0006\u0004\b(\u0010\u0015\u001a(\u0010(\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0087\b¢\u0006\u0004\b(\u0010\u0016\u001a(\u0010(\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0087\b¢\u0006\u0004\b(\u0010\u0017\u001a(\u0010(\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b(\u0010\u0018\u001a(\u0010(\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b(\u0010\u0019\u001a;\u0010(\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001a\"\u00028\u0000H\u0007¢\u0006\u0004\b(\u0010\u001b\u001a#\u0010(\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\n\u0010\u0003\u001a\u00020\u001c\"\u00020\u0006H\u0007¢\u0006\u0004\b(\u0010\u001d\u001a#\u0010(\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\n\u0010\u0003\u001a\u00020\u001e\"\u00020\bH\u0007¢\u0006\u0004\b(\u0010\u001f\u001a#\u0010(\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\n\u0010\u0003\u001a\u00020 \"\u00020\nH\u0007¢\u0006\u0004\b(\u0010!\u001a#\u0010(\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\n\u0010\u0003\u001a\u00020\"\"\u00020\fH\u0007¢\u0006\u0004\b(\u0010#\u001a#\u0010(\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00020$\"\u00020\u000eH\u0007¢\u0006\u0004\b(\u0010%\u001a#\u0010(\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00102\n\u0010\u0003\u001a\u00020&\"\u00020\u0010H\u0007¢\u0006\u0004\b(\u0010'"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "p0", "p1", "maxOf", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "(BB)B", "", "(SS)S", "", "(II)I", "", "(JJ)J", "", "(FF)F", "", "(DD)D", "p2", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "(BBB)B", "(SSS)S", "(III)I", "(JJJ)J", "(FFF)F", "(DDD)D", "", "(Ljava/lang/Comparable;[Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "(B[B)B", "", "(S[S)S", "", "(I[I)I", "", "(J[J)J", "", "(F[F)F", "", "(D[D)D", "minOf"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
public class ComparisonsKt___ComparisonsJvmKt extends ComparisonsKt__ComparisonsKt {
    public static final <T extends Comparable<? super T>> T maxOf(T t, T t2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(t2, "");
        return t.compareTo(t2) >= 0 ? t : t2;
    }

    private static final byte maxOf(byte b, byte b2) {
        return (byte) Math.max((int) b, (int) b2);
    }

    private static final short maxOf(short s, short s2) {
        return (short) Math.max((int) s, (int) s2);
    }

    private static final int maxOf(int i, int i2) {
        return Math.max(i, i2);
    }

    private static final long maxOf(long j, long j2) {
        return Math.max(j, j2);
    }

    private static final float maxOf(float f, float f2) {
        return Math.max(f, f2);
    }

    private static final double maxOf(double d, double d2) {
        return Math.max(d, d2);
    }

    public static final <T extends Comparable<? super T>> T maxOf(T t, T t2, T t3) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(t2, "");
        Intrinsics.checkNotNullParameter(t3, "");
        return (T) ComparisonsKt.maxOf(t, ComparisonsKt.maxOf(t2, t3));
    }

    private static final byte maxOf(byte b, byte b2, byte b3) {
        return (byte) Math.max((int) b, Math.max((int) b2, (int) b3));
    }

    private static final short maxOf(short s, short s2, short s3) {
        return (short) Math.max((int) s, Math.max((int) s2, (int) s3));
    }

    private static final int maxOf(int i, int i2, int i3) {
        return Math.max(i, Math.max(i2, i3));
    }

    private static final long maxOf(long j, long j2, long j3) {
        return Math.max(j, Math.max(j2, j3));
    }

    private static final float maxOf(float f, float f2, float f3) {
        return Math.max(f, Math.max(f2, f3));
    }

    private static final double maxOf(double d, double d2, double d3) {
        return Math.max(d, Math.max(d2, d3));
    }

    public static final <T extends Comparable<? super T>> T maxOf(T t, T... tArr) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(tArr, "");
        for (T t2 : tArr) {
            t = (T) ComparisonsKt.maxOf(t, t2);
        }
        return t;
    }

    public static final byte maxOf(byte b, byte... bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        for (byte b2 : bArr) {
            b = (byte) Math.max((int) b, (int) b2);
        }
        return b;
    }

    public static final short maxOf(short s, short... sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        for (short s2 : sArr) {
            s = (short) Math.max((int) s, (int) s2);
        }
        return s;
    }

    public static final int maxOf(int i, int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    public static final long maxOf(long j, long... jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        for (long j2 : jArr) {
            j = Math.max(j, j2);
        }
        return j;
    }

    public static final float maxOf(float f, float... fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        for (float f2 : fArr) {
            f = Math.max(f, f2);
        }
        return f;
    }

    public static final double maxOf(double d, double... dArr) {
        Intrinsics.checkNotNullParameter(dArr, "");
        for (double d2 : dArr) {
            d = Math.max(d, d2);
        }
        return d;
    }

    public static final <T extends Comparable<? super T>> T minOf(T t, T t2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(t2, "");
        return t.compareTo(t2) <= 0 ? t : t2;
    }

    private static final byte minOf(byte b, byte b2) {
        return (byte) Math.min((int) b, (int) b2);
    }

    private static final short minOf(short s, short s2) {
        return (short) Math.min((int) s, (int) s2);
    }

    private static final int minOf(int i, int i2) {
        return Math.min(i, i2);
    }

    private static final long minOf(long j, long j2) {
        return Math.min(j, j2);
    }

    private static final float minOf(float f, float f2) {
        return Math.min(f, f2);
    }

    private static final double minOf(double d, double d2) {
        return Math.min(d, d2);
    }

    public static final <T extends Comparable<? super T>> T minOf(T t, T t2, T t3) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(t2, "");
        Intrinsics.checkNotNullParameter(t3, "");
        return (T) ComparisonsKt.minOf(t, ComparisonsKt.minOf(t2, t3));
    }

    private static final byte minOf(byte b, byte b2, byte b3) {
        return (byte) Math.min((int) b, Math.min((int) b2, (int) b3));
    }

    private static final short minOf(short s, short s2, short s3) {
        return (short) Math.min((int) s, Math.min((int) s2, (int) s3));
    }

    private static final int minOf(int i, int i2, int i3) {
        return Math.min(i, Math.min(i2, i3));
    }

    private static final long minOf(long j, long j2, long j3) {
        return Math.min(j, Math.min(j2, j3));
    }

    private static final float minOf(float f, float f2, float f3) {
        return Math.min(f, Math.min(f2, f3));
    }

    private static final double minOf(double d, double d2, double d3) {
        return Math.min(d, Math.min(d2, d3));
    }

    public static final <T extends Comparable<? super T>> T minOf(T t, T... tArr) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(tArr, "");
        for (T t2 : tArr) {
            t = (T) ComparisonsKt.minOf(t, t2);
        }
        return t;
    }

    public static final byte minOf(byte b, byte... bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        for (byte b2 : bArr) {
            b = (byte) Math.min((int) b, (int) b2);
        }
        return b;
    }

    public static final short minOf(short s, short... sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        for (short s2 : sArr) {
            s = (short) Math.min((int) s, (int) s2);
        }
        return s;
    }

    public static final int minOf(int i, int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        for (int i2 : iArr) {
            i = Math.min(i, i2);
        }
        return i;
    }

    public static final long minOf(long j, long... jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        for (long j2 : jArr) {
            j = Math.min(j, j2);
        }
        return j;
    }

    public static final float minOf(float f, float... fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        for (float f2 : fArr) {
            f = Math.min(f, f2);
        }
        return f;
    }

    public static final double minOf(double d, double... dArr) {
        Intrinsics.checkNotNullParameter(dArr, "");
        for (double d2 : dArr) {
            d = Math.min(d, d2);
        }
        return d;
    }
}
