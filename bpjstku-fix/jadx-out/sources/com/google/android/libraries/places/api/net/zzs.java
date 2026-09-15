package com.google.android.libraries.places.api.net;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.EVSearchOptions;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RoutingParameters;
import com.google.android.libraries.places.api.model.SearchAlongRouteParameters;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
final class zzs extends SearchByTextRequest.Builder {
    private CancellationToken zza;
    private String zzb;
    private LocationBias zzc;
    private LocationRestriction zzd;
    private Integer zze;
    private Double zzf;
    private boolean zzg;
    private List zzh;
    private List zzi;
    private SearchByTextRequest.RankPreference zzj;
    private String zzk;
    private boolean zzl;
    private String zzm;
    private EVSearchOptions zzn;
    private RoutingParameters zzo;
    private SearchAlongRouteParameters zzp;
    private boolean zzq;
    private boolean zzr;
    private byte zzs;
    private static final byte[] $$c = {102, -96, -78, -55};
    private static final int $$d = 67;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {17, 104, 102, -28, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 239;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = -83722411;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.libraries.places.api.net.zzs.$$a
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r6 = r6 * 2
            int r6 = r6 + 53
            int r8 = r8 * 2
            int r8 = 84 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r7 = r7 + 1
            r3 = r0[r7]
        L2b:
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.net.zzs.c(int, short, byte, java.lang.Object[]):void");
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final List<Place.Field> getPlaceFields() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<Place.Field> list = this.zzh;
        if (list == null) {
            throw new IllegalStateException("Property \"placeFields\" has not been set");
        }
        int i4 = i3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return list;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final List<Integer> getPriceLevels() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        List<Integer> list = this.zzi;
        if (list == null) {
            throw new IllegalStateException("Property \"priceLevels\" has not been set");
        }
        int i4 = i2 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        throw null;
    }

