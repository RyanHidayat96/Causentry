package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.ByteCompanionObject;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewPort {
    private static char[] TuitionPaymentFragmentbindingInflater1;
    private static AtomicLong TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static AtomicInteger TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asBinder;
    private static boolean asInterface;
    private static int b;
    private static boolean g;
    private static final byte[] $$c = {ByteCompanionObject.MAX_VALUE, 43, -39, -37};
    private static final int $$f = 73;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {ByteCompanionObject.MAX_VALUE, 43, -39, -37, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 20;
    private static final byte[] $$a = {83, ByteCompanionObject.MIN_VALUE, -37, -48, -2, 18, -18, -3};
    private static final int $$b = 12;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f240a = 0;
    private static int cancel = 1;
    private static int d = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~i6;
        int i11 = ~(i8 | i10);
        int i12 = i9 | i11;
        int i13 = (~(i6 | i8 | i4)) | (~(i7 | i2)) | (~(i10 | i7));
        int i14 = i4 + i2 + i3 + ((-1336646162) * i5) + (1706069763 * i);
        int i15 = i14 * i14;
        int i16 = ((i4 * (-1709230891)) - 203685888) + ((-1709230891) * i2) + ((-1137600936) * i12) + (568800468 * i11) + ((-568800468) * i13) + (2016935936 * i3) + ((-602931200) * i5) + ((-1331167232) * i) + ((-1604583424) * i15);
        int i17 = ((i4 * 112646815) - 831444653) + (i2 * 112646815) + (i12 * 520) + (i11 * (-260)) + (i13 * 260) + (i3 * 112647075) + (i5 * (-2078048118)) + (i * (-2015059991)) + (i15 * (-829161472));
        int i18 = i16 + (i17 * i17 * (-1266417664));
        if (i18 == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i18 != 2) {
            return i18 != 3 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : b(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = 115 - r6
            byte[] r0 = defpackage.ViewPort.$$a
            int r8 = r8 * 4
            int r8 = r8 + 5
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2c:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-1)
            int r7 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewPort.c(short, short, int, java.lang.Object[]):void");
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
    private static void e(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = 103 - r7
            byte[] r0 = defpackage.ViewPort.$$d
            int r8 = r8 * 52
            int r8 = 56 - r8
            int r9 = r9 * 52
            int r9 = 53 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r8 = r9
            r5 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-11)
            int r8 = r3 + 1
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewPort.e(short, short, int, java.lang.Object[]):void");
    }

    static {
        asBinder = 0;
        asBinder();
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("Utility");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sb.toString();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AtomicInteger(1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AtomicLong(0L);
        int i = d + 79;
        asBinder = i % 128;
        if (i % 2 != 0) {
            int i2 = 90 / 0;
        }
    }

    public static long TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        long jIncrementAndGet;
        int i = 2 % 2;
        int i2 = f240a + 11;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            jIncrementAndGet = TuitionPaymentFragmentspecialinlinedviewModeldefault1.incrementAndGet();
            int i3 = 69 / 0;
        } else {
            jIncrementAndGet = TuitionPaymentFragmentspecialinlinedviewModeldefault1.incrementAndGet();
        }
        int i4 = cancel + 13;
        f240a = i4 % 128;
        int i5 = i4 % 2;
        return jIncrementAndGet;
    }

    public static int b() {
        int i = 2 % 2;
        int i2 = f240a + 99;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        AtomicInteger atomicInteger = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 != 0) {
            return atomicInteger.getAndIncrement();
        }
        atomicInteger.getAndIncrement();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = f240a + 39;
        cancel = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(i2 % 2 == 0 ? 0 : 1);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        ApplicationInfo applicationInfo;
        int i = 0;
        Context context = (Context) objArr[0];
        int i2 = 2 % 2;
        int i3 = f240a + 33;
        cancel = i3 % 128;
        if (i3 % 2 != 0 ? context == null : context == null) {
            return 0;
        }
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(0L));
            } else {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
                int i4 = cancel + 1;
                f240a = i4 % 128;
                int i5 = i4 % 2;
            }
        } catch (Exception unused) {
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            int i6 = f240a + 121;
            cancel = i6 % 128;
            int i7 = i6 % 2;
            i = applicationInfo.targetSdkVersion;
            int i8 = cancel + 107;
            f240a = i8 % 128;
            int i9 = i8 % 2;
        }
        return Integer.valueOf(i);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x068c A[Catch: all -> 0x0710, IOException -> 0x072a, TRY_LEAVE, TryCatch #11 {IOException -> 0x072a, all -> 0x0710, blocks: (B:93:0x0643, B:94:0x0646, B:96:0x064d, B:97:0x0666, B:101:0x067a, B:107:0x0688, B:109:0x068c, B:113:0x069c, B:115:0x06a4, B:117:0x06a8, B:119:0x06ad, B:121:0x06b5, B:123:0x06b9, B:124:0x06c8, B:126:0x06d3, B:128:0x06d8, B:130:0x06df, B:131:0x06e5, B:104:0x0683), top: B:194:0x0643 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0690  */
    /* JADX WARN: Code duplicated, block: B:113:0x069c A[Catch: all -> 0x0710, IOException -> 0x072a, TRY_ENTER, TryCatch #11 {IOException -> 0x072a, all -> 0x0710, blocks: (B:93:0x0643, B:94:0x0646, B:96:0x064d, B:97:0x0666, B:101:0x067a, B:107:0x0688, B:109:0x068c, B:113:0x069c, B:115:0x06a4, B:117:0x06a8, B:119:0x06ad, B:121:0x06b5, B:123:0x06b9, B:124:0x06c8, B:126:0x06d3, B:128:0x06d8, B:130:0x06df, B:131:0x06e5, B:104:0x0683), top: B:194:0x0643 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x06a4 A[Catch: all -> 0x0710, IOException -> 0x072a, TryCatch #11 {IOException -> 0x072a, all -> 0x0710, blocks: (B:93:0x0643, B:94:0x0646, B:96:0x064d, B:97:0x0666, B:101:0x067a, B:107:0x0688, B:109:0x068c, B:113:0x069c, B:115:0x06a4, B:117:0x06a8, B:119:0x06ad, B:121:0x06b5, B:123:0x06b9, B:124:0x06c8, B:126:0x06d3, B:128:0x06d8, B:130:0x06df, B:131:0x06e5, B:104:0x0683), top: B:194:0x0643 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:132:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:137:0x06ed A[LOOP:2: B:108:0x068a->B:137:0x06ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:141:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:164:0x072c  */
    /* JADX WARN: Code duplicated, block: B:166:0x0731  */
    /* JADX WARN: Code duplicated, block: B:169:0x073e A[Catch: IOException -> 0x0743, TRY_ENTER, TRY_LEAVE, TryCatch #7 {IOException -> 0x0743, blocks: (B:142:0x0701, B:169:0x073e), top: B:189:0x0628 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x06eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x06df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x061e  */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws Throwable {
        int i;
        int i2;
        String string;
        Process process;
        InputStream inputStream;
        Process processStart;
        InputStream inputStream2;
        int i3;
        InputStream inputStream3;
        int i4;
        String strTrim;
        int i5;
        String[] strArrSplit;
        String str;
        int i6 = 2;
        int i7 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        byte b2 = (byte) 0;
        byte b3 = b2;
        Object[] objArr2 = new Object[1];
        c(b2, b3, b3, objArr2);
        Method[] methodArr = {ProcessBuilder.class.getMethod((String) objArr2[0], new Class[0])};
        int i8 = -2001519171;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        String str2 = "";
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int iKeyCodeFromString = 2823 - KeyEvent.keyCodeFromString("");
            int i9 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22;
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            e(bArr[10], bArr[5], bArr[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, iKeyCodeFromString, i9, 1814927978, false, (String) objArr3[0], null);
        }
        long j = 0;
        try {
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) != null) {
                i = i8;
                break;
            }
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 2823 - Color.green(0), 22 - ExpandableListView.getPackedPositionType(0L))).getDeclaredMethods();
            int length = declaredMethods.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i = i8;
                    break;
                }
                Method method = declaredMethods[i10];
                int i11 = cancel + 89;
                f240a = i11 % 128;
                int i12 = i11 % i6;
                try {
                    Object[] objArr4 = new Object[1];
                    f(null, null, 127 - ExpandableListView.getPackedPositionType(j), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr4);
                    Class<?> cls = Class.forName((String) objArr4[0]);
                    Object[] objArr5 = new Object[1];
                    f(null, null, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, new byte[]{-110, -120, -119, -111, -118, -111, -112, -113, -115, -116, -119, -121}, objArr5);
                    Object[] objArr6 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr5[0], null).invoke(method, null)).intValue())};
                    Object[] objArr7 = new Object[1];
                    f(null, null, 127 - TextUtils.getCapsMode("", 0, 0), new byte[]{-120, -119, -111, -118, -111, -112, -113, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr7);
                    Class<?> cls2 = Class.forName((String) objArr7[0]);
                    Object[] objArr8 = new Object[1];
                    f(null, null, 127 - View.combineMeasuredStates(0, 0), new byte[]{-119, -125, -111, -116, -126, -109, -110, -111}, objArr8);
                    if (((Boolean) cls2.getMethod((String) objArr8[0], Integer.TYPE).invoke(null, objArr6)).booleanValue()) {
                        Class cls3 = Long.TYPE;
                        Object[] objArr9 = new Object[1];
                        f(null, null, 127 - View.resolveSizeAndState(0, 0, 0), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr9);
                        Class<?> cls4 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        f(null, null, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new byte[]{-119, -104, -105, -106, -122, -120, -107, -116, -119, -108, -116, -119, -121}, objArr10);
                        if (cls3.equals(cls4.getMethod((String) objArr10[0], null).invoke(method, null))) {
                            int i13 = f240a + 91;
                            cancel = i13 % 128;
                            int i14 = i13 % 2;
                            Object[] objArr11 = new Object[1];
                            f(null, null, 128 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr11);
                            Class<?> cls5 = Class.forName((String) objArr11[0]);
                            Object[] objArr12 = new Object[1];
                            f(null, null, 128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new byte[]{-110, -119, -104, -105, -106, -120, -119, -116, -119, -102, -126, -120, -126, -103, -116, -119, -121}, objArr12);
                            Object[] objArr13 = (Object[]) cls5.getMethod((String) objArr12[0], null).invoke(method, null);
                            if (objArr13.length == 2 && Long.TYPE.equals(objArr13[0])) {
                                int i15 = f240a + 73;
                                cancel = i15 % 128;
                                int i16 = i15 % 2;
                                Object[] objArr14 = new Object[1];
                                f(null, null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr14);
                                if (Class.forName((String) objArr14[0]).equals(objArr13[1])) {
                                    int i17 = f240a + 51;
                                    cancel = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                                            int iKeyCodeFromString2 = 2823 - KeyEvent.keyCodeFromString("");
                                            int i18 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22;
                                            byte[] bArr2 = $$d;
                                            Object[] objArr15 = new Object[1];
                                            e(bArr2[10], bArr2[5], bArr2[7], objArr15);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild, iKeyCodeFromString2, i18, 1814927978, false, (String) objArr15[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                                            int iMyPid = 2823 - (Process.myPid() >> 22);
                                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22;
                                            byte[] bArr3 = $$d;
                                            Object[] objArr16 = new Object[1];
                                            e(bArr3[10], bArr3[5], bArr3[7], objArr16);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, iMyPid, maximumFlingVelocity, 1814927978, false, (String) objArr16[0], null);
                                        }
                                        Object[] objArr17 = {1L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char cMyPid = (char) (Process.myPid() >> 22);
                                            int packedPositionChild2 = 2822 - ExpandableListView.getPackedPositionChild(0L);
                                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 22;
                                            byte[] bArr4 = $$d;
                                            byte b4 = bArr4[7];
                                            Object[] objArr18 = new Object[1];
                                            e(b4, b4, bArr4[5], objArr18);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyPid, packedPositionChild2, iResolveSizeAndState, -2137287382, false, (String) objArr18[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr17)).longValue();
                                    } else {
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                            char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int size = View.MeasureSpec.getSize(0) + 2823;
                                            int i19 = 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                            byte[] bArr5 = $$d;
                                            Object[] objArr19 = new Object[1];
                                            e(bArr5[10], bArr5[5], bArr5[7], objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, size, i19, 1814927978, false, (String) objArr19[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, method);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                            char mode = (char) View.MeasureSpec.getMode(0);
                                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 2823;
                                            int gidForName = 21 - Process.getGidForName("");
                                            byte[] bArr6 = $$d;
                                            Object[] objArr20 = new Object[1];
                                            e(bArr6[10], bArr6[5], bArr6[7], objArr20);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode, scrollBarSize, gidForName, 1814927978, false, (String) objArr20[0], null);
                                        }
                                        Object[] objArr21 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                            char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                                            int packedPositionType = 2823 - ExpandableListView.getPackedPositionType(0L);
                                            int i20 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22;
                                            byte[] bArr7 = $$d;
                                            byte b5 = bArr7[7];
                                            Object[] objArr22 = new Object[1];
                                            e(b5, b5, bArr7[5], objArr22);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cRgb, packedPositionType, i20, -2137287382, false, (String) objArr22[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr21)).longValue();
                                    }
                                    i = -2001519171;
                                    break;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    i10++;
                    i6 = 2;
                    i8 = -2001519171;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cMyPid2 = (char) (Process.myPid() >> 22);
                int iRed = 2823 - Color.red(0);
                int iArgb = Color.argb(0, 0, 0, 0) + 22;
                byte[] bArr8 = $$d;
                Object[] objArr23 = new Object[1];
                e(bArr8[10], bArr8[5], bArr8[7], objArr23);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cMyPid2, iRed, iArgb, 1814927978, false, (String) objArr23[0], null);
            }
            Object[] objArr24 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int deadChar = KeyEvent.getDeadChar(0, 0) + 2823;
                int i21 = 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                byte b6 = (byte) ($$e >>> 2);
                byte[] bArr9 = $$d;
                Object[] objArr25 = new Object[1];
                e(b6, bArr9[7], bArr9[5], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(scrollBarSize2, deadChar, i21, 1025296417, false, (String) objArr25[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr24);
            Object[] objArr26 = {0, methodArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char defaultSize = (char) (37657 - View.getDefaultSize(0, 0));
                int iIndexOf = TextUtils.indexOf("", "", 0) + 2720;
                int jumpTapTimeout = 19 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                byte b7 = (byte) ($$e >>> 2);
                byte[] bArr10 = $$d;
                Object[] objArr27 = new Object[1];
                e(b7, bArr10[7], bArr10[5], objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(defaultSize, iIndexOf, jumpTapTimeout, -1568796068, false, (String) objArr27[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr26)).longValue();
            long j2 = -1052917380;
            long j3 = -743;
            long j4 = j2 | jLongValue;
            long j5 = -1;
            long j6 = (int) Runtime.getRuntime().totalMemory();
            long j7 = (j3 * j2) + (j3 * jLongValue) + (((long) (-744)) * ((j4 ^ j5) | ((j2 | j6) ^ j5) | ((jLongValue | j6) ^ j5)));
            long j8 = 744;
            long j9 = j7 + (((j6 ^ j5) | (((j2 ^ j5) | (jLongValue ^ j5)) ^ j5)) * j8) + (j8 * (j4 | j6)) + ((long) (-757488465));
            int i22 = (int) Runtime.getRuntime().totalMemory();
            int i23 = ~i22;
            int i24 = ((int) (j9 >> 32)) & ((-1433969350) + (((~(i22 | (-2070952189))) | (~(2146793980 | i23)) | 710946904) * (-68)) + ((~((-1360005285) | i23)) * (-68)) + (((~(2070952188 | i23)) | 786788696) * 68));
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i25 = ~elapsedCpuTime;
            int i26 = i24 | (((int) j9) & (((((~((-806661595) | i25)) | (~(2051079291 | elapsedCpuTime))) * 959) - 2041562317) + (((~(elapsedCpuTime | (-806661595))) | (~(i25 | 2051079291))) * 959)));
            int i27 = i26 >>> 24;
            int i28 = i26 & ViewCompat.MEASURED_SIZE_MASK;
            boolean z = i27 != 0;
            if (z) {
                int i29 = cancel + 91;
                f240a = i29 % 128;
                int i30 = i29 % 2;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if ((!z) || i28 >= 1) {
                string = null;
            } else {
                int i31 = f240a + 17;
                cancel = i31 % 128;
                if (i31 % 2 == 0) {
                    Method method2 = methodArr[i28];
                    throw null;
                }
                Method method3 = methodArr[i28];
                if (method3 != null) {
                    string = method3.toString();
                } else {
                    string = null;
                }
            }
            arrayList.add(string);
            if ((i27 + 6) * i2 != 0) {
                throw new RuntimeException("0");
            }
            try {
                try {
                    processStart = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start();
                    try {
                        inputStream2 = processStart.getInputStream();
                        try {
                            byte[] bArr11 = new byte[1024];
                            String string2 = "";
                            while (inputStream2.read(bArr11) != -1) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(string2);
                                sb.append(new String(bArr11).trim());
                                string2 = sb.toString();
                            }
                            String[] strArrSplit2 = string2.split("\n");
                            if (strArrSplit2 != null) {
                                int i32 = cancel + 49;
                                f240a = i32 % 128;
                                if (i32 % 2 != 0) {
                                    int i33 = 17 / 0;
                                    if (strArrSplit2.length <= 0) {
                                    }
                                    for (String str3 : strArrSplit2) {
                                        if (str3 != null) {
                                            i5 = cancel + 81;
                                            f240a = i5 % 128;
                                            if (i5 % 2 == 0) {
                                                str3.split(":");
                                                throw null;
                                            }
                                            strArrSplit = str3.split(":");
                                            if (strArrSplit == null) {
                                                if (strArrSplit.length <= 1 && (str = strArrSplit[0]) != null) {
                                                    if (str.startsWith("Processor")) {
                                                        String str4 = strArrSplit[1];
                                                        if (str4 != null) {
                                                            strTrim = str4.replaceAll(" Processor ", " ").trim();
                                                        }
                                                    } else if (strArrSplit[0].startsWith("vendor_id")) {
                                                        String str5 = strArrSplit[1];
                                                        if (str5 != null) {
                                                            strTrim = str5.trim();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (strTrim != null) {
                                            str2 = strTrim;
                                            break;
                                        }
                                    }
                                    if (processStart != null) {
                                        processStart.destroy();
                                    }
                                    if (inputStream2 != null) {
                                        int i34 = cancel + 77;
                                        f240a = i34 % 128;
                                        int i35 = i34 % 2;
                                        inputStream2.close();
                                    }
                                } else {
                                    if (strArrSplit2.length <= 0) {
                                    }
                                    while (i4 < r3) {
                                        if (str3 != null) {
                                            i5 = cancel + 81;
                                            f240a = i5 % 128;
                                            if (i5 % 2 == 0) {
                                                str3.split(":");
                                                throw null;
                                            }
                                            strArrSplit = str3.split(":");
                                            if (strArrSplit == null) {
                                                strTrim = strArrSplit.length <= 1 ? null : null;
                                            }
                                        }
                                        if (strTrim != null) {
                                            str2 = strTrim;
                                            break;
                                        }
                                    }
                                    if (processStart != null) {
                                        processStart.destroy();
                                    }
                                    if (inputStream2 != null) {
                                        int i36 = cancel + 77;
                                        f240a = i36 % 128;
                                        int i37 = i36 % 2;
                                        inputStream2.close();
                                    }
                                }
                                return str2;
                            }
                            if (processStart != null) {
                                processStart.destroy();
                            }
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (IOException unused) {
                                }
                            }
                            return "";
                        } catch (IOException unused2) {
                            if (processStart != null) {
                                processStart.destroy();
                            }
                            if (inputStream2 != null) {
                                i3 = f240a + 75;
                                cancel = i3 % 128;
                                if (i3 % 2 == 0) {
                                    inputStream2.close();
                                    throw null;
                                }
                            }
                            return str2;
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream3 = inputStream2;
                            inputStream = inputStream3;
                            process = processStart;
                            if (process != null) {
                                process.destroy();
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused4) {
                        inputStream2 = null;
                        if (processStart != null) {
                            processStart.destroy();
                        }
                        if (inputStream2 != null) {
                            i3 = f240a + 75;
                            cancel = i3 % 128;
                            if (i3 % 2 == 0) {
                                inputStream2.close();
                                throw null;
                            }
                            inputStream2.close();
                        }
                        return str2;
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream3 = null;
                    }
                } catch (IOException unused5) {
                }
            } catch (IOException unused6) {
                processStart = null;
            } catch (Throwable th4) {
                th = th4;
                process = null;
                inputStream = null;
            }
        } catch (Throwable th5) {
            Throwable cause2 = th5.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th5;
        }
    }

    private static void f(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        char[] cArr3;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr4 = TuitionPaymentFragmentbindingInflater1;
        float f = 0.0f;
        if (cArr4 != null) {
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i3])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) (31340 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)));
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 2994;
                        int maximumFlingVelocity = 17 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        byte b2 = (byte) ($$f & 7);
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iCombineMeasuredStates, maximumFlingVelocity, 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr5[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i3++;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i4 = $11 + 19;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 4;
            }
            cArr4 = cArr5;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 253, TextUtils.getTrimmedLength("") + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            int i6 = 33602;
            int i7 = 1687675375;
            if (!asInterface) {
                if (!g) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                    char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                    }
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i8 = $10 + 117;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                } else {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                }
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.green(0) + 33602), 3085 - ExpandableListView.getPackedPositionType(0L), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25, -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr2);
                return;
            }
            int i9 = $11 + 15;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                cArr3 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            } else {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                cArr3 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            }
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i10 = $10 + 117;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr3[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 % 1) << getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] >>> i] * iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i7);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.blue(0) + i6), 3085 - (KeyEvent.getMaxKeyCode() >> 16), 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } else {
                    cArr3[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33602), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3085, TextUtils.lastIndexOf("", '0') + 27, -2146875848, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                }
                i6 = 33602;
                i7 = 1687675375;
            }
            objArr[0] = new String(cArr3);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, int i) {
        int i2 = 2 % 2;
        int i3 = f240a + 91;
        cancel = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (str == null) {
            return null;
        }
        if (str.length() <= i) {
            return str;
        }
        String strSubstring = str.substring(0, i);
        int i4 = f240a + 121;
        cancel = i4 % 128;
        int i5 = i4 % 2;
        return strSubstring;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        int i2 = cancel + 89;
        f240a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf("?");
        if (iIndexOf >= 0) {
            int i3 = f240a + 79;
            cancel = i3 % 128;
            if (i3 % 2 != 0 ? 250 < iIndexOf : 26152 < iIndexOf) {
                iIndexOf = 250;
            }
        } else {
            iIndexOf = 250;
        }
        if (str.length() <= iIndexOf) {
            return str;
        }
        int i4 = cancel + 5;
        f240a = i4 % 128;
        int i5 = i4 % 2;
        return str.substring(0, iIndexOf);
    }

    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, String str2, int i, int i2, int i3, boolean z) {
        int i4 = 2 % 2;
        if (str2 != null && !str2.isEmpty()) {
            try {
                int i5 = Integer.parseInt(str2);
                if (i5 < i) {
                    if (!(!SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("%s value of %s is not within the range of %s and %s", str, str2, Integer.valueOf(i), Integer.valueOf(i2)));
                    }
                    if (!z) {
                        return i;
                    }
                } else {
                    if (i5 <= i2) {
                        return i5;
                    }
                    int i6 = cancel + 15;
                    f240a = i6 % 128;
                    int i7 = i6 % 2;
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        int i8 = f240a + 111;
                        cancel = i8 % 128;
                        if (i8 % 2 == 0) {
                            Object[] objArr = new Object[4];
                            objArr[0] = str;
                            objArr[0] = str2;
                            objArr[2] = Integer.valueOf(i);
                            objArr[2] = Integer.valueOf(i2);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("%s value of %s is not within the range of %s and %s", objArr));
                        } else {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("%s value of %s is not within the range of %s and %s", str, str2, Integer.valueOf(i), Integer.valueOf(i2)));
                        }
                    }
                    if (!z) {
                        return i2;
                    }
                }
            } catch (NumberFormatException unused) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    String.format("#%d.", Long.valueOf(Thread.currentThread().getId()));
                }
            }
        }
        return i3;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(Map<String, String> map, String str, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f240a + 119;
        cancel = i5 % 128;
        int i6 = i5 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, map.get(str), i, i2, i3, true);
        int i7 = cancel + 125;
        f240a = i7 % 128;
        int i8 = i7 % 2;
        return iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        Map map = (Map) objArr[0];
        String str = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int iIntValue3 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = f240a + 55;
        cancel = i2 % 128;
        return Integer.valueOf(i2 % 2 == 0 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, (String) map.get(str), iIntValue, iIntValue2, iIntValue3, true) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, (String) map.get(str), iIntValue, iIntValue2, iIntValue3, false));
    }

    public static byte[] b(InputStream inputStream) throws IOException {
        int i = 2 % 2;
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = cancel + 45;
        f240a = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            int i4 = inputStream.read(bArr);
            if (i4 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            int i5 = f240a + 83;
            cancel = i5 % 128;
            int i6 = i5 % 2;
            byteArrayOutputStream.write(bArr, 0, i4);
        }
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT >= 28) {
            return Process.isIsolated();
        }
        try {
            boolean zBooleanValue = ((Boolean) Process.class.getDeclaredMethod("isIsolated", new Class[0]).invoke(null, new Object[0])).booleanValue();
            int i2 = f240a + 115;
            cancel = i2 % 128;
            int i3 = i2 % 2;
            return zBooleanValue;
        } catch (Exception unused) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                String.format("#%d.", Long.valueOf(Thread.currentThread().getId()));
            }
            int i4 = cancel + 9;
            f240a = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
    }

    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        int i = 2 % 2;
        int i2 = f240a;
        int i3 = i2 + 9;
        cancel = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (str == null) {
            int i4 = i2 + 65;
            cancel = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        try {
            return URLEncoder.encode(str, Hex.DEFAULT_CHARSET_NAME);
        } catch (UnsupportedEncodingException e2) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                e2.toString();
                String.format("#%d.", Long.valueOf(Thread.currentThread().getId()));
            }
            return str.replaceAll("&", "%26").replaceAll("=", "%3D");
        }
    }

    public static Map<String, String> b(String str) {
        String[] strArrSplit;
        int i = 2 % 2;
        HashMap map = new HashMap();
        String[] strArrSplit2 = str.split("&");
        int length = strArrSplit2.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = cancel + 119;
            f240a = i3 % 128;
            if (i3 % 2 != 0) {
                strArrSplit = strArrSplit2[i2].split("=");
                if (strArrSplit.length != 2) {
                    return null;
                }
            } else {
                strArrSplit = strArrSplit2[i2].split("=");
                if (strArrSplit.length != 2) {
                    return null;
                }
            }
            map.put(strArrSplit[0], strArrSplit[1]);
        }
        int i4 = f240a + 75;
        cancel = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("#%d.", Long.valueOf(Thread.currentThread().getId())));
        sb.append(str);
        int length = (sb.toString().length() - 1) / 4000;
        int i2 = cancel + 39;
        f240a = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static void TuitionPaymentFragmentbindingInflater1(String str) {
        int i = 2 % 2;
        String.format("#%d.", Long.valueOf(Thread.currentThread().getId()));
        int i2 = f240a + 77;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void asInterface(String str) {
        int i = 2 % 2;
        String.format("#%d.", Long.valueOf(Thread.currentThread().getId()));
        int i2 = f240a + 27;
        cancel = i2 % 128;
        int i3 = i2 % 2;
    }

    public static void a(String str) {
        int i = 2 % 2;
        String.format("#%d.", Long.valueOf(Thread.currentThread().getId()));
        int i2 = f240a + 7;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void d(String str) {
        int i = 2 % 2;
        String.format("#%d.", Long.valueOf(Thread.currentThread().getId()));
        int i2 = f240a + 47;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void g(String str) {
        int i = 2 % 2;
        String.format("#%d.", Long.valueOf(Thread.currentThread().getId()));
        int i2 = f240a + 109;
        cancel = i2 % 128;
        int i3 = i2 % 2;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault1(HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 2111259520, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -2111259519, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{context}, iTuitionPaymentFragmentspecialinlinedviewModeldefault1)).intValue();
    }

    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (String) TuitionPaymentFragmentspecialinlinedviewModeldefault1(HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1473072283, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 1473072285, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[0], iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public static int b(Map<String, String> map, String str, int i, int i2, int i3) {
        Object[] objArr = {map, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault1(HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1076271412, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1076271415, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault1)).intValue();
    }

    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (String) TuitionPaymentFragmentspecialinlinedviewModeldefault1(HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -739829131, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 739829131, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{str}, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    static void asBinder() {
        TuitionPaymentFragmentbindingInflater1 = new char[]{47277, 47286, 47265, 47209, 47275, 47273, 47280, 47269, 47282, 47281, 47284, 47267, 47242, 47279, 47272, 47283, 47278, 47268, 47241, 47237, 47266, 47235, 47326, 47271, 47239, 47274};
        b = 2047719511;
        g = true;
        asInterface = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, short r7, int r8) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r6 = r6 + 67
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r1 = defpackage.ViewPort.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewPort.$$g(byte, short, int):java.lang.String");
    }
}
