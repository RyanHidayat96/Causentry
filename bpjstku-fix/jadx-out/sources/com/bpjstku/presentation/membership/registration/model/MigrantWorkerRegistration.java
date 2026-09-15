package com.bpjstku.presentation.membership.registration.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010'\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)J\r\u0010+\u001a\u00020*¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010\u0003\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020*HÖ\u0001¢\u0006\u0004\b1\u0010,J\u0010\u00102\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b2\u00103J\u001d\u00106\u001a\u0002052\u0006\u0010\u0003\u001a\u0002042\u0006\u0010\u0004\u001a\u00020*¢\u0006\u0004\b6\u00107R\u0016\u0010:\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u00109R\u0016\u0010;\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u00109R\u0016\u0010>\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u00109R\u0016\u0010=\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u00109R\u0016\u0010A\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u00109R\u0016\u0010C\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u00109R\u0016\u0010E\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u00109R\u0016\u0010?\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u00109R\u0016\u0010@\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u00109R\u0016\u0010I\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u00109R\u0016\u0010K\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u00109R\u0016\u0010M\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u00109R\u0016\u0010N\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u00109R\u0016\u0010O\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u00109R\u0016\u0010L\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u00109R\u0016\u0010D\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u00109R\u0016\u0010S\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u00109R\u0016\u0010T\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u00109R\u0016\u0010H\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u00109R\u0016\u00108\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u00109R\u0016\u0010P\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u00109R\u0016\u0010Q\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u00109R\u0016\u0010W\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u00109R\u0016\u0010R\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bX\u00109R\u0016\u0010Y\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u0016\u0010F\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u00109R\u0016\u0010G\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bZ\u00109R\u0016\u0010[\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u00109R\u0016\u0010J\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bY\u00109R\u0016\u0010\\\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b[\u00109R\u0016\u0010Z\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u00109R\u0016\u0010B\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u00109R\u0016\u0010V\u001a\u0004\u0018\u00010$8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bW\u0010]R\u0016\u0010U\u001a\u0004\u0018\u00010$8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010]R\u0014\u0010^\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u00109"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "p24", "p25", "p26", "p27", "p28", "p29", "p30", "p31", "p32", "Ljava/io/File;", "p33", "p34", "p35", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "write", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "g", "a", "asInterface", "isConnected", "d", "INotificationSideChannelStubProxy", "asBinder", "getExtras", "disconnect", "INotificationSideChannelDefault", "onTransact", "getRoot", "INotificationSideChannel", "getInterfaceDescriptor", "cancelAll", "cancel", "notify", "IconCompatParcelizer", "connect", "read", "INotificationSideChannelStub", "RemoteActionCompatParcelizer", "sendCustomAction", "getServiceComponent", "MediaBrowserCompat", "handleMessage", "getNotifyChildrenChangedOptions", FirebaseAnalytics.Event.SEARCH, "getItem", "getSessionToken", "Ljava/io/File;", "MediaBrowserCompatCallbackHandler"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MigrantWorkerRegistration implements Parcelable {
    public static final Parcelable.Creator<MigrantWorkerRegistration> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public final String getItem;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    public final String onTransact;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    public final String getExtras;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    public final String asBinder;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public final String getInterfaceDescriptor;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    public final File getServiceComponent;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public final String IconCompatParcelizer;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String getNotifyChildrenChangedOptions;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String asInterface;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final String cancel;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final String notify;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final File sendCustomAction;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public final String search;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    public final String INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String isConnected;

    /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
    public final String a;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: getExtras, reason: from kotlin metadata */
    public final String g;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    public final String cancelAll;

    /* JADX INFO: renamed from: getItem, reason: from kotlin metadata */
    public final String getSessionToken;

    /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from kotlin metadata */
    public final String getRoot;

    /* JADX INFO: renamed from: getRoot, reason: from kotlin metadata */
    public final String INotificationSideChannel;

    /* JADX INFO: renamed from: getServiceComponent, reason: from kotlin metadata */
    public final String MediaBrowserCompat;

    /* JADX INFO: renamed from: getSessionToken, reason: from kotlin metadata */
    public final String MediaBrowserCompatCallbackHandler;

    /* JADX INFO: renamed from: handleMessage, reason: from kotlin metadata */
    public final String read;

    /* JADX INFO: renamed from: isConnected, reason: from kotlin metadata */
    public final String d;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public final String INotificationSideChannelDefault;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final String write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public final String INotificationSideChannelStub;

    /* JADX INFO: renamed from: search, reason: from kotlin metadata */
    public final String disconnect;

    /* JADX INFO: renamed from: sendCustomAction, reason: from kotlin metadata */
    public final String connect;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentbindingInflater1;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public MigrantWorkerRegistration(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, File file, File file2, String str34) {
        Intrinsics.checkNotNullParameter(str34, "");
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str3;
        this.b = str4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str5;
        this.asInterface = str6;
        this.d = str7;
        this.asBinder = str8;
        this.g = str9;
        this.a = str10;
        this.onTransact = str11;
        this.INotificationSideChannel = str12;
        this.cancelAll = str13;
        this.cancel = str14;
        this.notify = str15;
        this.getInterfaceDescriptor = str16;
        this.INotificationSideChannelStubProxy = str17;
        this.INotificationSideChannelStub = str18;
        this.RemoteActionCompatParcelizer = str19;
        this.INotificationSideChannelDefault = str20;
        this.write = str21;
        this.IconCompatParcelizer = str22;
        this.connect = str23;
        this.MediaBrowserCompat = str24;
        this.read = str25;
        this.getNotifyChildrenChangedOptions = str26;
        this.getExtras = str27;
        this.disconnect = str28;
        this.getItem = str29;
        this.getRoot = str30;
        this.getSessionToken = str31;
        this.search = str32;
        this.isConnected = str33;
        this.getServiceComponent = file;
        this.sendCustomAction = file2;
        this.MediaBrowserCompatCallbackHandler = str34;
    }

    public /* synthetic */ MigrantWorkerRegistration(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, File file, File file2, String str34, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, (i & 4194304) != 0 ? "" : str23, (i & 8388608) != 0 ? "" : str24, (i & 16777216) != 0 ? "" : str25, (i & 33554432) != 0 ? "" : str26, (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? "" : str27, (i & 134217728) != 0 ? "" : str28, (i & 268435456) != 0 ? "" : str29, (i & 536870912) != 0 ? "" : str30, (i & BasicMeasure.EXACTLY) != 0 ? "" : str31, (i & Integer.MIN_VALUE) != 0 ? "" : str32, (i2 & 1) != 0 ? "" : str33, (i2 & 2) != 0 ? null : file, (i2 & 4) == 0 ? file2 : null, (i2 & 8) != 0 ? "" : str34);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Parcelable.Creator<MigrantWorkerRegistration> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MigrantWorkerRegistration createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MigrantWorkerRegistration(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (File) parcel.readSerializable(), (File) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MigrantWorkerRegistration[] newArray(int i) {
            return new MigrantWorkerRegistration[i];
        }
    }

    public static /* synthetic */ MigrantWorkerRegistration TuitionPaymentFragmentbindingInflater1(MigrantWorkerRegistration migrantWorkerRegistration, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, File file, File file2, String str34, int i, int i2) {
        String str35 = (i & 1) != 0 ? migrantWorkerRegistration.TuitionPaymentFragmentbindingInflater1 : str;
        String str36 = (i & 2) != 0 ? migrantWorkerRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : str2;
        String str37 = (i & 4) != 0 ? migrantWorkerRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : str3;
        String str38 = (i & 8) != 0 ? migrantWorkerRegistration.b : str4;
        String str39 = (i & 16) != 0 ? migrantWorkerRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : str5;
        String str40 = (i & 32) != 0 ? migrantWorkerRegistration.asInterface : str6;
        String str41 = (i & 64) != 0 ? migrantWorkerRegistration.d : str7;
        String str42 = (i & 128) != 0 ? migrantWorkerRegistration.asBinder : str8;
        String str43 = (i & 256) != 0 ? migrantWorkerRegistration.g : str9;
        String str44 = (i & 512) != 0 ? migrantWorkerRegistration.a : str10;
        String str45 = (i & 1024) != 0 ? migrantWorkerRegistration.onTransact : str11;
        String str46 = (i & 2048) != 0 ? migrantWorkerRegistration.INotificationSideChannel : str12;
        String str47 = (i & 4096) != 0 ? migrantWorkerRegistration.cancelAll : str13;
        String str48 = (i & 8192) != 0 ? migrantWorkerRegistration.cancel : str14;
        String str49 = (i & 16384) != 0 ? migrantWorkerRegistration.notify : str15;
        String str50 = (i & 32768) != 0 ? migrantWorkerRegistration.getInterfaceDescriptor : str16;
        String str51 = (i & 65536) != 0 ? migrantWorkerRegistration.INotificationSideChannelStubProxy : str17;
        String str52 = (i & 131072) != 0 ? migrantWorkerRegistration.INotificationSideChannelStub : str18;
        String str53 = (i & 262144) != 0 ? migrantWorkerRegistration.RemoteActionCompatParcelizer : str19;
        String str54 = (i & 524288) != 0 ? migrantWorkerRegistration.INotificationSideChannelDefault : str20;
        String str55 = (i & 1048576) != 0 ? migrantWorkerRegistration.write : str21;
        String str56 = (i & 2097152) != 0 ? migrantWorkerRegistration.IconCompatParcelizer : str22;
        String str57 = (i & 4194304) != 0 ? migrantWorkerRegistration.connect : str23;
        String str58 = (i & 8388608) != 0 ? migrantWorkerRegistration.MediaBrowserCompat : str24;
        String str59 = (i & 16777216) != 0 ? migrantWorkerRegistration.read : str25;
        String str60 = (i & 33554432) != 0 ? migrantWorkerRegistration.getNotifyChildrenChangedOptions : str26;
        String str61 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? migrantWorkerRegistration.getExtras : str27;
        String str62 = (i & 134217728) != 0 ? migrantWorkerRegistration.disconnect : str28;
        String str63 = (i & 268435456) != 0 ? migrantWorkerRegistration.getItem : str29;
        String str64 = (i & 536870912) != 0 ? migrantWorkerRegistration.getRoot : str30;
        String str65 = (i & BasicMeasure.EXACTLY) != 0 ? migrantWorkerRegistration.getSessionToken : str31;
        String str66 = (i & Integer.MIN_VALUE) != 0 ? migrantWorkerRegistration.search : str32;
        String str67 = (i2 & 1) != 0 ? migrantWorkerRegistration.isConnected : str33;
        File file3 = (i2 & 2) != 0 ? migrantWorkerRegistration.getServiceComponent : file;
        File file4 = (i2 & 4) != 0 ? migrantWorkerRegistration.sendCustomAction : file2;
        String str68 = (i2 & 8) != 0 ? migrantWorkerRegistration.MediaBrowserCompatCallbackHandler : str34;
        Intrinsics.checkNotNullParameter(str68, "");
        return new MigrantWorkerRegistration(str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57, str58, str59, str60, str61, str62, str63, str64, str65, str66, str67, file3, file4, str68);
    }

    public MigrantWorkerRegistration() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 15, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MigrantWorkerRegistration)) {
            return false;
        }
        MigrantWorkerRegistration migrantWorkerRegistration = (MigrantWorkerRegistration) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, migrantWorkerRegistration.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, migrantWorkerRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, migrantWorkerRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.b, migrantWorkerRegistration.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, migrantWorkerRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.asInterface, migrantWorkerRegistration.asInterface) && Intrinsics.areEqual(this.d, migrantWorkerRegistration.d) && Intrinsics.areEqual(this.asBinder, migrantWorkerRegistration.asBinder) && Intrinsics.areEqual(this.g, migrantWorkerRegistration.g) && Intrinsics.areEqual(this.a, migrantWorkerRegistration.a) && Intrinsics.areEqual(this.onTransact, migrantWorkerRegistration.onTransact) && Intrinsics.areEqual(this.INotificationSideChannel, migrantWorkerRegistration.INotificationSideChannel) && Intrinsics.areEqual(this.cancelAll, migrantWorkerRegistration.cancelAll) && Intrinsics.areEqual(this.cancel, migrantWorkerRegistration.cancel) && Intrinsics.areEqual(this.notify, migrantWorkerRegistration.notify) && Intrinsics.areEqual(this.getInterfaceDescriptor, migrantWorkerRegistration.getInterfaceDescriptor) && Intrinsics.areEqual(this.INotificationSideChannelStubProxy, migrantWorkerRegistration.INotificationSideChannelStubProxy) && Intrinsics.areEqual(this.INotificationSideChannelStub, migrantWorkerRegistration.INotificationSideChannelStub) && Intrinsics.areEqual(this.RemoteActionCompatParcelizer, migrantWorkerRegistration.RemoteActionCompatParcelizer) && Intrinsics.areEqual(this.INotificationSideChannelDefault, migrantWorkerRegistration.INotificationSideChannelDefault) && Intrinsics.areEqual(this.write, migrantWorkerRegistration.write) && Intrinsics.areEqual(this.IconCompatParcelizer, migrantWorkerRegistration.IconCompatParcelizer) && Intrinsics.areEqual(this.connect, migrantWorkerRegistration.connect) && Intrinsics.areEqual(this.MediaBrowserCompat, migrantWorkerRegistration.MediaBrowserCompat) && Intrinsics.areEqual(this.read, migrantWorkerRegistration.read) && Intrinsics.areEqual(this.getNotifyChildrenChangedOptions, migrantWorkerRegistration.getNotifyChildrenChangedOptions) && Intrinsics.areEqual(this.getExtras, migrantWorkerRegistration.getExtras) && Intrinsics.areEqual(this.disconnect, migrantWorkerRegistration.disconnect) && Intrinsics.areEqual(this.getItem, migrantWorkerRegistration.getItem) && Intrinsics.areEqual(this.getRoot, migrantWorkerRegistration.getRoot) && Intrinsics.areEqual(this.getSessionToken, migrantWorkerRegistration.getSessionToken) && Intrinsics.areEqual(this.search, migrantWorkerRegistration.search) && Intrinsics.areEqual(this.isConnected, migrantWorkerRegistration.isConnected) && Intrinsics.areEqual(this.getServiceComponent, migrantWorkerRegistration.getServiceComponent) && Intrinsics.areEqual(this.sendCustomAction, migrantWorkerRegistration.sendCustomAction) && Intrinsics.areEqual(this.MediaBrowserCompatCallbackHandler, migrantWorkerRegistration.MediaBrowserCompatCallbackHandler);
    }

    public final int hashCode() {
        String str = this.TuitionPaymentFragmentbindingInflater1;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.b;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.asInterface;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.d;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.asBinder;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.g;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.a;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.onTransact;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.INotificationSideChannel;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.cancelAll;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.cancel;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.notify;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.getInterfaceDescriptor;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.INotificationSideChannelStubProxy;
        int iHashCode17 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.INotificationSideChannelStub;
        int iHashCode18 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.RemoteActionCompatParcelizer;
        int iHashCode19 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.INotificationSideChannelDefault;
        int iHashCode20 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.write;
        int iHashCode21 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.IconCompatParcelizer;
        int iHashCode22 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.connect;
        int iHashCode23 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.MediaBrowserCompat;
        int iHashCode24 = str24 == null ? 0 : str24.hashCode();
        String str25 = this.read;
        int iHashCode25 = str25 == null ? 0 : str25.hashCode();
        String str26 = this.getNotifyChildrenChangedOptions;
        int iHashCode26 = str26 == null ? 0 : str26.hashCode();
        String str27 = this.getExtras;
        int iHashCode27 = str27 == null ? 0 : str27.hashCode();
        String str28 = this.disconnect;
        int iHashCode28 = str28 == null ? 0 : str28.hashCode();
        String str29 = this.getItem;
        int iHashCode29 = str29 == null ? 0 : str29.hashCode();
        String str30 = this.getRoot;
        int iHashCode30 = str30 == null ? 0 : str30.hashCode();
        String str31 = this.getSessionToken;
        int iHashCode31 = str31 == null ? 0 : str31.hashCode();
        String str32 = this.search;
        int iHashCode32 = str32 == null ? 0 : str32.hashCode();
        String str33 = this.isConnected;
        int iHashCode33 = str33 == null ? 0 : str33.hashCode();
        File file = this.getServiceComponent;
        int iHashCode34 = file == null ? 0 : file.hashCode();
        File file2 = this.sendCustomAction;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + (file2 != null ? file2.hashCode() : 0)) * 31) + this.MediaBrowserCompatCallbackHandler.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentbindingInflater1;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str4 = this.b;
        String str5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str6 = this.asInterface;
        String str7 = this.d;
        String str8 = this.asBinder;
        String str9 = this.g;
        String str10 = this.a;
        String str11 = this.onTransact;
        String str12 = this.INotificationSideChannel;
        String str13 = this.cancelAll;
        String str14 = this.cancel;
        String str15 = this.notify;
        String str16 = this.getInterfaceDescriptor;
        String str17 = this.INotificationSideChannelStubProxy;
        String str18 = this.INotificationSideChannelStub;
        String str19 = this.RemoteActionCompatParcelizer;
        String str20 = this.INotificationSideChannelDefault;
        String str21 = this.write;
        String str22 = this.IconCompatParcelizer;
        String str23 = this.connect;
        String str24 = this.MediaBrowserCompat;
        String str25 = this.read;
        String str26 = this.getNotifyChildrenChangedOptions;
        String str27 = this.getExtras;
        String str28 = this.disconnect;
        String str29 = this.getItem;
        String str30 = this.getRoot;
        String str31 = this.getSessionToken;
        String str32 = this.search;
        String str33 = this.isConnected;
        File file = this.getServiceComponent;
        File file2 = this.sendCustomAction;
        String str34 = this.MediaBrowserCompatCallbackHandler;
        StringBuilder sb = new StringBuilder("MigrantWorkerRegistration(TuitionPaymentFragmentbindingInflater1=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str3);
        sb.append(", b=");
        sb.append(str4);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str5);
        sb.append(", asInterface=");
        sb.append(str6);
        sb.append(", d=");
        sb.append(str7);
        sb.append(", asBinder=");
        sb.append(str8);
        sb.append(", g=");
        sb.append(str9);
        sb.append(", a=");
        sb.append(str10);
        sb.append(", onTransact=");
        sb.append(str11);
        sb.append(", INotificationSideChannel=");
        sb.append(str12);
        sb.append(", cancelAll=");
        sb.append(str13);
        sb.append(", cancel=");
        sb.append(str14);
        sb.append(", notify=");
        sb.append(str15);
        sb.append(", getInterfaceDescriptor=");
        sb.append(str16);
        sb.append(", INotificationSideChannelStubProxy=");
        sb.append(str17);
        sb.append(", INotificationSideChannelStub=");
        sb.append(str18);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str19);
        sb.append(", INotificationSideChannelDefault=");
        sb.append(str20);
        sb.append(", write=");
        sb.append(str21);
        sb.append(", IconCompatParcelizer=");
        sb.append(str22);
        sb.append(", connect=");
        sb.append(str23);
        sb.append(", MediaBrowserCompat=");
        sb.append(str24);
        sb.append(", read=");
        sb.append(str25);
        sb.append(", getNotifyChildrenChangedOptions=");
        sb.append(str26);
        sb.append(", getExtras=");
        sb.append(str27);
        sb.append(", disconnect=");
        sb.append(str28);
        sb.append(", getItem=");
        sb.append(str29);
        sb.append(", getRoot=");
        sb.append(str30);
        sb.append(", getSessionToken=");
        sb.append(str31);
        sb.append(", search=");
        sb.append(str32);
        sb.append(", isConnected=");
        sb.append(str33);
        sb.append(", getServiceComponent=");
        sb.append(file);
        sb.append(", sendCustomAction=");
        sb.append(file2);
        sb.append(", MediaBrowserCompatCallbackHandler=");
        sb.append(str34);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.b);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.asInterface);
        p0.writeString(this.d);
        p0.writeString(this.asBinder);
        p0.writeString(this.g);
        p0.writeString(this.a);
        p0.writeString(this.onTransact);
        p0.writeString(this.INotificationSideChannel);
        p0.writeString(this.cancelAll);
        p0.writeString(this.cancel);
        p0.writeString(this.notify);
        p0.writeString(this.getInterfaceDescriptor);
        p0.writeString(this.INotificationSideChannelStubProxy);
        p0.writeString(this.INotificationSideChannelStub);
        p0.writeString(this.RemoteActionCompatParcelizer);
        p0.writeString(this.INotificationSideChannelDefault);
        p0.writeString(this.write);
        p0.writeString(this.IconCompatParcelizer);
        p0.writeString(this.connect);
        p0.writeString(this.MediaBrowserCompat);
        p0.writeString(this.read);
        p0.writeString(this.getNotifyChildrenChangedOptions);
        p0.writeString(this.getExtras);
        p0.writeString(this.disconnect);
        p0.writeString(this.getItem);
        p0.writeString(this.getRoot);
        p0.writeString(this.getSessionToken);
        p0.writeString(this.search);
        p0.writeString(this.isConnected);
        p0.writeSerializable(this.getServiceComponent);
        p0.writeSerializable(this.sendCustomAction);
        p0.writeString(this.MediaBrowserCompatCallbackHandler);
    }
}
