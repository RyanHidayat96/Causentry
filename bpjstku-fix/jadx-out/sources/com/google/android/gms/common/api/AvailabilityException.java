package com.google.android.gms.common.api;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class AvailabilityException extends Exception {
    private final ArrayMap zaa;
    private static final byte[] $$c = {91, -17, 90, 37};
    private static final int $$d = 114;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {64, 73, -26, 82, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 139;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int b = 1;
    private static long TuitionPaymentFragmentbindingInflater1 = -2893844096406127360L;

    public AvailabilityException(ArrayMap arrayMap) {
        this.zaa = arrayMap;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 53
            int r5 = r5 * 2
            int r5 = r5 + 84
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = com.google.android.gms.common.api.AvailabilityException.$$a
            byte[] r0 = new byte[r0]
            int r6 = r6 + 52
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L28:
            r3 = r1[r7]
        L2a:
            int r3 = -r3
            int r7 = r7 + 1
            int r5 = r5 + r3
            int r5 = r5 + (-11)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.AvailabilityException.c(byte, int, int, java.lang.Object[]):void");
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentbindingInflater1 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $10 + 33;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 64838), 1356 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Color.rgb(0, 0, 0) + 16777254, 894276454, false, $$e(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 47772), (ViewConfiguration.getEdgeSlop() >> 16) + 468, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $11 + 93;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionResult getConnectionResult(GoogleApi<? extends Api.ApiOptions> googleApi) throws Throwable {
        boolean z;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        boolean z2 = false;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - TextUtils.getCapsMode("", 0, 0)), 40 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 19 - TextUtils.indexOf("", "", 0, 0), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        long j = 0;
        Object[] objArr = new Object[1];
        a(new char[]{7466, 7499, 11770, 15090, 48810, 36866, 20765, 5981, 16605, 20069, 12970, 46265, 42613, 59415, 22392, 5740, 1435, 2735, 63818, 18882, 27431, 46967, 7146, 43936, 52913, 53703}, 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(new char[]{7277, 7176, 21019, 17681, 63464, 55621, 341, 18199, 16774, 12682, 31720, 58511, 42808, 38886, 7800, 17921, 1228, 30034, 45081}, TextUtils.getTrimmedLength(""), objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j2 = -751;
        long j3 = -1;
        long j4 = j3 ^ 3963493204083351803L;
        long j5 = j3 ^ (-1866236029341392816L);
        long jIdentityHashCode = System.identityHashCode(this);
        long j6 = j4 | (-1866236029341392816L);
        long j7 = (j2 * 3963493204083351803L) + (j2 * (-1866236029341392816L)) + (((long) 1504) * (((j4 | j5) ^ j3) | ((j4 | jIdentityHashCode) ^ j3))) + (((long) (-1504)) * ((j6 | jIdentityHashCode) ^ j3)) + (((long) 752) * ((j3 ^ (j5 | 3963493204083351803L)) | (j6 ^ j3)));
        int i5 = 0;
        long j8 = jLongValue;
        while (true) {
            if (i5 == 10) {
                Object[] objArr3 = new Object[1];
                a(new char[]{47556, 47534, 2576, 7447, 19694, 25172, 46215, 62164, 58482, 27013, 49387, 20848, 659, 53167, 42305, 62415, 41343, 11597, 2847, 44099}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a(new char[]{51267, 51242, 49332, 55222, 60719, 50054, 27, 17991, 38319, 41761, 24895, 58868, 29499, 1345, 1184, 18253, 53448, 59383, 43743, 6360}, KeyEvent.keyCodeFromString(""), objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {1394161163};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 46038), 1134 - (ViewConfiguration.getTapTimeout() >> 16), 18 - Color.green(0), 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 1385100101, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1031;
                        int i6 = 16 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        c(b2, b3, b3, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(absoluteGravity, iResolveOpacity, i6, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45993), 1117 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getJumpTapTimeout() >> 16) + 17), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6);
                    z = true;
                    if (((int[]) objArr8[3])[0] == ((int[]) objArr8[1])[0]) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr8[0];
                    if (strArr != null) {
                        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
                        b = i7 % 128;
                        int i8 = i7 % 2;
                        for (String str : strArr) {
                            arrayList.add(str);
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
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37836 - (ViewConfiguration.getTapTimeout() >> 16)), 59 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), 18 - (ViewConfiguration.getEdgeSlop() >> 16), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i9 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
            int i10 = 0;
            long j9 = j8;
            while (true) {
                for (int i11 = 0; i11 != 8; i11++) {
                    i9 = (((((int) (j9 >> i11)) & 255) + (i9 << 6)) + (i9 << 16)) - i9;
                }
                if (i10 != 0) {
                    break;
                }
                i10++;
                j9 = j7;
            }
            if (i9 == i4) {
                z = true;
                break;
            }
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
            b = i12 % 128;
            if (i12 % 2 == 0) {
                j8 /= 1024;
                i5 += 75;
            } else {
                j8 -= 1024;
                i5++;
            }
            j = 0;
        }
        ArrayMap arrayMap = this.zaa;
        ApiKey<O> apiKey = googleApi.getApiKey();
        V v = arrayMap.get(apiKey);
        String strZaa = apiKey.zaa();
        StringBuilder sb = new StringBuilder("The given API (");
        sb.append(strZaa);
        sb.append(") was not part of the availability request.");
        String string = sb.toString();
        if (v != null) {
            int i13 = b + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
            int i14 = i13 % 2;
            z2 = z;
        }
        Preconditions.checkArgument(z2, string);
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i2 = b + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = true;
        for (ApiKey apiKey : this.zaa.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
            z &= !connectionResult.isSuccess();
            String strZaa = apiKey.zaa();
            String strValueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder();
            sb.append(strZaa);
            sb.append(": ");
            sb.append(strValueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                sb2.append("None of the queried APIs are available. ");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
            b = i5 % 128;
            int i6 = i5 % 2;
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    public ConnectionResult getConnectionResult(HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        int i = 2 % 2;
        ArrayMap arrayMap = this.zaa;
        ApiKey<O> apiKey = hasApiKey.getApiKey();
        Object obj = arrayMap.get(apiKey);
        String strZaa = apiKey.zaa();
        StringBuilder sb = new StringBuilder("The given API (");
        sb.append(strZaa);
        sb.append(") was not part of the availability request.");
        String string = sb.toString();
        boolean z = false;
        if (obj != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                z = true;
            }
        } else {
            int i3 = b + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
        }
        Preconditions.checkArgument(z, string);
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r5, short r6, byte r7) {
        /*
            int r7 = r7 * 3
            int r0 = r7 + 1
            int r5 = r5 * 3
            int r5 = r5 + 4
            byte[] r1 = com.google.android.gms.common.api.AvailabilityException.$$c
            int r6 = r6 * 3
            int r6 = 107 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            r3 = r1[r5]
        L26:
            int r6 = r6 + r3
            int r5 = r5 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.AvailabilityException.$$e(int, short, byte):java.lang.String");
    }
}
