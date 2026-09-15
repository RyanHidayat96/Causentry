package com.google.android.libraries.places.api.model;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.DecorContentParent;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
final class zzaq extends Place.Builder {
    private String zzA;
    private String zzB;
    private List zzC;
    private List zzD;
    private List zzE;
    private PlusCode zzF;
    private Integer zzG;
    private zzey zzH;
    private String zzI;
    private String zzJ;
    private String zzK;
    private Double zzL;
    private Place.BooleanPlaceAttributeValue zzM;
    private List zzN;
    private List zzO;
    private Place.BooleanPlaceAttributeValue zzP;
    private Place.BooleanPlaceAttributeValue zzQ;
    private Place.BooleanPlaceAttributeValue zzR;
    private Place.BooleanPlaceAttributeValue zzS;
    private Place.BooleanPlaceAttributeValue zzT;
    private Place.BooleanPlaceAttributeValue zzU;
    private Place.BooleanPlaceAttributeValue zzV;
    private Place.BooleanPlaceAttributeValue zzW;
    private List zzX;
    private Integer zzY;
    private Integer zzZ;
    private String zza;
    private Integer zzaa;
    private LatLngBounds zzab;
    private Uri zzac;
    private Uri zzad;
    private Place.BooleanPlaceAttributeValue zzae;
    private AccessibilityOptions zzaf;
    private ParkingOptions zzag;
    private PaymentOptions zzah;
    private EVChargeOptions zzai;
    private Place.BooleanPlaceAttributeValue zzaj;
    private Place.BooleanPlaceAttributeValue zzak;
    private Place.BooleanPlaceAttributeValue zzal;
    private Place.BooleanPlaceAttributeValue zzam;
    private Place.BooleanPlaceAttributeValue zzan;
    private Place.BooleanPlaceAttributeValue zzao;
    private Place.BooleanPlaceAttributeValue zzap;
    private Place.BooleanPlaceAttributeValue zzaq;
    private Place.BooleanPlaceAttributeValue zzar;
    private Place.BooleanPlaceAttributeValue zzas;
    private Place.BooleanPlaceAttributeValue zzat;
    private List zzau;
    private FuelOptions zzav;
    private Place.BooleanPlaceAttributeValue zzaw;
    private String zzb;
    private String zzc;
    private String zzd;
    private AddressComponents zze;
    private List zzf;
    private Place.BusinessStatus zzg;
    private Place.BooleanPlaceAttributeValue zzh;
    private OpeningHours zzi;
    private Place.BooleanPlaceAttributeValue zzj;
    private Place.BooleanPlaceAttributeValue zzk;
    private String zzl;
    private String zzm;
    private Integer zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private LatLng zzr;
    private LatLng zzs;
    private String zzt;
    private String zzu;
    private String zzv;
    private String zzw;
    private String zzx;
    private OpeningHours zzy;
    private String zzz;
    private static final byte[] $$c = {6, -86, -9, -124};
    private static final int $$f = 232;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {118, 35, -100, -35, 43, -5, 13, 5, -27, 37, 22, 11, 8, 4, -6, -25, 58, 3, -34, 48, 7, -12, 17, 1, -14, 32, 1, 24, 8, 4, -6, -42, 4, 40, -5, 18, -4, 13, 6, -23, 24, 31, -5, -1, 16, 13, -39, 51, -10, 13, 13, -1, 16, 13, -11, 14, 12, -3, 12, 12, 0, -23, 44, -1, 13, -4, 26, -8, 20, -58};
    private static final int $$e = 12;
    private static final byte[] $$a = {91, -17, 90, 37, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 66;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int asBinder = 1;
    private static char[] b = {47308, 47359, 47305, 47355, 47358, 47300, 47295, 47354, 47322, 47348, 47353, 47304, 47296, 47274, 47297, 47306, 47298, 47357, 47323};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2047719533;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = 100 - r6
            int r7 = r7 + 4
            int r8 = 53 - r8
            byte[] r0 = com.google.android.libraries.places.api.model.zzaq.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r7
            r4 = r2
            goto L26
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L26:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r3 + 1
            int r6 = r6 + (-11)
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzaq.a(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.libraries.places.api.model.zzaq.$$d
            int r7 = r7 * 11
            int r7 = 84 - r7
            int r8 = r8 * 8
            int r8 = r8 + 30
            int r9 = r9 * 29
            int r9 = 32 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r8
            r3 = r9
            r5 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2e:
            int r7 = r7 + r9
            int r7 = r7 + (-7)
            r9 = r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzaq.d(byte, int, byte, java.lang.Object[]):void");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getAllowsDogs() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 61;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzaq;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"allowsDogs\" has not been set");
        }
        int i5 = i3 + 17;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return booleanPlaceAttributeValue;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getCurbsidePickup() {
        int i = 2 % 2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzh;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"curbsidePickup\" has not been set");
        }
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 81;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 7;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return booleanPlaceAttributeValue;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getDelivery() {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzj;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"delivery\" has not been set");
        }
        int i5 = i3 + 13;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return booleanPlaceAttributeValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getDineIn() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 95;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzk;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"dineIn\" has not been set");
        }
        int i4 = i2 + 13;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return booleanPlaceAttributeValue;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getGoodForChildren() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 81;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzap;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"goodForChildren\" has not been set");
        }
        int i5 = i2 + 125;
        int i6 = i5 % 128;
        TuitionPaymentFragmentbindingInflater1 = i6;
        if (i5 % 2 != 0) {
            int i7 = 39 / 0;
        }
        int i8 = i6 + 67;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
        return booleanPlaceAttributeValue;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getGoodForGroups() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 23;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzas;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"goodForGroups\" has not been set");
        }
        int i5 = i3 + 17;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return booleanPlaceAttributeValue;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getGoodForWatchingSports() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 19;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzat;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"goodForWatchingSports\" has not been set");
        }
        int i5 = i2 + 87;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return booleanPlaceAttributeValue;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getLiveMusic() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 3;
        int i3 = i2 % 128;
        asBinder = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzak;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"liveMusic\" has not been set");
        }
        int i4 = i3 + 41;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return booleanPlaceAttributeValue;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getMenuForChildren() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzal;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"menuForChildren\" has not been set");
        }
        int i5 = i3 + 21;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
        return booleanPlaceAttributeValue;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getOutdoorSeating() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 79;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzaj;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"outdoorSeating\" has not been set");
        }
        int i5 = i2 + 7;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return booleanPlaceAttributeValue;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getPureServiceAreaBusiness() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 99;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzaw;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"pureServiceAreaBusiness\" has not been set");
        }
        int i5 = i2 + 7;
        int i6 = i5 % 128;
        asBinder = i6;
        Object obj = null;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i7 = i6 + 89;
        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
        if (i7 % 2 == 0) {
            return booleanPlaceAttributeValue;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getReservable() {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzM;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"reservable\" has not been set");
        }
        int i5 = i3 + 43;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i3 + 35;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        return booleanPlaceAttributeValue;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getRestroom() {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzar;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"restroom\" has not been set");
        }
        int i5 = i3 + 103;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return booleanPlaceAttributeValue;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesBeer() {
        int i = 2 % 2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzP;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"servesBeer\" has not been set");
        }
        int i2 = TuitionPaymentFragmentbindingInflater1 + 9;
        int i3 = i2 % 128;
        asBinder = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 105;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return booleanPlaceAttributeValue;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesBreakfast() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 13;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzQ;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"servesBreakfast\" has not been set");
        }
        int i5 = i3 + 39;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return booleanPlaceAttributeValue;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesBrunch() {
        int i = 2 % 2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzR;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"servesBrunch\" has not been set");
        }
        int i2 = asBinder + 41;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 111;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return booleanPlaceAttributeValue;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesCocktails() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 115;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzam;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"servesCocktails\" has not been set");
        }
        int i5 = i2 + 45;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return booleanPlaceAttributeValue;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesCoffee() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 49;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzao;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"servesCoffee\" has not been set");
        }
        int i5 = i2 + 93;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return booleanPlaceAttributeValue;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesDessert() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 45;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzan;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"servesDessert\" has not been set");
        }
        int i4 = i2 + 69;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return booleanPlaceAttributeValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        throw new java.lang.IllegalStateException("Property \"servesDinner\" has not been set");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 119;
        com.google.android.libraries.places.api.model.zzaq.TuitionPaymentFragmentbindingInflater1 = r1 % 128;
     */
    @Override // com.google.android.libraries.places.api.model.Place.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getServesDinner() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.libraries.places.api.model.zzaq.asBinder
            int r2 = r1 + 25
            int r3 = r2 % 128
            com.google.android.libraries.places.api.model.zzaq.TuitionPaymentFragmentbindingInflater1 = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L17
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r2 = r4.zzS
            r3 = 74
            int r3 = r3 / 0
            if (r2 == 0) goto L27
            goto L1b
        L17:
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r2 = r4.zzS
            if (r2 == 0) goto L27
        L1b:
            int r1 = r1 + 119
            int r3 = r1 % 128
            com.google.android.libraries.places.api.model.zzaq.TuitionPaymentFragmentbindingInflater1 = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L25
            return r2
        L25:
            r0 = 0
            throw r0
        L27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Property \"servesDinner\" has not been set"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzaq.getServesDinner():com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesLunch() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 107;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzT;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"servesLunch\" has not been set");
        }
        int i4 = i2 + 55;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return booleanPlaceAttributeValue;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesVegetarianFood() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 79;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzU;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"servesVegetarianFood\" has not been set");
        }
        int i4 = i2 + 111;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return booleanPlaceAttributeValue;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getServesWine() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 99;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzV;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"servesWine\" has not been set");
        }
        int i4 = i2 + 7;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return booleanPlaceAttributeValue;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getTakeout() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 103;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzW;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"takeout\" has not been set");
        }
        int i4 = i2 + 51;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return booleanPlaceAttributeValue;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BooleanPlaceAttributeValue getWheelchairAccessibleEntrance() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 11;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzae;
        if (booleanPlaceAttributeValue == null) {
            throw new IllegalStateException("Property \"wheelchairAccessibleEntrance\" has not been set");
        }
        int i5 = i2 + 53;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
        return booleanPlaceAttributeValue;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setAllowsDogs(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null allowsDogs");
        }
        this.zzaq = booleanPlaceAttributeValue;
        int i4 = i3 + 55;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setCurbsidePickup(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null curbsidePickup");
        }
        int i4 = i3 + 77;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        this.zzh = booleanPlaceAttributeValue;
        if (i5 != 0) {
            return this;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setDelivery(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 81;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null delivery");
        }
        int i5 = i3 + 57;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        this.zzj = booleanPlaceAttributeValue;
        if (i6 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i7 = i3 + 9;
        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
        int i8 = i7 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setDineIn(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 45;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null dineIn");
        }
        int i4 = i3 + 103;
        int i5 = i4 % 128;
        TuitionPaymentFragmentbindingInflater1 = i5;
        int i6 = i4 % 2;
        this.zzk = booleanPlaceAttributeValue;
        if (i6 != 0) {
            throw null;
        }
        int i7 = i5 + 17;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setGoodForChildren(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null goodForChildren");
        }
        int i5 = i3 + 65;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        this.zzap = booleanPlaceAttributeValue;
        if (i6 == 0) {
            int i7 = 98 / 0;
        }
        int i8 = i3 + 55;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setGoodForGroups(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 79;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null goodForGroups");
        }
        int i5 = i2 + 69;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        this.zzas = booleanPlaceAttributeValue;
        int i7 = i2 + 53;
        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
        int i8 = i7 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setGoodForWatchingSports(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 17;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null goodForWatchingSports");
        }
        this.zzat = booleanPlaceAttributeValue;
        int i4 = i2 + 39;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setLiveMusic(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 105;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null liveMusic");
        }
        int i4 = i2 + 105;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        this.zzak = booleanPlaceAttributeValue;
        if (i5 == 0) {
            return this;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setMenuForChildren(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 115;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null menuForChildren");
        }
        int i5 = i3 + 103;
        int i6 = i5 % 128;
        TuitionPaymentFragmentbindingInflater1 = i6;
        int i7 = i5 % 2;
        this.zzal = booleanPlaceAttributeValue;
        int i8 = i6 + 77;
        asBinder = i8 % 128;
        if (i8 % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setOutdoorSeating(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 113;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null outdoorSeating");
        }
        this.zzaj = booleanPlaceAttributeValue;
        int i5 = i2 + 119;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPureServiceAreaBusiness(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null pureServiceAreaBusiness");
        }
        int i2 = TuitionPaymentFragmentbindingInflater1 + 9;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.zzaw = booleanPlaceAttributeValue;
        int i5 = i3 + 29;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setReservable(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null reservable");
        }
        this.zzM = booleanPlaceAttributeValue;
        int i5 = i3 + 7;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setRestroom(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 27;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null restroom");
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.green(0) + 46400), 39 - TextUtils.lastIndexOf("", '0'), Color.argb(0, 0, 0, 0) + 19, 1513912262, false, "b", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - KeyEvent.keyCodeFromString("")), 58 - TextUtils.indexOf((CharSequence) "", '0', 0), 17 - MotionEvent.axisFromString(""), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 37836), (KeyEvent.getMaxKeyCode() >> 16) + 59, 18 - (ViewConfiguration.getPressedStateDuration() >> 16), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -344;
        long j3 = (j2 * 2221052830960940946L) + (j2 * 3298200666198845293L);
        long j4 = 345;
        long j5 = -1;
        long j6 = j5 ^ 2221052830960940946L;
        long j7 = j5 ^ 3298200666198845293L;
        long j8 = j6 | j7;
        long jNextInt = new Random().nextInt(1912970472);
        long j9 = j3 + (((j8 ^ j5) | ((j6 | jNextInt) ^ j5)) * j4) + ((((j6 | (jNextInt ^ j5)) ^ j5) | ((j7 | 2221052830960940946L) ^ j5)) * j4) + (j4 * (j5 ^ (j8 | jNextInt)));
        int i5 = 0;
        int i6 = i4;
        while (true) {
            int i7 = 0;
            while (i7 != 8) {
                int i8 = asBinder + 13;
                TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                if (i8 % 2 != 0) {
                    i6 = (((((int) (j >>> i7)) & 12605) * (i6 * 63)) * (i6 - 91)) % i6;
                    i7 += 51;
                } else {
                    i6 = (((((int) (j >> i7)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                    i7++;
                }
            }
            if (i5 != 0) {
                break;
            }
            i5++;
            j = j9;
        }
        if (i6 != i3) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - TextUtils.indexOf("", "", 0, 0)), 40 - View.resolveSize(0, 0), 19 - View.MeasureSpec.getMode(0), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            throw null;
        }
        this.zzar = booleanPlaceAttributeValue;
        int i9 = TuitionPaymentFragmentbindingInflater1 + 29;
        asBinder = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 77 / 0;
        }
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesBeer(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null servesBeer");
        }
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 19;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.zzP = booleanPlaceAttributeValue;
        int i5 = i2 + 79;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesBreakfast(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 57;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null servesBreakfast");
        }
        int i4 = i2 + 81;
        int i5 = i4 % 128;
        TuitionPaymentFragmentbindingInflater1 = i5;
        int i6 = i4 % 2;
        this.zzQ = booleanPlaceAttributeValue;
        if (i6 != 0) {
            int i7 = 12 / 0;
        }
        int i8 = i5 + 125;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesBrunch(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 25;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null servesBrunch");
        }
        int i5 = i2 + 93;
        int i6 = i5 % 128;
        asBinder = i6;
        int i7 = i5 % 2;
        this.zzR = booleanPlaceAttributeValue;
        int i8 = i6 + 99;
        TuitionPaymentFragmentbindingInflater1 = i8 % 128;
        if (i8 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesCocktails(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 75;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null servesCocktails");
        }
        int i5 = i3 + 125;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        this.zzam = booleanPlaceAttributeValue;
        if (i6 != 0) {
            int i7 = 91 / 0;
        }
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesCoffee(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null servesCoffee");
        }
        this.zzao = booleanPlaceAttributeValue;
        int i5 = i3 + 117;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesDessert(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 23;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null servesDessert");
        }
        this.zzan = booleanPlaceAttributeValue;
        int i5 = i2 + 111;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesDinner(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null servesDinner");
        }
        int i2 = asBinder;
        int i3 = i2 + 73;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.zzS = booleanPlaceAttributeValue;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 21;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesLunch(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 37;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null servesLunch");
        }
        int i5 = i3 + 79;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        this.zzT = booleanPlaceAttributeValue;
        if (i6 != 0) {
            int i7 = 67 / 0;
        }
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesVegetarianFood(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 1;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null servesVegetarianFood");
        }
        int i5 = i2 + 1;
        int i6 = i5 % 128;
        asBinder = i6;
        int i7 = i5 % 2;
        this.zzU = booleanPlaceAttributeValue;
        int i8 = i6 + 87;
        TuitionPaymentFragmentbindingInflater1 = i8 % 128;
        if (i8 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setServesWine(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 79;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null servesWine");
        }
        int i4 = i2 + 55;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        this.zzV = booleanPlaceAttributeValue;
        if (i5 == 0) {
            return this;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setTakeout(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 3;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null takeout");
        }
        int i4 = i2 + 103;
        int i5 = i4 % 128;
        TuitionPaymentFragmentbindingInflater1 = i5;
        int i6 = i4 % 2;
        this.zzW = booleanPlaceAttributeValue;
        int i7 = i5 + 85;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r5 = 18 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        throw new java.lang.NullPointerException("Null wheelchairAccessibleEntrance");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r4.zzae = r5;
        r1 = r1 + 43;
        com.google.android.libraries.places.api.model.zzaq.TuitionPaymentFragmentbindingInflater1 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if ((r1 % 2) == 0) goto L11;
     */
    @Override // com.google.android.libraries.places.api.model.Place.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.libraries.places.api.model.Place.Builder setWheelchairAccessibleEntrance(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.libraries.places.api.model.zzaq.asBinder
            int r2 = r1 + 25
            int r3 = r2 % 128
            com.google.android.libraries.places.api.model.zzaq.TuitionPaymentFragmentbindingInflater1 = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L15
            r2 = 14
            int r2 = r2 / 0
            if (r5 == 0) goto L27
            goto L17
        L15:
            if (r5 == 0) goto L27
        L17:
            r4.zzae = r5
            int r1 = r1 + 43
            int r5 = r1 % 128
            com.google.android.libraries.places.api.model.zzaq.TuitionPaymentFragmentbindingInflater1 = r5
            int r1 = r1 % r0
            if (r1 == 0) goto L26
            r5 = 18
            int r5 = r5 / 0
        L26:
            return r4
        L27:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "Null wheelchairAccessibleEntrance"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzaq.setWheelchairAccessibleEntrance(com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue):com.google.android.libraries.places.api.model.Place$Builder");
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    final Place zzb() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue8;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue9;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue10;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue11;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue12;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue13;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue14;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue15;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue16;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue17;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue18;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue19;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue20;
        int i = 2 % 2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue21 = this.zzh;
        if (booleanPlaceAttributeValue21 != null && (booleanPlaceAttributeValue = this.zzj) != null && (booleanPlaceAttributeValue2 = this.zzk) != null && (booleanPlaceAttributeValue3 = this.zzM) != null) {
            int i2 = asBinder + 31;
            int i3 = i2 % 128;
            TuitionPaymentFragmentbindingInflater1 = i3;
            int i4 = i2 % 2;
            Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue22 = this.zzP;
            if (booleanPlaceAttributeValue22 != null) {
                int i5 = i3 + 99;
                int i6 = i5 % 128;
                asBinder = i6;
                int i7 = i5 % 2;
                Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue23 = this.zzQ;
                if (booleanPlaceAttributeValue23 != null && (booleanPlaceAttributeValue4 = this.zzR) != null && (booleanPlaceAttributeValue5 = this.zzS) != null) {
                    int i8 = i6 + 95;
                    TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                    int i9 = i8 % 2;
                    Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue24 = this.zzT;
                    if (booleanPlaceAttributeValue24 != null && (booleanPlaceAttributeValue6 = this.zzU) != null && (booleanPlaceAttributeValue7 = this.zzV) != null) {
                        int i10 = i6 + 27;
                        TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                        if (i10 % 2 != 0) {
                            throw null;
                        }
                        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue25 = this.zzW;
                        if (booleanPlaceAttributeValue25 != null && (booleanPlaceAttributeValue8 = this.zzae) != null && (booleanPlaceAttributeValue9 = this.zzaj) != null && (booleanPlaceAttributeValue10 = this.zzak) != null && (booleanPlaceAttributeValue11 = this.zzal) != null && (booleanPlaceAttributeValue12 = this.zzam) != null && (booleanPlaceAttributeValue13 = this.zzan) != null && (booleanPlaceAttributeValue14 = this.zzao) != null && (booleanPlaceAttributeValue15 = this.zzap) != null && (booleanPlaceAttributeValue16 = this.zzaq) != null && (booleanPlaceAttributeValue17 = this.zzar) != null && (booleanPlaceAttributeValue18 = this.zzas) != null && (booleanPlaceAttributeValue19 = this.zzat) != null && (booleanPlaceAttributeValue20 = this.zzaw) != null) {
                            return new zzdk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, booleanPlaceAttributeValue21, this.zzi, booleanPlaceAttributeValue, booleanPlaceAttributeValue2, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzw, this.zzx, this.zzy, this.zzz, this.zzA, this.zzB, this.zzC, this.zzD, this.zzE, this.zzF, this.zzG, this.zzH, this.zzI, this.zzJ, this.zzK, this.zzL, booleanPlaceAttributeValue3, this.zzN, this.zzO, booleanPlaceAttributeValue22, booleanPlaceAttributeValue23, booleanPlaceAttributeValue4, booleanPlaceAttributeValue5, booleanPlaceAttributeValue24, booleanPlaceAttributeValue6, booleanPlaceAttributeValue7, booleanPlaceAttributeValue25, this.zzX, this.zzY, this.zzZ, this.zzaa, this.zzab, this.zzac, this.zzad, booleanPlaceAttributeValue8, this.zzaf, this.zzag, this.zzah, this.zzai, booleanPlaceAttributeValue9, booleanPlaceAttributeValue10, booleanPlaceAttributeValue11, booleanPlaceAttributeValue12, booleanPlaceAttributeValue13, booleanPlaceAttributeValue14, booleanPlaceAttributeValue15, booleanPlaceAttributeValue16, booleanPlaceAttributeValue17, booleanPlaceAttributeValue18, booleanPlaceAttributeValue19, this.zzau, this.zzav, booleanPlaceAttributeValue20);
                        }
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if (this.zzh == null) {
            int i11 = asBinder + 71;
            TuitionPaymentFragmentbindingInflater1 = i11 % 128;
            int i12 = i11 % 2;
            sb.append(" curbsidePickup");
        }
        if (this.zzj == null) {
            sb.append(" delivery");
        }
        if (this.zzk == null) {
            sb.append(" dineIn");
        }
        if (this.zzM == null) {
            sb.append(" reservable");
        }
        if (this.zzP == null) {
            sb.append(" servesBeer");
        }
        if (this.zzQ == null) {
            sb.append(" servesBreakfast");
        }
        if (this.zzR == null) {
            sb.append(" servesBrunch");
        }
        if (this.zzS == null) {
            sb.append(" servesDinner");
        }
        if (this.zzT == null) {
            sb.append(" servesLunch");
        }
        if (this.zzU == null) {
            sb.append(" servesVegetarianFood");
        }
        if (this.zzV == null) {
            int i13 = asBinder + 17;
            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
            if (i13 % 2 != 0) {
                sb.append(" servesWine");
                int i14 = 89 / 0;
            } else {
                sb.append(" servesWine");
            }
        }
        if (this.zzW == null) {
            sb.append(" takeout");
        }
        if (this.zzae == null) {
            sb.append(" wheelchairAccessibleEntrance");
        }
        if (this.zzaj == null) {
            sb.append(" outdoorSeating");
        }
        if (this.zzak == null) {
            sb.append(" liveMusic");
        }
        if (this.zzal == null) {
            int i15 = asBinder + 47;
            TuitionPaymentFragmentbindingInflater1 = i15 % 128;
            int i16 = i15 % 2;
            sb.append(" menuForChildren");
        }
        if (this.zzam == null) {
            sb.append(" servesCocktails");
        }
        if (this.zzan == null) {
            int i17 = TuitionPaymentFragmentbindingInflater1 + 33;
            asBinder = i17 % 128;
            if (i17 % 2 == 0) {
                sb.append(" servesDessert");
                int i18 = 13 / 0;
            } else {
                sb.append(" servesDessert");
            }
        }
        if (this.zzao == null) {
            int i19 = TuitionPaymentFragmentbindingInflater1 + 63;
            asBinder = i19 % 128;
            if (i19 % 2 == 0) {
                sb.append(" servesCoffee");
                int i20 = 11 / 0;
            } else {
                sb.append(" servesCoffee");
            }
        }
        if (this.zzap == null) {
            sb.append(" goodForChildren");
        }
        if (this.zzaq == null) {
            sb.append(" allowsDogs");
        }
        if (this.zzar == null) {
            int i21 = TuitionPaymentFragmentbindingInflater1 + 7;
            asBinder = i21 % 128;
            int i22 = i21 % 2;
            sb.append(" restroom");
        }
        if (this.zzas == null) {
            sb.append(" goodForGroups");
        }
        if (this.zzat == null) {
            sb.append(" goodForWatchingSports");
        }
        if (this.zzaw == null) {
            sb.append(" pureServiceAreaBusiness");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setInternationalPhoneNumber(String str) throws Throwable {
        int length;
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 876;
            int iIndexOf = 9 - TextUtils.indexOf((CharSequence) "", '0', 0);
            byte[] bArr = $$a;
            byte b2 = (byte) (-bArr[31]);
            byte b3 = bArr[24];
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 | 42), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iResolveOpacity, iIndexOf, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(null, null, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(null, null, 127 - KeyEvent.keyCodeFromString(""), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 876;
            int trimmedLength = 10 - TextUtils.getTrimmedLength("");
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr2[24], (byte) (-bArr2[26]), (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, tapTimeout, trimmedLength, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 876;
                int iAxisFromString = 9 - MotionEvent.axisFromString("");
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) (-bArr3[31]), (byte) (-bArr3[26]), (byte) (-bArr3[98]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(absoluteGravity, threadPriority, iAxisFromString, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i2 = ~(((int) Runtime.getRuntime().freeMemory()) | (-332609347));
            int i3 = (((-258459864) + (((-372919576) | i2) * (-220))) + ((i2 | 29438528) * 220)) - 808263585;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
        } else {
            if (str != null) {
                int i6 = asBinder + 105;
                TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                int i7 = i6 % 2;
                length = str.length();
            } else {
                length = 0;
            }
            int i8 = asBinder + 67;
            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr8 = {Integer.valueOf(length), 1512403283};
                byte[] bArr4 = $$d;
                byte b4 = bArr4[23];
                Object[] objArr9 = new Object[1];
                d(b4, bArr4[60], b4, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                byte b5 = bArr4[60];
                Object[] objArr10 = new Object[1];
                d(b5, bArr4[23], b5, objArr10);
                objArr = (Object[]) cls2.getMethod((String) objArr10[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                    int iIndexOf2 = TextUtils.indexOf("", "", 0) + 876;
                    int i10 = 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    byte[] bArr5 = $$a;
                    Object[] objArr11 = new Object[1];
                    a((byte) (-bArr5[31]), (byte) (-bArr5[26]), (byte) (-bArr5[98]), objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iIndexOf2, i10, 1324201839, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr12 = new Object[1];
                    c(null, null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(null, null, View.MeasureSpec.makeMeasureSpec(0, 0) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                        int iGreen = Color.green(0) + 876;
                        int maximumDrawingCacheSize = 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        byte[] bArr6 = $$a;
                        Object[] objArr14 = new Object[1];
                        a(bArr6[24], (byte) (-bArr6[26]), (byte) 52, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAxisFromString, iGreen, maximumDrawingCacheSize, 254769921, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                        int iLastIndexOf = 875 - TextUtils.lastIndexOf("", '0', 0);
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 11;
                        byte[] bArr7 = $$a;
                        byte b6 = (byte) (-bArr7[31]);
                        byte b7 = bArr7[24];
                        Object[] objArr15 = new Object[1];
                        a(b6, b7, (byte) (b7 | 42), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, iLastIndexOf, bitsPerPixel, -1199417970, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr == null) {
                throw null;
            }
            for (String str2 : strArr) {
                arrayList.add(str2);
            }
            throw null;
        }
        int i11 = asBinder + 39;
        TuitionPaymentFragmentbindingInflater1 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = ((int[]) objArr[1])[0];
        Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i14 = i13 + (((1668925080 + (((~((-52959457) | iIdentityHashCode)) | (~((-12649228) | iIdentityHashCode))) * 69)) + (((~(iIdentityHashCode | (-147261200))) | ((~((-187571429) | iIdentityHashCode)) | 134611972)) * (-69))) - 930323376);
        int i15 = (i14 << 13) ^ i14;
        int i16 = i15 ^ (i15 >>> 17);
        ((int[]) objArr16[1])[0] = i16 ^ (i16 << 5);
        this.zzA = str;
        return this;
    }

    private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = b;
        char c = '0';
        int i3 = -1;
        int i4 = 0;
        if (cArr3 != null) {
            int i5 = $10 + 37;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 67;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i4] = Integer.valueOf(cArr3[i6]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c2 = (char) (31340 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                            int i8 = 2995 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int iLastIndexOf = 16 - TextUtils.lastIndexOf("", c, i4);
                            byte b2 = (byte) i3;
                            byte b3 = (byte) (-b2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, i8, iLastIndexOf, 1182129903, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (-b4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31338), 2993 - TextUtils.indexOf((CharSequence) "", '0', 0), View.getDefaultSize(0, 0) + 17, 1182129903, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6++;
                }
                c = '0';
                i3 = -1;
                i4 = 0;
            }
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getScrollBarSize() >> 8)), 253 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
        int i9 = 33602;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i10 = $10 + 51;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - KeyEvent.keyCodeFromString("")), (ViewConfiguration.getTouchSlop() >> 8) + 3085, 26 - View.resolveSize(0, 0), -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            int i12 = $10 + 113;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            return;
        }
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i14 = $10 + 111;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (b8 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (View.getDefaultSize(0, 0) + i9), 3084 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 26 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -2146875848, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                i9 = 33602;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i16 = 0;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16;
            if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i17 = $11 + 25;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            i16 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        }
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPhotoMetadatas(List<PhotoMetadata> list) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 46399), 41 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 18, 1513912262, false, "b", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 37836), TextUtils.getTrimmedLength("") + 59, 'B' - AndroidCharacter.getMirror('0'), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - Color.red(0)), (ViewConfiguration.getEdgeSlop() >> 16) + 59, 18 - KeyEvent.getDeadChar(0, 0), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -1;
        long j3 = j2 ^ 2391624642881810624L;
        long jNextInt = (((long) new Random().nextInt(1705067937)) | 2391624642881810624L) ^ j2;
        long j4 = (((long) (-391)) * 3127628854277975615L) + (((long) (-195)) * 2391624642881810624L) + (((long) (-196)) * (((j3 | 3127628854277975615L) ^ j2) | jNextInt)) + (((long) 392) * 3132202963226492671L) + (((long) 196) * ((j2 ^ ((3127628854277975615L ^ j2) | j3)) | jNextInt));
        int i7 = asBinder + 97;
        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
        int i8 = i7 % 2;
        long j5 = j;
        int i9 = 0;
        while (true) {
            for (int i10 = 0; i10 != 8; i10++) {
                i6 = (((((int) (j5 >> i10)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
            }
            if (i9 != 0) {
                break;
            }
            i9++;
            j5 = j4;
        }
        if (i6 != i4) {
            int i11 = TuitionPaymentFragmentbindingInflater1 + 97;
            asBinder = i11 % 128;
            int i12 = i11 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 46400), 40 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            Toast.makeText((Context) null, i5 / (((i5 - 1) * i5) % 2), 0).show();
        }
        this.zzC = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPrimaryType(String str) throws Throwable {
        int length;
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cKeyCodeFromString = (char) (29944 - KeyEvent.keyCodeFromString(""));
            int keyRepeatTimeout = 1755 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 23;
            byte[] bArr = $$a;
            byte b2 = (byte) (-bArr[17]);
            byte b3 = (byte) (-bArr[1]);
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 - 2), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString, keyRepeatTimeout, offsetBefore, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(null, null, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(null, null, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRed = (char) (29944 - Color.red(0));
            int i2 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 23;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a((byte) (-bArr2[17]), bArr2[57], bArr2[24], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed, i2, offsetBefore2, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = TuitionPaymentFragmentbindingInflater1 + 119;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0'));
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1755;
                int mirror = AndroidCharacter.getMirror('0') - 25;
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) (-bArr3[17]), (byte) ($$b | 40), bArr3[24], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, maximumFlingVelocity, mirror, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = (-120790168) + (((~((-463719491) | iIdentityHashCode)) | 285229122) * 345) + (((~((-463719491) | (~iIdentityHashCode))) | (-536346187)) * 345) + ((~(iIdentityHashCode | (-285229123))) * 345) + 419332172;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[3])[0] = i7 ^ (i7 << 5);
        } else {
            if (str != null) {
                length = str.length();
            } else {
                int i8 = asBinder + 121;
                TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 3 % 4;
                }
                length = 0;
            }
            try {
                Object[] objArr8 = {1376476910};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 42050), ExpandableListView.getPackedPositionGroup(0L) + 1726, TextUtils.lastIndexOf("", '0', 0) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = DecorContentParent.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(length, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr8), 419332172);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cRgb = (char) ((-16747272) - Color.rgb(0, 0, 0));
                    int iAlpha = 1755 - Color.alpha(0);
                    int gidForName = Process.getGidForName("") + 24;
                    byte[] bArr4 = $$a;
                    Object[] objArr9 = new Object[1];
                    a((byte) (-bArr4[17]), (byte) ($$b | 40), bArr4[24], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, iAlpha, gidForName, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr10 = new Object[1];
                    c(null, null, View.resolveSizeAndState(0, 0, 0) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(null, null, Color.rgb(0, 0, 0) + 16777343, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr11);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char maximumFlingVelocity2 = (char) (29944 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        int touchSlop = 1755 - (ViewConfiguration.getTouchSlop() >> 8);
                        int mirror2 = AndroidCharacter.getMirror('0') - 25;
                        byte[] bArr5 = $$a;
                        Object[] objArr12 = new Object[1];
                        a((byte) (-bArr5[17]), bArr5[57], bArr5[24], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumFlingVelocity2, touchSlop, mirror2, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char size = (char) (29944 - View.MeasureSpec.getSize(0));
                        int size2 = View.MeasureSpec.getSize(0) + 1755;
                        int offsetBefore3 = TextUtils.getOffsetBefore("", 0) + 23;
                        byte[] bArr6 = $$a;
                        byte b4 = (byte) (-bArr6[17]);
                        byte b5 = (byte) (-bArr6[1]);
                        Object[] objArr13 = new Object[1];
                        a(b4, b5, (byte) (b5 - 2), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(size, size2, offsetBefore3, 986134021, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    objArr = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i10 = ((int[]) objArr[1])[0];
        int i11 = ((int[]) objArr[0])[0];
        if (i11 != i10) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i12 = TuitionPaymentFragmentbindingInflater1 + 57;
                asBinder = i12 % 128;
                int i13 = i12 % 2;
                for (String str2 : strArr) {
                    arrayList.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i11));
        }
        int i14 = ((int[]) objArr[3])[0];
        Object[] objArr14 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
        int iNextInt = new Random().nextInt();
        int i15 = i14 + ((((~((-69433093) | iNextInt)) | 69427200) * (-283)) - 1614336455) + ((~(iNextInt | (-5893))) * 283);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr14[3])[0] = i17 ^ (i17 << 5);
        int i18 = asBinder + 85;
        TuitionPaymentFragmentbindingInflater1 = i18 % 128;
        int i19 = i18 % 2;
        this.zzI = str;
        if (i19 != 0) {
            int i20 = 18 / 0;
        }
        return this;
    }

    zzaq() {
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final AccessibilityOptions getAccessibilityOptions() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 49;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        AccessibilityOptions accessibilityOptions = this.zzaf;
        int i5 = i3 + 5;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return accessibilityOptions;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getAddress() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 79;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zza;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final AddressComponents getAddressComponents() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 25;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        AddressComponents addressComponents = this.zze;
        int i5 = i2 + 1;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
        return addressComponents;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getAdrFormatAddress() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 125;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.zzd;
            int i4 = 28 / 0;
        } else {
            str = this.zzd;
        }
        int i5 = i2 + 91;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final List<String> getAttributions() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        List<String> list = this.zzf;
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        return list;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.BusinessStatus getBusinessStatus() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 39;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Place.BusinessStatus businessStatus = this.zzg;
        int i5 = i2 + 43;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return businessStatus;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final OpeningHours getCurrentOpeningHours() {
        OpeningHours openingHours;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 103;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            openingHours = this.zzi;
            int i4 = 34 / 0;
        } else {
            openingHours = this.zzi;
        }
        int i5 = i2 + 111;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return openingHours;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final List<OpeningHours> getCurrentSecondaryOpeningHours() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 89;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        List<OpeningHours> list = this.zzO;
        int i5 = i3 + 105;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getDisplayName() {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.zzu;
        int i5 = i3 + 15;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getDisplayNameLanguageCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 41;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.zzw;
        int i4 = i3 + 57;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return str;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getEditorialSummary() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.zzl;
        int i5 = i3 + 73;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return str;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getEditorialSummaryLanguageCode() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 89;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zzm;
        int i5 = i2 + 77;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final EVChargeOptions getEvChargeOptions() {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        EVChargeOptions eVChargeOptions = this.zzai;
        int i4 = i3 + 111;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return eVChargeOptions;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getFormattedAddress() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 113;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zzb;
        int i5 = i2 + 61;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final FuelOptions getFuelOptions() {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzav;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Uri getGoogleMapsUri() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Uri uri = this.zzad;
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        return uri;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Integer getIconBackgroundColor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 73;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.zzn;
        int i5 = i2 + 93;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getIconMaskUrl() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 91;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zzp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getIconUrl() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 93;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.zzo;
        int i4 = i2 + 61;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getId() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 23;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zzq;
        int i5 = i2 + 75;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getInternationalPhoneNumber() {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.zzA;
        int i5 = i3 + 101;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final LatLng getLatLng() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 119;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        LatLng latLng = this.zzr;
        int i5 = i2 + 63;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return latLng;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final LatLng getLocation() {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        LatLng latLng = this.zzs;
        int i5 = i3 + 21;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return latLng;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getName() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 25;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zzt;
        int i5 = i2 + 103;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getNameLanguageCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 79;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.zzv;
        int i5 = i3 + 101;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getNationalPhoneNumber() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.zzB;
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        return str;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final OpeningHours getOpeningHours() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 107;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        OpeningHours openingHours = this.zzy;
        int i5 = i2 + 97;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return openingHours;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final ParkingOptions getParkingOptions() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 113;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        ParkingOptions parkingOptions = this.zzag;
        int i5 = i3 + 59;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return parkingOptions;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final PaymentOptions getPaymentOptions() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 123;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zzah;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getPhoneNumber() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 15;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zzz;
        int i5 = i2 + 25;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final List<PhotoMetadata> getPhotoMetadatas() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 61;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        List<PhotoMetadata> list = this.zzC;
        int i5 = i2 + 71;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 61 / 0;
        }
        return list;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final List<String> getPlaceTypes() {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        List<String> list = this.zzE;
        int i5 = i3 + 125;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final PlusCode getPlusCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 73;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        PlusCode plusCode = this.zzF;
        int i5 = i3 + 1;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return plusCode;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Integer getPriceLevel() {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        Integer num = this.zzG;
        int i5 = i3 + 125;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 29 / 0;
        }
        return num;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getPrimaryType() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 59;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zzI;
        int i5 = i2 + 85;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getPrimaryTypeDisplayName() {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.zzJ;
        int i5 = i3 + 69;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getPrimaryTypeDisplayNameLanguageCode() {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzK;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Double getRating() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 67;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        Double d = this.zzL;
        int i5 = i3 + 39;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return d;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getResourceName() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 23;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zzx;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final List<Review> getReviews() {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        List<Review> list = this.zzD;
        int i5 = i3 + 31;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return list;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final List<OpeningHours> getSecondaryOpeningHours() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 85;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        List<OpeningHours> list = this.zzN;
        int i5 = i2 + 61;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final String getShortFormattedAddress() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 57;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zzc;
        int i5 = i2 + 125;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final List<SubDestination> getSubDestinations() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 99;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        List<SubDestination> list = this.zzau;
        int i5 = i2 + 101;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 46 / 0;
        }
        return list;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final List<Place.Type> getTypes() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 11;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zzX;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Integer getUserRatingCount() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 15;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.zzZ;
        int i5 = i2 + 63;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Integer getUserRatingsTotal() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 13;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.zzY;
        int i5 = i2 + 65;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Integer getUtcOffsetMinutes() {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzaa;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final LatLngBounds getViewport() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        LatLngBounds latLngBounds = this.zzab;
        int i5 = i3 + 27;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return latLngBounds;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Uri getWebsiteUri() {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        Uri uri = this.zzac;
        int i5 = i3 + 51;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 55 / 0;
        }
        return uri;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setAccessibilityOptions(AccessibilityOptions accessibilityOptions) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 115;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.zzaf = accessibilityOptions;
        int i5 = i2 + 125;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setAddress(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.zza = str;
        int i5 = i3 + 5;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setAddressComponents(AddressComponents addressComponents) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 73;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.zze = addressComponents;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 123;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setAdrFormatAddress(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 45;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.zzd = str;
        int i5 = i2 + 23;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setAttributions(List<String> list) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 95;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.zzf = list;
        int i5 = i2 + 37;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setBusinessStatus(Place.BusinessStatus businessStatus) {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.zzg = businessStatus;
        if (i4 != 0) {
            int i5 = 37 / 0;
        }
        int i6 = i3 + 69;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setCurrentOpeningHours(OpeningHours openingHours) {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.zzi = openingHours;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 11;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setCurrentSecondaryOpeningHours(List<OpeningHours> list) {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zzO = list;
        if (i3 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setDisplayName(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.zzu = str;
        int i5 = i3 + 69;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setDisplayNameLanguageCode(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 101;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.zzw = str;
        if (i4 == 0) {
            int i5 = 34 / 0;
        }
        int i6 = i2 + 61;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setEditorialSummary(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 81;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.zzl = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 69;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setEditorialSummaryLanguageCode(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 93;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.zzm = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 19;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setEvChargeOptions(EVChargeOptions eVChargeOptions) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 115;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.zzai = eVChargeOptions;
        int i5 = i2 + 123;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setFormattedAddress(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.zzb = str;
        int i5 = i3 + 77;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setFuelOptions(FuelOptions fuelOptions) {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.zzav = fuelOptions;
        if (i4 != 0) {
            int i5 = 86 / 0;
        }
        int i6 = i3 + 65;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 62 / 0;
        }
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setGoogleMapsUri(Uri uri) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 93;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.zzad = uri;
        int i5 = i3 + 121;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setIconBackgroundColor(Integer num) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 71;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.zzn = num;
        int i5 = i3 + 87;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setIconMaskUrl(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.zzp = str;
        int i5 = i3 + 25;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setIconUrl(String str) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 15;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.zzo = str;
        if (i4 != 0) {
            int i5 = 98 / 0;
        }
        int i6 = i2 + 123;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setId(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zzq = str;
        if (i3 == 0) {
            return this;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setLatLng(LatLng latLng) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 121;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.zzr = latLng;
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setLocation(LatLng latLng) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 35;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.zzs = latLng;
        int i5 = i2 + 17;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setName(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.zzt = str;
        int i5 = i3 + 23;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setNameLanguageCode(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.zzv = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 103;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setNationalPhoneNumber(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 19;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.zzB = str;
        int i5 = i3 + 65;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setOpeningHours(OpeningHours openingHours) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.zzy = openingHours;
        if (i3 != 0) {
            return this;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setParkingOptions(ParkingOptions parkingOptions) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.zzag = parkingOptions;
        if (i3 != 0) {
            return this;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPaymentOptions(PaymentOptions paymentOptions) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 5;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.zzah = paymentOptions;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 105;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPhoneNumber(String str) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 47;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.zzz = str;
        int i5 = i2 + 35;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPlaceTypes(List<String> list) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 73;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.zzE = list;
        int i5 = i2 + 79;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPlusCode(PlusCode plusCode) {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.zzF = plusCode;
        int i5 = i3 + 85;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPriceLevel(Integer num) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 113;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.zzG = num;
        int i5 = i3 + 53;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPrimaryTypeDisplayName(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 73;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.zzJ = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 73;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPrimaryTypeDisplayNameLanguageCode(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 125;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.zzK = str;
        int i5 = i2 + 91;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setRating(Double d) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 77;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.zzL = d;
        int i5 = i2 + 115;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setResourceName(String str) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 77;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.zzx = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 81;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setReviews(List<Review> list) {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zzD = list;
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setSecondaryOpeningHours(List<OpeningHours> list) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 27;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.zzN = list;
        int i5 = i3 + 23;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setShortFormattedAddress(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.zzc = str;
        int i5 = i3 + 15;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setSubDestinations(List<SubDestination> list) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 45;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.zzau = list;
        int i5 = i3 + 13;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setTypes(List<Place.Type> list) {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.zzX = list;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 125;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setUserRatingCount(Integer num) {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.zzZ = num;
        int i5 = i3 + 63;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setUserRatingsTotal(Integer num) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 5;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.zzY = num;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 1;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setUtcOffsetMinutes(Integer num) {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zzaa = num;
        if (i3 == 0) {
            return this;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setViewport(LatLngBounds latLngBounds) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 21;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.zzab = latLngBounds;
        int i5 = i3 + 45;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setWebsiteUri(Uri uri) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.zzac = uri;
        int i5 = i3 + 83;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 64 / 0;
        }
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder zza(zzey zzeyVar) {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zzH = zzeyVar;
        if (i3 == 0) {
            return this;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, byte r8) {
        /*
            byte[] r0 = com.google.android.libraries.places.api.model.zzaq.$$c
            int r8 = r8 * 4
            int r1 = r8 + 1
            int r6 = r6 + 4
            int r7 = r7 + 67
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r6
            goto L28
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L28:
            int r4 = -r4
            int r6 = r6 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzaq.$$g(short, int, byte):java.lang.String");
    }
}
