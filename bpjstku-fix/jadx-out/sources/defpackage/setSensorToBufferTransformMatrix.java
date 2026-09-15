package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setSensorToBufferTransformMatrix implements setViewPortCropRect {
    private static final byte[] $$l = {27, 65, -33, 120};
    private static final int $$m = 194;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {27, 65, -33, 120, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$h = 158;
    private static final byte[] $$a = {58, 66, -14, -31, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 36, 19, 4, 10, -8, 8, 0, -22, 22, 15, -11, 8, 0, 15, 0, 17, -34, 19, 4, 10, -8, 8, 0, -26, 39, -6, 11};
    private static final int $$b = 15;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int b = 1;
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {-1050324021, -113240819, -1097290086, -1214618681, 1424108490, -1430920397, -1056288611, 1738272449, 968492246, -1212778387, 821958801, 1848347135, 943100450, -553437333, 200795339, 1109380344, -96052696, 874992764};

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 32
            int r7 = 35 - r7
            byte[] r0 = defpackage.setSensorToBufferTransformMatrix.$$a
            int r9 = r9 * 6
            int r9 = r9 + 97
            int r8 = r8 * 19
            int r8 = r8 + 14
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r5 = r2
            goto L30
        L16:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L1a:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L30:
            int r7 = r7 + r9
            int r7 = r7 + (-2)
            r9 = r3
            r3 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setSensorToBufferTransformMatrix.e(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 52
            int r5 = 56 - r5
            byte[] r0 = defpackage.setSensorToBufferTransformMatrix.$$g
            int r7 = 103 - r7
            int r6 = r6 * 52
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r5]
        L28:
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setSensorToBufferTransformMatrix.f(int, byte, byte, java.lang.Object[]):void");
    }

    private static void g(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        char c = '0';
        int i3 = -1870535734;
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 87;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i5] = Integer.valueOf(iArr2[i6]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) i5;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), 3290 - TextUtils.lastIndexOf("", c), 31 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1948206109, false, $$n(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        iArr3[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i6 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), 3291 - Color.blue(0), 31 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1948206109, false, $$n(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i6++;
                }
                int i8 = $10 + 17;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                c = '0';
                i3 = -1870535734;
                i5 = 0;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                try {
                    Object[] objArr4 = new Object[i4];
                    objArr4[0] = Integer.valueOf(iArr5[i10]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), 3291 - Color.blue(0), 31 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1948206109, false, $$n(b6, b7, b7), new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    i10++;
                    iArr5 = iArr5;
                    i4 = 1;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        char c2 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[c2] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i11 = 17;
            for (int i12 = 1; i11 > i12; i12 = 1) {
                int i13 = $11 + 13;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i11];
                    Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), 2559 - Gravity.getAbsoluteGravity(0, 0), 29 - Color.red(0), 683220507, false, $$n(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i11 += 15;
                } else {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i11];
                    Object[] objArr6 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ((Process.getThreadPriority(0) + 20) >> 6) + 2559, TextUtils.lastIndexOf("", '0', 0, 0) + 30, 683220507, false, $$n(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                    i11--;
                }
            }
            int i14 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i15 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr7 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 28879), 347 - MotionEvent.axisFromString(""), TextUtils.getCapsMode("", 0, 0) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            int i16 = $11 + 5;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            c2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // defpackage.setViewPortCropRect
    public void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, Glide glide, Registry registry) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0433 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0553 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0553 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0378  */
    /* JADX WARN: Code duplicated, block: B:41:0x0386  */
    /* JADX WARN: Code duplicated, block: B:43:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:47:0x0408  */
    /* JADX WARN: Code duplicated, block: B:49:0x041b  */
    /* JADX WARN: Code duplicated, block: B:54:0x043c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0490  */
    /* JADX WARN: Code duplicated, block: B:61:0x04ee A[Catch: all -> 0x081c, TryCatch #0 {all -> 0x081c, blocks: (B:59:0x04d8, B:61:0x04ee, B:62:0x0538, B:78:0x05bc, B:80:0x05c9, B:81:0x0604, B:83:0x0622, B:85:0x066e), top: B:118:0x04d8 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0551  */
    /* JADX WARN: Code duplicated, block: B:98:0x076f  */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) throws Throwable {
        int i;
        boolean z;
        int i2;
        String string;
        int i3;
        int i4;
        int i5;
        Object obj;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i9;
        int i10;
        int i11;
        int i12;
        Object obj2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i13;
        int i14 = 2;
        int i15 = 2 % 2;
        byte[] bArr = $$a;
        byte b2 = bArr[13];
        Object[] objArr = new Object[1];
        e(b2, b2, bArr[28], objArr);
        int i16 = 0;
        Class<?> cls = Class.forName((String) objArr[0]);
        byte b3 = bArr[28];
        Object[] objArr2 = new Object[1];
        e(b3, b3, bArr[13], objArr2);
        Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
        byte b4 = bArr[28];
        Object[] objArr3 = new Object[1];
        e(b4, b4, bArr[13], objArr3);
        String str = (String) objArr3[0];
        int i17 = b;
        int i18 = (i17 ^ 111) + ((i17 & 111) << 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
        int i19 = i18 % 2;
        Class<?> cls3 = Integer.TYPE;
        int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
        b = i20 % 128;
        int i21 = i20 % 2;
        Method[] methodArr = {cls.getMethod((String) objArr2[0], String.class, Integer.TYPE), cls2.getMethod(str, String.class, cls3)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char c = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int offsetBefore = 2823 - TextUtils.getOffsetBefore("", 0);
            int i22 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21;
            byte[] bArr2 = $$g;
            Object[] objArr4 = new Object[1];
            f((byte) (-bArr2[5]), bArr2[7], bArr2[54], objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, offsetBefore, i22, 1814927978, false, (String) objArr4[0], null);
        }
        char c2 = '0';
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Gravity.getAbsoluteGravity(0, 0), 2823 - (ViewConfiguration.getEdgeSlop() >> 16), View.resolveSizeAndState(0, 0, 0) + 22)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i23 = 0;
            while (i23 < length) {
                Method method = declaredMethods[i23];
                int i24 = b;
                int i25 = ((i24 | 123) << 1) - (i24 ^ 123);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i25 % 128;
                int i26 = i25 % i14;
                try {
                    int i27 = -((byte) KeyEvent.getModifierMetaStateMask());
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i28 = i27 * (-167);
                    int i29 = ((i28 | (-3841)) << 1) - (i28 ^ (-3841));
                    int i30 = ~i27;
                    int i31 = ~((i30 ^ (-24)) | (i30 & (-24)));
                    int i32 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i33 = ~(((-24) ^ i32) | ((-24) & i32));
                    int i34 = i29 + (((i31 ^ i33) | (i33 & i31)) * 168);
                    int i35 = i30 | (-24);
                    int i36 = (i34 - (~(-(-((~((i35 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i35 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2))) * 168))))) - 1;
                    int i37 = ~i27;
                    int i38 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i39 = ~((i37 ^ i38) | (i37 & i38));
                    int i40 = ~((i30 & 23) | (i30 ^ 23));
                    int i41 = (i40 & i39) | (i39 ^ i40);
                    int i42 = ~(((-24) & i27) | ((-24) ^ i27) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    int i43 = ((i41 & i42) | (i41 ^ i42)) * 168;
                    int i44 = (i36 ^ i43) + ((i43 & i36) << 1);
                    Object[] objArr5 = new Object[1];
                    g(new int[]{-1755764376, -803589358, 1375321134, 99477475, 1062168386, -210016185, -412135791, 1588536168, -877230773, 1021492114, 498127764, 1113893828, 1406686830, -1564249713}, i44, objArr5);
                    Class<?> cls4 = Class.forName((String) objArr5[i16]);
                    Object[] objArr6 = new Object[1];
                    g(new int[]{-313609021, 1175476193, -1420858396, -1690347405, -1858055799, 1742592123, -1565014373, 212089984}, TextUtils.lastIndexOf("", c2) + 13, objArr6);
                    Object[] objArr7 = new Object[1];
                    objArr7[i16] = Integer.valueOf(((Integer) cls4.getMethod((String) objArr6[i16], null).invoke(method, null)).intValue());
                    int i45 = -(ViewConfiguration.getTapTimeout() >> 16);
                    int i46 = ((i45 | 26) << 1) - (i45 ^ 26);
                    Object[] objArr8 = new Object[1];
                    g(new int[]{-1090721103, -524134704, -445408487, -30585499, -987743824, -38910243, 348543860, -1465089740, -1905313568, -1573899346, -1243260289, -982391556, -933278989, 944423346, -86941355, -605590454}, i46, objArr8);
                    Class<?> cls5 = Class.forName((String) objArr8[i16]);
                    Object[] objArr9 = new Object[1];
                    g(new int[]{327989269, -1969102316, -1425791397, 1084643637, 1300456584, 705222020}, 7 - (~ExpandableListView.getPackedPositionType(0L)), objArr9);
                    String str2 = (String) objArr9[i16];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i16] = Integer.TYPE;
                    if (((Boolean) cls5.getMethod(str2, clsArr).invoke(null, objArr7)).booleanValue()) {
                        int i47 = b;
                        int i48 = ((i47 | 115) << 1) - (i47 ^ 115);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i48 % 128;
                        int i49 = i48 % 2;
                        Class cls6 = Long.TYPE;
                        int capsMode = TextUtils.getCapsMode("", i16, i16);
                        int i50 = (capsMode ^ 24) + ((capsMode & 24) << 1);
                        Object[] objArr10 = new Object[1];
                        g(new int[]{-1755764376, -803589358, 1375321134, 99477475, 1062168386, -210016185, -412135791, 1588536168, -877230773, 1021492114, 498127764, 1113893828, 1406686830, -1564249713}, i50, objArr10);
                        Class<?> cls7 = Class.forName((String) objArr10[i16]);
                        int i51 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i52 = i51 * (-575);
                        int i53 = (i52 ^ (-6900)) + ((i52 & (-6900)) << 1);
                        int i54 = ~i51;
                        int i55 = ~((i54 ^ (-13)) | (i54 & (-13)));
                        int i56 = ~(((-13) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-13) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i57 = (i53 - (~(-(-(((i55 ^ i56) | (i56 & i55)) * 576))))) - 1;
                        int i58 = ~((i54 ^ 12) | (i54 & 12));
                        int i59 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i60 = ((-13) & i59) | ((-13) ^ i59);
                        int i61 = ~((i51 & i60) | (i60 ^ i51));
                        int i62 = ((i58 & i61) | (i58 ^ i61)) * 576;
                        int i63 = (i57 & i62) + (i62 | i57);
                        int i64 = -(-((~((i54 ^ (-13)) | (i54 & (-13)))) * 576));
                        int i65 = (i63 & i64) + (i64 | i63);
                        Object[] objArr11 = new Object[1];
                        g(new int[]{1678924649, 446745606, -1705269532, 1925318870, 1095688178, 765736459, 1393732018, 1688260978, -1567372076, -110054775}, i65, objArr11);
                        if (cls6.equals(cls7.getMethod((String) objArr11[0], null).invoke(method, null))) {
                            int i66 = b;
                            int i67 = ((i66 | 23) << 1) - (i66 ^ 23);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i67 % 128;
                            if (i67 % 2 != 0) {
                                Object[] objArr12 = new Object[1];
                                g(new int[]{-1755764376, -803589358, 1375321134, 99477475, 1062168386, -210016185, -412135791, 1588536168, -877230773, 1021492114, 498127764, 1113893828, 1406686830, -1564249713}, TextUtils.getCapsMode("", 1, 1) * 97, objArr12);
                                obj = objArr12[0];
                            } else {
                                int i68 = -TextUtils.getCapsMode("", 0, 0);
                                int i69 = (i68 & 24) + (i68 | 24);
                                Object[] objArr13 = new Object[1];
                                g(new int[]{-1755764376, -803589358, 1375321134, 99477475, 1062168386, -210016185, -412135791, 1588536168, -877230773, 1021492114, 498127764, 1113893828, 1406686830, -1564249713}, i69, objArr13);
                                obj = objArr13[0];
                            }
                            Class<?> cls8 = Class.forName((String) obj);
                            int[] iArr2 = {319135000, 212275962, 296984929, 877404596, 1086700309, 140726094, 1299288182, 1792491165, -119408952, 851582448, -1885559074, -617886196};
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i70 = -(-(iLastIndexOf * 530));
                            int i71 = (i70 & 1058) + (i70 | 1058) + 9540;
                            int i72 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                            int i73 = b;
                            int i74 = (i73 ^ 67) + ((i73 & 67) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i74 % 128;
                            if (i74 % 2 != 0) {
                                i6 = i71 * (529 >> ((~((i72 & iLastIndexOf) | (i72 ^ iLastIndexOf))) | (~((iLastIndexOf ^ 18) | (iLastIndexOf & 18)))));
                            } else {
                                int i75 = ~((i72 & iLastIndexOf) | (i72 ^ iLastIndexOf));
                                int i76 = ~(iLastIndexOf | 18);
                                int i77 = ((i75 & i76) | (i75 ^ i76)) * 529;
                                i6 = (i71 & i77) + (i77 | i71);
                            }
                            int i78 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault4 | iLastIndexOf);
                            int i79 = i6 + (529 * ((i78 & (-19)) | ((-19) ^ i78)));
                            Object[] objArr14 = new Object[1];
                            g(iArr2, i79, objArr14);
                            String str3 = (String) objArr14[0];
                            int i80 = b;
                            int i81 = (i80 & 121) + (i80 | 121);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i81 % 128;
                            int i82 = i81 % 2;
                            Object[] objArr15 = (Object[]) cls8.getMethod(str3, null).invoke(method, null);
                            int i83 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
                            b = i83 % 128;
                            if (i83 % 2 == 0) {
                                if (objArr15.length != 4) {
                                    continue;
                                } else if (!Long.TYPE.equals(objArr15[0])) {
                                    continue;
                                } else {
                                    iArr = new int[]{-1755764376, -803589358, 1375321134, 99477475, 1062168386, -210016185, -412135791, 1588536168, -877230773, 1021492114, 498127764, 1113893828, 1406686830, -1564249713};
                                    i7 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                                    i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
                                    b = i8 % 128;
                                    if (i8 % 2 == 0) {
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        i9 = (-500) << i7;
                                    } else {
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        i9 = i7 * (-500);
                                    }
                                    int i84 = (i9 & (-11500)) + (i9 | (-11500));
                                    int i85 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i86 = ((i85 | 33) << 1) - (i85 ^ 33);
                                    b = i86 % 128;
                                    int i87 = i86 % 2;
                                    int i88 = ((-24) | i7) ^ (-1);
                                    int i89 = ~i7;
                                    int i90 = (i89 ^ 23) | (i89 & 23);
                                    int i91 = ~((i90 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i90 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                    int i92 = (i88 ^ i91) | (i88 & i91);
                                    int i93 = i85 + 21;
                                    int i94 = i93 % 128;
                                    b = i94;
                                    int i95 = i93 % 2;
                                    int i96 = -(-(TypedValues.PositionType.TYPE_TRANSITION_EASING * i92));
                                    i10 = (i84 & i96) + (i96 | i84) + ((~(i89 | (-24))) * 1002);
                                    int i97 = ~i7;
                                    int i98 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i99 = (i97 & i98) | (i97 ^ i98);
                                    int i100 = i94 + 29;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i100 % 128;
                                    i11 = i100 % 2;
                                    i12 = ~((i99 & 23) | (i99 ^ 23));
                                    if (i11 != 0) {
                                        Object[] objArr16 = new Object[1];
                                        g(iArr, i10 >>> (TypedValues.PositionType.TYPE_TRANSITION_EASING >>> i12), objArr16);
                                        obj2 = objArr16[0];
                                    } else {
                                        int i101 = -(-(i12 * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                        int i102 = (i10 & i101) + (i101 | i10);
                                        Object[] objArr17 = new Object[1];
                                        g(iArr, i102, objArr17);
                                        obj2 = objArr17[0];
                                    }
                                    if (Class.forName((String) obj2).equals(objArr15[1])) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                            int touchSlop = 2823 - (ViewConfiguration.getTouchSlop() >> 8);
                                            int threadPriority = 22 - ((Process.getThreadPriority(0) + 20) >> 6);
                                            byte[] bArr3 = $$g;
                                            Object[] objArr18 = new Object[1];
                                            f((byte) (-bArr3[5]), bArr3[7], bArr3[54], objArr18);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, touchSlop, threadPriority, 1814927978, false, (String) objArr18[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                                            int iResolveSizeAndState = 2823 - View.resolveSizeAndState(0, 0, 0);
                                            int iBlue = 22 - Color.blue(0);
                                            byte[] bArr4 = $$g;
                                            Object[] objArr19 = new Object[1];
                                            f((byte) (-bArr4[5]), bArr4[7], bArr4[54], objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, iResolveSizeAndState, iBlue, 1814927978, false, (String) objArr19[0], null);
                                        }
                                        try {
                                            Object[] objArr20 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char c3 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                                                int iRed = Color.red(0) + 2823;
                                                int iLastIndexOf2 = 21 - TextUtils.lastIndexOf("", '0', 0, 0);
                                                byte[] bArr5 = $$g;
                                                byte b5 = bArr5[7];
                                                Object[] objArr21 = new Object[1];
                                                f(b5, (byte) (-bArr5[5]), b5, objArr21);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, iRed, iLastIndexOf2, -2137287382, false, (String) objArr21[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr20)).longValue();
                                            i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
                                            b = i13 % 128;
                                            if (i13 % 2 == 0) {
                                                break;
                                            }
                                            throw null;
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            } else if (objArr15.length != 2) {
                                continue;
                            } else if (!Long.TYPE.equals(objArr15[0])) {
                                continue;
                            } else {
                                iArr = new int[]{-1755764376, -803589358, 1375321134, 99477475, 1062168386, -210016185, -412135791, 1588536168, -877230773, 1021492114, 498127764, 1113893828, 1406686830, -1564249713};
                                i7 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                                i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
                                b = i8 % 128;
                                if (i8 % 2 == 0) {
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    i9 = (-500) << i7;
                                } else {
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    i9 = i7 * (-500);
                                }
                                int i810 = (i9 & (-11500)) + (i9 | (-11500));
                                int i811 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i812 = ((i811 | 33) << 1) - (i811 ^ 33);
                                b = i812 % 128;
                                int i813 = i812 % 2;
                                int i814 = ((-24) | i7) ^ (-1);
                                int i815 = ~i7;
                                int i910 = (i815 ^ 23) | (i815 & 23);
                                int i911 = ~((i910 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i910 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                int i912 = (i814 ^ i911) | (i814 & i911);
                                int i913 = i811 + 21;
                                int i914 = i913 % 128;
                                b = i914;
                                int i915 = i913 % 2;
                                int i916 = -(-(TypedValues.PositionType.TYPE_TRANSITION_EASING * i912));
                                i10 = (i810 & i916) + (i916 | i810) + ((~(i815 | (-24))) * 1002);
                                int i917 = ~i7;
                                int i918 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i919 = (i917 & i918) | (i917 ^ i918);
                                int i103 = i914 + 29;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i103 % 128;
                                i11 = i103 % 2;
                                i12 = ~((i919 & 23) | (i919 ^ 23));
                                if (i11 != 0) {
                                    Object[] objArr110 = new Object[1];
                                    g(iArr, i10 >>> (TypedValues.PositionType.TYPE_TRANSITION_EASING >>> i12), objArr110);
                                    obj2 = objArr110[0];
                                } else {
                                    int i104 = -(-(i12 * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                    int i105 = (i10 & i104) + (i104 | i10);
                                    Object[] objArr111 = new Object[1];
                                    g(iArr, i105, objArr111);
                                    obj2 = objArr111[0];
                                }
                                if (Class.forName((String) obj2).equals(objArr15[1])) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                        int touchSlop2 = 2823 - (ViewConfiguration.getTouchSlop() >> 8);
                                        int threadPriority2 = 22 - ((Process.getThreadPriority(0) + 20) >> 6);
                                        byte[] bArr6 = $$g;
                                        Object[] objArr112 = new Object[1];
                                        f((byte) (-bArr6[5]), bArr6[7], bArr6[54], objArr112);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity2, touchSlop2, threadPriority2, 1814927978, false, (String) objArr112[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                                        int iResolveSizeAndState2 = 2823 - View.resolveSizeAndState(0, 0, 0);
                                        int iBlue2 = 22 - Color.blue(0);
                                        byte[] bArr7 = $$g;
                                        Object[] objArr113 = new Object[1];
                                        f((byte) (-bArr7[5]), bArr7[7], bArr7[54], objArr113);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf2, iResolveSizeAndState2, iBlue2, 1814927978, false, (String) objArr113[0], null);
                                    }
                                    Object[] objArr22 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char c4 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                                        int iRed2 = Color.red(0) + 2823;
                                        int iLastIndexOf3 = 21 - TextUtils.lastIndexOf("", '0', 0, 0);
                                        byte[] bArr8 = $$g;
                                        byte b6 = bArr8[7];
                                        Object[] objArr23 = new Object[1];
                                        f(b6, (byte) (-bArr8[5]), b6, objArr23);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c4, iRed2, iLastIndexOf3, -2137287382, false, (String) objArr23[0], new Class[]{Long.TYPE, Method.class});
                                    }
                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr22)).longValue();
                                    i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
                                    b = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        break;
                                    }
                                    throw null;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    i23++;
                    i14 = 2;
                    i16 = 0;
                    c2 = '0';
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
            char cLastIndexOf3 = (char) (TextUtils.lastIndexOf("", '0') + 1);
            int i106 = 2824 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int iIndexOf = 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            byte[] bArr9 = $$g;
            Object[] objArr24 = new Object[1];
            f((byte) (-bArr9[5]), bArr9[7], bArr9[54], objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf3, i106, iIndexOf, 1814927978, false, (String) objArr24[0], null);
        }
        Object[] objArr25 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2823;
            int iResolveOpacity = 22 - Drawable.resolveOpacity(0, 0);
            byte[] bArr10 = $$g;
            byte b7 = bArr10[7];
            byte b8 = (byte) (-bArr10[5]);
            Object[] objArr26 = new Object[1];
            f(b7, b8, (byte) (b8 + 4), objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec, maximumDrawingCacheSize, iResolveOpacity, 1025296417, false, (String) objArr26[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr25);
        Object[] objArr27 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 37658);
            int mirror = 2768 - AndroidCharacter.getMirror('0');
            int iAlpha = Color.alpha(0) + 19;
            byte[] bArr11 = $$g;
            byte b9 = bArr11[7];
            byte b10 = (byte) (-bArr11[5]);
            Object[] objArr28 = new Object[1];
            f(b9, b10, (byte) (b10 + 4), objArr28);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(modifierMetaStateMask, mirror, iAlpha, -1568796068, false, (String) objArr28[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr27)).longValue();
        long j = -1494461191;
        long j2 = -272;
        long j3 = -1;
        long j4 = j ^ j3;
        long elapsedCpuTime = (int) Process.getElapsedCpuTime();
        long j5 = (((long) 273) * j) + (((long) (-271)) * jLongValue) + (((((j4 | (jLongValue ^ j3)) | (elapsedCpuTime ^ j3)) ^ j3) | (((j | jLongValue) | elapsedCpuTime) ^ j3)) * j2) + (j2 * (((j4 | jLongValue) ^ j3) | ((j4 | elapsedCpuTime) ^ j3))) + (((long) 272) * (((j | elapsedCpuTime) ^ j3) | jLongValue)) + ((long) (-315944654));
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i107 = ~iFreeMemory;
        int i108 = ((int) (j5 >> 32)) & (303271658 + (((~(i107 | (-867894292))) | 848954369 | (~(2008786515 | iFreeMemory))) * 717) + (((~(iFreeMemory | (-867894292))) | (~(i107 | 2008786515)) | 848954369) * 717));
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i109 = i108 | (((int) j5) & (1660495958 + (((~((-308695171) | (~iUptimeMillis))) | 1745921580) * (-591)) + ((iUptimeMillis | (-308695171)) * 591)));
        int i110 = i109 >>> 24;
        int i111 = i109 & ViewCompat.MEASURED_SIZE_MASK;
        if (i110 != 0) {
            int i112 = b + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i112 % 128;
            i = 2;
            int i113 = i112 % 2;
            z = true;
        } else {
            i = 2;
            int i114 = b;
            int i115 = (i114 & 13) + (i114 | 13);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i115 % 128;
            int i116 = i115 % 2;
            z = false;
        }
        if (z) {
            i2 = 1;
        } else {
            int i117 = b + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i117 % 128;
            int i118 = i117 % i;
            i2 = 0;
        }
        if (!z || i111 >= i) {
            string = null;
        } else {
            int i119 = b;
            int i120 = (i119 ^ 57) + ((i119 & 57) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i120 % 128;
            int i121 = i120 % i;
            Method method2 = methodArr[i111];
            if (method2 != null) {
                string = method2.toString();
                int i122 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i123 = (i122 ^ 77) + ((i122 & 77) << 1);
                b = i123 % 128;
                int i124 = i123 % 2;
            } else {
                string = null;
            }
        }
        list.add(string);
        int i125 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i126 = (i125 & 123) + (i125 | 123);
        b = i126 % 128;
        int i127 = i126 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (i127 == 0) {
            i3 = 399 >>> i110;
            i4 = 6;
        } else {
            i3 = i110 * 399;
            i4 = 2394;
        }
        int i128 = -(-i3);
        int i129 = (i4 ^ i128) + ((i128 & i4) << 1);
        int i130 = ~(((-7) & i110) | ((-7) ^ i110));
        int i131 = ~i110;
        int i132 = ~(i131 | 6);
        int i133 = (i130 & i132) | (i130 ^ i132);
        int i134 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
        int i135 = i134 % 128;
        b = i135;
        int i136 = i134 % 2;
        int i137 = ~((i131 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i131 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
        if (i136 == 0) {
            i5 = (i129 / (397 - (~((i133 & i137) | (i133 ^ i137))))) << ((-1194) % (i110 | 6));
        } else {
            int i138 = i129 + (((i133 & i137) | (i133 ^ i137)) * 398);
            int i139 = -(-((i110 | 6) * (-1194)));
            i5 = (i139 | i138) + (i138 & i139);
        }
        int i140 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | i131);
        int i141 = i135 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i141 % 128;
        int i142 = i141 % 2;
        int i143 = ~((i110 & (-7)) | ((-7) ^ i110));
        int i144 = (i140 & i143) | (i140 ^ i143);
        int i145 = ~((i131 ^ 6) | (i131 & 6));
        int i146 = (i135 & 107) + (i135 | 107);
        int i147 = i146 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i147;
        int i148 = 398 * (i144 | i145);
        int i149 = i146 % 2 != 0 ? (i5 << i148) << i2 : ((i5 & i148) + (i5 | i148)) * i2;
        int i150 = (i147 & 123) + (i147 | 123);
        b = i150 % 128;
        int i151 = i150 % 2;
        return i149;
    }

    private static String $$n(short s, short s2, short s3) {
        int i = s * 3;
        int i2 = (s2 * 56) + 66;
        byte[] bArr = $$l;
        int i3 = 3 - (s3 * 2);
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            int i5 = i3 + i;
            i3 = i3;
            i2 = i5;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == i) {
                return new String(bArr2, 0);
            }
            int i6 = i3 + 1;
            i3 = i6;
            i2 += bArr[i6];
        }
    }
}
