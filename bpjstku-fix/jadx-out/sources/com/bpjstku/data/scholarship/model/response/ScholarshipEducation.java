package com.bpjstku.data.scholarship.model.response;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.firebase.abt.R;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJp\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001e\u0010\u000eR$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010#R$\u0010$\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u000e\"\u0004\b&\u0010#R$\u0010'\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010#R$\u0010*\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\u000e\"\u0004\b,\u0010#R$\u0010-\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\u000e\"\u0004\b/\u0010#R$\u00100\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010 \u001a\u0004\b1\u0010\u000e\"\u0004\b2\u0010#R$\u00103\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010 \u001a\u0004\b4\u0010\u000e\"\u0004\b5\u0010#R$\u00106\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010 \u001a\u0004\b7\u0010\u000e\"\u0004\b8\u0010#"}, d2 = {"Lcom/bpjstku/data/scholarship/model/response/ScholarshipEducation;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/scholarship/model/response/ScholarshipEducation;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "tahun", "Ljava/lang/String;", "getTahun", "setTahun", "(Ljava/lang/String;)V", "jenjang", "getJenjang", "setJenjang", "tingkat", "getTingkat", "setTingkat", "manfaat", "getManfaat", "setManfaat", "jenisBeasiswa", "getJenisBeasiswa", "setJenisBeasiswa", "lembaga", "getLembaga", "setLembaga", "tanggal", "getTanggal", "setTanggal", "flag", "getFlag", "setFlag"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipEducation {
    public static final int $stable = 8;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int b;

    @SerializedName("flag")
    private String flag;

    @SerializedName("jenisBeasiswa")
    private String jenisBeasiswa;

    @SerializedName("jenjang")
    private String jenjang;

    @SerializedName("lembaga")
    private String lembaga;

    @SerializedName("manfaat")
    private String manfaat;

    @SerializedName("tahun")
    private String tahun;

    @SerializedName("tglRekam")
    private String tanggal;

    @SerializedName("tingkat")
    private String tingkat;
    private static final byte[] $$c = {5, -91, 77, 46};
    private static final int $$d = 227;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {46, 47, -18, 64, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 29;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            int r7 = r7 * 15
            int r7 = r7 + 38
            byte[] r0 = com.bpjstku.data.scholarship.model.response.ScholarshipEducation.$$a
            int r8 = r8 * 2
            int r8 = r8 + 84
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2b
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r3 = r3 + 1
            int r8 = -r8
            int r9 = r9 + r8
            int r8 = r9 + (-11)
            r9 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.scholarship.model.response.ScholarshipEducation.a(int, int, int, java.lang.Object[]):void");
    }

    public ScholarshipEducation(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.tahun = str;
        this.jenjang = str2;
        this.tingkat = str3;
        this.manfaat = str4;
        this.jenisBeasiswa = str5;
        this.lembaga = str6;
        this.tanggal = str7;
        this.flag = str8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ScholarshipEducation(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str9;
        String str10;
        if ((i & 64) != 0) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            str9 = null;
        } else {
            str9 = str7;
        }
        if ((i & 128) != 0) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str10 = null;
        } else {
            str10 = str8;
        }
        this(str, str2, str3, str4, str5, str6, str9, str10);
    }

    public final String getTahun() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.tahun;
            int i4 = 19 / 0;
        } else {
            str = this.tahun;
        }
        int i5 = i2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 3290 - Process.getGidForName(""), KeyEvent.keyCodeFromString("") + 31, 1199271174, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (-b4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Drawable.resolveOpacity(0, 0), 650 - ((byte) KeyEvent.getModifierMetaStateMask()), 44 - (Process.myPid() >> 22), -450685997, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $10 + 1;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i8 = $10 + 45;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (-b6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 651 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -450685997, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public final void setTahun(String str) throws Throwable {
        int length;
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (29944 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            int i2 = 1756 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 24;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i2, bitsPerPixel, 986134021, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(false, Gravity.getAbsoluteGravity(0, 0) + 261, 21 - ExpandableListView.getPackedPositionChild(0L), Color.alpha(0) + 21, new char[]{11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(false, 265 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15, (ViewConfiguration.getWindowTouchSlop() >> 8) + 15, new char[]{65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29944);
            int iRgb = (-16775461) - Color.rgb(0, 0, 0);
            int iCombineMeasuredStates = 23 - View.combineMeasuredStates(0, 0);
            byte[] bArr = $$a;
            byte b4 = bArr[5];
            byte b5 = bArr[7];
            Object[] objArr5 = new Object[1];
            a(b4, b5, (byte) (b5 | 37), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop, iRgb, iCombineMeasuredStates, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char fadingEdgeLength = (char) (29944 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                int size = 1755 - View.MeasureSpec.getSize(0);
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 23;
                byte[] bArr2 = $$a;
                byte b6 = bArr2[5];
                byte b7 = bArr2[7];
                Object[] objArr6 = new Object[1];
                a(b6, b7, (byte) (b7 | 89), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength, size, tapTimeout, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i3 = ((int[]) objArr7[0])[0];
            objArr = new Object[]{new int[]{i3}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = (((-118798613) + (((~((~iIdentityHashCode) | 276932051)) | 220991500) * 446)) + (((~(iIdentityHashCode | 497923551)) | 268542977) * 446)) - 544981275;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[3])[0] = i6 ^ (i6 << 5);
        } else {
            if (str != null) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
                TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                if (i7 % 2 != 0) {
                    str.length();
                    obj.hashCode();
                    throw null;
                }
                length = str.length();
            } else {
                length = 0;
            }
            try {
                Object[] objArr8 = {1596802378};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.getMode(0) + 42049), 1727 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da = R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(length, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr8), -322942467);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0));
                    int iIndexOf = 1754 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int doubleTapTimeout = 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte[] bArr3 = $$a;
                    byte b8 = bArr3[5];
                    byte b9 = bArr3[7];
                    Object[] objArr9 = new Object[1];
                    a(b8, b9, (byte) (b9 | 89), objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, iIndexOf, doubleTapTimeout, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                try {
                    Object[] objArr10 = new Object[1];
                    c(false, 261 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 22, 21 - View.MeasureSpec.getSize(0), new char[]{11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534}, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(false, TextUtils.lastIndexOf("", '0') + 266, 15 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 15, new char[]{65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534}, objArr11);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29943);
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 1755;
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 23;
                        byte[] bArr4 = $$a;
                        byte b10 = bArr4[5];
                        byte b11 = bArr4[7];
                        Object[] objArr12 = new Object[1];
                        a(b10, b11, (byte) (b11 | 37), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, capsMode, iResolveOpacity, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cAlpha = (char) (Color.alpha(0) + 29944);
                        int i8 = 1756 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int i9 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                        byte b12 = $$a[7];
                        byte b13 = b12;
                        Object[] objArr13 = new Object[1];
                        a(b12, b13, b13, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cAlpha, i8, i9, 986134021, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    objArr = objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i10 = ((int[]) objArr[1])[0];
        int i11 = ((int[]) objArr[0])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArr[3])[0];
            int i13 = ((int[]) objArr[0])[0];
            Object[] objArr14 = {new int[]{i13}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int iMyPid = Process.myPid();
            int i14 = ~iMyPid;
            int i15 = (-107246447) + (((~((-617353347) | i14)) | (~((-422617694) | iMyPid))) * 520);
            int i16 = ~(422617693 | i14);
            int i17 = ~(iMyPid | 635220119);
            int i18 = i12 + i15 + ((i16 | i17) * (-1040)) + ((i17 | (~(i14 | (-635220120))) | (-1039971040)) * 520);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr14[3])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i21 = 0;
                while (i21 < strArr.length) {
                    int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
                    TuitionPaymentFragmentbindingInflater1 = i22 % 128;
                    int i23 = i22 % 2;
                    arrayList.add(strArr[i21]);
                    i21++;
                    int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
                    TuitionPaymentFragmentbindingInflater1 = i24 % 128;
                    if (i24 % 2 != 0) {
                        int i25 = 2 % 4;
                    }
                }
            }
            Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
            int i26 = ((int[]) objArr[3])[0];
            int i27 = ((int[]) objArr[0])[0];
            Object[] objArr15 = {new int[]{i27}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i28 = i26 + 1341142089 + (((~((-84152389) | (~iIdentityHashCode2))) | (~(128450037 | iIdentityHashCode2))) * (-272)) + (((~((-92585414) | iIdentityHashCode2)) | 8433025) * (-272)) + (((~(iIdentityHashCode2 | 92585413)) | 120017012) * 272);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr15[3])[0] = i30 ^ (i30 << 5);
        }
        this.tahun = str;
        int i31 = TuitionPaymentFragmentbindingInflater1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i31 % 128;
        if (i31 % 2 == 0) {
            int i32 = 52 / 0;
        }
    }

    public final String getJenjang() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.jenjang;
            int i4 = 80 / 0;
        } else {
            str = this.jenjang;
        }
        int i5 = i2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setJenjang(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 75;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        this.jenjang = str;
        int i5 = i3 + 117;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTingkat() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tingkat;
        int i5 = i2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
        return str;
    }

    public final void setTingkat(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 9;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        this.tingkat = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 33;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getManfaat() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.manfaat;
            int i4 = 46 / 0;
        } else {
            str = this.manfaat;
        }
        int i5 = i2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setManfaat(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.manfaat = str;
        if (i4 != 0) {
            int i5 = 75 / 0;
        }
        int i6 = i3 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String getJenisBeasiswa() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.jenisBeasiswa;
        }
        throw null;
    }

    public final void setJenisBeasiswa(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 117;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.jenisBeasiswa = str;
        int i5 = i2 + 17;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getLembaga() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 125;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.lembaga;
        int i4 = i2 + 59;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setLembaga(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.lembaga = str;
        int i5 = i3 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final String getTanggal() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 61;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tanggal;
        int i5 = i2 + 29;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTanggal(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.tanggal = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
    }

    public final String getFlag() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.flag;
        }
        throw null;
    }

    public final void setFlag(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 109;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.flag = str;
        int i5 = i2 + 5;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ ScholarshipEducation copy$default(ScholarshipEducation scholarshipEducation, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        String str9;
        String str10;
        String str11;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        int i4 = i3 % 128;
        TuitionPaymentFragmentbindingInflater1 = i4;
        String str12 = (i3 % 2 == 0 ? (i & 1) == 0 : (i & 1) == 0) ? str : scholarshipEducation.tahun;
        if ((i & 2) != 0) {
            int i5 = i4 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            str9 = scholarshipEducation.jenjang;
        } else {
            str9 = str2;
        }
        String str13 = (i & 4) != 0 ? scholarshipEducation.tingkat : str3;
        if ((i & 8) != 0) {
            str10 = scholarshipEducation.manfaat;
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
            TuitionPaymentFragmentbindingInflater1 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str10 = str4;
        }
        String str14 = (i & 16) != 0 ? scholarshipEducation.jenisBeasiswa : str5;
        String str15 = (i & 32) != 0 ? scholarshipEducation.lembaga : str6;
        if ((i & 64) != 0) {
            int i9 = TuitionPaymentFragmentbindingInflater1 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            if (i9 % 2 == 0) {
                String str16 = scholarshipEducation.tanggal;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str11 = scholarshipEducation.tanggal;
        } else {
            str11 = str7;
        }
        return scholarshipEducation.copy(str12, str9, str13, str10, str14, str15, str11, (i & 128) != 0 ? scholarshipEducation.flag : str8);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 != 0) {
            str = this.tahun;
            int i4 = 95 / 0;
        } else {
            str = this.tahun;
        }
        int i5 = i3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 13;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.jenjang;
        int i5 = i3 + 113;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 49;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.tingkat;
            int i4 = 31 / 0;
        } else {
            str = this.tingkat;
        }
        int i5 = i2 + 19;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.manfaat;
        int i5 = i3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.jenisBeasiswa;
        int i4 = i3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 97;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.lembaga;
        int i5 = i2 + 13;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.tanggal;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.flag;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ScholarshipEducation copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7) {
        int i = 2 % 2;
        ScholarshipEducation scholarshipEducation = new ScholarshipEducation(p0, p1, p2, p3, p4, p5, p6, p7);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return scholarshipEducation;
        }
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipEducation)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 17;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 109;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ScholarshipEducation scholarshipEducation = (ScholarshipEducation) p0;
        if (!Intrinsics.areEqual(this.tahun, scholarshipEducation.tahun) || !Intrinsics.areEqual(this.jenjang, scholarshipEducation.jenjang)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.tingkat, scholarshipEducation.tingkat)) {
            int i6 = TuitionPaymentFragmentbindingInflater1 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.manfaat, scholarshipEducation.manfaat)) {
            int i8 = TuitionPaymentFragmentbindingInflater1 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.jenisBeasiswa, scholarshipEducation.jenisBeasiswa)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.lembaga, scholarshipEducation.lembaga)) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
            TuitionPaymentFragmentbindingInflater1 = i10 % 128;
            return i10 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.tanggal, scholarshipEducation.tanggal)) {
            int i11 = TuitionPaymentFragmentbindingInflater1 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.flag, scholarshipEducation.flag)) {
            return true;
        }
        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        TuitionPaymentFragmentbindingInflater1 = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.tahun;
        int iHashCode4 = 0;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.jenjang;
        if (str2 == null) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.tingkat;
        if (str3 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 / 3;
            }
        }
        String str4 = this.manfaat;
        if (str4 == null) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        String str5 = this.jenisBeasiswa;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.lembaga;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tanggal;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.flag;
        if (str8 != null) {
            int i10 = TuitionPaymentFragmentbindingInflater1 + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
            if (i10 % 2 == 0) {
                int iHashCode9 = str8.hashCode();
                int i11 = 79 / 0;
                iHashCode4 = iHashCode9;
            } else {
                iHashCode4 = str8.hashCode();
            }
        }
        return (((((((((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode4;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.tahun;
        String str2 = this.jenjang;
        String str3 = this.tingkat;
        String str4 = this.manfaat;
        String str5 = this.jenisBeasiswa;
        String str6 = this.lembaga;
        String str7 = this.tanggal;
        String str8 = this.flag;
        StringBuilder sb = new StringBuilder("ScholarshipEducation(tahun=");
        sb.append(str);
        sb.append(", jenjang=");
        sb.append(str2);
        sb.append(", tingkat=");
        sb.append(str3);
        sb.append(", manfaat=");
        sb.append(str4);
        sb.append(", jenisBeasiswa=");
        sb.append(str5);
        sb.append(", lembaga=");
        sb.append(str6);
        sb.append(", tanggal=");
        sb.append(str7);
        sb.append(", flag=");
        sb.append(str8);
        sb.append(")");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        b = -83722304;
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
    private static java.lang.String $$e(short r6, int r7, byte r8) {
        /*
            byte[] r0 = com.bpjstku.data.scholarship.model.response.ScholarshipEducation.$$c
            int r8 = r8 * 4
            int r1 = 1 - r8
            int r6 = r6 + 4
            int r7 = 120 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L15
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r4 = r0[r7]
            int r3 = r3 + 1
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.scholarship.model.response.ScholarshipEducation.$$e(short, int, byte):java.lang.String");
    }
}
