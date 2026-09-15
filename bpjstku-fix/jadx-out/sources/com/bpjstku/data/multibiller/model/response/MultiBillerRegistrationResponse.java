package com.bpjstku.data.multibiller.model.response;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bpjstku.data.lib.model.BaseItem;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\u0005"}, d2 = {"Lcom/bpjstku/data/multibiller/model/response/MultiBillerRegistrationResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerRegistrationItem;", "p0", "<init>", "(Lcom/bpjstku/data/multibiller/model/response/MultiBillerRegistrationItem;)V", "component1", "()Lcom/bpjstku/data/multibiller/model/response/MultiBillerRegistrationItem;", "copy", "(Lcom/bpjstku/data/multibiller/model/response/MultiBillerRegistrationItem;)Lcom/bpjstku/data/multibiller/model/response/MultiBillerRegistrationResponse;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bpjstku/data/multibiller/model/response/MultiBillerRegistrationItem;", "getData", "setData"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MultiBillerRegistrationResponse extends BaseItem {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long b;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private MultiBillerRegistrationItem data;
    private static final byte[] $$d = {118, 35, -100, -35, 41, 26, 15, 12, 8, -2, -12, 44, -18, 30, 25, 8, 10, 10, 16, -3, -9, 47, -1, 20, 4, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 113;
    private static final byte[] $$a = {113, 29, -123, -97, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
    private static final int $$b = 220;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 10
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.data.multibiller.model.response.MultiBillerRegistrationResponse.$$a
            int r1 = r8 + 1
            int r6 = r6 * 3
            int r6 = r6 + 97
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L2d:
            int r4 = -r4
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-5)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.multibiller.model.response.MultiBillerRegistrationResponse.a(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.data.multibiller.model.response.MultiBillerRegistrationResponse.$$d
            int r6 = r6 * 31
            int r6 = 53 - r6
            int r8 = r8 * 17
            int r8 = r8 + 67
            int r7 = r7 * 21
            int r7 = 25 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r7]
        L28:
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            int r7 = r7 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.multibiller.model.response.MultiBillerRegistrationResponse.d(byte, short, int, java.lang.Object[]):void");
    }

    public final MultiBillerRegistrationItem getData() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        MultiBillerRegistrationItem multiBillerRegistrationItem = this.data;
        int i5 = i2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return multiBillerRegistrationItem;
    }

    public final void setData(MultiBillerRegistrationItem multiBillerRegistrationItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.data = multiBillerRegistrationItem;
        int i5 = i2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 61 / 0;
        }
    }

    public MultiBillerRegistrationResponse(MultiBillerRegistrationItem multiBillerRegistrationItem) {
        this.data = multiBillerRegistrationItem;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 83;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.myPid() >> 22) + 19472), TextUtils.getOffsetAfter("", 0) + 2624, View.getDefaultSize(0, 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() | (b / 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - KeyEvent.getDeadChar(0, 0)), TextUtils.lastIndexOf("", '0', 0, 0) + 482, 38 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19472 - (KeyEvent.getMaxKeyCode() >> 16)), 2624 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (b ^ 9053247990562531611L);
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 39423), (Process.myTid() >> 22) + 481, 37 - KeyEvent.keyCodeFromString(""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
            int i6 = $11 + 43;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39422 - ((Process.getThreadPriority(0) + 20) >> 6)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 481, 37 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
        int i8 = $10 + 33;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 80 / 0;
        }
    }

    public final int hashCode() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        MultiBillerRegistrationItem multiBillerRegistrationItem = this.data;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char gidForName = (char) ((-1) - Process.getGidForName(""));
            int trimmedLength = 876 - TextUtils.getTrimmedLength("");
            int touchSlop = 10 - (ViewConfiguration.getTouchSlop() >> 8);
            byte[] bArr = $$a;
            byte b2 = bArr[11];
            Object[] objArr3 = new Object[1];
            a(b2, b2, bArr[8], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName, trimmedLength, touchSlop, -1199417970, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{34562, 52846, 5569, 23352, 41600, 59877, 16213, 34552, 52244, 4971, 23187, 41073, 63422, 15639, 33917, 52171, 4414, 22707, 45049, 62805, 15548, 33303}, 18786 - TextUtils.lastIndexOf("", '0', 0), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{34566, 33512, 36044, 38566, 37004, 39557, 42093, 44640, 43070, 45597, 48137, 51194, 49630, 52149, 54692}, 1512 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char mode = (char) View.MeasureSpec.getMode(0);
            int iRgb = Color.rgb(0, 0, 0) + 16778092;
            int size = View.MeasureSpec.getSize(0) + 10;
            byte b3 = $$a[11];
            byte b4 = (byte) (b3 + 1);
            Object[] objArr6 = new Object[1];
            a(b4, b4, b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode, iRgb, size, 254769921, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 876;
                int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0', 0, 0);
                byte[] bArr2 = $$a;
                byte b5 = bArr2[11];
                Object[] objArr7 = new Object[1];
                a(b5, (byte) (b5 + 1), bArr2[10], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iNormalizeMetaState, iLastIndexOf, 1324201839, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = (-1977674988) + (((~((-415414683) | iIdentityHashCode)) | 375104453) * (-318));
            int i7 = ~(375104453 | iIdentityHashCode);
            int i8 = ~iIdentityHashCode;
            int i9 = i6 + ((i7 | (~((-102302278) | i8))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode | (-102302278))) | (~(517716959 | i8))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 375333684;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{34569, 57551, 18575, 45157, 6265, 32782, 59852, 20886, 47468, 8568, 35122, 62165, 23180, 49790, 10800, 37389}, 26573 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{34570, 46512, 57960, 7976, 19915, 31385, 46941, 58395, 4755, 20333, 31798, 43734, 59316, 5191, 16645, 32703}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12982, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            int i12 = TuitionPaymentFragmentbindingInflater1 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr11 = {Integer.valueOf(iIntValue), 375333684};
                byte[] bArr3 = $$d;
                byte b6 = (byte) (-bArr3[22]);
                Object[] objArr12 = new Object[1];
                d(b6, b6, bArr3[28], objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b7 = bArr3[28];
                Object[] objArr13 = new Object[1];
                d(b7, b7, (byte) (-bArr3[22]), objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 11;
                    byte[] bArr4 = $$a;
                    byte b8 = bArr4[11];
                    Object[] objArr14 = new Object[1];
                    a(b8, (byte) (b8 + 1), bArr4[10], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(threadPriority, windowTouchSlop, packedPositionChild, 1324201839, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    c(new char[]{34562, 52846, 5569, 23352, 41600, 59877, 16213, 34552, 52244, 4971, 23187, 41073, 63422, 15639, 33917, 52171, 4414, 22707, 45049, 62805, 15548, 33303}, 18787 - (ViewConfiguration.getEdgeSlop() >> 16), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(new char[]{34566, 33512, 36044, 38566, 37004, 39557, 42093, 44640, 43070, 45597, 48137, 51194, 49630, 52149, 54692}, 1511 - Color.alpha(0), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                        int maximumDrawingCacheSize = 876 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int iGreen = 10 - Color.green(0);
                        byte b9 = $$a[11];
                        byte b10 = (byte) (b9 + 1);
                        Object[] objArr17 = new Object[1];
                        a(b10, b10, b9, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, maximumDrawingCacheSize, iGreen, 254769921, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf2 = (char) TextUtils.indexOf("", "");
                        int pressedStateDuration = 876 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 11;
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[11];
                        Object[] objArr18 = new Object[1];
                        a(b11, b11, bArr5[8], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, pressedStateDuration, iIndexOf, -1199417970, false, (String) objArr18[0], null);
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
        int i14 = ((int[]) objArr[2])[0];
        int i15 = ((int[]) objArr[0])[0];
        if (i15 == i14) {
            int i16 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i17 = i16 + (-875256932) + (((~iIdentityHashCode2) | 73931298) * 1324) + (((~(iIdentityHashCode2 | (-59991502))) | (~(100301730 | iIdentityHashCode2))) * (-1324)) + 1814776416;
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr2[1])[0] = i19 ^ (i19 << 5);
            int i20 = TuitionPaymentFragmentbindingInflater1 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
            int i21 = i20 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                TuitionPaymentFragmentbindingInflater1 = i22 % 128;
                int i23 = i22 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i15];
            int i24 = i15 - 1;
            iArr[i24] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i24) % 2) - 1], 1).show();
            int i25 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i26 = ~System.identityHashCode(this);
            int i27 = i25 + (-2114563916) + (((~(i26 | 135496992)) | 95185483) * (-160)) + (((~(i26 | 95186763)) | 135496992) * 160);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr2[1])[0] = i29 ^ (i29 << 5);
        }
        if (multiBillerRegistrationItem != null) {
            return multiBillerRegistrationItem.hashCode();
        }
        int i30 = ((int[]) objArr2[1])[0];
        int i31 = i30 * i30;
        int i32 = -(1562382114 * i30);
        int i33 = (((i31 ^ i32) + ((i31 & i32) << 1)) - (~(-(i30 * 1851470180)))) - 1;
        int i34 = (i33 & (-448671351)) + ((-448671351) | i33);
        int i35 = i34 >> 22;
        int i36 = ((i35 & (-2047)) + (i35 | (-2047))) / 1024;
        int i37 = ((i36 | 1) << 1) - (i36 ^ 1);
        int i38 = (i34 & i37) + (i37 | i34);
        int i39 = i34 >> 20;
        int i40 = ((i39 ^ (-8191)) + ((i39 & (-8191)) << 1)) / 4096;
        int i41 = -(((i40 ^ 1) + ((i40 & 1) << 1)) ^ i38);
        int i42 = (i41 ^ 5) + ((i41 & 5) << 1);
        int i43 = i42 >> 25;
        int i44 = (((i43 | (-255)) << 1) - (i43 ^ (-255))) / 128;
        int i45 = (i44 & 1) + (i44 | 1);
        int i46 = 0 / (((-((i45 & 1) + (i45 | 1))) & i42) * 1586);
        int i47 = TuitionPaymentFragmentbindingInflater1 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i47 % 128;
        int i48 = i47 % 2;
        return i46;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        b();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ MultiBillerRegistrationResponse copy$default(MultiBillerRegistrationResponse multiBillerRegistrationResponse, MultiBillerRegistrationItem multiBillerRegistrationItem, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1;
        int i4 = i3 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            multiBillerRegistrationItem = multiBillerRegistrationResponse.data;
            int i6 = i3 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
        }
        MultiBillerRegistrationResponse multiBillerRegistrationResponseCopy = multiBillerRegistrationResponse.copy(multiBillerRegistrationItem);
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        TuitionPaymentFragmentbindingInflater1 = i8 % 128;
        if (i8 % 2 != 0) {
            return multiBillerRegistrationResponseCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final MultiBillerRegistrationItem component1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 17;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        MultiBillerRegistrationItem multiBillerRegistrationItem = this.data;
        int i5 = i3 + 93;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            return multiBillerRegistrationItem;
        }
        throw null;
    }

    public final MultiBillerRegistrationResponse copy(MultiBillerRegistrationItem p0) {
        int i = 2 % 2;
        MultiBillerRegistrationResponse multiBillerRegistrationResponse = new MultiBillerRegistrationResponse(p0);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return multiBillerRegistrationResponse;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 5;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        if (this != p0) {
            return (p0 instanceof MultiBillerRegistrationResponse) && Intrinsics.areEqual(this.data, ((MultiBillerRegistrationResponse) p0).data);
        }
        int i5 = i2 + 111;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        MultiBillerRegistrationItem multiBillerRegistrationItem = this.data;
        StringBuilder sb = new StringBuilder("MultiBillerRegistrationResponse(data=");
        sb.append(multiBillerRegistrationItem);
        sb.append(")");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void b() {
        b = -4796769411303592328L;
    }
}
