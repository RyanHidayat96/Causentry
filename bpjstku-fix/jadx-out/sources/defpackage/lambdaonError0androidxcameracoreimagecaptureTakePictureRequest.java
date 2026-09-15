package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
final class lambdaonError0androidxcameracoreimagecaptureTakePictureRequest extends TakePictureRequestExternalSyntheticLambda0 {
    private static int $10 = 0;
    private static int $11 = 1;
    private final CameraConfigs TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final CameraConfigs TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final String b;
    private static final byte[] $$d = {107, 48, 57, 107, -9, -26, 23, -40, -11, -16, 28, -35, -20, -18, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 188;
    private static final byte[] $$a = {64, 73, -26, 82, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 101;
    private static int asInterface = 0;
    private static int asBinder = 1;
    private static long TuitionPaymentFragmentbindingInflater1 = -691255808014884055L;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = r6 + 4
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r0 = defpackage.lambdaonError0androidxcameracoreimagecaptureTakePictureRequest.$$a
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2f:
            int r6 = r6 + 1
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-10)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdaonError0androidxcameracoreimagecaptureTakePictureRequest.a(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            int r9 = r9 * 19
            int r9 = 103 - r9
            int r8 = r8 * 42
            int r8 = r8 + 11
            byte[] r0 = defpackage.lambdaonError0androidxcameracoreimagecaptureTakePictureRequest.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r5 = r2
            goto L2c
        L15:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L19:
            byte r4 = (byte) r7
            int r9 = r9 + 1
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r9]
        L2c:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdaonError0androidxcameracoreimagecaptureTakePictureRequest.d(int, int, short, java.lang.Object[]):void");
    }

