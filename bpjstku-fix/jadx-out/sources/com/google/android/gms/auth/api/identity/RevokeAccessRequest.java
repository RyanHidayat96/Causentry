package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.p000authapi.zbbi;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class RevokeAccessRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<RevokeAccessRequest> CREATOR = new zbr();
    private final zbbi zba;
    private final Account zbb;
    private final String zbc;

    public static abstract class Builder {
        public abstract RevokeAccessRequest build();

        public abstract Builder setAccount(Account account);

        public abstract Builder setScopes(List<Scope> list);

        public abstract Builder zba(String str);
    }

    RevokeAccessRequest(List list, Account account, String str) {
        this.zba = zbbi.zbi(list);
        this.zbb = account;
        this.zbc = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RevokeAccessRequest)) {
            return false;
        }
        RevokeAccessRequest revokeAccessRequest = (RevokeAccessRequest) obj;
        zbbi zbbiVar = this.zba;
        int size = zbbiVar.size();
        zbbi zbbiVar2 = revokeAccessRequest.zba;
        return size == zbbiVar2.size() && zbbiVar.containsAll(zbbiVar2) && Objects.equal(this.zbb, revokeAccessRequest.zbb) && Objects.equal(this.zbc, revokeAccessRequest.zbc);
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb, this.zbc);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getScopes(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, getAccount(), i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zbc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final Builder zbb() {
        return new zbf(this);
    }

    public static Builder builder() {
        return new zbf();
    }

    public Account getAccount() {
        return this.zbb;
    }

    public List<Scope> getScopes() {
        return this.zba;
    }

    public final String zba() {
        return this.zbc;
    }
}
