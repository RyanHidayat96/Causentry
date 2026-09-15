package com.bpjstku.data.jht.model.request;

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
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\bA\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b@\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010$J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010$J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010$J\u0010\u0010+\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b+\u0010$J\u0010\u0010,\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b,\u0010$J\u0010\u0010-\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b-\u0010$J\u0010\u0010.\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b.\u0010$J\u0010\u0010/\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b/\u0010$J\u0010\u00100\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b0\u0010$J\u0010\u00101\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b1\u0010$J\u0010\u00102\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b2\u0010$J\u0010\u00103\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b3\u0010$J\u0010\u00104\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b4\u0010$J\u0010\u00105\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b5\u0010$J\u0010\u00106\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b6\u0010$J\u0010\u00107\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b7\u0010$J\u0010\u00108\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b8\u0010$J\u0010\u00109\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b9\u0010$J\u0010\u0010:\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b:\u0010$J\u0010\u0010;\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b;\u0010$J\u0010\u0010<\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b<\u0010$J\u0010\u0010=\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b=\u0010$J\u0010\u0010>\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b>\u0010$J\u0010\u0010?\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b?\u0010$J\u0010\u0010@\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b@\u0010$J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010$JÊ\u0002\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\bB\u0010CJ\u001a\u0010F\u001a\u00020E2\b\u0010\u0003\u001a\u0004\u0018\u00010DHÖ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010I\u001a\u00020HHÖ\u0001¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\u0002H×\u0001¢\u0006\u0004\bK\u0010$R\u001a\u0010L\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010$R\u001c\u0010O\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010M\u001a\u0004\bP\u0010$R\u001c\u0010Q\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010M\u001a\u0004\bR\u0010$R\u001c\u0010S\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010M\u001a\u0004\bT\u0010$R\u001c\u0010U\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010M\u001a\u0004\bV\u0010$R\u001c\u0010W\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010M\u001a\u0004\bX\u0010$R\u001c\u0010Y\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010M\u001a\u0004\bZ\u0010$R\u001a\u0010[\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010M\u001a\u0004\b\\\u0010$R\u001a\u0010]\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010M\u001a\u0004\b^\u0010$R\u001a\u0010_\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010M\u001a\u0004\b`\u0010$R\u001a\u0010a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010M\u001a\u0004\bb\u0010$R\u001a\u0010c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010M\u001a\u0004\bd\u0010$R\u001a\u0010e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\be\u0010M\u001a\u0004\bf\u0010$R\u001a\u0010g\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010M\u001a\u0004\bh\u0010$R\u001a\u0010i\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010M\u001a\u0004\bj\u0010$R\u001a\u0010k\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010M\u001a\u0004\bl\u0010$R\u001a\u0010m\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010M\u001a\u0004\bn\u0010$R\u001a\u0010o\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010M\u001a\u0004\bp\u0010$R\u001a\u0010q\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010M\u001a\u0004\br\u0010$R\u001a\u0010s\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bs\u0010M\u001a\u0004\bt\u0010$R\u001a\u0010u\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bu\u0010M\u001a\u0004\bv\u0010$R\u001a\u0010w\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bw\u0010M\u001a\u0004\bx\u0010$R\u001a\u0010y\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\by\u0010M\u001a\u0004\bz\u0010$R\u001a\u0010{\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b{\u0010M\u001a\u0004\b|\u0010$R\u001a\u0010}\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b}\u0010M\u001a\u0004\b~\u0010$R\u001b\u0010\u007f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u007f\u0010M\u001a\u0005\b\u0080\u0001\u0010$R\u001d\u0010\u0081\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010M\u001a\u0005\b\u0082\u0001\u0010$R\u001d\u0010\u0083\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010M\u001a\u0005\b\u0084\u0001\u0010$R\u001d\u0010\u0085\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010M\u001a\u0005\b\u0086\u0001\u0010$R\u001f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010M\u001a\u0005\b\u0088\u0001\u0010$"}, d2 = {"Lcom/bpjstku/data/jht/model/request/JhtInstantClaimRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "p24", "p25", "p26", "p27", "p28", "p29", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jht/model/request/JhtInstantClaimRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "file", "Ljava/lang/String;", "getFile", "email", "getEmail", "npwp", "getNpwp", "claimTypeCode", "getClaimTypeCode", "claimCauseCode", "getClaimCauseCode", "statusVerklaring", "getStatusVerklaring", "signature", "getSignature", "layoffDocCode", "getLayoffDocCode", "position", "getPosition", "workingUnit", "getWorkingUnit", "employeeAgreementNo", "getEmployeeAgreementNo", "employeeAgreementDate", "getEmployeeAgreementDate", "layoffNo", "getLayoffNo", "layoffDate", "getLayoffDate", "statusUsaha", "getStatusUsaha", "statusSakit", "getStatusSakit", "jenisPekerjaan1", "getJenisPekerjaan1", "jenisPekerjaan2", "getJenisPekerjaan2", "lokasiPekerjaan", "getLokasiPekerjaan", "nomorKartuKeluarga", "getNomorKartuKeluarga", "kodeJenisIuranAktivasi", "getKodeJenisIuranAktivasi", "nominalIuranAktivasi", "getNominalIuranAktivasi", "pathFileKtp", "getPathFileKtp", "fileKtp", "getFileKtp", "flagReaktivasiBpu", "getFlagReaktivasiBpu", "kodeAlasanTidakReaktivasi", "getKodeAlasanTidakReaktivasi", "namaAlasanTidakReaktivasi", "getNamaAlasanTidakReaktivasi", "latitude", "getLatitude", "longitude", "getLongitude", PlaceTypes.LOCALITY, "getLocality"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JhtInstantClaimRequest extends BaseRequest {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int b;

    @SerializedName("claimCauseCode")
    private final String claimCauseCode;

    @SerializedName("claimTypeCode")
    private final String claimTypeCode;

    @SerializedName("email")
    private final String email;

    @SerializedName("employeeAgreementDate")
    private final String employeeAgreementDate;

    @SerializedName("employeeAgreementNo")
    private final String employeeAgreementNo;

    @SerializedName("file")
    private final String file;

    @SerializedName("fileKtp")
    private final String fileKtp;

    @SerializedName("flagReaktivasiBpu")
    private final String flagReaktivasiBpu;

    @SerializedName("jenisPekerjaan1")
    private final String jenisPekerjaan1;

    @SerializedName("jenisPekerjaan2")
    private final String jenisPekerjaan2;

    @SerializedName("kodeAlasanTidakReaktivasi")
    private final String kodeAlasanTidakReaktivasi;

    @SerializedName("kodeJenisIuranAktivasi")
    private final String kodeJenisIuranAktivasi;

    @SerializedName("latitude")
    private final String latitude;

    @SerializedName("layoffDate")
    private final String layoffDate;

    @SerializedName("layoffDocCode")
    private final String layoffDocCode;

    @SerializedName("layoffNo")
    private final String layoffNo;

    @SerializedName(PlaceTypes.LOCALITY)
    private final String locality;

    @SerializedName("lokasiPekerjaan")
    private final String lokasiPekerjaan;

    @SerializedName("longitude")
    private final String longitude;

    @SerializedName("namaAlasanTidakReaktivasi")
    private final String namaAlasanTidakReaktivasi;

    @SerializedName("nominalIuranAktivasi")
    private final String nominalIuranAktivasi;

    @SerializedName("nomorKartuKeluarga")
    private final String nomorKartuKeluarga;

    @SerializedName("npwp")
    private final String npwp;

    @SerializedName("pathFileKtp")
    private final String pathFileKtp;

    @SerializedName("position")
    private final String position;

    @SerializedName("signature")
    private final String signature;

    @SerializedName("statusSakit")
    private final String statusSakit;

    @SerializedName("statusUsaha")
    private final String statusUsaha;

    @SerializedName("statusVerklaring")
    private final String statusVerklaring;

    @SerializedName("workingUnit")
    private final String workingUnit;
    private static final byte[] $$c = {19, 78, 114, 113};
    private static final int $$f = 23;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {93, -122, -23, -24, 15, 1, -60, 60, 11, 3, -5, 8, -4, -52, 54, 16, -7, 17, 0, -3, -2, -51, 60, 9, 9, -66, 66, -9, 18, 6, -66, 66, 5, -8, 4, 10, -59, 37, 34, 0, 16, -15, 11, 2, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, -15, 10, 8, -7, 8, 8, -4, -27, 40, -5, 9, -8, 22, -12, 16, -62};
    private static final int $$e = 125;
    private static final byte[] $$a = {29, -5, -24, -13, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 248;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
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
    private static void a(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.data.jht.model.request.JhtInstantClaimRequest.$$a
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r9 = r9 * 52
            int r9 = 56 - r9
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2a:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-10)
            int r9 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.model.request.JhtInstantClaimRequest.a(int, short, byte, java.lang.Object[]):void");
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
    private static void d(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 38
            byte[] r0 = com.bpjstku.data.jht.model.request.JhtInstantClaimRequest.$$d
            int r6 = r6 * 15
            int r6 = 99 - r6
            int r8 = r8 * 40
            int r8 = 44 - r8
            byte[] r1 = new byte[r7]
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
            if (r4 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
        L28:
            int r8 = r8 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-3)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.model.request.JhtInstantClaimRequest.d(int, byte, int, java.lang.Object[]):void");
    }

    public final String getFile() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.file;
        int i5 = i3 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
        return str;
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.email;
        int i5 = i2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getNpwp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.npwp;
        int i5 = i3 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getClaimTypeCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.claimTypeCode;
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        return str;
    }

    public final String getClaimCauseCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.claimCauseCode;
        int i5 = i3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getStatusVerklaring() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.statusVerklaring;
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return str;
    }

    public final String getSignature() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.signature;
        int i5 = i2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getLayoffDocCode() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 != 0) {
            str = this.layoffDocCode;
            int i4 = 71 / 0;
        } else {
            str = this.layoffDocCode;
        }
        int i5 = i3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 73 / 0;
        }
        return str;
    }

    public final String getPosition() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.position;
        int i5 = i3 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return str;
    }

    public final String getWorkingUnit() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.workingUnit;
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        return str;
    }

    public final String getEmployeeAgreementNo() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.employeeAgreementNo;
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        return str;
    }

    public final String getEmployeeAgreementDate() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.employeeAgreementDate;
        int i4 = i2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getLayoffNo() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.layoffNo;
        int i5 = i2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLayoffDate() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 != 0) {
            str = this.layoffDate;
            int i4 = 14 / 0;
        } else {
            str = this.layoffDate;
        }
        int i5 = i3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getStatusUsaha() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.statusUsaha;
        int i5 = i2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getStatusSakit() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.statusSakit;
        int i4 = i3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getJenisPekerjaan1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.jenisPekerjaan1;
        int i5 = i3 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getJenisPekerjaan2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.jenisPekerjaan2;
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        return str;
    }

    public final String getLokasiPekerjaan() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 == 0) {
            str = this.lokasiPekerjaan;
            int i4 = 8 / 0;
        } else {
            str = this.lokasiPekerjaan;
        }
        int i5 = i3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getNomorKartuKeluarga() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.nomorKartuKeluarga;
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        return str;
    }

    public final String getKodeJenisIuranAktivasi() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.kodeJenisIuranAktivasi;
        int i4 = i3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getNominalIuranAktivasi() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.nominalIuranAktivasi;
        int i5 = i3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPathFileKtp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.pathFileKtp;
        int i5 = i3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
        return str;
    }

    public final String getFileKtp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.fileKtp;
        int i4 = i2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getFlagReaktivasiBpu() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.flagReaktivasiBpu;
        }
        throw null;
    }

    public final String getKodeAlasanTidakReaktivasi() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.kodeAlasanTidakReaktivasi;
        int i4 = i2 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getNamaAlasanTidakReaktivasi() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.namaAlasanTidakReaktivasi;
        int i5 = i3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLatitude() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.latitude;
        int i4 = i2 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getLongitude() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.longitude;
        int i5 = i2 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
        return str;
    }

    public final String getLocality() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.locality;
        int i4 = i3 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public JhtInstantClaimRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30) {
        Intrinsics.checkNotNullParameter(str, "");
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
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        this.file = str;
        this.email = str2;
        this.npwp = str3;
        this.claimTypeCode = str4;
        this.claimCauseCode = str5;
        this.statusVerklaring = str6;
        this.signature = str7;
        this.layoffDocCode = str8;
        this.position = str9;
        this.workingUnit = str10;
        this.employeeAgreementNo = str11;
        this.employeeAgreementDate = str12;
        this.layoffNo = str13;
        this.layoffDate = str14;
        this.statusUsaha = str15;
        this.statusSakit = str16;
        this.jenisPekerjaan1 = str17;
        this.jenisPekerjaan2 = str18;
        this.lokasiPekerjaan = str19;
        this.nomorKartuKeluarga = str20;
        this.kodeJenisIuranAktivasi = str21;
        this.nominalIuranAktivasi = str22;
        this.pathFileKtp = str23;
        this.fileKtp = str24;
        this.flagReaktivasiBpu = str25;
        this.kodeAlasanTidakReaktivasi = str26;
        this.namaAlasanTidakReaktivasi = str27;
        this.latitude = str28;
        this.longitude = str29;
        this.locality = str30;
    }

    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i5 = $10 + 117;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.getSize(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3291, 31 - View.MeasureSpec.getMode(0), 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (ViewConfiguration.getPressedStateDuration() >> 16) + 651, 44 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -450685997, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
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
            int i8 = $10 + 93;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (!(!z)) {
            int i10 = $10 + 49;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.getDefaultSize(0, 0), 651 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44, -450685997, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i12 = $11 + 1;
                $10 = i12 % 128;
                int i13 = i12 % 2;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
        int i14 = $10 + 119;
        $11 = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0266  */
    public final String component14() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char size = (char) (31533 - View.MeasureSpec.getSize(0));
            int i2 = 922 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int iRed = Color.red(0) + 28;
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr2 = new Object[1];
            a(b2, b2, bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, i2, iRed, -1048449946, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(false, 242 - View.resolveSizeAndState(0, 0, 0), 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), Color.blue(0) + 22, new char[]{65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b'}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(true, 246 - (ViewConfiguration.getLongPressTimeout() >> 16), 15 - View.resolveSizeAndState(0, 0, 0), 5 - TextUtils.lastIndexOf("", '0', 0, 0), new char[]{65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMyTid = (char) ((Process.myTid() >> 22) + 31533);
            int deadChar = 921 - KeyEvent.getDeadChar(0, 0);
            int iIndexOf = 27 - TextUtils.indexOf((CharSequence) "", '0');
            byte b3 = $$a[7];
            Object[] objArr5 = new Object[1];
            a(b3, (byte) 52, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, deadChar, iIndexOf, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31534);
                int iAlpha = 921 - Color.alpha(0);
                int i5 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[7];
                Object[] objArr6 = new Object[1];
                a(b4, (byte) (b4 | 36), bArr2[80], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iAlpha, i5, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = (-1200012581) + ((269582344 | i6) * (-192)) + (((~((-1336309588) | i6)) | 168187712) * (-384)) + (((~(iIdentityHashCode | 1605891931)) | (~(i6 | (-1168121876))) | (~((-168187713) | iIdentityHashCode))) * DerHeader.TAG_CLASS_PRIVATE) + 1132076819;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(false, 242 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 26, 3 - TextUtils.getOffsetAfter("", 0), new char[]{2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0, 17, 6, 19, 6, 17, 22, 65521, 5, 15}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(true, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 249, 18 - ExpandableListView.getPackedPositionType(0L), 11 - (ViewConfiguration.getJumpTapTimeout() >> 16), new char[]{2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b', 11, 65529, 4, 5, 65535, '\n', 65527, 65529, 65535}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                    if (i10 % 2 == 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        obj.hashCode();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                        int i12 = i11 % 2;
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                    int i14 = i13 % 2;
                }
            }
            Object[] objArr10 = new Object[1];
            c(false, 241 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 16 - (ViewConfiguration.getWindowTouchSlop() >> 8), 3 - (Process.myPid() >> 22), new char[]{18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(false, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 245, TextUtils.lastIndexOf("", '0') + 17, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15, new char[]{65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
            int i16 = i15 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1132076819};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[18];
                byte b6 = bArr3[5];
                Object[] objArr13 = new Object[1];
                d(b5, b6, b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr3[5];
                byte b8 = bArr3[18];
                Object[] objArr14 = new Object[1];
                d(b7, b8, b8, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (31533 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    int windowTouchSlop = 921 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int capsMode = 28 - TextUtils.getCapsMode("", 0, 0);
                    byte[] bArr4 = $$a;
                    byte b9 = bArr4[7];
                    Object[] objArr15 = new Object[1];
                    a(b9, (byte) (b9 | 36), bArr4[80], objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, windowTouchSlop, capsMode, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    c(false, TextUtils.lastIndexOf("", '0', 0, 0) + 243, 21 - ImageFormat.getBitsPerPixel(0), 22 - TextUtils.getCapsMode("", 0, 0), new char[]{65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b'}, objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(true, TextUtils.indexOf("", "", 0, 0) + 246, 15 - (KeyEvent.getMaxKeyCode() >> 16), Process.getGidForName("") + 7, new char[]{65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533}, objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31532);
                        int i17 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 922;
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 28;
                        byte b10 = $$a[7];
                        Object[] objArr18 = new Object[1];
                        a(b10, (byte) 52, b10, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, i17, iNormalizeMetaState, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char windowTouchSlop2 = (char) (31533 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                        int i18 = 921 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int iGreen = Color.green(0) + 28;
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        a(b11, b11, bArr5[7], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(windowTouchSlop2, i18, iGreen, -1048449946, false, (String) objArr19[0], null);
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
        int i19 = ((int[]) objArr[1])[0];
        int i20 = ((int[]) objArr[3])[0];
        if (i20 == i19) {
            int i21 = ((int[]) objArr[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iNextInt = new Random().nextInt(1365581835);
            int i22 = (-1174072355) + (((~((-99003267) | iNextInt)) | 69208194 | (~(1675076377 | iNextInt))) * (-754));
            int i23 = ~((-69208195) | iNextInt);
            int i24 = ~iNextInt;
            int i25 = i21 + i22 + ((i23 | (~(1744284571 | i24))) * (-754)) + ((i24 | (-99003267)) * 754);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr20[0])[0] = i27 ^ (i27 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i28 % 128;
                int i29 = i28 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i20];
            int i30 = i20 - 1;
            iArr[i30] = 1;
            Toast.makeText((Context) null, iArr[((i20 * i30) % 2) - 1], 1).show();
            int i31 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i32 = (int) Runtime.getRuntime().totalMemory();
            int i33 = i31 + 1702492072 + (((~(i32 | 444316320)) | (-1601944572)) * 305) + (((~((~i32) | 444316320)) | (-1329763324)) * 305);
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr21[0])[0] = i35 ^ (i35 << 5);
        }
        return this.layoffDate;
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ JhtInstantClaimRequest copy$default(JhtInstantClaimRequest jhtInstantClaimRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, int i, Object obj) {
        String str31;
        String str32;
        String str33;
        String str34;
        String str35;
        String str36;
        int i2 = 2 % 2;
        String str37 = (i & 1) != 0 ? jhtInstantClaimRequest.file : str;
        String str38 = (i & 2) != 0 ? jhtInstantClaimRequest.email : str2;
        String str39 = (i & 4) != 0 ? jhtInstantClaimRequest.npwp : str3;
        String str40 = (i & 8) != 0 ? jhtInstantClaimRequest.claimTypeCode : str4;
        String str41 = (i & 16) != 0 ? jhtInstantClaimRequest.claimCauseCode : str5;
        String str42 = (i & 32) != 0 ? jhtInstantClaimRequest.statusVerklaring : str6;
        String str43 = (i & 64) != 0 ? jhtInstantClaimRequest.signature : str7;
        String str44 = (i & 128) != 0 ? jhtInstantClaimRequest.layoffDocCode : str8;
        String str45 = (i & 256) != 0 ? jhtInstantClaimRequest.position : str9;
        if ((i & 512) != 0) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            str31 = jhtInstantClaimRequest.workingUnit;
        } else {
            str31 = str10;
        }
        String str46 = (i & 1024) != 0 ? jhtInstantClaimRequest.employeeAgreementNo : str11;
        if ((i & 2048) != 0) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 == 0) {
                String str47 = jhtInstantClaimRequest.employeeAgreementDate;
                throw null;
            }
            str32 = jhtInstantClaimRequest.employeeAgreementDate;
        } else {
            str32 = str12;
        }
        String str48 = (i & 4096) != 0 ? jhtInstantClaimRequest.layoffNo : str13;
        String str49 = (i & 8192) != 0 ? jhtInstantClaimRequest.layoffDate : str14;
        String str50 = (i & 16384) != 0 ? jhtInstantClaimRequest.statusUsaha : str15;
        String str51 = (i & 32768) != 0 ? jhtInstantClaimRequest.statusSakit : str16;
        String str52 = (i & 65536) != 0 ? jhtInstantClaimRequest.jenisPekerjaan1 : str17;
        if ((i & 131072) != 0) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            str33 = jhtInstantClaimRequest.jenisPekerjaan2;
        } else {
            str33 = str18;
        }
        String str53 = (262144 & i) != 0 ? jhtInstantClaimRequest.lokasiPekerjaan : str19;
        if ((i & 524288) != 0) {
            String str54 = jhtInstantClaimRequest.nomorKartuKeluarga;
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 5 % 3;
            }
            str34 = str54;
        } else {
            str34 = str20;
        }
        String str55 = (1048576 & i) != 0 ? jhtInstantClaimRequest.kodeJenisIuranAktivasi : str21;
        String str56 = (i & 2097152) != 0 ? jhtInstantClaimRequest.nominalIuranAktivasi : str22;
        String str57 = (i & 4194304) != 0 ? jhtInstantClaimRequest.pathFileKtp : str23;
        String str58 = (i & 8388608) != 0 ? jhtInstantClaimRequest.fileKtp : str24;
        String str59 = (i & 16777216) != 0 ? jhtInstantClaimRequest.flagReaktivasiBpu : str25;
        String str60 = (i & 33554432) != 0 ? jhtInstantClaimRequest.kodeAlasanTidakReaktivasi : str26;
        String str61 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? jhtInstantClaimRequest.namaAlasanTidakReaktivasi : str27;
        if ((i & 134217728) != 0) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
            int i11 = i10 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11;
            int i12 = i10 % 2;
            String str62 = jhtInstantClaimRequest.latitude;
            int i13 = i11 + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
            int i14 = i13 % 2;
            str35 = str62;
        } else {
            str35 = str28;
        }
        String str63 = (268435456 & i) != 0 ? jhtInstantClaimRequest.longitude : str29;
        if ((i & 536870912) != 0) {
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
            int i16 = i15 % 2;
            str36 = jhtInstantClaimRequest.locality;
        } else {
            str36 = str30;
        }
        return jhtInstantClaimRequest.copy(str37, str38, str39, str40, str41, str42, str43, str44, str45, str31, str46, str32, str48, str49, str50, str51, str52, str33, str53, str34, str55, str56, str57, str58, str59, str60, str61, str35, str63, str36);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.file;
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.workingUnit;
        int i5 = i3 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.employeeAgreementNo;
        int i5 = i2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.employeeAgreementDate;
        int i5 = i2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.layoffNo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.statusUsaha;
        int i5 = i2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.statusSakit;
        int i5 = i2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component17() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.jenisPekerjaan1;
        int i5 = i3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component18() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.jenisPekerjaan2;
        int i5 = i3 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component19() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.lokasiPekerjaan;
        int i5 = i3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.email;
        int i4 = i3 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component20() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.nomorKartuKeluarga;
        int i4 = i2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return str;
    }

    public final String component21() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.kodeJenisIuranAktivasi;
        int i5 = i2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component22() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.nominalIuranAktivasi;
        int i5 = i3 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component23() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.pathFileKtp;
            int i4 = 12 / 0;
        } else {
            str = this.pathFileKtp;
        }
        int i5 = i2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component24() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.fileKtp;
        int i4 = i3 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component25() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.flagReaktivasiBpu;
            int i4 = 28 / 0;
        } else {
            str = this.flagReaktivasiBpu;
        }
        int i5 = i2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component26() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.kodeAlasanTidakReaktivasi;
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return str;
    }

    public final String component27() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.namaAlasanTidakReaktivasi;
        int i4 = i3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component28() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.latitude;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component29() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.longitude;
        int i5 = i3 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 77 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.npwp;
        int i5 = i3 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component30() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.locality;
        int i4 = i3 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.claimTypeCode;
        int i5 = i2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.claimCauseCode;
        int i5 = i3 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.statusVerklaring;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.signature;
        int i5 = i2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.layoffDocCode;
        }
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.position;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final JhtInstantClaimRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String p16, String p17, String p18, String p19, String p20, String p21, String p22, String p23, String p24, String p25, String p26, String p27, String p28, String p29) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
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
        Intrinsics.checkNotNullParameter(p20, "");
        Intrinsics.checkNotNullParameter(p21, "");
        Intrinsics.checkNotNullParameter(p22, "");
        Intrinsics.checkNotNullParameter(p23, "");
        Intrinsics.checkNotNullParameter(p24, "");
        Intrinsics.checkNotNullParameter(p25, "");
        Intrinsics.checkNotNullParameter(p26, "");
        Intrinsics.checkNotNullParameter(p27, "");
        Intrinsics.checkNotNullParameter(p28, "");
        JhtInstantClaimRequest jhtInstantClaimRequest = new JhtInstantClaimRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return jhtInstantClaimRequest;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof JhtInstantClaimRequest)) {
            return false;
        }
        JhtInstantClaimRequest jhtInstantClaimRequest = (JhtInstantClaimRequest) p0;
        if (!Intrinsics.areEqual(this.file, jhtInstantClaimRequest.file)) {
            return false;
        }
        Object obj = null;
        if (!Intrinsics.areEqual(this.email, jhtInstantClaimRequest.email)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.npwp, jhtInstantClaimRequest.npwp)) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.claimTypeCode, jhtInstantClaimRequest.claimTypeCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.claimCauseCode, jhtInstantClaimRequest.claimCauseCode)) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.statusVerklaring, jhtInstantClaimRequest.statusVerklaring) || !Intrinsics.areEqual(this.signature, jhtInstantClaimRequest.signature) || !Intrinsics.areEqual(this.layoffDocCode, jhtInstantClaimRequest.layoffDocCode) || !Intrinsics.areEqual(this.position, jhtInstantClaimRequest.position) || !Intrinsics.areEqual(this.workingUnit, jhtInstantClaimRequest.workingUnit)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.employeeAgreementNo, jhtInstantClaimRequest.employeeAgreementNo)) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
            int i10 = i9 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
            if (i12 % 2 == 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.employeeAgreementDate, jhtInstantClaimRequest.employeeAgreementDate) || !Intrinsics.areEqual(this.layoffNo, jhtInstantClaimRequest.layoffNo)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.layoffDate, jhtInstantClaimRequest.layoffDate)) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.statusUsaha, jhtInstantClaimRequest.statusUsaha) || !Intrinsics.areEqual(this.statusSakit, jhtInstantClaimRequest.statusSakit) || !Intrinsics.areEqual(this.jenisPekerjaan1, jhtInstantClaimRequest.jenisPekerjaan1) || !Intrinsics.areEqual(this.jenisPekerjaan2, jhtInstantClaimRequest.jenisPekerjaan2)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.lokasiPekerjaan, jhtInstantClaimRequest.lokasiPekerjaan)) {
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.nomorKartuKeluarga, jhtInstantClaimRequest.nomorKartuKeluarga)) {
            int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
            int i18 = i17 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.kodeJenisIuranAktivasi, jhtInstantClaimRequest.kodeJenisIuranAktivasi) || !Intrinsics.areEqual(this.nominalIuranAktivasi, jhtInstantClaimRequest.nominalIuranAktivasi) || !Intrinsics.areEqual(this.pathFileKtp, jhtInstantClaimRequest.pathFileKtp) || !Intrinsics.areEqual(this.fileKtp, jhtInstantClaimRequest.fileKtp) || !Intrinsics.areEqual(this.flagReaktivasiBpu, jhtInstantClaimRequest.flagReaktivasiBpu) || !Intrinsics.areEqual(this.kodeAlasanTidakReaktivasi, jhtInstantClaimRequest.kodeAlasanTidakReaktivasi) || !Intrinsics.areEqual(this.namaAlasanTidakReaktivasi, jhtInstantClaimRequest.namaAlasanTidakReaktivasi)) {
            return false;
        }
        if (Intrinsics.areEqual(this.latitude, jhtInstantClaimRequest.latitude)) {
            return Intrinsics.areEqual(this.longitude, jhtInstantClaimRequest.longitude) && Intrinsics.areEqual(this.locality, jhtInstantClaimRequest.locality);
        }
        int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 % 128;
        int i20 = i19 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int iHashCode5 = this.file.hashCode();
        String str = this.email;
        if (str == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.npwp;
        if (str2 == null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.claimTypeCode;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.claimCauseCode;
        if (str4 == null) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        String str5 = this.statusVerklaring;
        if (str5 == null) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str5.hashCode();
        }
        String str6 = this.signature;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        int iHashCode8 = this.layoffDocCode.hashCode();
        int iHashCode9 = this.position.hashCode();
        int iHashCode10 = this.workingUnit.hashCode();
        int iHashCode11 = this.employeeAgreementNo.hashCode();
        int iHashCode12 = this.employeeAgreementDate.hashCode();
        int iHashCode13 = this.layoffNo.hashCode();
        int iHashCode14 = this.layoffDate.hashCode();
        int iHashCode15 = this.statusUsaha.hashCode();
        int iHashCode16 = this.statusSakit.hashCode();
        int iHashCode17 = this.jenisPekerjaan1.hashCode();
        int iHashCode18 = this.jenisPekerjaan2.hashCode();
        int iHashCode19 = this.lokasiPekerjaan.hashCode();
        int iHashCode20 = this.nomorKartuKeluarga.hashCode();
        int iHashCode21 = this.kodeJenisIuranAktivasi.hashCode();
        int iHashCode22 = this.nominalIuranAktivasi.hashCode();
        int iHashCode23 = this.pathFileKtp.hashCode();
        int iHashCode24 = this.fileKtp.hashCode();
        int iHashCode25 = this.flagReaktivasiBpu.hashCode();
        int iHashCode26 = this.kodeAlasanTidakReaktivasi.hashCode();
        int iHashCode27 = this.namaAlasanTidakReaktivasi.hashCode();
        int iHashCode28 = this.latitude.hashCode();
        int iHashCode29 = this.longitude.hashCode();
        String str7 = this.locality;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode6) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.file;
        String str2 = this.email;
        String str3 = this.npwp;
        String str4 = this.claimTypeCode;
        String str5 = this.claimCauseCode;
        String str6 = this.statusVerklaring;
        String str7 = this.signature;
        String str8 = this.layoffDocCode;
        String str9 = this.position;
        String str10 = this.workingUnit;
        String str11 = this.employeeAgreementNo;
        String str12 = this.employeeAgreementDate;
        String str13 = this.layoffNo;
        String str14 = this.layoffDate;
        String str15 = this.statusUsaha;
        String str16 = this.statusSakit;
        String str17 = this.jenisPekerjaan1;
        String str18 = this.jenisPekerjaan2;
        String str19 = this.lokasiPekerjaan;
        String str20 = this.nomorKartuKeluarga;
        String str21 = this.kodeJenisIuranAktivasi;
        String str22 = this.nominalIuranAktivasi;
        String str23 = this.pathFileKtp;
        String str24 = this.fileKtp;
        String str25 = this.flagReaktivasiBpu;
        String str26 = this.kodeAlasanTidakReaktivasi;
        String str27 = this.namaAlasanTidakReaktivasi;
        String str28 = this.latitude;
        String str29 = this.longitude;
        String str30 = this.locality;
        StringBuilder sb = new StringBuilder("JhtInstantClaimRequest(file=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", npwp=");
        sb.append(str3);
        sb.append(", claimTypeCode=");
        sb.append(str4);
        sb.append(", claimCauseCode=");
        sb.append(str5);
        sb.append(", statusVerklaring=");
        sb.append(str6);
        sb.append(", signature=");
        sb.append(str7);
        sb.append(", layoffDocCode=");
        sb.append(str8);
        sb.append(", position=");
        sb.append(str9);
        sb.append(", workingUnit=");
        sb.append(str10);
        sb.append(", employeeAgreementNo=");
        sb.append(str11);
        sb.append(", employeeAgreementDate=");
        sb.append(str12);
        sb.append(", layoffNo=");
        sb.append(str13);
        sb.append(", layoffDate=");
        sb.append(str14);
        sb.append(", statusUsaha=");
        sb.append(str15);
        sb.append(", statusSakit=");
        sb.append(str16);
        sb.append(", jenisPekerjaan1=");
        sb.append(str17);
        sb.append(", jenisPekerjaan2=");
        sb.append(str18);
        sb.append(", lokasiPekerjaan=");
        sb.append(str19);
        sb.append(", nomorKartuKeluarga=");
        sb.append(str20);
        sb.append(", kodeJenisIuranAktivasi=");
        sb.append(str21);
        sb.append(", nominalIuranAktivasi=");
        sb.append(str22);
        sb.append(", pathFileKtp=");
        sb.append(str23);
        sb.append(", fileKtp=");
        sb.append(str24);
        sb.append(", flagReaktivasiBpu=");
        sb.append(str25);
        sb.append(", kodeAlasanTidakReaktivasi=");
        sb.append(str26);
        sb.append(", namaAlasanTidakReaktivasi=");
        sb.append(str27);
        sb.append(", latitude=");
        sb.append(str28);
        sb.append(", longitude=");
        sb.append(str29);
        sb.append(", locality=");
        sb.append(str30);
        sb.append(")");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        b = -83722259;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, short r8, int r9) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 4
            byte[] r0 = com.bpjstku.data.jht.model.request.JhtInstantClaimRequest.$$c
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r9 = 120 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2b
        L15:
            r3 = r2
        L16:
            r6 = r9
            r9 = r8
            r8 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L2b:
            int r8 = r8 + 1
            int r9 = r9 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.model.request.JhtInstantClaimRequest.$$g(byte, short, int):java.lang.String");
    }
}
