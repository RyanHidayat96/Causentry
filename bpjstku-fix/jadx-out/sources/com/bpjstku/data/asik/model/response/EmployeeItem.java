package com.bpjstku.data.asik.model.response;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.datadog.android.rum.internal.domain.scope.RumViewScope$onStopView$1;
import com.google.gson.annotations.SerializedName;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001Bë\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0019J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0019J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u0019J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u0019J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u0019Jô\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b,\u0010-J\r\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u0010\u0003\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020.HÖ\u0001¢\u0006\u0004\b5\u00100J\u0010\u00106\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b6\u0010\u0019J\u001d\u00109\u001a\u0002082\u0006\u0010\u0003\u001a\u0002072\u0006\u0010\u0004\u001a\u00020.¢\u0006\u0004\b9\u0010:R\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u0019R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010<\u001a\u0004\b?\u0010\u0019R\u001c\u0010@\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010\u0019R\u001c\u0010B\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010<\u001a\u0004\bC\u0010\u0019R\u001c\u0010D\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010<\u001a\u0004\bE\u0010\u0019R\u001c\u0010F\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010<\u001a\u0004\bG\u0010\u0019R\u001c\u0010H\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010<\u001a\u0004\bI\u0010\u0019R\u001c\u0010J\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010<\u001a\u0004\bK\u0010\u0019R\u001c\u0010L\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010<\u001a\u0004\bM\u0010\u0019R\u001c\u0010N\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010<\u001a\u0004\bO\u0010\u0019R\u001c\u0010P\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010<\u001a\u0004\bQ\u0010\u0019R\u001c\u0010R\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010<\u001a\u0004\bS\u0010\u0019R\u001c\u0010T\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010<\u001a\u0004\bU\u0010\u0019R\u001c\u0010V\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010<\u001a\u0004\bW\u0010\u0019R\u001c\u0010X\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010<\u001a\u0004\bY\u0010\u0019R\u001c\u0010Z\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010<\u001a\u0004\b[\u0010\u0019R\u001c\u0010\\\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010<\u001a\u0004\b]\u0010\u0019R\u001c\u0010^\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010<\u001a\u0004\b_\u0010\u0019R\u001c\u0010`\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010<\u001a\u0004\ba\u0010\u0019"}, d2 = {"Lcom/bpjstku/data/asik/model/response/EmployeeItem;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/asik/model/response/EmployeeItem;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "namaTk", "Ljava/lang/String;", "getNamaTk", "kpj", "getKpj", "nomorRekening", "getNomorRekening", "kodeBank", "getKodeBank", "namaPerusahaan", "getNamaPerusahaan", "npwp", "getNpwp", "kodeKantor", "getKodeKantor", "namaIbuKandung", "getNamaIbuKandung", "kodeSegmen", "getKodeSegmen", "kodeKepesertaan", "getKodeKepesertaan", "npp", "getNpp", "nik", "getNik", "tglLahir", "getTglLahir", "namaRekening", "getNamaRekening", "namaBank", "getNamaBank", "alamatDomisi", "getAlamatDomisi", "tempatLahir", "getTempatLahir", "jenisKelamin", "getJenisKelamin", "kodeTk", "getKodeTk"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EmployeeItem implements Parcelable {
    public static final int $stable;
    public static final Parcelable.Creator<EmployeeItem> CREATOR;
    private static long TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @SerializedName("alamatDomisi")
    private final String alamatDomisi;

    @SerializedName("jenisKelamin")
    private final String jenisKelamin;

    @SerializedName("kodeBank")
    private final String kodeBank;

    @SerializedName("kodeKantor")
    private final String kodeKantor;

    @SerializedName("kodeKepesertaan")
    private final String kodeKepesertaan;

    @SerializedName("kodeSegmen")
    private final String kodeSegmen;

    @SerializedName("kodeTk")
    private final String kodeTk;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("namaBank")
    private final String namaBank;

    @SerializedName("namaIbuKandung")
    private final String namaIbuKandung;

    @SerializedName("namaPerusahaan")
    private final String namaPerusahaan;

    @SerializedName("namaRekening")
    private final String namaRekening;

    @SerializedName("namaTk")
    private final String namaTk;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("nomorRekening")
    private final String nomorRekening;

    @SerializedName("npp")
    private final String npp;

    @SerializedName("npwp")
    private final String npwp;

    @SerializedName("tempatLahir")
    private final String tempatLahir;

    @SerializedName("tglLahir")
    private final String tglLahir;
    private static final byte[] $$c = {89, 107, -36, -112};
    private static final int $$d = 228;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {101, 89, 94, -73, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 153;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EmployeeItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmployeeItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EmployeeItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmployeeItem[] newArray(int i) {
            return new EmployeeItem[i];
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 15
            int r0 = 53 - r6
            int r7 = r7 * 2
            int r7 = 84 - r7
            int r8 = 92 - r8
            byte[] r1 = com.bpjstku.data.asik.model.response.EmployeeItem.$$a
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2f
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r0[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2f:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-11)
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.asik.model.response.EmployeeItem.a(short, short, short, java.lang.Object[]):void");
    }

    public EmployeeItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
        this.namaTk = str;
        this.kpj = str2;
        this.nomorRekening = str3;
        this.kodeBank = str4;
        this.namaPerusahaan = str5;
        this.npwp = str6;
        this.kodeKantor = str7;
        this.namaIbuKandung = str8;
        this.kodeSegmen = str9;
        this.kodeKepesertaan = str10;
        this.npp = str11;
        this.nik = str12;
        this.tglLahir = str13;
        this.namaRekening = str14;
        this.namaBank = str15;
        this.alamatDomisi = str16;
        this.tempatLahir = str17;
        this.jenisKelamin = str18;
        this.kodeTk = str19;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EmployeeItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        Object obj = null;
        String str28 = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = b + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            str20 = null;
        } else {
            str20 = str2;
        }
        String str29 = (i & 4) != 0 ? null : str3;
        String str30 = (i & 8) != 0 ? null : str4;
        if ((i & 16) != 0) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
            b = i3 % 128;
            int i4 = i3 % 2;
            str21 = null;
        } else {
            str21 = str5;
        }
        String str31 = (i & 32) != 0 ? null : str6;
        String str32 = (i & 64) != 0 ? null : str7;
        String str33 = (i & 128) != 0 ? null : str8;
        if ((i & 256) != 0) {
            int i5 = 2 % 2;
            str22 = null;
        } else {
            str22 = str9;
        }
        if ((i & 512) != 0) {
            int i6 = 2 % 2;
            str23 = null;
        } else {
            str23 = str10;
        }
        if ((i & 1024) != 0) {
            int i7 = b + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 / 3;
            } else {
                int i9 = 2 % 2;
            }
            str24 = null;
        } else {
            str24 = str11;
        }
        if ((i & 2048) != 0) {
            int i10 = b + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
            if (i10 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str25 = null;
        } else {
            str25 = str12;
        }
        String str34 = (i & 4096) != 0 ? null : str13;
        if ((i & 8192) != 0) {
            int i11 = 2 % 2;
            str26 = null;
        } else {
            str26 = str14;
        }
        String str35 = (i & 16384) != 0 ? null : str15;
        String str36 = (i & 32768) != 0 ? null : str16;
        String str37 = (i & 65536) != 0 ? null : str17;
        String str38 = (i & 131072) != 0 ? null : str18;
        if ((i & 262144) != 0) {
            int i12 = 2 % 2;
            str27 = null;
        } else {
            str27 = str19;
        }
        this(str28, str20, str29, str30, str21, str31, str32, str33, str22, str23, str24, str25, str34, str26, str35, str36, str37, str38, str27);
    }

    public final String getNamaTk() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.namaTk;
        int i5 = i2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getKpj() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        b = i2 % 128;
        int i3 = i2 % 2;
        String str = this.kpj;
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        return str;
    }

    public final String getNomorRekening() {
        String str;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.nomorRekening;
            int i4 = 8 / 0;
        } else {
            str = this.nomorRekening;
        }
        int i5 = i2 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getKodeBank() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 5;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.kodeBank;
        int i5 = i2 + 31;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getNamaPerusahaan() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 85;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.namaPerusahaan;
        int i5 = i2 + 39;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
        return str;
    }

    public final String getNpwp() {
        int i = 2 % 2;
        int i2 = b + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.npwp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getKodeKantor() {
        int i = 2 % 2;
        int i2 = b + 21;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.kodeKantor;
        int i4 = i3 + 73;
        b = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getNamaIbuKandung() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.namaIbuKandung;
        int i4 = i2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return str;
    }

    public final String getKodeSegmen() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 17;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.kodeSegmen;
        int i5 = i2 + 63;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getKodeKepesertaan() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.kodeKepesertaan;
        int i5 = i3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getNpp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 85;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.npp;
        int i5 = i2 + 87;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getNik() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        b = i2 % 128;
        int i3 = i2 % 2;
        String str = this.nik;
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        return str;
    }

    public final String getTglLahir() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        b = i2 % 128;
        int i3 = i2 % 2;
        String str = this.tglLahir;
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        return str;
    }

    public final String getNamaRekening() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.namaRekening;
        int i4 = i3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return str;
    }

    public final String getNamaBank() {
        int i = 2 % 2;
        int i2 = b + 105;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.namaBank;
        int i5 = i3 + 109;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAlamatDomisi() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.alamatDomisi;
        int i5 = i2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getTempatLahir() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 51;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.tempatLahir;
        int i4 = i2 + 7;
        b = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getJenisKelamin() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 47;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.jenisKelamin;
        int i5 = i2 + 63;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getKodeTk() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.kodeTk;
        int i5 = i3 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentbindingInflater1 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $10 + 9;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 64838), 1356 - (ViewConfiguration.getPressedStateDuration() >> 16), 37 - Process.getGidForName(""), 894276454, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47821 - AndroidCharacter.getMirror('0')), 468 - View.resolveSize(0, 0), TextUtils.indexOf((CharSequence) "", '0') + 14, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $10 + 19;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    public final String component5() throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        b = i2 % 128;
        int i3 = i2 % 2;
        String str = this.namaPerusahaan;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveOpacity = (char) (29944 - Drawable.resolveOpacity(0, 0));
            int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0);
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 23;
            byte[] bArr = $$a;
            Object[] objArr = new Object[1];
            a(bArr[5], bArr[7], bArr[1], objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, iLastIndexOf, absoluteGravity, 986134021, false, (String) objArr[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr2 = new Object[1];
        c(new char[]{52644, 52677, 13525, 47522, 35692, 37178, 5755, 63919, 45378, 30902, 50590, 27331, 42243, 19504, 2488, 41218, 20721, 37780, 15430, 62800, 7257, 59208, 24770, 51702, 51251, 10948}, 1 - TextUtils.indexOf("", "", 0), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        c(new char[]{34520, 34493, 65064, 29533, 18129, 23682, 41883, 45775, 1184, 45637, 2083, 57181, 61045, 34525, 50247, 5319, 7069, 22901, 61930}, -TextUtils.indexOf((CharSequence) "", '0'), objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 29944);
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1755;
            int scrollDefaultDelay = 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr4 = new Object[1];
            a(b2, b3, (byte) (b3 | 52), objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, touchSlop, scrollDefaultDelay, 1596667560, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char size = (char) (View.MeasureSpec.getSize(0) + 29944);
                int i4 = 1755 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 23;
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr5 = new Object[1];
                a(b4, b5, b5, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size, i4, jumpTapTimeout, 1599039318, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            int i6 = 891336941 + (((~((-399895355) | i5)) | 349446714 | (~(187292928 | i5)) | (~((-136844289) | iIdentityHashCode))) * (-84));
            int i7 = (~(iIdentityHashCode | 187292928)) | 399895354;
            int i8 = ~(i5 | (-187292929));
            int i9 = ((i6 + ((i7 | i8) * (-84))) + ((136844288 | i8) * 84)) - 380265211;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr7 = new Object[1];
            c(new char[]{11904, 12010, 44465, 8393, 41310, 47898, 11841, 6858, 35179, 57816, 61353, 21162, 17967, 54534, 9207, 39169, 46047, 2808, 5733, 52593}, KeyEvent.keyCodeFromString("") + 1, objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            c(new char[]{43704, 43729, 15696, 45101, 42043, 48748, 35809, 40616, 11460, 28985, 60121, 63250, 49720, 17837, 9906, 15551, 14295, 39431, 4865, 26838}, 1 - TextUtils.indexOf("", "", 0, 0), objArr8);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr9 = {1269630929};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42048 - ((byte) KeyEvent.getModifierMetaStateMask())), Gravity.getAbsoluteGravity(0, 0) + 1726, 30 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = RumViewScope$onStopView$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), -380265211);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29945);
                    int scrollBarSize = 1755 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int i12 = 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    byte b6 = $$a[7];
                    byte b7 = b6;
                    Object[] objArr10 = new Object[1];
                    a(b6, b7, b7, objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, scrollBarSize, i12, 1599039318, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr11 = new Object[1];
                    c(new char[]{52644, 52677, 13525, 47522, 35692, 37178, 5755, 63919, 45378, 30902, 50590, 27331, 42243, 19504, 2488, 41218, 20721, 37780, 15430, 62800, 7257, 59208, 24770, 51702, 51251, 10948}, 1 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(new char[]{34520, 34493, 65064, 29533, 18129, 23682, 41883, 45775, 1184, 45637, 2083, 57181, 61045, 34525, 50247, 5319, 7069, 22901, 61930}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1, objArr12);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 29944);
                        int iMyTid = (Process.myTid() >> 22) + 1755;
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 23;
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr13 = new Object[1];
                        a(b8, b9, (byte) (b9 | 52), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar, iMyTid, iResolveSizeAndState, 1596667560, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16807160);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1755;
                        int i13 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22;
                        byte[] bArr2 = $$a;
                        Object[] objArr14 = new Object[1];
                        a(bArr2[5], bArr2[7], bArr2[1], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cRgb, scrollBarFadeDuration, i13, 986134021, false, (String) objArr14[0], null);
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
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0] == ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]) {
            int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i15 = ~iElapsedRealtime;
            int i16 = i14 + 1702676304 + ((~((-158185351) | i15)) * 979) + ((iElapsedRealtime | 54417075) * (-979)) + (((~(iElapsedRealtime | (-158185351))) | (~(i15 | 54417075))) * 979);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr15[3])[0] = i18 ^ (i18 << 5);
            return str;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
        if (strArr == null) {
            throw null;
        }
        int i19 = b + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 % 128;
        int i20 = i19 % 2;
        for (String str2 : strArr) {
            int i21 = b + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 % 128;
            int i22 = i21 % 2;
            arrayList.add(str2);
        }
        throw null;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        CREATOR = new Creator();
        $stable = 8;
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        int i2 = i % 2;
    }

    public EmployeeItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public static /* synthetic */ EmployeeItem copy$default(EmployeeItem employeeItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i, Object obj) {
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = i3 + 67;
        b = i4 % 128;
        String str28 = (i4 % 2 == 0 ? (i & 1) == 0 : (i & 1) == 0) ? str : employeeItem.namaTk;
        String str29 = (i & 2) != 0 ? employeeItem.kpj : str2;
        String str30 = (i & 4) != 0 ? employeeItem.nomorRekening : str3;
        String str31 = (i & 8) != 0 ? employeeItem.kodeBank : str4;
        if ((i & 16) != 0) {
            int i5 = i3 + 83;
            b = i5 % 128;
            int i6 = i5 % 2;
            str20 = employeeItem.namaPerusahaan;
        } else {
            str20 = str5;
        }
        if ((i & 32) != 0) {
            int i7 = b + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            str21 = employeeItem.npwp;
        } else {
            str21 = str6;
        }
        if ((i & 64) != 0) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
            b = i9 % 128;
            int i10 = i9 % 2;
            str22 = employeeItem.kodeKantor;
        } else {
            str22 = str7;
        }
        String str32 = (i & 128) != 0 ? employeeItem.namaIbuKandung : str8;
        String str33 = (i & 256) != 0 ? employeeItem.kodeSegmen : str9;
        String str34 = (i & 512) != 0 ? employeeItem.kodeKepesertaan : str10;
        String str35 = (i & 1024) != 0 ? employeeItem.npp : str11;
        if ((i & 2048) != 0) {
            String str36 = employeeItem.nik;
            int i11 = b + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
            int i12 = i11 % 2;
            str23 = str36;
        } else {
            str23 = str12;
        }
        if ((i & 4096) != 0) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
            b = i13 % 128;
            int i14 = i13 % 2;
            str24 = employeeItem.tglLahir;
        } else {
            str24 = str13;
        }
        if ((i & 8192) != 0) {
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
            int i16 = i15 % 128;
            b = i16;
            int i17 = i15 % 2;
            String str37 = employeeItem.namaRekening;
            int i18 = i16 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
            int i19 = i18 % 2;
            str25 = str37;
        } else {
            str25 = str14;
        }
        String str38 = (i & 16384) != 0 ? employeeItem.namaBank : str15;
        if ((i & 32768) != 0) {
            int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
            b = i20 % 128;
            int i21 = i20 % 2;
            str26 = employeeItem.alamatDomisi;
        } else {
            str26 = str16;
        }
        String str39 = (65536 & i) != 0 ? employeeItem.tempatLahir : str17;
        String str40 = (i & 131072) != 0 ? employeeItem.jenisKelamin : str18;
        if ((i & 262144) != 0) {
            int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            b = i22 % 128;
            int i23 = i22 % 2;
            str27 = employeeItem.kodeTk;
        } else {
            str27 = str19;
        }
        return employeeItem.copy(str28, str29, str30, str31, str20, str21, str22, str32, str33, str34, str35, str23, str24, str25, str38, str26, str39, str40, str27);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.namaTk;
        int i5 = i2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component10() {
        String str;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.kodeKepesertaan;
            int i4 = 43 / 0;
        } else {
            str = this.kodeKepesertaan;
        }
        int i5 = i2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.npp;
        int i4 = i2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = b + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.nik;
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        return str;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.tglLahir;
        int i5 = i3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = b + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.namaRekening;
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        return str;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.namaBank;
        int i5 = i3 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.alamatDomisi;
        int i5 = i2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component17() {
        int i = 2 % 2;
        int i2 = b + 93;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.tempatLahir;
        int i4 = i3 + 13;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return str;
    }

    public final String component18() {
        int i = 2 % 2;
        int i2 = b + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.jenisKelamin;
        }
        throw null;
    }

    public final String component19() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return this.kodeTk;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.kpj;
        int i4 = i3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = b + 117;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.nomorRekening;
        int i5 = i3 + 45;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = b + 91;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.kodeBank;
        int i4 = i3 + 83;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 75;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.npwp;
        int i5 = i2 + 37;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = b + 19;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.kodeKantor;
        int i5 = i3 + 25;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = b + 41;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.namaIbuKandung;
        int i5 = i3 + 17;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return this.kodeSegmen;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final EmployeeItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String p16, String p17, String p18) {
        int i = 2 % 2;
        EmployeeItem employeeItem = new EmployeeItem(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18);
        int i2 = b + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return employeeItem;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = b + 21;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 47;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof EmployeeItem)) {
            return false;
        }
        EmployeeItem employeeItem = (EmployeeItem) p0;
        if (!Intrinsics.areEqual(this.namaTk, employeeItem.namaTk)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.kpj, employeeItem.kpj)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            b = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.nomorRekening, employeeItem.nomorRekening) || (!Intrinsics.areEqual(this.kodeBank, employeeItem.kodeBank)) || !Intrinsics.areEqual(this.namaPerusahaan, employeeItem.namaPerusahaan) || !Intrinsics.areEqual(this.npwp, employeeItem.npwp)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.kodeKantor, employeeItem.kodeKantor)) {
            int i4 = b + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.namaIbuKandung, employeeItem.namaIbuKandung) || !Intrinsics.areEqual(this.kodeSegmen, employeeItem.kodeSegmen)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.kodeKepesertaan, employeeItem.kodeKepesertaan)) {
            int i5 = b + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.npp, employeeItem.npp)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.nik, employeeItem.nik)) {
            int i6 = b + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.tglLahir, employeeItem.tglLahir)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.namaRekening, employeeItem.namaRekening)) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
            b = i8 % 128;
            return i8 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.namaBank, employeeItem.namaBank)) {
            return false;
        }
        if (Intrinsics.areEqual(this.alamatDomisi, employeeItem.alamatDomisi)) {
            return Intrinsics.areEqual(this.tempatLahir, employeeItem.tempatLahir) && Intrinsics.areEqual(this.jenisKelamin, employeeItem.jenisKelamin) && Intrinsics.areEqual(this.kodeTk, employeeItem.kodeTk);
        }
        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        b = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int i = 2 % 2;
        String str = this.namaTk;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.kpj;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.nomorRekening;
        if (str3 == null) {
            int i2 = b + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
        }
        String str4 = this.kodeBank;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.namaPerusahaan;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.npwp;
        if (str6 == null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
            b = i4 % 128;
            iHashCode2 = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = str6.hashCode();
        }
        String str7 = this.kodeKantor;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.namaIbuKandung;
        if (str8 == null) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
            b = i5 % 128;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str8.hashCode();
        }
        String str9 = this.kodeSegmen;
        int iHashCode12 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.kodeKepesertaan;
        int iHashCode13 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.npp;
        int iHashCode14 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.nik;
        if (str12 == null) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
            b = i7 % 128;
            int i8 = i7 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str12.hashCode();
        }
        String str13 = this.tglLahir;
        int iHashCode15 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.namaRekening;
        if (str14 == null) {
            int i9 = b + 59;
            int i10 = i9 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 41;
            b = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 4 % 2;
            }
            iHashCode5 = 0;
        } else {
            iHashCode5 = str14.hashCode();
        }
        String str15 = this.namaBank;
        int iHashCode16 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.alamatDomisi;
        int iHashCode17 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.tempatLahir;
        int iHashCode18 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.jenisKelamin;
        if (str18 == null) {
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            b = i14 % 128;
            int i15 = i14 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = str18.hashCode();
        }
        String str19 = this.kodeTk;
        int iHashCode19 = (((((((((((((((((((((((((((((((((((iHashCode7 * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode2) * 31) + iHashCode11) * 31) + iHashCode3) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode4) * 31) + iHashCode15) * 31) + iHashCode5) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode6) * 31) + (str19 != null ? str19.hashCode() : 0);
        int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        b = i16 % 128;
        int i17 = i16 % 2;
        return iHashCode19;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.namaTk;
        String str2 = this.kpj;
        String str3 = this.nomorRekening;
        String str4 = this.kodeBank;
        String str5 = this.namaPerusahaan;
        String str6 = this.npwp;
        String str7 = this.kodeKantor;
        String str8 = this.namaIbuKandung;
        String str9 = this.kodeSegmen;
        String str10 = this.kodeKepesertaan;
        String str11 = this.npp;
        String str12 = this.nik;
        String str13 = this.tglLahir;
        String str14 = this.namaRekening;
        String str15 = this.namaBank;
        String str16 = this.alamatDomisi;
        String str17 = this.tempatLahir;
        String str18 = this.jenisKelamin;
        String str19 = this.kodeTk;
        StringBuilder sb = new StringBuilder("EmployeeItem(namaTk=");
        sb.append(str);
        sb.append(", kpj=");
        sb.append(str2);
        sb.append(", nomorRekening=");
        sb.append(str3);
        sb.append(", kodeBank=");
        sb.append(str4);
        sb.append(", namaPerusahaan=");
        sb.append(str5);
        sb.append(", npwp=");
        sb.append(str6);
        sb.append(", kodeKantor=");
        sb.append(str7);
        sb.append(", namaIbuKandung=");
        sb.append(str8);
        sb.append(", kodeSegmen=");
        sb.append(str9);
        sb.append(", kodeKepesertaan=");
        sb.append(str10);
        sb.append(", npp=");
        sb.append(str11);
        sb.append(", nik=");
        sb.append(str12);
        sb.append(", tglLahir=");
        sb.append(str13);
        sb.append(", namaRekening=");
        sb.append(str14);
        sb.append(", namaBank=");
        sb.append(str15);
        sb.append(", alamatDomisi=");
        sb.append(str16);
        sb.append(", tempatLahir=");
        sb.append(str17);
        sb.append(", jenisKelamin=");
        sb.append(str18);
        sb.append(", kodeTk=");
        sb.append(str19);
        sb.append(")");
        String string = sb.toString();
        int i2 = b + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 20 / 0;
        }
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        int i = 2 % 2;
        int i2 = b + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.namaTk);
        p0.writeString(this.kpj);
        p0.writeString(this.nomorRekening);
        p0.writeString(this.kodeBank);
        p0.writeString(this.namaPerusahaan);
        p0.writeString(this.npwp);
        p0.writeString(this.kodeKantor);
        p0.writeString(this.namaIbuKandung);
        p0.writeString(this.kodeSegmen);
        p0.writeString(this.kodeKepesertaan);
        p0.writeString(this.npp);
        p0.writeString(this.nik);
        p0.writeString(this.tglLahir);
        p0.writeString(this.namaRekening);
        p0.writeString(this.namaBank);
        p0.writeString(this.alamatDomisi);
        p0.writeString(this.tempatLahir);
        p0.writeString(this.jenisKelamin);
        p0.writeString(this.kodeTk);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentbindingInflater1 = -4308073980952680577L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, int r7, byte r8) {
        /*
            byte[] r0 = com.bpjstku.data.asik.model.response.EmployeeItem.$$c
            int r6 = r6 * 2
            int r6 = 107 - r6
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2d:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.asik.model.response.EmployeeItem.$$e(short, int, byte):java.lang.String");
    }
}
