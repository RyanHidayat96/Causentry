package com.bpjstku.presentation.tuition.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001B»\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\"\u0012\b\u0010'\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\"\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\"\u0012\b\u0010,\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\"\u0012\b\u0010.\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\"\u0012\b\u00100\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u001b¢\u0006\u0004\b5\u00106J\u001a\u00108\u001a\u00020\"2\b\u0010\u0003\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b:\u00106J\u0010\u0010;\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b;\u0010<J\u001d\u0010?\u001a\u00020>2\u0006\u0010\u0003\u001a\u00020=2\u0006\u0010\u0004\u001a\u00020\u001b¢\u0006\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bD\u0010BR\u0016\u0010G\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bF\u0010BR\u0018\u0010I\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bH\u0010BR\u0018\u0010K\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bJ\u0010BR\u0018\u0010M\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bL\u0010BR\u0018\u0010O\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bN\u0010BR\u0018\u0010P\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bC\u0010BR\u0018\u0010R\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bQ\u0010BR\u0018\u0010T\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bS\u0010BR\u0018\u0010U\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bE\u0010BR\u0018\u0010W\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bV\u0010BR\u0018\u0010X\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bU\u0010BR\u0018\u0010Y\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bP\u0010BR\u0018\u0010Z\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bK\u0010BR\u0018\u0010\\\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b[\u0010BR\u0018\u0010^\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b]\u0010BR\u0016\u0010_\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bY\u0010BR\u0018\u0010`\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bX\u0010BR\u0018\u0010b\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bZ\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bW\u0010aR\u0018\u0010d\u001a\u0004\u0018\u00010\u00168\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bO\u0010aR\u0018\u0010e\u001a\u0004\u0018\u00010\u00168\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bT\u0010aR\u0016\u0010g\u001a\u00020\u001b8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bG\u0010fR\u0018\u0010h\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bI\u0010BR\u0018\u0010N\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bi\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bj\u0010BR\u0018\u0010l\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bk\u0010BR\u0018\u0010]\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bm\u0010BR\u0018\u0010o\u001a\u0004\u0018\u00010\"8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bg\u0010nR\u0018\u0010S\u001a\u0004\u0018\u00010$8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bb\u0010pR\u0018\u0010Q\u001a\u0004\u0018\u00010\"8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bd\u0010nR\u0018\u0010H\u001a\u0004\u0018\u00010$8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\\\u0010pR\u0018\u0010J\u001a\u0004\u0018\u00010\"8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bl\u0010nR\u0018\u0010A\u001a\u0004\u0018\u00010)8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b^\u0010qR\u0018\u0010V\u001a\u0004\u0018\u00010\"8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bo\u0010nR\u0018\u0010[\u001a\u0004\u0018\u00010)8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\be\u0010qR\u0018\u0010L\u001a\u0004\u0018\u00010\"8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bc\u0010nR\u0018\u0010F\u001a\u0004\u0018\u00010)8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b_\u0010qR\u0018\u0010m\u001a\u0004\u0018\u00010\"8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bh\u0010nR\u0018\u0010r\u001a\u0004\u0018\u00010)8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b`\u0010qR\u0018\u0010i\u001a\u0004\u0018\u00010\"8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bM\u0010nR\u0018\u0010j\u001a\u0004\u0018\u00010\"8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bR\u0010n"}, d2 = {"Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "", "p19", "p20", "p21", "p22", "", "p23", "p24", "p25", "p26", "p27", "p28", "", "p29", "Lcom/bpjstku/presentation/tuition/model/LinkedAccountDirectDebit;", "p30", "p31", "p32", "p33", "Lcom/bpjstku/presentation/tuition/model/LinkedAccountEwallet;", "p34", "p35", "p36", "p37", "p38", "p39", "p40", "p41", "p42", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/bpjstku/presentation/tuition/model/LinkedAccountDirectDebit;Ljava/lang/Boolean;Lcom/bpjstku/presentation/tuition/model/LinkedAccountDirectDebit;Ljava/lang/Boolean;Lcom/bpjstku/presentation/tuition/model/LinkedAccountEwallet;Ljava/lang/Boolean;Lcom/bpjstku/presentation/tuition/model/LinkedAccountEwallet;Ljava/lang/Boolean;Lcom/bpjstku/presentation/tuition/model/LinkedAccountEwallet;Ljava/lang/Boolean;Lcom/bpjstku/presentation/tuition/model/LinkedAccountEwallet;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "getServiceComponent", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "disconnect", "b", "unsubscribe", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "getSessionToken", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "isConnected", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "subscribe", "asBinder", "getRoot", "asInterface", "a", "sendCustomAction", "d", FirebaseAnalytics.Event.SEARCH, "g", "INotificationSideChannel", "setCallbacksMessenger", "cancelAll", "notify", "cancel", "onTransact", "MediaBrowserCompatCallbackHandler", "INotificationSideChannelStub", "getItem", "INotificationSideChannelStubProxy", "RemoteActionCompatParcelizer", "getInterfaceDescriptor", "Ljava/lang/Double;", "INotificationSideChannelDefault", "read", "MediaBrowserCompat", "connect", "I", "IconCompatParcelizer", "write", "setInternalConnectionCallback", "onConnectionSuspended", "MediaBrowserCompatConnectionCallback", "getNotifyChildrenChangedOptions", "handleMessage", "Ljava/lang/Boolean;", "getExtras", "Lcom/bpjstku/presentation/tuition/model/LinkedAccountDirectDebit;", "Lcom/bpjstku/presentation/tuition/model/LinkedAccountEwallet;", "onConnectionFailed"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CustomerObject implements Parcelable {
    public static final Parcelable.Creator<CustomerObject> CREATOR = new TuitionPaymentFragmentbindingInflater1();

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public String notify;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    public LinkedAccountDirectDebit search;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    public LinkedAccountDirectDebit getSessionToken;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    public LinkedAccountEwallet getServiceComponent;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public Boolean getExtras;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    public Boolean sendCustomAction;

    /* JADX INFO: renamed from: MediaBrowserCompatCallbackHandler, reason: from kotlin metadata */
    public String INotificationSideChannelStub;

    /* JADX INFO: renamed from: MediaBrowserCompatConnectionCallback, reason: from kotlin metadata */
    public String getNotifyChildrenChangedOptions;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public LinkedAccountEwallet unsubscribe;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public String a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public String onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public String write;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public int IconCompatParcelizer;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public String cancel;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public Boolean setInternalConnectionCallback;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public Double MediaBrowserCompat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public String INotificationSideChannel;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public Double read;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    public LinkedAccountEwallet MediaBrowserCompatCallbackHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public Boolean onConnectionSuspended;

    /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
    public String b;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public Double connect;

    /* JADX INFO: renamed from: getExtras, reason: from kotlin metadata */
    public Boolean setCallbacksMessenger;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    public LinkedAccountEwallet onConnectionFailed;

    /* JADX INFO: renamed from: getItem, reason: from kotlin metadata */
    public String INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from kotlin metadata */
    public Boolean isConnected;

    /* JADX INFO: renamed from: getRoot, reason: from kotlin metadata */
    public String asInterface;

    /* JADX INFO: renamed from: getServiceComponent, reason: from kotlin metadata */
    public String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: getSessionToken, reason: from kotlin metadata */
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: handleMessage, reason: from kotlin metadata */
    public String getItem;

    /* JADX INFO: renamed from: isConnected, reason: from kotlin metadata */
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public String getInterfaceDescriptor;

    /* JADX INFO: renamed from: onConnectionSuspended, reason: from kotlin metadata */
    public String disconnect;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public Double INotificationSideChannelDefault;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public Boolean subscribe;

    /* JADX INFO: renamed from: search, reason: from kotlin metadata */
    public String g;

    /* JADX INFO: renamed from: sendCustomAction, reason: from kotlin metadata */
    public String d;

    /* JADX INFO: renamed from: setCallbacksMessenger, reason: from kotlin metadata */
    public String cancelAll;

    /* JADX INFO: renamed from: setInternalConnectionCallback, reason: from kotlin metadata */
    public String getRoot;

    /* JADX INFO: renamed from: subscribe, reason: from kotlin metadata */
    public String asBinder;

    /* JADX INFO: renamed from: unsubscribe, reason: from kotlin metadata */
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public Boolean handleMessage;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CustomerObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Double d, Double d2, Double d3, Double d4, int i, String str20, String str21, String str22, String str23, String str24, Boolean bool, LinkedAccountDirectDebit linkedAccountDirectDebit, Boolean bool2, LinkedAccountDirectDebit linkedAccountDirectDebit2, Boolean bool3, LinkedAccountEwallet linkedAccountEwallet, Boolean bool4, LinkedAccountEwallet linkedAccountEwallet2, Boolean bool5, LinkedAccountEwallet linkedAccountEwallet3, Boolean bool6, LinkedAccountEwallet linkedAccountEwallet4, Boolean bool7, Boolean bool8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str18, "");
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.b = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str5;
        this.asBinder = str6;
        this.asInterface = str7;
        this.a = str8;
        this.d = str9;
        this.g = str10;
        this.INotificationSideChannel = str11;
        this.cancelAll = str12;
        this.notify = str13;
        this.cancel = str14;
        this.onTransact = str15;
        this.INotificationSideChannelStub = str16;
        this.INotificationSideChannelStubProxy = str17;
        this.RemoteActionCompatParcelizer = str18;
        this.getInterfaceDescriptor = str19;
        this.INotificationSideChannelDefault = d;
        this.read = d2;
        this.MediaBrowserCompat = d3;
        this.connect = d4;
        this.IconCompatParcelizer = i;
        this.write = str20;
        this.getRoot = str21;
        this.disconnect = str22;
        this.getNotifyChildrenChangedOptions = str23;
        this.getItem = str24;
        this.getExtras = bool;
        this.search = linkedAccountDirectDebit;
        this.sendCustomAction = bool2;
        this.getSessionToken = linkedAccountDirectDebit2;
        this.isConnected = bool3;
        this.getServiceComponent = linkedAccountEwallet;
        this.setCallbacksMessenger = bool4;
        this.MediaBrowserCompatCallbackHandler = linkedAccountEwallet2;
        this.subscribe = bool5;
        this.unsubscribe = linkedAccountEwallet3;
        this.handleMessage = bool6;
        this.onConnectionFailed = linkedAccountEwallet4;
        this.setInternalConnectionCallback = bool7;
        this.onConnectionSuspended = bool8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CustomerObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Double d, Double d2, Double d3, Double d4, int i, String str20, String str21, String str22, String str23, String str24, Boolean bool, LinkedAccountDirectDebit linkedAccountDirectDebit, Boolean bool2, LinkedAccountDirectDebit linkedAccountDirectDebit2, Boolean bool3, LinkedAccountEwallet linkedAccountEwallet, Boolean bool4, LinkedAccountEwallet linkedAccountEwallet2, Boolean bool5, LinkedAccountEwallet linkedAccountEwallet3, Boolean bool6, LinkedAccountEwallet linkedAccountEwallet4, Boolean bool7, Boolean bool8, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        Boolean bool9 = Boolean.FALSE;
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, d, d2, d3, d4, i, str20, str21, str22, str23, str24, (i2 & 536870912) != 0 ? bool9 : bool, linkedAccountDirectDebit, (i2 & Integer.MIN_VALUE) != 0 ? bool9 : bool2, linkedAccountDirectDebit2, (i3 & 2) != 0 ? bool9 : bool3, linkedAccountEwallet, (i3 & 8) != 0 ? bool9 : bool4, linkedAccountEwallet2, (i3 & 32) != 0 ? bool9 : bool5, linkedAccountEwallet3, (i3 & 128) != 0 ? bool9 : bool6, linkedAccountEwallet4, (i3 & 512) != 0 ? bool9 : bool7, (i3 & 1024) == 0 ? bool8 : bool9);
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements Parcelable.Creator<CustomerObject> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CustomerObject createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            Boolean boolValueOf7;
            Boolean boolValueOf8;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
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
            String string19 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            int i = parcel.readInt();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            LinkedAccountDirectDebit linkedAccountDirectDebitCreateFromParcel = parcel.readInt() == 0 ? null : LinkedAccountDirectDebit.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            LinkedAccountDirectDebit linkedAccountDirectDebitCreateFromParcel2 = parcel.readInt() == 0 ? null : LinkedAccountDirectDebit.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            LinkedAccountEwallet linkedAccountEwalletCreateFromParcel = parcel.readInt() == 0 ? null : LinkedAccountEwallet.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            LinkedAccountEwallet linkedAccountEwalletCreateFromParcel2 = parcel.readInt() == 0 ? null : LinkedAccountEwallet.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            LinkedAccountEwallet linkedAccountEwalletCreateFromParcel3 = parcel.readInt() == 0 ? null : LinkedAccountEwallet.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            LinkedAccountEwallet linkedAccountEwalletCreateFromParcel4 = parcel.readInt() == 0 ? null : LinkedAccountEwallet.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf7 = null;
            } else {
                boolValueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf8 = null;
            } else {
                boolValueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CustomerObject(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, dValueOf, dValueOf2, dValueOf3, dValueOf4, i, string20, string21, string22, string23, string24, boolValueOf, linkedAccountDirectDebitCreateFromParcel, boolValueOf2, linkedAccountDirectDebitCreateFromParcel2, boolValueOf3, linkedAccountEwalletCreateFromParcel, boolValueOf4, linkedAccountEwalletCreateFromParcel2, boolValueOf5, linkedAccountEwalletCreateFromParcel3, boolValueOf6, linkedAccountEwalletCreateFromParcel4, boolValueOf7, boolValueOf8);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CustomerObject[] newArray(int i) {
            return new CustomerObject[i];
        }
    }

    public static /* synthetic */ CustomerObject TuitionPaymentFragmentspecialinlinedviewModeldefault2(CustomerObject customerObject, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Double d, Double d2, Double d3, Double d4, int i, String str20, String str21, String str22, String str23, String str24, Boolean bool, LinkedAccountDirectDebit linkedAccountDirectDebit, Boolean bool2, LinkedAccountDirectDebit linkedAccountDirectDebit2, Boolean bool3, LinkedAccountEwallet linkedAccountEwallet, Boolean bool4, LinkedAccountEwallet linkedAccountEwallet2, Boolean bool5, LinkedAccountEwallet linkedAccountEwallet3, Boolean bool6, LinkedAccountEwallet linkedAccountEwallet4, Boolean bool7, Boolean bool8, int i2, int i3) {
        String str25 = (i2 & 1) != 0 ? customerObject.TuitionPaymentFragmentbindingInflater1 : str;
        String str26 = (i2 & 2) != 0 ? customerObject.b : str2;
        String str27 = (i2 & 4) != 0 ? customerObject.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : str3;
        String str28 = (i2 & 8) != 0 ? customerObject.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : str4;
        String str29 = (i2 & 16) != 0 ? customerObject.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : str5;
        String str30 = (i2 & 32) != 0 ? customerObject.asBinder : str6;
        String str31 = (i2 & 64) != 0 ? customerObject.asInterface : str7;
        String str32 = (i2 & 128) != 0 ? customerObject.a : str8;
        String str33 = (i2 & 256) != 0 ? customerObject.d : str9;
        String str34 = (i2 & 512) != 0 ? customerObject.g : str10;
        String str35 = (i2 & 1024) != 0 ? customerObject.INotificationSideChannel : str11;
        String str36 = (i2 & 2048) != 0 ? customerObject.cancelAll : str12;
        String str37 = (i2 & 4096) != 0 ? customerObject.notify : str13;
        String str38 = (i2 & 8192) != 0 ? customerObject.cancel : str14;
        String str39 = (i2 & 16384) != 0 ? customerObject.onTransact : str15;
        String str40 = (i2 & 32768) != 0 ? customerObject.INotificationSideChannelStub : str16;
        String str41 = (i2 & 65536) != 0 ? customerObject.INotificationSideChannelStubProxy : str17;
        String str42 = (i2 & 131072) != 0 ? customerObject.RemoteActionCompatParcelizer : str18;
        String str43 = str36;
        String str44 = (i2 & 262144) != 0 ? customerObject.getInterfaceDescriptor : str19;
        Double d5 = (i2 & 524288) != 0 ? customerObject.INotificationSideChannelDefault : d;
        Double d6 = (i2 & 1048576) != 0 ? customerObject.read : d2;
        Double d7 = (i2 & 2097152) != 0 ? customerObject.MediaBrowserCompat : d3;
        Double d8 = (i2 & 4194304) != 0 ? customerObject.connect : d4;
        int i4 = (i2 & 8388608) != 0 ? customerObject.IconCompatParcelizer : i;
        String str45 = (i2 & 16777216) != 0 ? customerObject.write : str20;
        String str46 = (i2 & 33554432) != 0 ? customerObject.getRoot : str21;
        String str47 = (i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? customerObject.disconnect : str22;
        String str48 = (i2 & 134217728) != 0 ? customerObject.getNotifyChildrenChangedOptions : str23;
        String str49 = (i2 & 268435456) != 0 ? customerObject.getItem : str24;
        Boolean bool9 = (i2 & 536870912) != 0 ? customerObject.getExtras : bool;
        LinkedAccountDirectDebit linkedAccountDirectDebit3 = (i2 & BasicMeasure.EXACTLY) != 0 ? customerObject.search : linkedAccountDirectDebit;
        Boolean bool10 = (i2 & Integer.MIN_VALUE) != 0 ? customerObject.sendCustomAction : bool2;
        LinkedAccountDirectDebit linkedAccountDirectDebit4 = (i3 & 1) != 0 ? customerObject.getSessionToken : linkedAccountDirectDebit2;
        Boolean bool11 = (i3 & 2) != 0 ? customerObject.isConnected : bool3;
        LinkedAccountEwallet linkedAccountEwallet5 = (i3 & 4) != 0 ? customerObject.getServiceComponent : linkedAccountEwallet;
        Boolean bool12 = (i3 & 8) != 0 ? customerObject.setCallbacksMessenger : bool4;
        LinkedAccountEwallet linkedAccountEwallet6 = (i3 & 16) != 0 ? customerObject.MediaBrowserCompatCallbackHandler : linkedAccountEwallet2;
        Boolean bool13 = (i3 & 32) != 0 ? customerObject.subscribe : bool5;
        LinkedAccountEwallet linkedAccountEwallet7 = (i3 & 64) != 0 ? customerObject.unsubscribe : linkedAccountEwallet3;
        Boolean bool14 = (i3 & 128) != 0 ? customerObject.handleMessage : bool6;
        LinkedAccountEwallet linkedAccountEwallet8 = (i3 & 256) != 0 ? customerObject.onConnectionFailed : linkedAccountEwallet4;
        Boolean bool15 = (i3 & 512) != 0 ? customerObject.setInternalConnectionCallback : bool7;
        Boolean bool16 = (i3 & 1024) != 0 ? customerObject.onConnectionSuspended : bool8;
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str42, "");
        return new CustomerObject(str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str43, str37, str38, str39, str40, str41, str42, str44, d5, d6, d7, d8, i4, str45, str46, str47, str48, str49, bool9, linkedAccountDirectDebit3, bool10, linkedAccountDirectDebit4, bool11, linkedAccountEwallet5, bool12, linkedAccountEwallet6, bool13, linkedAccountEwallet7, bool14, linkedAccountEwallet8, bool15, bool16);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CustomerObject)) {
            return false;
        }
        CustomerObject customerObject = (CustomerObject) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, customerObject.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, customerObject.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, customerObject.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, customerObject.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, customerObject.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.asBinder, customerObject.asBinder) && Intrinsics.areEqual(this.asInterface, customerObject.asInterface) && Intrinsics.areEqual(this.a, customerObject.a) && Intrinsics.areEqual(this.d, customerObject.d) && Intrinsics.areEqual(this.g, customerObject.g) && Intrinsics.areEqual(this.INotificationSideChannel, customerObject.INotificationSideChannel) && Intrinsics.areEqual(this.cancelAll, customerObject.cancelAll) && Intrinsics.areEqual(this.notify, customerObject.notify) && Intrinsics.areEqual(this.cancel, customerObject.cancel) && Intrinsics.areEqual(this.onTransact, customerObject.onTransact) && Intrinsics.areEqual(this.INotificationSideChannelStub, customerObject.INotificationSideChannelStub) && Intrinsics.areEqual(this.INotificationSideChannelStubProxy, customerObject.INotificationSideChannelStubProxy) && Intrinsics.areEqual(this.RemoteActionCompatParcelizer, customerObject.RemoteActionCompatParcelizer) && Intrinsics.areEqual(this.getInterfaceDescriptor, customerObject.getInterfaceDescriptor) && Intrinsics.areEqual((Object) this.INotificationSideChannelDefault, (Object) customerObject.INotificationSideChannelDefault) && Intrinsics.areEqual((Object) this.read, (Object) customerObject.read) && Intrinsics.areEqual((Object) this.MediaBrowserCompat, (Object) customerObject.MediaBrowserCompat) && Intrinsics.areEqual((Object) this.connect, (Object) customerObject.connect) && this.IconCompatParcelizer == customerObject.IconCompatParcelizer && Intrinsics.areEqual(this.write, customerObject.write) && Intrinsics.areEqual(this.getRoot, customerObject.getRoot) && Intrinsics.areEqual(this.disconnect, customerObject.disconnect) && Intrinsics.areEqual(this.getNotifyChildrenChangedOptions, customerObject.getNotifyChildrenChangedOptions) && Intrinsics.areEqual(this.getItem, customerObject.getItem) && Intrinsics.areEqual(this.getExtras, customerObject.getExtras) && Intrinsics.areEqual(this.search, customerObject.search) && Intrinsics.areEqual(this.sendCustomAction, customerObject.sendCustomAction) && Intrinsics.areEqual(this.getSessionToken, customerObject.getSessionToken) && Intrinsics.areEqual(this.isConnected, customerObject.isConnected) && Intrinsics.areEqual(this.getServiceComponent, customerObject.getServiceComponent) && Intrinsics.areEqual(this.setCallbacksMessenger, customerObject.setCallbacksMessenger) && Intrinsics.areEqual(this.MediaBrowserCompatCallbackHandler, customerObject.MediaBrowserCompatCallbackHandler) && Intrinsics.areEqual(this.subscribe, customerObject.subscribe) && Intrinsics.areEqual(this.unsubscribe, customerObject.unsubscribe) && Intrinsics.areEqual(this.handleMessage, customerObject.handleMessage) && Intrinsics.areEqual(this.onConnectionFailed, customerObject.onConnectionFailed) && Intrinsics.areEqual(this.setInternalConnectionCallback, customerObject.setInternalConnectionCallback) && Intrinsics.areEqual(this.onConnectionSuspended, customerObject.onConnectionSuspended);
    }

    public final int hashCode() {
        int iHashCode = this.TuitionPaymentFragmentbindingInflater1.hashCode();
        int iHashCode2 = this.b.hashCode();
        int iHashCode3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.asBinder;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.asInterface;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.a;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.d;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.g;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.INotificationSideChannel;
        int iHashCode11 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.cancelAll;
        int iHashCode12 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.notify;
        int iHashCode13 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.cancel;
        int iHashCode14 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.onTransact;
        int iHashCode15 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.INotificationSideChannelStub;
        int iHashCode16 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.INotificationSideChannelStubProxy;
        int iHashCode17 = str14 == null ? 0 : str14.hashCode();
        int iHashCode18 = this.RemoteActionCompatParcelizer.hashCode();
        String str15 = this.getInterfaceDescriptor;
        int iHashCode19 = str15 == null ? 0 : str15.hashCode();
        Double d = this.INotificationSideChannelDefault;
        int iHashCode20 = d == null ? 0 : d.hashCode();
        Double d2 = this.read;
        int iHashCode21 = d2 == null ? 0 : d2.hashCode();
        Double d3 = this.MediaBrowserCompat;
        int iHashCode22 = d3 == null ? 0 : d3.hashCode();
        Double d4 = this.connect;
        int iHashCode23 = d4 == null ? 0 : d4.hashCode();
        int iHashCode24 = Integer.hashCode(this.IconCompatParcelizer);
        String str16 = this.write;
        int iHashCode25 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.getRoot;
        int iHashCode26 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.disconnect;
        int iHashCode27 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.getNotifyChildrenChangedOptions;
        int iHashCode28 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.getItem;
        int iHashCode29 = str20 == null ? 0 : str20.hashCode();
        Boolean bool = this.getExtras;
        int iHashCode30 = bool == null ? 0 : bool.hashCode();
        LinkedAccountDirectDebit linkedAccountDirectDebit = this.search;
        int iHashCode31 = linkedAccountDirectDebit == null ? 0 : linkedAccountDirectDebit.hashCode();
        Boolean bool2 = this.sendCustomAction;
        int iHashCode32 = bool2 == null ? 0 : bool2.hashCode();
        LinkedAccountDirectDebit linkedAccountDirectDebit2 = this.getSessionToken;
        int iHashCode33 = linkedAccountDirectDebit2 == null ? 0 : linkedAccountDirectDebit2.hashCode();
        Boolean bool3 = this.isConnected;
        int iHashCode34 = bool3 == null ? 0 : bool3.hashCode();
        LinkedAccountEwallet linkedAccountEwallet = this.getServiceComponent;
        int iHashCode35 = linkedAccountEwallet == null ? 0 : linkedAccountEwallet.hashCode();
        Boolean bool4 = this.setCallbacksMessenger;
        int iHashCode36 = bool4 == null ? 0 : bool4.hashCode();
        LinkedAccountEwallet linkedAccountEwallet2 = this.MediaBrowserCompatCallbackHandler;
        int iHashCode37 = linkedAccountEwallet2 == null ? 0 : linkedAccountEwallet2.hashCode();
        Boolean bool5 = this.subscribe;
        int iHashCode38 = bool5 == null ? 0 : bool5.hashCode();
        LinkedAccountEwallet linkedAccountEwallet3 = this.unsubscribe;
        int iHashCode39 = linkedAccountEwallet3 == null ? 0 : linkedAccountEwallet3.hashCode();
        Boolean bool6 = this.handleMessage;
        int iHashCode40 = bool6 == null ? 0 : bool6.hashCode();
        LinkedAccountEwallet linkedAccountEwallet4 = this.onConnectionFailed;
        int iHashCode41 = linkedAccountEwallet4 == null ? 0 : linkedAccountEwallet4.hashCode();
        Boolean bool7 = this.setInternalConnectionCallback;
        int iHashCode42 = bool7 == null ? 0 : bool7.hashCode();
        Boolean bool8 = this.onConnectionSuspended;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + (bool8 != null ? bool8.hashCode() : 0);
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentbindingInflater1;
        String str2 = this.b;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str6 = this.asBinder;
        String str7 = this.asInterface;
        String str8 = this.a;
        String str9 = this.d;
        String str10 = this.g;
        String str11 = this.INotificationSideChannel;
        String str12 = this.cancelAll;
        String str13 = this.notify;
        String str14 = this.cancel;
        String str15 = this.onTransact;
        String str16 = this.INotificationSideChannelStub;
        String str17 = this.INotificationSideChannelStubProxy;
        String str18 = this.RemoteActionCompatParcelizer;
        String str19 = this.getInterfaceDescriptor;
        Double d = this.INotificationSideChannelDefault;
        Double d2 = this.read;
        Double d3 = this.MediaBrowserCompat;
        Double d4 = this.connect;
        int i = this.IconCompatParcelizer;
        String str20 = this.write;
        String str21 = this.getRoot;
        String str22 = this.disconnect;
        String str23 = this.getNotifyChildrenChangedOptions;
        String str24 = this.getItem;
        Boolean bool = this.getExtras;
        LinkedAccountDirectDebit linkedAccountDirectDebit = this.search;
        Boolean bool2 = this.sendCustomAction;
        LinkedAccountDirectDebit linkedAccountDirectDebit2 = this.getSessionToken;
        Boolean bool3 = this.isConnected;
        LinkedAccountEwallet linkedAccountEwallet = this.getServiceComponent;
        Boolean bool4 = this.setCallbacksMessenger;
        LinkedAccountEwallet linkedAccountEwallet2 = this.MediaBrowserCompatCallbackHandler;
        Boolean bool5 = this.subscribe;
        LinkedAccountEwallet linkedAccountEwallet3 = this.unsubscribe;
        Boolean bool6 = this.handleMessage;
        LinkedAccountEwallet linkedAccountEwallet4 = this.onConnectionFailed;
        Boolean bool7 = this.setInternalConnectionCallback;
        Boolean bool8 = this.onConnectionSuspended;
        StringBuilder sb = new StringBuilder("CustomerObject(TuitionPaymentFragmentbindingInflater1=");
        sb.append(str);
        sb.append(", b=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str4);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str5);
        sb.append(", asBinder=");
        sb.append(str6);
        sb.append(", asInterface=");
        sb.append(str7);
        sb.append(", a=");
        sb.append(str8);
        sb.append(", d=");
        sb.append(str9);
        sb.append(", g=");
        sb.append(str10);
        sb.append(", INotificationSideChannel=");
        sb.append(str11);
        sb.append(", cancelAll=");
        sb.append(str12);
        sb.append(", notify=");
        sb.append(str13);
        sb.append(", cancel=");
        sb.append(str14);
        sb.append(", onTransact=");
        sb.append(str15);
        sb.append(", INotificationSideChannelStub=");
        sb.append(str16);
        sb.append(", INotificationSideChannelStubProxy=");
        sb.append(str17);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str18);
        sb.append(", getInterfaceDescriptor=");
        sb.append(str19);
        sb.append(", INotificationSideChannelDefault=");
        sb.append(d);
        sb.append(", read=");
        sb.append(d2);
        sb.append(", MediaBrowserCompat=");
        sb.append(d3);
        sb.append(", connect=");
        sb.append(d4);
        sb.append(", IconCompatParcelizer=");
        sb.append(i);
        sb.append(", write=");
        sb.append(str20);
        sb.append(", getRoot=");
        sb.append(str21);
        sb.append(", disconnect=");
        sb.append(str22);
        sb.append(", getNotifyChildrenChangedOptions=");
        sb.append(str23);
        sb.append(", getItem=");
        sb.append(str24);
        sb.append(", getExtras=");
        sb.append(bool);
        sb.append(", search=");
        sb.append(linkedAccountDirectDebit);
        sb.append(", sendCustomAction=");
        sb.append(bool2);
        sb.append(", getSessionToken=");
        sb.append(linkedAccountDirectDebit2);
        sb.append(", isConnected=");
        sb.append(bool3);
        sb.append(", getServiceComponent=");
        sb.append(linkedAccountEwallet);
        sb.append(", setCallbacksMessenger=");
        sb.append(bool4);
        sb.append(", MediaBrowserCompatCallbackHandler=");
        sb.append(linkedAccountEwallet2);
        sb.append(", subscribe=");
        sb.append(bool5);
        sb.append(", unsubscribe=");
        sb.append(linkedAccountEwallet3);
        sb.append(", handleMessage=");
        sb.append(bool6);
        sb.append(", onConnectionFailed=");
        sb.append(linkedAccountEwallet4);
        sb.append(", setInternalConnectionCallback=");
        sb.append(bool7);
        sb.append(", onConnectionSuspended=");
        sb.append(bool8);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.b);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.asBinder);
        p0.writeString(this.asInterface);
        p0.writeString(this.a);
        p0.writeString(this.d);
        p0.writeString(this.g);
        p0.writeString(this.INotificationSideChannel);
        p0.writeString(this.cancelAll);
        p0.writeString(this.notify);
        p0.writeString(this.cancel);
        p0.writeString(this.onTransact);
        p0.writeString(this.INotificationSideChannelStub);
        p0.writeString(this.INotificationSideChannelStubProxy);
        p0.writeString(this.RemoteActionCompatParcelizer);
        p0.writeString(this.getInterfaceDescriptor);
        Double d = this.INotificationSideChannelDefault;
        if (d == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeDouble(d.doubleValue());
        }
        Double d2 = this.read;
        if (d2 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeDouble(d2.doubleValue());
        }
        Double d3 = this.MediaBrowserCompat;
        if (d3 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeDouble(d3.doubleValue());
        }
        Double d4 = this.connect;
        if (d4 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeDouble(d4.doubleValue());
        }
        p0.writeInt(this.IconCompatParcelizer);
        p0.writeString(this.write);
        p0.writeString(this.getRoot);
        p0.writeString(this.disconnect);
        p0.writeString(this.getNotifyChildrenChangedOptions);
        p0.writeString(this.getItem);
        Boolean bool = this.getExtras;
        if (bool == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeInt(bool.booleanValue() ? 1 : 0);
        }
        LinkedAccountDirectDebit linkedAccountDirectDebit = this.search;
        if (linkedAccountDirectDebit == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            linkedAccountDirectDebit.writeToParcel(p0, p1);
        }
        Boolean bool2 = this.sendCustomAction;
        if (bool2 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        LinkedAccountDirectDebit linkedAccountDirectDebit2 = this.getSessionToken;
        if (linkedAccountDirectDebit2 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            linkedAccountDirectDebit2.writeToParcel(p0, p1);
        }
        Boolean bool3 = this.isConnected;
        if (bool3 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        LinkedAccountEwallet linkedAccountEwallet = this.getServiceComponent;
        if (linkedAccountEwallet == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            linkedAccountEwallet.writeToParcel(p0, p1);
        }
        Boolean bool4 = this.setCallbacksMessenger;
        if (bool4 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        LinkedAccountEwallet linkedAccountEwallet2 = this.MediaBrowserCompatCallbackHandler;
        if (linkedAccountEwallet2 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            linkedAccountEwallet2.writeToParcel(p0, p1);
        }
        Boolean bool5 = this.subscribe;
        if (bool5 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        LinkedAccountEwallet linkedAccountEwallet3 = this.unsubscribe;
        if (linkedAccountEwallet3 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            linkedAccountEwallet3.writeToParcel(p0, p1);
        }
        Boolean bool6 = this.handleMessage;
        if (bool6 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        LinkedAccountEwallet linkedAccountEwallet4 = this.onConnectionFailed;
        if (linkedAccountEwallet4 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            linkedAccountEwallet4.writeToParcel(p0, p1);
        }
        Boolean bool7 = this.setInternalConnectionCallback;
        if (bool7 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        Boolean bool8 = this.onConnectionSuspended;
        if (bool8 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeInt(bool8.booleanValue() ? 1 : 0);
        }
    }
}
