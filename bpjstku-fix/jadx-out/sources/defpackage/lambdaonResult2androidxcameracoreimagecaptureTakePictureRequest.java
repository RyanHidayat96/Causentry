package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@getExtraEncoderProfiles
public class lambdaonResult2androidxcameracoreimagecaptureTakePictureRequest implements lambdaonResult1androidxcameracoreimagecaptureTakePictureRequest {
    private final TakePictureRequestExternalSyntheticLambda2 TuitionPaymentFragmentbindingInflater1;
    private final b TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Map<String, TakePictureRequestExternalSyntheticLambda4> b;
    private static final byte[] $$c = {23, -73, 107, 5};
    private static final int $$d = 56;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {109, 48, -62, 38, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 229;
    private static int g = 0;
    private static int asBinder = 1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 20077;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 33183;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f1253a = 59822;
    private static char d = 23593;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 52
            int r0 = 53 - r5
            int r7 = r7 + 4
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r1 = defpackage.lambdaonResult2androidxcameracoreimagecaptureTakePictureRequest.$$a
            byte[] r0 = new byte[r0]
            int r5 = 52 - r5
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r5
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r7 = r7 + 1
            r3 = r1[r7]
        L2a:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdaonResult2androidxcameracoreimagecaptureTakePictureRequest.e(byte, int, short, java.lang.Object[]):void");
    }

    @isSamsungJ6
    lambdaonResult2androidxcameracoreimagecaptureTakePictureRequest(Context context, TakePictureRequestExternalSyntheticLambda2 takePictureRequestExternalSyntheticLambda2) {
        this(new b(context), takePictureRequestExternalSyntheticLambda2);
    }

    private lambdaonResult2androidxcameracoreimagecaptureTakePictureRequest(b bVar, TakePictureRequestExternalSyntheticLambda2 takePictureRequestExternalSyntheticLambda2) {
        this.b = new HashMap();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bVar;
        this.TuitionPaymentFragmentbindingInflater1 = takePictureRequestExternalSyntheticLambda2;
    }

    @Override // defpackage.lambdaonResult1androidxcameracoreimagecaptureTakePictureRequest
    public final TakePictureRequestExternalSyntheticLambda4 TuitionPaymentFragmentbindingInflater1(String str) {
        synchronized (this) {
            if (this.b.containsKey(str)) {
                return this.b.get(str);
            }
            lambdaonPostviewBitmapAvailable4androidxcameracoreimagecaptureTakePictureRequest lambdaonpostviewbitmapavailable4androidxcameracoreimagecapturetakepicturerequestB = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(str);
            if (lambdaonpostviewbitmapavailable4androidxcameracoreimagecapturetakepicturerequestB == null) {
                return null;
            }
            TakePictureRequestExternalSyntheticLambda2 takePictureRequestExternalSyntheticLambda2 = this.TuitionPaymentFragmentbindingInflater1;
            TakePictureRequestExternalSyntheticLambda4 takePictureRequestExternalSyntheticLambda4Create = lambdaonpostviewbitmapavailable4androidxcameracoreimagecapturetakepicturerequestB.create(new lambdaonError0androidxcameracoreimagecaptureTakePictureRequest(takePictureRequestExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, takePictureRequestExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, takePictureRequestExternalSyntheticLambda2.b, str));
            this.b.put(str, takePictureRequestExternalSyntheticLambda4Create);
            return takePictureRequestExternalSyntheticLambda4Create;
        }
    }

    static class b {
        private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private Map<String, String> b = null;

        b(Context context) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context;
        }

