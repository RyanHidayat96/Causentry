package com.bpjstku.data.bsu.model.response;

import android.graphics.Color;
import android.graphics.PointF;
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
import com.appsflyer.internal.AFg1xSDK;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ`\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÇ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u0017J\u0010\u0010#\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b#\u0010\u0014R\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010\u0012R\u001c\u0010&\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0014R\u001c\u0010)\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u0014R\u001a\u0010+\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0017R\u001c\u0010.\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0019R\u001c\u00101\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u001bR\u001c\u00104\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001d"}, d2 = {"Lcom/bpjstku/data/bsu/model/response/CheckEligibleBsuResponse;", "", "", "p0", "", "p1", "p2", "", "p3", "Lcom/bpjstku/data/bsu/model/response/DataEmployeeOffice;", "p4", "Lcom/bpjstku/data/bsu/model/response/DataEmployee;", "p5", "Lcom/bpjstku/data/bsu/model/response/DataAccountBalanceEmployee;", "p6", "<init>", "(ZLjava/lang/String;Ljava/lang/String;ILcom/bpjstku/data/bsu/model/response/DataEmployeeOffice;Lcom/bpjstku/data/bsu/model/response/DataEmployee;Lcom/bpjstku/data/bsu/model/response/DataAccountBalanceEmployee;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "()I", "component5", "()Lcom/bpjstku/data/bsu/model/response/DataEmployeeOffice;", "component6", "()Lcom/bpjstku/data/bsu/model/response/DataEmployee;", "component7", "()Lcom/bpjstku/data/bsu/model/response/DataAccountBalanceEmployee;", "copy", "(ZLjava/lang/String;Ljava/lang/String;ILcom/bpjstku/data/bsu/model/response/DataEmployeeOffice;Lcom/bpjstku/data/bsu/model/response/DataEmployee;Lcom/bpjstku/data/bsu/model/response/DataAccountBalanceEmployee;)Lcom/bpjstku/data/bsu/model/response/CheckEligibleBsuResponse;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "isSuccessful", "Z", "message", "Ljava/lang/String;", "getMessage", "messageCode", "getMessageCode", "statusCode", "I", "getStatusCode", "dataKantor", "Lcom/bpjstku/data/bsu/model/response/DataEmployeeOffice;", "getDataKantor", "dataEmployee", "Lcom/bpjstku/data/bsu/model/response/DataEmployee;", "getDataEmployee", "dataAccountBalanceEmployee", "Lcom/bpjstku/data/bsu/model/response/DataAccountBalanceEmployee;", "getDataAccountBalanceEmployee"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CheckEligibleBsuResponse {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int b;

    @SerializedName("rekening")
    private final DataAccountBalanceEmployee dataAccountBalanceEmployee;

    @SerializedName("pekerja")
    private final DataEmployee dataEmployee;

    @SerializedName("kantor")
    private final DataEmployeeOffice dataKantor;

    @SerializedName("isSuccessful")
    private final boolean isSuccessful;

    @SerializedName("message")
    private final String message;

    @SerializedName("messageCode")
    private final String messageCode;

    @SerializedName("statusCode")
    private final int statusCode;
    private static final byte[] $$c = {39, -79, 42};
    private static final int $$d = 239;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {51, -99, -8, -59, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 248;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r7 = 84 - r7
            byte[] r0 = com.bpjstku.data.bsu.model.response.CheckEligibleBsuResponse.$$a
            int r5 = r5 * 15
            int r5 = 53 - r5
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r5
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            int r6 = r6 + 1
            r4 = r0[r6]
        L29:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.bsu.model.response.CheckEligibleBsuResponse.a(int, byte, int, java.lang.Object[]):void");
    }

    public CheckEligibleBsuResponse(boolean z, String str, String str2, int i, DataEmployeeOffice dataEmployeeOffice, DataEmployee dataEmployee, DataAccountBalanceEmployee dataAccountBalanceEmployee) {
        this.isSuccessful = z;
        this.message = str;
        this.messageCode = str2;
        this.statusCode = i;
        this.dataKantor = dataEmployeeOffice;
        this.dataEmployee = dataEmployee;
        this.dataAccountBalanceEmployee = dataAccountBalanceEmployee;
    }

    public final boolean isSuccessful() {
        boolean z;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 != 0) {
            z = this.isSuccessful;
            int i4 = 48 / 0;
        } else {
            z = this.isSuccessful;
        }
        int i5 = i3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMessage() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 105;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.message;
        int i5 = i3 + 71;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        Object obj;
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i5 = $10 + 55;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 3291 - (ViewConfiguration.getScrollBarSize() >> 8), 31 - (Process.myPid() >> 22), 1199271174, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 651, 43 - TextUtils.indexOf((CharSequence) "", '0'), -450685997, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (!(!z)) {
            int i8 = $10 + 109;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i9 = $11 + 39;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 << setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) % 1];
                    try {
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), (KeyEvent.getMaxKeyCode() >> 16) + 651, 44 - (ViewConfiguration.getFadingEdgeLength() >> 16), -450685997, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        obj = null;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651, 44 - ((Process.getThreadPriority(0) + 20) >> 6), -450685997, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    obj = null;
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
            }
            int i10 = $11 + 45;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    public final String getMessageCode() throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 29943);
            int trimmedLength = 1755 - TextUtils.getTrimmedLength("");
            int i4 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22;
            byte[] bArr = $$a;
            Object[] objArr = new Object[1];
            a(bArr[28], bArr[5], bArr[7], objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, trimmedLength, i4, 986134021, false, (String) objArr[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr2 = new Object[1];
        c(false, 163 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 22 - KeyEvent.keyCodeFromString(""), '?' - AndroidCharacter.getMirror('0'), new char[]{65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        c(false, View.getDefaultSize(0, 0) + 167, TextUtils.getOffsetBefore("", 0) + 15, 2 - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2}, objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944);
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1755;
            int i5 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr4 = new Object[1];
            a(b3, (byte) (b3 | 36), b2, objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay, iNormalizeMetaState, i5, 1596667560, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char edgeSlop = (char) (29944 - (ViewConfiguration.getEdgeSlop() >> 16));
                int mirror = 1803 - AndroidCharacter.getMirror('0');
                int i6 = 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr5 = new Object[1];
                a(b5, (byte) (b5 | 88), b4, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(edgeSlop, mirror, i6, 1599039318, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
            int i7 = ~System.identityHashCode(this);
            int i8 = (((((~((-611050381) | i7)) | 541074060) * (-241)) + 553970932) + (((~(i7 | (-69976321))) | (-939522015)) * 241)) - 210218267;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr7 = new Object[1];
            c(false, KeyEvent.getDeadChar(0, 0) + 162, 16 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 15, new char[]{65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b'}, objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            c(false, AndroidCharacter.getMirror('0') + 'v', TextUtils.getOffsetBefore("", 0) + 16, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 9, new char[]{19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14}, objArr8);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr9 = {879259386};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 42049), 1726 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 28 - Process.getGidForName(""), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), -210218267, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) (29945 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int gidForName = Process.getGidForName("") + 1756;
                    int i11 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22;
                    byte b6 = $$a[7];
                    byte b7 = b6;
                    Object[] objArr10 = new Object[1];
                    a(b7, (byte) (b7 | 88), b6, objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, gidForName, i11, 1599039318, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr11 = new Object[1];
                    c(false, 162 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22, 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1}, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(false, 167 - (ViewConfiguration.getEdgeSlop() >> 16), 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 2, new char[]{6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2}, objArr12);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c3 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29944);
                        int iAlpha = 1755 - Color.alpha(0);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr13 = new Object[1];
                        a(b9, (byte) (b9 | 36), b8, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, iAlpha, maximumDrawingCacheSize, 1596667560, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cBlue = (char) (29944 - Color.blue(0));
                        int mirror2 = AndroidCharacter.getMirror('0') + 1707;
                        int i12 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23;
                        byte[] bArr2 = $$a;
                        Object[] objArr14 = new Object[1];
                        a(bArr2[28], bArr2[5], bArr2[7], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cBlue, mirror2, i12, 986134021, false, (String) objArr14[0], null);
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
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr == null) {
                throw null;
            }
            int i13 = TuitionPaymentFragmentbindingInflater1 + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
            for (int i14 = i13 % 2 != 0 ? 0 : 1; i14 < strArr.length; i14++) {
                arrayList.add(strArr[i14]);
            }
            throw null;
        }
        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        TuitionPaymentFragmentbindingInflater1 = i15 % 128;
        int i16 = i15 % 2;
        int i17 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i18 = i17 + 186596752 + ((~((-428081737) | startElapsedRealtime)) * (-301)) + (((~(428829273 | startElapsedRealtime)) | (~((~startElapsedRealtime) | 641431699))) * (-301)) + (((~(startElapsedRealtime | (-641431700))) | 428829273) * 301);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr15[3])[0] = i20 ^ (i20 << 5);
        return this.messageCode;
    }

    public final int getStatusCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        int i5 = this.statusCode;
        int i6 = i3 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DataEmployeeOffice getDataKantor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        DataEmployeeOffice dataEmployeeOffice = this.dataKantor;
        int i5 = i2 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return dataEmployeeOffice;
        }
        throw null;
    }

    public final DataEmployee getDataEmployee() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 55;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        DataEmployee dataEmployee = this.dataEmployee;
        int i5 = i2 + 59;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return dataEmployee;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DataAccountBalanceEmployee getDataAccountBalanceEmployee() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        DataAccountBalanceEmployee dataAccountBalanceEmployee = this.dataAccountBalanceEmployee;
        int i5 = i3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return dataAccountBalanceEmployee;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        b = 1;
        b();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        b = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ CheckEligibleBsuResponse copy$default(CheckEligibleBsuResponse checkEligibleBsuResponse, boolean z, String str, String str2, int i, DataEmployeeOffice dataEmployeeOffice, DataEmployee dataEmployee, DataAccountBalanceEmployee dataAccountBalanceEmployee, int i2, Object obj) {
        String str3;
        String str4;
        int i3;
        DataEmployeeOffice dataEmployeeOffice2;
        DataEmployee dataEmployee2;
        DataAccountBalanceEmployee dataAccountBalanceEmployee2;
        int i4 = 2 % 2;
        boolean z2 = (i2 & 1) != 0 ? checkEligibleBsuResponse.isSuccessful : z;
        if ((i2 & 2) != 0) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            if (i5 % 2 != 0) {
                str3 = checkEligibleBsuResponse.message;
                int i6 = 78 / 0;
            } else {
                str3 = checkEligibleBsuResponse.message;
            }
        } else {
            str3 = str;
        }
        if ((i2 & 4) != 0) {
            int i7 = TuitionPaymentFragmentbindingInflater1 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            int i8 = i7 % 2;
            str4 = checkEligibleBsuResponse.messageCode;
        } else {
            str4 = str2;
        }
        if ((i2 & 8) != 0) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
            TuitionPaymentFragmentbindingInflater1 = i9 % 128;
            int i10 = i9 % 2;
            i3 = checkEligibleBsuResponse.statusCode;
        } else {
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            dataEmployeeOffice2 = checkEligibleBsuResponse.dataKantor;
            int i11 = TuitionPaymentFragmentbindingInflater1 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
            int i12 = i11 % 2;
        } else {
            dataEmployeeOffice2 = dataEmployeeOffice;
        }
        if ((i2 & 32) != 0) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
            int i14 = i13 % 2;
            dataEmployee2 = checkEligibleBsuResponse.dataEmployee;
        } else {
            dataEmployee2 = dataEmployee;
        }
        if ((i2 & 64) != 0) {
            dataAccountBalanceEmployee2 = checkEligibleBsuResponse.dataAccountBalanceEmployee;
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
            TuitionPaymentFragmentbindingInflater1 = i15 % 128;
            int i16 = i15 % 2;
        } else {
            dataAccountBalanceEmployee2 = dataAccountBalanceEmployee;
        }
        return checkEligibleBsuResponse.copy(z2, str3, str4, i3, dataEmployeeOffice2, dataEmployee2, dataAccountBalanceEmployee2);
    }

    public final boolean component1() {
        boolean z;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 97;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 == 0) {
            z = this.isSuccessful;
            int i4 = 66 / 0;
        } else {
            z = this.isSuccessful;
        }
        int i5 = i3 + 75;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return z;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.message;
        int i4 = i3 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 103;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.messageCode;
        int i5 = i2 + 125;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.statusCode;
        if (i3 == 0) {
            int i5 = 99 / 0;
        }
        return i4;
    }

    public final DataEmployeeOffice component5() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 95;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        DataEmployeeOffice dataEmployeeOffice = this.dataKantor;
        int i5 = i3 + 39;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return dataEmployeeOffice;
        }
        throw null;
    }

    public final DataEmployee component6() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        DataEmployee dataEmployee = this.dataEmployee;
        int i5 = i2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return dataEmployee;
    }

    public final DataAccountBalanceEmployee component7() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        DataAccountBalanceEmployee dataAccountBalanceEmployee = this.dataAccountBalanceEmployee;
        int i5 = i3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return dataAccountBalanceEmployee;
        }
        throw null;
    }

    public final CheckEligibleBsuResponse copy(boolean p0, String p1, String p2, int p3, DataEmployeeOffice p4, DataEmployee p5, DataAccountBalanceEmployee p6) {
        int i = 2 % 2;
        CheckEligibleBsuResponse checkEligibleBsuResponse = new CheckEligibleBsuResponse(p0, p1, p2, p3, p4, p5, p6);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return checkEligibleBsuResponse;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 39;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CheckEligibleBsuResponse)) {
            return false;
        }
        CheckEligibleBsuResponse checkEligibleBsuResponse = (CheckEligibleBsuResponse) p0;
        if (this.isSuccessful != checkEligibleBsuResponse.isSuccessful) {
            int i5 = i3 + 17;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.message, checkEligibleBsuResponse.message)) {
            if (!(!Intrinsics.areEqual(this.messageCode, checkEligibleBsuResponse.messageCode))) {
                if (this.statusCode == checkEligibleBsuResponse.statusCode) {
                    return Intrinsics.areEqual(this.dataKantor, checkEligibleBsuResponse.dataKantor) && Intrinsics.areEqual(this.dataEmployee, checkEligibleBsuResponse.dataEmployee) && Intrinsics.areEqual(this.dataAccountBalanceEmployee, checkEligibleBsuResponse.dataAccountBalanceEmployee);
                }
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
                TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            int i9 = TuitionPaymentFragmentbindingInflater1 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
            int i10 = i9 % 2;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int iHashCode5 = Boolean.hashCode(this.isSuccessful);
        String str = this.message;
        if (str == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
            int i3 = TuitionPaymentFragmentbindingInflater1 + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
        }
        String str2 = this.messageCode;
        if (str2 == null) {
            int i5 = TuitionPaymentFragmentbindingInflater1 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        int iHashCode6 = Integer.hashCode(this.statusCode);
        DataEmployeeOffice dataEmployeeOffice = this.dataKantor;
        if (dataEmployeeOffice == null) {
            int i7 = TuitionPaymentFragmentbindingInflater1 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = dataEmployeeOffice.hashCode();
        }
        DataEmployee dataEmployee = this.dataEmployee;
        if (dataEmployee == null) {
            iHashCode4 = 0;
        } else {
            iHashCode4 = dataEmployee.hashCode();
            int i9 = TuitionPaymentFragmentbindingInflater1 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
            int i10 = i9 % 2;
        }
        DataAccountBalanceEmployee dataAccountBalanceEmployee = this.dataAccountBalanceEmployee;
        return (((((((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode6) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (dataAccountBalanceEmployee != null ? dataAccountBalanceEmployee.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        boolean z = this.isSuccessful;
        String str = this.message;
        String str2 = this.messageCode;
        int i2 = this.statusCode;
        DataEmployeeOffice dataEmployeeOffice = this.dataKantor;
        DataEmployee dataEmployee = this.dataEmployee;
        DataAccountBalanceEmployee dataAccountBalanceEmployee = this.dataAccountBalanceEmployee;
        StringBuilder sb = new StringBuilder("CheckEligibleBsuResponse(isSuccessful=");
        sb.append(z);
        sb.append(", message=");
        sb.append(str);
        sb.append(", messageCode=");
        sb.append(str2);
        sb.append(", statusCode=");
        sb.append(i2);
        sb.append(", dataKantor=");
        sb.append(dataEmployeeOffice);
        sb.append(", dataEmployee=");
        sb.append(dataEmployee);
        sb.append(", dataAccountBalanceEmployee=");
        sb.append(dataAccountBalanceEmployee);
        sb.append(")");
        String string = sb.toString();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -83722462;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, int r7, byte r8) {
        /*
            int r6 = r6 * 2
            int r0 = r6 + 1
            byte[] r1 = com.bpjstku.data.bsu.model.response.CheckEligibleBsuResponse.$$c
            int r8 = r8 * 2
            int r8 = 2 - r8
            int r7 = r7 + 119
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2e
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.bsu.model.response.CheckEligibleBsuResponse.$$e(short, int, byte):java.lang.String");
    }
}
