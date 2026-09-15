package com.google.android.libraries.places.api.model;

import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
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
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcb implements Parcelable.Creator {
    private static final byte[] $$c = {89, 107, -36, -112};
    private static final int $$f = 41;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {55, -64, 35, -71, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 122;
    private static final byte[] $$a = {58, -103, 118, 14, 2, -10, 10};
    private static final int $$b = 208;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int g = 1;
    private static char b = 5596;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 56148;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 48530;
    private static char TuitionPaymentFragmentbindingInflater1 = 48735;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 3
            int r0 = 4 - r6
            byte[] r1 = com.google.android.libraries.places.api.model.zzcb.$$a
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r5 = r5 * 2
            int r5 = 111 - r5
            byte[] r0 = new byte[r0]
            int r6 = 3 - r6
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
            int r3 = r3 + 1
            r4 = r1[r7]
        L2a:
            int r7 = r7 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzcb.a(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = 103 - r6
            int r7 = r7 * 52
            int r7 = 53 - r7
            int r8 = r8 + 4
            byte[] r0 = com.google.android.libraries.places.api.model.zzcb.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            int r8 = r8 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-11)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzcb.c(short, byte, byte, java.lang.Object[]):void");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        zzcc zzccVar = new zzcc((ParcelUuid) parcel.readParcelable(AutocompleteSessionToken.class.getClassLoader()));
        int i2 = g + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 52 / 0;
        }
        return zzccVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = i3 + 7;
        g = i4 % 128;
        int i5 = i4 % 2;
        zzcc[] zzccVarArr = new zzcc[i];
        int i6 = i3 + 35;
        g = i6 % 128;
        int i7 = i6 % 2;
        return zzccVarArr;
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                break;
            }
            int i4 = $11 + 7;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            char c = 1;
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i6 = 58224;
            int i7 = 0;
            while (i7 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                int i8 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)));
                int i9 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentbindingInflater1);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', i3, i3) + 47774);
                        int i10 = 468 - (CdmaCellLocation.convertQuartSecToDecDegrees(i3) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i3) == 0.0d ? 0 : -1));
                        int i11 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i10, i11, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 47774), (Process.myPid() >> 22) + 468, KeyEvent.keyCodeFromString("") + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    c = 1;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = (byte) (b2 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 2323 - Gravity.getAbsoluteGravity(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43, -1312321721, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
        int i12 = $10 + 11;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    zzcb() {
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(List list) throws Throwable {
        Method[] methodArr;
        Class<AssetManager> cls;
        String str;
        Class<?>[] clsArr;
        char c;
        int i;
        int i2;
        String string;
        Method method;
        Method[] declaredMethods;
        int length;
        Class<?> cls2;
        char[] cArr;
        float f;
        int i3;
        float length2;
        Method[] methodArr2;
        int i4;
        int i5;
        int i6;
        Object obj;
        int i7;
        int minimumFlingVelocity;
        int i8;
        int i9;
        int i10 = 2;
        int i11 = 2 % 2;
        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        g = i12 % 128;
        int i13 = 1;
        if (i12 % 2 == 0) {
            methodArr = new Method[0];
            cls = AssetManager.class;
            byte b2 = (byte) 0;
            byte b3 = b2;
            Object[] objArr = new Object[1];
            a(b2, b3, b3, objArr);
            str = (String) objArr[0];
            clsArr = new Class[1];
            c = 1;
        } else {
            methodArr = new Method[1];
            cls = AssetManager.class;
            byte b4 = (byte) 0;
            byte b5 = b4;
            Object[] objArr2 = new Object[1];
            a(b4, b5, b5, objArr2);
            str = (String) objArr2[0];
            clsArr = new Class[1];
            c = 0;
        }
        clsArr[0] = String.class;
        methodArr[c] = cls.getMethod(str, clsArr);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int iLastIndexOf = 2822 - TextUtils.lastIndexOf("", '0', 0);
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 22;
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            c(bArr[10], bArr[7], (byte) (-bArr[5]), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, iLastIndexOf, threadPriority, 1814927978, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
            g = i14 % 128;
            if (i14 % 2 == 0) {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.alpha(0), 2822 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21)).getDeclaredMethods();
                length = declaredMethods.length;
            } else {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2823 - TextUtils.getTrimmedLength(""), 22 - TextUtils.indexOf("", "", 0, 0))).getDeclaredMethods();
                length = declaredMethods.length;
            }
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i16 = (i15 ^ 19) + ((i15 & 19) << 1);
            g = i16 % 128;
            int i17 = i16 % 2;
            int i18 = 0;
            while (i18 < length) {
                Method method2 = declaredMethods[i18];
                int i19 = g + 19;
                int i20 = i19 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20;
                int i21 = i19 % i10;
                int i22 = i20 + 69;
                g = i22 % 128;
                int i23 = i22 % i10;
                try {
                    char[] cArr2 = {41672, 40735, 34881, 34455, 31560, 2981, 28689, 31089, 19348, 57449, 17058, 16512, 64144, 12900, 6525, 24386, 46962, 28230, 22085, 35141, 64031, 15879, 45723, 40243, 45999, 2212};
                    int i24 = -Process.getGidForName("");
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i25 = (((i24 * 141) - 6417) - (~(-(-(((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 23) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & 23)) * 140))))) - i13;
                    int i26 = ~i24;
                    int i27 = ~((i26 ^ 23) | (i26 & 23));
                    int i28 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i29 = -(-((i27 | (~((i28 ^ 23) | (i28 & 23)))) * (-280)));
                    int i30 = (i25 ^ i29) + ((i25 & i29) << i13);
                    int i31 = ~(((-24) & i24) | ((-24) ^ i24));
                    int i32 = g + 51;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i32 % 128;
                    if (i32 % i10 != 0) {
                        int i33 = ~((i28 & i24) | (i28 ^ i24));
                        int i34 = (i31 & i33) | (i31 ^ i33);
                        int i35 = ~i24;
                        int i36 = (i35 & 23) | (i35 ^ 23);
                        int i37 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & i36) | (i36 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        Object[] objArr4 = new Object[i13];
                        d(cArr2, i30 % (140 << ((i34 & i37) | (i34 ^ i37))), objArr4);
                        cls2 = Class.forName((String) objArr4[0]);
                        cArr = new char[]{39709, 41093, 40523, 13365, 53611, 59923, 58386, 62452, 36281, 48589, 26315, 22551, 46170, 48404};
                        length2 = PointF.length(1.0f, 1.0f);
                        i3 = 70;
                        f = 2.0f;
                    } else {
                        int i38 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i39 = i31 | (~((i38 & i24) | (i38 ^ i24)));
                        int i40 = ~i24;
                        int i41 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault1 | (i40 & 23) | (i40 ^ 23));
                        int i42 = -(-(((i39 & i41) | (i39 ^ i41)) * 140));
                        int i43 = ((i30 | i42) << i13) - (i42 ^ i30);
                        Object[] objArr5 = new Object[i13];
                        d(cArr2, i43, objArr5);
                        cls2 = Class.forName((String) objArr5[0]);
                        cArr = new char[]{39709, 41093, 40523, 13365, 53611, 59923, 58386, 62452, 36281, 48589, 26315, 22551, 46170, 48404};
                        f = 0.0f;
                        i3 = 12;
                        length2 = PointF.length(0.0f, 0.0f);
                    }
                    int i44 = i3 + (length2 > f ? 1 : (length2 == f ? 0 : -1));
                    Object[] objArr6 = new Object[i13];
                    d(cArr, i44, objArr6);
                    Object[] objArr7 = new Object[i13];
                    objArr7[0] = Integer.valueOf(((Integer) cls2.getMethod((String) objArr6[0], null).invoke(method2, null)).intValue());
                    char[] cArr3 = {2199, 39765, 19941, 50750, 38259, 29303, 65015, 3482, 22892, 32630, 35696, 10366, 49088, 58718, 34354, 61243, 50698, 14819, 64190, 52457, 15184, 45715, 44948, 48431, 14182, 50392, 36610, 9164};
                    int iGreen = Color.green(0);
                    int i45 = g + 57;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i45 % 128;
                    int i46 = i45 % i10;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i47 = (iGreen * 765) - 39702;
                    int i48 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i49 = ~((i48 & iGreen) | (i48 ^ iGreen));
                    int i50 = -(-(((i49 & 26) | (i49 ^ 26)) * 764));
                    int i51 = (i47 ^ i50) + ((i47 & i50) << i13);
                    int i52 = g + 83;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i52 % 128;
                    int i53 = i52 % i10;
                    int i54 = ~iGreen;
                    int i55 = ~((i54 & 26) | (i54 ^ 26));
                    int i56 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i57 = ~((i56 ^ 26) | (i56 & 26));
                    int i58 = ((i55 & i57) | (i55 ^ i57)) * (-1528);
                    int i59 = (i51 & i58) + (i58 | i51);
                    int i60 = ~((~iGreen) | 26);
                    int i61 = ~(((-27) & iGreen) | ((-27) ^ iGreen));
                    int i62 = (i60 & i61) | (i60 ^ i61);
                    int i63 = ~(i56 | iGreen);
                    int i64 = i59 + (((i63 & i62) | (i62 ^ i63)) * 764);
                    Object[] objArr8 = new Object[i13];
                    d(cArr3, i64, objArr8);
                    Class<?> cls3 = Class.forName((String) objArr8[0]);
                    int i65 = -TextUtils.indexOf((CharSequence) "", '0');
                    int i66 = ((i65 | 7) << i13) - (i65 ^ 7);
                    Object[] objArr9 = new Object[i13];
                    d(new char[]{31970, 51668, 28775, 22806, 17006, 23800, 2139, 22329, 27135, 3979}, i66, objArr9);
                    String str2 = (String) objArr9[0];
                    Class<?>[] clsArr2 = new Class[i13];
                    clsArr2[0] = Integer.TYPE;
                    if (((Boolean) cls3.getMethod(str2, clsArr2).invoke(null, objArr7)).booleanValue()) {
                        Class cls4 = Long.TYPE;
                        Object[] objArr10 = new Object[i13];
                        d(new char[]{41672, 40735, 34881, 34455, 31560, 2981, 28689, 31089, 19348, 57449, 17058, 16512, 64144, 12900, 6525, 24386, 46962, 28230, 22085, 35141, 64031, 15879, 45723, 40243, 45999, 2212}, 24 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr10);
                        Class<?> cls5 = Class.forName((String) objArr10[0]);
                        char[] cArr4 = {36635, 38497, 32922, '\'', 61746, 31233, 49648, 38960, 22868, 48011, 5963, 14824, 24531, 253, 39332, 18717};
                        char mirror = AndroidCharacter.getMirror('0');
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i67 = mirror * 64785;
                        int i68 = ((i67 | 26285) << i13) - (i67 ^ 26285);
                        int i69 = ~mirror;
                        int i70 = ~((i69 ^ 34) | (i69 & 34));
                        int i71 = ~mirror;
                        int i72 = g;
                        int i73 = (i72 & 13) + (i72 | 13);
                        methodArr2 = declaredMethods;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i73 % 128;
                        if (i73 % 2 != 0) {
                            int i74 = -(-(1504 << ((~((i71 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i71 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) | i70)));
                            i4 = ((i68 | i74) << 1) - (i74 ^ i68);
                            i5 = i71 ^ (-35);
                            i6 = i71 & (-35);
                        } else {
                            int i75 = ~((i71 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i71 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            i4 = i68 + (((i70 ^ i75) | (i75 & i70)) * 1504);
                            i5 = i69 ^ (-35);
                            i6 = i69 & (-35);
                        }
                        int i76 = i5 | i6;
                        int i77 = (i4 - (~(-(-((-1504) * (~((i76 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i76 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3)))))))) - 1;
                        int i78 = ~((i71 ^ (-35)) | (i71 & (-35)));
                        int i79 = (i72 ^ 91) + ((i72 & 91) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i79 % 128;
                        int i80 = i79 % 2;
                        int i81 = ~(('\"' & mirror) | ('\"' ^ mirror));
                        int i82 = 752 * ((i78 & i81) | (i78 ^ i81));
                        int i83 = (i77 ^ i82) + ((i82 & i77) << 1);
                        Object[] objArr11 = new Object[1];
                        d(cArr4, i83, objArr11);
                        if (!cls4.equals(cls5.getMethod((String) objArr11[0], null).invoke(method2, null))) {
                            continue;
                        } else {
                            int i84 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
                            g = i84 % 128;
                            if (i84 % 2 == 0) {
                                Object[] objArr12 = new Object[1];
                                d(new char[]{41672, 40735, 34881, 34455, 31560, 2981, 28689, 31089, 19348, 57449, 17058, 16512, 64144, 12900, 6525, 24386, 46962, 28230, 22085, 35141, 64031, 15879, 45723, 40243, 45999, 2212}, 87 - (~(-(TypedValue.complexToFraction(0, 2.0f, 2.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 2.0f, 2.0f) == 0.0f ? 0 : -1)))), objArr12);
                                obj = objArr12[0];
                            } else {
                                int i85 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                int i86 = (i85 ^ 24) + ((i85 & 24) << 1);
                                Object[] objArr13 = new Object[1];
                                d(new char[]{41672, 40735, 34881, 34455, 31560, 2981, 28689, 31089, 19348, 57449, 17058, 16512, 64144, 12900, 6525, 24386, 46962, 28230, 22085, 35141, 64031, 15879, 45723, 40243, 45999, 2212}, i86, objArr13);
                                obj = objArr13[0];
                            }
                            Class<?> cls6 = Class.forName((String) obj);
                            char[] cArr5 = {19038, 40308, 42649, 30905, 65148, 37177, 49944, 41511, 29851, 20334, 8231, 2473, 37778, 12294, 37997, 5443, 41731, 59802, 48295, 4588};
                            int i87 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i88 = g + 63;
                            int i89 = i88 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i89;
                            if (i88 % 2 != 0) {
                                i7 = ((-518) % i87) << (-534);
                            } else {
                                int i90 = i87 * (-518);
                                i7 = ((i90 & (-8288)) << 1) + (i90 ^ (-8288));
                            }
                            int i91 = ~i87;
                            int i92 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                            int i93 = ~((i91 ^ i92) | (i91 & i92));
                            int i94 = i7 + (519 * ((i93 & 16) | (i93 ^ 16)));
                            int i95 = (i91 & i92) | (i91 ^ i92);
                            int i96 = ~((i95 & 16) | (i95 ^ 16));
                            int i97 = ((i89 | 123) << 1) - (i89 ^ 123);
                            int i98 = i97 % 128;
                            g = i98;
                            int i99 = i97 % 2;
                            int i100 = (i87 ^ 16) | (i87 & 16);
                            int i101 = ~((i100 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i100 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                            int i102 = (-519) * ((i96 & i101) | (i96 ^ i101));
                            int i103 = (i94 ^ i102) + ((i94 & i102) << 1);
                            int i104 = ((i98 | 29) << 1) - (i98 ^ 29);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i104 % 128;
                            int i105 = i104 % 2;
                            int i106 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & 16) | (16 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                            int i107 = 519 * ((i87 & i106) | (i87 ^ i106));
                            Object[] objArr14 = new Object[1];
                            d(cArr5, (i103 & i107) + (i107 | i103), objArr14);
                            Object objInvoke = cls6.getMethod((String) objArr14[0], null).invoke(method2, null);
                            int i108 = g;
                            int i109 = (i108 ^ 59) + ((i108 & 59) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i109 % 128;
                            int i110 = i109 % 2;
                            Object[] objArr15 = (Object[]) objInvoke;
                            if (objArr15.length == 2 && Long.TYPE.equals(objArr15[0])) {
                                int i111 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i112 = (i111 ^ 75) + ((i111 & 75) << 1);
                                g = i112 % 128;
                                char[] cArr6 = {41672, 40735, 34881, 34455, 31560, 2981, 28689, 31089, 19348, 57449, 17058, 16512, 64144, 12900, 6525, 24386, 46962, 28230, 22085, 35141, 64031, 15879, 45723, 40243, 45999, 2212};
                                if (i112 % 2 == 0) {
                                    int minimumFlingVelocity2 = ViewConfiguration.getMinimumFlingVelocity();
                                    minimumFlingVelocity = (minimumFlingVelocity2 ^ 53) + ((minimumFlingVelocity2 & 53) << 1);
                                    i8 = 49;
                                } else {
                                    minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                    i8 = 24;
                                }
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i113 = minimumFlingVelocity * 934;
                                int i114 = -(-(i8 * (-932)));
                                int i115 = ((i113 | i114) << 1) - (i113 ^ i114);
                                int i116 = ~i8;
                                int i117 = g;
                                int i118 = i117 + 117;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i118 % 128;
                                if (i118 % 2 != 0) {
                                    int i119 = ~minimumFlingVelocity;
                                    int i120 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                    int i121 = ~((i119 & i120) | (i119 ^ i120));
                                    i9 = i115 >> (((i121 & i116) | (i116 ^ i121)) * (-933));
                                } else {
                                    int i122 = ~minimumFlingVelocity;
                                    int i123 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                    int i124 = ~((i122 & i123) | (i122 ^ i123));
                                    int i125 = ((i124 & i116) | (i116 ^ i124)) * (-933);
                                    i9 = ((i115 | i125) << 1) - (i115 ^ i125);
                                }
                                int i126 = -(-(933 * ((~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | i116)) | (~((i116 & minimumFlingVelocity) | (i116 ^ minimumFlingVelocity))))));
                                int i127 = (i9 ^ i126) + ((i126 & i9) << 1);
                                int i128 = i117 + 111;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i128 % 128;
                                int i129 = i128 % 2;
                                int i130 = -(-(933 * (~((i8 & minimumFlingVelocity) | (minimumFlingVelocity ^ i8)))));
                                int i131 = ((i127 | i130) << 1) - (i130 ^ i127);
                                Object[] objArr16 = new Object[1];
                                d(cArr6, i131, objArr16);
                                if (!(!Class.forName((String) objArr16[0]).equals(objArr15[1]))) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2823;
                                        int i132 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21;
                                        byte[] bArr2 = $$d;
                                        Object[] objArr17 = new Object[1];
                                        c(bArr2[10], bArr2[7], (byte) (-bArr2[5]), objArr17);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode, fadingEdgeLength, i132, 1814927978, false, (String) objArr17[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                                        int i133 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2823;
                                        int i134 = 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                        byte[] bArr3 = $$d;
                                        Object[] objArr18 = new Object[1];
                                        c(bArr3[10], bArr3[7], (byte) (-bArr3[5]), objArr18);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, i133, i134, 1814927978, false, (String) objArr18[0], null);
                                    }
                                    try {
                                        Object[] objArr19 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                                            int iAxisFromString = MotionEvent.axisFromString("") + 2824;
                                            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 23;
                                            byte[] bArr4 = $$d;
                                            byte b6 = bArr4[7];
                                            byte b7 = bArr4[5];
                                            Object[] objArr20 = new Object[1];
                                            c(b6, b7, (byte) (b7 | 50), objArr20);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState, iAxisFromString, bitsPerPixel, -2137287382, false, (String) objArr20[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr19)).longValue();
                                        break;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                }
                            }
                        }
                    } else {
                        methodArr2 = declaredMethods;
                    }
                    i18++;
                    int i135 = g + 103;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i135 % 128;
                    int i136 = i135 % 2;
                    declaredMethods = methodArr2;
                    i10 = 2;
                    i13 = 1;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int iResolveOpacity = 2823 - Drawable.resolveOpacity(0, 0);
            int i137 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22;
            byte[] bArr5 = $$d;
            Object[] objArr21 = new Object[1];
            c(bArr5[10], bArr5[7], (byte) (-bArr5[5]), objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSizeAndState, iResolveOpacity, i137, 1814927978, false, (String) objArr21[0], null);
        }
        Object[] objArr22 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
            int iMyPid = (Process.myPid() >> 22) + 2823;
            int packedPositionChild = 21 - ExpandableListView.getPackedPositionChild(0L);
            byte[] bArr6 = $$d;
            byte b8 = (byte) (bArr6[19] - 1);
            byte b9 = bArr6[5];
            Object[] objArr23 = new Object[1];
            c(b8, b9, (byte) (b9 | 50), objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(capsMode, iMyPid, packedPositionChild, 1025296417, false, (String) objArr23[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr22);
        Object[] objArr24 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 37656);
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 2720;
            int iIndexOf = 18 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            byte[] bArr7 = $$d;
            byte b10 = (byte) (bArr7[19] - 1);
            byte b11 = bArr7[5];
            Object[] objArr25 = new Object[1];
            c(b10, b11, (byte) (b11 | 50), objArr25);
            i = 0;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, scrollBarSize, iIndexOf, -1568796068, false, (String) objArr25[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        } else {
            i = 0;
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr24)).longValue();
        long j = -351056080;
        long j2 = (((long) 960) * j) + (((long) (-1917)) * jLongValue);
        long j3 = 959;
        long j4 = -1;
        long j5 = jLongValue ^ j4;
        long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
        long j6 = jElapsedRealtime ^ j4;
        Method[] methodArr3 = methodArr;
        long j7 = j2 + ((((j5 | j6) ^ j4) | ((j | jElapsedRealtime) ^ j4)) * j3) + (((long) (-959)) * j5) + (j3 * (((j5 | jElapsedRealtime) ^ j4) | ((j6 | j) ^ j4))) + ((long) (-1459349765));
        int i138 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i139 = ((i138 | 121) << 1) - (i138 ^ 121);
        g = i139 % 128;
        if (i139 % 2 == 0) {
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            i2 = ((int) (j7 >>> 70)) & (((((~((-1056841020) | iElapsedRealtime)) | 676472148) * 398) - 1229934176) + (((~((~iElapsedRealtime) | (-1056841020))) | 676472148) * 398));
        } else {
            int iNextInt = new Random().nextInt();
            i2 = ((int) (j7 >> 32)) & ((((~((~iNextInt) | (-83902725))) * 130) - 1732974430) + (((~(iNextInt | (-83902725))) | (-1876618112)) * 130));
        }
        int i140 = (int) Runtime.getRuntime().totalMemory();
        int i141 = ~i140;
        int i142 = ((int) j7) & (((((~(1099207604 | i141)) | (~((-338018806) | i140))) * 959) - 1601607531) + (((~(i140 | 1099207604)) | (~(i141 | (-338018806)))) * 959));
        int i143 = (i2 & i142) | (i2 ^ i142);
        int i144 = i143 >>> 24;
        int i145 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i146 = (i145 ^ 103) + ((i145 & 103) << 1);
        int i147 = i146 % 128;
        g = i147;
        int i148 = i146 % 2;
        int i149 = i143 & ViewCompat.MEASURED_SIZE_MASK;
        int i150 = i144 != 0 ? 1 : i;
        if (i150 != 0) {
            int i151 = i147 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i151 % 128;
            int i152 = i151 % 2;
            i = 1;
        } else {
            int i153 = ((i145 | 17) << 1) - (i145 ^ 17);
            g = i153 % 128;
            int i154 = i153 % 2;
        }
        if ((i150 ^ 1) == 0 && i149 < methodArr3.length && (method = methodArr3[i149]) != null) {
            string = method.toString();
            int i155 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i156 = (i155 ^ 87) + ((i155 & 87) << 1);
            g = i156 % 128;
            if (i156 % 2 == 0) {
                int i157 = 5 % 5;
            }
        } else {
            string = null;
        }
        list.add(string);
        int i158 = (i144 & 6) + (i144 | 6);
        int i159 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
        g = i159 % 128;
        return i159 % 2 == 0 ? i158 >> i : i158 * i;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r5, byte r6, int r7) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 108
            int r6 = r6 + 4
            int r5 = r5 * 3
            int r0 = 1 - r5
            byte[] r1 = com.google.android.libraries.places.api.model.zzcb.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
        L28:
            int r7 = r7 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzcb.$$g(short, byte, int):java.lang.String");
    }
}
