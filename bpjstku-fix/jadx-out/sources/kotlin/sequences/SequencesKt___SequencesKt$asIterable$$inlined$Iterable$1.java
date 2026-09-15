package kotlin.sequences;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.Typography;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¸\u0006\u0005"}, d2 = {"Lkotlin/collections/CollectionsKt__IterablesKt$Iterable$1;", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin/collections/CollectionsKt__IterablesKt$Iterable$1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1<T> implements Iterable<T>, KMappedMarker {
    final /* synthetic */ Sequence $this_asIterable$inlined;
    private static final byte[] $$c = {51, -5, 77, 89};
    private static final int $$f = 34;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {59, -124, -78, 46, -2, 21, -2, 11, 6, 11, 24, -4, 5, 28, -6, -9, 43, 6, -3, 4, 11, 11, -10, 28, 21, 13, -7, 23, 10, -59, 58, 22, -1, 23, 6, 3, 4, 29, -12, 7, 21, 1, 22, -8, 11, 21, 12, -4, 20, 11, 6, -3, 11, 23, 9, -1, 14, 2, -11, 43, 6, -3, 4, 11, 11, -23, 40, 12, 7, -56, 22, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, -9, 16, 14, -1, 14, 14, 2, -21, 46, 1, 15, -2, 28, -6, 22, -56};
    private static final int $$e = 225;
    private static final byte[] $$a = {81, -102, -70, -91, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 255;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int b = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {60058, 60063, 59746, 60041, 60054, 59745, 60090, 59751, 60034, 60043, 60053, 60117, 60061, 60060, 60079, 60048, 59744, 60073, 60050, 60051, 60088, 60055, 60040, 60083, 60052, 59749, 60046, 59747, 60045, 60047, 60049, 60056, 59750, 60062, 60072, 59748};
    private static char TuitionPaymentFragmentbindingInflater1 = 57191;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r7 = 53 - r7
            byte[] r0 = kotlin.sequences.SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1.$$a
            int r9 = r9 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2b
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            int r9 = r9 + 1
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r8 = -r8
            int r9 = r9 + r8
            int r8 = r9 + (-10)
            r9 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1.a(int, byte, int, java.lang.Object[]):void");
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
    private static void d(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 24
            int r8 = 108 - r8
            byte[] r0 = kotlin.sequences.SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1.$$d
            int r7 = r7 * 30
            int r7 = 68 - r7
            int r6 = r6 * 67
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L29
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r6]
        L29:
            int r8 = r8 + r3
            int r8 = r8 + (-9)
            int r6 = r6 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1.d(int, short, short, java.lang.Object[]):void");
    }

    public SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1(Sequence sequence) {
        this.$this_asIterable$inlined = sequence;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x021e  */
    /* JADX WARN: Code duplicated, block: B:26:0x022f  */
    @Override // java.lang.Iterable
    public final Iterator<T> iterator() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (31533 - TextUtils.indexOf("", ""));
            int iRgb = (-16776295) - Color.rgb(0, 0, 0);
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 28;
            byte b2 = (byte) ($$b & 52);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(b2, bArr[7], bArr[37], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iRgb, threadPriority, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{4, 6, 2, 4, 30, 24, 5, 7, 28, 18, '\n', '#', '\n', 20, 27, '#', 2, 22, 18, 27, '!', '\r'}, (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 81), 22 - TextUtils.getOffsetBefore("", 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{3, 27, 3, 6, 21, Typography.quote, 5, '\r', 30, 3, 23, 27, 22, 0, 13899}, (byte) ('|' - AndroidCharacter.getMirror('0')), KeyEvent.getDeadChar(0, 0) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 31533);
            int i2 = 921 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iAlpha = 28 - Color.alpha(0);
            byte[] bArr2 = $$a;
            byte b3 = bArr2[80];
            Object[] objArr5 = new Object[1];
            a(b3, b3, bArr2[37], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, i2, iAlpha, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = b + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mode = (char) (View.MeasureSpec.getMode(0) + 31533);
                int absoluteGravity = 921 - Gravity.getAbsoluteGravity(0, 0);
                int scrollBarSize = 28 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte[] bArr3 = $$a;
                byte b4 = (byte) (-bArr3[33]);
                byte b5 = bArr3[80];
                Object[] objArr6 = new Object[1];
                a(b4, b5, (byte) (b5 | 51), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mode, absoluteGravity, scrollBarSize, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i5}, (String[]) objArr7[4]};
            int i6 = ~((~System.identityHashCode(this)) | 368157955);
            int i7 = (((70321155 | i6) * (-374)) - 1712392963) + ((i6 | 297836800) * 374) + 1433371192;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{4, 6, 2, 4, 30, 24, 5, 7, 3, 6, '\n', 6, 7, 30, 24, 23, 24, 22, 26, 11, '\r', 20, '\t', 3, 1, 2}, (byte) (ExpandableListView.getPackedPositionGroup(0L) + 6), 26 - (Process.myPid() >> 22), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{' ', 25, 13815, 13815, Typography.quote, '\t', 24, 11, 13817, 13817, 22, 19, 30, 1, 24, 23, 28, 6}, (byte) (ImageFormat.getBitsPerPixel(0) + 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 17, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = b + 81;
                int i11 = i10 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11;
                if (i10 % 2 != 0) {
                    int i12 = 3 / 0;
                    if (applicationContext instanceof ContextWrapper) {
                        int i13 = i11 + 77;
                        b = i13 % 128;
                        int i14 = i13 % 2;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    }
                } else if (applicationContext instanceof ContextWrapper) {
                    int i15 = i11 + 77;
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = null;
                    }
                }
                applicationContext = applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{0, 6, 24, 4, '\t', 23, 4, 6, 17, 7, ' ', '\n', 23, 28, Typography.quote, 3}, (byte) (View.getDefaultSize(0, 0) + 111), TextUtils.getOffsetAfter("", 0) + 16, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{19, 0, Typography.quote, '\t', 24, 23, 26, 11, 18, 5, 23, 20, 18, 26, 3, 31}, (byte) (Drawable.resolveOpacity(0, 0) + 9), 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i17 = b + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
            int i18 = i17 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1433371192};
                byte[] bArr4 = $$d;
                byte b6 = (byte) (bArr4[41] - 1);
                byte b7 = b6;
                Object[] objArr13 = new Object[1];
                d(b6, b7, b7, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = bArr4[41];
                byte b9 = b8;
                Object[] objArr14 = new Object[1];
                d(b8, b9, b9, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cMyPid = (char) ((Process.myPid() >> 22) + 31533);
                    int i19 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 921;
                    int iAlpha2 = Color.alpha(0) + 28;
                    byte[] bArr5 = $$a;
                    byte b10 = (byte) (-bArr5[33]);
                    byte b11 = bArr5[80];
                    Object[] objArr16 = new Object[1];
                    a(b10, b11, (byte) (b11 | 51), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyPid, i19, iAlpha2, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{4, 6, 2, 4, 30, 24, 5, 7, 28, 18, '\n', '#', '\n', 20, 27, '#', 2, 22, 18, 27, '!', '\r'}, (byte) (82 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 22, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{3, 27, 3, 6, 21, Typography.quote, 5, '\r', 30, 3, 23, 27, 22, 0, 13899}, (byte) (77 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 15, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 31534);
                        int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int absoluteGravity2 = 28 - Gravity.getAbsoluteGravity(0, 0);
                        byte[] bArr6 = $$a;
                        byte b12 = bArr6[80];
                        Object[] objArr19 = new Object[1];
                        a(b12, b12, bArr6[37], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionChild, iLastIndexOf, absoluteGravity2, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) (31532 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        int doubleTapTimeout = 921 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int iKeyCodeFromString = 28 - KeyEvent.keyCodeFromString("");
                        byte b13 = (byte) ($$b & 52);
                        byte[] bArr7 = $$a;
                        Object[] objArr20 = new Object[1];
                        a(b13, bArr7[7], bArr7[37], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, doubleTapTimeout, iKeyCodeFromString, -1048449946, false, (String) objArr20[0], null);
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
        int i20 = ((int[]) objArr[1])[0];
        int i21 = ((int[]) objArr[3])[0];
        if (i21 == i20) {
            int i22 = ((int[]) objArr[0])[0];
            int i23 = ((int[]) objArr[3])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i23}, (String[]) objArr[4]};
            int iMyTid = Process.myTid();
            int i24 = i22 + 2133015597 + (((-172118081) | (~iMyTid)) * (-490)) + (((~(iMyTid | (-1583510092))) | 1411392011) * 490) + 1110199542;
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr21[0])[0] = i26 ^ (i26 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i27 = 0;
                while (i27 < strArr.length) {
                    int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
                    b = i28 % 128;
                    if (i28 % 2 == 0) {
                        arrayList.add(strArr[i27]);
                        i27 += 105;
                    } else {
                        arrayList.add(strArr[i27]);
                        i27++;
                    }
                }
            }
            int[] iArr = new int[i21];
            int i29 = i21 - 1;
            iArr[i29] = 1;
            Toast.makeText((Context) null, iArr[((i21 * i29) % 2) - 1], 1).show();
            int i30 = ((int[]) objArr[0])[0];
            int i31 = ((int[]) objArr[3])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i31}, (String[]) objArr[4]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i32 = i30 + (-1017497949) + (((~((-883762813) | iMaxMemory)) | 890316831) * (-366)) + (((~(iMaxMemory | (-11273825))) | 17827843) * 366);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr22[0])[0] = i34 ^ (i34 << 5);
        }
        return this.$this_asIterable$inlined.iterator();
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        char c = '0';
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 17;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ('0' - AndroidCharacter.getMirror(c)), 2267 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 33, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i4++;
                    c = '0';
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
        try {
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) KeyEvent.keyCodeFromString(""), 2268 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 33 - View.MeasureSpec.getMode(0), -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
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
                int i7 = $11 + 47;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                } else {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                }
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b7 = (byte) 1;
                            byte b8 = (byte) (b7 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49266 - TextUtils.lastIndexOf("", '0', 0)), 3262 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 31, -127612708, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b9 = (byte) 3;
                                byte b10 = (byte) (b9 - 3);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 22879), 595 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 17, 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i8 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i8];
                            int i9 = $10 + 73;
                            $11 = i9 % 128;
                            if (i9 % 2 == 0) {
                                int i10 = 3 / 4;
                            }
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i11 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i11];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                                int i13 = $10 + 103;
                                $11 = i13 % 128;
                                int i14 = i13 % 2;
                            } else {
                                int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                            }
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    obj2 = obj;
                }
            }
            for (int i17 = 0; i17 < i; i17++) {
                cArr4[i17] = (char) (cArr4[i17] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, short r7, int r8) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r8 = r8 * 2
            int r0 = r8 + 1
            int r6 = r6 + 113
            byte[] r1 = kotlin.sequences.SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2b:
            int r4 = -r4
            int r7 = r7 + 1
            int r6 = r6 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1.$$g(byte, short, int):java.lang.String");
    }
}
