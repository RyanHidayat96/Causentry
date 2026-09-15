package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int b;
    private final int zza;
    private final boolean zzb;
    private final boolean zzc;
    private final int zzd;
    private final int zze;
    private static final byte[] $$d = {ByteCompanionObject.MAX_VALUE, 43, -39, -37, -12, 2, 63, -57, -8, 0, 8, -5, 7, 55, -51, -13, 10, -14, 3, 6, 5, 54, -62, 3, 7, -16, 17, -17, 9, 4, -14, 69, -66, 4, 11, -2, -2, -14, 69, -36, 46, -69, 5, -33, 12, -11, 11, -6, 1, 30, -17, -24, 12, 8, -9, -6, 46, -44, 17, -6, -6, 8, -9, -6, 1, 3, 11, 2, -6, 8, -11, 3, -5, 2, 3, -5, 9, 1, -18, 13, 4, -18, 42, -34, 11, -1, -7, 8, -1, -1, 5, -20, 9, -8, 67};
    private static final int $$e = 211;
    private static final byte[] $$a = {102, -96, -78, -55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 24;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r0 = com.google.android.gms.common.internal.RootTelemetryConfiguration.$$a
            int r8 = r8 * 52
            int r1 = 53 - r8
            int r6 = r6 * 52
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2d
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r5
        L2d:
            int r6 = r6 + 1
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.RootTelemetryConfiguration.a(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 13
            int r6 = 53 - r6
            byte[] r0 = com.google.android.gms.common.internal.RootTelemetryConfiguration.$$d
            int r7 = r7 * 15
            int r7 = 99 - r7
            int r5 = r5 * 39
            int r5 = r5 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r5
            r7 = r6
            r3 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            r4 = r0[r5]
        L29:
            int r5 = r5 + 1
            int r4 = -r4
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.RootTelemetryConfiguration.d(int, byte, short, java.lang.Object[]):void");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersion());
        SafeParcelWriter.writeBoolean(parcel, 2, getMethodInvocationTelemetryEnabled());
        SafeParcelWriter.writeBoolean(parcel, 3, getMethodTimingTelemetryEnabled());
        SafeParcelWriter.writeInt(parcel, 4, getBatchPeriodMillis());
        SafeParcelWriter.writeInt(parcel, 5, getMaxMethodInvocationsInBatch());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public int getMaxMethodInvocationsInBatch() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = this.zze;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char minimumFlingVelocity = (char) (37567 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
            int iGreen = Color.green(0) + 625;
            int i3 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            byte b3 = bArr[5];
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity, iGreen, i3, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{8330, 44676, 15501, 35482, 6272, 59015, 29833, 49858, 20620, 56977, 44239, 15027, 34974, 5781, 58513, 29313, 49302, 20153, 56469, 43671, 14492, 34453}, Color.blue(0) + 36353, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{8334, 38890, 20048, 1756, 64812, 46511, 27649, 9026, 39910, 21087, 2757, 49456, 47518, 28687, 10104}, (ViewConfiguration.getTapTimeout() >> 16) + 46957, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (37566 - TextUtils.lastIndexOf("", '0', 0, 0));
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 626;
            int maxKeyCode = 14 - (KeyEvent.getMaxKeyCode() >> 16);
            byte b4 = $$a[7];
            byte b5 = b4;
            Object[] objArr5 = new Object[1];
            a(b4, b5, b5, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, modifierMetaStateMask, maxKeyCode, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cAlpha = (char) (Color.alpha(0) + 37567);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 626;
                int i6 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13;
                byte[] bArr2 = $$a;
                byte b6 = bArr2[5];
                byte b7 = bArr2[7];
                Object[] objArr6 = new Object[1];
                a(b6, b7, b7, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, iIndexOf, i6, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr7[2])[0];
            int i8 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i7};
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = (-1001994936) + (((-179554037) | iIdentityHashCode) * 376) + (((~((~iIdentityHashCode) | 855648254)) | (-1001646079)) * (-376)) + (((~(iIdentityHashCode | (-855648255))) | 968089866) * 376) + 615674682;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
            objArr = new Object[]{new int[]{i8}, new int[1], iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{8330, 62976, 36229, 41750, 31376, 4123, 10129, 64870, 38050, 43574, 16809, 6002, 11926, 50249, 39897, 45385, 18637, 7767, 13765, 52045, 58075, 47210, 20471, 25981, 15602, 53874}, View.MeasureSpec.getSize(0) + 54917, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{8328, 1333, 27599, 20888, 46626, 40146, 49821, 9991, 3523, 29592, 22569, 48859, 58508, 51493, 12229, 5511, 31284, 41182}, 9643 - View.MeasureSpec.getSize(0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i12 = TuitionPaymentFragmentbindingInflater1 + 1;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
                int i13 = i12 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{8321, 11153, 13995, 475, 3241, 5888, 25128, 27960, 30804, 17206, 20406, 23227, 42460, 45248, 48116, 34323}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 2843, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{8322, 10210, 11860, 14018, 15659, 1443, 3089, 4969, 7115, 25183, 27354, 28972, 31156, 16397, 18297, 20461}, 1902 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            c(new char[]{8409, 34395, 27943, 54517, 48094, 25248, 51315, 44814, 5754, 65008, 42207, 3065, 61810, 22623, 16172, 59045, 19852, 13567, 39463, 16705, 10362, 36773, 30354, 56746, 33654, 27153, 53547, 47277, 8084, 50862, 44073, 4889, 64114, 41471, 2195, 61389, 21806, 15379, 58189, 19193, 12741, 39107, 32301, 9492, 35857, 29695, 55966, 33221, 26490, 52766, 46409, 7397, 50075, 43722, 4151, 63306, 24138, 1470, 60573, 21406, 14693, 57420, 18255, 12002}, ExpandableListView.getPackedPositionType(0L) + 42709, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            c(new char[]{8328, 44833, 16345, 36828, 7799, 61065, 32395, 52593, 24022, 11662, 48245, 3280, 40074, 27510, 64471, 19418, 55913, 43651, 15067, 35177, 6530, 59867, 30783, 51328, 22657, 10092, 47063, 2011, 38508, 26253, 63192, 17766, 54706, 42370, 13416, 33979, 5331, 58169, 29672, 50132, 21089, 8941, 45699, 356, 37304, 25040, 61538, 16573, 53442, 24371, 12212, 49091, 3637, 40632, 28362, 64868, 19936, 56734, 44135, 15542, 35998, 7012, 60343, 31640}, 36779 - ExpandableListView.getPackedPositionType(0L), objArr13);
            String[] strArr2 = {str, (String) objArr13[0]};
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
            TuitionPaymentFragmentbindingInflater1 = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, 615674682};
                byte[] bArr3 = $$d;
                byte b8 = bArr3[9];
                Object[] objArr15 = new Object[1];
                d(b8, bArr3[48], b8, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b9 = bArr3[48];
                Object[] objArr16 = new Object[1];
                d(b9, bArr3[9], b9, objArr16);
                objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i16 = ((int[]) objArr[0])[0];
                int i17 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char threadPriority = (char) (37567 - ((Process.getThreadPriority(0) + 20) >> 6));
                        int iBlue = Color.blue(0) + 625;
                        int absoluteGravity = 14 - Gravity.getAbsoluteGravity(0, 0);
                        byte[] bArr4 = $$a;
                        byte b10 = bArr4[5];
                        byte b11 = bArr4[7];
                        Object[] objArr17 = new Object[1];
                        a(b10, b11, b11, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(threadPriority, iBlue, absoluteGravity, -973632554, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr18 = new Object[1];
                        c(new char[]{8330, 44676, 15501, 35482, 6272, 59015, 29833, 49858, 20620, 56977, 44239, 15027, 34974, 5781, 58513, 29313, 49302, 20153, 56469, 43671, 14492, 34453}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 36353, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        c(new char[]{8334, 38890, 20048, 1756, 64812, 46511, 27649, 9026, 39910, 21087, 2757, 49456, 47518, 28687, 10104}, KeyEvent.normalizeMetaState(0) + 46957, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 37567);
                            int iBlue2 = 625 - Color.blue(0);
                            int i18 = 15 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            byte b12 = $$a[7];
                            byte b13 = b12;
                            Object[] objArr20 = new Object[1];
                            a(b12, b13, b13, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout, iBlue2, i18, -976899241, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cMyPid = (char) ((Process.myPid() >> 22) + 37567);
                            int iAxisFromString = MotionEvent.axisFromString("") + 626;
                            int doubleTapTimeout = 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            byte[] bArr5 = $$a;
                            byte b14 = bArr5[7];
                            byte b15 = bArr5[5];
                            Object[] objArr21 = new Object[1];
                            a(b14, b15, b15, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyPid, iAxisFromString, doubleTapTimeout, -477065106, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i19 = TuitionPaymentFragmentbindingInflater1 + 3;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
                        int i20 = i19 % 2;
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
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 == null) {
                throw null;
            }
            for (String str2 : strArr3) {
                arrayList.add(str2);
            }
            throw null;
        }
        int i21 = ((int[]) objArr[1])[0];
        int i22 = ((int[]) objArr[2])[0];
        int i23 = ((int[]) objArr[0])[0];
        String[] strArr4 = (String[]) objArr[3];
        int[] iArr2 = {i22};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i24 = i21 + ((((~((-1616023214) | iIdentityHashCode2)) | 1815344374) * 262) - 1328522166) + (((~((~iIdentityHashCode2) | (-1616023214))) | 1815344374) * 262);
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        ((int[]) objArr[1])[0] = i26 ^ (i26 << 5);
        Object[] objArr22 = {new int[]{i23}, new int[1], iArr2, strArr4};
        return i2;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $11 + 33;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19471 - TextUtils.lastIndexOf("", '0', 0)), 2624 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 13 - TextUtils.indexOf("", ""), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                try {
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (KeyEvent.getMaxKeyCode() >> 16) + 481, (KeyEvent.getMaxKeyCode() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i6 = $11 + 37;
        $10 = i6 % 128;
        while (true) {
            int i7 = i6 % 2;
            if (getrealtimecapturelatency.b >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 39422), 481 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 37 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            i6 = $10 + 21;
            $11 = i6 % 128;
        }
    }

    static {
        b = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        CREATOR = new zzak();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        b = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RootTelemetryConfiguration(int i, boolean z, boolean z2, int i2, int i3) {
        this.zza = i;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = i2;
        this.zze = i3;
    }

    public int getBatchPeriodMillis() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 79;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.zzd;
        int i5 = i2 + 17;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean getMethodInvocationTelemetryEnabled() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzb;
        }
        throw null;
    }

    public boolean getMethodTimingTelemetryEnabled() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzc;
        }
        throw null;
    }

    public int getVersion() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 99;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.zza;
        int i5 = i3 + 89;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -5602111667525219856L;
    }
}
