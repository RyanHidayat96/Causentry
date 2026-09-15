package com.bpjstku.data.user.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/bpjstku/data/user/model/request/LogoutRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/bpjstku/data/user/model/request/LogoutRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LogoutRequest extends BaseRequest {
    public static final int $stable = 0;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char b;
    private static int g;

    @SerializedName("email")
    private final String email;
    private static final byte[] $$c = {12, -88, 33, 118};
    private static final int $$f = 230;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {58, 66, -14, -31, 11, -3, -64, 56, 7, -1, -9, 4, -8, -56, 55, 2, 8, -14, -4, -2, 17, -15, -56, 67, -14, 7, 1, 4, -16, -3, 11, -2, -9, 2, -3, -58, 20, 43, -2, -9, 2, -3, -19, 26, -13, -4, 18, -16, 32, -13, 10, -12, 5, -2, -31, 16, 23, -13, -9, 8, 5, -47, 43, -18, 5, 5, -9, 8, 5, -2, -4, -12, -3, 5, -9, 10, -4, 4, -3, -4, 4, -10, -2, 17, -14, -5, 17, -43, 33, -12, 0, 6, -9, 0, 0, -6, 19, -10, 7, -66};
    private static final int $$e = 148;
    private static final byte[] $$a = {27, -8, 5, 78, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 115;
    private static int asInterface = 0;
    private static int d = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r0 = com.bpjstku.data.user.model.request.LogoutRequest.$$a
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2f
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            int r7 = r7 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2f:
            int r3 = r3 + r7
            int r7 = r3 + (-10)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.user.model.request.LogoutRequest.a(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 8
            int r6 = 53 - r6
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.data.user.model.request.LogoutRequest.$$d
            int r8 = r8 * 15
            int r8 = 99 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2c
        L15:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r8 = r8 + 1
            r4 = r0[r8]
        L2c:
            int r7 = r7 + r4
            int r7 = r7 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.user.model.request.LogoutRequest.e(short, int, short, java.lang.Object[]):void");
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 101;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.email;
        int i5 = i2 + 67;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public LogoutRequest(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.email = str;
    }

    public final LogoutRequest copy(String p0) throws Throwable {
        int length;
        Object[] objArr;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 921;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 28;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a((byte) 52, bArr[80], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iResolveOpacity, iMakeMeasureSpec, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{24089, 5890, 33415, 8750, 44060, 43840, 20461, 41099, 21336, 2306, 58834, 14528, 10536, 33872, 25931, 18801, 17089, 5274, 61781, 47010, 50995, 15010, 33891, 33756}, 22 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{2460, 27263, 36238, 20782, 41223, 20536, 1291, 14857, 19166, 14608, 45255, 56463, 4303, 60990, 35902, 36103, 680, 34590}, View.resolveSizeAndState(0, 0, 0) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cBlue = (char) (Color.blue(0) + 31533);
            int i3 = 922 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 28;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr2[80], bArr2[37], bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, i3, tapTimeout, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (31534 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                int i4 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 920;
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 28;
                byte[] bArr3 = $$a;
                byte b2 = bArr3[33];
                byte b3 = bArr3[37];
                Object[] objArr6 = new Object[1];
                a(b2, b3, (byte) (b3 | 50), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, i4, jumpTapTimeout, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i5 = (~((int) Process.getStartUptimeMillis())) | 552935862;
            int i6 = (((-196070546) + (i5 * 495)) + (((~i5) | 12656804) * 495)) - 1453514972;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{37469, 1897, 50271, 33643, 43676, 19960, 47349, 18341, 40113, 50646, 21621, 7376, 64249, 60928, 8879, 2791, 20294, 26147, 57158, 29638, 15536, 51906, 40078, 46769, 21913, 64003, 54308, 28435}, 26 - TextUtils.indexOf("", "", 0, 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{16845, 21538, 60883, 22758, 17573, 42263, 38852, 39310, 40164, 4314, 61252, 5492, 14084, 37945, 24245, 34114, 16152, 50468, 11214, 987}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 17, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            if (p0 != null) {
                length = p0.length();
                int i9 = asInterface + 33;
                d = i9 % 128;
                int i10 = i9 % 2;
            } else {
                length = 0;
            }
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(length), 0, -1453514972};
                byte[] bArr4 = $$d;
                Object[] objArr11 = new Object[1];
                e(bArr4[26], bArr4[9], bArr4[90], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                e(bArr4[90], bArr4[37], bArr4[26], objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cRed = (char) (31533 - Color.red(0));
                    int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 921;
                    int i11 = 28 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    byte[] bArr5 = $$a;
                    byte b4 = bArr5[33];
                    byte b5 = bArr5[37];
                    Object[] objArr14 = new Object[1];
                    a(b4, b5, (byte) (b5 | 50), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRed, iResolveOpacity2, i11, -1142834547, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    c(new char[]{24089, 5890, 33415, 8750, 44060, 43840, 20461, 41099, 21336, 2306, 58834, 14528, 10536, 33872, 25931, 18801, 17089, 5274, 61781, 47010, 50995, 15010, 33891, 33756}, 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(new char[]{2460, 27263, 36238, 20782, 41223, 20536, 1291, 14857, 19166, 14608, 45255, 56463, 4303, 60990, 35902, 36103, 680, 34590}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c3 = (char) (31533 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 921;
                        int touchSlop = 28 - (ViewConfiguration.getTouchSlop() >> 8);
                        byte[] bArr6 = $$a;
                        Object[] objArr17 = new Object[1];
                        a(bArr6[80], bArr6[37], bArr6[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, iKeyCodeFromString, touchSlop, -778300370, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 31533);
                        int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 921;
                        int iResolveOpacity3 = Drawable.resolveOpacity(0, 0) + 28;
                        byte[] bArr7 = $$a;
                        Object[] objArr18 = new Object[1];
                        a((byte) 52, bArr7[80], bArr7[7], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarSize, tapTimeout2, iResolveOpacity3, -1048449946, false, (String) objArr18[0], null);
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 == i12) {
            int i14 = asInterface + 65;
            d = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((int[]) objArr[0])[0];
            Object[] objArr19 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iNextInt = new Random().nextInt(939632318);
            int i17 = i16 + ((((-1005252153) + (((~((-1211773978) | iNextInt)) | (-562305667)) * (-948))) + ((~((~iNextInt) | (-4097))) * (-948))) - 2001580104);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr19[0])[0] = i19 ^ (i19 << 5);
            return new LogoutRequest(p0);
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr != null) {
            int i20 = asInterface + 49;
            d = i20 % 128;
            int i21 = i20 % 2;
            while (i2 < strArr.length) {
                int i22 = d + 47;
                asInterface = i22 % 128;
                if (i22 % 2 != 0) {
                    arrayList.add(strArr[i2]);
                    i2 += 10;
                } else {
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
        }
        throw new RuntimeException(String.valueOf(i13));
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i3 = $11 + 97;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            int i5 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i6 = 58224;
            int i7 = 0;
            while (i7 < 16) {
                int i8 = $10 + 105;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i5];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(b);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i5] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 47772);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 468;
                        int absoluteGravity = 13 - Gravity.getAbsoluteGravity(i5, i5);
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, pressedStateDuration, absoluteGravity, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i12 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 47774), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 468, TextUtils.getTrimmedLength("") + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i12 + 1;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), 2323 - View.MeasureSpec.getMode(0), ExpandableListView.getPackedPositionGroup(0L) + 44, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    static {
        g = 1;
        b();
        int i = TuitionPaymentFragmentbindingInflater1 + 125;
        g = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ LogoutRequest copy$default(LogoutRequest logoutRequest, String str, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 39;
        d = i3 % 128;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            str = logoutRequest.email;
        }
        LogoutRequest logoutRequestCopy = logoutRequest.copy(str);
        int i4 = d + 77;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return logoutRequestCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = d + 3;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return this.email;
        }
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = d + 111;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(p0 instanceof LogoutRequest)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.email, ((LogoutRequest) p0).email))) {
            return true;
        }
        int i4 = asInterface + 49;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            this.email.hashCode();
            throw null;
        }
        int iHashCode = this.email.hashCode();
        int i3 = asInterface + 115;
        d = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.email;
        StringBuilder sb = new StringBuilder("LogoutRequest(email=");
        sb.append(str);
        sb.append(")");
        String string = sb.toString();
        int i2 = d + 123;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 5914;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 39823;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 58755;
        b = (char) 34564;
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
    private static java.lang.String $$g(byte r6, short r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r7 = r7 * 2
            int r7 = r7 + 108
            int r6 = r6 * 2
            int r0 = r6 + 1
            byte[] r1 = com.bpjstku.data.user.model.request.LogoutRequest.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2b:
            int r7 = -r7
            int r3 = r3 + 1
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.user.model.request.LogoutRequest.$$g(byte, short, byte):java.lang.String");
    }
}