        private static Bundle TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) == null) {
                    return null;
                }
                return ((PackageItemInfo) serviceInfo).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        final lambdaonPostviewBitmapAvailable4androidxcameracoreimagecaptureTakePictureRequest b(String str) {
            Map<String, String> mapEmptyMap;
            if (this.b == null) {
                Bundle bundleTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                if (bundleTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    mapEmptyMap = Collections.emptyMap();
                } else {
                    HashMap map = new HashMap();
                    for (String str2 : bundleTuitionPaymentFragmentspecialinlinedviewModeldefault3.keySet()) {
                        Object obj = bundleTuitionPaymentFragmentspecialinlinedviewModeldefault3.get(str2);
                        if ((obj instanceof String) && str2.startsWith("backend:")) {
                            for (String str3 : ((String) obj).split(",", -1)) {
                                String strTrim = str3.trim();
                                if (!strTrim.isEmpty()) {
                                    map.put(strTrim, str2.substring(8));
                                }
                            }
                        }
                    }
                    mapEmptyMap = map;
                }
                this.b = mapEmptyMap;
            }
            String str4 = this.b.get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (lambdaonPostviewBitmapAvailable4androidxcameracoreimagecaptureTakePictureRequest) Class.forName(str4).asSubclass(lambdaonPostviewBitmapAvailable4androidxcameracoreimagecaptureTakePictureRequest.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                new Object[]{str4};
                return null;
            } catch (IllegalAccessException unused2) {
                new Object[]{str4};
                return null;
            } catch (InstantiationException unused3) {
                new Object[]{str4};
                return null;
            } catch (NoSuchMethodException unused4) {
                new Object[]{str4};
                return null;
            } catch (InvocationTargetException unused5) {
                new Object[]{str4};
                return null;
            }
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                int i5 = $11 + 31;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[c];
                int i7 = (c3 + i3) ^ ((c3 << 4) + ((char) (((long) f1253a) ^ 8611973335120459638L)));
                int i8 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(d);
                    objArr2[2] = Integer.valueOf(i8);
                    objArr2[1] = Integer.valueOf(i7);
                    objArr2[c] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c4 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 47772);
                        int i9 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 468;
                        int i10 = 14 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[c] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c4, i9, i10, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i11 = i4;
                    Object[] objArr3 = {Integer.valueOf(cArr3[c]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 468 - KeyEvent.getDeadChar(0, 0), 12 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i3 -= 40503;
                    i4 = i11 + 1;
                    c = 0;
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
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 2323 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 44, -1312321721, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i12 = $11 + 115;
            $10 = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:124:0x0902  */
    /* JADX WARN: Code duplicated, block: B:127:0x0a09 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:128:0x0a0a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v25, types: [int] */
    public static Object[] TuitionPaymentFragmentbindingInflater1(Class cls, int i, int i2, int i3) throws Throwable {
        String str;
        long j;
        char c;
        String str2;
        int i4;
        int i5;
        int i6;
        int i7;
        Object[] objArr;
        int i8;
        int i9;
        String str3;
        String str4;
        String string;
        int i10;
        int i11;
        Class<?> cls2;
        Object obj;
        Object obj2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 2 % 2;
        if ((i2 & 2) != 0) {
            String[][] strArr = new String[1][];
            try {
                int i17 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                Object[] objArr2 = new Object[1];
                c(new char[]{10394, 59244, 46862, 17878, 48648, 16082, 54537, 18153, 24067, 14138}, (i17 ^ 7) + ((i17 & 7) << 1), objArr2);
                String str5 = (String) objArr2[0];
                int i18 = g;
                int i19 = (i18 ^ 85) + ((i18 & 85) << 1);
                asBinder = i19 % 128;
                if (i19 % 2 == 0) {
                    Field declaredField = Class.class.getDeclaredField(str5);
                    declaredField.setAccessible(true);
                    obj2 = declaredField.get(cls);
                } else {
                    Field declaredField2 = Class.class.getDeclaredField(str5);
                    declaredField2.setAccessible(true);
                    obj2 = declaredField2.get(cls);
                }
                Class<?> cls3 = obj2.getClass();
                int i20 = g;
                int i21 = (i20 & 87) + (i20 | 87);
                asBinder = i21 % 128;
                int i22 = i21 % 2;
                char[] cArr = {30187, 24965, 2649, 33722, 3122, 43863, 28567, 24868, 15621, 60987};
                str4 = -ExpandableListView.getPackedPositionGroup(0L);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = wrapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i23 = (str4 * 673) - 9401;
                int i24 = ~((str4 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (str4 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                int i25 = -(-(((i24 ^ 7) | (i24 & 7)) * 672));
                int i26 = (i23 & i25) + (i25 | i23);
                int i27 = ~str4;
                int i28 = asBinder + 85;
                g = i28 % 128;
                if (i28 % 2 != 0) {
                    i12 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i29 = ~((i27 ^ i12) | (i27 & i12));
                    int i30 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 7) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & 7));
                    i13 = i26 / ((-672) / ((i29 ^ i30) | (i29 & i30)));
                } else {
                    i12 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i31 = ~((i27 ^ i12) | (i27 & i12));
                    int i32 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 7) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & 7));
                    i13 = (i26 - (~(((i31 ^ i32) | (i31 & i32)) * (-672)))) - 1;
                }
                int i33 = ~(((-8) ^ i12) | ((-8) & i12));
                int i34 = ~(((-8) ^ str4) | ((-8) & str4));
                Object[] objArr3 = new Object[1];
                c(cArr, (i13 - (~(-(-(((i33 & i34) | (i33 ^ i34)) * 672))))) - 1, objArr3);
                Field declaredField3 = cls3.getDeclaredField((String) objArr3[0]);
                declaredField3.setAccessible(true);
                try {
                    try {
                        Object[] objArr4 = {Long.valueOf(((Number) declaredField3.get(obj2)).longValue() & 281474976710655L), strArr};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486768121);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char tapTimeout = (char) (41241 - (ViewConfiguration.getTapTimeout() >> 16));
                            int i35 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1704;
                            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 21;
                            byte b2 = $$a[5];
                            byte b3 = b2;
                            Object[] objArr5 = new Object[1];
                            e(b2, b3, (byte) (-b3), objArr5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, i35, windowTouchSlop, -107095506, false, (String) objArr5[0], new Class[]{Long.TYPE, String[][].class});
                        }
                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr4)).longValue();
                        long j2 = -1095323891;
                        long j3 = 85;
                        long j4 = (j3 * j2) + (j3 * jLongValue);
                        long j5 = -84;
                        long j6 = -1;
                        long j7 = j2 ^ j6;
                        long j8 = jLongValue ^ j6;
                        long j9 = i;
                        long j10 = j9 ^ j6;
                        long j11 = j2 | jLongValue;
                        long j12 = (j10 | jLongValue) ^ j6;
                        long j13 = j4 + ((((j7 | j8) ^ j6) | ((j7 | j10) ^ j6) | ((j8 | j10) ^ j6) | ((j11 | j9) ^ j6)) * j5) + (j5 * (j2 | ((j8 | j9) ^ j6) | j12)) + (((long) 84) * (j12 | (j11 ^ j6))) + ((long) (-1010693170));
                        int i36 = ~i;
                        int i37 = ((int) (j13 >> 32)) & ((-1453938172) + (((~(500468125 | i36)) | 1937694536) * 519) + (((~(2147409885 | i36)) | (~((-209715350) | i))) * (-519)) + (((~(1937694536 | i)) | (-500468126)) * 519));
                        int i38 = ((int) j13) & (((((~((-357650693) | i)) | 1073742849) * 449) - 962033969) + ((1073742849 | (~((-357650693) | i36))) * 449));
                        int i39 = (i38 & i37) | (i37 ^ i38);
                        if (i39 != 0) {
                            int i40 = (i39 | i) & (~(i & i39));
                            String[] strArr2 = strArr[0];
                            String[] strArr3 = {cls.getName(), strArr2[0], strArr2[1], strArr2[2]};
                            Object[] objArr6 = new Object[4];
                            objArr6[0] = new int[1];
                            objArr6[1] = new int[]{i40};
                            objArr6[2] = new int[]{i};
                            int i41 = ~((-792330183) | i36);
                            int i42 = ~((-912701277) | i);
                            int i43 = 564486596 + ((i41 | i42) * 1150) + (((~(912701276 | i36)) | i42) * (-575)) + (((~((-792330183) | i)) | (~(792330182 | i36))) * 575);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = wrapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i44 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 16) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 16));
                            int i45 = ((10768 + (i43 * (-1343))) - (~(-(-(((i44 & i43) | (i43 ^ i44)) * 672))))) - 1;
                            int i46 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i47 = (i45 - (~(-(-(((~((i46 & (-17)) | ((-17) ^ i46))) | (~((i43 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i43 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2)))) * (-672)))))) - 1;
                            int i48 = g + 17;
                            asBinder = i48 % 128;
                            if (i48 % 2 == 0) {
                                int i49 = ~i43;
                                int i50 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i51 = ~((i50 & i49) | (i49 ^ i50));
                                int i52 = ~((~i43) | 16);
                                int i53 = i3 << (i47 * (672 >> ((i51 & i52) | (i51 ^ i52))));
                                int i54 = i53 << 94;
                                i14 = ((~i53) & i54) | ((~i54) & i53);
                                i15 = 53;
                            } else {
                                int i55 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (~i43));
                                int i56 = ~((~i43) | 16);
                                int i57 = ((i55 & i56) | (i55 ^ i56)) * 672;
                                int i58 = i3 + (i47 ^ i57) + ((i57 & i47) << 1);
                                int i59 = i58 << 13;
                                i14 = ((~i58) & i59) | ((~i59) & i58);
                                i15 = 17;
                            }
                            int i60 = i14 >>> i15;
                            int i61 = ((~i14) & i60) | ((~i60) & i14);
                            int i62 = i61 << 5;
                            ((int[]) objArr6[0])[0] = ((~i61) & i62) | ((~i62) & i61);
                            objArr6[3] = strArr3;
                            return objArr6;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            StringWriter stringWriter = new StringWriter();
                            try {
                                Object[] objArr7 = {new PrintWriter(stringWriter)};
                                char[] cArr2 = {11686, 3560, 58039, 8834, 55018, 8178, 7852, 63363, 49726, 65335, 20320, 14700, 565, 36586, 58619, 15870, 11150, 9956, 42226, 56651, 34058, 38914};
                                int i63 = -KeyEvent.keyCodeFromString(str4);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = wrapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i64 = i63 * 784;
                                int i65 = asBinder;
                                int i66 = i65 + 95;
                                g = i66 % 128;
                                if (i66 % 2 != 0) {
                                    i11 = (i64 >> 8191) + 763;
                                    i10 = 1;
                                } else {
                                    int i67 = i64 - 14858;
                                    i10 = 1;
                                    i11 = ((i67 | 15660) << 1) - (i67 ^ 15660);
                                }
                                int i68 = (i65 ^ 77) + ((i65 & 77) << i10);
                                g = i68 % 128;
                                int i69 = i68 % 2;
                                int i70 = ~i63;
                                int i71 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i72 = (i70 & i71) | (i70 ^ i71);
                                int i73 = -(-((-783) * (~((i72 & 19) | (i72 ^ 19)))));
                                int i74 = ~i63;
                                int i75 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i76 = ~((i75 & 19) | (i75 ^ 19));
                                int i77 = (((i11 | i73) << 1) - (i11 ^ i73)) + (((i74 & i76) | (i74 ^ i76)) * 783);
                                Object[] objArr8 = new Object[1];
                                c(cArr2, i77, objArr8);
                                String str6 = (String) objArr8[0];
                                int i78 = asBinder;
                                int i79 = (i78 & 75) + (i78 | 75);
                                g = i79 % 128;
                                if (i79 % 2 != 0) {
                                    cls2 = Class.forName(str6);
                                    int maxKeyCode = KeyEvent.getMaxKeyCode() >>> 52;
                                    int i80 = (maxKeyCode ^ 29) + ((maxKeyCode & 29) << 1);
                                    Object[] objArr9 = new Object[1];
                                    c(new char[]{53405, 15037, 13637, 18854, 63823, 15955, 19240, 29247, 46931, 60259, 1544, 13899, 62964, 16358, 59043, 22761, 39997, 42472}, i80, objArr9);
                                    obj = objArr9[0];
                                } else {
                                    cls2 = Class.forName(str6);
                                    int i81 = -(KeyEvent.getMaxKeyCode() >> 16);
                                    int i82 = ((i81 | 15) << 1) - (i81 ^ 15);
                                    Object[] objArr10 = new Object[1];
                                    c(new char[]{53405, 15037, 13637, 18854, 63823, 15955, 19240, 29247, 46931, 60259, 1544, 13899, 62964, 16358, 59043, 22761, 39997, 42472}, i82, objArr10);
                                    obj = objArr10[0];
                                }
                                String str7 = (String) obj;
                                int i83 = g;
                                int i84 = (i83 ^ 13) + ((i83 & 13) << 1);
                                asBinder = i84 % 128;
                                (i84 % 2 == 0 ? cls2.getMethod(str7, PrintWriter.class) : cls2.getMethod(str7, PrintWriter.class)).invoke(th, objArr7);
                                string = stringWriter.toString();
                            } catch (Throwable th2) {
                                Throwable cause = th2.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th2;
                            }
                        } catch (Throwable unused) {
                            Object[] objArr11 = new Object[1];
                            c(new char[]{35348, 3475, 29293, 35813}, 0 - (~(-View.MeasureSpec.makeMeasureSpec(0, 0))), objArr11);
                            string = (String) objArr11[0];
                        }
                        int i85 = (~(i & 31)) & (i | 31);
                        String[] strArr4 = {cls.getName(), string};
                        int[] iArr = {i85};
                        int i86 = ~i;
                        int i87 = 1900372993 + (((~((-29411396) | i86)) | (~((-33817745) | i)) | (~((-1612390925) | i))) * 765) + (((~((-63229140) | i86)) | 29411395) * 1530) + (((~(i | (-63229140))) | (~(i86 | (-1612390925)))) * 765);
                        int i88 = (i87 & 16) + (16 | i87);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = wrapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i89 = ((i88 * 659) - (~(-(-(i3 * (-657)))))) - 1;
                        int i90 = ~i88;
                        int i91 = ~((i90 & i3) | (i90 ^ i3));
                        int i92 = ~i3;
                        int i93 = (i92 ^ i88) | (i92 & i88);
                        int i94 = i91 | (~i93);
                        int i95 = ~(i88 | iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                        int i96 = i89 + (((i94 & i95) | (i94 ^ i95)) * (-658));
                        int i97 = -(-((~(i92 | i88)) * 658));
                        int i98 = ((((i96 | i97) << 1) - (i97 ^ i96)) - (~(((~((i88 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i88 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4))) | (~i93)) * 658))) - 1;
                        int i99 = i98 << 13;
                        int i100 = (i99 | i98) & (~(i98 & i99));
                        int i101 = i100 >>> 17;
                        int i102 = ((~i100) & i101) | ((~i101) & i100);
                        int i103 = i102 << 5;
                        ((int[]) objArr[0])[0] = ((~i102) & i103) | ((~i103) & i102);
                        Object[] objArr12 = {new int[1], iArr, new int[]{i}, strArr4};
                        return objArr12;
                    }
                } catch (Throwable th3) {
                    Throwable cause2 = th3.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                str4 = "";
            }
        }
        int[] iArr2 = {-1844476378, 1276062274, -797088743, 965014536, -30564408, 800164665, 427080095, -63109426, -2128711273, 443823261, -421827424, -1596256068, -554832609, -49350782, -437871410, 1291703475, -587285223, 1359539528, -706062319, 1866472215};
        String[][] strArr5 = new String[1][];
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i104 = (iCurrentTimeMillis | 343337308) & (~(iCurrentTimeMillis & 343337308));
        int i105 = i ^ i104;
        int i106 = asBinder;
        int i107 = (i106 ^ 101) + ((i106 & 101) << 1);
        g = i107 % 128;
        try {
            if (i107 % 2 != 0) {
                Object[] objArr13 = {Integer.valueOf(i105), iArr2, Integer.valueOf(i2), strArr5};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-561316232);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cKeyCodeFromString = (char) (43042 - KeyEvent.keyCodeFromString(r11));
                    str3 = "";
                    int iIndexOf = TextUtils.indexOf(str3, str3, 0) + 3111;
                    int i108 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21;
                    byte b4 = $$a[5];
                    byte b5 = b4;
                    Object[] objArr14 = new Object[1];
                    e(b4, b5, (byte) (-b5), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, iIndexOf, i108, 974412207, false, (String) objArr14[0], new Class[]{Integer.TYPE, int[].class, Integer.TYPE, String[][].class});
                } else {
                    str3 = r11;
                }
                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr13)).longValue();
                long j14 = -1772028366;
                str = str3;
                long jUptimeMillis = (int) SystemClock.uptimeMillis();
                long j15 = (((long) 860) * j14) + (((long) (-858)) * jLongValue2) + (((long) (-859)) * (j14 | jUptimeMillis));
                long j16 = 859;
                long j17 = -1;
                long j18 = jUptimeMillis ^ j17;
                long j19 = jLongValue2 ^ j17;
                j = j15 + ((((j18 | j14) ^ j17) | ((((j14 ^ j17) | j19) | jUptimeMillis) ^ j17)) * j16) + (j16 * ((j17 ^ (j19 | j14)) | ((j19 | j18) ^ j17))) + ((long) 1875762431);
                c = 'z';
            } else {
                str = r11;
                Object[] objArr15 = {Integer.valueOf(i105), iArr2, Integer.valueOf(i2), strArr5};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-561316232);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cMakeMeasureSpec = (char) (43042 - View.MeasureSpec.makeMeasureSpec(0, 0));
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 3112;
                    int iBlue = 22 - Color.blue(0);
                    byte b6 = $$a[5];
                    byte b7 = b6;
                    Object[] objArr16 = new Object[1];
                    e(b6, b7, (byte) (-b7), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec, packedPositionChild, iBlue, 974412207, false, (String) objArr16[0], new Class[]{Integer.TYPE, int[].class, Integer.TYPE, String[][].class});
                }
                long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr15)).longValue();
                long j20 = -784819103;
                long j21 = 216;
                long j22 = i;
                long j23 = -1;
                long j24 = (((long) 217) * j20) + (((long) (-215)) * jLongValue3) + (((j20 | j22) ^ j23) * j21);
                long j25 = j22 ^ j23;
                j = j24 + (((long) (-216)) * (j20 | (jLongValue3 ^ j23) | j25)) + (j21 * (jLongValue3 | ((j25 | j20) ^ j23))) + ((long) 888553168);
                c = ' ';
            }
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i109 = ~iMaxMemory;
            int i110 = ((int) (j >> c)) & (648713810 + (((-1615400204) | iMaxMemory) * 140) + (((~((-1615400204) | i109)) | 541130754) * (-280)) + (((~(iMaxMemory | (-541130755))) | (~((-1242340682) | i109)) | 168071232) * 140));
            int i111 = ~((-1829747722) | i);
            int i112 = (-860738127) + ((1074401281 | i111) * (-280)) + ((i111 | (~((-1027993165) | i))) * 140);
            int i113 = ~((-755346441) | i);
            int i114 = ~i;
            int i115 = ((int) j) & (i112 + ((i113 | (~((-1074401282) | i114)) | (~((-272646725) | i114))) * 140));
            int i116 = (i110 & i115) | (i110 ^ i115);
            int i117 = ((~i116) & i104) | ((~i104) & i116);
            if (i117 != i) {
                String[] strArr6 = strArr5[0];
                Object[] objArr17 = new Object[4];
                int i118 = g;
                int i119 = (i118 & 11) + (i118 | 11);
                asBinder = i119 % 128;
                int i120 = i119 % 2;
                objArr17[0] = new int[1];
                int[] iArr3 = new int[1];
                objArr17[1] = iArr3;
                int[] iArr4 = new int[1];
                objArr17[2] = iArr4;
                int i121 = i118 + 95;
                asBinder = i121 % 128;
                int i122 = i121 % 2 == 0 ? 65 : 16;
                iArr4[0] = i;
                iArr3[0] = i117;
                wrapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i123 = ~((int) SystemClock.uptimeMillis());
                int i124 = ((((1511855794 + (((~(i123 | (-270018075))) | (~((-25427969) | i123))) * (-184))) + (((704792708 | (~((-730220677) | i123))) | (~((-974810783) | i123))) * 184)) - 639663728) - (~i122)) - 1;
                wrapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                wrapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i125 = (i3 - (~i124)) - 1;
                int i126 = i125 << 13;
                int i127 = (i125 | i126) & (~(i125 & i126));
                int i128 = i127 >>> 17;
                int i129 = ((~i127) & i128) | ((~i128) & i127);
                int i130 = i129 << 5;
                int i131 = ((~i129) & i130) | ((~i130) & i129);
                Object obj3 = objArr17[0];
                wrapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                ((int[]) obj3)[0] = i131;
                objArr17[3] = strArr6;
                return objArr17;
            }
            try {
                char[] cArr3 = {23964, 46861, 35309, 3630, 64563, 38185, 7394, 43500, 1031, 3862, 50026, 12082, 32514, 13153, 35495, 38497, 47774, 18726, 41015, 39548, 54505, 61693, 52270, 15973, 3585, 13587, 49518, 18190};
                str2 = str;
                try {
                    int iIndexOf2 = TextUtils.indexOf(str2, str2, 0, 0);
                    int i132 = iIndexOf2 * (-519);
                    int i133 = ((i132 | 13546) << 1) - (i132 ^ 13546);
                    int i134 = ~iIndexOf2;
                    int i135 = ~i;
                    int i136 = ~((i134 ^ (-27)) | (i134 & (-27)) | i135);
                    int i137 = asBinder + 105;
                    g = i137 % 128;
                    if (i137 % 2 != 0) {
                        int i138 = ~((i ^ 26) | (i & 26));
                        int i139 = -((i136 & i138) | (i136 ^ i138));
                        int i140 = ((i139 | 520) << 1) - (i139 ^ 520);
                        i9 = (i133 ^ i140) + ((i133 & i140) << 1);
                    } else {
                        int i141 = ~((i ^ 26) | (i & 26));
                        int i142 = (i133 - (~(((i136 & i141) | (i136 ^ i141)) * 520))) - 1;
                        i135 = i114;
                        i9 = i142;
                    }
                    int i143 = ~(i135 | (-27));
                    int i144 = ~((iIndexOf2 ^ i) | (iIndexOf2 & i));
                    int i145 = (-1040) * ((i143 & i144) | (i143 ^ i144));
                    int i146 = ~(i134 | i114);
                    int i147 = ~((-27) | iIndexOf2);
                    int i148 = (i146 & i147) | (i146 ^ i147);
                    int i149 = ~(iIndexOf2 | i);
                    int i150 = (i9 ^ i145) + ((i9 & i145) << 1) + (((i149 & i148) | (i148 ^ i149)) * 520);
                    Object[] objArr18 = new Object[1];
                    c(cArr3, i150, objArr18);
                    Class<?> cls4 = Class.forName((String) objArr18[0]);
                    char[] cArr4 = {61914, 42200, 1210, 43454, 47539, 39504, 59323, 4669, 27723, 6941, 26885, 60174, 20421, 56774, 54487, 26238, 34479, 43735, 46925, 41043};
                    int defaultSize = View.getDefaultSize(0, 0);
                    int i151 = (defaultSize & 18) + (defaultSize | 18);
                    int i152 = g;
                    int i153 = (i152 & 81) + (i152 | 81);
                    asBinder = i153 % 128;
                    int i154 = i153 % 2;
                    Object[] objArr19 = new Object[1];
                    c(cArr4, i151, objArr19);
                    if (cls4.getMethod((String) objArr19[0], new Class[0]).invoke(null, null) != null) {
                        int i155 = asBinder;
                        int i156 = (i155 ^ 33) + ((i155 & 33) << 1);
                        g = i156 % 128;
                        int i157 = i156 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1289074282);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            i4 = 16;
                            char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 22878);
                            int iAxisFromString = MotionEvent.axisFromString(str2) + 595;
                            int scrollBarSize = 17 - (ViewConfiguration.getScrollBarSize() >> 8);
                            byte[] bArr = $$a;
                            byte b8 = bArr[7];
                            Object[] objArr20 = new Object[1];
                            e(b8, b8, (byte) (-bArr[5]), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength, iAxisFromString, scrollBarSize, -1471475267, false, (String) objArr20[0], null);
                        } else {
                            i4 = 16;
                        }
                        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null) != 0) {
                            int i158 = g + 1;
                            asBinder = i158 % 128;
                            int i159 = i158 % 2;
                            i5 = (~(i & 9)) & (i | 9);
                        }
                        if (i5 != i) {
                            i7 = i4;
                            i6 = 0;
                        } else {
                            int i160 = asBinder + 19;
                            g = i160 % 128;
                            int i161 = i160 % 2;
                            i6 = 0;
                            i7 = 0;
                        }
                        String[] strArr7 = new String[i6];
                        objArr = new Object[4];
                        objArr[i6] = new int[1];
                        objArr[1] = new int[]{i5};
                        int i162 = asBinder;
                        int i163 = i162 + 43;
                        g = i163 % 128;
                        int i164 = i163 % 2;
                        objArr[2] = new int[]{i};
                        int i165 = (((-578370750) + (((~((-1026756211) | i)) | 673253424) * 1504)) + ((~((-353502787) | i)) * (-1504))) - 972432928;
                        int i166 = ((i162 | 87) << 1) - (i162 ^ 87);
                        g = i166 % 128;
                        int i167 = i166 % 2;
                        int i168 = ((i7 * (-433)) - (~(i165 * (-216)))) - 1;
                        int i169 = ~i7;
                        int i170 = ~i;
                        int i171 = ~((i170 & i169) | (i169 ^ i170));
                        int i172 = ~i165;
                        wrapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        wrapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i173 = ~((i172 ^ i) | (i172 & i));
                        int i174 = 217 * ((i171 & i173) | (i171 ^ i173));
                        int i175 = (i168 & i174) + (i168 | i174);
                        int i176 = ~((i169 ^ i172) | (i169 & i172));
                        int i177 = ~i7;
                        int i178 = -(-((i176 | (~((i177 & i) | (i177 ^ i)))) * 217));
                        int i179 = (i175 ^ i178) + ((i178 & i175) << 1);
                        int i180 = ~((i172 ^ i114) | (i172 & i114));
                        int i181 = ((i180 & i7) | (i7 ^ i180)) * 217;
                        int i182 = ((i179 | i181) << 1) - (i181 ^ i179);
                        int i183 = ((i182 * (-55)) - (~(-(-(i3 * (-55)))))) - 1;
                        int i184 = asBinder;
                        int i185 = (i184 ^ 79) + ((i184 & 79) << 1);
                        g = i185 % 128;
                        int i186 = i185 % 2;
                        int i187 = ~(i | i182);
                        int i188 = i183 + (((i3 & i187) | (i3 ^ i187)) * 56);
                        int i189 = (~((i182 ^ i3) | (i182 & i3))) * (-56);
                        int i190 = (i188 ^ i189) + ((i188 & i189) << 1);
                        int i191 = ~((i114 ^ i3) | (i114 & i3));
                        int i192 = i190 + (((i191 & i182) | (i182 ^ i191)) * 56);
                        int i193 = (i192 << 13) ^ i192;
                        int i194 = i193 ^ (i193 >>> 17);
                        int i195 = i194 << 5;
                        ((int[]) objArr[0])[0] = (i194 | i195) & (~(i194 & i195));
                        objArr[3] = strArr7;
                        i8 = i184 + 69;
                        g = i8 % 128;
                        if (i8 % 2 == 0) {
                            return objArr;
                        }
                        throw null;
                    }
                    int i196 = asBinder + 71;
                    g = i196 % 128;
                    int i197 = i196 % 2;
                    i4 = 16;
                } catch (Exception unused2) {
                }
            } catch (Exception unused3) {
                str2 = str;
            }
            i5 = i;
            if (i5 != i) {
                i7 = i4;
                i6 = 0;
            } else {
                int i1610 = asBinder + 19;
                g = i1610 % 128;
                int i1611 = i1610 % 2;
                i6 = 0;
                i7 = 0;
            }
            String[] strArr8 = new String[i6];
            objArr = new Object[4];
            objArr[i6] = new int[1];
            objArr[1] = new int[]{i5};
            int i1612 = asBinder;
            int i1613 = i1612 + 43;
            g = i1613 % 128;
            int i1614 = i1613 % 2;
            objArr[2] = new int[]{i};
            int i1615 = (((-578370750) + (((~((-1026756211) | i)) | 673253424) * 1504)) + ((~((-353502787) | i)) * (-1504))) - 972432928;
            int i1616 = ((i1612 | 87) << 1) - (i1612 ^ 87);
            g = i1616 % 128;
            int i1617 = i1616 % 2;
            int i1618 = ((i7 * (-433)) - (~(i1615 * (-216)))) - 1;
            int i1619 = ~i7;
            int i1710 = ~i;
            int i1711 = ~((i1710 & i1619) | (i1619 ^ i1710));
            int i1712 = ~i1615;
            wrapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            wrapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i1713 = ~((i1712 ^ i) | (i1712 & i));
            int i1714 = 217 * ((i1711 & i1713) | (i1711 ^ i1713));
            int i1715 = (i1618 & i1714) + (i1618 | i1714);
            int i1716 = ~((i1619 ^ i1712) | (i1619 & i1712));
            int i1717 = ~i7;
            int i1718 = -(-((i1716 | (~((i1717 & i) | (i1717 ^ i)))) * 217));
            int i1719 = (i1715 ^ i1718) + ((i1718 & i1715) << 1);
            int i1810 = ~((i1712 ^ i114) | (i1712 & i114));
            int i1811 = ((i1810 & i7) | (i7 ^ i1810)) * 217;
            int i1812 = ((i1719 | i1811) << 1) - (i1811 ^ i1719);
            int i1813 = ((i1812 * (-55)) - (~(-(-(i3 * (-55)))))) - 1;
            int i1814 = asBinder;
            int i1815 = (i1814 ^ 79) + ((i1814 & 79) << 1);
            g = i1815 % 128;
            int i1816 = i1815 % 2;
            int i1817 = ~(i | i1812);
            int i1818 = i1813 + (((i3 & i1817) | (i3 ^ i1817)) * 56);
            int i1819 = (~((i1812 ^ i3) | (i1812 & i3))) * (-56);
            int i198 = (i1818 ^ i1819) + ((i1818 & i1819) << 1);
            int i199 = ~((i114 ^ i3) | (i114 & i3));
            int i1910 = i198 + (((i199 & i1812) | (i1812 ^ i199)) * 56);
            int i1911 = (i1910 << 13) ^ i1910;
            int i1912 = i1911 ^ (i1911 >>> 17);
            int i1913 = i1912 << 5;
            ((int[]) objArr[0])[0] = (i1912 | i1913) & (~(i1912 & i1913));
            objArr[3] = strArr8;
            i8 = i1814 + 69;
            g = i8 % 128;
            if (i8 % 2 == 0) {
                return objArr;
            }
            throw null;
        } catch (Throwable th5) {
            Throwable cause3 = th5.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r7, byte r8, byte r9) {
        /*
            byte[] r0 = defpackage.lambdaonResult2androidxcameracoreimagecaptureTakePictureRequest.$$c
            int r8 = r8 * 2
            int r8 = 108 - r8
            int r9 = r9 * 3
            int r9 = r9 + 4
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r5 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r9]
            r6 = r3
            r3 = r8
            r8 = r6
        L29:
            int r9 = r9 + 1
            int r8 = r8 + r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdaonResult2androidxcameracoreimagecaptureTakePictureRequest.$$e(int, byte, byte):java.lang.String");
    }
}
