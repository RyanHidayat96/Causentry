package com.bpjstku.data.scholarship.model.response;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.gson.annotations.SerializedName;
import com.google.mlkit.common.MlKitException;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\bQ\b\u0087\b\u0018\u00002\u00020\u0001B§\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001fJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001fJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001fJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001fJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001fJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u001fJ\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\u001fJ\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\u001fJ\u0012\u00102\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010\u001fJ\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010\u001fJ\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010\u001fJ\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010\u001fJ°\u0002\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010;\u001a\u00020:2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b?\u0010\u001fR$\u0010@\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010\u001f\"\u0004\bC\u0010DR$\u0010E\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u0010A\u001a\u0004\bF\u0010\u001f\"\u0004\bG\u0010DR$\u0010H\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010A\u001a\u0004\bI\u0010\u001f\"\u0004\bJ\u0010DR$\u0010K\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010A\u001a\u0004\bL\u0010\u001f\"\u0004\bM\u0010DR$\u0010N\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010A\u001a\u0004\bO\u0010\u001f\"\u0004\bP\u0010DR$\u0010Q\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u0010A\u001a\u0004\bR\u0010\u001f\"\u0004\bS\u0010DR$\u0010T\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010A\u001a\u0004\bU\u0010\u001f\"\u0004\bV\u0010DR$\u0010W\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bW\u0010A\u001a\u0004\bX\u0010\u001f\"\u0004\bY\u0010DR$\u0010Z\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bZ\u0010A\u001a\u0004\b[\u0010\u001f\"\u0004\b\\\u0010DR$\u0010]\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b]\u0010A\u001a\u0004\b^\u0010\u001f\"\u0004\b_\u0010DR$\u0010`\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b`\u0010A\u001a\u0004\ba\u0010\u001f\"\u0004\bb\u0010DR$\u0010c\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bc\u0010A\u001a\u0004\bd\u0010\u001f\"\u0004\be\u0010DR$\u0010f\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bf\u0010A\u001a\u0004\bg\u0010\u001f\"\u0004\bh\u0010DR$\u0010i\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bi\u0010A\u001a\u0004\bj\u0010\u001f\"\u0004\bk\u0010DR$\u0010l\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bl\u0010A\u001a\u0004\bm\u0010\u001f\"\u0004\bn\u0010DR$\u0010o\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bo\u0010A\u001a\u0004\bp\u0010\u001f\"\u0004\bq\u0010DR$\u0010r\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\br\u0010A\u001a\u0004\bs\u0010\u001f\"\u0004\bt\u0010DR$\u0010u\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bu\u0010A\u001a\u0004\bv\u0010\u001f\"\u0004\bw\u0010DR$\u0010x\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bx\u0010A\u001a\u0004\by\u0010\u001f\"\u0004\bz\u0010DR$\u0010{\u001a\u0004\u0018\u00010\u00168\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b{\u0010|\u001a\u0004\b}\u00103\"\u0004\b~\u0010\u007fR(\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010A\u001a\u0005\b\u0081\u0001\u0010\u001f\"\u0005\b\u0082\u0001\u0010DR(\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010A\u001a\u0005\b\u0084\u0001\u0010\u001f\"\u0005\b\u0085\u0001\u0010DR(\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010A\u001a\u0005\b\u0087\u0001\u0010\u001f\"\u0005\b\u0088\u0001\u0010DR(\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010A\u001a\u0005\b\u008a\u0001\u0010\u001f\"\u0005\b\u008b\u0001\u0010D"}, d2 = {"Lcom/bpjstku/data/scholarship/model/response/ScholarshipBenefitPerson;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "", "p19", "p20", "p21", "p22", "p23", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "()Ljava/lang/Integer;", "component21", "component22", "component23", "component24", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/scholarship/model/response/ScholarshipBenefitPerson;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "kodeKlaim", "Ljava/lang/String;", "getKodeKlaim", "setKodeKlaim", "(Ljava/lang/String;)V", "kodeKlaimAkhir", "getKodeKlaimAkhir", "setKodeKlaimAkhir", "noUrut", "getNoUrut", "setNoUrut", "nikPeserta", "getNikPeserta", "setNikPeserta", "namaPeserta", "getNamaPeserta", "setNamaPeserta", "kpjPeserta", "getKpjPeserta", "setKpjPeserta", "nikPenerima", "getNikPenerima", "setNikPenerima", "namaPenerima", "getNamaPenerima", "setNamaPenerima", "tglLahir", "getTglLahir", "setTglLahir", "jenisKelamin", "getJenisKelamin", "setJenisKelamin", "alamat", "getAlamat", "setAlamat", "email", "getEmail", "setEmail", "handphone", "getHandphone", "setHandphone", "namaOrtuWali", "getNamaOrtuWali", "setNamaOrtuWali", "kodeKantor", "getKodeKantor", "setKodeKantor", "kodeManfaat", "getKodeManfaat", "setKodeManfaat", "tempatLahir", "getTempatLahir", "setTempatLahir", "namaHubungan", "getNamaHubungan", "setNamaHubungan", "jenjangPendidikan", "getJenjangPendidikan", "setJenjangPendidikan", "jumlahPenerima", "Ljava/lang/Integer;", "getJumlahPenerima", "setJumlahPenerima", "(Ljava/lang/Integer;)V", "kodeBankPenerima", "getKodeBankPenerima", "setKodeBankPenerima", "bankPenerima", "getBankPenerima", "setBankPenerima", "noRekeningPenerima", "getNoRekeningPenerima", "setNoRekeningPenerima", "namaRekeningPenerima", "getNamaRekeningPenerima", "setNamaRekeningPenerima"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipBenefitPerson {
    public static final int $stable = 8;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char b;

    @SerializedName("alamat")
    private String alamat;

    @SerializedName("bankPenerima")
    private String bankPenerima;

    @SerializedName("email")
    private String email;

    @SerializedName("handphone")
    private String handphone;

    @SerializedName("jenisKelamin")
    private String jenisKelamin;

    @SerializedName("jenjangPendidikan")
    private String jenjangPendidikan;

    @SerializedName("jumlahPenerima")
    private Integer jumlahPenerima;

    @SerializedName("kodeBankPenerima")
    private String kodeBankPenerima;

    @SerializedName("kodeKantor")
    private String kodeKantor;

    @SerializedName("kodeKlaimPertama")
    private String kodeKlaim;

    @SerializedName("kodeKlaimAkhir")
    private String kodeKlaimAkhir;

    @SerializedName("kodeManfaat")
    private String kodeManfaat;

    @SerializedName("kpjPeserta")
    private String kpjPeserta;

    @SerializedName("namaHubungan")
    private String namaHubungan;

    @SerializedName("namaOrtuWali")
    private String namaOrtuWali;

    @SerializedName("namaPenerimaBeasiswa")
    private String namaPenerima;

    @SerializedName("namaPeserta")
    private String namaPeserta;

    @SerializedName("namaRekeningPenerima")
    private String namaRekeningPenerima;

    @SerializedName("nikPenerimaBeasiswa")
    private String nikPenerima;

    @SerializedName("nikPeserta")
    private String nikPeserta;

    @SerializedName("noRekeningPenerima")
    private String noRekeningPenerima;

    @SerializedName("noUrut")
    private String noUrut;

    @SerializedName("tempatLahir")
    private String tempatLahir;

    @SerializedName("tanggalLahirPenerimaBeasiswa")
    private String tglLahir;
    private static final byte[] $$c = {119, -102, -34, -3};
    private static final int $$f = ModuleDescriptor.MODULE_VERSION;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {97, 58, 103, -72, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -60, 11, 7, -15, 1, 6, 16, -5, 11, -6, -3, 73, -73, 3, 16, -1, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 69, 8, 15, 6, -16, 18, 20, -27, 20, -10, -2, 16, -6, 0, 8, 15, -16, 14, -3, 4, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 21, -4, -2, 13, -2, -2, 10, 33, -34, 11, -3, 14, -16, 18, -10, 68};
    private static final int $$e = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
    private static final byte[] $$a = {43, 23, 22, -14, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 234;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f410a = 0;
    private static int d = 1;
    private static int asInterface = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.data.scholarship.model.response.ScholarshipBenefitPerson.$$a
            int r7 = 92 - r7
            int r8 = 53 - r8
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r7 = r7 + 1
            r3 = r0[r7]
        L26:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.scholarship.model.response.ScholarshipBenefitPerson.c(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 20
            int r7 = 122 - r7
            byte[] r1 = com.bpjstku.data.scholarship.model.response.ScholarshipBenefitPerson.$$d
            int r6 = r6 * 3
            int r6 = r6 + 84
            byte[] r0 = new byte[r0]
            int r8 = r8 + 19
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r3 + 1
            int r6 = r6 + 3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.scholarship.model.response.ScholarshipBenefitPerson.f(int, int, int, java.lang.Object[]):void");
    }

    public ScholarshipBenefitPerson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Integer num, String str20, String str21, String str22, String str23) {
        this.kodeKlaim = str;
        this.kodeKlaimAkhir = str2;
        this.noUrut = str3;
        this.nikPeserta = str4;
        this.namaPeserta = str5;
        this.kpjPeserta = str6;
        this.nikPenerima = str7;
        this.namaPenerima = str8;
        this.tglLahir = str9;
        this.jenisKelamin = str10;
        this.alamat = str11;
        this.email = str12;
        this.handphone = str13;
        this.namaOrtuWali = str14;
        this.kodeKantor = str15;
        this.kodeManfaat = str16;
        this.tempatLahir = str17;
        this.namaHubungan = str18;
        this.jenjangPendidikan = str19;
        this.jumlahPenerima = num;
        this.kodeBankPenerima = str20;
        this.bankPenerima = str21;
        this.noRekeningPenerima = str22;
        this.namaRekeningPenerima = str23;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ScholarshipBenefitPerson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Integer num, String str20, String str21, String str22, String str23, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        if ((i & 1) != 0) {
            int i2 = d + 13;
            f410a = i2 % 128;
            int i3 = i2 % 2;
            str24 = "";
        } else {
            str24 = str;
        }
        String str34 = (i & 2) != 0 ? "" : str2;
        String str35 = (i & 4) != 0 ? "" : str3;
        if ((i & 8) != 0) {
            int i4 = 2 % 2;
            str25 = "";
        } else {
            str25 = str4;
        }
        String str36 = (i & 16) != 0 ? "" : str5;
        if ((i & 32) != 0) {
            int i5 = d + 33;
            f410a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str26 = "";
        } else {
            str26 = str6;
        }
        String str37 = (i & 64) != 0 ? "" : str7;
        if ((i & 128) != 0) {
            int i8 = d + 113;
            f410a = i8 % 128;
            int i9 = i8 % 2;
            str27 = "";
        } else {
            str27 = str8;
        }
        Object obj = null;
        if ((i & 256) != 0) {
            int i10 = d + 101;
            f410a = i10 % 128;
            if (i10 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str28 = "";
        } else {
            str28 = str9;
        }
        String str38 = (i & 512) != 0 ? "" : str10;
        String str39 = (i & 1024) != 0 ? "" : str11;
        String str40 = (i & 2048) != 0 ? "" : str12;
        String str41 = (i & 4096) != 0 ? "" : str13;
        if ((i & 8192) != 0) {
            int i11 = 2 % 2;
            str29 = "";
        } else {
            str29 = str14;
        }
        String str42 = (i & 16384) != 0 ? "" : str15;
        String str43 = (i & 32768) != 0 ? "" : str16;
        String str44 = (i & 65536) != 0 ? "" : str17;
        String str45 = (i & 131072) != 0 ? "" : str18;
        if ((i & 262144) != 0) {
            int i12 = f410a + 73;
            d = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 67 / 0;
            }
            str30 = "";
        } else {
            str30 = str19;
        }
        Integer num2 = (524288 & i) != 0 ? null : num;
        if ((i & 1048576) != 0) {
            int i14 = f410a + 11;
            d = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 25 / 0;
            }
            int i16 = 2 % 2;
            str31 = "";
        } else {
            str31 = str20;
        }
        if ((2097152 & i) != 0) {
            int i17 = d + 41;
            f410a = i17 % 128;
            int i18 = i17 % 2;
            str32 = "";
        } else {
            str32 = str21;
        }
        String str46 = (4194304 & i) != 0 ? "" : str22;
        if ((i & 8388608) != 0) {
            int i19 = d + 55;
            f410a = i19 % 128;
            int i20 = i19 % 2;
            int i21 = 2 % 2;
            str33 = "";
        } else {
            str33 = str23;
        }
        this(str24, str34, str35, str25, str36, str26, str37, str27, str28, str38, str39, str40, str41, str29, str42, str43, str44, str45, str30, num2, str31, str32, str46, str33);
    }

    public final String getKodeKlaim() {
        int i = 2 % 2;
        int i2 = f410a + 107;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.kodeKlaim;
        int i5 = i3 + 75;
        f410a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setKodeKlaim(String str) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 79;
        f410a = i3 % 128;
        int i4 = i3 % 2;
        this.kodeKlaim = str;
        int i5 = i2 + 19;
        f410a = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getKodeKlaimAkhir() {
        int i = 2 % 2;
        int i2 = f410a + 3;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.kodeKlaimAkhir;
        int i5 = i3 + 47;
        f410a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setKodeKlaimAkhir(String str) {
        int i = 2 % 2;
        int i2 = f410a + 73;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        this.kodeKlaimAkhir = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 45;
        f410a = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getNoUrut() {
        int i = 2 % 2;
        int i2 = f410a + 71;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.noUrut;
        int i5 = i3 + 121;
        f410a = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setNoUrut(String str) {
        int i = 2 % 2;
        int i2 = d + 53;
        int i3 = i2 % 128;
        f410a = i3;
        int i4 = i2 % 2;
        this.noUrut = str;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 99;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getNikPeserta() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 103;
        f410a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.nikPeserta;
        int i5 = i2 + 13;
        f410a = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setNikPeserta(String str) {
        int i = 2 % 2;
        int i2 = f410a;
        int i3 = i2 + 15;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.nikPeserta = str;
        int i5 = i2 + 71;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
    }

    public final String getNamaPeserta() {
        int i = 2 % 2;
        int i2 = f410a + 71;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.namaPeserta;
        int i5 = i3 + 25;
        f410a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i3 = $10 + 55;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            int i5 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i6 = $11 + 49;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = 0;
            while (i9 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i5];
                int i10 = (c2 + i8) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i5] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', i5, i5) + 47774);
                        int iResolveSizeAndState = 468 - View.resolveSizeAndState(i5, i5, i5);
                        int absoluteGravity = 13 - Gravity.getAbsoluteGravity(i5, i5);
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iResolveSizeAndState, absoluteGravity, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i12 = i9;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 47773), 468 - KeyEvent.getDeadChar(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 14, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9 = i12 + 1;
                    i5 = 0;
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
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 2323, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    public final void setNamaPeserta(String str) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char mode = (char) (View.MeasureSpec.getMode(0) + 43042);
            int i2 = 3112 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int i3 = 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mode, i2, i3, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{16894, 18443, 22881, 15805, 3128, 17046, 33316, 31577, 51197, 56277, 12187, 9087, 35337, 19892, 26611, 4549, 29652, 19918, 8696, 45565, 15222, 12092, 32976, 28234}, 21 - ExpandableListView.getPackedPositionChild(0L), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{52105, 46283, 36381, 35400, 38431, 53238, 53055, 25066, 46902, 58820, 24957, 63961, 62831, 35096, 29877, 57188, 11250, 20047}, 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionType = (char) (43042 - ExpandableListView.getPackedPositionType(0L));
            int threadPriority = 3111 - ((Process.getThreadPriority(0) + 20) >> 6);
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 22;
            byte b4 = $$a[7];
            byte b5 = b4;
            Object[] objArr5 = new Object[1];
            c(b5, (byte) (b5 | 89), b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, threadPriority, scrollBarSize, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = f410a + 39;
            d = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (43043 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int i6 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3110;
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 23;
                byte b6 = $$a[7];
                Object[] objArr6 = new Object[1];
                c(b6, (byte) (b6 | 37), (byte) 15, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i6, iLastIndexOf, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr7[2])[0];
            int i8 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i8};
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = ~((-629616893) | iIdentityHashCode);
            int i10 = (-577100758) + ((629551320 | i9) * (-280)) + ((i9 | (~((-1075414567) | iIdentityHashCode))) * 140);
            int i11 = ~((-65573) | iIdentityHashCode);
            int i12 = ~iIdentityHashCode;
            int i13 = (i10 + (((~(i12 | (-1075348995))) | (i11 | (~((-629551321) | i12)))) * 140)) - 628990065;
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr[0])[0] = i15 ^ (i15 << 5);
            objArr = new Object[]{new int[1], iArr, new int[]{i7}, strArr};
        } else {
            int length = str != null ? str.length() : 0;
            int i16 = f410a + 37;
            d = i16 % 128;
            int i17 = i16 % 2;
            try {
                Object[] objArr8 = {null, Integer.valueOf(length), 0, -628990065};
                byte[] bArr = $$d;
                Object[] objArr9 = new Object[1];
                f(bArr[10], (byte) (bArr[66] - 1), bArr[115], objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                byte b7 = bArr[115];
                Object[] objArr10 = new Object[1];
                f(b7, b7, bArr[29], objArr10);
                Object[] objArr11 = (Object[]) cls2.getMethod((String) objArr10[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43042);
                    int i18 = 3111 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 22;
                    byte b8 = $$a[7];
                    Object[] objArr12 = new Object[1];
                    c(b8, (byte) (b8 | 37), (byte) 15, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, i18, fadingEdgeLength, 154975793, false, (String) objArr12[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr11);
                try {
                    Object[] objArr13 = new Object[1];
                    e(new char[]{16894, 18443, 22881, 15805, 3128, 17046, 33316, 31577, 51197, 56277, 12187, 9087, 35337, 19892, 26611, 4549, 29652, 19918, 8696, 45565, 15222, 12092, 32976, 28234}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22, objArr13);
                    Class<?> cls3 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    e(new char[]{52105, 46283, 36381, 35400, 38431, 53238, 53055, 25066, 46902, 58820, 24957, 63961, 62831, 35096, 29877, 57188, 11250, 20047}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, objArr14);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 43042);
                        int iLastIndexOf2 = 3110 - TextUtils.lastIndexOf("", '0', 0);
                        int doubleTapTimeout = 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr15 = new Object[1];
                        c(b10, (byte) (b10 | 89), b9, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSizeAndState, iLastIndexOf2, doubleTapTimeout, -1269618118, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char trimmedLength = (char) (43042 - TextUtils.getTrimmedLength(""));
                        int i19 = 3112 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int i20 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22;
                        byte b11 = $$a[7];
                        byte b12 = b11;
                        Object[] objArr16 = new Object[1];
                        c(b11, b12, b12, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(trimmedLength, i19, i20, -1272852037, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr11;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i21 = ((int[]) objArr[1])[0];
        int i22 = ((int[]) objArr[2])[0];
        if (i22 == i21) {
            int i23 = ((int[]) objArr[0])[0];
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int iNextInt = new Random().nextInt();
            int i26 = i23 + 1567774270 + (((~(iNextInt | 545531133)) | (-1159500326)) * (-668)) + ((545531133 | (~((-1159500326) | iNextInt))) * 1336) + ((iNextInt | (-1159238145)) * 668);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr[0])[0] = i28 ^ (i28 << 5);
            Object[] objArr17 = {new int[1], new int[]{i25}, new int[]{i24}, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str2 : strArr3) {
                    int i29 = f410a + 99;
                    d = i29 % 128;
                    int i30 = i29 % 2;
                    arrayList.add(str2);
                }
            }
            int[] iArr2 = new int[i22];
            int i31 = i22 - 1;
            iArr2[i31] = 1;
            Toast.makeText((Context) null, iArr2[((i22 * i31) % 2) - 1], 1).show();
            int i32 = ((int[]) objArr[0])[0];
            int i33 = ((int[]) objArr[2])[0];
            int i34 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int iNextInt2 = new Random().nextInt();
            int i35 = i32 + (((~((-68952083) | iNextInt2)) * 521) - 1327552512) + (((~((~iNextInt2) | (-68952083))) | 1346541184) * 521);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr[0])[0] = i37 ^ (i37 << 5);
            Object[] objArr18 = {new int[1], new int[]{i34}, new int[]{i33}, strArr4};
        }
        this.namaPeserta = str;
    }

    public final String getKpjPeserta() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 43;
        f410a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.kpjPeserta;
        int i5 = i2 + 37;
        f410a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return str;
    }

    public final void setKpjPeserta(String str) {
        int i = 2 % 2;
        int i2 = f410a + 85;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        this.kpjPeserta = str;
        int i5 = i3 + 33;
        f410a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final String getNikPenerima() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 75;
        f410a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.nikPenerima;
        int i5 = i2 + 7;
        f410a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setNikPenerima(String str) {
        int i = 2 % 2;
        int i2 = f410a;
        int i3 = i2 + 119;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.nikPenerima = str;
        int i5 = i2 + 17;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getNamaPenerima() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 105;
        f410a = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.namaPenerima;
        int i4 = i2 + 27;
        f410a = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setNamaPenerima(String str) {
        int i = 2 % 2;
        int i2 = d + 45;
        f410a = i2 % 128;
        int i3 = i2 % 2;
        this.namaPenerima = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTglLahir() {
        int i = 2 % 2;
        int i2 = d + 3;
        f410a = i2 % 128;
        int i3 = i2 % 2;
        String str = this.tglLahir;
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        return str;
    }

    public final void setTglLahir(String str) {
        int i = 2 % 2;
        int i2 = f410a;
        int i3 = i2 + 113;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.tglLahir = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 71;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getJenisKelamin() {
        int i = 2 % 2;
        int i2 = f410a + 25;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.jenisKelamin;
        }
        throw null;
    }

    public final void setJenisKelamin(String str) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 19;
        f410a = i3 % 128;
        int i4 = i3 % 2;
        this.jenisKelamin = str;
        int i5 = i2 + 47;
        f410a = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getAlamat() {
        int i = 2 % 2;
        int i2 = f410a + 15;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.alamat;
        }
        throw null;
    }

    public final void setAlamat(String str) {
        int i = 2 % 2;
        int i2 = f410a + 85;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.alamat = str;
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = d + 39;
        int i3 = i2 % 128;
        f410a = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.email;
        int i4 = i3 + 25;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final void setEmail(String str) {
        int i = 2 % 2;
        int i2 = d + 115;
        f410a = i2 % 128;
        int i3 = i2 % 2;
        this.email = str;
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
    }

    public final String getHandphone() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = d + 125;
        f410a = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 46400), 40 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 19 - KeyEvent.normalizeMetaState(0), 1513912262, false, "b", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 37836), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 58, (ViewConfiguration.getFadingEdgeLength() >> 16) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - (ViewConfiguration.getScrollBarSize() >> 8)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 58, ImageFormat.getBitsPerPixel(0) + 19, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long jNextInt = new Random().nextInt(1836541798);
        long j2 = 50;
        long j3 = -1;
        long j4 = j3 ^ 3306787034568200785L;
        long j5 = jNextInt ^ j3;
        long j6 = j4 | j5;
        long j7 = (((long) 51) * 2212466462591585454L) + (((long) (-49)) * 3306787034568200785L) + (((long) (-50)) * (jNextInt | 2212466462591585454L)) + ((((((j3 ^ 2212466462591585454L) | j4) | jNextInt) ^ j3) | ((j6 | 2212466462591585454L) ^ j3)) * j2) + (j2 * ((j6 ^ j3) | ((j4 | 2212466462591585454L) ^ j3) | (j3 ^ (j5 | 2212466462591585454L))));
        int i7 = 0;
        while (true) {
            for (int i8 = 0; i8 != 8; i8++) {
                i6 = (((((int) (j >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
            }
            if (i7 != 0) {
                break;
            }
            int i9 = f410a + 23;
            d = i9 % 128;
            i7 = i9 % 2 == 0 ? i7 + 64 : i7 + 1;
            j = j7;
        }
        if (i6 != i4) {
            int i10 = f410a + 83;
            d = i10 % 128;
            if (i10 % 2 == 0) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 46400), 41 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 18, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                Toast.makeText((Context) null, i5 >>> ((i5 % (i5 >>> 1)) / 5), 0).show();
            } else {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (46400 - TextUtils.getCapsMode("", 0, 0)), 39 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 20, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null);
                Toast.makeText((Context) null, i5 / (((i5 - 1) * i5) % 2), 0).show();
            }
        }
        String str = this.handphone;
        int i11 = d + 79;
        f410a = i11 % 128;
        int i12 = i11 % 2;
        return str;
    }

    public final void setHandphone(String str) {
        int i = 2 % 2;
        int i2 = f410a + 85;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.handphone = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public final String getNamaOrtuWali() {
        int i = 2 % 2;
        int i2 = f410a + 121;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.namaOrtuWali;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setNamaOrtuWali(String str) {
        int i = 2 % 2;
        int i2 = f410a + 51;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        this.namaOrtuWali = str;
        if (i4 == 0) {
            int i5 = 99 / 0;
        }
        int i6 = i3 + 35;
        f410a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 89 / 0;
        }
    }

    public final String getKodeKantor() {
        int i = 2 % 2;
        int i2 = f410a;
        int i3 = i2 + 99;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.kodeKantor;
        int i4 = i2 + 59;
        d = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setKodeKantor(String str) {
        int i = 2 % 2;
        int i2 = f410a + 69;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.kodeKantor = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getKodeManfaat() {
        int i = 2 % 2;
        int i2 = f410a + 15;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.kodeManfaat;
        int i5 = i3 + 65;
        f410a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 25 / 0;
        }
        return str;
    }

    public final void setKodeManfaat(String str) {
        int i = 2 % 2;
        int i2 = d + 95;
        f410a = i2 % 128;
        int i3 = i2 % 2;
        this.kodeManfaat = str;
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
    }

    public final String getTempatLahir() {
        int i = 2 % 2;
        int i2 = f410a;
        int i3 = i2 + 55;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tempatLahir;
        int i5 = i2 + 115;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTempatLahir(String str) {
        int i = 2 % 2;
        int i2 = d + 109;
        int i3 = i2 % 128;
        f410a = i3;
        int i4 = i2 % 2;
        this.tempatLahir = str;
        int i5 = i3 + 51;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getNamaHubungan() {
        int i = 2 % 2;
        int i2 = f410a + 121;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.namaHubungan;
        }
        throw null;
    }

    public final void setNamaHubungan(String str) {
        int i = 2 % 2;
        int i2 = d + 7;
        int i3 = i2 % 128;
        f410a = i3;
        int i4 = i2 % 2;
        this.namaHubungan = str;
        int i5 = i3 + 29;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getJenjangPendidikan() {
        int i = 2 % 2;
        int i2 = f410a + 83;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.jenjangPendidikan;
        int i5 = i3 + 21;
        f410a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setJenjangPendidikan(String str) {
        int i = 2 % 2;
        int i2 = f410a + 63;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        this.jenjangPendidikan = str;
        int i5 = i3 + 113;
        f410a = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Integer getJumlahPenerima() {
        int i = 2 % 2;
        int i2 = f410a + 103;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.jumlahPenerima;
        }
        throw null;
    }

    public final void setJumlahPenerima(Integer num) {
        int i = 2 % 2;
        int i2 = f410a + 15;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.jumlahPenerima = num;
        if (i3 == 0) {
            throw null;
        }
    }

    public final String getKodeBankPenerima() {
        int i = 2 % 2;
        int i2 = d + 15;
        int i3 = i2 % 128;
        f410a = i3;
        int i4 = i2 % 2;
        String str = this.kodeBankPenerima;
        int i5 = i3 + 65;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setKodeBankPenerima(String str) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 65;
        f410a = i3 % 128;
        int i4 = i3 % 2;
        this.kodeBankPenerima = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 37;
        f410a = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getBankPenerima() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
            int bitsPerPixel = 920 - ImageFormat.getBitsPerPixel(0);
            int maxKeyCode = 28 - (KeyEvent.getMaxKeyCode() >> 16);
            byte b2 = $$a[5];
            Object[] objArr2 = new Object[1];
            c(b2, (byte) (b2 | 88), (byte) 52, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, bitsPerPixel, maxKeyCode, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{16894, 18443, 22881, 15805, 3128, 17046, 33316, 31577, 51197, 56277, 12187, 9087, 35337, 19892, 26611, 4549, 29652, 19918, 8696, 45565, 15222, 12092, 32976, 28234}, MotionEvent.axisFromString("") + 23, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{52105, 46283, 36381, 35400, 38431, 53238, 53055, 25066, 46902, 58820, 24957, 63961, 62831, 35096, 29877, 57188, 11250, 20047}, Color.blue(0) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (31534 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 922;
            int deadChar = KeyEvent.getDeadChar(0, 0) + 28;
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            c(b4, (byte) (b4 | 89), b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iLastIndexOf, deadChar, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = f410a + 107;
            d = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cGreen = (char) (31533 - Color.green(0));
                int jumpTapTimeout = 921 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 28;
                byte b5 = $$a[7];
                Object[] objArr6 = new Object[1];
                c(b5, (byte) (b5 | 37), (byte) 15, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen, jumpTapTimeout, iMakeMeasureSpec, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iNextInt = new Random().nextInt(686927814);
            int i4 = ~iNextInt;
            int i5 = (((3284954 + (((~((-786974594) | i4)) | 987105050) * (-90))) + (((~((-786974594) | iNextInt)) | (-1056851868)) * (-45))) + ((((~(iNextInt | (-987105051))) | (-786974594)) | (~(i4 | 987105050))) * 45)) - 648550873;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
            int i8 = f410a + 91;
            d = i8 % 128;
            int i9 = i8 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{4358, 64908, 30777, 64655, 33214, 50789, 2753, 12618, 32199, 38097, 64343, 51770, 29835, 29579, 49732, 3062, 36803, 47318, 46145, 51945, 31034, 15852, 32688, 43440, 18123, 34129, 34580, 22156}, 26 - View.getDefaultSize(0, 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{28036, 44022, 27703, 56897, 16543, 26161, 16063, 32984, 3967, 19202, 47755, 6456, 50000, 65510, 52446, 41359, 54293, 26187, 23105, 24777}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{65343, 29222, 31712, 12719, 42099, 19980, 7468, 12831, 57975, 35214, 24832, 42568, 4019, 54191, 56585, 38002, 30286, 7886}, TextUtils.getOffsetBefore("", 0) + 16, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{16272, 34014, 19369, 5092, 6859, 24425, 5261, 50263, 17521, 31296, 34230, 27483, 50753, 51329, 4709, 16111, 40736, 31122}, (ViewConfiguration.getTouchSlop() >> 8) + 16, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -648550873};
                byte[] bArr = $$d;
                Object[] objArr13 = new Object[1];
                f(bArr[5], (byte) 118, (byte) 28, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr[115];
                Object[] objArr14 = new Object[1];
                f(b6, (byte) (b6 | 71), bArr[57], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 31533);
                    int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 921;
                    int iArgb = Color.argb(0, 0, 0, 0) + 28;
                    byte b7 = $$a[7];
                    Object[] objArr15 = new Object[1];
                    c(b7, (byte) (b7 | 37), (byte) 15, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(absoluteGravity, maxKeyCode2, iArgb, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    e(new char[]{16894, 18443, 22881, 15805, 3128, 17046, 33316, 31577, 51197, 56277, 12187, 9087, 35337, 19892, 26611, 4549, 29652, 19918, 8696, 45565, 15222, 12092, 32976, 28234}, 22 - View.getDefaultSize(0, 0), objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(new char[]{52105, 46283, 36381, 35400, 38431, 53238, 53055, 25066, 46902, 58820, 24957, 63961, 62831, 35096, 29877, 57188, 11250, 20047}, 14 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char threadPriority = (char) (31533 - ((Process.getThreadPriority(0) + 20) >> 6));
                        int i10 = 921 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int i11 = 29 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr18 = new Object[1];
                        c(b9, (byte) (b9 | 89), b8, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(threadPriority, i10, i11, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 31534);
                        int i12 = 921 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int iIndexOf = 27 - TextUtils.indexOf((CharSequence) "", '0');
                        byte b10 = $$a[5];
                        Object[] objArr19 = new Object[1];
                        c(b10, (byte) (b10 | 88), (byte) 52, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAxisFromString, i12, iIndexOf, -1048449946, false, (String) objArr19[0], null);
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i16 = (int) Runtime.getRuntime().totalMemory();
            int i17 = i15 + 1958077146 + ((~((~i16) | (-305397779))) * 433) + (((~((-768223174) | i16)) | (-1005856471)) * (-433)) + (((~(i16 | (-1005856471))) | (-1073620952)) * 433);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr20[0])[0] = i19 ^ (i19 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i20 = 0;
                while (i20 < strArr.length) {
                    int i21 = d + 103;
                    f410a = i21 % 128;
                    if (i21 % 2 != 0) {
                        arrayList.add(strArr[i20]);
                        i20 += 6;
                    } else {
                        arrayList.add(strArr[i20]);
                        i20++;
                    }
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            int i22 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i23 = (~((-178424736) | iFreeMemory)) | 167936668;
            int i24 = i22 + (-1996094901) + (i23 * 992) + ((i23 | (~((~iFreeMemory) | 1606142975))) * (-496)) + ((iFreeMemory | 1595654908) * 496);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr21[0])[0] = i26 ^ (i26 << 5);
        }
        return this.bankPenerima;
    }

    public final void setBankPenerima(String str) throws Throwable {
        int i;
        int i2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = d + 45;
        f410a = i6 % 128;
        int i7 = i6 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46399 - TextUtils.indexOf((CharSequence) "", '0', 0)), 41 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i8 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        e(new char[]{16894, 18443, 22881, 15805, 3128, 17046, 33316, 31577, 51197, 56277, 12187, 9087, 35337, 19892, 26611, 4549, 29652, 19918, 8696, 45565, 15222, 12092, 32976, 28234}, 21 - Process.getGidForName(""), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        e(new char[]{52105, 46283, 36381, 35400, 38431, 53238, 53055, 25066, 46902, 58820, 24957, 63961, 62831, 35096, 29877, 57188, 11250, 20047}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 15, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = 464;
        long j2 = -1;
        long j3 = j2 ^ 1196735345125549656L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j4 = jIdentityHashCode ^ j2;
        long j5 = (j3 | 900521829616409331L) ^ j2;
        long j6 = (((long) 465) * 900521829616409331L) + (((long) (-463)) * 1196735345125549656L) + ((((j3 | j4) ^ j2) | j5 | ((j4 | 900521829616409331L) ^ j2)) * j) + (((long) (-464)) * (jIdentityHashCode | (j2 ^ 900521829616409331L) | j3)) + (j * (j5 | (j2 ^ (jIdentityHashCode | 900521829616409331L))));
        long j7 = jLongValue;
        int i9 = 0;
        while (true) {
            if (i9 == 10) {
                int length = str != null ? str.length() : 0;
                try {
                    Object[] objArr3 = {513683807};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 46037), (ViewConfiguration.getScrollBarSize() >> 8) + 1134, 18 - (ViewConfiguration.getWindowTouchSlop() >> 8), 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr4 = {Integer.valueOf(length), 0, -1643938754, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr3), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                        int keyRepeatTimeout = 1031 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int deadChar = 15 - KeyEvent.getDeadChar(0, 0);
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr5 = new Object[1];
                        c(b2, b3, b3, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel, keyRepeatTimeout, deadChar, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 45993), 1117 - (Process.myTid() >> 22), 17 - ExpandableListView.getPackedPositionType(0L)), Boolean.TYPE});
                    }
                    Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    if (((int[]) objArr6[3])[0] == ((int[]) objArr6[1])[0]) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr6[0];
                    if (strArr != null) {
                        int i10 = 0;
                        while (i10 < strArr.length) {
                            int i11 = f410a + 77;
                            d = i11 % 128;
                            if (i11 % 2 == 0) {
                                arrayList.add(strArr[i10]);
                                i10 += 85;
                            } else {
                                arrayList.add(strArr[i10]);
                                i10++;
                            }
                        }
                    }
                    throw null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i12 = d + 117;
            f410a = i12 % 128;
            if (i12 % i4 != 0) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 37836), 59 - (ViewConfiguration.getTapTimeout() >> 16), 18 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
                i2 = 1;
            } else {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (37835 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 58, (ViewConfiguration.getTouchSlop() >> 8) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).getInt(null);
                i2 = 0;
            }
            while (true) {
                int i13 = 0;
                while (i13 != 8) {
                    i = (((((int) (j7 >> i13)) & 255) + (i << 6)) + (i << 16)) - i;
                    i13++;
                    i8 = i8;
                }
                i3 = i8;
                if (i2 != 0) {
                    break;
                }
                int i14 = f410a + 21;
                d = i14 % 128;
                int i15 = i14 % 2;
                i2++;
                j7 = j6;
                i8 = i3;
            }
            if (i == i3) {
                break;
            }
            int i16 = d + 87;
            f410a = i16 % 128;
            if (i16 % 2 != 0) {
                j7 *= 1024;
                i9 += 38;
            } else {
                j7 -= 1024;
                i9++;
            }
            i8 = i3;
            i4 = 2;
        }
        this.bankPenerima = str;
    }

    public final String getNoRekeningPenerima() {
        int i = 2 % 2;
        int i2 = f410a;
        int i3 = i2 + 121;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.noRekeningPenerima;
        int i5 = i2 + 83;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setNoRekeningPenerima(String str) {
        int i = 2 % 2;
        int i2 = d + 27;
        int i3 = i2 % 128;
        f410a = i3;
        int i4 = i2 % 2;
        this.noRekeningPenerima = str;
        int i5 = i3 + 101;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 45 / 0;
        }
    }

    public final String getNamaRekeningPenerima() {
        String str;
        int i = 2 % 2;
        int i2 = f410a + 109;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            str = this.namaRekeningPenerima;
            int i4 = 78 / 0;
        } else {
            str = this.namaRekeningPenerima;
        }
        int i5 = i3 + 49;
        f410a = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setNamaRekeningPenerima(String str) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 59;
        f410a = i3 % 128;
        int i4 = i3 % 2;
        this.namaRekeningPenerima = str;
        int i5 = i2 + 117;
        f410a = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = asInterface + 25;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public ScholarshipBenefitPerson() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ViewCompat.MEASURED_SIZE_MASK, null);
    }

    public static /* synthetic */ ScholarshipBenefitPerson copy$default(ScholarshipBenefitPerson scholarshipBenefitPerson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Integer num, String str20, String str21, String str22, String str23, int i, Object obj) {
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        Integer num2;
        String str33;
        String str34;
        String str35;
        int i2 = 2 % 2;
        String str36 = (i & 1) != 0 ? scholarshipBenefitPerson.kodeKlaim : str;
        String str37 = (i & 2) != 0 ? scholarshipBenefitPerson.kodeKlaimAkhir : str2;
        if ((i & 4) != 0) {
            int i3 = f410a + 115;
            d = i3 % 128;
            if (i3 % 2 == 0) {
                String str38 = scholarshipBenefitPerson.noUrut;
                throw null;
            }
            str24 = scholarshipBenefitPerson.noUrut;
        } else {
            str24 = str3;
        }
        if ((i & 8) != 0) {
            int i4 = f410a + 67;
            d = i4 % 128;
            int i5 = i4 % 2;
            str25 = scholarshipBenefitPerson.nikPeserta;
        } else {
            str25 = str4;
        }
        String str39 = (i & 16) != 0 ? scholarshipBenefitPerson.namaPeserta : str5;
        String str40 = (i & 32) != 0 ? scholarshipBenefitPerson.kpjPeserta : str6;
        String str41 = (i & 64) != 0 ? scholarshipBenefitPerson.nikPenerima : str7;
        if ((i & 128) != 0) {
            str26 = scholarshipBenefitPerson.namaPenerima;
            int i6 = d + 25;
            f410a = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str26 = str8;
        }
        String str42 = (i & 256) != 0 ? scholarshipBenefitPerson.tglLahir : str9;
        String str43 = (i & 512) != 0 ? scholarshipBenefitPerson.jenisKelamin : str10;
        String str44 = (i & 1024) != 0 ? scholarshipBenefitPerson.alamat : str11;
        if ((i & 2048) != 0) {
            int i8 = d + 43;
            f410a = i8 % 128;
            int i9 = i8 % 2;
            str27 = scholarshipBenefitPerson.email;
            if (i9 != 0) {
                int i10 = 37 / 0;
            }
        } else {
            str27 = str12;
        }
        if ((i & 4096) != 0) {
            int i11 = f410a + 121;
            d = i11 % 128;
            int i12 = i11 % 2;
            str28 = scholarshipBenefitPerson.handphone;
        } else {
            str28 = str13;
        }
        String str45 = (i & 8192) != 0 ? scholarshipBenefitPerson.namaOrtuWali : str14;
        if ((i & 16384) != 0) {
            int i13 = f410a + 39;
            d = i13 % 128;
            if (i13 % 2 == 0) {
                String str46 = scholarshipBenefitPerson.kodeKantor;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str29 = scholarshipBenefitPerson.kodeKantor;
        } else {
            str29 = str15;
        }
        if ((32768 & i) != 0) {
            int i14 = f410a + 105;
            str30 = str29;
            d = i14 % 128;
            int i15 = i14 % 2;
            str31 = scholarshipBenefitPerson.kodeManfaat;
            if (i15 == 0) {
                int i16 = 41 / 0;
            }
        } else {
            str30 = str29;
            str31 = str16;
        }
        String str47 = (65536 & i) != 0 ? scholarshipBenefitPerson.tempatLahir : str17;
        String str48 = (i & 131072) != 0 ? scholarshipBenefitPerson.namaHubungan : str18;
        String str49 = (i & 262144) != 0 ? scholarshipBenefitPerson.jenjangPendidikan : str19;
        Integer num3 = (i & 524288) != 0 ? scholarshipBenefitPerson.jumlahPenerima : num;
        if ((i & 1048576) != 0) {
            num2 = num3;
            int i17 = d + 41;
            str32 = str31;
            f410a = i17 % 128;
            int i18 = i17 % 2;
            str33 = scholarshipBenefitPerson.kodeBankPenerima;
            if (i18 != 0) {
                int i19 = 70 / 0;
            }
        } else {
            str32 = str31;
            num2 = num3;
            str33 = str20;
        }
        String str50 = (2097152 & i) != 0 ? scholarshipBenefitPerson.bankPenerima : str21;
        if ((i & 4194304) != 0) {
            int i20 = d + 79;
            f410a = i20 % 128;
            int i21 = i20 % 2;
            str34 = scholarshipBenefitPerson.noRekeningPenerima;
        } else {
            str34 = str22;
        }
        if ((i & 8388608) != 0) {
            int i22 = f410a + 109;
            d = i22 % 128;
            int i23 = i22 % 2;
            str35 = scholarshipBenefitPerson.namaRekeningPenerima;
        } else {
            str35 = str23;
        }
        return scholarshipBenefitPerson.copy(str36, str37, str24, str25, str39, str40, str41, str26, str42, str43, str44, str27, str28, str45, str30, str32, str47, str48, str49, num2, str33, str50, str34, str35);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = d + 65;
        int i3 = i2 % 128;
        f410a = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.kodeKlaim;
        int i4 = i3 + 95;
        d = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = f410a + 61;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.jenisKelamin;
        int i5 = i3 + 121;
        f410a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 3;
        f410a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.alamat;
        int i5 = i2 + 109;
        f410a = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = f410a + 41;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.email;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = d + 93;
        f410a = i2 % 128;
        if (i2 % 2 == 0) {
            return this.handphone;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = f410a + 31;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.namaOrtuWali;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 49;
        f410a = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.kodeKantor;
        int i4 = i2 + 121;
        f410a = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = f410a;
        int i3 = i2 + 3;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.kodeManfaat;
        int i5 = i2 + 47;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component17() {
        int i = 2 % 2;
        int i2 = f410a + 5;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.tempatLahir;
        int i5 = i3 + 11;
        f410a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component18() {
        int i = 2 % 2;
        int i2 = f410a + 99;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.namaHubungan;
        int i4 = i3 + 25;
        f410a = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component19() {
        int i = 2 % 2;
        int i2 = f410a + 73;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.jenjangPendidikan;
        int i5 = i3 + 1;
        f410a = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = d + 83;
        int i3 = i2 % 128;
        f410a = i3;
        int i4 = i2 % 2;
        String str = this.kodeKlaimAkhir;
        int i5 = i3 + 47;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component20() {
        int i = 2 % 2;
        int i2 = f410a;
        int i3 = i2 + 111;
        d = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.jumlahPenerima;
        int i5 = i2 + 21;
        d = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component21() {
        int i = 2 % 2;
        int i2 = f410a + 23;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.kodeBankPenerima;
        int i5 = i3 + 1;
        f410a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component22() {
        int i = 2 % 2;
        int i2 = f410a + 85;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.bankPenerima;
        int i5 = i3 + 11;
        f410a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component23() {
        int i = 2 % 2;
        int i2 = f410a + 71;
        d = i2 % 128;
        int i3 = i2 % 2;
        String str = this.noRekeningPenerima;
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        return str;
    }

    public final String component24() {
        int i = 2 % 2;
        int i2 = f410a + 93;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.namaRekeningPenerima;
        int i5 = i3 + 119;
        f410a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = f410a;
        int i3 = i2 + 111;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.noUrut;
        int i4 = i2 + 13;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = d + 109;
        int i3 = i2 % 128;
        f410a = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.nikPeserta;
        int i4 = i3 + 71;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = f410a + 5;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.namaPeserta;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 113;
        f410a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.kpjPeserta;
        int i5 = i2 + 19;
        f410a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 52 / 0;
        }
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = f410a + 87;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.nikPenerima;
        int i4 = i3 + 13;
        f410a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = d + 83;
        f410a = i2 % 128;
        if (i2 % 2 == 0) {
            return this.namaPenerima;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = f410a + 81;
        d = i2 % 128;
        int i3 = i2 % 2;
        String str = this.tglLahir;
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return str;
    }

    public final ScholarshipBenefitPerson copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String p16, String p17, String p18, Integer p19, String p20, String p21, String p22, String p23) {
        int i = 2 % 2;
        ScholarshipBenefitPerson scholarshipBenefitPerson = new ScholarshipBenefitPerson(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23);
        int i2 = f410a + 67;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return scholarshipBenefitPerson;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = f410a + 89;
            d = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(p0 instanceof ScholarshipBenefitPerson)) {
            return false;
        }
        ScholarshipBenefitPerson scholarshipBenefitPerson = (ScholarshipBenefitPerson) p0;
        if ((!Intrinsics.areEqual(this.kodeKlaim, scholarshipBenefitPerson.kodeKlaim)) || !Intrinsics.areEqual(this.kodeKlaimAkhir, scholarshipBenefitPerson.kodeKlaimAkhir)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.noUrut, scholarshipBenefitPerson.noUrut)) {
            int i3 = f410a + 13;
            d = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.nikPeserta, scholarshipBenefitPerson.nikPeserta) || !Intrinsics.areEqual(this.namaPeserta, scholarshipBenefitPerson.namaPeserta) || (!Intrinsics.areEqual(this.kpjPeserta, scholarshipBenefitPerson.kpjPeserta)) || !Intrinsics.areEqual(this.nikPenerima, scholarshipBenefitPerson.nikPenerima) || (!Intrinsics.areEqual(this.namaPenerima, scholarshipBenefitPerson.namaPenerima)) || (!Intrinsics.areEqual(this.tglLahir, scholarshipBenefitPerson.tglLahir)) || !Intrinsics.areEqual(this.jenisKelamin, scholarshipBenefitPerson.jenisKelamin)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.alamat, scholarshipBenefitPerson.alamat)) {
            int i5 = d + 89;
            f410a = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.email, scholarshipBenefitPerson.email)) {
            int i6 = f410a + 49;
            d = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.handphone, scholarshipBenefitPerson.handphone)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.namaOrtuWali, scholarshipBenefitPerson.namaOrtuWali)) {
            int i8 = f410a + 101;
            d = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.kodeKantor, scholarshipBenefitPerson.kodeKantor)) {
            int i10 = f410a + 81;
            d = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.kodeManfaat, scholarshipBenefitPerson.kodeManfaat)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.tempatLahir, scholarshipBenefitPerson.tempatLahir)) {
            int i12 = d + 99;
            f410a = i12 % 128;
            return i12 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.namaHubungan, scholarshipBenefitPerson.namaHubungan)) {
            int i13 = d + 49;
            f410a = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.jenjangPendidikan, scholarshipBenefitPerson.jenjangPendidikan)) {
            return Intrinsics.areEqual(this.jumlahPenerima, scholarshipBenefitPerson.jumlahPenerima) && Intrinsics.areEqual(this.kodeBankPenerima, scholarshipBenefitPerson.kodeBankPenerima) && Intrinsics.areEqual(this.bankPenerima, scholarshipBenefitPerson.bankPenerima) && Intrinsics.areEqual(this.noRekeningPenerima, scholarshipBenefitPerson.noRekeningPenerima) && Intrinsics.areEqual(this.namaRekeningPenerima, scholarshipBenefitPerson.namaRekeningPenerima);
        }
        int i15 = f410a + 3;
        d = i15 % 128;
        int i16 = i15 % 2;
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
        int i2 = f410a + 121;
        d = i2 % 128;
        int i3 = i2 % 2;
        String str = this.kodeKlaim;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.kodeKlaimAkhir;
        if (str2 == null) {
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
            int i4 = f410a + 103;
            d = i4 % 128;
            int i5 = i4 % 2;
        }
        String str3 = this.noUrut;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.nikPeserta;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.namaPeserta;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.kpjPeserta;
        if (str6 == null) {
            int i6 = f410a + 125;
            d = i6 % 128;
            iHashCode2 = i6 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str6.hashCode();
        }
        String str7 = this.nikPenerima;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.namaPenerima;
        int iHashCode12 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.tglLahir;
        int iHashCode13 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.jenisKelamin;
        int iHashCode14 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.alamat;
        int iHashCode15 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.email;
        if (str12 == null) {
            int i7 = d + 1;
            f410a = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str12.hashCode();
        }
        String str13 = this.handphone;
        int iHashCode16 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.namaOrtuWali;
        int iHashCode17 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.kodeKantor;
        int iHashCode18 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.kodeManfaat;
        int iHashCode19 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.tempatLahir;
        if (str17 == null) {
            int i9 = d + 11;
            f410a = i9 % 128;
            int i10 = i9 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str17.hashCode();
        }
        String str18 = this.namaHubungan;
        int iHashCode20 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.jenjangPendidikan;
        if (str19 == null) {
            int i11 = f410a + 45;
            d = i11 % 128;
            int i12 = i11 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str19.hashCode();
        }
        Integer num = this.jumlahPenerima;
        if (num == null) {
            int i13 = f410a + 41;
            d = i13 % 128;
            int i14 = i13 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = num.hashCode();
        }
        String str20 = this.kodeBankPenerima;
        int iHashCode21 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.bankPenerima;
        int iHashCode22 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.noRekeningPenerima;
        int iHashCode23 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.namaRekeningPenerima;
        return (((((((((((((((((((((((((((((((((((((((((((((iHashCode7 * 31) + iHashCode) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode2) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode3) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode4) * 31) + iHashCode20) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + (str23 != null ? str23.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.kodeKlaim;
        String str2 = this.kodeKlaimAkhir;
        String str3 = this.noUrut;
        String str4 = this.nikPeserta;
        String str5 = this.namaPeserta;
        String str6 = this.kpjPeserta;
        String str7 = this.nikPenerima;
        String str8 = this.namaPenerima;
        String str9 = this.tglLahir;
        String str10 = this.jenisKelamin;
        String str11 = this.alamat;
        String str12 = this.email;
        String str13 = this.handphone;
        String str14 = this.namaOrtuWali;
        String str15 = this.kodeKantor;
        String str16 = this.kodeManfaat;
        String str17 = this.tempatLahir;
        String str18 = this.namaHubungan;
        String str19 = this.jenjangPendidikan;
        Integer num = this.jumlahPenerima;
        String str20 = this.kodeBankPenerima;
        String str21 = this.bankPenerima;
        String str22 = this.noRekeningPenerima;
        String str23 = this.namaRekeningPenerima;
        StringBuilder sb = new StringBuilder("ScholarshipBenefitPerson(kodeKlaim=");
        sb.append(str);
        sb.append(", kodeKlaimAkhir=");
        sb.append(str2);
        sb.append(", noUrut=");
        sb.append(str3);
        sb.append(", nikPeserta=");
        sb.append(str4);
        sb.append(", namaPeserta=");
        sb.append(str5);
        sb.append(", kpjPeserta=");
        sb.append(str6);
        sb.append(", nikPenerima=");
        sb.append(str7);
        sb.append(", namaPenerima=");
        sb.append(str8);
        sb.append(", tglLahir=");
        sb.append(str9);
        sb.append(", jenisKelamin=");
        sb.append(str10);
        sb.append(", alamat=");
        sb.append(str11);
        sb.append(", email=");
        sb.append(str12);
        sb.append(", handphone=");
        sb.append(str13);
        sb.append(", namaOrtuWali=");
        sb.append(str14);
        sb.append(", kodeKantor=");
        sb.append(str15);
        sb.append(", kodeManfaat=");
        sb.append(str16);
        sb.append(", tempatLahir=");
        sb.append(str17);
        sb.append(", namaHubungan=");
        sb.append(str18);
        sb.append(", jenjangPendidikan=");
        sb.append(str19);
        sb.append(", jumlahPenerima=");
        sb.append(num);
        sb.append(", kodeBankPenerima=");
        sb.append(str20);
        sb.append(", bankPenerima=");
        sb.append(str21);
        sb.append(", noRekeningPenerima=");
        sb.append(str22);
        sb.append(", namaRekeningPenerima=");
        sb.append(str23);
        sb.append(")");
        String string = sb.toString();
        int i2 = f410a + 117;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        b = (char) 7353;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 32951;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 24083;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 36109;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, short r7, short r8) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 108
            int r6 = r6 * 3
            int r6 = 1 - r6
            byte[] r0 = com.bpjstku.data.scholarship.model.response.ScholarshipBenefitPerson.$$c
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r3 = -r3
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.scholarship.model.response.ScholarshipBenefitPerson.$$g(short, short, short):java.lang.String");
    }
}
