package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzll {
    private static final ImmutableMap zza = ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentbindingInflater1(Place.Field.ADDRESS, "formatted_address").TuitionPaymentFragmentbindingInflater1(Place.Field.ADDRESS_COMPONENTS, "address_components").TuitionPaymentFragmentbindingInflater1(Place.Field.BUSINESS_STATUS, "business_status").TuitionPaymentFragmentbindingInflater1(Place.Field.CURBSIDE_PICKUP, "curbside_pickup").TuitionPaymentFragmentbindingInflater1(Place.Field.CURRENT_OPENING_HOURS, "current_opening_hours").TuitionPaymentFragmentbindingInflater1(Place.Field.DELIVERY, "delivery").TuitionPaymentFragmentbindingInflater1(Place.Field.DINE_IN, "dine_in").TuitionPaymentFragmentbindingInflater1(Place.Field.DISPLAY_NAME, "name").TuitionPaymentFragmentbindingInflater1(Place.Field.EDITORIAL_SUMMARY, "editorial_summary").TuitionPaymentFragmentbindingInflater1(Place.Field.FORMATTED_ADDRESS, "formatted_address").TuitionPaymentFragmentbindingInflater1(Place.Field.ICON_BACKGROUND_COLOR, "icon_background_color").TuitionPaymentFragmentbindingInflater1(Place.Field.ICON_MASK_URL, "icon_mask_base_uri").TuitionPaymentFragmentbindingInflater1(Place.Field.ICON_URL, "icon_mask_base_uri").TuitionPaymentFragmentbindingInflater1(Place.Field.ID, "place_id").TuitionPaymentFragmentbindingInflater1(Place.Field.INTERNATIONAL_PHONE_NUMBER, "international_phone_number").TuitionPaymentFragmentbindingInflater1(Place.Field.LAT_LNG, "geometry/location").TuitionPaymentFragmentbindingInflater1(Place.Field.LOCATION, "geometry/location").TuitionPaymentFragmentbindingInflater1(Place.Field.NAME, "name").TuitionPaymentFragmentbindingInflater1(Place.Field.OPENING_HOURS, "opening_hours").TuitionPaymentFragmentbindingInflater1(Place.Field.PHONE_NUMBER, "international_phone_number").TuitionPaymentFragmentbindingInflater1(Place.Field.PHOTO_METADATAS, "photos").TuitionPaymentFragmentbindingInflater1(Place.Field.PLUS_CODE, PlaceTypes.PLUS_CODE).TuitionPaymentFragmentbindingInflater1(Place.Field.PRICE_LEVEL, "price_level").TuitionPaymentFragmentbindingInflater1(Place.Field.RATING, "rating").TuitionPaymentFragmentbindingInflater1(Place.Field.RESERVABLE, "reservable").TuitionPaymentFragmentbindingInflater1(Place.Field.SECONDARY_OPENING_HOURS, "secondary_opening_hours").TuitionPaymentFragmentbindingInflater1(Place.Field.SERVES_BEER, "serves_beer").TuitionPaymentFragmentbindingInflater1(Place.Field.SERVES_BREAKFAST, "serves_breakfast").TuitionPaymentFragmentbindingInflater1(Place.Field.SERVES_BRUNCH, "serves_brunch").TuitionPaymentFragmentbindingInflater1(Place.Field.SERVES_DINNER, "serves_dinner").TuitionPaymentFragmentbindingInflater1(Place.Field.SERVES_LUNCH, "serves_lunch").TuitionPaymentFragmentbindingInflater1(Place.Field.SERVES_VEGETARIAN_FOOD, "serves_vegetarian_food").TuitionPaymentFragmentbindingInflater1(Place.Field.SERVES_WINE, "serves_wine").TuitionPaymentFragmentbindingInflater1(Place.Field.TAKEOUT, "takeout").TuitionPaymentFragmentbindingInflater1(Place.Field.TYPES, "types").TuitionPaymentFragmentbindingInflater1(Place.Field.USER_RATINGS_TOTAL, "user_ratings_total").TuitionPaymentFragmentbindingInflater1(Place.Field.USER_RATING_COUNT, "user_ratings_total").TuitionPaymentFragmentbindingInflater1(Place.Field.UTC_OFFSET, "utc_offset").TuitionPaymentFragmentbindingInflater1(Place.Field.VIEWPORT, "geometry/viewport").TuitionPaymentFragmentbindingInflater1(Place.Field.WEBSITE_URI, "website").TuitionPaymentFragmentbindingInflater1(Place.Field.WHEELCHAIR_ACCESSIBLE_ENTRANCE, "wheelchair_accessible_entrance").TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    public static List zza(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) zza.get((Place.Field) it.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static String zzb(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) zza.get((Place.Field) it.next());
            if (!TextUtils.isEmpty(str)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
