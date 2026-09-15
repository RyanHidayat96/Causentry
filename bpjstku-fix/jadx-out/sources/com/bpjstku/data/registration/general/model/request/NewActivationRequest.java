package com.bpjstku.data.registration.general.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.autofill.HintConstants;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import defpackage.createCameraSelectorById;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001Bã\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010!J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010!J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010!J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010!J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010!J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010!J\u0012\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b/\u0010-J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010!J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010!J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010!J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010!J\u0012\u00104\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b4\u0010-J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010!J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010!J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010!J\u0098\u0002\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020;2\b\u0010\u0003\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010?\u001a\u00020>HÖ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0002H×\u0001¢\u0006\u0004\bA\u0010!R\u001c\u0010B\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010!R\u001c\u0010E\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010!R\u001c\u0010G\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010!R\u001c\u0010I\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010!R\u001c\u0010K\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010C\u001a\u0004\bL\u0010!R\u001c\u0010M\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010C\u001a\u0004\bN\u0010!R\u001c\u0010O\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010C\u001a\u0004\bP\u0010!R\u001c\u0010Q\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010C\u001a\u0004\bR\u0010!R\u001c\u0010S\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010C\u001a\u0004\bT\u0010!R\u001c\u0010U\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010C\u001a\u0004\bV\u0010!R\u001c\u0010W\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010C\u001a\u0004\bX\u0010!R\u001c\u0010Y\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010-R\u001c\u0010\\\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010Z\u001a\u0004\b]\u0010-R\u001c\u0010^\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010Z\u001a\u0004\b_\u0010-R\u001c\u0010`\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010C\u001a\u0004\ba\u0010!R\u001c\u0010b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010C\u001a\u0004\bc\u0010!R\u001c\u0010d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010C\u001a\u0004\be\u0010!R\u001c\u0010f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010C\u001a\u0004\bg\u0010!R\u001c\u0010h\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010Z\u001a\u0004\bi\u0010-R\u001c\u0010j\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010C\u001a\u0004\bk\u0010!R\u001c\u0010l\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010C\u001a\u0004\bm\u0010!R\u001c\u0010n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bn\u0010C\u001a\u0004\bo\u0010!"}, d2 = {"Lcom/bpjstku/data/registration/general/model/request/NewActivationRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "Ljava/io/File;", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "Lokhttp3/RequestBody;", "getPartMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Ljava/io/File;", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/registration/general/model/request/NewActivationRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "identityNumber", "Ljava/lang/String;", "getIdentityNumber", "kpj", "getKpj", "name", "getName", "dateOfBirth", "getDateOfBirth", "identityType", "getIdentityType", "segmenCode", "getSegmenCode", "checkSum", "getCheckSum", "registerId", "getRegisterId", "handphone", "getHandphone", HintConstants.AUTOFILL_HINT_PASSWORD, "getPassword", "email", "getEmail", "file", "Ljava/io/File;", "getFile", "file2", "getFile2", "file3", "getFile3", "latitude", "getLatitude", "longitude", "getLongitude", PlaceTypes.LOCALITY, "getLocality", "biometricStatus", "getBiometricStatus", "fileKtp", "getFileKtp", "deviceBrand", "getDeviceBrand", "deviceModel", "getDeviceModel", "deviceId", "getDeviceId"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class NewActivationRequest extends BaseRequest {
    public static final int $stable = 8;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char b;

    @SerializedName("biometricStatus")
    private final String biometricStatus;

    @SerializedName("checkSum")
    private final String checkSum;

    @SerializedName("dateOfBirth")
    private final String dateOfBirth;

    @SerializedName("deviceBrand")
    private final String deviceBrand;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("deviceModel")
    private final String deviceModel;

    @SerializedName("email")
    private final String email;

    @SerializedName("file")
    private final File file;

    @SerializedName("file2")
    private final File file2;

    @SerializedName("file3")
    private final File file3;

    @SerializedName("fileKtp")
    private final File fileKtp;

    @SerializedName("handphone")
    private final String handphone;

    @SerializedName("identityNumber")
    private final String identityNumber;

    @SerializedName("identityType")
    private final String identityType;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("latitude")
    private final String latitude;

    @SerializedName(PlaceTypes.LOCALITY)
    private final String locality;

    @SerializedName("longitude")
    private final String longitude;

    @SerializedName("name")
    private final String name;

    @SerializedName(HintConstants.AUTOFILL_HINT_PASSWORD)
    private final String password;

    @SerializedName("registerId")
    private final String registerId;

    @SerializedName("segmenCode")
    private final String segmenCode;
    private static final byte[] $$c = {55, -47, -47, 67};
    private static final int $$f = 15;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {112, 19, -59, 97, 56, 0, 9, 22, -44, 55, -8, 31, 0, -19, 28, 20, 8, 12, 11, -6, 22, -26, 49, 0, 0, 22, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, -9, 16, 14, -1, 14, 14, 2, -21, 46, 1, 15, -2, 28, -6, 22, -56};
    private static final int $$e = 100;
    private static final byte[] $$a = {74, 60, 122, -26, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 42;
    private static int d = 0;
    private static int asBinder = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f404a = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = r6 + 4
            int r7 = r7 + 84
            byte[] r0 = com.bpjstku.data.registration.general.model.request.NewActivationRequest.$$a
            int r8 = r8 * 52
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.general.model.request.NewActivationRequest.c(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.data.registration.general.model.request.NewActivationRequest.$$d
            int r8 = r8 * 15
            int r8 = r8 + 23
            int r9 = r9 * 14
            int r9 = r9 + 70
            int r7 = r7 * 22
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2d
        L17:
            r3 = r2
        L18:
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
            int r3 = r3 + r7
            int r7 = r9 + 1
            int r9 = r3 + (-9)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.general.model.request.NewActivationRequest.f(short, byte, short, java.lang.Object[]):void");
    }

    public final String getIdentityNumber() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 61;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.identityNumber;
        int i5 = i2 + 57;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getKpj() {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return this.kpj;
        }
        throw null;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = d + 25;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 21;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getDateOfBirth() {
        int i = 2 % 2;
        int i2 = d + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.dateOfBirth;
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return str;
    }

    public final String getIdentityType() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 27;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.identityType;
        int i5 = i2 + 9;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSegmenCode() {
        String str;
        int i = 2 % 2;
        int i2 = d + 49;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            str = this.segmenCode;
            int i4 = 9 / 0;
        } else {
            str = this.segmenCode;
        }
        int i5 = i3 + 89;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getCheckSum() {
        String str;
        int i = 2 % 2;
        int i2 = asBinder + 39;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 != 0) {
            str = this.checkSum;
            int i4 = 27 / 0;
        } else {
            str = this.checkSum;
        }
        int i5 = i3 + 91;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getRegisterId() {
        int i = 2 % 2;
        int i2 = d + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.registerId;
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return str;
    }

    public final String getHandphone() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 71;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.handphone;
        int i5 = i2 + 3;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getPassword() {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.password;
        int i5 = i3 + 121;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = d + 5;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.email;
        int i5 = i3 + 25;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final File getFile() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 51;
        d = i3 % 128;
        int i4 = i3 % 2;
        File file = this.file;
        int i5 = i2 + 7;
        d = i5 % 128;
        int i6 = i5 % 2;
        return file;
    }

    public final File getFile2() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        File file = this.file2;
        int i5 = i3 + 51;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return file;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final File getFile3() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 107;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        File file = this.file3;
        int i5 = i2 + 109;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return file;
        }
        throw null;
    }

    public final String getLatitude() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 89;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.latitude;
        int i4 = i2 + 69;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getLongitude() {
        String str;
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 21;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.longitude;
            int i4 = 71 / 0;
        } else {
            str = this.longitude;
        }
        int i5 = i2 + 17;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLocality() {
        String str;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 19;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.locality;
            int i4 = 17 / 0;
        } else {
            str = this.locality;
        }
        int i5 = i2 + 71;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBiometricStatus() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 119;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.biometricStatus;
        int i4 = i2 + 59;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final File getFileKtp() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 51;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        File file = this.fileKtp;
        int i5 = i2 + 89;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return file;
    }

    public final String getDeviceBrand() {
        int i = 2 % 2;
        int i2 = d + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.deviceBrand;
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return str;
    }

    public final String getDeviceModel() {
        int i = 2 % 2;
        int i2 = d + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.deviceModel;
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        return str;
    }

    public final String getDeviceId() {
        int i = 2 % 2;
        int i2 = d + 5;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.deviceId;
        int i5 = i3 + 23;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public NewActivationRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, File file, File file2, File file3, String str12, String str13, String str14, String str15, File file4, String str16, String str17, String str18) {
        this.identityNumber = str;
        this.kpj = str2;
        this.name = str3;
        this.dateOfBirth = str4;
        this.identityType = str5;
        this.segmenCode = str6;
        this.checkSum = str7;
        this.registerId = str8;
        this.handphone = str9;
        this.password = str10;
        this.email = str11;
        this.file = file;
        this.file2 = file2;
        this.file3 = file3;
        this.latitude = str12;
        this.longitude = str13;
        this.locality = str14;
        this.biometricStatus = str15;
        this.fileKtp = file4;
        this.deviceBrand = str16;
        this.deviceModel = str17;
        this.deviceId = str18;
    }

    public final Map<String, RequestBody> getPartMap() {
        int i = 2 % 2;
        int i2 = d + 5;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
            obj.hashCode();
            throw null;
        }
        Map<String, Object> mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("file");
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("file2");
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            int i3 = d + 35;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("file3");
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            int i5 = asBinder + 123;
            d = i5 % 128;
            int i6 = i5 % 2;
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("fileKtp");
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

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i4 = $10 + 21;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            int i6 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i7 = $10 + 91;
            $11 = i7 % 128;
            int i8 = 58224;
            char c = 1;
            if (i7 % 2 == 0) {
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                i2 = 1;
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                i2 = 0;
            }
            while (i2 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i6];
                int i9 = (c3 + i8) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[c] = Integer.valueOf(i9);
                    objArr2[i6] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cArgb = (char) (Color.argb(i6, i6, i6, i6) + 47773);
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 468;
                        int keyRepeatDelay = 13 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[i6] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, scrollDefaultDelay, keyRepeatDelay, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i6]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47774 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 468 - Drawable.resolveOpacity(0, 0), 13 - View.combineMeasuredStates(0, 0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i2++;
                    int i11 = $10 + 37;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 3 / 5;
                    }
                    i6 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 2323 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    public final String component17() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 876;
            int i2 = 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            c(b3, (byte) (b3 | 14), b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, jumpTapTimeout, i2, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{36634, 37142, 12117, 41958, 2583, 44550, 56310, 18320, 16549, 51229, 4414, 37819, 3023, 23362, 9180, 5247, 38163, 6002, 36022, 40548, 28039, 26672, 15547, 6043}, 22 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{20147, 37416, 27491, 1534, 14266, 1826, 44651, 43451, 39717, 44905, 60355, 43109, 14398, 45714, 45561, 17050, 42209, 38932}, 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 876;
            int size = View.MeasureSpec.getSize(0) + 10;
            byte[] bArr = $$a;
            byte b4 = bArr[7];
            Object[] objArr5 = new Object[1];
            c(b4, b4, (byte) (-bArr[5]), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop, keyRepeatDelay, size, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = d + 13;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i5 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 875;
                int doubleTapTimeout = 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c((byte) (-bArr2[5]), bArr2[54], bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, i5, doubleTapTimeout, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = (((981449172 + (((~((-794264918) | i6)) | 555122944) * 184)) + ((iIdentityHashCode | (-1073717120)) * (-184))) + ((~((-834575147) | i6)) * 184)) - 2111640586;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{63176, 18217, 17931, 25254, 22378, 37441, 44749, 49391, 45848, 19014, 5149, 29564, 48818, 14035, 26938, 6994, 40924, 56766, 14465, 59390, 36404, 33864, 6728, 56206, 14470, 29395, 43283, 60811}, 25 - TextUtils.lastIndexOf("", '0', 0, 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{6547, 5008, 24056, 2821, 45172, 26326, 17007, 30611, 39462, 634, 48753, 37529, 516, 45976, 57001, 23225, 49737, 34315, 46454, 62110}, 17 - TextUtils.lastIndexOf("", '0', 0, 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{29913, 7679, 30686, 17126, 25880, 17610, 27890, 56147, 33963, 16503, 1991, 46384, 33513, 11596, 29836, 41941, 63170, 40632}, View.getDefaultSize(0, 0) + 16, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{37632, 60580, 56643, 58715, 7677, 46630, 3174, 18661, 18180, 47674, 49522, 3921, 7608, 39804, 64016, 5346, 47262, 20534}, 16 - KeyEvent.keyCodeFromString(""), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), -2111640586};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[5];
                byte b6 = b5;
                Object[] objArr13 = new Object[1];
                f(b5, b6, b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr3[36];
                byte b8 = b7;
                Object[] objArr14 = new Object[1];
                f(b7, b8, b8, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i10 = asBinder + 57;
                    d = i10 % 128;
                    int i11 = i10 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 876;
                        int iMakeMeasureSpec = 10 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte[] bArr4 = $$a;
                        Object[] objArr16 = new Object[1];
                        c((byte) (-bArr4[5]), bArr4[54], bArr4[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength, iResolveSizeAndState, iMakeMeasureSpec, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(new char[]{36634, 37142, 12117, 41958, 2583, 44550, 56310, 18320, 16549, 51229, 4414, 37819, 3023, 23362, 9180, 5247, 38163, 6002, 36022, 40548, 28039, 26672, 15547, 6043}, TextUtils.indexOf("", "", 0, 0) + 22, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(new char[]{20147, 37416, 27491, 1534, 14266, 1826, 44651, 43451, 39717, 44905, 60355, 43109, 14398, 45714, 45561, 17050, 42209, 38932}, 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 876;
                            int iIndexOf = 9 - TextUtils.indexOf((CharSequence) "", '0');
                            byte[] bArr5 = $$a;
                            byte b9 = bArr5[7];
                            Object[] objArr19 = new Object[1];
                            c(b9, b9, (byte) (-bArr5[5]), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cNormalizeMetaState, absoluteGravity, iIndexOf, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "");
                            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 876;
                            int iIndexOf2 = TextUtils.indexOf("", "") + 10;
                            byte b10 = $$a[7];
                            byte b11 = b10;
                            Object[] objArr20 = new Object[1];
                            c(b11, (byte) (b11 | 14), b10, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, offsetAfter, iIndexOf2, 252381699, false, (String) objArr20[0], null);
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
        int i12 = ((int[]) objArr[2])[0];
        int i13 = ((int[]) objArr[0])[0];
        if (i13 == i12) {
            int i14 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i15 = ~((int) Process.getStartElapsedRealtime());
            int i16 = i14 + (((~((-1031984109) | i15)) | 75514344) * (-241)) + 553722172 + (((~(i15 | (-956469765))) | (-1067188224)) * 241);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr21[1])[0] = i18 ^ (i18 << 5);
        } else {
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            int i19 = ((int[]) objArr[1])[0];
            Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i20 = i19 + (-1616709178) + (((~((-51456034) | (~iIdentityHashCode2))) | 11145804) * (-591)) + ((iIdentityHashCode2 | (-51456034)) * 591);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr22[1])[0] = i22 ^ (i22 << 5);
        }
        return this.locality;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = f404a + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ NewActivationRequest copy$default(NewActivationRequest newActivationRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, File file, File file2, File file3, String str12, String str13, String str14, String str15, File file4, String str16, String str17, String str18, int i, Object obj) {
        String str19;
        String str20;
        String str21;
        File file5;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = asBinder + 123;
            d = i3 % 128;
            int i4 = i3 % 2;
            str19 = newActivationRequest.identityNumber;
        } else {
            str19 = str;
        }
        String str27 = (i & 2) != 0 ? newActivationRequest.kpj : str2;
        String str28 = (i & 4) != 0 ? newActivationRequest.name : str3;
        String str29 = (i & 8) != 0 ? newActivationRequest.dateOfBirth : str4;
        String str30 = (i & 16) != 0 ? newActivationRequest.identityType : str5;
        if ((i & 32) != 0) {
            int i5 = asBinder + 25;
            d = i5 % 128;
            if (i5 % 2 != 0) {
                String str31 = newActivationRequest.segmenCode;
                throw null;
            }
            str20 = newActivationRequest.segmenCode;
        } else {
            str20 = str6;
        }
        String str32 = (i & 64) != 0 ? newActivationRequest.checkSum : str7;
        String str33 = (i & 128) != 0 ? newActivationRequest.registerId : str8;
        if ((i & 256) != 0) {
            int i6 = asBinder + 59;
            d = i6 % 128;
            int i7 = i6 % 2;
            str21 = newActivationRequest.handphone;
        } else {
            str21 = str9;
        }
        String str34 = (i & 512) != 0 ? newActivationRequest.password : str10;
        String str35 = (i & 1024) != 0 ? newActivationRequest.email : str11;
        File file6 = (i & 2048) != 0 ? newActivationRequest.file : file;
        File file7 = (i & 4096) != 0 ? newActivationRequest.file2 : file2;
        if ((i & 8192) != 0) {
            int i8 = asBinder + 59;
            d = i8 % 128;
            if (i8 % 2 != 0) {
                File file8 = newActivationRequest.file3;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            file5 = newActivationRequest.file3;
        } else {
            file5 = file3;
        }
        String str36 = (i & 16384) != 0 ? newActivationRequest.latitude : str12;
        if ((i & 32768) != 0) {
            String str37 = newActivationRequest.longitude;
            int i9 = d + 61;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            str22 = str37;
        } else {
            str22 = str13;
        }
        String str38 = (65536 & i) != 0 ? newActivationRequest.locality : str14;
        if ((i & 131072) != 0) {
            str24 = str38;
            int i11 = d + 55;
            str23 = str22;
            asBinder = i11 % 128;
            int i12 = i11 % 2;
            str25 = newActivationRequest.biometricStatus;
            if (i12 == 0) {
                int i13 = 70 / 0;
            }
        } else {
            str23 = str22;
            str24 = str38;
            str25 = str15;
        }
        File file9 = (262144 & i) != 0 ? newActivationRequest.fileKtp : file4;
        String str39 = (i & 524288) != 0 ? newActivationRequest.deviceBrand : str16;
        String str40 = (i & 1048576) != 0 ? newActivationRequest.deviceModel : str17;
        if ((i & 2097152) != 0) {
            int i14 = d + 29;
            asBinder = i14 % 128;
            if (i14 % 2 == 0) {
                String str41 = newActivationRequest.deviceId;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            str26 = newActivationRequest.deviceId;
        } else {
            str26 = str18;
        }
        return newActivationRequest.copy(str19, str27, str28, str29, str30, str20, str32, str33, str21, str34, str35, file6, file7, file5, str36, str23, str24, str25, file9, str39, str40, str26);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return this.identityNumber;
        }
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = d + 45;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.password;
        int i5 = i3 + 35;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.email;
        int i5 = i3 + 43;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final File component12() {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        File file = this.file;
        int i5 = i3 + 45;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return file;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final File component13() {
        int i = 2 % 2;
        int i2 = d + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        File file = this.file2;
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        return file;
    }

    public final File component14() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 117;
        d = i3 % 128;
        int i4 = i3 % 2;
        File file = this.file3;
        int i5 = i2 + 37;
        d = i5 % 128;
        int i6 = i5 % 2;
        return file;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 63;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.latitude;
        int i5 = i2 + 89;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return this.longitude;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component18() {
        int i = 2 % 2;
        int i2 = d + 33;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.biometricStatus;
        int i4 = i3 + 117;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return str;
    }

    public final File component19() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 23;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        File file = this.fileKtp;
        int i5 = i2 + 35;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return file;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.kpj;
        int i5 = i3 + 79;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component20() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 63;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.deviceBrand;
        int i5 = i2 + 37;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
        return str;
    }

    public final String component21() {
        String str;
        int i = 2 % 2;
        int i2 = d + 107;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            str = this.deviceModel;
            int i4 = 31 / 0;
        } else {
            str = this.deviceModel;
        }
        int i5 = i3 + 81;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return str;
    }

    public final String component22() {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return this.deviceId;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 89;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 125;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = d + 9;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.dateOfBirth;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.identityType;
        int i5 = i3 + 101;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = d + 99;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.segmenCode;
        int i4 = i3 + 121;
        d = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = d + 71;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.checkSum;
        int i5 = i3 + 65;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        String str;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 117;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.registerId;
            int i4 = 32 / 0;
        } else {
            str = this.registerId;
        }
        int i5 = i2 + 23;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 113;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.handphone;
        int i5 = i2 + 3;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final NewActivationRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, File p11, File p12, File p13, String p14, String p15, String p16, String p17, File p18, String p19, String p20, String p21) {
        int i = 2 % 2;
        NewActivationRequest newActivationRequest = new NewActivationRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21);
        int i2 = d + 49;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 15 / 0;
        }
        return newActivationRequest;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 87;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof NewActivationRequest)) {
            int i4 = i2 + 67;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        NewActivationRequest newActivationRequest = (NewActivationRequest) p0;
        if (!Intrinsics.areEqual(this.identityNumber, newActivationRequest.identityNumber) || !Intrinsics.areEqual(this.kpj, newActivationRequest.kpj) || !Intrinsics.areEqual(this.name, newActivationRequest.name) || !Intrinsics.areEqual(this.dateOfBirth, newActivationRequest.dateOfBirth) || (!Intrinsics.areEqual(this.identityType, newActivationRequest.identityType)) || !Intrinsics.areEqual(this.segmenCode, newActivationRequest.segmenCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.checkSum, newActivationRequest.checkSum)) {
            int i6 = d + 21;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.registerId, newActivationRequest.registerId)) {
            int i8 = asBinder + 49;
            d = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.handphone, newActivationRequest.handphone)) {
            int i10 = d + 79;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.password, newActivationRequest.password))) {
            if (Intrinsics.areEqual(this.email, newActivationRequest.email)) {
                if (!Intrinsics.areEqual(this.file, newActivationRequest.file)) {
                    int i12 = d + 73;
                    asBinder = i12 % 128;
                    if (i12 % 2 != 0) {
                        return false;
                    }
                    obj.hashCode();
                    throw null;
                }
                if (!Intrinsics.areEqual(this.file2, newActivationRequest.file2)) {
                    int i13 = asBinder + 29;
                    d = i13 % 128;
                    int i14 = i13 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.file3, newActivationRequest.file3)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.latitude, newActivationRequest.latitude)) {
                    int i15 = d + 17;
                    asBinder = i15 % 128;
                    if (i15 % 2 != 0) {
                        return false;
                    }
                    throw null;
                }
                if (!Intrinsics.areEqual(this.longitude, newActivationRequest.longitude) || !Intrinsics.areEqual(this.locality, newActivationRequest.locality) || !Intrinsics.areEqual(this.biometricStatus, newActivationRequest.biometricStatus)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.fileKtp, newActivationRequest.fileKtp)) {
                    return Intrinsics.areEqual(this.deviceBrand, newActivationRequest.deviceBrand) && !(Intrinsics.areEqual(this.deviceModel, newActivationRequest.deviceModel) ^ true) && Intrinsics.areEqual(this.deviceId, newActivationRequest.deviceId);
                }
                int i16 = asBinder + 89;
                d = i16 % 128;
                int i17 = i16 % 2;
                return false;
            }
            int i18 = asBinder + 47;
            d = i18 % 128;
            int i19 = i18 % 2;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i;
        int iHashCode6;
        int iHashCode7;
        int i2 = 2 % 2;
        String str = this.identityNumber;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        String str2 = this.kpj;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.name;
        if (str3 == null) {
            int i3 = asBinder + 9;
            d = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
        }
        String str4 = this.dateOfBirth;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.identityType;
        if (str5 == null) {
            int i5 = d + 25;
            asBinder = i5 % 128;
            iHashCode2 = i5 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str5.hashCode();
        }
        String str6 = this.segmenCode;
        if (str6 == null) {
            int i6 = d + 99;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str6.hashCode();
        }
        String str7 = this.checkSum;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.registerId;
        int iHashCode12 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.handphone;
        if (str9 == null) {
            int i8 = asBinder + 69;
            d = i8 % 128;
            iHashCode4 = i8 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode4 = str9.hashCode();
        }
        String str10 = this.password;
        int iHashCode13 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.email;
        int iHashCode14 = str11 == null ? 0 : str11.hashCode();
        File file = this.file;
        if (file == null) {
            int i9 = d + 27;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = file.hashCode();
        }
        File file2 = this.file2;
        int iHashCode15 = file2 == null ? 0 : file2.hashCode();
        File file3 = this.file3;
        if (file3 == null) {
            int i11 = asBinder + 99;
            i = iHashCode15;
            d = i11 % 128;
            iHashCode6 = i11 % 2 != 0 ? 1 : 0;
        } else {
            i = iHashCode15;
            iHashCode6 = file3.hashCode();
        }
        String str12 = this.latitude;
        int iHashCode16 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.longitude;
        int iHashCode17 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.locality;
        if (str14 == null) {
            int i12 = d + 79;
            asBinder = i12 % 128;
            int i13 = i12 % 2;
            iHashCode7 = 0;
        } else {
            iHashCode7 = str14.hashCode();
        }
        String str15 = this.biometricStatus;
        int iHashCode18 = str15 == null ? 0 : str15.hashCode();
        File file4 = this.fileKtp;
        int iHashCode19 = file4 == null ? 0 : file4.hashCode();
        String str16 = this.deviceBrand;
        int iHashCode20 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.deviceModel;
        int iHashCode21 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.deviceId;
        return (((((((((((((((((((((((((((((((((((((((((iHashCode8 * 31) + iHashCode9) * 31) + iHashCode) * 31) + iHashCode10) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode4) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode5) * 31) + i) * 31) + iHashCode6) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode7) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + (str18 != null ? str18.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.identityNumber;
        String str2 = this.kpj;
        String str3 = this.name;
        String str4 = this.dateOfBirth;
        String str5 = this.identityType;
        String str6 = this.segmenCode;
        String str7 = this.checkSum;
        String str8 = this.registerId;
        String str9 = this.handphone;
        String str10 = this.password;
        String str11 = this.email;
        File file = this.file;
        File file2 = this.file2;
        File file3 = this.file3;
        String str12 = this.latitude;
        String str13 = this.longitude;
        String str14 = this.locality;
        String str15 = this.biometricStatus;
        File file4 = this.fileKtp;
        String str16 = this.deviceBrand;
        String str17 = this.deviceModel;
        String str18 = this.deviceId;
        StringBuilder sb = new StringBuilder("NewActivationRequest(identityNumber=");
        sb.append(str);
        sb.append(", kpj=");
        sb.append(str2);
        sb.append(", name=");
        sb.append(str3);
        sb.append(", dateOfBirth=");
        sb.append(str4);
        sb.append(", identityType=");
        sb.append(str5);
        sb.append(", segmenCode=");
        sb.append(str6);
        sb.append(", checkSum=");
        sb.append(str7);
        sb.append(", registerId=");
        sb.append(str8);
        sb.append(", handphone=");
        sb.append(str9);
        sb.append(", password=");
        sb.append(str10);
        sb.append(", email=");
        sb.append(str11);
        sb.append(", file=");
        sb.append(file);
        sb.append(", file2=");
        sb.append(file2);
        sb.append(", file3=");
        sb.append(file3);
        sb.append(", latitude=");
        sb.append(str12);
        sb.append(", longitude=");
        sb.append(str13);
        sb.append(", locality=");
        sb.append(str14);
        sb.append(", biometricStatus=");
        sb.append(str15);
        sb.append(", fileKtp=");
        sb.append(file4);
        sb.append(", deviceBrand=");
        sb.append(str16);
        sb.append(", deviceModel=");
        sb.append(str17);
        sb.append(", deviceId=");
        sb.append(str18);
        sb.append(")");
        String string = sb.toString();
        int i2 = d + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentbindingInflater1 = (char) 64573;
        b = (char) 3167;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 33908;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 200;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, int r8, int r9) {
        /*
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r9 = r9 * 4
            int r9 = 108 - r9
            int r8 = r8 * 2
            int r8 = 1 - r8
            byte[] r0 = com.bpjstku.data.registration.general.model.request.NewActivationRequest.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r5 = r2
            r9 = r7
            goto L2d
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = r7 + r3
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.general.model.request.NewActivationRequest.$$g(byte, int, int):java.lang.String");
    }
}
