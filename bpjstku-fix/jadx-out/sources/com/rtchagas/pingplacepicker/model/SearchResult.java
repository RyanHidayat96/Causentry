package com.rtchagas.pingplacepicker.model;

import androidx.core.app.NotificationCompat;
import defpackage.AutoValue_VideoSpec;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@AutoValue_VideoSpec(TuitionPaymentFragmentbindingInflater1 = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/rtchagas/pingplacepicker/model/SearchResult;", "", "", "Lcom/rtchagas/pingplacepicker/model/SimplePlace;", "p0", "", "p1", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "results", "Ljava/util/List;", NotificationCompat.CATEGORY_STATUS, "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0})
public final /* data */ class SearchResult {
    public final List<SimplePlace> results;
    public final String status;

    public SearchResult(List<SimplePlace> list, String str) {
        this.results = list;
        this.status = str;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SearchResult)) {
            return false;
        }
        SearchResult searchResult = (SearchResult) p0;
        return Intrinsics.areEqual(this.results, searchResult.results) && Intrinsics.areEqual(this.status, searchResult.status);
    }

    public final int hashCode() {
        List<SimplePlace> list = this.results;
        int iHashCode = list != null ? list.hashCode() : 0;
        String str = this.status;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchResult(results=");
        sb.append(this.results);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(")");
        return sb.toString();
    }
}
