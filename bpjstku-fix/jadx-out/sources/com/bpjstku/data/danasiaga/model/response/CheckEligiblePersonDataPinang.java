package com.bpjstku.data.danasiaga.model.response;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\nR$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\u001bR$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\u001bR$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\n\"\u0004\b$\u0010\u001b"}, d2 = {"Lcom/bpjstku/data/danasiaga/model/response/CheckEligiblePersonDataPinang;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/danasiaga/model/response/CheckEligiblePersonDataPinang;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kpj", "Ljava/lang/String;", "getKpj", "setKpj", "(Ljava/lang/String;)V", "kodeTk", "getKodeTk", "setKodeTk", "tglProses", "getTglProses", "setTglProses", "tglProsesMax", "getTglProsesMax", "setTglProsesMax"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CheckEligiblePersonDataPinang {
    public static final int $stable = 8;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char[] b;

    @SerializedName("kode_tk")
    private String kodeTk;

    @SerializedName("kpj")
    private String kpj;

    @SerializedName("tgl_proses")
    private String tglProses;

    @SerializedName("tgl_proses_max")
    private String tglProsesMax;
    private static final byte[] $$c = {1, -81, 2, 79};
    private static final int $$f = 96;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {83, -90, 68, -23, 8, 25, -24, 29, 8, 22, 13, -4, 15, 15, 3, -20, 37, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
    private static final int $$e = 15;
    private static final byte[] $$a = {38, 31, -70, -1, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 75;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int d = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r7 = r7 * 52
            int r7 = 56 - r7
            byte[] r0 = com.bpjstku.data.danasiaga.model.response.CheckEligiblePersonDataPinang.$$a
            int r9 = 53 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-10)
            int r8 = r8 + 1
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.danasiaga.model.response.CheckEligiblePersonDataPinang.a(int, byte, byte, java.lang.Object[]):void");
    }

    private static void e(short s, short s2, byte b2, Object[] objArr) {
        byte[] bArr = $$d;
        int i = s * 39;
        int i2 = 17 - (b2 * 13);
        int i3 = 103 - (s2 * 19);
        byte[] bArr2 = new byte[i + 14];
        int i4 = i + 13;
        int i5 = -1;
        if (bArr == null) {
            i2++;
            i3 = (i3 + i2) - 10;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b3 = bArr[i2];
                i2++;
                i3 = (i3 + b3) - 10;
            }
        }
    }

    public CheckEligiblePersonDataPinang(String str, String str2, String str3, String str4) {
        this.kpj = str;
        this.kodeTk = str2;
        this.tglProses = str3;
        this.tglProsesMax = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CheckEligiblePersonDataPinang(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = d + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 23 / 0;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
            d = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str2 = "";
        }
        str3 = (i & 4) != 0 ? "" : str3;
        if ((i & 8) != 0) {
            int i7 = 2 % 2;
            str4 = "";
        }
        this(str, str2, str3, str4);
    }

    public final String getKpj() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetBefore = (char) (31533 - TextUtils.getOffsetBefore("", 0));
            int doubleTapTimeout = 921 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int i3 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            byte b3 = bArr[80];
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 | 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, doubleTapTimeout, i3, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{1, 4, 25, 1, 31, 16, 23, 25, '#', 31, 26, 5, 24, ' ', 29, '\r', 7, '\b', '!', '#', 4, '\r'}, (byte) (TextUtils.lastIndexOf("", '0', 0) + 118), KeyEvent.normalizeMetaState(0) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{14, '#', 5, 18, '#', '\f', 20, '\r', '\f', 5, 31, 26, '\f', 7, 13937}, (byte) (114 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 31534);
            int i4 = 922 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 28;
            byte[] bArr2 = $$a;
            byte b4 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b4, b4, bArr2[80], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, i4, scrollBarSize, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 31534);
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 921;
                int minimumFlingVelocity = 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                a(bArr3[80], bArr3[7], (byte) (-bArr3[33]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iKeyCodeFromString, minimumFlingVelocity, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i5 = ~((~System.identityHashCode(this)) | 450172412);
            int i6 = ((((269747552 | i5) * (-374)) + 821028083) + ((i5 | 180424860) * 374)) - 1166129984;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{1, 4, 25, 1, 31, 16, 23, 25, 5, 18, 29, '#', '\r', 0, 31, 19, 1, 16, 26, 27, '\n', 20, '#', '\r', 1, 18}, (byte) (126 - View.MeasureSpec.getSize(0)), 25 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{4, 7, 13881, 13881, 15, 5, 24, '\r', 13883, 13883, 31, 14, 2, 1, 31, 19, '!', 4}, (byte) (81 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 18, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i9 = d + 77;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                int i10 = i9 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{30, 6, 5, 1, 26, '#', 1, 4, 17, '#', '\b', ' ', 31, 24, '\f', 11}, (byte) (70 - View.combineMeasuredStates(0, 0)), Color.alpha(0) + 16, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{19, 25, 15, 5, 31, 19, 26, 27, 24, 3, Typography.quote, 18, '\n', 31, 23, '\r'}, (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 4), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1166129984};
                byte[] bArr4 = $$d;
                byte b5 = bArr4[50];
                byte b6 = (byte) (b5 - 1);
                Object[] objArr13 = new Object[1];
                e(b6, b6, b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr4[50];
                byte b8 = b7;
                Object[] objArr14 = new Object[1];
                e(b7, b8, (byte) (b8 - 1), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char scrollBarSize2 = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 31533);
                    int i11 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 922;
                    int iMakeMeasureSpec = 28 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte[] bArr5 = $$a;
                    byte b9 = bArr5[80];
                    byte b10 = bArr5[7];
                    byte b11 = (byte) (-bArr5[33]);
                    Object[] objArr16 = new Object[1];
                    a(b9, b10, b11, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize2, i11, iMakeMeasureSpec, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{1, 4, 25, 1, 31, 16, 23, 25, '#', 31, 26, 5, 24, ' ', 29, '\r', 7, '\b', '!', '#', 4, '\r'}, (byte) (117 - ExpandableListView.getPackedPositionType(0L)), 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{14, '#', 5, 18, '#', '\f', 20, '\r', '\f', 5, 31, 26, '\f', 7, 13937}, (byte) (ExpandableListView.getPackedPositionChild(0L) + 115), 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31533);
                        int edgeSlop = 921 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int iResolveOpacity = 28 - Drawable.resolveOpacity(0, 0);
                        byte[] bArr6 = $$a;
                        byte b12 = bArr6[7];
                        Object[] objArr19 = new Object[1];
                        a(b12, b12, bArr6[80], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity, edgeSlop, iResolveOpacity, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cLastIndexOf2 = (char) (31532 - TextUtils.lastIndexOf("", '0', 0, 0));
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 921;
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 28;
                        byte[] bArr7 = $$a;
                        byte b13 = bArr7[7];
                        byte b14 = bArr7[80];
                        Object[] objArr20 = new Object[1];
                        a(b13, b14, (byte) (b14 | 52), objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf2, longPressTimeout, touchSlop, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                while (i2 < strArr.length) {
                    int i14 = d + 9;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                    if (i14 % 2 != 0) {
                        arrayList.add(strArr[i2]);
                        i2 += 103;
                    } else {
                        arrayList.add(strArr[i2]);
                        i2++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        d = i15 % 128;
        int i16 = i15 % 2;
        int i17 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int i18 = (~Process.myPid()) | 681383246;
        int i19 = i17 + 1739447958 + (i18 * 495) + (((~i18) | 69964) * 495);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr21[0])[0] = i21 ^ (i21 << 5);
        int i22 = d + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
        if (i22 % 2 == 0) {
            return this.kpj;
        }
        int i23 = 88 / 0;
        return this.kpj;
    }

    public final void setKpj(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 17;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.kpj = str;
        int i5 = i2 + 23;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final String getKodeTk() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 23;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.kodeTk;
        int i5 = i2 + 125;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setKodeTk(String str) {
        int i = 2 % 2;
        int i2 = d + 105;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        this.kodeTk = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 23;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getTglProses() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.tglProses;
        int i5 = i3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 30 / 0;
        }
        return str;
    }

    public final void setTglProses(String str) {
        int i = 2 % 2;
        int i2 = d + 31;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        this.tglProses = str;
        int i5 = i3 + 23;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTglProsesMax() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tglProsesMax;
        int i5 = i2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setTglProsesMax(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.tglProsesMax = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = b;
        int i5 = 1770390596;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 121;
                $11 = i7 % 128;
                int i8 = i7 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                        int iKeyCodeFromString = 2267 - KeyEvent.keyCodeFromString("");
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 33;
                        byte b3 = (byte) ($$c[0] - 1);
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iKeyCodeFromString, doubleTapTimeout, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    i3 = 2;
                    i5 = 1770390596;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int i9 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2266;
            int iIndexOf = 33 - TextUtils.indexOf("", "");
            byte b5 = (byte) ($$c[0] - 1);
            byte b6 = b5;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout2, i9, iIndexOf, -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i10 = $11 + 111;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                i2 = i + 119;
                cArr4[i2] = (char) (cArr[i2] / b2);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char size = (char) (View.MeasureSpec.getSize(0) + 49267);
                        int trimmedLength = TextUtils.getTrimmedLength("") + 3261;
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 30;
                        byte b7 = $$c[0];
                        byte b8 = (byte) (b7 - 1);
                        byte b9 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size, trimmedLength, scrollDefaultDelay, -127612708, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        int i11 = $11 + 115;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 22878);
                            int iBlue = Color.blue(0) + 594;
                            int iIndexOf2 = 17 - TextUtils.indexOf("", "", 0, 0);
                            byte b10 = (byte) ($$c[0] - 1);
                            byte b11 = (byte) (b10 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSizeAndState, iBlue, iIndexOf2, 1570859318, false, $$g(b10, b11, (byte) (b11 - 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                        } else {
                            int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            int i19 = $10 + 111;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = TuitionPaymentFragmentbindingInflater1 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CheckEligiblePersonDataPinang() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ CheckEligiblePersonDataPinang copy$default(CheckEligiblePersonDataPinang checkEligiblePersonDataPinang, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = checkEligiblePersonDataPinang.kpj;
        }
        if ((i & 2) != 0) {
            str2 = checkEligiblePersonDataPinang.kodeTk;
        }
        if ((i & 4) != 0) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
            d = i3 % 128;
            if (i3 % 2 == 0) {
                str3 = checkEligiblePersonDataPinang.tglProses;
                int i4 = 91 / 0;
            } else {
                str3 = checkEligiblePersonDataPinang.tglProses;
            }
        }
        if ((i & 8) != 0) {
            int i5 = d + 97;
            int i6 = i5 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6;
            if (i5 % 2 != 0) {
                String str5 = checkEligiblePersonDataPinang.tglProsesMax;
                throw null;
            }
            str4 = checkEligiblePersonDataPinang.tglProsesMax;
            int i7 = i6 + 81;
            d = i7 % 128;
            int i8 = i7 % 2;
        }
        return checkEligiblePersonDataPinang.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        d = i2 % 128;
        int i3 = i2 % 2;
        String str = this.kpj;
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 125;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.kodeTk;
        int i5 = i2 + 113;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.tglProses;
        int i4 = i2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 19;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tglProsesMax;
        int i5 = i2 + 69;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final CheckEligiblePersonDataPinang copy(String p0, String p1, String p2, String p3) {
        int i = 2 % 2;
        CheckEligiblePersonDataPinang checkEligiblePersonDataPinang = new CheckEligiblePersonDataPinang(p0, p1, p2, p3);
        int i2 = d + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return checkEligiblePersonDataPinang;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
            d = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(p0 instanceof CheckEligiblePersonDataPinang)) {
            return false;
        }
        CheckEligiblePersonDataPinang checkEligiblePersonDataPinang = (CheckEligiblePersonDataPinang) p0;
        Object obj = null;
        if (!Intrinsics.areEqual(this.kpj, checkEligiblePersonDataPinang.kpj)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.kodeTk, checkEligiblePersonDataPinang.kodeTk) || !Intrinsics.areEqual(this.tglProses, checkEligiblePersonDataPinang.tglProses)) {
            return false;
        }
        if (Intrinsics.areEqual(this.tglProsesMax, checkEligiblePersonDataPinang.tglProsesMax)) {
            return true;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.kpj;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.kodeTk;
        if (str2 == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
            int i3 = i2 % 128;
            d = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 4;
            }
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.tglProses;
        if (str3 == null) {
            int i7 = d + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            iHashCode2 = i7 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.tglProsesMax;
        return (((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.kpj;
        String str2 = this.kodeTk;
        String str3 = this.tglProses;
        String str4 = this.tglProsesMax;
        StringBuilder sb = new StringBuilder("CheckEligiblePersonDataPinang(kpj=");
        sb.append(str);
        sb.append(", kodeTk=");
        sb.append(str2);
        sb.append(", tglProses=");
        sb.append(str3);
        sb.append(", tglProsesMax=");
        sb.append(str4);
        sb.append(")");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        d = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        b = new char[]{60058, 60056, 60072, 60053, 60045, 59748, 60054, 60088, 60079, 59746, 60046, 60060, 60090, 60050, 60073, 59749, 60048, 60062, 59750, 60063, 59745, 59751, 60051, 60043, 60049, 60047, 60034, 60083, 59744, 60117, 60040, 60041, 60055, 59747, 60052, 60061};
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 57191;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, int r6, int r7) {
        /*
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r0 = com.bpjstku.data.danasiaga.model.response.CheckEligiblePersonDataPinang.$$c
            int r6 = r6 + 113
            int r5 = r5 * 4
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
        L26:
            int r6 = r6 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.danasiaga.model.response.CheckEligiblePersonDataPinang.$$g(byte, int, int):java.lang.String");
    }
}
