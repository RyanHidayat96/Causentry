package com.google.common.util.concurrent;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.MapMakerInternalMap;
import com.google.firebase.FirebaseError;
import defpackage.addAllCameraCaptureCallbacks;
import defpackage.getPrescribedStreamFormat;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.setCameraCaptureResult;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public class CycleDetectingLockFactory {

    static class TuitionPaymentFragmentbindingInflater1 {
    }

    public static final class PotentialDeadlockException extends ExampleStackTrace {
        private final ExampleStackTrace conflictingStackTrace;
        private static final byte[] $$c = {41, 2, 45, -60};
        private static final int $$f = 132;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {39, 27, 2, 54, 13, -1, -62, 53, 15, -5, 10, 2, -8, 11, -70, 67, 3, -12, 15, -13, 10, 7, -18, 20, -10, 7, 0, -63, 55, 6, -1, 3, 12, -18, 12, -8, -1, 18, -13, -53, 23, 34, 16, -18, 9, 4, -39, 38, -1, 3, 12, -18, 12, -40, 31, 18, -13, -34, 35, 18, -10, 14, -12, 12, 6, -84, 80, -2, -10, -1, 7, -7, 12, -71, 1, 70, 6, -1, -2, 6, -8, 0, -63, 83, -12, -3, 19, -41, 35, -10, 2, 8, -71, 65, 2, 2, -4, 21, -8, 9, -79, 16, 34, -11, 12, -10, 7, 0, -29, 18, 25, -11, -7, 10, 7, -45, 45, -16, 7, 7, -7, 10, 7, 0, -2, -10, -1, 7, -7, 12, -2, 6, -1, -2, 6, -8, 0, 19, -12, -3, 19, -41, 35, -10, 2, 8, -7, 2, 2, -4, 21, -8, 9, -64};
        private static final int $$e = 7;
        private static final byte[] $$a = {83, -90, 68, -23, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 47;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f816a = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {47208, 47259, 47205, 47255, 47258, 47200, 47195, 47254, 47222, 47248, 47253, 47204, 47260, 47174, 47261, 47206, 47262, 47257, 47223, 47176, 47251, 47221, 47201, 47252, 47263, 47202, 47169};
        private static int TuitionPaymentFragmentbindingInflater1 = 2047719433;
        private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        private static boolean b = true;

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r7, short r8, byte r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException.$$a
                int r8 = r8 * 15
                int r8 = r8 + 38
                int r9 = r9 * 52
                int r9 = r9 + 4
                int r7 = r7 * 4
                int r7 = r7 + 84
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r8
                r7 = r9
                r4 = r2
                goto L2f
            L17:
                r3 = r2
            L18:
                r6 = r9
                r9 = r7
                r7 = r6
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L2a
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2a:
                r3 = r0[r7]
                r6 = r9
                r9 = r7
                r7 = r6
            L2f:
                int r9 = r9 + 1
                int r3 = -r3
                int r7 = r7 + r3
                int r7 = r7 + (-11)
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException.c(short, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(byte r7, short r8, int r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 46
                int r7 = r7 + 53
                int r8 = r8 + 4
                byte[] r0 = com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException.$$d
                int r9 = r9 * 15
                int r9 = r9 + 84
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L2e
            L14:
                r3 = r2
                r6 = r9
                r9 = r8
                r8 = r6
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                int r9 = r9 + 1
                r1[r3] = r5
                if (r4 != r7) goto L29
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L29:
                r3 = r0[r9]
                r6 = r3
                r3 = r9
                r9 = r6
            L2e:
                int r8 = r8 + r9
                int r8 = r8 + (-1)
                r9 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException.e(byte, short, int, java.lang.Object[]):void");
        }

        private static void d(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
            char[] cArr2;
            int i2 = 2 % 2;
            getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
            char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                for (int i3 = 0; i3 < length; i3++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31339), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2994, 17 - Color.red(0), 1182129903, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        cArr4[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr4;
            }
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - TextUtils.getOffsetBefore("", 0)), 253 - TextUtils.indexOf("", "", 0, 0), 22 - View.MeasureSpec.getSize(0), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            char c = '0';
            int i4 = 33602;
            if (b) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i5 = $10 + 103;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (i4 - View.combineMeasuredStates(0, 0)), 3084 - TextUtils.indexOf("", c, 0), (ViewConfiguration.getTouchSlop() >> 8) + 26, -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    c = '0';
                    i4 = 33602;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (!TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                    int i7 = $11 + 35;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i9 = $11 + 77;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            } else {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            }
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.red(0) + 33602), 3084 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), Color.green(0) + 26, -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2);
        }

        @Override // java.lang.Throwable
        public final String getMessage() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
            f816a = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            int i4 = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2267;
                int packedPositionChild = 32 - ExpandableListView.getPackedPositionChild(0L);
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr2 = new Object[1];
                c(b2, bArr[5], b2, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, doubleTapTimeout, packedPositionChild, -887667012, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            d(null, null, 127 - Color.alpha(0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d(null, null, (ViewConfiguration.getEdgeSlop() >> 16) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char trimmedLength = (char) TextUtils.getTrimmedLength("");
                int i5 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2266;
                int iResolveSize = 33 - View.resolveSize(0, 0);
                byte[] bArr2 = $$a;
                byte b3 = bArr2[7];
                byte b4 = bArr2[5];
                Object[] objArr5 = new Object[1];
                c(b3, b4, b4, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(trimmedLength, i5, iResolveSize, -874156483, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int mirror = AndroidCharacter.getMirror('0') + 2219;
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 33;
                    byte[] bArr3 = $$a;
                    byte b5 = bArr3[7];
                    Object[] objArr6 = new Object[1];
                    c(b5, b5, bArr3[40], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, mirror, iResolveOpacity, -654680577, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i6 = ((int[]) objArr7[0])[0];
                int i7 = ((int[]) objArr7[3])[0];
                String[] strArr = (String[]) objArr7[1];
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i8 = (-138498867) + (((~(iFreeMemory | 593014332)) | 215698983) * 191) + (((~((~iFreeMemory) | 593014332)) | 209928195) * 191) + 258030419;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                d(null, null, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                d(null, null, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                d(null, null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0), new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                d(null, null, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                f816a = i11 % 128;
                int i12 = i11 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 258030419};
                    byte[] bArr4 = $$d;
                    byte b6 = bArr4[74];
                    Object[] objArr13 = new Object[1];
                    e(b6, bArr4[5], b6, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b7 = bArr4[26];
                    byte b8 = b7;
                    Object[] objArr14 = new Object[1];
                    e(b8, (byte) (b8 | 97), b7, objArr14);
                    objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
                        f816a = i13 % 128;
                        int i14 = i13 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                            int tapTimeout = 2267 - (ViewConfiguration.getTapTimeout() >> 16);
                            int i15 = 33 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            byte[] bArr5 = $$a;
                            byte b9 = bArr5[7];
                            Object[] objArr15 = new Object[1];
                            c(b9, b9, bArr5[40], objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, tapTimeout, i15, -654680577, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr16 = new Object[1];
                            d(null, null, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr16);
                            Class<?> cls5 = Class.forName((String) objArr16[0]);
                            Object[] objArr17 = new Object[1];
                            d(null, null, 127 - KeyEvent.normalizeMetaState(0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr17);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int offsetBefore = 2267 - TextUtils.getOffsetBefore("", 0);
                                int iMyPid = (Process.myPid() >> 22) + 33;
                                byte[] bArr6 = $$a;
                                byte b10 = bArr6[7];
                                byte b11 = bArr6[5];
                                Object[] objArr18 = new Object[1];
                                c(b10, b11, b11, objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, offsetBefore, iMyPid, -874156483, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2268;
                                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 33;
                                byte[] bArr7 = $$a;
                                byte b12 = bArr7[7];
                                Object[] objArr19 = new Object[1];
                                c(b12, bArr7[5], b12, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarSize, iLastIndexOf, iNormalizeMetaState, -887667012, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i16 = ((int[]) objArr[3])[0];
            int i17 = ((int[]) objArr[0])[0];
            if (i17 != i16) {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr[1];
                if (strArr2 != null) {
                    while (i4 < strArr2.length) {
                        int i18 = f816a + 109;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                        if (i18 % 2 != 0) {
                            arrayList.add(strArr2[i4]);
                            i4 += 9;
                        } else {
                            arrayList.add(strArr2[i4]);
                            i4++;
                        }
                    }
                }
                throw new RuntimeException(String.valueOf(i17));
            }
            Object[] objArr20 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i19 = ((int[]) objArr[2])[0];
            int i20 = ((int[]) objArr[0])[0];
            int i21 = ((int[]) objArr[3])[0];
            String[] strArr3 = (String[]) objArr[1];
            int iNextInt = new Random().nextInt(1936593607);
            int i22 = ~iNextInt;
            int i23 = (~((-484082806) | i22)) | 209879057;
            int i24 = ~(iNextInt | (-50426763));
            int i25 = i19 + (-1465917342) + ((i23 | i24) * (-713)) + (i24 * 1426) + ((~((-324630511) | i22)) * 713);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr20[2])[0] = i27 ^ (i27 << 5);
            StringBuilder sb = new StringBuilder((String) Objects.requireNonNull(super.getMessage()));
            Throwable cause2 = this.conflictingStackTrace;
            int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
            f816a = i28 % 128;
            char c2 = 2;
            int i29 = i28 % 2;
            while (cause2 != null) {
                int i30 = ((int[]) objArr20[c2])[0];
                int i31 = i30 * i30;
                int i32 = -(1113758016 * i30);
                int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
                int i34 = -(i30 * 714570516);
                int i35 = (i33 & i34) + (i34 | i33);
                int i36 = ((i35 | (-1519694108)) << 1) - ((-1519694108) ^ i35);
                int i37 = i36 >> 24;
                int i38 = (((i37 & (-511)) + (i37 | (-511))) / 256) + 1;
                int i39 = (i36 ^ i38) + ((i38 & i36) << 1);
                int i40 = i36 >> 20;
                int i41 = (((i40 | (-8191)) << 1) - (i40 ^ (-8191))) / 4096;
                int i42 = -(i39 ^ (((i41 | 1) << 1) - (i41 ^ 1)));
                int i43 = ((i42 | 5) << 1) - (i42 ^ 5);
                int i44 = i43 >> 28;
                sb.append("3|, ".substring(FirebaseError.ERROR_NETWORK_REQUEST_FAILED / ((i43 & (-((((i44 ^ (-31)) + ((i44 & (-31)) << 1)) / 16) + 2))) * 1702)));
                sb.append(cause2.getMessage());
                cause2 = cause2.getCause();
                c2 = 2;
            }
            return sb.toString();
        }

        private static String $$g(int i, byte b2, int i2) {
            int i3 = i * 2;
            int i4 = b2 + 67;
            int i5 = 4 - (i2 * 3);
            byte[] bArr = $$c;
            byte[] bArr2 = new byte[1 - i3];
            int i6 = 0 - i3;
            int i7 = -1;
            if (bArr == null) {
                i4 = (-i4) + i6;
                i5++;
                i7 = -1;
            }
            while (true) {
                int i8 = i7 + 1;
                bArr2[i8] = (byte) i4;
                if (i8 == i6) {
                    return new String(bArr2, 0);
                }
                i4 = (-bArr[i5]) + i4;
                i5++;
                i7 = i8;
            }
        }
    }

    static {
        new setCameraCaptureResult().b(MapMakerInternalMap.Strength.WEAK).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        new getPrescribedStreamFormat(CycleDetectingLockFactory.class);
        new ThreadLocal<ArrayList<TuitionPaymentFragmentbindingInflater1>>() { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.1
            @Override // java.lang.ThreadLocal
            protected final /* synthetic */ ArrayList<TuitionPaymentFragmentbindingInflater1> initialValue() {
                addAllCameraCaptureCallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault3(3, "initialArraySize");
                return new ArrayList<>(3);
            }
        };
    }

    static class ExampleStackTrace extends IllegalStateException {
        static {
            ImmutableSet.TuitionPaymentFragmentbindingInflater1(CycleDetectingLockFactory.class.getName(), ExampleStackTrace.class.getName(), TuitionPaymentFragmentbindingInflater1.class.getName());
        }
    }
}
