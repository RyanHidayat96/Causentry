package com.bpjstku.data.multibiller.model.response;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.core.Constants;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0014J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0014J¸\u0001\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020$2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b*\u0010\u0014R$\u0010+\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010/R$\u00100\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010,\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010/R$\u00103\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010,\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u0010/R$\u00106\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010,\u001a\u0004\b7\u0010\u0014\"\u0004\b8\u0010/R$\u00109\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010,\u001a\u0004\b:\u0010\u0014\"\u0004\b;\u0010/R$\u0010<\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010,\u001a\u0004\b=\u0010\u0014\"\u0004\b>\u0010/R$\u0010?\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010,\u001a\u0004\b@\u0010\u0014\"\u0004\bA\u0010/R$\u0010B\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010,\u001a\u0004\bC\u0010\u0014\"\u0004\bD\u0010/R$\u0010E\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u0010,\u001a\u0004\bF\u0010\u0014\"\u0004\bG\u0010/R$\u0010H\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010,\u001a\u0004\bI\u0010\u0014\"\u0004\bJ\u0010/R$\u0010K\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010,\u001a\u0004\bL\u0010\u0014\"\u0004\bM\u0010/R$\u0010N\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010,\u001a\u0004\bO\u0010\u0014\"\u0004\bP\u0010/R$\u0010Q\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u0010,\u001a\u0004\bR\u0010\u0014\"\u0004\bS\u0010/R$\u0010T\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010,\u001a\u0004\bU\u0010\u0014\"\u0004\bV\u0010/"}, d2 = {"Lcom/bpjstku/data/multibiller/model/response/MultiBillerAuthTransactionItem;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/multibiller/model/response/MultiBillerAuthTransactionItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", NotificationCompat.CATEGORY_STATUS, "Ljava/lang/String;", "getStatus", "setStatus", "(Ljava/lang/String;)V", "createdAt", "getCreatedAt", "setCreatedAt", "updatedAt", "getUpdatedAt", "setUpdatedAt", "transactionId", "getTransactionId", "setTransactionId", "customerBillId", "getCustomerBillId", "setCustomerBillId", "merchantId", "getMerchantId", "setMerchantId", "deepUrl", "getDeepUrl", "setDeepUrl", "redirectUrl", "getRedirectUrl", "setRedirectUrl", "callbackUrl", "getCallbackUrl", "setCallbackUrl", "transactionStatus", "getTransactionStatus", "setTransactionStatus", "paymentStatus", "getPaymentStatus", "setPaymentStatus", "tokenMotion", "getTokenMotion", "setTokenMotion", "authMotion", "getAuthMotion", "setAuthMotion", "extTransactionRef", "getExtTransactionRef", "setExtTransactionRef"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MultiBillerAuthTransactionItem {
    public static final int $stable = 8;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int[] b;

    @SerializedName("auth_motion_pay")
    private String authMotion;

    @SerializedName("callback_url")
    private String callbackUrl;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("customer_bill_id")
    private String customerBillId;

    @SerializedName("deep_link")
    private String deepUrl;

    @SerializedName("ext_transaction_ref")
    private String extTransactionRef;

    @SerializedName("merchant_id")
    private String merchantId;

    @SerializedName("payment_status")
    private String paymentStatus;

    @SerializedName(Constants.WEBVIEW_REDIRECT_URL)
    private String redirectUrl;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private String status;

    @SerializedName("token_motion_pay")
    private String tokenMotion;

    @SerializedName(FirebaseAnalytics.Param.TRANSACTION_ID)
    private String transactionId;

    @SerializedName("transaction_status")
    private String transactionStatus;

    @SerializedName("updated_at")
    private String updatedAt;
    private static final byte[] $$c = {55, -64, 35, -71};
    private static final int $$d = 112;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {31, -3, -46, 11, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 69;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r7 = 55 - r7
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r0 = com.bpjstku.data.multibiller.model.response.MultiBillerAuthTransactionItem.$$a
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.multibiller.model.response.MultiBillerAuthTransactionItem.a(short, int, short, java.lang.Object[]):void");
    }

    public MultiBillerAuthTransactionItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.status = str;
        this.createdAt = str2;
        this.updatedAt = str3;
        this.transactionId = str4;
        this.customerBillId = str5;
        this.merchantId = str6;
        this.deepUrl = str7;
        this.redirectUrl = str8;
        this.callbackUrl = str9;
        this.transactionStatus = str10;
        this.paymentStatus = str11;
        this.tokenMotion = str12;
        this.authMotion = str13;
        this.extTransactionRef = str14;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.status;
        int i4 = i2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
        return str;
    }

    public final void setStatus(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        this.status = str;
        int i5 = i3 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final String getCreatedAt() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.createdAt;
        int i4 = i3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final void setCreatedAt(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        this.createdAt = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
    }

    public final String getUpdatedAt() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.updatedAt;
            int i4 = 42 / 0;
        } else {
            str = this.updatedAt;
        }
        int i5 = i2 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setUpdatedAt(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        this.updatedAt = str;
        int i5 = i2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTransactionId() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.transactionId;
        int i5 = i2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setTransactionId(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.transactionId = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getCustomerBillId() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.customerBillId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setCustomerBillId(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.customerBillId = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMerchantId() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        if (i2 % 2 != 0) {
            str = this.merchantId;
            int i4 = 2 / 0;
        } else {
            str = this.merchantId;
        }
        int i5 = i3 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setMerchantId(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        this.merchantId = str;
        int i5 = i3 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getDeepUrl() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.deepUrl;
        int i4 = i3 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setDeepUrl(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.deepUrl = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
    }

    public final String getRedirectUrl() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.redirectUrl;
        }
        throw null;
    }

    public final void setRedirectUrl(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        this.redirectUrl = str;
        int i5 = i2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getCallbackUrl() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.callbackUrl;
        int i5 = i2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setCallbackUrl(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        this.callbackUrl = str;
        int i5 = i3 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final String getTransactionStatus() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.transactionStatus;
        int i5 = i3 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 46 / 0;
        }
        return str;
    }

    public final void setTransactionStatus(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.transactionStatus = str;
        int i5 = i2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getPaymentStatus() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.paymentStatus;
        int i5 = i3 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setPaymentStatus(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.paymentStatus = str;
        int i5 = i2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final String getTokenMotion() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.tokenMotion;
        int i5 = i3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3;
        int length2;
        int[] iArr3;
        int i4 = 2;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = b;
        int i6 = -1870535734;
        int i7 = 1;
        int i8 = 0;
        if (iArr4 != null) {
            int i9 = $10 + 45;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length2 = iArr4.length;
                iArr3 = new int[length2];
            } else {
                length2 = iArr4.length;
                iArr3 = new int[length2];
            }
            int i10 = 0;
            while (i10 < length2) {
                int i11 = $10 + 117;
                $11 = i11 % 128;
                int i12 = i11 % i4;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr4[i10])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3291, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 31, 1948206109, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i10++;
                    i4 = 2;
                    i6 = -1870535734;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr3;
        }
        int length3 = iArr4.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = b;
        if (iArr6 != null) {
            int i13 = $10 + 45;
            int i14 = i13 % 128;
            $11 = i14;
            if (i13 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            int i15 = i14 + 79;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 3 / 5;
            }
            while (i3 < length) {
                Object[] objArr3 = new Object[i7];
                objArr3[i8] = Integer.valueOf(iArr6[i3]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cResolveSize = (char) View.resolveSize(i8, i8);
                    int packedPositionType = 3291 - ExpandableListView.getPackedPositionType(0L);
                    int iMakeMeasureSpec = 31 - View.MeasureSpec.makeMeasureSpec(i8, i8);
                    byte b4 = (byte) i8;
                    byte b5 = (byte) (b4 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize, packedPositionType, iMakeMeasureSpec, 1948206109, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                }
                iArr2[i3] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i3++;
                i7 = 1;
                i8 = 0;
            }
            i2 = i8;
            iArr6 = iArr2;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length3);
        int i17 = 2;
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i18 = $11 + 15;
            $10 = i18 % 128;
            int i19 = i18 % i17;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i20 = $11 + 43;
            $10 = i20 % 128;
            int i21 = i20 % 2;
            int i22 = 17;
            while (i22 > 1) {
                int i23 = $10 + 39;
                $11 = i23 % 128;
                int i24 = i23 % 2;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i22];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.indexOf("", ""), 2559 - (Process.myPid() >> 22), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 29, 683220507, false, $$e(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i22--;
                int i25 = $11 + 23;
                $10 = i25 % 128;
                int i26 = i25 % 2;
            }
            int i27 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i27;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i28 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 28878), 348 - Color.green(0), 24 - Process.getGidForName(""), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i17 = 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public final void setTokenMotion(String str) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
            int keyRepeatDelay = 651 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int iResolveSize = 44 - View.resolveSize(0, 0);
            byte b2 = $$a[80];
            Object[] objArr2 = new Object[1];
            a((byte) 52, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, keyRepeatDelay, iResolveSize, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{-760070964, -201033598, 2040009210, 1579737120, -965758750, 633697153, 2059474683, 957689437, -137433484, -105095131, -45546643, -203372977, 1400987867, 482447548}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{346073054, -1062794468, 147148850, -1655202329, 1545258193, -348486556, -620860413, -748708509, 1954566100, -653800178}, ((byte) KeyEvent.getModifierMetaStateMask()) + 16, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int iIndexOf = 651 - TextUtils.indexOf("", "");
            int i2 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44;
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            a(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iIndexOf, i2, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 651;
                int gidForName = 43 - Process.getGidForName("");
                byte[] bArr = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) 37, bArr[7], bArr[80], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, edgeSlop, gidForName, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i3 = ((int[]) objArr7[2])[0];
            int i4 = ((int[]) objArr7[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = 1716680019 + ((iIdentityHashCode | 663092991) * (-50));
            int i6 = ~((-8673947) | iIdentityHashCode);
            int i7 = ~iIdentityHashCode;
            int i8 = ((i5 + ((i6 | (~(668336127 | i7))) * 50)) + (((~(i7 | 663092991)) | ((~(659662181 | i7)) | (-668336128))) * 50)) - 780233930;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[3])[0] = i10 ^ (i10 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), 1610 - (ViewConfiguration.getScrollBarSize() >> 8), 26 - View.MeasureSpec.makeMeasureSpec(0, 0), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -780233930, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iResolveSize2 = 651 - View.resolveSize(0, 0);
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 44;
                    byte b5 = $$a[7];
                    byte b6 = b5;
                    Object[] objArr9 = new Object[1];
                    a(b5, b6, b6, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iResolveSize2, capsMode, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.indexOf("", "", 0, 0), 694 - ImageFormat.getBitsPerPixel(0), View.resolveSizeAndState(0, 0, 0) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 63406), (ViewConfiguration.getJumpTapTimeout() >> 16) + 793, 82 - ExpandableListView.getPackedPositionChild(0L)), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 651;
                    int maximumFlingVelocity = 44 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte[] bArr2 = $$a;
                    Object[] objArr10 = new Object[1];
                    a((byte) 37, bArr2[7], bArr2[80], objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout, scrollBarSize2, maximumFlingVelocity, -1595579076, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    c(new int[]{-760070964, -201033598, 2040009210, 1579737120, -965758750, 633697153, 2059474683, 957689437, -137433484, -105095131, -45546643, -203372977, 1400987867, 482447548}, 22 - Color.red(0), objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(new int[]{346073054, -1062794468, 147148850, -1655202329, 1545258193, -348486556, -620860413, -748708509, 1954566100, -653800178}, 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c3 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 651;
                        int mirror = AndroidCharacter.getMirror('0') - 4;
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr13 = new Object[1];
                        a(b7, b8, b8, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, maximumFlingVelocity2, mirror, -873460649, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c4 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 652;
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 44;
                        byte b9 = $$a[80];
                        Object[] objArr14 = new Object[1];
                        a((byte) 52, b9, b9, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c4, iLastIndexOf, windowTouchSlop, -459846511, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i11 = ((int[]) objArr[0])[0];
        int i12 = ((int[]) objArr[2])[0];
        if (i12 == i11) {
            Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i13 = ((int[]) objArr[3])[0];
            int i14 = ((int[]) objArr[2])[0];
            int i15 = ((int[]) objArr[0])[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i16 = i13 + 1718429737 + (((~((-1013060014) | iIdentityHashCode2)) | 4325804) * 1504) + ((~(iIdentityHashCode2 | (-1008734210))) * (-1504)) + 368926448;
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr15[3])[0] = i18 ^ (i18 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
                int i20 = 2;
                int i21 = i19 % 2;
                int i22 = 0;
                while (i22 < strArr.length) {
                    int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 % 128;
                    if (i23 % i20 == 0) {
                        arrayList.add(strArr[i22]);
                        i22 += 100;
                    } else {
                        arrayList.add(strArr[i22]);
                        i22++;
                    }
                    i20 = 2;
                }
            }
            int[] iArr = new int[i12];
            int i24 = i12 - 1;
            iArr[i24] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i24) % 2) - 1], 1).show();
            Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i25 = ((int[]) objArr[3])[0];
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[0])[0];
            int i28 = ~System.identityHashCode(this);
            int i29 = i25 + (-1450826635) + (((~((-1312433) | i28)) | 4743242) * (-828)) + ((i28 | (-1312433)) * (-828)) + 1086693696;
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr16[3])[0] = i31 ^ (i31 << 5);
        }
        this.tokenMotion = str;
    }

    public final String getAuthMotion() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.authMotion;
        int i4 = i3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setAuthMotion(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.authMotion = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public final String getExtTransactionRef() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.extTransactionRef;
        int i4 = i3 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setExtTransactionRef(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        this.extTransactionRef = str;
        int i5 = i3 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        b();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ MultiBillerAuthTransactionItem copy$default(MultiBillerAuthTransactionItem multiBillerAuthTransactionItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, Object obj) {
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str15 = multiBillerAuthTransactionItem.status;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            str15 = str;
        }
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 != 0) {
                String str21 = multiBillerAuthTransactionItem.createdAt;
                obj2.hashCode();
                throw null;
            }
            str16 = multiBillerAuthTransactionItem.createdAt;
        } else {
            str16 = str2;
        }
        String str22 = (i & 4) != 0 ? multiBillerAuthTransactionItem.updatedAt : str3;
        String str23 = (i & 8) != 0 ? multiBillerAuthTransactionItem.transactionId : str4;
        String str24 = (i & 16) != 0 ? multiBillerAuthTransactionItem.customerBillId : str5;
        String str25 = (i & 32) != 0 ? multiBillerAuthTransactionItem.merchantId : str6;
        if ((i & 64) != 0) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            int i7 = i6 % 2;
            str17 = multiBillerAuthTransactionItem.deepUrl;
        } else {
            str17 = str7;
        }
        if ((i & 128) != 0) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            if (i8 % 2 == 0) {
                String str26 = multiBillerAuthTransactionItem.redirectUrl;
                obj2.hashCode();
                throw null;
            }
            str18 = multiBillerAuthTransactionItem.redirectUrl;
        } else {
            str18 = str8;
        }
        String str27 = (i & 256) != 0 ? multiBillerAuthTransactionItem.callbackUrl : str9;
        String str28 = (i & 512) != 0 ? multiBillerAuthTransactionItem.transactionStatus : str10;
        String str29 = (i & 1024) != 0 ? multiBillerAuthTransactionItem.paymentStatus : str11;
        if ((i & 2048) != 0) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
            if (i9 % 2 != 0) {
                String str30 = multiBillerAuthTransactionItem.tokenMotion;
                throw null;
            }
            str19 = multiBillerAuthTransactionItem.tokenMotion;
        } else {
            str19 = str12;
        }
        if ((i & 4096) != 0) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
            if (i10 % 2 != 0) {
                String str31 = multiBillerAuthTransactionItem.authMotion;
                throw null;
            }
            str20 = multiBillerAuthTransactionItem.authMotion;
        } else {
            str20 = str13;
        }
        return multiBillerAuthTransactionItem.copy(str15, str16, str22, str23, str24, str25, str17, str18, str27, str28, str29, str19, str20, (i & 8192) != 0 ? multiBillerAuthTransactionItem.extTransactionRef : str14);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.status;
        int i4 = i3 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.transactionStatus;
        int i4 = i2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.paymentStatus;
        int i4 = i3 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return str;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.tokenMotion;
        int i5 = i3 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.authMotion;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.extTransactionRef;
        int i5 = i3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 33 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.createdAt;
        int i4 = i2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.updatedAt;
        int i5 = i3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.transactionId;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.customerBillId;
        int i4 = i3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.merchantId;
        int i5 = i3 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.deepUrl;
        int i5 = i2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.redirectUrl;
        int i5 = i3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.callbackUrl;
        }
        throw null;
    }

    public final MultiBillerAuthTransactionItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13) {
        int i = 2 % 2;
        MultiBillerAuthTransactionItem multiBillerAuthTransactionItem = new MultiBillerAuthTransactionItem(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return multiBillerAuthTransactionItem;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MultiBillerAuthTransactionItem)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        MultiBillerAuthTransactionItem multiBillerAuthTransactionItem = (MultiBillerAuthTransactionItem) p0;
        if (!Intrinsics.areEqual(this.status, multiBillerAuthTransactionItem.status)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.createdAt, multiBillerAuthTransactionItem.createdAt)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            return i4 % 2 != 0;
        }
        if ((!Intrinsics.areEqual(this.updatedAt, multiBillerAuthTransactionItem.updatedAt)) || !Intrinsics.areEqual(this.transactionId, multiBillerAuthTransactionItem.transactionId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.customerBillId, multiBillerAuthTransactionItem.customerBillId)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.merchantId, multiBillerAuthTransactionItem.merchantId)) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.deepUrl, multiBillerAuthTransactionItem.deepUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.redirectUrl, multiBillerAuthTransactionItem.redirectUrl)) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.callbackUrl, multiBillerAuthTransactionItem.callbackUrl) || !Intrinsics.areEqual(this.transactionStatus, multiBillerAuthTransactionItem.transactionStatus)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.paymentStatus, multiBillerAuthTransactionItem.paymentStatus)) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.tokenMotion, multiBillerAuthTransactionItem.tokenMotion)) {
            return false;
        }
        if (Intrinsics.areEqual(this.authMotion, multiBillerAuthTransactionItem.authMotion)) {
            return Intrinsics.areEqual(this.extTransactionRef, multiBillerAuthTransactionItem.extTransactionRef);
        }
        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.status;
        if (str == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.createdAt;
        if (str2 == null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.updatedAt;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.transactionId;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.customerBillId;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.merchantId;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.deepUrl;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.redirectUrl;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.callbackUrl;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.transactionStatus;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.paymentStatus;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.tokenMotion;
        int iHashCode13 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.authMotion;
        if (str13 == null) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str13.hashCode();
        }
        String str14 = this.extTransactionRef;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode3) * 31) + (str14 != null ? str14.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.status;
        String str2 = this.createdAt;
        String str3 = this.updatedAt;
        String str4 = this.transactionId;
        String str5 = this.customerBillId;
        String str6 = this.merchantId;
        String str7 = this.deepUrl;
        String str8 = this.redirectUrl;
        String str9 = this.callbackUrl;
        String str10 = this.transactionStatus;
        String str11 = this.paymentStatus;
        String str12 = this.tokenMotion;
        String str13 = this.authMotion;
        String str14 = this.extTransactionRef;
        StringBuilder sb = new StringBuilder("MultiBillerAuthTransactionItem(status=");
        sb.append(str);
        sb.append(", createdAt=");
        sb.append(str2);
        sb.append(", updatedAt=");
        sb.append(str3);
        sb.append(", transactionId=");
        sb.append(str4);
        sb.append(", customerBillId=");
        sb.append(str5);
        sb.append(", merchantId=");
        sb.append(str6);
        sb.append(", deepUrl=");
        sb.append(str7);
        sb.append(", redirectUrl=");
        sb.append(str8);
        sb.append(", callbackUrl=");
        sb.append(str9);
        sb.append(", transactionStatus=");
        sb.append(str10);
        sb.append(", paymentStatus=");
        sb.append(str11);
        sb.append(", tokenMotion=");
        sb.append(str12);
        sb.append(", authMotion=");
        sb.append(str13);
        sb.append(", extTransactionRef=");
        sb.append(str14);
        sb.append(")");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void b() {
        b = new int[]{803126811, -1806999804, -2107483582, 1778547563, -455090072, 560506910, 2097667870, 176355506, -509292865, -383419792, -594680441, 191328433, 1107087760, 1078871422, -1262593719, 1674148534, 996520630, -1515372631};
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
    private static java.lang.String $$e(int r7, byte r8, int r9) {
        /*
            int r9 = r9 * 2
            int r9 = 1 - r9
            int r8 = r8 * 56
            int r8 = 122 - r8
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.data.multibiller.model.response.MultiBillerAuthTransactionItem.$$c
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r5 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r7]
            r6 = r3
            r3 = r8
            r8 = r6
        L29:
            int r8 = -r8
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.multibiller.model.response.MultiBillerAuthTransactionItem.$$e(int, byte, int):java.lang.String");
    }
}
