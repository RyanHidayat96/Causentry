package com.bpjstku.data.registration.general;

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
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bpjstku.data.registration.general.model.response.OcrKtpResponse;
import defpackage.deInitSession;
import defpackage.getSessionStateCallback;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import kotlin.jvm.functions.Function1;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RegistrationDataStore$$ExternalSyntheticLambda36 implements Function1 {
    private static final byte[] $$c = {25, 5, -88, -44};
    private static final int $$f = 90;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {99, -43, -44, -62, -2, 21, -2, 11, 6, 23, 8, -28, 46, 11, 14, 8, -24, 43, 6, -3, 4, 11, 11, -42, 56, 22, -1, 23, 6, 3, 4, 29, -12, 7, 21, 1, 22, -8, 11, 21, 12, -4, 20, 11, 6, -3, 11, 23, 9, -1, 14, 2, -26, 42, 10, 4, 29, 0, 17, -24, 43, 6, -3, 4, 11, 11, -12, 43, 6, -3, 11, 23, 9, 5, 12, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, -9, 16, 14, -1, 14, 14, 2, -21, 46, 1, 15, -2, 28, -6, 22, -56};
    private static final int $$h = 217;
    private static final byte[] $$d = {112, 19, -59, 97, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 168;
    private static final byte[] $$a = {93, -122, -23, -24, -6, 24, -18, 26, -71, 67, -6, 18, -67, 72, 3, -4, -59, 40, 3, -4, -6, 47, 2, 9, -12, 22, -1, 8, -2, 14, -6, 24, -18, -48, 72, -11, 1, 21, 0, -6, 14, 8, -72, 40, 21, 1, 21, 0, -10, -16, 18, 16, -7, 14, 1};
    private static final int $$b = 244;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int b = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -83722486;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {60062, 60075, 60061, 60045, 60054, 60047, 60063, 60051, 60052, 60041, 60049, 60090, 60117, 60050, 60058, 60079, 60043, 60086, 60053, 60060, 60040, 60055, 60056, 60034, 60072};
    private static char TuitionPaymentFragmentbindingInflater1 = 57188;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = 144 - r5
            byte[] r0 = com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda36.$$d
            int r1 = r6 + 1
            int r7 = r7 + 84
            byte[] r1 = new byte[r1]
            r2 = -1
            if (r0 != 0) goto L10
            r7 = r5
            r3 = r6
            goto L27
        L10:
            r4 = r7
            r7 = r5
            r5 = r4
        L13:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r1[r2] = r3
            int r7 = r7 + 1
            if (r2 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L25:
            r3 = r0[r7]
        L27:
            int r3 = -r3
            int r5 = r5 + r3
            int r5 = r5 + (-11)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda36.a(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 71
            int r7 = r7 + 4
            int r6 = r6 * 24
            int r6 = 108 - r6
            int r8 = r8 * 34
            int r8 = 72 - r8
            byte[] r0 = com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda36.$$g
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r7]
        L28:
            int r6 = r6 + r3
            int r6 = r6 + (-9)
            int r7 = r7 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda36.e(int, short, int, java.lang.Object[]):void");
    }

    private static void f(short s, short s2, int i, Object[] objArr) {
        int i2 = 30 - s2;
        int i3 = i + 105;
        int i4 = s * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[26 - i4];
        int i5 = 25 - i4;
        int i6 = -1;
        if (bArr == null) {
            i2++;
            i3 = (i5 + i3) - 3;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b2 = bArr[i2];
                i2++;
                i3 = (i3 + b2) - 3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0181  */
    /* JADX WARN: Code duplicated, block: B:33:0x0182  */
    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        int i6 = $11 + 101;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            int i8 = $11 + 113;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i10 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (Process.myPid() >> 22) + 3291, Drawable.resolveOpacity(0, 0) + 31, 1199271174, false, $$i((byte) 7, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 651, 45 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -450685997, false, $$i((byte) ($$c[1] + 1), b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i11 = $10 + 119;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i13 = $11 + 89;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b4 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 651 - (Process.myPid() >> 22), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44, -450685997, false, $$i((byte) ($$c[1] + 1), b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i4 = 29209604;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = b + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 31534);
            int i4 = 921 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int mode = View.MeasureSpec.getMode(0) + 28;
            byte b2 = $$d[7];
            Object[] objArr2 = new Object[1];
            a((short) 141, b2, (byte) (b2 | 14), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i4, mode, -1048449946, false, (String) objArr2[0], null);
        }
        Object obj2 = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(true, 203 - TextUtils.indexOf("", ""), 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-16777205) - Color.rgb(0, 0, 0), new char[]{65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(true, TextUtils.indexOf("", "", 0) + 207, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12, new char[]{'\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 31534);
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 921;
            int bitsPerPixel = 27 - ImageFormat.getBitsPerPixel(0);
            Object[] objArr5 = new Object[1];
            a((short) 141, (byte) 52, $$d[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild, absoluteGravity, bitsPerPixel, -778300370, false, (String) objArr5[0], null);
        }
        if (j != ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object[] objArr6 = new Object[1];
            d((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25, new char[]{'\r', 19, 7, 5, '\r', 18, 7, 11, 11, 19, 17, 11, '\f', 21, '\b', '\n', '\b', 18, '\b', 20, 17, 5, 5, 4, 11, '\t'}, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 109), objArr6);
            Class<?> cls2 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            c(true, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 210, 18 - Gravity.getAbsoluteGravity(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3, new char[]{11, 65529, 4, 5, 65535, '\n', 65527, 65529, 65535, 2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b'}, objArr7);
            Context applicationContext = (Context) cls2.getMethod((String) objArr7[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr8 = new Object[1];
            d(KeyEvent.keyCodeFromString("") + 16, new char[]{11, '\n', 4, '\r', 11, 22, '\r', 19, 17, 14, 20, 24, 0, '\n', 1, 0}, (byte) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24), objArr8);
            Class<?> cls3 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(true, 206 - View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.getSize(0) + 16, 3 - TextUtils.indexOf((CharSequence) "", '0'), new char[]{'\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3, 14}, objArr9);
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 1447476691};
                byte[] bArr = $$g;
                byte b3 = bArr[57];
                byte b4 = b3;
                Object[] objArr11 = new Object[1];
                e(b3, b4, b4, objArr11);
                Class<?> cls4 = Class.forName((String) objArr11[0]);
                byte b5 = bArr[35];
                byte b6 = b5;
                Object[] objArr12 = new Object[1];
                e(b5, b6, b6, objArr12);
                Object[] objArr13 = (Object[]) cls4.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char keyRepeatTimeout = (char) (31533 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int packedPositionChild2 = 920 - ExpandableListView.getPackedPositionChild(0L);
                    int iBlue = 28 - Color.blue(0);
                    Object[] objArr14 = new Object[1];
                    a((short) 89, (byte) 37, $$d[7], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, packedPositionChild2, iBlue, -1142834547, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    c(true, 202 - TextUtils.indexOf((CharSequence) "", '0', 0), 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 11 - View.resolveSizeAndState(0, 0, 0), new char[]{65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520}, objArr15);
                    Class<?> cls5 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(true, 207 - View.MeasureSpec.makeMeasureSpec(0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14, 12 - (Process.myTid() >> 22), new char[]{'\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2}, objArr16);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 31533);
                        int mirror = 969 - AndroidCharacter.getMirror('0');
                        int i5 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                        Object[] objArr17 = new Object[1];
                        a((short) 141, (byte) 52, $$d[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(threadPriority, mirror, i5, -778300370, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cRgb = (char) ((-16745683) - Color.rgb(0, 0, 0));
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 921;
                        int iBlue2 = Color.blue(0) + 28;
                        byte b7 = $$d[7];
                        Object[] objArr18 = new Object[1];
                        a((short) 141, b7, (byte) (b7 | 14), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, iIndexOf, iBlue2, -1048449946, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                    objArr = objArr13;
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
        } else {
            int i6 = b + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char maximumFlingVelocity = (char) (31533 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 922;
                int packedPositionChild3 = 27 - ExpandableListView.getPackedPositionChild(0L);
                Object[] objArr19 = new Object[1];
                a((short) 89, (byte) 37, $$d[7], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumFlingVelocity, iIndexOf2, packedPositionChild3, -1142834547, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr20[1])[0]}, (Object[]) objArr20[2], new int[]{((int[]) objArr20[3])[0]}, (String[]) objArr20[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = (-1626308896) + (((~(iIdentityHashCode | 1105781040)) | (-668298604)) * (-465)) + ((1105781040 | (~((-668298604) | iIdentityHashCode))) * 930) + ((iIdentityHashCode | (-638913612)) * 465) + 1447476691;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        }
        int i11 = ((int[]) objArr[1])[0];
        int i12 = ((int[]) objArr[3])[0];
        if (i12 == i11) {
            int i13 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i14 = ~iUptimeMillis;
            int i15 = i13 + ((((~(i14 | 1303364346)) | ((~((-470715298) | i14)) | 268437761)) * (-397)) - 1565687031) + ((iUptimeMillis | 1369524571) * 397);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr21[0])[0] = i17 ^ (i17 << 5);
            int i18 = b + 81;
            int i19 = i18 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19;
            int i20 = i18 % 2;
            int i21 = i19 + 75;
            b = i21 % 128;
            OcrKtpResponse ocrKtpResponse = (OcrKtpResponse) obj;
            if (i21 % 2 != 0) {
                return RegistrationDataStore.ocrKtp$lambda$52(ocrKtpResponse);
            }
            RegistrationDataStore.ocrKtp$lambda$52(ocrKtpResponse);
            obj2.hashCode();
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr != null) {
            for (String str : strArr) {
                arrayList.add(str);
            }
        }
        throw new RuntimeException(String.valueOf(i12));
    }

    private static void d(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i5 = 1770390596;
        Object obj2 = null;
        if (cArr3 != null) {
            int i6 = $10 + 113;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.myTid() >> 22), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2268, Color.alpha(0) + 33, -1927765101, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr2[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i3++;
                    i5 = 1770390596;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.getDefaultSize(0, 0), 2266 - TextUtils.indexOf((CharSequence) "", '0'), ImageFormat.getBitsPerPixel(0) + 34, -1927765101, false, $$i(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i7 = $10 + 61;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                i2 = i + 100;
                cArr4[i2] = (char) (cArr[i2] << b2);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i8 = $10 + 119;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            } else {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b7 = (byte) 1;
                        byte b8 = (byte) (b7 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.myTid() >> 22) + 49267), 3262 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 29 - ImageFormat.getBitsPerPixel(0), -127612708, false, $$i(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 3;
                            byte b10 = (byte) (b9 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - View.MeasureSpec.getMode(0)), 594 - Color.argb(0, 0, 0, 0), TextUtils.lastIndexOf("", '0') + 18, 1570859318, false, $$i(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i9 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i9];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i10 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i10];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i11];
                            int i12 = $10 + 123;
                            $11 = i12 % 128;
                            int i13 = i12 % 2;
                        } else {
                            int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i14];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i15];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0afd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0876  */
    public static int b(List list) throws Throwable {
        long j;
        int i;
        int i2;
        String string;
        Method[] methodArr;
        int i3;
        int gidForName;
        char[] cArr;
        int i4;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5;
        int i6;
        int i7;
        int i8;
        Object obj;
        int i9 = 2;
        int i10 = 2 % 2;
        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        b = i11 % 128;
        int i12 = i11 % 2;
        int i13 = 1;
        Method[] methodArr2 = new Method[1];
        byte[] bArr = $$a;
        byte b2 = bArr[36];
        Object[] objArr = new Object[1];
        f(b2, bArr[7], b2, objArr);
        int i14 = 0;
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        f((byte) (-bArr[35]), bArr[14], bArr[38], objArr2);
        String str = (String) objArr2[0];
        Class<?>[] clsArr = new Class[3];
        clsArr[0] = KeyManager[].class;
        clsArr[1] = TrustManager[].class;
        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i16 = ((i15 | 7) << 1) - (i15 ^ 7);
        b = i16 % 128;
        if (i16 % 2 == 0) {
            byte b3 = bArr[38];
            Object[] objArr3 = new Object[1];
            f(b3, b3, bArr[36], objArr3);
            clsArr[4] = Class.forName((String) objArr3[0]);
            methodArr2[0] = cls.getMethod(str, clsArr);
        } else {
            byte b4 = bArr[38];
            Object[] objArr4 = new Object[1];
            f(b4, b4, bArr[36], objArr4);
            clsArr[2] = Class.forName((String) objArr4[0]);
            methodArr2[0] = cls.getMethod(str, clsArr);
        }
        int i17 = b + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
        int i18 = i17 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char gidForName2 = (char) ((-1) - Process.getGidForName(""));
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 2824;
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22;
            short s = (short) 52;
            Object[] objArr5 = new Object[1];
            a(s, (byte) s, $$d[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName2, iIndexOf, maximumFlingVelocity, 1814927978, false, (String) objArr5[0], null);
        }
        Class<?>[] clsArr2 = null;
        float f = 0.0f;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            int i19 = b + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
            int i20 = i19 % 2;
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.green(0), (ViewConfiguration.getEdgeSlop() >> 16) + 2823, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i21 = 0;
            while (i21 < length) {
                int i22 = b + 119;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
                int i23 = i22 % i9;
                Method method = declaredMethods[i21];
                try {
                    int i24 = -Color.green(i14);
                    Object[] objArr6 = new Object[i13];
                    d(23 - (~(-(Process.myTid() >> 22))), new char[]{11, '\n', 4, '\r', 11, 22, '\r', 19, 17, 14, 5, 4, 1, 22, 2, 20, 7, '\n', 15, 2, 6, '\b', '\t', 7}, (byte) ((i24 & 56) + (i24 | 56)), objArr6);
                    Class<?> cls2 = Class.forName((String) objArr6[i14]);
                    int size = View.MeasureSpec.getSize(i14) + 208;
                    int i25 = -TextUtils.indexOf((CharSequence) "", '0');
                    int i26 = ((i25 | 11) << i13) - (i25 ^ 11);
                    int i27 = -(TypedValue.complexToFraction(i14, f, f) > f ? 1 : (TypedValue.complexToFraction(i14, f, f) == f ? 0 : -1));
                    Object[] objArr7 = new Object[i13];
                    c(true, size, i26, ((i27 | 9) << i13) - (i27 ^ 9), new char[]{1, 65534, 1, 65532, 7, 65509, '\f', 65533, 65535, 11, '\n', 65533}, objArr7);
                    Object[] objArr8 = new Object[i13];
                    objArr8[i14] = Integer.valueOf(((Integer) cls2.getMethod((String) objArr7[i14], clsArr2).invoke(method, clsArr2)).intValue());
                    int i28 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int i29 = ((i28 | 202) << i13) - (i28 ^ 202);
                    int i30 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                    int i31 = (i30 & 27) + (i30 | 27);
                    int i32 = (CdmaCellLocation.convertQuartSecToDecDegrees(i14) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i14) == 0.0d ? 0 : -1));
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i33 = (i32 * (-112)) - 1344;
                    int i34 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i35 = ~(((-13) ^ i34) | ((-13) & i34));
                    int i36 = -(-(((i32 ^ i35) | (i35 & i32)) * 226));
                    int i37 = (i33 & i36) + (i36 | i33);
                    int i38 = ~i32;
                    int i39 = ~(i38 | 12);
                    int i40 = ~(i38 | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    int i41 = (i39 ^ i40) | (i40 & i39);
                    int i42 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i43 = ((-13) ^ i42) | ((-13) & i42);
                    int i44 = ((~((i43 ^ i32) | (i32 & i43))) | i41) * (-113);
                    Object[] objArr9 = new Object[i13];
                    c(true, i29, i31, (i37 & i44) + (i37 | i44) + ((~((-13) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2)) * 113), new char[]{4, 17, 65485, 6, '\r', 0, 11, 65485, 0, 21, 0, '\t', 17, 4, '\b', 5, '\b', 3, 14, 65516, 65485, 19, 2, 4, 11, 5}, objArr9);
                    Class<?> cls3 = Class.forName((String) objArr9[i14]);
                    int i45 = -View.MeasureSpec.getMode(i14);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i46 = i45 * (-112);
                    int i47 = (i46 & (-23296)) + (i46 | (-23296));
                    int i48 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i49 = (i47 - (~(((~(((-209) ^ i48) | ((-209) & i48))) | i45) * 226))) - i13;
                    int i50 = ~i45;
                    int i51 = ~((i50 ^ 208) | (i50 & 208));
                    int i52 = ~i45;
                    int i53 = ~((i52 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i52 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    int i54 = (i51 ^ i53) | (i51 & i53);
                    int i55 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i56 = ((-209) ^ i55) | ((-209) & i55);
                    int i57 = i49 + (((~((i56 ^ i45) | (i45 & i56))) | i54) * (-113));
                    int i58 = -(-((~(((-209) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-209) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) * 113));
                    int i59 = (i57 ^ i58) + ((i57 & i58) << i13);
                    int i60 = (CdmaCellLocation.convertQuartSecToDecDegrees(i14) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i14) == 0.0d ? 0 : -1));
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i61 = i60 * (-518);
                    int i62 = ((i61 | (-4144)) << i13) - (i61 ^ (-4144));
                    int i63 = ~i60;
                    int i64 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i65 = ~((i63 ^ i64) | (i63 & i64));
                    int i66 = i62 + (((i65 ^ 8) | (i65 & 8)) * 519);
                    int i67 = ~i60;
                    int i68 = (i67 ^ i64) | (i67 & i64);
                    int i69 = ~((i68 & 8) | (i68 ^ 8));
                    int i70 = (i60 ^ 8) | (i60 & 8);
                    int i71 = ~((i70 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i70 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                    int i72 = -(-(((i69 ^ i71) | (i69 & i71)) * (-519)));
                    int i73 = ((i66 | i72) << i13) - (i72 ^ i66);
                    int i74 = -(-((i60 | (~(iTuitionPaymentFragmentspecialinlinedviewModeldefault4 | 8))) * 519));
                    int i75 = (i73 ^ i74) + ((i74 & i73) << i13);
                    int i76 = -TextUtils.getOffsetAfter("", i14);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i77 = i76 * 569;
                    int i78 = (i77 & 1707) + (i77 | 1707);
                    int i79 = ~i76;
                    int i80 = ~((i79 ^ (-4)) | (i79 & (-4)));
                    int i81 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                    int i82 = ~((i79 ^ i81) | (i79 & i81));
                    int i83 = (i80 ^ i82) | (i82 & i80);
                    int i84 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                    int i85 = ~(((-4) ^ i84) | ((-4) & i84));
                    int i86 = -(-(((i83 ^ i85) | (i83 & i85)) * (-1136)));
                    int i87 = (i78 ^ i86) + ((i86 & i78) << i13);
                    int i88 = ~i76;
                    int i89 = ~((i88 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i88 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                    int i90 = ~(((-4) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-4) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                    int i91 = (i89 ^ i90) | (i89 & i90);
                    int i92 = i81 | i76;
                    int i93 = ~((i92 ^ 3) | (i92 & 3));
                    int i94 = ((i91 ^ i93) | (i91 & i93)) * (-568);
                    int i95 = (i87 ^ i94) + ((i94 & i87) << i13);
                    int i96 = ~((i76 & i81) | (i81 ^ i76));
                    int i97 = ~(i81 | 3);
                    int i98 = (i96 & i97) | (i96 ^ i97);
                    int i99 = (i79 ^ (-4)) | (i79 & (-4));
                    int i100 = -(-((i98 | (~((i99 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i99 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5)))) * 568));
                    Object[] objArr10 = new Object[i13];
                    c(false, i59, i75, (i95 ^ i100) + ((i100 & i95) << i13), new char[]{1, 14, 65533, 1, 11, 65510, 65529, '\f'}, objArr10);
                    String str2 = (String) objArr10[0];
                    Class<?>[] clsArr3 = new Class[i13];
                    clsArr3[0] = Integer.TYPE;
                    if (((Boolean) cls3.getMethod(str2, clsArr3).invoke(null, objArr8)).booleanValue()) {
                        Class cls4 = Long.TYPE;
                        int i101 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i102 = i101 * 624;
                        int i103 = (i102 & (-14928)) + (i102 | (-14928));
                        int i104 = (-25) | i101;
                        int i105 = (~((i104 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i104 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6))) * 623;
                        int i106 = (i103 & i105) + (i103 | i105);
                        int i107 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                        int i108 = ~i101;
                        int i109 = ~((i108 & 24) | (i108 ^ 24));
                        int i110 = -(-(((i107 & i109) | (i107 ^ i109)) * (-623)));
                        int i111 = (~(((-25) & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | ((-25) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6))) | (~(((-25) & i101) | ((-25) ^ i101)));
                        int i112 = ~((i101 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i101 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                        int i113 = (((i106 ^ i110) + ((i110 & i106) << i13)) - (~(-(-(((i112 & i111) | (i111 ^ i112)) * 623))))) - i13;
                        char[] cArr2 = {11, '\n', 4, '\r', 11, 22, '\r', 19, 17, 14, 5, 4, 1, 22, 2, 20, 7, '\n', 15, 2, 6, '\b', '\t', 7};
                        int i114 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i115 = (i114 * (-1975)) - (-55384);
                        int i116 = ~i114;
                        int i117 = -(-(((~((i116 ^ 56) | (i116 & 56))) | iTuitionPaymentFragmentspecialinlinedviewModeldefault7) * 988));
                        int i118 = (i115 ^ i117) + ((i115 & i117) << i13);
                        int i119 = ~(((-57) ^ i114) | ((-57) & i114));
                        int i120 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                        getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i121 = ~((i120 ^ i114) | (i114 & i120));
                        int i122 = i118 + ((-1976) * ((i121 & i119) | (i119 ^ i121)));
                        int i123 = ~(i116 | 56);
                        int i124 = ~(((-57) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | ((-57) & iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                        int i125 = (i123 & i124) | (i123 ^ i124);
                        int i126 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                        int i127 = ~((i126 & 56) | (i126 ^ 56));
                        byte b5 = (byte) (i122 + (((i127 & i125) | (i125 ^ i127)) * 988));
                        Object[] objArr11 = new Object[i13];
                        d(i113, cArr2, b5, objArr11);
                        Class<?> cls5 = Class.forName((String) objArr11[0]);
                        int size2 = View.MeasureSpec.getSize(0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i128 = size2 * (-317);
                        int i129 = (i128 ^ 66990) + ((i128 & 66990) << i13);
                        int i130 = ~size2;
                        int i131 = i130 | (-211);
                        int i132 = ~((i131 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i131 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                        int i133 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                        int i134 = ~((i133 ^ size2) | (i133 & size2) | 210);
                        int i135 = -(-(((i132 ^ i134) | (i132 & i134)) * (-318)));
                        int i136 = (i129 ^ i135) + ((i135 & i129) << i13);
                        int i137 = ~(((-211) ^ size2) | ((-211) & size2));
                        int i138 = ~((size2 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (size2 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                        int i139 = ((i137 ^ i138) | (i138 & i137)) * (-318);
                        int i140 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & i130) | (i130 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                        int i141 = (i136 & i139) + (i139 | i136) + (((i140 & (-211)) | ((-211) ^ i140)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                        int i142 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i143 = i142 * 989;
                        int i144 = (i143 ^ (-13818)) + ((i143 & (-13818)) << i13);
                        int i145 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                        int i146 = -(-(((~((i142 ^ 14) | (i142 & 14) | iTuitionPaymentFragmentspecialinlinedviewModeldefault9)) | (~((-15) | i145 | i142))) * 988));
                        int i147 = (i144 & i146) + (i146 | i144);
                        int i148 = ((i142 ^ (-15)) | (i142 & (-15))) * (-988);
                        int i149 = ((i147 | i148) << i13) - (i148 ^ i147);
                        int i150 = ~i142;
                        int i151 = b;
                        int i152 = (i151 ^ 27) + ((i151 & 27) << i13);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i152 % 128;
                        int i153 = i152 % 2;
                        int i154 = ~((i150 & (-15)) | (i150 ^ (-15)));
                        int i155 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault9 & (-15)) | ((-15) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                        int i156 = (i142 & i145) | (i145 ^ i142);
                        int i157 = i149 + (988 * ((i154 & i155) | (i154 ^ i155) | (~((i156 & 14) | (i156 ^ 14)))));
                        int i158 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                        Object[] objArr12 = new Object[1];
                        c(false, i141, i157, (i158 & 1) + (i158 | 1), new char[]{65531, 65533, 65531, '\n', 65512, 65531, '\n', 11, '\b', 4, 65514, 15, 6}, objArr12);
                        if (cls4.equals(cls5.getMethod((String) objArr12[0], null).invoke(method, null))) {
                            int i159 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int i160 = -Color.red(0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i161 = (i160 * (-317)) + 17864;
                            int i162 = ~i160;
                            int i163 = (i162 ^ (-57)) | (i162 & (-57));
                            int i164 = ~((i163 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (i163 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                            int i165 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                            int i166 = (i165 & i160) | (i165 ^ i160);
                            int i167 = (i164 | (~((i166 & 56) | (i166 ^ 56)))) * (-318);
                            int i168 = ((i161 | i167) << 1) - (i161 ^ i167);
                            int i169 = ~(((-57) ^ i160) | ((-57) & i160));
                            int i170 = ~((i160 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (i160 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                            int i171 = (i168 - (~(((i170 & i169) | (i169 ^ i170)) * (-318)))) - 1;
                            int i172 = ~((i162 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault10 & i162));
                            int i173 = ((i172 & (-57)) | ((-57) ^ i172)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                            Object[] objArr13 = new Object[1];
                            d(((i159 | 23) << 1) - (i159 ^ 23), new char[]{11, '\n', 4, '\r', 11, 22, '\r', 19, 17, 14, 5, 4, 1, 22, 2, 20, 7, '\n', 15, 2, 6, '\b', '\t', 7}, (byte) ((i171 & i173) + (i173 | i171)), objArr13);
                            Class<?> cls6 = Class.forName((String) objArr13[0]);
                            int i174 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i175 = (i174 ^ 55) + ((i174 & 55) << 1);
                            b = i175 % 128;
                            if (i175 % 2 == 0) {
                                gidForName = 18 >> Process.getGidForName("");
                                cArr = new char[]{15, 4, 6, 0, 19, 14, 19, '\t', 5, '\n', 4, 5, 18, 20, 15, 1, 13859};
                                i4 = -Color.red(0);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                i5 = i4 - 520;
                                i6 = 94;
                            } else {
                                gidForName = Process.getGidForName("") + 18;
                                cArr = new char[]{15, 4, 6, 0, 19, 14, 19, '\t', 5, '\n', 4, 5, 18, 20, 15, 1, 13859};
                                i4 = -Color.red(0);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                i5 = i4 * (-520);
                                i6 = 58;
                            }
                            int i176 = ~i4;
                            int i177 = (i176 ^ i6) | (i176 & i6);
                            int i178 = ((i5 + (522 * i6)) - (~(-(-((~((i177 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i177 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1))) * 521))))) - 1;
                            int i179 = ~i6;
                            int i180 = i179 | i4;
                            int i181 = b;
                            methodArr = declaredMethods;
                            int i182 = (i181 ^ 99) + ((i181 & 99) << 1);
                            i3 = length;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i182 % 128;
                            if (i182 % 2 != 0) {
                                int i183 = -(~i180);
                                int i184 = ((i183 | (-1042)) << 1) - (i183 ^ (-1042));
                                i7 = (i178 ^ i184) + ((i178 & i184) << 1);
                                int i185 = ~((i179 & i4) | (i179 ^ i4));
                                int i186 = ~i4;
                                int i187 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i188 = (i186 & i187) | (i186 ^ i187);
                                int i189 = ~((i188 & i6) | (i188 ^ i6));
                                i8 = (i189 & i185) | (i185 ^ i189);
                            } else {
                                int i190 = -(-((~i180) * (-1042)));
                                i7 = (i190 | i178) + (i178 & i190);
                                int i191 = ~i6;
                                int i192 = ~((i4 & i191) | (i191 ^ i4));
                                int i193 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i194 = (i193 & i176) | (i176 ^ i193);
                                int i195 = ~((i194 & i6) | (i194 ^ i6));
                                i8 = (i192 & i195) | (i192 ^ i195);
                            }
                            int i196 = -(-(521 * i8));
                            Object[] objArr14 = new Object[1];
                            d(gidForName, cArr, (byte) ((i7 ^ i196) + ((i7 & i196) << 1)), objArr14);
                            Object[] objArr15 = (Object[]) cls6.getMethod((String) objArr14[0], null).invoke(method, null);
                            if (objArr15.length == 2 && Long.TYPE.equals(objArr15[0])) {
                                int i197 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                int i198 = ((i197 | 24) << 1) - (i197 ^ 24);
                                char[] cArr3 = {11, '\n', 4, '\r', 11, 22, '\r', 19, 17, 14, 5, 4, 1, 22, 2, 20, 7, '\n', 15, 2, 6, '\b', '\t', 7};
                                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i199 = ~((-57) | packedPositionGroup);
                                int i200 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                int i201 = ~((i200 & packedPositionGroup) | (i200 ^ packedPositionGroup));
                                int i202 = (((packedPositionGroup * (-711)) - (-39928)) - (~((i199 | i201) * (-712)))) - 1;
                                int i203 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
                                int i204 = i203 % 128;
                                b = i204;
                                if (i203 % 2 == 0) {
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                int i205 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (-57);
                                int i206 = ~((i205 & packedPositionGroup) | (i205 ^ packedPositionGroup));
                                int i207 = ((i204 | 19) << 1) - (i204 ^ 19);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i207 % 128;
                                int i208 = i207 % 2;
                                int i209 = (packedPositionGroup & 56) | (packedPositionGroup ^ 56);
                                int i210 = ~((i209 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (i209 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                                int i211 = i202 + ((-712) * ((i210 & i206) | (i206 ^ i210)));
                                int i212 = i204 + 61;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i212 % 128;
                                if (i212 % 2 != 0) {
                                    int i213 = -(712 >> (((-57) & i201) | ((-57) ^ i201)));
                                    byte b6 = (byte) ((i211 & i213) + (i213 | i211));
                                    Object[] objArr16 = new Object[1];
                                    d(i198, cArr3, b6, objArr16);
                                    obj = objArr16[0];
                                } else {
                                    byte b7 = (byte) ((i211 - (~((((-57) & i201) | ((-57) ^ i201)) * 712))) - 1);
                                    Object[] objArr17 = new Object[1];
                                    d(i198, cArr3, b7, objArr17);
                                    obj = objArr17[0];
                                }
                                int i214 = b + 89;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i214 % 128;
                                int i215 = i214 % 2;
                                if (Class.forName((String) obj).equals(objArr15[1])) {
                                    int i216 = b + 59;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i216 % 128;
                                    int i217 = i216 % 2;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                                        int i218 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2822;
                                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 22;
                                        short s2 = (short) 52;
                                        Object[] objArr18 = new Object[1];
                                        a(s2, (byte) s2, $$d[7], objArr18);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(capsMode, i218, iCombineMeasuredStates, 1814927978, false, (String) objArr18[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                        int iMakeMeasureSpec = 2823 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 22;
                                        short s3 = (short) 52;
                                        Object[] objArr19 = new Object[1];
                                        a(s3, (byte) s3, $$d[7], objArr19);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iMakeMeasureSpec, iNormalizeMetaState, 1814927978, false, (String) objArr19[0], null);
                                    }
                                    try {
                                        Object[] objArr20 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                            int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 2823;
                                            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 23;
                                            byte[] bArr2 = $$d;
                                            short s4 = bArr2[7];
                                            Object[] objArr21 = new Object[1];
                                            a(s4, (byte) s4, bArr2[1], objArr21);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(edgeSlop, capsMode2, iIndexOf2, -2137287382, false, (String) objArr21[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr20)).longValue();
                                        int i219 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i220 = (i219 ^ 21) + ((i219 & 21) << 1);
                                        b = i220 % 128;
                                        int i221 = i220 % 2;
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
                            methodArr = declaredMethods;
                            i3 = length;
                        }
                    } else {
                        methodArr = declaredMethods;
                        i3 = length;
                    }
                    i21 = (i21 ^ (-125)) + ((i21 & (-125)) << 1) + 126;
                    length = i3;
                    declaredMethods = methodArr;
                    i9 = 2;
                    i13 = 1;
                    i14 = 0;
                    clsArr2 = null;
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
            char cMyPid = (char) (Process.myPid() >> 22);
            int i222 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2823;
            int iIndexOf3 = 22 - TextUtils.indexOf("", "", 0);
            short s5 = (short) 52;
            Object[] objArr22 = new Object[1];
            a(s5, (byte) s5, $$d[7], objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyPid, i222, iIndexOf3, 1814927978, false, (String) objArr22[0], null);
        }
        Object[] objArr23 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2823;
            int iResolveOpacity = 22 - Drawable.resolveOpacity(0, 0);
            byte b8 = $$d[7];
            Object[] objArr24 = new Object[1];
            a((short) 141, b8, (byte) (b8 | 14), objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarFadeDuration, fadingEdgeLength, iResolveOpacity, 1025296417, false, (String) objArr24[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr23);
        Object[] objArr25 = {0, methodArr2, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cIndexOf = (char) (37657 - TextUtils.indexOf("", "", 0, 0));
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2720;
            int iResolveOpacity2 = 19 - Drawable.resolveOpacity(0, 0);
            byte b9 = $$d[7];
            Object[] objArr26 = new Object[1];
            a((short) 141, b9, (byte) (b9 | 14), objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, doubleTapTimeout, iResolveOpacity2, -1568796068, false, (String) objArr26[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr25)).longValue();
        int i223 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i224 = ((i223 | 105) << 1) - (i223 ^ 105);
        b = i224 % 128;
        if (i224 % 2 == 0) {
            long j2 = -1704822380;
            long j3 = (((long) 659) * j2) + (((long) (-657)) * jLongValue);
            long j4 = -1;
            long j5 = ((j2 ^ j4) | jLongValue) ^ j4;
            long j6 = ((jLongValue ^ j4) | j2) ^ j4;
            long elapsedCpuTime = (j2 | ((long) ((int) Process.getElapsedCpuTime()))) ^ j4;
            long j7 = 658;
            j = j3 + (((long) (-658)) * (j5 | j6 | elapsedCpuTime)) + (j7 * j6) + (j7 * (elapsedCpuTime | j6)) + ((long) (-105583465));
            i = (int) (j >>> 62);
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i225 = ~startUptimeMillis;
            i2 = (-850636918) + ((~(1188500592 | i225)) * (-560)) + ((~(startUptimeMillis | (-134234379))) * (-560)) + (((~(248725818 | i225)) | 1074009152) * 560);
        } else {
            long j8 = 124460466;
            long j9 = 193;
            long jMyTid = Process.myTid();
            long j10 = -1;
            long j11 = jMyTid ^ j10;
            long j12 = j8 ^ j10;
            long j13 = (j9 * j8) + (j9 * jLongValue) + (((long) (-192)) * (j11 | ((j12 | jLongValue) ^ j10)));
            long j14 = jLongValue ^ j10;
            long j15 = j12 | j14;
            long j16 = j14 | j11;
            j = j13 + (((long) (-384)) * ((j15 ^ j10) | (j16 ^ j10))) + (((long) DerHeader.TAG_CLASS_PRIVATE) * ((((j8 | jLongValue) | jMyTid) ^ j10) | ((j15 | jMyTid) ^ j10) | ((j16 | j8) ^ j10))) + ((long) (-1934866311));
            i = (int) (j >> 32);
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            i2 = 1556476714 + (((~(2041004214 | iUptimeMillis)) | 603777803) * (-668)) + ((2041004214 | (~(603777803 | iUptimeMillis))) * 1336) + ((iUptimeMillis | 2080369599) * 668);
        }
        int i226 = i & i2;
        int iNextInt = new Random().nextInt(868786131);
        int i227 = ~iNextInt;
        int i228 = ((int) j) & ((-635053777) + (((~(2097488203 | i227)) | (~((-660261794) | iNextInt))) * (-370)) + (((~(iNextInt | 2097488203)) | (~(i227 | (-660261794))) | 1476730954) * (-370)) + 929606388);
        int i229 = (i226 & i228) | (i226 ^ i228);
        int i230 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
        int i231 = i230 % 128;
        b = i231;
        int i232 = i230 % 2;
        int i233 = i229 >>> 24;
        int i234 = i229 & ViewCompat.MEASURED_SIZE_MASK;
        boolean z = i233 != 0;
        int i235 = !(z ^ true) ? 1 : 0;
        if (!z || i234 >= 1) {
            string = null;
        } else {
            int i236 = i231 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i236 % 128;
            int i237 = i236 % 2;
            Method method2 = methodArr2[i234];
            if (method2 != null) {
                int i238 = i231 + 53;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i238 % 128;
                if (i238 % 2 != 0) {
                    method2.toString();
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                string = method2.toString();
            } else {
                string = null;
            }
        }
        list.add(string);
        int i239 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i240 = (i239 ^ 37) + ((i239 & 37) << 1);
        b = i240 % 128;
        int i241 = i240 % 2;
        return (((i233 | 6) << 1) - (i233 ^ 6)) * i235;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, int r7, byte r8) {
        /*
            byte[] r0 = com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda36.$$c
            int r6 = r6 + 113
            int r7 = r7 * 4
            int r1 = 1 - r7
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda36.$$i(int, int, byte):java.lang.String");
    }
}
