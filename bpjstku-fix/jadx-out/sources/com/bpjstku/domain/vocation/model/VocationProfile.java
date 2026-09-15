package com.bpjstku.domain.vocation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001B¿\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020#2\b\u0010\u0003\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020-HÖ\u0001¢\u0006\u0004\b3\u0010/J\u0010\u00104\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b4\u00105J\u001d\u00108\u001a\u0002072\u0006\u0010\u0003\u001a\u0002062\u0006\u0010\u0004\u001a\u00020-¢\u0006\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010?\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010;R\u0014\u0010@\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010;R\u0014\u0010B\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010;R\u0014\u0010D\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010;R\u0014\u0010F\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010;R\u0014\u0010H\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010;R\u0014\u0010C\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010;R\u0014\u0010A\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010;R\u0014\u0010L\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010;R\u0014\u0010N\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010;R\u0014\u0010G\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010;R\u0014\u0010Q\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010;R\u0014\u0010S\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010;R\u0014\u0010T\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010;R\u0014\u0010V\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010;R\u0014\u0010W\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010;R\u0014\u0010M\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010;R\u0014\u0010R\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010;R\u0014\u0010X\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010;R\u0014\u0010Y\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010[\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bZ\u0010;R\u0014\u0010\\\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b[\u0010;R\u0014\u0010]\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010;R\u0014\u0010K\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b^\u0010;R\u0014\u0010_\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010;R\u0014\u0010`\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010;R\u0014\u0010P\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010;R\u0014\u0010a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010;R\u0014\u0010J\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\ba\u0010;R\u0014\u0010>\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bX\u0010;R\u0014\u0010Z\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bY\u0010bR\u0014\u0010:\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b`\u0010bR\u0014\u0010O\u001a\u00020#8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bW\u0010bR\u0014\u0010E\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010;R\u0014\u0010^\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u0010;R\u0014\u0010I\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b_\u0010;R\u0014\u0010c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010;"}, d2 = {"Lcom/bpjstku/domain/vocation/model/VocationProfile;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "p24", "p25", "p26", "p27", "p28", "p29", "p30", "p31", "", "p32", "p33", "p34", "p35", "p36", "p37", "p38", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "getServiceComponent", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", FirebaseAnalytics.Event.SEARCH, "TuitionPaymentFragmentbindingInflater1", "b", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "asBinder", "d", "unsubscribe", "asInterface", "cancelAll", "a", "handleMessage", "isConnected", "disconnect", "INotificationSideChannel", "INotificationSideChannelStub", "notify", "getSessionToken", "getItem", "cancel", "INotificationSideChannelDefault", "onTransact", "RemoteActionCompatParcelizer", "MediaBrowserCompatCallbackHandler", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "read", "MediaBrowserCompat", "sendCustomAction", "connect", "IconCompatParcelizer", "write", "setCallbacksMessenger", "getNotifyChildrenChangedOptions", "getExtras", "getRoot", "Z", "subscribe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class VocationProfile implements Parcelable {
    public static final Parcelable.Creator<VocationProfile> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public final String getInterfaceDescriptor;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    public final String onTransact;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    public final String notify;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    public final String getNotifyChildrenChangedOptions;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String setCallbacksMessenger;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    private final boolean sendCustomAction;

    /* JADX INFO: renamed from: MediaBrowserCompatCallbackHandler, reason: from kotlin metadata */
    private final String INotificationSideChannelStubProxy;
    public final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String read;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String MediaBrowserCompat;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String getExtras;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String INotificationSideChannelDefault;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final String d;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final String getRoot;
    public final String b;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public final String getItem;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public final String a;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    public final String IconCompatParcelizer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String subscribe;

    /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
    private final String INotificationSideChannel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: getExtras, reason: from kotlin metadata */
    private final boolean getServiceComponent;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    public final boolean getSessionToken;

    /* JADX INFO: renamed from: getItem, reason: from kotlin metadata */
    private final String cancel;

    /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from kotlin metadata */
    private final String handleMessage;

    /* JADX INFO: renamed from: getRoot, reason: from kotlin metadata */
    private final String isConnected;

    /* JADX INFO: renamed from: getServiceComponent, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: getSessionToken, reason: from kotlin metadata */
    private final String cancelAll;

    /* JADX INFO: renamed from: handleMessage, reason: from kotlin metadata */
    private final String asBinder;

    /* JADX INFO: renamed from: isConnected, reason: from kotlin metadata */
    private final String g;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public final String write;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final String INotificationSideChannelStub;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public final String search;

    /* JADX INFO: renamed from: search, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: sendCustomAction, reason: from kotlin metadata */
    private final String connect;

    /* JADX INFO: renamed from: setCallbacksMessenger, reason: from kotlin metadata */
    private final String disconnect;

    /* JADX INFO: renamed from: unsubscribe, reason: from kotlin metadata */
    private final String asInterface;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public final String unsubscribe;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VocationProfile(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, boolean z, boolean z2, boolean z3, String str33, String str34, String str35, String str36) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
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
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
        this.TuitionPaymentFragmentbindingInflater1 = str3;
        this.b = str4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str5;
        this.d = str6;
        this.asInterface = str7;
        this.a = str8;
        this.asBinder = str9;
        this.g = str10;
        this.INotificationSideChannel = str11;
        this.notify = str12;
        this.cancelAll = str13;
        this.cancel = str14;
        this.onTransact = str15;
        this.RemoteActionCompatParcelizer = str16;
        this.INotificationSideChannelStubProxy = str17;
        this.getInterfaceDescriptor = str18;
        this.INotificationSideChannelStub = str19;
        this.INotificationSideChannelDefault = str20;
        this.read = str21;
        this.MediaBrowserCompat = str22;
        this.connect = str23;
        this.IconCompatParcelizer = str24;
        this.write = str25;
        this.disconnect = str26;
        this.getNotifyChildrenChangedOptions = str27;
        this.getExtras = str28;
        this.getItem = str29;
        this.getRoot = str30;
        this.isConnected = str31;
        this.search = str32;
        this.sendCustomAction = z;
        this.getServiceComponent = z2;
        this.getSessionToken = z3;
        this.unsubscribe = str33;
        this.setCallbacksMessenger = str34;
        this.handleMessage = str35;
        this.subscribe = str36;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VocationProfile)) {
            return false;
        }
        VocationProfile vocationProfile = (VocationProfile) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, vocationProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, vocationProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, vocationProfile.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, vocationProfile.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, vocationProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.d, vocationProfile.d) && Intrinsics.areEqual(this.asInterface, vocationProfile.asInterface) && Intrinsics.areEqual(this.a, vocationProfile.a) && Intrinsics.areEqual(this.asBinder, vocationProfile.asBinder) && Intrinsics.areEqual(this.g, vocationProfile.g) && Intrinsics.areEqual(this.INotificationSideChannel, vocationProfile.INotificationSideChannel) && Intrinsics.areEqual(this.notify, vocationProfile.notify) && Intrinsics.areEqual(this.cancelAll, vocationProfile.cancelAll) && Intrinsics.areEqual(this.cancel, vocationProfile.cancel) && Intrinsics.areEqual(this.onTransact, vocationProfile.onTransact) && Intrinsics.areEqual(this.RemoteActionCompatParcelizer, vocationProfile.RemoteActionCompatParcelizer) && Intrinsics.areEqual(this.INotificationSideChannelStubProxy, vocationProfile.INotificationSideChannelStubProxy) && Intrinsics.areEqual(this.getInterfaceDescriptor, vocationProfile.getInterfaceDescriptor) && Intrinsics.areEqual(this.INotificationSideChannelStub, vocationProfile.INotificationSideChannelStub) && Intrinsics.areEqual(this.INotificationSideChannelDefault, vocationProfile.INotificationSideChannelDefault) && Intrinsics.areEqual(this.read, vocationProfile.read) && Intrinsics.areEqual(this.MediaBrowserCompat, vocationProfile.MediaBrowserCompat) && Intrinsics.areEqual(this.connect, vocationProfile.connect) && Intrinsics.areEqual(this.IconCompatParcelizer, vocationProfile.IconCompatParcelizer) && Intrinsics.areEqual(this.write, vocationProfile.write) && Intrinsics.areEqual(this.disconnect, vocationProfile.disconnect) && Intrinsics.areEqual(this.getNotifyChildrenChangedOptions, vocationProfile.getNotifyChildrenChangedOptions) && Intrinsics.areEqual(this.getExtras, vocationProfile.getExtras) && Intrinsics.areEqual(this.getItem, vocationProfile.getItem) && Intrinsics.areEqual(this.getRoot, vocationProfile.getRoot) && Intrinsics.areEqual(this.isConnected, vocationProfile.isConnected) && Intrinsics.areEqual(this.search, vocationProfile.search) && this.sendCustomAction == vocationProfile.sendCustomAction && this.getServiceComponent == vocationProfile.getServiceComponent && this.getSessionToken == vocationProfile.getSessionToken && Intrinsics.areEqual(this.unsubscribe, vocationProfile.unsubscribe) && Intrinsics.areEqual(this.setCallbacksMessenger, vocationProfile.setCallbacksMessenger) && Intrinsics.areEqual(this.handleMessage, vocationProfile.handleMessage) && Intrinsics.areEqual(this.subscribe, vocationProfile.subscribe);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.b.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode()) * 31) + this.d.hashCode()) * 31) + this.asInterface.hashCode()) * 31) + this.a.hashCode()) * 31) + this.asBinder.hashCode()) * 31) + this.g.hashCode()) * 31) + this.INotificationSideChannel.hashCode()) * 31) + this.notify.hashCode()) * 31) + this.cancelAll.hashCode()) * 31) + this.cancel.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.INotificationSideChannelStubProxy.hashCode()) * 31) + this.getInterfaceDescriptor.hashCode()) * 31) + this.INotificationSideChannelStub.hashCode()) * 31) + this.INotificationSideChannelDefault.hashCode()) * 31) + this.read.hashCode()) * 31) + this.MediaBrowserCompat.hashCode()) * 31) + this.connect.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.write.hashCode()) * 31) + this.disconnect.hashCode()) * 31) + this.getNotifyChildrenChangedOptions.hashCode()) * 31) + this.getExtras.hashCode()) * 31) + this.getItem.hashCode()) * 31) + this.getRoot.hashCode()) * 31) + this.isConnected.hashCode()) * 31) + this.search.hashCode()) * 31) + Boolean.hashCode(this.sendCustomAction)) * 31) + Boolean.hashCode(this.getServiceComponent)) * 31) + Boolean.hashCode(this.getSessionToken)) * 31) + this.unsubscribe.hashCode()) * 31) + this.setCallbacksMessenger.hashCode()) * 31) + this.handleMessage.hashCode()) * 31) + this.subscribe.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        String str4 = this.b;
        String str5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str6 = this.d;
        String str7 = this.asInterface;
        String str8 = this.a;
        String str9 = this.asBinder;
        String str10 = this.g;
        String str11 = this.INotificationSideChannel;
        String str12 = this.notify;
        String str13 = this.cancelAll;
        String str14 = this.cancel;
        String str15 = this.onTransact;
        String str16 = this.RemoteActionCompatParcelizer;
        String str17 = this.INotificationSideChannelStubProxy;
        String str18 = this.getInterfaceDescriptor;
        String str19 = this.INotificationSideChannelStub;
        String str20 = this.INotificationSideChannelDefault;
        String str21 = this.read;
        String str22 = this.MediaBrowserCompat;
        String str23 = this.connect;
        String str24 = this.IconCompatParcelizer;
        String str25 = this.write;
        String str26 = this.disconnect;
        String str27 = this.getNotifyChildrenChangedOptions;
        String str28 = this.getExtras;
        String str29 = this.getItem;
        String str30 = this.getRoot;
        String str31 = this.isConnected;
        String str32 = this.search;
        boolean z = this.sendCustomAction;
        boolean z2 = this.getServiceComponent;
        boolean z3 = this.getSessionToken;
        String str33 = this.unsubscribe;
        String str34 = this.setCallbacksMessenger;
        String str35 = this.handleMessage;
        String str36 = this.subscribe;
        StringBuilder sb = new StringBuilder("VocationProfile(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str3);
        sb.append(", b=");
        sb.append(str4);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str5);
        sb.append(", d=");
        sb.append(str6);
        sb.append(", asInterface=");
        sb.append(str7);
        sb.append(", a=");
        sb.append(str8);
        sb.append(", asBinder=");
        sb.append(str9);
        sb.append(", g=");
        sb.append(str10);
        sb.append(", INotificationSideChannel=");
        sb.append(str11);
        sb.append(", notify=");
        sb.append(str12);
        sb.append(", cancelAll=");
        sb.append(str13);
        sb.append(", cancel=");
        sb.append(str14);
        sb.append(", onTransact=");
        sb.append(str15);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str16);
        sb.append(", INotificationSideChannelStubProxy=");
        sb.append(str17);
        sb.append(", getInterfaceDescriptor=");
        sb.append(str18);
        sb.append(", INotificationSideChannelStub=");
        sb.append(str19);
        sb.append(", INotificationSideChannelDefault=");
        sb.append(str20);
        sb.append(", read=");
        sb.append(str21);
        sb.append(", MediaBrowserCompat=");
        sb.append(str22);
        sb.append(", connect=");
        sb.append(str23);
        sb.append(", IconCompatParcelizer=");
        sb.append(str24);
        sb.append(", write=");
        sb.append(str25);
        sb.append(", disconnect=");
        sb.append(str26);
        sb.append(", getNotifyChildrenChangedOptions=");
        sb.append(str27);
        sb.append(", getExtras=");
        sb.append(str28);
        sb.append(", getItem=");
        sb.append(str29);
        sb.append(", getRoot=");
        sb.append(str30);
        sb.append(", isConnected=");
        sb.append(str31);
        sb.append(", search=");
        sb.append(str32);
        sb.append(", sendCustomAction=");
        sb.append(z);
        sb.append(", getServiceComponent=");
        sb.append(z2);
        sb.append(", getSessionToken=");
        sb.append(z3);
        sb.append(", unsubscribe=");
        sb.append(str33);
        sb.append(", setCallbacksMessenger=");
        sb.append(str34);
        sb.append(", handleMessage=");
        sb.append(str35);
        sb.append(", subscribe=");
        sb.append(str36);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.b);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.d);
        p0.writeString(this.asInterface);
        p0.writeString(this.a);
        p0.writeString(this.asBinder);
        p0.writeString(this.g);
        p0.writeString(this.INotificationSideChannel);
        p0.writeString(this.notify);
        p0.writeString(this.cancelAll);
        p0.writeString(this.cancel);
        p0.writeString(this.onTransact);
        p0.writeString(this.RemoteActionCompatParcelizer);
        p0.writeString(this.INotificationSideChannelStubProxy);
        p0.writeString(this.getInterfaceDescriptor);
        p0.writeString(this.INotificationSideChannelStub);
        p0.writeString(this.INotificationSideChannelDefault);
        p0.writeString(this.read);
        p0.writeString(this.MediaBrowserCompat);
        p0.writeString(this.connect);
        p0.writeString(this.IconCompatParcelizer);
        p0.writeString(this.write);
        p0.writeString(this.disconnect);
        p0.writeString(this.getNotifyChildrenChangedOptions);
        p0.writeString(this.getExtras);
        p0.writeString(this.getItem);
        p0.writeString(this.getRoot);
        p0.writeString(this.isConnected);
        p0.writeString(this.search);
        p0.writeInt(this.sendCustomAction ? 1 : 0);
        p0.writeInt(this.getServiceComponent ? 1 : 0);
        p0.writeInt(this.getSessionToken ? 1 : 0);
        p0.writeString(this.unsubscribe);
        p0.writeString(this.setCallbacksMessenger);
        p0.writeString(this.handleMessage);
        p0.writeString(this.subscribe);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Parcelable.Creator<VocationProfile> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VocationProfile createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VocationProfile(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VocationProfile[] newArray(int i) {
            return new VocationProfile[i];
        }
    }
}
