package com.bpjstku.data.jht.model.request;

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
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/bpjstku/data/jht/model/request/ClaimEvidenceJhtRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jht/model/request/ClaimEvidenceJhtRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", "type", "getType", "evidenceCode", "getEvidenceCode"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ClaimEvidenceJhtRequest extends BaseRequest {
    public static final int $stable = 0;
    private static short[] TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asBinder;
    private static int b;

    @SerializedName("email")
    private final String email;

    @SerializedName("evidenceCode")
    private final String evidenceCode;

    @SerializedName("type")
    private final String type;
    private static final byte[] $$c = {Base64.padSymbol, -108, 49, -100};
    private static final int $$f = 33;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {102, -96, -78, -55, 4, -25, 23, -38, -16, -7, 5, -12, 21, -51, -13, -5, 2, -29, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
    private static final int $$e = 204;
    private static final byte[] $$a = {81, -102, -70, -91, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 160;
    private static int asInterface = 0;
    private static int g = 1;
    private static int d = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 15
            int r0 = r5 + 38
            int r7 = 93 - r7
            byte[] r1 = com.bpjstku.data.jht.model.request.ClaimEvidenceJhtRequest.$$a
            int r6 = r6 * 4
            int r6 = r6 + 84
            byte[] r0 = new byte[r0]
            int r5 = r5 + 37
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
        L28:
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.model.request.ClaimEvidenceJhtRequest.a(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 38
            int r7 = 53 - r7
            byte[] r0 = com.bpjstku.data.jht.model.request.ClaimEvidenceJhtRequest.$$d
            int r9 = r9 * 14
            int r9 = 17 - r9
            int r8 = r8 * 31
            int r8 = r8 + 84
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r5 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            int r9 = r9 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2d:
            int r9 = -r9
            int r8 = r8 + r9
            int r8 = r8 + (-10)
            r9 = r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.model.request.ClaimEvidenceJhtRequest.e(short, byte, byte, java.lang.Object[]):void");
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 7;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.email;
        int i5 = i2 + 35;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.type;
        }
        throw null;
    }

    public final String getEvidenceCode() {
        int i = 2 % 2;
        int i2 = g + 43;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return this.evidenceCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ClaimEvidenceJhtRequest(String str, String str2, String str3) {
        this.email = str;
        this.type = str2;
        this.evidenceCode = str3;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0282  */
    /* JADX WARN: Code duplicated, block: B:27:0x028c  */
    public final ClaimEvidenceJhtRequest copy(String p0, String p1, String p2) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 876;
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 | 89), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter, threadPriority, keyRepeatDelay, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(1619458438 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-88) - Color.blue(0), (short) (32 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (byte) (17 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), View.resolveSizeAndState(0, 0, 0) - 1665621445, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c((ViewConfiguration.getWindowTouchSlop() >> 8) + 1619458443, ExpandableListView.getPackedPositionType(0L) - 95, (short) ((-102) - Color.alpha(0)), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 51), KeyEvent.keyCodeFromString("") - 1665621424, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int iArgb = 876 - Color.argb(0, 0, 0, 0);
            int scrollDefaultDelay = 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            byte[] bArr = $$a;
            byte b4 = bArr[28];
            byte b5 = bArr[7];
            Object[] objArr5 = new Object[1];
            a(b4, b5, (byte) (b5 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iArgb, scrollDefaultDelay, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int iArgb2 = 876 - Color.argb(0, 0, 0, 0);
                int i2 = 10 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                byte[] bArr2 = $$a;
                byte b6 = bArr2[28];
                byte b7 = bArr2[7];
                Object[] objArr6 = new Object[1];
                a(b6, b7, b7, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(jumpTapTimeout, iArgb2, i2, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = ~iIdentityHashCode;
            int i4 = ((1317891739 + ((((~(i3 | (-802239433))) | 230765120) | (~((-271075350) | iIdentityHashCode))) * 717)) + (((~(iIdentityHashCode | (-802239433))) | ((~(i3 | (-271075350))) | 230765120)) * 717)) - 920475359;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(1619458440 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (-84) - TextUtils.getOffsetAfter("", 0), (short) (TextUtils.indexOf("", "") + 49), (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) - 15), (-1665621409) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(1619458441 - (ViewConfiguration.getTouchSlop() >> 8), View.resolveSize(0, 0) - 92, (short) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 57), (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8), (-1665621385) - Drawable.resolveOpacity(0, 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i7 = g + 27;
                asInterface = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 41 / 0;
                    if (applicationContext instanceof ContextWrapper) {
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    }
                } else if (applicationContext instanceof ContextWrapper) {
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = null;
                    }
                }
                applicationContext = applicationContext.getApplicationContext();
            }
            int length = p0 != null ? p0.length() : 0;
            int i9 = asInterface + 121;
            g = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(length), 0, -920475359};
                byte[] bArr3 = $$d;
                byte b8 = bArr3[21];
                byte b9 = b8;
                Object[] objArr11 = new Object[1];
                e(b8, b9, b9, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b10 = (byte) (bArr3[21] - 1);
                byte b11 = b10;
                Object[] objArr12 = new Object[1];
                e(b10, b11, b11, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                if (applicationContext != null) {
                    int i11 = asInterface + 35;
                    g = i11 % 128;
                    int i12 = i11 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int maximumFlingVelocity = 876 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 10;
                        byte[] bArr4 = $$a;
                        byte b12 = bArr4[28];
                        byte b13 = bArr4[7];
                        Object[] objArr13 = new Object[1];
                        a(b12, b13, b13, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatDelay2, maximumFlingVelocity, touchSlop, 2012931276, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr14 = new Object[1];
                        c((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1619458439, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 88, (short) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 32), (byte) (17 - (KeyEvent.getMaxKeyCode() >> 16)), (-1665621446) - ExpandableListView.getPackedPositionChild(0L), objArr14);
                        Class<?> cls4 = Class.forName((String) objArr14[0]);
                        Object[] objArr15 = new Object[1];
                        c((ViewConfiguration.getJumpTapTimeout() >> 16) + 1619458443, TextUtils.getTrimmedLength("") - 95, (short) ((-103) - TextUtils.lastIndexOf("", '0', 0)), (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 50), View.resolveSizeAndState(0, 0, 0) - 1665621424, objArr15);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                            int modifierMetaStateMask = 875 - ((byte) KeyEvent.getModifierMetaStateMask());
                            int iResolveSize = View.resolveSize(0, 0) + 10;
                            byte[] bArr5 = $$a;
                            byte b14 = bArr5[28];
                            byte b15 = bArr5[7];
                            Object[] objArr16 = new Object[1];
                            a(b14, b15, (byte) (b15 | 52), objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, modifierMetaStateMask, iResolveSize, 2012020043, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cIndexOf3 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                            int i13 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 877;
                            int iRgb = Color.rgb(0, 0, 0) + 16777226;
                            byte b16 = $$a[7];
                            byte b17 = b16;
                            Object[] objArr17 = new Object[1];
                            a(b16, b17, (byte) (b17 | 89), objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf3, i13, iRgb, -1650998592, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i14 = ((int[]) objArr[2])[0];
        int i15 = ((int[]) objArr[0])[0];
        if (i15 == i14) {
            int i16 = ((int[]) objArr[1])[0];
            Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyTid = Process.myTid();
            int i17 = i16 + 646176212 + ((~((~iMyTid) | (-822132737))) * 433) + (((~(822268181 | iMyTid)) | (-862578411)) * (-433)) + (((~(iMyTid | (-862578411))) | 135445) * 433);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr18[1])[0] = i19 ^ (i19 << 5);
        } else {
            Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
            int i20 = ((int[]) objArr[1])[0];
            Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i21 = ~iIdentityHashCode2;
            int i22 = (-1569067900) + (((~((-983480812) | i21)) | 939821504) * (-1188));
            int i23 = (~(iIdentityHashCode2 | 983480811)) | 939821504;
            int i24 = ~(1023791040 | i21);
            int i25 = i20 + i22 + ((i23 | i24) * 594) + (((~(983480811 | i21)) | (-1067450348) | i24) * 594);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr19[1])[0] = i27 ^ (i27 << 5);
        }
        return new ClaimEvidenceJhtRequest(p0, p1, p2);
    }

    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2267, 33 - TextUtils.getCapsMode("", 0, 0), 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            float f = 0.0f;
            if (i5 != 0) {
                int i6 = $11 + 59;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char c = (char) (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1));
                                int iMyTid = (Process.myTid() >> 22) + 3358;
                                int fadingEdgeLength = 18 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                byte length2 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iMyTid, fadingEdgeLength, -1054011043, false, $$g((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i8++;
                            f = 0.0f;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 2267 - TextUtils.indexOf("", ""), View.combineMeasuredStates(0, 0) + 33, 1387473586, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentbindingInflater1[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i9 = $10 + 33;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)) + i5;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(b), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55903 - TextUtils.indexOf((CharSequence) "", '0', 0)), 2855 - (KeyEvent.getMaxKeyCode() >> 16), 13 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1529949196, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i11 = 0; i11 < length3; i11++) {
                        bArr5[i11] = (byte) (((long) bArr4[i11]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i12 = $10 + 69;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    if (z) {
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i14 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i14 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i14]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentbindingInflater1;
                        int i15 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i15 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i15]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static {
        asBinder = 1;
        b();
        int i = d + 73;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ ClaimEvidenceJhtRequest copy$default(ClaimEvidenceJhtRequest claimEvidenceJhtRequest, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 77;
        g = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            int i5 = i3 + 79;
            g = i5 % 128;
            int i6 = i5 % 2;
            str = claimEvidenceJhtRequest.email;
        }
        if ((i & 2) != 0) {
            str2 = claimEvidenceJhtRequest.type;
        }
        if ((i & 4) != 0) {
            str3 = claimEvidenceJhtRequest.evidenceCode;
        }
        return claimEvidenceJhtRequest.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = g + 3;
        int i3 = i2 % 128;
        asInterface = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.email;
        int i4 = i3 + 49;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 99;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 55;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = g + 47;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            str = this.evidenceCode;
            int i4 = 22 / 0;
        } else {
            str = this.evidenceCode;
        }
        int i5 = i3 + 77;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 55 / 0;
        }
        return str;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 115;
        int i4 = i3 % 128;
        g = i4;
        int i5 = i3 % 2;
        if (this == p0) {
            int i6 = i2 + 61;
            g = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(p0 instanceof ClaimEvidenceJhtRequest)) {
            int i8 = i4 + 97;
            asInterface = i8 % 128;
            return i8 % 2 != 0;
        }
        ClaimEvidenceJhtRequest claimEvidenceJhtRequest = (ClaimEvidenceJhtRequest) p0;
        if (!Intrinsics.areEqual(this.email, claimEvidenceJhtRequest.email)) {
            int i9 = asInterface + 61;
            g = i9 % 128;
            return i9 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.type, claimEvidenceJhtRequest.type)) {
            return Intrinsics.areEqual(this.evidenceCode, claimEvidenceJhtRequest.evidenceCode);
        }
        int i10 = asInterface + 3;
        g = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.email;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = g + 117;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
        }
        String str2 = this.type;
        if (str2 == null) {
            int i4 = asInterface + 57;
            g = i4 % 128;
            iHashCode2 = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.evidenceCode;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.email;
        String str2 = this.type;
        String str3 = this.evidenceCode;
        StringBuilder sb = new StringBuilder("ClaimEvidenceJhtRequest(email=");
        sb.append(str);
        sb.append(", type=");
        sb.append(str2);
        sb.append(", evidenceCode=");
        sb.append(str3);
        sb.append(")");
        String string = sb.toString();
        int i2 = asInterface + 93;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -269876957;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1934795640;
        b = 332683836;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new byte[]{31, 35, 20, -2, 65, 31, 38, 22, 45, -15, -14, 108, 19, -42, 93, 44, 45, 42, 25, 33, 26, -42, 122, -53, 70, 121, -46, 97, -92, -43, -64, 113, 69, -53, 125, 39, 58, 55, 44, 82, 31, 37, 47, 55, 45, 53, 73, 68, 87, -8, 38, 43, 119, -20, 63, 60, Base64.padSymbol, 40, 48, 45, -42, -95, -48, -78, -55, -51, -56, -53, -89, -122, 24, -95, -36, -46, -89, -56, -75, -26, -26, -26, -26};
    }

    private static String $$g(short s, int i, int i2) {
        int i3 = (s * 2) + 4;
        byte[] bArr = $$c;
        int i4 = i2 * 3;
        int i5 = i + 117;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i3++;
            i5 = i3 + (-i5);
        }
        while (true) {
            int i8 = i5;
            int i9 = i3;
            i7++;
            bArr2[i7] = (byte) i8;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i3 = i9 + 1;
            i5 = i8 + (-bArr[i9]);
        }
    }
}
