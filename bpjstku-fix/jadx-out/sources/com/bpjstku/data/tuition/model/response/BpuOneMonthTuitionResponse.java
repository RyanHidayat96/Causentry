package com.bpjstku.data.tuition.model.response;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJL\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u000bR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u000bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/tuition/model/response/BpuOneMonthTuitionResponse;", "", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/tuition/model/response/BpuOneMonthTuitionResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "iuranJkk", "Ljava/lang/String;", "getIuranJkk", "iuranJht", "getIuranJht", "iuranJkm", "getIuranJkm", "iuranTotal", "getIuranTotal", "customField", "getCustomField"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BpuOneMonthTuitionResponse {
    public static final int $stable = 0;
    private static char[] TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @SerializedName("customField")
    private final String customField;

    @SerializedName("iuran_jht")
    private final String iuranJht;

    @SerializedName("iuran_jkk")
    private final String iuranJkk;

    @SerializedName("iuran_jkm")
    private final String iuranJkm;

    @SerializedName("iuran_total")
    private final String iuranTotal;
    private static final byte[] $$c = {27, 65, -33, 120};
    private static final int $$f = 163;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {88, 99, -94, -58, -3, 26, -36, 54, 4, 5, 13, 20, 17, -4, 24, -37, 56, 17, 4, 1, 26, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 142;
    private static final byte[] $$a = {88, 99, -94, -58, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
    private static final int $$b = 251;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int b = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = 100 - r8
            byte[] r0 = com.bpjstku.data.tuition.model.response.BpuOneMonthTuitionResponse.$$a
            int r6 = 11 - r6
            int r7 = r7 * 10
            int r7 = r7 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r7]
        L27:
            int r7 = r7 + 1
            int r8 = r8 + r3
            int r8 = r8 + (-5)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.tuition.model.response.BpuOneMonthTuitionResponse.a(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.data.tuition.model.response.BpuOneMonthTuitionResponse.$$d
            int r7 = r7 * 35
            int r7 = r7 + 18
            int r6 = r6 * 31
            int r6 = r6 + 84
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r5 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
        L28:
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.tuition.model.response.BpuOneMonthTuitionResponse.d(short, int, byte, java.lang.Object[]):void");
    }

    public BpuOneMonthTuitionResponse(String str, String str2, String str3, String str4, String str5) {
        this.iuranJkk = str;
        this.iuranJht = str2;
        this.iuranJkm = str3;
        this.iuranTotal = str4;
        this.customField = str5;
    }

    public final String getIuranJkk() {
        int i = 2 % 2;
        int i2 = b + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.iuranJkk;
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return str;
    }

    public final String getIuranJht() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.iuranJht;
        }
        throw null;
    }

    public final String getIuranJkm() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 27;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.iuranJkm;
        int i4 = i2 + 53;
        b = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getIuranTotal() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.iuranTotal;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCustomField() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.customField;
        int i5 = i3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component1() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int maxKeyCode = 876 - (KeyEvent.getMaxKeyCode() >> 16);
            int iRgb = (-16777206) - Color.rgb(0, 0, 0);
            byte b2 = $$a[11];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 + 1), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, maxKeyCode, iRgb, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{0, 22, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{22, 15, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
            int iLastIndexOf = 875 - TextUtils.lastIndexOf("", '0', 0);
            int i2 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9;
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr[17], (byte) ($$b & 5), bArr[11], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, iLastIndexOf, i2, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int i3 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 875;
                int i4 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10;
                byte b4 = (byte) ($$b & 7);
                byte b5 = (byte) (b4 - 2);
                Object[] objArr6 = new Object[1];
                a(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, i3, i4, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ((((~((~iIdentityHashCode) | 267255551)) * 130) + 382640300) + (((~(iIdentityHashCode | 267255551)) | 316564) * 130)) - 2058395617;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{37, 16, 180, 11}, true, new byte[]{1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{53, 16, 0, 0}, true, new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i8 = b + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr10 = {Integer.valueOf(iIntValue), -2058395617};
                byte[] bArr2 = $$d;
                Object[] objArr11 = new Object[1];
                d(bArr2[19], bArr2[24], bArr2[22], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                d(bArr2[24], bArr2[19], bArr2[50], objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
                    int keyRepeatDelay = 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    byte b6 = (byte) ($$b & 7);
                    byte b7 = (byte) (b6 - 2);
                    Object[] objArr14 = new Object[1];
                    a(b6, b7, b7, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, scrollDefaultDelay, keyRepeatDelay, 1324201839, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    c(new int[]{0, 22, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(new int[]{22, 15, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int scrollDefaultDelay2 = 876 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int absoluteGravity = 10 - Gravity.getAbsoluteGravity(0, 0);
                        byte[] bArr3 = $$a;
                        Object[] objArr17 = new Object[1];
                        a(bArr3[17], (byte) ($$b & 5), bArr3[11], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionType, scrollDefaultDelay2, absoluteGravity, 254769921, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int i10 = 876 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iLastIndexOf2 = 9 - TextUtils.lastIndexOf("", '0');
                        byte b8 = $$a[11];
                        byte b9 = b8;
                        Object[] objArr18 = new Object[1];
                        a(b8, b9, (byte) (b9 + 1), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cCombineMeasuredStates, i10, iLastIndexOf2, -1199417970, false, (String) objArr18[0], null);
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
        if (((int[]) objArr[0])[0] == ((int[]) objArr[2])[0]) {
            int i11 = ((int[]) objArr[1])[0];
            Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i12 = (int) Runtime.getRuntime().totalMemory();
            int i13 = ~i12;
            int i14 = i11 + 502738392 + (((~(741910423 | i13)) | (~((-2097812) | i12))) * (-831)) + ((~(784318463 | i12)) * (-1662)) + (((~(i12 | (-741910424))) | (~(i13 | (-782220653))) | (~(782220652 | i12))) * 831);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr19[1])[0] = i16 ^ (i16 << 5);
            return this.iuranJkk;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[3];
        if (strArr == null) {
            throw null;
        }
        int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        b = i17 % 128;
        for (int i18 = i17 % 2 != 0 ? 0 : 1; i18 < strArr.length; i18++) {
            int i19 = b + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
            int i20 = i19 % 2;
            arrayList.add(strArr[i18]);
        }
        throw null;
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c;
        int length;
        char[] cArr2;
        int i = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr3 = TuitionPaymentFragmentbindingInflater1;
        if (cArr3 != null) {
            int i7 = $10 + 71;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i2] = Integer.valueOf(cArr3[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i2;
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.green(i2), 1270 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 18 - (ViewConfiguration.getWindowTouchSlop() >> 8), 407021364, false, $$g(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr3, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i9 = $10 + 37;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr = new char[i4];
                setvideostabilizationmode.b = 0;
                c = 1;
            } else {
                cArr = new char[i4];
                setvideostabilizationmode.b = 0;
                c = 0;
            }
            while (setvideostabilizationmode.b < i4) {
                int i10 = $11 + 97;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i12 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.myTid() >> 22), TextUtils.getOffsetAfter("", 0) + 3225, View.MeasureSpec.makeMeasureSpec(0, 0) + 13, 2133916302, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i13 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29944), 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 387247676, false, $$g(b6, b7, (byte) (b7 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.rgb(0, 0, 0) + 16818457), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1705, (ViewConfiguration.getJumpTapTimeout() >> 16) + 21, -1434471773, false, $$g(b8, b9, (byte) (b9 & 6)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr4, 0, cArr5, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr4, i14, i6);
            System.arraycopy(cArr5, i6, cArr4, 0, i14);
        }
        if (z) {
            int i15 = $10 + 101;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr6 = new char[i4];
            int i17 = 0;
            while (true) {
                setvideostabilizationmode.b = i17;
                if (setvideostabilizationmode.b >= i4) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr4[(i4 - setvideostabilizationmode.b) - 1];
                i17 = setvideostabilizationmode.b + 1;
            }
            cArr4 = cArr6;
        }
        if (i5 > 0) {
            int i18 = $11 + 103;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            int i20 = 0;
            while (true) {
                setvideostabilizationmode.b = i20;
                if (setvideostabilizationmode.b >= i4) {
                    break;
                }
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                i20 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        if (i % 2 == 0) {
            int i2 = 81 / 0;
        }
    }

    public static /* synthetic */ BpuOneMonthTuitionResponse copy$default(BpuOneMonthTuitionResponse bpuOneMonthTuitionResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        String str6;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
            b = i3 % 128;
            int i4 = i3 % 2;
            str = bpuOneMonthTuitionResponse.iuranJkk;
        }
        String str7 = str;
        if ((i & 2) != 0) {
            str2 = bpuOneMonthTuitionResponse.iuranJht;
        }
        String str8 = str2;
        Object obj2 = null;
        if ((i & 4) != 0) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                String str9 = bpuOneMonthTuitionResponse.iuranJkm;
                obj2.hashCode();
                throw null;
            }
            str3 = bpuOneMonthTuitionResponse.iuranJkm;
        }
        String str10 = str3;
        if ((i & 8) != 0) {
            int i6 = b + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            if (i6 % 2 != 0) {
                str6 = bpuOneMonthTuitionResponse.iuranTotal;
                int i7 = 36 / 0;
            } else {
                str6 = bpuOneMonthTuitionResponse.iuranTotal;
            }
            str4 = str6;
        }
        String str11 = str4;
        if ((i & 16) != 0) {
            int i8 = b + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
            if (i8 % 2 != 0) {
                String str12 = bpuOneMonthTuitionResponse.customField;
                throw null;
            }
            str5 = bpuOneMonthTuitionResponse.customField;
        }
        return bpuOneMonthTuitionResponse.copy(str7, str8, str10, str11, str5);
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = b + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.iuranJht;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.iuranJkm;
        int i5 = i3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = b + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.iuranTotal;
        }
        throw null;
    }

    public final String component5() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 == 0) {
            str = this.customField;
            int i4 = 54 / 0;
        } else {
            str = this.customField;
        }
        int i5 = i3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final BpuOneMonthTuitionResponse copy(String p0, String p1, String p2, String p3, String p4) {
        int i = 2 % 2;
        BpuOneMonthTuitionResponse bpuOneMonthTuitionResponse = new BpuOneMonthTuitionResponse(p0, p1, p2, p3, p4);
        int i2 = b + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return bpuOneMonthTuitionResponse;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = b + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(p0 instanceof BpuOneMonthTuitionResponse)) {
            int i4 = b + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            return i4 % 2 != 0;
        }
        BpuOneMonthTuitionResponse bpuOneMonthTuitionResponse = (BpuOneMonthTuitionResponse) p0;
        if (!Intrinsics.areEqual(this.iuranJkk, bpuOneMonthTuitionResponse.iuranJkk)) {
            int i5 = b + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            return i5 % 2 != 0;
        }
        if ((!Intrinsics.areEqual(this.iuranJht, bpuOneMonthTuitionResponse.iuranJht)) || !Intrinsics.areEqual(this.iuranJkm, bpuOneMonthTuitionResponse.iuranJkm)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.iuranTotal, bpuOneMonthTuitionResponse.iuranTotal)) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
            b = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.customField, bpuOneMonthTuitionResponse.customField)) {
            return false;
        }
        int i7 = b + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        b = i2 % 128;
        int i3 = i2 % 2;
        String str = this.iuranJkk;
        int iHashCode3 = 0;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.iuranJht;
        if (str2 == null) {
            int i4 = b + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.iuranJkm;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.iuranTotal;
        if (str4 == null) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i7 = i6 + 93;
            b = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 53;
            b = i9 % 128;
            int i10 = i9 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.customField;
        if (str5 != null) {
            int i11 = b + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
            int i12 = i11 % 2;
            iHashCode3 = str5.hashCode();
        }
        return (((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.iuranJkk;
        String str2 = this.iuranJht;
        String str3 = this.iuranJkm;
        String str4 = this.iuranTotal;
        String str5 = this.customField;
        StringBuilder sb = new StringBuilder("BpuOneMonthTuitionResponse(iuranJkk=");
        sb.append(str);
        sb.append(", iuranJht=");
        sb.append(str2);
        sb.append(", iuranJkm=");
        sb.append(str3);
        sb.append(", iuranTotal=");
        sb.append(str4);
        sb.append(", customField=");
        sb.append(str5);
        sb.append(")");
        String string = sb.toString();
        int i2 = b + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 20 / 0;
        }
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentbindingInflater1 = new char[]{59707, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59717, 59770, 59739, 59723, 59757, 59773, 59768, 59751, 59746, 59731, 59740, 59750, 59746, 59756, 59705, 59747, 59757, 59747, 59770, 59751, 59759, 59728, 59728, 59752, 59757, 59771, 59749, 59744, 59746, 59784, 59903, 59893, 59413, 59408, 59409, 59402, 59888, 59412, 59412, 59410, 59412, 59414, 59435, 59436, 59425, 59705, 59759, 59746, 59730, 59742, 59750, 59745, 59743, 59755, 59773, 59749, 59749, 59770, 59746, 59759, 59757};
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
    private static java.lang.String $$g(int r7, int r8, byte r9) {
        /*
            int r9 = r9 + 99
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r8 = r8 + 4
            byte[] r0 = com.bpjstku.data.tuition.model.response.BpuOneMonthTuitionResponse.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L29:
            int r8 = r8 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.tuition.model.response.BpuOneMonthTuitionResponse.$$g(int, int, byte):java.lang.String");
    }
}
