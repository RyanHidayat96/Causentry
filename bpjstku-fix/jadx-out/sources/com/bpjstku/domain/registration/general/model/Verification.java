package com.bpjstku.domain.registration.general.model;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b"}, d2 = {"Lcom/bpjstku/domain/registration/general/model/Verification;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "p2", "p3", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Z", "b", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Verification implements Parcelable {
    public static final Parcelable.Creator<Verification> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f436a;
    private static int asBinder;
    private static byte[] asInterface;
    private static int b;
    private static int d;
    private static short[] g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final boolean b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {39, 27, 2, 54};
    private static final int $$d = 222;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {55, -64, 35, -71, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 87;
    private static int cancelAll = 0;
    private static int cancel = 1;
    private static int notify = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 84
            byte[] r0 = com.bpjstku.domain.registration.general.model.Verification.$$a
            int r6 = 93 - r6
            int r5 = r5 * 15
            int r1 = 53 - r5
            byte[] r1 = new byte[r1]
            int r5 = 52 - r5
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r5
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
        L29:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.domain.registration.general.model.Verification.c(short, byte, int, java.lang.Object[]):void");
    }

    public Verification(boolean z, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.b = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
        this.TuitionPaymentFragmentbindingInflater1 = str3;
    }

    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        long j;
        int length;
        byte[] bArr;
        int i4;
        int length2;
        byte[] bArr2;
        int i5;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(f436a)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            long j2 = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                int i7 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2267;
                int i8 = 33 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                byte length3 = (byte) $$c.length;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, i7, i8, 1387473586, false, $$e((byte) 0, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i9 = iIntValue == -1 ? 1 : 0;
            if (i9 == 0) {
                j = 3046761265686732006L;
            } else {
                byte[] bArr3 = asInterface;
                if (bArr3 != null) {
                    int i10 = $11 + 49;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        length2 = bArr3.length;
                        bArr2 = new byte[length2];
                        i5 = 1;
                    } else {
                        length2 = bArr3.length;
                        bArr2 = new byte[length2];
                        i5 = 0;
                    }
                    while (i5 < length2) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr3[i5])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                                int i11 = 3359 - (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1));
                                int i12 = 18 - (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1));
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask, i11, i12, -1054011043, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            bArr2[i5] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i5++;
                            j2 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr3 = bArr2;
                }
                if (bArr3 != null) {
                    int i13 = $10 + 13;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        byte[] bArr4 = asInterface;
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(b)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                            int deadChar = KeyEvent.getDeadChar(0, 0) + 2267;
                            int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 33;
                            byte length4 = (byte) $$c.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetBefore, deadChar, offsetBefore2, 1387473586, false, $$e((byte) 0, length4, (byte) (length4 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) + 3046761265686732006L)) * ((int) (((long) f436a) | 3046761265686732006L));
                    } else {
                        byte[] bArr5 = asInterface;
                        Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(b)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int maximumFlingVelocity = 2267 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 33;
                            byte length5 = (byte) $$c.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollDefaultDelay, maximumFlingVelocity, scrollBarSize, 1387473586, false, $$e((byte) 0, length5, (byte) (length5 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (((long) bArr5[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) f436a) ^ 3046761265686732006L));
                    }
                    iIntValue = (byte) i4;
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) g[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) f436a) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) b) ^ j)) + i9;
                Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(asBinder), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (KeyEvent.normalizeMetaState(0) + 55904), (ViewConfiguration.getEdgeSlop() >> 16) + 2855, TextUtils.lastIndexOf("", '0', 0, 0) + 14, -1529949196, false, $$e(b5, b6, (byte) (b6 - 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr6 = asInterface;
                if (bArr6 != null) {
                    int i14 = $10 + 99;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        length = bArr6.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr6.length;
                        bArr = new byte[length];
                    }
                    for (int i15 = 0; i15 < length; i15++) {
                        int i16 = $11 + 95;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        bArr[i15] = (byte) (((long) bArr6[i15]) ^ 3046761265686732006L);
                    }
                    bArr6 = bArr;
                }
                boolean z = bArr6 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        int i18 = $10 + 35;
                        $11 = i18 % 128;
                        if (i18 % 2 == 0) {
                            byte[] bArr7 = asInterface;
                            int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >>> (((byte) (((byte) (((long) bArr7[i19]) | 3046761265686732006L)) << s)) ^ b2));
                        } else {
                            byte[] bArr8 = asInterface;
                            int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr8[i20]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                    } else {
                        short[] sArr = g;
                        int i21 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i21 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i21]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29944);
            int mode = 1755 - View.MeasureSpec.getMode(0);
            int iArgb = Color.argb(0, 0, 0, 0) + 23;
            byte[] bArr = $$a;
            byte b2 = bArr[28];
            Object[] objArr = new Object[1];
            c(b2, (byte) (b2 | 88), bArr[7], objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop, mode, iArgb, 986134021, false, (String) objArr[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr2 = new Object[1];
        e((-974504014) - TextUtils.lastIndexOf("", '0', 0), ((Process.getThreadPriority(0) + 20) >> 6) - 40, (short) ((-56) - (Process.myPid() >> 22)), (byte) (KeyEvent.normalizeMetaState(0) + 67), 361288536 - View.MeasureSpec.getSize(0), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        e((-974504008) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (-41) - Process.getGidForName(""), (short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 46), (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42), 361288558 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char capsMode = (char) (29944 - TextUtils.getCapsMode("", 0, 0));
            int i3 = 1756 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int iArgb2 = 23 - Color.argb(0, 0, 0, 0);
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr4 = new Object[1];
            c(b4, (byte) (b4 | 52), b3, objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(capsMode, i3, iArgb2, 1596667560, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 29944);
                int packedPositionGroup = 1755 - ExpandableListView.getPackedPositionGroup(0L);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 24;
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr5 = new Object[1];
                c(b5, b6, b6, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength, packedPositionGroup, iLastIndexOf, 1599039318, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr6[0])[0];
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{i4}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            int i6 = ((((-1917404935) + ((153306121 | i5) * (-192))) + (((~(490161615 | i5)) | 549457920) * (-384))) + (((~(iIdentityHashCode | (-336855495))) | ((~(i5 | 1039619535)) | (~((-549457921) | iIdentityHashCode)))) * DerHeader.TAG_CLASS_PRIVATE)) - 1595336268;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr7 = new Object[1];
            e(TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 974504003, (-40) - TextUtils.getTrimmedLength(""), (short) (Color.green(0) - 2), (byte) ((-70) - Color.argb(0, 0, 0, 0)), 361288573 - (Process.myPid() >> 22), objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            e(TextUtils.getTrimmedLength("") - 974504005, (-40) - KeyEvent.normalizeMetaState(0), (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + ComposerKt.defaultsKey), (byte) ((-34) - (ViewConfiguration.getEdgeSlop() >> 16)), TextUtils.getOffsetBefore("", 0) + 361288589, objArr8);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr9 = {-1977421909};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 1725 - TextUtils.indexOf((CharSequence) "", '0'), 28 - TextUtils.lastIndexOf("", '0'), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), -1595336268, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "") + 29944);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1755;
                    int iRed = 23 - Color.red(0);
                    byte b7 = $$a[7];
                    byte b8 = b7;
                    Object[] objArr10 = new Object[1];
                    c(b7, b8, b8, objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, scrollBarFadeDuration, iRed, 1599039318, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr11 = new Object[1];
                    e((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 974504013, TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 39, (short) ((-56) - Color.alpha(0)), (byte) (67 - View.MeasureSpec.getSize(0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 361288535, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    e((-974504009) - TextUtils.getOffsetBefore("", 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 41, (short) (46 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (byte) (43 - (Process.myTid() >> 22)), KeyEvent.getDeadChar(0, 0) + 361288558, objArr12);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cBlue = (char) (Color.blue(0) + 29944);
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1755;
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 23;
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr13 = new Object[1];
                        c(b10, (byte) (b10 | 52), b9, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cBlue, maxKeyCode, iNormalizeMetaState, 1596667560, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c = (char) (29945 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int packedPositionType = 1755 - ExpandableListView.getPackedPositionType(0L);
                        int iRgb = Color.rgb(0, 0, 0) + 16777239;
                        byte[] bArr2 = $$a;
                        byte b11 = bArr2[28];
                        Object[] objArr14 = new Object[1];
                        c(b11, (byte) (b11 | 88), bArr2[7], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, packedPositionType, iRgb, 986134021, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i9 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i10 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i10 == i9) {
            int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            int i12 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
            Object[] objArr15 = {new int[]{i12}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i13 = ~iIdentityHashCode2;
            int i14 = i11 + 103761587 + (((~((-152952326) | i13)) | (~((-59650101) | iIdentityHashCode2))) * 1900) + (((~(i13 | 59650100)) | (~(iIdentityHashCode2 | 152952325))) * (-950)) + (((~(iIdentityHashCode2 | 59650100)) | (~(i13 | 152952325))) * 950);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            Object obj = objArr15[3];
            ((int[]) obj)[0] = i16 ^ (i16 << 5);
            int i17 = cancel + 93;
            cancelAll = i17 % 128;
            int i18 = i17 % 2;
            int i19 = ((int[]) obj)[0];
            int i20 = i19 * i19;
            int i21 = -(1483070464 * i19);
            int i22 = (i20 & i21) + (i20 | i21);
            int i23 = -(i19 * 1257747542);
            int i24 = (i22 & i23) + (i23 | i22);
            int i25 = ((i24 | (-319342791)) << 1) - ((-319342791) ^ i24);
            int i26 = i25 >> 23;
            int i27 = ((((i26 | (-1023)) << 1) - (i26 ^ (-1023))) / 512) + 1;
            int i28 = (i25 & i27) + (i27 | i25);
            int i29 = ((i25 >> 15) - 262143) / 131072;
            int i30 = -(i28 ^ ((i29 ^ 1) + ((i29 & 1) << 1)));
            int i31 = (i30 ^ 9) + ((i30 & 9) << 1);
            int i32 = i31 >> 22;
            int i33 = ((i32 ^ (-2047)) + ((i32 & (-2047)) << 1)) / 1024;
            int i34 = (i33 & 1) + (i33 | 1);
            return 0 / (((-(((i34 | 1) << 1) - (i34 ^ 1))) & i31) * 1652);
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
        if (strArr != null) {
            while (i2 < strArr.length) {
                arrayList.add(strArr[i2]);
                i2++;
                int i35 = cancelAll + 59;
                cancel = i35 % 128;
                int i36 = i35 % 2;
            }
        }
        throw new RuntimeException(String.valueOf(i10));
    }

    static {
        d = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        CREATOR = new TuitionPaymentFragmentbindingInflater1();
        int i = notify + 73;
        d = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = cancelAll + 25;
            cancel = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(p0 instanceof Verification)) {
            int i4 = cancel + 79;
            cancelAll = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }
        Verification verification = (Verification) p0;
        if (this.b != verification.b || (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, verification.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, verification.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            int i5 = cancel + 11;
            cancelAll = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, verification.TuitionPaymentFragmentbindingInflater1)) {
            return true;
        }
        int i7 = cancel + 21;
        cancelAll = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = cancel + 27;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.b);
        return i3 != 0 ? (((((iHashCode / 11) >> this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) >> 21) * this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) % 75) * this.TuitionPaymentFragmentbindingInflater1.hashCode() : (((((iHashCode * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        boolean z = this.b;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        StringBuilder sb = new StringBuilder("Verification(b=");
        sb.append(z);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str3);
        sb.append(")");
        String string = sb.toString();
        int i2 = cancelAll + 49;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        int i = 2 % 2;
        int i2 = cancel + 47;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeInt(this.b ? 1 : 0);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        b = 1725591630;
        f436a = -1934795583;
        asBinder = -1229415352;
        asInterface = new byte[]{9, 101, 9, -98, 68, 43, 101, 12, -100, 23, 123, 120, -42, -103, -36, 39, 22, 23, 16, 99, 11, 96, 14, 67, -25, 86, 19, 20, 79, -20, 113, 64, 77, 28, 16, 86, 24, 15, 82, -85, 91, -92, 120, 71, -103, -93, 95, -73, 96, -97, -75, 87, -87, 15, -71, 77, -108, 99, 77, -86, -95, 119, -67, -77, 77, -66, -79, -71, 67};
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
    private static java.lang.String $$e(short r5, int r6, byte r7) {
        /*
            int r6 = 121 - r6
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r5 = r5 * 2
            int r0 = 1 - r5
            byte[] r1 = com.bpjstku.domain.registration.general.model.Verification.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L16
            r3 = r5
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            r3 = r1[r7]
        L26:
            int r3 = -r3
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.domain.registration.general.model.Verification.$$e(short, int, byte):java.lang.String");
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements Parcelable.Creator<Verification> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Verification createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Verification(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Verification[] newArray(int i) {
            return new Verification[i];
        }
    }
}
