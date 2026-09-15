package defpackage;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.scholarship.model.request.ScholarshipPhotoPersonForInsert;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J!\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00112\n\u0010\u0014\u001a\u00060\u0016j\u0002`\u0015H\u0016¢\u0006\u0002\u0010\u0017J\u001e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001cH\u0016J)\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001a2\n\u0010\u0014\u001a\u00060\u0016j\u0002`\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u001fJ!\u0010 \u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00112\n\u0010\u0014\u001a\u00060\u0016j\u0002`\u0015H\u0002¢\u0006\u0002\u0010\u0017J\b\u0010!\u001a\u00020\u0006H\u0016J\u0013\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u0000X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006'"}, d2 = {"Lkotlinx/coroutines/android/HandlerContext;", "Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/Delay;", "handler", "Landroid/os/Handler;", "name", "", "invokeImmediately", "", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "immediate", "getImmediate", "()Lkotlinx/coroutines/android/HandlerContext;", "isDispatchNeeded", "context", "Lkotlin/coroutines/CoroutineContext;", "dispatch", "", "block", "Lkotlinx/coroutines/Runnable;", "Ljava/lang/Runnable;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "scheduleResumeAfterDelay", "timeMillis", "", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/DisposableHandle;", "cancelOnRejection", "toString", "equals", "other", "", "hashCode", "", "kotlinx-coroutines-android"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EncodeException extends getPresentationTimeUs {
    private final Handler TuitionPaymentFragmentbindingInflater1;
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final EncodeException TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {0, -94, -62, -97};
    private static final int $$d = 12;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {106, -66, 28, 119, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 44;
    private static int asInterface = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f132a = 1;
    private static char[] b = {59709, 59750, 59746, 59756, 59757, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59717, 59770, 59739, 59723, 59757, 59773, 59768, 59751, 59746, 59731, 59771, 59882, 59887, 59881, 59887, 59878, 59875, 59883, 59868, 59868, 59860, 59881, 59879, 59873, 59884, 59707, 59724, 59718, 59757, 59756, 59745, 59713, 59723, 59757, 59773, 59768, 59751, 59746, 59744, 59758, 59744, 59711, 59756, 59759, 59746, 59730, 59742, 59750, 59745, 59743, 59755, 59773, 59749, 59749, 59770, 59746, 59759};

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i2) | i6);
        int i8 = ~i4;
        int i9 = i7 | (~(i8 | i6));
        int i10 = ~i6;
        int i11 = ~(i10 | i8);
        int i12 = ~(i10 | i2);
        int i13 = (~(i8 | i2)) | i11 | i12;
        int i14 = (~(i4 | i10)) | i12;
        int i15 = i2 + i6 + i + (1039959776 * i3) + ((-2046201414) * i5);
        int i16 = i15 * i15;
        int i17 = ((357140864 * i2) - 8388608) + ((-1785926397) * i6) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i) + ((-201326592) * i3) + ((-406847488) * i5) + (529399808 * i16);
        int i18 = ((i2 * 868240256) - 1765242424) + (i6 * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (i * 868239597) + (i3 * 817356128) + (i5 * 406493490) + (i16 * 645267456);
        return i17 + ((i18 * i18) * 681705472) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
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
    private static void c(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 15
            int r0 = r7 + 38
            byte[] r1 = defpackage.EncodeException.$$a
            int r8 = r8 * 4
            int r8 = 84 - r8
            int r6 = 92 - r6
            byte[] r0 = new byte[r0]
            int r7 = r7 + 37
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L30
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
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
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.EncodeException.c(byte, byte, int, java.lang.Object[]):void");
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements Runnable {
        private /* synthetic */ EncodeException TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private /* synthetic */ MediaFormatMustNotUseFrameRateToFindEncoderQuirk b;

        @Override // java.lang.Runnable
        public final void run() {
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, Unit.INSTANCE);
        }

        public TuitionPaymentFragmentbindingInflater1(MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirk, EncodeException encodeException) {
            this.b = mediaFormatMustNotUseFrameRateToFindEncoderQuirk;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = encodeException;
        }
    }

    @Override // defpackage.setInputTimebase
    public final /* synthetic */ setInputTimebase TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = f132a + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        EncodeException encodeExceptionB = b();
        int i4 = asInterface + 35;
        f132a = i4 % 128;
        int i5 = i4 % 2;
        return encodeExceptionB;
    }

    private static void d(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        char c = 0;
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = b;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 27;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    try {
                        Object[] objArr2 = new Object[i4];
                        objArr2[c] = Integer.valueOf(cArr[i8]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            int iIndexOf = 1269 - TextUtils.indexOf((CharSequence) "", '0');
                            int fadingEdgeLength = 18 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            byte b2 = $$c[c];
                            byte b3 = (byte) (b2 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop, iIndexOf, fadingEdgeLength, 407021364, false, $$e(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cBlue = (char) Color.blue(0);
                        int i10 = 1269 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int scrollDefaultDelay = 18 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        byte b4 = $$c[0];
                        byte b5 = (byte) (b4 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, i10, scrollDefaultDelay, 407021364, false, $$e(b4, b5, (byte) (-b5)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i8++;
                }
                c = 0;
                i4 = 1;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i3, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            setvideostabilizationmode.b = 0;
            char c2 = 0;
            while (setvideostabilizationmode.b < i5) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i11 = $10 + 51;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = setvideostabilizationmode.b;
                        Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cMyPid = (char) (Process.myPid() >> 22);
                            int i13 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3225;
                            int iAlpha = Color.alpha(0) + 13;
                            byte b6 = $$c[0];
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyPid, i13, iAlpha, 2133916302, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        Object obj = null;
                        cArr4[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                        obj.hashCode();
                        throw null;
                    }
                    int i14 = setvideostabilizationmode.b;
                    Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int iIndexOf2 = TextUtils.indexOf("", "") + 3225;
                        int iAlpha2 = 13 - Color.alpha(0);
                        byte b8 = $$c[0];
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize, iIndexOf2, iAlpha2, 2133916302, false, $$e(b8, b9, (byte) (b9 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                } else {
                    int i15 = setvideostabilizationmode.b;
                    Object[] objArr6 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char keyRepeatDelay = (char) (29944 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        int capsMode = 1755 - TextUtils.getCapsMode("", 0, 0);
                        int iResolveOpacity = 23 - Drawable.resolveOpacity(0, 0);
                        byte b10 = $$c[0];
                        byte b11 = (byte) (b10 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatDelay, capsMode, iResolveOpacity, 387247676, false, $$e(b10, b11, (byte) (b11 - 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).charValue();
                }
                c2 = cArr4[setvideostabilizationmode.b];
                Object[] objArr7 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c3 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 41241);
                    int absoluteGravity = 1705 - Gravity.getAbsoluteGravity(0, 0);
                    int maximumDrawingCacheSize = 21 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    byte b12 = $$c[0];
                    byte b13 = b12;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, absoluteGravity, maximumDrawingCacheSize, -1434471773, false, $$e(b13, (byte) (b13 | 6), (byte) (b12 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            int i16 = $11 + 83;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            char[] cArr5 = new char[i5];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i18 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i18, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i18);
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
                int i19 = $10 + 41;
                $11 = i19 % 128;
                int i20 = i19 % 2;
                cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                i = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            setvideostabilizationmode.b = 0;
            int i21 = $11 + 5;
            $10 = i21 % 128;
            int i22 = 2;
            int i23 = i21 % 2;
            while (setvideostabilizationmode.b < i5) {
                int i24 = $11 + 79;
                $10 = i24 % 128;
                if (i24 % i22 != 0) {
                    cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[5]);
                    setvideostabilizationmode.b--;
                    i22 = 2;
                } else {
                    cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                    setvideostabilizationmode.b++;
                    i22 = 2;
                }
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override // defpackage.getPresentationTimeUs
    public final /* synthetic */ getPresentationTimeUs TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        int i = 2 % 2;
        int i2 = f132a + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatDelay = (char) (29944 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
            int offsetAfter = 1755 - TextUtils.getOffsetAfter("", 0);
            int tapTimeout = 23 - (ViewConfiguration.getTapTimeout() >> 16);
            byte b2 = $$a[7];
            Object[] objArr = new Object[1];
            c((byte) 89, b2, b2, objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, offsetAfter, tapTimeout, 986134021, false, (String) objArr[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr2 = new Object[1];
        d(new int[]{0, 22, 0, 4}, false, new byte[]{0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        d(new int[]{22, 15, 124, 1}, false, new byte[]{1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0}, objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRed = (char) (29944 - Color.red(0));
            int capsMode = 1755 - TextUtils.getCapsMode("", 0, 0);
            int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0', 0);
            byte[] bArr = $$a;
            Object[] objArr4 = new Object[1];
            c((byte) 52, bArr[28], bArr[7], objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed, capsMode, iLastIndexOf, 1596667560, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = asInterface + 81;
            f132a = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 29945);
                int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 1755;
                int i6 = 22 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                byte[] bArr2 = $$a;
                byte b3 = bArr2[7];
                Object[] objArr5 = new Object[1];
                c(b3, bArr2[28], b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, capsMode2, i6, 1599039318, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~iIdentityHashCode;
            int i8 = (((975682197 + ((iIdentityHashCode | (-575194476)) * 140)) + (((~((-575194476) | i7)) | 574669089) * (-280))) + (((~(iIdentityHashCode | (-574669090))) | ((~(787796901 | i7)) | (-788322288))) * 140)) - 1970642081;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i10 ^ (i10 << 5);
            int i11 = asInterface + 27;
            f132a = i11 % 128;
            int i12 = i11 % 2;
        } else {
            Object[] objArr7 = new Object[1];
            d(new int[]{37, 16, 0, 13}, false, new byte[]{1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1}, objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            d(new int[]{53, 16, 0, 1}, true, new byte[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1}, objArr8);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr9 = {724815130};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 42050), 1726 - TextUtils.indexOf("", ""), TextUtils.indexOf((CharSequence) "", '0', 0) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = DecorContentParent.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), -1970642081);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char minimumFlingVelocity = (char) (29944 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    int i13 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 23;
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[7];
                    Object[] objArr10 = new Object[1];
                    c(b4, bArr3[28], b4, objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity, i13, iNormalizeMetaState, 1599039318, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr11 = new Object[1];
                    d(new int[]{0, 22, 0, 4}, false, new byte[]{0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    d(new int[]{22, 15, 124, 1}, false, new byte[]{1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0}, objArr12);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cArgb = (char) (29944 - Color.argb(0, 0, 0, 0));
                        int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 1755;
                        int i14 = 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        byte[] bArr4 = $$a;
                        Object[] objArr13 = new Object[1];
                        c((byte) 52, bArr4[28], bArr4[7], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cArgb, iNormalizeMetaState2, i14, 1596667560, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char maxKeyCode = (char) (29944 - (KeyEvent.getMaxKeyCode() >> 16));
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1755;
                        int jumpTapTimeout = 23 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        byte b5 = $$a[7];
                        Object[] objArr14 = new Object[1];
                        c((byte) 89, b5, b5, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(maxKeyCode, absoluteGravity, jumpTapTimeout, 986134021, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i15 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i16 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr != null) {
                for (String str : strArr) {
                    int i17 = asInterface + 1;
                    f132a = i17 % 128;
                    int i18 = i17 % 2;
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i16));
        }
        int i19 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
        Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i20 = ~iIdentityHashCode2;
        int i21 = i19 + 1656480941 + (((~((-235671619) | i20)) | (~((-537961730) | iIdentityHashCode2)) | (~(796702539 | iIdentityHashCode2))) * 765) + (((~((-773633348) | i20)) | 235671618) * 1530) + (((~(iIdentityHashCode2 | (-773633348))) | (~(i20 | 796702539))) * 765);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr15[3])[0] = i23 ^ (i23 << 5);
        int i24 = asInterface + 51;
        int i25 = i24 % 128;
        f132a = i25;
        int i26 = i24 % 2;
        int i27 = i25 + 87;
        asInterface = i27 % 128;
        int i28 = i27 % 2;
        EncodeException encodeExceptionB = b();
        if (i28 == 0) {
            return encodeExceptionB;
        }
        throw null;
    }

    private EncodeException(Handler handler, String str, boolean z) {
        EncodeException encodeException;
        super(null);
        this.TuitionPaymentFragmentbindingInflater1 = handler;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
        if (z) {
            int i = asInterface + 21;
            f132a = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
            encodeException = this;
        } else {
            encodeException = new EncodeException(handler, str, true);
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = encodeException;
        int i4 = f132a + 9;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EncodeException(Handler handler, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = asInterface + 43;
            int i3 = i2 % 128;
            f132a = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 65;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str = null;
        }
        this(handler, str);
    }

    public EncodeException(Handler handler, String str) {
        this(handler, str, false);
    }

    private EncodeException b() {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        int i3 = i2 % 128;
        f132a = i3;
        int i4 = i2 % 2;
        EncodeException encodeException = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i5 = i3 + 65;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return encodeException;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(CoroutineContext context) {
        int i = 2 % 2;
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return true;
        }
        int i2 = f132a + 17;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.areEqual(Looper.myLooper(), this.TuitionPaymentFragmentbindingInflater1.getLooper());
            throw null;
        }
        if (!Intrinsics.areEqual(Looper.myLooper(), this.TuitionPaymentFragmentbindingInflater1.getLooper())) {
            return true;
        }
        int i3 = f132a + 79;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(CoroutineContext context, Runnable block) {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        f132a = i2 % 128;
        if (i2 % 2 == 0) {
            this.TuitionPaymentFragmentbindingInflater1.post(block);
            throw null;
        }
        if (!this.TuitionPaymentFragmentbindingInflater1.post(block)) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, block);
        }
        int i3 = f132a + 109;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // defpackage.selectSampleRateOrNearestSupported
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
        int i = 2 % 2;
        final TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1(mediaFormatMustNotUseFrameRateToFindEncoderQuirk, this);
        if (!this.TuitionPaymentFragmentbindingInflater1.postDelayed(tuitionPaymentFragmentbindingInflater1, RangesKt.coerceAtMost(j, 4611686018427387903L))) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(mediaFormatMustNotUseFrameRateToFindEncoderQuirk.get$context(), tuitionPaymentFragmentbindingInflater1);
            return;
        }
        mediaFormatMustNotUseFrameRateToFindEncoderQuirk.b(new Function1() { // from class: isKeyFrame
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return (Unit) EncodeException.TuitionPaymentFragmentspecialinlinedviewModeldefault2(ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -346446321, new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentbindingInflater1}, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 346446322);
            }
        });
        int i2 = f132a + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.getPresentationTimeUs, defpackage.selectSampleRateOrNearestSupported
    public final setCompatibleAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, final Runnable runnable, CoroutineContext coroutineContext) {
        int i = 2 % 2;
        int i2 = f132a + 73;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            this.TuitionPaymentFragmentbindingInflater1.postDelayed(runnable, RangesKt.coerceAtMost(j, 4611686018427387903L));
            throw null;
        }
        if (this.TuitionPaymentFragmentbindingInflater1.postDelayed(runnable, RangesKt.coerceAtMost(j, 4611686018427387903L))) {
            return new setCompatibleAudioProfile() { // from class: getClosedFuture
                @Override // defpackage.setCompatibleAudioProfile
                public final void dispose() {
                    EncodeException.TuitionPaymentFragmentspecialinlinedviewModeldefault2(ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -997507949, new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, runnable}, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 997507949);
                }
            };
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineContext, runnable);
        AutoValue_AudioEncoderConfigBuilder autoValue_AudioEncoderConfigBuilder = AutoValue_AudioEncoderConfigBuilder.INSTANCE;
        int i3 = f132a + 95;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return autoValue_AudioEncoderConfigBuilder;
        }
        throw null;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(CoroutineContext coroutineContext, Runnable runnable) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("The task was rejected, the handler underlying the dispatcher '");
        sb.append(this);
        sb.append("' was closed");
        CancellationException cancellationException = new CancellationException(sb.toString());
        VideoMimeInfoBuilder videoMimeInfoBuilder = (VideoMimeInfoBuilder) coroutineContext.get(VideoMimeInfoBuilder.b);
        if (videoMimeInfoBuilder != null) {
            int i2 = f132a + 51;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(cancellationException);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(cancellationException);
            int i3 = f132a + 55;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }
        Dispatchers.getIO().dispatch(coroutineContext, runnable);
    }

    @Override // defpackage.setInputTimebase, kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        int i = 2 % 2;
        String strTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
        if (strTuitionPaymentFragmentbindingInflater1 != null) {
            return strTuitionPaymentFragmentbindingInflater1;
        }
        int i2 = f132a + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String string = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (string == null) {
            string = this.TuitionPaymentFragmentbindingInflater1.toString();
            int i4 = asInterface + 103;
            f132a = i4 % 128;
            int i5 = i4 % 2;
        }
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(".immediate");
        return sb.toString();
    }

    public final boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = f132a;
        int i3 = i2 + 97;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        if (other instanceof EncodeException) {
            EncodeException encodeException = (EncodeException) other;
            if (encodeException.TuitionPaymentFragmentbindingInflater1 == this.TuitionPaymentFragmentbindingInflater1 && encodeException.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                int i6 = i4 + 95;
                f132a = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
        }
        int i8 = i2 + 53;
        asInterface = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 17 / 0;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iIdentityHashCode = System.identityHashCode(this.TuitionPaymentFragmentbindingInflater1);
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i3 = asInterface + 85;
            f132a = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 / 2;
            }
            i = 1231;
        } else {
            int i5 = f132a + 11;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            i = 1237;
        }
        return i ^ iIdentityHashCode;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        EncodeException encodeException = (EncodeException) objArr[0];
        Runnable runnable = (Runnable) objArr[1];
        int i = 2 % 2;
        int i2 = f132a + 75;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            encodeException.TuitionPaymentFragmentbindingInflater1.removeCallbacks(runnable);
            int i3 = 79 / 0;
        } else {
            encodeException.TuitionPaymentFragmentbindingInflater1.removeCallbacks(runnable);
        }
        int i4 = asInterface + 7;
        f132a = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        EncodeException encodeException = (EncodeException) objArr[0];
        Runnable runnable = (Runnable) objArr[1];
        int i = 2 % 2;
        int i2 = f132a + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        encodeException.TuitionPaymentFragmentbindingInflater1.removeCallbacks(runnable);
        Unit unit = Unit.INSTANCE;
        int i4 = f132a + 39;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(EncodeException encodeException, Runnable runnable) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -997507949, new Object[]{encodeException, runnable}, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 997507949);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(EncodeException encodeException, Runnable runnable) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -346446321, new Object[]{encodeException, runnable}, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 346446322);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, int r7, int r8) {
        /*
            byte[] r0 = defpackage.EncodeException.$$c
            int r8 = r8 + 4
            int r6 = r6 * 3
            int r1 = r6 + 1
            int r7 = r7 + 99
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r6
            r7 = r8
            r3 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L28:
            int r4 = -r4
            int r8 = r8 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.EncodeException.$$e(short, int, int):java.lang.String");
    }
}
