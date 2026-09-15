package com.bpjstku.data.setting.model.request;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/bpjstku/data/setting/model/request/ChangeHandphoneVerificationRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/setting/model/request/ChangeHandphoneVerificationRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", "newPhoneNumber", "getNewPhoneNumber"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ChangeHandphoneVerificationRequest extends BaseRequest {
    public static final int $stable = 0;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @SerializedName("email")
    private final String email;

    @SerializedName("noHpBaru")
    private final String newPhoneNumber;
    private static final byte[] $$c = {114, -59, 10, 31};
    private static final int $$f = 104;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {106, -22, 107, 95, -8, -25, 26, -41, -14, -11, -12, 3, -6, -28, 36, -46, 2, -16, -8, 21, -51, -13, -5, 2, -29, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
    private static final int $$e = 139;
    private static final byte[] $$a = {42, -104, -68, 105, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = DerHeader.TAG_CLASS_PRIVATE;
    private static int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f411a = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 52
            int r7 = 108 - r7
            int r6 = r6 * 15
            int r0 = 53 - r6
            int r5 = r5 * 4
            int r5 = r5 + 84
            byte[] r1 = com.bpjstku.data.setting.model.request.ChangeHandphoneVerificationRequest.$$a
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L28:
            r3 = r1[r7]
        L2a:
            int r7 = r7 + 1
            int r5 = r5 + r3
            int r5 = r5 + (-11)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.setting.model.request.ChangeHandphoneVerificationRequest.c(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 31
            int r0 = 53 - r6
            int r5 = r5 * 19
            int r5 = 103 - r5
            int r7 = r7 * 21
            int r7 = r7 + 4
            byte[] r1 = com.bpjstku.data.setting.model.request.ChangeHandphoneVerificationRequest.$$d
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L18
            r4 = r6
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            r4 = r1[r7]
            int r3 = r3 + 1
        L2a:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-10)
            int r7 = r7 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.setting.model.request.ChangeHandphoneVerificationRequest.e(byte, byte, short, java.lang.Object[]):void");
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = f411a + 51;
        b = i2 % 128;
        int i3 = i2 % 2;
        String str = this.email;
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        return str;
    }

    public final String getNewPhoneNumber() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 41;
        f411a = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.newPhoneNumber;
        int i4 = i2 + 77;
        f411a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return str;
    }

    public ChangeHandphoneVerificationRequest(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.email = str;
        this.newPhoneNumber = str2;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    public final boolean equals(Object p0) throws Throwable {
        Object[] objArr;
        int i;
        Object[] objArr2;
        int i2 = 2 % 2;
        int i3 = b + 41;
        f411a = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 43042);
            int i5 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3111;
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 22;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr3 = new Object[1];
            c(b2, b2, bArr[37], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, i5, windowTouchSlop, -1272852037, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        d(new char[]{21, 7, '\t', 23, '\r', 16, 6, 18, '\r', 1, 19, 6, 18, 0, '\t', 0, 3, 11, '\r', '\f', 3, 1}, (byte) (Drawable.resolveOpacity(0, 0) + 71), 22 - (Process.myPid() >> 22), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        d(new char[]{2, 14, 24, '\f', 4, 0, '\r', 3, 2, 24, '\n', 7, 16, 3, 13838}, (byte) (TextUtils.getTrimmedLength("") + 15), 15 - (Process.myPid() >> 22), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (43042 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
            int iAxisFromString = 3110 - MotionEvent.axisFromString("");
            int i6 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            Object[] objArr6 = new Object[1];
            c(b3, b3, bArr2[132], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iAxisFromString, i6, -1269618118, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16820258);
                int deadChar = KeyEvent.getDeadChar(0, 0) + 3111;
                int windowTouchSlop2 = 22 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte[] bArr3 = $$a;
                byte b4 = bArr3[7];
                Object[] objArr7 = new Object[1];
                c(b4, bArr3[132], b4, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb, deadChar, windowTouchSlop2, 154975793, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr8[2])[0];
            int i8 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[3];
            int[] iArr = {i8};
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = ~((-1350902049) | iIdentityHashCode);
            int i10 = (((712656802 + ((85591552 | i9) * (-476))) + (i9 * 952)) + ((~((~iIdentityHashCode) | (-1350902049))) * 476)) - 1291499555;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
            objArr = new Object[]{new int[1], iArr, new int[]{i7}, strArr};
        } else {
            Object[] objArr9 = new Object[1];
            d(new char[]{17, 24, '\f', 2, 17, 11, 21, 7, 11, 15, 5, 19, 0, '\b', 0, 2}, (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 74), 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            d(new char[]{23, '\r', 1, '\t', '\b', 15, '\n', 20, 22, 23, 0, 23, 14, '\f', '\t', 3}, (byte) (18 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15, objArr10);
            try {
                Object[] objArr11 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue()), 0, -1291499555};
                byte[] bArr4 = $$d;
                byte b5 = bArr4[28];
                byte b6 = (byte) (b5 - 1);
                byte b7 = b5;
                Object[] objArr12 = new Object[1];
                e(b6, b7, (byte) (b7 - 1), objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b8 = bArr4[28];
                byte b9 = b8;
                Object[] objArr13 = new Object[1];
                e(b9, (byte) (b9 - 1), b8, objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43041);
                    int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3111;
                    int iIndexOf = TextUtils.indexOf("", "") + 22;
                    byte[] bArr5 = $$a;
                    byte b10 = bArr5[7];
                    Object[] objArr14 = new Object[1];
                    c(b10, bArr5[132], b10, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, maximumFlingVelocity2, iIndexOf, 154975793, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    d(new char[]{21, 7, '\t', 23, '\r', 16, 6, 18, '\r', 1, 19, 6, 18, 0, '\t', 0, 3, 11, '\r', '\f', 3, 1}, (byte) (71 - View.MeasureSpec.getMode(0)), 22 - (KeyEvent.getMaxKeyCode() >> 16), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    d(new char[]{2, 14, 24, '\f', 4, 0, '\r', 3, 2, 24, '\n', 7, 16, 3, 13838}, (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 15), 15 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cGreen = (char) (Color.green(0) + 43042);
                        int mode = 3111 - View.MeasureSpec.getMode(0);
                        int i13 = 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        byte[] bArr6 = $$a;
                        byte b11 = bArr6[7];
                        Object[] objArr17 = new Object[1];
                        c(b11, b11, bArr6[132], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cGreen, mode, i13, -1269618118, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char minimumFlingVelocity = (char) (43042 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int i14 = 3111 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 22;
                        byte[] bArr7 = $$a;
                        byte b12 = bArr7[7];
                        Object[] objArr18 = new Object[1];
                        c(b12, b12, bArr7[37], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(minimumFlingVelocity, i14, pressedStateDuration, -1272852037, false, (String) objArr18[0], null);
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[2])[0];
        if (i16 == i15) {
            int i17 = ((int[]) objArr[0])[0];
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i20 = i17 + (-1869862562) + (((~((-1213773394) | iIdentityHashCode2)) | (-491258066)) * (-964)) + (((~((~iIdentityHashCode2) | (-1213773394))) | 1074836992) * (-964));
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr2[0])[0] = i22 ^ (i22 << 5);
            objArr2 = new Object[]{new int[1], new int[]{i19}, new int[]{i18}, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i23 = b + 99;
                f411a = i23 % 128;
                int i24 = 2;
                int i25 = i23 % 2;
                int i26 = 0;
                while (i26 < strArr3.length) {
                    int i27 = b + 57;
                    f411a = i27 % 128;
                    int i28 = i27 % i24;
                    arrayList.add(strArr3[i26]);
                    i26++;
                    int i29 = f411a + 37;
                    b = i29 % 128;
                    int i30 = i29 % 2;
                    i24 = 2;
                }
                i = i24;
            } else {
                i = 2;
            }
            Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % i), 0).show();
            objArr2 = new Object[4];
            objArr2[0] = new int[1];
            objArr2[1] = new int[]{i};
            objArr2[i] = new int[]{i};
            int i31 = ((int[]) objArr[0])[0];
            int i32 = ((int[]) objArr[i])[0];
            int i33 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i34 = ~iIdentityHashCode3;
            int i35 = i31 + (-1055007134) + (((~(iIdentityHashCode3 | 1251777833)) | (~((-168040746) | i34)) | (-1536990714)) * (-68)) + ((~((-285212881) | i34)) * (-68)) + (((~((-1251777834) | i34)) | (-453253626)) * 68);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr2[0])[0] = i37 ^ (i37 << 5);
            objArr2[3] = strArr4;
        }
        if (this == p0) {
            int i38 = b + 9;
            f411a = i38 % 128;
            return i38 % 2 != 0;
        }
        if (!(p0 instanceof ChangeHandphoneVerificationRequest)) {
            int i39 = f411a + 27;
            b = i39 % 128;
            int i40 = i39 % 2;
            return false;
        }
        ChangeHandphoneVerificationRequest changeHandphoneVerificationRequest = (ChangeHandphoneVerificationRequest) p0;
        if (Intrinsics.areEqual(this.email, changeHandphoneVerificationRequest.email)) {
            return Intrinsics.areEqual(this.newPhoneNumber, changeHandphoneVerificationRequest.newPhoneNumber);
        }
        int i41 = b + 41;
        f411a = i41 % 128;
        int i42 = i41 % 2;
        int i43 = ((int[]) objArr2[0])[0];
        int i44 = ((((i43 * i43) - (~(-(16770374 * i43)))) - 1) - (~(-(i43 * (-408887342))))) - 1;
        int i45 = (i44 & (-1653638000)) + ((-1653638000) | i44);
        int i46 = ((i45 >> 29) - 15) / 8;
        int i47 = (i46 & 1) + (i46 | 1);
        int i48 = (i45 & i47) + (i47 | i45);
        int i49 = i45 >> 24;
        int i50 = -(i48 ^ ((((i49 & (-511)) + (i49 | (-511))) / 256) + 1));
        int i51 = (i50 & 2) + (i50 | 2);
        int i52 = i51 >> 16;
        int i53 = ((((-131071) | i52) << 1) - (i52 ^ (-131071))) / 65536;
        int i54 = (i53 ^ 1) + ((i53 & 1) << 1);
        return 0 / (((-(((i54 | 1) << 1) - (i54 ^ 1))) & i51) * 319);
    }

    private static void d(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i5 = 1770390596;
        long j = 0;
        Object obj2 = null;
        if (cArr3 != null) {
            int i6 = $10 + 51;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (1 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1))), KeyEvent.keyCodeFromString("") + 2267, Color.green(0) + 33, -1927765101, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i3++;
                    i5 = 1770390596;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $11 + 95;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (MotionEvent.axisFromString("") + 1), 2267 - (ViewConfiguration.getEdgeSlop() >> 16), 34 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1927765101, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i9 = $11 + 111;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b7 = (byte) 1;
                        byte b8 = (byte) (b7 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49268 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3260, 29 - TextUtils.indexOf((CharSequence) "", '0'), -127612708, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        int i10 = $10 + 19;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 3;
                            byte b10 = (byte) (b9 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22877 - Process.getGidForName("")), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 594, 17 - TextUtils.getOffsetAfter("", 0), 1570859318, false, $$g(b9, b10, (byte) (b10 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i12];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i13];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i14];
                        } else {
                            int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i15];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i16];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        for (int i17 = 0; i17 < i; i17++) {
            cArr4[i17] = (char) (cArr4[i17] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ ChangeHandphoneVerificationRequest copy$default(ChangeHandphoneVerificationRequest changeHandphoneVerificationRequest, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = f411a + 91;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                str = changeHandphoneVerificationRequest.email;
                int i4 = 18 / 0;
            } else {
                str = changeHandphoneVerificationRequest.email;
            }
        }
        if ((i & 2) != 0) {
            int i5 = f411a;
            int i6 = i5 + 19;
            b = i6 % 128;
            int i7 = i6 % 2;
            String str3 = changeHandphoneVerificationRequest.newPhoneNumber;
            int i8 = i5 + 7;
            b = i8 % 128;
            int i9 = i8 % 2;
            str2 = str3;
        }
        ChangeHandphoneVerificationRequest changeHandphoneVerificationRequestCopy = changeHandphoneVerificationRequest.copy(str, str2);
        int i10 = f411a + 37;
        b = i10 % 128;
        if (i10 % 2 == 0) {
            return changeHandphoneVerificationRequestCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = f411a;
        int i3 = i2 + 77;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.email;
        int i4 = i2 + 29;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = f411a;
        int i3 = i2 + 41;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.newPhoneNumber;
        int i5 = i2 + 55;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
        return str;
    }

    public final ChangeHandphoneVerificationRequest copy(String p0, String p1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        ChangeHandphoneVerificationRequest changeHandphoneVerificationRequest = new ChangeHandphoneVerificationRequest(p0, p1);
        int i2 = b + 105;
        f411a = i2 % 128;
        if (i2 % 2 != 0) {
            return changeHandphoneVerificationRequest;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b + 123;
        f411a = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.email.hashCode() * 31) + this.newPhoneNumber.hashCode();
        int i4 = f411a + 51;
        b = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.email;
        String str2 = this.newPhoneNumber;
        StringBuilder sb = new StringBuilder("ChangeHandphoneVerificationRequest(email=");
        sb.append(str);
        sb.append(", newPhoneNumber=");
        sb.append(str2);
        sb.append(")");
        String string = sb.toString();
        int i2 = f411a + 53;
        b = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{60048, 60054, 60056, 60040, 60062, 60047, 60053, 60045, 60063, 60072, 60060, 60052, 60055, 60088, 60043, 60034, 60117, 60057, 60050, 60049, 60051, 60083, 60058, 60073, 60041};
        TuitionPaymentFragmentbindingInflater1 = (char) 57188;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, int r7, int r8) {
        /*
            int r7 = r7 * 4
            int r0 = 1 - r7
            int r6 = r6 + 113
            byte[] r1 = com.bpjstku.data.setting.model.request.ChangeHandphoneVerificationRequest.$$c
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r8 = r8 + 1
            r3 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.setting.model.request.ChangeHandphoneVerificationRequest.$$g(int, int, int):java.lang.String");
    }
}
