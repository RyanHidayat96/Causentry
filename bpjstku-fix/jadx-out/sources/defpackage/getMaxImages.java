package defpackage;

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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.Firebase;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.RemoteConfigKt;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b7\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\tJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\tJ\r\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\tJ\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\tJ\r\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\tJ\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\tJ\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\tJ\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\tJ\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\tJ\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\tJ\r\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\tJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001d\u0010\u0019J\u000f\u0010\u001e\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001e\u0010\u0019J\u000f\u0010\u001f\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001f\u0010\u0019J\u000f\u0010 \u001a\u00020\u0017H\u0007¢\u0006\u0004\b \u0010\u0019J\u000f\u0010!\u001a\u00020\u0017H\u0007¢\u0006\u0004\b!\u0010\u0019J\u000f\u0010\"\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\"\u0010\u0019J\u000f\u0010#\u001a\u00020\u0017H\u0007¢\u0006\u0004\b#\u0010\u0019J\u000f\u0010$\u001a\u00020\u0017H\u0007¢\u0006\u0004\b$\u0010\u0019J\u000f\u0010%\u001a\u00020\u0017H\u0007¢\u0006\u0004\b%\u0010\u0019J\u000f\u0010&\u001a\u00020\u0017H\u0007¢\u0006\u0004\b&\u0010\u0019J\u000f\u0010'\u001a\u00020\u0017H\u0007¢\u0006\u0004\b'\u0010\u0019J\u000f\u0010(\u001a\u00020\u0017H\u0007¢\u0006\u0004\b(\u0010\u0019J\u000f\u0010)\u001a\u00020\u0017H\u0007¢\u0006\u0004\b)\u0010\u0019J\u000f\u0010*\u001a\u00020\u0017H\u0007¢\u0006\u0004\b*\u0010\u0019J\u000f\u0010+\u001a\u00020\u0017H\u0007¢\u0006\u0004\b+\u0010\u0019J\u000f\u0010,\u001a\u00020\u0017H\u0007¢\u0006\u0004\b,\u0010\u0019J\u000f\u0010-\u001a\u00020\u0017H\u0007¢\u0006\u0004\b-\u0010\u0019J\u000f\u0010.\u001a\u00020\u0017H\u0007¢\u0006\u0004\b.\u0010\u0019J\u000f\u0010/\u001a\u00020\u0017H\u0007¢\u0006\u0004\b/\u0010\u0019J\u000f\u00100\u001a\u00020\u0017H\u0007¢\u0006\u0004\b0\u0010\u0019J\u000f\u00101\u001a\u00020\u0017H\u0007¢\u0006\u0004\b1\u0010\u0019J\u000f\u00102\u001a\u00020\u0017H\u0007¢\u0006\u0004\b2\u0010\u0019J\u000f\u00103\u001a\u00020\u0017H\u0007¢\u0006\u0004\b3\u0010\u0019J\u000f\u00104\u001a\u00020\u0017H\u0007¢\u0006\u0004\b4\u0010\u0019J\u000f\u00105\u001a\u00020\u0017H\u0007¢\u0006\u0004\b5\u0010\u0019J\u000f\u00106\u001a\u00020\u0017H\u0007¢\u0006\u0004\b6\u0010\u0019J\u000f\u00107\u001a\u00020\u0017H\u0007¢\u0006\u0004\b7\u0010\u0019J\u000f\u00108\u001a\u00020\u0017H\u0007¢\u0006\u0004\b8\u0010\u0019J\u000f\u00109\u001a\u00020\u0017H\u0007¢\u0006\u0004\b9\u0010\u0019J\u000f\u0010:\u001a\u00020\u0017H\u0007¢\u0006\u0004\b:\u0010\u0019J\u000f\u0010;\u001a\u00020\u0017H\u0007¢\u0006\u0004\b;\u0010\u0019J\u000f\u0010<\u001a\u00020\u0017H\u0007¢\u0006\u0004\b<\u0010\u0019J\u000f\u0010=\u001a\u00020\u0017H\u0007¢\u0006\u0004\b=\u0010\u0019J\u000f\u0010>\u001a\u00020\u0017H\u0007¢\u0006\u0004\b>\u0010\u0019J\u000f\u0010?\u001a\u00020\u0017H\u0007¢\u0006\u0004\b?\u0010\u0019J\u000f\u0010@\u001a\u00020\u0017H\u0007¢\u0006\u0004\b@\u0010\u0019J\u000f\u0010A\u001a\u00020\u0017H\u0007¢\u0006\u0004\bA\u0010\u0019J\u000f\u0010B\u001a\u00020\u0017H\u0007¢\u0006\u0004\bB\u0010\u0019J\u000f\u0010C\u001a\u00020\u0017H\u0007¢\u0006\u0004\bC\u0010\u0019J\u000f\u0010D\u001a\u00020\u0017H\u0007¢\u0006\u0004\bD\u0010\u0019J\u000f\u0010E\u001a\u00020\u0017H\u0007¢\u0006\u0004\bE\u0010\u0019J\u000f\u0010F\u001a\u00020\u0017H\u0007¢\u0006\u0004\bF\u0010\u0019J\u000f\u0010G\u001a\u00020\u0017H\u0007¢\u0006\u0004\bG\u0010\u0019J\u000f\u0010H\u001a\u00020\u0017H\u0007¢\u0006\u0004\bH\u0010\u0019J\u000f\u0010I\u001a\u00020\u0017H\u0007¢\u0006\u0004\bI\u0010\u0019J\r\u0010J\u001a\u00020\u0007¢\u0006\u0004\bJ\u0010\tJ\u000f\u0010K\u001a\u00020\u0017H\u0007¢\u0006\u0004\bK\u0010\u0019J\u000f\u0010L\u001a\u00020\u0017H\u0007¢\u0006\u0004\bL\u0010\u0019J\u000f\u0010M\u001a\u00020\u0017H\u0007¢\u0006\u0004\bM\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0005\u0010N"}, d2 = {"LgetMaxImages;", "", "<init>", "()V", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "", "getInterfaceDescriptor", "()Z", "INotificationSideChannelStub", "onProgressUpdate", "unsubscribe", "asInterface", "MediaBrowserCompatItemCallback", "onConnected", "MediaBrowserCompatMediaBrowserImplApi216", "MediaBrowserCompatMediaBrowserImplApi217", "setInternalConnectionCallback", "MediaBrowserCompatConnectionCallback", "onConnectionFailed", "a", "onConnectionSuspended", "", "read", "()Ljava/lang/String;", "write", "IconCompatParcelizer", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentbindingInflater1", "asBinder", "setCallbacksMessenger", "handleMessage", "getNotifyChildrenChangedOptions", "MediaBrowserCompatCallbackHandler", "subscribe", "getRoot", "getItem", "onResult", "INotificationSideChannelStubProxy", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "d", "MediaBrowserCompatMediaBrowserImplApi213", "MediaBrowserCompatItemReceiver", "getSessionToken", "isConnected", "getExtras", "MediaBrowserCompatCustomActionCallback", "cancel", "cancelAll", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatMediaBrowserImplApi212", "RemoteActionCompatParcelizer", "sendCustomAction", FirebaseAnalytics.Event.SEARCH, "getServiceComponent", "run", "onServiceConnected", "INotificationSideChannelDefault", "disconnect", "MediaBrowserCompatMediaBrowserImplApi215", "MediaBrowserCompatMediaBrowserImplApi211", "MediaBrowserCompatMediaBrowserImplApi214", "MediaBrowserCompatMediaBrowserImpl", "MediaBrowserCompatConnectionCallbackStubApi21", "MediaBrowserCompatMediaBrowserImplApi21", "MediaBrowserCompat", "connect", "onReceiveResult", "MediaBrowserCompatItemCallbackStubApi23", "onLoadChildren", "onTransact", "onError", "MediaBrowserCompatConnectionCallbackConnectionCallbackInternal", "INotificationSideChannel", "onItemLoaded", "b", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getMaxImages {
    public static final getMaxImages INSTANCE;
    private static int INotificationSideChannel;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static FirebaseRemoteConfig TuitionPaymentFragmentbindingInflater1;
    private static int b;
    private static short[] d;
    private static byte[] g;
    private static final byte[] $$c = {60, 80, 13, 34};
    private static final int $$f = 107;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {21, -108, 100, 114, -13, 1, 62, -52, -14, 9, -15, 2, 5, 4, 53, -73, 6, 2, -1, 6, -21, 74, -20, -51, -7, 10, 10, 16, -20, -13, -5, 15, -15, -2, 34, -37, 15, -17, 15, -34, 11, -12, 10, -7, 0, 29, -18, -25, 11, 7, -10, -7, 45, -45, 16, -7, -7, 7, -10, -7, 0, 2, 10, 1, -7, 7, -12, 2, -6, 1, 2, -6, 8, 0, -19, 12, 3, -19, 41, -35, 10, -2, -8, 7, -2, -2, 4, -21, 8, -9, 65, -13, 1, 62, -58, -9, -1, 7, -6, 6, 54, -52, -14, 9, -15, 2, 5, 4, 53, -64, 11, -20, 14, -14, 8, 7, -12, Base64.padSymbol, -57, -7, -4, 13, -20, 10, -6, 6, 5, -3, -18, 10, -7, 0, 11, -20, 0, -1, 4, 0, 63, -25, -39, -4, 13, -20, 10, -6, 6, 37, -35, -18, 10, -7, 0, 43, -52, 0, -1, 4, 0, 36, -37, -4, 3, 71, -19};
    private static final int $$e = 234;
    private static final byte[] $$a = {68, 104, -93, -37, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55, 28, -32, 47, 16, -5, 23, -2, 5, 12, 12, 28, -39, 49, 15, 0, 11, 23};
    private static final int $$b = 92;
    private static int asInterface = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f954a = 0;
    private static int asBinder = 1;

    public static /* synthetic */ Object b(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~((~i3) | i7);
        int i9 = ~(i2 | i7);
        int i10 = i8 | i9;
        int i11 = i9 | i3;
        int i12 = ~(i7 | i3);
        int i13 = i6 + i3 + i + (1577873432 * i5) + (977123338 * i4);
        int i14 = i13 * i13;
        int i15 = (((-1026819430) * i6) - 865599488) + ((-647756440) * i3) + (i10 * 189531495) + ((-189531495) * i11) + (189531495 * i12) + ((-837287936) * i) + ((-767557632) * i5) + (1290797056 * i4) + ((-539361280) * i14);
        int i16 = (i6 * (-1177406726)) + 1326046462 + (i3 * (-1177405720)) + (i10 * TypedValues.PositionType.TYPE_PERCENT_WIDTH) + (i11 * (-503)) + (i12 * TypedValues.PositionType.TYPE_PERCENT_WIDTH) + (i * (-1177406223)) + (i5 * 1546282648) + (i4 * (-1884272278)) + (i14 * 70909952);
        switch (i15 + (i16 * i16 * 451280896)) {
            case 1:
                return b(objArr);
            case 2:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 3:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            case 4:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 5:
                return a(objArr);
            case 6:
                return g(objArr);
            case 7:
                return d(objArr);
            case 8:
                return asBinder(objArr);
            case 9:
                return asInterface(objArr);
            case 10:
                return INotificationSideChannel(objArr);
            case 11:
                return cancel(objArr);
            case 12:
                return notify(objArr);
            default:
                return TuitionPaymentFragmentbindingInflater1(objArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 + 1
            byte[] r1 = defpackage.getMaxImages.$$a
            int r6 = r6 + 4
            int r8 = 100 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L10
            r3 = r6
            r4 = r2
            goto L2a
        L10:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r8 = r8 + 1
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2a:
            int r6 = r6 + r8
            int r6 = r6 + (-10)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getMaxImages.c(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 15
            int r5 = r5 + 84
            int r7 = r7 + 4
            int r6 = r6 + 36
            byte[] r0 = defpackage.getMaxImages.$$d
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r7]
        L24:
            int r4 = -r4
            int r7 = r7 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getMaxImages.f(short, byte, short, java.lang.Object[]):void");
    }

    private getMaxImages() {
    }

    public static final class b implements ConfigUpdateListener {
        private /* synthetic */ FirebaseRemoteConfig b;

        b(FirebaseRemoteConfig firebaseRemoteConfig) {
            this.b = firebaseRemoteConfig;
        }

        @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
        public final void onUpdate(ConfigUpdate configUpdate) {
            Intrinsics.checkNotNullParameter(configUpdate, "");
            this.b.fetchAndActivate();
        }

        @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
        public final void onError(FirebaseRemoteConfigException firebaseRemoteConfigException) {
            Intrinsics.checkNotNullParameter(firebaseRemoteConfigException, "");
        }
    }

    public static FirebaseRemoteConfig TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        FirebaseRemoteConfig remoteConfig = RemoteConfigKt.getRemoteConfig(Firebase.INSTANCE);
        remoteConfig.setConfigSettingsAsync(com.google.firebase.remoteconfig.ktx.RemoteConfigKt.remoteConfigSettings(new Function1() { // from class: AndroidImageReaderProxyExternalSyntheticLambda0
            private static final byte[] $$c = {38, 31, -70, -1};
            private static final int $$f = 197;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {111, 40, 23, -13, 53, 3, 23, 12, -39, 54, 9, 16, 8, 7, 7, 10, 3, 23, -39, 53, 3, 23, 12, -26, 27, 27, -7, 22, 16, -54, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
            private static final int $$e = 163;
            private static final byte[] $$a = {32, 1, 70, -122, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
            private static final int $$b = 118;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int asBinder = 1;
            private static char TuitionPaymentFragmentbindingInflater1 = 12743;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 39660;
            private static char b = 59762;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 19179;

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(byte r7, short r8, byte r9, java.lang.Object[] r10) {
                /*
                    int r9 = r9 * 52
                    int r9 = r9 + 4
                    int r8 = r8 + 1
                    byte[] r0 = defpackage.AndroidImageReaderProxyExternalSyntheticLambda0.$$a
                    int r7 = r7 * 14
                    int r7 = r7 + 84
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r9
                    r4 = r2
                    goto L2d
                L14:
                    r3 = r2
                L15:
                    r6 = r9
                    r9 = r7
                    r7 = r6
                    int r4 = r3 + 1
                    byte r5 = (byte) r9
                    r1[r3] = r5
                    if (r4 != r8) goto L27
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L27:
                    r3 = r0[r7]
                    r6 = r9
                    r9 = r7
                    r7 = r3
                    r3 = r6
                L2d:
                    int r9 = r9 + 1
                    int r3 = r3 + r7
                    int r7 = r3 + (-10)
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.AndroidImageReaderProxyExternalSyntheticLambda0.a(byte, short, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(byte r5, int r6, int r7, java.lang.Object[] r8) {
                /*
                    int r7 = r7 * 11
                    int r0 = 38 - r7
                    int r6 = r6 * 19
                    int r6 = 84 - r6
                    byte[] r1 = defpackage.AndroidImageReaderProxyExternalSyntheticLambda0.$$d
                    int r5 = r5 * 26
                    int r5 = 30 - r5
                    byte[] r0 = new byte[r0]
                    int r7 = 37 - r7
                    r2 = 0
                    if (r1 != 0) goto L18
                    r3 = r7
                    r4 = r2
                    goto L2a
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r7) goto L28
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    r8[r2] = r5
                    return
                L28:
                    r3 = r1[r5]
                L2a:
                    int r6 = r6 + r3
                    int r6 = r6 + (-10)
                    int r5 = r5 + 1
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.AndroidImageReaderProxyExternalSyntheticLambda0.d(byte, int, int, java.lang.Object[]):void");
            }

            private static void c(char[] cArr, int i2, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
                char[] cArr2 = new char[cArr.length - 2];
                oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
                char[] cArr3 = new char[2];
                while (true) {
                    char c = 0;
                    if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                        objArr[0] = new String(cArr2, 0, i2);
                        return;
                    }
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    char c2 = 1;
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    int i4 = $10 + 49;
                    $11 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 3 / 3;
                    }
                    int i6 = 58224;
                    int i7 = 0;
                    while (i7 < 16) {
                        char c3 = cArr3[c2];
                        char c4 = cArr3[c];
                        int i8 = (c4 + i6) ^ ((c4 << 4) + ((char) (((long) b) ^ 8611973335120459638L)));
                        int i9 = c4 >>> 5;
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            objArr2[2] = Integer.valueOf(i9);
                            objArr2[c2] = Integer.valueOf(i8);
                            objArr2[c] = Integer.valueOf(c3);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char minimumFlingVelocity = (char) (47773 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                int i10 = 469 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 13;
                                Class[] clsArr = new Class[4];
                                clsArr[c] = Integer.TYPE;
                                clsArr[c2] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity, i10, scrollBarSize, -2007001706, false, "o", clsArr);
                            }
                            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            cArr3[c2] = cCharValue;
                            Object[] objArr3 = {Integer.valueOf(cArr3[c]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 47773), ExpandableListView.getPackedPositionChild(0L) + 469, 13 - View.MeasureSpec.getSize(0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            i6 -= 40503;
                            i7++;
                            int i11 = $11 + 45;
                            $10 = i11 % 128;
                            int i12 = i11 % 2;
                            c2 = 1;
                            c = 0;
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
                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int i13 = 2323 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44;
                        byte b2 = (byte) ($$c[3] + 1);
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarFadeDuration, i13, maximumFlingVelocity, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr;
                int i2 = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) (31534 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int packedPositionType = 921 - ExpandableListView.getPackedPositionType(0L);
                    int i3 = 28 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    byte[] bArr = $$a;
                    byte b2 = bArr[1];
                    byte b3 = bArr[80];
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, packedPositionType, i3, -1048449946, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{49508, 12200, 17131, 17458, 48024, 45801, 47016, 22148, 40048, 51485, 26182, 35114, 32913, 51258, 2447, 60080, 3328, 64964, 2087, 55914, 57544, 4732, 2805, 62240}, TextUtils.indexOf("", "") + 22, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{60038, 34603, 29378, 58914, 38730, 33121, 64755, 34641, 43831, 54375, 8755, 10526, 63491, 57979, 39336, 24593, 45331, 16351}, 15 - TextUtils.getOffsetBefore("", 0), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char defaultSize = (char) (31533 - View.getDefaultSize(0, 0));
                    int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 921;
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 28;
                    byte b4 = $$a[80];
                    byte b5 = b4;
                    Object[] objArr5 = new Object[1];
                    a(b5, (byte) (b5 | 52), b4, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, packedPositionType2, iNormalizeMetaState, -778300370, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 31533);
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 921;
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 29;
                        byte[] bArr2 = $$a;
                        byte b6 = bArr2[80];
                        Object[] objArr6 = new Object[1];
                        a(b6, (byte) (b6 | 37), bArr2[1], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, keyRepeatDelay, bitsPerPixel, -1142834547, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i4 = (((~(iMaxMemory | 535336017)) | 1238743626) * 56) + 1201586387 + (((~((~iMaxMemory) | 1238743626)) | 535336017) * 56) + 936343559;
                    int i5 = (i4 << 13) ^ i4;
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{31057, 22223, 15733, 12354, 29178, 3366, 44788, 24766, 40130, 16551, 33496, 13744, 20207, 26741, 53796, 464, 54476, 29201, 47964, 32120, 1599, 30102, 5475, 26730, 40348, 38860, 58191, 19366}, View.MeasureSpec.makeMeasureSpec(0, 0) + 26, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{606, 4318, 1132, 24296, 26890, 3854, 29675, 52587, 44350, 25025, 55862, 30341, 21451, 58597, 6736, 38307, 48804, 11987, 20710, 29136}, View.MeasureSpec.getSize(0) + 18, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    Object[] objArr10 = new Object[1];
                    c(new char[]{36103, 16279, 46653, 47731, 61119, 47065, 50670, 17837, 31738, 53527, 34081, 52898, 61953, 52378, 21797, 59293, 50662, 21519}, Color.alpha(0) + 16, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{57882, 55388, 27442, 38313, 12295, 64763, 28908, 65465, 8589, 29182, 54540, 28869, 27064, 52778, 38592, 46791, 5383, 60262}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 15, objArr11);
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 936343559};
                        byte[] bArr3 = $$d;
                        byte b7 = (byte) (-bArr3[33]);
                        byte b8 = b7;
                        Object[] objArr13 = new Object[1];
                        d(b7, b8, b8, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b9 = bArr3[54];
                        byte b10 = b9;
                        Object[] objArr14 = new Object[1];
                        d(b9, b10, b10, objArr14);
                        Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 31534);
                            int mirror = 969 - AndroidCharacter.getMirror('0');
                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 28;
                            byte[] bArr4 = $$a;
                            byte b11 = bArr4[80];
                            Object[] objArr16 = new Object[1];
                            a(b11, (byte) (b11 | 37), bArr4[1], objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, mirror, fadingEdgeLength, -1142834547, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c(new char[]{49508, 12200, 17131, 17458, 48024, 45801, 47016, 22148, 40048, 51485, 26182, 35114, 32913, 51258, 2447, 60080, 3328, 64964, 2087, 55914, 57544, 4732, 2805, 62240}, (-16777194) - Color.rgb(0, 0, 0), objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(new char[]{60038, 34603, 29378, 58914, 38730, 33121, 64755, 34641, 43831, 54375, 8755, 10526, 63491, 57979, 39336, 24593, 45331, 16351}, 14 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char minimumFlingVelocity = (char) (31533 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 922;
                                int defaultSize2 = 28 - View.getDefaultSize(0, 0);
                                byte b12 = $$a[80];
                                byte b13 = b12;
                                Object[] objArr19 = new Object[1];
                                a(b13, (byte) (b13 | 52), b12, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity, iLastIndexOf, defaultSize2, -778300370, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 31533);
                                int pressedStateDuration = 921 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                int keyRepeatTimeout = 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                byte[] bArr5 = $$a;
                                byte b14 = bArr5[1];
                                byte b15 = bArr5[80];
                                Object[] objArr20 = new Object[1];
                                a(b14, b15, b15, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cNormalizeMetaState, pressedStateDuration, keyRepeatTimeout, -1048449946, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            int i7 = asBinder + 37;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                            int i8 = i7 % 2;
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
                int i9 = ((int[]) objArr[1])[0];
                int i10 = ((int[]) objArr[3])[0];
                if (i10 == i9) {
                    int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
                    asBinder = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = ((int[]) objArr[0])[0];
                    Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int iMyPid = Process.myPid();
                    int i14 = ~iMyPid;
                    int i15 = i13 + (-720528378) + ((1774009339 | i14) * (-369)) + (((~((-564214761) | i14)) | 1209864883) * (-369)) + (((~(iMyPid | 564214760)) | 1209794579 | (~(i14 | (-564144457)))) * 369);
                    int i16 = (i15 << 13) ^ i15;
                    int i17 = i16 ^ (i16 >>> 17);
                    ((int[]) objArr21[0])[0] = i17 ^ (i17 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr != null) {
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
                    int i18 = ((int[]) objArr[0])[0];
                    Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                    int i19 = ~((-268468381) | iUptimeMillis);
                    int i20 = ~iUptimeMillis;
                    int i21 = i18 + 809591436 + ((i19 | (~((-1218726210) | i20))) * 497) + (((~(iUptimeMillis | (-1218726210))) | (~((-286885055) | i20)) | 18416674) * 497);
                    int i22 = (i21 << 13) ^ i21;
                    int i23 = i22 ^ (i22 >>> 17);
                    ((int[]) objArr22[0])[0] = i23 ^ (i23 << 5);
                }
                return getMaxImages.b((FirebaseRemoteConfigSettings.Builder) obj);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(short r7, short r8, short r9) {
                /*
                    int r7 = r7 * 4
                    int r7 = 4 - r7
                    int r8 = r8 * 3
                    int r8 = 108 - r8
                    int r9 = r9 * 3
                    int r9 = r9 + 1
                    byte[] r0 = defpackage.AndroidImageReaderProxyExternalSyntheticLambda0.$$c
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r8
                    r5 = r2
                    r8 = r7
                    goto L2a
                L17:
                    r3 = r2
                    r6 = r8
                    r8 = r7
                    r7 = r6
                L1b:
                    byte r4 = (byte) r7
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r9) goto L28
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L28:
                    r3 = r0[r8]
                L2a:
                    int r3 = -r3
                    int r7 = r7 + r3
                    int r8 = r8 + 1
                    r3 = r5
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.AndroidImageReaderProxyExternalSyntheticLambda0.$$g(short, short, short):java.lang.String");
            }
        }));
        remoteConfig.addOnConfigUpdateListener(new b(remoteConfig));
        remoteConfig.fetchAndActivate();
        int i2 = asBinder + 29;
        f954a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 18 / 0;
        }
        return remoteConfig;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 125;
        f954a = i3 % 128;
        int i4 = i3 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        Object obj = null;
        if (firebaseRemoteConfig == null) {
            int i5 = i2 + 121;
            f954a = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            firebaseRemoteConfig = null;
        }
        boolean z = firebaseRemoteConfig.getBoolean("app_dana_siaga_menu");
        int i7 = f954a + 121;
        asBinder = i7 % 128;
        if (i7 % 2 != 0) {
            return Boolean.valueOf(z);
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = f954a + 29;
        int i3 = i2 % 128;
        asBinder = i3;
        FirebaseRemoteConfig firebaseRemoteConfig = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        FirebaseRemoteConfig firebaseRemoteConfig2 = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig2 == null) {
            int i4 = i3 + 49;
            f954a = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 != 0) {
                int i6 = 96 / 0;
            }
        } else {
            firebaseRemoteConfig = firebaseRemoteConfig2;
        }
        return Boolean.valueOf(firebaseRemoteConfig.getBoolean("app_ewallet_menu"));
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            int i2 = asBinder + 13;
            f954a = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f954a + 77;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 3;
            }
            firebaseRemoteConfig = null;
        }
        return Boolean.valueOf(firebaseRemoteConfig.getBoolean("app_mlt_menu"));
    }

    public static boolean unsubscribe() {
        int i = 2 % 2;
        int i2 = f954a + 105;
        asBinder = i2 % 128;
        FirebaseRemoteConfig firebaseRemoteConfig = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        FirebaseRemoteConfig firebaseRemoteConfig2 = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            firebaseRemoteConfig = firebaseRemoteConfig2;
        }
        boolean z = firebaseRemoteConfig.getBoolean("app_loyalti_program_menu");
        int i3 = f954a + 31;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 28 / 0;
        }
        return z;
    }

    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int length;
        byte[] bArr;
        int i4 = 2;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 2267 - KeyEvent.getDeadChar(0, 0), TextUtils.indexOf((CharSequence) "", '0') + 34, 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            long j = 0;
            if (i6 != 0) {
                byte[] bArr2 = g;
                if (bArr2 != null) {
                    int i7 = $10 + 59;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 5;
                        $10 = i9 % 128;
                        if (i9 % i4 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b5 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ExpandableListView.getPackedPositionType(j), 3357 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 18, -1054011043, false, $$g(b5, b5, (byte) $$c.length), new Class[]{Integer.TYPE});
                            }
                            bArr[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i8 <<= 1;
                        } else {
                            try {
                                Object[] objArr4 = {Integer.valueOf(bArr2[i8])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b6 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) KeyEvent.normalizeMetaState(0), 3358 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 17 - ExpandableListView.getPackedPositionChild(0L), -1054011043, false, $$g(b6, b6, (byte) $$c.length), new Class[]{Integer.TYPE});
                                }
                                bArr[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                                i8++;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        i4 = 2;
                        j = 0;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    int i10 = $11 + 83;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    byte[] bArr3 = g;
                    Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) TextUtils.getOffsetBefore("", 0), 2267 - (ViewConfiguration.getFadingEdgeLength() >> 16), 'Q' - AndroidCharacter.getMirror('0'), 1387473586, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) d[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) b) ^ 3046761265686732006L)) + i6;
                Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (55903 - ImageFormat.getBitsPerPixel(0)), 2855 - TextUtils.getTrimmedLength(""), 14 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1529949196, false, $$g(b9, b10, (byte) (b10 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = g;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i12 = $10 + 71;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i15 = $10 + 13;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    z = true;
                } else {
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i17 = $11 + 39;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    if (!(!z)) {
                        byte[] bArr6 = g;
                        int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i19]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = d;
                        int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i20]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    int i21 = $10 + 125;
                    $11 = i21 % 128;
                    if (i21 % 2 == 0) {
                        int i22 = 5 % 2;
                    }
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x028b  */
    public final boolean asInterface() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 31534);
            int scrollDefaultDelay = 921 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int i2 = 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[7], bArr[80], bArr[14], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, scrollDefaultDelay, i2, -1048449946, false, (String) objArr2[0], null);
        }
        FirebaseRemoteConfig firebaseRemoteConfig = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e((-867708410) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-49) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (short) View.resolveSizeAndState(0, 0, 0), (byte) Color.green(0), (-1855268272) - View.MeasureSpec.makeMeasureSpec(0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 867708406, (-49) - (ViewConfiguration.getWindowTouchSlop() >> 8), (short) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (byte) KeyEvent.keyCodeFromString(""), View.resolveSize(0, 0) - 1855268250, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31532);
            int iResolveOpacity = 921 - Drawable.resolveOpacity(0, 0);
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 28;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b2, (byte) (b2 & 52), bArr2[8], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iResolveOpacity, packedPositionType, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 31534);
                int iRed = Color.red(0) + 921;
                int packedPositionGroup = 28 - ExpandableListView.getPackedPositionGroup(0L);
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                c((byte) 51, (byte) (-bArr3[3]), bArr3[8], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(modifierMetaStateMask, iRed, packedPositionGroup, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iNextInt = new Random().nextInt();
            int i3 = 2139271263 + ((~((~iNextInt) | 1572743023)) * (-116)) + ((205268846 | iNextInt) * 116) + (((~(iNextInt | (-1568810798))) | 201336620) * 116) + 2048518224;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[0])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e((ViewConfiguration.getScrollDefaultDelay() >> 16) - 867708410, TextUtils.indexOf((CharSequence) "", '0') - 48, (short) ExpandableListView.getPackedPositionGroup(0L), (byte) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getWindowTouchSlop() >> 8) - 1855268235, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e((-867708409) - ExpandableListView.getPackedPositionChild(0L), (-49) - (ViewConfiguration.getLongPressTimeout() >> 16), (short) View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ExpandableListView.getPackedPositionType(0L), (-1855268209) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i6 = asBinder;
                int i7 = i6 + 99;
                f954a = i7 % 128;
                int i8 = i7 % 2;
                if (applicationContext instanceof ContextWrapper) {
                    int i9 = i6 + 79;
                    f954a = i9 % 128;
                    int i10 = i9 % 2;
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
            e((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 867708401, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 49, (short) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (byte) (ViewConfiguration.getTapTimeout() >> 16), Color.argb(0, 0, 0, 0) - 1855268191, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e((-867708402) - ExpandableListView.getPackedPositionGroup(0L), (-49) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (-1855268175) - (ViewConfiguration.getTouchSlop() >> 8), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i11 = f954a + 27;
            asBinder = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 2048518224};
                byte[] bArr4 = $$d;
                byte b3 = bArr4[5];
                byte b4 = bArr4[44];
                Object[] objArr13 = new Object[1];
                f(b3, b4, b4, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                f(bArr4[44], (byte) (-bArr4[37]), (byte) (-bArr4[79]), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char edgeSlop = (char) (31533 - (ViewConfiguration.getEdgeSlop() >> 16));
                    int i13 = 922 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int iResolveSizeAndState = 28 - View.resolveSizeAndState(0, 0, 0);
                    byte[] bArr5 = $$a;
                    Object[] objArr16 = new Object[1];
                    c((byte) 51, (byte) (-bArr5[3]), bArr5[8], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(edgeSlop, i13, iResolveSizeAndState, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    e((-867708410) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.rgb(0, 0, 0) + 16777167, (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (byte) View.getDefaultSize(0, 0), (-1855268272) - KeyEvent.normalizeMetaState(0), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(View.MeasureSpec.getMode(0) - 867708406, (-49) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (byte) TextUtils.indexOf("", ""), (-1855268250) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char maxKeyCode = (char) (31533 - (KeyEvent.getMaxKeyCode() >> 16));
                        int keyRepeatTimeout = 921 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int deadChar = 28 - KeyEvent.getDeadChar(0, 0);
                        byte[] bArr6 = $$a;
                        byte b5 = bArr6[7];
                        Object[] objArr19 = new Object[1];
                        c(b5, (byte) (b5 & 52), bArr6[8], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maxKeyCode, keyRepeatTimeout, deadChar, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) (31533 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int size = 921 - View.MeasureSpec.getSize(0);
                        int i14 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
                        byte[] bArr7 = $$a;
                        Object[] objArr20 = new Object[1];
                        c(bArr7[7], bArr7[80], bArr7[14], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, size, i14, -1048449946, false, (String) objArr20[0], null);
                    }
                    firebaseRemoteConfig = null;
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[3])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i17 = f954a + 65;
                asBinder = i17 % 128;
                int i18 = i17 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i16));
        }
        int i19 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i20 = i19 + (((~((-370294852) | iElapsedRealtime)) * 521) - 453974096) + (((~((~iElapsedRealtime) | (-370294852))) | 1076629008) * 521);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr21[0])[0] = i22 ^ (i22 << 5);
        int i23 = asBinder;
        int i24 = i23 + 15;
        f954a = i24 % 128;
        int i25 = i24 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig2 = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig2 == null) {
            int i26 = i23 + 15;
            f954a = i26 % 128;
            int i27 = i26 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            firebaseRemoteConfig = firebaseRemoteConfig2;
        }
        int i28 = ((int[]) objArr21[0])[0];
        int i29 = ((i28 * i28) - (~(-(2041376749 * i28)))) - 1;
        int i30 = -(i28 * 1373930301);
        int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
        int i32 = (i31 & 291025081) + (291025081 | i31);
        int i33 = i32 >> 22;
        int i34 = (((i33 | (-2047)) << 1) - (i33 ^ (-2047))) / 1024;
        int i35 = (i32 - (~((i34 & 1) + (i34 | 1)))) - 1;
        int i36 = ((i32 >> 21) - 4095) / 2048;
        int i37 = -(i35 ^ ((i36 & 1) + (i36 | 1)));
        int i38 = (i37 & 5) + (i37 | 5);
        int i39 = i38 >> 20;
        int i40 = ((i39 ^ (-8191)) + ((i39 & (-8191)) << 1)) / 4096;
        int i41 = (i40 & 1) + (i40 | 1);
        return firebaseRemoteConfig.getBoolean("19|7|14|26|app_biller_menu".substring(85470 / (((-((i41 ^ 1) + ((i41 & 1) << 1))) & i38) * 1554)));
    }

    public static boolean MediaBrowserCompatItemCallback() {
        int i = 2 % 2;
        int i2 = f954a + 55;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            firebaseRemoteConfig = null;
        }
        boolean z = firebaseRemoteConfig.getBoolean("app_tanya175_menu");
        int i4 = f954a + 63;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return z;
    }

    public static boolean onConnected() {
        int i = 2 % 2;
        int i2 = f954a + 67;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            int i5 = i3 + 25;
            f954a = i5 % 128;
            int i6 = i5 % 2;
            firebaseRemoteConfig = null;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i6 != 0) {
                throw null;
            }
        }
        return firebaseRemoteConfig.getBoolean("app_tanamduit_menu");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public static boolean MediaBrowserCompatMediaBrowserImplApi216() {
        FirebaseRemoteConfig firebaseRemoteConfig;
        int i = 2 % 2;
        int i2 = f954a + 69;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
            int i3 = 50 / 0;
            if (firebaseRemoteConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = f954a + 43;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                firebaseRemoteConfig = null;
            }
        } else {
            firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
            if (firebaseRemoteConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = f954a + 43;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                firebaseRemoteConfig = null;
            }
        }
        return firebaseRemoteConfig.getBoolean("app_clicktocall_submenu");
    }

    public static boolean MediaBrowserCompatMediaBrowserImplApi217() {
        int i = 2 % 2;
        int i2 = f954a;
        int i3 = i2 + 123;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        Object obj = null;
        if (firebaseRemoteConfig == null) {
            int i5 = i2 + 51;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            firebaseRemoteConfig = null;
        }
        boolean z = firebaseRemoteConfig.getBoolean("app_mantul_ict");
        int i7 = asBinder + 91;
        f954a = i7 % 128;
        if (i7 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public static boolean setInternalConnectionCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 95;
        f954a = i3 % 128;
        FirebaseRemoteConfig firebaseRemoteConfig = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        FirebaseRemoteConfig firebaseRemoteConfig2 = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig2 == null) {
            int i4 = i2 + 1;
            f954a = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 != 0) {
                int i6 = 14 / 0;
            }
        } else {
            firebaseRemoteConfig = firebaseRemoteConfig2;
        }
        return firebaseRemoteConfig.getBoolean("app_jkk_klaim_menu");
    }

    private static /* synthetic */ Object INotificationSideChannel(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        f954a = i2 % 128;
        int i3 = i2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f954a + 93;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            firebaseRemoteConfig = null;
        }
        return Boolean.valueOf(firebaseRemoteConfig.getBoolean("app_jkm_klaim_menu"));
    }

    public static boolean onConnectionFailed() {
        int i = 2 % 2;
        int i2 = f954a + 111;
        asBinder = i2 % 128;
        FirebaseRemoteConfig firebaseRemoteConfig = null;
        if (i2 % 2 == 0) {
            firebaseRemoteConfig.hashCode();
            throw null;
        }
        FirebaseRemoteConfig firebaseRemoteConfig2 = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = f954a + 31;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        } else {
            firebaseRemoteConfig = firebaseRemoteConfig2;
        }
        return firebaseRemoteConfig.getBoolean("app_jp_berkala_menu");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public static boolean a() {
        FirebaseRemoteConfig firebaseRemoteConfig;
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 35;
        f954a = i4 % 128;
        if (i4 % 2 != 0) {
            firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
            int i5 = 1 / 0;
            if (firebaseRemoteConfig == null) {
                int i6 = i3 + 109;
                f954a = i6 % 128;
                i = i6 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                if (i != 0) {
                    int i7 = 96 / 0;
                }
                firebaseRemoteConfig = null;
            }
        } else {
            firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
            if (firebaseRemoteConfig == null) {
                int i8 = i3 + 109;
                f954a = i8 % 128;
                i = i8 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                if (i != 0) {
                    int i9 = 96 / 0;
                }
                firebaseRemoteConfig = null;
            }
        }
        return firebaseRemoteConfig.getBoolean("app_bukarekeningbank_menu");
    }

    public static boolean onConnectionSuspended() {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        int i3 = i2 % 128;
        f954a = i3;
        int i4 = i2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            int i5 = i3 + 49;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            firebaseRemoteConfig = null;
        }
        return firebaseRemoteConfig.getBoolean("app_ijc_menu");
    }

    public static String read() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 97;
        f954a = i3 % 128;
        int i4 = i3 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            int i5 = i2 + 49;
            f954a = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i7 = f954a + 101;
            asBinder = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 4 / 3;
            }
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("force_update_title");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        int i3 = i2 % 128;
        f954a = i3;
        FirebaseRemoteConfig firebaseRemoteConfig = null;
        if (i2 % 2 != 0) {
            firebaseRemoteConfig.hashCode();
            throw null;
        }
        FirebaseRemoteConfig firebaseRemoteConfig2 = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig2 == null) {
            int i4 = i3 + 75;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            firebaseRemoteConfig = firebaseRemoteConfig2;
        }
        String string = firebaseRemoteConfig.getString("force_update_text");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i6 = asBinder + 115;
        f954a = i6 % 128;
        int i7 = i6 % 2;
        return string;
    }

    public static String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = f954a + 31;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            int i5 = i3 + 89;
            f954a = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("force_update_button_text");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        FirebaseRemoteConfig firebaseRemoteConfig;
        int i = 2 % 2;
        int i2 = asBinder + 31;
        f954a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
            int i3 = 14 / 0;
            if (firebaseRemoteConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                firebaseRemoteConfig = null;
            }
        } else {
            firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
            if (firebaseRemoteConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                firebaseRemoteConfig = null;
            }
        }
        String string = firebaseRemoteConfig.getString("app_version");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = f954a + 75;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public static String g() {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        f954a = i2 % 128;
        FirebaseRemoteConfig firebaseRemoteConfig = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        FirebaseRemoteConfig firebaseRemoteConfig2 = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            firebaseRemoteConfig = firebaseRemoteConfig2;
        }
        String string = firebaseRemoteConfig.getString("app_version_title");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i3 = f954a + 81;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public static String TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        f954a = i2 % 128;
        FirebaseRemoteConfig firebaseRemoteConfig = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        FirebaseRemoteConfig firebaseRemoteConfig2 = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = f954a + 107;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        } else {
            firebaseRemoteConfig = firebaseRemoteConfig2;
        }
        String string = firebaseRemoteConfig.getString("app_version_content");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static String asBinder() {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        f954a = i2 % 128;
        int i3 = i2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = asBinder + 33;
            f954a = i4 % 128;
            int i5 = i4 % 2;
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("app_banner_active");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static String setCallbacksMessenger() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 111;
        f954a = i3 % 128;
        int i4 = i3 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            int i5 = i2 + 101;
            f954a = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("app_local_banner_active");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i7 = f954a + 95;
        asBinder = i7 % 128;
        if (i7 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public static String handleMessage() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        f954a = i2 % 128;
        FirebaseRemoteConfig firebaseRemoteConfig = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        FirebaseRemoteConfig firebaseRemoteConfig2 = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = asBinder + 3;
            f954a = i3 % 128;
            int i4 = i3 % 2;
        } else {
            firebaseRemoteConfig = firebaseRemoteConfig2;
        }
        String string = firebaseRemoteConfig.getString("app_local_banner_activity");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static String getNotifyChildrenChangedOptions() {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        f954a = i2 % 128;
        int i3 = i2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("app_development_feature");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = f954a + 79;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return string;
    }

    public static String MediaBrowserCompatCallbackHandler() {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        f954a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("app_maintenance_image");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i3 = asBinder + 101;
        f954a = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public static String subscribe() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 79;
        f954a = i3 % 128;
        int i4 = i3 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            int i5 = i2 + 33;
            f954a = i5 % 128;
            int i6 = i5 % 2;
            firebaseRemoteConfig = null;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i6 != 0) {
                int i7 = 39 / 0;
            }
        }
        String string = firebaseRemoteConfig.getString("app_maintenance_content");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public static String getRoot() {
        FirebaseRemoteConfig firebaseRemoteConfig;
        int i;
        int i2 = 2 % 2;
        int i3 = f954a;
        int i4 = i3 + 7;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
            int i5 = 73 / 0;
            if (firebaseRemoteConfig == null) {
                int i6 = i3 + 5;
                asBinder = i6 % 128;
                i = i6 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                if (i == 0) {
                    int i7 = 50 / 0;
                }
                firebaseRemoteConfig = null;
            }
        } else {
            firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
            if (firebaseRemoteConfig == null) {
                int i8 = i3 + 5;
                asBinder = i8 % 128;
                i = i8 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                if (i == 0) {
                    int i9 = 50 / 0;
                }
                firebaseRemoteConfig = null;
            }
        }
        String string = firebaseRemoteConfig.getString("app_maintenance2");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static String getItem() {
        int i = 2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            int i2 = asBinder + 123;
            f954a = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("app_rate_app");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = asBinder + 81;
        f954a = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public static String onResult() {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        f954a = i2 % 128;
        int i3 = i2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("app_rate_app_title");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = f954a + 113;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public static String INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            int i2 = f954a + 117;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 == 0) {
                obj.hashCode();
                throw null;
            }
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("app_rate_app_content");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = asBinder + 73;
        f954a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        FirebaseRemoteConfig firebaseRemoteConfig;
        int i = 2 % 2;
        int i2 = asBinder + 109;
        int i3 = i2 % 128;
        f954a = i3;
        if (i2 % 2 != 0) {
            firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
            int i4 = 55 / 0;
            if (firebaseRemoteConfig == null) {
                int i5 = i3 + 103;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i7 = asBinder + 95;
                f954a = i7 % 128;
                int i8 = i7 % 2;
                firebaseRemoteConfig = null;
            }
        } else {
            firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
            if (firebaseRemoteConfig == null) {
                int i9 = i3 + 103;
                asBinder = i9 % 128;
                int i10 = i9 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i11 = asBinder + 95;
                f954a = i11 % 128;
                int i12 = i11 % 2;
                firebaseRemoteConfig = null;
            }
        }
        String string = firebaseRemoteConfig.getString("app_postalcode_fetch");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static String d() {
        int i = 2 % 2;
        int i2 = f954a + 79;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("app_maintenance_text_btn");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i3 = f954a + 111;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public static String MediaBrowserCompatMediaBrowserImplApi213() {
        int i = 2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            int i2 = asBinder + 117;
            f954a = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("app_url_jkp");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = f954a + 17;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        int i = 2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            int i2 = asBinder + 123;
            f954a = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 != 0) {
                throw null;
            }
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("app_faq_url");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = f954a + 17;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public static String getSessionToken() {
        FirebaseRemoteConfig firebaseRemoteConfig;
        int i = 2 % 2;
        int i2 = asBinder + 99;
        f954a = i2 % 128;
        if (i2 % 2 != 0) {
            firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
            int i3 = 36 / 0;
            if (firebaseRemoteConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = f954a + 87;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                firebaseRemoteConfig = null;
            }
        } else {
            firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
            if (firebaseRemoteConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = f954a + 87;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                firebaseRemoteConfig = null;
            }
        }
        String string = firebaseRemoteConfig.getString("app_main_banner_image");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static String isConnected() {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        int i3 = i2 % 128;
        f954a = i3;
        FirebaseRemoteConfig firebaseRemoteConfig = null;
        if (i2 % 2 != 0) {
            firebaseRemoteConfig.hashCode();
            throw null;
        }
        FirebaseRemoteConfig firebaseRemoteConfig2 = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig2 == null) {
            int i4 = i3 + 89;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            firebaseRemoteConfig = firebaseRemoteConfig2;
        }
        String string = firebaseRemoteConfig.getString("app_main_banner_activity");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static String getExtras() {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        int i3 = i2 % 128;
        f954a = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            int i4 = i3 + 49;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 == 0) {
                int i6 = 37 / 0;
            }
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("app_banner_information_temporary");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i7 = f954a + 121;
        asBinder = i7 % 128;
        if (i7 % 2 != 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public static String MediaBrowserCompatCustomActionCallback() {
        int i = 2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            int i2 = asBinder + 87;
            f954a = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("app_pengkinian_status");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = f954a + 109;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int i = 2 % 2;
        int i2 = f954a + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f954a + 17;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("app_claim_jht_status");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        int i = 2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        Object obj = null;
        if (firebaseRemoteConfig == null) {
            int i2 = asBinder + 69;
            f954a = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("app_claim_jht_redactional");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = f954a + 121;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public static String MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = f954a + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("app_streaming_status");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = asBinder + 15;
        f954a = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public static String MediaBrowserCompatMediaBrowserImplApi212() {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        f954a = i2 % 128;
        FirebaseRemoteConfig firebaseRemoteConfig = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        FirebaseRemoteConfig firebaseRemoteConfig2 = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = f954a + 73;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        } else {
            firebaseRemoteConfig = firebaseRemoteConfig2;
        }
        String string = firebaseRemoteConfig.getString("app_webview_raya");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = f954a + 39;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f954a + 57;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("count_banner");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i6 = asBinder + 81;
        f954a = i6 % 128;
        int i7 = i6 % 2;
        return string;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i = 2 % 2;
        int i2 = f954a;
        int i3 = i2 + 95;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            int i5 = i2 + 47;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            firebaseRemoteConfig = null;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i6 == 0) {
                firebaseRemoteConfig.hashCode();
                throw null;
            }
        }
        String string = firebaseRemoteConfig.getString("app_banner_information_temporary_link1");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static String search() {
        int i = 2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            int i2 = asBinder + 111;
            f954a = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 != 0) {
                throw null;
            }
            int i4 = asBinder + 45;
            f954a = i4 % 128;
            int i5 = i4 % 2;
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("app_banner_information_temporary_link2");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static /* synthetic */ Object cancel(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        f954a = i2 % 128;
        FirebaseRemoteConfig firebaseRemoteConfig = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        FirebaseRemoteConfig firebaseRemoteConfig2 = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = f954a + 71;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        } else {
            firebaseRemoteConfig = firebaseRemoteConfig2;
        }
        String string = firebaseRemoteConfig.getString("app_banner_information_temporary_link3");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static String run() {
        int i = 2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        Object obj = null;
        if (firebaseRemoteConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = asBinder + 77;
            f954a = i2 % 128;
            int i3 = i2 % 2;
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("app_web_lapakasik");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = f954a + 113;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        f954a = i2 % 128;
        int i3 = i2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("app_web_lapakasik_online");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = f954a + 101;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return string;
    }

    public static String INotificationSideChannelDefault() {
        int i = 2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            int i2 = f954a + 97;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 == 0) {
                throw null;
            }
            int i4 = f954a + 35;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("app_deeplink_jmo");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i6 = asBinder + 41;
        f954a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 33 / 0;
        }
        return string;
    }

    public static String disconnect() {
        int i = 2 % 2;
        int i2 = f954a + 35;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            int i5 = i3 + 37;
            f954a = i5 % 128;
            int i6 = i5 % 2;
            firebaseRemoteConfig = null;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i6 != 0) {
                int i7 = 60 / 0;
            }
        }
        String string = firebaseRemoteConfig.getString("ip_dana_siaga");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public static String MediaBrowserCompatMediaBrowserImplApi215() {
        FirebaseRemoteConfig firebaseRemoteConfig;
        int i = 2 % 2;
        int i2 = f954a + 103;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
            int i3 = 31 / 0;
            if (firebaseRemoteConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = f954a + 81;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                firebaseRemoteConfig = null;
            }
        } else {
            firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
            if (firebaseRemoteConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = f954a + 81;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                firebaseRemoteConfig = null;
            }
        }
        String string = firebaseRemoteConfig.getString("app_tanamduit_link");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static String MediaBrowserCompatMediaBrowserImplApi211() {
        int i = 2 % 2;
        int i2 = f954a + 109;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("url_eform_pmi");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i3 = asBinder + 93;
        f954a = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public static String MediaBrowserCompatMediaBrowserImplApi214() {
        int i = 2 % 2;
        int i2 = f954a + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("is_available_pmi_form");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = asBinder + 49;
        f954a = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public static String MediaBrowserCompatMediaBrowserImpl() {
        int i = 2 % 2;
        int i2 = f954a + 61;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            int i5 = i3 + 43;
            f954a = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("url_clicktocall");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static String MediaBrowserCompatConnectionCallbackStubApi21() {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        int i3 = i2 % 128;
        f954a = i3;
        FirebaseRemoteConfig firebaseRemoteConfig = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        FirebaseRemoteConfig firebaseRemoteConfig2 = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig2 == null) {
            int i4 = i3 + 91;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            firebaseRemoteConfig = firebaseRemoteConfig2;
        }
        String string = firebaseRemoteConfig.getString("app_whatsapp_175");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i6 = f954a + 125;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 4 / 0;
        }
        return string;
    }

    public static String MediaBrowserCompatMediaBrowserImplApi21() {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        int i3 = i2 % 128;
        f954a = i3;
        int i4 = i2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            int i5 = i3 + 45;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i6 == 0) {
                int i7 = 52 / 0;
            }
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("url_eform_pu_jmo");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static String MediaBrowserCompat() {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        f954a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("app_web_jkkjkm_bpupu");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i3 = f954a + 59;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public static String connect() {
        int i = 2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            int i2 = asBinder + 107;
            f954a = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 != 0) {
                int i4 = 55 / 0;
            }
            int i5 = asBinder + 23;
            f954a = i5 % 128;
            int i6 = i5 % 2;
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("url_eklaim_pmi");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i7 = asBinder + 21;
        f954a = i7 % 128;
        if (i7 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public static String onReceiveResult() {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        f954a = i2 % 128;
        FirebaseRemoteConfig firebaseRemoteConfig = null;
        if (i2 % 2 != 0) {
            firebaseRemoteConfig.hashCode();
            throw null;
        }
        FirebaseRemoteConfig firebaseRemoteConfig2 = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = f954a + 109;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        } else {
            firebaseRemoteConfig = firebaseRemoteConfig2;
        }
        String string = firebaseRemoteConfig.getString("url_ayoconnect_bri");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    private static /* synthetic */ Object g(Object[] objArr) {
        FirebaseRemoteConfig firebaseRemoteConfig;
        int i = 2 % 2;
        int i2 = f954a + 75;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
            int i3 = 12 / 0;
            if (firebaseRemoteConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                firebaseRemoteConfig = null;
            }
        } else {
            firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
            if (firebaseRemoteConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                firebaseRemoteConfig = null;
            }
        }
        String string = firebaseRemoteConfig.getString("url_customer_reward");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = asBinder + 5;
        f954a = i4 % 128;
        if (i4 % 2 == 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public static String onLoadChildren() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 25;
        f954a = i3 % 128;
        int i4 = i3 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            int i5 = i2 + 41;
            f954a = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i7 = f954a + 101;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("app_link_ijc");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static String onTransact() {
        int i = 2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            int i2 = f954a + 113;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 == 0) {
                int i4 = 74 / 0;
            }
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("bsu_config");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i5 = asBinder + 89;
        f954a = i5 % 128;
        if (i5 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public static String onError() {
        int i = 2 % 2;
        int i2 = f954a + 87;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("img_reactivation");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i3 = f954a + 103;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public static boolean MediaBrowserCompatConnectionCallbackConnectionCallbackInternal() {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        f954a = i2 % 128;
        FirebaseRemoteConfig firebaseRemoteConfig = null;
        if (i2 % 2 != 0) {
            firebaseRemoteConfig.hashCode();
            throw null;
        }
        FirebaseRemoteConfig firebaseRemoteConfig2 = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = asBinder + 123;
            f954a = i3 % 128;
            int i4 = i3 % 2;
        } else {
            firebaseRemoteConfig = firebaseRemoteConfig2;
        }
        return firebaseRemoteConfig.getBoolean("app_sertakan_menu_prod");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    private static /* synthetic */ Object notify(Object[] objArr) {
        FirebaseRemoteConfig firebaseRemoteConfig;
        int i = 2 % 2;
        int i2 = f954a + 11;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
            int i3 = 63 / 0;
            if (firebaseRemoteConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                firebaseRemoteConfig = null;
            }
        } else {
            firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
            if (firebaseRemoteConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                firebaseRemoteConfig = null;
            }
        }
        String string = firebaseRemoteConfig.getString("register_participant");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = asBinder + 103;
        f954a = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public final String onItemLoaded() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = asBinder + 37;
        f954a = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
            int iAlpha = Color.alpha(0) + 876;
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10;
            byte b2 = (byte) ($$b - 4);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(b2, (byte) (bArr[46] - 1), bArr[83], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iAlpha, maximumDrawingCacheSize, -1199417970, false, (String) objArr2[0], null);
        }
        FirebaseRemoteConfig firebaseRemoteConfig = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e((Process.myPid() >> 22) - 867708410, KeyEvent.getDeadChar(0, 0) - 49, (short) (ViewConfiguration.getPressedStateDuration() >> 16), (byte) ((-1) - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getWindowTouchSlop() >> 8) - 1855268272, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((-867708406) - (ViewConfiguration.getWindowTouchSlop() >> 8), (-49) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (short) (ViewConfiguration.getEdgeSlop() >> 16), (byte) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1855268251, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 876;
            int mode = View.MeasureSpec.getMode(0) + 10;
            byte b3 = $$a[80];
            Object[] objArr5 = new Object[1];
            c((byte) 98, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, scrollBarFadeDuration, mode, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 876;
                int i5 = 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c((byte) 98, bArr2[26], bArr2[83], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration, iResolveOpacity, i5, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = (-1219682444) + ((~(416263707 | i6)) * (-560)) + ((~(iIdentityHashCode | 519028319)) * (-560)) + (((~((-375953479) | i6)) | 273188866) * 560) + 11266321;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 867708402, (-50) - ((byte) KeyEvent.getModifierMetaStateMask()), (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) TextUtils.indexOf("", ""), (-1855268192) - TextUtils.lastIndexOf("", '0'), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e((-867708402) - (ViewConfiguration.getFadingEdgeLength() >> 16), KeyEvent.normalizeMetaState(0) - 49, (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0) - 1855268175, objArr9);
            try {
                Object[] objArr10 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 11266321};
                byte[] bArr3 = $$d;
                Object[] objArr11 = new Object[1];
                f(bArr3[5], (byte) (-bArr3[140]), (byte) 87, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                f(bArr3[44], (byte) (-bArr3[37]), (byte) (-bArr3[79]), objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cBlue = (char) Color.blue(0);
                    int iArgb = Color.argb(0, 0, 0, 0) + 876;
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 10;
                    byte[] bArr4 = $$a;
                    Object[] objArr13 = new Object[1];
                    c((byte) 98, bArr4[26], bArr4[83], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cBlue, iArgb, threadPriority, 1324201839, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e((-867708410) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 49, (short) View.resolveSize(0, 0), (byte) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 1855268272, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e((-867708406) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (-48) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (short) (TextUtils.indexOf((CharSequence) "", '0') + 1), (byte) TextUtils.getOffsetBefore("", 0), TextUtils.indexOf("", "") - 1855268250, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                        int iRgb = (-16776340) - Color.rgb(0, 0, 0);
                        int iAxisFromString = 9 - MotionEvent.axisFromString("");
                        byte b4 = $$a[80];
                        Object[] objArr16 = new Object[1];
                        c((byte) 98, b4, b4, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, iRgb, iAxisFromString, 254769921, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 877;
                        int iIndexOf2 = TextUtils.indexOf("", "", 0) + 10;
                        byte b5 = (byte) ($$b - 4);
                        byte[] bArr5 = $$a;
                        Object[] objArr17 = new Object[1];
                        c(b5, (byte) (bArr5[46] - 1), bArr5[83], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, iIndexOf, iIndexOf2, -1199417970, false, (String) objArr17[0], null);
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
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr == null) {
                throw null;
            }
            while (i4 < strArr.length) {
                arrayList.add(strArr[i4]);
                i4++;
                int i10 = asBinder + 35;
                f954a = i10 % 128;
                int i11 = i10 % 2;
            }
            throw null;
        }
        int i12 = ((int[]) objArr[1])[0];
        Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i13 = i12 + (-981816544) + (((~((-431927888) | iElapsedRealtime)) | 145236485) * 345) + (((~((-431927888) | (~iElapsedRealtime))) | (-536854144)) * 345) + ((~(iElapsedRealtime | (-145236486))) * 345);
        int i14 = (i13 << 13) ^ i13;
        int i15 = i14 ^ (i14 >>> 17);
        ((int[]) objArr18[1])[0] = i15 ^ (i15 << 5);
        FirebaseRemoteConfig firebaseRemoteConfig2 = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig2 == null) {
            int i16 = f954a + 29;
            asBinder = i16 % 128;
            int i17 = i16 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i17 == 0) {
                firebaseRemoteConfig.hashCode();
                throw null;
            }
        } else {
            firebaseRemoteConfig = firebaseRemoteConfig2;
        }
        int i18 = ((int[]) objArr18[1])[0];
        int i19 = ((((i18 * i18) - (~(-(1868885468 * i18)))) - 1) - (~(-(i18 * (-828446276))))) - (-415771279);
        int i20 = i19 >> 15;
        int i21 = ((((-262143) ^ i20) + ((i20 & (-262143)) << 1)) / 131072) + 1;
        int i22 = (i19 ^ i21) + ((i21 & i19) << 1);
        int i23 = i19 >> 29;
        int i24 = ((i23 ^ (-15)) + ((i23 & (-15)) << 1)) / 8;
        int i25 = -(i22 ^ ((i24 & 1) + (i24 | 1)));
        int i26 = (i25 & 7) + (i25 | 7);
        int i27 = ((i26 >> 28) - 31) / 16;
        String string = firebaseRemoteConfig.getString("7,13,25,0,4,url_eform_bpu_jmo".substring(57960 / (((-(((i27 ^ 1) + ((i27 & 1) << 1)) + 1)) & i26) * 690)));
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static String b() {
        int i = 2 % 2;
        int i2 = f954a + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        FirebaseRemoteConfig firebaseRemoteConfig = TuitionPaymentFragmentbindingInflater1;
        if (firebaseRemoteConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            firebaseRemoteConfig = null;
        }
        String string = firebaseRemoteConfig.getString("setup_appointment_android");
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = f954a + 95;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public static /* synthetic */ Unit b(FirebaseRemoteConfigSettings.Builder builder) {
        Unit unit;
        int i = 2 % 2;
        int i2 = asBinder + 61;
        f954a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(builder, "");
        if (i3 != 0) {
            builder.setMinimumFetchIntervalInSeconds(3600L);
            unit = Unit.INSTANCE;
            int i4 = 85 / 0;
        } else {
            builder.setMinimumFetchIntervalInSeconds(3600L);
            unit = Unit.INSTANCE;
        }
        int i5 = f954a + 25;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        INotificationSideChannel = 1;
        MediaBrowserCompatMediaBrowserImplApi23();
        INSTANCE = new getMaxImages();
        int i = asInterface + 19;
        INotificationSideChannel = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String cancelAll() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (String) b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[0], -2141894135, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 2141894140);
    }

    public static String cancel() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (String) b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[0], -324551822, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 324551830);
    }

    public static String INotificationSideChannel() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (String) b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[0], 464075583, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -464075571);
    }

    public static boolean getInterfaceDescriptor() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Boolean) b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[0], 14833137, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -14833136)).booleanValue();
    }

    public static boolean INotificationSideChannelStub() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Boolean) b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[0], -540344729, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 540344732)).booleanValue();
    }

    public static String write() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (String) b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[0], 1215466093, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1215466086);
    }

    public static String sendCustomAction() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (String) b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[0], -460582591, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 460582600);
    }

    public static String getServiceComponent() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (String) b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[0], 1692949247, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1692949236);
    }

    public static boolean MediaBrowserCompatConnectionCallback() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Boolean) b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[0], 905740350, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -905740340)).booleanValue();
    }

    public static boolean onProgressUpdate() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Boolean) b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[0], -1089637936, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1089637938)).booleanValue();
    }

    public static String MediaBrowserCompatItemCallbackStubApi23() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (String) b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[0], 73776925, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -73776919);
    }

    public static String MediaBrowserCompatItemReceiver() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (String) b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[0], -1177308920, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1177308920);
    }

    public static String onServiceConnected() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (String) b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[0], -644713709, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 644713713);
    }

    static void MediaBrowserCompatMediaBrowserImplApi23() {
        b = -499615402;
        TuitionPaymentFragmentbindingInflater1 = -1934795562;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1089113411;
        g = new byte[]{0, -18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 57, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, 12, -27, 26, 21, -20, -14, Base64.padSymbol, -29, -19, 21, -21, 19, -9, -60, -11, 88, -26, -23, -43, 44, 29, 28, 27, -24, 16, -21, 4, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -32, -17, 21, -26, 27, -12, 6, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, 6, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, int r8) {
        /*
            byte[] r0 = defpackage.getMaxImages.$$c
            int r8 = r8 + 117
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
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
            int r3 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getMaxImages.$$g(int, short, int):java.lang.String");
    }
}
