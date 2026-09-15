package com.google.android.gms.common.stats;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.datadog.android.rum.model.LongTaskEvent;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    private static final byte[] $$c = {25, 5, -88, -44};
    private static final int $$f = 5;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {12, 11, -9, -106, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 19;
    private static final byte[] $$a = {77, -106, 83, 4, -2, -5, -32, 32, 1, -20, 8, -20, -3, 6, -1, -10, -2};
    private static final int $$b = 117;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int b = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -6377398940819159759L;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1425797364;
    private static char TuitionPaymentFragmentbindingInflater1 = 34097;

    /* JADX INFO: loaded from: classes4.dex */
    public interface Types {
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.common.stats.StatsEvent.$$a
            int r6 = r6 * 3
            int r1 = 14 - r6
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r8 = r8 * 2
            int r8 = r8 + 97
            byte[] r1 = new byte[r1]
            int r6 = 13 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r6
            r8 = r7
            r4 = r2
            goto L30
        L19:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1d:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2c:
            int r8 = r8 + 1
            r3 = r0[r8]
        L30:
            int r7 = r7 + r3
            int r7 = r7 + 5
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.stats.StatsEvent.a(int, byte, short, java.lang.Object[]):void");
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
    private static void c(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 52
            int r9 = 53 - r9
            int r8 = 103 - r8
            int r7 = r7 * 52
            int r7 = 56 - r7
            byte[] r0 = com.google.android.gms.common.stats.StatsEvent.$$d
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r5 = r2
            r8 = r7
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L25
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
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            int r8 = r8 + 1
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.stats.StatsEvent.c(short, short, short, java.lang.Object[]):void");
    }

    public final String toString() {
        int i = 2 % 2;
        long jZzb = zzb();
        int iZza = zza();
        String strZzc = zzc();
        StringBuilder sb = new StringBuilder();
        sb.append(jZzb);
        sb.append("\t");
        sb.append(iZza);
        sb.append("\t-1");
        sb.append(strZzc);
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        b = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public abstract int zza();

    public abstract long zzb();

    public abstract String zzc();

    private static void d(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
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
        int i3 = $10 + 101;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i5 = $10 + 1;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c3 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8328);
                    int i7 = 1236 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int trimmedLength = TextUtils.getTrimmedLength("") + 35;
                    byte b2 = (byte) ($$f - 5);
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, i7, trimmedLength, -653973969, false, $$g(b2, b3, (byte) (b3 + 2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c4 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                    int i8 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2763;
                    int iMyTid = 14 - (Process.myTid() >> 22);
                    byte b4 = (byte) ($$f - 5);
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c4, i8, iMyTid, 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 43325), 253 - Color.red(0), KeyEvent.getDeadChar(0, 0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c5 = (char) (65200 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 2892;
                    int i9 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16;
                    byte b6 = (byte) ($$f - 5);
                    byte b7 = b6;
                    String str$$g = $$g(b6, b7, (byte) (b7 + 1));
                    c2 = 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c5, bitsPerPixel, i9, 2012627446, false, str$$g, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0a56  */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) throws Throwable {
        boolean z;
        int i;
        String string;
        Method method;
        Class<?> cls;
        int iIndexOf;
        char c;
        char[] cArr;
        char[] cArr2;
        int iIndexOf2;
        char[] cArr3;
        char[] cArr4;
        char c2;
        int i2;
        int i3;
        int i4;
        char[] cArr5;
        char[] cArr6;
        char capsMode;
        Long l;
        int i5 = 2;
        int i6 = 2 % 2;
        int i7 = 1;
        byte b2 = (byte) ($$a[8] - 1);
        byte b3 = b2;
        Object[] objArr = new Object[1];
        a(b2, b3, b3, objArr);
        int i8 = 0;
        Method[] methodArr = {OkHttpClient.Builder.class.getMethod((String) objArr[0], Interceptor.class)};
        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        b = i9 % 128;
        Class<?>[] clsArr = null;
        if (i9 % 2 == 0) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char mode = (char) View.MeasureSpec.getMode(0);
                int iResolveSize = 2823 - View.resolveSize(0, 0);
                int mirror = AndroidCharacter.getMirror('0') - 26;
                byte[] bArr = $$d;
                Object[] objArr2 = new Object[1];
                c(bArr[5], (byte) $$e, bArr[7], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mode, iResolveSize, mirror, 1814927978, false, (String) objArr2[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
            throw null;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
            int offsetBefore = 2823 - TextUtils.getOffsetBefore("", 0);
            int iIndexOf3 = 21 - TextUtils.indexOf((CharSequence) "", '0', 0);
            byte[] bArr2 = $$d;
            Object[] objArr3 = new Object[1];
            c(bArr2[5], (byte) $$e, bArr2[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, offsetBefore, iIndexOf3, 1814927978, false, (String) objArr3[0], null);
        }
        float f = 0.0f;
        try {
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null) == null) {
                Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 2823 - Gravity.getAbsoluteGravity(0, 0), Drawable.resolveOpacity(0, 0) + 22)).getDeclaredMethods();
                int length = declaredMethods.length;
                int i10 = 0;
                while (i10 < length) {
                    int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i12 = (i11 ^ 13) + ((i11 & 13) << i7);
                    b = i12 % 128;
                    int i13 = i12 % i5;
                    Method method2 = declaredMethods[i10];
                    try {
                        Object[] objArr4 = new Object[i7];
                        d(new char[]{0, 0, 0, 0}, new char[]{33640, 57580, 32936, 12325}, (char) KeyEvent.normalizeMetaState(i8), Color.blue(i8), new char[]{7453, 4199, 60238, 42242, 26535, 33452, 44565, 45991, 20706, 30868, 17804, 19718, 15871, 19077, 26137, 28417, 36908, 42748, 3146, 20798, 51213, 37513, 8280, 63625}, objArr4);
                        Class<?> cls2 = Class.forName((String) objArr4[i8]);
                        char c3 = (char) (TypedValue.complexToFloat(i8) > f ? 1 : (TypedValue.complexToFloat(i8) == f ? 0 : -1));
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(i8);
                        Object[] objArr5 = new Object[i7];
                        d(new char[]{0, 0, 0, 0}, new char[]{15331, 718, 65042, 27112}, c3, ((bitsPerPixel | 1) << 1) - (bitsPerPixel ^ i7), new char[]{25045, 8273, 30576, 32609, 38827, 29882, 64447, 47259, 15127, 3496, 9561, 63494}, objArr5);
                        int iIntValue = ((Integer) cls2.getMethod((String) objArr5[i8], clsArr).invoke(method2, clsArr)).intValue();
                        Object[] objArr6 = new Object[i7];
                        objArr6[i8] = Integer.valueOf(iIntValue);
                        char[] cArr7 = {0, 0, 0, 0};
                        char[] cArr8 = {16349, 12523, 50031, 42415};
                        int i14 = b;
                        int i15 = (i14 & 1) + (i14 | i7);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                        int i16 = i15 % 2;
                        int i17 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i18 = i17 * 569;
                        int i19 = (i18 ^ 25601586) + ((i18 & 25601586) << i7);
                        int i20 = ~i17;
                        int i21 = (i20 ^ (-44995)) | (i20 & (-44995));
                        int i22 = ~i21;
                        int i23 = ~i17;
                        int i24 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i25 = ~((i23 ^ i24) | (i23 & i24));
                        int i26 = (i22 ^ i25) | (i25 & i22);
                        int i27 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        Method[] methodArr2 = declaredMethods;
                        int i28 = ~((-44995) | i27);
                        int i29 = i19 + (((i26 ^ i28) | (i26 & i28)) * (-1136));
                        int i30 = ~(i23 | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        int i31 = ~(((-44995) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-44995) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i32 = (i30 & i31) | (i30 ^ i31);
                        int i33 = ~((i24 & i17) | (i24 ^ i17) | 44994);
                        int i34 = i29 + (((i33 & i32) | (i32 ^ i33)) * (-568));
                        int i35 = ~((i27 ^ i17) | (i27 & i17));
                        int i36 = ~((i27 ^ 44994) | (44994 & i27));
                        int i37 = (i35 & i36) | (i35 ^ i36);
                        int i38 = ~((i21 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i21 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i39 = i34 + (((i37 & i38) | (i37 ^ i38)) * 568);
                        int i40 = b;
                        int i41 = (i40 & 33) + (i40 | 33);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i41 % 128;
                        char c4 = (char) i39;
                        if (i41 % 2 != 0) {
                            Object[] objArr7 = new Object[1];
                            d(cArr7, cArr8, c4, ViewConfiguration.getPressedStateDuration() - 7, new char[]{43072, 55137, 30621, 35503, 20512, 29091, 62931, 18400, 49831, 51363, 48587, 10477, 3015, 57870, 41332, 33194, 10369, 28089, 28186, 4499, 45106, 44237, 24547, 11289, 56701, 17315}, objArr7);
                            cls = Class.forName((String) objArr7[0]);
                            MotionEvent.axisFromString("");
                            iIndexOf = TextUtils.indexOf("", "", 0, 0);
                            cArr = new char[]{0, 0, 0, 0};
                            cArr2 = new char[]{40338, 43816, 2491, 61724};
                            c = (char) 0;
                        } else {
                            Object[] objArr8 = new Object[1];
                            d(cArr7, cArr8, c4, ViewConfiguration.getPressedStateDuration() >> 16, new char[]{43072, 55137, 30621, 35503, 20512, 29091, 62931, 18400, 49831, 51363, 48587, 10477, 3015, 57870, 41332, 33194, 10369, 28089, 28186, 4499, 45106, 44237, 24547, 11289, 56701, 17315}, objArr8);
                            cls = Class.forName((String) objArr8[0]);
                            char[] cArr9 = {0, 0, 0, 0};
                            char[] cArr10 = {40338, 43816, 2491, 61724};
                            char c5 = (char) (0 - (~MotionEvent.axisFromString("")));
                            iIndexOf = TextUtils.indexOf("", "", 0, 0);
                            c = c5;
                            cArr = cArr9;
                            cArr2 = cArr10;
                        }
                        int i42 = iIndexOf;
                        int i43 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i44 = ((i43 | 99) << 1) - (i43 ^ 99);
                        b = i44 % 128;
                        int i45 = i44 % 2;
                        Object[] objArr9 = new Object[1];
                        d(cArr, cArr2, c, i42, new char[]{626, 59980, 26483, 34908, 65068, 64030, 18086, 65260}, objArr9);
                        if (((Boolean) cls.getMethod((String) objArr9[0], Integer.TYPE).invoke(null, objArr6)).booleanValue()) {
                            int i46 = b;
                            int i47 = (i46 & 119) + (i46 | 119);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i47 % 128;
                            int i48 = i47 % 2;
                            Class cls3 = Long.TYPE;
                            if (i48 != 0) {
                                char cArgb = (char) Color.argb(1, 0, 0, 0);
                                iIndexOf2 = TextUtils.indexOf("", "", 0, 0);
                                c2 = cArgb;
                                cArr3 = new char[]{0, 0, 0, 0};
                                cArr4 = new char[]{33640, 57580, 32936, 12325};
                            } else {
                                char cArgb2 = (char) Color.argb(0, 0, 0, 0);
                                iIndexOf2 = TextUtils.indexOf("", "", 0, 0);
                                cArr3 = new char[]{0, 0, 0, 0};
                                cArr4 = new char[]{33640, 57580, 32936, 12325};
                                c2 = cArgb2;
                            }
                            Object[] objArr10 = new Object[1];
                            d(cArr3, cArr4, c2, iIndexOf2, new char[]{7453, 4199, 60238, 42242, 26535, 33452, 44565, 45991, 20706, 30868, 17804, 19718, 15871, 19077, 26137, 28417, 36908, 42748, 3146, 20798, 51213, 37513, 8280, 63625}, objArr10);
                            Class<?> cls4 = Class.forName((String) objArr10[0]);
                            char[] cArr11 = {0, 0, 0, 0};
                            char[] cArr12 = {24639, 21109, 63051, 32772};
                            char c6 = (char) (1270 - (~(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))));
                            int i49 = -View.resolveSize(0, 0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i50 = i49 * (-1529);
                            int i51 = b;
                            int i52 = ((i51 | 3) << 1) - (i51 ^ 3);
                            int i53 = i52 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i53;
                            if (i52 % 2 != 0) {
                                i2 = i50 >> (-764);
                                int i54 = ~i49;
                                i3 = (i54 ^ (-1263695201)) | (i54 & (-1263695201)) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                            } else {
                                i2 = i50 + 904508800;
                                int i55 = (~i49) | (-1263695201);
                                int i56 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                i3 = (i55 ^ i56) | (i55 & i56);
                            }
                            int i57 = ~i3;
                            int i58 = ~i49;
                            int i59 = (i58 ^ 1263695200) | (i58 & 1263695200);
                            int i60 = i57 | (~((i59 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i59 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4)));
                            int i61 = ((-1263695201) ^ i49) | ((-1263695201) & i49);
                            int i62 = ~((i61 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i61 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                            int i63 = -(-(765 * ((i60 ^ i62) | (i60 & i62))));
                            int i64 = ((i2 | i63) << 1) - (i2 ^ i63);
                            int i65 = ((i53 | 43) << 1) - (i53 ^ 43);
                            int i66 = i65 % 128;
                            b = i66;
                            if (i65 % 2 == 0) {
                                int i67 = ~i49;
                                int i68 = ~((i67 ^ (-1263695201)) | (i67 & (-1263695201)));
                                int i69 = ~i49;
                                int i70 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                int i71 = ~((i69 ^ i70) | (i70 & i69));
                                i4 = i64 % (((i71 & i68) | (i68 ^ i71)) + 1530);
                            } else {
                                int i72 = ~i49;
                                int i73 = ((~(i72 | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault4))) | (~(i72 | (-1263695201)))) * 1530;
                                i4 = ((i64 | i73) << 1) - (i73 ^ i64);
                            }
                            int i74 = ~i49;
                            int i75 = ~((i74 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i74 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                            int i76 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                            int i77 = (i76 & (-1263695201)) | ((-1263695201) ^ i76);
                            int i78 = (i4 - (~(-(-(765 * (i75 | (~((i49 & i77) | (i77 ^ i49))))))))) - 1;
                            int i79 = i66 + 125;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i79 % 128;
                            int i80 = i79 % 2;
                            Object[] objArr11 = new Object[1];
                            d(cArr11, cArr12, c6, i78, new char[]{62005, 17505, 39144, 54771, 37009, 43954, 24703, 53541, 38911, 51686, 59809, 12907, 5943}, objArr11);
                            if (cls3.equals(cls4.getMethod((String) objArr11[0], null).invoke(method2, null))) {
                                int i81 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i82 = i81 * (-183);
                                int i83 = (i82 & (-185)) + (i82 | (-185));
                                int i84 = ~i81;
                                int i85 = (i84 | (i84 ^ (-1))) * (-368);
                                int i86 = ((i83 | i85) << 1) - (i85 ^ i83);
                                int i87 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                int i88 = -(-(((i87 & i81) | (i81 ^ i87)) * 184));
                                int i89 = ((i86 | i88) << 1) - (i88 ^ i86);
                                int i90 = ~i81;
                                int i91 = ~i90;
                                int i92 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | i81);
                                int i93 = (i92 & i91) | (i91 ^ i92);
                                int i94 = ~(i81 | i90);
                                Object[] objArr12 = new Object[1];
                                d(new char[]{0, 0, 0, 0}, new char[]{33640, 57580, 32936, 12325}, (char) (i89 + (((i94 & i93) | (i93 ^ i94)) * 184)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{7453, 4199, 60238, 42242, 26535, 33452, 44565, 45991, 20706, 30868, 17804, 19718, 15871, 19077, 26137, 28417, 36908, 42748, 3146, 20798, 51213, 37513, 8280, 63625}, objArr12);
                                Class<?> cls5 = Class.forName((String) objArr12[0]);
                                char defaultSize = (char) (7123 - View.getDefaultSize(0, 0));
                                int i95 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i96 = i95 * 141;
                                int i97 = (i96 & (-1791640617)) + (i96 | (-1791640617));
                                int i98 = -(-(((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 ^ 52604095) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & 52604095)) * 140));
                                int i99 = ((i97 | i98) << 1) - (i98 ^ i97);
                                int i100 = ~i95;
                                int i101 = (i100 & 52604095) | (i100 ^ 52604095);
                                int i102 = ~i101;
                                int i103 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                int i104 = ~((52604095 & i103) | (i103 ^ 52604095));
                                int i105 = i99 + (((i104 & i102) | (i102 ^ i104)) * (-280));
                                int i106 = ~(((-52604096) & i95) | ((-52604096) ^ i95));
                                int i107 = ~(i95 | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                int i108 = (i107 & i106) | (i106 ^ i107);
                                int i109 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & i101) | (i101 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                int i110 = -(-(((i108 & i109) | (i108 ^ i109)) * 140));
                                Object[] objArr13 = new Object[1];
                                d(new char[]{0, 0, 0, 0}, new char[]{49103, 8876, 54019, 61467}, defaultSize, (i105 ^ i110) + ((i110 & i105) << 1), new char[]{31599, 18894, 36600, 26381, 7661, 39549, 61755, 42960, 56972, 25969, 45461, 23747, 24413, 36974, 29052, 28283, 53686}, objArr13);
                                Object[] objArr14 = (Object[]) cls5.getMethod((String) objArr13[0], null).invoke(method2, null);
                                if (objArr14.length == 2) {
                                    int i111 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
                                    b = i111 % 128;
                                    int i112 = i111 % 2;
                                    if (Long.TYPE.equals(objArr14[0])) {
                                        int i113 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        int i114 = (i113 ^ 5) + ((i113 & 5) << 1);
                                        b = i114 % 128;
                                        if (i114 % 2 == 0) {
                                            cArr5 = new char[]{0, 0, 0, 0};
                                            cArr6 = new char[]{33640, 57580, 32936, 12325};
                                            capsMode = (char) TextUtils.getCapsMode("", 0, 1);
                                        } else {
                                            cArr5 = new char[]{0, 0, 0, 0};
                                            cArr6 = new char[]{33640, 57580, 32936, 12325};
                                            capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                                        }
                                        Object[] objArr15 = new Object[1];
                                        d(cArr5, cArr6, capsMode, (-1) + (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{7453, 4199, 60238, 42242, 26535, 33452, 44565, 45991, 20706, 30868, 17804, 19718, 15871, 19077, 26137, 28417, 36908, 42748, 3146, 20798, 51213, 37513, 8280, 63625}, objArr15);
                                        Class<?> cls6 = Class.forName((String) objArr15[0]);
                                        Object obj = objArr14[1];
                                        int i115 = b + 59;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i115 % 128;
                                        int i116 = i115 % 2;
                                        if (cls6.equals(obj)) {
                                            int i117 = b + 65;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i117 % 128;
                                            if (i117 % 2 != 0) {
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                                                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2823;
                                                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22;
                                                    byte[] bArr3 = $$d;
                                                    Object[] objArr16 = new Object[1];
                                                    c(bArr3[5], (byte) $$e, bArr3[7], objArr16);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, iKeyCodeFromString, scrollDefaultDelay, 1814927978, false, (String) objArr16[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, method2);
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                    char c7 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                    int tapTimeout = 2823 - (ViewConfiguration.getTapTimeout() >> 16);
                                                    int iIndexOf4 = 22 - TextUtils.indexOf("", "", 0, 0);
                                                    byte[] bArr4 = $$d;
                                                    Object[] objArr17 = new Object[1];
                                                    c(bArr4[5], (byte) $$e, bArr4[7], objArr17);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c7, tapTimeout, iIndexOf4, 1814927978, false, (String) objArr17[0], null);
                                                }
                                                Object[] objArr18 = {1L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null)};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                                    int i118 = 2823 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                    int i119 = 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    byte[] bArr5 = $$d;
                                                    byte b4 = bArr5[7];
                                                    Object[] objArr19 = new Object[1];
                                                    c(b4, b4, bArr5[5], objArr19);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSizeAndState, i118, i119, -2137287382, false, (String) objArr19[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                l = (Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr18);
                                            } else {
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                    char c8 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                                    int iKeyCodeFromString2 = 2823 - KeyEvent.keyCodeFromString("");
                                                    int iAxisFromString = MotionEvent.axisFromString("") + 23;
                                                    byte[] bArr6 = $$d;
                                                    Object[] objArr20 = new Object[1];
                                                    c(bArr6[5], (byte) $$e, bArr6[7], objArr20);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c8, iKeyCodeFromString2, iAxisFromString, 1814927978, false, (String) objArr20[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, method2);
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                                                    int size = 2823 - View.MeasureSpec.getSize(0);
                                                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 23;
                                                    byte[] bArr7 = $$d;
                                                    Object[] objArr21 = new Object[1];
                                                    c(bArr7[5], (byte) $$e, bArr7[7], objArr21);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cNormalizeMetaState, size, iLastIndexOf, 1814927978, false, (String) objArr21[0], null);
                                                }
                                                Object[] objArr22 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null)};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                                                    int i120 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2823;
                                                    int iAlpha = Color.alpha(0) + 22;
                                                    byte[] bArr8 = $$d;
                                                    byte b5 = bArr8[7];
                                                    Object[] objArr23 = new Object[1];
                                                    c(b5, b5, bArr8[5], objArr23);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cRgb, i120, iAlpha, -2137287382, false, (String) objArr23[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                l = (Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr22);
                                            }
                                            l.longValue();
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            length = length;
                        }
                        int i121 = i10 + 70;
                        i10 = (i121 & (-69)) + (i121 | (-69));
                        declaredMethods = methodArr2;
                        length = length;
                        i5 = 2;
                        i8 = 0;
                        i7 = 1;
                        f = 0.0f;
                        clsArr = null;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cArgb3 = (char) Color.argb(0, 0, 0, 0);
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2823;
                int iIndexOf5 = 21 - TextUtils.indexOf((CharSequence) "", '0');
                byte[] bArr9 = $$d;
                Object[] objArr24 = new Object[1];
                c(bArr9[5], (byte) $$e, bArr9[7], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cArgb3, keyRepeatTimeout, iIndexOf5, 1814927978, false, (String) objArr24[0], null);
            }
            Object[] objArr25 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2823;
                int iMakeMeasureSpec = 22 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte[] bArr10 = $$d;
                byte b6 = bArr10[7];
                Object[] objArr26 = new Object[1];
                c(b6, (byte) (b6 + 5), bArr10[5], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cLastIndexOf2, fadingEdgeLength, iMakeMeasureSpec, 1025296417, false, (String) objArr26[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr25);
            Object[] objArr27 = {0, methodArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cIndexOf2 = (char) (37656 - TextUtils.indexOf((CharSequence) "", '0', 0));
                int i122 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2720;
                int i123 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 18;
                byte[] bArr11 = $$d;
                byte b7 = bArr11[7];
                Object[] objArr28 = new Object[1];
                c(b7, (byte) (b7 + 5), bArr11[5], objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf2, i122, i123, -1568796068, false, (String) objArr28[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr27)).longValue();
            long j = -597182129;
            long j2 = -167;
            long j3 = -1;
            long j4 = jLongValue ^ j3;
            long jMyTid = Process.myTid();
            long j5 = (j2 * j) + (j2 * jLongValue) + (((long) 336) * ((((j ^ j3) | j4) ^ j3) | ((j4 | jMyTid) ^ j3))) + (((long) (-168)) * (((jLongValue | j) ^ j3) | ((j | jMyTid) ^ j3))) + (((long) 168) * (j4 | (((jMyTid ^ j3) | j) ^ j3))) + ((long) (-1213223716));
            int i124 = ~new Random().nextInt(901229274);
            int i125 = 1144327094 + (((-92406049) | i124) * 494) + (((~(i124 | (-400012663))) | 2052439639) * 494);
            int i126 = b;
            int i127 = (i126 ^ 51) + ((i126 & 51) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i127 % 128;
            int i128 = i127 % 2;
            int i129 = ((int) (j5 >> 32)) & i125;
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i130 = ~elapsedCpuTime;
            int i131 = i129 | (((int) j5) & ((-1738041619) + (((~((-898574982) | i130)) | 881207936 | (~((-1959165905) | i130))) * (-1136)) + (((~((-898574982) | elapsedCpuTime)) | (~((-1959165905) | elapsedCpuTime)) | (~(1976532949 | i130))) * (-568)) + (((~(elapsedCpuTime | (-881207937))) | (~(i130 | 1959165904)) | (~(898574981 | i130))) * 568)));
            int i132 = i131 >>> 24;
            int i133 = i131 & ViewCompat.MEASURED_SIZE_MASK;
            if (i132 != 0) {
                z = true;
            } else {
                int i134 = b;
                int i135 = ((i134 | 51) << 1) - (i134 ^ 51);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i135 % 128;
                int i136 = i135 % 2;
                z = false;
            }
            int i137 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (z) {
                int i138 = (i137 ^ 17) + ((i137 & 17) << 1);
                int i139 = i138 % 128;
                b = i139;
                int i140 = i138 % 2;
                int i141 = i139 + 47;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i141 % 128;
                int i142 = i141 % 2;
                i = 1;
            } else {
                int i143 = (i137 ^ 45) + ((i137 & 45) << 1);
                b = i143 % 128;
                int i144 = i143 % 2;
                i = 0;
            }
            if (z) {
                int i145 = b;
                int i146 = (i145 & 23) + (i145 | 23);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i146 % 128;
                int i147 = i146 % 2;
                if (i133 >= 1 || (method = methodArr[i133]) == null) {
                    string = null;
                } else {
                    string = method.toString();
                }
            } else {
                string = null;
            }
            list.add(string);
            int i148 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i149 = (i148 & 21) + (i148 | 21);
            b = i149 % 128;
            int i150 = i149 % 2;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i151 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i152 = ((i151 | 7) << 1) - (i151 ^ 7);
            int i153 = i152 % 128;
            b = i153;
            int i154 = i152 % 2;
            int i155 = (-1903) - (~(319 * i132));
            int i156 = ~i132;
            int i157 = (-7) | i156;
            int i158 = (i153 ^ 79) + ((i153 & 79) << 1);
            int i159 = i158 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i159;
            int i160 = i158 % 2;
            int i161 = ~((i157 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i157 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
            int i162 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            int i163 = (i162 & 6) | (i162 ^ 6);
            int i164 = ~((i163 & i132) | (i163 ^ i132));
            int i165 = (i159 & 65) + (i159 | 65);
            int i166 = i165 % 128;
            b = i166;
            int i167 = i165 % 2;
            int i168 = -(-((-318) * (i161 | i164)));
            int i169 = (i155 ^ i168) + ((i155 & i168) << 1);
            int i170 = ~((i156 ^ 6) | (i156 & 6));
            int i171 = i166 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i171 % 128;
            int i172 = i171 % 2;
            int i173 = ~((6 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (6 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
            int i174 = i169 + ((-318) * ((i170 & i173) | (i170 ^ i173)));
            int i175 = (i166 ^ 95) + ((i166 & 95) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i175 % 128;
            int i176 = i175 % 2;
            int i177 = ~i132;
            int i178 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault7 & (-7)) | ((-7) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
            return (i174 + (TypedValues.AttributesType.TYPE_PIVOT_TARGET * ((i178 & i177) | (i177 ^ i178)))) * i;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, int r8, short r9) {
        /*
            int r9 = 104 - r9
            byte[] r0 = com.google.android.gms.common.stats.StatsEvent.$$c
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r5 = r2
            goto L27
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r7]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r7 = r7 + 1
            int r9 = -r9
            int r9 = r9 + r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.stats.StatsEvent.$$g(byte, int, short):java.lang.String");
    }
}
