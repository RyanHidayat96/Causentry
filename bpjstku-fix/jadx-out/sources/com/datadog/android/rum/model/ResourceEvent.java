package com.datadog.android.rum.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
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
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.TagBundle;
import defpackage.builderForDevice;
import defpackage.getByteOrder;
import defpackage.getRealtimeCaptureLatency;
import defpackage.getS720pSize;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b@\b\u0086\b\u0018\u0000 72\u00020\u0001:)8;2:7ACF=?LHMJbOYRcUSdefWg^h_]ZijaklmnopqBë\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020+2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0007¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b4\u00105R\u0013\u00107\u001a\u0004\u0018\u00010#8\u0006¢\u0006\u0006\n\u0004\b2\u00106R\u0014\u0010:\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u00108\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010;\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010<R\u0016\u00102\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010C\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001c\u0010=\u001a\u0004\u0018\u00010!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b8\u0010ER\u0014\u0010?\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010F\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010L\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010H\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010J\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010QR\u0016\u0010M\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010<R\u0014\u0010U\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010S\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010R\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0006\n\u0004\bY\u0010<R\u001c\u0010Y\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b;\u0010\\R\u0016\u0010^\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010<R\u0014\u0010a\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b_\u0010`"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent;", "", "", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$b;", "p1", "", "p2", "p3", "p4", "p5", "Lcom/datadog/android/rum/model/ResourceEvent$connect;", "p6", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "p7", "Lcom/datadog/android/rum/model/ResourceEvent$IconCompatParcelizer;", "p8", "Lcom/datadog/android/rum/model/ResourceEvent$getExtras;", "p9", "Lcom/datadog/android/rum/model/ResourceEvent$g;", "p10", "Lcom/datadog/android/rum/model/ResourceEvent$onTransact;", "p11", "Lcom/datadog/android/rum/model/ResourceEvent$getNotifyChildrenChangedOptions;", "p12", "Lcom/datadog/android/rum/model/ResourceEvent$TuitionPaymentFragmentbindingInflater1;", "p13", "Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelStubProxy;", "p14", "Lcom/datadog/android/rum/model/ResourceEvent$notify;", "p15", "Lcom/datadog/android/rum/model/ResourceEvent$cancelAll;", "p16", "Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannel;", "p17", "Lcom/datadog/android/rum/model/ResourceEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "p18", "Lcom/datadog/android/rum/model/ResourceEvent$asInterface;", "p19", "Lcom/datadog/android/rum/model/ResourceEvent$MediaBrowserCompat;", "p20", "<init>", "(JLcom/datadog/android/rum/model/ResourceEvent$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$connect;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;Lcom/datadog/android/rum/model/ResourceEvent$IconCompatParcelizer;Lcom/datadog/android/rum/model/ResourceEvent$getExtras;Lcom/datadog/android/rum/model/ResourceEvent$g;Lcom/datadog/android/rum/model/ResourceEvent$onTransact;Lcom/datadog/android/rum/model/ResourceEvent$getNotifyChildrenChangedOptions;Lcom/datadog/android/rum/model/ResourceEvent$TuitionPaymentFragmentbindingInflater1;Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelStubProxy;Lcom/datadog/android/rum/model/ResourceEvent$notify;Lcom/datadog/android/rum/model/ResourceEvent$cancelAll;Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannel;Lcom/datadog/android/rum/model/ResourceEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;Lcom/datadog/android/rum/model/ResourceEvent$asInterface;Lcom/datadog/android/rum/model/ResourceEvent$MediaBrowserCompat;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/model/ResourceEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/rum/model/ResourceEvent$b;", "TuitionPaymentFragmentbindingInflater1", "b", "Ljava/lang/String;", "asInterface", "Lcom/datadog/android/rum/model/ResourceEvent$TuitionPaymentFragmentbindingInflater1;", "asBinder", "Lcom/datadog/android/rum/model/ResourceEvent$g;", "d", "Lcom/datadog/android/rum/model/ResourceEvent$asInterface;", "a", "Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannel;", "()Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannel;", "g", "J", "cancelAll", "Lcom/datadog/android/rum/model/ResourceEvent$cancelAll;", "notify", "Lcom/datadog/android/rum/model/ResourceEvent$notify;", "INotificationSideChannel", "cancel", "Lcom/datadog/android/rum/model/ResourceEvent$onTransact;", "onTransact", "Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelStubProxy;", "Lcom/datadog/android/rum/model/ResourceEvent$MediaBrowserCompat;", "getInterfaceDescriptor", "INotificationSideChannelStub", "Lcom/datadog/android/rum/model/ResourceEvent$connect;", "INotificationSideChannelDefault", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "INotificationSideChannelStubProxy", "Lcom/datadog/android/rum/model/ResourceEvent$getNotifyChildrenChangedOptions;", "RemoteActionCompatParcelizer", "connect", "Lcom/datadog/android/rum/model/ResourceEvent$getExtras;", "()Lcom/datadog/android/rum/model/ResourceEvent$getExtras;", "MediaBrowserCompat", "write", "read", "Lcom/datadog/android/rum/model/ResourceEvent$IconCompatParcelizer;", "IconCompatParcelizer", "DeviceType", "EffectiveType", "Interface", "Method", "OperationType", "Plan", "ProviderType", "ResourceEventSessionType", "ResourceEventSource", "ResourceType", "SessionPrecondition", "getItem", "Status", "getNotifyChildrenChangedOptions", "getExtras", "disconnect"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class ResourceEvent {
    private static int[] IconCompatParcelizer;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int write;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final MediaBrowserCompat notify;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private final ResourceEventSource INotificationSideChannelStub;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private final connect INotificationSideChannelDefault;
    private final getNotifyChildrenChangedOptions INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String getInterfaceDescriptor;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final String b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final b TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private INotificationSideChannel asInterface;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final g d;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final onTransact cancelAll;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final cancelAll g;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private getExtras RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final asInterface a;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final long asBinder;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private final String cancel;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final notify INotificationSideChannel;
    private final INotificationSideChannelStubProxy onTransact;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final IconCompatParcelizer IconCompatParcelizer;
    private static final byte[] $$c = {38, 31, -70, -1};
    private static final int $$f = 215;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {30, 17, -35, 104, -21, -7, 54, -61, -23, -3, -18, -10, 0, -19, 62, -75, -11, 4, -23, 5, -18, -15, 10, -28, 2, -15, -8, 55, -72, -1, -17, 2, -12, -22, -10, 2, -10, -16, 57, -60, -11, -9, -21, -15, -2, -15, 10, -11, -26, 2, -22, 12, -28, 2, -15, -8, 55, -73, 0, -27, 13, -11, -26, 2, -22, 12, -28, 2, -15, -8, 55, -41, -32, -27, 30, -33, -16, -8, 0, 6, -24, -22, 0, -6, -12, -3, -7, -28, 2, -15, -8, 19, -28, -23, 5, -24, 42, -43, -26, 2, -22, 4, -20, -14, 76, -57, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, 9, -16, -14, 1, -14, -14, -2, 21, -46, -1, -15, 2, -28, 6, -22, 56, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, -8, -6, 2, -7, -15, -1, -20, -6, -14, -7, -6, -14, 0, -8, -27, 4, -5, -27, 33, -43, 2, -10, -16, -1, -10, -10, -4, -29, 0, -17, 56};
    private static final int $$e = 14;
    private static final byte[] $$a = {21, -108, 100, 114, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 153;
    private static int getNotifyChildrenChangedOptions = 0;
    private static int getRoot = 1;
    private static int getExtras = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 4
            int r9 = 84 - r9
            int r8 = r8 * 15
            int r8 = r8 + 38
            int r7 = r7 * 52
            int r7 = 107 - r7
            byte[] r0 = com.datadog.android.rum.model.ResourceEvent.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r5 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r7]
            r6 = r3
            r3 = r9
            r9 = r6
        L2d:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + (-11)
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.ResourceEvent.c(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 15
            int r8 = 99 - r8
            byte[] r0 = com.datadog.android.rum.model.ResourceEvent.$$d
            int r7 = r7 * 139
            int r7 = 142 - r7
            int r6 = r6 * 87
            int r1 = 140 - r6
            byte[] r1 = new byte[r1]
            int r6 = 139 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r8
            r3 = r2
            r8 = r7
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L30:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-9)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.ResourceEvent.f(short, int, byte, java.lang.Object[]):void");
    }

    public ResourceEvent(long j, b bVar, String str, String str2, String str3, String str4, connect connectVar, ResourceEventSource resourceEventSource, IconCompatParcelizer iconCompatParcelizer, getExtras getextras, g gVar, onTransact ontransact, getNotifyChildrenChangedOptions getnotifychildrenchangedoptions, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, INotificationSideChannelStubProxy iNotificationSideChannelStubProxy, notify notifyVar, cancelAll cancelall, INotificationSideChannel iNotificationSideChannel, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, asInterface asinterface, MediaBrowserCompat mediaBrowserCompat) {
        Intrinsics.checkNotNullParameter(bVar, "");
        Intrinsics.checkNotNullParameter(connectVar, "");
        Intrinsics.checkNotNullParameter(iconCompatParcelizer, "");
        Intrinsics.checkNotNullParameter(cancelall, "");
        Intrinsics.checkNotNullParameter(mediaBrowserCompat, "");
        this.asBinder = j;
        this.TuitionPaymentFragmentbindingInflater1 = bVar;
        this.cancel = str;
        this.write = str2;
        this.b = str3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str4;
        this.INotificationSideChannelDefault = connectVar;
        this.INotificationSideChannelStub = resourceEventSource;
        this.IconCompatParcelizer = iconCompatParcelizer;
        this.RemoteActionCompatParcelizer = getextras;
        this.d = gVar;
        this.cancelAll = ontransact;
        this.INotificationSideChannelStubProxy = getnotifychildrenchangedoptions;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentbindingInflater1;
        this.onTransact = iNotificationSideChannelStubProxy;
        this.INotificationSideChannel = notifyVar;
        this.g = cancelall;
        this.asInterface = iNotificationSideChannel;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.a = asinterface;
        this.notify = mediaBrowserCompat;
        this.getInterfaceDescriptor = "resource";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ResourceEvent(long j, b bVar, String str, String str2, String str3, String str4, connect connectVar, ResourceEventSource resourceEventSource, IconCompatParcelizer iconCompatParcelizer, getExtras getextras, g gVar, onTransact ontransact, getNotifyChildrenChangedOptions getnotifychildrenchangedoptions, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, INotificationSideChannelStubProxy iNotificationSideChannelStubProxy, notify notifyVar, cancelAll cancelall, INotificationSideChannel iNotificationSideChannel, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, asInterface asinterface, MediaBrowserCompat mediaBrowserCompat, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        String str7;
        g gVar2;
        INotificationSideChannelStubProxy iNotificationSideChannelStubProxy2;
        notify notifyVar2;
        INotificationSideChannel iNotificationSideChannel2;
        asInterface asinterface2;
        String str8 = (i & 4) != 0 ? null : str;
        if ((i & 8) != 0) {
            int i2 = getNotifyChildrenChangedOptions + 57;
            getRoot = i2 % 128;
            int i3 = i2 % 2;
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i & 16) != 0) {
            int i4 = getRoot + 115;
            getNotifyChildrenChangedOptions = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i & 32) != 0) {
            int i7 = getRoot + 19;
            getNotifyChildrenChangedOptions = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str7 = null;
        } else {
            str7 = str4;
        }
        ResourceEventSource resourceEventSource2 = (i & 128) != 0 ? null : resourceEventSource;
        getExtras getextras2 = (i & 512) != 0 ? null : getextras;
        if ((i & 1024) != 0) {
            int i10 = 2 % 2;
            gVar2 = null;
        } else {
            gVar2 = gVar;
        }
        onTransact ontransact2 = (i & 2048) != 0 ? null : ontransact;
        getNotifyChildrenChangedOptions getnotifychildrenchangedoptions2 = (i & 4096) != 0 ? null : getnotifychildrenchangedoptions;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = (i & 8192) != 0 ? null : tuitionPaymentFragmentbindingInflater1;
        if ((i & 16384) != 0) {
            int i11 = 2 % 2;
            iNotificationSideChannelStubProxy2 = null;
        } else {
            iNotificationSideChannelStubProxy2 = iNotificationSideChannelStubProxy;
        }
        if ((32768 & i) != 0) {
            int i12 = getNotifyChildrenChangedOptions + 29;
            getRoot = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 2 % 2;
            }
            notifyVar2 = null;
        } else {
            notifyVar2 = notifyVar;
        }
        if ((131072 & i) != 0) {
            int i14 = getNotifyChildrenChangedOptions + 83;
            getRoot = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
            iNotificationSideChannel2 = null;
        } else {
            iNotificationSideChannel2 = iNotificationSideChannel;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = (262144 & i) != 0 ? null : tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if ((i & 524288) != 0) {
            int i15 = getNotifyChildrenChangedOptions + 83;
            getRoot = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 6 / 0;
            }
            asinterface2 = null;
        } else {
            asinterface2 = asinterface;
        }
        this(j, bVar, str8, str5, str6, str7, connectVar, resourceEventSource2, iconCompatParcelizer, getextras2, gVar2, ontransact2, getnotifychildrenchangedoptions2, tuitionPaymentFragmentbindingInflater2, iNotificationSideChannelStubProxy2, notifyVar2, cancelall, iNotificationSideChannel2, tuitionPaymentFragmentspecialinlinedviewModeldefault4, asinterface2, mediaBrowserCompat);
    }

    public final getExtras b() {
        int i = 2 % 2;
        int i2 = getRoot + 49;
        int i3 = i2 % 128;
        getNotifyChildrenChangedOptions = i3;
        int i4 = i2 % 2;
        getExtras getextras = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 57;
        getRoot = i5 % 128;
        int i6 = i5 % 2;
        return getextras;
    }

    public final INotificationSideChannel TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions;
        int i3 = i2 + 69;
        getRoot = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        INotificationSideChannel iNotificationSideChannel = this.asInterface;
        int i4 = i2 + 61;
        getRoot = i4 % 128;
        int i5 = i4 % 2;
        return iNotificationSideChannel;
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$onTransact;", "", "Lcom/datadog/android/rum/model/ResourceEvent$disconnect;", "p0", "<init>", "(Lcom/datadog/android/rum/model/ResourceEvent$disconnect;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentbindingInflater1", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/rum/model/ResourceEvent$disconnect;", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class onTransact {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        private final disconnect TuitionPaymentFragmentbindingInflater1;
        private static final byte[] $$d = {1, -81, 2, 79, 14, 0, -61, 56, -1, 21, -17, 5, 13, -6, -55, 53, 15, -8, 16, -1, -4, -3, -52, 70, 5, -6, -61, 65, 4, -9, 3, 9, -60, 32, 37, 1, -5, -17, 15, 20, -6, -36, 51, -15, 11, 8, -78, 77, 1, -24, 32, -15, 15, 7, -16, 4, 19, -78, 64};
        private static final int $$e = 222;
        private static final byte[] $$a = {109, 7, 114, -90, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
        private static final int $$b = 215;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f737a = 0;
        private static int d = 1;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r7, int r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 14
                int r9 = r9 + 84
                int r7 = r7 + 1
                int r8 = r8 * 52
                int r8 = 55 - r8
                byte[] r0 = com.datadog.android.rum.model.ResourceEvent.onTransact.$$a
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r4 = r2
                r9 = r8
                goto L2d
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                int r8 = r8 + 1
                r1[r3] = r5
                if (r4 != r7) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L2d:
                int r3 = r3 + r8
                int r8 = r3 + (-10)
                r3 = r4
                r6 = r9
                r9 = r8
                r8 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.ResourceEvent.onTransact.c(short, int, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void f(int r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 55
                int r8 = 59 - r8
                int r7 = r7 * 55
                int r7 = r7 + 1
                byte[] r0 = com.datadog.android.rum.model.ResourceEvent.onTransact.$$d
                int r6 = r6 + 98
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r7
                r4 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                int r4 = r3 + 1
                byte r5 = (byte) r6
                r1[r3] = r5
                if (r4 != r7) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L24:
                r3 = r0[r8]
            L26:
                int r8 = r8 + 1
                int r6 = r6 + r3
                int r6 = r6 + (-2)
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.ResourceEvent.onTransact.f(int, int, int, java.lang.Object[]):void");
        }

        private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
            getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i3 = $10 + 63;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.getDefaultSize(0, 0) + 19472), 2623 - TextUtils.lastIndexOf("", '0', 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 14, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 39421), 481 - TextUtils.getOffsetBefore("", 0), 37 - View.MeasureSpec.getMode(0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr2 = new char[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 39421), 481 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 38 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i6 = $11 + 17;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            }
            objArr[0] = new String(cArr2);
            int i8 = $11 + 87;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 42 / 0;
            }
        }

        public onTransact(disconnect disconnectVar) {
            this.TuitionPaymentFragmentbindingInflater1 = disconnectVar;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onTransact(disconnect disconnectVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = d + 109;
                int i3 = i2 % 128;
                f737a = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 51;
                d = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                disconnectVar = null;
            }
            this(disconnectVar);
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$onTransact$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$onTransact$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$onTransact;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$onTransact;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static onTransact b(JsonObject p0) throws JsonParseException {
                disconnect disconnectVarTuitionPaymentFragmentbindingInflater1;
                JsonObject asJsonObject;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("viewport");
                    if (jsonElement == null || (asJsonObject = jsonElement.getAsJsonObject()) == null) {
                        disconnectVarTuitionPaymentFragmentbindingInflater1 = null;
                    } else {
                        disconnect.Companion companion = disconnect.INSTANCE;
                        disconnectVarTuitionPaymentFragmentbindingInflater1 = disconnect.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject);
                    }
                    return new onTransact(disconnectVarTuitionPaymentFragmentbindingInflater1);
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

        public final JsonElement TuitionPaymentFragmentbindingInflater1() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            JsonObject jsonObject = new JsonObject();
            disconnect disconnectVar = this.TuitionPaymentFragmentbindingInflater1;
            if (disconnectVar != null) {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("width", disconnectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                jsonObject2.addProperty("height", disconnectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                jsonObject.add("viewport", jsonObject2);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            int i2 = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char scrollBarSize = (char) (31533 - (ViewConfiguration.getScrollBarSize() >> 8));
                int iBlue = 921 - Color.blue(0);
                int packedPositionType = 28 - ExpandableListView.getPackedPositionType(0L);
                byte[] bArr = $$a;
                byte b = bArr[80];
                byte b2 = bArr[37];
                Object[] objArr2 = new Object[1];
                c(b, b2, b2, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, iBlue, packedPositionType, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            e(new char[]{16277, 27565, 38910, 49955, 28487, 39566, 50906, 29275, 40483, 51816, 30204, 41466, 52505, 31052, 42114, 53416, 31977, 43024, 54342, 32654, 43995, 55068}, 21560 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(new char[]{16273, 19981, 56511, 27451, 63955, 2168, 38638, 9397, 45881, 49576, 20554, 57063, 28001, 64264, 2487}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29076, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) (31533 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 922;
                int iAlpha = 28 - Color.alpha(0);
                byte[] bArr2 = $$a;
                Object[] objArr5 = new Object[1];
                c((byte) 52, bArr2[37], bArr2[80], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iIndexOf, iAlpha, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i3 = f737a + 89;
                d = i3 % 128;
                int i4 = i3 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char pressedStateDuration = (char) (31533 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    int mirror = AndroidCharacter.getMirror('0') + 873;
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 28;
                    byte b3 = $$a[80];
                    Object[] objArr6 = new Object[1];
                    c((byte) 37, b3, b3, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration, mirror, packedPositionGroup, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i5 = ((((-108639680) + ((~(1065175035 | iElapsedRealtime)) * (-301))) + (((~((-1062274811) | iElapsedRealtime)) | (~((~iElapsedRealtime) | 711804833))) * (-301))) + (((~(iElapsedRealtime | (-711804834))) | (-1062274811)) * 301)) - 1538148842;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                e(new char[]{16277, 63957, 45838, 28011, 9895, 57366, 39498, 21491, 3565, 51011, 32914, 47807, 29697, 11668, 59346, 41276, 23410, 5282, 52750, 34896, 16780, 31719, 13644, 61064, 43261, 25127}, 50767 - (Process.myPid() >> 22), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(new char[]{16279, 8114, 32736, 24351, 48989, 40805, 65202, 57040, 15900, 7759, 32358, 23980, 48627, 40194, 64842, 56672, 15531, 7417}, (ViewConfiguration.getEdgeSlop() >> 16) + 8243, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                e(new char[]{16286, 54268, 59216, 64174, 36478, 41365, 46563, 18757, 23771, 28779, 957, 5902, 11115, 16085, 53807, 58814}, TextUtils.getTrimmedLength("") + 60521, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                e(new char[]{16285, 36331, 23399, 10475, 63084, 17402, 4450, 57040, 44132, 31174, 51017, 38101, 25203, 12196, 64810, 19108}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 45690, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i8 = f737a + 95;
                d = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -1538148842};
                    byte[] bArr3 = $$d;
                    byte b4 = bArr3[0];
                    byte b5 = b4;
                    Object[] objArr13 = new Object[1];
                    f(b4, b5, b5, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b6 = bArr3[5];
                    byte b7 = b6;
                    Object[] objArr14 = new Object[1];
                    f(b6, b7, b7, objArr14);
                    objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31533);
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 922;
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 28;
                        byte b8 = $$a[80];
                        Object[] objArr15 = new Object[1];
                        c((byte) 37, b8, b8, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumDrawingCacheSize, bitsPerPixel, offsetBefore, -1142834547, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        e(new char[]{16277, 27565, 38910, 49955, 28487, 39566, 50906, 29275, 40483, 51816, 30204, 41466, 52505, 31052, 42114, 53416, 31977, 43024, 54342, 32654, 43995, 55068}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21558, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        e(new char[]{16273, 19981, 56511, 27451, 63955, 2168, 38638, 9397, 45881, 49576, 20554, 57063, 28001, 64264, 2487}, 29077 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cResolveSize = (char) (View.resolveSize(0, 0) + 31533);
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 921;
                            int mode = View.MeasureSpec.getMode(0) + 28;
                            byte[] bArr4 = $$a;
                            Object[] objArr18 = new Object[1];
                            c((byte) 52, bArr4[37], bArr4[80], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSize, iMakeMeasureSpec, mode, -778300370, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char pressedStateDuration2 = (char) (31533 - (ViewConfiguration.getPressedStateDuration() >> 16));
                            int scrollBarFadeDuration = 921 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 28;
                            byte[] bArr5 = $$a;
                            byte b9 = bArr5[80];
                            byte b10 = bArr5[37];
                            Object[] objArr19 = new Object[1];
                            c(b9, b10, b10, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration2, scrollBarFadeDuration, maxKeyCode, -1048449946, false, (String) objArr19[0], null);
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
            }
            if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
                int i10 = f737a + 7;
                d = i10 % 128;
                int i11 = i10 % 2;
                int i12 = ((int[]) objArr[0])[0];
                Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                int i13 = i12 + 2139271263 + ((~((~iElapsedRealtime2) | 1740111515)) * (-116)) + ((35025040 | iElapsedRealtime2) * 116) + (((~(iElapsedRealtime2 | (-1739054604))) | 33968128) * 116);
                int i14 = (i13 << 13) ^ i13;
                int i15 = i14 ^ (i14 >>> 17);
                ((int[]) objArr20[0])[0] = i15 ^ (i15 << 5);
                return jsonObject;
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr == null) {
                throw null;
            }
            int i16 = d + 17;
            int i17 = i16 % 128;
            f737a = i17;
            int i18 = i16 % 2;
            int i19 = i17 + 35;
            d = i19 % 128;
            int i20 = i19 % 2;
            while (i2 < strArr.length) {
                arrayList.add(strArr[i2]);
                i2++;
                int i21 = f737a + 123;
                d = i21 % 128;
                int i22 = i21 % 2;
            }
            throw null;
        }

        static {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            INSTANCE = new Companion(null);
            int i = TuitionPaymentFragmentbindingInflater1 + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public onTransact() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object p0) {
            int i = 2 % 2;
            if (this == p0) {
                int i2 = f737a + 39;
                d = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (p0 instanceof onTransact) {
                return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, ((onTransact) p0).TuitionPaymentFragmentbindingInflater1);
            }
            int i4 = f737a + 5;
            d = i4 % 128;
            return i4 % 2 == 0;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = f737a + 113;
            int i3 = i2 % 128;
            d = i3;
            int i4 = i2 % 2;
            disconnect disconnectVar = this.TuitionPaymentFragmentbindingInflater1;
            if (disconnectVar != null) {
                return disconnectVar.hashCode();
            }
            int i5 = i3 + 59;
            f737a = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public final String toString() {
            int i = 2 % 2;
            disconnect disconnectVar = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("onTransact(TuitionPaymentFragmentbindingInflater1=");
            sb.append(disconnectVar);
            sb.append(")");
            String string = sb.toString();
            int i2 = d + 5;
            f737a = i2 % 128;
            if (i2 % 2 == 0) {
                return string;
            }
            throw null;
        }

        static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 5688442818657228527L;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$IconCompatParcelizer;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        final String TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public String b;

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$IconCompatParcelizer$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$IconCompatParcelizer$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$IconCompatParcelizer;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$IconCompatParcelizer;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private static final byte[] $$c = {114, -59, 10, 31};
            private static final int $$d = 136;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {55, -64, 35, -71, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
            private static final int $$b = 199;
            private static int b = 0;
            private static int asBinder = 1;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 44377;
            private static char TuitionPaymentFragmentbindingInflater1 = 30531;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 26421;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 20207;

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(int r6, byte r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 * 4
                    int r8 = r8 + 84
                    byte[] r0 = com.datadog.android.rum.model.ResourceEvent.IconCompatParcelizer.Companion.$$a
                    int r7 = r7 + 4
                    int r6 = r6 * 3
                    int r6 = r6 + 53
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r8
                    r5 = r2
                    r8 = r6
                    goto L29
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r8
                    int r5 = r3 + 1
                    r1[r3] = r4
                    int r7 = r7 + 1
                    if (r5 != r6) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L27:
                    r3 = r0[r7]
                L29:
                    int r8 = r8 + r3
                    int r8 = r8 + (-11)
                    r3 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.ResourceEvent.IconCompatParcelizer.Companion.c(int, byte, byte, java.lang.Object[]):void");
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
                char[] cArr2 = new char[cArr.length - 2];
                oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
                char[] cArr3 = new char[2];
                while (true) {
                    int i3 = 0;
                    if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                        objArr[0] = new String(cArr2, 0, i);
                        int i4 = $10 + 95;
                        $11 = i4 % 128;
                        int i5 = i4 % 2;
                        return;
                    }
                    int i6 = $10 + 93;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    char c = 1;
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    int i8 = $11 + 29;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = 58224;
                    int i11 = 0;
                    while (i11 < 16) {
                        char c2 = cArr3[c];
                        char c3 = cArr3[i3];
                        int i12 = (c3 + i10) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)));
                        int i13 = c3 >>> 5;
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            objArr2[2] = Integer.valueOf(i13);
                            objArr2[c] = Integer.valueOf(i12);
                            objArr2[i3] = Integer.valueOf(c2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 47773);
                                int i14 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 467;
                                int iIndexOf = 13 - TextUtils.indexOf("", "", i3, i3);
                                Class[] clsArr = new Class[4];
                                clsArr[i3] = Integer.TYPE;
                                clsArr[c] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop, i14, iIndexOf, -2007001706, false, "o", clsArr);
                            }
                            char cCharValue = ((Character) ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            cArr3[c] = cCharValue;
                            Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i10) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getPressedStateDuration() >> 16)), Process.getGidForName("") + 469, 13 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            i10 -= 40503;
                            i11++;
                            c = 1;
                            i3 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
                    Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 2323 - View.getDefaultSize(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 44, -1312321721, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
            }

            private Companion() {
            }

            @JvmStatic
            public final IconCompatParcelizer TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws Throwable {
                String asString;
                String str;
                String str2;
                String asString2;
                int i;
                int i2;
                String str3;
                int i3 = 2 % 2;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString3 = p0.get("id").getAsString();
                    JsonElement jsonElement = p0.get("referrer");
                    if (jsonElement != null) {
                        int i4 = b + 15;
                        asBinder = i4 % 128;
                        int i5 = i4 % 2;
                        asString = jsonElement.getAsString();
                    } else {
                        asString = null;
                    }
                    String asString4 = p0.get(ImagesContract.URL).getAsString();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 46400), (Process.myPid() >> 22) + 40, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                    Object[] objArr = new Object[1];
                    a(new char[]{40614, 54972, 10121, 13978, 24809, 57982, 43501, 33275, 25292, 30783, 52874, 6923, 24953, 42926, 29678, 63654, 34684, 13835, 61215, 54124, 45189, 24919, 52261, 60886}, 22 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
                    Class<?> cls = Class.forName((String) objArr[0]);
                    Object[] objArr2 = new Object[1];
                    a(new char[]{44961, 53263, 32057, 57146, 27582, 25724, 58542, 48363, 42394, 30361, 59958, 29751, 35545, 8501, 29700, 45371, 35666, 27674}, 14 - TextUtils.indexOf((CharSequence) "", '0'), objArr2);
                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
                    long j = -560;
                    long jUptimeMillis = (int) SystemClock.uptimeMillis();
                    String str4 = "";
                    long j2 = -1;
                    long j3 = jUptimeMillis ^ j2;
                    long j4 = (((long) (-559)) * 2419265429665401367L) + (((long) 561) * (-322008254923442380L)) + (((j3 | 2419265429665401367L) ^ j2) * j) + (j * ((((j2 ^ (-322008254923442380L)) | 2419265429665401367L) | jUptimeMillis) ^ j2)) + (((long) 560) * (((j3 | (-322008254923442380L)) ^ j2) | (((j2 ^ 2419265429665401367L) | (-322008254923442380L)) ^ j2)));
                    int i7 = 0;
                    while (true) {
                        int i8 = 8;
                        if (i7 != 10) {
                            int i9 = asBinder + 85;
                            b = i9 % 128;
                            if (i9 % 2 != 0) {
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    str3 = str4;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 59, 18 - TextUtils.getOffsetAfter(str3, 0), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                                } else {
                                    str3 = str4;
                                }
                                i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                                str = str3;
                                i2 = 1;
                            } else {
                                str = str4;
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - Drawable.resolveOpacity(0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 59, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 17, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                                }
                                i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
                                i2 = 0;
                            }
                            while (true) {
                                int i10 = asBinder + 123;
                                b = i10 % 128;
                                if (i10 % 2 != 0) {
                                    int i11 = 2 / 2;
                                }
                                int i12 = 0;
                                while (i12 != i8) {
                                    i = (((((int) (jLongValue >> i12)) & 255) + (i << 6)) + (i << 16)) - i;
                                    i12++;
                                    i2 = i2;
                                    i8 = 8;
                                }
                                int i13 = i2;
                                if (i13 != 0) {
                                    break;
                                }
                                i2 = i13 + 1;
                                jLongValue = j4;
                                i8 = 8;
                            }
                            if (i != i6) {
                                jLongValue -= 1024;
                                i7++;
                                str4 = str;
                            }
                        } else {
                            str = str4;
                            Object[] objArr3 = new Object[1];
                            a(new char[]{4728, 3299, 733, 14924, 33644, 3664, 2571, 21017, 42026, 27437, 29400, 51083, 47372, 53100, 35170, 56943, 27439, 35452}, 16 - ExpandableListView.getPackedPositionType(0L), objArr3);
                            Class<?> cls2 = Class.forName((String) objArr3[0]);
                            Object[] objArr4 = new Object[1];
                            a(new char[]{6360, 60947, 40424, 2303, 20487, 59153, 276, 65105, 2793, 23624, 11739, 50325, 22631, 53219, 1661, 42997, 27647, 65100}, 16 - ((Process.getThreadPriority(0) + 20) >> 6), objArr4);
                            int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                            try {
                                Object[] objArr5 = {-1981876368};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 46038), View.resolveSizeAndState(0, 0, 0) + 1134, 18 - Gravity.getAbsoluteGravity(0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                                }
                                try {
                                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -1987938638, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr5), false};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
                                        int edgeSlop = 15 - (ViewConfiguration.getEdgeSlop() >> 16);
                                        byte[] bArr = $$a;
                                        byte b2 = bArr[7];
                                        Object[] objArr7 = new Object[1];
                                        c(b2, bArr[5], b2, objArr7);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, keyRepeatTimeout, edgeSlop, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1116, Color.red(0) + 17), Boolean.TYPE});
                                    }
                                    Object[] objArr8 = (Object[]) ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                                    int i14 = ((int[]) objArr8[1])[0];
                                    int i15 = ((int[]) objArr8[3])[0];
                                    if (i15 != i14) {
                                        ArrayList arrayList = new ArrayList();
                                        String[] strArr = (String[]) objArr8[0];
                                        if (strArr != null) {
                                            for (String str5 : strArr) {
                                                int i16 = asBinder + 71;
                                                b = i16 % 128;
                                                int i17 = i16 % 2;
                                                arrayList.add(str5);
                                            }
                                        }
                                        int[] iArr = new int[i15];
                                        int i18 = i15 - 1;
                                        iArr[i18] = 1;
                                        int i19 = iArr[((i15 * i18) % 2) - 1];
                                        str2 = null;
                                        Toast.makeText((Context) null, i19, 1).show();
                                        break;
                                    }
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        }
                        str2 = null;
                        break;
                    }
                    JsonElement jsonElement2 = p0.get("name");
                    if (jsonElement2 != null) {
                        int i20 = asBinder + 97;
                        b = i20 % 128;
                        int i21 = i20 % 2;
                        asString2 = jsonElement2.getAsString();
                        int i22 = b + 125;
                        asBinder = i22 % 128;
                        int i23 = i22 % 2;
                    } else {
                        asString2 = str2;
                    }
                    Intrinsics.checkNotNullExpressionValue(asString3, str);
                    Intrinsics.checkNotNullExpressionValue(asString4, str);
                    return new IconCompatParcelizer(asString3, asString, asString4, asString2);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type ResourceEventView", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type ResourceEventView", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type ResourceEventView", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
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
            private static java.lang.String $$e(short r6, int r7, byte r8) {
                /*
                    int r8 = r8 * 4
                    int r8 = r8 + 1
                    int r6 = r6 * 3
                    int r6 = 4 - r6
                    int r7 = r7 * 4
                    int r7 = 108 - r7
                    byte[] r0 = com.datadog.android.rum.model.ResourceEvent.IconCompatParcelizer.Companion.$$c
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r7
                    r7 = r8
                    r4 = r2
                    goto L27
                L17:
                    r3 = r2
                L18:
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    if (r4 != r8) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L25:
                    r3 = r0[r6]
                L27:
                    int r7 = r7 + r3
                    int r6 = r6 + 1
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.ResourceEvent.IconCompatParcelizer.Companion.$$e(short, int, byte):java.lang.String");
            }
        }

        public IconCompatParcelizer(String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.b = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str4;
        }

        public /* synthetic */ IconCompatParcelizer(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, iconCompatParcelizer.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, iconCompatParcelizer.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, iconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, iconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentbindingInflater1.hashCode();
            String str = this.b;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            int iHashCode3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentbindingInflater1;
            String str2 = this.b;
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("IconCompatParcelizer(TuitionPaymentFragmentbindingInflater1=");
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
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static ResourceEvent TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws Throwable {
            ResourceEventSource resourceEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            getExtras getextrasTuitionPaymentFragmentbindingInflater1;
            g gVarTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            onTransact ontransactB;
            getNotifyChildrenChangedOptions getnotifychildrenchangedoptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1B;
            INotificationSideChannelStubProxy iNotificationSideChannelStubProxyB;
            notify notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            INotificationSideChannel iNotificationSideChannelB;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3B;
            asInterface asinterfaceTuitionPaymentFragmentspecialinlinedviewModeldefault1;
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
                b.Companion companion = b.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject11, "");
                b bVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = b.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject11);
                JsonElement jsonElement = p0.get(NotificationCompat.CATEGORY_SERVICE);
                String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                JsonElement jsonElement2 = p0.get("version");
                String asString3 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                JsonElement jsonElement3 = p0.get("build_version");
                String asString4 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                JsonElement jsonElement4 = p0.get("build_id");
                String asString5 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                JsonObject asJsonObject12 = p0.get("session").getAsJsonObject();
                connect.Companion companion2 = connect.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject12, "");
                connect connectVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = connect.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject12);
                JsonElement jsonElement5 = p0.get("source");
                if (jsonElement5 == null || (asString = jsonElement5.getAsString()) == null) {
                    resourceEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                } else {
                    ResourceEventSource.Companion companion3 = ResourceEventSource.INSTANCE;
                    resourceEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ResourceEventSource.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asString);
                }
                JsonObject asJsonObject13 = p0.get("view").getAsJsonObject();
                IconCompatParcelizer.Companion companion4 = IconCompatParcelizer.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject13, "");
                IconCompatParcelizer iconCompatParcelizerTuitionPaymentFragmentbindingInflater1 = companion4.TuitionPaymentFragmentbindingInflater1(asJsonObject13);
                JsonElement jsonElement6 = p0.get("usr");
                if (jsonElement6 == null || (asJsonObject10 = jsonElement6.getAsJsonObject()) == null) {
                    getextrasTuitionPaymentFragmentbindingInflater1 = null;
                } else {
                    getExtras.Companion companion5 = getExtras.INSTANCE;
                    getextrasTuitionPaymentFragmentbindingInflater1 = getExtras.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject10);
                }
                JsonElement jsonElement7 = p0.get("connectivity");
                if (jsonElement7 == null || (asJsonObject9 = jsonElement7.getAsJsonObject()) == null) {
                    gVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                } else {
                    g.Companion companion6 = g.INSTANCE;
                    gVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = g.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject9);
                }
                JsonElement jsonElement8 = p0.get(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
                if (jsonElement8 == null || (asJsonObject8 = jsonElement8.getAsJsonObject()) == null) {
                    ontransactB = null;
                } else {
                    onTransact.Companion companion7 = onTransact.INSTANCE;
                    ontransactB = onTransact.Companion.b(asJsonObject8);
                }
                JsonElement jsonElement9 = p0.get("synthetics");
                if (jsonElement9 == null || (asJsonObject7 = jsonElement9.getAsJsonObject()) == null) {
                    getnotifychildrenchangedoptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                } else {
                    getNotifyChildrenChangedOptions.Companion companion8 = getNotifyChildrenChangedOptions.INSTANCE;
                    getnotifychildrenchangedoptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getNotifyChildrenChangedOptions.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject7);
                }
                JsonElement jsonElement10 = p0.get("ci_test");
                if (jsonElement10 == null || (asJsonObject6 = jsonElement10.getAsJsonObject()) == null) {
                    tuitionPaymentFragmentbindingInflater1B = null;
                } else {
                    TuitionPaymentFragmentbindingInflater1.Companion companion9 = TuitionPaymentFragmentbindingInflater1.INSTANCE;
                    tuitionPaymentFragmentbindingInflater1B = TuitionPaymentFragmentbindingInflater1.Companion.b(asJsonObject6);
                }
                JsonElement jsonElement11 = p0.get("os");
                if (jsonElement11 == null || (asJsonObject5 = jsonElement11.getAsJsonObject()) == null) {
                    iNotificationSideChannelStubProxyB = null;
                } else {
                    INotificationSideChannelStubProxy.Companion companion10 = INotificationSideChannelStubProxy.INSTANCE;
                    iNotificationSideChannelStubProxyB = INotificationSideChannelStubProxy.Companion.b(asJsonObject5);
                }
                JsonElement jsonElement12 = p0.get("device");
                if (jsonElement12 == null || (asJsonObject4 = jsonElement12.getAsJsonObject()) == null) {
                    notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                } else {
                    notify.Companion companion11 = notify.INSTANCE;
                    notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = notify.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject4);
                }
                JsonObject asJsonObject14 = p0.get("_dd").getAsJsonObject();
                cancelAll.Companion companion12 = cancelAll.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject14, "");
                cancelAll cancelallTuitionPaymentFragmentspecialinlinedviewModeldefault2 = cancelAll.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject14);
                JsonElement jsonElement13 = p0.get("context");
                if (jsonElement13 == null || (asJsonObject3 = jsonElement13.getAsJsonObject()) == null) {
                    iNotificationSideChannelB = null;
                } else {
                    INotificationSideChannel.Companion companion13 = INotificationSideChannel.INSTANCE;
                    iNotificationSideChannelB = INotificationSideChannel.Companion.b(asJsonObject3);
                }
                JsonElement jsonElement14 = p0.get("action");
                if (jsonElement14 == null || (asJsonObject2 = jsonElement14.getAsJsonObject()) == null) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3B = null;
                } else {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3.Companion companion14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE;
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3B = TuitionPaymentFragmentspecialinlinedviewModeldefault3.Companion.b(asJsonObject2);
                }
                JsonElement jsonElement15 = p0.get("container");
                if (jsonElement15 == null || (asJsonObject = jsonElement15.getAsJsonObject()) == null) {
                    asinterfaceTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                } else {
                    asInterface.Companion companion15 = asInterface.INSTANCE;
                    asinterfaceTuitionPaymentFragmentspecialinlinedviewModeldefault1 = asInterface.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject);
                }
                String asString6 = p0.get("type").getAsString();
                JsonObject asJsonObject15 = p0.get("resource").getAsJsonObject();
                MediaBrowserCompat.Companion companion16 = MediaBrowserCompat.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(asJsonObject15, "");
                MediaBrowserCompat mediaBrowserCompatB = MediaBrowserCompat.Companion.b(asJsonObject15);
                if (!Intrinsics.areEqual(asString6, "resource")) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                return new ResourceEvent(asLong, bVarTuitionPaymentFragmentspecialinlinedviewModeldefault3, asString2, asString3, asString4, asString5, connectVarTuitionPaymentFragmentspecialinlinedviewModeldefault2, resourceEventSourceTuitionPaymentFragmentspecialinlinedviewModeldefault1, iconCompatParcelizerTuitionPaymentFragmentbindingInflater1, getextrasTuitionPaymentFragmentbindingInflater1, gVarTuitionPaymentFragmentspecialinlinedviewModeldefault3, ontransactB, getnotifychildrenchangedoptionsTuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentbindingInflater1B, iNotificationSideChannelStubProxyB, notifyVarTuitionPaymentFragmentspecialinlinedviewModeldefault3, cancelallTuitionPaymentFragmentspecialinlinedviewModeldefault2, iNotificationSideChannelB, tuitionPaymentFragmentspecialinlinedviewModeldefault3B, asinterfaceTuitionPaymentFragmentspecialinlinedviewModeldefault1, mediaBrowserCompatB);
            } catch (IllegalStateException e2) {
                throw new JsonParseException("Unable to parse json into type ResourceEvent", e2);
            } catch (NullPointerException e3) {
                throw new JsonParseException("Unable to parse json into type ResourceEvent", e3);
            } catch (NumberFormatException e4) {
                throw new JsonParseException("Unable to parse json into type ResourceEvent", e4);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int length2;
        int[] iArr3;
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = IconCompatParcelizer;
        int i3 = -1870535734;
        char c = 3;
        int i4 = 1;
        int i5 = 0;
        if (iArr4 != null) {
            int i6 = $10 + 63;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length2 = iArr4.length;
                iArr3 = new int[length2];
            } else {
                length2 = iArr4.length;
                iArr3 = new int[length2];
            }
            int i7 = 0;
            while (i7 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr4[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int iMakeMeasureSpec = 3291 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 31;
                        byte b2 = $$c[c];
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, iMakeMeasureSpec, jumpTapTimeout, 1948206109, false, $$g(b3, b3, (byte) (-b2)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i7++;
                    i3 = -1870535734;
                    c = 3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr3;
        }
        int length3 = iArr4.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = IconCompatParcelizer;
        if (iArr6 != null) {
            int i8 = $10 + 37;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i9 = 0;
            while (i9 < length) {
                Object[] objArr3 = new Object[i4];
                objArr3[i5] = Integer.valueOf(iArr6[i9]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char size = (char) View.MeasureSpec.getSize(i5);
                    int i10 = 3292 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int iMakeMeasureSpec2 = 31 - View.MeasureSpec.makeMeasureSpec(i5, i5);
                    byte b4 = $$c[3];
                    byte b5 = (byte) (b4 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(size, i10, iMakeMeasureSpec2, 1948206109, false, $$g(b5, b5, (byte) (-b4)), new Class[]{Integer.TYPE});
                }
                iArr2[i9] = ((Integer) ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i9++;
                i4 = 1;
                i5 = 0;
            }
            iArr6 = iArr2;
        }
        int i11 = i5;
        System.arraycopy(iArr6, i11, iArr5, i11, length3);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i12 = 17;
            while (i12 > 1) {
                int i13 = $11 + 61;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i12];
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                        int i14 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2559;
                        int i15 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29;
                        byte b6 = (byte) ($$c[3] + 1);
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, i14, i15, 683220507, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i12 += 114;
                } else {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i12];
                    try {
                        Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 2560;
                            int iMyTid = 29 - (Process.myTid() >> 22);
                            byte b8 = (byte) ($$c[3] + 1);
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, iLastIndexOf, iMyTid, 683220507, false, $$g(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((java.lang.reflect.Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                        i12--;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 28880), 349 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 24 - ExpandableListView.getPackedPositionChild(0L), -30507727, false, "G", new Class[]{Object.class});
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
        }
        objArr[0] = new String(cArr2, 0, i);
        int i18 = $10 + 95;
        $11 = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 45 / 0;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$b;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public b(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((b) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("b(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$b$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$b$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$b;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$b;"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$connect;", "", "", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;", "p1", "", "p2", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;Ljava/lang/Boolean;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/Boolean;", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class connect {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        final Boolean b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        final ResourceEventSessionType TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        final String TuitionPaymentFragmentbindingInflater1;

        public connect(String str, ResourceEventSessionType resourceEventSessionType, Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(resourceEventSessionType, "");
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = resourceEventSessionType;
            this.b = bool;
        }

        public /* synthetic */ connect(String str, ResourceEventSessionType resourceEventSessionType, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, resourceEventSessionType, (i & 4) != 0 ? null : bool);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof connect)) {
                return false;
            }
            connect connectVar = (connect) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, connectVar.TuitionPaymentFragmentbindingInflater1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == connectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && Intrinsics.areEqual(this.b, connectVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentbindingInflater1.hashCode();
            int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
            Boolean bool = this.b;
            return (((iHashCode * 31) + iHashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentbindingInflater1;
            ResourceEventSessionType resourceEventSessionType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Boolean bool = this.b;
            StringBuilder sb = new StringBuilder("connect(TuitionPaymentFragmentbindingInflater1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(resourceEventSessionType);
            sb.append(", b=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$connect$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$connect$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$connect;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$connect;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static connect TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("id").getAsString();
                    ResourceEventSessionType.Companion companion = ResourceEventSessionType.INSTANCE;
                    String asString2 = p0.get("type").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString2, "");
                    ResourceEventSessionType resourceEventSessionTypeTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ResourceEventSessionType.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asString2);
                    JsonElement jsonElement = p0.get("has_replay");
                    Boolean boolValueOf = jsonElement != null ? Boolean.valueOf(jsonElement.getAsBoolean()) : null;
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new connect(asString, resourceEventSessionTypeTuitionPaymentFragmentspecialinlinedviewModeldefault1, boolValueOf);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type ResourceEventSession", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type ResourceEventSession", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type ResourceEventSession", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public final JsonElement TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("date", Long.valueOf(this.asBinder));
        b bVar = this.TuitionPaymentFragmentbindingInflater1;
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("id", bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        jsonObject.add("application", jsonObject2);
        String str = this.cancel;
        if (str != null) {
            jsonObject.addProperty(NotificationCompat.CATEGORY_SERVICE, str);
        }
        String str2 = this.write;
        if (str2 != null) {
            jsonObject.addProperty("version", str2);
        }
        String str3 = this.b;
        if (str3 != null) {
            jsonObject.addProperty("build_version", str3);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
            int edgeSlop = 2267 - (ViewConfiguration.getEdgeSlop() >> 16);
            int i2 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[40], bArr[5], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, edgeSlop, i2, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{-842750360, -1385959271, 940708220, 1039963612, 1670106532, -589102905, -1405785839, -1038681884, -2019265306, -987158081, -265071754, 2099427945, -578219325, 2121956411}, 22 - TextUtils.indexOf("", "", 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{456695788, -1568100008, -1894685337, 689123645, 349287590, -2121450893, -581851824, -1870852251, 1548696616, 1767847366}, 14 - Process.getGidForName(""), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int iIndexOf = 2267 - TextUtils.indexOf("", "", 0);
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 33;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[5];
            Object[] objArr5 = new Object[1];
            c(b2, b2, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop, iIndexOf, pressedStateDuration, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = getRoot + 65;
            getNotifyChildrenChangedOptions = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 2267;
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 34;
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                c(b3, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetBefore, maxKeyCode, iLastIndexOf, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[0])[0];
            int i6 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = 978872498 + (((~((-17301617) | iIdentityHashCode)) | (~(791411699 | iIdentityHashCode))) * 69) + (((~(iIdentityHashCode | 185262960)) | (~((-623450356) | iIdentityHashCode)) | 606148739) * (-69)) + 929484784;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
            c = 3;
        } else {
            Object[] objArr8 = new Object[1];
            e(new int[]{538449404, 568968312, 1007651930, 1588652413, 315429698, -1549429510, -1443621463, -2084226520, -1445151228, -1087404207, -1220290449, 75866318, -2107337776, -1172044938, 143623110, -171581741}, 27 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new int[]{-5575905, -1711897312, -1132834455, -483402658, -854418598, -1368059204, 1789027873, 609378262, -752987677, 2000420646, -1920792555, -260951955}, 17 - ImageFormat.getBitsPerPixel(0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(new int[]{-527973867, 1631832365, 1012136618, 558205933, -1076107419, 1650300702, -2134142241, -580631257, -853712899, -1003141059}, 16 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new int[]{-1960581111, 330517888, 1885696069, -485016849, -1935085628, -731019250, -919031344, 796644151, -366428837, -917816419}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i10 = getRoot + 55;
            getNotifyChildrenChangedOptions = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -2069913360};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[12];
                Object[] objArr13 = new Object[1];
                f(b5, bArr3[130], b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr3[130];
                Object[] objArr14 = new Object[1];
                f(b6, bArr3[12], b6, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i12 = getNotifyChildrenChangedOptions + 73;
                    getRoot = i12 % 128;
                    int i13 = i12 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2267;
                        int i14 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 33;
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr16 = new Object[1];
                        c(b7, b8, b8, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumDrawingCacheSize, jumpTapTimeout, i14, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(new int[]{-842750360, -1385959271, 940708220, 1039963612, 1670106532, -589102905, -1405785839, -1038681884, -2019265306, -987158081, -265071754, 2099427945, -578219325, 2121956411}, TextUtils.lastIndexOf("", '0', 0) + 23, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(new int[]{456695788, -1568100008, -1894685337, 689123645, 349287590, -2121450893, -581851824, -1870852251, 1548696616, 1767847366}, 15 - TextUtils.getOffsetBefore("", 0), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2267;
                            int iMakeMeasureSpec = 33 - View.MeasureSpec.makeMeasureSpec(0, 0);
                            byte[] bArr4 = $$a;
                            byte b9 = bArr4[5];
                            Object[] objArr19 = new Object[1];
                            c(b9, b9, bArr4[7], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, keyRepeatTimeout, iMakeMeasureSpec, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char size = (char) View.MeasureSpec.getSize(0);
                            int defaultSize = 2267 - View.getDefaultSize(0, 0);
                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 33;
                            byte[] bArr5 = $$a;
                            Object[] objArr20 = new Object[1];
                            c(bArr5[40], bArr5[5], bArr5[7], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(size, defaultSize, iResolveSizeAndState, -887667012, false, (String) objArr20[0], null);
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
        if (((int[]) objArr[0])[0] != ((int[]) objArr[c])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[1];
            if (strArr2 != null) {
                for (String str4 : strArr2) {
                    arrayList.add(str4);
                }
            }
            throw null;
        }
        Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i15 = ((int[]) objArr[2])[0];
        int i16 = ((int[]) objArr[0])[0];
        int i17 = ((int[]) objArr[3])[0];
        String[] strArr3 = (String[]) objArr[1];
        int iMyTid = Process.myTid();
        int i18 = i15 + (-1153688157) + (((~((-481154429) | iMyTid)) | 277087332) * 576) + (((~((~iMyTid) | (-204067097))) | 50471555) * 576) + 688513280;
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr21[2])[0] = i20 ^ (i20 << 5);
        String str5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (str5 != null) {
            jsonObject.addProperty("build_id", str5);
        }
        int i21 = ((int[]) objArr21[2])[0];
        int i22 = i21 * i21;
        int i23 = -(1845206878 * i21);
        int i24 = (i22 & i23) + (i22 | i23);
        int i25 = -(i21 * 1831907478);
        int i26 = (i24 & i25) + (i25 | i24);
        int i27 = ((i26 | (-1019863004)) << 1) - ((-1019863004) ^ i26);
        int i28 = i27 >> 24;
        int i29 = i27 >> 15;
        int i30 = -(((i27 - (~((((i28 & (-511)) + (i28 | (-511))) / 256) + 1))) - 1) ^ (((((-262143) ^ i29) + ((i29 & (-262143)) << 1)) / 131072) + 1));
        int i31 = (i30 ^ 6) + ((i30 & 6) << 1);
        int i32 = i31 >> 29;
        int i33 = ((((i32 | (-15)) << 1) - (i32 ^ (-15))) / 8) + 1;
        String strSubstring = "10;5;15;27;6;session".substring(109278 / (((-(((i33 | 1) << 1) - (i33 ^ 1))) & i31) * 1401));
        connect connectVar = this.INotificationSideChannelDefault;
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("id", connectVar.TuitionPaymentFragmentbindingInflater1);
        jsonObject3.add("type", new JsonPrimitive(connectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3.jsonValue));
        Boolean bool = connectVar.b;
        if (bool != null) {
            jsonObject3.addProperty("has_replay", Boolean.valueOf(bool.booleanValue()));
        }
        jsonObject.add(strSubstring, jsonObject3);
        ResourceEventSource resourceEventSource = this.INotificationSideChannelStub;
        if (resourceEventSource != null) {
            jsonObject.add("source", new JsonPrimitive(resourceEventSource.jsonValue));
        }
        IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
        JsonObject jsonObject4 = new JsonObject();
        jsonObject4.addProperty("id", iconCompatParcelizer.TuitionPaymentFragmentbindingInflater1);
        String str6 = iconCompatParcelizer.b;
        if (str6 != null) {
            jsonObject4.addProperty("referrer", str6);
        }
        jsonObject4.addProperty(ImagesContract.URL, iconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        String str7 = iconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (str7 != null) {
            jsonObject4.addProperty("name", str7);
        }
        jsonObject.add("view", jsonObject4);
        getExtras getextras = this.RemoteActionCompatParcelizer;
        if (getextras != null) {
            jsonObject.add("usr", getextras.b());
        }
        g gVar = this.d;
        if (gVar != null) {
            int i34 = getNotifyChildrenChangedOptions + 95;
            getRoot = i34 % 128;
            int i35 = i34 % 2;
            jsonObject.add("connectivity", gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
        onTransact ontransact = this.cancelAll;
        if (ontransact != null) {
            jsonObject.add(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, ontransact.TuitionPaymentFragmentbindingInflater1());
        }
        getNotifyChildrenChangedOptions getnotifychildrenchangedoptions = this.INotificationSideChannelStubProxy;
        if (getnotifychildrenchangedoptions != null) {
            JsonObject jsonObject5 = new JsonObject();
            jsonObject5.addProperty("test_id", getnotifychildrenchangedoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            jsonObject5.addProperty("result_id", getnotifychildrenchangedoptions.TuitionPaymentFragmentbindingInflater1);
            Boolean bool2 = getnotifychildrenchangedoptions.b;
            if (bool2 != null) {
                jsonObject5.addProperty("injected", Boolean.valueOf(bool2.booleanValue()));
            }
            jsonObject.add("synthetics", jsonObject5);
        }
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            JsonObject jsonObject6 = new JsonObject();
            jsonObject6.addProperty("test_execution_id", tuitionPaymentFragmentbindingInflater1.b);
            jsonObject.add("ci_test", jsonObject6);
        }
        INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = this.onTransact;
        if (iNotificationSideChannelStubProxy != null) {
            JsonObject jsonObject7 = new JsonObject();
            jsonObject7.addProperty("name", iNotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            jsonObject7.addProperty("version", iNotificationSideChannelStubProxy.b);
            String str8 = iNotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str8 != null) {
                jsonObject7.addProperty("build", str8);
            }
            jsonObject7.addProperty("version_major", iNotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            jsonObject.add("os", jsonObject7);
        }
        notify notifyVar = this.INotificationSideChannel;
        if (notifyVar != null) {
            JsonObject jsonObject8 = new JsonObject();
            jsonObject8.add("type", new JsonPrimitive(notifyVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.jsonValue));
            String str9 = notifyVar.TuitionPaymentFragmentbindingInflater1;
            if (str9 != null) {
                jsonObject8.addProperty("name", str9);
            }
            String str10 = notifyVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str10 != null) {
                jsonObject8.addProperty("model", str10);
            }
            String str11 = notifyVar.b;
            if (str11 != null) {
                jsonObject8.addProperty("brand", str11);
            }
            String str12 = notifyVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str12 != null) {
                jsonObject8.addProperty("architecture", str12);
            }
            jsonObject.add("device", jsonObject8);
        }
        cancelAll cancelall = this.g;
        JsonObject jsonObject9 = new JsonObject();
        jsonObject9.addProperty("format_version", Long.valueOf(cancelall.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
        cancel cancelVar = cancelall.g;
        if (cancelVar != null) {
            JsonObject jsonObject10 = new JsonObject();
            Plan plan = cancelVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (plan != null) {
                jsonObject10.add("plan", new JsonPrimitive(plan.jsonValue));
            }
            SessionPrecondition sessionPrecondition = cancelVar.TuitionPaymentFragmentbindingInflater1;
            if (sessionPrecondition != null) {
                jsonObject10.add("session_precondition", new JsonPrimitive(sessionPrecondition.jsonValue));
            }
            jsonObject9.add("session", jsonObject10);
        }
        d dVar = cancelall.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (dVar != null) {
            JsonObject jsonObject11 = new JsonObject();
            jsonObject11.addProperty("session_sample_rate", dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            Number number = dVar.b;
            if (number != null) {
                jsonObject11.addProperty("session_replay_sample_rate", number);
            }
            jsonObject9.add("configuration", jsonObject11);
        }
        String str13 = cancelall.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (str13 != null) {
            int i36 = getNotifyChildrenChangedOptions + 121;
            getRoot = i36 % 128;
            int i37 = i36 % 2;
            jsonObject9.addProperty("browser_sdk_version", str13);
        }
        String str14 = cancelall.a;
        if (str14 != null) {
            jsonObject9.addProperty("span_id", str14);
        }
        String str15 = cancelall.asInterface;
        if (str15 != null) {
            jsonObject9.addProperty("trace_id", str15);
        }
        Number number2 = cancelall.TuitionPaymentFragmentbindingInflater1;
        if (number2 != null) {
            jsonObject9.addProperty("rule_psr", number2);
        }
        Boolean bool3 = cancelall.b;
        if (bool3 != null) {
            jsonObject9.addProperty("discarded", Boolean.valueOf(bool3.booleanValue()));
        }
        jsonObject.add("_dd", jsonObject9);
        INotificationSideChannel iNotificationSideChannel = this.asInterface;
        if (iNotificationSideChannel != null) {
            jsonObject.add("context", iNotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            jsonObject.add("action", tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
        asInterface asinterface = this.a;
        if (asinterface != null) {
            JsonObject jsonObject12 = new JsonObject();
            asBinder asbinder = asinterface.TuitionPaymentFragmentbindingInflater1;
            JsonObject jsonObject13 = new JsonObject();
            jsonObject13.addProperty("id", asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            jsonObject12.add("view", jsonObject13);
            jsonObject12.add("source", new JsonPrimitive(asinterface.b.jsonValue));
            jsonObject.add("container", jsonObject12);
        }
        jsonObject.addProperty("type", this.getInterfaceDescriptor);
        MediaBrowserCompat mediaBrowserCompat = this.notify;
        JsonObject jsonObject14 = new JsonObject();
        String str16 = mediaBrowserCompat.asBinder;
        if (str16 != null) {
            int i38 = getNotifyChildrenChangedOptions + 41;
            getRoot = i38 % 128;
            if (i38 % 2 == 0) {
                jsonObject14.addProperty("id", str16);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            jsonObject14.addProperty("id", str16);
        }
        jsonObject14.add("type", new JsonPrimitive(mediaBrowserCompat.INotificationSideChannel.jsonValue));
        Method method = mediaBrowserCompat.asInterface;
        if (method != null) {
            jsonObject14.add(FirebaseAnalytics.Param.METHOD, new JsonPrimitive(method.jsonValue));
        }
        jsonObject14.addProperty(ImagesContract.URL, mediaBrowserCompat.notify);
        Long l = mediaBrowserCompat.onTransact;
        if (l != null) {
            jsonObject14.addProperty("status_code", Long.valueOf(l.longValue()));
        }
        Long l2 = mediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (l2 != null) {
            jsonObject14.addProperty(TypedValues.TransitionType.S_DURATION, Long.valueOf(l2.longValue()));
        }
        Long l3 = mediaBrowserCompat.cancelAll;
        if (l3 != null) {
            jsonObject14.addProperty("size", Long.valueOf(l3.longValue()));
            int i39 = getNotifyChildrenChangedOptions + 47;
            getRoot = i39 % 128;
            int i40 = i39 % 2;
        }
        read readVar = mediaBrowserCompat.a;
        if (readVar != null) {
            JsonObject jsonObject15 = new JsonObject();
            jsonObject15.addProperty(TypedValues.TransitionType.S_DURATION, Long.valueOf(readVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            jsonObject15.addProperty("start", Long.valueOf(readVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
            jsonObject14.add("redirect", jsonObject15);
            int i41 = getNotifyChildrenChangedOptions + 123;
            getRoot = i41 % 128;
            int i42 = i41 % 2;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = mediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (remoteActionCompatParcelizer != null) {
            JsonObject jsonObject16 = new JsonObject();
            jsonObject16.addProperty(TypedValues.TransitionType.S_DURATION, Long.valueOf(remoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
            jsonObject16.addProperty("start", Long.valueOf(remoteActionCompatParcelizer.b));
            jsonObject14.add("dns", jsonObject16);
        }
        a aVar = mediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (aVar != null) {
            JsonObject jsonObject17 = new JsonObject();
            jsonObject17.addProperty(TypedValues.TransitionType.S_DURATION, Long.valueOf(aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            jsonObject17.addProperty("start", Long.valueOf(aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            jsonObject14.add("connect", jsonObject17);
        }
        getItem getitem = mediaBrowserCompat.cancel;
        if (getitem != null) {
            JsonObject jsonObject18 = new JsonObject();
            jsonObject18.addProperty(TypedValues.TransitionType.S_DURATION, Long.valueOf(getitem.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
            jsonObject18.addProperty("start", Long.valueOf(getitem.TuitionPaymentFragmentbindingInflater1));
            jsonObject14.add("ssl", jsonObject18);
        }
        INotificationSideChannelDefault iNotificationSideChannelDefault = mediaBrowserCompat.b;
        if (iNotificationSideChannelDefault != null) {
            JsonObject jsonObject19 = new JsonObject();
            jsonObject19.addProperty(TypedValues.TransitionType.S_DURATION, Long.valueOf(iNotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
            jsonObject19.addProperty("start", Long.valueOf(iNotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            jsonObject14.add("first_byte", jsonObject19);
        }
        getInterfaceDescriptor getinterfacedescriptor = mediaBrowserCompat.TuitionPaymentFragmentbindingInflater1;
        if (getinterfacedescriptor != null) {
            JsonObject jsonObject20 = new JsonObject();
            jsonObject20.addProperty(TypedValues.TransitionType.S_DURATION, Long.valueOf(getinterfacedescriptor.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
            jsonObject20.addProperty("start", Long.valueOf(getinterfacedescriptor.TuitionPaymentFragmentbindingInflater1));
            jsonObject14.add("download", jsonObject20);
        }
        write writeVar = mediaBrowserCompat.g;
        if (writeVar != null) {
            JsonObject jsonObject21 = new JsonObject();
            String str17 = writeVar.b;
            if (str17 != null) {
                jsonObject21.addProperty(DynamicLink.Builder.KEY_DOMAIN, str17);
            }
            String str18 = writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str18 != null) {
                int i43 = getNotifyChildrenChangedOptions + 53;
                getRoot = i43 % 128;
                int i44 = i43 % 2;
                jsonObject21.addProperty("name", str18);
            }
            ProviderType providerType = writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (providerType != null) {
                jsonObject21.add("type", new JsonPrimitive(providerType.jsonValue));
                int i45 = getRoot + 119;
                getNotifyChildrenChangedOptions = i45 % 128;
                int i46 = i45 % 2;
            }
            jsonObject14.add("provider", jsonObject21);
        }
        INotificationSideChannelStub iNotificationSideChannelStub = mediaBrowserCompat.d;
        if (iNotificationSideChannelStub != null) {
            JsonObject jsonObject22 = new JsonObject();
            jsonObject22.add("operationType", new JsonPrimitive(iNotificationSideChannelStub.TuitionPaymentFragmentbindingInflater1.jsonValue));
            String str19 = iNotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str19 != null) {
                jsonObject22.addProperty("operationName", str19);
            }
            String str20 = iNotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str20 != null) {
                jsonObject22.addProperty("payload", str20);
            }
            String str21 = iNotificationSideChannelStub.b;
            if (str21 != null) {
                jsonObject22.addProperty("variables", str21);
            }
            jsonObject14.add("graphql", jsonObject22);
        }
        jsonObject.add("resource", jsonObject14);
        return jsonObject;
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bBC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$getExtras;", "", "", "p0", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "b", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/util/Map;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getExtras {
        public final Map<String, Object> TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
        private final String b;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {"id", "name", "email"};

        public getExtras(String str, String str2, String str3, Map<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.b = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str3;
            this.TuitionPaymentFragmentbindingInflater1 = map;
        }

        public /* synthetic */ getExtras(String str, String str2, String str3, LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? new LinkedHashMap() : linkedHashMap);
        }

        public final JsonElement b() {
            JsonObject jsonObject = new JsonObject();
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str != null) {
                jsonObject.addProperty("id", str);
            }
            String str2 = this.b;
            if (str2 != null) {
                jsonObject.addProperty("name", str2);
            }
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str3 != null) {
                jsonObject.addProperty("email", str3);
            }
            for (Map.Entry<String, Object> entry : this.TuitionPaymentFragmentbindingInflater1.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!ArraysKt.contains(TuitionPaymentFragmentspecialinlinedviewModeldefault2, key)) {
                    toBitmap tobitmap = toBitmap.INSTANCE;
                    jsonObject.add(key, toBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3(value));
                }
            }
            return jsonObject;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$getExtras$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$getExtras$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$getExtras;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$getExtras;", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "[Ljava/lang/String;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static getExtras TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
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
                        if (!ArraysKt.contains(getExtras.TuitionPaymentFragmentspecialinlinedviewModeldefault2, entry.getKey())) {
                            String key = entry.getKey();
                            Intrinsics.checkNotNullExpressionValue(key, "");
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    return new getExtras(asString, asString2, asString3, linkedHashMap);
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

        public static /* synthetic */ getExtras TuitionPaymentFragmentspecialinlinedviewModeldefault2(getExtras getextras, Map map) {
            String str = getextras.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str2 = getextras.b;
            String str3 = getextras.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Intrinsics.checkNotNullParameter(map, "");
            return new getExtras(str, str2, str3, map);
        }

        public getExtras() {
            this(null, null, null, null, 15, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof getExtras)) {
                return false;
            }
            getExtras getextras = (getExtras) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getextras.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.b, getextras.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getextras.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, getextras.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str2 = this.b;
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Map<String, Object> map = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("getExtras(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(", b=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str3);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$g;", "", "Lcom/datadog/android/rum/model/ResourceEvent$Status;", "p0", "", "Lcom/datadog/android/rum/model/ResourceEvent$Interface;", "p1", "Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType;", "p2", "Lcom/datadog/android/rum/model/ResourceEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "p3", "<init>", "(Lcom/datadog/android/rum/model/ResourceEvent$Status;Ljava/util/List;Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType;Lcom/datadog/android/rum/model/ResourceEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "b", "Lcom/datadog/android/rum/model/ResourceEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType;", "Ljava/util/List;", "TuitionPaymentFragmentbindingInflater1", "Lcom/datadog/android/rum/model/ResourceEvent$Status;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class g {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Status TuitionPaymentFragmentbindingInflater1;
        private final EffectiveType TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        private final List<Interface> b;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX WARN: Multi-variable type inference failed */
        public g(Status status, List<? extends Interface> list, EffectiveType effectiveType, TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(status, "");
            this.TuitionPaymentFragmentbindingInflater1 = status;
            this.b = list;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = effectiveType;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public /* synthetic */ g(Status status, List list, EffectiveType effectiveType, TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(status, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : effectiveType, (i & 8) != 0 ? null : tuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final JsonElement TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            JsonObject jsonObject = new JsonObject();
            jsonObject.add(NotificationCompat.CATEGORY_STATUS, new JsonPrimitive(this.TuitionPaymentFragmentbindingInflater1.jsonValue));
            List<Interface> list = this.b;
            if (list != null) {
                JsonArray jsonArray = new JsonArray(list.size());
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    jsonArray.add(new JsonPrimitive(((Interface) it.next()).jsonValue));
                }
                jsonObject.add("interfaces", jsonArray);
            }
            EffectiveType effectiveType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (effectiveType != null) {
                jsonObject.add("effective_type", new JsonPrimitive(effectiveType.jsonValue));
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                JsonObject jsonObject2 = new JsonObject();
                String str = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (str != null) {
                    jsonObject2.addProperty("technology", str);
                }
                String str2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str2 != null) {
                    jsonObject2.addProperty("carrier_name", str2);
                }
                jsonObject.add("cellular", jsonObject2);
            }
            return jsonObject;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$g$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$g$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$g;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$g;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static g TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                ArrayList arrayList;
                EffectiveType effectiveTypeTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                JsonObject asJsonObject;
                String asString;
                JsonArray asJsonArray;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    Status.Companion companion = Status.INSTANCE;
                    String asString2 = p0.get(NotificationCompat.CATEGORY_STATUS).getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString2, "");
                    Status statusB = Status.Companion.b(asString2);
                    JsonElement jsonElement = p0.get("interfaces");
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2B = null;
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
                        effectiveTypeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    } else {
                        EffectiveType.Companion companion3 = EffectiveType.INSTANCE;
                        effectiveTypeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = EffectiveType.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asString);
                    }
                    JsonElement jsonElement4 = p0.get("cellular");
                    if (jsonElement4 != null && (asJsonObject = jsonElement4.getAsJsonObject()) != null) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2.Companion companion4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE;
                        tuitionPaymentFragmentspecialinlinedviewModeldefault2B = TuitionPaymentFragmentspecialinlinedviewModeldefault2.Companion.b(asJsonObject);
                    }
                    return new g(statusB, arrayList, effectiveTypeTuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault2B);
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

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof g)) {
                return false;
            }
            g gVar = (g) p0;
            return this.TuitionPaymentFragmentbindingInflater1 == gVar.TuitionPaymentFragmentbindingInflater1 && Intrinsics.areEqual(this.b, gVar.b) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentbindingInflater1.hashCode();
            List<Interface> list = this.b;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            EffectiveType effectiveType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode3 = effectiveType == null ? 0 : effectiveType.hashCode();
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (tuitionPaymentFragmentspecialinlinedviewModeldefault2 != null ? tuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode() : 0);
        }

        public final String toString() {
            Status status = this.TuitionPaymentFragmentbindingInflater1;
            List<Interface> list = this.b;
            EffectiveType effectiveType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("g(TuitionPaymentFragmentbindingInflater1=");
            sb.append(status);
            sb.append(", b=");
            sb.append(list);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(effectiveType);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$getNotifyChildrenChangedOptions;", "", "", "p0", "p1", "", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/Boolean;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getNotifyChildrenChangedOptions {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        final String TuitionPaymentFragmentbindingInflater1;
        final Boolean b;

        public getNotifyChildrenChangedOptions(String str, String str2, Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.TuitionPaymentFragmentbindingInflater1 = str2;
            this.b = bool;
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
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getnotifychildrenchangedoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, getnotifychildrenchangedoptions.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, getnotifychildrenchangedoptions.b);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
            int iHashCode2 = this.TuitionPaymentFragmentbindingInflater1.hashCode();
            Boolean bool = this.b;
            return (((iHashCode * 31) + iHashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            Boolean bool = this.b;
            StringBuilder sb = new StringBuilder("getNotifyChildrenChangedOptions(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(str2);
            sb.append(", b=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$getNotifyChildrenChangedOptions$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$getNotifyChildrenChangedOptions$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$getNotifyChildrenChangedOptions;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$getNotifyChildrenChangedOptions;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static getNotifyChildrenChangedOptions TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$TuitionPaymentFragmentbindingInflater1;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "b", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentbindingInflater1 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        final String b;

        public TuitionPaymentFragmentbindingInflater1(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.b = str;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, ((TuitionPaymentFragmentbindingInflater1) p0).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            String str = this.b;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentbindingInflater1(b=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$TuitionPaymentFragmentbindingInflater1$TuitionPaymentFragmentbindingInflater1, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$TuitionPaymentFragmentbindingInflater1$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$TuitionPaymentFragmentbindingInflater1;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$TuitionPaymentFragmentbindingInflater1;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentbindingInflater1 b(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("test_execution_id").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new TuitionPaymentFragmentbindingInflater1(asString);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelStubProxy;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannelStubProxy {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final String b;

        public INotificationSideChannelStubProxy(String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.b = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str4;
        }

        public /* synthetic */ INotificationSideChannelStubProxy(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, str4);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof INotificationSideChannelStubProxy)) {
                return false;
            }
            INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = (INotificationSideChannelStubProxy) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, iNotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, iNotificationSideChannelStubProxy.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, iNotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, iNotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
            int iHashCode2 = this.b.hashCode();
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str2 = this.b;
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("INotificationSideChannelStubProxy(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str);
            sb.append(", b=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str3);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$INotificationSideChannelStubProxy$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelStubProxy$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelStubProxy;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelStubProxy;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static INotificationSideChannelStubProxy b(JsonObject p0) throws JsonParseException {
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
                    return new INotificationSideChannelStubProxy(asString, asString2, asString3, asString4);
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$notify;", "", "Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;", "p0", "", "p1", "p2", "p3", "p4", "<init>", "(Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "g", "Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class notify {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        final String TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final String b;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        final DeviceType TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public notify(DeviceType deviceType, String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(deviceType, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = deviceType;
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
            this.b = str3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str4;
        }

        public /* synthetic */ notify(DeviceType deviceType, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(deviceType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof notify)) {
                return false;
            }
            notify notifyVar = (notify) p0;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == notifyVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, notifyVar.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, notifyVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, notifyVar.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, notifyVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
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
            StringBuilder sb = new StringBuilder("notify(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
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

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$notify$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$notify$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$notify;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$notify;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static notify TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
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
                    return new notify(deviceTypeB, asString2, asString3, asString4, jsonElement4 != null ? jsonElement4.getAsString() : null);
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

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0017\u001a\u00020\u001f8\u0006X\u0086D¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\u0006\n\u0004\b!\u0010\"R\u0013\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b#\u0010$R\u0013\u0010#\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u0013\u0010!\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u0006\n\u0004\b%\u0010\u0018"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$cancelAll;", "", "Lcom/datadog/android/rum/model/ResourceEvent$cancel;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$d;", "p1", "", "p2", "p3", "p4", "", "p5", "", "p6", "<init>", "(Lcom/datadog/android/rum/model/ResourceEvent$cancel;Lcom/datadog/android/rum/model/ResourceEvent$d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Boolean;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "Lcom/datadog/android/rum/model/ResourceEvent$d;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/Boolean;", "", "J", "asInterface", "Ljava/lang/Number;", "a", "Lcom/datadog/android/rum/model/ResourceEvent$cancel;", "g", "asBinder"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class cancelAll {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        final Boolean b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        final cancel g;

        /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
        final String a;

        /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
        final Number TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        final d TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        final String asInterface;

        public cancelAll(cancel cancelVar, d dVar, String str, String str2, String str3, Number number, Boolean bool) {
            this.g = cancelVar;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = dVar;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.a = str2;
            this.asInterface = str3;
            this.TuitionPaymentFragmentbindingInflater1 = number;
            this.b = bool;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2L;
        }

        public /* synthetic */ cancelAll(cancel cancelVar, d dVar, String str, String str2, String str3, Number number, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cancelVar, (i & 2) != 0 ? null : dVar, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : number, (i & 64) != 0 ? null : bool);
        }

        public cancelAll() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof cancelAll)) {
                return false;
            }
            cancelAll cancelall = (cancelAll) p0;
            return Intrinsics.areEqual(this.g, cancelall.g) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, cancelall.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, cancelall.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.a, cancelall.a) && Intrinsics.areEqual(this.asInterface, cancelall.asInterface) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, cancelall.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, cancelall.b);
        }

        public final int hashCode() {
            cancel cancelVar = this.g;
            int iHashCode = cancelVar == null ? 0 : cancelVar.hashCode();
            d dVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode2 = dVar == null ? 0 : dVar.hashCode();
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.a;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.asInterface;
            int iHashCode5 = str3 == null ? 0 : str3.hashCode();
            Number number = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode6 = number == null ? 0 : number.hashCode();
            Boolean bool = this.b;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            cancel cancelVar = this.g;
            d dVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str2 = this.a;
            String str3 = this.asInterface;
            Number number = this.TuitionPaymentFragmentbindingInflater1;
            Boolean bool = this.b;
            StringBuilder sb = new StringBuilder("cancelAll(g=");
            sb.append(cancelVar);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(dVar);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str);
            sb.append(", a=");
            sb.append(str2);
            sb.append(", asInterface=");
            sb.append(str3);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(number);
            sb.append(", b=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$cancelAll$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$cancelAll$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$cancelAll;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$cancelAll;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static cancelAll TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                cancel cancelVarTuitionPaymentFragmentbindingInflater1;
                d dVarTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                JsonObject asJsonObject;
                JsonObject asJsonObject2;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    long asLong = p0.get("format_version").getAsLong();
                    JsonElement jsonElement = p0.get("session");
                    if (jsonElement == null || (asJsonObject2 = jsonElement.getAsJsonObject()) == null) {
                        cancelVarTuitionPaymentFragmentbindingInflater1 = null;
                    } else {
                        cancel.Companion companion = cancel.INSTANCE;
                        cancelVarTuitionPaymentFragmentbindingInflater1 = cancel.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject2);
                    }
                    JsonElement jsonElement2 = p0.get("configuration");
                    if (jsonElement2 == null || (asJsonObject = jsonElement2.getAsJsonObject()) == null) {
                        dVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    } else {
                        d.Companion companion2 = d.INSTANCE;
                        dVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = d.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject);
                    }
                    JsonElement jsonElement3 = p0.get("browser_sdk_version");
                    String asString = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    JsonElement jsonElement4 = p0.get("span_id");
                    String asString2 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                    JsonElement jsonElement5 = p0.get("trace_id");
                    String asString3 = jsonElement5 != null ? jsonElement5.getAsString() : null;
                    JsonElement jsonElement6 = p0.get("rule_psr");
                    Number asNumber = jsonElement6 != null ? jsonElement6.getAsNumber() : null;
                    JsonElement jsonElement7 = p0.get("discarded");
                    Boolean boolValueOf = jsonElement7 != null ? Boolean.valueOf(jsonElement7.getAsBoolean()) : null;
                    if (asLong != 2) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    return new cancelAll(cancelVarTuitionPaymentFragmentbindingInflater1, dVarTuitionPaymentFragmentspecialinlinedviewModeldefault2, asString, asString2, asString3, asNumber, boolValueOf);
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

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u0007\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannel;", "", "", "", "p0", "<init>", "(Ljava/util/Map;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/util/Map;)Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannel;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannel {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final Map<String, Object> TuitionPaymentFragmentbindingInflater1;

        public INotificationSideChannel(Map<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.TuitionPaymentFragmentbindingInflater1 = map;
        }

        public /* synthetic */ INotificationSideChannel(LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new LinkedHashMap() : linkedHashMap);
        }

        public final JsonElement TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            JsonObject jsonObject = new JsonObject();
            for (Map.Entry<String, Object> entry : this.TuitionPaymentFragmentbindingInflater1.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                toBitmap tobitmap = toBitmap.INSTANCE;
                jsonObject.add(key, toBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3(value));
            }
            return jsonObject;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$INotificationSideChannel$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannel$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannel;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannel;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static INotificationSideChannel b(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, JsonElement> entry : p0.entrySet()) {
                        String key = entry.getKey();
                        Intrinsics.checkNotNullExpressionValue(key, "");
                        linkedHashMap.put(key, entry.getValue());
                    }
                    return new INotificationSideChannel(linkedHashMap);
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
        public INotificationSideChannel() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static INotificationSideChannel TuitionPaymentFragmentspecialinlinedviewModeldefault1(Map<String, Object> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new INotificationSideChannel(p0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof INotificationSideChannel) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, ((INotificationSideChannel) p0).TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentbindingInflater1.hashCode();
        }

        public final String toString() {
            Map<String, Object> map = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("INotificationSideChannel(TuitionPaymentFragmentbindingInflater1=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "", "", "p0", "<init>", "(Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/List;", "TuitionPaymentFragmentbindingInflater1", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        private final List<String> TuitionPaymentFragmentbindingInflater1;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(List<String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.TuitionPaymentFragmentbindingInflater1 = list;
        }

        public final JsonElement TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            JsonObject jsonObject = new JsonObject();
            JsonArray jsonArray = new JsonArray(this.TuitionPaymentFragmentbindingInflater1.size());
            Iterator<T> it = this.TuitionPaymentFragmentbindingInflater1.iterator();
            while (it.hasNext()) {
                jsonArray.add((String) it.next());
            }
            jsonObject.add("id", jsonArray);
            return jsonObject;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentspecialinlinedviewModeldefault3 b(JsonObject p0) throws JsonParseException {
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
            List<String> list = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentbindingInflater1=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$asInterface;", "", "Lcom/datadog/android/rum/model/ResourceEvent$asBinder;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "p1", "<init>", "(Lcom/datadog/android/rum/model/ResourceEvent$asBinder;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "b", "Lcom/datadog/android/rum/model/ResourceEvent$asBinder;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class asInterface {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        final ResourceEventSource b;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        final asBinder TuitionPaymentFragmentbindingInflater1;

        public asInterface(asBinder asbinder, ResourceEventSource resourceEventSource) {
            Intrinsics.checkNotNullParameter(asbinder, "");
            Intrinsics.checkNotNullParameter(resourceEventSource, "");
            this.TuitionPaymentFragmentbindingInflater1 = asbinder;
            this.b = resourceEventSource;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof asInterface)) {
                return false;
            }
            asInterface asinterface = (asInterface) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, asinterface.TuitionPaymentFragmentbindingInflater1) && this.b == asinterface.b;
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentbindingInflater1.hashCode() * 31) + this.b.hashCode();
        }

        public final String toString() {
            asBinder asbinder = this.TuitionPaymentFragmentbindingInflater1;
            ResourceEventSource resourceEventSource = this.b;
            StringBuilder sb = new StringBuilder("asInterface(TuitionPaymentFragmentbindingInflater1=");
            sb.append(asbinder);
            sb.append(", b=");
            sb.append(resourceEventSource);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$asInterface$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$asInterface$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$asInterface;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$asInterface;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static asInterface TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonObject asJsonObject = p0.get("view").getAsJsonObject();
                    asBinder.Companion companion = asBinder.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    asBinder asbinderTuitionPaymentFragmentspecialinlinedviewModeldefault1 = asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject);
                    ResourceEventSource.Companion companion2 = ResourceEventSource.INSTANCE;
                    String asString = p0.get("source").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new asInterface(asbinderTuitionPaymentFragmentspecialinlinedviewModeldefault1, ResourceEventSource.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asString));
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

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \b\u0086\b\u0018\u0000 .2\u00020\u0001:\u0001.B³\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b%\u0010&R\u0013\u0010)\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\u0006\n\u0004\b'\u0010(R\u0013\u0010'\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u0006\n\u0004\b*\u0010+R\u0013\u0010.\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\u0006\n\u0004\b,\u0010-R\u0013\u0010*\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u0006\n\u0004\b)\u0010/R\u0013\u0010,\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u0006\n\u0004\b0\u00101R\u0013\u00102\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\u0006\n\u0004\b2\u00103R\u0013\u00106\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b4\u00105R\u0013\u00108\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u0006\n\u0004\b6\u00107R\u0013\u00104\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\u0006\n\u0004\b8\u00109R\u0013\u00100\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u0006\n\u0004\b:\u0010;R\u0013\u0010=\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u0006\n\u0004\b<\u0010/R\u0013\u0010<\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\u0006\n\u0004\b=\u0010>R\u0013\u0010@\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u0006\n\u0004\b?\u0010/R\u0014\u0010?\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010:\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bB\u00105"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$MediaBrowserCompat;", "", "", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;", "p1", "Lcom/datadog/android/rum/model/ResourceEvent$Method;", "p2", "p3", "", "p4", "p5", "p6", "Lcom/datadog/android/rum/model/ResourceEvent$read;", "p7", "Lcom/datadog/android/rum/model/ResourceEvent$RemoteActionCompatParcelizer;", "p8", "Lcom/datadog/android/rum/model/ResourceEvent$a;", "p9", "Lcom/datadog/android/rum/model/ResourceEvent$getItem;", "p10", "Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelDefault;", "p11", "Lcom/datadog/android/rum/model/ResourceEvent$getInterfaceDescriptor;", "p12", "Lcom/datadog/android/rum/model/ResourceEvent$write;", "p13", "Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelStub;", "p14", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;Lcom/datadog/android/rum/model/ResourceEvent$Method;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/model/ResourceEvent$read;Lcom/datadog/android/rum/model/ResourceEvent$RemoteActionCompatParcelizer;Lcom/datadog/android/rum/model/ResourceEvent$a;Lcom/datadog/android/rum/model/ResourceEvent$getItem;Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelDefault;Lcom/datadog/android/rum/model/ResourceEvent$getInterfaceDescriptor;Lcom/datadog/android/rum/model/ResourceEvent$write;Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelStub;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/rum/model/ResourceEvent$a;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/rum/model/ResourceEvent$RemoteActionCompatParcelizer;", "b", "Lcom/datadog/android/rum/model/ResourceEvent$getInterfaceDescriptor;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/Long;", "a", "Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelDefault;", "d", "Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelStub;", "g", "Ljava/lang/String;", "asBinder", "Lcom/datadog/android/rum/model/ResourceEvent$Method;", "asInterface", "Lcom/datadog/android/rum/model/ResourceEvent$write;", "notify", "Lcom/datadog/android/rum/model/ResourceEvent$read;", "cancel", "cancelAll", "Lcom/datadog/android/rum/model/ResourceEvent$getItem;", "INotificationSideChannel", "onTransact", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;", "INotificationSideChannelDefault"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class MediaBrowserCompat {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
        final Long onTransact;

        /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
        public String notify;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        final a TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        final RemoteActionCompatParcelizer TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        final Long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        final INotificationSideChannelDefault b;

        /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
        final Method asInterface;

        /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
        final write g;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        final getInterfaceDescriptor TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
        final Long cancelAll;

        /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
        final getItem cancel;
        final INotificationSideChannelStub d;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        final String asBinder;

        /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
        final read a;

        /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
        final ResourceType INotificationSideChannel;

        public MediaBrowserCompat(String str, ResourceType resourceType, Method method, String str2, Long l, Long l2, Long l3, read readVar, RemoteActionCompatParcelizer remoteActionCompatParcelizer, a aVar, getItem getitem, INotificationSideChannelDefault iNotificationSideChannelDefault, getInterfaceDescriptor getinterfacedescriptor, write writeVar, INotificationSideChannelStub iNotificationSideChannelStub) {
            Intrinsics.checkNotNullParameter(resourceType, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.asBinder = str;
            this.INotificationSideChannel = resourceType;
            this.asInterface = method;
            this.notify = str2;
            this.onTransact = l;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = l2;
            this.cancelAll = l3;
            this.a = readVar;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = remoteActionCompatParcelizer;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = aVar;
            this.cancel = getitem;
            this.b = iNotificationSideChannelDefault;
            this.TuitionPaymentFragmentbindingInflater1 = getinterfacedescriptor;
            this.g = writeVar;
            this.d = iNotificationSideChannelStub;
        }

        public /* synthetic */ MediaBrowserCompat(String str, ResourceType resourceType, Method method, String str2, Long l, Long l2, Long l3, read readVar, RemoteActionCompatParcelizer remoteActionCompatParcelizer, a aVar, getItem getitem, INotificationSideChannelDefault iNotificationSideChannelDefault, getInterfaceDescriptor getinterfacedescriptor, write writeVar, INotificationSideChannelStub iNotificationSideChannelStub, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, resourceType, (i & 4) != 0 ? null : method, str2, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : l3, (i & 128) != 0 ? null : readVar, (i & 256) != 0 ? null : remoteActionCompatParcelizer, (i & 512) != 0 ? null : aVar, (i & 1024) != 0 ? null : getitem, (i & 2048) != 0 ? null : iNotificationSideChannelDefault, (i & 4096) != 0 ? null : getinterfacedescriptor, (i & 8192) != 0 ? null : writeVar, (i & 16384) != 0 ? null : iNotificationSideChannelStub);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof MediaBrowserCompat)) {
                return false;
            }
            MediaBrowserCompat mediaBrowserCompat = (MediaBrowserCompat) p0;
            return Intrinsics.areEqual(this.asBinder, mediaBrowserCompat.asBinder) && this.INotificationSideChannel == mediaBrowserCompat.INotificationSideChannel && this.asInterface == mediaBrowserCompat.asInterface && Intrinsics.areEqual(this.notify, mediaBrowserCompat.notify) && Intrinsics.areEqual(this.onTransact, mediaBrowserCompat.onTransact) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, mediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.cancelAll, mediaBrowserCompat.cancelAll) && Intrinsics.areEqual(this.a, mediaBrowserCompat.a) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, mediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, mediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.cancel, mediaBrowserCompat.cancel) && Intrinsics.areEqual(this.b, mediaBrowserCompat.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, mediaBrowserCompat.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.g, mediaBrowserCompat.g) && Intrinsics.areEqual(this.d, mediaBrowserCompat.d);
        }

        public final int hashCode() {
            String str = this.asBinder;
            int iHashCode = str == null ? 0 : str.hashCode();
            int iHashCode2 = this.INotificationSideChannel.hashCode();
            Method method = this.asInterface;
            int iHashCode3 = method == null ? 0 : method.hashCode();
            int iHashCode4 = this.notify.hashCode();
            Long l = this.onTransact;
            int iHashCode5 = l == null ? 0 : l.hashCode();
            Long l2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode6 = l2 == null ? 0 : l2.hashCode();
            Long l3 = this.cancelAll;
            int iHashCode7 = l3 == null ? 0 : l3.hashCode();
            read readVar = this.a;
            int iHashCode8 = readVar == null ? 0 : readVar.hashCode();
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode9 = remoteActionCompatParcelizer == null ? 0 : remoteActionCompatParcelizer.hashCode();
            a aVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode10 = aVar == null ? 0 : aVar.hashCode();
            getItem getitem = this.cancel;
            int iHashCode11 = getitem == null ? 0 : getitem.hashCode();
            INotificationSideChannelDefault iNotificationSideChannelDefault = this.b;
            int iHashCode12 = iNotificationSideChannelDefault == null ? 0 : iNotificationSideChannelDefault.hashCode();
            getInterfaceDescriptor getinterfacedescriptor = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode13 = getinterfacedescriptor == null ? 0 : getinterfacedescriptor.hashCode();
            write writeVar = this.g;
            int iHashCode14 = writeVar == null ? 0 : writeVar.hashCode();
            INotificationSideChannelStub iNotificationSideChannelStub = this.d;
            return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (iNotificationSideChannelStub != null ? iNotificationSideChannelStub.hashCode() : 0);
        }

        public final String toString() {
            String str = this.asBinder;
            ResourceType resourceType = this.INotificationSideChannel;
            Method method = this.asInterface;
            String str2 = this.notify;
            Long l = this.onTransact;
            Long l2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Long l3 = this.cancelAll;
            read readVar = this.a;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            a aVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            getItem getitem = this.cancel;
            INotificationSideChannelDefault iNotificationSideChannelDefault = this.b;
            getInterfaceDescriptor getinterfacedescriptor = this.TuitionPaymentFragmentbindingInflater1;
            write writeVar = this.g;
            INotificationSideChannelStub iNotificationSideChannelStub = this.d;
            StringBuilder sb = new StringBuilder("MediaBrowserCompat(asBinder=");
            sb.append(str);
            sb.append(", INotificationSideChannel=");
            sb.append(resourceType);
            sb.append(", asInterface=");
            sb.append(method);
            sb.append(", notify=");
            sb.append(str2);
            sb.append(", onTransact=");
            sb.append(l);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(l2);
            sb.append(", cancelAll=");
            sb.append(l3);
            sb.append(", a=");
            sb.append(readVar);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(remoteActionCompatParcelizer);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(aVar);
            sb.append(", cancel=");
            sb.append(getitem);
            sb.append(", b=");
            sb.append(iNotificationSideChannelDefault);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(getinterfacedescriptor);
            sb.append(", g=");
            sb.append(writeVar);
            sb.append(", d=");
            sb.append(iNotificationSideChannelStub);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$MediaBrowserCompat$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$MediaBrowserCompat$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$MediaBrowserCompat;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$MediaBrowserCompat;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static MediaBrowserCompat b(JsonObject p0) throws JsonParseException {
                Method methodTuitionPaymentFragmentbindingInflater1;
                read readVarTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                RemoteActionCompatParcelizer remoteActionCompatParcelizerTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                getItem getitemTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                INotificationSideChannelDefault iNotificationSideChannelDefaultTuitionPaymentFragmentbindingInflater1;
                getInterfaceDescriptor getinterfacedescriptorB;
                write writeVarTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                JsonObject asJsonObject;
                JsonObject asJsonObject2;
                JsonObject asJsonObject3;
                JsonObject asJsonObject4;
                JsonObject asJsonObject5;
                JsonObject asJsonObject6;
                JsonObject asJsonObject7;
                JsonObject asJsonObject8;
                String asString;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("id");
                    INotificationSideChannelStub iNotificationSideChannelStubTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                    ResourceType.Companion companion = ResourceType.INSTANCE;
                    String asString3 = p0.get("type").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString3, "");
                    ResourceType resourceTypeB = ResourceType.Companion.b(asString3);
                    JsonElement jsonElement2 = p0.get(FirebaseAnalytics.Param.METHOD);
                    if (jsonElement2 == null || (asString = jsonElement2.getAsString()) == null) {
                        methodTuitionPaymentFragmentbindingInflater1 = null;
                    } else {
                        Method.Companion companion2 = Method.INSTANCE;
                        methodTuitionPaymentFragmentbindingInflater1 = Method.Companion.TuitionPaymentFragmentbindingInflater1(asString);
                    }
                    String asString4 = p0.get(ImagesContract.URL).getAsString();
                    JsonElement jsonElement3 = p0.get("status_code");
                    Long lValueOf = jsonElement3 != null ? Long.valueOf(jsonElement3.getAsLong()) : null;
                    JsonElement jsonElement4 = p0.get(TypedValues.TransitionType.S_DURATION);
                    Long lValueOf2 = jsonElement4 != null ? Long.valueOf(jsonElement4.getAsLong()) : null;
                    JsonElement jsonElement5 = p0.get("size");
                    Long lValueOf3 = jsonElement5 != null ? Long.valueOf(jsonElement5.getAsLong()) : null;
                    JsonElement jsonElement6 = p0.get("redirect");
                    if (jsonElement6 == null || (asJsonObject8 = jsonElement6.getAsJsonObject()) == null) {
                        readVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    } else {
                        read.Companion companion3 = read.INSTANCE;
                        readVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = read.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject8);
                    }
                    JsonElement jsonElement7 = p0.get("dns");
                    if (jsonElement7 == null || (asJsonObject7 = jsonElement7.getAsJsonObject()) == null) {
                        remoteActionCompatParcelizerTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    } else {
                        RemoteActionCompatParcelizer.Companion companion4 = RemoteActionCompatParcelizer.INSTANCE;
                        remoteActionCompatParcelizerTuitionPaymentFragmentspecialinlinedviewModeldefault1 = RemoteActionCompatParcelizer.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject7);
                    }
                    JsonElement jsonElement8 = p0.get("connect");
                    if (jsonElement8 == null || (asJsonObject6 = jsonElement8.getAsJsonObject()) == null) {
                        aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    } else {
                        a.Companion companion5 = a.INSTANCE;
                        aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = a.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asJsonObject6);
                    }
                    JsonElement jsonElement9 = p0.get("ssl");
                    if (jsonElement9 == null || (asJsonObject5 = jsonElement9.getAsJsonObject()) == null) {
                        getitemTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    } else {
                        getItem.Companion companion6 = getItem.INSTANCE;
                        getitemTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getItem.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asJsonObject5);
                    }
                    JsonElement jsonElement10 = p0.get("first_byte");
                    if (jsonElement10 == null || (asJsonObject4 = jsonElement10.getAsJsonObject()) == null) {
                        iNotificationSideChannelDefaultTuitionPaymentFragmentbindingInflater1 = null;
                    } else {
                        INotificationSideChannelDefault.Companion companion7 = INotificationSideChannelDefault.INSTANCE;
                        iNotificationSideChannelDefaultTuitionPaymentFragmentbindingInflater1 = INotificationSideChannelDefault.Companion.TuitionPaymentFragmentbindingInflater1(asJsonObject4);
                    }
                    JsonElement jsonElement11 = p0.get("download");
                    if (jsonElement11 == null || (asJsonObject3 = jsonElement11.getAsJsonObject()) == null) {
                        getinterfacedescriptorB = null;
                    } else {
                        getInterfaceDescriptor.Companion companion8 = getInterfaceDescriptor.INSTANCE;
                        getinterfacedescriptorB = getInterfaceDescriptor.Companion.b(asJsonObject3);
                    }
                    JsonElement jsonElement12 = p0.get("provider");
                    if (jsonElement12 == null || (asJsonObject2 = jsonElement12.getAsJsonObject()) == null) {
                        writeVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    } else {
                        write.Companion companion9 = write.INSTANCE;
                        writeVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = write.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject2);
                    }
                    JsonElement jsonElement13 = p0.get("graphql");
                    if (jsonElement13 != null && (asJsonObject = jsonElement13.getAsJsonObject()) != null) {
                        INotificationSideChannelStub.Companion companion10 = INotificationSideChannelStub.INSTANCE;
                        iNotificationSideChannelStubTuitionPaymentFragmentspecialinlinedviewModeldefault2 = INotificationSideChannelStub.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asJsonObject);
                    }
                    Intrinsics.checkNotNullExpressionValue(asString4, "");
                    return new MediaBrowserCompat(asString2, resourceTypeB, methodTuitionPaymentFragmentbindingInflater1, asString4, lValueOf, lValueOf2, lValueOf3, readVarTuitionPaymentFragmentspecialinlinedviewModeldefault1, remoteActionCompatParcelizerTuitionPaymentFragmentspecialinlinedviewModeldefault1, aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3, getitemTuitionPaymentFragmentspecialinlinedviewModeldefault1, iNotificationSideChannelDefaultTuitionPaymentFragmentbindingInflater1, getinterfacedescriptorB, writeVarTuitionPaymentFragmentspecialinlinedviewModeldefault2, iNotificationSideChannelStubTuitionPaymentFragmentspecialinlinedviewModeldefault2);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, String str2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TuitionPaymentFragmentspecialinlinedviewModeldefault2) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static TuitionPaymentFragmentspecialinlinedviewModeldefault2 b(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("technology");
                    String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = p0.get("carrier_name");
                    return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(asString, jsonElement2 != null ? jsonElement2.getAsString() : null);
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$disconnect;", "", "", "p0", "p1", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/Number;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class disconnect {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        final Number TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        final Number TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public disconnect(Number number, Number number2) {
            Intrinsics.checkNotNullParameter(number, "");
            Intrinsics.checkNotNullParameter(number2, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = number;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = number2;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof disconnect)) {
                return false;
            }
            disconnect disconnectVar = (disconnect) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, disconnectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, disconnectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            Number number = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Number number2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("disconnect(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(number);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(number2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$disconnect$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$disconnect$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$disconnect;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$disconnect;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static disconnect TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
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

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$cancel;", "", "Lcom/datadog/android/rum/model/ResourceEvent$Plan;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;", "p1", "<init>", "(Lcom/datadog/android/rum/model/ResourceEvent$Plan;Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Lcom/datadog/android/rum/model/ResourceEvent$Plan;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class cancel {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        final Plan TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        final SessionPrecondition TuitionPaymentFragmentbindingInflater1;

        public cancel(Plan plan, SessionPrecondition sessionPrecondition) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = plan;
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
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == cancelVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.TuitionPaymentFragmentbindingInflater1 == cancelVar.TuitionPaymentFragmentbindingInflater1;
        }

        public final int hashCode() {
            Plan plan = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode = plan == null ? 0 : plan.hashCode();
            SessionPrecondition sessionPrecondition = this.TuitionPaymentFragmentbindingInflater1;
            return (iHashCode * 31) + (sessionPrecondition != null ? sessionPrecondition.hashCode() : 0);
        }

        public final String toString() {
            Plan plan = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            SessionPrecondition sessionPrecondition = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("cancel(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(plan);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(sessionPrecondition);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$cancel$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$cancel$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$cancel;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$cancel;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static cancel TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
                Plan planTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                String asString;
                String asString2;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get("plan");
                    SessionPrecondition sessionPreconditionTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    if (jsonElement == null || (asString2 = jsonElement.getAsString()) == null) {
                        planTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    } else {
                        Plan.Companion companion = Plan.INSTANCE;
                        planTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Plan.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asString2);
                    }
                    JsonElement jsonElement2 = p0.get("session_precondition");
                    if (jsonElement2 != null && (asString = jsonElement2.getAsString()) != null) {
                        SessionPrecondition.Companion companion2 = SessionPrecondition.INSTANCE;
                        sessionPreconditionTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SessionPrecondition.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asString);
                    }
                    return new cancel(planTuitionPaymentFragmentspecialinlinedviewModeldefault1, sessionPreconditionTuitionPaymentFragmentspecialinlinedviewModeldefault1);
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$d;", "", "", "p0", "p1", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/Number;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        final Number b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        final Number TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public d(Number number, Number number2) {
            Intrinsics.checkNotNullParameter(number, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = number;
            this.b = number2;
        }

        public /* synthetic */ d(Number number, Number number2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(number, (i & 2) != 0 ? null : number2);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof d)) {
                return false;
            }
            d dVar = (d) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.b, dVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
            Number number = this.b;
            return (iHashCode * 31) + (number == null ? 0 : number.hashCode());
        }

        public final String toString() {
            Number number = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Number number2 = this.b;
            StringBuilder sb = new StringBuilder("d(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(number);
            sb.append(", b=");
            sb.append(number2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$d$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$d$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$d;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$d;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static d TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    Number asNumber = p0.get("session_sample_rate").getAsNumber();
                    JsonElement jsonElement = p0.get("session_replay_sample_rate");
                    Number asNumber2 = jsonElement != null ? jsonElement.getAsNumber() : null;
                    Intrinsics.checkNotNullExpressionValue(asNumber, "");
                    return new d(asNumber, asNumber2);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$asBinder;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class asBinder {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public asBinder(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
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
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("asBinder(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$asBinder$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$asBinder$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$asBinder;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$asBinder;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static asBinder TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    String asString = p0.get("id").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new asBinder(asString);
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$read;", "", "", "p0", "p1", "<init>", "(JJ)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class read {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public read(long j, long j2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j2;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof read)) {
                return false;
            }
            read readVar = (read) p0;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == readVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == readVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final int hashCode() {
            return (Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) * 31) + Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final String toString() {
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            long j2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("read(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(j);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(j2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$read$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$read$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$read;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$read;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static read TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    return new read(p0.get(TypedValues.TransitionType.S_DURATION).getAsLong(), p0.get("start").getAsLong());
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Redirect", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Redirect", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Redirect", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$RemoteActionCompatParcelizer;", "", "", "p0", "p1", "<init>", "(JJ)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class RemoteActionCompatParcelizer {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        final long b;

        public RemoteActionCompatParcelizer(long j, long j2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
            this.b = j2;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) p0;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == remoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.b == remoteActionCompatParcelizer.b;
        }

        public final int hashCode() {
            return (Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) * 31) + Long.hashCode(this.b);
        }

        public final String toString() {
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            long j2 = this.b;
            StringBuilder sb = new StringBuilder("RemoteActionCompatParcelizer(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(j);
            sb.append(", b=");
            sb.append(j2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$RemoteActionCompatParcelizer$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$RemoteActionCompatParcelizer$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$RemoteActionCompatParcelizer;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$RemoteActionCompatParcelizer;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static RemoteActionCompatParcelizer TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    return new RemoteActionCompatParcelizer(p0.get(TypedValues.TransitionType.S_DURATION).getAsLong(), p0.get("start").getAsLong());
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Dns", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Dns", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Dns", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$a;", "", "", "p0", "p1", "<init>", "(JJ)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public a(long j, long j2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j2;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof a)) {
                return false;
            }
            a aVar = (a) p0;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            return (Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) * 31) + Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final String toString() {
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            long j2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("a(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(j);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(j2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$a$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$a$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$a;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$a;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static a TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    return new a(p0.get(TypedValues.TransitionType.S_DURATION).getAsLong(), p0.get("start").getAsLong());
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Connect", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Connect", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Connect", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$getItem;", "", "", "p0", "p1", "<init>", "(JJ)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getItem {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        final long TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public getItem(long j, long j2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
            this.TuitionPaymentFragmentbindingInflater1 = j2;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof getItem)) {
                return false;
            }
            getItem getitem = (getItem) p0;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == getitem.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.TuitionPaymentFragmentbindingInflater1 == getitem.TuitionPaymentFragmentbindingInflater1;
        }

        public final int hashCode() {
            return (Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) * 31) + Long.hashCode(this.TuitionPaymentFragmentbindingInflater1);
        }

        public final String toString() {
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            long j2 = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("getItem(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(j);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(j2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$getItem$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$getItem$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$getItem;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$getItem;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static getItem TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    return new getItem(p0.get(TypedValues.TransitionType.S_DURATION).getAsLong(), p0.get("start").getAsLong());
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Ssl", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Ssl", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Ssl", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelDefault;", "", "", "p0", "p1", "<init>", "(JJ)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannelDefault {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public INotificationSideChannelDefault(long j, long j2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j2;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof INotificationSideChannelDefault)) {
                return false;
            }
            INotificationSideChannelDefault iNotificationSideChannelDefault = (INotificationSideChannelDefault) p0;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == iNotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == iNotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public final int hashCode() {
            return (Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) * 31) + Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final String toString() {
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            long j2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("INotificationSideChannelDefault(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(j);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(j2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$INotificationSideChannelDefault$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelDefault$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelDefault;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelDefault;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static INotificationSideChannelDefault TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    return new INotificationSideChannelDefault(p0.get(TypedValues.TransitionType.S_DURATION).getAsLong(), p0.get("start").getAsLong());
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type FirstByte", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type FirstByte", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type FirstByte", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$getInterfaceDescriptor;", "", "", "p0", "p1", "<init>", "(JJ)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getInterfaceDescriptor {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        final long TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public getInterfaceDescriptor(long j, long j2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
            this.TuitionPaymentFragmentbindingInflater1 = j2;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof getInterfaceDescriptor)) {
                return false;
            }
            getInterfaceDescriptor getinterfacedescriptor = (getInterfaceDescriptor) p0;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == getinterfacedescriptor.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.TuitionPaymentFragmentbindingInflater1 == getinterfacedescriptor.TuitionPaymentFragmentbindingInflater1;
        }

        public final int hashCode() {
            return (Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) * 31) + Long.hashCode(this.TuitionPaymentFragmentbindingInflater1);
        }

        public final String toString() {
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            long j2 = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("getInterfaceDescriptor(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(j);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(j2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$getInterfaceDescriptor$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$getInterfaceDescriptor$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$getInterfaceDescriptor;", "b", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$getInterfaceDescriptor;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static getInterfaceDescriptor b(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    return new getInterfaceDescriptor(p0.get(TypedValues.TransitionType.S_DURATION).getAsLong(), p0.get("start").getAsLong());
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Download", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Download", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Download", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$write;", "", "", "p0", "p1", "Lcom/datadog/android/rum/model/ResourceEvent$ProviderType;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$ProviderType;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/rum/model/ResourceEvent$ProviderType;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class write {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        final ProviderType TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final String b;

        public write(String str, String str2, ProviderType providerType) {
            this.b = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = providerType;
        }

        public /* synthetic */ write(String str, String str2, ProviderType providerType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : providerType);
        }

        public write() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof write)) {
                return false;
            }
            write writeVar = (write) p0;
            return Intrinsics.areEqual(this.b, writeVar.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public final int hashCode() {
            String str = this.b;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            ProviderType providerType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            return (((iHashCode * 31) + iHashCode2) * 31) + (providerType != null ? providerType.hashCode() : 0);
        }

        public final String toString() {
            String str = this.b;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            ProviderType providerType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("write(b=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(providerType);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$write$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$write$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$write;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$write;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static write TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                String asString;
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    JsonElement jsonElement = p0.get(DynamicLink.Builder.KEY_DOMAIN);
                    ProviderType providerTypeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = p0.get("name");
                    String asString3 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    JsonElement jsonElement3 = p0.get("type");
                    if (jsonElement3 != null && (asString = jsonElement3.getAsString()) != null) {
                        ProviderType.Companion companion = ProviderType.INSTANCE;
                        providerTypeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ProviderType.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asString);
                    }
                    return new write(asString2, asString3, providerTypeTuitionPaymentFragmentspecialinlinedviewModeldefault2);
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelStub;", "", "Lcom/datadog/android/rum/model/ResourceEvent$OperationType;", "p0", "", "p1", "p2", "p3", "<init>", "(Lcom/datadog/android/rum/model/ResourceEvent$OperationType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/rum/model/ResourceEvent$OperationType;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannelStub {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public String b;
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        final OperationType TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public INotificationSideChannelStub(OperationType operationType, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(operationType, "");
            this.TuitionPaymentFragmentbindingInflater1 = operationType;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
            this.b = str3;
        }

        public /* synthetic */ INotificationSideChannelStub(OperationType operationType, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(operationType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof INotificationSideChannelStub)) {
                return false;
            }
            INotificationSideChannelStub iNotificationSideChannelStub = (INotificationSideChannelStub) p0;
            return this.TuitionPaymentFragmentbindingInflater1 == iNotificationSideChannelStub.TuitionPaymentFragmentbindingInflater1 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, iNotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, iNotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, iNotificationSideChannelStub.b);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentbindingInflater1.hashCode();
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.b;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            OperationType operationType = this.TuitionPaymentFragmentbindingInflater1;
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str3 = this.b;
            StringBuilder sb = new StringBuilder("INotificationSideChannelStub(TuitionPaymentFragmentbindingInflater1=");
            sb.append(operationType);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str2);
            sb.append(", b=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$INotificationSideChannelStub$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelStub$b;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelStub;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$INotificationSideChannelStub;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static INotificationSideChannelStub TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonObject p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    OperationType.Companion companion = OperationType.INSTANCE;
                    String asString = p0.get("operationType").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "");
                    OperationType operationTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = OperationType.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asString);
                    JsonElement jsonElement = p0.get("operationName");
                    String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = p0.get("payload");
                    String asString3 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    JsonElement jsonElement3 = p0.get("variables");
                    return new INotificationSideChannelStub(operationTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3, asString2, asString3, jsonElement3 != null ? jsonElement3.getAsString() : null);
                } catch (IllegalStateException e2) {
                    throw new JsonParseException("Unable to parse json into type Graphql", e2);
                } catch (NullPointerException e3) {
                    throw new JsonParseException("Unable to parse json into type Graphql", e3);
                } catch (NumberFormatException e4) {
                    throw new JsonParseException("Unable to parse json into type Graphql", e4);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1() {
                getByteOrder.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0] = builderForDevice.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0];
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "asInterface", "a", "d", "g"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ResourceEventSource {
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
        final String jsonValue;

        ResourceEventSource(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$ResourceEventSource$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource$b;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static ResourceEventSource TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (ResourceEventSource resourceEventSource : ResourceEventSource.values()) {
                    if (Intrinsics.areEqual(resourceEventSource.jsonValue, p0)) {
                        return resourceEventSource;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ResourceEventSessionType {
        USER("user"),
        SYNTHETICS("synthetics"),
        CI_TEST("ci_test");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        final String jsonValue;

        ResourceEventSessionType(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$ResourceEventSessionType$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static ResourceEventSessionType TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (ResourceEventSessionType resourceEventSessionType : ResourceEventSessionType.values()) {
                    if (Intrinsics.areEqual(resourceEventSessionType.jsonValue, p0)) {
                        return resourceEventSessionType;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Status;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "b", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Status {
        CONNECTED("connected"),
        NOT_CONNECTED("not_connected"),
        MAYBE("maybe");


        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        final String jsonValue;

        Status(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$Status$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Status$b;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$Status;", "b", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Status;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static Status b(String p0) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Interface;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "asInterface", "a", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "notify", "asBinder"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
        final String jsonValue;

        Interface(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$Interface$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Interface$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$Interface;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Interface;"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "a", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum EffectiveType {
        SLOW_2G("slow_2g"),
        TuitionPaymentFragmentspecialinlinedviewModeldefault1("2g"),
        TuitionPaymentFragmentbindingInflater1("3g"),
        TuitionPaymentFragmentspecialinlinedviewModeldefault2("4g");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        final String jsonValue;

        EffectiveType(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$EffectiveType$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static EffectiveType TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "g", "asBinder", "a", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum DeviceType {
        MOBILE("mobile"),
        DESKTOP("desktop"),
        TABLET("tablet"),
        TV("tv"),
        GAMING_CONSOLE("gaming_console"),
        BOT("bot"),
        OTHER("other");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        final String jsonValue;

        DeviceType(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$DeviceType$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$DeviceType$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;", "b", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static DeviceType b(String p0) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "onTransact", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "a", "asInterface", "d", "g", "INotificationSideChannel", "asBinder"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ResourceType {
        DOCUMENT("document"),
        XHR("xhr"),
        BEACON("beacon"),
        FETCH(RemoteConfigComponent.FETCH_FILE_NAME),
        CSS("css"),
        JS("js"),
        IMAGE("image"),
        FONT("font"),
        MEDIA("media"),
        OTHER("other"),
        NATIVE("native");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        final String jsonValue;

        ResourceType(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$ResourceType$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceType$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;", "b", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static ResourceType b(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (ResourceType resourceType : ResourceType.values()) {
                    if (Intrinsics.areEqual(resourceType.jsonValue, p0)) {
                        return resourceType;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                getS720pSize.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0] = TagBundle.b[0];
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Method;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asBinder", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "asInterface", "b", "g", "a", "d", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
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


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        final String jsonValue;

        Method(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$Method$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Method$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$Method;", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Method;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static Method TuitionPaymentFragmentbindingInflater1(String p0) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0004\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Plan;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/Number;)V", "jsonValue", "Ljava/lang/Number;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Plan {
        PLAN_1((Number) 1),
        PLAN_2((Number) 2);


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        final Number jsonValue;

        Plan(Number number) {
            this.jsonValue = number;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$Plan$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Plan$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$Plan;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Plan;"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "g", "TuitionPaymentFragmentbindingInflater1", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum SessionPrecondition {
        USER_APP_LAUNCH("user_app_launch"),
        INACTIVITY_TIMEOUT("inactivity_timeout"),
        MAX_DURATION("max_duration"),
        BACKGROUND_LAUNCH("background_launch"),
        PREWARM("prewarm"),
        FROM_NON_INTERACTIVE_SESSION("from_non_interactive_session"),
        EXPLICIT_STOP("explicit_stop");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        final String jsonValue;

        SessionPrecondition(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$SessionPrecondition$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ProviderType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "d", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "asBinder", "INotificationSideChannel", "cancelAll", "cancel", "onTransact", "notify", "INotificationSideChannelStub"}, k = 1, mv = {1, 7, 0}, xi = 48)
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


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        final String jsonValue;

        ProviderType(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$ProviderType$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ProviderType$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$ProviderType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$ProviderType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static ProviderType TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$OperationType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum OperationType {
        QUERY(SearchIntents.EXTRA_QUERY),
        MUTATION("mutation"),
        SUBSCRIPTION("subscription");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        final String jsonValue;

        OperationType(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.model.ResourceEvent$OperationType$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$OperationType$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/rum/model/ResourceEvent$OperationType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$OperationType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static OperationType TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (OperationType operationType : OperationType.values()) {
                    if (Intrinsics.areEqual(operationType.jsonValue, p0)) {
                        return operationType;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public static /* synthetic */ ResourceEvent TuitionPaymentFragmentbindingInflater1(ResourceEvent resourceEvent, getExtras getextras, INotificationSideChannel iNotificationSideChannel) {
        int i = 2 % 2;
        long j = resourceEvent.asBinder;
        b bVar = resourceEvent.TuitionPaymentFragmentbindingInflater1;
        String str = resourceEvent.cancel;
        String str2 = resourceEvent.write;
        String str3 = resourceEvent.b;
        String str4 = resourceEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        connect connectVar = resourceEvent.INotificationSideChannelDefault;
        ResourceEventSource resourceEventSource = resourceEvent.INotificationSideChannelStub;
        IconCompatParcelizer iconCompatParcelizer = resourceEvent.IconCompatParcelizer;
        g gVar = resourceEvent.d;
        onTransact ontransact = resourceEvent.cancelAll;
        getNotifyChildrenChangedOptions getnotifychildrenchangedoptions = resourceEvent.INotificationSideChannelStubProxy;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = resourceEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = resourceEvent.onTransact;
        notify notifyVar = resourceEvent.INotificationSideChannel;
        cancelAll cancelall = resourceEvent.g;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = resourceEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        asInterface asinterface = resourceEvent.a;
        MediaBrowserCompat mediaBrowserCompat = resourceEvent.notify;
        Intrinsics.checkNotNullParameter(bVar, "");
        Intrinsics.checkNotNullParameter(connectVar, "");
        Intrinsics.checkNotNullParameter(iconCompatParcelizer, "");
        Intrinsics.checkNotNullParameter(cancelall, "");
        Intrinsics.checkNotNullParameter(mediaBrowserCompat, "");
        ResourceEvent resourceEvent2 = new ResourceEvent(j, bVar, str, str2, str3, str4, connectVar, resourceEventSource, iconCompatParcelizer, getextras, gVar, ontransact, getnotifychildrenchangedoptions, tuitionPaymentFragmentbindingInflater1, iNotificationSideChannelStubProxy, notifyVar, cancelall, iNotificationSideChannel, tuitionPaymentFragmentspecialinlinedviewModeldefault3, asinterface, mediaBrowserCompat);
        int i2 = getRoot + 97;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 == 0) {
            return resourceEvent2;
        }
        throw null;
    }

    static {
        write = 0;
        TuitionPaymentFragmentbindingInflater1();
        INSTANCE = new Companion(null);
        int i = getExtras + 71;
        write = i % 128;
        int i2 = i % 2;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ResourceEvent)) {
            int i2 = getNotifyChildrenChangedOptions + 7;
            getRoot = i2 % 128;
            return i2 % 2 == 0;
        }
        ResourceEvent resourceEvent = (ResourceEvent) p0;
        if (this.asBinder != resourceEvent.asBinder) {
            int i3 = getNotifyChildrenChangedOptions + 31;
            getRoot = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, resourceEvent.TuitionPaymentFragmentbindingInflater1) || !Intrinsics.areEqual(this.cancel, resourceEvent.cancel) || !Intrinsics.areEqual(this.write, resourceEvent.write) || !Intrinsics.areEqual(this.b, resourceEvent.b) || !Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, resourceEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3) || !Intrinsics.areEqual(this.INotificationSideChannelDefault, resourceEvent.INotificationSideChannelDefault) || this.INotificationSideChannelStub != resourceEvent.INotificationSideChannelStub || !Intrinsics.areEqual(this.IconCompatParcelizer, resourceEvent.IconCompatParcelizer) || !Intrinsics.areEqual(this.RemoteActionCompatParcelizer, resourceEvent.RemoteActionCompatParcelizer)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.d, resourceEvent.d)) {
            int i5 = getRoot + 89;
            getNotifyChildrenChangedOptions = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.cancelAll, resourceEvent.cancelAll)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.INotificationSideChannelStubProxy, resourceEvent.INotificationSideChannelStubProxy)) {
            int i7 = getNotifyChildrenChangedOptions + 71;
            getRoot = i7 % 128;
            return i7 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, resourceEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2) || !Intrinsics.areEqual(this.onTransact, resourceEvent.onTransact) || !Intrinsics.areEqual(this.INotificationSideChannel, resourceEvent.INotificationSideChannel)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.g, resourceEvent.g)) {
            int i8 = getNotifyChildrenChangedOptions + 103;
            getRoot = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.asInterface, resourceEvent.asInterface)) {
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, resourceEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.a, resourceEvent.a) && Intrinsics.areEqual(this.notify, resourceEvent.notify);
        }
        int i10 = getRoot + 15;
        getNotifyChildrenChangedOptions = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i = 2 % 2;
        int iHashCode6 = Long.hashCode(this.asBinder);
        int iHashCode7 = this.TuitionPaymentFragmentbindingInflater1.hashCode();
        String str = this.cancel;
        if (str == null) {
            int i2 = getNotifyChildrenChangedOptions + 95;
            getRoot = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.write;
        if (str2 == null) {
            int i3 = getRoot + 59;
            getNotifyChildrenChangedOptions = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i5 = getRoot + 117;
            getNotifyChildrenChangedOptions = i5 % 128;
            int i6 = i5 % 2;
        }
        String str3 = this.b;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (str4 == null) {
            int i7 = getNotifyChildrenChangedOptions + 93;
            getRoot = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        int iHashCode9 = this.INotificationSideChannelDefault.hashCode();
        ResourceEventSource resourceEventSource = this.INotificationSideChannelStub;
        int iHashCode10 = resourceEventSource == null ? 0 : resourceEventSource.hashCode();
        int iHashCode11 = this.IconCompatParcelizer.hashCode();
        getExtras getextras = this.RemoteActionCompatParcelizer;
        int iHashCode12 = getextras == null ? 0 : getextras.hashCode();
        g gVar = this.d;
        if (gVar == null) {
            int i9 = getRoot + 81;
            getNotifyChildrenChangedOptions = i9 % 128;
            int i10 = i9 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = gVar.hashCode();
            int i11 = getNotifyChildrenChangedOptions + 13;
            getRoot = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 3 / 3;
            }
        }
        onTransact ontransact = this.cancelAll;
        if (ontransact == null) {
            int i13 = getRoot + 3;
            getNotifyChildrenChangedOptions = i13 % 128;
            iHashCode5 = i13 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode5 = ontransact.hashCode();
        }
        getNotifyChildrenChangedOptions getnotifychildrenchangedoptions = this.INotificationSideChannelStubProxy;
        int iHashCode13 = getnotifychildrenchangedoptions == null ? 0 : getnotifychildrenchangedoptions.hashCode();
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode14 = tuitionPaymentFragmentbindingInflater1 == null ? 0 : tuitionPaymentFragmentbindingInflater1.hashCode();
        INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = this.onTransact;
        int iHashCode15 = iNotificationSideChannelStubProxy == null ? 0 : iNotificationSideChannelStubProxy.hashCode();
        notify notifyVar = this.INotificationSideChannel;
        int iHashCode16 = notifyVar == null ? 0 : notifyVar.hashCode();
        int iHashCode17 = this.g.hashCode();
        INotificationSideChannel iNotificationSideChannel = this.asInterface;
        int iHashCode18 = iNotificationSideChannel == null ? 0 : iNotificationSideChannel.hashCode();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode19 = tuitionPaymentFragmentspecialinlinedviewModeldefault3 == null ? 0 : tuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        asInterface asinterface = this.a;
        return (((((((((((((((((((((((((((((((((((((((iHashCode6 * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode8) * 31) + iHashCode3) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (asinterface != null ? asinterface.hashCode() : 0)) * 31) + this.notify.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        long j = this.asBinder;
        b bVar = this.TuitionPaymentFragmentbindingInflater1;
        String str = this.cancel;
        String str2 = this.write;
        String str3 = this.b;
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        connect connectVar = this.INotificationSideChannelDefault;
        ResourceEventSource resourceEventSource = this.INotificationSideChannelStub;
        IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
        getExtras getextras = this.RemoteActionCompatParcelizer;
        g gVar = this.d;
        onTransact ontransact = this.cancelAll;
        getNotifyChildrenChangedOptions getnotifychildrenchangedoptions = this.INotificationSideChannelStubProxy;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = this.onTransact;
        notify notifyVar = this.INotificationSideChannel;
        cancelAll cancelall = this.g;
        INotificationSideChannel iNotificationSideChannel = this.asInterface;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        asInterface asinterface = this.a;
        MediaBrowserCompat mediaBrowserCompat = this.notify;
        StringBuilder sb = new StringBuilder("ResourceEvent(asBinder=");
        sb.append(j);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(bVar);
        sb.append(", cancel=");
        sb.append(str);
        sb.append(", write=");
        sb.append(str2);
        sb.append(", b=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str4);
        sb.append(", INotificationSideChannelDefault=");
        sb.append(connectVar);
        sb.append(", INotificationSideChannelStub=");
        sb.append(resourceEventSource);
        sb.append(", IconCompatParcelizer=");
        sb.append(iconCompatParcelizer);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(getextras);
        sb.append(", d=");
        sb.append(gVar);
        sb.append(", cancelAll=");
        sb.append(ontransact);
        sb.append(", INotificationSideChannelStubProxy=");
        sb.append(getnotifychildrenchangedoptions);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(tuitionPaymentFragmentbindingInflater1);
        sb.append(", onTransact=");
        sb.append(iNotificationSideChannelStubProxy);
        sb.append(", INotificationSideChannel=");
        sb.append(notifyVar);
        sb.append(", g=");
        sb.append(cancelall);
        sb.append(", asInterface=");
        sb.append(iNotificationSideChannel);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", a=");
        sb.append(asinterface);
        sb.append(", notify=");
        sb.append(mediaBrowserCompat);
        sb.append(")");
        String string = sb.toString();
        int i2 = getRoot + 31;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        IconCompatParcelizer = new int[]{-125965815, -1835321329, 517574874, 2081542377, 1027673391, 2063745135, 1393902161, -222985422, 9118241, -1504975150, 253065742, -1722395080, -552775271, -525271870, -500761935, 291376994, -474592534, 1005395854};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r7, byte r8, int r9) {
        /*
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r8 = r8 * 2
            int r8 = r8 + 1
            byte[] r0 = com.datadog.android.rum.model.ResourceEvent.$$c
            int r9 = r9 * 56
            int r9 = 122 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2e
        L16:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L1a:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2e:
            int r7 = r7 + r9
            r9 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.model.ResourceEvent.$$g(int, byte, int):java.lang.String");
    }
}
