package com.bpjstku.data.asik.model.response;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\u000bJ\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000bR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u000bR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u000bR\u001c\u0010%\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u000f"}, d2 = {"Lcom/bpjstku/data/asik/model/response/AsikListKpjItem;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/bpjstku/data/asik/model/response/AsikListKpjItem;", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "kpj", "Ljava/lang/String;", "getKpj", "workerCode", "getWorkerCode", "kodeSegmen", "getKodeSegmen", "flagShow", "Ljava/lang/Boolean;", "getFlagShow"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AsikListKpjItem implements Parcelable {
    public static final int $stable;
    public static final Parcelable.Creator<AsikListKpjItem> CREATOR;
    private static byte[] TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asBinder;
    private static int b;

    @SerializedName("flagShow")
    private final Boolean flagShow;

    @SerializedName("kodeSegmen")
    private final String kodeSegmen;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("workerCode")
    private final String workerCode;
    private static final byte[] $$c = {94, -56, 58, -24};
    private static final int $$d = 33;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {109, 7, 114, -90, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 148;
    private static int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f383a = 1;
    private static int g = 1;

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AsikListKpjItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AsikListKpjItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AsikListKpjItem(string, string2, string3, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AsikListKpjItem[] newArray(int i) {
            return new AsikListKpjItem[i];
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = 53 - r9
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r0 = com.bpjstku.data.asik.model.response.AsikListKpjItem.$$a
            int r7 = r7 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.asik.model.response.AsikListKpjItem.c(int, byte, byte, java.lang.Object[]):void");
    }

    public AsikListKpjItem(String str, String str2, String str3, Boolean bool) {
        this.kpj = str;
        this.workerCode = str2;
        this.kodeSegmen = str3;
        this.flagShow = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AsikListKpjItem(String str, String str2, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = d + 21;
            f383a = i2 % 128;
            int i3 = i2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i4 = f383a + 119;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 21 / 0;
            }
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i6 = d + 45;
            f383a = i6 % 128;
            int i7 = i6 % 2;
            str3 = null;
        }
        if ((i & 8) != 0) {
            bool = Boolean.TRUE;
            int i8 = 2 % 2;
        }
        this(str, str2, str3, bool);
    }

    public final String getKpj() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 7;
        f383a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.kpj;
        int i5 = i2 + 43;
        f383a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getWorkerCode() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 115;
        f383a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.workerCode;
        int i5 = i2 + 19;
        f383a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getKodeSegmen() {
        int i = 2 % 2;
        int i2 = f383a;
        int i3 = i2 + 5;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.kodeSegmen;
        int i5 = i2 + 75;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Boolean getFlagShow() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 125;
        f383a = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.flagShow;
        int i4 = i2 + 95;
        f383a = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), 2267 - View.MeasureSpec.makeMeasureSpec(0, 0), ExpandableListView.getPackedPositionType(0L) + 33, 1387473586, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr = TuitionPaymentFragmentbindingInflater1;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        int i7 = $10 + 51;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b5 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 3358 - (ViewConfiguration.getPressedStateDuration() >> 16), 18 - KeyEvent.normalizeMetaState(0), -1054011043, false, $$e(b5, b5, (byte) $$c.length), new Class[]{Integer.TYPE});
                            }
                            bArr2[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentbindingInflater1;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2266, 33 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1387473586, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i9 = $11 + 111;
                int i10 = i9 % 128;
                $10 = i10;
                int i11 = i9 % 2;
                int i12 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L));
                if (z2) {
                    int i13 = i10 + 125;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i12 + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 55904), 2855 - TextUtils.getTrimmedLength(""), 12 - TextUtils.lastIndexOf("", '0'), -1529949196, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentbindingInflater1;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i15 = 0;
                    while (i15 < length2) {
                        bArr5[i15] = (byte) (((long) bArr4[i15]) ^ 3046761265686732006L);
                        i15++;
                        int i16 = $10 + 41;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i18 = $10;
                    int i19 = i18 + 107;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    int i21 = i18 + 51;
                    $11 = i21 % 128;
                    int i22 = i21 % 2;
                    z = true;
                } else {
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        int i23 = $10 + 11;
                        $11 = i23 % 128;
                        int i24 = i23 % 2;
                        byte[] bArr6 = TuitionPaymentFragmentbindingInflater1;
                        int i25 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i25 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i25]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i26 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i26 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i26]) ^ 3046761265686732006L)) + s)) ^ b2));
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

    public final int hashCode() throws Throwable {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        Object[] objArr;
        int i = 2 % 2;
        String str = this.kpj;
        if (str == null) {
            int i2 = d + 91;
            f383a = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 2;
            }
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.workerCode;
        if (str2 == null) {
            int i4 = f383a + 33;
            d = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.kodeSegmen;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.flagShow;
        if (bool != null) {
            int i6 = d + 65;
            f383a = i6 % 128;
            if (i6 % 2 == 0) {
                iHashCode3 = bool.hashCode();
                int i7 = 26 / 0;
            } else {
                iHashCode3 = bool.hashCode();
            }
        } else {
            iHashCode3 = 0;
        }
        int i8 = iHashCode * 31;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
            int fadingEdgeLength = 651 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            int iNormalizeMetaState = 44 - KeyEvent.normalizeMetaState(0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[5], bArr[80], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, fadingEdgeLength, iNormalizeMetaState, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e((-1413514266) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) - 67, (short) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (byte) (115 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (-1672199048) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((-1413514263) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-68) - View.resolveSize(0, 0), (short) KeyEvent.getDeadChar(0, 0), (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 29), (-1672199026) - TextUtils.getTrimmedLength(""), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 651;
            int iRgb = Color.rgb(0, 0, 0) + 16777260;
            byte b2 = $$a[7];
            Object[] objArr5 = new Object[1];
            c((byte) 51, b2, (byte) (b2 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, tapTimeout, iRgb, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                int scrollBarSize = 651 - (ViewConfiguration.getScrollBarSize() >> 8);
                int touchSlop = 44 - (ViewConfiguration.getTouchSlop() >> 8);
                byte b3 = $$a[80];
                Object[] objArr6 = new Object[1];
                c((byte) 51, b3, (byte) (b3 | 14), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, scrollBarSize, touchSlop, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i9 = ((int[]) objArr7[2])[0];
            int i10 = ((int[]) objArr7[0])[0];
            int iNextInt = new Random().nextInt();
            int i11 = ~iNextInt;
            int i12 = 291618765 + (((~((-516231204) | i11)) | 4522018 | (~(512800393 | i11)) | (~((-1091209) | iNextInt))) * (-84));
            int i13 = (~(iNextInt | 512800393)) | 516231203;
            int i14 = ~(i11 | (-512800394));
            int i15 = ((i12 + ((i13 | i14) * (-84))) + ((1091208 | i14) * 84)) - 441778559;
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr[3])[0] = i17 ^ (i17 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Process.myPid() >> 22), TextUtils.getOffsetAfter("", 0) + 1610, 26 - (KeyEvent.getMaxKeyCode() >> 16), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -441778559, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 651;
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44;
                    byte b4 = $$a[7];
                    Object[] objArr9 = new Object[1];
                    c((byte) 51, b4, (byte) (b4 | 52), objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, maxKeyCode, doubleTapTimeout, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 695, Color.blue(0) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Drawable.resolveOpacity(0, 0) + 63406), Process.getGidForName("") + 794, 83 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cGreen = (char) Color.green(0);
                    int longPressTimeout = 651 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iIndexOf = 43 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte b5 = $$a[80];
                    Object[] objArr11 = new Object[1];
                    c((byte) 51, b5, (byte) (b5 | 14), objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cGreen, longPressTimeout, iIndexOf, -1595579076, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                try {
                    Object[] objArr12 = new Object[1];
                    e((-1413514266) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 68, (short) KeyEvent.normalizeMetaState(0), (byte) (115 - (ViewConfiguration.getLongPressTimeout() >> 16)), View.getDefaultSize(0, 0) - 1672199048, objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    e(Color.green(0) - 1413514263, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 69, (short) (ExpandableListView.getPackedPositionChild(0L) + 1), (byte) ((-28) - KeyEvent.getDeadChar(0, 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1672199026, objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 651;
                        int iLastIndexOf = 43 - TextUtils.lastIndexOf("", '0');
                        byte b6 = $$a[7];
                        Object[] objArr14 = new Object[1];
                        c((byte) 51, b6, (byte) (b6 | 52), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionType, touchSlop2, iLastIndexOf, -873460649, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                        int offsetBefore = 651 - TextUtils.getOffsetBefore("", 0);
                        int offsetAfter = 44 - TextUtils.getOffsetAfter("", 0);
                        byte[] bArr2 = $$a;
                        Object[] objArr15 = new Object[1];
                        c(bArr2[5], bArr2[80], bArr2[7], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(deadChar, offsetBefore, offsetAfter, -459846511, false, (String) objArr15[0], null);
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
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                for (String str4 : strArr) {
                    int i18 = d + 93;
                    f383a = i18 % 128;
                    int i19 = i18 % 2;
                    arrayList.add(str4);
                }
            }
            throw null;
        }
        Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
        int i20 = ((int[]) objArr[3])[0];
        int i21 = ((int[]) objArr[2])[0];
        int i22 = ((int[]) objArr[0])[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i23 = 436551259 + ((iIdentityHashCode | 6046609) * (-50));
        int i24 = ~((-5767681) | iIdentityHashCode);
        int i25 = ~iIdentityHashCode;
        int i26 = i20 + i23 + ((i24 | (~(8383479 | i25))) * 50) + (((~(i25 | 6046609)) | (~(2615799 | i25)) | (-8383480)) * 50);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        Object obj = objArr16[3];
        ((int[]) obj)[0] = i28 ^ (i28 << 5);
        int i29 = ((i8 + iHashCode2) * 31) + iHashCode4;
        int i30 = ((int[]) obj)[0];
        int i31 = i30 * i30;
        int i32 = -(1580076905 * i30);
        int i33 = (((i31 ^ i32) + ((i31 & i32) << 1)) - (~(-(i30 * 579658965)))) - (-1959235520);
        int i34 = (((i33 >> 17) - 65535) / 32768) + 1;
        int i35 = (i33 & i34) + (i34 | i33);
        int i36 = i33 >> 20;
        int i37 = ((i36 & (-8191)) + (i36 | (-8191))) / 4096;
        int i38 = -((((i37 | 1) << 1) - (i37 ^ 1)) ^ i35);
        int i39 = (i38 & 4) + (i38 | 4);
        int i40 = i39 >> 17;
        int i41 = ((((-65535) | i40) << 1) - (i40 ^ (-65535))) / 32768;
        int i42 = (i41 & 1) + (i41 | 1);
        return (i29 * (229400 / (((-(((i42 | 1) << 1) - (i42 ^ 1))) & i39) * 1850))) + iHashCode3;
    }

    static {
        asBinder = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        CREATOR = new Creator();
        $stable = 8;
        int i = g + 7;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public AsikListKpjItem() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ AsikListKpjItem copy$default(AsikListKpjItem asikListKpjItem, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = i3 + 71;
        f383a = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            str = asikListKpjItem.kpj;
        }
        if ((i & 2) != 0) {
            str2 = asikListKpjItem.workerCode;
            int i5 = i3 + 49;
            f383a = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 4) != 0) {
            int i7 = f383a + 75;
            d = i7 % 128;
            int i8 = i7 % 2;
            str3 = asikListKpjItem.kodeSegmen;
        }
        if ((i & 8) != 0) {
            bool = asikListKpjItem.flagShow;
        }
        return asikListKpjItem.copy(str, str2, str3, bool);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = f383a + 109;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return this.kpj;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = f383a + 35;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.workerCode;
        int i5 = i3 + 45;
        f383a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = f383a;
        int i3 = i2 + 69;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.kodeSegmen;
        int i4 = i2 + 17;
        d = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Boolean component4() {
        int i = 2 % 2;
        int i2 = f383a + 101;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return this.flagShow;
        }
        throw null;
    }

    public final AsikListKpjItem copy(String p0, String p1, String p2, Boolean p3) {
        int i = 2 % 2;
        AsikListKpjItem asikListKpjItem = new AsikListKpjItem(p0, p1, p2, p3);
        int i2 = d + 35;
        f383a = i2 % 128;
        int i3 = i2 % 2;
        return asikListKpjItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = d + 51;
        int i3 = i2 % 128;
        f383a = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 51;
        d = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AsikListKpjItem)) {
            int i2 = d + 117;
            f383a = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        AsikListKpjItem asikListKpjItem = (AsikListKpjItem) p0;
        if (!Intrinsics.areEqual(this.kpj, asikListKpjItem.kpj)) {
            int i4 = f383a + 43;
            d = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.workerCode, asikListKpjItem.workerCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.kodeSegmen, asikListKpjItem.kodeSegmen)) {
            int i5 = f383a + 89;
            d = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.flagShow, asikListKpjItem.flagShow)) {
            return true;
        }
        int i7 = d + 37;
        f383a = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.kpj;
        String str2 = this.workerCode;
        String str3 = this.kodeSegmen;
        Boolean bool = this.flagShow;
        StringBuilder sb = new StringBuilder("AsikListKpjItem(kpj=");
        sb.append(str);
        sb.append(", workerCode=");
        sb.append(str2);
        sb.append(", kodeSegmen=");
        sb.append(str3);
        sb.append(", flagShow=");
        sb.append(bool);
        sb.append(")");
        String string = sb.toString();
        int i2 = d + 117;
        f383a = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        r4.writeInt(1);
        r4.writeInt(r0.booleanValue() ? 1 : 0);
        r4 = com.bpjstku.data.asik.model.response.AsikListKpjItem.d + 63;
        com.bpjstku.data.asik.model.response.AsikListKpjItem.f383a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        r4.writeInt(0);
     */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.bpjstku.data.asik.model.response.AsikListKpjItem.d
            int r0 = r0 + 39
            int r1 = r0 % 128
            com.bpjstku.data.asik.model.response.AsikListKpjItem.f383a = r1
            int r0 = r0 % r5
            r1 = 0
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            if (r0 != 0) goto L2b
            java.lang.String r0 = r3.kpj
            r4.writeString(r0)
            java.lang.String r0 = r3.workerCode
            r4.writeString(r0)
            java.lang.String r0 = r3.kodeSegmen
            r4.writeString(r0)
            java.lang.Boolean r0 = r3.flagShow
            r2 = 23
            int r2 = r2 / r1
            if (r0 != 0) goto L42
            goto L3e
        L2b:
            java.lang.String r0 = r3.kpj
            r4.writeString(r0)
            java.lang.String r0 = r3.workerCode
            r4.writeString(r0)
            java.lang.String r0 = r3.kodeSegmen
            r4.writeString(r0)
            java.lang.Boolean r0 = r3.flagShow
            if (r0 != 0) goto L42
        L3e:
            r4.writeInt(r1)
            return
        L42:
            r1 = 1
            r4.writeInt(r1)
            boolean r0 = r0.booleanValue()
            r4.writeInt(r0)
            int r4 = com.bpjstku.data.asik.model.response.AsikListKpjItem.d
            int r4 = r4 + 63
            int r0 = r4 % 128
            com.bpjstku.data.asik.model.response.AsikListKpjItem.f383a = r0
            int r4 = r4 % r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.asik.model.response.AsikListKpjItem.writeToParcel(android.os.Parcel, int):void");
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -284760210;
        b = -1934795611;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -655501158;
        TuitionPaymentFragmentbindingInflater1 = new byte[]{53, -99, 97, -106, -68, 67, -99, 100, -108, 111, -77, -80, 46, -111, -44, 95, 110, 111, 104, -101, 99, -104, 42, -6, 6, -9, 10, 9, -2, 17, -20, -3, -16, 1, 13, -9, 5};
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
    private static java.lang.String $$e(int r6, byte r7, short r8) {
        /*
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r1 = com.bpjstku.data.asik.model.response.AsikListKpjItem.$$c
            int r8 = r8 + 117
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.asik.model.response.AsikListKpjItem.$$e(int, byte, short):java.lang.String");
    }
}
