package com.bpjstku.data.jp.model.request;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionProcessor;
import defpackage.createCameraSelectorById;
import defpackage.initSession;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0080\u0001\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010\u0003\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b+\u0010\u0018R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0016R\u001a\u0010/\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0018R\u001a\u00102\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u0010\u0018R\u001a\u00104\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u0010\u0018R\u001a\u00106\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b7\u0010\u0018R\u001a\u00108\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b9\u0010\u0018R\u001a\u0010:\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u0010\u0018R\u001a\u0010<\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u00100\u001a\u0004\b=\u0010\u0018R\u001a\u0010>\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u00100\u001a\u0004\b?\u0010\u0018R\u001a\u0010@\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u00100\u001a\u0004\bA\u0010\u0018R\u001a\u0010B\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u00100\u001a\u0004\bC\u0010\u0018"}, d2 = {"Lcom/bpjstku/data/jp/model/request/JpInstantConfirmationRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "Ljava/io/File;", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "<init>", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "Lokhttp3/RequestBody;", "getPartMap", "()Ljava/util/Map;", "component1", "()Ljava/io/File;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jp/model/request/JpInstantConfirmationRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "file", "Ljava/io/File;", "getFile", "benefitTypeCode", "Ljava/lang/String;", "getBenefitTypeCode", "pelaporIdentityNumber", "getPelaporIdentityNumber", "pelaporName", "getPelaporName", "pelaporBirthDate", "getPelaporBirthDate", "membershipIdentityNumber", "getMembershipIdentityNumber", "pelaporEmail", "getPelaporEmail", "pelaporNumberPhone", "getPelaporNumberPhone", "scoreFace", "getScoreFace", "scoreFaceLiveness", "getScoreFaceLiveness", "pelaporSimilarityName", "getPelaporSimilarityName"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JpInstantConfirmationRequest extends BaseRequest {
    public static final int $stable = 8;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int b;

    @SerializedName("benefitTypeCode")
    private final String benefitTypeCode;

    @SerializedName("file")
    private final File file;

    @SerializedName("membershipIdentityNumber")
    private final String membershipIdentityNumber;

    @SerializedName("pelaporBirthDate")
    private final String pelaporBirthDate;

    @SerializedName("pelaporEmail")
    private final String pelaporEmail;

    @SerializedName("pelaporIdentityNumber")
    private final String pelaporIdentityNumber;

    @SerializedName("pelaporName")
    private final String pelaporName;

    @SerializedName("pelaporNumberPhone")
    private final String pelaporNumberPhone;

    @SerializedName("pelaporSimilarityName")
    private final String pelaporSimilarityName;

    @SerializedName("scoreFace")
    private final String scoreFace;

    @SerializedName("scoreFaceLiveness")
    private final String scoreFaceLiveness;
    private static final byte[] $$c = {39, 27, 2, 54};
    private static final int $$d = 89;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {25, 5, -88, -44, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 78;
    private static int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f391a = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r5 = 84 - r5
            int r7 = r7 * 4
            int r0 = r7 + 53
            byte[] r1 = com.bpjstku.data.jp.model.request.JpInstantConfirmationRequest.$$a
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r0 = new byte[r0]
            int r7 = r7 + 52
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r5
            r5 = r7
            r4 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L29:
            r3 = r1[r6]
        L2b:
            int r5 = r5 + r3
            int r6 = r6 + 1
            int r5 = r5 + (-11)
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jp.model.request.JpInstantConfirmationRequest.e(byte, int, int, java.lang.Object[]):void");
    }

    public final File getFile() {
        int i = 2 % 2;
        int i2 = d + 101;
        f391a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.file;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBenefitTypeCode() {
        int i = 2 % 2;
        int i2 = f391a + 73;
        d = i2 % 128;
        int i3 = i2 % 2;
        String str = this.benefitTypeCode;
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        return str;
    }

    public final String getPelaporIdentityNumber() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 57;
        f391a = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.pelaporIdentityNumber;
        int i4 = i2 + 1;
        f391a = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getPelaporName() {
        int i = 2 % 2;
        int i2 = f391a;
        int i3 = i2 + 31;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pelaporName;
        int i5 = i2 + 19;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 55 / 0;
        }
        return str;
    }

    public final String getPelaporBirthDate() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 107;
        f391a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pelaporBirthDate;
        int i5 = i2 + 31;
        f391a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMembershipIdentityNumber() {
        int i = 2 % 2;
        int i2 = f391a;
        int i3 = i2 + 65;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.membershipIdentityNumber;
        int i5 = i2 + 117;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getPelaporEmail() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 89;
        f391a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pelaporEmail;
        int i5 = i2 + 49;
        f391a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPelaporNumberPhone() {
        int i = 2 % 2;
        int i2 = f391a + 93;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.pelaporNumberPhone;
        int i4 = i3 + 25;
        f391a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return str;
    }

    public final String getScoreFace() {
        int i = 2 % 2;
        int i2 = f391a + 29;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return this.scoreFace;
        }
        throw null;
    }

    public final String getScoreFaceLiveness() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 87;
        f391a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.scoreFaceLiveness;
        int i5 = i2 + 37;
        f391a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPelaporSimilarityName() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 47;
        f391a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pelaporSimilarityName;
        int i5 = i2 + 113;
        f391a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public JpInstantConfirmationRequest(File file, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.file = file;
        this.benefitTypeCode = str;
        this.pelaporIdentityNumber = str2;
        this.pelaporName = str3;
        this.pelaporBirthDate = str4;
        this.membershipIdentityNumber = str5;
        this.pelaporEmail = str6;
        this.pelaporNumberPhone = str7;
        this.scoreFace = str8;
        this.scoreFaceLiveness = str9;
        this.pelaporSimilarityName = str10;
    }

    public final Map<String, RequestBody> getPartMap() {
        int i = 2 % 2;
        int i2 = f391a + 11;
        d = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            int i4 = d + 85;
            f391a = i4 % 128;
            if (i4 % 2 == 0) {
                mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("file");
                int i5 = 61 / 0;
            } else {
                mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("file");
            }
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.size()));
        Iterator<T> it = mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Intrinsics.checkNotNullParameter(value, "");
            linkedHashMap.put(key, RequestBody.INSTANCE.create((String) value, MediaType.INSTANCE.parse("text/plain")));
            int i6 = f391a + 99;
            d = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = f391a + 15;
        d = i8 % 128;
        int i9 = i8 % 2;
        return linkedHashMap;
    }

    public final JpInstantConfirmationRequest copy(File p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10) throws Throwable {
        int length;
        String str;
        int i = 2 % 2;
        int i2 = f391a + 103;
        d = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46399 - TextUtils.indexOf((CharSequence) "", '0', 0)), 40 - (ViewConfiguration.getLongPressTimeout() >> 16), 19 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{64002, 4423, 44772, 19632}, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionType(0L), new char[]{32589, 38949, 31932, 41135, 22927, 61753, 20903, 5872, 2232, 5110, 30115, 20570, 850, 41966, 28336, 26952, 64917, 24033, 16179, 52525, 21351, 25603}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{2610, 14026, 16098, 12344}, (char) (14399 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (-499725814) - View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{52106, 43221, 10013, 55374, 14230, 19884, 38439, 20686, 28933, 35111, 57135, 54801, 49841, 37239, 41324}, objArr2);
        long j = -375;
        long j2 = (j * 38373998125985172L) + (j * 2058883176615973815L);
        long j3 = 376;
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long jIdentityHashCode = System.identityHashCode(this);
        long j4 = -1;
        long j5 = j4 ^ 38373998125985172L;
        long j6 = 2061206034629345207L ^ j4;
        long j7 = j2 + ((jIdentityHashCode | ((j5 | (j4 ^ 2058883176615973815L)) ^ j4) | j6) * j3) + (((long) (-376)) * ((((jIdentityHashCode ^ j4) | 38373998125985172L) ^ j4) | j6)) + (j3 * ((j4 ^ (j5 | jIdentityHashCode)) | 2058883176615973815L));
        try {
            for (int i5 = 0; i5 != 10; i5++) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - View.getDefaultSize(0, 0)), 59 - KeyEvent.normalizeMetaState(0), 18 - Color.green(0), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                long j8 = jLongValue;
                int i7 = 0;
                while (true) {
                    int i8 = 0;
                    while (i8 != 8) {
                        int i9 = f391a + 45;
                        d = i9 % 128;
                        if (i9 % 2 != 0) {
                            i6 = (((((int) (j8 >>> i8)) & 7328) << (i6 * 8)) / (i6 * 15)) << i6;
                            i8 += 83;
                        } else {
                            int i10 = (((((int) (j8 >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                            i8++;
                            i6 = i10;
                        }
                    }
                    if (i7 != 0) {
                        break;
                    }
                    i7++;
                    int i11 = d + 9;
                    f391a = i11 % 128;
                    int i12 = i11 % 2;
                    j8 = j7;
                }
                if (i6 == i4) {
                    str = "";
                    Intrinsics.checkNotNullParameter(p3, str);
                    Intrinsics.checkNotNullParameter(p4, str);
                    Intrinsics.checkNotNullParameter(p5, str);
                    Intrinsics.checkNotNullParameter(p6, str);
                    Intrinsics.checkNotNullParameter(p7, str);
                    Intrinsics.checkNotNullParameter(p8, str);
                    Intrinsics.checkNotNullParameter(p9, str);
                    Intrinsics.checkNotNullParameter(p10, str);
                    return new JpInstantConfirmationRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
                }
                jLongValue -= 1024;
            }
            Object[] objArr3 = {437681316};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                str = "";
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46086 - AndroidCharacter.getMirror('0')), 1133 - TextUtils.lastIndexOf(str, '0', 0), Drawable.resolveOpacity(0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            } else {
                str = "";
            }
            Object[] objArr4 = {Integer.valueOf(length), 0, -347007806, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr3), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cBlue = (char) Color.blue(0);
                int iLastIndexOf = 1030 - TextUtils.lastIndexOf(str, '0', 0, 0);
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 15;
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr5 = new Object[1];
                e(b2, b3, b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cBlue, iLastIndexOf, touchSlop, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.getOffsetBefore(str, 0) + 45993), 1117 - TextUtils.indexOf(str, str, 0, 0), 16 - TextUtils.indexOf((CharSequence) str, '0')), Boolean.TYPE});
            }
            Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4);
            if (((int[]) objArr6[3])[0] != ((int[]) objArr6[1])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr6[0];
                if (strArr != null) {
                    for (String str2 : strArr) {
                        arrayList.add(str2);
                    }
                }
                throw null;
            }
            Intrinsics.checkNotNullParameter(p3, str);
            Intrinsics.checkNotNullParameter(p4, str);
            Intrinsics.checkNotNullParameter(p5, str);
            Intrinsics.checkNotNullParameter(p6, str);
            Intrinsics.checkNotNullParameter(p7, str);
            Intrinsics.checkNotNullParameter(p8, str);
            Intrinsics.checkNotNullParameter(p9, str);
            Intrinsics.checkNotNullParameter(p10, str);
            return new JpInstantConfirmationRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        if (p1 != null) {
            length = p1.length();
            int i13 = f391a + 31;
            d = i13 % 128;
            int i14 = i13 % 2;
        } else {
            length = 0;
        }
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        int i4 = $11 + 13;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i6 = $10 + 81;
            $11 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-16768888) - Color.rgb(0, 0, 0)), Color.alpha(0) + 1235, Color.green(0) + 35, -653973969, false, $$e(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                    int iMyPid = (Process.myPid() >> 22) + 2764;
                    int i8 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14;
                    byte b4 = $$c[2];
                    byte b5 = (byte) (b4 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iMyPid, i8, 1504416861, false, $$e(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43324 - ExpandableListView.getPackedPositionChild(0L)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 252, 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cLastIndexOf = (char) (65199 - TextUtils.lastIndexOf("", '0', 0, 0));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2892;
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 17;
                    byte b6 = (byte) ($$d & 7);
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, iLastIndexOf, iIndexOf, 2012627446, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
        int i9 = $11 + 45;
        $10 = i9 % 128;
        int i10 = i9 % 2;
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ JpInstantConfirmationRequest copy$default(JpInstantConfirmationRequest jpInstantConfirmationRequest, File file, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        String str11;
        String str12;
        String str13;
        String str14;
        int i2 = 2 % 2;
        File file2 = (i & 1) != 0 ? jpInstantConfirmationRequest.file : file;
        String str15 = (i & 2) != 0 ? jpInstantConfirmationRequest.benefitTypeCode : str;
        String str16 = (i & 4) != 0 ? jpInstantConfirmationRequest.pelaporIdentityNumber : str2;
        if ((i & 8) != 0) {
            str11 = jpInstantConfirmationRequest.pelaporName;
            int i3 = d + 125;
            f391a = i3 % 128;
            int i4 = i3 % 2;
        } else {
            str11 = str3;
        }
        String str17 = (i & 16) != 0 ? jpInstantConfirmationRequest.pelaporBirthDate : str4;
        String str18 = (i & 32) != 0 ? jpInstantConfirmationRequest.membershipIdentityNumber : str5;
        String str19 = (i & 64) != 0 ? jpInstantConfirmationRequest.pelaporEmail : str6;
        if ((i & 128) != 0) {
            int i5 = d + 95;
            f391a = i5 % 128;
            int i6 = i5 % 2;
            str12 = jpInstantConfirmationRequest.pelaporNumberPhone;
        } else {
            str12 = str7;
        }
        String str20 = (i & 256) != 0 ? jpInstantConfirmationRequest.scoreFace : str8;
        if ((i & 512) != 0) {
            int i7 = f391a;
            int i8 = i7 + 95;
            d = i8 % 128;
            int i9 = i8 % 2;
            str13 = jpInstantConfirmationRequest.scoreFaceLiveness;
            int i10 = i7 + 11;
            d = i10 % 128;
            int i11 = i10 % 2;
        } else {
            str13 = str9;
        }
        if ((i & 1024) != 0) {
            int i12 = f391a + 101;
            d = i12 % 128;
            int i13 = i12 % 2;
            str14 = jpInstantConfirmationRequest.pelaporSimilarityName;
        } else {
            str14 = str10;
        }
        return jpInstantConfirmationRequest.copy(file2, str15, str16, str11, str17, str18, str19, str12, str20, str13, str14);
    }

    public final File component1() {
        int i = 2 % 2;
        int i2 = f391a;
        int i3 = i2 + 121;
        d = i3 % 128;
        int i4 = i3 % 2;
        File file = this.file;
        int i5 = i2 + 55;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
        return file;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = d + 45;
        int i3 = i2 % 128;
        f391a = i3;
        int i4 = i2 % 2;
        String str = this.scoreFaceLiveness;
        int i5 = i3 + 123;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = f391a;
        int i3 = i2 + 71;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pelaporSimilarityName;
        int i5 = i2 + 77;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = f391a;
        int i3 = i2 + 71;
        d = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.benefitTypeCode;
        int i4 = i2 + 11;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 15;
        f391a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pelaporIdentityNumber;
        int i5 = i2 + 1;
        f391a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = d + 41;
        f391a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.pelaporName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = f391a;
        int i3 = i2 + 41;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pelaporBirthDate;
        int i5 = i2 + 21;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = d + 87;
        f391a = i2 % 128;
        int i3 = i2 % 2;
        String str = this.membershipIdentityNumber;
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = d + 115;
        int i3 = i2 % 128;
        f391a = i3;
        int i4 = i2 % 2;
        String str = this.pelaporEmail;
        int i5 = i3 + 87;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = d + 107;
        f391a = i2 % 128;
        int i3 = i2 % 2;
        String str = this.pelaporNumberPhone;
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = f391a + 65;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.scoreFace;
        int i5 = i3 + 111;
        f391a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.bpjstku.data.jp.model.request.JpInstantConfirmationRequest) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (com.bpjstku.data.jp.model.request.JpInstantConfirmationRequest) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.file, r6.file) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.benefitTypeCode, r6.benefitTypeCode) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        r6 = com.bpjstku.data.jp.model.request.JpInstantConfirmationRequest.f391a + 7;
        com.bpjstku.data.jp.model.request.JpInstantConfirmationRequest.d = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if ((r6 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.pelaporIdentityNumber, r6.pelaporIdentityNumber) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.pelaporName, r6.pelaporName) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        r6 = com.bpjstku.data.jp.model.request.JpInstantConfirmationRequest.d + 67;
        com.bpjstku.data.jp.model.request.JpInstantConfirmationRequest.f391a = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.pelaporBirthDate, r6.pelaporBirthDate) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.membershipIdentityNumber, r6.membershipIdentityNumber) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        r6 = com.bpjstku.data.jp.model.request.JpInstantConfirmationRequest.f391a + 39;
        com.bpjstku.data.jp.model.request.JpInstantConfirmationRequest.d = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.pelaporEmail, r6.pelaporEmail) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
    
        r6 = com.bpjstku.data.jp.model.request.JpInstantConfirmationRequest.d + 35;
        com.bpjstku.data.jp.model.request.JpInstantConfirmationRequest.f391a = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0094, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.pelaporNumberPhone, r6.pelaporNumberPhone) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        r6 = com.bpjstku.data.jp.model.request.JpInstantConfirmationRequest.d + 119;
        com.bpjstku.data.jp.model.request.JpInstantConfirmationRequest.f391a = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.scoreFace, r6.scoreFace) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bc, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.scoreFaceLiveness, r6.scoreFaceLiveness) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.pelaporSimilarityName, r6.pelaporSimilarityName) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c9, code lost:
    
        r6 = com.bpjstku.data.jp.model.request.JpInstantConfirmationRequest.f391a + 17;
        com.bpjstku.data.jp.model.request.JpInstantConfirmationRequest.d = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d2, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d3, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jp.model.request.JpInstantConfirmationRequest.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023 A[PHI: r2
  0x0023: PHI (r2v4 java.io.File) = (r2v2 java.io.File), (r2v5 java.io.File) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public final int hashCode() {
        File file;
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 91;
        f391a = i3 % 128;
        int iHashCode = 0;
        if (i3 % 2 == 0) {
            file = this.file;
            int i4 = 32 / 0;
            if (file == null) {
                int i5 = i2 + 1;
                f391a = i5 % 128;
                int i6 = i5 % 2;
            } else {
                iHashCode = file.hashCode();
            }
        } else {
            file = this.file;
            if (file == null) {
                int i7 = i2 + 1;
                f391a = i7 % 128;
                int i8 = i7 % 2;
            } else {
                iHashCode = file.hashCode();
            }
        }
        return (((((((((((((((((((iHashCode * 31) + this.benefitTypeCode.hashCode()) * 31) + this.pelaporIdentityNumber.hashCode()) * 31) + this.pelaporName.hashCode()) * 31) + this.pelaporBirthDate.hashCode()) * 31) + this.membershipIdentityNumber.hashCode()) * 31) + this.pelaporEmail.hashCode()) * 31) + this.pelaporNumberPhone.hashCode()) * 31) + this.scoreFace.hashCode()) * 31) + this.scoreFaceLiveness.hashCode()) * 31) + this.pelaporSimilarityName.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        File file = this.file;
        String str = this.benefitTypeCode;
        String str2 = this.pelaporIdentityNumber;
        String str3 = this.pelaporName;
        String str4 = this.pelaporBirthDate;
        String str5 = this.membershipIdentityNumber;
        String str6 = this.pelaporEmail;
        String str7 = this.pelaporNumberPhone;
        String str8 = this.scoreFace;
        String str9 = this.scoreFaceLiveness;
        String str10 = this.pelaporSimilarityName;
        StringBuilder sb = new StringBuilder("JpInstantConfirmationRequest(file=");
        sb.append(file);
        sb.append(", benefitTypeCode=");
        sb.append(str);
        sb.append(", pelaporIdentityNumber=");
        sb.append(str2);
        sb.append(", pelaporName=");
        sb.append(str3);
        sb.append(", pelaporBirthDate=");
        sb.append(str4);
        sb.append(", membershipIdentityNumber=");
        sb.append(str5);
        sb.append(", pelaporEmail=");
        sb.append(str6);
        sb.append(", pelaporNumberPhone=");
        sb.append(str7);
        sb.append(", scoreFace=");
        sb.append(str8);
        sb.append(", scoreFaceLiveness=");
        sb.append(str9);
        sb.append(", pelaporSimilarityName=");
        sb.append(str10);
        sb.append(")");
        String string = sb.toString();
        int i2 = f391a + 5;
        d = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -6377398940819159759L;
        b = -1377807759;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 34097;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r7, byte r8, int r9) {
        /*
            int r7 = r7 + 102
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r0 = com.bpjstku.data.jp.model.request.JpInstantConfirmationRequest.$$c
            int r9 = r9 * 3
            int r9 = r9 + 1
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r8
            r3 = r9
            r5 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L28:
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jp.model.request.JpInstantConfirmationRequest.$$e(byte, byte, int):java.lang.String");
    }
}
