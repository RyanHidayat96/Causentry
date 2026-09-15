package com.datadog.android.rum.model;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.os.EnvironmentCompat;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.messaging.Constants;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b<\b\u0086\b\u0018\u0000 <2\u00020\u0001:'63Y8Z[41A=<:?EGCKHNSLP\\Q]UV^X_`abcdefghBß\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020)2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b/\u00100R\u0014\u00103\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u00107R\u0016\u00101\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010?\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010:\u001a\u0004\u0018\u00010!8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010=\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010A\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010E\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010H\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010JR\u0016\u0010C\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u00107R\u0014\u0010K\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010P\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010N\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0006\n\u0004\bP\u00107R\u0016\u0010Q\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010L\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u00107R\u0014\u0010X\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010W"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent;", "", "", "p0", "Lcom/datadog/android/rum/model/ActionEvent$b;", "p1", "", "p2", "p3", "p4", "p5", "Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "p6", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;", "p7", "Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "p8", "Lcom/datadog/android/rum/model/ActionEvent$getRoot;", "p9", "Lcom/datadog/android/rum/model/ActionEvent$a;", "p10", "Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannelStub;", "p11", "Lcom/datadog/android/rum/model/ActionEvent$getNotifyChildrenChangedOptions;", "p12", "Lcom/datadog/android/rum/model/ActionEvent$asBinder;", "p13", "Lcom/datadog/android/rum/model/ActionEvent$write;", "p14", "Lcom/datadog/android/rum/model/ActionEvent$getInterfaceDescriptor;", "p15", "Lcom/datadog/android/rum/model/ActionEvent$cancelAll;", "p16", "Lcom/datadog/android/rum/model/ActionEvent$onTransact;", "p17", "Lcom/datadog/android/rum/model/ActionEvent$notify;", "p18", "Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "p19", "<init>", "(JLcom/datadog/android/rum/model/ActionEvent$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;Lcom/datadog/android/rum/model/ActionEvent$getRoot;Lcom/datadog/android/rum/model/ActionEvent$a;Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannelStub;Lcom/datadog/android/rum/model/ActionEvent$getNotifyChildrenChangedOptions;Lcom/datadog/android/rum/model/ActionEvent$asBinder;Lcom/datadog/android/rum/model/ActionEvent$write;Lcom/datadog/android/rum/model/ActionEvent$getInterfaceDescriptor;Lcom/datadog/android/rum/model/ActionEvent$cancelAll;Lcom/datadog/android/rum/model/ActionEvent$onTransact;Lcom/datadog/android/rum/model/ActionEvent$notify;Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/rum/model/ActionEvent$b;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/rum/model/ActionEvent$asBinder;", "g", "Lcom/datadog/android/rum/model/ActionEvent$a;", "asInterface", "asBinder", "Lcom/datadog/android/rum/model/ActionEvent$notify;", "a", "Lcom/datadog/android/rum/model/ActionEvent$onTransact;", "d", "J", "onTransact", "Lcom/datadog/android/rum/model/ActionEvent$cancelAll;", "notify", "Lcom/datadog/android/rum/model/ActionEvent$getInterfaceDescriptor;", "INotificationSideChannel", "cancelAll", "Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannelStub;", "Lcom/datadog/android/rum/model/ActionEvent$write;", "cancel", "RemoteActionCompatParcelizer", "Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "INotificationSideChannelDefault", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;", "getInterfaceDescriptor", "INotificationSideChannelStub", "Lcom/datadog/android/rum/model/ActionEvent$getNotifyChildrenChangedOptions;", "INotificationSideChannelStubProxy", "Lcom/datadog/android/rum/model/ActionEvent$getRoot;", "IconCompatParcelizer", "read", "Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "connect", "ActionEventActionType", "ActionEventSessionType", "ActionEventSource", "DeviceType", "EffectiveType", "Interface", "write", "Plan", "MediaBrowserCompat", "disconnect", "SessionPrecondition", "Status", "getNotifyChildrenChangedOptions", "Type", "getRoot", "getExtras"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class ActionEvent {

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public final write cancelAll;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    public final ActionEventSource getInterfaceDescriptor;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    public final getNotifyChildrenChangedOptions INotificationSideChannelDefault;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    public final getRoot INotificationSideChannelStub;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public final TuitionPaymentFragmentspecialinlinedviewModeldefault1 cancel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final asBinder b;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final b TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final onTransact g;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final notify a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public final String onTransact;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public final INotificationSideChannelStub notify;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final long asBinder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final a asInterface;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    public final String INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public final getInterfaceDescriptor INotificationSideChannel;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final cancelAll d;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public final TuitionPaymentFragmentspecialinlinedviewModeldefault3 connect;

    public ActionEvent(long j, b bVar, String str, String str2, String str3, String str4, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, ActionEventSource actionEventSource, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, getRoot getroot, a aVar, INotificationSideChannelStub iNotificationSideChannelStub, getNotifyChildrenChangedOptions getnotifychildrenchangedoptions, asBinder asbinder, write writeVar, getInterfaceDescriptor getinterfacedescriptor, cancelAll cancelall, onTransact ontransact, notify notifyVar, TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        Intrinsics.checkNotNullParameter(bVar, "");
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        Intrinsics.checkNotNullParameter(cancelall, "");
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        this.asBinder = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bVar;
        this.onTransact = str;
        this.RemoteActionCompatParcelizer = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str4;
        this.cancel = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.getInterfaceDescriptor = actionEventSource;
        this.connect = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.INotificationSideChannelStub = getroot;
        this.asInterface = aVar;
        this.notify = iNotificationSideChannelStub;
        this.INotificationSideChannelDefault = getnotifychildrenchangedoptions;
        this.b = asbinder;
        this.cancelAll = writeVar;
        this.INotificationSideChannel = getinterfacedescriptor;
        this.d = cancelall;
        this.g = ontransact;
        this.a = notifyVar;
        this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.INotificationSideChannelStubProxy = "action";
    }

    public /* synthetic */ ActionEvent(long j, b bVar, String str, String str2, String str3, String str4, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, ActionEventSource actionEventSource, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, getRoot getroot, a aVar, INotificationSideChannelStub iNotificationSideChannelStub, getNotifyChildrenChangedOptions getnotifychildrenchangedoptions, asBinder asbinder, write writeVar, getInterfaceDescriptor getinterfacedescriptor, cancelAll cancelall, onTransact ontransact, notify notifyVar, TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, bVar, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, tuitionPaymentFragmentspecialinlinedviewModeldefault1, (i & 128) != 0 ? null : actionEventSource, tuitionPaymentFragmentspecialinlinedviewModeldefault3, (i & 512) != 0 ? null : getroot, (i & 1024) != 0 ? null : aVar, (i & 2048) != 0 ? null : iNotificationSideChannelStub, (i & 4096) != 0 ? null : getnotifychildrenchangedoptions, (i & 8192) != 0 ? null : asbinder, (i & 16384) != 0 ? null : writeVar, (32768 & i) != 0 ? null : getinterfacedescriptor, cancelall, (131072 & i) != 0 ? null : ontransact, (i & 262144) != 0 ? null : notifyVar, tuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannelDefault;", "", "Lcom/datadog/android/rum/model/ActionEvent$MediaBrowserCompat;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannelStubProxy;", "p1", "<init>", "(Lcom/datadog/android/rum/model/ActionEvent$MediaBrowserCompat;Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannelStubProxy;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Lcom/datadog/android/rum/model/ActionEvent$MediaBrowserCompat;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannelStubProxy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannelDefault {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final INotificationSideChannelStubProxy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final MediaBrowserCompat TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$INotificationSideChannelDefault$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannelDefault$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannelDefault;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannelDefault;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private static final byte[] $$a = {39, 27, 2, 54};
            private static final int $$b = 142;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            private static int b = -83722435;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {59709, 59757, 59747, 59751, 59757, 59747, 59744, 59750, 59754, 59723, 59707, 59705, 59725, 59720, 59684, 59707, 59705, 59741, 59736, 59712, 59749, 59775, 59744, 59724, 59736, 59773, 59749, 59750, 59768, 59751, 59759, 59751, 59739, 59736, 59751, 59744, 59744, 59758, 59806, 59430, 59438, 59432, 59427, 59438, 59419, 59876, 59395, 59427, 59435, 59432, 59427, 59438, 59435, 59892, 59403, 59414, 59432, 59436, 59433, 59435, 59413, 59698, 59744, 59757, 59759, 59756, 59756, 59740, 59730, 59757, 59759, 59757, 59756, 59753, 59731, 59700, 59718, 59749, 59716, 59738, 59770, 59746, 59751, 59770, 59749, 59746, 59715, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59728, 59824, 59831, 59836, 59830, 59832, 59810, 59832, 59827, 59836, 59838, 59836, 59811, 59815, 59707, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59715, 59746, 59749, 59770, 59751, 59746, 59770, 59738, 59716, 59749, 59718, 59700, 59731, 59753, 59756, 59757, 59759, 59757, 59740, 59728, 59745, 59745, 59783, 59418, 59397, 59421, 59901, 59903, 59416, 59897, 59886, 59400, 59398, 59396, 59399, 59396, 59410, 59411, 59419, 59395, 59399, 59397, 59419, 59422, 59418, 59392, 59877, 59878, 59397, 59416, 59705, 59746, 59746, 59744, 59746, 59745, 59751, 59743, 59743, 59744, 59768, 59749, 59756, 59756, 59757, 59753, 59745, 59751, 59757};

            private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
                char[] cArr2;
                int i4 = 2 % 2;
                setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                char[] cArr3 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i5]), Integer.valueOf(b)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.getMode(0), 3291 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 31 - TextUtils.indexOf("", "", 0, 0), 1199271174, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        try {
                            Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 650 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -450685997, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                if (i3 > 0) {
                    int i6 = $11 + 39;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                    char[] cArr4 = new char[i2];
                    System.arraycopy(cArr3, 0, cArr4, 0, i2);
                    System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                }
                if (z) {
                    int i8 = $11 + 55;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        cArr2 = new char[i2];
                        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    } else {
                        cArr2 = new char[i2];
                        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    }
                    while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) KeyEvent.getDeadChar(0, 0), 651 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 44 - Color.argb(0, 0, 0, 0), -450685997, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    }
                    cArr3 = cArr2;
                }
                objArr[0] = new String(cArr3);
            }

            /* JADX WARN: Code duplicated, block: B:33:0x00db A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:31:0x00c3, B:33:0x00db, B:34:0x0112, B:45:0x0194, B:47:0x01a1, B:48:0x01dc, B:39:0x012c, B:41:0x0145, B:42:0x0181), top: B:71:0x00c3 }] */
            /* JADX WARN: Code duplicated, block: B:38:0x0125  */
            /* JADX WARN: Code duplicated, block: B:41:0x0145 A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:31:0x00c3, B:33:0x00db, B:34:0x0112, B:45:0x0194, B:47:0x01a1, B:48:0x01dc, B:39:0x012c, B:41:0x0145, B:42:0x0181), top: B:71:0x00c3 }] */
            private static void c(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
                char c;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i = 2 % 2;
                setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
                int i2 = 0;
                int i3 = iArr[0];
                int i4 = 1;
                int i5 = iArr[1];
                int i6 = iArr[2];
                int i7 = iArr[3];
                char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                long j = 0;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i8 = 0;
                    while (i8 < length) {
                        try {
                            Object[] objArr2 = new Object[i4];
                            objArr2[i2] = Integer.valueOf(cArr[i8]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                int i9 = 1271 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                int i10 = (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 17;
                                byte b2 = (byte) i2;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(touchSlop, i9, i10, 407021364, false, $$c(b2, b3, (byte) (b3 | 20)), new Class[]{Integer.TYPE});
                            }
                            cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr2)).charValue();
                            i8++;
                            i2 = 0;
                            i4 = 1;
                            j = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i5];
                System.arraycopy(cArr, i3, cArr3, 0, i5);
                if (bArr != null) {
                    char[] cArr4 = new char[i5];
                    setvideostabilizationmode.b = 0;
                    char c2 = 0;
                    while (setvideostabilizationmode.b < i5) {
                        int i11 = $10 + 53;
                        $11 = i11 % 128;
                        if (i11 % 2 != 0) {
                            c = 1;
                            if (bArr[setvideostabilizationmode.b] == 1) {
                                int i12 = setvideostabilizationmode.b;
                                char c3 = cArr3[setvideostabilizationmode.b];
                                Object[] objArr3 = new Object[2];
                                objArr3[c] = Integer.valueOf(c2);
                                objArr3[0] = Integer.valueOf(c3);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.getOffsetAfter("", 0) + 3225, TextUtils.getCapsMode("", 0, 0) + 13, 2133916302, false, $$c(b4, b5, (byte) (b5 | 21)), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            } else {
                                int i13 = setvideostabilizationmode.b;
                                Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b6 = (byte) 0;
                                    byte b7 = b6;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (29944 - Gravity.getAbsoluteGravity(0, 0)), 1754 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getWindowTouchSlop() >> 8) + 23, 387247676, false, $$c(b6, b7, (byte) (b7 | 19)), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr4)).charValue();
                            }
                        } else if (bArr[setvideostabilizationmode.b] == 0) {
                            c = 1;
                            int i14 = setvideostabilizationmode.b;
                            char c4 = cArr3[setvideostabilizationmode.b];
                            try {
                                Object[] objArr5 = new Object[2];
                                objArr5[c] = Integer.valueOf(c2);
                                objArr5[0] = Integer.valueOf(c4);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b8 = (byte) 0;
                                    byte b9 = b8;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.getOffsetAfter("", 0) + 3225, TextUtils.getCapsMode("", 0, 0) + 13, 2133916302, false, $$c(b8, b9, (byte) (b9 | 21)), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).charValue();
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            int i15 = setvideostabilizationmode.b;
                            Object[] objArr6 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b10 = (byte) 0;
                                byte b11 = b10;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (29944 - Gravity.getAbsoluteGravity(0, 0)), 1754 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getWindowTouchSlop() >> 8) + 23, 387247676, false, $$c(b10, b11, (byte) (b11 | 19)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr6)).charValue();
                        }
                        c2 = cArr4[setvideostabilizationmode.b];
                        Object[] objArr7 = {setvideostabilizationmode, setvideostabilizationmode};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b12 = (byte) 0;
                            byte b13 = b12;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 41242), 1704 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 21, -1434471773, false, $$c(b12, b13, (byte) (b13 | 15)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr7);
                    }
                    cArr3 = cArr4;
                }
                if (i7 > 0) {
                    int i16 = $11 + 15;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                    char[] cArr5 = new char[i5];
                    System.arraycopy(cArr3, 0, cArr5, 0, i5);
                    int i18 = i5 - i7;
                    System.arraycopy(cArr5, 0, cArr3, i18, i7);
                    System.arraycopy(cArr5, i7, cArr3, 0, i18);
                }
                if (z) {
                    int i19 = $10 + 93;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    char[] cArr6 = new char[i5];
                    int i21 = 0;
                    while (true) {
                        setvideostabilizationmode.b = i21;
                        if (setvideostabilizationmode.b >= i5) {
                            break;
                        }
                        cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                        i21 = setvideostabilizationmode.b + 1;
                    }
                    cArr3 = cArr6;
                }
                if (i6 > 0) {
                    int i22 = $11 + 93;
                    $10 = i22 % 128;
                    int i23 = i22 % 2;
                    int i24 = 0;
                    while (true) {
                        setvideostabilizationmode.b = i24;
                        if (setvideostabilizationmode.b >= i5) {
                            break;
                        }
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                        i24 = setvideostabilizationmode.b + 1;
                    }
                }
                objArr[0] = new String(cArr3);
            }

            private Companion() {
            }

            @JvmStatic
            public static INotificationSideChannelDefault TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
                MediaBrowserCompat mediaBrowserCompatTuitionPaymentFragmentbindingInflater1;
                JsonObject asJsonObject;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("position");
                    INotificationSideChannelStubProxy iNotificationSideChannelStubProxyTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    if (jsonElement == null || (asJsonObject = jsonElement.getAsJsonObject()) == null) {
                        mediaBrowserCompatTuitionPaymentFragmentbindingInflater1 = null;
                    } else {
                        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
                        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                        if (i2 % 2 != 0) {
                            MediaBrowserCompat.Companion companion = MediaBrowserCompat.INSTANCE;
                            mediaBrowserCompatTuitionPaymentFragmentbindingInflater1 = MediaBrowserCompat.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject);
                            int i3 = 89 / 0;
                        } else {
                            MediaBrowserCompat.Companion companion2 = MediaBrowserCompat.INSTANCE;
                            mediaBrowserCompatTuitionPaymentFragmentbindingInflater1 = MediaBrowserCompat.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject);
                        }
                    }
                    JsonElement jsonElement2 = p0.get(TypedValues.AttributesType.S_TARGET);
                    if (jsonElement2 != null) {
                        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
                        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                        if (i4 % 2 != 0) {
                            jsonElement2.getAsJsonObject();
                            throw null;
                        }
                        JsonObject asJsonObject2 = jsonElement2.getAsJsonObject();
                        if (asJsonObject2 != null) {
                            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
                            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                            int i6 = i5 % 2;
                            INotificationSideChannelStubProxy.Companion companion3 = INotificationSideChannelStubProxy.INSTANCE;
                            iNotificationSideChannelStubProxyTuitionPaymentFragmentspecialinlinedviewModeldefault1 = INotificationSideChannelStubProxy.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject2);
                        }
                    }
                    return new INotificationSideChannelDefault(mediaBrowserCompatTuitionPaymentFragmentbindingInflater1, iNotificationSideChannelStubProxyTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type DdAction", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type DdAction", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type DdAction", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r25v0 */
            /* JADX WARN: Type inference failed for: r4v0 */
            /* JADX WARN: Type inference failed for: r4v1 */
            /* JADX WARN: Type inference failed for: r4v126, types: [int] */
            /* JADX WARN: Type inference failed for: r4v141 */
            /* JADX WARN: Type inference failed for: r4v2, types: [int] */
            /* JADX WARN: Type inference failed for: r4v262 */
            /* JADX WARN: Type inference failed for: r4v291 */
            /* JADX WARN: Type inference failed for: r4v292 */
            /* JADX WARN: Type inference failed for: r4v293 */
            /* JADX WARN: Type inference failed for: r4v294 */
            /* JADX WARN: Type inference failed for: r4v39 */
            /* JADX WARN: Type inference failed for: r4v4 */
            /* JADX WARN: Type inference failed for: r4v45, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r4v46 */
            /* JADX WARN: Type inference failed for: r4v60, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r4v68 */
            /* JADX WARN: Type inference failed for: r4v94 */
            /* JADX WARN: Type inference failed for: r4v95, types: [java.io.ByteArrayInputStream, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v98 */
            /* JADX WARN: Type inference failed for: r5v26 */
            /* JADX WARN: Type inference failed for: r7v8 */
            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.content.Context r28, int r29, int r30) {
                /*
                    Method dump skipped, instruction units count: 4171
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.ActionEvent.INotificationSideChannelDefault.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.content.Context, int, int):java.lang.Object[]");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0022  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$c(short r5, byte r6, int r7) {
                /*
                    int r5 = r5 * 3
                    int r0 = r5 + 1
                    int r7 = 120 - r7
                    int r6 = r6 * 2
                    int r6 = r6 + 4
                    byte[] r1 = com.datadog.android.rum.model.ActionEvent.INotificationSideChannelDefault.Companion.$$a
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L14
                    r3 = r6
                    r4 = r2
                    goto L24
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r5) goto L22
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    return r5
                L22:
                    r3 = r1[r6]
                L24:
                    int r6 = r6 + 1
                    int r3 = -r3
                    int r7 = r7 + r3
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.ActionEvent.INotificationSideChannelDefault.Companion.$$c(short, byte, int):java.lang.String");
            }
        }

        public INotificationSideChannelDefault(MediaBrowserCompat mediaBrowserCompat, INotificationSideChannelStubProxy iNotificationSideChannelStubProxy) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mediaBrowserCompat;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iNotificationSideChannelStubProxy;
        }

        public /* synthetic */ INotificationSideChannelDefault(MediaBrowserCompat mediaBrowserCompat, INotificationSideChannelStubProxy iNotificationSideChannelStubProxy, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : mediaBrowserCompat, (i & 2) != 0 ? null : iNotificationSideChannelStubProxy);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public INotificationSideChannelDefault() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof INotificationSideChannelDefault)) {
                return false;
            }
            INotificationSideChannelDefault iNotificationSideChannelDefault = (INotificationSideChannelDefault) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, iNotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, iNotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            MediaBrowserCompat mediaBrowserCompat = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode = mediaBrowserCompat == null ? 0 : mediaBrowserCompat.hashCode();
            INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return (iHashCode * 31) + (iNotificationSideChannelStubProxy != null ? iNotificationSideChannelStubProxy.hashCode() : 0);
        }

        public final String toString() {
            MediaBrowserCompat mediaBrowserCompat = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("INotificationSideChannelDefault(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(mediaBrowserCompat);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(iNotificationSideChannelStubProxy);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$asInterface, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$asInterface;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static ActionEvent TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
            ActionEventSource actionEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            getRoot getrootTuitionPaymentFragmentbindingInflater1;
            a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            INotificationSideChannelStub iNotificationSideChannelStubTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            getNotifyChildrenChangedOptions getnotifychildrenchangedoptionsTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            asBinder asbinderB;
            write writeVarTuitionPaymentFragmentbindingInflater1;
            getInterfaceDescriptor getinterfacedescriptorTuitionPaymentFragmentbindingInflater1;
            onTransact ontransactTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            notify notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            JsonObject asJsonObject;
            JsonObject asJsonObject2;
            JsonObject asJsonObject3;
            JsonObject asJsonObject4;
            JsonObject asJsonObject5;
            JsonObject asJsonObject6;
            JsonObject asJsonObject7;
            JsonObject asJsonObject8;
            JsonObject asJsonObject9;
            String asString;
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                long asLong = p0.get("date").getAsLong();
                JsonObject asJsonObject10 = p0.get("application").getAsJsonObject();
                b.Companion companion = b.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject10, "");
                b bVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = b.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject10);
                JsonElement jsonElement = p0.get(NotificationCompat.CATEGORY_SERVICE);
                String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                JsonElement jsonElement2 = p0.get("version");
                String asString3 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                JsonElement jsonElement3 = p0.get("build_version");
                String asString4 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                JsonElement jsonElement4 = p0.get("build_id");
                String asString5 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                JsonObject asJsonObject11 = p0.get("session").getAsJsonObject();
                TuitionPaymentFragmentspecialinlinedviewModeldefault1.Companion companion2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject11, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1B = TuitionPaymentFragmentspecialinlinedviewModeldefault1.Companion.b(asJsonObject11);
                JsonElement jsonElement5 = p0.get("source");
                if (jsonElement5 == null || (asString = jsonElement5.getAsString()) == null) {
                    actionEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                } else {
                    ActionEventSource.Companion companion3 = ActionEventSource.INSTANCE;
                    actionEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ActionEventSource.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asString);
                }
                JsonObject asJsonObject12 = p0.get("view").getAsJsonObject();
                TuitionPaymentFragmentspecialinlinedviewModeldefault3.Companion companion4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject12, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject12);
                JsonElement jsonElement6 = p0.get("usr");
                if (jsonElement6 == null || (asJsonObject9 = jsonElement6.getAsJsonObject()) == null) {
                    getrootTuitionPaymentFragmentbindingInflater1 = null;
                } else {
                    getRoot.Companion companion5 = getRoot.INSTANCE;
                    getrootTuitionPaymentFragmentbindingInflater1 = getRoot.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject9);
                }
                JsonElement jsonElement7 = p0.get("connectivity");
                if (jsonElement7 == null || (asJsonObject8 = jsonElement7.getAsJsonObject()) == null) {
                    aVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                } else {
                    a.Companion companion6 = a.INSTANCE;
                    aVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = a.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject8);
                }
                JsonElement jsonElement8 = p0.get(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
                if (jsonElement8 == null || (asJsonObject7 = jsonElement8.getAsJsonObject()) == null) {
                    iNotificationSideChannelStubTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                } else {
                    INotificationSideChannelStub.Companion companion7 = INotificationSideChannelStub.INSTANCE;
                    iNotificationSideChannelStubTuitionPaymentFragmentspecialinlinedviewModeldefault1 = INotificationSideChannelStub.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject7);
                }
                JsonElement jsonElement9 = p0.get("synthetics");
                if (jsonElement9 == null || (asJsonObject6 = jsonElement9.getAsJsonObject()) == null) {
                    getnotifychildrenchangedoptionsTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                } else {
                    getNotifyChildrenChangedOptions.Companion companion8 = getNotifyChildrenChangedOptions.INSTANCE;
                    getnotifychildrenchangedoptionsTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getNotifyChildrenChangedOptions.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject6);
                }
                JsonElement jsonElement10 = p0.get("ci_test");
                if (jsonElement10 == null || (asJsonObject5 = jsonElement10.getAsJsonObject()) == null) {
                    asbinderB = null;
                } else {
                    asBinder.Companion companion9 = asBinder.INSTANCE;
                    asbinderB = asBinder.Companion.b(asJsonObject5);
                }
                JsonElement jsonElement11 = p0.get("os");
                if (jsonElement11 == null || (asJsonObject4 = jsonElement11.getAsJsonObject()) == null) {
                    writeVarTuitionPaymentFragmentbindingInflater1 = null;
                } else {
                    write.Companion companion10 = write.INSTANCE;
                    writeVarTuitionPaymentFragmentbindingInflater1 = write.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject4);
                }
                JsonElement jsonElement12 = p0.get("device");
                if (jsonElement12 == null || (asJsonObject3 = jsonElement12.getAsJsonObject()) == null) {
                    getinterfacedescriptorTuitionPaymentFragmentbindingInflater1 = null;
                } else {
                    getInterfaceDescriptor.Companion companion11 = getInterfaceDescriptor.INSTANCE;
                    getinterfacedescriptorTuitionPaymentFragmentbindingInflater1 = getInterfaceDescriptor.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject3);
                }
                JsonObject asJsonObject13 = p0.get("_dd").getAsJsonObject();
                cancelAll.Companion companion12 = cancelAll.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject13, "");
                cancelAll cancelallTuitionPaymentFragmentspecialinlinedviewModeldefault2 = cancelAll.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject13);
                JsonElement jsonElement13 = p0.get("context");
                if (jsonElement13 == null || (asJsonObject2 = jsonElement13.getAsJsonObject()) == null) {
                    ontransactTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                } else {
                    onTransact.Companion companion13 = onTransact.INSTANCE;
                    ontransactTuitionPaymentFragmentspecialinlinedviewModeldefault3 = onTransact.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject2);
                }
                JsonElement jsonElement14 = p0.get("container");
                if (jsonElement14 == null || (asJsonObject = jsonElement14.getAsJsonObject()) == null) {
                    notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                } else {
                    notify.Companion companion14 = notify.INSTANCE;
                    notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = notify.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject);
                }
                String asString6 = p0.get("type").getAsString();
                JsonObject asJsonObject14 = p0.get("action").getAsJsonObject();
                TuitionPaymentFragmentspecialinlinedviewModeldefault2.Companion companion15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject14, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject14);
                if (!Intrinsics.areEqual(asString6, "action")) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                return new ActionEvent(asLong, bVarTuitionPaymentFragmentspecialinlinedviewModeldefault3, asString2, asString3, asString4, asString5, tuitionPaymentFragmentspecialinlinedviewModeldefault1B, actionEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault3, TuitionPaymentFragmentspecialinlinedviewModeldefault3, getrootTuitionPaymentFragmentbindingInflater1, aVarTuitionPaymentFragmentspecialinlinedviewModeldefault2, iNotificationSideChannelStubTuitionPaymentFragmentspecialinlinedviewModeldefault1, getnotifychildrenchangedoptionsTuitionPaymentFragmentspecialinlinedviewModeldefault1, asbinderB, writeVarTuitionPaymentFragmentbindingInflater1, getinterfacedescriptorTuitionPaymentFragmentbindingInflater1, cancelallTuitionPaymentFragmentspecialinlinedviewModeldefault2, ontransactTuitionPaymentFragmentspecialinlinedviewModeldefault3, notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            } catch (IllegalStateException e2) {
                throw new JsonParseException("Unable to parse json into type ActionEvent", e2);
            } catch (NullPointerException e3) {
                throw new JsonParseException("Unable to parse json into type ActionEvent", e3);
            } catch (NumberFormatException e4) {
                throw new JsonParseException("Unable to parse json into type ActionEvent", e4);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$b;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public b(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((b) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("b(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$b$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$b$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$b;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$b;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static b TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("id").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new b(asString);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Application", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Application", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Application", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "", "p0", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSessionType;", "p1", "", "p2", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ActionEvent$ActionEventSessionType;Ljava/lang/Boolean;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/Boolean;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSessionType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final Boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final ActionEventSessionType TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, ActionEventSessionType actionEventSessionType, Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(actionEventSessionType, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = actionEventSessionType;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bool;
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, ActionEventSessionType actionEventSessionType, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, actionEventSessionType, (i & 4) != 0 ? null : bool);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TuitionPaymentFragmentspecialinlinedviewModeldefault1) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
            int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
            Boolean bool = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return (((iHashCode * 31) + iHashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            ActionEventSessionType actionEventSessionType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Boolean bool = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(actionEventSessionType);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentspecialinlinedviewModeldefault1 b(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("id").getAsString();
                    ActionEventSessionType.Companion companion = ActionEventSessionType.INSTANCE;
                    String asString2 = p0.get("type").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString2, "");
                    ActionEventSessionType actionEventSessionTypeB = ActionEventSessionType.Companion.b(asString2);
                    JsonElement jsonElement = p0.get("has_replay");
                    Boolean boolValueOf = jsonElement != null ? Boolean.valueOf(jsonElement.getAsBoolean()) : null;
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(asString, actionEventSessionTypeB, boolValueOf);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type ActionEventSession", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type ActionEventSession", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type ActionEventSession", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "", "p0", "p1", "p2", "p3", "", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "Ljava/lang/Boolean;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "a"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public String TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public final Boolean b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, String str2, String str3, String str4, Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str3;
            this.TuitionPaymentFragmentbindingInflater1 = str4;
            this.b = bool;
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, String str2, String str3, String str4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, tuitionPaymentFragmentspecialinlinedviewModeldefault3.b);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            int iHashCode3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            Boolean bool = this.b;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str4 = this.TuitionPaymentFragmentbindingInflater1;
            Boolean bool = this.b;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str3);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str4);
            sb.append(", b=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("id").getAsString();
                    JsonElement jsonElement = p0.get("referrer");
                    String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                    String asString3 = p0.get(ImagesContract.URL).getAsString();
                    JsonElement jsonElement2 = p0.get("name");
                    String asString4 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    JsonElement jsonElement3 = p0.get("in_foreground");
                    Boolean boolValueOf = jsonElement3 != null ? Boolean.valueOf(jsonElement3.getAsBoolean()) : null;
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    Intrinsics.checkNotNullExpressionValue(asString3, "");
                    return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(asString, asString2, asString3, asString4, boolValueOf);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type ActionEventView", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type ActionEventView", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type ActionEventView", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$getRoot;", "", "", "p0", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/Map;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getRoot {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final String[] b = {"id", "name", "email"};

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final Map<String, Object> b;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;

        public getRoot(String str, String str2, String str3, Map<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            this.TuitionPaymentFragmentbindingInflater1 = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str3;
            this.b = map;
        }

        public /* synthetic */ getRoot(String str, String str2, String str3, LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? new LinkedHashMap() : linkedHashMap);
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$getRoot$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$getRoot$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$getRoot;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$getRoot;", "", "", "b", "[Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static getRoot TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("id");
                    String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = p0.get("name");
                    String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    JsonElement jsonElement3 = p0.get("email");
                    String asString3 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, JsonElement> entry : p0.entrySet()) {
                        if (!ArraysKt.contains(getRoot.b, entry.getKey())) {
                            String key = entry.getKey();
                            Intrinsics.checkNotNullExpressionValue(key, "");
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    return new getRoot(asString, asString2, asString3, linkedHashMap);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Usr", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Usr", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Usr", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public static /* synthetic */ getRoot TuitionPaymentFragmentspecialinlinedviewModeldefault3(getRoot getroot, Map map) {
            String str = getroot.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str2 = getroot.TuitionPaymentFragmentbindingInflater1;
            String str3 = getroot.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Intrinsics.checkNotNullParameter(map, "");
            return new getRoot(str, str2, str3, map);
        }

        public getRoot() {
            this(null, null, null, null, 15, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof getRoot)) {
                return false;
            }
            getRoot getroot = (getRoot) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, getroot.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, getroot.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getroot.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, getroot.b);
        }

        public final int hashCode() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.b.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Map<String, Object> map = this.b;
            StringBuilder sb = new StringBuilder("getRoot(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str3);
            sb.append(", b=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$a;", "", "Lcom/datadog/android/rum/model/ActionEvent$Status;", "p0", "", "Lcom/datadog/android/rum/model/ActionEvent$Interface;", "p1", "Lcom/datadog/android/rum/model/ActionEvent$EffectiveType;", "p2", "Lcom/datadog/android/rum/model/ActionEvent$d;", "p3", "<init>", "(Lcom/datadog/android/rum/model/ActionEvent$Status;Ljava/util/List;Lcom/datadog/android/rum/model/ActionEvent$EffectiveType;Lcom/datadog/android/rum/model/ActionEvent$d;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Lcom/datadog/android/rum/model/ActionEvent$d;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/rum/model/ActionEvent$EffectiveType;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/rum/model/ActionEvent$Status;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final Status TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final List<Interface> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final EffectiveType TuitionPaymentFragmentbindingInflater1;
        public final d b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Status status, List<? extends Interface> list, EffectiveType effectiveType, d dVar) {
            Intrinsics.checkNotNullParameter(status, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = status;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
            this.TuitionPaymentFragmentbindingInflater1 = effectiveType;
            this.b = dVar;
        }

        public /* synthetic */ a(Status status, List list, EffectiveType effectiveType, d dVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(status, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : effectiveType, (i & 8) != 0 ? null : dVar);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof a)) {
                return false;
            }
            a aVar = (a) p0;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && this.TuitionPaymentFragmentbindingInflater1 == aVar.TuitionPaymentFragmentbindingInflater1 && Intrinsics.areEqual(this.b, aVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
            List<Interface> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            EffectiveType effectiveType = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode3 = effectiveType == null ? 0 : effectiveType.hashCode();
            d dVar = this.b;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (dVar != null ? dVar.hashCode() : 0);
        }

        public final String toString() {
            Status status = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            List<Interface> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            EffectiveType effectiveType = this.TuitionPaymentFragmentbindingInflater1;
            d dVar = this.b;
            StringBuilder sb = new StringBuilder("a(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(status);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(list);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(effectiveType);
            sb.append(", b=");
            sb.append(dVar);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$a$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$a$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$a;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$a;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static a TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                ArrayList arrayList;
                EffectiveType effectiveTypeTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                JsonObject asJsonObject;
                String asString;
                JsonArray asJsonArray;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    Status.Companion companion = Status.INSTANCE;
                    String asString2 = p0.get(NotificationCompat.CATEGORY_STATUS).getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString2, "");
                    Status statusTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Status.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asString2);
                    JsonElement jsonElement = p0.get("interfaces");
                    d dVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    if (jsonElement == null || (asJsonArray = jsonElement.getAsJsonArray()) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(asJsonArray.size());
                        for (JsonElement jsonElement2 : asJsonArray) {
                            Interface.Companion companion2 = Interface.INSTANCE;
                            String asString3 = jsonElement2.getAsString();
                            Intrinsics.checkNotNullExpressionValue(asString3, "");
                            arrayList.add(Interface.Companion.TuitionPaymentFragmentbindingInflater1(asString3));
                        }
                    }
                    JsonElement jsonElement3 = p0.get("effective_type");
                    if (jsonElement3 == null || (asString = jsonElement3.getAsString()) == null) {
                        effectiveTypeTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    } else {
                        EffectiveType.Companion companion3 = EffectiveType.INSTANCE;
                        effectiveTypeTuitionPaymentFragmentspecialinlinedviewModeldefault1 = EffectiveType.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asString);
                    }
                    JsonElement jsonElement4 = p0.get("cellular");
                    if (jsonElement4 != null && (asJsonObject = jsonElement4.getAsJsonObject()) != null) {
                        d.Companion companion4 = d.INSTANCE;
                        dVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = d.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject);
                    }
                    return new a(statusTuitionPaymentFragmentspecialinlinedviewModeldefault2, arrayList, effectiveTypeTuitionPaymentFragmentspecialinlinedviewModeldefault1, dVarTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Connectivity", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Connectivity", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Connectivity", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannelStub;", "", "Lcom/datadog/android/rum/model/ActionEvent$getExtras;", "p0", "<init>", "(Lcom/datadog/android/rum/model/ActionEvent$getExtras;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/rum/model/ActionEvent$getExtras;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannelStub {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final getExtras b;

        public INotificationSideChannelStub(getExtras getextras) {
            this.b = getextras;
        }

        public /* synthetic */ INotificationSideChannelStub(getExtras getextras, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : getextras);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public INotificationSideChannelStub() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof INotificationSideChannelStub) && Intrinsics.areEqual(this.b, ((INotificationSideChannelStub) p0).b);
        }

        public final int hashCode() {
            getExtras getextras = this.b;
            if (getextras == null) {
                return 0;
            }
            return getextras.hashCode();
        }

        public final String toString() {
            getExtras getextras = this.b;
            StringBuilder sb = new StringBuilder("INotificationSideChannelStub(b=");
            sb.append(getextras);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$INotificationSideChannelStub$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannelStub$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannelStub;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannelStub;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static INotificationSideChannelStub TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                getExtras getextrasB;
                JsonObject asJsonObject;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("viewport");
                    if (jsonElement == null || (asJsonObject = jsonElement.getAsJsonObject()) == null) {
                        getextrasB = null;
                    } else {
                        getExtras.Companion companion = getExtras.INSTANCE;
                        getextrasB = getExtras.Companion.b(asJsonObject);
                    }
                    return new INotificationSideChannelStub(getextrasB);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Display", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Display", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Display", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$getNotifyChildrenChangedOptions;", "", "", "p0", "p1", "", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/Boolean;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getNotifyChildrenChangedOptions {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final String b;
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final Boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public getNotifyChildrenChangedOptions(String str, String str2, Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.b = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bool;
        }

        public /* synthetic */ getNotifyChildrenChangedOptions(String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : bool);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof getNotifyChildrenChangedOptions)) {
                return false;
            }
            getNotifyChildrenChangedOptions getnotifychildrenchangedoptions = (getNotifyChildrenChangedOptions) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getnotifychildrenchangedoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.b, getnotifychildrenchangedoptions.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getnotifychildrenchangedoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
            int iHashCode2 = this.b.hashCode();
            Boolean bool = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return (((iHashCode * 31) + iHashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str2 = this.b;
            Boolean bool = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("getNotifyChildrenChangedOptions(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(", b=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$getNotifyChildrenChangedOptions$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$getNotifyChildrenChangedOptions$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$getNotifyChildrenChangedOptions;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$getNotifyChildrenChangedOptions;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static getNotifyChildrenChangedOptions TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("test_id").getAsString();
                    String asString2 = p0.get("result_id").getAsString();
                    JsonElement jsonElement = p0.get("injected");
                    Boolean boolValueOf = jsonElement != null ? Boolean.valueOf(jsonElement.getAsBoolean()) : null;
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    Intrinsics.checkNotNullExpressionValue(asString2, "");
                    return new getNotifyChildrenChangedOptions(asString, asString2, boolValueOf);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Synthetics", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Synthetics", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Synthetics", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$asBinder;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class asBinder {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public asBinder(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof asBinder) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((asBinder) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("asBinder(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$asBinder$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$asBinder$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$asBinder;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$asBinder;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static asBinder b(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("test_execution_id").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new asBinder(asString);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type CiTest", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type CiTest", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type CiTest", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$write;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class write {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public write(String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.b = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
            this.TuitionPaymentFragmentbindingInflater1 = str3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str4;
        }

        public /* synthetic */ write(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, str4);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof write)) {
                return false;
            }
            write writeVar = (write) p0;
            return Intrinsics.areEqual(this.b, writeVar.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, writeVar.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode();
            int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
            String str = this.TuitionPaymentFragmentbindingInflater1;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            String str = this.b;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str3 = this.TuitionPaymentFragmentbindingInflater1;
            String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("write(b=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str3);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$write$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$write$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$write;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$write;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static write TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("name").getAsString();
                    String asString2 = p0.get("version").getAsString();
                    JsonElement jsonElement = p0.get("build");
                    String asString3 = jsonElement != null ? jsonElement.getAsString() : null;
                    String asString4 = p0.get("version_major").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    Intrinsics.checkNotNullExpressionValue(asString2, "");
                    Intrinsics.checkNotNullExpressionValue(asString4, "");
                    return new write(asString, asString2, asString3, asString4);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Os", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Os", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Os", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$getInterfaceDescriptor;", "", "Lcom/datadog/android/rum/model/ActionEvent$DeviceType;", "p0", "", "p1", "p2", "p3", "p4", "<init>", "(Lcom/datadog/android/rum/model/ActionEvent$DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "b", "asBinder", "Lcom/datadog/android/rum/model/ActionEvent$DeviceType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getInterfaceDescriptor {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
        public final DeviceType TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public final String b;

        public getInterfaceDescriptor(DeviceType deviceType, String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(deviceType, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = deviceType;
            this.b = str;
            this.TuitionPaymentFragmentbindingInflater1 = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str4;
        }

        public /* synthetic */ getInterfaceDescriptor(DeviceType deviceType, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(deviceType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof getInterfaceDescriptor)) {
                return false;
            }
            getInterfaceDescriptor getinterfacedescriptor = (getInterfaceDescriptor) p0;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == getinterfacedescriptor.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && Intrinsics.areEqual(this.b, getinterfacedescriptor.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, getinterfacedescriptor.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getinterfacedescriptor.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getinterfacedescriptor.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
            String str = this.b;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            DeviceType deviceType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str = this.b;
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("getInterfaceDescriptor(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(deviceType);
            sb.append(", b=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str3);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$getInterfaceDescriptor$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$getInterfaceDescriptor$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$getInterfaceDescriptor;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$getInterfaceDescriptor;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static getInterfaceDescriptor TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    DeviceType.Companion companion = DeviceType.INSTANCE;
                    String asString = p0.get("type").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    DeviceType deviceTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DeviceType.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asString);
                    JsonElement jsonElement = p0.get("name");
                    String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = p0.get("model");
                    String asString3 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    JsonElement jsonElement3 = p0.get("brand");
                    String asString4 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    JsonElement jsonElement4 = p0.get("architecture");
                    return new getInterfaceDescriptor(deviceTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3, asString2, asString3, asString4, jsonElement4 != null ? jsonElement4.getAsString() : null);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Device", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Device", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Device", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u001b8\u0006X\u0086D¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$cancelAll;", "", "Lcom/datadog/android/rum/model/ActionEvent$RemoteActionCompatParcelizer;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$g;", "p1", "", "p2", "Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannelDefault;", "p3", "<init>", "(Lcom/datadog/android/rum/model/ActionEvent$RemoteActionCompatParcelizer;Lcom/datadog/android/rum/model/ActionEvent$g;Ljava/lang/String;Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannelDefault;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannelDefault;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "b", "Lcom/datadog/android/rum/model/ActionEvent$g;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "J", "a", "Lcom/datadog/android/rum/model/ActionEvent$RemoteActionCompatParcelizer;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class cancelAll {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final long b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final INotificationSideChannelDefault TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final RemoteActionCompatParcelizer TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final g TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public cancelAll(RemoteActionCompatParcelizer remoteActionCompatParcelizer, g gVar, String str, INotificationSideChannelDefault iNotificationSideChannelDefault) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = remoteActionCompatParcelizer;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = gVar;
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iNotificationSideChannelDefault;
            this.b = 2L;
        }

        public /* synthetic */ cancelAll(RemoteActionCompatParcelizer remoteActionCompatParcelizer, g gVar, String str, INotificationSideChannelDefault iNotificationSideChannelDefault, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : remoteActionCompatParcelizer, (i & 2) != 0 ? null : gVar, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : iNotificationSideChannelDefault);
        }

        public cancelAll() {
            this(null, null, null, null, 15, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof cancelAll)) {
                return false;
            }
            cancelAll cancelall = (cancelAll) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, cancelall.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, cancelall.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, cancelall.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, cancelall.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode = remoteActionCompatParcelizer == null ? 0 : remoteActionCompatParcelizer.hashCode();
            g gVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode2 = gVar == null ? 0 : gVar.hashCode();
            String str = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            INotificationSideChannelDefault iNotificationSideChannelDefault = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (iNotificationSideChannelDefault != null ? iNotificationSideChannelDefault.hashCode() : 0);
        }

        public final String toString() {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            g gVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str = this.TuitionPaymentFragmentbindingInflater1;
            INotificationSideChannelDefault iNotificationSideChannelDefault = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("cancelAll(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(remoteActionCompatParcelizer);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(gVar);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(iNotificationSideChannelDefault);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$cancelAll$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$cancelAll$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$cancelAll;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$cancelAll;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static cancelAll TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                RemoteActionCompatParcelizer remoteActionCompatParcelizerTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                g gVarB;
                JsonObject asJsonObject;
                JsonObject asJsonObject2;
                JsonObject asJsonObject3;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    long asLong = p0.get("format_version").getAsLong();
                    JsonElement jsonElement = p0.get("session");
                    INotificationSideChannelDefault iNotificationSideChannelDefaultTuitionPaymentFragmentbindingInflater1 = null;
                    if (jsonElement == null || (asJsonObject3 = jsonElement.getAsJsonObject()) == null) {
                        remoteActionCompatParcelizerTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    } else {
                        RemoteActionCompatParcelizer.Companion companion = RemoteActionCompatParcelizer.INSTANCE;
                        remoteActionCompatParcelizerTuitionPaymentFragmentspecialinlinedviewModeldefault1 = RemoteActionCompatParcelizer.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject3);
                    }
                    JsonElement jsonElement2 = p0.get("configuration");
                    if (jsonElement2 == null || (asJsonObject2 = jsonElement2.getAsJsonObject()) == null) {
                        gVarB = null;
                    } else {
                        g.Companion companion2 = g.INSTANCE;
                        gVarB = g.Companion.b(asJsonObject2);
                    }
                    JsonElement jsonElement3 = p0.get("browser_sdk_version");
                    String asString = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    JsonElement jsonElement4 = p0.get("action");
                    if (jsonElement4 != null && (asJsonObject = jsonElement4.getAsJsonObject()) != null) {
                        INotificationSideChannelDefault.Companion companion3 = INotificationSideChannelDefault.INSTANCE;
                        iNotificationSideChannelDefaultTuitionPaymentFragmentbindingInflater1 = INotificationSideChannelDefault.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject);
                    }
                    if (asLong != 2) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    return new cancelAll(remoteActionCompatParcelizerTuitionPaymentFragmentspecialinlinedviewModeldefault1, gVarB, asString, iNotificationSideChannelDefaultTuitionPaymentFragmentbindingInflater1);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Dd", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Dd", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Dd", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u0007\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$onTransact;", "", "", "", "p0", "<init>", "(Ljava/util/Map;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/util/Map;)Lcom/datadog/android/rum/model/ActionEvent$onTransact;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class onTransact {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final Map<String, Object> b;

        public onTransact(Map<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.b = map;
        }

        public /* synthetic */ onTransact(LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new LinkedHashMap() : linkedHashMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public onTransact() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static onTransact TuitionPaymentFragmentspecialinlinedviewModeldefault3(Map<String, Object> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new onTransact(p0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof onTransact) && Intrinsics.areEqual(this.b, ((onTransact) p0).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            Map<String, Object> map = this.b;
            StringBuilder sb = new StringBuilder("onTransact(b=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$onTransact$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$onTransact$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$onTransact;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$onTransact;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static onTransact TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, JsonElement> entry : p0.entrySet()) {
                        String key = entry.getKey();
                        Intrinsics.checkNotNullExpressionValue(key, "");
                        linkedHashMap.put(key, entry.getValue());
                    }
                    return new onTransact(linkedHashMap);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Context", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Context", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Context", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public static /* synthetic */ ActionEvent TuitionPaymentFragmentbindingInflater1(ActionEvent actionEvent, getRoot getroot, onTransact ontransact) {
        long j = actionEvent.asBinder;
        b bVar = actionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str = actionEvent.onTransact;
        String str2 = actionEvent.RemoteActionCompatParcelizer;
        String str3 = actionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str4 = actionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = actionEvent.cancel;
        ActionEventSource actionEventSource = actionEvent.getInterfaceDescriptor;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = actionEvent.connect;
        a aVar = actionEvent.asInterface;
        INotificationSideChannelStub iNotificationSideChannelStub = actionEvent.notify;
        getNotifyChildrenChangedOptions getnotifychildrenchangedoptions = actionEvent.INotificationSideChannelDefault;
        asBinder asbinder = actionEvent.b;
        write writeVar = actionEvent.cancelAll;
        getInterfaceDescriptor getinterfacedescriptor = actionEvent.INotificationSideChannel;
        cancelAll cancelall = actionEvent.d;
        notify notifyVar = actionEvent.a;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = actionEvent.TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNullParameter(bVar, "");
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        Intrinsics.checkNotNullParameter(cancelall, "");
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        return new ActionEvent(j, bVar, str, str2, str3, str4, tuitionPaymentFragmentspecialinlinedviewModeldefault1, actionEventSource, tuitionPaymentFragmentspecialinlinedviewModeldefault3, getroot, aVar, iNotificationSideChannelStub, getnotifychildrenchangedoptions, asbinder, writeVar, getinterfacedescriptor, cancelall, ontransact, notifyVar, tuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ActionEvent)) {
            return false;
        }
        ActionEvent actionEvent = (ActionEvent) p0;
        return this.asBinder == actionEvent.asBinder && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, actionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.onTransact, actionEvent.onTransact) && Intrinsics.areEqual(this.RemoteActionCompatParcelizer, actionEvent.RemoteActionCompatParcelizer) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, actionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, actionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.cancel, actionEvent.cancel) && this.getInterfaceDescriptor == actionEvent.getInterfaceDescriptor && Intrinsics.areEqual(this.connect, actionEvent.connect) && Intrinsics.areEqual(this.INotificationSideChannelStub, actionEvent.INotificationSideChannelStub) && Intrinsics.areEqual(this.asInterface, actionEvent.asInterface) && Intrinsics.areEqual(this.notify, actionEvent.notify) && Intrinsics.areEqual(this.INotificationSideChannelDefault, actionEvent.INotificationSideChannelDefault) && Intrinsics.areEqual(this.b, actionEvent.b) && Intrinsics.areEqual(this.cancelAll, actionEvent.cancelAll) && Intrinsics.areEqual(this.INotificationSideChannel, actionEvent.INotificationSideChannel) && Intrinsics.areEqual(this.d, actionEvent.d) && Intrinsics.areEqual(this.g, actionEvent.g) && Intrinsics.areEqual(this.a, actionEvent.a) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, actionEvent.TuitionPaymentFragmentbindingInflater1);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.asBinder);
        int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        String str = this.onTransact;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.RemoteActionCompatParcelizer;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        int iHashCode7 = this.cancel.hashCode();
        ActionEventSource actionEventSource = this.getInterfaceDescriptor;
        int iHashCode8 = actionEventSource == null ? 0 : actionEventSource.hashCode();
        int iHashCode9 = this.connect.hashCode();
        getRoot getroot = this.INotificationSideChannelStub;
        int iHashCode10 = getroot == null ? 0 : getroot.hashCode();
        a aVar = this.asInterface;
        int iHashCode11 = aVar == null ? 0 : aVar.hashCode();
        INotificationSideChannelStub iNotificationSideChannelStub = this.notify;
        int iHashCode12 = iNotificationSideChannelStub == null ? 0 : iNotificationSideChannelStub.hashCode();
        getNotifyChildrenChangedOptions getnotifychildrenchangedoptions = this.INotificationSideChannelDefault;
        int iHashCode13 = getnotifychildrenchangedoptions == null ? 0 : getnotifychildrenchangedoptions.hashCode();
        asBinder asbinder = this.b;
        int iHashCode14 = asbinder == null ? 0 : asbinder.hashCode();
        write writeVar = this.cancelAll;
        int iHashCode15 = writeVar == null ? 0 : writeVar.hashCode();
        getInterfaceDescriptor getinterfacedescriptor = this.INotificationSideChannel;
        int iHashCode16 = getinterfacedescriptor == null ? 0 : getinterfacedescriptor.hashCode();
        int iHashCode17 = this.d.hashCode();
        onTransact ontransact = this.g;
        int iHashCode18 = ontransact == null ? 0 : ontransact.hashCode();
        notify notifyVar = this.a;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (notifyVar != null ? notifyVar.hashCode() : 0)) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode();
    }

    public final String toString() {
        long j = this.asBinder;
        b bVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str = this.onTransact;
        String str2 = this.RemoteActionCompatParcelizer;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.cancel;
        ActionEventSource actionEventSource = this.getInterfaceDescriptor;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.connect;
        getRoot getroot = this.INotificationSideChannelStub;
        a aVar = this.asInterface;
        INotificationSideChannelStub iNotificationSideChannelStub = this.notify;
        getNotifyChildrenChangedOptions getnotifychildrenchangedoptions = this.INotificationSideChannelDefault;
        asBinder asbinder = this.b;
        write writeVar = this.cancelAll;
        getInterfaceDescriptor getinterfacedescriptor = this.INotificationSideChannel;
        cancelAll cancelall = this.d;
        onTransact ontransact = this.g;
        notify notifyVar = this.a;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentbindingInflater1;
        StringBuilder sb = new StringBuilder("ActionEvent(asBinder=");
        sb.append(j);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(bVar);
        sb.append(", onTransact=");
        sb.append(str);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str4);
        sb.append(", cancel=");
        sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", getInterfaceDescriptor=");
        sb.append(actionEventSource);
        sb.append(", connect=");
        sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", INotificationSideChannelStub=");
        sb.append(getroot);
        sb.append(", asInterface=");
        sb.append(aVar);
        sb.append(", notify=");
        sb.append(iNotificationSideChannelStub);
        sb.append(", INotificationSideChannelDefault=");
        sb.append(getnotifychildrenchangedoptions);
        sb.append(", b=");
        sb.append(asbinder);
        sb.append(", cancelAll=");
        sb.append(writeVar);
        sb.append(", INotificationSideChannel=");
        sb.append(getinterfacedescriptor);
        sb.append(", d=");
        sb.append(cancelall);
        sb.append(", g=");
        sb.append(ontransact);
        sb.append(", a=");
        sb.append(notifyVar);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$notify;", "", "Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannel;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;", "p1", "<init>", "(Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannel;Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannel;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class notify {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final INotificationSideChannel TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final ActionEventSource TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public notify(INotificationSideChannel iNotificationSideChannel, ActionEventSource actionEventSource) {
            Intrinsics.checkNotNullParameter(iNotificationSideChannel, "");
            Intrinsics.checkNotNullParameter(actionEventSource, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iNotificationSideChannel;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = actionEventSource;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof notify)) {
                return false;
            }
            notify notifyVar = (notify) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, notifyVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == notifyVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            INotificationSideChannel iNotificationSideChannel = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            ActionEventSource actionEventSource = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("notify(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(iNotificationSideChannel);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(actionEventSource);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$notify$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$notify$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$notify;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$notify;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static notify TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonObject asJsonObject = p0.get("view").getAsJsonObject();
                    INotificationSideChannel.Companion companion = INotificationSideChannel.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    INotificationSideChannel iNotificationSideChannelTuitionPaymentFragmentspecialinlinedviewModeldefault2 = INotificationSideChannel.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject);
                    ActionEventSource.Companion companion2 = ActionEventSource.INSTANCE;
                    String asString = p0.get("source").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new notify(iNotificationSideChannelTuitionPaymentFragmentspecialinlinedviewModeldefault2, ActionEventSource.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asString));
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Container", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Container", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Container", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001%Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0013\u0010 \u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u0006\n\u0004\b!\u0010\"R\u0013\u0010%\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\u0006\n\u0004\b#\u0010$R\u0013\u0010#\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b \u0010&R\u0013\u0010!\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u0006\n\u0004\b'\u0010(R\u0013\u0010)\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u0006\n\u0004\b)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0006\n\u0004\b+\u0010,R\u0013\u0010-\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u00100"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "p0", "", "p1", "", "p2", "Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentbindingInflater1;", "p3", "Lcom/datadog/android/rum/model/ActionEvent$read;", "p4", "Lcom/datadog/android/rum/model/ActionEvent$IconCompatParcelizer;", "p5", "Lcom/datadog/android/rum/model/ActionEvent$cancel;", "p6", "Lcom/datadog/android/rum/model/ActionEvent$connect;", "p7", "Lcom/datadog/android/rum/model/ActionEvent$disconnect;", "p8", "<init>", "(Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;Ljava/lang/String;Ljava/lang/Long;Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentbindingInflater1;Lcom/datadog/android/rum/model/ActionEvent$read;Lcom/datadog/android/rum/model/ActionEvent$IconCompatParcelizer;Lcom/datadog/android/rum/model/ActionEvent$cancel;Lcom/datadog/android/rum/model/ActionEvent$connect;Lcom/datadog/android/rum/model/ActionEvent$disconnect;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/rum/model/ActionEvent$cancel;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/rum/model/ActionEvent$IconCompatParcelizer;", "b", "Lcom/datadog/android/rum/model/ActionEvent$read;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "a", "Ljava/lang/Long;", "d", "Lcom/datadog/android/rum/model/ActionEvent$connect;", "g", "Lcom/datadog/android/rum/model/ActionEvent$disconnect;", "asInterface", "Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentbindingInflater1;", "asBinder", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final IconCompatParcelizer TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final cancel TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public final ActionEventActionType asBinder;
        public final TuitionPaymentFragmentbindingInflater1 asInterface;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final read TuitionPaymentFragmentbindingInflater1;
        public final connect d;
        public final disconnect g;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActionEventActionType actionEventActionType, String str, Long l, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, read readVar, IconCompatParcelizer iconCompatParcelizer, cancel cancelVar, connect connectVar, disconnect disconnectVar) {
            Intrinsics.checkNotNullParameter(actionEventActionType, "");
            this.asBinder = actionEventActionType;
            this.b = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = l;
            this.asInterface = tuitionPaymentFragmentbindingInflater1;
            this.TuitionPaymentFragmentbindingInflater1 = readVar;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iconCompatParcelizer;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cancelVar;
            this.d = connectVar;
            this.g = disconnectVar;
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActionEventActionType actionEventActionType, String str, Long l, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, read readVar, IconCompatParcelizer iconCompatParcelizer, cancel cancelVar, connect connectVar, disconnect disconnectVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(actionEventActionType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : tuitionPaymentFragmentbindingInflater1, (i & 16) != 0 ? null : readVar, (i & 32) != 0 ? null : iconCompatParcelizer, (i & 64) != 0 ? null : cancelVar, (i & 128) != 0 ? null : connectVar, (i & 256) == 0 ? disconnectVar : null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TuitionPaymentFragmentspecialinlinedviewModeldefault2) p0;
            return this.asBinder == tuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder && Intrinsics.areEqual(this.b, tuitionPaymentFragmentspecialinlinedviewModeldefault2.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.asInterface, tuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.d, tuitionPaymentFragmentspecialinlinedviewModeldefault2.d) && Intrinsics.areEqual(this.g, tuitionPaymentFragmentspecialinlinedviewModeldefault2.g);
        }

        public final int hashCode() {
            int iHashCode = this.asBinder.hashCode();
            String str = this.b;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            Long l = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode3 = l == null ? 0 : l.hashCode();
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.asInterface;
            int iHashCode4 = tuitionPaymentFragmentbindingInflater1 == null ? 0 : tuitionPaymentFragmentbindingInflater1.hashCode();
            read readVar = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode5 = readVar == null ? 0 : readVar.hashCode();
            IconCompatParcelizer iconCompatParcelizer = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode6 = iconCompatParcelizer == null ? 0 : iconCompatParcelizer.hashCode();
            cancel cancelVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode7 = cancelVar == null ? 0 : cancelVar.hashCode();
            connect connectVar = this.d;
            int iHashCode8 = connectVar == null ? 0 : connectVar.hashCode();
            disconnect disconnectVar = this.g;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (disconnectVar != null ? disconnectVar.hashCode() : 0);
        }

        public final String toString() {
            ActionEventActionType actionEventActionType = this.asBinder;
            String str = this.b;
            Long l = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.asInterface;
            read readVar = this.TuitionPaymentFragmentbindingInflater1;
            IconCompatParcelizer iconCompatParcelizer = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cancel cancelVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            connect connectVar = this.d;
            disconnect disconnectVar = this.g;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault2(asBinder=");
            sb.append(actionEventActionType);
            sb.append(", b=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(l);
            sb.append(", asInterface=");
            sb.append(tuitionPaymentFragmentbindingInflater1);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(readVar);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(iconCompatParcelizer);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(cancelVar);
            sb.append(", d=");
            sb.append(connectVar);
            sb.append(", g=");
            sb.append(disconnectVar);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                read readVarTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                IconCompatParcelizer iconCompatParcelizerTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                cancel cancelVarTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                connect connectVarTuitionPaymentFragmentbindingInflater1;
                disconnect disconnectVarTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                JsonObject asJsonObject;
                JsonObject asJsonObject2;
                JsonObject asJsonObject3;
                JsonObject asJsonObject4;
                JsonObject asJsonObject5;
                JsonObject asJsonObject6;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    ActionEventActionType.Companion companion = ActionEventActionType.INSTANCE;
                    String asString = p0.get("type").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    ActionEventActionType actionEventActionTypeTuitionPaymentFragmentbindingInflater1 = ActionEventActionType.Companion.TuitionPaymentFragmentbindingInflater1(asString);
                    JsonElement jsonElement = p0.get("id");
                    String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = p0.get("loading_time");
                    Long lValueOf = jsonElement2 != null ? Long.valueOf(jsonElement2.getAsLong()) : null;
                    JsonElement jsonElement3 = p0.get(TypedValues.AttributesType.S_TARGET);
                    if (jsonElement3 == null || (asJsonObject6 = jsonElement3.getAsJsonObject()) == null) {
                        tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    } else {
                        TuitionPaymentFragmentbindingInflater1.Companion companion2 = TuitionPaymentFragmentbindingInflater1.INSTANCE;
                        tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentbindingInflater1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject6);
                    }
                    JsonElement jsonElement4 = p0.get("frustration");
                    if (jsonElement4 == null || (asJsonObject5 = jsonElement4.getAsJsonObject()) == null) {
                        readVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    } else {
                        read.Companion companion3 = read.INSTANCE;
                        readVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = read.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject5);
                    }
                    JsonElement jsonElement5 = p0.get(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                    if (jsonElement5 == null || (asJsonObject4 = jsonElement5.getAsJsonObject()) == null) {
                        iconCompatParcelizerTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    } else {
                        IconCompatParcelizer.Companion companion4 = IconCompatParcelizer.INSTANCE;
                        iconCompatParcelizerTuitionPaymentFragmentspecialinlinedviewModeldefault3 = IconCompatParcelizer.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject4);
                    }
                    JsonElement jsonElement6 = p0.get(AppMeasurement.CRASH_ORIGIN);
                    if (jsonElement6 == null || (asJsonObject3 = jsonElement6.getAsJsonObject()) == null) {
                        cancelVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    } else {
                        cancel.Companion companion5 = cancel.INSTANCE;
                        cancelVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = cancel.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject3);
                    }
                    JsonElement jsonElement7 = p0.get("long_task");
                    if (jsonElement7 == null || (asJsonObject2 = jsonElement7.getAsJsonObject()) == null) {
                        connectVarTuitionPaymentFragmentbindingInflater1 = null;
                    } else {
                        connect.Companion companion6 = connect.INSTANCE;
                        connectVarTuitionPaymentFragmentbindingInflater1 = connect.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject2);
                    }
                    JsonElement jsonElement8 = p0.get("resource");
                    if (jsonElement8 == null || (asJsonObject = jsonElement8.getAsJsonObject()) == null) {
                        disconnectVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    } else {
                        disconnect.Companion companion7 = disconnect.INSTANCE;
                        disconnectVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = disconnect.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject);
                    }
                    return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(actionEventActionTypeTuitionPaymentFragmentbindingInflater1, asString2, lValueOf, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3, readVarTuitionPaymentFragmentspecialinlinedviewModeldefault3, iconCompatParcelizerTuitionPaymentFragmentspecialinlinedviewModeldefault3, cancelVarTuitionPaymentFragmentspecialinlinedviewModeldefault3, connectVarTuitionPaymentFragmentbindingInflater1, disconnectVarTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type ActionEventAction", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type ActionEventAction", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type ActionEventAction", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$d;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final String b;

        public d(String str, String str2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.b = str2;
        }

        public /* synthetic */ d(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof d)) {
                return false;
            }
            d dVar = (d) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, dVar.b);
        }

        public final int hashCode() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str2 = this.b;
            StringBuilder sb = new StringBuilder("d(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str);
            sb.append(", b=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$d$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$d$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$d;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$d;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static d TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("technology");
                    String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = p0.get("carrier_name");
                    return new d(asString, jsonElement2 != null ? jsonElement2.getAsString() : null);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Cellular", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Cellular", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Cellular", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$getExtras;", "", "", "p0", "p1", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/Number;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getExtras {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final Number TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final Number TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public getExtras(Number number, Number number2) {
            Intrinsics.checkNotNullParameter(number, "");
            Intrinsics.checkNotNullParameter(number2, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = number;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = number2;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof getExtras)) {
                return false;
            }
            getExtras getextras = (getExtras) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, getextras.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getextras.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            Number number = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Number number2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("getExtras(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(number);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(number2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$getExtras$b, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$getExtras$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$getExtras;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$getExtras;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static getExtras b(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    Number asNumber = p0.get("width").getAsNumber();
                    Number asNumber2 = p0.get("height").getAsNumber();
                    Intrinsics.checkNotNullExpressionValue(asNumber, "");
                    Intrinsics.checkNotNullExpressionValue(asNumber2, "");
                    return new getExtras(asNumber, asNumber2);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Viewport", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Viewport", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Viewport", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$RemoteActionCompatParcelizer;", "", "Lcom/datadog/android/rum/model/ActionEvent$Plan;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$SessionPrecondition;", "p1", "<init>", "(Lcom/datadog/android/rum/model/ActionEvent$Plan;Lcom/datadog/android/rum/model/ActionEvent$SessionPrecondition;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/rum/model/ActionEvent$Plan;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/rum/model/ActionEvent$SessionPrecondition;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class RemoteActionCompatParcelizer {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final SessionPrecondition TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final Plan b;

        public RemoteActionCompatParcelizer(Plan plan, SessionPrecondition sessionPrecondition) {
            this.b = plan;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionPrecondition;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(Plan plan, SessionPrecondition sessionPrecondition, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : plan, (i & 2) != 0 ? null : sessionPrecondition);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RemoteActionCompatParcelizer() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) p0;
            return this.b == remoteActionCompatParcelizer.b && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == remoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            Plan plan = this.b;
            int iHashCode = plan == null ? 0 : plan.hashCode();
            SessionPrecondition sessionPrecondition = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return (iHashCode * 31) + (sessionPrecondition != null ? sessionPrecondition.hashCode() : 0);
        }

        public final String toString() {
            Plan plan = this.b;
            SessionPrecondition sessionPrecondition = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("RemoteActionCompatParcelizer(b=");
            sb.append(plan);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(sessionPrecondition);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$RemoteActionCompatParcelizer$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$RemoteActionCompatParcelizer$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$RemoteActionCompatParcelizer;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$RemoteActionCompatParcelizer;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static RemoteActionCompatParcelizer TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Plan planTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                String asString;
                String asString2;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("plan");
                    SessionPrecondition sessionPreconditionTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    if (jsonElement == null || (asString2 = jsonElement.getAsString()) == null) {
                        planTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    } else {
                        Plan.Companion companion = Plan.INSTANCE;
                        planTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Plan.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asString2);
                    }
                    JsonElement jsonElement2 = p0.get("session_precondition");
                    if (jsonElement2 != null && (asString = jsonElement2.getAsString()) != null) {
                        SessionPrecondition.Companion companion2 = SessionPrecondition.INSTANCE;
                        sessionPreconditionTuitionPaymentFragmentspecialinlinedviewModeldefault3 = SessionPrecondition.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asString);
                    }
                    return new RemoteActionCompatParcelizer(planTuitionPaymentFragmentspecialinlinedviewModeldefault1, sessionPreconditionTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type DdSession", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type DdSession", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type DdSession", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$g;", "", "", "p0", "p1", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/Number;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class g {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final Number TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final Number TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public g(Number number, Number number2) {
            Intrinsics.checkNotNullParameter(number, "");
            this.TuitionPaymentFragmentbindingInflater1 = number;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = number2;
        }

        public /* synthetic */ g(Number number, Number number2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(number, (i & 2) != 0 ? null : number2);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof g)) {
                return false;
            }
            g gVar = (g) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, gVar.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentbindingInflater1.hashCode();
            Number number = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return (iHashCode * 31) + (number == null ? 0 : number.hashCode());
        }

        public final String toString() {
            Number number = this.TuitionPaymentFragmentbindingInflater1;
            Number number2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("g(TuitionPaymentFragmentbindingInflater1=");
            sb.append(number);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(number2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$g$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$g$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$g;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$g;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static g b(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    Number asNumber = p0.get("session_sample_rate").getAsNumber();
                    JsonElement jsonElement = p0.get("session_replay_sample_rate");
                    Number asNumber2 = jsonElement != null ? jsonElement.getAsNumber() : null;
                    Intrinsics.checkNotNullExpressionValue(asNumber, "");
                    return new g(asNumber, asNumber2);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Configuration", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Configuration", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Configuration", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannel;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannel {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public INotificationSideChannel(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof INotificationSideChannel) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((INotificationSideChannel) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("INotificationSideChannel(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$INotificationSideChannel$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannel$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannel;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannel;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static INotificationSideChannel TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("id").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new INotificationSideChannel(asString);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type ContainerView", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type ContainerView", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type ContainerView", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentbindingInflater1;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentbindingInflater1 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public TuitionPaymentFragmentbindingInflater1(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((TuitionPaymentFragmentbindingInflater1) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$TuitionPaymentFragmentbindingInflater1$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentbindingInflater1$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentbindingInflater1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$TuitionPaymentFragmentbindingInflater1;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("name").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new TuitionPaymentFragmentbindingInflater1(asString);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type ActionEventActionTarget", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type ActionEventActionTarget", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type ActionEventActionTarget", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$read;", "", "", "Lcom/datadog/android/rum/model/ActionEvent$Type;", "p0", "<init>", "(Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Ljava/util/List;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class read {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final List<Type> b;

        /* JADX WARN: Multi-variable type inference failed */
        public read(List<? extends Type> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.b = list;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof read) && Intrinsics.areEqual(this.b, ((read) p0).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            List<Type> list = this.b;
            StringBuilder sb = new StringBuilder("read(b=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$read$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$read$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$read;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$read;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static read TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonArray asJsonArray = p0.get("type").getAsJsonArray();
                    ArrayList arrayList = new ArrayList(asJsonArray.size());
                    Intrinsics.checkNotNullExpressionValue(asJsonArray, "");
                    for (JsonElement jsonElement : asJsonArray) {
                        Type.Companion companion = Type.INSTANCE;
                        String asString = jsonElement.getAsString();
                        Intrinsics.checkNotNullExpressionValue(asString, "");
                        arrayList.add(Type.Companion.TuitionPaymentFragmentbindingInflater1(asString));
                    }
                    return new read(arrayList);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Frustration", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Frustration", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Frustration", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$IconCompatParcelizer;", "", "", "p0", "<init>", "(J)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public IconCompatParcelizer(long j) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof IconCompatParcelizer) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == ((IconCompatParcelizer) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final int hashCode() {
            return Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final String toString() {
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("IconCompatParcelizer(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$IconCompatParcelizer$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$IconCompatParcelizer$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$IconCompatParcelizer;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$IconCompatParcelizer;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static IconCompatParcelizer TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    return new IconCompatParcelizer(p0.get("count").getAsLong());
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Error", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Error", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Error", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$cancel;", "", "", "p0", "<init>", "(J)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "J", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class cancel {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final long TuitionPaymentFragmentbindingInflater1;

        public cancel(long j) {
            this.TuitionPaymentFragmentbindingInflater1 = j;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof cancel) && this.TuitionPaymentFragmentbindingInflater1 == ((cancel) p0).TuitionPaymentFragmentbindingInflater1;
        }

        public final int hashCode() {
            return Long.hashCode(this.TuitionPaymentFragmentbindingInflater1);
        }

        public final String toString() {
            long j = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("cancel(TuitionPaymentFragmentbindingInflater1=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$cancel$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$cancel$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$cancel;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$cancel;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static cancel TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    return new cancel(p0.get("count").getAsLong());
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Crash", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Crash", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Crash", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$connect;", "", "", "p0", "<init>", "(J)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "J", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class connect {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final long b;

        public connect(long j) {
            this.b = j;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof connect) && this.b == ((connect) p0).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            long j = this.b;
            StringBuilder sb = new StringBuilder("connect(b=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$connect$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$connect$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$connect;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$connect;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static connect TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    return new connect(p0.get("count").getAsLong());
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type LongTask", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type LongTask", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type LongTask", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$disconnect;", "", "", "p0", "<init>", "(J)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class disconnect {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final long TuitionPaymentFragmentbindingInflater1;

        public disconnect(long j) {
            this.TuitionPaymentFragmentbindingInflater1 = j;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof disconnect) && this.TuitionPaymentFragmentbindingInflater1 == ((disconnect) p0).TuitionPaymentFragmentbindingInflater1;
        }

        public final int hashCode() {
            return Long.hashCode(this.TuitionPaymentFragmentbindingInflater1);
        }

        public final String toString() {
            long j = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("disconnect(TuitionPaymentFragmentbindingInflater1=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$disconnect$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$disconnect$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$disconnect;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$disconnect;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static disconnect TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    return new disconnect(p0.get("count").getAsLong());
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Resource", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Resource", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Resource", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$MediaBrowserCompat;", "", "", "p0", "p1", "<init>", "(JJ)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "J", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class MediaBrowserCompat {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final long b;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public MediaBrowserCompat(long j, long j2) {
            this.b = j;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j2;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof MediaBrowserCompat)) {
                return false;
            }
            MediaBrowserCompat mediaBrowserCompat = (MediaBrowserCompat) p0;
            return this.b == mediaBrowserCompat.b && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == mediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final int hashCode() {
            return (Long.hashCode(this.b) * 31) + Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final String toString() {
            long j = this.b;
            long j2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("MediaBrowserCompat(b=");
            sb.append(j);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(j2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$MediaBrowserCompat$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$MediaBrowserCompat$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$MediaBrowserCompat;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$MediaBrowserCompat;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static MediaBrowserCompat TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    return new MediaBrowserCompat(p0.get("x").getAsLong(), p0.get("y").getAsLong());
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Position", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Position", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Position", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannelStubProxy;", "", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/Long;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannelStubProxy {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final Long TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public final Long b;

        public INotificationSideChannelStubProxy(String str, Long l, Long l2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.b = l;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = l2;
        }

        public /* synthetic */ INotificationSideChannelStubProxy(String str, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2);
        }

        public INotificationSideChannelStubProxy() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof INotificationSideChannelStubProxy)) {
                return false;
            }
            INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = (INotificationSideChannelStubProxy) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, iNotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, iNotificationSideChannelStubProxy.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, iNotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode = str == null ? 0 : str.hashCode();
            Long l = this.b;
            int iHashCode2 = l == null ? 0 : l.hashCode();
            Long l2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            return (((iHashCode * 31) + iHashCode2) * 31) + (l2 != null ? l2.hashCode() : 0);
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Long l = this.b;
            Long l2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("INotificationSideChannelStubProxy(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str);
            sb.append(", b=");
            sb.append(l);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(l2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$INotificationSideChannelStubProxy$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannelStubProxy$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannelStubProxy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ActionEvent$INotificationSideChannelStubProxy;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static INotificationSideChannelStubProxy TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("selector");
                    String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = p0.get("width");
                    Long lValueOf = jsonElement2 != null ? Long.valueOf(jsonElement2.getAsLong()) : null;
                    JsonElement jsonElement3 = p0.get("height");
                    return new INotificationSideChannelStubProxy(asString, lValueOf, jsonElement3 != null ? Long.valueOf(jsonElement3.getAsLong()) : null);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type DdActionTarget", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type DdActionTarget", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type DdActionTarget", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "asInterface", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "a", "d", "g", "asBinder"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ActionEventSource {
        ANDROID("android"),
        IOS("ios"),
        BROWSER("browser"),
        FLUTTER("flutter"),
        REACT_NATIVE("react-native"),
        ROKU("roku"),
        UNITY("unity"),
        KOTLIN_MULTIPLATFORM("kotlin-multiplatform");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        ActionEventSource(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$ActionEventSource$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static ActionEventSource TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (ActionEventSource actionEventSource : ActionEventSource.values()) {
                    if (Intrinsics.areEqual(actionEventSource.jsonValue, p0)) {
                        return actionEventSource;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$ActionEventSessionType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ActionEventSessionType {
        USER("user"),
        SYNTHETICS("synthetics"),
        CI_TEST("ci_test");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        ActionEventSessionType(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$ActionEventSessionType$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$ActionEventSessionType$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSessionType;", "b", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$ActionEventSessionType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static ActionEventSessionType b(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (ActionEventSessionType actionEventSessionType : ActionEventSessionType.values()) {
                    if (Intrinsics.areEqual(actionEventSessionType.jsonValue, p0)) {
                        return actionEventSessionType;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Status;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Status {
        CONNECTED("connected"),
        NOT_CONNECTED("not_connected"),
        MAYBE("maybe");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        Status(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$Status$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Status$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ActionEvent$Status;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Status;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static Status TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (Status status : Status.values()) {
                    if (Intrinsics.areEqual(status.jsonValue, p0)) {
                        return status;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Interface;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "TuitionPaymentFragmentbindingInflater1", "g", "asBinder", "d", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "cancelAll", "asInterface"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Interface {
        BLUETOOTH("bluetooth"),
        CELLULAR("cellular"),
        ETHERNET("ethernet"),
        WIFI("wifi"),
        WIMAX("wimax"),
        MIXED("mixed"),
        OTHER("other"),
        UNKNOWN(EnvironmentCompat.MEDIA_UNKNOWN),
        NONE("none");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        Interface(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$Interface$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Interface$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ActionEvent$Interface;", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Interface;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static Interface TuitionPaymentFragmentbindingInflater1(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (Interface r3 : Interface.values()) {
                    if (Intrinsics.areEqual(r3.jsonValue, p0)) {
                        return r3;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$EffectiveType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "d", "TuitionPaymentFragmentbindingInflater1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum EffectiveType {
        SLOW_2G("slow_2g"),
        TuitionPaymentFragmentbindingInflater1("2g"),
        b("3g"),
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("4g");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        EffectiveType(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$EffectiveType$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$EffectiveType$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ActionEvent$EffectiveType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$EffectiveType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static EffectiveType TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (EffectiveType effectiveType : EffectiveType.values()) {
                    if (Intrinsics.areEqual(effectiveType.jsonValue, p0)) {
                        return effectiveType;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$DeviceType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "asBinder", "asInterface", "a", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum DeviceType {
        MOBILE("mobile"),
        DESKTOP("desktop"),
        TABLET("tablet"),
        TV("tv"),
        GAMING_CONSOLE("gaming_console"),
        BOT("bot"),
        OTHER("other");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        DeviceType(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$DeviceType$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$DeviceType$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ActionEvent$DeviceType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$DeviceType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static DeviceType TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (DeviceType deviceType : DeviceType.values()) {
                    if (Intrinsics.areEqual(deviceType.jsonValue, p0)) {
                        return deviceType;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asBinder", "g", "asInterface", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ActionEventActionType {
        CUSTOM("custom"),
        CLICK("click"),
        TAP("tap"),
        SCROLL("scroll"),
        SWIPE("swipe"),
        APPLICATION_START("application_start"),
        BACK("back");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        ActionEventActionType(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$ActionEventActionType$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static ActionEventActionType TuitionPaymentFragmentbindingInflater1(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (ActionEventActionType actionEventActionType : ActionEventActionType.values()) {
                    if (Intrinsics.areEqual(actionEventActionType.jsonValue, p0)) {
                        return actionEventActionType;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0004\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Plan;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/Number;)V", "jsonValue", "Ljava/lang/Number;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Plan {
        PLAN_1((Number) 1),
        PLAN_2((Number) 2);


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final Number jsonValue;

        Plan(Number number) {
            this.jsonValue = number;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$Plan$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Plan$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ActionEvent$Plan;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Plan;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static Plan TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (Plan plan : Plan.values()) {
                    if (Intrinsics.areEqual(plan.jsonValue.toString(), p0)) {
                        return plan;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$SessionPrecondition;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "d", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "b", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum SessionPrecondition {
        USER_APP_LAUNCH("user_app_launch"),
        INACTIVITY_TIMEOUT("inactivity_timeout"),
        MAX_DURATION("max_duration"),
        BACKGROUND_LAUNCH("background_launch"),
        PREWARM("prewarm"),
        FROM_NON_INTERACTIVE_SESSION("from_non_interactive_session"),
        EXPLICIT_STOP("explicit_stop");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        SessionPrecondition(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$SessionPrecondition$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$SessionPrecondition$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ActionEvent$SessionPrecondition;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$SessionPrecondition;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static SessionPrecondition TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (SessionPrecondition sessionPrecondition : SessionPrecondition.values()) {
                    if (Intrinsics.areEqual(sessionPrecondition.jsonValue, p0)) {
                        return sessionPrecondition;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Type;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "b", "d", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "a", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Type {
        RAGE_CLICK("rage_click"),
        DEAD_CLICK("dead_click"),
        ERROR_CLICK("error_click"),
        RAGE_TAP("rage_tap"),
        ERROR_TAP("error_tap");


        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        Type(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ActionEvent$Type$b, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Type$b;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ActionEvent$Type;", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Type;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static Type TuitionPaymentFragmentbindingInflater1(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (Type type : Type.values()) {
                    if (Intrinsics.areEqual(type.jsonValue, p0)) {
                        return type;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
}
