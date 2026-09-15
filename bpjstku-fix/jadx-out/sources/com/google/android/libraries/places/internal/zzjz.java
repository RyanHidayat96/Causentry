package com.google.android.libraries.places.internal;

import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes3.dex */
final class zzjz {
    private String description;
    private Integer distanceMeters;
    private zzb[] matchedSubstrings;
    private String placeId;
    private zza structuredFormatting;
    private String[] types;

    class zzb {
        Integer length;
        Integer offset;

        zzb() {
        }
    }

    final ImmutableList zze() {
        String[] strArr = this.types;
        return strArr != null ? ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object[]) strArr) : ImmutableList.asInterface();
    }

    final ImmutableList zzf() {
        zzb[] zzbVarArr = this.matchedSubstrings;
        return zzbVarArr != null ? ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object[]) zzbVarArr) : ImmutableList.asInterface();
    }

    class zza {
        private String mainText;
        private zzb[] mainTextMatchedSubstrings;
        private String secondaryText;
        private zzb[] secondaryTextMatchedSubstrings;

        final ImmutableList zzc() {
            zzb[] zzbVarArr = this.mainTextMatchedSubstrings;
            return zzbVarArr != null ? ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object[]) zzbVarArr) : ImmutableList.asInterface();
        }

        final ImmutableList zzd() {
            zzb[] zzbVarArr = this.secondaryTextMatchedSubstrings;
            return zzbVarArr != null ? ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object[]) zzbVarArr) : ImmutableList.asInterface();
        }

        zza() {
        }

        final String zza() {
            return this.mainText;
        }

        final String zzb() {
            return this.secondaryText;
        }
    }

    zzjz() {
    }

    final String zza() {
        return this.description;
    }

    final Integer zzb() {
        return this.distanceMeters;
    }

    final String zzc() {
        return this.placeId;
    }

    final zza zzd() {
        return this.structuredFormatting;
    }
}
