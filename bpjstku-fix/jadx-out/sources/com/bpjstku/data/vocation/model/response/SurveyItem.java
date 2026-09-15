package com.bpjstku.data.vocation.model.response;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
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
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\tR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/bpjstku/data/vocation/model/response/SurveyItem;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/vocation/model/response/SurveyItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "remarks", "Ljava/lang/String;", "getRemarks", "surveyCode", "getSurveyCode", "surveyName", "getSurveyName"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SurveyItem {
    public static final int $stable = 0;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @SerializedName("keterangan")
    private final String remarks;

    @SerializedName("kodeSurvey")
    private final String surveyCode;

    @SerializedName("namaSurvey")
    private final String surveyName;
    private static final byte[] $$c = {58, 66, -1, 15};
    private static final int $$f = 9;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {111, 40, 23, -13, -13, 1, 62, -53, -15, 5, -10, -2, 8, -11, 70, -55, 2, -20, 18, 50, -55, -6, 1, -3, -12, 18, -12, 8, 1, -18, 13, 53, -64, -3, 10, -2, -8, Base64.padSymbol, -69, 12, -13, -5, 15, -15, -2, 69, -23, -38, 1, -3, -12, 18, -12, 40, -31, -18, 13, 17, -20, -13, -5, 15, -15, -2, -34, 11, -12, 10, -7, 0, 29, -18, -25, 11, 7, -10, -7, 45, -45, 16, -7, -7, 7, -10, -7, 17, -8, -6, 9, -6, -6, 6, 29, -38, 7, -7, 10, -20, 14, -14, 64};
    private static final int $$e = 234;
    private static final byte[] $$a = {109, 84, -87, -114, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 197;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static int b = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 15
            int r0 = r8 + 38
            int r7 = r7 * 2
            int r7 = 84 - r7
            byte[] r1 = com.bpjstku.data.vocation.model.response.SurveyItem.$$a
            byte[] r0 = new byte[r0]
            int r8 = r8 + 37
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L30
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.vocation.model.response.SurveyItem.a(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.data.vocation.model.response.SurveyItem.$$d
            int r6 = r6 * 15
            int r6 = 99 - r6
            int r7 = r7 * 23
            int r7 = r7 + 38
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2d
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-1)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.vocation.model.response.SurveyItem.d(int, byte, byte, java.lang.Object[]):void");
    }

    public SurveyItem(String str, String str2, String str3) {
        this.remarks = str;
        this.surveyCode = str2;
        this.surveyName = str3;
    }

    public final String getRemarks() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 79;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.remarks;
        int i4 = i3 + 103;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getSurveyCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.surveyCode;
        int i5 = i2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSurveyName() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.surveyName;
        int i5 = i2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return str;
    }

    public final int hashCode() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        String str = this.remarks;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.surveyCode;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.surveyName;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cArgb = (char) Color.argb(0, 0, 0, 0);
            int packedPositionGroup = 876 - ExpandableListView.getPackedPositionGroup(0L);
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 10;
            byte[] bArr = $$a;
            byte b2 = bArr[28];
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, packedPositionGroup, maxKeyCode, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{0, 22, 198, 14}, false, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{22, 15, 176, 2}, false, new byte[]{1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 877;
            int minimumFlingVelocity = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a((byte) (bArr2[17] + 1), bArr2[7], bArr2[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iLastIndexOf, minimumFlingVelocity, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                int bitsPerPixel = 875 - ImageFormat.getBitsPerPixel(0);
                int i4 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9;
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) 88, bArr3[7], bArr3[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, bitsPerPixel, i4, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~((-1065887512) | iIdentityHashCode);
            int i6 = ~iIdentityHashCode;
            int i7 = (((938873764 + ((i5 | (~((-1025577283) | i6))) * (-1808))) + (((~((-42477078) | iIdentityHashCode)) | (~(i6 | (-2166849)))) * TypedValues.Custom.TYPE_BOOLEAN)) + ((((~(iIdentityHashCode | 1025577282)) | 1023410434) | (~(1065887511 | i6))) * TypedValues.Custom.TYPE_BOOLEAN)) - 1952843048;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{37, 26, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{63, 18, 0, 0}, false, new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = TuitionPaymentFragmentbindingInflater1 + 5;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                int i11 = i10 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new int[]{81, 16, 0, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new int[]{97, 16, 37, 1}, true, null, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1952843048};
                byte[] bArr4 = $$d;
                byte b4 = bArr4[69];
                byte b5 = bArr4[5];
                Object[] objArr13 = new Object[1];
                d(b4, b5, (byte) (-b5), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr4[5];
                byte b7 = bArr4[69];
                Object[] objArr14 = new Object[1];
                d(b6, b7, (byte) (b7 | 59), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int iGreen = 876 - Color.green(0);
                        int iIndexOf = 9 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        byte[] bArr5 = $$a;
                        Object[] objArr16 = new Object[1];
                        a((byte) 88, bArr5[7], bArr5[5], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(trimmedLength, iGreen, iIndexOf, 2012931276, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new int[]{0, 22, 198, 14}, false, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new int[]{22, 15, 176, 2}, false, new byte[]{1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                            int iKeyCodeFromString = 876 - KeyEvent.keyCodeFromString("");
                            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 11;
                            byte[] bArr6 = $$a;
                            Object[] objArr19 = new Object[1];
                            a((byte) (bArr6[17] + 1), bArr6[7], bArr6[5], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize, iKeyCodeFromString, iLastIndexOf2, 2012020043, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 877;
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 11;
                            byte[] bArr7 = $$a;
                            byte b8 = bArr7[28];
                            byte b9 = bArr7[7];
                            Object[] objArr20 = new Object[1];
                            a(b8, b9, b9, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, iIndexOf2, packedPositionChild, -1650998592, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr15 = objArr15;
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
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            throw null;
        }
        int i12 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i13 = ~((-271385252) | startElapsedRealtime);
        int i14 = 1665271852 + ((327810 | i13) * (-280)) + ((i13 | (~(231075022 | startElapsedRealtime))) * 140);
        int i15 = ~((-271057442) | startElapsedRealtime);
        int i16 = ~startElapsedRealtime;
        int i17 = i12 + i14 + (((~(i16 | 502132463)) | i15 | (~((-327811) | i16))) * 140);
        int i18 = (i17 << 13) ^ i17;
        int i19 = i18 ^ (i18 >>> 17);
        Object obj = objArr21[1];
        ((int[]) obj)[0] = i19 ^ (i19 << 5);
        int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        TuitionPaymentFragmentbindingInflater1 = i20 % 128;
        int i21 = i20 % 2;
        int i22 = (iHashCode * 31) + iHashCode2;
        int i23 = ((int[]) obj)[0];
        int i24 = i23 * i23;
        int i25 = -(525345286 * i23);
        int i26 = (i24 & i25) + (i24 | i25);
        int i27 = -(i23 * (-1213721734));
        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
        int i29 = (i28 & 1825280000) + (1825280000 | i28);
        int i30 = i29 >> 27;
        int i31 = i30 & (-63);
        int i32 = ((i30 | (-63)) + i31) / 32;
        int i33 = ((i32 | 1) << 1) - (i32 ^ 1);
        int i34 = ((i30 ^ (-63)) + (i31 << 1)) / 32;
        int i35 = (-((((i29 | i33) << 1) - (i29 ^ i33)) ^ ((i34 & 1) + (i34 | 1)))) + 4;
        int i36 = ((i35 >> 26) + ComposerKt.defaultsKey) / 64;
        int i37 = ((i36 | 1) << 1) - (i36 ^ 1);
        return (i22 * (16740 / ((i35 & (-(((i37 | 1) << 1) - (i37 ^ 1)))) * 135))) + iHashCode3;
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        char c = 2;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        char c2 = '0';
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = new Object[i5];
                    objArr2[i3] = Integer.valueOf(cArr[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int i10 = 1270 - (TypedValue.complexToFloat(i3) > 0.0f ? 1 : (TypedValue.complexToFloat(i3) == 0.0f ? 0 : -1));
                        int iLastIndexOf = 17 - TextUtils.lastIndexOf("", c2, i3, i3);
                        byte b2 = $$c[c];
                        byte b3 = (byte) (b2 + 1);
                        byte b4 = (byte) (-b2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength, i10, iLastIndexOf, 407021364, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i9++;
                    c = 2;
                    i3 = 0;
                    i5 = 1;
                    c2 = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i4, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            setvideostabilizationmode.b = 0;
            char c3 = 0;
            while (setvideostabilizationmode.b < i6) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i11 = $11 + 9;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = setvideostabilizationmode.b;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c3)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                int iAxisFromString = 3224 - MotionEvent.axisFromString("");
                                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 13;
                                byte b5 = (byte) ($$c[2] + 1);
                                byte b6 = b5;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, iAxisFromString, offsetAfter, 2133916302, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            throw null;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    int i13 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 3225;
                        int size = 13 - View.MeasureSpec.getSize(0);
                        byte b7 = (byte) ($$c[2] + 1);
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, iIndexOf, size, 2133916302, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    int i14 = $10 + 85;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                } else {
                    int i16 = setvideostabilizationmode.b;
                    Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29944);
                        int i17 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1754;
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 24;
                        byte b9 = (byte) ($$c[2] + 1);
                        byte b10 = (byte) (b9 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(windowTouchSlop, i17, iLastIndexOf2, 387247676, false, $$g(b9, b10, (byte) (b10 - 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                }
                c3 = cArr4[setvideostabilizationmode.b];
                Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 41241);
                    int modifierMetaStateMask = 1704 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int keyRepeatTimeout = 21 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte b11 = $$c[2];
                    byte b12 = (byte) (b11 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cNormalizeMetaState, modifierMetaStateMask, keyRepeatTimeout, -1434471773, false, $$g(b12, (byte) (b12 | 6), (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i18 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i18, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i18);
            int i19 = $11 + 107;
            $10 = i19 % 128;
            i = 2;
            int i20 = i19 % 2;
        } else {
            i = 2;
        }
        if (z) {
            int i21 = $10 + 49;
            $11 = i21 % 128;
            int i22 = i21 % i;
            char[] cArr6 = new char[i6];
            int i23 = 0;
            while (true) {
                setvideostabilizationmode.b = i23;
                if (setvideostabilizationmode.b >= i6) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr3[(i6 - setvideostabilizationmode.b) - 1];
                i23 = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i24 = 0;
            while (true) {
                setvideostabilizationmode.b = i24;
                if (setvideostabilizationmode.b >= i6) {
                    break;
                }
                int i25 = $10 + 7;
                $11 = i25 % 128;
                int i26 = i25 % 2;
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i24 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = b + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ SurveyItem copy$default(SurveyItem surveyItem, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        int i4 = i3 % 128;
        TuitionPaymentFragmentbindingInflater1 = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            str = surveyItem.remarks;
            int i5 = i4 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            str2 = surveyItem.surveyCode;
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
            TuitionPaymentFragmentbindingInflater1 = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i & 4) != 0) {
            str3 = surveyItem.surveyName;
        }
        return surveyItem.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.remarks;
        int i5 = i2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 36 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 117;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.surveyCode;
        int i4 = i3 + 85;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.surveyName;
        }
        throw null;
    }

    public final SurveyItem copy(String p0, String p1, String p2) {
        int i = 2 % 2;
        SurveyItem surveyItem = new SurveyItem(p0, p1, p2);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        return surveyItem;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(p0 instanceof SurveyItem)) {
            return false;
        }
        SurveyItem surveyItem = (SurveyItem) p0;
        if (!Intrinsics.areEqual(this.remarks, surveyItem.remarks) || !Intrinsics.areEqual(this.surveyCode, surveyItem.surveyCode)) {
            return false;
        }
        if (Intrinsics.areEqual(this.surveyName, surveyItem.surveyName)) {
            return true;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.remarks;
        String str2 = this.surveyCode;
        String str3 = this.surveyName;
        StringBuilder sb = new StringBuilder("SurveyItem(remarks=");
        sb.append(str);
        sb.append(", surveyCode=");
        sb.append(str2);
        sb.append(", surveyName=");
        sb.append(str3);
        sb.append(")");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentbindingInflater1 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new char[]{59793, 59452, 59421, 59405, 59431, 59447, 59442, 59449, 59428, 59413, 59414, 59448, 59428, 59430, 59431, 59430, 59428, 59450, 59453, 59449, 59431, 59396, 59781, 59410, 59422, 59411, 59421, 59411, 59434, 59415, 59423, 59392, 59392, 59416, 59421, 59435, 59413, 59707, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59724, 59747, 59771, 59716, 59708, 59737, 59744, 59749, 59748, 59748, 59749, 59773, 59757, 59733, 59750, 59744, 59752, 59753, 59706, 59751, 59768, 59769, 59744, 59746, 59770, 59729, 59731, 59771, 59749, 59745, 59757, 59753, 59745, 59749, 59751, 59749, 59709, 59746, 59751, 59768, 59773, 59757, 59723, 59713, 59745, 59756, 59757, 59718, 59724, 59744, 59744, 59758, 59781, 59777, 59778, 59807, 59747, 59782, 59795, 59789, 59750, 59797, 59794, 59781, 59794, 59800, 59777, 59778};
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
    private static java.lang.String $$g(short r7, int r8, short r9) {
        /*
            int r9 = r9 * 2
            int r9 = 3 - r9
            byte[] r0 = com.bpjstku.data.vocation.model.response.SurveyItem.$$c
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r8 = r8 + 99
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r5 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            int r9 = r9 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r8 = r8 + r9
            r9 = r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.vocation.model.response.SurveyItem.$$g(short, int, short):java.lang.String");
    }
}
