package com.bpjstku.domain.scholarship.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010&\u001a\u00020\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u0002\u0012\b\b\u0002\u0010)\u001a\u00020\u0002\u0012\b\b\u0002\u0010*\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0010¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u0002032\b\u0010\u0003\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b6\u00101J\u0010\u00107\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b7\u00108J\u001d\u0010;\u001a\u00020:2\u0006\u0010\u0003\u001a\u0002092\u0006\u0010\u0004\u001a\u00020\u0010¢\u0006\u0004\b;\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010A\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b@\u0010>R\u0018\u0010C\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bB\u0010>R\u0016\u0010E\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bD\u0010>R\u0016\u0010G\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bF\u0010>R\u0016\u0010I\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bH\u0010>R\u0016\u0010D\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bC\u0010>R\u0016\u0010J\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bI\u0010>R\u0016\u0010K\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bA\u0010>R\u0016\u0010L\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bK\u0010>R\u0016\u0010N\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bM\u0010>R\u0016\u0010P\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bO\u0010>R\u0016\u0010R\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bQ\u0010>R\u0016\u0010T\u001a\u00020\u00108\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bP\u0010SR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\f¢\u0006\u0006\n\u0004\bJ\u0010>R\u0016\u0010V\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\bU\u0010>R\u0016\u0010X\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\bW\u0010>R\u0016\u0010Z\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\bY\u0010>R\u0016\u0010\\\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b[\u0010>R\u0016\u0010B\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bN\u0010>R\u0016\u0010F\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\\\u0010>R\u0016\u0010]\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bV\u0010>R\u0016\u0010^\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bR\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010\u001b8\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\bE\u0010_R\u0016\u0010=\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b`\u0010>R\u0018\u0010M\u001a\u0004\u0018\u00010\u001b8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\ba\u0010_R\u0018\u0010`\u001a\u0004\u0018\u00010\u001b8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bL\u0010_R\u0018\u0010H\u001a\u0004\u0018\u00010 8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010[\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bX\u0010>R\u0016\u0010O\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bT\u0010>R\u0016\u0010Y\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b?\u0010>R\u0016\u0010e\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bd\u0010>R\u0016\u0010f\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\be\u0010>R\u0016\u0010d\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bZ\u0010>R\u0016\u0010a\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bG\u0010>R\u0016\u0010W\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b^\u0010>R\u0016\u0010g\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b]\u0010>R\u001e\u0010b\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bf\u0010h"}, d2 = {"Lcom/bpjstku/domain/scholarship/model/ScholarPersonDetail;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "p23", "p24", "p25", "p26", "Ljava/util/Calendar;", "p27", "p28", "p29", "p30", "p31", "p32", "p33", "p34", "p35", "p36", "Ljava/util/ArrayList;", "Lcom/bpjstku/domain/scholarship/model/ScholarDocument;", "p37", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/domain/general/model/CodeNamePair;Ljava/lang/String;Lcom/bpjstku/domain/general/model/CodeNamePair;Lcom/bpjstku/domain/general/model/CodeNamePair;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "IconCompatParcelizer", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "MediaBrowserCompat", "b", "INotificationSideChannelStub", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "connect", "TuitionPaymentFragmentbindingInflater1", "getNotifyChildrenChangedOptions", "d", "a", "asBinder", "g", "getItem", "INotificationSideChannel", "getRoot", "notify", "cancel", "onTransact", "I", "cancelAll", "unsubscribe", "RemoteActionCompatParcelizer", "MediaBrowserCompatCallbackHandler", "INotificationSideChannelStubProxy", "getServiceComponent", "getInterfaceDescriptor", "disconnect", "INotificationSideChannelDefault", "read", "write", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "getExtras", "sendCustomAction", "setCallbacksMessenger", "Ljava/util/Calendar;", "getSessionToken", "isConnected", FirebaseAnalytics.Event.SEARCH, "handleMessage", "Ljava/util/ArrayList;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarPersonDetail implements Parcelable {
    public static final Parcelable.Creator<ScholarPersonDetail> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public String INotificationSideChannelStub;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    public String connect;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    public String disconnect;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    public String b;

    /* JADX INFO: renamed from: MediaBrowserCompatCallbackHandler, reason: from kotlin metadata */
    public String INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public String read;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public String sendCustomAction;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public String asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public CodeNamePair MediaBrowserCompat;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public String getServiceComponent;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public String cancel;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public String g;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public String asBinder;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public String onTransact;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public String getRoot;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    public String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public String a;

    /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
    public String INotificationSideChannelDefault;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public CodeNamePair getExtras;

    /* JADX INFO: renamed from: getExtras, reason: from kotlin metadata */
    public String IconCompatParcelizer;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    public String getSessionToken;

    /* JADX INFO: renamed from: getItem, reason: from kotlin metadata */
    public String INotificationSideChannel;

    /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from kotlin metadata */
    public String d;

    /* JADX INFO: renamed from: getRoot, reason: from kotlin metadata */
    public String notify;

    /* JADX INFO: renamed from: getServiceComponent, reason: from kotlin metadata */
    public String getInterfaceDescriptor;

    /* JADX INFO: renamed from: getSessionToken, reason: from kotlin metadata */
    public String isConnected;

    /* JADX INFO: renamed from: isConnected, reason: from kotlin metadata */
    public String search;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public int cancelAll;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public String write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public String handleMessage;

    /* JADX INFO: renamed from: search, reason: from kotlin metadata */
    public ArrayList<ScholarDocument> setCallbacksMessenger;

    /* JADX INFO: renamed from: sendCustomAction, reason: from kotlin metadata */
    public CodeNamePair getItem;

    /* JADX INFO: renamed from: setCallbacksMessenger, reason: from kotlin metadata */
    public Calendar getNotifyChildrenChangedOptions;

    /* JADX INFO: renamed from: unsubscribe, reason: from kotlin metadata */
    public String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public String MediaBrowserCompatCallbackHandler;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ScholarPersonDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, CodeNamePair codeNamePair, String str23, CodeNamePair codeNamePair2, CodeNamePair codeNamePair3, Calendar calendar, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, ArrayList<ScholarDocument> arrayList) {
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.b = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str4;
        this.TuitionPaymentFragmentbindingInflater1 = str5;
        this.d = str6;
        this.asInterface = str7;
        this.a = str8;
        this.asBinder = str9;
        this.g = str10;
        this.INotificationSideChannel = str11;
        this.notify = str12;
        this.onTransact = str13;
        this.cancelAll = i;
        this.cancel = str14;
        this.RemoteActionCompatParcelizer = str15;
        this.INotificationSideChannelStubProxy = str16;
        this.getInterfaceDescriptor = str17;
        this.INotificationSideChannelDefault = str18;
        this.INotificationSideChannelStub = str19;
        this.connect = str20;
        this.read = str21;
        this.write = str22;
        this.MediaBrowserCompat = codeNamePair;
        this.IconCompatParcelizer = str23;
        this.getItem = codeNamePair2;
        this.getExtras = codeNamePair3;
        this.getNotifyChildrenChangedOptions = calendar;
        this.disconnect = str24;
        this.getRoot = str25;
        this.getServiceComponent = str26;
        this.isConnected = str27;
        this.search = str28;
        this.getSessionToken = str29;
        this.sendCustomAction = str30;
        this.MediaBrowserCompatCallbackHandler = str31;
        this.handleMessage = str32;
        this.setCallbacksMessenger = arrayList;
    }

    public /* synthetic */ ScholarPersonDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, CodeNamePair codeNamePair, String str23, CodeNamePair codeNamePair2, CodeNamePair codeNamePair3, Calendar calendar, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, ArrayList arrayList, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, i, (i2 & 16384) != 0 ? null : str14, (32768 & i2) != 0 ? "Y" : str15, (65536 & i2) != 0 ? "" : str16, (131072 & i2) != 0 ? "" : str17, (262144 & i2) != 0 ? "" : str18, (524288 & i2) != 0 ? "" : str19, (1048576 & i2) != 0 ? "" : str20, (2097152 & i2) != 0 ? "" : str21, (4194304 & i2) != 0 ? "" : str22, (8388608 & i2) != 0 ? null : codeNamePair, (16777216 & i2) != 0 ? "" : str23, (33554432 & i2) != 0 ? null : codeNamePair2, (67108864 & i2) != 0 ? null : codeNamePair3, (134217728 & i2) != 0 ? null : calendar, (268435456 & i2) != 0 ? "" : str24, (536870912 & i2) != 0 ? "" : str25, (1073741824 & i2) != 0 ? "" : str26, (i2 & Integer.MIN_VALUE) != 0 ? "" : str27, (i3 & 1) != 0 ? "" : str28, (i3 & 2) != 0 ? "" : str29, (i3 & 4) != 0 ? "" : str30, (i3 & 8) != 0 ? "" : str31, (i3 & 16) != 0 ? "" : str32, (i3 & 32) != 0 ? CollectionsKt.arrayListOf(new ScholarDocument("D113", "", "Surat Keterangan Menempuh Pendidikan dari Sekolah / Perguruan tinggi", null, null, null, null, null, 240, null), new ScholarDocument("D114", "", "Raport / Transkrip Nilai", null, null, null, null, null, 240, null), new ScholarDocument("D000", "", "Dokumen Lainya", null, null, null, null, null, 240, null)) : arrayList);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Parcelable.Creator<ScholarPersonDetail> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ScholarPersonDetail createFromParcel(Parcel parcel) {
            ArrayList arrayList;
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
            int i = parcel.readInt();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            CodeNamePair codeNamePairCreateFromParcel = parcel.readInt() == 0 ? null : CodeNamePair.CREATOR.createFromParcel(parcel);
            String string23 = parcel.readString();
            CodeNamePair codeNamePairCreateFromParcel2 = parcel.readInt() == 0 ? null : CodeNamePair.CREATOR.createFromParcel(parcel);
            CodeNamePair codeNamePairCreateFromParcel3 = parcel.readInt() == 0 ? null : CodeNamePair.CREATOR.createFromParcel(parcel);
            Calendar calendar = (Calendar) parcel.readSerializable();
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            String string27 = parcel.readString();
            String string28 = parcel.readString();
            String string29 = parcel.readString();
            String string30 = parcel.readString();
            String string31 = parcel.readString();
            String string32 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int i3 = 0;
                while (i3 != i2) {
                    arrayList2.add(ScholarDocument.CREATOR.createFromParcel(parcel));
                    i3++;
                    i2 = i2;
                }
                arrayList = arrayList2;
            }
            return new ScholarPersonDetail(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, i, string14, string15, string16, string17, string18, string19, string20, string21, string22, codeNamePairCreateFromParcel, string23, codeNamePairCreateFromParcel2, codeNamePairCreateFromParcel3, calendar, string24, string25, string26, string27, string28, string29, string30, string31, string32, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ScholarPersonDetail[] newArray(int i) {
            return new ScholarPersonDetail[i];
        }
    }

    public static /* synthetic */ ScholarPersonDetail TuitionPaymentFragmentspecialinlinedviewModeldefault1(ScholarPersonDetail scholarPersonDetail, String str, String str2, CodeNamePair codeNamePair, CodeNamePair codeNamePair2, String str3, String str4, String str5) {
        String str6 = scholarPersonDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str7 = scholarPersonDetail.b;
        String str8 = scholarPersonDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str9 = scholarPersonDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str10 = scholarPersonDetail.TuitionPaymentFragmentbindingInflater1;
        String str11 = scholarPersonDetail.d;
        String str12 = scholarPersonDetail.asInterface;
        String str13 = scholarPersonDetail.a;
        String str14 = scholarPersonDetail.asBinder;
        String str15 = scholarPersonDetail.g;
        String str16 = scholarPersonDetail.INotificationSideChannel;
        String str17 = scholarPersonDetail.notify;
        String str18 = scholarPersonDetail.onTransact;
        int i = scholarPersonDetail.cancelAll;
        String str19 = scholarPersonDetail.cancel;
        String str20 = scholarPersonDetail.RemoteActionCompatParcelizer;
        String str21 = scholarPersonDetail.INotificationSideChannelDefault;
        String str22 = scholarPersonDetail.INotificationSideChannelStub;
        String str23 = scholarPersonDetail.connect;
        String str24 = scholarPersonDetail.read;
        String str25 = scholarPersonDetail.write;
        CodeNamePair codeNamePair3 = scholarPersonDetail.MediaBrowserCompat;
        String str26 = scholarPersonDetail.IconCompatParcelizer;
        Calendar calendar = scholarPersonDetail.getNotifyChildrenChangedOptions;
        String str27 = scholarPersonDetail.isConnected;
        String str28 = scholarPersonDetail.search;
        String str29 = scholarPersonDetail.getSessionToken;
        String str30 = scholarPersonDetail.sendCustomAction;
        String str31 = scholarPersonDetail.MediaBrowserCompatCallbackHandler;
        String str32 = scholarPersonDetail.handleMessage;
        ArrayList<ScholarDocument> arrayList = scholarPersonDetail.setCallbacksMessenger;
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
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        return new ScholarPersonDetail(str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, i, str19, str20, str, str2, str21, str22, str23, str24, str25, codeNamePair3, str26, codeNamePair, codeNamePair2, calendar, str3, str4, str5, str27, str28, str29, str30, str31, str32, arrayList);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarPersonDetail)) {
            return false;
        }
        ScholarPersonDetail scholarPersonDetail = (ScholarPersonDetail) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, scholarPersonDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.b, scholarPersonDetail.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, scholarPersonDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, scholarPersonDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, scholarPersonDetail.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.d, scholarPersonDetail.d) && Intrinsics.areEqual(this.asInterface, scholarPersonDetail.asInterface) && Intrinsics.areEqual(this.a, scholarPersonDetail.a) && Intrinsics.areEqual(this.asBinder, scholarPersonDetail.asBinder) && Intrinsics.areEqual(this.g, scholarPersonDetail.g) && Intrinsics.areEqual(this.INotificationSideChannel, scholarPersonDetail.INotificationSideChannel) && Intrinsics.areEqual(this.notify, scholarPersonDetail.notify) && Intrinsics.areEqual(this.onTransact, scholarPersonDetail.onTransact) && this.cancelAll == scholarPersonDetail.cancelAll && Intrinsics.areEqual(this.cancel, scholarPersonDetail.cancel) && Intrinsics.areEqual(this.RemoteActionCompatParcelizer, scholarPersonDetail.RemoteActionCompatParcelizer) && Intrinsics.areEqual(this.INotificationSideChannelStubProxy, scholarPersonDetail.INotificationSideChannelStubProxy) && Intrinsics.areEqual(this.getInterfaceDescriptor, scholarPersonDetail.getInterfaceDescriptor) && Intrinsics.areEqual(this.INotificationSideChannelDefault, scholarPersonDetail.INotificationSideChannelDefault) && Intrinsics.areEqual(this.INotificationSideChannelStub, scholarPersonDetail.INotificationSideChannelStub) && Intrinsics.areEqual(this.connect, scholarPersonDetail.connect) && Intrinsics.areEqual(this.read, scholarPersonDetail.read) && Intrinsics.areEqual(this.write, scholarPersonDetail.write) && Intrinsics.areEqual(this.MediaBrowserCompat, scholarPersonDetail.MediaBrowserCompat) && Intrinsics.areEqual(this.IconCompatParcelizer, scholarPersonDetail.IconCompatParcelizer) && Intrinsics.areEqual(this.getItem, scholarPersonDetail.getItem) && Intrinsics.areEqual(this.getExtras, scholarPersonDetail.getExtras) && Intrinsics.areEqual(this.getNotifyChildrenChangedOptions, scholarPersonDetail.getNotifyChildrenChangedOptions) && Intrinsics.areEqual(this.disconnect, scholarPersonDetail.disconnect) && Intrinsics.areEqual(this.getRoot, scholarPersonDetail.getRoot) && Intrinsics.areEqual(this.getServiceComponent, scholarPersonDetail.getServiceComponent) && Intrinsics.areEqual(this.isConnected, scholarPersonDetail.isConnected) && Intrinsics.areEqual(this.search, scholarPersonDetail.search) && Intrinsics.areEqual(this.getSessionToken, scholarPersonDetail.getSessionToken) && Intrinsics.areEqual(this.sendCustomAction, scholarPersonDetail.sendCustomAction) && Intrinsics.areEqual(this.MediaBrowserCompatCallbackHandler, scholarPersonDetail.MediaBrowserCompatCallbackHandler) && Intrinsics.areEqual(this.handleMessage, scholarPersonDetail.handleMessage) && Intrinsics.areEqual(this.setCallbacksMessenger, scholarPersonDetail.setCallbacksMessenger);
    }

    public final int hashCode() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        int iHashCode5 = this.TuitionPaymentFragmentbindingInflater1.hashCode();
        int iHashCode6 = this.d.hashCode();
        int iHashCode7 = this.asInterface.hashCode();
        int iHashCode8 = this.a.hashCode();
        int iHashCode9 = this.asBinder.hashCode();
        int iHashCode10 = this.g.hashCode();
        int iHashCode11 = this.INotificationSideChannel.hashCode();
        int iHashCode12 = this.notify.hashCode();
        int iHashCode13 = this.onTransact.hashCode();
        int iHashCode14 = Integer.hashCode(this.cancelAll);
        String str4 = this.cancel;
        int iHashCode15 = str4 == null ? 0 : str4.hashCode();
        int iHashCode16 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode17 = this.INotificationSideChannelStubProxy.hashCode();
        int iHashCode18 = this.getInterfaceDescriptor.hashCode();
        int iHashCode19 = this.INotificationSideChannelDefault.hashCode();
        int iHashCode20 = this.INotificationSideChannelStub.hashCode();
        int iHashCode21 = this.connect.hashCode();
        int iHashCode22 = this.read.hashCode();
        int iHashCode23 = this.write.hashCode();
        CodeNamePair codeNamePair = this.MediaBrowserCompat;
        int iHashCode24 = codeNamePair == null ? 0 : codeNamePair.hashCode();
        int iHashCode25 = this.IconCompatParcelizer.hashCode();
        CodeNamePair codeNamePair2 = this.getItem;
        int iHashCode26 = codeNamePair2 == null ? 0 : codeNamePair2.hashCode();
        CodeNamePair codeNamePair3 = this.getExtras;
        int iHashCode27 = codeNamePair3 == null ? 0 : codeNamePair3.hashCode();
        Calendar calendar = this.getNotifyChildrenChangedOptions;
        int iHashCode28 = calendar == null ? 0 : calendar.hashCode();
        int iHashCode29 = this.disconnect.hashCode();
        int iHashCode30 = this.getRoot.hashCode();
        int iHashCode31 = this.getServiceComponent.hashCode();
        int iHashCode32 = this.isConnected.hashCode();
        int iHashCode33 = this.search.hashCode();
        int iHashCode34 = this.getSessionToken.hashCode();
        int iHashCode35 = this.sendCustomAction.hashCode();
        int iHashCode36 = this.MediaBrowserCompatCallbackHandler.hashCode();
        int iHashCode37 = this.handleMessage.hashCode();
        ArrayList<ScholarDocument> arrayList = this.setCallbacksMessenger;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str2 = this.b;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str5 = this.TuitionPaymentFragmentbindingInflater1;
        String str6 = this.d;
        String str7 = this.asInterface;
        String str8 = this.a;
        String str9 = this.asBinder;
        String str10 = this.g;
        String str11 = this.INotificationSideChannel;
        String str12 = this.notify;
        String str13 = this.onTransact;
        int i = this.cancelAll;
        String str14 = this.cancel;
        String str15 = this.RemoteActionCompatParcelizer;
        String str16 = this.INotificationSideChannelStubProxy;
        String str17 = this.getInterfaceDescriptor;
        String str18 = this.INotificationSideChannelDefault;
        String str19 = this.INotificationSideChannelStub;
        String str20 = this.connect;
        String str21 = this.read;
        String str22 = this.write;
        CodeNamePair codeNamePair = this.MediaBrowserCompat;
        String str23 = this.IconCompatParcelizer;
        CodeNamePair codeNamePair2 = this.getItem;
        CodeNamePair codeNamePair3 = this.getExtras;
        Calendar calendar = this.getNotifyChildrenChangedOptions;
        String str24 = this.disconnect;
        String str25 = this.getRoot;
        String str26 = this.getServiceComponent;
        String str27 = this.isConnected;
        String str28 = this.search;
        String str29 = this.getSessionToken;
        String str30 = this.sendCustomAction;
        String str31 = this.MediaBrowserCompatCallbackHandler;
        String str32 = this.handleMessage;
        ArrayList<ScholarDocument> arrayList = this.setCallbacksMessenger;
        StringBuilder sb = new StringBuilder("ScholarPersonDetail(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str);
        sb.append(", b=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str4);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
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
        sb.append(", onTransact=");
        sb.append(str13);
        sb.append(", cancelAll=");
        sb.append(i);
        sb.append(", cancel=");
        sb.append(str14);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str15);
        sb.append(", INotificationSideChannelStubProxy=");
        sb.append(str16);
        sb.append(", getInterfaceDescriptor=");
        sb.append(str17);
        sb.append(", INotificationSideChannelDefault=");
        sb.append(str18);
        sb.append(", INotificationSideChannelStub=");
        sb.append(str19);
        sb.append(", connect=");
        sb.append(str20);
        sb.append(", read=");
        sb.append(str21);
        sb.append(", write=");
        sb.append(str22);
        sb.append(", MediaBrowserCompat=");
        sb.append(codeNamePair);
        sb.append(", IconCompatParcelizer=");
        sb.append(str23);
        sb.append(", getItem=");
        sb.append(codeNamePair2);
        sb.append(", getExtras=");
        sb.append(codeNamePair3);
        sb.append(", getNotifyChildrenChangedOptions=");
        sb.append(calendar);
        sb.append(", disconnect=");
        sb.append(str24);
        sb.append(", getRoot=");
        sb.append(str25);
        sb.append(", getServiceComponent=");
        sb.append(str26);
        sb.append(", isConnected=");
        sb.append(str27);
        sb.append(", search=");
        sb.append(str28);
        sb.append(", getSessionToken=");
        sb.append(str29);
        sb.append(", sendCustomAction=");
        sb.append(str30);
        sb.append(", MediaBrowserCompatCallbackHandler=");
        sb.append(str31);
        sb.append(", handleMessage=");
        sb.append(str32);
        sb.append(", setCallbacksMessenger=");
        sb.append(arrayList);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.b);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.d);
        p0.writeString(this.asInterface);
        p0.writeString(this.a);
        p0.writeString(this.asBinder);
        p0.writeString(this.g);
        p0.writeString(this.INotificationSideChannel);
        p0.writeString(this.notify);
        p0.writeString(this.onTransact);
        p0.writeInt(this.cancelAll);
        p0.writeString(this.cancel);
        p0.writeString(this.RemoteActionCompatParcelizer);
        p0.writeString(this.INotificationSideChannelStubProxy);
        p0.writeString(this.getInterfaceDescriptor);
        p0.writeString(this.INotificationSideChannelDefault);
        p0.writeString(this.INotificationSideChannelStub);
        p0.writeString(this.connect);
        p0.writeString(this.read);
        p0.writeString(this.write);
        CodeNamePair codeNamePair = this.MediaBrowserCompat;
        if (codeNamePair == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            codeNamePair.writeToParcel(p0, p1);
        }
        p0.writeString(this.IconCompatParcelizer);
        CodeNamePair codeNamePair2 = this.getItem;
        if (codeNamePair2 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            codeNamePair2.writeToParcel(p0, p1);
        }
        CodeNamePair codeNamePair3 = this.getExtras;
        if (codeNamePair3 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            codeNamePair3.writeToParcel(p0, p1);
        }
        p0.writeSerializable(this.getNotifyChildrenChangedOptions);
        p0.writeString(this.disconnect);
        p0.writeString(this.getRoot);
        p0.writeString(this.getServiceComponent);
        p0.writeString(this.isConnected);
        p0.writeString(this.search);
        p0.writeString(this.getSessionToken);
        p0.writeString(this.sendCustomAction);
        p0.writeString(this.MediaBrowserCompatCallbackHandler);
        p0.writeString(this.handleMessage);
        ArrayList<ScholarDocument> arrayList = this.setCallbacksMessenger;
        if (arrayList == null) {
            p0.writeInt(0);
            return;
        }
        p0.writeInt(1);
        p0.writeInt(arrayList.size());
        Iterator<ScholarDocument> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(p0, p1);
        }
    }
}
