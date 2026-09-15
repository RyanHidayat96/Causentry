package com.google.android.gms.maps.model;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class FeatureStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FeatureStyle> CREATOR = new zzi();
    private final Integer zza;
    private final Integer zzb;
    private final Float zzc;
    private final Float zzd;

    /* synthetic */ FeatureStyle(Builder builder, zzh zzhVar) {
        this.zza = Builder.zzc(builder);
        this.zzb = Builder.zzd(builder);
        this.zzc = Builder.zzb(builder);
        this.zzd = Builder.zza(builder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerObject(parcel, 1, getFillColor(), false);
        SafeParcelWriter.writeIntegerObject(parcel, 2, getStrokeColor(), false);
        SafeParcelWriter.writeFloatObject(parcel, 3, getStrokeWidth(), false);
        SafeParcelWriter.writeFloatObject(parcel, 4, getPointRadius(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    FeatureStyle(Integer num, Integer num2, Float f, Float f2) {
        this.zza = num;
        this.zzb = num2;
        this.zzc = f;
        this.zzd = f2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public final Integer getFillColor() {
        return this.zza;
    }

    public final Float getPointRadius() {
        return this.zzd;
    }

    public final Integer getStrokeColor() {
        return this.zzb;
    }

    public final Float getStrokeWidth() {
        return this.zzc;
    }

    public static final class Builder {
        private Integer zza;
        private Integer zzb;
        private Float zzc;
        private Float zzd;
        private static final byte[] $$c = {49, 89, 41, 48};
        private static final int $$f = 83;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {0, -94, -62, -97, 13, -1, -62, 53, 15, -5, 10, 2, -8, 11, -70, 55, -2, 20, -18, -50, 68, 5, -15, 17, -15, 5, 6, -6, -56, 69, -12, 9, 3, 6, -14, -54, 36, 37, -15, 17, -15, 5, 6, -6, -37, 48, -6};
        private static final int $$e = 29;
        private static final byte[] $$a = {32, 1, 70, -122, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 167;
        private static int b = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {1305682417, 1712000818, -1570994803, 2014411705, -1363609303, 260746122, -773248094, -1078344690, 1629820622, 835675338, 763353582, -463083080, -833409015, 80759038, 511930663, 1892097496, 2112749852, -472895489};

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r5, short r6, short r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 4
                int r5 = 84 - r5
                byte[] r0 = com.google.android.gms.maps.model.FeatureStyle.Builder.$$a
                int r7 = r7 * 15
                int r1 = r7 + 38
                int r6 = r6 * 52
                int r6 = 108 - r6
                byte[] r1 = new byte[r1]
                int r7 = r7 + 37
                r2 = 0
                if (r0 != 0) goto L19
                r4 = r6
                r5 = r7
                r3 = r2
                goto L2b
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r5
                r1[r3] = r4
                if (r3 != r7) goto L27
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L27:
                int r3 = r3 + 1
                r4 = r0[r6]
            L2b:
                int r6 = r6 + 1
                int r5 = r5 + r4
                int r5 = r5 + (-11)
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.FeatureStyle.Builder.a(int, short, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(byte r5, int r6, short r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = com.google.android.gms.maps.model.FeatureStyle.Builder.$$d
                int r6 = r6 + 98
                int r5 = r5 * 43
                int r1 = r5 + 1
                int r7 = r7 * 43
                int r7 = r7 + 4
                byte[] r1 = new byte[r1]
                r2 = -1
                if (r0 != 0) goto L15
                r6 = r5
                r4 = r7
                r3 = r2
                goto L28
            L15:
                r3 = r2
            L16:
                int r3 = r3 + 1
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r5) goto L26
                java.lang.String r5 = new java.lang.String
                r6 = 0
                r5.<init>(r1, r6)
                r8[r6] = r5
                return
            L26:
                r4 = r0[r7]
            L28:
                int r7 = r7 + 1
                int r6 = r6 + r4
                int r6 = r6 + r2
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.FeatureStyle.Builder.d(byte, int, short, java.lang.Object[]):void");
        }

        public final FeatureStyle build() {
            int i = 2 % 2;
            FeatureStyle featureStyle = new FeatureStyle(this, null);
            int i2 = b + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return featureStyle;
        }

        private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = -1870535734;
            int i4 = 1;
            int i5 = 0;
            if (iArr2 != null) {
                int i6 = $10 + 11;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i8 = 0;
                while (i8 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i5] = Integer.valueOf(iArr2[i8]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) i5;
                            byte b3 = (byte) (b2 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3291, MotionEvent.axisFromString("") + 32, 1948206109, false, $$g(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i8++;
                        i3 = -1870535734;
                        i5 = 0;
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
            int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            char c = '0';
            if (iArr5 != null) {
                int i9 = $11 + 111;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i11 = 0;
                while (i11 < length3) {
                    Object[] objArr3 = new Object[i4];
                    objArr3[0] = Integer.valueOf(iArr5[i11]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.MeasureSpec.getSize(0), 3290 - TextUtils.lastIndexOf("", c, 0, 0), Color.red(0) + 31, 1948206109, false, $$g(b4, b5, (byte) (-b5)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i11++;
                    iArr5 = iArr5;
                    c = '0';
                    i4 = 1;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            int i12 = 2;
            sessionConfigValidatingBuilder.b = 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                int i13 = $10 + 101;
                $11 = i13 % 128;
                int i14 = i13 % i12;
                cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                int i15 = 17;
                for (int i16 = 1; i15 > i16; i16 = 1) {
                    int i17 = $11 + 39;
                    $10 = i17 % 128;
                    if (i17 % 2 != 0) {
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                        Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.resolveSizeAndState(0, 0, 0), Color.rgb(0, 0, 0) + 16779775, 29 - (ViewConfiguration.getTouchSlop() >> 8), 683220507, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                        i15 += 87;
                    } else {
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                        Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2560, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29, 683220507, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                        i15--;
                    }
                }
                int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr6 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28879 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 347 - TextUtils.lastIndexOf("", '0', 0, 0), 25 - KeyEvent.normalizeMetaState(0), -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
                cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                sessionConfigValidatingBuilder.b += 2;
                i12 = 2;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public final Builder fillColor(int i) throws Throwable {
            Object[] objArr;
            char c;
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
            b = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char scrollBarFadeDuration = (char) (43042 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                int iLastIndexOf = 3110 - TextUtils.lastIndexOf("", '0', 0);
                int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22;
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                a(bArr[7], bArr[37], bArr[1], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, iLastIndexOf, scrollBarFadeDuration2, -1272852037, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new int[]{-228319893, -113112354, 1157791016, 2056074945, -1918997874, -1747103400, -1336561848, -1621468929, 1996012021, -98912009, 265919680, 1694426402, -1457965292, -1325689401}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new int[]{1817949633, 1277735346, -70035361, -1579463695, -32902472, 1040824510, -845159719, 1637624453, 50321413, -502263742}, 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cMakeMeasureSpec = (char) (43042 - View.MeasureSpec.makeMeasureSpec(0, 0));
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 3112;
                int packedPositionChild = 21 - ExpandableListView.getPackedPositionChild(0L);
                byte[] bArr2 = $$a;
                byte b2 = bArr2[7];
                byte b3 = bArr2[1];
                Object[] objArr5 = new Object[1];
                a(b2, b3, b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, iLastIndexOf2, packedPositionChild, -1269618118, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 43042);
                    int tapTimeout = 3111 - (ViewConfiguration.getTapTimeout() >> 16);
                    int packedPositionChild2 = 21 - ExpandableListView.getPackedPositionChild(0L);
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr6 = new Object[1];
                    a(b4, b5, b5, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(jumpTapTimeout, tapTimeout, packedPositionChild2, 154975793, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i5 = ((int[]) objArr7[2])[0];
                int i6 = ((int[]) objArr7[1])[0];
                String[] strArr = (String[]) objArr7[3];
                int[] iArr = {i5};
                int[] iArr2 = {i6};
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i7 = (~((-703177064) | iElapsedRealtime)) | 698417443;
                int i8 = ~((~iElapsedRealtime) | 1006614015);
                int i9 = (-751252124) + ((i7 | i8) * (-470)) + (((~(iElapsedRealtime | (-4759621))) | i8) * 470) + 1614699758;
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
                objArr = new Object[]{new int[1], iArr2, iArr, strArr};
                c = 2;
            } else {
                int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
                b = i12 % 128;
                int i13 = i12 % 2;
                try {
                    Object[] objArr8 = {null, Integer.valueOf(i), 0, 1614699758};
                    byte[] bArr3 = $$d;
                    byte b6 = (byte) (-bArr3[5]);
                    Object[] objArr9 = new Object[1];
                    d(b6, b6, bArr3[0], objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    byte b7 = bArr3[0];
                    Object[] objArr10 = new Object[1];
                    d(b7, b7, (byte) (-bArr3[5]), objArr10);
                    objArr = (Object[]) cls2.getMethod((String) objArr10[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char absoluteGravity = (char) (43042 - Gravity.getAbsoluteGravity(0, 0));
                        int gidForName = 3110 - Process.getGidForName("");
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 23;
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr11 = new Object[1];
                        a(b8, b9, b9, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(absoluteGravity, gidForName, iIndexOf, 154975793, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr12 = new Object[1];
                        c(new int[]{-228319893, -113112354, 1157791016, 2056074945, -1918997874, -1747103400, -1336561848, -1621468929, 1996012021, -98912009, 265919680, 1694426402, -1457965292, -1325689401}, (KeyEvent.getMaxKeyCode() >> 16) + 22, objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        c(new int[]{1817949633, 1277735346, -70035361, -1579463695, -32902472, 1040824510, -845159719, 1637624453, 50321413, -502263742}, KeyEvent.keyCodeFromString("") + 15, objArr13);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43042);
                            int iBlue = 3111 - Color.blue(0);
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 22;
                            byte[] bArr4 = $$a;
                            byte b10 = bArr4[7];
                            byte b11 = bArr4[1];
                            Object[] objArr14 = new Object[1];
                            a(b10, b11, b11, objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity, iBlue, iResolveOpacity, -1269618118, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char capsMode = (char) (43042 - TextUtils.getCapsMode("", 0, 0));
                            int iBlue2 = 3111 - Color.blue(0);
                            int iArgb = Color.argb(0, 0, 0, 0) + 22;
                            byte[] bArr5 = $$a;
                            Object[] objArr15 = new Object[1];
                            a(bArr5[7], bArr5[37], bArr5[1], objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(capsMode, iBlue2, iArgb, -1272852037, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i14 = b + 33;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                        c = 2;
                        int i15 = i14 % 2;
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
            int i16 = ((int[]) objArr[1])[0];
            int i17 = ((int[]) objArr[c])[0];
            if (i17 == i16) {
                Object[] objArr16 = new Object[4];
                objArr16[0] = new int[1];
                objArr16[1] = new int[]{i};
                objArr16[c] = new int[]{i};
                int i18 = ((int[]) objArr[0])[0];
                int i19 = ((int[]) objArr[c])[0];
                int i20 = ((int[]) objArr[1])[0];
                String[] strArr2 = (String[]) objArr[3];
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i21 = i18 + (-274900658) + ((~(1000339199 | iUptimeMillis)) * (-301)) + (((~((-713671360) | iUptimeMillis)) | (~((~iUptimeMillis) | 991360099))) * (-301)) + (((~(iUptimeMillis | (-991360100))) | (-713671360)) * 301);
                int i22 = (i21 << 13) ^ i21;
                int i23 = i22 ^ (i22 >>> 17);
                ((int[]) objArr16[0])[0] = i23 ^ (i23 << 5);
                objArr16[3] = strArr2;
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[3];
                if (strArr3 != null) {
                    int i24 = b + 13;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i24 % 128;
                    int i25 = i24 % 2;
                    for (String str : strArr3) {
                        arrayList.add(str);
                    }
                }
                int[] iArr3 = new int[i17];
                int i26 = i17 - 1;
                iArr3[i26] = 1;
                Toast.makeText((Context) null, iArr3[((i17 * i26) % 2) - 1], 1).show();
                int i27 = ((int[]) objArr[0])[0];
                int i28 = ((int[]) objArr[2])[0];
                int i29 = ((int[]) objArr[1])[0];
                String[] strArr4 = (String[]) objArr[3];
                int[] iArr4 = {i28};
                int iMyUid = Process.myUid();
                int i30 = ~(898438150 | iMyUid);
                int i31 = i27 + (-1908187758) + ((1221400 | i30) * (-814)) + ((i30 | (~((~iMyUid) | (-806593309))) | 93066242) * 407) + (((~(iMyUid | 806593308)) | (~((-898438151) | iMyUid)) | 93066242) * 407);
                int i32 = (i31 << 13) ^ i31;
                int i33 = i32 ^ (i32 >>> 17);
                ((int[]) objArr[0])[0] = i33 ^ (i33 << 5);
                Object[] objArr17 = {new int[1], new int[]{i29}, iArr4, strArr4};
            }
            this.zza = Integer.valueOf(i);
            return this;
        }

        public final Builder strokeColor(int i) {
            int i2 = 2 % 2;
            int i3 = b + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            this.zzb = Integer.valueOf(i);
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 21 / 0;
            }
            return this;
        }

        public final Builder strokeWidth(float f) {
            boolean z;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 33;
            b = i3 % 128;
            if (i3 % 2 == 0 ? f < 0.0f : f < 2.0f) {
                z = false;
            } else {
                int i4 = i2 + 113;
                int i5 = i4 % 128;
                b = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 3 % 2;
                }
                z = true;
            }
            Preconditions.checkArgument(z, "Stroke width cannot be negative.");
            this.zzc = Float.valueOf(f);
            return this;
        }

        public final Builder pointRadius(float f) {
            boolean z;
            int i = 2 % 2;
            int i2 = b + 43;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            if (i2 % 2 != 0 ? f < 0.0f : f < 1.0f) {
                int i4 = i3 + 37;
                b = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, "Point radius cannot be negative.");
            Preconditions.checkArgument(f <= 128.0f, "The max allowed pointRadius value is 128px.");
            this.zzd = Float.valueOf(f);
            return this;
        }

        static /* synthetic */ Float zza(Builder builder) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
            int i3 = i2 % 128;
            b = i3;
            int i4 = i2 % 2;
            Float f = builder.zzd;
            int i5 = i3 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 88 / 0;
            }
            return f;
        }

        static /* synthetic */ Float zzb(Builder builder) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 57;
            b = i3 % 128;
            int i4 = i3 % 2;
            Float f = builder.zzc;
            int i5 = i2 + 125;
            b = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        static /* synthetic */ Integer zzc(Builder builder) {
            int i = 2 % 2;
            int i2 = b + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Integer num = builder.zza;
            if (i3 != 0) {
                return num;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static /* synthetic */ Integer zzd(Builder builder) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 115;
            b = i3 % 128;
            int i4 = i3 % 2;
            Integer num = builder.zzb;
            if (i4 != 0) {
                int i5 = 24 / 0;
            }
            int i6 = i2 + 27;
            b = i6 % 128;
            int i7 = i6 % 2;
            return num;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r6, short r7, short r8) {
            /*
                int r8 = r8 + 4
                byte[] r0 = com.google.android.gms.maps.model.FeatureStyle.Builder.$$c
                int r7 = r7 * 56
                int r7 = 122 - r7
                int r6 = r6 * 2
                int r1 = 1 - r6
                byte[] r1 = new byte[r1]
                r2 = 0
                int r6 = 0 - r6
                if (r0 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L2c
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                int r8 = r8 + 1
                r1[r3] = r4
                if (r3 != r6) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L24:
                int r3 = r3 + 1
                r4 = r0[r8]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2c:
                int r8 = -r8
                int r7 = r7 + r8
                r8 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.FeatureStyle.Builder.$$g(short, short, short):java.lang.String");
        }
    }
}
