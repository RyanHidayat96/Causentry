package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.MimeTypeMap;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import coil.decode.DataSource;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class getTitle implements setMediaId {
    private final Uri TuitionPaymentFragmentbindingInflater1;
    private final getStarRating b;
    private static final byte[] $$c = {92, 126, -38, -95};
    private static final int $$f = 42;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {46, 47, -18, 64, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 191;
    private static final byte[] $$a = {5, -91, 77, 46, 2, -10, 10};
    private static final int $$b = 186;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int asBinder = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {60051, 59745, 60034, 60053, 60052, 60058, 60040, 60055, 60086, 60075, 59750, 60117, 60043, 59751, 60063, 60079, 59746, 60062, 60046, 60050, 59747, 60045, 59744, 60054, 60073, 60059, 60057, 60047, 60061, 60056, 59748, 60085, 60041, 60049, 59749, 60060};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 57191;

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002f -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r0 = r8 + 4
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r1 = defpackage.getTitle.$$a
            int r6 = r6 * 4
            int r6 = r6 + 111
            byte[] r0 = new byte[r0]
            int r8 = r8 + 3
            r2 = -1
            if (r1 != 0) goto L19
            r6 = r7
            r4 = r8
            r3 = r2
            goto L31
        L19:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1d:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L2f
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r0, r7)
            r9[r7] = r6
            return
        L2f:
            r4 = r1[r6]
        L31:
            int r7 = r7 + r4
            int r7 = r7 + r2
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getTitle.a(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = defpackage.getTitle.$$d
            int r7 = r7 * 52
            int r7 = 53 - r7
            int r6 = r6 + 84
            int r5 = r5 * 52
            int r5 = 56 - r5
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r5
            r4 = r7
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            r4 = r0[r5]
        L27:
            int r4 = -r4
            int r5 = r5 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getTitle.c(int, short, byte, java.lang.Object[]):void");
    }

    public getTitle(Uri uri, getStarRating getstarrating) {
        this.TuitionPaymentFragmentbindingInflater1 = uri;
        this.b = getstarrating;
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1<Uri> {
        @Override // setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final /* synthetic */ setMediaId TuitionPaymentFragmentspecialinlinedviewModeldefault2(Uri uri, getStarRating getstarrating) {
            Uri uri2 = uri;
            if (getRatingType.b(uri2)) {
                return new getTitle(uri2, getstarrating);
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x0309  */
    /* JADX WARN: Code duplicated, block: B:38:0x0368 A[Catch: all -> 0x0653, TryCatch #0 {all -> 0x0653, blocks: (B:36:0x0352, B:38:0x0368, B:39:0x03b2, B:51:0x041e, B:53:0x042b, B:54:0x0472, B:56:0x0490, B:57:0x04e1), top: B:90:0x0352 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x05d0  */
    @Override // defpackage.setMediaId
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Continuation<? super setMediaUri> continuation) throws Throwable {
        int i;
        int i2;
        String string;
        Method method;
        int i3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i4 = 2;
        int i5 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        int i6 = 0;
        byte b = (byte) 0;
        byte b2 = b;
        Object[] objArr = new Object[1];
        a(b, b2, b2, objArr);
        Method[] methodArr = {AssetManager.class.getMethod((String) objArr[0], String.class)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int iAxisFromString = MotionEvent.axisFromString("") + 2824;
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 22;
            byte[] bArr = $$d;
            byte b3 = bArr[5];
            byte b4 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b3, b4, b4, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(windowTouchSlop, iAxisFromString, packedPositionType, 1814927978, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), MotionEvent.axisFromString("") + 2824, (Process.myPid() >> 22) + 22)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    Method method2 = declaredMethods[i7];
                    int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                    asBinder = i8 % 128;
                    int i9 = i8 % i4;
                    try {
                        Object[] objArr3 = new Object[1];
                        d(new char[]{'#', 3, 23, 3, 6, '\b', 0, 4, 5, 17, '#', 14, 25, '\n', 23, '#', 29, '\t', 11, 14, 24, 3, 2, 16}, (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 105), 24 - Drawable.resolveOpacity(i6, i6), objArr3);
                        Class<?> cls = Class.forName((String) objArr3[i6]);
                        Object[] objArr4 = new Object[1];
                        d(new char[]{5, 23, 26, '\t', 2, 16, 22, 25, 23, '\r', 30, '\b'}, (byte) (View.MeasureSpec.getSize(i6) + 72), 12 - (Process.myTid() >> 22), objArr4);
                        int iIntValue2 = ((Integer) cls.getMethod((String) objArr4[i6], null).invoke(method2, null)).intValue();
                        Object[] objArr5 = new Object[1];
                        objArr5[i6] = Integer.valueOf(iIntValue2);
                        Object[] objArr6 = new Object[1];
                        d(new char[]{'#', 3, 23, 3, 6, '\b', 0, 4, 5, 17, '#', 14, 25, '\n', 23, '#', 29, '\t', '\n', 2, '\r', 20, 25, 22, 14, '#'}, (byte) (75 - (ViewConfiguration.getEdgeSlop() >> 16)), 26 - View.MeasureSpec.getMode(i6), objArr6);
                        Class<?> cls2 = Class.forName((String) objArr6[i6]);
                        Object[] objArr7 = new Object[1];
                        d(new char[]{18, 7, '#', 1, 25, 21, 23, 15}, (byte) (96 - TextUtils.getOffsetAfter("", i6)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 8, objArr7);
                        if (((Boolean) cls2.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).booleanValue()) {
                            Class cls3 = Long.TYPE;
                            Object[] objArr8 = new Object[1];
                            d(new char[]{'#', 3, 23, 3, 6, '\b', 0, 4, 5, 17, '#', 14, 25, '\n', 23, '#', 29, '\t', 11, 14, 24, 3, 2, 16}, (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 106), View.MeasureSpec.getMode(0) + 24, objArr8);
                            Class<?> cls4 = Class.forName((String) objArr8[0]);
                            Object[] objArr9 = new Object[1];
                            d(new char[]{5, 23, 28, 25, 15, 29, 20, 30, '\t', 21, 0, 14, 13854}, (byte) (31 - (ViewConfiguration.getPressedStateDuration() >> 16)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12, objArr9);
                            if (cls3.equals(cls4.getMethod((String) objArr9[0], null).invoke(method2, null))) {
                                int i10 = asBinder + 115;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                                int i11 = i10 % 2;
                                Object[] objArr10 = new Object[1];
                                d(new char[]{'#', 3, 23, 3, 6, '\b', 0, 4, 5, 17, '#', 14, 25, '\n', 23, '#', 29, '\t', 11, 14, 24, 3, 2, 16}, (byte) (TextUtils.getOffsetBefore("", 0) + 106), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23, objArr10);
                                Class<?> cls5 = Class.forName((String) objArr10[0]);
                                Object[] objArr11 = new Object[1];
                                d(new char[]{5, 23, '!', 15, 2, '#', 11, 29, 15, 29, 14, '#', 14, 3, '\r', '\f', 13871}, (byte) (69 - TextUtils.lastIndexOf("", '0', 0, 0)), 17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr11);
                                Object[] objArr12 = (Object[]) cls5.getMethod((String) objArr11[0], null).invoke(method2, null);
                                if (objArr12.length == 2 && Long.TYPE.equals(objArr12[0])) {
                                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
                                    asBinder = i12 % 128;
                                    if (i12 % 2 == 0) {
                                        Object[] objArr13 = new Object[1];
                                        d(new char[]{'#', 3, 23, 3, 6, '\b', 0, 4, 5, 17, '#', 14, 25, '\n', 23, '#', 29, '\t', 11, 14, 24, 3, 2, 16}, (byte) (62 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 115 - ((Process.getThreadPriority(0) + 122) / 16), objArr13);
                                        if (!(!Class.forName((String) objArr13[0]).equals(objArr12[1]))) {
                                            i3 = 0;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char deadChar = (char) KeyEvent.getDeadChar(i3, i3);
                                                int iResolveSize = View.resolveSize(i3, i3) + 2823;
                                                int i13 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
                                                byte[] bArr2 = $$d;
                                                byte b5 = bArr2[5];
                                                byte b6 = bArr2[7];
                                                Object[] objArr14 = new Object[1];
                                                c(b5, b6, b6, objArr14);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, iResolveSize, i13, 1814927978, false, (String) objArr14[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 2824;
                                                int i14 = 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                byte[] bArr3 = $$d;
                                                byte b7 = bArr3[5];
                                                byte b8 = bArr3[7];
                                                Object[] objArr15 = new Object[1];
                                                c(b7, b8, b8, objArr15);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iIndexOf, i14, 1814927978, false, (String) objArr15[0], null);
                                            }
                                            try {
                                                Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                                                    int iAlpha = Color.alpha(0) + 2823;
                                                    int windowTouchSlop2 = 22 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                    byte[] bArr4 = $$d;
                                                    Object[] objArr17 = new Object[1];
                                                    c(bArr4[7], bArr4[10], bArr4[5], objArr17);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAxisFromString, iAlpha, windowTouchSlop2, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr16)).longValue();
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        }
                                    } else {
                                        i3 = 0;
                                        Object[] objArr18 = new Object[1];
                                        d(new char[]{'#', 3, 23, 3, 6, '\b', 0, 4, 5, 17, '#', 14, 25, '\n', 23, '#', 29, '\t', 11, 14, 24, 3, 2, 16}, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 105), ((Process.getThreadPriority(0) + 20) >> 6) + 24, objArr18);
                                        if (Class.forName((String) objArr18[0]).equals(objArr12[1])) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char deadChar2 = (char) KeyEvent.getDeadChar(i3, i3);
                                                int iResolveSize2 = View.resolveSize(i3, i3) + 2823;
                                                int i15 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
                                                byte[] bArr5 = $$d;
                                                byte b9 = bArr5[5];
                                                byte b10 = bArr5[7];
                                                Object[] objArr19 = new Object[1];
                                                c(b9, b10, b10, objArr19);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar2, iResolveSize2, i15, 1814927978, false, (String) objArr19[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 2824;
                                                int i16 = 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                byte[] bArr6 = $$d;
                                                byte b11 = bArr6[5];
                                                byte b12 = bArr6[7];
                                                Object[] objArr110 = new Object[1];
                                                c(b11, b12, b12, objArr110);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iIndexOf2, i16, 1814927978, false, (String) objArr110[0], null);
                                            }
                                            Object[] objArr111 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char cAxisFromString2 = (char) (MotionEvent.axisFromString("") + 1);
                                                int iAlpha2 = Color.alpha(0) + 2823;
                                                int windowTouchSlop3 = 22 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                byte[] bArr7 = $$d;
                                                Object[] objArr112 = new Object[1];
                                                c(bArr7[7], bArr7[10], bArr7[5], objArr112);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAxisFromString2, iAlpha2, windowTouchSlop3, -2137287382, false, (String) objArr112[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr111)).longValue();
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        i7++;
                        i4 = 2;
                        i6 = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
            int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 2823;
            int iRgb = (-16777194) - Color.rgb(0, 0, 0);
            byte[] bArr8 = $$d;
            byte b13 = bArr8[5];
            byte b14 = bArr8[7];
            Object[] objArr20 = new Object[1];
            c(b13, b14, b14, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionGroup, packedPositionType2, iRgb, 1814927978, false, (String) objArr20[0], null);
        }
        Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int iRgb2 = Color.rgb(0, 0, 0) + 16780039;
            int i17 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21;
            byte[] bArr9 = $$d;
            byte b15 = bArr9[7];
            Object[] objArr22 = new Object[1];
            c(b15, (byte) (b15 | 14), bArr9[5], objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumFlingVelocity, iRgb2, i17, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
        Object[] objArr23 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 37657);
            int size = 2720 - View.MeasureSpec.getSize(0);
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 19;
            byte[] bArr10 = $$d;
            byte b16 = bArr10[7];
            Object[] objArr24 = new Object[1];
            c(b16, (byte) (b16 | 14), bArr10[5], objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(doubleTapTimeout, size, minimumFlingVelocity, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
        long j = -418937842;
        long j2 = -964;
        long j3 = (((long) (-963)) * j) + j2 + (((long) 965) * jLongValue);
        long j4 = -1;
        long j5 = jLongValue ^ j4;
        long jIdentityHashCode = System.identityHashCode(this);
        long j6 = j3 + (((j ^ j4) | ((j5 | jIdentityHashCode) ^ j4)) * j2) + (j2 * ((((jIdentityHashCode ^ j4) | j5) ^ j4) | ((j5 | j) ^ j4))) + ((long) (-1391468003));
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i18 = ~iFreeMemory;
        int i19 = ~((-1093478795) | i18);
        int i20 = ((int) (j6 >> 32)) & (580889514 + ((338176 | i19) * (-712)) + (((~(iFreeMemory | (-1093140619))) | (~(i18 | (-338177)))) * (-712)) + ((1764262090 | i19) * 712));
        int iIdentityHashCode = System.identityHashCode(this);
        int i21 = ~iIdentityHashCode;
        int i22 = i20 | (((int) j6) & ((-501357939) + (((~((-918833938) | i21)) | 847268608) * 168) + ((~((-847268609) | iIdentityHashCode)) * 168) + (((~(iIdentityHashCode | (-71565330))) | (~(i21 | (-1938906949))) | 1091638340) * 168)));
        int i23 = i22 >>> 24;
        int i24 = i22 & ViewCompat.MEASURED_SIZE_MASK;
        boolean z = i23 != 0;
        if (z) {
            int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
            asBinder = i25 % 128;
            i = 2;
            int i26 = i25 % 2;
            i2 = 1;
        } else {
            i = 2;
            i2 = 0;
        }
        if (z) {
            int i27 = asBinder;
            int i28 = i27 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i28 % 128;
            if (i28 % i != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (i24 >= 1 || (method = methodArr[i24]) == null) {
                string = null;
            } else {
                int i29 = i27 + 115;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i29 % 128;
                if (i29 % i != 0) {
                    method.toString();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                string = method.toString();
            }
        } else {
            string = null;
        }
        arrayList.add(string);
        if ((i23 + 6) * i2 != 0) {
            Toast.makeText((Context) null, iIntValue / (((iIntValue - 1) * iIntValue) % 2), 0).show();
            int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
            asBinder = i30 % 128;
            int i31 = i30 % 2;
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.drop(this.TuitionPaymentFragmentbindingInflater1.getPathSegments(), 1), "/", null, null, 0, null, null, 62, null);
        return new MediaDescriptionCompatApi21Builder(new MediaBrowserCompatApi26SubscriptionCallbackProxy(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getAssets().open(strJoinToString$default))), new createItemCallback(this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2()), new createBrowser(strJoinToString$default)), getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault2(MimeTypeMap.getSingleton(), strJoinToString$default), DataSource.DISK);
    }

    private static void d(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = 1770390596;
        Object obj2 = null;
        int i5 = 3;
        if (cArr3 != null) {
            int i6 = $11 + 91;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i5;
                        byte b3 = (byte) (b2 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.blue(0), TextUtils.getOffsetAfter("", 0) + 2267, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 33, -1927765101, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i7++;
                    i4 = 1770390596;
                    i5 = 3;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b4 = (byte) 3;
            byte b5 = (byte) (b4 - 4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 2268 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 33, -1927765101, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i8 = $11 + 91;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
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
                        char cLastIndexOf = (char) (49266 - TextUtils.lastIndexOf("", '0', 0));
                        int capsMode = 3261 - TextUtils.getCapsMode("", 0, 0);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 30;
                        byte b6 = (byte) ($$f & 7);
                        byte b7 = (byte) (b6 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, capsMode, iResolveSizeAndState, -127612708, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = (byte) (b8 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 22878), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 594, 17 - Color.alpha(0), 1570859318, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i10];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i11 = $10 + 99;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i13];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i14];
                        } else {
                            int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i15];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i16];
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

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, int r8) {
        /*
            int r7 = r7 + 4
            int r6 = 116 - r6
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r0 = defpackage.getTitle.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r6 = r8
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L29:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getTitle.$$g(short, int, int):java.lang.String");
    }
}
