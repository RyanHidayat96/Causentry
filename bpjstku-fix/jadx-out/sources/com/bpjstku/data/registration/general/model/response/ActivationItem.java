package com.bpjstku.data.registration.general.model.response;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJL\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u000bR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u000bR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/registration/general/model/response/ActivationItem;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/registration/general/model/response/ActivationItem;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "checkSum", "Ljava/lang/String;", "getCheckSum", "signature", "getSignature", "eligibleResetAcc", "getEligibleResetAcc", "eligibleRegistration", "getEligibleRegistration", "resetAccCheckSum", "getResetAccCheckSum"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ActivationItem extends BaseItem {
    public static final int $stable = 0;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asBinder;

    @SerializedName("checkSum")
    private final String checkSum;

    @SerializedName("eligibleRegistration")
    private final String eligibleRegistration;

    @SerializedName("eligibleResetAcc")
    private final String eligibleResetAcc;

    @SerializedName("resetAccCheckSum")
    private final String resetAccCheckSum;

    @SerializedName("signature")
    private final String signature;
    private static final byte[] $$c = {92, 126, -38, -95};
    private static final int $$f = 163;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {65, -122, -65, 2, 14, 0, -61, 59, 10, 2, -6, 7, -5, -53, 53, 15, -8, 16, -1, -4, -3, -52, 65, -10, 21, -13, 15, -7, -6, 13, -60, Base64.padSymbol, 7, 8, -13, 15, -2, -11, 13, -60, 38, 21, 19, -15, 15, 3, -16, 3, 12, -5, -34, 47, -3, 6, -10, 21, -13, 1, -12, 13, 13, 11, -14, -26, 39, 8, -13, 15, 0, 1, -1, -9, 21, -3, 5, 35, -10, 13, -9, 8, 1, -28, 19, 26, -10, -6, 11, 8, -44, 46, -15, 8, 8, -6, 11, 8, 1, -1, -9, 0, 8, -6, 13, -1, 7, 0, -1, 7, -7, 1, 20, -11, -2, 20, -40, 36, -9, 3, 9, -6, 3, 3, -3, 22, -7, 10, -65};
    private static final int $$e = 100;
    private static final byte[] $$a = {5, 11, -122, -94, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 126;
    private static int g = 0;
    private static int asInterface = 1;
    private static int b = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.data.registration.general.model.response.ActivationItem.$$a
            int r8 = r8 * 15
            int r1 = r8 + 38
            int r7 = r7 * 4
            int r7 = r7 + 84
            int r6 = r6 * 52
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r8 = r8 + 37
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
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.general.model.response.ActivationItem.a(byte, int, short, java.lang.Object[]):void");
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
    private static void d(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.data.registration.general.model.response.ActivationItem.$$d
            int r8 = r8 * 19
            int r8 = r8 + 53
            int r6 = r6 * 15
            int r6 = r6 + 84
            int r7 = r7 * 71
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r7]
        L28:
            int r6 = r6 + r3
            int r6 = r6 + (-2)
            int r7 = r7 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.general.model.response.ActivationItem.d(byte, byte, int, java.lang.Object[]):void");
    }

    public final String getCheckSum() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 93;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.checkSum;
        int i5 = i2 + 61;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSignature() {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.signature;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getEligibleResetAcc() {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        String str = this.eligibleResetAcc;
        int i5 = i3 + 103;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getEligibleRegistration() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 115;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.eligibleRegistration;
        int i4 = i2 + 55;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getResetAccCheckSum() {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.resetAccCheckSum;
        }
        throw null;
    }

    public ActivationItem(String str, String str2, String str3, String str4, String str5) {
        this.checkSum = str;
        this.signature = str2;
        this.eligibleResetAcc = str3;
        this.eligibleRegistration = str4;
        this.resetAccCheckSum = str5;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i4 = $10 + 31;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                i2 = 1;
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                i2 = 0;
            }
            int i5 = $11 + 51;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 58224;
            while (i2 < 16) {
                int i8 = $11 + 21;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[c];
                int i10 = (c3 + i7) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[c] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "") + 47773);
                        int i12 = 469 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int i13 = 14 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[c] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i12, i13, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i14 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr3[c]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 468, 13 - (ViewConfiguration.getTouchSlop() >> 8), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i7 = i14 - 40503;
                    i2++;
                    c = 0;
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
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.resolveSize(0, 0), 2323 - View.resolveSize(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 44, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    public final int hashCode() throws Throwable {
        int iHashCode;
        Object[] objArr;
        int i = 2 % 2;
        String str = this.checkSum;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.signature;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.eligibleResetAcc;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.eligibleRegistration;
        if (str4 == null) {
            int i2 = asInterface + 41;
            g = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str4.hashCode();
        }
        String str5 = this.resetAccCheckSum;
        int iHashCode5 = str5 != null ? str5.hashCode() : 0;
        int i4 = (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyTid = (char) (43042 - (Process.myTid() >> 22));
            int minimumFlingVelocity = 3111 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iIndexOf = 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, b2, bArr[132], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, minimumFlingVelocity, iIndexOf, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{61501, 36802, 52943, 43225, 7704, 21718, 15181, 62984, 54576, 22522, 13690, 9993, 46671, 52382, 10828, 64786, 7535, 22319, 27557, 26849, 24910, 43409, 22995, 46481}, 22 - Color.alpha(0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{20978, 32454, 43912, 13973, 54382, 61959, 20218, 47804, 7076, 23913, 19659, 5429, 56877, 37407, 26919, 61596, 14884, 55021}, 15 - Color.argb(0, 0, 0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 43042);
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 3111;
            int iArgb = Color.argb(0, 0, 0, 0) + 22;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[132];
            Object[] objArr5 = new Object[1];
            a(b3, bArr2[7], b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop, capsMode, iArgb, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 43042);
                int iIndexOf2 = 3111 - TextUtils.indexOf("", "", 0);
                int iIndexOf3 = 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                byte[] bArr3 = $$a;
                byte b4 = bArr3[37];
                byte b5 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType, iIndexOf2, iIndexOf3, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i6};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i7 = ~startElapsedRealtime;
            int i8 = 262911271 + (((~((-671225638) | i7)) | (~((-84707345) | startElapsedRealtime)) | (~((-277872841) | startElapsedRealtime))) * 765) + (((~((-755932982) | i7)) | 671225637) * 1530) + (((~(startElapsedRealtime | (-755932982))) | (~(i7 | (-277872841)))) * 765) + 1530257325;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
            objArr = new Object[]{new int[1], iArr, new int[]{i5}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{26332, 54715, 49406, 10247, 25421, 65197, 59308, 8694, 62649, 9365, 3839, 37175, 27417, 46490, 24062, 39629, 31009, 53110}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 15, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{26520, 10760, 40859, 15848, 28885, 38210, 10713, 60650, 60538, 53096, 50119, 23685, 59719, 20983, 42413, 38534, 36291, 26787}, TextUtils.indexOf("", "", 0, 0) + 16, objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 1530257325};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[57];
                Object[] objArr11 = new Object[1];
                d(b6, bArr4[5], b6, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = bArr4[5];
                Object[] objArr12 = new Object[1];
                d(b7, bArr4[57], b7, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (43041 - TextUtils.indexOf((CharSequence) "", '0', 0));
                    int deadChar = 3111 - KeyEvent.getDeadChar(0, 0);
                    int i11 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
                    byte[] bArr5 = $$a;
                    byte b8 = bArr5[37];
                    byte b9 = bArr5[7];
                    Object[] objArr13 = new Object[1];
                    a(b8, b9, b9, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, deadChar, i11, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(new char[]{61501, 36802, 52943, 43225, 7704, 21718, 15181, 62984, 54576, 22522, 13690, 9993, 46671, 52382, 10828, 64786, 7535, 22319, 27557, 26849, 24910, 43409, 22995, 46481}, 21 - Process.getGidForName(""), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(new char[]{20978, 32454, 43912, 13973, 54382, 61959, 20218, 47804, 7076, 23913, 19659, 5429, 56877, 37407, 26919, 61596, 14884, 55021}, Process.getGidForName("") + 16, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf2 = (char) (43042 - TextUtils.indexOf("", ""));
                        int edgeSlop2 = 3111 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 23;
                        byte[] bArr6 = $$a;
                        byte b10 = bArr6[132];
                        Object[] objArr16 = new Object[1];
                        a(b10, bArr6[7], b10, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, edgeSlop2, iLastIndexOf, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43042);
                        int trimmedLength = TextUtils.getTrimmedLength("") + 3111;
                        int maxKeyCode = 22 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte[] bArr7 = $$a;
                        byte b11 = bArr7[7];
                        Object[] objArr17 = new Object[1];
                        a(b11, b11, bArr7[132], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, trimmedLength, maxKeyCode, -1272852037, false, (String) objArr17[0], null);
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 == i12) {
            int i14 = ((int[]) objArr[0])[0];
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr2 = {i15};
            int i17 = ~(Process.myPid() | 1500653987);
            int i18 = i14 + ((1364205696 | i17) * (-196)) + 1827314262 + ((i17 | 136448291) * 196);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr[0])[0] = i20 ^ (i20 << 5);
            Object[] objArr18 = {new int[1], new int[]{i16}, iArr2, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i21 = g + 37;
                asInterface = i21 % 128;
                int i22 = 2;
                int i23 = i21 % 2;
                int i24 = 0;
                while (i24 < strArr3.length) {
                    int i25 = asInterface + 77;
                    g = i25 % 128;
                    if (i25 % i22 != 0) {
                        arrayList.add(strArr3[i24]);
                        i24 += 85;
                    } else {
                        arrayList.add(strArr3[i24]);
                        i24++;
                    }
                    i22 = 2;
                }
            }
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            int i26 = ((int[]) objArr[0])[0];
            int i27 = ((int[]) objArr[2])[0];
            int i28 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr3 = {i27};
            int i29 = ~Process.myPid();
            int i30 = i26 + 892846402 + (((~(i29 | 554953765)) | (-1704980222)) * (-160)) + (((~(i29 | (-1150077694))) | 554953765) * 160);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr[0])[0] = i32 ^ (i32 << 5);
            Object[] objArr19 = {new int[1], new int[]{i28}, iArr3, strArr4};
        }
        return (i4 * 31) + iHashCode5;
    }

    static {
        asBinder = 1;
        b();
        int i = b + 107;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ ActivationItem copy$default(ActivationItem activationItem, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = activationItem.checkSum;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str2 = activationItem.signature;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = activationItem.eligibleResetAcc;
            int i3 = g + 9;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = activationItem.eligibleRegistration;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = activationItem.resetAccCheckSum;
            int i5 = asInterface + 31;
            g = i5 % 128;
            int i6 = i5 % 2;
        }
        return activationItem.copy(str6, str7, str8, str9, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 35;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.checkSum;
        int i5 = i2 + 85;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.signature;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = g + 69;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.eligibleResetAcc;
        int i5 = i3 + 89;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = g + 23;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.eligibleRegistration;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 7;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.resetAccCheckSum;
        int i5 = i2 + 35;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ActivationItem copy(String p0, String p1, String p2, String p3, String p4) {
        int i = 2 % 2;
        ActivationItem activationItem = new ActivationItem(p0, p1, p2, p3, p4);
        int i2 = g + 13;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return activationItem;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = asInterface + 53;
            g = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(p0 instanceof ActivationItem)) {
            int i4 = asInterface + 3;
            g = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        ActivationItem activationItem = (ActivationItem) p0;
        if (!Intrinsics.areEqual(this.checkSum, activationItem.checkSum)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.signature, activationItem.signature)) {
            int i6 = asInterface + 109;
            g = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.eligibleResetAcc, activationItem.eligibleResetAcc)) {
            int i7 = asInterface + 71;
            g = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.eligibleRegistration, activationItem.eligibleRegistration)) {
            return false;
        }
        if (Intrinsics.areEqual(this.resetAccCheckSum, activationItem.resetAccCheckSum)) {
            return true;
        }
        int i9 = asInterface + 67;
        g = i9 % 128;
        return i9 % 2 != 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.checkSum;
        String str2 = this.signature;
        String str3 = this.eligibleResetAcc;
        String str4 = this.eligibleRegistration;
        String str5 = this.resetAccCheckSum;
        StringBuilder sb = new StringBuilder("ActivationItem(checkSum=");
        sb.append(str);
        sb.append(", signature=");
        sb.append(str2);
        sb.append(", eligibleResetAcc=");
        sb.append(str3);
        sb.append(", eligibleRegistration=");
        sb.append(str4);
        sb.append(", resetAccCheckSum=");
        sb.append(str5);
        sb.append(")");
        String string = sb.toString();
        int i2 = asInterface + 11;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 38 / 0;
        }
        return string;
    }

    static void b() {
        TuitionPaymentFragmentbindingInflater1 = (char) 27573;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 32140;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 34919;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 19446;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, short r8, short r9) {
        /*
            int r9 = r9 * 4
            int r9 = 1 - r9
            byte[] r0 = com.bpjstku.data.registration.general.model.response.ActivationItem.$$c
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r8 = r8 * 4
            int r8 = r8 + 108
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2c
        L17:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            int r8 = r8 + 1
            r3 = r0[r8]
        L2c:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.general.model.response.ActivationItem.$$g(short, short, short):java.lang.String");
    }
}
