package com.bpjstku.data.country.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÇ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/bpjstku/data/country/model/response/CountryResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "Lcom/bpjstku/data/country/model/response/CountryItem;", "p0", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/bpjstku/data/country/model/response/CountryResponse;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "country", "Ljava/util/List;", "getCountry"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CountryResponse extends BaseItem {
    public static final int $stable = 8;

    @SerializedName("country")
    private final List<CountryItem> country;

    public final List<CountryItem> getCountry() {
        return this.country;
    }

    public CountryResponse(List<CountryItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.country = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CountryResponse copy$default(CountryResponse countryResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = countryResponse.country;
        }
        return countryResponse.copy(list);
    }

    public final List<CountryItem> component1() {
        return this.country;
    }

    public final CountryResponse copy(List<CountryItem> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new CountryResponse(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof CountryResponse) && Intrinsics.areEqual(this.country, ((CountryResponse) p0).country);
    }

    public final int hashCode() {
        return this.country.hashCode();
    }

    public final String toString() {
        List<CountryItem> list = this.country;
        StringBuilder sb = new StringBuilder("CountryResponse(country=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
