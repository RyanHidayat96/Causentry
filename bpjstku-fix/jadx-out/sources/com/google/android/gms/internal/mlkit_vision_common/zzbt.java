package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
final class zzbt implements ObjectEncoder {
    private static int TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    static final zzbt zza;
    private static final FieldDescriptor zzb;
    private static final FieldDescriptor zzc;
    private static final FieldDescriptor zzd;
    private static final FieldDescriptor zze;
    private static final FieldDescriptor zzf;
    private static final byte[] $$c = {58, -103, 118, 14};
    private static final int $$f = 201;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {89, 107, -36, -112, -8, -25, 24, -29, -8, -22, -13, 4, -15, -15, -3, 20, -37, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
    private static final int $$e = 231;
    private static final byte[] $$a = {43, 23, 22, -14, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 77;
    private static int asBinder = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f779a = 1;
    private static int b = 1;

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        zza = new zzbt();
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isColdCall");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inputsFormats");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("outputFormats");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("options");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        zzf = builder5.withProperty(zzaeVar5.zzb()).build();
        int i = b + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
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
    private static void c(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_common.zzbt.$$a
            int r5 = r5 + 1
            int r6 = r6 + 4
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r5
            goto L27
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            r4 = r0[r6]
        L27:
            int r7 = r7 + r4
            int r7 = r7 + (-10)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_common.zzbt.c(byte, short, short, java.lang.Object[]):void");
    }

    private static void e(int i, byte b2, short s, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = 103 - (s * 19);
        int i3 = b2 + 4;
        int i4 = i * 39;
        byte[] bArr2 = new byte[53 - i4];
        int i5 = 52 - i4;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i2 = (i5 + (-i3)) - 10;
            i3 = i3;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            int i8 = i3 + 1;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = i7;
            i2 = (i2 + (-bArr[i8])) - 10;
            i3 = i8;
        }
    }

