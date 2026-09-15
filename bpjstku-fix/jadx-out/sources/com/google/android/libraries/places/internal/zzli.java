package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import com.google.common.collect.ImmutableList;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
final class zzli {
    private zza[] addressComponents;
    private String businessStatus;
    private Boolean curbsidePickup;
    private zzd currentOpeningHours;
    private Boolean delivery;
    private Boolean dineIn;
    private zzb editorialSummary;
    private String formattedAddress;
    private zzc geometry;
    private String icon;
    private String iconBackgroundColor;
    private String iconMaskBaseUri;
    private String internationalPhoneNumber;
    private String name;
    private zzd openingHours;
    private zze[] photos;
    private String placeId;
    private zzf plusCode;
    private Integer priceLevel;
    private Double rating;
    private Boolean reservable;
    private zzd[] secondaryOpeningHours;
    private Boolean servesBeer;
    private Boolean servesBreakfast;
    private Boolean servesBrunch;
    private Boolean servesDinner;
    private Boolean servesLunch;
    private Boolean servesVegetarianFood;
    private Boolean servesWine;
    private Boolean takeout;
    private String[] types;
    private Integer userRatingsTotal;
    private Integer utcOffset;
    private String website;
    private Boolean wheelchairAccessibleEntrance;
    private static final byte[] $$c = {46, 47, -18, 64};
    private static final int $$f = 132;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {51, -99, -8, -59, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 53, 0, 6, -16, -6, -4, 15, -17, -58, 65, -16, 5, -1, 2, -18, -5, 9, -4, -11, 0, -5, -60, 18, 41, -4, -11, 0, -5, -21, 24, -15, -6, 16, -18, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -68, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 60, -11, -7, 15, -1, -6, -16, 5, -11, 6, 3, -73, 73, -3, -16, 1, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -69};
    private static final int $$e = 76;
    private static final byte[] $$a = {93, -77, 2, Base64.padSymbol, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 49;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int b = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {20958, 62343, 5495, 46799, 55432, 31352, 40927, 8651, 17248, 58570, 1741, 43102, 52686, 28562, 45439, 53968, 29874, 38474, 15327, 23986, 65380, 218, 28319, 52416, 10807, 35208, 59345, 17713, 41114, 7922, 31791, 56221, 14794, 38716, 62107, 20681, 36395, 45565, 5028, 62804, 22252, 14507, 39515, 32764, 49640, 41805, 1258, 59056, 18432, 11733, 36769, 20828, 13055, 38026, 30275, 56292, 48519, 8048, 57594, 17034, 9283, 35309, 27550, 45567, 5055, 62786, 22252, 14497, 39516, 32748, 49543, 41820, 1258, 59052, 18503, 11767, 36771, 20828, 13055, 38035, 30276, 63188, 21641, 45668, 4573, 32712, 56700, 14555, 34442, 58473, 17302, 41393, 3957, 27333, 51348, 5743, 30169, 45557, 5038, 62805, 22256, 14512, 39515, 32748, 49599, 41828, 1275, 59059, 18502, 11735, 36781, 20812, 13043};
    private static long TuitionPaymentFragmentbindingInflater1 = -6694851029195615286L;

    class zza {
        private String longName;
        private String shortName;
        private String[] types;

        final ImmutableList zzc() {
            String[] strArr = this.types;
            return strArr != null ? ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object[]) strArr) : ImmutableList.asInterface();
        }

        zza() {
        }

        final String zza() {
            return this.longName;
        }

