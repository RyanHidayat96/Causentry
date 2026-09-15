package com.rtchagas.pingplacepicker.model;

import defpackage.AutoValue_StreamInfo;
import defpackage.AutoValue_VideoSpec;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@AutoValue_VideoSpec(TuitionPaymentFragmentbindingInflater1 = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/rtchagas/pingplacepicker/model/SimplePlace;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/rtchagas/pingplacepicker/model/SimplePlace;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "placeId", "Ljava/lang/String;", "types", "Ljava/util/List;"}, k = 1, mv = {2, 3, 0})
public final /* data */ class SimplePlace {
    public final String placeId;
    final List<String> types;

    public SimplePlace(@AutoValue_StreamInfo(TuitionPaymentFragmentspecialinlinedviewModeldefault3 = "place_id") String str, List<String> list) {
        this.placeId = str;
        this.types = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SimplePlace copy$default(SimplePlace simplePlace, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simplePlace.placeId;
        }
        if ((i & 2) != 0) {
            list = simplePlace.types;
        }
        return simplePlace.copy(str, list);
    }

    public final SimplePlace copy(@AutoValue_StreamInfo(TuitionPaymentFragmentspecialinlinedviewModeldefault3 = "place_id") String p0, List<String> p1) {
        return new SimplePlace(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SimplePlace)) {
            return false;
        }
        SimplePlace simplePlace = (SimplePlace) p0;
        return Intrinsics.areEqual(this.placeId, simplePlace.placeId) && Intrinsics.areEqual(this.types, simplePlace.types);
    }

    public final int hashCode() {
        String str = this.placeId;
        int iHashCode = str != null ? str.hashCode() : 0;
        List<String> list = this.types;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimplePlace(placeId=");
        sb.append(this.placeId);
        sb.append(", types=");
        sb.append(this.types);
        sb.append(")");
        return sb.toString();
    }
}
