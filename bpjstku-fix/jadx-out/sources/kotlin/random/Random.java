package kotlin.random;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\b'\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000fJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0017J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001c2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010 J\u0017\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u001e\u0010!"}, d2 = {"Lkotlin/random/Random;", "", "<init>", "()V", "", "p0", "nextBits", "(I)I", "nextInt", "()I", "p1", "(II)I", "", "nextLong", "()J", "(J)J", "(JJ)J", "", "nextBoolean", "()Z", "", "nextDouble", "()D", "(D)D", "(DD)D", "", "nextFloat", "()F", "", "p2", "nextBytes", "([BII)[B", "([B)[B", "(I)[B", "Default"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Random {

    /* JADX INFO: renamed from: Default, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Random defaultRandom = PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();

    public abstract int nextBits(int p0);

    public int nextInt() {
        return nextBits(32);
    }

    public int nextInt(int p0) {
        return nextInt(0, p0);
    }

    public int nextInt(int p0, int p1) {
        int iNextInt;
        int i;
        int iNextBits;
        RandomKt.checkRangeBounds(p0, p1);
        int i2 = p1 - p0;
        if (i2 > 0 || i2 == Integer.MIN_VALUE) {
            if (((-i2) & i2) == i2) {
                iNextBits = nextBits(RandomKt.fastLog2(i2));
            } else {
                do {
                    iNextInt = nextInt() >>> 1;
                    i = iNextInt % i2;
                } while ((iNextInt - i) + (i2 - 1) < 0);
                iNextBits = i;
            }
            return p0 + iNextBits;
        }
        while (true) {
            int iNextInt2 = nextInt();
            if (p0 <= iNextInt2 && iNextInt2 < p1) {
                return iNextInt2;
            }
        }
    }

    public long nextLong() {
        return (((long) nextInt()) << 32) + ((long) nextInt());
    }

    public long nextLong(long p0) {
        return nextLong(0L, p0);
    }

    public long nextLong(long p0, long p1) {
        long jNextLong;
        long j;
        long jNextBits;
        int iNextInt;
        RandomKt.checkRangeBounds(p0, p1);
        long j2 = p1 - p0;
        if (j2 > 0) {
            if (((-j2) & j2) == j2) {
                int i = (int) j2;
                int i2 = (int) (j2 >>> 32);
                if (i != 0) {
                    iNextInt = nextBits(RandomKt.fastLog2(i));
                } else if (i2 == 1) {
                    iNextInt = nextInt();
                } else {
                    jNextBits = (((long) nextBits(RandomKt.fastLog2(i2))) << 32) + (((long) nextInt()) & 4294967295L);
                }
                jNextBits = ((long) iNextInt) & 4294967295L;
            } else {
                do {
                    jNextLong = nextLong() >>> 1;
                    j = jNextLong % j2;
                } while ((jNextLong - j) + (j2 - 1) < 0);
                jNextBits = j;
            }
            return p0 + jNextBits;
        }
        while (true) {
            long jNextLong2 = nextLong();
            if (p0 <= jNextLong2 && jNextLong2 < p1) {
                return jNextLong2;
            }
        }
    }

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    public double nextDouble() {
        return PlatformRandomKt.doubleFromParts(nextBits(26), nextBits(27));
    }

    /* JADX INFO: renamed from: kotlin.random.Random$Default, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001)B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0014J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\n\u001a\u00020!H\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\"\u0010$J'\u0010\"\u001a\u00020!2\u0006\u0010\n\u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0017¢\u0006\u0004\b\"\u0010&R\u0014\u0010'\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010("}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "<init>", "()V", "", "writeReplace", "()Ljava/lang/Object;", "", "p0", "nextBits", "(I)I", "nextInt", "()I", "p1", "(II)I", "", "nextLong", "()J", "(J)J", "(JJ)J", "", "nextBoolean", "()Z", "", "nextDouble", "()D", "(D)D", "(DD)D", "", "nextFloat", "()F", "", "nextBytes", "([B)[B", "(I)[B", "p2", "([BII)[B", "defaultRandom", "Lkotlin/random/Random;", "Serialized"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion extends Random implements Serializable {
        private static final byte[] $$c = {106, -66, 28, 119};
        private static final int $$f = ModuleDescriptor.MODULE_VERSION;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {Base64.padSymbol, -108, 49, -100, 41, 26, 15, 12, 8, -2, -12, 44, -18, 30, 25, 8, 10, 10, 16, -3, -9, 47, -1, 20, 4, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
        private static final int $$e = 225;
        private static final byte[] $$a = {17, 104, 102, -28, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
        private static final int $$b = 128;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int g = 1;
        private static char[] b = {47477, 47464, 47474, 47460, 47463, 47469, 47400, 47459, 47427, 47517, 47458, 47473, 47465, 47443, 47466, 47475, 47467, 47462, 47428, 47468, 47456, 47471, 47438, 47470};
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2047719702;
        private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        private static boolean TuitionPaymentFragmentbindingInflater1 = true;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r7, byte r8, short r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = kotlin.random.Random.Companion.$$a
                int r7 = r7 * 10
                int r7 = 13 - r7
                int r9 = r9 * 3
                int r9 = r9 + 97
                int r8 = r8 + 1
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r7
                r5 = r2
                goto L2e
            L14:
                r3 = r2
                r6 = r9
                r9 = r7
                r7 = r6
            L18:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r8) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                int r9 = r9 + 1
                r3 = r0[r9]
                r6 = r3
                r3 = r9
                r9 = r6
            L2e:
                int r9 = -r9
                int r7 = r7 + r9
                int r7 = r7 + (-5)
                r9 = r3
                r3 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.random.Random.Companion.a(byte, byte, short, java.lang.Object[]):void");
        }

        private static void d(int i, short s, byte b2, Object[] objArr) {
            int i2 = i * 31;
            int i3 = b2 + 4;
            byte[] bArr = $$d;
            int i4 = (s * 17) + 67;
            byte[] bArr2 = new byte[i2 + 22];
            int i5 = i2 + 21;
            int i6 = -1;
            if (bArr == null) {
                i4 = (i4 + i5) - 11;
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i4;
                if (i6 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i3++;
                    i4 = (i4 + bArr[i3]) - 11;
                }
            }
        }

        private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
            char[] cArr2 = b;
            int i3 = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    int i5 = $10 + 27;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i3] = Integer.valueOf(cArr2[i4]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) i3;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Drawable.resolveOpacity(i3, i3) + 31339), 2994 - TextUtils.getCapsMode("", i3, i3), TextUtils.getOffsetAfter("", i3) + 17, 1182129903, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i4++;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.getMode(0) + 43325), 252 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            int i7 = 33602;
            int i8 = 1687675375;
            if (TuitionPaymentFragmentbindingInflater1) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + i7), 3086 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 26 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    i7 = 33602;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            int i9 = 0;
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.resolveSize(0, 0) + 33602), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3084, 26 - TextUtils.getOffsetAfter("", 0), -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    i8 = 1687675375;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            while (true) {
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9;
                while (true) {
                    if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        objArr[0] = new String(cArr6);
                        return;
                    }
                    int i10 = $11 + 27;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 * getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] + iIntValue);
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 %= 0;
                    }
                }
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                i9 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            }
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: kotlin.random.Random$Default$Serialized */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "<init>", "()V", "", "readResolve", "()Ljava/lang/Object;", "", "serialVersionUID", "J"}, k = 1, mv = {2, 1, 0}, xi = 48)
        static final class Serialized implements Serializable {
            public static final Serialized INSTANCE = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.INSTANCE;
            }
        }

        private final Object writeReplace() {
            Serialized serialized;
            int i = 2 % 2;
            int i2 = g + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                serialized = Serialized.INSTANCE;
                int i3 = 72 / 0;
            } else {
                serialized = Serialized.INSTANCE;
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
            g = i4 % 128;
            if (i4 % 2 != 0) {
                return serialized;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.random.Random
        public final int nextBits(int p0) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
            g = i2 % 128;
            int i3 = i2 % 2;
            Random random = Random.defaultRandom;
            if (i3 != 0) {
                return random.nextBits(p0);
            }
            random.nextBits(p0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.random.Random
        public final int nextInt() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
            g = i2 % 128;
            int i3 = i2 % 2;
            int iNextInt = Random.defaultRandom.nextInt();
            if (i3 == 0) {
                int i4 = 62 / 0;
            }
            return iNextInt;
        }

        @Override // kotlin.random.Random
        public final int nextInt(int p0) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                int iNextInt = Random.defaultRandom.nextInt(p0);
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
                g = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 20 / 0;
                }
                return iNextInt;
            }
            Random.defaultRandom.nextInt(p0);
            throw null;
        }

        @Override // kotlin.random.Random
        public final int nextInt(int p0, int p1) {
            int iNextInt;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                iNextInt = Random.defaultRandom.nextInt(p0, p1);
                int i3 = 17 / 0;
            } else {
                iNextInt = Random.defaultRandom.nextInt(p0, p1);
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 77 / 0;
            }
            return iNextInt;
        }

        @Override // kotlin.random.Random
        public final long nextLong() {
            int i = 2 % 2;
            int i2 = g + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            long jNextLong = Random.defaultRandom.nextLong();
            int i4 = g + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            return jNextLong;
        }

        @Override // kotlin.random.Random
        public final long nextLong(long p0) {
            int i = 2 % 2;
            int i2 = g + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            long jNextLong = Random.defaultRandom.nextLong(p0);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
            g = i4 % 128;
            int i5 = i4 % 2;
            return jNextLong;
        }

        @Override // kotlin.random.Random
        public final long nextLong(long p0, long p1) {
            int i = 2 % 2;
            int i2 = g + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            long jNextLong = Random.defaultRandom.nextLong(p0, p1);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
            g = i4 % 128;
            int i5 = i4 % 2;
            return jNextLong;
        }

        @Override // kotlin.random.Random
        public final boolean nextBoolean() {
            int i = 2 % 2;
            int i2 = g + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            Random random = Random.defaultRandom;
            if (i3 == 0) {
                return random.nextBoolean();
            }
            random.nextBoolean();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.random.Random
        public final double nextDouble() {
            int i = 2 % 2;
            int i2 = g + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            double dNextDouble = Random.defaultRandom.nextDouble();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
            g = i4 % 128;
            if (i4 % 2 != 0) {
                return dNextDouble;
            }
            throw null;
        }

        @Override // kotlin.random.Random
        public final double nextDouble(double p0) {
            int i = 2 % 2;
            int i2 = g + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            double dNextDouble = Random.defaultRandom.nextDouble(p0);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
            g = i4 % 128;
            int i5 = i4 % 2;
            return dNextDouble;
        }

        @Override // kotlin.random.Random
        public final double nextDouble(double p0, double p1) {
            int i = 2 % 2;
            int i2 = g + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            double dNextDouble = Random.defaultRandom.nextDouble(p0, p1);
            int i4 = g + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 == 0) {
                return dNextDouble;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.random.Random
        public final float nextFloat() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                float fNextFloat = Random.defaultRandom.nextFloat();
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
                g = i3 % 128;
                if (i3 % 2 != 0) {
                    return fNextFloat;
                }
                throw null;
            }
            Random.defaultRandom.nextFloat();
            throw null;
        }

        @Override // kotlin.random.Random
        public final byte[] nextBytes(byte[] p0) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
            g = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 876;
                int iIndexOf = 10 - TextUtils.indexOf("", "");
                byte[] bArr = $$a;
                byte b2 = bArr[11];
                Object[] objArr2 = new Object[1];
                a((byte) (b2 + 1), bArr[8], b2, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, jumpTapTimeout, iIndexOf, -1199417970, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(null, null, 127 - (Process.myTid() >> 22), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(null, null, 127 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char mode = (char) View.MeasureSpec.getMode(0);
                int trimmedLength = TextUtils.getTrimmedLength("") + 876;
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10;
                byte b3 = $$a[11];
                byte b4 = b3;
                Object[] objArr5 = new Object[1];
                a(b3, b4, (byte) (b4 + 1), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode, trimmedLength, maximumFlingVelocity, 254769921, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
                g = i4 % 128;
                int i5 = i4 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int i6 = 876 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int scrollDefaultDelay = 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[11];
                    byte b6 = b5;
                    Object[] objArr6 = new Object[1];
                    a(b5, bArr2[10], b6, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i6, scrollDefaultDelay, 1324201839, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i7 = (((1824347240 + (((~(iIdentityHashCode | 625696601)) | 585386372) * (-668))) + ((625696601 | (~(585386372 | iIdentityHashCode))) * 1336)) + ((iIdentityHashCode | 669999069) * 668)) - 795082690;
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(null, null, 127 - ExpandableListView.getPackedPositionGroup(0L), new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(null, null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr9);
                try {
                    Object[] objArr10 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), -795082690};
                    byte[] bArr3 = $$d;
                    byte b7 = bArr3[28];
                    Object[] objArr11 = new Object[1];
                    d(b7, b7, bArr3[22], objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    byte b8 = (byte) (-bArr3[22]);
                    Object[] objArr12 = new Object[1];
                    d(b8, b8, bArr3[23], objArr12);
                    Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int i10 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                        int iBlue = Color.blue(0) + 10;
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[11];
                        byte b10 = b9;
                        Object[] objArr14 = new Object[1];
                        a(b9, bArr4[10], b10, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(edgeSlop, i10, iBlue, 1324201839, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        c(null, null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        c(null, null, TextUtils.indexOf("", "", 0) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int i11 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 875;
                            int pressedStateDuration = 10 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            byte b11 = $$a[11];
                            byte b12 = b11;
                            Object[] objArr17 = new Object[1];
                            a(b11, b12, (byte) (b12 + 1), objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity, i11, pressedStateDuration, 254769921, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int mode2 = View.MeasureSpec.getMode(0) + 876;
                            int i12 = 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            byte[] bArr5 = $$a;
                            byte b13 = bArr5[11];
                            Object[] objArr18 = new Object[1];
                            a((byte) (b13 + 1), bArr5[8], b13, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, mode2, i12, -1199417970, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr13;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i13 = ((int[]) objArr[2])[0];
            int i14 = ((int[]) objArr[0])[0];
            if (i14 != i13) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[3];
                if (strArr != null) {
                    int i15 = g + 73;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                    int i16 = i15 % 2;
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                throw new RuntimeException(String.valueOf(i14));
            }
            int i17 = ((int[]) objArr[1])[0];
            Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i18 = i17 + (((1618414996 + (((~((-73924619) | iUptimeMillis)) | (~((-33614390) | iUptimeMillis))) * 69)) + (((~(iUptimeMillis | (-302509942))) | ((~((-342820171) | iUptimeMillis)) | 268895552)) * (-69))) - 204180864);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr19[1])[0] = i20 ^ (i20 << 5);
            int i21 = g + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i21 % 128;
            int i22 = i21 % 2;
            return Random.defaultRandom.nextBytes(p0);
        }

        @Override // kotlin.random.Random
        public final byte[] nextBytes(int p0) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
            g = i2 % 128;
            int i3 = i2 % 2;
            byte[] bArrNextBytes = Random.defaultRandom.nextBytes(p0);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
            g = i4 % 128;
            int i5 = i4 % 2;
            return bArrNextBytes;
        }

        @Override // kotlin.random.Random
        public final byte[] nextBytes(byte[] p0, int p1, int p2) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(p0, "");
                return Random.defaultRandom.nextBytes(p0, p1, p2);
            }
            Intrinsics.checkNotNullParameter(p0, "");
            Random.defaultRandom.nextBytes(p0, p1, p2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r6, int r7, int r8) {
            /*
                int r6 = r6 * 4
                int r6 = 1 - r6
                int r8 = r8 + 67
                byte[] r0 = kotlin.random.Random.Companion.$$c
                int r7 = r7 * 2
                int r7 = r7 + 4
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r6
                r8 = r7
                r4 = r2
                goto L25
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r6) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L23:
                r3 = r0[r7]
            L25:
                int r7 = r7 + 1
                int r8 = r8 + r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.random.Random.Companion.$$g(byte, int, int):java.lang.String");
        }
    }

    public double nextDouble(double p0) {
        return nextDouble(0.0d, p0);
    }

    public double nextDouble(double p0, double p1) {
        double dNextDouble;
        RandomKt.checkRangeBounds(p0, p1);
        double d = p1 - p0;
        if (Double.isInfinite(d) && Math.abs(p0) <= Double.MAX_VALUE && Math.abs(p1) <= Double.MAX_VALUE) {
            double dNextDouble2 = nextDouble() * ((p1 / 2.0d) - (p0 / 2.0d));
            dNextDouble = p0 + dNextDouble2 + dNextDouble2;
        } else {
            dNextDouble = p0 + (nextDouble() * d);
        }
        return dNextDouble >= p1 ? Math.nextAfter(p1, Double.NEGATIVE_INFINITY) : dNextDouble;
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public static /* synthetic */ byte[] nextBytes$default(Random random, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return random.nextBytes(bArr, i, i2);
    }

    public byte[] nextBytes(byte[] p0, int p1, int p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 < 0 || p1 > p0.length || p2 < 0 || p2 > p0.length) {
            StringBuilder sb = new StringBuilder("fromIndex (");
            sb.append(p1);
            sb.append(") or toIndex (");
            sb.append(p2);
            sb.append(") are out of range: 0..");
            sb.append(p0.length);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (p1 > p2) {
            StringBuilder sb2 = new StringBuilder("fromIndex (");
            sb2.append(p1);
            sb2.append(") must be not greater than toIndex (");
            sb2.append(p2);
            sb2.append(").");
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        int i = (p2 - p1) / 4;
        for (int i2 = 0; i2 < i; i2++) {
            int iNextInt = nextInt();
            p0[p1] = (byte) iNextInt;
            p0[p1 + 1] = (byte) (iNextInt >>> 8);
            p0[p1 + 2] = (byte) (iNextInt >>> 16);
            p0[p1 + 3] = (byte) (iNextInt >>> 24);
            p1 += 4;
        }
        int i3 = p2 - p1;
        int iNextBits = nextBits(i3 * 8);
        for (int i4 = 0; i4 < i3; i4++) {
            p0[p1 + i4] = (byte) (iNextBits >>> (i4 * 8));
        }
        return p0;
    }

    public byte[] nextBytes(byte[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return nextBytes(p0, 0, p0.length);
    }

    public byte[] nextBytes(int p0) {
        return nextBytes(new byte[p0]);
    }
}
