package com.google.android.gms.common.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.appsflyer.internal.AFg1xSDK;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzc {
    private Object zza;
    private boolean zzb = false;
    final /* synthetic */ BaseGmsClient zzd;
    private static final byte[] $$c = {83, -44, 103, 46};
    private static final int $$d = 191;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {88, ByteCompanionObject.MAX_VALUE, -112, -47, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 101;
    private static char b = 54735;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 47163;
    private static char TuitionPaymentFragmentbindingInflater1 = 27627;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 20565;

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 15
            int r0 = r6 + 38
            byte[] r1 = com.google.android.gms.common.internal.zzc.$$a
            int r8 = r8 * 2
            int r8 = r8 + 84
            byte[] r0 = new byte[r0]
            int r6 = r6 + 37
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2e
        L17:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1b:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r1[r8]
            int r3 = r3 + 1
        L2e:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzc.a(int, int, short, java.lang.Object[]):void");
    }

    protected abstract void zza(Object obj);

    protected abstract void zzc();

    /* JADX WARN: Type inference failed for: r2v58, types: [boolean, int] */
    public final void zze() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        Object obj;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 29944);
            int packedPositionType = 1755 - ExpandableListView.getPackedPositionType(0L);
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 23;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr3 = new Object[1];
            a(b2, bArr[5], b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, packedPositionType, absoluteGravity, 986134021, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{47294, 9747, 37595, 2490, 45162, 59292, 40922, 21070, 5217, 20263, 61859, 10927, 38176, 53264, 59321, 14902, 10315, 5432, 26568, 39627, 32720, 48628, 33848, 17890}, 22 - (Process.myTid() >> 22), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{5936, 57878, 54184, 24703, 16782, 23207, 12797, 38491, 16789, 15037, 42430, 57753, 12877, 43095, 50788, 54054, 25299, 46888}, 14 - MotionEvent.axisFromString(""), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionGroup = (char) (29944 - ExpandableListView.getPackedPositionGroup(0L));
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1755;
            int keyRepeatTimeout = 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            byte[] bArr2 = $$a;
            Object[] objArr6 = new Object[1];
            a(bArr2[28], (byte) ($$b & 190), bArr2[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionGroup, maximumFlingVelocity, keyRepeatTimeout, 1596667560, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char gidForName = (char) (29943 - Process.getGidForName(""));
                int i = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1756;
                int iArgb = Color.argb(0, 0, 0, 0) + 23;
                byte[] bArr3 = $$a;
                Object[] objArr7 = new Object[1];
                a(bArr3[28], bArr3[0], bArr3[7], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(gidForName, i, iArgb, 1599039318, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[1], (String[]) objArr8[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i2 = ((1010136612 + (((~((~iIdentityHashCode) | 575974368)) | 363336710) * 529)) + (((~(iIdentityHashCode | 575974368)) | 363371942) * 529)) - 1254065371;
            int i3 = (i2 << 13) ^ i2;
            int i4 = i3 ^ (i3 >>> 17);
            ((int[]) objArr[3])[0] = i4 ^ (i4 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{42520, 27839, 14910, 3093, 1221, 18664, 29831, 3049, 20708, 51152, 34377, 10761, 53837, 20206, 25190, 25875, 22195, 49977}, 16 - ((Process.getThreadPriority(0) + 20) >> 6), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{34902, 39540, 11407, 52003, 18990, 15637, 28410, 57727, 49630, 45732, 59819, 27071, 58559, 21980, 9189, 31193, 11187, 34475}, 15 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr11 = {287336184};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - (ViewConfiguration.getLongPressTimeout() >> 16)), 1726 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 29 - View.resolveSizeAndState(0, 0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), -1254065371, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 29945);
                    int i5 = 1755 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int trimmedLength = TextUtils.getTrimmedLength("") + 23;
                    byte[] bArr4 = $$a;
                    Object[] objArr12 = new Object[1];
                    a(bArr4[28], bArr4[0], bArr4[7], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, i5, trimmedLength, 1599039318, false, (String) objArr12[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr13 = new Object[1];
                    c(new char[]{47294, 9747, 37595, 2490, 45162, 59292, 40922, 21070, 5217, 20263, 61859, 10927, 38176, 53264, 59321, 14902, 10315, 5432, 26568, 39627, 32720, 48628, 33848, 17890}, 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr13);
                    Class<?> cls3 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    c(new char[]{5936, 57878, 54184, 24703, 16782, 23207, 12797, 38491, 16789, 15037, 42430, 57753, 12877, 43095, 50788, 54054, 25299, 46888}, 14 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr14);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 29944);
                        int offsetBefore2 = 1755 - TextUtils.getOffsetBefore("", 0);
                        int trimmedLength2 = 23 - TextUtils.getTrimmedLength("");
                        byte[] bArr5 = $$a;
                        Object[] objArr15 = new Object[1];
                        a(bArr5[28], (byte) ($$b & 190), bArr5[7], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(fadingEdgeLength, offsetBefore2, trimmedLength2, 1596667560, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29943);
                        int scrollBarSize = 1755 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int iMyTid = 23 - (Process.myTid() >> 22);
                        byte[] bArr6 = $$a;
                        byte b3 = bArr6[7];
                        Object[] objArr16 = new Object[1];
                        a(b3, bArr6[5], b3, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, scrollBarSize, iMyTid, 986134021, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    objArr = objArrTuitionPaymentFragmentbindingInflater1$7879113;
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
        int i6 = ((int[]) objArr[1])[0];
        int i7 = ((int[]) objArr[0])[0];
        if (i7 == i6) {
            int i8 = ((int[]) objArr[3])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i9 = (-1675824599) + (((~((-968354814) | iIdentityHashCode2)) | 280240700 | (~(755752387 | iIdentityHashCode2))) * (-880));
            int i10 = (~((-968354814) | (~iIdentityHashCode2))) | (-755752388);
            int i11 = ~(iIdentityHashCode2 | 968354813);
            int i12 = i8 + i9 + ((i10 | i11) * (-880)) + (i11 * 880);
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr2[3])[0] = i14 ^ (i14 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i7];
            int i15 = i7 - 1;
            iArr[i15] = 1;
            Toast.makeText((Context) null, iArr[((i7 * i15) % 2) - 1], 1).show();
            int i16 = ((int[]) objArr[3])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int i17 = ~((int) Process.getStartUptimeMillis());
            int i18 = i16 + (-381043248) + (((~((-320040931) | i17)) | 107438504) * (-933)) + (((~(i17 | 107438504)) | (-393703403)) * 933) + 7609640;
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr2[3])[0] = i20 ^ (i20 << 5);
        }
        synchronized (this) {
            obj = this.zza;
            if (this.zzb) {
                Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            zza(obj);
        }
        synchronized (this) {
            int i21 = ((int[]) objArr2[3])[0];
            int i22 = i21 * i21;
            int i23 = -(1401684514 * i21);
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            int i25 = -(i21 * (-1671599682));
            int i26 = (i24 & i25) + (i25 | i24);
            int i27 = (i26 ^ 1926054144) + ((1926054144 & i26) << 1);
            int i28 = ((i27 >> 18) - 32767) / 16384;
            int i29 = ((i27 >> 15) - 262143) / 131072;
            int i30 = -(((i27 - (~((i28 & 1) + (i28 | 1)))) - 1) ^ (((i29 | 1) << 1) - (i29 ^ 1)));
            int i31 = (i30 & 4) + (i30 | 4);
            int i32 = i31 >> 23;
            int i33 = (((i32 & (-1023)) + (i32 | (-1023))) / 512) + 1;
            this.zzb = 1532 / (((-(((i33 | 1) << 1) - (i33 ^ 1))) & i31) * 383);
        }
        zzg();
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i4 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i5 = $11 + 117;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1];
                i2 = 1;
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                i2 = 0;
            }
            int i6 = 58224;
            while (i2 < 16) {
                int i7 = $11 + 25;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 47773);
                        int iRgb = Color.rgb(i4, i4, i4) + 16777684;
                        int trimmedLength = 13 - TextUtils.getTrimmedLength("");
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, iRgb, trimmedLength, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i11 = i6;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getLongPressTimeout() >> 16) + 468, 13 - TextUtils.indexOf("", ""), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 = i11 - 40503;
                    i2++;
                    i4 = 0;
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
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2322, TextUtils.indexOf("", "") + 44, -1312321721, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    public final void zzf() {
        synchronized (this) {
            this.zza = null;
        }
    }

    public final void zzg() {
        zzf();
        synchronized (BaseGmsClient.zzf(this.zzd)) {
            BaseGmsClient.zzf(this.zzd).remove(this);
        }
    }

    public zzc(BaseGmsClient baseGmsClient, Object obj) {
        this.zzd = baseGmsClient;
        this.zza = obj;
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
    private static java.lang.String $$e(byte r7, byte r8, short r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r8 = r8 * 2
            int r8 = r8 + 108
            byte[] r0 = com.google.android.gms.common.internal.zzc.$$c
            int r9 = r9 * 2
            int r9 = 4 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r8 = r9
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L2a:
            int r3 = -r3
            int r9 = r9 + r3
            int r8 = r8 + 1
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzc.$$e(byte, byte, short):java.lang.String");
    }
}
