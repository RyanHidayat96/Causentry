package com.google.android.gms.measurement;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjq;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzpl;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes6.dex */
final class zza extends zzc {
    private static short[] TuitionPaymentFragmentbindingInflater1;
    private final zzic zza;
    private final zzlj zzb;
    private static final byte[] $$c = {55, -64, 35, -71};
    private static final int $$f = 254;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {6, -86, -9, -124, 53, 3, 23, 12, -39, 54, 9, 16, 8, 7, 7, 10, 3, 23, -39, 53, 3, 23, 12, -26, 27, 27, -7, 22, 16, -54, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$e = 197;
    private static final byte[] $$a = {87, -91, 60, 112, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 142;
    private static int g = 0;
    private static int asInterface = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -787705873;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1934795524;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1756637542;
    private static byte[] b = {26, -18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 19, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, -26, -27, 26, 21, -20, -14, Base64.padSymbol, -29, -19, 21, -21, 19, -9, -60, -11, 88, -26, -23, -43, 44, 29, 28, 27, -24, 16, -21, 30, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -32, -17, 21, -26, 27, -12};

    public zza(zzic zzicVar) {
        super(null);
        Preconditions.checkNotNull(zzicVar);
        this.zza = zzicVar;
        this.zzb = zzicVar.zzj();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = r6 + 4
            byte[] r0 = com.google.android.gms.measurement.zza.$$a
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r7 = r7 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-10)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.zza.a(byte, short, int, java.lang.Object[]):void");
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
    private static void d(short r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 26
            int r7 = 30 - r7
            int r5 = r5 * 19
            int r5 = 84 - r5
            byte[] r0 = com.google.android.gms.measurement.zza.$$d
            int r6 = r6 * 11
            int r1 = r6 + 27
            byte[] r1 = new byte[r1]
            int r6 = r6 + 26
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r6
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r7]
        L2a:
            int r5 = r5 + r4
            int r5 = r5 + (-10)
            int r7 = r7 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.zza.d(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0296  */
    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zza(String str, String str2, Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (31534 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int packedPositionType = 921 - ExpandableListView.getPackedPositionType(0L);
            int fadingEdgeLength = 28 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            byte b2 = $$a[80];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, packedPositionType, fadingEdgeLength, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(TextUtils.indexOf((CharSequence) "", '0', 0) - 468093466, TextUtils.getOffsetBefore("", 0) - 27, (short) TextUtils.indexOf("", "", 0, 0), (byte) ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 1570886408, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c((-468093463) - (ViewConfiguration.getWindowTouchSlop() >> 8), ExpandableListView.getPackedPositionGroup(0L) - 27, (short) View.MeasureSpec.getSize(0), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), (-1570886387) - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char touchSlop = (char) (31533 - (ViewConfiguration.getTouchSlop() >> 8));
            int offsetAfter = 921 - TextUtils.getOffsetAfter("", 0);
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 28;
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr[80], bArr[7], (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, offsetAfter, scrollBarSize, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = asInterface + 53;
            g = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (31533 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                int iMakeMeasureSpec = 921 - View.MeasureSpec.makeMeasureSpec(0, 0);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29;
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                a(b4, b5, (byte) (b5 | 36), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iMakeMeasureSpec, iIndexOf, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            int i5 = (((286186055 + (((~(iIdentityHashCode | 1308528560)) | ((~((-163483297) | i4)) | (-1610596348))) * (-68))) + ((~((-302067788) | i4)) * (-68))) + (((~((-1308528561) | i4)) | (-465551084)) * 68)) - 1290759985;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c((-468093467) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 28, (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) Color.argb(0, 0, 0, 0), (-1570886372) - (ViewConfiguration.getTapTimeout() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(ExpandableListView.getPackedPositionGroup(0L) - 468093465, (ViewConfiguration.getFadingEdgeLength() >> 16) - 27, (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (-1570886346) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i8 = g + 67;
                    asInterface = i8 % 128;
                    int i9 = i8 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            int length = str != null ? str.length() : 0;
            int i10 = g + 9;
            asInterface = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(length), 0, -1290759985};
                byte[] bArr2 = $$d;
                byte b6 = bArr2[33];
                Object[] objArr11 = new Object[1];
                d((byte) (-b6), bArr2[54], (byte) (-b6), objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = bArr2[54];
                Object[] objArr12 = new Object[1];
                d(b7, (byte) (-bArr2[33]), b7, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 31533);
                    int iResolveSize = View.resolveSize(0, 0) + 921;
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
                    byte b8 = $$a[7];
                    byte b9 = b8;
                    Object[] objArr14 = new Object[1];
                    a(b8, b9, (byte) (b9 | 36), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, iResolveSize, keyRepeatDelay, -1142834547, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    c((-468093467) - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 27, (short) KeyEvent.normalizeMetaState(0), (byte) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getEdgeSlop() >> 16) - 1570886409, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(Color.rgb(0, 0, 0) - 451316247, (Process.myPid() >> 22) - 27, (short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-1570886387) - (Process.myTid() >> 22), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c3 = (char) (31534 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int i12 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 922;
                        int iIndexOf2 = 27 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        byte[] bArr3 = $$a;
                        Object[] objArr17 = new Object[1];
                        a(bArr3[80], bArr3[7], (byte) 52, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, i12, iIndexOf2, -778300370, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char defaultSize = (char) (31533 - View.getDefaultSize(0, 0));
                        int fadingEdgeLength2 = 921 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 28;
                        byte b10 = $$a[80];
                        byte b11 = b10;
                        Object[] objArr18 = new Object[1];
                        a(b10, b11, b11, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(defaultSize, fadingEdgeLength2, offsetAfter2, -1048449946, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
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
                int i15 = g + 75;
                asInterface = i15 % 128;
                int i16 = i15 % 2;
                for (String str3 : strArr) {
                    arrayList.add(str3);
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        int i17 = ((int[]) objArr[0])[0];
        Object[] objArr19 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iNextInt = new Random().nextInt();
        int i18 = i17 + (((150053605 + (((-742416389) | (~iNextInt)) * (-490))) + (((~(iNextInt | (-1028940822))) | 286524433) * 490)) - 45803110);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr19[0])[0] = i20 ^ (i20 << 5);
        this.zzb.zzB(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzb(String str, String str2, Bundle bundle, long j) {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        g = i2 % 128;
        int i3 = i2 % 2;
        this.zzb.zzC(str, str2, bundle, true, false, j);
        int i4 = g + 15;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final Map zzd(String str, String str2, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        g = i2 % 128;
        int i3 = i2 % 2;
        Map mapZzP = this.zzb.zzP(str, str2, z);
        int i4 = asInterface + 17;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return mapZzP;
        }
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zze(zzjp zzjpVar) {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        g = i2 % 128;
        int i3 = i2 % 2;
        this.zzb.zzV(zzjpVar);
        int i4 = g + 93;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzf(zzjq zzjqVar) {
        int i = 2 % 2;
        int i2 = g + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.zzb.zzW(zzjqVar);
        int i4 = asInterface + 59;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzg(zzjq zzjqVar) {
        int i = 2 % 2;
        int i2 = g + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.zzb.zzX(zzjqVar);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzh() {
        int i = 2 % 2;
        int i2 = g + 87;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String strZzad = this.zzb.zzad();
        int i4 = asInterface + 125;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return strZzad;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzi() {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        g = i2 % 128;
        int i3 = i2 % 2;
        String strZzae = this.zzb.zzae();
        int i4 = g + 37;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return strZzae;
        }
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzj() {
        int i = 2 % 2;
        int i2 = g + 111;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            this.zzb.zzQ();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strZzQ = this.zzb.zzQ();
        int i3 = g + 117;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return strZzQ;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzk() {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        g = i2 % 128;
        int i3 = i2 % 2;
        String strZzaf = this.zzb.zzaf();
        int i4 = asInterface + 41;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return strZzaf;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final long zzl() {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            this.zza.zzk().zzd();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long jZzd = this.zza.zzk().zzd();
        int i3 = g + 45;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return jZzd;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzo(Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        g = i2 % 128;
        int i3 = i2 % 2;
        this.zzb.zzZ(bundle);
        int i4 = g + 69;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final List zzq(String str, String str2) {
        int i = 2 % 2;
        int i2 = g + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ArrayList arrayListZzac = this.zzb.zzac(str, str2);
        int i4 = g + 79;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return arrayListZzac;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final int zzr(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        g = i2 % 128;
        int i3 = i2 % 2;
        this.zzb.zzY(str);
        return i3 != 0 ? 6 : 25;
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Boolean zzs() {
        int i = 2 % 2;
        int i2 = g + 49;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            this.zzb.zzi();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean boolZzi = this.zzb.zzi();
        int i3 = g + 81;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return boolZzi;
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Integer zzt() {
        int i = 2 % 2;
        int i2 = g + 103;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Integer numZzl = this.zzb.zzl();
        int i4 = g + 45;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return numZzl;
    }

    @Override // com.google.android.gms.measurement.zzc
    public final String zzu() {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            this.zzb.zzj();
            throw null;
        }
        String strZzj = this.zzb.zzj();
        int i3 = asInterface + 93;
        g = i3 % 128;
        int i4 = i3 % 2;
        return strZzj;
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Long zzv() {
        int i = 2 % 2;
        int i2 = g + 71;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            this.zzb.zzk();
            throw null;
        }
        Long lZzk = this.zzb.zzk();
        int i3 = asInterface + 63;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 20 / 0;
        }
        return lZzk;
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Double zzw() {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        g = i2 % 128;
        int i3 = i2 % 2;
        Double dZzm = this.zzb.zzm();
        int i4 = asInterface + 75;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return dZzm;
        }
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final Object zzx(int i) {
        int i2 = 2 % 2;
        int i3 = g;
        int i4 = i3 + 77;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        if (i == 0) {
            return this.zzb.zzj();
        }
        int i6 = i3 + 119;
        int i7 = i6 % 128;
        asInterface = i7;
        if (i6 % 2 != 0 ? i == 1 : i == 0) {
            Long lZzk = this.zzb.zzk();
            int i8 = asInterface + 67;
            g = i8 % 128;
            int i9 = i8 % 2;
            return lZzk;
        }
        if (i == 2) {
            return this.zzb.zzm();
        }
        if (i == 3) {
            return this.zzb.zzl();
        }
        int i10 = i7 + 65;
        g = i10 % 128;
        int i11 = i10 % 2;
        Boolean boolZzi = this.zzb.zzi();
        int i12 = g + 109;
        asInterface = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 24 / 0;
        }
        return boolZzi;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzm(String str) {
        int i = 2 % 2;
        int i2 = g + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        zzic zzicVar = this.zza;
        zzicVar.zzw().zza(str, zzicVar.zzaZ().elapsedRealtime());
        int i4 = asInterface + 95;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzn(String str) {
        int i = 2 % 2;
        int i2 = g + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        zzic zzicVar = this.zza;
        zzicVar.zzw().zzb(str, zzicVar.zzaZ().elapsedRealtime());
        int i4 = asInterface + 71;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzp(String str, String str2, Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        g = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzj().zzab(str, str2, bundle);
        int i4 = asInterface + 53;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Map zzc(boolean z) {
        int i = 2 % 2;
        List listZzO = this.zzb.zzO(z);
        ArrayMap arrayMap = new ArrayMap(listZzO.size());
        Iterator it = listZzO.iterator();
        while (it.hasNext()) {
            int i2 = asInterface + 85;
            g = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                ((zzpl) it.next()).zza();
                throw null;
            }
            zzpl zzplVar = (zzpl) it.next();
            Object objZza = zzplVar.zza();
            if (objZza != null) {
                int i3 = asInterface + 107;
                g = i3 % 128;
                if (i3 % 2 != 0) {
                    arrayMap.put(zzplVar.zzb, objZza);
                    obj.hashCode();
                    throw null;
                }
                arrayMap.put(zzplVar.zzb, objZza);
            }
        }
        return arrayMap;
    }

    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                int i6 = 2268 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 33;
                byte length = (byte) $$c.length;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i6, iMakeMeasureSpec, 1387473586, false, $$g((byte) 0, length, (byte) (length - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            int i8 = 3;
            if (i7 != 0) {
                byte[] bArr = b;
                if (bArr != null) {
                    int length2 = bArr.length;
                    byte[] bArr2 = new byte[length2];
                    int i9 = 0;
                    while (i9 < length2) {
                        int i10 = $11 + i8;
                        $10 = i10 % 128;
                        if (i10 % i4 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) KeyEvent.normalizeMetaState(0), TextUtils.indexOf("", "", 0) + 3358, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, -1054011043, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i9])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 3358 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 17, -1054011043, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                            i9++;
                        }
                        i4 = 2;
                        i8 = 3;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = b;
                    Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int capsMode = 2267 - TextUtils.getCapsMode("", 0, 0);
                        int bitsPerPixel = 32 - ImageFormat.getBitsPerPixel(0);
                        byte length3 = (byte) $$c.length;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, capsMode, bitsPerPixel, 1387473586, false, $$g((byte) 0, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                    int i11 = $11 + 89;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentbindingInflater1[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)) + i7;
                Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (55904 - ExpandableListView.getPackedPositionGroup(0L)), AndroidCharacter.getMirror('0') + 2807, 13 - Color.alpha(0), -1529949196, false, $$g(b7, b8, (byte) (b8 - 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = b;
                if (bArr4 != null) {
                    int length4 = bArr4.length;
                    byte[] bArr5 = new byte[length4];
                    for (int i13 = 0; i13 < length4; i13++) {
                        bArr5[i13] = (byte) (((long) bArr4[i13]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i14 = $11 + 69;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    if (z) {
                        byte[] bArr6 = b;
                        int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i16]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentbindingInflater1;
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
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r5, int r6, byte r7) {
        /*
            int r6 = 121 - r6
            int r5 = r5 * 2
            int r0 = r5 + 1
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = com.google.android.gms.measurement.zza.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r3 = r2
            r6 = r5
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L21:
            int r3 = r3 + 1
            r4 = r1[r7]
        L25:
            int r6 = r6 + r4
            int r7 = r7 + 1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.zza.$$g(int, int, byte):java.lang.String");
    }
}
