package com.google.android.gms.fido.fido2.api.common;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes6.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new zzak();
    private final PublicKeyCredentialRpEntity zza;
    private final PublicKeyCredentialUserEntity zzb;
    private final byte[] zzc;
    private final List zzd;
    private final Double zze;
    private final List zzf;
    private final AuthenticatorSelectionCriteria zzg;
    private final Integer zzh;
    private final TokenBinding zzi;
    private final AttestationConveyancePreference zzj;
    private final AuthenticationExtensions zzk;

    public static final class Builder {
        private PublicKeyCredentialRpEntity zza;
        private PublicKeyCredentialUserEntity zzb;
        private byte[] zzc;
        private List zzd;
        private Double zze;
        private List zzf;
        private AuthenticatorSelectionCriteria zzg;
        private Integer zzh;
        private TokenBinding zzi;
        private AttestationConveyancePreference zzj;
        private AuthenticationExtensions zzk;
        private static final byte[] $$c = {49, 84, -120, 101};
        private static final int $$d = 38;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {82, Base64.padSymbol, -66, -42, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 21;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int asInterface = 1;
        private static char TuitionPaymentFragmentbindingInflater1 = 18532;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 12223;
        private static char b = 53586;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 52359;

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r7, short r8, int r9, java.lang.Object[] r10) {
            /*
                int r9 = 53 - r9
                byte[] r0 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder.$$a
                int r7 = r7 * 52
                int r7 = 56 - r7
                int r8 = r8 * 14
                int r8 = 98 - r8
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L15
                r8 = r7
                r3 = r9
                r5 = r2
                goto L2d
            L15:
                r3 = r2
            L16:
                r6 = r8
                r8 = r7
                r7 = r6
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r9) goto L28
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L28:
                r3 = r0[r8]
                r6 = r8
                r8 = r7
                r7 = r6
            L2d:
                int r3 = -r3
                int r7 = r7 + 1
                int r8 = r8 + r3
                int r8 = r8 + (-11)
                r3 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder.a(short, short, int, java.lang.Object[]):void");
        }

        public final PublicKeyCredentialCreationOptions build() {
            String string;
            int i = 2 % 2;
            int i2 = asInterface + 21;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            int i4 = i2 % 2;
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.zza;
            PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.zzb;
            byte[] bArr = this.zzc;
            List list = this.zzd;
            Double d = this.zze;
            List list2 = this.zzf;
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.zzg;
            Integer num = this.zzh;
            TokenBinding tokenBinding = this.zzi;
            AttestationConveyancePreference attestationConveyancePreference = this.zzj;
            if (attestationConveyancePreference == null) {
                int i5 = i3 + 3;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                string = null;
            } else {
                string = attestationConveyancePreference.toString();
            }
            return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, list, d, list2, authenticatorSelectionCriteria, num, tokenBinding, string, this.zzk);
        }

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
            char[] cArr2 = new char[cArr.length - 2];
            oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
            char[] cArr3 = new char[2];
            while (true) {
                int i3 = 0;
                if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                    break;
                }
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                int i4 = 58224;
                int i5 = 0;
                while (i5 < 16) {
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i6 = (c2 + i4) ^ ((c2 << 4) + ((char) (((long) b) ^ 8611973335120459638L)));
                    int i7 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        objArr2[2] = Integer.valueOf(i7);
                        objArr2[1] = Integer.valueOf(i6);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 47774);
                            int iCombineMeasuredStates = View.combineMeasuredStates(i3, i3) + 468;
                            int trimmedLength = 13 - TextUtils.getTrimmedLength("");
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, iCombineMeasuredStates, trimmedLength, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        int i8 = i5;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 468 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getPressedStateDuration() >> 16) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i4 -= 40503;
                        i5 = i8 + 1;
                        int i9 = $11 + 5;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 2322 - TextUtils.lastIndexOf("", '0', 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 44, -1312321721, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2, 0, i);
            int i11 = $10 + 97;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }

        public final Builder setChallenge(byte[] bArr) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int iIndexOf = 651 - TextUtils.indexOf("", "", 0);
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 44;
                byte[] bArr2 = $$a;
                byte b2 = bArr2[5];
                Object[] objArr2 = new Object[1];
                a(b2, b2, bArr2[7], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, iIndexOf, scrollDefaultDelay, -459846511, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{49857, 5390, 39787, 3307, 22232, 21894, 5835, 25711, 36585, 23813, 28317, 26584, 485, 9139, 9877, 27642, 16781, 14801, 19063, 5255, 2712, 12966, 13693, 37343}, 22 - TextUtils.indexOf("", ""), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{48072, 59420, 24001, 46494, 2965, 49624, 26278, 33002, 60416, 34388, 53427, 19801, 34445, 321, 5811, 64215, 22852, 37735}, 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cGreen = (char) Color.green(0);
                int i2 = 652 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 44;
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr5 = new Object[1];
                a(b3, b4, (byte) (b4 | 52), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cGreen, i2, maxKeyCode, -873460649, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 651;
                    int iIndexOf2 = 44 - TextUtils.indexOf("", "", 0, 0);
                    byte[] bArr3 = $$a;
                    byte b5 = bArr3[7];
                    byte b6 = bArr3[5];
                    Object[] objArr6 = new Object[1];
                    a(b5, b6, (byte) (b6 | 14), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, pressedStateDuration, iIndexOf2, -1595579076, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i5 = ((int[]) objArr7[2])[0];
                int i6 = ((int[]) objArr7[0])[0];
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i7 = (-434141863) + (((~(iUptimeMillis | 665901783)) | 662470973) * (-668)) + ((665901783 | (~(662470973 | iUptimeMillis))) * 1336) + ((iUptimeMillis | 670882815) * 668) + 1277719187;
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[3])[0] = i9 ^ (i9 << 5);
            } else {
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.resolveSize(0, 0), 1610 - ((Process.getThreadPriority(0) + 20) >> 6), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 26, 2145681644, false, null, new Class[0]);
                    }
                    Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 1277719187, 0};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cArgb = (char) Color.argb(0, 0, 0, 0);
                        int bitsPerPixel = 650 - ImageFormat.getBitsPerPixel(0);
                        int iLastIndexOf = 43 - TextUtils.lastIndexOf("", '0');
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr9 = new Object[1];
                        a(b7, b8, (byte) (b8 | 52), objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, bitsPerPixel, iLastIndexOf, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 695 - (ViewConfiguration.getLongPressTimeout() >> 16), 98 - Color.green(0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63405 - TextUtils.indexOf((CharSequence) "", '0')), ExpandableListView.getPackedPositionGroup(0L) + 793, (KeyEvent.getMaxKeyCode() >> 16) + 83), Integer.TYPE, Integer.TYPE});
                    }
                    Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char mode = (char) View.MeasureSpec.getMode(0);
                        int threadPriority = 651 - ((Process.getThreadPriority(0) + 20) >> 6);
                        int longPressTimeout = 44 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[7];
                        byte b10 = bArr4[5];
                        Object[] objArr11 = new Object[1];
                        a(b9, b10, (byte) (b10 | 14), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode, threadPriority, longPressTimeout, -1595579076, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                    try {
                        Object[] objArr12 = new Object[1];
                        c(new char[]{49857, 5390, 39787, 3307, 22232, 21894, 5835, 25711, 36585, 23813, 28317, 26584, 485, 9139, 9877, 27642, 16781, 14801, 19063, 5255, 2712, 12966, 13693, 37343}, 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr12);
                        Class<?> cls2 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        c(new char[]{48072, 59420, 24001, 46494, 2965, 49624, 26278, 33002, 60416, 34388, 53427, 19801, 34445, 321, 5811, 64215, 22852, 37735}, TextUtils.lastIndexOf("", '0', 0, 0) + 16, objArr13);
                        long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int absoluteGravity = 651 - Gravity.getAbsoluteGravity(0, 0);
                            int pressedStateDuration2 = 44 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            byte b11 = $$a[7];
                            byte b12 = b11;
                            Object[] objArr14 = new Object[1];
                            a(b11, b12, (byte) (b12 | 52), objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, absoluteGravity, pressedStateDuration2, -873460649, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 651;
                            int iAxisFromString = MotionEvent.axisFromString("") + 45;
                            byte[] bArr5 = $$a;
                            byte b13 = bArr5[5];
                            Object[] objArr15 = new Object[1];
                            a(b13, b13, bArr5[7], objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf, keyRepeatTimeout, iAxisFromString, -459846511, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                        objArr = objArr10;
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
            if (((int[]) objArr[2])[0] == ((int[]) objArr[0])[0]) {
                Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i10 = ((int[]) objArr[3])[0];
                int i11 = ((int[]) objArr[2])[0];
                int i12 = ((int[]) objArr[0])[0];
                int i13 = ~((int) Runtime.getRuntime().freeMemory());
                int i14 = i10 + 1557357595 + (((-327159938) | i13) * 494) + (((~(i13 | (-328218866))) | 5548666) * 494);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr16[3])[0] = i16 ^ (i16 << 5);
                this.zzc = (byte[]) Preconditions.checkNotNull(bArr);
                return this;
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr == null) {
                throw null;
            }
            int i17 = asInterface + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 4 / 2;
            }
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }

        public final Builder setParameters(List<PublicKeyCredentialParameters> list) {
            int i = 2 % 2;
            int i2 = asInterface + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            this.zzd = (List) Preconditions.checkNotNull(list);
            int i4 = asInterface + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final Builder setRp(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            this.zza = (PublicKeyCredentialRpEntity) Preconditions.checkNotNull(publicKeyCredentialRpEntity);
            int i4 = asInterface + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 18 / 0;
            }
            return this;
        }

        public final Builder setUser(PublicKeyCredentialUserEntity publicKeyCredentialUserEntity) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            this.zzb = (PublicKeyCredentialUserEntity) Preconditions.checkNotNull(publicKeyCredentialUserEntity);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 90 / 0;
            }
            return this;
        }

        public final Builder setAttestationConveyancePreference(AttestationConveyancePreference attestationConveyancePreference) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            this.zzj = attestationConveyancePreference;
            int i5 = i3 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder setAuthenticationExtensions(AuthenticationExtensions authenticationExtensions) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 53;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            this.zzk = authenticationExtensions;
            int i5 = i2 + 45;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 20 / 0;
            }
            return this;
        }

        public final Builder setAuthenticatorSelection(AuthenticatorSelectionCriteria authenticatorSelectionCriteria) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            this.zzg = authenticatorSelectionCriteria;
            int i5 = i3 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setExcludeList(List<PublicKeyCredentialDescriptor> list) {
            int i = 2 % 2;
            int i2 = asInterface + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            this.zzf = list;
            if (i3 != 0) {
                int i4 = 89 / 0;
            }
            return this;
        }

        public final Builder setRequestId(Integer num) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            this.zzh = num;
            int i5 = i3 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder setTimeoutSeconds(Double d) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            this.zze = d;
            if (i3 == 0) {
                int i4 = 11 / 0;
            }
            return this;
        }

        public final Builder setTokenBinding(TokenBinding tokenBinding) {
            int i = 2 % 2;
            int i2 = asInterface + 79;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            int i4 = i2 % 2;
            this.zzi = tokenBinding;
            int i5 = i3 + 61;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 53 / 0;
            }
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(int r5, short r6, int r7) {
            /*
                int r7 = r7 * 2
                int r0 = 1 - r7
                int r5 = r5 * 3
                int r5 = 108 - r5
                byte[] r1 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder.$$c
                int r6 = r6 * 4
                int r6 = r6 + 4
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                if (r1 != 0) goto L18
                r4 = r6
                r3 = r2
                goto L28
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r5
                r0[r3] = r4
                if (r3 != r7) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L24:
                int r3 = r3 + 1
                r4 = r1[r6]
            L28:
                int r6 = r6 + 1
                int r5 = r5 + r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder.$$e(int, short, int):java.lang.String");
        }
    }

    PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, byte[] bArr, List list, Double d, List list2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions) {
        this.zza = (PublicKeyCredentialRpEntity) Preconditions.checkNotNull(publicKeyCredentialRpEntity);
        this.zzb = (PublicKeyCredentialUserEntity) Preconditions.checkNotNull(publicKeyCredentialUserEntity);
        this.zzc = (byte[]) Preconditions.checkNotNull(bArr);
        this.zzd = (List) Preconditions.checkNotNull(list);
        this.zze = d;
        this.zzf = list2;
        this.zzg = authenticatorSelectionCriteria;
        this.zzh = num;
        this.zzi = tokenBinding;
        if (str != null) {
            try {
                this.zzj = AttestationConveyancePreference.fromString(str);
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            this.zzj = null;
        }
        this.zzk = authenticationExtensions;
    }

    public static PublicKeyCredentialCreationOptions deserializeFromBytes(byte[] bArr) {
        return (PublicKeyCredentialCreationOptions) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        return Objects.equal(this.zza, publicKeyCredentialCreationOptions.zza) && Objects.equal(this.zzb, publicKeyCredentialCreationOptions.zzb) && Arrays.equals(this.zzc, publicKeyCredentialCreationOptions.zzc) && Objects.equal(this.zze, publicKeyCredentialCreationOptions.zze) && this.zzd.containsAll(publicKeyCredentialCreationOptions.zzd) && publicKeyCredentialCreationOptions.zzd.containsAll(this.zzd) && (((list = this.zzf) == null && publicKeyCredentialCreationOptions.zzf == null) || (list != null && (list2 = publicKeyCredentialCreationOptions.zzf) != null && list.containsAll(list2) && publicKeyCredentialCreationOptions.zzf.containsAll(this.zzf))) && Objects.equal(this.zzg, publicKeyCredentialCreationOptions.zzg) && Objects.equal(this.zzh, publicKeyCredentialCreationOptions.zzh) && Objects.equal(this.zzi, publicKeyCredentialCreationOptions.zzi) && Objects.equal(this.zzj, publicKeyCredentialCreationOptions.zzj) && Objects.equal(this.zzk, publicKeyCredentialCreationOptions.zzk);
    }

    public int hashCode() {
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.zza;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.zzb;
        int iHashCode = Arrays.hashCode(this.zzc);
        return Objects.hashCode(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, Integer.valueOf(iHashCode), this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getRp(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getUser(), i, false);
        SafeParcelWriter.writeByteArray(parcel, 4, getChallenge(), false);
        SafeParcelWriter.writeTypedList(parcel, 5, getParameters(), false);
        SafeParcelWriter.writeDoubleObject(parcel, 6, getTimeoutSeconds(), false);
        SafeParcelWriter.writeTypedList(parcel, 7, getExcludeList(), false);
        SafeParcelWriter.writeParcelable(parcel, 8, getAuthenticatorSelection(), i, false);
        SafeParcelWriter.writeIntegerObject(parcel, 9, getRequestId(), false);
        SafeParcelWriter.writeParcelable(parcel, 10, getTokenBinding(), i, false);
        SafeParcelWriter.writeString(parcel, 11, getAttestationConveyancePreferenceAsString(), false);
        SafeParcelWriter.writeParcelable(parcel, 12, getAuthenticationExtensions(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public AttestationConveyancePreference getAttestationConveyancePreference() {
        return this.zzj;
    }

    public String getAttestationConveyancePreferenceAsString() {
        AttestationConveyancePreference attestationConveyancePreference = this.zzj;
        if (attestationConveyancePreference == null) {
            return null;
        }
        return attestationConveyancePreference.toString();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public AuthenticationExtensions getAuthenticationExtensions() {
        return this.zzk;
    }

    public AuthenticatorSelectionCriteria getAuthenticatorSelection() {
        return this.zzg;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] getChallenge() {
        return this.zzc;
    }

    public List<PublicKeyCredentialDescriptor> getExcludeList() {
        return this.zzf;
    }

    public List<PublicKeyCredentialParameters> getParameters() {
        return this.zzd;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public Integer getRequestId() {
        return this.zzh;
    }

    public PublicKeyCredentialRpEntity getRp() {
        return this.zza;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public Double getTimeoutSeconds() {
        return this.zze;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public TokenBinding getTokenBinding() {
        return this.zzi;
    }

    public PublicKeyCredentialUserEntity getUser() {
        return this.zzb;
    }
}
