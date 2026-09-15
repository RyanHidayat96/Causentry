package com.google.android.gms.internal.fido;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.mlkit.common.MlKitException;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzat extends zzaq implements List, RandomAccess {
    private static int TuitionPaymentFragmentbindingInflater1;
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f774a;
    private static int b;
    private static final zzba zza;
    public static final /* synthetic */ int zzd = 0;
    private static final byte[] $$c = {81, -102, -70, -91};
    private static final int $$f = 216;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {38, 31, -70, -1, 9, 26, -23, 40, 11, 16, -28, 35, 20, 18, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
    private static final byte[] $$a = {0, -94, -62, -97, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 197;
    private static int g = 0;
    private static int asInterface = 1;
    private static int asBinder = 0;

    static {
        f774a = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        zza = new zzar(zzaw.zza, 0);
        int i = asBinder + 57;
        f774a = i % 128;
        if (i % 2 == 0) {
            int i2 = 64 / 0;
        }
    }

    zzat() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r0 = r5 + 1
            int r6 = r6 + 4
            byte[] r1 = com.google.android.gms.internal.fido.zzat.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r5
            goto L27
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            r3 = r1[r6]
        L27:
            int r7 = r7 + r3
            int r7 = r7 + (-10)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzat.c(byte, int, byte, java.lang.Object[]):void");
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
    private static void e(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 42
            int r0 = 53 - r5
            int r6 = r6 * 19
            int r6 = r6 + 84
            int r7 = r7 * 10
            int r7 = r7 + 4
            byte[] r1 = com.google.android.gms.internal.fido.zzat.$$d
            byte[] r0 = new byte[r0]
            int r5 = 52 - r5
            r2 = 0
            if (r1 != 0) goto L18
            r4 = r5
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2a:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            int r7 = r7 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzat.e(short, int, byte, java.lang.Object[]):void");
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException();
    }

    static zzat zzg(Object[] objArr, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 69;
        g = i4 % 128;
        int i5 = i4 % 2;
        if (i != 0) {
            return new zzaw(objArr, i);
        }
        int i6 = i3 + 23;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            return zzaw.zza;
        }
        zzat zzatVar = zzaw.zza;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01bf A[PHI: r0
  0x01bf: PHI (r0v9 int) = (r0v8 int), (r0v39 int) binds: [B:49:0x01bd, B:46:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01c1 A[PHI: r0
  0x01c1: PHI (r0v36 int) = (r0v8 int), (r0v39 int) binds: [B:49:0x01bd, B:46:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
    private static void d(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        int i6;
        int length;
        byte[] bArr;
        int i7;
        int i8 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) KeyEvent.keyCodeFromString(""), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2266, KeyEvent.getDeadChar(0, 0) + 33, 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                z = true;
            } else {
                int i9 = $11 + 27;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                z = false;
            }
            if (z) {
                byte[] bArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr2 != null) {
                    int i11 = $10 + 3;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i7 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i7 = 0;
                    }
                    while (i7 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b5 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.getDefaultSize(0, 0), MotionEvent.axisFromString("") + 3359, 18 - View.MeasureSpec.getMode(0), -1054011043, false, $$g(b5, b5, (byte) $$c.length), new Class[]{Integer.TYPE});
                        }
                        bArr[i7] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i7++;
                    }
                    int i12 = $10 + 39;
                    $11 = i12 % 128;
                    i6 = 2;
                    int i13 = i12 % 2;
                    bArr2 = bArr;
                } else {
                    i6 = 2;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    try {
                        Object[] objArr4 = new Object[i6];
                        objArr4[1] = Integer.valueOf(TuitionPaymentFragmentbindingInflater1);
                        objArr4[0] = Integer.valueOf(i3);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 2267 - Color.green(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 34, 1387473586, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i14 = $11 + 71;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    i4 = ((i3 % iIntValue) + 3) / ((int) (((long) TuitionPaymentFragmentbindingInflater1) & 3046761265686732006L));
                    if (z) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                } else {
                    i4 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L));
                    if (z) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i4 + i5;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(b), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 55904), 2854 - ((byte) KeyEvent.getModifierMetaStateMask()), 13 - TextUtils.getTrimmedLength(""), -1529949196, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i15 = 0; i15 < length2; i15++) {
                        bArr5[i15] = (byte) (((long) bArr4[i15]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i16]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i17]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x027b  */
    /* JADX WARN: Type inference failed for: r1v29, types: [boolean, int] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 31533);
            int i2 = 921 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i3 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 28;
            byte[] bArr = $$a;
            byte b2 = bArr[0];
            Object[] objArr3 = new Object[1];
            c(b2, bArr[7], b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength, i2, i3, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        d(32554584 - TextUtils.getCapsMode("", 0, 0), TextUtils.getOffsetBefore("", 0) - 16, (short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (65 - KeyEvent.normalizeMetaState(0)), (-1194759303) - TextUtils.lastIndexOf("", '0', 0, 0), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        d((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 32554588, (-23) - (Process.myPid() >> 22), (short) Color.red(0), (byte) (58 - KeyEvent.normalizeMetaState(0)), TextUtils.lastIndexOf("", '0', 0) - 1194759280, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char mode = (char) (31533 - View.MeasureSpec.getMode(0));
            int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0');
            int iIndexOf = 28 - TextUtils.indexOf("", "", 0);
            byte[] bArr2 = $$a;
            Object[] objArr6 = new Object[1];
            c((byte) 52, bArr2[7], bArr2[37], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode, iLastIndexOf, iIndexOf, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char offsetBefore = (char) (31533 - TextUtils.getOffsetBefore("", 0));
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 921;
                int gidForName = 27 - Process.getGidForName("");
                Object[] objArr7 = new Object[1];
                c((byte) 37, (byte) 51, $$a[37], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetBefore, iNormalizeMetaState, gidForName, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = (((2139271263 + ((~((~iIdentityHashCode) | 1702742011)) * (-116))) + ((611108770 | iIdentityHashCode) * 116)) + (((~(iIdentityHashCode | (-1162970874))) | 71337632) * 116)) - 2025049591;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            d(32554583 - TextUtils.indexOf((CharSequence) "", '0', 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 12, (short) (TextUtils.lastIndexOf("", '0') + 1), (byte) ((-91) - TextUtils.getOffsetAfter("", 0)), (-1194759267) - (Process.myPid() >> 22), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            d(32554586 - Color.alpha(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 20, (short) TextUtils.indexOf("", ""), (byte) ((-63) - TextUtils.getTrimmedLength("")), (-1194759243) - MotionEvent.axisFromString(""), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i7 = asInterface + 125;
                int i8 = i7 % 128;
                g = i8;
                int i9 = i7 % 2;
                if (applicationContext instanceof ContextWrapper) {
                    int i10 = i8 + 73;
                    asInterface = i10 % 128;
                    int i11 = i10 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr11 = new Object[1];
            d(View.resolveSizeAndState(0, 0, 0) + 32554593, (-22) - Color.blue(0), (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) - 91), (-1194759224) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            d((KeyEvent.getMaxKeyCode() >> 16) + 32554592, (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 22, (short) TextUtils.indexOf("", ""), (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 27), Color.blue(0) - 1194759210, objArr12);
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, -2025049591};
                byte[] bArr3 = $$d;
                byte b3 = (byte) (-bArr3[3]);
                Object[] objArr14 = new Object[1];
                e(b3, b3, bArr3[17], objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b4 = bArr3[17];
                Object[] objArr15 = new Object[1];
                e(b4, b4, (byte) (-bArr3[3]), objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cGreen = (char) (31533 - Color.green(0));
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 922;
                    int iResolveSize = 28 - View.resolveSize(0, 0);
                    Object[] objArr17 = new Object[1];
                    c((byte) 37, (byte) 51, $$a[37], objArr17);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cGreen, iIndexOf2, iResolveSize, -1142834547, false, (String) objArr17[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                try {
                    Object[] objArr18 = new Object[1];
                    d(View.resolveSize(0, 0) + 32554584, (-16) - Color.red(0), (short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (TextUtils.indexOf("", "", 0, 0) + 65), Gravity.getAbsoluteGravity(0, 0) - 1194759302, objArr18);
                    Class<?> cls5 = Class.forName((String) objArr18[0]);
                    Object[] objArr19 = new Object[1];
                    d(32554589 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), View.MeasureSpec.getMode(0) - 23, (short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (TextUtils.lastIndexOf("", '0', 0) + 59), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 1194759281, objArr19);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                        int iIndexOf3 = TextUtils.indexOf("", "") + 921;
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 28;
                        byte[] bArr4 = $$a;
                        Object[] objArr20 = new Object[1];
                        c((byte) 52, bArr4[7], bArr4[37], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iIndexOf3, packedPositionType, -778300370, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cMyPid = (char) (31533 - (Process.myPid() >> 22));
                        int iMyPid = 921 - (Process.myPid() >> 22);
                        int doubleTapTimeout = 28 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte[] bArr5 = $$a;
                        byte b5 = bArr5[0];
                        Object[] objArr21 = new Object[1];
                        c(b5, bArr5[7], b5, objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyPid, iMyPid, doubleTapTimeout, -1048449946, false, (String) objArr21[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr16;
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
            int i14 = g + 65;
            asInterface = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i17 = ~iFreeMemory;
            int i18 = i16 + 149746270 + (((~((-1059137133) | i17)) | 714942511) * 519) + (((~(i17 | (-354420289))) | (~(1069362799 | iFreeMemory))) * (-519)) + (((~(iFreeMemory | 714942511)) | 1059137132) * 519);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr2[0])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    int i21 = g + 113;
                    asInterface = i21 % 128;
                    int i22 = i21 % 2;
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i13];
            int i23 = i13 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i23) % 2) - 1], 1).show();
            int i24 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i25 = ~Process.myUid();
            int i26 = i24 + (((1833208815 + (((~(1568534103 | i25)) | 205545540) * (-828))) + ((i25 | 1568534103) * (-828))) - 1666114720);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr2[0])[0] = i28 ^ (i28 << 5);
        }
        if (indexOf(obj) < 0) {
            return false;
        }
        int i29 = ((int[]) objArr2[0])[0];
        int i30 = ((i29 * i29) - (~(-(742352811 * i29)))) - 1;
        int i31 = -(i29 * 504640439);
        int i32 = (i30 & i31) + (i31 | i30);
        int i33 = (i32 & (-1309215647)) + ((-1309215647) | i32);
        int i34 = (i33 - (~((((i33 >> 27) - 63) / 32) + 1))) - 1;
        int i35 = i33 >> 19;
        int i36 = ((i35 ^ (-16383)) + ((i35 & (-16383)) << 1)) / 8192;
        int i37 = -(i34 ^ ((i36 & 1) + (i36 | 1)));
        int i38 = ((i37 | 5) << 1) - (i37 ^ 5);
        int i39 = i38 >> 18;
        int i40 = ((i39 & (-32767)) + (i39 | (-32767))) / 16384;
        return 9540 / (((-((((i40 | 1) << 1) - (i40 ^ 1)) + 1)) & i38) * 1908);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size;
        int iHashCode;
        int i = 2 % 2;
        int i2 = g + 47;
        asInterface = i2 % 128;
        int i3 = 1;
        if (i2 % 2 == 0) {
            size = size();
            iHashCode = 0;
        } else {
            size = size();
            iHashCode = 1;
            i3 = 0;
        }
        while (i3 < size) {
            iHashCode = (iHashCode * 31) + get(i3).hashCode();
            i3++;
        }
        int i4 = asInterface + 93;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = 2 % 2;
        if (obj == null) {
            int i2 = asInterface + 115;
            int i3 = i2 % 128;
            g = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 79;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return -1;
            }
            throw null;
        }
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            if (obj.equals(get(i6))) {
                int i7 = asInterface + 51;
                g = i7 % 128;
                int i8 = i7 % 2;
                return i6;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.fido.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        int i = 2 % 2;
        int i2 = g + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        zzba zzbaVarZzh = zzh(0);
        int i4 = g + 91;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zzbaVarZzh;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = 2 % 2;
        if (obj == null) {
            int i2 = g + 25;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return -1;
        }
        int size = size() - 1;
        while (size >= 0) {
            int i4 = asInterface + 73;
            g = i4 % 128;
            if (i4 % 2 != 0) {
                obj.equals(get(size));
                throw null;
            }
            if (obj.equals(get(size))) {
                return size;
            }
            size--;
            int i5 = g + 61;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        g = i2 % 128;
        int i3 = i2 % 2;
        zzba zzbaVarZzh = zzh(0);
        int i4 = g + 115;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return zzbaVarZzh;
        }
        throw null;
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ List subList(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = g + 47;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        zzat zzatVarZzf = zzf(i, i2);
        int i6 = asInterface + 65;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            return zzatVarZzf;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    int zza(Object[] objArr, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 95;
        g = i3 % 128;
        int i4 = i3 % 2;
        int size = size();
        int i5 = 0;
        while (i5 < size) {
            objArr[i5] = get(i5);
            i5++;
            int i6 = g + 61;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
        }
        return size;
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    /* JADX INFO: renamed from: zzd */
    public final zzaz iterator() {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        g = i2 % 128;
        int i3 = i2 % 2;
        zzba zzbaVarZzh = zzh(0);
        int i4 = g + 1;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zzbaVarZzh;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 25;
        g = i3 % 128;
        int i4 = i3 % 2;
        zzba zzbaVarZzh = zzh(i);
        int i5 = asInterface + 15;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 57 / 0;
        }
        return zzbaVarZzh;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r5 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        return com.google.android.gms.internal.fido.zzaw.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r1 = new com.google.android.gms.internal.fido.zzas(r3, r4, r5);
        r4 = com.google.android.gms.internal.fido.zzat.asInterface + 11;
        com.google.android.gms.internal.fido.zzat.g = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r5 == size()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r5 == size()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r4 = com.google.android.gms.internal.fido.zzat.asInterface + 69;
        com.google.android.gms.internal.fido.zzat.g = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.fido.zzat zzf(int r4, int r5) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.internal.fido.zzat.g
            int r1 = r1 + 109
            int r2 = r1 % 128
            com.google.android.gms.internal.fido.zzat.asInterface = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1d
            int r1 = r3.size()
            com.google.android.gms.internal.fido.zzam.zze(r4, r5, r1)
            int r5 = r5 * r4
            int r1 = r3.size()
            if (r5 != r1) goto L39
            goto L2b
        L1d:
            int r1 = r3.size()
            com.google.android.gms.internal.fido.zzam.zze(r4, r5, r1)
            int r5 = r5 - r4
            int r1 = r3.size()
            if (r5 != r1) goto L39
        L2b:
            int r4 = com.google.android.gms.internal.fido.zzat.asInterface
            int r4 = r4 + 69
            int r5 = r4 % 128
            com.google.android.gms.internal.fido.zzat.g = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L37
            return r3
        L37:
            r4 = 0
            throw r4
        L39:
            if (r5 != 0) goto L3e
            com.google.android.gms.internal.fido.zzat r4 = com.google.android.gms.internal.fido.zzaw.zza
            return r4
        L3e:
            com.google.android.gms.internal.fido.zzas r1 = new com.google.android.gms.internal.fido.zzas
            r1.<init>(r3, r4, r5)
            int r4 = com.google.android.gms.internal.fido.zzat.asInterface
            int r4 = r4 + 11
            int r5 = r4 % 128
            com.google.android.gms.internal.fido.zzat.g = r5
            int r4 = r4 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzat.zzf(int, int):com.google.android.gms.internal.fido.zzat");
    }

    public final zzba zzh(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 5;
        g = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            zzam.zzb(i, size(), FirebaseAnalytics.Param.INDEX);
            isEmpty();
            obj.hashCode();
            throw null;
        }
        zzam.zzb(i, size(), FirebaseAnalytics.Param.INDEX);
        if (!isEmpty()) {
            return new zzar(this, i);
        }
        int i4 = g + 107;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return zza;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r7 instanceof java.util.List) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 11;
        com.google.android.gms.internal.fido.zzat.g = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r7 = (java.util.List) r7;
        r1 = size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r1 == r7.size()) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r7 = com.google.android.gms.internal.fido.zzat.asInterface + 51;
        com.google.android.gms.internal.fido.zzat.g = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if ((r7 instanceof java.util.RandomAccess) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (r0 >= r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (com.google.android.gms.internal.fido.zzal.zza(get(r0), r7.get(r0)) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        r1 = iterator();
        r7 = r7.iterator();
        r2 = com.google.android.gms.internal.fido.zzat.asInterface + 79;
        com.google.android.gms.internal.fido.zzat.g = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r1.hasNext() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        r2 = com.google.android.gms.internal.fido.zzat.g + 15;
        com.google.android.gms.internal.fido.zzat.asInterface = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if ((!r7.hasNext()) == true) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if ((!com.google.android.gms.internal.fido.zzal.zza(r1.next(), r7.next())) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        r7 = com.google.android.gms.internal.fido.zzat.g + 111;
        com.google.android.gms.internal.fido.zzat.asInterface = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
    
        r7 = com.google.android.gms.internal.fido.zzat.g;
        r1 = r7 + 39;
        com.google.android.gms.internal.fido.zzat.asInterface = r1 % 128;
        r1 = r1 % 2;
        r7 = r7 + 39;
        com.google.android.gms.internal.fido.zzat.asInterface = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
    
        if ((r7 % 2) == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
    
        if (r7.hasNext() != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r7 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r7 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    @Override // java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.internal.fido.zzat.asInterface
            int r2 = r1 + 125
            int r3 = r2 % 128
            com.google.android.gms.internal.fido.zzat.g = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L16
            r2 = 15
            int r2 = r2 / r4
            if (r7 != r6) goto L19
            goto L18
        L16:
            if (r7 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r2 = r7 instanceof java.util.List
            if (r2 != 0) goto L25
            int r1 = r1 + 11
            int r7 = r1 % 128
            com.google.android.gms.internal.fido.zzat.g = r7
            int r1 = r1 % r0
            return r4
        L25:
            java.util.List r7 = (java.util.List) r7
            int r1 = r6.size()
            int r2 = r7.size()
            if (r1 == r2) goto L3b
            int r7 = com.google.android.gms.internal.fido.zzat.asInterface
            int r7 = r7 + 51
            int r1 = r7 % 128
            com.google.android.gms.internal.fido.zzat.g = r1
            int r7 = r7 % r0
            return r4
        L3b:
            boolean r2 = r7 instanceof java.util.RandomAccess
            if (r2 == 0) goto L55
            r0 = r4
        L40:
            if (r0 >= r1) goto L54
            java.lang.Object r2 = r6.get(r0)
            java.lang.Object r5 = r7.get(r0)
            boolean r2 = com.google.android.gms.internal.fido.zzal.zza(r2, r5)
            if (r2 != 0) goto L51
            return r4
        L51:
            int r0 = r0 + 1
            goto L40
        L54:
            return r3
        L55:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
            int r2 = com.google.android.gms.internal.fido.zzat.asInterface
            int r2 = r2 + 79
            int r5 = r2 % 128
            com.google.android.gms.internal.fido.zzat.g = r5
            int r2 = r2 % r0
        L66:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Laa
            int r2 = com.google.android.gms.internal.fido.zzat.g
            int r2 = r2 + 15
            int r5 = r2 % 128
            com.google.android.gms.internal.fido.zzat.asInterface = r5
            int r2 = r2 % r0
            boolean r2 = r7.hasNext()
            r2 = r2 ^ r3
            if (r2 == r3) goto L95
            java.lang.Object r2 = r1.next()
            java.lang.Object r5 = r7.next()
            boolean r2 = com.google.android.gms.internal.fido.zzal.zza(r2, r5)
            r2 = r2 ^ r3
            if (r2 == 0) goto L66
            int r7 = com.google.android.gms.internal.fido.zzat.g
            int r7 = r7 + 111
            int r1 = r7 % 128
            com.google.android.gms.internal.fido.zzat.asInterface = r1
            int r7 = r7 % r0
            return r4
        L95:
            int r7 = com.google.android.gms.internal.fido.zzat.g
            int r1 = r7 + 39
            int r2 = r1 % 128
            com.google.android.gms.internal.fido.zzat.asInterface = r2
            int r1 = r1 % r0
            int r7 = r7 + 39
            int r1 = r7 % 128
            com.google.android.gms.internal.fido.zzat.asInterface = r1
            int r7 = r7 % r0
            if (r7 == 0) goto La8
            return r4
        La8:
            r7 = 0
            throw r7
        Laa:
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto Lb1
            return r3
        Lb1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzat.equals(java.lang.Object):boolean");
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentbindingInflater1 = -878983072;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1934795584;
        b = 1923227375;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new byte[]{-81, 83, -92, -114, 113, -81, 86, -90, 93, -127, -126, 28, -93, -26, 109, 92, 93, 90, -87, 81, -86, 36, -40, 41, -44, -41, 32, -49, 50, 35, 46, -33, -45, 41, -37, 64, -65, -80, 73, 87, -104, 70, 72, -80, 78, -74, 82, 97, 80, -3, 67, 76, 112, -119, -72, -71, -66, 77, -75, 78, -40, 33, -46, 52, -39, -35, -38, -37, 39, 8, -22, 33, 46, -44, 39, -38, 53, 75, -78, 66, -71, 101, 102, -124, -70, 78, -74, 125, -114, -88, 86, -76, -4, 8, -47, 38, 8, -17, -28, 50, -8, -10, 8, -5, -12, -4, 6, -26, -26, -26, -26, -26, -26};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r5, byte r6, short r7) {
        /*
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r7 = r7 + 117
            int r5 = r5 * 3
            int r0 = r5 + 1
            byte[] r1 = com.google.android.gms.internal.fido.zzat.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L20:
            int r3 = r3 + 1
            r4 = r1[r6]
        L24:
            int r4 = -r4
            int r7 = r7 + r4
            int r6 = r6 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzat.$$g(short, byte, short):java.lang.String");
    }
}
