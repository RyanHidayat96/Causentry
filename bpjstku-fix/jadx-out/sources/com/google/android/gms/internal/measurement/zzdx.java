package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
final class zzdx extends zzeq {
    final /* synthetic */ zzco zza;
    final /* synthetic */ zzfb zzb;
    private static final byte[] $$c = {21, ByteCompanionObject.MAX_VALUE, 49, -115};
    private static final int $$f = 68;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {63, 56, -36, -117, 14, 0, -61, 59, 10, 2, -6, 7, -5, -53, 58, 5, 11, -11, -1, 1, 20, -12, -53, 55, 17, -15, 20, -9, 6, 15, -3, -9, -4, 18, -67, Base64.padSymbol, 7, 8, -13, 15, -2, -11, 13, -60, 66, -7, 17, 5, -6, 5, -5, -59, 28, 46, 2, -2, -39, 32, 17, -32, 21, 14, 6, -14, 16, 3};
    private static final int $$e = 168;
    private static final byte[] $$a = {59, -124, -78, 46, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 228;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int b = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {60062, 60054, 60043, 60055, 59749, 59744, 60052, 60047, 60046, 60050, 59747, 60053, 60060, 59746, 60040, 60083, 60056, 60117, 60063, 60051, 59751, 60045, 59750, 60048, 60090, 60072, 59745, 60079, 60041, 60073, 60058, 60034, 60049, 59748, 60088, 59753};
    private static char TuitionPaymentFragmentbindingInflater1 = 57191;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdx(zzfb zzfbVar, zzco zzcoVar) {
        super(zzfbVar, true);
        this.zza = zzcoVar;
        Objects.requireNonNull(zzfbVar);
        this.zzb = zzfbVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 1
            int r9 = r9 * 52
            int r9 = r9 + 4
            byte[] r0 = com.google.android.gms.internal.measurement.zzdx.$$a
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2b
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r3 = r3 + 1
            int r8 = -r8
            int r9 = r9 + r8
            int r8 = r9 + (-10)
            r9 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzdx.a(int, short, short, java.lang.Object[]):void");
    }

    private static void d(int i, int i2, int i3, Object[] objArr) {
        int i4 = 66 - (i3 * 62);
        int i5 = 99 - i2;
        byte[] bArr = $$d;
        int i6 = i * 62;
        byte[] bArr2 = new byte[63 - i6];
        int i7 = 62 - i6;
        int i8 = -1;
        if (bArr == null) {
            i5 = (i5 + i7) - 2;
            i4++;
        }
        while (true) {
            i8++;
            bArr2[i8] = (byte) i5;
            if (i8 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i5 = (i5 + bArr[i4]) - 2;
                i4++;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    final void zza() throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        b = i2 % 128;
        int i3 = i2 % 2;
        ((zzcr) Preconditions.checkNotNull(this.zzb.zzQ())).getCachedAppInstanceId(this.zza);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x023b  */
    @Override // com.google.android.gms.internal.measurement.zzeq
    protected final void zzb() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 31534);
            int windowTouchSlop = 921 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            int gidForName = 27 - Process.getGidForName("");
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[7], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, windowTouchSlop, gidForName, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{'#', 6, 22, 24, 7, '\n', 23, '\f', '\b', '\f', '\r', 29, ' ', '\r', 6, 1, 4, 31, 0, '\t', 17, 22}, (byte) (93 - KeyEvent.keyCodeFromString("")), 22 - Color.green(0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{1, 4, ' ', 0, '\f', 2, 23, 24, 6, 0, 1, '\t', 7, 3, 13925}, (byte) (102 - TextUtils.indexOf("", "")), 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (31534 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int size = 921 - View.MeasureSpec.getSize(0);
            int iGreen = Color.green(0) + 28;
            byte b3 = $$a[80];
            Object[] objArr5 = new Object[1];
            a((byte) 52, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, size, iGreen, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
            b = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 31533);
                int i6 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 921;
                int packedPositionType = 28 - ExpandableListView.getPackedPositionType(0L);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) (bArr2[17] + 1), bArr2[80], bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, i6, packedPositionType, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr7[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i7}, (String[]) objArr7[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i8 = ~startElapsedRealtime;
            int i9 = (-1128424400) + (((~((-1650963430) | i8)) | 123116214) * 226) + (((~(i8 | (-1612783938))) | (~((-123116215) | startElapsedRealtime)) | 84936722) * (-113)) + ((~(startElapsedRealtime | (-1650963430))) * 113) + 1344928149;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{'#', 6, 22, 24, 7, '\n', 23, '\f', ' ', 0, 5, 14, 28, '\f', '\b', '\n', 27, 15, '\r', 1, 25, 21, 24, 4, 0, 24}, (byte) (ImageFormat.getBitsPerPixel(0) + 53), 25 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{14, '\n', 13869, 13869, 5, 6, 6, 25, 13871, 13871, '\t', 15, '\f', Typography.quote, '\b', '\n', 7, 6}, (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 70), 19 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
                    b = i12 % 128;
                    int i13 = i12 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{'!', 31, 18, '!', 15, 5, '#', 6, '\r', '\f', 31, 1, '\r', '\b', 1, 2}, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 49), 16 - (ViewConfiguration.getEdgeSlop() >> 16), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{6, 21, 5, 6, '\b', '\n', '\r', 1, '\f', '!', '\r', 20, 30, '\n', 24, 6}, (byte) (41 - Color.red(0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 17, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i14 = b + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1344928149};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[5];
                Object[] objArr13 = new Object[1];
                d(b4, b4, bArr3[19], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = bArr3[19];
                Object[] objArr14 = new Object[1];
                d(b5, b5, bArr3[5], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char deadChar = (char) (31533 - KeyEvent.getDeadChar(0, 0));
                    int i16 = 922 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int iRed = 28 - Color.red(0);
                    byte[] bArr4 = $$a;
                    Object[] objArr16 = new Object[1];
                    a((byte) (bArr4[17] + 1), bArr4[80], bArr4[7], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(deadChar, i16, iRed, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{'#', 6, 22, 24, 7, '\n', 23, '\f', '\b', '\f', '\r', 29, ' ', '\r', 6, 1, 4, 31, 0, '\t', 17, 22}, (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 93), KeyEvent.getDeadChar(0, 0) + 22, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{1, 4, ' ', 0, '\f', 2, 23, 24, 6, 0, 1, '\t', 7, 3, 13925}, (byte) (102 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 15 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cArgb = (char) (31533 - Color.argb(0, 0, 0, 0));
                        int iGreen2 = Color.green(0) + 921;
                        int iResolveSizeAndState = 28 - View.resolveSizeAndState(0, 0, 0);
                        byte b6 = $$a[80];
                        Object[] objArr19 = new Object[1];
                        a((byte) 52, b6, b6, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, iGreen2, iResolveSizeAndState, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) (31532 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0');
                        int iAxisFromString = MotionEvent.axisFromString("") + 29;
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[80];
                        Object[] objArr20 = new Object[1];
                        a(b7, bArr5[7], b7, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iLastIndexOf, iAxisFromString, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i17 = b + 93;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
                    int i18 = i17 % 2;
                    objArr = objArr15;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i19 = ((int[]) objArr[1])[0];
        int i20 = ((int[]) objArr[3])[0];
        if (i20 == i19) {
            int i21 = b + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 % 128;
            int i22 = i21 % 2;
            int i23 = ((int[]) objArr[0])[0];
            int i24 = ((int[]) objArr[3])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i24}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i25 = i23 + (((~(iIdentityHashCode | 243995236)) | 1530084407) * 56) + 957531891 + (((~((~iIdentityHashCode) | 1530084407)) | 243995236) * 56);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr21[0])[0] = i27 ^ (i27 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i28 = 0;
                while (i28 < strArr.length) {
                    int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
                    b = i29 % 128;
                    if (i29 % 2 == 0) {
                        arrayList.add(strArr[i28]);
                        i28 += 104;
                    } else {
                        arrayList.add(strArr[i28]);
                        i28++;
                    }
                }
            }
            Toast.makeText((Context) null, i20 / (((i20 - 1) * i20) % 2), 0).show();
            int i30 = ((int[]) objArr[0])[0];
            int i31 = ((int[]) objArr[3])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i31}, (String[]) objArr[4]};
            int iMyPid = Process.myPid();
            int i32 = i30 + 189572955 + (((~((-806688482) | iMyPid)) | 967391162) * (-366)) + (((~(iMyPid | (-1310786))) | 162013466) * 366);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr22[0])[0] = i34 ^ (i34 << 5);
        }
        this.zza.zzb(null);
        int i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        b = i35 % 128;
        if (i35 % 2 == 0) {
            int i36 = 43 / 0;
        }
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = 1770390596;
        Object obj2 = null;
        int i6 = 5;
        int i7 = -1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + i6;
                $11 = i9 % 128;
                if (i9 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) i7;
                            byte b4 = (byte) (b3 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - Process.getGidForName("")), 2266 - Process.getGidForName(""), KeyEvent.normalizeMetaState(0) + 33, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2267 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf((CharSequence) "", '0') + 34, -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i8++;
                }
                i3 = 2;
                i5 = 1770390596;
                i6 = 5;
                i7 = -1;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            byte b7 = (byte) (-1);
            byte b8 = (byte) (b7 + 1);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.red(0), 2267 - TextUtils.getTrimmedLength(""), TextUtils.indexOf("", "", 0) + 33, -1927765101, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i10 = $11 + 23;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b >>> b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 % 0] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + b2);
                    } else {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    }
                    obj = obj2;
                } else {
                    Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b9 = (byte) (-1);
                        byte b10 = (byte) (-b9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (49267 - View.MeasureSpec.getMode(0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 3262, 30 - (ViewConfiguration.getWindowTouchSlop() >> 8), -127612708, false, $$g(b9, b10, (byte) (b10 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                        Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b11 = (byte) (-1);
                            byte b12 = (byte) (b11 + 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (22878 - (ViewConfiguration.getEdgeSlop() >> 16)), 593 - ImageFormat.getBitsPerPixel(0), 16 - TextUtils.lastIndexOf("", '0'), 1570859318, false, $$g(b11, b12, (byte) (b12 - 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                        int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i12 = $10 + 123;
                            $11 = i12 % 128;
                            int i13 = i12 % 2;
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                        } else {
                            int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, short r7, byte r8) {
        /*
            byte[] r0 = com.google.android.gms.internal.measurement.zzdx.$$c
            int r6 = r6 + 4
            int r7 = r7 + 113
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r6 = r6 + 1
            if (r4 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r6]
        L24:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzdx.$$g(short, short, byte):java.lang.String");
    }
}
