package com.bpjstku.presentation.membership.registration.nonsalariedworker;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import com.bpjstku.presentation.membership.registration.model.TuitionRate;
import defpackage.AudioEncoderConfigAudioProfileResolver;
import defpackage.CustomTabsIntent;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
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
import kotlin.jvm.internal.ByteCompanionObject;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.membership.registration.nonsalariedworker.TuitionRateBottomSheetDialogFragment$handleItemClicked$1", f = "TuitionRateBottomSheetDialogFragment.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
public final class TuitionRateBottomSheetDialogFragment$handleItemClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TuitionRate $data;
    int label;
    final /* synthetic */ CustomTabsIntent this$0;
    private static final byte[] $$c = {29, 88, -118, 32};
    private static final int $$f = 104;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {59, -124, -78, 46, -13, -10, 25, -53, -10, 14, -23, -16, -22, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$e = 142;
    private static final byte[] $$a = {83, ByteCompanionObject.MIN_VALUE, -37, -48, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 244;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int b = -83722438;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r7 = 53 - r7
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r0 = com.bpjstku.presentation.membership.registration.nonsalariedworker.TuitionRateBottomSheetDialogFragment$handleItemClicked$1.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r8 = r8 + 1
            r3 = r0[r8]
        L26:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-10)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.nonsalariedworker.TuitionRateBottomSheetDialogFragment$handleItemClicked$1.a(int, byte, byte, java.lang.Object[]):void");
    }

    private static void d(byte b2, short s, byte b3, Object[] objArr) {
        int i = b3 * 28;
        byte[] bArr = $$d;
        int i2 = 13 - (s * 9);
        int i3 = (b2 * 13) + 84;
        byte[] bArr2 = new byte[38 - i];
        int i4 = 37 - i;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i4 + (-i2)) - 10;
            i2++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i2;
            i3 = (i3 + (-bArr[i2])) - 10;
            i2 = i7 + 1;
            i5 = i6;
        }
    }

    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getScrollBarSize() >> 8) + 3291, View.getDefaultSize(0, 0) + 31, 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), 651 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.lastIndexOf("", '0') + 45, -450685997, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (i3 > 0) {
            int i6 = $10 + 87;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            int i8 = $10 + 25;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i10 = $11 + 105;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i2 % setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (MotionEvent.axisFromString("") + 1), 651 - KeyEvent.keyCodeFromString(""), 44 - TextUtils.indexOf("", "", 0), -450685997, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.resolveSizeAndState(0, 0, 0), 652 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43, -450685997, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                int i11 = $10 + 11;
                $11 = i11 % 128;
                int i12 = i11 % 2;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x026a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char absoluteGravity = (char) (31533 - Gravity.getAbsoluteGravity(0, 0));
            int scrollBarSize = 921 - (ViewConfiguration.getScrollBarSize() >> 8);
            int i2 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29;
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[7], (byte) ($$b & 63), bArr[37], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(absoluteGravity, scrollBarSize, i2, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(true, MotionEvent.axisFromString("") + 188, 22 - Color.alpha(0), 16 - KeyEvent.keyCodeFromString(""), new char[]{2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n'}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(true, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 191, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 15, ((byte) KeyEvent.getModifierMetaStateMask()) + 15, new char[]{6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31533);
            int iMakeMeasureSpec = 921 - View.MeasureSpec.makeMeasureSpec(0, 0);
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[80];
            Object[] objArr6 = new Object[1];
            a(b2, b2, bArr2[37], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iMakeMeasureSpec, minimumFlingVelocity, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 31533);
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 921;
                int i3 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                byte[] bArr3 = $$a;
                Object[] objArr7 = new Object[1];
                a(bArr3[80], (byte) (-bArr3[33]), (byte) 51, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, scrollBarFadeDuration, i3, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i4 = (((440064755 + (((-1228778844) | elapsedCpuTime) * 376)) + (((~((~elapsedCpuTime) | 273014178)) | (-1501429244)) * (-376))) + (((~(elapsedCpuTime | (-273014179))) | 1501065465) * 376)) - 1520409283;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
            int i7 = TuitionPaymentFragmentbindingInflater1 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            Object[] objArr9 = new Object[1];
            c(true, View.resolveSizeAndState(0, 0, 0) + 187, ((byte) KeyEvent.getModifierMetaStateMask()) + 27, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7, new char[]{1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534, 65483}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(false, 194 - TextUtils.getOffsetAfter("", 0), (KeyEvent.getMaxKeyCode() >> 16) + 18, 1 - KeyEvent.keyCodeFromString(""), new char[]{4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    applicationContext = applicationContext.getApplicationContext();
                } else {
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
                    TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                    int i10 = i9 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                }
            }
            Object[] objArr11 = new Object[1];
            c(true, TextUtils.indexOf("", "", 0) + 186, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 16, Color.red(0) + 2, new char[]{65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20}, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c(false, 190 - View.getDefaultSize(0, 0), 16 - (ViewConfiguration.getFadingEdgeLength() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9, new char[]{14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3}, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
            TuitionPaymentFragmentbindingInflater1 = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 0, -1520409283};
                byte[] bArr4 = $$d;
                byte b3 = bArr4[16];
                byte b4 = b3;
                Object[] objArr14 = new Object[1];
                d(b3, b4, b4, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b5 = bArr4[37];
                byte b6 = b5;
                Object[] objArr15 = new Object[1];
                d(b5, b6, b6, objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cMyTid = (char) ((Process.myTid() >> 22) + 31533);
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 921;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 29;
                    byte[] bArr5 = $$a;
                    Object[] objArr17 = new Object[1];
                    a(bArr5[80], (byte) (-bArr5[33]), (byte) 51, objArr17);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyTid, iKeyCodeFromString, iLastIndexOf, -1142834547, false, (String) objArr17[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                try {
                    Object[] objArr18 = new Object[1];
                    c(true, TextUtils.indexOf((CharSequence) "", '0', 0) + 188, 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), KeyEvent.keyCodeFromString("") + 16, new char[]{2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n'}, objArr18);
                    Class<?> cls5 = Class.forName((String) objArr18[0]);
                    Object[] objArr19 = new Object[1];
                    c(true, 192 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 16, 14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534}, objArr19);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 31534);
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 922;
                        int bitsPerPixel = 27 - ImageFormat.getBitsPerPixel(0);
                        byte[] bArr6 = $$a;
                        byte b7 = bArr6[80];
                        Object[] objArr20 = new Object[1];
                        a(b7, b7, bArr6[37], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(gidForName, iLastIndexOf2, bitsPerPixel, -778300370, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char gidForName2 = (char) (Process.getGidForName("") + 31534);
                        int iResolveSize = View.resolveSize(0, 0) + 921;
                        int iAxisFromString = MotionEvent.axisFromString("") + 29;
                        byte[] bArr7 = $$a;
                        Object[] objArr21 = new Object[1];
                        a(bArr7[7], (byte) ($$b & 63), bArr7[37], objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(gidForName2, iResolveSize, iAxisFromString, -1048449946, false, (String) objArr21[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr16;
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i16 = ~iIdentityHashCode;
            int i17 = i15 + (-1069496565) + ((iIdentityHashCode | 874235341) * 140) + (((~(874235341 | i16)) | 27265026) * (-280)) + (((~(iIdentityHashCode | (-27265027))) | (~(899844302 | i16)) | 1656065) * 140);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr2[0])[0] = i19 ^ (i19 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            int i20 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i21 = i20 + 1059589641 + (((-872570881) | (~iUptimeMillis)) * (-490)) + (((~(iUptimeMillis | (-900916753))) | 28345872) * 490) + 1646912520;
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr2[0])[0] = i23 ^ (i23 << 5);
        }
        int i24 = this.label;
        if (i24 != 0) {
            int i25 = ((int[]) objArr2[0])[0];
            int i26 = i25 * i25;
            int i27 = -(2051884409 * i25);
            int i28 = (i26 & i27) + (i26 | i27);
            int i29 = -(i25 * 63703637);
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            int i31 = (i30 ^ (-574147983)) + (((-574147983) & i30) << 1);
            int i32 = i31 >> 26;
            int i33 = ((i32 ^ ComposerKt.defaultsKey) + ((i32 & ComposerKt.defaultsKey) << 1)) / 64;
            int i34 = (i33 ^ 1) + ((i33 & 1) << 1);
            int i35 = (i31 & i34) + (i34 | i31);
            int i36 = ((i31 >> 24) - 511) / 256;
            int i37 = -(i35 ^ ((i36 ^ 1) + ((i36 & 1) << 1)));
            int i38 = (i37 & 6) + (i37 | 6);
            int i39 = i38 >> 15;
            int i40 = ((((-262143) | i39) << 1) - (i39 ^ (-262143))) / 131072;
            int i41 = (i40 ^ 1) + ((i40 & 1) << 1);
            if (i24 != 1590 / (((-(((i41 | 1) << 1) - (i41 ^ 1))) & i38) * 265)) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (AudioEncoderConfigAudioProfileResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault1(100L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Function1 function1 = this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (function1 != null) {
            int i42 = TuitionPaymentFragmentbindingInflater1 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i42 % 128;
            int i43 = i42 % 2;
            function1.invoke(this.$data);
        }
        this.this$0.dismiss();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        CoroutineScope coroutineScope2 = coroutineScope;
        Continuation<? super Unit> continuation2 = continuation;
        if (i2 % 2 != 0) {
            return ((TuitionRateBottomSheetDialogFragment$handleItemClicked$1) create(coroutineScope2, continuation2)).invokeSuspend(Unit.INSTANCE);
        }
        ((TuitionRateBottomSheetDialogFragment$handleItemClicked$1) create(coroutineScope2, continuation2)).invokeSuspend(Unit.INSTANCE);
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TuitionRateBottomSheetDialogFragment$handleItemClicked$1(CustomTabsIntent customTabsIntent, TuitionRate tuitionRate, Continuation<? super TuitionRateBottomSheetDialogFragment$handleItemClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = customTabsIntent;
        this.$data = tuitionRate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        int i = 2 % 2;
        TuitionRateBottomSheetDialogFragment$handleItemClicked$1 tuitionRateBottomSheetDialogFragment$handleItemClicked$1 = new TuitionRateBottomSheetDialogFragment$handleItemClicked$1(this.this$0, this.$data, continuation);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
        }
        return tuitionRateBottomSheetDialogFragment$handleItemClicked$1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, byte r7, short r8) {
        /*
            int r8 = 120 - r8
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r0 = com.bpjstku.presentation.membership.registration.nonsalariedworker.TuitionRateBottomSheetDialogFragment$handleItemClicked$1.$$c
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.nonsalariedworker.TuitionRateBottomSheetDialogFragment$handleItemClicked$1.$$g(int, byte, short):java.lang.String");
    }
}
