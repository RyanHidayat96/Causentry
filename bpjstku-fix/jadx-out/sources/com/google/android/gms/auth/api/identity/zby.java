package com.google.android.gms.auth.api.identity;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import defpackage.DeviceQuirksExternalSyntheticLambda0;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import kotlin.io.encoding.Base64;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final class zby implements Parcelable.Creator {
    private static final byte[] $$c = {12, 11, -9, -106};
    private static final int $$f = 110;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {Base64.padSymbol, -108, 49, -100, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 254;
    private static final byte[] $$a = {73, 55, 58, 33, -16, 15, 0, 11};
    private static final int $$b = 231;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {-680221131, -2142321667, 53147655, -1509901273, -1394886067, 167964210, 1783822335, -1262757520, 1072532941, 1997796814, 160267122, -1309016921, 282219279, -1881849833, 684819969, -1923107694, 1132548439, -1459783765};

    private static void a(int i, short s, short s2, Object[] objArr) {
        int i2 = 3 - (s * 3);
        int i3 = s2 * 3;
        byte[] bArr = $$a;
        int i4 = 98 - (i * 2);
        byte[] bArr2 = new byte[i3 + 5];
        int i5 = i3 + 4;
        int i6 = -1;
        if (bArr == null) {
            i4 = i4 + (-i2) + 3;
            i2 = i2;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            int i8 = i2 + 1;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i4 = i4 + (-bArr[i8]) + 3;
                i2 = i8;
                i6 = i7;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.auth.api.identity.zby.$$d
            int r8 = r8 + 4
            int r6 = 103 - r6
            int r7 = r7 * 52
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2e
        L12:
            r3 = r2
        L13:
            r5 = r8
            r8 = r6
            r6 = r5
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.identity.zby.c(int, int, short, java.lang.Object[]):void");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = i3 + 39;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        SignInPassword[] signInPasswordArr = new SignInPassword[i];
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 17;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return signInPasswordArr;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                int i4 = TuitionPaymentFragmentbindingInflater1;
                int i5 = i4 + 79;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
                if (fieldId != 2) {
                    int i7 = i4 + 109;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                    if (i7 % 2 != 0) {
                        SafeParcelReader.skipUnknownField(parcel, header);
                        int i8 = 92 / 0;
                    } else {
                        SafeParcelReader.skipUnknownField(parcel, header);
                    }
                } else {
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                }
            } else {
                strCreateString = SafeParcelReader.createString(parcel, header);
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
                TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        SignInPassword signInPassword = new SignInPassword(strCreateString, strCreateString2);
        int i11 = TuitionPaymentFragmentbindingInflater1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
        if (i11 % 2 == 0) {
            return signInPassword;
        }
        throw null;
    }

    private static void d(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = -1870535734;
        long j = 0;
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char size = (char) View.MeasureSpec.getSize(0);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(j) + 3292;
                        int i7 = (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 30;
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, packedPositionChild, i7, 1948206109, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i6++;
                    i3 = -1870535734;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        float f = 0.0f;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                Object[] objArr3 = new Object[i4];
                objArr3[i5] = Integer.valueOf(iArr5[i8]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c = (char) (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1));
                    int scrollBarSize = 3291 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int iIndexOf = 30 - TextUtils.indexOf((CharSequence) "", '0', i5);
                    byte b3 = (byte) i5;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, scrollBarSize, iIndexOf, 1948206109, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                }
                iArr6[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i8++;
                iArr5 = iArr5;
                f = 0.0f;
                i4 = 1;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i9 = i5;
        System.arraycopy(iArr5, i9, iArr4, i9, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i10 = 17;
            for (int i11 = 1; i10 > i11; i11 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i10];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 1;
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), 2559 - Color.alpha(0), TextUtils.indexOf("", "", 0) + 29, 683220507, false, $$g(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i10--;
            }
            int i12 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i13 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28879 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 347, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 26, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            int i14 = $10 + 119;
            $11 = i14 % 128;
            int i15 = i14 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
        int i16 = $10 + 83;
        $11 = i16 % 128;
        int i17 = i16 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:106:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:108:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:109:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:124:0x0581 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x047d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0586 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0586 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0399 A[PHI: r0
  0x0399: PHI (r0v83 java.lang.Object[]) = (r0v82 java.lang.Object[]), (r0v114 java.lang.Object[]) binds: [B:44:0x0397, B:40:0x0391] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:51:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:54:0x041b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0486  */
    /* JADX WARN: Code duplicated, block: B:62:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:66:0x0531 A[Catch: all -> 0x07ec, TryCatch #1 {all -> 0x07ec, blocks: (B:64:0x051b, B:66:0x0531, B:67:0x0574, B:81:0x05e9, B:83:0x05f6, B:84:0x063f, B:86:0x065d, B:87:0x06b2), top: B:121:0x051b }] */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(List list) throws Throwable {
        Method[] methodArr;
        Class<OkHttpClient.Builder> cls;
        String str;
        Class<?>[] clsArr;
        boolean z;
        String string;
        Method method;
        int i;
        int[] iArr;
        int longPressTimeout;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2;
        Class<?> cls2;
        int[] iArr2;
        int i3;
        Object[] objArr;
        int[] iArr3;
        int i4;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i10 = 2 % 2;
        int i11 = TuitionPaymentFragmentbindingInflater1 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
        int i12 = 0;
        if (i11 % 2 != 0) {
            methodArr = new Method[1];
            cls = OkHttpClient.Builder.class;
            byte b = $$a[6];
            byte b2 = b;
            Object[] objArr3 = new Object[1];
            a(b, b2, b2, objArr3);
            str = (String) objArr3[0];
            clsArr = new Class[1];
        } else {
            methodArr = new Method[1];
            cls = OkHttpClient.Builder.class;
            byte b3 = $$a[6];
            byte b4 = b3;
            Object[] objArr4 = new Object[1];
            a(b3, b4, b4, objArr4);
            str = (String) objArr4[0];
            clsArr = new Class[0];
        }
        methodArr[0] = cls.getMethod(str, clsArr);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int i13 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2822;
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 23;
            byte[] bArr = $$d;
            byte b5 = bArr[54];
            byte b6 = bArr[5];
            Object[] objArr5 = new Object[1];
            c(b5, (byte) (-b6), b6, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveOpacity, i13, modifierMetaStateMask, 1814927978, false, (String) objArr5[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            int i14 = TuitionPaymentFragmentbindingInflater1 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
            int i15 = i14 % 2;
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getOffsetBefore("", 0), 2824 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 21 - ((byte) KeyEvent.getModifierMetaStateMask()))).getDeclaredMethods();
            int length = declaredMethods.length;
            int i16 = 0;
            while (i16 < length) {
                Method method2 = declaredMethods[i16];
                try {
                    int i17 = -Color.green(i12);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i18 = ~i17;
                    int i19 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                    int i20 = ~(i18 | i19);
                    int i21 = ~((i18 ^ 24) | (i18 & 24));
                    int i22 = (i20 ^ i21) | (i20 & i21);
                    int i23 = ~(i19 | 24);
                    int i24 = ((i17 * 398) - 9504) + (((i22 ^ i23) | (i22 & i23)) * (-397));
                    int i25 = i21 * (-397);
                    int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
                    int i27 = ~i17;
                    int i28 = ~((i27 & 24) | (i27 ^ 24));
                    int i29 = (i28 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 ^ i28);
                    int i30 = ~(((-25) & i17) | ((-25) ^ i17));
                    int i31 = i26 + (((i29 & i30) | (i29 ^ i30)) * 397);
                    Object[] objArr6 = new Object[1];
                    d(new int[]{1850248333, 495775512, 1881787260, -118910150, 510071036, 527478870, 1703376485, -1028464225, -1154201590, -279659900, 846907172, -324545969, 1097982852, 883191410}, i31, objArr6);
                    Class<?> cls3 = Class.forName((String) objArr6[i12]);
                    int i32 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i33 = i32 * (-344);
                    int i34 = ((i33 | (-4128)) << 1) - (i33 ^ (-4128));
                    int i35 = ~i32;
                    int i36 = ~((i35 ^ (-13)) | (i35 & (-13)));
                    int i37 = ~i32;
                    int i38 = -(-(((~((i37 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i37 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6))) | i36) * 345));
                    int i39 = ((i34 | i38) << 1) - (i38 ^ i34);
                    int i40 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                    int i41 = ~((i40 & i35) | (i35 ^ i40));
                    int i42 = ~(((-13) ^ i32) | (i32 & (-13)));
                    int i43 = -(-(((i41 ^ i42) | (i41 & i42)) * 345));
                    int i44 = (i39 & i43) + (i43 | i39);
                    int i45 = (i35 ^ (-13)) | (i35 & (-13));
                    int i46 = -(-((~((i45 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i45 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6))) * 345));
                    int i47 = (i44 ^ i46) + ((i46 & i44) << 1);
                    Object[] objArr7 = new Object[1];
                    d(new int[]{-381180097, -62748330, 821572102, 621832426, 1036643130, 587779219, -1007606057, 957135213}, i47, objArr7);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr7[i12], null).invoke(method2, null)).intValue();
                    Object[] objArr8 = new Object[1];
                    objArr8[i12] = Integer.valueOf(iIntValue);
                    int iResolveOpacity = Drawable.resolveOpacity(i12, i12);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i48 = iResolveOpacity * 829;
                    int i49 = (i48 ^ 21554) + ((i48 & 21554) << 1);
                    int i50 = ~((~iResolveOpacity) | (-27));
                    int i51 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                    int i52 = (i51 ^ iResolveOpacity) | (i51 & iResolveOpacity);
                    int i53 = (i50 | (~((i52 & 26) | (i52 ^ 26)))) * (-828);
                    int i54 = (i49 ^ i53) + ((i53 & i49) << 1);
                    int i55 = (iResolveOpacity & 26) | (iResolveOpacity ^ 26);
                    int i56 = ((i51 & i55) | (i55 ^ i51)) * (-828);
                    int i57 = (((i54 & i56) + (i56 | i54)) - (~((~i55) * 828))) - 1;
                    Object[] objArr9 = new Object[1];
                    d(new int[]{-1871834270, -1935088608, 1948460511, -418627206, -1331015378, -225068010, 2097231765, 1557745415, -1893822633, 2055894183, 1918954204, -1745776151, 369758750, -1206596185, -518299137, -747264453}, i57, objArr9);
                    Class<?> cls4 = Class.forName((String) objArr9[i12]);
                    Object[] objArr10 = new Object[1];
                    d(new int[]{-468770646, 1452301067, -328863432, 2142539243, -952507291, 1374725304}, 7 - (~TextUtils.getTrimmedLength("")), objArr10);
                    String str2 = (String) objArr10[i12];
                    Class<?>[] clsArr2 = new Class[1];
                    clsArr2[i12] = Integer.TYPE;
                    if (((Boolean) cls4.getMethod(str2, clsArr2).invoke(null, objArr8)).booleanValue()) {
                        int i58 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i59 = (i58 ^ 61) + ((i58 & 61) << 1);
                        TuitionPaymentFragmentbindingInflater1 = i59 % 128;
                        int i60 = i59 % 2;
                        Class cls5 = Long.TYPE;
                        Object[] objArr11 = new Object[1];
                        d(new int[]{1850248333, 495775512, 1881787260, -118910150, 510071036, 527478870, 1703376485, -1028464225, -1154201590, -279659900, 846907172, -324545969, 1097982852, 883191410}, 23 - (~(Process.myTid() >> 22)), objArr11);
                        Class<?> cls6 = Class.forName((String) objArr11[i12]);
                        int[] iArr4 = {-832917958, 820956417, 1130729405, -1747601946, 401248500, 1742395932, 313470158, -1749937579, 1479793366, 1800905957};
                        int i61 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
                        TuitionPaymentFragmentbindingInflater1 = i61 % 128;
                        int i62 = i61 % 2;
                        Object[] objArr12 = new Object[1];
                        d(iArr4, 13 - View.combineMeasuredStates(i12, i12), objArr12);
                        String str3 = (String) objArr12[i12];
                        int i63 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
                        TuitionPaymentFragmentbindingInflater1 = i63 % 128;
                        int i64 = i63 % 2;
                        if (!cls5.equals(cls6.getMethod(str3, null).invoke(method2, null))) {
                            continue;
                        } else {
                            int i65 = TuitionPaymentFragmentbindingInflater1;
                            int i66 = (i65 ^ 73) + ((i65 & 73) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i66 % 128;
                            if (i66 % 2 != 0) {
                                iArr = new int[]{1850248333, 495775512, 1881787260, -118910150, 510071036, 527478870, 1703376485, -1028464225, -1154201590, -279659900, 846907172, -324545969, 1097982852, 883191410};
                                int longPressTimeout2 = ViewConfiguration.getLongPressTimeout();
                                longPressTimeout = (longPressTimeout2 ^ (-72)) + ((longPressTimeout2 & (-72)) << 1);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                i2 = 50;
                            } else {
                                iArr = new int[]{1850248333, 495775512, 1881787260, -118910150, 510071036, 527478870, 1703376485, -1028464225, -1154201590, -279659900, 846907172, -324545969, 1097982852, 883191410};
                                longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                i2 = 24;
                            }
                            int i67 = longPressTimeout * (-743);
                            int i68 = -(-(i2 * (-743)));
                            int i69 = ((i67 | i68) << 1) - (i67 ^ i68);
                            int i70 = TuitionPaymentFragmentbindingInflater1;
                            int i71 = (i70 & 125) + (i70 | 125);
                            int i72 = i71 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i72;
                            int i73 = i71 % 2;
                            int i74 = (longPressTimeout ^ i2) | (longPressTimeout & i2);
                            int i75 = ~i74;
                            int i76 = ~((longPressTimeout ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (longPressTimeout & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            int i77 = (i75 ^ i76) | (i76 & i75);
                            int i78 = ~(i2 | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            int i79 = -(-(((i77 ^ i78) | (i77 & i78)) * (-744)));
                            int i80 = ((i69 | i79) << 1) - (i79 ^ i69);
                            int i81 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i82 = i72 + 9;
                            int i83 = i82 % 128;
                            TuitionPaymentFragmentbindingInflater1 = i83;
                            int i84 = i82 % 2;
                            int i85 = ~longPressTimeout;
                            int i86 = ~i2;
                            int i87 = ~((i85 & i86) | (i85 ^ i86));
                            int i88 = 744 * ((i81 & i87) | (i81 ^ i87));
                            int i89 = (i80 ^ i88) + ((i88 & i80) << 1);
                            int i90 = ((i83 | 43) << 1) - (i83 ^ 43);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i90 % 128;
                            int i91 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3 | i74;
                            if (i90 % 2 != 0) {
                                int i92 = 744 % i91;
                                int i93 = ((i89 | i92) << 1) - (i89 ^ i92);
                                Object[] objArr13 = new Object[1];
                                d(iArr, i93, objArr13);
                                cls2 = Class.forName((String) objArr13[0]);
                                iArr2 = new int[]{-734532700, -793324420, -177775876, -1822242466, 1186507929, -2056691430, -1012884419, -1972919027, -244264396, -717991204, -179085741, -2120827489};
                                i3 = 67;
                            } else {
                                int i94 = -(-(i91 * 744));
                                int i95 = (i89 & i94) + (i89 | i94);
                                Object[] objArr14 = new Object[1];
                                d(iArr, i95, objArr14);
                                cls2 = Class.forName((String) objArr14[0]);
                                iArr2 = new int[]{-734532700, -793324420, -177775876, -1822242466, 1186507929, -2056691430, -1012884419, -1972919027, -244264396, -717991204, -179085741, -2120827489};
                                i3 = 17;
                            }
                            int i96 = -(-Color.red(0));
                            int i97 = ((i3 | i96) << 1) - (i3 ^ i96);
                            Object[] objArr15 = new Object[1];
                            d(iArr2, i97, objArr15);
                            Object objInvoke = cls2.getMethod((String) objArr15[0], null).invoke(method2, null);
                            int i98 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
                            TuitionPaymentFragmentbindingInflater1 = i98 % 128;
                            if (i98 % 2 == 0) {
                                objArr = (Object[]) objInvoke;
                                if (objArr.length != 2) {
                                    continue;
                                } else if (!Long.TYPE.equals(objArr[0])) {
                                    continue;
                                } else {
                                    int i99 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i100 = (i99 ^ 53) + ((i99 & 53) << 1);
                                    TuitionPaymentFragmentbindingInflater1 = i100 % 128;
                                    int i101 = i100 % 2;
                                    iArr3 = new int[]{1850248333, 495775512, 1881787260, -118910150, 510071036, 527478870, 1703376485, -1028464225, -1154201590, -279659900, 846907172, -324545969, 1097982852, 883191410};
                                    i4 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i102 = i4 * (-813);
                                    i5 = (i102 & 9384) + (i102 | 9384);
                                    i6 = TuitionPaymentFragmentbindingInflater1;
                                    i7 = (i6 & 81) + (i6 | 81);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        int i103 = ~(((-24) & i4) | ((-24) ^ i4));
                                        int i104 = ~((i4 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i4 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                        int i105 = -(-((-814) - ((i103 & i104) | (i103 ^ i104))));
                                        i8 = (i5 & i105) + (i5 | i105);
                                    } else {
                                        int i106 = ~(((-24) & i4) | ((-24) ^ i4));
                                        int i107 = ~((i4 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i4 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                        int i108 = -(-(((i106 & i107) | (i106 ^ i107)) * (-814)));
                                        i8 = ((i5 | i108) << 1) - (i5 ^ i108);
                                    }
                                    i9 = i6 + 117;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        Object obj = null;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    int i109 = ~((-24) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                    int i110 = ~i4;
                                    int i111 = i109 | (~((i110 & 23) | (i110 ^ 23)));
                                    int i112 = ~((i4 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i4 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                    int i113 = 407 * ((i111 & i112) | (i111 ^ i112));
                                    int i114 = (i8 ^ i113) + ((i113 & i8) << 1);
                                    int i115 = ~i4;
                                    int i116 = ~((i115 ^ 23) | (i115 & 23));
                                    int i117 = i6 + 5;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i117 % 128;
                                    int i118 = i117 % 2;
                                    int i119 = ~((i115 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i115 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                    int i120 = -(-(407 * ((i119 & i116) | (i116 ^ i119) | (~((23 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (23 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4))))));
                                    int i121 = (i114 & i120) + (i120 | i114);
                                    objArr2 = new Object[1];
                                    d(iArr3, i121, objArr2);
                                    if (!Class.forName((String) objArr2[0]).equals(objArr[1])) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char cResolveSize = (char) View.resolveSize(0, 0);
                                            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 2824;
                                            int i122 = 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                            byte[] bArr2 = $$d;
                                            byte b7 = bArr2[54];
                                            byte b8 = bArr2[5];
                                            Object[] objArr16 = new Object[1];
                                            c(b7, (byte) (-b8), b8, objArr16);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSize, bitsPerPixel, i122, 1814927978, false, (String) objArr16[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char gidForName = (char) (Process.getGidForName("") + 1);
                                            int iIndexOf = 2822 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                            int i123 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21;
                                            byte[] bArr3 = $$d;
                                            byte b9 = bArr3[54];
                                            byte b10 = bArr3[5];
                                            Object[] objArr17 = new Object[1];
                                            c(b9, (byte) (-b10), b10, objArr17);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName, iIndexOf, i123, 1814927978, false, (String) objArr17[0], null);
                                        }
                                        try {
                                            Object[] objArr18 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2824;
                                                int iCombineMeasuredStates = 22 - View.combineMeasuredStates(0, 0);
                                                byte b11 = $$d[7];
                                                byte b12 = b11;
                                                Object[] objArr19 = new Object[1];
                                                c(b11, b12, (byte) (b12 | 51), objArr19);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState, iLastIndexOf, iCombineMeasuredStates, -2137287382, false, (String) objArr19[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr18)).longValue();
                                            break;
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                objArr = (Object[]) objInvoke;
                                if (objArr.length != 2) {
                                    continue;
                                } else if (!Long.TYPE.equals(objArr[0])) {
                                    continue;
                                } else {
                                    int i910 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i1010 = (i910 ^ 53) + ((i910 & 53) << 1);
                                    TuitionPaymentFragmentbindingInflater1 = i1010 % 128;
                                    int i1011 = i1010 % 2;
                                    iArr3 = new int[]{1850248333, 495775512, 1881787260, -118910150, 510071036, 527478870, 1703376485, -1028464225, -1154201590, -279659900, 846907172, -324545969, 1097982852, 883191410};
                                    i4 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i1012 = i4 * (-813);
                                    i5 = (i1012 & 9384) + (i1012 | 9384);
                                    i6 = TuitionPaymentFragmentbindingInflater1;
                                    i7 = (i6 & 81) + (i6 | 81);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        int i1013 = ~(((-24) & i4) | ((-24) ^ i4));
                                        int i1014 = ~((i4 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i4 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                        int i1015 = -(-((-814) - ((i1013 & i1014) | (i1013 ^ i1014))));
                                        i8 = (i5 & i1015) + (i5 | i1015);
                                    } else {
                                        int i1016 = ~(((-24) & i4) | ((-24) ^ i4));
                                        int i1017 = ~((i4 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i4 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                        int i1018 = -(-(((i1016 & i1017) | (i1016 ^ i1017)) * (-814)));
                                        i8 = ((i5 | i1018) << 1) - (i5 ^ i1018);
                                    }
                                    i9 = i6 + 117;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        Object obj2 = null;
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    int i1019 = ~((-24) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                    int i1110 = ~i4;
                                    int i1111 = i1019 | (~((i1110 & 23) | (i1110 ^ 23)));
                                    int i1112 = ~((i4 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i4 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                    int i1113 = 407 * ((i1111 & i1112) | (i1111 ^ i1112));
                                    int i1114 = (i8 ^ i1113) + ((i1113 & i8) << 1);
                                    int i1115 = ~i4;
                                    int i1116 = ~((i1115 ^ 23) | (i1115 & 23));
                                    int i1117 = i6 + 5;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1117 % 128;
                                    int i1118 = i1117 % 2;
                                    int i1119 = ~((i1115 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i1115 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                    int i124 = -(-(407 * ((i1119 & i1116) | (i1116 ^ i1119) | (~((23 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (23 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4))))));
                                    int i125 = (i1114 & i124) + (i124 | i1114);
                                    objArr2 = new Object[1];
                                    d(iArr3, i125, objArr2);
                                    if (!Class.forName((String) objArr2[0]).equals(objArr[1])) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char cResolveSize2 = (char) View.resolveSize(0, 0);
                                            int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 2824;
                                            int i126 = 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                            byte[] bArr4 = $$d;
                                            byte b13 = bArr4[54];
                                            byte b14 = bArr4[5];
                                            Object[] objArr110 = new Object[1];
                                            c(b13, (byte) (-b14), b14, objArr110);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSize2, bitsPerPixel2, i126, 1814927978, false, (String) objArr110[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char gidForName2 = (char) (Process.getGidForName("") + 1);
                                            int iIndexOf2 = 2822 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                            int i127 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21;
                                            byte[] bArr5 = $$d;
                                            byte b15 = bArr5[54];
                                            byte b16 = bArr5[5];
                                            Object[] objArr111 = new Object[1];
                                            c(b15, (byte) (-b16), b16, objArr111);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName2, iIndexOf2, i127, 1814927978, false, (String) objArr111[0], null);
                                        }
                                        Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                                            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 2824;
                                            int iCombineMeasuredStates2 = 22 - View.combineMeasuredStates(0, 0);
                                            byte b17 = $$d[7];
                                            byte b18 = b17;
                                            Object[] objArr113 = new Object[1];
                                            c(b17, b18, (byte) (b18 | 51), objArr113);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState2, iLastIndexOf2, iCombineMeasuredStates2, -2137287382, false, (String) objArr113[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    i16 = (i16 & (-43)) + (i16 | (-43)) + 44;
                    i12 = 0;
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
            char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2823;
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 23;
            byte[] bArr6 = $$d;
            byte b19 = bArr6[54];
            byte b20 = bArr6[5];
            Object[] objArr20 = new Object[1];
            c(b19, (byte) (-b20), b20, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iKeyCodeFromString, packedPositionChild, 1814927978, false, (String) objArr20[0], null);
        }
        Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int i128 = 2824 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 22;
            byte[] bArr7 = $$d;
            byte b21 = (byte) (bArr7[51] - 1);
            byte b22 = bArr7[7];
            Object[] objArr22 = new Object[1];
            c(b21, b22, (byte) (b22 | 51), objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize, i128, touchSlop, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
        Object[] objArr23 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char mode = (char) (View.MeasureSpec.getMode(0) + 37657);
            int iIndexOf3 = 2719 - TextUtils.indexOf((CharSequence) "", '0');
            int i129 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18;
            byte[] bArr8 = $$d;
            byte b23 = (byte) (bArr8[51] - 1);
            byte b24 = bArr8[7];
            Object[] objArr24 = new Object[1];
            c(b23, b24, (byte) (b24 | 51), objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(mode, iIndexOf3, i129, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
        long j = -1500522413;
        long j2 = 217;
        long j3 = -1;
        long j4 = j ^ j3;
        long jNextInt = new Random().nextInt();
        long j5 = jNextInt ^ j3;
        long j6 = jLongValue ^ j3;
        long j7 = (((long) (-433)) * j) + (((long) (-216)) * jLongValue) + ((((j4 | j5) ^ j3) | ((j6 | jNextInt) ^ j3)) * j2) + ((((j4 | j6) ^ j3) | ((jNextInt | j4) ^ j3)) * j2) + (j2 * (((j6 | j5) ^ j3) | j)) + ((long) (-309883432));
        int i130 = ~(((int) Process.getElapsedCpuTime()) | (-1168252402));
        int i131 = ((int) (j7 >> 32)) & ((((554799506 | i130) * (-658)) - 1029350706) + ((i130 | 16781712) * 658));
        int i132 = ~((int) Process.getElapsedCpuTime());
        int i133 = ((int) j7) & (((1019428157 + (((~(i132 | (-34161698))) | (~((-272630153) | i132))) * (-184))) + (((1275474518 | (~((-1548104671) | i132))) | (~((-1309636216) | i132))) * 184)) - 920764600);
        int i134 = (i131 & i133) | (i131 ^ i133);
        int i135 = TuitionPaymentFragmentbindingInflater1;
        int i136 = ((i135 | 1) << 1) - (i135 ^ 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i136 % 128;
        int i137 = i136 % 2;
        int i138 = i134 >>> 24;
        int i139 = i134 & ViewCompat.MEASURED_SIZE_MASK;
        if (i138 != 0) {
            DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i140 = TuitionPaymentFragmentbindingInflater1;
            int i141 = ((i140 | 113) << 1) - (i140 ^ 113);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i141 % 128;
            int i142 = i141 % 2;
            z = true;
        } else {
            int i143 = i135 + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i143 % 128;
            int i144 = i143 % 2;
            z = false;
        }
        int i145 = 1;
        if (!(!z)) {
            int i146 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i147 = (i146 ^ 99) + ((i146 & 99) << 1);
            int i148 = i147 % 128;
            TuitionPaymentFragmentbindingInflater1 = i148;
            int i149 = i147 % 2;
            int i150 = i148 + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i150 % 128;
            int i151 = i150 % 2;
        } else {
            i145 = 0;
        }
        if (z) {
            int i152 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i153 = (i152 & 65) + (i152 | 65);
            TuitionPaymentFragmentbindingInflater1 = i153 % 128;
            if (i153 % 2 == 0) {
                int i154 = 13 / 0;
                if (i139 < methodArr.length) {
                    method = methodArr[i139];
                    if (method != null) {
                        i = i152 + 103;
                        TuitionPaymentFragmentbindingInflater1 = i % 128;
                        if (i % 2 != 0) {
                            method.toString();
                            throw null;
                        }
                        string = method.toString();
                    }
                }
            } else if (i139 < methodArr.length) {
                method = methodArr[i139];
                if (method != null) {
                    i = i152 + 103;
                    TuitionPaymentFragmentbindingInflater1 = i % 128;
                    if (i % 2 != 0) {
                        method.toString();
                        throw null;
                    }
                    string = method.toString();
                }
            }
            string = null;
        } else {
            string = null;
        }
        list.add(string);
        return (i138 + 6) * i145;
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
    private static java.lang.String $$g(short r7, short r8, short r9) {
        /*
            int r9 = r9 * 4
            int r9 = 3 - r9
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r0 = com.google.android.gms.auth.api.identity.zby.$$c
            int r7 = r7 * 56
            int r7 = r7 + 66
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r8
            r3 = r9
            r5 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            int r9 = r9 + 1
            if (r5 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2c:
            int r7 = r7 + r9
            r9 = r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.identity.zby.$$g(short, short, short):java.lang.String");
    }
}
