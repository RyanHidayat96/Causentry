package com.bpjstku.domain.jht.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
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
import androidx.compose.runtime.ComposerKt;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0007H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001e"}, d2 = {"Lcom/bpjstku/domain/jht/model/JhtClaimTrack;", "Landroid/os/Parcelable;", "", "Lcom/bpjstku/domain/jht/model/ClaimStep;", "p0", "Lcom/bpjstku/domain/jht/model/ClaimTitle;", "p1", "", "p2", "<init>", "(Ljava/util/List;Lcom/bpjstku/domain/jht/model/ClaimTitle;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/domain/jht/model/ClaimTitle;", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JhtClaimTrack implements Parcelable {
    public static final Parcelable.Creator<JhtClaimTrack> CREATOR;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final ClaimTitle TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final List<ClaimStep> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {70, -114, 113, 8};
    private static final int $$f = 171;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {ByteCompanionObject.MAX_VALUE, 43, -39, -37, 9, 10, 25, 13, 9, -48, 8, 72, 18, 19, -2, 26, 9, 0, 24, -49, 66, 11, 15, 18, 10, -38, 9, 49, 32, 20, 2, 37, -72, 59, 32, 20, 2, 37, -25, 41, 19, 10, -2, 15};
    private static final int $$e = 63;
    private static final byte[] $$a = {14, 116, 92, -78, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 121;
    private static int asBinder = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f428a = 1;
    private static int d = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r7 = 56 - r7
            int r8 = r8 * 52
            int r0 = 53 - r8
            byte[] r1 = com.bpjstku.domain.jht.model.JhtClaimTrack.$$a
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L32
        L18:
            r3 = r2
        L19:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L32:
            int r6 = -r6
            int r7 = r7 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.domain.jht.model.JhtClaimTrack.c(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 40
            int r7 = 43 - r7
            int r8 = r8 * 13
            int r8 = 111 - r8
            byte[] r0 = com.bpjstku.domain.jht.model.JhtClaimTrack.$$d
            int r9 = r9 * 40
            int r9 = 41 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L2e:
            int r7 = r7 + r3
            int r7 = r7 + (-13)
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.domain.jht.model.JhtClaimTrack.f(byte, short, int, java.lang.Object[]):void");
    }

    public JhtClaimTrack(List<ClaimStep> list, ClaimTitle claimTitle, String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(claimTitle, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = list;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = claimTitle;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0167  */
    /* JADX WARN: Code duplicated, block: B:33:0x0168  */
    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i6 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) KeyEvent.normalizeMetaState(0), 3291 - (ViewConfiguration.getLongPressTimeout() >> 16), 31 - TextUtils.getOffsetBefore("", 0), 1199271174, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 651 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 44 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -450685997, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            int i7 = $11 + 49;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ExpandableListView.getPackedPositionGroup(0L), 651 - (Process.myPid() >> 22), TextUtils.getOffsetBefore("", 0) + 44, -450685997, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i9 = $10 + 11;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                i4 = 29209604;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Type inference failed for: r2v56, types: [boolean, int] */
    public final boolean equals(Object p0) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char defaultSize = (char) (37567 - View.getDefaultSize(0, 0));
            int iRgb = Color.rgb(0, 0, 0) + 16777841;
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 14;
            byte[] bArr = $$a;
            byte b = bArr[7];
            byte b2 = bArr[5];
            Object[] objArr3 = new Object[1];
            c(b, b2, b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, iRgb, edgeSlop, -477065106, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(true, View.MeasureSpec.makeMeasureSpec(0, 0) + 237, (ViewConfiguration.getPressedStateDuration() >> 16) + 22, KeyEvent.keyCodeFromString("") + 14, new char[]{16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(false, 241 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14, 8 - ExpandableListView.getPackedPositionChild(0L), new char[]{65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 37568);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 626;
            int iResolveSizeAndState = 14 - View.resolveSizeAndState(0, 0, 0);
            byte[] bArr2 = $$a;
            byte b3 = bArr2[5];
            Object[] objArr6 = new Object[1];
            c(b3, b3, bArr2[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, iIndexOf, iResolveSizeAndState, -976899241, false, (String) objArr6[0], null);
        }
        if (j != ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object[] objArr7 = new Object[1];
            e(false, 237 - Drawable.resolveOpacity(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25, 8 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0, 17, 6, 19, 6}, objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            e(false, ((byte) KeyEvent.getModifierMetaStateMask()) + 245, 17 - TextUtils.lastIndexOf("", '0'), 10 - View.combineMeasuredStates(0, 0), new char[]{6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495}, objArr8);
            Context applicationContext = (Context) cls2.getMethod((String) objArr8[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr9 = new Object[1];
            e(true, TextUtils.getTrimmedLength("") + 236, 17 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 3 - View.MeasureSpec.getMode(0), new char[]{20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535}, objArr9);
            Class<?> cls3 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(true, TextUtils.getOffsetBefore("", 0) + 240, 16 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13, new char[]{65501, 2, '\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t'}, objArr10);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr11 = new Object[1];
            e(true, 211 - View.resolveSize(0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 64, 61 - Drawable.resolveOpacity(0, 0), new char[]{25, 25, 65515, 65519, 65520, 25, 65513, 65519, 65515, 24, 65519, 65511, 24, 65516, 65514, 28, 29, 65519, 65515, 65516, 29, 24, 65519, 65512, 65512, 65520, 65513, 24, 65520, 65520, 65515, 27, 65514, 65512, 25, 65518, 28, 25, 65518, 65518, 65516, 28, 65517, 65512, 65518, 65516, 24, 28, 28, 65516, 29, 29, 65520, 65517, 29, 25, 24, 24, 29, 28, 65513, 25, 65513, 29}, objArr11);
            String str = (String) objArr11[0];
            Object[] objArr12 = new Object[1];
            e(true, 206 - TextUtils.indexOf((CharSequence) "", '0'), 63 - Process.getGidForName(""), 37 - (ViewConfiguration.getPressedStateDuration() >> 16), new char[]{65519, 65516, 65520, 29, 65524, 65523, 65524, 65524, 65518, 65524, 29, 65519, 29, 65521, '!', 65522, 65520, 65518, 65521, 65518, 65517, 65519, '!', 65517, ' ', 29, 65515, '!', ' ', 65522, 29, 65520, 65515, 65521, 31, 28, 30, '!', 65521, 65515, 28, 65519, 65517, '!', 30, 65517, 65518, 65519, 29, 65524, 65524, 30, 65524, 65518, 65518, 65519, 65522, 65521, '!', ' ', 65517, 65517, 28, ' '}, objArr12);
            try {
                Object[] objArr13 = {applicationContext, new String[]{str, (String) objArr12[0]}, Integer.valueOf(iIntValue), 17, 80435971};
                byte b4 = (byte) ($$e & 1);
                byte[] bArr3 = $$d;
                byte b5 = bArr3[17];
                Object[] objArr14 = new Object[1];
                f(b4, b5, b5, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b6 = bArr3[17];
                byte b7 = (byte) (b6 + 1);
                Object[] objArr15 = new Object[1];
                f(b6, b7, b7, objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                int i2 = ((int[]) objArr16[0])[0];
                int i3 = ((int[]) objArr16[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cArgb = (char) (37567 - Color.argb(0, 0, 0, 0));
                        int iIndexOf2 = 625 - TextUtils.indexOf("", "", 0);
                        int iRed = Color.red(0) + 14;
                        byte[] bArr4 = $$a;
                        byte b8 = bArr4[5];
                        byte b9 = bArr4[7];
                        Object[] objArr17 = new Object[1];
                        c(b8, b9, b9, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb, iIndexOf2, iRed, -973632554, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr16);
                    try {
                        Object[] objArr18 = new Object[1];
                        e(true, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 237, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 14, new char[]{16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17}, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        e(false, (-16776975) - Color.rgb(0, 0, 0), 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 9 - TextUtils.getOffsetAfter("", 0), new char[]{65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534}, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cGreen = (char) (37567 - Color.green(0));
                            int mirror = 673 - AndroidCharacter.getMirror('0');
                            int doubleTapTimeout = 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            byte[] bArr5 = $$a;
                            byte b10 = bArr5[5];
                            Object[] objArr20 = new Object[1];
                            c(b10, b10, bArr5[7], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cGreen, mirror, doubleTapTimeout, -976899241, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37567);
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 625;
                            int packedPositionGroup = 14 - ExpandableListView.getPackedPositionGroup(0L);
                            byte[] bArr6 = $$a;
                            byte b11 = bArr6[7];
                            byte b12 = bArr6[5];
                            Object[] objArr21 = new Object[1];
                            c(b11, b12, b12, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, minimumFlingVelocity, packedPositionGroup, -477065106, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr16;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            int i4 = f428a + 51;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 37567);
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 625;
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 14;
                byte[] bArr7 = $$a;
                byte b13 = bArr7[5];
                byte b14 = bArr7[7];
                Object[] objArr22 = new Object[1];
                c(b13, b14, b14, objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarSize, iKeyCodeFromString, iCombineMeasuredStates, -973632554, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null);
            int i6 = ((int[]) objArr23[2])[0];
            int i7 = ((int[]) objArr23[0])[0];
            String[] strArr = (String[]) objArr23[3];
            int[] iArr = {i7};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i8 = ~((-1073784517) | startUptimeMillis);
            int i9 = (-729368496) + ((319508482 | i8) * (-476)) + (i8 * 952) + ((~((~startUptimeMillis) | (-1073784517))) * 476) + 80435971;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
            objArr = new Object[]{iArr, new int[1], new int[]{i6}, strArr};
        }
        int i12 = ((int[]) objArr[0])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 == i12) {
            int i14 = ((int[]) objArr[1])[0];
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[0])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr2 = {i15};
            int iIdentityHashCode = System.identityHashCode(this);
            int i17 = ~iIdentityHashCode;
            int i18 = ~(390353663 | i17);
            int i19 = i14 + 1432321240 + ((1076601856 | i18) * (-712)) + (((~(iIdentityHashCode | 1466955519)) | (~(i17 | (-1076601857)))) * (-712)) + (((-1433384458) | i18) * 712);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr2[1])[0] = i21 ^ (i21 << 5);
            objArr2 = new Object[]{new int[]{i16}, new int[1], iArr2, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str2 : strArr3) {
                    arrayList.add(str2);
                }
            }
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            int i22 = ((int[]) objArr[1])[0];
            int i23 = ((int[]) objArr[2])[0];
            int i24 = ((int[]) objArr[0])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr3 = {i23};
            int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
            int i25 = ~startUptimeMillis2;
            int i26 = i22 + 200598640 + ((startUptimeMillis2 | 1174213518) * 140) + (((~(1174213518 | i25)) | 570614896) * (-280)) + (((~(startUptimeMillis2 | (-570614897))) | (~(649524602 | i25)) | 1095303812) * 140);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr2[1])[0] = i28 ^ (i28 << 5);
            objArr2 = new Object[]{new int[]{i24}, new int[1], iArr3, strArr4};
        }
        if (this != p0) {
            if (!(p0 instanceof JhtClaimTrack)) {
                return false;
            }
            JhtClaimTrack jhtClaimTrack = (JhtClaimTrack) p0;
            if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, jhtClaimTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                int i29 = asBinder + 107;
                f428a = i29 % 128;
                int i30 = i29 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, jhtClaimTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                return false;
            }
            if (Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, jhtClaimTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                return true;
            }
            int i31 = f428a + 9;
            asBinder = i31 % 128;
            return i31 % 2 != 0;
        }
        int i32 = ((int[]) objArr2[1])[0];
        int i33 = i32 * i32;
        int i34 = -(1743518307 * i32);
        int i35 = ((i33 | i34) << 1) - (i33 ^ i34);
        int i36 = -(i32 * 600253913);
        int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
        int i38 = ((i37 | (-805452924)) << 1) - ((-805452924) ^ i37);
        int i39 = i38 >> 20;
        int i40 = (((i39 | (-8191)) << 1) - (i39 ^ (-8191))) / 4096;
        int i41 = (i40 & 1) + (i40 | 1);
        int i42 = (i38 ^ i41) + ((i41 & i38) << 1);
        int i43 = ((i38 >> 26) + ComposerKt.defaultsKey) / 64;
        int i44 = (-(i42 ^ (((i43 | 1) << 1) - (i43 ^ 1)))) + 8;
        int i45 = i44 >> 26;
        int i46 = (((i45 | ComposerKt.defaultsKey) << 1) - (i45 ^ ComposerKt.defaultsKey)) / 64;
        int i47 = (i46 & 1) + (i46 | 1);
        return 8688 / ((i44 & (-(((i47 | 1) << 1) - (i47 ^ 1)))) * 1086);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        CREATOR = new TuitionPaymentFragmentbindingInflater1();
        int i = d + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = f428a + 101;
        asBinder = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        f428a = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        return i3 == 0 ? (((iHashCode % 60) - this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode()) - 39) >> this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() : (((iHashCode * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        List<ClaimStep> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        ClaimTitle claimTitle = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StringBuilder sb = new StringBuilder("JhtClaimTrack(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(list);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(claimTitle);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str);
        sb.append(")");
        String string = sb.toString();
        int i2 = f428a + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        int i = 2 % 2;
        int i2 = f428a + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        List<ClaimStep> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        p0.writeInt(list.size());
        Iterator<ClaimStep> it = list.iterator();
        int i4 = asBinder + 1;
        f428a = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            int i6 = asBinder + 81;
            f428a = i6 % 128;
            int i7 = i6 % 2;
            it.next().writeToParcel(p0, p1);
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.writeToParcel(p0, p1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentbindingInflater1 = -83722264;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, byte r8) {
        /*
            int r7 = r7 + 119
            int r8 = r8 * 2
            int r8 = 3 - r8
            byte[] r0 = com.bpjstku.domain.jht.model.JhtClaimTrack.$$c
            int r6 = r6 * 2
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2b:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.domain.jht.model.JhtClaimTrack.$$g(byte, int, byte):java.lang.String");
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements Parcelable.Creator<JhtClaimTrack> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ JhtClaimTrack createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ClaimStep.CREATOR.createFromParcel(parcel));
            }
            return new JhtClaimTrack(arrayList, ClaimTitle.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ JhtClaimTrack[] newArray(int i) {
            return new JhtClaimTrack[i];
        }
    }
}
