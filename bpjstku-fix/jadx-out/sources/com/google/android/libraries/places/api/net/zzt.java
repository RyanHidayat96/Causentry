package com.google.android.libraries.places.api.net;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.EVSearchOptions;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RoutingParameters;
import com.google.android.libraries.places.api.model.SearchAlongRouteParameters;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
final class zzt extends SearchByTextRequest {
    private static int $10 = 0;
    private static int $11 = 1;
    private final CancellationToken zza;
    private final String zzb;
    private final LocationBias zzc;
    private final LocationRestriction zzd;
    private final Integer zze;
    private final Double zzf;
    private final boolean zzg;
    private final List zzh;
    private final List zzi;
    private final SearchByTextRequest.RankPreference zzj;
    private final String zzk;
    private final boolean zzl;
    private final String zzm;
    private final EVSearchOptions zzn;
    private final RoutingParameters zzo;
    private final SearchAlongRouteParameters zzp;
    private final boolean zzq;
    private final boolean zzr;
    private static final byte[] $$d = {17, 104, 102, -28, -16, -2, 59, -55, -19, -4, -7, 9, -10, -17, 16, -17, 64, -63, -9, -10, 11, -17, 0, 9, -15, 58, -23, -9, -38, 51, -63, 21, 11, -11, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 63};
    private static final int $$e = 129;
    private static final byte[] $$a = {14, 116, 92, -78, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
    private static final int $$b = 62;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int b = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2826592978582221533L;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 3
            int r8 = r8 + 97
            int r7 = r7 + 1
            byte[] r0 = com.google.android.libraries.places.api.net.zzt.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2a
        L13:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            int r8 = r8 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r4 = r0[r8]
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-5)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.net.zzt.a(short, byte, int, java.lang.Object[]):void");
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
    private static void d(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 15
            int r6 = 99 - r6
            int r8 = r8 * 22
            int r0 = r8 + 31
            byte[] r1 = com.google.android.libraries.places.api.net.zzt.$$d
            int r7 = r7 * 30
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r8 = r8 + 30
            r2 = 0
            if (r1 != 0) goto L19
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2e:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-4)
            int r6 = r6 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.net.zzt.d(int, short, int, java.lang.Object[]):void");
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int iHashCode2;
        int i2;
        int iHashCode3;
        int i3;
        int i4;
        int iHashCode4;
        int i5 = 2 % 2;
        CancellationToken cancellationToken = this.zza;
        int iHashCode5 = cancellationToken == null ? 0 : cancellationToken.hashCode();
        String str = this.zzb;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        LocationBias locationBias = this.zzc;
        int iHashCode7 = locationBias == null ? 0 : locationBias.hashCode();
        LocationRestriction locationRestriction = this.zzd;
        if (locationRestriction == null) {
            int i6 = b + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode = 0;
        } else {
            iHashCode = locationRestriction.hashCode();
        }
        Integer num = this.zze;
        int iHashCode8 = num == null ? 0 : num.hashCode();
        Double d = this.zzf;
        int iHashCode9 = d == null ? 0 : d.hashCode();
        if (true != this.zzg) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
            b = i8 % 128;
            int i9 = i8 % 2;
            i = 1237;
        } else {
            i = 1231;
        }
        int iHashCode10 = this.zzh.hashCode();
        int iHashCode11 = this.zzi.hashCode();
        SearchByTextRequest.RankPreference rankPreference = this.zzj;
        if (rankPreference == null) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            b = i10 % 128;
            int i11 = i10 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = rankPreference.hashCode();
        }
        String str2 = this.zzk;
        int iHashCode12 = str2 == null ? 0 : str2.hashCode();
        int i12 = true != this.zzl ? 1237 : 1231;
        int iHashCode13 = this.zzm.hashCode();
        EVSearchOptions eVSearchOptions = this.zzn;
        if (eVSearchOptions == null) {
            i2 = 0;
        } else {
            int iHashCode14 = eVSearchOptions.hashCode();
            int i13 = b + 53;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 5 / 4;
            }
            i2 = iHashCode14;
        }
        RoutingParameters routingParameters = this.zzo;
        if (routingParameters == null) {
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
            b = i15 % 128;
            int i16 = i15 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = routingParameters.hashCode();
        }
        SearchAlongRouteParameters searchAlongRouteParameters = this.zzp;
        if (searchAlongRouteParameters != null) {
            i3 = iHashCode3;
            int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
            i4 = iHashCode13;
            b = i17 % 128;
            if (i17 % 2 == 0) {
                int iHashCode15 = searchAlongRouteParameters.hashCode();
                int i18 = 98 / 0;
                iHashCode4 = iHashCode15;
            } else {
                iHashCode4 = searchAlongRouteParameters.hashCode();
            }
        } else {
            i3 = iHashCode3;
            i4 = iHashCode13;
            iHashCode4 = 0;
        }
        return ((((((((((((((((((((((((((((((((((iHashCode5 ^ 1000003) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ i) * 1000003) ^ iHashCode10) * 1000003) ^ iHashCode11) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode12) * 1000003) ^ i12) * 1000003) ^ i4) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ iHashCode4) * 1000003) ^ (true != this.zzq ? 1237 : 1231)) * 1000003) ^ (true == this.zzr ? 1231 : 1237);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0181  */
    /* JADX WARN: Code duplicated, block: B:105:0x018b  */
    /* JADX WARN: Code duplicated, block: B:107:0x018f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0196  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:117:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:14:0x002e A[PHI: r7
  0x002e: PHI (r7v2 com.google.android.libraries.places.api.net.SearchByTextRequest) = 
  (r7v1 com.google.android.libraries.places.api.net.SearchByTextRequest)
  (r7v6 com.google.android.libraries.places.api.net.SearchByTextRequest)
 binds: [B:13:0x002c, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x003f A[PHI: r7
  0x003f: PHI (r7v3 com.google.android.libraries.places.api.net.SearchByTextRequest) = 
  (r7v2 com.google.android.libraries.places.api.net.SearchByTextRequest)
  (r7v5 com.google.android.libraries.places.api.net.SearchByTextRequest)
 binds: [B:15:0x0032, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093  */
    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:70:0x0100  */
    /* JADX WARN: Code duplicated, block: B:73:0x0107  */
    /* JADX WARN: Code duplicated, block: B:77:0x0115  */
    /* JADX WARN: Code duplicated, block: B:80:0x0125  */
    /* JADX WARN: Code duplicated, block: B:82:0x012f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0137  */
    /* JADX WARN: Code duplicated, block: B:88:0x0150  */
    /* JADX WARN: Code duplicated, block: B:91:0x0157  */
    /* JADX WARN: Code duplicated, block: B:95:0x0165  */
    /* JADX WARN: Code duplicated, block: B:97:0x0170  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:107:0x018f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final boolean equals(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.net.zzt.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:57:0x024e  */
    /* JADX WARN: Code duplicated, block: B:58:0x024f  */
    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (true) {
            obj = null;
            if (getrealtimecapturelatency.b >= cArr.length) {
                break;
            }
            int i3 = $11 + 119;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.rgb(0, 0, 0) + 16796688), 2624 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() & (TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 481 - View.resolveSize(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 19473), (ViewConfiguration.getTouchSlop() >> 8) + 2624, 13 - (ViewConfiguration.getScrollBarSize() >> 8), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - TextUtils.getCapsMode("", 0, 0)), 481 - TextUtils.getOffsetAfter("", 0), 36 - ExpandableListView.getPackedPositionChild(0L), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $10 + 13;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                try {
                    Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 39422), 481 - (ViewConfiguration.getLongPressTimeout() >> 16), 37 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    obj.hashCode();
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr7 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (39421 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 481, 37 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2);
    }

    public final String toString() throws Throwable {
        Object[] objArr;
        char c;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c2 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int iBlue = Color.blue(0) + 876;
            int iAlpha = Color.alpha(0) + 10;
            byte[] bArr = $$a;
            byte b2 = bArr[11];
            Object[] objArr3 = new Object[1];
            a((byte) (b2 - 1), bArr[8], b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, iBlue, iAlpha, -1199417970, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{7079, 35109, 16056, 44051, 20893, 51054, 29932, 6707, 36801, 15680, 41578, 22426, 50467, 27292, 6148, 36320, 13179, 41176, 22080, 64478, 26785, 7740}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 37516, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{7075, 7635, 5973, 2269, 593, 15358, 15732, 14043, 10347, 8678, 23312, 23681, 22019, 20366, 16701}, 1658 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c3 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 876;
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10;
            byte[] bArr2 = $$a;
            byte b3 = (byte) (bArr2[8] - 1);
            byte b4 = bArr2[11];
            Object[] objArr6 = new Object[1];
            a(b3, b4, (byte) (b4 + 1), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, iIndexOf, keyRepeatDelay, 254769921, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 876;
                int i2 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
                byte[] bArr3 = $$a;
                Object[] objArr7 = new Object[1];
                a((byte) (bArr3[8] - 1), bArr3[10], bArr3[11], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumDrawingCacheSize, edgeSlop, i2, 1324201839, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iMyUid = Process.myUid();
            int i3 = ~iMyUid;
            int i4 = 2068391568 + (((~(198282995 | i3)) | (~((-29428276) | iMyUid))) * (-831)) + ((~(268021499 | iMyUid)) * (-1662)) + (((~(iMyUid | (-198282996))) | (~(i3 | (-238593225))) | (~(238593224 | iMyUid))) * 831) + 1816898245;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
            c = 2;
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{7084, 36918, 3218, 47380, 13740, 41599, 24257, 52063, 18217, 62449, 26687, 58500, 37241, 3567, 47693, 14036}, 35729 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{7087, 22033, 32965, 62129, 11646, 40912, 51584, 1114, 30230, 41196, 4939, 19743, 49121, 59838, 9320, 38622}, 19891 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            int i7 = b + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object[] objArr11 = {Integer.valueOf(iIntValue), 1816898245};
                byte[] bArr4 = $$d;
                byte b5 = bArr4[22];
                byte b6 = b5;
                Object[] objArr12 = new Object[1];
                d(b5, b6, b6, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b7 = bArr4[81];
                byte b8 = b7;
                Object[] objArr13 = new Object[1];
                d(b7, b8, b8, objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c4 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                    int packedPositionType = 876 - ExpandableListView.getPackedPositionType(0L);
                    int i9 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                    byte[] bArr5 = $$a;
                    Object[] objArr14 = new Object[1];
                    a((byte) (bArr5[8] - 1), bArr5[10], bArr5[11], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c4, packedPositionType, i9, 1324201839, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    c(new char[]{7079, 35109, 16056, 44051, 20893, 51054, 29932, 6707, 36801, 15680, 41578, 22426, 50467, 27292, 6148, 36320, 13179, 41176, 22080, 64478, 26785, 7740}, TextUtils.indexOf("", "", 0, 0) + 37517, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(new char[]{7075, 7635, 5973, 2269, 593, 15358, 15732, 14043, 10347, 8678, 23312, 23681, 22019, 20366, 16701}, View.MeasureSpec.makeMeasureSpec(0, 0) + 1657, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                        int i10 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 876;
                        int minimumFlingVelocity = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        byte[] bArr6 = $$a;
                        byte b9 = (byte) (bArr6[8] - 1);
                        byte b10 = bArr6[11];
                        Object[] objArr17 = new Object[1];
                        a(b9, b10, (byte) (b10 + 1), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(modifierMetaStateMask, i10, minimumFlingVelocity, 254769921, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int edgeSlop2 = 876 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 10;
                        byte[] bArr7 = $$a;
                        byte b11 = bArr7[11];
                        Object[] objArr18 = new Object[1];
                        a((byte) (b11 - 1), bArr7[8], b11, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cCombineMeasuredStates, edgeSlop2, offsetBefore, -1199417970, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i11 = b + 75;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                    c = 2;
                    int i12 = i11 % 2;
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
        int i13 = ((int[]) objArr[c])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i16 = ~iIdentityHashCode;
            int i17 = i15 + 780789133 + (((~((-31941085) | i16)) | (~(iIdentityHashCode | 8369144))) * 333) + (((~(iIdentityHashCode | (-31941085))) | (~(i16 | 8369144))) * 333);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr2[1])[0] = i19 ^ (i19 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                for (String str : strArr) {
                    int i20 = b + 15;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
                    int i21 = i20 % 2;
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i14];
            int i22 = i14 - 1;
            iArr[i22] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i22) % 2) - 1], 1).show();
            int i23 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i24 = i23 + (-1894563978) + ((~(402651133 | iMaxMemory)) * 623) + (((~iMaxMemory) | 352584064) * (-623)) + (((~(iMaxMemory | 397772713)) | (~(357462484 | iMaxMemory)) | (-402651134)) * 623);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr2[1])[0] = i26 ^ (i26 << 5);
        }
        SearchAlongRouteParameters searchAlongRouteParameters = this.zzp;
        RoutingParameters routingParameters = this.zzo;
        EVSearchOptions eVSearchOptions = this.zzn;
        SearchByTextRequest.RankPreference rankPreference = this.zzj;
        List list = this.zzi;
        List list2 = this.zzh;
        LocationRestriction locationRestriction = this.zzd;
        LocationBias locationBias = this.zzc;
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(locationBias);
        String strValueOf3 = String.valueOf(locationRestriction);
        String string = list2.toString();
        String string2 = list.toString();
        String strValueOf4 = String.valueOf(rankPreference);
        String strValueOf5 = String.valueOf(eVSearchOptions);
        String strValueOf6 = String.valueOf(routingParameters);
        String strValueOf7 = String.valueOf(searchAlongRouteParameters);
        int length = String.valueOf(strValueOf).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(strValueOf2).length();
        int length4 = String.valueOf(strValueOf3).length();
        Integer num = this.zze;
        int length5 = String.valueOf(num).length();
        Double d = this.zzf;
        int length6 = String.valueOf(d).length();
        boolean z = this.zzg;
        int length7 = String.valueOf(z).length();
        int length8 = string.length();
        int length9 = string2.length();
        int length10 = String.valueOf(strValueOf4).length();
        String str3 = this.zzk;
        int length11 = String.valueOf(str3).length();
        boolean z2 = this.zzl;
        int length12 = String.valueOf(z2).length();
        int length13 = String.valueOf(strValueOf5).length();
        int length14 = String.valueOf(strValueOf6).length();
        int length15 = String.valueOf(strValueOf7).length();
        boolean z3 = this.zzq;
        int length16 = String.valueOf(z3).length();
        String str4 = this.zzm;
        int length17 = str4.length();
        boolean z4 = this.zzr;
        StringBuilder sb = new StringBuilder(length + 53 + length2 + 15 + length3 + 22 + length4 + 17 + length5 + 12 + length6 + 10 + length7 + 14 + length8 + 14 + length9 + 17 + length10 + 13 + length11 + 22 + length12 + 12 + length17 + 18 + length13 + 20 + length14 + 29 + length15 + 27 + length16 + 36 + String.valueOf(z4).length() + 1);
        int i27 = ((int[]) objArr2[1])[0];
        int i28 = ((i27 * i27) - (~(-(i27 * 1850853944)))) - 1;
        int i29 = -(i27 * (-1169227728));
        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
        int i31 = (i30 ^ (-2004741488)) + (((-2004741488) & i30) << 1);
        int i32 = i31 >> 16;
        int i33 = (((-131071) & i32) + (i32 | (-131071))) / 65536;
        int i34 = (i33 ^ 1) + ((i33 & 1) << 1);
        int i35 = (i31 & i34) + (i34 | i31);
        int i36 = i31 >> 20;
        int i37 = (((i36 | (-8191)) << 1) - (i36 ^ (-8191))) / 4096;
        int i38 = -(((i37 & 1) + (i37 | 1)) ^ i35);
        int i39 = (i38 & 6) + (i38 | 6);
        int i40 = i39 >> 18;
        int i41 = ((i40 ^ (-32767)) + ((i40 & (-32767)) << 1)) / 16384;
        int i42 = (i41 & 1) + (i41 | 1);
        sb.append("30|10|1|SearchByTextRequest{cancellationToken=".substring(59808 / (((-(((i42 | 1) << 1) - (i42 ^ 1))) & i39) * 1246)));
        sb.append(strValueOf);
        sb.append(", includedType=");
        sb.append(str2);
        sb.append(", locationBias=");
        sb.append(strValueOf2);
        sb.append(", locationRestriction=");
        sb.append(strValueOf3);
        sb.append(", maxResultCount=");
        sb.append(num);
        sb.append(", minRating=");
        sb.append(d);
        sb.append(", openNow=");
        sb.append(z);
        sb.append(", placeFields=");
        sb.append(string);
        sb.append(", priceLevels=");
        sb.append(string2);
        sb.append(", rankPreference=");
        sb.append(strValueOf4);
        sb.append(", regionCode=");
        sb.append(str3);
        sb.append(", strictTypeFiltering=");
        sb.append(z2);
        sb.append(", textQuery=");
        sb.append(str4);
        sb.append(", evSearchOptions=");
        sb.append(strValueOf5);
        sb.append(", routingParameters=");
        sb.append(strValueOf6);
        sb.append(", searchAlongRouteParameters=");
        sb.append(strValueOf7);
        sb.append(", routingSummariesIncluded=");
        sb.append(z3);
        sb.append(", pureServiceAreaBusinessesIncluded=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }

    /* synthetic */ zzt(CancellationToken cancellationToken, String str, LocationBias locationBias, LocationRestriction locationRestriction, Integer num, Double d, boolean z, List list, List list2, SearchByTextRequest.RankPreference rankPreference, String str2, boolean z2, String str3, EVSearchOptions eVSearchOptions, RoutingParameters routingParameters, SearchAlongRouteParameters searchAlongRouteParameters, boolean z3, boolean z4, byte[] bArr) {
        this.zza = cancellationToken;
        this.zzb = str;
        this.zzc = locationBias;
        this.zzd = locationRestriction;
        this.zze = num;
        this.zzf = d;
        this.zzg = z;
        this.zzh = list;
        this.zzi = list2;
        this.zzj = rankPreference;
        this.zzk = str2;
        this.zzl = z2;
        this.zzm = str3;
        this.zzn = eVSearchOptions;
        this.zzo = routingParameters;
        this.zzp = searchAlongRouteParameters;
        this.zzq = z3;
        this.zzr = z4;
    }

    @Override // com.google.android.libraries.places.internal.zzmg
    public final CancellationToken getCancellationToken() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        CancellationToken cancellationToken = this.zza;
        int i5 = i3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return cancellationToken;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final EVSearchOptions getEvSearchOptions() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        b = i2 % 128;
        int i3 = i2 % 2;
        EVSearchOptions eVSearchOptions = this.zzn;
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        return eVSearchOptions;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final String getIncludedType() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.zzb;
        int i5 = i3 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final LocationBias getLocationBias() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        LocationBias locationBias = this.zzc;
        int i5 = i3 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return locationBias;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final LocationRestriction getLocationRestriction() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        LocationRestriction locationRestriction = this.zzd;
        int i5 = i3 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return locationRestriction;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final Integer getMaxResultCount() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zze;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final Double getMinRating() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 107;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Double d = this.zzf;
        int i4 = i2 + 65;
        b = i4 % 128;
        int i5 = i4 % 2;
        return d;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final List<Place.Field> getPlaceFields() {
        int i = 2 % 2;
        int i2 = b + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzh;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final List<Integer> getPriceLevels() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zzi;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final SearchByTextRequest.RankPreference getRankPreference() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        SearchByTextRequest.RankPreference rankPreference = this.zzj;
        int i5 = i2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return rankPreference;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final String getRegionCode() {
        int i = 2 % 2;
        int i2 = b + 19;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.zzk;
        int i5 = i3 + 21;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final RoutingParameters getRoutingParameters() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        RoutingParameters routingParameters = this.zzo;
        int i5 = i2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return routingParameters;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final SearchAlongRouteParameters getSearchAlongRouteParameters() {
        int i = 2 % 2;
        int i2 = b + 105;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        SearchAlongRouteParameters searchAlongRouteParameters = this.zzp;
        int i4 = i3 + 55;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return searchAlongRouteParameters;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final String getTextQuery() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.zzm;
        int i5 = i3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final boolean isOpenNow() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 105;
        b = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.zzg;
        int i5 = i2 + 89;
        b = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final boolean isPureServiceAreaBusinessesIncluded() {
        int i = 2 % 2;
        int i2 = b + 17;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        boolean z = this.zzr;
        int i5 = i3 + 91;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final boolean isRoutingSummariesIncluded() {
        int i = 2 % 2;
        int i2 = b + 47;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        boolean z = this.zzq;
        int i5 = i3 + 57;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final boolean isStrictTypeFiltering() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 33;
        b = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.zzl;
        int i5 = i2 + 63;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final SearchByTextRequest.Builder zza() {
        int i = 2 % 2;
        zzs zzsVar = new zzs(this);
        int i2 = b + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return zzsVar;
    }
}
