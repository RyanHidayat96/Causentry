package com.bpjstku.data.devicebinding.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import defpackage.createCameraSelectorById;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.io.File;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001dJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001dJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001dJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001dJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001dJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001dJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001dJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001dJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u001dJè\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u0002032\b\u0010\u0003\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00107\u001a\u000206HÖ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b9\u0010\u001dR\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\u001dR\u001c\u0010=\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010;\u001a\u0004\b>\u0010\u001dR\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u0010\u001dR\u001c\u0010A\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010;\u001a\u0004\bB\u0010\u001dR\u001c\u0010C\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010;\u001a\u0004\bD\u0010\u001dR\u001c\u0010E\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010;\u001a\u0004\bF\u0010\u001dR\u001c\u0010G\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010$R\u001c\u0010J\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010H\u001a\u0004\bK\u0010$R\u001c\u0010L\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010H\u001a\u0004\bM\u0010$R\u001c\u0010N\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010;\u001a\u0004\bO\u0010\u001dR\u001c\u0010P\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010;\u001a\u0004\bQ\u0010\u001dR\u001c\u0010R\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010;\u001a\u0004\bS\u0010\u001dR\u001c\u0010T\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010;\u001a\u0004\bU\u0010\u001dR\u001c\u0010V\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010;\u001a\u0004\bW\u0010\u001dR\u001c\u0010X\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010;\u001a\u0004\bY\u0010\u001dR\u001c\u0010Z\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010;\u001a\u0004\b[\u0010\u001dR\u001c\u0010\\\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010;\u001a\u0004\b]\u0010\u001dR\u001c\u0010^\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010;\u001a\u0004\b_\u0010\u001d"}, d2 = {"Lcom/bpjstku/data/devicebinding/model/request/LivenessEndRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "Ljava/io/File;", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "Lokhttp3/RequestBody;", "getPartMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/io/File;", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/devicebinding/model/request/LivenessEndRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "flData", "Ljava/lang/String;", "getFlData", "brand", "getBrand", "deviceId", "getDeviceId", "model", "getModel", "sdk", "getSdk", "manufacture", "getManufacture", "selfiePhoto1", "Ljava/io/File;", "getSelfiePhoto1", "selfiePhoto2", "getSelfiePhoto2", "selfiePhoto3", "getSelfiePhoto3", "nik", "getNik", "email", "getEmail", "handphone", "getHandphone", "transactionIdSdk", "getTransactionIdSdk", "scoreLiveness", "getScoreLiveness", "scoreManipulation", "getScoreManipulation", "latitude", "getLatitude", "longitude", "getLongitude", PlaceTypes.LOCALITY, "getLocality"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LivenessEndRequest extends BaseRequest {
    public static final int $stable = 8;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char[] b;
    private static int g;

    @SerializedName("brand")
    private final String brand;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("email")
    private final String email;

    @SerializedName("flData")
    private final String flData;

    @SerializedName("handphone")
    private final String handphone;

    @SerializedName("latitude")
    private final String latitude;

    @SerializedName(PlaceTypes.LOCALITY)
    private final String locality;

    @SerializedName("longitude")
    private final String longitude;

    @SerializedName("manufacture")
    private final String manufacture;

    @SerializedName("model")
    private final String model;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("scoreLiveness")
    private final String scoreLiveness;

    @SerializedName("scoreManipulation")
    private final String scoreManipulation;

    @SerializedName("sdk")
    private final String sdk;

    @SerializedName("selfiePhoto1")
    private final File selfiePhoto1;

    @SerializedName("selfiePhoto2")
    private final File selfiePhoto2;

    @SerializedName("selfiePhoto3")
    private final File selfiePhoto3;

    @SerializedName("transactionIdSdk")
    private final String transactionIdSdk;
    private static final byte[] $$c = {74, 60, 122, -26};
    private static final int $$f = 219;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {99, -43, -44, -62, -17, 6, -18, -1, 2, 1, 50, -73, -6, 1, -4, -3, -7, -6, 66, -76, 62, 2, -67, 4, -3, -9, 4, 47, -73, 10, -18, -4, 6, -10, -3, 60, -35, -28, -3, -9, 4, 26, -48, -3, -10, -2, -1, -1, -4, 3, -17, 43, -48, -2, -7, 11, -23, 76, -52, -34, 13, -17, -9, -1, -3, -7, -6, 45, -48, -3, -10, -2, -1, -1, -11, 46, -51, 3, 51, -3, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 63};
    private static final int $$e = 138;
    private static final byte[] $$a = {23, -73, 107, 5, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 156;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f385a = 0;
    private static int asBinder = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r7 = r7 + 4
            int r0 = 53 - r6
            byte[] r1 = com.bpjstku.data.devicebinding.model.request.LivenessEndRequest.$$a
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2f
        L17:
            r3 = r2
        L18:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2f:
            int r7 = r7 + 1
            int r8 = r8 + r4
            int r8 = r8 + (-10)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.devicebinding.model.request.LivenessEndRequest.c(int, short, int, java.lang.Object[]):void");
    }

    private static void e(int i, short s, int i2, Object[] objArr) {
        int i3 = (s * 76) + 4;
        int i4 = i2 * 24;
        byte[] bArr = $$d;
        int i5 = 97 - (i * 13);
        byte[] bArr2 = new byte[77 - i4];
        int i6 = 76 - i4;
        int i7 = -1;
        if (bArr == null) {
            int i8 = i6 + (-i3);
            i3++;
            i5 = i8 - 4;
            i7 = -1;
        }
        while (true) {
            int i9 = i7 + 1;
            bArr2[i9] = (byte) i5;
            if (i9 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i10 = i3;
            int i11 = i5 + (-bArr[i3]);
            i3 = i10 + 1;
            i5 = i11 - 4;
            i7 = i9;
        }
    }

    public final String getFlData() {
        int i = 2 % 2;
        int i2 = f385a;
        int i3 = i2 + 19;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.flData;
        int i5 = i2 + 35;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBrand() {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        f385a = i2 % 128;
        if (i2 % 2 == 0) {
            return this.brand;
        }
        throw null;
    }

    public final String getDeviceId() {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        f385a = i2 % 128;
        if (i2 % 2 == 0) {
            return this.deviceId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getModel() {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        int i3 = i2 % 128;
        f385a = i3;
        int i4 = i2 % 2;
        String str = this.model;
        int i5 = i3 + 59;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSdk() {
        int i = 2 % 2;
        int i2 = f385a + 59;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.sdk;
        int i5 = i3 + 87;
        f385a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getManufacture() {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        f385a = i2 % 128;
        int i3 = i2 % 2;
        String str = this.manufacture;
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
        return str;
    }

    public final File getSelfiePhoto1() {
        File file;
        int i = 2 % 2;
        int i2 = asBinder + 21;
        int i3 = i2 % 128;
        f385a = i3;
        if (i2 % 2 != 0) {
            file = this.selfiePhoto1;
            int i4 = 8 / 0;
        } else {
            file = this.selfiePhoto1;
        }
        int i5 = i3 + 33;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return file;
        }
        throw null;
    }

    public final File getSelfiePhoto2() {
        int i = 2 % 2;
        int i2 = f385a;
        int i3 = i2 + 9;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        File file = this.selfiePhoto2;
        int i4 = i2 + 33;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return file;
    }

    public final File getSelfiePhoto3() {
        File file;
        int i = 2 % 2;
        int i2 = f385a + 37;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            file = this.selfiePhoto3;
            int i4 = 67 / 0;
        } else {
            file = this.selfiePhoto3;
        }
        int i5 = i3 + 89;
        f385a = i5 % 128;
        int i6 = i5 % 2;
        return file;
    }

    public final String getNik() {
        int i = 2 % 2;
        int i2 = f385a + 49;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.nik;
        int i5 = i3 + 65;
        f385a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public LivenessEndRequest(String str, String str2, String str3, String str4, String str5, String str6, File file, File file2, File file3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.flData = str;
        this.brand = str2;
        this.deviceId = str3;
        this.model = str4;
        this.sdk = str5;
        this.manufacture = str6;
        this.selfiePhoto1 = file;
        this.selfiePhoto2 = file2;
        this.selfiePhoto3 = file3;
        this.nik = str7;
        this.email = str8;
        this.handphone = str9;
        this.transactionIdSdk = str10;
        this.scoreLiveness = str11;
        this.scoreManipulation = str12;
        this.latitude = str13;
        this.longitude = str14;
        this.locality = str15;
    }

    private static void d(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = b;
        if (cArr2 != null) {
            int i3 = $11 + 51;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2993, 17 - ExpandableListView.getPackedPositionGroup(0L), 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            char c = '0';
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 43326), (ViewConfiguration.getEdgeSlop() >> 16) + 253, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            int i6 = 1687675375;
            try {
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                    char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                        Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf("", c, 0, 0) + 33603), 3085 - ((Process.getThreadPriority(0) + 20) >> 6), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 26, -2146875848, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        c = '0';
                        i6 = 1687675375;
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (!TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                    char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i7 = $10 + 65;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - TextUtils.getOffsetAfter("", 0)), 3085 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), KeyEvent.getDeadChar(0, 0) + 26, -2146875848, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr6);
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
    }

    public final String getEmail() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16808749);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 922;
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 28;
            byte b2 = $$a[80];
            Object[] objArr2 = new Object[1];
            c((byte) 52, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, iIndexOf, packedPositionType, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(null, null, 127 - View.resolveSizeAndState(0, 0, 0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(null, null, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
            int iIndexOf2 = 920 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int i2 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27;
            byte[] bArr = $$a;
            byte b3 = bArr[80];
            Object[] objArr5 = new Object[1];
            c(b3, b3, bArr[37], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iIndexOf2, i2, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 31532);
                int iIndexOf3 = 920 - TextUtils.indexOf((CharSequence) "", '0', 0);
                int iRed = 28 - Color.red(0);
                byte[] bArr2 = $$a;
                byte b4 = bArr2[33];
                byte b5 = bArr2[37];
                Object[] objArr6 = new Object[1];
                c(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iIndexOf3, iRed, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i3 = ~((int) Process.getStartUptimeMillis());
            int i4 = 176980438 + (((~((-828911083) | i3)) | (-945168562)) * (-983)) + (((~(i3 | (-945168562))) | 135659537) * 983) + 740187937;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            d(null, null, View.getDefaultSize(0, 0) + 127, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(null, null, 127 - TextUtils.indexOf("", "", 0, 0), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            d(null, null, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(null, null, 128 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 740187937};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[117];
                byte b7 = b6;
                Object[] objArr13 = new Object[1];
                e(b6, b7, b7, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = bArr3[9];
                byte b9 = b8;
                Object[] objArr14 = new Object[1];
                e(b8, b9, b9, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31532);
                    int i7 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 921;
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 28;
                    byte[] bArr4 = $$a;
                    byte b10 = bArr4[33];
                    byte b11 = bArr4[37];
                    Object[] objArr16 = new Object[1];
                    c(b10, b11, b11, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, i7, pressedStateDuration, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    d(null, null, 127 - TextUtils.indexOf("", "", 0, 0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    d(null, null, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char mode = (char) (31533 - View.MeasureSpec.getMode(0));
                        int i8 = 921 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i9 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29;
                        byte[] bArr5 = $$a;
                        byte b12 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        c(b12, b12, bArr5[37], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mode, i8, i9, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char packedPositionChild = (char) (31532 - ExpandableListView.getPackedPositionChild(0L));
                        int gidForName = 920 - Process.getGidForName("");
                        int iIndexOf4 = TextUtils.indexOf("", "") + 28;
                        byte b13 = $$a[80];
                        Object[] objArr20 = new Object[1];
                        c((byte) 52, b13, b13, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionChild, gidForName, iIndexOf4, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i10 = asBinder + 43;
                    f385a = i10 % 128;
                    int i11 = i10 % 2;
                    objArr = objArr15;
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 == i12) {
            int i14 = asBinder + 79;
            f385a = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iMyUid = Process.myUid();
            int i17 = ~iMyUid;
            int i18 = i16 + 25598825 + (((~((-1615995670) | i17)) | (~((-158083975) | iMyUid))) * 1900) + (((~(i17 | 158083974)) | (~(iMyUid | 1615995669))) * (-950)) + (((~(iMyUid | 158083974)) | (~(i17 | 1615995669))) * 950);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr21[0])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i21 = f385a + 67;
                asBinder = i21 % 128;
                int i22 = 2;
                int i23 = i21 % 2;
                int i24 = 0;
                while (i24 < strArr.length) {
                    int i25 = asBinder + 57;
                    f385a = i25 % 128;
                    if (i25 % i22 != 0) {
                        arrayList.add(strArr[i24]);
                        i24 += 40;
                    } else {
                        arrayList.add(strArr[i24]);
                        i24++;
                    }
                    i22 = 2;
                }
            }
            int[] iArr = new int[i13];
            int i26 = i13 - 1;
            iArr[i26] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i26) % 2) - 1], 1).show();
            int i27 = ((int[]) objArr[0])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i28 = (int) Runtime.getRuntime().totalMemory();
            int i29 = (-1127063547) + (((~((-922996836) | i28)) | (-851082809)) * (-318));
            int i30 = ~((-851082809) | i28);
            int i31 = ~i28;
            int i32 = i27 + i29 + ((i30 | (~(935067259 | i31))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i28 | 935067259)) | (~((-12070425) | i31))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr22[0])[0] = i34 ^ (i34 << 5);
        }
        return this.email;
    }

    public final String getHandphone() {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        f385a = i2 % 128;
        int i3 = i2 % 2;
        String str = this.handphone;
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        return str;
    }

    public final String getTransactionIdSdk() {
        int i = 2 % 2;
        int i2 = f385a + 105;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.transactionIdSdk;
        int i5 = i3 + 47;
        f385a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 30 / 0;
        }
        return str;
    }

    public final String getScoreLiveness() {
        int i = 2 % 2;
        int i2 = f385a;
        int i3 = i2 + 97;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.scoreLiveness;
        int i5 = i2 + 47;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getScoreManipulation() {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        int i3 = i2 % 128;
        f385a = i3;
        int i4 = i2 % 2;
        String str = this.scoreManipulation;
        int i5 = i3 + 37;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLatitude() {
        int i = 2 % 2;
        int i2 = f385a + 123;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.latitude;
        int i4 = i3 + 11;
        f385a = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getLongitude() {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        int i3 = i2 % 128;
        f385a = i3;
        int i4 = i2 % 2;
        String str = this.longitude;
        int i5 = i3 + 109;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getLocality() {
        int i = 2 % 2;
        int i2 = f385a + 117;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.locality;
        int i4 = i3 + 31;
        f385a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return str;
    }

    public final Map<String, RequestBody> getPartMap() {
        int i = 2 % 2;
        Map<String, Object> mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("selfiePhoto1");
        }
        Object obj = null;
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            int i2 = asBinder + 45;
            f385a = i2 % 128;
            if (i2 % 2 != 0) {
                mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("selfiePhoto2");
                obj.hashCode();
                throw null;
            }
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("selfiePhoto2");
            int i3 = f385a + 33;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 2;
            }
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("selfiePhoto3");
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
        }
        return linkedHashMap;
    }

    static {
        g = 1;
        b();
        int i = TuitionPaymentFragmentbindingInflater1 + 5;
        g = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ LivenessEndRequest copy$default(LivenessEndRequest livenessEndRequest, String str, String str2, String str3, String str4, String str5, String str6, File file, File file2, File file3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, Object obj) {
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        int i2 = 2 % 2;
        String str22 = (i & 1) != 0 ? livenessEndRequest.flData : str;
        String str23 = (i & 2) != 0 ? livenessEndRequest.brand : str2;
        String str24 = (i & 4) != 0 ? livenessEndRequest.deviceId : str3;
        if ((i & 8) != 0) {
            int i3 = asBinder;
            int i4 = i3 + 45;
            f385a = i4 % 128;
            int i5 = i4 % 2;
            str16 = livenessEndRequest.model;
            int i6 = i3 + 89;
            f385a = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str16 = str4;
        }
        String str25 = (i & 16) != 0 ? livenessEndRequest.sdk : str5;
        String str26 = (i & 32) != 0 ? livenessEndRequest.manufacture : str6;
        File file4 = (i & 64) != 0 ? livenessEndRequest.selfiePhoto1 : file;
        File file5 = (i & 128) != 0 ? livenessEndRequest.selfiePhoto2 : file2;
        File file6 = (i & 256) != 0 ? livenessEndRequest.selfiePhoto3 : file3;
        String str27 = (i & 512) != 0 ? livenessEndRequest.nik : str7;
        if ((i & 1024) != 0) {
            int i8 = f385a + 23;
            int i9 = i8 % 128;
            asBinder = i9;
            int i10 = i8 % 2;
            str17 = livenessEndRequest.email;
            int i11 = i9 + 81;
            f385a = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 2 % 3;
            }
        } else {
            str17 = str8;
        }
        String str28 = (i & 2048) != 0 ? livenessEndRequest.handphone : str9;
        if ((i & 4096) != 0) {
            int i13 = asBinder + 61;
            str18 = str28;
            f385a = i13 % 128;
            int i14 = i13 % 2;
            str19 = livenessEndRequest.transactionIdSdk;
            if (i14 != 0) {
                int i15 = 36 / 0;
            }
        } else {
            str18 = str28;
            str19 = str10;
        }
        String str29 = (i & 8192) != 0 ? livenessEndRequest.scoreLiveness : str11;
        if ((i & 16384) != 0) {
            int i16 = asBinder + 67;
            f385a = i16 % 128;
            if (i16 % 2 != 0) {
                String str30 = livenessEndRequest.scoreManipulation;
                throw null;
            }
            str20 = livenessEndRequest.scoreManipulation;
        } else {
            str20 = str12;
        }
        String str31 = (32768 & i) != 0 ? livenessEndRequest.latitude : str13;
        if ((i & 65536) != 0) {
            String str32 = livenessEndRequest.longitude;
            int i17 = f385a + 23;
            asBinder = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 3 / 4;
            }
            str21 = str32;
        } else {
            str21 = str14;
        }
        return livenessEndRequest.copy(str22, str23, str24, str16, str25, str26, file4, file5, file6, str27, str17, str18, str19, str29, str20, str31, str21, (i & 131072) != 0 ? livenessEndRequest.locality : str15);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 51;
        f385a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.flData;
        int i5 = i2 + 43;
        f385a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        f385a = i2 % 128;
        if (i2 % 2 == 0) {
            return this.nik;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        f385a = i2 % 128;
        int i3 = i2 % 2;
        String str = this.email;
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        return str;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        f385a = i2 % 128;
        if (i2 % 2 == 0) {
            return this.handphone;
        }
        throw null;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        f385a = i2 % 128;
        int i3 = i2 % 2;
        String str = this.transactionIdSdk;
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
        return str;
    }

    public final String component14() {
        String str;
        int i = 2 % 2;
        int i2 = f385a + 51;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            str = this.scoreLiveness;
            int i4 = 49 / 0;
        } else {
            str = this.scoreLiveness;
        }
        int i5 = i3 + 83;
        f385a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 91;
        f385a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.scoreManipulation;
        int i5 = i2 + 123;
        f385a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = f385a + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.latitude;
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        return str;
    }

    public final String component17() {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        int i3 = i2 % 128;
        f385a = i3;
        int i4 = i2 % 2;
        String str = this.longitude;
        int i5 = i3 + 103;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component18() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 15;
        f385a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.locality;
        int i5 = i2 + 77;
        f385a = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = f385a + 37;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.brand;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = f385a + 101;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.deviceId;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 27;
        f385a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.model;
        int i5 = i2 + 115;
        f385a = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = f385a + 55;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.sdk;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        int i3 = i2 % 128;
        f385a = i3;
        int i4 = i2 % 2;
        String str = this.manufacture;
        int i5 = i3 + 91;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 54 / 0;
        }
        return str;
    }

    public final File component7() {
        int i = 2 % 2;
        int i2 = f385a;
        int i3 = i2 + 107;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        File file = this.selfiePhoto1;
        int i5 = i2 + 65;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return file;
        }
        throw null;
    }

    public final File component8() {
        int i = 2 % 2;
        int i2 = f385a + 3;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        File file = this.selfiePhoto2;
        int i4 = i3 + 91;
        f385a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return file;
    }

    public final File component9() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 95;
        f385a = i3 % 128;
        int i4 = i3 % 2;
        File file = this.selfiePhoto3;
        int i5 = i2 + 75;
        f385a = i5 % 128;
        int i6 = i5 % 2;
        return file;
    }

    public final LivenessEndRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, File p6, File p7, File p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String p16, String p17) {
        int i = 2 % 2;
        LivenessEndRequest livenessEndRequest = new LivenessEndRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17);
        int i2 = asBinder + 15;
        f385a = i2 % 128;
        if (i2 % 2 == 0) {
            return livenessEndRequest;
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
        if (!(p0 instanceof LivenessEndRequest)) {
            return false;
        }
        LivenessEndRequest livenessEndRequest = (LivenessEndRequest) p0;
        if (!Intrinsics.areEqual(this.flData, livenessEndRequest.flData) || !Intrinsics.areEqual(this.brand, livenessEndRequest.brand)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.deviceId, livenessEndRequest.deviceId)) {
            int i2 = f385a + 101;
            asBinder = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.model, livenessEndRequest.model) || !Intrinsics.areEqual(this.sdk, livenessEndRequest.sdk)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.manufacture, livenessEndRequest.manufacture)) {
            int i3 = asBinder + 15;
            f385a = i3 % 128;
            return i3 % 2 != 0;
        }
        if ((!Intrinsics.areEqual(this.selfiePhoto1, livenessEndRequest.selfiePhoto1)) || !Intrinsics.areEqual(this.selfiePhoto2, livenessEndRequest.selfiePhoto2)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.selfiePhoto3, livenessEndRequest.selfiePhoto3)) {
            int i4 = f385a + 29;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.nik, livenessEndRequest.nik) && Intrinsics.areEqual(this.email, livenessEndRequest.email) && Intrinsics.areEqual(this.handphone, livenessEndRequest.handphone) && !(!Intrinsics.areEqual(this.transactionIdSdk, livenessEndRequest.transactionIdSdk))) {
            if (Intrinsics.areEqual(this.scoreLiveness, livenessEndRequest.scoreLiveness)) {
                return Intrinsics.areEqual(this.scoreManipulation, livenessEndRequest.scoreManipulation) && Intrinsics.areEqual(this.latitude, livenessEndRequest.latitude) && Intrinsics.areEqual(this.longitude, livenessEndRequest.longitude) && Intrinsics.areEqual(this.locality, livenessEndRequest.locality);
            }
            int i6 = f385a + 5;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int i;
        int iHashCode7;
        int i2;
        int iHashCode8;
        int i3 = 2 % 2;
        String str = this.flData;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        String str2 = this.brand;
        if (str2 == null) {
            int i4 = f385a + 67;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
            int i6 = asBinder + 21;
            f385a = i6 % 128;
            int i7 = i6 % 2;
        }
        String str3 = this.deviceId;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.model;
        if (str4 == null) {
            int i8 = f385a + 11;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.sdk;
        if (str5 == null) {
            int i10 = asBinder + 11;
            f385a = i10 % 128;
            int i11 = i10 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str5.hashCode();
        }
        String str6 = this.manufacture;
        int iHashCode11 = str6 == null ? 0 : str6.hashCode();
        File file = this.selfiePhoto1;
        int iHashCode12 = file == null ? 0 : file.hashCode();
        File file2 = this.selfiePhoto2;
        int iHashCode13 = file2 == null ? 0 : file2.hashCode();
        File file3 = this.selfiePhoto3;
        if (file3 == null) {
            int i12 = asBinder + 111;
            f385a = i12 % 128;
            int i13 = i12 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = file3.hashCode();
        }
        String str7 = this.nik;
        int iHashCode14 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.email;
        int iHashCode15 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.handphone;
        int iHashCode16 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.transactionIdSdk;
        if (str10 == null) {
            int i14 = f385a + 125;
            asBinder = i14 % 128;
            int i15 = i14 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str10.hashCode();
        }
        String str11 = this.scoreLiveness;
        if (str11 == null) {
            int i16 = f385a + 107;
            asBinder = i16 % 128;
            int i17 = i16 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = str11.hashCode();
        }
        String str12 = this.scoreManipulation;
        int iHashCode17 = 1;
        if (str12 == null) {
            int i18 = f385a + 103;
            i = iHashCode6;
            asBinder = i18 % 128;
            iHashCode7 = i18 % 2 == 0 ? 1 : 0;
        } else {
            i = iHashCode6;
            iHashCode7 = str12.hashCode();
        }
        String str13 = this.latitude;
        if (str13 == null) {
            int i19 = asBinder + 111;
            i2 = iHashCode7;
            f385a = i19 % 128;
            if (i19 % 2 == 0) {
                iHashCode17 = 0;
            }
        } else {
            i2 = iHashCode7;
            iHashCode17 = str13.hashCode();
        }
        String str14 = this.longitude;
        if (str14 == null) {
            int i20 = asBinder + 93;
            f385a = i20 % 128;
            int i21 = i20 % 2;
            iHashCode8 = 0;
        } else {
            iHashCode8 = str14.hashCode();
        }
        String str15 = this.locality;
        return (((((((((((((((((((((((((((((((((iHashCode9 * 31) + iHashCode) * 31) + iHashCode10) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode4) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode5) * 31) + i) * 31) + i2) * 31) + iHashCode17) * 31) + iHashCode8) * 31) + (str15 != null ? str15.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.flData;
        String str2 = this.brand;
        String str3 = this.deviceId;
        String str4 = this.model;
        String str5 = this.sdk;
        String str6 = this.manufacture;
        File file = this.selfiePhoto1;
        File file2 = this.selfiePhoto2;
        File file3 = this.selfiePhoto3;
        String str7 = this.nik;
        String str8 = this.email;
        String str9 = this.handphone;
        String str10 = this.transactionIdSdk;
        String str11 = this.scoreLiveness;
        String str12 = this.scoreManipulation;
        String str13 = this.latitude;
        String str14 = this.longitude;
        String str15 = this.locality;
        StringBuilder sb = new StringBuilder("LivenessEndRequest(flData=");
        sb.append(str);
        sb.append(", brand=");
        sb.append(str2);
        sb.append(", deviceId=");
        sb.append(str3);
        sb.append(", model=");
        sb.append(str4);
        sb.append(", sdk=");
        sb.append(str5);
        sb.append(", manufacture=");
        sb.append(str6);
        sb.append(", selfiePhoto1=");
        sb.append(file);
        sb.append(", selfiePhoto2=");
        sb.append(file2);
        sb.append(", selfiePhoto3=");
        sb.append(file3);
        sb.append(", nik=");
        sb.append(str7);
        sb.append(", email=");
        sb.append(str8);
        sb.append(", handphone=");
        sb.append(str9);
        sb.append(", transactionIdSdk=");
        sb.append(str10);
        sb.append(", scoreLiveness=");
        sb.append(str11);
        sb.append(", scoreManipulation=");
        sb.append(str12);
        sb.append(", latitude=");
        sb.append(str13);
        sb.append(", longitude=");
        sb.append(str14);
        sb.append(", locality=");
        sb.append(str15);
        sb.append(")");
        String string = sb.toString();
        int i2 = f385a + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void b() {
        b = new char[]{47372, 47423, 47369, 47419, 47422, 47364, 47359, 47418, 47386, 47412, 47417, 47368, 47360, 47338, 47361, 47370, 47362, 47421, 47387, 47340, 47415, 47385, 47365, 47416, 47363, 47366, 47333};
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2047719597;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, short r6, short r7) {
        /*
            byte[] r0 = com.bpjstku.data.devicebinding.model.request.LivenessEndRequest.$$c
            int r6 = 68 - r6
            int r5 = r5 * 2
            int r5 = r5 + 4
            int r7 = r7 * 3
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r6 = r7
            r3 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L21:
            r4 = r0[r5]
            int r3 = r3 + 1
        L25:
            int r6 = r6 + r4
            int r5 = r5 + 1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.devicebinding.model.request.LivenessEndRequest.$$g(byte, short, short):java.lang.String");
    }
}
