package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.places.api.model.AccessibilityOptions;
import com.google.android.libraries.places.api.model.ConnectorAggregation;
import com.google.android.libraries.places.api.model.EVChargeOptions;
import com.google.android.libraries.places.api.model.FuelOptions;
import com.google.android.libraries.places.api.model.FuelPrice;
import com.google.android.libraries.places.api.model.ParkingOptions;
import com.google.android.libraries.places.api.model.PaymentOptions;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlusCode;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class zzce {
    public static final boolean zza(Place place) {
        Intrinsics.checkNotNullParameter(place, "");
        Place.BooleanPlaceAttributeValue dineIn = place.getDineIn();
        Intrinsics.checkNotNullExpressionValue(dineIn, "");
        if (zzm(dineIn)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue outdoorSeating = place.getOutdoorSeating();
        Intrinsics.checkNotNullExpressionValue(outdoorSeating, "");
        if (zzm(outdoorSeating)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue reservable = place.getReservable();
        Intrinsics.checkNotNullExpressionValue(reservable, "");
        if (zzm(reservable)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue takeout = place.getTakeout();
        Intrinsics.checkNotNullExpressionValue(takeout, "");
        if (zzm(takeout)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue delivery = place.getDelivery();
        Intrinsics.checkNotNullExpressionValue(delivery, "");
        if (zzm(delivery)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue curbsidePickup = place.getCurbsidePickup();
        Intrinsics.checkNotNullExpressionValue(curbsidePickup, "");
        return zzm(curbsidePickup);
    }

    public static final boolean zzb(Place place) {
        Intrinsics.checkNotNullParameter(place, "");
        Place.BooleanPlaceAttributeValue servesBreakfast = place.getServesBreakfast();
        Intrinsics.checkNotNullExpressionValue(servesBreakfast, "");
        if (zzm(servesBreakfast)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue servesLunch = place.getServesLunch();
        Intrinsics.checkNotNullExpressionValue(servesLunch, "");
        if (zzm(servesLunch)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue servesBrunch = place.getServesBrunch();
        Intrinsics.checkNotNullExpressionValue(servesBrunch, "");
        if (zzm(servesBrunch)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue servesDinner = place.getServesDinner();
        Intrinsics.checkNotNullExpressionValue(servesDinner, "");
        if (zzm(servesDinner)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue servesDessert = place.getServesDessert();
        Intrinsics.checkNotNullExpressionValue(servesDessert, "");
        return zzm(servesDessert);
    }

    public static final boolean zzc(Place place) {
        Intrinsics.checkNotNullParameter(place, "");
        AccessibilityOptions accessibilityOptions = place.getAccessibilityOptions();
        if (accessibilityOptions == null) {
            return false;
        }
        Place.BooleanPlaceAttributeValue wheelchairAccessibleEntrance = accessibilityOptions.getWheelchairAccessibleEntrance();
        Intrinsics.checkNotNullExpressionValue(wheelchairAccessibleEntrance, "");
        if (!zzm(wheelchairAccessibleEntrance)) {
            Place.BooleanPlaceAttributeValue wheelchairAccessibleParking = accessibilityOptions.getWheelchairAccessibleParking();
            Intrinsics.checkNotNullExpressionValue(wheelchairAccessibleParking, "");
            if (!zzm(wheelchairAccessibleParking)) {
                Place.BooleanPlaceAttributeValue wheelchairAccessibleSeating = accessibilityOptions.getWheelchairAccessibleSeating();
                Intrinsics.checkNotNullExpressionValue(wheelchairAccessibleSeating, "");
                if (!zzm(wheelchairAccessibleSeating)) {
                    Place.BooleanPlaceAttributeValue wheelchairAccessibleRestroom = accessibilityOptions.getWheelchairAccessibleRestroom();
                    Intrinsics.checkNotNullExpressionValue(wheelchairAccessibleRestroom, "");
                    return zzm(wheelchairAccessibleRestroom);
                }
            }
        }
        return true;
    }

    public static final boolean zzd(Place place) {
        Intrinsics.checkNotNullParameter(place, "");
        Place.BooleanPlaceAttributeValue servesBeer = place.getServesBeer();
        Intrinsics.checkNotNullExpressionValue(servesBeer, "");
        if (zzm(servesBeer)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue servesWine = place.getServesWine();
        Intrinsics.checkNotNullExpressionValue(servesWine, "");
        if (zzm(servesWine)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue servesCoffee = place.getServesCoffee();
        Intrinsics.checkNotNullExpressionValue(servesCoffee, "");
        if (zzm(servesCoffee)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue servesCocktails = place.getServesCocktails();
        Intrinsics.checkNotNullExpressionValue(servesCocktails, "");
        if (zzm(servesCocktails)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue servesVegetarianFood = place.getServesVegetarianFood();
        Intrinsics.checkNotNullExpressionValue(servesVegetarianFood, "");
        return zzm(servesVegetarianFood);
    }

    public static final boolean zze(Place place) {
        Intrinsics.checkNotNullParameter(place, "");
        Place.BooleanPlaceAttributeValue restroom = place.getRestroom();
        Intrinsics.checkNotNullExpressionValue(restroom, "");
        return zzm(restroom);
    }

    public static final boolean zzf(Place place) {
        Intrinsics.checkNotNullParameter(place, "");
        Place.BooleanPlaceAttributeValue goodForGroups = place.getGoodForGroups();
        Intrinsics.checkNotNullExpressionValue(goodForGroups, "");
        if (zzm(goodForGroups)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue goodForWatchingSports = place.getGoodForWatchingSports();
        Intrinsics.checkNotNullExpressionValue(goodForWatchingSports, "");
        if (zzm(goodForWatchingSports)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue liveMusic = place.getLiveMusic();
        Intrinsics.checkNotNullExpressionValue(liveMusic, "");
        return zzm(liveMusic);
    }

    public static final boolean zzg(Place place) {
        Intrinsics.checkNotNullParameter(place, "");
        PaymentOptions paymentOptions = place.getPaymentOptions();
        if (paymentOptions == null) {
            return false;
        }
        Place.BooleanPlaceAttributeValue acceptsCreditCards = paymentOptions.getAcceptsCreditCards();
        Intrinsics.checkNotNullExpressionValue(acceptsCreditCards, "");
        if (!zzm(acceptsCreditCards)) {
            Place.BooleanPlaceAttributeValue acceptsCashOnly = paymentOptions.getAcceptsCashOnly();
            Intrinsics.checkNotNullExpressionValue(acceptsCashOnly, "");
            if (!zzm(acceptsCashOnly)) {
                Place.BooleanPlaceAttributeValue acceptsDebitCards = paymentOptions.getAcceptsDebitCards();
                Intrinsics.checkNotNullExpressionValue(acceptsDebitCards, "");
                if (!zzm(acceptsDebitCards)) {
                    Place.BooleanPlaceAttributeValue acceptsNfc = paymentOptions.getAcceptsNfc();
                    Intrinsics.checkNotNullExpressionValue(acceptsNfc, "");
                    return zzm(acceptsNfc);
                }
            }
        }
        return true;
    }

    public static final boolean zzh(Place place) {
        Intrinsics.checkNotNullParameter(place, "");
        Place.BooleanPlaceAttributeValue goodForChildren = place.getGoodForChildren();
        Intrinsics.checkNotNullExpressionValue(goodForChildren, "");
        if (zzm(goodForChildren)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue menuForChildren = place.getMenuForChildren();
        Intrinsics.checkNotNullExpressionValue(menuForChildren, "");
        return zzm(menuForChildren);
    }

    public static final boolean zzi(Place place) {
        Intrinsics.checkNotNullParameter(place, "");
        Place.BooleanPlaceAttributeValue allowsDogs = place.getAllowsDogs();
        Intrinsics.checkNotNullExpressionValue(allowsDogs, "");
        return zzm(allowsDogs);
    }

    public static final boolean zzj(Place place) {
        Intrinsics.checkNotNullParameter(place, "");
        ParkingOptions parkingOptions = place.getParkingOptions();
        if (parkingOptions == null) {
            return false;
        }
        Place.BooleanPlaceAttributeValue freeParkingLot = parkingOptions.getFreeParkingLot();
        Intrinsics.checkNotNullExpressionValue(freeParkingLot, "");
        if (!zzm(freeParkingLot)) {
            Place.BooleanPlaceAttributeValue paidParkingLot = parkingOptions.getPaidParkingLot();
            Intrinsics.checkNotNullExpressionValue(paidParkingLot, "");
            if (!zzm(paidParkingLot)) {
                Place.BooleanPlaceAttributeValue freeStreetParking = parkingOptions.getFreeStreetParking();
                Intrinsics.checkNotNullExpressionValue(freeStreetParking, "");
                if (!zzm(freeStreetParking)) {
                    Place.BooleanPlaceAttributeValue paidStreetParking = parkingOptions.getPaidStreetParking();
                    Intrinsics.checkNotNullExpressionValue(paidStreetParking, "");
                    if (!zzm(paidStreetParking)) {
                        Place.BooleanPlaceAttributeValue valetParking = parkingOptions.getValetParking();
                        Intrinsics.checkNotNullExpressionValue(valetParking, "");
                        if (!zzm(valetParking)) {
                            Place.BooleanPlaceAttributeValue freeGarageParking = parkingOptions.getFreeGarageParking();
                            Intrinsics.checkNotNullExpressionValue(freeGarageParking, "");
                            if (!zzm(freeGarageParking)) {
                                Place.BooleanPlaceAttributeValue paidGarageParking = parkingOptions.getPaidGarageParking();
                                Intrinsics.checkNotNullExpressionValue(paidGarageParking, "");
                                return zzm(paidGarageParking);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static final boolean zzk(Place place, Context context, boolean z) {
        ArrayList arrayList;
        String formattedAddress;
        String internationalPhoneNumber;
        String strZzc;
        List<FuelPrice> fuelPrices;
        Intrinsics.checkNotNullParameter(place, "");
        Intrinsics.checkNotNullParameter(context, "");
        EVChargeOptions evChargeOptions = place.getEvChargeOptions();
        List<ConnectorAggregation> connectorAggregations = evChargeOptions != null ? evChargeOptions.getConnectorAggregations() : null;
        boolean z2 = (connectorAggregations == null || connectorAggregations.isEmpty()) ? false : true;
        FuelOptions fuelOptions = place.getFuelOptions();
        if (fuelOptions == null || (fuelPrices = fuelOptions.getFuelPrices()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : fuelPrices) {
                FuelPrice.FuelType type = ((FuelPrice) obj).getType();
                Intrinsics.checkNotNullExpressionValue(type, "");
                if (zzx.zza(type)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        boolean z3 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        boolean z4 = (!z || (strZzc = zzad.zzc(place, context)) == null || StringsKt.isBlank(strZzc)) ? false : true;
        if (z2 || z3 || !(((formattedAddress = place.getFormattedAddress()) == null || StringsKt.isBlank(formattedAddress)) && !z4 && (((internationalPhoneNumber = place.getInternationalPhoneNumber()) == null || StringsKt.isBlank(internationalPhoneNumber)) && zzl(place.getWebsiteUri())))) {
            return true;
        }
        PlusCode plusCode = place.getPlusCode();
        String compoundCode = plusCode != null ? plusCode.getCompoundCode() : null;
        return (compoundCode == null || StringsKt.isBlank(compoundCode)) ? false : true;
    }

    private static final boolean zzl(Uri uri) {
        if (uri == null) {
            return true;
        }
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return StringsKt.isBlank(string);
    }

    private static final boolean zzm(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        return booleanPlaceAttributeValue == Place.BooleanPlaceAttributeValue.TRUE;
    }
}
