package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
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
import androidx.exifinterface.media.ExifInterface;
import com.bpjstku.R;
import com.google.android.gms.internal.auth.zzgx;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zznt;
import defpackage.CameraUseCaseAdapter;
import defpackage.EncoderImplByteBufferInput;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class AppMeasurementJobService extends JobService implements zznp {
    private zznt zza;
    private static final byte[] $$c = {31, -3, -46, 11};
    private static final int $$f = 150;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {12, 11, -9, -106, 15, 1, -60, 60, 11, 3, -5, 8, -4, -52, 54, 16, -7, 17, 0, -3, -2, -51, 60, 9, 9, -66, 56, 15, 1, 3, 5, 2, -61, 54, 18, -4, -56, 22, 50, -4, -66, 34, 44, 0, -1, 12, 9, -38, 29, 23, 1, -6, 1, 3, 1, 16, -46, 39, -18, 37, -10, 1, 1, 18, 7, 4, 0, -10, -62, 51, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, 2, 0, -8, 1, 9, -5, 14, 0, 8, 1, 0, 8, -6, 2, 21, -10, -1, 21, -39, 37, -8, 4, 10, -5, 4, 4, -2, 23, -6, 11, -63, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, 2, 0, -8, 1, 9, -5, 14, 0, 8, 1, 0, 8, -6, 2, 21, -10, -1, 21, -39, 37, -8, 4, 10, -5, 4, 4, -2, 23, -6, 11, -63, 1, 18, -31, 32, 3, 8, -36, 27, 12, 10, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, 2, 0, -8, 1, 9, -5, 14, 0, 8, 1, 0, 8, -6, 2, 21, -10, -1, 21, -39, 37, -8, 4, 10, -5, 4, 4, -2, 23, -6, 11, -64, 15, 1, -60, 55, 17, -3, 12, 4, -6, 13, -68, 69, 5, -10, 17, -11, 12, 9, -16, 22, -8, 9, 2, -61, 69, 5, 0, 1, 5, -62, 25, 36, 18, -16, 11, 6, -25, 37, 0, 1, 5, -43, 37, 20, -8, 16, -10, 14, 8, -82, 82, 0, -8, 1, 9, -5, 14, -69, 3, 72, 8, 1, 0, 8, -6, 2, -61, 72, 8, -1, -2, 1, 20, -77, 67, 4, 4, -2, 23, -6, 11, -77, 16, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, -15, 10, 8, -7, 8, 8, -4, -27, 40, -5, 9, -8, 22, -12, 16, -62, 15, 1, -60, 55, 17, -3, 12, 4, -6, 13, -68, 57, 0, 22, -16, -48, 57, 4, 20, -10, -3, 5, 0, 10, 8, -7, 8, 8, -4, -54, 25, 36, 20, -10, -3, 5, -32, 42, 8, -7, 8, 8, -4, -32, 32, 22, -16, -11, 36, -2, 6, -10, -62, 3, 36, 54, -1, -12, 16, -1, -10, 14, -22, 41, -8, 9, -9, 0, 18, -8, -3, -20, 24, 15, -8, 5, 0, -44, 1, 18, -36, 23, 26, -52, 57, -18, -13, 22, 5, 5, 9, 2, -40, 47, 9, -4, 9, 8, 11, -18, 14, 0, -2, 0, 22, -12, -30, 49, -14, 25, -19, 4, 13, -4};
    private static final int $$e = 214;
    private static final byte[] $$a = {25, 5, -88, -44, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
    private static final int $$b = 4;
    private static int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f782a = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {47470, 47479, 47458, 47402, 47468, 47466, 47473, 47429, 47519, 47461, 47460, 47475, 47467, 47471, 47476, 47440, 47472, 47445, 47465, 47462, 47477, 47469, 47464, 47430, 47447, 47428, 47459, 47398, 47474, 47478, 47394, 47455, 47395, 47393, 47399, 47397, 47396, 47392, 47400};
    private static int TuitionPaymentFragmentbindingInflater1 = 2047719704;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 103 - r6
            int r8 = 206 - r8
            int r7 = r7 + 1
            byte[] r0 = com.google.android.gms.measurement.AppMeasurementJobService.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r7
            r5 = r2
            goto L24
        L10:
            r3 = r2
        L11:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r3 = r0[r8]
        L24:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurementJobService.d(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = 84 - r7
            int r6 = r6 + 84
            int r8 = r8 + 4
            byte[] r1 = com.google.android.gms.measurement.AppMeasurementJobService.$$d
            byte[] r0 = new byte[r0]
            int r7 = 83 - r7
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r8 = r8 + r4
            int r8 = r8 + (-3)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurementJobService.e(int, short, short, java.lang.Object[]):void");
    }

    private final zznt zzd() {
        int i = 2 % 2;
        int i2 = f782a + 19;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (this.zza == null) {
            this.zza = new zznt(this);
            int i4 = b + 5;
            f782a = i4 % 128;
            int i5 = i4 % 2;
        }
        return this.zza;
    }

    private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        char c = '0';
        int i3 = 0;
        if (cArr2 != null) {
            int i4 = $10 + 67;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i6]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31338 - TextUtils.lastIndexOf("", c, i3)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2994, (KeyEvent.getMaxKeyCode() >> 16) + 17, 1182129903, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    c = '0';
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), AndroidCharacter.getMirror('0') + 205, (ViewConfiguration.getFadingEdgeLength() >> 16) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i7 = 33602;
        int i8 = 1687675375;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i9 = $11 + 23;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf("", "") + i7), TextUtils.indexOf((CharSequence) "", '0', 0) + 3086, MotionEvent.axisFromString("") + 27, -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i7 = 33602;
                i8 = 1687675375;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        int i11 = 0;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                try {
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 33602), TextUtils.getOffsetAfter("", 0) + 3085, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25, -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11;
            if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i12 = $10 + 65;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            i11 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        }
    }

    @Override // android.app.Service
    public final void onCreate() throws Throwable {
        String str;
        Object[] objArr;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        Object[] objArr2;
        String str6;
        Object[] objArr3;
        String str7;
        String str8;
        Object[] objArr4;
        Object[] objArr5;
        String str9;
        Object[] objArr6;
        Object[] objArr7;
        String str10;
        int i2;
        Object[] objArr8;
        char c;
        int i3;
        String str11;
        String str12;
        Object[] objArr9;
        String str13;
        String str14;
        Object[] objArr10;
        int i4;
        Object[] objArr11;
        int i5 = 2 % 2;
        String str15 = "android.app.ActivityThread";
        String str16 = "currentApplication";
        Object[] objArr12 = new Object[1];
        c(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_instruction_step4).substring(0, 1).length() + 126, new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr12);
        String str17 = (String) objArr12[0];
        Object[] objArr13 = new Object[1];
        c(null, null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr13);
        String str18 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        c(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 116, new byte[]{-115, -116, -117, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr14);
        String str19 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        c(null, null, 127 - TextUtils.getOffsetAfter("", 0), new byte[]{-116, -113, -109, -110, -111, -118, -126, -112, -119, -117, -114, -117, -122, -116, -113, -114}, objArr15);
        String str20 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        c(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, new byte[]{-113, -126, -116, -108, -111, -102, -119, -117, -114, -125, -114, -117, -107, -103, -124, -105, -105, -126, -124, -113, -114, -109, -108, -113, -122, -126}, objArr16);
        String str21 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        c(null, null, 127 - (ViewConfiguration.getTouchSlop() >> 8), new byte[]{-122, -109, -114, -117, -126, -107, -114, -123, -105, -105, -103, -117, -122, -116, -108, -108, -101, -107}, objArr17);
        String str22 = (String) objArr17[0];
        int i6 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i7 = ~((int) Runtime.getRuntime().totalMemory());
        if (i6 != (-1798659613) + (((~(1257399961 | i7)) | (-427412419)) * (-983)) + (((~(i7 | (-427412419))) | 141574784) * 983)) {
            int[] iArr = new int[2029687314];
            iArr[2029687313] = 1;
            int i8 = 92665650 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i9 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i10 = ~iIdentityHashCode;
        int i11 = 176424844 + (((~((-1635104328) | i10)) | 541165061 | (~((-943951638) | i10)) | (~(2037890903 | iIdentityHashCode))) * (-84));
        int i12 = (~((-1635104328) | iIdentityHashCode)) | 943951637;
        int i13 = ~(1635104327 | i10);
        if (i9 != i11 + ((i12 | i13) * (-84)) + (((-2037890904) | i13) * 84)) {
            int i14 = 1409997716 % 2;
            throw new ArithmeticException();
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29944);
            str = "";
            int iIndexOf = TextUtils.indexOf(str, str, 0, 0) + 1755;
            int scrollDefaultDelay = 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            Object[] objArr18 = new Object[1];
            d($$a[10], (byte) ($$b | 33), (short) 203, objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, iIndexOf, scrollDefaultDelay, 986134021, false, (String) objArr18[0], null);
        } else {
            str = "";
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i15 = b + 59;
            f782a = i15 % 128;
            int i16 = i15 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c2 = (char) (29944 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int mode = View.MeasureSpec.getMode(0) + 1755;
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 23;
                byte b2 = $$a[10];
                int i17 = $$b;
                Object[] objArr19 = new Object[1];
                d(b2, (byte) (i17 | 48), (short) (i17 | 162), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, mode, longPressTimeout, 1599039318, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr20[0])[0]}, new int[]{((int[]) objArr20[1])[0]}, (Object[]) objArr20[2], new int[1], (String[]) objArr20[4]};
            int iMyUid = Process.myUid();
            int i18 = (((((~(iMyUid | 289304286)) | (-76701861)) * 56) + 1258875585) + (((~((~iMyUid) | (-76701861))) | 289304286) * 56)) - 1687368039;
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr[3])[0] = i20 ^ (i20 << 5);
            str = str;
            str20 = str20;
        } else {
            int iIntValue = ((Integer) Class.forName(str19).getMethod(str20, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr21 = {1109816201};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), TextUtils.getOffsetAfter(str, 0) + 1726, 28 - TextUtils.lastIndexOf(str, '0', 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = EncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr21), -1687368039, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29943);
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1756;
                    int maximumFlingVelocity = 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte b3 = $$a[10];
                    int i21 = $$b;
                    Object[] objArr22 = new Object[1];
                    d(b3, (byte) (i21 | 48), (short) (i21 | 162), objArr22);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, bitsPerPixel, maximumFlingVelocity, 1599039318, false, (String) objArr22[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    long jLongValue = ((Long) Class.forName(str17).getDeclaredMethod(str18, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char maximumFlingVelocity2 = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29944);
                        int iIndexOf2 = 1754 - TextUtils.indexOf((CharSequence) str, '0', 0);
                        int i22 = 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        Object[] objArr23 = new Object[1];
                        d($$a[10], (byte) ($$b | 48), (short) 114, objArr23);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity2, iIndexOf2, i22, 1596667560, false, (String) objArr23[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29944);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1755;
                        int i23 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                        Object[] objArr24 = new Object[1];
                        d($$a[10], (byte) ($$b | 33), (short) 203, objArr24);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(edgeSlop, jumpTapTimeout, i23, 986134021, false, (String) objArr24[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
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
        int i24 = ((int[]) objArr[1])[0];
        int i25 = ((int[]) objArr[0])[0];
        if (i25 == i24) {
            int i26 = ((int[]) objArr[3])[0];
            Object[] objArr25 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int i27 = ~Process.myPid();
            int i28 = i26 + 694751905 + ((~((-554402838) | i27)) * (-783)) + (((~(i27 | (-621774558))) | (-834376984)) * 783);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr25[3])[0] = i30 ^ (i30 << 5);
            i = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str23 : strArr) {
                    arrayList.add(str23);
                }
            }
            int[] iArr2 = new int[i25];
            int i31 = i25 - 1;
            iArr2[i31] = 1;
            Toast.makeText((Context) null, iArr2[((i25 * i31) % 2) - 1], 1).show();
            int i32 = ((int[]) objArr[3])[0];
            Object[] objArr26 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int i33 = ~((~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode) | 259940872);
            int i34 = i32 + ((38945288 | i33) * (-374)) + 845268457 + ((i33 | 220995584) * 374);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            i = 0;
            ((int[]) objArr26[3])[0] = i36 ^ (i36 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int i37 = 876 - (TypedValue.complexToFloat(i) > 0.0f ? 1 : (TypedValue.complexToFloat(i) == 0.0f ? 0 : -1));
            int deadChar = KeyEvent.getDeadChar(i, i) + 10;
            Object[] objArr27 = new Object[1];
            d($$a[10], (byte) ($$b | 33), (short) 203, objArr27);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(keyRepeatDelay, i37, deadChar, -1650998592, false, (String) objArr27[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        long jLongValue2 = ((Long) Class.forName(str17).getDeclaredMethod(str18, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c4 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 876;
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 10;
            byte b4 = $$a[10];
            int i38 = $$b;
            Object[] objArr28 = new Object[1];
            d(b4, (byte) (i38 | 48), (short) (i38 | 162), objArr28);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c4, absoluteGravity, packedPositionType, 2012020043, false, (String) objArr28[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char defaultSize = (char) View.getDefaultSize(0, 0);
                int i39 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                int i40 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9;
                byte b5 = $$a[10];
                byte b6 = (byte) ($$b | 48);
                Object[] objArr29 = new Object[1];
                d(b5, b6, (short) (b6 | 10), objArr29);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(defaultSize, i39, i40, 2012931276, false, (String) objArr29[0], null);
            }
            Object[] objArr30 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr30[0])[0]}, new int[1], new int[]{((int[]) objArr30[2])[0]}, (String[]) objArr30[3]};
            int i41 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1762499354);
            int i42 = (((((~((-929897854) | i41)) | 40441941) * (-241)) + 1995709431) + (((~(i41 | (-889455913))) | (-930029566)) * 241)) - 1331284550;
            int i43 = (i42 << 13) ^ i42;
            int i44 = i43 ^ (i43 >>> 17);
            ((int[]) objArr2[1])[0] = i44 ^ (i44 << 5);
            str15 = "android.app.ActivityThread";
            str16 = "currentApplication";
            str3 = str20;
            str4 = str18;
            str2 = str22;
            str5 = str;
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                baseContext = (Context) Class.forName(str21).getMethod(str2, new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                str2 = str22;
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    str2 = str22;
                    baseContext = null;
                } else {
                    str2 = str22;
                    str2 = str22;
                    baseContext = baseContext.getApplicationContext();
                }
            }
            str2 = str22;
            str2 = str22;
            str3 = str20;
            int iIntValue2 = ((Integer) Class.forName(str19).getMethod(str3, Object.class).invoke(null, this)).intValue();
            int i45 = f782a + 13;
            b = i45 % 128;
            int i46 = i45 % 2;
            try {
                Object[] objArr31 = {baseContext, Integer.valueOf(iIntValue2), 0, -1331284550};
                byte[] bArr = $$d;
                Object[] objArr32 = new Object[1];
                e(bArr[4], bArr[59], bArr[44], objArr32);
                Class<?> cls = Class.forName((String) objArr32[0]);
                Object[] objArr33 = new Object[1];
                e(bArr[72], (byte) (bArr[286] + 1), (short) (bArr[42] + 1), objArr33);
                Object[] objArr34 = (Object[]) cls.getMethod((String) objArr33[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr31);
                if (baseContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        int size = 876 - View.MeasureSpec.getSize(0);
                        int maxKeyCode = 10 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte b7 = $$a[10];
                        byte b8 = (byte) ($$b | 48);
                        Object[] objArr35 = new Object[1];
                        d(b7, b8, (short) (b8 | 10), objArr35);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cResolveSizeAndState, size, maxKeyCode, 2012931276, false, (String) objArr35[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArr34);
                    try {
                        str4 = str18;
                        long jLongValue3 = ((Long) Class.forName(str17).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf3 = Long.valueOf(jLongValue3);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                            int iAxisFromString = MotionEvent.axisFromString(str) + 877;
                            int i47 = 10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            byte b9 = $$a[10];
                            int i48 = $$b;
                            Object[] objArr36 = new Object[1];
                            d(b9, (byte) (i48 | 48), (short) (i48 | 162), objArr36);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(pressedStateDuration, iAxisFromString, i47, 2012020043, false, (String) objArr36[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf3);
                        Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        str5 = str;
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                            char offsetAfter = (char) TextUtils.getOffsetAfter(str5, 0);
                            int scrollBarSize = 876 - (ViewConfiguration.getScrollBarSize() >> 8);
                            int iIndexOf3 = TextUtils.indexOf(str5, str5) + 10;
                            Object[] objArr37 = new Object[1];
                            d($$a[10], (byte) ($$b | 33), (short) 203, objArr37);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(offsetAfter, scrollBarSize, iIndexOf3, -1650998592, false, (String) objArr37[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf4);
                    } catch (Exception unused2) {
                        throw new RuntimeException();
                    }
                } else {
                    str15 = "android.app.ActivityThread";
                    str16 = "currentApplication";
                    objArr34 = objArr34;
                    str4 = str18;
                    str5 = str;
                }
                objArr2 = objArr34;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (((int[]) objArr2[0])[0] != ((int[]) objArr2[2])[0]) {
            throw null;
        }
        int i49 = b + 53;
        f782a = i49 % 128;
        int i50 = i49 % 2;
        int i51 = ((int[]) objArr2[1])[0];
        Object[] objArr38 = {new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i52 = ~iIdentityHashCode2;
        int i53 = i51 + 680648614 + (((~((-700768628) | i52)) | 660458398) * (-865)) + ((~(iIdentityHashCode2 | 700768627)) * 865) + (((~(660458398 | i52)) | (~(i52 | 700768627))) * 865);
        int i54 = i53 ^ (i53 << 13);
        int i55 = i54 ^ (i54 >>> 17);
        ((int[]) objArr38[1])[0] = i55 ^ (i55 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
            char trimmedLength = (char) TextUtils.getTrimmedLength(str5);
            int iIndexOf4 = 876 - TextUtils.indexOf(str5, str5, 0);
            int i56 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11;
            byte[] bArr2 = $$a;
            Object[] objArr39 = new Object[1];
            d(bArr2[1], bArr2[7], (short) (-bArr2[9]), objArr39);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(trimmedLength, iIndexOf4, i56, 252381699, false, (String) objArr39[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).getLong(null);
        long jLongValue4 = ((Long) Class.forName(str17).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int pressedStateDuration2 = 876 - (ViewConfiguration.getPressedStateDuration() >> 16);
            int iKeyCodeFromString = KeyEvent.keyCodeFromString(str5) + 10;
            Object[] objArr40 = new Object[1];
            d($$a[10], (byte) ($$b | 48), (short) 114, objArr40);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(tapTimeout, pressedStateDuration2, iKeyCodeFromString, 2009631821, false, (String) objArr40[0], null);
        }
        if (j2 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int i57 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 875;
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10;
                byte[] bArr3 = $$a;
                byte b10 = bArr3[7];
                Object[] objArr41 = new Object[1];
                d(b10, b10, (short) (-bArr3[9]), objArr41);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(scrollDefaultDelay2, i57, doubleTapTimeout, 256017550, false, (String) objArr41[0], null);
            }
            Object[] objArr42 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).get(null);
            objArr3 = new Object[]{new int[]{((int[]) objArr42[0])[0]}, new int[1], new int[]{((int[]) objArr42[2])[0]}, (String[]) objArr42[3]};
            int i58 = ~Process.myUid();
            int i59 = 1909159534 + (((~((-1017791604) | i58)) | 977481374) * (-933)) + (((~(i58 | 977481374)) | (-1055616768)) * 933) + 2033853351;
            int i60 = (i59 << 13) ^ i59;
            int i61 = i60 ^ (i60 >>> 17);
            ((int[]) objArr3[1])[0] = i61 ^ (i61 << 5);
            str6 = str4;
        } else {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                baseContext2 = (Context) Class.forName(str21).getMethod(str2, new Class[0]).invoke(null, null);
            }
            if (baseContext2 != null) {
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            Object[] objArr43 = {baseContext2, Integer.valueOf(((Integer) Class.forName(str19).getMethod(str3, Object.class).invoke(null, this)).intValue()), 1102713707};
            byte[] bArr4 = $$d;
            Object[] objArr44 = new Object[1];
            e(bArr4[177], bArr4[1], (short) (bArr4[42] + 1), objArr44);
            Class<?> cls2 = Class.forName((String) objArr44[0]);
            Object[] objArr45 = new Object[1];
            e(bArr4[18], (byte) (-bArr4[176]), (short) 117, objArr45);
            Object[] objArr46 = (Object[]) cls2.getMethod((String) objArr45[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr43);
            if (baseContext2 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                    char c5 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int jumpTapTimeout2 = 876 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int iRed = 10 - Color.red(0);
                    byte[] bArr5 = $$a;
                    byte b11 = bArr5[7];
                    Object[] objArr47 = new Object[1];
                    d(b11, b11, (short) (-bArr5[9]), objArr47);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(c5, jumpTapTimeout2, iRed, 256017550, false, (String) objArr47[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, objArr46);
                try {
                    str6 = str4;
                    long jLongValue5 = ((Long) Class.forName(str17).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue5);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                        char c6 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iResolveSizeAndState = 876 - View.resolveSizeAndState(0, 0, 0);
                        int i62 = 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        Object[] objArr48 = new Object[1];
                        d($$a[10], (byte) ($$b | 48), (short) 114, objArr48);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(c6, iResolveSizeAndState, i62, 2009631821, false, (String) objArr48[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue5 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                        char c7 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int maximumFlingVelocity3 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 876;
                        int i63 = 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        byte[] bArr6 = $$a;
                        Object[] objArr49 = new Object[1];
                        d(bArr6[1], bArr6[7], (short) (-bArr6[9]), objArr49);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(c7, maximumFlingVelocity3, i63, 252381699, false, (String) objArr49[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).set(null, lValueOf6);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            } else {
                str6 = str4;
                objArr46 = objArr46;
            }
            objArr3 = objArr46;
        }
        int i64 = ((int[]) objArr3[2])[0];
        int i65 = ((int[]) objArr3[0])[0];
        if (i65 == i64) {
            int i66 = ((int[]) objArr3[1])[0];
            Object[] objArr50 = {new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
            str7 = str16;
            int i67 = ~(((Context) Class.forName(str15).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.status_message_not_enabled).substring(17, 18).codePointAt(0) - 1791951068);
            int i68 = i66 + (-952171026) + (((~(128096116 | i67)) | (-168406346)) * (-983)) + (((~(i67 | (-168406346))) | 33588544) * 983);
            int i69 = (i68 << 13) ^ i68;
            int i70 = i69 ^ (i69 >>> 17);
            ((int[]) objArr50[1])[0] = i70 ^ (i70 << 5);
        } else {
            str7 = str16;
            Toast.makeText((Context) null, i65 / (((i65 - 1) * i65) % 2), 0).show();
            int i71 = ((int[]) objArr3[1])[0];
            Object[] objArr51 = {new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
            int iCodePointAt = ((Context) Class.forName(str15).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_instruction_text).substring(0, 32).codePointAt(7) + 563663977;
            int i72 = ~iCodePointAt;
            int i73 = i71 + 480944198 + (((~(941663570 | i72)) | (~((-981973800) | iCodePointAt))) * 210) + (((~(i72 | (-939565315))) | (~(iCodePointAt | 984072055))) * 210);
            int i74 = i73 ^ (i73 << 13);
            int i75 = i74 ^ (i74 >>> 17);
            ((int[]) objArr51[1])[0] = i75 ^ (i75 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
            char fadingEdgeLength = (char) (31533 - (ViewConfiguration.getFadingEdgeLength() >> 16));
            int edgeSlop2 = 921 - (ViewConfiguration.getEdgeSlop() >> 16);
            int i76 = 29 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            byte[] bArr7 = $$a;
            Object[] objArr52 = new Object[1];
            d(bArr7[1], bArr7[7], (short) (-bArr7[9]), objArr52);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(fadingEdgeLength, edgeSlop2, i76, -1048449946, false, (String) objArr52[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char size2 = (char) (31533 - View.MeasureSpec.getSize(0));
                str8 = str5;
                int iLastIndexOf = 920 - TextUtils.lastIndexOf(str8, '0', 0, 0);
                int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 28;
                Object[] objArr53 = new Object[1];
                d($$a[10], (byte) ($$b | 33), (short) 203, objArr53);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(size2, iLastIndexOf, tapTimeout2, -1142834547, false, (String) objArr53[0], null);
            } else {
                str8 = str5;
            }
            Object[] objArr54 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).get(null);
            objArr4 = new Object[]{new int[1], new int[]{((int[]) objArr54[1])[0]}, (Object[]) objArr54[2], new int[]{((int[]) objArr54[3])[0]}, (String[]) objArr54[4]};
            int i77 = ((Context) Class.forName(str15).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 129324924;
            int i78 = ~i77;
            int i79 = (((1298166731 + ((i77 | 827693597) * 140)) + (((~(827693597 | i78)) | 136848482) * (-280))) + (((~(i77 | (-136848483))) | ((~(946386046 | i78)) | 18156033)) * 140)) - 628301688;
            int i80 = (i79 << 13) ^ i79;
            int i81 = i80 ^ (i80 >>> 17);
            ((int[]) objArr4[0])[0] = i81 ^ (i81 << 5);
            str21 = str21;
            str2 = str2;
        } else {
            str8 = str5;
            Context baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                baseContext3 = (Context) Class.forName(str21).getMethod(str2, new Class[0]).invoke(null, null);
            }
            if (baseContext3 != null) {
                int i82 = f782a + 103;
                b = i82 % 128;
                int i83 = i82 % 2;
                baseContext3 = ((baseContext3 instanceof ContextWrapper) && ((ContextWrapper) baseContext3).getBaseContext() == null) ? null : baseContext3.getApplicationContext();
            }
            Object[] objArr55 = {baseContext3, Integer.valueOf(((Integer) Class.forName(str19).getMethod(str3, Object.class).invoke(null, this)).intValue()), 0, -628301688};
            byte[] bArr8 = $$d;
            Object[] objArr56 = new Object[1];
            e((byte) (-bArr8[466]), (byte) (bArr8[295] + 1), (short) 169, objArr56);
            Class<?> cls3 = Class.forName((String) objArr56[0]);
            Object[] objArr57 = new Object[1];
            e(bArr8[18], (byte) (-bArr8[176]), (short) 179, objArr57);
            Object[] objArr58 = (Object[]) cls3.getMethod((String) objArr57[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr55);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf(str8, '0', 0));
                int size3 = View.MeasureSpec.getSize(0) + 921;
                int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 28;
                Object[] objArr59 = new Object[1];
                d($$a[10], (byte) ($$b | 33), (short) 203, objArr59);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(cLastIndexOf, size3, tapTimeout3, -1142834547, false, (String) objArr59[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, objArr58);
            try {
                long jLongValue6 = ((Long) Class.forName(str17).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf7 = Long.valueOf(jLongValue6);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                    char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31533);
                    int tapTimeout4 = 921 - (ViewConfiguration.getTapTimeout() >> 16);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 29;
                    byte b12 = $$a[10];
                    int i84 = $$b;
                    Object[] objArr60 = new Object[1];
                    d(b12, (byte) (i84 | 48), (short) (i84 | 162), objArr60);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(scrollBarFadeDuration, tapTimeout4, packedPositionChild, -778300370, false, (String) objArr60[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, lValueOf7);
                Long lValueOf8 = Long.valueOf(jLongValue6 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                    char offsetAfter2 = (char) (TextUtils.getOffsetAfter(str8, 0) + 31533);
                    int capsMode = TextUtils.getCapsMode(str8, 0, 0) + 921;
                    int iRgb = Color.rgb(0, 0, 0) + 16777244;
                    byte[] bArr9 = $$a;
                    Object[] objArr61 = new Object[1];
                    d(bArr9[1], bArr9[7], (short) (-bArr9[9]), objArr61);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(offsetAfter2, capsMode, iRgb, -1048449946, false, (String) objArr61[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, lValueOf8);
                objArr4 = objArr58;
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr4[3])[0] != ((int[]) objArr4[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr2 = (String[]) objArr4[4];
            if (strArr2 != null) {
                for (String str24 : strArr2) {
                    arrayList2.add(str24);
                }
            }
            throw null;
        }
        int i85 = ((int[]) objArr4[0])[0];
        Object[] objArr62 = {new int[1], new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[]{((int[]) objArr4[3])[0]}, (String[]) objArr4[4]};
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i86 = i85 + ((((~((-1437240957) | iMaxMemory)) | 1102663267) * 398) - 240425153) + (((~((~iMaxMemory) | (-1437240957))) | 1102663267) * 398);
        int i87 = (i86 << 13) ^ i86;
        int i88 = i87 ^ (i87 >>> 17);
        ((int[]) objArr62[0])[0] = i88 ^ (i88 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
            char c8 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int iLastIndexOf2 = 1030 - TextUtils.lastIndexOf(str8, '0');
            int keyRepeatTimeout = 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            byte b13 = $$a[10];
            byte b14 = (byte) ($$b | 48);
            Object[] objArr63 = new Object[1];
            d(b13, b14, (short) (b14 | 10), objArr63);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(c8, iLastIndexOf2, keyRepeatTimeout, 1357589585, false, (String) objArr63[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).getLong(null);
        long jLongValue7 = ((Long) Class.forName(str17).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
            char cAxisFromString = (char) (MotionEvent.axisFromString(str8) + 1);
            int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 1031;
            int mirror = AndroidCharacter.getMirror('0') - '!';
            byte b15 = $$a[10];
            int i89 = $$b;
            Object[] objArr64 = new Object[1];
            d(b15, (byte) (i89 | 48), (short) (i89 | 162), objArr64);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cAxisFromString, edgeSlop3, mirror, 1344079056, false, (String) objArr64[0], null);
        }
        if (j3 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                char c9 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int iAlpha = Color.alpha(0) + 1031;
                int trimmedLength2 = 15 - TextUtils.getTrimmedLength(str8);
                byte[] bArr10 = $$a;
                Object[] objArr65 = new Object[1];
                d(bArr10[1], bArr10[7], (short) (-bArr10[9]), objArr65);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(c9, iAlpha, trimmedLength2, 632103528, false, (String) objArr65[0], null);
            }
            Object[] objArr66 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).get(null);
            objArr5 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i90 = ((int[]) objArr66[3])[0];
            int i91 = ((int[]) objArr66[1])[0];
            String[] strArr3 = (String[]) objArr66[0];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i92 = 940822142 + (((~((~iIdentityHashCode3) | 78038906)) | (-397867007)) * (-245));
            int i93 = ~(iIdentityHashCode3 | 78038906);
            int i94 = i92 + (i93 * (-245)) + ((i93 | 322319076) * 245) + 1421823884;
            int i95 = (i94 << 13) ^ i94;
            int i96 = i95 ^ (i95 >>> 17);
            ((int[]) objArr5[2])[0] = i96 ^ (i96 << 5);
        } else {
            int iIntValue3 = ((Integer) Class.forName(str19).getMethod(str3, Object.class).invoke(null, this)).intValue();
            Object[] objArr67 = {1109816201};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 46037), 1134 - Color.blue(0), 'B' - AndroidCharacter.getMirror('0'), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr68 = {Integer.valueOf(iIntValue3), 0, 1421823884, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).newInstance(objArr67), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int offsetAfter3 = TextUtils.getOffsetAfter(str8, 0) + 1031;
                int edgeSlop4 = (ViewConfiguration.getEdgeSlop() >> 16) + 15;
                byte b16 = $$a[10];
                byte b17 = (byte) ($$b | 48);
                Object[] objArr69 = new Object[1];
                d(b16, b17, (short) (b17 | 10), objArr69);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(scrollBarSize2, offsetAfter3, edgeSlop4, 1298546779, false, (String) objArr69[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.keyCodeFromString(str8) + 45993), 1117 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17), Boolean.TYPE});
            }
            objArr5 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).invoke(null, objArr68);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                char c10 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                int mode2 = View.MeasureSpec.getMode(0) + 1031;
                int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 15;
                byte[] bArr11 = $$a;
                Object[] objArr70 = new Object[1];
                d(bArr11[1], bArr11[7], (short) (-bArr11[9]), objArr70);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(c10, mode2, doubleTapTimeout2, 632103528, false, (String) objArr70[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, objArr5);
            try {
                long jLongValue8 = ((Long) Class.forName(str17).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf9 = Long.valueOf(jLongValue8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                    char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i97 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1031;
                    int iIndexOf5 = TextUtils.indexOf((CharSequence) str8, '0', 0, 0) + 16;
                    byte b18 = $$a[10];
                    int i98 = $$b;
                    Object[] objArr71 = new Object[1];
                    d(b18, (byte) (i98 | 48), (short) (i98 | 162), objArr71);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(scrollBarFadeDuration2, i97, iIndexOf5, 1344079056, false, (String) objArr71[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf9);
                Long lValueOf10 = Long.valueOf(jLongValue8 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                    char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                    int pressedStateDuration3 = (ViewConfiguration.getPressedStateDuration() >> 16) + 1031;
                    int iResolveSize = View.resolveSize(0, 0) + 15;
                    byte b19 = $$a[10];
                    byte b20 = (byte) ($$b | 48);
                    Object[] objArr72 = new Object[1];
                    d(b19, b20, (short) (b20 | 10), objArr72);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(deadChar2, pressedStateDuration3, iResolveSize, 1357589585, false, (String) objArr72[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, lValueOf10);
            } catch (Exception unused5) {
                throw new RuntimeException();
            }
        }
        int i99 = ((int[]) objArr5[1])[0];
        int i100 = ((int[]) objArr5[3])[0];
        if (i100 == i99) {
            Object[] objArr73 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i101 = ((int[]) objArr5[2])[0];
            int i102 = ((int[]) objArr5[3])[0];
            int i103 = ((int[]) objArr5[1])[0];
            String[] strArr4 = (String[]) objArr5[0];
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i104 = (-644203991) + (((~(499280 | iIdentityHashCode4)) | 243780889) * 672);
            int i105 = ~iIdentityHashCode4;
            int i106 = i101 + i104 + (((~(iIdentityHashCode4 | 243780889)) | (~((-499281) | i105))) * (-672)) + (((~((-243780890) | i105)) | 243286281) * 672);
            int i107 = (i106 << 13) ^ i106;
            int i108 = i107 ^ (i107 >>> 17);
            ((int[]) objArr73[2])[0] = i108 ^ (i108 << 5);
            str9 = str7;
        } else {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr5 = (String[]) objArr5[0];
            if (strArr5 != null) {
                for (String str25 : strArr5) {
                    arrayList3.add(str25);
                }
            }
            Toast.makeText((Context) null, i100 / (((i100 - 1) * i100) % 2), 0).show();
            Object[] objArr74 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i109 = ((int[]) objArr5[2])[0];
            int i110 = ((int[]) objArr5[3])[0];
            int i111 = ((int[]) objArr5[1])[0];
            String[] strArr6 = (String[]) objArr5[0];
            str9 = str7;
            int i112 = ((Context) Class.forName(str15).getMethod(str9, new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            int i113 = ~i112;
            int i114 = i109 + 1428975677 + (((~((-294688833) | i113)) | 538969002) * 220) + (((~(i113 | (-534558789))) | 778838958) * (-440)) + ((i112 | (-294688833)) * 220);
            int i115 = (i114 << 13) ^ i114;
            int i116 = i115 ^ (i115 >>> 17);
            ((int[]) objArr74[2])[0] = i116 ^ (i116 << 5);
        }
        super.onCreate();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
            char edgeSlop5 = (char) (43042 - (ViewConfiguration.getEdgeSlop() >> 16));
            int pressedStateDuration4 = 3111 - (ViewConfiguration.getPressedStateDuration() >> 16);
            int i117 = 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte b21 = $$a[10];
            byte b22 = (byte) ($$b | 48);
            Object[] objArr75 = new Object[1];
            d(b21, b22, (short) (b22 | 10), objArr75);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(edgeSlop5, pressedStateDuration4, i117, -1272852037, false, (String) objArr75[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                char cGreen = (char) (43042 - Color.green(0));
                int defaultSize2 = 3111 - View.getDefaultSize(0, 0);
                int maximumDrawingCacheSize = 22 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                Object[] objArr76 = new Object[1];
                d($$a[10], (byte) ($$b | 33), (short) 203, objArr76);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(cGreen, defaultSize2, maximumDrawingCacheSize, 154975793, false, (String) objArr76[0], null);
            }
            Object[] objArr77 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).get(null);
            int i118 = ((int[]) objArr77[2])[0];
            int i119 = ((int[]) objArr77[1])[0];
            String[] strArr7 = (String[]) objArr77[3];
            int[] iArr3 = {i119};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i120 = ~iUptimeMillis;
            int i121 = (((1127816950 + (((~((-694466072) | i120)) | (~((-1010565388) | iUptimeMillis))) * 1900)) + (((~(i120 | 1010565387)) | (~(iUptimeMillis | 694466071))) * (-950))) + (((~(iUptimeMillis | 1010565387)) | (~(i120 | 694466071))) * 950)) - 1871378317;
            int i122 = (i121 << 13) ^ i121;
            int i123 = i122 ^ (i122 >>> 17);
            ((int[]) objArr6[0])[0] = i123 ^ (i123 << 5);
            objArr6 = new Object[]{new int[1], iArr3, new int[]{i118}, strArr7};
        } else {
            Object[] objArr78 = {null, Integer.valueOf(((Integer) Class.forName(str19).getMethod(str3, Object.class).invoke(null, this)).intValue()), 0, -1871378317};
            byte[] bArr12 = $$d;
            byte b23 = bArr12[4];
            byte b24 = bArr12[18];
            Object[] objArr79 = new Object[1];
            e(b23, b24, (short) (b24 | 231), objArr79);
            Class<?> cls4 = Class.forName((String) objArr79[0]);
            Object[] objArr80 = new Object[1];
            e(bArr12[18], (byte) (-bArr12[56]), (short) 314, objArr80);
            Object[] objArr81 = (Object[]) cls4.getMethod((String) objArr80[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr78);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                char capsMode2 = (char) (43042 - TextUtils.getCapsMode(str8, 0, 0));
                int longPressTimeout2 = 3111 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int modifierMetaStateMask = 21 - ((byte) KeyEvent.getModifierMetaStateMask());
                Object[] objArr82 = new Object[1];
                d($$a[10], (byte) ($$b | 33), (short) 203, objArr82);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(capsMode2, longPressTimeout2, modifierMetaStateMask, 154975793, false, (String) objArr82[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, objArr81);
            try {
                long jLongValue9 = ((Long) Class.forName(str17).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf11 = Long.valueOf(jLongValue9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                    char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 43042);
                    int deadChar3 = 3111 - KeyEvent.getDeadChar(0, 0);
                    int i124 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21;
                    byte b25 = $$a[10];
                    int i125 = $$b;
                    Object[] objArr83 = new Object[1];
                    d(b25, (byte) (i125 | 48), (short) (i125 | 162), objArr83);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(windowTouchSlop, deadChar3, i124, -1269618118, false, (String) objArr83[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, lValueOf11);
                Long lValueOf12 = Long.valueOf(jLongValue9 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                    char cCombineMeasuredStates = (char) (43042 - View.combineMeasuredStates(0, 0));
                    int iArgb = 3111 - Color.argb(0, 0, 0, 0);
                    int iGreen = Color.green(0) + 22;
                    byte b26 = $$a[10];
                    byte b27 = (byte) ($$b | 48);
                    Object[] objArr84 = new Object[1];
                    d(b26, b27, (short) (b27 | 10), objArr84);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(cCombineMeasuredStates, iArgb, iGreen, -1272852037, false, (String) objArr84[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, lValueOf12);
                objArr6 = objArr81;
            } catch (Exception unused6) {
                throw new RuntimeException();
            }
        }
        int i126 = ((int[]) objArr6[1])[0];
        int i127 = ((int[]) objArr6[2])[0];
        if (i127 != i126) {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr8 = (String[]) objArr6[3];
            if (strArr8 != null) {
                int i128 = b + 63;
                f782a = i128 % 128;
                int i129 = i128 % 2 != 0 ? 0 : 1;
                while (i129 < strArr8.length) {
                    arrayList4.add(strArr8[i129]);
                    i129++;
                }
            }
            throw new RuntimeException(String.valueOf(i127));
        }
        int i130 = ((int[]) objArr6[0])[0];
        int i131 = ((int[]) objArr6[2])[0];
        int i132 = ((int[]) objArr6[1])[0];
        String[] strArr9 = (String[]) objArr6[3];
        int[] iArr4 = {i132};
        int iIdentityHashCode5 = System.identityHashCode(this);
        int i133 = ~iIdentityHashCode5;
        int i134 = i130 + 488392530 + (((~(882413819 | i133)) | 822617639) * (-328)) + ((iIdentityHashCode5 | 822617639) * 164) + (((~(iIdentityHashCode5 | (-882413820))) | 805830691 | (~(i133 | 899200767))) * 164);
        int i135 = (i134 << 13) ^ i134;
        int i136 = i135 ^ (i135 >>> 17);
        ((int[]) objArr[0])[0] = i136 ^ (i136 << 5);
        Object[] objArr85 = {new int[1], iArr4, new int[]{i131}, strArr9};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
            char cGreen2 = (char) Color.green(0);
            int iRed2 = 876 - Color.red(0);
            int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 10;
            byte[] bArr13 = $$a;
            byte b28 = bArr13[19];
            byte b29 = (byte) (-bArr13[9]);
            Object[] objArr86 = new Object[1];
            d(b28, b29, b29, objArr86);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(cGreen2, iRed2, iResolveSizeAndState2, -1199417970, false, (String) objArr86[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).getLong(null);
        long jLongValue10 = ((Long) Class.forName(str17).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
            int i137 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 875;
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
            byte[] bArr14 = $$a;
            byte b30 = (byte) (-bArr14[14]);
            byte b31 = bArr14[7];
            Object[] objArr87 = new Object[1];
            d(b30, b31, b31, objArr87);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(cNormalizeMetaState, i137, minimumFlingVelocity, 254769921, false, (String) objArr87[0], null);
        }
        if (j4 == ((jLongValue10 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                char c11 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 876;
                int iBlue = Color.blue(0) + 10;
                byte[] bArr15 = $$a;
                Object[] objArr88 = new Object[1];
                d(bArr15[19], bArr15[25], bArr15[7], objArr88);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(c11, absoluteGravity2, iBlue, 1324201839, false, (String) objArr88[0], null);
            }
            Object[] objArr89 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).get(null);
            objArr7 = new Object[]{new int[]{((int[]) objArr89[0])[0]}, new int[1], new int[]{((int[]) objArr89[2])[0]}, (String[]) objArr89[3]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i138 = ((((~((~iFreeMemory) | 251371051)) * 130) + 2110281772) + (((~(iFreeMemory | 251371051)) | 202409984) * 130)) - 952635172;
            int i139 = (i138 << 13) ^ i138;
            int i140 = i139 ^ (i139 >>> 17);
            ((int[]) objArr7[1])[0] = i140 ^ (i140 << 5);
        } else {
            Object[] objArr90 = {Integer.valueOf(((Integer) Class.forName(str19).getMethod(str3, Object.class).invoke(null, this)).intValue()), -952635172};
            byte[] bArr16 = $$d;
            byte b32 = bArr16[4];
            byte b33 = bArr16[30];
            Object[] objArr91 = new Object[1];
            e(b32, b33, (short) (b33 | 346), objArr91);
            Class<?> cls5 = Class.forName((String) objArr91[0]);
            Object[] objArr92 = new Object[1];
            e(bArr16[18], (byte) (-bArr16[56]), (short) 314, objArr92);
            objArr7 = (Object[]) cls5.getMethod((String) objArr92[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr90);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                char capsMode3 = (char) TextUtils.getCapsMode(str8, 0, 0);
                int i141 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 876;
                int mirror2 = AndroidCharacter.getMirror('0') - '&';
                byte[] bArr17 = $$a;
                Object[] objArr93 = new Object[1];
                d(bArr17[19], bArr17[25], bArr17[7], objArr93);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(capsMode3, i141, mirror2, 1324201839, false, (String) objArr93[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, objArr7);
            try {
                long jLongValue11 = ((Long) Class.forName(str17).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf13 = Long.valueOf(jLongValue11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                    char cRed = (char) Color.red(0);
                    int trimmedLength3 = 876 - TextUtils.getTrimmedLength(str8);
                    int i142 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 9;
                    byte[] bArr18 = $$a;
                    byte b34 = (byte) (-bArr18[14]);
                    byte b35 = bArr18[7];
                    Object[] objArr94 = new Object[1];
                    d(b34, b35, b35, objArr94);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(cRed, trimmedLength3, i142, 254769921, false, (String) objArr94[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, lValueOf13);
                Long lValueOf14 = Long.valueOf(jLongValue11 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int pressedStateDuration5 = 876 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iResolveSize2 = View.resolveSize(0, 0) + 10;
                    byte[] bArr19 = $$a;
                    byte b36 = bArr19[19];
                    byte b37 = (byte) (-bArr19[9]);
                    Object[] objArr95 = new Object[1];
                    d(b36, b37, b37, objArr95);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(packedPositionGroup, pressedStateDuration5, iResolveSize2, -1199417970, false, (String) objArr95[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf14);
            } catch (Exception unused7) {
                throw new RuntimeException();
            }
        }
        int i143 = ((int[]) objArr7[2])[0];
        int i144 = ((int[]) objArr7[0])[0];
        if (i144 == i143) {
            int i145 = ((int[]) objArr7[1])[0];
            Object[] objArr96 = {new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            str10 = str9;
            int i146 = ((Context) Class.forName(str15).getMethod(str10, new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i147 = (~((-948905546) | i146)) | 143074825;
            int i148 = i145 + 1521273620 + (i147 * 992) + ((i147 | (~((~i146) | (-102764597)))) * (-496)) + ((i146 | (-908595317)) * 496);
            int i149 = i148 ^ (i148 << 13);
            int i150 = i149 ^ (i149 >>> 17);
            i2 = 0;
            ((int[]) objArr96[1])[0] = i150 ^ (i150 << 5);
        } else {
            str10 = str9;
            ArrayList arrayList5 = new ArrayList();
            String[] strArr10 = (String[]) objArr7[3];
            if (strArr10 != null) {
                int i151 = 0;
                while (i151 < strArr10.length) {
                    int i152 = f782a + 57;
                    b = i152 % 128;
                    if (i152 % 2 != 0) {
                        arrayList5.add(strArr10[i151]);
                        i151 += 105;
                    } else {
                        arrayList5.add(strArr10[i151]);
                        i151++;
                    }
                }
            }
            Toast.makeText((Context) null, i144 / (((i144 - 1) * i144) % 2), 0).show();
            int i153 = ((int[]) objArr7[1])[0];
            Object[] objArr97 = {new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iMyPid = Process.myPid();
            int i154 = ~iMyPid;
            int i155 = i153 + 1987448052 + (((~(361137317 | i154)) | (~((-132230) | iMyPid))) * (-831)) + ((~(401579775 | iMyPid)) * (-1662)) + (((~(iMyPid | (-361137318))) | (~(i154 | (-401447547))) | (~(401447546 | iMyPid))) * 831);
            int i156 = i155 ^ (i155 << 13);
            int i157 = i156 ^ (i156 >>> 17);
            i2 = 0;
            ((int[]) objArr97[1])[0] = i157 ^ (i157 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
            char longPressTimeout3 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int absoluteGravity3 = Gravity.getAbsoluteGravity(i2, i2) + 651;
            int i158 = (TypedValue.complexToFloat(i2) > 0.0f ? 1 : (TypedValue.complexToFloat(i2) == 0.0f ? 0 : -1)) + 44;
            Object[] objArr98 = new Object[1];
            d($$a[10], (byte) ($$b | 48), (short) 114, objArr98);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(longPressTimeout3, absoluteGravity3, i158, -459846511, false, (String) objArr98[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).getLong(null);
        long jLongValue12 = ((Long) Class.forName(str17).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
            char cAlpha = (char) Color.alpha(0);
            int iResolveSize3 = 651 - View.resolveSize(0, 0);
            int iKeyCodeFromString2 = KeyEvent.keyCodeFromString(str8) + 44;
            byte[] bArr20 = $$a;
            Object[] objArr99 = new Object[1];
            d(bArr20[1], bArr20[7], (short) (-bArr20[9]), objArr99);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(cAlpha, iResolveSize3, iKeyCodeFromString2, -873460649, false, (String) objArr99[0], null);
        }
        if (j5 == ((jLongValue12 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                char size4 = (char) View.MeasureSpec.getSize(0);
                int iIndexOf6 = 651 - TextUtils.indexOf(str8, str8, 0);
                int iLastIndexOf3 = TextUtils.lastIndexOf(str8, '0', 0) + 45;
                Object[] objArr100 = new Object[1];
                d($$a[10], (byte) ($$b | 33), (short) 203, objArr100);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(size4, iIndexOf6, iLastIndexOf3, -1595579076, false, (String) objArr100[0], null);
            }
            Object[] objArr101 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).get(null);
            objArr8 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i159 = ((int[]) objArr101[2])[0];
            int i160 = ((int[]) objArr101[0])[0];
            int i161 = ~(((Context) Class.forName(str15).getMethod(str10, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_mandiri_debit_card_no).substring(22, 23).length() - 335824520);
            int i162 = (-627838047) + (((~(i161 | 696121775)) | (~((-688455682) | i161))) * (-184)) + ((5548452 | (~((-694004134) | i161)) | (~(690573323 | i161))) * 184) + 1266940579;
            int i163 = (i162 << 13) ^ i162;
            int i164 = i163 ^ (i163 >>> 17);
            ((int[]) objArr8[3])[0] = i164 ^ (i164 << 5);
            i3 = 0;
            c = 2;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1610 - TextUtils.getCapsMode(str8, 0, 0), 26 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 2145681644, false, null, new Class[0]);
            }
            Object[] objArr102 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).newInstance(null), 1656586891, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                char edgeSlop6 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                int iRgb2 = Color.rgb(0, 0, 0) + 16777867;
                int windowTouchSlop2 = 44 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte[] bArr21 = $$a;
                Object[] objArr103 = new Object[1];
                d(bArr21[1], bArr21[7], (short) (-bArr21[9]), objArr103);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(edgeSlop6, iRgb2, windowTouchSlop2, 2075921419, false, (String) objArr103[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 695, 98 - TextUtils.getOffsetAfter(str8, 0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - Color.alpha(0)), 793 - KeyEvent.normalizeMetaState(0), 82 - ExpandableListView.getPackedPositionChild(0L)), Integer.TYPE, Integer.TYPE});
            }
            objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).invoke(null, objArr102);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                char edgeSlop7 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                int iRgb3 = Color.rgb(0, 0, 0) + 16777867;
                int tapTimeout5 = (ViewConfiguration.getTapTimeout() >> 16) + 44;
                Object[] objArr104 = new Object[1];
                d($$a[10], (byte) ($$b | 33), (short) 203, objArr104);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(edgeSlop7, iRgb3, tapTimeout5, -1595579076, false, (String) objArr104[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, objArr8);
            try {
                long jLongValue13 = ((Long) Class.forName(str17).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf15 = Long.valueOf(jLongValue13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                    char cIndexOf = (char) TextUtils.indexOf(str8, str8);
                    int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 651;
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 44;
                    byte[] bArr22 = $$a;
                    Object[] objArr105 = new Object[1];
                    d(bArr22[1], bArr22[7], (short) (-bArr22[9]), objArr105);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(cIndexOf, keyRepeatTimeout2, iNormalizeMetaState, -873460649, false, (String) objArr105[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, lValueOf15);
                Long lValueOf16 = Long.valueOf(jLongValue13 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                    char cIndexOf2 = (char) TextUtils.indexOf(str8, str8, 0);
                    int iIndexOf7 = TextUtils.indexOf(str8, str8, 0, 0) + 651;
                    int i165 = 44 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    Object[] objArr106 = new Object[1];
                    d($$a[10], (byte) ($$b | 48), (short) 114, objArr106);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(cIndexOf2, iIndexOf7, i165, -459846511, false, (String) objArr106[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, lValueOf16);
                int i166 = b + 79;
                f782a = i166 % 128;
                c = 2;
                int i167 = i166 % 2;
                i3 = 0;
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr8[c])[i3] != ((int[]) objArr8[i3])[i3]) {
            int i168 = i3;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr11 = (String[]) objArr8[1];
            if (strArr11 != null) {
                for (int i169 = i168; i169 < strArr11.length; i169++) {
                    arrayList6.add(strArr11[i169]);
                }
            }
            throw null;
        }
        Object[] objArr107 = new Object[4];
        int[] iArr5 = new int[1];
        objArr107[i3] = iArr5;
        int[] iArr6 = new int[1];
        objArr107[c] = iArr6;
        objArr107[3] = new int[1];
        int i170 = ((int[]) objArr8[3])[i3];
        int i171 = ((int[]) objArr8[c])[i3];
        int i172 = ((int[]) objArr8[i3])[i3];
        iArr6[i3] = i171;
        iArr5[i3] = i172;
        objArr107[1] = new String[i3];
        int i173 = ~(((int) Runtime.getRuntime().freeMemory()) | (-597721210));
        int i174 = i170 + (((1271361795 + (((-601152020) | i173) * (-220))) + ((i173 | 2097256) * 220)) - 838785530);
        int i175 = (i174 << 13) ^ i174;
        int i176 = i175 ^ (i175 >>> 17);
        ((int[]) objArr107[3])[0] = i176 ^ (i176 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
            char modifierMetaStateMask2 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
            int doubleTapTimeout3 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2267;
            int i177 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 34;
            byte b38 = $$a[10];
            int i178 = $$b;
            Object[] objArr108 = new Object[1];
            d(b38, (byte) (i178 | 48), (short) (i178 | 162), objArr108);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(modifierMetaStateMask2, doubleTapTimeout3, i177, -887667012, false, (String) objArr108[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                char cIndexOf3 = (char) ((-1) - TextUtils.indexOf((CharSequence) str8, '0'));
                int i179 = 2268 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int i180 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33;
                Object[] objArr109 = new Object[1];
                d($$a[10], (byte) ($$b | 33), (short) 203, objArr109);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(cIndexOf3, i179, i180, -654680577, false, (String) objArr109[0], null);
            }
            Object[] objArr110 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).get(null);
            objArr9 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i181 = ((int[]) objArr110[0])[0];
            int i182 = ((int[]) objArr110[3])[0];
            String[] strArr12 = (String[]) objArr110[1];
            int i183 = ((Context) Class.forName(str15).getMethod(str10, new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
            int i184 = (((2015639349 + (((~((~i183) | (-229720578))) | (~((-788685) | i183))) * (-302))) + ((~((-229720578) | i183)) * (-604))) + (((~(i183 | (-230509262))) | (-1040011262)) * 302)) - 1562407389;
            int i185 = (i184 << 13) ^ i184;
            int i186 = i185 ^ (i185 >>> 17);
            ((int[]) objArr9[2])[0] = i186 ^ (i186 << 5);
            str12 = str3;
            str11 = str2;
            str10 = str10;
        } else {
            Context baseContext4 = getBaseContext();
            if (baseContext4 == null) {
                str11 = str2;
                baseContext4 = (Context) Class.forName(str21).getMethod(str11, new Class[0]).invoke(null, null);
            } else {
                str11 = str2;
            }
            if (baseContext4 != null) {
                baseContext4 = ((baseContext4 instanceof ContextWrapper) && ((ContextWrapper) baseContext4).getBaseContext() == null) ? null : baseContext4.getApplicationContext();
            }
            str12 = str3;
            Object[] objArr111 = {baseContext4, Integer.valueOf(((Integer) Class.forName(str19).getMethod(str12, Object.class).invoke(null, this)).intValue()), 0, -1562407389};
            byte[] bArr23 = $$d;
            Object[] objArr112 = new Object[1];
            e((byte) (-bArr23[466]), (byte) (-bArr23[235]), (short) 429, objArr112);
            Class<?> cls6 = Class.forName((String) objArr112[0]);
            Object[] objArr113 = new Object[1];
            e(bArr23[18], (byte) (-bArr23[56]), (short) 314, objArr113);
            Object[] objArr114 = (Object[]) cls6.getMethod((String) objArr113[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr111);
            if (baseContext4 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                    char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 2267;
                    int i187 = 33 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    Object[] objArr115 = new Object[1];
                    d($$a[10], (byte) ($$b | 33), (short) 203, objArr115);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(packedPositionGroup2, maxKeyCode2, i187, -654680577, false, (String) objArr115[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, objArr114);
                try {
                    long jLongValue14 = ((Long) Class.forName(str17).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue14);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                        char scrollBarFadeDuration3 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int iAxisFromString2 = MotionEvent.axisFromString(str8) + 2268;
                        int i188 = 33 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte b39 = $$a[10];
                        byte b40 = (byte) ($$b | 48);
                        Object[] objArr116 = new Object[1];
                        d(b39, b40, (short) (b40 | 10), objArr116);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(scrollBarFadeDuration3, iAxisFromString2, i188, -874156483, false, (String) objArr116[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue14 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                        char jumpTapTimeout3 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int minimumFlingVelocity2 = 2267 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int minimumFlingVelocity3 = 33 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        byte b41 = $$a[10];
                        int i189 = $$b;
                        Object[] objArr117 = new Object[1];
                        d(b41, (byte) (i189 | 48), (short) (i189 | 162), objArr117);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(jumpTapTimeout3, minimumFlingVelocity2, minimumFlingVelocity3, -887667012, false, (String) objArr117[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            } else {
                str10 = str10;
                objArr114 = objArr114;
            }
            objArr9 = objArr114;
        }
        int i190 = ((int[]) objArr9[3])[0];
        int i191 = ((int[]) objArr9[0])[0];
        if (i191 != i190) {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr13 = (String[]) objArr9[1];
            if (strArr13 != null) {
                for (String str26 : strArr13) {
                    arrayList7.add(str26);
                }
            }
            throw new RuntimeException(String.valueOf(i191));
        }
        Object[] objArr118 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i192 = ((int[]) objArr9[2])[0];
        int i193 = ((int[]) objArr9[0])[0];
        int i194 = ((int[]) objArr9[3])[0];
        String[] strArr14 = (String[]) objArr9[1];
        int iNextInt = new Random().nextInt(1776250690);
        int i195 = i192 + 1716603051 + (((~(iNextInt | 951635711)) | 142922395) * (-668)) + ((951635711 | (~(142922395 | iNextInt))) * 1336) + ((iNextInt | 951901951) * 668);
        int i196 = (i195 << 13) ^ i195;
        int i197 = i196 ^ (i196 >>> 17);
        ((int[]) objArr118[2])[0] = i197 ^ (i197 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
            char c12 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 37566);
            int i198 = 625 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 14;
            byte[] bArr24 = $$a;
            Object[] objArr119 = new Object[1];
            d(bArr24[1], bArr24[7], (short) (-bArr24[9]), objArr119);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(c12, i198, iMakeMeasureSpec, -477065106, false, (String) objArr119[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).getLong(null);
        long jLongValue15 = ((Long) Class.forName(str17).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
            char cAlpha2 = (char) (Color.alpha(0) + 37567);
            int size5 = View.MeasureSpec.getSize(0) + 625;
            int i199 = 14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte b42 = $$a[10];
            byte b43 = (byte) ($$b | 48);
            Object[] objArr120 = new Object[1];
            d(b42, b43, (short) (b43 | 10), objArr120);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(cAlpha2, size5, i199, -976899241, false, (String) objArr120[0], null);
        }
        if (j6 == ((jLongValue15 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                char gidForName = (char) (Process.getGidForName(str8) + 37568);
                int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L) + 625;
                int i200 = 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte b44 = $$a[10];
                int i201 = $$b;
                Object[] objArr121 = new Object[1];
                d(b44, (byte) (i201 | 48), (short) (i201 | 162), objArr121);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(gidForName, packedPositionGroup3, i200, -973632554, false, (String) objArr121[0], null);
            }
            Object[] objArr122 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).get(null);
            int i202 = ((int[]) objArr122[2])[0];
            int i203 = ((int[]) objArr122[0])[0];
            String[] strArr15 = (String[]) objArr122[3];
            int[] iArr7 = {i202};
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i204 = 1722807816 + (((~((-817107213) | (~iIdentityHashCode6))) | (~(1006630908 | iIdentityHashCode6))) * (-272)) + (((~((-872207725) | iIdentityHashCode6)) | 55100512) * (-272)) + (((~(iIdentityHashCode6 | 872207724)) | 951530396) * 272) + 1772797218;
            int i205 = (i204 << 13) ^ i204;
            int i206 = i205 ^ (i205 >>> 17);
            ((int[]) objArr10[1])[0] = i206 ^ (i206 << 5);
            objArr10 = new Object[]{new int[]{i203}, new int[1], iArr7, strArr15};
            i4 = 0;
            str13 = str10;
            str14 = str6;
        } else {
            Context baseContext5 = getBaseContext();
            if (baseContext5 == null) {
                baseContext5 = (Context) Class.forName(str21).getMethod(str11, new Class[0]).invoke(null, null);
            }
            if (baseContext5 != null) {
                baseContext5 = ((baseContext5 instanceof ContextWrapper) && ((ContextWrapper) baseContext5).getBaseContext() == null) ? null : baseContext5.getApplicationContext();
            }
            int iIntValue4 = ((Integer) Class.forName(str19).getMethod(str12, Object.class).invoke(null, this)).intValue();
            str13 = str10;
            Object[] objArr123 = new Object[1];
            c(null, null, ((Context) Class.forName(str15).getMethod(str13, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 20, new byte[]{-98, -100, -99, -98, -98, -91, -90, -96, -98, -100, -90, -91, -126, -90, -89, -126, -95, -92, -116, -99, -90, -91, -95, -99, -126, -90, -93, -93, -96, -100, -126, -96, -96, -91, -113, -92, -93, -98, -94, -116, -98, -94, -94, -95, -116, -97, -93, -94, -95, -126, -116, -116, -95, -99, -99, -96, -97, -99, -98, -126, -126, -99, -116, -100}, objArr123);
            String str27 = (String) objArr123[0];
            Object[] objArr124 = new Object[1];
            c(null, null, ((Context) Class.forName(str15).getMethod(str13, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, new byte[]{-99, -97, -89, -126, -91, -100, -99, -107, -100, -92, -91, -98, -96, -96, -107, -96, -92, -92, -91, -94, -97, -99, -116, -100, -100, -126, -116, -91, -93, -95, -98, -96, -90, -96, -96, -92, -96, -98, -91, -98, -97, -99, -94, -95, -92, -97, -92, -100, -91, -99, -100, -116, -98, -89, -99, -116, -94, -98, -95, -89, -97, -113, -126, -107}, objArr124);
            Object[] objArr125 = {baseContext5, new String[]{str27, (String) objArr124[0]}, Integer.valueOf(iIntValue4), 17, 1772797218};
            byte[] bArr25 = $$d;
            Object[] objArr126 = new Object[1];
            e(bArr25[105], (byte) (-bArr25[25]), (short) 448, objArr126);
            Class<?> cls7 = Class.forName((String) objArr126[0]);
            Object[] objArr127 = new Object[1];
            e(bArr25[18], (byte) (-bArr25[176]), (short) 179, objArr127);
            Object[] objArr128 = (Object[]) cls7.getMethod((String) objArr127[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr125);
            int i207 = ((int[]) objArr128[0])[0];
            int i208 = ((int[]) objArr128[2])[0];
            if (baseContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                    char offsetBefore = (char) (TextUtils.getOffsetBefore(str8, 0) + 37567);
                    int iGreen2 = 625 - Color.green(0);
                    int iArgb2 = Color.argb(0, 0, 0, 0) + 14;
                    byte b45 = $$a[10];
                    int i209 = $$b;
                    Object[] objArr129 = new Object[1];
                    d(b45, (byte) (i209 | 48), (short) (i209 | 162), objArr129);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(offsetBefore, iGreen2, iArgb2, -973632554, false, (String) objArr129[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).set(null, objArr128);
                try {
                    str14 = str6;
                    long jLongValue16 = ((Long) Class.forName(str17).getDeclaredMethod(str14, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf19 = Long.valueOf(jLongValue16);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                        char cNormalizeMetaState2 = (char) (KeyEvent.normalizeMetaState(0) + 37567);
                        int iMyPid2 = 625 - (Process.myPid() >> 22);
                        int offsetAfter4 = 14 - TextUtils.getOffsetAfter(str8, 0);
                        byte b46 = $$a[10];
                        byte b47 = (byte) ($$b | 48);
                        Object[] objArr130 = new Object[1];
                        d(b46, b47, (short) (b47 | 10), objArr130);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(cNormalizeMetaState2, iMyPid2, offsetAfter4, -976899241, false, (String) objArr130[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, lValueOf19);
                    Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                        char doubleTapTimeout4 = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 37567);
                        int windowTouchSlop3 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 625;
                        int maxKeyCode3 = (KeyEvent.getMaxKeyCode() >> 16) + 14;
                        byte[] bArr26 = $$a;
                        Object[] objArr131 = new Object[1];
                        d(bArr26[1], bArr26[7], (short) (-bArr26[9]), objArr131);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(doubleTapTimeout4, windowTouchSlop3, maxKeyCode3, -477065106, false, (String) objArr131[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf20);
                } catch (Exception unused10) {
                    throw new RuntimeException();
                }
            } else {
                objArr128 = objArr128;
                str14 = str6;
            }
            objArr10 = objArr128;
            i4 = 0;
        }
        int i210 = ((int[]) objArr10[i4])[i4];
        int i211 = ((int[]) objArr10[2])[i4];
        if (i211 != i210) {
            int i212 = i4;
            ArrayList arrayList8 = new ArrayList();
            String[] strArr16 = (String[]) objArr10[3];
            if (strArr16 != null) {
                for (int i213 = i212; i213 < strArr16.length; i213++) {
                    int i214 = f782a + 87;
                    b = i214 % 128;
                    int i215 = i214 % 2;
                    arrayList8.add(strArr16[i213]);
                }
            }
            throw new RuntimeException(String.valueOf(i211));
        }
        Object[] objArr132 = new Object[4];
        int[] iArr8 = new int[1];
        objArr132[i4] = iArr8;
        objArr132[1] = new int[1];
        int[] iArr9 = new int[1];
        objArr132[2] = iArr9;
        int i216 = ((int[]) objArr10[1])[i4];
        int i217 = ((int[]) objArr10[2])[i4];
        int i218 = ((int[]) objArr10[i4])[i4];
        String[] strArr17 = (String[]) objArr10[3];
        iArr9[i4] = i217;
        iArr8[i4] = i218;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i219 = i216 + (-878171100) + (((-349446410) | (~elapsedCpuTime)) * (-490)) + (((~(elapsedCpuTime | (-1440540474))) | 1091094064) * 490) + 1211713504;
        int i220 = (i219 << 13) ^ i219;
        int i221 = i220 ^ (i220 >>> 17);
        ((int[]) objArr132[1])[0] = i221 ^ (i221 << 5);
        objArr132[3] = strArr17;
        int i222 = b + 11;
        f782a = i222 % 128;
        if (i222 % 2 == 0) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                char modifierMetaStateMask3 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 53894);
                int i223 = 1321 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int iRgb4 = Color.rgb(0, 0, 0) + 16777252;
                byte[] bArr27 = $$a;
                Object[] objArr133 = new Object[1];
                d(bArr27[1], bArr27[7], (short) (-bArr27[9]), objArr133);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(modifierMetaStateMask3, i223, iRgb4, -1433084963, false, (String) objArr133[0], null);
            }
            Object obj = null;
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).getLong(null);
            obj.hashCode();
            throw null;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
            char offsetBefore2 = (char) (53893 - TextUtils.getOffsetBefore(str8, 0));
            int offsetAfter5 = TextUtils.getOffsetAfter(str8, 0) + 1320;
            int iIndexOf8 = TextUtils.indexOf(str8, str8, 0) + 36;
            byte[] bArr28 = $$a;
            Object[] objArr134 = new Object[1];
            d(bArr28[1], bArr28[7], (short) (-bArr28[9]), objArr134);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(offsetBefore2, offsetAfter5, iIndexOf8, -1433084963, false, (String) objArr134[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                char scrollDefaultDelay3 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 53893);
                int iKeyCodeFromString3 = KeyEvent.keyCodeFromString(str8) + 1320;
                int iBlue2 = Color.blue(0) + 36;
                byte b48 = $$a[10];
                int i224 = $$b;
                Object[] objArr135 = new Object[1];
                d(b48, (byte) (i224 | 48), (short) (i224 | 162), objArr135);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(scrollDefaultDelay3, iKeyCodeFromString3, iBlue2, -1920778747, false, (String) objArr135[0], null);
            }
            Object[] objArr136 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).get(null);
            objArr11 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i225 = ((int[]) objArr136[0])[0];
            int i226 = ((int[]) objArr136[3])[0];
            String[] strArr18 = (String[]) objArr136[2];
            int i227 = ((Context) Class.forName(str15).getMethod(str13, new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            int i228 = ~((-969996034) | i227);
            int i229 = ~i227;
            int i230 = i228 | (~(400631791 | i229));
            int i231 = ~(969996033 | i229);
            int i232 = ((((-1190166728) + ((i230 | i231) * (-516))) + (((~(i227 | (-297805570))) | (~((-102826223) | i229))) * 516)) + ((102826222 | i231) * 516)) - 1587643051;
            int i233 = (i232 << 13) ^ i232;
            int i234 = i233 ^ (i233 >>> 17);
            ((int[]) objArr11[1])[0] = i234 ^ (i234 << 5);
        } else {
            Context baseContext6 = getBaseContext();
            if (baseContext6 == null) {
                int i235 = f782a + 19;
                b = i235 % 128;
                int i236 = i235 % 2;
                baseContext6 = (Context) Class.forName(str21).getMethod(str11, new Class[0]).invoke(null, null);
            }
            if (baseContext6 != null) {
                baseContext6 = ((baseContext6 instanceof ContextWrapper) && ((ContextWrapper) baseContext6).getBaseContext() == null) ? null : baseContext6.getApplicationContext();
            }
            int iIntValue5 = ((Integer) Class.forName(str19).getMethod(str12, Object.class).invoke(null, this)).intValue();
            Object[] objArr137 = {1176926677};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b((char) (47977 - KeyEvent.getDeadChar(0, 0)), TextUtils.indexOf(str8, str8, 0) + 1300, 20 - TextUtils.indexOf(str8, str8, 0), -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr138 = {baseContext6, "com.bpjstku", -1587643051, Integer.valueOf(iIntValue5), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).newInstance(objArr137), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                char keyRepeatDelay2 = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 53893);
                int threadPriority = 1320 - ((Process.getThreadPriority(0) + 20) >> 6);
                int gidForName2 = 35 - Process.getGidForName(str8);
                byte b49 = $$a[10];
                int i237 = $$b;
                Object[] objArr139 = new Object[1];
                d(b49, (byte) (i237 | 48), (short) (i237 | 162), objArr139);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(keyRepeatDelay2, threadPriority, gidForName2, 819724799, false, (String) objArr139[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 57877), 1394 - (Process.myPid() >> 22), (Process.myPid() >> 22) + 75), Boolean.TYPE});
            }
            Object[] objArr140 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).invoke(null, objArr138);
            if (baseContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                    char bitsPerPixel2 = (char) (53892 - ImageFormat.getBitsPerPixel(0));
                    int minimumFlingVelocity4 = 1320 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int iArgb3 = Color.argb(0, 0, 0, 0) + 36;
                    byte b50 = $$a[10];
                    int i238 = $$b;
                    Object[] objArr141 = new Object[1];
                    d(b50, (byte) (i238 | 48), (short) (i238 | 162), objArr141);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(bitsPerPixel2, minimumFlingVelocity4, iArgb3, -1920778747, false, (String) objArr141[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, objArr140);
                try {
                    long jLongValue17 = ((Long) Class.forName(str17).getDeclaredMethod(str14, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue17);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                        char minimumFlingVelocity5 = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 53893);
                        int iAxisFromString3 = 1319 - MotionEvent.axisFromString(str8);
                        int i239 = 36 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        Object[] objArr142 = new Object[1];
                        d($$a[10], (byte) ($$b | 33), (short) 203, objArr142);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(minimumFlingVelocity5, iAxisFromString3, i239, -1273706634, false, (String) objArr142[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                        char cIndexOf4 = (char) (53892 - TextUtils.indexOf((CharSequence) str8, '0', 0, 0));
                        int i240 = 1319 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int size6 = View.MeasureSpec.getSize(0) + 36;
                        byte[] bArr29 = $$a;
                        Object[] objArr143 = new Object[1];
                        d(bArr29[1], bArr29[7], (short) (-bArr29[9]), objArr143);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(cIndexOf4, i240, size6, -1433084963, false, (String) objArr143[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).set(null, lValueOf22);
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
            objArr11 = objArr140;
        }
        int i241 = ((int[]) objArr11[3])[0];
        int i242 = ((int[]) objArr11[0])[0];
        if (i242 == i241) {
            Object[] objArr144 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i243 = ((int[]) objArr11[1])[0];
            int i244 = ((int[]) objArr11[0])[0];
            int i245 = ((int[]) objArr11[3])[0];
            String[] strArr19 = (String[]) objArr11[2];
            int i246 = ((Context) Class.forName(str15).getMethod(str13, new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i247 = i243 + 1486848777 + (((~(i246 | 919771463)) | (-450856362)) * (-465)) + ((919771463 | (~((-450856362) | i246))) * 930) + ((i246 | (-135070889)) * 465);
            int i248 = (i247 << 13) ^ i247;
            int i249 = i248 ^ (i248 >>> 17);
            ((int[]) objArr144[1])[0] = i249 ^ (i249 << 5);
        } else {
            Toast.makeText((Context) null, i242 / (((i242 - 1) * i242) % 2), 0).show();
            Object[] objArr145 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i250 = ((int[]) objArr11[1])[0];
            int i251 = ((int[]) objArr11[0])[0];
            int i252 = ((int[]) objArr11[3])[0];
            String[] strArr20 = (String[]) objArr11[2];
            int iCodePointAt2 = ((Context) Class.forName(str15).getMethod(str13, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 97629155;
            int i253 = i250 + ((~((-8388807) | iCodePointAt2)) * 521) + 133922450 + (((~((~iCodePointAt2) | (-8388807))) | 554556456) * 521);
            int i254 = i253 ^ (i253 << 13);
            int i255 = i254 ^ (i254 >>> 17);
            ((int[]) objArr145[1])[0] = i255 ^ (i255 << 5);
        }
        zzd().zza();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        int i = 2 % 2;
        int i2 = f782a + 47;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzd();
        zznt.zzi(intent);
        int i4 = b + 103;
        f782a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        int i = 2 % 2;
        int i2 = b + 93;
        f782a = i2 % 128;
        int i3 = i2 % 2;
        zzd().zze(jobParameters);
        int i4 = f782a + 21;
        b = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        int i = 2 % 2;
        int i2 = b + 31;
        f782a = i2 % 128;
        int i3 = i2 % 2;
        zzd();
        zznt.zzj(intent);
        int i4 = f782a + 15;
        b = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zznp
    public final boolean zza(int i) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zznp
    public final void zzb(JobParameters jobParameters, boolean z) {
        int i = 2 % 2;
        int i2 = f782a + 97;
        b = i2 % 128;
        int i3 = i2 % 2;
        jobFinished(jobParameters, false);
        int i4 = b + 65;
        f782a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = f782a + 17;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            zzd().zzb();
            super.onDestroy();
            throw null;
        }
        zzd().zzb();
        super.onDestroy();
        int i3 = b + 113;
        f782a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 8 / 0;
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da;
        int i = 2 % 2;
        int i2 = b + 51;
        f782a = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cRed = (char) Color.red(0);
            int i5 = 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 15;
            byte b2 = $$a[10];
            byte b3 = (byte) ($$b | 48);
            Object[] objArr2 = new Object[1];
            d(b2, b3, (short) (b3 | 10), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRed, i5, iResolveSizeAndState, 1357589585, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(null, null, 127 - KeyEvent.normalizeMetaState(0), new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_utilized_orderid).substring(9, 10).codePointAt(0) + 26, new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 1031;
            int iResolveSize = 15 - View.resolveSize(0, 0);
            byte b4 = $$a[10];
            int i6 = $$b;
            Object[] objArr5 = new Object[1];
            d(b4, (byte) (i6 | 48), (short) (i6 | 162), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iResolveSizeAndState2, iResolveSize, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1031;
                int i7 = 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                byte[] bArr = $$a;
                Object[] objArr6 = new Object[1];
                d(bArr[1], bArr[7], (short) (-bArr[9]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, scrollBarSize, i7, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i8 = ((int[]) objArr7[3])[0];
            int i9 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i10 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i11 = ~i10;
            int i12 = ~(586714164 | i11);
            int i13 = (((115754545 + (((-922332415) | i12) * (-712))) + (((~(i10 | (-335618251))) | (~(i11 | 922332414))) * (-712))) + ((342433994 | i12) * 712)) - 848352154;
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr[2])[0] = i15 ^ (i15 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step7).substring(16, 17).codePointAt(0) + 26, new byte[]{-115, -116, -117, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(null, null, TextUtils.indexOf("", "", 0, 0) + 127, new byte[]{-116, -113, -109, -110, -111, -118, -126, -112, -119, -117, -114, -117, -122, -116, -113, -114}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1538585176};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - (ViewConfiguration.getEdgeSlop() >> 16)), (ViewConfiguration.getPressedStateDuration() >> 16) + 1134, TextUtils.indexOf("", "", 0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -848352154, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                    int iNormalizeMetaState = 1031 - KeyEvent.normalizeMetaState(0);
                    int iBlue = 15 - Color.blue(0);
                    byte b5 = $$a[10];
                    byte b6 = (byte) ($$b | 48);
                    Object[] objArr12 = new Object[1];
                    d(b5, b6, (short) (b6 | 10), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iNormalizeMetaState, iBlue, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1118 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Color.red(0) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i16 = 1032 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int i17 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                    byte[] bArr2 = $$a;
                    Object[] objArr13 = new Object[1];
                    d(bArr2[1], bArr2[7], (short) (-bArr2[9]), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, i16, i17, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 116, new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(null, null, TextUtils.lastIndexOf("", '0') + 128, new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int i18 = 1031 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 16;
                        byte b7 = $$a[10];
                        int i19 = $$b;
                        Object[] objArr16 = new Object[1];
                        d(b7, (byte) (i19 | 48), (short) (i19 | 162), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionType, i18, iLastIndexOf, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cResolveSize = (char) View.resolveSize(0, 0);
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 1031;
                        int iIndexOf = 15 - TextUtils.indexOf("", "", 0);
                        byte b8 = $$a[10];
                        byte b9 = (byte) ($$b | 48);
                        Object[] objArr17 = new Object[1];
                        d(b8, b9, (short) (b9 | 10), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cResolveSize, capsMode, iIndexOf, 1357589585, false, (String) objArr17[0], null);
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 == null) {
                throw null;
            }
            int i20 = f782a;
            int i21 = i20 + 19;
            b = i21 % 128;
            int i22 = i21 % 2;
            int i23 = i20 + 75;
            b = i23 % 128;
            int i24 = i23 % 2;
            while (i4 < strArr2.length) {
                int i25 = b + 1;
                f782a = i25 % 128;
                if (i25 % 2 == 0) {
                    arrayList.add(strArr2[i4]);
                    i4 += 103;
                } else {
                    arrayList.add(strArr2[i4]);
                    i4++;
                }
            }
            throw null;
        }
        int i26 = b + 79;
        f782a = i26 % 128;
        int i27 = i26 % 2;
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i28 = ((int[]) objArr[2])[0];
        int i29 = ((int[]) objArr[3])[0];
        int i30 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i31 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 148771069;
        int i32 = ~i31;
        int i33 = (~((-766524900) | i32)) | 220205153;
        int i34 = ~(i31 | 1068564475);
        int i35 = i28 + 14024302 + ((i33 | i34) * (-713)) + (i34 * 1426) + ((~(522244729 | i32)) * 713);
        int i36 = i35 ^ (i35 << 13);
        int i37 = i36 ^ (i36 >>> 17);
        ((int[]) objArr18[2])[0] = i37 ^ (i37 << 5);
        int i38 = b + 71;
        f782a = i38 % 128;
        if (i38 % 2 == 0) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char scrollBarSize2 = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 29944);
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1755;
                int longPressTimeout = 23 - (ViewConfiguration.getLongPressTimeout() >> 16);
                Object[] objArr19 = new Object[1];
                d($$a[10], (byte) ($$b | 33), (short) 203, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(scrollBarSize2, threadPriority, longPressTimeout, 986134021, false, (String) objArr19[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null);
            obj.hashCode();
            throw null;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
            char deadChar = (char) (29944 - KeyEvent.getDeadChar(0, 0));
            int i39 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
            int i40 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22;
            Object[] objArr20 = new Object[1];
            d($$a[10], (byte) ($$b | 33), (short) 203, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(deadChar, i39, i40, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cAxisFromString = (char) (29943 - MotionEvent.axisFromString(""));
                int i41 = 1755 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int i42 = 24 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                byte b10 = $$a[10];
                int i43 = $$b;
                Object[] objArr21 = new Object[1];
                d(b10, (byte) (i43 | 48), (short) (i43 | 162), objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cAxisFromString, i41, i42, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i44 = ((((~((~iFreeMemory) | 1020542842)) * 130) - 1872531377) + (((~(iFreeMemory | 1020542842)) | 805314864) * 130)) - 1360098398;
            int i45 = (i44 << 13) ^ i44;
            int i46 = i45 ^ (i45 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0] = i46 ^ (i46 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            c(null, null, 127 - View.resolveSize(0, 0), new byte[]{-115, -116, -117, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            c(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, new byte[]{-116, -113, -109, -110, -111, -118, -126, -112, -119, -117, -114, -117, -122, -116, -113, -114}, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-1538585176};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b((char) (42049 - ((Process.getThreadPriority(0) + 20) >> 6)), 1725 - TextUtils.indexOf((CharSequence) "", '0'), 29 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).newInstance(objArr25), -1360098398);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 29944);
                int scrollBarSize3 = 1755 - (ViewConfiguration.getScrollBarSize() >> 8);
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 23;
                byte b11 = $$a[10];
                int i47 = $$b;
                Object[] objArr26 = new Object[1];
                d(b11, (byte) (i47 | 48), (short) (i47 | 162), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cResolveOpacity, scrollBarSize3, offsetAfter, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                c(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellDetailsTitle).substring(0, 7).length() + 120, new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                c(null, null, 127 - KeyEvent.keyCodeFromString(""), new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c4 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29943);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1756;
                    int iLastIndexOf2 = 22 - TextUtils.lastIndexOf("", '0', 0);
                    Object[] objArr29 = new Object[1];
                    d($$a[10], (byte) ($$b | 48), (short) 114, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c4, packedPositionChild, iLastIndexOf2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char c5 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29943);
                    int mode = View.MeasureSpec.getMode(0) + 1755;
                    int iIndexOf2 = 22 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    Object[] objArr30 = new Object[1];
                    d($$a[10], (byte) ($$b | 33), (short) 203, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c5, mode, iIndexOf2, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i48 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0];
        int i49 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0];
        if (i49 != i48) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4];
            if (strArr4 != null) {
                int i50 = f782a + 7;
                b = i50 % 128;
                for (int i51 = i50 % 2 == 0 ? 0 : 1; i51 < strArr4.length; i51++) {
                    arrayList2.add(strArr4[i51]);
                }
            }
            throw new RuntimeException(String.valueOf(i49));
        }
        int i52 = f782a + 67;
        b = i52 % 128;
        int i53 = i52 % 2;
        int i54 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i55 = ~iIdentityHashCode;
        int i56 = i54 + (((~((-200659220) | i55)) | (~((-11943207) | iIdentityHashCode)) | (~(i55 | 11943206))) * 959) + 1780505466 + (((~(iIdentityHashCode | 11943206)) | (~(i55 | (-11943207))) | (~((-200659220) | iIdentityHashCode))) * 959);
        int i57 = (i56 << 13) ^ i56;
        int i58 = i57 ^ (i57 >>> 17);
        ((int[]) objArr31[3])[0] = i58 ^ (i58 << 5);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        int i = 2 % 2;
        int i2 = f782a;
        int i3 = i2 + 63;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 21;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zznp
    public final void zzc(Intent intent) {
        int i = 2 % 2;
        int i2 = f782a + 107;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 92 / 0;
        }
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
    private static java.lang.String $$g(short r6, byte r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r8 = r8 + 67
            byte[] r0 = com.google.android.gms.measurement.AppMeasurementJobService.$$c
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r5 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r6]
        L24:
            int r3 = -r3
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurementJobService.$$g(short, byte, short):java.lang.String");
    }
}
