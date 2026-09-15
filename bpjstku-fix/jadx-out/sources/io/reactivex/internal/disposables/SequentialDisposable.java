package io.reactivex.internal.disposables;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import defpackage.BufferProviderState;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
public final class SequentialDisposable extends AtomicReference<BufferProviderState> implements BufferProviderState {
    private static final long serialVersionUID = -754898800686245608L;
    private static final byte[] $$c = {6, 51, 46, 31};
    private static final int $$f = 146;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {77, -106, 83, 4, 22, 8, -53, 67, 18, 10, 2, 15, 3, -45, 66, 13, 19, -3, 7, 9, 28, -4, -45, 63, 25, -7, 28, -1, 14, 23, 5, -1, 4, 26, -59, 34, 45, 19, -3, 7, 9, 28, -4, -24, 57, -7, 28, -1, 14, 23, 5, -1, 4, 26, -30, 51, 14, -28, 29, 12, 12, 20, 11, 8, -7, 27, -68, 41, 54, 8, 13, -5, 23, 5, 16, 9};
    private static final int $$e = 166;
    private static final byte[] $$a = {109, 84, -87, -114, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 45;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int g = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {47338, 47389, 47335, 47385, 47388, 47330, 47325, 47384, 47352, 47378, 47383, 47334, 47390, 47304, 47391, 47336, 47328, 47387, 47353, 47306, 47381, 47351, 47331, 47382, 47329, 47332, 47299, 47321, 47333, 47337, 47317, 47314, 47318, 47316, 47322, 47320, 47319, 47315, 47323};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2047719563;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
    private static boolean b = true;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r8 = r8 * 52
            int r0 = r8 + 1
            int r7 = r7 * 52
            int r7 = 56 - r7
            byte[] r1 = io.reactivex.internal.disposables.SequentialDisposable.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2d:
            int r3 = r3 + 1
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + (-11)
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.disposables.SequentialDisposable.a(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 98
            int r8 = r8 * 72
            int r8 = 76 - r8
            byte[] r0 = io.reactivex.internal.disposables.SequentialDisposable.$$d
            int r7 = r7 * 72
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r8 = r8 + r4
            int r6 = r6 + 1
            int r8 = r8 + (-10)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.disposables.SequentialDisposable.d(byte, short, byte, java.lang.Object[]):void");
    }

    public SequentialDisposable() {
    }

    public SequentialDisposable(BufferProviderState bufferProviderState) {
        lazySet(bufferProviderState);
    }

    @Override // defpackage.BufferProviderState
    public final void dispose() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        g = i2 % 128;
        int i3 = i2 % 2;
        DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        int i4 = g + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
        int i4 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 109;
                $11 = i6 % 128;
                if (i6 % i2 == 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i4] = Integer.valueOf(cArr2[i5]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) i4;
                            byte b3 = (byte) (b2 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - (ViewConfiguration.getPressedStateDuration() >> 16)), 2994 - View.MeasureSpec.makeMeasureSpec(i4, i4), TextUtils.indexOf("", "", i4, i4) + 17, 1182129903, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (31339 - View.MeasureSpec.makeMeasureSpec(0, 0)), 2994 - ExpandableListView.getPackedPositionGroup(0L), View.resolveSize(0, 0) + 17, 1182129903, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5++;
                }
                i2 = 2;
                i4 = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 43325), Gravity.getAbsoluteGravity(0, 0) + 253, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
        int i7 = 33602;
        int i8 = 1687675375;
        if (b) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - (ViewConfiguration.getScrollBarSize() >> 8)), (ViewConfiguration.getPressedStateDuration() >> 16) + 3085, ExpandableListView.getPackedPositionChild(0L) + 27, -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i9 = $11 + 73;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i11 = $11 + 27;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 >> 1) >> getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] >> i] * iIntValue);
                    Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (i7 - TextUtils.indexOf("", "")), TextUtils.indexOf("", "", 0) + 3085, 26 - TextUtils.getOffsetAfter("", 0), -2146875848, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                } else {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr7 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 33601), 3085 - View.resolveSize(0, 0), 26 - View.combineMeasuredStates(0, 0), -2146875848, false, $$g(b10, b11, b11), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                }
                i7 = 33602;
                i8 = 1687675375;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i12 = 0;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12;
            if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i13 = $11 + 75;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            i12 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        }
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (37566 - TextUtils.lastIndexOf("", '0'));
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 625;
            int iIndexOf = TextUtils.indexOf("", "", 0) + 14;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[5], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, iResolveOpacity, iIndexOf, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(null, null, 127 - ExpandableListView.getPackedPositionGroup(0L), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(null, null, (Process.myPid() >> 22) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cBlue = (char) (37567 - Color.blue(0));
            int gidForName = Process.getGidForName("") + 626;
            int i2 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14;
            byte b3 = $$a[5];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            a(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, gidForName, i2, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = g + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 37567);
                int iMyTid = 625 - (Process.myTid() >> 22);
                int i5 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13;
                byte[] bArr2 = $$a;
                byte b5 = bArr2[5];
                Object[] objArr6 = new Object[1];
                a(b5, bArr2[7], b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, iMyTid, i5, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i6};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i8 = ~startUptimeMillis;
            int i9 = ((((-1335123112) + (((~(startUptimeMillis | 1693031386)) | ((~((-80218379) | i8)) | (-1743519743))) * (-68))) + ((~((-50488357) | i8)) * (-68))) + (((~((-1693031387) | i8)) | (-130706735)) * 68)) - 1895528465;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
            objArr = new Object[]{new int[]{i7}, new int[1], iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(null, null, Color.rgb(0, 0, 0) + 16777343, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(null, null, View.MeasureSpec.getSize(0) + 127, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
                g = i12 % 128;
                int i13 = i12 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(null, null, 127 - Color.alpha(0), new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(null, null, AndroidCharacter.getMirror('0') + 'O', new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            c(null, null, TextUtils.getOffsetBefore("", 0) + 127, new byte[]{-98, -100, -99, -98, -98, -91, -90, -96, -98, -100, -90, -91, -127, -90, -89, -127, -95, -92, -116, -99, -90, -91, -95, -99, -127, -90, -93, -93, -96, -100, -127, -96, -96, -91, -125, -92, -93, -98, -94, -116, -98, -94, -94, -95, -116, -97, -93, -94, -95, -127, -116, -116, -95, -99, -99, -96, -97, -99, -98, -127, -127, -99, -116, -100}, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            c(null, null, 127 - Color.blue(0), new byte[]{-99, -97, -89, -127, -91, -100, -99, -112, -100, -92, -91, -98, -96, -96, -112, -96, -92, -92, -91, -94, -97, -99, -116, -100, -100, -127, -116, -91, -93, -95, -98, -96, -90, -96, -96, -92, -96, -98, -91, -98, -97, -99, -94, -95, -92, -97, -92, -100, -91, -99, -100, -116, -98, -89, -99, -116, -94, -98, -95, -89, -97, -125, -127, -112}, objArr13);
            String[] strArr2 = {str, (String) objArr13[0]};
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
            g = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, -1895528465};
                byte[] bArr3 = $$d;
                byte b6 = (byte) (-bArr3[27]);
                byte b7 = b6;
                Object[] objArr15 = new Object[1];
                d(b6, b7, b7, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b8 = (byte) (bArr3[27] + 1);
                byte b9 = b8;
                Object[] objArr16 = new Object[1];
                d(b8, b9, b9, objArr16);
                objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i16 = ((int[]) objArr[0])[0];
                int i17 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 37567);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 625;
                        int size = 14 - View.MeasureSpec.getSize(0);
                        byte[] bArr4 = $$a;
                        byte b10 = bArr4[5];
                        Object[] objArr17 = new Object[1];
                        a(b10, bArr4[7], b10, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, scrollBarFadeDuration, size, -973632554, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr18 = new Object[1];
                        c(null, null, Drawable.resolveOpacity(0, 0) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        c(null, null, View.getDefaultSize(0, 0) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char doubleTapTimeout = (char) (37567 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 625;
                            int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 14;
                            byte b11 = $$a[5];
                            byte b12 = b11;
                            Object[] objArr20 = new Object[1];
                            a(b11, b12, b12, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(doubleTapTimeout, keyRepeatDelay, iResolveOpacity2, -976899241, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cMakeMeasureSpec = (char) (37567 - View.MeasureSpec.makeMeasureSpec(0, 0));
                            int mode = View.MeasureSpec.getMode(0) + 625;
                            int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14;
                            byte[] bArr5 = $$a;
                            byte b13 = bArr5[7];
                            Object[] objArr21 = new Object[1];
                            a(b13, bArr5[5], b13, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec, mode, doubleTapTimeout2, -477065106, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i18 = ((int[]) objArr[0])[0];
        int i19 = ((int[]) objArr[2])[0];
        if (i19 == i18) {
            int i20 = ((int[]) objArr[1])[0];
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[0])[0];
            String[] strArr3 = (String[]) objArr[3];
            int[] iArr2 = {i21};
            int[] iArr3 = {i22};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i23 = 1637045454 + (((~((~iUptimeMillis) | (-1752951036))) | 1749272818) * (-245));
            int i24 = ~(iUptimeMillis | (-1752951036));
            int i25 = i20 + i23 + (i24 * (-245)) + ((i24 | 70787085) * 245);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr[1])[0] = i27 ^ (i27 << 5);
            Object[] objArr22 = {iArr3, new int[1], iArr2, strArr3};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr4 = (String[]) objArr[3];
            if (strArr4 != null) {
                int i28 = g + 125;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
                int i29 = i28 % 2;
                for (String str2 : strArr4) {
                    arrayList.add(str2);
                }
            }
            Toast.makeText((Context) null, i19 / (((i19 - 1) * i19) % 2), 0).show();
            int i30 = ((int[]) objArr[1])[0];
            int i31 = ((int[]) objArr[2])[0];
            int i32 = ((int[]) objArr[0])[0];
            String[] strArr5 = (String[]) objArr[3];
            int[] iArr4 = {i31};
            int iMyTid2 = Process.myTid();
            int i33 = ~iMyTid2;
            int i34 = i30 + (-205861112) + ((537002130 | i33) * (-192)) + (((~((-1182394478) | i33)) | 104341513) * (-384)) + (((~(iMyTid2 | 1719396607)) | (~(i33 | (-1078052965))) | (~((-104341514) | iMyTid2))) * DerHeader.TAG_CLASS_PRIVATE);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr[1])[0] = i36 ^ (i36 << 5);
            Object[] objArr23 = {new int[]{i32}, new int[1], iArr4, strArr5};
        }
        boolean zTuitionPaymentFragmentbindingInflater1 = DisposableHelper.TuitionPaymentFragmentbindingInflater1(get());
        int i37 = g + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i37 % 128;
        if (i37 % 2 != 0) {
            int i38 = 55 / 0;
        }
        return zTuitionPaymentFragmentbindingInflater1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, int r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 1
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r7 = r7 + 67
            byte[] r0 = io.reactivex.internal.disposables.SequentialDisposable.$$c
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2b:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.disposables.SequentialDisposable.$$g(short, int, int):java.lang.String");
    }
}
