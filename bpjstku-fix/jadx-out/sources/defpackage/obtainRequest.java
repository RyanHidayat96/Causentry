package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity;
import com.google.firebase.sessions.dagger.internal.Providers;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class obtainRequest implements Function0 {
    private /* synthetic */ NewRegistrationVerifyEmailOtpActivity TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {29, 88, -118, 32};
    private static final int $$f = 68;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {39, -79, 42, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 69;
    private static final byte[] $$a = {113, 29, -123, -97, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 36, 19, 4, 10, -8, 8, 0, -22, 22, 15, -11, 8, 0, 15, 0, 17, -34, 19, 4, 10, -8, 8, 0, -26, 39, -6, 11};
    private static final int $$b = 175;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static int b = -83722273;

    public /* synthetic */ obtainRequest(NewRegistrationVerifyEmailOtpActivity newRegistrationVerifyEmailOtpActivity) {
        this.TuitionPaymentFragmentbindingInflater1 = newRegistrationVerifyEmailOtpActivity;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.obtainRequest.$$a
            int r8 = r8 * 19
            int r1 = 33 - r8
            int r7 = r7 + 4
            int r6 = r6 * 6
            int r6 = r6 + 97
            byte[] r1 = new byte[r1]
            int r8 = 32 - r8
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2e:
            int r7 = r7 + r6
            int r6 = r7 + (-2)
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.obtainRequest.a(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.obtainRequest.$$d
            int r8 = r8 * 52
            int r1 = r8 + 1
            int r7 = r7 + 84
            int r6 = r6 * 52
            int r6 = 54 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2e
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r6 = r6 + 1
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.obtainRequest.c(byte, short, int, java.lang.Object[]):void");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentbindingInflater1 = NewRegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return registrationForUnregisteredTuitionPaymentFragmentbindingInflater1;
    }

    private static void d(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i5]), Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 1;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 3290 - ImageFormat.getBitsPerPixel(0), TextUtils.indexOf((CharSequence) "", '0') + 32, 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 650 - TextUtils.indexOf((CharSequence) "", '0', 0), AndroidCharacter.getMirror('0') - 4, -450685997, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i6 = $11 + 3;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 651 - (ViewConfiguration.getPressedStateDuration() >> 16), 44 - Gravity.getAbsoluteGravity(0, 0), -450685997, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            int i7 = $11 + 99;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0864 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x097c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x076a A[PHI: r3
  0x076a: PHI (r3v116 int) = (r3v115 int), (r3v143 int) binds: [B:50:0x0766, B:47:0x0758] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0877  */
    /* JADX WARN: Code duplicated, block: B:59:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:63:0x091b A[Catch: all -> 0x0b8a, TryCatch #0 {all -> 0x0b8a, blocks: (B:61:0x0904, B:63:0x091b, B:64:0x0964, B:77:0x09dc, B:79:0x09e9, B:80:0x0a2a, B:82:0x0a49, B:83:0x0a91), top: B:107:0x0904 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0b69  */
    public static int b(List list) throws Throwable {
        int i;
        boolean z;
        int i2;
        Method method;
        int i3;
        int i4;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i5 = 2;
        int i6 = 2 % 2;
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i8 = 1;
        int i9 = (i7 ^ 125) + ((i7 & 125) << 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
        int i10 = i9 % 2;
        byte[] bArr = $$a;
        byte b2 = bArr[28];
        Object[] objArr2 = new Object[1];
        a(b2, bArr[7], b2, objArr2);
        int i11 = 0;
        Class<?> cls = Class.forName((String) objArr2[0]);
        byte b3 = bArr[13];
        byte b4 = b3;
        Object[] objArr3 = new Object[1];
        a(b4, (byte) (b4 | 30), b3, objArr3);
        Method method2 = cls.getMethod((String) objArr3[0], String.class, Integer.TYPE);
        Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
        byte b5 = bArr[13];
        byte b6 = b5;
        Object[] objArr4 = new Object[1];
        a(b6, (byte) (b6 | 30), b5, objArr4);
        Method[] methodArr = {method2, cls2.getMethod((String) objArr4[0], String.class, Integer.TYPE)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        long j = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i12 = 2824 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int iAxisFromString = 21 - MotionEvent.axisFromString("");
            byte[] bArr2 = $$d;
            byte b7 = bArr2[4];
            Object[] objArr5 = new Object[1];
            c((byte) (-b7), bArr2[6], (byte) (-b7), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarFadeDuration, i12, iAxisFromString, 1814927978, false, (String) objArr5[0], null);
        }
        float f = 0.0f;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
            int i14 = i13 % 2;
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.MeasureSpec.getSize(0), 2823 - TextUtils.indexOf("", ""), TextUtils.getOffsetBefore("", 0) + 22)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i15 = 0;
            while (i15 < length) {
                int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i17 = i16 + 85;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
                int i18 = i17 % i5;
                Method method3 = declaredMethods[i15];
                int i19 = i16 + 41;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
                int i20 = i19 % i5;
                try {
                    int i21 = -Color.argb(i11, i11, i11, i11);
                    int iTuitionPaymentFragmentbindingInflater1 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                    int i22 = i21 * (-109);
                    int i23 = ((i22 | 31635) << i8) - (i22 ^ 31635);
                    int i24 = ~i21;
                    int i25 = ~((iTuitionPaymentFragmentbindingInflater1 ^ 285) | (iTuitionPaymentFragmentbindingInflater1 & 285));
                    int i26 = ((i24 ^ i25) | (i24 & i25)) * (-220);
                    int i27 = (i23 & i26) + (i23 | i26);
                    int i28 = -(-((i25 | (~((i21 ^ 285) | (i21 & 285)))) * 220));
                    int i29 = ((i27 | i28) << i8) - (i27 ^ i28);
                    int i30 = ~((i24 ^ 285) | (i24 & 285));
                    int i31 = ~((-286) | i21);
                    int i32 = ((i30 & i31) | (i30 ^ i31)) * 110;
                    int i33 = ((i29 | i32) << i8) - (i32 ^ i29);
                    int i34 = -ImageFormat.getBitsPerPixel(i11);
                    int iTuitionPaymentFragmentbindingInflater2 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                    int i35 = ~i34;
                    int i36 = (i35 & (-24)) | (i35 ^ (-24));
                    int i37 = ~((i36 & iTuitionPaymentFragmentbindingInflater2) | (i36 ^ iTuitionPaymentFragmentbindingInflater2));
                    int i38 = ~iTuitionPaymentFragmentbindingInflater2;
                    int i39 = (i38 ^ i34) | (i38 & i34);
                    int i40 = ~((i39 ^ 23) | (i39 & 23));
                    int i41 = (i34 * (-317)) + 7337 + (((i37 ^ i40) | (i37 & i40)) * (-318));
                    int i42 = ~(((-24) ^ i34) | ((-24) & i34));
                    int i43 = ~((i34 ^ iTuitionPaymentFragmentbindingInflater2) | (i34 & iTuitionPaymentFragmentbindingInflater2));
                    int i44 = ~i34;
                    int i45 = ~((i44 & iTuitionPaymentFragmentbindingInflater2) | (i44 ^ iTuitionPaymentFragmentbindingInflater2));
                    int i46 = ((i41 + (((i42 ^ i43) | (i43 & i42)) * (-318))) - (~(-(-((((-24) & i45) | ((-24) ^ i45)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))))) - 1;
                    int i47 = (TypedValue.complexToFraction(i11, f, f) > f ? 1 : (TypedValue.complexToFraction(i11, f, f) == f ? 0 : -1));
                    Object[] objArr6 = new Object[i8];
                    d(false, i33, i46, ((i47 | 24) << i8) - (i47 ^ 24), new char[]{'\n', 1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4}, objArr6);
                    Class<?> cls3 = Class.forName((String) objArr6[i11]);
                    int i48 = (ExpandableListView.getPackedPositionForGroup(i11) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(i11) == j ? 0 : -1));
                    int i49 = ((i48 | 293) << i8) - (i48 ^ 293);
                    int i50 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i51 = (i50 ^ 89) + ((i50 & 89) << i8);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i51 % 128;
                    int i52 = i51 % 2;
                    int i53 = -TextUtils.indexOf("", "", i11, i11);
                    int iTuitionPaymentFragmentbindingInflater3 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                    int i54 = (i53 * 491) - 5868;
                    int i55 = ~i53;
                    int i56 = i55 | (-13);
                    int i57 = ~iTuitionPaymentFragmentbindingInflater3;
                    int i58 = -(-(((i56 ^ i57) | (i56 & i57)) * (-490)));
                    int i59 = ~((i53 & (-13)) | ((-13) ^ i53));
                    int i60 = ~((iTuitionPaymentFragmentbindingInflater3 & (-13)) | ((-13) ^ iTuitionPaymentFragmentbindingInflater3));
                    int i61 = ((((i54 ^ i58) + ((i58 & i54) << i8)) + (((i59 & i60) | (i59 ^ i60)) * 490)) - (~(-(-(i55 * 490))))) - 1;
                    int i62 = -(TypedValue.complexToFloat(i11) > f ? 1 : (TypedValue.complexToFloat(i11) == f ? 0 : -1));
                    int iTuitionPaymentFragmentbindingInflater4 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                    int i63 = i62 * 677;
                    int i64 = ((i63 | (-5400)) << i8) - (i63 ^ (-5400));
                    int i65 = (i62 ^ iTuitionPaymentFragmentbindingInflater4) | (i62 & iTuitionPaymentFragmentbindingInflater4);
                    int i66 = -(-(((i65 & (-9)) | (i65 ^ (-9))) * (-676)));
                    int i67 = (i64 ^ i66) + ((i66 & i64) << i8);
                    int i68 = ~(((-9) ^ i62) | ((-9) & i62));
                    int i69 = ~iTuitionPaymentFragmentbindingInflater4;
                    int i70 = (i67 - (~((i68 | (~((i69 ^ i62) | (i69 & i62)))) * 676))) - i8;
                    int i71 = ~i62;
                    int i72 = ~((i71 & (-9)) | (i71 ^ (-9)));
                    int i73 = ~iTuitionPaymentFragmentbindingInflater4;
                    int i74 = i62 | 8;
                    int i75 = ((~((i74 & iTuitionPaymentFragmentbindingInflater4) | (i74 ^ iTuitionPaymentFragmentbindingInflater4))) | i72 | (~(((-9) ^ i73) | ((-9) & i73)))) * 676;
                    Object[] objArr7 = new Object[i8];
                    d(true, i49, i61, (i70 ^ i75) + ((i75 & i70) << i8), new char[]{65534, 1, 65532, 7, 65509, '\f', 65533, 65535, 11, '\n', 65533, 1}, objArr7);
                    Object[] objArr8 = new Object[i8];
                    objArr8[i11] = Integer.valueOf(((Integer) cls3.getMethod((String) objArr7[i11], null).invoke(method3, null)).intValue());
                    int i76 = -TextUtils.lastIndexOf("", '0', i11);
                    int i77 = (i76 & 285) + (i76 | 285);
                    int i78 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i79 = (i78 ^ 67) + ((i78 & 67) << i8);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i79 % 128;
                    int i80 = i79 % 2;
                    int i81 = -((byte) KeyEvent.getModifierMetaStateMask());
                    int i82 = (i81 ^ 25) + ((i81 & 25) << i8);
                    int i83 = -(AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1));
                    int iTuitionPaymentFragmentbindingInflater5 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                    int i84 = i83 * (-337);
                    int i85 = (i84 ^ 4068) + ((i84 & 4068) << i8);
                    int i86 = ~i83;
                    int i87 = ~((~iTuitionPaymentFragmentbindingInflater5) | i86);
                    int i88 = ~((-13) | i83);
                    int i89 = (i87 ^ i88) | (i88 & i87);
                    int i90 = ~((i83 ^ iTuitionPaymentFragmentbindingInflater5) | (i83 & iTuitionPaymentFragmentbindingInflater5));
                    int i91 = ((i85 + (((i89 ^ i90) | (i90 & i89)) * (-338))) - (~((~((i86 ^ 12) | (i86 & 12))) * 338))) - i8;
                    int i92 = (i83 & 12) | (i83 ^ 12);
                    int i93 = ~((i92 & iTuitionPaymentFragmentbindingInflater5) | (i92 ^ iTuitionPaymentFragmentbindingInflater5));
                    Object[] objArr9 = new Object[i8];
                    d(true, i77, i82, i91 + (((i93 & i87) | (i87 ^ i93)) * 338), new char[]{4, 17, 65485, 6, '\r', 0, 11, 65485, 0, 21, 0, '\t', 17, 4, '\b', 5, '\b', 3, 14, 65516, 65485, 19, 2, 4, 11, 5}, objArr9);
                    Class<?> cls4 = Class.forName((String) objArr9[0]);
                    int i94 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i95 = (i94 & 25) + (i94 | 25);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i95 % 128;
                    int i96 = i95 % 2;
                    int i97 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int iTuitionPaymentFragmentbindingInflater6 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                    int i98 = ~i97;
                    int i99 = (i98 ^ (-294)) | (i98 & (-294));
                    int i100 = ~iTuitionPaymentFragmentbindingInflater6;
                    int i101 = ((i97 * 491) - 143277) + (((i99 ^ i100) | (i99 & i100)) * (-490)) + (((~((i97 & (-294)) | ((-294) ^ i97))) | (~((iTuitionPaymentFragmentbindingInflater6 & (-294)) | ((-294) ^ iTuitionPaymentFragmentbindingInflater6)))) * 490);
                    int i102 = -(-(i98 * 490));
                    int i103 = (i101 ^ i102) + ((i102 & i101) << i8);
                    int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                    int iTuitionPaymentFragmentbindingInflater7 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                    int i104 = (maximumDrawingCacheSize * (-751)) - 6008;
                    int i105 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i105 % 128;
                    int i106 = i105 % 2;
                    int i107 = ~maximumDrawingCacheSize;
                    int i108 = -(-(1504 * ((~((i107 ^ (-9)) | (i107 & (-9)))) | (~((i107 ^ iTuitionPaymentFragmentbindingInflater7) | (i107 & iTuitionPaymentFragmentbindingInflater7))))));
                    int i109 = ((i104 | i108) << i8) - (i104 ^ i108);
                    int i110 = ~maximumDrawingCacheSize;
                    int i111 = (i110 & 8) | (i110 ^ 8);
                    int i112 = (~((iTuitionPaymentFragmentbindingInflater7 & i111) | (i111 ^ iTuitionPaymentFragmentbindingInflater7))) * (-1504);
                    int i113 = (i109 ^ i112) + ((i112 & i109) << i8);
                    int i114 = -(-(((~(((-9) & maximumDrawingCacheSize) | ((-9) ^ maximumDrawingCacheSize))) | (~((i107 ^ 8) | (i107 & 8)))) * 752));
                    int i115 = ((i113 | i114) << i8) - (i114 ^ i113);
                    int i116 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int iTuitionPaymentFragmentbindingInflater8 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                    int i117 = (i116 * 85) + 340;
                    int i118 = ~i116;
                    int i119 = ~((i118 ^ (-5)) | (i118 & (-5)));
                    int i120 = ~iTuitionPaymentFragmentbindingInflater8;
                    int i121 = ~((i118 ^ i120) | (i118 & i120));
                    int i122 = (i119 ^ i121) | (i121 & i119);
                    int i123 = ~iTuitionPaymentFragmentbindingInflater8;
                    int i124 = ~(((-5) ^ i123) | ((-5) & i123));
                    int i125 = (i122 ^ i124) | (i124 & i122);
                    int i126 = i116 | 4;
                    int i127 = -(-((i125 | (~((i126 ^ iTuitionPaymentFragmentbindingInflater8) | (i126 & iTuitionPaymentFragmentbindingInflater8)))) * (-84)));
                    int i128 = ((i117 | i127) << i8) - (i127 ^ i117);
                    int i129 = ~(((-5) & iTuitionPaymentFragmentbindingInflater8) | ((-5) ^ iTuitionPaymentFragmentbindingInflater8));
                    int i130 = (i129 & i116) | (i116 ^ i129);
                    int i131 = ~((i123 ^ 4) | (i123 & 4));
                    int i132 = ((i130 & i131) | (i130 ^ i131)) * (-84);
                    int i133 = ((i128 | i132) << i8) - (i132 ^ i128);
                    int i134 = ~((i120 ^ 4) | (i120 & 4));
                    int i135 = ~((i116 & 4) | (i116 ^ 4));
                    int i136 = i134 ^ i135;
                    Object[] objArr10 = new Object[i8];
                    d(false, i103, i115, i133 + (((i135 & i134) | i136) * 84), new char[]{1, 14, 65533, 1, 11, 65510, 65529, '\f'}, objArr10);
                    String str = (String) objArr10[0];
                    Class<?>[] clsArr = new Class[i8];
                    clsArr[0] = Integer.TYPE;
                    if (((Boolean) cls4.getMethod(str, clsArr).invoke(null, objArr8)).booleanValue()) {
                        Class cls5 = Long.TYPE;
                        int i137 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int i138 = (i137 ^ 286) + ((i137 & 286) << i8);
                        int i139 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int iTuitionPaymentFragmentbindingInflater9 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                        int i140 = i139 * 569;
                        int i141 = (i140 ^ 14225) + ((i140 & 14225) << i8);
                        int i142 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i143 = (i142 & 77) + (i142 | 77);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i143 % 128;
                        int i144 = i143 % 2;
                        int i145 = ~i139;
                        int i146 = ~((i145 & (-26)) | (i145 ^ (-26)));
                        int i147 = ~i139;
                        int i148 = ~iTuitionPaymentFragmentbindingInflater9;
                        int i149 = ~((i147 ^ i148) | (i147 & i148));
                        int i150 = (i146 ^ i149) | (i149 & i146);
                        int i151 = ~(((-26) ^ i148) | ((-26) & i148));
                        int i152 = i141 + ((-1136) * ((i150 ^ i151) | (i150 & i151)));
                        int i153 = ~((i147 ^ iTuitionPaymentFragmentbindingInflater9) | (i147 & iTuitionPaymentFragmentbindingInflater9));
                        int i154 = ~(((-26) ^ iTuitionPaymentFragmentbindingInflater9) | ((-26) & iTuitionPaymentFragmentbindingInflater9));
                        int i155 = (i153 & i154) | (i153 ^ i154);
                        int i156 = i139 | (~iTuitionPaymentFragmentbindingInflater9);
                        int i157 = ~((i156 ^ 25) | (i156 & 25));
                        int i158 = i152 + (((i155 & i157) | (i155 ^ i157)) * (-568));
                        int i159 = ~i156;
                        int i160 = ~((i148 ^ 25) | (i148 & 25));
                        int i161 = (i159 & i160) | (i159 ^ i160);
                        int i162 = i142 + 23;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i162 % 128;
                        int i163 = i162 % 2;
                        int i164 = (i147 ^ (-26)) | (i147 & (-26));
                        int i165 = -(-(568 * (i161 | (~((i164 & iTuitionPaymentFragmentbindingInflater9) | (i164 ^ iTuitionPaymentFragmentbindingInflater9))))));
                        Object[] objArr11 = new Object[1];
                        d(false, i138, (i158 & i165) + (i165 | i158), 24 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{'\n', 1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4}, objArr11);
                        Class<?> cls6 = Class.forName((String) objArr11[0]);
                        int i166 = -TextUtils.indexOf("", "", 0, 0);
                        int iTuitionPaymentFragmentbindingInflater10 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                        int i167 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i167 % 128;
                        int i168 = i167 % 2;
                        int i169 = (i166 * 236) + 138945;
                        int i170 = ~i166;
                        int i171 = ~iTuitionPaymentFragmentbindingInflater10;
                        int i172 = ~((i170 & i171) | (i170 ^ i171));
                        int i173 = -(-(((i172 & 295) | (295 ^ i172)) * (-235)));
                        int i174 = (i169 & i173) + (i169 | i173);
                        int i175 = ~i166;
                        int i176 = ~((i175 ^ iTuitionPaymentFragmentbindingInflater10) | (i175 & iTuitionPaymentFragmentbindingInflater10));
                        int i177 = -(-(((i176 & 295) | (295 ^ i176)) * (-470)));
                        int i178 = ~((i166 & (-296)) | ((-296) ^ i166));
                        int i179 = (i175 & 295) | (i175 ^ 295);
                        int i180 = ~((iTuitionPaymentFragmentbindingInflater10 & i179) | (i179 ^ iTuitionPaymentFragmentbindingInflater10));
                        int i181 = (((i174 | i177) << 1) - (i177 ^ i174)) + (((i178 & i180) | (i178 ^ i180)) * 235);
                        int i182 = 12 - (~(ViewConfiguration.getFadingEdgeLength() >> 16));
                        int i183 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int iTuitionPaymentFragmentbindingInflater11 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                        int i184 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i185 = (i184 ^ 79) + ((i184 & 79) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i185 % 128;
                        int i186 = i185 % 2;
                        int i187 = ~i183;
                        int i188 = ~iTuitionPaymentFragmentbindingInflater11;
                        int i189 = (((i183 * (-518)) - 3626) - (~(-(-(((~((i187 ^ i188) | (i187 & i188))) | 7) * 519))))) - 1;
                        int i190 = ~((i187 & i188) | (i187 ^ i188) | 7);
                        int i191 = (i183 ^ 7) | (i183 & 7);
                        int i192 = ~((i191 & iTuitionPaymentFragmentbindingInflater11) | (i191 ^ iTuitionPaymentFragmentbindingInflater11));
                        int i193 = i189 + (((i190 & i192) | (i190 ^ i192)) * (-519));
                        int i194 = ~((iTuitionPaymentFragmentbindingInflater11 & 7) | (iTuitionPaymentFragmentbindingInflater11 ^ 7));
                        int i195 = ((i183 & i194) | (i183 ^ i194)) * 519;
                        Object[] objArr12 = new Object[1];
                        d(true, i181, i182, ((i193 | i195) << 1) - (i195 ^ i193), new char[]{'\b', 11, '\n', 65531, 65512, '\n', 65531, 65533, 65531, 6, 15, 65514, 4}, objArr12);
                        if (cls5.equals(cls6.getMethod((String) objArr12[0], null).invoke(method3, null))) {
                            int i196 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i196 % 128;
                            int i197 = i196 % 2;
                            int i198 = 284 - (~(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                            int i199 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int i200 = (i199 ^ 24) + ((i199 & 24) << 1);
                            int i201 = -Process.getGidForName("");
                            int iTuitionPaymentFragmentbindingInflater12 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                            int i202 = ~((i201 ^ iTuitionPaymentFragmentbindingInflater12) | (i201 & iTuitionPaymentFragmentbindingInflater12));
                            int i203 = (((i201 * 673) - 30889) - (~(((i202 & 23) | (i202 ^ 23)) * 672))) - 1;
                            int i204 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i205 = ((i204 | 1) << 1) - (i204 ^ 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i205 % 128;
                            int i206 = i205 % 2;
                            int i207 = ~i201;
                            int i208 = ~iTuitionPaymentFragmentbindingInflater12;
                            int i209 = ~((i207 & i208) | (i207 ^ i208));
                            int i210 = ~((iTuitionPaymentFragmentbindingInflater12 & 23) | (23 ^ iTuitionPaymentFragmentbindingInflater12));
                            int i211 = i203 + ((-672) * ((i210 & i209) | (i209 ^ i210)));
                            int i212 = ((i204 | 85) << 1) - (i204 ^ 85);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i212 % 128;
                            if (i212 % 2 != 0) {
                                i3 = i211 >> (672 / ((~(i201 | (-24))) | (~(((-24) & i208) | ((-24) ^ i208)))));
                            } else {
                                int i213 = ((~((i201 & (-24)) | ((-24) ^ i201))) | (~((-24) | i208))) * 672;
                                i3 = (i211 & i213) + (i213 | i211);
                            }
                            int i214 = ((i204 | 37) << 1) - (i204 ^ 37);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i214 % 128;
                            int i215 = i214 % 2;
                            Object[] objArr13 = new Object[1];
                            d(false, i198, i200, i3, new char[]{'\n', 1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4}, objArr13);
                            Class<?> cls7 = Class.forName((String) objArr13[0]);
                            int i216 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int i217 = ((i216 | 293) << 1) - (i216 ^ 293);
                            int i218 = 17 - (~(-(-TextUtils.lastIndexOf("", '0', 0))));
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            Object[] objArr14 = new Object[1];
                            d(false, i217, i218, ((iMakeMeasureSpec | 5) << 1) - (iMakeMeasureSpec ^ 5), new char[]{65516, 17, '\b', 65533, 11, 65535, 65533, '\f', 65512, 65529, '\n', 65529, 5, 65533, '\f', 65533, '\n'}, objArr14);
                            Method method4 = cls7.getMethod((String) objArr14[0], null);
                            int i219 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i220 = (i219 & 3) + (i219 | 3);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i220 % 128;
                            int i221 = i220 % 2;
                            Object[] objArr15 = (Object[]) method4.invoke(method3, null);
                            if (objArr15.length == 2) {
                                int i222 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i222 % 128;
                                if (i222 % 2 == 0) {
                                    i4 = 1;
                                    if (Long.TYPE.equals(objArr15[1])) {
                                        int i223 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int i224 = ((i223 | 285) << i4) - (i223 ^ 285);
                                        int i225 = -View.MeasureSpec.getMode(0);
                                        int iTuitionPaymentFragmentbindingInflater13 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                                        int i226 = i225 * 615;
                                        int i227 = (i226 ^ (-14712)) + ((i226 & (-14712)) << 1);
                                        int i228 = ~i225;
                                        int i229 = ~(i228 | 24);
                                        int i230 = (i227 - (~((((i229 & iTuitionPaymentFragmentbindingInflater13) | (iTuitionPaymentFragmentbindingInflater13 ^ i229)) | (~(((-25) & i225) | ((-25) ^ i225)))) * 614))) - 1;
                                        int i231 = ~i225;
                                        int i232 = ~iTuitionPaymentFragmentbindingInflater13;
                                        int i233 = ~((i231 & i232) | (i231 ^ i232));
                                        int i234 = ~(i228 | 24);
                                        int i235 = (i233 & i234) | (i233 ^ i234);
                                        int i236 = ~iTuitionPaymentFragmentbindingInflater13;
                                        int i237 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i238 = ((i237 | 75) << 1) - (i237 ^ 75);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i238 % 128;
                                        int i239 = i238 % 2;
                                        int i240 = ~((i236 & 24) | (i236 ^ 24));
                                        int i241 = (-1228) * ((i240 & i235) | (i235 ^ i240));
                                        int i242 = ((i230 | i241) << 1) - (i230 ^ i241);
                                        int i243 = (i228 & (-25)) | (i228 ^ (-25));
                                        int i244 = ~((i243 & i232) | (i243 ^ i232));
                                        int i245 = (i225 & i232) | (i232 ^ i225);
                                        int i246 = ~((i245 & 24) | (i245 ^ 24));
                                        int i247 = -(-(((i246 & i244) | (i244 ^ i246)) * 614));
                                        int i248 = (i242 & i247) + (i247 | i242);
                                        int i249 = -(ViewConfiguration.getTouchSlop() >> 8);
                                        int iTuitionPaymentFragmentbindingInflater14 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                                        int i250 = ~i249;
                                        int i251 = ~((i250 & (-25)) | (i250 ^ (-25)));
                                        int i252 = ~(((-25) & iTuitionPaymentFragmentbindingInflater14) | ((-25) ^ iTuitionPaymentFragmentbindingInflater14));
                                        int i253 = (i251 & i252) | (i251 ^ i252);
                                        int i254 = ~iTuitionPaymentFragmentbindingInflater14;
                                        int i255 = (((((i249 * 1773) - 21240) - (~((i253 | (~((i254 | i249) | 24))) * 886))) - 1) - (~(((~(i254 | 24)) | i249) * (-1772)))) - 1;
                                        int i256 = ~iTuitionPaymentFragmentbindingInflater14;
                                        int i257 = -(-((~((i249 & i256) | (i256 ^ i249))) * 886));
                                        objArr = new Object[1];
                                        d(false, i224, i248, ((i255 | i257) << 1) - (i257 ^ i255), new char[]{'\n', 1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4}, objArr);
                                        if (!(!Class.forName((String) objArr[0]).equals(objArr15[1]))) {
                                            int i258 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i258 % 128;
                                            int i259 = i258 % 2;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                                                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 2824;
                                                int capsMode = 22 - TextUtils.getCapsMode("", 0, 0);
                                                byte[] bArr3 = $$d;
                                                byte b8 = bArr3[4];
                                                Object[] objArr16 = new Object[1];
                                                c((byte) (-b8), bArr3[6], (byte) (-b8), objArr16);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, modifierMetaStateMask, capsMode, 1814927978, false, (String) objArr16[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method3);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                                                int iIndexOf = TextUtils.indexOf("", "", 0) + 2823;
                                                int packedPositionGroup = 22 - ExpandableListView.getPackedPositionGroup(0L);
                                                byte[] bArr4 = $$d;
                                                byte b9 = bArr4[4];
                                                Object[] objArr17 = new Object[1];
                                                c((byte) (-b9), bArr4[6], (byte) (-b9), objArr17);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, iIndexOf, packedPositionGroup, 1814927978, false, (String) objArr17[0], null);
                                            }
                                            try {
                                                Object[] objArr18 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                                                    int i260 = 2824 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                    int iIndexOf2 = TextUtils.indexOf("", "", 0) + 22;
                                                    byte[] bArr5 = $$d;
                                                    byte b10 = bArr5[6];
                                                    Object[] objArr19 = new Object[1];
                                                    c(b10, bArr5[53], b10, objArr19);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, i260, iIndexOf2, -2137287382, false, (String) objArr19[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr18)).longValue();
                                                int i261 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i261 % 128;
                                                int i262 = i261 % 2;
                                                break;
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    i4 = 1;
                                    if (!Long.TYPE.equals(objArr15[0])) {
                                        continue;
                                    } else {
                                        int i2210 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int i2211 = ((i2210 | 285) << i4) - (i2210 ^ 285);
                                        int i2212 = -View.MeasureSpec.getMode(0);
                                        int iTuitionPaymentFragmentbindingInflater15 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                                        int i2213 = i2212 * 615;
                                        int i2214 = (i2213 ^ (-14712)) + ((i2213 & (-14712)) << 1);
                                        int i2215 = ~i2212;
                                        int i2216 = ~(i2215 | 24);
                                        int i2310 = (i2214 - (~((((i2216 & iTuitionPaymentFragmentbindingInflater15) | (iTuitionPaymentFragmentbindingInflater15 ^ i2216)) | (~(((-25) & i2212) | ((-25) ^ i2212)))) * 614))) - 1;
                                        int i2311 = ~i2212;
                                        int i2312 = ~iTuitionPaymentFragmentbindingInflater15;
                                        int i2313 = ~((i2311 & i2312) | (i2311 ^ i2312));
                                        int i2314 = ~(i2215 | 24);
                                        int i2315 = (i2313 & i2314) | (i2313 ^ i2314);
                                        int i2316 = ~iTuitionPaymentFragmentbindingInflater15;
                                        int i2317 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i2318 = ((i2317 | 75) << 1) - (i2317 ^ 75);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2318 % 128;
                                        int i2319 = i2318 % 2;
                                        int i2410 = ~((i2316 & 24) | (i2316 ^ 24));
                                        int i2411 = (-1228) * ((i2410 & i2315) | (i2315 ^ i2410));
                                        int i2412 = ((i2310 | i2411) << 1) - (i2310 ^ i2411);
                                        int i2413 = (i2215 & (-25)) | (i2215 ^ (-25));
                                        int i2414 = ~((i2413 & i2312) | (i2413 ^ i2312));
                                        int i2415 = (i2212 & i2312) | (i2312 ^ i2212);
                                        int i2416 = ~((i2415 & 24) | (i2415 ^ 24));
                                        int i2417 = -(-(((i2416 & i2414) | (i2414 ^ i2416)) * 614));
                                        int i2418 = (i2412 & i2417) + (i2417 | i2412);
                                        int i2419 = -(ViewConfiguration.getTouchSlop() >> 8);
                                        int iTuitionPaymentFragmentbindingInflater16 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                                        int i2510 = ~i2419;
                                        int i2511 = ~((i2510 & (-25)) | (i2510 ^ (-25)));
                                        int i2512 = ~(((-25) & iTuitionPaymentFragmentbindingInflater16) | ((-25) ^ iTuitionPaymentFragmentbindingInflater16));
                                        int i2513 = (i2511 & i2512) | (i2511 ^ i2512);
                                        int i2514 = ~iTuitionPaymentFragmentbindingInflater16;
                                        int i2515 = (((((i2419 * 1773) - 21240) - (~((i2513 | (~((i2514 | i2419) | 24))) * 886))) - 1) - (~(((~(i2514 | 24)) | i2419) * (-1772)))) - 1;
                                        int i2516 = ~iTuitionPaymentFragmentbindingInflater16;
                                        int i2517 = -(-((~((i2419 & i2516) | (i2516 ^ i2419))) * 886));
                                        objArr = new Object[1];
                                        d(false, i2211, i2418, ((i2515 | i2517) << 1) - (i2517 ^ i2515), new char[]{'\n', 1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4}, objArr);
                                        if (!(!Class.forName((String) objArr[0]).equals(objArr15[1]))) {
                                            int i2518 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2518 % 128;
                                            int i2519 = i2518 % 2;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                                                int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 2824;
                                                int capsMode2 = 22 - TextUtils.getCapsMode("", 0, 0);
                                                byte[] bArr6 = $$d;
                                                byte b11 = bArr6[4];
                                                Object[] objArr110 = new Object[1];
                                                c((byte) (-b11), bArr6[6], (byte) (-b11), objArr110);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf2, modifierMetaStateMask2, capsMode2, 1814927978, false, (String) objArr110[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method3);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cResolveOpacity2 = (char) Drawable.resolveOpacity(0, 0);
                                                int iIndexOf3 = TextUtils.indexOf("", "", 0) + 2823;
                                                int packedPositionGroup2 = 22 - ExpandableListView.getPackedPositionGroup(0L);
                                                byte[] bArr7 = $$d;
                                                byte b12 = bArr7[4];
                                                Object[] objArr111 = new Object[1];
                                                c((byte) (-b12), bArr7[6], (byte) (-b12), objArr111);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity2, iIndexOf3, packedPositionGroup2, 1814927978, false, (String) objArr111[0], null);
                                            }
                                            Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                                                int i263 = 2824 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                int iIndexOf4 = TextUtils.indexOf("", "", 0) + 22;
                                                byte[] bArr8 = $$d;
                                                byte b13 = bArr8[6];
                                                Object[] objArr113 = new Object[1];
                                                c(b13, bArr8[53], b13, objArr113);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar2, i263, iIndexOf4, -2137287382, false, (String) objArr113[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
                                            int i264 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i264 % 128;
                                            int i265 = i264 % 2;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    i15 = ((i15 | 1) << 1) - (i15 ^ 1);
                    i5 = 2;
                    i11 = 0;
                    i8 = 1;
                    j = 0;
                    f = 0.0f;
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
            char cAlpha = (char) Color.alpha(0);
            int mirror = 2871 - AndroidCharacter.getMirror('0');
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 22;
            byte[] bArr9 = $$d;
            byte b14 = bArr9[4];
            Object[] objArr20 = new Object[1];
            c((byte) (-b14), bArr9[6], (byte) (-b14), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha, mirror, iResolveOpacity, 1814927978, false, (String) objArr20[0], null);
        }
        Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char c = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int i266 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2822;
            int i267 = 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            byte b15 = $$d[6];
            byte b16 = b15;
            Object[] objArr22 = new Object[1];
            c(b16, (byte) (b16 | 14), b15, objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, i266, i267, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
        Object[] objArr23 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 37657);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 2720;
            int maxKeyCode = 19 - (KeyEvent.getMaxKeyCode() >> 16);
            byte b17 = $$d[6];
            byte b18 = b17;
            Object[] objArr24 = new Object[1];
            c(b18, (byte) (b18 | 14), b17, objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionType, iMakeMeasureSpec2, maxKeyCode, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
        long j2 = -140192679;
        long j3 = -495;
        long j4 = -1;
        long j5 = j2 ^ j4;
        long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        long j6 = ((j5 | (jLongValue ^ j4)) ^ j4) | ((j5 | startElapsedRealtime) ^ j4);
        long j7 = (j3 * j2) + (j3 * jLongValue) + (((long) 992) * j6) + (((long) (-496)) * (((((startElapsedRealtime ^ j4) | j2) | jLongValue) ^ j4) | j6)) + (((long) 496) * (startElapsedRealtime | jLongValue)) + ((long) (-1670213166));
        int i268 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i269 = ((i268 | 11) << 1) - (i268 ^ 11);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i269 % 128;
        int i270 = i269 % 2;
        int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
        int i271 = ((int) (j7 >> 32)) & ((((~((-493678670) | startElapsedRealtime2)) | 626103568) * 262) + 893561372 + (((~((~startElapsedRealtime2) | (-493678670))) | 626103568) * 262));
        int iMyPid = Process.myPid();
        int i272 = ~iMyPid;
        int i273 = ((int) j7) & ((((~((-1019845689) | i272)) | (~(1837895197 | iMyPid))) * 959) + 1388205807 + (((~(iMyPid | (-1019845689))) | (~(i272 | 1837895197))) * 959));
        int i274 = (i271 & i273) | (i271 ^ i273);
        int i275 = i274 >>> 24;
        int i276 = i274 & ViewCompat.MEASURED_SIZE_MASK;
        int i277 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i275 != 0) {
            int i278 = i277 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i278 % 128;
            int i279 = i278 % 2;
            i = 2;
            z = true;
        } else {
            int i280 = (i277 ^ 103) + ((i277 & 103) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i280 % 128;
            i = 2;
            int i281 = i280 % 2;
            z = false;
        }
        if (z) {
            int i282 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i282 % 128;
            if (i282 % i == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
        } else {
            i2 = 0;
        }
        list.add((!z || i276 >= i || (method = methodArr[i276]) == null) ? null : method.toString());
        return (((i275 | 6) << 1) - (i275 ^ 6)) * i2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, short r7, int r8) {
        /*
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r0 = defpackage.obtainRequest.$$c
            int r8 = r8 * 4
            int r1 = 1 - r8
            int r6 = r6 + 119
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2c:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.obtainRequest.$$g(byte, short, int):java.lang.String");
    }
}
