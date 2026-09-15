package com.bpjstku.presentation.program.jht.olddaysecurity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.domain.general.model.CodeNamePair;
import defpackage.AudioEncoderConfigAudioProfileResolver;
import defpackage.abortCapture;
import defpackage.getExposureControl;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
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
@DebugMetadata(c = "com.bpjstku.presentation.program.jht.olddaysecurity.BankBottomSheetDialogFragment$handleItemClicked$1", f = "BankBottomSheetDialogFragment.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
public final class BankBottomSheetDialogFragment$handleItemClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CodeNamePair $data;
    int label;
    final /* synthetic */ getExposureControl this$0;
    private static final byte[] $$c = {94, -1, 37, -59};
    private static final int $$f = 94;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {88, 99, -94, -58, -17, 6, -18, -1, 2, 1, 50, -73, -6, 1, -4, -3, -7, -6, 66, -76, 62, 2, -67, 4, -3, -9, 4, 47, -73, 10, -18, -4, 6, -10, -3, 60, -35, -28, -3, -9, 4, 26, -48, -3, -10, -2, -1, -1, -4, 3, -17, 43, -48, -2, -7, 11, -23, 76, -52, -34, 13, -17, -9, -1, -3, -7, -6, 45, -48, -3, -10, -2, -1, -1, -11, 46, -51, 3, 51, -3, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 63};
    private static final int $$e = 105;
    private static final byte[] $$a = {1, 115, -83, 116, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 200;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static long b = -1530336677772487019L;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.BankBottomSheetDialogFragment$handleItemClicked$1.$$a
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r6 = r6 * 52
            int r6 = r6 + 4
            int r1 = 53 - r8
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2d:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-10)
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.BankBottomSheetDialogFragment$handleItemClicked$1.a(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.BankBottomSheetDialogFragment$handleItemClicked$1.$$d
            int r7 = r7 * 13
            int r7 = 97 - r7
            int r6 = r6 * 76
            int r6 = r6 + 4
            int r8 = r8 * 24
            int r1 = 77 - r8
            byte[] r1 = new byte[r1]
            int r8 = 76 - r8
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r6 = -r6
            int r7 = r7 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-4)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.BankBottomSheetDialogFragment$handleItemClicked$1.d(short, short, byte, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(b ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (true) {
            obj = null;
            if (abortcapture.b >= cArrB.length) {
                break;
            }
            int i3 = $10 + 115;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 64837);
                    int iMyPid = 1356 - (Process.myPid() >> 22);
                    int i6 = 39 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    byte b2 = $$c[1];
                    byte b3 = (byte) (b2 + 1);
                    byte b4 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iMyPid, i6, 894276454, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 47773), TextUtils.getTrimmedLength("") + 468, 13 - (ViewConfiguration.getPressedStateDuration() >> 16), 896083767, false, "n", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i7 = $10 + 67;
        $11 = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSize = (char) (31533 - View.resolveSize(0, 0));
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 921;
            int jumpTapTimeout = 28 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            byte b2 = $$a[80];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 | 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSize, pressedStateDuration, jumpTapTimeout, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{55425, 36185, 55520, 61892, 40762, 31023, 26296, 3972, 11042, 64911, 29420, 5028, 16246, 59809, 32362, 9997, 924, 54653, 18948, 11127, 6108, 49465, 22080, 16201, 6686, 45789}, 1 - (KeyEvent.getMaxKeyCode() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{26333, 27542, 26296, 5897, 27523, 2882, 37380, 32235, 38242, 6988, 34389, 25013, 33056, 3964, 35473, 21831, 48592, 13228, 48812}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (31534 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 921;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 29;
            byte[] bArr = $$a;
            byte b4 = bArr[80];
            Object[] objArr5 = new Object[1];
            a(b4, bArr[0], b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, packedPositionType, iLastIndexOf, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maxKeyCode = (char) (31533 - (KeyEvent.getMaxKeyCode() >> 16));
                int edgeSlop = 921 - (ViewConfiguration.getEdgeSlop() >> 16);
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 28;
                byte[] bArr2 = $$a;
                byte b5 = bArr2[0];
                Object[] objArr6 = new Object[1];
                a(b5, b5, (byte) (-bArr2[33]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maxKeyCode, edgeSlop, iKeyCodeFromString, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iNextInt = new Random().nextInt(1317168434);
            int i4 = (((1077245307 + (((~((~iNextInt) | (-882761879))) | 891317765) * (-235))) + (((~((-882761879) | iNextInt)) | 891317765) * (-470))) + (((~(iNextInt | (-10322067))) | 18877953) * 235)) - 1807161395;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
            TuitionPaymentFragmentbindingInflater1 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{1820, 20139, 1917, 12854, 19311, 58799, 45805, 37636, 62655, 15997, 42681, 36644, 57573, 10832, 43617, 48112, 56377, 5791, 40529, 47099, 51290, 737, 33293, 41951, 50612, 28972, 63487, 56351, 45493, 32116}, 1 - TextUtils.indexOf("", ""), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{22060, 10587, 22095, 21981, 62060, 4486, 3064, 26413, 42373, 22922, 8106, 31586, 45508, 19872, 4990, 20382, 36139, 29037, 10066, 17362, 39283, 25878}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{45511, 18037, 45485, 15079, 4120, 2549, 59784, 32589, 16933, 13990, 64971, 25406, 22072, 8912, 61749, 22525, 27344, 7766, 50487, 23461}, -TextUtils.lastIndexOf("", '0', 0, 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{62348, 65267, 62437, 33380, 44016, 44491, 21107, 56188, '4', 36389, 17974, 50967, 5212, 39449, 19197, 62418, 10411, 42699, 32478, 65427}, Color.rgb(0, 0, 0) + 16777217, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
            TuitionPaymentFragmentbindingInflater1 = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -1807161395};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[117];
                byte b7 = b6;
                Object[] objArr13 = new Object[1];
                d(b6, b7, b7, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = bArr3[9];
                byte b9 = b8;
                Object[] objArr14 = new Object[1];
                d(b8, b9, b9, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (31533 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    int scrollBarSize = 921 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int tapTimeout = 28 - (ViewConfiguration.getTapTimeout() >> 16);
                    byte[] bArr4 = $$a;
                    byte b10 = bArr4[0];
                    Object[] objArr16 = new Object[1];
                    a(b10, b10, (byte) (-bArr4[33]), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, scrollBarSize, tapTimeout, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{55425, 36185, 55520, 61892, 40762, 31023, 26296, 3972, 11042, 64911, 29420, 5028, 16246, 59809, 32362, 9997, 924, 54653, 18948, 11127, 6108, 49465, 22080, 16201, 6686, 45789}, KeyEvent.getDeadChar(0, 0) + 1, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{26333, 27542, 26296, 5897, 27523, 2882, 37380, 32235, 38242, 6988, 34389, 25013, 33056, 3964, 35473, 21831, 48592, 13228, 48812}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 31533);
                        int iMyPid = (Process.myPid() >> 22) + 921;
                        int iMyPid2 = 28 - (Process.myPid() >> 22);
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        a(b11, bArr5[0], b11, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(absoluteGravity, iMyPid, iMyPid2, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31532);
                        int defaultSize = View.getDefaultSize(0, 0) + 921;
                        int longPressTimeout = 28 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte b12 = $$a[80];
                        byte b13 = b12;
                        Object[] objArr20 = new Object[1];
                        a(b12, b13, (byte) (b13 | 52), objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, defaultSize, longPressTimeout, -1048449946, false, (String) objArr20[0], null);
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
        int i11 = ((int[]) objArr[1])[0];
        int i12 = ((int[]) objArr[3])[0];
        if (i12 != i11) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i12));
        }
        int i13 = TuitionPaymentFragmentbindingInflater1 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
        int i14 = i13 % 2;
        int i15 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iMyUid = Process.myUid();
        int i16 = i15 + 1998083519 + (((~(935181647 | iMyUid)) | 838897996) * (-756)) + (((~iMyUid) | 935181647) * 756);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr21[0])[0] = i18 ^ (i18 << 5);
        int i19 = TuitionPaymentFragmentbindingInflater1 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
        if (i19 % 2 != 0) {
            throw null;
        }
        int i20 = this.label;
        if (i20 == 0) {
            ResultKt.throwOnFailure(obj);
            Function1 function1 = this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (function1 != null) {
                int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
                TuitionPaymentFragmentbindingInflater1 = i21 % 128;
                if (i21 % 2 == 0) {
                    function1.invoke(this.$data);
                    throw null;
                }
                function1.invoke(this.$data);
            }
            this.label = 1;
            if (AudioEncoderConfigAudioProfileResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault1(300L, this) == coroutine_suspended) {
                int i22 = TuitionPaymentFragmentbindingInflater1 + 75;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
                if (i22 % 2 == 0) {
                    return coroutine_suspended;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        } else {
            if (i20 != 1) {
                int i23 = ((int[]) objArr21[0])[0];
                int i24 = i23 * i23;
                int i25 = -(221074197 * i23);
                int i26 = (i24 & i25) + (i24 | i25);
                int i27 = -(i23 * (-1752694339));
                int i28 = ((i26 ^ i27) + ((i27 & i26) << 1)) - 2025611503;
                int i29 = i28 >> 22;
                int i30 = i29 & (-2047);
                int i31 = ((i29 ^ (-2047)) + (i30 << 1)) / 1024;
                int i32 = (i31 & 1) + (i31 | 1);
                int i33 = (i30 + (i29 | (-2047))) / 1024;
                int i34 = -(((i33 ^ 1) + ((i33 & 1) << 1)) ^ ((i28 ^ i32) + ((i28 & i32) << 1)));
                int i35 = (i34 & 6) + (i34 | 6);
                int i36 = (((i35 >> 29) - 15) / 8) + 1;
                throw new IllegalStateException("25/23/4/13/call to 'resume' before 'invoke' with coroutine".substring(95568 / (((-((i36 ^ 1) + ((i36 & 1) << 1))) & i35) * 1448)));
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.dismiss();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        CoroutineScope coroutineScope2 = coroutineScope;
        Continuation<? super Unit> continuation2 = continuation;
        if (i2 % 2 == 0) {
            return ((BankBottomSheetDialogFragment$handleItemClicked$1) create(coroutineScope2, continuation2)).invokeSuspend(Unit.INSTANCE);
        }
        ((BankBottomSheetDialogFragment$handleItemClicked$1) create(coroutineScope2, continuation2)).invokeSuspend(Unit.INSTANCE);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankBottomSheetDialogFragment$handleItemClicked$1(getExposureControl getexposurecontrol, CodeNamePair codeNamePair, Continuation<? super BankBottomSheetDialogFragment$handleItemClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = getexposurecontrol;
        this.$data = codeNamePair;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        int i = 2 % 2;
        BankBottomSheetDialogFragment$handleItemClicked$1 bankBottomSheetDialogFragment$handleItemClicked$1 = new BankBottomSheetDialogFragment$handleItemClicked$1(this.this$0, this.$data, continuation);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            return bankBottomSheetDialogFragment$handleItemClicked$1;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
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
    private static java.lang.String $$g(byte r6, int r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 107
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.BankBottomSheetDialogFragment$handleItemClicked$1.$$c
            int r8 = r8 * 2
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.BankBottomSheetDialogFragment$handleItemClicked$1.$$g(byte, int, byte):java.lang.String");
    }
}
