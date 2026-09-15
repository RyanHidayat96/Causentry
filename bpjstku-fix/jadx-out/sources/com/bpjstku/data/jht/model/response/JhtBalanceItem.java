package com.bpjstku.data.jht.model.response;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0013J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0013J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0013J¬\u0001\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\"2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b(\u0010\u0013R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0013R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\u0013R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010\u0013R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010\u0013R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010\u0013R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010\u0013R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010*\u001a\u0004\b7\u0010\u0013R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010*\u001a\u0004\b9\u0010\u0013R\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010*\u001a\u0004\b;\u0010\u0013R\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010*\u001a\u0004\b=\u0010\u0013R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010*\u001a\u0004\b?\u0010\u0013R\u001c\u0010@\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010*\u001a\u0004\bA\u0010\u0013R\u001c\u0010B\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010*\u001a\u0004\bC\u0010\u0013"}, d2 = {"Lcom/bpjstku/data/jht/model/response/JhtBalanceItem;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jht/model/response/JhtBalanceItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "companyCode", "Ljava/lang/String;", "getCompanyCode", "segmentCode", "getSegmentCode", "tkCode", "getTkCode", "kpj", "getKpj", "companyName", "getCompanyName", "balance", "getBalance", "npp", "getNpp", "totalWorker", "getTotalWorker", "subscribedProgram", "getSubscribedProgram", "lastTuitionMonth", "getLastTuitionMonth", "lastTuitionDate", "getLastTuitionDate", "membershipStatus", "getMembershipStatus", "divitionCode", "getDivitionCode"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JhtBalanceItem {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static long b;

    @SerializedName("nomSaldo")
    private final String balance;

    @SerializedName("kodePerusahaan")
    private final String companyCode;

    @SerializedName("namaPerusahaan")
    private final String companyName;

    @SerializedName("kodeDivisi")
    private final String divitionCode;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("tanggalIuranTerakhir")
    private final String lastTuitionDate;

    @SerializedName("bulanIuranTerakhir")
    private final String lastTuitionMonth;

    @SerializedName("statusKepesertaan")
    private final String membershipStatus;

    @SerializedName("npp")
    private final String npp;

    @SerializedName("kodeSegmen")
    private final String segmentCode;

    @SerializedName("program")
    private final String subscribedProgram;

    @SerializedName("kodeTk")
    private final String tkCode;

    @SerializedName("jumlahTk")
    private final String totalWorker;
    private static final byte[] $$c = {46, 47, -18, 64};
    private static final int $$f = 153;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {12, -88, 33, 118, -2, 3, -16, -14, 1, 21, -53, -6, -7, 33, -39, -21, -1, -22, 8, 52, -57, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, 9, -16, -14, 1, -14, -14, -2, 21, -46, -1, -15, 2, -28, 6, -22, 56, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, -8, -6, 2, -7, -15, -1, -20, -6, -14, -7, -6, -14, 0, -8, -27, 4, -5, -27, 33, -43, 2, -10, -16, -1, -10, -10, -4, -29, 0, -17, 57};
    private static final int $$e = 71;
    private static final byte[] $$a = {27, 65, -33, 120, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 103;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 103 - r6
            int r7 = r7 * 52
            int r0 = 53 - r7
            byte[] r1 = com.bpjstku.data.jht.model.response.JhtBalanceItem.$$a
            int r8 = r8 * 52
            int r8 = 56 - r8
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.model.response.JhtBalanceItem.a(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 53
            int r7 = r7 * 54
            int r7 = 57 - r7
            int r5 = r5 * 33
            int r5 = r5 + 84
            byte[] r0 = com.bpjstku.data.jht.model.response.JhtBalanceItem.$$d
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L28:
            r4 = r0[r7]
        L2a:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-9)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.model.response.JhtBalanceItem.d(short, int, short, java.lang.Object[]):void");
    }

    public JhtBalanceItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.companyCode = str;
        this.segmentCode = str2;
        this.tkCode = str3;
        this.kpj = str4;
        this.companyName = str5;
        this.balance = str6;
        this.npp = str7;
        this.totalWorker = str8;
        this.subscribedProgram = str9;
        this.lastTuitionMonth = str10;
        this.lastTuitionDate = str11;
        this.membershipStatus = str12;
        this.divitionCode = str13;
    }

    public final String getCompanyCode() {
        int i = 2 % 2;
        int i2 = g + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.companyCode;
        }
        throw null;
    }

    public final String getSegmentCode() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.segmentCode;
        int i5 = i2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTkCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        String str = this.tkCode;
        int i5 = i3 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getKpj() {
        int i = 2 % 2;
        int i2 = g + 91;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.kpj;
        int i5 = i3 + 17;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getCompanyName() {
        String str;
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.companyName;
            int i4 = 92 / 0;
        } else {
            str = this.companyName;
        }
        int i5 = i2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getBalance() {
        int i = 2 % 2;
        int i2 = g + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.balance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getNpp() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 27;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.npp;
            int i4 = 92 / 0;
        } else {
            str = this.npp;
        }
        int i5 = i2 + 67;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTotalWorker() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.totalWorker;
        int i5 = i2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getSubscribedProgram() {
        int i = 2 % 2;
        int i2 = g + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.subscribedProgram;
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return str;
    }

    public final String getLastTuitionMonth() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 77;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.lastTuitionMonth;
        int i5 = i2 + 95;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLastTuitionDate() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 75;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.lastTuitionDate;
        int i4 = i2 + 85;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return str;
    }

    public final String getMembershipStatus() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 23;
        g = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.membershipStatus;
        int i4 = i2 + 99;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getDivitionCode() {
        int i = 2 % 2;
        int i2 = g + 99;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.divitionCode;
        int i4 = i3 + 79;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return str;
    }

    public final String component10() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        String str = this.lastTuitionMonth;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int iAxisFromString = MotionEvent.axisFromString("") + 877;
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 10;
            byte b2 = (byte) ($$b & 29);
            byte b3 = $$a[5];
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iAxisFromString, fadingEdgeLength, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(Process.myPid() >> 22, 21 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (TextUtils.getCapsMode("", 0, 0) + 60659), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(22 - View.MeasureSpec.getMode(0), (ViewConfiguration.getEdgeSlop() >> 16) + 15, (char) Color.red(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 877;
            int bitsPerPixel = 9 - ImageFormat.getBitsPerPixel(0);
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr[10], bArr[7], bArr[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(deadChar, iIndexOf, bitsPerPixel, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
            g = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                int iLastIndexOf = 875 - TextUtils.lastIndexOf("", '0', 0, 0);
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 10;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[7];
                Object[] objArr6 = new Object[1];
                a(b4, bArr2[5], b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb, iLastIndexOf, capsMode, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = (-549971510) + (((~(iIdentityHashCode | 809278377)) | 230753364) * 305) + (((~((~iIdentityHashCode) | 809278377)) | 768968148) * 305) + 258701735;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(37 - (Process.myPid() >> 22), 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (23116 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c((ViewConfiguration.getKeyRepeatDelay() >> 16) + 63, (ViewConfiguration.getJumpTapTimeout() >> 16) + 18, (char) ExpandableListView.getPackedPositionType(0L), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c((ViewConfiguration.getDoubleTapTimeout() >> 16) + 81, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 17, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 50056), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(97 - TextUtils.getTrimmedLength(""), 17 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i7 = g + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 258701735};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[8];
                byte b6 = b5;
                Object[] objArr13 = new Object[1];
                d(b5, b6, b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr3[91];
                byte b8 = b7;
                Object[] objArr14 = new Object[1];
                d(b7, b8, b8, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i9 = g + 83;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                    int i10 = i9 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                        int capsMode2 = 876 - TextUtils.getCapsMode("", 0, 0);
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 11;
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[7];
                        Object[] objArr15 = new Object[1];
                        a(b9, bArr4[5], b9, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, capsMode2, iLastIndexOf2, 256017550, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        c(Drawable.resolveOpacity(0, 0), 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 60659), objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        c((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                            int absoluteGravity = 876 - Gravity.getAbsoluteGravity(0, 0);
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10;
                            byte[] bArr5 = $$a;
                            byte b10 = bArr5[10];
                            byte b11 = bArr5[7];
                            byte b12 = bArr5[5];
                            Object[] objArr18 = new Object[1];
                            a(b10, b11, b12, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionChild, absoluteGravity, maximumFlingVelocity, 2009631821, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                            int i11 = 875 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int doubleTapTimeout = 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            byte b13 = (byte) ($$b & 29);
                            byte b14 = $$a[5];
                            Object[] objArr19 = new Object[1];
                            a(b13, b14, b14, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, i11, doubleTapTimeout, 252381699, false, (String) objArr19[0], null);
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
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            throw null;
        }
        int i12 = ((int[]) objArr[1])[0];
        Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i13 = ~((-42998273) | iIdentityHashCode2);
        int i14 = ~iIdentityHashCode2;
        int i15 = i12 + 1609606132 + ((i13 | (~(129760815 | i14))) * 920) + (((~((-127072773) | i14)) | 42998272) * 920) + (((~(iIdentityHashCode2 | 129760815)) | (~((-42998273) | i14)) | (~((-84074501) | iIdentityHashCode2))) * 920);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr20[1])[0] = i17 ^ (i17 << 5);
        int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        g = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 86 / 0;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0307  */
    /* JADX WARN: Code duplicated, block: B:69:0x0308  */
    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        char c2;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            c2 = '0';
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i4 = $11 + 47;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i * i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.red(0), 2187 - (ViewConfiguration.getTouchSlop() >> 8), 39 - TextUtils.lastIndexOf("", '0'), 841711447, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(b), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 2;
                            byte b5 = (byte) (b4 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - Gravity.getAbsoluteGravity(0, 0)), 3011 - (ViewConfiguration.getTouchSlop() >> 8), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27, 321985076, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char touchSlop = (char) (36505 - (ViewConfiguration.getTouchSlop() >> 8));
                                int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 3376;
                                int iBlue = Color.blue(0) + 17;
                                byte b6 = (byte) ($$f & 7);
                                byte b7 = (byte) (-b6);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(touchSlop, touchSlop2, iBlue, -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause2 = th.getCause();
                            if (cause2 == null) {
                                throw th;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th2) {
                        Throwable cause3 = th2.getCause();
                        if (cause3 == null) {
                            throw th2;
                        }
                        throw cause3;
                    }
                } catch (Throwable th3) {
                    Throwable cause4 = th3.getCause();
                    if (cause4 == null) {
                        throw th3;
                    }
                    throw cause4;
                }
            } else {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.resolveSize(0, 0), TextUtils.getOffsetAfter("", 0) + 2187, Color.alpha(0) + 40, 841711447, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(b), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b10 = (byte) 2;
                        byte b11 = (byte) (b10 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33017), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3011, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 25, 321985076, false, $$g(b10, b11, (byte) (b11 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c3 = (char) (36506 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int i7 = 3376 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i8 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16;
                        byte b12 = (byte) ($$f & 7);
                        byte b13 = (byte) (-b12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, i7, i8, -968507904, false, $$g(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                } catch (Throwable th4) {
                    cause = th4.getCause();
                    if (cause != null) {
                        throw th4;
                    }
                    throw cause;
                }
            }
            cause = th4.getCause();
            if (cause != null) {
                throw th4;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i9 = $10 + 29;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char defaultSize = (char) (36505 - View.getDefaultSize(0, 0));
                int iLastIndexOf = TextUtils.lastIndexOf("", c2, 0, 0) + 3377;
                int iIndexOf = 17 - TextUtils.indexOf("", "");
                byte b14 = (byte) ($$f & 7);
                byte b15 = (byte) (-b14);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(defaultSize, iLastIndexOf, iIndexOf, -968507904, false, $$g(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
            int i11 = $10 + 107;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            c2 = '0';
        }
        objArr[0] = new String(cArr);
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ JhtBalanceItem copy$default(JhtBalanceItem jhtBalanceItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, Object obj) {
        String str14;
        String str15;
        String str16;
        String str17;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = g + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            str14 = jhtBalanceItem.companyCode;
        } else {
            str14 = str;
        }
        String str18 = (i & 2) != 0 ? jhtBalanceItem.segmentCode : str2;
        String str19 = (i & 4) != 0 ? jhtBalanceItem.tkCode : str3;
        String str20 = (i & 8) != 0 ? jhtBalanceItem.kpj : str4;
        if ((i & 16) != 0) {
            str15 = jhtBalanceItem.companyName;
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
            g = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str15 = str5;
        }
        String str21 = (i & 32) != 0 ? jhtBalanceItem.balance : str6;
        String str22 = (i & 64) != 0 ? jhtBalanceItem.npp : str7;
        String str23 = (i & 128) != 0 ? jhtBalanceItem.totalWorker : str8;
        if ((i & 256) != 0) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            g = i7 % 128;
            int i8 = i7 % 2;
            str16 = jhtBalanceItem.subscribedProgram;
        } else {
            str16 = str9;
        }
        String str24 = (i & 512) != 0 ? jhtBalanceItem.lastTuitionMonth : str10;
        if ((i & 1024) != 0) {
            str17 = jhtBalanceItem.lastTuitionDate;
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
            g = i9 % 128;
            int i10 = i9 % 2;
        } else {
            str17 = str11;
        }
        return jhtBalanceItem.copy(str14, str18, str19, str20, str15, str21, str22, str23, str16, str24, str17, (i & 2048) != 0 ? jhtBalanceItem.membershipStatus : str12, (i & 4096) != 0 ? jhtBalanceItem.divitionCode : str13);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.companyCode;
        int i5 = i2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.lastTuitionDate;
        }
        throw null;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 107;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.membershipStatus;
        int i5 = i2 + 103;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = g + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.divitionCode;
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = g + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.segmentCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.tkCode;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.kpj;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 75;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.companyName;
        int i4 = i2 + 95;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = g + 65;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.balance;
        int i5 = i3 + 83;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = g + 73;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.npp;
        int i4 = i3 + 83;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = g + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.totalWorker;
        }
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.subscribedProgram;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final JhtBalanceItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12) {
        int i = 2 % 2;
        JhtBalanceItem jhtBalanceItem = new JhtBalanceItem(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);
        int i2 = g + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 67 / 0;
        }
        return jhtBalanceItem;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof JhtBalanceItem)) {
            return false;
        }
        JhtBalanceItem jhtBalanceItem = (JhtBalanceItem) p0;
        if (!Intrinsics.areEqual(this.companyCode, jhtBalanceItem.companyCode)) {
            int i2 = g + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.segmentCode, jhtBalanceItem.segmentCode) || !Intrinsics.areEqual(this.tkCode, jhtBalanceItem.tkCode) || !Intrinsics.areEqual(this.kpj, jhtBalanceItem.kpj)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.companyName, jhtBalanceItem.companyName)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
            g = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.balance, jhtBalanceItem.balance)) {
            return Intrinsics.areEqual(this.npp, jhtBalanceItem.npp) && Intrinsics.areEqual(this.totalWorker, jhtBalanceItem.totalWorker) && Intrinsics.areEqual(this.subscribedProgram, jhtBalanceItem.subscribedProgram) && Intrinsics.areEqual(this.lastTuitionMonth, jhtBalanceItem.lastTuitionMonth) && Intrinsics.areEqual(this.lastTuitionDate, jhtBalanceItem.lastTuitionDate) && !(Intrinsics.areEqual(this.membershipStatus, jhtBalanceItem.membershipStatus) ^ true) && Intrinsics.areEqual(this.divitionCode, jhtBalanceItem.divitionCode);
        }
        int i6 = g + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int iHashCode7;
        int i = 2 % 2;
        String str = this.companyCode;
        int iHashCode8 = 1;
        if (str == null) {
            int i2 = g + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
            g = i3 % 128;
            int i4 = i3 % 2;
        }
        String str2 = this.segmentCode;
        if (str2 == null) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
            g = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.tkCode;
        if (str3 == null) {
            int i7 = g + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        String str4 = this.kpj;
        if (str4 == null) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
            g = i9 % 128;
            int i10 = i9 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str4.hashCode();
        }
        String str5 = this.companyName;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.balance;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.npp;
        if (str7 == null) {
            int i11 = g + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
            int i12 = i11 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str7.hashCode();
        }
        String str8 = this.totalWorker;
        if (str8 == null) {
            int i13 = g + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
            int i14 = i13 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = str8.hashCode();
        }
        String str9 = this.subscribedProgram;
        if (str9 == null) {
            int i15 = g + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
            int i16 = i15 % 2;
            iHashCode7 = 0;
        } else {
            iHashCode7 = str9.hashCode();
        }
        String str10 = this.lastTuitionMonth;
        if (str10 == null) {
            int i17 = g + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
            if (i17 % 2 == 0) {
                iHashCode8 = 0;
            }
        } else {
            iHashCode8 = str10.hashCode();
        }
        String str11 = this.lastTuitionDate;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.membershipStatus;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.divitionCode;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str13 != null ? str13.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.companyCode;
        String str2 = this.segmentCode;
        String str3 = this.tkCode;
        String str4 = this.kpj;
        String str5 = this.companyName;
        String str6 = this.balance;
        String str7 = this.npp;
        String str8 = this.totalWorker;
        String str9 = this.subscribedProgram;
        String str10 = this.lastTuitionMonth;
        String str11 = this.lastTuitionDate;
        String str12 = this.membershipStatus;
        String str13 = this.divitionCode;
        StringBuilder sb = new StringBuilder("JhtBalanceItem(companyCode=");
        sb.append(str);
        sb.append(", segmentCode=");
        sb.append(str2);
        sb.append(", tkCode=");
        sb.append(str3);
        sb.append(", kpj=");
        sb.append(str4);
        sb.append(", companyName=");
        sb.append(str5);
        sb.append(", balance=");
        sb.append(str6);
        sb.append(", npp=");
        sb.append(str7);
        sb.append(", totalWorker=");
        sb.append(str8);
        sb.append(", subscribedProgram=");
        sb.append(str9);
        sb.append(", lastTuitionMonth=");
        sb.append(str10);
        sb.append(", lastTuitionDate=");
        sb.append(str11);
        sb.append(", membershipStatus=");
        sb.append(str12);
        sb.append(", divitionCode=");
        sb.append(str13);
        sb.append(")");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
        g = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{23822, 13402, 36797, 24844, 63596, 21441, 9513, 48188, 6104, 59695, 16591, 56277, 44370, 1155, 40929, 29023, 51378, 41511, 13669, 36033, 26128, 63859, 45561, 55467, 25419, 36349, 5251, 48958, 51674, 20659, 64289, 1486, 44158, 14081, 16817, 59502, 29443, 60337, 33509, 14594, 55219, 20179, 58750, 37782, 2691, 41321, 24467, 63022, 27927, 7125, 45612, 10590, 51180, 32278, 5298, 33730, 14952, 53400, 20431, 58992, 40088, 2873, 41559, 45567, 55474, 25432, 36351, 5269, 48949, 51658, 20640, 64308, 1503, 44158, 14108, 16827, 59490, 29458, 40352, 9283, 20217, 29310, 6958, 41172, 20068, 55126, 31935, 2647, 37639, 14507, 50697, 28617, 62596, 33315, 11263, 45195, 24108, 45557, 55459, 25423, 36323, 5252, 48946, 51658, 20632, 64268, 1486, 44129, 14109, 16795, 59500, 29442, 40364};
        b = 7193073149757348039L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, int r8, short r9) {
        /*
            int r9 = r9 * 3
            int r9 = 1 - r9
            int r7 = r7 * 3
            int r7 = r7 + 109
            int r8 = r8 + 4
            byte[] r0 = com.bpjstku.data.jht.model.response.JhtBalanceItem.$$c
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L2a:
            int r8 = r8 + r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.model.response.JhtBalanceItem.$$g(short, int, short):java.lang.String");
    }
}
