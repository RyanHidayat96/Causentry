package com.bpjstku.domain.promo.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\u0003\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b&\u0010!J\u0010\u0010'\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\u00020*2\u0006\u0010\u0003\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020\u001f¢\u0006\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010.R\u0014\u00103\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010.R\u0014\u00105\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010.R\u001a\u00102\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\b2\u0010(R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010.R\u0014\u00109\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010.R\u0014\u00107\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010.R\u0014\u0010>\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010.R\u0014\u0010?\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010.R\u0014\u0010-\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010.R\u0014\u0010B\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010.R\u0014\u0010D\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010.R\u0014\u0010A\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010.R\u0014\u0010<\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010.R\u0014\u0010C\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010.R\u0014\u0010;\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010.R\u0014\u00104\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010.R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u00108R\u0014\u00100\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010.R\u0014\u0010@\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010.R\u0014\u0010G\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010.R\u0014\u0010E\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010."}, d2 = {"Lcom/bpjstku/domain/promo/model/DetailMerchant;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "", "Lcom/bpjstku/domain/promo/model/SyaratMerchant;", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "cancel", "Ljava/lang/String;", "b", "MediaBrowserCompat", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "INotificationSideChannelDefault", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "d", "asInterface", "Ljava/util/List;", "a", "asBinder", "getInterfaceDescriptor", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "g", "notify", "write", "INotificationSideChannel", "onTransact", "INotificationSideChannelStub", "cancelAll", "connect", "INotificationSideChannelStubProxy", "read"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DetailMerchant implements Parcelable {
    public static final Parcelable.Creator<DetailMerchant> CREATOR;
    private static int getExtras;
    private static char getItem;
    private static char getNotifyChildrenChangedOptions;
    private static char getRoot;
    private static char read;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final String onTransact;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private final String cancelAll;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private final String MediaBrowserCompat;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String g;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final List<SyaratMerchant> INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String read;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String write;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String asBinder;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final String INotificationSideChannelDefault;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final List<SyaratMerchant> d;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String connect;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final String b;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private final String getInterfaceDescriptor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String notify;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private final String a;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final String INotificationSideChannel;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final String INotificationSideChannelStub;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String cancel;
    private static final byte[] $$c = {112, 19, -59, 97};
    private static final int $$f = 41;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {89, 92, -72, 43, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 59, -6, -10, 13, -20, 14, -12, -7, 11, -72, 63, -7, -14, -1, -1, 11, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -27, 21, -21, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -69};
    private static final int $$e = 213;
    private static final byte[] $$a = {14, 70, 6, -35, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 237;
    private static int sendCustomAction = 0;
    private static int getSessionToken = 1;
    private static int disconnect = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r6 = 103 - r6
            byte[] r0 = com.bpjstku.domain.promo.model.DetailMerchant.$$a
            int r8 = r8 * 52
            int r1 = 53 - r8
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r7 = r7 + 1
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2c:
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.domain.promo.model.DetailMerchant.c(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 15
            int r7 = 99 - r7
            byte[] r0 = com.bpjstku.domain.promo.model.DetailMerchant.$$d
            int r9 = r9 * 3
            int r9 = 53 - r9
            int r8 = r8 * 49
            int r8 = 53 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r7 = r9
            r5 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2c:
            int r7 = r7 + r8
            int r7 = r7 + 3
            int r8 = r3 + 1
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.domain.promo.model.DetailMerchant.f(short, short, int, java.lang.Object[]):void");
    }

    public DetailMerchant(String str, String str2, String str3, String str4, String str5, List<SyaratMerchant> list, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, List<SyaratMerchant> list2, String str19, String str20, String str21, String str22) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        this.b = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
        this.TuitionPaymentFragmentbindingInflater1 = str3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str5;
        this.d = list;
        this.asBinder = str6;
        this.a = str7;
        this.asInterface = str8;
        this.g = str9;
        this.notify = str10;
        this.cancel = str11;
        this.onTransact = str12;
        this.cancelAll = str13;
        this.INotificationSideChannel = str14;
        this.RemoteActionCompatParcelizer = str15;
        this.INotificationSideChannelStub = str16;
        this.getInterfaceDescriptor = str17;
        this.INotificationSideChannelDefault = str18;
        this.INotificationSideChannelStubProxy = list2;
        this.MediaBrowserCompat = str19;
        this.write = str20;
        this.read = str21;
        this.connect = str22;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i3 = $10 + 97;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                int i7 = $10 + 107;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[c];
                int i9 = (c3 + i5) ^ ((c3 << 4) + ((char) (((long) getItem) ^ 8611973335120459638L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getNotifyChildrenChangedOptions);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[c] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char maximumDrawingCacheSize = (char) (47773 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 468;
                        int iLastIndexOf = 12 - TextUtils.lastIndexOf("", '0');
                        Class[] clsArr = new Class[4];
                        clsArr[c] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, jumpTapTimeout, iLastIndexOf, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i11 = i6;
                    Object[] objArr3 = {Integer.valueOf(cArr3[c]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) read) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(getRoot)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 47774), 468 - Drawable.resolveOpacity(0, 0), 13 - (ViewConfiguration.getWindowTouchSlop() >> 8), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6 = i11 + 1;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b = (byte) 0;
                byte b2 = b;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2323, 44 - Color.alpha(0), -1312321721, false, $$g(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = getSessionToken + 87;
        sendCustomAction = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char trimmedLength = (char) TextUtils.getTrimmedLength("");
            int i4 = 877 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 11;
            byte b = (byte) ($$b & 23);
            byte b2 = $$a[5];
            Object[] objArr2 = new Object[1];
            c(b, b2, (byte) (-b2), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength, i4, iIndexOf, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{3382, 38052, 13073, 'T', 14799, 45991, 33973, 16950, 18223, 47754, 27924, 550, 36477, 1175, 5128, 8706, 1474, 50010, 18000, 19, 19179, 21837, 5266, 58960}, 22 - (Process.myPid() >> 22), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{43463, 18278, 56752, 33324, 41355, 46821, 850, 46635, 17155, 21736, 53047, 6189, 32281, 62889, 59547, 24401, 16393, 36320}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cGreen = (char) Color.green(0);
            int i5 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 876;
            int i6 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            c(bArr[54], bArr[5], bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cGreen, i5, i6, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int gidForName = Process.getGidForName("") + 877;
                int maximumFlingVelocity = 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte[] bArr2 = $$a;
                byte b3 = bArr2[7];
                Object[] objArr6 = new Object[1];
                c(b3, (byte) (b3 | 51), (byte) (-bArr2[5]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, gidForName, maximumFlingVelocity, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i7 = ~iElapsedRealtime;
            int i8 = (((~(i7 | (-436740199))) | (~((-477050428) | i7)) | 403185698) * (-397)) + 887003732 + ((iElapsedRealtime | (-107419230)) * 397) + 1217866901;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
            int i11 = sendCustomAction + 109;
            getSessionToken = i11 % 128;
            int i12 = i11 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{820, 52741, 21124, 49163, 44218, 37928, 42506, 16432, 13285, 44388, 56575, 19754, 58313, 28010, 11995, 39266, 58869, 16059, 13211, 35665, 57371, 59566, 42728, 30043, 23741, 2118, 6160, 49789}, 27 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{28216, 18500, 47093, 27020, 12376, 62746, 52784, 23201, 37114, 55018, 27838, 11902, 28074, 15551, 45542, 65504, 48472, 13381, 43441, 15985}, 18 - TextUtils.indexOf("", "", 0, 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{56059, 52392, 52563, 1465, 45084, 51504, 42250, 23814, 65154, 54501, 3040, 23042, 26110, 49790, 15716, 61966, 15822, 21856}, 16 - (ViewConfiguration.getTouchSlop() >> 8), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{22556, 45067, 56388, 21140, 13327, 21261, 5669, 43059, 6084, 53886, 44360, 21092, 1333, 26303, 56810, 64863, 48587, 21393}, TextUtils.indexOf("", "") + 16, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 1217866901};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[35];
                byte b5 = (byte) (b4 + 1);
                byte b6 = (byte) (-b4);
                Object[] objArr13 = new Object[1];
                f(b5, b6, b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = (byte) (-bArr3[35]);
                byte b8 = (byte) (b7 - 1);
                Object[] objArr14 = new Object[1];
                f(b7, b8, b8, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char defaultSize = (char) View.getDefaultSize(0, 0);
                        int trimmedLength2 = 876 - TextUtils.getTrimmedLength("");
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 10;
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[7];
                        Object[] objArr16 = new Object[1];
                        c(b9, (byte) (b9 | 51), (byte) (-bArr4[5]), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize, trimmedLength2, offsetBefore, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(new char[]{3382, 38052, 13073, 'T', 14799, 45991, 33973, 16950, 18223, 47754, 27924, 550, 36477, 1175, 5128, 8706, 1474, 50010, 18000, 19, 19179, 21837, 5266, 58960}, 22 - View.MeasureSpec.getMode(0), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(new char[]{43463, 18278, 56752, 33324, 41355, 46821, 850, 46635, 17155, 21736, 53047, 6189, 32281, 62889, 59547, 24401, 16393, 36320}, 14 - TextUtils.lastIndexOf("", '0', 0, 0), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cArgb = (char) Color.argb(0, 0, 0, 0);
                            int i13 = 877 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int iMyTid = 10 - (Process.myTid() >> 22);
                            byte[] bArr5 = $$a;
                            Object[] objArr19 = new Object[1];
                            c(bArr5[54], bArr5[5], bArr5[7], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, i13, iMyTid, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int i14 = 876 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int iRgb = (-16777206) - Color.rgb(0, 0, 0);
                            byte b10 = (byte) ($$b & 23);
                            byte b11 = $$a[5];
                            Object[] objArr20 = new Object[1];
                            c(b10, b11, (byte) (-b11), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize, i14, iRgb, 252381699, false, (String) objArr20[0], null);
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
        if (((int[]) objArr[0])[0] == ((int[]) objArr[2])[0]) {
            int i15 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i16 = ~iIdentityHashCode;
            int i17 = i15 + 1549813012 + (((~(i16 | (-14268342))) | 54578570) * (-1042)) + (((-14268342) | iIdentityHashCode) * 521) + (((~(iIdentityHashCode | (-54578571))) | 50350090 | (~(i16 | (-10039862)))) * 521);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr21[1])[0] = i19 ^ (i19 << 5);
            int i20 = getSessionToken + 51;
            sendCustomAction = i20 % 128;
            int i21 = i20 % 2;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        throw null;
    }

    static {
        getExtras = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = disconnect + 91;
        getExtras = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = getSessionToken;
        int i3 = i2 + 109;
        sendCustomAction = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 19;
        sendCustomAction = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = sendCustomAction + 93;
            getSessionToken = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(p0 instanceof DetailMerchant)) {
            return false;
        }
        DetailMerchant detailMerchant = (DetailMerchant) p0;
        if (!Intrinsics.areEqual(this.b, detailMerchant.b) || !Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, detailMerchant.TuitionPaymentFragmentspecialinlinedviewModeldefault3) || !Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, detailMerchant.TuitionPaymentFragmentbindingInflater1) || !Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, detailMerchant.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            return false;
        }
        Object obj = null;
        if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, detailMerchant.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            int i3 = sendCustomAction;
            int i4 = i3 + 5;
            getSessionToken = i4 % 128;
            boolean z = i4 % 2 == 0;
            int i5 = i3 + 37;
            getSessionToken = i5 % 128;
            if (i5 % 2 != 0) {
                return z;
            }
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.d, detailMerchant.d)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asBinder, detailMerchant.asBinder)) {
            int i6 = getSessionToken;
            int i7 = i6 + 43;
            sendCustomAction = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 75;
            sendCustomAction = i9 % 128;
            if (i9 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.a, detailMerchant.a)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asInterface, detailMerchant.asInterface)) {
            int i10 = getSessionToken + 67;
            sendCustomAction = i10 % 128;
            return i10 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.g, detailMerchant.g) && Intrinsics.areEqual(this.notify, detailMerchant.notify)) {
            if (!(!Intrinsics.areEqual(this.cancel, detailMerchant.cancel))) {
                if (!Intrinsics.areEqual(this.onTransact, detailMerchant.onTransact) || (!Intrinsics.areEqual(this.cancelAll, detailMerchant.cancelAll)) || !Intrinsics.areEqual(this.INotificationSideChannel, detailMerchant.INotificationSideChannel) || !Intrinsics.areEqual(this.RemoteActionCompatParcelizer, detailMerchant.RemoteActionCompatParcelizer) || !Intrinsics.areEqual(this.INotificationSideChannelStub, detailMerchant.INotificationSideChannelStub)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.getInterfaceDescriptor, detailMerchant.getInterfaceDescriptor)) {
                    int i11 = sendCustomAction + 17;
                    getSessionToken = i11 % 128;
                    int i12 = i11 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.INotificationSideChannelDefault, detailMerchant.INotificationSideChannelDefault)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.INotificationSideChannelStubProxy, detailMerchant.INotificationSideChannelStubProxy)) {
                    int i13 = getSessionToken + 59;
                    sendCustomAction = i13 % 128;
                    int i14 = i13 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.MediaBrowserCompat, detailMerchant.MediaBrowserCompat)) {
                    return ((Intrinsics.areEqual(this.write, detailMerchant.write) ^ true) || (Intrinsics.areEqual(this.read, detailMerchant.read) ^ true) || !Intrinsics.areEqual(this.connect, detailMerchant.connect)) ? false : true;
                }
                int i15 = getSessionToken + 107;
                sendCustomAction = i15 % 128;
                return i15 % 2 != 0;
            }
            int i16 = sendCustomAction + 77;
            getSessionToken = i16 % 128;
            int i17 = i16 % 2;
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = sendCustomAction + 53;
        getSessionToken = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((((((((((((((((((((((((((((this.b.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + this.d.hashCode()) * 31) + this.asBinder.hashCode()) * 31) + this.a.hashCode()) * 31) + this.asInterface.hashCode()) * 31) + this.g.hashCode()) * 31) + this.notify.hashCode()) * 31) + this.cancel.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + this.cancelAll.hashCode()) * 31) + this.INotificationSideChannel.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.INotificationSideChannelStub.hashCode()) * 31) + this.getInterfaceDescriptor.hashCode()) * 31) + this.INotificationSideChannelDefault.hashCode()) * 31) + this.INotificationSideChannelStubProxy.hashCode()) * 31) + this.MediaBrowserCompat.hashCode()) * 31) + this.write.hashCode()) * 31) + this.read.hashCode()) * 31) + this.connect.hashCode();
        int i4 = getSessionToken + 5;
        sendCustomAction = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.b;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        List<SyaratMerchant> list = this.d;
        String str6 = this.asBinder;
        String str7 = this.a;
        String str8 = this.asInterface;
        String str9 = this.g;
        String str10 = this.notify;
        String str11 = this.cancel;
        String str12 = this.onTransact;
        String str13 = this.cancelAll;
        String str14 = this.INotificationSideChannel;
        String str15 = this.RemoteActionCompatParcelizer;
        String str16 = this.INotificationSideChannelStub;
        String str17 = this.getInterfaceDescriptor;
        String str18 = this.INotificationSideChannelDefault;
        List<SyaratMerchant> list2 = this.INotificationSideChannelStubProxy;
        String str19 = this.MediaBrowserCompat;
        String str20 = this.write;
        String str21 = this.read;
        String str22 = this.connect;
        StringBuilder sb = new StringBuilder("DetailMerchant(b=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str4);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str5);
        sb.append(", d=");
        sb.append(list);
        sb.append(", asBinder=");
        sb.append(str6);
        sb.append(", a=");
        sb.append(str7);
        sb.append(", asInterface=");
        sb.append(str8);
        sb.append(", g=");
        sb.append(str9);
        sb.append(", notify=");
        sb.append(str10);
        sb.append(", cancel=");
        sb.append(str11);
        sb.append(", onTransact=");
        sb.append(str12);
        sb.append(", cancelAll=");
        sb.append(str13);
        sb.append(", INotificationSideChannel=");
        sb.append(str14);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str15);
        sb.append(", INotificationSideChannelStub=");
        sb.append(str16);
        sb.append(", getInterfaceDescriptor=");
        sb.append(str17);
        sb.append(", INotificationSideChannelDefault=");
        sb.append(str18);
        sb.append(", INotificationSideChannelStubProxy=");
        sb.append(list2);
        sb.append(", MediaBrowserCompat=");
        sb.append(str19);
        sb.append(", write=");
        sb.append(str20);
        sb.append(", read=");
        sb.append(str21);
        sb.append(", connect=");
        sb.append(str22);
        sb.append(")");
        String string = sb.toString();
        int i2 = getSessionToken + 11;
        sendCustomAction = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.b);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        List<SyaratMerchant> list = this.d;
        p0.writeInt(list.size());
        Iterator<SyaratMerchant> it = list.iterator();
        while (!(!it.hasNext())) {
            int i2 = getSessionToken + 67;
            sendCustomAction = i2 % 128;
            int i3 = i2 % 2;
            it.next().writeToParcel(p0, p1);
        }
        p0.writeString(this.asBinder);
        p0.writeString(this.a);
        p0.writeString(this.asInterface);
        p0.writeString(this.g);
        p0.writeString(this.notify);
        p0.writeString(this.cancel);
        p0.writeString(this.onTransact);
        p0.writeString(this.cancelAll);
        p0.writeString(this.INotificationSideChannel);
        p0.writeString(this.RemoteActionCompatParcelizer);
        p0.writeString(this.INotificationSideChannelStub);
        p0.writeString(this.getInterfaceDescriptor);
        p0.writeString(this.INotificationSideChannelDefault);
        List<SyaratMerchant> list2 = this.INotificationSideChannelStubProxy;
        p0.writeInt(list2.size());
        Iterator<SyaratMerchant> it2 = list2.iterator();
        int i4 = sendCustomAction + 109;
        getSessionToken = i4 % 128;
        int i5 = i4 % 2;
        while (!(!it2.hasNext())) {
            it2.next().writeToParcel(p0, p1);
        }
        p0.writeString(this.MediaBrowserCompat);
        p0.writeString(this.write);
        p0.writeString(this.read);
        p0.writeString(this.connect);
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        read = (char) 56989;
        getRoot = (char) 28696;
        getItem = (char) 48221;
        getNotifyChildrenChangedOptions = (char) 38249;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, short r8, int r9) {
        /*
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r9 = r9 * 3
            int r9 = r9 + 1
            byte[] r0 = com.bpjstku.domain.promo.model.DetailMerchant.$$c
            int r7 = r7 * 4
            int r7 = r7 + 108
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2a:
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.domain.promo.model.DetailMerchant.$$g(byte, short, int):java.lang.String");
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Parcelable.Creator<DetailMerchant> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DetailMerchant createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SyaratMerchant.CREATOR.createFromParcel(parcel));
            }
            ArrayList arrayList2 = arrayList;
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            int i4 = 0;
            while (i4 != i3) {
                arrayList3.add(SyaratMerchant.CREATOR.createFromParcel(parcel));
                i4++;
                i3 = i3;
            }
            return new DetailMerchant(string, string2, string3, string4, string5, arrayList2, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, arrayList3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DetailMerchant[] newArray(int i) {
            return new DetailMerchant[i];
        }
    }
}
