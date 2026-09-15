package com.bpjstku.data.jht.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\"\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0010"}, d2 = {"Lcom/bpjstku/data/jht/model/request/CheckIdFacelivenessRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "Ljava/io/File;", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/io/File;Ljava/io/File;)V", "", "Lokhttp3/RequestBody;", "getPartMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/io/File;", "component3", "copy", "(Ljava/lang/String;Ljava/io/File;Ljava/io/File;)Lcom/bpjstku/data/jht/model/request/CheckIdFacelivenessRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "nik", "Ljava/lang/String;", "getNik", "photo", "Ljava/io/File;", "getPhoto", "idPhoto", "getIdPhoto"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CheckIdFacelivenessRequest extends BaseRequest {
    public static final int $stable = 8;

    @SerializedName("fotoKtp")
    private final File idPhoto;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("foto")
    private final File photo;

    public final String getNik() {
        return this.nik;
    }

    public final File getPhoto() {
        return this.photo;
    }

    public final File getIdPhoto() {
        return this.idPhoto;
    }

    public CheckIdFacelivenessRequest(String str, File file, File file2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(file2, "");
        this.nik = str;
        this.photo = file;
        this.idPhoto = file2;
    }

    public final Map<String, RequestBody> getPartMap() {
        Map<String, Object> mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("foto");
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("fotoKtp");
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

    public static /* synthetic */ CheckIdFacelivenessRequest copy$default(CheckIdFacelivenessRequest checkIdFacelivenessRequest, String str, File file, File file2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkIdFacelivenessRequest.nik;
        }
        if ((i & 2) != 0) {
            file = checkIdFacelivenessRequest.photo;
        }
        if ((i & 4) != 0) {
            file2 = checkIdFacelivenessRequest.idPhoto;
        }
        return checkIdFacelivenessRequest.copy(str, file, file2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final File getPhoto() {
        return this.photo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final File getIdPhoto() {
        return this.idPhoto;
    }

    public final CheckIdFacelivenessRequest copy(String p0, File p1, File p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new CheckIdFacelivenessRequest(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CheckIdFacelivenessRequest)) {
            return false;
        }
        CheckIdFacelivenessRequest checkIdFacelivenessRequest = (CheckIdFacelivenessRequest) p0;
        return Intrinsics.areEqual(this.nik, checkIdFacelivenessRequest.nik) && Intrinsics.areEqual(this.photo, checkIdFacelivenessRequest.photo) && Intrinsics.areEqual(this.idPhoto, checkIdFacelivenessRequest.idPhoto);
    }

    public final int hashCode() {
        return (((this.nik.hashCode() * 31) + this.photo.hashCode()) * 31) + this.idPhoto.hashCode();
    }

    public final String toString() {
        String str = this.nik;
        File file = this.photo;
        File file2 = this.idPhoto;
        StringBuilder sb = new StringBuilder("CheckIdFacelivenessRequest(nik=");
        sb.append(str);
        sb.append(", photo=");
        sb.append(file);
        sb.append(", idPhoto=");
        sb.append(file2);
        sb.append(")");
        return sb.toString();
    }
}
