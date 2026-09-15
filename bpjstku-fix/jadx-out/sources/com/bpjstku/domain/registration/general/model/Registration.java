package com.bpjstku.domain.registration.general.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020&HÖ\u0001¢\u0006\u0004\b,\u0010(J\u0010\u0010-\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\u0002002\u0006\u0010\u0003\u001a\u00020/2\u0006\u0010\u0005\u001a\u00020&¢\u0006\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00108\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u0014\u0010<\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u00107R\u0014\u0010>\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u00107R\u0014\u00109\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u00107R\u0014\u0010A\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u00107R\u0016\u0010C\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u00107R\u0016\u0010E\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u00107R\u0016\u0010F\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0016\u0010;\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u00107R\u0016\u0010I\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u00107R\u0016\u0010K\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u00107R\u0016\u0010=\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u00107R\u0016\u0010?\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u00107R\u0016\u0010G\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u00107R\u0016\u0010B\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u00107R\u0016\u0010N\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u00107R\u0016\u0010P\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010OR\u0016\u0010J\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010OR\u0016\u0010Q\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010OR\u001c\u0010H\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u00107\u001a\u0004\b:\u0010.R\u0016\u0010S\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00107R\u0016\u0010D\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u00107R\u0016\u0010@\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u00107R\u0016\u00103\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u00107R\u0016\u0010L\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u00107R\u0016\u0010R\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u00107R\u0016\u00106\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u00107R\u0016\u0010T\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bC\u00104R\u0016\u0010U\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bF\u00104"}, d2 = {"Lcom/bpjstku/domain/registration/general/model/Registration;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "", "p18", "p19", "p20", "p21", "p22", "p23", "p24", "p25", "p26", "p27", "p28", "p29", "p30", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "getRoot", "Z", "b", "disconnect", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "onTransact", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "cancel", "TuitionPaymentFragmentbindingInflater1", "notify", "IconCompatParcelizer", "a", "getInterfaceDescriptor", "asBinder", "connect", "asInterface", "g", "INotificationSideChannelDefault", "read", "INotificationSideChannel", "INotificationSideChannelStubProxy", "cancelAll", "getNotifyChildrenChangedOptions", "sendCustomAction", "RemoteActionCompatParcelizer", "Ljava/lang/Double;", "INotificationSideChannelStub", "write", "getItem", "MediaBrowserCompat", "getExtras", FirebaseAnalytics.Event.SEARCH}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Registration implements Parcelable {
    public static final Parcelable.Creator<Registration> CREATOR;
    private static int isConnected;
    private static int search;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public final String cancel;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    public final String onTransact;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    public final String disconnect;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    public final String cancelAll;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public final String a;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    public final String connect;
    public final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final Double INotificationSideChannelStub;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String IconCompatParcelizer;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String getInterfaceDescriptor;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Double INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public boolean getExtras;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final Double write;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String MediaBrowserCompat;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public final String getNotifyChildrenChangedOptions;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    public final String asInterface;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean search;

    /* JADX INFO: renamed from: getExtras, reason: from kotlin metadata */
    private final String getRoot;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    public final String asBinder;

    /* JADX INFO: renamed from: getItem, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from kotlin metadata */
    private final String notify;

    /* JADX INFO: renamed from: getRoot, reason: from kotlin metadata */
    private final boolean b;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public final String d;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String INotificationSideChannel;

    /* JADX INFO: renamed from: sendCustomAction, reason: from kotlin metadata */
    private final String INotificationSideChannelDefault;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public final String getItem;
    private static final byte[] $$c = {94, 6, -99, -107};
    private static final int $$f = 98;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {2, -84, 82, -15, -12, 2, 63, -51, -15, 0, -3, 13, -6, -13, 20, -13, 68, -59, -5, -6, 15, -13, 4, 13, -11, 62, -19, -5, -35, 56, -63, 29, 15, -7, 39, -29, -5, -27, 48, -68, 34, 15, -7, -33, 12, -11, 11, -6, 1, 30, -17, -24, 12, 8, -9, -6, 46, -44, 17, -6, -6, 8, -9, -6, 18, -7, -5, 10, -5, -5, 7, 30, -37, 8, -6, 11, -19, 15, -13, 65};
    private static final int $$e = 32;
    private static final byte[] $$a = {55, -47, -47, 67, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 82;
    private static int getServiceComponent = 0;
    private static int handleMessage = 1;
    private static int getSessionToken = 1;

    private static void c(int i, byte b, short s, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = 92 - s;
        int i3 = b * 15;
        int i4 = (i * 2) + 84;
        byte[] bArr2 = new byte[i3 + 38];
        int i5 = i3 + 37;
        int i6 = -1;
        if (bArr == null) {
            i4 = (i5 + (-i2)) - 11;
            i2 = i2;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i2 + 1;
            i4 = (i4 + (-bArr[i8])) - 11;
            i2 = i8;
            i6 = i7;
        }
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
    private static void f(short r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.bpjstku.domain.registration.general.model.Registration.$$d
            int r6 = r6 * 2
            int r6 = r6 + 38
            int r7 = r7 * 15
            int r7 = r7 + 84
            int r5 = r5 * 39
            int r5 = 43 - r5
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r4 = r0[r5]
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            int r5 = r5 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.domain.registration.general.model.Registration.f(short, byte, int, java.lang.Object[]):void");
    }

    public Registration(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Double d, Double d2, Double d3, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.b = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str3;
        this.TuitionPaymentFragmentbindingInflater1 = str4;
        this.d = str5;
        this.a = str6;
        this.asBinder = str7;
        this.asInterface = str8;
        this.g = str9;
        this.onTransact = str10;
        this.INotificationSideChannel = str11;
        this.cancelAll = str12;
        this.cancel = str13;
        this.notify = str14;
        this.INotificationSideChannelDefault = str15;
        this.getInterfaceDescriptor = str16;
        this.RemoteActionCompatParcelizer = str17;
        this.INotificationSideChannelStub = d;
        this.INotificationSideChannelStubProxy = d2;
        this.write = d3;
        this.read = str18;
        this.MediaBrowserCompat = str19;
        this.connect = str20;
        this.IconCompatParcelizer = str21;
        this.getRoot = str22;
        this.getNotifyChildrenChangedOptions = str23;
        this.getItem = str24;
        this.disconnect = str25;
        this.getExtras = z2;
        this.search = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Registration(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Double d, Double d2, Double d3, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z4;
        boolean z5;
        if ((i & 536870912) != 0) {
            int i2 = handleMessage + 9;
            getServiceComponent = i2 % 128;
            int i3 = i2 % 2;
            z4 = false;
        } else {
            z4 = z2;
        }
        if ((i & BasicMeasure.EXACTLY) != 0) {
            int i4 = handleMessage + 125;
            int i5 = i4 % 128;
            getServiceComponent = i5;
            boolean z6 = i4 % 2 != 0;
            int i6 = i5 + 37;
            handleMessage = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            z5 = z6;
        } else {
            z5 = z3;
        }
        this(z, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, d, d2, d3, str18, str19, str20, str21, str22, str23, str24, str25, z4, z5);
    }

    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i5 = $11 + 73;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(search)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 1), TextUtils.getOffsetAfter("", 0) + 3291, 'O' - AndroidCharacter.getMirror('0'), 1199271174, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 651, 44 - Gravity.getAbsoluteGravity(0, 0), -450685997, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            int i8 = $11 + 51;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i10 = $10 + 17;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.MeasureSpec.getMode(0) + 651, 44 - KeyEvent.getDeadChar(0, 0), -450685997, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
        int i12 = $11 + 123;
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 89 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x024e  */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = getServiceComponent + 7;
        handleMessage = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
            int i4 = 877 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 11;
            byte b = $$a[7];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            c(b, b2, (byte) (b2 | 89), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i4, iLastIndexOf, -1650998592, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(false, 226 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9, new char[]{16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(false, 231 - Drawable.resolveOpacity(0, 0), TextUtils.indexOf("", "", 0) + 15, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3, new char[]{2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r'}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 876;
            int i5 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10;
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            c(bArr[7], bArr[5], (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAxisFromString, doubleTapTimeout, i5, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mode = (char) View.MeasureSpec.getMode(0);
                int keyRepeatTimeout = 876 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int iResolveSizeAndState = 10 - View.resolveSizeAndState(0, 0, 0);
                byte[] bArr2 = $$a;
                byte b3 = bArr2[7];
                Object[] objArr6 = new Object[1];
                c(b3, bArr2[5], b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mode, keyRepeatTimeout, iResolveSizeAndState, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i6 = (~System.identityHashCode(this)) | 759995045;
            int i7 = ((1203538488 + (i6 * 495)) + (((~i6) | 84417061) * 495)) - 813285043;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            int i10 = handleMessage + 81;
            getServiceComponent = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 5 % 2;
            }
        } else {
            Object[] objArr8 = new Object[1];
            e(false, ImageFormat.getBitsPerPixel(0) + 228, 26 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 12, new char[]{17, 6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(false, 234 - (ViewConfiguration.getWindowTouchSlop() >> 8), 17 - ((byte) KeyEvent.getModifierMetaStateMask()), 2 - TextUtils.lastIndexOf("", '0', 0, 0), new char[]{65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n'}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    applicationContext = applicationContext.getApplicationContext();
                } else {
                    int i12 = handleMessage + 39;
                    getServiceComponent = i12 % 128;
                    if (i12 % 2 != 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                }
            }
            Object[] objArr10 = new Object[1];
            e(false, 226 - (ViewConfiguration.getLongPressTimeout() >> 16), (Process.myTid() >> 22) + 16, ExpandableListView.getPackedPositionType(0L) + 13, new char[]{65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(true, TextUtils.getCapsMode("", 0, 0) + 230, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16, Color.green(0) + 12, new char[]{2, '\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i13 = handleMessage + 21;
            getServiceComponent = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -813285043};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[48];
                byte b5 = b4;
                Object[] objArr13 = new Object[1];
                f(b4, b5, b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr3[9];
                byte b7 = b6;
                Object[] objArr14 = new Object[1];
                f(b6, b7, b7, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i15 = getServiceComponent + 107;
                    handleMessage = i15 % 128;
                    int i16 = i15 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cRed = (char) Color.red(0);
                        int iResolveSize = View.resolveSize(0, 0) + 876;
                        int iLastIndexOf2 = 9 - TextUtils.lastIndexOf("", '0', 0);
                        byte[] bArr4 = $$a;
                        byte b8 = bArr4[7];
                        Object[] objArr16 = new Object[1];
                        c(b8, bArr4[5], b8, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRed, iResolveSize, iLastIndexOf2, 2012931276, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(false, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 227, 22 - KeyEvent.normalizeMetaState(0), 10 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(false, 231 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 3 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new char[]{2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r'}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                            int i17 = 876 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 11;
                            byte[] bArr5 = $$a;
                            Object[] objArr19 = new Object[1];
                            c(bArr5[7], bArr5[5], (byte) 52, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionType, i17, iLastIndexOf3, 2012020043, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                            int mode2 = 876 - View.MeasureSpec.getMode(0);
                            int i18 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10;
                            byte b9 = $$a[7];
                            byte b10 = b9;
                            Object[] objArr20 = new Object[1];
                            c(b9, b10, (byte) (b10 | 89), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(touchSlop, mode2, i18, -1650998592, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
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
        int i19 = ((int[]) objArr[2])[0];
        int i20 = ((int[]) objArr[0])[0];
        if (i20 == i19) {
            int i21 = handleMessage + 107;
            getServiceComponent = i21 % 128;
            int i22 = i21 % 2;
            int i23 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i24 = ~iIdentityHashCode;
            int i25 = i23 + (-85322668) + (((~((-610426046) | i24)) | 608194704) * 184) + ((iIdentityHashCode | (-652967616)) * (-184)) + ((~((-650736275) | i24)) * 184);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr21[1])[0] = i27 ^ (i27 << 5);
        } else {
            Toast.makeText((Context) null, i20 / (((i20 - 1) * i20) % 2), 0).show();
            int i28 = ((int[]) objArr[1])[0];
            Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i29 = ~((~System.identityHashCode(this)) | 14494683);
            int i30 = i28 + ((5505538 | i29) * (-970)) + 956178734 + ((i29 | 8989145) * 970);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr22[1])[0] = i32 ^ (i32 << 5);
        }
        String str = this.read;
        int i33 = getServiceComponent + 93;
        handleMessage = i33 % 128;
        if (i33 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Parcelable.Creator<Registration> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Registration createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Registration(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Registration[] newArray(int i) {
            return new Registration[i];
        }
    }

    public static /* synthetic */ Registration TuitionPaymentFragmentspecialinlinedviewModeldefault2(Registration registration, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Double d, Double d2, Double d3, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, boolean z2, boolean z3, int i) {
        boolean z4;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        Double d4;
        Double d5;
        String str34;
        String str35;
        String str36;
        String str37;
        String str38;
        String str39;
        boolean z5;
        int i2 = 2 % 2;
        Object obj = null;
        if ((i & 1) != 0) {
            int i3 = handleMessage + 107;
            getServiceComponent = i3 % 128;
            if (i3 % 2 != 0) {
                boolean z6 = registration.b;
                obj.hashCode();
                throw null;
            }
            z4 = registration.b;
        } else {
            z4 = z;
        }
        String str40 = (i & 2) != 0 ? registration.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : str;
        String str41 = (i & 4) != 0 ? registration.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : str2;
        String str42 = (i & 8) != 0 ? registration.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : str3;
        String str43 = (i & 16) != 0 ? registration.TuitionPaymentFragmentbindingInflater1 : str4;
        String str44 = (i & 32) != 0 ? registration.d : str5;
        if ((i & 64) != 0) {
            int i4 = getServiceComponent + 99;
            handleMessage = i4 % 128;
            if (i4 % 2 == 0) {
                String str45 = registration.a;
                throw null;
            }
            str26 = registration.a;
        } else {
            str26 = str6;
        }
        if ((i & 128) != 0) {
            int i5 = handleMessage + 115;
            getServiceComponent = i5 % 128;
            if (i5 % 2 != 0) {
                String str46 = registration.asBinder;
                throw null;
            }
            str27 = registration.asBinder;
        } else {
            str27 = str7;
        }
        String str47 = (i & 256) != 0 ? registration.asInterface : str8;
        String str48 = (i & 512) != 0 ? registration.g : str9;
        String str49 = (i & 1024) != 0 ? registration.onTransact : str10;
        String str50 = (i & 2048) != 0 ? registration.INotificationSideChannel : str11;
        if ((i & 4096) != 0) {
            int i6 = handleMessage + 61;
            str28 = str50;
            getServiceComponent = i6 % 128;
            if (i6 % 2 != 0) {
                str29 = registration.cancelAll;
                int i7 = 52 / 0;
            } else {
                str29 = registration.cancelAll;
            }
        } else {
            str28 = str50;
            str29 = str12;
        }
        if ((i & 8192) != 0) {
            int i8 = getServiceComponent + 61;
            str30 = str29;
            handleMessage = i8 % 128;
            int i9 = i8 % 2;
            str31 = registration.cancel;
            if (i9 == 0) {
                int i10 = 44 / 0;
            }
        } else {
            str30 = str29;
            str31 = str13;
        }
        String str51 = (i & 16384) != 0 ? registration.notify : str14;
        String str52 = (i & 32768) != 0 ? registration.INotificationSideChannelDefault : str15;
        if ((i & 65536) != 0) {
            int i11 = getServiceComponent + 97;
            handleMessage = i11 % 128;
            int i12 = i11 % 2;
            str32 = registration.getInterfaceDescriptor;
        } else {
            str32 = str16;
        }
        String str53 = (131072 & i) != 0 ? registration.RemoteActionCompatParcelizer : str17;
        Double d6 = (i & 262144) != 0 ? registration.INotificationSideChannelStub : d;
        Double d7 = (i & 524288) != 0 ? registration.INotificationSideChannelStubProxy : d2;
        if ((i & 1048576) != 0) {
            d4 = d7;
            int i13 = handleMessage + 35;
            str33 = str32;
            getServiceComponent = i13 % 128;
            int i14 = i13 % 2;
            d5 = registration.write;
            if (i14 != 0) {
                int i15 = 11 / 0;
            }
        } else {
            str33 = str32;
            d4 = d7;
            d5 = d3;
        }
        String str54 = (2097152 & i) != 0 ? registration.read : str18;
        String str55 = (i & 4194304) != 0 ? registration.MediaBrowserCompat : str19;
        if ((i & 8388608) != 0) {
            int i16 = handleMessage + 113;
            getServiceComponent = i16 % 128;
            if (i16 % 2 != 0) {
                String str56 = registration.connect;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str34 = registration.connect;
        } else {
            str34 = str20;
        }
        String str57 = (16777216 & i) != 0 ? registration.IconCompatParcelizer : str21;
        String str58 = (i & 33554432) != 0 ? registration.getRoot : str22;
        String str59 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? registration.getNotifyChildrenChangedOptions : str23;
        if ((i & 134217728) != 0) {
            str36 = str59;
            int i17 = getServiceComponent + 3;
            str35 = str34;
            handleMessage = i17 % 128;
            int i18 = i17 % 2;
            str37 = registration.getItem;
            if (i18 == 0) {
                int i19 = 46 / 0;
            }
        } else {
            str35 = str34;
            str36 = str59;
            str37 = str24;
        }
        String str60 = (268435456 & i) != 0 ? registration.disconnect : str25;
        if ((i & 536870912) != 0) {
            str39 = str60;
            int i20 = handleMessage + 101;
            str38 = str37;
            getServiceComponent = i20 % 128;
            int i21 = i20 % 2;
            z5 = registration.getExtras;
            if (i21 != 0) {
                int i22 = 22 / 0;
            }
        } else {
            str38 = str37;
            str39 = str60;
            z5 = z2;
        }
        boolean z7 = (i & BasicMeasure.EXACTLY) != 0 ? registration.search : z3;
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str26, "");
        return new Registration(z4, str40, str41, str42, str43, str44, str26, str27, str47, str48, str49, str28, str30, str31, str51, str52, str33, str53, d6, d4, d5, str54, str55, str35, str57, str58, str36, str38, str39, z5, z7);
    }

    static {
        isConnected = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = getSessionToken + 79;
        isConnected = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = handleMessage + 3;
        getServiceComponent = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Registration)) {
            int i2 = getServiceComponent + 43;
            handleMessage = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        Registration registration = (Registration) p0;
        if (this.b != registration.b || !Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, registration.TuitionPaymentFragmentspecialinlinedviewModeldefault3) || !Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, registration.TuitionPaymentFragmentspecialinlinedviewModeldefault2) || !Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, registration.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, registration.TuitionPaymentFragmentbindingInflater1)) {
            int i4 = handleMessage + 15;
            getServiceComponent = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.d, registration.d)) {
            int i5 = getServiceComponent + 81;
            handleMessage = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.a, registration.a)) {
            int i7 = getServiceComponent + 45;
            handleMessage = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.asBinder, registration.asBinder)) {
            int i9 = handleMessage + 99;
            getServiceComponent = i9 % 128;
            return i9 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.asInterface, registration.asInterface) || !Intrinsics.areEqual(this.g, registration.g) || !Intrinsics.areEqual(this.onTransact, registration.onTransact) || !Intrinsics.areEqual(this.INotificationSideChannel, registration.INotificationSideChannel) || !Intrinsics.areEqual(this.cancelAll, registration.cancelAll) || !Intrinsics.areEqual(this.cancel, registration.cancel) || !Intrinsics.areEqual(this.notify, registration.notify) || !Intrinsics.areEqual(this.INotificationSideChannelDefault, registration.INotificationSideChannelDefault) || !Intrinsics.areEqual(this.getInterfaceDescriptor, registration.getInterfaceDescriptor)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.RemoteActionCompatParcelizer, registration.RemoteActionCompatParcelizer)) {
            int i10 = handleMessage + 115;
            getServiceComponent = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.INotificationSideChannelStub, (Object) registration.INotificationSideChannelStub)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.INotificationSideChannelStubProxy, (Object) registration.INotificationSideChannelStubProxy)) {
            int i12 = handleMessage + 107;
            getServiceComponent = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.write, (Object) registration.write)) {
            int i14 = handleMessage + 29;
            getServiceComponent = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.read, registration.read)) {
            int i16 = getServiceComponent + 83;
            handleMessage = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.MediaBrowserCompat, registration.MediaBrowserCompat)) {
            return Intrinsics.areEqual(this.connect, registration.connect) && Intrinsics.areEqual(this.IconCompatParcelizer, registration.IconCompatParcelizer) && Intrinsics.areEqual(this.getRoot, registration.getRoot) && Intrinsics.areEqual(this.getNotifyChildrenChangedOptions, registration.getNotifyChildrenChangedOptions) && Intrinsics.areEqual(this.getItem, registration.getItem) && Intrinsics.areEqual(this.disconnect, registration.disconnect) && this.getExtras == registration.getExtras && this.search == registration.search;
        }
        int i18 = handleMessage + 55;
        getServiceComponent = i18 % 128;
        int i19 = i18 % 2;
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
        int iHashCode8 = Boolean.hashCode(this.b);
        int iHashCode9 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        int iHashCode10 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        int iHashCode11 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        int iHashCode12 = this.TuitionPaymentFragmentbindingInflater1.hashCode();
        int iHashCode13 = this.d.hashCode();
        int iHashCode14 = this.a.hashCode();
        String str = this.asBinder;
        int iHashCode15 = str == null ? 0 : str.hashCode();
        String str2 = this.asInterface;
        int iHashCode16 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.g;
        int iHashCode17 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.onTransact;
        int iHashCode18 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.INotificationSideChannel;
        if (str5 == null) {
            int i2 = getServiceComponent + 21;
            handleMessage = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str5.hashCode();
        }
        String str6 = this.cancelAll;
        int iHashCode19 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.cancel;
        int iHashCode20 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.notify;
        if (str8 == null) {
            int i4 = handleMessage + 105;
            getServiceComponent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str8.hashCode();
        }
        String str9 = this.INotificationSideChannelDefault;
        if (str9 == null) {
            int i6 = handleMessage + 115;
            getServiceComponent = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str9.hashCode();
        }
        String str10 = this.getInterfaceDescriptor;
        int iHashCode21 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.RemoteActionCompatParcelizer;
        if (str11 == null) {
            int i8 = handleMessage + 115;
            getServiceComponent = i8 % 128;
            int i9 = i8 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str11.hashCode();
        }
        Double d = this.INotificationSideChannelStub;
        if (d == null) {
            int i10 = getServiceComponent + 33;
            handleMessage = i10 % 128;
            int i11 = i10 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = d.hashCode();
        }
        Double d2 = this.INotificationSideChannelStubProxy;
        int iHashCode22 = d2 == null ? 0 : d2.hashCode();
        Double d3 = this.write;
        if (d3 == null) {
            int i12 = getServiceComponent + 109;
            handleMessage = i12 % 128;
            int i13 = i12 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = d3.hashCode();
        }
        String str12 = this.read;
        int iHashCode23 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.MediaBrowserCompat;
        int iHashCode24 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.connect;
        if (str14 == null) {
            int i14 = getServiceComponent + 61;
            handleMessage = i14 % 128;
            int i15 = i14 % 2;
            iHashCode7 = 0;
        } else {
            iHashCode7 = str14.hashCode();
        }
        String str15 = this.IconCompatParcelizer;
        int iHashCode25 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.getRoot;
        int iHashCode26 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.getNotifyChildrenChangedOptions;
        int iHashCode27 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.getItem;
        int iHashCode28 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.disconnect;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode8 * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode21) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode22) * 31) + iHashCode6) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode7) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + (str19 != null ? str19.hashCode() : 0)) * 31) + Boolean.hashCode(this.getExtras)) * 31) + Boolean.hashCode(this.search);
    }

    public final String toString() {
        int i = 2 % 2;
        boolean z = this.b;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str4 = this.TuitionPaymentFragmentbindingInflater1;
        String str5 = this.d;
        String str6 = this.a;
        String str7 = this.asBinder;
        String str8 = this.asInterface;
        String str9 = this.g;
        String str10 = this.onTransact;
        String str11 = this.INotificationSideChannel;
        String str12 = this.cancelAll;
        String str13 = this.cancel;
        String str14 = this.notify;
        String str15 = this.INotificationSideChannelDefault;
        String str16 = this.getInterfaceDescriptor;
        String str17 = this.RemoteActionCompatParcelizer;
        Double d = this.INotificationSideChannelStub;
        Double d2 = this.INotificationSideChannelStubProxy;
        Double d3 = this.write;
        String str18 = this.read;
        String str19 = this.MediaBrowserCompat;
        String str20 = this.connect;
        String str21 = this.IconCompatParcelizer;
        String str22 = this.getRoot;
        String str23 = this.getNotifyChildrenChangedOptions;
        String str24 = this.getItem;
        String str25 = this.disconnect;
        boolean z2 = this.getExtras;
        boolean z3 = this.search;
        StringBuilder sb = new StringBuilder("Registration(b=");
        sb.append(z);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str4);
        sb.append(", d=");
        sb.append(str5);
        sb.append(", a=");
        sb.append(str6);
        sb.append(", asBinder=");
        sb.append(str7);
        sb.append(", asInterface=");
        sb.append(str8);
        sb.append(", g=");
        sb.append(str9);
        sb.append(", onTransact=");
        sb.append(str10);
        sb.append(", INotificationSideChannel=");
        sb.append(str11);
        sb.append(", cancelAll=");
        sb.append(str12);
        sb.append(", cancel=");
        sb.append(str13);
        sb.append(", notify=");
        sb.append(str14);
        sb.append(", INotificationSideChannelDefault=");
        sb.append(str15);
        sb.append(", getInterfaceDescriptor=");
        sb.append(str16);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str17);
        sb.append(", INotificationSideChannelStub=");
        sb.append(d);
        sb.append(", INotificationSideChannelStubProxy=");
        sb.append(d2);
        sb.append(", write=");
        sb.append(d3);
        sb.append(", read=");
        sb.append(str18);
        sb.append(", MediaBrowserCompat=");
        sb.append(str19);
        sb.append(", connect=");
        sb.append(str20);
        sb.append(", IconCompatParcelizer=");
        sb.append(str21);
        sb.append(", getRoot=");
        sb.append(str22);
        sb.append(", getNotifyChildrenChangedOptions=");
        sb.append(str23);
        sb.append(", getItem=");
        sb.append(str24);
        sb.append(", disconnect=");
        sb.append(str25);
        sb.append(", getExtras=");
        sb.append(z2);
        sb.append(", search=");
        sb.append(z3);
        sb.append(")");
        String string = sb.toString();
        int i2 = getServiceComponent + 49;
        handleMessage = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        int i = 2 % 2;
        int i2 = getServiceComponent + 67;
        handleMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeInt(this.b ? 1 : 0);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.d);
        p0.writeString(this.a);
        p0.writeString(this.asBinder);
        p0.writeString(this.asInterface);
        p0.writeString(this.g);
        p0.writeString(this.onTransact);
        p0.writeString(this.INotificationSideChannel);
        p0.writeString(this.cancelAll);
        p0.writeString(this.cancel);
        p0.writeString(this.notify);
        p0.writeString(this.INotificationSideChannelDefault);
        p0.writeString(this.getInterfaceDescriptor);
        p0.writeString(this.RemoteActionCompatParcelizer);
        Double d = this.INotificationSideChannelStub;
        if (d == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeDouble(d.doubleValue());
        }
        Double d2 = this.INotificationSideChannelStubProxy;
        if (d2 == null) {
            int i4 = handleMessage + 63;
            getServiceComponent = i4 % 128;
            int i5 = i4 % 2;
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeDouble(d2.doubleValue());
        }
        Double d3 = this.write;
        if (d3 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeDouble(d3.doubleValue());
        }
        p0.writeString(this.read);
        p0.writeString(this.MediaBrowserCompat);
        p0.writeString(this.connect);
        p0.writeString(this.IconCompatParcelizer);
        p0.writeString(this.getRoot);
        p0.writeString(this.getNotifyChildrenChangedOptions);
        p0.writeString(this.getItem);
        p0.writeString(this.disconnect);
        p0.writeInt(this.getExtras ? 1 : 0);
        p0.writeInt(this.search ? 1 : 0);
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        search = -83722270;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, short r8) {
        /*
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r0 = com.bpjstku.domain.registration.general.model.Registration.$$c
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r8 = 120 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r8 = r7
            r5 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r6]
        L25:
            int r6 = r6 + 1
            int r8 = r8 + r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.domain.registration.general.model.Registration.$$g(short, int, short):java.lang.String");
    }
}