    lambdaonError0androidxcameracoreimagecaptureTakePictureRequest(Context context, CameraConfigs cameraConfigs, CameraConfigs cameraConfigs2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context;
        if (cameraConfigs == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cameraConfigs;
        if (cameraConfigs2 != null) {
            int i = asBinder + 119;
            int i2 = i % 128;
            asInterface = i2;
            int i3 = i % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cameraConfigs2;
            if (str != null) {
                int i4 = i2 + 5;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                this.b = str;
                return;
            }
            throw new NullPointerException("Null backendName");
        }
        throw new NullPointerException("Null monotonicClock");
    }

    @Override // defpackage.TakePictureRequestExternalSyntheticLambda0
    public final Context TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 65;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Context context = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i5 = i2 + 85;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return context;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getEdgeSlop() >> 16)), 2624 - Color.green(0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39421 - TextUtils.indexOf((CharSequence) "", '0')), 481 - TextUtils.getOffsetAfter("", 0), 36 - ImageFormat.getBitsPerPixel(0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i4 = $10 + 21;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            try {
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 480 - ExpandableListView.getPackedPositionChild(0L), 37 - TextUtils.indexOf("", "", 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2);
        int i6 = $10 + 103;
        $11 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // defpackage.TakePictureRequestExternalSyntheticLambda0
    public final CameraConfigs TuitionPaymentFragmentbindingInflater1() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = asInterface + 33;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char jumpTapTimeout = (char) (31533 - (ViewConfiguration.getJumpTapTimeout() >> 16));
            int iAxisFromString = MotionEvent.axisFromString("") + 922;
            int scrollBarSize = 28 - (ViewConfiguration.getScrollBarSize() >> 8);
            byte b = $$a[80];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (b2 | 52), b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, iAxisFromString, scrollBarSize, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{19027, 4211, 65032, 17613, 8929, 34992, 22348, 15701, 39717, 25062, 53194, 43620, 28799, 56866, 42196, 662, 59567, 46958, 7440, 64288, 16893, 12162}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23088, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{19031, 37015, 65473, 55833, 8549, 4026, 27360, 45343, 39967, 64322, 49540, 11493, 2871, 22122, 48297}, 56009 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (31533 - TextUtils.indexOf("", ""));
            int size = 921 - View.MeasureSpec.getSize(0);
            int maxKeyCode = 28 - (KeyEvent.getMaxKeyCode() >> 16);
            byte[] bArr = $$a;
            byte b3 = bArr[80];
            Object[] objArr5 = new Object[1];
            a(b3, b3, bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, size, maxKeyCode, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = asBinder + 43;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mirror = (char) (31581 - AndroidCharacter.getMirror('0'));
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 922;
                int packedPositionGroup = 28 - ExpandableListView.getPackedPositionGroup(0L);
                byte[] bArr2 = $$a;
                byte b4 = bArr2[7];
                Object[] objArr6 = new Object[1];
                a(b4, (byte) (-bArr2[33]), b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, modifierMetaStateMask, packedPositionGroup, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iMyTid = Process.myTid();
            int i6 = ~((-704806957) | iMyTid);
            int i7 = ~iMyTid;
            int i8 = (-1373468388) + ((i6 | (~((-68159042) | i7))) * 497) + (((~(iMyTid | (-68159042))) | (~((-1001113647) | i7)) | 296306690) * 497) + 1086543605;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{19027, 5061, 63844, 18059, 11321, 62886, 21440, 14643, 34459, 27683, 13752, 37775, 31071, 50836, 44056, 30124, 54228, 47474, 1668, 60432, 46482, 5079, 63846, 18152, 11275, 62887}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22937, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{19025, 51702, 19746, 49491, 17555, 55337, 23648, 54180, 22474, 60283, 28340, 58048, 26141, 58798, 31208, 64772, 29005, 62621}, TextUtils.getTrimmedLength("") + 33713, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{19032, 62086, 15342, 24620, 43336, 54903, 7853, 18319, 36093, 13665, 29235, 47980, 58301, 10391, 20977, 40484}, 47317 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{19035, 36051, 51037, 6611, 20562, 43714, 60760, 10216, 32338, 45310, 35699, 52717, 1101, 24220, 37136, 60316}, 50821 - KeyEvent.normalizeMetaState(0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i11 = asBinder + 107;
            asInterface = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1086543605};
                byte[] bArr3 = $$d;
                byte b5 = (byte) (-bArr3[15]);
                byte b6 = bArr3[17];
                Object[] objArr13 = new Object[1];
                d(b5, b6, b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = (byte) (-bArr3[4]);
                byte b8 = bArr3[15];
                Object[] objArr14 = new Object[1];
                d(b7, b8, b8, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cRed = (char) (31533 - Color.red(0));
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 921;
                    int offsetBefore = 28 - TextUtils.getOffsetBefore("", 0);
                    byte[] bArr4 = $$a;
                    byte b9 = bArr4[7];
                    Object[] objArr16 = new Object[1];
                    a(b9, (byte) (-bArr4[33]), b9, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRed, longPressTimeout, offsetBefore, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{19027, 4211, 65032, 17613, 8929, 34992, 22348, 15701, 39717, 25062, 53194, 43620, 28799, 56866, 42196, 662, 59567, 46958, 7440, 64288, 16893, 12162}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23087, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{19031, 37015, 65473, 55833, 8549, 4026, 27360, 45343, 39967, 64322, 49540, 11493, 2871, 22122, 48297}, ((byte) KeyEvent.getModifierMetaStateMask()) + 56010, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31533);
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 921;
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28;
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        a(b10, b10, bArr5[7], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout, touchSlop, minimumFlingVelocity, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf2 = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                        int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0');
                        int iBlue = Color.blue(0) + 28;
                        byte b11 = $$a[80];
                        byte b12 = b11;
                        Object[] objArr20 = new Object[1];
                        a(b12, (byte) (b12 | 52), b11, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, iLastIndexOf, iBlue, -1048449946, false, (String) objArr20[0], null);
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr == null) {
                throw null;
            }
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i13 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i14 = ~iIdentityHashCode;
        int i15 = i13 + (-654846701) + (((~((-37769997) | i14)) | (~((-554961026) | iIdentityHashCode)) | (~((-1143578627) | iIdentityHashCode))) * 765) + (((~((-592731022) | i14)) | 37769996) * 1530) + (((~(iIdentityHashCode | (-592731022))) | (~(i14 | (-1143578627)))) * 765);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr21[0])[0] = i17 ^ (i17 << 5);
        int i18 = asBinder + 105;
        asInterface = i18 % 128;
        int i19 = i18 % 2;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.TakePictureRequestExternalSyntheticLambda0
    public final CameraConfigs b() {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        CameraConfigs cameraConfigs = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = i3 + 79;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return cameraConfigs;
    }

    @Override // defpackage.TakePictureRequestExternalSyntheticLambda0
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.b;
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        return str;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", wallClock=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", monotonicClock=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", backendName=");
        sb.append(this.b);
        sb.append("}");
        String string = sb.toString();
        int i2 = asBinder + 107;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040 A[PHI: r6
  0x0040: PHI (r6v3 TakePictureRequestExternalSyntheticLambda0) = (r6v2 TakePictureRequestExternalSyntheticLambda0), (r6v6 TakePictureRequestExternalSyntheticLambda0) binds: [B:15:0x003e, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0076 A[RETURN] */
    public final boolean equals(Object obj) {
        TakePictureRequestExternalSyntheticLambda0 takePictureRequestExternalSyntheticLambda0;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 1;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof TakePictureRequestExternalSyntheticLambda0) {
            int i4 = i2 + 61;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                takePictureRequestExternalSyntheticLambda0 = (TakePictureRequestExternalSyntheticLambda0) obj;
                int i5 = 94 / 0;
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(takePictureRequestExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1())) {
                    int i6 = asInterface + 21;
                    asBinder = i6 % 128;
                    int i7 = i6 % 2;
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals(takePictureRequestExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1()) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.equals(takePictureRequestExternalSyntheticLambda0.b())) {
                        int i8 = asBinder + 39;
                        asInterface = i8 % 128;
                        int i9 = i8 % 2;
                        if (this.b.equals(takePictureRequestExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2())) {
                            return true;
                        }
                    }
                }
            } else {
                takePictureRequestExternalSyntheticLambda0 = (TakePictureRequestExternalSyntheticLambda0) obj;
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(takePictureRequestExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1())) {
                    int i10 = asInterface + 21;
                    asBinder = i10 % 128;
                    int i11 = i10 % 2;
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals(takePictureRequestExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1())) {
                        int i12 = asBinder + 39;
                        asInterface = i12 % 128;
                        int i13 = i12 % 2;
                        if (this.b.equals(takePictureRequestExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        int iHashCode2 = ((((((iHashCode ^ 1000003) * 1000003) ^ this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 1000003) ^ this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 1000003) ^ this.b.hashCode();
        int i4 = asBinder + 105;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode2;
    }
}