    private static void d(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $11 + 5;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.MeasureSpec.getMode(0) + 8328), 1235 - View.combineMeasuredStates(0, 0), 36 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -653973969, false, $$g(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.red(0), 2764 - (ViewConfiguration.getWindowTouchSlop() >> 8), 14 - View.MeasureSpec.makeMeasureSpec(0, 0), 1504416861, false, $$g(b4, b5, (byte) (b5 - 2)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 43325), Drawable.resolveOpacity(0, 0) + 253, TextUtils.getOffsetBefore("", 0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65199 - Process.getGidForName("")), 2891 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 17 - (Process.myTid() >> 22), 2012627446, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
        int i6 = $11 + 57;
        $10 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char gidForName = (char) (31532 - Process.getGidForName(""));
            int iIndexOf = 920 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int iBlue = Color.blue(0) + 28;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[80], bArr[7], bArr[37], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName, iIndexOf, iBlue, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new char[]{58751, 32350, 25430, 35714}, new char[]{41026, 11400, 44812, 23278}, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, new char[]{33642, 29697, 37397, 41908, 44960, 51404, 65154, 12040, 41103, 43554, 37846, 62039, 61591, 21148, 63537, 27268, 26671, 33083, 29544, 55840, 38233, 18569}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{58751, 32350, 25430, 35714}, new char[]{64043, 65357, 2979, 14744}, (char) (38922 - ExpandableListView.getPackedPositionChild(0L)), (Process.myPid() >> 22) - 1543549446, new char[]{23831, 55871, 38376, 36289, 11212, 24865, 16059, 56112, 51146, 2691, 23119, 22381, 44270, 62944, 7646}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 31533);
            int scrollBarFadeDuration = 921 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 28;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c((byte) 52, bArr2[7], bArr2[80], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, scrollBarFadeDuration, iIndexOf2, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = f779a + 93;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 31533);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 922;
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
                Object[] objArr6 = new Object[1];
                c((byte) 37, (byte) 51, $$a[80], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(doubleTapTimeout, iLastIndexOf, keyRepeatDelay, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = (((((~((-948042091) | iIdentityHashCode)) | 163425371) * 398) + 2138850279) + (((~((~iIdentityHashCode) | (-948042091))) | 163425371) * 398)) - 1645081623;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            d(new char[]{58751, 32350, 25430, 35714}, new char[]{20501, 680, 'y', 59394}, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 513), TextUtils.getOffsetBefore("", 0), new char[]{57641, 5446, 29838, 21922, 57899, 48824, 11039, 34709, 30944, 51361, 61891, 16207, 47391, 44150, 3293, 23800, 57310, 5094, 54774, 28953, 30736, 49532, 45600, 54388, 23076, 5665}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{58751, 32350, 25430, 35714}, new char[]{28106, 55825, 16463, 62757}, (char) (TextUtils.indexOf("", "") + 9536), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{47493, 10981, 53737, 57402, 36390, 4360, Typography.nbsp, 47879, 43674, 43459, 9430, 27228, 45205, 51936, 37991, 46009, 6898, 55597}, objArr9);
            Method method = cls2.getMethod((String) objArr9[0], new Class[0]);
            Context applicationContext = (Context) method.invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            d(new char[]{58751, 32350, 25430, 35714}, new char[]{63307, 55690, 9549, 23194}, (char) (TextUtils.indexOf("", "", 0, 0) + 39461), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, new char[]{57193, 63996, 25918, 63624, 39351, 14181, 45306, 64608, 47571, 18402, 6303, 23688, 62459, 17678, 38203, 26867}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(new char[]{58751, 32350, 25430, 35714}, new char[]{2868, 45513, 27127, 1751}, (char) (55146 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ViewConfiguration.getMinimumFlingVelocity() >> 16, new char[]{41510, 51185, 38326, 29181, 37290, 48932, 41124, 52750, 15531, 42440, 16382, 60385, 26929, 62399, 57041, 15797}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i7 = f779a;
            int i8 = i7 + 93;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 3;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -1645081623};
                byte[] bArr3 = $$d;
                byte b2 = bArr3[20];
                byte b3 = bArr3[50];
                Object[] objArr13 = new Object[1];
                e(b2, b3, (byte) (b3 + 1), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b4 = bArr3[20];
                byte b5 = (byte) (b4 - 1);
                Object[] objArr14 = new Object[1];
                e(b5, (byte) (b5 | 12), b4, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 31534);
                    int mode = 921 - View.MeasureSpec.getMode(0);
                    int iIndexOf3 = 28 - TextUtils.indexOf("", "", 0);
                    Object[] objArr16 = new Object[1];
                    c((byte) 37, (byte) 51, $$a[80], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, mode, iIndexOf3, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    d(new char[]{58751, 32350, 25430, 35714}, new char[]{41026, 11400, 44812, 23278}, (char) (ViewConfiguration.getScrollBarSize() >> 8), ViewConfiguration.getPressedStateDuration() >> 16, new char[]{33642, 29697, 37397, 41908, 44960, 51404, 65154, 12040, 41103, 43554, 37846, 62039, 61591, 21148, 63537, 27268, 26671, 33083, 29544, 55840, 38233, 18569}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    d(new char[]{58751, 32350, 25430, 35714}, new char[]{64043, 65357, 2979, 14744}, (char) (38924 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-1543549446) + (ViewConfiguration.getTouchSlop() >> 8), new char[]{23831, 55871, 38376, 36289, 11212, 24865, 16059, 56112, 51146, 2691, 23119, 22381, 44270, 62944, 7646}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollDefaultDelay = (char) (31533 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 921;
                        int i12 = 28 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        byte[] bArr4 = $$a;
                        Object[] objArr19 = new Object[1];
                        c((byte) 52, bArr4[7], bArr4[80], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollDefaultDelay, longPressTimeout, i12, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char offsetAfter = (char) (31533 - TextUtils.getOffsetAfter("", 0));
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 921;
                        int packedPositionGroup = 28 - ExpandableListView.getPackedPositionGroup(0L);
                        byte[] bArr5 = $$a;
                        Object[] objArr20 = new Object[1];
                        c(bArr5[80], bArr5[7], bArr5[37], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetAfter, edgeSlop, packedPositionGroup, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i15 = asBinder + 7;
                f779a = i15 % 128;
                int i16 = i15 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        int i17 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iMyPid = Process.myPid();
        int i18 = ~(467940164 | iMyPid);
        int i19 = i17 + 2145698740 + ((1142556691 | i18) * (-814)) + ((i18 | (~((~iMyPid) | (-1306139480))) | 304357376) * 407) + (((~(iMyPid | 1306139479)) | (~((-467940165) | iMyPid)) | 304357376) * 407);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr21[0])[0] = i21 ^ (i21 << 5);
        throw null;
    }

    private zzbt() {
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 3241622124516565070L;
        TuitionPaymentFragmentbindingInflater1 = -981105359;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 34097;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, byte r8, int r9) {
        /*
            int r9 = r9 * 3
            int r9 = r9 + 1
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_common.zzbt.$$c
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r8 = r8 + 102
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            r6 = r8
            r8 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L2b:
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_common.zzbt.$$g(short, byte, int):java.lang.String");
    }
}
