package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Range;
import defpackage.CameraStateRegistryCameraRegistration;
import defpackage.updateAndVerifyState;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Place implements Parcelable {
    public static final int PRICE_LEVEL_MAX_VALUE = 4;
    public static final int PRICE_LEVEL_MIN_VALUE = 0;
    public static final double RATING_MAX_VALUE = 5.0d;
    public static final double RATING_MIN_VALUE = 1.0d;

    public enum BooleanPlaceAttributeValue implements Parcelable {
        UNKNOWN,
        TRUE,
        FALSE;

        public static final Parcelable.Creator<BooleanPlaceAttributeValue> CREATOR = new zzet();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    public static abstract class Builder {
        public Place build() {
            Place placeZzb = zzb();
            List<String> attributions = placeZzb.getAttributions();
            if (attributions != null) {
                Iterator<String> it = attributions.iterator();
                while (it.hasNext()) {
                    if (!(!TextUtils.isEmpty(it.next()))) {
                        throw new IllegalArgumentException("Attributions must not contain null or empty values.");
                    }
                }
            }
            Integer priceLevel = placeZzb.getPriceLevel();
            if (priceLevel != null) {
                Range rangeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Range.TuitionPaymentFragmentspecialinlinedviewModeldefault2(0, 4);
                updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(rangeTuitionPaymentFragmentspecialinlinedviewModeldefault2.lowerBound.b(priceLevel) && !rangeTuitionPaymentFragmentspecialinlinedviewModeldefault2.upperBound.b(priceLevel), "Price Level must not be out-of-range: %s to %s, but was: %s.", 0, 4, priceLevel);
            }
            Double rating = placeZzb.getRating();
            if (rating != null) {
                Double dValueOf = Double.valueOf(1.0d);
                Double dValueOf2 = Double.valueOf(5.0d);
                Range rangeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Range.TuitionPaymentFragmentspecialinlinedviewModeldefault2(dValueOf, dValueOf2);
                updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(rangeTuitionPaymentFragmentspecialinlinedviewModeldefault3.lowerBound.b(rating) && !rangeTuitionPaymentFragmentspecialinlinedviewModeldefault3.upperBound.b(rating), "Rating must not be out-of-range: %s to %s, but was: %s.", dValueOf, dValueOf2, rating);
            }
            Integer userRatingsTotal = placeZzb.getUserRatingsTotal();
            if (userRatingsTotal != null) {
                Range rangeB = Range.b(0);
                if (!(rangeB.lowerBound.b(userRatingsTotal) && !rangeB.upperBound.b(userRatingsTotal))) {
                    throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("User Ratings Total must not be < 0, but was: %s.", userRatingsTotal));
                }
            }
            if (attributions != null) {
                setAttributions(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(attributions));
            }
            List<PhotoMetadata> photoMetadatas = placeZzb.getPhotoMetadatas();
            if (photoMetadatas != null) {
                setPhotoMetadatas(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(photoMetadatas));
            }
            List<String> placeTypes = placeZzb.getPlaceTypes();
            if (placeTypes != null) {
                setPlaceTypes(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(placeTypes));
            }
            List<Type> types = placeZzb.getTypes();
            if (types != null) {
                setTypes(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(types));
            }
            List<OpeningHours> secondaryOpeningHours = placeZzb.getSecondaryOpeningHours();
            if (secondaryOpeningHours != null) {
                setSecondaryOpeningHours(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(secondaryOpeningHours));
            }
            List<Review> reviews = placeZzb.getReviews();
            if (reviews != null) {
                setReviews(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(reviews));
            }
            return zzb();
        }

        public abstract AccessibilityOptions getAccessibilityOptions();

        @Deprecated
        public abstract String getAddress();

        public abstract AddressComponents getAddressComponents();

        public abstract String getAdrFormatAddress();

        public abstract BooleanPlaceAttributeValue getAllowsDogs();

        public abstract List<String> getAttributions();

        public abstract BusinessStatus getBusinessStatus();

        public abstract BooleanPlaceAttributeValue getCurbsidePickup();

        public abstract OpeningHours getCurrentOpeningHours();

        public abstract List<OpeningHours> getCurrentSecondaryOpeningHours();

        public abstract BooleanPlaceAttributeValue getDelivery();

        public abstract BooleanPlaceAttributeValue getDineIn();

        public abstract String getDisplayName();

        public abstract String getDisplayNameLanguageCode();

        public abstract String getEditorialSummary();

        public abstract String getEditorialSummaryLanguageCode();

        public abstract EVChargeOptions getEvChargeOptions();

        public abstract String getFormattedAddress();

        public abstract FuelOptions getFuelOptions();

        public abstract BooleanPlaceAttributeValue getGoodForChildren();

        public abstract BooleanPlaceAttributeValue getGoodForGroups();

        public abstract BooleanPlaceAttributeValue getGoodForWatchingSports();

        public abstract Uri getGoogleMapsUri();

        public abstract Integer getIconBackgroundColor();

        public abstract String getIconMaskUrl();

        @Deprecated
        public abstract String getIconUrl();

        public abstract String getId();

        public abstract String getInternationalPhoneNumber();

        @Deprecated
        public abstract LatLng getLatLng();

        public abstract BooleanPlaceAttributeValue getLiveMusic();

        public abstract LatLng getLocation();

        public abstract BooleanPlaceAttributeValue getMenuForChildren();

        @Deprecated
        public abstract String getName();

        @Deprecated
        public abstract String getNameLanguageCode();

        public abstract String getNationalPhoneNumber();

        public abstract OpeningHours getOpeningHours();

        public abstract BooleanPlaceAttributeValue getOutdoorSeating();

        public abstract ParkingOptions getParkingOptions();

        public abstract PaymentOptions getPaymentOptions();

        @Deprecated
        public abstract String getPhoneNumber();

        public abstract List<PhotoMetadata> getPhotoMetadatas();

        public abstract List<String> getPlaceTypes();

        public abstract PlusCode getPlusCode();

        public abstract Integer getPriceLevel();

        public abstract String getPrimaryType();

        public abstract String getPrimaryTypeDisplayName();

        public abstract String getPrimaryTypeDisplayNameLanguageCode();

        public abstract BooleanPlaceAttributeValue getPureServiceAreaBusiness();

        public abstract Double getRating();

        public abstract BooleanPlaceAttributeValue getReservable();

        public abstract String getResourceName();

        public abstract BooleanPlaceAttributeValue getRestroom();

        public abstract List<Review> getReviews();

        public abstract List<OpeningHours> getSecondaryOpeningHours();

        public abstract BooleanPlaceAttributeValue getServesBeer();

        public abstract BooleanPlaceAttributeValue getServesBreakfast();

        public abstract BooleanPlaceAttributeValue getServesBrunch();

        public abstract BooleanPlaceAttributeValue getServesCocktails();

        public abstract BooleanPlaceAttributeValue getServesCoffee();

        public abstract BooleanPlaceAttributeValue getServesDessert();

        public abstract BooleanPlaceAttributeValue getServesDinner();

        public abstract BooleanPlaceAttributeValue getServesLunch();

        public abstract BooleanPlaceAttributeValue getServesVegetarianFood();

        public abstract BooleanPlaceAttributeValue getServesWine();

        public abstract String getShortFormattedAddress();

        public abstract List<SubDestination> getSubDestinations();

        public abstract BooleanPlaceAttributeValue getTakeout();

        @Deprecated
        public abstract List<Type> getTypes();

        public abstract Integer getUserRatingCount();

        @Deprecated
        public abstract Integer getUserRatingsTotal();

        public abstract Integer getUtcOffsetMinutes();

        public abstract LatLngBounds getViewport();

        public abstract Uri getWebsiteUri();

        @Deprecated
        public abstract BooleanPlaceAttributeValue getWheelchairAccessibleEntrance();

        public abstract Builder setAccessibilityOptions(AccessibilityOptions accessibilityOptions);

        @Deprecated
        public abstract Builder setAddress(String str);

        public abstract Builder setAddressComponents(AddressComponents addressComponents);

        public abstract Builder setAdrFormatAddress(String str);

        public abstract Builder setAllowsDogs(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setAttributions(List<String> list);

        public abstract Builder setBusinessStatus(BusinessStatus businessStatus);

        public abstract Builder setCurbsidePickup(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setCurrentOpeningHours(OpeningHours openingHours);

        public abstract Builder setCurrentSecondaryOpeningHours(List<OpeningHours> list);

        public abstract Builder setDelivery(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setDineIn(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setDisplayName(String str);

        public abstract Builder setDisplayNameLanguageCode(String str);

        public abstract Builder setEditorialSummary(String str);

        public abstract Builder setEditorialSummaryLanguageCode(String str);

        public abstract Builder setEvChargeOptions(EVChargeOptions eVChargeOptions);

        public abstract Builder setFormattedAddress(String str);

        public abstract Builder setFuelOptions(FuelOptions fuelOptions);

        public abstract Builder setGoodForChildren(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setGoodForGroups(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setGoodForWatchingSports(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setGoogleMapsUri(Uri uri);

        public abstract Builder setIconBackgroundColor(Integer num);

        public abstract Builder setIconMaskUrl(String str);

        @Deprecated
        public abstract Builder setIconUrl(String str);

        public abstract Builder setId(String str);

        public abstract Builder setInternationalPhoneNumber(String str);

        @Deprecated
        public abstract Builder setLatLng(LatLng latLng);

        public abstract Builder setLiveMusic(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setLocation(LatLng latLng);

        public abstract Builder setMenuForChildren(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @Deprecated
        public abstract Builder setName(String str);

        @Deprecated
        public abstract Builder setNameLanguageCode(String str);

        public abstract Builder setNationalPhoneNumber(String str);

        public abstract Builder setOpeningHours(OpeningHours openingHours);

        public abstract Builder setOutdoorSeating(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setParkingOptions(ParkingOptions parkingOptions);

        public abstract Builder setPaymentOptions(PaymentOptions paymentOptions);

        @Deprecated
        public abstract Builder setPhoneNumber(String str);

        public abstract Builder setPhotoMetadatas(List<PhotoMetadata> list);

        public abstract Builder setPlaceTypes(List<String> list);

        public abstract Builder setPlusCode(PlusCode plusCode);

        public abstract Builder setPriceLevel(Integer num);

        public abstract Builder setPrimaryType(String str);

        public abstract Builder setPrimaryTypeDisplayName(String str);

        public abstract Builder setPrimaryTypeDisplayNameLanguageCode(String str);

        public abstract Builder setPureServiceAreaBusiness(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setRating(Double d);

        public abstract Builder setReservable(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setResourceName(String str);

        public abstract Builder setRestroom(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setReviews(List<Review> list);

        public abstract Builder setSecondaryOpeningHours(List<OpeningHours> list);

        public abstract Builder setServesBeer(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setServesBreakfast(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setServesBrunch(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setServesCocktails(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setServesCoffee(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setServesDessert(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setServesDinner(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setServesLunch(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setServesVegetarianFood(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setServesWine(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setShortFormattedAddress(String str);

        public abstract Builder setSubDestinations(List<SubDestination> list);

        public abstract Builder setTakeout(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @Deprecated
        public abstract Builder setTypes(List<Type> list);

        public abstract Builder setUserRatingCount(Integer num);

        @Deprecated
        public abstract Builder setUserRatingsTotal(Integer num);

        public abstract Builder setUtcOffsetMinutes(Integer num);

        public abstract Builder setViewport(LatLngBounds latLngBounds);

        public abstract Builder setWebsiteUri(Uri uri);

        @Deprecated
        public abstract Builder setWheelchairAccessibleEntrance(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder zza(zzey zzeyVar);

        abstract Place zzb();
    }

    public enum BusinessStatus implements Parcelable {
        OPERATIONAL,
        CLOSED_TEMPORARILY,
        CLOSED_PERMANENTLY;

        public static final Parcelable.Creator<BusinessStatus> CREATOR = new zzeu();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    public enum Field implements Parcelable {
        ACCESSIBILITY_OPTIONS,
        ADDRESS_COMPONENTS,
        ADR_FORMAT_ADDRESS,
        ALLOWS_DOGS,
        BUSINESS_STATUS,
        CURBSIDE_PICKUP,
        CURRENT_OPENING_HOURS,
        CURRENT_SECONDARY_OPENING_HOURS,
        DELIVERY,
        DINE_IN,
        DISPLAY_NAME,
        EDITORIAL_SUMMARY,
        EV_CHARGE_OPTIONS,
        FORMATTED_ADDRESS,
        FUEL_OPTIONS,
        GOOD_FOR_CHILDREN,
        GOOD_FOR_GROUPS,
        GOOD_FOR_WATCHING_SPORTS,
        GOOGLE_MAPS_URI,
        ICON_BACKGROUND_COLOR,
        ICON_MASK_URL,
        ID,
        INTERNATIONAL_PHONE_NUMBER,
        LIVE_MUSIC,
        LOCATION,
        MENU_FOR_CHILDREN,
        NATIONAL_PHONE_NUMBER,
        OPENING_HOURS,
        OUTDOOR_SEATING,
        PARKING_OPTIONS,
        PAYMENT_OPTIONS,
        PHOTO_METADATAS,
        PLUS_CODE,
        PRICE_LEVEL,
        PRIMARY_TYPE,
        PRIMARY_TYPE_DISPLAY_NAME,
        PURE_SERVICE_AREA_BUSINESS,
        RATING,
        RESERVABLE,
        RESOURCE_NAME,
        RESTROOM,
        REVIEWS,
        SECONDARY_OPENING_HOURS,
        SERVES_BEER,
        SERVES_BREAKFAST,
        SERVES_BRUNCH,
        SERVES_COCKTAILS,
        SERVES_COFFEE,
        SERVES_DESSERT,
        SERVES_DINNER,
        SERVES_LUNCH,
        SERVES_VEGETARIAN_FOOD,
        SERVES_WINE,
        SHORT_FORMATTED_ADDRESS,
        SUB_DESTINATIONS,
        TAKEOUT,
        TYPES,
        USER_RATING_COUNT,
        UTC_OFFSET,
        VIEWPORT,
        WEBSITE_URI,
        ADDRESS,
        ICON_URL,
        LAT_LNG,
        NAME,
        PHONE_NUMBER,
        USER_RATINGS_TOTAL,
        WHEELCHAIR_ACCESSIBLE_ENTRANCE,
        PRICE_RANGE;

        public static final Parcelable.Creator<Field> CREATOR = new zzev();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    @Deprecated
    public enum Type implements Parcelable {
        OTHER,
        ACCOUNTING,
        ADMINISTRATIVE_AREA_LEVEL_1,
        ADMINISTRATIVE_AREA_LEVEL_2,
        ADMINISTRATIVE_AREA_LEVEL_3,
        ADMINISTRATIVE_AREA_LEVEL_4,
        ADMINISTRATIVE_AREA_LEVEL_5,
        AIRPORT,
        AMUSEMENT_PARK,
        AQUARIUM,
        ARCHIPELAGO,
        ART_GALLERY,
        ATM,
        BAKERY,
        BANK,
        BAR,
        BEAUTY_SALON,
        BICYCLE_STORE,
        BOOK_STORE,
        BOWLING_ALLEY,
        BUS_STATION,
        CAFE,
        CAMPGROUND,
        CAR_DEALER,
        CAR_RENTAL,
        CAR_REPAIR,
        CAR_WASH,
        CASINO,
        CEMETERY,
        CHURCH,
        CITY_HALL,
        CLOTHING_STORE,
        COLLOQUIAL_AREA,
        CONTINENT,
        CONVENIENCE_STORE,
        COUNTRY,
        COURTHOUSE,
        DENTIST,
        DEPARTMENT_STORE,
        DOCTOR,
        DRUGSTORE,
        ELECTRICIAN,
        ELECTRONICS_STORE,
        EMBASSY,
        ESTABLISHMENT,
        FINANCE,
        FIRE_STATION,
        FLOOR,
        FLORIST,
        FOOD,
        FUNERAL_HOME,
        FURNITURE_STORE,
        GAS_STATION,
        GENERAL_CONTRACTOR,
        GEOCODE,
        GROCERY_OR_SUPERMARKET,
        GYM,
        HAIR_CARE,
        HARDWARE_STORE,
        HEALTH,
        HINDU_TEMPLE,
        HOME_GOODS_STORE,
        HOSPITAL,
        INSURANCE_AGENCY,
        INTERSECTION,
        JEWELRY_STORE,
        LAUNDRY,
        LAWYER,
        LIBRARY,
        LIGHT_RAIL_STATION,
        LIQUOR_STORE,
        LOCAL_GOVERNMENT_OFFICE,
        LOCALITY,
        LOCKSMITH,
        LODGING,
        MEAL_DELIVERY,
        MEAL_TAKEAWAY,
        MOSQUE,
        MOVIE_RENTAL,
        MOVIE_THEATER,
        MOVING_COMPANY,
        MUSEUM,
        NATURAL_FEATURE,
        NEIGHBORHOOD,
        NIGHT_CLUB,
        PAINTER,
        PARK,
        PARKING,
        PET_STORE,
        PHARMACY,
        PHYSIOTHERAPIST,
        PLACE_OF_WORSHIP,
        PLUMBER,
        PLUS_CODE,
        POINT_OF_INTEREST,
        POLICE,
        POLITICAL,
        POST_BOX,
        POST_OFFICE,
        POSTAL_CODE_PREFIX,
        POSTAL_CODE_SUFFIX,
        POSTAL_CODE,
        POSTAL_TOWN,
        PREMISE,
        PRIMARY_SCHOOL,
        REAL_ESTATE_AGENCY,
        RESTAURANT,
        ROOFING_CONTRACTOR,
        ROOM,
        ROUTE,
        RV_PARK,
        SCHOOL,
        SECONDARY_SCHOOL,
        SHOE_STORE,
        SHOPPING_MALL,
        SPA,
        STADIUM,
        STORAGE,
        STORE,
        STREET_ADDRESS,
        STREET_NUMBER,
        SUBLOCALITY_LEVEL_1,
        SUBLOCALITY_LEVEL_2,
        SUBLOCALITY_LEVEL_3,
        SUBLOCALITY_LEVEL_4,
        SUBLOCALITY_LEVEL_5,
        SUBLOCALITY,
        SUBPREMISE,
        SUBWAY_STATION,
        SUPERMARKET,
        SYNAGOGUE,
        TAXI_STAND,
        TOURIST_ATTRACTION,
        TOWN_SQUARE,
        TRAIN_STATION,
        TRANSIT_STATION,
        TRAVEL_AGENCY,
        UNIVERSITY,
        VETERINARY_CARE,
        ZOO;

        public static final Parcelable.Creator<Type> CREATOR = new zzew();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    public static Builder builder() {
        zzaq zzaqVar = new zzaq();
        zzaqVar.setCurbsidePickup(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setDelivery(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setDineIn(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setReservable(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setServesBeer(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setServesBreakfast(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setServesBrunch(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setServesDinner(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setServesLunch(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setServesVegetarianFood(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setServesWine(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setTakeout(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setWheelchairAccessibleEntrance(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setOutdoorSeating(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setLiveMusic(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setMenuForChildren(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setServesCocktails(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setServesDessert(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setServesCoffee(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setGoodForChildren(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setAllowsDogs(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setRestroom(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setGoodForGroups(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setGoodForWatchingSports(BooleanPlaceAttributeValue.UNKNOWN);
        zzaqVar.setPureServiceAreaBusiness(BooleanPlaceAttributeValue.UNKNOWN);
        return zzaqVar;
    }

    public abstract AccessibilityOptions getAccessibilityOptions();

    @Deprecated
    public abstract String getAddress();

    public abstract AddressComponents getAddressComponents();

    public abstract String getAdrFormatAddress();

    public abstract BooleanPlaceAttributeValue getAllowsDogs();

    public abstract List<String> getAttributions();

    public abstract BusinessStatus getBusinessStatus();

    public abstract BooleanPlaceAttributeValue getCurbsidePickup();

    public abstract OpeningHours getCurrentOpeningHours();

    public abstract List<OpeningHours> getCurrentSecondaryOpeningHours();

    public abstract BooleanPlaceAttributeValue getDelivery();

    public abstract BooleanPlaceAttributeValue getDineIn();

    public abstract String getDisplayName();

    public abstract String getDisplayNameLanguageCode();

    public abstract String getEditorialSummary();

    public abstract String getEditorialSummaryLanguageCode();

    public abstract EVChargeOptions getEvChargeOptions();

    public abstract String getFormattedAddress();

    public abstract FuelOptions getFuelOptions();

    public abstract BooleanPlaceAttributeValue getGoodForChildren();

    public abstract BooleanPlaceAttributeValue getGoodForGroups();

    public abstract BooleanPlaceAttributeValue getGoodForWatchingSports();

    public abstract Uri getGoogleMapsUri();

    public abstract Integer getIconBackgroundColor();

    public abstract String getIconMaskUrl();

    @Deprecated
    public abstract String getIconUrl();

    public abstract String getId();

    public abstract String getInternationalPhoneNumber();

    @Deprecated
    public abstract LatLng getLatLng();

    public abstract BooleanPlaceAttributeValue getLiveMusic();

    public abstract LatLng getLocation();

    public abstract BooleanPlaceAttributeValue getMenuForChildren();

    @Deprecated
    public abstract String getName();

    @Deprecated
    public abstract String getNameLanguageCode();

    public abstract String getNationalPhoneNumber();

    public abstract OpeningHours getOpeningHours();

    public abstract BooleanPlaceAttributeValue getOutdoorSeating();

    public abstract ParkingOptions getParkingOptions();

    public abstract PaymentOptions getPaymentOptions();

    @Deprecated
    public abstract String getPhoneNumber();

    public abstract List<PhotoMetadata> getPhotoMetadatas();

    public abstract List<String> getPlaceTypes();

    public abstract PlusCode getPlusCode();

    public abstract Integer getPriceLevel();

    public abstract String getPrimaryType();

    public abstract String getPrimaryTypeDisplayName();

    public abstract String getPrimaryTypeDisplayNameLanguageCode();

    public abstract BooleanPlaceAttributeValue getPureServiceAreaBusiness();

    public abstract Double getRating();

    public abstract BooleanPlaceAttributeValue getReservable();

    public abstract String getResourceName();

    public abstract BooleanPlaceAttributeValue getRestroom();

    public abstract List<Review> getReviews();

    public abstract List<OpeningHours> getSecondaryOpeningHours();

    public abstract BooleanPlaceAttributeValue getServesBeer();

    public abstract BooleanPlaceAttributeValue getServesBreakfast();

    public abstract BooleanPlaceAttributeValue getServesBrunch();

    public abstract BooleanPlaceAttributeValue getServesCocktails();

    public abstract BooleanPlaceAttributeValue getServesCoffee();

    public abstract BooleanPlaceAttributeValue getServesDessert();

    public abstract BooleanPlaceAttributeValue getServesDinner();

    public abstract BooleanPlaceAttributeValue getServesLunch();

    public abstract BooleanPlaceAttributeValue getServesVegetarianFood();

    public abstract BooleanPlaceAttributeValue getServesWine();

    public abstract String getShortFormattedAddress();

    public abstract List<SubDestination> getSubDestinations();

    public abstract BooleanPlaceAttributeValue getTakeout();

    @Deprecated
    public abstract List<Type> getTypes();

    public abstract Integer getUserRatingCount();

    @Deprecated
    public abstract Integer getUserRatingsTotal();

    public abstract Integer getUtcOffsetMinutes();

    public abstract LatLngBounds getViewport();

    public abstract Uri getWebsiteUri();

    @Deprecated
    public abstract BooleanPlaceAttributeValue getWheelchairAccessibleEntrance();

    @Deprecated
    public Boolean isOpen() {
        return isOpen(System.currentTimeMillis());
    }

    public abstract zzey zza();

    @Deprecated
    public Boolean isOpen(long j) {
        return zzes.zzb(this, j);
    }
}
