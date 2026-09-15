package com.bpjstku.data.scholarship.model.request;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.createCameraSelectorById;
import defpackage.initSession;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b9\b\u0087\b\u0018\u00002\u00020\u0001Bã\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020!\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b'\u0010%J\u0010\u0010(\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b(\u0010%J\u0010\u0010)\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b)\u0010%J\u0010\u0010*\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b*\u0010%J\u0010\u0010+\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b+\u0010%J\u0010\u0010,\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b,\u0010%J\u0010\u0010-\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b-\u0010%J\u0010\u0010.\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b.\u0010%J\u0010\u0010/\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b/\u0010%J\u0010\u00100\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b0\u0010%J\u0010\u00101\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b1\u0010%J\u0010\u00102\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b2\u0010%J\u0010\u00103\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b3\u0010%J\u0010\u00104\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b4\u0010%J\u0010\u00105\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b5\u0010%J\u0010\u00106\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b6\u0010%J\u0010\u00107\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b7\u0010%J\u0010\u00108\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b8\u0010%J\u0012\u00109\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b;\u0010:J\u0012\u0010<\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b<\u0010:J\u0012\u0010=\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b=\u0010:J\u0012\u0010>\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b>\u0010:J\u0012\u0010?\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b?\u0010:J \u0002\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0017HÇ\u0001¢\u0006\u0004\b@\u0010AJ\u001a\u0010D\u001a\u00020C2\b\u0010\u0003\u001a\u0004\u0018\u00010BHÖ\u0003¢\u0006\u0004\bD\u0010EJ\u0010\u0010G\u001a\u00020FHÖ\u0001¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u0002H×\u0001¢\u0006\u0004\bI\u0010%R\u001a\u0010J\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010%R\u001a\u0010M\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010K\u001a\u0004\bN\u0010%R\u001a\u0010O\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010K\u001a\u0004\bP\u0010%R\u001a\u0010Q\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010K\u001a\u0004\bR\u0010%R\u001a\u0010S\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010K\u001a\u0004\bT\u0010%R\u001a\u0010U\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010K\u001a\u0004\bV\u0010%R\u001a\u0010W\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010K\u001a\u0004\bX\u0010%R\u001a\u0010Y\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010K\u001a\u0004\bZ\u0010%R\u001a\u0010[\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010K\u001a\u0004\b\\\u0010%R\u001a\u0010]\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010K\u001a\u0004\b^\u0010%R\u001a\u0010_\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010K\u001a\u0004\b`\u0010%R\u001a\u0010a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010K\u001a\u0004\bb\u0010%R\u001a\u0010c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010K\u001a\u0004\bd\u0010%R\u001a\u0010e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\be\u0010K\u001a\u0004\bf\u0010%R\u001a\u0010g\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010K\u001a\u0004\bh\u0010%R\u001a\u0010i\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010K\u001a\u0004\bj\u0010%R\u001a\u0010k\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010K\u001a\u0004\bl\u0010%R\u001a\u0010m\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010K\u001a\u0004\bn\u0010%R\u001a\u0010o\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010K\u001a\u0004\bp\u0010%R\u001a\u0010q\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010K\u001a\u0004\br\u0010%R\u001c\u0010s\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010:R\u001c\u0010v\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\bv\u0010t\u001a\u0004\bw\u0010:R\u001c\u0010x\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\bx\u0010t\u001a\u0004\by\u0010:R\u001c\u0010z\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\bz\u0010t\u001a\u0004\b{\u0010:R\u001c\u0010|\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b|\u0010t\u001a\u0004\b}\u0010:R\u001c\u0010~\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b~\u0010t\u001a\u0004\b\u007f\u0010:"}, d2 = {"Lcom/bpjstku/data/scholarship/model/request/ScholarshipInsertRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "Ljava/io/File;", "p20", "p21", "p22", "p23", "p24", "p25", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/io/File;)V", "", "Lokhttp3/RequestBody;", "getPartMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "()Ljava/io/File;", "component22", "component23", "component24", "component25", "component26", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/io/File;)Lcom/bpjstku/data/scholarship/model/request/ScholarshipInsertRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "emailPelapor", "Ljava/lang/String;", "getEmailPelapor", "kodeKlaim", "getKodeKlaim", "kodeKlaimAkhir", "getKodeKlaimAkhir", "nikPeserta", "getNikPeserta", "nikPelapor", "getNikPelapor", "namaPelapor", "getNamaPelapor", "tglLahirPelapor", "getTglLahirPelapor", "noUrutPenerima", "getNoUrutPenerima", "amount", "getAmount", "masihSekolah", "getMasihSekolah", "statusNaik", "getStatusNaik", "tahunBeasiswa", "getTahunBeasiswa", "lembagaPendidikan", "getLembagaPendidikan", "oldLembagaPendidikan", "getOldLembagaPendidikan", "jenjangPendidikan", "getJenjangPendidikan", "oldJenjangPendidikan", "getOldJenjangPendidikan", "tingkatPendidikan", "getTingkatPendidikan", "oldTingkatPendidikan", "getOldTingkatPendidikan", "skorManipulation", "getSkorManipulation", "skorLive", "getSkorLive", "photoLiveness1", "Ljava/io/File;", "getPhotoLiveness1", "photoLiveness2", "getPhotoLiveness2", "photoLiveness3", "getPhotoLiveness3", "dataDokumenBeasiswa1", "getDataDokumenBeasiswa1", "dataDokumenBeasiswa2", "getDataDokumenBeasiswa2", "dataDokumenBeasiswa3", "getDataDokumenBeasiswa3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipInsertRequest extends BaseRequest {
    public static final int $stable = 8;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;
    private static int d;

    @SerializedName("besarManfaat")
    private final String amount;

    @SerializedName("dataDokumenBeasiswa1")
    private final File dataDokumenBeasiswa1;

    @SerializedName("dataDokumenBeasiswa2")
    private final File dataDokumenBeasiswa2;

    @SerializedName("dataDokumenBeasiswa3")
    private final File dataDokumenBeasiswa3;

    @SerializedName("emailPelapor")
    private final String emailPelapor;

    @SerializedName("jenjangPendidikan")
    private final String jenjangPendidikan;

    @SerializedName("kodeKlaimPertama")
    private final String kodeKlaim;

    @SerializedName("kodeKlaimAkhir")
    private final String kodeKlaimAkhir;

    @SerializedName("lembagaPendidikan")
    private final String lembagaPendidikan;

    @SerializedName("flagMasihSekolah")
    private final String masihSekolah;

    @SerializedName("namaPelapor")
    private final String namaPelapor;

    @SerializedName("nikPelapor")
    private final String nikPelapor;

    @SerializedName("nikTk")
    private final String nikPeserta;

    @SerializedName("noUrutPenerima")
    private final String noUrutPenerima;

    @SerializedName("oldJenjangPendidikan")
    private final String oldJenjangPendidikan;

    @SerializedName("oldLembagaPendidikan")
    private final String oldLembagaPendidikan;

    @SerializedName("oldTingkatPendidikan")
    private final String oldTingkatPendidikan;

    @SerializedName("photoLiveness1")
    private final File photoLiveness1;

    @SerializedName("photoLiveness2")
    private final File photoLiveness2;

    @SerializedName("photoLiveness3")
    private final File photoLiveness3;

    @SerializedName("scoreLiveness")
    private final String skorLive;

    @SerializedName("scoreManipulation")
    private final String skorManipulation;

    @SerializedName("statusNaik")
    private final String statusNaik;

    @SerializedName("tahunBeasiswa")
    private final String tahunBeasiswa;

    @SerializedName("tglLahirPelapor")
    private final String tglLahirPelapor;

    @SerializedName("tingkatPendidikan")
    private final String tingkatPendidikan;
    private static final byte[] $$c = {14, 70, 6, -35};
    private static final int $$d = 83;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {17, 104, 102, -28, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 15;
    private static int g = 0;
    private static int asBinder = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f408a = 0;

    private static void e(int i, int i2, int i3, Object[] objArr) {
        byte[] bArr = $$a;
        int i4 = 84 - (i2 * 3);
        int i5 = 3 - (i * 2);
        int i6 = i3 * 4;
        byte[] bArr2 = new byte[53 - i6];
        int i7 = 52 - i6;
        int i8 = -1;
        if (bArr == null) {
            i4 = (i4 + (-i7)) - 11;
        }
        while (true) {
            i8++;
            bArr2[i8] = (byte) i4;
            if (i8 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i5++;
                i4 = (i4 + (-bArr[i5])) - 11;
            }
        }
    }

    public final String getEmailPelapor() {
        int i = 2 % 2;
        int i2 = g + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.emailPelapor;
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        return str;
    }

    public final String getKodeKlaim() {
        int i = 2 % 2;
        int i2 = g + 117;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.kodeKlaim;
        int i5 = i3 + 93;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getKodeKlaimAkhir() {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.kodeKlaimAkhir;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getNikPeserta() {
        int i = 2 % 2;
        int i2 = g + 97;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.nikPeserta;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getNikPelapor() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 5;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.nikPelapor;
        int i5 = i2 + 5;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getNamaPelapor() {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.namaPelapor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTglLahirPelapor() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        String str = this.tglLahirPelapor;
        int i5 = i3 + 37;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
        return str;
    }

    public final String getNoUrutPenerima() {
        int i = 2 % 2;
        int i2 = g + 109;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.noUrutPenerima;
        int i5 = i3 + 77;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return str;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 57;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 75;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMasihSekolah() {
        int i = 2 % 2;
        int i2 = g + 13;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.masihSekolah;
        int i4 = i3 + 57;
        g = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public ScholarshipInsertRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, File file, File file2, File file3, File file4, File file5, File file6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        this.emailPelapor = str;
        this.kodeKlaim = str2;
        this.kodeKlaimAkhir = str3;
        this.nikPeserta = str4;
        this.nikPelapor = str5;
        this.namaPelapor = str6;
        this.tglLahirPelapor = str7;
        this.noUrutPenerima = str8;
        this.amount = str9;
        this.masihSekolah = str10;
        this.statusNaik = str11;
        this.tahunBeasiswa = str12;
        this.lembagaPendidikan = str13;
        this.oldLembagaPendidikan = str14;
        this.jenjangPendidikan = str15;
        this.oldJenjangPendidikan = str16;
        this.tingkatPendidikan = str17;
        this.oldTingkatPendidikan = str18;
        this.skorManipulation = str19;
        this.skorLive = str20;
        this.photoLiveness1 = file;
        this.photoLiveness2 = file2;
        this.photoLiveness3 = file3;
        this.dataDokumenBeasiswa1 = file4;
        this.dataDokumenBeasiswa2 = file5;
        this.dataDokumenBeasiswa3 = file6;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x01c2 A[PHI: r0
  0x01c2: PHI (r0v9 int) = (r0v8 int), (r0v37 int) binds: [B:44:0x01c0, B:41:0x01ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x01c4 A[PHI: r0
  0x01c4: PHI (r0v34 int) = (r0v8 int), (r0v37 int) binds: [B:44:0x01c0, B:41:0x01ae] A[DONT_GENERATE, DONT_INLINE]] */
    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7 = 2;
        int i8 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) KeyEvent.getDeadChar(0, 0), 2267 - TextUtils.getTrimmedLength(""), ExpandableListView.getPackedPositionType(0L) + 33, 1387473586, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i9 = $10 + 51;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i11 = $11 + 75;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i12 = 0;
                    while (i12 < length) {
                        int i13 = $10 + 39;
                        $11 = i13 % 128;
                        int i14 = i13 % i7;
                        Object[] objArr3 = {Integer.valueOf(bArr[i12])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cBlue = (char) Color.blue(0);
                            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3358;
                            int gidForName = Process.getGidForName("") + 19;
                            byte length2 = (byte) $$c.length;
                            byte b5 = (byte) (length2 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, scrollBarFadeDuration, gidForName, -1054011043, false, $$e(length2, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr2[i12] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i12++;
                        i7 = 2;
                    }
                    int i15 = $10 + 79;
                    $11 = i15 % 128;
                    i6 = 2;
                    int i16 = i15 % 2;
                    bArr = bArr2;
                } else {
                    i6 = 2;
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr4 = new Object[i6];
                    objArr4[1] = Integer.valueOf(b);
                    objArr4[0] = Integer.valueOf(i3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.MeasureSpec.getSize(0), 2266 - TextUtils.lastIndexOf("", '0'), 32 - MotionEvent.axisFromString(""), 1387473586, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i17 = $10 + 123;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    i4 = ((i3 + iIntValue) - 5) + ((int) (((long) b) - 3046761265686732006L));
                    if (z) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                } else {
                    i4 = ((i3 + iIntValue) - 2) + ((int) (((long) b) ^ 3046761265686732006L));
                    if (z) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i4 + i5;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (55905 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int jumpTapTimeout = 2855 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int iAlpha = Color.alpha(0) + 13;
                    byte b8 = (byte) ($$d & 5);
                    byte b9 = (byte) (b8 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, jumpTapTimeout, iAlpha, -1529949196, false, $$e(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i18 = 0; i18 < length3; i18++) {
                        bArr5[i18] = (byte) (((long) bArr4[i18]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    z2 = true;
                } else {
                    int i19 = $10 + 107;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    z2 = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i21 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i21 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i21]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i22 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i22 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i22]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final String getStatusNaik() {
        int iIntValue;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (-16777176) - Color.rgb(0, 0, 0), AndroidCharacter.getMirror('0') - 29, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        Object obj = null;
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        long j = 0;
        Object[] objArr = new Object[1];
        c(KeyEvent.keyCodeFromString("") + 1995673723, (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 99, (short) TextUtils.getOffsetAfter("", 0), (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 1671842467 + (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        c(Color.alpha(0) + 1995673727, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 99, (short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0) + 1671842489, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j2 = -721;
        long jNextInt = new Random().nextInt();
        long j3 = -1;
        long j4 = j3 ^ 1700474932698002985L;
        long j5 = j3 ^ 396782242043956002L;
        long j6 = 1700654190776270635L ^ j3;
        long j7 = (j2 * 1700474932698002985L) + (j2 * 396782242043956002L) + (((long) 1444) * ((jNextInt ^ j3) | ((j4 | j5) ^ j3) | j6)) + (((long) (-1444)) * (j6 | ((jNextInt | 1700474932698002985L) ^ j3) | ((jNextInt | 396782242043956002L) ^ j3))) + (((long) 722) * (((j5 | 1700474932698002985L) ^ j3) | ((j4 | 396782242043956002L) ^ j3)));
        int i3 = 0;
        try {
            while (i3 != 10) {
                int i4 = asBinder + 49;
                g = i4 % 128;
                int i5 = i4 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37837 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1))), 59 - (Process.myPid() >> 22), 18 - KeyEvent.getDeadChar(0, 0), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(obj);
                long j8 = jLongValue;
                int i7 = 0;
                while (true) {
                    for (int i8 = 0; i8 != 8; i8++) {
                        i6 = (((((int) (j8 >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                    }
                    if (i7 != 0) {
                        break;
                    }
                    int i9 = asBinder + 93;
                    int i10 = i9 % 128;
                    g = i10;
                    i7 = i9 % 2 != 0 ? i7 + 45 : i7 + 1;
                    int i11 = i10 + 63;
                    asBinder = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 2 % 5;
                    }
                    j8 = j7;
                }
                if (i6 == i2) {
                    return this.statusNaik;
                }
                jLongValue -= 1024;
                i3++;
                obj = null;
                j = 0;
            }
            Object[] objArr3 = {-1473836217};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46038 - TextUtils.indexOf("", "", 0)), 1134 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), KeyEvent.normalizeMetaState(0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr4 = {Integer.valueOf(iIntValue), 0, 1998769635, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr3), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                int iMyPid = 1031 - (Process.myPid() >> 22);
                int iIndexOf = 15 - TextUtils.indexOf("", "", 0, 0);
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr5 = new Object[1];
                e(b2, b3, b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup, iMyPid, iIndexOf, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - TextUtils.indexOf((CharSequence) "", '0')), 1117 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.lastIndexOf("", '0', 0) + 18), Boolean.TYPE});
            }
            Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4);
            int i13 = 0;
            int i14 = ((int[]) objArr6[1])[0];
            int i15 = ((int[]) objArr6[3])[0];
            if (i15 != i14) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr6[0];
                if (strArr != null) {
                    int i16 = g + 117;
                    asBinder = i16 % 128;
                    int i17 = i16 % 2;
                    while (i13 < strArr.length) {
                        int i18 = asBinder + 43;
                        g = i18 % 128;
                        if (i18 % 2 != 0) {
                            arrayList.add(strArr[i13]);
                            i13 += 74;
                        } else {
                            arrayList.add(strArr[i13]);
                            i13++;
                        }
                    }
                }
                throw new RuntimeException(String.valueOf(i15));
            }
            return this.statusNaik;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        Object[] objArr7 = new Object[1];
        c(1995673732 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.lastIndexOf("", '0') - 98, (short) (ViewConfiguration.getPressedStateDuration() >> 16), (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1671842503, objArr7);
        Class<?> cls2 = Class.forName((String) objArr7[0]);
        Object[] objArr8 = new Object[1];
        c(1995673730 - TextUtils.lastIndexOf("", '0'), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 98, (short) Color.blue(0), (byte) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1671842519, objArr8);
        iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
    }

    public final String getTahunBeasiswa() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 5;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tahunBeasiswa;
        int i5 = i2 + 3;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getLembagaPendidikan() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 43;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.lembagaPendidikan;
        int i5 = i2 + 69;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getOldLembagaPendidikan() {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.oldLembagaPendidikan;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getJenjangPendidikan() {
        int i = 2 % 2;
        int i2 = g + 61;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.jenjangPendidikan;
        int i5 = i3 + 117;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOldJenjangPendidikan() {
        int i = 2 % 2;
        int i2 = g + 39;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.oldJenjangPendidikan;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTingkatPendidikan() {
        int i = 2 % 2;
        int i2 = g + 15;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.tingkatPendidikan;
        int i5 = i3 + 117;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOldTingkatPendidikan() {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.oldTingkatPendidikan;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSkorManipulation() {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        g = i2 % 128;
        int i3 = i2 % 2;
        String str = this.skorManipulation;
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return str;
    }

    public final String getSkorLive() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 11;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.skorLive;
        int i4 = i2 + 67;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final File getPhotoLiveness1() {
        int i = 2 % 2;
        int i2 = g + 93;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        File file = this.photoLiveness1;
        int i5 = i3 + 47;
        g = i5 % 128;
        int i6 = i5 % 2;
        return file;
    }

    public final File getPhotoLiveness2() {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        File file = this.photoLiveness2;
        int i5 = i3 + 67;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return file;
        }
        throw null;
    }

    public final File getPhotoLiveness3() {
        int i = 2 % 2;
        int i2 = g + 51;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        File file = this.photoLiveness3;
        int i4 = i3 + 67;
        g = i4 % 128;
        int i5 = i4 % 2;
        return file;
    }

    public final File getDataDokumenBeasiswa1() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 17;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        File file = this.dataDokumenBeasiswa1;
        int i5 = i2 + 5;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return file;
    }

    public final File getDataDokumenBeasiswa2() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.dataDokumenBeasiswa2;
        }
        throw null;
    }

    public final File getDataDokumenBeasiswa3() {
        int i = 2 % 2;
        int i2 = g + 91;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        File file = this.dataDokumenBeasiswa3;
        int i5 = i3 + 11;
        g = i5 % 128;
        int i6 = i5 % 2;
        return file;
    }

    public final Map<String, RequestBody> getPartMap() {
        int i = 2 % 2;
        Map<String, Object> mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            int i2 = asBinder + 105;
            g = i2 % 128;
            int i3 = i2 % 2;
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("photoLiveness1");
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            int i4 = asBinder + 59;
            g = i4 % 128;
            int i5 = i4 % 2;
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("photoLiveness2");
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("photoLiveness3");
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("dataDokumenBeasiswa1");
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("dataDokumenBeasiswa2");
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            int i6 = g + 41;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("dataDokumenBeasiswa3");
            int i8 = asBinder + 21;
            g = i8 % 128;
            int i9 = i8 % 2;
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.size()));
        Iterator<T> it = mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Intrinsics.checkNotNullParameter(value, "");
            linkedHashMap.put(key, RequestBody.INSTANCE.create((String) value, MediaType.INSTANCE.parse("text/plain")));
        }
        return linkedHashMap;
    }

    static {
        d = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = f408a + 51;
        d = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ ScholarshipInsertRequest copy$default(ScholarshipInsertRequest scholarshipInsertRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, File file, File file2, File file3, File file4, File file5, File file6, int i, Object obj) {
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        File file7;
        File file8;
        File file9;
        File file10;
        File file11;
        int i2 = 2 % 2;
        int i3 = g;
        int i4 = i3 + 23;
        asBinder = i4 % 128;
        String str27 = (i4 % 2 != 0 ? (i & 1) == 0 : (i & 1) == 0) ? str : scholarshipInsertRequest.emailPelapor;
        if ((i & 2) != 0) {
            str21 = scholarshipInsertRequest.kodeKlaim;
            int i5 = i3 + 57;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str21 = str2;
        }
        String str28 = (i & 4) != 0 ? scholarshipInsertRequest.kodeKlaimAkhir : str3;
        if ((i & 8) != 0) {
            int i7 = i3 + 113;
            asBinder = i7 % 128;
            if (i7 % 2 == 0) {
                str22 = scholarshipInsertRequest.nikPeserta;
                int i8 = 98 / 0;
            } else {
                str22 = scholarshipInsertRequest.nikPeserta;
            }
        } else {
            str22 = str4;
        }
        String str29 = (i & 16) != 0 ? scholarshipInsertRequest.nikPelapor : str5;
        String str30 = (i & 32) != 0 ? scholarshipInsertRequest.namaPelapor : str6;
        String str31 = (i & 64) != 0 ? scholarshipInsertRequest.tglLahirPelapor : str7;
        String str32 = (i & 128) != 0 ? scholarshipInsertRequest.noUrutPenerima : str8;
        String str33 = (i & 256) != 0 ? scholarshipInsertRequest.amount : str9;
        String str34 = (i & 512) != 0 ? scholarshipInsertRequest.masihSekolah : str10;
        String str35 = (i & 1024) != 0 ? scholarshipInsertRequest.statusNaik : str11;
        String str36 = (i & 2048) != 0 ? scholarshipInsertRequest.tahunBeasiswa : str12;
        String str37 = (i & 4096) != 0 ? scholarshipInsertRequest.lembagaPendidikan : str13;
        if ((i & 8192) != 0) {
            int i9 = i3 + 37;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            str23 = scholarshipInsertRequest.oldLembagaPendidikan;
        } else {
            str23 = str14;
        }
        String str38 = (i & 16384) != 0 ? scholarshipInsertRequest.jenjangPendidikan : str15;
        if ((i & 32768) != 0) {
            int i11 = asBinder + 13;
            g = i11 % 128;
            int i12 = i11 % 2;
            str24 = scholarshipInsertRequest.oldJenjangPendidikan;
        } else {
            str24 = str16;
        }
        String str39 = (65536 & i) != 0 ? scholarshipInsertRequest.tingkatPendidikan : str17;
        if ((i & 131072) != 0) {
            int i13 = g + 81;
            asBinder = i13 % 128;
            if (i13 % 2 == 0) {
                String str40 = scholarshipInsertRequest.oldTingkatPendidikan;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str25 = scholarshipInsertRequest.oldTingkatPendidikan;
        } else {
            str25 = str18;
        }
        if ((262144 & i) != 0) {
            int i14 = g + 11;
            asBinder = i14 % 128;
            int i15 = i14 % 2;
            str26 = scholarshipInsertRequest.skorManipulation;
        } else {
            str26 = str19;
        }
        String str41 = (524288 & i) != 0 ? scholarshipInsertRequest.skorLive : str20;
        if ((i & 1048576) != 0) {
            int i16 = asBinder + 11;
            g = i16 % 128;
            int i17 = i16 % 2;
            file7 = scholarshipInsertRequest.photoLiveness1;
        } else {
            file7 = file;
        }
        File file12 = (2097152 & i) != 0 ? scholarshipInsertRequest.photoLiveness2 : file2;
        File file13 = (i & 4194304) != 0 ? scholarshipInsertRequest.photoLiveness3 : file3;
        if ((i & 8388608) != 0) {
            file9 = file13;
            int i18 = asBinder + 9;
            file8 = file7;
            g = i18 % 128;
            int i19 = i18 % 2;
            file10 = scholarshipInsertRequest.dataDokumenBeasiswa1;
            if (i19 != 0) {
                int i20 = 89 / 0;
            }
        } else {
            file8 = file7;
            file9 = file13;
            file10 = file4;
        }
        if ((16777216 & i) != 0) {
            int i21 = asBinder + 81;
            g = i21 % 128;
            int i22 = i21 % 2;
            file11 = scholarshipInsertRequest.dataDokumenBeasiswa2;
        } else {
            file11 = file5;
        }
        return scholarshipInsertRequest.copy(str27, str21, str28, str22, str29, str30, str31, str32, str33, str34, str35, str36, str37, str23, str38, str24, str39, str25, str26, str41, file8, file12, file9, file10, file11, (i & 33554432) != 0 ? scholarshipInsertRequest.dataDokumenBeasiswa3 : file6);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = asBinder + 77;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            str = this.emailPelapor;
            int i4 = 37 / 0;
        } else {
            str = this.emailPelapor;
        }
        int i5 = i3 + 29;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 94 / 0;
        }
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 105;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.masihSekolah;
        int i4 = i2 + 21;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = g + 123;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.statusNaik;
        int i4 = i3 + 5;
        g = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 17;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tahunBeasiswa;
        int i5 = i2 + 105;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 95;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.lembagaPendidikan;
        int i5 = i2 + 63;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = g + 107;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.oldLembagaPendidikan;
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        return str;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 119;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.jenjangPendidikan;
        int i5 = i2 + 101;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.oldJenjangPendidikan;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component17() {
        int i = 2 % 2;
        int i2 = g + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.tingkatPendidikan;
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return str;
    }

    public final String component18() {
        int i = 2 % 2;
        int i2 = g + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.oldTingkatPendidikan;
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        return str;
    }

    public final String component19() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 11;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.skorManipulation;
        int i5 = i2 + 3;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        g = i2 % 128;
        int i3 = i2 % 2;
        String str = this.kodeKlaim;
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        return str;
    }

    public final String component20() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 3;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.skorLive;
        int i5 = i2 + 31;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final File component21() {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        File file = this.photoLiveness1;
        int i4 = i3 + 125;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return file;
    }

    public final File component22() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 35;
        g = i3 % 128;
        int i4 = i3 % 2;
        File file = this.photoLiveness2;
        int i5 = i2 + 91;
        g = i5 % 128;
        int i6 = i5 % 2;
        return file;
    }

    public final File component23() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 83;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        File file = this.photoLiveness3;
        int i4 = i2 + 9;
        g = i4 % 128;
        int i5 = i4 % 2;
        return file;
    }

    public final File component24() {
        File file;
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 49;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            file = this.dataDokumenBeasiswa1;
            int i4 = 25 / 0;
        } else {
            file = this.dataDokumenBeasiswa1;
        }
        int i5 = i2 + 31;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return file;
    }

    public final File component25() {
        int i = 2 % 2;
        int i2 = g + 5;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.dataDokumenBeasiswa2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final File component26() {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        File file = this.dataDokumenBeasiswa3;
        int i5 = i3 + 31;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return file;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = g + 123;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.kodeKlaimAkhir;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 73;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.nikPeserta;
        int i4 = i2 + 5;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        String str = this.nikPelapor;
        int i5 = i3 + 113;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 115;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.namaPelapor;
        int i4 = i2 + 55;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.tglLahirPelapor;
        int i4 = i3 + 87;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = g + 85;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.noUrutPenerima;
        int i4 = i3 + 1;
        g = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 97;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 77;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ScholarshipInsertRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String p16, String p17, String p18, String p19, File p20, File p21, File p22, File p23, File p24, File p25) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        Intrinsics.checkNotNullParameter(p7, "");
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p9, "");
        Intrinsics.checkNotNullParameter(p10, "");
        Intrinsics.checkNotNullParameter(p11, "");
        Intrinsics.checkNotNullParameter(p12, "");
        Intrinsics.checkNotNullParameter(p13, "");
        Intrinsics.checkNotNullParameter(p14, "");
        Intrinsics.checkNotNullParameter(p15, "");
        Intrinsics.checkNotNullParameter(p16, "");
        Intrinsics.checkNotNullParameter(p17, "");
        Intrinsics.checkNotNullParameter(p18, "");
        Intrinsics.checkNotNullParameter(p19, "");
        ScholarshipInsertRequest scholarshipInsertRequest = new ScholarshipInsertRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25);
        int i2 = g + 111;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
        return scholarshipInsertRequest;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipInsertRequest)) {
            int i2 = asBinder + 59;
            g = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        ScholarshipInsertRequest scholarshipInsertRequest = (ScholarshipInsertRequest) p0;
        if (!Intrinsics.areEqual(this.emailPelapor, scholarshipInsertRequest.emailPelapor) || !Intrinsics.areEqual(this.kodeKlaim, scholarshipInsertRequest.kodeKlaim) || !Intrinsics.areEqual(this.kodeKlaimAkhir, scholarshipInsertRequest.kodeKlaimAkhir) || !Intrinsics.areEqual(this.nikPeserta, scholarshipInsertRequest.nikPeserta)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.nikPelapor, scholarshipInsertRequest.nikPelapor)) {
            int i4 = asBinder + 113;
            g = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.namaPelapor, scholarshipInsertRequest.namaPelapor)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.tglLahirPelapor, scholarshipInsertRequest.tglLahirPelapor)) {
            int i6 = asBinder + 11;
            g = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.noUrutPenerima, scholarshipInsertRequest.noUrutPenerima) || !Intrinsics.areEqual(this.amount, scholarshipInsertRequest.amount)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.masihSekolah, scholarshipInsertRequest.masihSekolah)) {
            int i7 = asBinder + 109;
            g = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.statusNaik, scholarshipInsertRequest.statusNaik) || (!Intrinsics.areEqual(this.tahunBeasiswa, scholarshipInsertRequest.tahunBeasiswa)) || !Intrinsics.areEqual(this.lembagaPendidikan, scholarshipInsertRequest.lembagaPendidikan) || !Intrinsics.areEqual(this.oldLembagaPendidikan, scholarshipInsertRequest.oldLembagaPendidikan)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.jenjangPendidikan, scholarshipInsertRequest.jenjangPendidikan)) {
            int i9 = asBinder + 109;
            g = i9 % 128;
            return i9 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.oldJenjangPendidikan, scholarshipInsertRequest.oldJenjangPendidikan)) {
            return !(Intrinsics.areEqual(this.tingkatPendidikan, scholarshipInsertRequest.tingkatPendidikan) ^ true) && Intrinsics.areEqual(this.oldTingkatPendidikan, scholarshipInsertRequest.oldTingkatPendidikan) && Intrinsics.areEqual(this.skorManipulation, scholarshipInsertRequest.skorManipulation) && Intrinsics.areEqual(this.skorLive, scholarshipInsertRequest.skorLive) && Intrinsics.areEqual(this.photoLiveness1, scholarshipInsertRequest.photoLiveness1) && Intrinsics.areEqual(this.photoLiveness2, scholarshipInsertRequest.photoLiveness2) && Intrinsics.areEqual(this.photoLiveness3, scholarshipInsertRequest.photoLiveness3) && Intrinsics.areEqual(this.dataDokumenBeasiswa1, scholarshipInsertRequest.dataDokumenBeasiswa1) && Intrinsics.areEqual(this.dataDokumenBeasiswa2, scholarshipInsertRequest.dataDokumenBeasiswa2) && Intrinsics.areEqual(this.dataDokumenBeasiswa3, scholarshipInsertRequest.dataDokumenBeasiswa3);
        }
        int i10 = asBinder + 49;
        g = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int iHashCode2;
        int iHashCode3;
        int i2 = 2 % 2;
        int i3 = g + 99;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode4 = this.emailPelapor.hashCode();
        int iHashCode5 = this.kodeKlaim.hashCode();
        int iHashCode6 = this.kodeKlaimAkhir.hashCode();
        int iHashCode7 = this.nikPeserta.hashCode();
        int iHashCode8 = this.nikPelapor.hashCode();
        int iHashCode9 = this.namaPelapor.hashCode();
        int iHashCode10 = this.tglLahirPelapor.hashCode();
        int iHashCode11 = this.noUrutPenerima.hashCode();
        int iHashCode12 = this.amount.hashCode();
        int iHashCode13 = this.masihSekolah.hashCode();
        int iHashCode14 = this.statusNaik.hashCode();
        int iHashCode15 = this.tahunBeasiswa.hashCode();
        int iHashCode16 = this.lembagaPendidikan.hashCode();
        int iHashCode17 = this.oldLembagaPendidikan.hashCode();
        int iHashCode18 = this.jenjangPendidikan.hashCode();
        int iHashCode19 = this.oldJenjangPendidikan.hashCode();
        int iHashCode20 = this.tingkatPendidikan.hashCode();
        int iHashCode21 = this.oldTingkatPendidikan.hashCode();
        int iHashCode22 = this.skorManipulation.hashCode();
        int iHashCode23 = this.skorLive.hashCode();
        File file = this.photoLiveness1;
        if (file == null) {
            int i5 = asBinder + 85;
            g = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 2;
            }
            iHashCode = 0;
        } else {
            iHashCode = file.hashCode();
        }
        File file2 = this.photoLiveness2;
        if (file2 == null) {
            int i7 = asBinder + 57;
            g = i7 % 128;
            int i8 = i7 % 2;
            i = 0;
        } else {
            int iHashCode24 = file2.hashCode();
            int i9 = asBinder + 61;
            g = i9 % 128;
            int i10 = i9 % 2;
            i = iHashCode24;
        }
        File file3 = this.photoLiveness3;
        int iHashCode25 = file3 == null ? 0 : file3.hashCode();
        File file4 = this.dataDokumenBeasiswa1;
        if (file4 == null) {
            int i11 = asBinder + 33;
            g = i11 % 128;
            int i12 = i11 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = file4.hashCode();
        }
        File file5 = this.dataDokumenBeasiswa2;
        if (file5 == null) {
            int i13 = asBinder + 7;
            g = i13 % 128;
            int i14 = i13 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = file5.hashCode();
        }
        File file6 = this.dataDokumenBeasiswa3;
        return (((((((((((((((((((((((((((((((((((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode) * 31) + i) * 31) + iHashCode25) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (file6 != null ? file6.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.emailPelapor;
        String str2 = this.kodeKlaim;
        String str3 = this.kodeKlaimAkhir;
        String str4 = this.nikPeserta;
        String str5 = this.nikPelapor;
        String str6 = this.namaPelapor;
        String str7 = this.tglLahirPelapor;
        String str8 = this.noUrutPenerima;
        String str9 = this.amount;
        String str10 = this.masihSekolah;
        String str11 = this.statusNaik;
        String str12 = this.tahunBeasiswa;
        String str13 = this.lembagaPendidikan;
        String str14 = this.oldLembagaPendidikan;
        String str15 = this.jenjangPendidikan;
        String str16 = this.oldJenjangPendidikan;
        String str17 = this.tingkatPendidikan;
        String str18 = this.oldTingkatPendidikan;
        String str19 = this.skorManipulation;
        String str20 = this.skorLive;
        File file = this.photoLiveness1;
        File file2 = this.photoLiveness2;
        File file3 = this.photoLiveness3;
        File file4 = this.dataDokumenBeasiswa1;
        File file5 = this.dataDokumenBeasiswa2;
        File file6 = this.dataDokumenBeasiswa3;
        StringBuilder sb = new StringBuilder("ScholarshipInsertRequest(emailPelapor=");
        sb.append(str);
        sb.append(", kodeKlaim=");
        sb.append(str2);
        sb.append(", kodeKlaimAkhir=");
        sb.append(str3);
        sb.append(", nikPeserta=");
        sb.append(str4);
        sb.append(", nikPelapor=");
        sb.append(str5);
        sb.append(", namaPelapor=");
        sb.append(str6);
        sb.append(", tglLahirPelapor=");
        sb.append(str7);
        sb.append(", noUrutPenerima=");
        sb.append(str8);
        sb.append(", amount=");
        sb.append(str9);
        sb.append(", masihSekolah=");
        sb.append(str10);
        sb.append(", statusNaik=");
        sb.append(str11);
        sb.append(", tahunBeasiswa=");
        sb.append(str12);
        sb.append(", lembagaPendidikan=");
        sb.append(str13);
        sb.append(", oldLembagaPendidikan=");
        sb.append(str14);
        sb.append(", jenjangPendidikan=");
        sb.append(str15);
        sb.append(", oldJenjangPendidikan=");
        sb.append(str16);
        sb.append(", tingkatPendidikan=");
        sb.append(str17);
        sb.append(", oldTingkatPendidikan=");
        sb.append(str18);
        sb.append(", skorManipulation=");
        sb.append(str19);
        sb.append(", skorLive=");
        sb.append(str20);
        sb.append(", photoLiveness1=");
        sb.append(file);
        sb.append(", photoLiveness2=");
        sb.append(file2);
        sb.append(", photoLiveness3=");
        sb.append(file3);
        sb.append(", dataDokumenBeasiswa1=");
        sb.append(file4);
        sb.append(", dataDokumenBeasiswa2=");
        sb.append(file5);
        sb.append(", dataDokumenBeasiswa3=");
        sb.append(file6);
        sb.append(")");
        String string = sb.toString();
        int i2 = asBinder + 51;
        g = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        b = 284486072;
        TuitionPaymentFragmentbindingInflater1 = -1934795644;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 94450432;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new byte[]{82, -18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 75, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, 72, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, 72, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29};
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
    private static java.lang.String $$e(int r6, int r7, int r8) {
        /*
            byte[] r0 = com.bpjstku.data.scholarship.model.request.ScholarshipInsertRequest.$$c
            int r7 = r7 * 3
            int r1 = 1 - r7
            int r6 = r6 + 117
            int r8 = r8 * 2
            int r8 = 3 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r8 = -r8
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.scholarship.model.request.ScholarshipInsertRequest.$$e(int, int, int):java.lang.String");
    }
}
