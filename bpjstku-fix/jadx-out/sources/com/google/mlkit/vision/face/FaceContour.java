package com.google.mlkit.vision.face;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class FaceContour {
    public static final int FACE = 1;
    public static final int LEFT_CHEEK = 14;
    public static final int LEFT_EYE = 6;
    public static final int LEFT_EYEBROW_BOTTOM = 3;
    public static final int LEFT_EYEBROW_TOP = 2;
    public static final int LOWER_LIP_BOTTOM = 11;
    public static final int LOWER_LIP_TOP = 10;
    public static final int NOSE_BOTTOM = 13;
    public static final int NOSE_BRIDGE = 12;
    public static final int RIGHT_CHEEK = 15;
    public static final int RIGHT_EYE = 7;
    public static final int RIGHT_EYEBROW_BOTTOM = 5;
    public static final int RIGHT_EYEBROW_TOP = 4;
    public static final int UPPER_LIP_BOTTOM = 9;
    public static final int UPPER_LIP_TOP = 8;
    private final int zza;
    private final List zzb;
    private static final byte[] $$c = {89, 92, -72, 43};
    private static final int $$f = 141;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {43, 23, 22, -14, 40, 13, 8, 11, -5, 9, -3, 24, 7, -23, 44, 27, -1, 23, -3, 21, 15, -43, 47, 20, 7, 6, -1, 34, -34, 44, -1, 11, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
    private static final int $$e = 134;
    private static final byte[] $$a = {42, -104, -68, 105, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 137;
    private static int b = 0;
    private static int d = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {47375, 47362, 47372, 47422, 47361, 47367, 47298, 47421, 47389, 47415, 47420, 47371, 47363, 47341, 47364, 47373, 47365, 47360, 47390, 47343, 47418, 47388, 47368, 47419, 47366, 47369, 47336};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2047719600;
    private static boolean TuitionPaymentFragmentbindingInflater1 = true;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;

    /* JADX INFO: loaded from: classes5.dex */
    @Retention(RetentionPolicy.CLASS)
    public @interface ContourType {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = 103 - r8
            int r7 = r7 * 52
            int r7 = 55 - r7
            int r9 = r9 * 52
            int r9 = 53 - r9
            byte[] r0 = com.google.mlkit.vision.face.FaceContour.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r5 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L2c:
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.face.FaceContour.a(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 28
            int r5 = r5 + 4
            int r7 = r7 * 3
            int r7 = 84 - r7
            int r6 = r6 * 24
            int r0 = r6 + 29
            byte[] r1 = com.google.mlkit.vision.face.FaceContour.$$d
            byte[] r0 = new byte[r0]
            int r6 = r6 + 28
            r2 = -1
            if (r1 != 0) goto L18
            r3 = r7
            r7 = r5
            goto L2d
        L18:
            r4 = r7
            r7 = r5
            r5 = r4
        L1b:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r0[r2] = r3
            if (r2 != r6) goto L2b
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L2b:
            r3 = r1[r7]
        L2d:
            int r5 = r5 + r3
            int r5 = r5 + (-10)
            int r7 = r7 + 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.face.FaceContour.e(short, short, int, java.lang.Object[]):void");
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = d + 41;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            zzv zzvVarZza = zzw.zza("FaceContour");
            zzvVarZza.zzb("type", this.zza);
            zzvVarZza.zzc("points", this.zzb.toArray());
            return zzvVarZza.toString();
        }
        zzv zzvVarZza2 = zzw.zza("FaceContour");
        zzvVarZza2.zzb("type", this.zza);
        zzvVarZza2.zzc("points", this.zzb.toArray());
        zzvVarZza2.toString();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getFaceContourType() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char size = (char) View.MeasureSpec.getSize(0);
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
            int iResolveSizeAndState = 10 - View.resolveSizeAndState(0, 0, 0);
            byte b2 = $$a[5];
            byte b3 = (byte) (-b2);
            Object[] objArr2 = new Object[1];
            a(b3, (byte) (b3 + 4), (byte) (-b2), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, windowTouchSlop, iResolveSizeAndState, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(null, null, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(null, null, TextUtils.lastIndexOf("", '0', 0) + 128, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 876;
            int i2 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a((byte) (-bArr[5]), bArr[54], bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iNormalizeMetaState, i2, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iResolveSize = View.resolveSize(0, 0) + 876;
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 10;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[7];
                Object[] objArr6 = new Object[1];
                a(b4, b4, (byte) (-bArr2[5]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity, iResolveSize, iResolveOpacity, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iMyUid = Process.myUid();
            int i3 = ((((~((-805331329) | iMyUid)) | (-913014768)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1844861180) + ((~((~iMyUid) | (-805331329))) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 537743175;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(null, null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(null, null, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(null, null, 126 - MotionEvent.axisFromString(""), new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(null, null, TextUtils.indexOf((CharSequence) "", '0', 0) + 128, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 537743175};
                byte[] bArr3 = $$d;
                byte b5 = (byte) (bArr3[65] - 1);
                byte b6 = b5;
                Object[] objArr13 = new Object[1];
                e(b5, b6, b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr3[65];
                byte b8 = b7;
                Object[] objArr14 = new Object[1];
                e(b7, b8, (byte) (b8 - 1), objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char gidForName = (char) ((-1) - Process.getGidForName(""));
                        int gidForName2 = 875 - Process.getGidForName("");
                        int packedPositionGroup = 10 - ExpandableListView.getPackedPositionGroup(0L);
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[7];
                        Object[] objArr15 = new Object[1];
                        a(b9, b9, (byte) (-bArr4[5]), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(gidForName, gidForName2, packedPositionGroup, 256017550, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        c(null, null, 127 - (Process.myTid() >> 22), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        c(null, null, 127 - View.resolveSizeAndState(0, 0, 0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                            int iIndexOf = TextUtils.indexOf("", "") + 876;
                            int iRgb = (-16777206) - Color.rgb(0, 0, 0);
                            byte[] bArr5 = $$a;
                            Object[] objArr18 = new Object[1];
                            a((byte) (-bArr5[5]), bArr5[54], bArr5[7], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iIndexOf, iRgb, 2009631821, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int mirror = AndroidCharacter.getMirror('0') + 828;
                            int gidForName3 = Process.getGidForName("") + 11;
                            byte b10 = $$a[5];
                            byte b11 = (byte) (-b10);
                            Object[] objArr19 = new Object[1];
                            a(b11, (byte) (b11 + 4), (byte) (-b10), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize, mirror, gidForName3, 252381699, false, (String) objArr19[0], null);
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
        int i6 = ((int[]) objArr[2])[0];
        int i7 = ((int[]) objArr[0])[0];
        if (i7 == i6) {
            int i8 = d + 25;
            b = i8 % 128;
            int i9 = i8 % 2;
            int i10 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i11 = i10 + (-454980592) + (((-958534145) | iIdentityHashCode) * (-627)) + (((~(960183825 | iIdentityHashCode)) | 1000494054) * (-627)) + (((~(iIdentityHashCode | 1000494054)) | (~((~iIdentityHashCode) | (-960183826)))) * 627);
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr20[1])[0] = i13 ^ (i13 << 5);
            int i14 = d + 79;
            b = i14 % 128;
            int i15 = i14 % 2;
        } else {
            Toast.makeText((Context) null, i7 / (((i7 - 1) * i7) % 2), 0).show();
            int i16 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i17 = i16 + (-1958518636) + (((~((-855239334) | startElapsedRealtime)) | 811663392) * (-140)) + ((~((-43575942) | startElapsedRealtime)) * 70) + (((~(startElapsedRealtime | 895549562)) | (-127462112)) * 70);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr21[1])[0] = i19 ^ (i19 << 5);
        }
        return this.zza;
    }

    private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (cArr3 != null) {
            int i4 = $11 + 3;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 85;
                $11 = i7 % 128;
                if (i7 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31338 - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.getOffsetBefore("", 0) + 2994, (ViewConfiguration.getLongPressTimeout() >> 16) + 17, 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr4[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (31339 - View.combineMeasuredStates(0, 0)), TextUtils.lastIndexOf("", '0', 0, 0) + 2995, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 17, 1182129903, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    cArr4[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                }
                i6++;
                i2 = 2;
            }
            cArr3 = cArr4;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.rgb(0, 0, 0) + 16820541), 253 - View.MeasureSpec.getMode(0), ExpandableListView.getPackedPositionType(0L) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            if (!TuitionPaymentFragmentbindingInflater1) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - View.MeasureSpec.getMode(0)), 3085 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 26 - (KeyEvent.getMaxKeyCode() >> 16), -2146875848, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i8 = $10 + 19;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        } else {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        }
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
            try {
                Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33602), ((byte) KeyEvent.getModifierMetaStateMask()) + 3086, (ViewConfiguration.getLongPressTimeout() >> 16) + 26, -2146875848, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2);
    }

    public FaceContour(int i, List list) {
        this.zza = i;
        this.zzb = list;
    }

    public List<PointF> getPoints() {
        List<PointF> list;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 115;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            list = this.zzb;
            int i4 = 12 / 0;
        } else {
            list = this.zzb;
        }
        int i5 = i2 + 47;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, int r8) {
        /*
            int r6 = r6 * 2
            int r6 = 1 - r6
            int r8 = 68 - r8
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r0 = com.google.mlkit.vision.face.FaceContour.$$c
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.face.FaceContour.$$g(byte, int, int):java.lang.String");
    }
}
