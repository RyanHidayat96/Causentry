package com.google.android.libraries.places.api.model;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzal extends PaymentOptions {
    private final Place.BooleanPlaceAttributeValue zza;
    private final Place.BooleanPlaceAttributeValue zzb;
    private final Place.BooleanPlaceAttributeValue zzc;
    private final Place.BooleanPlaceAttributeValue zzd;

    zzal(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null acceptsCreditCards");
        }
        this.zza = booleanPlaceAttributeValue;
        if (booleanPlaceAttributeValue2 == null) {
            throw new NullPointerException("Null acceptsDebitCards");
        }
        this.zzb = booleanPlaceAttributeValue2;
        if (booleanPlaceAttributeValue3 == null) {
            throw new NullPointerException("Null acceptsCashOnly");
        }
        this.zzc = booleanPlaceAttributeValue3;
        if (booleanPlaceAttributeValue4 == null) {
            throw new NullPointerException("Null acceptsNfc");
        }
        this.zzd = booleanPlaceAttributeValue4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentOptions)) {
            return false;
        }
        PaymentOptions paymentOptions = (PaymentOptions) obj;
        return this.zza.equals(paymentOptions.getAcceptsCreditCards()) && this.zzb.equals(paymentOptions.getAcceptsDebitCards()) && this.zzc.equals(paymentOptions.getAcceptsCashOnly()) && this.zzd.equals(paymentOptions.getAcceptsNfc());
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode();
        int iHashCode2 = this.zzb.hashCode();
        return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode();
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String string2 = this.zzb.toString();
        int length2 = string2.length();
        String string3 = this.zzc.toString();
        int length3 = string3.length();
        String string4 = this.zzd.toString();
        StringBuilder sb = new StringBuilder(length + 54 + length2 + 18 + length3 + 13 + string4.length() + 1);
        sb.append("PaymentOptions{acceptsCreditCards=");
        sb.append(string);
        sb.append(", acceptsDebitCards=");
        sb.append(string2);
        sb.append(", acceptsCashOnly=");
        sb.append(string3);
        sb.append(", acceptsNfc=");
        sb.append(string4);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions
    public final Place.BooleanPlaceAttributeValue getAcceptsCashOnly() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions
    public final Place.BooleanPlaceAttributeValue getAcceptsCreditCards() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions
    public final Place.BooleanPlaceAttributeValue getAcceptsDebitCards() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions
    public final Place.BooleanPlaceAttributeValue getAcceptsNfc() {
        return this.zzd;
    }
}
