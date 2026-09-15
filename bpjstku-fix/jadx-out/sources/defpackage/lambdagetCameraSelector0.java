package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lambdagetCameraSelector0 extends CameraFactory implements CameraFiltersExternalSyntheticLambda0 {
    private static final byte[] $$c = {114, -59, 10, 31};
    private static final int $$f = 236;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {55, -64, 35, -71, 4, -31, 3, -13, -6, 36, -44, 35, -44, -17, -4, -3, 4, -31, 47, -57, -6, -2, -13, -6, 32, -41, 4, -8, -40, 5, -18, 4, -13, -6, 23, -24, -31, 5, 1, -16, -13, 39, -51, 10, -13, -13, 1, -16, -13, -6, -4, 4, -5, -13, 1, -18, -4, -12, -5, -4, -12, 2, -6, -25, 6, -3, -25, 35, -41, 4, -8, -14, 1, -8, -8, -2, -27, 2, -15, 58};
    private static final int $$e = 194;
    private static final byte[] $$a = {48, -119, -71, 110, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 189;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {59707, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59717, 59770, 59739, 59723, 59757, 59773, 59768, 59751, 59746, 59731, 59740, 59750, 59746, 59756, 59698, 59751, 59759, 59728, 59728, 59752, 59757, 59771, 59749, 59744, 59746, 59758, 59747, 59757, 59747, 59708, 59751, 59757, 59714, 59724, 59747, 59771, 59716, 59708, 59737, 59744, 59749, 59748, 59748, 59749, 59773, 59757, 59733, 59750, 59744, 59752, 59753, 59753, 59756, 59746, 59744, 59696, 59771, 59749, 59771, 59745, 59749, 59774, 59775, 59750, 59744, 59768, 59735, 59729, 59769, 59771, 59751, 59747, 59759};

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.lambdagetCameraSelector0.$$a
            int r6 = r6 * 4
            int r6 = 84 - r6
            int r8 = r8 * 15
            int r1 = r8 + 38
            int r7 = 92 - r7
            byte[] r1 = new byte[r1]
            int r8 = r8 + 37
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2d:
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdagetCameraSelector0.a(short, short, byte, java.lang.Object[]):void");
    }

    private static void d(byte b, short s, short s2, Object[] objArr) {
        byte[] bArr = $$d;
        int i = 108 - (b * 24);
        int i2 = s * 28;
        int i3 = (s2 * 24) + 4;
        byte[] bArr2 = new byte[i2 + 25];
        int i4 = i2 + 24;
        int i5 = -1;
        if (bArr == null) {
            int i6 = i4 + (-i3);
            i3++;
            i = i6 - 7;
            i5 = -1;
        }
        while (true) {
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i;
            if (i7 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i3;
            int i9 = i + (-bArr[i3]);
            i3 = i8 + 1;
            i = i9 - 7;
            i5 = i7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x01f7  */
    /* JADX WARN: Type inference failed for: r2v56, types: [boolean, int] */
    @Override // defpackage.CameraFactory
    protected final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, Parcel parcel) throws Throwable {
        Object[] objArr;
        Parcelable parcelable;
        Object[] objArr2;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
            int i5 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
            int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0');
            byte b = $$a[7];
            byte b2 = b;
            Object[] objArr3 = new Object[1];
            a(b2, (byte) (b2 | 89), b, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, i5, iLastIndexOf, -1650998592, false, (String) objArr3[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new int[]{0, 22, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new int[]{22, 15, 0, 11}, false, new byte[]{1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iMyPid = (Process.myPid() >> 22) + 876;
            int iLastIndexOf2 = 9 - TextUtils.lastIndexOf("", '0');
            byte[] bArr = $$a;
            byte b3 = bArr[7];
            Object[] objArr6 = new Object[1];
            a(b3, (byte) (b3 | 52), bArr[28], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity, iMyPid, iLastIndexOf2, 2012020043, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 877;
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[7];
                Object[] objArr7 = new Object[1];
                a(b4, b4, bArr2[28], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, bitsPerPixel, scrollBarFadeDuration, 2012931276, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int i6 = (~((-142395023) | i)) | 141051398;
            int i7 = (((1521273620 + (i6 * 992)) + ((i6 | (~((~i) | (-100741170)))) * (-496))) + (((-102084794) | i) * 496)) - 263389882;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
        } else {
            Object[] objArr9 = new Object[1];
            c(new int[]{37, 26, 0, 22}, false, new byte[]{1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new int[]{63, 18, 2, 4}, false, new byte[]{0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                    if (i10 % 2 == 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        obj.hashCode();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            try {
                Object[] objArr11 = {applicationContext, Integer.valueOf(i), 0, -263389882};
                byte[] bArr3 = $$d;
                byte b5 = (byte) (bArr3[38] - 1);
                byte b6 = b5;
                Object[] objArr12 = new Object[1];
                d(b5, b6, b6, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b7 = bArr3[38];
                byte b8 = b7;
                Object[] objArr13 = new Object[1];
                d(b7, b8, b8, objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int i11 = 877 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int iIndexOf = 10 - TextUtils.indexOf("", "");
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[7];
                        Object[] objArr15 = new Object[1];
                        a(b9, b9, bArr4[28], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionType, i11, iIndexOf, 2012931276, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                    try {
                        Object[] objArr16 = new Object[1];
                        c(new int[]{0, 22, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr16);
                        Class<?> cls4 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        c(new int[]{22, 15, 0, 11}, false, new byte[]{1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1}, objArr17);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                            int iResolveSize = 876 - View.resolveSize(0, 0);
                            int iIndexOf2 = TextUtils.indexOf("", "") + 10;
                            byte[] bArr5 = $$a;
                            byte b10 = bArr5[7];
                            Object[] objArr18 = new Object[1];
                            a(b10, (byte) (b10 | 52), bArr5[28], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(pressedStateDuration, iResolveSize, iIndexOf2, 2012020043, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                            int modifierMetaStateMask = 875 - ((byte) KeyEvent.getModifierMetaStateMask());
                            int iRgb = Color.rgb(0, 0, 0) + 16777226;
                            byte b11 = $$a[7];
                            byte b12 = b11;
                            Object[] objArr19 = new Object[1];
                            a(b12, (byte) (b12 | 89), b11, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, modifierMetaStateMask, iRgb, -1650998592, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr14;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i12 = ((int[]) objArr[2])[0];
        int i13 = ((int[]) objArr[0])[0];
        if (i13 == i12) {
            int i14 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i15 = 1694399904 + (((~((-459862710) | i)) | 419483808 | (~((-419552481) | i))) * (-754));
            int i16 = ~((-419483809) | i);
            int i17 = ~i;
            int i18 = i14 + i15 + ((i16 | (~((-68673) | i17))) * (-754)) + (((-459862710) | i17) * 754);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            objArr2 = objArr20;
            parcelable = null;
        } else {
            parcelable = null;
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            int i21 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyTid = Process.myTid();
            int i22 = ~iMyTid;
            int i23 = i21 + (-810060588) + ((17825826 | i22) * (-192)) + (((~(122761826 | i22)) | 145246229) * (-384)) + (((~(iMyTid | (-104936001))) | (~(i22 | 268008055)) | (~((-145246230) | iMyTid))) * DerHeader.TAG_CLASS_PRIVATE);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr2[1])[0] = i25 ^ (i25 << 5);
        }
        if (i != 2) {
            return false;
        }
        Bundle bundle = (Bundle) (parcel.readInt() == 0 ? parcelable : (Parcelable) Bundle.CREATOR.createFromParcel(parcel));
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            StringBuilder sb = new StringBuilder("Parcel data not fully consumed, unread size: ");
            sb.append(iDataAvail);
            throw new BadParcelableException(sb.toString());
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(bundle);
        int i26 = ((int[]) objArr2[1])[0];
        int i27 = i26 * i26;
        int i28 = -(730768263 * i26);
        int i29 = (((i27 & i28) + (i27 | i28)) - (~(-(i26 * 1130194119)))) - 1;
        int i30 = ((i29 | (-1778041359)) << 1) - ((-1778041359) ^ i29);
        int i31 = ((i30 >> 28) - 31) / 16;
        int i32 = ((i31 | 1) << 1) - (i31 ^ 1);
        int i33 = (i30 & i32) + (i32 | i30);
        int i34 = i30 >> 24;
        int i35 = -(i33 ^ ((((i34 & (-511)) + (i34 | (-511))) / 256) + 1));
        int i36 = (i35 & 8) + (i35 | 8);
        int i37 = i36 >> 21;
        int i38 = ((((i37 | (-4095)) << 1) - (i37 ^ (-4095))) / 2048) + 1;
        return 11688 / (((-((i38 & 1) + (i38 | 1))) & i36) * 1461);
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i3;
                        byte b2 = (byte) (b + 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.getMode(i3), 1269 - ((byte) KeyEvent.getModifierMetaStateMask()), 18 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 407021364, false, $$g(b, b2, (byte) (b2 - 5)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
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
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr2, i4, cArr4, 0, i5);
        if (bArr != null) {
            int i9 = $10 + 11;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr = new char[i5];
                setvideostabilizationmode.b = 0;
            } else {
                cArr = new char[i5];
                setvideostabilizationmode.b = 0;
            }
            char c = 0;
            while (setvideostabilizationmode.b < i5) {
                int i10 = $10 + 109;
                $11 = i10 % 128;
                if (i10 % 2 != 0 ? bArr[setvideostabilizationmode.b] != 1 : bArr[setvideostabilizationmode.b] != 0) {
                    int i11 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29944);
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1756;
                            int keyRepeatDelay = 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            byte length2 = (byte) $$c.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatTimeout, iIndexOf, keyRepeatDelay, 387247676, false, $$g((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i12 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b3 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 3225, 12 - ((byte) KeyEvent.getModifierMetaStateMask()), 2133916302, false, $$g(b3, (byte) (b3 | 6), b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 41241), 1705 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 21, -1434471773, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            int i13 = $11 + 99;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                char[] cArr5 = new char[i5];
                i = 0;
                System.arraycopy(cArr4, 1, cArr5, 0, i5);
                System.arraycopy(cArr5, 1, cArr4, i5 + i7, i7);
                System.arraycopy(cArr5, i7, cArr4, 0, i5 << i7);
            } else {
                i = 0;
                char[] cArr6 = new char[i5];
                System.arraycopy(cArr4, 0, cArr6, 0, i5);
                int i14 = i5 - i7;
                System.arraycopy(cArr6, 0, cArr4, i14, i7);
                System.arraycopy(cArr6, i7, cArr4, 0, i14);
            }
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i5];
            while (true) {
                setvideostabilizationmode.b = i;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr7[setvideostabilizationmode.b] = cArr4[(i5 - setvideostabilizationmode.b) - 1];
                i = setvideostabilizationmode.b + 1;
            }
            cArr4 = cArr7;
        }
        if (i6 > 0) {
            int i15 = 0;
            loop3: while (true) {
                setvideostabilizationmode.b = i15;
                while (true) {
                    if (setvideostabilizationmode.b >= i5) {
                        break loop3;
                    }
                    int i16 = $10 + 37;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] * iArr[3]);
                        int i17 = setvideostabilizationmode.b;
                        setvideostabilizationmode.b = 0;
                    }
                }
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                i15 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, int r8) {
        /*
            byte[] r0 = defpackage.lambdagetCameraSelector0.$$c
            int r8 = r8 * 3
            int r1 = r8 + 1
            int r7 = 105 - r7
            int r6 = r6 * 2
            int r6 = 3 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdagetCameraSelector0.$$g(byte, byte, int):java.lang.String");
    }
}
