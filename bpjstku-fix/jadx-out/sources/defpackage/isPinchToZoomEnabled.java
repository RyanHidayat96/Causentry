package defpackage;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.google.android.gms.measurement.internal.zznf;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class isPinchToZoomEnabled<E> extends getImageAnalysisBackpressureStrategy<E, Set<? extends E>, HashSet<E>> {
    private final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {93, -122, -23, -24};
    private static final int $$f = 225;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {101, 89, 94, -73, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 27;
    private static final byte[] $$a = {77, -106, 83, 4, 7, -23, 19, -25, 72, -55, -17, -9, 7, -6, 3, 63, -71, 1, 9, 0, 51, -39, -20, 0, -17, 11, -17, 39, -28, -22, 36, -31, 9, 0};
    private static final int $$b = 122;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long TuitionPaymentFragmentbindingInflater1 = 9086710032238407446L;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = 106 - r8
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r0 = r6 + 31
            byte[] r1 = defpackage.isPinchToZoomEnabled.$$a
            byte[] r0 = new byte[r0]
            int r6 = r6 + 30
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-2)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isPinchToZoomEnabled.a(byte, short, byte, java.lang.Object[]):void");
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
    private static void c(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 52
            int r7 = 55 - r7
            int r8 = 103 - r8
            int r9 = r9 * 52
            int r9 = r9 + 1
            byte[] r0 = defpackage.isPinchToZoomEnabled.$$d
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r5 = r2
            goto L2e
        L14:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L18:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2e:
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isPinchToZoomEnabled.c(byte, int, byte, java.lang.Object[]):void");
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentbindingInflater1 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $11 + 91;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64886 - AndroidCharacter.getMirror('0')), 1356 - (ViewConfiguration.getFadingEdgeLength() >> 16), 39 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 47773), 469 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i6 = $10 + 61;
        $11 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object obj) {
        HashSet hashSet;
        int i = 2 % 2;
        int i2 = b + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        Set set = (Set) obj;
        Intrinsics.checkNotNullParameter(set, "");
        if (i3 == 0) {
            boolean z = set instanceof HashSet;
            obj2.hashCode();
            throw null;
        }
        if (set instanceof HashSet) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            hashSet = (HashSet) set;
        } else {
            hashSet = null;
        }
        if (hashSet == null) {
            hashSet = new HashSet(set);
        }
        int i5 = b + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            return hashSet;
        }
        throw null;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        b = i2 % 128;
        int i3 = i2 % 2;
        HashSet hashSet = (HashSet) obj;
        Intrinsics.checkNotNullParameter(hashSet, "");
        HashSet hashSet2 = hashSet;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        b = i4 % 128;
        int i5 = i4 % 2;
        return hashSet2;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
        int i = 2 % 2;
        int i2 = b + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        HashSet hashSet = (HashSet) obj;
        Intrinsics.checkNotNullParameter(hashSet, "");
        if (i3 == 0) {
            hashSet.size();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        return hashSet.size();
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj, int i, Object obj2) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        b = i3 % 128;
        int i4 = i3 % 2;
        HashSet hashSet = (HashSet) obj;
        Intrinsics.checkNotNullParameter(hashSet, "");
        if (i4 != 0) {
            hashSet.add(obj2);
            int i5 = 12 / 0;
        } else {
            hashSet.add(obj2);
        }
        int i6 = b + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 42 / 0;
        }
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter((HashSet) obj, "");
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isPinchToZoomEnabled(videoProfileHdrFormatsToDynamicRangeEncoding<E> videoprofilehdrformatstodynamicrangeencoding) {
        super(videoprofilehdrformatstodynamicrangeencoding);
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new isRecording(videoprofilehdrformatstodynamicrangeencoding.getDescriptor());
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat, defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        int i = 2 % 2;
        int i2 = b + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        HashSet hashSet = new HashSet();
        int i2 = b + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return hashSet;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x06d6  */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) throws Throwable {
        Constructor[] constructorArr;
        Class<?> cls;
        Class<?>[] clsArr;
        boolean z;
        int i;
        String string;
        String str;
        Class<?>[] clsArr2;
        Class<?> cls2;
        int i2;
        Method[] methodArr;
        int i3;
        Object[] objArr;
        Method method;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = 1;
        int i8 = (i6 ^ 35) + ((i6 & 35) << 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
        int i9 = 0;
        if (i8 % 2 == 0) {
            constructorArr = new Constructor[1];
            byte[] bArr = $$a;
            byte b2 = bArr[19];
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (-bArr[17]), b2, objArr2);
            cls = Class.forName((String) objArr2[0]);
            clsArr = new Class[4];
        } else {
            constructorArr = new Constructor[1];
            byte[] bArr2 = $$a;
            byte b3 = bArr2[19];
            Object[] objArr3 = new Object[1];
            a(b3, (byte) (-bArr2[17]), b3, objArr3);
            cls = Class.forName((String) objArr3[0]);
            clsArr = new Class[2];
        }
        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i11 = (i10 ^ 55) + ((i10 & 55) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
        clsArr[0] = byte[].class;
        clsArr[1] = String.class;
        constructorArr[0] = cls.getDeclaredConstructor(clsArr);
        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i14 = (i13 & 123) + (i13 | 123);
        b = i14 % 128;
        int i15 = 16;
        Class<?>[] clsArr3 = null;
        if (i14 % 2 != 0) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cGreen = (char) Color.green(0);
                int longPressTimeout = 2823 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 22;
                byte[] bArr3 = $$d;
                byte b4 = bArr3[5];
                Object[] objArr4 = new Object[1];
                c((byte) (-b4), bArr3[54], (byte) (-b4), objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, longPressTimeout, offsetAfter, 1814927978, false, (String) objArr4[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
            clsArr3.hashCode();
            throw null;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 2823;
            int iBlue = 22 - Color.blue(0);
            byte[] bArr4 = $$d;
            byte b5 = bArr4[5];
            Object[] objArr5 = new Object[1];
            c((byte) (-b5), bArr4[54], (byte) (-b5), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, iIndexOf, iBlue, 1814927978, false, (String) objArr5[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2823, View.combineMeasuredStates(0, 0) + 22)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i16 = 0;
            while (i16 < length) {
                int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i18 = ((i17 | 123) << i7) - (i17 ^ 123);
                b = i18 % 128;
                int i19 = i18 % i4;
                Method method2 = declaredMethods[i16];
                try {
                    Object[] objArr6 = new Object[i7];
                    d(new char[]{25976, 61605, 20940, 46394, 25874, 30132, 23386, 9483, 28822, 27641, 28941, 4932, 20127, 16507, 26590, 3727, 9310, 13945, 7561, 25801, 12812, 11515, 12385, 21007, 2508, 765, 9731, 18510}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr6);
                    Class<?> cls3 = Class.forName((String) objArr6[i9]);
                    int i20 = b;
                    int i21 = ((i20 | 45) << i7) - (i20 ^ 45);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i21 % 128;
                    int i22 = i21 % i4;
                    char[] cArr = new char[i15];
                    // fill-array-data instruction
                    cArr[0] = 15380;
                    cArr[1] = 15066;
                    cArr[2] = 16196;
                    cArr[3] = 14922;
                    cArr[4] = 15475;
                    cArr[5] = 49103;
                    cArr[6] = 13776;
                    cArr[7] = 43607;
                    cArr[8] = 10683;
                    cArr[9] = 41358;
                    cArr[10] = 8077;
                    cArr[11] = 39996;
                    cArr[12] = 6141;
                    cArr[13] = 35407;
                    cArr[14] = 2390;
                    cArr[15] = 33257;
                    Object[] objArr7 = new Object[i7];
                    d(cArr, View.MeasureSpec.makeMeasureSpec(i9, i9), objArr7);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr7[i9], clsArr3).invoke(method2, clsArr3)).intValue();
                    Object[] objArr8 = new Object[i7];
                    int i23 = b;
                    int i24 = ((i23 | 71) << i7) - (i23 ^ 71);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
                    int i25 = i24 % i4;
                    objArr8[i9] = Integer.valueOf(iIntValue);
                    Object[] objArr9 = new Object[i7];
                    d(new char[]{11598, 3081, 41840, 22601, 11556, 35096, 43494, 51320, 14496, 38741, 33713, 65079, 1705, 48343, 38242, 58364, 27752, 51925, 61237, 35258, 31290, 53335, 49885, 49014, 16874, 65104, 54454, 42288, 44971, 2955}, ViewConfiguration.getScrollBarSize() >> 8, objArr9);
                    Class<?> cls4 = Class.forName((String) objArr9[i9]);
                    char[] cArr2 = {16285, 64436, 19276, 24544, 16372, 32439, 16866, 53201, 10793, 24813, 27546, 63893};
                    int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout();
                    int i26 = b;
                    int i27 = (i26 ^ 87) + ((i26 & 87) << i7);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i27 % 128;
                    if (i27 % i4 == 0) {
                        Object[] objArr10 = new Object[i7];
                        d(cArr2, keyRepeatTimeout + 75, objArr10);
                        str = (String) objArr10[i9];
                        clsArr2 = new Class[i7];
                        cls2 = Integer.TYPE;
                        i2 = i7;
                    } else {
                        int i28 = keyRepeatTimeout >> 16;
                        Object[] objArr11 = new Object[i7];
                        d(cArr2, i28, objArr11);
                        str = (String) objArr11[i9];
                        clsArr2 = new Class[i7];
                        cls2 = Integer.TYPE;
                        i2 = i9;
                    }
                    clsArr2[i2] = cls2;
                    if (((Boolean) cls4.getMethod(str, clsArr2).invoke(clsArr3, objArr8)).booleanValue()) {
                        Class cls5 = Long.TYPE;
                        char[] cArr3 = {25976, 61605, 20940, 46394, 25874, 30132, 23386, 9483, 28822, 27641, 28941, 4932, 20127, 16507, 26590, 3727, 9310, 13945, 7561, 25801, 12812, 11515, 12385, 21007, 2508, 765, 9731, 18510};
                        int i29 = -AndroidCharacter.getMirror('0');
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i30 = i29 * 51;
                        int i31 = (i30 & (-2352)) + (i30 | (-2352));
                        int i32 = b + 19;
                        int i33 = i32 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i33;
                        int i34 = i32 % i4 == 0 ? i31 << ((-50) % (i29 | iTuitionPaymentFragmentspecialinlinedviewModeldefault2)) : (i31 - (~(-(-(((i29 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i29 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2)) * (-50)))))) - 1;
                        int i35 = ~i29;
                        int i36 = (i35 ^ (-49)) | (i35 & (-49));
                        int i37 = ~((i36 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i36 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                        int i38 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i39 = ((-49) ^ i38) | ((-49) & i38);
                        int i40 = ~((i39 ^ i29) | (i39 & i29));
                        int i41 = i33 + 103;
                        methodArr = declaredMethods;
                        b = i41 % 128;
                        int i42 = i41 % 2;
                        int i43 = -(-(50 * (i37 | i40)));
                        int i44 = (i34 & i43) + (i43 | i34);
                        int i45 = ~(((-49) & i38) | ((-49) ^ i38));
                        int i46 = ((i33 | 55) << 1) - (i33 ^ 55);
                        b = i46 % 128;
                        if (i46 % 2 != 0) {
                            int i47 = ~(((-49) ^ i29) | ((-49) & i29));
                            int i48 = (i45 & i47) | (i45 ^ i47);
                            int i49 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            i3 = 49 - (~(i48 | (~((i49 & i29) | (i49 ^ i29)))));
                        } else {
                            int i50 = ~(((-49) ^ i29) | ((-49) & i29));
                            i3 = ((i45 & i50) | (i45 ^ i50) | (~((i38 & i29) | (i38 ^ i29)))) * 50;
                        }
                        Object[] objArr12 = new Object[1];
                        d(cArr3, (i44 - (~i3)) - 1, objArr12);
                        Class<?> cls6 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        d(new char[]{51624, 64493, 60604, 36207, 51663, 32504, 58920, 7533, 56333, 24745, 52329, 11021, 57926, 19273, 55973, 14031, 34957}, ViewConfiguration.getEdgeSlop() >> 16, objArr13);
                        if (cls5.equals(cls6.getMethod((String) objArr13[0], null).invoke(method2, null))) {
                            int i51 = b;
                            int i52 = (i51 & 25) + (i51 | 25);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i52 % 128;
                            int i53 = i52 % 2;
                            Object[] objArr14 = new Object[1];
                            d(new char[]{25976, 61605, 20940, 46394, 25874, 30132, 23386, 9483, 28822, 27641, 28941, 4932, 20127, 16507, 26590, 3727, 9310, 13945, 7561, 25801, 12812, 11515, 12385, 21007, 2508, 765, 9731, 18510}, TextUtils.getOffsetAfter("", 0), objArr14);
                            Class<?> cls7 = Class.forName((String) objArr14[0]);
                            int i54 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i55 = ((i54 | 105) << 1) - (i54 ^ 105);
                            b = i55 % 128;
                            if (i55 % 2 != 0) {
                                Object[] objArr15 = new Object[1];
                                d(new char[]{17250, 53252, 41311, 41962, 17157, 21777, 43979, 13290, 22211, 19270, 33182, 1431, 26759, 24704, 38746, 6216, 630, 5837, 60687, 29215, 5137}, TextUtils.getCapsMode("", 1, 0), objArr15);
                                method = cls7.getMethod((String) objArr15[0], null);
                                objArr = null;
                            } else {
                                Object[] objArr16 = new Object[1];
                                d(new char[]{17250, 53252, 41311, 41962, 17157, 21777, 43979, 13290, 22211, 19270, 33182, 1431, 26759, 24704, 38746, 6216, 630, 5837, 60687, 29215, 5137}, TextUtils.getCapsMode("", 0, 0), objArr16);
                                objArr = null;
                                method = cls7.getMethod((String) objArr16[0], null);
                            }
                            Object[] objArr17 = (Object[]) method.invoke(method2, objArr);
                            if (objArr17.length == 2 && Long.TYPE.equals(objArr17[0])) {
                                Object[] objArr18 = new Object[1];
                                d(new char[]{25976, 61605, 20940, 46394, 25874, 30132, 23386, 9483, 28822, 27641, 28941, 4932, 20127, 16507, 26590, 3727, 9310, 13945, 7561, 25801, 12812, 11515, 12385, 21007, 2508, 765, 9731, 18510}, ExpandableListView.getPackedPositionType(0L), objArr18);
                                if (Class.forName((String) objArr18[0]).equals(objArr17[1])) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char defaultSize = (char) View.getDefaultSize(0, 0);
                                        int iLastIndexOf = 2822 - TextUtils.lastIndexOf("", '0');
                                        int i56 = 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                        byte[] bArr5 = $$d;
                                        byte b6 = bArr5[5];
                                        Object[] objArr19 = new Object[1];
                                        c((byte) (-b6), bArr5[54], (byte) (-b6), objArr19);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize, iLastIndexOf, i56, 1814927978, false, (String) objArr19[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, method2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                        int iMakeMeasureSpec = 2823 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22;
                                        byte[] bArr6 = $$d;
                                        byte b7 = bArr6[5];
                                        Object[] objArr20 = new Object[1];
                                        c((byte) (-b7), bArr6[54], (byte) (-b7), objArr20);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iMakeMeasureSpec, keyRepeatDelay, 1814927978, false, (String) objArr20[0], null);
                                    }
                                    try {
                                        Object[] objArr21 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                                            int i57 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2822;
                                            int iAxisFromString = MotionEvent.axisFromString("") + 23;
                                            byte b8 = $$d[7];
                                            byte b9 = b8;
                                            Object[] objArr22 = new Object[1];
                                            c(b8, b9, b9, objArr22);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString, i57, iAxisFromString, -2137287382, false, (String) objArr22[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr21)).longValue();
                                        int i58 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
                                        b = i58 % 128;
                                        int i59 = i58 % 2;
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
                            continue;
                        }
                    } else {
                        methodArr = declaredMethods;
                    }
                    i16++;
                    declaredMethods = methodArr;
                    i4 = 2;
                    i9 = 0;
                    i7 = 1;
                    i15 = 16;
                    clsArr3 = null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char size = (char) View.MeasureSpec.getSize(0);
            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 2824;
            int modifierMetaStateMask = 21 - ((byte) KeyEvent.getModifierMetaStateMask());
            byte[] bArr7 = $$d;
            byte b10 = bArr7[5];
            Object[] objArr23 = new Object[1];
            c((byte) (-b10), bArr7[54], (byte) (-b10), objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(size, iIndexOf2, modifierMetaStateMask, 1814927978, false, (String) objArr23[0], null);
        }
        Object[] objArr24 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
            int fadingEdgeLength2 = 2823 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 22;
            byte b11 = $$d[7];
            byte b12 = b11;
            Object[] objArr25 = new Object[1];
            c(b12, (byte) (b12 + 5), b11, objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(fadingEdgeLength, fadingEdgeLength2, jumpTapTimeout, 1025296417, false, (String) objArr25[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr24);
        Object[] objArr26 = {0, constructorArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-687574488);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char modifierMetaStateMask2 = (char) (37656 - ((byte) KeyEvent.getModifierMetaStateMask()));
            int capsMode = 2720 - TextUtils.getCapsMode("", 0, 0);
            int iIndexOf3 = 19 - TextUtils.indexOf("", "", 0);
            byte[] bArr8 = $$d;
            byte b13 = bArr8[7];
            Object[] objArr27 = new Object[1];
            c(b13, bArr8[14], b13, objArr27);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(modifierMetaStateMask2, capsMode, iIndexOf3, 865785343, false, (String) objArr27[0], new Class[]{Integer.TYPE, Constructor[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr26)).longValue();
        long j = -911753509;
        long j2 = 371;
        long j3 = (j2 * j) + (j2 * jLongValue);
        long j4 = -370;
        long j5 = -1;
        long j6 = jLongValue ^ j5;
        long jMyTid = Process.myTid();
        long j7 = jMyTid ^ j5;
        long j8 = j ^ j5;
        long j9 = (jLongValue | j) ^ j5;
        long j10 = j3 + ((((j6 | j7) ^ j5) | ((j8 | jMyTid) ^ j5)) * j4) + (j4 * (((j8 | j7) ^ j5) | ((j6 | jMyTid) ^ j5) | j9)) + (((long) 370) * j9) + ((long) (-112302113));
        int iNextInt = new Random().nextInt(65420089);
        int i60 = ((int) (j10 >> 32)) & ((-345329118) + (((~((-434431093) | iNextInt)) | 159653908) * (-140)) + ((~((-274777185) | iNextInt)) * 70) + (((~(iNextInt | 1871657503)) | (-1986780780)) * 70));
        int i61 = (int) Runtime.getRuntime().totalMemory();
        int i62 = (-872487321) + (((~((-1544560983) | i61)) | (-1313179904)) * (-318));
        int i63 = ~((-1313179904) | i61);
        int i64 = ~i61;
        int i65 = i60 | (((int) j10) & (i62 + ((i63 | (~(1582672383 | i64))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i61 | 1582672383)) | (~((-38111402) | i64))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)));
        int i66 = i65 >>> 24;
        int i67 = i65 & ViewCompat.MEASURED_SIZE_MASK;
        if (i66 != 0) {
            z = true;
        } else {
            int i68 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i69 = ((i68 | 5) << 1) - (i68 ^ 5);
            b = i69 % 128;
            int i70 = i69 % 2;
            z = false;
        }
        if (z) {
            int i71 = b;
            int i72 = (i71 ^ 69) + ((i71 & 69) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i72 % 128;
            int i73 = i72 % 2;
            i = 1;
        } else {
            i = 0;
        }
        if (!z || i67 >= constructorArr.length) {
            string = null;
        } else {
            int i74 = b;
            int i75 = ((i74 | 39) << 1) - (i74 ^ 39);
            int i76 = i75 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i76;
            if (i75 % 2 == 0) {
                Constructor constructor = constructorArr[i67];
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Constructor constructor2 = constructorArr[i67];
            if (constructor2 != null) {
                int i77 = i76 + 45;
                b = i77 % 128;
                int i78 = i77 % 2;
                string = constructor2.toString();
                if (i78 != 0) {
                    int i79 = 66 / 0;
                }
            } else {
                string = null;
            }
        }
        list.add(string);
        int i80 = (i66 & 6) + (i66 | 6);
        int i81 = b;
        int i82 = ((i81 | 83) << 1) - (i81 ^ 83);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i82 % 128;
        if (i82 % 2 != 0) {
            return i80 * i;
        }
        int i83 = -(-i);
        return (i80 & i83) + (i80 | i83);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, short r8) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r1 = defpackage.isPinchToZoomEnabled.$$c
            int r8 = r8 * 3
            int r8 = 107 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2a
        L17:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1b:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            int r3 = r3 + 1
            r4 = r1[r8]
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r8 = r8 + 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isPinchToZoomEnabled.$$g(byte, int, short):java.lang.String");
    }
}
