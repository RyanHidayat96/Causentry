package com.bpjstku.data.payment.model.response;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.tasks.zzu;
import com.google.gson.annotations.SerializedName;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001b\u0010\u0011Jt\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b%\u0010\u0011J\u001d\u0010(\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020\u001e¢\u0006\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0011R\u001a\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u0011R\u001a\u0010/\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u0011R\u001a\u00101\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010\u0011R\u001a\u00103\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u0010\u0011R\u001a\u00105\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u0010\u0011R\u001a\u00107\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010+\u001a\u0004\b8\u0010\u0011R\u001a\u00109\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u0019R\u001a\u0010<\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010+\u001a\u0004\b=\u0010\u0011R\u001a\u0010>\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010+\u001a\u0004\b?\u0010\u0011"}, d2 = {"Lcom/bpjstku/data/payment/model/response/GetListSertakanItemResponse;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "", "p7", "p8", "p9", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Z", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/response/GetListSertakanItemResponse;", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "namaLengkap", "Ljava/lang/String;", "getNamaLengkap", "email", "getEmail", "handPhone", "getHandPhone", "tipeRekening", "getTipeRekening", "nik", "getNik", "nominal", "getNominal", "kodePlanRecurring", "getKodePlanRecurring", "allowed_nonaktif", "Z", "getAllowed_nonaktif", "tglAktifRecurring", "getTglAktifRecurring", "tglRekamRecurring", "getTglRekamRecurring"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GetListSertakanItemResponse implements Parcelable {
    public static final int $stable;
    public static final Parcelable.Creator<GetListSertakanItemResponse> CREATOR;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static boolean b;

    @SerializedName("allowed_nonaktif")
    private final boolean allowed_nonaktif;

    @SerializedName("email")
    private final String email;

    @SerializedName("handPhone")
    private final String handPhone;

    @SerializedName("kodePlanRecurring")
    private final String kodePlanRecurring;

    @SerializedName("namaLengkap")
    private final String namaLengkap;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("nominal")
    private final String nominal;

    @SerializedName("tglAktifRecurring")
    private final String tglAktifRecurring;

    @SerializedName("tglRekamRecurring")
    private final String tglRekamRecurring;

    @SerializedName("tipeRekening")
    private final String tipeRekening;
    private static final byte[] $$c = {30, 17, -35, 104};
    private static final int $$d = 226;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {57, -50, -56, -93, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 185;
    private static int g = 0;
    private static int asInterface = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f397a = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.data.payment.model.response.GetListSertakanItemResponse.$$a
            int r7 = 92 - r7
            int r8 = r8 * 15
            int r1 = 53 - r8
            int r6 = r6 * 4
            int r6 = r6 + 84
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L32
        L16:
            r3 = r2
        L17:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L32:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.response.GetListSertakanItemResponse.c(short, byte, short, java.lang.Object[]):void");
    }

    public GetListSertakanItemResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.namaLengkap = str;
        this.email = str2;
        this.handPhone = str3;
        this.tipeRekening = str4;
        this.nik = str5;
        this.nominal = str6;
        this.kodePlanRecurring = str7;
        this.allowed_nonaktif = z;
        this.tglAktifRecurring = str8;
        this.tglRekamRecurring = str9;
    }

    public final String getNamaLengkap() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 1;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.namaLengkap;
        int i5 = i2 + 81;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 99 / 0;
        }
        return str;
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = g + 91;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.email;
        int i4 = i3 + 27;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return str;
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GetListSertakanItemResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetListSertakanItemResponse[] newArray(int i) throws IllegalAccessException {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46399 - TextUtils.indexOf((CharSequence) "", '0', 0)), 39 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0) + 19, 1513912262, false, "b", null);
            }
            int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - TextUtils.getTrimmedLength("")), Color.alpha(0) + 59, 19 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
            }
            int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
            long j = i3;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 37837), 59 - TextUtils.indexOf("", "", 0, 0), View.MeasureSpec.getMode(0) + 18, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
            long j2 = -1;
            long j3 = ((j2 ^ 1809568562470271251L) | 3709684934689514988L) ^ j2;
            long jIdentityHashCode = System.identityHashCode(this);
            long j4 = 70;
            long j5 = (((long) 71) * 1809568562470271251L) + (((long) (-69)) * 3709684934689514988L) + (((long) (-140)) * (j3 | ((jIdentityHashCode | 3709684934689514988L) ^ j2))) + (((4287413441650064895L | jIdentityHashCode) ^ j2) * j4) + (j4 * ((j2 ^ (jIdentityHashCode | 1809568562470271251L)) | j3 | (((3709684934689514988L ^ j2) | 1809568562470271251L) ^ j2)));
            int i5 = 0;
            while (true) {
                for (int i6 = 0; i6 != 8; i6++) {
                    i4 = (((((int) (j >> i6)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
                }
                if (i5 != 0) {
                    break;
                }
                i5++;
                j = j5;
            }
            if (i4 != i2) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - View.MeasureSpec.getSize(0)), Process.getGidForName("") + 41, 19 - Color.red(0), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                int[] iArr = new int[i3];
                int i7 = i3 - 1;
                iArr[i7] = 1;
                Toast.makeText((Context) null, iArr[((i3 * i7) % 2) - 1], 1).show();
            }
            return new GetListSertakanItemResponse[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetListSertakanItemResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GetListSertakanItemResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }
    }

    public final String getHandPhone() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 63;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.handPhone;
        int i5 = i2 + 37;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void d(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = $11 + 21;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr3[i6]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.getGidForName("") + 31340), View.getDefaultSize(i3, i3) + 2994, TextUtils.indexOf("", "") + 17, 1182129903, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    int i7 = $10 + 35;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43324), 254 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            int i9 = 33602;
            int i10 = 1687675375;
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i10);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (i9 - TextUtils.indexOf("", "")), (KeyEvent.getMaxKeyCode() >> 16) + 3085, TextUtils.indexOf("", "", 0) + 26, -2146875848, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    i9 = 33602;
                    i10 = 1687675375;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (b) {
                int i11 = $10 + 17;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                } else {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                }
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i12 = $11 + 115;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 << 1) % getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] << i] + iIntValue);
                        Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 1;
                            byte b7 = (byte) (b6 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33602), AndroidCharacter.getMirror('0') + 3037, 26 - (ViewConfiguration.getTapTimeout() >> 16), -2146875848, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    } else {
                        cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b8 = (byte) 1;
                            byte b9 = (byte) (b8 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 33602), 3085 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.getTrimmedLength("") + 26, -2146875848, false, $$e(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    }
                    int i13 = $11 + 71;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                }
                objArr[0] = new String(cArr2);
                return;
            }
            int i15 = 0;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            while (true) {
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15;
                if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    i15 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                }
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public final String getTipeRekening() throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (29944 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int iMakeMeasureSpec = 1755 - View.MeasureSpec.makeMeasureSpec(0, 0);
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 23;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr = new Object[1];
            c(b2, (byte) (b2 | 89), bArr[5], objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iMakeMeasureSpec, jumpTapTimeout, 986134021, false, (String) objArr[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr2 = new Object[1];
        d(null, null, 127 - (Process.myPid() >> 22), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        d(null, null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0));
            int iResolveSize = View.resolveSize(0, 0) + 1755;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 24;
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr4 = new Object[1];
            c(b4, (byte) (b4 | 52), b3, objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, iResolveSize, iLastIndexOf, 1596667560, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = asInterface + 89;
            g = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 29943);
                int modifierMetaStateMask = 1754 - ((byte) KeyEvent.getModifierMetaStateMask());
                int iMyPid = (Process.myPid() >> 22) + 23;
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr5 = new Object[1];
                c(b5, b6, b6, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, modifierMetaStateMask, iMyPid, 1599039318, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i4 = ~elapsedCpuTime;
            int i5 = (((711695537 + ((((~((-321672966) | i4)) | 288102148) | (~(109070539 | i4))) * (-1136))) + ((((~((-321672966) | elapsedCpuTime)) | (~(109070539 | elapsedCpuTime))) | (~((-75499723) | i4))) * (-568))) + (((~(elapsedCpuTime | (-288102149))) | ((~(i4 | (-109070540))) | (~(321672965 | i4)))) * 568)) - 2007716619;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr7 = new Object[1];
            d(null, null, 127 - KeyEvent.getDeadChar(0, 0), new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            d(null, null, (KeyEvent.getMaxKeyCode() >> 16) + 127, new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr8);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr9 = {1980495494};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42050 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 1726 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.getOffsetBefore("", 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), -2007716619, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 29944);
                    int packedPositionType = 1755 - ExpandableListView.getPackedPositionType(0L);
                    int iLastIndexOf2 = 22 - TextUtils.lastIndexOf("", '0', 0);
                    byte b7 = $$a[7];
                    byte b8 = b7;
                    Object[] objArr10 = new Object[1];
                    c(b7, b8, b8, objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop, packedPositionType, iLastIndexOf2, 1599039318, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr11 = new Object[1];
                    d(null, null, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    d(null, null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr12);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c3 = (char) (29945 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int i8 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1754;
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 24;
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr13 = new Object[1];
                        c(b10, (byte) (b10 | 52), b9, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, i8, packedPositionChild, 1596667560, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char mode = (char) (29944 - View.MeasureSpec.getMode(0));
                        int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1755;
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23;
                        byte[] bArr2 = $$a;
                        byte b11 = bArr2[7];
                        Object[] objArr14 = new Object[1];
                        c(b11, (byte) (b11 | 89), bArr2[5], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(mode, jumpTapTimeout2, scrollDefaultDelay, 986134021, false, (String) objArr14[0], null);
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
        if (i10 != i9) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr != null) {
                int i11 = g + 55;
                asInterface = i11 % 128;
                for (int i12 = i11 % 2 != 0 ? 0 : 1; i12 < strArr.length; i12++) {
                    arrayList.add(strArr[i12]);
                }
            }
            throw new RuntimeException(String.valueOf(i10));
        }
        int i13 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int i14 = ~((~((int) SystemClock.uptimeMillis())) | (-289478737));
        int i15 = i13 + ((((-502087387) | i14) * (-970)) - 1552818809) + ((i14 | 212608650) * 970);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr15[3])[0] = i17 ^ (i17 << 5);
        int i18 = asInterface + 27;
        int i19 = i18 % 128;
        g = i19;
        int i20 = i18 % 2;
        int i21 = i19 + 41;
        asInterface = i21 % 128;
        if (i21 % 2 != 0) {
            return this.tipeRekening;
        }
        obj.hashCode();
        throw null;
    }

    public final String getNik() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 17;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.nik;
        int i4 = i2 + 93;
        g = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getNominal() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 117;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.nominal;
        int i4 = i2 + 63;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getKodePlanRecurring() {
        int i = 2 % 2;
        int i2 = g + 95;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.kodePlanRecurring;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getAllowed_nonaktif() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 77;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.allowed_nonaktif;
        int i4 = i2 + 73;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final String getTglAktifRecurring() {
        int i = 2 % 2;
        int i2 = g + 113;
        int i3 = i2 % 128;
        asInterface = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.tglAktifRecurring;
        int i4 = i3 + 101;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getTglRekamRecurring() {
        int i = 2 % 2;
        int i2 = g + 61;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.tglRekamRecurring;
        }
        throw null;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        CREATOR = new Creator();
        $stable = 8;
        int i = f397a + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ GetListSertakanItemResponse copy$default(GetListSertakanItemResponse getListSertakanItemResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, int i, Object obj) {
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = g + 103;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            str10 = getListSertakanItemResponse.namaLengkap;
        } else {
            str10 = str;
        }
        if ((i & 2) != 0) {
            int i5 = g + 125;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            str11 = getListSertakanItemResponse.email;
        } else {
            str11 = str2;
        }
        if ((i & 4) != 0) {
            int i7 = g + 29;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            str12 = getListSertakanItemResponse.handPhone;
        } else {
            str12 = str3;
        }
        if ((i & 8) != 0) {
            int i9 = asInterface + 35;
            g = i9 % 128;
            int i10 = i9 % 2;
            str13 = getListSertakanItemResponse.tipeRekening;
        } else {
            str13 = str4;
        }
        if ((i & 16) != 0) {
            int i11 = g + 89;
            asInterface = i11 % 128;
            if (i11 % 2 == 0) {
                String str17 = getListSertakanItemResponse.nik;
                throw null;
            }
            str14 = getListSertakanItemResponse.nik;
        } else {
            str14 = str5;
        }
        if ((i & 32) != 0) {
            int i12 = g + 29;
            asInterface = i12 % 128;
            if (i12 % 2 == 0) {
                String str18 = getListSertakanItemResponse.nominal;
                throw null;
            }
            str15 = getListSertakanItemResponse.nominal;
        } else {
            str15 = str6;
        }
        String str19 = (i & 64) != 0 ? getListSertakanItemResponse.kodePlanRecurring : str7;
        boolean z2 = (i & 128) != 0 ? getListSertakanItemResponse.allowed_nonaktif : z;
        if ((i & 256) != 0) {
            int i13 = asInterface + 61;
            g = i13 % 128;
            int i14 = i13 % 2;
            str16 = getListSertakanItemResponse.tglAktifRecurring;
        } else {
            str16 = str8;
        }
        return getListSertakanItemResponse.copy(str10, str11, str12, str13, str14, str15, str19, z2, str16, (i & 512) != 0 ? getListSertakanItemResponse.tglRekamRecurring : str9);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.namaLengkap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.tglRekamRecurring;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = g + 13;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.email;
        int i5 = i3 + 61;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 45;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.handPhone;
        int i5 = i2 + 41;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 35;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tipeRekening;
        int i5 = i2 + 101;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 67;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.nik;
        int i5 = i2 + 89;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 67;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.nominal;
        int i5 = i2 + 1;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        g = i2 % 128;
        int i3 = i2 % 2;
        String str = this.kodePlanRecurring;
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return str;
    }

    public final boolean component8() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 77;
        g = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.allowed_nonaktif;
        int i5 = i2 + 45;
        g = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = g + 5;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.tglAktifRecurring;
        }
        throw null;
    }

    public final GetListSertakanItemResponse copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, boolean p7, String p8, String p9) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p9, "");
        GetListSertakanItemResponse getListSertakanItemResponse = new GetListSertakanItemResponse(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
        int i2 = asInterface + 83;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return getListSertakanItemResponse;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 115;
        g = i3 % 128;
        int i4 = i3 % 2 != 0 ? 1 : 0;
        int i5 = i2 + 81;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(!(p0 instanceof GetListSertakanItemResponse))) {
            GetListSertakanItemResponse getListSertakanItemResponse = (GetListSertakanItemResponse) p0;
            if ((!Intrinsics.areEqual(this.namaLengkap, getListSertakanItemResponse.namaLengkap)) || !Intrinsics.areEqual(this.email, getListSertakanItemResponse.email)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.handPhone, getListSertakanItemResponse.handPhone)) {
                int i2 = asInterface + 117;
                g = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.tipeRekening, getListSertakanItemResponse.tipeRekening) || !Intrinsics.areEqual(this.nik, getListSertakanItemResponse.nik) || !Intrinsics.areEqual(this.nominal, getListSertakanItemResponse.nominal) || !Intrinsics.areEqual(this.kodePlanRecurring, getListSertakanItemResponse.kodePlanRecurring)) {
                return false;
            }
            if (this.allowed_nonaktif != getListSertakanItemResponse.allowed_nonaktif) {
                int i4 = g + 91;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.tglAktifRecurring, getListSertakanItemResponse.tglAktifRecurring) || !Intrinsics.areEqual(this.tglRekamRecurring, getListSertakanItemResponse.tglRekamRecurring)) {
                return false;
            }
            int i6 = g + 91;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 58 / 0;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        g = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((this.namaLengkap.hashCode() * 31) + this.email.hashCode()) * 31) + this.handPhone.hashCode()) * 31) + this.tipeRekening.hashCode()) * 31) + this.nik.hashCode()) * 31) + this.nominal.hashCode()) * 31) + this.kodePlanRecurring.hashCode()) * 31) + Boolean.hashCode(this.allowed_nonaktif)) * 31) + this.tglAktifRecurring.hashCode()) * 31) + this.tglRekamRecurring.hashCode();
        int i4 = asInterface + 101;
        g = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.namaLengkap;
        String str2 = this.email;
        String str3 = this.handPhone;
        String str4 = this.tipeRekening;
        String str5 = this.nik;
        String str6 = this.nominal;
        String str7 = this.kodePlanRecurring;
        boolean z = this.allowed_nonaktif;
        String str8 = this.tglAktifRecurring;
        String str9 = this.tglRekamRecurring;
        StringBuilder sb = new StringBuilder("GetListSertakanItemResponse(namaLengkap=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", handPhone=");
        sb.append(str3);
        sb.append(", tipeRekening=");
        sb.append(str4);
        sb.append(", nik=");
        sb.append(str5);
        sb.append(", nominal=");
        sb.append(str6);
        sb.append(", kodePlanRecurring=");
        sb.append(str7);
        sb.append(", allowed_nonaktif=");
        sb.append(z);
        sb.append(", tglAktifRecurring=");
        sb.append(str8);
        sb.append(", tglRekamRecurring=");
        sb.append(str9);
        sb.append(")");
        String string = sb.toString();
        int i2 = asInterface + 87;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 43 / 0;
        }
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        int i = 2 % 2;
        int i2 = g + 35;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.namaLengkap);
        p0.writeString(this.email);
        p0.writeString(this.handPhone);
        p0.writeString(this.tipeRekening);
        p0.writeString(this.nik);
        p0.writeString(this.nominal);
        p0.writeString(this.kodePlanRecurring);
        p0.writeInt(this.allowed_nonaktif ? 1 : 0);
        p0.writeString(this.tglAktifRecurring);
        p0.writeString(this.tglRekamRecurring);
        int i4 = asInterface + 71;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new char[]{47296, 47347, 47357, 47343, 47346, 47352, 47283, 47342, 47310, 47336, 47341, 47356, 47348, 47326, 47349, 47358, 47350, 47345, 47311, 47351, 47339, 47354, 47321, 47353};
        TuitionPaymentFragmentbindingInflater1 = 2047719521;
        b = true;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
    }

    private static String $$e(int i, byte b2, byte b3) {
        int i2 = b3 + 4;
        int i3 = b2 * 2;
        int i4 = 68 - i;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 = (-i4) + i3;
            i2 = i2;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i4;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            int i7 = i2 + 1;
            i4 = (-bArr[i7]) + i4;
            i2 = i7;
            i5 = i6;
        }
    }
}
