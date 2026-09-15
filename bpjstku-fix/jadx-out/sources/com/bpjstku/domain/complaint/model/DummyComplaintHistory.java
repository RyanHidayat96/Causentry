package com.bpjstku.domain.complaint.model;

import android.content.Context;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
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
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!"}, d2 = {"Lcom/bpjstku/domain/complaint/model/DummyComplaintHistory;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "", "p3", "p4", "", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Z", "I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DummyComplaintHistory implements Parcelable {
    public static final Parcelable.Creator<DummyComplaintHistory> CREATOR;
    private static int INotificationSideChannel;
    private static int asBinder;
    private static int asInterface;
    private static short[] cancelAll;
    private static byte[] d;
    private static int g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final boolean b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {5, -91, 77, 46};
    private static final int $$f = 36;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {ByteCompanionObject.MAX_VALUE, 43, -39, -37, -20, -6, 55, -65, -16, -8, 0, -13, -1, 47, -64, -11, -17, 5, -5, -7, -26, 6, 47, -61, -23, 9, -26, 3, -12, -21, -3, 3, -2, -24, Base64.padSymbol, -67, -13, -14, 7, -21, -4, 5, -19, 54, -71, -10, 3, -9, -15, 54, -29, -55, 9, -26, 3, -12, -21, -3, 3, -2, -24, 25, -27, -19, -7, -11, -10, 72, -55, -26, -22, -8, 2, -14, -7, 66, -41, -57, 9, -17, -14, 72, -54, -37, -5, -8, -11, -14, -7, 43, -58, -8, 2, -6, -15, -7, 0, -17, -14, 72, -54, -37, -5, -8, -11, -14, -7, 22, -19, -25, 1, 0, -21, -14, 72, -38, -59, 4, -11, 0, -9, -21, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 58};
    private static final int $$e = 128;
    private static final byte[] $$a = {31, 115, -100, -11, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 38;
    private static int cancel = 0;
    private static int onTransact = 1;
    private static int notify = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 15
            int r0 = r8 + 38
            int r6 = r6 + 4
            byte[] r1 = com.bpjstku.domain.complaint.model.DummyComplaintHistory.$$a
            int r7 = r7 * 4
            int r7 = r7 + 84
            byte[] r0 = new byte[r0]
            int r8 = r8 + 37
            r2 = 0
            if (r1 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.domain.complaint.model.DummyComplaintHistory.c(byte, int, byte, java.lang.Object[]):void");
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
    private static void f(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 15
            int r8 = 99 - r8
            int r6 = r6 + 4
            int r7 = r7 * 66
            int r0 = 119 - r7
            byte[] r1 = com.bpjstku.domain.complaint.model.DummyComplaintHistory.$$d
            byte[] r0 = new byte[r0]
            int r7 = 118 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2e:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-8)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.domain.complaint.model.DummyComplaintHistory.f(short, byte, short, java.lang.Object[]):void");
    }

    public DummyComplaintHistory(String str, String str2, String str3, boolean z, String str4, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
        this.TuitionPaymentFragmentbindingInflater1 = str3;
        this.b = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str4;
        this.a = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DummyComplaintHistory(String str, String str2, String str3, boolean z, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z2;
        String str5;
        int i3;
        if ((i2 & 8) != 0) {
            int i4 = cancel + 121;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i2 & 16) != 0) {
            int i7 = onTransact;
            int i8 = i7 + 71;
            cancel = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            int i9 = i7 + 115;
            cancel = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            str5 = "";
        } else {
            str5 = str4;
        }
        if ((i2 & 32) != 0) {
            int i12 = onTransact + 73;
            cancel = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
            i3 = 1;
        } else {
            i3 = i;
        }
        this(str, str2, str3, z2, str5, i3);
    }

    public final int hashCode() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = cancel + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + Boolean.hashCode(this.b)) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode()) * 31) + Integer.hashCode(this.a);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43041);
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3111;
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[132], bArr[7], bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, scrollBarFadeDuration, maximumDrawingCacheSize, -1272852037, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1722699645, View.MeasureSpec.makeMeasureSpec(0, 0) - 45, (short) (Color.rgb(0, 0, 0) + 16777216), (byte) ((-1) - Process.getGidForName("")), (ViewConfiguration.getTapTimeout() >> 16) - 867852656, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((ViewConfiguration.getWindowTouchSlop() >> 8) - 1722699640, (-52) - KeyEvent.keyCodeFromString(""), (short) TextUtils.indexOf("", "", 0), (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (ViewConfiguration.getScrollBarSize() >> 8) - 867852635, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 43042);
            int i4 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3110;
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 22;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c((byte) 51, bArr2[7], bArr2[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, i4, iCombineMeasuredStates, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionType = (char) (43042 - ExpandableListView.getPackedPositionType(0L));
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 3111;
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 23;
                byte b = (byte) ($$b | 65);
                byte b2 = $$a[7];
                Object[] objArr6 = new Object[1];
                c(b, b2, b2, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType, touchSlop, modifierMetaStateMask, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i5};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i7 = (((1148176340 + ((~((-1075786899) | iElapsedRealtime)) * 623)) + (((~iElapsedRealtime) | 557842432) * (-623))) + (((~(iElapsedRealtime | 593543496)) | ((~((-1111487963) | iElapsedRealtime)) | 1075786898)) * 623)) - 1128797021;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{new int[1], new int[]{i6}, iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e((ViewConfiguration.getScrollBarSize() >> 8) - 1722699635, 65533 - AndroidCharacter.getMirror('0'), (short) (AndroidCharacter.getMirror('0') - '0'), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.getOffsetAfter("", 0) - 867852621, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(ExpandableListView.getPackedPositionType(0L) - 1722699636, (-51) - ExpandableListView.getPackedPositionGroup(0L), (short) TextUtils.indexOf("", ""), (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), KeyEvent.normalizeMetaState(0) - 867852606, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i10 = cancel + 1;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, -1128797021};
                byte[] bArr3 = $$d;
                byte b3 = bArr3[12];
                byte b4 = bArr3[10];
                Object[] objArr11 = new Object[1];
                f(b3, b4, b4, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b5 = bArr3[110];
                Object[] objArr12 = new Object[1];
                f((byte) 117, b5, b5, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char maximumDrawingCacheSize2 = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43042);
                    int touchSlop2 = 3111 - (ViewConfiguration.getTouchSlop() >> 8);
                    int fadingEdgeLength = 22 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte b6 = (byte) ($$b | 65);
                    byte b7 = $$a[7];
                    Object[] objArr14 = new Object[1];
                    c(b6, b7, b7, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumDrawingCacheSize2, touchSlop2, fadingEdgeLength, 154975793, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    e((-1722699645) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-44) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (short) Color.alpha(0), (byte) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getScrollBarSize() >> 8) - 867852656, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e((-1722699640) - (ViewConfiguration.getLongPressTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) - 52, (short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (-867852635) - Color.green(0), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "") + 43042);
                        int touchSlop3 = (ViewConfiguration.getTouchSlop() >> 8) + 3111;
                        int i12 = 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        byte[] bArr4 = $$a;
                        Object[] objArr17 = new Object[1];
                        c((byte) 51, bArr4[7], bArr4[5], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, touchSlop3, i12, -1269618118, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 43042);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 3112;
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 23;
                        byte[] bArr5 = $$a;
                        Object[] objArr18 = new Object[1];
                        c(bArr5[132], bArr5[7], bArr5[5], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSizeAndState, iLastIndexOf, packedPositionChild, -1272852037, false, (String) objArr18[0], null);
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[2])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[0])[0];
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr2 = {i16};
            int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            int i18 = i15 + 2048583942 + (((~(iElapsedRealtime2 | 503695045)) | (-1604318942)) * 305) + (((~((~iElapsedRealtime2) | 503695045)) | (-1201336414)) * 305);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr[0])[0] = i20 ^ (i20 << 5);
            Object[] objArr19 = {new int[1], new int[]{i17}, iArr2, strArr2};
            int i21 = onTransact + 29;
            cancel = i21 % 128;
            if (i21 % 2 == 0) {
                return iHashCode;
            }
            obj.hashCode();
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = (String[]) objArr[3];
        if (strArr3 != null) {
            for (String str : strArr3) {
                arrayList.add(str);
            }
        }
        int[] iArr3 = new int[i14];
        int i22 = i14 - 1;
        iArr3[i22] = 1;
        Toast.makeText((Context) null, iArr3[((i14 * i22) % 2) - 1], 1).show();
        int i23 = ((int[]) objArr[0])[0];
        int i24 = ((int[]) objArr[2])[0];
        int i25 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[3];
        int iNextInt = new Random().nextInt(1538522841);
        int i26 = i23 + 112075296 + (((~((~iNextInt) | (-547437771))) | 1157593688) * (-235)) + (((~((-547437771) | iNextInt)) | 1157593688) * (-470)) + (((~(iNextInt | (-536872067))) | 1147027984) * 235);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        ((int[]) objArr[0])[0] = i28 ^ (i28 << 5);
        Object[] objArr20 = {new int[1], new int[]{i25}, new int[]{i24}, strArr4};
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0090 A[PHI: r4
  0x0090: PHI (r4v19 int) = (r4v3 int), (r4v12 int) binds: [B:15:0x008e, B:38:0x018c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0097  */
    /* JADX WARN: Code duplicated, block: B:19:0x009b  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b4 A[Catch: all -> 0x035e, TryCatch #1 {all -> 0x035e, blocks: (B:3:0x000f, B:5:0x002a, B:6:0x0061, B:53:0x023f, B:55:0x025c, B:56:0x029f, B:22:0x00a3, B:24:0x00b4, B:25:0x00e7, B:33:0x011e, B:35:0x0135, B:36:0x016e), top: B:86:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:28:0x010c  */
    /* JADX WARN: Code duplicated, block: B:30:0x010f  */
    /* JADX WARN: Code duplicated, block: B:32:0x011a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0135 A[Catch: all -> 0x035e, TryCatch #1 {all -> 0x035e, blocks: (B:3:0x000f, B:5:0x002a, B:6:0x0061, B:53:0x023f, B:55:0x025c, B:56:0x029f, B:22:0x00a3, B:24:0x00b4, B:25:0x00e7, B:33:0x011e, B:35:0x0135, B:36:0x016e), top: B:86:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x018f  */
    /* JADX WARN: Code duplicated, block: B:42:0x01ab A[Catch: all -> 0x0209, TryCatch #0 {all -> 0x0209, blocks: (B:40:0x0194, B:42:0x01ab, B:43:0x01ea), top: B:84:0x0194 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0212  */
    /* JADX WARN: Code duplicated, block: B:52:0x022f  */
    /* JADX WARN: Code duplicated, block: B:55:0x025c A[Catch: all -> 0x035e, TryCatch #1 {all -> 0x035e, blocks: (B:3:0x000f, B:5:0x002a, B:6:0x0061, B:53:0x023f, B:55:0x025c, B:56:0x029f, B:22:0x00a3, B:24:0x00b4, B:25:0x00e7, B:33:0x011e, B:35:0x0135, B:36:0x016e), top: B:86:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:59:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x02bb A[LOOP:0: B:60:0x02b9->B:61:0x02bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:65:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:69:0x02d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x02da  */
    /* JADX WARN: Code duplicated, block: B:72:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:73:0x0304  */
    /* JADX WARN: Code duplicated, block: B:75:0x0328  */
    private static void e(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
        int i4;
        char c;
        byte[] bArr;
        int i5;
        long j;
        int i6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i7;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int length;
        byte[] bArr2;
        int i8;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        byte[] bArr3;
        boolean z;
        boolean z2;
        int i9;
        int length2;
        byte[] bArr4;
        int i10;
        int i11 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(asInterface)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2267;
                int i12 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32;
                byte length3 = (byte) $$c.length;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionType, fadingEdgeLength, i12, 1387473586, false, $$g((byte) 0, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i13 = $11 + 75;
                $10 = i13 % 128;
                if (i13 % 2 == 0) {
                    i4 = 1;
                }
                c = '0';
                if (i4 == 1) {
                    bArr = d;
                    if (bArr != null) {
                        length = bArr.length;
                        bArr2 = new byte[length];
                        i8 = 0;
                        while (i8 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                int scrollBarFadeDuration = 3358 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                int iIndexOf = 17 - TextUtils.indexOf("", c, 0, 0);
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, scrollBarFadeDuration, iIndexOf, -1054011043, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).byteValue();
                            i8++;
                            c = '0';
                        }
                        int i14 = $10 + 57;
                        $11 = i14 % 128;
                        i5 = 2;
                        int i15 = i14 % 2;
                        bArr = bArr2;
                    } else {
                        i5 = 2;
                    }
                    if (bArr != null) {
                        i6 = $11 + 37;
                        $10 = i6 % 128;
                        if (i6 % i5 != 0) {
                            byte[] bArr5 = d;
                            Object[] objArr4 = new Object[i5];
                            objArr4[1] = Integer.valueOf(g);
                            objArr4[0] = Integer.valueOf(i3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 2268;
                                int iGreen = 33 - Color.green(0);
                                byte length4 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, iIndexOf2, iGreen, 1387473586, false, $$g((byte) 0, length4, (byte) (length4 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i7 = ((byte) (((long) bArr5[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr4)).intValue()]) / 3046761265686732006L)) >>> ((int) (((long) asInterface) + 3046761265686732006L));
                        } else {
                            byte[] bArr6 = d;
                            try {
                                Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(g)};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cBlue = (char) Color.blue(0);
                                    int i16 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2267;
                                    int i17 = 33 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    byte length5 = (byte) $$c.length;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, i16, i17, 1387473586, false, $$g((byte) 0, length5, (byte) (length5 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                i7 = ((byte) (((long) bArr6[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) asInterface) ^ 3046761265686732006L));
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        iIntValue = (byte) i7;
                        j = 3046761265686732006L;
                    } else {
                        j = 3046761265686732006L;
                        iIntValue = (short) (((short) (((long) cancelAll[i3 + ((int) (((long) g) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) asInterface) ^ 3046761265686732006L)));
                    }
                } else {
                    j = 3046761265686732006L;
                }
                if (iIntValue > 0) {
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) g) ^ j)) + i4;
                    Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(asBinder), sb};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55903 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 2855 - ((Process.getThreadPriority(0) + 20) >> 6), 13 - TextUtils.indexOf("", "", 0), -1529949196, false, $$g(b4, b5, (byte) (b5 - 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    bArr3 = d;
                    if (bArr3 != null) {
                        length2 = bArr3.length;
                        bArr4 = new byte[length2];
                        for (i10 = 0; i10 < length2; i10++) {
                            bArr4[i10] = (byte) (((long) bArr3[i10]) ^ 3046761265686732006L);
                        }
                        bArr3 = bArr4;
                    }
                    if (bArr3 != null) {
                        z = false;
                    } else {
                        z = true;
                    }
                    z2 = !z;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        if (z2) {
                            i9 = $11 + 67;
                            $10 = i9 % 128;
                            if (i9 % 2 != 0) {
                                byte[] bArr7 = d;
                                int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >>> (((byte) (((byte) (((long) bArr7[i18]) & 3046761265686732006L)) >> s)) ^ b));
                            } else {
                                byte[] bArr8 = d;
                                int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr8[i19]) ^ 3046761265686732006L)) + s)) ^ b));
                            }
                        } else {
                            short[] sArr = cancelAll;
                            int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i20]) ^ 3046761265686732006L)) + s)) ^ b));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                }
                objArr[0] = sb.toString();
            }
            int i21 = $10 + 95;
            $11 = i21 % 128;
            int i22 = i21 % 2;
            i4 = 0;
            c = '0';
            if (i4 == 1) {
                bArr = d;
                if (bArr != null) {
                    length = bArr.length;
                    bArr2 = new byte[length];
                    i8 = 0;
                    while (i8 < length) {
                        Object[] objArr7 = {Integer.valueOf(bArr[i8])};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int scrollBarFadeDuration2 = 3358 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int iIndexOf3 = 17 - TextUtils.indexOf("", c, 0, 0);
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, scrollBarFadeDuration2, iIndexOf3, -1054011043, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr7)).byteValue();
                        i8++;
                        c = '0';
                    }
                    int i110 = $10 + 57;
                    $11 = i110 % 128;
                    i5 = 2;
                    int i111 = i110 % 2;
                    bArr = bArr2;
                } else {
                    i5 = 2;
                }
                if (bArr != null) {
                    i6 = $11 + 37;
                    $10 = i6 % 128;
                    if (i6 % i5 != 0) {
                        byte[] bArr9 = d;
                        Object[] objArr8 = new Object[i5];
                        objArr8[1] = Integer.valueOf(g);
                        objArr8[0] = Integer.valueOf(i3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cKeyCodeFromString2 = (char) KeyEvent.keyCodeFromString("");
                            int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0) + 2268;
                            int iGreen2 = 33 - Color.green(0);
                            byte length6 = (byte) $$c.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString2, iIndexOf4, iGreen2, 1387473586, false, $$g((byte) 0, length6, (byte) (length6 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i7 = ((byte) (((long) bArr9[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr8)).intValue()]) / 3046761265686732006L)) >>> ((int) (((long) asInterface) + 3046761265686732006L));
                    } else {
                        byte[] bArr10 = d;
                        Object[] objArr9 = {Integer.valueOf(i3), Integer.valueOf(g)};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cBlue2 = (char) Color.blue(0);
                            int i112 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2267;
                            int i113 = 33 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            byte length7 = (byte) $$c.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue2, i112, i113, 1387473586, false, $$g((byte) 0, length7, (byte) (length7 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i7 = ((byte) (((long) bArr10[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr9)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) asInterface) ^ 3046761265686732006L));
                    }
                    iIntValue = (byte) i7;
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) cancelAll[i3 + ((int) (((long) g) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) asInterface) ^ 3046761265686732006L)));
                }
            } else {
                j = 3046761265686732006L;
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) g) ^ j)) + i4;
                Object[] objArr10 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(asBinder), sb};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55903 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 2855 - ((Process.getThreadPriority(0) + 20) >> 6), 13 - TextUtils.indexOf("", "", 0), -1529949196, false, $$g(b8, b9, (byte) (b9 - 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr10)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                bArr3 = d;
                if (bArr3 != null) {
                    length2 = bArr3.length;
                    bArr4 = new byte[length2];
                    while (i10 < length2) {
                        bArr4[i10] = (byte) (((long) bArr3[i10]) ^ 3046761265686732006L);
                    }
                    bArr3 = bArr4;
                }
                if (bArr3 != null) {
                    z = false;
                } else {
                    z = true;
                }
                z2 = !z;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z2) {
                        i9 = $11 + 67;
                        $10 = i9 % 128;
                        if (i9 % 2 != 0) {
                            byte[] bArr11 = d;
                            int i114 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i114;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >>> (((byte) (((byte) (((long) bArr11[i114]) & 3046761265686732006L)) >> s)) ^ b));
                        } else {
                            byte[] bArr12 = d;
                            int i115 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i115 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr12[i115]) ^ 3046761265686732006L)) + s)) ^ b));
                        }
                    } else {
                        short[] sArr2 = cancelAll;
                        int i23 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i23 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr2[i23]) ^ 3046761265686732006L)) + s)) ^ b));
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
        INotificationSideChannel = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = notify + 67;
        INotificationSideChannel = i % 128;
        if (i % 2 != 0) {
            int i2 = 6 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = cancel + 67;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 81;
        cancel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        return 0;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DummyComplaintHistory)) {
            int i2 = cancel + 83;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        DummyComplaintHistory dummyComplaintHistory = (DummyComplaintHistory) p0;
        if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, dummyComplaintHistory.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            int i4 = onTransact + 15;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, dummyComplaintHistory.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            int i6 = onTransact + 101;
            cancel = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, dummyComplaintHistory.TuitionPaymentFragmentbindingInflater1)) {
            int i8 = cancel + 125;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.b != dummyComplaintHistory.b) {
            int i10 = cancel + 59;
            onTransact = i10 % 128;
            return i10 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, dummyComplaintHistory.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            return false;
        }
        if (this.a == dummyComplaintHistory.a) {
            return true;
        }
        int i11 = cancel + 57;
        onTransact = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        boolean z = this.b;
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = this.a;
        StringBuilder sb = new StringBuilder("DummyComplaintHistory(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str3);
        sb.append(", b=");
        sb.append(z);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str4);
        sb.append(", a=");
        sb.append(i2);
        sb.append(")");
        String string = sb.toString();
        int i3 = cancel + 23;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        int i = 2 % 2;
        int i2 = cancel + 25;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeInt(this.b ? 1 : 0);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeInt(this.a);
        int i4 = onTransact + 107;
        cancel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        g = -1088995946;
        asInterface = -1934795611;
        asBinder = -368897221;
        d = new byte[]{-18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29, -26, -26, -26, -26};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, byte r8, int r9) {
        /*
            int r8 = 121 - r8
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r9 = r9 * 4
            int r9 = r9 + 4
            byte[] r0 = com.bpjstku.domain.complaint.model.DummyComplaintHistory.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r5 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L28:
            int r9 = -r9
            int r8 = r8 + r9
            int r9 = r3 + 1
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.domain.complaint.model.DummyComplaintHistory.$$g(byte, byte, int):java.lang.String");
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Parcelable.Creator<DummyComplaintHistory> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DummyComplaintHistory createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DummyComplaintHistory(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DummyComplaintHistory[] newArray(int i) {
            return new DummyComplaintHistory[i];
        }
    }
}
