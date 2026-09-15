package com.google.android.gms.signin.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.libraries.places.internal.zzpr;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
public final class zaf extends com.google.android.gms.internal.base.zaa implements IInterface {
    private static final byte[] $$a = {65, -122, -65, 2};
    private static final int $$b = 239;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int d = 0;
    private static int g = 1;
    private static long b = 1406111453581595681L;
    private static char TuitionPaymentFragmentbindingInflater1 = 35612;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 24817;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 25086;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 27691;

    zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void zae(int i) throws RemoteException {
        Parcel parcelZaa;
        int i2;
        int i3 = 2 % 2;
        int i4 = d + 117;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            parcelZaa = zaa();
            parcelZaa.writeInt(i);
            i2 = 6;
        } else {
            parcelZaa = zaa();
            parcelZaa.writeInt(i);
            i2 = 7;
        }
        zac(i2, parcelZaa);
        int i5 = d + 73;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
    }

    public final void zag(zai zaiVar, zae zaeVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = g + 95;
        d = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zac.zac(parcelZaa, zaiVar);
        com.google.android.gms.internal.base.zac.zad(parcelZaa, zaeVar);
        zac(12, parcelZaa);
        int i4 = d + 109;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void zaf(IAccountAccessor iAccountAccessor, int i, boolean z) throws RemoteException {
        Parcel parcelZaa;
        int i2;
        int i3 = 2 % 2;
        int i4 = g + 19;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            parcelZaa = zaa();
            com.google.android.gms.internal.base.zac.zad(parcelZaa, iAccountAccessor);
            parcelZaa.writeInt(i);
            parcelZaa.writeInt(z ? 1 : 0);
            i2 = 65;
        } else {
            parcelZaa = zaa();
            com.google.android.gms.internal.base.zac.zad(parcelZaa, iAccountAccessor);
            parcelZaa.writeInt(i);
            parcelZaa.writeInt(z ? 1 : 0);
            i2 = 9;
        }
        zac(i2, parcelZaa);
        int i5 = d + 121;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 87;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 2625, Drawable.resolveOpacity(0, 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() % (b + 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 39423), 481 - Color.green(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19472), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2624, 13 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (b ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - KeyEvent.getDeadChar(0, 0)), 481 - Color.red(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            int i6 = $11 + 95;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i8 = $10 + 53;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((Process.myPid() >> 22) + 39422), 481 - TextUtils.getOffsetAfter("", 0), 37 - View.resolveSizeAndState(0, 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
        int i10 = $10 + 75;
        $11 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i4 = 58224;
            int i5 = 0;
            while (i5 < 16) {
                int i6 = $10 + 109;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 47774);
                        int absoluteGravity = 468 - Gravity.getAbsoluteGravity(i3, i3);
                        int size = 13 - View.MeasureSpec.getSize(i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName, absoluteGravity, size, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i10 = i5;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 467, (ViewConfiguration.getEdgeSlop() >> 16) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5 = i10 + 1;
                    int i11 = $11 + 83;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
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
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.alpha(0), View.getDefaultSize(0, 0) + 2323, 44 - (ViewConfiguration.getEdgeSlop() >> 16), -1312321721, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, int i, int i2) {
        int i3;
        Class<?> cls;
        char[] cArr;
        int edgeSlop;
        int i4;
        int i5;
        int i6;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i7;
        String str;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Object obj;
        int i13 = 2 % 2;
        int i14 = d;
        int i15 = (i14 & 119) + (i14 | 119);
        g = i15 % 128;
        int i16 = i15 % 2;
        int i17 = 1;
        if (context != null) {
            try {
                char[] cArr2 = {32121, 38303, 44241, 51130, 57080, 61897, 2250, 9016, 14859, 19741, 25652, 32615, 38491, 44727, 49557, 55448, 62374, 2798, 7553, 13322, 20232, 26137, 31098, 36936, 43867, 50093, 56008, 60848, 1203, 8176, 14051};
                int i18 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int i19 = (i18 * 399) + 23790774;
                int i20 = ~i18;
                int i21 = (i20 ^ 59626) | (i20 & 59626);
                int i22 = ~i21;
                int i23 = ~((-59627) | i18);
                int i24 = (i22 ^ i23) | (i22 & i23);
                int i25 = ~(((-59627) ^ i) | ((-59627) & i));
                int i26 = ((i24 ^ i25) | (i24 & i25)) * 398;
                int i27 = (i19 & i26) + (i26 | i19) + (((i18 ^ 59626) | (i18 & 59626)) * (-1194));
                int i28 = ~i;
                int i29 = ((-59627) ^ i28) | ((-59627) & i28);
                int i30 = g;
                int i31 = (i30 & 85) + (i30 | 85);
                d = i31 % 128;
                if (i31 % 2 != 0) {
                    int i32 = ~i29;
                    int i33 = ~i21;
                    i3 = (i32 & i33) | (i32 ^ i33);
                    int i34 = 8 / 0;
                } else {
                    int i35 = ~i29;
                    int i36 = ~((~i18) | 59626);
                    i3 = (i35 & i36) | (i35 ^ i36);
                }
                int i37 = ~((i18 & (-59627)) | ((-59627) ^ i18));
                int i38 = (i27 - (~(-(-(((i37 & i3) | (i3 ^ i37)) * 398))))) - 1;
                Object[] objArr = new Object[1];
                a(cArr2, i38, objArr);
                String str2 = (String) objArr[0];
                int i39 = d;
                int i40 = ((i39 | 81) << 1) - (i39 ^ 81);
                g = i40 % 128;
                if (i40 % 2 == 0) {
                    int i41 = 4 / 3;
                }
                try {
                    Object[] objArr2 = {str2};
                    Object[] objArr3 = new Object[1];
                    a(new char[]{32080, 316, 34178, 2158, 36062, 4887, 38691, 7054, 40545, 8912, 41294, 9534, 43418, 11384, 45238, 14162, 47935, 16281, 49772, 18097, 50510, 18812, 52688, 20555, 54460, 23405, 57209, 25559, 58958, 27329, 59738, 27946, 61876, 29726, 63741, 32607, 807, 34741}, 31846 - (~(-KeyEvent.keyCodeFromString(""))), objArr3);
                    Class<?> cls2 = Class.forName((String) objArr3[0]);
                    Class<?>[] clsArr = new Class[1];
                    int i42 = g + 95;
                    d = i42 % 128;
                    int i43 = i42 % 2;
                    clsArr[0] = String.class;
                    Object objNewInstance = cls2.getDeclaredConstructor(clsArr).newInstance(objArr2);
                    char[] cArr3 = {32121, 9646, 52285, 29842, 8114, 50744, 28401, 4580, 47132, 24751, 3026, 45590, 23231, 64971, 42024, 19614, 63460, 40510, 18073, 59871, 36970, 14485, 58323, 35452, 12934, 54683, 31828, 9356, 53028, 30314, 7827};
                    int i44 = g + 119;
                    d = i44 % 128;
                    int i45 = i44 % 2;
                    Object[] objArr4 = new Object[1];
                    a(cArr3, 22696 - (~(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))), objArr4);
                    try {
                        Object[] objArr5 = {(String) objArr4[0]};
                        char[] cArr4 = {32080, 316, 34178, 2158, 36062, 4887, 38691, 7054, 40545, 8912, 41294, 9534, 43418, 11384, 45238, 14162, 47935, 16281, 49772, 18097, 50510, 18812, 52688, 20555, 54460, 23405, 57209, 25559, 58958, 27329, 59738, 27946, 61876, 29726, 63741, 32607, 807, 34741};
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L);
                        int i46 = g + 43;
                        int i47 = i46 % 128;
                        d = i47;
                        int i48 = i46 % 2;
                        int i49 = -packedPositionType;
                        int i50 = (i49 * 165) - 5191061;
                        int i51 = ~((i28 ^ 31847) | (i28 & 31847));
                        int i52 = -(-(((i51 & i49) | (i49 ^ i51)) * (-328)));
                        int i53 = ((i50 | i52) << 1) - (i52 ^ i50);
                        int i54 = ((i47 | 93) << 1) - (i47 ^ 93);
                        g = i54 % 128;
                        int i55 = i54 % 2;
                        int i56 = -(-(((i49 ^ i) | (i49 & i)) * 164));
                        int i57 = (i53 ^ i56) + ((i56 & i53) << 1);
                        int i58 = (~((~i49) | (-31848))) | (~(((-31848) & i) | ((-31848) ^ i)));
                        int i59 = ~i;
                        int i60 = (i49 & i59) | (i59 ^ i49);
                        int i61 = ~((i60 & 31847) | (i60 ^ 31847));
                        int i62 = (i57 - (~(-(-(((i58 & i61) | (i58 ^ i61)) * 164))))) - 1;
                        Object[] objArr6 = new Object[1];
                        a(cArr4, i62, objArr6);
                        Class<?> cls3 = Class.forName((String) objArr6[0]);
                        Class<?>[] clsArr2 = new Class[1];
                        int i63 = g;
                        int i64 = (i63 ^ 57) + ((i63 & 57) << 1);
                        d = i64 % 128;
                        int i65 = i64 % 2;
                        clsArr2[0] = String.class;
                        Object objNewInstance2 = cls3.getDeclaredConstructor(clsArr2).newInstance(objArr5);
                        try {
                            char[] cArr5 = {32091, 10493, 54796, 32179, 11249, 53534, 31912, 10891, 53265, 32676, 9678, 54029, 32435, 9409, 53872, 31219, 10217, 52588, 30902, 9925, 52331, 31647, 8648};
                            int i66 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                            int i67 = ((i66 | 21929) << 1) - (i66 ^ 21929);
                            int i68 = g + 65;
                            d = i68 % 128;
                            if (i68 % 2 != 0) {
                                Object[] objArr7 = new Object[1];
                                a(cArr5, i67, objArr7);
                                cls = Class.forName((String) objArr7[0]);
                                cArr = new char[]{33331, 34705, 50416, 19033, 58064, 50862, 18223, Typography.amp, 23433, 63955, 23827, 59525, 57620, 46243, 11469, 34647, 28846, 42474, 52733, 9126};
                                edgeSlop = ViewConfiguration.getEdgeSlop();
                                i4 = 99;
                            } else {
                                Object[] objArr8 = new Object[1];
                                a(cArr5, i67, objArr8);
                                cls = Class.forName((String) objArr8[0]);
                                cArr = new char[]{33331, 34705, 50416, 19033, 58064, 50862, 18223, Typography.amp, 23433, 63955, 23827, 59525, 57620, 46243, 11469, 34647, 28846, 42474, 52733, 9126};
                                edgeSlop = ViewConfiguration.getEdgeSlop();
                                i4 = 17;
                            }
                            int i69 = -(edgeSlop >> 16);
                            int i70 = (i4 & i69) + (i69 | i4);
                            Object[] objArr9 = new Object[1];
                            c(cArr, i70, objArr9);
                            Object objInvoke = cls.getMethod((String) objArr9[0], null).invoke(context, null);
                            try {
                                int i71 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int i72 = (i71 * 69) - 1469243;
                                int i73 = ~i71;
                                int i74 = (~((i73 & (-21930)) | (i73 ^ (-21930)) | i59)) | (~((i71 ^ 21929) | (i71 & 21929)));
                                int i75 = ~((i ^ 21929) | (i & 21929));
                                int i76 = ((i74 & i75) | (i74 ^ i75)) * (-68);
                                int i77 = (i72 ^ i76) + ((i76 & i72) << 1);
                                int i78 = (~((i73 ^ i28) | (i73 & i28) | 21929)) * (-68);
                                int i79 = (i77 ^ i78) + ((i78 & i77) << 1);
                                int i80 = ~i71;
                                int i81 = ~(((-21930) & i59) | ((-21930) ^ i59));
                                int i82 = ((i80 & i81) | (i80 ^ i81)) * 68;
                                int i83 = (i79 & i82) + (i82 | i79);
                                Object[] objArr10 = new Object[1];
                                a(new char[]{32091, 10493, 54796, 32179, 11249, 53534, 31912, 10891, 53265, 32676, 9678, 54029, 32435, 9409, 53872, 31219, 10217, 52588, 30902, 9925, 52331, 31647, 8648}, i83, objArr10);
                                Class<?> cls4 = Class.forName((String) objArr10[0]);
                                int i84 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                int i85 = (i84 ^ 58991) + ((i84 & 58991) << 1);
                                Object[] objArr11 = new Object[1];
                                a(new char[]{32093, 39728, 45456, 52775, 58599, 64882, 7115, 12370, 20005, 25784, 32034, 39838, 45155, 52988}, i85, objArr11);
                                try {
                                    Object[] objArr12 = {cls4.getMethod((String) objArr11[0], null).invoke(context, null), 64};
                                    char[] cArr6 = {32091, 43695, 53928, 64185, 8889, 19124, 29372, 39625, 49793, 60038, 4762, 14983, 25243, 35563, 45812, 55969, 762, 11004, 21170, 31435, 41671, 51918, 62147, 6870, 17109, 27356, 37385, 47650, 57888, 2612, 12855, 23098, 33320};
                                    int maxKeyCode = KeyEvent.getMaxKeyCode();
                                    int i86 = d + 39;
                                    g = i86 % 128;
                                    int i87 = i86 % 2;
                                    int i88 = maxKeyCode >> 16;
                                    int i89 = ((55291 | i88) << 1) - (i88 ^ 55291);
                                    Object[] objArr13 = new Object[1];
                                    a(cArr6, i89, objArr13);
                                    Class<?> cls5 = Class.forName((String) objArr13[0]);
                                    char[] cArr7 = {32093, 51032, 2368, 21375, 38215, 57210, 8571, 27498, 44389, 63328, 14645, 33561, 50440, 3854};
                                    int i90 = -Color.green(0);
                                    int i91 = g;
                                    int i92 = (i91 ^ 7) + ((i91 & 7) << 1);
                                    d = i92 % 128;
                                    if (i92 % 2 != 0) {
                                        int i93 = ~i90;
                                        i5 = (591 - i93) % 47033;
                                        i6 = (i93 ^ 47623) | (i93 & 47623);
                                    } else {
                                        int i94 = i90 * 592;
                                        i5 = (i94 ^ (-28097570)) + ((i94 & (-28097570)) << 1);
                                        i6 = (~i90) | 47623;
                                    }
                                    int i95 = -(-((~i6) * (-1182)));
                                    int i96 = (i5 ^ i95) + ((i95 & i5) << 1);
                                    int i97 = ~i90;
                                    int i98 = (-47624) | i97;
                                    Object[] objArr14 = new Object[1];
                                    a(cArr7, ((i96 + (((~((i90 ^ 47623) | (i90 & 47623))) | (~((i98 ^ i59) | (i98 & i59)))) * (-591))) - (~(((i | i97) | (-47624)) * 591))) - 1, objArr14);
                                    String str3 = (String) objArr14[0];
                                    int i99 = d;
                                    int i100 = (i99 ^ 67) + ((i99 & 67) << 1);
                                    g = i100 % 128;
                                    int i101 = i100 % 2;
                                    Object objInvoke2 = cls5.getMethod(str3, String.class, Integer.TYPE).invoke(objInvoke, objArr12);
                                    Object[] objArr15 = new Object[1];
                                    c(new char[]{61614, 16234, 36246, 37359, 51881, 49076, 15079, 13592, 59143, 57221, 52363, 21976, 2888, 15713, 23084, 46884, 61583, 19685, 48770, 55774, 24780, 27383, 12687, 46645, 61262, 19499, 21209, 17648, 34317, 42597, 44766, 36317}, 29 - TextUtils.indexOf((CharSequence) "", '0'), objArr15);
                                    Class<?> cls6 = Class.forName((String) objArr15[0]);
                                    int i102 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                    int i103 = ((i102 | 56149) << 1) - (i102 ^ 56149);
                                    Object[] objArr16 = new Object[1];
                                    a(new char[]{32073, 42502, 52215, 60587, 4111, 13799, 24241, 33307, 42999, 51380}, i103, objArr16);
                                    Object[] objArr17 = (Object[]) cls6.getField((String) objArr16[0]).get(objInvoke2);
                                    int length = objArr17.length;
                                    int i104 = 0;
                                    while (true) {
                                        if (i104 < length) {
                                            Object obj2 = objArr17[i104];
                                            char[] cArr8 = {32098, 55357, 14173, 37489, 59815};
                                            int i105 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                            int i106 = d;
                                            int i107 = ((i106 | 55) << i17) - (i106 ^ 55);
                                            g = i107 % 128;
                                            if (i107 % 2 == 0) {
                                                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                i7 = i105 + 399;
                                            } else {
                                                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                i7 = i105 * 399;
                                            }
                                            int i108 = (i7 & 16869720) + (i7 | 16869720);
                                            int i109 = ~i105;
                                            int i110 = ~((i109 ^ 42280) | (i109 & 42280));
                                            int i111 = ~(((-42281) ^ i105) | ((-42281) & i105));
                                            int i112 = i110 | i111;
                                            int i113 = ~(((-42281) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | ((-42281) & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                            int i114 = -(-(((i112 ^ i113) | (i113 & i112)) * 398));
                                            int i115 = (i108 & i114) + (i108 | i114) + (((i105 ^ 42280) | (i105 & 42280)) * (-1194));
                                            int i116 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            int i117 = ~(((-42281) & i116) | ((-42281) ^ i116));
                                            int i118 = g;
                                            Object[] objArr18 = objArr17;
                                            int i119 = i118 + 113;
                                            int i120 = length;
                                            d = i119 % 128;
                                            int i121 = i119 % 2;
                                            int i122 = ~i105;
                                            int i123 = ~((i122 & 42280) | (i122 ^ 42280));
                                            int i124 = (i123 & i117) | (i117 ^ i123);
                                            int i125 = i118 + 99;
                                            d = i125 % 128;
                                            int i126 = (i124 & i111) | (i124 ^ i111);
                                            if (i125 % 2 != 0) {
                                                Object[] objArr19 = new Object[1];
                                                a(cArr8, i115 >> (398 >>> i126), objArr19);
                                                str = (String) objArr19[0];
                                            } else {
                                                int i127 = i126 * 398;
                                                int i128 = (i115 & i127) + (i127 | i115);
                                                Object[] objArr20 = new Object[1];
                                                a(cArr8, i128, objArr20);
                                                str = (String) objArr20[0];
                                            }
                                            try {
                                                int i129 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                int i130 = i129 * 302;
                                                int i131 = ((i130 | 22914) << 1) - (i130 ^ 22914);
                                                int i132 = ~i129;
                                                int i133 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                int i134 = ~((i132 ^ i133) | (i132 & i133));
                                                int i135 = i131 + (((i134 ^ 38) | (i134 & 38)) * (-602));
                                                int i136 = ~((i132 ^ (-39)) | (i132 & (-39)));
                                                int i137 = ~i129;
                                                int i138 = i136 | (~((i137 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & i137)));
                                                int i139 = (i129 & i133) | (i133 ^ i129);
                                                int i140 = ~((i139 & 38) | (i139 ^ 38));
                                                int i141 = -(-(((i138 & i140) | (i138 ^ i140)) * (-301)));
                                                int i142 = (i135 ^ i141) + ((i141 & i135) << 1) + ((~((i133 ^ 38) | (i133 & 38))) * 301);
                                                Object[] objArr21 = new Object[1];
                                                c(new char[]{35485, 7729, 52289, 59571, 14658, 47533, 60333, 12726, 20228, 24878, 64393, 21892, 64544, 41736, 48986, 25026, 12324, 49846, 51756, 26547, 64392, 36419, 7756, 47831, 3982, 3069, 32793, 56760, 4757, 26162, 9885, 27891, 34712, 29170, 56654, 63361, 48636, 3749, 13650, 40260}, i142, objArr21);
                                                Class<?> cls7 = Class.forName((String) objArr21[0]);
                                                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                int i143 = iResolveSizeAndState * 284;
                                                int i144 = (i143 ^ (-12482166)) + ((i143 & (-12482166)) << 1);
                                                int i145 = ~((~iResolveSizeAndState) | 44263);
                                                int i146 = ~iResolveSizeAndState;
                                                int i147 = ~((i146 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i146 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                                int i148 = i144 + (((i145 ^ i147) | (i147 & i145)) * (-283));
                                                int i149 = (~(iResolveSizeAndState | (-44264))) * 283;
                                                int i150 = (i148 ^ i149) + ((i148 & i149) << 1);
                                                int i151 = (i146 ^ (-44264)) | ((-44264) & i146);
                                                int i152 = -(-((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i151) | (i151 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) * 283));
                                                int i153 = ((i150 | i152) << 1) - (i152 ^ i150);
                                                Object[] objArr22 = new Object[1];
                                                a(new char[]{32093, 53688, 9344, 31686, 52936, 7626, 28708, 50954, 6764, 26950, 48217}, i153, objArr22);
                                                Object objInvoke3 = cls7.getMethod((String) objArr22[0], String.class).invoke(null, str);
                                                try {
                                                    int i154 = -(-View.combineMeasuredStates(0, 0));
                                                    int i155 = (i154 ^ 37363) + ((i154 & 37363) << 1);
                                                    Object[] objArr23 = new Object[1];
                                                    a(new char[]{32091, 60583, 24248, 51345, 15001, 42220, 5868, 32945, 62145, 23774, 52778, 14399, 43579, 5123, 34308, 61481, 25210, 52340, 15874, 43104, 7087, 34226, 63414, 24974, 54150, 15860, 45030, 6654}, i155, objArr23);
                                                    Class<?> cls8 = Class.forName((String) objArr23[0]);
                                                    char[] cArr9 = {35460, 47054, 1995, 4804, 26602, 11437, 15798, 29918, 46493, 43051, 29376, 52382, 32223, 27344};
                                                    int i156 = d;
                                                    int i157 = ((i156 | 11) << 1) - (i156 ^ 11);
                                                    g = i157 % 128;
                                                    int i158 = i157 % 2;
                                                    int iMyPid = Process.myPid() >> 22;
                                                    int i159 = g + 27;
                                                    d = i159 % 128;
                                                    if (i159 % 2 != 0) {
                                                        i8 = (55 >>> iMyPid) >> (-96);
                                                    } else {
                                                        int i160 = iMyPid * 55;
                                                        i8 = (i160 | (-1177)) + (i160 & (-1177));
                                                    }
                                                    int i161 = ~iMyPid;
                                                    int i162 = ~((i161 ^ 11) | (i161 & 11));
                                                    int i163 = ~((i59 ^ 11) | (i59 & 11));
                                                    int i164 = i8 + ((-108) * ((i162 ^ i163) | (i163 & i162)));
                                                    int i165 = ~iMyPid;
                                                    int i166 = ~((i165 & i) | (i165 ^ i));
                                                    int i167 = ~((-12) | iMyPid);
                                                    int i168 = (i166 ^ i167) | (i166 & i167);
                                                    int i169 = ~((i59 ^ iMyPid) | (i59 & iMyPid));
                                                    int i170 = i164 + (((i168 ^ i169) | (i168 & i169)) * 54);
                                                    int i171 = ~((iMyPid & (-12)) | ((-12) ^ iMyPid));
                                                    int i172 = -(-(((i171 & i) | (i ^ i171)) * 54));
                                                    int i173 = (i170 ^ i172) + ((i170 & i172) << 1);
                                                    Object[] objArr24 = new Object[1];
                                                    c(cArr9, i173, objArr24);
                                                    try {
                                                        Object[] objArr25 = {new ByteArrayInputStream((byte[]) cls8.getMethod((String) objArr24[0], null).invoke(obj2, null))};
                                                        Object[] objArr26 = new Object[1];
                                                        c(new char[]{35485, 7729, 52289, 59571, 14658, 47533, 60333, 12726, 20228, 24878, 64393, 21892, 64544, 41736, 48986, 25026, 12324, 49846, 51756, 26547, 64392, 36419, 7756, 47831, 3982, 3069, 32793, 56760, 4757, 26162, 9885, 27891, 34712, 29170, 56654, 63361, 48636, 3749, 13650, 40260}, 36 - (~(Process.myPid() >> 22)), objArr26);
                                                        Class<?> cls9 = Class.forName((String) objArr26[0]);
                                                        int i174 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                        int i175 = (i174 * (-300)) + 5436;
                                                        int i176 = (i174 ^ 18) | (i174 & 18);
                                                        int i177 = (~((i176 ^ i) | (i176 & i))) * (-301);
                                                        int i178 = (i175 ^ i177) + ((i175 & i177) << 1);
                                                        int i179 = ~(((-19) ^ i) | ((-19) & i));
                                                        int i180 = ~((i59 ^ i174) | (i59 & i174));
                                                        int i181 = (i178 - (~(-(-(((i179 & i180) | (i179 ^ i180)) * (-301)))))) - 1;
                                                        int i182 = ~i174;
                                                        int i183 = ((~((i182 & i) | (i182 ^ i))) | (-19)) * 301;
                                                        Object[] objArr27 = new Object[1];
                                                        c(new char[]{45221, 10709, 48606, 63844, 35128, 34999, 55994, 26723, 40676, 24428, 53117, 48497, 59051, 58761, 32517, 48854, 41823, 28451, 927, 28544, 60460, 22301}, (i181 & i183) + (i181 | i183), objArr27);
                                                        Object objInvoke4 = cls9.getMethod((String) objArr27[0], InputStream.class).invoke(objInvoke3, objArr25);
                                                        int i184 = g;
                                                        int i185 = ((i184 | 29) << 1) - (i184 ^ 29);
                                                        d = i185 % 128;
                                                        int i186 = i185 % 2;
                                                        try {
                                                            char[] cArr10 = {11445, 33033, 13085, 34190, 57401, 38020, 64665, 34307, 46927, 65379, 39400, 52674, 43083, 2935, 24873, 2893, 33486, 40112, 17944, 4613, 2394, 42635, 23869, 43710, 61023, 45733, 57568, 46907, 18599, 24723, 50638, 34659, 29523, 20157, 22674, 24495};
                                                            int iMyTid = Process.myTid() >> 22;
                                                            int i187 = -(-(iMyTid * 530));
                                                            int i188 = (i187 ^ 1058) + ((i187 & 1058) << 1);
                                                            int i189 = ~((i28 ^ (-1395458149)) | (i28 & (-1395458149)));
                                                            int i190 = (-1456799397) + (((i189 & (-502349028)) | ((-502349028) ^ i189)) * (-328));
                                                            int i191 = -(-((((-502349028) ^ i) | ((-502349028) & i)) * 164));
                                                            int i192 = (i190 ^ i191) + ((i191 & i190) << 1);
                                                            int i193 = ~((1395458148 & i) | (1395458148 ^ i));
                                                            int i194 = ((-1610431720) ^ i193) | (i193 & (-1610431720));
                                                            int i195 = ((-502349028) & i59) | (i59 ^ (-502349028));
                                                            int i196 = ~(((-1395458149) & i195) | (i195 ^ (-1395458149)));
                                                            int i197 = -(-(((i196 & i194) | (i194 ^ i196)) * 164));
                                                            int i198 = (i192 ^ i197) + ((i197 & i192) << 1);
                                                            int i199 = ~(772483793 | i);
                                                            int i200 = -(-(((i199 & (-1944058441)) | ((-1944058441) ^ i199)) * (-220)));
                                                            int i201 = ((-1602617353) ^ i200) + ((i200 & (-1602617353)) << 1);
                                                            int i202 = ~((772483793 & i) | (772483793 ^ i));
                                                            if (i198 > (i201 - (~(-(-(((i202 & (-2145385178)) | ((-2145385178) ^ i202)) * 220))))) - (-1366401469)) {
                                                                i9 = i188 >> 20;
                                                                i10 = i59;
                                                            } else {
                                                                i9 = (i188 ^ 18020) + ((i188 & 18020) << 1);
                                                                i10 = i28;
                                                            }
                                                            int i203 = g;
                                                            int i204 = i203 + 9;
                                                            d = i204 % 128;
                                                            if (i204 % 2 != 0) {
                                                                int i205 = ~((i10 & iMyTid) | (i10 ^ iMyTid));
                                                                int i206 = ~((iMyTid ^ 34) | (iMyTid & 34));
                                                                i12 = i9 * (529 << ((i205 & i206) | (i205 ^ i206)));
                                                                i11 = 1;
                                                            } else {
                                                                int i207 = ~((i10 & iMyTid) | (i10 ^ iMyTid));
                                                                int i208 = ~(iMyTid | 34);
                                                                int i209 = i9 - (~(-(-(529 * ((i207 & i208) | (i207 ^ i208))))));
                                                                i11 = 1;
                                                                i12 = i209 - 1;
                                                            }
                                                            int i210 = (i203 ^ 111) + ((i203 & 111) << i11);
                                                            d = i210 % 128;
                                                            int i211 = i210 % 2;
                                                            int i212 = ~((iMyTid & i) | (iMyTid ^ i));
                                                            if (i211 != 0) {
                                                                Object[] objArr28 = new Object[1];
                                                                c(cArr10, i12 << (529 >> ((i212 & (-35)) | ((-35) ^ i212))), objArr28);
                                                                obj = objArr28[0];
                                                            } else {
                                                                Object[] objArr29 = new Object[1];
                                                                c(cArr10, (i12 - (~(-(-(529 * ((i212 & (-35)) | ((-35) ^ i212))))))) - 1, objArr29);
                                                                obj = objArr29[0];
                                                            }
                                                            Class<?> cls10 = Class.forName((String) obj);
                                                            Object[] objArr30 = new Object[1];
                                                            c(new char[]{39560, 61511, 34948, 5444, 64859, 46203, 42146, 45447, 62097, 16673, 34453, 61186, 52809, 56183, 16167, 42492, 5581, 42696, 53380, 33151, 181, 49601, 4036, 7765, 21302, 39627}, 23 - View.resolveSize(0, 0), objArr30);
                                                            if (objNewInstance.equals(cls10.getMethod((String) objArr30[0], null).invoke(objInvoke4, null))) {
                                                                break;
                                                            }
                                                            int i213 = d;
                                                            int i214 = (i213 ^ 45) + ((i213 & 45) << 1);
                                                            g = i214 % 128;
                                                            int i215 = i214 % 2;
                                                            try {
                                                                int i216 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                                                int i217 = ((i216 | 34) << 1) - (i216 ^ 34);
                                                                Object[] objArr31 = new Object[1];
                                                                c(new char[]{11445, 33033, 13085, 34190, 57401, 38020, 64665, 34307, 46927, 65379, 39400, 52674, 43083, 2935, 24873, 2893, 33486, 40112, 17944, 4613, 2394, 42635, 23869, 43710, 61023, 45733, 57568, 46907, 18599, 24723, 50638, 34659, 29523, 20157, 22674, 24495}, i217, objArr31);
                                                                Class<?> cls11 = Class.forName((String) objArr31[0]);
                                                                char[] cArr11 = {39560, 61511, 34948, 5444, 64859, 46203, 42146, 45447, 62097, 16673, 34453, 61186, 52809, 56183, 16167, 42492, 5581, 42696, 53380, 33151, 181, 49601, 4036, 7765, 21302, 39627};
                                                                int i218 = -Color.green(0);
                                                                int i219 = i218 * 677;
                                                                int i220 = ((i219 | (-15525)) << 1) - (i219 ^ (-15525));
                                                                int i221 = g + 121;
                                                                int i222 = i221 % 128;
                                                                d = i222;
                                                                int i223 = i221 % 2;
                                                                int i224 = -(-(((i218 ^ i) | (i218 & i) | (-24)) * (-676)));
                                                                int i225 = (i220 ^ i224) + ((i224 & i220) << 1);
                                                                int i226 = ~(((-24) & i218) | ((-24) ^ i218));
                                                                int i227 = ~((i59 ^ i218) | (i59 & i218));
                                                                int i228 = (i225 - (~(-(-(((i226 ^ i227) | (i226 & i227)) * 676))))) - 1;
                                                                int i229 = i222 + 27;
                                                                g = i229 % 128;
                                                                int i230 = i229 % 2;
                                                                int i231 = ~i218;
                                                                int i232 = ~((i231 & (-24)) | (i231 ^ (-24)));
                                                                int i233 = ~((-24) | i59);
                                                                int i234 = (i232 & i233) | (i232 ^ i233);
                                                                int i235 = (i218 & 23) | (i218 ^ 23);
                                                                int i236 = ~((i235 & i) | (i235 ^ i));
                                                                int i237 = ((i236 & i234) | (i234 ^ i236)) * 676;
                                                                Object[] objArr32 = new Object[1];
                                                                c(cArr11, (i228 & i237) + (i228 | i237), objArr32);
                                                                if (objNewInstance2.equals(cls11.getMethod((String) objArr32[0], null).invoke(objInvoke4, null))) {
                                                                    break;
                                                                }
                                                                int i238 = i104 - 16;
                                                                i104 = ((i238 | 17) << 1) - (i238 ^ 17);
                                                                objArr17 = objArr18;
                                                                length = i120;
                                                                i17 = 1;
                                                            } catch (Throwable th) {
                                                                Throwable cause = th.getCause();
                                                                if (cause != null) {
                                                                    throw cause;
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (Throwable th2) {
                                                            Throwable cause2 = th2.getCause();
                                                            if (cause2 != null) {
                                                                throw cause2;
                                                            }
                                                            throw th2;
                                                        }
                                                    } catch (Throwable th3) {
                                                        Throwable cause3 = th3.getCause();
                                                        if (cause3 != null) {
                                                            throw cause3;
                                                        }
                                                        throw th3;
                                                    }
                                                } catch (Throwable th4) {
                                                    Throwable cause4 = th4.getCause();
                                                    if (cause4 != null) {
                                                        throw cause4;
                                                    }
                                                    throw th4;
                                                }
                                            } catch (Throwable th5) {
                                                Throwable cause5 = th5.getCause();
                                                if (cause5 != null) {
                                                    throw cause5;
                                                }
                                                throw th5;
                                            }
                                        }
                                    }
                                    Object[] objArr33 = {new int[]{i}, new int[1], new int[]{(i & (-2)) | (i59 & 1)}, null};
                                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                                    int i239 = ~startUptimeMillis;
                                    int i240 = (-896764464) + (((~(996956253 | i239)) | (~((-1037266483) | startUptimeMillis))) * 210) + (((~(startUptimeMillis | 1073708671)) | (~(i239 | (-960514065)))) * 210) + 16;
                                    int i241 = i240 * 450;
                                    int i242 = i2 * (-448);
                                    int i243 = (i241 & i242) + (i241 | i242);
                                    int i244 = ~i240;
                                    int i245 = ~((i244 & i2) | (i244 ^ i2));
                                    int i246 = ~i2;
                                    int i247 = i243 + ((i245 | (~(i246 | i240 | i))) * 449);
                                    int i248 = ~i240;
                                    int i249 = -(-((~(i248 | i2)) * (-1347)));
                                    int i250 = ((i247 | i249) << 1) - (i247 ^ i249);
                                    int i251 = -(-(((~((i248 & i2) | (i248 ^ i2))) | (~((i246 & i28) | (i246 ^ i28) | i240))) * 449));
                                    int i252 = ((i250 | i251) << 1) - (i251 ^ i250);
                                    int i253 = (i252 << 13) ^ i252;
                                    int i254 = i253 >>> 17;
                                    int i255 = (i253 | i254) & (~(i253 & i254));
                                    int i256 = i255 << 5;
                                    ((int[]) objArr33[1])[0] = ((~i255) & i256) | ((~i256) & i255);
                                    int i257 = g + 117;
                                    d = i257 % 128;
                                    if (i257 % 2 != 0) {
                                        int i258 = 30 / 0;
                                    }
                                    return objArr33;
                                } catch (Throwable th6) {
                                    Throwable cause6 = th6.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th6;
                                }
                            } catch (Throwable th7) {
                                Throwable cause7 = th7.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th7;
                            }
                        } catch (Throwable th8) {
                            Throwable cause8 = th8.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th8;
                        }
                    } catch (Throwable th9) {
                        Throwable cause9 = th9.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th9;
                    }
                } catch (Throwable th10) {
                    Throwable cause10 = th10.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th10;
                }
            } catch (Throwable unused) {
            }
        }
        Object[] objArr34 = {new int[]{i}, new int[1], new int[]{i}, null};
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i259 = (-313061124) + (((-111094748) | startElapsedRealtime) * 614);
        int i260 = ~startElapsedRealtime;
        int i261 = i259 + (((~((-1034151161) | i260)) | 958448672 | (~((-993840932) | i260))) * (-1228)) + (((~(i260 | (-35392260))) | (~((-75702489) | i260))) * 614);
        int i262 = ((i261 * 522) - (~(-(-((~(i | (((-1) ^ i261) | i261))) * 521))))) - 1;
        int i263 = ~i261;
        int i264 = (~i263) * (-1042);
        int i265 = ((i262 | i264) << 1) - (i262 ^ i264);
        int i266 = -(-(((~i263) | (~(((-1) ^ i261) | i261))) * 521));
        int i267 = (i2 - (~(-(-(((i265 | i266) << 1) - (i266 ^ i265)))))) - 1;
        int i268 = i267 ^ (i267 << 13);
        int i269 = i268 >>> 17;
        int i270 = ((~i268) & i269) | ((~i269) & i268);
        ((int[]) objArr34[1])[0] = i270 ^ (i270 << 5);
        return objArr34;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(byte r6, byte r7, short r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 108
            int r6 = r6 * 2
            int r0 = 1 - r6
            int r8 = r8 * 4
            int r8 = r8 + 4
            byte[] r1 = com.google.android.gms.signin.internal.zaf.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L19
            r3 = r6
            r7 = r8
            r4 = r2
            goto L2c
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            r3 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.signin.internal.zaf.$$c(byte, byte, short):java.lang.String");
    }
}
