package com.google.mlkit.common.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.R;
import com.google.android.material.timepicker.ClockHandView$$ExternalSyntheticLambda0;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public class MlKitComponentDiscoveryService extends Service {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {51, -5, 77, 89};
    private static final int $$f = 85;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 103 - r8
            byte[] r0 = com.google.mlkit.common.internal.MlKitComponentDiscoveryService.$$a
            int r1 = 53 - r7
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.internal.MlKitComponentDiscoveryService.a(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 1
            int r6 = 450 - r6
            byte[] r1 = com.google.mlkit.common.internal.MlKitComponentDiscoveryService.$$d
            int r7 = 115 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L11
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2a
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L1f
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L1f:
            int r3 = r3 + 1
            int r6 = r6 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r3 = r3 + r6
            int r6 = r3 + (-3)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.internal.MlKitComponentDiscoveryService.c(int, int, short, java.lang.Object[]):void");
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 1;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $10 + 93;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 64839), 1356 - (Process.myTid() >> 22), 38 - Gravity.getAbsoluteGravity(0, 0), 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - ((byte) KeyEvent.getModifierMetaStateMask())), 468 - Color.alpha(0), (ViewConfiguration.getScrollBarSize() >> 8) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    protected void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1031;
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 15;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[132], bArr[7], bArr[10], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, maximumDrawingCacheSize, capsMode, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        b(new char[]{30092, 33169, 30189, 18409, 15275, 28902, 13093, 24168, 40115, 8796, 6773, 26756, 42819, 3350, 143, 28969, 52741, 63398, 30469, 39535, 53409, 56902, 24173, 42165, 64383, 51486}, ExpandableListView.getPackedPositionChild(0L) + 1, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(new char[]{22999, 12187, 22962, 38474, 38307, 4275, 57987, 15935, 45300, 35930, 52182, 2221, 35602, 41742, 53614, 4443, 57934, 22962, 42679}, KeyEvent.keyCodeFromString(""), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            int maximumFlingVelocity = 1031 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int iMakeMeasureSpec = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte[] bArr2 = $$a;
            byte b = bArr2[7];
            byte b2 = bArr2[10];
            Object[] objArr5 = new Object[1];
            a((short) 51, b, b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, maximumFlingVelocity, iMakeMeasureSpec, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                int iResolveOpacity = 1031 - Drawable.resolveOpacity(0, 0);
                int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 16;
                int i4 = $$b;
                Object[] objArr6 = new Object[1];
                a((short) (i4 | 34), (byte) 52, (byte) (i4 & 31), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel, iResolveOpacity, bitsPerPixel2, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iNextInt = new Random().nextInt();
            int i7 = 1866967784 + (((~((-233819368) | iNextInt)) | 9407618) * 345) + (((~((-233819368) | (~iNextInt))) | 1053184) * 345) + ((~(iNextInt | (-9407619))) * 345) + 28596614;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b(new char[]{48814, 4440, 48836, 58712, 43885, 25385, 37254, 19892, 22480, 45712, 47297, 31499, 27753, 40322, 41539, 25292, 1325, 26472, 54693, 35240}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(new char[]{35091, 58802, 35194, 48696, 24450, 24054, 51957, 29540, 24631, 18047, 58292, 17859, 23547, 26919, 63747, 23554, 12960, 37785, 36548, 46975}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1495442857};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.blue(0) + 46038), 1134 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 28596614, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1031;
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
                    byte[] bArr3 = $$a;
                    Object[] objArr12 = new Object[1];
                    a(bArr3[132], bArr3[7], bArr3[10], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, scrollBarFadeDuration, minimumFlingVelocity, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (-16776099) - Color.rgb(0, 0, 0), ExpandableListView.getPackedPositionChild(0L) + 18), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1031;
                    int iResolveSize = 15 - View.resolveSize(0, 0);
                    int i10 = $$b;
                    Object[] objArr13 = new Object[1];
                    a((short) (i10 | 34), (byte) 52, (byte) (i10 & 31), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, threadPriority, iResolveSize, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    b(new char[]{30092, 33169, 30189, 18409, 15275, 28902, 13093, 24168, 40115, 8796, 6773, 26756, 42819, 3350, 143, 28969, 52741, 63398, 30469, 39535, 53409, 56902, 24173, 42165, 64383, 51486}, ExpandableListView.getPackedPositionType(0L), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    b(new char[]{22999, 12187, 22962, 38474, 38307, 4275, 57987, 15935, 45300, 35930, 52182, 2221, 35602, 41742, 53614, 4443, 57934, 22962, 42679}, View.resolveSize(0, 0), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c3 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iResolveSizeAndState = 1031 - View.resolveSizeAndState(0, 0, 0);
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 15;
                        byte[] bArr4 = $$a;
                        Object[] objArr16 = new Object[1];
                        a((short) 51, bArr4[7], bArr4[10], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, iResolveSizeAndState, touchSlop, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int iResolveSizeAndState2 = 1031 - View.resolveSizeAndState(0, 0, 0);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15;
                        byte[] bArr5 = $$a;
                        Object[] objArr17 = new Object[1];
                        a(bArr5[132], bArr5[7], bArr5[10], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(minimumFlingVelocity2, iResolveSizeAndState2, keyRepeatTimeout, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i11 = ((int[]) objArr[1])[0];
        int i12 = ((int[]) objArr[3])[0];
        if (i12 != i11) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                int i14 = i13 % 2;
                for (String str : strArr2) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i12));
        }
        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
        int i16 = i15 % 2;
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[3])[0];
        int i19 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i20 = ~iIdentityHashCode;
        int i21 = i17 + 1901243145 + (((~(i20 | 209579469)) | (-243138014) | (~((-1142157) | iIdentityHashCode))) * 717) + (((~(iIdentityHashCode | 209579469)) | (~(i20 | (-1142157))) | (-243138014)) * 717);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr18[2])[0] = i23 ^ (i23 << 5);
        int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i24 % 128;
        int i25 = i24 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
            int iIndexOf = 1754 - TextUtils.indexOf((CharSequence) "", '0');
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 23;
            Object[] objArr19 = new Object[1];
            a((short) ($$b | 34), (byte) 15, $$a[10], objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cMyTid, iIndexOf, iNormalizeMetaState, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0, 0));
                int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0) + 1756;
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 23;
                byte[] bArr6 = $$a;
                Object[] objArr20 = new Object[1];
                a((short) 51, bArr6[7], bArr6[10], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cLastIndexOf, bitsPerPixel3, packedPositionType, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i26 = (((-1411441758) + (((~((-268441217) | (~iFreeMemory))) | 55838790) * (-591))) + ((iFreeMemory | (-268441217)) * 591)) - 221293064;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i28 ^ (i28 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            b(new char[]{48814, 4440, 48836, 58712, 43885, 25385, 37254, 19892, 22480, 45712, 47297, 31499, 27753, 40322, 41539, 25292, 1325, 26472, 54693, 35240}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_4).substring(4, 5).codePointAt(0) - 32, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            b(new char[]{35091, 58802, 35194, 48696, 24450, 24054, 51957, 29540, 24631, 18047, 58292, 17859, 23547, 26919, 63747, 23554, 12960, 37785, 36548, 46975}, ViewConfiguration.getEdgeSlop() >> 16, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {1495442857};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - (KeyEvent.getMaxKeyCode() >> 16)), (Process.myTid() >> 22) + 1726, 29 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = ClockHandView$$ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), -221293064, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char scrollBarFadeDuration2 = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
                int i29 = 1755 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int mode = View.MeasureSpec.getMode(0) + 23;
                byte[] bArr7 = $$a;
                Object[] objArr25 = new Object[1];
                a((short) 51, bArr7[7], bArr7[10], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(scrollBarFadeDuration2, i29, mode, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr26 = new Object[1];
                b(new char[]{30092, 33169, 30189, 18409, 15275, 28902, 13093, 24168, 40115, 8796, 6773, 26756, 42819, 3350, 143, 28969, 52741, 63398, 30469, 39535, 53409, 56902, 24173, 42165, 64383, 51486}, TextUtils.indexOf("", "", 0, 0), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                b(new char[]{22999, 12187, 22962, 38474, 38307, 4275, 57987, 15935, 45300, 35930, 52182, 2221, 35602, 41742, 53614, 4443, 57934, 22962, 42679}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cResolveSize = (char) (29944 - View.resolveSize(0, 0));
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1755;
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 24;
                    byte[] bArr8 = $$a;
                    Object[] objArr28 = new Object[1];
                    a((short) 140, bArr8[7], bArr8[10], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cResolveSize, absoluteGravity, modifierMetaStateMask, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 29944);
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1755;
                    int iMakeMeasureSpec2 = 23 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    Object[] objArr29 = new Object[1];
                    a((short) ($$b | 34), (byte) 15, $$a[10], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(offsetBefore, jumpTapTimeout, iMakeMeasureSpec2, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i30 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i31 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i31 == i30) {
            int i32 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr30 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int i33 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i34 = ~i33;
            int i35 = i32 + (-1144866607) + (((~(424313564 | i34)) | 615780610) * 168) + ((~((-615780611) | i33)) * 168) + (((~(i33 | 1040094174)) | (~(i34 | (-636915991))) | 21135380) * 168);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr30[3])[0] = i37 ^ (i37 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
        if (strArr4 != null) {
            int i38 = 0;
            while (i38 < strArr4.length) {
                int i39 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i39 % 128;
                if (i39 % 2 != 0) {
                    arrayList2.add(strArr4[i38]);
                    i38 += 63;
                } else {
                    arrayList2.add(strArr4[i38]);
                    i38++;
                }
            }
        }
        Toast.makeText((Context) null, i31 / (((i31 - 1) * i31) % 2), 0).show();
        int i40 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int i41 = ~((int) Runtime.getRuntime().maxMemory());
        int i42 = i40 + ((((~((-283438817) | i41)) | 281284160) * (-241)) - 1755684880) + (((~(i41 | (-2154657))) | (-352120551)) * 241);
        int i43 = (i42 << 13) ^ i42;
        int i44 = i43 ^ (i43 >>> 17);
        ((int[]) objArr31[3])[0] = i44 ^ (i44 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -28995187
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // android.app.Service
    public void onCreate() {
        /*
            Method dump skipped, instruction units count: 13080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.internal.MlKitComponentDiscoveryService.onCreate():void");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static {
        byte[] bArr = new byte[526];
        System.arraycopy("rÅ\n\u001f\u000f\u0001Ä<\u000b\u0003û\büÌ;\u0006\fö\u0000\u0002\u0015õÌ8\u0012ò\u0015ø\u0007\u0010þøý\u0013¾\u001b&\fö\u0000\u0002\u0015õá2ò\u0015ø\u0007\u0010þøý\u0013Û,\u0007Ý\u0016\u0005\u0005\r\u0004\u0001ò\u0014µ\"/\u0001\u0006ô\u0010þ\t\u0002$÷\u000eø\t\u0002å\u0014\u001b÷û\f\tÕ/ò\t\tû\f\t\u0002\u0000ø\u0001\tû\u000e\u0000\b\u0001\u0000\bú\u0002\u0015öÿ\u0015Ù%ø\u0004\nû\u0004\u0004þ\u0017ú\u000bÁõ\u0012Ó(\u0010öþ\u0004\u0010á\u0014\u0006\u0003\b\bü$÷\u000eø\t\u0002å\u0014\u001b÷û\f\tÕ/ò\t\tû\f\t\u0002\u0000ø\u0001\tû\u000e\u0000\b\u0001\u0000\bú\u0002\u0015öÿ\u0015Ù%ø\u0004\nû\u0004\u0004þ\u0017ú\u000bÀ\u0010ù\u0011\u0000ýþÍH\u0005þ\u0003\u0002\u0006\u0005½KÁýBû\u0002\bûÐ\"\u001b\u0002\bûä3\u0000\u000bÿõ\u0010Ô/\u0001\u0006ô\u0016Ð2üÌ\u0007ñ2%ð\u0014ó\u0012ú\n\u0007ø\t\u0002Ø!\u000e\u0003ù\u0002\u0005\u000bè%\u0000\f\u0004$÷\u000eø\t\u0002å\u0014\u001b÷û\f\tÕ/ò\t\tû\f\t\u0002\u0000ø\u0001\tû\u000e\u0000\b\u0001\u0000\bú\u0002\u0015öÿ\u0015Ù%ø\u0004\nû\u0004\u0004þ\u0017ú\u000bÂ\u000f\u0001Ä7\u0011ý\f\u0004ú\r¼9\u0000\u0016ð\u0004\n\bù\b\büÊ\u0016%\u0014ø\u0010ö\u000e\bà\u0016þ\u0004\rä\u001fø\u001bï\u0010Ó*\bù\b\bü$÷\u000eø\t\u0002å\u0014\u001b÷û\f\tÕ/ò\t\tû\f\tñ\n\bù\b\büå(û\tø\u0016ô\u0010Â\u0007\bû\u0000\bÃ8\u000f\u0000\u0003ü\u0001\u0014ø\t\u0002\b¾7\u0016÷\u0006û\u0004\u0010\u0004¾\"\u0017\u0012Õ6÷\u0006û\u0004\u0010Ö,\t\u0001úÿ\u0011\u0007\bû\u0000\bÃHõ\u000f\u0007ó\fø\u0005\u0011¾(\u0015\u000f\u0007ó\fø\u0005\u0011Û,î\u0003\u0003÷\u0015\u000f\u0007ó\fø\u0005\u0011Û,³Lÿ\b\n\u0001´\u0010ö\u0003$6ÿô\u0010ÿö\u000eê)ø\t÷\u0000\u0012øýì\u0018\u000fø\u0005\u0000Ò".getBytes("ISO-8859-1"), 0, bArr, 0, 526);
        $$d = bArr;
        $$e = 70;
        $$a = new byte[]{87, -91, 60, 112, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
        $$b = 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -4307585243602595790L;
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
    private static java.lang.String $$g(byte r5, short r6, short r7) {
        /*
            int r7 = r7 * 2
            int r0 = 1 - r7
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r1 = com.google.mlkit.common.internal.MlKitComponentDiscoveryService.$$c
            int r5 = r5 * 4
            int r5 = r5 + 107
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            r4 = r1[r6]
            int r3 = r3 + 1
        L28:
            int r5 = r5 + r4
            int r6 = r6 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.internal.MlKitComponentDiscoveryService.$$g(byte, short, short):java.lang.String");
    }
}
