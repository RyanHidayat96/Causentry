package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity$special$$inlined$inject$default$2;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.logging.Level;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
public interface lambdatryToProvidePreviewSurface2androidxcameraviewTextureViewImplementation {
    void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Level level, String str, Throwable th);

    void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Level level, String str);

    public static class TuitionPaymentFragmentbindingInflater1 implements lambdatryToProvidePreviewSurface2androidxcameraviewTextureViewImplementation {
        private static int TuitionPaymentFragmentbindingInflater1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static int asInterface;
        private static final byte[] $$a = {25, 5, -88, -44};
        private static final int $$b = 137;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asBinder = 0;
        private static int b = 0;
        private static int g = 1;

        @Override // defpackage.lambdatryToProvidePreviewSurface2androidxcameraviewTextureViewImplementation
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Level level, String str) {
            int i = 2 % 2;
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("[");
            sb.append(level);
            sb.append("] ");
            sb.append(str);
            printStream.println(sb.toString());
            int i2 = b + 95;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // defpackage.lambdatryToProvidePreviewSurface2androidxcameraviewTextureViewImplementation
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Level level, String str, Throwable th) {
            int i = 2 % 2;
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("[");
            sb.append(level);
            sb.append("] ");
            sb.append(str);
            printStream.println(sb.toString());
            th.printStackTrace(System.out);
            int i2 = b + 81;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 97 / 0;
            }
        }

        private static void c(char c, int i, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i4 = $11 + 83;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    try {
                        Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i - i5])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), Color.green(0) + 2187, 40 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 841711447, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) (-1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 33017), Color.alpha(0) + 3011, TextUtils.indexOf("", "", 0) + 26, 321985076, false, $$c((byte) ($$a[1] + 1), b4, (byte) (b4 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 3;
                            byte b6 = (byte) (b5 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36506 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 3375 - MotionEvent.axisFromString(""), 17 - (ViewConfiguration.getWindowTouchSlop() >> 8), -968507904, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarSize() >> 8) + 2187, (Process.myPid() >> 22) + 40, 841711447, false, $$c(b7, b8, (byte) (b8 + 1)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b9 = (byte) (-1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 33017), 3010 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 26, 321985076, false, $$c((byte) ($$a[1] + 1), b9, (byte) (b9 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        byte b10 = (byte) 3;
                        byte b11 = (byte) (b10 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (36505 - KeyEvent.keyCodeFromString("")), 3376 - Color.blue(0), Process.getGidForName("") + 18, -968507904, false, $$c(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                }
            }
            char[] cArr = new char[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i7 = $11 + 53;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        byte b12 = (byte) 3;
                        byte b13 = (byte) (b12 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (36505 - KeyEvent.keyCodeFromString("")), 3376 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 17, -968507904, false, $$c(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                    throw null;
                }
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr9 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    byte b14 = (byte) 3;
                    byte b15 = (byte) (b14 - 4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (36505 - (ViewConfiguration.getScrollBarSize() >> 8)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3376, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 17, -968507904, false, $$c(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr9);
            }
            objArr[0] = new String(cArr);
        }

        /* JADX WARN: Code duplicated, block: B:45:0x01e4  */
        /* JADX WARN: Code duplicated, block: B:46:0x01e5  */
        private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
            int i4;
            char c;
            Throwable cause;
            int i5 = 2 % 2;
            setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
            char[] cArr2 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (true) {
                i4 = 29209604;
                c = '0';
                if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                    break;
                }
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i6 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) (-1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AndroidCharacter.getMirror('0') - '0'), 3291 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getCapsMode("", 0, 0) + 31, 1199271174, false, $$c((byte) 11, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) (-1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 651 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 44 - (ViewConfiguration.getPressedStateDuration() >> 16), -450685997, false, $$c((byte) 10, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        int i7 = $11 + 117;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
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
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            if (i3 > 0) {
                int i9 = $10 + 11;
                $11 = i9 % 128;
                int i10 = i9 % 2;
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
                    int i11 = $11 + 3;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + i2];
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b4 = (byte) (-1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", c, 0)), (-16776565) - Color.rgb(0, 0, 0), 44 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -450685997, false, $$c((byte) 10, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } else {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 651;
                            int iIndexOf = 43 - TextUtils.indexOf("", c, 0);
                            byte b5 = (byte) (-1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, absoluteGravity, iIndexOf, -450685997, false, $$c((byte) 10, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        i4 = 29209604;
                        c = '0';
                    }
                }
                int i12 = $11 + 101;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 3 / 3;
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2) {
            char c;
            Object obj;
            Class<?> cls;
            Class<?> cls2;
            char cRgb;
            long globalActionKeyTimeout;
            long j;
            int i3;
            int i4;
            Object objInvoke;
            int i5;
            int i6;
            int i7;
            int i8 = 2 % 2;
            if (context != null) {
                try {
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
                    int i9 = b;
                    int i10 = ((i9 | 19) << 1) - (i9 ^ 19);
                    g = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = ((iLastIndexOf & 215) << 1) + (215 ^ iLastIndexOf);
                    int iAxisFromString = MotionEvent.axisFromString("");
                    int i13 = ((iAxisFromString | 32) << 1) - (iAxisFromString ^ 32);
                    int i14 = b;
                    int i15 = (i14 ^ 89) + ((i14 & 89) << 1);
                    g = i15 % 128;
                    if (i15 % 2 == 0) {
                        Object[] objArr = new Object[1];
                        a(true, i12, i13, 6 << (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{29, 15, 25, 65516, 65512, 65529, 65518, 65534, 0, 65512, 65518, 65495, 15, 20, 26, 29, 15, 25, 65516, 65512, 65530, 65495, 18, ' ', '\r', 16, 65519, 65483, 15, 20, 26}, objArr);
                        obj = objArr[0];
                    } else {
                        Object[] objArr2 = new Object[1];
                        a(true, i12, i13, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6, new char[]{29, 15, 25, 65516, 65512, 65529, 65518, 65534, 0, 65512, 65518, 65495, 15, 20, 26, 29, 15, 25, 65516, 65512, 65530, 65495, 18, ' ', '\r', 16, 65519, 65483, 15, 20, 26}, objArr2);
                        obj = objArr2[0];
                    }
                    try {
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 220;
                        int iRed = Color.red(0);
                        int i16 = iRed * (-1529);
                        int i17 = ((i16 | (-29032)) << 1) - (i16 ^ (-29032));
                        int i18 = ~iRed;
                        int i19 = (i18 & (-39)) | (i18 ^ (-39));
                        int i20 = ~i;
                        int i21 = ~((i19 ^ i20) | (i19 & i20));
                        int i22 = ~iRed;
                        int i23 = (i22 ^ 38) | (i22 & 38);
                        int i24 = ~((i23 ^ i) | (i23 & i));
                        int i25 = (i21 ^ i24) | (i24 & i21);
                        int i26 = ((-39) ^ iRed) | ((-39) & iRed);
                        int i27 = ~((i26 ^ i) | (i26 & i));
                        int i28 = -(-(((i25 ^ i27) | (i25 & i27)) * 765));
                        int i29 = (i17 ^ i28) + ((i28 & i17) << 1);
                        int i30 = ~(i22 | (-39));
                        int i31 = ~(i22 | i20);
                        int i32 = i29 + (((i30 ^ i31) | (i30 & i31)) * 1530);
                        int i33 = ~(i22 | i);
                        int i34 = ~i;
                        int i35 = ((-39) ^ i34) | ((-39) & i34);
                        int i36 = ~((i35 ^ iRed) | (iRed & i35));
                        int i37 = (i32 - (~(((i33 & i36) | (i33 ^ i36)) * 765))) - 1;
                        int i38 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                        Object[] objArr3 = new Object[1];
                        a(true, offsetBefore, i37, (i38 & 37) + (i38 | 37), new char[]{6, 21, 14, '\b', 19, 14, 23, 65525, 65493, 65493, 65498, 65533, 65491, 65493, 65493, 65498, 29, 65491, '\r', 25, 26, 6, 65491, 30, 25, 14, 23, 26, '\b', '\n', 24, 65491, 29, 6, 27, 6, 15, 17}, objArr3);
                        Object objNewInstance = Class.forName((String) objArr3[0]).getDeclaredConstructor(String.class).newInstance((String) obj);
                        int i39 = -(KeyEvent.getMaxKeyCode() >> 16);
                        int i40 = ~i39;
                        int i41 = i40 | i20;
                        int i42 = ~((i41 & 214) | (i41 ^ 214));
                        int i43 = ~(((-215) & i20) | ((-215) ^ i20) | i39);
                        int i44 = (i42 & i43) | (i42 ^ i43);
                        int i45 = b;
                        int i46 = (i45 & 11) + (i45 | 11);
                        g = i46 % 128;
                        int i47 = i46 % 2;
                        int i48 = ((i39 * (-183)) - 39162) + ((-184) * i44);
                        int i49 = ~(i40 | (-215));
                        int i50 = ~i39;
                        int i51 = ~((i50 & i34) | (i50 ^ i34));
                        int i52 = ((i49 & i51) | (i49 ^ i51) | (~(((-215) & i34) | ((-215) ^ i34)))) * 184;
                        int i53 = (((i48 & i52) + (i48 | i52)) - (~(((i39 & 214) | (i39 ^ 214)) * 184))) - 1;
                        int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i54 = (doubleTapTimeout * (-1335)) - 20677;
                        int i55 = (doubleTapTimeout ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (doubleTapTimeout & iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        int i56 = ~i55;
                        int i57 = (((-32) ^ i56) | (i56 & (-32))) * (-668);
                        int i58 = (i54 ^ i57) + ((i54 & i57) << 1);
                        int i59 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & (-32)) | ((-32) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        int i60 = ((doubleTapTimeout & i59) | (doubleTapTimeout ^ i59)) * 1336;
                        Object[] objArr4 = new Object[1];
                        a(true, i53, (((i58 | i60) << 1) - (i60 ^ i58)) + (((i55 ^ (-32)) | (i55 & (-32))) * 668), 7 - (~(-(-(KeyEvent.getMaxKeyCode() >> 16)))), new char[]{65516, 65512, 65530, 65495, 65534, 0, 65512, 65518, 18, ' ', '\r', 16, 65519, 65483, 15, 20, 26, 29, 15, 25, 65516, 65512, 65529, 65518, 65495, 15, 20, 26, 29, 15, 25}, objArr4);
                        String str = (String) objArr4[0];
                        int i61 = b;
                        int i62 = ((i61 | 53) << 1) - (i61 ^ 53);
                        g = i62 % 128;
                        int i63 = i62 % 2;
                        try {
                            Object[] objArr5 = {str};
                            int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i64 = bitsPerPixel * 399;
                            int i65 = (i64 ^ 88179) + ((i64 & 88179) << 1);
                            int i66 = ~bitsPerPixel;
                            int i67 = ~((i66 & 221) | (i66 ^ 221));
                            int i68 = ~(((-222) ^ bitsPerPixel) | ((-222) & bitsPerPixel));
                            int i69 = -(-(((~(((-222) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | ((-222) & iTuitionPaymentFragmentspecialinlinedviewModeldefault2))) | (i67 ^ i68) | (i68 & i67)) * 398));
                            int i70 = ((i65 | i69) << 1) - (i69 ^ i65);
                            int i71 = -(-((bitsPerPixel | 221) * (-1194)));
                            int i72 = (i70 & i71) + (i71 | i70);
                            int i73 = b;
                            int i74 = ((i73 | 21) << 1) - (i73 ^ 21);
                            g = i74 % 128;
                            int i75 = i74 % 2;
                            int i76 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i77 = -(-(((~(((-222) & bitsPerPixel) | ((-222) ^ bitsPerPixel))) | (~((i76 & (-222)) | ((-222) ^ i76))) | i67) * 398));
                            int i78 = (i72 ^ i77) + ((i77 & i72) << 1);
                            int i79 = -(-Gravity.getAbsoluteGravity(0, 0));
                            int i80 = (i79 & 38) + (i79 | 38);
                            int i81 = b;
                            int i82 = (i81 & 67) + (i81 | 67);
                            g = i82 % 128;
                            if (i82 % 2 == 0) {
                                Object[] objArr6 = new Object[1];
                                a(true, i78, i80, 38 >> TextUtils.indexOf((CharSequence) "", ')', 1), new char[]{6, 21, 14, '\b', 19, 14, 23, 65525, 65493, 65493, 65498, 65533, 65491, 65493, 65493, 65498, 29, 65491, '\r', 25, 26, 6, 65491, 30, 25, 14, 23, 26, '\b', '\n', 24, 65491, 29, 6, 27, 6, 15, 17}, objArr6);
                                cls = Class.forName((String) objArr6[0]);
                            } else {
                                int i83 = -(-TextUtils.indexOf((CharSequence) "", '0', 0));
                                Object[] objArr7 = new Object[1];
                                a(true, i78, i80, (i83 ^ 38) + ((38 & i83) << 1), new char[]{6, 21, 14, '\b', 19, 14, 23, 65525, 65493, 65493, 65498, 65533, 65491, 65493, 65493, 65498, 29, 65491, '\r', 25, 26, 6, 65491, 30, 25, 14, 23, 26, '\b', '\n', 24, 65491, 29, 6, 27, 6, 15, 17}, objArr7);
                                cls = Class.forName((String) objArr7[0]);
                            }
                            Class<?>[] clsArr = new Class[1];
                            clsArr[0] = String.class;
                            Object objNewInstance2 = cls.getDeclaredConstructor(clsArr).newInstance(objArr5);
                            try {
                                int i84 = -View.resolveSizeAndState(0, 0, 0);
                                int i85 = (i84 & 230) + (i84 | 230);
                                int iResolveSize = View.resolveSize(0, 0);
                                int i86 = (iResolveSize & 23) + (iResolveSize | 23);
                                int i87 = -(Process.myTid() >> 22);
                                Object[] objArr8 = new Object[1];
                                a(true, i85, i86, (i87 ^ 19) + ((i87 & 19) << 1), new char[]{'\t', '\n', 65502, 65481, 15, '\t', 0, 15, '\t', '\n', 65534, 65481, 65535, 4, '\n', '\r', 65535, '\t', 65532, 15, 19, 0, 15}, objArr8);
                                String str2 = (String) objArr8[0];
                                int i88 = b;
                                int i89 = (i88 & 51) + (i88 | 51);
                                g = i89 % 128;
                                if (i89 % 2 == 0) {
                                    cls2 = Class.forName(str2);
                                    cRgb = (char) (16777216 << Color.rgb(1, 0, 1));
                                    globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
                                    j = 1;
                                } else {
                                    cls2 = Class.forName(str2);
                                    int i90 = -(-Color.rgb(0, 0, 0));
                                    cRgb = (char) (((i90 | 16777216) << 1) - (i90 ^ 16777216));
                                    globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
                                    j = 0;
                                }
                                int i91 = (globalActionKeyTimeout > j ? 1 : (globalActionKeyTimeout == j ? 0 : -1));
                                int i92 = (-380) * i91;
                                int i93 = (i92 & (-382)) + (i92 | (-382));
                                int i94 = ((-1) ^ i) | i;
                                int i95 = ~i91;
                                int i96 = ((i94 ^ i95) | (i94 & i95)) * (-381);
                                int i97 = (i93 ^ i96) + ((i96 & i93) << 1);
                                int i98 = ~NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i99 = (1000062580 ^ i98) | (i98 & 1000062580);
                                int i100 = -(-(i99 * 495));
                                int i101 = ((-958838355) ^ i100) + (((-958838355) & i100) << 1);
                                int i102 = ~i99;
                                int i103 = ((680080964 ^ i102) | (i102 & 680080964)) * 495;
                                int i104 = (i101 ^ i103) + ((i101 & i103) << 1);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i105 = (-1718926521) + ((1075968575 | (~((1142281008 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (1142281008 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3)))) * (-964));
                                int i106 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                if (i104 > i105 + (((~((1142281008 ^ i106) | (i106 & 1142281008))) | 2107407) * (-964))) {
                                    int i107 = ~i95;
                                    int i108 = ~((i34 ^ (-1)) | i34);
                                    int i109 = (i107 & i108) | (i107 ^ i108);
                                    int i110 = ~((i91 ^ (-1)) | i91);
                                    i3 = i97 - (381 % ((i109 & i110) | (i109 ^ i110)));
                                } else {
                                    int i111 = (~i95) | (~((i20 ^ (-1)) | i20));
                                    int i112 = ~((i91 ^ (-1)) | i91);
                                    int i113 = -(-(((i111 & i112) | (i111 ^ i112)) * 381));
                                    i3 = (i97 ^ i113) + ((i97 & i113) << 1);
                                }
                                int i114 = i3;
                                int i115 = -(Process.myTid() >> 22);
                                int i116 = i115 * 450;
                                int i117 = b;
                                int i118 = ((i117 | 45) << 1) - (i117 ^ 45);
                                g = i118 % 128;
                                if (i118 % 2 == 0) {
                                    int i119 = i116 / (-7616);
                                    int i120 = ~i115;
                                    int i121 = ~((i120 & 17) | (i120 ^ 17));
                                    int i122 = ~((-18) | i115 | i);
                                    int i123 = 448 - (~(-((i121 ^ i122) | (i121 & i122))));
                                    i4 = (i119 & i123) + (i119 | i123);
                                } else {
                                    int i124 = (i116 & (-7616)) + (i116 | (-7616));
                                    int i125 = ~((~i115) | 17);
                                    int i126 = ((-18) ^ i115) | ((-18) & i115);
                                    int i127 = ~((i126 ^ i) | (i126 & i));
                                    int i128 = -(-(((i125 ^ i127) | (i125 & i127)) * 449));
                                    i4 = ((i124 | i128) << 1) - (i128 ^ i124);
                                }
                                int i129 = ~i115;
                                int i130 = i4 + ((-1347) * (~((i129 ^ 17) | (i129 & 17))));
                                int i131 = ~((i129 & 17) | (i129 ^ 17));
                                int i132 = ((-18) ^ i34) | ((-18) & i34);
                                int i133 = ~((i132 ^ i115) | (i132 & i115));
                                int i134 = (i130 - (~(((i131 ^ i133) | (i133 & i131)) * 449))) - 1;
                                Object[] objArr9 = new Object[1];
                                c(cRgb, i114, i134, objArr9);
                                Object objInvoke2 = cls2.getMethod((String) objArr9[0], null).invoke(context, null);
                                try {
                                    int i135 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    int i136 = (i135 & 231) + (i135 | 231);
                                    int i137 = 22 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                                    int i138 = b;
                                    int i139 = (i138 & 25) + (i138 | 25);
                                    g = i139 % 128;
                                    int i140 = i139 % 2;
                                    int i141 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i142 = i141 * 367;
                                    int i143 = (i142 ^ 6606) + ((i142 & 6606) << 1);
                                    int i144 = ((i141 ^ 18) | (i141 & 18)) * (-366);
                                    int i145 = ((i143 | i144) << 1) - (i144 ^ i143);
                                    int i146 = ~((-19) | iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                                    int i147 = (i145 - (~(-(-(((i146 & i141) | (i141 ^ i146)) * (-366)))))) - 1;
                                    int i148 = ~i141;
                                    int i149 = -(-(((~(((-19) ^ i141) | (i141 & (-19)) | iTuitionPaymentFragmentspecialinlinedviewModeldefault4)) | (~((i148 & 18) | (i148 ^ 18)))) * 366));
                                    Object[] objArr10 = new Object[1];
                                    a(true, i136, i137, (i147 & i149) + (i149 | i147), new char[]{'\t', '\n', 65502, 65481, 15, '\t', 0, 15, '\t', '\n', 65534, 65481, 65535, 4, '\n', '\r', 65535, '\t', 65532, 15, 19, 0, 15}, objArr10);
                                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                                    char trimmedLength = (char) TextUtils.getTrimmedLength("");
                                    int i150 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                    Object[] objArr11 = new Object[1];
                                    c(trimmedLength, ((i150 | 17) << 1) - (i150 ^ 17), 13 - (~(-(-(ViewConfiguration.getScrollBarSize() >> 8)))), objArr11);
                                    String str3 = (String) objArr11[0];
                                    int i151 = g;
                                    int i152 = ((i151 | 109) << 1) - (i151 ^ 109);
                                    b = i152 % 128;
                                    if (i152 % 2 != 0) {
                                        objInvoke = cls3.getMethod(str3, null).invoke(context, null);
                                        i5 = 43;
                                    } else {
                                        objInvoke = cls3.getMethod(str3, null).invoke(context, null);
                                        i5 = 64;
                                    }
                                    try {
                                        Object[] objArr12 = {objInvoke, Integer.valueOf(i5)};
                                        int i153 = -View.getDefaultSize(0, 0);
                                        int i154 = i153 * 193;
                                        int i155 = (i154 & 7803376) + (i154 | 7803376);
                                        int i156 = ~i153;
                                        int i157 = ~((i156 ^ 40432) | (i156 & 40432));
                                        int i158 = ~((i156 ^ (-40433)) | (i156 & (-40433)));
                                        int i159 = ~(((-40433) ^ i34) | ((-40433) & i34));
                                        int i160 = i155 + (((i20 ^ i157) | (i157 & i20)) * (-192)) + (((i158 ^ i159) | (i158 & i159)) * (-384));
                                        int i161 = g;
                                        int i162 = (i161 & 83) + (i161 | 83);
                                        b = i162 % 128;
                                        int i163 = i162 % 2;
                                        int i164 = ~i153;
                                        int i165 = (i164 & (-40433)) | (i164 ^ (-40433));
                                        int i166 = ~((i165 & i) | (i165 ^ i));
                                        int i167 = (-40433) | i20;
                                        int i168 = ~((i167 & i153) | (i167 ^ i153));
                                        int i169 = (i166 & i168) | (i166 ^ i168);
                                        int i170 = i153 | 40432;
                                        int i171 = ~((i170 & i) | (i170 ^ i));
                                        int i172 = DerHeader.TAG_CLASS_PRIVATE * ((i171 & i169) | (i169 ^ i171));
                                        char c2 = (char) (((i160 | i172) << 1) - (i172 ^ i160));
                                        int i173 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                        int i174 = ~i173;
                                        int i175 = (i174 ^ 32) | (i174 & 32);
                                        int i176 = ~i175;
                                        int i177 = ((i173 * 615) - 19616) + (((~(((-33) ^ i173) | ((-33) & i173))) | (i ^ i176) | (i176 & i)) * 614);
                                        int i178 = g;
                                        int i179 = ((i178 | 17) << 1) - (i178 ^ 17);
                                        b = i179 % 128;
                                        int i180 = i179 % 2;
                                        int i181 = ~i173;
                                        int i182 = ~((i181 & i20) | (i181 ^ i20));
                                        int i183 = ~i175;
                                        int i184 = (-1228) * ((i182 & i183) | (i182 ^ i183) | (~(i34 | 32)));
                                        int i185 = ((i177 | i184) << 1) - (i177 ^ i184);
                                        int i186 = (i174 ^ (-33)) | (i174 & (-33));
                                        int i187 = i173 | i20;
                                        int i188 = ((~((i187 & 32) | (i187 ^ 32))) | (~((i186 & i34) | (i186 ^ i34)))) * 614;
                                        Object[] objArr13 = new Object[1];
                                        c(c2, (i185 ^ i188) + ((i185 & i188) << 1), 32 - (~(-TextUtils.indexOf("", "", 0))), objArr13);
                                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                                        int i189 = -(Process.myPid() >> 22);
                                        int i190 = (i189 * 141) - 31831;
                                        int i191 = ~i189;
                                        int i192 = ~((i191 ^ 229) | (i191 & 229));
                                        int i193 = ~i189;
                                        int i194 = ~((i193 ^ i) | (i193 & i));
                                        int i195 = -(-(((i192 ^ i194) | (i192 & i194)) * (-280)));
                                        int i196 = ((i190 | i195) << 1) - (i190 ^ i195);
                                        int i197 = ~(i191 | i);
                                        int i198 = ~((-230) | i);
                                        int i199 = ((i197 ^ i198) | (i197 & i198)) * 140;
                                        int i200 = (i196 ^ i199) + ((i199 & i196) << 1);
                                        int i201 = i193 | (-230);
                                        int i202 = ~((i201 & i) | (i201 ^ i));
                                        int i203 = (i191 & i20) | (i191 ^ i20);
                                        int i204 = ~((i203 & 229) | (i203 ^ 229));
                                        int i205 = (i202 & i204) | (i202 ^ i204);
                                        int i206 = (-230) | i34;
                                        int i207 = ~((i189 & i206) | (i206 ^ i189));
                                        int i208 = -(-(((i207 & i205) | (i205 ^ i207)) * 140));
                                        int i209 = (i200 ^ i208) + ((i208 & i200) << 1);
                                        int i210 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                        int i211 = i210 * 567;
                                        int i212 = (i211 ^ (-7345)) + ((i211 & (-7345)) << 1);
                                        int i213 = ~i210;
                                        int i214 = ~((i213 ^ 13) | (i213 & 13));
                                        int i215 = ~i210;
                                        int i216 = (i214 | (~((i215 & i) | (i215 ^ i)))) * (-566);
                                        int i217 = (i212 & i216) + (i216 | i212) + ((~((i210 & (-14)) | ((-14) ^ i210))) * 566);
                                        int i218 = i213 | (-14);
                                        Object[] objArr14 = new Object[1];
                                        a(false, i209, (i217 - (~(-(-((~((i218 & i) | (i218 ^ i))) * 566))))) - 1, 8 - (~(-(ViewConfiguration.getScrollBarSize() >> 8))), new char[]{65535, 7, 65533, 3, 1, 65509, '\n', 2, 11, 3, 1, 16, 65516, 65533}, objArr14);
                                        Object objInvoke3 = cls4.getMethod((String) objArr14[0], String.class, Integer.TYPE).invoke(objInvoke2, objArr12);
                                        int iIndexOf = 226 - TextUtils.indexOf("", "", 0);
                                        int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
                                        int iBlue = Color.blue(0);
                                        Object[] objArr15 = new Object[1];
                                        a(true, iIndexOf, (pressedStateDuration & 30) + (pressedStateDuration | 30), ((iBlue | 30) << 1) - (iBlue ^ 30), new char[]{14, 5, '\r', 65512, 4, 6, 0, '\n', 2, 0, 65519, 65485, '\f', 15, 65485, 19, '\r', 4, 19, '\r', 14, 2, 65485, 3, '\b', 14, 17, 3, '\r', 0}, objArr15);
                                        Class<?> cls5 = Class.forName((String) objArr15[0]);
                                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("");
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i219 = g;
                                        int i220 = ((i219 | 27) << 1) - (i219 ^ 27);
                                        b = i220 % 128;
                                        int i221 = i220 % 2;
                                        int i222 = 1773 * iKeyCodeFromString;
                                        int i223 = (i222 & (-56640)) + (i222 | (-56640));
                                        int i224 = ~iKeyCodeFromString;
                                        int i225 = (~((i224 & (-65)) | (i224 ^ (-65)))) | (~(((-65) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-65) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5)));
                                        int i226 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                        int i227 = (i226 ^ iKeyCodeFromString) | (i226 & iKeyCodeFromString);
                                        int i228 = ~((i227 & 64) | (i227 ^ 64));
                                        int i229 = ((i225 & i228) | (i225 ^ i228)) * 886;
                                        int i230 = ((i223 | i229) << 1) - (i229 ^ i223);
                                        int i231 = ~(i226 | 64);
                                        int i232 = -(-(((i231 & iKeyCodeFromString) | (iKeyCodeFromString ^ i231)) * (-1772)));
                                        int i233 = (i230 & i232) + (i232 | i230);
                                        int i234 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                        int i235 = (~((iKeyCodeFromString & i234) | (i234 ^ iKeyCodeFromString))) * 886;
                                        int i236 = ((i233 | i235) << 1) - (i235 ^ i233);
                                        int i237 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i238 = b;
                                        int i239 = (i238 ^ 95) + ((i238 & 95) << 1);
                                        g = i239 % 128;
                                        int i240 = i239 % 2;
                                        int i241 = (i237 * 303) - 3311;
                                        int i242 = ~i237;
                                        int i243 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                        int i244 = (i243 & i242) | (i242 ^ i243);
                                        int i245 = (i237 ^ 11) | (i237 & 11);
                                        int i246 = -(-(((~((i244 & 11) | (i244 ^ 11))) | (~((i245 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i245 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6)))) * (-302)));
                                        int i247 = ((i241 | i246) << 1) - (i241 ^ i246);
                                        int i248 = -(-((~((i242 ^ 11) | (i242 & 11) | iTuitionPaymentFragmentspecialinlinedviewModeldefault6)) * (-604)));
                                        int i249 = (i247 ^ i248) + ((i248 & i247) << 1) + (((~((i237 & (-12)) | ((-12) ^ i237))) | (~((11 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (11 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6)))) * 302);
                                        Object[] objArr16 = new Object[1];
                                        c(cLastIndexOf, i236, i249, objArr16);
                                        Object[] objArr17 = (Object[]) cls5.getField((String) objArr16[0]).get(objInvoke3);
                                        int length = objArr17.length;
                                        int i250 = 0;
                                        while (i250 < length) {
                                            Object obj2 = objArr17[i250];
                                            char c3 = (char) (27479 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                            int i251 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                            Object[] objArr18 = new Object[1];
                                            c(c3, (i251 ^ 74) + ((i251 & 74) << 1), 4 - (~(-KeyEvent.keyCodeFromString(""))), objArr18);
                                            try {
                                                Object[] objArr19 = {(String) objArr18[0]};
                                                char offsetBefore2 = (char) TextUtils.getOffsetBefore("", 0);
                                                int i252 = -(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                                Object[] objArr20 = new Object[1];
                                                c(offsetBefore2, ((i252 | 78) << 1) - (i252 ^ 78), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37, objArr20);
                                                Class<?> cls6 = Class.forName((String) objArr20[0]);
                                                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0);
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                int i253 = iLastIndexOf2 * (-380);
                                                int i254 = ((i253 | 89006) << 1) - (i253 ^ 89006);
                                                int i255 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault7 ^ 233) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault7 & 233);
                                                int i256 = ~iLastIndexOf2;
                                                int i257 = -(-(((i255 ^ i256) | (i255 & i256)) * (-381)));
                                                int i258 = (i254 ^ i257) + ((i254 & i257) << 1);
                                                int i259 = ~((i256 ^ (-234)) | (i256 & (-234)));
                                                int i260 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                int i261 = ~((i260 & 233) | (i260 ^ 233));
                                                int i262 = (i261 & i259) | (i259 ^ i261);
                                                int i263 = ~(iLastIndexOf2 | 233);
                                                int i264 = ((i262 & i263) | (i262 ^ i263)) * 381;
                                                int i265 = (i258 ^ i264) + ((i258 & i264) << 1);
                                                int i266 = ~iLastIndexOf2;
                                                int i267 = -(-((~((i266 & 233) | (i266 ^ 233))) * 381));
                                                int i268 = (i265 & i267) + (i267 | i265);
                                                int i269 = -(ViewConfiguration.getTapTimeout() >> 16);
                                                int i270 = (i269 ^ 11) + ((i269 & 11) << 1);
                                                int i271 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                Object[] objArr21 = new Object[1];
                                                a(false, i268, i270, ((i271 | 8) << 1) - (i271 ^ 8), new char[]{65506, 7, '\f', '\r', 65530, 7, 65532, 65534, 0, 65534, '\r'}, objArr21);
                                                Object objInvoke4 = cls6.getMethod((String) objArr21[0], String.class).invoke(null, objArr19);
                                                try {
                                                    int i272 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                    int i273 = (i272 ^ 229) + ((i272 & 229) << 1);
                                                    int i274 = -(-((Process.getThreadPriority(0) + 20) >> 6));
                                                    int i275 = ((i274 | 28) << 1) - (i274 ^ 28);
                                                    int iMyPid = Process.myPid() >> 22;
                                                    int i276 = g;
                                                    int i277 = (i276 & 119) + (i276 | 119);
                                                    int i278 = i277 % 128;
                                                    b = i278;
                                                    if (i277 % 2 != 0) {
                                                        i6 = (-559) % iMyPid;
                                                        i7 = i20;
                                                    } else {
                                                        i6 = (iMyPid * (-559)) + 9537;
                                                        i7 = i34;
                                                    }
                                                    int i279 = -(-((~((i7 ^ iMyPid) | (i7 & iMyPid))) * (-560)));
                                                    int i280 = (i6 & i279) + (i6 | i279);
                                                    int i281 = ((-18) ^ iMyPid) | ((-18) & iMyPid);
                                                    int i282 = (~((i281 ^ i) | (i281 & i))) * (-560);
                                                    int i283 = (i280 & i282) + (i280 | i282);
                                                    int i284 = i278 + 1;
                                                    g = i284 % 128;
                                                    if (i284 % 2 == 0) {
                                                        Object obj3 = null;
                                                        obj3.hashCode();
                                                        throw null;
                                                    }
                                                    int i285 = ~iMyPid;
                                                    int i286 = ~((i285 & 17) | (i285 ^ 17));
                                                    int i287 = ~(i34 | 17);
                                                    int i288 = 560 * ((i286 & i287) | (i286 ^ i287));
                                                    int i289 = ((i283 | i288) << 1) - (i283 ^ i288);
                                                    Object[] objArr22 = new Object[1];
                                                    a(false, i273, i275, i289, new char[]{16, 1, '\n', 16, 65482, '\f', '\t', 65482, 65519, 5, 3, '\n', 65533, 16, 17, 14, 1, 65533, '\n', 0, 14, 11, 5, 0, 65482, 65535, 11, '\n'}, objArr22);
                                                    Class<?> cls7 = Class.forName((String) objArr22[0]);
                                                    char c4 = (char) ((-ImageFormat.getBitsPerPixel(0)) - 1);
                                                    int i290 = -((Process.getThreadPriority(0) + 20) >> 6);
                                                    Object[] objArr23 = objArr17;
                                                    int i291 = length;
                                                    Object[] objArr24 = new Object[1];
                                                    c(c4, (i290 ^ 116) + ((i290 & 116) << 1), 10 - (~(-(-(ViewConfiguration.getMinimumFlingVelocity() >> 16)))), objArr24);
                                                    try {
                                                        Object[] objArr25 = {new ByteArrayInputStream((byte[]) cls7.getMethod((String) objArr24[0], null).invoke(obj2, null))};
                                                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                                                        int i292 = -AndroidCharacter.getMirror('0');
                                                        int i293 = i292 * (-51);
                                                        int i294 = (i293 & 6731) + (i293 | 6731);
                                                        int i295 = i34 | i292;
                                                        int i296 = -(-((~((i295 & 127) | (i295 ^ 127))) * 52));
                                                        int i297 = (i294 & i296) + (i296 | i294);
                                                        int i298 = ~(((-128) & i20) | ((-128) ^ i20));
                                                        int i299 = ~((-128) | i292);
                                                        int i300 = (i298 & i299) | (i298 ^ i299);
                                                        int i301 = ~((i20 ^ i292) | (i20 & i292));
                                                        int i302 = i297 + (((i300 & i301) | (i300 ^ i301)) * (-52));
                                                        int i303 = ~i292;
                                                        int i304 = ~((i303 & i20) | (i303 ^ i20));
                                                        int i305 = ~i292;
                                                        int i306 = ~((i305 & 127) | (i305 ^ 127));
                                                        int i307 = (i302 - (~(((i306 & i304) | (i304 ^ i306)) * 52))) - 1;
                                                        int i308 = -(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                                        int i309 = (i308 & 36) + (i308 | 36);
                                                        Object[] objArr26 = new Object[1];
                                                        c(absoluteGravity, i307, i309, objArr26);
                                                        Class<?> cls8 = Class.forName((String) objArr26[0]);
                                                        int i310 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                                        int i311 = -View.getDefaultSize(0, 0);
                                                        int i312 = ((i311 | 127) << 1) - (i311 ^ 127);
                                                        int i313 = -MotionEvent.axisFromString("");
                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                        int i314 = ~(((-19) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | ((-19) & iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                                                        int i315 = ((((i313 * 367) + 6606) + ((i313 | 18) * (-366))) - (~(-(-(((i313 ^ i314) | (i314 & i313)) * (-366)))))) - 1;
                                                        int i316 = ~((~i313) | 18);
                                                        int i317 = (-19) | i313;
                                                        int i318 = ~((i317 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i317 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                                                        Object[] objArr27 = new Object[1];
                                                        c((char) ((i310 ^ 57060) + ((i310 & 57060) << 1)), i312, i315 + (((i318 & i316) | (i316 ^ i318)) * 366), objArr27);
                                                        Object objInvoke5 = cls8.getMethod((String) objArr27[0], InputStream.class).invoke(objInvoke4, objArr25);
                                                        try {
                                                            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0');
                                                            char c5 = (char) (((iIndexOf2 | 53015) << 1) - (iIndexOf2 ^ 53015));
                                                            int iNormalizeMetaState = 146 - KeyEvent.normalizeMetaState(0);
                                                            int iRed2 = Color.red(0);
                                                            int i319 = g;
                                                            int i320 = (i319 ^ 49) + ((i319 & 49) << 1);
                                                            b = i320 % 128;
                                                            int i321 = i320 % 2;
                                                            int i322 = ~iRed2;
                                                            int i323 = ((i319 | 121) << 1) - (i319 ^ 121);
                                                            b = i323 % 128;
                                                            int i324 = i323 % 2;
                                                            int i325 = ~((i322 ^ 34) | (i322 & 34));
                                                            int i326 = ~((i20 ^ 34) | (i20 & 34));
                                                            int i327 = ((((-183) * iRed2) + 6290) - (~(184 * ((i325 & i326) | (i325 ^ i326))))) - 1;
                                                            int i328 = ~(((-35) & iRed2) | ((-35) ^ iRed2));
                                                            int i329 = (i327 - (~(((i328 & i) | (i ^ i328)) * (-184)))) - 1;
                                                            int i330 = -(-((~((i322 ^ i20) | (i322 & i20))) * 184));
                                                            int i331 = (i329 ^ i330) + ((i330 & i329) << 1);
                                                            Object[] objArr28 = new Object[1];
                                                            c(c5, iNormalizeMetaState, i331, objArr28);
                                                            Class<?> cls9 = Class.forName((String) objArr28[0]);
                                                            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                                                            int i332 = g;
                                                            int i333 = (i332 ^ 53) + ((i332 & 53) << 1);
                                                            b = i333 % 128;
                                                            int i334 = i333 % 2;
                                                            int i335 = 179 - (~(-(-TextUtils.indexOf("", "", 0))));
                                                            int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                                            int i336 = (maximumDrawingCacheSize ^ 23) + ((maximumDrawingCacheSize & 23) << 1);
                                                            Object[] objArr29 = new Object[1];
                                                            c(packedPositionChild, i335, i336, objArr29);
                                                            if (!objNewInstance.equals(cls9.getMethod((String) objArr29[0], null).invoke(objInvoke5, null))) {
                                                                int i337 = b;
                                                                int i338 = (i337 & 29) + (i337 | 29);
                                                                g = i338 % 128;
                                                                int i339 = i338 % 2;
                                                                NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                try {
                                                                    char c6 = (char) (53012 - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))))));
                                                                    int touchSlop = 146 - (ViewConfiguration.getTouchSlop() >> 8);
                                                                    int i340 = -(-View.getDefaultSize(0, 0));
                                                                    Object[] objArr30 = new Object[1];
                                                                    c(c6, touchSlop, (i340 & 34) + (i340 | 34), objArr30);
                                                                    Class<?> cls10 = Class.forName((String) objArr30[0]);
                                                                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                                    int offsetBefore3 = TextUtils.getOffsetBefore("", 0) + 180;
                                                                    int i341 = -Color.argb(0, 0, 0, 0);
                                                                    int i342 = (i341 * 1773) - 20355;
                                                                    int i343 = (i34 ^ i341) | (i34 & i341);
                                                                    int i344 = -(-(((~((~i341) | (-24))) | (~(((-24) ^ i) | ((-24) & i))) | (~((i343 ^ 23) | (i343 & 23)))) * 886));
                                                                    int i345 = ((i342 | i344) << 1) - (i342 ^ i344);
                                                                    int i346 = ~((i20 ^ 23) | (i20 & 23));
                                                                    int i347 = i345 + (((i341 & i346) | (i341 ^ i346)) * (-1772));
                                                                    int i348 = (~i343) * 886;
                                                                    int i349 = (i347 ^ i348) + ((i348 & i347) << 1);
                                                                    Object[] objArr31 = new Object[1];
                                                                    c(keyRepeatDelay, offsetBefore3, i349, objArr31);
                                                                    if (!objNewInstance2.equals(cls10.getMethod((String) objArr31[0], null).invoke(objInvoke5, null))) {
                                                                        i250++;
                                                                        objArr17 = objArr23;
                                                                        length = i291;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    Throwable cause = th.getCause();
                                                                    if (cause != null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                            Object[] objArr32 = {new int[]{i}, new int[]{i ^ (i << 5)}, new int[]{(i & (-2)) | (i20 & 1)}, null};
                                                            int i350 = 1921403994 + (((~(631072770 | i)) | 671382999) * (-366)) + (((~(765296087 | i)) | 537159682) * 366);
                                                            int i351 = (i2 - (~((i350 ^ 16) + ((i350 & 16) << 1)))) - 1;
                                                            int i352 = i351 << 13;
                                                            int i353 = (i351 | i352) & (~(i351 & i352));
                                                            int i354 = i353 >>> 17;
                                                            int i355 = ((~i353) & i354) | ((~i354) & i353);
                                                            return objArr32;
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
            Object[] objArr33 = new Object[4];
            objArr33[0] = new int[1];
            int i356 = b;
            int i357 = (i356 & 11) + (i356 | 11);
            int i358 = i357 % 128;
            g = i358;
            if (i357 % 2 == 0) {
                c = 0;
                objArr33[0] = new int[1];
                objArr33[2] = new int[1];
            } else {
                c = 0;
                objArr33[1] = new int[1];
                objArr33[2] = new int[1];
            }
            ((int[]) objArr33[c])[c] = i;
            ((int[]) objArr33[2])[c] = i;
            objArr33[3] = null;
            int i359 = ~i;
            int i360 = (~(680061116 | i359)) | 40310273;
            int i361 = ~(i | (-45));
            int i362 = -(-(((i360 | i361) * (-252)) + 1608564432 + ((i361 | (~(i359 | 720371389))) * 252)));
            int i363 = ((i2 | i362) << 1) - (i2 ^ i362);
            int i364 = i363 << 13;
            int i365 = (i364 & (~i363)) | ((~i364) & i363);
            int i366 = i365 ^ (i365 >>> 17);
            int i367 = i366 << 5;
            ((int[]) objArr33[1])[0] = ((~i366) & i367) | ((~i367) & i366);
            int i368 = (i358 ^ 19) + ((i358 & 19) << 1);
            b = i368 % 128;
            int i369 = i368 % 2;
            return objArr33;
        }

        static {
            asInterface = 1;
            b();
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -80378407;
            int i = asBinder + 73;
            asInterface = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        static void b() {
            TuitionPaymentFragmentbindingInflater1 = -83722269;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{45563, 5473, 63704, 23556, 9117, 34567, 27239, 12757, 38203, 30881, 56353, 41845, 1746, 59973, 45483, 5393, 63598, 45563, 5473, 63704, 23556, 9117, 34567, 27239, 12757, 38203, 30881, 56354, 41845, 1745, 59969, 11277, 34970, 25912, 49622, 48739, 6909, 63384, 44138, 2255, 58715, 16882, 16016, 39721, 30650, 11336, 34986, 26012, 49689, 48882, 7028, 63469, 44151, 2327, 58789, 16971, 16081, 39761, 28677, 11426, 35125, 26075, 49761, 48926, 45551, 5485, 63691, 23610, 9117, 34576, 27257, 12742, 38201, 30903, 55954, 32380, 37839, 14130, 18579, 45558, 5477, 63706, 23605, 9170, 34583, 27241, 12759, 38185, 30902, 56325, 41824, 1733, 59914, 45487, 5393, 63598, 24560, 8962, 34455, 27161, 12694, 38136, 30813, 57274, 41773, 1679, 60917, 45384, 5313, 63498, 24469, 8959, 34416, 28099, 12582, 38021, 45544, 5483, 63726, 23597, 9096, 34561, 27213, 12742, 38190, 30885, 56341, 28447, 52101, 9766, 33493, 64874, 23009, 46236, 61237, 19451, 42565, 762, 32132, 55345, 13478, 28481, 52211, 9881, 33044, 64941, 32480, 55923, 14284, 37667, 60612, 18433, 42367, 65217, 23103, 47008, 4883, 27766, 51667, 9500, 32441, 55815, 14200, 37094, 60436, 18842, 42335, 65218, 23459, 46945, 4271, 27680, 51598, 8939, 32332, 56283, 14137, 36995, 60926, 18807, 45563, 5473, 63704, 23559, 9097, 34566, 27238, 12753, 38207, 30896, 56372, 41761, 1676, 59924, 45468, 5382, 63605, 24554, 9039, 34493, 27148, 12677, 38112};
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1014702442014173948L;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0020  */
        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$c(short r6, int r7, int r8) {
            /*
                int r6 = r6 + 109
                int r8 = r8 * 4
                int r8 = r8 + 1
                int r7 = r7 + 4
                byte[] r0 = lambdatryToProvidePreviewSurface2androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentbindingInflater1.$$a
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L12
                r3 = r7
                r4 = r2
                goto L29
            L12:
                r3 = r2
            L13:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r8) goto L20
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L20:
                int r7 = r7 + 1
                r4 = r0[r7]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L29:
                int r6 = -r6
                int r6 = r6 + r7
                r7 = r3
                r3 = r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: lambdatryToProvidePreviewSurface2androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentbindingInflater1.$$c(short, int, int):java.lang.String");
        }
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        public static Object b() {
            try {
                return Looper.getMainLooper();
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }
}
