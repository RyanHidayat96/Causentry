package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.AddressComponent;
import com.google.android.libraries.places.api.model.AddressComponents;
import com.google.android.libraries.places.api.model.DayOfWeek;
import com.google.android.libraries.places.api.model.LocalDate;
import com.google.android.libraries.places.api.model.LocalTime;
import com.google.android.libraries.places.api.model.OpeningHours;
import com.google.android.libraries.places.api.model.Period;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.libraries.places.api.model.PlusCode;
import com.google.android.libraries.places.api.model.SpecialDay;
import com.google.android.libraries.places.api.model.TimeOfWeek;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import defpackage.recalculateAvailableCameras;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzlf {
    private static final ImmutableMap zza = ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentbindingInflater1("OPERATIONAL", Place.BusinessStatus.OPERATIONAL).TuitionPaymentFragmentbindingInflater1("CLOSED_TEMPORARILY", Place.BusinessStatus.CLOSED_TEMPORARILY).TuitionPaymentFragmentbindingInflater1("CLOSED_PERMANENTLY", Place.BusinessStatus.CLOSED_PERMANENTLY).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    private static final ImmutableMap zzb = ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentbindingInflater1(PlaceTypes.ACCOUNTING, Place.Type.ACCOUNTING).TuitionPaymentFragmentbindingInflater1(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_1, Place.Type.ADMINISTRATIVE_AREA_LEVEL_1).TuitionPaymentFragmentbindingInflater1(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_2, Place.Type.ADMINISTRATIVE_AREA_LEVEL_2).TuitionPaymentFragmentbindingInflater1(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_3, Place.Type.ADMINISTRATIVE_AREA_LEVEL_3).TuitionPaymentFragmentbindingInflater1(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_4, Place.Type.ADMINISTRATIVE_AREA_LEVEL_4).TuitionPaymentFragmentbindingInflater1(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_5, Place.Type.ADMINISTRATIVE_AREA_LEVEL_5).TuitionPaymentFragmentbindingInflater1(PlaceTypes.AIRPORT, Place.Type.AIRPORT).TuitionPaymentFragmentbindingInflater1(PlaceTypes.AMUSEMENT_PARK, Place.Type.AMUSEMENT_PARK).TuitionPaymentFragmentbindingInflater1(PlaceTypes.AQUARIUM, Place.Type.AQUARIUM).TuitionPaymentFragmentbindingInflater1(PlaceTypes.ARCHIPELAGO, Place.Type.ARCHIPELAGO).TuitionPaymentFragmentbindingInflater1(PlaceTypes.ART_GALLERY, Place.Type.ART_GALLERY).TuitionPaymentFragmentbindingInflater1(PlaceTypes.ATM, Place.Type.ATM).TuitionPaymentFragmentbindingInflater1(PlaceTypes.BAKERY, Place.Type.BAKERY).TuitionPaymentFragmentbindingInflater1(PlaceTypes.BANK, Place.Type.BANK).TuitionPaymentFragmentbindingInflater1(PlaceTypes.BAR, Place.Type.BAR).TuitionPaymentFragmentbindingInflater1(PlaceTypes.BEAUTY_SALON, Place.Type.BEAUTY_SALON).TuitionPaymentFragmentbindingInflater1(PlaceTypes.BICYCLE_STORE, Place.Type.BICYCLE_STORE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.BOOK_STORE, Place.Type.BOOK_STORE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.BOWLING_ALLEY, Place.Type.BOWLING_ALLEY).TuitionPaymentFragmentbindingInflater1(PlaceTypes.BUS_STATION, Place.Type.BUS_STATION).TuitionPaymentFragmentbindingInflater1(PlaceTypes.CAFE, Place.Type.CAFE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.CAMPGROUND, Place.Type.CAMPGROUND).TuitionPaymentFragmentbindingInflater1(PlaceTypes.CAR_DEALER, Place.Type.CAR_DEALER).TuitionPaymentFragmentbindingInflater1(PlaceTypes.CAR_RENTAL, Place.Type.CAR_RENTAL).TuitionPaymentFragmentbindingInflater1(PlaceTypes.CAR_REPAIR, Place.Type.CAR_REPAIR).TuitionPaymentFragmentbindingInflater1(PlaceTypes.CAR_WASH, Place.Type.CAR_WASH).TuitionPaymentFragmentbindingInflater1(PlaceTypes.CASINO, Place.Type.CASINO).TuitionPaymentFragmentbindingInflater1(PlaceTypes.CEMETERY, Place.Type.CEMETERY).TuitionPaymentFragmentbindingInflater1(PlaceTypes.CHURCH, Place.Type.CHURCH).TuitionPaymentFragmentbindingInflater1(PlaceTypes.CITY_HALL, Place.Type.CITY_HALL).TuitionPaymentFragmentbindingInflater1(PlaceTypes.CLOTHING_STORE, Place.Type.CLOTHING_STORE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.COLLOQUIAL_AREA, Place.Type.COLLOQUIAL_AREA).TuitionPaymentFragmentbindingInflater1(PlaceTypes.CONTINENT, Place.Type.CONTINENT).TuitionPaymentFragmentbindingInflater1(PlaceTypes.CONVENIENCE_STORE, Place.Type.CONVENIENCE_STORE).TuitionPaymentFragmentbindingInflater1("country", Place.Type.COUNTRY).TuitionPaymentFragmentbindingInflater1(PlaceTypes.COURTHOUSE, Place.Type.COURTHOUSE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.DENTIST, Place.Type.DENTIST).TuitionPaymentFragmentbindingInflater1(PlaceTypes.DEPARTMENT_STORE, Place.Type.DEPARTMENT_STORE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.DOCTOR, Place.Type.DOCTOR).TuitionPaymentFragmentbindingInflater1(PlaceTypes.DRUGSTORE, Place.Type.DRUGSTORE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.ELECTRICIAN, Place.Type.ELECTRICIAN).TuitionPaymentFragmentbindingInflater1(PlaceTypes.ELECTRONICS_STORE, Place.Type.ELECTRONICS_STORE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.EMBASSY, Place.Type.EMBASSY).TuitionPaymentFragmentbindingInflater1(PlaceTypes.ESTABLISHMENT, Place.Type.ESTABLISHMENT).TuitionPaymentFragmentbindingInflater1(PlaceTypes.FINANCE, Place.Type.FINANCE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.FIRE_STATION, Place.Type.FIRE_STATION).TuitionPaymentFragmentbindingInflater1(PlaceTypes.FLOOR, Place.Type.FLOOR).TuitionPaymentFragmentbindingInflater1(PlaceTypes.FLORIST, Place.Type.FLORIST).TuitionPaymentFragmentbindingInflater1(PlaceTypes.FOOD, Place.Type.FOOD).TuitionPaymentFragmentbindingInflater1(PlaceTypes.FUNERAL_HOME, Place.Type.FUNERAL_HOME).TuitionPaymentFragmentbindingInflater1(PlaceTypes.FURNITURE_STORE, Place.Type.FURNITURE_STORE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.GAS_STATION, Place.Type.GAS_STATION).TuitionPaymentFragmentbindingInflater1(PlaceTypes.GENERAL_CONTRACTOR, Place.Type.GENERAL_CONTRACTOR).TuitionPaymentFragmentbindingInflater1(PlaceTypes.GEOCODE, Place.Type.GEOCODE).TuitionPaymentFragmentbindingInflater1("grocery_or_supermarket", Place.Type.GROCERY_OR_SUPERMARKET).TuitionPaymentFragmentbindingInflater1(PlaceTypes.GYM, Place.Type.GYM).TuitionPaymentFragmentbindingInflater1(PlaceTypes.HAIR_CARE, Place.Type.HAIR_CARE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.HARDWARE_STORE, Place.Type.HARDWARE_STORE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.HEALTH, Place.Type.HEALTH).TuitionPaymentFragmentbindingInflater1(PlaceTypes.HINDU_TEMPLE, Place.Type.HINDU_TEMPLE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.HOME_GOODS_STORE, Place.Type.HOME_GOODS_STORE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.HOSPITAL, Place.Type.HOSPITAL).TuitionPaymentFragmentbindingInflater1(PlaceTypes.INSURANCE_AGENCY, Place.Type.INSURANCE_AGENCY).TuitionPaymentFragmentbindingInflater1(PlaceTypes.INTERSECTION, Place.Type.INTERSECTION).TuitionPaymentFragmentbindingInflater1(PlaceTypes.JEWELRY_STORE, Place.Type.JEWELRY_STORE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.LAUNDRY, Place.Type.LAUNDRY).TuitionPaymentFragmentbindingInflater1(PlaceTypes.LAWYER, Place.Type.LAWYER).TuitionPaymentFragmentbindingInflater1(PlaceTypes.LIBRARY, Place.Type.LIBRARY).TuitionPaymentFragmentbindingInflater1(PlaceTypes.LIGHT_RAIL_STATION, Place.Type.LIGHT_RAIL_STATION).TuitionPaymentFragmentbindingInflater1(PlaceTypes.LIQUOR_STORE, Place.Type.LIQUOR_STORE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.LOCAL_GOVERNMENT_OFFICE, Place.Type.LOCAL_GOVERNMENT_OFFICE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.LOCALITY, Place.Type.LOCALITY).TuitionPaymentFragmentbindingInflater1(PlaceTypes.LOCKSMITH, Place.Type.LOCKSMITH).TuitionPaymentFragmentbindingInflater1(PlaceTypes.LODGING, Place.Type.LODGING).TuitionPaymentFragmentbindingInflater1(PlaceTypes.MEAL_DELIVERY, Place.Type.MEAL_DELIVERY).TuitionPaymentFragmentbindingInflater1(PlaceTypes.MEAL_TAKEAWAY, Place.Type.MEAL_TAKEAWAY).TuitionPaymentFragmentbindingInflater1(PlaceTypes.MOSQUE, Place.Type.MOSQUE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.MOVIE_RENTAL, Place.Type.MOVIE_RENTAL).TuitionPaymentFragmentbindingInflater1(PlaceTypes.MOVIE_THEATER, Place.Type.MOVIE_THEATER).TuitionPaymentFragmentbindingInflater1(PlaceTypes.MOVING_COMPANY, Place.Type.MOVING_COMPANY).TuitionPaymentFragmentbindingInflater1(PlaceTypes.MUSEUM, Place.Type.MUSEUM).TuitionPaymentFragmentbindingInflater1(PlaceTypes.NATURAL_FEATURE, Place.Type.NATURAL_FEATURE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.NEIGHBORHOOD, Place.Type.NEIGHBORHOOD).TuitionPaymentFragmentbindingInflater1(PlaceTypes.NIGHT_CLUB, Place.Type.NIGHT_CLUB).TuitionPaymentFragmentbindingInflater1(PlaceTypes.PAINTER, Place.Type.PAINTER).TuitionPaymentFragmentbindingInflater1(PlaceTypes.PARK, Place.Type.PARK).TuitionPaymentFragmentbindingInflater1(PlaceTypes.PARKING, Place.Type.PARKING).TuitionPaymentFragmentbindingInflater1(PlaceTypes.PET_STORE, Place.Type.PET_STORE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.PHARMACY, Place.Type.PHARMACY).TuitionPaymentFragmentbindingInflater1(PlaceTypes.PHYSIOTHERAPIST, Place.Type.PHYSIOTHERAPIST).TuitionPaymentFragmentbindingInflater1(PlaceTypes.PLACE_OF_WORSHIP, Place.Type.PLACE_OF_WORSHIP).TuitionPaymentFragmentbindingInflater1(PlaceTypes.PLUMBER, Place.Type.PLUMBER).TuitionPaymentFragmentbindingInflater1(PlaceTypes.PLUS_CODE, Place.Type.PLUS_CODE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.POINT_OF_INTEREST, Place.Type.POINT_OF_INTEREST).TuitionPaymentFragmentbindingInflater1(PlaceTypes.POLICE, Place.Type.POLICE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.POLITICAL, Place.Type.POLITICAL).TuitionPaymentFragmentbindingInflater1(PlaceTypes.POST_BOX, Place.Type.POST_BOX).TuitionPaymentFragmentbindingInflater1(PlaceTypes.POST_OFFICE, Place.Type.POST_OFFICE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.POSTAL_CODE_PREFIX, Place.Type.POSTAL_CODE_PREFIX).TuitionPaymentFragmentbindingInflater1(PlaceTypes.POSTAL_CODE_SUFFIX, Place.Type.POSTAL_CODE_SUFFIX).TuitionPaymentFragmentbindingInflater1(PlaceTypes.POSTAL_CODE, Place.Type.POSTAL_CODE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.POSTAL_TOWN, Place.Type.POSTAL_TOWN).TuitionPaymentFragmentbindingInflater1(PlaceTypes.PREMISE, Place.Type.PREMISE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.PRIMARY_SCHOOL, Place.Type.PRIMARY_SCHOOL).TuitionPaymentFragmentbindingInflater1(PlaceTypes.REAL_ESTATE_AGENCY, Place.Type.REAL_ESTATE_AGENCY).TuitionPaymentFragmentbindingInflater1(PlaceTypes.RESTAURANT, Place.Type.RESTAURANT).TuitionPaymentFragmentbindingInflater1(PlaceTypes.ROOFING_CONTRACTOR, Place.Type.ROOFING_CONTRACTOR).TuitionPaymentFragmentbindingInflater1(PlaceTypes.ROOM, Place.Type.ROOM).TuitionPaymentFragmentbindingInflater1(PlaceTypes.ROUTE, Place.Type.ROUTE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.RV_PARK, Place.Type.RV_PARK).TuitionPaymentFragmentbindingInflater1(PlaceTypes.SCHOOL, Place.Type.SCHOOL).TuitionPaymentFragmentbindingInflater1(PlaceTypes.SECONDARY_SCHOOL, Place.Type.SECONDARY_SCHOOL).TuitionPaymentFragmentbindingInflater1(PlaceTypes.SHOE_STORE, Place.Type.SHOE_STORE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.SHOPPING_MALL, Place.Type.SHOPPING_MALL).TuitionPaymentFragmentbindingInflater1(PlaceTypes.SPA, Place.Type.SPA).TuitionPaymentFragmentbindingInflater1(PlaceTypes.STADIUM, Place.Type.STADIUM).TuitionPaymentFragmentbindingInflater1(PlaceTypes.STORAGE, Place.Type.STORAGE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.STORE, Place.Type.STORE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.STREET_ADDRESS, Place.Type.STREET_ADDRESS).TuitionPaymentFragmentbindingInflater1(PlaceTypes.STREET_NUMBER, Place.Type.STREET_NUMBER).TuitionPaymentFragmentbindingInflater1(PlaceTypes.SUBLOCALITY_LEVEL_1, Place.Type.SUBLOCALITY_LEVEL_1).TuitionPaymentFragmentbindingInflater1(PlaceTypes.SUBLOCALITY_LEVEL_2, Place.Type.SUBLOCALITY_LEVEL_2).TuitionPaymentFragmentbindingInflater1(PlaceTypes.SUBLOCALITY_LEVEL_3, Place.Type.SUBLOCALITY_LEVEL_3).TuitionPaymentFragmentbindingInflater1(PlaceTypes.SUBLOCALITY_LEVEL_4, Place.Type.SUBLOCALITY_LEVEL_4).TuitionPaymentFragmentbindingInflater1(PlaceTypes.SUBLOCALITY_LEVEL_5, Place.Type.SUBLOCALITY_LEVEL_5).TuitionPaymentFragmentbindingInflater1(PlaceTypes.SUBLOCALITY, Place.Type.SUBLOCALITY).TuitionPaymentFragmentbindingInflater1(PlaceTypes.SUBPREMISE, Place.Type.SUBPREMISE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.SUBWAY_STATION, Place.Type.SUBWAY_STATION).TuitionPaymentFragmentbindingInflater1(PlaceTypes.SUPERMARKET, Place.Type.SUPERMARKET).TuitionPaymentFragmentbindingInflater1(PlaceTypes.SYNAGOGUE, Place.Type.SYNAGOGUE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.TAXI_STAND, Place.Type.TAXI_STAND).TuitionPaymentFragmentbindingInflater1(PlaceTypes.TOURIST_ATTRACTION, Place.Type.TOURIST_ATTRACTION).TuitionPaymentFragmentbindingInflater1(PlaceTypes.TOWN_SQUARE, Place.Type.TOWN_SQUARE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.TRAIN_STATION, Place.Type.TRAIN_STATION).TuitionPaymentFragmentbindingInflater1(PlaceTypes.TRANSIT_STATION, Place.Type.TRANSIT_STATION).TuitionPaymentFragmentbindingInflater1(PlaceTypes.TRAVEL_AGENCY, Place.Type.TRAVEL_AGENCY).TuitionPaymentFragmentbindingInflater1(PlaceTypes.UNIVERSITY, Place.Type.UNIVERSITY).TuitionPaymentFragmentbindingInflater1(PlaceTypes.VETERINARY_CARE, Place.Type.VETERINARY_CARE).TuitionPaymentFragmentbindingInflater1(PlaceTypes.ZOO, Place.Type.ZOO).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    private static final ImmutableMap zzc = ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentbindingInflater1("ACCESS", OpeningHours.HoursType.ACCESS).TuitionPaymentFragmentbindingInflater1("BREAKFAST", OpeningHours.HoursType.BREAKFAST).TuitionPaymentFragmentbindingInflater1("BRUNCH", OpeningHours.HoursType.BRUNCH).TuitionPaymentFragmentbindingInflater1("DELIVERY", OpeningHours.HoursType.DELIVERY).TuitionPaymentFragmentbindingInflater1("DINNER", OpeningHours.HoursType.DINNER).TuitionPaymentFragmentbindingInflater1("DRIVE_THROUGH", OpeningHours.HoursType.DRIVE_THROUGH).TuitionPaymentFragmentbindingInflater1("HAPPY_HOUR", OpeningHours.HoursType.HAPPY_HOUR).TuitionPaymentFragmentbindingInflater1("KITCHEN", OpeningHours.HoursType.KITCHEN).TuitionPaymentFragmentbindingInflater1("LUNCH", OpeningHours.HoursType.LUNCH).TuitionPaymentFragmentbindingInflater1("ONLINE_SERVICE_HOURS", OpeningHours.HoursType.ONLINE_SERVICE_HOURS).TuitionPaymentFragmentbindingInflater1("PICKUP", OpeningHours.HoursType.PICKUP).TuitionPaymentFragmentbindingInflater1("SENIOR_HOURS", OpeningHours.HoursType.SENIOR_HOURS).TuitionPaymentFragmentbindingInflater1("TAKEOUT", OpeningHours.HoursType.TAKEOUT).TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    static TimeOfWeek zza(zzli.zzd.zzc zzcVar) {
        LocalTime localTimeNewInstance;
        DayOfWeek dayOfWeek;
        LocalDate localDateZzb = null;
        if (zzcVar == null) {
            return null;
        }
        try {
            Integer numZza = zzcVar.zza();
            if (numZza == null) {
                throw new NullPointerException("Unable to convert Pablo response to TimeOfWeek: The \"day\" field is missing.");
            }
            Integer num = numZza;
            String strZzb = zzcVar.zzb();
            if (strZzb == null) {
                throw new NullPointerException("Unable to convert Pablo response to TimeOfWeek: The \"time\" field is missing.");
            }
            String str = strZzb;
            if (strZzb != null) {
                String str2 = String.format("Unable to convert %s to LocalTime, must be of format \"hhmm\".", strZzb);
                if (strZzb.length() != 4) {
                    throw new IllegalArgumentException(String.valueOf(str2));
                }
                try {
                    localTimeNewInstance = LocalTime.newInstance(Integer.parseInt(strZzb.substring(0, 2)), Integer.parseInt(strZzb.substring(2, 4)));
                } catch (NumberFormatException e2) {
                    throw new IllegalArgumentException(str2, e2);
                }
            } else {
                localTimeNewInstance = null;
            }
            LocalTime localTime = localTimeNewInstance;
            try {
                localDateZzb = zzb(zzcVar.zzc());
            } catch (IllegalArgumentException unused) {
            }
            switch (numZza.intValue()) {
                case 0:
                    dayOfWeek = DayOfWeek.SUNDAY;
                    break;
                case 1:
                    dayOfWeek = DayOfWeek.MONDAY;
                    break;
                case 2:
                    dayOfWeek = DayOfWeek.TUESDAY;
                    break;
                case 3:
                    dayOfWeek = DayOfWeek.WEDNESDAY;
                    break;
                case 4:
                    dayOfWeek = DayOfWeek.THURSDAY;
                    break;
                case 5:
                    dayOfWeek = DayOfWeek.FRIDAY;
                    break;
                case 6:
                    dayOfWeek = DayOfWeek.SATURDAY;
                    break;
                default:
                    throw new IllegalArgumentException("pabloDayOfWeek can only be an integer between 0 and 6");
            }
            TimeOfWeek.Builder builder = TimeOfWeek.builder(dayOfWeek, localTimeNewInstance);
            builder.setDate(localDateZzb);
            builder.setTruncated(Objects.equals(zzcVar.zzd(), Boolean.TRUE));
            return builder.build();
        } catch (NullPointerException e3) {
            throw new IllegalArgumentException(e3.getMessage(), e3);
        }
    }

    static LocalDate zzb(String str) {
        if (str == null) {
            return null;
        }
        try {
            return LocalDate.newInstance(Integer.parseInt(str.substring(0, 4)), Integer.parseInt(str.substring(5, 7)), Integer.parseInt(str.substring(8, 10)));
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(String.format("Unable to convert %s to LocalDate; date should be in format YYYY-MM-DD.", str), e2);
        }
    }

    static List zzc(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    @Deprecated
    static List zzd(List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            ImmutableMap immutableMap = zzb;
            if (immutableMap.containsKey(str)) {
                arrayList.add((Place.Type) immutableMap.get(str));
            } else {
                z = true;
            }
        }
        if (z) {
            arrayList.add(Place.Type.OTHER);
        }
        return arrayList;
    }

    static Place.BooleanPlaceAttributeValue zze(Boolean bool) {
        if (bool == null) {
            return Place.BooleanPlaceAttributeValue.UNKNOWN;
        }
        return bool.booleanValue() ? Place.BooleanPlaceAttributeValue.TRUE : Place.BooleanPlaceAttributeValue.FALSE;
    }

    static List zzf(List list) {
        return list != null ? list : new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0096  */
    static final Place zzg(zzli zzliVar, List list) throws ApiException {
        AddressComponents addressComponentsNewInstance;
        AddressComponent addressComponentBuild;
        LatLng latLngZzi;
        LatLngBounds latLngBounds;
        Integer numValueOf;
        ArrayList arrayList;
        PlusCode plusCodeBuild;
        String string;
        PhotoMetadata photoMetadataBuild;
        Place.Builder builder = Place.builder();
        builder.setAttributions(list);
        if (zzliVar != null) {
            ImmutableList<zzli.zza> immutableListZza = zzliVar.zza();
            ArrayList arrayList2 = null;
            if (immutableListZza.isEmpty()) {
                addressComponentsNewInstance = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (zzli.zza zzaVar : immutableListZza) {
                    if (zzaVar == null) {
                        addressComponentBuild = null;
                    } else {
                        try {
                            String strZza = zzaVar.zza();
                            String str = strZza;
                            AddressComponent.Builder builder2 = AddressComponent.builder(strZza, zzaVar.zzc());
                            builder2.setShortName(zzaVar.zzb());
                            addressComponentBuild = builder2.build();
                        } catch (IllegalStateException | NullPointerException e2) {
                            throw zzj(String.format("AddressComponent not properly defined (%s).", e2.getMessage()));
                        }
                    }
                    zzk(arrayList3, addressComponentBuild);
                }
                addressComponentsNewInstance = AddressComponents.newInstance(arrayList3);
            }
            zzli.zzc zzcVarZzi = zzliVar.zzi();
            if (zzcVarZzi != null) {
                latLngZzi = zzi(zzcVarZzi.zza());
                zzli.zzc.zzb zzbVarZzb = zzcVarZzi.zzb();
                if (zzbVarZzb == null) {
                    latLngBounds = null;
                } else {
                    LatLng latLngZzi2 = zzi(zzbVarZzb.zzb());
                    LatLng latLngZzi3 = zzi(zzbVarZzb.zza());
                    if (latLngZzi2 == null || latLngZzi3 == null) {
                        latLngBounds = null;
                    } else {
                        latLngBounds = new LatLngBounds(latLngZzi2, latLngZzi3);
                    }
                }
            } else {
                latLngZzi = null;
                latLngBounds = null;
            }
            String strZzF = zzliVar.zzF();
            Uri uri = strZzF != null ? Uri.parse(strZzF) : null;
            String strZzk = zzliVar.zzk();
            String strConcat = strZzk != null ? strZzk.concat(".png") : null;
            String strZzj = zzliVar.zzj();
            if (strZzj != null) {
                try {
                    numValueOf = Integer.valueOf(Color.parseColor(strZzj));
                } catch (IllegalArgumentException unused) {
                    numValueOf = null;
                }
            } else {
                numValueOf = null;
            }
            builder.setAddress(zzliVar.zzh());
            builder.setAddressComponents(addressComponentsNewInstance);
            builder.setBusinessStatus((Place.BusinessStatus) zza.getOrDefault(zzliVar.zzb(), null));
            builder.setCurbsidePickup(zze(zzliVar.zzc()));
            builder.setCurrentOpeningHours(zzh(zzliVar.zzd()));
            builder.setDelivery(zze(zzliVar.zze()));
            builder.setDineIn(zze(zzliVar.zzf()));
            builder.setDisplayName(zzliVar.zzm());
            zzli.zzb zzbVarZzg = zzliVar.zzg();
            builder.setEditorialSummary(zzbVarZzg == null ? null : zzbVarZzg.zzb());
            zzli.zzb zzbVarZzg2 = zzliVar.zzg();
            builder.setEditorialSummaryLanguageCode(zzbVarZzg2 == null ? null : zzbVarZzg2.zza());
            builder.setFormattedAddress(zzliVar.zzh());
            builder.setIconBackgroundColor(numValueOf);
            builder.setIconMaskUrl(strConcat);
            builder.setIconUrl(strConcat);
            builder.setId(zzliVar.zzp());
            builder.setInternationalPhoneNumber(zzliVar.zzl());
            builder.setLatLng(latLngZzi);
            builder.setLocation(latLngZzi);
            builder.setName(zzliVar.zzm());
            builder.setOpeningHours(zzh(zzliVar.zzn()));
            builder.setPhoneNumber(zzliVar.zzl());
            ImmutableList<zzli.zze> immutableListZzo = zzliVar.zzo();
            if (immutableListZzo.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (zzli.zze zzeVar : immutableListZzo) {
                    if (zzeVar == null) {
                        photoMetadataBuild = null;
                    } else {
                        String strZzc = zzeVar.zzc();
                        if (TextUtils.isEmpty(strZzc)) {
                            throw zzj("Photo reference not provided for a PhotoMetadata result.");
                        }
                        Integer numZza = zzeVar.zza();
                        Integer numZzb = zzeVar.zzb();
                        PhotoMetadata.Builder builder3 = PhotoMetadata.builder(strZzc);
                        ImmutableList immutableListZzd = zzeVar.zzd();
                        if (immutableListZzd.isEmpty()) {
                            string = "";
                        } else {
                            recalculateAvailableCameras recalculateavailablecamerasTuitionPaymentFragmentspecialinlinedviewModeldefault3 = recalculateAvailableCameras.TuitionPaymentFragmentspecialinlinedviewModeldefault3(", ");
                            string = new recalculateAvailableCameras(recalculateavailablecamerasTuitionPaymentFragmentspecialinlinedviewModeldefault3) { // from class: recalculateAvailableCameras.1
                                public AnonymousClass1(recalculateAvailableCameras recalculateavailablecamerasTuitionPaymentFragmentspecialinlinedviewModeldefault4) {
                                    super(recalculateavailablecamerasTuitionPaymentFragmentspecialinlinedviewModeldefault4, (byte) 0);
                                }

                                @Override // defpackage.recalculateAvailableCameras
                                public final <A extends Appendable> A TuitionPaymentFragmentspecialinlinedviewModeldefault1(A a2, Iterator<? extends Object> it) throws IOException {
                                    if (a2 == null) {
                                        throw new NullPointerException("appendable");
                                    }
                                    if (it != null) {
                                        while (it.hasNext()) {
                                            Object next = it.next();
                                            if (next != null) {
                                                Objects.requireNonNull(next);
                                                a2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                                                break;
                                            }
                                        }
                                        while (it.hasNext()) {
                                            Object next2 = it.next();
                                            if (next2 != null) {
                                                a2.append(recalculateAvailableCameras.this.TuitionPaymentFragmentbindingInflater1);
                                                Objects.requireNonNull(next2);
                                                a2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                                            }
                                        }
                                        return a2;
                                    }
                                    throw new NullPointerException("parts");
                                }

                                @Override // defpackage.recalculateAvailableCameras
                                public final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str2) {
                                    throw new UnsupportedOperationException("can't use .skipNulls() with maps");
                                }
                            }.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new StringBuilder(), immutableListZzd.iterator()).toString();
                        }
                        builder3.setAttributions(string);
                        builder3.setHeight(numZza == null ? 0 : numZza.intValue());
                        builder3.setWidth(numZzb != null ? numZzb.intValue() : 0);
                        photoMetadataBuild = builder3.build();
                    }
                    zzk(arrayList, photoMetadataBuild);
                }
            }
            builder.setPhotoMetadatas(arrayList);
            builder.setPlaceTypes(zzc(zzliVar.zzC()));
            zzli.zzf zzfVarZzq = zzliVar.zzq();
            if (zzfVarZzq == null) {
                plusCodeBuild = null;
            } else {
                PlusCode.Builder builder4 = PlusCode.builder();
                builder4.setCompoundCode(zzfVarZzq.zza());
                builder4.setGlobalCode(zzfVarZzq.zzb());
                plusCodeBuild = builder4.build();
            }
            builder.setPlusCode(plusCodeBuild);
            builder.setPriceLevel(zzliVar.zzr());
            builder.setRating(zzliVar.zzs());
            builder.setReservable(zze(zzliVar.zzt()));
            ImmutableList immutableListZzu = zzliVar.zzu();
            if (!immutableListZzu.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                Iterator<E> it = immutableListZzu.iterator();
                while (it.hasNext()) {
                    zzk(arrayList4, zzh((zzli.zzd) it.next()));
                }
                if (!arrayList4.isEmpty()) {
                    arrayList2 = arrayList4;
                }
            }
            builder.setSecondaryOpeningHours(arrayList2);
            builder.setServesBeer(zze(zzliVar.zzv()));
            builder.setServesBreakfast(zze(zzliVar.zzw()));
            builder.setServesBrunch(zze(zzliVar.zzw()));
            builder.setServesDinner(zze(zzliVar.zzx()));
            builder.setServesLunch(zze(zzliVar.zzy()));
            builder.setServesVegetarianFood(zze(zzliVar.zzz()));
            builder.setServesWine(zze(zzliVar.zzA()));
            builder.setTakeout(zze(zzliVar.zzB()));
            builder.setTypes(zzd(zzliVar.zzC()));
            builder.setUserRatingCount(zzliVar.zzD());
            builder.setUserRatingsTotal(zzliVar.zzD());
            builder.setUtcOffsetMinutes(zzliVar.zzE());
            builder.setViewport(latLngBounds);
            builder.setWebsiteUri(uri);
            builder.setWheelchairAccessibleEntrance(zze(zzliVar.zzG()));
        }
        return builder.build();
    }

    private static OpeningHours zzh(zzli.zzd zzdVar) {
        ArrayList arrayList;
        SpecialDay specialDayBuild;
        Period periodBuild;
        if (zzdVar == null) {
            return null;
        }
        OpeningHours.Builder builder = OpeningHours.builder();
        ImmutableList<zzli.zzd.zza> immutableListZza = zzdVar.zza();
        if (immutableListZza.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (zzli.zzd.zza zzaVar : immutableListZza) {
                if (zzaVar != null) {
                    Period.Builder builder2 = Period.builder();
                    builder2.setOpen(zza(zzaVar.zzb()));
                    builder2.setClose(zza(zzaVar.zza()));
                    periodBuild = builder2.build();
                } else {
                    periodBuild = null;
                }
                zzk(arrayList, periodBuild);
            }
        }
        builder.setPeriods(zzf(arrayList));
        builder.setWeekdayText(zzdVar.zzb());
        builder.setHoursType((OpeningHours.HoursType) zzc.getOrDefault(zzdVar.zzc(), null));
        ImmutableList<zzli.zzd.zzb> immutableListZzd = zzdVar.zzd();
        ArrayList arrayList2 = new ArrayList();
        if (!immutableListZzd.isEmpty()) {
            for (zzli.zzd.zzb zzbVar : immutableListZzd) {
                if (zzbVar == null) {
                    specialDayBuild = null;
                } else {
                    try {
                        LocalDate localDateZzb = zzb(zzbVar.zza());
                        LocalDate localDate = localDateZzb;
                        SpecialDay.Builder builder3 = SpecialDay.builder(localDateZzb);
                        builder3.setExceptional(Objects.equals(zzbVar.zzb(), Boolean.TRUE));
                        specialDayBuild = builder3.build();
                    } catch (IllegalArgumentException | NullPointerException unused) {
                        specialDayBuild = null;
                    }
                }
                zzk(arrayList2, specialDayBuild);
            }
        }
        builder.setSpecialDays(arrayList2);
        return builder.build();
    }

    private static LatLng zzi(zzli.zzc.zza zzaVar) {
        if (zzaVar == null) {
            return null;
        }
        Double dZza = zzaVar.zza();
        Double dZzb = zzaVar.zzb();
        if (dZza == null || dZzb == null) {
            return null;
        }
        return new LatLng(dZza.doubleValue(), dZzb.doubleValue());
    }

    private static ApiException zzj(String str) {
        return new ApiException(new Status(8, "Unexpected server error: ".concat(String.valueOf(str))));
    }

    private static boolean zzk(Collection collection, Object obj) {
        if (obj != null) {
            return collection.add(obj);
        }
        return false;
    }

    zzlf() {
    }
}
