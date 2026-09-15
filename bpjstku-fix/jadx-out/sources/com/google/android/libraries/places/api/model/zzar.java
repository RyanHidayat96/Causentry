package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzar extends Place {
    private final String zzA;
    private final String zzB;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final PlusCode zzF;
    private final Integer zzG;
    private final zzey zzH;
    private final String zzI;
    private final String zzJ;
    private final String zzK;
    private final Double zzL;
    private final Place.BooleanPlaceAttributeValue zzM;
    private final List zzN;
    private final List zzO;
    private final Place.BooleanPlaceAttributeValue zzP;
    private final Place.BooleanPlaceAttributeValue zzQ;
    private final Place.BooleanPlaceAttributeValue zzR;
    private final Place.BooleanPlaceAttributeValue zzS;
    private final Place.BooleanPlaceAttributeValue zzT;
    private final Place.BooleanPlaceAttributeValue zzU;
    private final Place.BooleanPlaceAttributeValue zzV;
    private final Place.BooleanPlaceAttributeValue zzW;
    private final List zzX;
    private final Integer zzY;
    private final Integer zzZ;
    private final String zza;
    private final Integer zzaa;
    private final LatLngBounds zzab;
    private final Uri zzac;
    private final Uri zzad;
    private final Place.BooleanPlaceAttributeValue zzae;
    private final AccessibilityOptions zzaf;
    private final ParkingOptions zzag;
    private final PaymentOptions zzah;
    private final EVChargeOptions zzai;
    private final Place.BooleanPlaceAttributeValue zzaj;
    private final Place.BooleanPlaceAttributeValue zzak;
    private final Place.BooleanPlaceAttributeValue zzal;
    private final Place.BooleanPlaceAttributeValue zzam;
    private final Place.BooleanPlaceAttributeValue zzan;
    private final Place.BooleanPlaceAttributeValue zzao;
    private final Place.BooleanPlaceAttributeValue zzap;
    private final Place.BooleanPlaceAttributeValue zzaq;
    private final Place.BooleanPlaceAttributeValue zzar;
    private final Place.BooleanPlaceAttributeValue zzas;
    private final Place.BooleanPlaceAttributeValue zzat;
    private final List zzau;
    private final FuelOptions zzav;
    private final Place.BooleanPlaceAttributeValue zzaw;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final AddressComponents zze;
    private final List zzf;
    private final Place.BusinessStatus zzg;
    private final Place.BooleanPlaceAttributeValue zzh;
    private final OpeningHours zzi;
    private final Place.BooleanPlaceAttributeValue zzj;
    private final Place.BooleanPlaceAttributeValue zzk;
    private final String zzl;
    private final String zzm;
    private final Integer zzn;
    private final String zzo;
    private final String zzp;
    private final String zzq;
    private final LatLng zzr;
    private final LatLng zzs;
    private final String zzt;
    private final String zzu;
    private final String zzv;
    private final String zzw;
    private final String zzx;
    private final OpeningHours zzy;
    private final String zzz;

    zzar(String str, String str2, String str3, String str4, AddressComponents addressComponents, List list, Place.BusinessStatus businessStatus, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, OpeningHours openingHours, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, String str5, String str6, Integer num, String str7, String str8, String str9, LatLng latLng, LatLng latLng2, String str10, String str11, String str12, String str13, String str14, OpeningHours openingHours2, String str15, String str16, String str17, List list2, List list3, List list4, PlusCode plusCode, Integer num2, zzey zzeyVar, String str18, String str19, String str20, Double d, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4, List list5, List list6, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue8, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue9, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue10, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue11, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue12, List list7, Integer num3, Integer num4, Integer num5, LatLngBounds latLngBounds, Uri uri, Uri uri2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue13, AccessibilityOptions accessibilityOptions, ParkingOptions parkingOptions, PaymentOptions paymentOptions, EVChargeOptions eVChargeOptions, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue14, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue15, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue16, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue17, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue18, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue19, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue20, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue21, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue22, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue23, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue24, List list8, FuelOptions fuelOptions, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue25) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = addressComponents;
        this.zzf = list;
        this.zzg = businessStatus;
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null curbsidePickup");
        }
        this.zzh = booleanPlaceAttributeValue;
        this.zzi = openingHours;
        if (booleanPlaceAttributeValue2 == null) {
            throw new NullPointerException("Null delivery");
        }
        this.zzj = booleanPlaceAttributeValue2;
        if (booleanPlaceAttributeValue3 == null) {
            throw new NullPointerException("Null dineIn");
        }
        this.zzk = booleanPlaceAttributeValue3;
        this.zzl = str5;
        this.zzm = str6;
        this.zzn = num;
        this.zzo = str7;
        this.zzp = str8;
        this.zzq = str9;
        this.zzr = latLng;
        this.zzs = latLng2;
        this.zzt = str10;
        this.zzu = str11;
        this.zzv = str12;
        this.zzw = str13;
        this.zzx = str14;
        this.zzy = openingHours2;
        this.zzz = str15;
        this.zzA = str16;
        this.zzB = str17;
        this.zzC = list2;
        this.zzD = list3;
        this.zzE = list4;
        this.zzF = plusCode;
        this.zzG = num2;
        this.zzH = zzeyVar;
        this.zzI = str18;
        this.zzJ = str19;
        this.zzK = str20;
        this.zzL = d;
        if (booleanPlaceAttributeValue4 == null) {
            throw new NullPointerException("Null reservable");
        }
        this.zzM = booleanPlaceAttributeValue4;
        this.zzN = list5;
        this.zzO = list6;
        if (booleanPlaceAttributeValue5 == null) {
            throw new NullPointerException("Null servesBeer");
        }
        this.zzP = booleanPlaceAttributeValue5;
        if (booleanPlaceAttributeValue6 == null) {
            throw new NullPointerException("Null servesBreakfast");
        }
        this.zzQ = booleanPlaceAttributeValue6;
        if (booleanPlaceAttributeValue7 == null) {
            throw new NullPointerException("Null servesBrunch");
        }
        this.zzR = booleanPlaceAttributeValue7;
        if (booleanPlaceAttributeValue8 == null) {
            throw new NullPointerException("Null servesDinner");
        }
        this.zzS = booleanPlaceAttributeValue8;
        if (booleanPlaceAttributeValue9 == null) {
            throw new NullPointerException("Null servesLunch");
        }
        this.zzT = booleanPlaceAttributeValue9;
        if (booleanPlaceAttributeValue10 == null) {
            throw new NullPointerException("Null servesVegetarianFood");
        }
        this.zzU = booleanPlaceAttributeValue10;
        if (booleanPlaceAttributeValue11 == null) {
            throw new NullPointerException("Null servesWine");
        }
        this.zzV = booleanPlaceAttributeValue11;
        if (booleanPlaceAttributeValue12 == null) {
            throw new NullPointerException("Null takeout");
        }
        this.zzW = booleanPlaceAttributeValue12;
        this.zzX = list7;
        this.zzY = num3;
        this.zzZ = num4;
        this.zzaa = num5;
        this.zzab = latLngBounds;
        this.zzac = uri;
        this.zzad = uri2;
        if (booleanPlaceAttributeValue13 == null) {
            throw new NullPointerException("Null wheelchairAccessibleEntrance");
        }
        this.zzae = booleanPlaceAttributeValue13;
        this.zzaf = accessibilityOptions;
        this.zzag = parkingOptions;
        this.zzah = paymentOptions;
        this.zzai = eVChargeOptions;
        if (booleanPlaceAttributeValue14 == null) {
            throw new NullPointerException("Null outdoorSeating");
        }
        this.zzaj = booleanPlaceAttributeValue14;
        if (booleanPlaceAttributeValue15 == null) {
            throw new NullPointerException("Null liveMusic");
        }
        this.zzak = booleanPlaceAttributeValue15;
        if (booleanPlaceAttributeValue16 == null) {
            throw new NullPointerException("Null menuForChildren");
        }
        this.zzal = booleanPlaceAttributeValue16;
        if (booleanPlaceAttributeValue17 == null) {
            throw new NullPointerException("Null servesCocktails");
        }
        this.zzam = booleanPlaceAttributeValue17;
        if (booleanPlaceAttributeValue18 == null) {
            throw new NullPointerException("Null servesDessert");
        }
        this.zzan = booleanPlaceAttributeValue18;
        if (booleanPlaceAttributeValue19 == null) {
            throw new NullPointerException("Null servesCoffee");
        }
        this.zzao = booleanPlaceAttributeValue19;
        if (booleanPlaceAttributeValue20 == null) {
            throw new NullPointerException("Null goodForChildren");
        }
        this.zzap = booleanPlaceAttributeValue20;
        if (booleanPlaceAttributeValue21 == null) {
            throw new NullPointerException("Null allowsDogs");
        }
        this.zzaq = booleanPlaceAttributeValue21;
        if (booleanPlaceAttributeValue22 == null) {
            throw new NullPointerException("Null restroom");
        }
        this.zzar = booleanPlaceAttributeValue22;
        if (booleanPlaceAttributeValue23 == null) {
            throw new NullPointerException("Null goodForGroups");
        }
        this.zzas = booleanPlaceAttributeValue23;
        if (booleanPlaceAttributeValue24 == null) {
            throw new NullPointerException("Null goodForWatchingSports");
        }
        this.zzat = booleanPlaceAttributeValue24;
        this.zzau = list8;
        this.zzav = fuelOptions;
        if (booleanPlaceAttributeValue25 == null) {
            throw new NullPointerException("Null pureServiceAreaBusiness");
        }
        this.zzaw = booleanPlaceAttributeValue25;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Place)) {
            return false;
        }
        Place place = (Place) obj;
        String str = this.zza;
        if (str == null) {
            if (place.getAddress() != null) {
                return false;
            }
        } else if (!str.equals(place.getAddress())) {
            return false;
        }
        String str2 = this.zzb;
        if (str2 == null) {
            if (place.getFormattedAddress() != null) {
                return false;
            }
        } else if (!str2.equals(place.getFormattedAddress())) {
            return false;
        }
        String str3 = this.zzc;
        if (str3 == null) {
            if (place.getShortFormattedAddress() != null) {
                return false;
            }
        } else if (!str3.equals(place.getShortFormattedAddress())) {
            return false;
        }
        String str4 = this.zzd;
        if (str4 == null) {
            if (place.getAdrFormatAddress() != null) {
                return false;
            }
        } else if (!str4.equals(place.getAdrFormatAddress())) {
            return false;
        }
        AddressComponents addressComponents = this.zze;
        if (addressComponents == null) {
            if (place.getAddressComponents() != null) {
                return false;
            }
        } else if (!addressComponents.equals(place.getAddressComponents())) {
            return false;
        }
        List list = this.zzf;
        if (list == null) {
            if (place.getAttributions() != null) {
                return false;
            }
        } else if (!list.equals(place.getAttributions())) {
            return false;
        }
        Place.BusinessStatus businessStatus = this.zzg;
        if (businessStatus == null) {
            if (place.getBusinessStatus() != null) {
                return false;
            }
        } else if (!businessStatus.equals(place.getBusinessStatus())) {
            return false;
        }
        if (!this.zzh.equals(place.getCurbsidePickup())) {
            return false;
        }
        OpeningHours openingHours = this.zzi;
        if (openingHours == null) {
            if (place.getCurrentOpeningHours() != null) {
                return false;
            }
        } else if (!openingHours.equals(place.getCurrentOpeningHours())) {
            return false;
        }
        if (!this.zzj.equals(place.getDelivery()) || !this.zzk.equals(place.getDineIn())) {
            return false;
        }
        String str5 = this.zzl;
        if (str5 == null) {
            if (place.getEditorialSummary() != null) {
                return false;
            }
        } else if (!str5.equals(place.getEditorialSummary())) {
            return false;
        }
        String str6 = this.zzm;
        if (str6 == null) {
            if (place.getEditorialSummaryLanguageCode() != null) {
                return false;
            }
        } else if (!str6.equals(place.getEditorialSummaryLanguageCode())) {
            return false;
        }
        Integer num = this.zzn;
        if (num == null) {
            if (place.getIconBackgroundColor() != null) {
                return false;
            }
        } else if (!num.equals(place.getIconBackgroundColor())) {
            return false;
        }
        String str7 = this.zzo;
        if (str7 == null) {
            if (place.getIconUrl() != null) {
                return false;
            }
        } else if (!str7.equals(place.getIconUrl())) {
            return false;
        }
        String str8 = this.zzp;
        if (str8 == null) {
            if (place.getIconMaskUrl() != null) {
                return false;
            }
        } else if (!str8.equals(place.getIconMaskUrl())) {
            return false;
        }
        String str9 = this.zzq;
        if (str9 == null) {
            if (place.getId() != null) {
                return false;
            }
        } else if (!str9.equals(place.getId())) {
            return false;
        }
        LatLng latLng = this.zzr;
        if (latLng == null) {
            if (place.getLatLng() != null) {
                return false;
            }
        } else if (!latLng.equals(place.getLatLng())) {
            return false;
        }
        LatLng latLng2 = this.zzs;
        if (latLng2 == null) {
            if (place.getLocation() != null) {
                return false;
            }
        } else if (!latLng2.equals(place.getLocation())) {
            return false;
        }
        String str10 = this.zzt;
        if (str10 == null) {
            if (place.getName() != null) {
                return false;
            }
        } else if (!str10.equals(place.getName())) {
            return false;
        }
        String str11 = this.zzu;
        if (str11 == null) {
            if (place.getDisplayName() != null) {
                return false;
            }
        } else if (!str11.equals(place.getDisplayName())) {
            return false;
        }
        String str12 = this.zzv;
        if (str12 == null) {
            if (place.getNameLanguageCode() != null) {
                return false;
            }
        } else if (!str12.equals(place.getNameLanguageCode())) {
            return false;
        }
        String str13 = this.zzw;
        if (str13 == null) {
            if (place.getDisplayNameLanguageCode() != null) {
                return false;
            }
        } else if (!str13.equals(place.getDisplayNameLanguageCode())) {
            return false;
        }
        String str14 = this.zzx;
        if (str14 == null) {
            if (place.getResourceName() != null) {
                return false;
            }
        } else if (!str14.equals(place.getResourceName())) {
            return false;
        }
        OpeningHours openingHours2 = this.zzy;
        if (openingHours2 == null) {
            if (place.getOpeningHours() != null) {
                return false;
            }
        } else if (!openingHours2.equals(place.getOpeningHours())) {
            return false;
        }
        String str15 = this.zzz;
        if (str15 == null) {
            if (place.getPhoneNumber() != null) {
                return false;
            }
        } else if (!str15.equals(place.getPhoneNumber())) {
            return false;
        }
        String str16 = this.zzA;
        if (str16 == null) {
            if (place.getInternationalPhoneNumber() != null) {
                return false;
            }
        } else if (!str16.equals(place.getInternationalPhoneNumber())) {
            return false;
        }
        String str17 = this.zzB;
        if (str17 == null) {
            if (place.getNationalPhoneNumber() != null) {
                return false;
            }
        } else if (!str17.equals(place.getNationalPhoneNumber())) {
            return false;
        }
        List list2 = this.zzC;
        if (list2 == null) {
            if (place.getPhotoMetadatas() != null) {
                return false;
            }
        } else if (!list2.equals(place.getPhotoMetadatas())) {
            return false;
        }
        List list3 = this.zzD;
        if (list3 == null) {
            if (place.getReviews() != null) {
                return false;
            }
        } else if (!list3.equals(place.getReviews())) {
            return false;
        }
        List list4 = this.zzE;
        if (list4 == null) {
            if (place.getPlaceTypes() != null) {
                return false;
            }
        } else if (!list4.equals(place.getPlaceTypes())) {
            return false;
        }
        PlusCode plusCode = this.zzF;
        if (plusCode == null) {
            if (place.getPlusCode() != null) {
                return false;
            }
        } else if (!plusCode.equals(place.getPlusCode())) {
            return false;
        }
        Integer num2 = this.zzG;
        if (num2 == null) {
            if (place.getPriceLevel() != null) {
                return false;
            }
        } else if (!num2.equals(place.getPriceLevel())) {
            return false;
        }
        zzey zzeyVar = this.zzH;
        if (zzeyVar == null) {
            if (place.zza() != null) {
                return false;
            }
        } else if (!zzeyVar.equals(place.zza())) {
            return false;
        }
        String str18 = this.zzI;
        if (str18 == null) {
            if (place.getPrimaryType() != null) {
                return false;
            }
        } else if (!str18.equals(place.getPrimaryType())) {
            return false;
        }
        String str19 = this.zzJ;
        if (str19 == null) {
            if (place.getPrimaryTypeDisplayName() != null) {
                return false;
            }
        } else if (!str19.equals(place.getPrimaryTypeDisplayName())) {
            return false;
        }
        String str20 = this.zzK;
        if (str20 == null) {
            if (place.getPrimaryTypeDisplayNameLanguageCode() != null) {
                return false;
            }
        } else if (!str20.equals(place.getPrimaryTypeDisplayNameLanguageCode())) {
            return false;
        }
        Double d = this.zzL;
        if (d == null) {
            if (place.getRating() != null) {
                return false;
            }
        } else if (!d.equals(place.getRating())) {
            return false;
        }
        if (!this.zzM.equals(place.getReservable())) {
            return false;
        }
        List list5 = this.zzN;
        if (list5 == null) {
            if (place.getSecondaryOpeningHours() != null) {
                return false;
            }
        } else if (!list5.equals(place.getSecondaryOpeningHours())) {
            return false;
        }
        List list6 = this.zzO;
        if (list6 == null) {
            if (place.getCurrentSecondaryOpeningHours() != null) {
                return false;
            }
        } else if (!list6.equals(place.getCurrentSecondaryOpeningHours())) {
            return false;
        }
        if (!this.zzP.equals(place.getServesBeer()) || !this.zzQ.equals(place.getServesBreakfast()) || !this.zzR.equals(place.getServesBrunch()) || !this.zzS.equals(place.getServesDinner()) || !this.zzT.equals(place.getServesLunch()) || !this.zzU.equals(place.getServesVegetarianFood()) || !this.zzV.equals(place.getServesWine()) || !this.zzW.equals(place.getTakeout())) {
            return false;
        }
        List list7 = this.zzX;
        if (list7 == null) {
            if (place.getTypes() != null) {
                return false;
            }
        } else if (!list7.equals(place.getTypes())) {
            return false;
        }
        Integer num3 = this.zzY;
        if (num3 == null) {
            if (place.getUserRatingsTotal() != null) {
                return false;
            }
        } else if (!num3.equals(place.getUserRatingsTotal())) {
            return false;
        }
        Integer num4 = this.zzZ;
        if (num4 == null) {
            if (place.getUserRatingCount() != null) {
                return false;
            }
        } else if (!num4.equals(place.getUserRatingCount())) {
            return false;
        }
        Integer num5 = this.zzaa;
        if (num5 == null) {
            if (place.getUtcOffsetMinutes() != null) {
                return false;
            }
        } else if (!num5.equals(place.getUtcOffsetMinutes())) {
            return false;
        }
        LatLngBounds latLngBounds = this.zzab;
        if (latLngBounds == null) {
            if (place.getViewport() != null) {
                return false;
            }
        } else if (!latLngBounds.equals(place.getViewport())) {
            return false;
        }
        Uri uri = this.zzac;
        if (uri == null) {
            if (place.getWebsiteUri() != null) {
                return false;
            }
        } else if (!uri.equals(place.getWebsiteUri())) {
            return false;
        }
        Uri uri2 = this.zzad;
        if (uri2 == null) {
            if (place.getGoogleMapsUri() != null) {
                return false;
            }
        } else if (!uri2.equals(place.getGoogleMapsUri())) {
            return false;
        }
        if (!this.zzae.equals(place.getWheelchairAccessibleEntrance())) {
            return false;
        }
        AccessibilityOptions accessibilityOptions = this.zzaf;
        if (accessibilityOptions == null) {
            if (place.getAccessibilityOptions() != null) {
                return false;
            }
        } else if (!accessibilityOptions.equals(place.getAccessibilityOptions())) {
            return false;
        }
        ParkingOptions parkingOptions = this.zzag;
        if (parkingOptions == null) {
            if (place.getParkingOptions() != null) {
                return false;
            }
        } else if (!parkingOptions.equals(place.getParkingOptions())) {
            return false;
        }
        PaymentOptions paymentOptions = this.zzah;
        if (paymentOptions == null) {
            if (place.getPaymentOptions() != null) {
                return false;
            }
        } else if (!paymentOptions.equals(place.getPaymentOptions())) {
            return false;
        }
        EVChargeOptions eVChargeOptions = this.zzai;
        if (eVChargeOptions == null) {
            if (place.getEvChargeOptions() != null) {
                return false;
            }
        } else if (!eVChargeOptions.equals(place.getEvChargeOptions())) {
            return false;
        }
        if (!this.zzaj.equals(place.getOutdoorSeating()) || !this.zzak.equals(place.getLiveMusic()) || !this.zzal.equals(place.getMenuForChildren()) || !this.zzam.equals(place.getServesCocktails()) || !this.zzan.equals(place.getServesDessert()) || !this.zzao.equals(place.getServesCoffee()) || !this.zzap.equals(place.getGoodForChildren()) || !this.zzaq.equals(place.getAllowsDogs()) || !this.zzar.equals(place.getRestroom()) || !this.zzas.equals(place.getGoodForGroups()) || !this.zzat.equals(place.getGoodForWatchingSports())) {
            return false;
        }
        List list8 = this.zzau;
        if (list8 == null) {
            if (place.getSubDestinations() != null) {
                return false;
            }
        } else if (!list8.equals(place.getSubDestinations())) {
            return false;
        }
        FuelOptions fuelOptions = this.zzav;
        if (fuelOptions == null) {
            if (place.getFuelOptions() != null) {
                return false;
            }
        } else if (!fuelOptions.equals(place.getFuelOptions())) {
            return false;
        }
        return this.zzaw.equals(place.getPureServiceAreaBusiness());
    }

    public final String toString() {
        List list = this.zzE;
        List list2 = this.zzD;
        List list3 = this.zzC;
        OpeningHours openingHours = this.zzy;
        LatLng latLng = this.zzs;
        LatLng latLng2 = this.zzr;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzk;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2 = this.zzj;
        OpeningHours openingHours2 = this.zzi;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3 = this.zzh;
        Place.BusinessStatus businessStatus = this.zzg;
        List list4 = this.zzf;
        String strValueOf = String.valueOf(this.zze);
        String strValueOf2 = String.valueOf(list4);
        String strValueOf3 = String.valueOf(businessStatus);
        String string = booleanPlaceAttributeValue3.toString();
        String strValueOf4 = String.valueOf(openingHours2);
        String string2 = booleanPlaceAttributeValue2.toString();
        String string3 = booleanPlaceAttributeValue.toString();
        String strValueOf5 = String.valueOf(latLng2);
        String strValueOf6 = String.valueOf(latLng);
        String strValueOf7 = String.valueOf(openingHours);
        String strValueOf8 = String.valueOf(list3);
        String strValueOf9 = String.valueOf(list2);
        String strValueOf10 = String.valueOf(list);
        String strValueOf11 = String.valueOf(this.zzF);
        String strValueOf12 = String.valueOf(this.zzH);
        String string4 = this.zzM.toString();
        String strValueOf13 = String.valueOf(this.zzN);
        String strValueOf14 = String.valueOf(this.zzO);
        String string5 = this.zzP.toString();
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4 = this.zzaw;
        FuelOptions fuelOptions = this.zzav;
        List list5 = this.zzau;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5 = this.zzat;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6 = this.zzas;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7 = this.zzar;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue8 = this.zzaq;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue9 = this.zzap;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue10 = this.zzao;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue11 = this.zzan;
        String str = this.zza;
        String str2 = this.zzb;
        String str3 = this.zzc;
        String str4 = this.zzd;
        String str5 = this.zzl;
        String str6 = this.zzm;
        Integer num = this.zzn;
        String str7 = this.zzo;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue12 = this.zzQ;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue13 = this.zzR;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue14 = this.zzS;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue15 = this.zzT;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue16 = this.zzU;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue17 = this.zzV;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue18 = this.zzW;
        List list6 = this.zzX;
        LatLngBounds latLngBounds = this.zzab;
        Uri uri = this.zzac;
        Uri uri2 = this.zzad;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue19 = this.zzae;
        AccessibilityOptions accessibilityOptions = this.zzaf;
        ParkingOptions parkingOptions = this.zzag;
        PaymentOptions paymentOptions = this.zzah;
        EVChargeOptions eVChargeOptions = this.zzai;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue20 = this.zzaj;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue21 = this.zzak;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue22 = this.zzal;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue23 = this.zzam;
        String string6 = booleanPlaceAttributeValue12.toString();
        String string7 = booleanPlaceAttributeValue13.toString();
        String string8 = booleanPlaceAttributeValue14.toString();
        String string9 = booleanPlaceAttributeValue15.toString();
        String string10 = booleanPlaceAttributeValue16.toString();
        String string11 = booleanPlaceAttributeValue17.toString();
        String string12 = booleanPlaceAttributeValue18.toString();
        String strValueOf15 = String.valueOf(list6);
        String strValueOf16 = String.valueOf(latLngBounds);
        String strValueOf17 = String.valueOf(uri);
        String strValueOf18 = String.valueOf(uri2);
        String string13 = booleanPlaceAttributeValue19.toString();
        String strValueOf19 = String.valueOf(accessibilityOptions);
        String strValueOf20 = String.valueOf(parkingOptions);
        String strValueOf21 = String.valueOf(paymentOptions);
        String strValueOf22 = String.valueOf(eVChargeOptions);
        String string14 = booleanPlaceAttributeValue20.toString();
        String string15 = booleanPlaceAttributeValue21.toString();
        String string16 = booleanPlaceAttributeValue22.toString();
        String string17 = booleanPlaceAttributeValue23.toString();
        String string18 = booleanPlaceAttributeValue11.toString();
        String string19 = booleanPlaceAttributeValue10.toString();
        String string20 = booleanPlaceAttributeValue9.toString();
        String string21 = booleanPlaceAttributeValue8.toString();
        String string22 = booleanPlaceAttributeValue7.toString();
        String string23 = booleanPlaceAttributeValue6.toString();
        String string24 = booleanPlaceAttributeValue5.toString();
        String strValueOf23 = String.valueOf(list5);
        String strValueOf24 = String.valueOf(fuelOptions);
        String string25 = booleanPlaceAttributeValue4.toString();
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        int length5 = String.valueOf(strValueOf).length();
        int length6 = String.valueOf(strValueOf2).length();
        int length7 = String.valueOf(strValueOf3).length();
        int length8 = string.length();
        int length9 = String.valueOf(strValueOf4).length();
        int length10 = string2.length();
        int length11 = string3.length();
        int length12 = String.valueOf(str5).length();
        int length13 = String.valueOf(str6).length();
        int length14 = String.valueOf(num).length();
        int length15 = String.valueOf(str7).length();
        Double d = this.zzL;
        String str8 = this.zzK;
        String str9 = this.zzJ;
        String str10 = this.zzI;
        Integer num2 = this.zzG;
        String str11 = this.zzB;
        String str12 = this.zzA;
        String str13 = this.zzz;
        String str14 = this.zzx;
        String str15 = this.zzw;
        String str16 = this.zzv;
        String str17 = this.zzu;
        String str18 = this.zzt;
        String str19 = this.zzq;
        String str20 = this.zzp;
        int length16 = String.valueOf(str20).length();
        int length17 = String.valueOf(str19).length();
        int length18 = String.valueOf(strValueOf5).length();
        int length19 = String.valueOf(strValueOf6).length();
        int length20 = String.valueOf(str18).length();
        int length21 = String.valueOf(str17).length();
        int length22 = String.valueOf(str16).length();
        int length23 = String.valueOf(str15).length();
        int length24 = String.valueOf(str14).length();
        int length25 = String.valueOf(strValueOf7).length();
        int length26 = String.valueOf(str13).length();
        int length27 = String.valueOf(str12).length();
        int length28 = String.valueOf(str11).length();
        int length29 = String.valueOf(strValueOf8).length();
        int length30 = String.valueOf(strValueOf9).length();
        int length31 = String.valueOf(strValueOf10).length();
        int length32 = String.valueOf(strValueOf11).length();
        int length33 = String.valueOf(num2).length();
        int length34 = String.valueOf(strValueOf12).length();
        int length35 = String.valueOf(str10).length();
        int length36 = String.valueOf(str9).length();
        int length37 = String.valueOf(str8).length();
        int length38 = String.valueOf(d).length();
        int length39 = string4.length();
        int length40 = String.valueOf(strValueOf13).length();
        String strValueOf25 = String.valueOf(strValueOf14);
        Integer num3 = this.zzaa;
        Integer num4 = this.zzZ;
        Integer num5 = this.zzY;
        StringBuilder sb = new StringBuilder(length + 33 + length2 + 24 + length3 + 19 + length4 + 20 + length5 + 15 + length6 + 17 + length7 + 17 + length8 + 22 + length9 + 11 + length10 + 9 + length11 + 19 + length12 + 31 + length13 + 22 + length14 + 10 + length15 + 14 + length16 + 5 + length17 + 9 + length18 + 11 + length19 + 7 + length20 + 14 + length21 + 19 + length22 + 26 + length23 + 15 + length24 + 15 + length25 + 14 + length26 + 27 + length27 + 22 + length28 + 17 + length29 + 10 + length30 + 13 + length31 + 11 + length32 + 13 + length33 + 13 + length34 + 14 + length35 + 25 + length36 + 37 + length37 + 9 + length38 + 13 + length39 + 24 + length40 + 31 + strValueOf25.length() + 13 + string5.length() + 18 + string6.length() + 15 + string7.length() + 15 + string8.length() + 14 + string9.length() + 23 + string10.length() + 13 + string11.length() + 10 + string12.length() + 8 + String.valueOf(strValueOf15).length() + 19 + String.valueOf(num5).length() + 18 + String.valueOf(num4).length() + 19 + String.valueOf(num3).length() + 11 + String.valueOf(strValueOf16).length() + 13 + String.valueOf(strValueOf17).length() + 16 + String.valueOf(strValueOf18).length() + 31 + string13.length() + 23 + String.valueOf(strValueOf19).length() + 17 + String.valueOf(strValueOf20).length() + 17 + String.valueOf(strValueOf21).length() + 18 + String.valueOf(strValueOf22).length() + 17 + string14.length() + 12 + string15.length() + 18 + string16.length() + 18 + string17.length() + 16 + string18.length() + 15 + string19.length() + 18 + string20.length() + 13 + string21.length() + 11 + string22.length() + 16 + string23.length() + 24 + string24.length() + 18 + String.valueOf(strValueOf23).length() + 14 + String.valueOf(strValueOf24).length() + 26 + string25.length() + 1);
        sb.append("Place{address=");
        sb.append(str);
        sb.append(", formattedAddress=");
        sb.append(str2);
        sb.append(", shortFormattedAddress=");
        sb.append(str3);
        sb.append(", adrFormatAddress=");
        sb.append(str4);
        sb.append(", addressComponents=");
        sb.append(strValueOf);
        sb.append(", attributions=");
        sb.append(strValueOf2);
        sb.append(", businessStatus=");
        sb.append(strValueOf3);
        sb.append(", curbsidePickup=");
        sb.append(string);
        sb.append(", currentOpeningHours=");
        sb.append(strValueOf4);
        sb.append(", delivery=");
        sb.append(string2);
        sb.append(", dineIn=");
        sb.append(string3);
        sb.append(", editorialSummary=");
        sb.append(str5);
        sb.append(", editorialSummaryLanguageCode=");
        sb.append(str6);
        sb.append(", iconBackgroundColor=");
        sb.append(num);
        sb.append(", iconUrl=");
        sb.append(str7);
        sb.append(", iconMaskUrl=");
        sb.append(str20);
        sb.append(", id=");
        sb.append(str19);
        sb.append(", latLng=");
        sb.append(strValueOf5);
        sb.append(", location=");
        sb.append(strValueOf6);
        sb.append(", name=");
        sb.append(str18);
        sb.append(", displayName=");
        sb.append(str17);
        sb.append(", nameLanguageCode=");
        sb.append(str16);
        sb.append(", displayNameLanguageCode=");
        sb.append(str15);
        sb.append(", resourceName=");
        sb.append(str14);
        sb.append(", openingHours=");
        sb.append(strValueOf7);
        sb.append(", phoneNumber=");
        sb.append(str13);
        sb.append(", internationalPhoneNumber=");
        sb.append(str12);
        sb.append(", nationalPhoneNumber=");
        sb.append(str11);
        sb.append(", photoMetadatas=");
        sb.append(strValueOf8);
        sb.append(", reviews=");
        sb.append(strValueOf9);
        sb.append(", placeTypes=");
        sb.append(strValueOf10);
        sb.append(", plusCode=");
        sb.append(strValueOf11);
        sb.append(", priceLevel=");
        sb.append(num2);
        sb.append(", priceRange=");
        sb.append(strValueOf12);
        sb.append(", primaryType=");
        sb.append(str10);
        sb.append(", primaryTypeDisplayName=");
        sb.append(str9);
        sb.append(", primaryTypeDisplayNameLanguageCode=");
        sb.append(str8);
        sb.append(", rating=");
        sb.append(d);
        sb.append(", reservable=");
        sb.append(string4);
        sb.append(", secondaryOpeningHours=");
        sb.append(strValueOf13);
        sb.append(", currentSecondaryOpeningHours=");
        sb.append(strValueOf14);
        sb.append(", servesBeer=");
        sb.append(string5);
        sb.append(", servesBreakfast=");
        sb.append(string6);
        sb.append(", servesBrunch=");
        sb.append(string7);
        sb.append(", servesDinner=");
        sb.append(string8);
        sb.append(", servesLunch=");
        sb.append(string9);
        sb.append(", servesVegetarianFood=");
        sb.append(string10);
        sb.append(", servesWine=");
        sb.append(string11);
        sb.append(", takeout=");
        sb.append(string12);
        sb.append(", types=");
        sb.append(strValueOf15);
        sb.append(", userRatingsTotal=");
        sb.append(num5);
        sb.append(", userRatingCount=");
        sb.append(num4);
        sb.append(", utcOffsetMinutes=");
        sb.append(num3);
        sb.append(", viewport=");
        sb.append(strValueOf16);
        sb.append(", websiteUri=");
        sb.append(strValueOf17);
        sb.append(", googleMapsUri=");
        sb.append(strValueOf18);
        sb.append(", wheelchairAccessibleEntrance=");
        sb.append(string13);
        sb.append(", accessibilityOptions=");
        sb.append(strValueOf19);
        sb.append(", parkingOptions=");
        sb.append(strValueOf20);
        sb.append(", paymentOptions=");
        sb.append(strValueOf21);
        sb.append(", evChargeOptions=");
        sb.append(strValueOf22);
        sb.append(", outdoorSeating=");
        sb.append(string14);
        sb.append(", liveMusic=");
        sb.append(string15);
        sb.append(", menuForChildren=");
        sb.append(string16);
        sb.append(", servesCocktails=");
        sb.append(string17);
        sb.append(", servesDessert=");
        sb.append(string18);
        sb.append(", servesCoffee=");
        sb.append(string19);
        sb.append(", goodForChildren=");
        sb.append(string20);
        sb.append(", allowsDogs=");
        sb.append(string21);
        sb.append(", restroom=");
        sb.append(string22);
        sb.append(", goodForGroups=");
        sb.append(string23);
        sb.append(", goodForWatchingSports=");
        sb.append(string24);
        sb.append(", subDestinations=");
        sb.append(strValueOf23);
        sb.append(", fuelOptions=");
        sb.append(strValueOf24);
        sb.append(", pureServiceAreaBusiness=");
        sb.append(string25);
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
        AddressComponents addressComponents = this.zze;
        int iHashCode5 = addressComponents == null ? 0 : addressComponents.hashCode();
        List list = this.zzf;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        Place.BusinessStatus businessStatus = this.zzg;
        int iHashCode7 = businessStatus == null ? 0 : businessStatus.hashCode();
        int iHashCode8 = this.zzh.hashCode();
        OpeningHours openingHours = this.zzi;
        int iHashCode9 = openingHours == null ? 0 : openingHours.hashCode();
        int iHashCode10 = this.zzj.hashCode();
        int iHashCode11 = this.zzk.hashCode();
        String str5 = this.zzl;
        int iHashCode12 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.zzm;
        int iHashCode13 = str6 == null ? 0 : str6.hashCode();
        Integer num = this.zzn;
        int iHashCode14 = num == null ? 0 : num.hashCode();
        String str7 = this.zzo;
        int iHashCode15 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.zzp;
        int iHashCode16 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.zzq;
        int iHashCode17 = str9 == null ? 0 : str9.hashCode();
        LatLng latLng = this.zzr;
        int iHashCode18 = latLng == null ? 0 : latLng.hashCode();
        LatLng latLng2 = this.zzs;
        int iHashCode19 = latLng2 == null ? 0 : latLng2.hashCode();
        String str10 = this.zzt;
        int iHashCode20 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.zzu;
        int iHashCode21 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.zzv;
        int iHashCode22 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.zzw;
        int iHashCode23 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.zzx;
        int iHashCode24 = str14 == null ? 0 : str14.hashCode();
        OpeningHours openingHours2 = this.zzy;
        int iHashCode25 = openingHours2 == null ? 0 : openingHours2.hashCode();
        String str15 = this.zzz;
        int iHashCode26 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.zzA;
        int iHashCode27 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.zzB;
        int iHashCode28 = str17 == null ? 0 : str17.hashCode();
        List list2 = this.zzC;
        int iHashCode29 = list2 == null ? 0 : list2.hashCode();
        List list3 = this.zzD;
        int iHashCode30 = list3 == null ? 0 : list3.hashCode();
        List list4 = this.zzE;
        int iHashCode31 = list4 == null ? 0 : list4.hashCode();
        PlusCode plusCode = this.zzF;
        int iHashCode32 = plusCode == null ? 0 : plusCode.hashCode();
        Integer num2 = this.zzG;
        int iHashCode33 = num2 == null ? 0 : num2.hashCode();
        zzey zzeyVar = this.zzH;
        int iHashCode34 = zzeyVar == null ? 0 : zzeyVar.hashCode();
        String str18 = this.zzI;
        int iHashCode35 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.zzJ;
        int iHashCode36 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.zzK;
        int iHashCode37 = str20 == null ? 0 : str20.hashCode();
        Double d = this.zzL;
        int iHashCode38 = d == null ? 0 : d.hashCode();
        int iHashCode39 = this.zzM.hashCode();
        List list5 = this.zzN;
        int iHashCode40 = list5 == null ? 0 : list5.hashCode();
        List list6 = this.zzO;
        int iHashCode41 = list6 == null ? 0 : list6.hashCode();
        int iHashCode42 = this.zzP.hashCode();
        int iHashCode43 = this.zzQ.hashCode();
        int iHashCode44 = this.zzR.hashCode();
        int iHashCode45 = this.zzS.hashCode();
        int iHashCode46 = this.zzT.hashCode();
        int iHashCode47 = this.zzU.hashCode();
        int iHashCode48 = this.zzV.hashCode();
        int iHashCode49 = this.zzW.hashCode();
        List list7 = this.zzX;
        int iHashCode50 = list7 == null ? 0 : list7.hashCode();
        Integer num3 = this.zzY;
        int iHashCode51 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.zzZ;
        int iHashCode52 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.zzaa;
        int iHashCode53 = num5 == null ? 0 : num5.hashCode();
        LatLngBounds latLngBounds = this.zzab;
        int iHashCode54 = latLngBounds == null ? 0 : latLngBounds.hashCode();
        Uri uri = this.zzac;
        int iHashCode55 = uri == null ? 0 : uri.hashCode();
        Uri uri2 = this.zzad;
        int iHashCode56 = uri2 == null ? 0 : uri2.hashCode();
        int iHashCode57 = this.zzae.hashCode();
        AccessibilityOptions accessibilityOptions = this.zzaf;
        int iHashCode58 = accessibilityOptions == null ? 0 : accessibilityOptions.hashCode();
        ParkingOptions parkingOptions = this.zzag;
        int iHashCode59 = parkingOptions == null ? 0 : parkingOptions.hashCode();
        PaymentOptions paymentOptions = this.zzah;
        int iHashCode60 = paymentOptions == null ? 0 : paymentOptions.hashCode();
        EVChargeOptions eVChargeOptions = this.zzai;
        int iHashCode61 = eVChargeOptions == null ? 0 : eVChargeOptions.hashCode();
        int iHashCode62 = this.zzaj.hashCode();
        int iHashCode63 = this.zzak.hashCode();
        int iHashCode64 = this.zzal.hashCode();
        int iHashCode65 = this.zzam.hashCode();
        int iHashCode66 = this.zzan.hashCode();
        int iHashCode67 = this.zzao.hashCode();
        int iHashCode68 = this.zzap.hashCode();
        int iHashCode69 = this.zzaq.hashCode();
        int iHashCode70 = this.zzar.hashCode();
        int iHashCode71 = this.zzas.hashCode();
        int iHashCode72 = this.zzat.hashCode();
        List list8 = this.zzau;
        int iHashCode73 = list8 == null ? 0 : list8.hashCode();
        FuelOptions fuelOptions = this.zzav;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ iHashCode10) * 1000003) ^ iHashCode11) * 1000003) ^ iHashCode12) * 1000003) ^ iHashCode13) * 1000003) ^ iHashCode14) * 1000003) ^ iHashCode15) * 1000003) ^ iHashCode16) * 1000003) ^ iHashCode17) * 1000003) ^ iHashCode18) * 1000003) ^ iHashCode19) * 1000003) ^ iHashCode20) * 1000003) ^ iHashCode21) * 1000003) ^ iHashCode22) * 1000003) ^ iHashCode23) * 1000003) ^ iHashCode24) * 1000003) ^ iHashCode25) * 1000003) ^ iHashCode26) * 1000003) ^ iHashCode27) * 1000003) ^ iHashCode28) * 1000003) ^ iHashCode29) * 1000003) ^ iHashCode30) * 1000003) ^ iHashCode31) * 1000003) ^ iHashCode32) * 1000003) ^ iHashCode33) * 1000003) ^ iHashCode34) * 1000003) ^ iHashCode35) * 1000003) ^ iHashCode36) * 1000003) ^ iHashCode37) * 1000003) ^ iHashCode38) * 1000003) ^ iHashCode39) * 1000003) ^ iHashCode40) * 1000003) ^ iHashCode41) * 1000003) ^ iHashCode42) * 1000003) ^ iHashCode43) * 1000003) ^ iHashCode44) * 1000003) ^ iHashCode45) * 1000003) ^ iHashCode46) * 1000003) ^ iHashCode47) * 1000003) ^ iHashCode48) * 1000003) ^ iHashCode49) * 1000003) ^ iHashCode50) * 1000003) ^ iHashCode51) * 1000003) ^ iHashCode52) * 1000003) ^ iHashCode53) * 1000003) ^ iHashCode54) * 1000003) ^ iHashCode55) * 1000003) ^ iHashCode56) * 1000003) ^ iHashCode57) * 1000003) ^ iHashCode58) * 1000003) ^ iHashCode59) * 1000003) ^ iHashCode60) * 1000003) ^ iHashCode61) * 1000003) ^ iHashCode62) * 1000003) ^ iHashCode63) * 1000003) ^ iHashCode64) * 1000003) ^ iHashCode65) * 1000003) ^ iHashCode66) * 1000003) ^ iHashCode67) * 1000003) ^ iHashCode68) * 1000003) ^ iHashCode69) * 1000003) ^ iHashCode70) * 1000003) ^ iHashCode71) * 1000003) ^ iHashCode72) * 1000003) ^ iHashCode73) * 1000003) ^ (fuelOptions != null ? fuelOptions.hashCode() : 0)) * 1000003) ^ this.zzaw.hashCode();
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public AccessibilityOptions getAccessibilityOptions() {
        return this.zzaf;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Deprecated
    public String getAddress() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public AddressComponents getAddressComponents() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getAdrFormatAddress() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getAllowsDogs() {
        return this.zzaq;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public List<String> getAttributions() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BusinessStatus getBusinessStatus() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getCurbsidePickup() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public OpeningHours getCurrentOpeningHours() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public List<OpeningHours> getCurrentSecondaryOpeningHours() {
        return this.zzO;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getDelivery() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getDineIn() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getDisplayName() {
        return this.zzu;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getDisplayNameLanguageCode() {
        return this.zzw;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getEditorialSummary() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getEditorialSummaryLanguageCode() {
        return this.zzm;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public EVChargeOptions getEvChargeOptions() {
        return this.zzai;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getFormattedAddress() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public FuelOptions getFuelOptions() {
        return this.zzav;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getGoodForChildren() {
        return this.zzap;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getGoodForGroups() {
        return this.zzas;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getGoodForWatchingSports() {
        return this.zzat;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Uri getGoogleMapsUri() {
        return this.zzad;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Integer getIconBackgroundColor() {
        return this.zzn;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getIconMaskUrl() {
        return this.zzp;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Deprecated
    public String getIconUrl() {
        return this.zzo;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getId() {
        return this.zzq;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getInternationalPhoneNumber() {
        return this.zzA;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Deprecated
    public LatLng getLatLng() {
        return this.zzr;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getLiveMusic() {
        return this.zzak;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public LatLng getLocation() {
        return this.zzs;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getMenuForChildren() {
        return this.zzal;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Deprecated
    public String getName() {
        return this.zzt;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Deprecated
    public String getNameLanguageCode() {
        return this.zzv;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getNationalPhoneNumber() {
        return this.zzB;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public OpeningHours getOpeningHours() {
        return this.zzy;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getOutdoorSeating() {
        return this.zzaj;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public ParkingOptions getParkingOptions() {
        return this.zzag;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public PaymentOptions getPaymentOptions() {
        return this.zzah;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Deprecated
    public String getPhoneNumber() {
        return this.zzz;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public List<PhotoMetadata> getPhotoMetadatas() {
        return this.zzC;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public List<String> getPlaceTypes() {
        return this.zzE;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public PlusCode getPlusCode() {
        return this.zzF;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Integer getPriceLevel() {
        return this.zzG;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getPrimaryType() {
        return this.zzI;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getPrimaryTypeDisplayName() {
        return this.zzJ;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getPrimaryTypeDisplayNameLanguageCode() {
        return this.zzK;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getPureServiceAreaBusiness() {
        return this.zzaw;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Double getRating() {
        return this.zzL;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getReservable() {
        return this.zzM;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getResourceName() {
        return this.zzx;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getRestroom() {
        return this.zzar;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public List<Review> getReviews() {
        return this.zzD;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public List<OpeningHours> getSecondaryOpeningHours() {
        return this.zzN;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesBeer() {
        return this.zzP;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesBreakfast() {
        return this.zzQ;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesBrunch() {
        return this.zzR;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesCocktails() {
        return this.zzam;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesCoffee() {
        return this.zzao;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesDessert() {
        return this.zzan;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesDinner() {
        return this.zzS;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesLunch() {
        return this.zzT;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesVegetarianFood() {
        return this.zzU;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getServesWine() {
        return this.zzV;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getShortFormattedAddress() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public List<SubDestination> getSubDestinations() {
        return this.zzau;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Place.BooleanPlaceAttributeValue getTakeout() {
        return this.zzW;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Deprecated
    public List<Place.Type> getTypes() {
        return this.zzX;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Integer getUserRatingCount() {
        return this.zzZ;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Deprecated
    public Integer getUserRatingsTotal() {
        return this.zzY;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Integer getUtcOffsetMinutes() {
        return this.zzaa;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public LatLngBounds getViewport() {
        return this.zzab;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Uri getWebsiteUri() {
        return this.zzac;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    @Deprecated
    public Place.BooleanPlaceAttributeValue getWheelchairAccessibleEntrance() {
        return this.zzae;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final zzey zza() {
        return this.zzH;
    }
}
