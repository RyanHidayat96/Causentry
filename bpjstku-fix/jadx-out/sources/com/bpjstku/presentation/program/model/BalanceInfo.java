package com.bpjstku.presentation.program.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.util.constant.MembershipType;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010,\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010%R\u0016\u0010+\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010%R\u0016\u0010!\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010%R\u0016\u0010.\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010%R\u0016\u0010/\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010%R\u0016\u0010$\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010%R\u0016\u00100\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010%R\u001c\u00102\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b#\u0010\u001cR\u0016\u00101\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010%"}, d2 = {"Lcom/bpjstku/presentation/program/model/BalanceInfo;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "Lcom/bpjstku/util/constant/MembershipType;", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "<init>", "(ILjava/lang/String;Lcom/bpjstku/util/constant/MembershipType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "a", "Ljava/lang/String;", "b", "Lcom/bpjstku/util/constant/MembershipType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "notify", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "TuitionPaymentFragmentbindingInflater1", "INotificationSideChannel", "asBinder", "g", "cancelAll", "cancel", "onTransact"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BalanceInfo implements Parcelable {
    public static final Parcelable.Creator<BalanceInfo> CREATOR;
    private static int INotificationSideChannelDefault;
    private static char[] cancelAll;
    private static char onTransact;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final String asBinder;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String cancel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String cancelAll;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String b;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final String a;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final MembershipType TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final String onTransact;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final String g;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {109, 84, -87, -114};
    private static final int $$f = 75;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {88, 99, -94, -58, 13, -1, -62, 58, 9, 1, -7, 6, -6, -54, 52, 14, -9, 15, -2, -5, -4, -53, 64, -11, 20, -14, 14, -8, -7, 12, -61, 65, -12, 22, -12, -1, -5, 20, -10, 7, 0, -63, 33, 20, 22, -12, -1, -5, 20, -10, 7, 0, -43, 32, 18, -27, 20, -3, 19, 34, -11, 12, -10, 7, 0, -29, 18, 25, -11, -7, 10, 7, -45, 45, -16, 7, 7, -7, 10, 7, 0, -2, -10, -1, 7, -7, 12, -2, 6, -1, -2, 6, -8, 0, 19, -12, -3, 19, -41, 35, -10, 2, 8, -7, 2, 2, -4, 21, -8, 9, -66};
    private static final int $$e = 13;
    private static final byte[] $$a = {80, -8, 43, 65, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 148;
    private static int getInterfaceDescriptor = 0;
    private static int INotificationSideChannelStub = 1;
    private static int INotificationSideChannelStubProxy = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.presentation.program.model.BalanceInfo.$$a
            int r8 = r8 * 52
            int r8 = 53 - r8
            int r7 = r7 + 4
            int r9 = 103 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r5 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r7]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + (-11)
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.model.BalanceInfo.c(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 55
            int r8 = r8 + 4
            int r6 = r6 * 15
            int r6 = r6 + 84
            int r7 = r7 * 3
            int r0 = r7 + 53
            byte[] r1 = com.bpjstku.presentation.program.model.BalanceInfo.$$d
            byte[] r0 = new byte[r0]
            int r7 = r7 + 52
            r2 = -1
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L32
        L18:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1c:
            int r3 = r3 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L2c
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r0, r7)
            r9[r7] = r6
            return
        L2c:
            r4 = r1[r6]
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L32:
            int r8 = r8 + r6
            int r6 = r3 + 1
            int r8 = r8 + r2
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.model.BalanceInfo.f(int, int, int, java.lang.Object[]):void");
    }

    public BalanceInfo(int i, String str, MembershipType membershipType, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        this.b = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = membershipType;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
        this.TuitionPaymentFragmentbindingInflater1 = str3;
        this.asInterface = str4;
        this.d = str5;
        this.asBinder = str6;
        this.g = str7;
        this.a = str8;
        this.cancelAll = str9;
        this.onTransact = str10;
        this.cancel = str11;
    }

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyTid = (char) (Process.myTid() >> 22);
            int i4 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 876;
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10;
            byte b2 = $$a[5];
            byte b3 = (byte) (-b2);
            byte b4 = b2;
            Object[] objArr2 = new Object[1];
            c(b3, b4, (byte) (b4 + 4), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, i4, maximumFlingVelocity, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{'\n', 28, 14, 26, 16, 30, 14, 20, 17, 24, '\r', 26, '#', 26, '\t', 27, '\t', Typography.quote, 6, '\r', 25, 22}, (byte) (27 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{19, '\t', 5, Typography.quote, 27, 23, 6, 26, 22, 3, '\t', 1, 4, 16, 13907}, (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 84), TextUtils.lastIndexOf("", '0', 0, 0) + 16, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int i5 = 875 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int deadChar = 10 - KeyEvent.getDeadChar(0, 0);
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            c((byte) (-bArr[5]), bArr[7], bArr[10], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(tapTimeout, i5, deadChar, 2009631821, false, (String) objArr5[0], null);
        }
        if (j != ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object[] objArr6 = new Object[1];
            e(new char[]{'\n', 28, 14, 26, 16, 30, 14, 20, 5, Typography.quote, ' ', 17, 27, 29, 4, '!', ' ', '#', 2, '!', 6, '#', 21, 22, 2, '\n'}, (byte) (17 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 26 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr6);
            Class<?> cls2 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(new char[]{Typography.quote, 22, 13871, 13871, 22, 23, 2, 27, 13873, 13873, '\n', 31, Typography.quote, '\n', 4, '!', 16, 18}, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 70), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 17, objArr7);
            Context applicationContext = (Context) cls2.getMethod((String) objArr7[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr8 = new Object[1];
            e(new char[]{1, 5, Typography.quote, 1, '\r', '\b', '\n', 28, '\b', 15, 26, 31, 27, 5, 22, '\t'}, (byte) (103 - View.MeasureSpec.getMode(0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 17, objArr8);
            Class<?> cls3 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{' ', '\n', 22, 23, 4, '!', 2, '!', 16, 3, 24, '#', 30, 15, '\t', 20}, (byte) (79 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 16 - TextUtils.getOffsetAfter("", 0), objArr9);
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), -1902126566};
                byte[] bArr2 = $$d;
                byte b5 = bArr2[9];
                Object[] objArr11 = new Object[1];
                f(b5, b5, bArr2[40], objArr11);
                Class<?> cls4 = Class.forName((String) objArr11[0]);
                byte b6 = bArr2[40];
                Object[] objArr12 = new Object[1];
                f(b6, b6, bArr2[9], objArr12);
                Object[] objArr13 = (Object[]) cls4.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                        int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 877;
                        int iMakeMeasureSpec = 10 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte[] bArr3 = $$a;
                        Object[] objArr14 = new Object[1];
                        c((byte) 51, bArr3[5], bArr3[7], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel, bitsPerPixel2, iMakeMeasureSpec, 256017550, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        e(new char[]{'\n', 28, 14, 26, 16, 30, 14, 20, 17, 24, '\r', 26, '#', 26, '\t', 27, '\t', Typography.quote, 6, '\r', 25, 22}, (byte) (26 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr15);
                        Class<?> cls5 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        e(new char[]{19, '\t', 5, Typography.quote, 27, 23, 6, 26, 22, 3, '\t', 1, 4, 16, 13907}, (byte) (84 - (ViewConfiguration.getScrollBarSize() >> 8)), 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr16);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                            int trimmedLength = 876 - TextUtils.getTrimmedLength("");
                            int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 10;
                            byte[] bArr4 = $$a;
                            byte b7 = (byte) (-bArr4[5]);
                            byte b8 = bArr4[7];
                            byte b9 = bArr4[10];
                            Object[] objArr17 = new Object[1];
                            c(b7, b8, b9, objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize, trimmedLength, scrollBarSize2, 2009631821, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cRed = (char) Color.red(0);
                            int threadPriority = 876 - ((Process.getThreadPriority(0) + 20) >> 6);
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 11;
                            byte b10 = $$a[5];
                            byte b11 = (byte) (-b10);
                            byte b12 = b10;
                            Object[] objArr18 = new Object[1];
                            c(b11, b12, (byte) (b12 + 4), objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRed, threadPriority, iLastIndexOf, 252381699, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr13;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            int i6 = INotificationSideChannelStub + 11;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 877;
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10;
                byte[] bArr5 = $$a;
                Object[] objArr19 = new Object[1];
                c((byte) 51, bArr5[5], bArr5[7], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(modifierMetaStateMask, packedPositionChild, maximumDrawingCacheSize, 256017550, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr20[0])[0]}, new int[1], new int[]{((int[]) objArr20[2])[0]}, (String[]) objArr20[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = 1001096684 + (((~iIdentityHashCode) | 44657205) * 1444) + (((~(iIdentityHashCode | (-694495987))) | (~(734806215 | iIdentityHashCode)) | 2173488) * (-1444)) + 215109070;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
        }
        if (((int[]) objArr[0])[0] == ((int[]) objArr[2])[0]) {
            int i11 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyPid = Process.myPid();
            int i12 = ~iMyPid;
            int i13 = i11 + (((2070192700 + (((~(619613741 | i12)) | (~((-659923971) | iMyPid))) * (-370))) + ((((~(iMyPid | 619613741)) | (~(i12 | (-659923971)))) | 11143725) * (-370))) - 171789046);
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr21[1])[0] = i15 ^ (i15 << 5);
            int i16 = getInterfaceDescriptor;
            int i17 = i16 + 33;
            INotificationSideChannelStub = i17 % 128;
            int i18 = i17 % 2;
            String str = this.onTransact;
            int i19 = i16 + 13;
            INotificationSideChannelStub = i19 % 128;
            int i20 = i19 % 2;
            return str;
        }
        throw null;
    }

    private static void e(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = cancelAll;
        int i4 = 1770390596;
        Object obj2 = null;
        int i5 = 7;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2267;
                        int i7 = 34 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte b3 = (byte) ($$f & i5);
                        byte b4 = (byte) (b3 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, fadingEdgeLength, i7, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    int i8 = $10 + 21;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    i4 = 1770390596;
                    i5 = 7;
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
        try {
            Object[] objArr3 = {Integer.valueOf(onTransact)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 2267;
                int defaultSize = View.getDefaultSize(0, 0) + 33;
                byte b5 = (byte) ($$f & 7);
                byte b6 = (byte) (b5 - 3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask, offsetAfter, defaultSize, -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i10 = $11 + 29;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    i2 = i + 69;
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
                    int i11 = $11 + 69;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
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
                            char cBlue = (char) (Color.blue(0) + 49267);
                            int trimmedLength = 3261 - TextUtils.getTrimmedLength("");
                            int iAxisFromString = MotionEvent.axisFromString("") + 31;
                            byte b7 = (byte) ($$f & 6);
                            byte b8 = (byte) (b7 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, trimmedLength, iAxisFromString, -127612708, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b9 = (byte) 0;
                                byte b10 = b9;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - View.MeasureSpec.getSize(0)), 594 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17, 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i14 = $11 + 125;
                                $10 = i14 % 128;
                                int i15 = i14 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                            } else {
                                int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                            }
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    obj2 = obj;
                }
            }
            int i20 = 0;
            while (i20 < i) {
                int i21 = $11 + 71;
                $10 = i21 % 128;
                if (i21 % 2 != 0) {
                    cArr4[i20] = (char) (cArr4[i20] ^ 21317);
                    i20 += 7;
                } else {
                    cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                    i20++;
                }
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static {
        INotificationSideChannelDefault = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        CREATOR = new b();
        int i = INotificationSideChannelStubProxy + 55;
        INotificationSideChannelDefault = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        int i3 = i2 % 128;
        INotificationSideChannelStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 93;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = INotificationSideChannelStub;
            int i3 = i2 + 69;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 35;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(p0 instanceof BalanceInfo)) {
            int i7 = getInterfaceDescriptor + 125;
            INotificationSideChannelStub = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        BalanceInfo balanceInfo = (BalanceInfo) p0;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != balanceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return false;
        }
        if (!Intrinsics.areEqual(this.b, balanceInfo.b)) {
            int i9 = getInterfaceDescriptor + 43;
            INotificationSideChannelStub = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != balanceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return false;
        }
        if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, balanceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            int i11 = getInterfaceDescriptor + 93;
            INotificationSideChannelStub = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, balanceInfo.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.asInterface, balanceInfo.asInterface)) {
            if (!(!Intrinsics.areEqual(this.d, balanceInfo.d))) {
                if (!Intrinsics.areEqual(this.asBinder, balanceInfo.asBinder) || !Intrinsics.areEqual(this.g, balanceInfo.g)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.a, balanceInfo.a)) {
                    int i13 = INotificationSideChannelStub + 61;
                    getInterfaceDescriptor = i13 % 128;
                    return i13 % 2 != 0;
                }
                if (Intrinsics.areEqual(this.cancelAll, balanceInfo.cancelAll)) {
                    return !(Intrinsics.areEqual(this.onTransact, balanceInfo.onTransact) ^ true) && Intrinsics.areEqual(this.cancel, balanceInfo.cancel);
                }
                int i14 = INotificationSideChannelStub + 77;
                getInterfaceDescriptor = i14 % 128;
                int i15 = i14 % 2;
                return false;
            }
            int i16 = getInterfaceDescriptor + 101;
            INotificationSideChannelStub = i16 % 128;
            int i17 = i16 % 2;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i = 2 % 2;
        int iHashCode6 = Integer.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        String str = this.b;
        int iHashCode7 = 0;
        if (str == null) {
            int i2 = INotificationSideChannelStub + 81;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        MembershipType membershipType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode8 = membershipType == null ? 0 : membershipType.hashCode();
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        if (str3 == null) {
            int i4 = INotificationSideChannelStub + 89;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.asInterface;
        if (str4 == null) {
            int i6 = getInterfaceDescriptor + 99;
            INotificationSideChannelStub = i6 % 128;
            iHashCode3 = i6 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode3 = str4.hashCode();
            int i7 = INotificationSideChannelStub + 21;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
        }
        String str5 = this.d;
        if (str5 == null) {
            int i9 = getInterfaceDescriptor + 27;
            INotificationSideChannelStub = i9 % 128;
            int i10 = i9 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str5.hashCode();
        }
        String str6 = this.asBinder;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.g;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.a;
        int iHashCode12 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.cancelAll;
        if (str9 == null) {
            int i11 = getInterfaceDescriptor;
            int i12 = i11 + 77;
            INotificationSideChannelStub = i12 % 128;
            int i13 = i12 % 2;
            int i14 = i11 + 75;
            INotificationSideChannelStub = i14 % 128;
            int i15 = i14 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str9.hashCode();
        }
        String str10 = this.onTransact;
        int iHashCode13 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.cancel;
        if (str11 != null) {
            int i16 = getInterfaceDescriptor + 103;
            INotificationSideChannelStub = i16 % 128;
            if (i16 % 2 == 0) {
                str11.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode7 = str11.hashCode();
        }
        return (((((((((((((((((((((((iHashCode6 * 31) + iHashCode) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode5) * 31) + iHashCode13) * 31) + iHashCode7;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str = this.b;
        MembershipType membershipType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        String str4 = this.asInterface;
        String str5 = this.d;
        String str6 = this.asBinder;
        String str7 = this.g;
        String str8 = this.a;
        String str9 = this.cancelAll;
        String str10 = this.onTransact;
        String str11 = this.cancel;
        StringBuilder sb = new StringBuilder("BalanceInfo(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(i2);
        sb.append(", b=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(membershipType);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str3);
        sb.append(", asInterface=");
        sb.append(str4);
        sb.append(", d=");
        sb.append(str5);
        sb.append(", asBinder=");
        sb.append(str6);
        sb.append(", g=");
        sb.append(str7);
        sb.append(", a=");
        sb.append(str8);
        sb.append(", cancelAll=");
        sb.append(str9);
        sb.append(", onTransact=");
        sb.append(str10);
        sb.append(", cancel=");
        sb.append(str11);
        sb.append(")");
        String string = sb.toString();
        int i3 = INotificationSideChannelStub + 75;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeInt(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.b);
        MembershipType membershipType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (membershipType == null) {
            int i2 = INotificationSideChannelStub + 67;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            membershipType.writeToParcel(p0, p1);
            int i4 = INotificationSideChannelStub + 5;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.asInterface);
        p0.writeString(this.d);
        p0.writeString(this.asBinder);
        p0.writeString(this.g);
        p0.writeString(this.a);
        p0.writeString(this.cancelAll);
        p0.writeString(this.onTransact);
        p0.writeString(this.cancel);
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        cancelAll = new char[]{60049, 59744, 59747, 60047, 60058, 59749, 60061, 60055, 60063, 60060, 60054, 60079, 60052, 59746, 60117, 60083, 60046, 59745, 60059, 60048, 60041, 60062, 60053, 59748, 60073, 60072, 60090, 60057, 60056, 60040, 60051, 60045, 60034, 60088, 60050, 60043};
        onTransact = (char) 57191;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, byte r8, int r9) {
        /*
            int r9 = r9 * 2
            int r9 = 1 - r9
            byte[] r0 = com.bpjstku.presentation.program.model.BalanceInfo.$$c
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r7 = 116 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2d
        L14:
            r3 = r2
        L15:
            r6 = r8
            r8 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r8
            int r7 = r7 + 1
            r1[r3] = r5
            if (r4 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.model.BalanceInfo.$$g(byte, byte, int):java.lang.String");
    }

    public static final class b implements Parcelable.Creator<BalanceInfo> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BalanceInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BalanceInfo(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : MembershipType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BalanceInfo[] newArray(int i) {
            return new BalanceInfo[i];
        }
    }
}
