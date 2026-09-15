package com.bpjstku.data.setting.model.request;

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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/bpjstku/data/setting/model/request/ChangeProfilePictureRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "Ljava/io/File;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V", "", "Lokhttp3/RequestBody;", "getPartMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/io/File;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Lcom/bpjstku/data/setting/model/request/ChangeProfilePictureRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "imagePath", "Ljava/lang/String;", "getImagePath", "email", "getEmail", "profilePictureImageFile", "Ljava/io/File;", "getProfilePictureImageFile"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ChangeProfilePictureRequest extends BaseRequest {
    public static final int $stable = 8;

    @SerializedName("email")
    private final String email;

    @SerializedName("pathImageOld")
    private final String imagePath;

    @SerializedName("foto")
    private final File profilePictureImageFile;

    public final String getImagePath() {
        return this.imagePath;
    }

    public final String getEmail() {
        return this.email;
    }

    public final File getProfilePictureImageFile() {
        return this.profilePictureImageFile;
    }

    public ChangeProfilePictureRequest(String str, String str2, File file) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(file, "");
        this.imagePath = str;
        this.email = str2;
        this.profilePictureImageFile = file;
    }

    public final Map<String, RequestBody> getPartMap() {
        Map<String, Object> mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("foto");
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

    public static /* synthetic */ ChangeProfilePictureRequest copy$default(ChangeProfilePictureRequest changeProfilePictureRequest, String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changeProfilePictureRequest.imagePath;
        }
        if ((i & 2) != 0) {
            str2 = changeProfilePictureRequest.email;
        }
        if ((i & 4) != 0) {
            file = changeProfilePictureRequest.profilePictureImageFile;
        }
        return changeProfilePictureRequest.copy(str, str2, file);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImagePath() {
        return this.imagePath;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final File getProfilePictureImageFile() {
        return this.profilePictureImageFile;
    }

    public final ChangeProfilePictureRequest copy(String p0, String p1, File p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new ChangeProfilePictureRequest(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ChangeProfilePictureRequest)) {
            return false;
        }
        ChangeProfilePictureRequest changeProfilePictureRequest = (ChangeProfilePictureRequest) p0;
        return Intrinsics.areEqual(this.imagePath, changeProfilePictureRequest.imagePath) && Intrinsics.areEqual(this.email, changeProfilePictureRequest.email) && Intrinsics.areEqual(this.profilePictureImageFile, changeProfilePictureRequest.profilePictureImageFile);
    }

    public final int hashCode() {
        return (((this.imagePath.hashCode() * 31) + this.email.hashCode()) * 31) + this.profilePictureImageFile.hashCode();
    }

    public final String toString() {
        String str = this.imagePath;
        String str2 = this.email;
        File file = this.profilePictureImageFile;
        StringBuilder sb = new StringBuilder("ChangeProfilePictureRequest(imagePath=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", profilePictureImageFile=");
        sb.append(file);
        sb.append(")");
        return sb.toString();
    }
}
