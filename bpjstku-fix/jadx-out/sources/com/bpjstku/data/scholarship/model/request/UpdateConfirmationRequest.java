package com.bpjstku.data.scholarship.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bpjstku.data.lib.model.BaseRequest;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÇ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b!\u0010\u0015J\u0010\u0010\"\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\"\u0010\u0015J\u0094\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010\u0003\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b,\u0010\u0015R\u001a\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0015R\u001a\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010\u0015R\u001a\u00102\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u0010\u0015R\u001a\u00104\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\b5\u0010\u0015R\u001a\u00106\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\b7\u0010\u0015R\u001a\u00108\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\b9\u0010\u0015R \u0010:\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\u001cR\u001c\u0010=\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\u001eR\u001c\u0010@\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010>\u001a\u0004\bA\u0010\u001eR\u001c\u0010B\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010>\u001a\u0004\bC\u0010\u001eR\u001a\u0010D\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010.\u001a\u0004\bE\u0010\u0015R\u001a\u0010F\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010.\u001a\u0004\bG\u0010\u0015"}, d2 = {"Lcom/bpjstku/data/scholarship/model/request/UpdateConfirmationRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "", "Lcom/bpjstku/data/scholarship/model/request/Penerima;", "p6", "Ljava/io/File;", "p7", "p8", "p9", "p10", "p11", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "()Ljava/io/File;", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/scholarship/model/request/UpdateConfirmationRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "emailPelapor", "Ljava/lang/String;", "getEmailPelapor", "nikTk", "getNikTk", "namaPelapor", "getNamaPelapor", "nikPelapor", "getNikPelapor", "tglLahirPelapor", "getTglLahirPelapor", "kodePengajuan", "getKodePengajuan", "dataPenerima", "Ljava/util/List;", "getDataPenerima", "photoLiveness1", "Ljava/io/File;", "getPhotoLiveness1", "photoLiveness2", "getPhotoLiveness2", "photoLiveness3", "getPhotoLiveness3", "scoreLiveness", "getScoreLiveness", "scoreManipulation", "getScoreManipulation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UpdateConfirmationRequest extends BaseRequest {
    public static final int $stable = 8;
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int b;
    private final List<Penerima> dataPenerima;
    private final String emailPelapor;
    private final String kodePengajuan;
    private final String namaPelapor;
    private final String nikPelapor;
    private final String nikTk;
    private final File photoLiveness1;
    private final File photoLiveness2;
    private final File photoLiveness3;
    private final String scoreLiveness;
    private final String scoreManipulation;
    private final String tglLahirPelapor;
    private static final byte[] $$c = {110, -73, -111, 99};
    private static final int $$f = 107;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {46, 126, -84, 108, 4, 21, -45, 58, 5, 1, -22, 28, 23, -15, -11, 23, 25, 2, -45, 59, -15, 14, 9, -5, 7, 16, -1, -12, 28, 23, -15, 20, 39, -6, 17, -5, 12, 5, -24, 23, 30, -6, -2, 15, 12, -40, 50, -11, 12, 12, -2, 15, 12, -12, 13, 11, -4, 11, 11, -1, -24, 43, -2, 12, -5, 25, -9, 19, -59};
    private static final int $$e = 59;
    private static final byte[] $$a = {93, -122, -23, -24, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 105;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.data.scholarship.model.request.UpdateConfirmationRequest.$$a
            int r6 = r6 * 2
            int r6 = 84 - r6
            int r8 = r8 * 15
            int r1 = r8 + 38
            int r7 = r7 * 52
            int r7 = 108 - r7
            byte[] r1 = new byte[r1]
            int r8 = r8 + 37
            r2 = 0
            if (r0 != 0) goto L19
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2e:
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            int r6 = r6 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.scholarship.model.request.UpdateConfirmationRequest.a(int, int, short, java.lang.Object[]):void");
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
    private static void d(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.data.scholarship.model.request.UpdateConfirmationRequest.$$d
            int r6 = r6 * 28
            int r6 = r6 + 4
            int r7 = r7 * 9
            int r7 = r7 + 29
            int r8 = r8 * 19
            int r8 = r8 + 84
            byte[] r1 = new byte[r7]
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
            if (r4 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r6]
        L29:
            int r8 = r8 + r3
            int r6 = r6 + 1
            int r8 = r8 + (-6)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.scholarship.model.request.UpdateConfirmationRequest.d(int, short, short, java.lang.Object[]):void");
    }

    public final String getEmailPelapor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.emailPelapor;
        }
        throw null;
    }

    public final String getNikTk() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 111;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.nikTk;
        int i4 = i3 + 21;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getNamaPelapor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 81;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.namaPelapor;
        int i4 = i3 + 37;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
        return str;
    }

    public final String getNikPelapor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.nikPelapor;
        int i5 = i3 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTglLahirPelapor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.tglLahirPelapor;
        }
        throw null;
    }

    public final String getKodePengajuan() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 79;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.kodePengajuan;
        int i5 = i2 + 93;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
        return str;
    }

    public final List<Penerima> getDataPenerima() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 29;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        List<Penerima> list = this.dataPenerima;
        int i5 = i3 + 7;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final File getPhotoLiveness1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        File file = this.photoLiveness1;
        int i5 = i3 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 24 / 0;
        }
        return file;
    }

    public final File getPhotoLiveness2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.photoLiveness2;
        }
        throw null;
    }

    public final File getPhotoLiveness3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        File file = this.photoLiveness3;
        int i5 = i2 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return file;
    }

    public final String getScoreLiveness() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.scoreLiveness;
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        return str;
    }

    public final String getScoreManipulation() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.scoreManipulation;
        int i5 = i3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public UpdateConfirmationRequest(String str, String str2, String str3, String str4, String str5, String str6, List<Penerima> list, File file, File file2, File file3, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.emailPelapor = str;
        this.nikTk = str2;
        this.namaPelapor = str3;
        this.nikPelapor = str4;
        this.tglLahirPelapor = str5;
        this.kodePengajuan = str6;
        this.dataPenerima = list;
        this.photoLiveness1 = file;
        this.photoLiveness2 = file2;
        this.photoLiveness3 = file3;
        this.scoreLiveness = str7;
        this.scoreManipulation = str8;
    }

    /* JADX WARN: Type inference failed for: r2v63, types: [boolean, int] */
    public final boolean equals(Object p0) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int mirror = 2315 - AndroidCharacter.getMirror('0');
            int longPressTimeout = 33 - (ViewConfiguration.getLongPressTimeout() >> 16);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[7], bArr[37], bArr[132], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay, mirror, longPressTimeout, -887667012, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{-1040437771, -1821912322, -1209346050, -1472763310, 1052018862, -2120411739, 147501657, -277575382, 2012403806, 712722452, 1450245321, 790476223, -214911135, -226346963}, TextUtils.lastIndexOf("", '0', 0) + 23, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{1916472999, 389472257, 1201404848, 525534122, 2041911783, 1122055779, 613247211, -313807056, -1928557557, 589196080}, MotionEvent.axisFromString("") + 16, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int iRed = Color.red(0) + 2267;
            int pressedStateDuration = 33 - (ViewConfiguration.getPressedStateDuration() >> 16);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            byte b3 = bArr2[132];
            Object[] objArr5 = new Object[1];
            a(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, iRed, pressedStateDuration, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                int iLastIndexOf = 2266 - TextUtils.lastIndexOf("", '0');
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33;
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                a(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb, iLastIndexOf, maximumFlingVelocity, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i2 = ((int[]) objArr7[0])[0];
            int i3 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            int i5 = (-381578064) + (((~(50136499 | i4)) | 858849815) * 226) + (((~(i4 | 872220599)) | (~((-858849816) | iIdentityHashCode)) | 36765715) * (-113)) + ((~(iIdentityHashCode | 50136499)) * 113) + 887886048;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[2])[0] = i7 ^ (i7 << 5);
            c = 3;
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{1849334864, -503510998, -1321140008, -818381203, 629601997, -1491237484, -259059125, -1029147275, -1670787579, 484391330, 1341176508, 1652011055, -1721323643, 135646860, 1806448885, 526939939}, 27 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{-365819745, 174573428, -2084012382, 826068347, -358596206, 1252809214, -1801494361, 906861242, 36508293, 1580620570, -1908961038, -359621524}, 18 - View.getDefaultSize(0, 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new int[]{-2140868678, -1913880223, -46636263, -304607349, -1284726678, 1652207254, 1972211808, -82793175, 1377407591, -825878490}, 16 - Color.red(0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new int[]{1727465769, -248522162, 248508305, 1183087634, -1267487402, -935170976, 1270370052, -1189673488, -840030412, -959288908}, 16 - TextUtils.getTrimmedLength(""), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 887886048};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[9];
                byte b7 = (byte) (b6 - 1);
                Object[] objArr13 = new Object[1];
                d(b7, b7, b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = bArr3[9];
                byte b9 = b8;
                Object[] objArr14 = new Object[1];
                d(b8, b9, (byte) (b9 - 1), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cBlue = (char) Color.blue(0);
                        int iIndexOf = 2267 - TextUtils.indexOf("", "");
                        int i8 = 34 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte b10 = $$a[7];
                        byte b11 = b10;
                        Object[] objArr16 = new Object[1];
                        a(b10, b11, b11, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cBlue, iIndexOf, i8, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new int[]{-1040437771, -1821912322, -1209346050, -1472763310, 1052018862, -2120411739, 147501657, -277575382, 2012403806, 712722452, 1450245321, 790476223, -214911135, -226346963}, 22 - (ViewConfiguration.getTapTimeout() >> 16), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new int[]{1916472999, 389472257, 1201404848, 525534122, 2041911783, 1122055779, 613247211, -313807056, -1928557557, 589196080}, 15 - (ViewConfiguration.getScrollBarSize() >> 8), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                            int doubleTapTimeout = 2267 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int defaultSize = 33 - View.getDefaultSize(0, 0);
                            byte[] bArr4 = $$a;
                            byte b12 = bArr4[7];
                            byte b13 = bArr4[132];
                            Object[] objArr19 = new Object[1];
                            a(b12, b13, b13, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, doubleTapTimeout, defaultSize, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                            int i9 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2267;
                            int iResolveSizeAndState = 33 - View.resolveSizeAndState(0, 0, 0);
                            byte[] bArr5 = $$a;
                            Object[] objArr20 = new Object[1];
                            a(bArr5[7], bArr5[37], bArr5[132], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, i9, iResolveSizeAndState, -887667012, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i10 = ((int[]) objArr[c])[0];
        int i11 = ((int[]) objArr[0])[0];
        if (i11 == i10) {
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i12 = ((int[]) objArr[2])[0];
            int i13 = ((int[]) objArr[0])[0];
            int i14 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i15 = i12 + (-970506721) + (((~((-541600216) | iIdentityHashCode2)) | (-267113101)) * (-948)) + ((~((~iIdentityHashCode2) | (-4718725))) * (-948)) + 2137453808;
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            Object obj2 = objArr21[2];
            ((int[]) obj2)[0] = i17 ^ (i17 << 5);
            if (this == p0) {
                int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
                TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                int i19 = i18 % 2;
                int i20 = ((int[]) obj2)[0];
                int i21 = ((i20 * i20) - (~(-(644713615 * i20)))) - 1;
                int i22 = -(i20 * 90895195);
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                int i24 = (i23 & 766673017) + (766673017 | i23);
                int i25 = i24 >> 23;
                int i26 = ((i25 & (-1023)) + (i25 | (-1023))) / 512;
                int i27 = (i24 - (~((i26 ^ 1) + ((i26 & 1) << 1)))) - 1;
                int i28 = i24 >> 20;
                int i29 = (-(i27 ^ ((((i28 & (-8191)) + (i28 | (-8191))) / 4096) + 1))) + 1;
                int i30 = i29 >> 15;
                int i31 = (((-262143) ^ i30) + ((i30 & (-262143)) << 1)) / 131072;
                int i32 = ((i31 | 1) << 1) - (i31 ^ 1);
                return 1971 / ((i29 & (-((i32 ^ 1) + ((i32 & 1) << 1)))) * 1971);
            }
            if (!(p0 instanceof UpdateConfirmationRequest)) {
                int i33 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
                TuitionPaymentFragmentbindingInflater1 = i33 % 128;
                int i34 = i33 % 2;
                return false;
            }
            UpdateConfirmationRequest updateConfirmationRequest = (UpdateConfirmationRequest) p0;
            if (!Intrinsics.areEqual(this.emailPelapor, updateConfirmationRequest.emailPelapor)) {
                int i35 = TuitionPaymentFragmentbindingInflater1 + 69;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i35 % 128;
                if (i35 % 2 != 0) {
                    return false;
                }
                obj.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(this.nikTk, updateConfirmationRequest.nikTk)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.namaPelapor, updateConfirmationRequest.namaPelapor)) {
                int i36 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
                TuitionPaymentFragmentbindingInflater1 = i36 % 128;
                int i37 = i36 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.nikPelapor, updateConfirmationRequest.nikPelapor)) {
                int i38 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
                TuitionPaymentFragmentbindingInflater1 = i38 % 128;
                int i39 = i38 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.tglLahirPelapor, updateConfirmationRequest.tglLahirPelapor)) {
                int i40 = TuitionPaymentFragmentbindingInflater1 + 63;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i40 % 128;
                return i40 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.kodePengajuan, updateConfirmationRequest.kodePengajuan)) {
                int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
                TuitionPaymentFragmentbindingInflater1 = i41 % 128;
                int i42 = i41 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.dataPenerima, updateConfirmationRequest.dataPenerima)) {
                int i43 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
                TuitionPaymentFragmentbindingInflater1 = i43 % 128;
                int i44 = i43 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.photoLiveness1, updateConfirmationRequest.photoLiveness1)) {
                int i45 = TuitionPaymentFragmentbindingInflater1 + 81;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i45 % 128;
                int i46 = i45 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.photoLiveness2, updateConfirmationRequest.photoLiveness2)) {
                return false;
            }
            if (!(!Intrinsics.areEqual(this.photoLiveness3, updateConfirmationRequest.photoLiveness3))) {
                return Intrinsics.areEqual(this.scoreLiveness, updateConfirmationRequest.scoreLiveness) && Intrinsics.areEqual(this.scoreManipulation, updateConfirmationRequest.scoreManipulation);
            }
            int i47 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
            TuitionPaymentFragmentbindingInflater1 = i47 % 128;
            int i48 = i47 % 2;
            return false;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = (String[]) objArr[1];
        if (strArr3 != null) {
            for (String str : strArr3) {
                arrayList.add(str);
            }
        }
        throw new RuntimeException(String.valueOf(i11));
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $11 + 83;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i9 = 0;
            while (i9 < length2) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr3[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i6;
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), View.MeasureSpec.getMode(i6) + 3291, 31 - TextUtils.getOffsetBefore("", i6), 1948206109, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i9++;
                    int i10 = $10 + 47;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    i4 = -1870535734;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (iArr6 != null) {
            int i12 = $10 + 25;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                Object[] objArr3 = new Object[i5];
                objArr3[0] = Integer.valueOf(iArr6[i2]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getOffsetAfter("", 0), 3291 - (ViewConfiguration.getScrollBarSize() >> 8), 31 - (ViewConfiguration.getScrollBarSize() >> 8), 1948206109, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                }
                iArr2[i2] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i2++;
                iArr6 = iArr6;
                i5 = 1;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i13 = 17;
            for (int i14 = 1; i13 > i14; i14 = 1) {
                int i15 = $10 + 17;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i13];
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2558, 29 - (ViewConfiguration.getJumpTapTimeout() >> 16), 683220507, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i13 += 113;
                } else {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i13];
                    Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), Color.blue(0) + 2559, ((byte) KeyEvent.getModifierMetaStateMask()) + 30, 683220507, false, $$g(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                    i13--;
                }
            }
            int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (Process.getGidForName("") + 28880), 347 - Process.getGidForName(""), 25 - View.resolveSizeAndState(0, 0, 0), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
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

    static {
        b = 0;
        TuitionPaymentFragmentbindingInflater1();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        b = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateConfirmationRequest copy$default(UpdateConfirmationRequest updateConfirmationRequest, String str, String str2, String str3, String str4, String str5, String str6, List list, File file, File file2, File file3, String str7, String str8, int i, Object obj) {
        String str9;
        String str10;
        List list2;
        int i2 = 2 % 2;
        String str11 = (i & 1) != 0 ? updateConfirmationRequest.emailPelapor : str;
        String str12 = (i & 2) != 0 ? updateConfirmationRequest.nikTk : str2;
        String str13 = (i & 4) != 0 ? updateConfirmationRequest.namaPelapor : str3;
        if ((i & 8) != 0) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 != 0) {
                String str14 = updateConfirmationRequest.nikPelapor;
                throw null;
            }
            str9 = updateConfirmationRequest.nikPelapor;
        } else {
            str9 = str4;
        }
        String str15 = (i & 16) != 0 ? updateConfirmationRequest.tglLahirPelapor : str5;
        if ((i & 32) != 0) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                String str16 = updateConfirmationRequest.kodePengajuan;
                throw null;
            }
            str10 = updateConfirmationRequest.kodePengajuan;
        } else {
            str10 = str6;
        }
        if ((i & 64) != 0) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            if (i5 % 2 != 0) {
                List<Penerima> list3 = updateConfirmationRequest.dataPenerima;
                throw null;
            }
            list2 = updateConfirmationRequest.dataPenerima;
        } else {
            list2 = list;
        }
        return updateConfirmationRequest.copy(str11, str12, str13, str9, str15, str10, list2, (i & 128) != 0 ? updateConfirmationRequest.photoLiveness1 : file, (i & 256) != 0 ? updateConfirmationRequest.photoLiveness2 : file2, (i & 512) != 0 ? updateConfirmationRequest.photoLiveness3 : file3, (i & 1024) != 0 ? updateConfirmationRequest.scoreLiveness : str7, (i & 2048) != 0 ? updateConfirmationRequest.scoreManipulation : str8);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 33;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.emailPelapor;
        int i5 = i3 + 113;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final File component10() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 13;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        File file = this.photoLiveness3;
        int i4 = i2 + 101;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return file;
        }
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.scoreLiveness;
        int i5 = i2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.scoreManipulation;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 25;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.nikTk;
        int i5 = i3 + 41;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.namaPelapor;
        int i4 = i2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.nikPelapor;
        int i5 = i3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 117;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.tglLahirPelapor;
        int i5 = i3 + 113;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.kodePengajuan;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<Penerima> component7() {
        List<Penerima> list;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 67;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            list = this.dataPenerima;
            int i4 = 30 / 0;
        } else {
            list = this.dataPenerima;
        }
        int i5 = i2 + 121;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final File component8() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 61;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        File file = this.photoLiveness1;
        int i4 = i2 + 3;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return file;
    }

    public final File component9() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        File file = this.photoLiveness2;
        int i5 = i3 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
        return file;
    }

    public final UpdateConfirmationRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, List<Penerima> p6, File p7, File p8, File p9, String p10, String p11) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        Intrinsics.checkNotNullParameter(p10, "");
        Intrinsics.checkNotNullParameter(p11, "");
        UpdateConfirmationRequest updateConfirmationRequest = new UpdateConfirmationRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 90 / 0;
        }
        return updateConfirmationRequest;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.emailPelapor.hashCode();
        int iHashCode3 = this.nikTk.hashCode();
        int iHashCode4 = this.namaPelapor.hashCode();
        int iHashCode5 = this.nikPelapor.hashCode();
        int iHashCode6 = this.tglLahirPelapor.hashCode();
        int iHashCode7 = this.kodePengajuan.hashCode();
        int iHashCode8 = this.dataPenerima.hashCode();
        File file = this.photoLiveness1;
        int iHashCode9 = 0;
        if (file == null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            iHashCode = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = file.hashCode();
            int i5 = TuitionPaymentFragmentbindingInflater1 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
        }
        File file2 = this.photoLiveness2;
        int iHashCode10 = file2 == null ? 0 : file2.hashCode();
        File file3 = this.photoLiveness3;
        if (file3 != null) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
            TuitionPaymentFragmentbindingInflater1 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode9 = file3.hashCode();
        }
        return (((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode10) * 31) + iHashCode9) * 31) + this.scoreLiveness.hashCode()) * 31) + this.scoreManipulation.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.emailPelapor;
        String str2 = this.nikTk;
        String str3 = this.namaPelapor;
        String str4 = this.nikPelapor;
        String str5 = this.tglLahirPelapor;
        String str6 = this.kodePengajuan;
        List<Penerima> list = this.dataPenerima;
        File file = this.photoLiveness1;
        File file2 = this.photoLiveness2;
        File file3 = this.photoLiveness3;
        String str7 = this.scoreLiveness;
        String str8 = this.scoreManipulation;
        StringBuilder sb = new StringBuilder("UpdateConfirmationRequest(emailPelapor=");
        sb.append(str);
        sb.append(", nikTk=");
        sb.append(str2);
        sb.append(", namaPelapor=");
        sb.append(str3);
        sb.append(", nikPelapor=");
        sb.append(str4);
        sb.append(", tglLahirPelapor=");
        sb.append(str5);
        sb.append(", kodePengajuan=");
        sb.append(str6);
        sb.append(", dataPenerima=");
        sb.append(list);
        sb.append(", photoLiveness1=");
        sb.append(file);
        sb.append(", photoLiveness2=");
        sb.append(file2);
        sb.append(", photoLiveness3=");
        sb.append(file3);
        sb.append(", scoreLiveness=");
        sb.append(str7);
        sb.append(", scoreManipulation=");
        sb.append(str8);
        sb.append(")");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentbindingInflater1 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new int[]{1255147, 1975380165, 1119953777, -885201291, 406739755, -770976574, -1776449532, 1608232422, 228915103, -590443964, 759983482, 68225594, 1564653908, -281074742, 1639650389, 411286196, 1121424263, 290426490};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, short r8) {
        /*
            byte[] r0 = com.bpjstku.data.scholarship.model.request.UpdateConfirmationRequest.$$c
            int r7 = r7 * 56
            int r7 = 122 - r7
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r6]
        L26:
            int r6 = r6 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.scholarship.model.request.UpdateConfirmationRequest.$$g(byte, int, short):java.lang.String");
    }
}
