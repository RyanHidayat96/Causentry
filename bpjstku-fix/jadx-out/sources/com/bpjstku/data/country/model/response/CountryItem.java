package com.bpjstku.data.country.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\tR\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/bpjstku/data/country/model/response/CountryItem;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/country/model/response/CountryItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "code", "Ljava/lang/String;", "getCode", "dialCode", "getDialCode", "name", "getName"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CountryItem {
    public static final int $stable = 0;

    @SerializedName("code")
    private final String code;

    @SerializedName("dialCode")
    private final String dialCode;

    @SerializedName("name")
    private final String name;

    public CountryItem(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.code = str;
        this.dialCode = str2;
        this.name = str3;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDialCode() {
        return this.dialCode;
    }

    public final String getName() {
        return this.name;
    }

    public static /* synthetic */ CountryItem copy$default(CountryItem countryItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = countryItem.code;
        }
        if ((i & 2) != 0) {
            str2 = countryItem.dialCode;
        }
        if ((i & 4) != 0) {
            str3 = countryItem.name;
        }
        return countryItem.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDialCode() {
        return this.dialCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final CountryItem copy(String p0, String p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new CountryItem(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CountryItem)) {
            return false;
        }
        CountryItem countryItem = (CountryItem) p0;
        return Intrinsics.areEqual(this.code, countryItem.code) && Intrinsics.areEqual(this.dialCode, countryItem.dialCode) && Intrinsics.areEqual(this.name, countryItem.name);
    }

    public final int hashCode() {
        return (((this.code.hashCode() * 31) + this.dialCode.hashCode()) * 31) + this.name.hashCode();
    }

    public final String toString() {
        String str = this.code;
        String str2 = this.dialCode;
        String str3 = this.name;
        StringBuilder sb = new StringBuilder("CountryItem(code=");
        sb.append(str);
        sb.append(", dialCode=");
        sb.append(str2);
        sb.append(", name=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
