package com.google.android.libraries.places.internal;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.libraries.places.widget.model.AutocompleteUiCustomization;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zznf {
    public abstract zznf zza(zzoh zzohVar);

    public abstract zznf zzb(AutocompleteActivityMode autocompleteActivityMode);

    public abstract zznf zzc(List list);

    public abstract zznf zzd(zzoc zzocVar);

    public abstract zznf zze(LatLng latLng);

    public abstract zznf zzf(String str);

    public abstract zznf zzg(String str);

    public abstract zznf zzh(LocationBias locationBias);

    public abstract zznf zzi(LocationRestriction locationRestriction);

    public abstract zznf zzj(List list);

    @Deprecated
    public abstract zznf zzk(TypeFilter typeFilter);

    public abstract zznf zzl(List list);

    public abstract zznf zzm(int i);

    public abstract zznf zzn(int i);

    public abstract zznf zzo(String str);

    public abstract zznf zzp(AutocompleteUiCustomization autocompleteUiCustomization);

    public abstract zznf zzq(boolean z);

    public abstract zznf zzr(AutocompleteSessionToken autocompleteSessionToken);

    public abstract zzng zzs();

    @Deprecated
    public final zznf zzt(String str) {
        return zzj(str == null ? ImmutableList.asInterface() : ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str));
    }
}
