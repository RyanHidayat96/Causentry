package com.bpjstku.data.asik.local.entity;

import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0016\u0010\fR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\f"}, d2 = {"Lcom/bpjstku/data/asik/local/entity/AddressPostalCodeEntity;", "", "", "p0", "", "p1", "p2", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "copy", "(JLjava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/asik/local/entity/AddressPostalCodeEntity;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "id", "J", "getId", "code", "Ljava/lang/String;", "getCode", PlaceTypes.ADDRESS, "getAddress"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AddressPostalCodeEntity {
    public static final int $stable = 0;
    private final String address;
    private final String code;
    private final long id;

    public AddressPostalCodeEntity(long j, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.id = j;
        this.code = str;
        this.address = str2;
    }

    public /* synthetic */ AddressPostalCodeEntity(long j, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, str2);
    }

    public final long getId() {
        return this.id;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getAddress() {
        return this.address;
    }

    public static /* synthetic */ AddressPostalCodeEntity copy$default(AddressPostalCodeEntity addressPostalCodeEntity, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = addressPostalCodeEntity.id;
        }
        if ((i & 2) != 0) {
            str = addressPostalCodeEntity.code;
        }
        if ((i & 4) != 0) {
            str2 = addressPostalCodeEntity.address;
        }
        return addressPostalCodeEntity.copy(j, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public final AddressPostalCodeEntity copy(long p0, String p1, String p2) {
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new AddressPostalCodeEntity(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AddressPostalCodeEntity)) {
            return false;
        }
        AddressPostalCodeEntity addressPostalCodeEntity = (AddressPostalCodeEntity) p0;
        return this.id == addressPostalCodeEntity.id && Intrinsics.areEqual(this.code, addressPostalCodeEntity.code) && Intrinsics.areEqual(this.address, addressPostalCodeEntity.address);
    }

    public final int hashCode() {
        return (((Long.hashCode(this.id) * 31) + this.code.hashCode()) * 31) + this.address.hashCode();
    }

    public final String toString() {
        long j = this.id;
        String str = this.code;
        String str2 = this.address;
        StringBuilder sb = new StringBuilder("AddressPostalCodeEntity(id=");
        sb.append(j);
        sb.append(", code=");
        sb.append(str);
        sb.append(", address=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
