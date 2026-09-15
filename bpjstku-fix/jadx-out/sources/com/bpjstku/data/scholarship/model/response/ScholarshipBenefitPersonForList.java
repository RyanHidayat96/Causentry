package com.bpjstku.data.scholarship.model.response;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\tR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t\"\u0004\b\u001c\u0010\u0019R$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010\u0019"}, d2 = {"Lcom/bpjstku/data/scholarship/model/response/ScholarshipBenefitPersonForList;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/scholarship/model/response/ScholarshipBenefitPersonForList;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kodeKlaim", "Ljava/lang/String;", "getKodeKlaim", "setKodeKlaim", "(Ljava/lang/String;)V", "nikPenerima", "getNikPenerima", "setNikPenerima", "namaPenerima", "getNamaPenerima", "setNamaPenerima"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipBenefitPersonForList {
    public static final int $stable = 8;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char[] b;

    @SerializedName("kodeKlaim")
    private String kodeKlaim;

    @SerializedName("namaPenerimaBeasiswa")
    private String namaPenerima;

    @SerializedName("nikPenerimaBeasiswa")
    private String nikPenerima;
    private static final byte[] $$c = {48, -119, -71, 110};
    private static final int $$f = 48;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {101, 89, 94, -73, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -48, -17, 4, 15, Base64.padSymbol, -48, -12, 10, 62, -73, 27, 2, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 69};
    private static final int $$e = 216;
    private static final byte[] $$a = {6, 51, 46, 31, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 122;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int asBinder = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 52
            int r9 = 56 - r9
            byte[] r0 = com.bpjstku.data.scholarship.model.response.ScholarshipBenefitPersonForList.$$a
            int r8 = r8 * 52
            int r8 = r8 + 1
            int r7 = 103 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r9 = -r9
            int r3 = r3 + 1
            int r7 = r7 + r9
            int r7 = r7 + (-11)
            r9 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.scholarship.model.response.ScholarshipBenefitPersonForList.a(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 18
            int r0 = 53 - r8
            int r6 = r6 * 15
            int r6 = 99 - r6
            byte[] r1 = com.bpjstku.data.scholarship.model.response.ScholarshipBenefitPersonForList.$$d
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2e:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + 3
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.scholarship.model.response.ScholarshipBenefitPersonForList.d(int, int, int, java.lang.Object[]):void");
    }

    public ScholarshipBenefitPersonForList(String str, String str2, String str3) {
        this.kodeKlaim = str;
        this.nikPenerima = str2;
        this.namaPenerima = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ScholarshipBenefitPersonForList(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
            int i8 = i7 % 128;
            asBinder = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 % 2;
            }
            str3 = "";
        }
        this(str, str2, str3);
    }

    public final String getKodeKlaim() {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.kodeKlaim;
        int i5 = i3 + 65;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setKodeKlaim(String str) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.kodeKlaim = str;
        int i5 = i2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getNikPenerima() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.nikPenerima;
        int i4 = i3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setNikPenerima(String str) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.nikPenerima = str;
        int i5 = i2 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 89 / 0;
        }
    }

    public final String getNamaPenerima() {
        String str;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.namaPenerima;
            int i4 = 77 / 0;
        } else {
            str = this.namaPenerima;
        }
        int i5 = i2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setNamaPenerima(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 3;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.namaPenerima = str;
        if (i4 == 0) {
            int i5 = 8 / 0;
        }
        int i6 = i2 + 19;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(b[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2188, (ViewConfiguration.getFadingEdgeLength() >> 16) + 40, 841711447, false, $$g(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - TextUtils.getOffsetAfter("", 0)), Drawable.resolveOpacity(0, 0) + 3011, TextUtils.lastIndexOf("", '0', 0, 0) + 27, 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 36505), TextUtils.lastIndexOf("", '0', 0) + 3377, TextUtils.lastIndexOf("", '0', 0, 0) + 18, -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i5 = $10 + 43;
                $11 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i7 = $11 + 31;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i9 = $10 + 51;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36506 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionGroup(0L) + 3376, 16 - TextUtils.indexOf((CharSequence) "", '0'), -968507904, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                obj.hashCode();
                throw null;
            }
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (36505 - TextUtils.indexOf("", "", 0)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3376, 17 - Color.alpha(0), -968507904, false, $$g(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    public final String toString() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        String str = this.kodeKlaim;
        String str2 = this.nikPenerima;
        String str3 = this.namaPenerima;
        StringBuilder sb = new StringBuilder("ScholarshipBenefitPersonForList(kodeKlaim=");
        sb.append(str);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cArgb = (char) Color.argb(0, 0, 0, 0);
            int keyRepeatDelay = 876 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a((byte) (bArr[0] - 1), bArr[7], bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, keyRepeatDelay, keyRepeatTimeout, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c((-1) - TextUtils.lastIndexOf("", '0', 0, 0), KeyEvent.normalizeMetaState(0) + 22, (char) (49015 - TextUtils.lastIndexOf("", '0', 0)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(22 - TextUtils.getOffsetAfter("", 0), 15 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((-1) - MotionEvent.axisFromString("")), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int iRgb = Color.rgb(0, 0, 0) + 16778092;
            int defaultSize = 10 - View.getDefaultSize(0, 0);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[10];
            byte b3 = bArr2[5];
            Object[] objArr5 = new Object[1];
            a(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, iRgb, defaultSize, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                int i2 = 876 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iKeyCodeFromString = 10 - KeyEvent.keyCodeFromString("");
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                a(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration, i2, iKeyCodeFromString, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i3 = ~startUptimeMillis;
            int i4 = (((1065230372 + (((~((-234886412) | i3)) | 275196640) * 220)) + (((~(i3 | (-235967772))) | 276278000) * (-440))) + ((startUptimeMillis | (-234886412)) * 220)) - 1723973173;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36, TextUtils.indexOf("", "", 0) + 26, (char) (25833 - (ViewConfiguration.getPressedStateDuration() >> 16)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(Color.rgb(0, 0, 0) + 16777279, View.resolveSizeAndState(0, 0, 0) + 18, (char) (33638 - (Process.myPid() >> 22)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(81 - TextUtils.indexOf("", ""), 16 - Gravity.getAbsoluteGravity(0, 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 96, 16 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (MotionEvent.axisFromString("") + 1), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i8 = i7 + 99;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 11;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), -1723973173};
                byte b6 = (byte) 0;
                byte b7 = (byte) (b6 - 1);
                Object[] objArr13 = new Object[1];
                d(b6, b7, (byte) (-b7), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte[] bArr3 = $$d;
                Object[] objArr14 = new Object[1];
                d((byte) (bArr3[37] - 1), bArr3[44], b6, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                        int i12 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 876;
                        int mode = View.MeasureSpec.getMode(0) + 10;
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr16 = new Object[1];
                        a(b8, b9, b9, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(threadPriority, i12, mode, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(ExpandableListView.getPackedPositionGroup(0L), 22 - (Process.myPid() >> 22), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 49016), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(Color.argb(0, 0, 0, 0) + 22, 14 - ExpandableListView.getPackedPositionChild(0L), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                            int iIndexOf = 876 - TextUtils.indexOf("", "", 0, 0);
                            int iBlue = Color.blue(0) + 10;
                            byte[] bArr4 = $$a;
                            byte b10 = bArr4[10];
                            byte b11 = bArr4[5];
                            Object[] objArr19 = new Object[1];
                            a(b10, b11, b11, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iIndexOf, iBlue, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cRed = (char) Color.red(0);
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 876;
                            int size = 10 - View.MeasureSpec.getSize(0);
                            byte[] bArr5 = $$a;
                            Object[] objArr20 = new Object[1];
                            a((byte) (bArr5[0] - 1), bArr5[7], bArr5[5], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed, iNormalizeMetaState, size, 252381699, false, (String) objArr20[0], null);
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
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            throw null;
        }
        int i13 = asBinder + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
        int i14 = i13 % 2;
        int i15 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i16 = ~iIdentityHashCode;
        int i17 = i15 + (((2070192700 + (((~(375798270 | i16)) | (~((-416108500) | iIdentityHashCode))) * (-370))) + ((((~(iIdentityHashCode | 375798270)) | (~(i16 | (-416108500)))) | 102903852) * (-370))) - 580280424);
        int i18 = (i17 << 13) ^ i17;
        int i19 = i18 ^ (i18 >>> 17);
        Object obj = objArr21[1];
        ((int[]) obj)[0] = i19 ^ (i19 << 5);
        int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        asBinder = i20 % 128;
        if (i20 % 2 == 0) {
            int i21 = 4 % 3;
        }
        int i22 = ((int[]) obj)[0];
        int i23 = i22 * i22;
        int i24 = -(182262781 * i22);
        int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
        int i26 = -(i22 * 537832525);
        int i27 = (i25 & i26) + (i26 | i25);
        int i28 = (i27 & 1730407769) + (1730407769 | i27);
        int i29 = i28 >> 19;
        int i30 = ((i29 & (-16383)) + (i29 | (-16383))) / 8192;
        int i31 = (i28 - (~(((i30 | 1) << 1) - (i30 ^ 1)))) - 1;
        int i32 = i28 >> 27;
        int i33 = ((i32 & (-63)) + (i32 | (-63))) / 32;
        int i34 = -(i31 ^ (((i33 | 1) << 1) - (i33 ^ 1)));
        int i35 = ((i34 | 9) << 1) - (i34 ^ 9);
        int i36 = i35 >> 29;
        int i37 = ((i36 & (-15)) + (i36 | (-15))) / 8;
        sb.append("23|, nikPenerima=".substring(22383 / (((-((((i37 | 1) << 1) - (i37 ^ 1)) + 1)) & i35) * 829)));
        sb.append(str2);
        sb.append(", namaPenerima=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = TuitionPaymentFragmentbindingInflater1 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        int i2 = i % 2;
    }

    public ScholarshipBenefitPersonForList() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ScholarshipBenefitPersonForList copy$default(ScholarshipBenefitPersonForList scholarshipBenefitPersonForList, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = i3 + 13;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            str = scholarshipBenefitPersonForList.kodeKlaim;
        }
        if ((i & 2) != 0) {
            int i6 = i3 + 37;
            asBinder = i6 % 128;
            if (i6 % 2 == 0) {
                String str4 = scholarshipBenefitPersonForList.nikPenerima;
                throw null;
            }
            str2 = scholarshipBenefitPersonForList.nikPenerima;
        }
        if ((i & 4) != 0) {
            str3 = scholarshipBenefitPersonForList.namaPenerima;
            int i7 = asBinder + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
        }
        return scholarshipBenefitPersonForList.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.kodeKlaim;
        int i4 = i2 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.nikPenerima;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.namaPenerima;
        int i5 = i2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ScholarshipBenefitPersonForList copy(String p0, String p1, String p2) {
        int i = 2 % 2;
        ScholarshipBenefitPersonForList scholarshipBenefitPersonForList = new ScholarshipBenefitPersonForList(p0, p1, p2);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return scholarshipBenefitPersonForList;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipBenefitPersonForList)) {
            int i2 = asBinder;
            int i3 = i2 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 91 / 0;
            }
            return false;
        }
        ScholarshipBenefitPersonForList scholarshipBenefitPersonForList = (ScholarshipBenefitPersonForList) p0;
        if (!Intrinsics.areEqual(this.kodeKlaim, scholarshipBenefitPersonForList.kodeKlaim)) {
            int i7 = asBinder + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.nikPenerima, scholarshipBenefitPersonForList.nikPenerima)) {
            if (Intrinsics.areEqual(this.namaPenerima, scholarshipBenefitPersonForList.namaPenerima)) {
                return true;
            }
            int i9 = asBinder + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            return i9 % 2 != 0;
        }
        int i10 = asBinder + 17;
        int i11 = i10 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 25;
        asBinder = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = asBinder + 59;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.kodeKlaim;
        int iHashCode2 = 0;
        if (str == null) {
            int i5 = i3 + 123;
            asBinder = i5 % 128;
            iHashCode = i5 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
            int i6 = asBinder + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 5;
            }
        }
        String str2 = this.nikPenerima;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.namaPenerima;
        Object obj = null;
        if (str3 != null) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
            asBinder = i8 % 128;
            if (i8 % 2 == 0) {
                str3.hashCode();
                obj.hashCode();
                throw null;
            }
            iHashCode2 = str3.hashCode();
        }
        int i9 = (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
        int i10 = asBinder + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
        if (i10 % 2 == 0) {
            return i9;
        }
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        b = new char[]{3717, 36145, 2550, 34215, 'g', 39978, 6370, 38103, 4947, 44804, 11140, 42942, 8793, 48872, 15018, 47476, 13625, 45516, 19886, 51306, 17435, 49368, 45561, 12875, 46731, 15069, 48899, 9054, 42906, 11219, 44065, 4206, 38078, 6369, 40241, 398, 34243, 54548, 22176, 53863, 24118, 56310, 18363, 50035, 20294, 51404, 29846, 61515, 31826, 63984, 25961, 57659, 25321, 61107, 27255, 38439, 5101, 40893, 6986, 34581, 221, 35996, 2130, 12953, 45364, 13822, 47545, 15475, 41011, 9452, 43174, 12114, 37657, 6104, 39834, 7773, 33508, 1716, 34150, 2341, 36351, 45558, 12870, 46748, 15052, 48990, 9047, 42911, 11247, 44067, 4129, 38017, 6380, 40235, 407, 34243, 1540, 45557, 12867, 46735, 15043, 48900, 9042, 42890, 11256, 44044, 4206, 38049, 6397, 40219, 396, 34242, 1548};
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2505685851827221031L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, int r8) {
        /*
            byte[] r0 = com.bpjstku.data.scholarship.model.response.ScholarshipBenefitPersonForList.$$c
            int r7 = r7 * 2
            int r7 = 1 - r7
            int r8 = r8 * 3
            int r8 = 115 - r8
            int r6 = r6 * 2
            int r6 = 3 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            int r6 = r6 + 1
            if (r4 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r3 = r0[r6]
        L28:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.scholarship.model.response.ScholarshipBenefitPersonForList.$$g(byte, int, int):java.lang.String");
    }
}
