package kotlin.jvm.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u0003R\u001a\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\b\u000e\u0010\f\u0012\u0004\b\u000f\u0010\u0003R\u001a\u0010\u0010\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\b\u0010\u0010\f\u0012\u0004\b\u0011\u0010\u0003R\u001a\u0010\u0012\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\b\u0012\u0010\f\u0012\u0004\b\u0013\u0010\u0003R\u001a\u0010\u0014\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\b\u0014\u0010\f\u0012\u0004\b\u0015\u0010\u0003R\u001a\u0010\u0017\u001a\u00020\u00168\u0006X\u0087T¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u0003R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087T¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u0012\u0004\b\u001b\u0010\u0003"}, d2 = {"Lkotlin/jvm/internal/DoubleCompanionObject;", "", "<init>", "()V", "", "getMIN_VALUE", "()D", "getMAX_VALUE", "getPOSITIVE_INFINITY", "getNEGATIVE_INFINITY", "getNaN", "MIN_VALUE", "D", "getMIN_VALUE$annotations", "MAX_VALUE", "getMAX_VALUE$annotations", "POSITIVE_INFINITY", "getPOSITIVE_INFINITY$annotations", "NEGATIVE_INFINITY", "getNEGATIVE_INFINITY$annotations", "NaN", "getNaN$annotations", "", "SIZE_BYTES", "I", "getSIZE_BYTES$annotations", "SIZE_BITS", "getSIZE_BITS$annotations"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DoubleCompanionObject {
    public static final DoubleCompanionObject INSTANCE;
    public static final double MAX_VALUE = Double.MAX_VALUE;
    public static final double MIN_VALUE = Double.MIN_VALUE;
    public static final double NEGATIVE_INFINITY = Double.NEGATIVE_INFINITY;
    public static final double NaN = Double.NaN;
    public static final double POSITIVE_INFINITY = Double.POSITIVE_INFINITY;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {83, -44, 103, 46};
    private static final int $$f = 132;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {115, 98, 19, 9, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -73, 3, 28, -13, 14, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 69};
    private static final int $$e = 50;
    private static final byte[] $$a = {68, 104, -93, -37, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 130;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int g = 1;
    private static int b = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r7 = r7 + 4
            byte[] r0 = kotlin.jvm.internal.DoubleCompanionObject.$$a
            int r9 = r9 + 1
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r3 = r3 + r7
            int r7 = r3 + (-10)
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.DoubleCompanionObject.a(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 15
            int r8 = 99 - r8
            int r6 = r6 * 49
            int r6 = 52 - r6
            byte[] r0 = kotlin.jvm.internal.DoubleCompanionObject.$$d
            int r7 = r7 * 3
            int r7 = r7 + 50
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L30
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + 3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.DoubleCompanionObject.d(int, int, short, java.lang.Object[]):void");
    }

    private DoubleCompanionObject() {
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = 1770390596;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 31;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.resolveSizeAndState(0, 0, 0), 2267 - Color.red(0), 33 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1927765101, false, $$g(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(obj, objArr2)).charValue();
                        i4 = 1770390596;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.MeasureSpec.getSize(0), 2267 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getTapTimeout() >> 16) + 33, -1927765101, false, $$g(b5, b6, (byte) (b6 - 3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5++;
                    i4 = 1770390596;
                    obj = null;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            byte b7 = (byte) 0;
            byte b8 = (byte) (b7 + 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.indexOf("", ""), 2267 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 34, -1927765101, false, $$g(b7, b8, (byte) (b8 - 3)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i7 = $11 + 27;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                i2 = i + 6;
                cArr4[i2] = (char) (cArr[i2] / b2);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i8 = $10 + 17;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i9 = $11 + 73;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b * b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >>> b2);
                    } else {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    }
                } else {
                    Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = (byte) (b9 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (49267 - (ViewConfiguration.getPressedStateDuration() >> 16)), ImageFormat.getBitsPerPixel(0) + 3262, KeyEvent.getDeadChar(0, 0) + 30, -127612708, false, $$g(b9, b10, (byte) (b10 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                        int i10 = $10 + 35;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b11 = (byte) 0;
                            byte b12 = b11;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (22879 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 594 - View.MeasureSpec.getSize(0), 17 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1570859318, false, $$g(b11, b12, b12), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                        int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                    } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                        int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                        int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                    } else {
                        int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                        int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
            }
        }
        for (int i17 = 0; i17 < i; i17++) {
            cArr4[i17] = (char) (cArr4[i17] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public final double getNEGATIVE_INFINITY() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 31533);
            int iMyTid = (Process.myTid() >> 22) + 921;
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 28;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            byte b3 = bArr[80];
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, iMyTid, packedPositionType, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{25, 15, 30, 23, '\b', 22, ' ', 11, 6, Typography.quote, 14, ' ', 30, 0, 5, 24, '#', 22, 22, 7, 1, 28}, (byte) (44 - Drawable.resolveOpacity(0, 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{25, 23, 25, '!', '#', 24, 5, 23, 24, 28, 18, 1, 22, ' ', 13927}, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 104), (ViewConfiguration.getPressedStateDuration() >> 16) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionChild = (char) (31532 - ExpandableListView.getPackedPositionChild(0L));
            int longPressTimeout = 921 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr2[7], bArr2[37], (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild, longPressTimeout, maximumFlingVelocity, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31532);
                int deadChar2 = 921 - KeyEvent.getDeadChar(0, 0);
                int iAlpha = Color.alpha(0) + 28;
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) 51, bArr3[37], (byte) (-bArr3[3]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, deadChar2, iAlpha, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i4 = (-433012797) + (((~((-842921485) | iElapsedRealtime)) | 931158159) * (-366)) + (((~(iElapsedRealtime | (-4040193))) | 92276867) * 366) + 1276287582;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{25, 15, 30, 23, '\b', 22, ' ', 11, 25, '!', ' ', 7, Typography.quote, 2, 2, 18, ' ', 21, 6, 30, 6, 17, 23, 24, 29, '!'}, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 6), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{'\n', 22, 13841, 13841, 25, 17, 2, 30, 13843, 13843, 20, 21, 3, 28, 2, 18, 7, 16}, (byte) (41 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 18, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i7 = g + 31;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                if (i7 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    throw null;
                }
                applicationContext = (!((applicationContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{3, 26, 3, '!', 7, 20, 25, 15, 7, '\t', 27, 25, 0, 6, 28, '#'}, (byte) (122 - TextUtils.indexOf("", "", 0, 0)), 16 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{23, ' ', 25, 17, 2, 18, 6, 30, 21, '!', 0, 18, 22, 11, 5, '#'}, (byte) (16 - Color.blue(0)), AndroidCharacter.getMirror('0') - ' ', objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
            g = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1276287582};
                byte[] bArr4 = $$d;
                byte b4 = bArr4[35];
                byte b5 = (byte) (b4 - 1);
                Object[] objArr13 = new Object[1];
                d(b4, b5, b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr4[35];
                byte b7 = (byte) (b6 - 1);
                byte b8 = b6;
                Object[] objArr14 = new Object[1];
                d(b7, b8, b8, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 31534);
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 921;
                    int iResolveOpacity = 28 - Drawable.resolveOpacity(0, 0);
                    byte[] bArr5 = $$a;
                    Object[] objArr15 = new Object[1];
                    a((byte) 51, bArr5[37], (byte) (-bArr5[3]), objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask, iCombineMeasuredStates, iResolveOpacity, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    c(new char[]{25, 15, 30, 23, '\b', 22, ' ', 11, 6, Typography.quote, 14, ' ', 30, 0, 5, 24, '#', 22, 22, 7, 1, 28}, (byte) (43 - TextUtils.lastIndexOf("", '0', 0, 0)), 22 - TextUtils.indexOf("", "", 0), objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(new char[]{25, 23, 25, '!', '#', 24, 5, 23, 24, 28, 18, 1, 22, ' ', 13927}, (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 104), 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char keyRepeatDelay = (char) (31533 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        int absoluteGravity = 921 - Gravity.getAbsoluteGravity(0, 0);
                        int longPressTimeout2 = 28 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte[] bArr6 = $$a;
                        Object[] objArr18 = new Object[1];
                        a(bArr6[7], bArr6[37], (byte) 52, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatDelay, absoluteGravity, longPressTimeout2, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char jumpTapTimeout = (char) (31533 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0');
                        int i10 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27;
                        byte[] bArr7 = $$a;
                        byte b9 = bArr7[7];
                        byte b10 = bArr7[80];
                        Object[] objArr19 = new Object[1];
                        a(b9, b10, b10, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout, iLastIndexOf, i10, -1048449946, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr == null) {
                throw null;
            }
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i11 = ((int[]) objArr[0])[0];
        Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i12 = i11 + 318022771 + (((~(iIdentityHashCode | 156977611)) | (-1617102033)) * (-668)) + ((156977611 | (~((-1617102033) | iIdentityHashCode))) * 1336) + ((iIdentityHashCode | (-1612710929)) * 668);
        int i13 = (i12 << 13) ^ i12;
        int i14 = i13 ^ (i13 >>> 17);
        Object obj = objArr20[0];
        ((int[]) obj)[0] = i14 ^ (i14 << 5);
        int i15 = ((int[]) obj)[0];
        int i16 = ((i15 * i15) - (~(-(393621198 * i15)))) - 1;
        int i17 = -(i15 * (-597045848));
        int i18 = (i16 & i17) + (i17 | i16);
        int i19 = (i18 & 1956848025) + (1956848025 | i18);
        int i20 = i19 >> 23;
        int i21 = ((((i20 | (-1023)) << 1) - (i20 ^ (-1023))) / 512) + 1;
        int i22 = (i19 ^ i21) + ((i21 & i19) << 1);
        int i23 = i19 >> 25;
        int i24 = ((i23 & (-255)) + (i23 | (-255))) / 128;
        int i25 = -(i22 ^ (((i24 | 1) << 1) - (i24 ^ 1)));
        int i26 = ((i25 | 1) << 1) - (i25 ^ 1);
        int i27 = i26 >> 28;
        int i28 = ((((i27 | (-31)) << 1) - (i27 ^ (-31))) / 16) + 1;
        return ((double) (1179294408 / (((-(((i28 | 1) << 1) - (i28 ^ 1))) & i26) * 8))) + Double.NEGATIVE_INFINITY;
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        INSTANCE = new DoubleCompanionObject();
        int i = b + 77;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ void getMAX_VALUE$annotations() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void getMIN_VALUE$annotations() {
        int i = 2 % 2;
        int i2 = g + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void getNEGATIVE_INFINITY$annotations() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void getNaN$annotations() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void getPOSITIVE_INFINITY$annotations() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void getSIZE_BITS$annotations() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 92 / 0;
        }
    }

    public static /* synthetic */ void getSIZE_BYTES$annotations() {
        int i = 2 % 2;
        int i2 = g + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final double getMAX_VALUE() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return Double.MAX_VALUE;
        }
        throw null;
    }

    public final double getMIN_VALUE() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return Double.MIN_VALUE;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final double getNaN() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return Double.NaN;
    }

    public final double getPOSITIVE_INFINITY() {
        int i = 2 % 2;
        int i2 = g + 29;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 5;
        g = i5 % 128;
        int i6 = i5 % 2;
        return Double.POSITIVE_INFINITY;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new char[]{60047, 59746, 60049, 60059, 60056, 59749, 60060, 59748, 60117, 60061, 60052, 60079, 60051, 60053, 60057, 60083, 60046, 60073, 60041, 60055, 60050, 59744, 59747, 60088, 60034, 60048, 60072, 60058, 59745, 60062, 60040, 60043, 60090, 60045, 60054, 60063};
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 57191;
    }

    private static String $$g(short s, int i, byte b2) {
        int i2 = 3 - (b2 * 4);
        byte[] bArr = $$c;
        int i3 = s * 2;
        int i4 = 116 - i;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 = (-i4) + i2;
            i2 = i2;
            i5 = -1;
        }
        while (true) {
            int i6 = i2 + 1;
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i3) {
                return new String(bArr2, 0);
            }
            i4 = (-bArr[i6]) + i4;
            i2 = i6;
            i5 = i7;
        }
    }
}
