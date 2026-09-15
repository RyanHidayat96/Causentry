package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AccessibilityOptions;
import com.google.android.libraries.places.api.model.ParkingOptions;
import com.google.android.libraries.places.api.model.PaymentOptions;
import com.google.android.libraries.places.api.model.Place;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzn {
    public static final List zza(Place place, Context context) {
        Intrinsics.checkNotNullParameter(place, "");
        Intrinsics.checkNotNullParameter(context, "");
        ArrayList arrayList = new ArrayList();
        if (zzce.zza(place)) {
            zzb(arrayList);
            String string = context.getString(R.string.place_details_about_service_options);
            Intrinsics.checkNotNullExpressionValue(string, "");
            arrayList.add(new zzh(string));
            Place.BooleanPlaceAttributeValue dineIn = place.getDineIn();
            Intrinsics.checkNotNullExpressionValue(dineIn, "");
            if (zzc(dineIn)) {
                String string2 = context.getString(R.string.place_details_dine_in_service_option);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                arrayList.add(new zzf(string2));
            }
            Place.BooleanPlaceAttributeValue outdoorSeating = place.getOutdoorSeating();
            Intrinsics.checkNotNullExpressionValue(outdoorSeating, "");
            if (zzc(outdoorSeating)) {
                String string3 = context.getString(R.string.place_details_outdoor_seating_service_option);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                arrayList.add(new zzf(string3));
            }
            Place.BooleanPlaceAttributeValue reservable = place.getReservable();
            Intrinsics.checkNotNullExpressionValue(reservable, "");
            if (zzc(reservable)) {
                String string4 = context.getString(R.string.place_details_takes_reservations_service_option);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                arrayList.add(new zzf(string4));
            }
            Place.BooleanPlaceAttributeValue takeout = place.getTakeout();
            Intrinsics.checkNotNullExpressionValue(takeout, "");
            if (zzc(takeout)) {
                String string5 = context.getString(R.string.place_details_takeout_service_option);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                arrayList.add(new zzf(string5));
            }
            Place.BooleanPlaceAttributeValue delivery = place.getDelivery();
            Intrinsics.checkNotNullExpressionValue(delivery, "");
            if (zzc(delivery)) {
                String string6 = context.getString(R.string.place_details_delivery_service_option);
                Intrinsics.checkNotNullExpressionValue(string6, "");
                arrayList.add(new zzf(string6));
            }
            Place.BooleanPlaceAttributeValue curbsidePickup = place.getCurbsidePickup();
            Intrinsics.checkNotNullExpressionValue(curbsidePickup, "");
            if (zzc(curbsidePickup)) {
                String string7 = context.getString(R.string.place_details_curbside_pickup_service_option);
                Intrinsics.checkNotNullExpressionValue(string7, "");
                arrayList.add(new zzf(string7));
            }
        }
        if (zzce.zzb(place)) {
            zzb(arrayList);
            String string8 = context.getString(R.string.place_details_about_popular_for);
            Intrinsics.checkNotNullExpressionValue(string8, "");
            arrayList.add(new zzh(string8));
            Place.BooleanPlaceAttributeValue servesBreakfast = place.getServesBreakfast();
            Intrinsics.checkNotNullExpressionValue(servesBreakfast, "");
            if (zzc(servesBreakfast)) {
                String string9 = context.getString(R.string.place_details_popular_for_breakfast);
                Intrinsics.checkNotNullExpressionValue(string9, "");
                arrayList.add(new zzf(string9));
            }
            Place.BooleanPlaceAttributeValue servesLunch = place.getServesLunch();
            Intrinsics.checkNotNullExpressionValue(servesLunch, "");
            if (zzc(servesLunch)) {
                String string10 = context.getString(R.string.place_details_popular_for_lunch);
                Intrinsics.checkNotNullExpressionValue(string10, "");
                arrayList.add(new zzf(string10));
            }
            Place.BooleanPlaceAttributeValue servesBrunch = place.getServesBrunch();
            Intrinsics.checkNotNullExpressionValue(servesBrunch, "");
            if (zzc(servesBrunch)) {
                String string11 = context.getString(R.string.place_details_popular_for_brunch);
                Intrinsics.checkNotNullExpressionValue(string11, "");
                arrayList.add(new zzf(string11));
            }
            Place.BooleanPlaceAttributeValue servesDinner = place.getServesDinner();
            Intrinsics.checkNotNullExpressionValue(servesDinner, "");
            if (zzc(servesDinner)) {
                String string12 = context.getString(R.string.place_details_popular_for_dinner);
                Intrinsics.checkNotNullExpressionValue(string12, "");
                arrayList.add(new zzf(string12));
            }
            Place.BooleanPlaceAttributeValue servesDessert = place.getServesDessert();
            Intrinsics.checkNotNullExpressionValue(servesDessert, "");
            if (zzc(servesDessert)) {
                String string13 = context.getString(R.string.place_details_popular_for_dessert);
                Intrinsics.checkNotNullExpressionValue(string13, "");
                arrayList.add(new zzf(string13));
            }
        }
        AccessibilityOptions accessibilityOptions = place.getAccessibilityOptions();
        if (zzce.zzc(place) && accessibilityOptions != null) {
            zzb(arrayList);
            String string14 = context.getString(R.string.place_details_about_accessibility);
            Intrinsics.checkNotNullExpressionValue(string14, "");
            arrayList.add(new zzh(string14));
            Place.BooleanPlaceAttributeValue wheelchairAccessibleEntrance = accessibilityOptions.getWheelchairAccessibleEntrance();
            Intrinsics.checkNotNullExpressionValue(wheelchairAccessibleEntrance, "");
            if (zzc(wheelchairAccessibleEntrance)) {
                String string15 = context.getString(R.string.place_details_accessibility_entrance);
                Intrinsics.checkNotNullExpressionValue(string15, "");
                arrayList.add(new zzf(string15));
            }
            Place.BooleanPlaceAttributeValue wheelchairAccessibleParking = accessibilityOptions.getWheelchairAccessibleParking();
            Intrinsics.checkNotNullExpressionValue(wheelchairAccessibleParking, "");
            if (zzc(wheelchairAccessibleParking)) {
                String string16 = context.getString(R.string.place_details_accessibility_parking_lot);
                Intrinsics.checkNotNullExpressionValue(string16, "");
                arrayList.add(new zzf(string16));
            }
            Place.BooleanPlaceAttributeValue wheelchairAccessibleSeating = accessibilityOptions.getWheelchairAccessibleSeating();
            Intrinsics.checkNotNullExpressionValue(wheelchairAccessibleSeating, "");
            if (zzc(wheelchairAccessibleSeating)) {
                String string17 = context.getString(R.string.place_details_accessibility_seating);
                Intrinsics.checkNotNullExpressionValue(string17, "");
                arrayList.add(new zzf(string17));
            }
            Place.BooleanPlaceAttributeValue wheelchairAccessibleRestroom = accessibilityOptions.getWheelchairAccessibleRestroom();
            Intrinsics.checkNotNullExpressionValue(wheelchairAccessibleRestroom, "");
            if (zzc(wheelchairAccessibleRestroom)) {
                String string18 = context.getString(R.string.place_details_accessibility_restroom);
                Intrinsics.checkNotNullExpressionValue(string18, "");
                arrayList.add(new zzf(string18));
            }
        }
        if (zzce.zzd(place)) {
            zzb(arrayList);
            String string19 = context.getString(R.string.place_details_about_offerings);
            Intrinsics.checkNotNullExpressionValue(string19, "");
            arrayList.add(new zzh(string19));
            Place.BooleanPlaceAttributeValue servesBeer = place.getServesBeer();
            Intrinsics.checkNotNullExpressionValue(servesBeer, "");
            if (zzc(servesBeer)) {
                String string20 = context.getString(R.string.place_details_offerings_beer);
                Intrinsics.checkNotNullExpressionValue(string20, "");
                arrayList.add(new zzf(string20));
            }
            Place.BooleanPlaceAttributeValue servesWine = place.getServesWine();
            Intrinsics.checkNotNullExpressionValue(servesWine, "");
            if (zzc(servesWine)) {
                String string21 = context.getString(R.string.place_details_offerings_wine);
                Intrinsics.checkNotNullExpressionValue(string21, "");
                arrayList.add(new zzf(string21));
            }
            Place.BooleanPlaceAttributeValue servesCoffee = place.getServesCoffee();
            Intrinsics.checkNotNullExpressionValue(servesCoffee, "");
            if (zzc(servesCoffee)) {
                String string22 = context.getString(R.string.place_details_offerings_coffee);
                Intrinsics.checkNotNullExpressionValue(string22, "");
                arrayList.add(new zzf(string22));
            }
            Place.BooleanPlaceAttributeValue servesCocktails = place.getServesCocktails();
            Intrinsics.checkNotNullExpressionValue(servesCocktails, "");
            if (zzc(servesCocktails)) {
                String string23 = context.getString(R.string.place_details_offerings_cocktails);
                Intrinsics.checkNotNullExpressionValue(string23, "");
                arrayList.add(new zzf(string23));
            }
            Place.BooleanPlaceAttributeValue servesVegetarianFood = place.getServesVegetarianFood();
            Intrinsics.checkNotNullExpressionValue(servesVegetarianFood, "");
            if (zzc(servesVegetarianFood)) {
                String string24 = context.getString(R.string.place_details_offerings_vegetarian_options);
                Intrinsics.checkNotNullExpressionValue(string24, "");
                arrayList.add(new zzf(string24));
            }
        }
        if (zzce.zze(place)) {
            zzb(arrayList);
            String string25 = context.getString(R.string.place_details_about_amenities);
            Intrinsics.checkNotNullExpressionValue(string25, "");
            arrayList.add(new zzh(string25));
            Place.BooleanPlaceAttributeValue restroom = place.getRestroom();
            Intrinsics.checkNotNullExpressionValue(restroom, "");
            if (zzc(restroom)) {
                String string26 = context.getString(R.string.place_details_amenities_restroom);
                Intrinsics.checkNotNullExpressionValue(string26, "");
                arrayList.add(new zzf(string26));
            }
        }
        if (zzce.zzf(place)) {
            zzb(arrayList);
            String string27 = context.getString(R.string.place_details_about_known_for);
            Intrinsics.checkNotNullExpressionValue(string27, "");
            arrayList.add(new zzh(string27));
            Place.BooleanPlaceAttributeValue goodForGroups = place.getGoodForGroups();
            Intrinsics.checkNotNullExpressionValue(goodForGroups, "");
            if (zzc(goodForGroups)) {
                String string28 = context.getString(R.string.place_details_known_for_groups);
                Intrinsics.checkNotNullExpressionValue(string28, "");
                arrayList.add(new zzf(string28));
            }
            Place.BooleanPlaceAttributeValue goodForWatchingSports = place.getGoodForWatchingSports();
            Intrinsics.checkNotNullExpressionValue(goodForWatchingSports, "");
            if (zzc(goodForWatchingSports)) {
                String string29 = context.getString(R.string.place_details_known_for_sports);
                Intrinsics.checkNotNullExpressionValue(string29, "");
                arrayList.add(new zzf(string29));
            }
            Place.BooleanPlaceAttributeValue liveMusic = place.getLiveMusic();
            Intrinsics.checkNotNullExpressionValue(liveMusic, "");
            if (zzc(liveMusic)) {
                String string30 = context.getString(R.string.place_details_known_for_live_music);
                Intrinsics.checkNotNullExpressionValue(string30, "");
                arrayList.add(new zzf(string30));
            }
        }
        PaymentOptions paymentOptions = place.getPaymentOptions();
        if (zzce.zzg(place) && paymentOptions != null) {
            zzb(arrayList);
            String string31 = context.getString(R.string.place_details_about_payments);
            Intrinsics.checkNotNullExpressionValue(string31, "");
            arrayList.add(new zzh(string31));
            Place.BooleanPlaceAttributeValue acceptsCreditCards = paymentOptions.getAcceptsCreditCards();
            Intrinsics.checkNotNullExpressionValue(acceptsCreditCards, "");
            if (zzc(acceptsCreditCards)) {
                String string32 = context.getString(R.string.place_details_payments_credit_cards);
                Intrinsics.checkNotNullExpressionValue(string32, "");
                arrayList.add(new zzf(string32));
            }
            Place.BooleanPlaceAttributeValue acceptsDebitCards = paymentOptions.getAcceptsDebitCards();
            Intrinsics.checkNotNullExpressionValue(acceptsDebitCards, "");
            if (zzc(acceptsDebitCards)) {
                String string33 = context.getString(R.string.place_details_payments_debit_cards);
                Intrinsics.checkNotNullExpressionValue(string33, "");
                arrayList.add(new zzf(string33));
            }
            Place.BooleanPlaceAttributeValue acceptsNfc = paymentOptions.getAcceptsNfc();
            Intrinsics.checkNotNullExpressionValue(acceptsNfc, "");
            if (zzc(acceptsNfc)) {
                String string34 = context.getString(R.string.place_details_payments_nfc);
                Intrinsics.checkNotNullExpressionValue(string34, "");
                arrayList.add(new zzf(string34));
            }
            Place.BooleanPlaceAttributeValue acceptsCashOnly = paymentOptions.getAcceptsCashOnly();
            Intrinsics.checkNotNullExpressionValue(acceptsCashOnly, "");
            if (zzc(acceptsCashOnly)) {
                String string35 = context.getString(R.string.place_details_payments_cash_only);
                Intrinsics.checkNotNullExpressionValue(string35, "");
                arrayList.add(new zzf(string35));
            }
        }
        if (zzce.zzh(place)) {
            zzb(arrayList);
            String string36 = context.getString(R.string.place_details_about_children);
            Intrinsics.checkNotNullExpressionValue(string36, "");
            arrayList.add(new zzh(string36));
            Place.BooleanPlaceAttributeValue goodForChildren = place.getGoodForChildren();
            Intrinsics.checkNotNullExpressionValue(goodForChildren, "");
            if (zzc(goodForChildren)) {
                String string37 = context.getString(R.string.place_details_children_good_for_kids);
                Intrinsics.checkNotNullExpressionValue(string37, "");
                arrayList.add(new zzf(string37));
            }
            Place.BooleanPlaceAttributeValue menuForChildren = place.getMenuForChildren();
            Intrinsics.checkNotNullExpressionValue(menuForChildren, "");
            if (zzc(menuForChildren)) {
                String string38 = context.getString(R.string.place_details_children_kids_menu);
                Intrinsics.checkNotNullExpressionValue(string38, "");
                arrayList.add(new zzf(string38));
            }
        }
        if (zzce.zzi(place)) {
            zzb(arrayList);
            String string39 = context.getString(R.string.place_details_about_pets);
            Intrinsics.checkNotNullExpressionValue(string39, "");
            arrayList.add(new zzh(string39));
            Place.BooleanPlaceAttributeValue allowsDogs = place.getAllowsDogs();
            Intrinsics.checkNotNullExpressionValue(allowsDogs, "");
            if (zzc(allowsDogs)) {
                String string40 = context.getString(R.string.place_details_pets_dogs);
                Intrinsics.checkNotNullExpressionValue(string40, "");
                arrayList.add(new zzf(string40));
            }
        }
        ParkingOptions parkingOptions = place.getParkingOptions();
        if (zzce.zzj(place) && parkingOptions != null) {
            zzb(arrayList);
            String string41 = context.getString(R.string.place_details_about_parking);
            Intrinsics.checkNotNullExpressionValue(string41, "");
            arrayList.add(new zzh(string41));
            Place.BooleanPlaceAttributeValue freeParkingLot = parkingOptions.getFreeParkingLot();
            Intrinsics.checkNotNullExpressionValue(freeParkingLot, "");
            if (zzc(freeParkingLot)) {
                String string42 = context.getString(R.string.place_details_parking_free_parking_lot);
                Intrinsics.checkNotNullExpressionValue(string42, "");
                arrayList.add(new zzf(string42));
            }
            Place.BooleanPlaceAttributeValue paidParkingLot = parkingOptions.getPaidParkingLot();
            Intrinsics.checkNotNullExpressionValue(paidParkingLot, "");
            if (zzc(paidParkingLot)) {
                String string43 = context.getString(R.string.place_details_parking_paid_parking_lot);
                Intrinsics.checkNotNullExpressionValue(string43, "");
                arrayList.add(new zzf(string43));
            }
            Place.BooleanPlaceAttributeValue freeStreetParking = parkingOptions.getFreeStreetParking();
            Intrinsics.checkNotNullExpressionValue(freeStreetParking, "");
            if (zzc(freeStreetParking)) {
                String string44 = context.getString(R.string.place_details_parking_free_street_parking);
                Intrinsics.checkNotNullExpressionValue(string44, "");
                arrayList.add(new zzf(string44));
            }
            Place.BooleanPlaceAttributeValue paidStreetParking = parkingOptions.getPaidStreetParking();
            Intrinsics.checkNotNullExpressionValue(paidStreetParking, "");
            if (zzc(paidStreetParking)) {
                String string45 = context.getString(R.string.place_details_parking_paid_street_parking);
                Intrinsics.checkNotNullExpressionValue(string45, "");
                arrayList.add(new zzf(string45));
            }
            Place.BooleanPlaceAttributeValue valetParking = parkingOptions.getValetParking();
            Intrinsics.checkNotNullExpressionValue(valetParking, "");
            if (zzc(valetParking)) {
                String string46 = context.getString(R.string.place_details_parking_valet);
                Intrinsics.checkNotNullExpressionValue(string46, "");
                arrayList.add(new zzf(string46));
            }
            Place.BooleanPlaceAttributeValue freeGarageParking = parkingOptions.getFreeGarageParking();
            Intrinsics.checkNotNullExpressionValue(freeGarageParking, "");
            if (zzc(freeGarageParking)) {
                String string47 = context.getString(R.string.place_details_parking_free_garage_parking);
                Intrinsics.checkNotNullExpressionValue(string47, "");
                arrayList.add(new zzf(string47));
            }
            Place.BooleanPlaceAttributeValue paidGarageParking = parkingOptions.getPaidGarageParking();
            Intrinsics.checkNotNullExpressionValue(paidGarageParking, "");
            if (zzc(paidGarageParking)) {
                String string48 = context.getString(R.string.place_details_parking_paid_garage_parking);
                Intrinsics.checkNotNullExpressionValue(string48, "");
                arrayList.add(new zzf(string48));
            }
        }
        return arrayList;
    }

    private static final void zzb(List list) {
        if (list.isEmpty()) {
            return;
        }
        list.add(zzg.zza);
    }

    private static final boolean zzc(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        return booleanPlaceAttributeValue == Place.BooleanPlaceAttributeValue.TRUE;
    }
}