    private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0') + 3292, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 30, 1199271174, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", ""), 651 - (ViewConfiguration.getTouchSlop() >> 8), 44 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -450685997, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            int i6 = $10 + 47;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            int i8 = $10 + 15;
            $11 = i8 % 128;
            while (true) {
                int i9 = i8 % 2;
                if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                    break;
                }
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), 651 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.resolveSize(0, 0) + 44, -450685997, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i8 = $10 + 69;
                $11 = i8 % 128;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final String getTextQuery() throws Throwable {
        CharSequence charSequence;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46400), 39 - Process.getGidForName(""), 18 - TextUtils.lastIndexOf("", '0'), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        a(false, 154 - (ViewConfiguration.getPressedStateDuration() >> 16), 22 - KeyEvent.keyCodeFromString(""), 6 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n'}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(false, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 158, 15 - ((Process.getThreadPriority(0) + 20) >> 6), '7' - AndroidCharacter.getMirror('0'), new char[]{65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515}, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long jIdentityHashCode = System.identityHashCode(this);
        long j = (((long) 51) * 758213099464354824L) + (((long) (-49)) * 1339044075277604163L) + (((long) (-50)) * (jIdentityHashCode | 758213099464354824L));
        long j2 = 50;
        CharSequence charSequence2 = "";
        long j3 = -1;
        long j4 = j3 ^ 1339044075277604163L;
        long j5 = (((j3 ^ 758213099464354824L) | j4) | jIdentityHashCode) ^ j3;
        long j6 = jIdentityHashCode ^ j3;
        long j7 = j4 | j6;
        long j8 = j + ((j5 | ((j7 | 758213099464354824L) ^ j3)) * j2) + (j2 * ((j7 ^ j3) | ((j4 | 758213099464354824L) ^ j3) | ((j6 | 758213099464354824L) ^ j3)));
        int i4 = b + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (true) {
            if (i6 == 10) {
                CharSequence charSequence3 = charSequence2;
                Object[] objArr3 = new Object[1];
                a(true, 201 - AndroidCharacter.getMirror('0'), 16 - ExpandableListView.getPackedPositionType(0L), 15 - TextUtils.getOffsetBefore(charSequence3, 0), new char[]{3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11}, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a(false, 157 - (ViewConfiguration.getJumpTapTimeout() >> 16), 16 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.getCapsMode(charSequence3, 0, 0) + 9, new char[]{19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14}, objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {-426962064};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.green(0) + 46038), ExpandableListView.getPackedPositionGroup(0L) + 1134, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 1234867627, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf(charSequence3, '0', 0, 0));
                        int iIndexOf = 1030 - TextUtils.indexOf(charSequence3, '0', 0);
                        int i7 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        c(b2, b3, b3, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iIndexOf, i7, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.combineMeasuredStates(0, 0)), TextUtils.getOffsetBefore(charSequence3, 0) + 1117, 17 - TextUtils.getCapsMode(charSequence3, 0, 0)), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6);
                    if (((int[]) objArr8[3])[0] == ((int[]) objArr8[1])[0]) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr8[0];
                    if (strArr != null) {
                        int i8 = b + 29;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                        int i9 = i8 % 2;
                        while (i2 < strArr.length) {
                            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
                            b = i10 % 128;
                            if (i10 % 2 != 0) {
                                arrayList.add(strArr[i2]);
                                i2 += 125;
                            } else {
                                arrayList.add(strArr[i2]);
                                i2++;
                            }
                        }
                    }
                    throw null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                charSequence = charSequence2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf(charSequence, charSequence, 0) + 37836), 59 - TextUtils.getTrimmedLength(charSequence), 17 - TextUtils.lastIndexOf(charSequence, '0'), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            } else {
                charSequence = charSequence2;
            }
            int i11 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
            int i12 = 0;
            long j9 = jLongValue;
            while (true) {
                for (int i13 = 0; i13 != 8; i13++) {
                    i11 = (((((int) (j9 >> i13)) & 255) + (i11 << 6)) + (i11 << 16)) - i11;
                }
                if (i12 != 0) {
                    break;
                }
                i12++;
                j9 = j8;
            }
            if (i11 == i3) {
                break;
            }
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
            b = i14 % 128;
            int i15 = i14 % 2;
            jLongValue -= 1024;
            i6++;
            charSequence2 = charSequence;
        }
        String str = this.zzm;
        if (str == null) {
            throw new IllegalStateException("Property \"textQuery\" has not been set");
        }
        int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        b = i16 % 128;
        int i17 = i16 % 2;
        return str;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final boolean isOpenNow() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 != 0 || (this.zzs & 1) == 0) {
            throw new IllegalStateException("Property \"openNow\" has not been set");
        }
        int i4 = i3 + 63;
        int i5 = i4 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.zzg;
        int i6 = i5 + 65;
        b = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final boolean isPureServiceAreaBusinessesIncluded() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        if ((this.zzs & 8) == 0) {
            throw new IllegalStateException("Property \"pureServiceAreaBusinessesIncluded\" has not been set");
        }
        int i5 = i2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        boolean z = this.zzr;
        if (i6 == 0) {
            int i7 = 40 / 0;
        }
        return z;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final boolean isRoutingSummariesIncluded() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0 ? (this.zzs & 4) == 0 : (this.zzs & 3) == 0) {
            throw new IllegalStateException("Property \"routingSummariesIncluded\" has not been set");
        }
        boolean z = this.zzq;
        int i4 = i2 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final boolean isStrictTypeFiltering() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        if ((this.zzs & 2) == 0) {
            throw new IllegalStateException("Property \"strictTypeFiltering\" has not been set");
        }
        boolean z = this.zzl;
        int i5 = i2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setPlaceFields(List<Place.Field> list) {
        int i = 2 % 2;
        if (list == null) {
            throw new NullPointerException("Null placeFields");
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 5;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.zzh = list;
        int i5 = i2 + 119;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setPriceLevels(List<Integer> list) {
        int i = 2 % 2;
        if (list == null) {
            throw new NullPointerException("Null priceLevels");
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 85;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.zzi = list;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 3;
        b = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setTextQuery(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        if (str == null) {
            throw new NullPointerException("Null textQuery");
        }
        int i5 = i2 + 97;
        int i6 = i5 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6;
        int i7 = i5 % 2;
        Object obj = null;
        this.zzm = str;
        if (i7 == 0) {
            obj.hashCode();
            throw null;
        }
        int i8 = i6 + 85;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    final SearchByTextRequest zza() {
        List list;
        String str;
        int i = 2 % 2;
        if (this.zzs == 15) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
            b = i2 % 128;
            int i3 = i2 % 2;
            List list2 = this.zzh;
            if (list2 != null && (list = this.zzi) != null && (str = this.zzm) != null) {
                return new zzt(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, list2, list, this.zzj, this.zzk, this.zzl, str, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr, null);
            }
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zzs & 1) == 0) {
            sb.append(" openNow");
        }
        if (this.zzh == null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                sb.append(" placeFields");
                int i5 = 30 / 0;
            } else {
                sb.append(" placeFields");
            }
        }
        if (this.zzi == null) {
            sb.append(" priceLevels");
        }
        if ((this.zzs & 2) == 0) {
            sb.append(" strictTypeFiltering");
        }
        if (this.zzm == null) {
            sb.append(" textQuery");
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
            b = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((this.zzs & 4) == 0) {
            int i8 = b + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            int i9 = i8 % 2;
            sb.append(" routingSummariesIncluded");
        }
        if ((this.zzs & 8) == 0) {
            int i10 = b + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
            if (i10 % 2 == 0) {
                sb.append(" pureServiceAreaBusinessesIncluded");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            sb.append(" pureServiceAreaBusinessesIncluded");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    zzs() {
    }

    zzs(SearchByTextRequest searchByTextRequest) {
        this.zza = searchByTextRequest.getCancellationToken();
        this.zzb = searchByTextRequest.getIncludedType();
        this.zzc = searchByTextRequest.getLocationBias();
        this.zzd = searchByTextRequest.getLocationRestriction();
        this.zze = searchByTextRequest.getMaxResultCount();
        this.zzf = searchByTextRequest.getMinRating();
        this.zzg = searchByTextRequest.isOpenNow();
        this.zzh = searchByTextRequest.getPlaceFields();
        this.zzi = searchByTextRequest.getPriceLevels();
        this.zzj = searchByTextRequest.getRankPreference();
        this.zzk = searchByTextRequest.getRegionCode();
        this.zzl = searchByTextRequest.isStrictTypeFiltering();
        this.zzm = searchByTextRequest.getTextQuery();
        this.zzn = searchByTextRequest.getEvSearchOptions();
        this.zzo = searchByTextRequest.getRoutingParameters();
        this.zzp = searchByTextRequest.getSearchAlongRouteParameters();
        this.zzq = searchByTextRequest.isRoutingSummariesIncluded();
        this.zzr = searchByTextRequest.isPureServiceAreaBusinessesIncluded();
        this.zzs = (byte) 15;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final CancellationToken getCancellationToken() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 51;
        b = i3 % 128;
        int i4 = i3 % 2;
        CancellationToken cancellationToken = this.zza;
        int i5 = i2 + 45;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return cancellationToken;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final EVSearchOptions getEvSearchOptions() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        EVSearchOptions eVSearchOptions = this.zzn;
        int i5 = i2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return eVSearchOptions;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final String getIncludedType() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 101;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zzb;
        int i5 = i2 + 61;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final LocationBias getLocationBias() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        LocationBias locationBias = this.zzc;
        int i5 = i2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return locationBias;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final LocationRestriction getLocationRestriction() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzd;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final Integer getMaxResultCount() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.zze;
        int i4 = i3 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return num;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final Double getMinRating() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        Double d = this.zzf;
        int i5 = i3 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return d;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.RankPreference getRankPreference() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 55;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SearchByTextRequest.RankPreference rankPreference = this.zzj;
        int i4 = i2 + 83;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return rankPreference;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final String getRegionCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        b = i2 % 128;
        int i3 = i2 % 2;
        String str = this.zzk;
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        return str;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final RoutingParameters getRoutingParameters() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        RoutingParameters routingParameters = this.zzo;
        int i5 = i3 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return routingParameters;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchAlongRouteParameters getSearchAlongRouteParameters() {
        int i = 2 % 2;
        int i2 = b + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zzp;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setCancellationToken(CancellationToken cancellationToken) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.zza = cancellationToken;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setEvSearchOptions(EVSearchOptions eVSearchOptions) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        this.zzn = eVSearchOptions;
        int i5 = i3 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setIncludedType(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 13;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.zzb = str;
        int i5 = i2 + 117;
        b = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setLocationBias(LocationBias locationBias) {
        int i = 2 % 2;
        int i2 = b + 101;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        this.zzc = locationBias;
        int i5 = i3 + 45;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setLocationRestriction(LocationRestriction locationRestriction) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 37;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.zzd = locationRestriction;
        int i5 = i2 + 27;
        b = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setMaxResultCount(Integer num) {
        int i = 2 % 2;
        int i2 = b + 7;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        this.zze = num;
        int i5 = i3 + 113;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setMinRating(Double d) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        this.zzf = d;
        int i5 = i3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setOpenNow(boolean z) {
        int i = 2 % 2;
        int i2 = b + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.zzg = z;
        int i4 = this.zzs;
        if (i3 != 0) {
            i4 |= 1;
        }
        this.zzs = (byte) i4;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setPureServiceAreaBusinessesIncluded(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        this.zzr = z;
        this.zzs = (byte) (this.zzs | 8);
        int i5 = i3 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setRankPreference(SearchByTextRequest.RankPreference rankPreference) {
        int i = 2 % 2;
        int i2 = b + 29;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        this.zzj = rankPreference;
        int i5 = i3 + 119;
        b = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setRegionCode(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 55;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.zzk = str;
        int i5 = i2 + 51;
        b = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setRoutingParameters(RoutingParameters routingParameters) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 47;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.zzo = routingParameters;
        int i5 = i2 + 55;
        b = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setRoutingSummariesIncluded(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.zzq = z;
        this.zzs = (byte) (this.zzs | 4);
        int i5 = i2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setSearchAlongRouteParameters(SearchAlongRouteParameters searchAlongRouteParameters) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.zzp = searchAlongRouteParameters;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setStrictTypeFiltering(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        this.zzl = z;
        this.zzs = (byte) (this.zzs | 2);
        int i5 = i3 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
        return this;
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
    private static java.lang.String $$e(short r6, byte r7, short r8) {
        /*
            int r7 = 120 - r7
            byte[] r0 = com.google.android.libraries.places.api.net.zzs.$$c
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r6 = r6 * 3
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L29:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.net.zzs.$$e(short, byte, short):java.lang.String");
    }
}
