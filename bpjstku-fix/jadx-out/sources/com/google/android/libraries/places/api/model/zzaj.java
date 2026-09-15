package com.google.android.libraries.places.api.model;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzaj extends ParkingOptions {
    private final Place.BooleanPlaceAttributeValue zza;
    private final Place.BooleanPlaceAttributeValue zzb;
    private final Place.BooleanPlaceAttributeValue zzc;
    private final Place.BooleanPlaceAttributeValue zzd;
    private final Place.BooleanPlaceAttributeValue zze;
    private final Place.BooleanPlaceAttributeValue zzf;
    private final Place.BooleanPlaceAttributeValue zzg;

    zzaj(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null freeParkingLot");
        }
        this.zza = booleanPlaceAttributeValue;
        if (booleanPlaceAttributeValue2 == null) {
            throw new NullPointerException("Null paidParkingLot");
        }
        this.zzb = booleanPlaceAttributeValue2;
        if (booleanPlaceAttributeValue3 == null) {
            throw new NullPointerException("Null freeStreetParking");
        }
        this.zzc = booleanPlaceAttributeValue3;
        if (booleanPlaceAttributeValue4 == null) {
            throw new NullPointerException("Null paidStreetParking");
        }
        this.zzd = booleanPlaceAttributeValue4;
        if (booleanPlaceAttributeValue5 == null) {
            throw new NullPointerException("Null valetParking");
        }
        this.zze = booleanPlaceAttributeValue5;
        if (booleanPlaceAttributeValue6 == null) {
            throw new NullPointerException("Null freeGarageParking");
        }
        this.zzf = booleanPlaceAttributeValue6;
        if (booleanPlaceAttributeValue7 == null) {
            throw new NullPointerException("Null paidGarageParking");
        }
        this.zzg = booleanPlaceAttributeValue7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ParkingOptions)) {
            return false;
        }
        ParkingOptions parkingOptions = (ParkingOptions) obj;
        return this.zza.equals(parkingOptions.getFreeParkingLot()) && this.zzb.equals(parkingOptions.getPaidParkingLot()) && this.zzc.equals(parkingOptions.getFreeStreetParking()) && this.zzd.equals(parkingOptions.getPaidStreetParking()) && this.zze.equals(parkingOptions.getValetParking()) && this.zzf.equals(parkingOptions.getFreeGarageParking()) && this.zzg.equals(parkingOptions.getPaidGarageParking());
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode();
        int iHashCode2 = this.zzb.hashCode();
        int iHashCode3 = this.zzc.hashCode();
        int iHashCode4 = this.zzd.hashCode();
        int iHashCode5 = this.zze.hashCode();
        return ((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg.hashCode();
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String string2 = this.zzb.toString();
        int length2 = string2.length();
        String string3 = this.zzc.toString();
        int length3 = string3.length();
        String string4 = this.zzd.toString();
        int length4 = string4.length();
        String string5 = this.zze.toString();
        int length5 = string5.length();
        String string6 = this.zzf.toString();
        int length6 = string6.length();
        String string7 = this.zzg.toString();
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 20 + length3 + 20 + length4 + 15 + length5 + 20 + length6 + 20 + string7.length() + 1);
        sb.append("ParkingOptions{freeParkingLot=");
        sb.append(string);
        sb.append(", paidParkingLot=");
        sb.append(string2);
        sb.append(", freeStreetParking=");
        sb.append(string3);
        sb.append(", paidStreetParking=");
        sb.append(string4);
        sb.append(", valetParking=");
        sb.append(string5);
        sb.append(", freeGarageParking=");
        sb.append(string6);
        sb.append(", paidGarageParking=");
        sb.append(string7);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions
    public final Place.BooleanPlaceAttributeValue getFreeGarageParking() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions
    public final Place.BooleanPlaceAttributeValue getFreeParkingLot() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions
    public final Place.BooleanPlaceAttributeValue getFreeStreetParking() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions
    public final Place.BooleanPlaceAttributeValue getPaidGarageParking() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions
    public final Place.BooleanPlaceAttributeValue getPaidParkingLot() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions
    public final Place.BooleanPlaceAttributeValue getPaidStreetParking() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions
    public final Place.BooleanPlaceAttributeValue getValetParking() {
        return this.zze;
    }
}
