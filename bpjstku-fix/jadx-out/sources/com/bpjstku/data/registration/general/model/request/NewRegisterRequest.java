package com.bpjstku.data.registration.general.model.request;

import androidx.autofill.HintConstants;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import defpackage.createCameraSelectorById;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u0001Bí\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\"J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\"J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\"J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\"J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\"J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\"J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\"J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\"J\u0012\u00100\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b2\u00101J\u0012\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b3\u00101J\u0012\u00104\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b4\u00101J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010\"J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010\"J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010\"J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010\"J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010\"J¤\u0002\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010>\u001a\u00020=2\b\u0010\u0003\u001a\u0004\u0018\u00010<HÖ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010A\u001a\u00020@HÖ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0002H×\u0001¢\u0006\u0004\bC\u0010\"R\u001c\u0010D\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010\"R\u001c\u0010G\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010E\u001a\u0004\bH\u0010\"R\u001c\u0010I\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010E\u001a\u0004\bJ\u0010\"R\u001c\u0010K\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010E\u001a\u0004\bL\u0010\"R\u001c\u0010M\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010E\u001a\u0004\bN\u0010\"R\u001c\u0010O\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010E\u001a\u0004\bP\u0010\"R\u001c\u0010Q\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010E\u001a\u0004\bR\u0010\"R\u001c\u0010S\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010E\u001a\u0004\bT\u0010\"R\u001c\u0010U\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010E\u001a\u0004\bV\u0010\"R\u001c\u0010W\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010E\u001a\u0004\bX\u0010\"R\u001c\u0010Y\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010E\u001a\u0004\bZ\u0010\"R\u001c\u0010[\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010E\u001a\u0004\b\\\u0010\"R\u001c\u0010]\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010E\u001a\u0004\b^\u0010\"R\u001c\u0010_\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010E\u001a\u0004\b`\u0010\"R\u001c\u0010a\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u00101R\u001c\u0010d\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010b\u001a\u0004\be\u00101R\u001c\u0010f\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010b\u001a\u0004\bg\u00101R\u001c\u0010h\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010b\u001a\u0004\bi\u00101R\u001c\u0010j\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010E\u001a\u0004\bk\u0010\"R\u001c\u0010l\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010E\u001a\u0004\bm\u0010\"R\u001c\u0010n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bn\u0010E\u001a\u0004\bo\u0010\"R\u001c\u0010p\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bp\u0010E\u001a\u0004\bq\u0010\"R\u001c\u0010r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\br\u0010E\u001a\u0004\bs\u0010\""}, d2 = {"Lcom/bpjstku/data/registration/general/model/request/NewRegisterRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "Ljava/io/File;", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "Lokhttp3/RequestBody;", "getPartMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "()Ljava/io/File;", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/registration/general/model/request/NewRegisterRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "deviceId", "Ljava/lang/String;", "getDeviceId", "email", "getEmail", "kewarganegaraan", "getKewarganegaraan", "kodeSegmen", "getKodeSegmen", "kpj", "getKpj", "namaTk", "getNamaTk", "nik", "getNik", "noHp", "getNoHp", "passpor", "getPasspor", HintConstants.AUTOFILL_HINT_PASSWORD, "getPassword", "registerId", "getRegisterId", "tglLahir", "getTglLahir", "checkSum", "getCheckSum", "biometricStatus", "getBiometricStatus", "file", "Ljava/io/File;", "getFile", "file2", "getFile2", "file3", "getFile3", "fileKtp", "getFileKtp", "latitude", "getLatitude", "longitude", "getLongitude", PlaceTypes.LOCALITY, "getLocality", "deviceBrand", "getDeviceBrand", "deviceModel", "getDeviceModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class NewRegisterRequest extends BaseRequest {
    public static final int $stable = 8;

    @SerializedName("biometricStatus")
    private final String biometricStatus;

    @SerializedName("checkSum")
    private final String checkSum;

    @SerializedName("deviceBrand")
    private final String deviceBrand;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("deviceModel")
    private final String deviceModel;

    @SerializedName("email")
    private final String email;

    @SerializedName("file")
    private final File file;

    @SerializedName("file2")
    private final File file2;

    @SerializedName("file3")
    private final File file3;

    @SerializedName("fileKtp")
    private final File fileKtp;

    @SerializedName("kewarganegaraan")
    private final String kewarganegaraan;

    @SerializedName("kodeSegmen")
    private final String kodeSegmen;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("latitude")
    private final String latitude;

    @SerializedName(PlaceTypes.LOCALITY)
    private final String locality;

    @SerializedName("longitude")
    private final String longitude;

    @SerializedName("namaTk")
    private final String namaTk;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("noHp")
    private final String noHp;

    @SerializedName("passpor")
    private final String passpor;

    @SerializedName(HintConstants.AUTOFILL_HINT_PASSWORD)
    private final String password;

    @SerializedName("registerId")
    private final String registerId;

    @SerializedName("tglLahir")
    private final String tglLahir;

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getKewarganegaraan() {
        return this.kewarganegaraan;
    }

    public final String getKodeSegmen() {
        return this.kodeSegmen;
    }

    public final String getKpj() {
        return this.kpj;
    }

    public final String getNamaTk() {
        return this.namaTk;
    }

    public final String getNik() {
        return this.nik;
    }

    public final String getNoHp() {
        return this.noHp;
    }

    public final String getPasspor() {
        return this.passpor;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getRegisterId() {
        return this.registerId;
    }

    public final String getTglLahir() {
        return this.tglLahir;
    }

    public final String getCheckSum() {
        return this.checkSum;
    }

    public final String getBiometricStatus() {
        return this.biometricStatus;
    }

    public final File getFile() {
        return this.file;
    }

    public final File getFile2() {
        return this.file2;
    }

    public final File getFile3() {
        return this.file3;
    }

    public final File getFileKtp() {
        return this.fileKtp;
    }

    public final String getLatitude() {
        return this.latitude;
    }

    public final String getLongitude() {
        return this.longitude;
    }

    public final String getLocality() {
        return this.locality;
    }

    public final String getDeviceBrand() {
        return this.deviceBrand;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public NewRegisterRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, File file, File file2, File file3, File file4, String str15, String str16, String str17, String str18, String str19) {
        this.deviceId = str;
        this.email = str2;
        this.kewarganegaraan = str3;
        this.kodeSegmen = str4;
        this.kpj = str5;
        this.namaTk = str6;
        this.nik = str7;
        this.noHp = str8;
        this.passpor = str9;
        this.password = str10;
        this.registerId = str11;
        this.tglLahir = str12;
        this.checkSum = str13;
        this.biometricStatus = str14;
        this.file = file;
        this.file2 = file2;
        this.file3 = file3;
        this.fileKtp = file4;
        this.latitude = str15;
        this.longitude = str16;
        this.locality = str17;
        this.deviceBrand = str18;
        this.deviceModel = str19;
    }

    public final Map<String, RequestBody> getPartMap() {
        Map<String, Object> mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("file");
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("file2");
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("file3");
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("fileKtp");
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

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRegisterId() {
        return this.registerId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTglLahir() {
        return this.tglLahir;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCheckSum() {
        return this.checkSum;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getBiometricStatus() {
        return this.biometricStatus;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final File getFile2() {
        return this.file2;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final File getFile3() {
        return this.file3;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final File getFileKtp() {
        return this.fileKtp;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getLocality() {
        return this.locality;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getDeviceBrand() {
        return this.deviceBrand;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKewarganegaraan() {
        return this.kewarganegaraan;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKodeSegmen() {
        return this.kodeSegmen;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getKpj() {
        return this.kpj;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNamaTk() {
        return this.namaTk;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNoHp() {
        return this.noHp;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPasspor() {
        return this.passpor;
    }

    public final NewRegisterRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, File p14, File p15, File p16, File p17, String p18, String p19, String p20, String p21, String p22) {
        return new NewRegisterRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof NewRegisterRequest)) {
            return false;
        }
        NewRegisterRequest newRegisterRequest = (NewRegisterRequest) p0;
        return Intrinsics.areEqual(this.deviceId, newRegisterRequest.deviceId) && Intrinsics.areEqual(this.email, newRegisterRequest.email) && Intrinsics.areEqual(this.kewarganegaraan, newRegisterRequest.kewarganegaraan) && Intrinsics.areEqual(this.kodeSegmen, newRegisterRequest.kodeSegmen) && Intrinsics.areEqual(this.kpj, newRegisterRequest.kpj) && Intrinsics.areEqual(this.namaTk, newRegisterRequest.namaTk) && Intrinsics.areEqual(this.nik, newRegisterRequest.nik) && Intrinsics.areEqual(this.noHp, newRegisterRequest.noHp) && Intrinsics.areEqual(this.passpor, newRegisterRequest.passpor) && Intrinsics.areEqual(this.password, newRegisterRequest.password) && Intrinsics.areEqual(this.registerId, newRegisterRequest.registerId) && Intrinsics.areEqual(this.tglLahir, newRegisterRequest.tglLahir) && Intrinsics.areEqual(this.checkSum, newRegisterRequest.checkSum) && Intrinsics.areEqual(this.biometricStatus, newRegisterRequest.biometricStatus) && Intrinsics.areEqual(this.file, newRegisterRequest.file) && Intrinsics.areEqual(this.file2, newRegisterRequest.file2) && Intrinsics.areEqual(this.file3, newRegisterRequest.file3) && Intrinsics.areEqual(this.fileKtp, newRegisterRequest.fileKtp) && Intrinsics.areEqual(this.latitude, newRegisterRequest.latitude) && Intrinsics.areEqual(this.longitude, newRegisterRequest.longitude) && Intrinsics.areEqual(this.locality, newRegisterRequest.locality) && Intrinsics.areEqual(this.deviceBrand, newRegisterRequest.deviceBrand) && Intrinsics.areEqual(this.deviceModel, newRegisterRequest.deviceModel);
    }

    public final int hashCode() {
        String str = this.deviceId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.email;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.kewarganegaraan;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.kodeSegmen;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.kpj;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.namaTk;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.nik;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.noHp;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.passpor;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.password;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.registerId;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.tglLahir;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.checkSum;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.biometricStatus;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        File file = this.file;
        int iHashCode15 = file == null ? 0 : file.hashCode();
        File file2 = this.file2;
        int iHashCode16 = file2 == null ? 0 : file2.hashCode();
        File file3 = this.file3;
        int iHashCode17 = file3 == null ? 0 : file3.hashCode();
        File file4 = this.fileKtp;
        int iHashCode18 = file4 == null ? 0 : file4.hashCode();
        String str15 = this.latitude;
        int iHashCode19 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.longitude;
        int iHashCode20 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.locality;
        int iHashCode21 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.deviceBrand;
        int iHashCode22 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.deviceModel;
        return (((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + (str19 != null ? str19.hashCode() : 0);
    }

    public final String toString() {
        String str = this.deviceId;
        String str2 = this.email;
        String str3 = this.kewarganegaraan;
        String str4 = this.kodeSegmen;
        String str5 = this.kpj;
        String str6 = this.namaTk;
        String str7 = this.nik;
        String str8 = this.noHp;
        String str9 = this.passpor;
        String str10 = this.password;
        String str11 = this.registerId;
        String str12 = this.tglLahir;
        String str13 = this.checkSum;
        String str14 = this.biometricStatus;
        File file = this.file;
        File file2 = this.file2;
        File file3 = this.file3;
        File file4 = this.fileKtp;
        String str15 = this.latitude;
        String str16 = this.longitude;
        String str17 = this.locality;
        String str18 = this.deviceBrand;
        String str19 = this.deviceModel;
        StringBuilder sb = new StringBuilder("NewRegisterRequest(deviceId=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", kewarganegaraan=");
        sb.append(str3);
        sb.append(", kodeSegmen=");
        sb.append(str4);
        sb.append(", kpj=");
        sb.append(str5);
        sb.append(", namaTk=");
        sb.append(str6);
        sb.append(", nik=");
        sb.append(str7);
        sb.append(", noHp=");
        sb.append(str8);
        sb.append(", passpor=");
        sb.append(str9);
        sb.append(", password=");
        sb.append(str10);
        sb.append(", registerId=");
        sb.append(str11);
        sb.append(", tglLahir=");
        sb.append(str12);
        sb.append(", checkSum=");
        sb.append(str13);
        sb.append(", biometricStatus=");
        sb.append(str14);
        sb.append(", file=");
        sb.append(file);
        sb.append(", file2=");
        sb.append(file2);
        sb.append(", file3=");
        sb.append(file3);
        sb.append(", fileKtp=");
        sb.append(file4);
        sb.append(", latitude=");
        sb.append(str15);
        sb.append(", longitude=");
        sb.append(str16);
        sb.append(", locality=");
        sb.append(str17);
        sb.append(", deviceBrand=");
        sb.append(str18);
        sb.append(", deviceModel=");
        sb.append(str19);
        sb.append(")");
        return sb.toString();
    }
}
