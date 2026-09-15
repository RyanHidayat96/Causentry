package com.bpjstku.data.jht.model.response;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0012J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0012J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0012J \u0001\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020 2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b&\u0010\u0012R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0012R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u0012R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u0012R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010\u0012R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b1\u0010\u0012R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u0010\u0012R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010(\u001a\u0004\b5\u0010\u0012R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u0010\u0012R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b9\u0010\u0012R\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010(\u001a\u0004\b;\u0010\u0012R\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010(\u001a\u0004\b=\u0010\u0012R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010(\u001a\u0004\b?\u0010\u0012"}, d2 = {"Lcom/bpjstku/data/jht/model/response/JhtContributionDetailItem;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jht/model/response/JhtContributionDetailItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "workerCode", "Ljava/lang/String;", "getWorkerCode", "companyCode", "getCompanyCode", "divisionCode", "getDivisionCode", "membershipCode", "getMembershipCode", "contributionCode", "getContributionCode", "segmenCode", "getSegmenCode", "blth", "getBlth", "paymentDate", "getPaymentDate", "jhtContribution", "getJhtContribution", "salary", "getSalary", "rapel", "getRapel", "sort", "getSort"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JhtContributionDetailItem {
    public static final int $stable = 0;
    private static long TuitionPaymentFragmentbindingInflater1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;

    @SerializedName("blth")
    private final String blth;

    @SerializedName("companyCode")
    private final String companyCode;

    @SerializedName("contributionCode")
    private final String contributionCode;

    @SerializedName("divisionCode")
    private final String divisionCode;

    @SerializedName("jhtContribution")
    private final String jhtContribution;

    @SerializedName("membershipCode")
    private final String membershipCode;

    @SerializedName("paymentDate")
    private final String paymentDate;

    @SerializedName("rapel")
    private final String rapel;

    @SerializedName("salary")
    private final String salary;

    @SerializedName("segmenCode")
    private final String segmenCode;

    @SerializedName("sort")
    private final String sort;

    @SerializedName("workerCode")
    private final String workerCode;
    private static final byte[] $$c = {39, -79, 42};
    private static final int $$f = 190;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {94, 6, -99, -107, 7, 8, -5, 0, 8, -61, 72, -11, 15, 7, -13, 12, -8, 5, 17, -66, 40, 21, 15, 7, -13, 12, -8, 5, 17, -37, 44, -18, 3, 3, -9, 21, 15, 7, -13, 12, -8, 5, 17, -37, 44, -77, 76, -1, 8, 10, 1, -76, 16, -10, 3, 36, 54, -1, -12, 16, -1, -10, 14, -22, 41, -8, 9, -9, 0, 18, -8, -3, -20, 24, 15, -8, 5, 0, -46, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, 2, 0, -8, 1, 9, -5, 14, 0, 8, 1, 0, 8, -6, 2, 21, -10, -1, 21, -39, 37, -8, 4, 10, -5, 4, 4, -2, 23, -6, 11, -62};
    private static final int $$e = 81;
    private static final byte[] $$a = {32, 1, 70, -122, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 12;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f390a = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = 55 - r6
            int r7 = 53 - r7
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r0 = com.bpjstku.data.jht.model.response.JhtContributionDetailItem.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L29
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
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
            int r8 = r8 + (-10)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.model.response.JhtContributionDetailItem.c(byte, short, byte, java.lang.Object[]):void");
    }

    private static void e(int i, int i2, int i3, Object[] objArr) {
        byte[] bArr = $$d;
        int i4 = i2 * 23;
        int i5 = (i * 75) + 4;
        int i6 = 107 - (i3 * 23);
        byte[] bArr2 = new byte[i4 + 53];
        int i7 = i4 + 52;
        int i8 = -1;
        if (bArr == null) {
            i8 = -1;
            i6 = (i6 + i5) - 3;
            i5++;
        }
        while (true) {
            int i9 = i8 + 1;
            bArr2[i9] = (byte) i6;
            if (i9 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i10 = i6;
            int i11 = i5 + 1;
            i8 = i9;
            i6 = (i10 + bArr[i5]) - 3;
            i5 = i11;
        }
    }

    public JhtContributionDetailItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.workerCode = str;
        this.companyCode = str2;
        this.divisionCode = str3;
        this.membershipCode = str4;
        this.contributionCode = str5;
        this.segmenCode = str6;
        this.blth = str7;
        this.paymentDate = str8;
        this.jhtContribution = str9;
        this.salary = str10;
        this.rapel = str11;
        this.sort = str12;
    }

    public final String getWorkerCode() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 49;
        f390a = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.workerCode;
            int i4 = 24 / 0;
        } else {
            str = this.workerCode;
        }
        int i5 = i2 + 35;
        f390a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCompanyCode() {
        int i = 2 % 2;
        int i2 = f390a;
        int i3 = i2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.companyCode;
        int i5 = i2 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDivisionCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 49;
        f390a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.divisionCode;
        int i4 = i2 + 55;
        f390a = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getMembershipCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 51;
        f390a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.membershipCode;
        int i5 = i2 + 33;
        f390a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getContributionCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 99;
        f390a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.contributionCode;
        int i5 = i2 + 23;
        f390a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0221  */
    /* JADX WARN: Code duplicated, block: B:45:0x0222  */
    private static void d(int i, int i2, char c, Object[] objArr) throws Throwable {
        float f;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            f = 0.0f;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i4 = $10 + 107;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0')), ((byte) KeyEvent.getModifierMetaStateMask()) + 2188, (ViewConfiguration.getPressedStateDuration() >> 16) + 40, 841711447, false, $$g(b2, b3, (byte) (b3 - 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (Process.myTid() >> 22) + 3011, 26 - (ViewConfiguration.getEdgeSlop() >> 16), 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (-b6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 36505), 3376 - TextUtils.getTrimmedLength(""), TextUtils.lastIndexOf("", '0') + 18, -968507904, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $11 + 9;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (-b8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), Color.rgb(0, 0, 0) + 16780592, (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 17, -968507904, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                int i8 = 87 / 0;
            } else {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) (-1);
                    byte b11 = (byte) (-b10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (Color.rgb(0, 0, 0) + 16813721), 3376 - View.getDefaultSize(0, 0), (Process.myTid() >> 22) + 17, -968507904, false, $$g(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            f = 0.0f;
        }
        objArr[0] = new String(cArr);
        int i9 = $11 + 15;
        $10 = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0220  */
    public final String getSegmenCode() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31533);
            int iArgb = 921 - Color.argb(0, 0, 0, 0);
            int i2 = 28 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte b2 = $$a[1];
            Object[] objArr2 = new Object[1];
            c(b2, (byte) 52, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iArgb, i2, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(ExpandableListView.getPackedPositionGroup(0L), 22 - TextUtils.indexOf("", "", 0, 0), (char) (ImageFormat.getBitsPerPixel(0) + 1), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d((Process.myTid() >> 22) + 22, Color.argb(0, 0, 0, 0) + 15, (char) (5767 - TextUtils.getCapsMode("", 0, 0)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31532);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 922;
            int iBlue = 28 - Color.blue(0);
            byte[] bArr = $$a;
            byte b3 = bArr[1];
            byte b4 = bArr[80];
            Object[] objArr5 = new Object[1];
            c(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iIndexOf, iBlue, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char gidForName = (char) (31532 - Process.getGidForName(""));
                int i3 = 922 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int i4 = 29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                byte[] bArr2 = $$a;
                byte b5 = bArr2[80];
                Object[] objArr6 = new Object[1];
                c(b5, bArr2[33], b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(gidForName, i3, i4, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            int i6 = 25598825 + (((~((-913840965) | i5)) | (~((-860238680) | iIdentityHashCode))) * 1900) + (((~(i5 | 860238679)) | (~(iIdentityHashCode | 913840964))) * (-950)) + (((~(iIdentityHashCode | 860238679)) | (~(i5 | 913840964))) * 950) + 1060823444;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            d(ExpandableListView.getPackedPositionChild(0L) + 38, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(View.resolveSizeAndState(0, 0, 0) + 63, 18 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
                    f390a = i9 % 128;
                    int i10 = i9 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            d(81 - TextUtils.indexOf("", "", 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 15, (char) (33771 - TextUtils.indexOf("", "", 0, 0)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(97 - View.resolveSize(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 16, (char) (51800 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
            f390a = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1060823444};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[7];
                Object[] objArr13 = new Object[1];
                e(b6, bArr3[50], b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr3[50];
                Object[] objArr14 = new Object[1];
                e(b7, bArr3[7], b7, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char edgeSlop = (char) (31533 - (ViewConfiguration.getEdgeSlop() >> 16));
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 921;
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 28;
                    byte[] bArr4 = $$a;
                    byte b8 = bArr4[80];
                    Object[] objArr16 = new Object[1];
                    c(b8, bArr4[33], b8, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(edgeSlop, maximumFlingVelocity, longPressTimeout, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    d(ViewConfiguration.getMinimumFlingVelocity() >> 16, 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    d((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15, (char) (5767 - (Process.myTid() >> 22)), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char pressedStateDuration = (char) (31533 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        int iIndexOf2 = 920 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        int absoluteGravity = 28 - Gravity.getAbsoluteGravity(0, 0);
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[1];
                        byte b10 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        c(b9, b10, b10, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(pressedStateDuration, iIndexOf2, absoluteGravity, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c3 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31533);
                        int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 921;
                        int scrollBarFadeDuration = 28 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte b11 = $$a[1];
                        Object[] objArr20 = new Object[1];
                        c(b11, (byte) 52, b11, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, edgeSlop2, scrollBarFadeDuration, -1048449946, false, (String) objArr20[0], null);
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    int i15 = f390a + 87;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                    int i16 = i15 % 2;
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        int i17 = f390a + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
        int i18 = i17 % 2;
        int i19 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i20 = (-329126631) + ((iUptimeMillis | 608309721) * (-50));
        int i21 = ~((-71307457) | iUptimeMillis);
        int i22 = ~iUptimeMillis;
        int i23 = i19 + i20 + ((i21 | (~((-1094462467) | i22))) * 50) + (((~(i22 | 608309721)) | (~((-1165769923) | i22)) | 1094462466) * 50);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr21[0])[0] = i25 ^ (i25 << 5);
        return this.segmenCode;
    }

    public final String getBlth() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        int i3 = i2 % 128;
        f390a = i3;
        int i4 = i2 % 2;
        String str = this.blth;
        int i5 = i3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPaymentDate() {
        int i = 2 % 2;
        int i2 = f390a + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.paymentDate;
        }
        throw null;
    }

    public final String getJhtContribution() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        int i3 = i2 % 128;
        f390a = i3;
        int i4 = i2 % 2;
        String str = this.jhtContribution;
        int i5 = i3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSalary() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        int i3 = i2 % 128;
        f390a = i3;
        int i4 = i2 % 2;
        String str = this.salary;
        int i5 = i3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getRapel() {
        int i = 2 % 2;
        int i2 = f390a + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.rapel;
        }
        throw null;
    }

    public final String getSort() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 123;
        f390a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sort;
        int i5 = i2 + 33;
        f390a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        b = 1;
        b();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        b = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ JhtContributionDetailItem copy$default(JhtContributionDetailItem jhtContributionDetailItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
        String str13;
        String str14;
        String str15;
        int i2 = 2 % 2;
        String str16 = (i & 1) != 0 ? jhtContributionDetailItem.workerCode : str;
        String str17 = (i & 2) != 0 ? jhtContributionDetailItem.companyCode : str2;
        String str18 = (i & 4) != 0 ? jhtContributionDetailItem.divisionCode : str3;
        if ((i & 8) != 0) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
            f390a = i3 % 128;
            int i4 = i3 % 2;
            str13 = jhtContributionDetailItem.membershipCode;
        } else {
            str13 = str4;
        }
        String str19 = (i & 16) != 0 ? jhtContributionDetailItem.contributionCode : str5;
        String str20 = (i & 32) != 0 ? jhtContributionDetailItem.segmenCode : str6;
        if ((i & 64) != 0) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
            f390a = i5 % 128;
            int i6 = i5 % 2;
            str14 = jhtContributionDetailItem.blth;
        } else {
            str14 = str7;
        }
        String str21 = (i & 128) != 0 ? jhtContributionDetailItem.paymentDate : str8;
        String str22 = (i & 256) != 0 ? jhtContributionDetailItem.jhtContribution : str9;
        String str23 = (i & 512) != 0 ? jhtContributionDetailItem.salary : str10;
        String str24 = (i & 1024) != 0 ? jhtContributionDetailItem.rapel : str11;
        if ((i & 2048) != 0) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
            f390a = i7 % 128;
            int i8 = i7 % 2;
            str15 = jhtContributionDetailItem.sort;
        } else {
            str15 = str12;
        }
        return jhtContributionDetailItem.copy(str16, str17, str18, str13, str19, str20, str14, str21, str22, str23, str24, str15);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 29;
        f390a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.workerCode;
        int i5 = i2 + 123;
        f390a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = f390a + 81;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.salary;
        int i5 = i3 + 67;
        f390a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = f390a;
        int i3 = i2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.rapel;
        int i5 = i2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        int i3 = i2 % 128;
        f390a = i3;
        int i4 = i2 % 2;
        String str = this.sort;
        int i5 = i3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = f390a + 45;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.companyCode;
        int i4 = i3 + 19;
        f390a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return str;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
        int i3 = i2 % 128;
        f390a = i3;
        if (i2 % 2 == 0) {
            str = this.divisionCode;
            int i4 = 86 / 0;
        } else {
            str = this.divisionCode;
        }
        int i5 = i3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = f390a + 111;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.membershipCode;
        int i4 = i3 + 113;
        f390a = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = f390a + 79;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.contributionCode;
        int i5 = i3 + 125;
        f390a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 59;
        f390a = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.segmenCode;
        int i4 = i2 + 73;
        f390a = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
        int i3 = i2 % 128;
        f390a = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.blth;
        int i4 = i3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = f390a + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.paymentDate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = f390a + 53;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.jhtContribution;
        int i5 = i3 + 95;
        f390a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final JhtContributionDetailItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11) {
        int i = 2 % 2;
        JhtContributionDetailItem jhtContributionDetailItem = new JhtContributionDetailItem(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
        int i2 = f390a + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return jhtContributionDetailItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = f390a + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof JhtContributionDetailItem)) {
            return false;
        }
        JhtContributionDetailItem jhtContributionDetailItem = (JhtContributionDetailItem) p0;
        if (!Intrinsics.areEqual(this.workerCode, jhtContributionDetailItem.workerCode) || !Intrinsics.areEqual(this.companyCode, jhtContributionDetailItem.companyCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.divisionCode, jhtContributionDetailItem.divisionCode)) {
            int i3 = f390a + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.membershipCode, jhtContributionDetailItem.membershipCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.contributionCode, jhtContributionDetailItem.contributionCode)) {
            int i5 = f390a + 53;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.segmenCode, jhtContributionDetailItem.segmenCode)) {
            int i7 = f390a + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            return i7 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.blth, jhtContributionDetailItem.blth)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.paymentDate, jhtContributionDetailItem.paymentDate)) {
            int i8 = f390a + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.jhtContribution, jhtContributionDetailItem.jhtContribution)) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
            f390a = i10 % 128;
            return i10 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.salary, jhtContributionDetailItem.salary) || !Intrinsics.areEqual(this.rapel, jhtContributionDetailItem.rapel)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.sort, jhtContributionDetailItem.sort))) {
            return true;
        }
        int i11 = f390a + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        String str = this.workerCode;
        int iHashCode5 = 1;
        if (str == null) {
            int i2 = f390a + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.companyCode;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.divisionCode;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.membershipCode;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.contributionCode;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.segmenCode;
        if (str6 == null) {
            int i3 = f390a + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            iHashCode2 = i3 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = str6.hashCode();
        }
        String str7 = this.blth;
        if (str7 == null) {
            int i4 = f390a + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            iHashCode3 = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode3 = str7.hashCode();
            int i5 = f390a + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
        }
        String str8 = this.paymentDate;
        if (str8 == null) {
            int i7 = f390a + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            if (i7 % 2 == 0) {
                iHashCode5 = 0;
            }
        } else {
            iHashCode5 = str8.hashCode();
        }
        String str9 = this.jhtContribution;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.salary;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.rapel;
        if (str11 == null) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
            f390a = i8 % 128;
            int i9 = i8 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str11.hashCode();
        }
        String str12 = this.sort;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode4) * 31) + (str12 != null ? str12.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.workerCode;
        String str2 = this.companyCode;
        String str3 = this.divisionCode;
        String str4 = this.membershipCode;
        String str5 = this.contributionCode;
        String str6 = this.segmenCode;
        String str7 = this.blth;
        String str8 = this.paymentDate;
        String str9 = this.jhtContribution;
        String str10 = this.salary;
        String str11 = this.rapel;
        String str12 = this.sort;
        StringBuilder sb = new StringBuilder("JhtContributionDetailItem(workerCode=");
        sb.append(str);
        sb.append(", companyCode=");
        sb.append(str2);
        sb.append(", divisionCode=");
        sb.append(str3);
        sb.append(", membershipCode=");
        sb.append(str4);
        sb.append(", contributionCode=");
        sb.append(str5);
        sb.append(", segmenCode=");
        sb.append(str6);
        sb.append(", blth=");
        sb.append(str7);
        sb.append(", paymentDate=");
        sb.append(str8);
        sb.append(", jhtContribution=");
        sb.append(str9);
        sb.append(", salary=");
        sb.append(str10);
        sb.append(", rapel=");
        sb.append(str11);
        sb.append(", sort=");
        sb.append(str12);
        sb.append(")");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        f390a = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{45565, 17503, 23202, 20713, 26439, 32148, 29686, 1545, 7323, 4858, 10608, 16288, 13817, 51238, 56990, 54490, 60193, 57762, 63450, 35364, 32891, 38598, 42878, 21210, 19488, 18028, 29148, 27423, 25969, 4338, 2582, 1135, 16309, 10496, 9070, 57023, 51208, 45565, 17503, 23202, 20713, 26439, 32148, 29686, 1545, 7317, 4857, 10542, 16349, 13761, 51254, 56990, 54486, 60218, 57736, 63426, 35378, 32844, 38597, 44336, 41842, 47557, 19485, 45567, 17476, 23220, 20713, 26445, 32147, 29670, 1638, 7300, 4857, 10546, 16282, 13795, 51252, 56990, 54486, 60195, 57743, 12829, 51131, 55643, 54033, 58605, 65146, 61464, 34210, 40824, 37196, 43750, 48225, 46616, 19402, 23908, 22329, 31650, 36354, 37108, 39586, 44299, 47043, 47537, 52233, 55019, 55487, 58234, 62924, 65428, 621, 5337, 7821};
        TuitionPaymentFragmentbindingInflater1 = 7001281992524842033L;
    }

    private static String $$g(short s, short s2, int i) {
        int i2 = 115 - (s2 * 3);
        int i3 = s + 3;
        int i4 = i * 4;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i2 = (-i3) + i5;
            i3 = i3;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            int i8 = i3 + 1;
            i6 = i7;
            i2 = (-bArr[i8]) + i2;
            i3 = i8;
        }
    }
}
