package defpackage;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.rtchagas.pingplacepicker.ui.PlacePickerActivity;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\bH\u0002J\u0015\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\"H\u0016J\u001c\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0096@¢\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u0003H\u0014J\u001d\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030,2\u0006\u0010-\u001a\u00020\u000eH\u0014¢\u0006\u0002\u0010.J&\u0010/\u001a\b\u0012\u0004\u0012\u00028\u0000002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u000205H\u0016R\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0082\u0004R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\nR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u00066"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/StateFlowSlot;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "initialState", "", "<init>", "(Ljava/lang/Object;)V", "_state", "Lkotlinx/atomicfu/AtomicRef;", "sequence", "", "value", "getValue", "()Ljava/lang/Object;", "setValue", "compareAndSet", "", "expect", "update", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "updateState", "expectedState", "newState", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "tryEmit", "(Ljava/lang/Object;)Z", "emit", "", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetReplayCache", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSlot", "createSlotArray", "", "size", "(I)[Lkotlinx/coroutines/flow/StateFlowSlot;", "fuse", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EncoderImplExternalSyntheticLambda1<T> extends EncoderImplExternalSyntheticLambda13<EncoderImplExternalSyntheticLambda12> implements lambdastop3androidxcameravideointernalencoderEncoderImpl<T>, EncoderFactory<T>, EncoderImplExternalSyntheticLambda9<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char asBinder;
    private static char b;
    private static int d;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private volatile /* synthetic */ Object _state$volatile;
    private static final byte[] $$c = {49, -45, -112, 57};
    private static final int $$d = 57;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {89, 92, -72, 43, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 201;
    private static int asInterface = 0;
    private static int g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f135a = 0;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = ~(i7 | i8 | i3);
        int i10 = ~((~i3) | i8 | i);
        int i11 = i9 | i10;
        int i12 = ~(i8 | i);
        int i13 = (~(i3 | i7)) | (~(i7 | i2)) | i10;
        int i14 = i + i2 + i4 + (1787548100 * i5) + (1101416392 * i6);
        int i15 = i14 * i14;
        int i16 = (((-61410478) * i) - 623378432) + (561581232 * i2) + (i11 * (-311495855)) + ((-311495855) * i12) + (311495855 * i13) + (250085376 * i4) + ((-778043392) * i5) + ((-46137344) * i6) + (324403200 * i15);
        int i17 = (i * (-930662234)) + 656878810 + (i2 * (-930660720)) + (i11 * (-757)) + (i12 * (-757)) + (i13 * 757) + (i4 * (-930661477)) + (i5 * 2052861356) + (i6 * 749768216) + (i15 * (-2028863488));
        if (i16 + (i17 * i17 * (-1850081280)) == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        int i18 = 2 % 2;
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 84
            byte[] r0 = defpackage.EncoderImplExternalSyntheticLambda1.$$a
            int r7 = r7 * 3
            int r7 = 53 - r7
            int r8 = r8 * 4
            int r8 = 4 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r6 = r7
            r4 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r8]
        L29:
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            int r8 = r8 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.EncoderImplExternalSyntheticLambda1.e(byte, int, byte, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i4 = 58224;
            int i5 = 0;
            while (i5 < 16) {
                int i6 = $11 + 69;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(asBinder);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c3 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 47773);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 468;
                        int i10 = 12 - (ExpandableListView.getPackedPositionForChild(i3, i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i3, i3) == 0L ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, maximumDrawingCacheSize, i10, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i11 = i5;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47774 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), View.getDefaultSize(0, 0) + 468, 13 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5 = i11 + 1;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = (byte) (b2 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getLongPressTimeout() >> 16) + 2323, 43 - TextUtils.lastIndexOf("", '0'), -1312321721, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i12 = $10 + 51;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 3 % 4;
            }
        }
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda13
    public final /* synthetic */ EncoderImplExternalSyntheticLambda15[] TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = g + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        EncoderImplExternalSyntheticLambda12[] encoderImplExternalSyntheticLambda12Arr = (EncoderImplExternalSyntheticLambda12[]) TuitionPaymentFragmentspecialinlinedviewModeldefault1(1195299508, -1195299507, PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{2});
        int i4 = asInterface + 33;
        g = i4 % 128;
        int i5 = i4 % 2;
        return encoderImplExternalSyntheticLambda12Arr;
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda13
    public final /* synthetic */ EncoderImplExternalSyntheticLambda15 b() {
        int i = 2 % 2;
        int i2 = g + 37;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            g();
            obj.hashCode();
            throw null;
        }
        EncoderImplExternalSyntheticLambda12 encoderImplExternalSyntheticLambda12G = g();
        int i3 = asInterface + 75;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            return encoderImplExternalSyntheticLambda12G;
        }
        obj.hashCode();
        throw null;
    }

    public EncoderImplExternalSyntheticLambda1(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r2 == r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r2 == r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = defpackage.EncoderImplExternalSyntheticLambda1.g + 107;
        defpackage.EncoderImplExternalSyntheticLambda1.asInterface = r1 % 128;
        r1 = r1 % 2;
     */
    @Override // defpackage.lambdastop3androidxcameravideointernalencoderEncoderImpl, defpackage.stopMediaCodec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = defpackage.EncoderImplExternalSyntheticLambda1.g
            int r1 = r1 + 115
            int r2 = r1 % 128
            defpackage.EncoderImplExternalSyntheticLambda1.asInterface = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            EncoderImplMediaCodecCallbackExternalSyntheticLambda0 r1 = defpackage.EncoderImpl1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.EncoderImplExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1
            java.lang.Object r2 = r2.get(r4)
            r3 = 13
            int r3 = r3 / 0
            if (r2 != r1) goto L32
            goto L27
        L1d:
            EncoderImplMediaCodecCallbackExternalSyntheticLambda0 r1 = defpackage.EncoderImpl1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.EncoderImplExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1
            java.lang.Object r2 = r2.get(r4)
            if (r2 != r1) goto L32
        L27:
            int r1 = defpackage.EncoderImplExternalSyntheticLambda1.g
            int r1 = r1 + 107
            int r2 = r1 % 128
            defpackage.EncoderImplExternalSyntheticLambda1.asInterface = r2
            int r1 = r1 % r0
            r0 = 0
            return r0
        L32:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.EncoderImplExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1():java.lang.Object");
    }

    @Override // defpackage.lambdastop3androidxcameravideointernalencoderEncoderImpl
    public final void b(T t) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        g = i2 % 128;
        int i3 = i2 % 2;
        if (t == null) {
            t = (T) EncoderImpl1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i4 = asInterface + 59;
            g = i4 % 128;
            int i5 = i4 % 2;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(null, t);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // defpackage.lambdastop3androidxcameravideointernalencoderEncoderImpl
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(T t, T t2) {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 21 / 0;
            if (t == null) {
                t = (T) EncoderImpl1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i4 = asInterface + 17;
                g = i4 % 128;
                int i5 = i4 % 2;
            }
        } else if (t == null) {
            t = (T) EncoderImpl1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i6 = asInterface + 17;
            g = i6 % 128;
            int i7 = i6 % 2;
        }
        if (t2 == null) {
            t2 = (T) EncoderImpl1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(t, t2);
    }

    @Override // defpackage.lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(T t) {
        int i = 2 % 2;
        int i2 = g + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        b(t);
        int i4 = g + 15;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl, defpackage.addSignalEosTimeoutIfNeeded
    public final Object emit(T t, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = g + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        b(t);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 1;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj, Object obj2) {
        int i;
        EncoderImplExternalSyntheticLambda12[] encoderImplExternalSyntheticLambda12ArrAsBinder;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = TuitionPaymentFragmentbindingInflater1;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
                EncoderImplExternalSyntheticLambda12[] encoderImplExternalSyntheticLambda12ArrAsBinder2 = asBinder();
                Unit unit = Unit.INSTANCE;
                while (true) {
                    EncoderImplExternalSyntheticLambda12[] encoderImplExternalSyntheticLambda12Arr = encoderImplExternalSyntheticLambda12ArrAsBinder2;
                    if (encoderImplExternalSyntheticLambda12Arr != null) {
                        for (EncoderImplExternalSyntheticLambda12 encoderImplExternalSyntheticLambda12 : encoderImplExternalSyntheticLambda12Arr) {
                            if (encoderImplExternalSyntheticLambda12 != null) {
                                encoderImplExternalSyntheticLambda12.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (i == i3) {
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 + 1;
                            return true;
                        }
                        encoderImplExternalSyntheticLambda12ArrAsBinder = asBinder();
                        Unit unit2 = Unit.INSTANCE;
                    }
                    encoderImplExternalSyntheticLambda12ArrAsBinder2 = encoderImplExternalSyntheticLambda12ArrAsBinder;
                    i3 = i;
                }
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 + 2;
                return true;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0414  */
    /* JADX WARN: Code duplicated, block: B:105:0x0416  */
    /* JADX WARN: Code duplicated, block: B:108:0x0429  */
    /* JADX WARN: Code duplicated, block: B:109:0x042a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0431  */
    /* JADX WARN: Code duplicated, block: B:116:0x044e  */
    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:92:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:94:0x03fd A[Catch: all -> 0x03ad, TRY_ENTER, TryCatch #3 {all -> 0x03ad, blocks: (B:66:0x0365, B:90:0x03ea, B:94:0x03fd, B:95:0x0401, B:96:0x0405, B:99:0x0409, B:110:0x042b, B:113:0x043a, B:102:0x0410, B:106:0x0417, B:76:0x03a7, B:89:0x03d6), top: B:133:0x0349 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0401 A[Catch: all -> 0x03ad, TryCatch #3 {all -> 0x03ad, blocks: (B:66:0x0365, B:90:0x03ea, B:94:0x03fd, B:95:0x0401, B:96:0x0405, B:99:0x0409, B:110:0x042b, B:113:0x043a, B:102:0x0410, B:106:0x0417, B:76:0x03a7, B:89:0x03d6), top: B:133:0x0349 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0409 A[Catch: all -> 0x03ad, TryCatch #3 {all -> 0x03ad, blocks: (B:66:0x0365, B:90:0x03ea, B:94:0x03fd, B:95:0x0401, B:96:0x0405, B:99:0x0409, B:110:0x042b, B:113:0x043a, B:102:0x0410, B:106:0x0417, B:76:0x03a7, B:89:0x03d6), top: B:133:0x0349 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [addSignalEosTimeoutIfNeeded, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r5v27, types: [int] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v36, types: [EncoderImplExternalSyntheticLambda12, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r7v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [EncoderImplExternalSyntheticLambda13] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.util.concurrent.atomic.AtomicReferenceFieldUpdater] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x044b -> B:90:0x03ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x044e -> B:90:0x03ea). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.lambdastop2androidxcameravideointernalencoderEncoderImpl, defpackage.clampVideoBitrateIfNotSupported
    public final java.lang.Object collect(defpackage.addSignalEosTimeoutIfNeeded<? super T> r39, kotlin.coroutines.Continuation<?> r40) {
        /*
            Method dump skipped, instruction units count: 1218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.EncoderImplExternalSyntheticLambda1.collect(addSignalEosTimeoutIfNeeded, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static EncoderImplExternalSyntheticLambda12 g() {
        int i = 2 % 2;
        EncoderImplExternalSyntheticLambda12 encoderImplExternalSyntheticLambda12 = new EncoderImplExternalSyntheticLambda12();
        int i2 = asInterface + 29;
        g = i2 % 128;
        int i3 = i2 % 2;
        return encoderImplExternalSyntheticLambda12;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        ((Number) objArr[0]).intValue();
        int i = 2 % 2;
        int i2 = asInterface + 75;
        g = i2 % 128;
        return new EncoderImplExternalSyntheticLambda12[i2 % 2 == 0 ? 3 : 2];
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda9
    public final clampVideoBitrateIfNotSupported<T> TuitionPaymentFragmentbindingInflater1(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        int i2 = 2 % 2;
        int i3 = g + 113;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        clampVideoBitrateIfNotSupported<T> clampvideobitrateifnotsupportedB = EncoderImplExternalSyntheticLambda14.b(this, coroutineContext, i, bufferOverflow);
        if (i4 != 0) {
            int i5 = 23 / 0;
        }
        return clampvideobitrateifnotsupportedB;
    }

    static {
        d = 1;
        asInterface();
        TuitionPaymentFragmentbindingInflater1 = AtomicReferenceFieldUpdater.newUpdater(EncoderImplExternalSyntheticLambda1.class, Object.class, "_state$volatile");
        int i = f135a + 79;
        d = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static EncoderImplExternalSyntheticLambda12[] TuitionPaymentFragmentbindingInflater1(int i) {
        return (EncoderImplExternalSyntheticLambda12[]) TuitionPaymentFragmentspecialinlinedviewModeldefault1(1195299508, -1195299507, PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{Integer.valueOf(i)});
    }

    @Override // defpackage.lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl
    public final void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(-912554201, 912554201, PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this});
    }

    static void asInterface() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 4649;
        b = (char) 6448;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 26440;
        asBinder = (char) 2763;
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
    private static java.lang.String $$e(short r6, int r7, byte r8) {
        /*
            byte[] r0 = defpackage.EncoderImplExternalSyntheticLambda1.$$c
            int r8 = r8 * 4
            int r8 = r8 + 108
            int r6 = r6 * 2
            int r1 = r6 + 1
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2a
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r7 = r7 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.EncoderImplExternalSyntheticLambda1.$$e(short, int, byte):java.lang.String");
    }
}
