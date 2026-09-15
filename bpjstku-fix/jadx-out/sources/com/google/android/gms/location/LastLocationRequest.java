package com.google.android.gms.location;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.InputDeviceCompat;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.identity.ClientIdentity;
import com.google.android.gms.internal.identity.zzeo;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class LastLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new zzaa();
    private final long zza;
    private final int zzb;
    private final boolean zzc;
    private final ClientIdentity zzd;

    LastLocationRequest(long j, int i, boolean z, ClientIdentity clientIdentity) {
        this.zza = j;
        this.zzb = i;
        this.zzc = z;
        this.zzd = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        return this.zza == lastLocationRequest.zza && this.zzb == lastLocationRequest.zzb && this.zzc == lastLocationRequest.zzc && Objects.equal(this.zzd, lastLocationRequest.zzd);
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Integer.valueOf(this.zzb), Boolean.valueOf(this.zzc));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LastLocationRequest[");
        if (this.zza != Long.MAX_VALUE) {
            sb.append("maxAge=");
            zzeo.zzc(this.zza, sb);
        }
        if (this.zzb != 0) {
            sb.append(", ");
            sb.append(zzq.zzb(this.zzb));
        }
        if (this.zzc) {
            sb.append(", bypass");
        }
        if (this.zzd != null) {
            sb.append(", impersonation=");
            sb.append(this.zzd);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 2, getGranularity());
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int getGranularity() {
        return this.zzb;
    }

    public final long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final ClientIdentity zzb() {
        return this.zzd;
    }

    public static final class Builder {
        private long zza;
        private int zzb;
        private final boolean zzc;
        private final ClientIdentity zzd;
        private static final byte[] $$c = {33, -59, 107, -108};
        private static final int $$f = 200;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {56, 94, 119, -19, -9, 20, -28, 27, 10, -2, 10, -2, -14, 24, 16, -6, 1, 24, -6, 10, -2, -16, 24, 17, 9, -11, 19, 6};
        private static final int $$e = 111;
        private static final byte[] $$a = {74, 60, 122, -26, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
        private static final int $$b = 159;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722303;

        public Builder(LastLocationRequest lastLocationRequest) {
            this.zza = lastLocationRequest.getMaxUpdateAgeMillis();
            this.zzb = lastLocationRequest.getGranularity();
            this.zzc = lastLocationRequest.zza();
            this.zzd = lastLocationRequest.zzb();
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
        private static void a(short r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 14
                int r7 = 98 - r7
                byte[] r0 = com.google.android.gms.location.LastLocationRequest.Builder.$$a
                int r1 = 53 - r8
                int r6 = r6 * 52
                int r6 = 55 - r6
                byte[] r1 = new byte[r1]
                int r8 = 52 - r8
                r2 = 0
                if (r0 != 0) goto L17
                r7 = r6
                r4 = r8
                r3 = r2
                goto L2e
            L17:
                r3 = r2
            L18:
                int r6 = r6 + 1
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r7
                r7 = r6
                r6 = r5
            L2e:
                int r6 = r6 + r4
                int r6 = r6 + (-10)
                r5 = r7
                r7 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LastLocationRequest.Builder.a(short, short, short, java.lang.Object[]):void");
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
        private static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 24
                int r7 = 27 - r7
                int r8 = r8 * 24
                int r0 = 25 - r8
                byte[] r1 = com.google.android.gms.location.LastLocationRequest.Builder.$$d
                int r6 = r6 * 17
                int r6 = r6 + 98
                byte[] r0 = new byte[r0]
                int r8 = 24 - r8
                r2 = 0
                if (r1 != 0) goto L18
                r3 = r7
                r4 = r2
                goto L2f
            L18:
                r3 = r2
            L19:
                int r7 = r7 + 1
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
                r5 = r3
                r3 = r7
                r7 = r5
            L2f:
                int r6 = r6 + r7
                int r6 = r6 + (-5)
                r7 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LastLocationRequest.Builder.c(byte, byte, short, java.lang.Object[]):void");
        }

        private static void b(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
            char[] cArr2 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 3291 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 31, 1199271174, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.combineMeasuredStates(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 651, (-16777172) - Color.rgb(0, 0, 0), -450685997, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
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
                setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                int i6 = $11 + 7;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 / 4;
                }
            }
            if (z) {
                char[] cArr4 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    int i8 = $10 + 51;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 % setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) >> 1];
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), Color.argb(0, 0, 0, 0) + 651, '\\' - AndroidCharacter.getMirror('0'), -450685997, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } else {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 1), Color.red(0) + 651, 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -450685997, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0262  */
        /* JADX WARN: Code duplicated, block: B:25:0x026b  */
        /* JADX WARN: Code duplicated, block: B:28:0x0278  */
        /* JADX WARN: Code duplicated, block: B:31:0x0282  */
        public final LastLocationRequest build() throws Throwable {
            Object[] objArr;
            int i;
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char scrollDefaultDelay = (char) (31533 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                int iNormalizeMetaState = 921 - KeyEvent.normalizeMetaState(0);
                int jumpTapTimeout = 28 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                byte[] bArr = $$a;
                byte b = bArr[37];
                byte b2 = bArr[80];
                Object[] objArr2 = new Object[1];
                a(b, b2, (byte) (b2 | 52), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay, iNormalizeMetaState, jumpTapTimeout, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            b(false, 262 - (ViewConfiguration.getWindowTouchSlop() >> 8), MotionEvent.axisFromString("") + 23, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 17, new char[]{'\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(true, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 265, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, (ViewConfiguration.getEdgeSlop() >> 16) + 1, new char[]{65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) (31532 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 921;
                int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 28;
                byte[] bArr2 = $$a;
                byte b3 = bArr2[37];
                Object[] objArr5 = new Object[1];
                a(b3, b3, bArr2[80], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, pressedStateDuration, iNormalizeMetaState2, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char maximumDrawingCacheSize = (char) (31533 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 921;
                    int tapTimeout = 28 - (ViewConfiguration.getTapTimeout() >> 16);
                    byte[] bArr3 = $$a;
                    Object[] objArr6 = new Object[1];
                    a(bArr3[80], bArr3[37], bArr3[33], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumDrawingCacheSize, maxKeyCode, tapTimeout, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i7 = ((int[]) objArr7[3])[0];
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i7}, (String[]) objArr7[4]};
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i8 = ~iElapsedRealtime;
                int i9 = (((-1889124621) + ((((~(i8 | 1269953819)) | (-1606286748)) | (~((-167792897) | iElapsedRealtime))) * 717)) + (((~(iElapsedRealtime | 1269953819)) | ((~(i8 | (-167792897))) | (-1606286748))) * 717)) - 839237606;
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                b(false, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 262, (ViewConfiguration.getTouchSlop() >> 8) + 26, 14 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{0, 17, 6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                b(false, 268 - Process.getGidForName(""), 17 - TextUtils.lastIndexOf("", '0', 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
                    int i13 = i12 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13;
                    if (i12 % 2 != 0) {
                        int i14 = 13 / 0;
                        if (applicationContext instanceof ContextWrapper) {
                            i = i13 + 69;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                            if (i % 2 == 0) {
                                int i15 = 83 / 0;
                                if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                    applicationContext = null;
                                }
                            } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = null;
                            }
                        }
                    } else if (applicationContext instanceof ContextWrapper) {
                        i = i13 + 69;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                        if (i % 2 == 0) {
                            int i16 = 83 / 0;
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = null;
                            }
                        } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    }
                    applicationContext = applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                b(true, 261 - View.MeasureSpec.makeMeasureSpec(0, 0), InputDeviceCompat.SOURCE_JOYSTICK + Color.rgb(0, 0, 0), 10 - (KeyEvent.getMaxKeyCode() >> 16), new char[]{65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                b(true, (ViewConfiguration.getLongPressTimeout() >> 16) + 265, Process.getGidForName("") + 17, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 16, new char[]{65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3}, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -839237606};
                    byte[] bArr4 = $$d;
                    byte b4 = bArr4[16];
                    byte b5 = b4;
                    Object[] objArr13 = new Object[1];
                    c(b4, b5, (byte) (b5 - 1), objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b6 = bArr4[16];
                    byte b7 = (byte) (b6 - 1);
                    Object[] objArr14 = new Object[1];
                    c(b7, b7, b6, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31532);
                        int keyRepeatDelay = 921 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 28;
                        byte[] bArr5 = $$a;
                        Object[] objArr16 = new Object[1];
                        a(bArr5[80], bArr5[37], bArr5[33], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, keyRepeatDelay, iResolveOpacity, -1142834547, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        b(false, TextUtils.lastIndexOf("", '0', 0, 0) + 263, TextUtils.lastIndexOf("", '0') + 23, Color.rgb(0, 0, 0) + 16777234, new char[]{'\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        b(true, 265 - ExpandableListView.getPackedPositionChild(0L), (-16777201) - Color.rgb(0, 0, 0), -TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cResolveSize = (char) (31533 - View.resolveSize(0, 0));
                            int i17 = 921 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 28;
                            byte[] bArr6 = $$a;
                            byte b8 = bArr6[37];
                            Object[] objArr19 = new Object[1];
                            a(b8, b8, bArr6[80], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSize, i17, iMakeMeasureSpec, -778300370, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c3 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                            int i18 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 920;
                            int scrollDefaultDelay2 = 28 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            byte[] bArr7 = $$a;
                            byte b9 = bArr7[37];
                            byte b10 = bArr7[80];
                            Object[] objArr20 = new Object[1];
                            a(b9, b10, (byte) (b10 | 52), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, i18, scrollDefaultDelay2, -1048449946, false, (String) objArr20[0], null);
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
            int i19 = ((int[]) objArr[1])[0];
            int i20 = ((int[]) objArr[3])[0];
            if (i20 == i19) {
                int i21 = ((int[]) objArr[0])[0];
                int i22 = ((int[]) objArr[3])[0];
                Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i22}, (String[]) objArr[4]};
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i23 = i21 + 2139271263 + ((~((~startUptimeMillis) | 1774078843)) * (-116)) + ((546065272 | startUptimeMillis) * 116) + (((~(startUptimeMillis | (-1228014372))) | 800) * 116);
                int i24 = (i23 << 13) ^ i23;
                int i25 = i24 ^ (i24 >>> 17);
                ((int[]) objArr21[0])[0] = i25 ^ (i25 << 5);
                int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i26 % 128;
                if (i26 % 2 != 0) {
                    int i27 = 3 % 4;
                }
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
                    int i29 = 2;
                    int i30 = i28 % 2;
                    int i31 = 0;
                    while (i31 < strArr.length) {
                        int i32 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i32 % 128;
                        int i33 = i32 % i29;
                        arrayList.add(strArr[i31]);
                        i31++;
                        i29 = 2;
                    }
                }
                int[] iArr = new int[i20];
                int i34 = i20 - 1;
                iArr[i34] = 1;
                Toast.makeText((Context) null, iArr[((i20 * i34) % 2) - 1], 1).show();
                int i35 = ((int[]) objArr[0])[0];
                int i36 = ((int[]) objArr[3])[0];
                Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i36}, (String[]) objArr[4]};
                int i37 = ~(System.identityHashCode(this) | 1687842954);
                int i38 = i35 + (((1857109657 + (((-86236690) | i37) * (-220))) + ((i37 | (-1706819228)) * 220)) - 37157222);
                int i39 = (i38 << 13) ^ i38;
                int i40 = i39 ^ (i39 >>> 17);
                ((int[]) objArr22[0])[0] = i40 ^ (i40 << 5);
            }
            return new LastLocationRequest(this.zza, this.zzb, this.zzc, this.zzd);
        }

        public final Builder setGranularity(int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            zzq.zza(i);
            this.zzb = i;
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder setMaxUpdateAgeMillis(long j) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            Preconditions.checkArgument(i2 % 2 == 0 ? j > 0 : j > 1, "maxUpdateAgeMillis must be greater than 0");
            this.zza = j;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public Builder() {
            this.zza = Long.MAX_VALUE;
            this.zzb = 0;
            this.zzc = false;
            this.zzd = null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r5, byte r6, int r7) {
            /*
                int r6 = r6 * 2
                int r6 = 4 - r6
                byte[] r0 = com.google.android.gms.location.LastLocationRequest.Builder.$$c
                int r7 = r7 + 119
                int r5 = r5 * 2
                int r1 = 1 - r5
                byte[] r1 = new byte[r1]
                r2 = 0
                int r5 = 0 - r5
                if (r0 != 0) goto L16
                r4 = r5
                r3 = r2
                goto L26
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r5) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L22:
                int r3 = r3 + 1
                r4 = r0[r6]
            L26:
                int r4 = -r4
                int r7 = r7 + r4
                int r6 = r6 + 1
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LastLocationRequest.Builder.$$g(short, byte, int):java.lang.String");
        }
    }
}
