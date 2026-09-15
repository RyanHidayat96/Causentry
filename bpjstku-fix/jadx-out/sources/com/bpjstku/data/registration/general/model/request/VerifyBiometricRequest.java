package com.bpjstku.data.registration.general.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import defpackage.createCameraSelectorById;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001aJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001aJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001aJÄ\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010\u0003\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b3\u0010\u001aR\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001aR\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u0010\u001aR\u001c\u00109\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u0010\u001aR\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u0010\u001aR\u001c\u0010=\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b>\u0010\u001aR\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u0010\u001aR\u001c\u0010A\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010!R\u001c\u0010D\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010B\u001a\u0004\bE\u0010!R\u001c\u0010F\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bG\u0010!R\u001c\u0010H\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u00105\u001a\u0004\bI\u0010\u001aR\u001c\u0010J\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u00105\u001a\u0004\bK\u0010\u001aR\u001c\u0010L\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u00105\u001a\u0004\bM\u0010\u001aR\u001c\u0010N\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u00105\u001a\u0004\bO\u0010\u001aR\u001c\u0010P\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u00105\u001a\u0004\bQ\u0010\u001aR\u001c\u0010R\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u00105\u001a\u0004\bS\u0010\u001a"}, d2 = {"Lcom/bpjstku/data/registration/general/model/request/VerifyBiometricRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "Ljava/io/File;", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "Lokhttp3/RequestBody;", "getPartMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/io/File;", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/registration/general/model/request/VerifyBiometricRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "flData", "Ljava/lang/String;", "getFlData", "brand", "getBrand", "deviceId", "getDeviceId", "model", "getModel", "sdk", "getSdk", "manufacture", "getManufacture", "file", "Ljava/io/File;", "getFile", "file2", "getFile2", "file3", "getFile3", "nik", "getNik", "email", "getEmail", "handphone", "getHandphone", "transactionIdSdk", "getTransactionIdSdk", "scoreLiveness", "getScoreLiveness", "scoreManipulation", "getScoreManipulation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class VerifyBiometricRequest extends BaseRequest {
    public static final int $stable = 8;
    private static long TuitionPaymentFragmentbindingInflater1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @SerializedName("brand")
    private final String brand;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("email")
    private final String email;

    @SerializedName("file")
    private final File file;

    @SerializedName("file2")
    private final File file2;

    @SerializedName("file3")
    private final File file3;

    @SerializedName("flData")
    private final String flData;

    @SerializedName("handphone")
    private final String handphone;

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

    @SerializedName("transactionIdSdk")
    private final String transactionIdSdk;
    private static final byte[] $$c = {91, -9, 99, 11};
    private static final int $$f = 220;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {80, -8, 43, 65, -13, 1, 62, -53, -15, 5, -10, -2, 8, -11, 70, -55, 2, -20, 18, 50, -67, 14, -25, 11, 7, -10, -7, 69, -64, -3, 10, -2, -8, Base64.padSymbol, -69, 12, -13, -5, 15, -15, -2, 69, -28, -38, 9, -6, -14, 12, 4, -18, 19, -12, 39, -34, -16, 18, -9, -4, 40, -51, 1, -2, 4, 1, 7, -14, 34, -20, -9, 4, 1, -18, -34, 11, -12, 10, -7, 0, 29, -18, -25, 11, 7, -10, -7, 45, -45, 16, -7, -7, 7, -10, -7, 17, -8, -6, 9, -6, -6, 6, 29, -38, 7, -7, 10, -20, 14, -14, 64};
    private static final int $$e = 94;
    private static final byte[] $$a = {8, -36, 87, -65, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 185;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f405a = 1;
    private static int b = 1;

    private static void c(byte b2, short s, int i, Object[] objArr) {
        int i2 = (i * 14) + 84;
        byte[] bArr = $$a;
        int i3 = 56 - (s * 52);
        byte[] bArr2 = new byte[b2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 = (i2 + b2) - 10;
            i3++;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == b2) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (i2 + bArr[i3]) - 10;
                i3++;
            }
        }
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
    private static void e(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 68
            int r7 = r7 + 4
            int r8 = r8 * 15
            int r8 = 99 - r8
            byte[] r0 = com.bpjstku.data.registration.general.model.request.VerifyBiometricRequest.$$d
            int r9 = r9 * 31
            int r9 = r9 + 38
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r5 = r2
            r8 = r7
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r8 + 1
            int r8 = r3 + (-1)
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.general.model.request.VerifyBiometricRequest.e(byte, short, short, java.lang.Object[]):void");
    }

    public final String getFlData() {
        int i = 2 % 2;
        int i2 = f405a;
        int i3 = i2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.flData;
        int i4 = i2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getBrand() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
        f405a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.brand;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDeviceId() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        int i3 = i2 % 128;
        f405a = i3;
        int i4 = i2 % 2;
        String str = this.deviceId;
        int i5 = i3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getModel() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 3;
        f405a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.model;
        int i5 = i2 + 13;
        f405a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSdk() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        int i3 = i2 % 128;
        f405a = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.sdk;
        int i4 = i3 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getManufacture() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        f405a = i2 % 128;
        int i3 = i2 % 2;
        String str = this.manufacture;
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        return str;
    }

    public final File getFile() {
        int i = 2 % 2;
        int i2 = f405a;
        int i3 = i2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        File file = this.file;
        int i5 = i2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return file;
    }

    public final File getFile2() {
        int i = 2 % 2;
        int i2 = f405a + 83;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        File file = this.file2;
        int i4 = i3 + 81;
        f405a = i4 % 128;
        if (i4 % 2 != 0) {
            return file;
        }
        throw null;
    }

    public final File getFile3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 27;
        f405a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        File file = this.file3;
        int i4 = i2 + 85;
        f405a = i4 % 128;
        if (i4 % 2 != 0) {
            return file;
        }
        obj.hashCode();
        throw null;
    }

    public final String getNik() {
        int i = 2 % 2;
        int i2 = f405a + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.nik;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getEmail() {
        String str;
        int i = 2 % 2;
        int i2 = f405a;
        int i3 = i2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.email;
            int i4 = 62 / 0;
        } else {
            str = this.email;
        }
        int i5 = i2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getHandphone() {
        int i = 2 % 2;
        int i2 = f405a + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.handphone;
        }
        throw null;
    }

    public final String getTransactionIdSdk() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        int i3 = i2 % 128;
        f405a = i3;
        int i4 = i2 % 2;
        String str = this.transactionIdSdk;
        int i5 = i3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return str;
    }

    public final String getScoreLiveness() {
        int i = 2 % 2;
        int i2 = f405a;
        int i3 = i2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.scoreLiveness;
        int i4 = i2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getScoreManipulation() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
        int i3 = i2 % 128;
        f405a = i3;
        int i4 = i2 % 2;
        String str = this.scoreManipulation;
        int i5 = i3 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public VerifyBiometricRequest(String str, String str2, String str3, String str4, String str5, String str6, File file, File file2, File file3, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.flData = str;
        this.brand = str2;
        this.deviceId = str3;
        this.model = str4;
        this.sdk = str5;
        this.manufacture = str6;
        this.file = file;
        this.file2 = file2;
        this.file3 = file3;
        this.nik = str7;
        this.email = str8;
        this.handphone = str9;
        this.transactionIdSdk = str10;
        this.scoreLiveness = str11;
        this.scoreManipulation = str12;
    }

    public final Map<String, RequestBody> getPartMap() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
        f405a = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
            f405a = i4 % 128;
            int i5 = i4 % 2;
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("file");
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("file2");
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("file3");
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.size()));
        Iterator<T> it = mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.entrySet().iterator();
        while (!(!it.hasNext())) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Intrinsics.checkNotNullParameter(value, "");
            linkedHashMap.put(key, RequestBody.INSTANCE.create((String) value, MediaType.INSTANCE.parse("text/plain")));
        }
        return linkedHashMap;
    }

    private static void d(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $11 + 45;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i % i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 2188 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 39 - Process.getGidForName(""), 841711447, false, $$g(b2, b3, (byte) (b3 - 2)), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33018 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3011, AndroidCharacter.getMirror('0') - 22, 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = (byte) (b6 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - KeyEvent.getDeadChar(0, 0)), 3375 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 16 - ((byte) KeyEvent.getModifierMetaStateMask()), -968507904, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
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
            } else {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) Color.red(0), TextUtils.getOffsetBefore("", 0) + 2187, (Process.myPid() >> 22) + 40, 841711447, false, $$g(b8, b9, (byte) (b9 - 2)), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33017 - (ViewConfiguration.getScrollBarSize() >> 8)), 3010 - TextUtils.lastIndexOf("", '0'), 26 - (ViewConfiguration.getTouchSlop() >> 8), 321985076, false, $$g(b10, b11, b11), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                        try {
                            Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                byte b12 = (byte) 0;
                                byte b13 = (byte) (b12 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (36506 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (Process.myPid() >> 22) + 3376, 17 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -968507904, false, $$g(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                        } catch (Throwable th4) {
                            Throwable cause4 = th4.getCause();
                            if (cause4 == null) {
                                throw th4;
                            }
                            throw cause4;
                        }
                    } catch (Throwable th5) {
                        Throwable cause5 = th5.getCause();
                        if (cause5 == null) {
                            throw th5;
                        }
                        throw cause5;
                    }
                } catch (Throwable th6) {
                    Throwable cause6 = th6.getCause();
                    if (cause6 == null) {
                        throw th6;
                    }
                    throw cause6;
                }
            }
            int i7 = $11 + 47;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            try {
                Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 36505), (ViewConfiguration.getTouchSlop() >> 8) + 3376, 17 - ExpandableListView.getPackedPositionType(0L), -968507904, false, $$g(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
            } catch (Throwable th7) {
                Throwable cause7 = th7.getCause();
                if (cause7 == null) {
                    throw th7;
                }
                throw cause7;
            }
        }
        objArr[0] = new String(cArr);
        int i9 = $11 + 11;
        $10 = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x022a  */
    public final String component6() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (31534 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int i2 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 920;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 29;
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            byte b3 = bArr[37];
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i2, iLastIndexOf, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(KeyEvent.normalizeMetaState(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22, (char) (3440 - ExpandableListView.getPackedPositionChild(0L)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(View.getDefaultSize(0, 0) + 22, KeyEvent.normalizeMetaState(0) + 15, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 39059), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMyPid = (char) (31533 - (Process.myPid() >> 22));
            int tapTimeout = 921 - (ViewConfiguration.getTapTimeout() >> 16);
            int size = View.MeasureSpec.getSize(0) + 28;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c((byte) 52, bArr2[37], bArr2[80], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, tapTimeout, size, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 31533);
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 921;
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 29;
                byte b4 = $$a[80];
                Object[] objArr6 = new Object[1];
                c((byte) 37, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetAfter, minimumFlingVelocity, iLastIndexOf2, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i3 = ~iMaxMemory;
            int i4 = ~(983145815 | i3);
            int i5 = ((((-1936868925) + ((86253568 | i4) * (-712))) + (((~(iMaxMemory | 1069399383)) | (~(i3 | (-86253569)))) * (-712))) + (((-790933829) | i4) * 712)) - 513679932;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            d(36 - TextUtils.lastIndexOf("", '0', 0), ExpandableListView.getPackedPositionType(0L) + 26, (char) KeyEvent.keyCodeFromString(""), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(62 - TextUtils.lastIndexOf("", '0'), 18 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
                int i9 = i8 % 128;
                f405a = i9;
                int i10 = i8 % 2;
                if (applicationContext instanceof ContextWrapper) {
                    int i11 = i9 + 109;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                    int i12 = i11 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            d(Color.blue(0) + 81, 16 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(TextUtils.getOffsetBefore("", 0) + 97, 16 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44784), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -513679932};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[77];
                Object[] objArr13 = new Object[1];
                e(b5, b5, bArr3[5], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr3[5];
                Object[] objArr14 = new Object[1];
                e(b6, b6, bArr3[77], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char offsetAfter2 = (char) (31533 - TextUtils.getOffsetAfter("", 0));
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 922;
                    int packedPositionChild2 = 27 - ExpandableListView.getPackedPositionChild(0L);
                    byte b7 = $$a[80];
                    Object[] objArr15 = new Object[1];
                    c((byte) 37, b7, b7, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetAfter2, packedPositionChild, packedPositionChild2, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    d(ViewConfiguration.getScrollBarFadeDuration() >> 16, 22 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (3440 - TextUtils.lastIndexOf("", '0', 0)), objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    d(View.MeasureSpec.getSize(0) + 22, 15 - (KeyEvent.getMaxKeyCode() >> 16), (char) (39059 - ExpandableListView.getPackedPositionType(0L)), objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char modifierMetaStateMask = (char) (31532 - ((byte) KeyEvent.getModifierMetaStateMask()));
                        int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 921;
                        int iAxisFromString = 27 - MotionEvent.axisFromString("");
                        byte[] bArr4 = $$a;
                        Object[] objArr18 = new Object[1];
                        c((byte) 52, bArr4[37], bArr4[80], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(modifierMetaStateMask, iIndexOf, iAxisFromString, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0'));
                        int minimumFlingVelocity2 = 921 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i13 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[80];
                        byte b9 = bArr5[37];
                        Object[] objArr19 = new Object[1];
                        c(b8, b9, b9, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, minimumFlingVelocity2, i13, -1048449946, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 != i14) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
                f405a = i16 % 128;
                int i17 = i16 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i15));
        }
        int i18 = ((int[]) objArr[0])[0];
        Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int i19 = ~new Random().nextInt(556035373);
        int i20 = i18 + 551003996 + ((~((-16777219) | i19)) * (-783)) + (((~(i19 | 947365741)) | (-826713903)) * 783);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr20[0])[0] = i22 ^ (i22 << 5);
        return this.manufacture;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = b + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ VerifyBiometricRequest copy$default(VerifyBiometricRequest verifyBiometricRequest, String str, String str2, String str3, String str4, String str5, String str6, File file, File file2, File file3, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
        String str13;
        String str14;
        File file4;
        File file5;
        String str15;
        String str16;
        String str17;
        int i2 = 2 % 2;
        int i3 = f405a;
        int i4 = i3 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        String str18 = (i & 1) != 0 ? verifyBiometricRequest.flData : str;
        String str19 = (i & 2) != 0 ? verifyBiometricRequest.brand : str2;
        String str20 = (i & 4) != 0 ? verifyBiometricRequest.deviceId : str3;
        Object obj2 = null;
        if ((i & 8) != 0) {
            int i6 = i3 + 53;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            if (i6 % 2 != 0) {
                String str21 = verifyBiometricRequest.model;
                obj2.hashCode();
                throw null;
            }
            str13 = verifyBiometricRequest.model;
        } else {
            str13 = str4;
        }
        if ((i & 16) != 0) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
            f405a = i7 % 128;
            int i8 = i7 % 2;
            str14 = verifyBiometricRequest.sdk;
        } else {
            str14 = str5;
        }
        String str22 = (i & 32) != 0 ? verifyBiometricRequest.manufacture : str6;
        if ((i & 64) != 0) {
            file4 = verifyBiometricRequest.file;
            int i9 = f405a + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            file4 = file;
        }
        File file6 = (i & 128) != 0 ? verifyBiometricRequest.file2 : file2;
        if ((i & 256) != 0) {
            int i11 = f405a + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
            if (i11 % 2 != 0) {
                file5 = verifyBiometricRequest.file3;
                int i12 = 94 / 0;
            } else {
                file5 = verifyBiometricRequest.file3;
            }
        } else {
            file5 = file3;
        }
        if ((i & 512) != 0) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
            f405a = i13 % 128;
            if (i13 % 2 == 0) {
                String str23 = verifyBiometricRequest.nik;
                obj2.hashCode();
                throw null;
            }
            str15 = verifyBiometricRequest.nik;
        } else {
            str15 = str7;
        }
        String str24 = (i & 1024) != 0 ? verifyBiometricRequest.email : str8;
        String str25 = (i & 2048) != 0 ? verifyBiometricRequest.handphone : str9;
        if ((i & 4096) != 0) {
            int i14 = f405a + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
            int i15 = i14 % 2;
            str16 = verifyBiometricRequest.transactionIdSdk;
        } else {
            str16 = str10;
        }
        if ((i & 8192) != 0) {
            int i16 = f405a + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16 % 128;
            if (i16 % 2 != 0) {
                String str26 = verifyBiometricRequest.scoreLiveness;
                throw null;
            }
            str17 = verifyBiometricRequest.scoreLiveness;
        } else {
            str17 = str11;
        }
        VerifyBiometricRequest verifyBiometricRequestCopy = verifyBiometricRequest.copy(str18, str19, str20, str13, str14, str22, file4, file6, file5, str15, str24, str25, str16, str17, (i & 16384) != 0 ? verifyBiometricRequest.scoreManipulation : str12);
        int i17 = f405a + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 71 / 0;
        }
        return verifyBiometricRequestCopy;
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = f405a;
        int i3 = i2 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.flData;
            int i4 = 55 / 0;
        } else {
            str = this.flData;
        }
        int i5 = i2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = f405a;
        int i3 = i2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.nik;
        int i5 = i2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = f405a + 57;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.email;
        int i4 = i3 + 41;
        f405a = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = f405a + 101;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.handphone;
        int i4 = i3 + 97;
        f405a = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = f405a;
        int i3 = i2 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.transactionIdSdk;
        int i5 = i2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return str;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
        int i3 = i2 % 128;
        f405a = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.scoreLiveness;
        int i4 = i3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
        int i3 = i2 % 128;
        f405a = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.scoreManipulation;
        int i4 = i3 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = f405a;
        int i3 = i2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.brand;
        int i4 = i2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = f405a + 85;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.deviceId;
        int i5 = i3 + 31;
        f405a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 79;
        f405a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.model;
        int i4 = i2 + 87;
        f405a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
        f405a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.sdk;
        }
        throw null;
    }

    public final File component7() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
        int i3 = i2 % 128;
        f405a = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        File file = this.file;
        int i4 = i3 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return file;
        }
        obj.hashCode();
        throw null;
    }

    public final File component8() {
        int i = 2 % 2;
        int i2 = f405a + 61;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        File file = this.file2;
        int i5 = i3 + 7;
        f405a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
        return file;
    }

    public final File component9() {
        File file;
        int i = 2 % 2;
        int i2 = f405a;
        int i3 = i2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            file = this.file3;
            int i4 = 66 / 0;
        } else {
            file = this.file3;
        }
        int i5 = i2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return file;
    }

    public final VerifyBiometricRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, File p6, File p7, File p8, String p9, String p10, String p11, String p12, String p13, String p14) {
        int i = 2 % 2;
        VerifyBiometricRequest verifyBiometricRequest = new VerifyBiometricRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14);
        int i2 = f405a + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return verifyBiometricRequest;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 101;
        f405a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == p0) {
            int i4 = i2 + 107;
            f405a = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(p0 instanceof VerifyBiometricRequest)) {
            return false;
        }
        VerifyBiometricRequest verifyBiometricRequest = (VerifyBiometricRequest) p0;
        if (!Intrinsics.areEqual(this.flData, verifyBiometricRequest.flData) || !Intrinsics.areEqual(this.brand, verifyBiometricRequest.brand) || !Intrinsics.areEqual(this.deviceId, verifyBiometricRequest.deviceId) || (!Intrinsics.areEqual(this.model, verifyBiometricRequest.model)) || !Intrinsics.areEqual(this.sdk, verifyBiometricRequest.sdk)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.manufacture, verifyBiometricRequest.manufacture)) {
            int i6 = f405a + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.file, verifyBiometricRequest.file)) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
            f405a = i8 % 128;
            return i8 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.file2, verifyBiometricRequest.file2) || !Intrinsics.areEqual(this.file3, verifyBiometricRequest.file3)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.nik, verifyBiometricRequest.nik)) {
            int i9 = f405a + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
            return i9 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.email, verifyBiometricRequest.email) || !Intrinsics.areEqual(this.handphone, verifyBiometricRequest.handphone) || !Intrinsics.areEqual(this.transactionIdSdk, verifyBiometricRequest.transactionIdSdk) || !Intrinsics.areEqual(this.scoreLiveness, verifyBiometricRequest.scoreLiveness) || !Intrinsics.areEqual(this.scoreManipulation, verifyBiometricRequest.scoreManipulation)) {
            return false;
        }
        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
        f405a = i10 % 128;
        int i11 = i10 % 2;
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.flData;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.brand;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.deviceId;
        if (str3 == null) {
            int i2 = f405a + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
        }
        String str4 = this.model;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.sdk;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.manufacture;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        File file = this.file;
        int iHashCode9 = file == null ? 0 : file.hashCode();
        File file2 = this.file2;
        int iHashCode10 = file2 == null ? 0 : file2.hashCode();
        File file3 = this.file3;
        int iHashCode11 = file3 == null ? 0 : file3.hashCode();
        String str7 = this.nik;
        int iHashCode12 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.email;
        int iHashCode13 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.handphone;
        if (str9 == null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
            f405a = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str9.hashCode();
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
            f405a = i6 % 128;
            int i7 = i6 % 2;
        }
        String str10 = this.transactionIdSdk;
        int iHashCode14 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.scoreLiveness;
        int iHashCode15 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.scoreManipulation;
        if (str12 != null) {
            int i8 = f405a + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
            int i9 = i8 % 2;
            iHashCode3 = str12.hashCode();
        } else {
            iHashCode3 = 0;
        }
        return (((((((((((((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode2) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode3;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.flData;
        String str2 = this.brand;
        String str3 = this.deviceId;
        String str4 = this.model;
        String str5 = this.sdk;
        String str6 = this.manufacture;
        File file = this.file;
        File file2 = this.file2;
        File file3 = this.file3;
        String str7 = this.nik;
        String str8 = this.email;
        String str9 = this.handphone;
        String str10 = this.transactionIdSdk;
        String str11 = this.scoreLiveness;
        String str12 = this.scoreManipulation;
        StringBuilder sb = new StringBuilder("VerifyBiometricRequest(flData=");
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
        sb.append(", file=");
        sb.append(file);
        sb.append(", file2=");
        sb.append(file2);
        sb.append(", file3=");
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
        sb.append(")");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
        f405a = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{48268, 33525, 49253, 2045, 17754, 33994, 51789, 2553, 20274, 36536, 52319, 5036, 20764, 38752, 55021, 5218, 23520, 39288, 55501, 7744, 23990, 41768, 10602, 5909, 21890, 37405, 53412, 4388, 24495, 40039, 56026, 6984, 23039, 34409, 50414, 668, 17182, 45565, 36740, 52500, 2700, 18475, 35259, 51004, 1160, 16973, 33738, 49520, 7840, 23637, 39425, 56220, 6431, 22154, 37923, 54692, 4903, 20720, 44634, 61386, 11619, 27373, 43134, 45567, 36767, 52482, 2700, 18465, 35260, 50988, 1255, 16988, 33738, 49516, 7911, 23671, 39427, 56220, 6431, 22163, 37924, 45558, 36747, 52486, 2719, 18538, 35262, 51001, 1224, 16971, 33684, 49491, 7927, 23655, 39446, 56205, 6427, 7941, 8574, 25573, 42080, 59072, 10059, 27100, 43567, 60564, 11563, 28547, 45078, 62119, 13565, 30076, 47075};
        TuitionPaymentFragmentbindingInflater1 = 8905148505163468778L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, int r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r8 = r8 * 2
            int r0 = r8 + 1
            byte[] r1 = com.bpjstku.data.registration.general.model.request.VerifyBiometricRequest.$$c
            int r7 = r7 * 3
            int r7 = 115 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r3 = r1[r6]
            r5 = r3
            r3 = r7
            r7 = r5
        L29:
            int r7 = -r7
            int r7 = r7 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.general.model.request.VerifyBiometricRequest.$$g(byte, int, int):java.lang.String");
    }
}
