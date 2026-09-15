package kotlinx.coroutines.flow;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import androidx.exifinterface.media.ExifInterface;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import defpackage.addSignalEosTimeoutIfNeeded;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import defpackage.signalSourceStopped;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0015\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\bH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/flow/SharingCommand;", "count", "", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {174, 176, 178, 179, 181}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
public final class StartedWhileSubscribed$command$1 extends SuspendLambda implements Function3<addSignalEosTimeoutIfNeeded<? super SharingCommand>, Integer, Continuation<? super Unit>, Object> {
    /* synthetic */ int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ signalSourceStopped this$0;
    private static final byte[] $$a = {48, -110, 22, 55};
    private static final int $$b = 96;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int d = 0;
    private static int asInterface = 1;
    private static char[] b = {47361, 47414, 47367, 47363, 47446, 47392, 47442, 47445, 47451, 47332, 47360, 47455, 47394, 47439, 47453, 47384, 47413, 47407, 47409, 47450, 47395, 47438, 47436, 47382, 47441, 47393, 47440, 47435, 47452, 47375, 47380, 47404, 47412, 47444, 47448, 47449, 47447, 47415, 47419, 47454, 47371, 47362};
    private static int TuitionPaymentFragmentbindingInflater1 = 2047719620;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {59707, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59715, 59746, 59749, 59770, 59751, 59746, 59770, 59738, 59699, 59730, 59749, 59770, 59751, 59749, 59773, 59704, 59757, 59751, 59753, 59731, 59753, 59756, 59757, 59759, 59757, 59730, 59740, 59756, 59756, 59759, 59757, 59744, 59734, 59810, 59796, 59810, 59813, 59814, 59808, 59814, 59797, 59817, 59834, 59834, 59833, 59814, 59698, 59751, 59744, 59768, 59775, 59745, 59756, 59745, 59747, 59749, 59800, 59427, 59428, 59455, 59431, 59422, 59890, 59417, 59455, 59431, 59438, 59394, 59423, 59452, 59428, 59429, 59455, 59430, 59438, 59430, 59418, 59395, 59431, 59431, 59437, 59449, 59453, 59450, 59449, 59431, 59432, 59423, 59421, 59430, 59424, 59432, 59436, 59705, 59759, 59747, 59756, 59745, 59768, 59771, 59728, 59733, 59751, 59757, 59697, 59760, 59784, 59791, 59761, 59772, 59761, 59763, 59749, 59739, 59734, 59765, 59732, 59754, 59786, 59762, 59767, 59786, 59765, 59762, 59731, 59730, 59773, 59767, 59787, 59760, 59762, 59772, 59702, 59773, 59767, 59767, 59731, 59754, 59766, 59774, 59766, 59791, 59765, 59764, 59788, 59759, 59730, 59774, 59767, 59791, 59753, 59743, 59740, 59720, 59726, 59716, 59758, 59767, 59791, 59764, 59763, 59763, 59772, 59768, 59760, 59766, 59781, 59415, 59433, 59410, 59409, 59434, 59415, 59414, 59409, 59434, 59415, 59895, 59875, 59885, 59901, 59420, 59432, 59434, 59413, 59415, 59433, 59413, 59415};

