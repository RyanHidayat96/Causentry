package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public final class zzap implements zzao {
    private static short[] TuitionPaymentFragmentbindingInflater1;
    private final String zza;
    private final ArrayList zzb;
    private static final byte[] $$c = {25, -93, -120, -48};
    private static final int $$d = 254;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {94, -1, 37, -59, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 162;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int b = 904036111;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1934795604;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -257637332;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {122, 110, 113, 91, -116, 122, 99, 115, 104, 92, 95, -87, 126, 51, -72, 105, 104, 119, 68, 108, 71, -9, -5, -24, -57, -62, -13, -54, -31, -2, -19, -6, -50, -24, -58, -26, -26};

    public zzap(String str, List list) {
        this.zza = str;
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        arrayList.addAll(list);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r0 = com.google.android.gms.internal.measurement.zzap.$$a
            int r1 = 53 - r7
            int r6 = r6 * 52
            int r6 = 55 - r6
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2e:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzap.a(int, byte, int, java.lang.Object[]):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        int i = 2 % 2;
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzcA(String str, zzg zzgVar, List list) {
        int i = 2 % 2;
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        int i = 2 % 2;
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        int i = 2 % 2;
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 75;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zza;
        if (str != null) {
            iHashCode = str.hashCode();
        } else {
            int i5 = i2 + 95;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 2;
            }
            iHashCode = 0;
        }
        return (iHashCode * 31) + this.zzb.hashCode();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    public final boolean equals(Object obj) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int offsetAfter = 651 - TextUtils.getOffsetAfter("", 0);
            int i2 = 44 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            byte b3 = bArr[7];
            Object[] objArr3 = new Object[1];
            a(b2, b3, b3, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, offsetAfter, i2, -459846511, false, (String) objArr3[0], null);
        }
        Object obj2 = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c((-2081003625) - (Process.myTid() >> 22), ExpandableListView.getPackedPositionType(0L) - 52, (short) (Color.green(0) + 108), (byte) TextUtils.getOffsetAfter("", 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1185995799, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 2081003620, (-59) - TextUtils.getTrimmedLength(""), (short) (Process.getGidForName("") - 24), (byte) TextUtils.getOffsetBefore("", 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 1185995820, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int iIndexOf = 650 - TextUtils.indexOf((CharSequence) "", '0', 0);
            int iLastIndexOf = 43 - TextUtils.lastIndexOf("", '0', 0, 0);
            byte[] bArr2 = $$a;
            byte b4 = bArr2[7];
            Object[] objArr6 = new Object[1];
            a(b4, (byte) (b4 | 52), bArr2[5], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iIndexOf, iLastIndexOf, -873460649, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                int iIndexOf2 = 650 - TextUtils.indexOf((CharSequence) "", '0', 0);
                int iIndexOf3 = TextUtils.indexOf("", "", 0, 0) + 44;
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr7 = new Object[1];
                a(b6, (byte) (b6 | 15), b5, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAxisFromString, iIndexOf2, iIndexOf3, -1595579076, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i3 = ((int[]) objArr8[2])[0];
            int i4 = ((int[]) objArr8[0])[0];
            int iNextInt = new Random().nextInt();
            int i5 = ((((~((-639145099) | iNextInt)) | 603984000) * (-566)) - 1739008871) + ((~(iNextInt | (-35161099))) * 566) + 1997812421;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[3])[0] = i7 ^ (i7 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), 1609 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr9 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 1997812421, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int pressedStateDuration = 651 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 45;
                    byte[] bArr3 = $$a;
                    byte b7 = bArr3[7];
                    Object[] objArr10 = new Object[1];
                    a(b7, (byte) (b7 | 52), bArr3[5], objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity, pressedStateDuration, iLastIndexOf2, 2075921419, false, (String) objArr10[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.combineMeasuredStates(0, 0), 695 - Color.blue(0), 98 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63407 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 792, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 83), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char defaultSize = (char) View.getDefaultSize(0, 0);
                    int i8 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651;
                    int iMakeMeasureSpec = 44 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte b8 = $$a[7];
                    byte b9 = b8;
                    Object[] objArr11 = new Object[1];
                    a(b9, (byte) (b9 | 15), b8, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(defaultSize, i8, iMakeMeasureSpec, -1595579076, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr12 = new Object[1];
                    c((-2081003625) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) - 52, (short) (107 - MotionEvent.axisFromString("")), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1185995799 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(KeyEvent.normalizeMetaState(0) - 2081003621, (-59) - Color.blue(0), (short) ((ViewConfiguration.getScrollBarSize() >> 8) - 25), (byte) Color.argb(0, 0, 0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1185995821, objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int iResolveOpacity = 651 - Drawable.resolveOpacity(0, 0);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 44;
                        byte[] bArr4 = $$a;
                        byte b10 = bArr4[7];
                        Object[] objArr14 = new Object[1];
                        a(b10, (byte) (b10 | 52), bArr4[5], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollBarSize, iResolveOpacity, packedPositionGroup, -873460649, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int tapTimeout = 651 - (ViewConfiguration.getTapTimeout() >> 16);
                        int iRgb = Color.rgb(0, 0, 0) + 16777260;
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[5];
                        byte b12 = bArr5[7];
                        Object[] objArr15 = new Object[1];
                        a(b11, b12, b12, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(doubleTapTimeout, tapTimeout, iRgb, -459846511, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i9 = ((int[]) objArr[0])[0];
        int i10 = ((int[]) objArr[2])[0];
        if (i10 == i9) {
            objArr2 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i11 = ((int[]) objArr[3])[0];
            int i12 = ((int[]) objArr[2])[0];
            int i13 = ((int[]) objArr[0])[0];
            int i14 = ~new Random().nextInt(1324437365);
            int i15 = i11 + 1517238457 + (((~(i14 | 219027267)) | 13740200) * (-160)) + (((~(i14 | 215596457)) | 219027267) * 160);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr2[3])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                int i18 = asBinder + 3;
                asInterface = i18 % 128;
                int i19 = 2;
                int i20 = i18 % 2;
                int i21 = 0;
                while (i21 < strArr.length) {
                    int i22 = asBinder + 39;
                    asInterface = i22 % 128;
                    int i23 = i22 % i19;
                    arrayList.add(strArr[i21]);
                    i21++;
                    i19 = 2;
                }
            }
            int[] iArr = new int[i10];
            int i24 = i10 - 1;
            iArr[i24] = 1;
            Toast.makeText((Context) null, iArr[((i10 * i24) % 2) - 1], 1).show();
            objArr2 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i25 = ((int[]) objArr[3])[0];
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[0])[0];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i28 = ~elapsedCpuTime;
            int i29 = (-1120856751) + (((~((-4489633) | i28)) | (~((-784023128) | elapsedCpuTime))) * 520);
            int i30 = ~(784023127 | i28);
            int i31 = ~(elapsedCpuTime | 787453937);
            int i32 = i25 + i29 + ((i30 | i31) * (-1040)) + ((i31 | (~(i28 | (-787453938))) | (-788512760)) * 520);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr2[3])[0] = i34 ^ (i34 << 5);
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzap)) {
            return false;
        }
        zzap zzapVar = (zzap) obj;
        String str = this.zza;
        if (str == null ? zzapVar.zza == null : str.equals(zzapVar.zza)) {
            boolean zEquals = this.zzb.equals(zzapVar.zzb);
            int i35 = asInterface + 27;
            asBinder = i35 % 128;
            int i36 = i35 % 2;
            return zEquals;
        }
        int i37 = ((int[]) objArr2[3])[0];
        int i38 = i37 * i37;
        int i39 = -(82786920 * i37);
        int i40 = (i38 & i39) + (i38 | i39);
        int i41 = -(i37 * 1707644214);
        int i42 = (i40 & i41) + (i41 | i40);
        int i43 = ((i42 | 1427192161) << 1) - (1427192161 ^ i42);
        int i44 = i43 >> 29;
        int i45 = ((i44 & (-15)) + (i44 | (-15))) / 8;
        int i46 = (i45 & 1) + (i45 | 1);
        int i47 = (i43 & i46) + (i46 | i43);
        int i48 = i43 >> 24;
        int i49 = ((i48 & (-511)) + (i48 | (-511))) / 256;
        int i50 = -((((i49 | 1) << 1) - (i49 ^ 1)) ^ i47);
        int i51 = ((i50 | 8) << 1) - (i50 ^ 8);
        int i52 = i51 >> 24;
        int i53 = (((i52 | (-511)) << 1) - (i52 ^ (-511))) / 256;
        int i54 = ((i53 | 1) << 1) - (i53 ^ 1);
        ?? r10 = 0 / (((-((i54 & 1) + (i54 | 1))) & i51) * 1610);
        int i55 = asBinder + 57;
        asInterface = i55 % 128;
        if (i55 % 2 != 0) {
            return r10;
        }
        obj2.hashCode();
        throw null;
    }

    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char mode = (char) View.MeasureSpec.getMode(0);
                int deadChar = KeyEvent.getDeadChar(0, 0) + 2267;
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 34;
                byte length = (byte) $$c.length;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mode, deadChar, iLastIndexOf, 1387473586, false, $$e((byte) 0, length, (byte) (length - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 != 0) {
                int i7 = $11 + 69;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr != null) {
                    int length2 = bArr.length;
                    byte[] bArr2 = new byte[length2];
                    int i9 = 0;
                    while (i9 < length2) {
                        int i10 = $11 + 97;
                        $10 = i10 % 128;
                        if (i10 % i4 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), 3358 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 18 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1054011043, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i9 /= 0;
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i9])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 3358 - KeyEvent.normalizeMetaState(0), 'B' - AndroidCharacter.getMirror('0'), -1054011043, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                            i9++;
                        }
                        i4 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int iMakeMeasureSpec = 2267 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33;
                        byte length3 = (byte) $$c.length;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(minimumFlingVelocity, iMakeMeasureSpec, maximumFlingVelocity, 1387473586, false, $$e((byte) 0, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentbindingInflater1[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) b) ^ 3046761265686732006L)) + i6;
                Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (55904 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 2855 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 13 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1529949196, false, $$e(b7, b8, (byte) (b8 - 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr4 != null) {
                    int length4 = bArr4.length;
                    byte[] bArr5 = new byte[length4];
                    for (int i11 = 0; i11 < length4; i11++) {
                        bArr5[i11] = (byte) (((long) bArr4[i11]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i12 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i12 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i12]) ^ 3046761265686732006L)) + s)) ^ b2));
                        int i13 = $11 + 89;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                    } else {
                        short[] sArr = TuitionPaymentFragmentbindingInflater1;
                        int i15 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i15 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i15]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    int i16 = $11 + 93;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final String zzb() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 91;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zza;
        int i5 = i2 + 1;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final ArrayList zzg() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 41;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        ArrayList arrayList = this.zzb;
        int i5 = i2 + 109;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 90 / 0;
        }
        return this;
    }

    private static String $$e(byte b2, byte b3, int i) {
        int i2 = 121 - b3;
        int i3 = b2 * 4;
        byte[] bArr = $$c;
        int i4 = 4 - (i * 4);
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 += i5;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i4];
            i4++;
        }
    }
}
