package com.bpjstku.data.config.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/bpjstku/data/config/model/RegisterParticipantConfig;", "", "", "p0", "p1", "p2", "<init>", "(ZZZ)V", "component1", "()Z", "component2", "component3", "copy", "(ZZZ)Lcom/bpjstku/data/config/model/RegisterParticipantConfig;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "hidePu", "Z", "getHidePu", "hideBpu", "getHideBpu", "hidePmi", "getHidePmi"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RegisterParticipantConfig {
    public static final int $stable = 0;

    @SerializedName("hide_bpu")
    public boolean hideBpu;

    @SerializedName("hide_pmi")
    public boolean hidePmi;

    @SerializedName("hide_pu")
    public boolean hidePu;

    public RegisterParticipantConfig(boolean z, boolean z2, boolean z3) {
        this.hidePu = z;
        this.hideBpu = z2;
        this.hidePmi = z3;
    }

    public /* synthetic */ RegisterParticipantConfig(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }

    public final boolean getHidePu() {
        return this.hidePu;
    }

    public final boolean getHideBpu() {
        return this.hideBpu;
    }

    public final boolean getHidePmi() {
        return this.hidePmi;
    }

    public RegisterParticipantConfig() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ RegisterParticipantConfig copy$default(RegisterParticipantConfig registerParticipantConfig, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = registerParticipantConfig.hidePu;
        }
        if ((i & 2) != 0) {
            z2 = registerParticipantConfig.hideBpu;
        }
        if ((i & 4) != 0) {
            z3 = registerParticipantConfig.hidePmi;
        }
        return registerParticipantConfig.copy(z, z2, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHidePu() {
        return this.hidePu;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHideBpu() {
        return this.hideBpu;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHidePmi() {
        return this.hidePmi;
    }

    public final RegisterParticipantConfig copy(boolean p0, boolean p1, boolean p2) {
        return new RegisterParticipantConfig(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RegisterParticipantConfig)) {
            return false;
        }
        RegisterParticipantConfig registerParticipantConfig = (RegisterParticipantConfig) p0;
        return this.hidePu == registerParticipantConfig.hidePu && this.hideBpu == registerParticipantConfig.hideBpu && this.hidePmi == registerParticipantConfig.hidePmi;
    }

    public final int hashCode() {
        return (((Boolean.hashCode(this.hidePu) * 31) + Boolean.hashCode(this.hideBpu)) * 31) + Boolean.hashCode(this.hidePmi);
    }

    public final String toString() {
        boolean z = this.hidePu;
        boolean z2 = this.hideBpu;
        boolean z3 = this.hidePmi;
        StringBuilder sb = new StringBuilder("RegisterParticipantConfig(hidePu=");
        sb.append(z);
        sb.append(", hideBpu=");
        sb.append(z2);
        sb.append(", hidePmi=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }
}
