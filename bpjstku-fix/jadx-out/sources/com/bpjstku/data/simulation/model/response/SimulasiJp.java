package com.bpjstku.data.simulation.model.response;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJL\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\fR\u001c\u0010$\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u000f"}, d2 = {"Lcom/bpjstku/data/simulation/model/response/SimulasiJp;", "", "", "p0", "p1", "", "p2", "p3", "p4", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/bpjstku/data/simulation/model/response/SimulasiJp;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "tahunPensiun", "Ljava/lang/Integer;", "getTahunPensiun", "masaIuran", "getMasaIuran", "manfaat", "Ljava/lang/String;", "getManfaat", "usiaPensiun", "getUsiaPensiun", "masaIuranTerbilang", "getMasaIuranTerbilang"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SimulasiJp {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asBinder;
    private static char asInterface;
    private static int b;
    private static long d;
    private static int g;

    @SerializedName("manfaat")
    private final String manfaat;

    @SerializedName("masaIuran")
    private final Integer masaIuran;

    @SerializedName("masaIuranTerbilang")
    private final String masaIuranTerbilang;

    @SerializedName("tahunPensiun")
    private final Integer tahunPensiun;

    @SerializedName("usiaPensiun")
    private final Integer usiaPensiun;
    private static final byte[] $$a = {115, 25, -47, -94};
    private static final int $$b = 152;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int INotificationSideChannel = 0;
    private static int onTransact = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f413a = 1;

    public SimulasiJp(Integer num, Integer num2, String str, Integer num3, String str2) {
        this.tahunPensiun = num;
        this.masaIuran = num2;
        this.manfaat = str;
        this.usiaPensiun = num3;
        this.masaIuranTerbilang = str2;
    }

    public final Integer getTahunPensiun() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 83;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.tahunPensiun;
        }
        throw null;
    }

    public final Integer getMasaIuran() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 69;
        INotificationSideChannel = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.masaIuran;
        int i4 = i2 + 65;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final String getManfaat() {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return this.manfaat;
        }
        throw null;
    }

    public final Integer getUsiaPensiun() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 69;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.usiaPensiun;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMasaIuranTerbilang() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 95;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.masaIuranTerbilang;
        int i4 = i2 + 5;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static void e(char[] cArr, char[] cArr2, char c, char[] cArr3, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        int i5 = $10 + 9;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i7 = $11 + 87;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 8328), KeyEvent.keyCodeFromString("") + 1235, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 34, -653973969, false, $$c((byte) 19, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), 2764 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 14, 1504416861, false, $$c((byte) 17, b3, b3), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - KeyEvent.keyCodeFromString("")), 253 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char defaultSize = (char) (65200 - View.getDefaultSize(0, 0));
                                int i9 = 2891 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                int doubleTapTimeout = 17 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                byte b4 = (byte) 0;
                                String str$$c = $$c((byte) 18, b4, b4);
                                i2 = 2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize, i9, doubleTapTimeout, 2012627446, false, str$$c, new Class[]{Integer.TYPE, Integer.TYPE});
                            } else {
                                i2 = 2;
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (d ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) g) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) asInterface) ^ (-6377398940819159759L)))));
                            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                            i3 = i2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x02a9  */
    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int i5 = 2;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 2268;
                int iResolveSizeAndState = 33 - View.resolveSizeAndState(0, 0, 0);
                byte length = (byte) $$a.length;
                byte b3 = (byte) (length - 4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, packedPositionChild, iResolveSizeAndState, 1387473586, false, $$c(length, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $11 + 47;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if ((i4 ^ 1) == 0) {
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (bArr != null) {
                    int length2 = bArr.length;
                    byte[] bArr2 = new byte[length2];
                    int i9 = 0;
                    while (i9 < length2) {
                        int i10 = $10 + 31;
                        $11 = i10 % 128;
                        if (i10 % i5 == 0) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 3358 - Color.argb(0, 0, 0, 0), 18 - TextUtils.indexOf("", "", 0), -1054011043, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                                }
                                bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i9])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), 3358 - View.getDefaultSize(0, 0), Color.alpha(0) + 18, -1054011043, false, $$c(b6, b7, b7), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                            i9++;
                        }
                        i5 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                        int iIndexOf = 2266 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int scrollBarSize = 33 - (ViewConfiguration.getScrollBarSize() >> 8);
                        byte length3 = (byte) $$a.length;
                        byte b8 = (byte) (length3 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRgb, iIndexOf, scrollBarSize, 1387473586, false, $$c(length3, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i11 = $11 + 93;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)) + i4;
                Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(b), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) 3;
                    byte b10 = (byte) (b9 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (55904 - TextUtils.getOffsetBefore("", 0)), 2855 - View.resolveSize(0, 0), 13 - View.combineMeasuredStates(0, 0), -1529949196, false, $$c(b9, b10, b10), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (bArr4 != null) {
                    int length4 = bArr4.length;
                    byte[] bArr5 = new byte[length4];
                    int i13 = $10 + 73;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    for (int i15 = 0; i15 < length4; i15++) {
                        bArr5[i15] = (byte) (((long) bArr4[i15]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i16 = $10 + 5;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        int i17 = $11 + 33;
                        $10 = i17 % 128;
                        if (i17 % 2 != 0) {
                            byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * (((byte) (((byte) (((long) bArr6[i18]) | 3046761265686732006L)) >>> s)) ^ b2));
                        } else {
                            byte[] bArr7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i19]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                    } else {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i20]) ^ 3046761265686732006L)) + s)) ^ b2));
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

    static {
        asBinder = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = f413a + 83;
        asBinder = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ SimulasiJp copy$default(SimulasiJp simulasiJp, Integer num, Integer num2, String str, Integer num3, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = INotificationSideChannel;
        int i4 = i3 + 61;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            num = simulasiJp.tahunPensiun;
        }
        Integer num4 = num;
        if ((i & 2) != 0) {
            num2 = simulasiJp.masaIuran;
        }
        Integer num5 = num2;
        if ((i & 4) != 0) {
            str = simulasiJp.manfaat;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            int i6 = i3 + 65;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            num3 = simulasiJp.usiaPensiun;
        }
        Integer num6 = num3;
        if ((i & 16) != 0) {
            int i8 = onTransact + 115;
            INotificationSideChannel = i8 % 128;
            if (i8 % 2 != 0) {
                String str4 = simulasiJp.masaIuranTerbilang;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = simulasiJp.masaIuranTerbilang;
        }
        return simulasiJp.copy(num4, num5, str3, num6, str2);
    }

    public final Integer component1() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 55;
        INotificationSideChannel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Integer num = this.tahunPensiun;
        int i4 = i2 + 51;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer component2() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 105;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.masaIuran;
        int i4 = i2 + 91;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return num;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = onTransact + 31;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        if (i2 % 2 != 0) {
            str = this.manfaat;
            int i4 = 64 / 0;
        } else {
            str = this.manfaat;
        }
        int i5 = i3 + 93;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component4() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 121;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.usiaPensiun;
        int i5 = i2 + 63;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component5() {
        String str;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 7;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            str = this.masaIuranTerbilang;
            int i4 = 38 / 0;
        } else {
            str = this.masaIuranTerbilang;
        }
        int i5 = i3 + 99;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return str;
    }

    public final SimulasiJp copy(Integer p0, Integer p1, String p2, Integer p3, String p4) {
        int i = 2 % 2;
        SimulasiJp simulasiJp = new SimulasiJp(p0, p1, p2, p3, p4);
        int i2 = onTransact + 11;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        return simulasiJp;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = INotificationSideChannel + 25;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(p0 instanceof SimulasiJp)) {
            return false;
        }
        SimulasiJp simulasiJp = (SimulasiJp) p0;
        if (!Intrinsics.areEqual(this.tahunPensiun, simulasiJp.tahunPensiun)) {
            int i4 = onTransact + 61;
            int i5 = i4 % 128;
            INotificationSideChannel = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 87;
            onTransact = i7 % 128;
            if (i7 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if ((!Intrinsics.areEqual(this.masaIuran, simulasiJp.masaIuran)) || !Intrinsics.areEqual(this.manfaat, simulasiJp.manfaat) || !Intrinsics.areEqual(this.usiaPensiun, simulasiJp.usiaPensiun)) {
            return false;
        }
        if (Intrinsics.areEqual(this.masaIuranTerbilang, simulasiJp.masaIuranTerbilang)) {
            int i8 = onTransact + 49;
            INotificationSideChannel = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        int i10 = INotificationSideChannel + 79;
        onTransact = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public final int hashCode() {
        Integer num;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onTransact + 31;
        INotificationSideChannel = i2 % 128;
        int iHashCode3 = 0;
        int iHashCode4 = (i2 % 2 == 0 ? (num = this.tahunPensiun) != null : (num = this.tahunPensiun) != null) ? num.hashCode() : 0;
        Integer num2 = this.masaIuran;
        if (num2 == null) {
            int i3 = INotificationSideChannel + 81;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num2.hashCode();
            int i5 = INotificationSideChannel + 39;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        String str = this.manfaat;
        if (str == null) {
            int i7 = onTransact + 63;
            INotificationSideChannel = i7 % 128;
            iHashCode2 = i7 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = str.hashCode();
        }
        Integer num3 = this.usiaPensiun;
        int iHashCode5 = num3 == null ? 0 : num3.hashCode();
        String str2 = this.masaIuranTerbilang;
        if (str2 != null) {
            int i8 = onTransact + 69;
            INotificationSideChannel = i8 % 128;
            int i9 = i8 % 2;
            iHashCode3 = str2.hashCode();
        }
        return (((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode3;
    }

    public final String toString() {
        int i = 2 % 2;
        Integer num = this.tahunPensiun;
        Integer num2 = this.masaIuran;
        String str = this.manfaat;
        Integer num3 = this.usiaPensiun;
        String str2 = this.masaIuranTerbilang;
        StringBuilder sb = new StringBuilder("SimulasiJp(tahunPensiun=");
        sb.append(num);
        sb.append(", masaIuran=");
        sb.append(num2);
        sb.append(", manfaat=");
        sb.append(str);
        sb.append(", usiaPensiun=");
        sb.append(num3);
        sb.append(", masaIuranTerbilang=");
        sb.append(str2);
        sb.append(")");
        String string = sb.toString();
        int i2 = onTransact + 17;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(android.content.Context r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 4152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.simulation.model.response.SimulasiJp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(android.content.Context, int, int):java.lang.Object[]");
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 741920170;
        TuitionPaymentFragmentbindingInflater1 = -1934795565;
        b = -848980941;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new byte[]{-26, -4, 26, -1, 44, 27, 26, 25, -10, 30, -55, -32, 22, -61, 33, 18, -13, 25, -59, -64, 88, 27, 26, 25, -10, 30, -55, -32, 23, -21, 9, 51, 13, 12, 63, 15, Base64.padSymbol, -32, -30, 2, 57, 39, -24, 4, 2, 57, 71, -56, 76, 62, 5, 30, -15, ByteCompanionObject.MAX_VALUE, 15, 9, Base64.padSymbol, 7, 16, 4, 48, -49, 124, 29, 41, 31, Base64.padSymbol, 84, 47, 65, 90, 83, 4, 45, -106, 90, 89, 65, 90, 83, 36, 13, 102, 87, 86, 85, 34, 74, 37, -69, -88, -80, -91, -69, -126, -34, -88, -80, -96, -66, -76, -121, -54, -71, -88, 83, 66, 55, 118, 76, 84, 68, 82, 72, 91, 110, 93, 76, 99, -110, 71, -122, -100, 100, -108, 98, -104, 107, 120, -37, -97, 88, -48, 100, 99, -117, 100, -99, 110, 87, -96, -111, -112, -97, 108, -108, 111, 124, -103, 111, 107, 121, -103, 117, 108, 100, -74, -86, -94, -68, -83, -126, -52, -36, -70, -95, -91, -86, -96, -40, -83, -80, -115, -72, -27, -83, -80, -83, -104, 24, -88, -78, -90, -96, -67, -95, -35, 104, -16, -46, -72, -90, 23, 29, 25, -9, 23, -29, 26, -14, -59, 89, 29, -90, 94, -30, -31, 9, -30, 27, -20, -43, 46, 31, 30, 29, -22, 18, -19, 76, 42, 81, 85, 90, 80, 72, 93, 32, Base64.padSymbol, 113, 76, 42, 78, 32, 86, 36, 81, 69, 35, 86, 74, 83, 73, 65, 82, 89, 50, 90, 93, 75, 105, 58, -118, 82, 89, 82, 1, -127, 81, 91, 79, 73, 34, 86, 66, 17, -103, 123, 33, 79, 42, 84, 46, 33, 80, 32, 94, 5, 7, 39, 90, 120, 67, 52, 89, 90, 47, 72, 5, 70, 54, 89, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26};
        d = -6377398940819159759L;
        g = -981105359;
        asInterface = (char) 63824;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(int r6, int r7, int r8) {
        /*
            int r8 = r8 * 2
            int r0 = r8 + 1
            byte[] r1 = com.bpjstku.data.simulation.model.response.SimulasiJp.$$a
            int r6 = 121 - r6
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.simulation.model.response.SimulasiJp.$$c(int, int, int):java.lang.String");
    }
}