        final String zzb() {
            return this.shortName;
        }
    }

    class zzb {
        private String language;
        private String overview;

        zzb() {
        }

        final String zza() {
            return this.language;
        }

        final String zzb() {
            return this.overview;
        }
    }

    class zzc {
        private zza location;
        private zzb viewport;

        class zza {
            private Double lat;
            private Double lng;

            zza() {
            }

            final Double zza() {
                return this.lat;
            }

            final Double zzb() {
                return this.lng;
            }
        }

        class zzb {
            private zza northeast;
            private zza southwest;

            zzb() {
            }

            final zza zza() {
                return this.northeast;
            }

            final zza zzb() {
                return this.southwest;
            }
        }

        zzc() {
        }

        final zza zza() {
            return this.location;
        }

        final zzb zzb() {
            return this.viewport;
        }
    }

    class zzd {
        private zza[] periods;
        private zzb[] specialDays;
        private String type;
        private String[] weekdayText;

        class zza {
            private zzc close;
            private zzc open;

            zza() {
            }

            final zzc zza() {
                return this.close;
            }

            final zzc zzb() {
                return this.open;
            }
        }

        class zzb {
            private String date;
            private Boolean exceptionalHours;

            zzb() {
            }

            final String zza() {
                return this.date;
            }

            final Boolean zzb() {
                return this.exceptionalHours;
            }
        }

        class zzc {
            private String date;
            private Integer day;
            private String time;
            private Boolean truncated;

            zzc() {
            }

            final Integer zza() {
                return this.day;
            }

            final String zzb() {
                return this.time;
            }

            final String zzc() {
                return this.date;
            }

            final Boolean zzd() {
                return this.truncated;
            }
        }

        final ImmutableList zza() {
            zza[] zzaVarArr = this.periods;
            return zzaVarArr != null ? ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object[]) zzaVarArr) : ImmutableList.asInterface();
        }

        final ImmutableList zzb() {
            String[] strArr = this.weekdayText;
            return strArr != null ? ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object[]) strArr) : ImmutableList.asInterface();
        }

        final ImmutableList zzd() {
            zzb[] zzbVarArr = this.specialDays;
            return zzbVarArr != null ? ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object[]) zzbVarArr) : ImmutableList.asInterface();
        }

        zzd() {
        }

        final String zzc() {
            return this.type;
        }
    }

    class zze {
        private Integer height;
        private String[] htmlAttributions;
        private String photoReference;
        private Integer width;

        final ImmutableList zzd() {
            String[] strArr = this.htmlAttributions;
            return strArr != null ? ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object[]) strArr) : ImmutableList.asInterface();
        }

        zze() {
        }

        final Integer zza() {
            return this.height;
        }

        final Integer zzb() {
            return this.width;
        }

        final String zzc() {
            return this.photoReference;
        }
    }

    class zzf {
        private String compoundCode;
        private String globalCode;

        zzf() {
        }

        final String zza() {
            return this.compoundCode;
        }

        final String zzb() {
            return this.globalCode;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = 53 - r8
            int r6 = r6 * 52
            int r6 = 56 - r6
            byte[] r1 = com.google.android.libraries.places.internal.zzli.$$a
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2f
        L17:
            r3 = r2
        L18:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2f:
            int r6 = r6 + 1
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-10)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzli.a(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzli.$$d
            int r1 = r5 + 45
            int r7 = 147 - r7
            int r6 = r6 * 15
            int r6 = r6 + 84
            byte[] r1 = new byte[r1]
            int r5 = r5 + 44
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r3 = r2
            r6 = r5
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
        L27:
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + 3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzli.d(int, short, int, java.lang.Object[]):void");
    }

    final ImmutableList zzC() {
        int i = 2 % 2;
        int i2 = b + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        String[] strArr = this.types;
        if (strArr != null) {
            return ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object[]) strArr);
        }
        ImmutableList immutableListAsInterface = ImmutableList.asInterface();
        int i3 = b + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        return immutableListAsInterface;
    }

    final ImmutableList zza() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        zza[] zzaVarArr = this.addressComponents;
        if (zzaVarArr == null) {
            return ImmutableList.asInterface();
        }
        int i5 = i2 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object[]) zzaVarArr);
        }
        ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object[]) zzaVarArr);
        throw null;
    }

    final ImmutableList zzo() {
        int i = 2 % 2;
        int i2 = b + 93;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        zze[] zzeVarArr = this.photos;
        if (zzeVarArr == null) {
            return ImmutableList.asInterface();
        }
        int i4 = i3 + 73;
        b = i4 % 128;
        int i5 = i4 % 2;
        ImmutableList immutableListTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object[]) zzeVarArr);
        if (i5 == 0) {
            int i6 = 12 / 0;
        }
        return immutableListTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    final ImmutableList zzu() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        zzd[] zzdVarArr = this.secondaryOpeningHours;
        if (zzdVarArr == null) {
            return ImmutableList.asInterface();
        }
        ImmutableList immutableListTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object[]) zzdVarArr);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return immutableListTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x021b  */
    /* JADX WARN: Code duplicated, block: B:43:0x021c  */
    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        char c2;
        long j;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            c2 = '0';
            j = 0;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i4 = $11 + 51;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 2;
                    byte b3 = (byte) (b2 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Drawable.resolveOpacity(0, 0), 2187 - (ViewConfiguration.getScrollBarSize() >> 8), ExpandableListView.getPackedPositionChild(0L) + 41, 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 33018), 3011 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 26 - View.getDefaultSize(0, 0), 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3376, 17 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -968507904, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $11 + 89;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 1;
                    byte b9 = (byte) (b8 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36504 - TextUtils.indexOf("", c2, 0, 0)), 3376 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 16 - MotionEvent.axisFromString(""), -968507904, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                int i8 = 97 / 0;
                c2 = '0';
            } else {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) 1;
                    byte b11 = (byte) (b10 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 36506), 3376 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -968507904, false, $$g(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                c2 = '0';
                j = 0;
            }
        }
        objArr[0] = new String(cArr);
        int i9 = $10 + 9;
        $11 = i9 % 128;
        int i10 = i9 % 2;
    }

    final String zzm() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        String str = this.name;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cBlue = (char) (31533 - Color.blue(0));
            int iMyPid = (Process.myPid() >> 22) + 921;
            int iCombineMeasuredStates = 28 - View.combineMeasuredStates(0, 0);
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            a(b2, b2, (byte) ($$b + 3), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, iMyPid, iCombineMeasuredStates, -1048449946, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c((-1) - MotionEvent.axisFromString(""), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 57379), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(21 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15, (char) (57190 - (KeyEvent.getMaxKeyCode() >> 16)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMyTid = (char) (31533 - (Process.myTid() >> 22));
            int i2 = 921 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int iAlpha = Color.alpha(0) + 28;
            byte[] bArr = $$a;
            byte b3 = bArr[7];
            byte b4 = bArr[80];
            Object[] objArr5 = new Object[1];
            a(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, i2, iAlpha, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 31533);
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 921;
                int edgeSlop2 = 28 - (ViewConfiguration.getEdgeSlop() >> 16);
                byte[] bArr2 = $$a;
                byte b5 = bArr2[80];
                Object[] objArr6 = new Object[1];
                a(b5, b5, (byte) (-bArr2[33]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(touchSlop, edgeSlop, edgeSlop2, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = (-1188430332) + ((~((~iIdentityHashCode) | (-77594898))) * 433) + (((~((-1394452203) | iIdentityHashCode)) | (-379627442)) * (-433)) + (((~(iIdentityHashCode | (-379627442))) | (-1472047100)) * 433) + 458984888;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[0])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c((Process.myPid() >> 22) + 37, 25 - Process.getGidForName(""), (char) (AndroidCharacter.getMirror('0') - '0'), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(63 - ((Process.getThreadPriority(0) + 20) >> 6), (-16777198) - Color.rgb(0, 0, 0), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c((ViewConfiguration.getEdgeSlop() >> 16) + 81, View.combineMeasuredStates(0, 0) + 16, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 18209), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(97 - ((Process.getThreadPriority(0) + 20) >> 6), Process.getGidForName("") + 17, (char) ((-1) - Process.getGidForName("")), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 458984888};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[15];
                byte b7 = bArr3[146];
                Object[] objArr13 = new Object[1];
                d(b6, b7, (short) (b7 | 142), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                d(bArr3[50], bArr3[15], (short) (-bArr3[1]), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 31534);
                    int iBlue = Color.blue(0) + 921;
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 28;
                    byte[] bArr4 = $$a;
                    byte b8 = bArr4[80];
                    Object[] objArr16 = new Object[1];
                    a(b8, b8, (byte) (-bArr4[33]), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iBlue, iKeyCodeFromString, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(ViewConfiguration.getMinimumFlingVelocity() >> 16, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, (char) (57379 - KeyEvent.normalizeMetaState(0)), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(22 - Color.argb(0, 0, 0, 0), 15 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 57190), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 31533);
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 922;
                        int absoluteGravity = 28 - Gravity.getAbsoluteGravity(0, 0);
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[7];
                        byte b10 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        a(b9, b10, b10, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maxKeyCode, bitsPerPixel, absoluteGravity, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cRed = (char) (Color.red(0) + 31533);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 921;
                        int modifierMetaStateMask = 27 - ((byte) KeyEvent.getModifierMetaStateMask());
                        byte b11 = $$a[7];
                        Object[] objArr20 = new Object[1];
                        a(b11, b11, (byte) ($$b + 3), objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed, iResolveSizeAndState, modifierMetaStateMask, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        int i6 = ((int[]) objArr[1])[0];
        int i7 = ((int[]) objArr[3])[0];
        if (i7 == i6) {
            int i8 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i9 = ~((-268471363) | iIdentityHashCode2);
            int i10 = i8 + (-1340644929) + ((27328769 | i9) * (-476)) + (i9 * 952) + ((~((~iIdentityHashCode2) | (-268471363))) * 476);
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr21[0])[0] = i12 ^ (i12 << 5);
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
            b = i13 % 128;
            if (i13 % 2 != 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr != null) {
            int i14 = 0;
            while (i14 < strArr.length) {
                arrayList.add(strArr[i14]);
                i14++;
                int i15 = b + 93;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                int i16 = i15 % 2;
            }
        }
        int[] iArr = new int[i7];
        int i17 = i7 - 1;
        iArr[i17] = 1;
        Toast.makeText((Context) null, iArr[((i7 * i17) % 2) - 1], 1).show();
        int i18 = ((int[]) objArr[0])[0];
        Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i19 = i18 + 198852327 + (((~((~startUptimeMillis) | (-429588307))) | 1344491337) * (-235)) + (((~((-429588307) | startUptimeMillis)) | 1344491337) * (-470)) + (((~(startUptimeMillis | (-161001491))) | 1075904521) * 235);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr22[0])[0] = i21 ^ (i21 << 5);
        return str;
    }

    final Integer zzr() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Integer num = this.priceLevel;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatDelay = (char) (31533 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
            int iCombineMeasuredStates = 921 - View.combineMeasuredStates(0, 0);
            int iIndexOf = 28 - TextUtils.indexOf("", "");
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            a(b2, b2, (byte) ($$b + 3), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, iCombineMeasuredStates, iIndexOf, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(View.MeasureSpec.getSize(0), (ViewConfiguration.getEdgeSlop() >> 16) + 22, (char) (TextUtils.getTrimmedLength("") + 57379), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22, 15 - View.MeasureSpec.getMode(0), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 57190), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31533);
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 921;
            int iRed = 28 - Color.red(0);
            byte[] bArr = $$a;
            byte b3 = bArr[7];
            byte b4 = bArr[80];
            Object[] objArr5 = new Object[1];
            a(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iKeyCodeFromString, iRed, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 31534);
                int i2 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 921;
                int i3 = 28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr2 = $$a;
                byte b5 = bArr2[80];
                Object[] objArr6 = new Object[1];
                a(b5, b5, (byte) (-bArr2[33]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAxisFromString, i2, i3, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iNextInt = new Random().nextInt(1132154562);
            int i4 = ~((-704664353) | iNextInt);
            int i5 = ~iNextInt;
            int i6 = (((1708380563 + ((i4 | (~((-19726353) | i5))) * 920)) + (((~((-1049688940) | i5)) | 704664352) * 920)) + (((~(iNextInt | (-19726353))) | ((~((-704664353) | i5)) | (~((-345024588) | iNextInt)))) * 920)) - 2113027867;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(ExpandableListView.getPackedPositionChild(0L) + 38, 26 - KeyEvent.keyCodeFromString(""), (char) Color.blue(0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(TextUtils.indexOf((CharSequence) "", '0') + 64, 18 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
                b = i9 % 128;
                int i10 = i9 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(81 - Gravity.getAbsoluteGravity(0, 0), 16 - KeyEvent.getDeadChar(0, 0), (char) (18211 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 96, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15, (char) View.resolveSize(0, 0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i11 = b + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -2113027867};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[52];
                byte b7 = bArr3[146];
                Object[] objArr13 = new Object[1];
                d(b6, b7, (short) (b7 | 46), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = bArr3[50];
                byte b9 = bArr3[15];
                Object[] objArr14 = new Object[1];
                d(b8, b9, b9, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char tapTimeout = (char) (31533 - (ViewConfiguration.getTapTimeout() >> 16));
                    int i13 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 920;
                    int packedPositionGroup = 28 - ExpandableListView.getPackedPositionGroup(0L);
                    byte[] bArr4 = $$a;
                    byte b10 = bArr4[80];
                    Object[] objArr15 = new Object[1];
                    a(b10, b10, (byte) (-bArr4[33]), objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(tapTimeout, i13, packedPositionGroup, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    c(ViewConfiguration.getWindowTouchSlop() >> 8, 22 - TextUtils.getTrimmedLength(""), (char) (KeyEvent.keyCodeFromString("") + 57379), objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(TextUtils.indexOf((CharSequence) "", '0', 0) + 23, 15 - Color.green(0), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 57190), objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 31534);
                        int iIndexOf2 = 920 - TextUtils.indexOf((CharSequence) "", '0');
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 29;
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[7];
                        byte b12 = bArr5[80];
                        Object[] objArr18 = new Object[1];
                        a(b11, b12, b12, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, iIndexOf2, modifierMetaStateMask, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) (31533 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        int iIndexOf3 = 921 - TextUtils.indexOf("", "");
                        int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 28;
                        byte b13 = $$a[7];
                        Object[] objArr19 = new Object[1];
                        a(b13, b13, (byte) ($$b + 3), objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iIndexOf3, iCombineMeasuredStates2, -1048449946, false, (String) objArr19[0], null);
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 != i14) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i15));
        }
        int i16 = ((int[]) objArr[0])[0];
        Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i17 = ~elapsedCpuTime;
        int i18 = ~(385666101 | i17);
        int i19 = i16 + (-1529280797) + ((1073807938 | i18) * (-712)) + (((~(elapsedCpuTime | 1459474039)) | (~(i17 | (-1073807939)))) * (-712)) + (((-1388413543) | i18) * 712);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr20[0])[0] = i21 ^ (i21 << 5);
        return num;
    }

    zzli() {
    }

    final Boolean zzA() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.servesWine;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final Boolean zzB() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 63;
        b = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.takeout;
        int i5 = i2 + 45;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    final Integer zzD() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 33;
        b = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.userRatingsTotal;
        int i5 = i2 + 117;
        b = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    final Integer zzE() {
        int i = 2 % 2;
        int i2 = b + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.utcOffset;
        }
        throw null;
    }

    final String zzF() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.website;
        int i5 = i2 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    final Boolean zzG() {
        int i = 2 % 2;
        int i2 = b + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.wheelchairAccessibleEntrance;
        }
        throw null;
    }

    final String zzb() {
        int i = 2 % 2;
        int i2 = b + 125;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.businessStatus;
        int i5 = i3 + 101;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    final Boolean zzc() {
        int i = 2 % 2;
        int i2 = b + 85;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        Boolean bool = this.curbsidePickup;
        int i5 = i3 + 1;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return bool;
    }

    final zzd zzd() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.currentOpeningHours;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final Boolean zze() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 13;
        b = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.delivery;
        int i5 = i2 + 47;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final Boolean zzf() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        Boolean bool = this.dineIn;
        int i5 = i3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    final zzb zzg() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.editorialSummary;
        }
        throw null;
    }

    final String zzh() {
        String str;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.formattedAddress;
            int i4 = 7 / 0;
        } else {
            str = this.formattedAddress;
        }
        int i5 = i2 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return str;
    }

    final zzc zzi() {
        int i = 2 % 2;
        int i2 = b + 109;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        zzc zzcVar = this.geometry;
        int i5 = i3 + 115;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return zzcVar;
        }
        throw null;
    }

    final String zzj() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 37;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.iconBackgroundColor;
        int i5 = i2 + 27;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    final String zzk() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.iconMaskBaseUri;
        int i5 = i3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    final String zzl() {
        int i = 2 % 2;
        int i2 = b + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.internationalPhoneNumber;
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        return str;
    }

    final zzd zzn() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        zzd zzdVar = this.openingHours;
        int i5 = i2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return zzdVar;
    }

    final String zzp() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.placeId;
        int i4 = i2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    final zzf zzq() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 17;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        zzf zzfVar = this.plusCode;
        int i4 = i2 + 51;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return zzfVar;
        }
        obj.hashCode();
        throw null;
    }

    final Double zzs() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 41;
        b = i3 % 128;
        int i4 = i3 % 2;
        Double d = this.rating;
        int i5 = i2 + 95;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return d;
        }
        throw null;
    }

    final Boolean zzt() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 95;
        b = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.reservable;
        int i5 = i2 + 33;
        b = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    final Boolean zzv() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Boolean bool = this.servesBeer;
        int i4 = i3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    final Boolean zzw() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.servesBreakfast;
        int i5 = i2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    final Boolean zzx() {
        int i = 2 % 2;
        int i2 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.servesDinner;
        }
        throw null;
    }

    final Boolean zzy() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = b + 13;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 != 0) {
            bool = this.servesLunch;
            int i4 = 82 / 0;
        } else {
            bool = this.servesLunch;
        }
        int i5 = i3 + 47;
        b = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    final Boolean zzz() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.servesVegetarianFood;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, int r7, short r8) {
        /*
            int r6 = r6 * 3
            int r6 = 115 - r6
            byte[] r0 = com.google.android.libraries.places.internal.zzli.$$c
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r8]
            r5 = r3
            r3 = r6
            r6 = r5
        L29:
            int r8 = r8 + 1
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzli.$$g(int, int, short):java.lang.String");
    }
}
