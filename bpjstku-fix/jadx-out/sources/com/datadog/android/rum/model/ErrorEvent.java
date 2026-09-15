package com.datadog.android.rum.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.os.EnvironmentCompat;
import com.android.volley.toolbox.HttpClientStack;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.SessionProcessor;
import defpackage.initSession;
import defpackage.toBitmap;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
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
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b?\b\u0086\b\u0018\u0000 ?2\u00020\u0001:)6;7_94@?DB=JLFHN`RaOUbcQdefSgYh]i\\jklX[mnB÷\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010!¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020,2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b2\u00103R\u0013\u00106\u001a\u0004\u0018\u00010#8\u0006¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00107\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010:R\u0016\u00104\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010B\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u0004\u0018\u00010!8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010=\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010@\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010F\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010J\u001a\u00020'8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010CR\u0016\u0010L\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010R\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010:R\u0014\u0010S\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010O\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Q\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010WR\u0014\u0010U\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0006\n\u0004\bX\u0010:R\u0016\u0010[\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010X\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u0010:R\u0014\u0010Y\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010^"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent;", "", "", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "p1", "", "p2", "p3", "p4", "p5", "Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannelDefault;", "p6", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;", "p7", "Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannelStub;", "p8", "Lcom/datadog/android/rum/model/ErrorEvent$getItem;", "p9", "Lcom/datadog/android/rum/model/ErrorEvent$asInterface;", "p10", "Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannelStubProxy;", "p11", "Lcom/datadog/android/rum/model/ErrorEvent$MediaBrowserCompat;", "p12", "Lcom/datadog/android/rum/model/ErrorEvent$d;", "p13", "Lcom/datadog/android/rum/model/ErrorEvent$write;", "p14", "Lcom/datadog/android/rum/model/ErrorEvent$onTransact;", "p15", "Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannel;", "p16", "Lcom/datadog/android/rum/model/ErrorEvent$notify;", "p17", "Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "p18", "Lcom/datadog/android/rum/model/ErrorEvent$g;", "p19", "Lcom/datadog/android/rum/model/ErrorEvent$RemoteActionCompatParcelizer;", "p20", "p21", "<init>", "(JLcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannelDefault;Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannelStub;Lcom/datadog/android/rum/model/ErrorEvent$getItem;Lcom/datadog/android/rum/model/ErrorEvent$asInterface;Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannelStubProxy;Lcom/datadog/android/rum/model/ErrorEvent$MediaBrowserCompat;Lcom/datadog/android/rum/model/ErrorEvent$d;Lcom/datadog/android/rum/model/ErrorEvent$write;Lcom/datadog/android/rum/model/ErrorEvent$onTransact;Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannel;Lcom/datadog/android/rum/model/ErrorEvent$notify;Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;Lcom/datadog/android/rum/model/ErrorEvent$g;Lcom/datadog/android/rum/model/ErrorEvent$RemoteActionCompatParcelizer;Lcom/datadog/android/rum/model/ErrorEvent$notify;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/rum/model/ErrorEvent$d;", "g", "Lcom/datadog/android/rum/model/ErrorEvent$asInterface;", "asBinder", "d", "Lcom/datadog/android/rum/model/ErrorEvent$g;", "asInterface", "Lcom/datadog/android/rum/model/ErrorEvent$notify;", "a", "J", "INotificationSideChannel", "Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannel;", "cancel", "Lcom/datadog/android/rum/model/ErrorEvent$onTransact;", "cancelAll", "Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannelStubProxy;", "notify", "Lcom/datadog/android/rum/model/ErrorEvent$RemoteActionCompatParcelizer;", "onTransact", "RemoteActionCompatParcelizer", "Lcom/datadog/android/rum/model/ErrorEvent$write;", "INotificationSideChannelStub", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannelDefault;", "INotificationSideChannelDefault", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;", "Lcom/datadog/android/rum/model/ErrorEvent$MediaBrowserCompat;", "MediaBrowserCompat", "write", "Lcom/datadog/android/rum/model/ErrorEvent$getItem;", "connect", "read", "IconCompatParcelizer", "Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannelStub;", "Category", "DeviceType", "EffectiveType", "ErrorEventSessionType", "ErrorEventSource", "ErrorSource", "Handling", "Interface", "Method", "Plan", "ProviderType", "SessionPrecondition", "SourceType", "Status", "getItem", "disconnect"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class ErrorEvent {

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public final INotificationSideChannel d;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    public final ErrorEventSource RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    public final String INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    public final MediaBrowserCompat INotificationSideChannelStub;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public final INotificationSideChannelStub write;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    public final String INotificationSideChannelDefault;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public final write notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final d b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long g;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final notify a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final onTransact cancel;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public final INotificationSideChannelStubProxy INotificationSideChannel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final g asInterface;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final asInterface asBinder;
    public final INotificationSideChannelDefault getInterfaceDescriptor;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public final RemoteActionCompatParcelizer cancelAll;
    public final notify onTransact;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public final String MediaBrowserCompat;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public final getItem connect;

    public ErrorEvent(long j, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, String str, String str2, String str3, String str4, INotificationSideChannelDefault iNotificationSideChannelDefault, ErrorEventSource errorEventSource, INotificationSideChannelStub iNotificationSideChannelStub, getItem getitem, asInterface asinterface, INotificationSideChannelStubProxy iNotificationSideChannelStubProxy, MediaBrowserCompat mediaBrowserCompat, d dVar, write writeVar, onTransact ontransact, INotificationSideChannel iNotificationSideChannel, notify notifyVar, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, g gVar, RemoteActionCompatParcelizer remoteActionCompatParcelizer, notify notifyVar2) {
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        Intrinsics.checkNotNullParameter(iNotificationSideChannelDefault, "");
        Intrinsics.checkNotNullParameter(iNotificationSideChannelStub, "");
        Intrinsics.checkNotNullParameter(iNotificationSideChannel, "");
        Intrinsics.checkNotNullParameter(remoteActionCompatParcelizer, "");
        this.g = j;
        this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.INotificationSideChannelStubProxy = str;
        this.MediaBrowserCompat = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str4;
        this.getInterfaceDescriptor = iNotificationSideChannelDefault;
        this.RemoteActionCompatParcelizer = errorEventSource;
        this.write = iNotificationSideChannelStub;
        this.connect = getitem;
        this.asBinder = asinterface;
        this.INotificationSideChannel = iNotificationSideChannelStubProxy;
        this.INotificationSideChannelStub = mediaBrowserCompat;
        this.b = dVar;
        this.notify = writeVar;
        this.cancel = ontransact;
        this.d = iNotificationSideChannel;
        this.a = notifyVar;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.asInterface = gVar;
        this.cancelAll = remoteActionCompatParcelizer;
        this.onTransact = notifyVar2;
        this.INotificationSideChannelDefault = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
    }

    public /* synthetic */ ErrorEvent(long j, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, String str, String str2, String str3, String str4, INotificationSideChannelDefault iNotificationSideChannelDefault, ErrorEventSource errorEventSource, INotificationSideChannelStub iNotificationSideChannelStub, getItem getitem, asInterface asinterface, INotificationSideChannelStubProxy iNotificationSideChannelStubProxy, MediaBrowserCompat mediaBrowserCompat, d dVar, write writeVar, onTransact ontransact, INotificationSideChannel iNotificationSideChannel, notify notifyVar, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, g gVar, RemoteActionCompatParcelizer remoteActionCompatParcelizer, notify notifyVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, tuitionPaymentFragmentspecialinlinedviewModeldefault3, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, iNotificationSideChannelDefault, (i & 128) != 0 ? null : errorEventSource, iNotificationSideChannelStub, (i & 512) != 0 ? null : getitem, (i & 1024) != 0 ? null : asinterface, (i & 2048) != 0 ? null : iNotificationSideChannelStubProxy, (i & 4096) != 0 ? null : mediaBrowserCompat, (i & 8192) != 0 ? null : dVar, (i & 16384) != 0 ? null : writeVar, (32768 & i) != 0 ? null : ontransact, iNotificationSideChannel, (131072 & i) != 0 ? null : notifyVar, (262144 & i) != 0 ? null : tuitionPaymentFragmentspecialinlinedviewModeldefault1, (524288 & i) != 0 ? null : gVar, remoteActionCompatParcelizer, (i & 2097152) != 0 ? null : notifyVar2);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$SessionPrecondition;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "b", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "d", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "a", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$SessionPrecondition$b, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$SessionPrecondition$b;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$SessionPrecondition;", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$SessionPrecondition;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private static final byte[] $$c = {87, -91, 60, 112};
            private static final int $$d = 26;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {60, 80, 13, 34, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
            private static final int $$b = 145;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int b = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -6377398940819159759L;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -981105359;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2779;

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0031). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 3
                    int r6 = 84 - r6
                    int r7 = r7 * 4
                    int r0 = r7 + 53
                    int r8 = r8 * 3
                    int r8 = 3 - r8
                    byte[] r1 = com.datadog.android.rum.model.ErrorEvent.SessionPrecondition.Companion.$$a
                    byte[] r0 = new byte[r0]
                    int r7 = r7 + 52
                    r2 = 0
                    if (r1 != 0) goto L18
                    r3 = r8
                    r4 = r2
                    goto L31
                L18:
                    r3 = r2
                L19:
                    int r8 = r8 + 1
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r7) goto L28
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L28:
                    r4 = r1[r8]
                    int r3 = r3 + 1
                    r5 = r8
                    r8 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L31:
                    int r6 = -r6
                    int r8 = r8 + r6
                    int r6 = r8 + (-11)
                    r8 = r3
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.ErrorEvent.SessionPrecondition.Companion.c(short, short, short, java.lang.Object[]):void");
            }

            private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
                int i2;
                int i3 = 2;
                int i4 = 2 % 2;
                SessionProcessor sessionProcessor = new SessionProcessor();
                int length = cArr2.length;
                char[] cArr4 = new char[length];
                int length2 = cArr.length;
                char[] cArr5 = new char[length2];
                int i5 = 0;
                System.arraycopy(cArr2, 0, cArr4, 0, length);
                System.arraycopy(cArr, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length3 = cArr3.length;
                char[] cArr6 = new char[length3];
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                int i6 = $10 + 121;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                    int i8 = $10 + 113;
                    $11 = i8 % 128;
                    int i9 = i8 % i3;
                    try {
                        Object[] objArr2 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 8327);
                            int threadPriority = ((Process.getThreadPriority(i5) + 20) >> 6) + 1235;
                            int iMyTid = 35 - (Process.myTid() >> 22);
                            byte b2 = (byte) i5;
                            byte b3 = (byte) (b2 + 2);
                            String str$$e = $$e(b2, b3, (byte) (b3 - 3));
                            Class[] clsArr = new Class[1];
                            clsArr[i5] = Object.class;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, threadPriority, iMyTid, -653973969, false, str$$e, clsArr);
                        }
                        int iIntValue = ((Integer) ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        try {
                            Object[] objArr3 = {sessionProcessor};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) i5;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 2763 - ExpandableListView.getPackedPositionChild(0L), 14 - Drawable.resolveOpacity(i5, i5), 1504416861, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class});
                            }
                            int iIntValue2 = ((Integer) ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            try {
                                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - TextUtils.getOffsetAfter("", 0)), (Process.myPid() >> 22) + 253, 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                                }
                                ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                                try {
                                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        char size = (char) (65200 - View.MeasureSpec.getSize(0));
                                        int i10 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2890;
                                        int iResolveSizeAndState = 17 - View.resolveSizeAndState(0, 0, 0);
                                        byte b6 = (byte) 0;
                                        byte b7 = (byte) (b6 + 1);
                                        String str$$e2 = $$e(b6, b7, (byte) (-b7));
                                        i2 = 2;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(size, i10, iResolveSizeAndState, 2012627446, false, str$$e2, new Class[]{Integer.TYPE, Integer.TYPE});
                                    } else {
                                        i2 = 2;
                                    }
                                    cArr5[iIntValue2] = ((Character) ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                                    cArr4[iIntValue2] = sessionProcessor.b;
                                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                                    i3 = i2;
                                    i5 = 0;
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
            }

            private Companion() {
            }

            @JvmStatic
            public static SessionPrecondition TuitionPaymentFragmentbindingInflater1(String p0) throws Throwable {
                int i;
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(p0, "");
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
                int i3 = 0;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - View.combineMeasuredStates(0, 0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 39, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 18, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                Object obj = null;
                int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                Object[] objArr = new Object[1];
                a(new char[]{0, 0, 0, 0}, new char[]{1035, 17008, 10582, 15530}, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{14421, 51728, 35925, 7170, 12274, 37745, 6102, 62734, 16218, 21859, 57224, 6004, 27224, 24082, 60940, 46758, 51271, 6978, 21666, 56973, 24434, 19376}, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                a(new char[]{0, 0, 0, 0}, new char[]{3668, 47012, 56259, 47927}, (char) (TextUtils.getTrimmedLength("") + 14299), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1011375091, new char[]{36178, 21659, 37334, 49768, 232, 11747, 54404, 23819, 12648, 8848, 40151, 19517, 65493, 44198, 36301}, objArr2);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
                long j = -1;
                long j2 = j ^ 1250453922909015966L;
                long jFreeMemory = ((((long) ((int) Runtime.getRuntime().freeMemory())) ^ j) | 1250453922909015966L) ^ j;
                long j3 = j ^ 846803251832943021L;
                long j4 = (((long) (-1939)) * 846803251832943021L) + (((long) 971) * 1250453922909015966L) + (((long) (-970)) * (((j2 | 846803251832943021L) ^ j) | jFreeMemory)) + (((long) 1940) * ((j3 | 1250453922909015966L) ^ j)) + (((long) 970) * (((j3 | j2) ^ j) | jFreeMemory));
                int i5 = 0;
                long j5 = jLongValue;
                while (true) {
                    if (i5 == 10) {
                        int length = p0 != null ? p0.length() : 0;
                        try {
                            Object[] objArr3 = {-2086547137};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46038 - View.getDefaultSize(0, 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1133, 17 - ImageFormat.getBitsPerPixel(0), 807763283, false, null, new Class[]{Integer.TYPE});
                            }
                            Object[] objArr4 = {Integer.valueOf(length), 0, -1608487220, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr3), false};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char size = (char) View.MeasureSpec.getSize(0);
                                int iRgb = Color.rgb(0, 0, 0) + 16778247;
                                int iIndexOf = 15 - TextUtils.indexOf("", "");
                                byte b2 = $$a[7];
                                byte b3 = b2;
                                Object[] objArr5 = new Object[1];
                                c(b2, b3, b3, objArr5);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size, iRgb, iIndexOf, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.MeasureSpec.getSize(0)), 1117 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 16 - ((byte) KeyEvent.getModifierMetaStateMask())), Boolean.TYPE});
                            }
                            Object[] objArr6 = (Object[]) ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            i = 0;
                            int i6 = ((int[]) objArr6[1])[0];
                            int i7 = ((int[]) objArr6[3])[0];
                            if (i7 == i6) {
                                break;
                            }
                            ArrayList arrayList = new ArrayList();
                            String[] strArr = (String[]) objArr6[0];
                            if (strArr != null) {
                                int i8 = b + 71;
                                TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                                int i9 = i8 % 2;
                                for (String str : strArr) {
                                    arrayList.add(str);
                                }
                            }
                            throw new RuntimeException(String.valueOf(i7));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37836 - View.MeasureSpec.getSize(i3)), 59 - Color.argb(i3, i3, i3, i3), (ViewConfiguration.getFadingEdgeLength() >> 16) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    int i10 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(obj);
                    int i11 = i3;
                    long j6 = j5;
                    while (true) {
                        int i12 = i3;
                        while (i12 != 8) {
                            int i13 = b + 89;
                            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                            if (i13 % 2 != 0) {
                                i10 = (((((int) (j6 >> i12)) & 16266) - (i10 % 124)) >>> (i10 >> 13)) >>> i10;
                                i12 += 25;
                            } else {
                                int i14 = (((((int) (j6 >> i12)) & 255) + (i10 << 6)) + (i10 << 16)) - i10;
                                i12++;
                                i10 = i14;
                            }
                        }
                        if (i11 != 0) {
                            break;
                        }
                        i11++;
                        j6 = j4;
                        i3 = 0;
                    }
                    if (i10 == i4) {
                        i = 0;
                        break;
                    }
                    j5 -= 1024;
                    i5++;
                    int i15 = TuitionPaymentFragmentbindingInflater1 + 73;
                    b = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i16 = 3 % 4;
                    }
                    i3 = 0;
                    obj = null;
                }
                SessionPrecondition[] sessionPreconditionArrValues = SessionPrecondition.values();
                int length2 = sessionPreconditionArrValues.length;
                int i17 = i;
                while (i17 < length2) {
                    int i18 = b + 17;
                    TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                    if (i18 % 2 != 0) {
                        Intrinsics.areEqual(sessionPreconditionArrValues[i17].jsonValue, p0);
                        throw null;
                    }
                    SessionPrecondition sessionPrecondition = sessionPreconditionArrValues[i17];
                    if (Intrinsics.areEqual(sessionPrecondition.jsonValue, p0)) {
                        return sessionPrecondition;
                    }
                    i17++;
                    int i19 = TuitionPaymentFragmentbindingInflater1 + 113;
                    b = i19 % 128;
                    int i20 = i19 % 2;
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
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
            private static java.lang.String $$e(int r6, short r7, short r8) {
                /*
                    byte[] r0 = com.datadog.android.rum.model.ErrorEvent.SessionPrecondition.Companion.$$c
                    int r6 = r6 * 3
                    int r6 = r6 + 1
                    int r8 = r8 + 4
                    int r7 = 104 - r7
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r3 = r7
                    r5 = r2
                    r7 = r6
                    goto L25
                L13:
                    r3 = r2
                L14:
                    byte r4 = (byte) r7
                    int r8 = r8 + 1
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r6) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L23:
                    r3 = r0[r8]
                L25:
                    int r7 = r7 + r3
                    r3 = r5
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.ErrorEvent.SessionPrecondition.Companion.$$e(int, short, short):java.lang.String");
            }
        }

        SessionPrecondition(String str) {
            this.jsonValue = str;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$asBinder, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$asBinder;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static ErrorEvent TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws Throwable {
            ErrorEventSource errorEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            getItem getitemTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            asInterface asinterfaceTuitionPaymentFragmentbindingInflater1;
            INotificationSideChannelStubProxy iNotificationSideChannelStubProxyTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            MediaBrowserCompat mediaBrowserCompatTuitionPaymentFragmentbindingInflater1;
            d dVarTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            write writeVarTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            onTransact ontransactTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            notify notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            g gVarTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            notify notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault4;
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
                TuitionPaymentFragmentspecialinlinedviewModeldefault3.Companion companion = TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject12, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault3.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject12);
                JsonElement jsonElement = p0.get(NotificationCompat.CATEGORY_SERVICE);
                String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                JsonElement jsonElement2 = p0.get("version");
                String asString3 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                JsonElement jsonElement3 = p0.get("build_version");
                String asString4 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                JsonElement jsonElement4 = p0.get("build_id");
                String asString5 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                JsonObject asJsonObject13 = p0.get("session").getAsJsonObject();
                INotificationSideChannelDefault.Companion companion2 = INotificationSideChannelDefault.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject13, "");
                INotificationSideChannelDefault iNotificationSideChannelDefaultTuitionPaymentFragmentspecialinlinedviewModeldefault2 = INotificationSideChannelDefault.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject13);
                JsonElement jsonElement5 = p0.get("source");
                if (jsonElement5 == null || (asString = jsonElement5.getAsString()) == null) {
                    errorEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                } else {
                    ErrorEventSource.Companion companion3 = ErrorEventSource.INSTANCE;
                    errorEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ErrorEventSource.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asString);
                }
                JsonObject asJsonObject14 = p0.get("view").getAsJsonObject();
                INotificationSideChannelStub.Companion companion4 = INotificationSideChannelStub.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject14, "");
                INotificationSideChannelStub iNotificationSideChannelStubTuitionPaymentFragmentspecialinlinedviewModeldefault1 = INotificationSideChannelStub.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject14);
                JsonElement jsonElement6 = p0.get("usr");
                if (jsonElement6 == null || (asJsonObject11 = jsonElement6.getAsJsonObject()) == null) {
                    getitemTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                } else {
                    getItem.Companion companion5 = getItem.INSTANCE;
                    getitemTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getItem.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject11);
                }
                JsonElement jsonElement7 = p0.get("connectivity");
                if (jsonElement7 == null || (asJsonObject10 = jsonElement7.getAsJsonObject()) == null) {
                    asinterfaceTuitionPaymentFragmentbindingInflater1 = null;
                } else {
                    asInterface.Companion companion6 = asInterface.INSTANCE;
                    asinterfaceTuitionPaymentFragmentbindingInflater1 = asInterface.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject10);
                }
                JsonElement jsonElement8 = p0.get(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
                if (jsonElement8 == null || (asJsonObject9 = jsonElement8.getAsJsonObject()) == null) {
                    iNotificationSideChannelStubProxyTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                } else {
                    INotificationSideChannelStubProxy.Companion companion7 = INotificationSideChannelStubProxy.INSTANCE;
                    iNotificationSideChannelStubProxyTuitionPaymentFragmentspecialinlinedviewModeldefault2 = INotificationSideChannelStubProxy.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject9);
                }
                JsonElement jsonElement9 = p0.get("synthetics");
                if (jsonElement9 == null || (asJsonObject8 = jsonElement9.getAsJsonObject()) == null) {
                    mediaBrowserCompatTuitionPaymentFragmentbindingInflater1 = null;
                } else {
                    MediaBrowserCompat.Companion companion8 = MediaBrowserCompat.INSTANCE;
                    mediaBrowserCompatTuitionPaymentFragmentbindingInflater1 = MediaBrowserCompat.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject8);
                }
                JsonElement jsonElement10 = p0.get("ci_test");
                if (jsonElement10 == null || (asJsonObject7 = jsonElement10.getAsJsonObject()) == null) {
                    dVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                } else {
                    d.Companion companion9 = d.INSTANCE;
                    dVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = d.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject7);
                }
                JsonElement jsonElement11 = p0.get("os");
                if (jsonElement11 == null || (asJsonObject6 = jsonElement11.getAsJsonObject()) == null) {
                    writeVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                } else {
                    write.Companion companion10 = write.INSTANCE;
                    writeVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = write.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject6);
                }
                JsonElement jsonElement12 = p0.get("device");
                if (jsonElement12 == null || (asJsonObject5 = jsonElement12.getAsJsonObject()) == null) {
                    ontransactTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                } else {
                    onTransact.Companion companion11 = onTransact.INSTANCE;
                    ontransactTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onTransact.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject5);
                }
                JsonObject asJsonObject15 = p0.get("_dd").getAsJsonObject();
                INotificationSideChannel.Companion companion12 = INotificationSideChannel.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject15, "");
                INotificationSideChannel iNotificationSideChannelTuitionPaymentFragmentspecialinlinedviewModeldefault2 = INotificationSideChannel.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject15);
                JsonElement jsonElement13 = p0.get("context");
                if (jsonElement13 == null || (asJsonObject4 = jsonElement13.getAsJsonObject()) == null) {
                    notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                } else {
                    notify.Companion companion13 = notify.INSTANCE;
                    notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = notify.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject4);
                }
                JsonElement jsonElement14 = p0.get("action");
                if (jsonElement14 == null || (asJsonObject3 = jsonElement14.getAsJsonObject()) == null) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                } else {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1.Companion companion14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject3);
                }
                JsonElement jsonElement15 = p0.get("container");
                if (jsonElement15 == null || (asJsonObject2 = jsonElement15.getAsJsonObject()) == null) {
                    gVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                } else {
                    g.Companion companion15 = g.INSTANCE;
                    gVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = g.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject2);
                }
                String asString6 = p0.get("type").getAsString();
                JsonObject asJsonObject16 = p0.get(Constants.IPC_BUNDLE_KEY_SEND_ERROR).getAsJsonObject();
                RemoteActionCompatParcelizer.Companion companion16 = RemoteActionCompatParcelizer.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject16, "");
                RemoteActionCompatParcelizer remoteActionCompatParcelizerTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RemoteActionCompatParcelizer.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject16);
                JsonElement jsonElement16 = p0.get("feature_flags");
                if (jsonElement16 == null || (asJsonObject = jsonElement16.getAsJsonObject()) == null) {
                    notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault4 = null;
                } else {
                    notify.Companion companion17 = notify.INSTANCE;
                    notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault4 = notify.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject);
                }
                if (!Intrinsics.areEqual(asString6, Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                return new ErrorEvent(asLong, tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1, asString2, asString3, asString4, asString5, iNotificationSideChannelDefaultTuitionPaymentFragmentspecialinlinedviewModeldefault2, errorEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault3, iNotificationSideChannelStubTuitionPaymentFragmentspecialinlinedviewModeldefault1, getitemTuitionPaymentFragmentspecialinlinedviewModeldefault3, asinterfaceTuitionPaymentFragmentbindingInflater1, iNotificationSideChannelStubProxyTuitionPaymentFragmentspecialinlinedviewModeldefault2, mediaBrowserCompatTuitionPaymentFragmentbindingInflater1, dVarTuitionPaymentFragmentspecialinlinedviewModeldefault1, writeVarTuitionPaymentFragmentspecialinlinedviewModeldefault1, ontransactTuitionPaymentFragmentspecialinlinedviewModeldefault2, iNotificationSideChannelTuitionPaymentFragmentspecialinlinedviewModeldefault2, notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault3, TuitionPaymentFragmentspecialinlinedviewModeldefault1, gVarTuitionPaymentFragmentspecialinlinedviewModeldefault3, remoteActionCompatParcelizerTuitionPaymentFragmentspecialinlinedviewModeldefault3, notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault4);
            } catch (IllegalStateException e2) {
                throw new JsonParseException("Unable to parse json into type ErrorEvent", e2);
            } catch (NullPointerException e3) {
                throw new JsonParseException("Unable to parse json into type ErrorEvent", e3);
            } catch (NumberFormatException e4) {
                throw new JsonParseException("Unable to parse json into type ErrorEvent", e4);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$DeviceType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentbindingInflater1", "asInterface", "d", "a", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum DeviceType {
        MOBILE("mobile"),
        DESKTOP("desktop"),
        TABLET("tablet"),
        TV("tv"),
        GAMING_CONSOLE("gaming_console"),
        BOT("bot"),
        OTHER("other");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$DeviceType$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$DeviceType$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$DeviceType;", "b", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$DeviceType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private static final byte[] $$c = {106, -22, 107, 95};
            private static final int $$d = 114;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {12, -88, 33, 118};
            private static final int $$b = 183;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int b = 1;
            private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {10158444, 1035855417, -142455206, -312507233, -771437846, 1782212422, -1129801772, -2032305821, 1905471455, -1984218715, 1693165095, -707265522, 882933771, -1754022106, -334277586, -82907867, -2100692388, -887587715};

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(int r5, byte r6, short r7, java.lang.Object[] r8) {
                /*
                    int r5 = r5 * 4
                    int r0 = 1 - r5
                    int r7 = r7 * 2
                    int r7 = 3 - r7
                    byte[] r1 = com.datadog.android.rum.model.ErrorEvent.DeviceType.Companion.$$a
                    int r6 = r6 * 4
                    int r6 = r6 + 98
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r5 = 0 - r5
                    if (r1 != 0) goto L18
                    r4 = r5
                    r3 = r2
                    goto L2c
                L18:
                    r3 = r2
                L19:
                    int r7 = r7 + 1
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r5) goto L28
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    r8[r2] = r5
                    return
                L28:
                    int r3 = r3 + 1
                    r4 = r1[r7]
                L2c:
                    int r6 = r6 + r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.ErrorEvent.DeviceType.Companion.c(int, byte, short, java.lang.Object[]):void");
            }

            private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
                int length;
                int[] iArr2;
                int i2;
                int i3 = 2 % 2;
                SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i4 = -1870535734;
                long j = 0;
                int i5 = 0;
                int i6 = 1;
                if (iArr3 != null) {
                    int i7 = $11 + 125;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        length = iArr3.length;
                        iArr2 = new int[length];
                        i2 = 1;
                    } else {
                        length = iArr3.length;
                        iArr2 = new int[length];
                        i2 = 0;
                    }
                    while (i2 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr3[i2])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                int iAlpha = Color.alpha(0) + 3291;
                                int packedPositionChild = 30 - ExpandableListView.getPackedPositionChild(j);
                                byte b2 = (byte) 1;
                                byte b3 = (byte) (b2 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, iAlpha, packedPositionChild, 1948206109, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            iArr2[i2] = ((Integer) ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            i2++;
                            i4 = -1870535734;
                            j = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr3 = iArr2;
                }
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i8 = 0;
                    while (i8 < length3) {
                        Object[] objArr3 = new Object[i6];
                        objArr3[i5] = Integer.valueOf(iArr5[i8]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) i6;
                            byte b5 = (byte) (b4 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', i5) + i6), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3290, 31 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1948206109, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        iArr6[i8] = ((Integer) ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i8++;
                        iArr5 = iArr5;
                        i5 = 0;
                        i6 = 1;
                    }
                    iArr5 = iArr6;
                }
                int i9 = i5;
                System.arraycopy(iArr5, i9, iArr4, i9, length2);
                sessionConfigValidatingBuilder.b = 2;
                while (sessionConfigValidatingBuilder.b < iArr.length) {
                    int i10 = $10 + 111;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                    cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                    cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                    cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                    int i12 = 17;
                    for (int i13 = 1; i12 > i13; i13 = 1) {
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i12];
                        try {
                            Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 2559 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 29 - Color.red(0), 683220507, false, $$e(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue = ((Integer) ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                            i12--;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    int i14 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                    int i15 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr5 = {sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 28878), KeyEvent.keyCodeFromString("") + 348, View.resolveSize(0, 0) + 25, -30507727, false, "G", new Class[]{Object.class});
                    }
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 ^ iArr[((Integer) ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
                    cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                    cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                    cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                    sessionConfigValidatingBuilder.b += 2;
                    int i16 = $10 + 1;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                }
                objArr[0] = new String(cArr2, 0, i);
            }

            private Companion() {
            }

            @JvmStatic
            public static DeviceType b(String p0) {
                DeviceType[] deviceTypeArrValues;
                int length;
                int i;
                DeviceType deviceType;
                int i2 = 2 % 2;
                int i3 = b + 15;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(p0, "");
                    deviceTypeArrValues = DeviceType.values();
                    length = deviceTypeArrValues.length;
                    i = 1;
                } else {
                    Intrinsics.checkNotNullParameter(p0, "");
                    deviceTypeArrValues = DeviceType.values();
                    length = deviceTypeArrValues.length;
                    i = 0;
                }
                while (i < length) {
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
                    b = i4 % 128;
                    if (i4 % 2 == 0) {
                        deviceType = deviceTypeArrValues[i];
                        int i5 = 50 / 0;
                        if (Intrinsics.areEqual(deviceType.jsonValue, p0)) {
                            return deviceType;
                        }
                        i++;
                    } else {
                        deviceType = deviceTypeArrValues[i];
                        if (Intrinsics.areEqual(deviceType.jsonValue, p0)) {
                            return deviceType;
                        }
                        i++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(int r27, int r28) {
                /*
                    Method dump skipped, instruction units count: 1958
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.ErrorEvent.DeviceType.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(int, int):java.lang.Object[]");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(short r5, byte r6, byte r7) {
                /*
                    int r5 = r5 * 56
                    int r5 = 122 - r5
                    byte[] r0 = com.datadog.android.rum.model.ErrorEvent.DeviceType.Companion.$$c
                    int r7 = r7 * 3
                    int r7 = r7 + 1
                    int r6 = r6 * 2
                    int r6 = 4 - r6
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r4 = r6
                    r5 = r7
                    r3 = r2
                    goto L27
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r5
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r7) goto L25
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    return r5
                L25:
                    r4 = r0[r6]
                L27:
                    int r6 = r6 + 1
                    int r4 = -r4
                    int r5 = r5 + r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.ErrorEvent.DeviceType.Companion.$$e(short, byte, byte):java.lang.String");
            }
        }

        DeviceType(String str) {
            this.jsonValue = str;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$g;", "", "Lcom/datadog/android/rum/model/ErrorEvent$cancelAll;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;", "p1", "<init>", "(Lcom/datadog/android/rum/model/ErrorEvent$cancelAll;Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/rum/model/ErrorEvent$cancelAll;", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class g {
        private static int TuitionPaymentFragmentbindingInflater1;
        private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public final ErrorEventSource TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final cancelAll TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static final byte[] $$c = {14, 116, 92, -78};
        private static final int $$f = 210;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {118, 35, -100, -35, 17, 3, -58, 59, 2, 24, -14, 8, 16, -3, -52, 56, 18, -5, 19, 2, -1, 0, -49, 73, 8, -3, -58, 64, 10, 11, -10, 18, 1, -8, 16, -57, 59, 16, 3, -7, 13, 10, -59, 74, -11, 17, 6, -6, -50, 41, 40, -3, -18, 24, 1, 23, -31, 21, 17, 6, -6, -60, 73, -2, 18, -5, 13, -2, -27, 54, -12, 14, 11, -75, 18};
        private static final int $$e = 79;
        private static final byte[] $$a = {80, -8, 43, 65, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 37;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f718a = 0;
        private static int g = 1;
        private static int asInterface = 1;

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 15
                int r0 = r8 + 38
                byte[] r1 = com.datadog.android.rum.model.ErrorEvent.g.$$a
                int r7 = r7 * 52
                int r7 = 108 - r7
                int r6 = r6 * 2
                int r6 = r6 + 84
                byte[] r0 = new byte[r0]
                int r8 = r8 + 37
                r2 = 0
                if (r1 != 0) goto L19
                r6 = r7
                r4 = r8
                r3 = r2
                goto L31
            L19:
                r3 = r2
            L1a:
                r5 = r7
                r7 = r6
                r6 = r5
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r8) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L2a:
                int r3 = r3 + 1
                r4 = r1[r6]
                r5 = r7
                r7 = r6
                r6 = r5
            L31:
                int r7 = r7 + 1
                int r4 = -r4
                int r6 = r6 + r4
                int r6 = r6 + (-11)
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.ErrorEvent.g.c(short, int, short, java.lang.Object[]):void");
        }

        private static void e(int i, int i2, int i3, Object[] objArr) {
            int i4 = i2 * 71;
            int i5 = i + 4;
            int i6 = 99 - i3;
            byte[] bArr = $$d;
            byte[] bArr2 = new byte[72 - i4];
            int i7 = 71 - i4;
            int i8 = -1;
            if (bArr == null) {
                i6 = (i6 + i7) - 5;
            }
            while (true) {
                i8++;
                bArr2[i8] = (byte) i6;
                if (i8 == i7) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i5++;
                    i6 = (i6 + bArr[i5]) - 5;
                }
            }
        }

        private static void d(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i4 = -1870535734;
            char c = '0';
            int i5 = 1;
            int i6 = 0;
            if (iArr2 != null) {
                int i7 = $11 + 23;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i9 = 0;
                while (i9 < length) {
                    int i10 = $11 + 77;
                    $10 = i10 % 128;
                    int i11 = i10 % i2;
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i6] = Integer.valueOf(iArr2[i9]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) i6;
                            byte b2 = (byte) (b - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", c, i6, i6) + 1), (ExpandableListView.getPackedPositionForChild(i6, i6) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i6, i6) == 0L ? 0 : -1)) + 3292, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31, 1948206109, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i9] = ((Integer) ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i9++;
                        i2 = 2;
                        i4 = -1870535734;
                        c = '0';
                        i6 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i12 = 0;
                while (i12 < length3) {
                    try {
                        Object[] objArr3 = new Object[i5];
                        objArr3[0] = Integer.valueOf(iArr5[i12]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.blue(0), 3291 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.lastIndexOf("", '0') + 32, 1948206109, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr6[i12] = ((Integer) ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i12++;
                        iArr5 = iArr5;
                        i5 = 1;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                iArr5 = iArr6;
            }
            char c2 = 0;
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            sessionConfigValidatingBuilder.b = 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                cArr[c2] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                int i13 = 17;
                for (int i14 = 1; i13 > i14; i14 = 1) {
                    int i15 = $10 + 3;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i13];
                        Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) KeyEvent.getDeadChar(0, 0), AndroidCharacter.getMirror('0') + 2511, 29 - TextUtils.getCapsMode("", 0, 0), 683220507, false, $$g(b5, b6, (byte) (-b6)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                        i13 += 3;
                    } else {
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i13];
                        try {
                            Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = (byte) (b7 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Color.alpha(0) + 2559, 29 - ((Process.getThreadPriority(0) + 20) >> 6), 683220507, false, $$g(b7, b8, (byte) (-b8)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                            i13--;
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                }
                int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr6 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28878 - ExpandableListView.getPackedPositionChild(0L)), 347 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), View.resolveSize(0, 0) + 25, -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 ^ iArr[((Integer) ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
                cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                sessionConfigValidatingBuilder.b += 2;
                c2 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public g(cancelAll cancelall, ErrorEventSource errorEventSource) {
            Intrinsics.checkNotNullParameter(cancelall, "");
            Intrinsics.checkNotNullParameter(errorEventSource, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cancelall;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = errorEventSource;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$g$b, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$g$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$g;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$g;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static g TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonObject asJsonObject = p0.get("view").getAsJsonObject();
                    cancelAll.Companion companion = cancelAll.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    cancelAll cancelallTuitionPaymentFragmentbindingInflater1 = cancelAll.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject);
                    ErrorEventSource.Companion companion2 = ErrorEventSource.INSTANCE;
                    String asString = p0.get("source").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new g(cancelallTuitionPaymentFragmentbindingInflater1, ErrorEventSource.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asString));
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

        /* JADX WARN: Code duplicated, block: B:26:0x0217  */
        public final int hashCode() throws Throwable {
            Object[] objArr;
            char c;
            int i = 2 % 2;
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode() * 31;
            int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "");
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 2267;
                int iRed = 33 - Color.red(0);
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                c(bArr[7], bArr[40], bArr[5], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iResolveSizeAndState, iRed, -887667012, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            d(new int[]{-1371903394, 167957392, 31524998, -1842022249, -456155496, -613445431, -1852716991, -742943360, 1667342320, 462300597, -2019944114, 88171274, -1036858847, 1504699564}, 22 - TextUtils.indexOf("", "", 0, 0), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d(new int[]{12935038, 1347437512, 1498704524, 2064454408, 417157667, -1882737028, 1365479101, 1251722092, 1108968660, 632613516}, 15 - Drawable.resolveOpacity(0, 0), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int iMyPid = 2267 - (Process.myPid() >> 22);
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 33;
                byte[] bArr2 = $$a;
                byte b = bArr2[7];
                byte b2 = bArr2[5];
                Object[] objArr5 = new Object[1];
                c(b, b2, b2, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration, iMyPid, packedPositionType, -874156483, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i2 = g + 99;
                f718a = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 2267;
                    int iAlpha = Color.alpha(0) + 33;
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr6 = new Object[1];
                    c(b3, b4, b4, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, threadPriority, iAlpha, -654680577, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i4 = ((int[]) objArr7[0])[0];
                int i5 = ((int[]) objArr7[3])[0];
                String[] strArr = (String[]) objArr7[1];
                int iIdentityHashCode = System.identityHashCode(this);
                int i6 = 36499926 + (((~((-272892161) | (~iIdentityHashCode))) | (-535821156)) * (-591)) + ((iIdentityHashCode | (-272892161)) * 591) + 955422999;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
                c = 3;
            } else {
                Object[] objArr8 = new Object[1];
                d(new int[]{-1643696927, 728584102, -752666294, 908578161, 2061671979, 579977087, -47584766, 1662653027, -1762642480, 15724658, -739258542, 533505090, -900494458, -116406865, 1145754340, -1682928283}, KeyEvent.keyCodeFromString("") + 26, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                d(new int[]{374238135, -1810932814, 1564582737, 657470827, 639667403, -1227502352, -1415155376, 427571682, 1204247488, -967631974, 1050495208, 580534618}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i9 = f718a + 119;
                    int i10 = i9 % 128;
                    g = i10;
                    int i11 = i9 % 2;
                    if (applicationContext instanceof ContextWrapper) {
                        int i12 = i10 + 105;
                        f718a = i12 % 128;
                        if (i12 % 2 != 0) {
                            ((ContextWrapper) applicationContext).getBaseContext();
                            throw null;
                        }
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                }
                Object[] objArr10 = new Object[1];
                d(new int[]{-1469390314, -187700097, 1516218737, -1337243408, -1314144322, 1145219656, -1704247845, -1971308828, 566253919, 434605164}, 15 - Process.getGidForName(""), objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                d(new int[]{-1181558429, 2137278205, 1945716759, 391770755, -1107994926, -1055851831, 1159932740, 1560173735, 867526529, -173381059}, 16 - ExpandableListView.getPackedPositionType(0L), objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i13 = g + 87;
                f718a = i13 % 128;
                int i14 = i13 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 955422999};
                    byte[] bArr3 = $$d;
                    byte b5 = bArr3[20];
                    byte b6 = bArr3[21];
                    Object[] objArr13 = new Object[1];
                    e(b5, b6, b6, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b7 = (byte) ($$e & TypedValues.PositionType.TYPE_DRAWPATH);
                    byte b8 = bArr3[32];
                    Object[] objArr14 = new Object[1];
                    e(b7, b8, b8, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf2 = (char) TextUtils.indexOf("", "", 0);
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2267;
                            int fadingEdgeLength = 33 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            byte b9 = $$a[7];
                            byte b10 = b9;
                            Object[] objArr16 = new Object[1];
                            c(b9, b10, b10, objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, jumpTapTimeout, fadingEdgeLength, -654680577, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            d(new int[]{-1371903394, 167957392, 31524998, -1842022249, -456155496, -613445431, -1852716991, -742943360, 1667342320, 462300597, -2019944114, 88171274, -1036858847, 1504699564}, 22 - ExpandableListView.getPackedPositionGroup(0L), objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            d(new int[]{12935038, 1347437512, 1498704524, 2064454408, 417157667, -1882737028, 1365479101, 1251722092, 1108968660, 632613516}, 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c3 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                int capsMode = TextUtils.getCapsMode("", 0, 0) + 2267;
                                int iMyPid2 = 33 - (Process.myPid() >> 22);
                                byte[] bArr4 = $$a;
                                byte b11 = bArr4[7];
                                byte b12 = bArr4[5];
                                Object[] objArr19 = new Object[1];
                                c(b11, b12, b12, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, capsMode, iMyPid2, -874156483, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 2267;
                                int iLastIndexOf = 32 - TextUtils.lastIndexOf("", '0');
                                byte[] bArr5 = $$a;
                                Object[] objArr20 = new Object[1];
                                c(bArr5[7], bArr5[40], bArr5[5], objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(capsMode2, offsetAfter, iLastIndexOf, -887667012, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr15;
                    c = 3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i15 = ((int[]) objArr[c])[0];
            int i16 = ((int[]) objArr[0])[0];
            if (i16 == i15) {
                Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                int i17 = ((int[]) objArr[2])[0];
                int i18 = ((int[]) objArr[0])[0];
                int i19 = ((int[]) objArr[3])[0];
                String[] strArr2 = (String[]) objArr[1];
                int i20 = ~System.identityHashCode(this);
                int i21 = i17 + 2104731977 + (((-220319843) | i20) * 494) + (((~(i20 | 315762561)) | (-263451492)) * 494);
                int i22 = (i21 << 13) ^ i21;
                int i23 = i22 ^ (i22 >>> 17);
                ((int[]) objArr21[2])[0] = i23 ^ (i23 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[1];
                if (strArr3 != null) {
                    int i24 = g + 85;
                    f718a = i24 % 128;
                    int i25 = 2;
                    int i26 = i24 % 2;
                    int i27 = 0;
                    while (i27 < strArr3.length) {
                        int i28 = g + 71;
                        f718a = i28 % 128;
                        if (i28 % i25 != 0) {
                            arrayList.add(strArr3[i27]);
                            i27 += 15;
                        } else {
                            arrayList.add(strArr3[i27]);
                            i27++;
                        }
                        i25 = 2;
                    }
                }
                Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
                Object[] objArr22 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                int i29 = ((int[]) objArr[2])[0];
                int i30 = ((int[]) objArr[0])[0];
                int i31 = ((int[]) objArr[3])[0];
                String[] strArr4 = (String[]) objArr[1];
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i32 = i29 + 64181723 + (((~((-764774189) | iIdentityHashCode2)) | 43939127) * (-366)) + (((~(iIdentityHashCode2 | (-755073545))) | 34238483) * 366);
                int i33 = (i32 << 13) ^ i32;
                int i34 = i33 ^ (i33 >>> 17);
                ((int[]) objArr22[2])[0] = i34 ^ (i34 << 5);
            }
            return iHashCode + iHashCode2;
        }

        static {
            TuitionPaymentFragmentbindingInflater1 = 0;
            TuitionPaymentFragmentbindingInflater1();
            INSTANCE = new Companion(null);
            int i = asInterface + 63;
            TuitionPaymentFragmentbindingInflater1 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean equals(Object p0) {
            int i = 2 % 2;
            int i2 = f718a + 37;
            int i3 = i2 % 128;
            g = i3;
            int i4 = i2 % 2;
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof g)) {
                int i5 = i3 + 125;
                f718a = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            g gVar = (g) p0;
            if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2) || this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                return false;
            }
            int i7 = f718a + 117;
            g = i7 % 128;
            if (i7 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public final String toString() {
            int i = 2 % 2;
            cancelAll cancelall = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            ErrorEventSource errorEventSource = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("g(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(cancelall);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(errorEventSource);
            sb.append(")");
            String string = sb.toString();
            int i2 = f718a + 77;
            g = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        static void TuitionPaymentFragmentbindingInflater1() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new int[]{-844412952, 1241728035, -909656506, -423587326, -50628763, -1029724761, -1309151962, -201280006, 750430000, 571523521, 1808225294, -928233510, 204441512, 1084633767, -1603959305, 243089825, 908064876, 164684547};
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r6, int r7, byte r8) {
            /*
                int r7 = r7 + 4
                int r8 = r8 * 56
                int r8 = r8 + 66
                int r6 = r6 * 2
                int r6 = 1 - r6
                byte[] r0 = com.datadog.android.rum.model.ErrorEvent.g.$$c
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r8
                r4 = r2
                r8 = r6
                goto L27
            L15:
                r3 = r2
            L16:
                int r7 = r7 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L25:
                r3 = r0[r7]
            L27:
                int r8 = r8 + r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.ErrorEvent.g.$$g(byte, int, byte):java.lang.String");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentbindingInflater1 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, ((TuitionPaymentFragmentspecialinlinedviewModeldefault3) p0).TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentbindingInflater1.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentbindingInflater1=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("id").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(asString);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannelDefault;", "", "", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSessionType;", "p1", "", "p2", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSessionType;Ljava/lang/Boolean;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/Boolean;", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSessionType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannelDefault {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final ErrorEventSessionType TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final Boolean b;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public INotificationSideChannelDefault(String str, ErrorEventSessionType errorEventSessionType, Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(errorEventSessionType, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = errorEventSessionType;
            this.b = bool;
        }

        public /* synthetic */ INotificationSideChannelDefault(String str, ErrorEventSessionType errorEventSessionType, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, errorEventSessionType, (i & 4) != 0 ? null : bool);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof INotificationSideChannelDefault)) {
                return false;
            }
            INotificationSideChannelDefault iNotificationSideChannelDefault = (INotificationSideChannelDefault) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, iNotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == iNotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && Intrinsics.areEqual(this.b, iNotificationSideChannelDefault.b);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
            int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
            Boolean bool = this.b;
            return (((iHashCode * 31) + iHashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            ErrorEventSessionType errorEventSessionType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Boolean bool = this.b;
            StringBuilder sb = new StringBuilder("INotificationSideChannelDefault(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(errorEventSessionType);
            sb.append(", b=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$INotificationSideChannelDefault$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannelDefault$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannelDefault;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannelDefault;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static INotificationSideChannelDefault TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("id").getAsString();
                    ErrorEventSessionType.Companion companion = ErrorEventSessionType.INSTANCE;
                    String asString2 = p0.get("type").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString2, "");
                    ErrorEventSessionType errorEventSessionTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ErrorEventSessionType.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asString2);
                    JsonElement jsonElement = p0.get("has_replay");
                    Boolean boolValueOf = jsonElement != null ? Boolean.valueOf(jsonElement.getAsBoolean()) : null;
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new INotificationSideChannelDefault(asString, errorEventSessionTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3, boolValueOf);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type ErrorEventSession", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type ErrorEventSession", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type ErrorEventSession", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannelStub;", "", "", "p0", "p1", "p2", "p3", "", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/Boolean;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asBinder"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannelStub {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final Boolean b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public String TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
        public String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public INotificationSideChannelStub(String str, String str2, String str3, String str4, Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str3;
            this.TuitionPaymentFragmentbindingInflater1 = str4;
            this.b = bool;
        }

        public /* synthetic */ INotificationSideChannelStub(String str, String str2, String str3, String str4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof INotificationSideChannelStub)) {
                return false;
            }
            INotificationSideChannelStub iNotificationSideChannelStub = (INotificationSideChannelStub) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, iNotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, iNotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, iNotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, iNotificationSideChannelStub.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, iNotificationSideChannelStub.b);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            int iHashCode3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            Boolean bool = this.b;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str4 = this.TuitionPaymentFragmentbindingInflater1;
            Boolean bool = this.b;
            StringBuilder sb = new StringBuilder("INotificationSideChannelStub(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str3);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str4);
            sb.append(", b=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$INotificationSideChannelStub$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannelStub$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannelStub;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannelStub;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static INotificationSideChannelStub TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
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
                    return new INotificationSideChannelStub(asString, asString2, asString3, asString4, boolValueOf);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type ErrorEventView", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type ErrorEventView", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type ErrorEventView", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$getItem;", "", "", "p0", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/util/Map;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "d", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getItem {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final String[] TuitionPaymentFragmentbindingInflater1 = {"id", "name", "email"};

        public getItem(String str, String str2, String str3, Map<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = map;
        }

        public /* synthetic */ getItem(String str, String str2, String str3, LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? new LinkedHashMap() : linkedHashMap);
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$getItem$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$getItem$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$getItem;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$getItem;", "", "", "TuitionPaymentFragmentbindingInflater1", "[Ljava/lang/String;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static getItem TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
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
                        if (!ArraysKt.contains(getItem.TuitionPaymentFragmentbindingInflater1, entry.getKey())) {
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

        public static /* synthetic */ getItem b(getItem getitem, Map map) {
            String str = getitem.TuitionPaymentFragmentbindingInflater1;
            String str2 = getitem.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str3 = getitem.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
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
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, getitem.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getitem.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getitem.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, getitem.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            String str = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentbindingInflater1;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Map<String, Object> map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("getItem(TuitionPaymentFragmentbindingInflater1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str3);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001d"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$asInterface;", "", "Lcom/datadog/android/rum/model/ErrorEvent$Status;", "p0", "", "Lcom/datadog/android/rum/model/ErrorEvent$Interface;", "p1", "Lcom/datadog/android/rum/model/ErrorEvent$EffectiveType;", "p2", "Lcom/datadog/android/rum/model/ErrorEvent$b;", "p3", "<init>", "(Lcom/datadog/android/rum/model/ErrorEvent$Status;Ljava/util/List;Lcom/datadog/android/rum/model/ErrorEvent$EffectiveType;Lcom/datadog/android/rum/model/ErrorEvent$b;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Lcom/datadog/android/rum/model/ErrorEvent$b;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "Lcom/datadog/android/rum/model/ErrorEvent$EffectiveType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/List;", "Lcom/datadog/android/rum/model/ErrorEvent$Status;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class asInterface {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final EffectiveType TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final List<Interface> b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final Status TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final b TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX WARN: Multi-variable type inference failed */
        public asInterface(Status status, List<? extends Interface> list, EffectiveType effectiveType, b bVar) {
            Intrinsics.checkNotNullParameter(status, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = status;
            this.b = list;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = effectiveType;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bVar;
        }

        public /* synthetic */ asInterface(Status status, List list, EffectiveType effectiveType, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(status, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : effectiveType, (i & 8) != 0 ? null : bVar);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof asInterface)) {
                return false;
            }
            asInterface asinterface = (asInterface) p0;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && Intrinsics.areEqual(this.b, asinterface.b) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
            List<Interface> list = this.b;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            EffectiveType effectiveType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode3 = effectiveType == null ? 0 : effectiveType.hashCode();
            b bVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bVar != null ? bVar.hashCode() : 0);
        }

        public final String toString() {
            Status status = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            List<Interface> list = this.b;
            EffectiveType effectiveType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            b bVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("asInterface(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(status);
            sb.append(", b=");
            sb.append(list);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(effectiveType);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(bVar);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$asInterface$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$asInterface$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$asInterface;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$asInterface;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static asInterface TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
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
                    b bVarB = null;
                    if (jsonElement == null || (asJsonArray = jsonElement.getAsJsonArray()) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(asJsonArray.size());
                        for (JsonElement jsonElement2 : asJsonArray) {
                            Interface.Companion companion2 = Interface.INSTANCE;
                            String asString3 = jsonElement2.getAsString();
                            Intrinsics.checkNotNullExpressionValue(asString3, "");
                            arrayList.add(Interface.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asString3));
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
                        bVarB = b.Companion.b(asJsonObject);
                    }
                    return new asInterface(statusTuitionPaymentFragmentspecialinlinedviewModeldefault2, arrayList, effectiveTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3, bVarB);
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannelStubProxy;", "", "Lcom/datadog/android/rum/model/ErrorEvent$disconnect;", "p0", "<init>", "(Lcom/datadog/android/rum/model/ErrorEvent$disconnect;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/rum/model/ErrorEvent$disconnect;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannelStubProxy {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final disconnect TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public INotificationSideChannelStubProxy(disconnect disconnectVar) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = disconnectVar;
        }

        public /* synthetic */ INotificationSideChannelStubProxy(disconnect disconnectVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : disconnectVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public INotificationSideChannelStubProxy() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof INotificationSideChannelStubProxy) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((INotificationSideChannelStubProxy) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            disconnect disconnectVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (disconnectVar == null) {
                return 0;
            }
            return disconnectVar.hashCode();
        }

        public final String toString() {
            disconnect disconnectVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("INotificationSideChannelStubProxy(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(disconnectVar);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$INotificationSideChannelStubProxy$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannelStubProxy$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannelStubProxy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannelStubProxy;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static INotificationSideChannelStubProxy TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                disconnect disconnectVarB;
                JsonObject asJsonObject;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("viewport");
                    if (jsonElement == null || (asJsonObject = jsonElement.getAsJsonObject()) == null) {
                        disconnectVarB = null;
                    } else {
                        disconnect.Companion companion = disconnect.INSTANCE;
                        disconnectVarB = disconnect.Companion.b(asJsonObject);
                    }
                    return new INotificationSideChannelStubProxy(disconnectVarB);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$MediaBrowserCompat;", "", "", "p0", "p1", "", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/Boolean;", "b", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class MediaBrowserCompat {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final Boolean b;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;

        public MediaBrowserCompat(String str, String str2, Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
            this.b = bool;
        }

        public /* synthetic */ MediaBrowserCompat(String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : bool);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof MediaBrowserCompat)) {
                return false;
            }
            MediaBrowserCompat mediaBrowserCompat = (MediaBrowserCompat) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, mediaBrowserCompat.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, mediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, mediaBrowserCompat.b);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentbindingInflater1.hashCode();
            int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
            Boolean bool = this.b;
            return (((iHashCode * 31) + iHashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentbindingInflater1;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Boolean bool = this.b;
            StringBuilder sb = new StringBuilder("MediaBrowserCompat(TuitionPaymentFragmentbindingInflater1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str2);
            sb.append(", b=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$MediaBrowserCompat$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$MediaBrowserCompat$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$MediaBrowserCompat;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$MediaBrowserCompat;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static MediaBrowserCompat TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("test_id").getAsString();
                    String asString2 = p0.get("result_id").getAsString();
                    JsonElement jsonElement = p0.get("injected");
                    Boolean boolValueOf = jsonElement != null ? Boolean.valueOf(jsonElement.getAsBoolean()) : null;
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    Intrinsics.checkNotNullExpressionValue(asString2, "");
                    return new MediaBrowserCompat(asString, asString2, boolValueOf);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$d;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public d(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof d) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((d) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("d(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$d$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$d$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$d;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$d;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static d TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("test_execution_id").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new d(asString);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$write;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class write {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public write(String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.b = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str3;
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
            return Intrinsics.areEqual(this.b, writeVar.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode();
            int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            String str = this.b;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("write(b=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str3);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$write$b, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$write$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$write;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$write;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static write TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$onTransact;", "", "Lcom/datadog/android/rum/model/ErrorEvent$DeviceType;", "p0", "", "p1", "p2", "p3", "p4", "<init>", "(Lcom/datadog/android/rum/model/ErrorEvent$DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "d", "Lcom/datadog/android/rum/model/ErrorEvent$DeviceType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class onTransact {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final String b;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final DeviceType TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public onTransact(DeviceType deviceType, String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(deviceType, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = deviceType;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.TuitionPaymentFragmentbindingInflater1 = str2;
            this.b = str3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str4;
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
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == ontransact.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ontransact.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, ontransact.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, ontransact.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ontransact.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.b;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            DeviceType deviceType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            String str3 = this.b;
            String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("onTransact(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(deviceType);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str2);
            sb.append(", b=");
            sb.append(str3);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$onTransact$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$onTransact$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$onTransact;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$onTransact;"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                    DeviceType deviceTypeB = DeviceType.Companion.b(asString);
                    JsonElement jsonElement = p0.get("name");
                    String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = p0.get("model");
                    String asString3 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    JsonElement jsonElement3 = p0.get("brand");
                    String asString4 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    JsonElement jsonElement4 = p0.get("architecture");
                    return new onTransact(deviceTypeB, asString2, asString3, asString4, jsonElement4 != null ? jsonElement4.getAsString() : null);
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

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0012\u001a\u00020\u00188\u0006X\u0086D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u001b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannel;", "", "Lcom/datadog/android/rum/model/ErrorEvent$cancel;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$a;", "p1", "", "p2", "<init>", "(Lcom/datadog/android/rum/model/ErrorEvent$cancel;Lcom/datadog/android/rum/model/ErrorEvent$a;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/rum/model/ErrorEvent$a;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "b", "J", "Lcom/datadog/android/rum/model/ErrorEvent$cancel;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannel {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final cancel b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final a TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public INotificationSideChannel(cancel cancelVar, a aVar, String str) {
            this.b = cancelVar;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = aVar;
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2L;
        }

        public /* synthetic */ INotificationSideChannel(cancel cancelVar, a aVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cancelVar, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : str);
        }

        public INotificationSideChannel() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof INotificationSideChannel)) {
                return false;
            }
            INotificationSideChannel iNotificationSideChannel = (INotificationSideChannel) p0;
            return Intrinsics.areEqual(this.b, iNotificationSideChannel.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, iNotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, iNotificationSideChannel.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            cancel cancelVar = this.b;
            int iHashCode = cancelVar == null ? 0 : cancelVar.hashCode();
            a aVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode2 = aVar == null ? 0 : aVar.hashCode();
            String str = this.TuitionPaymentFragmentbindingInflater1;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            cancel cancelVar = this.b;
            a aVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("INotificationSideChannel(b=");
            sb.append(cancelVar);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(aVar);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$INotificationSideChannel$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannel$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannel;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$INotificationSideChannel;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static INotificationSideChannel TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws Throwable {
                cancel cancelVarB;
                a aVarB;
                JsonObject asJsonObject;
                JsonObject asJsonObject2;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    long asLong = p0.get("format_version").getAsLong();
                    JsonElement jsonElement = p0.get("session");
                    if (jsonElement == null || (asJsonObject2 = jsonElement.getAsJsonObject()) == null) {
                        cancelVarB = null;
                    } else {
                        cancel.Companion companion = cancel.INSTANCE;
                        cancelVarB = cancel.Companion.b(asJsonObject2);
                    }
                    JsonElement jsonElement2 = p0.get("configuration");
                    if (jsonElement2 == null || (asJsonObject = jsonElement2.getAsJsonObject()) == null) {
                        aVarB = null;
                    } else {
                        a.Companion companion2 = a.INSTANCE;
                        aVarB = a.Companion.b(asJsonObject);
                    }
                    JsonElement jsonElement3 = p0.get("browser_sdk_version");
                    String asString = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    if (asLong != 2) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    return new INotificationSideChannel(cancelVarB, aVarB, asString);
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

    public static /* synthetic */ ErrorEvent b(ErrorEvent errorEvent, getItem getitem, notify notifyVar) {
        long j = errorEvent.g;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = errorEvent.TuitionPaymentFragmentbindingInflater1;
        String str = errorEvent.INotificationSideChannelStubProxy;
        String str2 = errorEvent.MediaBrowserCompat;
        String str3 = errorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str4 = errorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = errorEvent.getInterfaceDescriptor;
        ErrorEventSource errorEventSource = errorEvent.RemoteActionCompatParcelizer;
        INotificationSideChannelStub iNotificationSideChannelStub = errorEvent.write;
        asInterface asinterface = errorEvent.asBinder;
        INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = errorEvent.INotificationSideChannel;
        MediaBrowserCompat mediaBrowserCompat = errorEvent.INotificationSideChannelStub;
        d dVar = errorEvent.b;
        write writeVar = errorEvent.notify;
        onTransact ontransact = errorEvent.cancel;
        INotificationSideChannel iNotificationSideChannel = errorEvent.d;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = errorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        g gVar = errorEvent.asInterface;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = errorEvent.cancelAll;
        notify notifyVar2 = errorEvent.onTransact;
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        Intrinsics.checkNotNullParameter(iNotificationSideChannelDefault, "");
        Intrinsics.checkNotNullParameter(iNotificationSideChannelStub, "");
        Intrinsics.checkNotNullParameter(iNotificationSideChannel, "");
        Intrinsics.checkNotNullParameter(remoteActionCompatParcelizer, "");
        return new ErrorEvent(j, tuitionPaymentFragmentspecialinlinedviewModeldefault3, str, str2, str3, str4, iNotificationSideChannelDefault, errorEventSource, iNotificationSideChannelStub, getitem, asinterface, iNotificationSideChannelStubProxy, mediaBrowserCompat, dVar, writeVar, ontransact, iNotificationSideChannel, notifyVar, tuitionPaymentFragmentspecialinlinedviewModeldefault1, gVar, remoteActionCompatParcelizer, notifyVar2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ErrorEvent)) {
            return false;
        }
        ErrorEvent errorEvent = (ErrorEvent) p0;
        return this.g == errorEvent.g && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, errorEvent.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.INotificationSideChannelStubProxy, errorEvent.INotificationSideChannelStubProxy) && Intrinsics.areEqual(this.MediaBrowserCompat, errorEvent.MediaBrowserCompat) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, errorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, errorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.getInterfaceDescriptor, errorEvent.getInterfaceDescriptor) && this.RemoteActionCompatParcelizer == errorEvent.RemoteActionCompatParcelizer && Intrinsics.areEqual(this.write, errorEvent.write) && Intrinsics.areEqual(this.connect, errorEvent.connect) && Intrinsics.areEqual(this.asBinder, errorEvent.asBinder) && Intrinsics.areEqual(this.INotificationSideChannel, errorEvent.INotificationSideChannel) && Intrinsics.areEqual(this.INotificationSideChannelStub, errorEvent.INotificationSideChannelStub) && Intrinsics.areEqual(this.b, errorEvent.b) && Intrinsics.areEqual(this.notify, errorEvent.notify) && Intrinsics.areEqual(this.cancel, errorEvent.cancel) && Intrinsics.areEqual(this.d, errorEvent.d) && Intrinsics.areEqual(this.a, errorEvent.a) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, errorEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.asInterface, errorEvent.asInterface) && Intrinsics.areEqual(this.cancelAll, errorEvent.cancelAll) && Intrinsics.areEqual(this.onTransact, errorEvent.onTransact);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u0007\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$notify;", "", "", "", "p0", "<init>", "(Ljava/util/Map;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/util/Map;)Lcom/datadog/android/rum/model/ErrorEvent$notify;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "b", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/util/Map;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class notify {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public notify(Map<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = map;
        }

        public /* synthetic */ notify(LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new LinkedHashMap() : linkedHashMap);
        }

        public final JsonElement b() {
            JsonObject jsonObject = new JsonObject();
            for (Map.Entry<String, Object> entry : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                toBitmap tobitmap = toBitmap.INSTANCE;
                jsonObject.add(key, toBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3(value));
            }
            return jsonObject;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$notify$b, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$notify$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$notify;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$notify;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static notify TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, JsonElement> entry : p0.entrySet()) {
                        String key = entry.getKey();
                        Intrinsics.checkNotNullExpressionValue(key, "");
                        linkedHashMap.put(key, entry.getValue());
                    }
                    return new notify(linkedHashMap);
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
        public notify() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static notify TuitionPaymentFragmentspecialinlinedviewModeldefault3(Map<String, Object> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new notify(p0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof notify) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((notify) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            Map<String, Object> map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("notify(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.g);
        int iHashCode2 = this.TuitionPaymentFragmentbindingInflater1.hashCode();
        String str = this.INotificationSideChannelStubProxy;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.MediaBrowserCompat;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        int iHashCode7 = this.getInterfaceDescriptor.hashCode();
        ErrorEventSource errorEventSource = this.RemoteActionCompatParcelizer;
        int iHashCode8 = errorEventSource == null ? 0 : errorEventSource.hashCode();
        int iHashCode9 = this.write.hashCode();
        getItem getitem = this.connect;
        int iHashCode10 = getitem == null ? 0 : getitem.hashCode();
        asInterface asinterface = this.asBinder;
        int iHashCode11 = asinterface == null ? 0 : asinterface.hashCode();
        INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = this.INotificationSideChannel;
        int iHashCode12 = iNotificationSideChannelStubProxy == null ? 0 : iNotificationSideChannelStubProxy.hashCode();
        MediaBrowserCompat mediaBrowserCompat = this.INotificationSideChannelStub;
        int iHashCode13 = mediaBrowserCompat == null ? 0 : mediaBrowserCompat.hashCode();
        d dVar = this.b;
        int iHashCode14 = dVar == null ? 0 : dVar.hashCode();
        write writeVar = this.notify;
        int iHashCode15 = writeVar == null ? 0 : writeVar.hashCode();
        onTransact ontransact = this.cancel;
        int iHashCode16 = ontransact == null ? 0 : ontransact.hashCode();
        int iHashCode17 = this.d.hashCode();
        notify notifyVar = this.a;
        int iHashCode18 = notifyVar == null ? 0 : notifyVar.hashCode();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode19 = tuitionPaymentFragmentspecialinlinedviewModeldefault1 == null ? 0 : tuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        g gVar = this.asInterface;
        int iHashCode20 = gVar == null ? 0 : gVar.hashCode();
        int iHashCode21 = this.cancelAll.hashCode();
        notify notifyVar2 = this.onTransact;
        return (((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + (notifyVar2 != null ? notifyVar2.hashCode() : 0);
    }

    public final String toString() {
        long j = this.g;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentbindingInflater1;
        String str = this.INotificationSideChannelStubProxy;
        String str2 = this.MediaBrowserCompat;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = this.getInterfaceDescriptor;
        ErrorEventSource errorEventSource = this.RemoteActionCompatParcelizer;
        INotificationSideChannelStub iNotificationSideChannelStub = this.write;
        getItem getitem = this.connect;
        asInterface asinterface = this.asBinder;
        INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = this.INotificationSideChannel;
        MediaBrowserCompat mediaBrowserCompat = this.INotificationSideChannelStub;
        d dVar = this.b;
        write writeVar = this.notify;
        onTransact ontransact = this.cancel;
        INotificationSideChannel iNotificationSideChannel = this.d;
        notify notifyVar = this.a;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        g gVar = this.asInterface;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.cancelAll;
        notify notifyVar2 = this.onTransact;
        StringBuilder sb = new StringBuilder("ErrorEvent(g=");
        sb.append(j);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", INotificationSideChannelStubProxy=");
        sb.append(str);
        sb.append(", MediaBrowserCompat=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str4);
        sb.append(", getInterfaceDescriptor=");
        sb.append(iNotificationSideChannelDefault);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(errorEventSource);
        sb.append(", write=");
        sb.append(iNotificationSideChannelStub);
        sb.append(", connect=");
        sb.append(getitem);
        sb.append(", asBinder=");
        sb.append(asinterface);
        sb.append(", INotificationSideChannel=");
        sb.append(iNotificationSideChannelStubProxy);
        sb.append(", INotificationSideChannelStub=");
        sb.append(mediaBrowserCompat);
        sb.append(", b=");
        sb.append(dVar);
        sb.append(", notify=");
        sb.append(writeVar);
        sb.append(", cancel=");
        sb.append(ontransact);
        sb.append(", d=");
        sb.append(iNotificationSideChannel);
        sb.append(", a=");
        sb.append(notifyVar);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", asInterface=");
        sb.append(gVar);
        sb.append(", cancelAll=");
        sb.append(remoteActionCompatParcelizer);
        sb.append(", onTransact=");
        sb.append(notifyVar2);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "", "", "p0", "<init>", "(Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final List<String> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = list;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((TuitionPaymentFragmentspecialinlinedviewModeldefault1) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            List<String> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1$b, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonArray asJsonArray = p0.get("id").getAsJsonArray();
                    ArrayList arrayList = new ArrayList(asJsonArray.size());
                    Intrinsics.checkNotNullExpressionValue(asJsonArray, "");
                    Iterator<JsonElement> it = asJsonArray.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getAsString());
                    }
                    return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(arrayList);
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

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b!\b\u0087\b\u0018\u0000 32\u00020\u0001:\u00013Bé\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b(\u0010)R\u001c\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010*\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b,\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00100R\u0016\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00100R\u0016\u00101\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00106\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b8\u00100R\u0016\u00108\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u00109\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bA\u00100R\u001c\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010+R\u0016\u0010E\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010C\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u00100R\u0016\u0010B\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u00107"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$RemoteActionCompatParcelizer;", "", "", "p0", "p1", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;", "p2", "p3", "", "Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentbindingInflater1;", "p4", "", "p5", "p6", "p7", "Lcom/datadog/android/rum/model/ErrorEvent$Category;", "p8", "Lcom/datadog/android/rum/model/ErrorEvent$Handling;", "p9", "p10", "Lcom/datadog/android/rum/model/ErrorEvent$SourceType;", "p11", "Lcom/datadog/android/rum/model/ErrorEvent$read;", "p12", "Lcom/datadog/android/rum/model/ErrorEvent$connect;", "p13", "Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "p14", "p15", "Lcom/datadog/android/rum/model/ErrorEvent$getInterfaceDescriptor;", "p16", "", "p17", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$Category;Lcom/datadog/android/rum/model/ErrorEvent$Handling;Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$SourceType;Lcom/datadog/android/rum/model/ErrorEvent$read;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/datadog/android/rum/model/ErrorEvent$getInterfaceDescriptor;Ljava/lang/Long;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/rum/model/ErrorEvent$Category;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "a", "Lcom/datadog/android/rum/model/ErrorEvent$Handling;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "d", "asBinder", "Ljava/lang/Boolean;", "g", "onTransact", "Lcom/datadog/android/rum/model/ErrorEvent$getInterfaceDescriptor;", "cancelAll", "Lcom/datadog/android/rum/model/ErrorEvent$read;", "INotificationSideChannel", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;", "cancel", "Lcom/datadog/android/rum/model/ErrorEvent$SourceType;", "notify", "INotificationSideChannelStub", "RemoteActionCompatParcelizer", "Ljava/lang/Long;", "getInterfaceDescriptor", "INotificationSideChannelDefault"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class RemoteActionCompatParcelizer {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final ErrorSource INotificationSideChannel;

        /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
        public final Boolean INotificationSideChannelStub;

        /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
        public final List<connect> cancelAll;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        public final Long getInterfaceDescriptor;
        public String TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public List<TuitionPaymentFragmentbindingInflater1> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final Category b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Handling TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
        public final Boolean a;

        /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
        public final String d;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final List<TuitionPaymentFragmentspecialinlinedviewModeldefault2> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final SourceType cancel;

        /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
        public final read onTransact;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final String asInterface;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public String asBinder;

        /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
        public final String RemoteActionCompatParcelizer;
        public String notify;

        /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
        public final getInterfaceDescriptor g;

        public RemoteActionCompatParcelizer(String str, String str2, ErrorSource errorSource, String str3, List<TuitionPaymentFragmentbindingInflater1> list, Boolean bool, String str4, String str5, Category category, Handling handling, String str6, SourceType sourceType, read readVar, List<connect> list2, List<TuitionPaymentFragmentspecialinlinedviewModeldefault2> list3, Boolean bool2, getInterfaceDescriptor getinterfacedescriptor, Long l) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(errorSource, "");
            this.asInterface = str;
            this.asBinder = str2;
            this.INotificationSideChannel = errorSource;
            this.notify = str3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
            this.a = bool;
            this.TuitionPaymentFragmentbindingInflater1 = str4;
            this.RemoteActionCompatParcelizer = str5;
            this.b = category;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = handling;
            this.d = str6;
            this.cancel = sourceType;
            this.onTransact = readVar;
            this.cancelAll = list2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = list3;
            this.INotificationSideChannelStub = bool2;
            this.g = getinterfacedescriptor;
            this.getInterfaceDescriptor = l;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(String str, String str2, ErrorSource errorSource, String str3, List list, Boolean bool, String str4, String str5, Category category, Handling handling, String str6, SourceType sourceType, read readVar, List list2, List list3, Boolean bool2, getInterfaceDescriptor getinterfacedescriptor, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, str2, errorSource, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : category, (i & 512) != 0 ? null : handling, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : sourceType, (i & 4096) != 0 ? null : readVar, (i & 8192) != 0 ? null : list2, (i & 16384) != 0 ? null : list3, (32768 & i) != 0 ? null : bool2, (65536 & i) != 0 ? null : getinterfacedescriptor, (i & 131072) != 0 ? null : l);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) p0;
            return Intrinsics.areEqual(this.asInterface, remoteActionCompatParcelizer.asInterface) && Intrinsics.areEqual(this.asBinder, remoteActionCompatParcelizer.asBinder) && this.INotificationSideChannel == remoteActionCompatParcelizer.INotificationSideChannel && Intrinsics.areEqual(this.notify, remoteActionCompatParcelizer.notify) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, remoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.a, remoteActionCompatParcelizer.a) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, remoteActionCompatParcelizer.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.RemoteActionCompatParcelizer, remoteActionCompatParcelizer.RemoteActionCompatParcelizer) && this.b == remoteActionCompatParcelizer.b && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == remoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && Intrinsics.areEqual(this.d, remoteActionCompatParcelizer.d) && this.cancel == remoteActionCompatParcelizer.cancel && Intrinsics.areEqual(this.onTransact, remoteActionCompatParcelizer.onTransact) && Intrinsics.areEqual(this.cancelAll, remoteActionCompatParcelizer.cancelAll) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, remoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.INotificationSideChannelStub, remoteActionCompatParcelizer.INotificationSideChannelStub) && Intrinsics.areEqual(this.g, remoteActionCompatParcelizer.g) && Intrinsics.areEqual(this.getInterfaceDescriptor, remoteActionCompatParcelizer.getInterfaceDescriptor);
        }

        public final int hashCode() {
            String str = this.asInterface;
            int iHashCode = str == null ? 0 : str.hashCode();
            int iHashCode2 = this.asBinder.hashCode();
            int iHashCode3 = this.INotificationSideChannel.hashCode();
            String str2 = this.notify;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            List<TuitionPaymentFragmentbindingInflater1> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode5 = list == null ? 0 : list.hashCode();
            Boolean bool = this.a;
            int iHashCode6 = bool == null ? 0 : bool.hashCode();
            String str3 = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode7 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.RemoteActionCompatParcelizer;
            int iHashCode8 = str4 == null ? 0 : str4.hashCode();
            Category category = this.b;
            int iHashCode9 = category == null ? 0 : category.hashCode();
            Handling handling = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode10 = handling == null ? 0 : handling.hashCode();
            String str5 = this.d;
            int iHashCode11 = str5 == null ? 0 : str5.hashCode();
            SourceType sourceType = this.cancel;
            int iHashCode12 = sourceType == null ? 0 : sourceType.hashCode();
            read readVar = this.onTransact;
            int iHashCode13 = readVar == null ? 0 : readVar.hashCode();
            List<connect> list2 = this.cancelAll;
            int iHashCode14 = list2 == null ? 0 : list2.hashCode();
            List<TuitionPaymentFragmentspecialinlinedviewModeldefault2> list3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode15 = list3 == null ? 0 : list3.hashCode();
            Boolean bool2 = this.INotificationSideChannelStub;
            int iHashCode16 = bool2 == null ? 0 : bool2.hashCode();
            getInterfaceDescriptor getinterfacedescriptor = this.g;
            int iHashCode17 = getinterfacedescriptor == null ? 0 : getinterfacedescriptor.hashCode();
            Long l = this.getInterfaceDescriptor;
            return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            String str = this.asInterface;
            String str2 = this.asBinder;
            ErrorSource errorSource = this.INotificationSideChannel;
            String str3 = this.notify;
            List<TuitionPaymentFragmentbindingInflater1> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Boolean bool = this.a;
            String str4 = this.TuitionPaymentFragmentbindingInflater1;
            String str5 = this.RemoteActionCompatParcelizer;
            Category category = this.b;
            Handling handling = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str6 = this.d;
            SourceType sourceType = this.cancel;
            read readVar = this.onTransact;
            List<connect> list2 = this.cancelAll;
            List<TuitionPaymentFragmentspecialinlinedviewModeldefault2> list3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Boolean bool2 = this.INotificationSideChannelStub;
            getInterfaceDescriptor getinterfacedescriptor = this.g;
            Long l = this.getInterfaceDescriptor;
            StringBuilder sb = new StringBuilder("RemoteActionCompatParcelizer(asInterface=");
            sb.append(str);
            sb.append(", asBinder=");
            sb.append(str2);
            sb.append(", INotificationSideChannel=");
            sb.append(errorSource);
            sb.append(", notify=");
            sb.append(str3);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(list);
            sb.append(", a=");
            sb.append(bool);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str4);
            sb.append(", RemoteActionCompatParcelizer=");
            sb.append(str5);
            sb.append(", b=");
            sb.append(category);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(handling);
            sb.append(", d=");
            sb.append(str6);
            sb.append(", cancel=");
            sb.append(sourceType);
            sb.append(", onTransact=");
            sb.append(readVar);
            sb.append(", cancelAll=");
            sb.append(list2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(list3);
            sb.append(", INotificationSideChannelStub=");
            sb.append(bool2);
            sb.append(", g=");
            sb.append(getinterfacedescriptor);
            sb.append(", getInterfaceDescriptor=");
            sb.append(l);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$RemoteActionCompatParcelizer$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$RemoteActionCompatParcelizer$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$RemoteActionCompatParcelizer;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$RemoteActionCompatParcelizer;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static RemoteActionCompatParcelizer TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                String str;
                String str2;
                String str3;
                String asString;
                ArrayList arrayList;
                Category categoryTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Handling handlingTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                SourceType sourceTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                read readVarTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                ArrayList arrayList2;
                ArrayList arrayList3;
                getInterfaceDescriptor getinterfacedescriptorTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                JsonObject asJsonObject;
                JsonArray asJsonArray;
                JsonArray asJsonArray2;
                JsonObject asJsonObject2;
                String asString2;
                String asString3;
                String asString4;
                JsonArray asJsonArray3;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    try {
                        JsonElement jsonElement = p0.get("id");
                        if (jsonElement != null) {
                            try {
                                asString = jsonElement.getAsString();
                            } catch (IllegalStateException e2) {
                                e = e2;
                                str3 = "Unable to parse json into type Error";
                                throw new JsonParseException(str3, e);
                            } catch (NumberFormatException e3) {
                                e = e3;
                                str2 = "Unable to parse json into type Error";
                                throw new JsonParseException(str2, e);
                            }
                        } else {
                            asString = null;
                        }
                        String asString5 = p0.get("message").getAsString();
                        ErrorSource.Companion companion = ErrorSource.INSTANCE;
                        String asString6 = p0.get("source").getAsString();
                        Intrinsics.checkNotNullExpressionValue(asString6, "");
                        ErrorSource errorSourceTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ErrorSource.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asString6);
                        JsonElement jsonElement2 = p0.get("stack");
                        String asString7 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                        JsonElement jsonElement3 = p0.get("causes");
                        if (jsonElement3 == null || (asJsonArray3 = jsonElement3.getAsJsonArray()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(asJsonArray3.size());
                            for (JsonElement jsonElement4 : asJsonArray3) {
                                TuitionPaymentFragmentbindingInflater1.Companion companion2 = TuitionPaymentFragmentbindingInflater1.INSTANCE;
                                JsonObject asJsonObject3 = jsonElement4.getAsJsonObject();
                                Intrinsics.checkNotNullExpressionValue(asJsonObject3, "");
                                arrayList.add(TuitionPaymentFragmentbindingInflater1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject3));
                            }
                        }
                        JsonElement jsonElement5 = p0.get("is_crash");
                        Boolean boolValueOf = jsonElement5 != null ? Boolean.valueOf(jsonElement5.getAsBoolean()) : null;
                        JsonElement jsonElement6 = p0.get("fingerprint");
                        String asString8 = jsonElement6 != null ? jsonElement6.getAsString() : null;
                        JsonElement jsonElement7 = p0.get("type");
                        String asString9 = jsonElement7 != null ? jsonElement7.getAsString() : null;
                        JsonElement jsonElement8 = p0.get("category");
                        if (jsonElement8 == null || (asString4 = jsonElement8.getAsString()) == null) {
                            categoryTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                        } else {
                            Category.Companion companion3 = Category.INSTANCE;
                            categoryTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Category.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asString4);
                        }
                        JsonElement jsonElement9 = p0.get("handling");
                        if (jsonElement9 == null || (asString3 = jsonElement9.getAsString()) == null) {
                            handlingTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                        } else {
                            Handling.Companion companion4 = Handling.INSTANCE;
                            handlingTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Handling.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asString3);
                        }
                        JsonElement jsonElement10 = p0.get("handling_stack");
                        String asString10 = jsonElement10 != null ? jsonElement10.getAsString() : null;
                        JsonElement jsonElement11 = p0.get("source_type");
                        if (jsonElement11 == null || (asString2 = jsonElement11.getAsString()) == null) {
                            sourceTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                        } else {
                            SourceType.Companion companion5 = SourceType.INSTANCE;
                            sourceTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = SourceType.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asString2);
                        }
                        JsonElement jsonElement12 = p0.get("resource");
                        if (jsonElement12 == null || (asJsonObject2 = jsonElement12.getAsJsonObject()) == null) {
                            readVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                        } else {
                            read.Companion companion6 = read.INSTANCE;
                            readVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = read.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject2);
                        }
                        JsonElement jsonElement13 = p0.get("threads");
                        if (jsonElement13 == null || (asJsonArray2 = jsonElement13.getAsJsonArray()) == null) {
                            arrayList2 = null;
                        } else {
                            arrayList2 = new ArrayList(asJsonArray2.size());
                            for (JsonElement jsonElement14 : asJsonArray2) {
                                connect.Companion companion7 = connect.INSTANCE;
                                JsonObject asJsonObject4 = jsonElement14.getAsJsonObject();
                                Intrinsics.checkNotNullExpressionValue(asJsonObject4, "");
                                arrayList2.add(connect.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject4));
                            }
                        }
                        JsonElement jsonElement15 = p0.get("binary_images");
                        if (jsonElement15 == null || (asJsonArray = jsonElement15.getAsJsonArray()) == null) {
                            str = "Unable to parse json into type Error";
                            arrayList3 = null;
                        } else {
                            str = "Unable to parse json into type Error";
                            try {
                                arrayList3 = new ArrayList(asJsonArray.size());
                                for (JsonElement jsonElement16 : asJsonArray) {
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2.Companion companion8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE;
                                    JsonObject asJsonObject5 = jsonElement16.getAsJsonObject();
                                    Intrinsics.checkNotNullExpressionValue(asJsonObject5, "");
                                    arrayList3.add(TuitionPaymentFragmentspecialinlinedviewModeldefault2.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject5));
                                }
                            } catch (IllegalStateException e4) {
                                e = e4;
                                str3 = str;
                                throw new JsonParseException(str3, e);
                            } catch (NullPointerException e5) {
                                e = e5;
                                throw new JsonParseException(str, e);
                            } catch (NumberFormatException e6) {
                                e = e6;
                                str2 = str;
                                throw new JsonParseException(str2, e);
                            }
                        }
                        JsonElement jsonElement17 = p0.get("was_truncated");
                        Boolean boolValueOf2 = jsonElement17 != null ? Boolean.valueOf(jsonElement17.getAsBoolean()) : null;
                        JsonElement jsonElement18 = p0.get("meta");
                        if (jsonElement18 == null || (asJsonObject = jsonElement18.getAsJsonObject()) == null) {
                            getinterfacedescriptorTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                        } else {
                            getInterfaceDescriptor.Companion companion9 = getInterfaceDescriptor.INSTANCE;
                            getinterfacedescriptorTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getInterfaceDescriptor.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject);
                        }
                        JsonElement jsonElement19 = p0.get("time_since_app_start");
                        Long lValueOf = jsonElement19 != null ? Long.valueOf(jsonElement19.getAsLong()) : null;
                        Intrinsics.checkNotNullExpressionValue(asString5, "");
                        return new RemoteActionCompatParcelizer(asString, asString5, errorSourceTuitionPaymentFragmentspecialinlinedviewModeldefault2, asString7, arrayList, boolValueOf, asString8, asString9, categoryTuitionPaymentFragmentspecialinlinedviewModeldefault3, handlingTuitionPaymentFragmentspecialinlinedviewModeldefault2, asString10, sourceTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3, readVarTuitionPaymentFragmentspecialinlinedviewModeldefault3, arrayList2, arrayList3, boolValueOf2, getinterfacedescriptorTuitionPaymentFragmentspecialinlinedviewModeldefault2, lValueOf);
                    } catch (NullPointerException e7) {
                        e = e7;
                        str = "Unable to parse json into type Error";
                    }
                } catch (IllegalStateException e8) {
                    e = e8;
                    str = "Unable to parse json into type Error";
                } catch (NumberFormatException e9) {
                    e = e9;
                    str = "Unable to parse json into type Error";
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$b;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String b;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public b(String str, String str2) {
            this.b = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
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
            return Intrinsics.areEqual(this.b, bVar.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            String str = this.b;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            String str = this.b;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("b(b=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$b$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$b$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$b;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$b;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static b b(JsonObject p0) throws JsonParseException {
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$disconnect;", "", "", "p0", "p1", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/Number;", "b", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class disconnect {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final Number b;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final Number TuitionPaymentFragmentbindingInflater1;

        public disconnect(Number number, Number number2) {
            Intrinsics.checkNotNullParameter(number, "");
            Intrinsics.checkNotNullParameter(number2, "");
            this.TuitionPaymentFragmentbindingInflater1 = number;
            this.b = number2;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof disconnect)) {
                return false;
            }
            disconnect disconnectVar = (disconnect) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, disconnectVar.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, disconnectVar.b);
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentbindingInflater1.hashCode() * 31) + this.b.hashCode();
        }

        public final String toString() {
            Number number = this.TuitionPaymentFragmentbindingInflater1;
            Number number2 = this.b;
            StringBuilder sb = new StringBuilder("disconnect(TuitionPaymentFragmentbindingInflater1=");
            sb.append(number);
            sb.append(", b=");
            sb.append(number2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$disconnect$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$disconnect$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$disconnect;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$disconnect;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static disconnect b(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    Number asNumber = p0.get("width").getAsNumber();
                    Number asNumber2 = p0.get("height").getAsNumber();
                    Intrinsics.checkNotNullExpressionValue(asNumber, "");
                    Intrinsics.checkNotNullExpressionValue(asNumber2, "");
                    return new disconnect(asNumber, asNumber2);
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

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$cancel;", "", "Lcom/datadog/android/rum/model/ErrorEvent$Plan;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$SessionPrecondition;", "p1", "<init>", "(Lcom/datadog/android/rum/model/ErrorEvent$Plan;Lcom/datadog/android/rum/model/ErrorEvent$SessionPrecondition;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/rum/model/ErrorEvent$Plan;", "b", "TuitionPaymentFragmentbindingInflater1", "Lcom/datadog/android/rum/model/ErrorEvent$SessionPrecondition;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class cancel {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final SessionPrecondition TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final Plan b;

        public cancel(Plan plan, SessionPrecondition sessionPrecondition) {
            this.b = plan;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = sessionPrecondition;
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
            return this.b == cancelVar.b && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == cancelVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final int hashCode() {
            Plan plan = this.b;
            int iHashCode = plan == null ? 0 : plan.hashCode();
            SessionPrecondition sessionPrecondition = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return (iHashCode * 31) + (sessionPrecondition != null ? sessionPrecondition.hashCode() : 0);
        }

        public final String toString() {
            Plan plan = this.b;
            SessionPrecondition sessionPrecondition = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("cancel(b=");
            sb.append(plan);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(sessionPrecondition);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$cancel$b, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$cancel$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$cancel;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$cancel;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static cancel b(JsonObject p0) throws Throwable {
                Plan planTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                String asString;
                String asString2;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("plan");
                    SessionPrecondition sessionPreconditionTuitionPaymentFragmentbindingInflater1 = null;
                    if (jsonElement == null || (asString2 = jsonElement.getAsString()) == null) {
                        planTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    } else {
                        Plan.Companion companion = Plan.INSTANCE;
                        planTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Plan.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asString2);
                    }
                    JsonElement jsonElement2 = p0.get("session_precondition");
                    if (jsonElement2 != null && (asString = jsonElement2.getAsString()) != null) {
                        SessionPrecondition.Companion companion2 = SessionPrecondition.INSTANCE;
                        sessionPreconditionTuitionPaymentFragmentbindingInflater1 = SessionPrecondition.Companion.TuitionPaymentFragmentbindingInflater1(asString);
                    }
                    return new cancel(planTuitionPaymentFragmentspecialinlinedviewModeldefault2, sessionPreconditionTuitionPaymentFragmentbindingInflater1);
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$a;", "", "", "p0", "p1", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/Number;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final Number TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final Number b;

        public a(Number number, Number number2) {
            Intrinsics.checkNotNullParameter(number, "");
            this.TuitionPaymentFragmentbindingInflater1 = number;
            this.b = number2;
        }

        public /* synthetic */ a(Number number, Number number2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(number, (i & 2) != 0 ? null : number2);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof a)) {
                return false;
            }
            a aVar = (a) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, aVar.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, aVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentbindingInflater1.hashCode();
            Number number = this.b;
            return (iHashCode * 31) + (number == null ? 0 : number.hashCode());
        }

        public final String toString() {
            Number number = this.TuitionPaymentFragmentbindingInflater1;
            Number number2 = this.b;
            StringBuilder sb = new StringBuilder("a(TuitionPaymentFragmentbindingInflater1=");
            sb.append(number);
            sb.append(", b=");
            sb.append(number2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$a$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$a$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$a;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$a;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static a b(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    Number asNumber = p0.get("session_sample_rate").getAsNumber();
                    JsonElement jsonElement = p0.get("session_replay_sample_rate");
                    Number asNumber2 = jsonElement != null ? jsonElement.getAsNumber() : null;
                    Intrinsics.checkNotNullExpressionValue(asNumber, "");
                    return new a(asNumber, asNumber2);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$cancelAll;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class cancelAll {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public cancelAll(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof cancelAll) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((cancelAll) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("cancelAll(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$cancelAll$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$cancelAll$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$cancelAll;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$cancelAll;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static cancelAll TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("id").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new cancelAll(asString);
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentbindingInflater1;", "", "", "p0", "p1", "p2", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentbindingInflater1 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final ErrorSource TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public String TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentbindingInflater1(String str, String str2, String str3, ErrorSource errorSource) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(errorSource, "");
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = errorSource;
        }

        public /* synthetic */ TuitionPaymentFragmentbindingInflater1(String str, String str2, String str3, ErrorSource errorSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, errorSource);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof TuitionPaymentFragmentbindingInflater1)) {
                return false;
            }
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentbindingInflater1.hashCode();
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentbindingInflater1;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            ErrorSource errorSource = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentbindingInflater1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str3);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(errorSource);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$TuitionPaymentFragmentbindingInflater1$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentbindingInflater1$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentbindingInflater1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentbindingInflater1;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("message").getAsString();
                    JsonElement jsonElement = p0.get("type");
                    String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = p0.get("stack");
                    String asString3 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    ErrorSource.Companion companion = ErrorSource.INSTANCE;
                    String asString4 = p0.get("source").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString4, "");
                    ErrorSource errorSourceTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ErrorSource.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asString4);
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new TuitionPaymentFragmentbindingInflater1(asString, asString2, asString3, errorSourceTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Cause", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Cause", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Cause", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001a\u001a\u00020\u00068\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$read;", "", "Lcom/datadog/android/rum/model/ErrorEvent$Method;", "p0", "", "p1", "", "p2", "Lcom/datadog/android/rum/model/ErrorEvent$IconCompatParcelizer;", "p3", "<init>", "(Lcom/datadog/android/rum/model/ErrorEvent$Method;JLjava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$IconCompatParcelizer;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/rum/model/ErrorEvent$Method;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/rum/model/ErrorEvent$IconCompatParcelizer;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "J", "Ljava/lang/String;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class read {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final IconCompatParcelizer b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final Method TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public read(Method method, long j, String str, IconCompatParcelizer iconCompatParcelizer) {
            Intrinsics.checkNotNullParameter(method, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentbindingInflater1 = method;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            this.b = iconCompatParcelizer;
        }

        public /* synthetic */ read(Method method, long j, String str, IconCompatParcelizer iconCompatParcelizer, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, j, str, (i & 8) != 0 ? null : iconCompatParcelizer);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof read)) {
                return false;
            }
            read readVar = (read) p0;
            return this.TuitionPaymentFragmentbindingInflater1 == readVar.TuitionPaymentFragmentbindingInflater1 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == readVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, readVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.b, readVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentbindingInflater1.hashCode();
            int iHashCode2 = Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            int iHashCode3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
            IconCompatParcelizer iconCompatParcelizer = this.b;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (iconCompatParcelizer == null ? 0 : iconCompatParcelizer.hashCode());
        }

        public final String toString() {
            Method method = this.TuitionPaymentFragmentbindingInflater1;
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            IconCompatParcelizer iconCompatParcelizer = this.b;
            StringBuilder sb = new StringBuilder("read(TuitionPaymentFragmentbindingInflater1=");
            sb.append(method);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(j);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str);
            sb.append(", b=");
            sb.append(iconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$read$b, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$read$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$read;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$read;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static read TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                IconCompatParcelizer iconCompatParcelizerTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                JsonObject asJsonObject;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    Method.Companion companion = Method.INSTANCE;
                    String asString = p0.get(FirebaseAnalytics.Param.METHOD).getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    Method methodTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Method.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asString);
                    long asLong = p0.get("status_code").getAsLong();
                    String asString2 = p0.get(ImagesContract.URL).getAsString();
                    JsonElement jsonElement = p0.get("provider");
                    if (jsonElement == null || (asJsonObject = jsonElement.getAsJsonObject()) == null) {
                        iconCompatParcelizerTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    } else {
                        IconCompatParcelizer.Companion companion2 = IconCompatParcelizer.INSTANCE;
                        iconCompatParcelizerTuitionPaymentFragmentspecialinlinedviewModeldefault2 = IconCompatParcelizer.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject);
                    }
                    Intrinsics.checkNotNullExpressionValue(asString2, "");
                    return new read(methodTuitionPaymentFragmentspecialinlinedviewModeldefault1, asLong, asString2, iconCompatParcelizerTuitionPaymentFragmentspecialinlinedviewModeldefault2);
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

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$connect;", "", "", "p0", "", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class connect {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final String b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public connect(String str, boolean z, String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
            this.b = str3;
        }

        public /* synthetic */ connect(String str, boolean z, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, str2, (i & 8) != 0 ? null : str3);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof connect)) {
                return false;
            }
            connect connectVar = (connect) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, connectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == connectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, connectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, connectVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
            int iHashCode2 = Boolean.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int iHashCode3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
            String str = this.b;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str3 = this.b;
            StringBuilder sb = new StringBuilder("connect(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(z);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str2);
            sb.append(", b=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$connect$b, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$connect$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$connect;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$connect;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static connect TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("name").getAsString();
                    boolean asBoolean = p0.get("crashed").getAsBoolean();
                    String asString2 = p0.get("stack").getAsString();
                    JsonElement jsonElement = p0.get(RemoteConfigConstants.ResponseFieldKey.STATE);
                    String asString3 = jsonElement != null ? jsonElement.getAsString() : null;
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    Intrinsics.checkNotNullExpressionValue(asString2, "");
                    return new connect(asString, asBoolean, asString2, asString3);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Thread", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Thread", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Thread", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "", "p0", "p1", "", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Z", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "asInterface", "g"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final boolean b;

        /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final String g;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, String str2, boolean z, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.g = str;
            this.TuitionPaymentFragmentbindingInflater1 = str2;
            this.b = z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str4;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str5;
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, String str2, boolean z, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TuitionPaymentFragmentspecialinlinedviewModeldefault2) p0;
            return Intrinsics.areEqual(this.g, tuitionPaymentFragmentspecialinlinedviewModeldefault2.g) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) && this.b == tuitionPaymentFragmentspecialinlinedviewModeldefault2.b && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            int iHashCode = this.g.hashCode();
            int iHashCode2 = this.TuitionPaymentFragmentbindingInflater1.hashCode();
            int iHashCode3 = Boolean.hashCode(this.b);
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode5 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            String str = this.g;
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            boolean z = this.b;
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault2(g=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str2);
            sb.append(", b=");
            sb.append(z);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str3);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str4);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str5);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("uuid").getAsString();
                    String asString2 = p0.get("name").getAsString();
                    boolean asBoolean = p0.get("is_system").getAsBoolean();
                    JsonElement jsonElement = p0.get("load_address");
                    String asString3 = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = p0.get("max_address");
                    String asString4 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    JsonElement jsonElement3 = p0.get("arch");
                    String asString5 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    Intrinsics.checkNotNullExpressionValue(asString2, "");
                    return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(asString, asString2, asBoolean, asString3, asString4, asString5);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type BinaryImage", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type BinaryImage", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type BinaryImage", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$getInterfaceDescriptor;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "d", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "a", "asInterface", "g"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getInterfaceDescriptor {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String asInterface;
        public final String b;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final String g;

        public getInterfaceDescriptor(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.b = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str3;
            this.g = str4;
            this.TuitionPaymentFragmentbindingInflater1 = str5;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str6;
            this.asInterface = str7;
        }

        public /* synthetic */ getInterfaceDescriptor(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
        }

        public getInterfaceDescriptor() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof getInterfaceDescriptor)) {
                return false;
            }
            getInterfaceDescriptor getinterfacedescriptor = (getInterfaceDescriptor) p0;
            return Intrinsics.areEqual(this.b, getinterfacedescriptor.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getinterfacedescriptor.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getinterfacedescriptor.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.g, getinterfacedescriptor.g) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, getinterfacedescriptor.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, getinterfacedescriptor.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.asInterface, getinterfacedescriptor.asInterface);
        }

        public final int hashCode() {
            String str = this.b;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.g;
            int iHashCode4 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode5 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode6 = str6 == null ? 0 : str6.hashCode();
            String str7 = this.asInterface;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
        }

        public final String toString() {
            String str = this.b;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str4 = this.g;
            String str5 = this.TuitionPaymentFragmentbindingInflater1;
            String str6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str7 = this.asInterface;
            StringBuilder sb = new StringBuilder("getInterfaceDescriptor(b=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str3);
            sb.append(", g=");
            sb.append(str4);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str5);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str6);
            sb.append(", asInterface=");
            sb.append(str7);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$getInterfaceDescriptor$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$getInterfaceDescriptor$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$getInterfaceDescriptor;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$getInterfaceDescriptor;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static getInterfaceDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("code_type");
                    String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = p0.get("parent_process");
                    String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    JsonElement jsonElement3 = p0.get("incident_identifier");
                    String asString3 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    JsonElement jsonElement4 = p0.get("process");
                    String asString4 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                    JsonElement jsonElement5 = p0.get("exception_type");
                    String asString5 = jsonElement5 != null ? jsonElement5.getAsString() : null;
                    JsonElement jsonElement6 = p0.get("exception_codes");
                    String asString6 = jsonElement6 != null ? jsonElement6.getAsString() : null;
                    JsonElement jsonElement7 = p0.get("path");
                    return new getInterfaceDescriptor(asString, asString2, asString3, asString4, asString5, asString6, jsonElement7 != null ? jsonElement7.getAsString() : null);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Meta", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Meta", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Meta", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$IconCompatParcelizer;", "", "", "p0", "p1", "Lcom/datadog/android/rum/model/ErrorEvent$ProviderType;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$ProviderType;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/rum/model/ErrorEvent$ProviderType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final ProviderType TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;

        public IconCompatParcelizer(String str, String str2, ProviderType providerType) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.TuitionPaymentFragmentbindingInflater1 = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = providerType;
        }

        public /* synthetic */ IconCompatParcelizer(String str, String str2, ProviderType providerType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : providerType);
        }

        public IconCompatParcelizer() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, iconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, iconCompatParcelizer.TuitionPaymentFragmentbindingInflater1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == iconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final int hashCode() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            ProviderType providerType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return (((iHashCode * 31) + iHashCode2) * 31) + (providerType != null ? providerType.hashCode() : 0);
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            ProviderType providerType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("IconCompatParcelizer(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(providerType);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$IconCompatParcelizer$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$IconCompatParcelizer$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$IconCompatParcelizer;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ErrorEvent$IconCompatParcelizer;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static IconCompatParcelizer TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                String asString;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get(DynamicLink.Builder.KEY_DOMAIN);
                    ProviderType providerTypeTuitionPaymentFragmentbindingInflater1 = null;
                    String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = p0.get("name");
                    String asString3 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    JsonElement jsonElement3 = p0.get("type");
                    if (jsonElement3 != null && (asString = jsonElement3.getAsString()) != null) {
                        ProviderType.Companion companion = ProviderType.INSTANCE;
                        providerTypeTuitionPaymentFragmentbindingInflater1 = ProviderType.Companion.TuitionPaymentFragmentbindingInflater1(asString);
                    }
                    return new IconCompatParcelizer(asString2, asString3, providerTypeTuitionPaymentFragmentbindingInflater1);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Provider", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Provider", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Provider", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asBinder", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "asInterface", "a", "g", "d"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ErrorEventSource {
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

        ErrorEventSource(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$ErrorEventSource$b, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource$b;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static ErrorEventSource TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (ErrorEventSource errorEventSource : ErrorEventSource.values()) {
                    if (Intrinsics.areEqual(errorEventSource.jsonValue, p0)) {
                        return errorEventSource;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSessionType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ErrorEventSessionType {
        USER("user"),
        SYNTHETICS("synthetics"),
        CI_TEST("ci_test");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        ErrorEventSessionType(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$ErrorEventSessionType$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSessionType$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSessionType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSessionType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static ErrorEventSessionType TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (ErrorEventSessionType errorEventSessionType : ErrorEventSessionType.values()) {
                    if (Intrinsics.areEqual(errorEventSessionType.jsonValue, p0)) {
                        return errorEventSessionType;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Status;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Status {
        CONNECTED("connected"),
        NOT_CONNECTED("not_connected"),
        MAYBE("maybe");


        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        Status(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$Status$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Status$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$Status;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Status;"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Interface;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asBinder", "g", "d", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "onTransact", "asInterface"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$Interface$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Interface$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$Interface;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Interface;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static Interface TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$EffectiveType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum EffectiveType {
        SLOW_2G("slow_2g"),
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("2g"),
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("3g"),
        TuitionPaymentFragmentbindingInflater1("4g");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        EffectiveType(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$EffectiveType$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$EffectiveType$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$EffectiveType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$EffectiveType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "d", "TuitionPaymentFragmentbindingInflater1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "a", "g", "asInterface"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ErrorSource {
        NETWORK("network"),
        SOURCE("source"),
        CONSOLE("console"),
        LOGGER("logger"),
        AGENT("agent"),
        WEBVIEW("webview"),
        CUSTOM("custom"),
        REPORT("report");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        ErrorSource(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$ErrorSource$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static ErrorSource TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (ErrorSource errorSource : ErrorSource.values()) {
                    if (Intrinsics.areEqual(errorSource.jsonValue, p0)) {
                        return errorSource;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Category;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "asBinder", "d"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Category {
        ANR("ANR"),
        APP_HANG("App Hang"),
        EXCEPTION("Exception"),
        WATCHDOG_TERMINATION("Watchdog Termination"),
        MEMORY_WARNING("Memory Warning");


        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        Category(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$Category$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Category$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$Category;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Category;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static Category TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (Category category : Category.values()) {
                    if (Intrinsics.areEqual(category.jsonValue, p0)) {
                        return category;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Handling;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "b", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Handling {
        HANDLED("handled"),
        UNHANDLED("unhandled");


        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        Handling(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$Handling$b, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Handling$b;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$Handling;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Handling;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static Handling TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (Handling handling : Handling.values()) {
                    if (Intrinsics.areEqual(handling.jsonValue, p0)) {
                        return handling;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$SourceType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "asBinder", "a", "TuitionPaymentFragmentbindingInflater1", "INotificationSideChannel", "b", "g", "asInterface"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum SourceType {
        ANDROID("android"),
        BROWSER("browser"),
        IOS("ios"),
        REACT_NATIVE("react-native"),
        FLUTTER("flutter"),
        ROKU("roku"),
        NDK("ndk"),
        IOS_IL2CPP("ios+il2cpp"),
        NDK_IL2CPP("ndk+il2cpp");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        SourceType(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$SourceType$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$SourceType$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$SourceType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$SourceType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static SourceType TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (SourceType sourceType : SourceType.values()) {
                    if (Intrinsics.areEqual(sourceType.jsonValue, p0)) {
                        return sourceType;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0004\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Plan;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/Number;)V", "jsonValue", "Ljava/lang/Number;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Plan {
        PLAN_1((Number) 1),
        PLAN_2((Number) 2);


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final Number jsonValue;

        Plan(Number number) {
            this.jsonValue = number;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$Plan$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Plan$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$Plan;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Plan;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static Plan TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Method;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "asInterface", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "a", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asBinder", "d", "g", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Method {
        POST(ShareTarget.METHOD_POST),
        GET(ShareTarget.METHOD_GET),
        HEAD("HEAD"),
        PUT("PUT"),
        DELETE("DELETE"),
        PATCH(HttpClientStack.HttpPatch.METHOD_NAME),
        TRACE("TRACE"),
        OPTIONS("OPTIONS"),
        CONNECT("CONNECT");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        Method(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$Method$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Method$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$Method;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Method;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static Method TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (Method method : Method.values()) {
                    if (Intrinsics.areEqual(method.jsonValue, p0)) {
                        return method;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$ProviderType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "asBinder", "g", "d", "a", "b", "asInterface", "notify", "onTransact", "INotificationSideChannel", "cancelAll", "cancel", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ProviderType {
        AD("ad"),
        ADVERTISING("advertising"),
        ANALYTICS("analytics"),
        CDN("cdn"),
        CONTENT(FirebaseAnalytics.Param.CONTENT),
        CUSTOMER_SUCCESS("customer-success"),
        FIRST_PARTY("first party"),
        HOSTING("hosting"),
        MARKETING("marketing"),
        OTHER("other"),
        SOCIAL(NotificationCompat.CATEGORY_SOCIAL),
        TAG_MANAGER("tag-manager"),
        UTILITY("utility"),
        VIDEO("video");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        ProviderType(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ErrorEvent$ProviderType$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$ProviderType$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ErrorEvent$ProviderType;", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$ProviderType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static ProviderType TuitionPaymentFragmentbindingInflater1(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (ProviderType providerType : ProviderType.values()) {
                    if (Intrinsics.areEqual(providerType.jsonValue, p0)) {
                        return providerType;
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
