package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.google.android.gms.dynamic.zag;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public final class getLifecycleCameras implements r8lambda4cDi3AAzKeyJxm5RcPVvEasZ0OY {
    private final List<unregisterLifecycle> TuitionPaymentFragmentbindingInflater1;
    private ProcessCameraProvider TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {6, 51, 46, 31};
    private static final int $$f = 180;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {81, -102, -70, -91, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 62;
    private static final byte[] $$a = {88, ByteCompanionObject.MAX_VALUE, -112, -47, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 36, 19, 4, 10, -8, 8, 0, -22, 22, 15, -11, 8, 0, 15, 0, 17, -34, 19, 4, 10, -8, 8, 0, -26, 39, -6, 11};
    private static final int $$b = 90;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f953a = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {57193, 60117, 60060, 57195, 60050, 60073, 60086, 60061, 60043, 60041, 60052, 60062, 60054, 57187, 60063, 60055, 57190, 57186, 60046, 60075, 60085, 60051, 60079, 60045, 60049, 60056, 60058, 60040, 57188, 60053, 57191, 57184, 57192, 57189, 60047, 60034};
    private static char b = 57191;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 19
            int r0 = r8 + 14
            int r6 = r6 * 6
            int r6 = r6 + 97
            byte[] r1 = defpackage.getLifecycleCameras.$$a
            int r7 = r7 * 32
            int r7 = 35 - r7
            byte[] r0 = new byte[r0]
            int r8 = r8 + 13
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L31
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L31:
            int r7 = r7 + r6
            int r6 = r7 + (-2)
            r7 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getLifecycleCameras.c(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 52
            int r0 = r6 + 1
            int r7 = r7 * 52
            int r7 = 56 - r7
            byte[] r1 = defpackage.getLifecycleCameras.$$d
            int r5 = 103 - r5
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r5
            r5 = r6
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L23:
            r4 = r1[r7]
            int r3 = r3 + 1
        L27:
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            int r7 = r7 + 1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getLifecycleCameras.d(int, int, byte, java.lang.Object[]):void");
    }

    public getLifecycleCameras(List<unregisterLifecycle> list) {
        this.TuitionPaymentFragmentbindingInflater1 = list;
    }

    @Override // defpackage.r8lambda4cDi3AAzKeyJxm5RcPVvEasZ0OY
    public final void TuitionPaymentFragmentbindingInflater1(unregisterLifecycle unregisterlifecycle) {
        int i = 2 % 2;
        int i2 = f953a + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            this.TuitionPaymentFragmentbindingInflater1.add(unregisterlifecycle);
            return;
        }
        this.TuitionPaymentFragmentbindingInflater1.add(unregisterlifecycle);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.r8lambda4cDi3AAzKeyJxm5RcPVvEasZ0OY
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ProcessCameraProvider processCameraProvider) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 41;
        f953a = i3 % 128;
        int i4 = i3 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = processCameraProvider;
        int i5 = i2 + 57;
        f953a = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // defpackage.r8lambda4cDi3AAzKeyJxm5RcPVvEasZ0OY
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = 0;
        boolean z = true;
        for (Object obj : this.TuitionPaymentFragmentbindingInflater1) {
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!((unregisterLifecycle) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
                f953a = i3 % 128;
                z = i3 % 2 == 0;
            }
            i2++;
        }
        ProcessCameraProvider processCameraProvider = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (z) {
            if (processCameraProvider != null) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
                f953a = i4 % 128;
                int i5 = i4 % 2;
                processCameraProvider.getInterfaceDescriptor();
                if (i5 != 0) {
                    return z;
                }
                throw null;
            }
        } else if (processCameraProvider != null) {
            processCameraProvider.INotificationSideChannelStubProxy();
        }
        return z;
    }

    private static void e(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = 1770390596;
        Object obj2 = null;
        if (cArr2 != null) {
            int i5 = $10 + 105;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 2267, 33 - Color.blue(0), -1927765101, false, $$g(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i7++;
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
        Object[] objArr3 = {Integer.valueOf(b)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 0;
            byte b6 = (byte) (b5 + 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 1), 2267 - (Process.myTid() >> 22), 34 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1927765101, false, $$g(b5, b6, (byte) (b6 - 3)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i8 = $11 + 125;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
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
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 49267), (ViewConfiguration.getEdgeSlop() >> 16) + 3261, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30, -127612708, false, $$g(b7, b8, (byte) (b8 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - ExpandableListView.getPackedPositionGroup(0L)), TextUtils.indexOf((CharSequence) "", '0') + 595, ImageFormat.getBitsPerPixel(0) + 18, 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i9 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i9];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i10 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i10];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                        } else {
                            int i12 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i12];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        for (int i14 = 0; i14 < i; i14++) {
            int i15 = $10 + 111;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            cArr4[i14] = (char) (cArr4[i14] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0acc  */
    /* JADX WARN: Code duplicated, block: B:135:0x0792 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x089c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x089c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x089c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x089c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x089c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:55:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:61:0x0621  */
    /* JADX WARN: Code duplicated, block: B:66:0x0652  */
    /* JADX WARN: Code duplicated, block: B:70:0x0680 A[PHI: r0
  0x0680: PHI (r0v104 java.lang.Object[]) = (r0v103 java.lang.Object[]), (r0v164 java.lang.Object[]) binds: [B:69:0x067e, B:64:0x064f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x068b  */
    /* JADX WARN: Code duplicated, block: B:74:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:83:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x0848 A[Catch: all -> 0x0ae0, TryCatch #0 {all -> 0x0ae0, blocks: (B:85:0x0831, B:87:0x0848, B:88:0x0885, B:100:0x0901, B:102:0x090e, B:103:0x0955, B:105:0x0974, B:107:0x09c4), top: B:130:0x0831 }] */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(List list) throws Throwable {
        int i;
        int i2;
        int i3;
        String string;
        Method method;
        int i4;
        Object[] objArr;
        int i5;
        char[] cArr;
        int i6;
        int i7;
        int i8;
        Class cls;
        Class<?> cls2;
        Object[] objArr2;
        Class<?> cls3;
        char[] cArr2;
        byte b2;
        int iIndexOf;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Object[] objArr3;
        int i16;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Object[] objArr4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i23 = 2;
        int i24 = 2 % 2;
        byte[] bArr = $$a;
        byte b3 = bArr[28];
        byte b4 = bArr[13];
        int i25 = 1;
        Object[] objArr5 = new Object[1];
        c(b3, b4, b4, objArr5);
        int i26 = 0;
        Class<?> cls4 = Class.forName((String) objArr5[0]);
        byte b5 = bArr[13];
        byte b6 = bArr[28];
        Object[] objArr6 = new Object[1];
        c(b5, b6, b6, objArr6);
        Method method2 = cls4.getMethod((String) objArr6[0], String.class, Integer.TYPE);
        Class<?> cls5 = Class.forName("android.app.ApplicationPackageManager");
        byte b7 = bArr[13];
        byte b8 = bArr[28];
        Object[] objArr7 = new Object[1];
        c(b7, b8, b8, objArr7);
        Method[] methodArr = {method2, cls5.getMethod((String) objArr7[0], String.class, Integer.TYPE)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 2823;
            int bitsPerPixel = 21 - ImageFormat.getBitsPerPixel(0);
            byte[] bArr2 = $$d;
            byte b9 = bArr2[54];
            byte b10 = (byte) (-bArr2[5]);
            Object[] objArr8 = new Object[1];
            d(b9, b10, b10, objArr8);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup, iMakeMeasureSpec, bitsPerPixel, 1814927978, false, (String) objArr8[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            int i27 = f953a;
            int i28 = (i27 & 43) + (i27 | 43);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i28 % 128;
            int i29 = i28 % 2;
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.indexOf("", "", 0, 0), 2822 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getTouchSlop() >> 8) + 22)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i30 = f953a;
            int i31 = (i30 ^ 61) + ((i30 & 61) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i31 % 128;
            int i32 = i31 % 2;
            int i33 = 0;
            while (i33 < length) {
                int i34 = f953a + 87;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i34 % 128;
                if (i34 % i23 != 0) {
                    method = declaredMethods[i33];
                    int i35 = 72 / i26;
                } else {
                    method = declaredMethods[i33];
                }
                try {
                    int i36 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    Object[] objArr9 = new Object[i25];
                    e(new char[]{25, 27, 20, 29, 3, '\r', 27, 24, 3, 2, '\n', 6, '\t', '\r', 7, 29, 31, 4, 7, 6, '!', 22, '\b', 16}, (byte) ((i36 & 30) + (i36 | 30)), 23 - (~Color.red(i26)), objArr9);
                    Class<?> cls6 = Class.forName((String) objArr9[i26]);
                    char[] cArr3 = {5, '\b', 30, '\n', '\b', 16, 1, '\n', 5, '\n', 15, '!'};
                    int i37 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i38 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i39 = ((i38 | 11) << 1) - (i38 ^ 11);
                    int i40 = i39 % 128;
                    f953a = i40;
                    int i41 = i39 % i23;
                    int i42 = (i37 * 677) - 12150;
                    int i43 = (i37 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i37 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                    int i44 = ((i43 ^ (-19)) | (i43 & (-19))) * (-676);
                    int i45 = ((i42 | i44) << 1) - (i44 ^ i42);
                    int i46 = ~(((-19) ^ i37) | ((-19) & i37));
                    int i47 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                    int i48 = i40 + 117;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i48 % 128;
                    if (i48 % i23 != 0) {
                        int i49 = ~((i47 ^ i37) | (i47 & i37));
                        int i50 = i45 % (676 % ((i46 ^ i49) | (i49 & i46)));
                        int i51 = ~i37;
                        int i52 = ~((i51 & (-19)) | (i51 ^ (-19)));
                        int i53 = ~(((-19) ^ i47) | ((-19) & i47));
                        int i54 = (i52 & i53) | (i52 ^ i53);
                        int i55 = (i37 ^ 18) | (i37 & 18);
                        int i56 = ~((i55 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i55 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                        i4 = i50 / (676 << ((i54 & i56) | (i54 ^ i56)));
                    } else {
                        int i57 = ~((i47 ^ i37) | (i47 & i37));
                        int i58 = -(-(((i46 ^ i57) | (i57 & i46)) * 676));
                        int i59 = (i45 & i58) + (i45 | i58);
                        int i60 = ~((~i37) | (-19));
                        int i61 = ~(((-19) ^ i47) | ((-19) & i47));
                        int i62 = (i60 & i61) | (i60 ^ i61);
                        int i63 = (i37 ^ 18) | (i37 & 18);
                        int i64 = ~((i63 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i63 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                        i4 = (i59 - (~(-(-(((i62 & i64) | (i62 ^ i64)) * 676))))) - 1;
                    }
                    int i65 = i40 + 109;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i65 % 128;
                    byte b11 = (byte) i4;
                    if (i65 % i23 != 0) {
                        Object[] objArr10 = new Object[1];
                        e(cArr3, b11, 21 - (~(ViewConfiguration.getKeyRepeatDelay() / 9)), objArr10);
                        objArr = new Object[0];
                        objArr[0] = Integer.valueOf(((Integer) cls6.getMethod((String) objArr10[0], null).invoke(method, null)).intValue());
                        cArr = new char[]{25, 27, 20, 29, 3, '\r', 27, 24, 3, 2, '\n', 6, '\t', '\r', 7, 29, 31, 4, 7, 11, 16, 2, '\n', 1, 6, '\n'};
                        i6 = 67;
                        i5 = 0;
                    } else {
                        Object[] objArr11 = new Object[1];
                        e(cArr3, b11, 11 - (~(ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr11);
                        int iIntValue = ((Integer) cls6.getMethod((String) objArr11[0], null).invoke(method, null)).intValue();
                        i5 = 0;
                        objArr = new Object[]{Integer.valueOf(iIntValue)};
                        cArr = new char[]{25, 27, 20, 29, 3, '\r', 27, 24, 3, 2, '\n', 6, '\t', '\r', 7, 29, 31, 4, 7, 11, 16, 2, '\n', 1, 6, '\n'};
                        i6 = 83;
                    }
                    int iIndexOf2 = TextUtils.indexOf("", "", i5);
                    byte b12 = (byte) (((i6 | iIndexOf2) << 1) - (i6 ^ iIndexOf2));
                    int iIndexOf3 = TextUtils.indexOf("", "");
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i66 = (iIndexOf3 * (-721)) - 18746;
                    int i67 = f953a + 11;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i67 % 128;
                    if (i67 % i23 != 0) {
                        int i68 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                        int i69 = ~iIndexOf3;
                        int i70 = ~((i69 ^ (-27)) | (i69 & (-27)));
                        int i71 = (i68 ^ i70) | (i68 & i70);
                        int i72 = ~(iIndexOf3 | 26);
                        i7 = i66 * (1444 >> ((i71 ^ i72) | (i71 & i72)));
                        int i73 = ~((iIndexOf3 ^ 26) | (iIndexOf3 & 26));
                        int i74 = ~((iIndexOf3 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (iIndexOf3 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                        i8 = (i73 & i74) | (i73 ^ i74);
                    } else {
                        int i75 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                        int i76 = ~iIndexOf3;
                        int i77 = ~((i76 ^ (-27)) | (i76 & (-27)));
                        int i78 = (i75 ^ i77) | (i75 & i77);
                        int i79 = (iIndexOf3 ^ 26) | (iIndexOf3 & 26);
                        int i80 = -(-(((~i79) | i78) * 1444));
                        i7 = ((i66 | i80) << 1) - (i80 ^ i66);
                        int i81 = ~i79;
                        int i82 = ~((iIndexOf3 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (iIndexOf3 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                        i8 = (i81 ^ i82) | (i81 & i82);
                    }
                    int i83 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault6 | 26);
                    int i84 = (-1444) * ((i83 & i8) | (i8 ^ i83));
                    int i85 = ((i7 | i84) << 1) - (i84 ^ i7);
                    int i86 = ~iIndexOf3;
                    int i87 = ~((i86 & 26) | (i86 ^ 26));
                    int i88 = ~(iIndexOf3 | (-27));
                    int i89 = ((i88 & i87) | (i87 ^ i88)) * 722;
                    int i90 = (i85 ^ i89) + ((i85 & i89) << 1);
                    Object[] objArr12 = new Object[1];
                    e(cArr, b12, i90, objArr12);
                    Class<?> cls7 = Class.forName((String) objArr12[0]);
                    char[] cArr4 = {3, 28, 26, ' ', 4, '\n', 29, 17};
                    int gidForName = Process.getGidForName("");
                    int i91 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i92 = (i91 ^ 71) + ((i91 & 71) << 1);
                    f953a = i92 % 128;
                    if (i92 % 2 == 0) {
                        Object[] objArr13 = new Object[1];
                        e(cArr4, (byte) (58 << gidForName), 115 / (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr13);
                        String str = (String) objArr13[0];
                        Class<?>[] clsArr = new Class[1];
                        clsArr[1] = Integer.TYPE;
                        if (((Boolean) cls7.getMethod(str, clsArr).invoke(null, objArr)).booleanValue()) {
                            cls = Long.TYPE;
                            Object[] objArr14 = new Object[1];
                            e(new char[]{25, 27, 20, 29, 3, '\r', 27, 24, 3, 2, '\n', 6, '\t', '\r', 7, 29, 31, 4, 7, 6, '!', 22, '\b', 16}, (byte) (29 - (~Process.getGidForName(""))), 23 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr14);
                            cls2 = Class.forName((String) objArr14[0]);
                            int i93 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i94 = (i93 ^ 73) + ((i93 & 73) << 1);
                            f953a = i94 % 128;
                            int i95 = i94 % 2;
                            char[] cArr5 = {5, '\b', '#', 4, '\n', '#', 21, 6, 28, 23, ' ', 11, 13825};
                            int i96 = -ImageFormat.getBitsPerPixel(0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i97 = (i96 * (-337)) + 339;
                            int i98 = f953a;
                            int i99 = i98 + 47;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i99 % 128;
                            int i100 = i99 % 2;
                            int i101 = ~i96;
                            int i102 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                            int i103 = ~((i101 ^ i102) | (i101 & i102));
                            int i104 = ~(((-2) ^ i96) | ((-2) & i96));
                            int i105 = -(-((-338) * ((i103 ^ i104) | (i103 & i104) | (~((i96 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i96 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7))))));
                            int i106 = (i97 ^ i105) + ((i97 & i105) << 1);
                            int i107 = (i98 ^ 63) + ((i98 & 63) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i107 % 128;
                            int i108 = i107 % 2;
                            int i109 = ~i96;
                            int i110 = 338 * (~((i109 ^ 1) | (i109 & 1)));
                            int i111 = (i106 & i110) + (i110 | i106);
                            int i112 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                            int i113 = ~((i109 & i112) | (i109 ^ i112));
                            zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i114 = ~((i96 & 1) | (i96 ^ 1) | iTuitionPaymentFragmentspecialinlinedviewModeldefault7);
                            byte b13 = (byte) ((i111 - (~(338 * ((i114 & i113) | (i113 ^ i114))))) - 1);
                            int i115 = -TextUtils.getOffsetAfter("", 0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i116 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                            int i117 = ~((i116 ^ 13) | (i116 & 13));
                            int i118 = ((((i115 * 165) - 2119) + (((i115 ^ i117) | (i117 & i115)) * (-328))) - (~(-(-(((i115 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i115 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8)) * 164))))) - 1;
                            int i119 = ~i115;
                            int i120 = (~(((-14) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | ((-14) & iTuitionPaymentFragmentspecialinlinedviewModeldefault8))) | (~((i119 ^ (-14)) | (i119 & (-14))));
                            int i121 = (i115 & i116) | (i116 ^ i115);
                            int i122 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
                            f953a = i122 % 128;
                            int i123 = i122 % 2;
                            int i124 = ~((i121 & 13) | (i121 ^ 13));
                            int i125 = 164 * ((i124 & i120) | (i120 ^ i124));
                            int i126 = ((i118 | i125) << 1) - (i125 ^ i118);
                            objArr2 = new Object[1];
                            e(cArr5, b13, i126, objArr2);
                            if (!cls.equals(cls2.getMethod((String) objArr2[0], null).invoke(method, null))) {
                                continue;
                            } else {
                                int i127 = -View.MeasureSpec.getMode(0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i128 = i127 * TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                                int i129 = (i128 ^ 14587) + ((i128 & 14587) << 1);
                                int i130 = (i127 ^ 29) | (i127 & 29);
                                int i131 = -(-(i130 * (-502)));
                                int i132 = (i129 & i131) + (i129 | i131);
                                int i133 = ~i127;
                                int i134 = ~((i133 ^ (-30)) | (i133 & (-30)));
                                int i135 = ~i127;
                                int i136 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                int i137 = ~((i135 & i136) | (i135 ^ i136));
                                int i138 = (i137 & i134) | (i134 ^ i137);
                                int i139 = ~(i130 | iTuitionPaymentFragmentspecialinlinedviewModeldefault9);
                                int i140 = ((i138 & i139) | (i138 ^ i139)) * (-502);
                                int i141 = (i132 ^ i140) + ((i140 & i132) << 1);
                                int i142 = (i133 ^ i136) | (i133 & i136);
                                int i143 = ~((i142 & 29) | (i142 ^ 29));
                                int i144 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault9 & i130) | (i130 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                                int i145 = ((i143 & i144) | (i143 ^ i144)) * TypedValues.PositionType.TYPE_DRAWPATH;
                                byte b14 = (byte) (((i141 | i145) << 1) - (i145 ^ i141));
                                int trimmedLength = TextUtils.getTrimmedLength("");
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i146 = (trimmedLength * (-432)) + 10416;
                                int i147 = ~trimmedLength;
                                int i148 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | i147;
                                int i149 = -(-((~((i148 & 24) | (i148 ^ 24))) * 433));
                                int i150 = ((i146 | i149) << 1) - (i146 ^ i149);
                                int i151 = ~trimmedLength;
                                int i152 = ~(((-25) & iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | ((-25) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                int i153 = i150 + (((i151 & i152) | (i151 ^ i152)) * (-433)) + (((~((trimmedLength & 24) | (trimmedLength ^ 24))) | (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault10 & i147) | (i147 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10)))) * 433);
                                Object[] objArr15 = new Object[1];
                                e(new char[]{25, 27, 20, 29, 3, '\r', 27, 24, 3, 2, '\n', 6, '\t', '\r', 7, 29, 31, 4, 7, 6, '!', 22, '\b', 16}, b14, i153, objArr15);
                                cls3 = Class.forName((String) objArr15[0]);
                                cArr2 = new char[]{5, '\b', 31, 22, 27, '\b', 24, 14, '\n', '#', 6, '\n', 23, Typography.quote, '\t', 6, 13902};
                                int i154 = -TextUtils.lastIndexOf("", '0', 0, 0);
                                b2 = (byte) ((i154 ^ 100) + ((i154 & 100) << 1));
                                iIndexOf = TextUtils.indexOf("", "", 0);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i155 = iIndexOf * 522;
                                i9 = ((i155 | (-8840)) << 1) - (i155 ^ (-8840));
                                i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
                                int i156 = i10 % 128;
                                f953a = i156;
                                if (i10 % 2 == 0) {
                                    int i157 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | 17);
                                    int i158 = (i157 & iIndexOf) | (iIndexOf ^ i157);
                                    int i159 = -(-((i158 ^ (-1042)) + ((i158 & (-1042)) << 1)));
                                    int i160 = (i9 & i159) + (i159 | i9);
                                    int i161 = -((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 17) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 17));
                                    i11 = i160 / ((i161 ^ 521) + ((i161 & 521) << 1));
                                    i13 = ~iIndexOf;
                                    i12 = ~((i13 ^ (-18)) | (i13 & (-18)));
                                } else {
                                    int i162 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i163 = ~((i162 & 17) | (i162 ^ 17));
                                    int i164 = -(-(((i163 & iIndexOf) | (iIndexOf ^ i163)) * (-1042)));
                                    int i165 = (i9 ^ i164) + ((i164 & i9) << 1);
                                    int i166 = ((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 17) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 17)) * 521;
                                    i11 = (i165 ^ i166) + ((i166 & i165) << 1);
                                    int i167 = ~iIndexOf;
                                    i12 = ~((i167 & (-18)) | (i167 ^ (-18)));
                                    i13 = ~iIndexOf;
                                }
                                int i168 = ((i156 | 115) << 1) - (i156 ^ 115);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i168 % 128;
                                i14 = i168 % 2;
                                i15 = ~((i13 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i13 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                if (i14 != 0) {
                                    int i169 = (i15 & i12) | (i12 ^ i15);
                                    int i170 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i171 = (i170 & iIndexOf) | (i170 ^ iIndexOf);
                                    int i172 = ~((i171 & 17) | (i171 ^ 17));
                                    Object[] objArr16 = new Object[1];
                                    e(cArr2, b2, i11 - (521 >>> ((i172 & i169) | (i169 ^ i172))), objArr16);
                                    objArr3 = (Object[]) cls3.getMethod((String) objArr16[0], null).invoke(method, null);
                                    if (objArr3.length == 2) {
                                        continue;
                                    } else if (Long.TYPE.equals(objArr3[0])) {
                                        int i173 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
                                        f953a = i173 % 128;
                                        int i174 = i173 % 2;
                                        char[] cArr6 = {25, 27, 20, 29, 3, '\r', 27, 24, 3, 2, '\n', 6, '\t', '\r', 7, 29, 31, 4, 7, 6, '!', 22, '\b', 16};
                                        i16 = -View.MeasureSpec.getMode(0);
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                        int i175 = (i16 * (-574)) - 16646;
                                        i17 = ~i16;
                                        i18 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        int i176 = ~(i17 | i18);
                                        i19 = (-30) | iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        int i177 = ~i19;
                                        int i178 = ((i176 ^ i177) | (i176 & i177)) * 1150;
                                        i20 = ((i175 | i178) << 1) - (i175 ^ i178);
                                        i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                                        f953a = i21 % 128;
                                        if (i21 % 2 == 0) {
                                            int i179 = ~i19;
                                            int i180 = ~((i18 ^ 29) | (i18 & 29));
                                            i22 = i20 << ((-575) % ((i179 & i180) | (i179 ^ i180)));
                                            i17 = ~i16;
                                        } else {
                                            int i181 = ~(((-30) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-30) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                            int i182 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                            int i183 = ~((i182 ^ 29) | (i182 & 29));
                                            int i184 = -(-(((i181 ^ i183) | (i181 & i183)) * (-575)));
                                            i22 = ((i20 | i184) << 1) - (i184 ^ i20);
                                        }
                                        int i185 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault4 | i17);
                                        int i186 = ~((i16 & i18) | (i18 ^ i16));
                                        byte b15 = (byte) ((i22 - (~(-(-(575 * ((i186 & i185) | (i185 ^ i186))))))) - 1);
                                        char mirror = AndroidCharacter.getMirror('0');
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                        int i187 = (mirror * 65369) + 4008;
                                        int i188 = ~mirror;
                                        int i189 = ~((i188 ^ 23) | (i188 & 23));
                                        int i190 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                        int i191 = ~((23 ^ i190) | (i190 & 23));
                                        int i192 = -(-(((i189 & i191) | (i189 ^ i191)) * 168));
                                        int i193 = (i187 ^ i192) + ((i187 & i192) << 1);
                                        int i194 = ~mirror;
                                        int i195 = (i194 & 23) | (i194 ^ 23);
                                        int i196 = -(-((~((i195 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (i195 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11))) * 168));
                                        int i197 = ((i193 | i196) << 1) - (i196 ^ i193);
                                        int i198 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                        int i199 = ~((i198 & i188) | (i188 ^ i198));
                                        int i200 = ~((i188 & (-24)) | (i188 ^ (-24)));
                                        int i201 = (i199 & i200) | (i199 ^ i200);
                                        int i202 = (mirror & 23) | (23 ^ mirror);
                                        int i203 = ~((i202 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (i202 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                                        int i204 = ((i203 & i201) | (i201 ^ i203)) * 168;
                                        objArr4 = new Object[1];
                                        e(cArr6, b15, (i197 & i204) + (i204 | i197), objArr4);
                                        if (Class.forName((String) objArr4[0]).equals(objArr3[1])) {
                                            int i205 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
                                            f953a = i205 % 128;
                                            int i206 = i205 % 2;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2823;
                                                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 22;
                                                byte[] bArr3 = $$d;
                                                byte b16 = bArr3[54];
                                                byte b17 = (byte) (-bArr3[5]);
                                                Object[] objArr17 = new Object[1];
                                                d(b16, b17, b17, objArr17);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, maximumFlingVelocity, iKeyCodeFromString, 1814927978, false, (String) objArr17[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cResolveSize = (char) View.resolveSize(0, 0);
                                                int keyRepeatTimeout = 2823 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                int i207 = 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                byte[] bArr4 = $$d;
                                                byte b18 = bArr4[54];
                                                byte b19 = (byte) (-bArr4[5]);
                                                Object[] objArr18 = new Object[1];
                                                d(b18, b19, b19, objArr18);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize, keyRepeatTimeout, i207, 1814927978, false, (String) objArr18[0], null);
                                            }
                                            try {
                                                Object[] objArr19 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                    int iAlpha = Color.alpha(0) + 2823;
                                                    int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22;
                                                    byte b20 = $$d[7];
                                                    byte b21 = b20;
                                                    Object[] objArr20 = new Object[1];
                                                    d(b20, b21, b21, objArr20);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength, iAlpha, keyRepeatTimeout2, -2137287382, false, (String) objArr20[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr19)).longValue();
                                                int i208 = f953a + 77;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i208 % 128;
                                                int i209 = i208 % 2;
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
                                    int i210 = i15 | i12;
                                    int i211 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | iIndexOf;
                                    int i212 = ~((i211 & 17) | (i211 ^ 17));
                                    int i213 = 521 * ((i212 & i210) | (i210 ^ i212));
                                    Object[] objArr21 = new Object[1];
                                    e(cArr2, b2, ((i11 | i213) << 1) - (i11 ^ i213), objArr21);
                                    objArr3 = (Object[]) cls3.getMethod((String) objArr21[0], null).invoke(method, null);
                                    if (objArr3.length == 2) {
                                        continue;
                                    } else if (Long.TYPE.equals(objArr3[0])) {
                                        int i1710 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
                                        f953a = i1710 % 128;
                                        int i1711 = i1710 % 2;
                                        char[] cArr7 = {25, 27, 20, 29, 3, '\r', 27, 24, 3, 2, '\n', 6, '\t', '\r', 7, 29, 31, 4, 7, 6, '!', 22, '\b', 16};
                                        i16 = -View.MeasureSpec.getMode(0);
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                        int i1712 = (i16 * (-574)) - 16646;
                                        i17 = ~i16;
                                        i18 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        int i1713 = ~(i17 | i18);
                                        i19 = (-30) | iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        int i1714 = ~i19;
                                        int i1715 = ((i1713 ^ i1714) | (i1713 & i1714)) * 1150;
                                        i20 = ((i1712 | i1715) << 1) - (i1712 ^ i1715);
                                        i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                                        f953a = i21 % 128;
                                        if (i21 % 2 == 0) {
                                            int i1716 = ~i19;
                                            int i1810 = ~((i18 ^ 29) | (i18 & 29));
                                            i22 = i20 << ((-575) % ((i1716 & i1810) | (i1716 ^ i1810)));
                                            i17 = ~i16;
                                        } else {
                                            int i1811 = ~(((-30) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-30) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                            int i1812 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                            int i1813 = ~((i1812 ^ 29) | (i1812 & 29));
                                            int i1814 = -(-(((i1811 ^ i1813) | (i1811 & i1813)) * (-575)));
                                            i22 = ((i20 | i1814) << 1) - (i1814 ^ i20);
                                        }
                                        int i1815 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault4 | i17);
                                        int i1816 = ~((i16 & i18) | (i18 ^ i16));
                                        byte b110 = (byte) ((i22 - (~(-(-(575 * ((i1816 & i1815) | (i1815 ^ i1816))))))) - 1);
                                        char mirror2 = AndroidCharacter.getMirror('0');
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                        int i1817 = (mirror2 * 65369) + 4008;
                                        int i1818 = ~mirror2;
                                        int i1819 = ~((i1818 ^ 23) | (i1818 & 23));
                                        int i1910 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                        int i1911 = ~((23 ^ i1910) | (i1910 & 23));
                                        int i1912 = -(-(((i1819 & i1911) | (i1819 ^ i1911)) * 168));
                                        int i1913 = (i1817 ^ i1912) + ((i1817 & i1912) << 1);
                                        int i1914 = ~mirror2;
                                        int i1915 = (i1914 & 23) | (i1914 ^ 23);
                                        int i1916 = -(-((~((i1915 & iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (i1915 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12))) * 168));
                                        int i1917 = ((i1913 | i1916) << 1) - (i1916 ^ i1913);
                                        int i1918 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                        int i1919 = ~((i1918 & i1818) | (i1818 ^ i1918));
                                        int i2010 = ~((i1818 & (-24)) | (i1818 ^ (-24)));
                                        int i2011 = (i1919 & i2010) | (i1919 ^ i2010);
                                        int i2012 = (mirror2 & 23) | (23 ^ mirror2);
                                        int i2013 = ~((i2012 & iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (i2012 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
                                        int i2014 = ((i2013 & i2011) | (i2011 ^ i2013)) * 168;
                                        objArr4 = new Object[1];
                                        e(cArr7, b110, (i1917 & i2014) + (i2014 | i1917), objArr4);
                                        if (Class.forName((String) objArr4[0]).equals(objArr3[1])) {
                                            int i2015 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
                                            f953a = i2015 % 128;
                                            int i2016 = i2015 % 2;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                                int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2823;
                                                int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 22;
                                                byte[] bArr5 = $$d;
                                                byte b111 = bArr5[54];
                                                byte b112 = (byte) (-bArr5[5]);
                                                Object[] objArr110 = new Object[1];
                                                d(b111, b112, b112, objArr110);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf2, maximumFlingVelocity2, iKeyCodeFromString2, 1814927978, false, (String) objArr110[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cResolveSize2 = (char) View.resolveSize(0, 0);
                                                int keyRepeatTimeout3 = 2823 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                int i2017 = 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                byte[] bArr6 = $$d;
                                                byte b113 = bArr6[54];
                                                byte b114 = (byte) (-bArr6[5]);
                                                Object[] objArr111 = new Object[1];
                                                d(b113, b114, b114, objArr111);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize2, keyRepeatTimeout3, i2017, 1814927978, false, (String) objArr111[0], null);
                                            }
                                            Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                int iAlpha2 = Color.alpha(0) + 2823;
                                                int keyRepeatTimeout4 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22;
                                                byte b22 = $$d[7];
                                                byte b23 = b22;
                                                Object[] objArr22 = new Object[1];
                                                d(b22, b23, b23, objArr22);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength2, iAlpha2, keyRepeatTimeout4, -2137287382, false, (String) objArr22[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
                                            int i2018 = f953a + 77;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2018 % 128;
                                            int i2019 = i2018 % 2;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        int i214 = -gidForName;
                        Object[] objArr23 = new Object[1];
                        e(cArr4, (byte) ((i214 ^ 58) + ((i214 & 58) << 1)), 9 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr23);
                        if (((Boolean) cls7.getMethod((String) objArr23[0], Integer.TYPE).invoke(null, objArr)).booleanValue()) {
                            cls = Long.TYPE;
                            Object[] objArr113 = new Object[1];
                            e(new char[]{25, 27, 20, 29, 3, '\r', 27, 24, 3, 2, '\n', 6, '\t', '\r', 7, 29, 31, 4, 7, 6, '!', 22, '\b', 16}, (byte) (29 - (~Process.getGidForName(""))), 23 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr113);
                            cls2 = Class.forName((String) objArr113[0]);
                            int i910 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i911 = (i910 ^ 73) + ((i910 & 73) << 1);
                            f953a = i911 % 128;
                            int i912 = i911 % 2;
                            char[] cArr8 = {5, '\b', '#', 4, '\n', '#', 21, 6, 28, 23, ' ', 11, 13825};
                            int i913 = -ImageFormat.getBitsPerPixel(0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i914 = (i913 * (-337)) + 339;
                            int i915 = f953a;
                            int i916 = i915 + 47;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i916 % 128;
                            int i1010 = i916 % 2;
                            int i1011 = ~i913;
                            int i1012 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                            int i1013 = ~((i1011 ^ i1012) | (i1011 & i1012));
                            int i1014 = ~(((-2) ^ i913) | ((-2) & i913));
                            int i1015 = -(-((-338) * ((i1013 ^ i1014) | (i1013 & i1014) | (~((i913 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13) | (i913 & iTuitionPaymentFragmentspecialinlinedviewModeldefault13))))));
                            int i1016 = (i914 ^ i1015) + ((i914 & i1015) << 1);
                            int i1017 = (i915 ^ 63) + ((i915 & 63) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1017 % 128;
                            int i1018 = i1017 % 2;
                            int i1019 = ~i913;
                            int i1110 = 338 * (~((i1019 ^ 1) | (i1019 & 1)));
                            int i1111 = (i1016 & i1110) + (i1110 | i1016);
                            int i1112 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                            int i1113 = ~((i1019 & i1112) | (i1019 ^ i1112));
                            zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i1114 = ~((i913 & 1) | (i913 ^ 1) | iTuitionPaymentFragmentspecialinlinedviewModeldefault13);
                            byte b115 = (byte) ((i1111 - (~(338 * ((i1114 & i1113) | (i1113 ^ i1114))))) - 1);
                            int i1115 = -TextUtils.getOffsetAfter("", 0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i1116 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                            int i1117 = ~((i1116 ^ 13) | (i1116 & 13));
                            int i1118 = ((((i1115 * 165) - 2119) + (((i1115 ^ i1117) | (i1117 & i1115)) * (-328))) - (~(-(-(((i1115 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault14) | (i1115 & iTuitionPaymentFragmentspecialinlinedviewModeldefault14)) * 164))))) - 1;
                            int i1119 = ~i1115;
                            int i1210 = (~(((-14) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault14) | ((-14) & iTuitionPaymentFragmentspecialinlinedviewModeldefault14))) | (~((i1119 ^ (-14)) | (i1119 & (-14))));
                            int i1211 = (i1115 & i1116) | (i1116 ^ i1115);
                            int i1212 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
                            f953a = i1212 % 128;
                            int i1213 = i1212 % 2;
                            int i1214 = ~((i1211 & 13) | (i1211 ^ 13));
                            int i1215 = 164 * ((i1214 & i1210) | (i1210 ^ i1214));
                            int i1216 = ((i1118 | i1215) << 1) - (i1215 ^ i1118);
                            objArr2 = new Object[1];
                            e(cArr8, b115, i1216, objArr2);
                            if (!cls.equals(cls2.getMethod((String) objArr2[0], null).invoke(method, null))) {
                                continue;
                            } else {
                                int i1217 = -View.MeasureSpec.getMode(0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault15 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i1218 = i1217 * TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                                int i1219 = (i1218 ^ 14587) + ((i1218 & 14587) << 1);
                                int i1310 = (i1217 ^ 29) | (i1217 & 29);
                                int i1311 = -(-(i1310 * (-502)));
                                int i1312 = (i1219 & i1311) + (i1219 | i1311);
                                int i1313 = ~i1217;
                                int i1314 = ~((i1313 ^ (-30)) | (i1313 & (-30)));
                                int i1315 = ~i1217;
                                int i1316 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault15;
                                int i1317 = ~((i1315 & i1316) | (i1315 ^ i1316));
                                int i1318 = (i1317 & i1314) | (i1314 ^ i1317);
                                int i1319 = ~(i1310 | iTuitionPaymentFragmentspecialinlinedviewModeldefault15);
                                int i1410 = ((i1318 & i1319) | (i1318 ^ i1319)) * (-502);
                                int i1411 = (i1312 ^ i1410) + ((i1410 & i1312) << 1);
                                int i1412 = (i1313 ^ i1316) | (i1313 & i1316);
                                int i1413 = ~((i1412 & 29) | (i1412 ^ 29));
                                int i1414 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault15 & i1310) | (i1310 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15));
                                int i1415 = ((i1413 & i1414) | (i1413 ^ i1414)) * TypedValues.PositionType.TYPE_DRAWPATH;
                                byte b116 = (byte) (((i1411 | i1415) << 1) - (i1415 ^ i1411));
                                int trimmedLength2 = TextUtils.getTrimmedLength("");
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault16 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i1416 = (trimmedLength2 * (-432)) + 10416;
                                int i1417 = ~trimmedLength2;
                                int i1418 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault16) | i1417;
                                int i1419 = -(-((~((i1418 & 24) | (i1418 ^ 24))) * 433));
                                int i1510 = ((i1416 | i1419) << 1) - (i1416 ^ i1419);
                                int i1511 = ~trimmedLength2;
                                int i1512 = ~(((-25) & iTuitionPaymentFragmentspecialinlinedviewModeldefault16) | ((-25) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault16));
                                int i1513 = i1510 + (((i1511 & i1512) | (i1511 ^ i1512)) * (-433)) + (((~((trimmedLength2 & 24) | (trimmedLength2 ^ 24))) | (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault16 & i1417) | (i1417 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault16)))) * 433);
                                Object[] objArr114 = new Object[1];
                                e(new char[]{25, 27, 20, 29, 3, '\r', 27, 24, 3, 2, '\n', 6, '\t', '\r', 7, 29, 31, 4, 7, 6, '!', 22, '\b', 16}, b116, i1513, objArr114);
                                cls3 = Class.forName((String) objArr114[0]);
                                cArr2 = new char[]{5, '\b', 31, 22, 27, '\b', 24, 14, '\n', '#', 6, '\n', 23, Typography.quote, '\t', 6, 13902};
                                int i1514 = -TextUtils.lastIndexOf("", '0', 0, 0);
                                b2 = (byte) ((i1514 ^ 100) + ((i1514 & 100) << 1));
                                iIndexOf = TextUtils.indexOf("", "", 0);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i1515 = iIndexOf * 522;
                                i9 = ((i1515 | (-8840)) << 1) - (i1515 ^ (-8840));
                                i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
                                int i1516 = i10 % 128;
                                f953a = i1516;
                                if (i10 % 2 == 0) {
                                    int i1517 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | 17);
                                    int i1518 = (i1517 & iIndexOf) | (iIndexOf ^ i1517);
                                    int i1519 = -(-((i1518 ^ (-1042)) + ((i1518 & (-1042)) << 1)));
                                    int i1610 = (i9 & i1519) + (i1519 | i9);
                                    int i1611 = -((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 17) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 17));
                                    i11 = i1610 / ((i1611 ^ 521) + ((i1611 & 521) << 1));
                                    i13 = ~iIndexOf;
                                    i12 = ~((i13 ^ (-18)) | (i13 & (-18)));
                                } else {
                                    int i1612 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i1613 = ~((i1612 & 17) | (i1612 ^ 17));
                                    int i1614 = -(-(((i1613 & iIndexOf) | (iIndexOf ^ i1613)) * (-1042)));
                                    int i1615 = (i9 ^ i1614) + ((i1614 & i9) << 1);
                                    int i1616 = ((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 17) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 17)) * 521;
                                    i11 = (i1615 ^ i1616) + ((i1616 & i1615) << 1);
                                    int i1617 = ~iIndexOf;
                                    i12 = ~((i1617 & (-18)) | (i1617 ^ (-18)));
                                    i13 = ~iIndexOf;
                                }
                                int i1618 = ((i1516 | 115) << 1) - (i1516 ^ 115);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1618 % 128;
                                i14 = i1618 % 2;
                                i15 = ~((i13 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i13 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                if (i14 != 0) {
                                    int i1619 = (i15 & i12) | (i12 ^ i15);
                                    int i1717 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i1718 = (i1717 & iIndexOf) | (i1717 ^ iIndexOf);
                                    int i1719 = ~((i1718 & 17) | (i1718 ^ 17));
                                    Object[] objArr115 = new Object[1];
                                    e(cArr2, b2, i11 - (521 >>> ((i1719 & i1619) | (i1619 ^ i1719))), objArr115);
                                    objArr3 = (Object[]) cls3.getMethod((String) objArr115[0], null).invoke(method, null);
                                    if (objArr3.length == 2) {
                                        continue;
                                    } else if (Long.TYPE.equals(objArr3[0])) {
                                        int i17110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
                                        f953a = i17110 % 128;
                                        int i17111 = i17110 % 2;
                                        char[] cArr9 = {25, 27, 20, 29, 3, '\r', 27, 24, 3, 2, '\n', 6, '\t', '\r', 7, 29, 31, 4, 7, 6, '!', 22, '\b', 16};
                                        i16 = -View.MeasureSpec.getMode(0);
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                        int i17112 = (i16 * (-574)) - 16646;
                                        i17 = ~i16;
                                        i18 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        int i17113 = ~(i17 | i18);
                                        i19 = (-30) | iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        int i17114 = ~i19;
                                        int i17115 = ((i17113 ^ i17114) | (i17113 & i17114)) * 1150;
                                        i20 = ((i17112 | i17115) << 1) - (i17112 ^ i17115);
                                        i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                                        f953a = i21 % 128;
                                        if (i21 % 2 == 0) {
                                            int i17116 = ~i19;
                                            int i18110 = ~((i18 ^ 29) | (i18 & 29));
                                            i22 = i20 << ((-575) % ((i17116 & i18110) | (i17116 ^ i18110)));
                                            i17 = ~i16;
                                        } else {
                                            int i18111 = ~(((-30) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-30) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                            int i18112 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                            int i18113 = ~((i18112 ^ 29) | (i18112 & 29));
                                            int i18114 = -(-(((i18111 ^ i18113) | (i18111 & i18113)) * (-575)));
                                            i22 = ((i20 | i18114) << 1) - (i18114 ^ i20);
                                        }
                                        int i18115 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault4 | i17);
                                        int i18116 = ~((i16 & i18) | (i18 ^ i16));
                                        byte b117 = (byte) ((i22 - (~(-(-(575 * ((i18116 & i18115) | (i18115 ^ i18116))))))) - 1);
                                        char mirror3 = AndroidCharacter.getMirror('0');
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault17 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                        int i18117 = (mirror3 * 65369) + 4008;
                                        int i18118 = ~mirror3;
                                        int i18119 = ~((i18118 ^ 23) | (i18118 & 23));
                                        int i19110 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault17;
                                        int i19111 = ~((23 ^ i19110) | (i19110 & 23));
                                        int i19112 = -(-(((i18119 & i19111) | (i18119 ^ i19111)) * 168));
                                        int i19113 = (i18117 ^ i19112) + ((i18117 & i19112) << 1);
                                        int i19114 = ~mirror3;
                                        int i19115 = (i19114 & 23) | (i19114 ^ 23);
                                        int i19116 = -(-((~((i19115 & iTuitionPaymentFragmentspecialinlinedviewModeldefault17) | (i19115 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault17))) * 168));
                                        int i19117 = ((i19113 | i19116) << 1) - (i19116 ^ i19113);
                                        int i19118 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault17;
                                        int i19119 = ~((i19118 & i18118) | (i18118 ^ i19118));
                                        int i20110 = ~((i18118 & (-24)) | (i18118 ^ (-24)));
                                        int i20111 = (i19119 & i20110) | (i19119 ^ i20110);
                                        int i20112 = (mirror3 & 23) | (23 ^ mirror3);
                                        int i20113 = ~((i20112 & iTuitionPaymentFragmentspecialinlinedviewModeldefault17) | (i20112 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault17));
                                        int i20114 = ((i20113 & i20111) | (i20111 ^ i20113)) * 168;
                                        objArr4 = new Object[1];
                                        e(cArr9, b117, (i19117 & i20114) + (i20114 | i19117), objArr4);
                                        if (Class.forName((String) objArr4[0]).equals(objArr3[1])) {
                                            int i20115 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
                                            f953a = i20115 % 128;
                                            int i20116 = i20115 % 2;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char cIndexOf3 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                                int maximumFlingVelocity3 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2823;
                                                int iKeyCodeFromString3 = KeyEvent.keyCodeFromString("") + 22;
                                                byte[] bArr7 = $$d;
                                                byte b118 = bArr7[54];
                                                byte b119 = (byte) (-bArr7[5]);
                                                Object[] objArr116 = new Object[1];
                                                d(b118, b119, b119, objArr116);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf3, maximumFlingVelocity3, iKeyCodeFromString3, 1814927978, false, (String) objArr116[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cResolveSize3 = (char) View.resolveSize(0, 0);
                                                int keyRepeatTimeout5 = 2823 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                int i20117 = 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                byte[] bArr8 = $$d;
                                                byte b1110 = bArr8[54];
                                                byte b1111 = (byte) (-bArr8[5]);
                                                Object[] objArr117 = new Object[1];
                                                d(b1110, b1111, b1111, objArr117);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize3, keyRepeatTimeout5, i20117, 1814927978, false, (String) objArr117[0], null);
                                            }
                                            Object[] objArr118 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char fadingEdgeLength3 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                int iAlpha3 = Color.alpha(0) + 2823;
                                                int keyRepeatTimeout6 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22;
                                                byte b24 = $$d[7];
                                                byte b25 = b24;
                                                Object[] objArr24 = new Object[1];
                                                d(b24, b25, b25, objArr24);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength3, iAlpha3, keyRepeatTimeout6, -2137287382, false, (String) objArr24[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr118)).longValue();
                                            int i20118 = f953a + 77;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20118 % 128;
                                            int i20119 = i20118 % 2;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    int i215 = i15 | i12;
                                    int i216 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | iIndexOf;
                                    int i217 = ~((i216 & 17) | (i216 ^ 17));
                                    int i218 = 521 * ((i217 & i215) | (i215 ^ i217));
                                    Object[] objArr25 = new Object[1];
                                    e(cArr2, b2, ((i11 | i218) << 1) - (i11 ^ i218), objArr25);
                                    objArr3 = (Object[]) cls3.getMethod((String) objArr25[0], null).invoke(method, null);
                                    if (objArr3.length == 2) {
                                        continue;
                                    } else if (Long.TYPE.equals(objArr3[0])) {
                                        int i17117 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
                                        f953a = i17117 % 128;
                                        int i17118 = i17117 % 2;
                                        char[] cArr10 = {25, 27, 20, 29, 3, '\r', 27, 24, 3, 2, '\n', 6, '\t', '\r', 7, 29, 31, 4, 7, 6, '!', 22, '\b', 16};
                                        i16 = -View.MeasureSpec.getMode(0);
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                        int i17119 = (i16 * (-574)) - 16646;
                                        i17 = ~i16;
                                        i18 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        int i171110 = ~(i17 | i18);
                                        i19 = (-30) | iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        int i171111 = ~i19;
                                        int i171112 = ((i171110 ^ i171111) | (i171110 & i171111)) * 1150;
                                        i20 = ((i17119 | i171112) << 1) - (i17119 ^ i171112);
                                        i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                                        f953a = i21 % 128;
                                        if (i21 % 2 == 0) {
                                            int i171113 = ~i19;
                                            int i181110 = ~((i18 ^ 29) | (i18 & 29));
                                            i22 = i20 << ((-575) % ((i171113 & i181110) | (i171113 ^ i181110)));
                                            i17 = ~i16;
                                        } else {
                                            int i181111 = ~(((-30) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-30) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                            int i181112 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                            int i181113 = ~((i181112 ^ 29) | (i181112 & 29));
                                            int i181114 = -(-(((i181111 ^ i181113) | (i181111 & i181113)) * (-575)));
                                            i22 = ((i20 | i181114) << 1) - (i181114 ^ i20);
                                        }
                                        int i181115 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault4 | i17);
                                        int i181116 = ~((i16 & i18) | (i18 ^ i16));
                                        byte b1112 = (byte) ((i22 - (~(-(-(575 * ((i181116 & i181115) | (i181115 ^ i181116))))))) - 1);
                                        char mirror4 = AndroidCharacter.getMirror('0');
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault18 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                        int i181117 = (mirror4 * 65369) + 4008;
                                        int i181118 = ~mirror4;
                                        int i181119 = ~((i181118 ^ 23) | (i181118 & 23));
                                        int i191110 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault18;
                                        int i191111 = ~((23 ^ i191110) | (i191110 & 23));
                                        int i191112 = -(-(((i181119 & i191111) | (i181119 ^ i191111)) * 168));
                                        int i191113 = (i181117 ^ i191112) + ((i181117 & i191112) << 1);
                                        int i191114 = ~mirror4;
                                        int i191115 = (i191114 & 23) | (i191114 ^ 23);
                                        int i191116 = -(-((~((i191115 & iTuitionPaymentFragmentspecialinlinedviewModeldefault18) | (i191115 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault18))) * 168));
                                        int i191117 = ((i191113 | i191116) << 1) - (i191116 ^ i191113);
                                        int i191118 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault18;
                                        int i191119 = ~((i191118 & i181118) | (i181118 ^ i191118));
                                        int i201110 = ~((i181118 & (-24)) | (i181118 ^ (-24)));
                                        int i201111 = (i191119 & i201110) | (i191119 ^ i201110);
                                        int i201112 = (mirror4 & 23) | (23 ^ mirror4);
                                        int i201113 = ~((i201112 & iTuitionPaymentFragmentspecialinlinedviewModeldefault18) | (i201112 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault18));
                                        int i201114 = ((i201113 & i201111) | (i201111 ^ i201113)) * 168;
                                        objArr4 = new Object[1];
                                        e(cArr10, b1112, (i191117 & i201114) + (i201114 | i191117), objArr4);
                                        if (Class.forName((String) objArr4[0]).equals(objArr3[1])) {
                                            int i201115 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
                                            f953a = i201115 % 128;
                                            int i201116 = i201115 % 2;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char cIndexOf4 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                                int maximumFlingVelocity4 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2823;
                                                int iKeyCodeFromString4 = KeyEvent.keyCodeFromString("") + 22;
                                                byte[] bArr9 = $$d;
                                                byte b1113 = bArr9[54];
                                                byte b1114 = (byte) (-bArr9[5]);
                                                Object[] objArr119 = new Object[1];
                                                d(b1113, b1114, b1114, objArr119);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf4, maximumFlingVelocity4, iKeyCodeFromString4, 1814927978, false, (String) objArr119[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cResolveSize4 = (char) View.resolveSize(0, 0);
                                                int keyRepeatTimeout7 = 2823 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                int i201117 = 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                byte[] bArr10 = $$d;
                                                byte b1115 = bArr10[54];
                                                byte b1116 = (byte) (-bArr10[5]);
                                                Object[] objArr1110 = new Object[1];
                                                d(b1115, b1116, b1116, objArr1110);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize4, keyRepeatTimeout7, i201117, 1814927978, false, (String) objArr1110[0], null);
                                            }
                                            Object[] objArr1111 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char fadingEdgeLength4 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                int iAlpha4 = Color.alpha(0) + 2823;
                                                int keyRepeatTimeout8 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22;
                                                byte b26 = $$d[7];
                                                byte b27 = b26;
                                                Object[] objArr26 = new Object[1];
                                                d(b26, b27, b27, objArr26);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength4, iAlpha4, keyRepeatTimeout8, -2137287382, false, (String) objArr26[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr1111)).longValue();
                                            int i201118 = f953a + 77;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i201118 % 128;
                                            int i201119 = i201118 % 2;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    i33 = ((i33 ^ 109) + ((i33 & 109) << 1)) - 108;
                    i23 = 2;
                    i26 = 0;
                    i25 = 1;
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
            char keyRepeatTimeout9 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int trimmedLength3 = 2823 - TextUtils.getTrimmedLength("");
            int iAxisFromString = 23 + MotionEvent.axisFromString("");
            byte[] bArr11 = $$d;
            byte b28 = bArr11[54];
            byte b29 = (byte) (-bArr11[5]);
            Object[] objArr27 = new Object[1];
            d(b28, b29, b29, objArr27);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout9, trimmedLength3, iAxisFromString, 1814927978, false, (String) objArr27[0], null);
        }
        Object[] objArr28 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
            int i219 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2822;
            int iResolveSize = View.resolveSize(0, 0) + 22;
            byte[] bArr12 = $$d;
            byte b30 = (byte) (bArr12[51] - 1);
            byte b31 = bArr12[7];
            Object[] objArr29 = new Object[1];
            d(b30, b31, b31, objArr29);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionChild, i219, iResolveSize, 1025296417, false, (String) objArr29[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr28);
        Object[] objArr30 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char maximumFlingVelocity5 = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37657);
            int iLastIndexOf = 2719 - TextUtils.lastIndexOf("", '0', 0, 0);
            int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0) + 20;
            byte[] bArr13 = $$d;
            byte b32 = (byte) (bArr13[51] - 1);
            byte b33 = bArr13[7];
            Object[] objArr31 = new Object[1];
            d(b32, b33, b33, objArr31);
            i = 0;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(maximumFlingVelocity5, iLastIndexOf, iIndexOf4, -1568796068, false, (String) objArr31[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        } else {
            i = 0;
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr30)).longValue();
        long j = -1086413187;
        long j2 = -1;
        long j3 = j ^ j2;
        long jUptimeMillis = (int) SystemClock.uptimeMillis();
        long j4 = jUptimeMillis ^ j2;
        long j5 = (((long) TypedValues.Custom.TYPE_DIMENSION) * j) + (((long) (-903)) * jLongValue) + (((long) (-1808)) * (((j3 | jUptimeMillis) ^ j2) | ((j4 | jLongValue) ^ j2)));
        long j6 = TypedValues.Custom.TYPE_BOOLEAN;
        long j7 = jLongValue ^ j2;
        long j8 = j4 | j;
        long j9 = j5 + (((((j3 | j7) | jUptimeMillis) ^ j2) | ((j8 | jLongValue) ^ j2)) * j6) + (j6 * (((j7 | jUptimeMillis) ^ j2) | ((jLongValue | j3) ^ j2) | (j8 ^ j2))) + ((long) (-723992658));
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i220 = (-1204286674) + (((~((~iFreeMemory) | 1618331312)) | 160047364) * (-245));
        int i221 = ~(iFreeMemory | 1618331312);
        int i222 = ((int) (j9 >> 32)) & (i220 + (i221 * (-245)) + ((i221 | (-1239409573)) * 245));
        int iNextInt = new Random().nextInt();
        int i223 = ~iNextInt;
        int i224 = ((int) j9) & (356375755 + (((~(1624308870 | i223)) | (~((-187082461) | iNextInt))) * 210) + (((~(iNextInt | 1811349214)) | (~(i223 | (-42117)))) * 210));
        int i225 = (i222 & i224) | (i222 ^ i224);
        int i226 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i227 = i226 + 5;
        int i228 = i227 % 128;
        f953a = i228;
        int i229 = i227 % 2;
        int i230 = i225 >>> 24;
        int i231 = i225 & ViewCompat.MEASURED_SIZE_MASK;
        if (i230 != 0) {
            int i232 = i226 + 43;
            f953a = i232 % 128;
            i2 = 2;
            int i233 = i232 % 2;
            i3 = 1;
        } else {
            i2 = 2;
            int i234 = (i228 & 109) + (i228 | 109);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i234 % 128;
            int i235 = i234 % 2;
            i3 = i;
        }
        if (i3 == 1) {
            i = 1;
        }
        if ((i3 ^ 1) == 1 || i231 >= i2) {
            string = null;
        } else {
            int i236 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i237 = (i236 & 101) + (i236 | 101);
            f953a = i237 % 128;
            int i238 = i237 % i2;
            Method method3 = methodArr[i231];
            if (method3 != null) {
                int i239 = i236 + 7;
                f953a = i239 % 128;
                int i240 = i239 % i2;
                string = method3.toString();
            } else {
                string = null;
            }
        }
        list.add(string);
        int i241 = (i230 + 6) * i;
        int i242 = f953a + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i242 % 128;
        int i243 = i242 % 2;
        return i241;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, int r7, byte r8) {
        /*
            int r7 = 116 - r7
            byte[] r0 = defpackage.getLifecycleCameras.$$c
            int r6 = r6 * 2
            int r6 = 3 - r6
            int r8 = r8 * 4
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getLifecycleCameras.$$g(int, int, byte):java.lang.String");
    }
}
