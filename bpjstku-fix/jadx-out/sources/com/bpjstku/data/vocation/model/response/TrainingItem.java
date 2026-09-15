package com.bpjstku.data.vocation.model.response;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0018J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0018J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0018J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0018J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0018J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0018J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u0018Jè\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020,2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b2\u0010\u0018R\u001c\u00103\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0018R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u0010\u0018R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b9\u0010\u0018R\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u00104\u001a\u0004\b;\u0010\u0018R\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u00104\u001a\u0004\b=\u0010\u0018R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u00104\u001a\u0004\b?\u0010\u0018R\u001c\u0010@\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u00104\u001a\u0004\bA\u0010\u0018R\u001c\u0010B\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u00104\u001a\u0004\bC\u0010\u0018R\u001c\u0010D\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u00104\u001a\u0004\bE\u0010\u0018R\u001c\u0010F\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u00104\u001a\u0004\bG\u0010\u0018R\u001c\u0010H\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u00104\u001a\u0004\bI\u0010\u0018R\u001c\u0010J\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u00104\u001a\u0004\bK\u0010\u0018R\u001c\u0010L\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u00104\u001a\u0004\bM\u0010\u0018R\u001c\u0010N\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u00104\u001a\u0004\bO\u0010\u0018R\u001c\u0010P\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u00104\u001a\u0004\bQ\u0010\u0018R\u001c\u0010R\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u00104\u001a\u0004\bS\u0010\u0018R\u001c\u0010T\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u00104\u001a\u0004\bU\u0010\u0018R\u001c\u0010V\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u00104\u001a\u0004\bW\u0010\u0018"}, d2 = {"Lcom/bpjstku/data/vocation/model/response/TrainingItem;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/vocation/model/response/TrainingItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "iksEnd", "Ljava/lang/String;", "getIksEnd", "iksStart", "getIksStart", "trainingDuration", "getTrainingDuration", "trainingType", "getTrainingType", "remarks", "getRemarks", "blkCode", "getBlkCode", "iksBlkDetilCode", "getIksBlkDetilCode", "cityCode", "getCityCode", "trainingCode", "getTrainingCode", "module", "getModule", "blkName", "getBlkName", "cityName", "getCityName", "trainingName", "getTrainingName", "no", "getNo", "unscheduledRegistration", "getUnscheduledRegistration", "scheduledRegistration", "getScheduledRegistration", "rate", "getRate", "numberOfApplicants", "getNumberOfApplicants"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TrainingItem {
    public static final int $stable = 0;
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @SerializedName("kodeBlk")
    private final String blkCode;

    @SerializedName("namaBlk")
    private final String blkName;

    @SerializedName("kodeKabupaten")
    private final String cityCode;

    @SerializedName("namaKabupaten")
    private final String cityName;

    @SerializedName("kodeIksBlkDetil")
    private final String iksBlkDetilCode;

    @SerializedName("akhirIks")
    private final String iksEnd;

    @SerializedName("awalIks")
    private final String iksStart;

    @SerializedName("modul")
    private final String module;

    @SerializedName("nomor")
    private final String no;

    @SerializedName("totalPendaftar")
    private final String numberOfApplicants;

    @SerializedName("rate")
    private final String rate;

    @SerializedName("keterangan")
    private final String remarks;

    @SerializedName("pendaftarSudahTerjadwal")
    private final String scheduledRegistration;

    @SerializedName("kodePelatihan")
    private final String trainingCode;

    @SerializedName("durasiPelatihan")
    private final String trainingDuration;

    @SerializedName("namaPelatihan")
    private final String trainingName;

    @SerializedName("jenisPelatihan")
    private final String trainingType;

    @SerializedName("pendaftarBelumTerjadwal")
    private final String unscheduledRegistration;
    private static final byte[] $$c = {38, 31, -70, -1};
    private static final int $$f = 87;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {94, -1, 37, -59, -54, -16, -18, 9, -30, 1, -18, -18, -6, 23, -43, -25, -5, -26, 4, 11, -50, -5, -22, 62, -61, -46, -1, -24, -2, -19, -12, 17, -30, -37, -1, -5, -22, -19, 33, -57, 4, -19, -19, -5, -22, -19, -12, -10, -2, -11, -19, -5, -24, -10, -18, -11, -10, -18, -4, -12, -31, 0, -9, -31, 29, -47, -2, -14, -20, -5, -14, -14, -8, -33, -4, -21, 53, 1, -28, -46, -1, -24, -2, -19, -12, 17, -30, -37, -1, -5, -22, -19, 33, -57, 4, -19, -19, -5, -22, -19, -12, -10, -2, -11, -19, -5, -24, -10, -18, -11, -10, -18, -4, -12, -31, 0, -9, -31, 29, -47, -2, -14, -20, -5, -14, -14, -8, -33, -4, -21, 53};
    private static final int $$e = 228;
    private static final byte[] $$a = {49, 84, -120, 101, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 223;
    private static int b = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 84
            int r7 = r7 * 52
            int r7 = r7 + 4
            int r6 = r6 * 52
            int r0 = r6 + 1
            byte[] r1 = com.bpjstku.data.vocation.model.response.TrainingItem.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r7 = r7 + r4
            int r8 = r8 + 1
            int r7 = r7 + (-11)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.vocation.model.response.TrainingItem.a(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 14
            int r8 = 84 - r8
            int r7 = r7 * 23
            int r0 = r7 + 53
            byte[] r1 = com.bpjstku.data.vocation.model.response.TrainingItem.$$d
            int r6 = r6 * 75
            int r6 = 79 - r6
            byte[] r0 = new byte[r0]
            int r7 = r7 + 52
            r2 = 0
            if (r1 != 0) goto L19
            r8 = r6
            r3 = r7
            r4 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-13)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.vocation.model.response.TrainingItem.d(int, byte, int, java.lang.Object[]):void");
    }

    public TrainingItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        this.iksEnd = str;
        this.iksStart = str2;
        this.trainingDuration = str3;
        this.trainingType = str4;
        this.remarks = str5;
        this.blkCode = str6;
        this.iksBlkDetilCode = str7;
        this.cityCode = str8;
        this.trainingCode = str9;
        this.module = str10;
        this.blkName = str11;
        this.cityName = str12;
        this.trainingName = str13;
        this.no = str14;
        this.unscheduledRegistration = str15;
        this.scheduledRegistration = str16;
        this.rate = str17;
        this.numberOfApplicants = str18;
    }

    public final String getIksEnd() {
        int i = 2 % 2;
        int i2 = b + 29;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.iksEnd;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getIksStart() {
        int i = 2 % 2;
        int i2 = b + 115;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.iksStart;
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        return str;
    }

    public final String getTrainingDuration() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 73;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.trainingDuration;
        int i4 = i2 + 47;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getTrainingType() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 105;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.trainingType;
        int i5 = i3 + 77;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
        return str;
    }

    public final String getRemarks() {
        int i = 2 % 2;
        int i2 = b + 35;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.remarks;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBlkCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 43;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return this.blkCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getIksBlkDetilCode() {
        int i = 2 % 2;
        int i2 = b + 53;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.iksBlkDetilCode;
        }
        throw null;
    }

    public final String getCityCode() {
        int i = 2 % 2;
        int i2 = b + 57;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.cityCode;
        }
        throw null;
    }

    public final String getTrainingCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 59;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.trainingCode;
        int i5 = i3 + 79;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getModule() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 17;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.module;
        int i5 = i2 + 83;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBlkName() {
        int i = 2 % 2;
        int i2 = b + 55;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.blkName;
        int i4 = i3 + 103;
        b = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getCityName() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 107;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.cityName;
        int i4 = i2 + 41;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getTrainingName() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 35;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.trainingName;
        int i4 = i2 + 87;
        b = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getNo() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 77;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.no;
        int i4 = i2 + 91;
        b = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getUnscheduledRegistration() {
        String str;
        int i = 2 % 2;
        int i2 = b + 103;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 == 0) {
            str = this.unscheduledRegistration;
            int i4 = 9 / 0;
        } else {
            str = this.unscheduledRegistration;
        }
        int i5 = i3 + 51;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getScheduledRegistration() {
        int i = 2 % 2;
        int i2 = b + 119;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.scheduledRegistration;
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        return str;
    }

    public final String getRate() {
        int i = 2 % 2;
        int i2 = b + 71;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.rate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getNumberOfApplicants() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 99;
        b = i2 % 128;
        int i3 = i2 % 2;
        String str = this.numberOfApplicants;
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        return str;
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = -1870535734;
        char c = '0';
        char c2 = 3;
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(iArr2[i6]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", c, i5, i5) + 1);
                        int iResolveSize = 3291 - View.resolveSize(i5, i5);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31;
                        byte b2 = $$c[c2];
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iResolveSize, maximumDrawingCacheSize, 1948206109, false, $$g(b3, b3, b2), new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i6++;
                    i3 = -1870535734;
                    c = '0';
                    c2 = 3;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $11 + 111;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 4;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                Object[] objArr3 = new Object[i4];
                objArr3[0] = Integer.valueOf(iArr5[i9]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 3292;
                    int i10 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 32;
                    byte b4 = $$c[3];
                    byte b5 = (byte) (b4 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, iLastIndexOf, i10, 1948206109, false, $$g(b5, b5, b4), new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i9++;
                iArr5 = iArr5;
                i4 = 1;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i11 = 17;
            for (int i12 = 1; i11 > i12; i12 = 1) {
                int i13 = $11 + 101;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i11];
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        int iArgb = Color.argb(0, 0, 0, 0) + 2559;
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 29;
                        byte b6 = $$c[3];
                        byte b7 = (byte) (-b6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, iArgb, fadingEdgeLength, 683220507, false, $$g(b7, (byte) (b7 - 1), b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i11 += 100;
                } else {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i11];
                    Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 2559;
                        int iIndexOf = 28 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        byte b8 = $$c[3];
                        byte b9 = (byte) (-b8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(trimmedLength, scrollBarSize, iIndexOf, 683220507, false, $$g(b9, (byte) (b9 - 1), b8), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                    i11--;
                }
            }
            int i14 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i15 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28879 - Color.red(0)), 348 - KeyEvent.keyCodeFromString(""), 25 - Color.green(0), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public final String component12() throws Throwable {
        Object[] objArr;
        char c = 2;
        int i = 2 % 2;
        int i2 = b + 119;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
            int i4 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 876;
            int pressedStateDuration = 10 - (ViewConfiguration.getPressedStateDuration() >> 16);
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 | 14), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter, i4, pressedStateDuration, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{1677413843, -1435592475, -1133416594, -2122613851, 772544771, -2031380986, -915202426, 55844299, -1433276008, -208489701, 674628576, -1949927946, -955177648, -168792730}, 22 - TextUtils.getCapsMode("", 0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{-566051116, 626748491, 600805945, 1482309855, 1442213167, -662835693, -1028968179, -155859904, -1008218706, -1531761644}, 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int minimumFlingVelocity = 876 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int i5 = 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            byte[] bArr = $$a;
            byte b4 = (byte) (-bArr[5]);
            byte b5 = bArr[7];
            Object[] objArr5 = new Object[1];
            a(b4, b5, b5, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, minimumFlingVelocity, i5, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = b + 9;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c3 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                int i8 = 877 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int iAlpha = 10 - Color.alpha(0);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                a(bArr2[7], (byte) (-bArr2[5]), bArr2[54], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, i8, iAlpha, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i9 = (((((~(elapsedCpuTime | 282021235)) | (-241711007)) * 56) + 1691304148) + (((~((~elapsedCpuTime) | (-241711007))) | 282021235) * 56)) - 1150400044;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{-894255457, 123652569, -1674024544, 1521171574, 12963307, -253681369, -1201753245, 88587111, 725515211, 783967371, 1903717742, -1513810540, 636208208, 768587789, 1985800408, -862819389}, 26 - Color.blue(0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{-165772672, 612188487, 1497739828, -1423287494, 774333996, 2053300411, 1077342443, 463526751, 521074639, -1997655864, -1780323942, -947440652}, 19 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new int[]{1361103747, -167860894, 1175285893, 141007069, 832912973, 21772496, -1220176058, 1480378243, 1359951518, -1258194943}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 16, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new int[]{133040458, 285657581, 1321215961, -300527605, -607904014, 197610020, 113626590, -1234268046, -482464331, -1631576634}, (ViewConfiguration.getLongPressTimeout() >> 16) + 16, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), -1150400044};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[9];
                byte b7 = b6;
                Object[] objArr13 = new Object[1];
                d(b6, b7, b7, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = bArr3[61];
                byte b9 = b8;
                Object[] objArr14 = new Object[1];
                d(b8, b9, b9, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char size = (char) View.MeasureSpec.getSize(0);
                        int i12 = 876 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int capsMode = 10 - TextUtils.getCapsMode("", 0, 0);
                        byte[] bArr4 = $$a;
                        Object[] objArr16 = new Object[1];
                        a(bArr4[7], (byte) (-bArr4[5]), bArr4[54], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(size, i12, capsMode, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new int[]{1677413843, -1435592475, -1133416594, -2122613851, 772544771, -2031380986, -915202426, 55844299, -1433276008, -208489701, 674628576, -1949927946, -955177648, -168792730}, (Process.myPid() >> 22) + 22, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new int[]{-566051116, 626748491, 600805945, 1482309855, 1442213167, -662835693, -1028968179, -155859904, -1008218706, -1531761644}, 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char defaultSize = (char) View.getDefaultSize(0, 0);
                            int iIndexOf = 876 - TextUtils.indexOf("", "", 0);
                            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10;
                            byte[] bArr5 = $$a;
                            byte b10 = (byte) (-bArr5[5]);
                            byte b11 = bArr5[7];
                            Object[] objArr19 = new Object[1];
                            a(b10, b11, b11, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, iIndexOf, doubleTapTimeout, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                            int i13 = 877 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int iRgb = (-16777206) - Color.rgb(0, 0, 0);
                            byte b12 = $$a[7];
                            byte b13 = b12;
                            Object[] objArr20 = new Object[1];
                            a(b12, b13, (byte) (b13 | 14), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, i13, iRgb, 252381699, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
                c = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[c])[0]) {
            throw null;
        }
        int i14 = b + 19;
        TuitionPaymentFragmentbindingInflater1 = i14 % 128;
        int i15 = i14 % 2;
        int i16 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i17 = i16 + (-1598985640) + (((~((-269489673) | (~iUptimeMillis))) | 229179443) * (-591)) + ((iUptimeMillis | (-269489673)) * 591);
        int i18 = (i17 << 13) ^ i17;
        int i19 = i18 ^ (i18 >>> 17);
        ((int[]) objArr21[1])[0] = i19 ^ (i19 << 5);
        String str = this.cityName;
        int i20 = b + 7;
        TuitionPaymentFragmentbindingInflater1 = i20 % 128;
        if (i20 % 2 == 0) {
            int i21 = 68 / 0;
        }
        return str;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TrainingItem copy$default(TrainingItem trainingItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, Object obj) {
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 3;
        int i4 = i3 % 128;
        b = i4;
        String str27 = (i3 % 2 == 0 && (i & 1) != 0) ? trainingItem.iksEnd : str;
        if ((i & 2) != 0) {
            int i5 = i4 + 109;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            str19 = trainingItem.iksStart;
        } else {
            str19 = str2;
        }
        if ((i & 4) != 0) {
            int i7 = TuitionPaymentFragmentbindingInflater1 + 47;
            b = i7 % 128;
            int i8 = i7 % 2;
            str20 = trainingItem.trainingDuration;
        } else {
            str20 = str3;
        }
        String str28 = (i & 8) != 0 ? trainingItem.trainingType : str4;
        String str29 = (i & 16) != 0 ? trainingItem.remarks : str5;
        if ((i & 32) != 0) {
            int i9 = b + 105;
            TuitionPaymentFragmentbindingInflater1 = i9 % 128;
            int i10 = i9 % 2;
            str21 = trainingItem.blkCode;
        } else {
            str21 = str6;
        }
        String str30 = (i & 64) != 0 ? trainingItem.iksBlkDetilCode : str7;
        if ((i & 128) != 0) {
            int i11 = TuitionPaymentFragmentbindingInflater1 + 3;
            b = i11 % 128;
            int i12 = i11 % 2;
            str22 = trainingItem.cityCode;
        } else {
            str22 = str8;
        }
        if ((i & 256) != 0) {
            int i13 = b;
            int i14 = i13 + 49;
            TuitionPaymentFragmentbindingInflater1 = i14 % 128;
            int i15 = i14 % 2;
            str23 = trainingItem.trainingCode;
            int i16 = i13 + 121;
            TuitionPaymentFragmentbindingInflater1 = i16 % 128;
            int i17 = i16 % 2;
        } else {
            str23 = str9;
        }
        String str31 = (i & 512) != 0 ? trainingItem.module : str10;
        if ((i & 1024) != 0) {
            int i18 = TuitionPaymentFragmentbindingInflater1 + 71;
            b = i18 % 128;
            if (i18 % 2 != 0) {
                String str32 = trainingItem.blkName;
                throw null;
            }
            str24 = trainingItem.blkName;
        } else {
            str24 = str11;
        }
        if ((i & 2048) != 0) {
            int i19 = TuitionPaymentFragmentbindingInflater1 + 67;
            b = i19 % 128;
            if (i19 % 2 != 0) {
                String str33 = trainingItem.cityName;
                throw null;
            }
            str25 = trainingItem.cityName;
        } else {
            str25 = str12;
        }
        String str34 = (i & 4096) != 0 ? trainingItem.trainingName : str13;
        String str35 = (i & 8192) != 0 ? trainingItem.no : str14;
        if ((i & 16384) != 0) {
            int i20 = b + 45;
            TuitionPaymentFragmentbindingInflater1 = i20 % 128;
            if (i20 % 2 == 0) {
                String str36 = trainingItem.unscheduledRegistration;
                throw null;
            }
            str26 = trainingItem.unscheduledRegistration;
        } else {
            str26 = str15;
        }
        return trainingItem.copy(str27, str19, str20, str28, str29, str21, str30, str22, str23, str31, str24, str25, str34, str35, str26, (32768 & i) != 0 ? trainingItem.scheduledRegistration : str16, (i & 65536) != 0 ? trainingItem.rate : str17, (i & 131072) != 0 ? trainingItem.numberOfApplicants : str18);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = b + 73;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.iksEnd;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 35;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.module;
        int i4 = i2 + 63;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = b + 71;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.blkName;
        int i5 = i3 + 97;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 55;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.trainingName;
        int i4 = i2 + 43;
        b = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = b + 83;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.no;
        int i4 = i3 + 93;
        b = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 35;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.unscheduledRegistration;
        int i5 = i2 + 83;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 31;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.scheduledRegistration;
        int i5 = i2 + 29;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
        return str;
    }

    public final String component17() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 33;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.rate;
        int i5 = i2 + 115;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component18() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 37;
        b = i2 % 128;
        int i3 = i2 % 2;
        String str = this.numberOfApplicants;
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = b + 111;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.iksStart;
        int i5 = i3 + 111;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = b + 41;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.trainingDuration;
        int i5 = i3 + 29;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 89;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.trainingType;
        int i5 = i2 + 67;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 39;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.remarks;
        int i4 = i2 + 57;
        b = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 61;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.blkCode;
        int i4 = i2 + 107;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 49;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return this.iksBlkDetilCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = b + 49;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.cityCode;
        int i4 = i3 + 63;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 11;
        int i3 = i2 % 128;
        b = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.trainingCode;
        int i4 = i3 + 63;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final TrainingItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String p16, String p17) {
        int i = 2 % 2;
        TrainingItem trainingItem = new TrainingItem(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17);
        int i2 = b + 39;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            return trainingItem;
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
        if (!(p0 instanceof TrainingItem)) {
            return false;
        }
        TrainingItem trainingItem = (TrainingItem) p0;
        if (!Intrinsics.areEqual(this.iksEnd, trainingItem.iksEnd)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.iksStart, trainingItem.iksStart)) {
            int i2 = b + 119;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.trainingDuration, trainingItem.trainingDuration)) {
            int i4 = b + 23;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.trainingType, trainingItem.trainingType) || !Intrinsics.areEqual(this.remarks, trainingItem.remarks) || !Intrinsics.areEqual(this.blkCode, trainingItem.blkCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.iksBlkDetilCode, trainingItem.iksBlkDetilCode)) {
            int i6 = b + 113;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.cityCode, trainingItem.cityCode) || !Intrinsics.areEqual(this.trainingCode, trainingItem.trainingCode) || !Intrinsics.areEqual(this.module, trainingItem.module) || !Intrinsics.areEqual(this.blkName, trainingItem.blkName) || !Intrinsics.areEqual(this.cityName, trainingItem.cityName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.trainingName, trainingItem.trainingName)) {
            int i8 = TuitionPaymentFragmentbindingInflater1 + 79;
            b = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 78 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.no, trainingItem.no)) {
            int i10 = b + 5;
            TuitionPaymentFragmentbindingInflater1 = i10 % 128;
            return i10 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.unscheduledRegistration, trainingItem.unscheduledRegistration) || !Intrinsics.areEqual(this.scheduledRegistration, trainingItem.scheduledRegistration) || !Intrinsics.areEqual(this.rate, trainingItem.rate)) {
            return false;
        }
        if (Intrinsics.areEqual(this.numberOfApplicants, trainingItem.numberOfApplicants)) {
            return true;
        }
        int i11 = b + 67;
        TuitionPaymentFragmentbindingInflater1 = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int iHashCode7;
        int i = 2 % 2;
        String str = this.iksEnd;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        String str2 = this.iksStart;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.trainingDuration;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.trainingType;
        if (str4 == null) {
            int i2 = b + 41;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str4.hashCode();
        }
        String str5 = this.remarks;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.blkCode;
        if (str6 == null) {
            int i4 = b + 113;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str6.hashCode();
        }
        String str7 = this.iksBlkDetilCode;
        if (str7 == null) {
            int i6 = b + 3;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str7.hashCode();
        }
        String str8 = this.cityCode;
        if (str8 == null) {
            int i8 = TuitionPaymentFragmentbindingInflater1 + 81;
            b = i8 % 128;
            int i9 = i8 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str8.hashCode();
        }
        String str9 = this.trainingCode;
        int iHashCode12 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.module;
        int iHashCode13 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.blkName;
        if (str11 == null) {
            int i10 = b + 57;
            TuitionPaymentFragmentbindingInflater1 = i10 % 128;
            int i11 = i10 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str11.hashCode();
        }
        String str12 = this.cityName;
        if (str12 == null) {
            int i12 = b + 37;
            TuitionPaymentFragmentbindingInflater1 = i12 % 128;
            iHashCode6 = i12 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode6 = str12.hashCode();
        }
        String str13 = this.trainingName;
        if (str13 == null) {
            int i13 = b + 51;
            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
            int i14 = i13 % 2;
            iHashCode7 = 0;
        } else {
            iHashCode7 = str13.hashCode();
        }
        String str14 = this.no;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.unscheduledRegistration;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.scheduledRegistration;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.rate;
        int iHashCode17 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.numberOfApplicants;
        return (((((((((((((((((((((((((((((((((iHashCode8 * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode) * 31) + iHashCode11) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (str18 != null ? str18.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.iksEnd;
        String str2 = this.iksStart;
        String str3 = this.trainingDuration;
        String str4 = this.trainingType;
        String str5 = this.remarks;
        String str6 = this.blkCode;
        String str7 = this.iksBlkDetilCode;
        String str8 = this.cityCode;
        String str9 = this.trainingCode;
        String str10 = this.module;
        String str11 = this.blkName;
        String str12 = this.cityName;
        String str13 = this.trainingName;
        String str14 = this.no;
        String str15 = this.unscheduledRegistration;
        String str16 = this.scheduledRegistration;
        String str17 = this.rate;
        String str18 = this.numberOfApplicants;
        StringBuilder sb = new StringBuilder("TrainingItem(iksEnd=");
        sb.append(str);
        sb.append(", iksStart=");
        sb.append(str2);
        sb.append(", trainingDuration=");
        sb.append(str3);
        sb.append(", trainingType=");
        sb.append(str4);
        sb.append(", remarks=");
        sb.append(str5);
        sb.append(", blkCode=");
        sb.append(str6);
        sb.append(", iksBlkDetilCode=");
        sb.append(str7);
        sb.append(", cityCode=");
        sb.append(str8);
        sb.append(", trainingCode=");
        sb.append(str9);
        sb.append(", module=");
        sb.append(str10);
        sb.append(", blkName=");
        sb.append(str11);
        sb.append(", cityName=");
        sb.append(str12);
        sb.append(", trainingName=");
        sb.append(str13);
        sb.append(", no=");
        sb.append(str14);
        sb.append(", unscheduledRegistration=");
        sb.append(str15);
        sb.append(", scheduledRegistration=");
        sb.append(str16);
        sb.append(", rate=");
        sb.append(str17);
        sb.append(", numberOfApplicants=");
        sb.append(str18);
        sb.append(")");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentbindingInflater1 + 101;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new int[]{1835380393, -292235027, -428075927, 415241769, 1964866666, -2040502573, 1906793750, -1899132555, 1179359843, 1746799454, -297585163, 454153342, 2120046870, 127551801, -302615579, 568500534, -1291162133, 1118756195};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, short r8) {
        /*
            int r8 = r8 + 4
            int r6 = r6 * 56
            int r6 = r6 + 66
            byte[] r0 = com.bpjstku.data.vocation.model.response.TrainingItem.$$c
            int r7 = r7 * 3
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r4 = -r4
            int r8 = r8 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.vocation.model.response.TrainingItem.$$g(byte, int, short):java.lang.String");
    }
}
