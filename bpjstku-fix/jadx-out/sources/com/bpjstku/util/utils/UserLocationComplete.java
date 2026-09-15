package com.bpjstku.util.utils;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0014\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\""}, d2 = {"Lcom/bpjstku/util/utils/UserLocationComplete;", "Landroid/os/Parcelable;", "", "p0", "p1", "", "p2", "Lcom/bpjstku/util/utils/LocationAddressInfo;", "p3", "", "p4", "<init>", "(DDLjava/lang/String;Lcom/bpjstku/util/utils/LocationAddressInfo;Z)V", "TuitionPaymentFragmentbindingInflater1", "()Ljava/lang/String;", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "D", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/bpjstku/util/utils/LocationAddressInfo;", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UserLocationComplete implements Parcelable {
    public static final Parcelable.Creator<UserLocationComplete> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int[] f671a;
    private static int g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final double TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final double b;
    public final LocationAddressInfo TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {17, 104, 102, -28};
    private static final int $$f = 55;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {21, ByteCompanionObject.MAX_VALUE, 49, -115, 9, -5, -66, 72, -27, 8, -14, 10, 3, -14, 7, -72, 68, -21, 12, -6, -2, -69, 68, -4, -14, 0, -65, 17, 36, 8, -10, -15, 12, -39, 32, -17, 0, -18, 28, -14, 0, 4};
    private static final int $$e = 39;
    private static final byte[] $$a = {65, -122, -65, 2, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
    private static final int $$b = 92;
    private static int asInterface = 0;
    private static int d = 1;
    private static int asBinder = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 3
            int r7 = 100 - r7
            byte[] r0 = com.bpjstku.util.utils.UserLocationComplete.$$a
            int r8 = r8 * 10
            int r8 = 13 - r8
            int r9 = 11 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r5 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2c:
            int r8 = r8 + r7
            int r7 = r8 + (-5)
            r8 = r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.utils.UserLocationComplete.c(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 38
            int r0 = 39 - r7
            byte[] r1 = com.bpjstku.util.utils.UserLocationComplete.$$d
            int r6 = r6 * 38
            int r6 = r6 + 4
            int r5 = r5 + 98
            byte[] r0 = new byte[r0]
            int r7 = 38 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r6
            r5 = r7
            r4 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            r3 = r1[r6]
        L29:
            int r6 = r6 + 1
            int r5 = r5 + r3
            int r5 = r5 + 3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.utils.UserLocationComplete.f(int, int, short, java.lang.Object[]):void");
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f671a;
        int i3 = -1870535734;
        long j = 0;
        int i4 = -1;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int i7 = $11 + 71;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = new Object[i5];
                    objArr2[0] = Integer.valueOf(iArr2[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) - 1);
                        int i10 = (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 3290;
                        int i11 = 31 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1));
                        byte b = (byte) i4;
                        byte b2 = (byte) (-b);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i10, i11, 1948206109, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i9++;
                    i3 = -1870535734;
                    j = 0;
                    i4 = -1;
                    i5 = 1;
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
        int[] iArr5 = f671a;
        if (iArr5 != null) {
            int i12 = $10 + 121;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i14 = 0;
            while (i14 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i6] = Integer.valueOf(iArr5[i14]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (-b3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 3291 - ExpandableListView.getPackedPositionType(0L), ExpandableListView.getPackedPositionType(0L) + 31, 1948206109, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i14] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i14++;
                iArr5 = iArr5;
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        int i15 = i6;
        System.arraycopy(iArr5, i15, iArr4, i15, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i16 = $11 + 47;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            for (int i18 = 17; i18 > 1; i18--) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i18];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.MeasureSpec.getMode(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2559, 29 - (Process.myPid() >> 22), 683220507, false, $$g(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
            }
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i20 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28879 - TextUtils.indexOf("", "", 0, 0)), AndroidCharacter.getMirror('0') + 300, 25 - KeyEvent.getDeadChar(0, 0), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            int i21 = $11 + 59;
            $10 = i21 % 128;
            int i22 = i21 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public UserLocationComplete(double d2, double d3, String str, LocationAddressInfo locationAddressInfo, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.b = d2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = d3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = locationAddressInfo;
        this.TuitionPaymentFragmentbindingInflater1 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UserLocationComplete(double d2, double d3, String str, LocationAddressInfo locationAddressInfo, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z2;
        if ((i & 16) != 0) {
            int i2 = asInterface + 37;
            d = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        this(d2, d3, str, locationAddressInfo, z2);
    }

    public final String TuitionPaymentFragmentbindingInflater1() throws Throwable {
        Object[] objArr;
        char c;
        String str;
        int i = 2 % 2;
        int i2 = asInterface + 97;
        d = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int fadingEdgeLength = 876 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10;
            byte[] bArr = $$a;
            byte b = (byte) (bArr[3] - 1);
            Object[] objArr2 = new Object[1];
            c(b, b, bArr[11], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, fadingEdgeLength, keyRepeatDelay, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{-1338808268, 17710901, -153214397, -468162557, 1565024601, 418677635, 1521881341, 289292141, 318520818, 510344014, -1770086119, 87704478, 1780613019, -1667126540}, 'F' - AndroidCharacter.getMirror('0'), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{-1715001127, 859346918, -454493459, -468897671, -847566399, -384860127, 1360945085, -515279527, -981045329, 812449225}, 15 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            int i4 = 876 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int gidForName = 9 - Process.getGidForName("");
            byte[] bArr2 = $$a;
            byte b2 = bArr2[11];
            Object[] objArr5 = new Object[1];
            c(b2, b2, bArr2[17], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, i4, gidForName, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int iResolveSize = View.resolveSize(0, 0) + 876;
                int trimmedLength = TextUtils.getTrimmedLength("") + 10;
                byte[] bArr3 = $$a;
                byte b3 = (byte) (bArr3[3] - 1);
                byte b4 = bArr3[11];
                Object[] objArr6 = new Object[1];
                c(b3, b4, (byte) (b4 + 3), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumDrawingCacheSize, iResolveSize, trimmedLength, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i5 = ~((-597568196) | (~startUptimeMillis));
            int i6 = (((((-599736048) | i5) | (~(597568195 | startUptimeMillis))) * (-338)) - 807011084) + (((~(startUptimeMillis | (-2167853))) | i5) * 338) + 1693472765;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
            c = 2;
        } else {
            Object[] objArr8 = new Object[1];
            e(new int[]{1879477006, 1029430757, -422062530, -1641117060, -838640921, -1760294998, -220680307, 873738896, -2006358292, 155892319}, TextUtils.lastIndexOf("", '0') + 17, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new int[]{-809410843, -267257236, 1687144116, -1248000970, -981699758, -1796350300, 1863110156, 950299593, 821505340, -882371013}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15, objArr9);
            try {
                Object[] objArr10 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 1693472765};
                byte b5 = (byte) ($$e & 1);
                byte[] bArr4 = $$d;
                byte b6 = bArr4[25];
                Object[] objArr11 = new Object[1];
                f(b5, b6, b6, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = bArr4[25];
                byte b8 = (byte) (b7 + 1);
                Object[] objArr12 = new Object[1];
                f(b7, b8, b8, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                    int mode = View.MeasureSpec.getMode(0) + 876;
                    int scrollDefaultDelay = 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte[] bArr5 = $$a;
                    byte b9 = (byte) (bArr5[3] - 1);
                    byte b10 = bArr5[11];
                    Object[] objArr13 = new Object[1];
                    c(b9, b10, (byte) (b10 + 3), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, mode, scrollDefaultDelay, 1324201839, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new int[]{-1338808268, 17710901, -153214397, -468162557, 1565024601, 418677635, 1521881341, 289292141, 318520818, 510344014, -1770086119, 87704478, 1780613019, -1667126540}, 22 - TextUtils.getTrimmedLength(""), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new int[]{-1715001127, 859346918, -454493459, -468897671, -847566399, -384860127, 1360945085, -515279527, -981045329, 812449225}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 15, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 876;
                        int size = 10 - View.MeasureSpec.getSize(0);
                        byte[] bArr6 = $$a;
                        byte b11 = bArr6[11];
                        Object[] objArr16 = new Object[1];
                        c(b11, b11, bArr6[17], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, edgeSlop, size, 254769921, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                        int i9 = 875 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int iResolveOpacity = 10 - Drawable.resolveOpacity(0, 0);
                        byte[] bArr7 = $$a;
                        byte b12 = (byte) (bArr7[3] - 1);
                        Object[] objArr17 = new Object[1];
                        c(b12, b12, bArr7[11], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration, i9, iResolveOpacity, -1199417970, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i10 = asInterface + 87;
                    d = i10 % 128;
                    c = 2;
                    if (i10 % 2 == 0) {
                        int i11 = 2 / 5;
                    }
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
        if (((int[]) objArr[0])[0] != ((int[]) objArr[c])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr == null) {
                throw null;
            }
            int i12 = d;
            int i13 = i12 + 97;
            asInterface = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i12 + 93;
            asInterface = i15 % 128;
            int i16 = i15 % 2;
            for (String str2 : strArr) {
                int i17 = asInterface + 81;
                d = i17 % 128;
                int i18 = i17 % 2;
                arrayList.add(str2);
            }
            throw null;
        }
        int i19 = ((int[]) objArr[1])[0];
        Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i20 = ~iIdentityHashCode;
        int i21 = ~((-78734014) | i20);
        int i22 = ~(38423784 | iIdentityHashCode);
        int i23 = i19 + (-1663234392) + ((i21 | i22) * 1150) + (((~((-38423785) | i20)) | i22) * (-575)) + (((~(iIdentityHashCode | (-78734014))) | (~(i20 | 78734013))) * 575);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr18[1])[0] = i25 ^ (i25 << 5);
        int i26 = d + 81;
        asInterface = i26 % 128;
        int i27 = i26 % 2;
        LocationAddressInfo locationAddressInfo = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo != null && (str = locationAddressInfo.TuitionPaymentFragmentbindingInflater1) != null) {
            return str;
        }
        int i28 = ((int[]) objArr18[1])[0];
        int i29 = i28 * i28;
        int i30 = -(1800893574 * i28);
        int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
        int i32 = -(i28 * 411823744);
        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
        int i34 = ((i33 | 968648969) << 1) - (968648969 ^ i33);
        int i35 = i34 >> 21;
        int i36 = ((i35 & (-4095)) + (i35 | (-4095))) / 2048;
        int i37 = ((i36 | 1) << 1) - (i36 ^ 1);
        int i38 = (i34 ^ i37) + ((i37 & i34) << 1);
        int i39 = i34 >> 25;
        int i40 = (((i39 | (-255)) << 1) - (i39 ^ (-255))) / 128;
        int i41 = -((((i40 | 1) << 1) - (i40 ^ 1)) ^ i38);
        int i42 = (i41 ^ 1) + ((i41 & 1) << 1);
        int i43 = i42 >> 26;
        return "11;18;".substring(10776 / (((-(((((i43 | ComposerKt.defaultsKey) << 1) - (i43 ^ ComposerKt.defaultsKey)) / 64) + 2)) & i42) * 1796));
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Parcelable.Creator<UserLocationComplete> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UserLocationComplete createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UserLocationComplete(parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readInt() == 0 ? null : LocationAddressInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UserLocationComplete[] newArray(int i) {
            return new UserLocationComplete[i];
        }
    }

    static {
        g = 1;
        b();
        CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = asBinder + 69;
        g = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = d + 57;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 51;
        d = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = d + 65;
            asInterface = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(p0 instanceof UserLocationComplete)) {
            int i3 = d + 59;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        UserLocationComplete userLocationComplete = (UserLocationComplete) p0;
        if (Double.compare(this.b, userLocationComplete.b) != 0 || Double.compare(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3) != 0 || !Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            return false;
        }
        if (Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            return this.TuitionPaymentFragmentbindingInflater1 == userLocationComplete.TuitionPaymentFragmentbindingInflater1;
        }
        int i5 = asInterface + 23;
        d = i5 % 128;
        return i5 % 2 == 0;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Double.hashCode(this.b);
        int iHashCode3 = Double.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int iHashCode4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        LocationAddressInfo locationAddressInfo = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo == null) {
            int i2 = asInterface + 51;
            int i3 = i2 % 128;
            d = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 71;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = locationAddressInfo.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + Boolean.hashCode(this.TuitionPaymentFragmentbindingInflater1);
    }

    public final String toString() {
        int i = 2 % 2;
        double d2 = this.b;
        double d3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        LocationAddressInfo locationAddressInfo = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        boolean z = this.TuitionPaymentFragmentbindingInflater1;
        StringBuilder sb = new StringBuilder("UserLocationComplete(b=");
        sb.append(d2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(d3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(locationAddressInfo);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(z);
        sb.append(")");
        String string = sb.toString();
        int i2 = d + 15;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeDouble(this.b);
        p0.writeDouble(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        LocationAddressInfo locationAddressInfo = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo == null) {
            int i2 = asInterface + 69;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                p0.writeInt(1);
            } else {
                p0.writeInt(0);
            }
            int i3 = d + 123;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        } else {
            p0.writeInt(1);
            locationAddressInfo.writeToParcel(p0, p1);
        }
        p0.writeInt(this.TuitionPaymentFragmentbindingInflater1 ? 1 : 0);
        int i5 = asInterface + 111;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void b() {
        f671a = new int[]{1508682165, 961956421, 1959167246, -1597071683, 342307046, -1775374503, 1981319543, 2105604496, -122243283, -1265544255, 258990145, -1415683172, 636636840, 2004320148, 710787963, -509900061, -68184906, 382917145};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r7, short r8, byte r9) {
        /*
            int r9 = r9 * 2
            int r9 = 1 - r9
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.util.utils.UserLocationComplete.$$c
            int r8 = r8 * 56
            int r8 = 122 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r5 = r2
            goto L2a
        L15:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L19:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            int r8 = r8 + 1
            r3 = r0[r8]
        L2a:
            int r7 = r7 + r3
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.utils.UserLocationComplete.$$g(int, short, byte):java.lang.String");
    }
}
