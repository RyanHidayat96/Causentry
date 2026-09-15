package com.midtrans.sdk.corekit.models;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import defpackage.StateObservable;
import defpackage.StateObservableErrorWrapper;
import defpackage.getOutputConfigId;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class CardTransfer extends TransactionModel {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String PAYMENT_TYPE = "credit_card";

    @SerializedName("credit_card")
    private CardPaymentDetails cardPaymentDetails;
    private static final byte[] $$d = {70, -114, 113, 8, 9, 10, 25, 13, 9, -48, 8, 72, 18, 19, -2, 26, 9, 0, 24, -49, 66, 11, 15, 18, 10, -38, 9, 49, 32, 20, 2, 37, -72, 59, 32, 20, 2, 37, -25, 41, 19, 10, -2, 15};
    private static final int $$e = 182;
    private static final byte[] $$a = {84, 10, 24, -102, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 233;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int b = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 5893532150132233680L;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r0 = 53 - r7
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r1 = com.midtrans.sdk.corekit.models.CardTransfer.$$a
            int r6 = r6 * 52
            int r6 = 55 - r6
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L30
        L18:
            r3 = r2
        L19:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L30:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.models.CardTransfer.a(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 40
            int r7 = 44 - r7
            int r8 = r8 * 40
            int r8 = 41 - r8
            int r6 = r6 * 13
            int r6 = r6 + 98
            byte[] r0 = com.midtrans.sdk.corekit.models.CardTransfer.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2f:
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-13)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.models.CardTransfer.d(short, byte, int, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 11;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 19472), 2624 - View.resolveSize(0, 0), 14 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (ViewConfiguration.getEdgeSlop() >> 16)), 481 - Color.argb(0, 0, 0, 0), 37 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $11 + 121;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 39422), 481 - Color.blue(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            try {
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 481 - View.resolveSize(0, 0), 37 - TextUtils.getTrimmedLength(""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArr2);
    }

    public ArrayList<ItemDetails> getItemDetails() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char threadPriority = (char) (37567 - ((Process.getThreadPriority(0) + 20) >> 6));
            int mirror = AndroidCharacter.getMirror('0') + 577;
            int trimmedLength = TextUtils.getTrimmedLength("") + 14;
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            Object[] objArr2 = new Object[1];
            a(b2, b2, bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, mirror, trimmedLength, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{31914, 13512, 60533, 42494, 23824, 5763, 52769, 34334, 16332, 63341, 43175, 24631, 6574, 53553, 35145, 17101, 64118, 46005, 27405, 7347, 54316, 35921}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18541, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{31918, 15764, 65228, 48930, 30836, 14673, 64413, 46332, 30006, 13921, 63321, 45454, 29382, 13105, 60516}, 16690 - TextUtils.lastIndexOf("", '0'), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cArgb = (char) (Color.argb(0, 0, 0, 0) + 37567);
            int mode = View.MeasureSpec.getMode(0) + 625;
            int packedPositionGroup = 14 - ExpandableListView.getPackedPositionGroup(0L);
            byte[] bArr2 = $$a;
            byte b3 = bArr2[5];
            Object[] objArr5 = new Object[1];
            a(b3, bArr2[7], b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cArgb, mode, packedPositionGroup, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (37567 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int deadChar = KeyEvent.getDeadChar(0, 0) + 625;
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 14;
                byte[] bArr3 = $$a;
                byte b4 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b4, b4, bArr3[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, deadChar, tapTimeout, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i2 = ((int[]) objArr7[2])[0];
            int i3 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i3};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            int i5 = ((((-1961870076) + (((~(1771302842 | i4)) | 35655748) * (-108))) + (((~(i4 | 52435278)) | ((~((-52435279) | iIdentityHashCode)) | 1754523312)) * 54)) + ((iIdentityHashCode | 1754523312) * 54)) - 2042330202;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
            objArr = new Object[]{iArr, new int[1], new int[]{i2}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{31914, 48474, 65361, 14660, 31576, 46425, 63317, 12572, 29522, 44364, 61261, 10512, 27518, 42331, 59213, 8531, 25421, 40269, 57169, 6495, 23411, 38216, 55123, 4423, 21314, 36168}, KeyEvent.getDeadChar(0, 0) + 49663, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{31912, 48989, 64383, 14096, 29474, 45002, 60397, 10175, 25507, 40512, 55929, 5731, 21004, 36397, 51925, 1775, 17044, 32438}, (KeyEvent.getMaxKeyCode() >> 16) + 50147, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
                b = i8 % 128;
                if (i8 % 2 == 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    throw null;
                }
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
                    b = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{31905, 42535, 51623, 62221, 5841, 14438, 25572, 34174, 43204, 53776, 62746, 6333, 16932, 26006, 36632, 45797}, 55949 - (ViewConfiguration.getTapTimeout() >> 16), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{31906, 44050, 56788, 3730, 15947, 28435, 39121, 51609, 63851, 10767, 23514, 33980, 46164, 58685, 5881, 18365}, 53437 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            c(new char[]{31993, 21959, 11903, 145, 55566, 45988, 34011, 23842, 14266, 2076, 58039, 47997, 35906, 26363, 16148, 4569, 60012, 49923, 38303, 28261, 16586, 6497, 62458, 50374, 40310, 30653, 18435, 8937, 64388, 52298, 42673, 32581, 20946, 10787, 779, 54697, 44606, 32983, 22885, 12885, 1221, 56623, 47045, 34896, 25249, 15323, 3110, 59065, 48922, 37346, 27249, 17217, 5547, 61006, 49375, 39206, 29194, 17554, 7477, 63386, 51253, 41640, 31639, 19582}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10601, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            c(new char[]{31912, 16301, 64161, 46568, 28903, 13277, 61059, 43469, 25750, 10130, 58045, 40420, 22778, 7074, 54991, 37270, 19593, 3983, 51843, 34173, 16498, 879, 48695, 31068, 13313, 63312, 45599, 27983, 10300, 60217, 42528, 24874, 7186, 57166, 39440, 21775, 4099, 52397, 36768, 19176, 1505, 49329, 33675, 16080, 63944, 46276, 30650, 12977, 60834, 43263, 27564, 9879, 57797, 40076, 24450, 6776, 54560, 36898, 21359, 3682, 51470, 33872, 18255, 532}, 17159 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, -2042330202};
                byte[] bArr4 = $$d;
                byte b5 = (byte) (bArr4[30] - 1);
                Object[] objArr15 = new Object[1];
                d(b5, b5, bArr4[17], objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b6 = bArr4[17];
                byte b7 = b6;
                Object[] objArr16 = new Object[1];
                d(b6, b7, (byte) (b7 + 1), objArr16);
                objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i11 = ((int[]) objArr[0])[0];
                int i12 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    int i13 = b + 91;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                    int i14 = i13 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cGreen = (char) (37567 - Color.green(0));
                        int iGreen = Color.green(0) + 625;
                        int doubleTapTimeout = 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        a(b8, b8, bArr5[5], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cGreen, iGreen, doubleTapTimeout, -973632554, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr18 = new Object[1];
                        c(new char[]{31914, 13512, 60533, 42494, 23824, 5763, 52769, 34334, 16332, 63341, 43175, 24631, 6574, 53553, 35145, 17101, 64118, 46005, 27405, 7347, 54316, 35921}, 18541 - TextUtils.getCapsMode("", 0, 0), objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        c(new char[]{31918, 15764, 65228, 48930, 30836, 14673, 64413, 46332, 30006, 13921, 63321, 45454, 29382, 13105, 60516}, View.resolveSize(0, 0) + 16691, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 37567);
                            int iRgb = Color.rgb(0, 0, 0) + 16777841;
                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 14;
                            byte[] bArr6 = $$a;
                            byte b9 = bArr6[5];
                            Object[] objArr20 = new Object[1];
                            a(b9, bArr6[7], b9, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cNormalizeMetaState, iRgb, pressedStateDuration, -976899241, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 37566);
                            int maximumDrawingCacheSize = 625 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 14;
                            byte[] bArr7 = $$a;
                            byte b10 = bArr7[5];
                            Object[] objArr21 = new Object[1];
                            a(b10, b10, bArr7[7], objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, maximumDrawingCacheSize, iResolveOpacity, -477065106, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 == null) {
                throw null;
            }
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
            b = i15 % 128;
            int i16 = i15 % 2;
            for (String str2 : strArr2) {
                arrayList.add(str2);
            }
            throw null;
        }
        int i17 = b + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
        int i18 = i17 % 2;
        int i19 = ((int[]) objArr[1])[0];
        int i20 = ((int[]) objArr[2])[0];
        int i21 = ((int[]) objArr[0])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr2 = {i20};
        int i22 = ~System.identityHashCode(this);
        int i23 = ~(275565364 | i22);
        int i24 = i19 + (-1473679656) + ((i23 | 1548172756) * 764) + (((~(i22 | 1548172756)) | 2671136) * (-1528)) + ((1277949664 | i23) * 764);
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        ((int[]) objArr[1])[0] = i26 ^ (i26 << 5);
        Object[] objArr22 = {new int[]{i21}, new int[1], iArr2, strArr3};
        ArrayList<ItemDetails> arrayList2 = this.itemDetails;
        int i27 = b + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i27 % 128;
        int i28 = i27 % 2;
        return arrayList2;
    }

    public final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Gson gson, JsonWriter jsonWriter, StateObservableErrorWrapper stateObservableErrorWrapper) throws IOException {
        int i = 2 % 2;
        jsonWriter.beginObject();
        if (this != this.cardPaymentDetails) {
            int i2 = b + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 135);
            CardPaymentDetails cardPaymentDetails = this.cardPaymentDetails;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, CardPaymentDetails.class, cardPaymentDetails).write(jsonWriter, cardPaymentDetails);
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(gson, jsonWriter, stateObservableErrorWrapper);
        jsonWriter.endObject();
        int i4 = b + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final /* synthetic */ void b(Gson gson, JsonReader jsonReader, StateObservable stateObservable) throws IOException {
        boolean z;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        b = i2 % 128;
        int i3 = i2 % 2;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            if (jsonReader.peek() != JsonToken.NULL) {
                int i4 = b + 37;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 122) {
                b(gson, jsonReader, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            } else if (z) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    this.cardPaymentDetails = (CardPaymentDetails) gson.getAdapter(CardPaymentDetails.class).read(jsonReader);
                    throw null;
                }
                this.cardPaymentDetails = (CardPaymentDetails) gson.getAdapter(CardPaymentDetails.class).read(jsonReader);
            } else {
                this.cardPaymentDetails = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
    }

    public CardTransfer(CardPaymentDetails cardPaymentDetails, TransactionDetails transactionDetails, ArrayList<ItemDetails> arrayList, ArrayList<BillingAddress> arrayList2, ArrayList<ShippingAddress> arrayList3, CustomerDetails customerDetails) {
        this.paymentType = "credit_card";
        this.cardPaymentDetails = cardPaymentDetails;
        this.transactionDetails = transactionDetails;
        this.itemDetails = arrayList;
        this.billingAddresses = arrayList2;
        this.shippingAddresses = arrayList3;
        this.customerDetails = customerDetails;
    }

    public ArrayList<BillingAddress> getBillingAddresses() {
        int i = 2 % 2;
        int i2 = b + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        ArrayList<BillingAddress> arrayList = this.billingAddresses;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return arrayList;
    }

    public CardPaymentDetails getCardPaymentDetails() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        CardPaymentDetails cardPaymentDetails = this.cardPaymentDetails;
        int i5 = i3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return cardPaymentDetails;
    }

    public CustomerDetails getCustomerDetails() {
        int i = 2 % 2;
        int i2 = b + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        CustomerDetails customerDetails = this.customerDetails;
        int i4 = b + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return customerDetails;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getPayment_type() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            str = this.paymentType;
            int i3 = 45 / 0;
        } else {
            str = this.paymentType;
        }
        int i4 = b + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ArrayList<ShippingAddress> getShippingAddresses() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
        b = i2 % 128;
        int i3 = i2 % 2;
        ArrayList<ShippingAddress> arrayList = this.shippingAddresses;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
        b = i4 % 128;
        int i5 = i4 % 2;
        return arrayList;
    }

    public String getString() {
        int i = 2 % 2;
        try {
            String json = new Gson().toJson(this);
            int i2 = b + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 49 / 0;
            }
            return json;
        } catch (NullPointerException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public TransactionDetails getTransactionDetails() {
        TransactionDetails transactionDetails;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            transactionDetails = this.transactionDetails;
            int i3 = 45 / 0;
        } else {
            transactionDetails = this.transactionDetails;
        }
        int i4 = b + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return transactionDetails;
    }

    public /* synthetic */ CardTransfer() {
    }
}