    private static void a(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = b;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 2993 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), 17 - Color.argb(0, 0, 0, 0), 1182129903, false, $$c(b2, (byte) (b2 | 37), b2), new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i3++;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - View.MeasureSpec.getMode(0)), (ViewConfiguration.getScrollBarSize() >> 8) + 253, KeyEvent.keyCodeFromString("") + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        double d2 = 0.0d;
        int i4 = 33602;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b3 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.MeasureSpec.getMode(0) + 33602), 3085 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > d2 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d2 ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 26, -2146875848, false, $$c(b3, (byte) (b3 | 38), b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i5 = $10 + 59;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                d2 = 0.0d;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i7 = $10 + 25;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = $11 + 95;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i11 = $11 + 101;
        $10 = i11 % 128;
        int i12 = i11 % 2;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b4 = (byte) 0;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + i4), 3085 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 27 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -2146875848, false, $$c(b4, (byte) (b4 | 38), b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            i4 = 33602;
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00af A[PHI: r0
  0x00af: PHI (r0v5 addSignalEosTimeoutIfNeeded) = (r0v4 addSignalEosTimeoutIfNeeded), (r0v10 addSignalEosTimeoutIfNeeded) binds: [B:37:0x00ad, B:23:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2 A[PHI: r0
  0x00c2: PHI (r0v6 addSignalEosTimeoutIfNeeded) = (r0v4 addSignalEosTimeoutIfNeeded), (r0v5 addSignalEosTimeoutIfNeeded), (r0v13 addSignalEosTimeoutIfNeeded) binds: [B:35:0x009e, B:39:0x00c0, B:22:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (r11.emit(kotlinx.coroutines.flow.SharingCommand.START, r10) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        if (r0.emit(kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE, r10) == r1) goto L45;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedWhileSubscribed$command$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    private static void c(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        char c = '0';
        if (cArr != null) {
            int i9 = $10 + 97;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = new Object[i5];
                    objArr2[i3] = Integer.valueOf(cArr[i11]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i3;
                        byte b3 = (byte) (b2 + 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(i3, i3), TextUtils.lastIndexOf("", c) + 1271, 18 - (Process.myPid() >> 22), 407021364, false, $$c(b2, b3, (byte) (b3 - 5)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i11++;
                    i3 = 0;
                    i5 = 1;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i4, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            setvideostabilizationmode.b = 0;
            char c2 = 0;
            while (setvideostabilizationmode.b < i6) {
                int i12 = $11 + 99;
                $10 = i12 % 128;
                if (i12 % 2 == 0 ? bArr[setvideostabilizationmode.b] != 1 : bArr[setvideostabilizationmode.b] != 0) {
                    int i13 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cIndexOf = (char) (29944 - TextUtils.indexOf("", "", 0));
                        int touchSlop = 1755 - (ViewConfiguration.getTouchSlop() >> 8);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23;
                        byte length2 = (byte) $$a.length;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, touchSlop, scrollBarFadeDuration, 387247676, false, $$c((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b4 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.indexOf("", ""), 3226 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 13, 2133916302, false, $$c(b4, (byte) (b4 | 6), b4), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c2 = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 41241), (-16775511) - Color.rgb(0, 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 22, -1434471773, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i15 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i15, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i15);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i6];
            while (true) {
                setvideostabilizationmode.b = i;
                if (setvideostabilizationmode.b >= i6) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr3[(i6 - setvideostabilizationmode.b) - 1];
                i = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i16 = 0;
            while (true) {
                setvideostabilizationmode.b = i16;
                if (setvideostabilizationmode.b >= i6) {
                    break;
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i16 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
        int i17 = $11 + 69;
        $10 = i17 % 128;
        if (i17 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ Object invoke(addSignalEosTimeoutIfNeeded<? super SharingCommand> addsignaleostimeoutifneeded, Integer num, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int iIntValue = num.intValue();
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.this$0, continuation);
        startedWhileSubscribed$command$1.L$0 = addsignaleostimeoutifneeded;
        startedWhileSubscribed$command$1.I$0 = iIntValue;
        Object objInvokeSuspend = startedWhileSubscribed$command$1.invokeSuspend(Unit.INSTANCE);
        int i2 = asInterface + 1;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(signalSourceStopped signalsourcestopped, Continuation<? super StartedWhileSubscribed$command$1> continuation) {
        super(3, continuation);
        this.this$0 = signalsourcestopped;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v57 */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i, int i2) {
        Object obj;
        int i3;
        Class<?>[] clsArr;
        String str;
        Object objInvoke;
        int i4;
        Object obj2;
        int i5;
        Class<?> cls;
        int i6;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i7;
        int i8;
        int i9;
        int i10 = 2 % 2;
        int i11 = 1;
        if (context != null) {
            int i12 = d;
            int i13 = (i12 ^ 65) + ((i12 & 65) << 1);
            asInterface = i13 % 128;
            int i14 = i13 % 2;
            try {
                int iGreen = Color.green(0);
                int i15 = iGreen * 980;
                int i16 = (i15 ^ (-124206)) + ((i15 & (-124206)) << 1);
                int i17 = ~i;
                int i18 = (~(((-128) ^ i17) | ((-128) & i17))) * 979;
                Object[] objArr = new Object[1];
                a(null, null, (((i16 | i18) << 1) - (i16 ^ i18)) + ((iGreen | i) * (-979)) + (((~(iGreen | i17)) | (~(((-128) & i) | ((-128) ^ i)))) * 979), new byte[]{-109, -110, -125, -127, -112, -122, -119, -120, -121, -122, -123, -124, -125, -111, -112, -113, -114, -115, -116, -117, -118, -122, -119, -120, -121, -122, -123, -124, -125, -126, -127}, objArr);
                try {
                    Object[] objArr2 = {(String) objArr[0]};
                    int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i19 = ~i;
                    int i20 = 765 * keyRepeatDelay;
                    int i21 = (i20 ^ (-193929)) + ((i20 & (-193929)) << 1);
                    int i22 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i23 = (i22 & keyRepeatDelay) | (i22 ^ keyRepeatDelay);
                    int i24 = ~i23;
                    int i25 = i21 + (((127 ^ i24) | (i24 & 127)) * 764);
                    int i26 = ~keyRepeatDelay;
                    int i27 = ~((i26 ^ 127) | (i26 & 127));
                    int i28 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i29 = ~((i28 ^ 127) | (i28 & 127));
                    int i30 = -(-(((i29 & i27) | (i27 ^ i29)) * (-1528)));
                    int i31 = (i25 ^ i30) + ((i30 & i25) << 1);
                    int i32 = ~((-128) | keyRepeatDelay);
                    int i33 = ((i32 & i27) | (i27 ^ i32) | (~i23)) * 764;
                    Object[] objArr3 = new Object[1];
                    a(null, null, (i31 & i33) + (i33 | i31), new byte[]{-93, -107, -94, -119, -102, -123, -119, -121, -95, -97, -97, -98, -96, -104, -97, -97, -98, -105, -104, -99, -101, -114, -107, -104, -100, -101, -119, -121, -114, -102, -116, -103, -104, -105, -107, -106, -107, -108}, objArr3);
                    Object objNewInstance = Class.forName((String) objArr3[0]).getDeclaredConstructor(String.class).newInstance(objArr2);
                    int i34 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int i35 = asInterface;
                    int i36 = (i35 ^ 99) + ((i35 & 99) << 1);
                    d = i36 % 128;
                    int i37 = i36 % 2;
                    int i38 = (i34 * 592) - 74340;
                    int i39 = ~i34;
                    int i40 = (~((i39 ^ 126) | (i39 & 126))) * (-1182);
                    int i41 = ((i38 | i40) << 1) - (i38 ^ i40);
                    int i42 = ~i34;
                    int i43 = i42 | ComposerKt.defaultsKey;
                    int i44 = (i41 - (~(((~((i34 & 126) | (i34 ^ 126))) | (~((i43 & i17) | (i43 ^ i17)))) * (-591)))) - 1;
                    int i45 = (i35 ^ 7) + ((i35 & 7) << 1);
                    d = i45 % 128;
                    if (i45 % 2 != 0) {
                        int i46 = i | i39;
                        Object[] objArr4 = new Object[1];
                        a(null, null, i44 << (590 - (~(-(-((i46 & ComposerKt.defaultsKey) | (i46 ^ ComposerKt.defaultsKey)))))), new byte[]{-113, -114, -115, -116, -117, -118, -122, -119, -120, -121, -122, -123, -124, -125, -126, -127, -112, -122, -119, -120, -121, -122, -123, -124, -125, -111, -112, -109, -110, -125, -127}, objArr4);
                        obj = objArr4[0];
                    } else {
                        int i47 = (i ^ i42) | (i & i42);
                        int i48 = -(-(((i47 & ComposerKt.defaultsKey) | (i47 ^ ComposerKt.defaultsKey)) * 591));
                        Object[] objArr5 = new Object[1];
                        a(null, null, (i44 ^ i48) + ((i48 & i44) << 1), new byte[]{-113, -114, -115, -116, -117, -118, -122, -119, -120, -121, -122, -123, -124, -125, -126, -127, -112, -122, -119, -120, -121, -122, -123, -124, -125, -111, -112, -109, -110, -125, -127}, objArr5);
                        obj = objArr5[0];
                    }
                    try {
                        int i49 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        Object[] objArr6 = new Object[1];
                        a(null, null, (i49 ^ 127) + ((i49 & 127) << 1), new byte[]{-93, -107, -94, -119, -102, -123, -119, -121, -95, -97, -97, -98, -96, -104, -97, -97, -98, -105, -104, -99, -101, -114, -107, -104, -100, -101, -119, -121, -114, -102, -116, -103, -104, -105, -107, -106, -107, -108}, objArr6);
                        Object objNewInstance2 = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance((String) obj);
                        int i50 = d;
                        int i51 = (i50 & 35) + (i50 | 35);
                        int i52 = i51 % 128;
                        asInterface = i52;
                        int i53 = i51 % 2;
                        int i54 = (i52 & 57) + (i52 | 57);
                        d = i54 % 128;
                        int i55 = i54 % 2;
                        try {
                            Object[] objArr7 = new Object[1];
                            c(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0}, new int[]{0, 23, 0, 0}, false, objArr7);
                            Class<?> cls2 = Class.forName((String) objArr7[0]);
                            Object[] objArr8 = new Object[1];
                            c(new byte[]{1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1}, new int[]{23, 17, 0, 0}, false, objArr8);
                            Object objInvoke2 = cls2.getMethod((String) objArr8[0], null).invoke(context, null);
                            try {
                                Object[] objArr9 = new Object[1];
                                c(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0}, new int[]{0, 23, 0, 0}, false, objArr9);
                                Class<?> cls3 = Class.forName((String) objArr9[0]);
                                int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                int i56 = doubleTapTimeout * (-183);
                                int i57 = (i56 & 23495) + (i56 | 23495);
                                int i58 = ~doubleTapTimeout;
                                int i59 = ~((i58 ^ 127) | (i58 & 127));
                                int i60 = (i19 ^ 127) | (i19 & 127);
                                int i61 = d;
                                int i62 = (i61 ^ 85) + ((i61 & 85) << 1);
                                int i63 = i62 % 128;
                                asInterface = i63;
                                if (i62 % 2 == 0) {
                                    int i64 = ~i60;
                                    i3 = i57 << (184 << ((i64 & i59) | (i59 ^ i64)));
                                } else {
                                    int i65 = ~i60;
                                    int i66 = ((i65 & i59) | (i59 ^ i65)) * 184;
                                    i3 = ((i57 | i66) << 1) - (i66 ^ i57);
                                }
                                int i67 = ~(((-128) & doubleTapTimeout) | ((-128) ^ doubleTapTimeout));
                                int i68 = i3 + ((-184) * ((i67 & i) | (i ^ i67)));
                                int i69 = ~doubleTapTimeout;
                                int i70 = i63 + 55;
                                d = i70 % 128;
                                if (i70 % 2 != 0) {
                                    int i71 = i68 >>> ((~(i69 | i17)) * 184);
                                    Object[] objArr10 = new Object[1];
                                    clsArr = null;
                                    a(null, null, i71, new byte[]{-116, -91, -107, -126, -116, -113, -107, -92, -102, -107, -95, -101, -116, -113}, objArr10);
                                    str = (String) objArr10[0];
                                } else {
                                    int i72 = (~((i69 ^ i19) | (i69 & i19))) * 184;
                                    Object[] objArr11 = new Object[1];
                                    clsArr = null;
                                    a(null, null, ((i68 | i72) << 1) - (i68 ^ i72), new byte[]{-116, -91, -107, -126, -116, -113, -107, -92, -102, -107, -95, -101, -116, -113}, objArr11);
                                    str = (String) objArr11[0];
                                }
                                Method method = cls3.getMethod(str, clsArr);
                                int i73 = asInterface;
                                int i74 = (i73 ^ 65) + ((i73 & 65) << 1);
                                d = i74 % 128;
                                if (i74 % 2 != 0) {
                                    objInvoke = method.invoke(context, null);
                                    i4 = 84;
                                } else {
                                    objInvoke = method.invoke(context, null);
                                    i4 = 64;
                                }
                                int i75 = asInterface + 101;
                                d = i75 % 128;
                                int i76 = i75 % 2;
                                try {
                                    Object[] objArr12 = {objInvoke, Integer.valueOf(i4)};
                                    int i77 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                    int i78 = (i77 * 784) - 99314;
                                    int i79 = (i78 & 100224) + (i78 | 100224);
                                    int i80 = ~i77;
                                    int i81 = i80 | i19;
                                    int i82 = (~((i81 & 127) | (i81 ^ 127))) * (-783);
                                    int i83 = (i79 & i82) + (i82 | i79);
                                    int i84 = ~((i17 ^ 127) | (i17 & 127));
                                    int i85 = i80 ^ i84;
                                    Object[] objArr13 = new Object[1];
                                    a(null, null, i83 + (((i80 & i84) | i85) * 783), new byte[]{-121, -116, -113, -107, -123, -107, -90, -116, -113, -107, -92, -102, -107, -95, -104, -91, -94, -104, -101, -123, -116, -101, -123, -120, -102, -104, -122, -119, -120, -121, -122, -123, -107}, objArr13);
                                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                                    Object[] objArr14 = new Object[1];
                                    c(new byte[]{1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0}, new int[]{40, 14, 71, 12}, false, objArr14);
                                    Object objInvoke3 = cls4.getMethod((String) objArr14[0], String.class, Integer.TYPE).invoke(objInvoke2, objArr12);
                                    int i86 = -(ViewConfiguration.getTouchSlop() >> 8);
                                    Object[] objArr15 = new Object[1];
                                    a(null, null, (i86 ^ 127) + ((i86 & 127) << 1), new byte[]{-120, -88, -123, -89, -116, -113, -107, -92, -102, -107, -95, -104, -91, -94, -104, -101, -123, -116, -101, -123, -120, -102, -104, -122, -119, -120, -121, -122, -123, -107}, objArr15);
                                    Class<?> cls5 = Class.forName((String) objArr15[0]);
                                    Object[] objArr16 = new Object[1];
                                    c(new byte[]{1, 0, 1, 1, 1, 1, 1, 1, 0, 0}, new int[]{54, 10, 0, 0}, true, objArr16);
                                    Object[] objArr17 = (Object[]) cls5.getField((String) objArr16[0]).get(objInvoke3);
                                    int length = objArr17.length;
                                    int i87 = 0;
                                    while (true) {
                                        if (i87 < length) {
                                            Object obj3 = objArr17[i87];
                                            float maxVolume = AudioTrack.getMaxVolume();
                                            int i88 = d;
                                            int i89 = (i88 & 105) + (i88 | 105);
                                            asInterface = i89 % 128;
                                            int i90 = (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1));
                                            if (i89 % 2 == 0) {
                                                Object[] objArr18 = new Object[i11];
                                                a(null, null, 128 >> i90, new byte[]{-87, -97, -98, -104, -96}, objArr18);
                                                obj2 = objArr18[0];
                                            } else {
                                                Object[] objArr19 = new Object[i11];
                                                a(null, null, 128 - i90, new byte[]{-87, -97, -98, -104, -96}, objArr19);
                                                obj2 = objArr19[0];
                                            }
                                            try {
                                                Object[] objArr20 = {(String) obj2};
                                                Object[] objArr21 = new Object[i11];
                                                c(new byte[]{1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0}, new int[]{64, 37, 193, 25}, i11, objArr21);
                                                Class<?> cls6 = Class.forName((String) objArr21[0]);
                                                Object[] objArr22 = new Object[i11];
                                                c(new byte[]{1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0}, new int[]{101, 11, 0, 0}, i11, objArr22);
                                                String str2 = (String) objArr22[0];
                                                Class<?>[] clsArr2 = new Class[i11];
                                                clsArr2[0] = String.class;
                                                Object objInvoke4 = cls6.getMethod(str2, clsArr2).invoke(null, objArr20);
                                                try {
                                                    Object[] objArr23 = new Object[i11];
                                                    c(new byte[]{1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, new int[]{112, 28, 16, 0}, i11, objArr23);
                                                    Class<?> cls7 = Class.forName((String) objArr23[0]);
                                                    int i91 = d + 15;
                                                    asInterface = i91 % 128;
                                                    int i92 = i91 % 2;
                                                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0');
                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                    int i93 = asInterface;
                                                    int i94 = (i93 ^ 85) + ((i93 & 85) << 1);
                                                    d = i94 % 128;
                                                    if (i94 % 2 != 0) {
                                                        int i95 = -(-iIndexOf);
                                                        i5 = ((i95 ^ 483) + ((i95 & 483) << 1)) >> 30976;
                                                    } else {
                                                        int i96 = iIndexOf * 483;
                                                        i5 = ((i96 | 30976) << 1) - (i96 ^ 30976);
                                                    }
                                                    int i97 = ~iIndexOf;
                                                    Object[] objArr24 = objArr17;
                                                    int i98 = ~((i97 ^ (-129)) | (i97 & (-129)));
                                                    int i99 = ~iIndexOf;
                                                    int i100 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                                    int i101 = (i5 - (~(-(-((-241) * (i98 | (~((i99 ^ i100) | (i99 & i100))))))))) - 1;
                                                    int i102 = ((iIndexOf ^ 128) | (iIndexOf & 128)) * (-482);
                                                    int i103 = ((i101 | i102) << 1) - (i102 ^ i101);
                                                    int i104 = ~((-129) | iIndexOf);
                                                    int i105 = ~iIndexOf;
                                                    int i106 = i93 + 15;
                                                    d = i106 % 128;
                                                    int i107 = i106 % 2;
                                                    int i108 = ~((i105 & i100) | (i105 ^ i100) | 128);
                                                    int i109 = -(-(241 * ((i104 & i108) | (i104 ^ i108))));
                                                    Object[] objArr25 = new Object[1];
                                                    a(null, null, ((i103 | i109) << 1) - (i109 ^ i103), new byte[]{-100, -107, -121, -121, -124, -116, -101, -100, -86, -120, -101}, objArr25);
                                                    try {
                                                        Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls7.getMethod((String) objArr25[0], null).invoke(obj3, null))};
                                                        Object[] objArr27 = new Object[1];
                                                        c(new byte[]{1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0}, new int[]{64, 37, 193, 25}, true, objArr27);
                                                        String str3 = (String) objArr27[0];
                                                        int i110 = d;
                                                        int i111 = (i110 & 57) + (i110 | 57);
                                                        asInterface = i111 % 128;
                                                        if (i111 % 2 == 0) {
                                                            cls = Class.forName(str3);
                                                            i6 = -(ViewConfiguration.getKeyRepeatDelay() >>> 77);
                                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                            i7 = 51;
                                                        } else {
                                                            cls = Class.forName(str3);
                                                            i6 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                            i7 = 127;
                                                        }
                                                        int i112 = d;
                                                        int i113 = ((i112 | 77) << 1) - (i112 ^ 77);
                                                        int i114 = i113 % 128;
                                                        asInterface = i114;
                                                        if (i113 % 2 == 0) {
                                                            int i115 = -i6;
                                                            i8 = ((i115 ^ (-751)) + ((i115 & (-751)) << 1)) / ((-751) << i7);
                                                        } else {
                                                            int i116 = i6 * (-751);
                                                            int i117 = -(-(i7 * (-751)));
                                                            i8 = (i116 ^ i117) + ((i116 & i117) << 1);
                                                        }
                                                        int i118 = i114 + 17;
                                                        int i119 = i118 % 128;
                                                        d = i119;
                                                        if (i118 % 2 != 0) {
                                                            Object obj4 = null;
                                                            obj4.hashCode();
                                                            throw null;
                                                        }
                                                        int i120 = ~i6;
                                                        int i121 = ~i7;
                                                        int i122 = ~((i120 ^ i121) | (i121 & i120));
                                                        int i123 = ~((i120 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i120 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                                        int i124 = (i122 ^ i123) | (i123 & i122);
                                                        int i125 = ((i119 | 1) << 1) - (i119 ^ 1);
                                                        int i126 = i125 % 128;
                                                        asInterface = i126;
                                                        if (i125 % 2 == 0) {
                                                            int i127 = i8 * (1504 << i124);
                                                            int i128 = ~i6;
                                                            int i129 = (~(iTuitionPaymentFragmentspecialinlinedviewModeldefault3 | ((i128 & i7) | (i128 ^ i7)))) - 1504;
                                                            i9 = ((i127 | i129) << 1) - (i129 ^ i127);
                                                        } else {
                                                            int i130 = -(-(i124 * 1504));
                                                            int i131 = ((i8 | i130) << 1) - (i130 ^ i8);
                                                            int i132 = ~i6;
                                                            int i133 = (i132 & i7) | (i132 ^ i7);
                                                            i9 = (i131 - (~((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i133) | (i133 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) * (-1504)))) - 1;
                                                        }
                                                        int i134 = ~i6;
                                                        int i135 = ~((i134 & i7) | (i134 ^ i7));
                                                        int i136 = i6 | (~i7);
                                                        int i137 = ((i126 | 57) << 1) - (i126 ^ 57);
                                                        d = i137 % 128;
                                                        int i138 = i137 % 2;
                                                        int i139 = ~i136;
                                                        Object[] objArr28 = new Object[1];
                                                        a(null, null, i9 + (752 * ((i139 & i135) | (i135 ^ i139))), new byte[]{-116, -101, -107, -102, -119, -88, -119, -101, -121, -116, -127, -116, -101, -107, -121, -116, -123, -116, -113}, objArr28);
                                                        Object objInvoke5 = cls.getMethod((String) objArr28[0], InputStream.class).invoke(objInvoke4, objArr26);
                                                        try {
                                                            Object[] objArr29 = new Object[1];
                                                            c(new byte[]{1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1}, new int[]{140, 34, 17, 0}, false, objArr29);
                                                            Class<?> cls8 = Class.forName((String) objArr29[0]);
                                                            Object[] objArr30 = new Object[1];
                                                            c(new byte[]{1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1}, new int[]{174, 23, 182, 0}, false, objArr30);
                                                            if (objNewInstance.equals(cls8.getMethod((String) objArr30[0], null).invoke(objInvoke5, null))) {
                                                                break;
                                                            }
                                                            try {
                                                                Object[] objArr31 = new Object[1];
                                                                c(new byte[]{1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1}, new int[]{140, 34, 17, 0}, false, objArr31);
                                                                Class<?> cls9 = Class.forName((String) objArr31[0]);
                                                                Object[] objArr32 = new Object[1];
                                                                c(new byte[]{1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1}, new int[]{174, 23, 182, 0}, false, objArr32);
                                                                if (objNewInstance2.equals(cls9.getMethod((String) objArr32[0], null).invoke(objInvoke5, null))) {
                                                                    break;
                                                                }
                                                                i87 = (((i87 | (-81)) << 1) - (i87 ^ (-81))) + 82;
                                                                objArr17 = objArr24;
                                                                i11 = 1;
                                                            } catch (Throwable th) {
                                                                Throwable cause = th.getCause();
                                                                if (cause != null) {
                                                                    throw cause;
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (Throwable th2) {
                                                            Throwable cause2 = th2.getCause();
                                                            if (cause2 != null) {
                                                                throw cause2;
                                                            }
                                                            throw th2;
                                                        }
                                                    } catch (Throwable th3) {
                                                        Throwable cause3 = th3.getCause();
                                                        if (cause3 != null) {
                                                            throw cause3;
                                                        }
                                                        throw th3;
                                                    }
                                                } catch (Throwable th4) {
                                                    Throwable cause4 = th4.getCause();
                                                    if (cause4 != null) {
                                                        throw cause4;
                                                    }
                                                    throw th4;
                                                }
                                            } catch (Throwable th5) {
                                                Throwable cause5 = th5.getCause();
                                                if (cause5 != null) {
                                                    throw cause5;
                                                }
                                                throw th5;
                                            }
                                        } else {
                                            int i140 = asInterface;
                                            int i141 = ((i140 | 43) << 1) - (i140 ^ 43);
                                            d = i141 % 128;
                                            int i142 = i141 % 2;
                                        }
                                    }
                                    int i143 = (i & (-2)) | (i17 & 1);
                                    Object[] objArr33 = new Object[4];
                                    int[] iArr = new int[1];
                                    objArr33[0] = iArr;
                                    objArr33[1] = new int[1];
                                    int[] iArr2 = new int[1];
                                    objArr33[2] = iArr2;
                                    int i144 = d;
                                    int i145 = (i144 ^ 1) + ((i144 & 1) << 1);
                                    asInterface = i145 % 128;
                                    int i146 = i145 % 2 == 0 ? 108 : 16;
                                    iArr[0] = i;
                                    iArr2[0] = i143;
                                    objArr33[3] = null;
                                    int i147 = ~((int) Runtime.getRuntime().maxMemory());
                                    int i148 = 725173628 + (((-957907147) | i147) * 494) + (((~(i147 | (-993571579))) | 111639093) * 494);
                                    int i149 = d + 61;
                                    int i150 = i149 % 128;
                                    asInterface = i150;
                                    int i151 = i149 % 2;
                                    int i152 = (i2 - (~(-(-((i148 & i146) + (i146 | i148)))))) - 1;
                                    int i153 = i152 << 13;
                                    int i154 = ((~i152) & i153) | ((~i153) & i152);
                                    int i155 = i154 ^ (i154 >>> 17);
                                    int i156 = i150 + 57;
                                    d = i156 % 128;
                                    int i157 = i156 % 2;
                                    ((int[]) objArr33[1])[0] = i155 ^ (i155 << 5);
                                    return objArr33;
                                } catch (Throwable th6) {
                                    Throwable cause6 = th6.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th6;
                                }
                            } catch (Throwable th7) {
                                Throwable cause7 = th7.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th7;
                            }
                        } catch (Throwable th8) {
                            Throwable cause8 = th8.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th8;
                        }
                    } catch (Throwable th9) {
                        Throwable cause9 = th9.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th9;
                    }
                } catch (Throwable th10) {
                    Throwable cause10 = th10.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th10;
                }
            } catch (Throwable unused) {
            }
        }
        int[] iArr3 = new int[1];
        Object[] objArr34 = {new int[]{i}, iArr3, new int[]{i}, null};
        int i158 = ~(698498424 | i);
        int i159 = 1098620040 + (((-800800764) | i158) * (-814)) + ((i158 | (~((~i) | 658188195)) | 555885856) * 407) + (((~(i | (-658188196))) | (~((-698498425) | i)) | 555885856) * 407);
        int i160 = -(-((i159 << 1) - i159));
        int i161 = ((i2 | i160) << 1) - (i2 ^ i160);
        int i162 = i161 << 13;
        int i163 = (i162 | i161) & (~(i161 & i162));
        int i164 = i163 ^ (i163 >>> 17);
        int i165 = i164 << 5;
        iArr3[0] = ((~i164) & i165) | ((~i165) & i164);
        return objArr34;
    }

    private static String $$c(short s, short s2, byte b2) {
        int i = b2 * 2;
        int i2 = 105 - s2;
        int i3 = 3 - (s * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i2 = (-i3) + i;
            i3 = i3;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i) {
                return new String(bArr2, 0);
            }
            int i6 = i3 + 1;
            i4 = i5;
            i2 = (-bArr[i6]) + i2;
            i3 = i6;
        }
    }
}
