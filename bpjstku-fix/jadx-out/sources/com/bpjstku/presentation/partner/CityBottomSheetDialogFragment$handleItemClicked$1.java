package com.bpjstku.presentation.partner;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.domain.general.model.CodeNamePair;
import defpackage.AudioEncoderConfigAudioProfileResolver;
import defpackage.TrustedWebActivityService1;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.partner.CityBottomSheetDialogFragment$handleItemClicked$1", f = "CityBottomSheetDialogFragment.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
public final class CityBottomSheetDialogFragment$handleItemClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    final /* synthetic */ CodeNamePair $data;
    int label;
    final /* synthetic */ TrustedWebActivityService1 this$0;
    private static final byte[] $$a = {31, 115, -100, -11, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 118;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static long b = -1829464194933473687L;

    private static void a(byte b2, int i, int i2, Object[] objArr) {
        byte[] bArr = $$a;
        int i3 = 98 - (b2 * 14);
        int i4 = i2 + 4;
        byte[] bArr2 = new byte[i + 1];
        int i5 = -1;
        if (bArr == null) {
            int i6 = (i4 + i) - 11;
            i4 = i4;
            i3 = i6;
        }
        while (true) {
            i5++;
            int i7 = i4 + 1;
            bArr2[i5] = (byte) i3;
            if (i5 == i) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 = i7;
            i3 = (i3 + bArr[i7]) - 11;
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $11 + 11;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 2624 - TextUtils.getCapsMode("", 0, 0), 13 - View.MeasureSpec.getMode(0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() / (b + 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 39422), ((Process.getThreadPriority(0) + 20) >> 6) + 481, Color.green(0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 19472), 2623 - TextUtils.indexOf((CharSequence) "", '0', 0), Color.rgb(0, 0, 0) + 16777229, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (b ^ 9053247990562531611L);
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 39422), 481 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $10 + 99;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39422 - TextUtils.getOffsetAfter("", 0)), ExpandableListView.getPackedPositionGroup(0L) + 481, 37 - View.resolveSizeAndState(0, 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                int i7 = 63 / 0;
            } else {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                try {
                    Object[] objArr7 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (39421 - TextUtils.indexOf((CharSequence) "", '0', 0)), View.MeasureSpec.getSize(0) + 481, 37 - TextUtils.indexOf("", ""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i8 = $11 + 91;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
            int iIndexOf = TextUtils.indexOf("", "") + 651;
            int touchSlop = 44 - (ViewConfiguration.getTouchSlop() >> 8);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[80], (byte) ($$b & 189), bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iIndexOf, touchSlop, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{5907, 34167, 13248, 41025, 24241, 51980, 31124, 6065, 33861, 12994, 44914, 23992, 51727, 30830, 5852, 33618, 12719, 44586, 23704, 51948, 26445, 5598}, TextUtils.indexOf((CharSequence) "", '0', 0) + 37484, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{5911, 47913, 20349, 5031, 42973, 18948, 7772, 41633, 30383, 6908, 44344, 29019, 1423, 43476, 31765}, TextUtils.getOffsetBefore("", 0) + 44087, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int size = 651 - View.MeasureSpec.getSize(0);
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 44;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr5 = new Object[1];
            a(b2, b3, (byte) (b3 | 51), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, size, iKeyCodeFromString, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 652;
                int defaultSize = 44 - View.getDefaultSize(0, 0);
                byte b4 = $$a[80];
                Object[] objArr6 = new Object[1];
                a(b4, (byte) (b4 | 36), (byte) 51, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(doubleTapTimeout, packedPositionChild, defaultSize, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i2 = ((int[]) objArr7[2])[0];
            int i3 = ((int[]) objArr7[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = (((-1004469259) + (((~(779400632 | iIdentityHashCode)) | 782831442) * (-366))) + (((~(iIdentityHashCode | 788381690)) | 773850384) * 366)) - 444805802;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[3])[0] = i6 ^ (i6 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 1), TextUtils.lastIndexOf("", '0') + 1611, (KeyEvent.getMaxKeyCode() >> 16) + 26, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -444805802, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                    int i7 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 651;
                    int maxKeyCode = 44 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte b5 = $$a[7];
                    byte b6 = b5;
                    Object[] objArr9 = new Object[1];
                    a(b5, b6, (byte) (b6 | 51), objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, i7, maxKeyCode, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 695, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 63406), 793 - ((Process.getThreadPriority(0) + 20) >> 6), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 82), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf2 = (char) TextUtils.indexOf("", "");
                    int i8 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651;
                    int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 44;
                    byte b7 = $$a[80];
                    Object[] objArr10 = new Object[1];
                    a(b7, (byte) (b7 | 36), (byte) 51, objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, i8, iIndexOf2, -1595579076, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    c(new char[]{5907, 34167, 13248, 41025, 24241, 51980, 31124, 6065, 33861, 12994, 44914, 23992, 51727, 30830, 5852, 33618, 12719, 44586, 23704, 51948, 26445, 5598}, 37483 - View.MeasureSpec.getMode(0), objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(new char[]{5911, 47913, 20349, 5031, 42973, 18948, 7772, 41633, 30383, 6908, 44344, 29019, 1423, 43476, 31765}, (Process.myTid() >> 22) + 44087, objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c3 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 652;
                        int longPressTimeout = 44 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr13 = new Object[1];
                        a(b8, b9, (byte) (b9 | 51), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, bitsPerPixel, longPressTimeout, -873460649, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c4 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i9 = 652 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int offsetAfter = 44 - TextUtils.getOffsetAfter("", 0);
                        byte[] bArr2 = $$a;
                        Object[] objArr14 = new Object[1];
                        a(bArr2[80], (byte) ($$b & 189), bArr2[5], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c4, i9, offsetAfter, -459846511, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i10 = ((int[]) objArr[0])[0];
        int i11 = ((int[]) objArr[2])[0];
        if (i11 != i10) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i11));
        }
        Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
        int i12 = ((int[]) objArr[3])[0];
        int i13 = ((int[]) objArr[2])[0];
        int i14 = ((int[]) objArr[0])[0];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i15 = i12 + 1745876209 + (((~(913351290 | iIdentityHashCode2)) | 804992 | (~((-909920481) | iIdentityHashCode2))) * (-744)) + (((~iIdentityHashCode2) | 4235802) * 744) + ((iIdentityHashCode2 | (-804993)) * 744);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        Object obj2 = objArr15[3];
        ((int[]) obj2)[0] = i17 ^ (i17 << 5);
        int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        int i19 = i18 % 128;
        TuitionPaymentFragmentbindingInflater1 = i19;
        int i20 = i18 % 2;
        int i21 = this.label;
        if (i21 != 0) {
            int i22 = i19 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
            int i23 = i22 % 2;
            int i24 = ((int[]) obj2)[0];
            int i25 = i24 * i24;
            int i26 = -(315145276 * i24);
            int i27 = (((i25 ^ i26) + ((i25 & i26) << 1)) - (~(-(i24 * (-2056697234))))) - (-514136632);
            int i28 = i27 >> 23;
            int i29 = ((i28 & (-1023)) + (i28 | (-1023))) / 512;
            int i30 = (i29 ^ 1) + ((i29 & 1) << 1);
            int i31 = (i27 & i30) + (i30 | i27);
            int i32 = i27 >> 20;
            int i33 = (((i32 | (-8191)) << 1) - (i32 ^ (-8191))) / 4096;
            int i34 = -(((i33 ^ 1) + ((i33 & 1) << 1)) ^ i31);
            int i35 = ((i34 | 7) << 1) - (i34 ^ 7);
            int i36 = (((i35 >> 21) - 4095) / 2048) + 1;
            if (i21 != 8890 / (((-(((i36 | 1) << 1) - (i36 ^ 1))) & i35) * 1270)) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i37 = i19 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i37 % 128;
            if (i37 % 2 != 0) {
                ResultKt.throwOnFailure(obj);
                throw null;
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (AudioEncoderConfigAudioProfileResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault1(100L, this) == coroutine_suspended) {
                int i38 = TuitionPaymentFragmentbindingInflater1 + 105;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i38 % 128;
                int i39 = i38 % 2;
                return coroutine_suspended;
            }
        }
        Function1 function1 = this.this$0.TuitionPaymentFragmentbindingInflater1;
        if (function1 != null) {
            function1.invoke(this.$data);
            int i40 = TuitionPaymentFragmentbindingInflater1 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i40 % 128;
            int i41 = i40 % 2;
        }
        this.this$0.dismiss();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        CoroutineScope coroutineScope2 = coroutineScope;
        Continuation<? super Unit> continuation2 = continuation;
        if (i2 % 2 != 0) {
            ((CityBottomSheetDialogFragment$handleItemClicked$1) create(coroutineScope2, continuation2)).invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objInvokeSuspend = ((CityBottomSheetDialogFragment$handleItemClicked$1) create(coroutineScope2, continuation2)).invokeSuspend(Unit.INSTANCE);
        int i3 = TuitionPaymentFragmentbindingInflater1 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CityBottomSheetDialogFragment$handleItemClicked$1(TrustedWebActivityService1 trustedWebActivityService1, CodeNamePair codeNamePair, Continuation<? super CityBottomSheetDialogFragment$handleItemClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = trustedWebActivityService1;
        this.$data = codeNamePair;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        int i = 2 % 2;
        CityBottomSheetDialogFragment$handleItemClicked$1 cityBottomSheetDialogFragment$handleItemClicked$1 = new CityBottomSheetDialogFragment$handleItemClicked$1(this.this$0, this.$data, continuation);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return cityBottomSheetDialogFragment$handleItemClicked$1;
    }
}
