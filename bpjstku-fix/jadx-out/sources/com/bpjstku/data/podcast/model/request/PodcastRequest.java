package com.bpjstku.data.podcast.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/bpjstku/data/podcast/model/request/PodcastRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/podcast/model/request/PodcastRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", "pageNumber", "getPageNumber", "pageSize", "getPageSize"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PodcastRequest extends BaseRequest {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asInterface;
    private static int b;

    @SerializedName("email")
    private final String email;

    @SerializedName("pageNumber")
    private final String pageNumber;

    @SerializedName("pageSize")
    private final String pageSize;
    private static final byte[] $$c = {22, 102, 43, -6};
    private static final int $$f = 16;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {25, -93, -120, -48, -20, -6, 55, -60, -22, -2, -17, -9, 1, -18, 63, -62, -5, -27, 11, -9, -15, -13, 2, -13, -13, -1, 49, -27, -42, -25, 3, -21, 5, -19, -13, 48, -58, 2, -10, 17, -27, -22, 2, -6, -15, 19, -22, -19, 3, -25, 1, -4, -7, 5, -32, -11, -1, -2, -21, 24, -27, -10, -10, -18, -9, -6, 9, -27, 3, -14, -7, 36, -47, -13, 2, -13, -13, -1, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 59};
    private static final int $$e = 47;
    private static final byte[] $$a = {51, -5, 77, 89, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 105;
    private static int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f398a = 1;
    private static int asBinder = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 52
            int r6 = 53 - r6
            byte[] r0 = com.bpjstku.data.podcast.model.request.PodcastRequest.$$a
            int r5 = r5 * 52
            int r5 = r5 + 4
            int r7 = 103 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r5
            r7 = r6
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            r4 = r0[r5]
        L27:
            int r5 = r5 + 1
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.podcast.model.request.PodcastRequest.c(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.bpjstku.data.podcast.model.request.PodcastRequest.$$d
            int r7 = r7 * 22
            int r1 = r7 + 53
            int r8 = r8 * 15
            int r8 = r8 + 84
            byte[] r1 = new byte[r1]
            int r7 = r7 + 52
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-8)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.podcast.model.request.PodcastRequest.f(int, short, short, java.lang.Object[]):void");
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = d + 83;
        int i3 = i2 % 128;
        f398a = i3;
        int i4 = i2 % 2;
        String str = this.email;
        int i5 = i3 + 71;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPageNumber() {
        int i = 2 % 2;
        int i2 = d + 65;
        int i3 = i2 % 128;
        f398a = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.pageNumber;
        int i4 = i3 + 83;
        d = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getPageSize() {
        int i = 2 % 2;
        int i2 = d + 107;
        f398a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.pageSize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public PodcastRequest(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.email = str;
        this.pageNumber = str2;
        this.pageSize = str3;
    }

    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        boolean z;
        int length;
        byte[] bArr;
        int i6;
        int i7 = 2;
        int i8 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), View.combineMeasuredStates(0, 0) + 2267, 34 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1387473586, false, $$g(b3, b3, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i9 = $11 + 25;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            char c = '0';
            if (i4 != 0) {
                byte[] bArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (bArr2 != null) {
                    int i11 = $10 + 19;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i6 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i6 = 0;
                    }
                    while (i6 < length) {
                        int i12 = $11 + 75;
                        $10 = i12 % 128;
                        if (i12 % i7 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", c, 0, 0)), 3358 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 18 - View.MeasureSpec.getSize(0), -1054011043, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr2[i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) KeyEvent.getDeadChar(0, 0), KeyEvent.normalizeMetaState(0) + 3358, TextUtils.indexOf("", "", 0, 0) + 18, -1054011043, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE});
                            }
                            bArr[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                            i6++;
                        }
                        i7 = 2;
                        c = '0';
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    int i13 = $11 + 1;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) KeyEvent.getDeadChar(0, 0), 2267 - TextUtils.getCapsMode("", 0, 0), 33 - (Process.myPid() >> 22), 1387473586, false, $$g(b8, b8, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                    i5 = 2;
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                    int i15 = $10 + 17;
                    $11 = i15 % 128;
                    i5 = 2;
                    int i16 = i15 % 2;
                }
            } else {
                i5 = 2;
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - i5) + ((int) (((long) b) ^ 3046761265686732006L)) + i4;
                try {
                    Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentbindingInflater1), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 55905), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2854, 14 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1529949196, false, $$g(b9, b10, (byte) (b10 + 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i17 = 0; i17 < length2; i17++) {
                            int i18 = $10 + 119;
                            $11 = i18 % 128;
                            int i19 = i18 % 2;
                            bArr5[i17] = (byte) (((long) bArr4[i17]) ^ 3046761265686732006L);
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i20 = $11 + 33;
                        $10 = i20 % 128;
                        int i21 = i20 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        if (z) {
                            int i22 = $11 + 63;
                            $10 = i22 % 128;
                            if (i22 % 2 != 0) {
                                byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i23 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i23;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >>> (((byte) (((byte) (((long) bArr6[i23]) - 3046761265686732006L)) >> s)) ^ b2));
                            } else {
                                byte[] bArr7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i24 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i24 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i24]) ^ 3046761265686732006L)) + s)) ^ b2));
                            }
                        } else {
                            short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i25 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i25 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i25]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
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

    public final int hashCode() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int iHashCode = ((this.email.hashCode() * 31) + this.pageNumber.hashCode()) * 31;
        String str = this.pageSize;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 876;
            int iIndexOf = 10 - TextUtils.indexOf("", "");
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[7], bArr[5], (byte) (-bArr[1]), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, pressedStateDuration, iIndexOf, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e((-190078973) - (KeyEvent.getMaxKeyCode() >> 16), ImageFormat.getBitsPerPixel(0) + 5, (short) (40 - TextUtils.lastIndexOf("", '0', 0, 0)), (byte) (30 - ExpandableListView.getPackedPositionType(0L)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1651349285, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((ViewConfiguration.getTapTimeout() >> 16) - 190078969, (-3) - KeyEvent.keyCodeFromString(""), (short) (26 - Color.alpha(0)), (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 82), 1651349306 - Color.red(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int scrollBarSize = 876 - (ViewConfiguration.getScrollBarSize() >> 8);
            int iGreen = Color.green(0) + 10;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b2, b2, bArr2[10], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumFlingVelocity, scrollBarSize, iGreen, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                int touchSlop = 876 - (ViewConfiguration.getTouchSlop() >> 8);
                int deadChar = KeyEvent.getDeadChar(0, 0) + 10;
                byte[] bArr3 = $$a;
                byte b3 = bArr3[5];
                Object[] objArr6 = new Object[1];
                c(b3, b3, bArr3[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, touchSlop, deadChar, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i2 = ~iFreeMemory;
            int i3 = 1307826330 + (((~((-49939613) | i2)) | 6291472) * (-1188));
            int i4 = (~(iFreeMemory | 49939612)) | 6291472;
            int i5 = ~(90249841 | i2);
            int i6 = i3 + ((i4 | i5) * 594) + (((~(49939612 | i2)) | (-133897982) | i5) * 594) + 1085434568;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
            int i9 = d + 13;
            f398a = i9 % 128;
            int i10 = i9 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            e((ViewConfiguration.getKeyRepeatDelay() >> 16) - 190078973, 8 - View.MeasureSpec.makeMeasureSpec(0, 0), (short) (Color.argb(0, 0, 0, 0) + 100), (byte) ((KeyEvent.getMaxKeyCode() >> 16) - 11), 1651349321 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 190078971, Gravity.getAbsoluteGravity(0, 0), (short) (TextUtils.getOffsetBefore("", 0) + 122), (byte) (71 - KeyEvent.keyCodeFromString("")), 1651349345 - View.MeasureSpec.getMode(0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(ExpandableListView.getPackedPositionGroup(0L) - 190078964, (-1) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (short) ((KeyEvent.getMaxKeyCode() >> 16) + 73), (byte) (53 - View.resolveSize(0, 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1651349362, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e((-190078965) - (ViewConfiguration.getPressedStateDuration() >> 16), (-3) - ((byte) KeyEvent.getModifierMetaStateMask()), (short) (7 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 88), 1651349377 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i11 = d;
            int i12 = i11 + 5;
            f398a = i12 % 128;
            int i13 = i12 % 2;
            int i14 = i11 + 35;
            f398a = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 1085434568};
                byte[] bArr4 = $$d;
                byte b4 = bArr4[25];
                byte b5 = bArr4[12];
                Object[] objArr13 = new Object[1];
                f(b4, b5, b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr4[88];
                Object[] objArr14 = new Object[1];
                f((byte) 73, b6, b6, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int i16 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 876;
                        int iIndexOf2 = TextUtils.indexOf("", "", 0) + 10;
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[5];
                        Object[] objArr16 = new Object[1];
                        c(b7, b7, bArr5[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumFlingVelocity2, i16, iIndexOf2, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e((ViewConfiguration.getFadingEdgeLength() >> 16) - 190078973, ExpandableListView.getPackedPositionChild(0L) + 5, (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 40), (byte) (TextUtils.indexOf((CharSequence) "", '0') + 31), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1651349285, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e((-190078969) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 3, (short) (26 - (ViewConfiguration.getPressedStateDuration() >> 16)), (byte) (82 - (Process.myTid() >> 22)), ((Process.getThreadPriority(0) + 20) >> 6) + 1651349306, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 876;
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 11;
                            byte[] bArr6 = $$a;
                            byte b8 = bArr6[7];
                            Object[] objArr19 = new Object[1];
                            c(b8, b8, bArr6[10], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(doubleTapTimeout, packedPositionType, iLastIndexOf, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int i17 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 875;
                            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10;
                            byte[] bArr7 = $$a;
                            Object[] objArr20 = new Object[1];
                            c(bArr7[7], bArr7[5], (byte) (-bArr7[1]), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(minimumFlingVelocity, i17, keyRepeatTimeout, 252381699, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i18 = ((int[]) objArr[2])[0];
        int i19 = ((int[]) objArr[0])[0];
        if (i19 == i18) {
            int i20 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyTid = Process.myTid();
            int i21 = 1589847112 + (((~((-900493614) | iMyTid)) | 860183384) * (-318));
            int i22 = ~(860183384 | iMyTid);
            int i23 = ~iMyTid;
            int i24 = i20 + i21 + ((i22 | (~((-37816913) | i23))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iMyTid | (-37816913))) | (~(938310525 | i23))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr21[1])[0] = i26 ^ (i26 << 5);
        } else {
            Toast.makeText((Context) null, i19 / (((i19 - 1) * i19) % 2), 0).show();
            int i27 = ((int[]) objArr[1])[0];
            Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i28 = i27 + 72476980 + (((~((-536945366) | (~iIdentityHashCode))) | (~((-496635137) | iIdentityHashCode))) * (-272)) + (((~((-572875478) | iIdentityHashCode)) | 35930112) * (-272)) + (((~(iIdentityHashCode | 572875477)) | (-532565249)) * 272);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr22[1])[0] = i30 ^ (i30 << 5);
        }
        return iHashCode + str.hashCode();
    }

    static {
        asInterface = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = asBinder + 21;
        asInterface = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ PodcastRequest copy$default(PodcastRequest podcastRequest, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = f398a;
        int i4 = i3 + 41;
        d = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            str = podcastRequest.email;
        }
        if ((i & 2) != 0) {
            int i5 = i3 + 35;
            int i6 = i5 % 128;
            d = i6;
            int i7 = i5 % 2;
            String str4 = podcastRequest.pageNumber;
            int i8 = i6 + 89;
            f398a = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 / 3;
            }
            str2 = str4;
        }
        if ((i & 4) != 0) {
            int i10 = d + 5;
            f398a = i10 % 128;
            int i11 = i10 % 2;
            str3 = podcastRequest.pageSize;
        }
        return podcastRequest.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = d + 75;
        f398a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.email;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = d + 55;
        int i3 = i2 % 128;
        f398a = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.pageNumber;
        int i4 = i3 + 33;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = f398a;
        int i3 = i2 + 9;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pageSize;
        int i5 = i2 + 61;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final PodcastRequest copy(String p0, String p1, String p2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        PodcastRequest podcastRequest = new PodcastRequest(p0, p1, p2);
        int i2 = d + 97;
        f398a = i2 % 128;
        int i3 = i2 % 2;
        return podcastRequest;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = f398a + 59;
            d = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(p0 instanceof PodcastRequest)) {
            return false;
        }
        PodcastRequest podcastRequest = (PodcastRequest) p0;
        if (Intrinsics.areEqual(this.email, podcastRequest.email)) {
            if (!Intrinsics.areEqual(this.pageNumber, podcastRequest.pageNumber)) {
                int i3 = f398a + 37;
                d = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.pageSize, podcastRequest.pageSize))) {
                int i5 = d + 113;
                f398a = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            int i7 = f398a + 15;
            d = i7 % 128;
            int i8 = i7 % 2;
        }
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.email;
        String str2 = this.pageNumber;
        String str3 = this.pageSize;
        StringBuilder sb = new StringBuilder("PodcastRequest(email=");
        sb.append(str);
        sb.append(", pageNumber=");
        sb.append(str2);
        sb.append(", pageSize=");
        sb.append(str3);
        sb.append(")");
        String string = sb.toString();
        int i2 = d + 123;
        f398a = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        b = 289354813;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1934795532;
        TuitionPaymentFragmentbindingInflater1 = -2013709128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new byte[]{11, 39, 18, -24, 121, 11, 32, 16, 93, -23, -12, -102, 23, -48, 77, 90, 93, 92, 1, 89, 12, 118, -38, 107, -90, -39, 114, -63, 68, 117, 96, -47, -91, 107, -35, 116, 67, 68, 125, -101, 44, 106, 124, 68, 114, 122, 102, -107, 100, 1, 119, 112, -124, Base64.padSymbol, 76, 77, 66, 113, 121, 114, -40, 33, -34, 60, -39, -91, -90, -89, 43, 8, -10, 33, 50, -36, 43, -90, Base64.padSymbol, 18, -99, 13, 96, 44, 33, 79, 101, 9, -111, 36, 73, 115, 49, -97, -76, 64, -117, -102, 64, -91, -36, 118, -80, -86, 64, -79, -84, -76, 122, -26, -26, -26, -26, -26, -26};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, byte r6, short r7) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r5 = r5 * 3
            int r5 = r5 + 1
            byte[] r0 = com.bpjstku.data.podcast.model.request.PodcastRequest.$$c
            int r7 = 121 - r7
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            r4 = r0[r6]
        L24:
            int r7 = r7 + r4
            int r6 = r6 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.podcast.model.request.PodcastRequest.$$g(byte, byte, short):java.lang.String");
    }
}
