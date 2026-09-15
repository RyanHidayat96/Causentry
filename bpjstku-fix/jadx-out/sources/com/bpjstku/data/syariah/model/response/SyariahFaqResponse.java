package com.bpjstku.data.syariah.model.response;

import android.content.Context;
import com.bpjstku.data.lib.model.BaseItem;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/bpjstku/data/syariah/model/response/SyariahFaqResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "Lcom/bpjstku/data/syariah/model/response/SyariahFaqItem;", "p0", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/bpjstku/data/syariah/model/response/SyariahFaqResponse;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/List;", "getData"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SyariahFaqResponse extends BaseItem {
    public static final int $stable = 8;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static int b;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final List<SyariahFaqItem> data;

    public final List<SyariahFaqItem> getData() {
        return this.data;
    }

    public SyariahFaqResponse(List<SyariahFaqItem> list) {
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyariahFaqResponse copy$default(SyariahFaqResponse syariahFaqResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = syariahFaqResponse.data;
        }
        return syariahFaqResponse.copy(list);
    }

    public final List<SyariahFaqItem> component1() {
        return this.data;
    }

    public final SyariahFaqResponse copy(List<SyariahFaqItem> p0) {
        return new SyariahFaqResponse(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof SyariahFaqResponse) && Intrinsics.areEqual(this.data, ((SyariahFaqResponse) p0).data);
    }

    public final int hashCode() {
        List<SyariahFaqItem> list = this.data;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        List<SyariahFaqItem> list = this.data;
        StringBuilder sb = new StringBuilder("SyariahFaqResponse(data=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 6536803;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
        b = i3;
        return i3;
    }
}
