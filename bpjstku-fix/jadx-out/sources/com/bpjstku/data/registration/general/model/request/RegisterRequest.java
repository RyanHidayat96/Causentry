package com.bpjstku.data.registration.general.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0016J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0016J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0016JÐ\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010\u0003\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b/\u0010\u0016R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0016R\u001c\u00103\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u0010\u0016R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u0010\u0016R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b8\u0010\u0016R\u001c\u00109\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u00101\u001a\u0004\b:\u0010\u0016R\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u0010\u0016R\u001c\u0010=\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u00101\u001a\u0004\b>\u0010\u0016R\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u00101\u001a\u0004\b@\u0010\u0016R\u001c\u0010A\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u00101\u001a\u0004\bB\u0010\u0016R\u001c\u0010C\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u00101\u001a\u0004\bD\u0010\u0016R\u001c\u0010E\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u00101\u001a\u0004\bF\u0010\u0016R\u001c\u0010G\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u00101\u001a\u0004\bH\u0010\u0016R\u001c\u0010I\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u00101\u001a\u0004\bJ\u0010\u0016R\u001c\u0010K\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u00101\u001a\u0004\bL\u0010\u0016R\u001c\u0010M\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u00101\u001a\u0004\bN\u0010\u0016R\u001c\u0010O\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u00101\u001a\u0004\bP\u0010\u0016"}, d2 = {"Lcom/bpjstku/data/registration/general/model/request/RegisterRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/registration/general/model/request/RegisterRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "deviceId", "Ljava/lang/String;", "getDeviceId", "email", "getEmail", "kewarganegaraan", "getKewarganegaraan", "kodeSegmen", "getKodeSegmen", "kpj", "getKpj", "namaTk", "getNamaTk", "nik", "getNik", "noHp", "getNoHp", "passpor", "getPasspor", HintConstants.AUTOFILL_HINT_PASSWORD, "getPassword", "registerId", "getRegisterId", "tglLahir", "getTglLahir", "checkSum", "getCheckSum", "latitude", "getLatitude", "longitude", "getLongitude", PlaceTypes.LOCALITY, "getLocality"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RegisterRequest extends BaseRequest {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long b;

    @SerializedName("checkSum")
    private final String checkSum;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("email")
    private final String email;

    @SerializedName("kewarganegaraan")
    private final String kewarganegaraan;

    @SerializedName("kodeSegmen")
    private final String kodeSegmen;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("latitude")
    private final String latitude;

    @SerializedName(PlaceTypes.LOCALITY)
    private final String locality;

    @SerializedName("longitude")
    private final String longitude;

    @SerializedName("namaTk")
    private final String namaTk;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("noHp")
    private final String noHp;

    @SerializedName("passpor")
    private final String passpor;

    @SerializedName(HintConstants.AUTOFILL_HINT_PASSWORD)
    private final String password;

    @SerializedName("registerId")
    private final String registerId;

    @SerializedName("tglLahir")
    private final String tglLahir;
    private static final byte[] $$c = {93, -77, 2, Base64.padSymbol};
    private static final int $$f = 107;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {119, -102, -34, -3, 16, 2, -59, Base64.padSymbol, 12, 4, -4, 9, -3, -51, 55, 17, -6, 18, 1, -2, -1, -50, 67, -8, 23, -11, 17, -5, -4, 15, -58, 57, 16, 1, 7, 7, -64, 75, 3, -7, 7, 1, 15, -7, 0, 18, -65, 35, 24, 23, -11, 17, -5, -4, 15, -36, 57, -7, -9, 16, 0, -2, -28, 48, 1, 7, 7, 5, -75, 4, 37, 55, 0, -11, 17, 0, -9, 15, -21, 42, -7, 10, -8, 1, 19, -7, -2, -19, 25, 16, -7, 6, 1, -44, 9, -1, 37, -8, 15, -7, 10, 3, -26, 21, 28, -8, -4, 13, 10, -42, 48, -13, 10, 10, -4, 13, 10, 3, 1, -7, 2, 10, -4, 15, 1, 9, 2, 1, 9, -5, 3, 22, -9, 0, 22, -38, 38, -7, 5, 11, -4, 5, 5, -1, 24, -5, 12, -62};
    private static final int $$e = 101;
    private static final byte[] $$a = {82, Base64.padSymbol, -66, -42, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 206;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.data.registration.general.model.request.RegisterRequest.$$a
            int r8 = r8 + 1
            int r9 = r9 * 14
            int r9 = 98 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r3 = r3 + r7
            int r7 = r3 + (-10)
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.general.model.request.RegisterRequest.a(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.bpjstku.data.registration.general.model.request.RegisterRequest.$$d
            int r5 = r5 * 40
            int r5 = 93 - r5
            int r7 = r7 * 15
            int r7 = r7 + 84
            int r6 = r6 + 4
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r6 = r6 + 1
            r4 = r0[r6]
        L28:
            int r7 = r7 + r4
            int r7 = r7 + (-4)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.general.model.request.RegisterRequest.d(short, byte, short, java.lang.Object[]):void");
    }

    public final String getDeviceId() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.deviceId;
        }
        throw null;
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.email;
        int i5 = i2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
        return str;
    }

    public final String getKewarganegaraan() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.kewarganegaraan;
        int i5 = i3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getKodeSegmen() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.kodeSegmen;
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
        return str;
    }

    public final String getKpj() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.kpj;
        }
        throw null;
    }

    public final String getNamaTk() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.namaTk;
        int i4 = i3 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return str;
    }

    public final String getNik() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.nik;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getNoHp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.noHp;
        }
        throw null;
    }

    public final String getPasspor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.passpor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPassword() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.password;
        int i5 = i2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getRegisterId() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.registerId;
        int i5 = i3 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
        return str;
    }

    public final String getTglLahir() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 111;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tglLahir;
        int i5 = i2 + 65;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCheckSum() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 55;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.checkSum;
        int i5 = i2 + 51;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return str;
    }

    public final String getLatitude() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 125;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.latitude;
        int i5 = i3 + 3;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getLongitude() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 3;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.longitude;
        int i5 = i3 + 121;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getLocality() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.locality;
        int i4 = i3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return str;
    }

    public RegisterRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.deviceId = str;
        this.email = str2;
        this.kewarganegaraan = str3;
        this.kodeSegmen = str4;
        this.kpj = str5;
        this.namaTk = str6;
        this.nik = str7;
        this.noHp = str8;
        this.passpor = str9;
        this.password = str10;
        this.registerId = str11;
        this.tglLahir = str12;
        this.checkSum = str13;
        this.latitude = str14;
        this.longitude = str15;
        this.locality = str16;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(b ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 51;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $11 + 53;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64839 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 1355 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 38, 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getTrimmedLength("") + 47773), 468 - View.MeasureSpec.getSize(0), 14 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    public final String component15() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char doubleTapTimeout = (char) (31533 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
            int i4 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 920;
            int iGreen = Color.green(0) + 28;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            byte b3 = bArr[80];
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, i4, iGreen, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{16639, 60980, 16542, 51734, 46083, 44356, 64767, 49618, 53664, 23329, 28079, 21374, 25328, 43243, 57045, 8787, 62230, 14747, 18527, 36181, 1106, 34683, 14647, 7311, 38252, 5219}, ExpandableListView.getPackedPositionType(0L), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{34226, 42130, 34263, 32946, 37048, 37492, 55361, 65248, 5361, 4491, 18708, 27698, 42935, 57951, 64044, 7492, 13899, 29475, 27893}, TextUtils.indexOf("", "", 0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maxKeyCode = (char) (31533 - (KeyEvent.getMaxKeyCode() >> 16));
            int iRed = Color.red(0) + 921;
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 28;
            byte[] bArr2 = $$a;
            byte b4 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b4, (byte) (b4 & 52), bArr2[37], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode, iRed, tapTimeout, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = TuitionPaymentFragmentbindingInflater1 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cGreen = (char) (31533 - Color.green(0));
                int edgeSlop = 921 - (ViewConfiguration.getEdgeSlop() >> 16);
                int mode = View.MeasureSpec.getMode(0) + 28;
                Object[] objArr6 = new Object[1];
                a((byte) ($$b >>> 2), (byte) 37, $$a[37], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen, edgeSlop, mode, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iMyUid = Process.myUid();
            int i7 = 1438119349 + (((~((-705582885) | iMyUid)) | (~((~iMyUid) | 1068496759))) * (-318)) + (((~(772765476 | iMyUid)) | 295731283) * (-318)) + (((~(iMyUid | (-772765477))) | (-1001314168)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 1076721865;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{61420, 7589, 61325, 14727, 64444, 37874, 45888, 65380, 32435, 43184, 8720, 28104, 52717, 23417, 37172, 7320, 23613, 51738, 2016, 46063, 43866, 29888, 30352, 8751, 14920, 59377, 58694, 53571, 34989, 38573}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{10841, 55175, 10810, 62398, 59001, 30303, 44691, 6857, 47884, 25237, 16325, 34826, 2121, 37211, 36077, 63858, 39338, ':', 6693, 22082, 28406, 48869}, Process.myPid() >> 22, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
                TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                if (i10 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    throw null;
                }
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{1987, 52432, 1961, 59645, 62709, 3711, 48155, 25338, 38621, 31168, 11612, 61445, 9668, 35410, 40542, 33090, 46112, 7032, 2232, 11878}, (-1) - TextUtils.lastIndexOf("", '0', 0, 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{47458, 6548, 47371, 15804, 64470, 26223, 45867, 2789, 10278, 44161, 8810, 38914, 39754, 24409, 37213, 59715, 2737, 52775, 1946, 18046}, Color.green(0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
            TuitionPaymentFragmentbindingInflater1 = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1076721865};
                byte[] bArr3 = $$d;
                Object[] objArr13 = new Object[1];
                d(bArr3[44], bArr3[20], bArr3[18], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = bArr3[18];
                Object[] objArr14 = new Object[1];
                d(b5, (byte) (b5 | 90), bArr3[44], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char deadChar = (char) (31533 - KeyEvent.getDeadChar(0, 0));
                    int defaultSize = View.getDefaultSize(0, 0) + 921;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 29;
                    Object[] objArr15 = new Object[1];
                    a((byte) ($$b >>> 2), (byte) 37, $$a[37], objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(deadChar, defaultSize, iIndexOf, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    c(new char[]{16639, 60980, 16542, 51734, 46083, 44356, 64767, 49618, 53664, 23329, 28079, 21374, 25328, 43243, 57045, 8787, 62230, 14747, 18527, 36181, 1106, 34683, 14647, 7311, 38252, 5219}, (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(new char[]{34226, 42130, 34263, 32946, 37048, 37492, 55361, 65248, 5361, 4491, 18708, 27698, 42935, 57951, 64044, 7492, 13899, 29475, 27893}, '0' - AndroidCharacter.getMirror('0'), objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cAlpha = (char) (Color.alpha(0) + 31533);
                        int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 921;
                        int deadChar2 = KeyEvent.getDeadChar(0, 0) + 28;
                        byte[] bArr4 = $$a;
                        byte b6 = bArr4[7];
                        Object[] objArr18 = new Object[1];
                        a(b6, (byte) (b6 & 52), bArr4[37], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha, doubleTapTimeout2, deadChar2, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 31534);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 921;
                        int gidForName = Process.getGidForName("") + 29;
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[7];
                        byte b8 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        a(b7, b8, b8, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionChild, packedPositionGroup, gidForName, -1048449946, false, (String) objArr19[0], null);
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i16 = ~iIdentityHashCode;
            int i17 = i15 + 1046133038 + ((~((-1146250286) | i16)) * 979) + ((iIdentityHashCode | 627829358) * (-979)) + (((~(iIdentityHashCode | (-1146250286))) | (~(i16 | 627829358))) * 979);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr20[0])[0] = i19 ^ (i19 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            int i20 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i21 = ~iUptimeMillis;
            int i22 = i20 + 1643971939 + (((~(857284453 | i21)) | 77864978) * (-108)) + (((~(i21 | 916795190)) | (~((-916795191) | iUptimeMillis)) | 18354241) * 54) + ((iUptimeMillis | 18354241) * 54);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr21[0])[0] = i24 ^ (i24 << 5);
            int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
            TuitionPaymentFragmentbindingInflater1 = i25 % 128;
            int i26 = i25 % 2;
        }
        return this.longitude;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ RegisterRequest copy$default(RegisterRequest registerRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, Object obj) {
        String str17;
        String str18;
        String str19;
        String str20;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            str17 = registerRequest.deviceId;
        } else {
            str17 = str;
        }
        String str21 = (i & 2) != 0 ? registerRequest.email : str2;
        String str22 = (i & 4) != 0 ? registerRequest.kewarganegaraan : str3;
        String str23 = (i & 8) != 0 ? registerRequest.kodeSegmen : str4;
        String str24 = (i & 16) != 0 ? registerRequest.kpj : str5;
        Object obj2 = null;
        if ((i & 32) != 0) {
            int i5 = TuitionPaymentFragmentbindingInflater1 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 == 0) {
                String str25 = registerRequest.namaTk;
                obj2.hashCode();
                throw null;
            }
            str18 = registerRequest.namaTk;
        } else {
            str18 = str6;
        }
        String str26 = (i & 64) != 0 ? registerRequest.nik : str7;
        String str27 = (i & 128) != 0 ? registerRequest.noHp : str8;
        String str28 = (i & 256) != 0 ? registerRequest.passpor : str9;
        String str29 = (i & 512) != 0 ? registerRequest.password : str10;
        String str30 = (i & 1024) != 0 ? registerRequest.registerId : str11;
        String str31 = (i & 2048) != 0 ? registerRequest.tglLahir : str12;
        String str32 = (i & 4096) != 0 ? registerRequest.checkSum : str13;
        if ((i & 8192) != 0) {
            int i6 = TuitionPaymentFragmentbindingInflater1 + 53;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            if (i6 % 2 == 0) {
                String str33 = registerRequest.latitude;
                throw null;
            }
            str19 = registerRequest.latitude;
        } else {
            str19 = str14;
        }
        if ((i & 16384) != 0) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
            TuitionPaymentFragmentbindingInflater1 = i7 % 128;
            int i8 = i7 % 2;
            str20 = registerRequest.longitude;
        } else {
            str20 = str15;
        }
        return registerRequest.copy(str17, str21, str22, str23, str24, str18, str26, str27, str28, str29, str30, str31, str32, str19, str20, (i & 32768) != 0 ? registerRequest.locality : str16);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.deviceId;
        int i5 = i2 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 80 / 0;
        }
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 77;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.password;
        int i5 = i3 + 13;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 105;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.registerId;
        int i5 = i3 + 35;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.tglLahir;
        }
        throw null;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 67;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.checkSum;
        int i5 = i2 + 99;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.latitude;
        int i5 = i2 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 89;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.locality;
        int i5 = i3 + 33;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 97;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.email;
        int i4 = i2 + 55;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 15;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.kewarganegaraan;
        int i5 = i2 + 75;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 95;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.kodeSegmen;
        int i5 = i3 + 103;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.kpj;
        int i4 = i3 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.namaTk;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.nik;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.noHp;
        int i5 = i3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 11;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.passpor;
        int i5 = i2 + 69;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RegisterRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15) {
        int i = 2 % 2;
        RegisterRequest registerRequest = new RegisterRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return registerRequest;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) p0;
        if (!Intrinsics.areEqual(this.deviceId, registerRequest.deviceId) || !Intrinsics.areEqual(this.email, registerRequest.email) || (!Intrinsics.areEqual(this.kewarganegaraan, registerRequest.kewarganegaraan))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.kodeSegmen, registerRequest.kodeSegmen)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.kpj, registerRequest.kpj) || !Intrinsics.areEqual(this.namaTk, registerRequest.namaTk) || !Intrinsics.areEqual(this.nik, registerRequest.nik) || !Intrinsics.areEqual(this.noHp, registerRequest.noHp)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.passpor, registerRequest.passpor)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.password, registerRequest.password)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.registerId, registerRequest.registerId)) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i7 = i6 + 91;
            TuitionPaymentFragmentbindingInflater1 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 85;
            TuitionPaymentFragmentbindingInflater1 = i9 % 128;
            if (i9 % 2 == 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.tglLahir, registerRequest.tglLahir) || !Intrinsics.areEqual(this.checkSum, registerRequest.checkSum)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.latitude, registerRequest.latitude)) {
            int i10 = TuitionPaymentFragmentbindingInflater1 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.longitude, registerRequest.longitude)) {
            int i12 = TuitionPaymentFragmentbindingInflater1 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.locality, registerRequest.locality)) {
            return true;
        }
        int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        TuitionPaymentFragmentbindingInflater1 = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i;
        int i2 = 2 % 2;
        String str = this.deviceId;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.email;
        if (str2 == null) {
            int i3 = TuitionPaymentFragmentbindingInflater1 + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.kewarganegaraan;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.kodeSegmen;
        if (str4 == null) {
            int i5 = TuitionPaymentFragmentbindingInflater1 + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.kpj;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.namaTk;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.nik;
        if (str7 == null) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
            TuitionPaymentFragmentbindingInflater1 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str7.hashCode();
        }
        String str8 = this.noHp;
        int iHashCode10 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.passpor;
        if (str9 == null) {
            int i9 = TuitionPaymentFragmentbindingInflater1 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
            int i10 = i9 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str9.hashCode();
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
            TuitionPaymentFragmentbindingInflater1 = i11 % 128;
            int i12 = i11 % 2;
        }
        String str10 = this.password;
        if (str10 == null) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
            int i14 = i13 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str10.hashCode();
        }
        String str11 = this.registerId;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.tglLahir;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.checkSum;
        if (str13 == null) {
            i = 0;
        } else {
            int iHashCode13 = str13.hashCode();
            int i15 = TuitionPaymentFragmentbindingInflater1 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
            int i16 = i15 % 2;
            i = iHashCode13;
        }
        String str14 = this.latitude;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.longitude;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.locality;
        return (((((((((((((((((((((((((((((iHashCode6 * 31) + iHashCode) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode3) * 31) + iHashCode10) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + i) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (str16 != null ? str16.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.deviceId;
        String str2 = this.email;
        String str3 = this.kewarganegaraan;
        String str4 = this.kodeSegmen;
        String str5 = this.kpj;
        String str6 = this.namaTk;
        String str7 = this.nik;
        String str8 = this.noHp;
        String str9 = this.passpor;
        String str10 = this.password;
        String str11 = this.registerId;
        String str12 = this.tglLahir;
        String str13 = this.checkSum;
        String str14 = this.latitude;
        String str15 = this.longitude;
        String str16 = this.locality;
        StringBuilder sb = new StringBuilder("RegisterRequest(deviceId=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", kewarganegaraan=");
        sb.append(str3);
        sb.append(", kodeSegmen=");
        sb.append(str4);
        sb.append(", kpj=");
        sb.append(str5);
        sb.append(", namaTk=");
        sb.append(str6);
        sb.append(", nik=");
        sb.append(str7);
        sb.append(", noHp=");
        sb.append(str8);
        sb.append(", passpor=");
        sb.append(str9);
        sb.append(", password=");
        sb.append(str10);
        sb.append(", registerId=");
        sb.append(str11);
        sb.append(", tglLahir=");
        sb.append(str12);
        sb.append(", checkSum=");
        sb.append(str13);
        sb.append(", latitude=");
        sb.append(str14);
        sb.append(", longitude=");
        sb.append(str15);
        sb.append(", locality=");
        sb.append(str16);
        sb.append(")");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
        }
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        b = 1522280446564617770L;
    }

    private static String $$g(short s, byte b2, short s2) {
        int i = 3 - (b2 * 3);
        byte[] bArr = $$c;
        int i2 = 107 - (s * 2);
        int i3 = s2 * 2;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 += i3;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i2;
            i++;
            if (i4 == i3) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i];
        }
    }
}
