package com.google.android.libraries.places.api.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzdk extends zzar {
    public static final Parcelable.Creator<zzdk> CREATOR;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {48, -119, -71, 110};
    private static final int $$f = 134;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {5, 11, -122, -94, 9, -33, 51, 13, 14, -4, 9, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$e = 36;
    private static final byte[] $$a = {21, ByteCompanionObject.MAX_VALUE, 49, -115, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 106;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int b = 0;

    zzdk(String str, String str2, String str3, String str4, AddressComponents addressComponents, List list, Place.BusinessStatus businessStatus, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, OpeningHours openingHours, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, String str5, String str6, Integer num, String str7, String str8, String str9, LatLng latLng, LatLng latLng2, String str10, String str11, String str12, String str13, String str14, OpeningHours openingHours2, String str15, String str16, String str17, List list2, List list3, List list4, PlusCode plusCode, Integer num2, zzey zzeyVar, String str18, String str19, String str20, Double d, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4, List list5, List list6, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue8, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue9, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue10, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue11, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue12, List list7, Integer num3, Integer num4, Integer num5, LatLngBounds latLngBounds, Uri uri, Uri uri2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue13, AccessibilityOptions accessibilityOptions, ParkingOptions parkingOptions, PaymentOptions paymentOptions, EVChargeOptions eVChargeOptions, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue14, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue15, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue16, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue17, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue18, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue19, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue20, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue21, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue22, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue23, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue24, List list8, FuelOptions fuelOptions, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue25) {
        super(str, str2, str3, str4, addressComponents, list, businessStatus, booleanPlaceAttributeValue, openingHours, booleanPlaceAttributeValue2, booleanPlaceAttributeValue3, str5, str6, num, str7, str8, str9, latLng, latLng2, str10, str11, str12, str13, str14, openingHours2, str15, str16, str17, list2, list3, list4, plusCode, num2, zzeyVar, str18, str19, str20, d, booleanPlaceAttributeValue4, list5, list6, booleanPlaceAttributeValue5, booleanPlaceAttributeValue6, booleanPlaceAttributeValue7, booleanPlaceAttributeValue8, booleanPlaceAttributeValue9, booleanPlaceAttributeValue10, booleanPlaceAttributeValue11, booleanPlaceAttributeValue12, list7, num3, num4, num5, latLngBounds, uri, uri2, booleanPlaceAttributeValue13, accessibilityOptions, parkingOptions, paymentOptions, eVChargeOptions, booleanPlaceAttributeValue14, booleanPlaceAttributeValue15, booleanPlaceAttributeValue16, booleanPlaceAttributeValue17, booleanPlaceAttributeValue18, booleanPlaceAttributeValue19, booleanPlaceAttributeValue20, booleanPlaceAttributeValue21, booleanPlaceAttributeValue22, booleanPlaceAttributeValue23, booleanPlaceAttributeValue24, list8, fuelOptions, booleanPlaceAttributeValue25);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 84
            int r5 = r5 * 15
            int r0 = r5 + 38
            byte[] r1 = com.google.android.libraries.places.api.model.zzdk.$$a
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r5 = r5 + 37
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r6
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
        L29:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzdk.a(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 30
            int r0 = r7 + 8
            int r8 = r8 * 27
            int r8 = 111 - r8
            byte[] r1 = com.google.android.libraries.places.api.model.zzdk.$$d
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r7 = r7 + 7
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2e:
            int r6 = r6 + r4
            int r6 = r6 + (-10)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzdk.d(byte, byte, short, java.lang.Object[]):void");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        if (getAddress() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getAddress());
        }
        if (getFormattedAddress() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getFormattedAddress());
        }
        if (getShortFormattedAddress() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getShortFormattedAddress());
        }
        if (getAdrFormatAddress() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getAdrFormatAddress());
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
        }
        parcel.writeParcelable(getAddressComponents(), i);
        parcel.writeList(getAttributions());
        parcel.writeParcelable(getBusinessStatus(), i);
        parcel.writeParcelable(getCurbsidePickup(), i);
        parcel.writeParcelable(getCurrentOpeningHours(), i);
        parcel.writeParcelable(getDelivery(), i);
        parcel.writeParcelable(getDineIn(), i);
        if (getEditorialSummary() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getEditorialSummary());
        }
        if (getEditorialSummaryLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getEditorialSummaryLanguageCode());
        }
        if (getIconBackgroundColor() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getIconBackgroundColor().intValue());
        }
        if (getIconUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getIconUrl());
        }
        if (getIconMaskUrl() == null) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 == 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(1);
            }
        } else {
            parcel.writeInt(0);
            parcel.writeString(getIconMaskUrl());
        }
        if (getId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getId());
        }
        parcel.writeParcelable(getLatLng(), i);
        parcel.writeParcelable(getLocation(), i);
        if (getName() == null) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            if (i6 % 2 != 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(1);
            }
        } else {
            parcel.writeInt(0);
            parcel.writeString(getName());
        }
        if (getDisplayName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getDisplayName());
        }
        if (getNameLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getNameLanguageCode());
        }
        if (getDisplayNameLanguageCode() == null) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getDisplayNameLanguageCode());
        }
        if (getResourceName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getResourceName());
        }
        parcel.writeParcelable(getOpeningHours(), i);
        if (getPhoneNumber() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getPhoneNumber());
        }
        if (getInternationalPhoneNumber() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getInternationalPhoneNumber());
        }
        if (getNationalPhoneNumber() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getNationalPhoneNumber());
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            int i10 = i9 % 2;
        }
        parcel.writeList(getPhotoMetadatas());
        parcel.writeList(getReviews());
        parcel.writeList(getPlaceTypes());
        parcel.writeParcelable(getPlusCode(), i);
        if (getPriceLevel() == null) {
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
            int i12 = i11 % 2;
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getPriceLevel().intValue());
        }
        parcel.writeParcelable(zza(), i);
        if (getPrimaryType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getPrimaryType());
        }
        if (getPrimaryTypeDisplayName() == null) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
            if (i13 % 2 == 0) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
            }
        } else {
            parcel.writeInt(0);
            parcel.writeString(getPrimaryTypeDisplayName());
        }
        if (getPrimaryTypeDisplayNameLanguageCode() == null) {
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
            int i15 = i14 % 2;
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getPrimaryTypeDisplayNameLanguageCode());
        }
        if (getRating() == null) {
            int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
            if (i16 % 2 == 0) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
            }
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(getRating().doubleValue());
        }
        parcel.writeParcelable(getReservable(), i);
        parcel.writeList(getSecondaryOpeningHours());
        parcel.writeList(getCurrentSecondaryOpeningHours());
        parcel.writeParcelable(getServesBeer(), i);
        parcel.writeParcelable(getServesBreakfast(), i);
        parcel.writeParcelable(getServesBrunch(), i);
        parcel.writeParcelable(getServesDinner(), i);
        parcel.writeParcelable(getServesLunch(), i);
        parcel.writeParcelable(getServesVegetarianFood(), i);
        parcel.writeParcelable(getServesWine(), i);
        parcel.writeParcelable(getTakeout(), i);
        parcel.writeList(getTypes());
        if (getUserRatingsTotal() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getUserRatingsTotal().intValue());
        }
        if (getUserRatingCount() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getUserRatingCount().intValue());
        }
        if (getUtcOffsetMinutes() == null) {
            int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
            int i18 = i17 % 2;
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getUtcOffsetMinutes().intValue());
        }
        parcel.writeParcelable(getViewport(), i);
        parcel.writeParcelable(getWebsiteUri(), i);
        parcel.writeParcelable(getGoogleMapsUri(), i);
        parcel.writeParcelable(getWheelchairAccessibleEntrance(), i);
        parcel.writeParcelable(getAccessibilityOptions(), i);
        parcel.writeParcelable(getParkingOptions(), i);
        parcel.writeParcelable(getPaymentOptions(), i);
        parcel.writeParcelable(getEvChargeOptions(), i);
        parcel.writeParcelable(getOutdoorSeating(), i);
        parcel.writeParcelable(getLiveMusic(), i);
        parcel.writeParcelable(getMenuForChildren(), i);
        parcel.writeParcelable(getServesCocktails(), i);
        parcel.writeParcelable(getServesDessert(), i);
        parcel.writeParcelable(getServesCoffee(), i);
        parcel.writeParcelable(getGoodForChildren(), i);
        parcel.writeParcelable(getAllowsDogs(), i);
        parcel.writeParcelable(getRestroom(), i);
        parcel.writeParcelable(getGoodForGroups(), i);
        parcel.writeParcelable(getGoodForWatchingSports(), i);
        parcel.writeList(getSubDestinations());
        parcel.writeParcelable(getFuelOptions(), i);
        parcel.writeParcelable(getPureServiceAreaBusiness(), i);
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = -1870535734;
        int i6 = 1;
        int i7 = 0;
        if (iArr2 != null) {
            int i8 = $11 + 1;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = $11 + 73;
                $10 = i11 % 128;
                int i12 = i11 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i10])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 3291 - (ViewConfiguration.getPressedStateDuration() >> 16), 31 - KeyEvent.getDeadChar(0, 0), 1948206109, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i10++;
                    int i13 = $11 + 19;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    i3 = 2;
                    i5 = -1870535734;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i15 = 0;
            while (i15 < length3) {
                int i16 = $10 + 73;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                Object[] objArr3 = new Object[i6];
                objArr3[i7] = Integer.valueOf(iArr5[i15]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                    int offsetAfter = TextUtils.getOffsetAfter("", i7) + 3291;
                    int i18 = (CdmaCellLocation.convertQuartSecToDecDegrees(i7) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i7) == 0.0d ? 0 : -1)) + 31;
                    byte b4 = (byte) i6;
                    byte b5 = (byte) (b4 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAxisFromString, offsetAfter, i18, 1948206109, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr6[i15] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i15++;
                iArr5 = iArr5;
                i6 = 1;
                i7 = 0;
            }
            i2 = i7;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        sessionConfigValidatingBuilder.b = 2;
        int i19 = $10 + 27;
        $11 = i19 % 128;
        int i20 = i19 % 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i21 = $11 + 63;
            $10 = i21 % 128;
            int i22 = i21 % 2;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i23 = 17;
            for (int i24 = 1; i23 > i24; i24 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i23];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), 2559 - TextUtils.getOffsetAfter("", 0), 30 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 683220507, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i23--;
            }
            int i25 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i26 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28879 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 348 - Color.blue(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i26 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cBlue = (char) Color.blue(0);
            int threadPriority = 876 - ((Process.getThreadPriority(0) + 20) >> 6);
            int defaultSize = View.getDefaultSize(0, 0) + 10;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, threadPriority, defaultSize, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{-356323741, 394372063, 1081302583, 468448292, 1064393353, 907821625, 1810831333, 588312622, 1273671992, -2087959651, 1086720470, -1653979483, -613975471, 1519265157}, 22 - ExpandableListView.getPackedPositionType(0L), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{-1575485485, -1290565423, -1874098410, -1463069819, -1367342488, -86254980, -793094768, -112248631, 26918559, 1993806832}, 15 - TextUtils.getTrimmedLength(""), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
            int iIndexOf = TextUtils.indexOf("", "", 0) + 876;
            int maximumDrawingCacheSize = 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte[] bArr = $$a;
            byte b4 = bArr[28];
            byte b5 = bArr[7];
            Object[] objArr5 = new Object[1];
            a(b4, (byte) (b4 | 36), b5, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, iIndexOf, maximumDrawingCacheSize, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                int iMyTid = 876 - (Process.myTid() >> 22);
                int deadChar = 10 - KeyEvent.getDeadChar(0, 0);
                byte[] bArr2 = $$a;
                byte b6 = bArr2[28];
                Object[] objArr6 = new Object[1];
                a(b6, (byte) (b6 | 88), bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, iMyTid, deadChar, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i2 = ~(119580074 | iIdentityHashCode);
            int i3 = ~iIdentityHashCode;
            int i4 = i2 | (~(159890303 | i3));
            int i5 = ~((-119580075) | i3);
            int i6 = (((1862483244 + ((i4 | i5) * (-516))) + (((~(iIdentityHashCode | (-143071830))) | (~((-16818475) | i3))) * 516)) + ((16818474 | i5) * 516)) - 922684210;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{297748518, 636072179, -512952752, -1303670654, 1127631111, -1341752012, -537804092, -2037164810, 574816241, 1113897316, -681735299, -1977780342, -988947149, 1668308223, -421302163, 568853724}, 26 - Color.green(0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{1418107844, 819788624, 1682245151, -1590813506, 1595666434, -796898852, -243173776, 441693007, 1281650601, 997309193, -652320703, 1166860943}, View.combineMeasuredStates(0, 0) + 18, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new int[]{-1769045296, -146948762, -1914013361, 1915770963, -238620455, 100587429, 742932086, 1451842972, 1778085413, -1399463655}, 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new int[]{-919255155, -739388977, 1219532992, -1631532665, 747476201, 1548892447, -1255611416, -648202544, -1306625269, -1278395210}, Color.blue(0) + 16, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -922684210};
                byte[] bArr3 = $$d;
                byte b7 = bArr3[14];
                byte b8 = bArr3[35];
                Object[] objArr13 = new Object[1];
                d(b7, b8, b8, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b9 = (byte) (bArr3[0] + 1);
                byte b10 = (byte) (-bArr3[14]);
                Object[] objArr14 = new Object[1];
                d(b9, b10, b10, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                    int i12 = i11 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cRed = (char) Color.red(0);
                        int iMakeMeasureSpec = 876 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 11;
                        byte[] bArr4 = $$a;
                        byte b11 = bArr4[28];
                        Object[] objArr16 = new Object[1];
                        a(b11, (byte) (b11 | 88), bArr4[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRed, iMakeMeasureSpec, iLastIndexOf, 2012931276, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new int[]{-356323741, 394372063, 1081302583, 468448292, 1064393353, 907821625, 1810831333, 588312622, 1273671992, -2087959651, 1086720470, -1653979483, -613975471, 1519265157}, 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new int[]{-1575485485, -1290565423, -1874098410, -1463069819, -1367342488, -86254980, -793094768, -112248631, 26918559, 1993806832}, 15 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                            int size = View.MeasureSpec.getSize(0) + 876;
                            int i13 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                            byte[] bArr5 = $$a;
                            byte b12 = bArr5[28];
                            Object[] objArr19 = new Object[1];
                            a(b12, (byte) (b12 | 36), bArr5[7], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveOpacity, size, i13, 2012020043, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                            int offsetAfter = 876 - TextUtils.getOffsetAfter("", 0);
                            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 10;
                            byte b13 = $$a[7];
                            byte b14 = b13;
                            Object[] objArr20 = new Object[1];
                            a(b13, b14, b14, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(bitsPerPixel, offsetAfter, packedPositionType, -1650998592, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            throw null;
        }
        int i14 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i15 = i14 + (-454980592) + (((-92310017) | iIdentityHashCode2) * (-627)) + (((~(92379651 | iIdentityHashCode2)) | 132689880) * (-627)) + (((~(iIdentityHashCode2 | 132689880)) | (~((~iIdentityHashCode2) | (-92379652)))) * 627);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr21[1])[0] = i17 ^ (i17 << 5);
        int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 56 / 0;
        }
        return 0;
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        CREATOR = new zzdj();
        int i = b + 91;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new int[]{526010370, -1606957620, -336213873, -319120197, 1739774771, -849339343, 40106515, 849887418, 300763410, -1991123031, 488950716, -2061807808, 1959194737, -97494953, 316000153, 1399953203, -2081115092, 1616045377};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, int r8) {
        /*
            int r6 = r6 * 56
            int r6 = 122 - r6
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r0 = 1 - r8
            byte[] r1 = com.google.android.libraries.places.api.model.zzdk.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2c:
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzdk.$$g(int, short, int):java.lang.String");
    }
}
