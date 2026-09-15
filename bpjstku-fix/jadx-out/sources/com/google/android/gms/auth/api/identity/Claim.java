package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes6.dex */
public final class Claim extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Claim> CREATOR = new zbi();
    private final String zba;
    private final boolean zbb;

    public static abstract class Builder {
        public abstract Claim build();

        public abstract Builder setEssential(boolean z);

        public abstract Builder setName(String str);
    }

    public Claim(String str, boolean z) {
        this.zba = str;
        this.zbb = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Claim)) {
            return false;
        }
        Claim claim = (Claim) obj;
        return this.zba.equals(claim.zba) && this.zbb == claim.zbb;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zba, Boolean.valueOf(this.zbb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getName(), false);
        SafeParcelWriter.writeBoolean(parcel, 2, isEssential());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public static Builder builder() {
        return new zbd();
    }

    public final String getName() {
        return this.zba;
    }

    public final boolean isEssential() {
        return this.zbb;
    }
}
