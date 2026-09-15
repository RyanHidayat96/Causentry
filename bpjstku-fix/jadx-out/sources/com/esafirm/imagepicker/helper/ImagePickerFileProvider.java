package com.esafirm.imagepicker.helper;

import android.content.Context;
import android.content.ContextWrapper;
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
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.FileProvider;
import androidx.core.view.ViewCompat;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.CaptureSession1;
import defpackage.cacheInteropConfig;
import defpackage.createCroppedBitmap;
import defpackage.generateCameraId;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
public class ImagePickerFileProvider extends FileProvider {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {Base64.padSymbol, -108, 49, -100};
    private static final int $$f = 109;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0022). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = 103 - r6
            int r5 = 207 - r5
            byte[] r0 = com.esafirm.imagepicker.helper.ImagePickerFileProvider.$$a
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r4 = r7
            r3 = r2
            goto L22
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L20:
            r4 = r0[r5]
        L22:
            int r5 = r5 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esafirm.imagepicker.helper.ImagePickerFileProvider.b(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 108 - r6
            int r7 = r7 + 4
            int r0 = r8 + 1
            byte[] r1 = com.esafirm.imagepicker.helper.ImagePickerFileProvider.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L11
            r6 = r7
            r4 = r8
            r3 = r2
            goto L26
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L1f
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L1f:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L26:
            int r7 = r7 + r4
            int r6 = r6 + 1
            int r7 = r7 + (-4)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esafirm.imagepicker.helper.ImagePickerFileProvider.c(int, short, short, java.lang.Object[]):void");
    }

    private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i5 = $10 + 11;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 3290 - ImageFormat.getBitsPerPixel(0), 31 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1199271174, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cRed = (char) Color.red(0);
                    int defaultSize = View.getDefaultSize(0, 0) + 651;
                    int iIndexOf = 44 - TextUtils.indexOf("", "", 0, 0);
                    byte b3 = (byte) ($$f & 3);
                    byte b4 = (byte) (b3 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed, defaultSize, iIndexOf, -450685997, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            int i8 = $11 + 37;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i10 = $10 + 33;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                try {
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cBlue = (char) Color.blue(0);
                        int scrollDefaultDelay = 651 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int defaultSize2 = 44 - View.getDefaultSize(0, 0);
                        byte b5 = (byte) ($$f & 3);
                        byte b6 = (byte) (b5 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, scrollDefaultDelay, defaultSize2, -450685997, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i12 = $10 + 79;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 2 / 4;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:359:0x2561  */
    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public boolean onCreate() throws Throwable {
        Object[] objArr;
        String str;
        String str2;
        Object[] objArr2;
        Object[] objArr3;
        String str3;
        Object[] objArr4;
        int i;
        int i2;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        String str4;
        Object[] objArr5;
        int i3;
        Object[] objArr6;
        int i4;
        String str5;
        Object[] objArr7;
        String str6;
        Object[] objArr8;
        int i5;
        Object[] objArr9;
        String str7;
        char c;
        int i6;
        Object[] objArr10;
        int i7 = 2 % 2;
        Object[] objArr11 = new Object[1];
        a(false, 120 - TextUtils.lastIndexOf("", '0', 0, 0), 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 18, new char[]{'\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15}, objArr11);
        String str8 = (String) objArr11[0];
        Object[] objArr12 = new Object[1];
        a(true, View.MeasureSpec.getSize(0) + 125, 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 5, new char[]{'\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534}, objArr12);
        String str9 = (String) objArr12[0];
        Object[] objArr13 = new Object[1];
        a(true, 119 - MotionEvent.axisFromString(""), 16 - (ViewConfiguration.getTouchSlop() >> 8), 3 - Color.blue(0), new char[]{20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535}, objArr13);
        String str10 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        a(true, 124 - TextUtils.getOffsetBefore("", 0), 16 - (Process.myTid() >> 22), 8 - View.MeasureSpec.getMode(0), new char[]{19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531, 65506}, objArr14);
        String str11 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        a(false, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 121, 27 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, new char[]{1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0, 17, 6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534}, objArr15);
        String str12 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        a(true, 129 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 17 - TextUtils.lastIndexOf("", '0'), 13 - Drawable.resolveOpacity(0, 0), new char[]{65529, 65535, 2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b', 11, 65529, 4, 5, 65535, '\n', 65527}, objArr16);
        String str13 = (String) objArr16[0];
        int i8 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i9 = (-995229476) + (((-1468525882) | startElapsedRealtime) * 614);
        int i10 = ~startElapsedRealtime;
        if (i8 != i9 + (((~((-459254260) | i10)) | 139985090 | (~(i10 | (-1289241803)))) * (-1228)) + (((~(i10 | (-1149256713))) | (~((-319269170) | i10))) * 614)) {
            throw new RuntimeException("1143184028");
        }
        int i11 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i12 = ~((-1343226897) | iIdentityHashCode);
        if (i11 != 962181172 + ((94650506 | i12) * (-476)) + (i12 * 952) + ((~((~iIdentityHashCode) | (-1343226897))) * 476)) {
            throw null;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
            int i13 = 1032 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int maximumFlingVelocity = 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            Object[] objArr17 = new Object[1];
            b((short) ($$b | 194), $$a[54], (byte) 52, objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, i13, maximumFlingVelocity, 1357589585, false, (String) objArr17[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        long jLongValue = ((Long) Class.forName(str8).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0');
            int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15;
            Object[] objArr18 = new Object[1];
            b((short) 151, $$a[54], (byte) 52, objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumDrawingCacheSize, iIndexOf, maximumDrawingCacheSize2, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int i14 = 1032 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int iIndexOf2 = 15 - TextUtils.indexOf("", "", 0);
                Object[] objArr19 = new Object[1];
                b((short) 99, (byte) ($$b - 4), $$a[7], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec, i14, iIndexOf2, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i15 = ((int[]) objArr20[3])[0];
            int i16 = ((int[]) objArr20[1])[0];
            String[] strArr = (String[]) objArr20[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i17 = ~iIdentityHashCode2;
            int i18 = (-618505706) + (((~(237585089 | i17)) | (~((-33636545) | iIdentityHashCode2))) * (-831)) + ((~(515501803 | iIdentityHashCode2)) * (-1662)) + (((~(iIdentityHashCode2 | (-237585090))) | (~(i17 | (-481865260))) | (~(481865259 | iIdentityHashCode2))) * 831) + 824986450;
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr[2])[0] = i20 ^ (i20 << 5);
            int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
            TuitionPaymentFragmentbindingInflater1 = i21 % 128;
            int i22 = i21 % 2;
        } else {
            int iIntValue = ((Integer) Class.forName(str10).getMethod(str11, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr21 = {638368646};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - (ViewConfiguration.getScrollBarSize() >> 8)), 1134 - (ViewConfiguration.getEdgeSlop() >> 16), 19 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr22 = {Integer.valueOf(iIntValue), 0, 824986450, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr21), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int maximumFlingVelocity2 = 1031 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int i23 = 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    Object[] objArr23 = new Object[1];
                    b((short) ($$b | 194), $$a[54], (byte) 52, objArr23);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, maximumFlingVelocity2, i23, 1298546779, false, (String) objArr23[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.getDeadChar(0, 0) + 45993), 1117 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getJumpTapTimeout() >> 16) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr22);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int trimmedLength = 1031 - TextUtils.getTrimmedLength("");
                    int longPressTimeout = 15 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    Object[] objArr24 = new Object[1];
                    b((short) 99, (byte) ($$b - 4), $$a[7], objArr24);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(threadPriority, trimmedLength, longPressTimeout, 632103528, false, (String) objArr24[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    long jLongValue2 = ((Long) Class.forName(str8).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c3 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 1031;
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
                        Object[] objArr25 = new Object[1];
                        b((short) 151, $$a[54], (byte) 52, objArr25);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, threadPriority2, minimumFlingVelocity, 1344079056, false, (String) objArr25[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int keyRepeatTimeout = 1031 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int edgeSlop = 15 - (ViewConfiguration.getEdgeSlop() >> 16);
                        Object[] objArr26 = new Object[1];
                        b((short) ($$b | 194), $$a[54], (byte) 52, objArr26);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(tapTimeout, keyRepeatTimeout, edgeSlop, 1357589585, false, (String) objArr26[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i24 = ((int[]) objArr[1])[0];
        int i25 = ((int[]) objArr[3])[0];
        if (i25 != i24) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                for (String str14 : strArr2) {
                    arrayList.add(str14);
                }
            }
            throw new RuntimeException(String.valueOf(i25));
        }
        Object[] objArr27 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i26 = ((int[]) objArr[2])[0];
        int i27 = ((int[]) objArr[3])[0];
        int i28 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i29 = i26 + (((1739565539 + (((~iIdentityHashCode3) | 311438482) * 1324)) + (((~(iIdentityHashCode3 | (-757580654))) | (~(1001860823 | iIdentityHashCode3))) * (-1324))) - 1522975122);
        int i30 = (i29 << 13) ^ i29;
        int i31 = i30 ^ (i30 >>> 17);
        ((int[]) objArr27[2])[0] = i31 ^ (i31 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 31533);
            int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 921;
            int modifierMetaStateMask = 27 - ((byte) KeyEvent.getModifierMetaStateMask());
            Object[] objArr28 = new Object[1];
            b((short) 99, (byte) ($$b - 4), $$a[7], objArr28);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cResolveOpacity, keyRepeatTimeout2, modifierMetaStateMask, -1048449946, false, (String) objArr28[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null);
        long jLongValue3 = ((Long) Class.forName(str8).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
            char c4 = (char) (31533 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
            int minimumFlingVelocity2 = 921 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iIndexOf3 = 28 - TextUtils.indexOf("", "", 0, 0);
            Object[] objArr29 = new Object[1];
            b((short) 151, $$a[54], (byte) 52, objArr29);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c4, minimumFlingVelocity2, iIndexOf3, -778300370, false, (String) objArr29[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char c5 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31532);
                int packedPositionType = 921 - ExpandableListView.getPackedPositionType(0L);
                int gidForName = 27 - Process.getGidForName("");
                byte[] bArr = $$a;
                Object[] objArr30 = new Object[1];
                b((short) 99, bArr[54], (byte) (-bArr[2]), objArr30);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c5, packedPositionType, gidForName, -1142834547, false, (String) objArr30[0], null);
            }
            Object[] objArr31 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).get(null);
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr31[1])[0]}, (Object[]) objArr31[2], new int[]{((int[]) objArr31[3])[0]}, (String[]) objArr31[4]};
            int iMyPid = Process.myPid();
            int i32 = 788831605 + (((~iMyPid) | (-272445084)) * 1444) + (((~(iMyPid | 1022398617)) | (~(751681026 | iMyPid)) | (-1023262364)) * (-1444)) + 1632059641;
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr2[0])[0] = i34 ^ (i34 << 5);
            str = str13;
            str2 = str9;
        } else {
            Context applicationContext = (Context) Class.forName(str12).getMethod(str, new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    str = str13;
                    applicationContext = null;
                } else {
                    str = str13;
                    str = str13;
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            str = str13;
            int iIntValue2 = ((Integer) Class.forName(str10).getMethod(str11, Object.class).invoke(null, this)).intValue();
            int i35 = TuitionPaymentFragmentbindingInflater1 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i35 % 128;
            int i36 = i35 % 2;
            try {
                Object[] objArr32 = {applicationContext, Integer.valueOf(iIntValue2), 0, -1799761965};
                byte[] bArr2 = $$d;
                Object[] objArr33 = new Object[1];
                c(bArr2[53], bArr2[207], bArr2[15], objArr33);
                Class<?> cls = Class.forName((String) objArr33[0]);
                Object[] objArr34 = new Object[1];
                c(bArr2[45], bArr2[15], bArr2[207], objArr34);
                Object[] objArr35 = (Object[]) cls.getMethod((String) objArr34[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr32);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char windowTouchSlop = (char) (31533 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0');
                    int i37 = 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte[] bArr3 = $$a;
                    Object[] objArr36 = new Object[1];
                    b((short) 99, bArr3[54], (byte) (-bArr3[2]), objArr36);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(windowTouchSlop, iLastIndexOf, i37, -1142834547, false, (String) objArr36[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr35);
                try {
                    str2 = str9;
                    long jLongValue4 = ((Long) Class.forName(str8).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue4);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                        char keyRepeatDelay = (char) (31533 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        int iNormalizeMetaState = 921 - KeyEvent.normalizeMetaState(0);
                        int i38 = 28 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        Object[] objArr37 = new Object[1];
                        b((short) 151, $$a[54], (byte) 52, objArr37);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(keyRepeatDelay, iNormalizeMetaState, i38, -778300370, false, (String) objArr37[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                        char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 31533);
                        int i39 = 921 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int minimumFlingVelocity3 = 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        Object[] objArr38 = new Object[1];
                        b((short) 99, (byte) ($$b - 4), $$a[7], objArr38);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(offsetAfter, i39, minimumFlingVelocity3, -1048449946, false, (String) objArr38[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                    objArr2 = objArr35;
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        if (((int[]) objArr2[3])[0] != ((int[]) objArr2[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArr2[4];
            if (strArr4 != null) {
                for (String str15 : strArr4) {
                    arrayList2.add(str15);
                }
            }
            throw null;
        }
        int i40 = ((int[]) objArr2[0])[0];
        Object[] objArr39 = {new int[1], new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[]{((int[]) objArr2[3])[0]}, (String[]) objArr2[4]};
        int iIdentityHashCode4 = System.identityHashCode(this);
        int i41 = ~iIdentityHashCode4;
        int i42 = i40 + 334567914 + ((483258535 | i41) * (-757)) + ((~((-1076890961) | iIdentityHashCode4)) * 1514) + (((~(iIdentityHashCode4 | 1560149495)) | (~(i41 | (-1290821109))) | 213930148) * 757);
        int i43 = (i42 << 13) ^ i42;
        int i44 = i43 ^ (i43 >>> 17);
        ((int[]) objArr39[0])[0] = i44 ^ (i44 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
            char mode = (char) View.MeasureSpec.getMode(0);
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 876;
            int iIndexOf4 = 10 - TextUtils.indexOf("", "");
            Object[] objArr40 = new Object[1];
            b((short) 99, (byte) ($$b - 4), $$a[7], objArr40);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(mode, fadingEdgeLength, iIndexOf4, 252381699, false, (String) objArr40[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).getLong(null);
        long jLongValue5 = ((Long) Class.forName(str8).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
            char c6 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int i45 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 875;
            int iCombineMeasuredStates = 10 - View.combineMeasuredStates(0, 0);
            Object[] objArr41 = new Object[1];
            b((short) 62, $$a[54], (byte) 52, objArr41);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(c6, i45, iCombineMeasuredStates, 2009631821, false, (String) objArr41[0], null);
        }
        if (j3 == ((jLongValue5 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                char c7 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int longPressTimeout2 = 876 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 10;
                byte[] bArr4 = $$a;
                short s = bArr4[9];
                byte b = bArr4[7];
                Object[] objArr42 = new Object[1];
                b(s, b, b, objArr42);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(c7, longPressTimeout2, scrollBarSize, 256017550, false, (String) objArr42[0], null);
            }
            Object[] objArr43 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).get(null);
            objArr3 = new Object[]{new int[]{((int[]) objArr43[0])[0]}, new int[1], new int[]{((int[]) objArr43[2])[0]}, (String[]) objArr43[3]};
            int iMyPid2 = Process.myPid();
            int i46 = (((((~(538710235 | iMyPid2)) | (-43988588)) * 262) - 837716444) + (((~((~iMyPid2) | 538710235)) | (-43988588)) * 262)) - 1879347377;
            int i47 = (i46 << 13) ^ i46;
            int i48 = i47 ^ (i47 >>> 17);
            ((int[]) objArr3[1])[0] = i48 ^ (i48 << 5);
        } else {
            Context applicationContext2 = (Context) Class.forName(str12).getMethod(str, new Class[0]).invoke(null, null);
            if (applicationContext2 != null) {
                applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : applicationContext2.getApplicationContext();
            }
            Object[] objArr44 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str11, Object.class).invoke(null, this)).intValue()), -1879347377};
            byte[] bArr5 = $$d;
            Object[] objArr45 = new Object[1];
            c(bArr5[53], bArr5[15], (byte) 111, objArr45);
            Class<?> cls2 = Class.forName((String) objArr45[0]);
            Object[] objArr46 = new Object[1];
            c(bArr5[128], (short) 166, bArr5[132], objArr46);
            objArr3 = (Object[]) cls2.getMethod((String) objArr46[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr44);
            if (applicationContext2 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                    char c8 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int packedPositionType2 = 876 - ExpandableListView.getPackedPositionType(0L);
                    int i49 = 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    byte[] bArr6 = $$a;
                    short s2 = bArr6[9];
                    byte b2 = bArr6[7];
                    Object[] objArr47 = new Object[1];
                    b(s2, b2, b2, objArr47);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(c8, packedPositionType2, i49, 256017550, false, (String) objArr47[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).set(null, objArr3);
                try {
                    long jLongValue6 = ((Long) Class.forName(str8).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue6);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                        char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 876;
                        int i50 = 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        Object[] objArr48 = new Object[1];
                        b((short) 62, $$a[54], (byte) 52, objArr48);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cRgb, scrollBarFadeDuration, i50, 2009631821, false, (String) objArr48[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue6 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                        char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int iMyPid3 = 876 - (Process.myPid() >> 22);
                        int fadingEdgeLength2 = 10 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        Object[] objArr49 = new Object[1];
                        b((short) 99, (byte) ($$b - 4), $$a[7], objArr49);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(windowTouchSlop2, iMyPid3, fadingEdgeLength2, 252381699, false, (String) objArr49[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, lValueOf6);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            }
        }
        if (((int[]) objArr3[0])[0] != ((int[]) objArr3[2])[0]) {
            throw null;
        }
        int i51 = ((int[]) objArr3[1])[0];
        Object[] objArr50 = {new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
        int iIdentityHashCode5 = System.identityHashCode(this);
        int i52 = 2110649912 + (((~((-833781554) | iIdentityHashCode5)) | 793471324) * (-318));
        int i53 = ~(793471324 | iIdentityHashCode5);
        int i54 = ~iIdentityHashCode5;
        int i55 = i51 + i52 + ((i53 | (~((-239665229) | i54))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode5 | (-239665229))) | (~(1073446781 | i54))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
        int i56 = (i55 << 13) ^ i55;
        int i57 = i56 ^ (i56 >>> 17);
        ((int[]) objArr50[1])[0] = i57 ^ (i57 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
            char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int iResolveOpacity = 651 - Drawable.resolveOpacity(0, 0);
            int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 44;
            Object[] objArr51 = new Object[1];
            b((short) 62, $$a[54], (byte) 52, objArr51);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(tapTimeout2, iResolveOpacity, iCombineMeasuredStates2, -459846511, false, (String) objArr51[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).getLong(null);
        long jLongValue7 = ((Long) Class.forName(str8).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
            char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int i58 = 651 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int defaultSize = View.getDefaultSize(0, 0) + 44;
            Object[] objArr52 = new Object[1];
            b((short) 99, (byte) ($$b - 4), $$a[7], objArr52);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(edgeSlop2, i58, defaultSize, -873460649, false, (String) objArr52[0], null);
        }
        if (j4 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            str3 = "";
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                char capsMode = (char) TextUtils.getCapsMode(str3, 0, 0);
                int minimumFlingVelocity4 = 651 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int i59 = 45 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                byte[] bArr7 = $$a;
                Object[] objArr53 = new Object[1];
                b((short) 99, bArr7[54], (byte) (-bArr7[2]), objArr53);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(capsMode, minimumFlingVelocity4, i59, -1595579076, false, (String) objArr53[0], null);
            }
            Object[] objArr54 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).get(null);
            objArr4 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i60 = ((int[]) objArr54[2])[0];
            int i61 = ((int[]) objArr54[0])[0];
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i62 = (-1831235846) + ((~((-5505137) | iIdentityHashCode6)) * (-301)) + (((~(358057072 | iIdentityHashCode6)) | (~((~iIdentityHashCode6) | 361487882))) * (-301)) + (((~(iIdentityHashCode6 | (-361487883))) | 358057072) * 301) + 2117730253;
            int i63 = (i62 << 13) ^ i62;
            int i64 = i63 ^ (i63 >>> 17);
            ((int[]) objArr4[3])[0] = i64 ^ (i64 << 5);
            i = 0;
        } else {
            str3 = r8;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1610, MotionEvent.axisFromString(str3) + 27, 2145681644, false, null, new Class[0]);
            }
            Object[] objArr55 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).newInstance(null), 2117730253, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                int packedPositionChild = 650 - ExpandableListView.getPackedPositionChild(0L);
                int windowTouchSlop3 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 44;
                Object[] objArr56 = new Object[1];
                b((short) 99, (byte) ($$b - 4), $$a[7], objArr56);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cResolveSizeAndState, packedPositionChild, windowTouchSlop3, 2075921419, false, (String) objArr56[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf((CharSequence) str3, '0', 0, 0) + 1), KeyEvent.keyCodeFromString(str3) + 695, 98 - ExpandableListView.getPackedPositionGroup(0L)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ExpandableListView.getPackedPositionGroup(0L) + 63406), 793 - Color.alpha(0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 83), Integer.TYPE, Integer.TYPE});
            }
            Object[] objArr57 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).invoke(null, objArr55);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                char cIndexOf = (char) TextUtils.indexOf(str3, str3, 0, 0);
                int mode2 = 651 - View.MeasureSpec.getMode(0);
                int i65 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43;
                byte[] bArr8 = $$a;
                Object[] objArr58 = new Object[1];
                b((short) 99, bArr8[54], (byte) (-bArr8[2]), objArr58);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cIndexOf, mode2, i65, -1595579076, false, (String) objArr58[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, objArr57);
            try {
                long jLongValue8 = ((Long) Class.forName(str8).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf7 = Long.valueOf(jLongValue8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                    char c9 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int longPressTimeout3 = (ViewConfiguration.getLongPressTimeout() >> 16) + 651;
                    int mode3 = View.MeasureSpec.getMode(0) + 44;
                    Object[] objArr59 = new Object[1];
                    b((short) 99, (byte) ($$b - 4), $$a[7], objArr59);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(c9, longPressTimeout3, mode3, -873460649, false, (String) objArr59[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, lValueOf7);
                Long lValueOf8 = Long.valueOf(jLongValue8 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                    char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                    int maximumFlingVelocity3 = 651 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int mode4 = View.MeasureSpec.getMode(0) + 44;
                    Object[] objArr60 = new Object[1];
                    b((short) 62, $$a[54], (byte) 52, objArr60);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(mirror, maximumFlingVelocity3, mode4, -459846511, false, (String) objArr60[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, lValueOf8);
                objArr4 = objArr57;
                i = 0;
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        }
        int i66 = ((int[]) objArr4[i])[i];
        int i67 = ((int[]) objArr4[2])[i];
        if (i67 == i66) {
            Object[] objArr61 = new Object[4];
            int[] iArr = new int[1];
            objArr61[i] = iArr;
            int[] iArr2 = new int[1];
            objArr61[2] = iArr2;
            objArr61[3] = new int[1];
            int i68 = ((int[]) objArr4[3])[i];
            int i69 = ((int[]) objArr4[2])[i];
            int i70 = ((int[]) objArr4[i])[i];
            iArr2[i] = i69;
            iArr[i] = i70;
            objArr61[1] = new String[i];
            int i71 = ~System.identityHashCode(this);
            int i72 = i68 + (((125319502 + (((~((-538076214) | i71)) | 534645403) * (-933))) + (((~(i71 | 534645403)) | (-1071541952)) * 933)) - 492672782);
            int i73 = (i72 << 13) ^ i72;
            int i74 = i73 ^ (i73 >>> 17);
            i2 = 0;
            ((int[]) objArr61[3])[0] = i74 ^ (i74 << 5);
        } else {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr5 = (String[]) objArr4[1];
            if (strArr5 != null) {
                for (String str16 : strArr5) {
                    arrayList3.add(str16);
                }
            }
            Toast.makeText((Context) null, i67 / (((i67 - 1) * i67) % 2), 0).show();
            Object[] objArr62 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i75 = ((int[]) objArr4[3])[0];
            int i76 = ((int[]) objArr4[2])[0];
            int i77 = ((int[]) objArr4[0])[0];
            int i78 = ~((~System.identityHashCode(this)) | 104295832);
            int i79 = i75 + ((100860312 | i78) * (-374)) + 2080564649 + ((i78 | 3435520) * 374);
            int i80 = i79 ^ (i79 << 13);
            int i81 = i80 ^ (i80 >>> 17);
            i2 = 0;
            ((int[]) objArr62[3])[0] = i81 ^ (i81 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
            char minimumFlingVelocity5 = (char) (29944 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
            int i82 = 1755 - (TypedValue.complexToFloat(i2) > 0.0f ? 1 : (TypedValue.complexToFloat(i2) == 0.0f ? 0 : -1));
            int deadChar = KeyEvent.getDeadChar(i2, i2) + 23;
            byte[] bArr9 = $$a;
            Object[] objArr63 = new Object[1];
            b((short) 99, bArr9[54], (byte) (-bArr9[2]), objArr63);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(minimumFlingVelocity5, i82, deadChar, 986134021, false, (String) objArr63[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).getLong(null);
        long jLongValue9 = ((Long) Class.forName(str8).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
            char defaultSize2 = (char) (View.getDefaultSize(0, 0) + 29944);
            int capsMode2 = 1755 - TextUtils.getCapsMode(str3, 0, 0);
            int trimmedLength2 = 23 - TextUtils.getTrimmedLength(str3);
            Object[] objArr64 = new Object[1];
            b((short) 62, $$a[54], (byte) 52, objArr64);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(defaultSize2, capsMode2, trimmedLength2, 1596667560, false, (String) objArr64[0], null);
        }
        if (j5 == ((jLongValue9 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).getLong(null) << 52) >>> 52)) >> 12)) {
            int i83 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
            TuitionPaymentFragmentbindingInflater1 = i83 % 128;
            int i84 = i83 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                char threadPriority3 = (char) (29944 - ((Process.getThreadPriority(0) + 20) >> 6));
                int i85 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1754;
                int iIndexOf5 = TextUtils.indexOf(str3, str3, 0) + 23;
                Object[] objArr65 = new Object[1];
                b((short) 151, $$a[54], (byte) 52, objArr65);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(threadPriority3, i85, iIndexOf5, 1599039318, false, (String) objArr65[0], null);
            }
            Object[] objArr66 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr66[0])[0]}, new int[]{((int[]) objArr66[1])[0]}, (Object[]) objArr66[2], new int[1], (String[]) objArr66[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i86 = ~iUptimeMillis;
            int i87 = ((((-1296258624) + (((~((-91237993) | i86)) | (~((-121364434) | iUptimeMillis))) * 217)) + (((~(iUptimeMillis | (-91237993))) | 87035456) * 217)) + (((~((-121364434) | i86)) | 91237992) * 217)) - 870963086;
            int i88 = (i87 << 13) ^ i87;
            int i89 = i88 ^ (i88 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i89 ^ (i89 << 5);
        } else {
            int iIntValue3 = ((Integer) Class.forName(str10).getMethod(str11, Object.class).invoke(null, this)).intValue();
            Object[] objArr67 = {638368646};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b((char) (42050 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 1726, 29 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue3, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).newInstance(objArr67), -870963086);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                char tapTimeout3 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 29944);
                int iRgb = (-16775461) - Color.rgb(0, 0, 0);
                int iAxisFromString = 22 - MotionEvent.axisFromString(str3);
                Object[] objArr68 = new Object[1];
                b((short) 151, $$a[54], (byte) 52, objArr68);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(tapTimeout3, iRgb, iAxisFromString, 1599039318, false, (String) objArr68[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
            try {
                long jLongValue10 = ((Long) Class.forName(str8).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf9 = Long.valueOf(jLongValue10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                    char scrollDefaultDelay = (char) (29944 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                    int maximumDrawingCacheSize3 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1755;
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 23;
                    Object[] objArr69 = new Object[1];
                    b((short) 62, $$a[54], (byte) 52, objArr69);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(scrollDefaultDelay, maximumDrawingCacheSize3, absoluteGravity, 1596667560, false, (String) objArr69[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, lValueOf9);
                Long lValueOf10 = Long.valueOf(jLongValue10 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                    char pressedStateDuration = (char) (29944 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    int iCombineMeasuredStates3 = 1755 - View.combineMeasuredStates(0, 0);
                    int i90 = 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    byte[] bArr10 = $$a;
                    Object[] objArr70 = new Object[1];
                    b((short) 99, bArr10[54], (byte) (-bArr10[2]), objArr70);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(pressedStateDuration, iCombineMeasuredStates3, i90, 986134021, false, (String) objArr70[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, lValueOf10);
            } catch (Exception unused5) {
                throw new RuntimeException();
            }
        }
        int i91 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
        int i92 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        if (i92 == i91) {
            int i93 = TuitionPaymentFragmentbindingInflater1 + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i93 % 128;
            int i94 = i93 % 2;
            int i95 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr71 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int iMyUid = Process.myUid();
            int i96 = i95 + ((~(iMyUid | (-834291590))) * TypedValues.CycleType.TYPE_EASING) + 258218205 + (((~((~iMyUid) | (-834291590))) | 239341626) * TypedValues.CycleType.TYPE_EASING);
            int i97 = (i96 << 13) ^ i96;
            int i98 = i97 ^ (i97 >>> 17);
            ((int[]) objArr71[3])[0] = i98 ^ (i98 << 5);
        } else {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr6 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr6 != null) {
                for (String str17 : strArr6) {
                    arrayList4.add(str17);
                }
            }
            Toast.makeText((Context) null, i92 / (((i92 - 1) * i92) % 2), 0).show();
            int i99 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr72 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int i100 = ~System.identityHashCode(this);
            int i101 = i99 + (-872789855) + ((1073509367 | i100) * 184) + (((~(i100 | 1013465649)) | 332689862) * 184);
            int i102 = (i101 << 13) ^ i101;
            int i103 = i102 ^ (i102 >>> 17);
            ((int[]) objArr72[3])[0] = i103 ^ (i103 << 5);
        }
        if (createCroppedBitmap.TuitionPaymentFragmentbindingInflater1 == null) {
            createCroppedBitmap.TuitionPaymentFragmentbindingInflater1 = new createCroppedBitmap();
        }
        getContext();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
            char c10 = (char) (53893 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int mode5 = 1320 - View.MeasureSpec.getMode(0);
            int packedPositionGroup = 36 - ExpandableListView.getPackedPositionGroup(0L);
            Object[] objArr73 = new Object[1];
            b((short) 99, (byte) ($$b - 4), $$a[7], objArr73);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(c10, mode5, packedPositionGroup, -1433084963, false, (String) objArr73[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).getLong(null);
        long jLongValue11 = ((Long) Class.forName(str8).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
            char cIndexOf2 = (char) (TextUtils.indexOf(str3, str3) + 53893);
            int iResolveSize = View.resolveSize(0, 0) + 1320;
            int tapTimeout4 = (ViewConfiguration.getTapTimeout() >> 16) + 36;
            byte[] bArr11 = $$a;
            Object[] objArr74 = new Object[1];
            b((short) 99, bArr11[54], (byte) (-bArr11[2]), objArr74);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(cIndexOf2, iResolveSize, tapTimeout4, -1273706634, false, (String) objArr74[0], null);
        }
        if (j6 == ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                char cBlue = (char) (53893 - Color.blue(0));
                int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 1320;
                int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 36;
                Object[] objArr75 = new Object[1];
                b((short) 151, $$a[54], (byte) 52, objArr75);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(cBlue, edgeSlop3, iNormalizeMetaState2, -1920778747, false, (String) objArr75[0], null);
            }
            Object[] objArr76 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).get(null);
            objArr5 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i104 = ((int[]) objArr76[0])[0];
            int i105 = ((int[]) objArr76[3])[0];
            String[] strArr7 = (String[]) objArr76[2];
            int i106 = (int) Runtime.getRuntime().totalMemory();
            int i107 = ~i106;
            int i108 = 1388939024 + ((i106 | 1274921352) * 140) + (((~(1274921352 | i107)) | 67116128) * (-280)) + (((~(i106 | (-67116129))) | (~(95706472 | i107)) | 1246331008) * 140) + 620689039;
            int i109 = (i108 << 13) ^ i108;
            int i110 = i109 ^ (i109 >>> 17);
            ((int[]) objArr5[1])[0] = i110 ^ (i110 << 5);
            str4 = str;
        } else {
            Context applicationContext3 = (Context) Class.forName(str12).getMethod(str4, new Class[0]).invoke(null, null);
            if (applicationContext3 != null) {
                if ((applicationContext3 instanceof ContextWrapper) && ((ContextWrapper) applicationContext3).getBaseContext() == null) {
                    str4 = str;
                    applicationContext3 = null;
                } else {
                    str4 = str;
                    str4 = str;
                    applicationContext3 = applicationContext3.getApplicationContext();
                }
            }
            str4 = str;
            int iIntValue4 = ((Integer) Class.forName(str10).getMethod(str11, Object.class).invoke(null, this)).intValue();
            Object[] objArr77 = {-1576155253};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b((char) (Process.getGidForName(str3) + 47978), 1301 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr78 = {applicationContext3, "com.bpjstku", 620689039, Integer.valueOf(iIntValue4), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).newInstance(objArr77), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                char cKeyCodeFromString = (char) (53893 - KeyEvent.keyCodeFromString(str3));
                int iArgb = Color.argb(0, 0, 0, 0) + 1320;
                int fadingEdgeLength3 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 36;
                Object[] objArr79 = new Object[1];
                b((short) 151, $$a[54], (byte) 52, objArr79);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(cKeyCodeFromString, iArgb, fadingEdgeLength3, 819724799, false, (String) objArr79[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Drawable.resolveOpacity(0, 0) + 57878), 1393 - ImageFormat.getBitsPerPixel(0), 74 - TextUtils.lastIndexOf(str3, '0')), Boolean.TYPE});
            }
            Object[] objArr80 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).invoke(null, objArr78);
            if (applicationContext3 != null) {
                int i111 = TuitionPaymentFragmentbindingInflater1 + 57;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i111 % 128;
                int i112 = i111 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                    char packedPositionType3 = (char) (ExpandableListView.getPackedPositionType(0L) + 53893);
                    int iAlpha = 1320 - Color.alpha(0);
                    int iIndexOf6 = 36 - TextUtils.indexOf(str3, str3);
                    Object[] objArr81 = new Object[1];
                    b((short) 151, $$a[54], (byte) 52, objArr81);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(packedPositionType3, iAlpha, iIndexOf6, -1920778747, false, (String) objArr81[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, objArr80);
                try {
                    long jLongValue12 = ((Long) Class.forName(str8).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                        char c11 = (char) (53893 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        int packedPositionGroup2 = 1320 - ExpandableListView.getPackedPositionGroup(0L);
                        int i113 = 37 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        byte[] bArr12 = $$a;
                        Object[] objArr82 = new Object[1];
                        b((short) 99, bArr12[54], (byte) (-bArr12[2]), objArr82);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(c11, packedPositionGroup2, i113, -1273706634, false, (String) objArr82[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue12 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                        char cRgb2 = (char) ((-16723323) - Color.rgb(0, 0, 0));
                        int defaultSize3 = 1320 - View.getDefaultSize(0, 0);
                        int iArgb2 = 36 - Color.argb(0, 0, 0, 0);
                        Object[] objArr83 = new Object[1];
                        b((short) 99, (byte) ($$b - 4), $$a[7], objArr83);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(cRgb2, defaultSize3, iArgb2, -1433084963, false, (String) objArr83[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, lValueOf12);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            } else {
                objArr80 = objArr80;
            }
            objArr5 = objArr80;
        }
        int i114 = ((int[]) objArr5[3])[0];
        int i115 = ((int[]) objArr5[0])[0];
        if (i115 == i114) {
            Object[] objArr84 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i116 = ((int[]) objArr5[1])[0];
            int i117 = ((int[]) objArr5[0])[0];
            int i118 = ((int[]) objArr5[3])[0];
            String[] strArr8 = (String[]) objArr5[2];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i119 = 553651196 + (((~((~startUptimeMillis) | (-666116135))) | 100663332) * (-245));
            int i120 = ~(startUptimeMillis | (-666116135));
            int i121 = i116 + i119 + (i120 * (-245)) + ((i120 | 704511690) * 245);
            int i122 = (i121 << 13) ^ i121;
            int i123 = i122 ^ (i122 >>> 17);
            ((int[]) objArr84[1])[0] = i123 ^ (i123 << 5);
            int i124 = TuitionPaymentFragmentbindingInflater1 + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i124 % 128;
            int i125 = i124 % 2;
            i3 = 0;
        } else {
            Toast.makeText((Context) null, i115 / (((i115 - 1) * i115) % 2), 0).show();
            Object[] objArr85 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i126 = ((int[]) objArr5[1])[0];
            int i127 = ((int[]) objArr5[0])[0];
            int i128 = ((int[]) objArr5[3])[0];
            String[] strArr9 = (String[]) objArr5[2];
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i129 = ~((-313675523) | iIdentityHashCode7);
            int i130 = ~iIdentityHashCode7;
            int i131 = i126 + 51343842 + ((i129 | (~((-541065289) | i130))) * 497) + (((~(iIdentityHashCode7 | (-541065289))) | (~((-515887015) | i130)) | 202211492) * 497);
            int i132 = i131 ^ (i131 << 13);
            int i133 = i132 ^ (i132 >>> 17);
            i3 = 0;
            ((int[]) objArr85[1])[0] = i133 ^ (i133 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
            char cResolveSize = (char) View.resolveSize(i3, i3);
            int i134 = (TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
            int keyRepeatDelay2 = 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte[] bArr13 = $$a;
            Object[] objArr86 = new Object[1];
            b((short) 99, bArr13[54], (byte) (-bArr13[2]), objArr86);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(cResolveSize, i134, keyRepeatDelay2, -1650998592, false, (String) objArr86[0], null);
        }
        long j7 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null);
        long jLongValue13 = ((Long) Class.forName(str8).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
            char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(str3));
            int iIndexOf7 = 876 - TextUtils.indexOf(str3, str3, 0, 0);
            int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L) + 10;
            Object[] objArr87 = new Object[1];
            b((short) 151, $$a[54], (byte) 52, objArr87);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(cAxisFromString, iIndexOf7, packedPositionGroup3, 2012020043, false, (String) objArr87[0], null);
        }
        if (j7 == ((jLongValue13 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).getLong(null) << 52) >>> 52)) >> 12)) {
            int i135 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
            TuitionPaymentFragmentbindingInflater1 = i135 % 128;
            int i136 = i135 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char c12 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                int fadingEdgeLength4 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 876;
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 10;
                Object[] objArr88 = new Object[1];
                b((short) ($$b | 194), $$a[54], (byte) 52, objArr88);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(c12, fadingEdgeLength4, jumpTapTimeout, 2012931276, false, (String) objArr88[0], null);
            }
            Object[] objArr89 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).get(null);
            objArr6 = new Object[]{new int[]{((int[]) objArr89[0])[0]}, new int[1], new int[]{((int[]) objArr89[2])[0]}, (String[]) objArr89[3]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i137 = ((((~((~iElapsedRealtime) | 670820989)) * 130) + 1544432080) + (((~(iElapsedRealtime | 670820989)) | 560136192) * 130)) - 1829242335;
            int i138 = (i137 << 13) ^ i137;
            int i139 = i138 ^ (i138 >>> 17);
            ((int[]) objArr6[1])[0] = i139 ^ (i139 << 5);
        } else {
            Context applicationContext4 = (Context) Class.forName(str12).getMethod(str4, new Class[0]).invoke(null, null);
            if (applicationContext4 != null) {
                applicationContext4 = ((applicationContext4 instanceof ContextWrapper) && ((ContextWrapper) applicationContext4).getBaseContext() == null) ? null : applicationContext4.getApplicationContext();
            }
            Object[] objArr90 = {applicationContext4, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str11, Object.class).invoke(null, this)).intValue()), 0, -1829242335};
            byte[] bArr14 = $$d;
            Object[] objArr91 = new Object[1];
            c(bArr14[53], (short) 218, (byte) 69, objArr91);
            Class<?> cls3 = Class.forName((String) objArr91[0]);
            Object[] objArr92 = new Object[1];
            c(bArr14[128], (short) 166, bArr14[132], objArr92);
            objArr6 = (Object[]) cls3.getMethod((String) objArr92[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr90);
            if (applicationContext4 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                    char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int deadChar2 = KeyEvent.getDeadChar(0, 0) + 876;
                    int packedPositionType4 = ExpandableListView.getPackedPositionType(0L) + 10;
                    Object[] objArr93 = new Object[1];
                    b((short) ($$b | 194), $$a[54], (byte) 52, objArr93);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(jumpTapTimeout2, deadChar2, packedPositionType4, 2012931276, false, (String) objArr93[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, objArr6);
                try {
                    long jLongValue14 = ((Long) Class.forName(str8).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue14);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                        char cGreen = (char) Color.green(0);
                        int iMakeMeasureSpec = 876 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int i140 = 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        Object[] objArr94 = new Object[1];
                        b((short) 151, $$a[54], (byte) 52, objArr94);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(cGreen, iMakeMeasureSpec, i140, 2012020043, false, (String) objArr94[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue14 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                        char c13 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                        int iResolveSizeAndState = 876 - View.resolveSizeAndState(0, 0, 0);
                        int i141 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        byte[] bArr15 = $$a;
                        Object[] objArr95 = new Object[1];
                        b((short) 99, bArr15[54], (byte) (-bArr15[2]), objArr95);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(c13, iResolveSizeAndState, i141, -1650998592, false, (String) objArr95[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, lValueOf14);
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            }
        }
        int i142 = ((int[]) objArr6[2])[0];
        int i143 = ((int[]) objArr6[0])[0];
        if (i143 == i142) {
            int i144 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
            TuitionPaymentFragmentbindingInflater1 = i144 % 128;
            int i145 = i144 % 2;
            int i146 = ((int[]) objArr6[1])[0];
            Object[] objArr96 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            int i147 = (~System.identityHashCode(this)) | 787042822;
            int i148 = i146 + 1491103273 + (i147 * 495) + (((~i147) | 40452614) * 495);
            int i149 = i148 ^ (i148 << 13);
            int i150 = i149 ^ (i149 >>> 17);
            i4 = 0;
            ((int[]) objArr96[1])[0] = i150 ^ (i150 << 5);
        } else {
            Toast.makeText((Context) null, i143 / (((i143 - 1) * i143) % 2), 0).show();
            int i151 = ((int[]) objArr6[1])[0];
            Object[] objArr97 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i152 = ~iMaxMemory;
            int i153 = i151 + 961658262 + ((497351847 | i152) * (-757)) + ((~(532545271 | iMaxMemory)) * 1514) + (((~(iMaxMemory | (-35193425))) | (~(i152 | 457041618)) | 75503653) * 757);
            int i154 = i153 ^ (i153 << 13);
            int i155 = i154 ^ (i154 >>> 17);
            i4 = 0;
            ((int[]) objArr97[1])[0] = i155 ^ (i155 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
            char cGreen2 = (char) Color.green(i4);
            int windowTouchSlop4 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
            int iRgb2 = (-16777206) - Color.rgb(i4, i4, i4);
            byte[] bArr16 = $$a;
            byte b3 = bArr16[9];
            Object[] objArr98 = new Object[1];
            b(b3, bArr16[51], b3, objArr98);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(cGreen2, windowTouchSlop4, iRgb2, -1199417970, false, (String) objArr98[0], null);
        }
        long j8 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).getLong(null);
        long jLongValue15 = ((Long) Class.forName(str8).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
            char c14 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int scrollBarFadeDuration2 = 876 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i156 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
            byte[] bArr17 = $$a;
            byte b4 = bArr17[7];
            Object[] objArr99 = new Object[1];
            b(b4, bArr17[14], b4, objArr99);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(c14, scrollBarFadeDuration2, i156, 254769921, false, (String) objArr99[0], null);
        }
        if (j8 == ((jLongValue15 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                char cRgb3 = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                int iNormalizeMetaState3 = 876 - KeyEvent.normalizeMetaState(0);
                int iAlpha2 = Color.alpha(0) + 10;
                byte[] bArr18 = $$a;
                Object[] objArr100 = new Object[1];
                b(bArr18[7], bArr18[51], bArr18[41], objArr100);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(cRgb3, iNormalizeMetaState3, iAlpha2, 1324201839, false, (String) objArr100[0], null);
            }
            Object[] objArr101 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).get(null);
            objArr7 = new Object[]{new int[]{((int[]) objArr101[0])[0]}, new int[1], new int[]{((int[]) objArr101[2])[0]}, (String[]) objArr101[3]};
            int iIdentityHashCode8 = System.identityHashCode(this);
            int i157 = ~iIdentityHashCode8;
            int i158 = (((1736245914 + (((~(283761976 | i157)) | (~((-11078705) | iIdentityHashCode8))) * (-831))) + ((~(335150909 | iIdentityHashCode8)) * (-1662))) + (((~(iIdentityHashCode8 | (-283761977))) | ((~(i157 | (-324072206))) | (~(324072205 | iIdentityHashCode8)))) * 831)) - 672438568;
            int i159 = (i158 << 13) ^ i158;
            int i160 = i159 ^ (i159 >>> 17);
            ((int[]) objArr7[1])[0] = i160 ^ (i160 << 5);
            str5 = str3;
        } else {
            Object[] objArr102 = {Integer.valueOf(((Integer) Class.forName(str10).getMethod(str11, Object.class).invoke(null, this)).intValue()), -672438568};
            byte[] bArr19 = $$d;
            Object[] objArr103 = new Object[1];
            c(bArr19[276], (short) 287, bArr19[12], objArr103);
            Class<?> cls4 = Class.forName((String) objArr103[0]);
            Object[] objArr104 = new Object[1];
            c(bArr19[128], (short) 302, bArr19[102], objArr104);
            Object[] objArr105 = (Object[]) cls4.getMethod((String) objArr104[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr102);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                char threadPriority4 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int i161 = 876 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int iBlue = Color.blue(0) + 10;
                byte[] bArr20 = $$a;
                Object[] objArr106 = new Object[1];
                b(bArr20[7], bArr20[51], bArr20[41], objArr106);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(threadPriority4, i161, iBlue, 1324201839, false, (String) objArr106[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, objArr105);
            try {
                long jLongValue16 = ((Long) Class.forName(str8).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf15 = Long.valueOf(jLongValue16);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                str5 = str3;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                    char offsetAfter2 = (char) TextUtils.getOffsetAfter(str5, 0);
                    int capsMode3 = 876 - TextUtils.getCapsMode(str5, 0, 0);
                    int capsMode4 = 10 - TextUtils.getCapsMode(str5, 0, 0);
                    byte[] bArr21 = $$a;
                    byte b5 = bArr21[7];
                    Object[] objArr107 = new Object[1];
                    b(b5, bArr21[14], b5, objArr107);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(offsetAfter2, capsMode3, capsMode4, 254769921, false, (String) objArr107[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, lValueOf15);
                Long lValueOf16 = Long.valueOf(jLongValue16 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                    char c15 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                    int i162 = 877 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int i163 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                    byte[] bArr22 = $$a;
                    byte b6 = bArr22[9];
                    Object[] objArr108 = new Object[1];
                    b(b6, bArr22[51], b6, objArr108);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(c15, i162, i163, -1199417970, false, (String) objArr108[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, lValueOf16);
                objArr7 = objArr105;
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr7[0])[0] != ((int[]) objArr7[2])[0]) {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr10 = (String[]) objArr7[3];
            if (strArr10 != null) {
                int i164 = TuitionPaymentFragmentbindingInflater1 + 109;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i164 % 128;
                int i165 = i164 % 2;
                for (String str18 : strArr10) {
                    arrayList5.add(str18);
                }
            }
            throw null;
        }
        int i166 = ((int[]) objArr7[1])[0];
        Object[] objArr109 = {new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
        int iIdentityHashCode9 = System.identityHashCode(this);
        int i167 = ~iIdentityHashCode9;
        int i168 = (~(735257714 | i167)) | (-804994680) | (~(775567943 | i167));
        int i169 = i166 + 2006369576 + (((~(iIdentityHashCode9 | (-705830979))) | i168) * 590) + (i168 * (-1180)) + (((~((-775567944) | i167)) | (~(i167 | (-735257715)))) * 590);
        int i170 = (i169 << 13) ^ i169;
        int i171 = i170 ^ (i170 >>> 17);
        ((int[]) objArr109[1])[0] = i171 ^ (i171 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
            char size = (char) View.MeasureSpec.getSize(0);
            int iNormalizeMetaState4 = KeyEvent.normalizeMetaState(0) + 2267;
            int i172 = 34 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            Object[] objArr110 = new Object[1];
            b((short) 151, $$a[54], (byte) 52, objArr110);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(size, iNormalizeMetaState4, i172, -887667012, false, (String) objArr110[0], null);
        }
        long j9 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).getLong(null);
        long jLongValue17 = ((Long) Class.forName(str8).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
            char keyRepeatDelay3 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int i173 = 2268 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int keyRepeatTimeout3 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33;
            Object[] objArr111 = new Object[1];
            b((short) ($$b | 194), $$a[54], (byte) 52, objArr111);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(keyRepeatDelay3, i173, keyRepeatTimeout3, -874156483, false, (String) objArr111[0], null);
        }
        if (j9 == ((jLongValue17 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                char offsetBefore = (char) TextUtils.getOffsetBefore(str5, 0);
                int gidForName2 = Process.getGidForName(str5) + 2268;
                int size2 = 33 - View.MeasureSpec.getSize(0);
                byte[] bArr23 = $$a;
                Object[] objArr112 = new Object[1];
                b((short) 99, bArr23[54], (byte) (-bArr23[2]), objArr112);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(offsetBefore, gidForName2, size2, -654680577, false, (String) objArr112[0], null);
            }
            Object[] objArr113 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).get(null);
            objArr8 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i174 = ((int[]) objArr113[0])[0];
            int i175 = ((int[]) objArr113[3])[0];
            String[] strArr11 = (String[]) objArr113[1];
            int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
            int i176 = ~iMaxMemory2;
            int i177 = (-1911137429) + (((~((-660784461) | i176)) | 4195588) * 168) + ((~((-4195589) | iMaxMemory2)) * 168) + (((~(iMaxMemory2 | (-656588873))) | (~(i176 | (-147928856))) | 143733267) * 168) + 1057655777;
            int i178 = (i177 << 13) ^ i177;
            int i179 = i178 ^ (i178 >>> 17);
            ((int[]) objArr8[2])[0] = i179 ^ (i179 << 5);
            str6 = str2;
        } else {
            Context applicationContext5 = (Context) Class.forName(str12).getMethod(str4, new Class[0]).invoke(null, null);
            if (applicationContext5 != null) {
                if (applicationContext5 instanceof ContextWrapper) {
                    int i180 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
                    TuitionPaymentFragmentbindingInflater1 = i180 % 128;
                    int i181 = i180 % 2;
                    if (((ContextWrapper) applicationContext5).getBaseContext() != null) {
                        applicationContext5 = applicationContext5.getApplicationContext();
                    } else {
                        applicationContext5 = null;
                    }
                } else {
                    applicationContext5 = applicationContext5.getApplicationContext();
                }
            }
            Object[] objArr114 = {applicationContext5, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str11, Object.class).invoke(null, this)).intValue()), 0, 1057655777};
            byte[] bArr24 = $$d;
            Object[] objArr115 = new Object[1];
            c(bArr24[100], (short) 339, bArr24[53], objArr115);
            Class<?> cls5 = Class.forName((String) objArr115[0]);
            Object[] objArr116 = new Object[1];
            c(bArr24[128], (short) 166, bArr24[132], objArr116);
            Object[] objArr117 = (Object[]) cls5.getMethod((String) objArr116[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr114);
            if (applicationContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                    char cIndexOf3 = (char) TextUtils.indexOf(str5, str5, 0, 0);
                    int packedPositionGroup4 = 2267 - ExpandableListView.getPackedPositionGroup(0L);
                    int jumpTapTimeout3 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 33;
                    byte[] bArr25 = $$a;
                    Object[] objArr118 = new Object[1];
                    b((short) 99, bArr25[54], (byte) (-bArr25[2]), objArr118);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(cIndexOf3, packedPositionGroup4, jumpTapTimeout3, -654680577, false, (String) objArr118[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).set(null, objArr117);
                try {
                    str6 = str2;
                    long jLongValue18 = ((Long) Class.forName(str8).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue18);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                        char c16 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                        int offsetBefore2 = TextUtils.getOffsetBefore(str5, 0) + 2267;
                        int iIndexOf8 = 32 - TextUtils.indexOf((CharSequence) str5, '0', 0, 0);
                        Object[] objArr119 = new Object[1];
                        b((short) ($$b | 194), $$a[54], (byte) 52, objArr119);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(c16, offsetBefore2, iIndexOf8, -874156483, false, (String) objArr119[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue18 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                        char fadingEdgeLength5 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int iAlpha3 = 2267 - Color.alpha(0);
                        int iGreen = Color.green(0) + 33;
                        Object[] objArr120 = new Object[1];
                        b((short) 151, $$a[54], (byte) 52, objArr120);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(fadingEdgeLength5, iAlpha3, iGreen, -887667012, false, (String) objArr120[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            } else {
                str6 = str2;
                objArr117 = objArr117;
            }
            objArr8 = objArr117;
        }
        int i182 = ((int[]) objArr8[3])[0];
        int i183 = ((int[]) objArr8[0])[0];
        if (i183 == i182) {
            Object[] objArr121 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i184 = ((int[]) objArr8[2])[0];
            int i185 = ((int[]) objArr8[0])[0];
            int i186 = ((int[]) objArr8[3])[0];
            String[] strArr12 = (String[]) objArr8[1];
            int iIdentityHashCode10 = System.identityHashCode(this);
            int i187 = ~iIdentityHashCode10;
            int i188 = i184 + 1462847139 + ((201368449 | i187) * (-192)) + (((~((-588991611) | i187)) | 18353256) * (-384)) + (((~(iIdentityHashCode10 | 790360059)) | (~(i187 | (-570638355))) | (~((-18353257) | iIdentityHashCode10))) * DerHeader.TAG_CLASS_PRIVATE);
            int i189 = (i188 << 13) ^ i188;
            int i190 = i189 ^ (i189 >>> 17);
            i5 = 0;
            ((int[]) objArr121[2])[0] = i190 ^ (i190 << 5);
        } else {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr13 = (String[]) objArr8[1];
            if (strArr13 != null) {
                for (String str19 : strArr13) {
                    arrayList6.add(str19);
                }
            }
            Toast.makeText((Context) null, i183 / (((i183 - 1) * i183) % 2), 0).show();
            Object[] objArr122 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i191 = ((int[]) objArr8[2])[0];
            int i192 = ((int[]) objArr8[0])[0];
            int i193 = ((int[]) objArr8[3])[0];
            String[] strArr14 = (String[]) objArr8[1];
            int iIdentityHashCode11 = System.identityHashCode(this);
            int i194 = i191 + 1065820892 + (((-201900033) | iIdentityHashCode11) * (-627)) + (((~((-601300928) | iIdentityHashCode11)) | 207412388) * (-627)) + (((~(iIdentityHashCode11 | 207412388)) | (~((~iIdentityHashCode11) | 601300927))) * 627);
            int i195 = (i194 << 13) ^ i194;
            int i196 = i195 ^ (i195 >>> 17);
            i5 = 0;
            ((int[]) objArr122[2])[0] = i196 ^ (i196 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
            char absoluteGravity2 = (char) (37567 - Gravity.getAbsoluteGravity(i5, i5));
            int i197 = 626 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int i198 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13;
            Object[] objArr123 = new Object[1];
            b((short) 99, (byte) ($$b - 4), $$a[7], objArr123);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(absoluteGravity2, i197, i198, -477065106, false, (String) objArr123[0], null);
        }
        long j10 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).getLong(null);
        long jLongValue19 = ((Long) Class.forName(str8).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
            char scrollBarSize2 = (char) (37567 - (ViewConfiguration.getScrollBarSize() >> 8));
            int i199 = 626 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int modifierMetaStateMask2 = 13 - ((byte) KeyEvent.getModifierMetaStateMask());
            Object[] objArr124 = new Object[1];
            b((short) ($$b | 194), $$a[54], (byte) 52, objArr124);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(scrollBarSize2, i199, modifierMetaStateMask2, -976899241, false, (String) objArr124[0], null);
        }
        if (j10 == ((jLongValue19 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                char cKeyCodeFromString2 = (char) (KeyEvent.keyCodeFromString(str5) + 37567);
                int packedPositionChild2 = 624 - ExpandableListView.getPackedPositionChild(0L);
                int scrollBarSize3 = 14 - (ViewConfiguration.getScrollBarSize() >> 8);
                Object[] objArr125 = new Object[1];
                b((short) 151, $$a[54], (byte) 52, objArr125);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(cKeyCodeFromString2, packedPositionChild2, scrollBarSize3, -973632554, false, (String) objArr125[0], null);
            }
            Object[] objArr126 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).get(null);
            int i200 = ((int[]) objArr126[2])[0];
            int i201 = ((int[]) objArr126[0])[0];
            String[] strArr15 = (String[]) objArr126[3];
            int[] iArr3 = {i200};
            int iIdentityHashCode12 = System.identityHashCode(this);
            int i202 = 2059858632 + (((~((-877848181) | iIdentityHashCode12)) | 68338784 | (~(945889940 | iIdentityHashCode12))) * (-754));
            int i203 = ~((-68338785) | iIdentityHashCode12);
            int i204 = ~iIdentityHashCode12;
            int i205 = i202 + ((i203 | (~(1014228724 | i204))) * (-754)) + ((i204 | (-877848181)) * 754) + 853920080;
            int i206 = (i205 << 13) ^ i205;
            int i207 = i206 ^ (i206 >>> 17);
            ((int[]) objArr9[1])[0] = i207 ^ (i207 << 5);
            objArr9 = new Object[]{new int[]{i201}, new int[1], iArr3, strArr15};
            c = 0;
            str7 = str6;
        } else {
            Context applicationContext6 = (Context) Class.forName(str12).getMethod(str4, new Class[0]).invoke(null, null);
            if (applicationContext6 != null) {
                applicationContext6 = ((applicationContext6 instanceof ContextWrapper) && ((ContextWrapper) applicationContext6).getBaseContext() == null) ? null : applicationContext6.getApplicationContext();
            }
            int iIntValue5 = ((Integer) Class.forName(str10).getMethod(str11, Object.class).invoke(null, this)).intValue();
            Object[] objArr127 = new Object[1];
            a(true, Color.green(0) + 95, Color.green(0) + 64, 49 - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{65511, 24, 65516, 65514, 28, 29, 65519, 65515, 65516, 29, 24, 65519, 65512, 65512, 65520, 65513, 24, 65520, 65520, 65515, 27, 65514, 65512, 25, 65518, 28, 25, 65518, 65518, 65516, 28, 65517, 65512, 65518, 65516, 24, 28, 28, 65516, 29, 29, 65520, 65517, 29, 25, 24, 24, 29, 28, 65513, 25, 65513, 29, 25, 25, 65515, 65519, 65520, 25, 65513, 65519, 65515, 24, 65519}, objArr127);
            String str20 = (String) objArr127[0];
            Object[] objArr128 = new Object[1];
            a(false, 91 - TextUtils.indexOf(str5, str5), 64 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 59 - ExpandableListView.getPackedPositionType(0L), new char[]{65520, 29, 65522, ' ', '!', 65515, 29, ' ', 65517, '!', 65519, 65517, 65518, 65521, 65518, 65520, 65522, '!', 65521, 29, 65519, 29, 65524, 65518, 65524, 65524, 65523, 65524, 29, 65520, 65516, 65519, ' ', 28, 65517, 65517, ' ', '!', 65521, 65522, 65519, 65518, 65518, 65524, 30, 65524, 65524, 29, 65519, 65518, 65517, 30, '!', 65517, 65519, 28, 65515, 65521, '!', 30, 28, 31, 65521, 65515}, objArr128);
            Object[] objArr129 = {applicationContext6, new String[]{str20, (String) objArr128[0]}, Integer.valueOf(iIntValue5), 17, 853920080};
            byte[] bArr26 = $$d;
            Object[] objArr130 = new Object[1];
            c(bArr26[53], (short) 348, bArr26[34], objArr130);
            Class<?> cls6 = Class.forName((String) objArr130[0]);
            Object[] objArr131 = new Object[1];
            c(bArr26[128], (short) 387, bArr26[132], objArr131);
            objArr9 = (Object[]) cls6.getMethod((String) objArr131[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr129);
            int i208 = ((int[]) objArr9[0])[0];
            int i209 = ((int[]) objArr9[2])[0];
            if (applicationContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                    char cIndexOf4 = (char) (37567 - TextUtils.indexOf(str5, str5, 0, 0));
                    int i210 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 625;
                    int packedPositionGroup5 = 14 - ExpandableListView.getPackedPositionGroup(0L);
                    Object[] objArr132 = new Object[1];
                    b((short) 151, $$a[54], (byte) 52, objArr132);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(cIndexOf4, i210, packedPositionGroup5, -973632554, false, (String) objArr132[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).set(null, objArr9);
                try {
                    str7 = str6;
                    long jLongValue20 = ((Long) Class.forName(str8).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf19 = Long.valueOf(jLongValue20);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                        char minimumFlingVelocity6 = (char) (37567 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int trimmedLength3 = TextUtils.getTrimmedLength(str5) + 625;
                        int size3 = 14 - View.MeasureSpec.getSize(0);
                        Object[] objArr133 = new Object[1];
                        b((short) ($$b | 194), $$a[54], (byte) 52, objArr133);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(minimumFlingVelocity6, trimmedLength3, size3, -976899241, false, (String) objArr133[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, lValueOf19);
                    Long lValueOf20 = Long.valueOf(jLongValue20 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                        char mode6 = (char) (37567 - View.MeasureSpec.getMode(0));
                        int capsMode5 = 625 - TextUtils.getCapsMode(str5, 0, 0);
                        int scrollBarSize4 = (ViewConfiguration.getScrollBarSize() >> 8) + 14;
                        Object[] objArr134 = new Object[1];
                        b((short) 99, (byte) ($$b - 4), $$a[7], objArr134);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(mode6, capsMode5, scrollBarSize4, -477065106, false, (String) objArr134[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf20);
                } catch (Exception unused10) {
                    throw new RuntimeException();
                }
            } else {
                str7 = str6;
            }
            c = 0;
        }
        int i211 = ((int[]) objArr9[c])[c];
        int i212 = ((int[]) objArr9[2])[c];
        if (i212 == i211) {
            Object[] objArr135 = new Object[4];
            int[] iArr4 = new int[1];
            objArr135[c] = iArr4;
            objArr135[1] = new int[1];
            int[] iArr5 = new int[1];
            objArr135[2] = iArr5;
            int i213 = ((int[]) objArr9[1])[c];
            int i214 = ((int[]) objArr9[2])[c];
            int i215 = ((int[]) objArr9[c])[c];
            String[] strArr16 = (String[]) objArr9[3];
            iArr5[c] = i214;
            iArr4[c] = i215;
            int i216 = ~new Random().nextInt();
            int i217 = i213 + (-278633320) + ((~((-537436775) | i216)) * (-783)) + (((~(i216 | 1201102233)) | (-622635888)) * 783);
            int i218 = (i217 << 13) ^ i217;
            int i219 = i218 ^ (i218 >>> 17);
            ((int[]) objArr135[1])[0] = i219 ^ (i219 << 5);
            objArr135[3] = strArr16;
            i6 = 0;
        } else {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr17 = (String[]) objArr9[3];
            if (strArr17 != null) {
                for (String str21 : strArr17) {
                    arrayList7.add(str21);
                }
            }
            int[] iArr6 = new int[i212];
            int i220 = i212 - 1;
            iArr6[i220] = 1;
            Toast.makeText((Context) null, iArr6[((i212 * i220) % 2) - 1], 1).show();
            int i221 = ((int[]) objArr9[1])[0];
            int i222 = ((int[]) objArr9[2])[0];
            int i223 = ((int[]) objArr9[0])[0];
            String[] strArr18 = (String[]) objArr9[3];
            int[] iArr7 = {i222};
            int i224 = ~((~((int) Runtime.getRuntime().freeMemory())) | 1257227406);
            int i225 = i221 + (((1244364932 | i224) * (-970)) - 1914753204) + ((i224 | 12862474) * 970);
            int i226 = (i225 << 13) ^ i225;
            int i227 = i226 ^ (i226 >>> 17);
            i6 = 0;
            ((int[]) objArr[1])[0] = i227 ^ (i227 << 5);
            Object[] objArr136 = {new int[]{i223}, new int[1], iArr7, strArr18};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
            char cAlpha = (char) (43042 - Color.alpha(i6));
            int fadingEdgeLength6 = 3111 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            int trimmedLength4 = TextUtils.getTrimmedLength(str5) + 22;
            Object[] objArr137 = new Object[1];
            b((short) ($$b | 194), $$a[54], (byte) 52, objArr137);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cAlpha, fadingEdgeLength6, trimmedLength4, -1272852037, false, (String) objArr137[0], null);
        }
        long j11 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).getLong(null);
        long jLongValue21 = ((Long) Class.forName(str8).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
            char c17 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43042);
            int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0) + 3111;
            int i228 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21;
            Object[] objArr138 = new Object[1];
            b((short) 151, $$a[54], (byte) 52, objArr138);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(c17, absoluteGravity3, i228, -1269618118, false, (String) objArr138[0], null);
        }
        if (j11 == ((jLongValue21 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                char threadPriority5 = (char) (43042 - ((Process.getThreadPriority(0) + 20) >> 6));
                int threadPriority6 = ((Process.getThreadPriority(0) + 20) >> 6) + 3111;
                int deadChar3 = 22 - KeyEvent.getDeadChar(0, 0);
                byte[] bArr27 = $$a;
                Object[] objArr139 = new Object[1];
                b((short) 99, bArr27[54], (byte) (-bArr27[2]), objArr139);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(threadPriority5, threadPriority6, deadChar3, 154975793, false, (String) objArr139[0], null);
            }
            Object[] objArr140 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).get(null);
            int i229 = ((int[]) objArr140[2])[0];
            int i230 = ((int[]) objArr140[1])[0];
            String[] strArr19 = (String[]) objArr140[3];
            int[] iArr8 = {i230};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i231 = ~elapsedCpuTime;
            int i232 = (((((~((-1019616956) | i231)) | (~(elapsedCpuTime | 685414503))) * 959) - 967539147) + (((~(elapsedCpuTime | (-1019616956))) | (~(i231 | 685414503))) * 959)) - 882033195;
            int i233 = (i232 << 13) ^ i232;
            int i234 = i233 ^ (i233 >>> 17);
            ((int[]) objArr10[0])[0] = i234 ^ (i234 << 5);
            objArr10 = new Object[]{new int[1], iArr8, new int[]{i229}, strArr19};
        } else {
            Object[] objArr141 = {null, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str11, Object.class).invoke(null, this)).intValue()), 0, -882033195};
            byte[] bArr28 = $$d;
            byte b7 = bArr28[207];
            Object[] objArr142 = new Object[1];
            c(b7, (short) (b7 | 439), (byte) 121, objArr142);
            Class<?> cls7 = Class.forName((String) objArr142[0]);
            Object[] objArr143 = new Object[1];
            c(bArr28[128], (short) 387, bArr28[132], objArr143);
            Object[] objArr144 = (Object[]) cls7.getMethod((String) objArr143[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr141);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault73 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf(str5, '0', 0) + 43043);
                int iMyPid4 = 3111 - (Process.myPid() >> 22);
                int iGreen2 = Color.green(0) + 22;
                byte[] bArr29 = $$a;
                Object[] objArr145 = new Object[1];
                b((short) 99, bArr29[54], (byte) (-bArr29[2]), objArr145);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.b(cLastIndexOf, iMyPid4, iGreen2, 154975793, false, (String) objArr145[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault73).set(null, objArr144);
            try {
                long jLongValue22 = ((Long) Class.forName(str8).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf21 = Long.valueOf(jLongValue22);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault74 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault74 == null) {
                    char c18 = (char) (43042 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int iIndexOf9 = TextUtils.indexOf(str5, str5, 0, 0) + 3111;
                    int i235 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23;
                    Object[] objArr146 = new Object[1];
                    b((short) 151, $$a[54], (byte) 52, objArr146);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault74 = initSession.b(c18, iIndexOf9, i235, -1269618118, false, (String) objArr146[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault74).set(null, lValueOf21);
                Long lValueOf22 = Long.valueOf(jLongValue22 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault75 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault75 == null) {
                    char deadChar4 = (char) (KeyEvent.getDeadChar(0, 0) + 43042);
                    int deadChar5 = KeyEvent.getDeadChar(0, 0) + 3111;
                    int i236 = 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    Object[] objArr147 = new Object[1];
                    b((short) ($$b | 194), $$a[54], (byte) 52, objArr147);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault75 = initSession.b(deadChar4, deadChar5, i236, -1272852037, false, (String) objArr147[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault75).set(null, lValueOf22);
                objArr10 = objArr144;
            } catch (Exception unused11) {
                throw new RuntimeException();
            }
        }
        int i237 = ((int[]) objArr10[1])[0];
        int i238 = ((int[]) objArr10[2])[0];
        if (i238 == i237) {
            int i239 = ((int[]) objArr10[0])[0];
            int i240 = ((int[]) objArr10[2])[0];
            int i241 = ((int[]) objArr10[1])[0];
            String[] strArr20 = (String[]) objArr10[3];
            int[] iArr9 = {i241};
            int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
            int i242 = ~startUptimeMillis2;
            int i243 = i239 + (((1206478406 + (((~((-1488559866) | i242)) | (~((-216471594) | startUptimeMillis2))) * (-370))) + ((((~(startUptimeMillis2 | (-1488559866))) | (~(i242 | (-216471594)))) | (-1560256250)) * (-370))) - 1769194836);
            int i244 = (i243 << 13) ^ i243;
            int i245 = i244 ^ (i244 >>> 17);
            ((int[]) objArr[0])[0] = i245 ^ (i245 << 5);
            Object[] objArr148 = {new int[1], iArr9, new int[]{i240}, strArr20};
        } else {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr21 = (String[]) objArr10[3];
            if (strArr21 != null) {
                for (String str22 : strArr21) {
                    arrayList8.add(str22);
                }
            }
            int[] iArr10 = new int[i238];
            int i246 = i238 - 1;
            iArr10[i246] = 1;
            Toast.makeText((Context) null, iArr10[((i238 * i246) % 2) - 1], 1).show();
            int i247 = ((int[]) objArr10[0])[0];
            int i248 = ((int[]) objArr10[2])[0];
            int i249 = ((int[]) objArr10[1])[0];
            String[] strArr22 = (String[]) objArr10[3];
            int[] iArr11 = {i248};
            int iIdentityHashCode13 = System.identityHashCode(this);
            int i250 = i247 + (-2008196346) + (((~(1369892190 | iIdentityHashCode13)) | 39391360) * (-140)) + ((~(1409283550 | iIdentityHashCode13)) * 70) + (((~(iIdentityHashCode13 | 335139268)) | 1113535642) * 70);
            int i251 = (i250 << 13) ^ i250;
            int i252 = i251 ^ (i251 >>> 17);
            ((int[]) objArr[0])[0] = i252 ^ (i252 << 5);
            Object[] objArr149 = {new int[1], new int[]{i249}, iArr11, strArr22};
        }
        return super.onCreate();
    }

    static {
        byte[] bArr = new byte[564];
        System.arraycopy("YkÜ\u0090\u0010\u0002Å:\u0001\u0017ñ\u0007\u000füË7\u0011ú\u0012\u0001þÿÎH\u0007üÅC\u0006ù\u0005\u000bÆ\"'\u0003ýñ\u0011\u0016üÞ5ó\r\n´O\u0003ê\"ó\u0011\tò\u0006\u0015´B\u0010\u0002Å:\u0001\u0017ñ\u0007\u000füË7\u0011ú\u0012\u0001þÿÎH\u0007üÅC\u0006ù\u0005\u000bÆ\u0017&\u0015ù\n\u0003Û5ó\r\n´)\t%\tù\u0001\u0007þ\u0002\u0017ù\n\u0003é\u001aÿ\u0005â)ý\u0011\u0004û\u000bÜ%\u0005ÿ\u0018û\f´4%ø\u000fù\n\u0003æ\u0015\u001cøü\r\nÖ0ó\n\nü\r\nò\u000b\tú\t\týæ)ü\nù\u0017õ\u0011Ã%ø\u000fù\n\u0003æ\u0015\u001cøü\r\nÖ0ó\n\nü\r\n\u0003\u0001ù\u0002\nü\u000f\u0001\t\u0002\u0001\tû\u0003\u0016÷\u0000\u0016Ú&ù\u0005\u000bü\u0005\u0005ÿ\u0018û\fÃ\u0010\u0002Å=\f\u0004ü\týÍ7\u0011ú\u0012\u0001þÿÎCø\u0017õ\u0011ûü\u000fÆIö\u0000\u0015õ\tÊ)\u0016\u0000\u0015õ\tÞ#\u0015¶\u0004%7\u0000õ\u0011\u0000÷\u000fë*ù\nø\u0001\u0013ùþí\u0019\u0010ù\u0006\u0001Ô+\u000fýø\u0013Æ\u001c*ù\u0006ß;ÿõ\u0012%ø\u000fù\n\u0003æ\u0015\u001cøü\r\nÖ0ó\n\nü\r\nò\u000b\tú\t\týæ)ü\nù\u0017õ\u0011Ã\"\u0015öö\u0017\u0000\u0016±A\u0010\u0002Å7\u0013\u0004\u0007÷\n\u0011ð\u0011À?\t\nõ\u0011\u0000÷\u000fÆ\u0017\t#ÐMÝõ\u000bÝ!\t\u001fÔLÞõ\u000b%ø\u000fù\n\u0003æ\u0015\u001cøü\r\nÖ0ó\n\nü\r\n\u0003\u0001ù\u0002\nü\u000f\u0001\t\u0002\u0001\tû\u0003\u0016÷\u0000\u0016Ú&ù\u0005\u000bü\u0005\u0005ÿ\u0018û\fÁù\u0010ù\u0006\u0001\b\u0017ñ\u0002\u0016\u0003õï&÷â\"\u0013\b\u0005\u0001÷Ð4\u0011ú\u0012\u0001þÿ\u0018ï\u0002\u0010ü\u0011ó\u0006\u0002\u0010ü\u0011óÕ;\t\nõ\u0011\u0000÷\u000fÛ\"\u0010ü\u0011óÕ\u0015\"\u0013\b\u0005\u0001÷ï\u001d\u000bù\u000b\u0001\tûï\u001d\u000bù\u000b\u0001\tûÃ4%ø\u000fù\n\u0003æ\u0015\u001cøü\r\nÖ0ó\n\nü\r\nò\u000b\tú\t\týæ)ü\nù\u0017õ\u0011Ã".getBytes("ISO-8859-1"), 0, bArr, 0, 564);
        $$d = bArr;
        $$e = ModuleDescriptor.MODULE_VERSION;
        $$a = new byte[]{83, ByteCompanionObject.MIN_VALUE, -37, -48, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24};
        $$b = 9;
        TuitionPaymentFragmentbindingInflater1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722380;
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
    private static java.lang.String $$g(byte r5, short r6, short r7) {
        /*
            int r5 = 120 - r5
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r1 = com.esafirm.imagepicker.helper.ImagePickerFileProvider.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            r3 = r1[r6]
        L24:
            int r6 = r6 + 1
            int r3 = -r3
            int r5 = r5 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esafirm.imagepicker.helper.ImagePickerFileProvider.$$g(byte, short, short):java.lang.String");
    }
}
