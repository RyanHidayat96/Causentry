package com.bpjstku.data.vocation.model.request;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
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
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import defpackage.EncoderImplByteBufferInput;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0010\u0010#\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0010\u0010%\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0010\u0010&\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0010\u0010'\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b'\u0010\u0019J\u0010\u0010(\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b(\u0010\u0019J\u0010\u0010)\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b*\u0010\u0019J\u0010\u0010+\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b+\u0010\u0019JÎ\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010\u0003\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b5\u0010\u0019R\u001a\u00106\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u0019R\u001a\u00109\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b:\u0010\u0019R\u001a\u0010;\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u0010\u0019R\u001a\u0010=\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u00107\u001a\u0004\b>\u0010\u0019R\u001a\u0010?\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u00107\u001a\u0004\b@\u0010\u0019R\u001a\u0010A\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u0010\u0019R\u001a\u0010C\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u00107\u001a\u0004\bD\u0010\u0019R\u001a\u0010E\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u00107\u001a\u0004\bF\u0010\u0019R\u001a\u0010G\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u00107\u001a\u0004\bH\u0010\u0019R\u001a\u0010I\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u00107\u001a\u0004\bJ\u0010\u0019R\u001a\u0010K\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u00107\u001a\u0004\bL\u0010\u0019R\u001a\u0010M\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u00107\u001a\u0004\bN\u0010\u0019R\u001a\u0010O\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u00107\u001a\u0004\bP\u0010\u0019R\u001a\u0010Q\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u00107\u001a\u0004\bR\u0010\u0019R\u001a\u0010S\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bS\u00107\u001a\u0004\bT\u0010\u0019R\u001a\u0010U\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bU\u00107\u001a\u0004\bV\u0010\u0019R\u001a\u0010W\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bW\u00107\u001a\u0004\bX\u0010\u0019R\u001a\u0010Y\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bY\u00107\u001a\u0004\bZ\u0010\u0019R\u001a\u0010[\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u00107\u001a\u0004\b\\\u0010\u0019"}, d2 = {"Lcom/bpjstku/data/vocation/model/request/VocationRegisterRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/vocation/model/request/VocationRegisterRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", PlaceTypes.ADDRESS, "Ljava/lang/String;", "getAddress", "accountBank", "getAccountBank", "email", "getEmail", HintConstants.AUTOFILL_HINT_GENDER, "getGender", "iksBlkDetilCode", "getIksBlkDetilCode", "trainingCode", "getTrainingCode", "tkCode", "getTkCode", "kpj", "getKpj", "name", "getName", "bankBranchOfficeName", "getBankBranchOfficeName", "accountName", "getAccountName", "nik", "getNik", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "getPhoneNumber", "accountNumber", "getAccountNumber", "npwp", "getNpwp", "formalEducation", "getFormalEducation", "nonFormalEducation", "getNonFormalEducation", "wagePreference", "getWagePreference", "birthdate", "getBirthdate"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class VocationRegisterRequest extends BaseRequest {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 0;
    private static long TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @SerializedName("bankRekening")
    private final String accountBank;

    @SerializedName("namaDalamRekening")
    private final String accountName;

    @SerializedName("noRekening")
    private final String accountNumber;

    @SerializedName("alamat")
    private final String address;

    @SerializedName("namaCabangBank")
    private final String bankBranchOfficeName;

    @SerializedName("tglLahir")
    private final String birthdate;

    @SerializedName("email")
    private final String email;

    @SerializedName("pendidikanFormal")
    private final String formalEducation;

    @SerializedName("jenisKelamin")
    private final String gender;

    @SerializedName("kodeIksBlkDetil")
    private final String iksBlkDetilCode;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("nama")
    private final String name;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("pendidikanNonFormal")
    private final String nonFormalEducation;

    @SerializedName("npwp")
    private final String npwp;

    @SerializedName("noHp")
    private final String phoneNumber;

    @SerializedName("kodeTK")
    private final String tkCode;

    @SerializedName("kodePelatihan")
    private final String trainingCode;

    @SerializedName("preferensiUpah")
    private final String wagePreference;
    private static final byte[] $$d = {39, -79, 42, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -48, -17, 4, 15, Base64.padSymbol, -48, -12, 10, 62, -66, 13, 5, -4, 8, -2, 67, -56, -2, -3, 18, -10, 7, 16, -8, 65, -73, 27, -17};
    private static final int $$e = 138;
    private static final byte[] $$a = {1, -81, 2, 79, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 19;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int b = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 2
            int r9 = 84 - r9
            int r7 = 144 - r7
            int r8 = r8 * 15
            int r8 = r8 + 38
            byte[] r0 = com.bpjstku.data.vocation.model.request.VocationRegisterRequest.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r3
            r3 = r9
            r9 = r6
        L2b:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + (-11)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.vocation.model.request.VocationRegisterRequest.a(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 50
            int r9 = r9 + 1
            byte[] r0 = com.bpjstku.data.vocation.model.request.VocationRegisterRequest.$$d
            int r8 = r8 * 50
            int r8 = r8 + 3
            int r7 = 99 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2a
        L15:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r7]
        L2a:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + 3
            int r7 = r7 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.vocation.model.request.VocationRegisterRequest.d(byte, byte, int, java.lang.Object[]):void");
    }

    public final String getAddress() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.address;
        int i5 = i3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAccountBank() {
        int i = 2 % 2;
        int i2 = b + 11;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.accountBank;
        int i4 = i3 + 113;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.email;
        int i5 = i3 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return str;
    }

    public final String getGender() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.gender;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getIksBlkDetilCode() {
        int i = 2 % 2;
        int i2 = b + 3;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.iksBlkDetilCode;
        int i5 = i3 + 89;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTrainingCode() {
        int i = 2 % 2;
        int i2 = b + 39;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.trainingCode;
        int i5 = i3 + 105;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTkCode() {
        String str;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.tkCode;
            int i4 = 42 / 0;
        } else {
            str = this.tkCode;
        }
        int i5 = i2 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getKpj() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.kpj;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = b + 111;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.name;
        int i4 = i3 + 83;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getBankBranchOfficeName() {
        int i = 2 % 2;
        int i2 = b + 75;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.bankBranchOfficeName;
        int i5 = i3 + 109;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAccountName() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 31;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountName;
        int i5 = i2 + 119;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getNik() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.nik;
        int i5 = i2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 49 / 0;
        }
        return str;
    }

    public final String getPhoneNumber() {
        int i = 2 % 2;
        int i2 = b + 1;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.phoneNumber;
        int i4 = i3 + 31;
        b = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getAccountNumber() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 7;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountNumber;
        int i5 = i2 + 117;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getNpwp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 101;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.npwp;
        int i5 = i2 + 13;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getFormalEducation() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 85;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.formalEducation;
        int i5 = i2 + 75;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getNonFormalEducation() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.nonFormalEducation;
        int i5 = i2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getWagePreference() {
        int i = 2 % 2;
        int i2 = b + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.wagePreference;
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        return str;
    }

    public final String getBirthdate() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 27;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.birthdate;
        int i5 = i2 + 15;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public VocationRegisterRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
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
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        this.address = str;
        this.accountBank = str2;
        this.email = str3;
        this.gender = str4;
        this.iksBlkDetilCode = str5;
        this.trainingCode = str6;
        this.tkCode = str7;
        this.kpj = str8;
        this.name = str9;
        this.bankBranchOfficeName = str10;
        this.accountName = str11;
        this.nik = str12;
        this.phoneNumber = str13;
        this.accountNumber = str14;
        this.npwp = str15;
        this.formalEducation = str16;
        this.nonFormalEducation = str17;
        this.wagePreference = str18;
        this.birthdate = str19;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $10 + 99;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = $10 + 7;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 19472), 2625 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 13 - (ViewConfiguration.getTouchSlop() >> 8), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39422), 481 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 36, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i8 = $11 + 101;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.normalizeMetaState(0) + 39422), 481 - TextUtils.getOffsetBefore("", 0), 37 - View.MeasureSpec.getMode(0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    public final String component10() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetAfter = (char) (43042 - TextUtils.getOffsetAfter("", 0));
            int i2 = 3112 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 22;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a((short) 141, bArr[0], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter, i2, iResolveSizeAndState, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{26528, 32624, 22043, 11566, 1234, 7155, 62111, 51702, 41302, 47205, 40793, 30215, 19916, 9441, 15239, 4789, 59996, 49485, 55299, 48931, 38606, 28129}, TextUtils.getCapsMode("", 0, 0) + 6367, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{26532, 56708, 5106, 18890, 36630, 50537, 15187, 28812, 46828, 60625, 8759, 39030, 56900, 5049, 18842}, Drawable.resolveOpacity(0, 0) + 47657, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char jumpTapTimeout = (char) (43042 - (ViewConfiguration.getJumpTapTimeout() >> 16));
            int iIndexOf = 3110 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int scrollBarSize = 22 - (ViewConfiguration.getScrollBarSize() >> 8);
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a((short) 89, bArr2[0], bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(jumpTapTimeout, iIndexOf, scrollBarSize, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
            b = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 43042);
                int i5 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3110;
                int pressedStateDuration = 22 - (ViewConfiguration.getPressedStateDuration() >> 16);
                byte b2 = $$a[7];
                Object[] objArr6 = new Object[1];
                a((short) 37, b2, b2, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup, i5, pressedStateDuration, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = ~iIdentityHashCode;
            int i9 = (-1796411576) + (((~((-657545) | i8)) | (~((-1704373915) | i8))) * (-867)) + (((~((-657545) | iIdentityHashCode)) | 133256 | (~((-1704373915) | iIdentityHashCode))) * (-1734)) + (((~(iIdentityHashCode | (-1704240659))) | (~(i8 | (-133257))) | (~((-524289) | iIdentityHashCode))) * 867) + 2113244218;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
            objArr = new Object[]{new int[1], new int[]{i7}, new int[]{i6}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{26539, 159, 43465, 21021, 64275, 25494, 3290, 46358, 24158, 50904, 28644, 2061, 45382, 22918, 49878, 27421}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26431, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{26536, 18014, 9298, 606, 57433, 52815, 44119, 35429, 26705, 22131, 13436, 4704, 61510, 56849, 48159, 39441}, 8699 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
            b = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, 2113244218};
                byte b3 = (byte) 0;
                byte b4 = b3;
                Object[] objArr11 = new Object[1];
                d(b3, b4, (byte) (b4 + 1), objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b5 = (byte) 1;
                byte b6 = b5;
                Object[] objArr12 = new Object[1];
                d(b5, b6, (byte) (b6 - 1), objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43042);
                    int iAxisFromString = MotionEvent.axisFromString("") + 3112;
                    int minimumFlingVelocity2 = 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte b7 = $$a[7];
                    Object[] objArr14 = new Object[1];
                    a((short) 37, b7, b7, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(minimumFlingVelocity, iAxisFromString, minimumFlingVelocity2, 154975793, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    c(new char[]{26528, 32624, 22043, 11566, 1234, 7155, 62111, 51702, 41302, 47205, 40793, 30215, 19916, 9441, 15239, 4789, 59996, 49485, 55299, 48931, 38606, 28129}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6368, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(new char[]{26532, 56708, 5106, 18890, 36630, 50537, 15187, 28812, 46828, 60625, 8759, 39030, 56900, 5049, 18842}, 47657 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cMyTid = (char) ((Process.myTid() >> 22) + 43042);
                        int mode = 3111 - View.MeasureSpec.getMode(0);
                        int size = 22 - View.MeasureSpec.getSize(0);
                        byte[] bArr3 = $$a;
                        Object[] objArr17 = new Object[1];
                        a((short) 89, bArr3[0], bArr3[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyTid, mode, size, -1269618118, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 43042);
                        int iIndexOf2 = 3111 - TextUtils.indexOf("", "", 0, 0);
                        int i14 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21;
                        byte[] bArr4 = $$a;
                        Object[] objArr18 = new Object[1];
                        a((short) 141, bArr4[0], bArr4[7], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iIndexOf2, i14, -1272852037, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
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
        if (((int[]) objArr[2])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 == null) {
                throw null;
            }
            int i15 = b + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
            int i16 = i15 % 2;
            for (String str : strArr2) {
                arrayList.add(str);
            }
            throw null;
        }
        int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        b = i17 % 128;
        int i18 = i17 % 2;
        int i19 = ((int[]) objArr[0])[0];
        int i20 = ((int[]) objArr[2])[0];
        int i21 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr = {i20};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i22 = ~iIdentityHashCode2;
        int i23 = i19 + (-499709294) + (((~((-623692842) | i22)) | 2148393 | (~((-1081338618) | i22))) * (-1136)) + (((~((-623692842) | iIdentityHashCode2)) | (~((-1081338618) | iIdentityHashCode2)) | (~(1702883065 | i22))) * (-568)) + (((~(iIdentityHashCode2 | (-2148394))) | (~(i22 | 1081338617)) | (~(623692841 | i22))) * 568);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr[0])[0] = i25 ^ (i25 << 5);
        Object[] objArr19 = {new int[1], new int[]{i21}, iArr, strArr3};
        return this.bankBranchOfficeName;
    }

    public final String component15() throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29944);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1755;
            int trimmedLength = TextUtils.getTrimmedLength("") + 23;
            byte b2 = $$a[7];
            Object[] objArr = new Object[1];
            a((short) 37, b2, b2, objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, longPressTimeout, trimmedLength, 986134021, false, (String) objArr[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr2 = new Object[1];
        c(new char[]{26528, 32624, 22043, 11566, 1234, 7155, 62111, 51702, 41302, 47205, 40793, 30215, 19916, 9441, 15239, 4789, 59996, 49485, 55299, 48931, 38606, 28129}, 6367 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        c(new char[]{26532, 56708, 5106, 18890, 36630, 50537, 15187, 28812, 46828, 60625, 8759, 39030, 56900, 5049, 18842}, 47657 - ExpandableListView.getPackedPositionType(0L), objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0));
            int doubleTapTimeout = 1755 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int i4 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23;
            byte[] bArr = $$a;
            byte b3 = bArr[7];
            Object[] objArr4 = new Object[1];
            a(b3, bArr[0], b3, objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, doubleTapTimeout, i4, 1596667560, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29944);
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1755;
                int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23;
                byte[] bArr2 = $$a;
                Object[] objArr5 = new Object[1];
                a((short) 89, bArr2[0], bArr2[7], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec, fadingEdgeLength, doubleTapTimeout2, 1599039318, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i5 = ~startUptimeMillis;
            int i6 = 1566088347 + (((~(593266018 | i5)) | (~((-805868445) | startUptimeMillis))) * (-370)) + (((~(startUptimeMillis | 593266018)) | (~(i5 | (-805868445))) | 55837794) * (-370)) + 1779471165;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i8 ^ (i8 << 5);
            int i9 = b + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            Object[] objArr7 = new Object[1];
            c(new char[]{26539, 159, 43465, 21021, 64275, 25494, 3290, 46358, 24158, 50904, 28644, 2061, 45382, 22918, 49878, 27421}, 26431 - ((Process.getThreadPriority(0) + 20) >> 6), objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            c(new char[]{26536, 18014, 9298, 606, 57433, 52815, 44119, 35429, 26705, 22131, 13436, 4704, 61510, 56849, 48159, 39441}, View.MeasureSpec.getSize(0) + 8699, objArr8);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr9 = {-2104655495};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42048 - TextUtils.indexOf((CharSequence) "", '0', 0)), ImageFormat.getBitsPerPixel(0) + 1727, 30 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = EncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), -1700643431, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char threadPriority = (char) (29944 - ((Process.getThreadPriority(0) + 20) >> 6));
                    int tapTimeout = 1755 - (ViewConfiguration.getTapTimeout() >> 16);
                    int size = 23 - View.MeasureSpec.getSize(0);
                    byte[] bArr3 = $$a;
                    Object[] objArr10 = new Object[1];
                    a((short) 89, bArr3[0], bArr3[7], objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(threadPriority, tapTimeout, size, 1599039318, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    Object[] objArr11 = new Object[1];
                    c(new char[]{26528, 32624, 22043, 11566, 1234, 7155, 62111, 51702, 41302, 47205, 40793, 30215, 19916, 9441, 15239, 4789, 59996, 49485, 55299, 48931, 38606, 28129}, (Process.myPid() >> 22) + 6367, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(new char[]{26532, 56708, 5106, 18890, 36630, 50537, 15187, 28812, 46828, 60625, 8759, 39030, 56900, 5049, 18842}, 47705 - AndroidCharacter.getMirror('0'), objArr12);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 29944);
                        int minimumFlingVelocity = 1755 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i11 = 24 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        byte[] bArr4 = $$a;
                        byte b4 = bArr4[7];
                        Object[] objArr13 = new Object[1];
                        a(b4, bArr4[0], b4, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(touchSlop, minimumFlingVelocity, i11, 1596667560, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char tapTimeout2 = (char) (29944 - (ViewConfiguration.getTapTimeout() >> 16));
                        int edgeSlop = 1755 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int mode = View.MeasureSpec.getMode(0) + 23;
                        byte b5 = $$a[7];
                        Object[] objArr14 = new Object[1];
                        a((short) 37, b5, b5, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(tapTimeout2, edgeSlop, mode, 986134021, false, (String) objArr14[0], null);
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
        int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0];
        int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        if (i13 == i12) {
            int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i15 = ~iIdentityHashCode;
            int i16 = i14 + (((((~(793742349 | i15)) | (~((-1006344776) | iIdentityHashCode))) | (~(i15 | 1006344775))) * 959) - 1994937158) + (((~(iIdentityHashCode | 1006344775)) | (~(i15 | (-1006344776))) | (~(793742349 | iIdentityHashCode))) * 959);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr15[3])[0] = i18 ^ (i18 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
            if (strArr != null) {
                int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
                b = i19 % 128;
                int i20 = i19 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i13];
            int i21 = i13 - 1;
            iArr[i21] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i21) % 2) - 1], 1).show();
            int i22 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
            Object[] objArr16 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i23 = ~iIdentityHashCode2;
            int i24 = i22 + (-1144866607) + (((~(49269906 | i23)) | 219157068) * 168) + ((~((-219157069) | iIdentityHashCode2)) * 168) + (((~(iIdentityHashCode2 | 268426974)) | (~(i23 | (-261872333))) | 42715264) * 168);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr16[3])[0] = i26 ^ (i26 << 5);
        }
        return this.npwp;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        TuitionPaymentFragmentbindingInflater1();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 == 0) {
            int i2 = 60 / 0;
        }
    }

    public static /* synthetic */ VocationRegisterRequest copy$default(VocationRegisterRequest vocationRegisterRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i, Object obj) {
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        int i2 = 2 % 2;
        String str25 = (i & 1) != 0 ? vocationRegisterRequest.address : str;
        String str26 = (i & 2) != 0 ? vocationRegisterRequest.accountBank : str2;
        Object obj2 = null;
        if ((i & 4) != 0) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                String str27 = vocationRegisterRequest.email;
                obj2.hashCode();
                throw null;
            }
            str20 = vocationRegisterRequest.email;
        } else {
            str20 = str3;
        }
        String str28 = (i & 8) != 0 ? vocationRegisterRequest.gender : str4;
        String str29 = (i & 16) != 0 ? vocationRegisterRequest.iksBlkDetilCode : str5;
        if ((i & 32) != 0) {
            int i4 = b + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 != 0) {
                str21 = vocationRegisterRequest.trainingCode;
                int i5 = 79 / 0;
            } else {
                str21 = vocationRegisterRequest.trainingCode;
            }
        } else {
            str21 = str6;
        }
        String str30 = (i & 64) != 0 ? vocationRegisterRequest.tkCode : str7;
        String str31 = (i & 128) != 0 ? vocationRegisterRequest.kpj : str8;
        String str32 = (i & 256) != 0 ? vocationRegisterRequest.name : str9;
        if ((i & 512) != 0) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                String str33 = vocationRegisterRequest.bankBranchOfficeName;
                obj2.hashCode();
                throw null;
            }
            str22 = vocationRegisterRequest.bankBranchOfficeName;
        } else {
            str22 = str10;
        }
        if ((i & 1024) != 0) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
            b = i7 % 128;
            int i8 = i7 % 2;
            str23 = vocationRegisterRequest.accountName;
        } else {
            str23 = str11;
        }
        String str34 = (i & 2048) != 0 ? vocationRegisterRequest.nik : str12;
        String str35 = (i & 4096) != 0 ? vocationRegisterRequest.phoneNumber : str13;
        String str36 = (i & 8192) != 0 ? vocationRegisterRequest.accountNumber : str14;
        String str37 = (i & 16384) != 0 ? vocationRegisterRequest.npwp : str15;
        if ((i & 32768) != 0) {
            int i9 = b + 53;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
            int i10 = i9 % 2;
            str24 = vocationRegisterRequest.formalEducation;
        } else {
            str24 = str16;
        }
        return vocationRegisterRequest.copy(str25, str26, str20, str28, str29, str21, str30, str31, str32, str22, str23, str34, str35, str36, str37, str24, (65536 & i) != 0 ? vocationRegisterRequest.nonFormalEducation : str17, (i & 131072) != 0 ? vocationRegisterRequest.wagePreference : str18, (i & 262144) != 0 ? vocationRegisterRequest.birthdate : str19);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.address;
        int i5 = i3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = b + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.accountName;
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        return str;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.nik;
        int i5 = i3 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.phoneNumber;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountNumber;
        int i5 = i2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = b + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.formalEducation;
        }
        throw null;
    }

    public final String component17() {
        int i = 2 % 2;
        int i2 = b + 97;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.nonFormalEducation;
        int i4 = i3 + 89;
        b = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component18() {
        int i = 2 % 2;
        int i2 = b + 67;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.wagePreference;
        int i5 = i3 + 79;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component19() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.birthdate;
        int i5 = i2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.accountBank;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.email;
        int i4 = i2 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = b + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.gender;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.iksBlkDetilCode;
        int i4 = i3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.trainingCode;
        int i5 = i2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 15;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tkCode;
        int i5 = i2 + 99;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 47;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.kpj;
        int i4 = i2 + 73;
        b = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VocationRegisterRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String p16, String p17, String p18) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        Intrinsics.checkNotNullParameter(p7, "");
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p9, "");
        Intrinsics.checkNotNullParameter(p10, "");
        Intrinsics.checkNotNullParameter(p11, "");
        Intrinsics.checkNotNullParameter(p12, "");
        Intrinsics.checkNotNullParameter(p13, "");
        Intrinsics.checkNotNullParameter(p14, "");
        Intrinsics.checkNotNullParameter(p15, "");
        Intrinsics.checkNotNullParameter(p16, "");
        Intrinsics.checkNotNullParameter(p17, "");
        Intrinsics.checkNotNullParameter(p18, "");
        VocationRegisterRequest vocationRegisterRequest = new VocationRegisterRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18);
        int i2 = b + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return vocationRegisterRequest;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VocationRegisterRequest)) {
            return false;
        }
        VocationRegisterRequest vocationRegisterRequest = (VocationRegisterRequest) p0;
        if (!Intrinsics.areEqual(this.address, vocationRegisterRequest.address)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.accountBank, vocationRegisterRequest.accountBank)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
            b = i2 % 128;
            return i2 % 2 == 0;
        }
        if ((!Intrinsics.areEqual(this.email, vocationRegisterRequest.email)) || !Intrinsics.areEqual(this.gender, vocationRegisterRequest.gender) || !Intrinsics.areEqual(this.iksBlkDetilCode, vocationRegisterRequest.iksBlkDetilCode) || !Intrinsics.areEqual(this.trainingCode, vocationRegisterRequest.trainingCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.tkCode, vocationRegisterRequest.tkCode)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
            b = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.kpj, vocationRegisterRequest.kpj) || !Intrinsics.areEqual(this.name, vocationRegisterRequest.name) || (!Intrinsics.areEqual(this.bankBranchOfficeName, vocationRegisterRequest.bankBranchOfficeName))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.accountName, vocationRegisterRequest.accountName)) {
            int i5 = b + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.nik, vocationRegisterRequest.nik) || !Intrinsics.areEqual(this.phoneNumber, vocationRegisterRequest.phoneNumber)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.accountNumber, vocationRegisterRequest.accountNumber)) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
            b = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.npwp, vocationRegisterRequest.npwp)) {
            int i9 = b + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.formalEducation, vocationRegisterRequest.formalEducation)) {
            return false;
        }
        if (Intrinsics.areEqual(this.nonFormalEducation, vocationRegisterRequest.nonFormalEducation)) {
            return Intrinsics.areEqual(this.wagePreference, vocationRegisterRequest.wagePreference) && Intrinsics.areEqual(this.birthdate, vocationRegisterRequest.birthdate);
        }
        int i11 = b + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((((((((((((((((((this.address.hashCode() * 31) + this.accountBank.hashCode()) * 31) + this.email.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.iksBlkDetilCode.hashCode()) * 31) + this.trainingCode.hashCode()) * 31) + this.tkCode.hashCode()) * 31) + this.kpj.hashCode()) * 31) + this.name.hashCode()) * 31) + this.bankBranchOfficeName.hashCode()) * 31) + this.accountName.hashCode()) * 31) + this.nik.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.accountNumber.hashCode()) * 31) + this.npwp.hashCode()) * 31) + this.formalEducation.hashCode()) * 31) + this.nonFormalEducation.hashCode()) * 31) + this.wagePreference.hashCode()) * 31) + this.birthdate.hashCode();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.address;
        String str2 = this.accountBank;
        String str3 = this.email;
        String str4 = this.gender;
        String str5 = this.iksBlkDetilCode;
        String str6 = this.trainingCode;
        String str7 = this.tkCode;
        String str8 = this.kpj;
        String str9 = this.name;
        String str10 = this.bankBranchOfficeName;
        String str11 = this.accountName;
        String str12 = this.nik;
        String str13 = this.phoneNumber;
        String str14 = this.accountNumber;
        String str15 = this.npwp;
        String str16 = this.formalEducation;
        String str17 = this.nonFormalEducation;
        String str18 = this.wagePreference;
        String str19 = this.birthdate;
        StringBuilder sb = new StringBuilder("VocationRegisterRequest(address=");
        sb.append(str);
        sb.append(", accountBank=");
        sb.append(str2);
        sb.append(", email=");
        sb.append(str3);
        sb.append(", gender=");
        sb.append(str4);
        sb.append(", iksBlkDetilCode=");
        sb.append(str5);
        sb.append(", trainingCode=");
        sb.append(str6);
        sb.append(", tkCode=");
        sb.append(str7);
        sb.append(", kpj=");
        sb.append(str8);
        sb.append(", name=");
        sb.append(str9);
        sb.append(", bankBranchOfficeName=");
        sb.append(str10);
        sb.append(", accountName=");
        sb.append(str11);
        sb.append(", nik=");
        sb.append(str12);
        sb.append(", phoneNumber=");
        sb.append(str13);
        sb.append(", accountNumber=");
        sb.append(str14);
        sb.append(", npwp=");
        sb.append(str15);
        sb.append(", formalEducation=");
        sb.append(str16);
        sb.append(", nonFormalEducation=");
        sb.append(str17);
        sb.append(", wagePreference=");
        sb.append(str18);
        sb.append(", birthdate=");
        sb.append(str19);
        sb.append(")");
        String string = sb.toString();
        int i2 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentbindingInflater1 = 3180781594174672602L;
    }
}
