package com.bpjstku.data.bsu.model.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010!\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000f"}, d2 = {"Lcom/bpjstku/data/bsu/model/request/UpdateRekeningBsuRequest;", "", "Lcom/bpjstku/data/bsu/model/request/DataRekening;", "p0", "Lcom/bpjstku/data/bsu/model/request/DataKantor;", "p1", "Lcom/bpjstku/data/bsu/model/request/DataPekerja;", "p2", "<init>", "(Lcom/bpjstku/data/bsu/model/request/DataRekening;Lcom/bpjstku/data/bsu/model/request/DataKantor;Lcom/bpjstku/data/bsu/model/request/DataPekerja;)V", "component1", "()Lcom/bpjstku/data/bsu/model/request/DataRekening;", "component2", "()Lcom/bpjstku/data/bsu/model/request/DataKantor;", "component3", "()Lcom/bpjstku/data/bsu/model/request/DataPekerja;", "copy", "(Lcom/bpjstku/data/bsu/model/request/DataRekening;Lcom/bpjstku/data/bsu/model/request/DataKantor;Lcom/bpjstku/data/bsu/model/request/DataPekerja;)Lcom/bpjstku/data/bsu/model/request/UpdateRekeningBsuRequest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "dataRekening", "Lcom/bpjstku/data/bsu/model/request/DataRekening;", "getDataRekening", "dataKantor", "Lcom/bpjstku/data/bsu/model/request/DataKantor;", "getDataKantor", "dataPekerja", "Lcom/bpjstku/data/bsu/model/request/DataPekerja;", "getDataPekerja"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UpdateRekeningBsuRequest {
    public static final int $stable = 0;

    @SerializedName("kantor")
    private final DataKantor dataKantor;

    @SerializedName("pekerja")
    private final DataPekerja dataPekerja;

    @SerializedName("rekening")
    private final DataRekening dataRekening;

    public UpdateRekeningBsuRequest(DataRekening dataRekening, DataKantor dataKantor, DataPekerja dataPekerja) {
        Intrinsics.checkNotNullParameter(dataRekening, "");
        Intrinsics.checkNotNullParameter(dataKantor, "");
        Intrinsics.checkNotNullParameter(dataPekerja, "");
        this.dataRekening = dataRekening;
        this.dataKantor = dataKantor;
        this.dataPekerja = dataPekerja;
    }

    public final DataRekening getDataRekening() {
        return this.dataRekening;
    }

    public final DataKantor getDataKantor() {
        return this.dataKantor;
    }

    public final DataPekerja getDataPekerja() {
        return this.dataPekerja;
    }

    public static /* synthetic */ UpdateRekeningBsuRequest copy$default(UpdateRekeningBsuRequest updateRekeningBsuRequest, DataRekening dataRekening, DataKantor dataKantor, DataPekerja dataPekerja, int i, Object obj) {
        if ((i & 1) != 0) {
            dataRekening = updateRekeningBsuRequest.dataRekening;
        }
        if ((i & 2) != 0) {
            dataKantor = updateRekeningBsuRequest.dataKantor;
        }
        if ((i & 4) != 0) {
            dataPekerja = updateRekeningBsuRequest.dataPekerja;
        }
        return updateRekeningBsuRequest.copy(dataRekening, dataKantor, dataPekerja);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DataRekening getDataRekening() {
        return this.dataRekening;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DataKantor getDataKantor() {
        return this.dataKantor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DataPekerja getDataPekerja() {
        return this.dataPekerja;
    }

    public final UpdateRekeningBsuRequest copy(DataRekening p0, DataKantor p1, DataPekerja p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new UpdateRekeningBsuRequest(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof UpdateRekeningBsuRequest)) {
            return false;
        }
        UpdateRekeningBsuRequest updateRekeningBsuRequest = (UpdateRekeningBsuRequest) p0;
        return Intrinsics.areEqual(this.dataRekening, updateRekeningBsuRequest.dataRekening) && Intrinsics.areEqual(this.dataKantor, updateRekeningBsuRequest.dataKantor) && Intrinsics.areEqual(this.dataPekerja, updateRekeningBsuRequest.dataPekerja);
    }

    public final int hashCode() {
        return (((this.dataRekening.hashCode() * 31) + this.dataKantor.hashCode()) * 31) + this.dataPekerja.hashCode();
    }

    public final String toString() {
        DataRekening dataRekening = this.dataRekening;
        DataKantor dataKantor = this.dataKantor;
        DataPekerja dataPekerja = this.dataPekerja;
        StringBuilder sb = new StringBuilder("UpdateRekeningBsuRequest(dataRekening=");
        sb.append(dataRekening);
        sb.append(", dataKantor=");
        sb.append(dataKantor);
        sb.append(", dataPekerja=");
        sb.append(dataPekerja);
        sb.append(")");
        return sb.toString();
    }
}
