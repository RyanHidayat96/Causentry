package com.datadog.android.rum.model;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.os.EnvironmentCompat;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.messaging.Constants;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b9\b\u0086\b\u0018\u0000 <2\u00020\u0001:\u001d5396<@=:D?KHJ`FabNPcdQUefgSW\\Bë\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020+2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b1\u00102R\u0013\u00105\u001a\u0004\u0018\u00010#8\u0006¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00103\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00106\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00108R\u0016\u00109\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0016\u0010<\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010?\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010=\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001c\u0010@\u001a\u0004\u0018\u00010!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010B\u001a\u0004\b6\u0010CR\u0014\u0010:\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010D\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010K\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010H\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010MR\u0016\u0010F\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010N\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u00108R\u0014\u0010P\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010Q\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010U\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0006\n\u0004\bW\u00108R\u001c\u0010S\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\b<\u0010ZR\u0016\u0010\\\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b[\u00108R\u0014\u0010_\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010^"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent;", "", "", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "p1", "", "p2", "p3", "p4", "p5", "Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannelDefault;", "p6", "Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSource;", "p7", "Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannelStub;", "p8", "Lcom/datadog/android/rum/model/LongTaskEvent$RemoteActionCompatParcelizer;", "p9", "Lcom/datadog/android/rum/model/LongTaskEvent$d;", "p10", "Lcom/datadog/android/rum/model/LongTaskEvent$onTransact;", "p11", "Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannelStubProxy;", "p12", "Lcom/datadog/android/rum/model/LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "p13", "Lcom/datadog/android/rum/model/LongTaskEvent$getInterfaceDescriptor;", "p14", "Lcom/datadog/android/rum/model/LongTaskEvent$cancelAll;", "p15", "Lcom/datadog/android/rum/model/LongTaskEvent$cancel;", "p16", "Lcom/datadog/android/rum/model/LongTaskEvent$asBinder;", "p17", "Lcom/datadog/android/rum/model/LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "p18", "Lcom/datadog/android/rum/model/LongTaskEvent$asInterface;", "p19", "Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannel;", "p20", "<init>", "(JLcom/datadog/android/rum/model/LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannelDefault;Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSource;Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannelStub;Lcom/datadog/android/rum/model/LongTaskEvent$RemoteActionCompatParcelizer;Lcom/datadog/android/rum/model/LongTaskEvent$d;Lcom/datadog/android/rum/model/LongTaskEvent$onTransact;Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannelStubProxy;Lcom/datadog/android/rum/model/LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;Lcom/datadog/android/rum/model/LongTaskEvent$getInterfaceDescriptor;Lcom/datadog/android/rum/model/LongTaskEvent$cancelAll;Lcom/datadog/android/rum/model/LongTaskEvent$cancel;Lcom/datadog/android/rum/model/LongTaskEvent$asBinder;Lcom/datadog/android/rum/model/LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;Lcom/datadog/android/rum/model/LongTaskEvent$asInterface;Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannel;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/rum/model/LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/rum/model/LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "Ljava/lang/String;", "b", "asInterface", "Lcom/datadog/android/rum/model/LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "TuitionPaymentFragmentbindingInflater1", "d", "Lcom/datadog/android/rum/model/LongTaskEvent$d;", "asBinder", "g", "Lcom/datadog/android/rum/model/LongTaskEvent$asInterface;", "Lcom/datadog/android/rum/model/LongTaskEvent$asBinder;", "()Lcom/datadog/android/rum/model/LongTaskEvent$asBinder;", "a", "J", "onTransact", "Lcom/datadog/android/rum/model/LongTaskEvent$cancel;", "notify", "Lcom/datadog/android/rum/model/LongTaskEvent$cancelAll;", "cancelAll", "cancel", "Lcom/datadog/android/rum/model/LongTaskEvent$onTransact;", "Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannel;", "INotificationSideChannel", "Lcom/datadog/android/rum/model/LongTaskEvent$getInterfaceDescriptor;", "INotificationSideChannelDefault", "INotificationSideChannelStub", "Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannelDefault;", "INotificationSideChannelStubProxy", "Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSource;", "getInterfaceDescriptor", "Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannelStubProxy;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Lcom/datadog/android/rum/model/LongTaskEvent$RemoteActionCompatParcelizer;", "()Lcom/datadog/android/rum/model/LongTaskEvent$RemoteActionCompatParcelizer;", "write", "connect", "read", "Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannelStub;", "MediaBrowserCompat", "DeviceType", "EffectiveType", "Interface", "LongTaskEventSessionType", "LongTaskEventSource", "Plan", "SessionPrecondition", "Status"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class LongTaskEvent {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public final getInterfaceDescriptor onTransact;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    public final String INotificationSideChannel;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    public final INotificationSideChannelDefault INotificationSideChannelDefault;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    public final LongTaskEventSource INotificationSideChannelStub;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public final RemoteActionCompatParcelizer INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public final String getInterfaceDescriptor;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long asInterface;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final asBinder g;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1;
    public final String b;
    public final onTransact cancel;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public final INotificationSideChannel notify;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final d asBinder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final asInterface d;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    public final INotificationSideChannelStubProxy RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public final cancelAll cancelAll;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final cancel a;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public final INotificationSideChannelStub MediaBrowserCompat;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public final String connect;

    public LongTaskEvent(long j, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, String str, String str2, String str3, String str4, INotificationSideChannelDefault iNotificationSideChannelDefault, LongTaskEventSource longTaskEventSource, INotificationSideChannelStub iNotificationSideChannelStub, RemoteActionCompatParcelizer remoteActionCompatParcelizer, d dVar, onTransact ontransact, INotificationSideChannelStubProxy iNotificationSideChannelStubProxy, TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, getInterfaceDescriptor getinterfacedescriptor, cancelAll cancelall, cancel cancelVar, asBinder asbinder, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, asInterface asinterface, INotificationSideChannel iNotificationSideChannel) {
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
        Intrinsics.checkNotNullParameter(iNotificationSideChannelDefault, "");
        Intrinsics.checkNotNullParameter(iNotificationSideChannelStub, "");
        Intrinsics.checkNotNullParameter(cancelVar, "");
        Intrinsics.checkNotNullParameter(iNotificationSideChannel, "");
        this.asInterface = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.INotificationSideChannel = str;
        this.connect = str2;
        this.b = str3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str4;
        this.INotificationSideChannelDefault = iNotificationSideChannelDefault;
        this.INotificationSideChannelStub = longTaskEventSource;
        this.MediaBrowserCompat = iNotificationSideChannelStub;
        this.INotificationSideChannelStubProxy = remoteActionCompatParcelizer;
        this.asBinder = dVar;
        this.cancel = ontransact;
        this.RemoteActionCompatParcelizer = iNotificationSideChannelStubProxy;
        this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.onTransact = getinterfacedescriptor;
        this.cancelAll = cancelall;
        this.a = cancelVar;
        this.g = asbinder;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.d = asinterface;
        this.notify = iNotificationSideChannel;
        this.getInterfaceDescriptor = "long_task";
    }

    public /* synthetic */ LongTaskEvent(long j, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, String str, String str2, String str3, String str4, INotificationSideChannelDefault iNotificationSideChannelDefault, LongTaskEventSource longTaskEventSource, INotificationSideChannelStub iNotificationSideChannelStub, RemoteActionCompatParcelizer remoteActionCompatParcelizer, d dVar, onTransact ontransact, INotificationSideChannelStubProxy iNotificationSideChannelStubProxy, TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, getInterfaceDescriptor getinterfacedescriptor, cancelAll cancelall, cancel cancelVar, asBinder asbinder, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, asInterface asinterface, INotificationSideChannel iNotificationSideChannel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, tuitionPaymentFragmentspecialinlinedviewModeldefault1, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, iNotificationSideChannelDefault, (i & 128) != 0 ? null : longTaskEventSource, iNotificationSideChannelStub, (i & 512) != 0 ? null : remoteActionCompatParcelizer, (i & 1024) != 0 ? null : dVar, (i & 2048) != 0 ? null : ontransact, (i & 4096) != 0 ? null : iNotificationSideChannelStubProxy, (i & 8192) != 0 ? null : tuitionPaymentFragmentspecialinlinedviewModeldefault2, (i & 16384) != 0 ? null : getinterfacedescriptor, (32768 & i) != 0 ? null : cancelall, cancelVar, (131072 & i) != 0 ? null : asbinder, (262144 & i) != 0 ? null : tuitionPaymentFragmentspecialinlinedviewModeldefault3, (i & 524288) != 0 ? null : asinterface, iNotificationSideChannel);
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
    public final RemoteActionCompatParcelizer getINotificationSideChannelStubProxy() {
        return this.INotificationSideChannelStubProxy;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final asBinder getG() {
        return this.g;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$getInterfaceDescriptor;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getInterfaceDescriptor {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public final String b;

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$getInterfaceDescriptor$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$getInterfaceDescriptor$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$getInterfaceDescriptor;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/LongTaskEvent$getInterfaceDescriptor;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {33, -59, 107, -108, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -73, 3, 17, 12, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 70};
            private static final int $$e = 240;
            private static final byte[] $$a = {87, 51, -85, 78, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 163;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int TuitionPaymentFragmentbindingInflater1 = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -5100250753010657879L;

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(byte r7, short r8, int r9, java.lang.Object[] r10) {
                /*
                    int r8 = r8 * 2
                    int r8 = 84 - r8
                    byte[] r0 = com.datadog.android.rum.model.LongTaskEvent.getInterfaceDescriptor.Companion.$$a
                    int r7 = r7 * 52
                    int r7 = 108 - r7
                    int r9 = r9 * 15
                    int r9 = 53 - r9
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r8 = r7
                    r3 = r9
                    r4 = r2
                    goto L2c
                L17:
                    r3 = r2
                L18:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r9) goto L27
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L27:
                    r3 = r0[r7]
                    r6 = r8
                    r8 = r7
                    r7 = r6
                L2c:
                    int r3 = -r3
                    int r7 = r7 + r3
                    int r8 = r8 + 1
                    int r7 = r7 + (-11)
                    r3 = r4
                    r6 = r8
                    r8 = r7
                    r7 = r6
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.LongTaskEvent.getInterfaceDescriptor.Companion.a(byte, short, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 15
                    int r6 = 99 - r6
                    byte[] r0 = com.datadog.android.rum.model.LongTaskEvent.getInterfaceDescriptor.Companion.$$d
                    int r7 = r7 + 4
                    int r8 = r8 * 4
                    int r1 = r8 + 49
                    byte[] r1 = new byte[r1]
                    int r8 = r8 + 48
                    r2 = 0
                    if (r0 != 0) goto L17
                    r6 = r7
                    r3 = r8
                    r4 = r2
                    goto L2e
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r8) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L27:
                    int r7 = r7 + 1
                    r3 = r0[r7]
                    r5 = r7
                    r7 = r6
                    r6 = r5
                L2e:
                    int r3 = -r3
                    int r7 = r7 + r3
                    int r7 = r7 + 3
                    r3 = r4
                    r5 = r7
                    r7 = r6
                    r6 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.LongTaskEvent.getInterfaceDescriptor.Companion.c(int, byte, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:38:0x01a1  */
            /* JADX WARN: Code duplicated, block: B:39:0x01a2  */
            private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
                char c;
                Throwable cause;
                int i2 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                while (true) {
                    c = '0';
                    if (getrealtimecapturelatency.b >= cArr.length) {
                        break;
                    }
                    int i3 = $11 + 5;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 19473), 2623 - ExpandableListView.getPackedPositionChild(0L), MotionEvent.axisFromString("") + 14, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - TextUtils.getOffsetBefore("", 0)), 481 - (ViewConfiguration.getDoubleTapTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i6 = $10 + 39;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                        Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.blue(0) + 39422), (ViewConfiguration.getTouchSlop() >> 8) + 481, 38 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        int i7 = 3 / 0;
                    } else {
                        cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                        Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 39422), 481 - Color.alpha(0), 36 - TextUtils.lastIndexOf("", c, 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                    c = '0';
                }
                objArr[0] = new String(cArr2);
            }

            private Companion() {
            }

            @JvmStatic
            public final getInterfaceDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws Throwable {
                NullPointerException nullPointerException;
                NumberFormatException numberFormatException;
                String str;
                IllegalStateException illegalStateException;
                String str2;
                String asString;
                Object[] objArr;
                Object[] objArr2;
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                String str3 = "Unable to parse json into type Os";
                try {
                    try {
                        if (i2 % 2 == 0) {
                            Intrinsics.checkNotNullParameter(p0, "");
                            try {
                                p0.get("name").getAsString();
                                p0.get("version").getAsString();
                                p0.get("build");
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            } catch (IllegalStateException e2) {
                                str2 = "Unable to parse json into type Os";
                                illegalStateException = e2;
                                throw new JsonParseException(str2, illegalStateException);
                            } catch (NumberFormatException e3) {
                                str = "Unable to parse json into type Os";
                                numberFormatException = e3;
                                throw new JsonParseException(str, numberFormatException);
                            }
                        }
                        Intrinsics.checkNotNullParameter(p0, "");
                        try {
                            try {
                                String asString2 = p0.get("name").getAsString();
                                String asString3 = p0.get("version").getAsString();
                                JsonElement jsonElement = p0.get("build");
                                if (jsonElement != null) {
                                    try {
                                        asString = jsonElement.getAsString();
                                    } catch (IllegalStateException e4) {
                                        illegalStateException = e4;
                                        str2 = "Unable to parse json into type Os";
                                        throw new JsonParseException(str2, illegalStateException);
                                    } catch (NullPointerException e5) {
                                        nullPointerException = e5;
                                        throw new JsonParseException("Unable to parse json into type Os", nullPointerException);
                                    } catch (NumberFormatException e6) {
                                        numberFormatException = e6;
                                        str = "Unable to parse json into type Os";
                                        throw new JsonParseException(str, numberFormatException);
                                    }
                                } else {
                                    asString = null;
                                }
                                String asString4 = p0.get("version_major").getAsString();
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char c = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43042);
                                    int trimmedLength = 3111 - TextUtils.getTrimmedLength("");
                                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 22;
                                    byte[] bArr = $$a;
                                    byte b = bArr[40];
                                    byte b2 = bArr[7];
                                    Object[] objArr3 = new Object[1];
                                    a(b, b2, b2, objArr3);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, trimmedLength, packedPositionType, -1272852037, false, (String) objArr3[0], null);
                                }
                                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                                try {
                                    Object[] objArr4 = new Object[1];
                                    b(new char[]{15571, 53951, 57360, 63465, 34129, 39732, 43652, 47145, 20421, 23994, 29506, 672, 4207, 10182, 13740, 51994, 56047, 59490, 65064, 36228, 41837, 45766}, TextUtils.lastIndexOf("", '0') + 61028, objArr4);
                                    Class<?> cls = Class.forName((String) objArr4[0]);
                                    Object[] objArr5 = new Object[1];
                                    b(new char[]{15575, 5959, 27617, 48649, 37541, 58666, 14656, 3535, 24607, 46258, 36644, 58197, 14327, 2586, 24201}, (ViewConfiguration.getEdgeSlop() >> 16) + 11161, objArr5);
                                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cResolveSizeAndState = (char) (43042 - View.resolveSizeAndState(0, 0, 0));
                                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3111;
                                        int iBlue = 22 - Color.blue(0);
                                        byte[] bArr2 = $$a;
                                        byte b3 = bArr2[5];
                                        byte b4 = bArr2[7];
                                        Object[] objArr6 = new Object[1];
                                        a(b3, b4, b4, objArr6);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, minimumFlingVelocity, iBlue, -1269618118, false, (String) objArr6[0], null);
                                    }
                                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 43043);
                                            int i3 = 3111 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                            int iRgb = Color.rgb(0, 0, 0) + 16777238;
                                            byte[] bArr3 = $$a;
                                            byte b5 = bArr3[7];
                                            Object[] objArr7 = new Object[1];
                                            a(b5, b5, bArr3[5], objArr7);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, i3, iRgb, 154975793, false, (String) objArr7[0], null);
                                        }
                                        Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                                        int i4 = ((int[]) objArr8[2])[0];
                                        int i5 = ((int[]) objArr8[1])[0];
                                        String[] strArr = (String[]) objArr8[3];
                                        int i6 = ~((~System.identityHashCode(this)) | 615523653);
                                        int i7 = (((603988992 | i6) * (-374)) - 55348140) + ((i6 | 11534661) * 374) + 1408555694;
                                        int i8 = (i7 << 13) ^ i7;
                                        int i9 = i8 ^ (i8 >>> 17);
                                        ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
                                        objArr = new Object[]{new int[1], new int[]{i5}, new int[]{i4}, strArr};
                                    } else {
                                        try {
                                            Object[] objArr9 = new Object[1];
                                            b(new char[]{15576, 60602, 39958, 19944, 32056, 11987, 56997, 36355, 49053, 28461, 6395, 51272, 63533, 43411, 22889, 2808}, 53353 - Color.blue(0), objArr9);
                                            Class<?> cls2 = Class.forName((String) objArr9[0]);
                                            Object[] objArr10 = new Object[1];
                                            b(new char[]{15579, 64795, 48973, 31163, 15346, 62938, 46600, 28752, 12946, 60646, 44739, 28437, 10605, 60340, 42464, 26580}, 49613 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr10);
                                            try {
                                                Object[] objArr11 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue()), 0, 1408555694};
                                                byte[] bArr4 = $$d;
                                                byte b6 = bArr4[35];
                                                byte b7 = (byte) (b6 - 1);
                                                byte b8 = (byte) (-b6);
                                                Object[] objArr12 = new Object[1];
                                                c(b7, b8, (byte) (b8 + 1), objArr12);
                                                Class<?> cls3 = Class.forName((String) objArr12[0]);
                                                byte b9 = bArr4[35];
                                                byte b10 = b9;
                                                Object[] objArr13 = new Object[1];
                                                c(b10, (byte) (b10 | 46), b9, objArr13);
                                                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                    char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 43042);
                                                    int iRgb2 = Color.rgb(0, 0, 0) + 16780327;
                                                    int modifierMetaStateMask = 21 - ((byte) KeyEvent.getModifierMetaStateMask());
                                                    byte[] bArr5 = $$a;
                                                    byte b11 = bArr5[7];
                                                    Object[] objArr14 = new Object[1];
                                                    a(b11, b11, bArr5[5], objArr14);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(threadPriority, iRgb2, modifierMetaStateMask, 154975793, false, (String) objArr14[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                                                try {
                                                    Object[] objArr15 = new Object[1];
                                                    b(new char[]{15571, 53951, 57360, 63465, 34129, 39732, 43652, 47145, 20421, 23994, 29506, 672, 4207, 10182, 13740, 51994, 56047, 59490, 65064, 36228, 41837, 45766}, 61027 - Gravity.getAbsoluteGravity(0, 0), objArr15);
                                                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                                                    Object[] objArr16 = new Object[1];
                                                    b(new char[]{15575, 5959, 27617, 48649, 37541, 58666, 14656, 3535, 24607, 46258, 36644, 58197, 14327, 2586, 24201}, (ViewConfiguration.getLongPressTimeout() >> 16) + 11161, objArr16);
                                                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                                    Long lValueOf = Long.valueOf(jLongValue2);
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 43043);
                                                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 3112;
                                                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 22;
                                                        byte[] bArr6 = $$a;
                                                        byte b12 = bArr6[5];
                                                        byte b13 = bArr6[7];
                                                        Object[] objArr17 = new Object[1];
                                                        a(b12, b13, b13, objArr17);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, packedPositionChild, iCombineMeasuredStates, -1269618118, false, (String) objArr17[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                        char deadChar = (char) (43042 - KeyEvent.getDeadChar(0, 0));
                                                        int pressedStateDuration = 3111 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                                        int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22;
                                                        byte[] bArr7 = $$a;
                                                        byte b14 = bArr7[40];
                                                        byte b15 = bArr7[7];
                                                        Object[] objArr18 = new Object[1];
                                                        a(b14, b15, b15, objArr18);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar, pressedStateDuration, minimumFlingVelocity2, -1272852037, false, (String) objArr18[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
                                        } catch (IllegalStateException e7) {
                                            e = e7;
                                            illegalStateException = e;
                                            str2 = str3;
                                            throw new JsonParseException(str2, illegalStateException);
                                        } catch (NumberFormatException e8) {
                                            e = e8;
                                            numberFormatException = e;
                                            str = str3;
                                            throw new JsonParseException(str, numberFormatException);
                                        }
                                    }
                                    int i10 = ((int[]) objArr[1])[0];
                                    int i11 = ((int[]) objArr[2])[0];
                                    if (i11 == i10) {
                                        int i12 = ((int[]) objArr[0])[0];
                                        int i13 = ((int[]) objArr[2])[0];
                                        int i14 = ((int[]) objArr[1])[0];
                                        String[] strArr2 = (String[]) objArr[3];
                                        int iIdentityHashCode = System.identityHashCode(this);
                                        int i15 = ~iIdentityHashCode;
                                        int i16 = (~((-783854794) | i15)) | 648546377;
                                        int i17 = ~(iIdentityHashCode | 1056485081);
                                        int i18 = i12 + ((i16 | i17) * (-252)) + 1929961214 + ((i17 | (~(i15 | (-135308417)))) * 252);
                                        int i19 = (i18 << 13) ^ i18;
                                        int i20 = i19 ^ (i19 >>> 17);
                                        ((int[]) objArr2[0])[0] = i20 ^ (i20 << 5);
                                        objArr2 = new Object[]{new int[1], new int[]{i14}, new int[]{i13}, strArr2};
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        String[] strArr3 = (String[]) objArr[3];
                                        if (strArr3 != null) {
                                            int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
                                            TuitionPaymentFragmentbindingInflater1 = i21 % 128;
                                            int i22 = i21 % 2;
                                            for (String str4 : strArr3) {
                                                int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
                                                TuitionPaymentFragmentbindingInflater1 = i23 % 128;
                                                int i24 = i23 % 2;
                                                arrayList.add(str4);
                                            }
                                        }
                                        Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
                                        int i25 = ((int[]) objArr[0])[0];
                                        int i26 = ((int[]) objArr[2])[0];
                                        int i27 = ((int[]) objArr[1])[0];
                                        String[] strArr4 = (String[]) objArr[3];
                                        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                                        int i28 = ~startElapsedRealtime;
                                        int i29 = (~((-830487006) | i28)) | 805321029;
                                        int i30 = ~(startElapsedRealtime | 899710429);
                                        int i31 = i25 + (-2045705104) + ((i29 | i30) * (-502)) + ((i30 | (~(i28 | (-25165977)))) * TypedValues.PositionType.TYPE_DRAWPATH);
                                        int i32 = (i31 << 13) ^ i31;
                                        int i33 = i32 ^ (i32 >>> 17);
                                        ((int[]) objArr2[0])[0] = i33 ^ (i33 << 5);
                                        objArr2 = new Object[]{new int[1], new int[]{i27}, new int[]{i26}, strArr4};
                                        int i34 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
                                        TuitionPaymentFragmentbindingInflater1 = i34 % 128;
                                        int i35 = i34 % 2;
                                    }
                                    Intrinsics.checkNotNullExpressionValue(asString2, "");
                                    int i36 = ((int[]) objArr2[0])[0];
                                    int i37 = ((((i36 * i36) - (~(-(1460377934 * i36)))) - 1) - (~(-(i36 * (-725731744))))) - (-250459792);
                                    int i38 = (((i37 >> 20) - 8191) / 4096) + 1;
                                    int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
                                    int i40 = i37 >> 22;
                                    int i41 = (-(i39 ^ ((((i40 ^ (-2047)) + ((i40 & (-2047)) << 1)) / 1024) + 1))) + 9;
                                    int i42 = ((i41 >> 16) - 131071) / 65536;
                                    int i43 = (i42 & 1) + (i42 | 1);
                                    Intrinsics.checkNotNullExpressionValue(asString3, "2\\13\\version".substring(24390 / ((i41 & (-((i43 & 1) + (i43 | 1)))) * 542)));
                                    Intrinsics.checkNotNullExpressionValue(asString4, "");
                                    return new getInterfaceDescriptor(asString2, asString3, asString, asString4);
                                } catch (IllegalStateException e9) {
                                    e = e9;
                                    str3 = "Unable to parse json into type Os";
                                } catch (NumberFormatException e10) {
                                    e = e10;
                                    str3 = "Unable to parse json into type Os";
                                }
                            } catch (NullPointerException e11) {
                                e = e11;
                                nullPointerException = e;
                                throw new JsonParseException("Unable to parse json into type Os", nullPointerException);
                            }
                        } catch (IllegalStateException e12) {
                            e = e12;
                            str3 = "Unable to parse json into type Os";
                        } catch (NumberFormatException e13) {
                            e = e13;
                            str3 = "Unable to parse json into type Os";
                        }
                    } catch (NullPointerException e14) {
                        e = e14;
                    }
                } catch (IllegalStateException e15) {
                    e = e15;
                } catch (NumberFormatException e16) {
                    e = e16;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public getInterfaceDescriptor(String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
            this.b = str3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str4;
        }

        public /* synthetic */ getInterfaceDescriptor(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, str4);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof getInterfaceDescriptor)) {
                return false;
            }
            getInterfaceDescriptor getinterfacedescriptor = (getInterfaceDescriptor) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, getinterfacedescriptor.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getinterfacedescriptor.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, getinterfacedescriptor.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, getinterfacedescriptor.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentbindingInflater1.hashCode();
            int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
            String str = this.b;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentbindingInflater1;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str3 = this.b;
            String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("getInterfaceDescriptor(TuitionPaymentFragmentbindingInflater1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str2);
            sb.append(", b=");
            sb.append(str3);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$onTransact;", "", "Lcom/datadog/android/rum/model/LongTaskEvent$connect;", "p0", "<init>", "(Lcom/datadog/android/rum/model/LongTaskEvent$connect;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/rum/model/LongTaskEvent$connect;", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class onTransact {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final connect TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$onTransact$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$onTransact$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$onTransact;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/LongTaskEvent$onTransact;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            private static char[] b;
            private static final byte[] $$c = {91, -9, 99, 11};
            private static final int $$d = 139;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {117, -15, -81, 1};
            private static final int $$b = 54;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

            private static void c(short s, int i, int i2, Object[] objArr) {
                int i3 = (s * 2) + 4;
                byte[] bArr = $$a;
                int i4 = 103 - i2;
                int i5 = i * 2;
                byte[] bArr2 = new byte[1 - i5];
                int i6 = 0 - i5;
                int i7 = -1;
                if (bArr == null) {
                    i3++;
                    i4 += i3;
                }
                while (true) {
                    i7++;
                    bArr2[i7] = (byte) i4;
                    if (i7 == i6) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    } else {
                        byte b2 = bArr[i3];
                        i3++;
                        i4 += b2;
                    }
                }
            }

            private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
                int i3 = 2;
                int i4 = 2 % 2;
                lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                long[] jArr = new long[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    int i5 = $10 + 103;
                    $11 = i5 % 128;
                    if (i5 % i3 == 0) {
                        int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        try {
                            Object[] objArr2 = {Integer.valueOf(b[i + i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), ((byte) KeyEvent.getModifierMetaStateMask()) + 2188, 40 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 841711447, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = (byte) (b4 + 2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - (ViewConfiguration.getEdgeSlop() >> 16)), 3010 - TextUtils.lastIndexOf("", '0', 0, 0), 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 321985076, false, $$e(b4, b5, (byte) (b5 - 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                            Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = (byte) (b6 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - KeyEvent.keyCodeFromString("")), View.getDefaultSize(0, 0) + 3376, 16 - TextUtils.indexOf((CharSequence) "", '0'), -968507904, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        Object[] objArr5 = {Integer.valueOf(b[i + i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Process.myPid() >> 22), (ViewConfiguration.getPressedStateDuration() >> 16) + 2187, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 40, 841711447, false, $$e(b8, b9, b9), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b10 = (byte) 0;
                            byte b11 = (byte) (b10 + 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33018 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3012, 26 - Color.alpha(0), 321985076, false, $$e(b10, b11, (byte) (b11 - 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                        Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            byte b12 = (byte) 0;
                            byte b13 = (byte) (b12 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (36505 - (Process.myPid() >> 22)), 3376 - (ViewConfiguration.getEdgeSlop() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 17, -968507904, false, $$e(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                    }
                    i3 = 2;
                }
                char[] cArr = new char[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    int i8 = $10 + 23;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        byte b14 = (byte) 0;
                        byte b15 = (byte) (b14 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (36505 - View.resolveSize(0, 0)), TextUtils.indexOf("", "") + 3376, Color.alpha(0) + 17, -968507904, false, $$e(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                }
                objArr[0] = new String(cArr);
                int i10 = $11 + 85;
                $10 = i10 % 128;
                int i11 = i10 % 2;
            }

            private Companion() {
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0037 A[Catch: NullPointerException -> 0x0054, NumberFormatException -> 0x005d, IllegalStateException -> 0x0066, PHI: r4
  0x0037: PHI (r4v16 com.google.gson.JsonObject) = (r4v15 com.google.gson.JsonObject), (r4v18 com.google.gson.JsonObject) binds: [B:12:0x0035, B:9:0x002e] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {IllegalStateException -> 0x0066, NullPointerException -> 0x0054, NumberFormatException -> 0x005d, blocks: (B:3:0x0013, B:7:0x0026, B:13:0x0037, B:15:0x003f, B:11:0x0031), top: B:29:0x0013 }] */
            /* JADX WARN: Code duplicated, block: B:14:0x003e  */
            @JvmStatic
            public static onTransact TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                connect connectVarTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                JsonObject asJsonObject;
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("viewport");
                    if (jsonElement != null) {
                        int i4 = TuitionPaymentFragmentbindingInflater1 + 99;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                        if (i4 % 2 == 0) {
                            asJsonObject = jsonElement.getAsJsonObject();
                            int i5 = 48 / 0;
                            if (asJsonObject != null) {
                                connect.Companion companion = connect.INSTANCE;
                                connectVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = connect.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject);
                            } else {
                                connectVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                            }
                        } else {
                            asJsonObject = jsonElement.getAsJsonObject();
                            if (asJsonObject != null) {
                                connect.Companion companion2 = connect.INSTANCE;
                                connectVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = connect.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject);
                            } else {
                                connectVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                            }
                        }
                    } else {
                        connectVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    }
                    onTransact ontransact = new onTransact(connectVarTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i6 = TuitionPaymentFragmentbindingInflater1 + 81;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 97 / 0;
                    }
                    return ontransact;
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

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] b(android.content.Context r64, int r65, int r66, int r67) {
                /*
                    Method dump skipped, instruction units count: 15130
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.LongTaskEvent.onTransact.Companion.b(android.content.Context, int, int, int):java.lang.Object[]");
            }

            static {
                char[] cArr = new char[2154];
                ByteBuffer.wrap("±³Tê{Ý\u001eÜ%ûÈ¡ï\u009fò\u008e\u0099h¼XCAf)\r,\u0010)7\u0001ÝöàØ\u0087Üª½±¹T\u0087{¹\u001ec%rÈMï=ò-±³Tê{Ý\u001eÜ%ûÈ¡ï\u009fò\u008e\u0099h¼XCAf)\r,\u0010)7\u0010ÝûàÌ\u0087Ëª\u0087±®T\u0084{\u0094\u001es%vÈH±³Tê{Ý\u001eÜ%ûÈ¡ï\u009fò\u008e\u0099h¼XCAf)\r,\u0010)7\u0013ÝëàÒ\u0087Í\u0093\u0005vKYw<o\u0007Mê\u001dÍ)Ð0»Ï\u009eäaûDÃ/\u00952¯\u0015ºÿ@Âl¥q\u0088\u001d\u0093\u0014v\u001dY2<Ç\u0007ÀêîÍ\u008dÐ\u008c»µ±³Të{Ì\u001eÉ%ûÈ¢ï\u0097òÌ\u0099|¼LCGf*®\u0012KJdm\u0001h:Z×\u0014ð8í.\u0086\u0083£ï\\ûy\u0094\u0012\u0095±³Tý{Ü\u001eÉ%µÈ´ï\u0094òÍ\u0099^¼xCef5\r2\u0010\u00137$ÝóàÈ\u0087Ï\u0006\tãPÌc©d\u0092\u000f\u007fSXdE;.Æ\u000bñôûÑ\u008eº\u0098§£Éj,e\u0003\u0012fL]?°-\u0097\u0000\u008aHáúÄß;È\u001e¬u¯h\u009bO\u0080¥I\u0098VÿOÒ(É\u0011,\u0014\u0003\ffç]·VÔ³Û\u009c¬ùòÂ\u0081/\u0093\b¾\u0015ö~D[a¤v\u0081\u0012ê\u0011÷%Ð>:÷\u0007è`ñM\u0096V¯³ª\u009c²ùYÂ\n±³Tý{Á\u001eÙ% È£ï\u009dòÍ\u0099`¼WCJfu\r(\u0010\u001f7\u0002ÝüàÞ\u0087\u0080ª«±¥H7\u00ad.\u0082\u0016ç\rÜr1w±³Tý{Á\u001eÙ% È£ï\u009dòÍ\u0099n¼WCFfu\r*\u0010\u00137\rÝçàê\u0087ãªõ±¤T\u0091{\u008b\u001ee%/ÈOï1ò&\u0099\u000e¼\u0016Bùiì±³Tý{Á\u001eÙ% È£ï\u009dòÍ\u0099n¼WCFfu\r*\u0010\u00137\rÝçàê\u0087ãªõ±ºT\u0086{\u0089\u001e`±³Tý{Á\u001eÙ% È£ï\u009dòÍ\u0099`¼WCJfu\r(\u0010\u001f7\u0002ÝüàÙ\u0087Ãª\u00ad±\u009cT¹{\u0096\u001eb%mÈ\\ïpò;\u0099\u0015±³Tê{Ý\u001eÜ%ûÈ¨ï\u0095ò\u008f\u0099y¼YC]f?\r7\u0010\u0002±îTá{\u0096\u001eÈ%¡È¯ï\u009cò\u0086\u0099\"¼VCGf)\r0Ñ~4g\u001bU~UE=¨d\u008f\u0012\u0092\u000bùô±³Tþ{Ê\u001eÅ%·Èéï\u0096ò\u008b\u0099`¼[C[f#\r7\u0010\u00027\u0005ÝÿàÏ@\u001d¥\u0004\u008a:ï0ÔH9O±îTá{\u0096\u001eÚ%¦È©ï\u0094ò\u0097\u0099o¼JC\u0006f7\r%\u0010\u00187\u0015ÝôàÝ\u0087Íª¬±¿T\u0086{\u0083\u001eb\u0001ñäáËÜ®Ù±ìTë{Ê\u001eÙ%½Èµï\u0084òÌ\u0099\u007f¼GC[ft\r&\u0010\u00127NÝöàÙ\u0087Ìª\u00ad±\u00adTÚ{\u0081\u001e`%wÈ\u0002ï8ò)\u0099\u0011¼\u0001BÉiç\fÂ\u0013©6\u0091Ý\u008aà\u008f\u0087zªb±UTP{)\u001e\f±ìTë{Ê\u001eÙ%½Èµï\u0084òÌ\u0099\u007f¼GC[ft\r&\u0010\u00127NÝöàÙ\u0087Ìª\u00ad±\u00adTÚ{\u0081\u001e`%wÈ\u0002ï8ò)\u0099\u0011¼\u0001BÉiç\fÂ\u0013©6\u0091Ý\u008eà\u008f\u0087zªb±_TPe{\u0080|¯]ÊNñ*\u001c\";\u0013&[MèhÐ\u0097Ì²ãÙ±Ä\u0085ãÙ\ta4NS[~:e:\u0080M¯\u0003Êèñ»\u001cØ;¸&¶±ìTë{Ê\u001eÙ%½Èµï\u0084òÌ\u0099\u007f¼GC[ft\r&\u0010\u00127NÝöàÙ\u0087Ìª\u00ad±\u00adTÚ{\u0094\u001e\u007f%,È@ï?ò+\"»Ç¼è\u009d\u008d\u008e¶ê[â|Óa\u009b\n(/\u0010Ð\fõ#\u009eq\u0083E¤\u0019N¡s\u008e\u0014\u009b9ú\"úÇ\u008dèÃ\u008d(¶{[\u0016|ja|Vs³t\u009cUùFÂ\"/*\b\u001b\u0015S~à[Ø¤Ä\u0081ëê¹÷\u008dÐÑ:i\u0007F`SM2V2³E\u009c\u000bùàÂ³/Þ\b¯\u0015´±êTì{×\u001eÒ%§È ¸o]\"r\u0016\u0017\u0019,kÁ5æAûQ\u0090´µ\u0097J\u0098oã\u0004ë±êTì{×\u001eÒ%³È³ï\u0095ò\u0091\u0099x²lW\"x\u001e\u001d\u0006&\u007fË|ìBñ\u0012\u009aµ¿\u0093@\u0096eè\u000eþ\u0013Þ4ÐÞ?ã\b\u0084^©p²|WEx]\u001d &ªË\u0080ì¬ñä\u009aÜ¿ÈA=j:\u000f\u0000\u0010\\5bÞBãG\u0084½©¼²\u009dWÓxù\u001dÀ&Å\u00854`\u007fOZ*C\u00117ü.Û\u0005ÆJ\u00adç\u0088ÐwÍRë9÷$Þ\u0003\u008fébÔ\u0014³H\u009e*\u0085)`\u001aO\u000e*¹\u0011õüÙÛ°Æ¢\u00ad\u009c\u0088\u0091vh])8B'2\u0002'é\u001bÔ\u0002³ä\u009eò\u0085\u0099`ÖO¤µäP¯\u007f\u008a\u001a\u0093!çÌþëÕö\u009a\u009d7¸\u0000G\u001db;\t'\u0014\u000e3_Ù²äÄ\u0083\u0091®øµþPÌ\u007fÜ\u001a7!:Ì\bëlöm\u009d\u0003¸DF¨m¹\b\u0081\u0017ä2îÙÜä\u0093\u00830®>±³Tý{Á\u001eÙ% È£ï\u009dòÍ\u0099`¼WCJfl\rp\u0010Y7\u0003ÝþàÓ\u0087Ûª¼±\u0095T\u0095{\u008f\u001et%nÈsï7ò&\u0099\u000e¼\u0001Bäiæ\fÓ\u0013¿6«ÝÕà\u0089\u0087dªv±\u001eTQ{#±³Të{Ì\u001eÉ%ûÈ¯ï\u009eò\u008b\u0099x¼\u0011CAf4\r-\u0010\u00027NÝñàÐ\u0087Áª\u00ad±®T\u0087{\u0083\u001eb%tÈEï=ò-\u0099T¼\u0016Bõþ\u0093\u001b£4\u009eQ\u009bjñ\u0087á Ì½ÃÖ+ó\u0018DÄ¡Í\u008eþëéÐ\u0096=\u009c\u001a³\"\\ÇEèi\u008df¶\u001a[\f|&a,&¹Ã¶ìÁ\u0089\u008d²ñ_þxÃeÀ\u000e8+\u001dÔQñi\u009av\u0087W ^J¦w\u008e¿bZdu_\u0010Z+dÆxá\b±ûTë{Ö\u001eÏ%¦È¯ï\u0093±ûTë{Ö\u001eÏ%¦È¯ï\u0093ò½\u0099t¼\u0006C\u001e\u0004ÛáËÎö«ï\u0090\u0086}\u008fZ³G\u009d,T\t&ö>Ó%¸R¥b\u008dàhïG\u0098\"Ô\u0019¨ô§Ó\u009aÎ\u0099¥a\u0080D\u007f\bZ91%,\u001c\u000b\u000báð±ïTê{Ó±ùTã{Í\u001eÆ%µÈ²ï\u009fò\u0090±ÝTþ{È\u001e\u008a%\u0086È³ï\u009eò\u0096\u0099e¼SCMfz\r\"\u0010\u00197\u0012Ý²àÿ\u0087Æªª±¥T\u0099{\u0083±ÝTà{Ü\u001eØ%»È¯ï\u0094òÂ\u0099_¼zCcfz\r&\u0010\u00037\tÝþàÈ\u0087\u008eª¾±¥T\u0086{Æ\u001eh%:È\u001a±ÝTà{Ü\u001eØ%»È¯ï\u0094òÂ\u0099_¼zCcfz\r&\u0010\u00037\tÝþàÈ\u0087\u008eª¾±¥T\u0086{Æ\u001eh%:È\u001aï\u0001ò~\u0099N±îTá{\u0096\u001eÂ%µÈ´ï\u0094ò\u0095\u0099m¼LCM{\u0091\u009e\u008b±¾Ô¤ïØ\u0002Å%é8à±êTì{×\u001eÒ%ìÈðü¢\u0019£6\u009aS\u0085hð\u0085ÿ±îTá{\u0096\u001eÚ%¦È©ï\u0094ò\u0097\u0099o¼JC\u0006f8\r6\u0010\u00177\u000eÝö±îTá{\u0096\u001eÁ%±È´ï\u009eò\u0087\u0099`¼\u0010CYf?\r)\u0010\u0003\u0092\u008e\u0003eæjÉ\u001d¬R\u0097:z.]\u000e@\u001b+â±¬¿ÏZÀu·\u0010é+\u0080Æ\u008eá½ü§\u0097\u0003²oM{h\u0014\u0003\u0001\u001e\"9\"ÓÇ±úTû{Ô\u001eÆ%\u008bÈ¾ïÈòÔ±îTá{\u0096\u001eÈ%¡È¯ï\u009cò\u0086\u0099\"¼XCAf4\r#\u0010\u00137\u0012ÝâàÎ\u0087Çª¶±¾õ¸\u0010¨?\u0095Z\u008caå\u008cì«Ð¶\u008eÝ<ø\u0019\u0007\u0000\"6I`TPsM\u0099´¤\u008dÃ\u0084îø±ûTë{Ö\u001eÏ%¦È¯ï\u0093ò½\u0099t¼\u0006C\u001efu\r7\u0010\u00127\u000bÝÍàÄ\u0087\u0096ªî±åT\u0093{\u0083\u001e~%gÈ^ï7ò+\u0099%¼\u001cB®i¶±ûTë{Ö\u001eÏ%¦È¯ï\u0093òÍ\u0099k¼QCGf=\r(\u0010\u00137?ÝáàØ\u0087Åª÷±\u00adT\u0091{\u0088\u001eu%pÈEï=¸\f]\u001cr!\u00178,QÁXædû:\u0090\u008dµ«J°oÕ\u0004\u008b\u0019·>çÔJé=\u008e;£@¸E];r'\u0017\u0097±ûTá{×\u001eÍ%¸È£ïßò\u0091\u0099h¼UCwf=\r4\u0010\u001e7\u000fÝüàÙ\u0087ñª ±òTÂ{É\u001ew%gÈBï;ò:\u0099\u0013¼\u0007BÉiø\f\u008a\u0013ê±îTá{\u0096\u001eÈ%»È©ï\u0084ò\u008e\u0099c¼_CLf?\r6 \u0010Å\u001fêh\u008f6´EYW~zcu\b\u009f-¡Ò±÷Á\u009c\u0094\u0081ê¦ëL\u0005q.\u00164;\b RÅcêv\u008f\u0089´\u0099Y ~ÐcÄ\bí-ôÓ\u001cÌ³)\u008e\u0006²c¶XÕµÁ\u0092ú\u008f¡ä\u001aÁh>p±îTá{\u0096\u001eÈ%¡È¯ï\u009cò\u0086\u0099\"¼ZCAf)\r4\u0010\u001a7\u0001Ýëà\u0092\u0087Çª¼±èTë{Ë\u001eÞ%ù±õTà{Ñ\u001eÞ%úÈµï\u0086ò\u0081\u0099\"¼OCMf7\r1\u0010[7\u0010ÝààÓ\u0087Þª«\u0087\u0013b\u0015M+(!\u0013\u0004þPÙyÄ2¯\u009f\u008a¡u¿PÊ;Ñ&í\u0001çë\u001fk×\u008eÑ¡ïÄåÿÀ\u0012\u008f5¬(öCPfe\u0099y¼\u0005×!Ê/í;\u0007Å:ã]æp\u0083\u008cïiéF×#Ý\u0018øõ·Ò\u0094ÏÎ¤b\u0081_~N[\u00070\"-\u0011\n\fàãÝ×ºØ\u0097£±îTá{\u0096\u001eÁ%±È´ï\u009eò\u0087\u0099`¼\u0010CIf4\r \u0010\u00047\u000fÝûàØ\u0087\u0080ª©±¯T\u0099{\u0093\u001et±îTá{\u0096\u001eÈ%»È©ï\u0084òÌ\u0099}¼[CEf/\rj\u0010\u00177\u0016Ýöàã\u0087Àª¹±§T\u0091±îTá{\u0096\u001eÅ%°È«ïÞò\u0080\u0099y¼WCDf>\rj\u0010\u00107\tÝüàÛ\u0087Ëªª±ºT\u0086{\u008f\u001e~%v ¡E®jÙ\u000f\u00954éÙæþÛãØ\u0088 \u00ad\u0005RIww\u001c~\u0001P&CÌ¹ñÝ\u0096\u0087»þ ëEÜjÌ\u000f-4=Ù\u0011þxãi\u0088A±îTá{\u0096\u001eÙ%\u00adÈµï\u0084ò\u0087\u0099a¼\u0010CJf/\r-\u0010\u001a7\u0004Ý¼àÚ\u0087Çª¶±\u00adT\u0091{\u0094\u001e`%pÈEï0ò<±îTá{\u0096\u001eÙ%\u00adÈµï\u0084ò\u0087\u0099a¼aCMf\"\r0\u0010X7\u0002ÝçàÕ\u0087Âª¼±äT\u0092{\u008f\u001e~%eÈIï,ò8\u0099\b¼\rBøiôÂú'õ\b\u0082mÈV¥»¼\u009c\u0080\u0081\u0099êjÏ\u00040^\u0015;~9c\u000eD\u0010®¨\u0093ÎôÓÙ¢Â¹'\u0085\b\u0080mtVd»Q\u009c$\u0081(±îTá{\u0096\u001eÜ%±È¨ï\u0094ò\u008d\u0099~¼aCLf6\r/\u0010\u001b7NÝðàÉ\u0087Çª´±®TÚ{\u0080\u001ey%lÈKï;ò:\u0099\n¼\u0016Bÿiî\fÆ±´\u001aëÿõ]\t±µ±³Tê{Ý\u001eÜ%ûÈ·ï\u0095ò\u008f\u0099y¼aCXf3\r4\u0010\u0013\f#ézÆM£L\u0098ku%R\u000fO\u0011$÷\u0001ËþÌÛå°¶\u00ad\u0087\u008a\u0083`g]N:_\u0017&\f>é;Æ\u0011£å\u0098üuÅRª}W\u0098\u000e·9Ò8é\u001f\u0004Q#{>eU\u0083p¿\u008f¸ª\u0091ÁÇÜ÷ûê\u0011\u000f,<±³Tê{Ý\u001eÜ%ûÈµï\u009fò\u0081\u0099g¼[C\\fu\r5\u0010\u00137\rÝçàØ·\u0014RZ}f\u0018~#\\Î\u0010é2ô(\u009fÞºÆEû`\u008f\u000b\u0082\u0016²1¢üÛ\u0019\u00956©S±hÈ\u0085Ë¢õ¿¥Ô\bñ?\u000e\"+\u001d@@]wzj\u0090\u0099\u00ad\u008bÊ«çÑüÎ\u0019ð6áS\u001bh5\u0085 ¢S¿BÔgñk\u000f¡$\u0099A¿^Ù{Ó\u0090¾\u00adñÊ\u0013±³Tê{Ý\u001eÜ%ûÈ¤ï\u0083ò\u0096\u0099S¼YCXf)±³Tê{Ý\u001eÜ%ûÈ¤ï\u0083ò\u0096\u0099S¼JCAf7\r!ï;\nb%U@T{s\u0096=±\u0017¬\tÇïâÓ\u001dÔ8ýS®N\u008di\u009c\u0083|¾[ÙJô4ï'\n\u000e%\n±³Tý{Á\u001eÙ% È£ï\u009dòÍ\u0099`¼WCJfu\r(\u0010\u001f7\u0002ÝðàÏ\u0087Úª¾±¥T\u0098{\u0082\u001eu%pÈsï4ò&\u0099\u0013¼JBåiï±³Tê{Ý\u001eÜ%ûÈ¤ï\u0083ò\u0096\u0099m¼]CKf?\u0016\u008dóÔÜã¹â\u0082Åo\u009aH½U¨>U\u001byädÁ\u000b±³Tê{Ý\u001eÜ%ûÈ¤ï\u0083ò\u0096\u0099a¼[COf4[c¾:\u0091\rô\fÏ+\"t\u0005S\u0018Fs³V\u009c©\u0091\u008cï\u000fáê¸Å\u008f \u008e\u009b©vöQÑLÄ'(\u0002\u0001ý\tØo\u0001\u009däÄËó®ò\u0095Õx\u008a_\u00adB¸)R\fwógÖ\u001d½\u001a ;ôh\u00111>\u0006[\u0007` \u008d\u007fªX·MÜ\u0088ù\u008c\u0006\u009e#ä±³Tê{Ù\u001eÞ%µÈéï\u0094ò\u008d\u0099{¼PCDf5\r%\u0010\u00127\u0013Ý½à\u0092\u0087Öªº±åT\u0096{\u0095\u001ed%i:Åß\u0095ð \u0095¨®\u008dCÇdïyú\u0012\u001e7'È)í_\u0086\u001d\u009bB¼eV\u0090k\u0099\f°!Ï:Îßçðô\u0095 ®\u001bC6dLy[\u0012~±³Tþ{Ê\u001eÅ%·Èéï\u0099ò\u008d\u0099|¼QCZf.\r7±¬Tè{Þ\u001e\u008a%î±³Tþ{Ê\u001eÅ%·Èéï\u0083ò\u0087\u0099`¼XC\u0007f7\r%\u0010\u00067\u0013±ûTü{Ù\u001eÆ%¸È©ï\u0093òÌ\u0099k¼QCDf>\r\"\u0010\u001f7\u0013Ýúà\u0092\u0087Ýª·a;\u0084,«\u0011Î&õS\u0018H?h\"vI¥l\u0086\u0093\u0097¶¿ÝüÀÒØ>=f\u0012AwDLv¡&\u0086\u0018\u009b\u000bðèÕÒ*ú\u000f´d¦y\u009f^\u0088´|\u0089Bî\rÃ-Ø*=\u0015±þTâ{Í\u001eÏ%§È²ï\u0091ò\u0081\u0099g¼M±³Të{Ì\u001eÉ%ûÈ«ï\u009fò\u0097\u0099b¼JC[±³Tê{Ù\u001eÞ%µÈéï\u0094ò\u008d\u0099{¼PCDf5\r%\u0010\u00127\u0013Ý½à\u0092\u0087Êª¨±åT\u0095{\u0096\u001e`%qÈ\u0002ï&ò%\u0099\u0016±³Tþ{Ê\u001eÅ%·Èéï\u0093ò\u0092\u0099y¼WCFf<\r+¢òGÈhý\rç6\u009bÛ\u0086üªá£±³Tê{Ù\u001eÞ%µÈéï\u009dò\u008b\u0099\u007f¼]C\u0007f*\r6\u0010\u00197\u0006ÝûàÐ\u0087Ëª«±åT\u0097{\u0093\u001eb%-È\u001cïqò+\u0099\u0015¼\tB¸ií\fÛ\u0013¿6¼Ý\u0097à\u009c\u0087}ªt±DT\f{!\u001e\u001b%\u0005ËïîíõÛ\u0098Å".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
                b = cArr;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 8408616160505582734L;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(byte r6, int r7, short r8) {
                /*
                    int r6 = r6 * 4
                    int r6 = r6 + 4
                    int r8 = r8 * 3
                    int r0 = r8 + 1
                    byte[] r1 = com.datadog.android.rum.model.LongTaskEvent.onTransact.Companion.$$c
                    int r7 = r7 * 3
                    int r7 = r7 + 109
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L17
                    r4 = r7
                    r3 = r2
                    r7 = r6
                    goto L2a
                L17:
                    r3 = r2
                    r5 = r7
                    r7 = r6
                    r6 = r5
                L1b:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r8) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L26:
                    int r3 = r3 + 1
                    r4 = r1[r7]
                L2a:
                    int r6 = r6 + r4
                    int r7 = r7 + 1
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.LongTaskEvent.onTransact.Companion.$$e(byte, int, short):java.lang.String");
            }
        }

        public onTransact(connect connectVar) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = connectVar;
        }

        public /* synthetic */ onTransact(connect connectVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : connectVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public onTransact() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof onTransact) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((onTransact) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            connect connectVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (connectVar == null) {
                return 0;
            }
            return connectVar.hashCode();
        }

        public final String toString() {
            connect connectVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("onTransact(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(connectVar);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/LongTaskEvent;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static LongTaskEvent TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
            LongTaskEventSource longTaskEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            RemoteActionCompatParcelizer remoteActionCompatParcelizerTuitionPaymentFragmentbindingInflater1;
            d dVarTuitionPaymentFragmentbindingInflater1;
            onTransact ontransactTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            INotificationSideChannelStubProxy iNotificationSideChannelStubProxyTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            cancelAll cancelallTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            asBinder asbinderTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentbindingInflater1;
            asInterface asinterfaceTuitionPaymentFragmentspecialinlinedviewModeldefault3;
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
            String asString;
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                long asLong = p0.get("date").getAsLong();
                JsonObject asJsonObject11 = p0.get("application").getAsJsonObject();
                TuitionPaymentFragmentspecialinlinedviewModeldefault1.Companion companion = TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject11, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject11);
                JsonElement jsonElement = p0.get(NotificationCompat.CATEGORY_SERVICE);
                String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                JsonElement jsonElement2 = p0.get("version");
                String asString3 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                JsonElement jsonElement3 = p0.get("build_version");
                String asString4 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                JsonElement jsonElement4 = p0.get("build_id");
                String asString5 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                JsonObject asJsonObject12 = p0.get("session").getAsJsonObject();
                INotificationSideChannelDefault.Companion companion2 = INotificationSideChannelDefault.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject12, "");
                INotificationSideChannelDefault iNotificationSideChannelDefaultB = INotificationSideChannelDefault.Companion.b(asJsonObject12);
                JsonElement jsonElement5 = p0.get("source");
                if (jsonElement5 == null || (asString = jsonElement5.getAsString()) == null) {
                    longTaskEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                } else {
                    LongTaskEventSource.Companion companion3 = LongTaskEventSource.INSTANCE;
                    longTaskEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault1 = LongTaskEventSource.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asString);
                }
                JsonObject asJsonObject13 = p0.get("view").getAsJsonObject();
                INotificationSideChannelStub.Companion companion4 = INotificationSideChannelStub.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject13, "");
                INotificationSideChannelStub iNotificationSideChannelStubTuitionPaymentFragmentspecialinlinedviewModeldefault1 = INotificationSideChannelStub.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject13);
                JsonElement jsonElement6 = p0.get("usr");
                if (jsonElement6 == null || (asJsonObject10 = jsonElement6.getAsJsonObject()) == null) {
                    remoteActionCompatParcelizerTuitionPaymentFragmentbindingInflater1 = null;
                } else {
                    RemoteActionCompatParcelizer.Companion companion5 = RemoteActionCompatParcelizer.INSTANCE;
                    remoteActionCompatParcelizerTuitionPaymentFragmentbindingInflater1 = RemoteActionCompatParcelizer.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject10);
                }
                JsonElement jsonElement7 = p0.get("connectivity");
                if (jsonElement7 == null || (asJsonObject9 = jsonElement7.getAsJsonObject()) == null) {
                    dVarTuitionPaymentFragmentbindingInflater1 = null;
                } else {
                    d.Companion companion6 = d.INSTANCE;
                    dVarTuitionPaymentFragmentbindingInflater1 = d.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject9);
                }
                JsonElement jsonElement8 = p0.get(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
                if (jsonElement8 == null || (asJsonObject8 = jsonElement8.getAsJsonObject()) == null) {
                    ontransactTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                } else {
                    onTransact.Companion companion7 = onTransact.INSTANCE;
                    ontransactTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onTransact.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject8);
                }
                JsonElement jsonElement9 = p0.get("synthetics");
                if (jsonElement9 == null || (asJsonObject7 = jsonElement9.getAsJsonObject()) == null) {
                    iNotificationSideChannelStubProxyTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                } else {
                    INotificationSideChannelStubProxy.Companion companion8 = INotificationSideChannelStubProxy.INSTANCE;
                    iNotificationSideChannelStubProxyTuitionPaymentFragmentspecialinlinedviewModeldefault2 = INotificationSideChannelStubProxy.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject7);
                }
                JsonElement jsonElement10 = p0.get("ci_test");
                if (jsonElement10 == null || (asJsonObject6 = jsonElement10.getAsJsonObject()) == null) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                } else {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2.Companion companion9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject6);
                }
                JsonElement jsonElement11 = p0.get("os");
                getInterfaceDescriptor getinterfacedescriptorTuitionPaymentFragmentspecialinlinedviewModeldefault3 = (jsonElement11 == null || (asJsonObject5 = jsonElement11.getAsJsonObject()) == null) ? null : getInterfaceDescriptor.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject5);
                JsonElement jsonElement12 = p0.get("device");
                if (jsonElement12 == null || (asJsonObject4 = jsonElement12.getAsJsonObject()) == null) {
                    cancelallTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                } else {
                    cancelAll.Companion companion10 = cancelAll.INSTANCE;
                    cancelallTuitionPaymentFragmentspecialinlinedviewModeldefault3 = cancelAll.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject4);
                }
                JsonObject asJsonObject14 = p0.get("_dd").getAsJsonObject();
                cancel.Companion companion11 = cancel.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject14, "");
                cancel cancelVarTuitionPaymentFragmentbindingInflater1 = cancel.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject14);
                JsonElement jsonElement13 = p0.get("context");
                if (jsonElement13 == null || (asJsonObject3 = jsonElement13.getAsJsonObject()) == null) {
                    asbinderTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                } else {
                    asBinder.Companion companion12 = asBinder.INSTANCE;
                    asbinderTuitionPaymentFragmentspecialinlinedviewModeldefault1 = asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject3);
                }
                JsonElement jsonElement14 = p0.get("action");
                if (jsonElement14 == null || (asJsonObject2 = jsonElement14.getAsJsonObject()) == null) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentbindingInflater1 = null;
                } else {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3.Companion companion13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE;
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentspecialinlinedviewModeldefault3.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject2);
                }
                JsonElement jsonElement15 = p0.get("container");
                if (jsonElement15 == null || (asJsonObject = jsonElement15.getAsJsonObject()) == null) {
                    asinterfaceTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                } else {
                    asInterface.Companion companion14 = asInterface.INSTANCE;
                    asinterfaceTuitionPaymentFragmentspecialinlinedviewModeldefault3 = asInterface.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject);
                }
                String asString6 = p0.get("type").getAsString();
                JsonObject asJsonObject15 = p0.get("long_task").getAsJsonObject();
                INotificationSideChannel.Companion companion15 = INotificationSideChannel.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject15, "");
                INotificationSideChannel iNotificationSideChannelB = INotificationSideChannel.Companion.b(asJsonObject15);
                if (!Intrinsics.areEqual(asString6, "long_task")) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                return new LongTaskEvent(asLong, tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault3, asString2, asString3, asString4, asString5, iNotificationSideChannelDefaultB, longTaskEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault1, iNotificationSideChannelStubTuitionPaymentFragmentspecialinlinedviewModeldefault1, remoteActionCompatParcelizerTuitionPaymentFragmentbindingInflater1, dVarTuitionPaymentFragmentbindingInflater1, ontransactTuitionPaymentFragmentspecialinlinedviewModeldefault2, iNotificationSideChannelStubProxyTuitionPaymentFragmentspecialinlinedviewModeldefault2, TuitionPaymentFragmentspecialinlinedviewModeldefault2, getinterfacedescriptorTuitionPaymentFragmentspecialinlinedviewModeldefault3, cancelallTuitionPaymentFragmentspecialinlinedviewModeldefault3, cancelVarTuitionPaymentFragmentbindingInflater1, asbinderTuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentbindingInflater1, asinterfaceTuitionPaymentFragmentspecialinlinedviewModeldefault3, iNotificationSideChannelB);
            } catch (IllegalStateException e2) {
                throw new JsonParseException("Unable to parse json into type LongTaskEvent", e2);
            } catch (NullPointerException e3) {
                throw new JsonParseException("Unable to parse json into type LongTaskEvent", e3);
            } catch (NumberFormatException e4) {
                throw new JsonParseException("Unable to parse json into type LongTaskEvent", e4);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((TuitionPaymentFragmentspecialinlinedviewModeldefault1) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("id").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(asString);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannelDefault;", "", "", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSessionType;", "p1", "", "p2", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSessionType;Ljava/lang/Boolean;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/Boolean;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSessionType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannelDefault {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final String b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final LongTaskEventSessionType TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final Boolean TuitionPaymentFragmentbindingInflater1;

        public INotificationSideChannelDefault(String str, LongTaskEventSessionType longTaskEventSessionType, Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(longTaskEventSessionType, "");
            this.b = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = longTaskEventSessionType;
            this.TuitionPaymentFragmentbindingInflater1 = bool;
        }

        public /* synthetic */ INotificationSideChannelDefault(String str, LongTaskEventSessionType longTaskEventSessionType, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, longTaskEventSessionType, (i & 4) != 0 ? null : bool);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof INotificationSideChannelDefault)) {
                return false;
            }
            INotificationSideChannelDefault iNotificationSideChannelDefault = (INotificationSideChannelDefault) p0;
            return Intrinsics.areEqual(this.b, iNotificationSideChannelDefault.b) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == iNotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, iNotificationSideChannelDefault.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode();
            int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
            Boolean bool = this.TuitionPaymentFragmentbindingInflater1;
            return (((iHashCode * 31) + iHashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            String str = this.b;
            LongTaskEventSessionType longTaskEventSessionType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Boolean bool = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("INotificationSideChannelDefault(b=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(longTaskEventSessionType);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$INotificationSideChannelDefault$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannelDefault$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannelDefault;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannelDefault;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static INotificationSideChannelDefault b(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("id").getAsString();
                    LongTaskEventSessionType.Companion companion = LongTaskEventSessionType.INSTANCE;
                    String asString2 = p0.get("type").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString2, "");
                    LongTaskEventSessionType longTaskEventSessionTypeTuitionPaymentFragmentspecialinlinedviewModeldefault1 = LongTaskEventSessionType.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asString2);
                    JsonElement jsonElement = p0.get("has_replay");
                    Boolean boolValueOf = jsonElement != null ? Boolean.valueOf(jsonElement.getAsBoolean()) : null;
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new INotificationSideChannelDefault(asString, longTaskEventSessionTypeTuitionPaymentFragmentspecialinlinedviewModeldefault1, boolValueOf);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type LongTaskEventSession", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type LongTaskEventSession", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type LongTaskEventSession", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannelStub;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannelStub {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public String b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public INotificationSideChannelStub(String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.b = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str4;
        }

        public /* synthetic */ INotificationSideChannelStub(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof INotificationSideChannelStub)) {
                return false;
            }
            INotificationSideChannelStub iNotificationSideChannelStub = (INotificationSideChannelStub) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, iNotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.b, iNotificationSideChannelStub.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, iNotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, iNotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
            String str = this.b;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            int iHashCode3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str2 = this.b;
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("INotificationSideChannelStub(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(", b=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str3);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$INotificationSideChannelStub$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannelStub$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannelStub;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannelStub;"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    Intrinsics.checkNotNullExpressionValue(asString3, "");
                    return new INotificationSideChannelStub(asString, asString2, asString3, asString4);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type LongTaskEventView", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type LongTaskEventView", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type LongTaskEventView", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$RemoteActionCompatParcelizer;", "", "", "p0", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/util/Map;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class RemoteActionCompatParcelizer {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final String[] b = {"id", "name", "email"};

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public RemoteActionCompatParcelizer(String str, String str2, String str3, Map<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = map;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(String str, String str2, String str3, LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? new LinkedHashMap() : linkedHashMap);
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$RemoteActionCompatParcelizer$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$RemoteActionCompatParcelizer$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$RemoteActionCompatParcelizer;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/LongTaskEvent$RemoteActionCompatParcelizer;", "", "", "b", "[Ljava/lang/String;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static RemoteActionCompatParcelizer TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
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
                        if (!ArraysKt.contains(RemoteActionCompatParcelizer.b, entry.getKey())) {
                            String key = entry.getKey();
                            Intrinsics.checkNotNullExpressionValue(key, "");
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    return new RemoteActionCompatParcelizer(asString, asString2, asString3, linkedHashMap);
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

        public static /* synthetic */ RemoteActionCompatParcelizer TuitionPaymentFragmentspecialinlinedviewModeldefault1(RemoteActionCompatParcelizer remoteActionCompatParcelizer, Map map) {
            String str = remoteActionCompatParcelizer.TuitionPaymentFragmentbindingInflater1;
            String str2 = remoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str3 = remoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Intrinsics.checkNotNullParameter(map, "");
            return new RemoteActionCompatParcelizer(str, str2, str3, map);
        }

        public RemoteActionCompatParcelizer() {
            this(null, null, null, null, 15, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, remoteActionCompatParcelizer.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, remoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, remoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, remoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            String str = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentbindingInflater1;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Map<String, Object> map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("RemoteActionCompatParcelizer(TuitionPaymentFragmentbindingInflater1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str3);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$d;", "", "Lcom/datadog/android/rum/model/LongTaskEvent$Status;", "p0", "", "Lcom/datadog/android/rum/model/LongTaskEvent$Interface;", "p1", "Lcom/datadog/android/rum/model/LongTaskEvent$EffectiveType;", "p2", "Lcom/datadog/android/rum/model/LongTaskEvent$b;", "p3", "<init>", "(Lcom/datadog/android/rum/model/LongTaskEvent$Status;Ljava/util/List;Lcom/datadog/android/rum/model/LongTaskEvent$EffectiveType;Lcom/datadog/android/rum/model/LongTaskEvent$b;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/rum/model/LongTaskEvent$b;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/rum/model/LongTaskEvent$EffectiveType;", "Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "Lcom/datadog/android/rum/model/LongTaskEvent$Status;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final List<Interface> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final EffectiveType TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final b TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final Status TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Status status, List<? extends Interface> list, EffectiveType effectiveType, b bVar) {
            Intrinsics.checkNotNullParameter(status, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = status;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = list;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = effectiveType;
            this.TuitionPaymentFragmentbindingInflater1 = bVar;
        }

        public /* synthetic */ d(Status status, List list, EffectiveType effectiveType, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(status, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : effectiveType, (i & 8) != 0 ? null : bVar);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof d)) {
                return false;
            }
            d dVar = (d) p0;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, dVar.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
            List<Interface> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            EffectiveType effectiveType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode3 = effectiveType == null ? 0 : effectiveType.hashCode();
            b bVar = this.TuitionPaymentFragmentbindingInflater1;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bVar != null ? bVar.hashCode() : 0);
        }

        public final String toString() {
            Status status = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            List<Interface> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            EffectiveType effectiveType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            b bVar = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("d(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(status);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(list);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(effectiveType);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(bVar);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$d$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$d$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$d;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/LongTaskEvent$d;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static d TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
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
                    Status statusTuitionPaymentFragmentbindingInflater1 = Status.Companion.TuitionPaymentFragmentbindingInflater1(asString2);
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
                            arrayList.add(Interface.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asString3));
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
                        b.Companion companion4 = b.INSTANCE;
                        bVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = b.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject);
                    }
                    return new d(statusTuitionPaymentFragmentbindingInflater1, arrayList, effectiveTypeTuitionPaymentFragmentspecialinlinedviewModeldefault1, bVarTuitionPaymentFragmentspecialinlinedviewModeldefault1);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannelStubProxy;", "", "", "p0", "p1", "", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/Boolean;", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannelStubProxy {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final Boolean TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public INotificationSideChannelStubProxy(String str, String str2, Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
            this.TuitionPaymentFragmentbindingInflater1 = bool;
        }

        public /* synthetic */ INotificationSideChannelStubProxy(String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : bool);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof INotificationSideChannelStubProxy)) {
                return false;
            }
            INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = (INotificationSideChannelStubProxy) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, iNotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, iNotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, iNotificationSideChannelStubProxy.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
            int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
            Boolean bool = this.TuitionPaymentFragmentbindingInflater1;
            return (((iHashCode * 31) + iHashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Boolean bool = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("INotificationSideChannelStubProxy(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$INotificationSideChannelStubProxy$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannelStubProxy$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannelStubProxy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannelStubProxy;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static INotificationSideChannelStubProxy TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("test_id").getAsString();
                    String asString2 = p0.get("result_id").getAsString();
                    JsonElement jsonElement = p0.get("injected");
                    Boolean boolValueOf = jsonElement != null ? Boolean.valueOf(jsonElement.getAsBoolean()) : null;
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    Intrinsics.checkNotNullExpressionValue(asString2, "");
                    return new INotificationSideChannelStubProxy(asString, asString2, boolValueOf);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((TuitionPaymentFragmentspecialinlinedviewModeldefault2) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("test_execution_id").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(asString);
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$cancelAll;", "", "Lcom/datadog/android/rum/model/LongTaskEvent$DeviceType;", "p0", "", "p1", "p2", "p3", "p4", "<init>", "(Lcom/datadog/android/rum/model/LongTaskEvent$DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "asInterface", "Lcom/datadog/android/rum/model/LongTaskEvent$DeviceType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class cancelAll {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String TuitionPaymentFragmentbindingInflater1;
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
        public final DeviceType TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final String b;

        public cancelAll(DeviceType deviceType, String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(deviceType, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = deviceType;
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
            this.b = str3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str4;
        }

        public /* synthetic */ cancelAll(DeviceType deviceType, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(deviceType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof cancelAll)) {
                return false;
            }
            cancelAll cancelall = (cancelAll) p0;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == cancelall.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, cancelall.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, cancelall.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, cancelall.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, cancelall.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
            String str = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.b;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            DeviceType deviceType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str = this.TuitionPaymentFragmentbindingInflater1;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str3 = this.b;
            String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("cancelAll(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(deviceType);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str2);
            sb.append(", b=");
            sb.append(str3);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$cancelAll$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$cancelAll$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$cancelAll;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/LongTaskEvent$cancelAll;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static cancelAll TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    DeviceType.Companion companion = DeviceType.INSTANCE;
                    String asString = p0.get("type").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    DeviceType deviceTypeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = DeviceType.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asString);
                    JsonElement jsonElement = p0.get("name");
                    String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = p0.get("model");
                    String asString3 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    JsonElement jsonElement3 = p0.get("brand");
                    String asString4 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    JsonElement jsonElement4 = p0.get("architecture");
                    return new cancelAll(deviceTypeTuitionPaymentFragmentspecialinlinedviewModeldefault2, asString2, asString3, asString4, jsonElement4 != null ? jsonElement4.getAsString() : null);
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

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0086D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$cancel;", "", "Lcom/datadog/android/rum/model/LongTaskEvent$notify;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$g;", "p1", "", "p2", "", "p3", "<init>", "(Lcom/datadog/android/rum/model/LongTaskEvent$notify;Lcom/datadog/android/rum/model/LongTaskEvent$g;Ljava/lang/String;Ljava/lang/Boolean;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/rum/model/LongTaskEvent$g;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/Boolean;", "", "b", "J", "a", "Lcom/datadog/android/rum/model/LongTaskEvent$notify;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class cancel {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final Boolean TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final g TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final notify TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final long b;

        public cancel(notify notifyVar, g gVar, String str, Boolean bool) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = notifyVar;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = gVar;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            this.TuitionPaymentFragmentbindingInflater1 = bool;
            this.b = 2L;
        }

        public /* synthetic */ cancel(notify notifyVar, g gVar, String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : notifyVar, (i & 2) != 0 ? null : gVar, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : bool);
        }

        public cancel() {
            this(null, null, null, null, 15, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof cancel)) {
                return false;
            }
            cancel cancelVar = (cancel) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, cancelVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, cancelVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, cancelVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, cancelVar.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            notify notifyVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode = notifyVar == null ? 0 : notifyVar.hashCode();
            g gVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode2 = gVar == null ? 0 : gVar.hashCode();
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            Boolean bool = this.TuitionPaymentFragmentbindingInflater1;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            notify notifyVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            g gVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Boolean bool = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("cancel(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(notifyVar);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(gVar);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$cancel$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$cancel$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$cancel;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/LongTaskEvent$cancel;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static cancel TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
                notify notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                g gVarTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                JsonObject asJsonObject;
                JsonObject asJsonObject2;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    long asLong = p0.get("format_version").getAsLong();
                    JsonElement jsonElement = p0.get("session");
                    if (jsonElement == null || (asJsonObject2 = jsonElement.getAsJsonObject()) == null) {
                        notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    } else {
                        notify.Companion companion = notify.INSTANCE;
                        notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = notify.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject2);
                    }
                    JsonElement jsonElement2 = p0.get("configuration");
                    if (jsonElement2 == null || (asJsonObject = jsonElement2.getAsJsonObject()) == null) {
                        gVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    } else {
                        g.Companion companion2 = g.INSTANCE;
                        gVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = g.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject);
                    }
                    JsonElement jsonElement3 = p0.get("browser_sdk_version");
                    String asString = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    JsonElement jsonElement4 = p0.get("discarded");
                    Boolean boolValueOf = jsonElement4 != null ? Boolean.valueOf(jsonElement4.getAsBoolean()) : null;
                    if (asLong != 2) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    return new cancel(notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault3, gVarTuitionPaymentFragmentspecialinlinedviewModeldefault2, asString, boolValueOf);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u0007\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$asBinder;", "", "", "", "p0", "<init>", "(Ljava/util/Map;)V", "b", "(Ljava/util/Map;)Lcom/datadog/android/rum/model/LongTaskEvent$asBinder;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class asBinder {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public asBinder(Map<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = map;
        }

        public /* synthetic */ asBinder(LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new LinkedHashMap() : linkedHashMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public asBinder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static asBinder b(Map<String, Object> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new asBinder(p0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof asBinder) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((asBinder) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            Map<String, Object> map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("asBinder(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$asBinder$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$asBinder$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$asBinder;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/LongTaskEvent$asBinder;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

            private Companion() {
            }

            @JvmStatic
            public static asBinder TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, JsonElement> entry : p0.entrySet()) {
                        String key = entry.getKey();
                        Intrinsics.checkNotNullExpressionValue(key, "");
                        linkedHashMap.put(key, entry.getValue());
                    }
                    return new asBinder(linkedHashMap);
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

            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
                int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i2 = i % 9888718;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
                if (i2 != 0) {
                    return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                }
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iUptimeMillis;
                return iUptimeMillis;
            }
        }
    }

    public static /* synthetic */ LongTaskEvent TuitionPaymentFragmentbindingInflater1(LongTaskEvent longTaskEvent, RemoteActionCompatParcelizer remoteActionCompatParcelizer, asBinder asbinder) {
        long j = longTaskEvent.asInterface;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = longTaskEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str = longTaskEvent.INotificationSideChannel;
        String str2 = longTaskEvent.connect;
        String str3 = longTaskEvent.b;
        String str4 = longTaskEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = longTaskEvent.INotificationSideChannelDefault;
        LongTaskEventSource longTaskEventSource = longTaskEvent.INotificationSideChannelStub;
        INotificationSideChannelStub iNotificationSideChannelStub = longTaskEvent.MediaBrowserCompat;
        d dVar = longTaskEvent.asBinder;
        onTransact ontransact = longTaskEvent.cancel;
        INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = longTaskEvent.RemoteActionCompatParcelizer;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = longTaskEvent.TuitionPaymentFragmentbindingInflater1;
        getInterfaceDescriptor getinterfacedescriptor = longTaskEvent.onTransact;
        cancelAll cancelall = longTaskEvent.cancelAll;
        cancel cancelVar = longTaskEvent.a;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = longTaskEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        asInterface asinterface = longTaskEvent.d;
        INotificationSideChannel iNotificationSideChannel = longTaskEvent.notify;
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
        Intrinsics.checkNotNullParameter(iNotificationSideChannelDefault, "");
        Intrinsics.checkNotNullParameter(iNotificationSideChannelStub, "");
        Intrinsics.checkNotNullParameter(cancelVar, "");
        Intrinsics.checkNotNullParameter(iNotificationSideChannel, "");
        return new LongTaskEvent(j, tuitionPaymentFragmentspecialinlinedviewModeldefault1, str, str2, str3, str4, iNotificationSideChannelDefault, longTaskEventSource, iNotificationSideChannelStub, remoteActionCompatParcelizer, dVar, ontransact, iNotificationSideChannelStubProxy, tuitionPaymentFragmentspecialinlinedviewModeldefault2, getinterfacedescriptor, cancelall, cancelVar, asbinder, tuitionPaymentFragmentspecialinlinedviewModeldefault3, asinterface, iNotificationSideChannel);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof LongTaskEvent)) {
            return false;
        }
        LongTaskEvent longTaskEvent = (LongTaskEvent) p0;
        return this.asInterface == longTaskEvent.asInterface && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, longTaskEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.INotificationSideChannel, longTaskEvent.INotificationSideChannel) && Intrinsics.areEqual(this.connect, longTaskEvent.connect) && Intrinsics.areEqual(this.b, longTaskEvent.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, longTaskEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.INotificationSideChannelDefault, longTaskEvent.INotificationSideChannelDefault) && this.INotificationSideChannelStub == longTaskEvent.INotificationSideChannelStub && Intrinsics.areEqual(this.MediaBrowserCompat, longTaskEvent.MediaBrowserCompat) && Intrinsics.areEqual(this.INotificationSideChannelStubProxy, longTaskEvent.INotificationSideChannelStubProxy) && Intrinsics.areEqual(this.asBinder, longTaskEvent.asBinder) && Intrinsics.areEqual(this.cancel, longTaskEvent.cancel) && Intrinsics.areEqual(this.RemoteActionCompatParcelizer, longTaskEvent.RemoteActionCompatParcelizer) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, longTaskEvent.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.onTransact, longTaskEvent.onTransact) && Intrinsics.areEqual(this.cancelAll, longTaskEvent.cancelAll) && Intrinsics.areEqual(this.a, longTaskEvent.a) && Intrinsics.areEqual(this.g, longTaskEvent.g) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, longTaskEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.d, longTaskEvent.d) && Intrinsics.areEqual(this.notify, longTaskEvent.notify);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.asInterface);
        int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        String str = this.INotificationSideChannel;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.connect;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.b;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        int iHashCode7 = this.INotificationSideChannelDefault.hashCode();
        LongTaskEventSource longTaskEventSource = this.INotificationSideChannelStub;
        int iHashCode8 = longTaskEventSource == null ? 0 : longTaskEventSource.hashCode();
        int iHashCode9 = this.MediaBrowserCompat.hashCode();
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.INotificationSideChannelStubProxy;
        int iHashCode10 = remoteActionCompatParcelizer == null ? 0 : remoteActionCompatParcelizer.hashCode();
        d dVar = this.asBinder;
        int iHashCode11 = dVar == null ? 0 : dVar.hashCode();
        onTransact ontransact = this.cancel;
        int iHashCode12 = ontransact == null ? 0 : ontransact.hashCode();
        INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = this.RemoteActionCompatParcelizer;
        int iHashCode13 = iNotificationSideChannelStubProxy == null ? 0 : iNotificationSideChannelStubProxy.hashCode();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentbindingInflater1;
        int iHashCode14 = tuitionPaymentFragmentspecialinlinedviewModeldefault2 == null ? 0 : tuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        getInterfaceDescriptor getinterfacedescriptor = this.onTransact;
        int iHashCode15 = getinterfacedescriptor == null ? 0 : getinterfacedescriptor.hashCode();
        cancelAll cancelall = this.cancelAll;
        int iHashCode16 = cancelall == null ? 0 : cancelall.hashCode();
        int iHashCode17 = this.a.hashCode();
        asBinder asbinder = this.g;
        int iHashCode18 = asbinder == null ? 0 : asbinder.hashCode();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode19 = tuitionPaymentFragmentspecialinlinedviewModeldefault3 == null ? 0 : tuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        asInterface asinterface = this.d;
        return (((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (asinterface != null ? asinterface.hashCode() : 0)) * 31) + this.notify.hashCode();
    }

    public final String toString() {
        long j = this.asInterface;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str = this.INotificationSideChannel;
        String str2 = this.connect;
        String str3 = this.b;
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = this.INotificationSideChannelDefault;
        LongTaskEventSource longTaskEventSource = this.INotificationSideChannelStub;
        INotificationSideChannelStub iNotificationSideChannelStub = this.MediaBrowserCompat;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.INotificationSideChannelStubProxy;
        d dVar = this.asBinder;
        onTransact ontransact = this.cancel;
        INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = this.RemoteActionCompatParcelizer;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentbindingInflater1;
        getInterfaceDescriptor getinterfacedescriptor = this.onTransact;
        cancelAll cancelall = this.cancelAll;
        cancel cancelVar = this.a;
        asBinder asbinder = this.g;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        asInterface asinterface = this.d;
        INotificationSideChannel iNotificationSideChannel = this.notify;
        StringBuilder sb = new StringBuilder("LongTaskEvent(asInterface=");
        sb.append(j);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", INotificationSideChannel=");
        sb.append(str);
        sb.append(", connect=");
        sb.append(str2);
        sb.append(", b=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str4);
        sb.append(", INotificationSideChannelDefault=");
        sb.append(iNotificationSideChannelDefault);
        sb.append(", INotificationSideChannelStub=");
        sb.append(longTaskEventSource);
        sb.append(", MediaBrowserCompat=");
        sb.append(iNotificationSideChannelStub);
        sb.append(", INotificationSideChannelStubProxy=");
        sb.append(remoteActionCompatParcelizer);
        sb.append(", asBinder=");
        sb.append(dVar);
        sb.append(", cancel=");
        sb.append(ontransact);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(iNotificationSideChannelStubProxy);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", onTransact=");
        sb.append(getinterfacedescriptor);
        sb.append(", cancelAll=");
        sb.append(cancelall);
        sb.append(", a=");
        sb.append(cancelVar);
        sb.append(", g=");
        sb.append(asbinder);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", d=");
        sb.append(asinterface);
        sb.append(", notify=");
        sb.append(iNotificationSideChannel);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "", "", "p0", "<init>", "(Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final List<String> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(List<String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = list;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((TuitionPaymentFragmentspecialinlinedviewModeldefault3) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            List<String> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/LongTaskEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonArray asJsonArray = p0.get("id").getAsJsonArray();
                    ArrayList arrayList = new ArrayList(asJsonArray.size());
                    Intrinsics.checkNotNullExpressionValue(asJsonArray, "");
                    Iterator<JsonElement> it = asJsonArray.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getAsString());
                    }
                    return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(arrayList);
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

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$asInterface;", "", "Lcom/datadog/android/rum/model/LongTaskEvent$a;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSource;", "p1", "<init>", "(Lcom/datadog/android/rum/model/LongTaskEvent$a;Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSource;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSource;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "Lcom/datadog/android/rum/model/LongTaskEvent$a;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class asInterface {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final LongTaskEventSource TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final a TuitionPaymentFragmentbindingInflater1;

        public asInterface(a aVar, LongTaskEventSource longTaskEventSource) {
            Intrinsics.checkNotNullParameter(aVar, "");
            Intrinsics.checkNotNullParameter(longTaskEventSource, "");
            this.TuitionPaymentFragmentbindingInflater1 = aVar;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = longTaskEventSource;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof asInterface)) {
                return false;
            }
            asInterface asinterface = (asInterface) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, asinterface.TuitionPaymentFragmentbindingInflater1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentbindingInflater1.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            a aVar = this.TuitionPaymentFragmentbindingInflater1;
            LongTaskEventSource longTaskEventSource = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("asInterface(TuitionPaymentFragmentbindingInflater1=");
            sb.append(aVar);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(longTaskEventSource);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$asInterface$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$asInterface$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$asInterface;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/LongTaskEvent$asInterface;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static asInterface TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonObject asJsonObject = p0.get("view").getAsJsonObject();
                    a.Companion companion = a.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = a.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject);
                    LongTaskEventSource.Companion companion2 = LongTaskEventSource.INSTANCE;
                    String asString = p0.get("source").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new asInterface(aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3, LongTaskEventSource.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asString));
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannel;", "", "", "p0", "", "p1", "", "p2", "<init>", "(Ljava/lang/String;JLjava/lang/Boolean;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/Boolean;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannel {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final Boolean TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public INotificationSideChannel(String str, long j, Boolean bool) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j;
            this.TuitionPaymentFragmentbindingInflater1 = bool;
        }

        public /* synthetic */ INotificationSideChannel(String str, long j, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, j, (i & 4) != 0 ? null : bool);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof INotificationSideChannel)) {
                return false;
            }
            INotificationSideChannel iNotificationSideChannel = (INotificationSideChannel) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, iNotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == iNotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, iNotificationSideChannel.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode = str == null ? 0 : str.hashCode();
            int iHashCode2 = Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            Boolean bool = this.TuitionPaymentFragmentbindingInflater1;
            return (((iHashCode * 31) + iHashCode2) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Boolean bool = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("INotificationSideChannel(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(j);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$INotificationSideChannel$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannel$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannel;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/LongTaskEvent$INotificationSideChannel;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static INotificationSideChannel b(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("id");
                    String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    long asLong = p0.get(TypedValues.TransitionType.S_DURATION).getAsLong();
                    JsonElement jsonElement2 = p0.get("is_frozen_frame");
                    return new INotificationSideChannel(asString, asLong, jsonElement2 != null ? Boolean.valueOf(jsonElement2.getAsBoolean()) : null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$b;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;

        public b(String str, String str2) {
            this.TuitionPaymentFragmentbindingInflater1 = str;
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
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, bVar.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            String str = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentbindingInflater1;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("b(TuitionPaymentFragmentbindingInflater1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$b$b, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$b$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$b;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/LongTaskEvent$b;"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$connect;", "", "", "p0", "p1", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/Number;", "TuitionPaymentFragmentbindingInflater1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class connect {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final Number TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final Number TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public connect(Number number, Number number2) {
            Intrinsics.checkNotNullParameter(number, "");
            Intrinsics.checkNotNullParameter(number2, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = number;
            this.TuitionPaymentFragmentbindingInflater1 = number2;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof connect)) {
                return false;
            }
            connect connectVar = (connect) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, connectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, connectVar.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode();
        }

        public final String toString() {
            Number number = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Number number2 = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("connect(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(number);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(number2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$connect$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$connect$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$connect;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/LongTaskEvent$connect;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static connect TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    Number asNumber = p0.get("width").getAsNumber();
                    Number asNumber2 = p0.get("height").getAsNumber();
                    Intrinsics.checkNotNullExpressionValue(asNumber, "");
                    Intrinsics.checkNotNullExpressionValue(asNumber2, "");
                    return new connect(asNumber, asNumber2);
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

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$notify;", "", "Lcom/datadog/android/rum/model/LongTaskEvent$Plan;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$SessionPrecondition;", "p1", "<init>", "(Lcom/datadog/android/rum/model/LongTaskEvent$Plan;Lcom/datadog/android/rum/model/LongTaskEvent$SessionPrecondition;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/rum/model/LongTaskEvent$Plan;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/rum/model/LongTaskEvent$SessionPrecondition;", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class notify {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final SessionPrecondition b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final Plan TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public notify(Plan plan, SessionPrecondition sessionPrecondition) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = plan;
            this.b = sessionPrecondition;
        }

        public /* synthetic */ notify(Plan plan, SessionPrecondition sessionPrecondition, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : plan, (i & 2) != 0 ? null : sessionPrecondition);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public notify() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof notify)) {
                return false;
            }
            notify notifyVar = (notify) p0;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == notifyVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && this.b == notifyVar.b;
        }

        public final int hashCode() {
            Plan plan = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode = plan == null ? 0 : plan.hashCode();
            SessionPrecondition sessionPrecondition = this.b;
            return (iHashCode * 31) + (sessionPrecondition != null ? sessionPrecondition.hashCode() : 0);
        }

        public final String toString() {
            Plan plan = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            SessionPrecondition sessionPrecondition = this.b;
            StringBuilder sb = new StringBuilder("notify(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(plan);
            sb.append(", b=");
            sb.append(sessionPrecondition);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$notify$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$notify$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$notify;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/LongTaskEvent$notify;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static notify TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Plan planB;
                String asString;
                String asString2;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("plan");
                    SessionPrecondition sessionPreconditionTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    if (jsonElement == null || (asString2 = jsonElement.getAsString()) == null) {
                        planB = null;
                    } else {
                        Plan.Companion companion = Plan.INSTANCE;
                        planB = Plan.Companion.b(asString2);
                    }
                    JsonElement jsonElement2 = p0.get("session_precondition");
                    if (jsonElement2 != null && (asString = jsonElement2.getAsString()) != null) {
                        SessionPrecondition.Companion companion2 = SessionPrecondition.INSTANCE;
                        sessionPreconditionTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SessionPrecondition.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asString);
                    }
                    return new notify(planB, sessionPreconditionTuitionPaymentFragmentspecialinlinedviewModeldefault1);
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$g;", "", "", "p0", "p1", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/Number;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class g {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final Number TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final Number TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public g(Number number, Number number2) {
            Intrinsics.checkNotNullParameter(number, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = number;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = number2;
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
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
            Number number = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            return (iHashCode * 31) + (number == null ? 0 : number.hashCode());
        }

        public final String toString() {
            Number number = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Number number2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("g(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(number);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(number2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$g$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$g$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$g;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/LongTaskEvent$g;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static g TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$a;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public a(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof a) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((a) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("a(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$a$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$a$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$a;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/LongTaskEvent$a;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static a TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("id").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new a(asString);
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u0007j\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSource;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "b", "()Lcom/google/gson/JsonElement;", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "TuitionPaymentFragmentbindingInflater1", "a", "asBinder", "asInterface", "g"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum LongTaskEventSource {
        ANDROID("android"),
        IOS("ios"),
        BROWSER("browser"),
        FLUTTER("flutter"),
        REACT_NATIVE("react-native"),
        ROKU("roku"),
        UNITY("unity"),
        KOTLIN_MULTIPLATFORM("kotlin-multiplatform");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        LongTaskEventSource(String str) {
            this.jsonValue = str;
        }

        public final JsonElement b() {
            return new JsonPrimitive(this.jsonValue);
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$LongTaskEventSource$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSource$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSource;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSource;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static LongTaskEventSource TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (LongTaskEventSource longTaskEventSource : LongTaskEventSource.values()) {
                    if (Intrinsics.areEqual(longTaskEventSource.jsonValue, p0)) {
                        return longTaskEventSource;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSessionType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum LongTaskEventSessionType {
        USER("user"),
        SYNTHETICS("synthetics"),
        CI_TEST("ci_test");


        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        LongTaskEventSessionType(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$LongTaskEventSessionType$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSessionType$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSessionType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSessionType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static LongTaskEventSessionType TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (LongTaskEventSessionType longTaskEventSessionType : LongTaskEventSessionType.values()) {
                    if (Intrinsics.areEqual(longTaskEventSessionType.jsonValue, p0)) {
                        return longTaskEventSessionType;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$Status;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Status {
        CONNECTED("connected"),
        NOT_CONNECTED("not_connected"),
        MAYBE("maybe");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        Status(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$Status$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$Status$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$Status;", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/LongTaskEvent$Status;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static Status TuitionPaymentFragmentbindingInflater1(String p0) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$Interface;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "a", "asInterface", "TuitionPaymentFragmentbindingInflater1", "notify", "d"}, k = 1, mv = {1, 7, 0}, xi = 48)
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


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        Interface(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$Interface$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$Interface$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$Interface;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/LongTaskEvent$Interface;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static Interface TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$EffectiveType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum EffectiveType {
        SLOW_2G("slow_2g"),
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("2g"),
        b("3g"),
        TuitionPaymentFragmentbindingInflater1("4g");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        EffectiveType(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$EffectiveType$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$EffectiveType$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$EffectiveType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/LongTaskEvent$EffectiveType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$DeviceType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "asInterface", "asBinder", "a", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$DeviceType$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$DeviceType$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$DeviceType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/LongTaskEvent$DeviceType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static DeviceType TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0004\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$Plan;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/Number;)V", "jsonValue", "Ljava/lang/Number;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Plan {
        PLAN_1((Number) 1),
        PLAN_2((Number) 2);


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final Number jsonValue;

        Plan(Number number) {
            this.jsonValue = number;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$Plan$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$Plan$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$Plan;", "b", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/LongTaskEvent$Plan;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static Plan b(String p0) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$SessionPrecondition;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "a", "b", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        /* JADX INFO: renamed from: com.datadog.android.rum.model.LongTaskEvent$SessionPrecondition$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/LongTaskEvent$SessionPrecondition$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/LongTaskEvent$SessionPrecondition;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/LongTaskEvent$SessionPrecondition;"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
}
