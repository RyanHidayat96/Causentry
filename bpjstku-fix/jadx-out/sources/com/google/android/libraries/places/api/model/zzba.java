package com.google.android.libraries.places.api.model;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzba extends Review {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final Double zzf;
    private final AuthorAttribution zzg;
    private final String zzh;
    private final String zzi;
    private final Uri zzj;

    zzba(String str, String str2, String str3, String str4, String str5, Double d, AuthorAttribution authorAttribution, String str6, String str7, Uri uri) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = d;
        if (authorAttribution == null) {
            throw new NullPointerException("Null authorAttribution");
        }
        this.zzg = authorAttribution;
        if (str6 == null) {
            throw new NullPointerException("Null attribution");
        }
        this.zzh = str6;
        this.zzi = str7;
        this.zzj = uri;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Review)) {
            return false;
        }
        Review review = (Review) obj;
        String str = this.zza;
        if (str == null) {
            if (review.getRelativePublishTimeDescription() != null) {
                return false;
            }
        } else if (!str.equals(review.getRelativePublishTimeDescription())) {
            return false;
        }
        String str2 = this.zzb;
        if (str2 == null) {
            if (review.getText() != null) {
                return false;
            }
        } else if (!str2.equals(review.getText())) {
            return false;
        }
        String str3 = this.zzc;
        if (str3 == null) {
            if (review.getTextLanguageCode() != null) {
                return false;
            }
        } else if (!str3.equals(review.getTextLanguageCode())) {
            return false;
        }
        String str4 = this.zzd;
        if (str4 == null) {
            if (review.getOriginalText() != null) {
                return false;
            }
        } else if (!str4.equals(review.getOriginalText())) {
            return false;
        }
        String str5 = this.zze;
        if (str5 == null) {
            if (review.getOriginalTextLanguageCode() != null) {
                return false;
            }
        } else if (!str5.equals(review.getOriginalTextLanguageCode())) {
            return false;
        }
        if (!this.zzf.equals(review.getRating()) || !this.zzg.equals(review.getAuthorAttribution()) || !this.zzh.equals(review.getAttribution())) {
            return false;
        }
        String str6 = this.zzi;
        if (str6 == null) {
            if (review.getPublishTime() != null) {
                return false;
            }
        } else if (!str6.equals(review.getPublishTime())) {
            return false;
        }
        Uri uri = this.zzj;
        if (uri == null) {
            if (review.getFlagContentUri() != null) {
                return false;
            }
        } else if (!uri.equals(review.getFlagContentUri())) {
            return false;
        }
        return true;
    }

    public final String toString() {
        Uri uri = this.zzj;
        String string = this.zzg.toString();
        String strValueOf = String.valueOf(uri);
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzc;
        int length3 = String.valueOf(str3).length();
        String str4 = this.zzd;
        int length4 = String.valueOf(str4).length();
        String str5 = this.zze;
        int length5 = String.valueOf(str5).length();
        Double d = this.zzf;
        int length6 = d.toString().length();
        int length7 = string.length();
        String str6 = this.zzi;
        int length8 = String.valueOf(str6).length();
        int length9 = String.valueOf(strValueOf).length();
        String str7 = this.zzh;
        StringBuilder sb = new StringBuilder(length + 45 + length2 + 19 + length3 + 15 + length4 + 27 + length5 + 9 + length6 + 20 + length7 + 14 + str7.length() + 14 + length8 + 17 + length9 + 1);
        sb.append("Review{relativePublishTimeDescription=");
        sb.append(str);
        sb.append(", text=");
        sb.append(str2);
        sb.append(", textLanguageCode=");
        sb.append(str3);
        sb.append(", originalText=");
        sb.append(str4);
        sb.append(", originalTextLanguageCode=");
        sb.append(str5);
        sb.append(", rating=");
        sb.append(d);
        sb.append(", authorAttribution=");
        sb.append(string);
        sb.append(", attribution=");
        sb.append(str7);
        sb.append(", publishTime=");
        sb.append(str6);
        sb.append(", flagContentUri=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.zzc;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.zzd;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.zze;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        int iHashCode6 = this.zzf.hashCode();
        int iHashCode7 = this.zzg.hashCode();
        int iHashCode8 = this.zzh.hashCode();
        String str6 = this.zzi;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        Uri uri = this.zzj;
        return ((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ (uri != null ? uri.hashCode() : 0);
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final String getAttribution() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final AuthorAttribution getAuthorAttribution() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final Uri getFlagContentUri() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final String getOriginalText() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final String getOriginalTextLanguageCode() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final String getPublishTime() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final Double getRating() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final String getRelativePublishTimeDescription() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final String getText() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final String getTextLanguageCode() {
        return this.zzc;
    }
}
