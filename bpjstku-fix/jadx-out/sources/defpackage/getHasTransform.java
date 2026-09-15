package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.internal.zzu;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class getHasTransform extends CameraFilters {
    private /* synthetic */ TaskCompletionSource TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private /* synthetic */ CameraFilters TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private /* synthetic */ CameraMode b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getHasTransform(CameraMode cameraMode, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, CameraFilters cameraFilters) {
        super(taskCompletionSource);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = taskCompletionSource2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cameraFilters;
        this.b = cameraMode;
    }

    @Override // defpackage.CameraFilters
    public final void b() {
        synchronized (this.b.g) {
            final CameraMode cameraMode = this.b;
            final TaskCompletionSource taskCompletionSource = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            cameraMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: CameraInternal
                private static final byte[] $$c = {87, -91, 60, 112};
                private static final int $$f = 21;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$d = {68, -119, -76, 97, 2, 31, -21, 54, 15, 12, 21, 15, -30, 57, 19, 11, 4, 35, -64, 64, 49, 4, 27, 5, 22, 15, -14, 33, 40, 4, 8, 25, 22, -30, 60, -1, 22, 22, 8, 25, 22, -2, 23, 21, 6, 21, 21, 9, -14, 53, 8, 22, 5, 35, 1, 29, -49, 49, 4, 27, 5, 22, 15, -14, 33, 40, 4, 8, 25, 22, -30, 60, -1, 22, 22, 8, 25, 22, -2, 23, 21, 6, 21, 21, 9, -14, 53, 8, 22, 5, 35, 1, 29, -49};
                private static final int $$e = 46;
                private static final byte[] $$a = {5, 11, -122, -94, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
                private static final int $$b = 191;
                private static char[] TuitionPaymentFragmentbindingInflater1 = {59715, 59783, 59781, 59801, 59767, 59766, 59781, 59802, 59795, 59792, 59776, 59758, 59774, 59805, 59768, 59749, 59776, 59802, 59806, 59803, 59781, 59783, 59729, 59826, 59824, 59829, 59851, 59837, 59832, 59808, 59808, 59839, 59831, 59850, 59827, 59837, 59827, 59709, 59746, 59751, 59768, 59773, 59757, 59723, 59713, 59745, 59756, 59757, 59718, 59724, 59744, 59744, 59758, 59705, 59756, 59757, 59759, 59746, 59770, 59749, 59749, 59773, 59755, 59743, 59745, 59750, 59742, 59730, 59746};

                /* JADX WARN: Code duplicated, block: B:10:0x0029  */
                /* JADX WARN: Code duplicated, block: B:8:0x0021  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
                    /*
                        int r6 = r6 * 15
                        int r0 = r6 + 38
                        byte[] r1 = defpackage.CameraInternal.$$a
                        int r7 = r7 + 4
                        int r8 = r8 * 4
                        int r8 = 84 - r8
                        byte[] r0 = new byte[r0]
                        int r6 = r6 + 37
                        r2 = 0
                        if (r1 != 0) goto L17
                        r3 = r8
                        r4 = r2
                        r8 = r7
                        goto L2f
                    L17:
                        r3 = r2
                    L18:
                        byte r4 = (byte) r8
                        r0[r3] = r4
                        int r7 = r7 + 1
                        int r4 = r3 + 1
                        if (r3 != r6) goto L29
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r0, r2)
                        r9[r2] = r6
                        return
                    L29:
                        r3 = r1[r7]
                        r5 = r8
                        r8 = r7
                        r7 = r3
                        r3 = r5
                    L2f:
                        int r3 = r3 + r7
                        int r7 = r3 + (-11)
                        r3 = r4
                        r5 = r8
                        r8 = r7
                        r7 = r5
                        goto L18
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.CameraInternal.a(short, byte, int, java.lang.Object[]):void");
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0026  */
                /* JADX WARN: Code duplicated, block: B:8:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void d(short r5, short r6, short r7, java.lang.Object[] r8) {
                    /*
                        byte[] r0 = defpackage.CameraInternal.$$d
                        int r5 = r5 * 16
                        int r1 = r5 + 38
                        int r6 = r6 * 31
                        int r6 = r6 + 84
                        int r7 = r7 + 4
                        byte[] r1 = new byte[r1]
                        int r5 = r5 + 37
                        r2 = 0
                        if (r0 != 0) goto L16
                        r4 = r5
                        r3 = r2
                        goto L2a
                    L16:
                        r3 = r2
                    L17:
                        byte r4 = (byte) r6
                        r1[r3] = r4
                        int r7 = r7 + 1
                        if (r3 != r5) goto L26
                        java.lang.String r5 = new java.lang.String
                        r5.<init>(r1, r2)
                        r8[r2] = r5
                        return
                    L26:
                        r4 = r0[r7]
                        int r3 = r3 + 1
                    L2a:
                        int r6 = r6 + r4
                        int r6 = r6 + (-16)
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.CameraInternal.d(short, short, short, java.lang.Object[]):void");
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) throws Throwable {
                    Object[] objArr;
                    CameraMode cameraMode2 = cameraMode;
                    TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                    synchronized (cameraMode2.g) {
                        cameraMode2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(taskCompletionSource2);
                    }
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char offsetBefore = (char) (43042 - TextUtils.getOffsetBefore("", 0));
                        int i = 3112 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 22;
                        byte[] bArr = $$a;
                        Object[] objArr2 = new Object[1];
                        a(bArr[132], bArr[5], bArr[7], objArr2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, i, capsMode, -1272852037, false, (String) objArr2[0], null);
                    }
                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                    Object[] objArr3 = new Object[1];
                    c(new int[]{0, 22, 37, 0}, true, new byte[]{0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    c(new int[]{22, 15, 80, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr4);
                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cIndexOf = (char) (43042 - TextUtils.indexOf("", ""));
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 3111;
                        int i2 = 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        byte[] bArr2 = $$a;
                        byte b = bArr2[132];
                        Object[] objArr5 = new Object[1];
                        a(b, (byte) (b | 50), bArr2[7], objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, packedPositionGroup, i2, -1269618118, false, (String) objArr5[0], null);
                    }
                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char defaultSize = (char) (43042 - View.getDefaultSize(0, 0));
                            int iRed = 3111 - Color.red(0);
                            int defaultSize2 = View.getDefaultSize(0, 0) + 22;
                            byte b2 = $$a[7];
                            byte b3 = b2;
                            Object[] objArr6 = new Object[1];
                            a(b3, (byte) (b3 | 103), b2, objArr6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize, iRed, defaultSize2, 154975793, false, (String) objArr6[0], null);
                        }
                        Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                        int i3 = ((int[]) objArr7[2])[0];
                        int i4 = ((int[]) objArr7[1])[0];
                        String[] strArr = (String[]) objArr7[3];
                        int[] iArr = {i4};
                        int iUptimeMillis = (int) SystemClock.uptimeMillis();
                        int i5 = ~iUptimeMillis;
                        int i6 = ((((-498553052) + ((897579998 | i5) * (-369))) + (((~((-826014669) | i5)) | 879016790) * (-369))) + ((((~(iUptimeMillis | 826014668)) | 71565330) | (~(i5 | (-18563209)))) * 369)) - 1435038445;
                        int i7 = (i6 << 13) ^ i6;
                        int i8 = i7 ^ (i7 >>> 17);
                        ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
                        objArr = new Object[]{new int[1], iArr, new int[]{i3}, strArr};
                    } else {
                        Object[] objArr8 = new Object[1];
                        c(new int[]{37, 16, 0, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr8);
                        Class<?> cls2 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        c(new int[]{53, 16, 0, 1}, false, new byte[]{1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1}, objArr9);
                        try {
                            Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, -1435038445};
                            byte[] bArr3 = $$d;
                            byte b4 = bArr3[54];
                            Object[] objArr11 = new Object[1];
                            d(b4, b4, bArr3[35], objArr11);
                            Class<?> cls3 = Class.forName((String) objArr11[0]);
                            byte b5 = (byte) (bArr3[54] - 1);
                            byte b6 = b5;
                            Object[] objArr12 = new Object[1];
                            d(b5, b6, (byte) (b6 | 52), objArr12);
                            objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 43042);
                                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 3111;
                                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 22;
                                byte b7 = $$a[7];
                                byte b8 = b7;
                                Object[] objArr13 = new Object[1];
                                a(b8, (byte) (b8 | 103), b7, objArr13);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(threadPriority, offsetAfter, iResolveSizeAndState, 154975793, false, (String) objArr13[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                            try {
                                Object[] objArr14 = new Object[1];
                                c(new int[]{0, 22, 37, 0}, true, new byte[]{0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr14);
                                Class<?> cls4 = Class.forName((String) objArr14[0]);
                                Object[] objArr15 = new Object[1];
                                c(new int[]{22, 15, 80, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr15);
                                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 43042);
                                    int iAlpha = Color.alpha(0) + 3111;
                                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 22;
                                    byte[] bArr4 = $$a;
                                    byte b9 = bArr4[132];
                                    Object[] objArr16 = new Object[1];
                                    a(b9, (byte) (b9 | 50), bArr4[7], objArr16);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(pressedStateDuration, iAlpha, jumpTapTimeout, -1269618118, false, (String) objArr16[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 43042);
                                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 3111;
                                    int mirror = 'F' - AndroidCharacter.getMirror('0');
                                    byte[] bArr5 = $$a;
                                    Object[] objArr17 = new Object[1];
                                    a(bArr5[132], bArr5[5], bArr5[7], objArr17);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(touchSlop, tapTimeout, mirror, -1272852037, false, (String) objArr17[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
                    int i9 = ((int[]) objArr[1])[0];
                    int i10 = ((int[]) objArr[2])[0];
                    if (i10 == i9) {
                        int i11 = ((int[]) objArr[0])[0];
                        int i12 = ((int[]) objArr[2])[0];
                        int i13 = ((int[]) objArr[1])[0];
                        String[] strArr2 = (String[]) objArr[3];
                        int[] iArr2 = {i12};
                        int[] iArr3 = {i13};
                        int iIdentityHashCode = System.identityHashCode(this);
                        int i14 = 1519091626 + (((~((-568593456) | iIdentityHashCode)) | (-1136438004)) * (-318));
                        int i15 = ~((-1136438004) | iIdentityHashCode);
                        int i16 = ~iIdentityHashCode;
                        int i17 = i11 + i14 + ((i15 | (~(1677504255 | i16))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode | 1677504255)) | (~((-1108910801) | i16))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                        int i18 = (i17 << 13) ^ i17;
                        int i19 = i18 ^ (i18 >>> 17);
                        ((int[]) objArr[0])[0] = i19 ^ (i19 << 5);
                        Object[] objArr18 = {new int[1], iArr3, iArr2, strArr2};
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr3 = (String[]) objArr[3];
                    if (strArr3 != null) {
                        for (String str : strArr3) {
                            arrayList.add(str);
                        }
                    }
                    int[] iArr4 = new int[i10];
                    int i20 = i10 - 1;
                    iArr4[i20] = 1;
                    Toast.makeText((Context) null, iArr4[((i10 * i20) % 2) - 1], 1).show();
                    int i21 = ((int[]) objArr[0])[0];
                    int i22 = ((int[]) objArr[2])[0];
                    int i23 = ((int[]) objArr[1])[0];
                    String[] strArr4 = (String[]) objArr[3];
                    int i24 = ~((int) Process.getElapsedCpuTime());
                    int i25 = i21 + (-1187763262) + ((~(1537256445 | i24)) * 52) + (((~(178269101 | i24)) | (~((-1526762358) | i24)) | 1358987344) * (-52)) + (((~(i24 | (-178269102))) | 10494088) * 52);
                    int i26 = (i25 << 13) ^ i25;
                    int i27 = i26 ^ (i26 >>> 17);
                    ((int[]) objArr[0])[0] = i27 ^ (i27 << 5);
                    Object[] objArr19 = {new int[1], new int[]{i23}, new int[]{i22}, strArr4};
                }

                private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                    int i;
                    char[] cArr;
                    int i2 = 2 % 2;
                    setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
                    int i3 = 0;
                    int i4 = iArr[0];
                    int i5 = iArr[1];
                    int i6 = iArr[2];
                    int i7 = iArr[3];
                    char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
                    long j = 0;
                    if (cArr2 != null) {
                        int length = cArr2.length;
                        char[] cArr3 = new char[length];
                        int i8 = 0;
                        while (i8 < length) {
                            try {
                                Object[] objArr2 = new Object[1];
                                objArr2[i3] = Integer.valueOf(cArr2[i8]);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                    int i9 = (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 1269;
                                    int i10 = 19 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1));
                                    byte b = (byte) i3;
                                    byte b2 = b;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop, i9, i10, 407021364, false, $$g(b, b2, (byte) (b2 + 5)), new Class[]{Integer.TYPE});
                                }
                                cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                i8++;
                                i3 = 0;
                                j = 0;
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
                    char[] cArr4 = new char[i5];
                    char c = 0;
                    System.arraycopy(cArr2, i4, cArr4, 0, i5);
                    if (bArr != null) {
                        int i11 = $10 + 17;
                        $11 = i11 % 128;
                        if (i11 % 2 == 0) {
                            cArr = new char[i5];
                            setvideostabilizationmode.b = 0;
                        } else {
                            cArr = new char[i5];
                            setvideostabilizationmode.b = 0;
                            c = 0;
                        }
                        while (setvideostabilizationmode.b < i5) {
                            int i12 = $10 + 7;
                            $11 = i12 % 128;
                            if (i12 % 2 != 0 ? bArr[setvideostabilizationmode.b] != 1 : bArr[setvideostabilizationmode.b] != 0) {
                                int i13 = setvideostabilizationmode.b;
                                try {
                                    Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        byte b3 = (byte) 0;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 29945), (ViewConfiguration.getTouchSlop() >> 8) + 1755, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22, 387247676, false, $$g(b3, b3, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } else {
                                int i14 = setvideostabilizationmode.b;
                                try {
                                    Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        byte b4 = (byte) 0;
                                        byte b5 = b4;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 3224 - TextUtils.lastIndexOf("", '0'), 13 - View.resolveSizeAndState(0, 0, 0), 2133916302, false, $$g(b4, b5, (byte) (b5 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 == null) {
                                        throw th3;
                                    }
                                    throw cause3;
                                }
                            }
                            c = cArr[setvideostabilizationmode.b];
                            Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 41241), 1705 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), Color.argb(0, 0, 0, 0) + 21, -1434471773, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        }
                        cArr4 = cArr;
                    }
                    if (i7 > 0) {
                        char[] cArr5 = new char[i5];
                        i = 0;
                        System.arraycopy(cArr4, 0, cArr5, 0, i5);
                        int i15 = i5 - i7;
                        System.arraycopy(cArr5, 0, cArr4, i15, i7);
                        System.arraycopy(cArr5, i7, cArr4, 0, i15);
                    } else {
                        i = 0;
                    }
                    if (z) {
                        char[] cArr6 = new char[i5];
                        while (true) {
                            setvideostabilizationmode.b = i;
                            if (setvideostabilizationmode.b >= i5) {
                                break;
                            }
                            int i16 = $11 + 17;
                            $10 = i16 % 128;
                            int i17 = i16 % 2;
                            cArr6[setvideostabilizationmode.b] = cArr4[(i5 - setvideostabilizationmode.b) - 1];
                            i = setvideostabilizationmode.b + 1;
                        }
                        cArr4 = cArr6;
                    }
                    if (i6 > 0) {
                        int i18 = 0;
                        while (true) {
                            setvideostabilizationmode.b = i18;
                            if (setvideostabilizationmode.b >= i5) {
                                break;
                            }
                            cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                            i18 = setvideostabilizationmode.b + 1;
                        }
                    }
                    objArr[0] = new String(cArr4);
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0024  */
                /* JADX WARN: Code duplicated, block: B:8:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static java.lang.String $$g(short r6, short r7, byte r8) {
                    /*
                        int r7 = r7 * 4
                        int r7 = 4 - r7
                        byte[] r0 = defpackage.CameraInternal.$$c
                        int r8 = 105 - r8
                        int r6 = r6 * 3
                        int r1 = r6 + 1
                        byte[] r1 = new byte[r1]
                        r2 = 0
                        if (r0 != 0) goto L15
                        r4 = r6
                        r8 = r7
                        r3 = r2
                        goto L28
                    L15:
                        r3 = r2
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L19:
                        byte r4 = (byte) r7
                        r1[r3] = r4
                        if (r3 != r6) goto L24
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        return r6
                    L24:
                        int r3 = r3 + 1
                        r4 = r0[r8]
                    L28:
                        int r4 = -r4
                        int r7 = r7 + r4
                        int r8 = r8 + 1
                        goto L19
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.CameraInternal.$$g(short, short, byte):java.lang.String");
                }
            });
            if (this.b.onTransact.getAndIncrement() > 0) {
                CameraInfoInternal cameraInfoInternal = this.b.TuitionPaymentFragmentbindingInflater1;
                Object[] objArr = new Object[0];
                if (Log.isLoggable("PlayCore", 4)) {
                    CameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "Already connected to the service.", objArr);
                }
            }
            CameraMode cameraMode2 = this.b;
            CameraFilters cameraFilters = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (cameraMode2.notify == null && !cameraMode2.f111a) {
                CameraInfoInternal cameraInfoInternal2 = cameraMode2.TuitionPaymentFragmentbindingInflater1;
                Object[] objArr2 = new Object[0];
                if (Log.isLoggable("PlayCore", 4)) {
                    CameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraInfoInternal2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "Initiate binding to the service.", objArr2);
                }
                cameraMode2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(cameraFilters);
                CameraProviderExecutionState cameraProviderExecutionState = new CameraProviderExecutionState(cameraMode2);
                cameraMode2.INotificationSideChannel = cameraProviderExecutionState;
                cameraMode2.f111a = true;
                if (!cameraMode2.b.bindService(cameraMode2.asInterface, cameraProviderExecutionState, 1)) {
                    CameraInfoInternal cameraInfoInternal3 = cameraMode2.TuitionPaymentFragmentbindingInflater1;
                    Object[] objArr3 = new Object[0];
                    if (Log.isLoggable("PlayCore", 4)) {
                        CameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraInfoInternal3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "Failed to bind to the service.", objArr3);
                    }
                    cameraMode2.f111a = false;
                    for (CameraFilters cameraFilters2 : cameraMode2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        zzu zzuVar = new zzu();
                        TaskCompletionSource taskCompletionSource2 = cameraFilters2.TuitionPaymentFragmentbindingInflater1;
                        if (taskCompletionSource2 != null) {
                            taskCompletionSource2.trySetException(zzuVar);
                        }
                    }
                    cameraMode2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.clear();
                }
            } else if (cameraMode2.f111a) {
                CameraInfoInternal cameraInfoInternal4 = cameraMode2.TuitionPaymentFragmentbindingInflater1;
                Object[] objArr4 = new Object[0];
                if (Log.isLoggable("PlayCore", 4)) {
                    CameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraInfoInternal4.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "Waiting to bind to the service.", objArr4);
                }
                cameraMode2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(cameraFilters);
            } else {
                cameraFilters.run();
            }
        }
    }
}
