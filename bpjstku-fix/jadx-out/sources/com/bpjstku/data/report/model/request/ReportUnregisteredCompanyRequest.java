package com.bpjstku.data.report.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.autofill.HintConstants;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import com.google.mlkit.common.MlKitException;
import defpackage.createCameraSelectorById;
import defpackage.deInitSession;
import defpackage.initSession;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\tHÇ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JL\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b#\u0010\u0012R\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0012R\u001a\u0010'\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0014R\u001a\u0010*\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u0014R\u001a\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010\u0012R\u001a\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u0010\u0012R\u001a\u00100\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0019"}, d2 = {"Lcom/bpjstku/data/report/model/request/ReportUnregisteredCompanyRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "", "p1", "p2", "p3", "p4", "Ljava/io/File;", "p5", "<init>", "(Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/io/File;)V", "", "Lokhttp3/RequestBody;", "getPartMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "()D", "component3", "component4", "component5", "component6", "()Ljava/io/File;", "copy", "(Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/io/File;)Lcom/bpjstku/data/report/model/request/ReportUnregisteredCompanyRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "companyName", "Ljava/lang/String;", "getCompanyName", "latitude", "D", "getLatitude", "longitude", "getLongitude", "companyAddress", "getCompanyAddress", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "getPhoneNumber", "imageFile", "Ljava/io/File;", "getImageFile"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ReportUnregisteredCompanyRequest extends BaseRequest {
    public static final int $stable = 8;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @SerializedName("alamatPerusahaan")
    private final String companyAddress;

    @SerializedName("namaPerusahaan")
    private final String companyName;
    private final transient File imageFile;

    @SerializedName("latitude")
    private final double latitude;

    @SerializedName("longitude")
    private final double longitude;

    @SerializedName("noHp")
    private final String phoneNumber;
    private static final byte[] $$c = {43, 23, 22, -14};
    private static final int $$f = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {109, 48, -62, 38, 9, 58, -68, 17, 9, 7, 55, -58, 7, -9, 21, -5, 13, -10, 4, 73, -32, 50, -74, 21, -18, -29, 16, -7, 15, -2, 5, 34, -13, -20, 16, 12, -5, -2, 50, -40, 21, -2, -2, 12, -5, -2, 5, 7, 15, 6, -2, 12, -7, 7, -1, 6, 7, -1, 13, 5, -14, 17, 8, -14, 46, -30, 15, 3, -3, 12, 3, 3, 9, -16, 13, -4, 70};
    private static final int $$e = 146;
    private static final byte[] $$a = {6, -86, -9, -124, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 249;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int d = 1;
    private static int b = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.data.report.model.request.ReportUnregisteredCompanyRequest.$$a
            int r9 = r9 * 52
            int r9 = r9 + 4
            int r7 = r7 + 84
            int r8 = r8 * 52
            int r8 = 53 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L2d
        L14:
            r3 = r2
        L15:
            r6 = r9
            r9 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r9 = r9 + 1
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.report.model.request.ReportUnregisteredCompanyRequest.a(byte, short, byte, java.lang.Object[]):void");
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
    private static void e(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 21
            int r8 = 105 - r8
            int r6 = r6 * 31
            int r6 = 53 - r6
            byte[] r0 = com.bpjstku.data.report.model.request.ReportUnregisteredCompanyRequest.$$d
            int r7 = r7 * 21
            int r7 = 25 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L29
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r7]
        L29:
            int r3 = -r3
            int r7 = r7 + 1
            int r8 = r8 + r3
            int r8 = r8 + 4
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.report.model.request.ReportUnregisteredCompanyRequest.e(short, int, byte, java.lang.Object[]):void");
    }

    public final String getCompanyName() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        d = i2 % 128;
        int i3 = i2 % 2;
        String str = this.companyName;
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        return str;
    }

    public final double getLatitude() {
        int i = 2 % 2;
        int i2 = d + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.latitude;
        }
        int i3 = 92 / 0;
        return this.latitude;
    }

    public final double getLongitude() {
        double d2;
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            d2 = this.longitude;
            int i4 = 61 / 0;
        } else {
            d2 = this.longitude;
        }
        int i5 = i2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return d2;
        }
        throw null;
    }

    public final String getCompanyAddress() {
        int i = 2 % 2;
        int i2 = d + 83;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.companyAddress;
        int i5 = i3 + 27;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPhoneNumber() {
        int i = 2 % 2;
        int i2 = d + 85;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.phoneNumber;
        int i5 = i3 + 103;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final File getImageFile() {
        int i = 2 % 2;
        int i2 = d + 19;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        File file = this.imageFile;
        int i5 = i3 + 47;
        d = i5 % 128;
        int i6 = i5 % 2;
        return file;
    }

    public ReportUnregisteredCompanyRequest(String str, double d2, double d3, String str2, String str3, File file) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(file, "");
        this.companyName = str;
        this.latitude = d2;
        this.longitude = d3;
        this.companyAddress = str2;
        this.phoneNumber = str3;
        this.imageFile = file;
    }

    public final Map<String, RequestBody> getPartMap() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        d = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.size()));
        Iterator<T> it = mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.entrySet().iterator();
        while (it.hasNext()) {
            int i4 = d + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            String string = entry.getValue().toString();
            Intrinsics.checkNotNullParameter(string, "");
            linkedHashMap.put(key, RequestBody.INSTANCE.create(string, MediaType.INSTANCE.parse("text/plain")));
        }
        return linkedHashMap;
    }

    public final double component3() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        double d2 = this.longitude;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
            int size = View.MeasureSpec.getSize(0) + 876;
            int i2 = 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a((byte) 14, bArr[5], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, size, i2, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{22, 11, 1, 14, '\t', 2, '\b', ' ', '\t', 7, 27, 28, '\n', 7, 17, '\b', 31, 20, 20, 6, '\f', 17}, (byte) (Process.getGidForName("") + 50), TextUtils.getOffsetAfter("", 0) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{6, 23, 22, 29, 7, 6, 3, 2, 17, 29, 20, '\f', 2, '!', 13854}, (byte) (31 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int iArgb = Color.argb(0, 0, 0, 0) + 876;
            int i3 = 10 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr5 = new Object[1];
            a(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop, iArgb, i3, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = d + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                int iLastIndexOf = 875 - TextUtils.lastIndexOf("", '0');
                int iMyTid = (Process.myTid() >> 22) + 10;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[10];
                byte b5 = bArr2[5];
                Object[] objArr6 = new Object[1];
                a(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iLastIndexOf, iMyTid, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i6 = ~(249463199 | startUptimeMillis);
            int i7 = (-385184123) + (((-251653088) | i6) * (-814)) + ((i6 | (~((~startUptimeMillis) | 209152970)) | 206963082) * 407) + (((~(startUptimeMillis | (-209152971))) | (~((-249463200) | startUptimeMillis)) | 206963082) * 407) + 961517659;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{22, 11, 1, 14, '\t', 2, '\b', ' ', 22, 29, 29, 27, 29, '\r', 15, 2, 5, 4, 15, '\b', '\r', 1, 17, 7, 20, 5}, (byte) (MotionEvent.axisFromString("") + 111), 26 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{16, 23, 13865, 13865, 6, 11, '\r', 26, 13867, 13867, 21, 0, 23, 29, 15, 2, '\t', 11}, (byte) (TextUtils.getOffsetAfter("", 0) + 65), TextUtils.lastIndexOf("", '0') + 19, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{29, 18, 5, 22, 24, 20, 22, 11, 14, 27, '!', 15, '\b', '\f', '\b', '#'}, (byte) (TextUtils.lastIndexOf("", '0') + 104), 16 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{4, 3, 6, 11, 15, 2, 15, '\b', '#', 21, 7, 30, 20, 7, 5, '\b'}, (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16), TextUtils.lastIndexOf("", '0', 0, 0) + 17, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i10 = d + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 961517659};
                byte[] bArr3 = $$d;
                byte b6 = (byte) (-bArr3[54]);
                byte b7 = b6;
                Object[] objArr13 = new Object[1];
                e(b6, b7, (byte) (b7 - 1), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = bArr3[54];
                byte b9 = (byte) (b8 + 1);
                Object[] objArr14 = new Object[1];
                e(b9, b9, (byte) (-b8), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
                    d = i12 % 128;
                    int i13 = i12 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 876;
                        int iLastIndexOf2 = 9 - TextUtils.lastIndexOf("", '0', 0);
                        byte[] bArr4 = $$a;
                        byte b10 = bArr4[10];
                        byte b11 = bArr4[5];
                        Object[] objArr16 = new Object[1];
                        a(b10, b11, b11, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(tapTimeout, scrollBarFadeDuration, iLastIndexOf2, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{22, 11, 1, 14, '\t', 2, '\b', ' ', '\t', 7, 27, 28, '\n', 7, 17, '\b', 31, 20, 20, 6, '\f', 17}, (byte) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 49), 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{6, 23, 22, 29, 7, 6, 3, 2, 17, 29, 20, '\f', 2, '!', 13854}, (byte) (31 - ((Process.getThreadPriority(0) + 20) >> 6)), 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cAlpha = (char) Color.alpha(0);
                            int iAlpha = 876 - Color.alpha(0);
                            int i14 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9;
                            byte b12 = $$a[7];
                            byte b13 = b12;
                            Object[] objArr19 = new Object[1];
                            a(b12, b13, b13, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha, iAlpha, i14, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 876;
                            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 10;
                            byte[] bArr5 = $$a;
                            Object[] objArr20 = new Object[1];
                            a((byte) 14, bArr5[5], bArr5[7], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionChild, maximumFlingVelocity, windowTouchSlop, 252381699, false, (String) objArr20[0], null);
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
        int i15 = ((int[]) objArr[2])[0];
        int i16 = ((int[]) objArr[0])[0];
        if (i16 != i15) {
            Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
            int i17 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i18 = ~((int) SystemClock.elapsedRealtime());
            int i19 = i17 + (-942559356) + (((~((-111284292) | i18)) | 151594520) * (-828)) + ((i18 | (-111284292)) * (-828)) + 1949079732;
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr21[1])[0] = i21 ^ (i21 << 5);
            return d2;
        }
        int i22 = ((int[]) objArr[1])[0];
        Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iNextInt = new Random().nextInt();
        int i23 = ~(424517220 | iNextInt);
        int i24 = ~iNextInt;
        int i25 = i23 | (~(464827449 | i24));
        int i26 = ~((-424517221) | i24);
        int i27 = i22 + 699961180 + ((i25 | i26) * (-516)) + (((~(iNextInt | (-45096986))) | (~((-419730465) | i24))) * 516) + ((419730464 | i26) * 516);
        int i28 = (i27 << 13) ^ i27;
        int i29 = i28 ^ (i28 >>> 17);
        ((int[]) objArr22[1])[0] = i29 ^ (i29 << 5);
        return d2;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x018f  */
    /* JADX WARN: Code duplicated, block: B:47:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:50:0x01f1 A[Catch: all -> 0x03b2, TryCatch #0 {all -> 0x03b2, blocks: (B:13:0x0042, B:15:0x0050, B:16:0x0083, B:19:0x0096, B:21:0x00a7, B:22:0x00db, B:27:0x00f6, B:29:0x0109, B:30:0x0138, B:48:0x01a7, B:50:0x01f1, B:51:0x0267, B:55:0x027c, B:57:0x02b8, B:58:0x0321), top: B:75:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x027a  */
    /* JADX WARN: Code duplicated, block: B:57:0x02b8 A[Catch: all -> 0x03b2, TryCatch #0 {all -> 0x03b2, blocks: (B:13:0x0042, B:15:0x0050, B:16:0x0083, B:19:0x0096, B:21:0x00a7, B:22:0x00db, B:27:0x00f6, B:29:0x0109, B:30:0x0138, B:48:0x01a7, B:50:0x01f1, B:51:0x0267, B:55:0x027c, B:57:0x02b8, B:58:0x0321), top: B:75:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0342  */
    /* JADX WARN: Code duplicated, block: B:62:0x0349  */
    /* JADX WARN: Code duplicated, block: B:63:0x0371  */
    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int length;
        char[] cArr2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i6 = 1770390596;
        float f = 0.0f;
        Object obj2 = null;
        int i7 = -1;
        if (cArr3 != null) {
            int i8 = $11 + 103;
            int i9 = i8 % 128;
            $10 = i9;
            if (i8 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            int i10 = i9 + 27;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (i3 < length) {
                int i12 = $10 + 49;
                $11 = i12 % 128;
                if (i12 % i4 == 0) {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b3 = (byte) i7;
                            byte b4 = (byte) (b3 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 2267, TextUtils.indexOf("", "") + 33, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        cArr2[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                        i3 /= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr3[i3])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), 2267 - (ViewConfiguration.getLongPressTimeout() >> 16), 33 - (ViewConfiguration.getLongPressTimeout() >> 16), -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                    }
                    cArr2[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
                    i3++;
                }
                i4 = 2;
                i6 = 1770390596;
                f = 0.0f;
                i7 = -1;
            }
            cArr3 = cArr2;
        }
        Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            byte b7 = (byte) (-1);
            byte b8 = (byte) (b7 + 1);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf((CharSequence) "", '0') + 2268, (ViewConfiguration.getFadingEdgeLength() >> 16) + 33, -1927765101, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr5)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i13 = $11 + 123;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        obj = obj2;
                    } else {
                        objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b9 = (byte) (-1);
                            byte b10 = (byte) (-b9);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49267 - Color.blue(0)), 3261 - Color.green(0), 30 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -127612708, false, $$g(b9, b10, (byte) (b10 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b11 = (byte) (-1);
                                byte b12 = (byte) (b11 + 4);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 22879), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 594, 17 - KeyEvent.keyCodeFromString(""), 1570859318, false, $$g(b11, b12, (byte) (b12 - 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                            int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i14];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i15];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i16];
                            } else {
                                int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i17];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i18];
                            }
                        }
                    }
                } else {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        obj = obj2;
                    } else {
                        objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b13 = (byte) (-1);
                            byte b14 = (byte) (-b13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49267 - Color.blue(0)), 3261 - Color.green(0), 30 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -127612708, false, $$g(b13, b14, (byte) (b14 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            Object[] objArr7 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b15 = (byte) (-1);
                                byte b16 = (byte) (b15 + 4);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 22879), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 594, 17 - KeyEvent.keyCodeFromString(""), 1570859318, false, $$g(b15, b16, (byte) (b16 - 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr7)).intValue();
                            int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue2];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i19];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i110 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i111 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i110];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i111];
                            } else {
                                int i112 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i113 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i112];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i113];
                            }
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        int i20 = $11 + 75;
        $10 = i20 % 128;
        int i21 = i20 % 2;
        for (int i22 = 0; i22 < i; i22++) {
            cArr4[i22] = (char) (cArr4[i22] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = b + 71;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ ReportUnregisteredCompanyRequest copy$default(ReportUnregisteredCompanyRequest reportUnregisteredCompanyRequest, String str, double d2, double d3, String str2, String str3, File file, int i, Object obj) {
        String str4;
        String str5;
        String str6;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        int i4 = i3 % 128;
        d = i4;
        Object obj2 = null;
        if (i3 % 2 != 0 ? (i & 1) == 0 : (i & 1) == 0) {
            str4 = str;
        } else {
            int i5 = i4 + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 != 0) {
                String str7 = reportUnregisteredCompanyRequest.companyName;
                obj2.hashCode();
                throw null;
            }
            str4 = reportUnregisteredCompanyRequest.companyName;
        }
        double d4 = (i & 2) != 0 ? reportUnregisteredCompanyRequest.latitude : d2;
        double d5 = (i & 4) != 0 ? reportUnregisteredCompanyRequest.longitude : d3;
        if ((i & 8) != 0) {
            int i6 = i4 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            if (i6 % 2 != 0) {
                str5 = reportUnregisteredCompanyRequest.companyAddress;
                int i7 = 28 / 0;
            } else {
                str5 = reportUnregisteredCompanyRequest.companyAddress;
            }
        } else {
            str5 = str2;
        }
        if ((i & 16) != 0) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
            d = i8 % 128;
            if (i8 % 2 == 0) {
                String str8 = reportUnregisteredCompanyRequest.phoneNumber;
                throw null;
            }
            str6 = reportUnregisteredCompanyRequest.phoneNumber;
        } else {
            str6 = str3;
        }
        return reportUnregisteredCompanyRequest.copy(str4, d4, d5, str5, str6, (i & 32) != 0 ? reportUnregisteredCompanyRequest.imageFile : file);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            str = this.companyName;
            int i4 = 34 / 0;
        } else {
            str = this.companyName;
        }
        int i5 = i3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return str;
    }

    public final double component2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        double d2 = this.latitude;
        int i5 = i3 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 99 / 0;
        }
        return d2;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.companyAddress;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 23;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.phoneNumber;
        int i5 = i2 + 49;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final File component6() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        File file = this.imageFile;
        int i5 = i2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return file;
    }

    public final ReportUnregisteredCompanyRequest copy(String p0, double p1, double p2, String p3, String p4, File p5) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        ReportUnregisteredCompanyRequest reportUnregisteredCompanyRequest = new ReportUnregisteredCompanyRequest(p0, p1, p2, p3, p4, p5);
        int i2 = d + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 75 / 0;
        }
        return reportUnregisteredCompanyRequest;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ReportUnregisteredCompanyRequest)) {
            return false;
        }
        ReportUnregisteredCompanyRequest reportUnregisteredCompanyRequest = (ReportUnregisteredCompanyRequest) p0;
        if (!Intrinsics.areEqual(this.companyName, reportUnregisteredCompanyRequest.companyName) || Double.compare(this.latitude, reportUnregisteredCompanyRequest.latitude) != 0 || Double.compare(this.longitude, reportUnregisteredCompanyRequest.longitude) != 0) {
            return false;
        }
        if (!Intrinsics.areEqual(this.companyAddress, reportUnregisteredCompanyRequest.companyAddress)) {
            int i2 = d + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.phoneNumber, reportUnregisteredCompanyRequest.phoneNumber)) {
            return Intrinsics.areEqual(this.imageFile, reportUnregisteredCompanyRequest.imageFile);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
        d = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = d + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.companyName.hashCode() * 31) + Double.hashCode(this.latitude)) * 31) + Double.hashCode(this.longitude)) * 31) + this.companyAddress.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.imageFile.hashCode();
        int i4 = d + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.companyName;
        double d2 = this.latitude;
        double d3 = this.longitude;
        String str2 = this.companyAddress;
        String str3 = this.phoneNumber;
        File file = this.imageFile;
        StringBuilder sb = new StringBuilder("ReportUnregisteredCompanyRequest(companyName=");
        sb.append(str);
        sb.append(", latitude=");
        sb.append(d2);
        sb.append(", longitude=");
        sb.append(d3);
        sb.append(", companyAddress=");
        sb.append(str2);
        sb.append(", phoneNumber=");
        sb.append(str3);
        sb.append(", imageFile=");
        sb.append(file);
        sb.append(")");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
        d = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{57187, 60073, 60063, 60050, 60045, 57192, 60040, 60079, 60052, 60034, 60053, 60062, 57184, 60041, 60047, 60060, 60048, 60056, 60055, 60088, 57189, 57191, 60046, 60058, 60049, 60090, 60117, 60072, 60043, 57193, 57186, 60051, 60054, 60083, 57190, 57188};
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 57191;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, short r7, byte r8) {
        /*
            byte[] r0 = com.bpjstku.data.report.model.request.ReportUnregisteredCompanyRequest.$$c
            int r7 = r7 + 113
            int r6 = r6 + 4
            int r8 = r8 * 2
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L29:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.report.model.request.ReportUnregisteredCompanyRequest.$$g(byte, short, byte):java.lang.String");
    }
}
