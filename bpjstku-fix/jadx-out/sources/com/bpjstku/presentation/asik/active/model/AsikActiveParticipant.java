package com.bpjstku.presentation.asik.active.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bpjstku.domain.asik.model.EmployeeFamily;
import com.bpjstku.domain.asik.model.EmployeeKpj;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b,\u0010-J\r\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u0010\u0003\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020.HÖ\u0001¢\u0006\u0004\b5\u00100J\u0010\u00106\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b6\u00107J\u001d\u0010:\u001a\u0002092\u0006\u0010\u0003\u001a\u0002082\u0006\u0010\u0006\u001a\u00020.¢\u0006\u0004\b:\u0010;R\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u00107R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010=R\u0016\u0010>\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010=R\u0016\u0010G\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010=R\u0016\u0010H\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010=R\u0016\u0010E\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0016\u0010F\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010=R\u0016\u0010K\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010=R\u0016\u0010M\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010=R\u0016\u0010O\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010=R\u0016\u0010Q\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010=R\u0016\u0010S\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010=R\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010AR\u0016\u0010W\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010=R\u0016\u0010C\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bX\u0010=R\u0016\u0010T\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010=R\u0016\u0010@\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010L\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b[\u0010=R\u0016\u0010]\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u0010=R\u0016\u0010^\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010=R\u0016\u0010N\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010=R\u0016\u0010_\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010=R\u0016\u0010`\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bW\u0010=R\u0016\u0010[\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010=R\u0014\u0010J\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010=R\u0016\u0010a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\ba\u0010=R\u0016\u0010b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bb\u0010=R\u0016\u0010X\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010=R\u0016\u0010I\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010=R\u0016\u0010<\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010=R\u0016\u0010V\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010=R\u0018\u0010R\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bM\u0010=R\u0016\u0010Y\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bc\u0010=R\u0016\u0010\\\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b_\u0010=R\u0016\u0010d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b`\u0010=R\u0016\u0010e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b^\u0010="}, d2 = {"Lcom/bpjstku/presentation/asik/active/model/AsikActiveParticipant;", "Landroid/os/Parcelable;", "", "p0", "", "Lcom/bpjstku/domain/asik/model/EmployeeKpj;", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "Lcom/bpjstku/domain/asik/model/EmployeeFamily;", "p13", "p14", "p15", "p16", "", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "p24", "p25", "p26", "p27", "p28", "p29", "p30", "p31", "p32", "p33", "p34", "p35", "p36", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "sendCustomAction", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "getInterfaceDescriptor", "Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "INotificationSideChannelStubProxy", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "d", "asBinder", "TuitionPaymentFragmentbindingInflater1", "asInterface", "disconnect", "getNotifyChildrenChangedOptions", "a", "RemoteActionCompatParcelizer", "g", "connect", "INotificationSideChannel", "MediaBrowserCompatCallbackHandler", "cancel", "getServiceComponent", "cancelAll", "INotificationSideChannelDefault", "onTransact", "getSessionToken", "notify", "getExtras", "isConnected", "[B", "IconCompatParcelizer", FirebaseAnalytics.Event.SEARCH, "INotificationSideChannelStub", "read", "MediaBrowserCompat", "write", "getRoot", "getItem", "unsubscribe", "subscribe", "handleMessage"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AsikActiveParticipant implements Parcelable {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Parcelable.Creator<AsikActiveParticipant> CREATOR;
    private static int setCallbacksMessenger;
    private static long subscribe;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public final String MediaBrowserCompat;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    public final List<EmployeeFamily> onTransact;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    public final String getNotifyChildrenChangedOptions;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    public final String search;

    /* JADX INFO: renamed from: MediaBrowserCompatCallbackHandler, reason: from kotlin metadata */
    private final String cancel;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public final String g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String sendCustomAction;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String disconnect;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String read;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final String getSessionToken;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String getExtras;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public final String INotificationSideChannelDefault;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public final String IconCompatParcelizer;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    public final String INotificationSideChannel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
    public final String asBinder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public String getServiceComponent;

    /* JADX INFO: renamed from: getExtras, reason: from kotlin metadata */
    public final String INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    public final List<EmployeeKpj> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final String getItem;

    /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from kotlin metadata */
    public final String a;
    public final String getRoot;

    /* JADX INFO: renamed from: getServiceComponent, reason: from kotlin metadata */
    private final String cancelAll;

    /* JADX INFO: renamed from: getSessionToken, reason: from kotlin metadata */
    public final String notify;

    /* JADX INFO: renamed from: isConnected, reason: from kotlin metadata */
    public final byte[] getInterfaceDescriptor;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public final String write;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final String connect;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public final String handleMessage;

    /* JADX INFO: renamed from: search, reason: from kotlin metadata */
    public final String INotificationSideChannelStub;

    /* JADX INFO: renamed from: sendCustomAction, reason: from kotlin metadata */
    private final String b;

    /* JADX INFO: renamed from: unsubscribe, reason: from kotlin metadata */
    private final String isConnected;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public final String subscribe;
    private static final byte[] $$d = {29, 88, -118, 32, -14, 0, Base64.padSymbol, -56, 1, -21, 17, -5, -13, 6, 55, -53, -15, 8, -16, 1, 4, 3, 52, -70, -5, 6, Base64.padSymbol, -65, -4, 9, -3, -9, 60, -32, -37, -1, 5, 17, -15, -20, 6, 36, -51, 15, -11, -8, 78, -77, -1, 24, -32, 15, -15, -7, 16, -4, -19, 78, -64};
    private static final int $$e = 64;
    private static final byte[] $$a = {88, 99, -94, -58, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 21;
    private static int MediaBrowserCompatConnectionCallback = 0;
    private static int onConnected = 1;
    private static int handleMessage = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 53 - r6
            int r8 = r8 * 52
            int r8 = 55 - r8
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r0 = com.bpjstku.presentation.asik.active.model.AsikActiveParticipant.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L30
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r7
            r7 = r5
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r3 = r3 + r7
            int r7 = r3 + (-10)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.active.model.AsikActiveParticipant.c(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 99 - r7
            byte[] r0 = com.bpjstku.presentation.asik.active.model.AsikActiveParticipant.$$d
            int r8 = r8 * 55
            int r1 = r8 + 1
            int r6 = r6 * 55
            int r6 = 59 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r6 = r6 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-2)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.active.model.AsikActiveParticipant.f(short, short, short, java.lang.Object[]):void");
    }

    public AsikActiveParticipant(String str, List<EmployeeKpj> list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List<EmployeeFamily> list2, String str13, String str14, String str15, byte[] bArr, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str23, "");
        this.b = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str3;
        this.TuitionPaymentFragmentbindingInflater1 = str4;
        this.asInterface = str5;
        this.d = str6;
        this.asBinder = str7;
        this.a = str8;
        this.g = str9;
        this.INotificationSideChannel = str10;
        this.cancel = str11;
        this.cancelAll = str12;
        this.onTransact = list2;
        this.notify = str13;
        this.INotificationSideChannelStubProxy = str14;
        this.INotificationSideChannelDefault = str15;
        this.getInterfaceDescriptor = bArr;
        this.RemoteActionCompatParcelizer = str16;
        this.INotificationSideChannelStub = str17;
        this.read = str18;
        this.connect = str19;
        this.MediaBrowserCompat = str20;
        this.write = str21;
        this.IconCompatParcelizer = str22;
        this.getNotifyChildrenChangedOptions = str23;
        this.getRoot = str24;
        this.getItem = str25;
        this.getExtras = str26;
        this.disconnect = str27;
        this.sendCustomAction = str28;
        this.getSessionToken = str29;
        this.getServiceComponent = str30;
        this.isConnected = str31;
        this.search = str32;
        this.subscribe = str33;
        this.handleMessage = str34;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AsikActiveParticipant(String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list2, String str13, String str14, String str15, byte[] bArr, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str35;
        String str36;
        String str37;
        String str38;
        byte[] bArr2;
        String str39;
        String str40;
        String str41;
        String str42;
        String str43;
        String str44;
        String str45;
        String str46;
        String str47 = (i & 1) != 0 ? "" : str;
        ArrayList arrayList = (i & 2) != 0 ? new ArrayList() : list;
        String str48 = (i & 4) != 0 ? "" : str2;
        String str49 = (i & 8) != 0 ? "" : str3;
        if ((i & 16) != 0) {
            int i3 = 2 % 2;
            str35 = "";
        } else {
            str35 = str4;
        }
        String str50 = (i & 32) != 0 ? "" : str5;
        String str51 = (i & 64) != 0 ? "" : str6;
        if ((i & 128) != 0) {
            int i4 = onConnected + 71;
            MediaBrowserCompatConnectionCallback = i4 % 128;
            int i5 = i4 % 2;
            str36 = "";
        } else {
            str36 = str7;
        }
        String str52 = (i & 256) != 0 ? "" : str8;
        if ((i & 512) != 0) {
            int i6 = MediaBrowserCompatConnectionCallback + 27;
            onConnected = i6 % 128;
            int i7 = i6 % 2;
            str37 = "";
        } else {
            str37 = str9;
        }
        Object obj = null;
        if ((i & 1024) != 0) {
            int i8 = onConnected + 119;
            MediaBrowserCompatConnectionCallback = i8 % 128;
            if (i8 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str38 = "";
        } else {
            str38 = str10;
        }
        String str53 = (i & 2048) != 0 ? "" : str11;
        String str54 = (i & 4096) != 0 ? "" : str12;
        ArrayList arrayList2 = (i & 8192) != 0 ? new ArrayList() : list2;
        String str55 = (i & 16384) != 0 ? "" : str13;
        String str56 = (i & 32768) != 0 ? "" : str14;
        String str57 = (i & 65536) != 0 ? "" : str15;
        if ((i & 131072) != 0) {
            int i9 = onConnected + 57;
            MediaBrowserCompatConnectionCallback = i9 % 128;
            int i10 = i9 % 2;
            bArr2 = new byte[0];
        } else {
            bArr2 = bArr;
        }
        String str58 = (262144 & i) != 0 ? "" : str16;
        String str59 = (i & 524288) != 0 ? "" : str17;
        if ((i & 1048576) != 0) {
            int i11 = 2 % 2;
            str39 = "";
        } else {
            str39 = str18;
        }
        if ((i & 2097152) != 0) {
            int i12 = onConnected + 3;
            MediaBrowserCompatConnectionCallback = i12 % 128;
            if (i12 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i13 = 2 % 2;
            str40 = "";
        } else {
            str40 = str19;
        }
        String str60 = (4194304 & i) != 0 ? "" : str20;
        if ((i & 8388608) != 0) {
            int i14 = 2 % 2;
            str41 = "";
        } else {
            str41 = str21;
        }
        String str61 = (i & 16777216) != 0 ? "" : str22;
        if ((i & 33554432) != 0) {
            int i15 = MediaBrowserCompatConnectionCallback + 113;
            onConnected = i15 % 128;
            if (i15 % 2 == 0) {
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            str42 = "";
        } else {
            str42 = str23;
        }
        String str62 = (67108864 & i) != 0 ? "" : str24;
        String str63 = (i & 134217728) != 0 ? "" : str25;
        String str64 = (i & 268435456) != 0 ? "" : str26;
        String str65 = (i & 536870912) != 0 ? "" : str27;
        if ((i & BasicMeasure.EXACTLY) != 0) {
            int i16 = MediaBrowserCompatConnectionCallback + 57;
            onConnected = i16 % 128;
            int i17 = i16 % 2;
            str43 = "";
        } else {
            str43 = str28;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            int i18 = onConnected + 45;
            MediaBrowserCompatConnectionCallback = i18 % 128;
            int i19 = i18 % 2;
            str44 = "";
        } else {
            str44 = str29;
        }
        String str66 = (i2 & 1) != 0 ? "" : str30;
        String str67 = (i2 & 2) != 0 ? "" : str31;
        if ((i2 & 4) != 0) {
            int i20 = onConnected + 71;
            MediaBrowserCompatConnectionCallback = i20 % 128;
            int i21 = i20 % 2;
            int i22 = 2 % 2;
            str45 = "";
        } else {
            str45 = str32;
        }
        if ((i2 & 8) != 0) {
            int i23 = MediaBrowserCompatConnectionCallback + 29;
            onConnected = i23 % 128;
            if (i23 % 2 == 0) {
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            str46 = "";
        } else {
            str46 = str33;
        }
        this(str47, arrayList, str48, str49, str35, str50, str51, str36, str52, str37, str38, str53, str54, arrayList2, str55, str56, str57, bArr2, str58, str59, str39, str40, str60, str41, str61, str42, str62, str63, str64, str65, str43, str44, str66, str67, str45, str46, (i2 & 16) != 0 ? "" : str34);
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 19471), TextUtils.indexOf((CharSequence) "", '0') + 2625, Drawable.resolveOpacity(0, 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (subscribe ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - KeyEvent.getDeadChar(0, 0)), 482 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 36 - Process.getGidForName(""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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
            try {
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39423 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), View.combineMeasuredStates(0, 0) + 481, 36 - MotionEvent.axisFromString(""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i4 = $10 + 17;
                $11 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2);
        int i6 = $11 + 79;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 60 / 0;
        }
    }

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cCombineMeasuredStates = (char) (31533 - View.combineMeasuredStates(0, 0));
            int size = 921 - View.MeasureSpec.getSize(0);
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28;
            byte b = $$a[37];
            Object[] objArr2 = new Object[1];
            c((byte) 52, b, b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, size, scrollBarFadeDuration, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{11696, 22418, 55791, 17188, 50442, 20313, 61627, 31428, 64726, 26167, 59453, 4717, 38836, 6635, 33747, 1303, 36716, 12655, 47767, 15593, 42550, 10251}, 31277 - TextUtils.getCapsMode("", 0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{11700, 65070, 35478, 22296, 25582, 3179, 55495, 58502, 45356, 23963, 28163, 15092, 51036, 37835, 49086}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 54163, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31532);
            int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0');
            int iResolveSize = View.resolveSize(0, 0) + 28;
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr5 = new Object[1];
            c(b2, b2, bArr[37], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iLastIndexOf, iResolveSize, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "") + 31533);
                int trimmedLength = 921 - TextUtils.getTrimmedLength("");
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28;
                byte[] bArr2 = $$a;
                byte b3 = bArr2[33];
                byte b4 = bArr2[80];
                Object[] objArr6 = new Object[1];
                c(b3, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, trimmedLength, doubleTapTimeout, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i2 = (int) Runtime.getRuntime().totalMemory();
            int i3 = 1877327291 + (((~(123942233 | i2)) | 1650137410) * 672);
            int i4 = ~i2;
            int i5 = i3 + (((~(i2 | 1650137410)) | (~((-123942234) | i4))) * (-672)) + (((~((-1650137411) | i4)) | 1612187650) * 672) + 630158683;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{11696, 8746, 12959, 796, 5098, 24657, 28875, 16620, 20760, 41372, 46707, 34456, 38764, 59171, 63363, 50179, 54519, 9565, 13791, 1447, 6689, 27264, 31597, 19415, 22600, 43064}, 3989 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{11698, 13439, 7701, 24626, 19160, 44280, 46727, 39277, 58233, 50450, 12083, 12753, 7158, 32175, 17503, 44653, 45070, 39476}, TextUtils.getTrimmedLength("") + 6619, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i8 = MediaBrowserCompatConnectionCallback + 55;
                onConnected = i8 % 128;
                int i9 = i8 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{11707, 44929, 10693, 43811, 9531, 42824, 8342, 41704, 15422, 48710, 14440, 46515, 14318, 45528, 13082, 36195}, 33328 - ExpandableListView.getPackedPositionChild(0L), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{11704, 35680, 24606, 55744, 46833, 28561, 50523, 41595, 6961, 61645, 43504, 1694, 64622, 21871, 12819, 60367}, ExpandableListView.getPackedPositionType(0L) + 42709, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i10 = MediaBrowserCompatConnectionCallback + 59;
            onConnected = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 630158683};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[8];
                Object[] objArr13 = new Object[1];
                f(b5, bArr3[5], b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr3[5];
                Object[] objArr14 = new Object[1];
                f(b6, bArr3[8], b6, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char scrollBarFadeDuration2 = (char) (31533 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    int i12 = 922 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int iAlpha = Color.alpha(0) + 28;
                    byte[] bArr4 = $$a;
                    byte b7 = bArr4[33];
                    byte b8 = bArr4[80];
                    Object[] objArr16 = new Object[1];
                    c(b7, b8, b8, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarFadeDuration2, i12, iAlpha, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    e(new char[]{11696, 22418, 55791, 17188, 50442, 20313, 61627, 31428, 64726, 26167, 59453, 4717, 38836, 6635, 33747, 1303, 36716, 12655, 47767, 15593, 42550, 10251}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31277, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(new char[]{11700, 65070, 35478, 22296, 25582, 3179, 55495, 58502, 45356, 23963, 28163, 15092, 51036, 37835, 49086}, 54163 - Gravity.getAbsoluteGravity(0, 0), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cRed = (char) (Color.red(0) + 31533);
                        int scrollBarFadeDuration3 = 921 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 28;
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        c(b9, b9, bArr5[37], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRed, scrollBarFadeDuration3, longPressTimeout, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char maximumDrawingCacheSize = (char) (31533 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 921;
                        int capsMode = 28 - TextUtils.getCapsMode("", 0, 0);
                        byte b10 = $$a[37];
                        Object[] objArr20 = new Object[1];
                        c((byte) 52, b10, b10, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize, tapTimeout, capsMode, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i16 = i15 + 521480481 + (((~((-201478301) | iIdentityHashCode)) | (~((~iIdentityHashCode) | 1572601343))) * (-318)) + (((~(220453087 | iIdentityHashCode)) | 1352148256) * (-318)) + (((~(iIdentityHashCode | (-220453088))) | (-1553626557)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr21[0])[0] = i18 ^ (i18 << 5);
            return this.b;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr != null) {
            int i19 = MediaBrowserCompatConnectionCallback;
            int i20 = i19 + 17;
            onConnected = i20 % 128;
            int i21 = i20 % 2;
            int i22 = i19 + 45;
            onConnected = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = 5 % 2;
            }
            for (String str : strArr) {
                arrayList.add(str);
            }
        }
        throw new RuntimeException(String.valueOf(i14));
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Parcelable.Creator<AsikActiveParticipant> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AsikActiveParticipant createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(EmployeeKpj.CREATOR.createFromParcel(parcel));
            }
            ArrayList arrayList2 = arrayList;
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
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            int i4 = 0;
            while (i4 != i3) {
                arrayList3.add(EmployeeFamily.CREATOR.createFromParcel(parcel));
                i4++;
                i3 = i3;
            }
            return new AsikActiveParticipant(string, arrayList2, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, arrayList3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AsikActiveParticipant[] newArray(int i) {
            return new AsikActiveParticipant[i];
        }
    }

    public static /* synthetic */ AsikActiveParticipant b(AsikActiveParticipant asikActiveParticipant, String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list2, String str13, String str14, String str15, byte[] bArr, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, int i, int i2) {
        List list3;
        String str35;
        String str36;
        String str37;
        String str38;
        byte[] bArr2;
        String str39;
        String str40;
        String str41;
        int i3 = 2 % 2;
        int i4 = onConnected;
        int i5 = i4 + 35;
        MediaBrowserCompatConnectionCallback = i5 % 128;
        String str42 = (i5 % 2 == 0 && (i & 1) != 0) ? asikActiveParticipant.b : str;
        if ((i & 2) != 0) {
            int i6 = i4 + 89;
            MediaBrowserCompatConnectionCallback = i6 % 128;
            int i7 = i6 % 2;
            list3 = asikActiveParticipant.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        } else {
            list3 = list;
        }
        String str43 = (i & 4) != 0 ? asikActiveParticipant.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : str2;
        String str44 = (i & 8) != 0 ? asikActiveParticipant.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : str3;
        String str45 = (i & 16) != 0 ? asikActiveParticipant.TuitionPaymentFragmentbindingInflater1 : str4;
        String str46 = (i & 32) != 0 ? asikActiveParticipant.asInterface : str5;
        String str47 = (i & 64) != 0 ? asikActiveParticipant.d : str6;
        String str48 = (i & 128) != 0 ? asikActiveParticipant.asBinder : str7;
        String str49 = (i & 256) != 0 ? asikActiveParticipant.a : str8;
        Object obj = null;
        if ((i & 512) != 0) {
            int i8 = MediaBrowserCompatConnectionCallback + 121;
            onConnected = i8 % 128;
            if (i8 % 2 == 0) {
                String str50 = asikActiveParticipant.g;
                obj.hashCode();
                throw null;
            }
            str35 = asikActiveParticipant.g;
        } else {
            str35 = str9;
        }
        if ((i & 1024) != 0) {
            int i9 = onConnected + 99;
            MediaBrowserCompatConnectionCallback = i9 % 128;
            if (i9 % 2 != 0) {
                String str51 = asikActiveParticipant.INotificationSideChannel;
                obj.hashCode();
                throw null;
            }
            str36 = asikActiveParticipant.INotificationSideChannel;
        } else {
            str36 = str10;
        }
        String str52 = (i & 2048) != 0 ? asikActiveParticipant.cancel : str11;
        String str53 = (i & 4096) != 0 ? asikActiveParticipant.cancelAll : str12;
        List list4 = (i & 8192) != 0 ? asikActiveParticipant.onTransact : list2;
        String str54 = str53;
        String str55 = (i & 16384) != 0 ? asikActiveParticipant.notify : str13;
        String str56 = (i & 32768) != 0 ? asikActiveParticipant.INotificationSideChannelStubProxy : str14;
        if ((i & 65536) != 0) {
            int i10 = onConnected + 7;
            MediaBrowserCompatConnectionCallback = i10 % 128;
            int i11 = i10 % 2;
            str37 = asikActiveParticipant.INotificationSideChannelDefault;
        } else {
            str37 = str15;
        }
        byte[] bArr3 = (131072 & i) != 0 ? asikActiveParticipant.getInterfaceDescriptor : bArr;
        if ((i & 262144) != 0) {
            bArr2 = bArr3;
            int i12 = MediaBrowserCompatConnectionCallback + 99;
            str38 = str37;
            onConnected = i12 % 128;
            int i13 = i12 % 2;
            str39 = asikActiveParticipant.RemoteActionCompatParcelizer;
            if (i13 == 0) {
                int i14 = 54 / 0;
            }
        } else {
            str38 = str37;
            bArr2 = bArr3;
            str39 = str16;
        }
        String str57 = (524288 & i) != 0 ? asikActiveParticipant.INotificationSideChannelStub : str17;
        String str58 = (i & 1048576) != 0 ? asikActiveParticipant.read : str18;
        String str59 = (i & 2097152) != 0 ? asikActiveParticipant.connect : str19;
        String str60 = (i & 4194304) != 0 ? asikActiveParticipant.MediaBrowserCompat : str20;
        String str61 = (i & 8388608) != 0 ? asikActiveParticipant.write : str21;
        String str62 = (i & 16777216) != 0 ? asikActiveParticipant.IconCompatParcelizer : str22;
        String str63 = (i & 33554432) != 0 ? asikActiveParticipant.getNotifyChildrenChangedOptions : str23;
        if ((i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            int i15 = MediaBrowserCompatConnectionCallback + 75;
            onConnected = i15 % 128;
            int i16 = i15 % 2;
            str40 = asikActiveParticipant.getRoot;
        } else {
            str40 = str24;
        }
        String str64 = (134217728 & i) != 0 ? asikActiveParticipant.getItem : str25;
        String str65 = (i & 268435456) != 0 ? asikActiveParticipant.getExtras : str26;
        String str66 = (i & 536870912) != 0 ? asikActiveParticipant.disconnect : str27;
        String str67 = (i & BasicMeasure.EXACTLY) != 0 ? asikActiveParticipant.sendCustomAction : str28;
        String str68 = (i & Integer.MIN_VALUE) != 0 ? asikActiveParticipant.getSessionToken : str29;
        String str69 = (i2 & 1) != 0 ? asikActiveParticipant.getServiceComponent : str30;
        if ((i2 & 2) != 0) {
            int i17 = MediaBrowserCompatConnectionCallback + 67;
            onConnected = i17 % 128;
            if (i17 % 2 == 0) {
                String str70 = asikActiveParticipant.isConnected;
                throw null;
            }
            str41 = asikActiveParticipant.isConnected;
        } else {
            str41 = str31;
        }
        String str71 = (i2 & 4) != 0 ? asikActiveParticipant.search : str32;
        String str72 = (i2 & 8) != 0 ? asikActiveParticipant.subscribe : str33;
        if ((i2 & 16) != 0) {
            str34 = asikActiveParticipant.handleMessage;
        }
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(str63, "");
        return new AsikActiveParticipant(str42, list3, str43, str44, str45, str46, str47, str48, str49, str35, str36, str52, str54, list4, str55, str56, str38, bArr2, str39, str57, str58, str59, str60, str61, str62, str63, str40, str64, str65, str66, str67, str68, str69, str41, str71, str72, str34);
    }

    static {
        setCallbacksMessenger = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = handleMessage + 57;
        setCallbacksMessenger = i % 128;
        int i2 = i % 2;
    }

    public AsikActiveParticipant() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatConnectionCallback;
        int i3 = i2 + 33;
        onConnected = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 55;
        onConnected = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = onConnected + 77;
        MediaBrowserCompatConnectionCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AsikActiveParticipant)) {
            return false;
        }
        AsikActiveParticipant asikActiveParticipant = (AsikActiveParticipant) p0;
        if (!Intrinsics.areEqual(this.b, asikActiveParticipant.b)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, asikActiveParticipant.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            int i3 = onConnected + 85;
            MediaBrowserCompatConnectionCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, asikActiveParticipant.TuitionPaymentFragmentspecialinlinedviewModeldefault2) || !Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, asikActiveParticipant.TuitionPaymentFragmentspecialinlinedviewModeldefault1) || !Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, asikActiveParticipant.TuitionPaymentFragmentbindingInflater1) || (!Intrinsics.areEqual(this.asInterface, asikActiveParticipant.asInterface)) || !Intrinsics.areEqual(this.d, asikActiveParticipant.d)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asBinder, asikActiveParticipant.asBinder)) {
            int i5 = onConnected + 23;
            MediaBrowserCompatConnectionCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.a, asikActiveParticipant.a) || !Intrinsics.areEqual(this.g, asikActiveParticipant.g) || !Intrinsics.areEqual(this.INotificationSideChannel, asikActiveParticipant.INotificationSideChannel)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.cancel, asikActiveParticipant.cancel)) {
            int i7 = MediaBrowserCompatConnectionCallback + 119;
            onConnected = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.cancelAll, asikActiveParticipant.cancelAll)) {
            int i9 = MediaBrowserCompatConnectionCallback + 93;
            onConnected = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onTransact, asikActiveParticipant.onTransact) || !Intrinsics.areEqual(this.notify, asikActiveParticipant.notify)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.INotificationSideChannelStubProxy, asikActiveParticipant.INotificationSideChannelStubProxy)) {
            int i11 = MediaBrowserCompatConnectionCallback + 123;
            onConnected = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.INotificationSideChannelDefault, asikActiveParticipant.INotificationSideChannelDefault) || !Intrinsics.areEqual(this.getInterfaceDescriptor, asikActiveParticipant.getInterfaceDescriptor) || !Intrinsics.areEqual(this.RemoteActionCompatParcelizer, asikActiveParticipant.RemoteActionCompatParcelizer) || !Intrinsics.areEqual(this.INotificationSideChannelStub, asikActiveParticipant.INotificationSideChannelStub) || !Intrinsics.areEqual(this.read, asikActiveParticipant.read)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.connect, asikActiveParticipant.connect)) {
            int i13 = onConnected + 3;
            MediaBrowserCompatConnectionCallback = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.MediaBrowserCompat, asikActiveParticipant.MediaBrowserCompat) || !Intrinsics.areEqual(this.write, asikActiveParticipant.write)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IconCompatParcelizer, asikActiveParticipant.IconCompatParcelizer)) {
            int i15 = onConnected + 123;
            MediaBrowserCompatConnectionCallback = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.getNotifyChildrenChangedOptions, asikActiveParticipant.getNotifyChildrenChangedOptions) || !Intrinsics.areEqual(this.getRoot, asikActiveParticipant.getRoot) || !Intrinsics.areEqual(this.getItem, asikActiveParticipant.getItem) || !Intrinsics.areEqual(this.getExtras, asikActiveParticipant.getExtras)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.disconnect, asikActiveParticipant.disconnect)) {
            int i17 = onConnected + 35;
            MediaBrowserCompatConnectionCallback = i17 % 128;
            return i17 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.sendCustomAction, asikActiveParticipant.sendCustomAction) || !Intrinsics.areEqual(this.getSessionToken, asikActiveParticipant.getSessionToken)) {
            return false;
        }
        if (Intrinsics.areEqual(this.getServiceComponent, asikActiveParticipant.getServiceComponent)) {
            return Intrinsics.areEqual(this.isConnected, asikActiveParticipant.isConnected) && Intrinsics.areEqual(this.search, asikActiveParticipant.search) && Intrinsics.areEqual(this.subscribe, asikActiveParticipant.subscribe) && !(Intrinsics.areEqual(this.handleMessage, asikActiveParticipant.handleMessage) ^ true);
        }
        int i18 = onConnected + 47;
        MediaBrowserCompatConnectionCallback = i18 % 128;
        int i19 = i18 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int iHashCode7;
        int i = 2 % 2;
        int i2 = onConnected;
        int i3 = i2 + 37;
        MediaBrowserCompatConnectionCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.b;
        int iHashCode8 = 1;
        if (str == null) {
            int i5 = i2 + 61;
            MediaBrowserCompatConnectionCallback = i5 % 128;
            iHashCode = i5 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode9 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode11 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.TuitionPaymentFragmentbindingInflater1;
        int iHashCode12 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.asInterface;
        int iHashCode13 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.d;
        int iHashCode14 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.asBinder;
        int iHashCode15 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.a;
        int iHashCode16 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.g;
        if (str9 == null) {
            int i6 = onConnected + 103;
            MediaBrowserCompatConnectionCallback = i6 % 128;
            if (i6 % 2 == 0) {
                iHashCode8 = 0;
            }
        } else {
            iHashCode8 = str9.hashCode();
        }
        String str10 = this.INotificationSideChannel;
        int iHashCode17 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.cancel;
        int iHashCode18 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.cancelAll;
        int iHashCode19 = str12 == null ? 0 : str12.hashCode();
        int iHashCode20 = this.onTransact.hashCode();
        String str13 = this.notify;
        int iHashCode21 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.INotificationSideChannelStubProxy;
        int iHashCode22 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.INotificationSideChannelDefault;
        int iHashCode23 = str15 == null ? 0 : str15.hashCode();
        byte[] bArr = this.getInterfaceDescriptor;
        int iHashCode24 = bArr == null ? 0 : Arrays.hashCode(bArr);
        String str16 = this.RemoteActionCompatParcelizer;
        int iHashCode25 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.INotificationSideChannelStub;
        if (str17 == null) {
            int i7 = MediaBrowserCompatConnectionCallback + 29;
            onConnected = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str17.hashCode();
        }
        String str18 = this.read;
        if (str18 == null) {
            int i9 = MediaBrowserCompatConnectionCallback + 19;
            onConnected = i9 % 128;
            int i10 = i9 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str18.hashCode();
        }
        String str19 = this.connect;
        int iHashCode26 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.MediaBrowserCompat;
        int iHashCode27 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.write;
        int iHashCode28 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.IconCompatParcelizer;
        int iHashCode29 = str22 == null ? 0 : str22.hashCode();
        int iHashCode30 = this.getNotifyChildrenChangedOptions.hashCode();
        String str23 = this.getRoot;
        if (str23 == null) {
            int i11 = MediaBrowserCompatConnectionCallback + 101;
            onConnected = i11 % 128;
            int i12 = i11 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str23.hashCode();
        }
        String str24 = this.getItem;
        int iHashCode31 = str24 == null ? 0 : str24.hashCode();
        String str25 = this.getExtras;
        int iHashCode32 = str25 == null ? 0 : str25.hashCode();
        String str26 = this.disconnect;
        int iHashCode33 = str26 == null ? 0 : str26.hashCode();
        String str27 = this.sendCustomAction;
        int iHashCode34 = str27 == null ? 0 : str27.hashCode();
        String str28 = this.getSessionToken;
        if (str28 == null) {
            int i13 = MediaBrowserCompatConnectionCallback + 43;
            onConnected = i13 % 128;
            int i14 = i13 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str28.hashCode();
        }
        String str29 = this.getServiceComponent;
        int iHashCode35 = str29 == null ? 0 : str29.hashCode();
        String str30 = this.isConnected;
        int iHashCode36 = str30 == null ? 0 : str30.hashCode();
        String str31 = this.search;
        if (str31 == null) {
            int i15 = MediaBrowserCompatConnectionCallback + 55;
            onConnected = i15 % 128;
            int i16 = i15 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = str31.hashCode();
        }
        String str32 = this.subscribe;
        if (str32 == null) {
            int i17 = onConnected + 55;
            MediaBrowserCompatConnectionCallback = i17 % 128;
            int i18 = i17 % 2;
            iHashCode7 = 0;
        } else {
            iHashCode7 = str32.hashCode();
        }
        String str33 = this.handleMessage;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode8) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode4) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode5) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str33 != null ? str33.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.b;
        List<EmployeeKpj> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str4 = this.TuitionPaymentFragmentbindingInflater1;
        String str5 = this.asInterface;
        String str6 = this.d;
        String str7 = this.asBinder;
        String str8 = this.a;
        String str9 = this.g;
        String str10 = this.INotificationSideChannel;
        String str11 = this.cancel;
        String str12 = this.cancelAll;
        List<EmployeeFamily> list2 = this.onTransact;
        String str13 = this.notify;
        String str14 = this.INotificationSideChannelStubProxy;
        String str15 = this.INotificationSideChannelDefault;
        String string = Arrays.toString(this.getInterfaceDescriptor);
        String str16 = this.RemoteActionCompatParcelizer;
        String str17 = this.INotificationSideChannelStub;
        String str18 = this.read;
        String str19 = this.connect;
        String str20 = this.MediaBrowserCompat;
        String str21 = this.write;
        String str22 = this.IconCompatParcelizer;
        String str23 = this.getNotifyChildrenChangedOptions;
        String str24 = this.getRoot;
        String str25 = this.getItem;
        String str26 = this.getExtras;
        String str27 = this.disconnect;
        String str28 = this.sendCustomAction;
        String str29 = this.getSessionToken;
        String str30 = this.getServiceComponent;
        String str31 = this.isConnected;
        String str32 = this.search;
        String str33 = this.subscribe;
        String str34 = this.handleMessage;
        StringBuilder sb = new StringBuilder("AsikActiveParticipant(b=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(list);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str4);
        sb.append(", asInterface=");
        sb.append(str5);
        sb.append(", d=");
        sb.append(str6);
        sb.append(", asBinder=");
        sb.append(str7);
        sb.append(", a=");
        sb.append(str8);
        sb.append(", g=");
        sb.append(str9);
        sb.append(", INotificationSideChannel=");
        sb.append(str10);
        sb.append(", cancel=");
        sb.append(str11);
        sb.append(", cancelAll=");
        sb.append(str12);
        sb.append(", onTransact=");
        sb.append(list2);
        sb.append(", notify=");
        sb.append(str13);
        sb.append(", INotificationSideChannelStubProxy=");
        sb.append(str14);
        sb.append(", INotificationSideChannelDefault=");
        sb.append(str15);
        sb.append(", getInterfaceDescriptor=");
        sb.append(string);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str16);
        sb.append(", INotificationSideChannelStub=");
        sb.append(str17);
        sb.append(", read=");
        sb.append(str18);
        sb.append(", connect=");
        sb.append(str19);
        sb.append(", MediaBrowserCompat=");
        sb.append(str20);
        sb.append(", write=");
        sb.append(str21);
        sb.append(", IconCompatParcelizer=");
        sb.append(str22);
        sb.append(", getNotifyChildrenChangedOptions=");
        sb.append(str23);
        sb.append(", getRoot=");
        sb.append(str24);
        sb.append(", getItem=");
        sb.append(str25);
        sb.append(", getExtras=");
        sb.append(str26);
        sb.append(", disconnect=");
        sb.append(str27);
        sb.append(", sendCustomAction=");
        sb.append(str28);
        sb.append(", getSessionToken=");
        sb.append(str29);
        sb.append(", getServiceComponent=");
        sb.append(str30);
        sb.append(", isConnected=");
        sb.append(str31);
        sb.append(", search=");
        sb.append(str32);
        sb.append(", subscribe=");
        sb.append(str33);
        sb.append(", handleMessage=");
        sb.append(str34);
        sb.append(")");
        String string2 = sb.toString();
        int i2 = MediaBrowserCompatConnectionCallback + 73;
        onConnected = i2 % 128;
        int i3 = i2 % 2;
        return string2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatConnectionCallback + 83;
        onConnected = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(p0, "");
        if (i3 == 0) {
            p0.writeString(this.b);
            List<EmployeeKpj> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            p0.writeInt(list.size());
            list.iterator();
            obj.hashCode();
            throw null;
        }
        p0.writeString(this.b);
        List<EmployeeKpj> list2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        p0.writeInt(list2.size());
        Iterator<EmployeeKpj> it = list2.iterator();
        while (it.hasNext()) {
            int i4 = onConnected + 19;
            MediaBrowserCompatConnectionCallback = i4 % 128;
            if (i4 % 2 != 0) {
                it.next().writeToParcel(p0, p1);
                obj.hashCode();
                throw null;
            }
            it.next().writeToParcel(p0, p1);
        }
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.asInterface);
        p0.writeString(this.d);
        p0.writeString(this.asBinder);
        p0.writeString(this.a);
        p0.writeString(this.g);
        p0.writeString(this.INotificationSideChannel);
        p0.writeString(this.cancel);
        p0.writeString(this.cancelAll);
        List<EmployeeFamily> list3 = this.onTransact;
        p0.writeInt(list3.size());
        Iterator<EmployeeFamily> it2 = list3.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(p0, p1);
        }
        p0.writeString(this.notify);
        p0.writeString(this.INotificationSideChannelStubProxy);
        p0.writeString(this.INotificationSideChannelDefault);
        p0.writeByteArray(this.getInterfaceDescriptor);
        p0.writeString(this.RemoteActionCompatParcelizer);
        p0.writeString(this.INotificationSideChannelStub);
        p0.writeString(this.read);
        p0.writeString(this.connect);
        p0.writeString(this.MediaBrowserCompat);
        p0.writeString(this.write);
        p0.writeString(this.IconCompatParcelizer);
        p0.writeString(this.getNotifyChildrenChangedOptions);
        p0.writeString(this.getRoot);
        p0.writeString(this.getItem);
        p0.writeString(this.getExtras);
        p0.writeString(this.disconnect);
        p0.writeString(this.sendCustomAction);
        p0.writeString(this.getSessionToken);
        p0.writeString(this.getServiceComponent);
        p0.writeString(this.isConnected);
        p0.writeString(this.search);
        p0.writeString(this.subscribe);
        p0.writeString(this.handleMessage);
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        subscribe = -4519415117691255606L;
    }
}
