package com.bpjstku.data.setting.model.request;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.autofill.HintConstants;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.databinding.ActivityLoginBinding;
import com.google.gson.annotations.SerializedName;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/bpjstku/data/setting/model/request/ChangeDataFirstVerificationRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/setting/model/request/ChangeDataFirstVerificationRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "getPhoneNumber"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ChangeDataFirstVerificationRequest extends BaseRequest {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static long b;

    @SerializedName("email")
    private final String email;

    @SerializedName(HintConstants.AUTOFILL_HINT_PHONE_NUMBER)
    private final String phoneNumber;
    private static final byte[] $$a = {21, 65, -9, -121, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 146;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = 92 - r5
            int r7 = r7 * 15
            int r0 = r7 + 38
            int r6 = r6 * 2
            int r6 = r6 + 84
            byte[] r1 = com.bpjstku.data.setting.model.request.ChangeDataFirstVerificationRequest.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 37
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            int r5 = r5 + 1
            r4 = r1[r5]
            int r3 = r3 + 1
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.setting.model.request.ChangeDataFirstVerificationRequest.a(short, byte, int, java.lang.Object[]):void");
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.email;
        int i5 = i2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return str;
    }

    public final String getPhoneNumber() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.phoneNumber;
        int i4 = i3 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public ChangeDataFirstVerificationRequest(String str, String str2) {
        this.email = str;
        this.phoneNumber = str2;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - Gravity.getAbsoluteGravity(0, 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2624, Drawable.resolveOpacity(0, 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (b ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39422), ExpandableListView.getPackedPositionType(0L) + 481, (ViewConfiguration.getJumpTapTimeout() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i4 = $11 + 121;
                $10 = i4 % 128;
                int i5 = i4 % 2;
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
            int i6 = $11 + 41;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.alpha(0) + 39422), 480 - TextUtils.lastIndexOf("", '0', 0), 37 - View.resolveSizeAndState(0, 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
        int i8 = $10 + 53;
        $11 = i8 % 128;
        int i9 = i8 % 2;
    }

    public final ChangeDataFirstVerificationRequest copy(String p0, String p1) throws Throwable {
        int length;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumFlingVelocity = (char) (29944 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
            int i2 = 1755 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int iMyPid = (Process.myPid() >> 22) + 23;
            byte b2 = $$a[7];
            Object[] objArr = new Object[1];
            a((byte) 89, b2, b2, objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, i2, iMyPid, 986134021, false, (String) objArr[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr2 = new Object[1];
        c(new char[]{16106, 55152, 60869, 33350, 39088, 45323, 18321, 23990, 29260, 2245, 8567, 14271, 52238, 57961, 63705, 37205, 42934, 48173, 21149, 26859, 332, 6105}, 59798 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        c(new char[]{16110, 61874, 41024, 21252, 940, 12871, 58641, 38282, 17478, 30487, 10165, 54872, 35102, 47543, 26696}, 53077 - Drawable.resolveOpacity(0, 0), objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (29945 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            int iMyPid2 = (Process.myPid() >> 22) + 1755;
            int iIndexOf = 23 - TextUtils.indexOf("", "", 0);
            byte[] bArr = $$a;
            Object[] objArr4 = new Object[1];
            a((byte) 52, bArr[7], bArr[5], objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iMyPid2, iIndexOf, 1596667560, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 29944);
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1755;
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 23;
                byte[] bArr2 = $$a;
                byte b3 = bArr2[7];
                Object[] objArr5 = new Object[1];
                a(b3, b3, bArr2[5], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, iCombineMeasuredStates, maxKeyCode, 1599039318, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i3 = ~iFreeMemory;
            int i4 = ((((-115335252) + ((~(479208659 | i3)) * 979)) + ((iFreeMemory | 691811085) * (-979))) + (((~(iFreeMemory | 479208659)) | (~(i3 | 691811085))) * 979)) - 1412555849;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i6 ^ (i6 << 5);
        } else {
            if (p0 != null) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                if (i7 % 2 != 0) {
                    p0.length();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                length = p0.length();
            } else {
                length = 0;
            }
            try {
                Object[] objArr7 = {-1777783801};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 42049), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1726, TextUtils.indexOf("", "") + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = ActivityLoginBinding.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(length, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr7), -1412555849);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 29945);
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1755;
                    int i8 = 24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[7];
                    Object[] objArr8 = new Object[1];
                    a(b4, b4, bArr3[5], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, iResolveSizeAndState, i8, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    c(new char[]{16106, 55152, 60869, 33350, 39088, 45323, 18321, 23990, 29260, 2245, 8567, 14271, 52238, 57961, 63705, 37205, 42934, 48173, 21149, 26859, 332, 6105}, (ViewConfiguration.getLongPressTimeout() >> 16) + 59797, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    c(new char[]{16110, 61874, 41024, 21252, 940, 12871, 58641, 38282, 17478, 30487, 10165, 54872, 35102, 47543, 26696}, TextUtils.getOffsetAfter("", 0) + 53077, objArr10);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29944);
                        int edgeSlop = 1755 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24;
                        byte[] bArr4 = $$a;
                        Object[] objArr11 = new Object[1];
                        a((byte) 52, bArr4[7], bArr4[5], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(minimumFlingVelocity, edgeSlop, iIndexOf2, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char packedPositionType = (char) (29944 - ExpandableListView.getPackedPositionType(0L));
                        int i9 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1756;
                        int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0', 0, 0);
                        byte b5 = $$a[7];
                        Object[] objArr12 = new Object[1];
                        a((byte) 89, b5, b5, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionType, i9, iLastIndexOf, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i11 == i10) {
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
            int i13 = i12 % 2;
            int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int iMyPid3 = Process.myPid();
            int i15 = ~(536739534 | iMyPid3);
            int i16 = i14 + 250730269 + ((176160768 | i15) * (-476)) + (i15 * 952) + ((~((~iMyPid3) | 536739534)) * 476);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr13[3])[0] = i18 ^ (i18 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr != null) {
                int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 % 128;
                int i20 = i19 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i11];
            int i21 = i11 - 1;
            iArr[i21] = 1;
            Toast.makeText((Context) null, iArr[((i11 * i21) % 2) - 1], 1).show();
            int i22 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int iNextInt = new Random().nextInt(2077012109);
            int i23 = ~iNextInt;
            int i24 = i22 + 2107890785 + (((~((-553801634) | i23)) | 553796993) * 184) + ((iNextInt | (-766408700)) * (-184)) + ((~((-766404060) | i23)) * 184);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr14[3])[0] = i26 ^ (i26 << 5);
        }
        return new ChangeDataFirstVerificationRequest(p0, p1);
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ ChangeDataFirstVerificationRequest copy$default(ChangeDataFirstVerificationRequest changeDataFirstVerificationRequest, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = i3 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = changeDataFirstVerificationRequest.email;
            int i5 = i3 + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            if (i7 % 2 != 0) {
                str2 = changeDataFirstVerificationRequest.phoneNumber;
                int i8 = 88 / 0;
            } else {
                str2 = changeDataFirstVerificationRequest.phoneNumber;
            }
        }
        return changeDataFirstVerificationRequest.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.email;
        int i4 = i3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.phoneNumber;
        int i5 = i2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
        return str;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ChangeDataFirstVerificationRequest)) {
            int i5 = i3 + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        ChangeDataFirstVerificationRequest changeDataFirstVerificationRequest = (ChangeDataFirstVerificationRequest) p0;
        if (Intrinsics.areEqual(this.email, changeDataFirstVerificationRequest.email)) {
            return Intrinsics.areEqual(this.phoneNumber, changeDataFirstVerificationRequest.phoneNumber);
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public final int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int iHashCode2 = 0;
        if (i2 % 2 != 0) {
            str = this.email;
            if (str == null) {
                iHashCode = 1;
            } else {
                iHashCode2 = 1;
                int i3 = iHashCode2;
                iHashCode2 = str.hashCode();
                iHashCode = i3;
            }
        } else {
            str = this.email;
            if (str == null) {
                iHashCode = 0;
            } else {
                int i4 = iHashCode2;
                iHashCode2 = str.hashCode();
                iHashCode = i4;
            }
        }
        String str2 = this.phoneNumber;
        if (str2 != null) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = str2.hashCode();
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.email;
        String str2 = this.phoneNumber;
        StringBuilder sb = new StringBuilder("ChangeDataFirstVerificationRequest(email=");
        sb.append(str);
        sb.append(", phoneNumber=");
        sb.append(str2);
        sb.append(")");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 38 / 0;
        }
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        b = 4729544128451483536L;
    }
}
