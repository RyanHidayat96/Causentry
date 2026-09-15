package com.google.android.libraries.places.widget.internal.placedetails;

import androidx.p002lifecycle.MutableLiveData;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
final class zzau {
    private final PhotoMetadata zza;
    private final int zzb;
    private final MutableLiveData zzc;

    public zzau(PhotoMetadata photoMetadata, int i, MutableLiveData mutableLiveData) {
        Intrinsics.checkNotNullParameter(photoMetadata, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.zza = photoMetadata;
        this.zzb = i;
        this.zzc = mutableLiveData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzau)) {
            return false;
        }
        zzau zzauVar = (zzau) obj;
        return Intrinsics.areEqual(this.zza, zzauVar.zza) && this.zzb == zzauVar.zzb && Intrinsics.areEqual(this.zzc, zzauVar.zzc);
    }

    public final int hashCode() {
        return (((this.zza.hashCode() * 31) + Integer.hashCode(this.zzb)) * 31) + this.zzc.hashCode();
    }

    public final String toString() {
        PhotoMetadata photoMetadata = this.zza;
        int length = String.valueOf(photoMetadata).length();
        int i = this.zzb;
        int length2 = String.valueOf(i).length();
        MutableLiveData mutableLiveData = this.zzc;
        StringBuilder sb = new StringBuilder(length + 40 + length2 + 14 + String.valueOf(mutableLiveData).length() + 1);
        sb.append("PhotoUriRequest(metadata=");
        sb.append(photoMetadata);
        sb.append(", maxDimension=");
        sb.append(i);
        sb.append(", destination=");
        sb.append(mutableLiveData);
        sb.append(")");
        return sb.toString();
    }

    public final PhotoMetadata zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final MutableLiveData zzc() {
        return this.zzc;
    }
}
