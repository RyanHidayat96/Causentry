package kotlinx.coroutines.flow.internal;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.internal.mlkit_vision_face.zznv;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", i = {0, 0}, l = {26}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
public final class ChannelFlowTransformLatest$flowCollect$3$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChannelFlowTransformLatest$flowCollect$3.AnonymousClass5<T> this$0;
    private static final byte[] $$c = {86, -48, ByteCompanionObject.MIN_VALUE, 88};
    private static final int $$d = 64;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {108, -26, -110, 50};
    private static final int $$b = 3;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int g = 1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 13380;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 45026;
    private static char TuitionPaymentFragmentbindingInflater1 = 51352;
    private static char b = 4264;

    private static void c(byte b2, byte b3, short s, Object[] objArr) {
        int i = 98 - (b2 * 2);
        byte[] bArr = $$a;
        int i2 = s * 2;
        int i3 = 4 - (b3 * 4);
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i = (-i) + i4;
            i3++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i = (-bArr[i3]) + i;
            i3++;
            i5 = i6;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i4 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i5 = $11 + 107;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 0];
                i2 = 1;
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                i2 = 0;
            }
            int i6 = $10 + 33;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            while (i2 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i8) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(b);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char deadChar = (char) (KeyEvent.getDeadChar(i4, i4) + 47773);
                        int scrollBarSize = 468 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int capsMode = TextUtils.getCapsMode("", i4, i4) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, scrollBarSize, capsMode, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i11 = i8;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 47773), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 468, (ViewConfiguration.getJumpTapTimeout() >> 16) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i8 = i11 - 40503;
                    i2++;
                    i4 = 0;
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
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2323, 44 - View.MeasureSpec.makeMeasureSpec(0, 0), -1312321721, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelFlowTransformLatest$flowCollect$3$1$emit$1(ChannelFlowTransformLatest$flowCollect$3.AnonymousClass5<? super T> anonymousClass5, Continuation<? super ChannelFlowTransformLatest$flowCollect$3$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass5;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = g + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        ChannelFlowTransformLatest$flowCollect$3.AnonymousClass5<T> anonymousClass5 = this.this$0;
        ChannelFlowTransformLatest$flowCollect$3$1$emit$1 channelFlowTransformLatest$flowCollect$3$1$emit$1 = this;
        if (i3 == 0) {
            return anonymousClass5.emit(null, channelFlowTransformLatest$flowCollect$3$1$emit$1);
        }
        anonymousClass5.emit(null, channelFlowTransformLatest$flowCollect$3$1$emit$1);
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x0704  */
    public static Object[] b(int i, int i2) throws Throwable {
        int i3;
        String line;
        Object[] objArr;
        int i4;
        String[] strArr;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i11 = (i10 ^ 91) + ((i10 & 91) << 1);
        g = i11 % 128;
        int i12 = i11 % 2;
        try {
            String[] strArr2 = new String[2];
            char[] cArr = {39600, 60124, 38435, 62096, 44170, 62933, 21945, 4778, 60902, 29777, 7314, 34685, 15122, 12935, 53841, 40031, 20464, 49807, 8954, 4457, 22452, 64704};
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            int i13 = g + 105;
            int i14 = i13 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14;
            int i15 = i13 % 2;
            int i16 = (jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1));
            int i17 = i16 * (-813);
            int i18 = (i17 ^ 7344) + ((i17 & 7344) << 1);
            int i19 = ~(((-19) ^ i16) | ((-19) & i16));
            int i20 = i14 + 59;
            int i21 = i20 % 128;
            g = i21;
            if (i20 % 2 == 0) {
                int i22 = ~((i16 ^ i) | (i16 & i));
                i6 = i18 % ((-814) >>> ((i22 & i19) | (i19 ^ i22)));
                int i23 = ~i;
                i7 = ((-19) & i23) | ((-19) ^ i23);
            } else {
                int i24 = ~((i16 ^ i) | (i16 & i));
                i6 = i18 + (((i24 & i19) | (i19 ^ i24)) * (-814));
                i7 = (-19) | (~i);
            }
            int i25 = ~i7;
            int i26 = (i21 & 89) + (i21 | 89);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i26 % 128;
            if (i26 % 2 != 0) {
                int i27 = ~i16;
                int i28 = ~((i27 & 18) | (i27 ^ 18));
                int i29 = (i25 & i28) | (i25 ^ i28);
                int i30 = ~((i16 ^ i) | (i16 & i));
                i8 = i6 * (407 << ((i29 & i30) | (i29 ^ i30)));
            } else {
                int i31 = ~i16;
                int i32 = ~((i31 & 18) | (i31 ^ 18));
                int i33 = (i25 & i32) | (i25 ^ i32);
                int i34 = ~((i16 ^ i) | (i16 & i));
                int i35 = -(-(407 * ((i33 & i34) | (i33 ^ i34))));
                i8 = ((i6 | i35) << 1) - (i35 ^ i6);
            }
            int i36 = ~i16;
            int i37 = ~((i36 & 18) | (i36 ^ 18));
            int i38 = ~i16;
            int i39 = ~((i38 & i) | (i38 ^ i));
            int i40 = (i39 & i37) | (i37 ^ i39);
            int i41 = (i21 & 47) + (i21 | 47);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i41 % 128;
            int i42 = i41 % 2;
            int i43 = ~((18 ^ i) | (18 & i));
            int i44 = -(-(407 * ((i43 & i40) | (i40 ^ i43))));
            int i45 = (i8 & i44) + (i44 | i8);
            Object[] objArr2 = new Object[1];
            a(cArr, i45, objArr2);
            strArr2[0] = (String) objArr2[0];
            Object[] objArr3 = new Object[1];
            a(new char[]{15797, 33673, 19355, 19113, 3421, 20854, 26473, 32592, 48941, 29381, 7099, 33040, 64776, 48973, 13159, 24581, 719, 17372, 23236, 22853}, 17 - (~(-(ViewConfiguration.getKeyRepeatDelay() >> 16))), objArr3);
            strArr2[1] = (String) objArr3[0];
            int i46 = 0;
            while (true) {
                if (i46 >= 2) {
                    i3 = i;
                    break;
                }
                int i47 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i48 = (i47 & 95) + (i47 | 95);
                g = i48 % 128;
                int i49 = i48 % 2;
                String str = strArr2[i46];
                Object[] objArr4 = new Object[1];
                a(new char[]{56715, 58367, 55966, 49998, 48204, 47139, 62671, 41930, 48314, 43329, 6048, 20815, 48436, 1843, 46591, 50874, 14526, 58004}, 17 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                if (((Boolean) cls.getMethod(str, new Class[0]).invoke(cls, null)).booleanValue()) {
                    i3 = (~(i & 1)) & (i | 1);
                    break;
                }
                int i50 = (i46 & (-35)) + (i46 | (-35));
                i46 = (i50 & 36) + (i50 | 36);
            }
        } catch (Exception unused) {
            i3 = (i & (-3)) | ((~i) & 2);
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 2419);
                int i51 = 2845 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 5;
                byte b2 = (byte) ($$b - 3);
                byte b3 = b2;
                Object[] objArr5 = new Object[1];
                c(b2, b3, b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, i51, offsetBefore, -501222268, false, (String) objArr5[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j = 883022702;
            int i52 = i3;
            long j2 = -1;
            long j3 = j ^ j2;
            long j4 = i;
            long j5 = (((long) 236) * j) + (((long) 471) * jLongValue) + (((long) (-235)) * (jLongValue | ((j3 | (j4 ^ j2)) ^ j2))) + (((long) (-470)) * (jLongValue | ((j3 | j4) ^ j2))) + (((long) 235) * ((((jLongValue ^ j2) | j) ^ j2) | (j2 ^ ((j3 | jLongValue) | j4)))) + ((long) (-2042209388));
            int i53 = g;
            int i54 = (i53 & 105) + (i53 | 105);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i54 % 128;
            int i55 = i54 % 2;
            int iNextInt = new Random().nextInt(948417995);
            int i56 = ~iNextInt;
            int i57 = 279459354 + (((~((-1448105485) | i56)) | (~((-145623268) | iNextInt))) * 520);
            int i58 = ~(145623267 | i56);
            int i59 = ~(iNextInt | 1582849678);
            int i60 = ((int) (j5 >> 32)) & (i57 + ((i58 | i59) * (-1040)) + ((i59 | (~(i56 | (-1582849679))) | (-1593728752)) * 520));
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i61 = ~startUptimeMillis;
            int i62 = ((int) j5) & (700489575 + (((~((-1150280522) | i61)) | (~((-1707460365) | startUptimeMillis))) * 217) + (((~(startUptimeMillis | (-1150280522))) | 1149616904) * 217) + (((~((-1707460365) | i61)) | 1150280521) * 217));
            int i63 = ~i;
            int i64 = g + 11;
            int i65 = i64 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i65;
            int i66 = i64 % 2;
            int i67 = ((i60 & i62) | (i60 ^ i62)) ^ 1;
            int i68 = -i67;
            int i69 = ((i67 & i68) | (i67 ^ i68)) >> 31;
            int i70 = i65 + 95;
            g = i70 % 128;
            int i71 = i70 % 2;
            int i72 = ((i & (-11)) | (i63 & 10)) & (~i69);
            int i73 = i69 & i;
            int i74 = (i73 & i72) | (i72 ^ i73);
            int i75 = ~i;
            int i76 = ~(((-317688508) & i75) | ((-317688508) ^ i75));
            int i77 = ~((1053927646 ^ i) | (1053927646 & i));
            int i78 = -(-(((i76 & i77) | (i76 ^ i77)) * 959));
            int i79 = ((-965253583) & i78) + (i78 | (-965253583));
            int i80 = ((i79 | (-279398844)) << 1) - ((-279398844) ^ i79);
            int i81 = ((~(((-317688508) & i) | ((-317688508) ^ i))) | (~(1053927646 | i75))) * 959;
            int i82 = ((i80 | i81) << 1) - (i81 ^ i80);
            int i83 = ~(2050775287 | i);
            int i84 = ((i83 & (-797773036)) | ((-797773036) ^ i83)) * (-318);
            int i85 = (((-853269511) | i84) << 1) - (i84 ^ (-853269511));
            int i86 = ~(((-797773036) ^ i) | ((-797773036) & i));
            int i87 = (i63 ^ (-2050775288)) | (i63 & (-2050775288));
            int i88 = ~((i87 & 797773035) | (i87 ^ 797773035));
            int i89 = (i85 - (~(-(-(((i86 & i88) | (i86 ^ i88)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))))) - 1;
            int i90 = ((-797773036) & i75) | ((-797773036) ^ i75);
            int i91 = -(-(((~((i90 & (-2050775288)) | (i90 ^ (-2050775288)))) | (~(((-1345343509) & i) | ((-1345343509) ^ i)))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
            if (i82 <= (i89 & i91) + (i91 | i89)) {
                throw null;
            }
            int i92 = (~(i & i52)) & (i | i52);
            int i93 = (i92 | (-i92)) >> 31;
            int i94 = i74 & (~i93);
            int i95 = i52 & i93;
            int i96 = (i94 ^ i95) | (i94 & i95);
            try {
                int i97 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int i98 = (i97 ^ 39) + ((i97 & 39) << 1);
                Object[] objArr6 = new Object[1];
                a(new char[]{48774, 43072, 49845, 52816, 26612, 30924, 42342, 13227, 59787, 52248, 29859, 9025, 33667, 26618, 24067, 56765, 3357, 23321, 24905, 34008, 39375, 10878, 38605, 56563, 15126, 33354, 10307, 20635, 45027, 16949, 50000, 32403, 8395, 6969, 44177, 51429, 13859, 58047, 35219, 5730, 7169, 17493}, i98, objArr6);
                File file = new File((String) objArr6[0]);
                if (file.canRead()) {
                    FileReader fileReader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    try {
                        line = bufferedReader.readLine();
                        int i99 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int i100 = (i99 * 221) - 876;
                        int i101 = ~((~i99) | (-5));
                        int i102 = (i75 ^ i99) | (i75 & i99);
                        int i103 = ~((i102 ^ 4) | (i102 & 4));
                        int i104 = -(-(((i101 ^ i103) | (i101 & i103)) * 220));
                        int i105 = (i100 ^ i104) + ((i100 & i104) << 1);
                        int i106 = ~(i75 | 4);
                        int i107 = ((i106 & i99) | (i99 ^ i106)) * (-440);
                        int i108 = ((i105 | i107) << 1) - (i107 ^ i105);
                        int i109 = (i99 ^ 4) | (i99 & 4);
                        Object[] objArr7 = new Object[1];
                        a(new char[]{11131, 5356, 51662, 35719, 22242, 32776}, i108 + (((i109 & i) | (i109 ^ i)) * 220), objArr7);
                        if (line.equals((String) objArr7[0])) {
                            fileReader.close();
                            bufferedReader.close();
                            int i110 = g + 15;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i110 % 128;
                            int i111 = i110 % 2;
                            line = null;
                        } else {
                            int i112 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
                            g = i112 % 128;
                            if (i112 % 2 == 0) {
                                fileReader.close();
                                bufferedReader.close();
                                throw null;
                            }
                            fileReader.close();
                            bufferedReader.close();
                        }
                    } catch (Throwable th) {
                        fileReader.close();
                        bufferedReader.close();
                        throw th;
                    }
                } else {
                    line = null;
                }
            } catch (Exception unused2) {
            }
            try {
                int i113 = -Color.blue(0);
                int iB = zznv.b();
                int i114 = i113 * TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                int i115 = (i114 & 15593) + (i114 | 15593);
                int i116 = i113 | 31;
                int i117 = i116 * (-502);
                int i118 = ((i115 | i117) << 1) - (i115 ^ i117);
                int i119 = ~i113;
                int i120 = ~((i119 ^ (-32)) | (i119 & (-32)));
                int i121 = ~iB;
                int i122 = ~((i119 ^ i121) | (i119 & i121));
                int i123 = (i120 ^ i122) | (i122 & i120);
                int i124 = ~((i113 ^ 31) | (i113 & 31) | iB);
                int i125 = ((i123 ^ i124) | (i123 & i124)) * (-502);
                int i126 = (i118 & i125) + (i125 | i118);
                int i127 = (~i113) | i121;
                int i128 = ~((i127 & 31) | (i127 ^ 31));
                int i129 = ~((iB & i116) | (i116 ^ iB));
                int i130 = ((i128 & i129) | (i128 ^ i129)) * TypedValues.PositionType.TYPE_DRAWPATH;
                Object[] objArr8 = new Object[1];
                a(new char[]{4417, 50819, 50560, 18753, 64459, 3354, 11679, 1079, 24383, 55121, 6280, 51374, 16698, 48311, 21236, 51068, 56333, 58607, 15472, 35649, 35975, 63164, 52376, 56001, 18998, 52172, 17696, 60289, 15390, 50762, 10720, 16153, 41156, 35176}, (i126 & i130) + (i130 | i126), objArr8);
                File file2 = new File((String) objArr8[0]);
                int i131 = g;
                int i132 = ((i131 | 99) << 1) - (i131 ^ 99);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i132 % 128;
                int i133 = i132 % 2;
                if (file2.canRead()) {
                    FileReader fileReader2 = new FileReader(file2);
                    BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
                    try {
                        String line2 = bufferedReader2.readLine();
                        Object[] objArr9 = new Object[1];
                        a(new char[]{3688, 52379, 4736, 14030}, View.resolveSize(0, 0) + 1, objArr9);
                        boolean zEquals = line2.equals((String) objArr9[0]);
                        fileReader2.close();
                        bufferedReader2.close();
                        int i134 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
                        g = i134 % 128;
                        int i135 = i134 % 2;
                        if (zEquals) {
                            int iAxisFromString = MotionEvent.axisFromString("");
                            Object[] objArr10 = new Object[1];
                            a(new char[]{1197, 11510, 32465, 1760, 44396, 1186, 32208, 45839, 54603, 19803, 61908, 27404, 3924, 21640, 42303, 33751, 14826, 1896, 53455, 6468, 10938, 53897, 22821, 63287, 2404, 32589, 49923, 26516, 61210, 39757, 48625, 28918, 6645, 28689, 28017, 45988, 48801, 31601}, (iAxisFromString & 37) + (iAxisFromString | 37), objArr10);
                            File file3 = new File((String) objArr10[0]);
                            if (file3.canRead()) {
                                FileReader fileReader3 = new FileReader(file3);
                                BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                int i136 = g;
                                int i137 = (i136 & 115) + (i136 | 115);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i137 % 128;
                                int i138 = i137 % 2;
                                try {
                                    String line3 = bufferedReader3.readLine();
                                    char[] cArr2 = {3688, 52379, 4736, 14030};
                                    int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                    int i139 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
                                    int i140 = i139 % 128;
                                    g = i140;
                                    int i141 = i139 % 2;
                                    int i142 = keyRepeatDelay * (-494);
                                    int i143 = (((i142 | (-494)) << 1) - (i142 ^ (-494))) + ((~((keyRepeatDelay ^ 1) | (keyRepeatDelay & 1))) * (-495));
                                    int i144 = (keyRepeatDelay | i63) * 495;
                                    int i145 = (i143 ^ i144) + ((i144 & i143) << 1);
                                    int i146 = ~keyRepeatDelay;
                                    int i147 = ((i140 | 33) << 1) - (i140 ^ 33);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i147 % 128;
                                    int i148 = i147 % 2;
                                    int i149 = ~((i146 & (-2)) | (i146 ^ (-2)));
                                    int i150 = ~(keyRepeatDelay | i63);
                                    int i151 = 495 * ((i150 & i149) | (i149 ^ i150));
                                    int i152 = ((i145 | i151) << 1) - (i151 ^ i145);
                                    Object[] objArr11 = new Object[1];
                                    a(cArr2, i152, objArr11);
                                    boolean zEquals2 = line3.equals((String) objArr11[0]);
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    int i153 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i154 = i153 + 121;
                                    g = i154 % 128;
                                    if (i154 % 2 == 0) {
                                        Object obj = null;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (zEquals2) {
                                        if (line != null) {
                                            int i155 = i153 + 97;
                                            g = i155 % 128;
                                            int i156 = i155 % 2;
                                            objArr = new Object[]{new int[]{(i & (-21)) | (i63 & 20)}, new String[]{line}};
                                        } else {
                                            i4 = 2;
                                        }
                                    }
                                    objArr = new Object[i4];
                                    objArr[0] = new int[]{i};
                                    int i157 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i158 = i157 + 109;
                                    g = i158 % 128;
                                    int i159 = i158 % i4;
                                    strArr = new String[0];
                                    int i160 = i157 + 5;
                                    int i161 = i160 % 128;
                                    g = i161;
                                    int i162 = i160 % i4;
                                    i5 = i161 + 39;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                                    if (i5 % i4 == 0) {
                                        objArr[1] = strArr;
                                        Object obj2 = null;
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    objArr[1] = strArr;
                                } catch (Throwable th2) {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    throw th2;
                                }
                            }
                        }
                        int i163 = ((int[]) objArr[0])[0];
                        int i164 = (~(i & i96)) & (i | i96);
                        int i165 = -i164;
                        int i166 = ((i164 & i165) | (i164 ^ i165)) >> 31;
                        int i167 = (~i166) & i163;
                        int i168 = i166 & i96;
                        int i169 = (i168 & i167) | (i167 ^ i168);
                        String[] strArr3 = (String[]) objArr[1];
                        Object[] objArr12 = new Object[2];
                        int i170 = (i163 & i63) | ((~i163) & i);
                        int i171 = -i170;
                        int i172 = (((i170 & i171) | (i170 ^ i171)) >> 31) & 1;
                        int i173 = -i172;
                        int i174 = g;
                        int i175 = i174 + 1;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i175 % 128;
                        int i176 = i175 % 2;
                        int i177 = (~(((i173 & i172) | (i172 ^ i173)) >> 31)) & 1;
                        objArr12[i172] = null;
                        objArr12[i177] = strArr3;
                        String[] strArr4 = (String[]) objArr12[0];
                        int i178 = (~(i & i169)) & (i | i169);
                        int i179 = ((i174 | 5) << 1) - (i174 ^ 5);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i179 % 128;
                        int i180 = i179 % 2;
                        Object[] objArr13 = {new int[]{i}, new int[1], new int[]{i169}, strArr4};
                        int iMyUid = Process.myUid();
                        int i181 = ((((~((-725088508) | iMyUid)) | 672194594) * (-566)) - 1749638912) + ((~(iMyUid | (-52893914))) * 566) + (((i178 | (-i178)) >> 31) & 16);
                        int i182 = ((i181 * (-167)) - (~(-(-(i2 * (-167)))))) - 1;
                        int i183 = ~i181;
                        int i184 = ~i2;
                        int i185 = ~((i183 ^ i184) | (i183 & i184));
                        int i186 = g + 49;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i186 % 128;
                        int i187 = i186 % 2;
                        int i188 = (i185 | (~((i184 ^ i63) | (i184 & i63)))) * 168;
                        int i189 = (i182 & i188) + (i182 | i188);
                        int i190 = i183 | i184;
                        int i191 = (i189 - (~((~((i190 & i) | (i190 ^ i))) * 168))) - 1;
                        int i192 = (~((i183 ^ i63) | (i63 & i183))) | (~((i183 ^ i2) | (i183 & i2)));
                        int i193 = ~i2;
                        int i194 = (i193 & i181) | (i193 ^ i181);
                        int i195 = (i192 | (~((i & i194) | (i194 ^ i)))) * 168;
                        int i196 = ((i191 | i195) << 1) - (i195 ^ i191);
                        int i197 = i196 << 13;
                        int i198 = (i197 | i196) & (~(i196 & i197));
                        int i199 = i198 >>> 17;
                        int i200 = (i198 | i199) & (~(i198 & i199));
                        int i201 = i200 << 5;
                        ((int[]) objArr13[1])[0] = ((~i200) & i201) | ((~i201) & i200);
                        return objArr13;
                    } catch (Throwable th3) {
                        fileReader2.close();
                        bufferedReader2.close();
                        throw th3;
                    }
                }
            } catch (Exception unused3) {
            }
            i4 = 2;
            objArr = new Object[i4];
            objArr[0] = new int[]{i};
            int i1510 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i1511 = i1510 + 109;
            g = i1511 % 128;
            int i1512 = i1511 % i4;
            strArr = new String[0];
            int i1610 = i1510 + 5;
            int i1611 = i1610 % 128;
            g = i1611;
            int i1612 = i1610 % i4;
            i5 = i1611 + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % i4 == 0) {
                objArr[1] = strArr;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            objArr[1] = strArr;
            int i1613 = ((int[]) objArr[0])[0];
            int i1614 = (~(i & i96)) & (i | i96);
            int i1615 = -i1614;
            int i1616 = ((i1614 & i1615) | (i1614 ^ i1615)) >> 31;
            int i1617 = (~i1616) & i1613;
            int i1618 = i1616 & i96;
            int i1619 = (i1618 & i1617) | (i1617 ^ i1618);
            String[] strArr5 = (String[]) objArr[1];
            Object[] objArr14 = new Object[2];
            int i1710 = (i1613 & i63) | ((~i1613) & i);
            int i1711 = -i1710;
            int i1712 = (((i1710 & i1711) | (i1710 ^ i1711)) >> 31) & 1;
            int i1713 = -i1712;
            int i1714 = g;
            int i1715 = i1714 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1715 % 128;
            int i1716 = i1715 % 2;
            int i1717 = (~(((i1713 & i1712) | (i1712 ^ i1713)) >> 31)) & 1;
            objArr14[i1712] = null;
            objArr14[i1717] = strArr5;
            String[] strArr6 = (String[]) objArr14[0];
            int i1718 = (~(i & i1619)) & (i | i1619);
            int i1719 = ((i1714 | 5) << 1) - (i1714 ^ 5);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1719 % 128;
            int i1810 = i1719 % 2;
            Object[] objArr15 = {new int[]{i}, new int[1], new int[]{i1619}, strArr6};
            int iMyUid2 = Process.myUid();
            int i1811 = ((((~((-725088508) | iMyUid2)) | 672194594) * (-566)) - 1749638912) + ((~(iMyUid2 | (-52893914))) * 566) + (((i1718 | (-i1718)) >> 31) & 16);
            int i1812 = ((i1811 * (-167)) - (~(-(-(i2 * (-167)))))) - 1;
            int i1813 = ~i1811;
            int i1814 = ~i2;
            int i1815 = ~((i1813 ^ i1814) | (i1813 & i1814));
            int i1816 = g + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1816 % 128;
            int i1817 = i1816 % 2;
            int i1818 = (i1815 | (~((i1814 ^ i63) | (i1814 & i63)))) * 168;
            int i1819 = (i1812 & i1818) + (i1812 | i1818);
            int i1910 = i1813 | i1814;
            int i1911 = (i1819 - (~((~((i1910 & i) | (i1910 ^ i))) * 168))) - 1;
            int i1912 = (~((i1813 ^ i63) | (i63 & i1813))) | (~((i1813 ^ i2) | (i1813 & i2)));
            int i1913 = ~i2;
            int i1914 = (i1913 & i1811) | (i1913 ^ i1811);
            int i1915 = (i1912 | (~((i & i1914) | (i1914 ^ i)))) * 168;
            int i1916 = ((i1911 | i1915) << 1) - (i1915 ^ i1911);
            int i1917 = i1916 << 13;
            int i1918 = (i1917 | i1916) & (~(i1916 & i1917));
            int i1919 = i1918 >>> 17;
            int i202 = (i1918 | i1919) & (~(i1918 & i1919));
            int i203 = i202 << 5;
            ((int[]) objArr15[1])[0] = ((~i202) & i203) | ((~i203) & i202);
            return objArr15;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
    }

    private static String $$e(byte b2, int i, short s) {
        int i2 = 108 - (s * 3);
        int i3 = b2 * 2;
        int i4 = (i * 4) + 4;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i2 = i4 + i3;
            i4++;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            int i7 = i2;
            i5 = i6;
            i2 = bArr[i4] + i7;
            i4++;
        }
    }
}
