package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LlambdastartPreviewStreamStateFlow1androidxcameraviewPreviewStreamStateObserver;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "Lkotlin/UShortArray;", "LonRotationChanged;", "Lkotlin/UShort;", "LupdatePreviewStreamState;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdastartPreviewStreamStateFlow1androidxcameraviewPreviewStreamStateObserver extends onRotationChanged<UShort, UShortArray, updatePreviewStreamState> {
    public static final lambdastartPreviewStreamStateFlow1androidxcameraviewPreviewStreamStateObserver INSTANCE;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int b;
    private static final byte[] $$c = {101, 89, 94, -73};
    private static final int $$f = 210;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {94, -56, 58, -24, -41, -9, -7, -21, -8, 9, -9, -18, -1, 10, -42, -5, 4, -3, -10, -10, -22, 38, -59, -4, 7, -21, -4, 5, -19, 17, -46, 3, -14, 4, -5, -23, 3, -2, 15, -29, -20, 3, -10, -5, 41, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 59};
    private static final int $$e = 133;
    private static final byte[] $$a = {30, 17, -35, 104, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 185;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    private static void a(short s, int i, byte b2, Object[] objArr) {
        int i2 = 98 - (s * 14);
        byte[] bArr = $$a;
        int i3 = 56 - (i * 52);
        byte[] bArr2 = new byte[b2 + 1];
        int i4 = -1;
        if (bArr == null) {
            int i5 = (i3 + b2) - 10;
            i3++;
            i2 = i5;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == b2) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3++;
            i2 = (i2 + bArr[i3]) - 10;
        }
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
    private static void d(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 16
            int r8 = r8 + 68
            byte[] r0 = defpackage.lambdastartPreviewStreamStateFlow1androidxcameraviewPreviewStreamStateObserver.$$d
            int r7 = r7 * 11
            int r1 = r7 + 42
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r7 = r7 + 41
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L2e:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-8)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdastartPreviewStreamStateFlow1androidxcameraviewPreviewStreamStateObserver.d(int, byte, byte, java.lang.Object[]):void");
    }

    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        int i5 = $11 + 77;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i7 = $11 + 107;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i9 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 3292, 32 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1199271174, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) KeyEvent.normalizeMetaState(0), 650 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.lastIndexOf("", '0', 0, 0) + 45, -450685997, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 652 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 45, -450685997, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
        int i10 = $10 + 91;
        $11 = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object obj) {
        int i = 2 % 2;
        short[] storage = ((UShortArray) obj).getStorage();
        Intrinsics.checkNotNullParameter(storage, "");
        Object obj2 = null;
        updatePreviewStreamState updatepreviewstreamstate = new updatePreviewStreamState(storage, null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return updatepreviewstreamstate;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat, defpackage.speedUpZoomBy2X
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setActiveRecording setactiverecording, int i, Object obj, boolean z) {
        int i2 = 2 % 2;
        int i3 = g + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        updatePreviewStreamState updatepreviewstreamstate = (updatePreviewStreamState) obj;
        Intrinsics.checkNotNullParameter(setactiverecording, "");
        Intrinsics.checkNotNullParameter(updatepreviewstreamstate, "");
        short sM8310constructorimpl = UShort.m8310constructorimpl(setactiverecording.decodeInlineElement(getDescriptor(), i).decodeShort());
        updatePreviewStreamState updatepreviewstreamstate2 = updatepreviewstreamstate;
        updatepreviewstreamstate2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(updatepreviewstreamstate2.getTuitionPaymentFragmentspecialinlinedviewModeldefault1() + 1);
        short[] sArr = updatepreviewstreamstate.TuitionPaymentFragmentbindingInflater1;
        int i5 = updatepreviewstreamstate.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        updatepreviewstreamstate.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 + 1;
        UShortArray.m8373set01HTLdE(sArr, i5, sM8310constructorimpl);
        int i6 = g + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int b(Object obj) {
        int i = 2 % 2;
        int i2 = g + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        short[] storage = ((UShortArray) obj).getStorage();
        Intrinsics.checkNotNullParameter(storage, "");
        int iM8369getSizeimpl = UShortArray.m8369getSizeimpl(storage);
        int i4 = g + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return iM8369getSizeimpl;
    }

    @Override // defpackage.onRotationChanged
    public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(isUseCaseEnabled isusecaseenabled, UShortArray uShortArray, int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i3 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 31533);
            int iResolveOpacity = 921 - Drawable.resolveOpacity(0, 0);
            int i4 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27;
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[37], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength, iResolveOpacity, i4, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(true, (ViewConfiguration.getFadingEdgeLength() >> 16) + 123, 21 - TextUtils.indexOf((CharSequence) "", '0', 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 9, new char[]{'\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(false, TextUtils.getOffsetAfter("", 0) + 127, 15 - TextUtils.getTrimmedLength(""), 8 - Color.alpha(0), new char[]{65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0'));
            int iBlue = Color.blue(0) + 921;
            int longPressTimeout = 28 - (ViewConfiguration.getLongPressTimeout() >> 16);
            byte b3 = $$a[37];
            Object[] objArr5 = new Object[1];
            a(b3, b3, (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, iBlue, longPressTimeout, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (31533 - TextUtils.indexOf("", "", 0, 0));
                int i5 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 920;
                int longPressTimeout2 = 28 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte[] bArr2 = $$a;
                byte b4 = bArr2[37];
                byte b5 = bArr2[80];
                Object[] objArr6 = new Object[1];
                a(b4, b5, (byte) (b5 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, i5, longPressTimeout2, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i6}, (String[]) objArr7[4]};
            int iMyPid = Process.myPid();
            int i7 = ~iMyPid;
            int i8 = 1011567331 + (((~((-782663646) | i7)) | (~((-991415999) | iMyPid))) * 217) + (((~(iMyPid | (-782663646))) | 705056412) * 217) + (((~((-991415999) | i7)) | 782663645) * 217) + 1719623131;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(true, TextUtils.lastIndexOf("", '0') + 124, Color.red(0) + 26, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9, new char[]{65534, 65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, '\r', '\r'}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(false, 130 - Color.green(0), (-16777198) - Color.rgb(0, 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 18, new char[]{65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    int i11 = g + 35;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                    int i12 = i11 % 2;
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(i), 0, 1719623131};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[12];
                byte b7 = bArr3[55];
                Object[] objArr11 = new Object[1];
                d(b6, b7, b7, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b8 = (byte) (bArr3[44] - 1);
                byte b9 = bArr3[78];
                Object[] objArr12 = new Object[1];
                d(b8, b9, b9, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cAxisFromString = (char) (31532 - MotionEvent.axisFromString(""));
                    int i13 = 922 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 28;
                    byte[] bArr4 = $$a;
                    byte b10 = bArr4[37];
                    byte b11 = bArr4[80];
                    Object[] objArr13 = new Object[1];
                    a(b10, b11, (byte) (b11 | 37), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAxisFromString, i13, maxKeyCode, -1142834547, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(true, 123 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22, ExpandableListView.getPackedPositionType(0L) + 9, new char[]{'\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16}, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(false, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 9 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new char[]{65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533}, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31532);
                        int gidForName = 920 - Process.getGidForName("");
                        int gidForName2 = Process.getGidForName("") + 29;
                        byte b12 = $$a[37];
                        Object[] objArr16 = new Object[1];
                        a(b12, b12, (byte) 52, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, gidForName, gidForName2, -778300370, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf2 = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                        int packedPositionGroup = 921 - ExpandableListView.getPackedPositionGroup(0L);
                        int i14 = 28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte[] bArr5 = $$a;
                        byte b13 = bArr5[80];
                        Object[] objArr17 = new Object[1];
                        a(b13, bArr5[37], b13, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, packedPositionGroup, i14, -1048449946, false, (String) objArr17[0], null);
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[3])[0];
        if (i16 == i15) {
            int i17 = ((int[]) objArr[0])[0];
            int i18 = ((int[]) objArr[3])[0];
            int i19 = ((int[]) objArr[1])[0];
            new int[1][0] = i18;
            new int[1][0] = i19;
            int i20 = ~i;
            int i21 = i17 + 368369911 + ((i | 2361634) * 988) + (((~(845416894 | i20)) | 85607489) * (-1976)) + ((2361634 | (~((-928662750) | i)) | (~(i20 | 928662749))) * 988);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            int[] iArr = {i23 ^ (i23 << 5)};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i24 = 0;
                while (i24 < strArr.length) {
                    int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
                    g = i25 % 128;
                    if (i25 % 2 == 0) {
                        arrayList.add(strArr[i24]);
                        i24 += 63;
                    } else {
                        arrayList.add(strArr[i24]);
                        i24++;
                    }
                }
            }
            Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
            int i26 = ((int[]) objArr[0])[0];
            int i27 = ((int[]) objArr[3])[0];
            Object[] objArr18 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i27}, (String[]) objArr[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i28 = ~iElapsedRealtime;
            int i29 = ~(935051132 | i28);
            int i30 = i26 + 2125450227 + ((3 | i29) * (-712)) + (((~(iElapsedRealtime | 935051135)) | (~(i28 | (-4)))) * (-712)) + (((-839028512) | i29) * 712);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr18[0])[0] = i32 ^ (i32 << 5);
        }
        short[] storage = uShortArray.getStorage();
        Intrinsics.checkNotNullParameter(isusecaseenabled, "");
        Intrinsics.checkNotNullParameter(storage, "");
        while (i3 < i) {
            isusecaseenabled.encodeInlineElement(getDescriptor(), i3).encodeShort(UShortArray.m8368getMh2AYeg(storage, i3));
            i3++;
            int i33 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
            g = i33 % 128;
            int i34 = i33 % 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private lambdastartPreviewStreamStateFlow1androidxcameraviewPreviewStreamStateObserver() {
        super(PreviewStreamStateObserverExternalSyntheticLambda0.INSTANCE);
        Intrinsics.checkNotNullParameter(UShort.INSTANCE, "");
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ UShortArray b() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        g = i2 % 128;
        return i2 % 2 == 0 ? UShortArray.m8361boximpl(UShortArray.m8362constructorimpl(0)) : UShortArray.m8361boximpl(UShortArray.m8362constructorimpl(0));
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        TuitionPaymentFragmentbindingInflater1();
        INSTANCE = new lambdastartPreviewStreamStateFlow1androidxcameraviewPreviewStreamStateObserver();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        int i2 = i % 2;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        b = -83722374;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r5, byte r6, short r7) {
        /*
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r7 = r7 + 119
            int r5 = r5 * 2
            int r5 = 1 - r5
            byte[] r0 = defpackage.lambdastartPreviewStreamStateFlow1androidxcameraviewPreviewStreamStateObserver.$$c
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r5
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r4 = r0[r6]
        L27:
            int r7 = r7 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdastartPreviewStreamStateFlow1androidxcameraviewPreviewStreamStateObserver.$$g(int, byte, short):java.lang.String");
    }
}
