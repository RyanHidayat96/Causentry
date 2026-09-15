package com.datadog.android.rum.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
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
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.os.EnvironmentCompat;
import androidx.core.view.PointerIconCompat;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.abt.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import defpackage.SessionProcessor;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.toBitmap;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bA\b\u0086\b\u0018\u0000 ;2\u00020\u0001:,4275;>@<A9KDIFH[Q\\MSNPZ]^UXW_`abcdefghijklmnBï\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020*2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00102\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00106R\u0016\u00105\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u0004\u0018\u00010!8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u00109\u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010CR\u0016\u0010<\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010H\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010D\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010?R\u0016\u0010K\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010F\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010I\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u00106R\u0014\u0010P\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010S\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010Q\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010TR\u0014\u0010M\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0006\n\u0004\bS\u00106R\u0016\u0010N\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010U\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bW\u00106R\u0014\u0010Z\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bX\u0010Y"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent;", "", "", "p0", "Lcom/datadog/android/rum/model/ViewEvent$TuitionPaymentFragmentbindingInflater1;", "p1", "", "p2", "p3", "p4", "p5", "Lcom/datadog/android/rum/model/ViewEvent$getSessionToken;", "p6", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "p7", "Lcom/datadog/android/rum/model/ViewEvent$search;", "p8", "Lcom/datadog/android/rum/model/ViewEvent$getItem;", "p9", "Lcom/datadog/android/rum/model/ViewEvent$g;", "p10", "Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannelDefault;", "p11", "Lcom/datadog/android/rum/model/ViewEvent$getRoot;", "p12", "Lcom/datadog/android/rum/model/ViewEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "p13", "Lcom/datadog/android/rum/model/ViewEvent$IconCompatParcelizer;", "p14", "Lcom/datadog/android/rum/model/ViewEvent$onTransact;", "p15", "Lcom/datadog/android/rum/model/ViewEvent$notify;", "p16", "Lcom/datadog/android/rum/model/ViewEvent$a;", "p17", "Lcom/datadog/android/rum/model/ViewEvent$asBinder;", "p18", "p19", "Lcom/datadog/android/rum/model/ViewEvent$MediaBrowserCompat;", "p20", "<init>", "(JLcom/datadog/android/rum/model/ViewEvent$TuitionPaymentFragmentbindingInflater1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ViewEvent$getSessionToken;Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;Lcom/datadog/android/rum/model/ViewEvent$search;Lcom/datadog/android/rum/model/ViewEvent$getItem;Lcom/datadog/android/rum/model/ViewEvent$g;Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannelDefault;Lcom/datadog/android/rum/model/ViewEvent$getRoot;Lcom/datadog/android/rum/model/ViewEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;Lcom/datadog/android/rum/model/ViewEvent$IconCompatParcelizer;Lcom/datadog/android/rum/model/ViewEvent$onTransact;Lcom/datadog/android/rum/model/ViewEvent$notify;Lcom/datadog/android/rum/model/ViewEvent$a;Lcom/datadog/android/rum/model/ViewEvent$asBinder;Lcom/datadog/android/rum/model/ViewEvent$a;Lcom/datadog/android/rum/model/ViewEvent$MediaBrowserCompat;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Lcom/datadog/android/rum/model/ViewEvent$TuitionPaymentFragmentbindingInflater1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "b", "Lcom/datadog/android/rum/model/ViewEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "a", "Lcom/datadog/android/rum/model/ViewEvent$g;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asBinder", "Lcom/datadog/android/rum/model/ViewEvent$asBinder;", "d", "Lcom/datadog/android/rum/model/ViewEvent$a;", "g", "asInterface", "J", "Lcom/datadog/android/rum/model/ViewEvent$notify;", "INotificationSideChannel", "Lcom/datadog/android/rum/model/ViewEvent$onTransact;", "cancel", "Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannelDefault;", "onTransact", "notify", "Lcom/datadog/android/rum/model/ViewEvent$IconCompatParcelizer;", "cancelAll", "Lcom/datadog/android/rum/model/ViewEvent$MediaBrowserCompat;", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "Lcom/datadog/android/rum/model/ViewEvent$getSessionToken;", "INotificationSideChannelStub", "INotificationSideChannelDefault", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "RemoteActionCompatParcelizer", "Lcom/datadog/android/rum/model/ViewEvent$getRoot;", "read", "Lcom/datadog/android/rum/model/ViewEvent$getItem;", "write", "IconCompatParcelizer", "Lcom/datadog/android/rum/model/ViewEvent$search;", "connect", "DeviceType", "EffectiveType", "Interface", "LoadingType", "Plan", "MediaBrowserCompat", "ReplayLevel", "getExtras", "getNotifyChildrenChangedOptions", "disconnect", "SessionPrecondition", "State", "Status", "getRoot", "getItem", "getSessionToken", "ViewEventSessionType", "ViewEventSource", FirebaseAnalytics.Event.SEARCH, "getServiceComponent"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class ViewEvent {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public final onTransact asBinder;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    public final ViewEventSource RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    public final getRoot INotificationSideChannelDefault;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    public final String notify;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public final search connect;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public final String INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final g TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final asBinder d;
    public final long asInterface;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public final INotificationSideChannelDefault onTransact;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public final MediaBrowserCompat cancel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final a g;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final notify a;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    public final getSessionToken INotificationSideChannelStub;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public final IconCompatParcelizer cancelAll;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final a INotificationSideChannel;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public final getItem getInterfaceDescriptor;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public final String read;

    public ViewEvent(long j, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, String str, String str2, String str3, String str4, getSessionToken getsessiontoken, ViewEventSource viewEventSource, search searchVar, getItem getitem, g gVar, INotificationSideChannelDefault iNotificationSideChannelDefault, getRoot getroot, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, IconCompatParcelizer iconCompatParcelizer, onTransact ontransact, notify notifyVar, a aVar, asBinder asbinder, a aVar2, MediaBrowserCompat mediaBrowserCompat) {
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentbindingInflater1, "");
        Intrinsics.checkNotNullParameter(getsessiontoken, "");
        Intrinsics.checkNotNullParameter(searchVar, "");
        Intrinsics.checkNotNullParameter(notifyVar, "");
        this.asInterface = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentbindingInflater1;
        this.notify = str;
        this.read = str2;
        this.TuitionPaymentFragmentbindingInflater1 = str3;
        this.b = str4;
        this.INotificationSideChannelStub = getsessiontoken;
        this.RemoteActionCompatParcelizer = viewEventSource;
        this.connect = searchVar;
        this.getInterfaceDescriptor = getitem;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = gVar;
        this.onTransact = iNotificationSideChannelDefault;
        this.INotificationSideChannelDefault = getroot;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.cancelAll = iconCompatParcelizer;
        this.asBinder = ontransact;
        this.a = notifyVar;
        this.g = aVar;
        this.d = asbinder;
        this.INotificationSideChannel = aVar2;
        this.cancel = mediaBrowserCompat;
        this.INotificationSideChannelStubProxy = "view";
    }

    public /* synthetic */ ViewEvent(long j, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, String str, String str2, String str3, String str4, getSessionToken getsessiontoken, ViewEventSource viewEventSource, search searchVar, getItem getitem, g gVar, INotificationSideChannelDefault iNotificationSideChannelDefault, getRoot getroot, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, IconCompatParcelizer iconCompatParcelizer, onTransact ontransact, notify notifyVar, a aVar, asBinder asbinder, a aVar2, MediaBrowserCompat mediaBrowserCompat, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, tuitionPaymentFragmentbindingInflater1, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, getsessiontoken, (i & 128) != 0 ? null : viewEventSource, searchVar, (i & 512) != 0 ? null : getitem, (i & 1024) != 0 ? null : gVar, (i & 2048) != 0 ? null : iNotificationSideChannelDefault, (i & 4096) != 0 ? null : getroot, (i & 8192) != 0 ? null : tuitionPaymentFragmentspecialinlinedviewModeldefault1, (i & 16384) != 0 ? null : iconCompatParcelizer, (32768 & i) != 0 ? null : ontransact, notifyVar, (131072 & i) != 0 ? null : aVar, (262144 & i) != 0 ? null : asbinder, (524288 & i) != 0 ? null : aVar2, (i & 1048576) != 0 ? null : mediaBrowserCompat);
    }

    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0004\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b@\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0001JBí\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010,\u001a\u00020+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u000108¢\u0006\u0004\b<\u0010=J\u001a\u0010>\u001a\u00020\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010A\u001a\u00020@HÖ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0002H×\u0001¢\u0006\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010J\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010H\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010IR\u0016\u0010K\u001a\u0004\u0018\u00010%8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010E\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010IR\u0016\u0010N\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010R\u001a\u0004\u0018\u00010\u001c8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010M\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010P\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010TR\u0016\u0010S\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010TR\u0014\u0010V\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bX\u0010TR\u0016\u0010Z\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bY\u0010TR\u0016\u0010Y\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bZ\u0010TR\u0016\u0010U\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b[\u0010OR\u0016\u0010]\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u0010TR\u0016\u0010\\\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010^\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010_R\u0016\u0010[\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010`\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bd\u0010OR\u001c\u0010b\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\be\u0010TR\u0016\u0010h\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bh\u0010OR\u0016\u0010d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010i\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bk\u0010jR\u0016\u0010m\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bl\u0010_R\u0016\u0010n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bm\u0010TR\u0016\u0010l\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bn\u0010OR\u0016\u0010k\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bo\u0010TR\u0016\u0010q\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bp\u0010TR\u0016\u0010o\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010u\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010p\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bu\u0010IR\u0016\u0010s\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bv\u0010IR\u0018\u0010x\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bw\u0010OR\u0018\u0010v\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\by\u0010OR\u0016\u0010y\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bz\u0010IR\u0016\u0010w\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bx\u0010IR\u0014\u0010z\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010\u007f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0017\u0010}\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010O"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$search;", "", "", "p0", "p1", "p2", "p3", "", "p4", "Lcom/datadog/android/rum/model/ViewEvent$LoadingType;", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannel;", "p22", "", "p23", "p24", "Lcom/datadog/android/rum/model/ViewEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "p25", "Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannelStubProxy;", "p26", "Lcom/datadog/android/rum/model/ViewEvent$cancelAll;", "p27", "Lcom/datadog/android/rum/model/ViewEvent$read;", "p28", "Lcom/datadog/android/rum/model/ViewEvent$getInterfaceDescriptor;", "p29", "Lcom/datadog/android/rum/model/ViewEvent$getNotifyChildrenChangedOptions;", "p30", "Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannelStub;", "p31", "", "Lcom/datadog/android/rum/model/ViewEvent$connect;", "p32", "p33", "p34", "p35", "p36", "p37", "p38", "Lcom/datadog/android/rum/model/ViewEvent$RemoteActionCompatParcelizer;", "p39", "p40", "p41", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/datadog/android/rum/model/ViewEvent$LoadingType;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannel;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/datadog/android/rum/model/ViewEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannelStubProxy;Lcom/datadog/android/rum/model/ViewEvent$cancelAll;Lcom/datadog/android/rum/model/ViewEvent$read;Lcom/datadog/android/rum/model/ViewEvent$getInterfaceDescriptor;Lcom/datadog/android/rum/model/ViewEvent$getNotifyChildrenChangedOptions;Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannelStub;Ljava/util/List;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Lcom/datadog/android/rum/model/ViewEvent$RemoteActionCompatParcelizer;Lcom/datadog/android/rum/model/ViewEvent$RemoteActionCompatParcelizer;Lcom/datadog/android/rum/model/ViewEvent$RemoteActionCompatParcelizer;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Lcom/datadog/android/rum/model/ViewEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/Number;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/rum/model/ViewEvent$cancelAll;", "asBinder", "g", "Ljava/lang/String;", "a", "Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannel;", "asInterface", "d", "Ljava/lang/Long;", "onTransact", "notify", "Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannelStubProxy;", "INotificationSideChannel", "cancelAll", "cancel", "INotificationSideChannelDefault", "INotificationSideChannelStub", "INotificationSideChannelStubProxy", "RemoteActionCompatParcelizer", "Lcom/datadog/android/rum/model/ViewEvent$RemoteActionCompatParcelizer;", "getInterfaceDescriptor", "Lcom/datadog/android/rum/model/ViewEvent$getInterfaceDescriptor;", "read", "Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannelStub;", "IconCompatParcelizer", "connect", "write", "Ljava/util/List;", "MediaBrowserCompat", "getRoot", "Ljava/lang/Boolean;", "disconnect", "getNotifyChildrenChangedOptions", "getExtras", "getItem", "getServiceComponent", "sendCustomAction", FirebaseAnalytics.Event.SEARCH, "Lcom/datadog/android/rum/model/ViewEvent$LoadingType;", "getSessionToken", "Lcom/datadog/android/rum/model/ViewEvent$read;", "isConnected", "unsubscribe", "handleMessage", "MediaBrowserCompatCallbackHandler", "setCallbacksMessenger", "subscribe", "MediaBrowserCompatConnectionCallback", "Lcom/datadog/android/rum/model/ViewEvent$getNotifyChildrenChangedOptions;", "onConnectionSuspended", "J", "onConnected", "onConnectionFailed"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class search {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static long setInternalConnectionCallback;
        public final Long INotificationSideChannel;

        /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
        public final String onTransact;

        /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
        public final Long INotificationSideChannelStubProxy;

        /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        public final String connect;
        public final String MediaBrowserCompat;

        /* JADX INFO: renamed from: MediaBrowserCompatCallbackHandler, reason: from kotlin metadata */
        public final Number handleMessage;

        /* JADX INFO: renamed from: MediaBrowserCompatConnectionCallback, reason: from kotlin metadata */
        public final getNotifyChildrenChangedOptions subscribe;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        public final RemoteActionCompatParcelizer INotificationSideChannelStub;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final Number TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final Number TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final cancelAll TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final INotificationSideChannel asInterface;

        /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
        public final Number b;

        /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
        public final Long a;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
        public final Long cancelAll;

        /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
        public final Long cancel;

        /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
        public final Long write;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final Long asBinder;

        /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
        public final Boolean getRoot;
        public final String g;

        /* JADX INFO: renamed from: getExtras, reason: from kotlin metadata */
        public final Long getItem;

        /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
        public final getInterfaceDescriptor INotificationSideChannelDefault;

        /* JADX INFO: renamed from: getItem, reason: from kotlin metadata */
        public final String getNotifyChildrenChangedOptions;

        /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from kotlin metadata */
        public final RemoteActionCompatParcelizer getExtras;

        /* JADX INFO: renamed from: getRoot, reason: from kotlin metadata */
        public final Boolean IconCompatParcelizer;

        /* JADX INFO: renamed from: getServiceComponent, reason: from kotlin metadata */
        public final Long disconnect;

        /* JADX INFO: renamed from: getSessionToken, reason: from kotlin metadata */
        public final read isConnected;

        /* JADX INFO: renamed from: handleMessage, reason: from kotlin metadata */
        public String MediaBrowserCompatCallbackHandler;

        /* JADX INFO: renamed from: isConnected, reason: from kotlin metadata */
        public final Number sendCustomAction;
        public final INotificationSideChannelStubProxy notify;

        /* JADX INFO: renamed from: onConnectionFailed, reason: from kotlin metadata */
        public String onConnectionSuspended;

        /* JADX INFO: renamed from: onConnectionSuspended, reason: from kotlin metadata */
        public final long onConnected;

        /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
        public final Long d;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        public final INotificationSideChannelStub getInterfaceDescriptor;

        /* JADX INFO: renamed from: search, reason: from kotlin metadata */
        public final LoadingType getServiceComponent;

        /* JADX INFO: renamed from: sendCustomAction, reason: from kotlin metadata */
        public final Long search;

        /* JADX INFO: renamed from: setCallbacksMessenger, reason: from kotlin metadata */
        public String unsubscribe;

        /* JADX INFO: renamed from: subscribe, reason: from kotlin metadata */
        public final Number setCallbacksMessenger;

        /* JADX INFO: renamed from: unsubscribe, reason: from kotlin metadata */
        public final Number getSessionToken;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        public final List<connect> read;
        private static final byte[] $$a = {5, -91, 77, 46, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
        private static final int $$b = 117;
        private static int onProgressUpdate = 0;
        private static int MediaBrowserCompatConnectionCallbackStubApi21 = 1;
        private static int onConnected = 0;

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 3
                int r6 = 84 - r6
                int r8 = r8 + 4
                int r7 = r7 * 15
                int r0 = r7 + 38
                byte[] r1 = com.datadog.android.rum.model.ViewEvent.search.$$a
                byte[] r0 = new byte[r0]
                int r7 = r7 + 37
                r2 = 0
                if (r1 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L2c
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L24:
                r4 = r1[r8]
                int r3 = r3 + 1
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2c:
                int r6 = r6 + r8
                int r8 = r3 + 1
                int r6 = r6 + (-11)
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.ViewEvent.search.c(int, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0141  */
        /* JADX WARN: Code duplicated, block: B:33:0x0142  */
        private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2;
            long j;
            Object obj;
            Throwable cause;
            int i3 = 2 % 2;
            getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
            getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            getrealtimecapturelatency.b = 0;
            while (true) {
                i2 = 3;
                j = 0;
                obj = null;
                if (getrealtimecapturelatency.b >= cArr.length) {
                    break;
                }
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - TextUtils.getCapsMode("", 0, 0)), (ViewConfiguration.getTouchSlop() >> 8) + 2624, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (setInternalConnectionCallback ^ 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39423 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 481, 37 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
            char[] cArr2 = new char[length];
            getrealtimecapturelatency.b = 0;
            int i5 = $11 + 89;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i7 = $11 + i2;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39423 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1))), 480 - ExpandableListView.getPackedPositionChild(j), 37 - ExpandableListView.getPackedPositionGroup(j), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    obj.hashCode();
                    throw null;
                }
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                try {
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 39422), 481 - Color.alpha(0), 37 - View.MeasureSpec.getMode(0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    i2 = 3;
                    j = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr2);
        }

        public search(String str, String str2, String str3, String str4, Long l, LoadingType loadingType, long j, Long l2, Long l3, String str5, Long l4, Long l5, String str6, Long l6, String str7, Number number, String str8, Long l7, Long l8, Long l9, Long l10, Long l11, INotificationSideChannel iNotificationSideChannel, Boolean bool, Boolean bool2, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, INotificationSideChannelStubProxy iNotificationSideChannelStubProxy, cancelAll cancelall, read readVar, getInterfaceDescriptor getinterfacedescriptor, getNotifyChildrenChangedOptions getnotifychildrenchangedoptions, INotificationSideChannelStub iNotificationSideChannelStub, List<connect> list, Number number2, Number number3, Number number4, Number number5, Number number6, Number number7, RemoteActionCompatParcelizer remoteActionCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer2, RemoteActionCompatParcelizer remoteActionCompatParcelizer3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            Intrinsics.checkNotNullParameter(iNotificationSideChannelStubProxy, "");
            Intrinsics.checkNotNullParameter(getnotifychildrenchangedoptions, "");
            this.connect = str;
            this.unsubscribe = str2;
            this.onConnectionSuspended = str3;
            this.MediaBrowserCompatCallbackHandler = str4;
            this.search = l;
            this.getServiceComponent = loadingType;
            this.onConnected = j;
            this.cancel = l2;
            this.getItem = l3;
            this.getNotifyChildrenChangedOptions = str5;
            this.cancelAll = l4;
            this.INotificationSideChannelStubProxy = l5;
            this.onTransact = str6;
            this.write = l6;
            this.MediaBrowserCompat = str7;
            this.b = number;
            this.g = str8;
            this.asBinder = l7;
            this.a = l8;
            this.d = l9;
            this.disconnect = l10;
            this.INotificationSideChannel = l11;
            this.asInterface = iNotificationSideChannel;
            this.IconCompatParcelizer = bool;
            this.getRoot = bool2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.notify = iNotificationSideChannelStubProxy;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cancelall;
            this.isConnected = readVar;
            this.INotificationSideChannelDefault = getinterfacedescriptor;
            this.subscribe = getnotifychildrenchangedoptions;
            this.getInterfaceDescriptor = iNotificationSideChannelStub;
            this.read = list;
            this.sendCustomAction = number2;
            this.getSessionToken = number3;
            this.TuitionPaymentFragmentbindingInflater1 = number4;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = number5;
            this.setCallbacksMessenger = number6;
            this.handleMessage = number7;
            this.INotificationSideChannelStub = remoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer2;
            this.getExtras = remoteActionCompatParcelizer3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ search(String str, String str2, String str3, String str4, Long l, LoadingType loadingType, long j, Long l2, Long l3, String str5, Long l4, Long l5, String str6, Long l6, String str7, Number number, String str8, Long l7, Long l8, Long l9, Long l10, Long l11, INotificationSideChannel iNotificationSideChannel, Boolean bool, Boolean bool2, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, INotificationSideChannelStubProxy iNotificationSideChannelStubProxy, cancelAll cancelall, read readVar, getInterfaceDescriptor getinterfacedescriptor, getNotifyChildrenChangedOptions getnotifychildrenchangedoptions, INotificationSideChannelStub iNotificationSideChannelStub, List list, Number number2, Number number3, Number number4, Number number5, Number number6, Number number7, RemoteActionCompatParcelizer remoteActionCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer2, RemoteActionCompatParcelizer remoteActionCompatParcelizer3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            String str9;
            Long l12;
            String str10;
            Number number8;
            String str11;
            Long l13;
            Long l14;
            read readVar2;
            INotificationSideChannelStub iNotificationSideChannelStub2;
            Number number9;
            Number number10;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer4;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer5;
            if ((i & 2) != 0) {
                int i3 = MediaBrowserCompatConnectionCallbackStubApi21 + 57;
                onProgressUpdate = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                str9 = null;
            } else {
                str9 = str2;
            }
            String str12 = (i & 8) != 0 ? null : str4;
            Long l15 = (i & 16) != 0 ? null : l;
            LoadingType loadingType2 = (i & 32) != 0 ? null : loadingType;
            if ((i & 128) != 0) {
                int i4 = MediaBrowserCompatConnectionCallbackStubApi21 + 25;
                onProgressUpdate = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 83 / 0;
                }
                l12 = null;
            } else {
                l12 = l2;
            }
            Long l16 = (i & 256) != 0 ? null : l3;
            if ((i & 512) != 0) {
                int i6 = 2 % 2;
                str10 = null;
            } else {
                str10 = str5;
            }
            Long l17 = (i & 1024) != 0 ? null : l4;
            Long l18 = (i & 2048) != 0 ? null : l5;
            String str13 = (i & 4096) != 0 ? null : str6;
            Long l19 = (i & 8192) != 0 ? null : l6;
            String str14 = (i & 16384) != 0 ? null : str7;
            if ((32768 & i) != 0) {
                int i7 = 2 % 2;
                number8 = null;
            } else {
                number8 = number;
            }
            if ((65536 & i) != 0) {
                int i8 = MediaBrowserCompatConnectionCallbackStubApi21 + 65;
                onProgressUpdate = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
                str11 = null;
            } else {
                str11 = str8;
            }
            if ((131072 & i) != 0) {
                int i11 = MediaBrowserCompatConnectionCallbackStubApi21 + 123;
                onProgressUpdate = i11 % 128;
                int i12 = i11 % 2;
                int i13 = 2 % 2;
                l13 = null;
            } else {
                l13 = l7;
            }
            Long l20 = (262144 & i) != 0 ? null : l8;
            Long l21 = (524288 & i) != 0 ? null : l9;
            if ((1048576 & i) != 0) {
                int i14 = MediaBrowserCompatConnectionCallbackStubApi21 + 11;
                onProgressUpdate = i14 % 128;
                int i15 = i14 % 2;
                l14 = null;
            } else {
                l14 = l10;
            }
            Long l22 = (2097152 & i) != 0 ? null : l11;
            INotificationSideChannel iNotificationSideChannel2 = (4194304 & i) != 0 ? null : iNotificationSideChannel;
            Boolean bool3 = (8388608 & i) != 0 ? null : bool;
            Boolean bool4 = (16777216 & i) != 0 ? null : bool2;
            cancelAll cancelall2 = (134217728 & i) != 0 ? null : cancelall;
            if ((268435456 & i) != 0) {
                int i16 = onProgressUpdate + 83;
                MediaBrowserCompatConnectionCallbackStubApi21 = i16 % 128;
                int i17 = i16 % 2;
                readVar2 = null;
            } else {
                readVar2 = readVar;
            }
            getInterfaceDescriptor getinterfacedescriptor2 = (536870912 & i) != 0 ? null : getinterfacedescriptor;
            if ((i & Integer.MIN_VALUE) != 0) {
                int i18 = 2 % 2;
                iNotificationSideChannelStub2 = null;
            } else {
                iNotificationSideChannelStub2 = iNotificationSideChannelStub;
            }
            List list2 = (i2 & 1) != 0 ? null : list;
            Number number11 = (i2 & 2) != 0 ? null : number2;
            if ((i2 & 4) != 0) {
                int i19 = onProgressUpdate + 113;
                MediaBrowserCompatConnectionCallbackStubApi21 = i19 % 128;
                int i20 = i19 % 2;
                number9 = null;
            } else {
                number9 = number3;
            }
            Number number12 = (i2 & 8) != 0 ? null : number4;
            Number number13 = (i2 & 16) != 0 ? null : number5;
            if ((i2 & 32) != 0) {
                int i21 = MediaBrowserCompatConnectionCallbackStubApi21 + 1;
                onProgressUpdate = i21 % 128;
                if (i21 % 2 != 0) {
                    throw null;
                }
                number10 = null;
            } else {
                number10 = number6;
            }
            Number number14 = (i2 & 64) != 0 ? null : number7;
            if ((i2 & 128) != 0) {
                int i22 = MediaBrowserCompatConnectionCallbackStubApi21 + 39;
                onProgressUpdate = i22 % 128;
                if (i22 % 2 != 0) {
                    int i23 = 60 / 0;
                }
                remoteActionCompatParcelizer4 = null;
            } else {
                remoteActionCompatParcelizer4 = remoteActionCompatParcelizer;
            }
            if ((i2 & 256) != 0) {
                int i24 = onProgressUpdate + 45;
                MediaBrowserCompatConnectionCallbackStubApi21 = i24 % 128;
                int i25 = i24 % 2;
                remoteActionCompatParcelizer5 = null;
            } else {
                remoteActionCompatParcelizer5 = remoteActionCompatParcelizer2;
            }
            this(str, str9, str3, str12, l15, loadingType2, j, l12, l16, str10, l17, l18, str13, l19, str14, number8, str11, l13, l20, l21, l14, l22, iNotificationSideChannel2, bool3, bool4, tuitionPaymentFragmentspecialinlinedviewModeldefault3, iNotificationSideChannelStubProxy, cancelall2, readVar2, getinterfacedescriptor2, getnotifychildrenchangedoptions, iNotificationSideChannelStub2, list2, number11, number9, number12, number13, number10, number14, remoteActionCompatParcelizer4, remoteActionCompatParcelizer5, (i2 & 512) != 0 ? null : remoteActionCompatParcelizer3);
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$search$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$search$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$search;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$search;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
            @JvmStatic
            public static search TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                String str;
                String str2;
                NumberFormatException numberFormatException;
                NullPointerException nullPointerException;
                String str3;
                IllegalStateException illegalStateException;
                String asString;
                LoadingType loadingTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                INotificationSideChannel iNotificationSideChannelTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                cancelAll cancelallTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                read readVarB;
                getInterfaceDescriptor getinterfacedescriptorTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                INotificationSideChannelStub iNotificationSideChannelStubTuitionPaymentFragmentbindingInflater1;
                ArrayList arrayList;
                RemoteActionCompatParcelizer remoteActionCompatParcelizerB;
                RemoteActionCompatParcelizer remoteActionCompatParcelizerB2;
                RemoteActionCompatParcelizer remoteActionCompatParcelizerB3;
                JsonObject asJsonObject;
                JsonObject asJsonObject2;
                JsonObject asJsonObject3;
                JsonArray asJsonArray;
                JsonObject asJsonObject4;
                JsonObject asJsonObject5;
                JsonObject asJsonObject6;
                JsonObject asJsonObject7;
                JsonObject asJsonObject8;
                String asString2;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString3 = p0.get("id").getAsString();
                    JsonElement jsonElement = p0.get("referrer");
                    if (jsonElement != null) {
                        try {
                            asString = jsonElement.getAsString();
                        } catch (IllegalStateException e2) {
                            illegalStateException = e2;
                            str3 = "Unable to parse json into type ViewEventView";
                            throw new JsonParseException(str3, illegalStateException);
                        } catch (NullPointerException e3) {
                            nullPointerException = e3;
                            str = "Unable to parse json into type ViewEventView";
                            throw new JsonParseException(str, nullPointerException);
                        } catch (NumberFormatException e4) {
                            numberFormatException = e4;
                            str2 = "Unable to parse json into type ViewEventView";
                            throw new JsonParseException(str2, numberFormatException);
                        }
                    } else {
                        asString = null;
                    }
                    String asString4 = p0.get(ImagesContract.URL).getAsString();
                    JsonElement jsonElement2 = p0.get("name");
                    String asString5 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    JsonElement jsonElement3 = p0.get("loading_time");
                    Long lValueOf = jsonElement3 != null ? Long.valueOf(jsonElement3.getAsLong()) : null;
                    JsonElement jsonElement4 = p0.get("loading_type");
                    if (jsonElement4 == null || (asString2 = jsonElement4.getAsString()) == null) {
                        loadingTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    } else {
                        LoadingType.Companion companion = LoadingType.INSTANCE;
                        loadingTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoadingType.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asString2);
                    }
                    long asLong = p0.get("time_spent").getAsLong();
                    JsonElement jsonElement5 = p0.get("first_contentful_paint");
                    Long lValueOf2 = jsonElement5 != null ? Long.valueOf(jsonElement5.getAsLong()) : null;
                    JsonElement jsonElement6 = p0.get("largest_contentful_paint");
                    Long lValueOf3 = jsonElement6 != null ? Long.valueOf(jsonElement6.getAsLong()) : null;
                    JsonElement jsonElement7 = p0.get("largest_contentful_paint_target_selector");
                    String asString6 = jsonElement7 != null ? jsonElement7.getAsString() : null;
                    JsonElement jsonElement8 = p0.get("first_input_delay");
                    Long lValueOf4 = jsonElement8 != null ? Long.valueOf(jsonElement8.getAsLong()) : null;
                    JsonElement jsonElement9 = p0.get("first_input_time");
                    Long lValueOf5 = jsonElement9 != null ? Long.valueOf(jsonElement9.getAsLong()) : null;
                    JsonElement jsonElement10 = p0.get("first_input_target_selector");
                    String asString7 = jsonElement10 != null ? jsonElement10.getAsString() : null;
                    JsonElement jsonElement11 = p0.get("interaction_to_next_paint");
                    Long lValueOf6 = jsonElement11 != null ? Long.valueOf(jsonElement11.getAsLong()) : null;
                    JsonElement jsonElement12 = p0.get("interaction_to_next_paint_target_selector");
                    String asString8 = jsonElement12 != null ? jsonElement12.getAsString() : null;
                    JsonElement jsonElement13 = p0.get("cumulative_layout_shift");
                    Number asNumber = jsonElement13 != null ? jsonElement13.getAsNumber() : null;
                    JsonElement jsonElement14 = p0.get("cumulative_layout_shift_target_selector");
                    String asString9 = jsonElement14 != null ? jsonElement14.getAsString() : null;
                    JsonElement jsonElement15 = p0.get("dom_complete");
                    Long lValueOf7 = jsonElement15 != null ? Long.valueOf(jsonElement15.getAsLong()) : null;
                    JsonElement jsonElement16 = p0.get("dom_content_loaded");
                    Long lValueOf8 = jsonElement16 != null ? Long.valueOf(jsonElement16.getAsLong()) : null;
                    JsonElement jsonElement17 = p0.get("dom_interactive");
                    Long lValueOf9 = jsonElement17 != null ? Long.valueOf(jsonElement17.getAsLong()) : null;
                    JsonElement jsonElement18 = p0.get("load_event");
                    Long lValueOf10 = jsonElement18 != null ? Long.valueOf(jsonElement18.getAsLong()) : null;
                    JsonElement jsonElement19 = p0.get("first_byte");
                    Long lValueOf11 = jsonElement19 != null ? Long.valueOf(jsonElement19.getAsLong()) : null;
                    JsonElement jsonElement20 = p0.get("custom_timings");
                    if (jsonElement20 == null || (asJsonObject8 = jsonElement20.getAsJsonObject()) == null) {
                        iNotificationSideChannelTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    } else {
                        INotificationSideChannel.Companion companion2 = INotificationSideChannel.INSTANCE;
                        iNotificationSideChannelTuitionPaymentFragmentspecialinlinedviewModeldefault2 = INotificationSideChannel.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject8);
                    }
                    JsonElement jsonElement21 = p0.get("is_active");
                    Boolean boolValueOf = jsonElement21 != null ? Boolean.valueOf(jsonElement21.getAsBoolean()) : null;
                    JsonElement jsonElement22 = p0.get("is_slow_rendered");
                    Boolean boolValueOf2 = jsonElement22 != null ? Boolean.valueOf(jsonElement22.getAsBoolean()) : null;
                    JsonObject asJsonObject9 = p0.get("action").getAsJsonObject();
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3.Companion companion3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(asJsonObject9, "");
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault3.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject9);
                    JsonObject asJsonObject10 = p0.get(Constants.IPC_BUNDLE_KEY_SEND_ERROR).getAsJsonObject();
                    INotificationSideChannelStubProxy.Companion companion4 = INotificationSideChannelStubProxy.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(asJsonObject10, "");
                    INotificationSideChannelStubProxy iNotificationSideChannelStubProxyTuitionPaymentFragmentspecialinlinedviewModeldefault1 = INotificationSideChannelStubProxy.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject10);
                    JsonElement jsonElement23 = p0.get(AppMeasurement.CRASH_ORIGIN);
                    if (jsonElement23 == null || (asJsonObject7 = jsonElement23.getAsJsonObject()) == null) {
                        cancelallTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    } else {
                        cancelAll.Companion companion5 = cancelAll.INSTANCE;
                        cancelallTuitionPaymentFragmentspecialinlinedviewModeldefault1 = cancelAll.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject7);
                    }
                    JsonElement jsonElement24 = p0.get("long_task");
                    if (jsonElement24 == null || (asJsonObject6 = jsonElement24.getAsJsonObject()) == null) {
                        readVarB = null;
                    } else {
                        read.Companion companion6 = read.INSTANCE;
                        readVarB = read.Companion.b(asJsonObject6);
                    }
                    JsonElement jsonElement25 = p0.get("frozen_frame");
                    if (jsonElement25 == null || (asJsonObject5 = jsonElement25.getAsJsonObject()) == null) {
                        getinterfacedescriptorTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    } else {
                        getInterfaceDescriptor.Companion companion7 = getInterfaceDescriptor.INSTANCE;
                        getinterfacedescriptorTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getInterfaceDescriptor.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject5);
                    }
                    JsonObject asJsonObject11 = p0.get("resource").getAsJsonObject();
                    getNotifyChildrenChangedOptions.Companion companion8 = getNotifyChildrenChangedOptions.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(asJsonObject11, "");
                    getNotifyChildrenChangedOptions getnotifychildrenchangedoptionsTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getNotifyChildrenChangedOptions.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject11);
                    JsonElement jsonElement26 = p0.get("frustration");
                    if (jsonElement26 == null || (asJsonObject4 = jsonElement26.getAsJsonObject()) == null) {
                        iNotificationSideChannelStubTuitionPaymentFragmentbindingInflater1 = null;
                    } else {
                        INotificationSideChannelStub.Companion companion9 = INotificationSideChannelStub.INSTANCE;
                        iNotificationSideChannelStubTuitionPaymentFragmentbindingInflater1 = INotificationSideChannelStub.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject4);
                    }
                    JsonElement jsonElement27 = p0.get("in_foreground_periods");
                    if (jsonElement27 == null || (asJsonArray = jsonElement27.getAsJsonArray()) == null) {
                        str = "Unable to parse json into type ViewEventView";
                        arrayList = null;
                    } else {
                        str = "Unable to parse json into type ViewEventView";
                        try {
                            arrayList = new ArrayList(asJsonArray.size());
                            for (JsonElement jsonElement28 : asJsonArray) {
                                connect.Companion companion10 = connect.INSTANCE;
                                JsonObject asJsonObject12 = jsonElement28.getAsJsonObject();
                                Intrinsics.checkNotNullExpressionValue(asJsonObject12, "");
                                arrayList.add(connect.Companion.b(asJsonObject12));
                            }
                        } catch (IllegalStateException e5) {
                            e = e5;
                            illegalStateException = e;
                            str3 = str;
                            throw new JsonParseException(str3, illegalStateException);
                        } catch (NullPointerException e6) {
                            e = e6;
                            nullPointerException = e;
                            throw new JsonParseException(str, nullPointerException);
                        } catch (NumberFormatException e7) {
                            e = e7;
                            numberFormatException = e;
                            str2 = str;
                            throw new JsonParseException(str2, numberFormatException);
                        }
                    }
                    JsonElement jsonElement29 = p0.get("memory_average");
                    Number asNumber2 = jsonElement29 != null ? jsonElement29.getAsNumber() : null;
                    JsonElement jsonElement30 = p0.get("memory_max");
                    Number asNumber3 = jsonElement30 != null ? jsonElement30.getAsNumber() : null;
                    JsonElement jsonElement31 = p0.get("cpu_ticks_count");
                    Number asNumber4 = jsonElement31 != null ? jsonElement31.getAsNumber() : null;
                    JsonElement jsonElement32 = p0.get("cpu_ticks_per_second");
                    Number asNumber5 = jsonElement32 != null ? jsonElement32.getAsNumber() : null;
                    JsonElement jsonElement33 = p0.get("refresh_rate_average");
                    Number asNumber6 = jsonElement33 != null ? jsonElement33.getAsNumber() : null;
                    JsonElement jsonElement34 = p0.get("refresh_rate_min");
                    Number asNumber7 = jsonElement34 != null ? jsonElement34.getAsNumber() : null;
                    JsonElement jsonElement35 = p0.get("flutter_build_time");
                    if (jsonElement35 == null || (asJsonObject3 = jsonElement35.getAsJsonObject()) == null) {
                        remoteActionCompatParcelizerB = null;
                    } else {
                        RemoteActionCompatParcelizer.Companion companion11 = RemoteActionCompatParcelizer.INSTANCE;
                        remoteActionCompatParcelizerB = RemoteActionCompatParcelizer.Companion.b(asJsonObject3);
                    }
                    JsonElement jsonElement36 = p0.get("flutter_raster_time");
                    if (jsonElement36 == null || (asJsonObject2 = jsonElement36.getAsJsonObject()) == null) {
                        remoteActionCompatParcelizerB2 = null;
                    } else {
                        RemoteActionCompatParcelizer.Companion companion12 = RemoteActionCompatParcelizer.INSTANCE;
                        remoteActionCompatParcelizerB2 = RemoteActionCompatParcelizer.Companion.b(asJsonObject2);
                    }
                    JsonElement jsonElement37 = p0.get("js_refresh_rate");
                    if (jsonElement37 == null || (asJsonObject = jsonElement37.getAsJsonObject()) == null) {
                        remoteActionCompatParcelizerB3 = null;
                    } else {
                        RemoteActionCompatParcelizer.Companion companion13 = RemoteActionCompatParcelizer.INSTANCE;
                        remoteActionCompatParcelizerB3 = RemoteActionCompatParcelizer.Companion.b(asJsonObject);
                    }
                    Intrinsics.checkNotNullExpressionValue(asString3, "");
                    Intrinsics.checkNotNullExpressionValue(asString4, "");
                    return new search(asString3, asString, asString4, asString5, lValueOf, loadingTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3, asLong, lValueOf2, lValueOf3, asString6, lValueOf4, lValueOf5, asString7, lValueOf6, asString8, asNumber, asString9, lValueOf7, lValueOf8, lValueOf9, lValueOf10, lValueOf11, iNotificationSideChannelTuitionPaymentFragmentspecialinlinedviewModeldefault2, boolValueOf, boolValueOf2, tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1, iNotificationSideChannelStubProxyTuitionPaymentFragmentspecialinlinedviewModeldefault1, cancelallTuitionPaymentFragmentspecialinlinedviewModeldefault1, readVarB, getinterfacedescriptorTuitionPaymentFragmentspecialinlinedviewModeldefault2, getnotifychildrenchangedoptionsTuitionPaymentFragmentspecialinlinedviewModeldefault1, iNotificationSideChannelStubTuitionPaymentFragmentbindingInflater1, arrayList, asNumber2, asNumber3, asNumber4, asNumber5, asNumber6, asNumber7, remoteActionCompatParcelizerB, remoteActionCompatParcelizerB2, remoteActionCompatParcelizerB3);
                } catch (IllegalStateException e8) {
                    e = e8;
                    str = "Unable to parse json into type ViewEventView";
                } catch (NullPointerException e9) {
                    e = e9;
                    str = "Unable to parse json into type ViewEventView";
                } catch (NumberFormatException e10) {
                    e = e10;
                    str = "Unable to parse json into type ViewEventView";
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final String toString() throws Throwable {
            Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
            Object[] objArr;
            int i = 2 % 2;
            String str = this.connect;
            String str2 = this.unsubscribe;
            String str3 = this.onConnectionSuspended;
            String str4 = this.MediaBrowserCompatCallbackHandler;
            Long l = this.search;
            LoadingType loadingType = this.getServiceComponent;
            long j = this.onConnected;
            Long l2 = this.cancel;
            Long l3 = this.getItem;
            String str5 = this.getNotifyChildrenChangedOptions;
            Long l4 = this.cancelAll;
            Long l5 = this.INotificationSideChannelStubProxy;
            String str6 = this.onTransact;
            Long l6 = this.write;
            String str7 = this.MediaBrowserCompat;
            Number number = this.b;
            String str8 = this.g;
            Long l7 = this.asBinder;
            Long l8 = this.a;
            Long l9 = this.d;
            Long l10 = this.disconnect;
            Long l11 = this.INotificationSideChannel;
            INotificationSideChannel iNotificationSideChannel = this.asInterface;
            Boolean bool = this.IconCompatParcelizer;
            Boolean bool2 = this.getRoot;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = this.notify;
            cancelAll cancelall = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            read readVar = this.isConnected;
            getInterfaceDescriptor getinterfacedescriptor = this.INotificationSideChannelDefault;
            getNotifyChildrenChangedOptions getnotifychildrenchangedoptions = this.subscribe;
            INotificationSideChannelStub iNotificationSideChannelStub = this.getInterfaceDescriptor;
            List<connect> list = this.read;
            Number number2 = this.sendCustomAction;
            Number number3 = this.getSessionToken;
            Number number4 = this.TuitionPaymentFragmentbindingInflater1;
            Number number5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Number number6 = this.setCallbacksMessenger;
            Number number7 = this.handleMessage;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.INotificationSideChannelStub;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.RemoteActionCompatParcelizer;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = this.getExtras;
            StringBuilder sb = new StringBuilder("search(connect=");
            sb.append(str);
            sb.append(", unsubscribe=");
            sb.append(str2);
            sb.append(", onConnectionSuspended=");
            sb.append(str3);
            sb.append(", MediaBrowserCompatCallbackHandler=");
            sb.append(str4);
            sb.append(", search=");
            sb.append(l);
            sb.append(", getServiceComponent=");
            sb.append(loadingType);
            sb.append(", onConnected=");
            sb.append(j);
            sb.append(", cancel=");
            sb.append(l2);
            sb.append(", getItem=");
            sb.append(l3);
            sb.append(", getNotifyChildrenChangedOptions=");
            sb.append(str5);
            sb.append(", cancelAll=");
            sb.append(l4);
            sb.append(", INotificationSideChannelStubProxy=");
            sb.append(l5);
            sb.append(", onTransact=");
            sb.append(str6);
            sb.append(", write=");
            sb.append(l6);
            sb.append(", MediaBrowserCompat=");
            sb.append(str7);
            sb.append(", b=");
            sb.append(number);
            sb.append(", g=");
            sb.append(str8);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29944);
                int i2 = 1756 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int iRgb = Color.rgb(0, 0, 0) + 16777239;
                byte b = $$a[7];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                c(b, b2, b2, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i2, iRgb, 986134021, false, (String) objArr2[0], null);
            }
            long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            e(new char[]{42154, 49478, 28521, 38160, 13096, 22989, 51197, 28112, 35772, 12355, 24123, 50265, 25110, 34879, 14037, 23779, 64150, 24731, 36177, 11133, 20756, 65343}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 26082, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(new char[]{42158, 9164, 43644, 13050, 47380, 441, 34861, 6004, 40950, 26217, 61065, 29990, 64934, 17609, 50036}, TextUtils.lastIndexOf("", '0', 0) + 34668, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cKeyCodeFromString = (char) (29944 - KeyEvent.keyCodeFromString(""));
                int fadingEdgeLength = 1755 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int iMyTid = 23 - (Process.myTid() >> 22);
                byte[] bArr = $$a;
                byte b3 = bArr[7];
                byte b4 = bArr[28];
                Object[] objArr5 = new Object[1];
                c(b3, b4, (byte) (b4 | 36), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, fadingEdgeLength, iMyTid, 1596667560, false, (String) objArr5[0], null);
            }
            if (j2 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cResolveSize = (char) (View.resolveSize(0, 0) + 29944);
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1755;
                    int i3 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[7];
                    byte b6 = bArr2[28];
                    Object[] objArr6 = new Object[1];
                    c(b5, b6, (byte) (b6 | 88), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, windowTouchSlop, i3, 1599039318, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i4 = ((int[]) objArr7[0])[0];
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{i4}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i5 = ~iIdentityHashCode;
                int i6 = (((1541093546 + (((~((-965173100) | i5)) | (-752570674)) * 519)) + (((~(i5 | (-679694626))) | (~((-72876049) | iIdentityHashCode))) * (-519))) + (((~(iIdentityHashCode | (-752570674))) | 965173099) * 519)) - 1623252315;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i8 ^ (i8 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                e(new char[]{42145, 44901, 45859, 34759, 35801, 40876, 57968, 62988, 64212, 52898, 53902, 9559, 10508, 15676, 508, 5511}, 3023 - Color.argb(0, 0, 0, 0), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(new char[]{42146, 34674, 58132, 53042, 11211, 6131, 29585, 24505, 47723, 58991, 49690, 11996, 2772, 30365, 21177, 48477}, Color.argb(0, 0, 0, 0) + 9181, objArr9);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr10 = {-1618594313};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 42049), 1726 - (ViewConfiguration.getJumpTapTimeout() >> 16), 29 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrTuitionPaymentFragmentbindingInflater1$5f1425da = R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), -1623252315);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) (29944 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        int i9 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1754;
                        int tapTimeout = 23 - (ViewConfiguration.getTapTimeout() >> 16);
                        byte[] bArr3 = $$a;
                        byte b7 = bArr3[7];
                        byte b8 = bArr3[28];
                        Object[] objArr11 = new Object[1];
                        c(b7, b8, (byte) (b8 | 88), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, i9, tapTimeout, 1599039318, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                    try {
                        Object[] objArr12 = new Object[1];
                        e(new char[]{42154, 49478, 28521, 38160, 13096, 22989, 51197, 28112, 35772, 12355, 24123, 50265, 25110, 34879, 14037, 23779, 64150, 24731, 36177, 11133, 20756, 65343}, 26083 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        e(new char[]{42158, 9164, 43644, 13050, 47380, 441, 34861, 6004, 40950, 26217, 61065, 29990, 64934, 17609, 50036}, 34666 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr13);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char pressedStateDuration = (char) (29944 - (ViewConfiguration.getPressedStateDuration() >> 16));
                            int i10 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1754;
                            int mirror = 'G' - AndroidCharacter.getMirror('0');
                            byte[] bArr4 = $$a;
                            byte b9 = bArr4[7];
                            byte b10 = bArr4[28];
                            Object[] objArr14 = new Object[1];
                            c(b9, b10, (byte) (b10 | 36), objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration, i10, mirror, 1596667560, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29943);
                            int iRgb2 = (-16775461) - Color.rgb(0, 0, 0);
                            int scrollBarSize = 23 - (ViewConfiguration.getScrollBarSize() >> 8);
                            byte b11 = $$a[7];
                            byte b12 = b11;
                            Object[] objArr15 = new Object[1];
                            c(b11, b12, b12, objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, iRgb2, scrollBarSize, 986134021, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
            int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
            int i12 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
            if (i12 == i11) {
                int i13 = onProgressUpdate + 71;
                MediaBrowserCompatConnectionCallbackStubApi21 = i13 % 128;
                int i14 = i13 % 2;
                int i15 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
                int i16 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
                objArr = new Object[]{new int[]{i16}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i17 = i15 + 1768122274 + (((~((-540020865) | (~iElapsedRealtime))) | 327418438) * (-591)) + ((iElapsedRealtime | (-540020865)) * 591);
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr[3])[0] = i19 ^ (i19 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
                if (strArr != null) {
                    int i20 = 0;
                    while (i20 < strArr.length) {
                        int i21 = MediaBrowserCompatConnectionCallbackStubApi21 + 15;
                        onProgressUpdate = i21 % 128;
                        if (i21 % 2 != 0) {
                            arrayList.add(strArr[i20]);
                            i20 += 103;
                        } else {
                            arrayList.add(strArr[i20]);
                            i20++;
                        }
                    }
                }
                Toast.makeText((Context) null, i12 / (((i12 - 1) * i12) % 2), 0).show();
                int i22 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
                int i23 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
                objArr = new Object[]{new int[]{i23}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i24 = i22 + 794893385 + (((~(432495360 | iIdentityHashCode2)) | (-645097787)) * (-964)) + (((~((~iIdentityHashCode2) | 432495360)) | (-1073183547)) * (-964));
                int i25 = (i24 << 13) ^ i24;
                int i26 = i25 ^ (i25 >>> 17);
                ((int[]) objArr[3])[0] = i26 ^ (i26 << 5);
            }
            sb.append(", asBinder=");
            sb.append(l7);
            sb.append(", a=");
            sb.append(l8);
            sb.append(", d=");
            sb.append(l9);
            sb.append(", disconnect=");
            sb.append(l10);
            sb.append(", INotificationSideChannel=");
            sb.append(l11);
            sb.append(", asInterface=");
            sb.append(iNotificationSideChannel);
            sb.append(", IconCompatParcelizer=");
            sb.append(bool);
            int i27 = ((int[]) objArr[3])[0];
            int i28 = ((((i27 * i27) - (~(-(405838568 * i27)))) - 1) - (~(-(i27 * (-1711144470))))) - 1;
            int i29 = (i28 & 1787176721) + (1787176721 | i28);
            int i30 = ((i29 >> 29) - 15) / 8;
            int i31 = ((i30 | 1) << 1) - (i30 ^ 1);
            int i32 = ((i29 | i31) << 1) - (i31 ^ i29);
            int i33 = i29 >> 24;
            int i34 = ((i33 ^ (-511)) + ((i33 & (-511)) << 1)) / 256;
            int i35 = (-(i32 ^ ((i34 ^ 1) + ((i34 & 1) << 1)))) + 7;
            int i36 = i35 >> 23;
            int i37 = (((i36 | (-1023)) << 1) - (i36 ^ (-1023))) / 512;
            int i38 = ((i37 | 1) << 1) - (i37 ^ 1);
            sb.append("10\\26\\10\\18\\28\\, getRoot=".substring(106260 / ((i35 & (-(((i38 | 1) << 1) - (i38 ^ 1)))) * PointerIconCompat.TYPE_NO_DROP)));
            sb.append(bool2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
            sb.append(", notify=");
            sb.append(iNotificationSideChannelStubProxy);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(cancelall);
            sb.append(", isConnected=");
            sb.append(readVar);
            sb.append(", INotificationSideChannelDefault=");
            sb.append(getinterfacedescriptor);
            sb.append(", subscribe=");
            sb.append(getnotifychildrenchangedoptions);
            sb.append(", getInterfaceDescriptor=");
            sb.append(iNotificationSideChannelStub);
            sb.append(", read=");
            sb.append(list);
            sb.append(", sendCustomAction=");
            sb.append(number2);
            sb.append(", getSessionToken=");
            sb.append(number3);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(number4);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(number5);
            sb.append(", setCallbacksMessenger=");
            sb.append(number6);
            sb.append(", handleMessage=");
            sb.append(number7);
            sb.append(", INotificationSideChannelStub=");
            sb.append(remoteActionCompatParcelizer);
            sb.append(", RemoteActionCompatParcelizer=");
            sb.append(remoteActionCompatParcelizer2);
            sb.append(", getExtras=");
            sb.append(remoteActionCompatParcelizer3);
            sb.append(")");
            return sb.toString();
        }

        public static /* synthetic */ search TuitionPaymentFragmentspecialinlinedviewModeldefault3(search searchVar, String str, String str2, String str3, String str4, Long l, LoadingType loadingType, long j, Long l2, Long l3, String str5, Long l4, Long l5, String str6, Long l6, String str7, Number number, String str8, Long l7, Long l8, Long l9, Long l10, Long l11, INotificationSideChannel iNotificationSideChannel, Boolean bool, Boolean bool2, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, INotificationSideChannelStubProxy iNotificationSideChannelStubProxy, cancelAll cancelall, read readVar, getInterfaceDescriptor getinterfacedescriptor, getNotifyChildrenChangedOptions getnotifychildrenchangedoptions, INotificationSideChannelStub iNotificationSideChannelStub, int i) {
            long j2;
            Long l12;
            Long l13;
            Boolean bool3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4;
            getNotifyChildrenChangedOptions getnotifychildrenchangedoptions2;
            Long l14;
            int i2 = 2 % 2;
            String str9 = (i & 1) != 0 ? searchVar.connect : str;
            String str10 = (i & 2) != 0 ? searchVar.unsubscribe : str2;
            String str11 = (i & 4) != 0 ? searchVar.onConnectionSuspended : str3;
            String str12 = (i & 8) != 0 ? searchVar.MediaBrowserCompatCallbackHandler : str4;
            Long l15 = (i & 16) != 0 ? searchVar.search : l;
            LoadingType loadingType2 = (i & 32) != 0 ? searchVar.getServiceComponent : loadingType;
            if ((i & 64) != 0) {
                int i3 = onProgressUpdate + 19;
                MediaBrowserCompatConnectionCallbackStubApi21 = i3 % 128;
                int i4 = i3 % 2;
                j2 = searchVar.onConnected;
            } else {
                j2 = j;
            }
            Long l16 = (i & 128) != 0 ? searchVar.cancel : l2;
            Long l17 = (i & 256) != 0 ? searchVar.getItem : l3;
            String str13 = (i & 512) != 0 ? searchVar.getNotifyChildrenChangedOptions : str5;
            Long l18 = (i & 1024) != 0 ? searchVar.cancelAll : l4;
            Long l19 = (i & 2048) != 0 ? searchVar.INotificationSideChannelStubProxy : l5;
            String str14 = (i & 4096) != 0 ? searchVar.onTransact : str6;
            Long l20 = (i & 8192) != 0 ? searchVar.write : l6;
            String str15 = (i & 16384) != 0 ? searchVar.MediaBrowserCompat : str7;
            Number number2 = (32768 & i) != 0 ? searchVar.b : number;
            String str16 = (65536 & i) != 0 ? searchVar.g : str8;
            if ((131072 & i) != 0) {
                int i5 = MediaBrowserCompatConnectionCallbackStubApi21 + 91;
                onProgressUpdate = i5 % 128;
                if (i5 % 2 != 0) {
                    Long l21 = searchVar.asBinder;
                    throw null;
                }
                l12 = searchVar.asBinder;
            } else {
                l12 = l7;
            }
            Long l22 = (262144 & i) != 0 ? searchVar.a : l8;
            Long l23 = (524288 & i) != 0 ? searchVar.d : l9;
            if ((1048576 & i) != 0) {
                int i6 = MediaBrowserCompatConnectionCallbackStubApi21 + 25;
                onProgressUpdate = i6 % 128;
                if (i6 % 2 != 0) {
                    l14 = searchVar.disconnect;
                    int i7 = 41 / 0;
                } else {
                    l14 = searchVar.disconnect;
                }
                l13 = l14;
            } else {
                l13 = l10;
            }
            Long l24 = (2097152 & i) != 0 ? searchVar.INotificationSideChannel : l11;
            INotificationSideChannel iNotificationSideChannel2 = (4194304 & i) != 0 ? searchVar.asInterface : iNotificationSideChannel;
            if ((8388608 & i) != 0) {
                int i8 = MediaBrowserCompatConnectionCallbackStubApi21 + 67;
                onProgressUpdate = i8 % 128;
                if (i8 % 2 != 0) {
                    Boolean bool4 = searchVar.IconCompatParcelizer;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                bool3 = searchVar.IconCompatParcelizer;
            } else {
                bool3 = bool;
            }
            Boolean bool5 = (16777216 & i) != 0 ? searchVar.getRoot : bool2;
            if ((33554432 & i) != 0) {
                int i9 = MediaBrowserCompatConnectionCallbackStubApi21 + 113;
                onProgressUpdate = i9 % 128;
                if (i9 % 2 != 0) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault4 = searchVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i10 = 98 / 0;
                } else {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault4 = searchVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
            } else {
                tuitionPaymentFragmentspecialinlinedviewModeldefault4 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            INotificationSideChannelStubProxy iNotificationSideChannelStubProxy2 = (67108864 & i) != 0 ? searchVar.notify : iNotificationSideChannelStubProxy;
            cancelAll cancelall2 = (i & 134217728) != 0 ? searchVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : cancelall;
            read readVar2 = (268435456 & i) != 0 ? searchVar.isConnected : readVar;
            getInterfaceDescriptor getinterfacedescriptor2 = (536870912 & i) != 0 ? searchVar.INotificationSideChannelDefault : getinterfacedescriptor;
            if ((1073741824 & i) != 0) {
                int i11 = onProgressUpdate + 15;
                MediaBrowserCompatConnectionCallbackStubApi21 = i11 % 128;
                if (i11 % 2 == 0) {
                    getNotifyChildrenChangedOptions getnotifychildrenchangedoptions3 = searchVar.subscribe;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                getnotifychildrenchangedoptions2 = searchVar.subscribe;
            } else {
                getnotifychildrenchangedoptions2 = getnotifychildrenchangedoptions;
            }
            INotificationSideChannelStub iNotificationSideChannelStub2 = (i & Integer.MIN_VALUE) != 0 ? searchVar.getInterfaceDescriptor : iNotificationSideChannelStub;
            List<connect> list = searchVar.read;
            Number number3 = searchVar.sendCustomAction;
            Number number4 = searchVar.getSessionToken;
            Number number5 = searchVar.TuitionPaymentFragmentbindingInflater1;
            Number number6 = searchVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Number number7 = searchVar.setCallbacksMessenger;
            Number number8 = searchVar.handleMessage;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = searchVar.INotificationSideChannelStub;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = searchVar.RemoteActionCompatParcelizer;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = searchVar.getExtras;
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str11, "");
            Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
            Intrinsics.checkNotNullParameter(iNotificationSideChannelStubProxy2, "");
            Intrinsics.checkNotNullParameter(getnotifychildrenchangedoptions2, "");
            search searchVar2 = new search(str9, str10, str11, str12, l15, loadingType2, j2, l16, l17, str13, l18, l19, str14, l20, str15, number2, str16, l12, l22, l23, l13, l24, iNotificationSideChannel2, bool3, bool5, tuitionPaymentFragmentspecialinlinedviewModeldefault4, iNotificationSideChannelStubProxy2, cancelall2, readVar2, getinterfacedescriptor2, getnotifychildrenchangedoptions2, iNotificationSideChannelStub2, list, number3, number4, number5, number6, number7, number8, remoteActionCompatParcelizer, remoteActionCompatParcelizer2, remoteActionCompatParcelizer3);
            int i12 = MediaBrowserCompatConnectionCallbackStubApi21 + 5;
            onProgressUpdate = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 44 / 0;
            }
            return searchVar2;
        }

        static {
            MediaBrowserCompatConnectionCallbackConnectionCallbackInternal = 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            INSTANCE = new Companion(null);
            int i = onConnected + 93;
            MediaBrowserCompatConnectionCallbackConnectionCallbackInternal = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean equals(Object p0) {
            int i = 2 % 2;
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof search)) {
                return false;
            }
            search searchVar = (search) p0;
            if (!Intrinsics.areEqual(this.connect, searchVar.connect) || !Intrinsics.areEqual(this.unsubscribe, searchVar.unsubscribe)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onConnectionSuspended, searchVar.onConnectionSuspended)) {
                int i2 = onProgressUpdate + 49;
                MediaBrowserCompatConnectionCallbackStubApi21 = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.MediaBrowserCompatCallbackHandler, searchVar.MediaBrowserCompatCallbackHandler) || !Intrinsics.areEqual(this.search, searchVar.search)) {
                return false;
            }
            if (this.getServiceComponent != searchVar.getServiceComponent) {
                int i4 = onProgressUpdate + 13;
                MediaBrowserCompatConnectionCallbackStubApi21 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (this.onConnected != searchVar.onConnected || !Intrinsics.areEqual(this.cancel, searchVar.cancel)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.getItem, searchVar.getItem)) {
                int i6 = onProgressUpdate + 27;
                MediaBrowserCompatConnectionCallbackStubApi21 = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.getNotifyChildrenChangedOptions, searchVar.getNotifyChildrenChangedOptions) || !Intrinsics.areEqual(this.cancelAll, searchVar.cancelAll) || !Intrinsics.areEqual(this.INotificationSideChannelStubProxy, searchVar.INotificationSideChannelStubProxy) || !Intrinsics.areEqual(this.onTransact, searchVar.onTransact)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.write, searchVar.write)) {
                int i8 = MediaBrowserCompatConnectionCallbackStubApi21 + 41;
                onProgressUpdate = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.MediaBrowserCompat, searchVar.MediaBrowserCompat) || (!Intrinsics.areEqual(this.b, searchVar.b)) || !Intrinsics.areEqual(this.g, searchVar.g) || !Intrinsics.areEqual(this.asBinder, searchVar.asBinder) || !Intrinsics.areEqual(this.a, searchVar.a) || !Intrinsics.areEqual(this.d, searchVar.d) || !Intrinsics.areEqual(this.disconnect, searchVar.disconnect) || !Intrinsics.areEqual(this.INotificationSideChannel, searchVar.INotificationSideChannel) || !Intrinsics.areEqual(this.asInterface, searchVar.asInterface)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.IconCompatParcelizer, searchVar.IconCompatParcelizer)) {
                int i10 = onProgressUpdate + 57;
                MediaBrowserCompatConnectionCallbackStubApi21 = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.getRoot, searchVar.getRoot)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, searchVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                int i12 = MediaBrowserCompatConnectionCallbackStubApi21 + 23;
                onProgressUpdate = i12 % 128;
                int i13 = i12 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.notify, searchVar.notify) || !Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, searchVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3) || !Intrinsics.areEqual(this.isConnected, searchVar.isConnected)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.INotificationSideChannelDefault, searchVar.INotificationSideChannelDefault)) {
                int i14 = onProgressUpdate;
                int i15 = i14 + 109;
                MediaBrowserCompatConnectionCallbackStubApi21 = i15 % 128;
                int i16 = i15 % 2;
                int i17 = i14 + 29;
                MediaBrowserCompatConnectionCallbackStubApi21 = i17 % 128;
                if (i17 % 2 == 0) {
                    int i18 = 89 / 0;
                }
                return false;
            }
            if (!Intrinsics.areEqual(this.subscribe, searchVar.subscribe) || !Intrinsics.areEqual(this.getInterfaceDescriptor, searchVar.getInterfaceDescriptor)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.read, searchVar.read)) {
                int i19 = onProgressUpdate + 49;
                MediaBrowserCompatConnectionCallbackStubApi21 = i19 % 128;
                int i20 = i19 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.sendCustomAction, searchVar.sendCustomAction) || !Intrinsics.areEqual(this.getSessionToken, searchVar.getSessionToken) || !Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, searchVar.TuitionPaymentFragmentbindingInflater1) || !Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, searchVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                return false;
            }
            if (Intrinsics.areEqual(this.setCallbacksMessenger, searchVar.setCallbacksMessenger)) {
                return Intrinsics.areEqual(this.handleMessage, searchVar.handleMessage) && Intrinsics.areEqual(this.INotificationSideChannelStub, searchVar.INotificationSideChannelStub) && Intrinsics.areEqual(this.RemoteActionCompatParcelizer, searchVar.RemoteActionCompatParcelizer) && Intrinsics.areEqual(this.getExtras, searchVar.getExtras);
            }
            int i21 = MediaBrowserCompatConnectionCallbackStubApi21 + 111;
            onProgressUpdate = i21 % 128;
            int i22 = i21 % 2;
            return false;
        }

        public final int hashCode() {
            int iHashCode;
            int iHashCode2;
            int iHashCode3;
            int iHashCode4;
            int iHashCode5;
            int i;
            int i2;
            int iHashCode6;
            int i3 = 2 % 2;
            int iHashCode7 = this.connect.hashCode();
            String str = this.unsubscribe;
            int iHashCode8 = str == null ? 0 : str.hashCode();
            int iHashCode9 = this.onConnectionSuspended.hashCode();
            String str2 = this.MediaBrowserCompatCallbackHandler;
            int iHashCode10 = str2 == null ? 0 : str2.hashCode();
            Long l = this.search;
            if (l == null) {
                int i4 = MediaBrowserCompatConnectionCallbackStubApi21 + 115;
                onProgressUpdate = i4 % 128;
                iHashCode = i4 % 2 != 0 ? 1 : 0;
            } else {
                iHashCode = l.hashCode();
            }
            LoadingType loadingType = this.getServiceComponent;
            if (loadingType == null) {
                int i5 = onProgressUpdate + 35;
                MediaBrowserCompatConnectionCallbackStubApi21 = i5 % 128;
                int i6 = i5 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = loadingType.hashCode();
            }
            int iHashCode11 = Long.hashCode(this.onConnected);
            Long l2 = this.cancel;
            int iHashCode12 = l2 == null ? 0 : l2.hashCode();
            Long l3 = this.getItem;
            int iHashCode13 = l3 == null ? 0 : l3.hashCode();
            String str3 = this.getNotifyChildrenChangedOptions;
            int iHashCode14 = str3 == null ? 0 : str3.hashCode();
            Long l4 = this.cancelAll;
            int iHashCode15 = l4 == null ? 0 : l4.hashCode();
            Long l5 = this.INotificationSideChannelStubProxy;
            int iHashCode16 = l5 == null ? 0 : l5.hashCode();
            String str4 = this.onTransact;
            if (str4 == null) {
                int i7 = MediaBrowserCompatConnectionCallbackStubApi21 + 71;
                onProgressUpdate = i7 % 128;
                int i8 = i7 % 2;
                iHashCode3 = 0;
            } else {
                iHashCode3 = str4.hashCode();
            }
            Long l6 = this.write;
            if (l6 == null) {
                int i9 = MediaBrowserCompatConnectionCallbackStubApi21 + 39;
                onProgressUpdate = i9 % 128;
                int i10 = i9 % 2;
                iHashCode4 = 0;
            } else {
                iHashCode4 = l6.hashCode();
            }
            String str5 = this.MediaBrowserCompat;
            int iHashCode17 = str5 == null ? 0 : str5.hashCode();
            Number number = this.b;
            int iHashCode18 = number == null ? 0 : number.hashCode();
            String str6 = this.g;
            int iHashCode19 = str6 == null ? 0 : str6.hashCode();
            Long l7 = this.asBinder;
            int iHashCode20 = l7 == null ? 0 : l7.hashCode();
            Long l8 = this.a;
            int iHashCode21 = l8 == null ? 0 : l8.hashCode();
            Long l9 = this.d;
            int iHashCode22 = l9 == null ? 0 : l9.hashCode();
            Long l10 = this.disconnect;
            int iHashCode23 = l10 == null ? 0 : l10.hashCode();
            Long l11 = this.INotificationSideChannel;
            if (l11 == null) {
                int i11 = MediaBrowserCompatConnectionCallbackStubApi21 + 107;
                onProgressUpdate = i11 % 128;
                int i12 = i11 % 2;
                iHashCode5 = 0;
            } else {
                iHashCode5 = l11.hashCode();
            }
            INotificationSideChannel iNotificationSideChannel = this.asInterface;
            int iHashCode24 = iNotificationSideChannel == null ? 0 : iNotificationSideChannel.hashCode();
            Boolean bool = this.IconCompatParcelizer;
            int iHashCode25 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.getRoot;
            int iHashCode26 = bool2 == null ? 0 : bool2.hashCode();
            int iHashCode27 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
            int iHashCode28 = this.notify.hashCode();
            cancelAll cancelall = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode29 = cancelall == null ? 0 : cancelall.hashCode();
            read readVar = this.isConnected;
            int iHashCode30 = readVar == null ? 0 : readVar.hashCode();
            getInterfaceDescriptor getinterfacedescriptor = this.INotificationSideChannelDefault;
            int iHashCode31 = getinterfacedescriptor == null ? 0 : getinterfacedescriptor.hashCode();
            int iHashCode32 = this.subscribe.hashCode();
            INotificationSideChannelStub iNotificationSideChannelStub = this.getInterfaceDescriptor;
            if (iNotificationSideChannelStub == null) {
                i = 0;
            } else {
                int iHashCode33 = iNotificationSideChannelStub.hashCode();
                int i13 = onProgressUpdate + 21;
                MediaBrowserCompatConnectionCallbackStubApi21 = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 4 % 5;
                }
                i = iHashCode33;
            }
            List<connect> list = this.read;
            if (list == null) {
                int i15 = onProgressUpdate + 3;
                i2 = i;
                MediaBrowserCompatConnectionCallbackStubApi21 = i15 % 128;
                iHashCode6 = i15 % 2 == 0 ? 1 : 0;
            } else {
                i2 = i;
                iHashCode6 = list.hashCode();
            }
            Number number2 = this.sendCustomAction;
            int iHashCode34 = number2 == null ? 0 : number2.hashCode();
            Number number3 = this.getSessionToken;
            int iHashCode35 = number3 == null ? 0 : number3.hashCode();
            Number number4 = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode36 = number4 == null ? 0 : number4.hashCode();
            Number number5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode37 = number5 == null ? 0 : number5.hashCode();
            Number number6 = this.setCallbacksMessenger;
            int iHashCode38 = number6 == null ? 0 : number6.hashCode();
            Number number7 = this.handleMessage;
            int iHashCode39 = number7 == null ? 0 : number7.hashCode();
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.INotificationSideChannelStub;
            int iHashCode40 = remoteActionCompatParcelizer == null ? 0 : remoteActionCompatParcelizer.hashCode();
            RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.RemoteActionCompatParcelizer;
            int iHashCode41 = remoteActionCompatParcelizer2 == null ? 0 : remoteActionCompatParcelizer2.hashCode();
            RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = this.getExtras;
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode7 * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode5) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + i2) * 31) + iHashCode6) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + (remoteActionCompatParcelizer3 != null ? remoteActionCompatParcelizer3.hashCode() : 0);
        }

        static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            setInternalConnectionCallback = 2678960677967105488L;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$getSessionToken;", "", "", "p0", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;", "p1", "", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/Boolean;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "asBinder", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getSessionToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static char f745a;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static int cancelAll;
        private static int d;
        private static long g;
        private final Boolean TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        private final Boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final Boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
        private final ViewEventSessionType b;
        private static final byte[] $$c = {5, 11, -122, -94};
        private static final int $$f = 128;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {93, -77, 2, Base64.padSymbol, 9, 10, -3, 2, 10, 15, -69, 58, 17, 8, 2, 11, 4, -6, 10, -4, 19, -64, Base64.padSymbol, 11, 8, 13, -68, 42, 38, -14, 22, 7, -10, 4, -8, 22, 6, 8, -2, -13, 39, -14, 22, -11, 20, -4, -2, 8, 4, -59, 68, 17, 3, 5, -7, 18, -5, -59, 18, 38, -7, 16, -6, 11, 4, -25, 22, 29, -7, -3, 14, 11, -41, 49, -12, 11, 11, -3, 14, 11, 4, 2, -6, 3, 11, -3, 16, 2, 10, 3, 2, 10, -4, 4, 23, -8, 1, 23, -37, 39, -6, 6, 12, -3, 6, 6, 0, 25, -4, 13, -62};
        private static final int $$e = 62;
        private static final byte[] $$a = {115, 25, -47, -94, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
        private static final int $$b = 187;
        private static int notify = 0;
        private static int INotificationSideChannel = 1;
        private static int asInterface = 0;

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 + 84
                byte[] r0 = com.datadog.android.rum.model.ViewEvent.getSessionToken.$$a
                int r7 = r7 * 52
                int r1 = 53 - r7
                int r6 = r6 * 52
                int r6 = r6 + 4
                byte[] r1 = new byte[r1]
                int r7 = 52 - r7
                r2 = 0
                if (r0 != 0) goto L17
                r8 = r6
                r3 = r7
                r4 = r2
                goto L2e
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r7) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L25:
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2e:
                int r6 = -r6
                int r3 = r3 + r6
                int r6 = r3 + (-11)
                int r8 = r8 + 1
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.ViewEvent.getSessionToken.c(byte, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void f(byte r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 55
                int r7 = 59 - r7
                int r8 = r8 * 23
                int r8 = r8 + 84
                int r6 = r6 * 3
                int r6 = r6 + 53
                byte[] r0 = com.datadog.android.rum.model.ViewEvent.getSessionToken.$$d
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L17
                r4 = r6
                r8 = r7
                r3 = r2
                goto L2f
            L17:
                r3 = r2
            L18:
                r5 = r8
                r8 = r7
                r7 = r5
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2a:
                r4 = r0[r8]
                r5 = r8
                r8 = r7
                r7 = r5
            L2f:
                int r7 = r7 + 1
                int r8 = r8 + r4
                int r8 = r8 + (-5)
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.ViewEvent.getSessionToken.f(byte, int, int, java.lang.Object[]):void");
        }

        private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            SessionProcessor sessionProcessor = new SessionProcessor();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr3.length;
            char[] cArr6 = new char[length3];
            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                int i4 = $11 + 39;
                $10 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - TextUtils.getCapsMode("", 0, 0)), ExpandableListView.getPackedPositionType(0L) + 1235, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 34, -653973969, false, $$g(b, b2, (byte) (b2 + 2)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2763, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15, 1504416861, false, $$g(b3, b4, b4), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        try {
                            Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.MeasureSpec.getMode(0) + 43325), 252 - ImageFormat.getBitsPerPixel(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b5 = (byte) 0;
                                    byte b6 = b5;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - TextUtils.indexOf("", "")), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2892, TextUtils.getOffsetAfter("", 0) + 17, 2012627446, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = sessionProcessor.b;
                                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (g ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) d) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) f745a) ^ (-6377398940819159759L)))));
                                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                                i2 = 2;
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
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            objArr[0] = new String(cArr6);
            int i6 = $10 + 111;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }

        public getSessionToken(String str, ViewEventSessionType viewEventSessionType, Boolean bool, Boolean bool2, Boolean bool3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(viewEventSessionType, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            this.b = viewEventSessionType;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bool;
            this.TuitionPaymentFragmentbindingInflater1 = bool2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bool3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ getSessionToken(String str, ViewEventSessionType viewEventSessionType, Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            Boolean bool4;
            Boolean bool5;
            Object obj = null;
            if ((i & 4) != 0) {
                int i2 = notify + 115;
                INotificationSideChannel = i2 % 128;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                bool4 = null;
            } else {
                bool4 = bool;
            }
            if ((i & 8) != 0) {
                int i3 = INotificationSideChannel + 3;
                notify = i3 % 128;
                if (i3 % 2 != 0) {
                    Boolean bool6 = Boolean.TRUE;
                    throw null;
                }
                bool2 = Boolean.TRUE;
                int i4 = 2 % 2;
            }
            Boolean bool7 = bool2;
            if ((i & 16) != 0) {
                int i5 = INotificationSideChannel + 3;
                notify = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                bool5 = null;
            } else {
                bool5 = bool3;
            }
            this(str, viewEventSessionType, bool4, bool7, bool5);
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$getSessionToken$b, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$getSessionToken$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$getSessionToken;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$getSessionToken;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static getSessionToken TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("id").getAsString();
                    ViewEventSessionType.Companion companion = ViewEventSessionType.INSTANCE;
                    String asString2 = p0.get("type").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString2, "");
                    ViewEventSessionType viewEventSessionTypeB = ViewEventSessionType.Companion.b(asString2);
                    JsonElement jsonElement = p0.get("has_replay");
                    Boolean boolValueOf = jsonElement != null ? Boolean.valueOf(jsonElement.getAsBoolean()) : null;
                    JsonElement jsonElement2 = p0.get("is_active");
                    Boolean boolValueOf2 = jsonElement2 != null ? Boolean.valueOf(jsonElement2.getAsBoolean()) : null;
                    JsonElement jsonElement3 = p0.get("sampled_for_replay");
                    Boolean boolValueOf3 = jsonElement3 != null ? Boolean.valueOf(jsonElement3.getAsBoolean()) : null;
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new getSessionToken(asString, viewEventSessionTypeB, boolValueOf, boolValueOf2, boolValueOf3);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type ViewEventSession", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type ViewEventSession", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type ViewEventSession", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final JsonElement TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
            Object[] objArr;
            Object[] objArr2;
            int i = 2 % 2;
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("id", this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            jsonObject.add("type", new JsonPrimitive(this.b.jsonValue));
            Boolean bool = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (bool != null) {
                int i2 = INotificationSideChannel + 73;
                notify = i2 % 128;
                if (i2 % 2 != 0) {
                    jsonObject.addProperty("has_replay", Boolean.valueOf(bool.booleanValue()));
                    int i3 = 86 / 0;
                } else {
                    jsonObject.addProperty("has_replay", Boolean.valueOf(bool.booleanValue()));
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "");
                int gidForName = Process.getGidForName("") + 877;
                int iIndexOf = 10 - TextUtils.indexOf("", "", 0, 0);
                byte[] bArr = $$a;
                Object[] objArr3 = new Object[1];
                c(bArr[7], bArr[5], (byte) 14, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, gidForName, iIndexOf, 252381699, false, (String) objArr3[0], null);
            }
            Object obj = null;
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr4 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{40037, 40837, 17607, 29473}, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), ViewConfiguration.getMinimumFlingVelocity() >> 16, new char[]{14554, 39852, 64265, 444, 25448, 28413, 25661, 17504, 45653, 26310, 4508, 49764, 57247, 22839, 10762, 46621, 36180, 16695, 30851, 16709, 6728, 27789}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{24509, 36731, 36269, 62211}, (char) (909 - ExpandableListView.getPackedPositionGroup(0L)), (-1383105697) - View.combineMeasuredStates(0, 0), new char[]{53889, 16483, 12919, 12312, 39736, 49813, 18778, 64337, 30541, 37760, 17428, 38161, 18850, 5836, 24218}, objArr5);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 876;
                int iIndexOf2 = 10 - TextUtils.indexOf("", "", 0);
                byte b = $$a[7];
                byte b2 = b;
                Object[] objArr6 = new Object[1];
                c(b, b2, b2, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetBefore, keyRepeatTimeout, iIndexOf2, 2009631821, false, (String) objArr6[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cAlpha = (char) Color.alpha(0);
                    int iGreen = 876 - Color.green(0);
                    int iRed = Color.red(0) + 10;
                    byte[] bArr2 = $$a;
                    byte b3 = bArr2[5];
                    Object[] objArr7 = new Object[1];
                    c(b3, b3, bArr2[10], objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, iGreen, iRed, 256017550, false, (String) objArr7[0], null);
                }
                Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
                int iMyPid = Process.myPid();
                int i4 = ~iMyPid;
                int i5 = (((1824920932 + (((~((-836422584) | i4)) | 876732812) * (-328))) + ((iMyPid | 876732812) * 164)) + ((((~(iMyPid | 836422583)) | 67182600) | (~(i4 | (-26872372)))) * 164)) - 980561369;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
            } else {
                Object[] objArr9 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{258, 49350, 21336, 59457}, (char) (16723 - TextUtils.getTrimmedLength("")), ViewConfiguration.getKeyRepeatDelay() >> 16, new char[]{27338, 22282, 30733, 17272, 42709, 61533, 6456, 40880, 48671, 56949, 8068, 54825, 60157, 11268, 39202, 45783, 57792, 47755, 38457, 37542, 47610, 61588, 3361, 18616, 17852, 17925}, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{35415, 49952, 44789, 50161}, (char) (61870 - ExpandableListView.getPackedPositionType(0L)), View.combineMeasuredStates(0, 0), new char[]{64960, 56424, 37873, 16542, 30715, 22632, 58203, 8915, 42968, 13275, 3475, 31113, 31433, 7317, 30064, 54911, 48850, 6101}, objArr10);
                Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i8 = INotificationSideChannel + 29;
                    notify = i8 % 128;
                    if (i8 % 2 != 0) {
                        boolean z = applicationContext instanceof ContextWrapper;
                        obj.hashCode();
                        throw null;
                    }
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr11 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{6647, 59532, 1546, 6096}, (char) (53254 - View.resolveSizeAndState(0, 0, 0)), Color.argb(0, 0, 0, 0), new char[]{2356, 28196, 17270, 59412, 32645, 62001, 51219, 28058, 41534, 33243, 14109, 3057, 1125, 40025, 30194, 25441}, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{60207, 48953, 54786, 31728}, (char) (61654 - (Process.myPid() >> 22)), KeyEvent.getMaxKeyCode() >> 16, new char[]{28125, 48816, 55022, 9740, 32996, 53133, 33816, 5010, 55101, 48659, 28750, 37980, 52092, 18322, 51520, 55896}, objArr12);
                try {
                    Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), -980561369};
                    byte[] bArr3 = $$d;
                    byte b4 = bArr3[96];
                    byte b5 = b4;
                    Object[] objArr14 = new Object[1];
                    f(b4, b5, b5, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    byte b6 = bArr3[106];
                    byte b7 = b6;
                    Object[] objArr15 = new Object[1];
                    f(b6, b7, b7, objArr15);
                    objArr = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                    if (applicationContext != null) {
                        int i9 = notify + 105;
                        INotificationSideChannel = i9 % 128;
                        int i10 = i9 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char size = (char) View.MeasureSpec.getSize(0);
                            int iIndexOf3 = TextUtils.indexOf("", "") + 876;
                            int i11 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
                            byte[] bArr4 = $$a;
                            byte b8 = bArr4[5];
                            Object[] objArr16 = new Object[1];
                            c(b8, b8, bArr4[10], objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(size, iIndexOf3, i11, 256017550, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr17 = new Object[1];
                            e(new char[]{0, 0, 0, 0}, new char[]{40037, 40837, 17607, 29473}, (char) Color.argb(0, 0, 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, new char[]{14554, 39852, 64265, 444, 25448, 28413, 25661, 17504, 45653, 26310, 4508, 49764, 57247, 22839, 10762, 46621, 36180, 16695, 30851, 16709, 6728, 27789}, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            e(new char[]{0, 0, 0, 0}, new char[]{24509, 36731, 36269, 62211}, (char) (TextUtils.indexOf("", "", 0, 0) + 909), (-1383105697) - KeyEvent.getDeadChar(0, 0), new char[]{53889, 16483, 12919, 12312, 39736, 49813, 18778, 64337, 30541, 37760, 17428, 38161, 18850, 5836, 24218}, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char defaultSize = (char) View.getDefaultSize(0, 0);
                                int iRgb = (-16776340) - Color.rgb(0, 0, 0);
                                int i12 = 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                byte b9 = $$a[7];
                                byte b10 = b9;
                                Object[] objArr19 = new Object[1];
                                c(b9, b10, b10, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, iRgb, i12, 2009631821, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                                int iAxisFromString = 875 - MotionEvent.axisFromString("");
                                int windowTouchSlop = 10 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                byte[] bArr5 = $$a;
                                Object[] objArr20 = new Object[1];
                                c(bArr5[7], bArr5[5], (byte) 14, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(absoluteGravity, iAxisFromString, windowTouchSlop, 252381699, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i13 = ((int[]) objArr[2])[0];
            int i14 = ((int[]) objArr[0])[0];
            if (i14 == i13) {
                int i15 = notify + 101;
                INotificationSideChannel = i15 % 128;
                int i16 = i15 % 2;
                int i17 = ((int[]) objArr[1])[0];
                objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i18 = i17 + 1263156008 + (((~((-295362877) | startElapsedRealtime)) | 268493072) * (-140)) + ((~((-26869805) | startElapsedRealtime)) * 70) + (((~(startElapsedRealtime | 335673105)) | (-94049838)) * 70);
                int i19 = (i18 << 13) ^ i18;
                int i20 = i19 ^ (i19 >>> 17);
                ((int[]) objArr2[1])[0] = i20 ^ (i20 << 5);
            } else {
                Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
                int i21 = ((int[]) objArr[1])[0];
                objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i22 = ~(224542545 | iIdentityHashCode);
                int i23 = i21 + (-21836661) + (((-268124030) | i22) * (-814)) + ((i22 | (~((~iIdentityHashCode) | 184232316)) | 140650832) * 407) + (((~(iIdentityHashCode | (-184232317))) | (~((-224542546) | iIdentityHashCode)) | 140650832) * 407);
                int i24 = (i23 << 13) ^ i23;
                int i25 = i24 ^ (i24 >>> 17);
                ((int[]) objArr2[1])[0] = i25 ^ (i25 << 5);
                int i26 = INotificationSideChannel + 111;
                notify = i26 % 128;
                int i27 = i26 % 2;
            }
            Boolean bool2 = this.TuitionPaymentFragmentbindingInflater1;
            if (bool2 != null) {
                boolean zBooleanValue = bool2.booleanValue();
                int i28 = ((int[]) objArr2[1])[0];
                int i29 = i28 * i28;
                int i30 = -(1605768289 * i28);
                int i31 = (i29 ^ i30) + ((i29 & i30) << 1);
                int i32 = -(i28 * (-2095362415));
                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                int i34 = (i33 ^ 2136509233) + ((2136509233 & i33) << 1);
                int i35 = i34 >> 19;
                int i36 = (((i35 | (-16383)) << 1) - (i35 ^ (-16383))) / 8192;
                int i37 = (i36 & 1) + (i36 | 1);
                int i38 = (i34 ^ i37) + ((i37 & i34) << 1);
                int i39 = i34 >> 21;
                int i40 = ((i39 & (-4095)) + (i39 | (-4095))) / 2048;
                int i41 = (-(((i40 ^ 1) + ((i40 & 1) << 1)) ^ i38)) + 8;
                int i42 = i41 >> 26;
                jsonObject.addProperty("16|5|3|is_active".substring(53312 / ((i41 & (-((((i42 ^ ComposerKt.defaultsKey) + ((i42 & ComposerKt.defaultsKey) << 1)) / 64) + 2))) * 952)), Boolean.valueOf(zBooleanValue));
            }
            Boolean bool3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (bool3 != null) {
                int i43 = notify + 41;
                INotificationSideChannel = i43 % 128;
                if (i43 % 2 == 0) {
                    jsonObject.addProperty("sampled_for_replay", Boolean.valueOf(bool3.booleanValue()));
                    int i44 = 72 / 0;
                } else {
                    jsonObject.addProperty("sampled_for_replay", Boolean.valueOf(bool3.booleanValue()));
                }
                int i45 = INotificationSideChannel + 37;
                notify = i45 % 128;
                int i46 = i45 % 2;
            }
            return jsonObject;
        }

        static {
            cancelAll = 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            INSTANCE = new Companion(null);
            int i = asInterface + 71;
            cancelAll = i % 128;
            int i2 = i % 2;
        }

        public final boolean equals(Object p0) {
            int i = 2 % 2;
            if (this == p0) {
                int i2 = notify + 69;
                INotificationSideChannel = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(p0 instanceof getSessionToken)) {
                int i4 = notify + 85;
                INotificationSideChannel = i4 % 128;
                return i4 % 2 == 0;
            }
            getSessionToken getsessiontoken = (getSessionToken) p0;
            if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, getsessiontoken.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                return false;
            }
            if (this.b != getsessiontoken.b) {
                int i5 = INotificationSideChannel + 9;
                notify = i5 % 128;
                if (i5 % 2 == 0) {
                    return false;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getsessiontoken.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                return false;
            }
            if (Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, getsessiontoken.TuitionPaymentFragmentbindingInflater1)) {
                return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getsessiontoken.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            int i6 = INotificationSideChannel + 3;
            notify = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x003b  */
        /* JADX WARN: Code duplicated, block: B:12:0x003d  */
        /* JADX WARN: Code duplicated, block: B:13:0x003f A[PHI: r1 r3 r4
  0x003f: PHI (r1v16 int) = (r1v5 int), (r1v18 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x003f: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x003f: PHI (r4v8 java.lang.Boolean) = (r4v0 java.lang.Boolean), (r4v9 java.lang.Boolean) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:9:0x0030 A[PHI: r1 r3
  0x0030: PHI (r1v6 int) = (r1v5 int), (r1v18 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0030: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        public final int hashCode() {
            int iHashCode;
            int iHashCode2;
            Boolean bool;
            int i;
            int iHashCode3;
            int i2 = 2 % 2;
            int i3 = notify + 99;
            INotificationSideChannel = i3 % 128;
            if (i3 % 2 == 0) {
                iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
                iHashCode2 = this.b.hashCode();
                bool = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (bool == null) {
                    i = INotificationSideChannel + 79;
                    notify = i % 128;
                    if (i % 2 != 0) {
                        iHashCode3 = 1;
                    } else {
                        iHashCode3 = 0;
                    }
                } else {
                    iHashCode3 = bool.hashCode();
                }
            } else {
                iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
                iHashCode2 = this.b.hashCode();
                bool = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (bool == null) {
                    i = INotificationSideChannel + 79;
                    notify = i % 128;
                    if (i % 2 != 0) {
                        iHashCode3 = 1;
                    } else {
                        iHashCode3 = 0;
                    }
                } else {
                    iHashCode3 = bool.hashCode();
                }
            }
            Boolean bool2 = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode4 = bool2 == null ? 0 : bool2.hashCode();
            Boolean bool3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool3 != null ? bool3.hashCode() : 0);
        }

        public final String toString() {
            int i = 2 % 2;
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            ViewEventSessionType viewEventSessionType = this.b;
            Boolean bool = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Boolean bool2 = this.TuitionPaymentFragmentbindingInflater1;
            Boolean bool3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("getSessionToken(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str);
            sb.append(", b=");
            sb.append(viewEventSessionType);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(bool);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(bool2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(bool3);
            sb.append(")");
            String string = sb.toString();
            int i2 = notify + 11;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            g = -6377398940819159759L;
            d = -981105359;
            f745a = (char) 65488;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0020  */
        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r6, int r7, byte r8) {
            /*
                int r6 = r6 * 4
                int r6 = 3 - r6
                int r8 = 104 - r8
                byte[] r0 = com.datadog.android.rum.model.ViewEvent.getSessionToken.$$c
                int r7 = r7 * 3
                int r1 = r7 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r7
                r4 = r2
                goto L2a
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r7) goto L20
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L20:
                int r6 = r6 + 1
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2a:
                int r8 = -r8
                int r8 = r8 + r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.ViewEvent.getSessionToken.$$g(byte, int, byte):java.lang.String");
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static ViewEvent b(JsonObject p0) throws JsonParseException {
            ViewEventSource viewEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            getItem getitemTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            g gVarTuitionPaymentFragmentbindingInflater1;
            INotificationSideChannelDefault iNotificationSideChannelDefaultB;
            getRoot getrootTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            IconCompatParcelizer iconCompatParcelizerTuitionPaymentFragmentbindingInflater1;
            onTransact ontransactTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            asBinder asbinderTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            MediaBrowserCompat mediaBrowserCompatTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            JsonObject asJsonObject;
            JsonObject asJsonObject2;
            JsonObject asJsonObject3;
            JsonObject asJsonObject4;
            JsonObject asJsonObject5;
            JsonObject asJsonObject6;
            JsonObject asJsonObject7;
            JsonObject asJsonObject8;
            JsonObject asJsonObject9;
            JsonObject asJsonObject10;
            JsonObject asJsonObject11;
            String asString;
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                long asLong = p0.get("date").getAsLong();
                JsonObject asJsonObject12 = p0.get("application").getAsJsonObject();
                TuitionPaymentFragmentbindingInflater1.Companion companion = TuitionPaymentFragmentbindingInflater1.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject12, "");
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1B = TuitionPaymentFragmentbindingInflater1.Companion.b(asJsonObject12);
                JsonElement jsonElement = p0.get(NotificationCompat.CATEGORY_SERVICE);
                String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                JsonElement jsonElement2 = p0.get("version");
                String asString3 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                JsonElement jsonElement3 = p0.get("build_version");
                String asString4 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                JsonElement jsonElement4 = p0.get("build_id");
                String asString5 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                JsonObject asJsonObject13 = p0.get("session").getAsJsonObject();
                getSessionToken.Companion companion2 = getSessionToken.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject13, "");
                getSessionToken getsessiontokenTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getSessionToken.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject13);
                JsonElement jsonElement5 = p0.get("source");
                if (jsonElement5 == null || (asString = jsonElement5.getAsString()) == null) {
                    viewEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                } else {
                    ViewEventSource.Companion companion3 = ViewEventSource.INSTANCE;
                    viewEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ViewEventSource.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asString);
                }
                JsonObject asJsonObject14 = p0.get("view").getAsJsonObject();
                search.Companion companion4 = search.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject14, "");
                search searchVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = search.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject14);
                JsonElement jsonElement6 = p0.get("usr");
                if (jsonElement6 == null || (asJsonObject11 = jsonElement6.getAsJsonObject()) == null) {
                    getitemTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                } else {
                    getItem.Companion companion5 = getItem.INSTANCE;
                    getitemTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getItem.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject11);
                }
                JsonElement jsonElement7 = p0.get("connectivity");
                if (jsonElement7 == null || (asJsonObject10 = jsonElement7.getAsJsonObject()) == null) {
                    gVarTuitionPaymentFragmentbindingInflater1 = null;
                } else {
                    g.Companion companion6 = g.INSTANCE;
                    gVarTuitionPaymentFragmentbindingInflater1 = g.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject10);
                }
                JsonElement jsonElement8 = p0.get(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
                if (jsonElement8 == null || (asJsonObject9 = jsonElement8.getAsJsonObject()) == null) {
                    iNotificationSideChannelDefaultB = null;
                } else {
                    INotificationSideChannelDefault.Companion companion7 = INotificationSideChannelDefault.INSTANCE;
                    iNotificationSideChannelDefaultB = INotificationSideChannelDefault.Companion.b(asJsonObject9);
                }
                JsonElement jsonElement9 = p0.get("synthetics");
                if (jsonElement9 == null || (asJsonObject8 = jsonElement9.getAsJsonObject()) == null) {
                    getrootTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                } else {
                    getRoot.Companion companion8 = getRoot.INSTANCE;
                    getrootTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRoot.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject8);
                }
                JsonElement jsonElement10 = p0.get("ci_test");
                if (jsonElement10 == null || (asJsonObject7 = jsonElement10.getAsJsonObject()) == null) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                } else {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1.Companion companion9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE;
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject7);
                }
                JsonElement jsonElement11 = p0.get("os");
                if (jsonElement11 == null || (asJsonObject6 = jsonElement11.getAsJsonObject()) == null) {
                    iconCompatParcelizerTuitionPaymentFragmentbindingInflater1 = null;
                } else {
                    IconCompatParcelizer.Companion companion10 = IconCompatParcelizer.INSTANCE;
                    iconCompatParcelizerTuitionPaymentFragmentbindingInflater1 = IconCompatParcelizer.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject6);
                }
                JsonElement jsonElement12 = p0.get("device");
                if (jsonElement12 == null || (asJsonObject5 = jsonElement12.getAsJsonObject()) == null) {
                    ontransactTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                } else {
                    onTransact.Companion companion11 = onTransact.INSTANCE;
                    ontransactTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onTransact.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject5);
                }
                JsonObject asJsonObject15 = p0.get("_dd").getAsJsonObject();
                notify.Companion companion12 = notify.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject15, "");
                notify notifyVarB = notify.Companion.b(asJsonObject15);
                JsonElement jsonElement13 = p0.get("context");
                if (jsonElement13 == null || (asJsonObject4 = jsonElement13.getAsJsonObject()) == null) {
                    aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                } else {
                    a.Companion companion13 = a.INSTANCE;
                    aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = a.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject4);
                }
                JsonElement jsonElement14 = p0.get("container");
                if (jsonElement14 == null || (asJsonObject3 = jsonElement14.getAsJsonObject()) == null) {
                    asbinderTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                } else {
                    asBinder.Companion companion14 = asBinder.INSTANCE;
                    asbinderTuitionPaymentFragmentspecialinlinedviewModeldefault2 = asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject3);
                }
                String asString6 = p0.get("type").getAsString();
                JsonElement jsonElement15 = p0.get("feature_flags");
                if (jsonElement15 == null || (asJsonObject2 = jsonElement15.getAsJsonObject()) == null) {
                    aVarTuitionPaymentFragmentspecialinlinedviewModeldefault4 = null;
                } else {
                    a.Companion companion15 = a.INSTANCE;
                    aVarTuitionPaymentFragmentspecialinlinedviewModeldefault4 = a.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject2);
                }
                JsonElement jsonElement16 = p0.get("privacy");
                if (jsonElement16 == null || (asJsonObject = jsonElement16.getAsJsonObject()) == null) {
                    mediaBrowserCompatTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                } else {
                    MediaBrowserCompat.Companion companion16 = MediaBrowserCompat.INSTANCE;
                    mediaBrowserCompatTuitionPaymentFragmentspecialinlinedviewModeldefault1 = MediaBrowserCompat.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject);
                }
                if (!Intrinsics.areEqual(asString6, "view")) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                return new ViewEvent(asLong, tuitionPaymentFragmentbindingInflater1B, asString2, asString3, asString4, asString5, getsessiontokenTuitionPaymentFragmentspecialinlinedviewModeldefault3, viewEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault2, searchVarTuitionPaymentFragmentspecialinlinedviewModeldefault1, getitemTuitionPaymentFragmentspecialinlinedviewModeldefault1, gVarTuitionPaymentFragmentbindingInflater1, iNotificationSideChannelDefaultB, getrootTuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault3, iconCompatParcelizerTuitionPaymentFragmentbindingInflater1, ontransactTuitionPaymentFragmentspecialinlinedviewModeldefault2, notifyVarB, aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3, asbinderTuitionPaymentFragmentspecialinlinedviewModeldefault2, aVarTuitionPaymentFragmentspecialinlinedviewModeldefault4, mediaBrowserCompatTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            } catch (IllegalStateException e2) {
                throw new JsonParseException("Unable to parse json into type ViewEvent", e2);
            } catch (NullPointerException e3) {
                throw new JsonParseException("Unable to parse json into type ViewEvent", e3);
            } catch (NumberFormatException e4) {
                throw new JsonParseException("Unable to parse json into type ViewEvent", e4);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$TuitionPaymentFragmentbindingInflater1;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentbindingInflater1 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentbindingInflater1(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((TuitionPaymentFragmentbindingInflater1) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$TuitionPaymentFragmentbindingInflater1$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$TuitionPaymentFragmentbindingInflater1$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$TuitionPaymentFragmentbindingInflater1;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$TuitionPaymentFragmentbindingInflater1;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentbindingInflater1 b(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("id").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new TuitionPaymentFragmentbindingInflater1(asString);
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$getItem;", "", "", "p0", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/util/Map;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "asInterface", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getItem {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {"id", "name", "email"};

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;

        public getItem(String str, String str2, String str3, Map<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.b = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
            this.TuitionPaymentFragmentbindingInflater1 = str3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = map;
        }

        public /* synthetic */ getItem(String str, String str2, String str3, LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? new LinkedHashMap() : linkedHashMap);
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$getItem$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$getItem$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$getItem;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$getItem;", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "[Ljava/lang/String;", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static getItem TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
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
                        if (!ArraysKt.contains(getItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3, entry.getKey())) {
                            String key = entry.getKey();
                            Intrinsics.checkNotNullExpressionValue(key, "");
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    return new getItem(asString, asString2, asString3, linkedHashMap);
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

        public static /* synthetic */ getItem TuitionPaymentFragmentspecialinlinedviewModeldefault3(getItem getitem, Map map) {
            String str = getitem.b;
            String str2 = getitem.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str3 = getitem.TuitionPaymentFragmentbindingInflater1;
            Intrinsics.checkNotNullParameter(map, "");
            return new getItem(str, str2, str3, map);
        }

        public getItem() {
            this(null, null, null, null, 15, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof getItem)) {
                return false;
            }
            getItem getitem = (getItem) p0;
            return Intrinsics.areEqual(this.b, getitem.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, getitem.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, getitem.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getitem.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            String str = this.b;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.TuitionPaymentFragmentbindingInflater1;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            String str = this.b;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str3 = this.TuitionPaymentFragmentbindingInflater1;
            Map<String, Object> map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("getItem(b=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str3);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001d"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$g;", "", "Lcom/datadog/android/rum/model/ViewEvent$Status;", "p0", "", "Lcom/datadog/android/rum/model/ViewEvent$Interface;", "p1", "Lcom/datadog/android/rum/model/ViewEvent$EffectiveType;", "p2", "Lcom/datadog/android/rum/model/ViewEvent$b;", "p3", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$Status;Ljava/util/List;Lcom/datadog/android/rum/model/ViewEvent$EffectiveType;Lcom/datadog/android/rum/model/ViewEvent$b;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/rum/model/ViewEvent$b;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "Lcom/datadog/android/rum/model/ViewEvent$EffectiveType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/List;", "Lcom/datadog/android/rum/model/ViewEvent$Status;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class g {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final List<Interface> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final b TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final Status TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final EffectiveType TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX WARN: Multi-variable type inference failed */
        public g(Status status, List<? extends Interface> list, EffectiveType effectiveType, b bVar) {
            Intrinsics.checkNotNullParameter(status, "");
            this.TuitionPaymentFragmentbindingInflater1 = status;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = list;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = effectiveType;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bVar;
        }

        public /* synthetic */ g(Status status, List list, EffectiveType effectiveType, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(status, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : effectiveType, (i & 8) != 0 ? null : bVar);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof g)) {
                return false;
            }
            g gVar = (g) p0;
            return this.TuitionPaymentFragmentbindingInflater1 == gVar.TuitionPaymentFragmentbindingInflater1 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentbindingInflater1.hashCode();
            List<Interface> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            EffectiveType effectiveType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode3 = effectiveType == null ? 0 : effectiveType.hashCode();
            b bVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bVar != null ? bVar.hashCode() : 0);
        }

        public final String toString() {
            Status status = this.TuitionPaymentFragmentbindingInflater1;
            List<Interface> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            EffectiveType effectiveType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            b bVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("g(TuitionPaymentFragmentbindingInflater1=");
            sb.append(status);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(list);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(effectiveType);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(bVar);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$g$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$g$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$g;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$g;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static g TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
                ArrayList arrayList;
                EffectiveType effectiveTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3;
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
                    b bVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    if (jsonElement == null || (asJsonArray = jsonElement.getAsJsonArray()) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(asJsonArray.size());
                        for (JsonElement jsonElement2 : asJsonArray) {
                            Interface.Companion companion2 = Interface.INSTANCE;
                            String asString3 = jsonElement2.getAsString();
                            Intrinsics.checkNotNullExpressionValue(asString3, "");
                            arrayList.add(Interface.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asString3));
                        }
                    }
                    JsonElement jsonElement3 = p0.get("effective_type");
                    if (jsonElement3 == null || (asString = jsonElement3.getAsString()) == null) {
                        effectiveTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    } else {
                        EffectiveType.Companion companion3 = EffectiveType.INSTANCE;
                        effectiveTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = EffectiveType.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asString);
                    }
                    JsonElement jsonElement4 = p0.get("cellular");
                    if (jsonElement4 != null && (asJsonObject = jsonElement4.getAsJsonObject()) != null) {
                        b.Companion companion4 = b.INSTANCE;
                        bVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = b.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject);
                    }
                    return new g(statusTuitionPaymentFragmentspecialinlinedviewModeldefault2, arrayList, effectiveTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3, bVarTuitionPaymentFragmentspecialinlinedviewModeldefault1);
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

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannelDefault;", "", "Lcom/datadog/android/rum/model/ViewEvent$getServiceComponent;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$disconnect;", "p1", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$getServiceComponent;Lcom/datadog/android/rum/model/ViewEvent$disconnect;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/rum/model/ViewEvent$disconnect;", "b", "Lcom/datadog/android/rum/model/ViewEvent$getServiceComponent;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannelDefault {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final disconnect b;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final getServiceComponent TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public INotificationSideChannelDefault(getServiceComponent getservicecomponent, disconnect disconnectVar) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getservicecomponent;
            this.b = disconnectVar;
        }

        public /* synthetic */ INotificationSideChannelDefault(getServiceComponent getservicecomponent, disconnect disconnectVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : getservicecomponent, (i & 2) != 0 ? null : disconnectVar);
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
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, iNotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.b, iNotificationSideChannelDefault.b);
        }

        public final int hashCode() {
            getServiceComponent getservicecomponent = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode = getservicecomponent == null ? 0 : getservicecomponent.hashCode();
            disconnect disconnectVar = this.b;
            return (iHashCode * 31) + (disconnectVar != null ? disconnectVar.hashCode() : 0);
        }

        public final String toString() {
            getServiceComponent getservicecomponent = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            disconnect disconnectVar = this.b;
            StringBuilder sb = new StringBuilder("INotificationSideChannelDefault(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(getservicecomponent);
            sb.append(", b=");
            sb.append(disconnectVar);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$INotificationSideChannelDefault$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannelDefault$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannelDefault;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannelDefault;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static INotificationSideChannelDefault b(JsonObject p0) throws JsonParseException {
                getServiceComponent getservicecomponentTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                JsonObject asJsonObject;
                JsonObject asJsonObject2;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("viewport");
                    disconnect disconnectVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    if (jsonElement == null || (asJsonObject2 = jsonElement.getAsJsonObject()) == null) {
                        getservicecomponentTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    } else {
                        getServiceComponent.Companion companion = getServiceComponent.INSTANCE;
                        getservicecomponentTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getServiceComponent.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject2);
                    }
                    JsonElement jsonElement2 = p0.get("scroll");
                    if (jsonElement2 != null && (asJsonObject = jsonElement2.getAsJsonObject()) != null) {
                        disconnect.Companion companion2 = disconnect.INSTANCE;
                        disconnectVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = disconnect.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject);
                    }
                    return new INotificationSideChannelDefault(getservicecomponentTuitionPaymentFragmentspecialinlinedviewModeldefault1, disconnectVarTuitionPaymentFragmentspecialinlinedviewModeldefault3);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$getRoot;", "", "", "p0", "p1", "", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/Boolean;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getRoot {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final Boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public final String b;

        public getRoot(String str, String str2, Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.b = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bool;
        }

        public /* synthetic */ getRoot(String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : bool);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof getRoot)) {
                return false;
            }
            getRoot getroot = (getRoot) p0;
            return Intrinsics.areEqual(this.b, getroot.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, getroot.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getroot.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode();
            int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
            Boolean bool = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            return (((iHashCode * 31) + iHashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            String str = this.b;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Boolean bool = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("getRoot(b=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$getRoot$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$getRoot$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$getRoot;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$getRoot;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static getRoot TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("test_id").getAsString();
                    String asString2 = p0.get("result_id").getAsString();
                    JsonElement jsonElement = p0.get("injected");
                    Boolean boolValueOf = jsonElement != null ? Boolean.valueOf(jsonElement.getAsBoolean()) : null;
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    Intrinsics.checkNotNullExpressionValue(asString2, "");
                    return new getRoot(asString, asString2, boolValueOf);
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

    public static /* synthetic */ ViewEvent TuitionPaymentFragmentspecialinlinedviewModeldefault2(ViewEvent viewEvent, long j, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, String str, String str2, String str3, String str4, getSessionToken getsessiontoken, ViewEventSource viewEventSource, search searchVar, getItem getitem, g gVar, INotificationSideChannelDefault iNotificationSideChannelDefault, getRoot getroot, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, IconCompatParcelizer iconCompatParcelizer, onTransact ontransact, notify notifyVar, a aVar, asBinder asbinder, a aVar2, MediaBrowserCompat mediaBrowserCompat, int i) {
        long j2 = (i & 1) != 0 ? viewEvent.asInterface : j;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = (i & 2) != 0 ? viewEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : tuitionPaymentFragmentbindingInflater1;
        String str5 = (i & 4) != 0 ? viewEvent.notify : str;
        String str6 = (i & 8) != 0 ? viewEvent.read : str2;
        String str7 = (i & 16) != 0 ? viewEvent.TuitionPaymentFragmentbindingInflater1 : str3;
        String str8 = (i & 32) != 0 ? viewEvent.b : str4;
        getSessionToken getsessiontoken2 = (i & 64) != 0 ? viewEvent.INotificationSideChannelStub : getsessiontoken;
        ViewEventSource viewEventSource2 = (i & 128) != 0 ? viewEvent.RemoteActionCompatParcelizer : viewEventSource;
        search searchVar2 = (i & 256) != 0 ? viewEvent.connect : searchVar;
        getItem getitem2 = (i & 512) != 0 ? viewEvent.getInterfaceDescriptor : getitem;
        g gVar2 = (i & 1024) != 0 ? viewEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : gVar;
        INotificationSideChannelDefault iNotificationSideChannelDefault2 = (i & 2048) != 0 ? viewEvent.onTransact : iNotificationSideChannelDefault;
        getRoot getroot2 = (i & 4096) != 0 ? viewEvent.INotificationSideChannelDefault : getroot;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (i & 8192) != 0 ? viewEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        IconCompatParcelizer iconCompatParcelizer2 = (i & 16384) != 0 ? viewEvent.cancelAll : iconCompatParcelizer;
        onTransact ontransact2 = (i & 32768) != 0 ? viewEvent.asBinder : ontransact;
        notify notifyVar2 = (i & 65536) != 0 ? viewEvent.a : notifyVar;
        INotificationSideChannelDefault iNotificationSideChannelDefault3 = iNotificationSideChannelDefault2;
        a aVar3 = (i & 131072) != 0 ? viewEvent.g : aVar;
        asBinder asbinder2 = (i & 262144) != 0 ? viewEvent.d : asbinder;
        a aVar4 = (i & 524288) != 0 ? viewEvent.INotificationSideChannel : aVar2;
        MediaBrowserCompat mediaBrowserCompat2 = (i & 1048576) != 0 ? viewEvent.cancel : mediaBrowserCompat;
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentbindingInflater2, "");
        Intrinsics.checkNotNullParameter(getsessiontoken2, "");
        Intrinsics.checkNotNullParameter(searchVar2, "");
        Intrinsics.checkNotNullParameter(notifyVar2, "");
        return new ViewEvent(j2, tuitionPaymentFragmentbindingInflater2, str5, str6, str7, str8, getsessiontoken2, viewEventSource2, searchVar2, getitem2, gVar2, iNotificationSideChannelDefault3, getroot2, tuitionPaymentFragmentspecialinlinedviewModeldefault2, iconCompatParcelizer2, ontransact2, notifyVar2, aVar3, asbinder2, aVar4, mediaBrowserCompat2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ViewEvent)) {
            return false;
        }
        ViewEvent viewEvent = (ViewEvent) p0;
        return this.asInterface == viewEvent.asInterface && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, viewEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.notify, viewEvent.notify) && Intrinsics.areEqual(this.read, viewEvent.read) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, viewEvent.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, viewEvent.b) && Intrinsics.areEqual(this.INotificationSideChannelStub, viewEvent.INotificationSideChannelStub) && this.RemoteActionCompatParcelizer == viewEvent.RemoteActionCompatParcelizer && Intrinsics.areEqual(this.connect, viewEvent.connect) && Intrinsics.areEqual(this.getInterfaceDescriptor, viewEvent.getInterfaceDescriptor) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, viewEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.onTransact, viewEvent.onTransact) && Intrinsics.areEqual(this.INotificationSideChannelDefault, viewEvent.INotificationSideChannelDefault) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, viewEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.cancelAll, viewEvent.cancelAll) && Intrinsics.areEqual(this.asBinder, viewEvent.asBinder) && Intrinsics.areEqual(this.a, viewEvent.a) && Intrinsics.areEqual(this.g, viewEvent.g) && Intrinsics.areEqual(this.d, viewEvent.d) && Intrinsics.areEqual(this.INotificationSideChannel, viewEvent.INotificationSideChannel) && Intrinsics.areEqual(this.cancel, viewEvent.cancel);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.asInterface);
        int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        String str = this.notify;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.read;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.b;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        int iHashCode7 = this.INotificationSideChannelStub.hashCode();
        ViewEventSource viewEventSource = this.RemoteActionCompatParcelizer;
        int iHashCode8 = viewEventSource == null ? 0 : viewEventSource.hashCode();
        int iHashCode9 = this.connect.hashCode();
        getItem getitem = this.getInterfaceDescriptor;
        int iHashCode10 = getitem == null ? 0 : getitem.hashCode();
        g gVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode11 = gVar == null ? 0 : gVar.hashCode();
        INotificationSideChannelDefault iNotificationSideChannelDefault = this.onTransact;
        int iHashCode12 = iNotificationSideChannelDefault == null ? 0 : iNotificationSideChannelDefault.hashCode();
        getRoot getroot = this.INotificationSideChannelDefault;
        int iHashCode13 = getroot == null ? 0 : getroot.hashCode();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode14 = tuitionPaymentFragmentspecialinlinedviewModeldefault1 == null ? 0 : tuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        IconCompatParcelizer iconCompatParcelizer = this.cancelAll;
        int iHashCode15 = iconCompatParcelizer == null ? 0 : iconCompatParcelizer.hashCode();
        onTransact ontransact = this.asBinder;
        int iHashCode16 = ontransact == null ? 0 : ontransact.hashCode();
        int iHashCode17 = this.a.hashCode();
        a aVar = this.g;
        int iHashCode18 = aVar == null ? 0 : aVar.hashCode();
        asBinder asbinder = this.d;
        int iHashCode19 = asbinder == null ? 0 : asbinder.hashCode();
        a aVar2 = this.INotificationSideChannel;
        int iHashCode20 = aVar2 == null ? 0 : aVar2.hashCode();
        MediaBrowserCompat mediaBrowserCompat = this.cancel;
        return (((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + (mediaBrowserCompat != null ? mediaBrowserCompat.hashCode() : 0);
    }

    public final String toString() {
        long j = this.asInterface;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str = this.notify;
        String str2 = this.read;
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        String str4 = this.b;
        getSessionToken getsessiontoken = this.INotificationSideChannelStub;
        ViewEventSource viewEventSource = this.RemoteActionCompatParcelizer;
        search searchVar = this.connect;
        getItem getitem = this.getInterfaceDescriptor;
        g gVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = this.onTransact;
        getRoot getroot = this.INotificationSideChannelDefault;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        IconCompatParcelizer iconCompatParcelizer = this.cancelAll;
        onTransact ontransact = this.asBinder;
        notify notifyVar = this.a;
        a aVar = this.g;
        asBinder asbinder = this.d;
        a aVar2 = this.INotificationSideChannel;
        MediaBrowserCompat mediaBrowserCompat = this.cancel;
        StringBuilder sb = new StringBuilder("ViewEvent(asInterface=");
        sb.append(j);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(tuitionPaymentFragmentbindingInflater1);
        sb.append(", notify=");
        sb.append(str);
        sb.append(", read=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str3);
        sb.append(", b=");
        sb.append(str4);
        sb.append(", INotificationSideChannelStub=");
        sb.append(getsessiontoken);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(viewEventSource);
        sb.append(", connect=");
        sb.append(searchVar);
        sb.append(", getInterfaceDescriptor=");
        sb.append(getitem);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(gVar);
        sb.append(", onTransact=");
        sb.append(iNotificationSideChannelDefault);
        sb.append(", INotificationSideChannelDefault=");
        sb.append(getroot);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", cancelAll=");
        sb.append(iconCompatParcelizer);
        sb.append(", asBinder=");
        sb.append(ontransact);
        sb.append(", a=");
        sb.append(notifyVar);
        sb.append(", g=");
        sb.append(aVar);
        sb.append(", d=");
        sb.append(asbinder);
        sb.append(", INotificationSideChannel=");
        sb.append(aVar2);
        sb.append(", cancel=");
        sb.append(mediaBrowserCompat);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentbindingInflater1 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, ((TuitionPaymentFragmentspecialinlinedviewModeldefault1) p0).TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentbindingInflater1.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentbindingInflater1=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("test_execution_id").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(asString);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$IconCompatParcelizer;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public IconCompatParcelizer(String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            this.TuitionPaymentFragmentbindingInflater1 = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str4;
        }

        public /* synthetic */ IconCompatParcelizer(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, str4);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, iconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, iconCompatParcelizer.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, iconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, iconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
            int iHashCode2 = this.TuitionPaymentFragmentbindingInflater1.hashCode();
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("IconCompatParcelizer(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str3);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$IconCompatParcelizer$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$IconCompatParcelizer$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$IconCompatParcelizer;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$IconCompatParcelizer;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static IconCompatParcelizer TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
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
                    return new IconCompatParcelizer(asString, asString2, asString3, asString4);
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$onTransact;", "", "Lcom/datadog/android/rum/model/ViewEvent$DeviceType;", "p0", "", "p1", "p2", "p3", "p4", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "asInterface", "Lcom/datadog/android/rum/model/ViewEvent$DeviceType;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class onTransact {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final String b;

        /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
        public final DeviceType TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public onTransact(DeviceType deviceType, String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(deviceType, "");
            this.TuitionPaymentFragmentbindingInflater1 = deviceType;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.b = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str4;
        }

        public /* synthetic */ onTransact(DeviceType deviceType, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(deviceType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof onTransact)) {
                return false;
            }
            onTransact ontransact = (onTransact) p0;
            return this.TuitionPaymentFragmentbindingInflater1 == ontransact.TuitionPaymentFragmentbindingInflater1 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ontransact.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.b, ontransact.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ontransact.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ontransact.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentbindingInflater1.hashCode();
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            DeviceType deviceType = this.TuitionPaymentFragmentbindingInflater1;
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str2 = this.b;
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("onTransact(TuitionPaymentFragmentbindingInflater1=");
            sb.append(deviceType);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(", b=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str3);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$onTransact$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$onTransact$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$onTransact;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$onTransact;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static onTransact TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    DeviceType.Companion companion = DeviceType.INSTANCE;
                    String asString = p0.get("type").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    DeviceType deviceTypeTuitionPaymentFragmentbindingInflater1 = DeviceType.Companion.TuitionPaymentFragmentbindingInflater1(asString);
                    JsonElement jsonElement = p0.get("name");
                    String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = p0.get("model");
                    String asString3 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    JsonElement jsonElement3 = p0.get("brand");
                    String asString4 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    JsonElement jsonElement4 = p0.get("architecture");
                    return new onTransact(deviceTypeTuitionPaymentFragmentbindingInflater1, asString2, asString3, asString4, jsonElement4 != null ? jsonElement4.getAsString() : null);
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

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bBQ\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001c\u001a\u00020\b8\u0007¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\b8\u0006X\u0086D¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\u0006\n\u0004\b!\u0010\"R\u0013\u0010%\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u0006\n\u0004\b#\u0010$R\u0013\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$notify;", "", "Lcom/datadog/android/rum/model/ViewEvent$cancel;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$d;", "p1", "", "p2", "", "p3", "", "Lcom/datadog/android/rum/model/ViewEvent$write;", "p4", "Lcom/datadog/android/rum/model/ViewEvent$getExtras;", "p5", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$cancel;Lcom/datadog/android/rum/model/ViewEvent$d;Ljava/lang/String;JLjava/util/List;Lcom/datadog/android/rum/model/ViewEvent$getExtras;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/rum/model/ViewEvent$d;", "b", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "a", "Ljava/util/List;", "asBinder", "Lcom/datadog/android/rum/model/ViewEvent$getExtras;", "d", "g", "Lcom/datadog/android/rum/model/ViewEvent$cancel;", "asInterface"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class notify {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final d b;
        public final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final List<write> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
        public final getExtras d;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public final cancel asInterface;

        public notify(cancel cancelVar, d dVar, String str, long j, List<write> list, getExtras getextras) {
            this.asInterface = cancelVar;
            this.b = dVar;
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = list;
            this.d = getextras;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2L;
        }

        public /* synthetic */ notify(cancel cancelVar, d dVar, String str, long j, List list, getExtras getextras, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cancelVar, (i & 2) != 0 ? null : dVar, (i & 4) != 0 ? null : str, j, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : getextras);
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$notify$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$notify$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$notify;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$notify;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static notify b(JsonObject p0) throws JsonParseException {
                cancel cancelVarTuitionPaymentFragmentbindingInflater1;
                d dVarTuitionPaymentFragmentbindingInflater1;
                ArrayList arrayList;
                JsonObject asJsonObject;
                JsonArray asJsonArray;
                JsonObject asJsonObject2;
                JsonObject asJsonObject3;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    long asLong = p0.get("format_version").getAsLong();
                    JsonElement jsonElement = p0.get("session");
                    getExtras getextrasTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    if (jsonElement == null || (asJsonObject3 = jsonElement.getAsJsonObject()) == null) {
                        cancelVarTuitionPaymentFragmentbindingInflater1 = null;
                    } else {
                        cancel.Companion companion = cancel.INSTANCE;
                        cancelVarTuitionPaymentFragmentbindingInflater1 = cancel.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject3);
                    }
                    JsonElement jsonElement2 = p0.get("configuration");
                    if (jsonElement2 == null || (asJsonObject2 = jsonElement2.getAsJsonObject()) == null) {
                        dVarTuitionPaymentFragmentbindingInflater1 = null;
                    } else {
                        d.Companion companion2 = d.INSTANCE;
                        dVarTuitionPaymentFragmentbindingInflater1 = d.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject2);
                    }
                    JsonElement jsonElement3 = p0.get("browser_sdk_version");
                    String asString = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    long asLong2 = p0.get("document_version").getAsLong();
                    JsonElement jsonElement4 = p0.get("page_states");
                    if (jsonElement4 == null || (asJsonArray = jsonElement4.getAsJsonArray()) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(asJsonArray.size());
                        for (JsonElement jsonElement5 : asJsonArray) {
                            write.Companion companion3 = write.INSTANCE;
                            JsonObject asJsonObject4 = jsonElement5.getAsJsonObject();
                            Intrinsics.checkNotNullExpressionValue(asJsonObject4, "");
                            arrayList.add(write.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject4));
                        }
                    }
                    JsonElement jsonElement6 = p0.get("replay_stats");
                    if (jsonElement6 != null && (asJsonObject = jsonElement6.getAsJsonObject()) != null) {
                        getExtras.Companion companion4 = getExtras.INSTANCE;
                        getextrasTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getExtras.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject);
                    }
                    getExtras getextras = getextrasTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (asLong != 2) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    return new notify(cancelVarTuitionPaymentFragmentbindingInflater1, dVarTuitionPaymentFragmentbindingInflater1, asString, asLong2, arrayList, getextras);
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

        public static /* synthetic */ notify TuitionPaymentFragmentspecialinlinedviewModeldefault3(notify notifyVar, long j) {
            return new notify(notifyVar.asInterface, notifyVar.b, notifyVar.TuitionPaymentFragmentbindingInflater1, j, notifyVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1, notifyVar.d);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof notify)) {
                return false;
            }
            notify notifyVar = (notify) p0;
            return Intrinsics.areEqual(this.asInterface, notifyVar.asInterface) && Intrinsics.areEqual(this.b, notifyVar.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, notifyVar.TuitionPaymentFragmentbindingInflater1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == notifyVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, notifyVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.d, notifyVar.d);
        }

        public final int hashCode() {
            cancel cancelVar = this.asInterface;
            int iHashCode = cancelVar == null ? 0 : cancelVar.hashCode();
            d dVar = this.b;
            int iHashCode2 = dVar == null ? 0 : dVar.hashCode();
            String str = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            int iHashCode4 = Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            List<write> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode5 = list == null ? 0 : list.hashCode();
            getExtras getextras = this.d;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (getextras != null ? getextras.hashCode() : 0);
        }

        public final String toString() {
            cancel cancelVar = this.asInterface;
            d dVar = this.b;
            String str = this.TuitionPaymentFragmentbindingInflater1;
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            List<write> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            getExtras getextras = this.d;
            StringBuilder sb = new StringBuilder("notify(asInterface=");
            sb.append(cancelVar);
            sb.append(", b=");
            sb.append(dVar);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(j);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(list);
            sb.append(", d=");
            sb.append(getextras);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u0007\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$a;", "", "", "", "p0", "<init>", "(Ljava/util/Map;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/util/Map;)Lcom/datadog/android/rum/model/ViewEvent$a;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentbindingInflater1", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final Map<String, Object> b;

        public a(Map<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.b = map;
        }

        public /* synthetic */ a(LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new LinkedHashMap() : linkedHashMap);
        }

        public final JsonElement TuitionPaymentFragmentbindingInflater1() {
            JsonObject jsonObject = new JsonObject();
            for (Map.Entry<String, Object> entry : this.b.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                toBitmap tobitmap = toBitmap.INSTANCE;
                jsonObject.add(key, toBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3(value));
            }
            return jsonObject;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$a$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$a$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$a;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$a;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static a TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, JsonElement> entry : p0.entrySet()) {
                        String key = entry.getKey();
                        Intrinsics.checkNotNullExpressionValue(key, "");
                        linkedHashMap.put(key, entry.getValue());
                    }
                    return new a(linkedHashMap);
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

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static a TuitionPaymentFragmentspecialinlinedviewModeldefault1(Map<String, Object> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new a(p0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof a) && Intrinsics.areEqual(this.b, ((a) p0).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            Map<String, Object> map = this.b;
            StringBuilder sb = new StringBuilder("a(b=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$asBinder;", "", "Lcom/datadog/android/rum/model/ViewEvent$asInterface;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "p1", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$asInterface;Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/rum/model/ViewEvent$asInterface;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class asBinder {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final asInterface b;
        public final ViewEventSource TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public asBinder(asInterface asinterface, ViewEventSource viewEventSource) {
            Intrinsics.checkNotNullParameter(asinterface, "");
            Intrinsics.checkNotNullParameter(viewEventSource, "");
            this.b = asinterface;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = viewEventSource;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof asBinder)) {
                return false;
            }
            asBinder asbinder = (asBinder) p0;
            return Intrinsics.areEqual(this.b, asbinder.b) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final int hashCode() {
            return (this.b.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }

        public final String toString() {
            asInterface asinterface = this.b;
            ViewEventSource viewEventSource = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("asBinder(b=");
            sb.append(asinterface);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(viewEventSource);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$asBinder$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$asBinder$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$asBinder;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$asBinder;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static asBinder TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonObject asJsonObject = p0.get("view").getAsJsonObject();
                    asInterface.Companion companion = asInterface.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    asInterface asinterfaceTuitionPaymentFragmentbindingInflater1 = asInterface.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject);
                    ViewEventSource.Companion companion2 = ViewEventSource.INSTANCE;
                    String asString = p0.get("source").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new asBinder(asinterfaceTuitionPaymentFragmentbindingInflater1, ViewEventSource.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asString));
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$MediaBrowserCompat;", "", "Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel;", "p0", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class MediaBrowserCompat {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final ReplayLevel TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public MediaBrowserCompat(ReplayLevel replayLevel) {
            Intrinsics.checkNotNullParameter(replayLevel, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = replayLevel;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof MediaBrowserCompat) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == ((MediaBrowserCompat) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }

        public final String toString() {
            ReplayLevel replayLevel = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("MediaBrowserCompat(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(replayLevel);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$MediaBrowserCompat$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$MediaBrowserCompat$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$MediaBrowserCompat;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$MediaBrowserCompat;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static MediaBrowserCompat TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    ReplayLevel.Companion companion = ReplayLevel.INSTANCE;
                    String asString = p0.get("replay_level").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new MediaBrowserCompat(ReplayLevel.Companion.b(asString));
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Privacy", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Privacy", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Privacy", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannel;", "", "", "", "", "p0", "<init>", "(Ljava/util/Map;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/util/Map;)Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannel;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/util/Map;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannel {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final Map<String, Long> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public INotificationSideChannel(Map<String, Long> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = map;
        }

        public /* synthetic */ INotificationSideChannel(LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new LinkedHashMap() : linkedHashMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public INotificationSideChannel() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static INotificationSideChannel TuitionPaymentFragmentspecialinlinedviewModeldefault3(Map<String, Long> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new INotificationSideChannel(p0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof INotificationSideChannel) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((INotificationSideChannel) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }

        public final String toString() {
            Map<String, Long> map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("INotificationSideChannel(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$INotificationSideChannel$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannel$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannel;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannel;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static INotificationSideChannel TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, JsonElement> entry : p0.entrySet()) {
                        String key = entry.getKey();
                        Intrinsics.checkNotNullExpressionValue(key, "");
                        linkedHashMap.put(key, Long.valueOf(entry.getValue().getAsLong()));
                    }
                    return new INotificationSideChannel(linkedHashMap);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type CustomTimings", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type CustomTimings", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type CustomTimings", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "", "p0", "<init>", "(J)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "J", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final long TuitionPaymentFragmentbindingInflater1;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j) {
            this.TuitionPaymentFragmentbindingInflater1 = j;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3) && this.TuitionPaymentFragmentbindingInflater1 == ((TuitionPaymentFragmentspecialinlinedviewModeldefault3) p0).TuitionPaymentFragmentbindingInflater1;
        }

        public final int hashCode() {
            return Long.hashCode(this.TuitionPaymentFragmentbindingInflater1);
        }

        public final String toString() {
            long j = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentbindingInflater1=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0.get("count").getAsLong());
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Action", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Action", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Action", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannelStubProxy;", "", "", "p0", "<init>", "(J)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "J", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannelStubProxy {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final long TuitionPaymentFragmentbindingInflater1;

        public INotificationSideChannelStubProxy(long j) {
            this.TuitionPaymentFragmentbindingInflater1 = j;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof INotificationSideChannelStubProxy) && this.TuitionPaymentFragmentbindingInflater1 == ((INotificationSideChannelStubProxy) p0).TuitionPaymentFragmentbindingInflater1;
        }

        public final int hashCode() {
            return Long.hashCode(this.TuitionPaymentFragmentbindingInflater1);
        }

        public final String toString() {
            long j = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("INotificationSideChannelStubProxy(TuitionPaymentFragmentbindingInflater1=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$INotificationSideChannelStubProxy$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannelStubProxy$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannelStubProxy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannelStubProxy;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static INotificationSideChannelStubProxy TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    return new INotificationSideChannelStubProxy(p0.get("count").getAsLong());
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$cancelAll;", "", "", "p0", "<init>", "(J)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(J)Lcom/datadog/android/rum/model/ViewEvent$cancelAll;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "J", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class cancelAll {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public cancelAll(long j) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
        }

        public static cancelAll TuitionPaymentFragmentspecialinlinedviewModeldefault3(long p0) {
            return new cancelAll(p0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof cancelAll) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == ((cancelAll) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            return Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final String toString() {
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("cancelAll(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$cancelAll$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$cancelAll$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$cancelAll;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$cancelAll;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static cancelAll TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    return new cancelAll(p0.get("count").getAsLong());
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$read;", "", "", "p0", "<init>", "(J)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "J", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class read {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public read(long j) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof read) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == ((read) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            return Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final String toString() {
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("read(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$read$b, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$read$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$read;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$read;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static read b(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    return new read(p0.get("count").getAsLong());
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$getInterfaceDescriptor;", "", "", "p0", "<init>", "(J)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getInterfaceDescriptor {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public getInterfaceDescriptor(long j) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof getInterfaceDescriptor) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == ((getInterfaceDescriptor) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            return Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final String toString() {
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("getInterfaceDescriptor(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$getInterfaceDescriptor$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$getInterfaceDescriptor$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$getInterfaceDescriptor;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$getInterfaceDescriptor;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static getInterfaceDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    return new getInterfaceDescriptor(p0.get("count").getAsLong());
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type FrozenFrame", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type FrozenFrame", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type FrozenFrame", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$getNotifyChildrenChangedOptions;", "", "", "p0", "<init>", "(J)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getNotifyChildrenChangedOptions {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public getNotifyChildrenChangedOptions(long j) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof getNotifyChildrenChangedOptions) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == ((getNotifyChildrenChangedOptions) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public final int hashCode() {
            return Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final String toString() {
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("getNotifyChildrenChangedOptions(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$getNotifyChildrenChangedOptions$b, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$getNotifyChildrenChangedOptions$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$getNotifyChildrenChangedOptions;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$getNotifyChildrenChangedOptions;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static getNotifyChildrenChangedOptions TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    return new getNotifyChildrenChangedOptions(p0.get("count").getAsLong());
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannelStub;", "", "", "p0", "<init>", "(J)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannelStub {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public INotificationSideChannelStub(long j) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof INotificationSideChannelStub) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == ((INotificationSideChannelStub) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final int hashCode() {
            return Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final String toString() {
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("INotificationSideChannelStub(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$INotificationSideChannelStub$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannelStub$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannelStub;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$INotificationSideChannelStub;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static INotificationSideChannelStub TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    return new INotificationSideChannelStub(p0.get("count").getAsLong());
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$connect;", "", "", "p0", "p1", "<init>", "(JJ)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class connect {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public final long b;

        public connect(long j, long j2) {
            this.b = j;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j2;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof connect)) {
                return false;
            }
            connect connectVar = (connect) p0;
            return this.b == connectVar.b && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == connectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final int hashCode() {
            return (Long.hashCode(this.b) * 31) + Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final String toString() {
            long j = this.b;
            long j2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("connect(b=");
            sb.append(j);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(j2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$connect$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$connect$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$connect;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$connect;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static connect b(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    return new connect(p0.get("start").getAsLong(), p0.get(TypedValues.TransitionType.S_DURATION).getAsLong());
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type InForegroundPeriod", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type InForegroundPeriod", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type InForegroundPeriod", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$RemoteActionCompatParcelizer;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Number;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class RemoteActionCompatParcelizer {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        private final Number b;
        private final Number TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        private final Number TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Number TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public RemoteActionCompatParcelizer(Number number, Number number2, Number number3, Number number4) {
            Intrinsics.checkNotNullParameter(number, "");
            Intrinsics.checkNotNullParameter(number2, "");
            Intrinsics.checkNotNullParameter(number3, "");
            this.TuitionPaymentFragmentbindingInflater1 = number;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = number2;
            this.b = number3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = number4;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(Number number, Number number2, Number number3, Number number4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(number, number2, number3, (i & 8) != 0 ? null : number4);
        }

        public final JsonElement TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("min", this.TuitionPaymentFragmentbindingInflater1);
            jsonObject.addProperty("max", this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            jsonObject.addProperty("average", this.b);
            Number number = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (number != null) {
                jsonObject.addProperty("metric_max", number);
            }
            return jsonObject;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$RemoteActionCompatParcelizer$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$RemoteActionCompatParcelizer$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$RemoteActionCompatParcelizer;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$RemoteActionCompatParcelizer;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static RemoteActionCompatParcelizer b(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    Number asNumber = p0.get("min").getAsNumber();
                    Number asNumber2 = p0.get("max").getAsNumber();
                    Number asNumber3 = p0.get("average").getAsNumber();
                    JsonElement jsonElement = p0.get("metric_max");
                    Number asNumber4 = jsonElement != null ? jsonElement.getAsNumber() : null;
                    Intrinsics.checkNotNullExpressionValue(asNumber, "");
                    Intrinsics.checkNotNullExpressionValue(asNumber2, "");
                    Intrinsics.checkNotNullExpressionValue(asNumber3, "");
                    return new RemoteActionCompatParcelizer(asNumber, asNumber2, asNumber3, asNumber4);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type FlutterBuildTime", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type FlutterBuildTime", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type FlutterBuildTime", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, remoteActionCompatParcelizer.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, remoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, remoteActionCompatParcelizer.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, remoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentbindingInflater1.hashCode();
            int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
            int iHashCode3 = this.b.hashCode();
            Number number = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (number == null ? 0 : number.hashCode());
        }

        public final String toString() {
            Number number = this.TuitionPaymentFragmentbindingInflater1;
            Number number2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Number number3 = this.b;
            Number number4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("RemoteActionCompatParcelizer(TuitionPaymentFragmentbindingInflater1=");
            sb.append(number);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(number2);
            sb.append(", b=");
            sb.append(number3);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(number4);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$b;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;
        public final String b;

        public b(String str, String str2) {
            this.b = str;
            this.TuitionPaymentFragmentbindingInflater1 = str2;
        }

        public /* synthetic */ b(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof b)) {
                return false;
            }
            b bVar = (b) p0;
            return Intrinsics.areEqual(this.b, bVar.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, bVar.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            String str = this.b;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            String str = this.b;
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("b(b=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$b$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$b$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$b;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$b;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static b TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("technology");
                    String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = p0.get("carrier_name");
                    return new b(asString, jsonElement2 != null ? jsonElement2.getAsString() : null);
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$getServiceComponent;", "", "", "p0", "p1", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/Number;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getServiceComponent {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final Number TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final Number TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public getServiceComponent(Number number, Number number2) {
            Intrinsics.checkNotNullParameter(number, "");
            Intrinsics.checkNotNullParameter(number2, "");
            this.TuitionPaymentFragmentbindingInflater1 = number;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = number2;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof getServiceComponent)) {
                return false;
            }
            getServiceComponent getservicecomponent = (getServiceComponent) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, getservicecomponent.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getservicecomponent.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentbindingInflater1.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            Number number = this.TuitionPaymentFragmentbindingInflater1;
            Number number2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("getServiceComponent(TuitionPaymentFragmentbindingInflater1=");
            sb.append(number);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(number2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$getServiceComponent$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$getServiceComponent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$getServiceComponent;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$getServiceComponent;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static getServiceComponent TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    Number asNumber = p0.get("width").getAsNumber();
                    Number asNumber2 = p0.get("height").getAsNumber();
                    Intrinsics.checkNotNullExpressionValue(asNumber, "");
                    Intrinsics.checkNotNullExpressionValue(asNumber2, "");
                    return new getServiceComponent(asNumber, asNumber2);
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$disconnect;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/Number;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class disconnect {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final Number TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final Number TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final Number TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public final Number b;

        public disconnect(Number number, Number number2, Number number3, Number number4) {
            Intrinsics.checkNotNullParameter(number, "");
            Intrinsics.checkNotNullParameter(number2, "");
            Intrinsics.checkNotNullParameter(number3, "");
            Intrinsics.checkNotNullParameter(number4, "");
            this.b = number;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = number2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = number3;
            this.TuitionPaymentFragmentbindingInflater1 = number4;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof disconnect)) {
                return false;
            }
            disconnect disconnectVar = (disconnect) p0;
            return Intrinsics.areEqual(this.b, disconnectVar.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, disconnectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, disconnectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, disconnectVar.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            return (((((this.b.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode();
        }

        public final String toString() {
            Number number = this.b;
            Number number2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Number number3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Number number4 = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("disconnect(b=");
            sb.append(number);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(number2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(number3);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(number4);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$disconnect$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$disconnect$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$disconnect;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$disconnect;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static disconnect TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    Number asNumber = p0.get("max_depth").getAsNumber();
                    Number asNumber2 = p0.get("max_depth_scroll_top").getAsNumber();
                    Number asNumber3 = p0.get("max_scroll_height").getAsNumber();
                    Number asNumber4 = p0.get("max_scroll_height_time").getAsNumber();
                    Intrinsics.checkNotNullExpressionValue(asNumber, "");
                    Intrinsics.checkNotNullExpressionValue(asNumber2, "");
                    Intrinsics.checkNotNullExpressionValue(asNumber3, "");
                    Intrinsics.checkNotNullExpressionValue(asNumber4, "");
                    return new disconnect(asNumber, asNumber2, asNumber3, asNumber4);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Scroll", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Scroll", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Scroll", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$cancel;", "", "Lcom/datadog/android/rum/model/ViewEvent$Plan;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;", "p1", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$Plan;Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Lcom/datadog/android/rum/model/ViewEvent$Plan;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class cancel {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final Plan TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final SessionPrecondition TuitionPaymentFragmentbindingInflater1;

        public cancel(Plan plan, SessionPrecondition sessionPrecondition) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = plan;
            this.TuitionPaymentFragmentbindingInflater1 = sessionPrecondition;
        }

        public /* synthetic */ cancel(Plan plan, SessionPrecondition sessionPrecondition, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : plan, (i & 2) != 0 ? null : sessionPrecondition);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public cancel() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof cancel)) {
                return false;
            }
            cancel cancelVar = (cancel) p0;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == cancelVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && this.TuitionPaymentFragmentbindingInflater1 == cancelVar.TuitionPaymentFragmentbindingInflater1;
        }

        public final int hashCode() {
            Plan plan = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode = plan == null ? 0 : plan.hashCode();
            SessionPrecondition sessionPrecondition = this.TuitionPaymentFragmentbindingInflater1;
            return (iHashCode * 31) + (sessionPrecondition != null ? sessionPrecondition.hashCode() : 0);
        }

        public final String toString() {
            Plan plan = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            SessionPrecondition sessionPrecondition = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("cancel(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(plan);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(sessionPrecondition);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$cancel$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$cancel$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$cancel;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$cancel;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static cancel TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
                Plan planTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                String asString;
                String asString2;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("plan");
                    SessionPrecondition sessionPreconditionTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    if (jsonElement == null || (asString2 = jsonElement.getAsString()) == null) {
                        planTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    } else {
                        Plan.Companion companion = Plan.INSTANCE;
                        planTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Plan.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asString2);
                    }
                    JsonElement jsonElement2 = p0.get("session_precondition");
                    if (jsonElement2 != null && (asString = jsonElement2.getAsString()) != null) {
                        SessionPrecondition.Companion companion2 = SessionPrecondition.INSTANCE;
                        sessionPreconditionTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SessionPrecondition.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asString);
                    }
                    return new cancel(planTuitionPaymentFragmentspecialinlinedviewModeldefault3, sessionPreconditionTuitionPaymentFragmentspecialinlinedviewModeldefault1);
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$d;", "", "", "p0", "p1", "", "p2", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/Number;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/Boolean;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final Number TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final Boolean TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final Number TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public d(Number number, Number number2, Boolean bool) {
            Intrinsics.checkNotNullParameter(number, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = number;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = number2;
            this.TuitionPaymentFragmentbindingInflater1 = bool;
        }

        public /* synthetic */ d(Number number, Number number2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(number, (i & 2) != 0 ? null : number2, (i & 4) != 0 ? null : bool);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof d)) {
                return false;
            }
            d dVar = (d) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, dVar.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
            Number number = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode2 = number == null ? 0 : number.hashCode();
            Boolean bool = this.TuitionPaymentFragmentbindingInflater1;
            return (((iHashCode * 31) + iHashCode2) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            Number number = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Number number2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Boolean bool = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("d(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(number);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(number2);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$d$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$d$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$d;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$d;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static d TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    Number asNumber = p0.get("session_sample_rate").getAsNumber();
                    JsonElement jsonElement = p0.get("session_replay_sample_rate");
                    Number asNumber2 = jsonElement != null ? jsonElement.getAsNumber() : null;
                    JsonElement jsonElement2 = p0.get("start_session_replay_recording_manually");
                    Boolean boolValueOf = jsonElement2 != null ? Boolean.valueOf(jsonElement2.getAsBoolean()) : null;
                    Intrinsics.checkNotNullExpressionValue(asNumber, "");
                    return new d(asNumber, asNumber2, boolValueOf);
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

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$write;", "", "Lcom/datadog/android/rum/model/ViewEvent$State;", "p0", "", "p1", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$State;J)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/rum/model/ViewEvent$State;", "TuitionPaymentFragmentbindingInflater1", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class write {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final State TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public write(State state, long j) {
            Intrinsics.checkNotNullParameter(state, "");
            this.TuitionPaymentFragmentbindingInflater1 = state;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof write)) {
                return false;
            }
            write writeVar = (write) p0;
            return this.TuitionPaymentFragmentbindingInflater1 == writeVar.TuitionPaymentFragmentbindingInflater1 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentbindingInflater1.hashCode() * 31) + Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final String toString() {
            State state = this.TuitionPaymentFragmentbindingInflater1;
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("write(TuitionPaymentFragmentbindingInflater1=");
            sb.append(state);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$write$b, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$write$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$write;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$write;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static write TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    State.Companion companion = State.INSTANCE;
                    String asString = p0.get(RemoteConfigConstants.ResponseFieldKey.STATE).getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new write(State.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asString), p0.get("start").getAsLong());
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type PageState", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type PageState", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type PageState", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$getExtras;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/Long;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getExtras {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final Long b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final Long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final Long TuitionPaymentFragmentbindingInflater1;

        public getExtras(Long l, Long l2, Long l3) {
            this.b = l;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = l2;
            this.TuitionPaymentFragmentbindingInflater1 = l3;
        }

        public /* synthetic */ getExtras(Long l, Long l2, Long l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : l, (i & 2) != 0 ? 0L : l2, (i & 4) != 0 ? 0L : l3);
        }

        public getExtras() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof getExtras)) {
                return false;
            }
            getExtras getextras = (getExtras) p0;
            return Intrinsics.areEqual(this.b, getextras.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getextras.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, getextras.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            Long l = this.b;
            int iHashCode = l == null ? 0 : l.hashCode();
            Long l2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode2 = l2 == null ? 0 : l2.hashCode();
            Long l3 = this.TuitionPaymentFragmentbindingInflater1;
            return (((iHashCode * 31) + iHashCode2) * 31) + (l3 != null ? l3.hashCode() : 0);
        }

        public final String toString() {
            Long l = this.b;
            Long l2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Long l3 = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("getExtras(b=");
            sb.append(l);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(l2);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(l3);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$getExtras$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$getExtras$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$getExtras;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$getExtras;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static getExtras TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("records_count");
                    Long lValueOf = jsonElement != null ? Long.valueOf(jsonElement.getAsLong()) : null;
                    JsonElement jsonElement2 = p0.get("segments_count");
                    Long lValueOf2 = jsonElement2 != null ? Long.valueOf(jsonElement2.getAsLong()) : null;
                    JsonElement jsonElement3 = p0.get("segments_total_raw_size");
                    return new getExtras(lValueOf, lValueOf2, jsonElement3 != null ? Long.valueOf(jsonElement3.getAsLong()) : null);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type ReplayStats", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type ReplayStats", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type ReplayStats", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$asInterface;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class asInterface {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String b;

        public asInterface(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.b = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof asInterface) && Intrinsics.areEqual(this.b, ((asInterface) p0).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            String str = this.b;
            StringBuilder sb = new StringBuilder("asInterface(b=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$asInterface$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$asInterface$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ViewEvent$asInterface;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$asInterface;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static asInterface TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("id").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new asInterface(asString);
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "g", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asBinder", "d", "a", "asInterface"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ViewEventSource {
        ANDROID("android"),
        IOS("ios"),
        BROWSER("browser"),
        FLUTTER("flutter"),
        REACT_NATIVE("react-native"),
        ROKU("roku"),
        UNITY("unity"),
        KOTLIN_MULTIPLATFORM("kotlin-multiplatform");


        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        ViewEventSource(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$ViewEventSource$b, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource$b;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static ViewEventSource TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (ViewEventSource viewEventSource : ViewEventSource.values()) {
                    if (Intrinsics.areEqual(viewEventSource.jsonValue, p0)) {
                        return viewEventSource;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ViewEventSessionType {
        USER("user"),
        SYNTHETICS("synthetics"),
        CI_TEST("ci_test");


        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        final String jsonValue;

        ViewEventSessionType(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$ViewEventSessionType$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;", "b", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static ViewEventSessionType b(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (ViewEventSessionType viewEventSessionType : ViewEventSessionType.values()) {
                    if (Intrinsics.areEqual(viewEventSessionType.jsonValue, p0)) {
                        return viewEventSessionType;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$LoadingType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "d", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentbindingInflater1", "asInterface", "asBinder", "a"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum LoadingType {
        INITIAL_LOAD("initial_load"),
        ROUTE_CHANGE("route_change"),
        ACTIVITY_DISPLAY("activity_display"),
        ACTIVITY_REDISPLAY("activity_redisplay"),
        FRAGMENT_DISPLAY("fragment_display"),
        FRAGMENT_REDISPLAY("fragment_redisplay"),
        VIEW_CONTROLLER_DISPLAY("view_controller_display"),
        VIEW_CONTROLLER_REDISPLAY("view_controller_redisplay");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        LoadingType(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$LoadingType$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$LoadingType$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ViewEvent$LoadingType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$LoadingType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static LoadingType TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (LoadingType loadingType : LoadingType.values()) {
                    if (Intrinsics.areEqual(loadingType.jsonValue, p0)) {
                        return loadingType;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Status;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$Status$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Status$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ViewEvent$Status;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Status;"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Interface;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "d", "asBinder", "a", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "INotificationSideChannel", "g"}, k = 1, mv = {1, 7, 0}, xi = 48)
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


        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        Interface(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$Interface$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Interface$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ViewEvent$Interface;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Interface;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static Interface TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$EffectiveType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum EffectiveType {
        SLOW_2G("slow_2g"),
        b("2g"),
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("3g"),
        TuitionPaymentFragmentbindingInflater1("4g");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        EffectiveType(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$EffectiveType$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$EffectiveType$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ViewEvent$EffectiveType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$EffectiveType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static EffectiveType TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$DeviceType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "a", "d", "asInterface", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum DeviceType {
        MOBILE("mobile"),
        DESKTOP("desktop"),
        TABLET("tablet"),
        TV("tv"),
        GAMING_CONSOLE("gaming_console"),
        BOT("bot"),
        OTHER("other");


        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        DeviceType(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$DeviceType$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$DeviceType$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ViewEvent$DeviceType;", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$DeviceType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static DeviceType TuitionPaymentFragmentbindingInflater1(String p0) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ReplayLevel {
        ALLOW("allow"),
        MASK("mask"),
        MASK_USER_INPUT("mask-user-input");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        ReplayLevel(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$ReplayLevel$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel;", "b", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static ReplayLevel b(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (ReplayLevel replayLevel : ReplayLevel.values()) {
                    if (Intrinsics.areEqual(replayLevel.jsonValue, p0)) {
                        return replayLevel;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0004\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Plan;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/Number;)V", "jsonValue", "Ljava/lang/Number;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Plan {
        PLAN_1((Number) 1),
        PLAN_2((Number) 2);


        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final Number jsonValue;

        Plan(Number number) {
            this.jsonValue = number;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$Plan$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Plan$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ViewEvent$Plan;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Plan;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static Plan TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "b", "asInterface", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum SessionPrecondition {
        USER_APP_LAUNCH("user_app_launch"),
        INACTIVITY_TIMEOUT("inactivity_timeout"),
        MAX_DURATION("max_duration"),
        BACKGROUND_LAUNCH("background_launch"),
        PREWARM("prewarm"),
        FROM_NON_INTERACTIVE_SESSION("from_non_interactive_session"),
        EXPLICIT_STOP("explicit_stop");


        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        SessionPrecondition(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$SessionPrecondition$b, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition$b;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static SessionPrecondition TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$State;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "a"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum State {
        ACTIVE(AppMeasurementSdk.ConditionalUserProperty.ACTIVE),
        PASSIVE("passive"),
        HIDDEN("hidden"),
        FROZEN("frozen"),
        TERMINATED("terminated");


        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        State(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ViewEvent$State$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$State$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ViewEvent$State;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$State;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static State TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (State state : State.values()) {
                    if (Intrinsics.areEqual(state.jsonValue, p0)) {
                        return state;
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
