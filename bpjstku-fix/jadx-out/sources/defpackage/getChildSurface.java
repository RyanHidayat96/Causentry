package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
final class getChildSurface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static getChildSurface f922a;
    private static char[] asBinder;
    private static char cancelAll;
    private static final Object d;
    private static int notify;
    final Context TuitionPaymentFragmentbindingInflater1;
    final Integer TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final DisplayMetrics TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final Boolean asInterface;
    final Boolean b;
    private final String g;
    private static final byte[] $$c = {58, -103, 118, 14};
    private static final int $$f = 130;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {25, -93, -120, -48, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 16;
    private static final byte[] $$a = {25, 5, -88, -44, 2, -15, 36, -17, -2, -8, 10, -6, 2, 28, -37, 8, -9};
    private static final int $$b = 168;
    private static int cancel = 0;
    private static int INotificationSideChannel = 1;
    private static int onTransact = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = defpackage.getChildSurface.$$a
            int r9 = r9 * 4
            int r9 = r9 + 4
            int r7 = r7 * 2
            int r7 = 14 - r7
            int r8 = r8 * 2
            int r8 = r8 + 103
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2b:
            int r9 = -r9
            int r8 = r8 + r9
            int r9 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getChildSurface.c(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 84
            byte[] r0 = defpackage.getChildSurface.$$d
            int r5 = r5 * 52
            int r1 = r5 + 1
            int r6 = r6 * 52
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r6]
            int r3 = r3 + 1
        L26:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getChildSurface.e(short, int, int, java.lang.Object[]):void");
    }

    static getChildSurface TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context) {
        synchronized (d) {
            if (f922a == null) {
                f922a = new getChildSurface(context.getApplicationContext());
            }
        }
        return f922a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:39:0x031f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0378 A[Catch: all -> 0x0692, TryCatch #2 {all -> 0x0692, blocks: (B:41:0x0362, B:43:0x0378, B:44:0x03c2, B:56:0x042f, B:58:0x043c, B:59:0x0481, B:61:0x049f, B:62:0x04f4), top: B:121:0x0362 }] */
    /* JADX WARN: Multi-variable type inference failed */
    private getChildSurface(Context context) throws Throwable {
        boolean z;
        int i;
        Boolean bool;
        String string;
        Object obj;
        Integer numValueOf;
        String str;
        Method method;
        Boolean bool2;
        Boolean bool3;
        Method method2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        ArrayList arrayList = new ArrayList();
        Class<?> cls = Class.forName("android.content.pm.PackageManager");
        int i2 = 0;
        byte b = (byte) 0;
        byte b2 = b;
        byte b3 = b2;
        Object[] objArr = new Object[1];
        c(b, b2, b3, objArr);
        Method method3 = cls.getMethod((String) objArr[0], String.class, Integer.TYPE);
        Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
        Object[] objArr2 = new Object[1];
        c(b, b2, b3, objArr2);
        Method[] methodArr = {method3, cls2.getMethod((String) objArr2[0], String.class, Integer.TYPE)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 2823;
            int i3 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21;
            byte[] bArr = $$d;
            byte b4 = (byte) (-bArr[5]);
            byte b5 = bArr[7];
            Object[] objArr3 = new Object[1];
            e(b4, b5, b5, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, packedPositionGroup, i3, 1814927978, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), ((byte) KeyEvent.getModifierMetaStateMask()) + 2824, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i4 = cancel + 59;
            INotificationSideChannel = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            int i6 = 0;
            while (true) {
                if (i6 < length) {
                    Method method4 = declaredMethods[i6];
                    try {
                        Object[] objArr4 = new Object[1];
                        f(new char[]{'\t', 19, 27, 19, 28, 2, 23, '!', 24, 27, 18, 16, 28, 3, 18, 30, 2, 24, 0, 18, 5, '\f', 19, 14}, (byte) (ExpandableListView.getPackedPositionChild(0L) + 8), View.MeasureSpec.getSize(i2) + 24, objArr4);
                        Class<?> cls3 = Class.forName((String) objArr4[i2]);
                        Object[] objArr5 = new Object[1];
                        f(new char[]{24, 17, 6, 0, 19, 14, 3, '!', 30, 15, 28, Typography.quote}, (byte) (TextUtils.indexOf((CharSequence) "", '0', i2, i2) + 123), KeyEvent.keyCodeFromString("") + 12, objArr5);
                        Object[] objArr6 = new Object[1];
                        objArr6[i2] = Integer.valueOf(((Integer) cls3.getMethod((String) objArr5[i2], null).invoke(method4, null)).intValue());
                        Object[] objArr7 = new Object[1];
                        f(new char[]{'\t', 19, 27, 19, 28, 2, 23, '!', 24, 27, 18, 16, 28, 3, 18, 30, 2, 24, ' ', 18, 15, 31, '!', 3, 16, 18}, (byte) (111 - ExpandableListView.getPackedPositionChild(0L)), (TypedValue.complexToFloat(i2) > 0.0f ? 1 : (TypedValue.complexToFloat(i2) == 0.0f ? 0 : -1)) + 26, objArr7);
                        Class<?> cls4 = Class.forName((String) objArr7[i2]);
                        char[] cArr = {Typography.quote, 27, '!', 20, 3, 30, 24, '\r'};
                        byte b6 = (byte) (59 - (ExpandableListView.getPackedPositionForChild(i2, i2) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i2, i2) == 0L ? 0 : -1)));
                        int i7 = (TypedValue.complexToFloat(i2) > 0.0f ? 1 : (TypedValue.complexToFloat(i2) == 0.0f ? 0 : -1)) + 8;
                        Object[] objArr8 = new Object[1];
                        f(cArr, b6, i7, objArr8);
                        if (((Boolean) cls4.getMethod((String) objArr8[0], Integer.TYPE).invoke(null, objArr6)).booleanValue()) {
                            int i8 = INotificationSideChannel + 105;
                            cancel = i8 % 128;
                            int i9 = i8 % 2;
                            Class cls5 = Long.TYPE;
                            Object[] objArr9 = new Object[1];
                            f(new char[]{'\t', 19, 27, 19, 28, 2, 23, '!', 24, 27, 18, 16, 28, 3, 18, 30, 2, 24, 0, 18, 5, '\f', 19, 14}, (byte) (KeyEvent.getDeadChar(0, 0) + 7), 24 - Gravity.getAbsoluteGravity(0, 0), objArr9);
                            Class<?> cls6 = Class.forName((String) objArr9[0]);
                            Object[] objArr10 = new Object[1];
                            f(new char[]{24, 17, 1, 3, 18, 6, 16, 21, ' ', 17, 0, 19, 13917}, (byte) ((Process.myPid() >> 22) + 94), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12, objArr10);
                            if (cls5.equals(cls6.getMethod((String) objArr10[0], null).invoke(method4, null))) {
                                int i10 = cancel + 105;
                                INotificationSideChannel = i10 % 128;
                                int i11 = i10 % 2;
                                Object[] objArr11 = new Object[1];
                                f(new char[]{'\t', 19, 27, 19, 28, 2, 23, '!', 24, 27, 18, 16, 28, 3, 18, 30, 2, 24, 0, 18, 5, '\f', 19, 14}, (byte) (7 - Drawable.resolveOpacity(0, 0)), ExpandableListView.getPackedPositionChild(0L) + 25, objArr11);
                                Class<?> cls7 = Class.forName((String) objArr11[0]);
                                Object[] objArr12 = new Object[1];
                                f(new char[]{24, 17, 5, 18, 22, 23, 27, '\t', 18, 6, 16, 18, '\r', 2, 24, 18, 13818}, (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 17, objArr12);
                                Object[] objArr13 = (Object[]) cls7.getMethod((String) objArr12[0], null).invoke(method4, null);
                                if (objArr13.length == 2 && Long.TYPE.equals(objArr13[0])) {
                                    int i12 = cancel + 63;
                                    INotificationSideChannel = i12 % 128;
                                    if (i12 % 2 == 0) {
                                        Object[] objArr14 = new Object[1];
                                        f(new char[]{'\t', 19, 27, 19, 28, 2, 23, '!', 24, 27, 18, 16, 28, 3, 18, 30, 2, 24, 0, 18, 5, '\f', 19, 14}, (byte) ((ViewConfiguration.getScrollDefaultDelay() - 52) * 29), 7 % (Process.myPid() % 84), objArr14);
                                        if (Class.forName((String) objArr14[0]).equals(objArr13[0])) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                                                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 2823;
                                                int iArgb = Color.argb(0, 0, 0, 0) + 22;
                                                byte[] bArr2 = $$d;
                                                byte b7 = (byte) (-bArr2[5]);
                                                byte b8 = bArr2[7];
                                                Object[] objArr15 = new Object[1];
                                                e(b7, b8, b8, objArr15);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, pressedStateDuration, iArgb, 1814927978, false, (String) objArr15[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method4);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                                int defaultSize = 2823 - View.getDefaultSize(0, 0);
                                                int defaultSize2 = View.getDefaultSize(0, 0) + 22;
                                                byte[] bArr3 = $$d;
                                                byte b9 = (byte) (-bArr3[5]);
                                                byte b10 = bArr3[7];
                                                Object[] objArr16 = new Object[1];
                                                e(b9, b10, b10, objArr16);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop, defaultSize, defaultSize2, 1814927978, false, (String) objArr16[0], null);
                                            }
                                            try {
                                                Object[] objArr17 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                                                    int i13 = 2823 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                    int absoluteGravity = 22 - Gravity.getAbsoluteGravity(0, 0);
                                                    byte[] bArr4 = $$d;
                                                    Object[] objArr18 = new Object[1];
                                                    e(bArr4[7], (byte) (-bArr4[5]), bArr4[54], objArr18);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, i13, absoluteGravity, -2137287382, false, (String) objArr18[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr17)).longValue();
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause == null) {
                                                    throw th;
                                                }
                                                throw cause;
                                            }
                                        }
                                    } else {
                                        Object[] objArr19 = new Object[1];
                                        f(new char[]{'\t', 19, 27, 19, 28, 2, 23, '!', 24, 27, 18, 16, 28, 3, 18, 30, 2, 24, 0, 18, 5, '\f', 19, 14}, (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 7), 24 - (Process.myPid() >> 22), objArr19);
                                        if (Class.forName((String) objArr19[0]).equals(objArr13[1])) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                                                int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 2823;
                                                int iArgb2 = Color.argb(0, 0, 0, 0) + 22;
                                                byte[] bArr5 = $$d;
                                                byte b11 = (byte) (-bArr5[5]);
                                                byte b12 = bArr5[7];
                                                Object[] objArr110 = new Object[1];
                                                e(b11, b12, b12, objArr110);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, pressedStateDuration2, iArgb2, 1814927978, false, (String) objArr110[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method4);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                                int defaultSize3 = 2823 - View.getDefaultSize(0, 0);
                                                int defaultSize4 = View.getDefaultSize(0, 0) + 22;
                                                byte[] bArr6 = $$d;
                                                byte b13 = (byte) (-bArr6[5]);
                                                byte b14 = bArr6[7];
                                                Object[] objArr111 = new Object[1];
                                                e(b13, b14, b14, objArr111);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop2, defaultSize3, defaultSize4, 1814927978, false, (String) objArr111[0], null);
                                            }
                                            Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                                                int i14 = 2823 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                int absoluteGravity2 = 22 - Gravity.getAbsoluteGravity(0, 0);
                                                byte[] bArr7 = $$d;
                                                Object[] objArr113 = new Object[1];
                                                e(bArr7[7], (byte) (-bArr7[5]), bArr7[54], objArr113);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf2, i14, absoluteGravity2, -2137287382, false, (String) objArr113[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        i6++;
                        i2 = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int i15 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2822;
            int defaultSize5 = 22 - View.getDefaultSize(0, 0);
            byte[] bArr8 = $$d;
            byte b15 = (byte) (-bArr8[5]);
            byte b16 = bArr8[7];
            Object[] objArr20 = new Object[1];
            e(b15, b16, b16, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout, i15, defaultSize5, 1814927978, false, (String) objArr20[0], null);
        }
        Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            int iLastIndexOf = 2822 - TextUtils.lastIndexOf("", '0', 0);
            int iAlpha = 22 - Color.alpha(0);
            byte[] bArr9 = $$d;
            Object[] objArr22 = new Object[1];
            e(bArr9[7], (byte) (-bArr9[5]), (byte) ($$e - 2), objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, iLastIndexOf, iAlpha, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
        Object[] objArr23 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char tapTimeout2 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 37657);
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 2721;
            int iIndexOf = 18 - TextUtils.indexOf((CharSequence) "", '0', 0);
            byte[] bArr10 = $$d;
            Object[] objArr24 = new Object[1];
            e(bArr10[7], (byte) (-bArr10[5]), (byte) ($$e - 2), objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(tapTimeout2, modifierMetaStateMask, iIndexOf, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
        long j = -435103252;
        long j2 = 184;
        long j3 = -1;
        long j4 = j ^ j3;
        long jMyTid = Process.myTid();
        long j5 = jMyTid ^ j3;
        long j6 = (((long) (-183)) * j) + (((long) 185) * jLongValue) + ((((j4 | jLongValue) ^ j3) | ((j5 | jLongValue) ^ j3)) * j2) + (((long) (-184)) * ((((jLongValue ^ j3) | j) ^ j3) | jMyTid)) + (j2 * ((j4 | j5) ^ j3)) + ((long) (-1375302593));
        int iMyUid = Process.myUid();
        int i16 = ~iMyUid;
        int i17 = ((int) (j6 >> 32)) & ((-108933706) + (((~(i16 | 155403647)) | 1281822763) * (-1042)) + ((155403647 | iMyUid) * 521) + (((~(iMyUid | (-1281822764))) | 138608683 | (~(i16 | 1298617727))) * 521));
        int i18 = ~((int) Process.getElapsedCpuTime());
        int i19 = i17 | (((int) j6) & ((-1087403287) + ((~((-1644431377) | i18)) * 52) + (((~((-1671825426) | i18)) | (~((-234599016) | i18)) | 27394049) * (-52)) + (((~(i18 | 1671825425)) | (-1879030392)) * 52)));
        int i20 = i19 >>> 24;
        int i21 = i19 & ViewCompat.MEASURED_SIZE_MASK;
        if (i20 != 0) {
            int i22 = 2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 1;
        } else {
            int i23 = 2 % 2;
            i = 0;
        }
        if (!z || i21 >= 2 || (method2 = methodArr[i21]) == null) {
            bool = null;
            string = null;
        } else {
            int i24 = INotificationSideChannel + 79;
            cancel = i24 % 128;
            if (i24 % 2 != 0) {
                method2.toString();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            string = method2.toString();
            bool = null;
        }
        arrayList.add(string);
        if ((i20 + 6) * i != 0) {
            int i25 = 0 % 2;
            throw new ArithmeticException();
        }
        this.TuitionPaymentFragmentbindingInflater1 = context;
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            obj = packageInfo.versionName;
            try {
                numValueOf = Integer.valueOf(packageInfo.versionCode);
                str = obj;
            } catch (PackageManager.NameNotFoundException unused) {
                numValueOf = bool;
                str = obj;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            obj = bool;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i26 = ((PackageItemInfo) applicationInfo).labelRes;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = numValueOf;
        this.g = i26 == 0 ? ((PackageItemInfo) applicationInfo).nonLocalizedLabel == null ? "Misc" : ((PackageItemInfo) applicationInfo).nonLocalizedLabel.toString() : context.getString(i26);
        try {
            method = packageManager.getClass().getMethod("hasSystemFeature", String.class);
        } catch (NoSuchMethodException unused3) {
            method = bool;
        }
        if (method != 0) {
            try {
                bool3 = (Boolean) method.invoke(packageManager, "android.hardware.nfc");
                try {
                    bool = (Boolean) method.invoke(packageManager, "android.hardware.telephony");
                } catch (IllegalAccessException unused4) {
                } catch (InvocationTargetException unused5) {
                    int i27 = INotificationSideChannel + 67;
                    cancel = i27 % 128;
                    int i28 = i27 % 2;
                    int i29 = 2 % 2;
                }
            } catch (IllegalAccessException unused6) {
                bool3 = bool;
            } catch (InvocationTargetException unused7) {
                bool3 = bool;
            }
            bool2 = bool3;
        } else {
            int i30 = 2 % 2;
            bool2 = bool;
        }
        this.b = bool2;
        this.asInterface = bool;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = displayMetrics;
        ((WindowManager) this.TuitionPaymentFragmentbindingInflater1.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
    }

    public final Boolean TuitionPaymentFragmentbindingInflater1() {
        BluetoothAdapter defaultAdapter;
        int i = 2 % 2;
        try {
            if (this.TuitionPaymentFragmentbindingInflater1.getPackageManager().checkPermission("android.permission.BLUETOOTH", this.TuitionPaymentFragmentbindingInflater1.getPackageName()) == 0 && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null) {
                int i2 = cancel + 105;
                INotificationSideChannel = i2 % 128;
                if (i2 % 2 != 0) {
                    return Boolean.valueOf(defaultAdapter.isEnabled());
                }
                Boolean.valueOf(defaultAdapter.isEnabled());
                throw null;
            }
        } catch (Exception unused) {
        }
        int i3 = cancel + 71;
        INotificationSideChannel = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    static {
        notify = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        d = new Object();
        int i = onTransact + 73;
        notify = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void f(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = asBinder;
        long j = 0;
        char c = '0';
        int i4 = 1770390596;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", c, 0)), ExpandableListView.getPackedPositionGroup(j) + 2267, 33 - Color.alpha(0), -1927765101, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
                    j = 0;
                    c = '0';
                    i4 = 1770390596;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(cancelAll)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b4 = (byte) 0;
            byte b5 = b4;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.MeasureSpec.getSize(0), 2266 - TextUtils.indexOf((CharSequence) "", '0'), ((byte) KeyEvent.getModifierMetaStateMask()) + 34, -1927765101, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i6 = $11 + 77;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                i2 = i + 53;
                cArr4[i2] = (char) (cArr[i2] >>> b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $11 + 73;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i8 = $10 + 35;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49266), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3261, 30 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -127612708, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22878), 594 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 17, 1570859318, false, $$g(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i10];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i11 = $10 + 95;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                        } else {
                            int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        for (int i17 = 0; i17 < i; i17++) {
            cArr4[i17] = (char) (cArr4[i17] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        asBinder = new char[]{60047, 60034, 60073, 60054, 60055, 59749, 59746, 60049, 59744, 59751, 60057, 59745, 60062, 60063, 60079, 60046, 59747, 60051, 60043, 59748, 60052, 60058, 60041, 60075, 60056, 60045, 60117, 60061, 60040, 60060, 60086, 60048, 60085, 60050, 60059, 60053};
        cancelAll = (char) 57191;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r5, byte r6, byte r7) {
        /*
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r5 = r5 * 3
            int r0 = r5 + 1
            byte[] r1 = defpackage.getChildSurface.$$c
            int r7 = r7 + 113
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L20:
            r4 = r1[r6]
            int r3 = r3 + 1
        L24:
            int r6 = r6 + 1
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getChildSurface.$$g(int, byte, byte):java.lang.String");
    }
}
