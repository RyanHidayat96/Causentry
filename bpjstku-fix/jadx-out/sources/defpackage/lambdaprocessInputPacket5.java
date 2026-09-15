package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.esafirm.imagepicker.model.Image;
import com.google.mlkit.common.MlKitException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
public class lambdaprocessInputPacket5 {
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char[] b;
    private static int g;
    private ArrayList<Image> TuitionPaymentFragmentbindingInflater1 = new ArrayList<>();
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {27, -8, 5, 78};
    private static final int $$f = 85;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {117, 57, 101, -72, 13, -1, -62, 58, 9, 1, -7, 6, -6, -54, 52, 14, -9, 15, -2, -5, -4, -53, 64, -11, 20, -14, 14, -8, -7, 12, -61, 65, -12, 22, -12, -1, -5, 20, -10, 7, 0, -63, 33, 20, 22, -12, -1, -5, 20, -10, 7, 0, -43, 32, 18, -27, 20, -3, 19, 34, -11, 12, -10, 7, 0, -29, 18, 25, -11, -7, 10, 7, -45, 45, -16, 7, 7, -7, 10, 7, 0, -2, -10, -1, 7, -7, 12, -2, 6, -1, -2, 6, -8, 0, 19, -12, -3, 19, -41, 35, -10, 2, 8, -7, 2, 2, -4, 21, -8, 9, -66};
    private static final int $$e = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
    private static final byte[] $$a = {5, 11, -122, -94, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 93;
    private static int asBinder = 1;
    private static int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1257a = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = 103 - r6
            int r8 = r8 * 52
            int r0 = r8 + 1
            byte[] r1 = defpackage.lambdaprocessInputPacket5.$$a
            int r7 = r7 * 52
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L22:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + (-11)
            int r7 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdaprocessInputPacket5.c(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 15
            int r6 = r6 + 84
            byte[] r0 = defpackage.lambdaprocessInputPacket5.$$d
            int r7 = r7 * 55
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r1 = 56 - r8
            byte[] r1 = new byte[r1]
            int r8 = 55 - r8
            r2 = 0
            if (r0 != 0) goto L19
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2e:
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            int r6 = r6 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdaprocessInputPacket5.f(int, byte, byte, java.lang.Object[]):void");
    }

    public lambdaprocessInputPacket5(String str) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
    }

    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i4 = $11 + 119;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            j = 0;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(b[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 2188 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 40 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 841711447, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 2;
                        byte b5 = (byte) (b4 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - Color.green(0)), 3011 - TextUtils.indexOf("", "", 0, 0), 26 - Gravity.getAbsoluteGravity(0, 0), 321985076, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cGreen = (char) (Color.green(0) + 36505);
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 3377;
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 17;
                            byte b6 = (byte) ($$f & 3);
                            byte b7 = (byte) (b6 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen, iLastIndexOf, absoluteGravity, -968507904, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
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
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i7 = $11 + 105;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i9 = $10 + 37;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            try {
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char mirror = (char) (36553 - AndroidCharacter.getMirror('0'));
                    int i11 = 3375 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1));
                    int keyRepeatDelay = 17 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    byte b8 = (byte) ($$f & 3);
                    byte b9 = (byte) (b8 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mirror, i11, keyRepeatDelay, -968507904, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                j = 0;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr);
    }

    public final ArrayList<Image> b() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = f1257a + 115;
        d = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int iIndexOf = 875 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int iAxisFromString = MotionEvent.axisFromString("") + 11;
            byte[] bArr = $$a;
            byte b2 = bArr[0];
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop, iIndexOf, iAxisFromString, 252381699, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(ViewConfiguration.getMaximumFlingVelocity() >> 16, 22 - Color.argb(0, 0, 0, 0), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10675), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22, 15 - TextUtils.getCapsMode("", 0, 0), (char) (KeyEvent.keyCodeFromString("") + 42173), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cAlpha = (char) Color.alpha(0);
            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 877;
            int tapTimeout = 10 - (ViewConfiguration.getTapTimeout() >> 16);
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c(bArr2[10], bArr2[7], bArr2[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha, iIndexOf2, tapTimeout, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = d + 9;
            f1257a = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 876;
                int iNormalizeMetaState = 10 - KeyEvent.normalizeMetaState(0);
                byte[] bArr3 = $$a;
                byte b4 = bArr3[7];
                Object[] objArr6 = new Object[1];
                c(b4, bArr3[5], b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup, iKeyCodeFromString, iNormalizeMetaState, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iMyPid = Process.myPid();
            int i6 = ~iMyPid;
            int i7 = ((((-1646187204) + (((~(iMyPid | (-662218291))) | ((~((-143071238) | i6)) | 102761008)) * (-68))) + ((~((-559457283) | i6)) * (-68))) + (((~(662218290 | i6)) | (-702528520)) * 68)) - 120387602;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e((ViewConfiguration.getTapTimeout() >> 16) + 37, Color.green(0) + 26, (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(View.MeasureSpec.makeMeasureSpec(0, 0) + 63, 19 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) TextUtils.getOffsetAfter("", 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = f1257a + 77;
                d = i10 % 128;
                if (i10 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(82 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 16 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 61229), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(97 - Gravity.getAbsoluteGravity(0, 0), 16 - Color.red(0), (char) (Color.rgb(0, 0, 0) + 16842062), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i11 = d + 49;
            f1257a = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), -120387602};
                byte[] bArr4 = $$d;
                byte b5 = bArr4[9];
                byte b6 = bArr4[40];
                Object[] objArr13 = new Object[1];
                f(b5, b6, b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr4[40];
                byte b8 = bArr4[9];
                Object[] objArr14 = new Object[1];
                f(b7, b8, b8, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int iGreen = Color.green(0) + 876;
                        int i13 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[7];
                        Object[] objArr16 = new Object[1];
                        c(b9, bArr5[5], b9, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength, iGreen, i13, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(ImageFormat.getBitsPerPixel(0) + 1, 22 - (Process.myPid() >> 22), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 10676), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e('F' - AndroidCharacter.getMirror('0'), 15 - View.resolveSizeAndState(0, 0, 0), (char) (42173 - KeyEvent.normalizeMetaState(0)), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int iRed = Color.red(0) + 876;
                            int absoluteGravity = 10 - Gravity.getAbsoluteGravity(0, 0);
                            byte[] bArr6 = $$a;
                            Object[] objArr19 = new Object[1];
                            c(bArr6[10], bArr6[7], bArr6[5], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, iRed, absoluteGravity, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                            int defaultSize = View.getDefaultSize(0, 0) + 876;
                            int capsMode = 10 - TextUtils.getCapsMode("", 0, 0);
                            byte[] bArr7 = $$a;
                            byte b10 = bArr7[0];
                            byte b11 = bArr7[7];
                            Object[] objArr20 = new Object[1];
                            c(b10, b11, b11, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(absoluteGravity2, defaultSize, capsMode, 252381699, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i14 = ((int[]) objArr[2])[0];
        int i15 = ((int[]) objArr[0])[0];
        if (i15 == i14) {
            int i16 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyPid2 = Process.myPid();
            int i17 = ~iMyPid2;
            int i18 = i16 + (-810060588) + ((943767936 | i17) * (-192)) + (((~(979488212 | i17)) | 76030505) * (-384)) + (((~(iMyPid2 | (-35720277))) | (~(i17 | 1055518717)) | (~((-76030506) | iMyPid2))) * DerHeader.TAG_CLASS_PRIVATE);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr21[1])[0] = i20 ^ (i20 << 5);
        } else {
            Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
            int i21 = ((int[]) objArr[1])[0];
            Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i22 = i21 + 1662578948 + (((~((-84353047) | iIdentityHashCode)) | (~((~iIdentityHashCode) | (-44042818)))) * (-318)) + (((~(220197174 | iIdentityHashCode)) | (-264239992)) * (-318)) + (((~(iIdentityHashCode | (-220197175))) | 179886945) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr22[1])[0] = i24 ^ (i24 << 5);
        }
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    static {
        g = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -486896854;
        int i = asBinder + 99;
        g = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        b = new char[]{38990, 43548, 64753, 3914, 20788, 25495, 46693, 63626, 2728, 23833, 28579, 45443, 50186, 5861, 22861, 27449, 48530, 49217, 4809, 9383, 30472, 47589, 5444, 10000, 29178, 33350, 56358, 61077, 15211, 30200, 34732, 53253, 58095, 15530, 18708, 39925, 54354, 45565, 33711, 54594, 9977, 30855, 18980, 40918, 53561, 8981, 29865, 17998, 38989, 60801, 16198, 28926, 17030, 37946, 59864, 15202, 3330, 24204, 36949, 57872, 14242, 2373, 23277, 45567, 33716, 54612, 9977, 30861, 18979, 40902, 53590, 8964, 29865, 18002, 38922, 60835, 16196, 28926, 17030, 37923, 59871, 24283, 27789, 14973, 51655, 38891, 42252, 28926, 15956, 52286, 39898, 43328, 30519, 670, 53372, 40898, 44463, 19643, 32491, 10253, 56235, 34258, 46954, 25224, 11296, 56946, 35318, 47875, 25925, 4301, 49668, 36256, 49092};
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -444976554510285887L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, int r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 109
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r0 = r7 + 1
            byte[] r1 = defpackage.lambdaprocessInputPacket5.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2b
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdaprocessInputPacket5.$$g(int, int, byte):java.lang.String");
    }
}
