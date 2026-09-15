package com.rtchagas.pingplacepicker.repository.googlemaps;

import android.location.Location;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.AddressComponents;
import com.google.android.libraries.places.api.model.OpeningHours;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlusCode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 :2\u00020\u0001:\u0001:B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0012H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0019\u0010\u000eJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001d\u0010\u000eJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0012H\u0017¢\u0006\u0004\b\u001f\u0010\u0014J\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b!\u0010\"J\u0011\u0010#\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0012H\u0017¢\u0006\u0004\b(\u0010\u0014J\u0011\u0010)\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b)\u0010$J\u0011\u0010*\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b*\u0010$J\u0011\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b,\u0010-J\u0011\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u0002032\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\tH\u0016¢\u0006\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00107"}, d2 = {"Lcom/rtchagas/pingplacepicker/repository/googlemaps/PlaceFromCoordinates;", "Lcom/google/android/libraries/places/api/model/Place;", "Landroid/os/Parcel;", "p0", "<init>", "(Landroid/os/Parcel;)V", "", "p1", "(DD)V", "", "describeContents", "()I", "", "getAddress", "()Ljava/lang/String;", "Lcom/google/android/libraries/places/api/model/AddressComponents;", "getAddressComponents", "()Lcom/google/android/libraries/places/api/model/AddressComponents;", "", "getAttributions", "()Ljava/util/List;", "getId", "Lcom/google/android/gms/maps/model/LatLng;", "getLatLng", "()Lcom/google/android/gms/maps/model/LatLng;", "getName", "Lcom/google/android/libraries/places/api/model/OpeningHours;", "getOpeningHours", "()Lcom/google/android/libraries/places/api/model/OpeningHours;", "getPhoneNumber", "Lcom/google/android/libraries/places/api/model/PhotoMetadata;", "getPhotoMetadatas", "Lcom/google/android/libraries/places/api/model/PlusCode;", "getPlusCode", "()Lcom/google/android/libraries/places/api/model/PlusCode;", "getPriceLevel", "()Ljava/lang/Integer;", "getRating", "()Ljava/lang/Double;", "Lcom/google/android/libraries/places/api/model/Place$Type;", "getTypes", "getUserRatingsTotal", "getUtcOffsetMinutes", "Lcom/google/android/gms/maps/model/LatLngBounds;", "getViewport", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "Landroid/net/Uri;", "getWebsiteUri", "()Landroid/net/Uri;", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;)Ljava/lang/String;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "D", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "CREATOR"}, k = 1, mv = {2, 3, 0})
public final class PlaceFromCoordinates extends Place {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final double TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final double b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final String getAddress() {
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final AddressComponents getAddressComponents() {
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final String getId() {
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final OpeningHours getOpeningHours() {
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final String getPhoneNumber() {
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final PlusCode getPlusCode() {
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final Integer getPriceLevel() {
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final Double getRating() {
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final Integer getUserRatingsTotal() {
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final Integer getUtcOffsetMinutes() {
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final LatLngBounds getViewport() {
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final Uri getWebsiteUri() {
        return null;
    }

    public PlaceFromCoordinates(double d, double d2) {
        this.b = d;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = d2;
    }

    public PlaceFromCoordinates(Parcel parcel) {
        this(parcel.readDouble(), parcel.readDouble());
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final String getName() {
        StringBuilder sb = new StringBuilder();
        double d = this.b;
        String str = d > 0.0d ? "N" : ExifInterface.LATITUDE_SOUTH;
        StringBuilder sb2 = new StringBuilder();
        String strConvert = Location.convert(Math.abs(d), 2);
        Intrinsics.checkExpressionValueIsNotNull(strConvert, "");
        sb2.append(TuitionPaymentFragmentbindingInflater1(strConvert));
        sb2.append(' ');
        sb2.append(str);
        sb.append(sb2.toString());
        sb.append(", ");
        double d2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str2 = d2 > 0.0d ? ExifInterface.LONGITUDE_WEST : ExifInterface.LONGITUDE_EAST;
        StringBuilder sb3 = new StringBuilder();
        String strConvert2 = Location.convert(Math.abs(d2), 2);
        Intrinsics.checkExpressionValueIsNotNull(strConvert2, "");
        sb3.append(TuitionPaymentFragmentbindingInflater1(strConvert2));
        sb3.append(' ');
        sb3.append(str2);
        sb.append(sb3.toString());
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final List<PhotoMetadata> getPhotoMetadatas() {
        return new ArrayList();
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final List<String> getAttributions() {
        return new ArrayList();
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final List<Place.Type> getTypes() {
        return new ArrayList();
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final LatLng getLatLng() {
        return new LatLng(this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        p0.writeDouble(this.b);
        p0.writeDouble(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    /* JADX INFO: renamed from: com.rtchagas.pingplacepicker.repository.googlemaps.PlaceFromCoordinates$CREATOR, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/rtchagas/pingplacepicker/repository/googlemaps/PlaceFromCoordinates$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/rtchagas/pingplacepicker/repository/googlemaps/PlaceFromCoordinates;", "<init>", "()V"}, k = 1, mv = {2, 3, 0})
    public static final class Companion implements Parcelable.Creator<PlaceFromCoordinates> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PlaceFromCoordinates createFromParcel(Parcel parcel) {
            return new PlaceFromCoordinates(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PlaceFromCoordinates[] newArray(int i) {
            return new PlaceFromCoordinates[i];
        }
    }

    private static String TuitionPaymentFragmentbindingInflater1(String p0) {
        List listSplit$default = StringsKt.split$default((CharSequence) p0, new String[]{":"}, false, 0, 6, (Object) null);
        String str = (String) listSplit$default.get(0);
        String str2 = (String) listSplit$default.get(1);
        String strSubstring = (String) listSplit$default.get(2);
        int iIndexOfAny$default = StringsKt.indexOfAny$default((CharSequence) strSubstring, new char[]{',', '.'}, 0, false, 6, (Object) null);
        if (iIndexOfAny$default >= 0) {
            if (strSubstring == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            strSubstring = strSubstring.substring(0, iIndexOfAny$default);
            Intrinsics.checkExpressionValueIsNotNull(strSubstring, "");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("° ");
        sb.append(str2);
        sb.append("' ");
        sb.append(strSubstring);
        sb.append(Typography.quote);
        return sb.toString();
    }
}
