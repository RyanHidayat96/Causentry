package defpackage;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializationException;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ForwardingLiveData<Tag> implements stopListeningToRotationEvents, setActiveRecording {
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final ArrayList<Tag> b = new ArrayList<>();
    private static final byte[] $$c = {68, 83, 49, -116};
    private static final int $$f = 104;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {12, -88, 33, 118, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -73, 3, 17, 12, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 70};
    private static final int $$h = DerHeader.TAG_CLASS_PRIVATE;
    private static final byte[] $$a = {2, -84, 82, -15, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 179;
    private static int asInterface = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f147a = 1;
    private static long TuitionPaymentFragmentbindingInflater1 = -6377398940819159759L;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -981105359;
    private static char g = 33522;

    public static /* synthetic */ Object b(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~((~i5) | i7);
        int i9 = (~i2) | (~(i7 | i5));
        int i10 = i5 | i2 | i7;
        int i11 = i2 + i + i3 + (1635157569 * i6) + ((-1141649966) * i4);
        int i12 = i11 * i11;
        int i13 = (((-1186836012) * i2) - 711983104) + (488484398 * i) + (i8 * 1309823443) + (1309823443 * i9) + ((-1309823443) * i10) + (1798307840 * i3) + (1462763520 * i6) + (1566572544 * i4) + (1631846400 * i12);
        int i14 = (i2 * 1521345644) + 2088555610 + (i * 1521346098) + (i8 * (-227)) + (i9 * (-227)) + (i10 * 227) + (i3 * 1521345871) + (i6 * (-1382509809)) + (i4 * 37969358) + (i12 * (-671350784));
        int i15 = i13 + (i14 * i14 * (-1069809664));
        if (i15 == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i15 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i15 != 3) {
            if (i15 != 4) {
                return i15 != 5 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : b(objArr);
            }
            ForwardingLiveData forwardingLiveData = (ForwardingLiveData) objArr[0];
            int i16 = 2 % 2;
            StringBuilder sb = new StringBuilder();
            sb.append(Reflection.getOrCreateKotlinClass(forwardingLiveData.getClass()));
            sb.append(" can't retrieve untyped values");
            throw new SerializationException(sb.toString());
        }
        int i17 = 2 % 2;
        int i18 = f147a;
        int i19 = i18 + 113;
        asInterface = i19 % 128;
        int i20 = i19 % 2;
        int i21 = i18 + 95;
        asInterface = i21 % 128;
        int i22 = i21 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 52
            int r8 = 107 - r8
            int r9 = r9 * 2
            int r9 = 84 - r9
            int r7 = r7 * 15
            int r7 = r7 + 38
            byte[] r0 = defpackage.ForwardingLiveData.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2f
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2f:
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ForwardingLiveData.c(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 48
            int r6 = 52 - r6
            int r7 = r7 * 4
            int r0 = r7 + 49
            int r8 = r8 * 15
            int r8 = 99 - r8
            byte[] r1 = defpackage.ForwardingLiveData.$$g
            byte[] r0 = new byte[r0]
            int r7 = r7 + 48
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r8 = r8 + 1
            int r3 = r3 + r6
            int r6 = r3 + 3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ForwardingLiveData.f(byte, short, int, java.lang.Object[]):void");
    }

    protected abstract Tag b(createImageAnalysis createimageanalysis, int i);

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        int i5 = $10 + 81;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i7 = $11 + 79;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 8328), View.getDefaultSize(0, 0) + 1235, 34 - MotionEvent.axisFromString(""), -653973969, false, $$i(b, b2, (byte) (b2 + 3)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2764, View.resolveSizeAndState(0, 0, 0) + 14, 1504416861, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 43325), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 252, View.getDefaultSize(0, 0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 65200);
                    int threadPriority = 2891 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int i9 = 17 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    String str$$i = $$i(b5, b6, (byte) (-b6));
                    i2 = 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarFadeDuration, threadPriority, i9, 2012627446, false, str$$i, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentbindingInflater1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) g) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                i3 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    @Override // defpackage.setActiveRecording
    public int decodeCollectionSize(createImageAnalysis createimageanalysis) {
        int i = 2 % 2;
        int i2 = f147a + 113;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(createimageanalysis, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        int i3 = asInterface + 85;
        f147a = i3 % 128;
        int i4 = i3 % 2;
        return -1;
    }

    @Override // defpackage.stopListeningToRotationEvents
    public <T> T decodeNullableSerializableValue(isBitDepthMatched<? extends T> isbitdepthmatched) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        f147a = i2 % 128;
        int i3 = i2 % 2;
        T t = (T) stopListeningToRotationEvents.DefaultImpls.decodeNullableSerializableValue(this, isbitdepthmatched);
        int i4 = asInterface + 69;
        f147a = i4 % 128;
        if (i4 % 2 != 0) {
            return t;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.setActiveRecording
    public boolean decodeSequentially() {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        f147a = i2 % 128;
        return i2 % 2 == 0;
    }

    @Override // defpackage.stopListeningToRotationEvents
    public <T> T decodeSerializableValue(isBitDepthMatched<? extends T> isbitdepthmatched) {
        int i = 2 % 2;
        int i2 = f147a + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(isbitdepthmatched, "");
        if (i3 != 0) {
            isbitdepthmatched.deserialize(this);
            throw null;
        }
        T tDeserialize = isbitdepthmatched.deserialize(this);
        int i4 = f147a + 45;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return tDeserialize;
    }

    protected boolean b(Tag tag) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43042);
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 3111;
            int gidForName = Process.getGidForName("") + 23;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[132], bArr[0], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, fadingEdgeLength, gidForName, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{46897, 62818, 54892, 53925}, (char) (KeyEvent.getMaxKeyCode() >> 16), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, new char[]{5185, 61739, 58062, 9640, 47192, 10846, 25744, 21336, 10723, 46894, 12812, 47784, 1057, 11170, 50692, 61386, 57181, 2571, 9054, 59937, 20998, 49159}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{19853, 14842, 58122, 32111}, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 28644), 171571789 + (ViewConfiguration.getEdgeSlop() >> 16), new char[]{21924, 3857, 11575, 18125, 50986, 27327, 24020, 53444, 36833, 25979, 5361, 21732, 51666, 33526, 37658}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 43042);
            int iIndexOf = TextUtils.indexOf("", "", 0) + 3111;
            int absoluteGravity = 22 - Gravity.getAbsoluteGravity(0, 0);
            byte[] bArr2 = $$a;
            byte b = bArr2[132];
            Object[] objArr5 = new Object[1];
            c(b, b, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, iIndexOf, absoluteGravity, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollDefaultDelay = (char) (43042 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 3111;
                int iAlpha = 22 - Color.alpha(0);
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                c(b2, b3, b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, tapTimeout, iAlpha, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i3 = ((int[]) objArr7[2])[0];
            int i4 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i3};
            int i5 = ~((int) Runtime.getRuntime().maxMemory());
            int i6 = (-2036398374) + ((~((-605295749) | i5)) * (-783)) + (((~(i5 | 1095459419)) | (-609572040)) * 783) + 1325120769;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
            objArr = new Object[]{new int[1], new int[]{i4}, iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{38281, 3627, 31423, 55776}, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 57466), (Process.getThreadPriority(0) + 20) >> 6, new char[]{46789, 10448, 63849, 48943, 5982, 6007, 61418, 49969, 7672, 6608, 904, 23698, 3815, 17715, 26988, 46104}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{46534, 6681, 65327, 50353}, (char) (View.MeasureSpec.getMode(0) + 45567), Process.myPid() >> 22, new char[]{43347, 53744, 11762, 45074, 35549, 12223, 25799, 47805, 7214, 3069, 180, 24220, 32382, 46377, 16990, 27501}, objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 1325120769};
                byte[] bArr3 = $$g;
                byte b4 = bArr3[35];
                byte b5 = (byte) (b4 - 1);
                Object[] objArr11 = new Object[1];
                f(b4, b5, b5, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b6 = bArr3[35];
                byte b7 = (byte) (b6 - 1);
                byte b8 = b6;
                Object[] objArr12 = new Object[1];
                f(b7, b8, b8, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (43042 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int iLastIndexOf = 3110 - TextUtils.lastIndexOf("", '0');
                    int iAxisFromString = 21 - MotionEvent.axisFromString("");
                    byte b9 = $$a[7];
                    byte b10 = b9;
                    Object[] objArr13 = new Object[1];
                    c(b9, b10, b10, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iLastIndexOf, iAxisFromString, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{46897, 62818, 54892, 53925}, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-1) - TextUtils.lastIndexOf("", '0'), new char[]{5185, 61739, 58062, 9640, 47192, 10846, 25744, 21336, 10723, 46894, 12812, 47784, 1057, 11170, 50692, 61386, 57181, 2571, 9054, 59937, 20998, 49159}, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{19853, 14842, 58122, 32111}, (char) (28644 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 171571789 - Color.alpha(0), new char[]{21924, 3857, 11575, 18125, 50986, 27327, 24020, 53444, 36833, 25979, 5361, 21732, 51666, 33526, 37658}, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cNormalizeMetaState = (char) (43042 - KeyEvent.normalizeMetaState(0));
                        int tapTimeout2 = 3111 - (ViewConfiguration.getTapTimeout() >> 16);
                        int iArgb = Color.argb(0, 0, 0, 0) + 22;
                        byte[] bArr4 = $$a;
                        byte b11 = bArr4[132];
                        Object[] objArr16 = new Object[1];
                        c(b11, b11, bArr4[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cNormalizeMetaState, tapTimeout2, iArgb, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c3 = (char) (43043 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int iIndexOf2 = TextUtils.indexOf("", "", 0) + 3111;
                        int iArgb2 = Color.argb(0, 0, 0, 0) + 22;
                        byte[] bArr5 = $$a;
                        Object[] objArr17 = new Object[1];
                        c(bArr5[132], bArr5[0], bArr5[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, iIndexOf2, iArgb2, -1272852037, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        if (((int[]) objArr[2])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 == null) {
                throw null;
            }
            int i9 = f147a + 3;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
            while (i2 < strArr2.length) {
                arrayList.add(strArr2[i2]);
                i2++;
                int i11 = asInterface + 81;
                f147a = i11 % 128;
                int i12 = i11 % 2;
            }
            throw null;
        }
        int i13 = ((int[]) objArr[0])[0];
        int i14 = ((int[]) objArr[2])[0];
        int i15 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int iIdentityHashCode = System.identityHashCode(this);
        int i16 = i13 + (-1535115931) + (((~(iIdentityHashCode | 675383119)) | 1029648339) * 191) + (((~((~iIdentityHashCode) | 675383119)) | 354298000) * 191);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
        Object[] objArr18 = {new int[1], new int[]{i15}, new int[]{i14}, strArr3};
        Object objB = b(new Object[]{this}, 219140594, -219140590, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        int i19 = ((int[]) objArr18[0])[0];
        int i20 = i19 * i19;
        int i21 = -(415253841 * i19);
        int i22 = (i20 & i21) + (i20 | i21);
        int i23 = -(i19 * 1537440851);
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        int i25 = ((i24 | (-36426684)) << 1) - ((-36426684) ^ i24);
        int i26 = i25 >> 16;
        int i27 = (((-131071) ^ i26) + ((i26 & (-131071)) << 1)) / 65536;
        int i28 = (i25 - (~(((i27 | 1) << 1) - (i27 ^ 1)))) - 1;
        int i29 = i25 >> 18;
        int i30 = ((i29 ^ (-32767)) + ((i29 & (-32767)) << 1)) / 16384;
        int i31 = -(i28 ^ (((i30 | 1) << 1) - (i30 ^ 1)));
        int i32 = (i31 ^ 1) + ((i31 & 1) << 1);
        Intrinsics.checkNotNull(objB, "22;null cannot be cast to non-null type kotlin.Boolean".substring(5265 / (((-((((i32 >> 20) - 8191) / 4096) + 2)) & i32) * 1755)));
        return ((Boolean) objB).booleanValue();
    }

    protected byte TuitionPaymentFragmentbindingInflater1(Tag tag) {
        byte bByteValue;
        int i = 2 % 2;
        int i2 = asInterface + 3;
        f147a = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (i3 == 0) {
            Object objB = b(objArr, 219140594, -219140590, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            Intrinsics.checkNotNull(objB, "");
            bByteValue = ((Byte) objB).byteValue();
            int i4 = 98 / 0;
        } else {
            Object objB2 = b(objArr, 219140594, -219140590, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            Intrinsics.checkNotNull(objB2, "");
            bByteValue = ((Byte) objB2).byteValue();
        }
        int i5 = asInterface + 113;
        f147a = i5 % 128;
        int i6 = i5 % 2;
        return bByteValue;
    }

    protected short d(Tag tag) {
        int i = 2 % 2;
        int i2 = f147a + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (i3 != 0) {
            Object objB = b(objArr, 219140594, -219140590, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            Intrinsics.checkNotNull(objB, "");
            ((Short) objB).shortValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objB2 = b(objArr, 219140594, -219140590, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        Intrinsics.checkNotNull(objB2, "");
        short sShortValue = ((Short) objB2).shortValue();
        int i4 = asInterface + 19;
        f147a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return sShortValue;
    }

    protected int g(Tag tag) {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        f147a = i2 % 128;
        int i3 = i2 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        Object objB = b(new Object[]{this}, 219140594, -219140590, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        Intrinsics.checkNotNull(objB, "");
        int iIntValue = ((Integer) objB).intValue();
        int i4 = f147a + 3;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    protected long a(Tag tag) {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        f147a = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            Object objB = b(new Object[]{this}, 219140594, -219140590, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            Intrinsics.checkNotNull(objB, "");
            ((Long) objB).longValue();
            throw null;
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        Object objB2 = b(new Object[]{this}, 219140594, -219140590, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        Intrinsics.checkNotNull(objB2, "");
        long jLongValue = ((Long) objB2).longValue();
        int i3 = f147a + 3;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return jLongValue;
        }
        obj.hashCode();
        throw null;
    }

    protected float TuitionPaymentFragmentspecialinlinedviewModeldefault2(Tag tag) {
        int i = 2 % 2;
        int i2 = f147a + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        Object objB = b(new Object[]{this}, 219140594, -219140590, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        Intrinsics.checkNotNull(objB, "");
        float fFloatValue = ((Float) objB).floatValue();
        int i4 = asInterface + 85;
        f147a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return fFloatValue;
    }

    protected double TuitionPaymentFragmentspecialinlinedviewModeldefault3(Tag tag) {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        f147a = i2 % 128;
        int i3 = i2 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        Object objB = b(new Object[]{this}, 219140594, -219140590, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        Intrinsics.checkNotNull(objB, "");
        double dDoubleValue = ((Double) objB).doubleValue();
        int i4 = asInterface + 13;
        f147a = i4 % 128;
        if (i4 % 2 != 0) {
            return dDoubleValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected char TuitionPaymentFragmentspecialinlinedviewModeldefault1(Tag tag) {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        f147a = i2 % 128;
        int i3 = i2 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        Object objB = b(new Object[]{this}, 219140594, -219140590, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        Intrinsics.checkNotNull(objB, "");
        char cCharValue = ((Character) objB).charValue();
        int i4 = f147a + 99;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return cCharValue;
    }

    protected String asBinder(Tag tag) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        f147a = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {this};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (i3 == 0) {
            Object objB = b(objArr, 219140594, -219140590, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            Intrinsics.checkNotNull(objB, "");
            obj.hashCode();
            throw null;
        }
        Object objB2 = b(objArr, 219140594, -219140590, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        Intrinsics.checkNotNull(objB2, "");
        String str = (String) objB2;
        int i4 = f147a + 81;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    protected int TuitionPaymentFragmentspecialinlinedviewModeldefault3(Tag tag, createImageAnalysis createimageanalysis) {
        int i = 2 % 2;
        int i2 = f147a + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        Object objB = b(new Object[]{this}, 219140594, -219140590, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        Intrinsics.checkNotNull(objB, "");
        int iIntValue = ((Integer) objB).intValue();
        int i4 = f147a + 81;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    public stopListeningToRotationEvents TuitionPaymentFragmentspecialinlinedviewModeldefault2(Tag tag, createImageAnalysis createimageanalysis) {
        int i = 2 % 2;
        int i2 = f147a + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        this.b.add(tag);
        ForwardingLiveData<Tag> forwardingLiveData = this;
        int i4 = asInterface + 15;
        f147a = i4 % 128;
        int i5 = i4 % 2;
        return forwardingLiveData;
    }

    @Override // defpackage.stopListeningToRotationEvents
    public stopListeningToRotationEvents decodeInline(createImageAnalysis createimageanalysis) {
        int i = 2 % 2;
        int i2 = f147a + 123;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        ArrayList<Tag> arrayList = this.b;
        Tag tagRemove = arrayList.remove(CollectionsKt.getLastIndex(arrayList));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        stopListeningToRotationEvents stoplisteningtorotationeventsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(tagRemove, createimageanalysis);
        int i4 = asInterface + 87;
        f147a = i4 % 128;
        int i5 = i4 % 2;
        return stoplisteningtorotationeventsTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.stopListeningToRotationEvents
    public boolean decodeNotNullMark() {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        f147a = i2 % 128;
        int i3 = i2 % 2;
        Object objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) this.b);
        if (objLastOrNull != null) {
            return asInterface(objLastOrNull);
        }
        int i4 = asInterface + 51;
        f147a = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws Throwable {
        ForwardingLiveData forwardingLiveData = (ForwardingLiveData) objArr[0];
        int i = 2 % 2;
        int i2 = f147a + 87;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ArrayList<Tag> arrayList = forwardingLiveData.b;
        Tag tagRemove = arrayList.remove(CollectionsKt.getLastIndex(arrayList));
        forwardingLiveData.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        boolean zB = forwardingLiveData.b(tagRemove);
        int i4 = f147a + 15;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zB);
        }
        int i5 = 89 / 0;
        return Boolean.valueOf(zB);
    }

    @Override // defpackage.stopListeningToRotationEvents
    public final byte decodeByte() {
        Tag tagRemove;
        int i = 2 % 2;
        int i2 = f147a + 75;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            ArrayList<Tag> arrayList = this.b;
            tagRemove = arrayList.remove(CollectionsKt.getLastIndex(arrayList));
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
        } else {
            ArrayList<Tag> arrayList2 = this.b;
            tagRemove = arrayList2.remove(CollectionsKt.getLastIndex(arrayList2));
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        }
        byte bTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(tagRemove);
        int i3 = f147a + 83;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return bTuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.stopListeningToRotationEvents
    public final short decodeShort() {
        int i = 2 % 2;
        int i2 = f147a + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ArrayList<Tag> arrayList = this.b;
        Tag tagRemove = arrayList.remove(CollectionsKt.getLastIndex(arrayList));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        short sD = d(tagRemove);
        int i4 = f147a + 75;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return sD;
    }

    @Override // defpackage.stopListeningToRotationEvents
    public final int decodeInt() {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        f147a = i2 % 128;
        int i3 = i2 % 2;
        ArrayList<Tag> arrayList = this.b;
        Tag tagRemove = arrayList.remove(CollectionsKt.getLastIndex(arrayList));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        int iG = g(tagRemove);
        int i4 = f147a + 55;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return iG;
    }

    @Override // defpackage.stopListeningToRotationEvents
    public final long decodeLong() {
        int i = 2 % 2;
        int i2 = f147a + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ArrayList<Tag> arrayList = this.b;
        Tag tagRemove = arrayList.remove(CollectionsKt.getLastIndex(arrayList));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        long jA = a(tagRemove);
        int i4 = asInterface + 51;
        f147a = i4 % 128;
        int i5 = i4 % 2;
        return jA;
    }

    @Override // defpackage.stopListeningToRotationEvents
    public final float decodeFloat() {
        Tag tagRemove;
        int i = 2 % 2;
        int i2 = asInterface + 71;
        f147a = i2 % 128;
        if (i2 % 2 == 0) {
            ArrayList<Tag> arrayList = this.b;
            tagRemove = arrayList.remove(CollectionsKt.getLastIndex(arrayList));
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        } else {
            ArrayList<Tag> arrayList2 = this.b;
            tagRemove = arrayList2.remove(CollectionsKt.getLastIndex(arrayList2));
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        }
        float fTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(tagRemove);
        int i3 = asInterface + 111;
        f147a = i3 % 128;
        if (i3 % 2 != 0) {
            return fTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.stopListeningToRotationEvents
    public final double decodeDouble() {
        int i = 2 % 2;
        int i2 = f147a + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ArrayList<Tag> arrayList = this.b;
        Tag tagRemove = arrayList.remove(CollectionsKt.getLastIndex(arrayList));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        double dTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(tagRemove);
        int i4 = f147a + 111;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return dTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.stopListeningToRotationEvents
    public final char decodeChar() {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        f147a = i2 % 128;
        int i3 = i2 % 2;
        ArrayList<Tag> arrayList = this.b;
        Tag tagRemove = arrayList.remove(CollectionsKt.getLastIndex(arrayList));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        char cTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(tagRemove);
        int i4 = f147a + 25;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return cTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        throw null;
    }

    @Override // defpackage.stopListeningToRotationEvents
    public final String decodeString() {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        f147a = i2 % 128;
        int i3 = i2 % 2;
        ArrayList<Tag> arrayList = this.b;
        Tag tagRemove = arrayList.remove(CollectionsKt.getLastIndex(arrayList));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        String strAsBinder = asBinder(tagRemove);
        int i4 = asInterface + 91;
        f147a = i4 % 128;
        if (i4 % 2 != 0) {
            return strAsBinder;
        }
        throw null;
    }

    @Override // defpackage.stopListeningToRotationEvents
    public final int decodeEnum(createImageAnalysis createimageanalysis) {
        Tag tagRemove;
        int i = 2 % 2;
        int i2 = asInterface + 27;
        f147a = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(createimageanalysis, "");
            ArrayList<Tag> arrayList = this.b;
            tagRemove = arrayList.remove(CollectionsKt.getLastIndex(arrayList));
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
        } else {
            Intrinsics.checkNotNullParameter(createimageanalysis, "");
            ArrayList<Tag> arrayList2 = this.b;
            tagRemove = arrayList2.remove(CollectionsKt.getLastIndex(arrayList2));
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(tagRemove, createimageanalysis);
        int i3 = f147a + 13;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.stopListeningToRotationEvents
    public setActiveRecording beginStructure(createImageAnalysis createimageanalysis) {
        int i = 2 % 2;
        int i2 = f147a + 105;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(createimageanalysis, "");
            return this;
        }
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        throw null;
    }

    @Override // defpackage.setActiveRecording
    public final boolean decodeBooleanElement(createImageAnalysis createimageanalysis, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 37;
        f147a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        boolean zB = b(b(createimageanalysis, i));
        int i5 = asInterface + 57;
        f147a = i5 % 128;
        int i6 = i5 % 2;
        return zB;
    }

    @Override // defpackage.setActiveRecording
    public final byte decodeByteElement(createImageAnalysis createimageanalysis, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 71;
        f147a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        byte bTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(b(createimageanalysis, i));
        int i5 = f147a + 67;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return bTuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.setActiveRecording
    public final short decodeShortElement(createImageAnalysis createimageanalysis, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 71;
        f147a = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(createimageanalysis, "");
            return d(b(createimageanalysis, i));
        }
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        short sD = d(b(createimageanalysis, i));
        int i4 = 31 / 0;
        return sD;
    }

    @Override // defpackage.setActiveRecording
    public final int decodeIntElement(createImageAnalysis createimageanalysis, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 125;
        f147a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        int iG = g(b(createimageanalysis, i));
        int i5 = f147a + 99;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return iG;
    }

    @Override // defpackage.setActiveRecording
    public final long decodeLongElement(createImageAnalysis createimageanalysis, int i) {
        long jA;
        int i2 = 2 % 2;
        int i3 = asInterface + 119;
        f147a = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(createimageanalysis, "");
            jA = a(b(createimageanalysis, i));
            int i4 = 55 / 0;
        } else {
            Intrinsics.checkNotNullParameter(createimageanalysis, "");
            jA = a(b(createimageanalysis, i));
        }
        int i5 = asInterface + 51;
        f147a = i5 % 128;
        int i6 = i5 % 2;
        return jA;
    }

    @Override // defpackage.setActiveRecording
    public final float decodeFloatElement(createImageAnalysis createimageanalysis, int i) {
        int i2 = 2 % 2;
        int i3 = f147a + 11;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(createimageanalysis, "");
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(b(createimageanalysis, i));
        }
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        float fTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(b(createimageanalysis, i));
        int i4 = 18 / 0;
        return fTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.setActiveRecording
    public final double decodeDoubleElement(createImageAnalysis createimageanalysis, int i) {
        int i2 = 2 % 2;
        int i3 = f147a + 111;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        double dTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(b(createimageanalysis, i));
        int i5 = asInterface + 79;
        f147a = i5 % 128;
        int i6 = i5 % 2;
        return dTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.setActiveRecording
    public final char decodeCharElement(createImageAnalysis createimageanalysis, int i) {
        int i2 = 2 % 2;
        int i3 = f147a + 37;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(createimageanalysis, "");
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(b(createimageanalysis, i));
        }
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(b(createimageanalysis, i));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.setActiveRecording
    public final String decodeStringElement(createImageAnalysis createimageanalysis, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 69;
        f147a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        String strAsBinder = asBinder(b(createimageanalysis, i));
        int i5 = f147a + 41;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return strAsBinder;
    }

    @Override // defpackage.setActiveRecording
    public final stopListeningToRotationEvents decodeInlineElement(createImageAnalysis createimageanalysis, int i) {
        int i2 = 2 % 2;
        int i3 = f147a + 63;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(createimageanalysis, "");
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(b(createimageanalysis, i), createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i));
            throw null;
        }
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        stopListeningToRotationEvents stoplisteningtorotationeventsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(b(createimageanalysis, i), createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i));
        int i4 = f147a + 43;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return stoplisteningtorotationeventsTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        final ForwardingLiveData forwardingLiveData = (ForwardingLiveData) objArr[0];
        createImageAnalysis createimageanalysis = (createImageAnalysis) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        final isBitDepthMatched isbitdepthmatched = (isBitDepthMatched) objArr[3];
        final Object obj = objArr[4];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        Intrinsics.checkNotNullParameter(isbitdepthmatched, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = forwardingLiveData.TuitionPaymentFragmentspecialinlinedviewModeldefault3(forwardingLiveData.b(createimageanalysis, iIntValue), (Function0<? extends Object>) new Function0() { // from class: nameOf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ForwardingLiveData.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, isbitdepthmatched, obj);
            }
        });
        int i2 = f147a + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object b(Object[] objArr) {
        final ForwardingLiveData forwardingLiveData = (ForwardingLiveData) objArr[0];
        createImageAnalysis createimageanalysis = (createImageAnalysis) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        final isBitDepthMatched isbitdepthmatched = (isBitDepthMatched) objArr[3];
        final Object obj = objArr[4];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        Intrinsics.checkNotNullParameter(isbitdepthmatched, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = forwardingLiveData.TuitionPaymentFragmentspecialinlinedviewModeldefault3(forwardingLiveData.b(createimageanalysis, iIntValue), (Function0<? extends Object>) new Function0() { // from class: ForwardingLiveDataExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ForwardingLiveData.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, isbitdepthmatched, obj);
            }
        });
        int i2 = asInterface + 39;
        f147a = i2 % 128;
        if (i2 % 2 != 0) {
            return objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        throw null;
    }

    private final <E> E TuitionPaymentFragmentspecialinlinedviewModeldefault3(Tag tag, Function0<? extends E> function0) {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        f147a = i2 % 128;
        int i3 = i2 % 2;
        this.b.add(tag);
        E eInvoke = function0.invoke();
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            ArrayList<Tag> arrayList = this.b;
            arrayList.remove(CollectionsKt.getLastIndex(arrayList));
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            int i4 = f147a + 77;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
        return eInvoke;
    }

    public final ArrayList<Tag> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = f147a;
        int i3 = i2 + 99;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        ArrayList<Tag> arrayList = this.b;
        int i5 = i2 + 33;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return arrayList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        ForwardingLiveData forwardingLiveData = (ForwardingLiveData) objArr[0];
        int i = 2 % 2;
        int i2 = f147a + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) forwardingLiveData.b);
        int i4 = f147a + 43;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return objLastOrNull;
    }

    protected final void INotificationSideChannel(Tag tag) {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        f147a = i2 % 128;
        int i3 = i2 % 2;
        this.b.add(tag);
        int i4 = f147a + 15;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(ForwardingLiveData forwardingLiveData, isBitDepthMatched isbitdepthmatched, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        f147a = i2 % 128;
        int i3 = i2 % 2;
        ForwardingLiveData forwardingLiveData2 = forwardingLiveData;
        if (!isbitdepthmatched.getDescriptor().d()) {
            int i4 = asInterface + 73;
            f147a = i4 % 128;
            int i5 = i4 % 2;
            if (!forwardingLiveData2.decodeNotNullMark()) {
                int i6 = f147a + 3;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                return forwardingLiveData2.decodeNull();
            }
        }
        Intrinsics.checkNotNullParameter(isbitdepthmatched, "");
        return forwardingLiveData.decodeSerializableValue(isbitdepthmatched);
    }

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(ForwardingLiveData forwardingLiveData, isBitDepthMatched isbitdepthmatched, Object obj) {
        int i = 2 % 2;
        int i2 = f147a + 19;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(isbitdepthmatched, "");
            forwardingLiveData.decodeSerializableValue(isbitdepthmatched);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(isbitdepthmatched, "");
        Object objDecodeSerializableValue = forwardingLiveData.decodeSerializableValue(isbitdepthmatched);
        int i3 = f147a + 125;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 87 / 0;
        }
        return objDecodeSerializableValue;
    }

    @Override // defpackage.setActiveRecording
    public PreviewViewImplementationOnSurfaceNotInUseListener getSerializersModule() {
        PreviewViewImplementationOnSurfaceNotInUseListener previewViewImplementationOnSurfaceNotInUseListenerB;
        int i = 2 % 2;
        int i2 = f147a + 55;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            previewViewImplementationOnSurfaceNotInUseListenerB = waitForNextFrame.b();
            int i3 = 31 / 0;
        } else {
            previewViewImplementationOnSurfaceNotInUseListenerB = waitForNextFrame.b();
        }
        int i4 = f147a + 55;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return previewViewImplementationOnSurfaceNotInUseListenerB;
    }

    @Override // defpackage.stopListeningToRotationEvents
    public final boolean decodeBoolean() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return ((Boolean) b(new Object[]{this}, 520428327, -520428326, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2())).booleanValue();
    }

    @Override // defpackage.stopListeningToRotationEvents
    public final Void decodeNull() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Void) b(new Object[]{this}, -786108679, 786108682, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // defpackage.setActiveRecording
    public final <T> T decodeNullableSerializableElement(createImageAnalysis createimageanalysis, int i, isBitDepthMatched<? extends T> isbitdepthmatched, T t) {
        Object[] objArr = {this, createimageanalysis, Integer.valueOf(i), isbitdepthmatched, t};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (T) b(objArr, 480258157, -480258152, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // defpackage.setActiveRecording
    public final <T> T decodeSerializableElement(createImageAnalysis createimageanalysis, int i, isBitDepthMatched<? extends T> isbitdepthmatched, T t) {
        Object[] objArr = {this, createimageanalysis, Integer.valueOf(i), isbitdepthmatched, t};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (T) b(objArr, 480059619, -480059617, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    protected boolean asInterface(Tag tag) {
        int i = 2 % 2;
        int i2 = f147a;
        int i3 = i2 + 33;
        asInterface = i3 % 128;
        boolean z = !(i3 % 2 != 0);
        int i4 = i2 + 61;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    private Object TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return b(new Object[]{this}, 219140594, -219140590, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // defpackage.setActiveRecording
    public void endStructure(createImageAnalysis createimageanalysis) {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        f147a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        int i4 = f147a + 115;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    protected final Tag u_() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Tag) b(new Object[]{this}, 744126603, -744126603, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r5, byte r6, byte r7) {
        /*
            byte[] r0 = defpackage.ForwardingLiveData.$$c
            int r7 = 104 - r7
            int r6 = r6 + 4
            int r5 = r5 * 2
            int r1 = 1 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            int r5 = 0 - r5
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L20:
            int r6 = r6 + 1
            r4 = r0[r6]
            int r3 = r3 + 1
        L26:
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ForwardingLiveData.$$i(int, byte, byte):java.lang.String");
    }
}
