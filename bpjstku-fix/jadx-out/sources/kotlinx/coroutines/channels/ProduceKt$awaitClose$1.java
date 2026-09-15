package kotlinx.coroutines.channels;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
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
import defpackage.deInitSession;
import defpackage.initSession;
import defpackage.setEncoderCallback;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {302}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
public final class ProduceKt$awaitClose$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    private static final byte[] $$c = {49, 89, 41, 48};
    private static final int $$f = 248;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {51, -99, -8, -59, 14, 0, -61, 56, -1, 21, -17, 5, 13, -6, -55, 53, 15, -8, 16, -1, -4, -3, -52, 70, 5, -6, -61, 65, 4, -9, 3, 9, -60, 32, 37, 1, -5, -17, 15, 20, -6, -36, 51, -15, 11, 8, -78, 77, 1, -24, 32, -15, 15, 7, -16, 4, 19, -78, 64};
    private static final int $$e = 219;
    private static final byte[] $$a = {56, 94, 119, -19, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 213;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {57187, 60058, 60060, 60052, 60050, 60047, 60063, 60045, 60051, 60088, 60090, 60083, 60062, 57184, 60056, 60117, 57190, 60040, 60055, 57193, 60073, 60041, 60048, 57189, 60053, 57186, 57188, 57191, 60079, 60054, 60046, 60072, 57192, 60049, 60043, 60034};
    private static char TuitionPaymentFragmentbindingInflater1 = 57191;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 52
            int r6 = 56 - r6
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r0 = r5 + 1
            byte[] r1 = kotlinx.coroutines.channels.ProduceKt$awaitClose$1.$$a
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L14
            r3 = r7
            r7 = r6
            goto L29
        L14:
            r4 = r7
            r7 = r6
            r6 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r0[r2] = r3
            if (r2 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L27:
            r3 = r1[r7]
        L29:
            int r6 = r6 + r3
            int r6 = r6 + (-10)
            int r7 = r7 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ProduceKt$awaitClose$1.a(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 55
            int r8 = 56 - r8
            int r7 = r7 * 55
            int r7 = 59 - r7
            int r9 = 99 - r9
            byte[] r0 = kotlinx.coroutines.channels.ProduceKt$awaitClose$1.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            r6 = r9
            r9 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r6
        L2d:
            int r7 = r7 + 1
            int r9 = r9 + r3
            int r9 = r9 + (-2)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ProduceKt$awaitClose$1.d(short, short, int, java.lang.Object[]):void");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        this.result = obj;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 31533);
            int iIndexOf = TextUtils.indexOf("", "", 0) + 921;
            int i3 = 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            byte b3 = bArr[37];
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, iIndexOf, i3, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{0, 25, '\t', 18, 4, 5, '\t', '\f', 5, 15, '\r', '!', 5, 23, 0, 17, 27, 11, 21, 0, 16, 20}, (byte) ((-16777153) - Color.rgb(0, 0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{18, 24, 4, 31, '\f', '\r', '\b', 18, '\r', 0, 23, 0, 5, 28, 13875}, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 53), KeyEvent.getDeadChar(0, 0) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 31534);
            int i4 = 922 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a((byte) 52, bArr2[37], bArr2[80], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, i4, keyRepeatDelay, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = b + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollDefaultDelay = (char) (31533 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                int maximumDrawingCacheSize = 921 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i7 = 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                byte b4 = $$a[80];
                Object[] objArr6 = new Object[1];
                a((byte) 37, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, maximumDrawingCacheSize, i7, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i8 = (int) Runtime.getRuntime().totalMemory();
            int i9 = ~i8;
            int i10 = 676847433 + (((~(852276660 | i9)) | 70322243) * (-1188));
            int i11 = (~(i8 | (-852276661))) | 70322243;
            int i12 = ~(921802983 | i9);
            int i13 = ((i10 + ((i11 | i12) * 594)) + ((((~((-852276661) | i9)) | 795920) | i12) * 594)) - 1017887242;
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr[0])[0] = i15 ^ (i15 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{0, 25, '\t', 18, 4, 5, '\t', '\f', 4, 31, '!', 16, '\b', 16, 0, 5, '\n', 1, 11, 5, 26, '\n', 18, 15, 0, 7}, (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 84), (Process.myTid() >> 22) + 26, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{'\f', ' ', 13849, 13849, 18, 30, 4, 11, 13851, 13851, 22, 0, '\r', 2, 0, 5, 0, 27}, (byte) (49 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 18, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{31, 3, '\r', 7, '\f', 21, 0, 25, 3, 14, ' ', 30, 23, 11, 17, 24}, (byte) (61 - TextUtils.lastIndexOf("", '0', 0, 0)), 16 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{0, '\n', 18, 30, 0, 5, 11, 5, 7, 5, 14, 11, 15, '\t', '\f', 18}, (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 81), ExpandableListView.getPackedPositionGroup(0L) + 16, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1017887242};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[35];
                byte b6 = bArr3[5];
                Object[] objArr13 = new Object[1];
                d(b5, b6, b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr3[5];
                byte b8 = bArr3[35];
                Object[] objArr14 = new Object[1];
                d(b7, b8, b8, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char jumpTapTimeout = (char) (31533 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    int i16 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 921;
                    int mode = View.MeasureSpec.getMode(0) + 28;
                    byte b9 = $$a[80];
                    Object[] objArr15 = new Object[1];
                    a((byte) 37, b9, b9, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, i16, mode, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    c(new char[]{0, 25, '\t', 18, 4, 5, '\t', '\f', 5, 15, '\r', '!', 5, 23, 0, 17, 27, 11, 21, 0, 16, 20}, (byte) (63 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21, objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(new char[]{18, 24, 4, 31, '\f', '\r', '\b', 18, '\r', 0, 23, 0, 5, 28, 13875}, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 51), 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cMyTid = (char) ((Process.myTid() >> 22) + 31533);
                        int iAxisFromString = 920 - MotionEvent.axisFromString("");
                        int iCombineMeasuredStates = 28 - View.combineMeasuredStates(0, 0);
                        byte[] bArr4 = $$a;
                        Object[] objArr18 = new Object[1];
                        a((byte) 52, bArr4[37], bArr4[80], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyTid, iAxisFromString, iCombineMeasuredStates, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cAlpha = (char) (31533 - Color.alpha(0));
                        int i17 = 921 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iArgb = 28 - Color.argb(0, 0, 0, 0);
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[80];
                        byte b11 = bArr5[37];
                        Object[] objArr19 = new Object[1];
                        a(b10, b11, b11, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAlpha, i17, iArgb, -1048449946, false, (String) objArr19[0], null);
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
        int i18 = ((int[]) objArr[1])[0];
        int i19 = ((int[]) objArr[3])[0];
        if (i19 != i18) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i20 = b + 123;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
                int i21 = i20 % 2;
                while (i2 < strArr.length) {
                    int i22 = b + 105;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
                    if (i22 % 2 == 0) {
                        arrayList.add(strArr[i2]);
                        i2 += 123;
                    } else {
                        arrayList.add(strArr[i2]);
                        i2++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i19));
        }
        int i23 = ((int[]) objArr[0])[0];
        Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i24 = i23 + (((~((-1158546824) | iIdentityHashCode)) | 1639861395) * 398) + 1174839631 + (((~((~iIdentityHashCode) | (-1158546824))) | 1639861395) * 398);
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        Object obj2 = objArr20[0];
        ((int[]) obj2)[0] = i26 ^ (i26 << 5);
        int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
        int i28 = i27 % 128;
        b = i28;
        int i29 = i27 % 2;
        int i30 = i28 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i30 % 128;
        int i31 = i30 % 2;
        int i32 = this.label;
        int i33 = ((int[]) obj2)[0];
        int i34 = i33 * i33;
        int i35 = -(1951048349 * i33);
        int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
        int i37 = -(i33 * (-1232743509));
        int i38 = (((i36 | i37) << 1) - (i37 ^ i36)) - (-48864528);
        int i39 = i38 >> 19;
        int i40 = (((i39 & (-16383)) + (i39 | (-16383))) / 8192) + 1;
        int i41 = (i38 ^ i40) + ((i40 & i38) << 1);
        int i42 = i38 >> 22;
        int i43 = -(i41 ^ (((((i42 | (-2047)) << 1) - (i42 ^ (-2047))) / 1024) + 1));
        int i44 = (i43 & 6) + (i43 | 6);
        int i45 = i44 >> 24;
        int i46 = (((i45 | (-511)) << 1) - (i45 ^ (-511))) / 256;
        int i47 = (i46 ^ 1) + ((i46 & 1) << 1);
        this.label = i32 | (((-1922612772) / (((-((i47 ^ 1) + ((i47 & 1) << 1))) & i44) * 2)) - 1987265917);
        return setEncoderCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2(null, null, this);
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        char c;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $11 + 75;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)));
                        int maximumDrawingCacheSize = 2267 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int i7 = 32 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1));
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, maximumDrawingCacheSize, i7, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
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
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        char c3 = '\b';
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.green(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2266, (ViewConfiguration.getScrollBarSize() >> 8) + 33, -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
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
            int i8 = $10 + 75;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i9 = $11 + 7;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    c = c3;
                    obj = obj2;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = deinitsession;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = deinitsession;
                    objArr4[9] = deinitsession;
                    objArr4[c3] = Integer.valueOf(cCharValue);
                    objArr4[7] = deinitsession;
                    objArr4[6] = deinitsession;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = deinitsession;
                    objArr4[3] = deinitsession;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = deinitsession;
                    objArr4[0] = deinitsession;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - (Process.myTid() >> 22)), Process.getGidForName("") + 3262, 29 - ExpandableListView.getPackedPositionChild(0L), -127612708, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char edgeSlop = (char) (22878 - (ViewConfiguration.getEdgeSlop() >> 16));
                            int iMyTid = (Process.myTid() >> 22) + 594;
                            int mirror = 'A' - AndroidCharacter.getMirror('0');
                            byte b9 = (byte) 0;
                            byte b10 = (byte) (b9 + 3);
                            String str$$g = $$g(b9, b10, (byte) (b10 - 3));
                            c = '\b';
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(edgeSlop, iMyTid, mirror, 1570859318, false, str$$g, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c = '\b';
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                    } else {
                        obj = null;
                        c = '\b';
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i12 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i12];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                        } else {
                            int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
                c3 = c;
            }
        }
        int i16 = 0;
        while (i16 < i) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
            i16++;
            int i17 = $11 + 1;
            $10 = i17 % 128;
            int i18 = i17 % 2;
        }
        objArr[0] = new String(cArr4);
    }

    public ProduceKt$awaitClose$1(Continuation<? super ProduceKt$awaitClose$1> continuation) {
        super(continuation);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, int r8) {
        /*
            byte[] r0 = kotlinx.coroutines.channels.ProduceKt$awaitClose$1.$$c
            int r8 = r8 * 3
            int r8 = 1 - r8
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r7 = r7 + 113
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r4 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L28:
            int r7 = -r7
            int r7 = r7 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ProduceKt$awaitClose$1.$$g(short, int, int):java.lang.String");
    }
}
