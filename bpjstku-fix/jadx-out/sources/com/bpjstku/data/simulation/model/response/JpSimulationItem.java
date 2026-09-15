package com.bpjstku.data.simulation.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/bpjstku/data/simulation/model/response/JpSimulationItem;", "", "Lcom/bpjstku/data/simulation/model/response/SimulasiJp;", "p0", "<init>", "(Lcom/bpjstku/data/simulation/model/response/SimulasiJp;)V", "component1", "()Lcom/bpjstku/data/simulation/model/response/SimulasiJp;", "copy", "(Lcom/bpjstku/data/simulation/model/response/SimulasiJp;)Lcom/bpjstku/data/simulation/model/response/JpSimulationItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "simulasiJp", "Lcom/bpjstku/data/simulation/model/response/SimulasiJp;", "getSimulasiJp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JpSimulationItem {
    public static final int $stable = 0;

    @SerializedName("simulasiJp")
    private final SimulasiJp simulasiJp;

    public JpSimulationItem(SimulasiJp simulasiJp) {
        Intrinsics.checkNotNullParameter(simulasiJp, "");
        this.simulasiJp = simulasiJp;
    }

    public final SimulasiJp getSimulasiJp() {
        return this.simulasiJp;
    }

    public static /* synthetic */ JpSimulationItem copy$default(JpSimulationItem jpSimulationItem, SimulasiJp simulasiJp, int i, Object obj) {
        if ((i & 1) != 0) {
            simulasiJp = jpSimulationItem.simulasiJp;
        }
        return jpSimulationItem.copy(simulasiJp);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SimulasiJp getSimulasiJp() {
        return this.simulasiJp;
    }

    public final JpSimulationItem copy(SimulasiJp p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new JpSimulationItem(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof JpSimulationItem) && Intrinsics.areEqual(this.simulasiJp, ((JpSimulationItem) p0).simulasiJp);
    }

    public final int hashCode() {
        return this.simulasiJp.hashCode();
    }

    public final String toString() {
        SimulasiJp simulasiJp = this.simulasiJp;
        StringBuilder sb = new StringBuilder("JpSimulationItem(simulasiJp=");
        sb.append(simulasiJp);
        sb.append(")");
        return sb.toString();
    }
}
