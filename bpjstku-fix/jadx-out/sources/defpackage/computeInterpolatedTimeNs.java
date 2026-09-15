package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public final class computeInterpolatedTimeNs<T> extends deriveCodec<T> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> TuitionPaymentFragmentbindingInflater1;
    private T b;

    public computeInterpolatedTimeNs(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, T t) {
        this.TuitionPaymentFragmentbindingInflater1 = autoValue_VideoValidatedEncoderProfilesProxy;
        this.b = t;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super T> getdefaultvideoprofile) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentbindingInflater1(getdefaultvideoprofile, this.b));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentbindingInflater1<T> implements deriveMediaType<T>, BufferProviderState {
        private static short[] asInterface;
        private T TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private getDefaultVideoProfile<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private T b;
        private static final byte[] $$c = {7, 15, 25, 25};
        private static final int $$d = 81;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {6, 51, 46, 31, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 65;
        private static int g = 0;
        private static int cancel = 1;
        private static int TuitionPaymentFragmentbindingInflater1 = -1159147805;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f878a = -1934795570;
        private static int asBinder = -2107694525;
        private static byte[] d = {-38, -50, -47, -69, -20, -38, -61, -45, -56, -68, -65, 9, -34, -109, 24, -55, -56, -41, -92, -52, -89, 107, ByteCompanionObject.MAX_VALUE, 108, 123, 70, 119, 78, 101, 114, 97, 126, 66, 108, 122, -26, -26};

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 14
                int r8 = 98 - r8
                int r6 = r6 * 52
                int r6 = r6 + 4
                int r0 = 53 - r7
                byte[] r1 = computeInterpolatedTimeNs.TuitionPaymentFragmentbindingInflater1.$$a
                byte[] r0 = new byte[r0]
                int r7 = 52 - r7
                r2 = 0
                if (r1 != 0) goto L17
                r3 = r8
                r4 = r2
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
                int r3 = r3 + 1
                r4 = r1[r6]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2e:
                int r3 = r3 + r6
                int r6 = r3 + (-11)
                int r8 = r8 + 1
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: computeInterpolatedTimeNs.TuitionPaymentFragmentbindingInflater1.c(short, short, short, java.lang.Object[]):void");
        }

        TuitionPaymentFragmentbindingInflater1(getDefaultVideoProfile<? super T> getdefaultvideoprofile, T t) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getdefaultvideoprofile;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = t;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            int i = 2 % 2;
            int i2 = cancel + 103;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = DisposableHelper.DISPOSED;
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = DisposableHelper.DISPOSED;
                int i3 = 72 / 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0072  */
        /* JADX WARN: Code duplicated, block: B:47:0x01bd A[PHI: r0
  0x01bd: PHI (r0v9 int) = (r0v8 int), (r0v38 int) binds: [B:46:0x01bb, B:43:0x01a9] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:48:0x01bf A[PHI: r0
  0x01bf: PHI (r0v35 int) = (r0v8 int), (r0v38 int) binds: [B:46:0x01bb, B:43:0x01a9] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:50:0x01c9  */
        private static void e(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
            boolean z;
            int i4;
            int i5;
            boolean z2;
            int i6;
            int i7 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(f878a)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", ""), KeyEvent.getDeadChar(0, 0) + 2267, Color.red(0) + 33, 1387473586, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i8 = $11 + 3;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    int i9 = $11 + 31;
                    int i10 = i9 % 128;
                    $10 = i10;
                    int i11 = i9 % 2;
                    byte[] bArr = d;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i12 = i10 + 121;
                        $11 = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i13 = 2 / 5;
                        }
                        for (int i14 = 0; i14 < length; i14++) {
                            int i15 = $11 + 65;
                            $10 = i15 % 128;
                            int i16 = i15 % 2;
                            Object[] objArr3 = {Integer.valueOf(bArr[i14])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cBlue = (char) Color.blue(0);
                                int iRed = 3358 - Color.red(0);
                                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 19;
                                byte length2 = (byte) $$c.length;
                                byte b4 = (byte) (length2 - 4);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, iRed, modifierMetaStateMask, -1054011043, false, $$e(length2, b4, b4), new Class[]{Integer.TYPE});
                            }
                            bArr2[i14] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = d;
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf((CharSequence) "", '0') + 2268, 32 - TextUtils.lastIndexOf("", '0'), 1387473586, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) f878a) ^ 3046761265686732006L)));
                    } else {
                        iIntValue = (short) (((short) (((long) asInterface[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) f878a) ^ 3046761265686732006L)));
                    }
                }
                if (iIntValue > 0) {
                    int i17 = $10 + 57;
                    int i18 = i17 % 128;
                    $11 = i18;
                    if (i17 % 2 == 0) {
                        i4 = ((i3 >>> iIntValue) >> 4) / ((int) (((long) TuitionPaymentFragmentbindingInflater1) | 3046761265686732006L));
                        if (z) {
                            i5 = 1;
                        } else {
                            i6 = i18 + 35;
                            $10 = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i19 = 5 % 5;
                            }
                            i5 = 0;
                        }
                    } else {
                        i4 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L));
                        if (z) {
                            i5 = 1;
                        } else {
                            i6 = i18 + 35;
                            $10 = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i110 = 5 % 5;
                            }
                            i5 = 0;
                        }
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i4 + i5;
                    Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(asBinder), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 55905);
                        int iBlue = Color.blue(0) + 2855;
                        int iMakeMeasureSpec = 13 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte b7 = (byte) ($$d & 7);
                        byte b8 = (byte) (b7 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, iBlue, iMakeMeasureSpec, -1529949196, false, $$e(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr4 = d;
                    if (bArr4 != null) {
                        int length3 = bArr4.length;
                        byte[] bArr5 = new byte[length3];
                        int i20 = 0;
                        while (i20 < length3) {
                            int i21 = $11 + 19;
                            $10 = i21 % 128;
                            if (i21 % 2 != 0) {
                                bArr5[i20] = (byte) (((long) bArr4[i20]) ^ 3046761265686732006L);
                            } else {
                                bArr5[i20] = (byte) (((long) bArr4[i20]) ^ 3046761265686732006L);
                                i20++;
                            }
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i22 = $11 + 59;
                        $10 = i22 % 128;
                        int i23 = i22 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        if (z2) {
                            byte[] bArr6 = d;
                            int i24 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i24 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i24]) ^ 3046761265686732006L)) + s)) ^ b));
                        } else {
                            short[] sArr = asInterface;
                            int i25 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i25 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i25]) ^ 3046761265686732006L)) + s)) ^ b));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                int iIndexOf = 650 - TextUtils.indexOf((CharSequence) "", '0');
                int touchSlop = 44 - (ViewConfiguration.getTouchSlop() >> 8);
                byte[] bArr = $$a;
                byte b = bArr[7];
                Object[] objArr2 = new Object[1];
                c(b, b, bArr[80], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, iIndexOf, touchSlop, -459846511, false, (String) objArr2[0], null);
            }
            Object obj = null;
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            e((-250773060) - (ViewConfiguration.getJumpTapTimeout() >> 16), Color.blue(0) - 18, (short) ((-51) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (byte) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (-910529029) - (ViewConfiguration.getEdgeSlop() >> 16), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e((-250773057) - MotionEvent.axisFromString(""), (-25) - View.MeasureSpec.makeMeasureSpec(0, 0), (short) (View.resolveSizeAndState(0, 0, 0) + 107), (byte) Color.green(0), TextUtils.indexOf("", "") - 910529008, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int maximumDrawingCacheSize = 651 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 44;
                byte[] bArr2 = $$a;
                Object[] objArr5 = new Object[1];
                c(bArr2[80], (byte) (bArr2[1] + 1), bArr2[7], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, maximumDrawingCacheSize, iMakeMeasureSpec, -873460649, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                    int scrollBarFadeDuration = 651 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 44;
                    byte b2 = $$a[80];
                    byte b3 = b2;
                    Object[] objArr6 = new Object[1];
                    c(b3, (byte) (b3 | 14), b2, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType, scrollBarFadeDuration, edgeSlop, -1595579076, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i2 = ((int[]) objArr7[2])[0];
                int i3 = ((int[]) objArr7[0])[0];
                int iIdentityHashCode = System.identityHashCode(this);
                int i4 = 1406778862 + (((~((~iIdentityHashCode) | 459978306)) | (-469745631)) * (-245));
                int i5 = ~(iIdentityHashCode | 459978306);
                int i6 = i4 + (i5 * (-245)) + ((i5 | 463409116) * 245) + 144008791;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[3])[0] = i8 ^ (i8 << 5);
            } else {
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), View.resolveSize(0, 0) + 1610, 26 - View.resolveSize(0, 0), 2145681644, false, null, new Class[0]);
                    }
                    Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 144008791, 0};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 651;
                        int defaultSize = View.getDefaultSize(0, 0) + 44;
                        byte[] bArr3 = $$a;
                        Object[] objArr9 = new Object[1];
                        c(bArr3[80], (byte) (bArr3[1] + 1), bArr3[7], objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString, touchSlop2, defaultSize, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.getMaxKeyCode() >> 16), 695 - View.resolveSize(0, 0), 98 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf((CharSequence) "", '0') + 63407), TextUtils.getOffsetBefore("", 0) + 793, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 83), Integer.TYPE, Integer.TYPE});
                    }
                    Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 652;
                        int i9 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44;
                        byte b4 = $$a[80];
                        byte b5 = b4;
                        Object[] objArr11 = new Object[1];
                        c(b5, (byte) (b5 | 14), b4, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(windowTouchSlop, iLastIndexOf, i9, -1595579076, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                    try {
                        Object[] objArr12 = new Object[1];
                        e(TextUtils.getTrimmedLength("") - 250773060, (-18) - (ViewConfiguration.getTapTimeout() >> 16), (short) (View.resolveSize(0, 0) - 52), (byte) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), MotionEvent.axisFromString("") - 910529028, objArr12);
                        Class<?> cls2 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        e(MotionEvent.axisFromString("") - 250773055, KeyEvent.keyCodeFromString("") - 25, (short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 107), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), (-910529008) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr13);
                        long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                            int iLastIndexOf2 = 650 - TextUtils.lastIndexOf("", '0');
                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 45;
                            byte[] bArr4 = $$a;
                            Object[] objArr14 = new Object[1];
                            c(bArr4[80], (byte) (bArr4[1] + 1), bArr4[7], objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(threadPriority, iLastIndexOf2, modifierMetaStateMask, -873460649, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                            char cResolveSize = (char) View.resolveSize(0, 0);
                            int iRgb = (-16776565) - Color.rgb(0, 0, 0);
                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 44;
                            byte[] bArr5 = $$a;
                            byte b6 = bArr5[7];
                            byte b7 = bArr5[80];
                            Object[] objArr15 = new Object[1];
                            c(b6, b6, b7, objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cResolveSize, iRgb, fadingEdgeLength, -459846511, false, (String) objArr15[0], null);
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
            int i10 = ((int[]) objArr[0])[0];
            int i11 = ((int[]) objArr[2])[0];
            if (i11 != i10) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[1];
                if (strArr != null) {
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                throw new RuntimeException(String.valueOf(i11));
            }
            int i12 = g + 51;
            cancel = i12 % 128;
            int i13 = i12 % 2;
            Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i14 = ((int[]) objArr[3])[0];
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[0])[0];
            int i17 = ~((~new Random().nextInt()) | 149388504);
            int i18 = i14 + ((144908312 | i17) * (-374)) + 983940137 + ((i17 | 4480192) * 374);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr16[3])[0] = i20 ^ (i20 << 5);
            int i21 = g + 61;
            cancel = i21 % 128;
            if (i21 % 2 == 0) {
                DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
                obj.hashCode();
                throw null;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == DisposableHelper.DISPOSED) {
                return true;
            }
            int i22 = ((int[]) objArr16[3])[0];
            int i23 = i22 * i22;
            int i24 = -(1215001425 * i22);
            int i25 = (i23 & i24) + (i23 | i24);
            int i26 = -(i22 * (-1325931117));
            int i27 = ((i25 ^ i26) + ((i26 & i25) << 1)) - (-1506632388);
            int i28 = ((i27 >> 20) - 8191) / 4096;
            int i29 = ((i28 | 1) << 1) - (i28 ^ 1);
            int i30 = (i27 & i29) + (i29 | i27);
            int i31 = i27 >> 19;
            int i32 = (((i31 | (-16383)) << 1) - (i31 ^ (-16383))) / 8192;
            int i33 = (-(i30 ^ ((i32 & 1) + (i32 | 1)))) + 8;
            int i34 = ((i33 >> 17) - 65535) / 32768;
            int i35 = (i34 & 1) + (i34 | 1);
            return 0 / ((i33 & (-((i35 & 1) + (i35 | 1)))) * 1090);
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            int i = 2 % 2;
            int i2 = g + 37;
            cancel = i2 % 128;
            int i3 = i2 % 2;
            if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bufferProviderState)) {
                int i4 = cancel + 123;
                g = i4 % 128;
                if (i4 % 2 != 0) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bufferProviderState;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onSubscribe(this);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onSubscribe(this);
            }
            int i5 = g + 103;
            cancel = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            int i = 2 % 2;
            int i2 = cancel + 91;
            int i3 = i2 % 128;
            g = i3;
            int i4 = i2 % 2;
            this.b = t;
            int i5 = i3 + 63;
            cancel = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            int i = 2 % 2;
            int i2 = cancel + 51;
            g = i2 % 128;
            int i3 = i2 % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = DisposableHelper.DISPOSED;
            this.b = null;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(th);
            int i4 = g + 99;
            cancel = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            int i = 2 % 2;
            int i2 = g + 43;
            cancel = i2 % 128;
            int i3 = i2 % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = DisposableHelper.DISPOSED;
            T t = this.b;
            if (t != null) {
                int i4 = g + 67;
                cancel = i4 % 128;
                int i5 = i4 % 2;
                this.b = null;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(t);
                int i6 = g + 55;
                cancel = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            T t2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (t2 == null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(new NoSuchElementException());
                return;
            }
            int i8 = cancel + 33;
            g = i8 % 128;
            if (i8 % 2 == 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(t2);
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(t2);
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(byte r6, int r7, byte r8) {
            /*
                int r8 = r8 * 3
                int r0 = 1 - r8
                int r7 = r7 * 3
                int r7 = 3 - r7
                int r6 = r6 + 117
                byte[] r1 = computeInterpolatedTimeNs.TuitionPaymentFragmentbindingInflater1.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                int r8 = 0 - r8
                if (r1 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L2b
            L16:
                r3 = r2
            L17:
                int r7 = r7 + 1
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L26:
                r3 = r1[r7]
                r5 = r3
                r3 = r7
                r7 = r5
            L2b:
                int r7 = -r7
                int r6 = r6 + r7
                r7 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: computeInterpolatedTimeNs.TuitionPaymentFragmentbindingInflater1.$$e(byte, int, byte):java.lang.String");
        }
    }
}
