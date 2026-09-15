package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.ParcelFileDescriptor;
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
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.google.android.libraries.places.internal.zzpu;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.collections.AbstractMap$values$1$iterator$1;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class getCameraOpenRetryMaxTimeoutInMillisWhileResuming<Data> implements getSchedulerHandler<File, Data> {
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault3<Data> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault3<Data> {
        void TuitionPaymentFragmentbindingInflater1(Data data) throws IOException;

        Class<Data> TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        Data TuitionPaymentFragmentspecialinlinedviewModeldefault1(File file) throws FileNotFoundException;
    }

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ getSchedulerHandler.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1(File file, int i, int i2, getTargetRotation gettargetrotation) {
        File file2 = file;
        return new getSchedulerHandler.TuitionPaymentFragmentbindingInflater1(new setResolutionSelector(file2), new TuitionPaymentFragmentspecialinlinedviewModeldefault1(file2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
    }

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(File file) {
        return true;
    }

    public getCameraOpenRetryMaxTimeoutInMillisWhileResuming(TuitionPaymentFragmentspecialinlinedviewModeldefault3<Data> tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<Data> implements isUseCasesCombinationSupportedByFramework<Data> {
        private static int $10 = 0;
        private static int $11 = 1;
        private Data TuitionPaymentFragmentbindingInflater1;
        private final TuitionPaymentFragmentspecialinlinedviewModeldefault3<Data> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final File b;
        private static final byte[] $$a = {104, 27, -72, 120, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
        private static final int $$b = 102;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int g = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 6545055904126891488L;

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r5, short r6, byte r7, java.lang.Object[] r8) {
            /*
                int r6 = 92 - r6
                int r7 = r7 * 15
                int r0 = 53 - r7
                int r5 = r5 * 4
                int r5 = 84 - r5
                byte[] r1 = getCameraOpenRetryMaxTimeoutInMillisWhileResuming.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$a
                byte[] r0 = new byte[r0]
                int r7 = 52 - r7
                r2 = 0
                if (r1 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L2a
            L16:
                r3 = r2
            L17:
                int r6 = r6 + 1
                byte r4 = (byte) r5
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L28
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L28:
                r3 = r1[r6]
            L2a:
                int r3 = -r3
                int r5 = r5 + r3
                int r5 = r5 + (-11)
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: getCameraOpenRetryMaxTimeoutInMillisWhileResuming.TuitionPaymentFragmentspecialinlinedviewModeldefault1.a(int, short, byte, java.lang.Object[]):void");
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(File file, TuitionPaymentFragmentspecialinlinedviewModeldefault3<Data> tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.b = file;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
            getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i3 = $11 + 55;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2623, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 9053247990562531611L);
                    try {
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - Color.alpha(0)), 481 - (ViewConfiguration.getWindowTouchSlop() >> 8), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
            char[] cArr2 = new char[length];
            getrealtimecapturelatency.b = 0;
            int i6 = $10 + 79;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i8 = $10 + 39;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    try {
                        Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (MotionEvent.axisFromString("") + 39423), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 480, 37 - Color.alpha(0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        int i9 = 91 / 0;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - View.MeasureSpec.getSize(0)), 481 - View.getDefaultSize(0, 0), 36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr2);
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [Data, java.lang.Object] */
        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Priority priority, isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1<? super Data> tuitionPaymentFragmentspecialinlinedviewModeldefault1) throws Throwable {
            Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
            g = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cBlue = (char) (29944 - Color.blue(0));
                int i4 = 1756 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                byte[] bArr = $$a;
                byte b = bArr[7];
                Object[] objArr = new Object[1];
                a(b, (byte) (b | 89), bArr[5], objArr);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, i4, iLastIndexOf, 986134021, false, (String) objArr[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr2 = new Object[1];
            c(new char[]{56474, 58746, 44865, 28996, 15144, 64825, 34565, 18780, 5100, 54767, 40835, 41453, 27574, 11691, 63389, 47519, 16998, 1127, 52825, 36905, 23092, 7179}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14831, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            c(new char[]{56478, 18360, 60100, 3334, 45108, 56181, 32645, 58080, 1510, 43069, 54081, 30602, 39590, 15861, 40972}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 39727, objArr3);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                int i5 = 1754 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int modifierMetaStateMask = 22 - ((byte) KeyEvent.getModifierMetaStateMask());
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr4 = new Object[1];
                a(b3, (byte) (b3 | 52), b2, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, i5, modifierMetaStateMask, 1596667560, false, (String) objArr4[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char bitsPerPixel = (char) (29943 - ImageFormat.getBitsPerPixel(0));
                    int iResolveSizeAndState = 1755 - View.resolveSizeAndState(0, 0, 0);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 24;
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr5 = new Object[1];
                    a(b4, b5, b5, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel, iResolveSizeAndState, iIndexOf, 1599039318, false, (String) objArr5[0], null);
                }
                Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i6 = ~iIdentityHashCode;
                int i7 = (((181212960 + (((~((-36508490) | i6)) | (~(176159737 | iIdentityHashCode))) * (-831))) + ((~((-65802) | iIdentityHashCode)) * (-1662))) + (((~(iIdentityHashCode | 36508489)) | ((~(i6 | (-176093937))) | (~(176093936 | iIdentityHashCode)))) * 831)) - 1559868521;
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i9 ^ (i9 << 5);
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
                g = i10 % 128;
                int i11 = i10 % 2;
            } else {
                Object[] objArr7 = new Object[1];
                c(new char[]{56465, 24107, 55791, 21641, 54801, 20962, 52412, 20034, 51476, 17644, 50754, 16665, 64708, 32370, 63792, 29897}, 33457 - Drawable.resolveOpacity(0, 0), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c(new char[]{56466, 13014, '\f', 5710, 26027, 31743, 18745, 24445, 44795, 48139, 37458, 57776, 63444, 50465, 56161, 10969}, 61001 - KeyEvent.getDeadChar(0, 0), objArr8);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr9 = {639186134};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - (ViewConfiguration.getTouchSlop() >> 8)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1725, Color.blue(0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = zzpu.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), -1559868521, false, true);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char deadChar = (char) (29944 - KeyEvent.getDeadChar(0, 0));
                        int packedPositionChild = 1754 - ExpandableListView.getPackedPositionChild(0L);
                        int i12 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22;
                        byte b6 = $$a[7];
                        byte b7 = b6;
                        Object[] objArr10 = new Object[1];
                        a(b6, b7, b7, objArr10);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(deadChar, packedPositionChild, i12, 1599039318, false, (String) objArr10[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                    try {
                        Object[] objArr11 = new Object[1];
                        c(new char[]{56474, 58746, 44865, 28996, 15144, 64825, 34565, 18780, 5100, 54767, 40835, 41453, 27574, 11691, 63389, 47519, 16998, 1127, 52825, 36905, 23092, 7179}, 14831 - TextUtils.indexOf("", "", 0, 0), objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        c(new char[]{56478, 18360, 60100, 3334, 45108, 56181, 32645, 58080, 1510, 43069, 54081, 30602, 39590, 15861, 40972}, 39726 - TextUtils.lastIndexOf("", '0', 0, 0), objArr12);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char gidForName = (char) (29943 - Process.getGidForName(""));
                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1755;
                            int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 23;
                            byte b8 = $$a[7];
                            byte b9 = b8;
                            Object[] objArr13 = new Object[1];
                            a(b9, (byte) (b9 | 52), b8, objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(gidForName, fadingEdgeLength, iResolveSizeAndState2, 1596667560, false, (String) objArr13[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char cBlue2 = (char) (Color.blue(0) + 29944);
                            int iMyTid = (Process.myTid() >> 22) + 1755;
                            int longPressTimeout = 23 - (ViewConfiguration.getLongPressTimeout() >> 16);
                            byte[] bArr2 = $$a;
                            byte b10 = bArr2[7];
                            Object[] objArr14 = new Object[1];
                            a(b10, (byte) (b10 | 89), bArr2[5], objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cBlue2, iMyTid, longPressTimeout, 986134021, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
                        g = i13 % 128;
                        int i14 = i13 % 2;
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
            int i15 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
            int i16 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
            if (i16 == i15) {
                int i17 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
                Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i18 = ~iIdentityHashCode2;
                int i19 = i17 + (-2125613623) + (((~(i18 | 335191459)) | (~(122589033 | i18)) | (-402563052)) * 464) + (((-279974019) | iIdentityHashCode2) * (-464)) + (((~(iIdentityHashCode2 | 335191459)) | (-402563052)) * 464);
                int i20 = (i19 << 13) ^ i19;
                int i21 = i20 ^ (i20 >>> 17);
                ((int[]) objArr15[3])[0] = i21 ^ (i21 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
                if (strArr != null) {
                    int i22 = g + 55;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22 % 128;
                    if (i22 % 2 != 0) {
                        int i23 = 4 / 2;
                    }
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
                int i24 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
                Object[] objArr16 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i25 = i24 + ((~(iMaxMemory | (-660645881))) * TypedValues.CycleType.TYPE_EASING) + 508442641 + (((~((~iMaxMemory) | (-660645881))) | 269225986) * TypedValues.CycleType.TYPE_EASING);
                int i26 = (i25 << 13) ^ i25;
                int i27 = i26 ^ (i26 >>> 17);
                ((int[]) objArr16[3])[0] = i27 ^ (i27 << 5);
            }
            try {
                Data dataTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
                this.TuitionPaymentFragmentbindingInflater1 = dataTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(dataTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            } catch (FileNotFoundException e2) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
            }
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void b() {
            int i = 2 % 2;
            Data data = this.TuitionPaymentFragmentbindingInflater1;
            if (data != null) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
                g = i2 % 128;
                int i3 = i2 % 2;
                try {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(data);
                } catch (IOException unused) {
                    return;
                }
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 19 / 0;
            }
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final Class<Data> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            int i = 2 % 2;
            int i2 = g + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Class<Data> clsTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
            g = i3 % 128;
            int i4 = i3 % 2;
            return clsTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final DataSource TuitionPaymentFragmentbindingInflater1() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
            g = i2 % 128;
            int i3 = i2 % 2;
            DataSource dataSource = DataSource.LOCAL;
            int i4 = g + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return dataSource;
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
            g = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static class b<Data> implements getDeviceSurfaceManagerProvider<File, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static short[] f917a;
        private final TuitionPaymentFragmentspecialinlinedviewModeldefault3<Data> b;
        private static final byte[] $$c = {119, -103, 14, -22};
        private static final int $$d = 246;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {113, 29, -123, -97};
        private static final int $$b = 139;
        private static int d = 0;
        private static int asBinder = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1094658914;
        private static int TuitionPaymentFragmentbindingInflater1 = -1934795609;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1780841274;
        private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {52, 27, 9, -23, 26, 19, 24, 27, -52, 41, -19, 26, 24, 22, -9, 29, -7, 41, -18, 55, -28, 21, 19, 1, -18, 20, -16, 33, 30, -8, 50, 8, 28, 12, -26, 27, 57, 41, 43, 8, 62, 26, 23, 112, 57, -6, 67, 48, 51, 62, 15, 55, 14, 1, -68, -87, -87, -38, -83, -124, -34, -75, -80, -90, -85, -84, -71, 103, -13, -96, -76, -75, -87, -38, -83, 116, -13, -39, -122, -84, -88, 100, -10, -78, -94, -81, -68, -95, 111, -17, -95, -75, 119, 36, -11, -11, 56, 62, 52, 5, 60, 42, 4, 57, 53, Base64.padSymbol, Base64.padSymbol, 46, 49, 1, -10, 122, 6, 54, 51, 0, 53, -13, 115, 53, 57, -5, 67, 43, 48, Base64.padSymbol, -4, 38, 5, -66, -113, -73, -76, -72, -71, -67, -82, -79, 120, -57, -76, -72, -71, -67, -82, -79, 120, -57, -83, -118, -80, -68, 104, -6, -122, -74, -77, ByteCompanionObject.MIN_VALUE, -75, 115, -13, -75, -71, 123};

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(byte r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 4
                int r0 = r6 + 1
                byte[] r1 = getCameraOpenRetryMaxTimeoutInMillisWhileResuming.b.$$a
                int r8 = r8 * 2
                int r8 = 4 - r8
                int r7 = r7 * 4
                int r7 = r7 + 98
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L17
                r7 = r6
                r3 = r8
                r4 = r2
                goto L2d
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L25:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2d:
                int r7 = r7 + r8
                int r8 = r3 + 1
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: getCameraOpenRetryMaxTimeoutInMillisWhileResuming.b.e(byte, int, int, java.lang.Object[]):void");
        }

        public b(TuitionPaymentFragmentspecialinlinedviewModeldefault3<Data> tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.b = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<File, Data> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
            int i = 2 % 2;
            getCameraOpenRetryMaxTimeoutInMillisWhileResuming getcameraopenretrymaxtimeoutinmilliswhileresuming = new getCameraOpenRetryMaxTimeoutInMillisWhileResuming(this.b);
            int i2 = asBinder + 19;
            d = i2 % 128;
            int i3 = i2 % 2;
            return getcameraopenretrymaxtimeoutinmilliswhileresuming;
        }

        private static void c(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.myPid() >> 22), 2268 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 'Q' - AndroidCharacter.getMirror('0'), 1387473586, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                Object obj = null;
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i6 = $10 + 49;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (i4 != 0) {
                    int i8 = $10 + 17;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        for (int i9 = 0; i9 < length; i9++) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cGreen = (char) Color.green(0);
                                int iMyPid = (Process.myPid() >> 22) + 3358;
                                int i10 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18;
                                byte length2 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cGreen, iMyPid, i10, -1054011043, false, $$e((byte) 0, length2, (byte) (length2 - 5)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i11 = $10 + 43;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2267, ExpandableListView.getPackedPositionType(0L) + 33, 1387473586, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                    } else {
                        iIntValue = (short) (((short) (((long) f917a[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                    }
                }
                if (iIntValue > 0) {
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)) + i4;
                    try {
                        Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), sb};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 55904), 2855 - ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.makeMeasureSpec(0, 0) + 13, -1529949196, false, $$e(b6, b7, (byte) (-b7)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (bArr4 != null) {
                            int i13 = $11 + 111;
                            $10 = i13 % 128;
                            int i14 = i13 % 2;
                            int length3 = bArr4.length;
                            byte[] bArr5 = new byte[length3];
                            for (int i15 = 0; i15 < length3; i15++) {
                                bArr5[i15] = (byte) (((long) bArr4[i15]) ^ 3046761265686732006L);
                            }
                            bArr4 = bArr5;
                        }
                        boolean z = bArr4 != null;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                        while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                            int i16 = $10 + 53;
                            $11 = i16 % 128;
                            if (i16 % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            if (z) {
                                byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i17]) ^ 3046761265686732006L)) + s)) ^ b));
                            } else {
                                short[] sArr = f917a;
                                int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i18]) ^ 3046761265686732006L)) + s)) ^ b));
                            }
                            sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0b67  */
        /* JADX WARN: Code duplicated, block: B:99:0x0b48  */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2) throws Throwable {
            int i3;
            String str;
            char c;
            Object[] objArr;
            Object obj;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            Object[] objArr2;
            int i9;
            int i10;
            String[] strArr;
            int i11;
            int i12;
            int i13;
            int iTuitionPaymentFragmentbindingInflater1;
            int i14;
            int i15;
            int i16;
            int i17;
            boolean zEquals;
            String line;
            char c2;
            int mirror;
            int i18;
            int i19 = 2 % 2;
            try {
                String[] strArr2 = new String[2];
                int i20 = -Color.green(0);
                int i21 = (i20 ^ 427284621) + ((i20 & 427284621) << 1);
                int i22 = -TextUtils.getCapsMode("", 0, 0);
                int i23 = i22 * 70;
                int i24 = (i23 & 4488) + (i23 | 4488);
                int i25 = ~i22;
                int i26 = i25 | 65;
                int i27 = asBinder;
                int i28 = (i27 ^ 121) + ((i27 & 121) << 1);
                d = i28 % 128;
                int i29 = i28 % 2;
                int i30 = (i22 ^ (-66)) | (i22 & (-66));
                int i31 = (i24 - (~(-(-(((~((i26 ^ i) | (i26 & i))) | (~((i30 ^ i) | (i30 & i)))) * 69))))) - 1;
                int i32 = ~(i25 | (-66));
                int i33 = ~((i25 ^ i) | (i25 & i));
                int i34 = i31 + (((i32 & i33) | (i32 ^ i33) | (~(((-66) ^ i) | ((-66) & i)))) * (-69)) + ((~((65 ^ i22) | (65 & i22))) * 69);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                int i35 = ~i;
                AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
                int i36 = -iMakeMeasureSpec;
                short s = (short) ((2 ^ i36) + ((i36 & 2) << 1));
                byte edgeSlop = (byte) (ViewConfiguration.getEdgeSlop() >> 16);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0);
                int i37 = (iIndexOf * (-947)) + 267722461;
                int i38 = ~iIndexOf;
                int i39 = ~((846039158 ^ i) | (846039158 & i));
                int i40 = -(-(((i38 ^ i39) | (i38 & i39)) * (-948)));
                int i41 = (i37 ^ i40) + ((i40 & i37) << 1);
                int i42 = ~iIndexOf;
                int i43 = (i42 ^ 846039158) | (i42 & 846039158);
                int i44 = (i41 - (~(-(-((~((i43 ^ i35) | (i43 & i35))) * (-948)))))) - 1;
                int i45 = (iIndexOf | 846039158) * 948;
                int i46 = (i44 & i45) + (i45 | i44);
                Object[] objArr3 = new Object[1];
                c(i21, i34, s, edgeSlop, i46, objArr3);
                strArr2[0] = (String) objArr3[0];
                int i47 = -TextUtils.lastIndexOf("", '0');
                int iTuitionPaymentFragmentbindingInflater2 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
                int i48 = i47 * 491;
                int i49 = (i48 & 1511211478) + (i48 | 1511211478);
                int i50 = ~i47;
                int i51 = ((-427284635) & i50) | (i50 ^ (-427284635));
                int i52 = ~iTuitionPaymentFragmentbindingInflater2;
                int i53 = (-490) * ((i51 ^ i52) | (i51 & i52));
                int i54 = (i49 & i53) + (i49 | i53);
                int i55 = ~((i47 & (-427284635)) | ((-427284635) ^ i47));
                int i56 = ~((iTuitionPaymentFragmentbindingInflater2 & (-427284635)) | ((-427284635) ^ iTuitionPaymentFragmentbindingInflater2));
                int i57 = ((i55 & i56) | (i55 ^ i56)) * 490;
                int i58 = ((i54 | i57) << 1) - (i57 ^ i54);
                int i59 = -(-(i50 * 490));
                int i60 = (i58 ^ i59) + ((i59 & i58) << 1);
                int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                int i61 = asBinder + 69;
                d = i61 % 128;
                int i62 = i61 % 2;
                int i63 = maximumFlingVelocity * 306;
                int i64 = ((i63 ^ TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) + ((i63 & TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) << 1)) - 20196;
                int i65 = ~((maximumFlingVelocity ^ (-66)) | (maximumFlingVelocity & (-66)));
                int i66 = ~((maximumFlingVelocity ^ i) | (maximumFlingVelocity & i));
                int i67 = -(-(((i65 & i66) | (i65 ^ i66)) * 305));
                int i68 = ((i64 | i67) << 1) - (i67 ^ i64);
                int i69 = ~((maximumFlingVelocity & i35) | (i35 ^ maximumFlingVelocity));
                int i70 = ((i69 & 65) | (65 ^ i69)) * 305;
                int i71 = (i68 & i70) + (i70 | i68);
                int i72 = -(ViewConfiguration.getScrollBarSize() >> 8);
                short s2 = (short) ((i72 ^ 11) + ((i72 & 11) << 1));
                int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity();
                int i73 = d + 19;
                asBinder = i73 % 128;
                int i74 = i73 % 2;
                byte b = (byte) (minimumFlingVelocity >> 16);
                int iIndexOf2 = TextUtils.indexOf("", "", 0, 0);
                int i75 = ~(846039140 | i35);
                int i76 = ~((~iIndexOf2) | i);
                int i77 = ((iIndexOf2 * 371) - 347908703) + (((i75 ^ i76) | (i76 & i75)) * (-370));
                int i78 = ~iIndexOf2;
                int i79 = ~((i78 & i35) | (i78 ^ i35));
                int i80 = ~(846039140 | i);
                int i81 = (i79 & i80) | (i79 ^ i80);
                int i82 = ~(iIndexOf2 | (-846039141));
                int i83 = -(-(((i81 ^ i82) | (i81 & i82)) * (-370)));
                int i84 = (i77 ^ i83) + ((i83 & i77) << 1);
                int i85 = (~((iIndexOf2 & (-846039141)) | (iIndexOf2 ^ (-846039141)))) * 370;
                int i86 = ((i84 | i85) << 1) - (i85 ^ i84);
                Object[] objArr4 = new Object[1];
                c(i60, i71, s2, b, i86, objArr4);
                strArr2[1] = (String) objArr4[0];
                int i87 = 0;
                while (true) {
                    if (i87 >= 2) {
                        int i88 = asBinder;
                        int i89 = (i88 ^ 55) + ((i88 & 55) << 1);
                        d = i89 % 128;
                        int i90 = i89 % 2;
                        i3 = i;
                        break;
                    }
                    int i91 = asBinder;
                    int i92 = (i91 ^ 63) + ((i91 & 63) << 1);
                    d = i92 % 128;
                    int i93 = i92 % 2;
                    String str2 = strArr2[i87];
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
                    int i94 = absoluteGravity * (-244);
                    int i95 = ((i94 | 2032799694) << 1) - (i94 ^ 2032799694);
                    int i96 = ((~(((-427284614) & absoluteGravity) | ((-427284614) ^ absoluteGravity))) | (~((-427284614) | i35))) * (-245);
                    int i97 = (i95 & i96) + (i96 | i95) + ((~(((-427284614) & i) | ((-427284614) ^ i))) * (-245));
                    int i98 = ~(((-427284614) & i) | ((-427284614) ^ i));
                    int i99 = i97 + (((absoluteGravity & i98) | (absoluteGravity ^ i98)) * 245);
                    int i100 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int iTuitionPaymentFragmentbindingInflater3 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
                    int i101 = (i100 * (-445)) + 28925;
                    int i102 = ~i100;
                    int i103 = ~(i102 | 64);
                    int i104 = ~iTuitionPaymentFragmentbindingInflater3;
                    int i105 = ((~((64 ^ i104) | (64 & i104))) | i103) * 446;
                    int i106 = (i101 ^ i105) + ((i101 & i105) << 1);
                    int i107 = ~i100;
                    int i108 = i106 + (((~((64 ^ i100) | (i100 & 64) | iTuitionPaymentFragmentbindingInflater3)) | (~((i107 & (-65)) | (i107 ^ (-65))))) * 446);
                    int i109 = -(-((~((i102 ^ 64) | (i102 & 64))) * 446));
                    int i110 = (i108 ^ i109) + ((i109 & i108) << 1);
                    int longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
                    int iTuitionPaymentFragmentbindingInflater4 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
                    int i111 = (longPressTimeout * (-419)) + 15577 + ((~((iTuitionPaymentFragmentbindingInflater4 ^ 37) | (iTuitionPaymentFragmentbindingInflater4 & 37))) * TypedValues.CycleType.TYPE_EASING);
                    int i112 = ~longPressTimeout;
                    int i113 = i111 + (((i112 & 37) | (i112 ^ 37)) * (-420));
                    int i114 = ~((~longPressTimeout) | (-38));
                    int i115 = ~iTuitionPaymentFragmentbindingInflater4;
                    int i116 = ~((i115 & 37) | (i115 ^ 37));
                    int i117 = -(-(((i114 & i116) | (i114 ^ i116)) * TypedValues.CycleType.TYPE_EASING));
                    short s3 = (short) (((i113 | i117) << 1) - (i117 ^ i113));
                    byte bMyPid = (byte) (Process.myPid() >> 22);
                    int i118 = -(-View.resolveSizeAndState(0, 0, 0));
                    int i119 = (i118 & (-846039123)) + (i118 | (-846039123));
                    Object[] objArr5 = new Object[1];
                    c(i99, i110, s3, bMyPid, i119, objArr5);
                    Class<?> cls = Class.forName((String) objArr5[0]);
                    if (((Boolean) cls.getMethod(str2, new Class[0]).invoke(cls, null)).booleanValue()) {
                        i3 = (i & (-2)) | (i35 & 1);
                        break;
                    }
                    int i120 = ((i87 | (-52)) << 1) - (i87 ^ (-52));
                    i87 = (i120 ^ 53) + ((i120 & 53) << 1);
                }
            } catch (Exception unused) {
                i3 = (~(i & 2)) & (i | 2);
            }
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cRgb = (char) ((-16774797) - Color.rgb(0, 0, 0));
                    int iIndexOf3 = 2845 - TextUtils.indexOf("", "", 0, 0);
                    int iBlue = 5 - Color.blue(0);
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    Object[] objArr6 = new Object[1];
                    e(b2, b3, b3, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, iIndexOf3, iBlue, -501222268, false, (String) objArr6[0], new Class[0]);
                }
                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                long j = 511911218;
                long j2 = 130;
                long j3 = -1;
                long j4 = jLongValue ^ j3;
                long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                long j5 = (((long) (-129)) * j) + (((long) 131) * jLongValue) + ((((j4 | (startElapsedRealtime ^ j3)) | j) ^ j3) * j2);
                int i121 = i3;
                long j6 = j4 | j;
                long j7 = j5 + (((long) (-260)) * (j6 ^ j3)) + (j2 * ((((j ^ j3) | jLongValue) ^ j3) | ((j6 | startElapsedRealtime) ^ j3))) + ((long) (-1671097904));
                int i122 = ~i;
                int i123 = ((int) (j7 >> 32)) & ((((~((-382565731) | i122)) | 75042 | (~(1054660680 | i122))) * (-397)) + 873711938 + ((672245034 | i) * 397));
                int i124 = ~((-1502662539) | i122);
                int i125 = ((int) j7) & (((4460609 | i124 | (~(1502662538 | i))) * (-338)) + 70459431 + ((i124 | (~(1507123147 | i))) * 338));
                int i126 = (i123 & i125) | (i123 ^ i125);
                int i127 = (i126 | 1) & (~(i126 & 1));
                int i128 = -i127;
                int i129 = ((i127 & i128) | (i127 ^ i128)) >> 31;
                int i130 = ((i & (-11)) | (i122 & 10)) & (~i129);
                int i131 = i129 & i;
                int i132 = (i131 & i130) | (i130 ^ i131);
                int i133 = ((~i121) & i) | (i121 & i122);
                int i134 = (i133 | (-i133)) >> 31;
                int i135 = i132 & (~i134);
                int i136 = i134 & i121;
                int i137 = (i135 ^ i136) | (i135 & i136);
                try {
                    int i138 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int iTuitionPaymentFragmentbindingInflater5 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
                    int i139 = i138 * (-167);
                    int i140 = ((i139 | 1657922178) << 1) - (i139 ^ 1657922178);
                    int i141 = ~i138;
                    int i142 = ~((i141 ^ (-427284563)) | (i141 & (-427284563)));
                    int i143 = ~iTuitionPaymentFragmentbindingInflater5;
                    int i144 = -(-((i142 | (~(((-427284563) ^ i143) | ((-427284563) & i143)))) * 168));
                    int i145 = (i140 & i144) + (i140 | i144);
                    int i146 = ((-427284563) & i141) | (i141 ^ (-427284563));
                    int i147 = (~((i146 & iTuitionPaymentFragmentbindingInflater5) | (i146 ^ iTuitionPaymentFragmentbindingInflater5))) * 168;
                    int i148 = (~((i141 & 427284562) | (i141 ^ 427284562))) | (~((i141 ^ i143) | (i143 & i141)));
                    int i149 = (i138 & (-427284563)) | ((-427284563) ^ i138);
                    int i150 = ~((i149 & iTuitionPaymentFragmentbindingInflater5) | (i149 ^ iTuitionPaymentFragmentbindingInflater5));
                    int i151 = (i145 & i147) + (i147 | i145) + (((i150 & i148) | (i148 ^ i150)) * 168);
                    int i152 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                    int iTuitionPaymentFragmentbindingInflater6 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
                    int i153 = i152 * (-1335);
                    int i154 = (i153 & 44689) + (i153 | 44689);
                    int i155 = (i152 ^ iTuitionPaymentFragmentbindingInflater6) | (i152 & iTuitionPaymentFragmentbindingInflater6);
                    int i156 = ~i155;
                    int i157 = (i154 - (~(((i156 & 66) | (66 ^ i156)) * (-668)))) - 1;
                    int i158 = (i152 | (~((iTuitionPaymentFragmentbindingInflater6 & 66) | (66 ^ iTuitionPaymentFragmentbindingInflater6)))) * 1336;
                    int i159 = (((i157 | i158) << 1) - (i158 ^ i157)) + (((i155 ^ 66) | (i155 & 66)) * 668);
                    int i160 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int iTuitionPaymentFragmentbindingInflater7 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
                    int i161 = (((i160 * (-947)) - 74022) - (~(-(-(((~i160) | (~((77 ^ iTuitionPaymentFragmentbindingInflater7) | (77 & iTuitionPaymentFragmentbindingInflater7)))) * (-948)))))) - 1;
                    int i162 = ~i160;
                    int i163 = (i162 & 77) | (i162 ^ 77);
                    int i164 = ~iTuitionPaymentFragmentbindingInflater7;
                    int i165 = -(-((~((i164 & i163) | (i163 ^ i164))) * (-948)));
                    int i166 = (i161 & i165) + (i165 | i161);
                    int i167 = -(-(((i160 & 77) | (i160 ^ 77)) * 948));
                    byte bResolveSize = (byte) View.resolveSize(0, 0);
                    int i168 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i169 = (i168 ^ (-846039107)) + ((i168 & (-846039107)) << 1);
                    Object[] objArr7 = new Object[1];
                    c(i151, i159, (short) ((i166 & i167) + (i167 | i166)), bResolveSize, i169, objArr7);
                    File file = new File((String) objArr7[0]);
                    if (file.canRead()) {
                        FileReader fileReader = new FileReader(file);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        int i170 = asBinder + 109;
                        d = i170 % 128;
                        try {
                            if (i170 % 2 != 0) {
                                line = bufferedReader.readLine();
                                i18 = 111;
                                mirror = 55394 >> AndroidCharacter.getMirror('g');
                                c2 = '0';
                            } else {
                                line = bufferedReader.readLine();
                                c2 = '0';
                                mirror = AndroidCharacter.getMirror('0') + 55394;
                                i18 = -65;
                            }
                            int iLastIndexOf = TextUtils.lastIndexOf("", c2);
                            int i171 = (iLastIndexOf * 960) + (i18 * (-1917));
                            int i172 = ~i18;
                            int i173 = ~i;
                            int i174 = ~((i173 & i172) | (i172 ^ i173));
                            int i175 = ~((iLastIndexOf ^ i) | (iLastIndexOf & i));
                            int i176 = i171 + (((i174 ^ i175) | (i174 & i175)) * 959);
                            int i177 = d + 31;
                            asBinder = i177 % 128;
                            int i178 = i177 % 2;
                            int i179 = (-959) * i172;
                            int i180 = (i176 & i179) + (i176 | i179);
                            int i181 = ~((i172 ^ i) | (i172 & i));
                            int i182 = ~((i122 ^ iLastIndexOf) | (iLastIndexOf & i122));
                            int i183 = ((i181 & i182) | (i181 ^ i182)) * 959;
                            Object[] objArr8 = new Object[1];
                            c(mirror, ((i180 | i183) << 1) - (i183 ^ i180), (short) ((-18) - TextUtils.getOffsetAfter("", 0)), (byte) KeyEvent.getDeadChar(0, 0), Gravity.getAbsoluteGravity(0, 0) - 846039067, objArr8);
                            if (line.equals((String) objArr8[0])) {
                                fileReader.close();
                                bufferedReader.close();
                                int i184 = d;
                                int i185 = ((i184 | 89) << 1) - (i184 ^ 89);
                                asBinder = i185 % 128;
                                int i186 = i185 % 2;
                                str = null;
                            } else {
                                fileReader.close();
                                bufferedReader.close();
                                str = line;
                            }
                        } catch (Throwable th) {
                            fileReader.close();
                            bufferedReader.close();
                            throw th;
                        }
                    } else {
                        str = null;
                    }
                } catch (Exception unused2) {
                }
                try {
                    int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0');
                    int i187 = (iIndexOf4 ^ 427284564) + ((427284564 & iIndexOf4) << 1);
                    int keyRepeatDelay = (-66) - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    short sRed = (short) (Color.red(0) + 39);
                    byte bResolveSizeAndState = (byte) View.resolveSizeAndState(0, 0, 0);
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0');
                    Object[] objArr9 = new Object[1];
                    c(i187, keyRepeatDelay, sRed, bResolveSizeAndState, (iLastIndexOf2 ^ (-846039063)) + (((-846039063) & iLastIndexOf2) << 1), objArr9);
                    File file2 = new File((String) objArr9[0]);
                    if (file2.canRead()) {
                        FileReader fileReader2 = new FileReader(file2);
                        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
                        try {
                            String line2 = bufferedReader2.readLine();
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            int i188 = d;
                            int i189 = ((i188 | 113) << 1) - (i188 ^ 113);
                            asBinder = i189 % 128;
                            if (i189 % 2 == 0) {
                                i12 = (iMakeMeasureSpec2 * 592) - 427283975;
                            } else {
                                int i190 = iMakeMeasureSpec2 * 592;
                                i12 = (i190 & 1305177114) + (i190 | 1305177114);
                            }
                            int i191 = i188 + 77;
                            asBinder = i191 % 128;
                            int i192 = i191 % 2;
                            int i193 = (i12 - (~((-1182) * (~(((iMakeMeasureSpec2 ^ (-1)) & 427284565) | ((-427284566) ^ iMakeMeasureSpec2)))))) - 1;
                            int i194 = ~iMakeMeasureSpec2;
                            int i195 = (i194 ^ (-427284566)) | (i194 & (-427284566));
                            int i196 = ~i;
                            int i197 = ~((i195 ^ i196) | (i195 & i196));
                            int i198 = ~(iMakeMeasureSpec2 | 427284565);
                            int i199 = ((i197 ^ i198) | (i198 & i197)) * (-591);
                            int i200 = (i193 & i199) + (i199 | i193);
                            int i201 = (i194 & i) | (i ^ i194);
                            int i202 = ((i201 & (-427284566)) | (i201 ^ (-427284566))) * 591;
                            int i203 = (i200 & i202) + (i202 | i200);
                            int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
                            int i204 = ~(((-1734822917) & i122) | ((-1734822917) ^ i122));
                            int i205 = (i204 & 1157974020) | (i204 ^ 1157974020);
                            int i206 = ~((2003295654 & i) | (2003295654 ^ i));
                            int i207 = -(-(((i205 & i206) | (i205 ^ i206)) * (-713)));
                            int i208 = ((((-564175968) & i207) + (i207 | (-564175968))) - (~((~((2003295654 & i) | (2003295654 ^ i))) * 1426))) - 1;
                            int i209 = (~((1426446758 & i122) | (1426446758 ^ i122))) * 713;
                            int i210 = ((i208 | i209) << 1) - (i208 ^ i209);
                            int iTuitionPaymentFragmentbindingInflater8 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
                            int i211 = ~(((-685568766) & iTuitionPaymentFragmentbindingInflater8) | ((-685568766) ^ iTuitionPaymentFragmentbindingInflater8));
                            int i212 = ~iTuitionPaymentFragmentbindingInflater8;
                            int i213 = ~((i212 ^ (-1035904633)) | (i212 & (-1035904633)));
                            int i214 = 1083454772 + (((i211 ^ i213) | (i211 & i213)) * (-1808));
                            int i215 = ~(((-4214918) ^ iTuitionPaymentFragmentbindingInflater8) | ((-4214918) & iTuitionPaymentFragmentbindingInflater8));
                            int i216 = ~iTuitionPaymentFragmentbindingInflater8;
                            int i217 = (i216 ^ 685568765) | (i216 & 685568765);
                            int i218 = ~((i217 ^ (-1035904633)) | (i217 & (-1035904633)));
                            int i219 = -(-(((i215 ^ i218) | (i218 & i215)) * TypedValues.Custom.TYPE_BOOLEAN));
                            int i220 = ((i214 | i219) << 1) - (i219 ^ i214);
                            int i221 = ~((1035904632 & iTuitionPaymentFragmentbindingInflater8) | (1035904632 ^ iTuitionPaymentFragmentbindingInflater8));
                            int i222 = (i221 & 681353848) | (681353848 ^ i221);
                            int i223 = ~((i212 ^ 685568765) | (i212 & 685568765));
                            int i224 = ((i222 & i223) | (i222 ^ i223)) * TypedValues.Custom.TYPE_BOOLEAN;
                            if (i210 <= (i220 ^ i224) + ((i224 & i220) << 1)) {
                                int i225 = (-66) >> doubleTapTimeout;
                                i13 = -(ViewConfiguration.getFadingEdgeLength() >>> 81);
                                iTuitionPaymentFragmentbindingInflater1 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
                                i14 = (-947) >> i13;
                                i16 = i225;
                                i17 = 125;
                                i15 = 0;
                            } else {
                                int i226 = -doubleTapTimeout;
                                int i227 = (i226 & (-66)) + (i226 | (-66));
                                i13 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                iTuitionPaymentFragmentbindingInflater1 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
                                i14 = i13 * (-947);
                                i15 = -119574;
                                i16 = i227;
                                i17 = -126;
                            }
                            int i228 = (i14 - (~(-(-i15)))) - 1;
                            int i229 = ~i13;
                            int i230 = ~i17;
                            int i231 = ~(i230 | iTuitionPaymentFragmentbindingInflater1);
                            int i232 = i228 + (((i229 ^ i231) | (i231 & i229)) * (-948));
                            int i233 = d + 77;
                            asBinder = i233 % 128;
                            int i234 = i233 % 2;
                            int i235 = -(-((~((i229 ^ i230) | (i229 & i230) | (~iTuitionPaymentFragmentbindingInflater1))) * (-948)));
                            short s4 = (short) ((((i232 ^ i235) + ((i235 & i232) << 1)) - (~(-(-(((~i17) | i13) * 948))))) - 1);
                            byte packedPositionGroup = (byte) ExpandableListView.getPackedPositionGroup(0L);
                            int i236 = d + 67;
                            asBinder = i236 % 128;
                            int i237 = i236 % 2;
                            int i238 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            Object[] objArr10 = new Object[1];
                            c(i203, i16, s4, packedPositionGroup, (i238 & (-846039033)) + (i238 | (-846039033)), objArr10);
                            boolean zEquals2 = line2.equals((String) objArr10[0]);
                            fileReader2.close();
                            bufferedReader2.close();
                            int i239 = asBinder;
                            int i240 = (i239 & 81) + (i239 | 81);
                            d = i240 % 128;
                            int i241 = i240 % 2;
                            if (zEquals2) {
                                int i242 = -View.getDefaultSize(0, 0);
                                int i243 = (i242 ^ 427284563) + ((i242 & 427284563) << 1);
                                int i244 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                int i245 = ((i244 | (-67)) << 1) - (i244 ^ (-67));
                                int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0);
                                int iTuitionPaymentFragmentbindingInflater9 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
                                int i246 = ~iLastIndexOf3;
                                int i247 = (((iLastIndexOf3 * (-159)) + 13992) - (~(((i246 & (-88)) | (i246 ^ (-88))) * 160))) - 1;
                                int i248 = ~iTuitionPaymentFragmentbindingInflater9;
                                int i249 = ((~((i248 ^ iLastIndexOf3) | (i248 & iLastIndexOf3))) | (~((iLastIndexOf3 ^ (-88)) | (iLastIndexOf3 & (-88))))) * (-160);
                                int i250 = (i247 & i249) + (i247 | i249);
                                int i251 = ~((i248 & 87) | (87 ^ i248));
                                int i252 = -(-(((iLastIndexOf3 & i251) | (iLastIndexOf3 ^ i251)) * 160));
                                short s5 = (short) ((i250 & i252) + (i252 | i250));
                                byte b4 = (byte) ((-16777217) - (~(-Color.rgb(0, 0, 0))));
                                int i253 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                int iTuitionPaymentFragmentbindingInflater10 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
                                int i254 = ~i253;
                                int i255 = ((i253 * (-755)) - 1190657944) + ((~((i254 ^ 846039031) | (i254 & 846039031))) * 1512);
                                int i256 = (i253 & (-846039032)) | (i253 ^ (-846039032));
                                int i257 = ((~((i254 & 846039031) | (i254 ^ 846039031))) | (~((i256 ^ iTuitionPaymentFragmentbindingInflater10) | (i256 & iTuitionPaymentFragmentbindingInflater10)))) * (-756);
                                int i258 = ~iTuitionPaymentFragmentbindingInflater10;
                                int i259 = ((((i255 | i257) << 1) - (i255 ^ i257)) - (~(((i256 & i258) | (i256 ^ i258)) * 756))) - 1;
                                Object[] objArr11 = new Object[1];
                                c(i243, i245, s5, b4, i259, objArr11);
                                File file3 = new File((String) objArr11[0]);
                                int i260 = asBinder;
                                int i261 = ((i260 | 125) << 1) - (i260 ^ 125);
                                d = i261 % 128;
                                int i262 = i261 % 2;
                                if (file3.canRead()) {
                                    FileReader fileReader3 = new FileReader(file3);
                                    BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                    try {
                                        String line3 = bufferedReader3.readLine();
                                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 427284565;
                                        int i263 = -Color.green(0);
                                        int i264 = i263 * (-209);
                                        int i265 = (i264 & 13794) + (i264 | 13794);
                                        int i266 = ~i263;
                                        int i267 = (~((i266 & 65) | (i266 ^ 65))) * 210;
                                        int i268 = (i265 ^ i267) + ((i267 & i265) << 1);
                                        int i269 = ~i;
                                        int i270 = ~((65 ^ i269) | (65 & i269));
                                        int i271 = ~i263;
                                        int i272 = ~((i271 ^ i) | (i271 & i));
                                        int i273 = d;
                                        int i274 = (i273 & 87) + (i273 | 87);
                                        asBinder = i274 % 128;
                                        int i275 = i274 % 2;
                                        int i276 = i268 + (210 * (i270 | i272));
                                        int i277 = ((~((i263 & 65) | (65 ^ i263) | i)) | (~((i271 ^ i122) | (i271 & i122) | (-66)))) * 210;
                                        int i278 = ((i276 | i277) << 1) - (i277 ^ i276);
                                        int i279 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                        short s6 = (short) (((i279 | (-126)) << 1) - (i279 ^ (-126)));
                                        int i280 = -ImageFormat.getBitsPerPixel(0);
                                        int iTuitionPaymentFragmentbindingInflater11 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
                                        int i281 = ~i280;
                                        int i282 = ~iTuitionPaymentFragmentbindingInflater11;
                                        int i283 = ~i282;
                                        int i284 = (i281 ^ i283) | (i283 & i281);
                                        int i285 = ~((iTuitionPaymentFragmentbindingInflater11 ^ (-1)) | iTuitionPaymentFragmentbindingInflater11);
                                        int i286 = ((i280 * (-563)) - 565) + (((i284 ^ i285) | (i285 & i284)) * (-564));
                                        int i287 = asBinder;
                                        int i288 = (i287 ^ 29) + ((i287 & 29) << 1);
                                        d = i288 % 128;
                                        int i289 = i288 % 2;
                                        int i290 = (i281 ^ (-1)) | i281;
                                        int i291 = -(-(1128 * (~((i290 ^ iTuitionPaymentFragmentbindingInflater11) | (iTuitionPaymentFragmentbindingInflater11 & i290)))));
                                        int i292 = (i286 ^ i291) + ((i291 & i286) << 1);
                                        int i293 = ~((i281 ^ i282) | (i281 & i282));
                                        int i294 = ~(i280 | (i280 ^ (-1)));
                                        byte b5 = (byte) ((i292 - (~(((i294 & i293) | (i293 ^ i294)) * 564))) - 1);
                                        int i295 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                        int i296 = d;
                                        int i297 = ((i296 | 69) << 1) - (69 ^ i296);
                                        int i298 = i297 % 128;
                                        asBinder = i298;
                                        int i299 = i297 % 2;
                                        int i300 = i295 * 868;
                                        int i301 = (i300 ^ 77526972) + ((i300 & 77526972) << 1);
                                        int i302 = ~i295;
                                        int i303 = ~((i302 ^ i269) | (i302 & i269));
                                        int i304 = ~(846039032 | i122);
                                        int i305 = (i301 - (~(((i303 ^ i304) | (i304 & i303)) * (-867)))) - 1;
                                        int i306 = ~((i302 ^ 846039032) | (i302 & 846039032));
                                        int i307 = ~(i302 | i);
                                        int i308 = (i306 ^ i307) | (i306 & i307);
                                        int i309 = ~((846039032 ^ i) | (846039032 & i));
                                        int i310 = ((i308 ^ i309) | (i308 & i309)) * (-1734);
                                        int i311 = (i305 ^ i310) + ((i310 & i305) << 1);
                                        int i312 = (846039032 & i302) | (i302 ^ 846039032);
                                        int i313 = ~((i269 & i312) | (i312 ^ i269));
                                        int i314 = ((i298 | 1) << 1) - (i298 ^ 1);
                                        d = i314 % 128;
                                        int i315 = i314 % 2;
                                        int i316 = ~(((-846039033) & i302) | (i302 ^ (-846039033)) | i);
                                        int i317 = (i313 & i316) | (i313 ^ i316);
                                        int i318 = ~((846039032 & i295) | (846039032 ^ i295) | i);
                                        int i319 = -(-(867 * ((i317 & i318) | (i317 ^ i318))));
                                        int i320 = ((i311 | i319) << 1) - (i319 ^ i311);
                                        Object[] objArr12 = new Object[1];
                                        c(iNormalizeMetaState, i278, s6, b5, i320, objArr12);
                                        zEquals = line3.equals((String) objArr12[0]);
                                        fileReader3.close();
                                        bufferedReader3.close();
                                    } catch (Throwable th2) {
                                        fileReader3.close();
                                        bufferedReader3.close();
                                        throw th2;
                                    }
                                } else {
                                    int i321 = d + 113;
                                    asBinder = i321 % 128;
                                    zEquals = i321 % 2 == 0;
                                }
                                if (zEquals && str != null) {
                                    int i322 = asBinder;
                                    int i323 = (i322 & 21) + (i322 | 21);
                                    d = i323 % 128;
                                    int i324 = i323 % 2;
                                    objArr = new Object[]{new int[]{(~(i & 20)) & (i | 20)}, new String[]{str}};
                                    c = 0;
                                }
                            }
                            obj = objArr[c];
                            i4 = ((int[]) obj)[c];
                            int i325 = ((~i137) & i) | (i137 & i122);
                            int i326 = -i325;
                            i5 = ((i325 & i326) | (i325 ^ i326)) >> 31;
                            i6 = ~i5;
                            int i327 = d;
                            i7 = (i327 ^ 65) + ((i327 & 65) << 1);
                            asBinder = i7 % 128;
                            if (i7 % 2 == 0) {
                                int i328 = i4 & i6;
                                int i329 = i137 & i5;
                                i11 = (i328 & i329) | (i328 ^ i329);
                                strArr = (String[]) obj;
                                objArr2 = new Object[2];
                                int i330 = (~(i & i4)) & (i4 | i);
                                int i331 = -i330;
                                i8 = ((i330 & i331) | (i330 ^ i331)) * 64;
                                i10 = (~i8) & 1;
                                i9 = 0;
                            } else {
                                int i332 = i4 & i6;
                                int i333 = i137 & i5;
                                int i334 = (i332 & i333) | (i332 ^ i333);
                                String[] strArr3 = (String[]) objArr[1];
                                int i335 = (i122 & i4) | ((~i4) & i);
                                int i336 = -i335;
                                i8 = ((i335 & i336) | (i335 ^ i336)) >> 31;
                                objArr2 = new Object[2];
                                i9 = 1;
                                i10 = 0;
                                strArr = strArr3;
                                i11 = i334;
                            }
                            int i337 = (i8 & i9) | i10;
                            int i338 = -i337;
                            int i339 = (~(((i338 & i337) | (i337 ^ i338)) >> 31)) & 1;
                            objArr2[i337] = null;
                            objArr2[i339] = strArr;
                            int i340 = i ^ i11;
                            int i341 = -i340;
                            int i342 = (((i340 & i341) | (i340 ^ i341)) >> 31) & 16;
                            Object[] objArr13 = {new int[]{i}, new int[1], new int[]{i11}, (String[]) objArr2[0]};
                            int iNextInt = new Random().nextInt(792282219);
                            int i343 = ~iNextInt;
                            int i344 = (~((-837083662) | i343)) | 276832773;
                            int i345 = ~(iNextInt | (-236522545));
                            int i346 = 1571408802 + ((i344 | i345) * (-502)) + ((i345 | (~(i343 | (-560250889)))) * TypedValues.PositionType.TYPE_DRAWPATH);
                            int iTuitionPaymentFragmentbindingInflater12 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
                            int i347 = (i342 * 236) + (i346 * 471);
                            int i348 = ~i342;
                            int i349 = ~iTuitionPaymentFragmentbindingInflater12;
                            int i350 = ((~((i348 & i349) | (i348 ^ i349))) | i346) * (-235);
                            int i351 = ((i347 | i350) << 1) - (i347 ^ i350);
                            int i352 = ~i342;
                            int i353 = ~(i352 | iTuitionPaymentFragmentbindingInflater12);
                            int i354 = i351 + (((i353 & i346) | (i346 ^ i353)) * (-470));
                            int i355 = ~i346;
                            int i356 = ~((i355 & i342) | (i355 ^ i342));
                            int i357 = i352 | i346;
                            int i358 = ~((iTuitionPaymentFragmentbindingInflater12 & i357) | (i357 ^ iTuitionPaymentFragmentbindingInflater12));
                            int i359 = -(-(((i358 & i356) | (i356 ^ i358)) * 235));
                            int i360 = (i354 & i359) + (i359 | i354);
                            int i361 = ((i2 | i360) << 1) - (i2 ^ i360);
                            int i362 = i361 << 13;
                            int i363 = ((~i361) & i362) | ((~i362) & i361);
                            int i364 = i363 ^ (i363 >>> 17);
                            ((int[]) objArr13[1])[0] = i364 ^ (i364 << 5);
                            return objArr13;
                        } catch (Throwable th3) {
                            fileReader2.close();
                            bufferedReader2.close();
                            throw th3;
                        }
                    }
                } catch (Exception unused3) {
                }
                c = 0;
                objArr = new Object[]{new int[]{i}, new String[0]};
                obj = objArr[c];
                i4 = ((int[]) obj)[c];
                int i3210 = ((~i137) & i) | (i137 & i122);
                int i3211 = -i3210;
                i5 = ((i3210 & i3211) | (i3210 ^ i3211)) >> 31;
                i6 = ~i5;
                int i3212 = d;
                i7 = (i3212 ^ 65) + ((i3212 & 65) << 1);
                asBinder = i7 % 128;
                if (i7 % 2 == 0) {
                    int i3213 = i4 & i6;
                    int i3214 = i137 & i5;
                    i11 = (i3213 & i3214) | (i3213 ^ i3214);
                    strArr = (String[]) obj;
                    objArr2 = new Object[2];
                    int i3310 = (~(i & i4)) & (i4 | i);
                    int i3311 = -i3310;
                    i8 = ((i3310 & i3311) | (i3310 ^ i3311)) * 64;
                    i10 = (~i8) & 1;
                    i9 = 0;
                } else {
                    int i3312 = i4 & i6;
                    int i3313 = i137 & i5;
                    int i3314 = (i3312 & i3313) | (i3312 ^ i3313);
                    String[] strArr4 = (String[]) objArr[1];
                    int i3315 = (i122 & i4) | ((~i4) & i);
                    int i3316 = -i3315;
                    i8 = ((i3315 & i3316) | (i3315 ^ i3316)) >> 31;
                    objArr2 = new Object[2];
                    i9 = 1;
                    i10 = 0;
                    strArr = strArr4;
                    i11 = i3314;
                }
                int i3317 = (i8 & i9) | i10;
                int i3318 = -i3317;
                int i3319 = (~(((i3318 & i3317) | (i3317 ^ i3318)) >> 31)) & 1;
                objArr2[i3317] = null;
                objArr2[i3319] = strArr;
                int i3410 = i ^ i11;
                int i3411 = -i3410;
                int i3412 = (((i3410 & i3411) | (i3410 ^ i3411)) >> 31) & 16;
                Object[] objArr14 = {new int[]{i}, new int[1], new int[]{i11}, (String[]) objArr2[0]};
                int iNextInt2 = new Random().nextInt(792282219);
                int i3413 = ~iNextInt2;
                int i3414 = (~((-837083662) | i3413)) | 276832773;
                int i3415 = ~(iNextInt2 | (-236522545));
                int i3416 = 1571408802 + ((i3414 | i3415) * (-502)) + ((i3415 | (~(i3413 | (-560250889)))) * TypedValues.PositionType.TYPE_DRAWPATH);
                int iTuitionPaymentFragmentbindingInflater13 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
                int i3417 = (i3412 * 236) + (i3416 * 471);
                int i3418 = ~i3412;
                int i3419 = ~iTuitionPaymentFragmentbindingInflater13;
                int i3510 = ((~((i3418 & i3419) | (i3418 ^ i3419))) | i3416) * (-235);
                int i3511 = ((i3417 | i3510) << 1) - (i3417 ^ i3510);
                int i3512 = ~i3412;
                int i3513 = ~(i3512 | iTuitionPaymentFragmentbindingInflater13);
                int i3514 = i3511 + (((i3513 & i3416) | (i3416 ^ i3513)) * (-470));
                int i3515 = ~i3416;
                int i3516 = ~((i3515 & i3412) | (i3515 ^ i3412));
                int i3517 = i3512 | i3416;
                int i3518 = ~((iTuitionPaymentFragmentbindingInflater13 & i3517) | (i3517 ^ iTuitionPaymentFragmentbindingInflater13));
                int i3519 = -(-(((i3518 & i3516) | (i3516 ^ i3518)) * 235));
                int i365 = (i3514 & i3519) + (i3519 | i3514);
                int i366 = ((i2 | i365) << 1) - (i2 ^ i365);
                int i367 = i366 << 13;
                int i368 = ((~i366) & i367) | ((~i367) & i366);
                int i369 = i368 ^ (i368 >>> 17);
                ((int[]) objArr14[1])[0] = i369 ^ (i369 << 5);
                return objArr14;
            } catch (Throwable th4) {
                Throwable cause = th4.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th4;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(byte r6, short r7, int r8) {
            /*
                int r7 = r7 + 117
                int r6 = r6 * 3
                int r0 = 1 - r6
                byte[] r1 = getCameraOpenRetryMaxTimeoutInMillisWhileResuming.b.$$c
                int r8 = r8 + 4
                byte[] r0 = new byte[r0]
                r2 = 0
                int r6 = 0 - r6
                if (r1 != 0) goto L15
                r7 = r6
                r3 = r8
                r4 = r2
                goto L2b
            L15:
                r3 = r2
            L16:
                int r8 = r8 + 1
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L23:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2b:
                int r8 = -r8
                int r7 = r7 + r8
                r8 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: getCameraOpenRetryMaxTimeoutInMillisWhileResuming.b.$$e(byte, short, int):java.lang.String");
        }
    }

    public static class TuitionPaymentFragmentbindingInflater1 extends b<InputStream> {
        public TuitionPaymentFragmentbindingInflater1() {
            super(new TuitionPaymentFragmentspecialinlinedviewModeldefault3<InputStream>() { // from class: getCameraOpenRetryMaxTimeoutInMillisWhileResuming.TuitionPaymentFragmentbindingInflater1.4
                @Override // getCameraOpenRetryMaxTimeoutInMillisWhileResuming.TuitionPaymentFragmentspecialinlinedviewModeldefault3
                public final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(InputStream inputStream) throws IOException {
                    inputStream.close();
                }

                @Override // getCameraOpenRetryMaxTimeoutInMillisWhileResuming.TuitionPaymentFragmentspecialinlinedviewModeldefault3
                public final Class<InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                    return InputStream.class;
                }

                @Override // getCameraOpenRetryMaxTimeoutInMillisWhileResuming.TuitionPaymentFragmentspecialinlinedviewModeldefault3
                public final /* synthetic */ InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault1(File file) throws FileNotFoundException {
                    return new FileInputStream(file);
                }
            });
        }
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends b<ParcelFileDescriptor> {
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            super(new TuitionPaymentFragmentspecialinlinedviewModeldefault3<ParcelFileDescriptor>() { // from class: getCameraOpenRetryMaxTimeoutInMillisWhileResuming.TuitionPaymentFragmentspecialinlinedviewModeldefault2.4
                @Override // getCameraOpenRetryMaxTimeoutInMillisWhileResuming.TuitionPaymentFragmentspecialinlinedviewModeldefault3
                public final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                    parcelFileDescriptor.close();
                }

                @Override // getCameraOpenRetryMaxTimeoutInMillisWhileResuming.TuitionPaymentFragmentspecialinlinedviewModeldefault3
                public final Class<ParcelFileDescriptor> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                    return ParcelFileDescriptor.class;
                }

                @Override // getCameraOpenRetryMaxTimeoutInMillisWhileResuming.TuitionPaymentFragmentspecialinlinedviewModeldefault3
                public final /* synthetic */ ParcelFileDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault1(File file) throws FileNotFoundException {
                    return ParcelFileDescriptor.open(file, 268435456);
                }
            });
        }
    }
}
