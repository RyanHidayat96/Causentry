package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
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
import com.koushikdutta.async.AsyncServer;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public class SurfaceEdgeExternalSyntheticLambda1 implements executeSafely {
    private static int $10 = 0;
    private static int $11 = 1;
    private lambdaonOutputSurface3androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentbindingInflater1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Exception TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    OutputStream b;
    private AsyncServer d;
    private static final byte[] $$d = {21, ByteCompanionObject.MAX_VALUE, 49, -115, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 59, -6, -10, 13, -20, 14, -12, -7, 11, -72, 63, -7, -14, -1, -1, 11, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -23, 17, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -21, 4, 2, -13, 2, 2, -10, -33, 34, -11, 3, -14, 16, -18, 10, -68};
    private static final int $$e = 161;
    private static final byte[] $$a = {81, -102, -70, -91, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 162;
    private static int asBinder = 0;
    private static int g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f218a = 6106682554124013840L;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = defpackage.SurfaceEdgeExternalSyntheticLambda1.$$a
            int r9 = 53 - r9
            int r7 = r7 * 52
            int r7 = 55 - r7
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r5 = r2
            r8 = r7
            goto L2c
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
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
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-10)
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SurfaceEdgeExternalSyntheticLambda1.c(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 15
            int r8 = r8 + 84
            int r6 = r6 * 11
            int r0 = r6 + 38
            byte[] r1 = defpackage.SurfaceEdgeExternalSyntheticLambda1.$$d
            int r7 = r7 * 48
            int r7 = 51 - r7
            byte[] r0 = new byte[r0]
            int r6 = r6 + 37
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L32
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L32:
            int r3 = r3 + r7
            int r7 = r3 + 3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SurfaceEdgeExternalSyntheticLambda1.f(short, byte, int, java.lang.Object[]):void");
    }

    public SurfaceEdgeExternalSyntheticLambda1(AsyncServer asyncServer) {
        this(asyncServer, (byte) 0);
    }

    @Override // defpackage.executeSafely
    public final void b() {
        int i = 2 % 2;
        int i2 = g + 27;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        try {
            OutputStream outputStream = this.b;
            if (outputStream != null) {
                outputStream.close();
                int i3 = asBinder + 45;
                g = i3 % 128;
                int i4 = i3 % 2;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(null);
        } catch (IOException e2) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
        }
    }

    private SurfaceEdgeExternalSyntheticLambda1(AsyncServer asyncServer, byte b) {
        this.d = asyncServer;
        this.b = null;
    }

    public OutputStream TuitionPaymentFragmentbindingInflater1() throws IOException {
        int i = 2 % 2;
        int i2 = g + 5;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        OutputStream outputStream = this.b;
        int i4 = i3 + 85;
        g = i4 % 128;
        int i5 = i4 % 2;
        return outputStream;
    }

    @Override // defpackage.executeSafely
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AutoValue_Packet autoValue_Packet) {
        int i = 2 % 2;
        while (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
            try {
                try {
                    ByteBuffer byteBufferRemove = autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove();
                    autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 -= byteBufferRemove.remaining();
                    TuitionPaymentFragmentbindingInflater1().write(byteBufferRemove.array(), byteBufferRemove.arrayOffset() + byteBufferRemove.position(), byteBufferRemove.remaining());
                    AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteBufferRemove);
                } catch (IOException e2) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
                    while (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
                        int i2 = g + 47;
                        asBinder = i2 % 128;
                        if (i2 % 2 != 0) {
                            AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove());
                            throw null;
                        }
                        AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove());
                    }
                    autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                    return;
                }
            } catch (Throwable th) {
                while (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
                    AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove());
                    int i3 = g + 59;
                    asBinder = i3 % 128;
                    int i4 = i3 % 2;
                }
                autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                throw th;
            }
        }
        while (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
            int i5 = g + 77;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove());
        }
        autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    }

    @Override // defpackage.executeSafely
    public final void TuitionPaymentFragmentbindingInflater1(lambdaonOutputSurface3androidxcameracoreprocessingDefaultSurfaceProcessor lambdaonoutputsurface3androidxcameracoreprocessingdefaultsurfaceprocessor) {
        int i = 2 % 2;
        int i2 = g + 49;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.TuitionPaymentFragmentbindingInflater1 = lambdaonoutputsurface3androidxcameracoreprocessingdefaultsurfaceprocessor;
        int i5 = i3 + 37;
        g = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // defpackage.executeSafely
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = g + 115;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        throw null;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 53;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getFadingEdgeLength() >> 16)), KeyEvent.keyCodeFromString("") + 2624, 13 - Drawable.resolveOpacity(0, 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (f218a * 9053247990562531611L);
                    try {
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39421 - MotionEvent.axisFromString("")), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 480, 37 - View.MeasureSpec.getSize(0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
            } else {
                int i5 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19472 - (ViewConfiguration.getTapTimeout() >> 16)), 2624 - View.getDefaultSize(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (f218a ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39421 - TextUtils.indexOf((CharSequence) "", '0')), Process.getGidForName("") + 482, 37 - Color.alpha(0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i6 = $10 + 65;
        $11 = i6 % 128;
        while (true) {
            int i7 = i6 % 2;
            if (getrealtimecapturelatency.b >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 39421), 482 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 37 - (ViewConfiguration.getEdgeSlop() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            i6 = $11 + 35;
            $10 = i6 % 128;
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Exception exc) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 121;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 99 / 0;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                return;
            }
        } else if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = exc;
        lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor != null) {
            int i5 = i2 + 107;
            g = i5 % 128;
            int i6 = i5 % 2;
            lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor.b(exc);
            if (i6 == 0) {
                throw null;
            }
        }
    }

    @Override // defpackage.executeSafely
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 123;
        g = i3 % 128;
        int i4 = i3 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor;
        int i5 = i2 + 71;
        g = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // defpackage.executeSafely
    public final AsyncServer TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (31533 - TextUtils.indexOf("", "", 0));
            int iRgb = Color.rgb(0, 0, 0) + 16778137;
            int scrollDefaultDelay = 28 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            c(b, b, (byte) 52, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iRgb, scrollDefaultDelay, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{47210, 52436, 20749, 58986, 27296, 65303, 1097, 35058, 7660, 41537, 14031, 48067, 49214, 21637, 55761, 28209, 62326, 1929, 35861, 4423, 42428, 10981}, TextUtils.indexOf((CharSequence) "", '0', 0) + 29874, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{47214, 64624, 12356, 29758, 43044, 60445, 8421, 25848, 39126, 56485, 4225, 21634, 35190, 52557, 300}, TextUtils.lastIndexOf("", '0', 0) + 17432, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (31534 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int iBlue = Color.blue(0) + 921;
            int iLastIndexOf = 27 - TextUtils.lastIndexOf("", '0', 0);
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            byte b3 = bArr[80];
            Object[] objArr5 = new Object[1];
            c(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iBlue, iLastIndexOf, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (31533 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                int i2 = 922 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int mode = 28 - View.MeasureSpec.getMode(0);
                byte[] bArr2 = $$a;
                byte b4 = bArr2[80];
                Object[] objArr6 = new Object[1];
                c(b4, b4, (byte) (-bArr2[33]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, i2, mode, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = ((((-1015125973) + (((~((-272666305) | (~iIdentityHashCode))) | (~(1501413339 | iIdentityHashCode))) * (-272))) + (((~((-423993299) | iIdentityHashCode)) | 151326994) * (-272))) + (((~(iIdentityHashCode | 423993298)) | 1350086345) * 272)) - 803177409;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[0])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{47210, 2678, 56393, 44608, 28712, 49725, 37917, 26272, 10482, 64208, 19653, 7924, 57518, 45727, 1397, 55167, 39245, 27425, 15657, 36635, 20771, 9196, 62939, 18395, 2466, 56244}, 45586 - TextUtils.lastIndexOf("", '0', 0, 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{47208, 60415, 8059, 17146, 63082, 6624, 19833, 61645, 9331, 22514, 64365, 12009, 21092, 34279, 10609, 23789, 32884, 13300}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 21377, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{47201, 64373, 15939, 28983, 46169, 63484, 10960, 28092, 41108, 58418, 10094, 23079, 40204, 53484, 5084, 22199}, 17184 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{47202, 12556, 43688, 9292, 40435, 5773, 32813, 31175, 62299, 27665, 58790, 24354, 51436, 16995, 15109, 46243}, 35171 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -803177409};
                byte[] bArr3 = $$d;
                byte b5 = (byte) (-bArr3[35]);
                byte b6 = b5;
                Object[] objArr13 = new Object[1];
                f(b5, b6, b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = (byte) (bArr3[35] + 1);
                byte b8 = b7;
                Object[] objArr14 = new Object[1];
                f(b7, b8, b8, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf2 = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 921;
                    int absoluteGravity = 28 - Gravity.getAbsoluteGravity(0, 0);
                    byte[] bArr4 = $$a;
                    byte b9 = bArr4[80];
                    Object[] objArr16 = new Object[1];
                    c(b9, b9, (byte) (-bArr4[33]), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, longPressTimeout, absoluteGravity, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    e(new char[]{47210, 52436, 20749, 58986, 27296, 65303, 1097, 35058, 7660, 41537, 14031, 48067, 49214, 21637, 55761, 28209, 62326, 1929, 35861, 4423, 42428, 10981}, Color.rgb(0, 0, 0) + 16807089, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(new char[]{47214, 64624, 12356, 29758, 43044, 60445, 8421, 25848, 39126, 56485, 4225, 21634, 35190, 52557, 300}, 17430 - ImageFormat.getBitsPerPixel(0), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 31534);
                        int i6 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 921;
                        int mirror = 'L' - AndroidCharacter.getMirror('0');
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[7];
                        byte b11 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        c(b10, b11, b11, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionChild, i6, mirror, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cGreen = (char) (Color.green(0) + 31533);
                        int i7 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 920;
                        int i8 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                        byte b12 = $$a[7];
                        Object[] objArr20 = new Object[1];
                        c(b12, b12, (byte) 52, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cGreen, i7, i8, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        }
        int i9 = ((int[]) objArr[1])[0];
        int i10 = ((int[]) objArr[3])[0];
        if (i10 != i9) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
            int i11 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i12 = 1675501147 + (((~(177103124 | iIdentityHashCode2)) | 1596976519) * 672);
            int i13 = ~iIdentityHashCode2;
            int i14 = i11 + i12 + (((~(iIdentityHashCode2 | 1596976519)) | (~((-177103125) | i13))) * (-672)) + (((~((-1596976520) | i13)) | 1428262019) * 672);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr21[0])[0] = i16 ^ (i16 << 5);
        } else {
            int i17 = g + 3;
            asBinder = i17 % 128;
            int i18 = i17 % 2;
            int i19 = ((int[]) objArr[0])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i20 = i19 + ((((-1988926623) + (((-268587713) | (~iFreeMemory)) * (-490))) + (((~(iFreeMemory | (-1368585171))) | 1099997458) * 490)) - 1123796644);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr22[0])[0] = i22 ^ (i22 << 5);
        }
        AsyncServer asyncServer = this.d;
        int i23 = asBinder + 103;
        g = i23 % 128;
        if (i23 % 2 == 0) {
            int i24 = 29 / 0;
        }
        return asyncServer;
    }
}
