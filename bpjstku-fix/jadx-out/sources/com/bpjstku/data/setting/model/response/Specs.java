package com.bpjstku.data.setting.model.response;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\nR\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/bpjstku/data/setting/model/response/Specs;", "", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;II)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;II)Lcom/bpjstku/data/setting/model/response/Specs;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", ImagesContract.URL, "Ljava/lang/String;", "getUrl", "width", "I", "getWidth", "height", "getHeight"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Specs {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static short[] b;
    private static int d;

    @SerializedName("height")
    private final int height;

    @SerializedName(ImagesContract.URL)
    private final String url;

    @SerializedName("width")
    private final int width;
    private static final byte[] $$c = {81, 125, 2, 46};
    private static final int $$f = 34;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {123, -2, -101, -104, -13, 1, 62, -53, -15, 5, -10, -2, 8, -11, 70, -55, 2, -20, 18, 50, -69, 12, -12, 0, -4, -3, 69, -64, -3, 10, -2, -8, Base64.padSymbol, -69, 12, -13, -5, 15, -15, -2, 69, -35, -35, 12, -8, -4, 13, -4, 31, -30, -20, 18, 14, -20, -13, -5, 15, -15, -2, -34, 11, -12, 10, -7, 0, 29, -18, -25, 11, 7, -10, -7, 45, -45, 16, -7, -7, 7, -10, -7, 17, -8, -6, 9, -6, -6, 6, 29, -38, 7, -7, 10, -20, 14, -14, 64};
    private static final int $$e = 34;
    private static final byte[] $$a = {43, 23, 22, -14, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 33;
    private static int g = 0;
    private static int asInterface = 1;
    private static int asBinder = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 15
            int r0 = r6 + 38
            int r8 = 93 - r8
            byte[] r1 = com.bpjstku.data.setting.model.response.Specs.$$a
            int r7 = r7 * 3
            int r7 = 84 - r7
            byte[] r0 = new byte[r0]
            int r6 = r6 + 37
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r6
            r7 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1b:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r1[r7]
        L2c:
            int r3 = -r3
            int r8 = r8 + r3
            int r7 = r7 + 1
            int r8 = r8 + (-11)
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.setting.model.response.Specs.a(short, byte, int, java.lang.Object[]):void");
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
    private static void e(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 15
            int r8 = r8 + 84
            int r6 = r6 * 18
            int r6 = r6 + 38
            byte[] r0 = com.bpjstku.data.setting.model.response.Specs.$$d
            int r7 = r7 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.setting.model.response.Specs.e(short, byte, short, java.lang.Object[]):void");
    }

    public Specs(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
        this.width = i;
        this.height = i2;
    }

    public final String getUrl() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 77;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.url;
        int i5 = i2 + 13;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final int getWidth() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 13;
        g = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.width;
        int i6 = i2 + 121;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final int getHeight() {
        int i = 2 % 2;
        int i2 = g + 79;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = this.height;
        int i6 = i3 + 5;
        g = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0225 A[PHI: r3
  0x0225: PHI (r3v9 int) = (r3v8 int), (r3v46 int) binds: [B:48:0x0223, B:45:0x0211] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0227 A[PHI: r3
  0x0227: PHI (r3v43 int) = (r3v8 int), (r3v46 int) binds: [B:48:0x0223, B:45:0x0211] A[DONT_GENERATE, DONT_INLINE]] */
    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = (byte) (b3 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.getSize(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2267, 33 - View.combineMeasuredStates(0, 0), 1387473586, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                long j = 0;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cGreen = (char) Color.green(0);
                            int i9 = 3358 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1));
                            int i10 = 19 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1));
                            byte b5 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cGreen, i9, i10, -1054011043, false, $$g(b5, (byte) (b5 - 1), (byte) $$c.length), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i8++;
                        j = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i11 = $11 + 111;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.getGidForName("") + 1), Color.green(0) + 2267, 32 - ExpandableListView.getPackedPositionChild(0L), 1387473586, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i6 = ((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) | 3046761265686732006L)) >> ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) / 3046761265686732006L));
                    } else {
                        byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = (byte) (b8 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Process.myTid() >> 22), (ViewConfiguration.getTapTimeout() >> 16) + 2267, 34 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1387473586, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i6 = ((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L));
                    }
                    iIntValue = (byte) i6;
                } else {
                    iIntValue = (short) (((short) (((long) b[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i12 = $10;
                int i13 = i12 + 21;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    i4 = ((i3 % iIntValue) >>> 3) * ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) & 3046761265686732006L));
                    if (!(!z2)) {
                        i5 = 1;
                    } else {
                        int i14 = i12 + 101;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        i5 = 0;
                    }
                } else {
                    i4 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L));
                    if (z2) {
                        i5 = 1;
                    } else {
                        int i16 = i12 + 101;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                        i5 = 0;
                    }
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i4 + i5;
                try {
                    Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentbindingInflater1), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 55904), TextUtils.getTrimmedLength("") + 2855, 13 - (ViewConfiguration.getScrollBarSize() >> 8), -1529949196, false, $$g(b10, b11, (byte) (-b11)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (bArr5 != null) {
                        int length2 = bArr5.length;
                        byte[] bArr6 = new byte[length2];
                        for (int i18 = 0; i18 < length2; i18++) {
                            bArr6[i18] = (byte) (((long) bArr5[i18]) ^ 3046761265686732006L);
                        }
                        bArr5 = bArr6;
                    }
                    if (bArr5 != null) {
                        z = true;
                    } else {
                        int i19 = $10 + 3;
                        $11 = i19 % 128;
                        int i20 = i19 % 2;
                        z = false;
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    int i21 = $11 + 65;
                    $10 = i21 % 128;
                    int i22 = i21 % 2;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        if (z) {
                            byte[] bArr7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i23 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i23 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i23]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            short[] sArr = b;
                            int i24 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i24 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i24]) ^ 3046761265686732006L)) + s)) ^ b2));
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

    /* JADX WARN: Code duplicated, block: B:29:0x02a0  */
    public final int component2() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = g + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
            int iIndexOf = 875 - TextUtils.indexOf((CharSequence) "", '0');
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 10;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 | 89), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iIndexOf, iResolveOpacity, -1650998592, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 921740313, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 86, (short) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 100), (byte) TextUtils.getCapsMode("", 0, 0), 57739153 - TextUtils.getOffsetBefore("", 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c((-921740309) - (KeyEvent.getMaxKeyCode() >> 16), (-92) - TextUtils.indexOf("", "", 0, 0), (short) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 122), (byte) Color.blue(0), 57739174 - TextUtils.getOffsetBefore("", 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
            int mode = 876 - View.MeasureSpec.getMode(0);
            int i4 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
            byte[] bArr = $$a;
            byte b4 = bArr[5];
            byte b5 = bArr[7];
            Object[] objArr5 = new Object[1];
            a(b4, b5, (byte) (b5 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, mode, i4, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int iIndexOf2 = TextUtils.indexOf("", "", 0) + 876;
                int maxKeyCode = 10 - (KeyEvent.getMaxKeyCode() >> 16);
                byte[] bArr2 = $$a;
                byte b6 = bArr2[5];
                byte b7 = bArr2[7];
                Object[] objArr6 = new Object[1];
                a(b6, b7, b7, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(longPressTimeout, iIndexOf2, maxKeyCode, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            int i6 = (((((~(263192427 | i5)) | (~((-111424556) | iIdentityHashCode))) * 988) + 73002160) + ((((~(iIdentityHashCode | 111457643)) | 151734784) | (~(i5 | (-111424556)))) * 988)) - 929237972;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c((-921740312) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.getTrimmedLength("") - 81, (short) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24), (byte) (Process.myPid() >> 22), TextUtils.indexOf("", "", 0, 0) + 57739188, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 921740312, (-89) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) ((-11) - TextUtils.indexOf((CharSequence) "", '0', 0)), (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), 57739213 - Color.alpha(0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i9 = asInterface;
                int i10 = i9 + 65;
                g = i10 % 128;
                if (i10 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                if (applicationContext instanceof ContextWrapper) {
                    int i11 = i9 + 119;
                    g = i11 % 128;
                    if (i11 % 2 != 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        obj.hashCode();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        int i12 = asInterface + 85;
                        g = i12 % 128;
                        int i13 = i12 % 2;
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c((-921740304) - TextUtils.getCapsMode("", 0, 0), (-91) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) (View.MeasureSpec.makeMeasureSpec(0, 0) + 42), (byte) KeyEvent.keyCodeFromString(""), ImageFormat.getBitsPerPixel(0) + 57739231, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c((-921740305) - (ViewConfiguration.getTapTimeout() >> 16), 65493 - AndroidCharacter.getMirror('0'), (short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 117), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 57739245, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i14 = asInterface + 3;
            g = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -929237972};
                byte[] bArr3 = $$d;
                byte b8 = bArr3[5];
                byte b9 = b8;
                Object[] objArr13 = new Object[1];
                e(b9, (byte) (-b9), b8, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b10 = bArr3[23];
                byte b11 = b10;
                Object[] objArr14 = new Object[1];
                e(b11, (byte) (b11 | 54), b10, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 877;
                        int iArgb = Color.argb(0, 0, 0, 0) + 10;
                        byte[] bArr4 = $$a;
                        byte b12 = bArr4[5];
                        byte b13 = bArr4[7];
                        Object[] objArr16 = new Object[1];
                        a(b12, b13, b13, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionType, iLastIndexOf, iArgb, 2012931276, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c((-921740313) - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 85, (short) (TextUtils.indexOf("", "", 0) + 100), (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 57739153, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c((-921740308) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (-92) - View.MeasureSpec.getSize(0), (short) (TextUtils.indexOf((CharSequence) "", '0') - 121), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), (Process.myPid() >> 22) + 57739174, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                            int iAxisFromString = 875 - MotionEvent.axisFromString("");
                            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10;
                            byte[] bArr5 = $$a;
                            byte b14 = bArr5[5];
                            byte b15 = bArr5[7];
                            Object[] objArr19 = new Object[1];
                            a(b14, b15, (byte) (b15 | 52), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSizeAndState, iAxisFromString, scrollBarFadeDuration, 2012020043, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                            int mode2 = View.MeasureSpec.getMode(0) + 876;
                            int i16 = 10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            byte b16 = $$a[7];
                            byte b17 = b16;
                            Object[] objArr20 = new Object[1];
                            a(b16, b17, (byte) (b17 | 89), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, mode2, i16, -1650998592, false, (String) objArr20[0], null);
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
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[0])[0];
        if (i18 == i17) {
            int i19 = g + 107;
            asInterface = i19 % 128;
            int i20 = i19 % 2;
            int i21 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iNextInt = new Random().nextInt(1238850458);
            int i22 = ~iNextInt;
            int i23 = i21 + 1711760593 + (((~((-978531507) | i22)) | (~(iNextInt | (-938221278)))) * 333) + (((~(iNextInt | (-978531507))) | (~(i22 | (-938221278)))) * 333);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr21[1])[0] = i25 ^ (i25 << 5);
        } else {
            int[] iArr = new int[i18];
            int i26 = i18 - 1;
            iArr[i26] = 1;
            Toast.makeText((Context) null, iArr[((i18 * i26) % 2) - 1], 1).show();
            int i27 = ((int[]) objArr[1])[0];
            Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i28 = ~(((int) Runtime.getRuntime().freeMemory()) | 663903696);
            int i29 = i27 + (((-45685292) | i28) * (-658)) + 574522996 + ((i28 | (-666591228)) * 658);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr22[1])[0] = i31 ^ (i31 << 5);
        }
        int i32 = this.width;
        int i33 = g + 15;
        asInterface = i33 % 128;
        int i34 = i33 % 2;
        return i32;
    }

    static {
        d = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = asBinder + 35;
        d = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Specs copy$default(Specs specs, String str, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = asInterface + 65;
        int i6 = i5 % 128;
        g = i6;
        int i7 = i5 % 2;
        if ((i3 & 1) != 0) {
            int i8 = i6 + 7;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
            str = specs.url;
        }
        if ((i3 & 2) != 0) {
            i = specs.width;
        }
        if ((i3 & 4) != 0) {
            int i10 = asInterface;
            int i11 = i10 + 9;
            g = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = specs.height;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i13 = specs.height;
            int i14 = i10 + 71;
            g = i14 % 128;
            int i15 = i14 % 2;
            i2 = i13;
        }
        Specs specsCopy = specs.copy(str, i, i2);
        int i16 = asInterface + 19;
        g = i16 % 128;
        int i17 = i16 % 2;
        return specsCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        String str = this.url;
        int i5 = i3 + 9;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component3() {
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface + 105;
        int i4 = i3 % 128;
        g = i4;
        if (i3 % 2 != 0) {
            i = this.height;
            int i5 = 35 / 0;
        } else {
            i = this.height;
        }
        int i6 = i4 + 121;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 95 / 0;
        }
        return i;
    }

    public final Specs copy(String p0, int p1, int p2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Specs specs = new Specs(p0, p1, p2);
        int i2 = asInterface + 87;
        g = i2 % 128;
        int i3 = i2 % 2;
        return specs;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = g + 51;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == p0) {
            int i4 = i3 + 17;
            g = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!(p0 instanceof Specs)) {
            return false;
        }
        Specs specs = (Specs) p0;
        return Intrinsics.areEqual(this.url, specs.url) && this.width == specs.width && this.height == specs.height;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        g = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.url.hashCode() * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height);
        int i4 = g + 49;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.url;
        int i2 = this.width;
        int i3 = this.height;
        StringBuilder sb = new StringBuilder("Specs(url=");
        sb.append(str);
        sb.append(", width=");
        sb.append(i2);
        sb.append(", height=");
        sb.append(i3);
        sb.append(")");
        String string = sb.toString();
        int i4 = g + 97;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1881384073;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1934795635;
        TuitionPaymentFragmentbindingInflater1 = -1168246628;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new byte[]{66, 118, 121, 35, -108, 66, 107, 123, 112, 36, 39, -79, 70, 59, ByteCompanionObject.MIN_VALUE, 113, 112, ByteCompanionObject.MAX_VALUE, 76, 116, 79, -108, -104, -119, 100, 99, -112, 107, -114, -97, -118, -101, 111, -119, 103, 13, 2, Base64.padSymbol, 20, 26, 37, 11, 21, Base64.padSymbol, 19, 59, 31, -20, 29, 64, 14, 17, -3, 84, 5, 4, 3, 16, 56, 19, -17, -10, 25, -5, -18, -30, -31, -32, -20, -33, 49, -10, -11, 27, -20, -31, -6, 56, 33, 49, 54, 26, 29, 123, 41, 5, 45, -14, 69, 39, 13, 43, 107, 103, 94, -127, 103, 120, 67, -67, 119, 113, 103, 116, 115, 107, 97, -26, -26, -26, -26, -26, -26};
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
    private static java.lang.String $$g(short r7, byte r8, short r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.bpjstku.data.setting.model.response.Specs.$$c
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r9 = r9 + 117
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r4 = r2
            goto L28
        L13:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            int r9 = r9 + 1
            r3 = r0[r9]
        L28:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.setting.model.response.Specs.$$g(short, byte, short):java.lang.String");
    }
}
