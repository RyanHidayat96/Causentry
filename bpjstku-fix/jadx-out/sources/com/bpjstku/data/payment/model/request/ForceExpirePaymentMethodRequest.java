package com.bpjstku.data.payment.model.request;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.cloudmessaging.zzu;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/bpjstku/data/payment/model/request/ForceExpirePaymentMethodRequest;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/bpjstku/data/payment/model/request/ForceExpirePaymentMethodRequest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "paymentMethodId", "Ljava/lang/String;", "getPaymentMethodId"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ForceExpirePaymentMethodRequest {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;

    @SerializedName("payment_method_id")
    private final String paymentMethodId;
    private static final byte[] $$c = {36, -74, -79, -21};
    private static final int $$d = 183;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {25, -93, -120, -48};
    private static final int $$b = 165;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    private static void c(byte b2, int i, short s, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = 98 - (s * 4);
        int i3 = b2 * 3;
        int i4 = 4 - (i * 4);
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4++;
            i2 = i3 + i4;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                int i6 = bArr[i4];
                i4++;
                i2 += i6;
            }
        }
    }

    public ForceExpirePaymentMethodRequest(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentMethodId = str;
    }

    public final String getPaymentMethodId() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.paymentMethodId;
        int i5 = i2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i5 = $10 + 11;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 3291;
                    int i8 = 31 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte b2 = (byte) ($$d & 1);
                    byte b3 = (byte) (-b2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, tapTimeout, i8, 1199271174, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) KeyEvent.keyCodeFromString(""), KeyEvent.keyCodeFromString("") + 651, View.getDefaultSize(0, 0) + 44, -450685997, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
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
            int i9 = $11 + 83;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 651 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44, -450685997, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
        int i11 = $11 + 21;
        $10 = i11 % 128;
        int i12 = i11 % 2;
    }

    static {
        b = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        b = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ ForceExpirePaymentMethodRequest copy$default(ForceExpirePaymentMethodRequest forceExpirePaymentMethodRequest, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = TuitionPaymentFragmentbindingInflater1 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 == 0) {
                str = forceExpirePaymentMethodRequest.paymentMethodId;
                int i4 = 80 / 0;
            } else {
                str = forceExpirePaymentMethodRequest.paymentMethodId;
            }
        }
        ForceExpirePaymentMethodRequest forceExpirePaymentMethodRequestCopy = forceExpirePaymentMethodRequest.copy(str);
        int i5 = TuitionPaymentFragmentbindingInflater1 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            return forceExpirePaymentMethodRequestCopy;
        }
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.paymentMethodId;
        int i5 = i3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ForceExpirePaymentMethodRequest copy(String p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        ForceExpirePaymentMethodRequest forceExpirePaymentMethodRequest = new ForceExpirePaymentMethodRequest(p0);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return forceExpirePaymentMethodRequest;
        }
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ForceExpirePaymentMethodRequest)) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.paymentMethodId, ((ForceExpirePaymentMethodRequest) p0).paymentMethodId)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 34 / 0;
        }
        return true;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.paymentMethodId;
        if (i3 != 0) {
            return str.hashCode();
        }
        str.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.paymentMethodId;
        StringBuilder sb = new StringBuilder("ForceExpirePaymentMethodRequest(paymentMethodId=");
        sb.append(str);
        sb.append(")");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x09d0  */
    /* JADX WARN: Code duplicated, block: B:105:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:116:0x0a4d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0a6d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0aae  */
    /* JADX WARN: Code duplicated, block: B:121:0x0abd  */
    /* JADX WARN: Code duplicated, block: B:52:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:53:0x05df A[Catch: Exception -> 0x09ee, TRY_LEAVE, TryCatch #0 {Exception -> 0x09ee, blocks: (B:50:0x0525, B:53:0x05df, B:68:0x0710, B:71:0x0727, B:74:0x07d2, B:92:0x0967, B:97:0x099e, B:96:0x099b, B:108:0x09df, B:109:0x09e5, B:111:0x09e7, B:112:0x09ed, B:54:0x05e9, B:58:0x0616, B:60:0x0639, B:67:0x06f3, B:59:0x061f, B:75:0x07dc, B:81:0x0876, B:85:0x08cd, B:91:0x0951, B:95:0x0985, B:86:0x08e4), top: B:132:0x0525, inners: #2, #7 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0605  */
    /* JADX WARN: Code duplicated, block: B:59:0x061f A[Catch: all -> 0x09e6, TryCatch #2 {all -> 0x09e6, blocks: (B:54:0x05e9, B:58:0x0616, B:60:0x0639, B:67:0x06f3, B:59:0x061f), top: B:135:0x05e9, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0681  */
    /* JADX WARN: Code duplicated, block: B:65:0x069d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0727 A[Catch: Exception -> 0x09ee, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x09ee, blocks: (B:50:0x0525, B:53:0x05df, B:68:0x0710, B:71:0x0727, B:74:0x07d2, B:92:0x0967, B:97:0x099e, B:96:0x099b, B:108:0x09df, B:109:0x09e5, B:111:0x09e7, B:112:0x09ed, B:54:0x05e9, B:58:0x0616, B:60:0x0639, B:67:0x06f3, B:59:0x061f, B:75:0x07dc, B:81:0x0876, B:85:0x08cd, B:91:0x0951, B:95:0x0985, B:86:0x08e4), top: B:132:0x0525, inners: #2, #7 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x07d2 A[Catch: Exception -> 0x09ee, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x09ee, blocks: (B:50:0x0525, B:53:0x05df, B:68:0x0710, B:71:0x0727, B:74:0x07d2, B:92:0x0967, B:97:0x099e, B:96:0x099b, B:108:0x09df, B:109:0x09e5, B:111:0x09e7, B:112:0x09ed, B:54:0x05e9, B:58:0x0616, B:60:0x0639, B:67:0x06f3, B:59:0x061f, B:75:0x07dc, B:81:0x0876, B:85:0x08cd, B:91:0x0951, B:95:0x0985, B:86:0x08e4), top: B:132:0x0525, inners: #2, #7 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x081e  */
    /* JADX WARN: Code duplicated, block: B:79:0x083d  */
    /* JADX WARN: Code duplicated, block: B:84:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:86:0x08e4 A[Catch: all -> 0x09de, TRY_LEAVE, TryCatch #7 {all -> 0x09de, blocks: (B:75:0x07dc, B:81:0x0876, B:85:0x08cd, B:91:0x0951, B:95:0x0985, B:86:0x08e4), top: B:144:0x07dc, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0937  */
    /* JADX WARN: Code duplicated, block: B:94:0x096b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [long] */
    /* JADX WARN: Type inference failed for: r14v1, types: [long] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v25, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v50 */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) throws Throwable {
        int i3;
        ?? r14;
        String line;
        Object[] objArr;
        char c;
        int i4;
        String[] strArr;
        Object[] objArr2;
        int i5;
        int i6;
        int i7;
        char c2;
        String[] strArr2;
        Object[] objArr3;
        int i8;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int i9;
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean zEquals;
        File file2;
        int i18;
        FileReader fileReader2;
        BufferedReader bufferedReader2;
        String line2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        boolean zEquals2;
        int i34;
        Object obj;
        int i35;
        int i36;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i37;
        int i38;
        int i39;
        String str;
        int i40 = 2;
        int i41 = 2 % 2;
        int i42 = TuitionPaymentFragmentbindingInflater1;
        int i43 = 1;
        int i44 = ((i42 | 23) << 1) - (i42 ^ 23);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i44 % 128;
        int i45 = i44 % 2;
        int i46 = 0;
        try {
            int gidForName = Process.getGidForName("");
            int i47 = gidForName * (-55);
            int i48 = ((i47 | (-14685)) << 1) - (i47 ^ (-14685));
            int i49 = ~(gidForName | i);
            int i50 = i48 + (((i49 & 267) | (i49 ^ 267)) * 56);
            int i51 = (~((gidForName ^ 267) | (gidForName & 267))) * (-56);
            int i52 = (i50 & i51) + (i51 | i50);
            int i53 = ~i;
            int i54 = ~((i53 ^ 267) | (i53 & 267));
            Object[] objArr4 = new Object[1];
            a(false, (i52 - (~(((gidForName & i54) | (gidForName ^ i54)) * 56))) - 1, 17 - (~(-TextUtils.lastIndexOf("", '0'))), 0 - (~(-TextUtils.indexOf((CharSequence) "", '0'))), new char[]{65535, 65534, 3, '\r', 65502, 65535, 65532, 15, 1, 1, 65535, '\f', 65501, '\t', '\b', '\b', 65535, 65533, 14}, objArr4);
            int i55 = -TextUtils.getOffsetAfter("", 0);
            int i56 = i55 * (-830);
            int i57 = ((i56 | 222144) << 1) - (i56 ^ 222144);
            int i58 = ~(((-268) & i53) | ((-268) ^ i53));
            int i59 = ~((i55 ^ 267) | (i55 & 267) | i);
            int i60 = -(-(((i58 & i59) | (i58 ^ i59)) * (-831)));
            int i61 = (i57 & i60) + (i60 | i57) + ((~(((-268) & i55) | ((-268) ^ i55) | i)) * (-1662));
            int i62 = ~i55;
            int i63 = (~((i55 & i) | (i55 ^ i))) | (~((i62 & i53) | (i62 ^ i53)));
            int i64 = ~((i ^ 267) | (i & 267));
            int i65 = -(-(((i63 & i64) | (i63 ^ i64)) * 831));
            Object[] objArr5 = new Object[1];
            a(false, (i61 ^ i65) + ((i65 & i61) << 1), 17 - (~(-TextUtils.indexOf("", "", 0, 0))), 13 - (~(-(-View.MeasureSpec.getMode(0)))), new char[]{2, 7, 0, 65503, '\b', 11, 65501, 65534, 65531, 14, 0, 0, 65534, 11, 16, 65530, 2, '\r'}, objArr5);
            String[] strArr3 = {(String) objArr4[0], (String) objArr5[0]};
            int i66 = 0;
            while (true) {
                if (i66 >= i40) {
                    i3 = i;
                    break;
                }
                String str2 = strArr3[i66];
                int i67 = -(ViewConfiguration.getTouchSlop() >> 8);
                int i68 = ((i67 | 260) << i43) - (i67 ^ 260);
                int i69 = (CdmaCellLocation.convertQuartSecToDecDegrees(i46) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i46) == 0.0d ? 0 : -1));
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i70 = i69 * 371;
                int i71 = (i70 & 5936) + (i70 | 5936);
                int i72 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i73 = ~(((-17) ^ i72) | ((-17) & i72));
                int i74 = ~i69;
                int i75 = (i73 | (~((i74 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i74 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4)))) * (-370);
                int i76 = TuitionPaymentFragmentbindingInflater1;
                int i77 = i76 + 31;
                String[] strArr4 = strArr3;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i77 % 128;
                int i78 = i77 % i40;
                int i79 = ((i71 | i75) << 1) - (i75 ^ i71);
                int i80 = (~((i74 ^ i72) | (i74 & i72))) | (~(((-17) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-17) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4)));
                int i81 = (i69 ^ 16) | (i69 & 16);
                int i82 = ~i81;
                int i83 = (i79 - (~(-(-(((i80 & i82) | (i80 ^ i82)) * (-370)))))) - 1;
                int i84 = ((i76 | 123) << 1) - (i76 ^ 123);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i84 % 128;
                if (i84 % i40 == 0) {
                    i35 = i83 >>> ((~(i69 | 16)) * 370);
                    i36 = -TextUtils.indexOf((CharSequence) "", '(', 0);
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    i37 = 67;
                } else {
                    i35 = (i83 - (~((~i81) * 370))) - 1;
                    i36 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    i37 = 14;
                }
                int i85 = i35;
                int i86 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
                TuitionPaymentFragmentbindingInflater1 = i86 % 128;
                if (i86 % i40 != 0) {
                    int i87 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i88 = ~i36;
                    i38 = ((193 - i36) * (193 >>> i37)) << ((-192) >> (i87 | (~((i88 & i37) | (i88 ^ i37)))));
                } else {
                    int i89 = 193 * i36;
                    int i90 = i37 * 193;
                    int i91 = (i89 ^ i90) + ((i89 & i90) << 1);
                    int i92 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i93 = ~i36;
                    i38 = (i91 - (~((i92 | (~((i93 & i37) | (i93 ^ i37)))) * (-192)))) - 1;
                }
                int i94 = ~i37;
                int i95 = ~((i36 ^ (-1)) | i94);
                int i96 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i97 = i38 + ((-384) * (i95 | (~((i94 ^ i96) | (i94 & i96)))));
                int i98 = ~i36;
                int i99 = (i98 & i94) | (i98 ^ i94);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i100 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                int i101 = (((-46518044) - (~(-(-(((i100 ^ (-2080372155)) | (i100 & (-2080372155))) * (-192)))))) - (~((41952552 | (~(((-1526343097) ^ i100) | ((-1526343097) & i100)))) * (-384)))) - 1;
                int i102 = ~(((-41952553) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-41952553) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                int i103 = ((-1526343097) ^ i100) | ((-1526343097) & i100);
                int i104 = ~((i103 ^ (-2038419603)) | (i103 & (-2038419603)));
                int i105 = (i102 ^ i104) | (i102 & i104);
                int i106 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault5 | (-554029059));
                int i107 = i101 + (((i105 & i106) | (i105 ^ i106)) * DerHeader.TAG_CLASS_PRIVATE);
                int i108 = (-106750892) + ((~(((-1279803461) & i) | ((-1279803461) ^ i))) * 521);
                int i109 = (i108 ^ (-1798694544)) + (((-1798694544) & i108) << 1);
                int i110 = ((~(((-1332565079) & i53) | ((-1332565079) ^ i53) | (-1280991462))) | (-1333753080)) * 521;
                if (i107 > ((i109 | i110) << 1) - (i109 ^ i110)) {
                    int i111 = ~((i99 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i99 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    int i112 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i113 = (i112 & i94) | (i94 ^ i112);
                    int i114 = i111 | (~((i113 & i36) | (i113 ^ i36)));
                    int i115 = ~((i36 & i37) | (i36 ^ i37) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    int i116 = i114 ^ i115;
                    Object[] objArr6 = new Object[1];
                    a(false, i68, i85, i97 >>> (DerHeader.TAG_CLASS_PRIVATE % ((i114 & i115) | i116)), new char[]{14, 4, 18, 15, '\t', 4, 65486, 15, 19, 65486, 65508, 5, 2, 21, 7, 1}, objArr6);
                    str = (String) objArr6[0];
                    i39 = 0;
                } else {
                    int i117 = ~((i99 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i99 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    int i118 = ~i37;
                    int i119 = i117 | (~((i118 & i96) | (i118 ^ i96) | i36));
                    int i120 = ~((i36 & i37) | (i36 ^ i37) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    int i121 = i119 ^ i120;
                    Object[] objArr7 = new Object[1];
                    a(false, i68, i85, (i97 - (~(((i119 & i120) | i121) * DerHeader.TAG_CLASS_PRIVATE))) - 1, new char[]{14, 4, 18, 15, '\t', 4, 65486, 15, 19, 65486, 65508, 5, 2, 21, 7, 1}, objArr7);
                    i39 = 0;
                    str = (String) objArr7[0];
                }
                Class<?> cls = Class.forName(str);
                if (((Boolean) cls.getMethod(str2, new Class[i39]).invoke(cls, null)).booleanValue()) {
                    i3 = (~(i & 1)) & (i | 1);
                    break;
                }
                i66 = (((i66 | (-62)) << 1) - (i66 ^ (-62))) + 63;
                strArr3 = strArr4;
                i40 = 2;
                i43 = 1;
                i46 = 0;
            }
        } catch (Exception unused) {
            i3 = (i & (-3)) | ((~i) & 2);
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char scrollBarSize = (char) (2419 - (ViewConfiguration.getScrollBarSize() >> 8));
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2845;
                int iGreen = 5 - Color.green(0);
                byte b2 = (byte) 0;
                byte b3 = b2;
                Object[] objArr8 = new Object[1];
                c(b2, b3, b3, objArr8);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, iKeyCodeFromString, iGreen, -501222268, false, (String) objArr8[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j = 555875431;
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            long j2 = TypedValues.PositionType.TYPE_PERCENT_WIDTH;
            long j3 = (j2 * j) + (j2 * jLongValue);
            long j4 = -502;
            long j5 = j | jLongValue;
            long j6 = j3 + (j4 * j5);
            long j7 = -1;
            long j8 = j ^ j7;
            long j9 = (j8 | (jLongValue ^ j7)) ^ j7;
            long j10 = startElapsedRealtime;
            long j11 = j8 | (j10 ^ j7);
            long j12 = (j10 | j5) ^ j7;
            ?? r15 = j9 | (j11 ^ j7) | j12;
            long j13 = j6 + (j4 * r15) + (((long) TypedValues.PositionType.TYPE_DRAWPATH) * ((j7 ^ (jLongValue | j11)) | j12)) + ((long) (-1715062117));
            int i122 = ~i;
            int i123 = ((int) (j13 >> 32)) & (((2114073706 + (((-1443009990) | i122) * (-490))) + (((~(702046234 | i)) | (-2145056224)) * 490)) - 271576316);
            int iMyUid = Process.myUid();
            int i124 = ~iMyUid;
            int i125 = ((int) j13) & ((-1871736089) + (((~((-329129172) | i124)) | (~(1766355581 | iMyUid))) * 1900) + (((~(i124 | (-1766355582))) | (~(329129171 | iMyUid))) * (-950)) + (((~(iMyUid | (-1766355582))) | (~(i124 | 329129171))) * 950));
            int i126 = ((i123 & i125) | (i123 ^ i125)) ^ 1;
            int i127 = -i126;
            int i128 = ((i126 & i127) | (i126 ^ i127)) >> 31;
            int i129 = (i128 & i) | ((i ^ 10) & (~i128));
            int i130 = ((~i3) & i) | (i3 & i122);
            int i131 = (i130 | (-i130)) >> 31;
            int i132 = i129 & (~i131);
            int i133 = i3 & i131;
            int i134 = (i132 ^ i133) | (i133 & i132);
            try {
                try {
                    int longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 40;
                    int i135 = -(ViewConfiguration.getEdgeSlop() >> 16);
                    Object[] objArr9 = new Object[1];
                    a(false, ((longPressTimeout & 263) << 1) + (longPressTimeout ^ 263), fadingEdgeLength, (i135 ^ 8) + ((i135 & 8) << 1), new char[]{17, 65532, 17, 15, 65534, 0, 2, 15, 65484, 16, 22, 16, 65484, '\b', 2, 15, 11, 2, '\t', 65484, 1, 2, 65535, 18, 4, 65484, 17, 15, 65534, 0, 6, 11, 4, 65484, 0, 18, 15, 15, 2, 11}, objArr9);
                    File file3 = new File((String) objArr9[0]);
                    if (!(!file3.canRead())) {
                        try {
                            FileReader fileReader3 = new FileReader(file3);
                            BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                            try {
                                line = bufferedReader3.readLine();
                                r15 = "";
                                try {
                                    int i136 = -TextUtils.indexOf((CharSequence) r15, (CharSequence) r15, 0, 0);
                                    int i137 = -(-View.resolveSize(0, 0));
                                    int i138 = -TextUtils.getOffsetAfter(r15, 0);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i139 = ~i138;
                                    int i140 = (i139 ^ (-3)) | (i139 & (-3));
                                    int i141 = ~((i140 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i140 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                    int i142 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                    int i143 = (((i138 * (-919)) - 1838) - (~(((~((((-3) ^ i142) | ((-3) & i142)) | i138)) | i141) * 920))) - 1;
                                    int i144 = ~i138;
                                    int i145 = -(-(((~((i144 ^ i142) | (i142 & i144))) | (~(i144 | (-3)))) * 920));
                                    int i146 = (i143 & i145) + (i145 | i143);
                                    int i147 = (i144 ^ (-3)) | (i144 & (-3));
                                    int i148 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                    int i149 = (i144 & 2) | (i144 ^ 2);
                                    int i150 = (~((i147 ^ i148) | (i147 & i148))) | (~((i149 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i149 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6)));
                                    int i151 = ((-3) ^ i138) | ((-3) & i138);
                                    int i152 = ~((i151 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i151 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                    Object[] objArr10 = new Object[1];
                                    a(true, ((i136 & 275) << 1) + (i136 ^ 275), ((i137 | 3) << 1) - (i137 ^ 3), (((i150 & i152) | (i150 ^ i152)) * 920) + i146, new char[]{0, 65535, 1}, objArr10);
                                    if (line.equals((String) objArr10[0])) {
                                        fileReader3.close();
                                        bufferedReader3.close();
                                    } else {
                                        fileReader3.close();
                                        bufferedReader3.close();
                                        r14 = r15;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Exception unused2) {
                        }
                        int iLastIndexOf = TextUtils.lastIndexOf(r14, '0');
                        int i153 = iLastIndexOf * 165;
                        int i154 = (i153 ^ (-42869)) + ((i153 & (-42869)) << 1);
                        int i155 = ~((i122 ^ 263) | (i122 & 263));
                        int i156 = i154 + (((i155 & iLastIndexOf) | (iLastIndexOf ^ i155)) * (-328)) + (((iLastIndexOf ^ i) | (iLastIndexOf & i)) * 164);
                        int i157 = ~iLastIndexOf;
                        int i158 = ~((i157 & (-264)) | (i157 ^ (-264)));
                        int i159 = ~((-264) | i);
                        int i160 = (i158 & i159) | (i158 ^ i159);
                        int i161 = iLastIndexOf | i122;
                        int i162 = ~((i161 & 263) | (i161 ^ 263));
                        int i163 = ((i162 & i160) | (i160 ^ i162)) * 164;
                        int i164 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i165 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i166 = (i165 * 375) - 14940;
                        int i167 = ~i165;
                        int i168 = ~((i167 & 20) | (i167 ^ 20));
                        int i169 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | i165);
                        int i170 = ((i168 & i169) | (i168 ^ i169)) * (-374);
                        int i171 = (((i166 ^ i170) + ((i166 & i170) << 1)) - (~((~(((-21) & i165) | ((-21) ^ i165))) * 748))) - 1;
                        int i172 = ~i165;
                        int i173 = ~((i172 & (-21)) | (i172 ^ (-21)));
                        int i174 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                        Object[] objArr11 = new Object[1];
                        a(true, ((i163 & i156) << 1) + (i156 ^ i163), (i164 | 30) + (i164 & 30), (((~((i165 & i174) | (i174 ^ i165))) | i173) * 374) + i171, new char[]{16, 18, 4, 65485, '\n', 3, '\f', 16, 3, '\t', 65485, 17, 23, 17, 65485, 1, '\r', 16, 14, 65485, 2, 3, '\n', 0, 65535, '\f', 3, 65533, 3, 1, 65535}, objArr11);
                        file = new File((String) objArr11[0]);
                        if (!file.canRead()) {
                            fileReader = new FileReader(file);
                            bufferedReader = new BufferedReader(fileReader);
                            try {
                                String line3 = bufferedReader.readLine();
                                i10 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
                                TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                                if (i11 % 2 != 0) {
                                    int i175 = -i10;
                                    i12 = ((i175 ^ TypedValues.PositionType.TYPE_PERCENT_WIDTH) + ((i175 & TypedValues.PositionType.TYPE_PERCENT_WIDTH) << 1)) / ((-502) >> ((i10 ^ 212) | (i10 & 212)));
                                    int i176 = ~i10;
                                    i13 = ~((i176 & (-213)) | (i176 ^ (-213)));
                                } else {
                                    i12 = (((i10 * TypedValues.PositionType.TYPE_PERCENT_WIDTH) - (-106636)) - (~(((i10 ^ 212) | (i10 & 212)) * (-502)))) - 1;
                                    i13 = ~((~i10) | (-213));
                                }
                                int i177 = ~i10;
                                int i178 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                int i179 = i13 | (~((i177 ^ i178) | (i178 & i177)));
                                int i180 = (i10 & 212) | (i10 ^ 212);
                                int i181 = ~(i180 | iTuitionPaymentFragmentspecialinlinedviewModeldefault8);
                                int i182 = (-502) * ((i179 ^ i181) | (i179 & i181));
                                int i183 = (i12 ^ i182) + ((i12 & i182) << 1);
                                int i184 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                int i185 = (i184 & i177) | (i177 ^ i184);
                                int i186 = (((~((i180 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i180 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8))) | (~((i185 & 212) | (i185 ^ 212)))) * TypedValues.PositionType.TYPE_DRAWPATH) + i183;
                                i14 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int i187 = TuitionPaymentFragmentbindingInflater1;
                                i15 = i187 + 53;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                                if (i15 % 2 == 0) {
                                    i16 = ((-919) >>> i14) - 1838;
                                    int i188 = (~i14) | (-2);
                                    i17 = (i188 ^ i) | (i188 & i);
                                } else {
                                    i16 = (i14 * (-919)) - 919;
                                    int i189 = ~i14;
                                    i17 = (i189 ^ (-2)) | (i189 & (-2)) | i;
                                }
                                int i190 = ((-2) ^ i122) | ((-2) & i122);
                                int i191 = i16 + (920 * ((~((i190 ^ i14) | (i190 & i14))) | (~i17)));
                                int i192 = ~i14;
                                int i193 = ((~((i192 ^ i122) | (i192 & i122))) | (~(i192 | (-2)))) * 920;
                                int i194 = (i191 ^ i193) + ((i193 & i191) << 1);
                                int i195 = i187 + 105;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i195 % 128;
                                int i196 = i195 % 2;
                                int i197 = (i192 & (-2)) | (i192 ^ (-2));
                                int i198 = ~i;
                                int i199 = ~((i197 & i198) | (i197 ^ i198));
                                int i200 = ~i14;
                                int i201 = (i200 & 1) | (i200 ^ 1);
                                int i202 = ~((i201 & i) | (i201 ^ i));
                                int i203 = (i199 & i202) | (i199 ^ i202);
                                int i204 = ~(((-2) ^ i14) | (i14 & (-2)) | i);
                                int i205 = i194 + (((i203 & i204) | (i203 ^ i204)) * 920);
                                Object[] objArr12 = new Object[1];
                                a(false, i186, i205, 1 - KeyEvent.normalizeMetaState(0), new char[]{0}, objArr12);
                                zEquals = line3.equals((String) objArr12[0]);
                                fileReader.close();
                                bufferedReader.close();
                                int i206 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i207 = ((i206 | 109) << 1) - (i206 ^ 109);
                                TuitionPaymentFragmentbindingInflater1 = i207 % 128;
                                int i208 = i207 % 2;
                                if (zEquals) {
                                    int i209 = -TextUtils.getCapsMode(r14, 0, 0);
                                    int defaultSize = View.getDefaultSize(0, 0);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i210 = defaultSize * 471;
                                    int i211 = ((i210 | 16956) << 1) - (i210 ^ 16956);
                                    int i212 = ((defaultSize ^ 36) | (defaultSize & 36)) * (-470);
                                    int i213 = (i211 ^ i212) + ((i212 & i211) << 1);
                                    int i214 = ~defaultSize;
                                    int i215 = (~((i214 & (-37)) | (i214 ^ (-37)))) | (~(((-37) & iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | ((-37) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9)));
                                    int i216 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                    int i217 = (i216 & defaultSize) | (i216 ^ defaultSize);
                                    int i218 = ~(i217 | 36);
                                    int i219 = (i213 - (~(((i215 & i218) | (i215 ^ i218)) * (-470)))) - 1;
                                    int i220 = (defaultSize & (-37)) | ((-37) ^ defaultSize);
                                    int i221 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault9 & i220) | (i220 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                                    int i222 = ~((i217 ^ 36) | (i217 & 36));
                                    int i223 = i219 + (((i221 & i222) | (i221 ^ i222)) * 470);
                                    int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                                    Object[] objArr13 = new Object[1];
                                    a(false, (i209 | 262) + (i209 & 262), i223, (maxKeyCode & 11) + (maxKeyCode | 11), new char[]{65485, 18, 16, 65535, 1, 7, '\f', 5, 65533, '\r', '\f', 65485, 17, 23, 17, 65485, '\t', 3, 16, '\f', 3, '\n', 65485, 2, 3, 0, 19, 5, 65485, 18, 16, 65535, 1, 7, '\f', 5}, objArr13);
                                    file2 = new File((String) objArr13[0]);
                                    i18 = ~i;
                                    if (file2.canRead()) {
                                        fileReader2 = new FileReader(file2);
                                        bufferedReader2 = new BufferedReader(fileReader2);
                                        try {
                                            line2 = bufferedReader2.readLine();
                                            i19 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int i224 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                            int i225 = (i224 & 65) + (i224 | 65);
                                            TuitionPaymentFragmentbindingInflater1 = i225 % 128;
                                            int i226 = i225 % 2;
                                            int i227 = i19 * 399;
                                            i20 = (i227 & 84987) + (i227 | 84987);
                                            int i228 = ~i19;
                                            i21 = ~((i228 & 213) | (i228 ^ 213));
                                            i22 = (~(((-214) & i19) | ((-214) ^ i19))) | i21;
                                            i23 = i224 + 125;
                                            TuitionPaymentFragmentbindingInflater1 = i23 % 128;
                                            if (i23 % 2 != 0) {
                                                i24 = (((i20 - (~(398 << ((~((-214) | i)) | i22)))) - 1) - (~(-((-1194) >> (i19 | 213))))) - 1;
                                                i25 = ~(((-214) ^ i18) | ((-214) & i18));
                                                i21 = ~((~i19) | 213);
                                            } else {
                                                int i229 = ~(((-214) ^ i) | ((-214) & i));
                                                int i230 = (i20 - (~(-(-(((i22 ^ i229) | (i229 & i22)) * 398))))) - 1;
                                                int i231 = -(-((i19 | 213) * (-1194)));
                                                i24 = ((i230 | i231) << 1) - (i230 ^ i231);
                                                i25 = ~(((-214) ^ i122) | ((-214) & i122));
                                            }
                                            int i232 = (i25 & i21) | (i25 ^ i21);
                                            int i233 = ~(((-214) & i19) | ((-214) ^ i19));
                                            i26 = i24 + (398 * ((i233 & i232) | (i232 ^ i233)));
                                            int longPressTimeout2 = ViewConfiguration.getLongPressTimeout() >> 16;
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                            int i234 = longPressTimeout2 * (-419);
                                            int i235 = (i234 ^ 421) + ((i234 & 421) << 1);
                                            int i236 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault10 | 1);
                                            int i237 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                            int i238 = i237 + 5;
                                            TuitionPaymentFragmentbindingInflater1 = i238 % 128;
                                            int i239 = i238 % 2;
                                            int i240 = (i235 - (~(-(-(TypedValues.CycleType.TYPE_EASING * i236))))) - 1;
                                            int i241 = ~longPressTimeout2;
                                            int i242 = ~longPressTimeout2;
                                            int i243 = ~((i242 & (-2)) | (i242 ^ (-2)));
                                            int i244 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | 1);
                                            i27 = i240 + (((1 ^ i241) | (i241 & 1)) * (-420)) + (((i243 & i244) | (i243 ^ i244)) * TypedValues.CycleType.TYPE_EASING);
                                            i28 = (i237 ^ 5) + ((i237 & 5) << 1);
                                            TuitionPaymentFragmentbindingInflater1 = i28 % 128;
                                            if (i28 % 2 != 0) {
                                                i29 = -Color.rgb(0, 0, 1);
                                                int i245 = i29 | i;
                                                i30 = ((677 << i29) % (-338)) * ((i245 & 16777214) | (i245 ^ 16777214)) * (-676);
                                            } else {
                                                i29 = -Color.rgb(0, 0, 0);
                                                int i246 = (i29 * 677) - 1560281763;
                                                int i247 = (i29 ^ i) | (i29 & i);
                                                int i248 = ((i247 & 16777214) | (i247 ^ 16777214)) * (-676);
                                                i30 = ((i246 & i248) << 1) + (i246 ^ i248);
                                            }
                                            int i249 = ~(16777214 | i29);
                                            int i250 = ~(i18 | i29);
                                            i31 = (i30 - (~(-(-(((i250 & i249) | (i249 ^ i250)) * 676))))) - 1;
                                            int i251 = ~i29;
                                            i32 = ~((i251 & 16777214) | (i251 ^ 16777214));
                                            int i252 = TuitionPaymentFragmentbindingInflater1;
                                            i33 = (i252 ^ 119) + ((i252 & 119) << 1);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i33 % 128;
                                            if (i33 % 2 == 0) {
                                                int i253 = i32 | (~(16777214 | i122));
                                                int i254 = (i29 & (-16777215)) | (i29 ^ (-16777215));
                                                int i255 = ~((i254 & i) | (i254 ^ i));
                                                int i256 = -(-(676 >> ((i253 & i255) | (i253 ^ i255))));
                                                Object[] objArr14 = new Object[1];
                                                a(false, i26, i27, ((i256 & i31) << 1) + (i31 ^ i256), new char[]{0}, objArr14);
                                                zEquals2 = line2.equals((String) objArr14[0]);
                                                fileReader2.close();
                                            } else {
                                                int i257 = ~((16777214 & i122) | (16777214 ^ i122));
                                                int i258 = (i32 & i257) | (i32 ^ i257);
                                                int i259 = ~((i29 & (-16777215)) | (i29 ^ (-16777215)) | i);
                                                int i260 = ((i258 & i259) | (i258 ^ i259)) * 676;
                                                Object[] objArr15 = new Object[1];
                                                a(false, i26, i27, (i31 & i260) + (i260 | i31), new char[]{0}, objArr15);
                                                zEquals2 = line2.equals((String) objArr15[0]);
                                                fileReader2.close();
                                            }
                                            if (zEquals2 && line != null) {
                                                objArr = new Object[2];
                                                objArr[0] = new int[1];
                                                int i261 = i ^ 20;
                                                int i262 = TuitionPaymentFragmentbindingInflater1 + 117;
                                                int i263 = i262 % 128;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i263;
                                                int i264 = i262 % 2;
                                                String[] strArr5 = {line};
                                                i34 = ((i263 | 99) << 1) - (i263 ^ 99);
                                                TuitionPaymentFragmentbindingInflater1 = i34 % 128;
                                                if (i34 % 2 != 0) {
                                                    obj = objArr[0];
                                                } else {
                                                    obj = objArr[0];
                                                }
                                                ((int[]) obj)[0] = i261;
                                                objArr[1] = strArr5;
                                                c = 0;
                                            }
                                        } finally {
                                            fileReader2.close();
                                            bufferedReader2.close();
                                        }
                                    } else {
                                        int i265 = TuitionPaymentFragmentbindingInflater1 + 83;
                                        int i266 = i265 % 128;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i266;
                                        int i267 = i265 % 2;
                                        int i268 = (i266 ^ 23) + ((i266 & 23) << 1);
                                        TuitionPaymentFragmentbindingInflater1 = i268 % 128;
                                        int i269 = i268 % 2;
                                    }
                                }
                                int i270 = ((int[]) objArr[c])[c];
                                int i271 = (i122 & i134) | ((~i134) & i);
                                int i272 = -i271;
                                int i273 = ((i271 & i272) | (i271 ^ i272)) >> 31;
                                int i274 = (~i273) & i270;
                                int i275 = TuitionPaymentFragmentbindingInflater1 + 69;
                                int i276 = i275 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i276;
                                int i277 = i275 % 2;
                                int i278 = i134 & i273;
                                i4 = (i278 & i274) | (i274 ^ i278);
                                strArr = (String[]) objArr[1];
                                objArr2 = new Object[2];
                                int i279 = i270 ^ i;
                                int i280 = -i279;
                                i5 = (((i279 & i280) | (i279 ^ i280)) >> 31) & 1;
                                i6 = i276 + 77;
                                TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                                if (i6 % 2 != 0) {
                                    int i281 = -i5;
                                    int i282 = ((i281 & i5) | (i5 ^ i281)) >> 84;
                                    int i283 = (~i282) & 1;
                                    int i284 = i282 & 1;
                                    objArr2[i5] = null;
                                    objArr2[(i284 & i283) | (i283 ^ i284)] = strArr;
                                    strArr2 = (String[]) objArr2[0];
                                    objArr3 = new Object[3];
                                    c2 = 0;
                                    i8 = 0;
                                    i7 = 1;
                                } else {
                                    int i285 = -i5;
                                    int i286 = ~(((i285 & i5) | (i5 ^ i285)) >> 31);
                                    i7 = 1;
                                    objArr2[i5] = null;
                                    objArr2[i286 & 1] = strArr;
                                    c2 = 0;
                                    strArr2 = (String[]) objArr2[0];
                                    objArr3 = new Object[4];
                                    i8 = 1;
                                }
                                iArr = new int[i8];
                                objArr3[c2] = iArr;
                                iArr2 = new int[i7];
                                objArr3[i7] = iArr2;
                                iArr3 = new int[i7];
                                objArr3[2] = iArr3;
                                int i287 = i ^ i4;
                                int i288 = -i287;
                                int i289 = (((i287 & i288) | (i287 ^ i288)) >> 31) & 16;
                                i9 = ((i276 | 107) << 1) - (i276 ^ 107);
                                TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                                if (i9 % 2 != 0) {
                                    iArr2[0] = i;
                                    ((int[]) objArr3[4])[0] = i4;
                                    objArr3[5] = strArr2;
                                } else {
                                    iArr[0] = i;
                                    iArr3[0] = i4;
                                    objArr3[3] = strArr2;
                                }
                                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                int i290 = (((~((-924394345) | elapsedCpuTime)) | 873464064) * (-566)) + 499731412 + ((~(elapsedCpuTime | (-50930281))) * 566);
                                int i291 = -(-i289);
                                int i292 = ((i290 | i291) << 1) - (i291 ^ i290);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i293 = i292 * (-337);
                                int i294 = -(-(i2 * 339));
                                int i295 = (i293 ^ i294) + ((i293 & i294) << 1);
                                int i296 = ~i292;
                                int i297 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                int i298 = ~((i296 & i297) | (i296 ^ i297));
                                int i299 = ~i2;
                                int i300 = ~((i299 & i292) | (i299 ^ i292));
                                int i301 = (i298 & i300) | (i298 ^ i300);
                                int i302 = ~((i292 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (i292 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                                int i303 = (i295 - (~(((i301 & i302) | (i301 ^ i302)) * (-338)))) - 1;
                                int i304 = ~i292;
                                int i305 = (i303 - (~(-(-((~(i304 | i2)) * 338))))) - 1;
                                int i306 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
                                TuitionPaymentFragmentbindingInflater1 = i306 % 128;
                                int i307 = i306 % 2;
                                int i308 = (i292 & i2) | (i292 ^ i2);
                                int i309 = i305 + (338 * ((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault11 & i308) | (i308 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11))) | (~((i304 ^ i297) | (i297 & i304)))));
                                int i310 = i309 << 13;
                                int i311 = (i310 | i309) & (~(i309 & i310));
                                int i312 = i311 >>> 17;
                                int i313 = (i311 | i312) & (~(i311 & i312));
                                ((int[]) objArr3[1])[0] = i313 ^ (i313 << 5);
                                return objArr3;
                            } catch (Throwable th3) {
                                fileReader.close();
                                bufferedReader.close();
                                throw th3;
                            }
                        }
                        int i314 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i315 = (i314 & 23) + (i314 | 23);
                        TuitionPaymentFragmentbindingInflater1 = i315 % 128;
                        int i316 = i315 % 2;
                        c = 0;
                        objArr = new Object[]{new int[]{i}, new String[0]};
                        int i2710 = ((int[]) objArr[c])[c];
                        int i2711 = (i122 & i134) | ((~i134) & i);
                        int i2712 = -i2711;
                        int i2713 = ((i2711 & i2712) | (i2711 ^ i2712)) >> 31;
                        int i2714 = (~i2713) & i2710;
                        int i2715 = TuitionPaymentFragmentbindingInflater1 + 69;
                        int i2716 = i2715 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2716;
                        int i2717 = i2715 % 2;
                        int i2718 = i134 & i2713;
                        i4 = (i2718 & i2714) | (i2714 ^ i2718);
                        strArr = (String[]) objArr[1];
                        objArr2 = new Object[2];
                        int i2719 = i2710 ^ i;
                        int i2810 = -i2719;
                        i5 = (((i2719 & i2810) | (i2719 ^ i2810)) >> 31) & 1;
                        i6 = i2716 + 77;
                        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i2811 = -i5;
                            int i2812 = ((i2811 & i5) | (i5 ^ i2811)) >> 84;
                            int i2813 = (~i2812) & 1;
                            int i2814 = i2812 & 1;
                            objArr2[i5] = null;
                            objArr2[(i2814 & i2813) | (i2813 ^ i2814)] = strArr;
                            strArr2 = (String[]) objArr2[0];
                            objArr3 = new Object[3];
                            c2 = 0;
                            i8 = 0;
                            i7 = 1;
                        } else {
                            int i2815 = -i5;
                            int i2816 = ~(((i2815 & i5) | (i5 ^ i2815)) >> 31);
                            i7 = 1;
                            objArr2[i5] = null;
                            objArr2[i2816 & 1] = strArr;
                            c2 = 0;
                            strArr2 = (String[]) objArr2[0];
                            objArr3 = new Object[4];
                            i8 = 1;
                        }
                        iArr = new int[i8];
                        objArr3[c2] = iArr;
                        iArr2 = new int[i7];
                        objArr3[i7] = iArr2;
                        iArr3 = new int[i7];
                        objArr3[2] = iArr3;
                        int i2817 = i ^ i4;
                        int i2818 = -i2817;
                        int i2819 = (((i2817 & i2818) | (i2817 ^ i2818)) >> 31) & 16;
                        i9 = ((i2716 | 107) << 1) - (i2716 ^ 107);
                        TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                        if (i9 % 2 != 0) {
                            iArr2[0] = i;
                            ((int[]) objArr3[4])[0] = i4;
                            objArr3[5] = strArr2;
                        } else {
                            iArr[0] = i;
                            iArr3[0] = i4;
                            objArr3[3] = strArr2;
                        }
                        int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                        int i2910 = (((~((-924394345) | elapsedCpuTime2)) | 873464064) * (-566)) + 499731412 + ((~(elapsedCpuTime2 | (-50930281))) * 566);
                        int i2911 = -(-i2819);
                        int i2912 = ((i2910 | i2911) << 1) - (i2911 ^ i2910);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i2913 = i2912 * (-337);
                        int i2914 = -(-(i2 * 339));
                        int i2915 = (i2913 ^ i2914) + ((i2913 & i2914) << 1);
                        int i2916 = ~i2912;
                        int i2917 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                        int i2918 = ~((i2916 & i2917) | (i2916 ^ i2917));
                        int i2919 = ~i2;
                        int i3010 = ~((i2919 & i2912) | (i2919 ^ i2912));
                        int i3011 = (i2918 & i3010) | (i2918 ^ i3010);
                        int i3012 = ~((i2912 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (i2912 & iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
                        int i3013 = (i2915 - (~(((i3011 & i3012) | (i3011 ^ i3012)) * (-338)))) - 1;
                        int i3014 = ~i2912;
                        int i3015 = (i3013 - (~(-(-((~(i3014 | i2)) * 338))))) - 1;
                        int i3016 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
                        TuitionPaymentFragmentbindingInflater1 = i3016 % 128;
                        int i3017 = i3016 % 2;
                        int i3018 = (i2912 & i2) | (i2912 ^ i2);
                        int i3019 = i3015 + (338 * ((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault12 & i3018) | (i3018 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12))) | (~((i3014 ^ i2917) | (i2917 & i3014)))));
                        int i317 = i3019 << 13;
                        int i318 = (i317 | i3019) & (~(i3019 & i317));
                        int i319 = i318 >>> 17;
                        int i3110 = (i318 | i319) & (~(i318 & i319));
                        ((int[]) objArr3[1])[0] = i3110 ^ (i3110 << 5);
                        return objArr3;
                    }
                    r15 = "";
                } catch (Exception unused3) {
                }
                int iLastIndexOf2 = TextUtils.lastIndexOf(r14, '0');
                int i1510 = iLastIndexOf2 * 165;
                int i1511 = (i1510 ^ (-42869)) + ((i1510 & (-42869)) << 1);
                int i1512 = ~((i122 ^ 263) | (i122 & 263));
                int i1513 = i1511 + (((i1512 & iLastIndexOf2) | (iLastIndexOf2 ^ i1512)) * (-328)) + (((iLastIndexOf2 ^ i) | (iLastIndexOf2 & i)) * 164);
                int i1514 = ~iLastIndexOf2;
                int i1515 = ~((i1514 & (-264)) | (i1514 ^ (-264)));
                int i1516 = ~((-264) | i);
                int i1610 = (i1515 & i1516) | (i1515 ^ i1516);
                int i1611 = iLastIndexOf2 | i122;
                int i1612 = ~((i1611 & 263) | (i1611 ^ 263));
                int i1613 = ((i1612 & i1610) | (i1610 ^ i1612)) * 164;
                int i1614 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int i1615 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i1616 = (i1615 * 375) - 14940;
                int i1617 = ~i1615;
                int i1618 = ~((i1617 & 20) | (i1617 ^ 20));
                int i1619 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault13) | i1615);
                int i1710 = ((i1618 & i1619) | (i1618 ^ i1619)) * (-374);
                int i1711 = (((i1616 ^ i1710) + ((i1616 & i1710) << 1)) - (~((~(((-21) & i1615) | ((-21) ^ i1615))) * 748))) - 1;
                int i1712 = ~i1615;
                int i1713 = ~((i1712 & (-21)) | (i1712 ^ (-21)));
                int i1714 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                Object[] objArr16 = new Object[1];
                a(true, ((i1613 & i1513) << 1) + (i1513 ^ i1613), (i1614 | 30) + (i1614 & 30), (((~((i1615 & i1714) | (i1714 ^ i1615))) | i1713) * 374) + i1711, new char[]{16, 18, 4, 65485, '\n', 3, '\f', 16, 3, '\t', 65485, 17, 23, 17, 65485, 1, '\r', 16, 14, 65485, 2, 3, '\n', 0, 65535, '\f', 3, 65533, 3, 1, 65535}, objArr16);
                file = new File((String) objArr16[0]);
                if (!file.canRead()) {
                    fileReader = new FileReader(file);
                    bufferedReader = new BufferedReader(fileReader);
                    String line4 = bufferedReader.readLine();
                    i10 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
                    TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i1715 = -i10;
                        i12 = ((i1715 ^ TypedValues.PositionType.TYPE_PERCENT_WIDTH) + ((i1715 & TypedValues.PositionType.TYPE_PERCENT_WIDTH) << 1)) / ((-502) >> ((i10 ^ 212) | (i10 & 212)));
                        int i1716 = ~i10;
                        i13 = ~((i1716 & (-213)) | (i1716 ^ (-213)));
                    } else {
                        i12 = (((i10 * TypedValues.PositionType.TYPE_PERCENT_WIDTH) - (-106636)) - (~(((i10 ^ 212) | (i10 & 212)) * (-502)))) - 1;
                        i13 = ~((~i10) | (-213));
                    }
                    int i1717 = ~i10;
                    int i1718 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                    int i1719 = i13 | (~((i1717 ^ i1718) | (i1718 & i1717)));
                    int i1810 = (i10 & 212) | (i10 ^ 212);
                    int i1811 = ~(i1810 | iTuitionPaymentFragmentspecialinlinedviewModeldefault14);
                    int i1812 = (-502) * ((i1719 ^ i1811) | (i1719 & i1811));
                    int i1813 = (i12 ^ i1812) + ((i12 & i1812) << 1);
                    int i1814 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                    int i1815 = (i1814 & i1717) | (i1717 ^ i1814);
                    int i1816 = (((~((i1810 & iTuitionPaymentFragmentspecialinlinedviewModeldefault14) | (i1810 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault14))) | (~((i1815 & 212) | (i1815 ^ 212)))) * TypedValues.PositionType.TYPE_DRAWPATH) + i1813;
                    i14 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int i1817 = TuitionPaymentFragmentbindingInflater1;
                    i15 = i1817 + 53;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                    if (i15 % 2 == 0) {
                        i16 = ((-919) >>> i14) - 1838;
                        int i1818 = (~i14) | (-2);
                        i17 = (i1818 ^ i) | (i1818 & i);
                    } else {
                        i16 = (i14 * (-919)) - 919;
                        int i1819 = ~i14;
                        i17 = (i1819 ^ (-2)) | (i1819 & (-2)) | i;
                    }
                    int i1910 = ((-2) ^ i122) | ((-2) & i122);
                    int i1911 = i16 + (920 * ((~((i1910 ^ i14) | (i1910 & i14))) | (~i17)));
                    int i1912 = ~i14;
                    int i1913 = ((~((i1912 ^ i122) | (i1912 & i122))) | (~(i1912 | (-2)))) * 920;
                    int i1914 = (i1911 ^ i1913) + ((i1913 & i1911) << 1);
                    int i1915 = i1817 + 105;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1915 % 128;
                    int i1916 = i1915 % 2;
                    int i1917 = (i1912 & (-2)) | (i1912 ^ (-2));
                    int i1918 = ~i;
                    int i1919 = ~((i1917 & i1918) | (i1917 ^ i1918));
                    int i2010 = ~i14;
                    int i2011 = (i2010 & 1) | (i2010 ^ 1);
                    int i2012 = ~((i2011 & i) | (i2011 ^ i));
                    int i2013 = (i1919 & i2012) | (i1919 ^ i2012);
                    int i2014 = ~(((-2) ^ i14) | (i14 & (-2)) | i);
                    int i2015 = i1914 + (((i2013 & i2014) | (i2013 ^ i2014)) * 920);
                    Object[] objArr17 = new Object[1];
                    a(false, i1816, i2015, 1 - KeyEvent.normalizeMetaState(0), new char[]{0}, objArr17);
                    zEquals = line4.equals((String) objArr17[0]);
                    fileReader.close();
                    bufferedReader.close();
                    int i2016 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i2017 = ((i2016 | 109) << 1) - (i2016 ^ 109);
                    TuitionPaymentFragmentbindingInflater1 = i2017 % 128;
                    int i2018 = i2017 % 2;
                    if (zEquals) {
                        int i2019 = -TextUtils.getCapsMode(r14, 0, 0);
                        int defaultSize2 = View.getDefaultSize(0, 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault15 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i2110 = defaultSize2 * 471;
                        int i2111 = ((i2110 | 16956) << 1) - (i2110 ^ 16956);
                        int i2112 = ((defaultSize2 ^ 36) | (defaultSize2 & 36)) * (-470);
                        int i2113 = (i2111 ^ i2112) + ((i2112 & i2111) << 1);
                        int i2114 = ~defaultSize2;
                        int i2115 = (~((i2114 & (-37)) | (i2114 ^ (-37)))) | (~(((-37) & iTuitionPaymentFragmentspecialinlinedviewModeldefault15) | ((-37) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15)));
                        int i2116 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault15;
                        int i2117 = (i2116 & defaultSize2) | (i2116 ^ defaultSize2);
                        int i2118 = ~(i2117 | 36);
                        int i2119 = (i2113 - (~(((i2115 & i2118) | (i2115 ^ i2118)) * (-470)))) - 1;
                        int i2210 = (defaultSize2 & (-37)) | ((-37) ^ defaultSize2);
                        int i2211 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault15 & i2210) | (i2210 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15));
                        int i2212 = ~((i2117 ^ 36) | (i2117 & 36));
                        int i2213 = i2119 + (((i2211 & i2212) | (i2211 ^ i2212)) * 470);
                        int maxKeyCode2 = KeyEvent.getMaxKeyCode() >> 16;
                        Object[] objArr18 = new Object[1];
                        a(false, (i2019 | 262) + (i2019 & 262), i2213, (maxKeyCode2 & 11) + (maxKeyCode2 | 11), new char[]{65485, 18, 16, 65535, 1, 7, '\f', 5, 65533, '\r', '\f', 65485, 17, 23, 17, 65485, '\t', 3, 16, '\f', 3, '\n', 65485, 2, 3, 0, 19, 5, 65485, 18, 16, 65535, 1, 7, '\f', 5}, objArr18);
                        file2 = new File((String) objArr18[0]);
                        i18 = ~i;
                        if (file2.canRead()) {
                            int i2610 = TuitionPaymentFragmentbindingInflater1 + 83;
                            int i2611 = i2610 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2611;
                            int i2612 = i2610 % 2;
                            int i2613 = (i2611 ^ 23) + ((i2611 & 23) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i2613 % 128;
                            int i2614 = i2613 % 2;
                        } else {
                            fileReader2 = new FileReader(file2);
                            bufferedReader2 = new BufferedReader(fileReader2);
                            line2 = bufferedReader2.readLine();
                            i19 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i2214 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i2215 = (i2214 & 65) + (i2214 | 65);
                            TuitionPaymentFragmentbindingInflater1 = i2215 % 128;
                            int i2216 = i2215 % 2;
                            int i2217 = i19 * 399;
                            i20 = (i2217 & 84987) + (i2217 | 84987);
                            int i2218 = ~i19;
                            i21 = ~((i2218 & 213) | (i2218 ^ 213));
                            i22 = (~(((-214) & i19) | ((-214) ^ i19))) | i21;
                            i23 = i2214 + 125;
                            TuitionPaymentFragmentbindingInflater1 = i23 % 128;
                            if (i23 % 2 != 0) {
                                i24 = (((i20 - (~(398 << ((~((-214) | i)) | i22)))) - 1) - (~(-((-1194) >> (i19 | 213))))) - 1;
                                i25 = ~(((-214) ^ i18) | ((-214) & i18));
                                i21 = ~((~i19) | 213);
                            } else {
                                int i2219 = ~(((-214) ^ i) | ((-214) & i));
                                int i2310 = (i20 - (~(-(-(((i22 ^ i2219) | (i2219 & i22)) * 398))))) - 1;
                                int i2311 = -(-((i19 | 213) * (-1194)));
                                i24 = ((i2310 | i2311) << 1) - (i2310 ^ i2311);
                                i25 = ~(((-214) ^ i122) | ((-214) & i122));
                            }
                            int i2312 = (i25 & i21) | (i25 ^ i21);
                            int i2313 = ~(((-214) & i19) | ((-214) ^ i19));
                            i26 = i24 + (398 * ((i2313 & i2312) | (i2312 ^ i2313)));
                            int longPressTimeout3 = ViewConfiguration.getLongPressTimeout() >> 16;
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault16 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i2314 = longPressTimeout3 * (-419);
                            int i2315 = (i2314 ^ 421) + ((i2314 & 421) << 1);
                            int i2316 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault16 | 1);
                            int i2317 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i2318 = i2317 + 5;
                            TuitionPaymentFragmentbindingInflater1 = i2318 % 128;
                            int i2319 = i2318 % 2;
                            int i2410 = (i2315 - (~(-(-(TypedValues.CycleType.TYPE_EASING * i2316))))) - 1;
                            int i2411 = ~longPressTimeout3;
                            int i2412 = ~longPressTimeout3;
                            int i2413 = ~((i2412 & (-2)) | (i2412 ^ (-2)));
                            int i2414 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault16) | 1);
                            i27 = i2410 + (((1 ^ i2411) | (i2411 & 1)) * (-420)) + (((i2413 & i2414) | (i2413 ^ i2414)) * TypedValues.CycleType.TYPE_EASING);
                            i28 = (i2317 ^ 5) + ((i2317 & 5) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i28 % 128;
                            if (i28 % 2 != 0) {
                                i29 = -Color.rgb(0, 0, 1);
                                int i2415 = i29 | i;
                                i30 = ((677 << i29) % (-338)) * ((i2415 & 16777214) | (i2415 ^ 16777214)) * (-676);
                            } else {
                                i29 = -Color.rgb(0, 0, 0);
                                int i2416 = (i29 * 677) - 1560281763;
                                int i2417 = (i29 ^ i) | (i29 & i);
                                int i2418 = ((i2417 & 16777214) | (i2417 ^ 16777214)) * (-676);
                                i30 = ((i2416 & i2418) << 1) + (i2416 ^ i2418);
                            }
                            int i2419 = ~(16777214 | i29);
                            int i2510 = ~(i18 | i29);
                            i31 = (i30 - (~(-(-(((i2510 & i2419) | (i2419 ^ i2510)) * 676))))) - 1;
                            int i2511 = ~i29;
                            i32 = ~((i2511 & 16777214) | (i2511 ^ 16777214));
                            int i2512 = TuitionPaymentFragmentbindingInflater1;
                            i33 = (i2512 ^ 119) + ((i2512 & 119) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i33 % 128;
                            if (i33 % 2 == 0) {
                                int i2513 = i32 | (~(16777214 | i122));
                                int i2514 = (i29 & (-16777215)) | (i29 ^ (-16777215));
                                int i2515 = ~((i2514 & i) | (i2514 ^ i));
                                int i2516 = -(-(676 >> ((i2513 & i2515) | (i2513 ^ i2515))));
                                Object[] objArr19 = new Object[1];
                                a(false, i26, i27, ((i2516 & i31) << 1) + (i31 ^ i2516), new char[]{0}, objArr19);
                                zEquals2 = line2.equals((String) objArr19[0]);
                                fileReader2.close();
                            } else {
                                int i2517 = ~((16777214 & i122) | (16777214 ^ i122));
                                int i2518 = (i32 & i2517) | (i32 ^ i2517);
                                int i2519 = ~((i29 & (-16777215)) | (i29 ^ (-16777215)) | i);
                                int i2615 = ((i2518 & i2519) | (i2518 ^ i2519)) * 676;
                                Object[] objArr110 = new Object[1];
                                a(false, i26, i27, (i31 & i2615) + (i2615 | i31), new char[]{0}, objArr110);
                                zEquals2 = line2.equals((String) objArr110[0]);
                                fileReader2.close();
                            }
                            if (zEquals2) {
                                objArr = new Object[2];
                                objArr[0] = new int[1];
                                int i2616 = i ^ 20;
                                int i2617 = TuitionPaymentFragmentbindingInflater1 + 117;
                                int i2618 = i2617 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2618;
                                int i2619 = i2617 % 2;
                                String[] strArr6 = {line};
                                i34 = ((i2618 | 99) << 1) - (i2618 ^ 99);
                                TuitionPaymentFragmentbindingInflater1 = i34 % 128;
                                if (i34 % 2 != 0) {
                                    obj = objArr[0];
                                } else {
                                    obj = objArr[0];
                                }
                                ((int[]) obj)[0] = i2616;
                                objArr[1] = strArr6;
                                c = 0;
                            }
                        }
                    }
                    int i27110 = ((int[]) objArr[c])[c];
                    int i27111 = (i122 & i134) | ((~i134) & i);
                    int i27112 = -i27111;
                    int i27113 = ((i27111 & i27112) | (i27111 ^ i27112)) >> 31;
                    int i27114 = (~i27113) & i27110;
                    int i27115 = TuitionPaymentFragmentbindingInflater1 + 69;
                    int i27116 = i27115 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i27116;
                    int i27117 = i27115 % 2;
                    int i27118 = i134 & i27113;
                    i4 = (i27118 & i27114) | (i27114 ^ i27118);
                    strArr = (String[]) objArr[1];
                    objArr2 = new Object[2];
                    int i27119 = i27110 ^ i;
                    int i28110 = -i27119;
                    i5 = (((i27119 & i28110) | (i27119 ^ i28110)) >> 31) & 1;
                    i6 = i27116 + 77;
                    TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i28111 = -i5;
                        int i28112 = ((i28111 & i5) | (i5 ^ i28111)) >> 84;
                        int i28113 = (~i28112) & 1;
                        int i28114 = i28112 & 1;
                        objArr2[i5] = null;
                        objArr2[(i28114 & i28113) | (i28113 ^ i28114)] = strArr;
                        strArr2 = (String[]) objArr2[0];
                        objArr3 = new Object[3];
                        c2 = 0;
                        i8 = 0;
                        i7 = 1;
                    } else {
                        int i28115 = -i5;
                        int i28116 = ~(((i28115 & i5) | (i5 ^ i28115)) >> 31);
                        i7 = 1;
                        objArr2[i5] = null;
                        objArr2[i28116 & 1] = strArr;
                        c2 = 0;
                        strArr2 = (String[]) objArr2[0];
                        objArr3 = new Object[4];
                        i8 = 1;
                    }
                    iArr = new int[i8];
                    objArr3[c2] = iArr;
                    iArr2 = new int[i7];
                    objArr3[i7] = iArr2;
                    iArr3 = new int[i7];
                    objArr3[2] = iArr3;
                    int i28117 = i ^ i4;
                    int i28118 = -i28117;
                    int i28119 = (((i28117 & i28118) | (i28117 ^ i28118)) >> 31) & 16;
                    i9 = ((i27116 | 107) << 1) - (i27116 ^ 107);
                    TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                    if (i9 % 2 != 0) {
                        iArr2[0] = i;
                        ((int[]) objArr3[4])[0] = i4;
                        objArr3[5] = strArr2;
                    } else {
                        iArr[0] = i;
                        iArr3[0] = i4;
                        objArr3[3] = strArr2;
                    }
                    int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                    int i29110 = (((~((-924394345) | elapsedCpuTime3)) | 873464064) * (-566)) + 499731412 + ((~(elapsedCpuTime3 | (-50930281))) * 566);
                    int i29111 = -(-i28119);
                    int i29112 = ((i29110 | i29111) << 1) - (i29111 ^ i29110);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault17 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i29113 = i29112 * (-337);
                    int i29114 = -(-(i2 * 339));
                    int i29115 = (i29113 ^ i29114) + ((i29113 & i29114) << 1);
                    int i29116 = ~i29112;
                    int i29117 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault17;
                    int i29118 = ~((i29116 & i29117) | (i29116 ^ i29117));
                    int i29119 = ~i2;
                    int i30110 = ~((i29119 & i29112) | (i29119 ^ i29112));
                    int i30111 = (i29118 & i30110) | (i29118 ^ i30110);
                    int i30112 = ~((i29112 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault17) | (i29112 & iTuitionPaymentFragmentspecialinlinedviewModeldefault17));
                    int i30113 = (i29115 - (~(((i30111 & i30112) | (i30111 ^ i30112)) * (-338)))) - 1;
                    int i30114 = ~i29112;
                    int i30115 = (i30113 - (~(-(-((~(i30114 | i2)) * 338))))) - 1;
                    int i30116 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
                    TuitionPaymentFragmentbindingInflater1 = i30116 % 128;
                    int i30117 = i30116 % 2;
                    int i30118 = (i29112 & i2) | (i29112 ^ i2);
                    int i30119 = i30115 + (338 * ((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault17 & i30118) | (i30118 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault17))) | (~((i30114 ^ i29117) | (i29117 & i30114)))));
                    int i3111 = i30119 << 13;
                    int i3112 = (i3111 | i30119) & (~(i30119 & i3111));
                    int i3113 = i3112 >>> 17;
                    int i3114 = (i3112 | i3113) & (~(i3112 & i3113));
                    ((int[]) objArr3[1])[0] = i3114 ^ (i3114 << 5);
                    return objArr3;
                }
            } catch (Exception unused4) {
            }
            line = null;
            r14 = r15;
            int i3115 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3116 = (i3115 & 23) + (i3115 | 23);
            TuitionPaymentFragmentbindingInflater1 = i3116 % 128;
            int i3117 = i3116 % 2;
            c = 0;
            objArr = new Object[]{new int[]{i}, new String[0]};
            int i271110 = ((int[]) objArr[c])[c];
            int i271111 = (i122 & i134) | ((~i134) & i);
            int i271112 = -i271111;
            int i271113 = ((i271111 & i271112) | (i271111 ^ i271112)) >> 31;
            int i271114 = (~i271113) & i271110;
            int i271115 = TuitionPaymentFragmentbindingInflater1 + 69;
            int i271116 = i271115 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i271116;
            int i271117 = i271115 % 2;
            int i271118 = i134 & i271113;
            i4 = (i271118 & i271114) | (i271114 ^ i271118);
            strArr = (String[]) objArr[1];
            objArr2 = new Object[2];
            int i271119 = i271110 ^ i;
            int i281110 = -i271119;
            i5 = (((i271119 & i281110) | (i271119 ^ i281110)) >> 31) & 1;
            i6 = i271116 + 77;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i281111 = -i5;
                int i281112 = ((i281111 & i5) | (i5 ^ i281111)) >> 84;
                int i281113 = (~i281112) & 1;
                int i281114 = i281112 & 1;
                objArr2[i5] = null;
                objArr2[(i281114 & i281113) | (i281113 ^ i281114)] = strArr;
                strArr2 = (String[]) objArr2[0];
                objArr3 = new Object[3];
                c2 = 0;
                i8 = 0;
                i7 = 1;
            } else {
                int i281115 = -i5;
                int i281116 = ~(((i281115 & i5) | (i5 ^ i281115)) >> 31);
                i7 = 1;
                objArr2[i5] = null;
                objArr2[i281116 & 1] = strArr;
                c2 = 0;
                strArr2 = (String[]) objArr2[0];
                objArr3 = new Object[4];
                i8 = 1;
            }
            iArr = new int[i8];
            objArr3[c2] = iArr;
            iArr2 = new int[i7];
            objArr3[i7] = iArr2;
            iArr3 = new int[i7];
            objArr3[2] = iArr3;
            int i281117 = i ^ i4;
            int i281118 = -i281117;
            int i281119 = (((i281117 & i281118) | (i281117 ^ i281118)) >> 31) & 16;
            i9 = ((i271116 | 107) << 1) - (i271116 ^ 107);
            TuitionPaymentFragmentbindingInflater1 = i9 % 128;
            if (i9 % 2 != 0) {
                iArr2[0] = i;
                ((int[]) objArr3[4])[0] = i4;
                objArr3[5] = strArr2;
            } else {
                iArr[0] = i;
                iArr3[0] = i4;
                objArr3[3] = strArr2;
            }
            int elapsedCpuTime4 = (int) Process.getElapsedCpuTime();
            int i291110 = (((~((-924394345) | elapsedCpuTime4)) | 873464064) * (-566)) + 499731412 + ((~(elapsedCpuTime4 | (-50930281))) * 566);
            int i291111 = -(-i281119);
            int i291112 = ((i291110 | i291111) << 1) - (i291111 ^ i291110);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault18 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i291113 = i291112 * (-337);
            int i291114 = -(-(i2 * 339));
            int i291115 = (i291113 ^ i291114) + ((i291113 & i291114) << 1);
            int i291116 = ~i291112;
            int i291117 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault18;
            int i291118 = ~((i291116 & i291117) | (i291116 ^ i291117));
            int i291119 = ~i2;
            int i301110 = ~((i291119 & i291112) | (i291119 ^ i291112));
            int i301111 = (i291118 & i301110) | (i291118 ^ i301110);
            int i301112 = ~((i291112 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault18) | (i291112 & iTuitionPaymentFragmentspecialinlinedviewModeldefault18));
            int i301113 = (i291115 - (~(((i301111 & i301112) | (i301111 ^ i301112)) * (-338)))) - 1;
            int i301114 = ~i291112;
            int i301115 = (i301113 - (~(-(-((~(i301114 | i2)) * 338))))) - 1;
            int i301116 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
            TuitionPaymentFragmentbindingInflater1 = i301116 % 128;
            int i301117 = i301116 % 2;
            int i301118 = (i291112 & i2) | (i291112 ^ i2);
            int i301119 = i301115 + (338 * ((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault18 & i301118) | (i301118 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault18))) | (~((i301114 ^ i291117) | (i291117 & i301114)))));
            int i3118 = i301119 << 13;
            int i3119 = (i3118 | i301119) & (~(i301119 & i3118));
            int i31110 = i3119 >>> 17;
            int i31111 = (i3119 | i31110) & (~(i3119 & i31110));
            ((int[]) objArr3[1])[0] = i31111 ^ (i31111 << 5);
            return objArr3;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -83722298;
    }

    private static String $$e(byte b2, int i, short s) {
        byte[] bArr = $$c;
        int i2 = i + 4;
        int i3 = s * 4;
        int i4 = b2 + 119;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i4 += i2;
            i2 = i2;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i2 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i4 += bArr[i8];
            i2 = i8;
            i6 = i7;
        }
    }
}
