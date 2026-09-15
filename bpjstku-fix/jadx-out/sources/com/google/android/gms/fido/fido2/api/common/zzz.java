package com.google.android.gms.fido.fido2.api.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
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
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR;
    private static boolean TuitionPaymentFragmentbindingInflater1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;
    private final boolean zza;
    private static final byte[] $$c = {118, 35, -100, -35};
    private static final int $$d = 101;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {84, 10, 24, -102, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 122;
    private static int asBinder = 0;
    private static int d = 1;
    private static int asInterface = 1;

    public zzz(boolean z) {
        this.zza = ((Boolean) Preconditions.checkNotNull(Boolean.valueOf(z))).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 52
            int r7 = r7 + 4
            byte[] r0 = com.google.android.gms.fido.fido2.api.common.zzz.$$a
            int r5 = r5 * 14
            int r5 = r5 + 84
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = -1
            if (r0 != 0) goto L14
            r3 = r2
            r2 = r7
            goto L2d
        L14:
            r4 = r7
            r7 = r5
            r5 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r7
            r1[r2] = r3
            if (r2 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L27:
            r3 = r0[r5]
            r4 = r2
            r2 = r5
            r5 = r3
            r3 = r4
        L2d:
            int r5 = -r5
            int r7 = r7 + r5
            int r5 = r2 + 1
            int r7 = r7 + (-11)
            r2 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.zzz.a(short, byte, short, java.lang.Object[]):void");
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = asBinder + 13;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            objArr[1] = Boolean.valueOf(this.zza);
            iHashCode = Objects.hashCode(objArr);
        } else {
            iHashCode = Objects.hashCode(Boolean.valueOf(this.zza));
        }
        int i3 = asBinder + 99;
        d = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (obj instanceof zzz) {
            if (this.zza == ((zzz) obj).zza) {
                return true;
            }
            int i2 = d + 95;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = d + 109;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int length;
        char[] cArr3;
        int i2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (cArr4 != null) {
            int i4 = $11 + 79;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr4.length;
                cArr3 = new char[length];
                i2 = 1;
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i2])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - Color.alpha(0)), 2994 - Gravity.getAbsoluteGravity(0, 0), Color.alpha(0) + 17, 1182129903, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i2++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(b)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 43325), TextUtils.indexOf((CharSequence) "", '0') + 254, 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i5 = 33602;
        if (TuitionPaymentFragmentbindingInflater1) {
            int i6 = $10 + 115;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i8 = $11 + 93;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 / 0) >>> getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] % i] >>> iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33601 - Process.getGidForName("")), TextUtils.getTrimmedLength("") + 3085, View.resolveSizeAndState(0, 0, 0) + 26, -2146875848, false, $$e(b4, b5, (byte) (-b5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (i5 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3085, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 26, -2146875848, false, $$e(b6, b7, (byte) (-b7)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    i5 = 33602;
                }
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                int i9 = $11 + 31;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 3 / 4;
                }
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i11 = $10 + 103;
        $11 = i11 % 128;
        if (i11 % 2 == 0) {
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
            Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                byte b8 = (byte) 0;
                byte b9 = (byte) (b8 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 33602), 3085 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 26 - (ViewConfiguration.getScrollBarSize() >> 8), -2146875848, false, $$e(b8, b9, (byte) (-b9)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
            int doubleTapTimeout = 651 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int threadPriority = 44 - ((Process.getThreadPriority(0) + 20) >> 6);
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr3 = new Object[1];
            a(b3, (byte) (b3 | 52), b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, doubleTapTimeout, threadPriority, -459846511, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(null, null, 127 - View.resolveSizeAndState(0, 0, 0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(null, null, 126 - TextUtils.lastIndexOf("", '0'), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
            int i3 = 652 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int windowTouchSlop = 44 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            byte[] bArr = $$a;
            byte b4 = bArr[5];
            Object[] objArr6 = new Object[1];
            a(b4, bArr[7], b4, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(threadPriority2, i3, windowTouchSlop, -873460649, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = d + 51;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cGreen = (char) Color.green(0);
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 651;
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44;
                byte[] bArr2 = $$a;
                byte b5 = bArr2[7];
                Object[] objArr7 = new Object[1];
                a(b5, (byte) (b5 | 37), bArr2[5], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen, pressedStateDuration, minimumFlingVelocity, -1595579076, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[]{i ^ (i << 5)}};
            int i6 = ((int[]) objArr8[2])[0];
            int i7 = ((int[]) objArr8[0])[0];
            int i8 = (((-579038606) + (((~((-8414219) | i)) | (~((-4983409) | i))) * 69)) + ((((~((-246478224) | i)) | 238064005) | (~((-243047414) | i))) * (-69))) - 2066993240;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 1), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1609, 26 - (ViewConfiguration.getPressedStateDuration() >> 16), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr9 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -1896009816, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int fadingEdgeLength = 651 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iNormalizeMetaState = 44 - KeyEvent.normalizeMetaState(0);
                    byte[] bArr3 = $$a;
                    byte b6 = bArr3[5];
                    Object[] objArr10 = new Object[1];
                    a(b6, bArr3[7], b6, objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, fadingEdgeLength, iNormalizeMetaState, 2075921419, false, (String) objArr10[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getCapsMode("", 0, 0), View.MeasureSpec.getMode(0) + 695, MotionEvent.axisFromString("") + 99), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 63406), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 792, TextUtils.indexOf((CharSequence) "", '0', 0) + 84), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr11 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                    int mirror = 699 - AndroidCharacter.getMirror('0');
                    int i11 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44;
                    byte[] bArr4 = $$a;
                    byte b7 = bArr4[7];
                    Object[] objArr12 = new Object[1];
                    a(b7, (byte) (b7 | 37), bArr4[5], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveOpacity, mirror, i11, -1595579076, false, (String) objArr12[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr11);
                try {
                    Object[] objArr13 = new Object[1];
                    c(null, null, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr13);
                    Class<?> cls2 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    c(null, null, (-16777089) - Color.rgb(0, 0, 0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr14);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 651;
                        int absoluteGravity = 44 - Gravity.getAbsoluteGravity(0, 0);
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[5];
                        Object[] objArr15 = new Object[1];
                        a(b8, bArr5[7], b8, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, doubleTapTimeout2, absoluteGravity, -873460649, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cGreen2 = (char) Color.green(0);
                        int iRgb = (-16776565) - Color.rgb(0, 0, 0);
                        int trimmedLength = TextUtils.getTrimmedLength("") + 44;
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr16 = new Object[1];
                        a(b10, (byte) (b10 | 52), b9, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cGreen2, iRgb, trimmedLength, -459846511, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr11;
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
        int i12 = ((int[]) objArr[0])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 == i12) {
            objArr2 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i14 = ((int[]) objArr[3])[0];
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i17 = ~iIdentityHashCode;
            int i18 = i14 + ((((~(979296126 | i17)) | (~((-1327729) | iIdentityHashCode))) * 988) - 537900827) + (((~(iIdentityHashCode | 974537588)) | 4758538 | (~(i17 | (-1327729)))) * 988);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr2[3])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                int i21 = 0;
                while (i21 < strArr.length) {
                    arrayList.add(strArr[i21]);
                    i21++;
                    int i22 = d + 13;
                    asBinder = i22 % 128;
                    int i23 = i22 % 2;
                }
            }
            int[] iArr = new int[i13];
            int i24 = i13 - 1;
            iArr[i24] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i24) % 2) - 1], 1).show();
            Object[] objArr17 = {new int[]{i}, new String[0], new int[]{i}, new int[]{i ^ (i << 5)}};
            int i25 = ((int[]) objArr[3])[0];
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[0])[0];
            int i28 = ~((-79475278) | i);
            int i29 = ~i;
            int i30 = i25 + (-1140640479) + ((i28 | (~((-76044468) | i29))) * (-1808)) + (((~((-3449421) | i)) | (~(i29 | (-18611)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(i | 76044467)) | 76025857 | (~(79475277 | i29))) * TypedValues.Custom.TYPE_BOOLEAN);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            objArr2 = objArr17;
        }
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        boolean z = this.zza;
        int i33 = ((int[]) objArr2[3])[0];
        int i34 = i33 * i33;
        int i35 = -(1816599063 * i33);
        int i36 = (((i34 & i35) + (i34 | i35)) - (~(-(i33 * 431617935)))) - 1;
        int i37 = ((i36 | (-1155473943)) << 1) - ((-1155473943) ^ i36);
        int i38 = ((i37 >> 20) - 8191) / 4096;
        int i39 = ((i38 | 1) << 1) - (i38 ^ 1);
        int i40 = (i37 & i39) + (i39 | i37);
        int i41 = i37 >> 25;
        int i42 = (-(i40 ^ ((((i41 ^ (-255)) + ((i41 & (-255)) << 1)) / 128) + 1))) + 8;
        int i43 = ((i42 >> 16) - 131071) / 65536;
        int i44 = (i43 ^ 1) + ((i43 & 1) << 1);
        SafeParcelWriter.writeBoolean(parcel, 11928 / ((i42 & (-((i44 & 1) + (i44 | 1)))) * 1491), z);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        TuitionPaymentFragmentbindingInflater1();
        CREATOR = new zzaa();
        int i = asInterface + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new char[]{47221, 47208, 47218, 47204, 47207, 47213, 47144, 47203, 47171, 47261, 47202, 47217, 47209, 47187, 47210, 47219, 47211, 47206, 47172};
        b = 2047719446;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        TuitionPaymentFragmentbindingInflater1 = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, int r7, byte r8) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r8 = 68 - r8
            byte[] r1 = com.google.android.gms.fido.fido2.api.common.zzz.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L20:
            int r7 = r7 + 1
            r3 = r1[r7]
            r5 = r3
            r3 = r8
            r8 = r5
        L27:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.zzz.$$e(int, int, byte):java.lang.String");
    }
}
