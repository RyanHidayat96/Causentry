package com.bpjstku.data.devicebinding.model.response;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0088\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\nHÇ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b'\u0010\u0013R\u001a\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0013R\"\u0010+\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010)\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010-R\"\u0010.\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010-R\"\u00101\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010)\u001a\u0004\b2\u0010\u0013\"\u0004\b3\u0010-R\"\u00104\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010)\u001a\u0004\b4\u0010\u0013\"\u0004\b5\u0010-R\"\u00106\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010)\u001a\u0004\b6\u0010\u0013\"\u0004\b7\u0010-R\"\u00108\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010)\u001a\u0004\b9\u0010\u0013\"\u0004\b:\u0010-R\u001a\u0010;\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b;\u0010\u001bR\u001a\u0010=\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010<\u001a\u0004\b>\u0010\u001bR\u001a\u0010?\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b@\u0010\u001bR\u001a\u0010A\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bA\u0010\u001bR\u001a\u0010B\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010<\u001a\u0004\bB\u0010\u001b"}, d2 = {"Lcom/bpjstku/data/devicebinding/model/response/CheckMembershipResponse;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "", "p7", "p8", "p9", "p10", "p11", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Z", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZ)Lcom/bpjstku/data/devicebinding/model/response/CheckMembershipResponse;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "haveMembership", "Ljava/lang/String;", "getHaveMembership", "isSuccessful", "setSuccessful", "(Ljava/lang/String;)V", "havePengajuan", "getHavePengajuan", "setHavePengajuan", "statusCode", "getStatusCode", "setStatusCode", "isSuspend", "setSuspend", "isSuspendAntol", "setSuspendAntol", "message", "getMessage", "setMessage", "isSuccessfulRaw", "Z", "haveMembershipRaw", "getHaveMembershipRaw", "havePengajuanRaw", "getHavePengajuanRaw", "isSuspendRaw", "isSuspendAntolRaw"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CheckMembershipResponse {
    public static final int $stable = 8;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char b;

    @SerializedName("haveMembership")
    private final String haveMembership;

    @SerializedName("haveMembershipRaw")
    private final boolean haveMembershipRaw;

    @SerializedName("havePengajuan")
    private String havePengajuan;

    @SerializedName("havePengajuanRaw")
    private final boolean havePengajuanRaw;

    @SerializedName("isSuccessful")
    private String isSuccessful;

    @SerializedName("isSuccessfulRaw")
    private final boolean isSuccessfulRaw;

    @SerializedName("isSuspend")
    private String isSuspend;

    @SerializedName("isSuspendAntol")
    private String isSuspendAntol;

    @SerializedName("isSuspendAntolRaw")
    private final boolean isSuspendAntolRaw;

    @SerializedName("isSuspendRaw")
    private final boolean isSuspendRaw;

    @SerializedName("message")
    private String message;

    @SerializedName("statusCode")
    private String statusCode;
    private static final byte[] $$c = {115, 25, -47, -94};
    private static final int $$d = 77;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {104, 27, -72, 120, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 255;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.data.devicebinding.model.response.CheckMembershipResponse.$$a
            int r8 = r8 * 4
            int r8 = 84 - r8
            int r7 = r7 * 3
            int r7 = r7 + 53
            int r9 = r9 * 2
            int r9 = 3 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r5 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            int r9 = r9 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2d:
            int r9 = -r9
            int r8 = r8 + r9
            int r8 = r8 + (-11)
            r9 = r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.devicebinding.model.response.CheckMembershipResponse.c(short, short, int, java.lang.Object[]):void");
    }

    public CheckMembershipResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.haveMembership = str;
        this.isSuccessful = str2;
        this.havePengajuan = str3;
        this.statusCode = str4;
        this.isSuspend = str5;
        this.isSuspendAntol = str6;
        this.message = str7;
        this.isSuccessfulRaw = z;
        this.haveMembershipRaw = z2;
        this.havePengajuanRaw = z3;
        this.isSuspendRaw = z4;
        this.isSuspendAntolRaw = z5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CheckMembershipResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str8;
        String str9;
        String str10;
        boolean z6;
        boolean z7;
        String str11 = "";
        if ((i & 1) != 0) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
            g = i2 % 128;
            int i3 = i2 % 2;
            str8 = "";
        } else {
            str8 = str;
        }
        if ((i & 2) != 0) {
            int i4 = g + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            str9 = "";
        } else {
            str9 = str2;
        }
        if ((i & 4) != 0) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
            g = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str10 = "";
        } else {
            str10 = str3;
        }
        String str12 = (i & 8) != 0 ? "" : str4;
        String str13 = (i & 16) != 0 ? "" : str5;
        String str14 = (i & 32) != 0 ? "" : str6;
        boolean z8 = true;
        boolean z9 = false;
        if ((i & 64) != 0) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            g = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 64 / 0;
            }
        } else {
            str11 = str7;
        }
        if ((i & 128) != 0) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
            g = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            z6 = false;
        } else {
            z6 = z;
        }
        if ((i & 256) != 0) {
            int i13 = 2 % 2;
            z7 = false;
        } else {
            z7 = z2;
        }
        if ((i & 512) != 0) {
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
            g = i14 % 128;
            if (i14 % 2 != 0) {
                z8 = false;
            }
        } else {
            z8 = z3;
        }
        boolean z10 = (i & 1024) != 0 ? false : z4;
        if ((i & 2048) != 0) {
            int i15 = 2 % 2;
        } else {
            z9 = z5;
        }
        this(str8, str9, str10, str12, str13, str14, str11, z6, z7, z8, z10, z9);
    }

    public final String getHaveMembership() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 53;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.haveMembership;
        int i5 = i2 + 115;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String isSuccessful() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 97;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.isSuccessful;
        int i5 = i2 + 59;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setSuccessful(String str) {
        int i = 2 % 2;
        int i2 = g + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.isSuccessful = str;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.isSuccessful = str;
        int i3 = g + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final String getHavePengajuan() {
        int i = 2 % 2;
        int i2 = g + 57;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.havePengajuan;
        int i5 = i3 + 41;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return str;
    }

    public final void setHavePengajuan(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.havePengajuan = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.havePengajuan = str;
        int i3 = g + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String getStatusCode() {
        int i = 2 % 2;
        int i2 = g + 91;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.statusCode;
        int i5 = i3 + 117;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setStatusCode(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.statusCode = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.statusCode = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final String isSuspend() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        String str = this.isSuspend;
        int i5 = i3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setSuspend(String str) {
        int i = 2 % 2;
        int i2 = g + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.isSuspend = str;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.isSuspend = str;
        int i3 = g + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String isSuspendAntol() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.isSuspendAntol;
        int i5 = i2 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setSuspendAntol(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.isSuspendAntol = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.isSuspendAntol = str;
        int i3 = g + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String getMessage() {
        int i = 2 % 2;
        int i2 = g + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.message;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setMessage(String str) {
        int i = 2 % 2;
        int i2 = g + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final boolean isSuccessfulRaw() {
        int i = 2 % 2;
        int i2 = g + 79;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        boolean z = this.isSuccessfulRaw;
        int i5 = i3 + 23;
        g = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean getHaveMembershipRaw() {
        int i = 2 % 2;
        int i2 = g + 41;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        boolean z = this.haveMembershipRaw;
        int i5 = i3 + 95;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final boolean getHavePengajuanRaw() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        int i3 = i2 % 128;
        g = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.havePengajuanRaw;
        int i4 = i3 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final boolean isSuspendRaw() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isSuspendRaw;
        }
        throw null;
    }

    public final boolean isSuspendAntolRaw() throws Throwable {
        int i = 2 % 2;
        int i2 = g + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - ((Process.getThreadPriority(0) + 20) >> 6)), 40 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        a(new char[]{'\r', 21, 7, 1, '\f', 15, '\t', 16, '\r', 0, 16, 4, '\b', 4, 1, 24, '\t', '\b', 15, '\r', 3, '\n'}, (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 100), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(new char[]{23, 16, 14, 21, 1, 23, 5, 16, 1, 16, 19, 3, 18, 7, 13898}, (byte) (76 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 15 - TextUtils.getTrimmedLength(""), objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = 881;
        long j2 = (j * 2742660728632142316L) + (j * (-645403553890183329L));
        long j3 = -880;
        long j4 = -1;
        long j5 = j4 ^ 2742660728632142316L;
        long j6 = j4 ^ (-645403553890183329L);
        long jIdentityHashCode = System.identityHashCode(this);
        long j7 = j2 + ((((j5 | j6) ^ j4) | ((j5 | jIdentityHashCode) ^ j4) | ((j6 | jIdentityHashCode) ^ j4)) * j3);
        long j8 = ((j5 | (jIdentityHashCode ^ j4)) ^ j4) | (-645403553890183329L);
        long j9 = (jIdentityHashCode | 2742660728632142316L) ^ j4;
        long j10 = j7 + (j3 * (j8 | j9)) + (((long) 880) * j9);
        int i5 = 0;
        while (true) {
            int i6 = 3;
            if (i5 == 10) {
                Object[] objArr3 = new Object[1];
                a(new char[]{'\r', '\f', 21, '\f', 15, 19, '\r', 21, '\t', 15, 4, 6, 4, 0, 23, 6}, (byte) (23 - View.getDefaultSize(0, 0)), 16 - ((Process.getThreadPriority(0) + 20) >> 6), objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a(new char[]{16, 7, 22, 24, 2, 19, '\t', 14, 21, '\n', 4, '\r', 5, '\f', 11, 1}, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 101), (ViewConfiguration.getTouchSlop() >> 8) + 16, objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {180361736};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46038 - View.getDefaultSize(0, 0)), (Process.myTid() >> 22) + 1134, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -1500392554, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1031;
                        int windowTouchSlop = 15 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        c(b2, b3, b3, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState, iResolveSizeAndState, windowTouchSlop, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (MotionEvent.axisFromString("") + 45994), 1117 - (ViewConfiguration.getWindowTouchSlop() >> 8), 17 - View.MeasureSpec.getMode(0)), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6);
                    if (((int[]) objArr8[3])[0] == ((int[]) objArr8[1])[0]) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr8[0];
                    if (strArr == null) {
                        throw null;
                    }
                    int i7 = g;
                    int i8 = i7 + 95;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = i7 + 53;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                    int i11 = i10 % 2;
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                    throw null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37837 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.getDefaultSize(0, 0) + 59, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i12 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
            int i13 = 0;
            long j11 = jLongValue;
            while (true) {
                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
                g = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 5 % i6;
                }
                int i16 = 0;
                while (i16 != 8) {
                    int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
                    g = i17 % 128;
                    if (i17 % 2 == 0) {
                        i12 = (((((int) (j11 >> i16)) & 29012) / (i12 * 46)) / (i12 + 15)) - i12;
                        i16 += 41;
                    } else {
                        i12 = (((((int) (j11 >> i16)) & 255) + (i12 << 6)) + (i12 << 16)) - i12;
                        i16++;
                    }
                }
                if (i13 != 0) {
                    break;
                }
                i13++;
                j11 = j10;
                i6 = 3;
            }
            if (i12 == i4) {
                break;
            }
            jLongValue -= 1024;
            i5++;
        }
        return this.isSuspendAntolRaw;
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i5 = 1770390596;
        Object obj2 = null;
        int i6 = -1;
        if (cArr3 != null) {
            int i7 = $11 + 69;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                int i8 = $10 + 75;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) i6;
                            byte b4 = (byte) (b3 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 1), Color.blue(0) + 2267, View.resolveSizeAndState(0, 0, 0) + 33, -1927765101, false, $$e(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), View.MeasureSpec.makeMeasureSpec(0, 0) + 2267, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33, -1927765101, false, $$e(b5, b6, (byte) (b6 + 3)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i3++;
                    i5 = 1770390596;
                }
                i6 = -1;
            }
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(b)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        long j = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            byte b7 = (byte) (-1);
            byte b8 = (byte) (b7 + 1);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 2267 - Color.red(0), 33 - Color.green(0), -1927765101, false, $$e(b7, b8, (byte) (b8 + 3)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i9 = $11 + 91;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                i2 = i + 32;
                cArr4[i2] = (char) (cArr[i2] * b2);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char scrollBarFadeDuration = (char) (49267 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        int iAlpha = 3261 - Color.alpha(0);
                        int i10 = (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 29;
                        byte b9 = (byte) (-1);
                        byte b10 = (byte) (b9 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarFadeDuration, iAlpha, i10, -127612708, false, $$e(b9, b10, (byte) (b10 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                        Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b11 = (byte) (-1);
                            byte b12 = (byte) (b11 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 22878), 594 - (ViewConfiguration.getTapTimeout() >> 16), 17 - View.resolveSizeAndState(0, 0, 0), 1570859318, false, $$e(b11, b12, b12), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                        int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i11];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i12 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i12];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i13];
                        } else {
                            int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i14];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i15];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
                j = 0;
            }
        }
        int i16 = 0;
        while (i16 < i) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
            i16++;
            int i17 = $11 + 89;
            $10 = i17 % 128;
            int i18 = i17 % 2;
        }
        objArr[0] = new String(cArr4);
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 1;
        TuitionPaymentFragmentbindingInflater1();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    public CheckMembershipResponse() {
        this(null, null, null, null, null, null, null, false, false, false, false, false, 4095, null);
    }

    public static /* synthetic */ CheckMembershipResponse copy$default(CheckMembershipResponse checkMembershipResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        String str8;
        String str9;
        String str10;
        boolean z6;
        boolean z7;
        boolean z8;
        int i2 = 2 % 2;
        String str11 = (i & 1) != 0 ? checkMembershipResponse.haveMembership : str;
        String str12 = (i & 2) != 0 ? checkMembershipResponse.isSuccessful : str2;
        if ((i & 4) != 0) {
            str8 = checkMembershipResponse.havePengajuan;
            int i3 = g + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            str8 = str3;
        }
        if ((i & 8) != 0) {
            str9 = checkMembershipResponse.statusCode;
            int i5 = g + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str9 = str4;
        }
        String str13 = (i & 16) != 0 ? checkMembershipResponse.isSuspend : str5;
        if ((i & 32) != 0) {
            int i7 = g + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            str10 = checkMembershipResponse.isSuspendAntol;
        } else {
            str10 = str6;
        }
        String str14 = (i & 64) != 0 ? checkMembershipResponse.message : str7;
        if ((i & 128) != 0) {
            int i9 = g + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            int i10 = i9 % 2;
            z6 = checkMembershipResponse.isSuccessfulRaw;
        } else {
            z6 = z;
        }
        if ((i & 256) != 0) {
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
            g = i11 % 128;
            if (i11 % 2 == 0) {
                boolean z9 = checkMembershipResponse.haveMembershipRaw;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            z7 = checkMembershipResponse.haveMembershipRaw;
        } else {
            z7 = z2;
        }
        boolean z10 = (i & 512) != 0 ? checkMembershipResponse.havePengajuanRaw : z3;
        boolean z11 = (i & 1024) != 0 ? checkMembershipResponse.isSuspendRaw : z4;
        if ((i & 2048) != 0) {
            int i12 = g + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
            int i13 = i12 % 2;
            z8 = checkMembershipResponse.isSuspendAntolRaw;
        } else {
            z8 = z5;
        }
        CheckMembershipResponse checkMembershipResponseCopy = checkMembershipResponse.copy(str11, str12, str8, str9, str13, str10, str14, z6, z7, z10, z11, z8);
        int i14 = g + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
        int i15 = i14 % 2;
        return checkMembershipResponseCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = g + 73;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.haveMembership;
        int i5 = i3 + 89;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean component10() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 31;
        g = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.havePengajuanRaw;
        int i5 = i2 + 99;
        g = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean component11() {
        int i = 2 % 2;
        int i2 = g + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.isSuspendRaw;
        }
        throw null;
    }

    public final boolean component12() {
        int i = 2 % 2;
        int i2 = g + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.isSuspendAntolRaw;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 73;
        g = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.isSuccessful;
        int i4 = i2 + 97;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.havePengajuan;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = g + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.statusCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        g = i2 % 128;
        int i3 = i2 % 2;
        String str = this.isSuspend;
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.isSuspendAntol;
        int i5 = i2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = g + 25;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.message;
        int i5 = i3 + 5;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean component8() {
        boolean z;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 19;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            z = this.isSuccessfulRaw;
            int i4 = 61 / 0;
        } else {
            z = this.isSuccessfulRaw;
        }
        int i5 = i2 + 89;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component9() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.haveMembershipRaw;
        int i4 = i3 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return z;
    }

    public final CheckMembershipResponse copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, boolean p7, boolean p8, boolean p9, boolean p10, boolean p11) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        CheckMembershipResponse checkMembershipResponse = new CheckMembershipResponse(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return checkMembershipResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = g + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CheckMembershipResponse)) {
            return false;
        }
        CheckMembershipResponse checkMembershipResponse = (CheckMembershipResponse) p0;
        if (!Intrinsics.areEqual(this.haveMembership, checkMembershipResponse.haveMembership) || !Intrinsics.areEqual(this.isSuccessful, checkMembershipResponse.isSuccessful)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.havePengajuan, checkMembershipResponse.havePengajuan)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            g = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 94 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.statusCode, checkMembershipResponse.statusCode)) {
            int i5 = g + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.isSuspend, checkMembershipResponse.isSuspend) || !Intrinsics.areEqual(this.isSuspendAntol, checkMembershipResponse.isSuspendAntol)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.message, checkMembershipResponse.message)) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            g = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.isSuccessfulRaw != checkMembershipResponse.isSuccessfulRaw) {
            int i9 = g + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.haveMembershipRaw != checkMembershipResponse.haveMembershipRaw || this.havePengajuanRaw != checkMembershipResponse.havePengajuanRaw) {
            return false;
        }
        if (this.isSuspendRaw == checkMembershipResponse.isSuspendRaw) {
            return this.isSuspendAntolRaw == checkMembershipResponse.isSuspendAntolRaw;
        }
        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        g = i11 % 128;
        return i11 % 2 == 0;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = g + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((((this.haveMembership.hashCode() * 31) + this.isSuccessful.hashCode()) * 31) + this.havePengajuan.hashCode()) * 31) + this.statusCode.hashCode()) * 31) + this.isSuspend.hashCode()) * 31) + this.isSuspendAntol.hashCode()) * 31) + this.message.hashCode()) * 31) + Boolean.hashCode(this.isSuccessfulRaw)) * 31) + Boolean.hashCode(this.haveMembershipRaw)) * 31) + Boolean.hashCode(this.havePengajuanRaw)) * 31) + Boolean.hashCode(this.isSuspendRaw)) * 31) + Boolean.hashCode(this.isSuspendAntolRaw);
        int i4 = g + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.haveMembership;
        String str2 = this.isSuccessful;
        String str3 = this.havePengajuan;
        String str4 = this.statusCode;
        String str5 = this.isSuspend;
        String str6 = this.isSuspendAntol;
        String str7 = this.message;
        boolean z = this.isSuccessfulRaw;
        boolean z2 = this.haveMembershipRaw;
        boolean z3 = this.havePengajuanRaw;
        boolean z4 = this.isSuspendRaw;
        boolean z5 = this.isSuspendAntolRaw;
        StringBuilder sb = new StringBuilder("CheckMembershipResponse(haveMembership=");
        sb.append(str);
        sb.append(", isSuccessful=");
        sb.append(str2);
        sb.append(", havePengajuan=");
        sb.append(str3);
        sb.append(", statusCode=");
        sb.append(str4);
        sb.append(", isSuspend=");
        sb.append(str5);
        sb.append(", isSuspendAntol=");
        sb.append(str6);
        sb.append(", message=");
        sb.append(str7);
        sb.append(", isSuccessfulRaw=");
        sb.append(z);
        sb.append(", haveMembershipRaw=");
        sb.append(z2);
        sb.append(", havePengajuanRaw=");
        sb.append(z3);
        sb.append(", isSuspendRaw=");
        sb.append(z4);
        sb.append(", isSuspendAntolRaw=");
        sb.append(z5);
        sb.append(")");
        String string = sb.toString();
        int i2 = g + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 44 / 0;
        }
        return string;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{60056, 60072, 60041, 60040, 60047, 60060, 60063, 60088, 60054, 60034, 60052, 60058, 60049, 60048, 60051, 60073, 60059, 60050, 60055, 60117, 60083, 60062, 60045, 60053, 60043};
        b = (char) 57188;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, byte r7, byte r8) {
        /*
            int r8 = 116 - r8
            byte[] r0 = com.bpjstku.data.devicebinding.model.response.CheckMembershipResponse.$$c
            int r7 = r7 * 3
            int r1 = 1 - r7
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L20:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.devicebinding.model.response.CheckMembershipResponse.$$e(short, byte, byte):java.lang.String");
    }
}
